
from automata.fa.dfa import DFA

# Define DFA
dfa = DFA(
    states={'q0', 'q1', 'q2'},

    input_symbols={'0', '1'},

    transitions={
        'q0': {'0': 'q1', '1': 'q0'},
        'q1': {'0': 'q1', '1': 'q2'},
        'q2': {'0': 'q1', '1': 'q0'}
    },

    initial_state='q0',

    final_states={'q2'}
)

# Test input strings
test_strings = [
    '01',
    '101',
    '1101',
    '00',
    '10',
    '111',
    '010'
]

# Check each string
for string in test_strings:

    if dfa.accepts_input(string):
        print(string, "Accepted")
    else:
        print(string, "Rejected")

