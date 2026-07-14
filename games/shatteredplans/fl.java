/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fl implements Iterator {
    static bi field_b;
    static int field_f;
    private oh field_c;
    private oh field_a;
    private rm field_g;
    static String field_e;
    private int field_d;
    static int field_h;

    public static void b(int param0) {
        field_e = null;
        field_b = null;
        if (param0 != -1) {
            Object var2 = null;
            fl.a((ln) null, (byte) -77);
        }
    }

    public final void remove() {
        if (null == ((fl) this).field_c) {
            throw new IllegalStateException();
        }
        ((fl) this).field_c.b((byte) -90);
        ((fl) this).field_c = null;
    }

    final static qr a(int param0) {
        int var1 = -56 % ((-22 - param0) / 48);
        return wg.field_a.field_Eb;
    }

    final static void a(ln param0, byte param1) {
        mg var3 = null;
        int var4 = 0;
        int var5 = 0;
        mg var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        db var11 = null;
        var9 = ShatteredPlansClient.field_F ? 1 : 0;
        if (null != param0.field_s.c(-128)) {
          L0: {
            if (param1 >= 35) {
              break L0;
            } else {
              var10 = null;
              fl.a((ln) null, (byte) -17);
              break L0;
            }
          }
          var11 = new db();
          var11.a(param0.field_s.a(-123), 32);
          var3 = (mg) (Object) param0.field_s.c(-128);
          L1: while (true) {
            if (var3 == null) {
              var3 = (mg) (Object) var11.c(-127);
              L2: while (true) {
                if (var3 == null) {
                  return;
                } else {
                  param0.field_s.a((df) (Object) var3, 32);
                  var3 = (mg) (Object) var11.b(32);
                  continue L2;
                }
              }
            } else {
              var4 = var3.field_y.field_A - var3.field_B.field_A;
              var5 = var3.field_y.field_S + -var3.field_B.field_S;
              var6 = (mg) (Object) var11.c(-127);
              L3: while (true) {
                L4: {
                  if (var6 == null) {
                    break L4;
                  } else {
                    var7 = var6.field_y.field_A + -var6.field_B.field_A;
                    var8 = -var6.field_B.field_S + var6.field_y.field_S;
                    if (!oo.a(var4, var5, var7, true, var8)) {
                      var6 = (mg) (Object) var11.b(32);
                      continue L3;
                    } else {
                      el.a((df) (Object) var3, 0, (df) (Object) var6);
                      break L4;
                    }
                  }
                }
                L5: {
                  if (var6 != null) {
                    break L5;
                  } else {
                    var11.a((df) (Object) var3, 32);
                    break L5;
                  }
                }
                var3 = (mg) (Object) param0.field_s.b(32);
                continue L1;
              }
            }
          }
        } else {
          return;
        }
    }

    public final boolean hasNext() {
        int var2 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!(((fl) this).field_g.field_f[-1 + ((fl) this).field_d] == ((fl) this).field_a)) {
            return true;
        }
        while (((fl) this).field_g.field_d > ((fl) this).field_d) {
            ((fl) this).field_d = ((fl) this).field_d + 1;
            if (((fl) this).field_g.field_f[((fl) this).field_d].field_f != ((fl) this).field_g.field_f[((fl) this).field_d + -1]) {
                ((fl) this).field_a = ((fl) this).field_g.field_f[((fl) this).field_d + -1].field_f;
                return true;
            }
            ((fl) this).field_a = ((fl) this).field_g.field_f[-1 + ((fl) this).field_d];
        }
        return false;
    }

    final static void a(int param0, String param1) {
        aj.field_a.a((byte) -113, (oh) (Object) new de(param1));
        if (param0 != 0) {
            Object var3 = null;
            fl.a((ln) null, (byte) 103);
        }
    }

    public final Object next() {
        oh var1 = null;
        int var2 = 0;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        if (((fl) this).field_g.field_f[-1 + ((fl) this).field_d] == ((fl) this).field_a) {
          L0: while (true) {
            if (((fl) this).field_g.field_d > ((fl) this).field_d) {
              ((fl) this).field_d = ((fl) this).field_d + 1;
              var1 = ((fl) this).field_g.field_f[((fl) this).field_d].field_f;
              if (((fl) this).field_g.field_f[-1 + ((fl) this).field_d] != var1) {
                ((fl) this).field_c = var1;
                ((fl) this).field_a = var1.field_f;
                return (Object) (Object) var1;
              } else {
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          var1 = ((fl) this).field_a;
          ((fl) this).field_a = var1.field_f;
          ((fl) this).field_c = var1;
          return (Object) (Object) var1;
        }
    }

    fl(rm param0) {
        ((fl) this).field_c = null;
        ((fl) this).field_g = param0;
        this.c(-107);
    }

    private final void c(int param0) {
        ((fl) this).field_c = null;
        if (param0 > -77) {
            Object discarded$0 = ((fl) this).next();
        }
        ((fl) this).field_d = 1;
        ((fl) this).field_a = ((fl) this).field_g.field_f[0].field_f;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 360;
        field_e = "Animations do not play automatically. Click to enable.";
    }
}
