/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

class ph extends dm {
    private long field_i;
    private String field_e;
    static rk field_l;
    static Random field_d;
    static boolean field_k;
    static jd field_g;
    static String field_m;
    static vj field_j;
    static int field_h;
    static km field_f;

    final void a(p param0, byte param1) {
        param0.a(param1 ^ -7, ((ph) this).field_i);
        param0.a(((ph) this).field_e, false);
        if (param1 != 123) {
            field_j = null;
        }
    }

    public static void b(int param0) {
        field_m = null;
        field_f = null;
        field_d = null;
        field_l = null;
        field_g = null;
        if (param0 != 0) {
            return;
        }
        field_j = null;
    }

    ug b(byte param0) {
        if (param0 <= 27) {
            return null;
        }
        return kn.field_H;
    }

    final static boolean a(int param0, byte param1, String param2, long param3, int[] param4) {
        if (param1 == -43) {
          if (param4 != null) {
            if (-3 == (param0 ^ -1)) {
              if (!kn.a(param2, param3, 29712)) {
                return false;
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          field_j = null;
          if (param4 != null) {
            if (-3 == (param0 ^ -1)) {
              if (!kn.a(param2, param3, 29712)) {
                return false;
              } else {
                return true;
              }
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(java.awt.Canvas param0, boolean param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        var4 = Chess.field_G;
        if (param1) {
          if (-11 >= (il.field_a ^ -1)) {
            if (mk.b((byte) 109)) {
              if (rm.field_Q != 0) {
                cg.a(-12, param0);
                return;
              } else {
                cf.a(84, false, param2);
                kf.a(0, (byte) 98, param0, 0);
                return;
              }
            } else {
              wb.b();
              jc.a(240, (byte) -117, 320);
              kf.a(0, (byte) 98, param0, 0);
              return;
            }
          } else {
            L0: {
              var3 = 0;
              if (!od.field_W) {
                break L0;
              } else {
                od.field_W = false;
                var3 = 1;
                break L0;
              }
            }
            wc.a(bb.field_e, var3 != 0, jd.b(false), lf.i(120), false);
            return;
          }
        } else {
          field_m = null;
          if (-11 >= (il.field_a ^ -1)) {
            if (mk.b((byte) 109)) {
              if (rm.field_Q != 0) {
                cg.a(-12, param0);
                return;
              } else {
                cf.a(84, false, param2);
                kf.a(0, (byte) 98, param0, 0);
                return;
              }
            } else {
              wb.b();
              jc.a(240, (byte) -117, 320);
              kf.a(0, (byte) 98, param0, 0);
              return;
            }
          } else {
            L1: {
              var3 = 0;
              if (!od.field_W) {
                break L1;
              } else {
                od.field_W = false;
                var3 = 1;
                break L1;
              }
            }
            wc.a(bb.field_e, var3 != 0, jd.b(false), lf.i(120), false);
            return;
          }
        }
    }

    final static boolean a(byte param0, String param1) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var2 = 0 % ((-40 - param0) / 41);
        if (null == gi.field_g) {
          return false;
        } else {
          L0: {
            if ((param1.toLowerCase().indexOf(gi.field_g.toLowerCase()) ^ -1) > -1) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    ph(long param0, String param1) {
        ((ph) this).field_i = param0;
        ((ph) this).field_e = param1;
    }

    final static void a(int param0) {
        int var2 = 0;
        Object var3 = null;
        var2 = Chess.field_G;
        if (param0 == -7125) {
          if (qk.field_h != 0) {
            if (rn.field_b != 2) {
              nh.field_m = true;
              return;
            } else {
              nh.field_m = false;
              return;
            }
          } else {
            nh.field_m = true;
            return;
          }
        } else {
          var3 = null;
          boolean discarded$4 = ph.a((byte) -38, (String) null);
          if (qk.field_h != 0) {
            if (rn.field_b != 2) {
              nh.field_m = true;
              return;
            } else {
              nh.field_m = false;
              return;
            }
          } else {
            nh.field_m = true;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new Random();
        field_h = 0;
        field_m = "Members";
        field_g = new jd("email");
    }
}
