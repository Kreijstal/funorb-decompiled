/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qn extends hc {
    private jm field_I;
    private int field_L;
    static int field_K;
    static ea field_J;

    final static int a(int param0, int param1, int param2, byte[] param3) {
        int discarded$2 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = MinerDisturbance.field_ab;
        try {
          L0: {
            L1: {
              var4_int = -1;
              if (param0 == -1648911295) {
                break L1;
              } else {
                var7 = (byte[]) null;
                discarded$2 = qn.a(74, 37, -101, (byte[]) null);
                break L1;
              }
            }
            var5 = param1;
            L2: while (true) {
              if (param2 <= var5) {
                var4_int = var4_int ^ -1;
                stackOut_6_0 = var4_int;
                stackIn_7_0 = stackOut_6_0;
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
            stackOut_8_0 = (RuntimeException) (var4);
            stackOut_8_1 = new StringBuilder().append("qn.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
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
        int var5 = 0;
        int var6 = 0;
        ag var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        ea var12 = null;
        ea var13 = null;
        ea var15 = null;
        ea var16 = null;
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
        boolean discarded$2 = false;
        RuntimeException var3 = null;
        fe var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            if (param1 > 119) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              var4 = (fe) null;
              discarded$2 = this.a((fe) null, -111);
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("qn.UA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_3_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
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
              stackOut_5_0 = param1 + " - " + param3.c(-14858) + "%";
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_3_0 = (String) (param0);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var4);
            stackOut_7_1 = new StringBuilder().append("qn.A(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param2).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
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
