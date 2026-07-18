/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class oe extends wf {
    int[] field_e;
    static String[] field_f;
    int field_h;
    int field_g;

    final static fr d(int param0) {
        int var1 = 0;
        if (dk.field_h == ht.field_k) {
          throw new IllegalStateException();
        } else {
          var1 = 0;
          if (uk.field_j != ht.field_k) {
            return null;
          } else {
            ht.field_k = dk.field_h;
            return ld.field_c;
          }
        }
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4, java.awt.Graphics param5, int param6, int param7);

    abstract void a(int param0, int param1, java.awt.Canvas param2, int param3);

    public static void a(int param0) {
        if (param0 != 6259) {
            field_f = null;
            field_f = null;
            return;
        }
        field_f = null;
    }

    oe() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new String[]{"We'll give these rotters what for!", "Nothing you can't deal with, eh?", "Look out - they've sent in one of their hot shots!", "You've made them angry now!", "That's the biggest plane I've ever seen!", "Look sharp - they've sent in some more crack shots.", "They really are going all out...", "I'm sure they'll run out of steam soon...", "My word, that's the fastest plane I've ever seen!", "Looks like they have more of those gunships.", "There's another of those new planes!", "They've got extra munitions from somewhere!", "Looks like they've been busy in the factories.", "There's something squiffy on the radar...", "Look sharp, the big boys are here!", "There's that radar glitch again.", "Something strange is happening on the radar...", "What's going on out there? ", "By crikey they're fast!", "They're sending in the big guns now!", "WHAT IN THE BLUE BLAZES IS THAT?"};
    }
}
