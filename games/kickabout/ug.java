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

    public static void a() {
        field_e = null;
        field_f = null;
        field_d = null;
        field_c = null;
        field_a = null;
        field_b = null;
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
        try {
            param2.field_b.field_d = param2;
            param2.field_d.field_b = param2;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ug.B(" + (param0 != null ? "{...}" : "null") + 44 + 16737894 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(int param0, int param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
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
        np stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        np stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        np stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        hd stackIn_17_0 = null;
        hd stackIn_18_0 = null;
        hd stackIn_19_0 = null;
        String stackIn_19_1 = null;
        int stackIn_22_0 = 0;
        RuntimeException decompiledCaughtException = null;
        np stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        np stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        np stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        hd stackOut_16_0 = null;
        hd stackOut_18_0 = null;
        String stackOut_18_1 = null;
        hd stackOut_17_0 = null;
        String stackOut_17_1 = null;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        var15 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              stackOut_1_0 = nq.field_F.field_Cb;
              stackOut_1_1 = (3 * sh.field_c - -6) * param0;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (nq.field_F.field_Cb != ig.field_f) {
                stackOut_3_0 = (np) (Object) stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                break L1;
              } else {
                stackOut_2_0 = (np) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                break L1;
              }
            }
            L2: {
              L3: {
                var3_int = ((np) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2 != 0, param2, 2, false, 2 + sh.field_c) ? 1 : 0;
                var4 = nq.field_F.field_yb.field_jb;
                if (ts.field_d == 2) {
                  break L3;
                } else {
                  if (1 != ts.field_d) {
                    nq.field_F.field_Cb.field_zb.field_E = jw.field_yb;
                    nq.field_F.field_lb = false;
                    hl.a(true, nq.field_F.field_yb);
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              nq.field_F.field_lb = true;
              nq.field_F.field_Cb.field_zb.field_E = null;
              var5 = null;
              var6 = (gg) (Object) var4.g(24009);
              L4: while (true) {
                if (var6 == null) {
                  L5: {
                    if (nq.field_F.field_Eb.field_sb == 0) {
                      break L5;
                    } else {
                      k.field_m = new sl(nq.field_F.field_Eb.field_F, nq.field_F.field_Eb.field_T, nq.field_F.field_Eb.field_q, nq.field_F.field_Eb.field_mb, gt.field_j, pn.field_u, dw.field_e, dw.field_e);
                      fs.field_b = 2;
                      break L5;
                    }
                  }
                  if (0 == nq.field_F.field_zb.field_sb) {
                    break L2;
                  } else {
                    k.field_m = new sl(nq.field_F.field_zb.field_F, nq.field_F.field_zb.field_T, nq.field_F.field_zb.field_q, nq.field_F.field_zb.field_mb, oo.field_d, pn.field_u, dw.field_e, dw.field_e);
                    fs.field_b = 3;
                    break L2;
                  }
                } else {
                  L6: {
                    var7 = 0;
                    if (null != var6.field_jb) {
                      break L6;
                    } else {
                      var6.field_Bb = new hd(0L, mp.field_f);
                      var6.a((byte) -109, var6.field_Bb);
                      var6.field_Fb = new hd(0L, mp.field_f);
                      var6.a((byte) -105, var6.field_Fb);
                      var6.b(false);
                      var7 = 1;
                      break L6;
                    }
                  }
                  L7: {
                    var6.field_q = nq.field_F.field_yb.field_q;
                    var6.field_Bb.a(true, var6.field_q, 0, 0, sh.field_c);
                    var8 = 0;
                    if (null == var6.field_Eb) {
                      break L7;
                    } else {
                      if (var6.field_Eb.equals((Object) (Object) "")) {
                        break L7;
                      } else {
                        var6.field_Fb.field_ub = 16737894;
                        var6.field_Fb.field_N = ll.field_n;
                        var6.field_Fb.a(true, 3 + ll.field_n.field_o, 0, 0, sh.field_c);
                        var8 = 1;
                        break L7;
                      }
                    }
                  }
                  L8: {
                    var9 = 0;
                    var10 = var6.field_q;
                    if (var8 == 0) {
                      break L8;
                    } else {
                      var9 = ll.field_n.field_o + 3;
                      var10 = var10 - var9;
                      break L8;
                    }
                  }
                  L9: {
                    stackOut_16_0 = var6.field_Bb;
                    stackIn_18_0 = stackOut_16_0;
                    stackIn_17_0 = stackOut_16_0;
                    if (0 < var10) {
                      stackOut_18_0 = (hd) (Object) stackIn_18_0;
                      stackOut_18_1 = hu.a(var6.field_Bb.field_X, var6.field_Gb, var10);
                      stackIn_19_0 = stackOut_18_0;
                      stackIn_19_1 = stackOut_18_1;
                      break L9;
                    } else {
                      stackOut_17_0 = (hd) (Object) stackIn_17_0;
                      stackOut_17_1 = var6.field_Gb;
                      stackIn_19_0 = stackOut_17_0;
                      stackIn_19_1 = stackOut_17_1;
                      break L9;
                    }
                  }
                  L10: {
                    stackIn_19_0.field_E = stackIn_19_1;
                    if (var6.field_Bb.field_E.equals((Object) (Object) var6.field_Gb)) {
                      stackOut_21_0 = 0;
                      stackIn_22_0 = stackOut_21_0;
                      break L10;
                    } else {
                      stackOut_20_0 = 1;
                      stackIn_22_0 = stackOut_20_0;
                      break L10;
                    }
                  }
                  L11: {
                    var11 = stackIn_22_0;
                    var6.field_Bb.a(true, var10, var9, 0, sh.field_c);
                    if (var3_int == 0) {
                      var6.field_L = -var6.field_mb + sh.field_c;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  L12: {
                    if (var7 == 0) {
                      break L12;
                    } else {
                      nq.field_F.field_yb.a(true, 2, (hd) (Object) var6, (hd) var5);
                      break L12;
                    }
                  }
                  L13: {
                    L14: {
                      if (var6.field_Fb == null) {
                        break L14;
                      } else {
                        if (var6.field_Fb.field_gb) {
                          sn.field_e = var6.field_Eb;
                          break L13;
                        } else {
                          break L14;
                        }
                      }
                    }
                    if (!var6.field_Bb.field_gb) {
                      break L13;
                    } else {
                      if (var11 == 0) {
                        break L13;
                      } else {
                        sn.field_e = var6.field_Gb;
                        break L13;
                      }
                    }
                  }
                  L15: {
                    if (var6.field_sb != 0) {
                      el.a((hd) (Object) var6, false, nq.field_F.field_Cb, -1, var6.field_yb, (int[]) null, 0L, var6.field_Gb, -1);
                      var16 = wi.field_v;
                      var13_ref_String = pb.field_D;
                      var16.field_j.a(0, 7, var13_ref_String);
                      var17 = wi.field_v;
                      var13 = sm.field_q;
                      var14 = vc.field_y;
                      var17.field_j.a(0, 0, var13, var14, 0);
                      break L15;
                    } else {
                      break L15;
                    }
                  }
                  var5 = (Object) (Object) var6;
                  var6 = (gg) (Object) var4.c(33);
                  continue L4;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw nb.a((Throwable) (Object) var3, "ug.A(" + param0 + 44 + 2 + 44 + param2 + 41);
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
