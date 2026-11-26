/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class FrameTimer {
    static String[][] field_c;
    static int field_d;
    static String field_a;
    static PcmSample[] field_b;

    final int waitAndCountTicks(int param0, long param1) {
        long var4 = 0L;
        long var4Lifetime1;
        if (param0 != 0) {
          field_b = (PcmSample[]) null;
          var4 = this.getDelayMillis(-31887);
          if (var4 > 0L) {
            vh.sleepMillis(var4, param0 + 87);
            return this.advanceTicks(-23124, param1);
          }
          return this.advanceTicks(-23124, param1);
        }
        var4Lifetime1 = this.getDelayMillis(-31887);
        if (var4Lifetime1 <= 0L) {
          return this.advanceTicks(-23124, param1);
        }
        vh.sleepMillis(var4Lifetime1, param0 + 87);
        return this.advanceTicks(-23124, param1);
    }

    public static void clearStaticReferences(int param0) {
        field_b = null;
        field_a = null;
        field_c = (String[][]) null;
        if (param0 >= -13) {
          FrameTimer.clearStaticReferences(52);
        }
    }

    abstract void resetTiming(int param0);

    abstract long getDelayMillis(int param0);

    abstract int advanceTicks(int param0, long param1);

    static {
        field_c = new String[][]{new String[]{"Tutorial One", "Water Feature", "Bombs Away!", "Transporters 101", "My Biggest Fan", "Gravity?", "Disappearing Trick", "Enlightened Journey", "Recession", "Spider-Flea Lunch", "Raising Expectations", "Sinking Flea-ling", "The Sharp End", "From A to Flea", "It's a Breeze", "Golden Fleas", "Switch-a-Flea", "Maze", "Rickety Bridge", "Bang! Oops...", "Tower", "Theory of Gravity", "Spring to Action", "Out With a Bang", "Flea, Fly, Flow, Flum", "Sole Trader", "Hidden Traps", "Deathtrap", "Fly or Die", "Bombardier Fleas", "Complication", "Sierpinski", "Rise From Above", "The Unexpected", "Fan Trap", "Confusion", "Twisted Path", "No Flea Left Behind", "No Chain Reactions", "Castor and Pollux", "Ratchet"}, new String[]{"BEGINNING", "CANDLE", "EAGLE", "GALAXY", "PENGUIN", "PLATE", "WINTER", "SPLENDID", "ITCH", "YOYO", "RADIO", "WOODEN", "BRAVE", "TELEPORT", "BOUNCE", "SHALLOW", "ELEPHANT", "CHORD", "FRIGHT", "ZIGZAG", "ANYTHING", "CHANGE", "BLANKET", "PAINT", "SHEEP", "WINDMILL", "BRONZE", "TURNIP", "CROWD", "BRUSH"}};
        field_a = "<%0>Spider:<%1> These eat fleas! Keep away from them!";
        field_b = new PcmSample[2];
    }
}
