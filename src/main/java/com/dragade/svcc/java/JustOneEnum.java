package com.dragade.svcc.java;

    public enum JustOneEnum {
        INSTANCE;

        private final String someResource;

        private JustOneEnum() {
            someResource = "justOne: " + this.toString();
        }

        public String getResource() {
            return someResource;
        }
    }


