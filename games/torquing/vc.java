/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vc {
    static kh[] field_c;
    static int[] field_a;
    static t field_b;
    static int field_d;

    abstract int b(int param0);

    final static void a(t param0, boolean param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          kj.field_b = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("vc.E(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L0;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 0 + 41);
        }
    }

    final static boolean a(boolean param0, int param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_20_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        if (!param0) {
          if (ji.field_a[param1] > ji.field_a[param3]) {
            return true;
          } else {
            if (ji.field_a[param1] >= ji.field_a[param3]) {
              if (il.field_o[param3] >= il.field_o[param1]) {
                if (il.field_o[param1] >= il.field_o[param3]) {
                  var4 = vp.field_F[param3] + vo.field_d[param3] + wh.field_y[param3];
                  var5 = wh.field_y[param1] + vo.field_d[param1] - -vp.field_F[param1];
                  if (var5 > var4) {
                    return true;
                  } else {
                    if (var4 <= var5) {
                      if (param2 == 0) {
                        L0: {
                          if (param3 >= param1) {
                            stackOut_46_0 = 0;
                            stackIn_47_0 = stackOut_46_0;
                            break L0;
                          } else {
                            stackOut_45_0 = 1;
                            stackIn_47_0 = stackOut_45_0;
                            break L0;
                          }
                        }
                        return stackIn_47_0 != 0;
                      } else {
                        L1: {
                          field_b = null;
                          if (param3 >= param1) {
                            stackOut_42_0 = 0;
                            stackIn_43_0 = stackOut_42_0;
                            break L1;
                          } else {
                            stackOut_41_0 = 1;
                            stackIn_43_0 = stackOut_41_0;
                            break L1;
                          }
                        }
                        return stackIn_43_0 != 0;
                      }
                    } else {
                      return false;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          if (il.field_o[param1] <= il.field_o[param3]) {
            if (il.field_o[param3] <= il.field_o[param1]) {
              if (ji.field_a[param1] > ji.field_a[param3]) {
                return true;
              } else {
                if (ji.field_a[param1] >= ji.field_a[param3]) {
                  var4 = vp.field_F[param3] + vo.field_d[param3] + wh.field_y[param3];
                  var5 = wh.field_y[param1] + vo.field_d[param1] - -vp.field_F[param1];
                  if (var5 > var4) {
                    return true;
                  } else {
                    if (var4 <= var5) {
                      if (param2 != 0) {
                        field_b = null;
                        if (param3 >= param1) {
                          return false;
                        } else {
                          return true;
                        }
                      } else {
                        L2: {
                          if (param3 >= param1) {
                            stackOut_19_0 = 0;
                            stackIn_20_0 = stackOut_19_0;
                            break L2;
                          } else {
                            stackOut_18_0 = 1;
                            stackIn_20_0 = stackOut_18_0;
                            break L2;
                          }
                        }
                        return stackIn_20_0 != 0;
                      }
                    } else {
                      return false;
                    }
                  }
                } else {
                  return false;
                }
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static k[] c(int param0) {
        return new k[]{fh.field_t, np.field_k, cc.field_a, jp.field_p, eo.field_b, mc.field_k, gp.field_L, lb.field_z, da.field_d, qk.field_r, ag.field_a, aq.field_a, ip.field_a, qd.field_f};
    }

    abstract void a(byte param0, java.awt.Component param1);

    abstract void a(int param0, java.awt.Component param1);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
    }
}
