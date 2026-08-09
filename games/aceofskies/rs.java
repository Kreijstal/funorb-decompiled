/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rs extends ab implements ue, dn {
    static int field_t;
    static int[] field_B;
    private jq field_y;
    private vq field_A;
    static int field_v;
    static int[] field_w;
    static String field_x;
    static boolean field_C;
    private mi field_z;
    static pa[] field_u;

    public final void a(byte param0, int param1, vq param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-1 != (param3 ^ -1)) {
                if (1 != param3) {
                  if (param3 == 2) {
                    qk.a("conduct.ws", false);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  qk.a("privacy.ws", false);
                  break L1;
                }
              } else {
                qk.a("terms.ws", false);
                break L1;
              }
            }
            if (param0 < -59) {
              break L0;
            } else {
              rs.d((byte) -100);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var5);

            stackIn_13_1 = new StringBuilder().append("rs.KA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L2;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ')');
        }
    }

    final boolean a(int param0, int param1, char param2, ea param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (super.a(-117, param1, param2, param3)) {
              stackIn_3_0 = 1;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (98 == param1) {
                stackIn_7_0 = this.b(param3, -87);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var5_int = 11 / ((param0 - -53) / 33);
                if (-100 != (param1 ^ -1)) {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 3;
                  break L0;
                } else {
                  stackIn_10_0 = this.a(80, param3);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var5);

            stackIn_15_1 = new StringBuilder().append("rs.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L1;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              return stackIn_12_0 != 0;
            }
          }
        }
    }

    public static void d(byte param0) {
        field_B = null;
        field_w = null;
        field_x = null;
        field_u = null;
        if (param0 != 105) {
            rs.d((byte) -82);
        }
    }

    public final void a(int param0, mi param1, int param2, int param3, byte param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var6_int = 36 / ((-27 - param4) / 61);
            if (this.field_z == param1) {
              fg.b(true);
              this.field_y.h((byte) 119);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var6 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var6);

            stackIn_6_1 = new StringBuilder().append("rs.DA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L1;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    rs(jq param0) {
        super(0, 0, 288, 0, (ir) null);
        String var7 = null;
        int var3 = 0;
        qm var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
            this.field_y = param0;
            this.field_z = new mi(mq.field_i, (no) null);
            this.field_z.field_e = (ir) ((Object) new qb());
            var7 = sn.a(cd.field_c, 122, new String[]{this.a((byte) 127), this.e((byte) 101)});
            var3 = 20;
            var4 = new qm(qo.field_b, 0, 0, 0, 0, 16777215, -1, 3, 0, qo.field_b.field_I, -1, 2147483647, true);
            this.field_A = new vq(var7, var4);
            this.field_A.field_k = "";
            this.field_A.a(-57, m.field_g, 0);
            this.field_A.a(72, m.field_g, 1);
            this.field_A.field_q = this.field_q + -40;
            this.field_A.field_o = (no) (this);
            this.field_A.a(26, var3, -40 + this.field_q, (byte) 110);
            var3 = var3 + (15 + this.field_A.field_n);
            this.a(this.field_A, 1);
            var5 = 4;
            var6 = 200;
            this.field_z.a(40, -var6 + 300 >> 914096545, var3, var6, (byte) 127);
            this.field_z.field_o = (no) (this);
            this.a(this.field_z, 1);
            this.a(var3 + (55 - -var5), 0, 0, 300, (byte) 125);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "rs.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final String e(byte param0) {
        if (param0 <= 87) {
            field_t = 19;
            return "</col></u>";
        }
        return "</col></u>";
    }

    private final String a(byte param0) {
        if (param0 <= 113) {
            return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    static {
        field_w = new int[1];
        field_t = -1;
        field_x = null;
        field_B = new int[8192];
        field_v = -1;
    }
}
