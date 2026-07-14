/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he {
    static String field_a;
    static volatile boolean field_c;
    static di field_b;
    static String[] field_d;

    final static void a(java.awt.Canvas param0, int param1) {
        em.a((java.awt.Component) (Object) param0, (byte) -39);
        hj.a((java.awt.Component) (Object) param0, false);
        if (param1 != 0) {
            return;
        }
        if (!(oa.field_a == null)) {
            oa.field_a.a((java.awt.Component) (Object) param0, 84);
        }
    }

    final static boolean a(int param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        int stackIn_20_0 = 0;
        int stackIn_39_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        L0: {
          if (param3 == 0) {
            break L0;
          } else {
            var6 = null;
            he.a((java.awt.Canvas) null, -1);
            break L0;
          }
        }
        if (param1) {
          if (kb.field_g[param2] <= kb.field_g[param0]) {
            if (kb.field_g[param2] >= kb.field_g[param0]) {
              if (ah.field_c[param2] <= ah.field_c[param0]) {
                if (ah.field_c[param2] < ah.field_c[param0]) {
                  return false;
                } else {
                  var4 = gd.field_d[param0] + (ob.field_y[param0] + om.field_s[param0]);
                  var5 = gd.field_d[param2] + (ob.field_y[param2] + om.field_s[param2]);
                  if (var5 <= var4) {
                    if (var4 > var5) {
                      return false;
                    } else {
                      L1: {
                        if (param0 >= param2) {
                          stackOut_38_0 = 0;
                          stackIn_39_0 = stackOut_38_0;
                          break L1;
                        } else {
                          stackOut_37_0 = 1;
                          stackIn_39_0 = stackOut_37_0;
                          break L1;
                        }
                      }
                      return stackIn_39_0 != 0;
                    }
                  } else {
                    return true;
                  }
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
        } else {
          if (ah.field_c[param0] < ah.field_c[param2]) {
            return true;
          } else {
            if (ah.field_c[param2] >= ah.field_c[param0]) {
              if (kb.field_g[param2] <= kb.field_g[param0]) {
                if (kb.field_g[param2] >= kb.field_g[param0]) {
                  var4 = gd.field_d[param0] + (ob.field_y[param0] + om.field_s[param0]);
                  var5 = gd.field_d[param2] + (ob.field_y[param2] + om.field_s[param2]);
                  if (var5 <= var4) {
                    if (var4 > var5) {
                      return false;
                    } else {
                      L2: {
                        if (param0 >= param2) {
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
                    return true;
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
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_d = null;
        field_a = null;
        field_b = null;
        if (param0 != -13) {
            field_c = false;
        }
    }

    final static boolean a(char param0, CharSequence param1, int param2) {
        int var3 = 0;
        if (!ul.a(param0, (byte) 125)) {
          return false;
        } else {
          if (param1 == null) {
            return false;
          } else {
            if (param2 == 15692) {
              var3 = param1.length();
              if (-13 >= (var3 ^ -1)) {
                return false;
              } else {
                if (qd.a(0, param0)) {
                  if (0 == var3) {
                    return false;
                  } else {
                    return true;
                  }
                } else {
                  return true;
                }
              }
            } else {
              he.a(-56);
              var3 = param1.length();
              if (-13 >= (var3 ^ -1)) {
                return false;
              } else {
                if (qd.a(0, param0)) {
                  if (0 != var3) {
                    return true;
                  } else {
                    return false;
                  }
                } else {
                  return true;
                }
              }
            }
          }
        }
    }

    final static an a(di param0, String param1, int param2, di param3, String param4) {
        int var5 = param0.b(param4, -1);
        int var6 = param0.a(var5, param2, param1);
        return wc.a(param0, 43, var5, param3, var6);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = true;
        field_a = "This game option is not available in rated games.";
        field_d = new String[]{"Terrible!", "Awful!", "Egad!"};
    }
}
