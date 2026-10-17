% Facts
experience(ravi, 6).
training(ravi, completed).
rating(ravi, 5).

experience(priya, 3).
training(priya, completed).
rating(priya, 4).

experience(kumar, 8).
training(kumar, not_completed).
rating(kumar, 5).

experience(meena, 7).
training(meena, completed).
rating(meena, 4).

% Rule
eligible_for_promotion(X) :-
    experience(X, Years),
    Years >= 5,
    training(X, completed),
    rating(X, Rating),
    Rating >= 4.
