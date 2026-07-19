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
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        if (param0 > -75) {
          this.field_b = -65;
          fieldTemp$4 = this.field_b;
          this.field_b = this.field_b + 1;
          return this.field_c.charAt(fieldTemp$4);
        } else {
          fieldTemp$5 = this.field_b;
          this.field_b = this.field_b + 1;
          return this.field_c.charAt(fieldTemp$5);
        }
    }

    public final String toString() {
        return this.field_c.substring(0, this.field_b) + "|" + this.field_c.substring(this.field_b);
    }

    final boolean a(byte param0) {
        char discarded$10 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 > -102) {
          L0: {
            discarded$10 = this.a(-42);
            if (this.field_e > this.field_b) {
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
            if (this.field_e > this.field_b) {
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

    public static void b(int param0) {
        boolean discarded$0 = false;
        if (param0 != 0) {
            discarded$0 = qab.a(107, -118);
            field_a = null;
            return;
        }
        field_a = null;
    }

    final static boolean a(int param0, int param1) {
        if (param0 > 32) {
          if ((param1 ^ -1) != -12) {
            if ((param1 ^ -1) == -14) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_a = (String) null;
          if ((param1 ^ -1) != -12) {
            if ((param1 ^ -1) == -14) {
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
        this.field_b = 0;
        try {
            this.field_c = param0;
            this.field_e = this.field_c.length();
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "qab.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "This password contains repeated characters, and would be easy to guess";
        field_d = 1024;
    }
}
