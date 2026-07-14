/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jba extends ana {
    private taa field_y;
    static String field_w;
    static int field_x;
    private uj field_z;
    static sna field_A;
    private boolean field_v;

    final boolean c(byte param0) {
        int var2 = 0;
        if (((jba) this).field_m.a((byte) -106)) {
          return false;
        } else {
          if (!((jba) this).field_y.a((byte) -106)) {
            ((jba) this).field_l = ((jba) this).field_l - 1;
            if (((jba) this).field_l - 1 > 0) {
              L0: {
                if (((jba) this).field_v) {
                  break L0;
                } else {
                  this.e((byte) 47);
                  break L0;
                }
              }
              return false;
            } else {
              var2 = 92 % ((param0 - 71) / 47);
              this.b(true);
              return true;
            }
          } else {
            return false;
          }
        }
    }

    private final void b(boolean param0) {
        this.f((byte) -125);
        if (!param0) {
            field_A = null;
        }
    }

    private final void e(byte param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        kw var16 = null;
        int var17 = 0;
        int[][] var21 = null;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var17 = BachelorFridge.field_y;
          var21 = ((jba) this).field_z.d(1);
          var3 = ((jba) this).field_z.field_q;
          var4 = ((jba) this).field_z.field_t;
          var5 = 17;
          var6 = 17;
          var7 = var5 - 1 >> -884038015;
          if (param0 == 47) {
            break L0;
          } else {
            jba.d(-36);
            break L0;
          }
        }
        var8 = var6 + -1 >> -973925183;
        var9 = kla.a(513, m.field_a, -2147483648) + -256;
        var10 = -128 + kla.a(257, m.field_a, param0 + 2147483601);
        var11 = 0;
        L1: while (true) {
          if (var5 <= var11) {
            ((jba) this).field_v = true;
            return;
          } else {
            var12 = 0;
            L2: while (true) {
              if (var12 >= var6) {
                var11++;
                continue L1;
              } else {
                if ((var21[var11][var12] ^ -1) == -2) {
                  var13 = var11 + (-var7 + var3);
                  var14 = var4 - (-var12 + var8);
                  if (((jba) this).field_q.field_h.a(var13, var14, (byte) 61)) {
                    L3: {
                      if (((jba) this).field_q.field_h.field_a[var13][var14].field_l != null) {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        break L3;
                      } else {
                        stackOut_11_0 = 1;
                        stackIn_13_0 = stackOut_11_0;
                        break L3;
                      }
                    }
                    var15 = stackIn_13_0;
                    var16 = new kw(((jba) this).field_q, var13, var14, var9, var10, var15 != 0);
                    ((kj) (Object) var16).a(0);
                    var12++;
                    continue L2;
                  } else {
                    var12++;
                    continue L2;
                  }
                } else {
                  var12++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    jba(gj param0, uj param1) {
        super(param0, (bca) (Object) param1);
        ((jba) this).field_z = param1;
        ((jba) this).field_y = new taa(((jba) this).field_q, ((jba) this).field_z.field_q, ((jba) this).field_z.field_t);
        ((jba) this).a(27799, (at) (Object) ((jba) this).field_y);
        ((jba) this).field_l = 80;
    }

    public static void d(int param0) {
        field_w = null;
        if (param0 != -128) {
            return;
        }
        field_A = null;
    }

    final static void a(it param0, jfa param1, int param2) {
        if (bp.e(-29919)) {
            return;
        }
        sja.field_fb.c(param2, (byte) 109);
        sja.field_fb.field_g = sja.field_fb.field_g + 2;
        int var3 = sja.field_fb.field_g;
        rha.a(param1.field_g, (lu) (Object) sja.field_fb, (byte) -93);
        oe.a(-21332, (lu) (Object) sja.field_fb, param0);
        sja.field_fb.a((byte) -88, sja.field_fb.field_g + -var3);
    }

    private final void f(byte param0) {
        ad var4 = null;
        int var5 = BachelorFridge.field_y;
        aga var2 = ((jba) this).field_z.field_l.a(param0 + 178, ((jba) this).field_q.field_h);
        if (param0 != -125) {
            return;
        }
        if (!(!var2.i(84))) {
            return;
        }
        pp var3 = (pp) (Object) ((jba) this).field_z.field_o.b((byte) 90);
        while (var3 != null) {
            var4 = var3.field_h.a(param0 + -27324, ((jba) this).field_q);
            var4.b(param0 + 124, 6);
            var3.a(var2, ((jba) this).field_q.field_h, 12);
            ((jba) this).a(27799, (at) (Object) new ek(((jba) this).field_q, var4, var3.field_f));
            var3 = (pp) (Object) ((jba) this).field_z.field_o.c(0);
        }
    }

    final static void a(int param0, java.awt.Component param1) {
        param1.addMouseListener((java.awt.event.MouseListener) (Object) uc.field_m);
        if (param0 != -30229) {
            Object var3 = null;
            jba.a((it) null, (jfa) null, -106);
        }
        param1.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) uc.field_m);
        param1.addFocusListener((java.awt.event.FocusListener) (Object) uc.field_m);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = "Withdraw invitation to <%0> to join this game";
        field_x = 2;
    }
}
