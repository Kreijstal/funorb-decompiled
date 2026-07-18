/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl {
    static bd field_c;
    static String field_e;
    int field_a;
    static int field_b;
    static float field_f;
    static String field_d;

    public static void a() {
        field_d = null;
        field_c = null;
        field_e = null;
        int var1 = 0;
    }

    final static void a(int param0, ne param1, int param2) {
        en var5 = null;
        int var4 = 0;
        try {
            var5 = s.field_b;
            var5.i(19319, param2);
            var5.field_i = var5.field_i + 1;
            var4 = var5.field_i;
            var5.d(105, 1);
            var5.d(96, param1.field_i);
            var5.c(-97, param1.field_m);
            var5.b(param1.field_r, 25251);
            var5.b(param1.field_l, 25251);
            var5.b(param1.field_k, 25251);
            var5.b(param1.field_h, 25251);
            int discarded$0 = var5.f(var4, -69);
            var5.a(-var4 + var5.field_i, -19720);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) (Object) runtimeException, "bl.B(" + 1 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(int param0, boolean param1, byte param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_36_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        if (!param1) {
          if (hi.field_n[param0] >= hi.field_n[param3]) {
            if (hi.field_n[param0] > hi.field_n[param3]) {
              return false;
            } else {
              if (qa.field_d[param3] > qa.field_d[param0]) {
                return true;
              } else {
                if (qa.field_d[param3] >= qa.field_d[param0]) {
                  var4 = db.field_t[param0] + og.field_b[param0] + ta.field_mb[param0];
                  var5 = db.field_t[param3] + (og.field_b[param3] + ta.field_mb[param3]);
                  if (var4 < var5) {
                    return true;
                  } else {
                    if (var5 >= var4) {
                      if (param0 >= param3) {
                        return false;
                      } else {
                        return true;
                      }
                    } else {
                      return false;
                    }
                  }
                } else {
                  return false;
                }
              }
            }
          } else {
            return true;
          }
        } else {
          if (qa.field_d[param0] >= qa.field_d[param3]) {
            if (qa.field_d[param3] < qa.field_d[param0]) {
              return false;
            } else {
              if (hi.field_n[param3] <= hi.field_n[param0]) {
                if (hi.field_n[param3] >= hi.field_n[param0]) {
                  var4 = db.field_t[param0] + og.field_b[param0] + ta.field_mb[param0];
                  var5 = db.field_t[param3] + (og.field_b[param3] + ta.field_mb[param3]);
                  if (var4 < var5) {
                    return true;
                  } else {
                    if (var5 < var4) {
                      return false;
                    } else {
                      L0: {
                        if (param0 >= param3) {
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
            }
          } else {
            return true;
          }
        }
    }

    bl(int param0) {
        ((bl) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "Enter mission briefing";
        field_d = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_b = 0;
    }
}
