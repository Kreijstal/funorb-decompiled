/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ne extends am {
    static vh field_j;
    int field_l;
    static int field_o;
    int field_h;
    static vl field_q;
    static bd field_n;
    int field_m;
    int field_k;
    int field_i;
    static String field_p;
    int field_r;

    final static bd[] a(int param0, gb param1, int param2, int param3) {
        RuntimeException var4 = null;
        bd[] stackIn_5_0 = null;
        bd[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (rl.a(param0 + 2840, param1, param3, param2)) {
              if (param0 == 44) {
                stackIn_7_0 = qa.a(param0 ^ 26671);
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                stackIn_5_0 = (bd[]) null;
                decompiledRegionSelector0 = 0;
                break L0;
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4);

            stackIn_10_1 = new StringBuilder().append("ne.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static void a(int param0, int param1, int param2) {
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = param2;
              var4 = ec.a(bm.field_b, (byte) 19);
              var5 = -1;
              var6 = 0;
              var7 = 0;
              if (param0 == 24) {
                break L1;
              } else {
                ne.a((byte) 63);
                break L1;
              }
            }
            L2: {
              if (0 >= var4) {
                break L2;
              } else {
                L3: {
                  var8 = 32;
                  if (8 >= var4) {
                    break L3;
                  } else {
                    var8 = 270 / var4;
                    break L3;
                  }
                }
                param2 = param2 - (-4 + var8 * var4 / 2);
                var9 = 0;
                L4: while (true) {
                  if (42 <= var9) {
                    if (var5 >= 0) {
                      L5: {
                        if (var8 >= 32) {
                          fj.field_Kb[var5].a(var6 + -6, var7 - 6, 44, 44);
                          break L5;
                        } else {
                          fj.field_Kb[var5].a(var6 - 6, var7 + -6, var8, var8);
                          break L5;
                        }
                      }
                      al.field_Z.b(il.field_b[var5].toUpperCase(), var3_int, param1 + -8, 16776960, -1);
                      al.field_Z.a(bh.field_g[var5].toUpperCase(), var3_int - 130, param1 + 24, 260, 100, 16777215, -1, 1, 0, 12);
                      break L2;
                    } else {
                      return;
                    }
                  } else {
                    L6: {
                      if (!hb.a(var9, bm.field_b, false)) {
                        break L6;
                      } else {
                        L7: {
                          if (ka.a(param1, 0, var8, var8, param2)) {
                            var6 = param2;
                            var7 = param1;
                            var5 = var9;
                            break L7;
                          } else {
                            if (32 <= var8) {
                              fj.field_Kb[var9].b(param2, param1);
                              break L7;
                            } else {
                              fj.field_Kb[var9].a(-6 + param2, -6 + param1, var8, var8);
                              break L7;
                            }
                          }
                        }
                        param2 = param2 + var8;
                        break L6;
                      }
                    }
                    var9++;
                    continue L4;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var3), "ne.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static bd a(bd param0, byte param1) {
        gk var2 = null;
        RuntimeException var2_ref = null;
        gk var3 = null;
        bd stackIn_5_0 = null;
        gk stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 <= -4) {
                break L1;
              } else {
                field_j = (vh) null;
                break L1;
              }
            }
            if (!(param0 instanceof gk)) {
              stackIn_5_0 = param0.d();
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var2 = (gk) ((Object) param0);
              var3 = var2.i();
              var3.g();
              stackIn_7_0 = (gk) (var3);
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2_ref);

            stackIn_10_1 = new StringBuilder().append("ne.E(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return (bd) ((Object) stackIn_7_0);
        }
    }

    public static void a(byte param0) {
        field_n = null;
        int var1 = -38 % ((-58 - param0) / 47);
        field_p = null;
        field_q = null;
        field_j = null;
    }

    final static nf a(gb param0, int param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        byte[] var5 = null;
        nf stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = param0.a(param2, -2);
            var3 = var5;
            if (var5 != null) {
              var4 = -14 / ((81 - param1) / 38);
              stackIn_4_0 = new nf(var5);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3_ref);

            stackIn_7_1 = new StringBuilder().append("ne.C(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_4_0;
    }

    ne(int param0, int param1, int param2, int param3, int param4, int param5) {
        this.field_m = param1;
        this.field_i = param0;
        this.field_l = param3;
        this.field_k = param4;
        this.field_r = param2;
        this.field_h = param5;
    }

    static {
        field_o = -1;
        field_p = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_q = new vl();
    }
}
