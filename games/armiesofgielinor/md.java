/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class md extends oj {
    static String[] field_A;
    int field_D;
    int field_z;
    int field_E;
    static at field_y;
    private int field_C;
    int field_B;
    static String field_F;

    final String a(byte param0, boolean param1) {
        if (!(!param1)) {
            System.out.println("Parasite event debug");
            System.out.println("Unit at " + this.field_D + "," + this.field_B);
            System.out.println("Takes over " + (this.field_D + this.field_E) + "," + (this.field_B - -this.field_z));
            System.out.println("New owner " + this.field_C);
        }
        String var3 = "EventParasite: pos: (" + this.field_D + "," + this.field_B + "), d: (" + this.field_E + "," + this.field_z + ")+, owner: " + this.field_C;
        int var4 = 21 / ((53 - param0) / 51);
        return var3;
    }

    public static void d(byte param0) {
        field_A = null;
        field_y = null;
        field_F = null;
        if (param0 != 46) {
            field_F = (String) null;
        }
    }

    final static wk[] g(int param0) {
        wk[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        int[] var11 = null;
        byte[] var13 = null;
        int stackIn_3_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_11_0 = 0;
        var7 = ArmiesOfGielinor.field_M ? 1 : 0;
        var1 = new wk[iw.field_n];
        var2 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (iw.field_n <= var2) {
                break L2;
              } else {
                var3 = qm.field_K[var2] * c.field_e[var2];
                var13 = vj.field_j[var2];
                var11 = new int[var3];
                var9 = var11;
                var5 = var9;
                stackOut_2_0 = 0;
                stackIn_12_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var7 != 0) {
                  break L1;
                } else {
                  var6 = stackIn_3_0;
                  L3: while (true) {
                    L4: {
                      if (var3 <= var6) {
                        var1[var2] = new wk(lg.field_d, wr.field_J, j.field_e[var2], iq.field_g[var2], qm.field_K[var2], c.field_e[var2], var11);
                        var2++;
                        break L4;
                      } else {
                        var5[var6] = qv.field_j[rn.a(255, (int) var13[var6])];
                        var6++;
                        if (var7 != 0) {
                          break L4;
                        } else {
                          continue L3;
                        }
                      }
                    }
                    if (var7 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            rj.d((byte) 106);
            stackOut_11_0 = param0;
            stackIn_12_0 = stackOut_11_0;
            break L1;
          }
          if (stackIn_12_0 < 1) {
            field_A = (String[]) null;
            return var1;
          } else {
            return var1;
          }
        }
    }

    final boolean a(at param0, byte param1, ic param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param1 <= -84) {
              stackOut_3_0 = this.a((byte) -39, param2, param0, true);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var4);
            stackOut_5_1 = new StringBuilder().append("md.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_4_0;
        }
    }

    md(int param0, int param1, int param2, int param3, int param4) {
        this.field_z = param3 + param1;
        this.field_C = param4;
        this.field_E = param0 + param2;
        this.field_B = param1;
        this.field_D = param0;
        this.field_m = 7;
    }

    final void a(ha param0, int param1) {
        jd var7 = null;
        jd var4 = null;
        jd var5 = null;
        boolean discarded$0 = false;
        try {
            var7 = param0.c(this.field_B, true, this.field_D);
            var4 = param0.c(this.field_z, true, this.field_E);
            if (var4 != null) {
                if (null != var4.field_p) {
                    var4.field_p.d(-116);
                }
                var5 = var4.b(this.field_C, -1);
                if (var7 != null) {
                    if (var7.field_p != null) {
                        if (var5 != null) {
                            var7.field_p.field_r.a(80, var5);
                        }
                    }
                }
            }
            if (!(var7 == null)) {
                var7.d(param1 ^ 26704);
                if (var7.field_p != null) {
                    var7.field_p.d(-128);
                }
                param0.field_Eb[param0.field_v * this.field_B + this.field_D].field_c = null;
            }
            if (param1 != -26661) {
                ic var6 = (ic) null;
                discarded$0 = this.a((at) null, (byte) 109, (ic) null);
            }
            fl.a(param0, -126);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) ((Object) runtimeException), "md.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_y = new at();
        field_F = "This game option has not yet been unlocked for use.";
    }
}
