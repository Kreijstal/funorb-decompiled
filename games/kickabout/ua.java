/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ua extends mo {
    static long field_g;
    int field_n;
    static String field_h;
    int[] field_j;
    static String field_i;
    static hd field_k;
    static String field_f;
    int field_m;
    static int field_l;

    final void a(ml param0, byte param1) {
        if (!(mu.a(param0, (byte) -39))) {
            return;
        }
        ((ua) this).field_j[0] = hq.a(22531, 7, param0, 0);
        ((ua) this).field_j[1] = hq.a(22531, 7, param0, 0);
        ((ua) this).field_m = hq.a(22531, 10, param0, 0);
        int var3 = -57 % ((25 - param1) / 63);
        ((ua) this).field_n = -1 + param0.l(2, 59);
    }

    final void a(tj param0, int param1) {
        int var4 = 0;
        var4 = Kickabout.field_G;
        if (param1 <= -116) {
          if (((ua) this).field_m >= -1) {
            if (0 == param0.field_m) {
              if (-371 >= (param0.a(true) ^ -1)) {
                if (param0.a(true) <= 525) {
                  if ((param0.field_p ^ -1) <= -1) {
                    if (param0.field_p <= 88080384) {
                      return;
                    } else {
                      ((ua) this).field_m = 1;
                      ((ua) this).field_n = 1;
                      return;
                    }
                  } else {
                    ((ua) this).field_m = 1;
                    ((ua) this).field_n = 0;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            ((ua) this).field_m = ((ua) this).field_m + 1;
            return;
          }
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_h = null;
        field_i = null;
        if (param0 != -30) {
          ua.a((byte) 106);
          field_k = null;
          field_f = null;
          return;
        } else {
          field_k = null;
          field_f = null;
          return;
        }
    }

    public final String toString() {
        return "AgentGoalState\tscore=[" + ((ua) this).field_j[0] + "," + ((ua) this).field_j[1] + "]\tgoal_count=" + ((ua) this).field_m + "\tgoal_scorer=" + ((ua) this).field_n;
    }

    final static kg[] a(int param0, int param1, sj param2, boolean param3) {
        if (cu.a(param1, param2, param0, 114)) {
          if (param3) {
            field_h = null;
            return fb.i((byte) 83);
          } else {
            return fb.i((byte) 83);
          }
        } else {
          return null;
        }
    }

    final void a(byte param0, mo param1) {
        ua var3 = null;
        ua var4 = null;
        if (param0 >= -52) {
          return;
        } else {
          var4 = (ua) (Object) param1;
          var3 = var4;
          ((ua) this).field_m = var3.field_m;
          var4.field_j[0] = var4.field_j[0];
          ((ua) this).field_n = var3.field_n;
          var4.field_j[1] = var4.field_j[1];
          return;
        }
    }

    final int c(int param0) {
        int var2 = 0;
        var2 = fj.a(-40, ((ua) this).field_j[param0] ^ var2);
        var2 = fj.a(-40, ((ua) this).field_j[1] ^ var2);
        var2 = fj.a(-40, var2 ^ ((ua) this).field_m);
        var2 = fj.a(-40, var2 ^ ((ua) this).field_n);
        return var2;
    }

    public ua() {
        ((ua) this).field_j = new int[2];
        ((ua) this).field_m = 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Passwords can only contain letters and numbers";
        field_i = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_f = "Player Name: ";
    }
}
