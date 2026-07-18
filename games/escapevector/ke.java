/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ke {
    static volatile boolean field_a;
    static int field_b;
    static wl field_c;

    final static void a(wl param0, int param1, int param2, wl param3) {
        try {
            nb.field_a = param0;
            sb.field_h = 480;
            pb.field_e = param3;
            rk.a(em.field_d / 2, em.field_l / 2, 11710);
            mm.a(99, param0.field_x + param0.field_N, param3.field_N, param0.field_N, param3.field_N - -param3.field_x);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "ke.B(" + (param0 != null ? "{...}" : "null") + ',' + 2 + ',' + 480 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a() {
        field_c = null;
    }

    final static boolean a(int param0, int param1, int param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        if (param3) {
          if (fl.field_k[param2] <= fl.field_k[param0]) {
            if (fl.field_k[param0] <= fl.field_k[param2]) {
              if (th.field_v[param2] <= th.field_v[param0]) {
                if (th.field_v[param2] >= th.field_v[param0]) {
                  var4 = tm.field_fb[param0] + (pc.field_c[param0] - -mi.field_k[param0]);
                  var5 = pc.field_c[param2] - (-mi.field_k[param2] + -tm.field_fb[param2]);
                  if (var4 < var5) {
                    return true;
                  } else {
                    if (var4 > var5) {
                      return false;
                    } else {
                      if (param0 >= param2) {
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
        } else {
          if (th.field_v[param0] >= th.field_v[param2]) {
            if (th.field_v[param2] >= th.field_v[param0]) {
              if (fl.field_k[param0] >= fl.field_k[param2]) {
                if (fl.field_k[param0] <= fl.field_k[param2]) {
                  var4 = tm.field_fb[param0] + (pc.field_c[param0] - -mi.field_k[param0]);
                  var5 = pc.field_c[param2] - (-mi.field_k[param2] + -tm.field_fb[param2]);
                  if (var4 < var5) {
                    return true;
                  } else {
                    if (var4 > var5) {
                      return false;
                    } else {
                      L0: {
                        if (param0 >= param2) {
                          stackOut_35_0 = 0;
                          stackIn_36_0 = stackOut_35_0;
                          break L0;
                        } else {
                          stackOut_34_0 = 1;
                          stackIn_36_0 = stackOut_34_0;
                          break L0;
                        }
                      }
                      return stackIn_36_0 != 0;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
    }
}
