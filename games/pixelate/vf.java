/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class vf {
    static String field_c;
    static String field_b;
    static String field_a;

    public static void a(int param0) {
        if (param0 > -104) {
            Object var2 = null;
            vf.a((java.applet.Applet) null, 33);
        }
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static void a(byte param0) {
        int var4 = Pixelate.field_H ? 1 : 0;
        if (param0 != -37) {
            return;
        }
        int[] var5 = sc.field_i;
        int[] var1 = var5;
        int var2 = 0;
        int var3 = var5.length;
        while (var2 < var3) {
            int incrementValue$0 = var2;
            var2++;
            var5[incrementValue$0] = 0;
            int incrementValue$1 = var2;
            var2++;
            var5[incrementValue$1] = 0;
            int incrementValue$2 = var2;
            var2++;
            var5[incrementValue$2] = 0;
            int incrementValue$3 = var2;
            var2++;
            var5[incrementValue$3] = 0;
            int incrementValue$4 = var2;
            var2++;
            var5[incrementValue$4] = 0;
            int incrementValue$5 = var2;
            var2++;
            var5[incrementValue$5] = 0;
            int incrementValue$6 = var2;
            var2++;
            var5[incrementValue$6] = 0;
            int incrementValue$7 = var2;
            var2++;
            var5[incrementValue$7] = 0;
        }
    }

    final static boolean a(byte param0, char param1) {
        int var4 = 0;
        int var5 = Pixelate.field_H ? 1 : 0;
        if (!(!Character.isISOControl(param1))) {
            return false;
        }
        if (!(!dd.a(param1, (byte) 122))) {
            return true;
        }
        char[] var2 = wh.field_r;
        int var3 = 0;
        if (param0 != -3) {
            field_c = null;
        }
        while (var3 < var2.length) {
            var4 = var2[var3];
            if (!(var4 != param1)) {
                return true;
            }
            var3++;
        }
        char[] var6 = uh.field_b;
        var2 = var6;
        int var7 = 0;
        var3 = var7;
        while (var7 < var6.length) {
            var4 = var6[var7];
            if (!(param1 != var4)) {
                return true;
            }
            var7++;
        }
        return false;
    }

    final static void a(boolean param0, int param1, int param2) {
        int var3 = 0;
        bb var4 = null;
        Object var5 = null;
        im var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String var13_ref_String = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        wi var17 = null;
        wi var18 = null;
        gp stackIn_1_0 = null;
        boolean stackIn_1_1 = false;
        gp stackIn_2_0 = null;
        boolean stackIn_2_1 = false;
        gp stackIn_3_0 = null;
        boolean stackIn_3_1 = false;
        int stackIn_3_2 = 0;
        ak stackIn_18_0 = null;
        ak stackIn_19_0 = null;
        ak stackIn_20_0 = null;
        String stackIn_20_1 = null;
        int stackIn_23_0 = 0;
        gp stackOut_0_0 = null;
        boolean stackOut_0_1 = false;
        gp stackOut_2_0 = null;
        boolean stackOut_2_1 = false;
        int stackOut_2_2 = 0;
        gp stackOut_1_0 = null;
        boolean stackOut_1_1 = false;
        int stackOut_1_2 = 0;
        ak stackOut_17_0 = null;
        ak stackOut_19_0 = null;
        String stackOut_19_1 = null;
        ak stackOut_18_0 = null;
        String stackOut_18_1 = null;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        L0: {
          var15 = Pixelate.field_H ? 1 : 0;
          stackOut_0_0 = v.field_e.field_Gb;
          stackOut_0_1 = param0;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          if (bj.field_d != v.field_e.field_Gb) {
            stackOut_2_0 = (gp) (Object) stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            break L0;
          } else {
            stackOut_1_0 = (gp) (Object) stackIn_1_0;
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
            var3 = ((gp) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2 != 0, 2, 3 * (fq.field_q + 2) * param2, param1 ^ param1, 2 + fq.field_q) ? 1 : 0;
            var4 = v.field_e.field_Fb.field_L;
            if (2 == gk.field_db) {
              break L2;
            } else {
              if (1 == gk.field_db) {
                break L2;
              } else {
                v.field_e.field_Gb.field_Ib.field_cb = mk.field_c;
                v.field_e.field_rb = false;
                wd.a(v.field_e.field_Fb, false);
                break L1;
              }
            }
          }
          v.field_e.field_rb = true;
          v.field_e.field_Gb.field_Ib.field_cb = null;
          var5 = null;
          var6 = (im) (Object) var4.c(1504642273);
          L3: while (true) {
            if (var6 == null) {
              L4: {
                if (-1 == (v.field_e.field_Ib.field_P ^ -1)) {
                  break L4;
                } else {
                  he.field_f = new ve(v.field_e.field_Ib.field_tb, v.field_e.field_Ib.field_gb, v.field_e.field_Ib.field_K, v.field_e.field_Ib.field_nb, dp.field_p, po.field_c, mg.field_h, mg.field_h);
                  il.field_e = 2;
                  break L4;
                }
              }
              if (v.field_e.field_Hb.field_P != 0) {
                he.field_f = new ve(v.field_e.field_Hb.field_tb, v.field_e.field_Hb.field_gb, v.field_e.field_Hb.field_K, v.field_e.field_Hb.field_nb, uf.field_f, po.field_c, mg.field_h, mg.field_h);
                il.field_e = 3;
                break L1;
              } else {
                break L1;
              }
            } else {
              L5: {
                var7 = 0;
                if (null != var6.field_L) {
                  break L5;
                } else {
                  var6.field_Pb = new ak(0L, ak.field_T);
                  var6.a(var6.field_Pb, (byte) 26);
                  var6.field_Ob = new ak(0L, ak.field_T);
                  var6.a(var6.field_Ob, (byte) 26);
                  var6.h(-257);
                  var7 = 1;
                  break L5;
                }
              }
              L6: {
                var6.field_K = v.field_e.field_Fb.field_K;
                var6.field_Pb.a(0, fq.field_q, 0, param1 ^ 256, var6.field_K);
                var8 = 0;
                if (null == var6.field_Gb) {
                  break L6;
                } else {
                  if (!var6.field_Gb.equals((Object) (Object) "")) {
                    var6.field_Ob.field_y = 16737894;
                    var6.field_Ob.field_H = dk.field_e;
                    var6.field_Ob.a(0, fq.field_q, 0, param1 + 256, dk.field_e.field_A + 3);
                    var8 = 1;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                var9 = 0;
                var10 = var6.field_K;
                if (var8 != 0) {
                  var9 = dk.field_e.field_A - -3;
                  var10 = var10 - var9;
                  break L7;
                } else {
                  break L7;
                }
              }
              L8: {
                stackOut_17_0 = var6.field_Pb;
                stackIn_19_0 = stackOut_17_0;
                stackIn_18_0 = stackOut_17_0;
                if (0 >= var10) {
                  stackOut_19_0 = (ak) (Object) stackIn_19_0;
                  stackOut_19_1 = var6.field_Fb;
                  stackIn_20_0 = stackOut_19_0;
                  stackIn_20_1 = stackOut_19_1;
                  break L8;
                } else {
                  stackOut_18_0 = (ak) (Object) stackIn_18_0;
                  stackOut_18_1 = jl.a(var6.field_Pb.field_Db, var6.field_Fb, var10);
                  stackIn_20_0 = stackOut_18_0;
                  stackIn_20_1 = stackOut_18_1;
                  break L8;
                }
              }
              L9: {
                stackIn_20_0.field_cb = stackIn_20_1;
                if (var6.field_Pb.field_cb.equals((Object) (Object) var6.field_Fb)) {
                  stackOut_22_0 = 0;
                  stackIn_23_0 = stackOut_22_0;
                  break L9;
                } else {
                  stackOut_21_0 = 1;
                  stackIn_23_0 = stackOut_21_0;
                  break L9;
                }
              }
              L10: {
                var11 = stackIn_23_0;
                var6.field_Pb.a(0, fq.field_q, var9, param1 + 256, var10);
                if (var3 != 0) {
                  break L10;
                } else {
                  var6.field_Z = fq.field_q - var6.field_nb;
                  break L10;
                }
              }
              L11: {
                if (var7 != 0) {
                  v.field_e.field_Fb.a((ak) (Object) var6, 2, -1, (ak) var5);
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                L13: {
                  if (var6.field_Ob == null) {
                    break L13;
                  } else {
                    if (var6.field_Ob.field_W) {
                      up.field_o = var6.field_Gb;
                      break L12;
                    } else {
                      break L13;
                    }
                  }
                }
                if (!var6.field_Pb.field_W) {
                  break L12;
                } else {
                  if (var11 == 0) {
                    break L12;
                  } else {
                    up.field_o = var6.field_Fb;
                    break L12;
                  }
                }
              }
              L14: {
                if (var6.field_P != 0) {
                  em.a(var6.field_Fb, 0L, var6.field_Ib, -1, (ak) (Object) var6, -163, v.field_e.field_Gb, (int[]) null, -1);
                  var17 = eg.field_n;
                  var13_ref_String = k.field_n;
                  var17.field_b.a(var13_ref_String, (byte) -107, 7);
                  var18 = eg.field_n;
                  var13 = uo.field_a;
                  var14 = ji.field_c;
                  var18.field_b.b(0, var13, 43, var14, 0);
                  break L14;
                } else {
                  break L14;
                }
              }
              var5 = (Object) (Object) var6;
              var6 = (im) (Object) var4.f(1504642273);
              continue L3;
            }
          }
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            String var4 = null;
            int var3 = 0;
            java.net.URL var5 = null;
            try {
                if (param1 != 3279) {
                    field_c = null;
                }
                var2 = param0.getDocumentBase().getFile();
                var4 = var2;
                var4 = var2;
                var3 = var2.indexOf('?');
                var4 = "reload.ws";
                if ((var3 ^ -1) <= -1) {
                    var4 = var4 + var2.substring(var3);
                }
                var5 = new java.net.URL(param0.getCodeBase(), var4);
                param0.getAppletContext().showDocument(lg.a(false, param0, var5), "_self");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Kick <%0> from this game";
        field_c = "Click";
        field_a = "Connection lost. <%0>";
    }
}
