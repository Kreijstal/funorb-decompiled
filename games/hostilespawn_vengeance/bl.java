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

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_e = null;
        int var1 = 67 % ((47 - param0) / 46);
    }

    final static void a(int param0, ne param1, int param2) {
        en var5 = null;
        int var4 = 0;
        try {
            var5 = s.field_b;
            var5.i(19319, param2);
            var5.field_i = var5.field_i + 1;
            var4 = var5.field_i;
            var5.d(105, param0);
            var5.d(96, param1.field_i);
            var5.c(-97, param1.field_m);
            var5.b(param1.field_r, 25251);
            var5.b(param1.field_l, param0 ^ 25250);
            var5.b(param1.field_k, 25251);
            var5.b(param1.field_h, 25251);
            var5.f(var4, param0 + -70);
            var5.a(-var4 + var5.field_i, -19720);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "bl.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(int param0, boolean param1, byte param2, int param3) {
        int stackIn_28_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_52_0 = 0;
        int var4;
        int var5;
        ne var6;
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
                    if (param2 != -72) {
                      var6 = (ne) null;
                      bl.a(-109, (ne) null, 30);
                      if (var5 >= var4) {
                        if (param0 >= param3) {
                          return false;
                        } else {
                          return true;
                        }
                      } else {
                        return false;
                      }
                    } else {
                      if (var5 < var4) {
                        return false;
                      } else {
                        L0: {
                          if (param0 >= param3) {
                            stackIn_28_0 = 0;
                            break L0;
                          } else {
                            stackIn_28_0 = 1;
                            break L0;
                          }
                        }
                        return stackIn_28_0 != 0;
                      }
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
                    if (param2 == -72) {
                      if (var5 < var4) {
                        return false;
                      } else {
                        L1: {
                          if (param0 >= param3) {
                            stackIn_52_0 = 0;
                            break L1;
                          } else {
                            stackIn_52_0 = 1;
                            break L1;
                          }
                        }
                        return stackIn_52_0 != 0;
                      }
                    } else {
                      var6 = (ne) null;
                      bl.a(-109, (ne) null, 30);
                      if (var5 < var4) {
                        return false;
                      } else {
                        L2: {
                          if (param0 >= param3) {
                            stackIn_45_0 = 0;
                            break L2;
                          } else {
                            stackIn_45_0 = 1;
                            break L2;
                          }
                        }
                        return stackIn_45_0 != 0;
                      }
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
        this.field_a = param0;
    }

    static {
        field_e = "Enter mission briefing";
        field_d = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
        field_b = 0;
    }
}
