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
        try {
            kj.field_b = param0;
            if (param1) {
                field_a = (int[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw rb.a((Throwable) ((Object) runtimeException), "vc.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(boolean param0, int param1, int param2, int param3) {
        int stackIn_20_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_47_0 = 0;
        int var4;
        int var5;
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
                            stackIn_47_0 = 0;
                            break L0;
                          } else {
                            stackIn_47_0 = 1;
                            break L0;
                          }
                        }
                        return stackIn_47_0 != 0;
                      } else {
                        L1: {
                          field_b = (t) null;
                          if (param3 >= param1) {
                            stackIn_43_0 = 0;
                            break L1;
                          } else {
                            stackIn_43_0 = 1;
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
                        field_b = (t) null;
                        if (param3 >= param1) {
                          return false;
                        } else {
                          return true;
                        }
                      } else {
                        L2: {
                          if (param3 >= param1) {
                            stackIn_20_0 = 0;
                            break L2;
                          } else {
                            stackIn_20_0 = 1;
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
        if (param0 != 0) {
            return;
        }
        field_c = null;
    }

    final static k[] c(int param0) {
        if (param0 != 0) {
          field_d = -64;
          return new k[]{fh.field_t, np.field_k, cc.field_a, jp.field_p, eo.field_b, mc.field_k, gp.field_L, lb.field_z, da.field_d, qk.field_r, ag.field_a, aq.field_a, ip.field_a, qd.field_f};
        } else {
          return new k[]{fh.field_t, np.field_k, cc.field_a, jp.field_p, eo.field_b, mc.field_k, gp.field_L, lb.field_z, da.field_d, qk.field_r, ag.field_a, aq.field_a, ip.field_a, qd.field_f};
        }
    }

    abstract void a(byte param0, java.awt.Component param1);

    abstract void a(int param0, java.awt.Component param1);

    static {
        field_d = 0;
    }
}
