/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pg {
    private va field_g;
    private int field_d;
    static Random field_a;
    private ed field_c;
    private int field_e;
    static String field_f;
    static String field_b;

    final static void a(boolean param0, int param1) {
        int var3 = 0;
        ad var4 = null;
        uh var5 = null;
        var3 = Main.field_T;
        if (param0) {
          var4 = (ad) (Object) od.field_b.a((byte) 74);
          L0: while (true) {
            if (var4 == null) {
              var5 = (uh) (Object) tl.field_a.a((byte) 74);
              L1: while (true) {
                if (var5 == null) {
                  return;
                } else {
                  ei.a(-64, var5, param1);
                  var5 = (uh) (Object) tl.field_a.b((byte) -113);
                  continue L1;
                }
              }
            } else {
              aa.a(var4, 3298, param1);
              var4 = (ad) (Object) od.field_b.b((byte) -103);
              continue L0;
            }
          }
        } else {
          pg.a(false, 127);
          var4 = (ad) (Object) od.field_b.a((byte) 74);
          L2: while (true) {
            if (var4 == null) {
              var5 = (uh) (Object) tl.field_a.a((byte) 74);
              L3: while (true) {
                if (var5 == null) {
                  return;
                } else {
                  ei.a(-64, var5, param1);
                  var5 = (uh) (Object) tl.field_a.b((byte) -113);
                  continue L3;
                }
              }
            } else {
              aa.a(var4, 3298, param1);
              var4 = (ad) (Object) od.field_b.b((byte) -103);
              continue L2;
            }
          }
        }
    }

    final void a(int param0, Object param1, long param2) {
        this.a(param2, 1, 10, param1);
        if (param0 <= 118) {
            field_a = null;
        }
    }

    public static void a(byte param0) {
        field_f = null;
        if (param0 != -85) {
            pg.a((byte) -89);
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    private final void a(long param0, int param1, int param2, Object param3) {
        pd var8 = null;
        int var7 = Main.field_T;
        if (param2 != 10) {
            return;
        }
        if (!(param1 <= ((pg) this).field_d)) {
            throw new IllegalStateException();
        }
        this.a(param0, (byte) 124);
        ((pg) this).field_e = ((pg) this).field_e - param1;
        while ((((pg) this).field_e ^ -1) > -1) {
            var8 = (pd) (Object) ((pg) this).field_g.a(false);
            this.a((byte) 107, var8);
        }
        tf var6 = new tf(param3, param1);
        ((pg) this).field_c.a(-102, param0, (qb) (Object) var6);
        ((pg) this).field_g.a(param2 + -112, (he) (Object) var6);
        ((pd) (Object) var6).field_j = 0L;
    }

    private final void a(byte param0, pd param1) {
        if (param1 == null) {
          if (param0 != 107) {
            field_b = null;
            return;
          } else {
            return;
          }
        } else {
          param1.c(109);
          param1.d(param0 ^ 103);
          ((pg) this).field_e = ((pg) this).field_e + param1.field_k;
          if (param0 == 107) {
            return;
          } else {
            field_b = null;
            return;
          }
        }
    }

    final static boolean a(boolean param0, CharSequence param1) {
        if (param0) {
            return true;
        }
        return te.a(10, 117, param1, true);
    }

    final Object a(long param0, int param1) {
        Object var5 = null;
        tf var6 = null;
        pd var7 = null;
        var7 = (pd) (Object) ((pg) this).field_c.a((byte) 120, param0);
        if (var7 != null) {
          var5 = var7.e(param1);
          if (var5 == null) {
            var7.c(100);
            var7.d(12);
            ((pg) this).field_e = ((pg) this).field_e + var7.field_k;
            return null;
          } else {
            if (var7.f(param1 ^ 0)) {
              var6 = new tf(var5, var7.field_k);
              ((pg) this).field_c.a(-96, var7.field_e, (qb) (Object) var6);
              ((pg) this).field_g.a(-82, (he) (Object) var6);
              ((pd) (Object) var6).field_j = 0L;
              var7.c(105);
              var7.d(12);
              return var5;
            } else {
              ((pg) this).field_g.a(-91, (he) (Object) var7);
              var7.field_j = 0L;
              return var5;
            }
          }
        } else {
          return null;
        }
    }

    private pg() throws Throwable {
        throw new Error();
    }

    private final void a(long param0, byte param1) {
        if (param1 != 124) {
            return;
        }
        pd var4 = (pd) (Object) ((pg) this).field_c.a((byte) 83, param0);
        this.a((byte) 107, var4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new Random();
        field_f = "Quit to website";
        field_b = "Fullscreen";
    }
}
