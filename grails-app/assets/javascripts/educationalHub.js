/**
 * Created by avi221b on 30/7/17.
 */
$(document).ready(function() {
    var scroll_start = 0;
    var startchange = $('#startchange');
    var offset = startchange.offset();
    if (startchange.length) {
        $(document).scroll(function() {
            scroll_start = $(this).scrollTop();
            if (scroll_start > offset.top) {
                $(".navbar-default").css('background-color', '#c1292e');
            } else {
                $('.navbar-default').css('background-color', 'transparent');
            }
        });
    }
});


var vue = new Vue({
    el: '#vue',
    data: {
        questions: [
            {
                question: "What was this demo made with?",
                answer: "Vue.jsgfdgf sdf dsfg dfs fsd fdsi df sdisd sdfh fe wgew gwe we efe wgiwe gewg ewoghe f kwhf wefh g dv sdv duvg eiwvi egrvgfejvg fuvgg suc ewfgeuw f ewfewfsfgdi dshf y fhh di eger gr bhrhbirhebrhbihrebroeboreb eogv ehheiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiii",
                votes: 7,
                searchTerms: "vue, js, javascript, ponies"
            },
            {
                question: "How cool is vue.js?",
                answer: "Its pretty dope.",
                votes: 4,
                searchTerms: "vue, js, javascript, ponies"
            },
            {
                question: "What is the circumference of the sun?",
                answer: "2,713,406 miles.",
                votes: 0,
                searchTerms: "miles, sun, circumference"
            },
            {
                question: "What date/time is it?",
                answer: new Date(),
                votes: -1,
                searchTerms: "date, day, time, hour, minute, time"
            },
            {
                question: "How much wood could a woodchuck chuck?",
                answer: "About 700 pounds.",
                votes: -3,
                searchTerms: "pounds, lbs, woodchuck, 700"
            }
        ],
        searchString: ""
    },

    methods: {
        vote: function(voteType, question) {
            if(voteType === "up") {
                question.votes++;

            } else if(voteType === "down") {
                if(question.votes <= -10) {
                    return;
                }

                question.votes--;
            }
        },

        resetSearch: function() {
            this.searchString = "";
        }
    },

    filters: {
        voteColor: function(votes) {
            if(votes === 0) {
                votes = "gray";
            } else if(votes < 1) {
                votes = "red";
            } else if(votes >= 1 && votes <= 4) {
                votes = "yellow";
            } else if(votes >= 5) {
                votes = "green";
            }

            return votes;
        }
    }
});