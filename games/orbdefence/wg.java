/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg extends hi {
    static boolean field_o;
    static int field_q;
    static String field_n;
    static int field_p;

    wg(vi param0) {
        super(param0);
    }

    final static void a(int param0, byte param1) {
        nc.field_Z = tb.field_b[param0];
        if (param1 > -100) {
          field_p = 109;
          de.field_b = jk.field_r[param0];
          mi.field_e = cc.field_h[param0];
          return;
        } else {
          de.field_b = jk.field_r[param0];
          mi.field_e = cc.field_h[param0];
          return;
        }
    }

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -11300) {
                break L1;
              } else {
                field_o = true;
                break L1;
              }
            }
            if (this.a(param1, (byte) -99) != vh.field_h) {
              stackIn_6_0 = wb.field_c;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = vg.field_j;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var3);

            stackIn_9_1 = new StringBuilder().append("wg.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    final qd a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        qd stackIn_5_0 = null;
        qd stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (null != uk.a(false, param0)) {
                stackIn_3_0 = 0;
                break L1;
              } else {
                stackIn_3_0 = 1;
                break L1;
              }
            }
            var3_int = stackIn_3_0;
            if (var3_int != 0) {
              L2: {
                if (param1 == -99) {
                  break L2;
                } else {
                  field_p = 62;
                  break L2;
                }
              }
              stackIn_9_0 = nc.field_bb;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_5_0 = vh.field_h;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var3);

            stackIn_12_1 = new StringBuilder().append("wg.C(");

            if (param0 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_9_0;
        }
    }

    final static ba a(int param0, int param1) {
        ba[] var2;
        int var3;
        int var4;
        ba[] var5;
        var4 = OrbDefence.field_D ? 1 : 0;
        var5 = jl.a((byte) 60);
        var2 = var5;
        var3 = 0;
        L0: while (true) {
          if (var5.length > var3) {
            if (var5[var3].field_d != param0) {
              var3++;
              continue L0;
            } else {
              return var5[var3];
            }
          } else {
            var3 = -127 / ((-71 - param1) / 52);
            return null;
          }
        }
    }

    public static void j(int param0) {
        if (param0 != -24392) {
            field_q = -50;
            field_n = null;
            return;
        }
        field_n = null;
    }

    static {
        field_q = 5;
        field_n = "Blocks Norbs";
        field_p = 0;
    }
}
