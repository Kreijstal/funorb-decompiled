/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class de implements Iterable {
    rk field_b;
    static String field_c;
    static String field_a;

    final static void a(byte param0, String param1, String param2, boolean param3) {
        rg.field_S = param1;
        lb.field_e = param2;
        if (param0 != -52) {
            return;
        }
        fc.a(sd.field_c, param3, -122);
    }

    final rk b(byte param0) {
        rk var2 = null;
        var2 = ((de) this).field_b.field_i;
        if (param0 <= -15) {
          if (((de) this).field_b == var2) {
            return null;
          } else {
            var2.b(false);
            return var2;
          }
        } else {
          return null;
        }
    }

    final static String a(int param0, String param1, kl param2, String param3) {
        if (!param2.b(17820)) {
          return param3;
        } else {
          if (param0 != -40) {
            field_c = null;
            return param1 + " - " + param2.a((byte) 75) + "%";
          } else {
            return param1 + " - " + param2.a((byte) 75) + "%";
          }
        }
    }

    final static void a(int param0, int param1, dc param2) {
        int var4 = 0;
        mg var5 = null;
        var5 = n.field_b;
        var5.c((byte) -61, param1);
        var5.field_m = var5.field_m + 1;
        var4 = var5.field_m;
        var5.b((byte) 11, 1);
        var5.b((byte) 11, param2.field_k);
        var5.d(1710370149, param2.field_m);
        var5.f(param2.field_r, param0 ^ -612992477);
        var5.f(param2.field_l, 613003928);
        var5.f(param2.field_i, 613003928);
        var5.f(param2.field_p, 613003928);
        int discarded$51 = var5.e(var4, param0 ^ 1182882603);
        var5.a(-var4 + var5.field_m, -127);
        if (param0 != -14149) {
          de.a(54, false, 105, -87);
          return;
        } else {
          return;
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new kg((de) this);
    }

    private de() throws Throwable {
        throw new Error();
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 != 5) {
            de.a(-86, true, -78, -105);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final void a(rk param0, int param1) {
        if (null == param0.field_l) {
          param0.field_l = ((de) this).field_b.field_l;
          param0.field_i = ((de) this).field_b;
          param0.field_l.field_i = param0;
          if (param1 != 10) {
            return;
          } else {
            param0.field_i.field_l = param0;
            return;
          }
        } else {
          param0.b(false);
          param0.field_l = ((de) this).field_b.field_l;
          param0.field_i = ((de) this).field_b;
          param0.field_l.field_i = param0;
          if (param1 != 10) {
            return;
          } else {
            param0.field_i.field_l = param0;
            return;
          }
        }
    }

    final static void a(int param0, boolean param1, int param2, int param3) {
        int var4 = 0;
        if (param0 == 2) {
          L0: {
            ef.field_H.e(param2, param3);
            if (param1) {
              L1: {
                var4 = hj.field_c % ef.field_H.field_z * 2;
                if (ef.field_H.field_z > var4) {
                  break L1;
                } else {
                  var4 = ef.field_H.field_z - (var4 - ef.field_H.field_z);
                  break L1;
                }
              }
              if (-11 >= (var4 ^ -1)) {
                if (ef.field_H.field_z - 40 < var4) {
                  var4 = -40 + ef.field_H.field_z;
                  df.a(30, 0, ef.field_H, 0, 80, param3, param2, var4, 0);
                  break L0;
                } else {
                  df.a(30, 0, ef.field_H, 0, 80, param3, param2, var4, 0);
                  return;
                }
              } else {
                var4 = 10;
                df.a(30, 0, ef.field_H, 0, 80, param3, param2, var4, 0);
                return;
              }
            } else {
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "The Troll Cave";
        field_a = "Change display name";
    }
}
