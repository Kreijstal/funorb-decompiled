/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn {
    static um field_c;
    static String field_b;
    static w field_a;

    final static void a(int param0, ui param1, boolean param2) {
        Object var3 = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (param2) {
            break L0;
          } else {
            field_c = null;
            break L0;
          }
        }
        var3 = (Object) (Object) km.field_z;
        synchronized (var3) {
          L1: {
            L2: {
              if (null != wj.field_Ob) {
                sh.field_a.c((rh) (Object) wj.field_Ob);
                wj.field_Ob = null;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param1 != null) {
                wj.field_Ob = new ia(param1);
                wj.field_Ob.a(a.field_g * 50 / 128);
                wj.field_Ob.c(param0);
                sh.field_a.a((rh) (Object) wj.field_Ob);
                break L3;
              } else {
                break L3;
              }
            }
            km.field_z.a();
            rc.field_d = param1;
            break L1;
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        if (param0 != 14925) {
            nn.a(-43);
        }
    }

    final static boolean a(boolean param0, String param1, String param2) {
        String var3 = null;
        int stackIn_12_0 = 0;
        int stackIn_28_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_10_0 = 0;
        var3 = oa.a(param1, -1);
        if (!param0) {
          if (param2.indexOf(param1) == -1) {
            if (-1 == param2.indexOf(var3)) {
              if (!param2.startsWith(param1)) {
                if (!param2.startsWith(var3)) {
                  if (!param2.endsWith(param1)) {
                    if (param2.endsWith(var3)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_26_0 = 1;
                    stackIn_28_0 = stackOut_26_0;
                    return stackIn_28_0 != 0;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          field_c = null;
          if (param2.indexOf(param1) == -1) {
            if (-1 == param2.indexOf(var3)) {
              if (!param2.startsWith(param1)) {
                if (!param2.startsWith(var3)) {
                  if (!param2.endsWith(param1)) {
                    if (param2.endsWith(var3)) {
                      return true;
                    } else {
                      return false;
                    }
                  } else {
                    stackOut_10_0 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    return stackIn_12_0 != 0;
                  }
                } else {
                  return true;
                }
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new um();
        field_b = "Please remove <%0> from your friend list first.";
    }
}
