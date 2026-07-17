/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jg extends am {
    static String field_v;
    private int field_s;
    static String field_u;
    static String field_w;
    static t field_t;
    private int field_x;

    final static void a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var17 = 0;
        int[] var21 = null;
        RuntimeException decompiledCaughtException = null;
        var17 = Torquing.field_u;
        try {
          L0: {
            var11 = ln.a(qk.field_p, j.field_q, param4, 113);
            var12 = ln.a(qk.field_p, j.field_q, param6, 69);
            var13 = ln.a(qg.field_z, kn.field_e, param5, 96);
            var14 = ln.a(qg.field_z, kn.field_e, param1, 113);
            var7_int = ln.a(qk.field_p, j.field_q, param3 + param4, 99);
            var8 = ln.a(qk.field_p, j.field_q, -param3 + param6, 71);
            var15 = var11;
            L1: while (true) {
              if (var7_int <= var15) {
                var15 = var12;
                L2: while (true) {
                  if (var8 >= var15) {
                    var9 = ln.a(qg.field_z, kn.field_e, param5 + param3, 75);
                    var10 = ln.a(qg.field_z, kn.field_e, -param3 + param1, 119);
                    var15 = var7_int;
                    L3: while (true) {
                      if (var15 > var8) {
                        L4: {
                          if (param2 < -108) {
                            break L4;
                          } else {
                            field_u = null;
                            break L4;
                          }
                        }
                        break L0;
                      } else {
                        var21 = qd.field_a[var15];
                        di.a(var13, (byte) -118, param0, var21, var9);
                        di.a(var10, (byte) 4, param0, var21, var14);
                        var15++;
                        continue L3;
                      }
                    }
                  } else {
                    di.a(var13, (byte) 90, param0, qd.field_a[var15], var14);
                    var15--;
                    continue L2;
                  }
                }
              } else {
                di.a(var13, (byte) -92, param0, qd.field_a[var15], var14);
                var15++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var7, "jg.D(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    final int[] a(byte param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int stackIn_11_2 = 0;
        int[] stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        int[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        int[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        L0: {
          var7 = Torquing.field_u;
          if (param0 > 86) {
            break L0;
          } else {
            ((jg) this).field_s = 60;
            break L0;
          }
        }
        L1: {
          var8 = ((jg) this).field_l.a(param1, 25657);
          var3 = var8;
          if (((jg) this).field_l.field_b) {
            var4 = ((jg) this).b(0, 0, param1);
            var5 = 0;
            L2: while (true) {
              if (var5 >= ci.field_c) {
                break L1;
              } else {
                L3: {
                  L4: {
                    var6 = var4[var5];
                    stackOut_6_0 = (int[]) var8;
                    stackOut_6_1 = var5;
                    stackIn_9_0 = stackOut_6_0;
                    stackIn_9_1 = stackOut_6_1;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    if (((jg) this).field_s > var6) {
                      break L4;
                    } else {
                      stackOut_7_0 = (int[]) (Object) stackIn_7_0;
                      stackOut_7_1 = stackIn_7_1;
                      stackIn_10_0 = stackOut_7_0;
                      stackIn_10_1 = stackOut_7_1;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      if (var6 <= ((jg) this).field_x) {
                        stackOut_10_0 = (int[]) (Object) stackIn_10_0;
                        stackOut_10_1 = stackIn_10_1;
                        stackOut_10_2 = 4096;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        stackIn_11_2 = stackOut_10_2;
                        break L3;
                      } else {
                        stackOut_8_0 = (int[]) (Object) stackIn_8_0;
                        stackOut_8_1 = stackIn_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        break L4;
                      }
                    }
                  }
                  stackOut_9_0 = (int[]) (Object) stackIn_9_0;
                  stackOut_9_1 = stackIn_9_1;
                  stackOut_9_2 = 0;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  stackIn_11_2 = stackOut_9_2;
                  break L3;
                }
                stackIn_11_0[stackIn_11_1] = stackIn_11_2;
                var5++;
                continue L2;
              }
            }
          } else {
            break L1;
          }
        }
        return var8;
    }

    public static void g() {
        field_v = null;
        field_w = null;
        field_t = null;
        field_u = null;
    }

    final static String a(boolean param0) {
        if (!(null != re.field_e)) {
            return "";
        }
        return re.field_e;
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var5 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (0 != var4_int) {
                if (var4_int != 1) {
                  break L1;
                } else {
                  ((jg) this).field_x = param0.i(7088);
                  break L1;
                }
              } else {
                ((jg) this).field_s = param0.i(7088);
                break L1;
              }
            }
            L2: {
              if (param1 == 35) {
                break L2;
              } else {
                jg.a(57, -27, (byte) 70, -55, -8, -83, -31);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var4;
            stackOut_10_1 = new StringBuilder().append("jg.H(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public jg() {
        super(1, true);
        ((jg) this).field_s = 0;
        ((jg) this).field_x = 4096;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        var14 = Torquing.field_u;
        try {
          L0: {
            if (param4 < param0) {
              if (param4 + 1 >= param6) {
                return;
              } else {
                L1: {
                  if (param4 - -5 >= param6) {
                    break L1;
                  } else {
                    if (param3 != param5) {
                      var7_int = (1 & (param3 & param5)) + ((param3 >> 1) + (param5 >> 1));
                      var8 = param4;
                      if (param1 <= -27) {
                        var9 = param3;
                        var10 = param5;
                        var11 = param4;
                        L2: while (true) {
                          if (var11 >= param6) {
                            jg.a(param0, -101, param2, param3, param4, var9, var8);
                            jg.a(param0, -29, param2, var10, var8, param5, param6);
                            break L0;
                          } else {
                            L3: {
                              var12 = lp.field_g[var11];
                              if (param2) {
                                stackOut_25_0 = il.field_o[var12];
                                stackIn_26_0 = stackOut_25_0;
                                break L3;
                              } else {
                                stackOut_24_0 = ji.field_a[var12];
                                stackIn_26_0 = stackOut_24_0;
                                break L3;
                              }
                            }
                            var13 = stackIn_26_0;
                            if (var13 <= var7_int) {
                              L4: {
                                if (var10 < var13) {
                                  var10 = var13;
                                  break L4;
                                } else {
                                  break L4;
                                }
                              }
                              var11++;
                              continue L2;
                            } else {
                              L5: {
                                lp.field_g[var11] = lp.field_g[var8];
                                int incrementValue$1 = var8;
                                var8++;
                                lp.field_g[incrementValue$1] = var12;
                                if (var9 <= var13) {
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              var11++;
                              continue L2;
                            }
                          }
                        }
                      } else {
                        return;
                      }
                    } else {
                      break L1;
                    }
                  }
                }
                var7_int = -1 + param6;
                L6: while (true) {
                  if (var7_int <= param4) {
                    return;
                  } else {
                    var8 = param4;
                    L7: while (true) {
                      if (var7_int <= var8) {
                        var7_int--;
                        continue L6;
                      } else {
                        L8: {
                          var9 = lp.field_g[var8];
                          var10 = lp.field_g[1 + var8];
                          if (vc.a(param2, var10, 0, var9)) {
                            lp.field_g[var8] = var10;
                            lp.field_g[var8 + 1] = var9;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var8++;
                        continue L7;
                      }
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw rb.a((Throwable) (Object) var7, "jg.E(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Connection lost. <%0>";
        field_u = "This password contains repeated characters, and would be easy to guess";
        field_v = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
