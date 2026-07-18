/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aq extends oh {
    static String field_k;
    static bi field_i;
    static String field_n;
    int field_l;
    int field_m;
    static boolean[] field_p;
    static qr field_j;
    static int[] field_o;
    static double field_h;

    final static boolean a(int param0, boolean param1, int param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_37_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_35_0 = 0;
        if (!param3) {
          if (dc.field_c[param0] <= dc.field_c[param2]) {
            if (dc.field_c[param0] < dc.field_c[param2]) {
              return false;
            } else {
              if (kf.field_f[param0] <= kf.field_f[param2]) {
                if (kf.field_f[param2] <= kf.field_f[param0]) {
                  var4 = aj.field_d[param2] + fb.field_zb[param2] + f.field_y[param2];
                  var5 = f.field_y[param0] + fb.field_zb[param0] - -aj.field_d[param0];
                  if (var4 < var5) {
                    return true;
                  } else {
                    if (var5 < var4) {
                      return false;
                    } else {
                      L0: {
                        if (param0 <= param2) {
                          stackOut_36_0 = 0;
                          stackIn_37_0 = stackOut_36_0;
                          break L0;
                        } else {
                          stackOut_35_0 = 1;
                          stackIn_37_0 = stackOut_35_0;
                          break L0;
                        }
                      }
                      return stackIn_37_0 != 0;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return true;
              }
            }
          } else {
            return true;
          }
        } else {
          if (kf.field_f[param0] <= kf.field_f[param2]) {
            if (kf.field_f[param2] <= kf.field_f[param0]) {
              if (dc.field_c[param2] >= dc.field_c[param0]) {
                if (dc.field_c[param2] <= dc.field_c[param0]) {
                  var4 = aj.field_d[param2] + fb.field_zb[param2] + f.field_y[param2];
                  var5 = f.field_y[param0] + fb.field_zb[param0] - -aj.field_d[param0];
                  if (var4 < var5) {
                    return true;
                  } else {
                    if (var5 < var4) {
                      return false;
                    } else {
                      if (param0 <= param2) {
                        return false;
                      } else {
                        return true;
                      }
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
          } else {
            return true;
          }
        }
    }

    public static void a(byte param0) {
        field_j = null;
        field_i = null;
        field_o = null;
        field_n = null;
        field_p = null;
        field_k = null;
    }

    final static boolean a(int param0) {
        return np.field_m;
    }

    final static void a(byte param0, bi param1) {
        try {
            int var2_int = -121 % ((29 - param0) / 51);
            wh.a(false);
            gf.a(param1.field_B, param1.field_o, param1.field_p);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "aq.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static gq a(int param0, int param1) {
        gq[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        gq[] var5 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        var5 = dn.a(4);
        var2 = var5;
        var3 = 0;
        L0: while (true) {
          if (var5.length > var3) {
            if (var5[var3].field_c == param0) {
              return var5[var3];
            } else {
              var3++;
              continue L0;
            }
          } else {
            return null;
          }
        }
    }

    private aq() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "When ready, press <col=2F5FBF>'ENTER'</col> to continue.";
        field_n = "this resource.";
        field_h = 0.0;
        field_o = new int[8192];
    }
}
