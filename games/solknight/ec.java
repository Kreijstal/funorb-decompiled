/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ec extends gg {
    static String field_j;
    long field_l;
    static int field_h;
    ec field_k;
    ec field_i;

    final static aj b(boolean param0) {
        if (null == ji.field_b) {
            ji.field_b = new aj();
            ji.field_b.a(87, ua.field_G);
            ji.field_b.field_n = 2763306;
            ji.field_b.field_f = 14;
            ji.field_b.field_b = 7697781;
            ji.field_b.field_d = 5;
            ji.field_b.field_e = 0;
            ji.field_b.field_j = 6;
            ji.field_b.field_q = 4;
            ji.field_b.field_k = jh.field_g;
        }
        return ji.field_b;
    }

    final void a(int param0) {
        if (param0 != 97) {
            ((ec) this).field_l = 11L;
        }
        if (!(null != ((ec) this).field_k)) {
            return;
        }
        ((ec) this).field_k.field_i = ((ec) this).field_i;
        ((ec) this).field_i.field_k = ((ec) this).field_k;
        ((ec) this).field_i = null;
        ((ec) this).field_k = null;
    }

    final static boolean a(char param0, boolean param1) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          L1: {
            L2: {
              if (param0 < 65) {
                break L2;
              } else {
                if (param0 <= 90) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (97 > param0) {
                break L3;
              } else {
                if (param0 > 122) {
                  break L3;
                } else {
                  break L1;
                }
              }
            }
            stackOut_7_0 = 0;
            stackIn_8_0 = stackOut_7_0;
            break L0;
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L0;
        }
        return stackIn_8_0 != 0;
    }

    final static boolean a(int param0, int param1, boolean param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        L0: {
          if (param2) {
            if (qg.field_c[param0] < qg.field_c[param3]) {
              return true;
            } else {
              if (qg.field_c[param3] >= qg.field_c[param0]) {
                if (l.field_a[param0] < l.field_a[param3]) {
                  return true;
                } else {
                  if (l.field_a[param3] < l.field_a[param0]) {
                    return false;
                  } else {
                    break L0;
                  }
                }
              } else {
                return false;
              }
            }
          } else {
            if (l.field_a[param0] < l.field_a[param3]) {
              return true;
            } else {
              if (l.field_a[param0] > l.field_a[param3]) {
                return false;
              } else {
                if (qg.field_c[param0] < qg.field_c[param3]) {
                  return true;
                } else {
                  if (qg.field_c[param3] >= qg.field_c[param0]) {
                    break L0;
                  } else {
                    return false;
                  }
                }
              }
            }
          }
        }
        var4 = eh.field_a[param0] - -ld.field_M[param0] + ma.field_n[param0];
        var5 = eh.field_a[param3] - -ld.field_M[param3] - -ma.field_n[param3];
        if (var4 >= var5) {
          if (var4 > var5) {
            return false;
          } else {
            L1: {
              if (param0 >= param3) {
                stackOut_30_0 = 0;
                stackIn_31_0 = stackOut_30_0;
                break L1;
              } else {
                stackOut_29_0 = 1;
                stackIn_31_0 = stackOut_29_0;
                break L1;
              }
            }
            return stackIn_31_0 != 0;
          }
        } else {
          return true;
        }
    }

    final static boolean e(int param0) {
        di var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        di var4 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_2_0 = 0;
        var3 = SolKnight.field_L ? 1 : 0;
        try {
          L0: {
            var4 = (di) (Object) ga.field_E.a((byte) 51);
            var1 = var4;
            if (var1 != null) {
              var2 = 0;
              if (param0 == 7697781) {
                L1: while (true) {
                  if (var2 >= var1.field_h) {
                    stackOut_19_0 = 1;
                    stackIn_20_0 = stackOut_19_0;
                    break L0;
                  } else {
                    L2: {
                      if (null != var4.field_k[var2]) {
                        if (var4.field_k[var2].field_c != 0) {
                          break L2;
                        } else {
                          stackOut_11_0 = 0;
                          stackIn_12_0 = stackOut_11_0;
                          return stackIn_12_0 != 0;
                        }
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      if (var4.field_s[var2] != null) {
                        if (var4.field_s[var2].field_c != 0) {
                          break L3;
                        } else {
                          stackOut_16_0 = 0;
                          stackIn_17_0 = stackOut_16_0;
                          return stackIn_17_0 != 0;
                        }
                      } else {
                        break L3;
                      }
                    }
                    var2++;
                    continue L1;
                  }
                }
              } else {
                stackOut_5_0 = 1;
                stackIn_6_0 = stackOut_5_0;
                return stackIn_6_0 != 0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fc.a((Throwable) (Object) var1_ref, "ec.DA(" + param0 + ')');
        }
        return stackIn_20_0 != 0;
    }

    final static boolean a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_0_0 = false;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            int discarded$2 = 10;
            stackOut_0_0 = wi.a(-913, true, param1);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("ec.IA(").append(30418).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw fc.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    protected ec() {
    }

    public static void d(int param0) {
        field_j = null;
    }

    static {
    }
}
