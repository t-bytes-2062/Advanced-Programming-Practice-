% Python results
python_pass(arun).
python_pass(bala).
python_pass(charan).
python_fail(divya).

% Data Structures results
data_structures_pass(arun).
data_structures_pass(charan).
data_structures_pass(divya).
data_structures_fail(bala).

% Eligibility rule
eligible(X) :-
    python_pass(X),
    data_structures_pass(X).
