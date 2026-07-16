/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ug {
    static ut[] field_c;
    static java.applet.Applet field_a;
    static ut[][] field_b;
    static String field_d;
    static wd field_e;
    static boolean[] field_f;

    public static void a(int param0) {
        field_e = null;
        field_f = null;
        field_d = null;
        field_c = null;
        field_a = null;
        field_b = null;
        if (param0 != -1) {
            Object var2 = null;
            ug.a((gn) null, 81, (gn) null);
        }
    }

    final static int a(int param0, int param1) {
        if (!(!ia.field_c)) {
            param1 = -param1 + 896;
        }
        if (param0 != 0) {
            return -103;
        }
        return b.c(-23, param1);
    }

    final static void a(gn param0, int param1, gn param2) {
        if (!(null == param2.field_b)) {
            param2.c((byte) -109);
        }
        param2.field_b = param0.field_b;
        param2.field_d = param0;
        if (param1 != 16737894) {
            return;
        }
        param2.field_b.field_d = param2;
        param2.field_d.field_b = param2;
    }

    final static void a(int param0, int param1, boolean param2) {
        int var3 = 0;
        tf var4 = null;
        Object var5 = null;
        gg var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        uv var16 = null;
        uv var17 = null;
        np stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        np stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        np stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        hd stackIn_16_0 = null;
        hd stackIn_17_0 = null;
        hd stackIn_18_0 = null;
        String stackIn_18_1 = null;
        int stackIn_21_0 = 0;
        np stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        np stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        np stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        hd stackOut_15_0 = null;
        hd stackOut_17_0 = null;
        String stackOut_17_1 = null;
        hd stackOut_16_0 = null;
        String stackOut_16_1 = null;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        L0: {
          var15 = Kickabout.field_G;
          stackOut_0_0 = nq.field_F.field_Cb;
          stackOut_0_1 = (3 * sh.field_c - -6) * param0;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          if (nq.field_F.field_Cb != ig.field_f) {
            stackOut_2_0 = (np) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            break L0;
          } else {
            stackOut_1_0 = (np) (Object) stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            break L0;
          }
        }
        L1: {
          L2: {
            var3 = ((np) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2 != 0, param2, param1, false, 2 + sh.field_c) ? 1 : 0;
            var4 = nq.field_F.field_yb.field_jb;
            if (-3 == (ts.field_d ^ -1)) {
              break L2;
            } else {
              if (1 != ts.field_d) {
                nq.field_F.field_Cb.field_zb.field_E = jw.field_yb;
                nq.field_F.field_lb = false;
                hl.a(true, nq.field_F.field_yb);
                break L1;
              } else {
                break L2;
              }
            }
          }
          nq.field_F.field_lb = true;
          nq.field_F.field_Cb.field_zb.field_E = null;
          var5 = null;
          var6 = (gg) (Object) var4.g(24009);
          L3: while (true) {
            if (var6 == null) {
              L4: {
                if (-1 == (nq.field_F.field_Eb.field_sb ^ -1)) {
                  break L4;
                } else {
                  k.field_m = new sl(nq.field_F.field_Eb.field_F, nq.field_F.field_Eb.field_T, nq.field_F.field_Eb.field_q, nq.field_F.field_Eb.field_mb, gt.field_j, pn.field_u, dw.field_e, dw.field_e);
                  fs.field_b = 2;
                  break L4;
                }
              }
              if (0 == nq.field_F.field_zb.field_sb) {
                break L1;
              } else {
                k.field_m = new sl(nq.field_F.field_zb.field_F, nq.field_F.field_zb.field_T, nq.field_F.field_zb.field_q, nq.field_F.field_zb.field_mb, oo.field_d, pn.field_u, dw.field_e, dw.field_e);
                fs.field_b = 3;
                break L1;
              }
            } else {
              L5: {
                var7 = 0;
                if (null != var6.field_jb) {
                  break L5;
                } else {
                  var6.field_Bb = new hd(0L, mp.field_f);
                  var6.a((byte) -109, var6.field_Bb);
                  var6.field_Fb = new hd(0L, mp.field_f);
                  var6.a((byte) -105, var6.field_Fb);
                  var6.b(false);
                  var7 = 1;
                  break L5;
                }
              }
              L6: {
                var6.field_q = nq.field_F.field_yb.field_q;
                var6.field_Bb.a(true, var6.field_q, 0, 0, sh.field_c);
                var8 = 0;
                if (null == var6.field_Eb) {
                  break L6;
                } else {
                  if (var6.field_Eb.equals((Object) (Object) "")) {
                    break L6;
                  } else {
                    var6.field_Fb.field_ub = 16737894;
                    var6.field_Fb.field_N = ll.field_n;
                    var6.field_Fb.a(true, 3 + ll.field_n.field_o, 0, 0, sh.field_c);
                    var8 = 1;
                    break L6;
                  }
                }
              }
              L7: {
                var9 = 0;
                var10 = var6.field_q;
                if (var8 == 0) {
                  break L7;
                } else {
                  var9 = ll.field_n.field_o + 3;
                  var10 = var10 - var9;
                  break L7;
                }
              }
              L8: {
                stackOut_15_0 = var6.field_Bb;
                stackIn_17_0 = stackOut_15_0;
                stackIn_16_0 = stackOut_15_0;
                if (0 < var10) {
                  stackOut_17_0 = (hd) (Object) stackIn_17_0;
                  stackOut_17_1 = hu.a(var6.field_Bb.field_X, var6.field_Gb, var10);
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  break L8;
                } else {
                  stackOut_16_0 = (hd) (Object) stackIn_16_0;
                  stackOut_16_1 = var6.field_Gb;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  break L8;
                }
              }
              L9: {
                stackIn_18_0.field_E = stackIn_18_1;
                if (var6.field_Bb.field_E.equals((Object) (Object) var6.field_Gb)) {
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  break L9;
                } else {
                  stackOut_19_0 = 1;
                  stackIn_21_0 = stackOut_19_0;
                  break L9;
                }
              }
              L10: {
                var11 = stackIn_21_0;
                var6.field_Bb.a(true, var10, var9, 0, sh.field_c);
                if (var3 == 0) {
                  var6.field_L = -var6.field_mb + sh.field_c;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                if (var7 == 0) {
                  break L11;
                } else {
                  nq.field_F.field_yb.a(true, 2, (hd) (Object) var6, (hd) var5);
                  break L11;
                }
              }
              L12: {
                L13: {
                  if (var6.field_Fb == null) {
                    break L13;
                  } else {
                    if (var6.field_Fb.field_gb) {
                      sn.field_e = var6.field_Eb;
                      break L12;
                    } else {
                      break L13;
                    }
                  }
                }
                if (!var6.field_Bb.field_gb) {
                  break L12;
                } else {
                  if (var11 == 0) {
                    break L12;
                  } else {
                    sn.field_e = var6.field_Gb;
                    break L12;
                  }
                }
              }
              L14: {
                if (var6.field_sb != 0) {
                  el.a((hd) (Object) var6, false, nq.field_F.field_Cb, -1, var6.field_yb, (int[]) null, 0L, var6.field_Gb, -1);
                  var16 = wi.field_v;
                  var13_ref_String = pb.field_D;
                  var16.field_j.a(0, 7, var13_ref_String);
                  var17 = wi.field_v;
                  var13 = sm.field_q;
                  var14 = vc.field_y;
                  var17.field_j.a(0, 0, var13, var14, 0);
                  break L14;
                } else {
                  break L14;
                }
              }
              var5 = (Object) (Object) var6;
              var6 = (gg) (Object) var4.c(33);
              continue L3;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Inviting <%0>";
        field_e = null;
    }
}
