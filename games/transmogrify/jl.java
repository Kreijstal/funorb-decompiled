/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jl extends wf {
    int field_n;
    int field_i;
    int field_g;
    static int field_o;
    int field_k;
    int field_h;
    int field_m;
    static ti field_l;
    static int field_j;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = Transmogrify.field_A ? 1 : 0;
        sb.d(param0, param1, 1 + param3, 10000536);
        sb.d(param0, param1 - -param4, 1 + param3, 12105912);
        int var5 = 1;
        if (param2 != 13612) {
            Object var11 = null;
            jl.a((java.awt.Component) null, 106);
        }
        int var6 = param4;
        if (!(sb.field_e <= param1 - -var5)) {
            var5 = -param1 + sb.field_e;
        }
        if (sb.field_f < param1 + var6) {
            var6 = -param1 + sb.field_f;
        }
        for (var7 = var5; var7 < var6; var7++) {
            var8 = 152 - -(48 * var7 / param4);
            var9 = var8 | (var8 << -812904752 | var8 << -1594782456);
            sb.field_h[param0 + (param1 - -var7) * sb.field_c] = var9;
            sb.field_h[sb.field_c * (var7 + param1) + param0 - -param3] = var9;
        }
    }

    final static void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        oi var4_ref_oi = null;
        int var4 = 0;
        jl var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        hj var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        L0: {
          var8 = Transmogrify.field_A ? 1 : 0;
          var9 = nf.field_l;
          var2 = var9.d((byte) 78);
          var3 = var9.d((byte) 106);
          if (var2 != 0) {
            if (-2 != (var2 ^ -1)) {
              d.a((Throwable) null, 46, "LR1: " + ik.q(48));
              pc.a(1);
              break L0;
            } else {
              var4 = var9.k(128);
              var5 = (jl) (Object) ll.field_T.a((byte) -95);
              L1: while (true) {
                L2: {
                  if (var5 == null) {
                    break L2;
                  } else {
                    L3: {
                      if (var5.field_m != var3) {
                        break L3;
                      } else {
                        if (var4 == var5.field_i) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var5 = (jl) (Object) ll.field_T.a(true);
                    continue L1;
                  }
                }
                if (var5 == null) {
                  pc.a(1);
                  return;
                } else {
                  var5.c(5);
                  break L0;
                }
              }
            }
          } else {
            var4_ref_oi = (oi) (Object) qd.field_d.a((byte) -95);
            if (var4_ref_oi == null) {
              pc.a(1);
              return;
            } else {
              L4: {
                var5_int = -var9.field_h + tg.field_a;
                var13 = var4_ref_oi.field_m;
                var12 = var13;
                var11 = var12;
                var10 = var11;
                var6 = var10;
                if (var5_int <= var13.length << -1167402782) {
                  break L4;
                } else {
                  var5_int = var13.length << -569242526;
                  break L4;
                }
              }
              var7 = 0;
              L5: while (true) {
                if (var7 >= var5_int) {
                  var4_ref_oi.c(5);
                  break L0;
                } else {
                  var6[var7 >> -1485960510] = var6[var7 >> -1485960510] + (var9.d((byte) 126) << (vg.c(var7, 3) << 1355147144));
                  var7++;
                  continue L5;
                }
              }
            }
          }
        }
        L6: {
          if (param0 == 1) {
            break L6;
          } else {
            field_j = -22;
            break L6;
          }
        }
    }

    public static void a(byte param0) {
        field_l = null;
        if (param0 < 9) {
            field_l = null;
        }
    }

    private jl() throws Throwable {
        throw new Error();
    }

    final static void a(java.awt.Component param0, int param1) {
        param0.addMouseListener((java.awt.event.MouseListener) (Object) hi.field_e);
        param0.addMouseMotionListener((java.awt.event.MouseMotionListener) (Object) hi.field_e);
        param0.addFocusListener((java.awt.event.FocusListener) (Object) hi.field_e);
        if (param1 != 0) {
            jl.d(-37);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 0;
    }
}
