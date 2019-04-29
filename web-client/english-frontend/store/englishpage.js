export const state = () => ({
    Lessons: null,
    ListVocabularyInLesson: null,
});

export const getters = {
    
}; 
export const mutations =  {
    setLessons(state, value) {
        state.Lessons = value;
    },
    setListVocabularyInLesson(state, value) {
        state.ListVocabularyInLesson = value;
    }
}

