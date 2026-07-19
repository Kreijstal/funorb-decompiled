/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sc {
    static boolean field_a;
    static String field_c;
    static String field_b;
    static String[] field_d;

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    public static void a(byte param0) {
        field_b = null;
        field_c = null;
        field_d = null;
        int var1 = 88 / ((-23 - param0) / 44);
    }

    final static void a(int param0, hi param1, int param2) {
        ih var5 = null;
        int var4 = 0;
        int discarded$0 = 0;
        try {
            var5 = ud.field_b;
            var5.e(param2 + 7, param0);
            var5.field_i = var5.field_i + 1;
            var4 = var5.field_i;
            var5.a(param2 ^ -12, param2);
            var5.a(-11, param1.field_j);
            var5.a(param2 + -12, param1.field_m);
            var5.a(param1.field_o, (byte) -46);
            var5.a(param1.field_i, (byte) -82);
            var5.a(param1.field_l, (byte) -67);
            var5.a(param1.field_n, (byte) -42);
            discarded$0 = var5.c(var4, param2 + -30533);
            var5.c((byte) -81, var5.field_i - var4);
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) ((Object) runtimeException), "sc.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        Object var1_ref = null;
        int var2 = 0;
        Throwable var3 = null;
        int var4 = 0;
        int stackIn_5_0 = 0;
        int stackIn_17_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_16_0 = 0;
        var4 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            var1_ref = rh.field_f;
            synchronized (var1_ref) {
              L1: {
                L2: {
                  L3: {
                    L4: {
                      L5: {
                        tl.field_o = tc.field_h;
                        lg.field_d = lg.field_d + 1;
                        if ((em.field_f ^ -1) > param0) {
                          break L5;
                        } else {
                          L6: while (true) {
                            if (em.field_f == sd.field_a) {
                              break L4;
                            } else {
                              var2 = qk.field_b[sd.field_a];
                              sd.field_a = 127 & 1 + sd.field_a;
                              stackOut_4_0 = 0;
                              stackIn_17_0 = stackOut_4_0;
                              stackIn_5_0 = stackOut_4_0;
                              if (var4 != 0) {
                                break L3;
                              } else {
                                L7: {
                                  L8: {
                                    if (stackIn_5_0 <= var2) {
                                      break L8;
                                    } else {
                                      ei.field_H[var2 ^ -1] = false;
                                      if (var4 == 0) {
                                        break L7;
                                      } else {
                                        break L8;
                                      }
                                    }
                                  }
                                  ei.field_H[var2] = true;
                                  break L7;
                                }
                                if (var4 == 0) {
                                  continue L6;
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        }
                      }
                      var2 = 0;
                      L9: while (true) {
                        L10: {
                          if (-113 >= (var2 ^ -1)) {
                            break L10;
                          } else {
                            ei.field_H[var2] = false;
                            var2++;
                            if (var4 != 0) {
                              break L2;
                            } else {
                              if (var4 == 0) {
                                continue L9;
                              } else {
                                break L10;
                              }
                            }
                          }
                        }
                        em.field_f = sd.field_a;
                        break L4;
                      }
                    }
                    stackOut_16_0 = ak.field_e;
                    stackIn_17_0 = stackOut_16_0;
                    break L3;
                  }
                  tc.field_h = stackIn_17_0;
                  break L2;
                }
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (RuntimeException) (Object) decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var1), "sc.A(" + param0 + ')');
        }
    }

    static {
        field_a = true;
        field_b = "Create a free account to start using this feature";
        field_c = "Loading levels";
        field_d = new String[16];
    }
}
