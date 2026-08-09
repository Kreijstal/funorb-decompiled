/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb extends qm {
    private int field_q;
    private int field_p;
    private ll[] field_r;
    static char[] field_o;
    private int field_n;

    public final void a(boolean param0, int param1, int param2, ea param3, int param4) {
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          L0: {
            L1: {
              if (param1 == -7592) {
                break L1;
              } else {
                field_o = (char[]) null;
                break L1;
              }
            }
            L2: {
              if (!param3.field_g) {
                if (param3.e(28660)) {
                  stackIn_8_0 = 1;
                  break L2;
                } else {
                  stackIn_8_0 = 0;
                  break L2;
                }
              } else {
                stackIn_8_0 = 1;
                break L2;
              }
            }
            L3: {
              var6_int = stackIn_8_0;
              if (param3 instanceof mi) {
                param0 = param0 & ((mi) ((Object) param3)).field_u;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (!param0) {
                stackIn_16_0 = this.field_n;
                break L4;
              } else {
                if (var6_int != 0) {
                  stackIn_16_0 = this.field_p;
                  break L4;
                } else {
                  stackIn_16_0 = this.field_q;
                  break L4;
                }
              }
            }
            L5: {
              var7 = stackIn_16_0;
              kg.a(107, param2 + param3.field_p, var7, (-this.field_r[0].field_q + param3.field_n >> 2046785601) + param3.field_h + param4, param3.field_q, this.field_r);
              if (param0) {
                stackIn_19_0 = 16777215;
                break L5;
              } else {
                stackIn_19_0 = 7105644;
                break L5;
              }
            }
            var8 = stackIn_19_0;
            this.field_i.a(param3.field_f, param2 + param3.field_p, -2 + (param3.field_h + param4), param3.field_q, param3.field_n, var8, -1, 1, 1, this.field_i.field_I);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var6);

            stackIn_23_1 = new StringBuilder().append("qb.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param4 + ')');
        }
    }

    public qb() {
        this(2188450, 2591221, 9543);
    }

    private qb(int param0, int param1, int param2) {
        this.field_q = param0;
        this.field_n = param2;
        this.field_r = u.field_i;
        this.field_p = param1;
        this.field_i = b.field_c;
    }

    public static void a(boolean param0) {
        if (!param0) {
            field_o = (char[]) null;
            field_o = null;
            return;
        }
        field_o = null;
    }

    static {
        field_o = new char[128];
    }
}
