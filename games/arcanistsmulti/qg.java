/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg extends RuntimeException {
    static int field_c;
    static dl field_b;
    static String[] field_a;

    final static void a(int param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((rl.field_m ^ -1) != 0) {
                break L1;
              } else {
                if (ln.field_J != -1) {
                  break L1;
                } else {
                  rl.field_m = an.field_g;
                  ln.field_J = me.field_I;
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                jh.field_f = jh.field_f + 1;
                if (param1 != null) {
                  if (!param1.equals(cb.field_c)) {
                    break L3;
                  } else {
                    break L2;
                  }
                } else {
                  if (cb.field_c != null) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!oh.field_i) {
                  if (jh.field_f >= oa.field_e) {
                    if (jh.field_f < qc.field_e + oa.field_e) {
                      stackOut_15_0 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      break L4;
                    } else {
                      stackOut_14_0 = 0;
                      stackIn_17_0 = stackOut_14_0;
                      break L4;
                    }
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_17_0 = stackOut_12_0;
                    break L4;
                  }
                } else {
                  stackOut_10_0 = 0;
                  stackIn_17_0 = stackOut_10_0;
                  break L4;
                }
              }
              L5: {
                var2_int = stackIn_17_0;
                if (param1 == null) {
                  jh.field_f = 0;
                  break L5;
                } else {
                  if (oh.field_i) {
                    jh.field_f = oa.field_e;
                    break L5;
                  } else {
                    if (var2_int == 0) {
                      jh.field_f = 0;
                      break L5;
                    } else {
                      jh.field_f = oa.field_e;
                      break L5;
                    }
                  }
                }
              }
              L6: {
                if (param1 != null) {
                  oh.field_i = false;
                  break L6;
                } else {
                  if (var2_int != 0) {
                    oh.field_i = true;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              mo.field_p = rl.field_m;
              ka.field_p = ln.field_J;
              break L2;
            }
            L7: {
              var2_int = -49 / ((param0 - -45) / 60);
              cb.field_c = param1;
              if (oh.field_i) {
                break L7;
              } else {
                if (oa.field_e <= jh.field_f) {
                  break L7;
                } else {
                  if (tl.field_d) {
                    mo.field_p = rl.field_m;
                    ka.field_p = ln.field_J;
                    jh.field_f = 0;
                    break L7;
                  } else {
                    break L7;
                  }
                }
              }
            }
            L8: {
              rl.field_m = -1;
              ln.field_J = -1;
              if (!oh.field_i) {
                break L8;
              } else {
                if (mk.field_Q == jh.field_f) {
                  jh.field_f = 0;
                  oh.field_i = false;
                  break L8;
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) (var2);
            stackOut_41_1 = new StringBuilder().append("qg.C(").append(param0).append(',');
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param1 == null) {
              stackOut_43_0 = (RuntimeException) ((Object) stackIn_43_0);
              stackOut_43_1 = (StringBuilder) ((Object) stackIn_43_1);
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L9;
            } else {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L9;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_44_0), stackIn_44_2 + ')');
        }
    }

    public static void b(int param0) {
        if (param0 <= 49) {
            return;
        }
        field_b = null;
        field_a = null;
    }

    qg() {
    }

    final static boolean a(int param0) {
        if (param0 > -61) {
            return true;
        }
        return (mj.field_p ^ -1) != 0 ? true : false;
    }

    static {
        field_c = -1;
        field_a = new String[16];
    }
}
