/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ip implements Iterator {
    static String field_h;
    static String field_f;
    private up field_a;
    static String field_g;
    static String field_d;
    static long field_b;
    private df field_c;
    private df field_e;

    public final boolean hasNext() {
        return ((ip) this).field_e != ((ip) this).field_a.field_a;
    }

    public final Object next() {
        df var1 = ((ip) this).field_e;
        if (((ip) this).field_a.field_a != var1) {
            ((ip) this).field_e = var1.field_h;
        } else {
            ((ip) this).field_e = null;
            var1 = null;
        }
        ((ip) this).field_c = var1;
        return (Object) (Object) var1;
    }

    final static hc[] a(int param0, sl param1) {
        int var2 = 0;
        int var3 = 0;
        hc[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        hc var6_ref = null;
        int var7 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = param1.b((byte) 93, 8);
        if (0 >= var2) {
          var3 = param1.b((byte) 116, 12);
          var4 = new hc[var3];
          if (param0 != 24243) {
            L0: {
              field_d = null;
              var5 = 0;
              if (var3 <= var5) {
                break L0;
              } else {
                L1: {
                  if (!ng.a(param1, (byte) -95)) {
                    var6 = param1.b((byte) 127, a.a(var5 + -1, 1));
                    var4[var5] = var4[var6];
                    break L1;
                  } else {
                    var6_ref = new hc();
                    int discarded$12 = param1.b((byte) 122, 24);
                    int discarded$13 = param1.b((byte) 80, 24);
                    var6_ref.field_a = param1.b((byte) 87, 24);
                    int discarded$14 = param1.b((byte) 100, 9);
                    int discarded$15 = param1.b((byte) 122, 12);
                    int discarded$16 = param1.b((byte) 106, 12);
                    int discarded$17 = param1.b((byte) 122, 12);
                    var4[var5] = var6_ref;
                    var5++;
                    break L1;
                  }
                }
                var5++;
                var5++;
                var5++;
                break L0;
              }
            }
            return var4;
          } else {
            var5 = 0;
            L2: while (true) {
              if (var3 <= var5) {
                return var4;
              } else {
                if (!ng.a(param1, (byte) -95)) {
                  var6 = param1.b((byte) 127, a.a(var5 + -1, 1));
                  var4[var5] = var4[var6];
                  var5++;
                  var5++;
                  continue L2;
                } else {
                  var6_ref = new hc();
                  int discarded$18 = param1.b((byte) 122, 24);
                  int discarded$19 = param1.b((byte) 80, 24);
                  var6_ref.field_a = param1.b((byte) 87, 24);
                  int discarded$20 = param1.b((byte) 100, 9);
                  int discarded$21 = param1.b((byte) 122, 12);
                  int discarded$22 = param1.b((byte) 106, 12);
                  int discarded$23 = param1.b((byte) 122, 12);
                  var4[var5] = var6_ref;
                  var5++;
                  var5++;
                  continue L2;
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    final static boolean a(byte param0) {
        if (param0 >= -90) {
            return false;
        }
        return (np.field_a.field_fc ^ -1L) == (ec.field_p ^ -1L) ? true : false;
    }

    public static void a(int param0) {
        Object var2 = null;
        if (param0 <= 123) {
          var2 = null;
          hc[] discarded$2 = ip.a(-22, (sl) null);
          field_d = null;
          field_h = null;
          field_g = null;
          field_f = null;
          return;
        } else {
          field_d = null;
          field_h = null;
          field_g = null;
          field_f = null;
          return;
        }
    }

    public final void remove() {
        if (!(((ip) this).field_c != null)) {
            throw new IllegalStateException();
        }
        ((ip) this).field_c.a(16);
        ((ip) this).field_c = null;
    }

    ip(up param0) {
        ((ip) this).field_c = null;
        ((ip) this).field_a = param0;
        ((ip) this).field_e = ((ip) this).field_a.field_a.field_h;
        ((ip) this).field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Click to stop animation.";
        field_g = "You need to play 1 more rated game to unlock this option.";
        field_d = "Set up new game";
        field_f = "Use this alternative as your account name";
    }
}
