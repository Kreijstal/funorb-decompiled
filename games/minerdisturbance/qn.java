/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qn extends hc {
    private jm field_I;
    private int field_L;
    static int field_K;
    static ea field_J;

    final static int a(int param0, int param1, int param2, byte[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var4_int = -1;
              if (param0 == -1648911295) {
                break L1;
              } else {
                var7 = (byte[]) null;
                qn.a(74, 37, -101, (byte[]) null);
                break L1;
              }
            }
            var5 = param1;
            L2: while (true) {
              if (param2 <= var5) {
                var4_int = var4_int ^ -1;
                stackIn_7_0 = var4_int;
                break L0;
              } else {
                var4_int = ei.field_J[(var4_int ^ param3[var5]) & 255] ^ var4_int >>> 878015496;
                var5++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("qn.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    public static void a(byte param0) {
        field_J = null;
        int var1 = -113 / ((param0 - 5) / 34);
    }

    final String h(int param0) {
        if (param0 != -27867) {
            qn.a((byte) -1);
            if (!(!this.field_x)) {
                return this.field_I.a(7320);
            }
            return null;
        }
        if (!(!this.field_x)) {
            return this.field_I.a(7320);
        }
        return null;
    }

    final void a(int param0, int param1, byte param2, fe param3) {
        try {
            this.field_L = this.field_L + 1;
            if (param2 <= 49) {
                field_K = 44;
            }
            super.a(param0, param1, (byte) 104, param3);
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "qn.V(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        ag var8;
        int var9;
        int var10;
        int var11;
        ea var12;
        ea var13;
        ea var15;
        ea var16;
        var11 = MinerDisturbance.field_ab;
        super.a(param0, param1, param2, param3);
        if (param3 != 0) {
          return;
        } else {
          var5 = (this.field_v >> -1082502463) + this.field_u + param1;
          var6 = (this.field_q >> -1012669151) + (this.field_t + param2);
          var8 = this.field_I.b(24595);
          if (nn.field_f != var8) {
            if (bm.field_o != var8) {
              if (var8 != fg.field_d) {
                if (var8 == sc.field_a) {
                  var12 = ed.field_g[1];
                  var12.g(-(var12.field_y >> 1754774945) + var5, var6 - (var12.field_C >> -442726015), 256);
                  return;
                } else {
                  return;
                }
              } else {
                var13 = ed.field_g[2];
                var13.g(-(var13.field_y >> -1648911295) + var5, -(var13.field_C >> -771876831) + var6, 256);
                return;
              }
            } else {
              var16 = ed.field_g[0];
              var9 = var16.field_x << -1475718015;
              var10 = var16.field_A << 1814602241;
              if (ha.field_d != null) {
                if (ha.field_d.field_y >= var9) {
                  if (ha.field_d.field_C < var10) {
                    ha.field_d = new ea(var9, var10);
                    vb.a(ha.field_d, 127);
                    var16.b(112, 144, var16.field_x << -1806679260, var16.field_A << -1004835100, -this.field_L << 590995114, 4096);
                    tk.b(true);
                    ha.field_d.g(var5 + -var16.field_x, var6 + -var16.field_A, 256);
                    return;
                  } else {
                    vb.a(ha.field_d, 125);
                    eh.d();
                    var16.b(112, 144, var16.field_x << -1806679260, var16.field_A << -1004835100, -this.field_L << 590995114, 4096);
                    tk.b(true);
                    ha.field_d.g(var5 + -var16.field_x, var6 + -var16.field_A, 256);
                    return;
                  }
                } else {
                  ha.field_d = new ea(var9, var10);
                  vb.a(ha.field_d, 127);
                  var16.b(112, 144, var16.field_x << -1806679260, var16.field_A << -1004835100, -this.field_L << 590995114, 4096);
                  tk.b(true);
                  ha.field_d.g(var5 + -var16.field_x, var6 + -var16.field_A, 256);
                  return;
                }
              } else {
                ha.field_d = new ea(var9, var10);
                vb.a(ha.field_d, 127);
                var16.b(112, 144, var16.field_x << -1806679260, var16.field_A << -1004835100, -this.field_L << 590995114, 4096);
                tk.b(true);
                ha.field_d.g(var5 + -var16.field_x, var6 + -var16.field_A, 256);
                return;
              }
            }
          } else {
            var15 = ed.field_g[0];
            var9 = var15.field_x << -1475718015;
            var10 = var15.field_A << 1814602241;
            if (ha.field_d != null) {
              if (ha.field_d.field_y >= var9) {
                if (ha.field_d.field_C < var10) {
                  ha.field_d = new ea(var9, var10);
                  vb.a(ha.field_d, 127);
                  var15.b(112, 144, var15.field_x << -1806679260, var15.field_A << -1004835100, -this.field_L << 590995114, 4096);
                  tk.b(true);
                  ha.field_d.g(var5 + -var15.field_x, var6 + -var15.field_A, 256);
                  return;
                } else {
                  vb.a(ha.field_d, 125);
                  eh.d();
                  var15.b(112, 144, var15.field_x << -1806679260, var15.field_A << -1004835100, -this.field_L << 590995114, 4096);
                  tk.b(true);
                  ha.field_d.g(var5 + -var15.field_x, var6 + -var15.field_A, 256);
                  return;
                }
              } else {
                ha.field_d = new ea(var9, var10);
                vb.a(ha.field_d, 127);
                var15.b(112, 144, var15.field_x << -1806679260, var15.field_A << -1004835100, -this.field_L << 590995114, 4096);
                tk.b(true);
                ha.field_d.g(var5 + -var15.field_x, var6 + -var15.field_A, 256);
                return;
              }
            } else {
              ha.field_d = new ea(var9, var10);
              vb.a(ha.field_d, 127);
              var15.b(112, 144, var15.field_x << -1806679260, var15.field_A << -1004835100, -this.field_L << 590995114, 4096);
              tk.b(true);
              ha.field_d.g(var5 + -var15.field_x, var6 + -var15.field_A, 256);
              return;
            }
          }
        }
    }

    qn(jm param0) {
        try {
            this.field_I = param0;
        } catch (RuntimeException runtimeException) {
            throw lj.a((Throwable) ((Object) runtimeException), "qn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean a(fe param0, int param1) {
        RuntimeException var3 = null;
        fe var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 > 119) {
              stackIn_3_0 = 0;
              break L0;
            } else {
              var4 = (fe) null;
              this.a((fe) null, -111);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("qn.UA(");

            if (param0 == null) {
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
          throw lj.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final static String a(String param0, String param1, boolean param2, bj param3) {
        RuntimeException var4 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param2) {
                break L1;
              } else {
                field_K = 78;
                break L1;
              }
            }
            if (param3.a((byte) 126)) {
              stackIn_6_0 = param1 + " - " + param3.c(-14858) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = (String) (param0);
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("qn.A(");

            if (param0 == null) {
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
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param1 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_10_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          return stackIn_6_0;
        }
    }

    static {
        field_K = 250;
    }
}
