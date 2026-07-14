/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class bn extends kj {
    private eaa field_g;
    static ee field_h;
    private int field_f;
    static ee field_i;

    public static void c(int param0) {
        field_i = null;
        field_h = null;
        if (param0 <= 93) {
            field_i = null;
        }
    }

    final void a(int param0, boolean param1, int param2) {
        if (!param1) {
            field_h = null;
        }
    }

    final static void a(int param0, java.awt.Canvas param1, boolean param2) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = BachelorFridge.field_y;
          if (lk.field_r >= 10) {
            if (!ad.d((byte) 27)) {
              dg.d();
              rha.a(240, false, 320);
              av.a(0, -83, param1, 0);
              break L0;
            } else {
              if (0 == jv.field_j) {
                rda.a(0, param2, false);
                av.a(0, -76, param1, 0);
                break L0;
              } else {
                jq.a(param1, -128);
                break L0;
              }
            }
          } else {
            L1: {
              var3 = 0;
              if (nf.field_K) {
                nf.field_K = false;
                var3 = 1;
                break L1;
              } else {
                break L1;
              }
            }
            lha.a(kla.f(param0 + -10284), dea.field_o, wea.b(false), var3 != 0, 3);
            break L0;
          }
        }
        L2: {
          if (param0 == 0) {
            break L2;
          } else {
            var5 = null;
            bn.a(-46, (java.awt.Canvas) null, false);
            break L2;
          }
        }
    }

    bn(gj param0, int param1, int param2) {
        super(param0, param1, param2);
        ((bn) this).field_f = 128;
        ((bn) this).field_g = new eaa();
    }

    final void a(int param0, int param1, int param2) {
        if (param1 != 0) {
            ((bn) this).a(34, true, 68);
        }
        rea.a(((bn) this).field_g, 65280, param2, (byte) 118, 10, param0);
    }

    final static kv a(vr param0, byte param1, int param2, int param3) {
        if (!g.a(param3, param2, -30744, param0)) {
            return null;
        }
        int var4 = -101 / ((-66 - param1) / 41);
        return nja.a(true);
    }

    final boolean b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        rea var9 = null;
        int var10 = 0;
        Object var11 = null;
        var10 = BachelorFridge.field_y;
        ((bn) this).field_f = ((bn) this).field_f - 1;
        if (-1 == (((bn) this).field_f - 1 ^ -1)) {
          return true;
        } else {
          L0: {
            if (127 < ((bn) this).field_f) {
              break L0;
            } else {
              if (64 <= ((bn) this).field_f) {
                var2 = 0;
                L1: while (true) {
                  if (var2 >= 1) {
                    break L0;
                  } else {
                    var3 = ((bn) this).field_f;
                    var3 += 16;
                    var4 = kla.a(96, ((bn) this).field_e.field_h.field_w, -2147483648);
                    var5 = kla.a(48, ((bn) this).field_e.field_h.field_w, -2147483648);
                    int discarded$3 = kla.a(50, ((bn) this).field_e.field_h.field_w, -2147483648);
                    var6 = 128 + var4;
                    var7 = 64 + var5;
                    var8 = (int)(Math.sin((double)var3 * 300.0) * 100.0) * 0;
                    var9 = new rea(var6, var8, var7, kla.a(3, ((bn) this).field_e.field_h.field_w, -2147483648));
                    int discarded$4 = kla.a(3, ((bn) this).field_e.field_h.field_w, -2147483648);
                    int discarded$5 = kla.a(5000, ((bn) this).field_e.field_h.field_w, -2147483648);
                    var9.field_o = (double)(-kla.a(2, ((bn) this).field_e.field_h.field_w, -2147483648) + -1);
                    var9.field_n = 64;
                    var9.field_h = -1;
                    ((bn) this).field_g.a((bw) (Object) var9, true);
                    var2++;
                    continue L1;
                  }
                }
              } else {
                break L0;
              }
            }
          }
          L2: {
            dha.a(((bn) this).field_g, ((bn) this).field_f, ((bn) this).field_e.field_h.field_w, 75);
            if (param0 >= 21) {
              break L2;
            } else {
              var11 = null;
              bn.a(101, (java.awt.Canvas) null, false);
              break L2;
            }
          }
          return false;
        }
    }

    static {
    }
}
