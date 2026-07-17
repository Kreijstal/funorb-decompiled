/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qab {
    private int field_e;
    static String field_a;
    private String field_c;
    static int field_d;
    int field_b;

    final char a(int param0) {
        if (param0 > -75) {
          ((qab) this).field_b = -65;
          int fieldTemp$4 = ((qab) this).field_b;
          ((qab) this).field_b = ((qab) this).field_b + 1;
          return ((qab) this).field_c.charAt(fieldTemp$4);
        } else {
          int fieldTemp$5 = ((qab) this).field_b;
          ((qab) this).field_b = ((qab) this).field_b + 1;
          return ((qab) this).field_c.charAt(fieldTemp$5);
        }
    }

    public final String toString() {
        return ((qab) this).field_c.substring(0, ((qab) this).field_b) + "|" + ((qab) this).field_c.substring(((qab) this).field_b);
    }

    final boolean a(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -102) {
          L0: {
            char discarded$10 = ((qab) this).a(-42);
            if (((qab) this).field_e > ((qab) this).field_b) {
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
            if (((qab) this).field_e > ((qab) this).field_b) {
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

    public static void b() {
        field_a = null;
    }

    final static boolean a(int param0, int param1) {
        if (param0 > 32) {
          if (param1 != 11) {
            if (param1 == 13) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_a = null;
          if (param1 != 11) {
            if (param1 == 13) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    qab(String param0) {
        ((qab) this).field_b = 0;
        try {
            ((qab) this).field_c = param0;
            ((qab) this).field_e = ((qab) this).field_c.length();
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "qab.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "This password contains repeated characters, and would be easy to guess";
        field_d = 1024;
    }
}
