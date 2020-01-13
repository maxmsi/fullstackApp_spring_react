import React, {Component} from 'react';
import ListCoursesComponent from './ListCoursesComponent.jsx'
class InstructorApp extends Component {
    render() {
        return (<>
            <h1>Instructor Application</h1>
            <ListCoursesComponent />
            </>
        )
    }
}

export default InstructorApp