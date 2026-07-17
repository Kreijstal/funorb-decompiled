/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class uh {
    static String field_b;
    static int[] field_e;
    static String field_f;
    static int[] field_d;
    static int field_c;
    static int field_a;

    final static boolean a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_36_0 = 0;
        if (!param2) {
          if (td.field_c[param1] >= td.field_c[param0]) {
            if (td.field_c[param1] > td.field_c[param0]) {
              return false;
            } else {
              if (ug.field_I[param0] <= ug.field_I[param1]) {
                if (ug.field_I[param0] >= ug.field_I[param1]) {
                  var4 = sk.field_B[param1] + tf.field_c[param1] + mk.field_c[param1];
                  var5 = tf.field_c[param0] + (sk.field_B[param0] - -mk.field_c[param0]);
                  if (var5 <= var4) {
                    if (var4 > var5) {
                      return false;
                    } else {
                      L0: {
                        if (param0 <= param1) {
                          stackOut_37_0 = 0;
                          stackIn_38_0 = stackOut_37_0;
                          break L0;
                        } else {
                          stackOut_36_0 = 1;
                          stackIn_38_0 = stackOut_36_0;
                          break L0;
                        }
                      }
                      return stackIn_38_0 != 0;
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
          } else {
            return true;
          }
        } else {
          if (ug.field_I[param1] < ug.field_I[param0]) {
            return true;
          } else {
            if (ug.field_I[param0] >= ug.field_I[param1]) {
              if (td.field_c[param0] > td.field_c[param1]) {
                return true;
              } else {
                if (td.field_c[param0] >= td.field_c[param1]) {
                  var4 = sk.field_B[param1] + tf.field_c[param1] + mk.field_c[param1];
                  var5 = tf.field_c[param0] + (sk.field_B[param0] - -mk.field_c[param0]);
                  if (var5 <= var4) {
                    if (var4 > var5) {
                      return false;
                    } else {
                      if (param0 <= param1) {
                        return false;
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
              }
            } else {
              return false;
            }
          }
        }
    }

    abstract sd a(boolean param0);

    final static void a(byte param0) {
        u.field_A.d(false);
        if (!(ea.field_e != null)) {
            ea.field_e = new hk(u.field_A, bh.field_a);
        }
        u.field_A.b((ub) (Object) ea.field_e, (byte) 73);
        int var1 = -118 % ((76 - param0) / 49);
    }

    abstract void a(int param0, va param1);

    public static void a(int param0) {
        field_d = null;
        if (param0 != 8192) {
          uh.a(-86);
          field_e = null;
          field_b = null;
          field_f = null;
          return;
        } else {
          field_e = null;
          field_b = null;
          field_f = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new int[8192];
        field_d = new int[4];
        field_b = "WORLD SELECT";
        field_f = "Connection lost - attempting to reconnect";
        field_a = 0;
    }
}
