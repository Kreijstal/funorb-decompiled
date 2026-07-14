/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class be implements Iterable {
    static String field_b;
    static int field_c;
    ij field_f;
    static db field_e;
    static am field_d;
    static String field_a;

    public static void a(byte param0) {
        field_b = null;
        int var1 = 11 / ((param0 - 62) / 56);
        field_e = null;
        field_d = null;
        field_a = null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = CrazyCrystals.field_B;
        if (param0 == -1013410975) {
          var3 = 0;
          var4 = pf.field_n;
          L0: while (true) {
            if (je.field_i.length > var3) {
              var5 = ub.field_b[var3];
              if ((var5 ^ -1) <= -1) {
                var6 = vm.a((byte) 96, true, je.field_i[var3]);
                var4 = var4 + a.field_a;
                var7 = -(var6 >> 394322305) + oa.field_b;
                if (wn.a(var6 - -(to.field_d << -1013410975), param1, param2, var7 - to.field_d, (byte) -30, gh.field_w + (bn.field_c << 833702561), var4)) {
                  return var5;
                } else {
                  var4 = var4 + (gh.field_w + ((bn.field_c << 1452656289) - -a.field_a));
                  var3++;
                  var3++;
                  continue L0;
                }
              } else {
                var4 = var4 + io.field_O;
                var3++;
                var3++;
                continue L0;
              }
            } else {
              return -1;
            }
          }
        } else {
          field_a = null;
          var3 = 0;
          var4 = pf.field_n;
          if (je.field_i.length > var3) {
            L1: {
              var5 = ub.field_b[var3];
              if ((var5 ^ -1) <= -1) {
                var6 = vm.a((byte) 96, true, je.field_i[var3]);
                var4 = var4 + a.field_a;
                var7 = -(var6 >> 394322305) + oa.field_b;
                if (wn.a(var6 - -(to.field_d << -1013410975), param1, param2, var7 - to.field_d, (byte) -30, gh.field_w + (bn.field_c << 833702561), var4)) {
                  return var5;
                } else {
                  var4 = var4 + (gh.field_w + ((bn.field_c << 1452656289) - -a.field_a));
                  break L1;
                }
              } else {
                var4 = var4 + io.field_O;
                var3++;
                break L1;
              }
            }
            var3++;
            var3++;
            var3++;
            return -1;
          } else {
            return -1;
          }
        }
    }

    public final Iterator iterator() {
        return (Iterator) (Object) new wk((be) this);
    }

    final void a(byte param0, ij param1) {
        if (param1.field_g == null) {
          param1.field_g = ((be) this).field_f.field_g;
          param1.field_j = ((be) this).field_f;
          if (param0 < 7) {
            return;
          } else {
            param1.field_g.field_j = param1;
            param1.field_j.field_g = param1;
            return;
          }
        } else {
          param1.a(1);
          param1.field_g = ((be) this).field_f.field_g;
          param1.field_j = ((be) this).field_f;
          if (param0 < 7) {
            return;
          } else {
            param1.field_g.field_j = param1;
            param1.field_j.field_g = param1;
            return;
          }
        }
    }

    private be() throws Throwable {
        throw new Error();
    }

    final ij a(int param0) {
        ij var2 = null;
        Object var3 = null;
        var2 = ((be) this).field_f.field_j;
        if (var2 != ((be) this).field_f) {
          if (param0 != 30244) {
            var3 = null;
            ((be) this).a((byte) 94, (ij) null);
            var2.a(1);
            return var2;
          } else {
            var2.a(1);
            return var2;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Unpacking music";
        field_a = "Please try again in a few minutes.";
    }
}
