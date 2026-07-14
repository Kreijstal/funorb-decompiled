/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class wh implements Iterator {
    static hm field_b;
    private hb field_c;
    static String field_j;
    private kd field_f;
    static String field_a;
    static gh field_e;
    static String field_h;
    static String field_i;
    private kd field_g;
    static int field_d;

    final static void a(boolean param0) {
        int var1 = 0;
        if (null != g.field_c) {
          L0: {
            if (!g.field_c.g()) {
              break L0;
            } else {
              L1: {
                g.field_c = null;
                var1 = ll.field_q * 2;
                if (256 >= var1) {
                  break L1;
                } else {
                  var1 = 256;
                  break L1;
                }
              }
              ef.a(1, var1);
              break L0;
            }
          }
          if (param0) {
            field_i = null;
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    public final boolean hasNext() {
        return ((wh) this).field_c.field_a != ((wh) this).field_g;
    }

    final static void a(int param0, int param1) {
        int var3 = 0;
        jm var4 = null;
        var3 = SteelSentinels.field_G;
        var4 = (jm) (Object) ri.field_c.e(13058);
        L0: while (true) {
          if (var4 == null) {
            if (param1 != -26077) {
              field_h = null;
              return;
            } else {
              return;
            }
          } else {
            rh.a(param0, 0, var4);
            var4 = (jm) (Object) ri.field_c.a((byte) -45);
            continue L0;
          }
        }
    }

    public final Object next() {
        kd var1 = ((wh) this).field_g;
        if (((wh) this).field_c.field_a == var1) {
            ((wh) this).field_g = null;
            var1 = null;
        } else {
            ((wh) this).field_g = var1.field_o;
        }
        ((wh) this).field_f = var1;
        return (Object) (Object) var1;
    }

    public final void remove() {
        if (!(((wh) this).field_f != null)) {
            throw new IllegalStateException();
        }
        ((wh) this).field_f.e(480);
        ((wh) this).field_f = null;
    }

    public static void a(byte param0) {
        if (param0 != 46) {
          field_d = -36;
          field_a = null;
          field_i = null;
          field_h = null;
          field_e = null;
          field_j = null;
          field_b = null;
          return;
        } else {
          field_a = null;
          field_i = null;
          field_h = null;
          field_e = null;
          field_j = null;
          field_b = null;
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17 = 0;
        var17 = SteelSentinels.field_G;
        if (param12 <= 14) {
          field_a = null;
          if (param15 > param13) {
            if (param9 <= param15) {
              if (param13 >= param9) {
                qd.a(param2, param9, param14, param11, param4, param1, param3, param6, param13, param8, param5, param0, -88, param15, param7, pb.field_g, param10);
                return;
              } else {
                qd.a(param0, param13, param14, param11, param5, param1, param6, param3, param9, param10, param4, param2, 114, param15, param7, pb.field_g, param8);
                return;
              }
            } else {
              qd.a(param0, param13, param2, param4, param5, param3, param6, param1, param15, param7, param11, param14, -11, param9, param10, pb.field_g, param8);
              return;
            }
          } else {
            if (param9 <= param13) {
              if (param15 >= param9) {
                qd.a(param2, param9, param0, param5, param4, param6, param3, param1, param15, param7, param11, param14, 120, param13, param8, pb.field_g, param10);
                return;
              } else {
                qd.a(param14, param15, param0, param5, param11, param6, param1, param3, param9, param10, param4, param2, 113, param13, param8, pb.field_g, param7);
                return;
              }
            } else {
              qd.a(param14, param15, param2, param4, param11, param3, param1, param6, param13, param8, param5, param0, 115, param9, param10, pb.field_g, param7);
              return;
            }
          }
        } else {
          if (param15 > param13) {
            if (param9 <= param15) {
              if (param13 >= param9) {
                qd.a(param2, param9, param14, param11, param4, param1, param3, param6, param13, param8, param5, param0, -88, param15, param7, pb.field_g, param10);
                return;
              } else {
                qd.a(param0, param13, param14, param11, param5, param1, param6, param3, param9, param10, param4, param2, 114, param15, param7, pb.field_g, param8);
                return;
              }
            } else {
              qd.a(param0, param13, param2, param4, param5, param3, param6, param1, param15, param7, param11, param14, -11, param9, param10, pb.field_g, param8);
              return;
            }
          } else {
            if (param9 <= param13) {
              if (param15 >= param9) {
                qd.a(param2, param9, param0, param5, param4, param6, param3, param1, param15, param7, param11, param14, 120, param13, param8, pb.field_g, param10);
                return;
              } else {
                qd.a(param14, param15, param0, param5, param11, param6, param1, param3, param9, param10, param4, param2, 113, param13, param8, pb.field_g, param7);
                return;
              }
            } else {
              qd.a(param14, param15, param2, param4, param11, param3, param1, param6, param13, param8, param5, param0, 115, param9, param10, pb.field_g, param7);
              return;
            }
          }
        }
    }

    wh(hb param0) {
        ((wh) this).field_f = null;
        ((wh) this).field_c = param0;
        ((wh) this).field_f = null;
        ((wh) this).field_g = ((wh) this).field_c.field_a.field_o;
    }

    final static nk a(int param0, nk param1) {
        int var2 = param1.field_G;
        int var3 = param1.field_E;
        param1.field_E = param1.field_E - 64;
        nk var4 = new nk(na.field_a, 1, var2, var3, 0, param0, new qd[1]);
        var4.field_N = param1.field_N;
        param1.field_N = -1;
        return var4;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "You cannot chat to <%0> because <%0> is offline in your friend list.";
        field_i = "You have the maximum number of favourites already saved. You must delete one before you can save any more.";
        field_h = "Holds 1 <times> <%0>";
        field_j = "Please enter your date of birth to enable chat:";
        field_b = new hm();
    }
}
