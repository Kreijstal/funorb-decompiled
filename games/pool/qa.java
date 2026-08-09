/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa extends ma {
    int field_s;
    static String field_u;
    qa field_l;
    static lr field_t;
    int field_p;
    static String field_m;
    int field_q;
    static vh field_v;
    int field_n;
    int field_w;
    static int field_r;
    static String field_o;

    final static void a(int[][] param0, bf[] param1, pq[] param2, int param3) {
        int dupTemp$1 = 0;
        pq[] var4 = null;
        int var4_int = 0;
        int var5 = 0;
        pq[] var6 = null;
        pq[] var7 = null;
        int var8 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        try {
          L0: {
            hb.field_s = -1;
            td.field_b = 0;
            or.field_l = 0;
            var6 = param2;
            var4 = var6;
            var5 = 0;
            L1: while (true) {
              if (var6.length <= var5) {
                var4_int = 0;
                L2: while (true) {
                  dupTemp$1 = oe.a(param1, var4_int, param2, param0, param3 + 0);
                  var4_int = dupTemp$1;
                  if ((dupTemp$1 ^ -1) == 0) {
                    var7 = param2;
                    var4 = var7;
                    var8 = param3;
                    var5 = var8;
                    L3: while (true) {
                      if (var8 >= var7.length) {
                        break L0;
                      } else {
                        L4: {
                          if (!var7[var8].field_s) {
                            break L4;
                          } else {
                            var7[var8].a(false);
                            break L4;
                          }
                        }
                        var8++;
                        continue L3;
                      }
                    }
                  } else {
                    continue L2;
                  }
                }
              } else {
                var6[var5].field_w = 0;
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4_ref);

            stackIn_14_1 = new StringBuilder().append("qa.F(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',');

            if (param1 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_15_0), stackIn_21_2 + ',' + param3 + ')');
        }
    }

    public static void c(byte param0) {
        field_o = null;
        field_t = null;
        field_m = null;
        field_u = null;
        field_v = null;
        if (param0 < 4) {
            field_u = (String) null;
        }
    }

    final static void a(boolean param0, String param1, int param2, String param3) {
        try {
            qo.field_x = param1;
            qg.field_a = param3;
            wf.a(param0, gg.field_a, -126);
            int var4_int = -110 % ((param2 - -30) / 57);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "qa.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Pool.field_O;
        try {
          L0: {
            if (param0 == 1) {
              var2_int = 0;
              L1: while (true) {
                if (var2_int >= param1.length()) {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    var3 = param1.charAt(var2_int);
                    if (vq.a((char) var3, 22987)) {
                      break L2;
                    } else {
                      if (kh.a((char) var3, (byte) 120)) {
                        break L2;
                      } else {
                        stackIn_9_0 = 1;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  }
                  var2_int++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("qa.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            return stackIn_12_0 != 0;
          }
        }
    }

    final static void a(byte param0, boolean param1) {
        oa.a(param1, (byte) 80);
        if (param0 != 55) {
            String var3 = (String) null;
            qa.a((String) null, 95);
        }
        hm.a(param1, param0 + -19268);
    }

    final static String a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char[] var3 = null;
        int var4 = 0;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_int = param0.length();
            var3 = new char[var2_int];
            var4 = param1;
            L1: while (true) {
              if (var2_int <= var4) {
                stackIn_4_0 = new String(var3);
                break L0;
              } else {
                var3[var2_int + (-1 + -var4)] = param0.charAt(var4);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("qa.G(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(byte param0, int param1, lr param2, String param3, int param4, int param5) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Pool.field_O;
        try {
          L0: {
            L1: {
              var6_int = param2.b(param3);
              var7 = param2.field_w + param2.field_C;
              var8 = 1;
              if (var6_int > param1) {
                L2: {
                  var9 = var6_int / param1;
                  var10 = 2 * ((-1 + (var6_int % param1 + var9)) / var9) + param1;
                  if (null == wg.field_Mb) {
                    wg.field_Mb = new String[16];
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var8 = param2.a(param3, new int[]{var10}, wg.field_Mb);
                var7 = var7 * var8;
                var6_int = 0;
                var11 = 0;
                L3: while (true) {
                  if (var11 >= var8) {
                    break L1;
                  } else {
                    L4: {
                      var12 = param2.b(wg.field_Mb[var11]);
                      if ((var12 ^ -1) < (var6_int ^ -1)) {
                        var6_int = var12;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var11++;
                    continue L3;
                  }
                }
              } else {
                break L1;
              }
            }
            if (param0 == 71) {
              L5: {
                var9 = pa.field_H;
                if (var9 + var6_int + 6 <= qh.field_l) {
                  break L5;
                } else {
                  var9 = -6 + -var6_int + qh.field_l;
                  break L5;
                }
              }
              L6: {
                var10 = -param2.field_L + (pm.field_p + 32);
                if (qh.field_f < var7 + (var10 + 6)) {
                  var10 = pm.field_p + (-var7 + -6);
                  break L6;
                } else {
                  break L6;
                }
              }
              qh.b(var9, var10, 6 + var6_int, 6 + var7, param4);
              qh.f(1 + var9, 1 + var10, var6_int - -4, 4 + var7, param5);
              param2.a(param3, 3 + var9, var10 - -3, var6_int, var7, param4, -1, 0, 0, param2.field_w + param2.field_C);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var6);

            stackIn_23_1 = new StringBuilder().append("qa.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param3 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L8;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_24_0), stackIn_27_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    qa(int param0, int param1, int param2, int param3, int param4) {
        this.field_s = param0;
        this.field_q = param4;
        this.field_p = param2;
        this.field_n = param1;
        this.field_w = param3;
    }

    static {
        field_u = "Reject";
        field_m = "Respect";
        field_o = "Players: <%0>/<%1>";
    }
}
