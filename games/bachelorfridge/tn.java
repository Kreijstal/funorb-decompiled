/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tn {
    static af field_a;
    static String field_b;

    final int a(byte param0, long param1) {
        long var4 = 0L;
        var4 = ((tn) this).a((byte) 63);
        if (-1L <= (var4 ^ -1L)) {
          if (param0 != 109) {
            int discarded$4 = ((tn) this).a(-82L, 55);
            return ((tn) this).a(param1, 0);
          } else {
            return ((tn) this).a(param1, 0);
          }
        } else {
          gda.a(false, var4);
          if (param0 == 109) {
            return ((tn) this).a(param1, 0);
          } else {
            int discarded$5 = ((tn) this).a(-82L, 55);
            return ((tn) this).a(param1, 0);
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 0) {
            field_a = null;
        }
    }

    final static boolean a(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param1 <= 116) {
          L0: {
            boolean discarded$10 = tn.a(-33, 0);
            if (param0 < 0) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (param0 < 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    abstract void a(boolean param0);

    abstract int a(long param0, int param1);

    abstract long a(byte param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new af();
        field_b = "<%0> has left the lobby.";
    }
}
