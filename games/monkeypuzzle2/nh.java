/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends ug {
    static le[][][] field_f;
    int field_g;
    byte[] field_h;
    long field_e;

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var9 = -((param2 - param3) * (param5 - param0)) + (param1 + -param8) * (-param6 + param7);
        if (0 == var9) {
          return false;
        } else {
          var10 = -(param6 * param2) + param7 * param3;
          var11 = -param6 + param7;
          var12 = param2 - param3;
          var13 = param8 * param5 - param0 * param1;
          var14 = -param0 + param5;
          var15 = -param8 + param1;
          if (param4 != -5425) {
            field_f = (le[][][]) null;
            ll.field_a = (var10 * var14 + -(var11 * var13)) / var9;
            ok.field_b = (-(var12 * var13) + var10 * var15) / var9;
            return true;
          } else {
            ll.field_a = (var10 * var14 + -(var11 * var13)) / var9;
            ok.field_b = (-(var12 * var13) + var10 * var15) / var9;
            return true;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -19931) {
            field_f = (le[][][]) null;
            field_f = (le[][][]) null;
            return;
        }
        field_f = (le[][][]) null;
    }

    final static void a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (-18 >= (var1_int ^ -1)) {
                    break L3;
                  } else {
                    pe.field_d[var1_int] = new wg(320.0f, (float)(-(var1_int * 2) + 0));
                    var1_int++;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var1_int = -117 % ((-69 - param0) / 44);
                break L2;
              }
              var2 = 1;
              L4: while (true) {
                L5: {
                  if (var2 >= 17) {
                    var2 = 16;
                    break L5;
                  } else {
                    hh.field_n[var2 + -1] = new gb(pe.field_d[-1 + var2], pe.field_d[var2], 30.0f);
                    var2++;
                    if (var4 != 0) {
                      break L5;
                    } else {
                      continue L4;
                    }
                  }
                }
                var3 = 1;
                L6: while (true) {
                  if (-33 >= (var2 ^ -1)) {
                    break L0;
                  } else {
                    hh.field_n[var2] = new gb(pe.field_d[var3], 240.0f, (float)(var3 * 30), 2.0f);
                    var3++;
                    var2++;
                    if (var4 == 0) {
                      continue L6;
                    } else {
                      return;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "nh.D(" + param0 + ')');
        }
    }

    final static void b(byte param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var1_int = 37 % ((45 - param0) / 61);
            var2 = 1;
            L1: while (true) {
              L2: {
                if (var2 >= 17) {
                  var1_int = 0;
                  break L2;
                } else {
                  pe.field_d[var2].field_f[0] = 0.0f;
                  pe.field_d[var2].field_f[1] = pe.field_d[var2].field_f[1] + 8.0f;
                  pe.field_d[var2].e(-85);
                  var2++;
                  if (var6 != 0) {
                    break L2;
                  } else {
                    continue L1;
                  }
                }
              }
              L3: while (true) {
                L4: {
                  L5: {
                    if (3 <= var1_int) {
                      break L5;
                    } else {
                      if (var6 != 0) {
                        break L4;
                      } else {
                        L6: {
                          if ((1 & var1_int) == 0) {
                            stackOut_11_0 = 15;
                            stackIn_12_0 = stackOut_11_0;
                            break L6;
                          } else {
                            stackOut_10_0 = 0;
                            stackIn_12_0 = stackOut_10_0;
                            break L6;
                          }
                        }
                        L7: {
                          var2 = stackIn_12_0;
                          if ((1 & var1_int) != 0) {
                            stackOut_14_0 = 16;
                            stackIn_15_0 = stackOut_14_0;
                            break L7;
                          } else {
                            stackOut_13_0 = -1;
                            stackIn_15_0 = stackOut_13_0;
                            break L7;
                          }
                        }
                        L8: {
                          var3 = stackIn_15_0;
                          if ((1 & var1_int) == 0) {
                            stackOut_17_0 = -1;
                            stackIn_18_0 = stackOut_17_0;
                            break L8;
                          } else {
                            stackOut_16_0 = 1;
                            stackIn_18_0 = stackOut_16_0;
                            break L8;
                          }
                        }
                        var4 = stackIn_18_0;
                        var5 = var2;
                        L9: while (true) {
                          L10: {
                            if (var3 == var5) {
                              var1_int++;
                              break L10;
                            } else {
                              hh.field_n[var5].c((byte) 122);
                              var5 = var5 + var4;
                              if (var6 != 0) {
                                break L10;
                              } else {
                                continue L9;
                              }
                            }
                          }
                          if (var6 == 0) {
                            continue L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  }
                  pe.field_d[0].field_e[1] = 0.0f;
                  pe.field_d[0].field_e[0] = 240.0f;
                  pe.field_d[0].field_i[0] = 240.0f;
                  pe.field_d[0].field_i[1] = 0.0f;
                  break L4;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "nh.E(" + param0 + ')');
        }
    }

    nh(long param0, int param1, byte[] param2) {
        try {
            this.field_e = param0;
            this.field_g = param1;
            this.field_h = param2;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "nh.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, java.applet.Applet param1) {
        String var2 = null;
        String var3 = null;
        long var4 = 0L;
        try {
            oa.field_I = true;
            var2 = "tuhstatbut";
            var3 = "rvnadlm";
            if (param0 <= 30) {
                field_f = (le[][][]) null;
            }
            var4 = -1L;
            wg.a(var2, param1, var3, -26372, var4);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "nh.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_f = new le[2][5][];
    }
}
