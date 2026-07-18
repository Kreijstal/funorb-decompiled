/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln {
    static boolean field_e;
    int[] field_b;
    static byte[] field_d;
    static String field_c;
    int[] field_a;

    final int b(byte param0) {
        if (!(((ln) this).field_a[4] != -1)) {
            return -20;
        }
        int var2 = -4 % ((47 - param0) / 62);
        return 0;
    }

    final int a(int param0, int param1, int param2, int param3, String param4, int param5, int param6) {
        RuntimeException var8 = null;
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
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                int discarded$2 = ((ln) this).b((byte) 83);
                break L1;
              }
            }
            stackOut_2_0 = cc.a(param5, param3, ((ln) this).field_a, param6, -1, true, param2, param4, ((ln) this).field_b, param0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var8 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var8;
            stackOut_4_1 = new StringBuilder().append("ln.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param4 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_3_0;
    }

    final int a(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != 21930) {
          ((ln) this).a(42, -104, -118);
          return tt.a(param0 - param3, param4 + -param2, ((ln) this).field_a, false);
        } else {
          return tt.a(param0 - param3, param4 + -param2, ((ln) this).field_a, false);
        }
    }

    final String a(byte param0) {
        int var4 = 0;
        int var5 = ArmiesOfGielinor.field_M ? 1 : 0;
        String var2 = "coat=";
        int var3 = -16 % ((param0 - -23) / 40);
        for (var4 = 0; ((ln) this).field_a.length > var4; var4++) {
            var2 = var2 + ((ln) this).field_a[var4] + ":" + ((ln) this).field_b[var4] + ":";
        }
        return var2;
    }

    public static void a(boolean param0) {
        field_c = null;
        field_d = null;
    }

    final static void a(kl param0, kl param1, kl param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        String var5 = null;
        int var6_int = 0;
        String var6 = null;
        int var7 = 0;
        String var8 = null;
        int var9 = 0;
        String var10 = null;
        String var11 = null;
        int var12 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            ck.field_e = new qb[or.field_f.length][];
            var4_int = 0;
            L1: while (true) {
              if (or.field_f.length <= var4_int) {
                L2: {
                  if (!ta.field_L) {
                    var12 = 0;
                    var4_int = var12;
                    L3: while (true) {
                      if (var12 >= 6) {
                        break L2;
                      } else {
                        L4: {
                          var11 = ArmiesOfGielinor.field_N[var12];
                          var5 = var11;
                          if (var5 == null) {
                            pv.field_a[var12] = new qb[0];
                            var12++;
                            break L4;
                          } else {
                            pv.field_a[var12] = new qb[1];
                            var6 = bv.field_u[var12];
                            pv.field_a[var12][0] = new qb(param0, var11, var6);
                            var12++;
                            break L4;
                          }
                        }
                        var12++;
                        continue L3;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                nl.a(param1, ck.field_e, param2, (byte) 126);
                nl.a(param1, pv.field_a, param2, (byte) 126);
                qv.c(-11757);
                break L0;
              } else {
                var10 = or.field_f[var4_int];
                var5 = var10;
                var6_int = jq.field_I[var4_int].length;
                ck.field_e[var4_int] = new qb[var6_int];
                var7 = 0;
                L5: while (true) {
                  if (var6_int <= var7) {
                    var4_int++;
                    var4_int++;
                    continue L1;
                  } else {
                    var8 = jq.field_I[var4_int][var7];
                    ck.field_e[var4_int][var7] = new qb(param0, var10, var8);
                    var7++;
                    continue L5;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var4;
            stackOut_21_1 = new StringBuilder().append("ln.B(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          L7: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param1 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          L8: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param2 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L8;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + ',' + 0 + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        if (param0 < 52) {
            return;
        }
        ((ln) this).field_a[param2] = param1;
    }

    final wk a(String param0, byte param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object var5 = null;
        nj stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        nj stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              no.field_P.field_v = qn.field_g;
              if (param1 == -70) {
                break L1;
              } else {
                var5 = null;
                ((ln) this).a(false, true, (byte) -47, true, false, true, -69, (String) null, 102);
                break L1;
              }
            }
            L2: {
              no.field_P.field_B = qn.field_d;
              no.field_P.field_y = qn.field_l;
              ku.field_J.b();
              qn.b();
              if (param2) {
                break L2;
              } else {
                var4_int = ((ln) this).field_a[3];
                ((ln) this).field_a[3] = -1;
                int discarded$4 = cc.a(0, -1, ((ln) this).field_a, -1, -1, false, -1, param0, ((ln) this).field_b, 0);
                ((ln) this).field_a[3] = var4_int;
                break L2;
              }
            }
            int discarded$5 = dm.a(-1, -1, ((ln) this).field_a, -1, false, ((ln) this).field_b, -1, false, 0, false, 0, param0);
            no.field_P.b();
            stackOut_4_0 = ew.a((byte) 107, ku.field_J);
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var4;
            stackOut_6_1 = new StringBuilder().append("ln.G(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
        return (wk) (Object) stackIn_5_0;
    }

    final void a(boolean param0, int param1, int param2, boolean param3, int param4, String param5, boolean param6, boolean param7, boolean param8, int param9) {
        RuntimeException var11 = null;
        int[] var11_array = null;
        int var11_int = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        Object var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var17 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              no.field_P.field_v = qn.field_g;
              no.field_P.field_B = qn.field_d;
              no.field_P.field_y = qn.field_l;
              if (param8) {
                L2: {
                  L3: {
                    if (null == dv.field_k) {
                      break L3;
                    } else {
                      if (param1 != t.field_f) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  dv.field_k = a.field_m[0].g();
                  var23 = dv.field_k.field_B;
                  var22 = var23;
                  var21 = var22;
                  var20 = var21;
                  var19 = var20;
                  var11_array = var19;
                  var12 = 0;
                  L4: while (true) {
                    if (var23.length <= var12) {
                      break L2;
                    } else {
                      var13 = 255 & var23[var12];
                      var14 = (param1 >> 16 & 255) * var13 >> 8;
                      var15 = var13 * ((65280 & param1) >> 8) >> 8;
                      var16 = (255 & param1) * var13 >> 8;
                      var11_array[var12] = (var15 << 8) + ((var14 << 16) + var16);
                      var12++;
                      continue L4;
                    }
                  }
                }
                dv.field_k.d(-20 + param4, param2 - 15, 92, 92, 256);
                break L1;
              } else {
                break L1;
              }
            }
            L5: {
              ku.field_J.b();
              qn.b();
              if (param6) {
                int discarded$2 = cc.a(0, -1, ((ln) this).field_a, -1, -1, false, -1, param5, ((ln) this).field_b, 0);
                break L5;
              } else {
                var11_int = ((ln) this).field_a[3];
                ((ln) this).field_a[3] = -1;
                int discarded$3 = cc.a(0, -1, ((ln) this).field_a, -1, -1, false, -1, param5, ((ln) this).field_b, 0);
                ((ln) this).field_a[3] = var11_int;
                break L5;
              }
            }
            L6: {
              if (!param7) {
                if (!param0) {
                  if (param3) {
                    a.field_m[3].g(0, 0);
                    break L6;
                  } else {
                    break L6;
                  }
                } else {
                  fe.a(a.field_m[2], 0, 0);
                  a.field_m[2].f(0, 0, 228);
                  break L6;
                }
              } else {
                a.field_m[1].g(0, 0);
                break L6;
              }
            }
            no.field_P.b();
            ku.field_J.e(param4, param2);
            if (param9 == -19744) {
              break L0;
            } else {
              var18 = null;
              ((ln) this).a(true, true, (byte) -68, false, true, false, 10, (String) null, 59);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var11 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var11;
            stackOut_23_1 = new StringBuilder().append("ln.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param5 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final void a(boolean param0, boolean param1, byte param2, boolean param3, boolean param4, boolean param5, int param6, String param7, int param8) {
        RuntimeException var10 = null;
        int var10_int = 0;
        int var11 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              no.field_P.field_v = qn.field_g;
              no.field_P.field_B = qn.field_d;
              no.field_P.field_y = qn.field_l;
              ku.field_J.b();
              qn.b();
              if (!param3) {
                var10_int = ((ln) this).field_a[3];
                ((ln) this).field_a[3] = -1;
                int discarded$2 = cc.a(0, -1, ((ln) this).field_a, -1, -1, false, -1, param7, ((ln) this).field_b, 0);
                ((ln) this).field_a[3] = var10_int;
                break L1;
              } else {
                int discarded$3 = cc.a(0, -1, ((ln) this).field_a, -1, -1, false, -1, param7, ((ln) this).field_b, 0);
                break L1;
              }
            }
            L2: {
              if (param0) {
                a.field_m[1].g(0, 0);
                break L2;
              } else {
                if (!param5) {
                  if (!param4) {
                    break L2;
                  } else {
                    a.field_m[3].g(0, 0);
                    break L2;
                  }
                } else {
                  fe.a(a.field_m[2], 0, 0);
                  a.field_m[2].f(0, 0, 228);
                  break L2;
                }
              }
            }
            L3: {
              if (param2 == 68) {
                break L3;
              } else {
                field_d = null;
                break L3;
              }
            }
            ko.field_g.b();
            qn.b();
            ku.field_J.e(0, 0);
            no.field_P.b();
            ko.field_g.h(param8, param6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var10 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var10;
            stackOut_14_1 = new StringBuilder().append("ln.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param7 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param8 + ')');
        }
    }

    final void a(int param0, int param1, byte param2) {
        ((ln) this).field_b[param0] = param1;
        if (param2 > -93) {
            ((ln) this).field_b = null;
        }
    }

    final void a(int param0, String param1, boolean param2, boolean param3, int param4, boolean param5, boolean param6, int param7) {
        RuntimeException var9 = null;
        int var10 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var10 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param7 > 16) {
                break L1;
              } else {
                field_d = null;
                break L1;
              }
            }
            L2: {
              no.field_P.field_y = qn.field_l;
              no.field_P.field_B = qn.field_d;
              no.field_P.field_v = qn.field_g;
              if (param6) {
                a.field_m[0].d(-40 + param0, -30 + param4, 184, 184, 256);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              ku.field_J.b();
              qn.b();
              int discarded$1 = cc.a(0, -1, ((ln) this).field_a, -1, -1, false, -1, param1, ((ln) this).field_b, 0);
              if (!param3) {
                if (!param2) {
                  if (!param5) {
                    break L3;
                  } else {
                    a.field_m[3].g(0, 0);
                    break L3;
                  }
                } else {
                  fe.a(a.field_m[2], 0, 0);
                  a.field_m[2].f(0, 0, 228);
                  break L3;
                }
              } else {
                a.field_m[1].g(0, 0);
                break L3;
              }
            }
            no.field_P.b();
            ku.field_J.h(param0, param4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var9 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var9;
            stackOut_14_1 = new StringBuilder().append("ln.E(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    ln(int[] param0, int[] param1) {
        try {
            ((ln) this).field_a = param0;
            ((ln) this).field_b = param1;
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "ln.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ln() {
        ((ln) this).field_a = new int[6];
        ((ln) this).field_b = new int[6];
        ((ln) this).field_a[0] = 0;
        ((ln) this).field_a[3] = 0;
        ((ln) this).field_a[2] = -1;
        ((ln) this).field_a[4] = -1;
        ((ln) this).field_a[1] = -1;
        ((ln) this).field_a[5] = 0;
        ((ln) this).field_b[3] = 0;
        ((ln) this).field_b[5] = 0;
        ((ln) this).field_b[2] = 0;
        ((ln) this).field_b[1] = 0;
        ((ln) this).field_b[4] = 0;
        ((ln) this).field_b[0] = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = false;
        field_c = "<%0> of <%1> strength";
    }
}
