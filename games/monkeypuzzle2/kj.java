/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class kj extends jk {
    static int field_G;
    static String field_E;
    static le field_F;
    private pj field_D;

    final void b(byte param0, we param1) {
        if (!(param1 instanceof rh)) {
            throw new IllegalArgumentException();
        }
        if (param0 >= -32) {
            field_F = null;
        }
        rh var3 = (rh) (Object) param1;
        ((kj) this).field_D.a((ug) (Object) var3, (byte) 13);
        var3.field_z = true;
        boolean discarded$0 = var3.a((we) this, false);
    }

    public kj() {
        super(0, 0, tf.field_b, uj.field_l, (ml) null, (of) null);
        ((kj) this).field_D = new pj();
    }

    final static void a(boolean param0, int param1) {
        jk.field_u = jk.field_u + uj.field_h;
        if (!(jk.field_u <= param1)) {
            ck.field_b = -1;
        }
        if (-31 < jk.field_u) {
            if (0 <= ck.field_b) {
                if (param0) {
                    uj.field_h = uj.field_h * -1;
                    jk.field_u = 30;
                }
            }
        }
    }

    final static le a(int param0, ad param1, int param2, int param3) {
        if (param2 != 17196) {
            Object var5 = null;
            le discarded$0 = kj.a(4, (ad) null, 48, 57);
        }
        if (!wg.a(param3, param0, param1, -3)) {
            return null;
        }
        return od.b(param2 + -17093);
    }

    final void k(int param0) {
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        ck var2 = new ck(((kj) this).field_D);
        rh var3 = (rh) (Object) var2.a((byte) -37);
        while (var3 != null) {
            var3.field_z = false;
            var3 = (rh) (Object) var2.a(true);
        }
        if (param0 <= 43) {
            return;
        }
        ((kj) this).field_v = null;
    }

    final we a(int param0) {
        ck var2 = null;
        rh var3 = null;
        int var4 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 == -1) {
          var2 = new ck(((kj) this).field_D);
          var3 = (rh) (Object) var2.a((byte) -37);
          L0: while (true) {
            if (var3 != null) {
              if (var3.field_z) {
                return var3.a(true);
              } else {
                var3 = (rh) (Object) var2.a(true);
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final static boolean m(int param0) {
        i var1 = null;
        int var2 = 0;
        int var3 = 0;
        i var4 = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        var4 = (i) (Object) ua.field_v.a((byte) -117);
        var1 = var4;
        if (var1 == null) {
          return false;
        } else {
          var2 = param0;
          L0: while (true) {
            if (var2 >= var1.field_e) {
              return true;
            } else {
              L1: {
                if (null != var4.field_k[var2]) {
                  if (var4.field_k[var2].field_g == 0) {
                    return false;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              if (var4.field_s[var2] != null) {
                if (0 == var4.field_s[var2].field_g) {
                  return false;
                } else {
                  var2++;
                  continue L0;
                }
              } else {
                var2++;
                continue L0;
              }
            }
          }
        }
    }

    public static void d(byte param0) {
        int var1 = 86 / ((63 - param0) / 57);
        field_E = null;
        field_F = null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 != 30) {
            Object var8 = null;
            ((kj) this).b((byte) -88, (we) null);
        }
        if (((kj) this).field_h != null) {
            ((kj) this).field_h.a(true, (we) this, param2, param3, 55);
        }
        ck var5 = new ck(((kj) this).field_D);
        we var6 = (we) (Object) var5.b((byte) -103);
        while (var6 != null) {
            var6.a(30, param1, ((kj) this).field_e + param2, param3 - -((kj) this).field_r);
            var6 = (we) (Object) var5.a(param0 + -3733);
        }
    }

    final void a(boolean param0) {
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (!param0) {
            field_F = null;
        }
        ck var2 = new ck(((kj) this).field_D);
        rh var3 = (rh) (Object) var2.a((byte) -37);
        while (var3 != null) {
            if (!(!var3.b(false))) {
                var3.c(-19822);
            }
            var3 = (rh) (Object) var2.a(true);
        }
    }

    final void l(int param0) {
        int var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        int var4 = -104 / ((75 - param0) / 44);
        ck var2 = new ck(((kj) this).field_D);
        rh var3 = (rh) (Object) var2.a((byte) -37);
        while (var3 != null) {
            if (var3.k(-23913)) {
                var3.c(-19822);
            }
            var3 = (rh) (Object) var2.a(true);
        }
        ((kj) this).field_v = (we) (Object) ((kj) this).j(-73);
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, String param6, long param7, boolean param8, int param9, int param10, byte param11, int param12, md param13) {
        try {
            MonkeyPuzzle2.field_D = new hb(param9);
            gf.field_c = new hb(param3);
            pj.field_g = param13;
            j.field_a = param10;
            mb.field_c = param2 ? true : false;
            me.field_e = param8 ? true : false;
            od.field_l = param7;
            kc.field_c = param4;
            mk.field_h = param5;
            rl.field_a = param0;
            di.field_d = param6;
            if (param11 > -105) {
                kj.a(true, -74);
            }
            cg.field_g = param12;
            id.field_m = param1;
            if (null != pj.field_g.field_x) {
                try {
                    hj.field_D = new ch(pj.field_g.field_x, 64, 0);
                } catch (IOException iOException) {
                    throw new RuntimeException(iOException.toString());
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final rh j(int param0) {
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        ck var2 = new ck(((kj) this).field_D);
        rh var3 = (rh) (Object) var2.a((byte) -37);
        while (var3 != null) {
            if (!(!var3.field_z)) {
                return var3;
            }
            var3 = (rh) (Object) var2.a(true);
        }
        if (param0 <= -32) {
            return null;
        }
        ((kj) this).a(false);
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_E = "Connection timed out. Please try using a different server.";
    }
}
