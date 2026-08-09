/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg {
    static String field_b;
    static String field_c;
    static String field_a;

    final static String b(int param0) {
        if (!cd.field_j && vl.field_H >= ib.field_d) {
            if (!(kj.field_r + ib.field_d <= vl.field_H)) {
                return nl.field_f;
            }
        }
        if (param0 == 32) {
            return null;
        }
        q var2 = (q) null;
        qg.a((q) null, true);
        return null;
    }

    public static void b(boolean param0) {
        if (param0) {
            q var2 = (q) null;
            qg.a((q) null, false);
        }
        field_b = null;
        field_c = null;
        field_a = null;
    }

    final synchronized static long a(boolean param0) {
        long var1 = System.currentTimeMillis();
        if (we.field_c > var1) {
            pa.field_b = pa.field_b + (we.field_c - var1);
        }
        we.field_c = var1;
        if (param0) {
            field_c = (String) null;
        }
        return pa.field_b + var1;
    }

    final static nj a(String[] args, int param1) {
        nj var2 = null;
        RuntimeException var2_ref = null;
        nj stackIn_2_0 = null;
        nj stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2 = new nj(false);
            var2.field_a = args;
            if (param1 >= 61) {
              stackIn_4_0 = (nj) (var2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nj) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2_ref);

            stackIn_7_1 = new StringBuilder().append("qg.F(");

            if (args == null) {
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
          throw sl.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static void a(int param0) {
        int var1 = 0;
        if (param0 <= 10) {
            qg.a(-17);
        }
        if ((kc.field_b ^ -1) >= -33) {
            qd.a(false, 0);
        } else {
            var1 = kc.field_b % 32;
            if (var1 == 0) {
                var1 = 32;
            }
            qd.a(false, kc.field_b + -var1);
        }
    }

    final static void a(q param0, boolean param1) {
        int var2_int = 0;
        q var3 = null;
        int var4 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            if (param0.field_n != null) {
              if (param1) {
                L1: {
                  L2: {
                    if (-1 != (param0.field_b ^ -1)) {
                      break L2;
                    } else {
                      if (-1 != (param0.field_f ^ -1)) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  var2_int = 0;
                  L3: while (true) {
                    if (var2_int >= rk.field_ab) {
                      break L1;
                    } else {
                      L4: {
                        var3 = rl.field_C[var2_int];
                        if ((var3.field_e ^ -1) != -3) {
                          break L4;
                        } else {
                          if (var3.field_b != param0.field_b) {
                            break L4;
                          } else {
                            if (param0.field_f != var3.field_f) {
                              break L4;
                            } else {
                              decompiledRegionSelector0 = 2;
                              break L0;
                            }
                          }
                        }
                      }
                      var2_int++;
                      continue L3;
                    }
                  }
                }
                L5: {
                  if (null == param0.field_i) {
                    break L5;
                  } else {
                    break L5;
                  }
                }
                nj.a(param0, (byte) 94);
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var2);

            stackIn_21_1 = new StringBuilder().append("qg.C(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L6;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L6;
            }
          }
          throw sl.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    static {
        field_b = "You are not currently logged in to the<nbsp>game.";
        field_a = "?";
    }
}
