# github-issues-activity-F18

This file contains information for instructors wishing to use this activity.

This activity is designed to span two hands-on class periods.  I have done it in two 75-minute periods, but believe that it would be relatively easy to adapt to two 50-minute periods.  

The first class period introduces a branching workflow for contributing to an H/FOSS project.  Students will fork an upstream repository, clone it to their machines, claim an issue, create a branch and fix the bug, push the branch to their origin and create a pull request. The instructor will then merge the pull requests (which are designed to not create any conflicts).  The students then bring their local and origin repositories into synch with the upstream repository.

The second class period deals with resolving conflicts including rebasing and squashing commits. Students will claim a second issue (with which the instructor will have created an upstream conflict), create a branch and fix the issue.  Students will then rebase their branch onto the upstream changes made by the instructor and use a graphical merge tool to resolve the conflict. They will then push their branch and create a pull request.  Finally the students will again bring their local and origin repositories into synch with the upstream repository.

The following outline provides guidance to the instructor for what occurs and what must be done at each stage of the activity:

## Before the first class period

1. Fork the [github-issues-activity-f18](https://github.com/braughtg/github-issues-activity-f18) repo into an organization for your course.
1. Rename the forked repository github-issues-activity to be consistent with the on-line materials for the students.
1. Update the HTML documents to include the proper links for your course organization.
1. Enable Issues in your fork.
1. Copy the Issues from the [github-issues-activity-f18](https://github.com/braughtg/github-issues-activity-f18) repo into your fork.  Using something like [GitHub issues Import](https://github.com/IQAndreas/github-issues-import) makes
this relatively painless.
1. Invite all students/participants to be <b>read-only</b> collaborators on the repo in the organization for your course. This will allow students to claim or assign themselves issues. Alternatively, the instructor can assign issues to individuals or teams within the course.
1. Have the students complete Part 1 of the [Git/GitHub Workflow Activity](http://users.dickinson.edu/~braught/courses/cs491f18/github.html) before coming to the first class period.

## During the first class period

1. Use the [Slides](http://users.dickinson.edu/~braught/courses/cs491f18/githubslides.ppt) to illustrate what they completed before class.
1. Have the students complete Part 2 of the [Git/GitHub Workflow Activity](http://users.dickinson.edu/~braught/courses/cs491f18/github.html) before coming to the first class period.
1. Use the [Slides](http://users.dickinson.edu/~braught/courses/cs491f18/githubslides.ppt) to illustrate each part of the activity before or after they complete it.

## Before the second class period

1. Edit the Calculator.java class making each of the methods static.  This will generate conflicts with each of the issues they fix.
1. Have the students complete Part 3 of the [Git/GitHub Workflow Activity](http://users.dickinson.edu/~braught/courses/cs491f18/github.html) before coming to the second class period.

## During the second class period

1. Use the [Slides](http://users.dickinson.edu/~braught/courses/cs491f18/githubslides.ppt) to illustrate what they completed before class.
1. Have the students complete Part 4 of the [Git/GitHub Workflow Activity](http://users.dickinson.edu/~braught/courses/cs491f18/github.html) before coming to the first class period.
1. Use the [Slides](http://users.dickinson.edu/~braught/courses/cs491f18/githubslides.ppt) to illustrate each part of the activity before or after they complete it.

## Course Context

Additional details, slides and in class handouts as used in my course are available from
[Dickinson College COMP491](http://users.dickinson.edu/~braught/courses/cs491f18/cs491f18.html) or more specifically in the Hands-on section of the [Version Control](http://users.dickinson.edu/~braught/courses/cs491f18/cs491f18.html#0924) day.

---

All materials contained in this repository are licensed under a [Creative Commons Attribution-NonCommercial-ShareAlike 4.0 International License](https://creativecommons.org/licenses/by-nc-sa/4.0/) license. ![Creative Commons License](https://i.creativecommons.org/l/by-nc-sa/4.0/88x31.png)

Any external materials linked to by these materials may be governed by other licenses.

