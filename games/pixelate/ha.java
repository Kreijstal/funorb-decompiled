/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ha {
    static String field_j;
    static String field_f;
    int[] field_e;
    int field_i;
    static int field_h;
    java.awt.Image field_d;
    static tf[] field_g;
    int field_a;
    static String field_k;
    static tf field_b;
    static String[] field_c;

    abstract void a(java.awt.Graphics param0, boolean param1, int param2, int param3);

    final static boolean b(int param0) {
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == 12742) {
          if (ri.field_f == null) {
            if (un.field_l) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_9_0 = 1;
            stackIn_11_0 = stackOut_9_0;
            return stackIn_11_0 != 0;
          }
        } else {
          boolean discarded$5 = ha.b(-110);
          if (ri.field_f != null) {
            return true;
          } else {
            L0: {
              if (!un.field_l) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L0;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L0;
              }
            }
            return stackIn_5_0 != 0;
          }
        }
    }

    final static boolean a(String param0, byte param1) {
        return re.a(param0, -1) != null;
    }

    final void a(int param0) {
        if (param0 != 19692) {
            return;
        }
        t.a(((ha) this).field_e, ((ha) this).field_a, ((ha) this).field_i);
    }

    public static void a(boolean param0) {
        field_c = null;
        field_k = null;
        field_j = null;
        field_f = null;
        field_g = null;
        field_b = null;
    }

    abstract void a(int param0, java.awt.Component param1, int param2, byte param3);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Fullscreen mode was cancelled after a delay of 10 seconds. If you were unable to accept fullscreen mode during this time, there may be a problem with your configuration. You could try restarting your browser and trying again.";
        field_j = "Please send me news and updates (I can unsubscribe at any time)";
        field_c = new String[]{"Connection lost - attempting to reconnect", "Connection lost - attempting to reconnect.", "Connection lost - attempting to reconnect..", "Connection lost - attempting to reconnect..."};
        field_f = "Waiting for fonts";
    }
}
