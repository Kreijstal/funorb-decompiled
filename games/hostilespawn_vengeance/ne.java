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
        Object stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        bd[] stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        bd[] stackOut_8_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (!rl.a(param0 + 2840, param1, param3, param2)) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (bd[]) (Object) stackIn_4_0;
            } else {
              if (param0 == 44) {
                stackOut_8_0 = qa.a(param0 ^ 26671);
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (bd[]) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("ne.A(").append(param0).append(',');
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_9_0;
    }

    final static void a(int param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0 = false;
        int stackOut_28_0 = 0;
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
                  L5: {
                    L6: {
                      if (42 <= var9) {
                        break L6;
                      } else {
                        stackOut_9_0 = hb.a(var9, bm.field_b, false);
                        stackIn_29_0 = stackOut_9_0 ? 1 : 0;
                        stackIn_10_0 = stackOut_9_0;
                        if (var10 != 0) {
                          break L5;
                        } else {
                          L7: {
                            if (!stackIn_10_0) {
                              break L7;
                            } else {
                              L8: {
                                L9: {
                                  if (ka.a(param1, 0, var8, var8, param2)) {
                                    break L9;
                                  } else {
                                    L10: {
                                      if (32 <= var8) {
                                        break L10;
                                      } else {
                                        fj.field_Kb[var9].a(-6 + param2, -6 + param1, var8, var8);
                                        if (var10 == 0) {
                                          break L8;
                                        } else {
                                          break L10;
                                        }
                                      }
                                    }
                                    fj.field_Kb[var9].b(param2, param1);
                                    if (var10 == 0) {
                                      break L8;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                                var6 = param2;
                                var7 = param1;
                                var5 = var9;
                                break L8;
                              }
                              param2 = param2 + var8;
                              break L7;
                            }
                          }
                          var9++;
                          if (var10 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    stackOut_28_0 = var5;
                    stackIn_29_0 = stackOut_28_0;
                    break L5;
                  }
                  if (stackIn_29_0 >= 0) {
                    L11: {
                      L12: {
                        if (var8 >= 32) {
                          break L12;
                        } else {
                          fj.field_Kb[var5].a(var6 - 6, var7 + -6, var8, var8);
                          if (var10 == 0) {
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      fj.field_Kb[var5].a(var6 + -6, var7 - 6, 44, 44);
                      break L11;
                    }
                    al.field_Z.b(il.field_b[var5].toUpperCase(), var3_int, param1 + -8, 16776960, -1);
                    int discarded$1 = al.field_Z.a(bh.field_g[var5].toUpperCase(), var3_int - 130, param1 + 24, 260, 100, 16777215, -1, 1, 0, 12);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wg.a((Throwable) (Object) var3, "ne.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static bd a(bd param0, byte param1) {
        gk var2 = null;
        RuntimeException var2_ref = null;
        gk var3 = null;
        bd stackIn_7_0 = null;
        gk stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        bd stackOut_6_0 = null;
        gk stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (param1 <= -4) {
                break L1;
              } else {
                field_j = null;
                break L1;
              }
            }
            if (!(param0 instanceof gk)) {
              stackOut_6_0 = param0.d();
              stackIn_7_0 = stackOut_6_0;
              return stackIn_7_0;
            } else {
              var2 = (gk) (Object) param0;
              var3 = var2.i();
              var3.g();
              stackOut_8_0 = (gk) var3;
              stackIn_9_0 = stackOut_8_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2_ref;
            stackOut_10_1 = new StringBuilder().append("ne.E(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L2;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ',' + param1 + ')');
        }
        return (bd) (Object) stackIn_9_0;
    }

    public static void a(byte param0) {
        try {
            field_n = null;
            int var1_int = -38 % ((-58 - param0) / 47);
            field_p = null;
            field_q = null;
            field_j = null;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "ne.B(" + param0 + ')');
        }
    }

    final static nf a(gb param0, int param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        Object stackIn_4_0 = null;
        nf stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        nf stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            var3 = param0.a(param2, -2);
            if (var3 == null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (nf) (Object) stackIn_4_0;
            } else {
              var4 = -14 / ((81 - param1) / 38);
              stackOut_5_0 = new nf(var3);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3_ref;
            stackOut_7_1 = new StringBuilder().append("ne.C(");
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L1;
            }
          }
          throw wg.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_6_0;
    }

    ne(int param0, int param1, int param2, int param3, int param4, int param5) {
        try {
            ((ne) this).field_m = param1;
            ((ne) this).field_i = param0;
            ((ne) this).field_l = param3;
            ((ne) this).field_k = param4;
            ((ne) this).field_r = param2;
            ((ne) this).field_h = param5;
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "ne.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = -1;
        field_p = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
        field_q = new vl();
    }
}
