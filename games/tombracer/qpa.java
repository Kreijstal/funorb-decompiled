/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qpa implements bo {
    private int field_a;
    static jea field_b;
    private int field_c;

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
            field_b = null;
        }
    }

    public final void a(int param0, kh param1) {
        try {
            param1.i(((qpa) this).field_a, param0 + -200);
            if (param0 != 200) {
                ((qpa) this).field_a = -84;
            }
            param1.i(((qpa) this).field_c, 0);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "qpa.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1) {
        ((qpa) this).field_a = param0;
        int var3 = 28 % ((-35 - param1) / 61);
    }

    public final void a(kh param0, byte param1) {
        try {
            ((qpa) this).field_a = param0.h(255);
            if (param1 != -19) {
                qpa.a(false);
            }
            ((qpa) this).field_c = param0.h(255);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "qpa.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1) {
        if (param0 != 7) {
            Object var4 = null;
            ((qpa) this).a((kh) null, (byte) -41);
            ((qpa) this).field_c = param1;
            return;
        }
        ((qpa) this).field_c = param1;
    }

    final static void a(int param0, int[] param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var8 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param5 >= 123) {
                break L1;
              } else {
                qpa.a(true);
                break L1;
              }
            }
            L2: {
              if (param2 != 0) {
                if (1 == param2) {
                  uw.field_g[param2] = (wv) (Object) new se(param2, param6, 440, param0, param3, param1);
                  break L2;
                } else {
                  if (param2 != 2) {
                    if (param2 == 3) {
                      uw.field_g[param2] = (wv) (Object) new pk(param2, param6, 440, param0, param3, param1);
                      break L2;
                    } else {
                      L3: {
                        if (4 == param2) {
                          break L3;
                        } else {
                          if (param2 == 12) {
                            break L3;
                          } else {
                            if (param2 == 5) {
                              uw.field_g[param2] = (wv) (Object) new qp(param2, param6, 440, param0, param3, param1);
                              break L2;
                            } else {
                              if (param2 == 6) {
                                uw.field_g[param2] = (wv) (Object) new vba(param2, param6, 440, param0, param3, param1);
                                break L2;
                              } else {
                                if (param2 != 7) {
                                  if (param2 == 8) {
                                    uw.field_g[param2] = (wv) (Object) new jn(param2, param6, 440, param0, param3, param1);
                                    break L2;
                                  } else {
                                    if (param2 != 9) {
                                      if (param2 == 10) {
                                        uw.field_g[param2] = (wv) (Object) new vv(param2, param6, 440, param0, param3, param1);
                                        break L2;
                                      } else {
                                        if (param2 != 11) {
                                          break L2;
                                        } else {
                                          uw.field_g[param2] = (wv) (Object) new rd(param2, param6, 440, param0, param3, param1);
                                          break L2;
                                        }
                                      }
                                    } else {
                                      uw.field_g[param2] = (wv) (Object) new oka(param2, param6, 440, param0, param3, param1);
                                      break L2;
                                    }
                                  }
                                } else {
                                  uw.field_g[param2] = (wv) (Object) new ow(param2, param6, 440, param0, param3, param1);
                                  break L2;
                                }
                              }
                            }
                          }
                        }
                      }
                      uw.field_g[param2] = (wv) (Object) new epa(param2, param6, 440, param0, param3, param1);
                      break L2;
                    }
                  } else {
                    uw.field_g[param2] = (wv) (Object) new jn(param2, param6, 440, param0, param3, param1);
                    break L2;
                  }
                }
              } else {
                uw.field_g[param2] = (wv) (Object) new sv(param2, param6, 440, param0, param3, param1);
                break L2;
              }
            }
            uw.field_g[param2].field_p = pm.field_h[param2];
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var7 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var7;
            stackOut_30_1 = new StringBuilder().append("qpa.D(").append(param0).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L4;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_33_0, stackIn_33_2 + ',' + param2 + ',' + param3 + ',' + 440 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
    }
}
