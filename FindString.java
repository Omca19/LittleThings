/**
     * Given a string and a target, this will find the index of
     * the matching token. The string is tokenized based on spaces.
     * @param  s      The string you're searching through
     * @param  target The string you're searching for
     * @return        The index of the token if a match is found,
     *                otherwise -1.
     */
    private static int findIndex(String s, String target) {
        String[] tokens = s.split("\\s");
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals(target))
                return i;
        }
        return -1;
    }
}
