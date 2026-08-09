/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em extends vf {
    ec field_D;
    static volatile int field_C;
    byte field_E;
    static String field_F;
    int field_G;

    public static void c(boolean param0) {
        field_F = null;
        if (!param0) {
            field_C = 45;
        }
    }

    final static String e(int param0) {
        if (ol.field_i == ql.field_f) {
            return td.field_d;
        }
        if (param0 != 7142) {
            em.e(-19);
            return ek.field_i;
        }
        return ek.field_i;
    }

    final int d(byte param0) {
        if (param0 >= 98) {
          if (this.field_D == null) {
            return 0;
          } else {
            return 100 * this.field_D.field_o / (-this.field_E + this.field_D.field_m.length);
          }
        } else {
          this.field_G = -32;
          if (this.field_D == null) {
            return 0;
          } else {
            return 100 * this.field_D.field_o / (-this.field_E + this.field_D.field_m.length);
          }
        }
    }

    final static vk a(String[] args, int param1) {
        vk var2 = null;
        RuntimeException var2_ref = null;
        vk stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = new vk(false);
              var2.field_c = args;
              if (param1 == 8082) {
                break L1;
              } else {
                em.e(7);
                break L1;
              }
            }
            stackIn_3_0 = (vk) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2_ref);

            stackIn_6_1 = new StringBuilder().append("em.A(");

            if (args == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final byte[] b(boolean param0) {
        if (param0) {
          if (!this.field_v) {
            if (this.field_D.field_o < this.field_D.field_m.length + -this.field_E) {
              throw new RuntimeException();
            } else {
              return this.field_D.field_m;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          em.c(false);
          if (!this.field_v) {
            if (this.field_D.field_o < this.field_D.field_m.length + -this.field_E) {
              throw new RuntimeException();
            } else {
              return this.field_D.field_m;
            }
          } else {
            throw new RuntimeException();
          }
        }
    }

    em() {
    }

    static {
        field_C = 0;
        field_F = "Select a goblin to sacrifice";
    }
}
