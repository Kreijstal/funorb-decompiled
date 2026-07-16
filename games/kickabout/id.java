/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class id extends qv {
    static byte[] field_u;
    private hf[] field_w;
    static r field_t;
    private hf field_x;
    static sj field_y;
    static String field_r;
    static int field_v;
    static hd field_s;

    final hf a(int param0, int param1) {
        if (param1 != -12085) {
            return null;
        }
        hf dupTemp$0 = new hf();
        ((id) this).field_w[param0] = dupTemp$0;
        return dupTemp$0;
    }

    private final void a(id param0, boolean param1, int param2) {
        int var4 = 0;
        hf var5 = null;
        hf var6 = null;
        int var7 = 0;
        Object var8 = null;
        hf stackIn_5_0 = null;
        hf stackIn_6_0 = null;
        hf stackIn_7_0 = null;
        hf stackIn_7_1 = null;
        hf stackOut_4_0 = null;
        hf stackOut_6_0 = null;
        hf stackOut_6_1 = null;
        hf stackOut_5_0 = null;
        hf stackOut_5_1 = null;
        L0: {
          var7 = Kickabout.field_G;
          super.a((qv) (Object) param0, (byte) -112);
          if (!param1) {
            dv.a((Object[]) (Object) ((id) this).field_w, 0, (Object[]) (Object) param0.field_w, 0, 6);
            break L0;
          } else {
            var4 = 0;
            L1: while (true) {
              if (-7 >= (var4 ^ -1)) {
                break L0;
              } else {
                var5 = ((id) this).field_w[var4];
                if (var5 == null) {
                  param0.field_w[var4] = null;
                  var4++;
                  continue L1;
                } else {
                  L2: {
                    var6 = param0.field_w[var4];
                    stackOut_4_0 = (hf) var5;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (var6 == null) {
                      hf dupTemp$49 = new hf();
                      param0.field_w[var4] = dupTemp$49;
                      stackOut_6_0 = (hf) (Object) stackIn_6_0;
                      stackOut_6_1 = (hf) dupTemp$49;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = (hf) (Object) stackIn_5_0;
                      stackOut_5_1 = (hf) var6;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  ((hf) (Object) stackIn_7_0).a(stackIn_7_1, -2147483648);
                  var4++;
                  continue L1;
                }
              }
            }
          }
        }
        L3: {
          if (param2 < -97) {
            break L3;
          } else {
            var8 = null;
            ((id) this).a(-126, true, -77, (fd) null, 67);
            break L3;
          }
        }
    }

    final static boolean a(boolean param0, CharSequence param1, char param2) {
        if (!ws.a(param2, (byte) 121)) {
            return false;
        }
        if (!(param1 != null)) {
            return false;
        }
        int var3 = param1.length();
        if (var3 >= 12) {
            return false;
        }
        if (ca.a(param0, param2)) {
            if (-1 != (var3 ^ -1)) {
                return true;
            }
            return false;
        }
        return true;
    }

    final void a(ut[] param0, int param1) {
        hf[] var3 = null;
        int var4 = 0;
        hf var5 = null;
        int var6 = 0;
        hf[] var7 = null;
        L0: {
          var6 = Kickabout.field_G;
          if (param1 == -23952) {
            break L0;
          } else {
            field_u = null;
            break L0;
          }
        }
        var7 = ((id) this).field_w;
        var3 = var7;
        var4 = 0;
        L1: while (true) {
          if (var4 >= var7.length) {
            return;
          } else {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_g = param0;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final static void a(sj param0, sj param1, boolean param2, sj param3) {
        int var8 = 0;
        int var9 = 0;
        kg[] var14 = null;
        int var11_int = 0;
        int var13 = Kickabout.field_G;
        sk.field_a = se.a(param3, -9, "commonui", "frame_top");
        vb.field_a = se.a(param3, -120, "commonui", "frame_bottom");
        aa.field_f = wa.a((byte) 112, "commonui", param3, "jagex_logo_grey");
        nw.field_a = se.a(param3, -29, "commonui", "button");
        jc.field_g = ng.a("validation", "commonui", 2, param3);
        qo.field_k = (hu) (Object) gm.a(param1, 10, "arezzo12", param3, "commonui");
        gf.field_a = (hu) (Object) gm.a(param1, 10, "arezzo14", param3, "commonui");
        fj.field_b = (hu) (Object) gm.a(param1, 10, "arezzo14bold", param3, "commonui");
        ut var17 = new ut(param0.a("", "button.gif", 34), (java.awt.Component) (Object) ic.field_d);
        kg discarded$0 = fw.a(param3, "commonui", !param2 ? true : false, "dropdown");
        kg[] var5 = jo.a(param3, 17369, "commonui", "screen_options");
        dw.field_d = new kg[4];
        tj.field_f = new kg[4];
        kk.field_Q = new kg[4];
        kg[][] var6 = new kg[][]{kk.field_Q, tj.field_f, dw.field_d};
        int[][] var21 = new int[4][];
        int[][] var20 = var21;
        int[][] var19 = var20;
        int[][] var16 = var19;
        int[][] var7 = var16;
        var7[0] = var5[0].field_l;
        for (var8 = 1; var8 < var21.length; var8++) {
            var7[var8] = (int[]) var21[0].clone();
        }
        var8 = var5[0].field_m[0];
        var21[2][var8] = 16777215;
        var21[1][var8] = 2394342;
        var21[3][var8] = 4767999;
        for (var9 = 0; -4 < (var9 ^ -1); var9++) {
            var14 = var6[var9];
            kg[] var10 = var14;
            for (var11_int = 0; var14.length > var11_int; var11_int++) {
                var14[var11_int] = ul.a(var5[var9], (byte) 100, var21[var11_int]);
            }
        }
        var9 = var17.field_w;
        tr.d(-12974);
        var17.e();
        on.b(0, 0, on.field_g, on.field_f);
        ut var15 = new ut(var9, var9);
        ut var18 = var15;
        var18.e();
        var17.d(0, 0);
        ut var11 = new ut(var9, var9);
        var11.e();
        var17.d(-var17.field_q + var9, 0);
        ut var12 = new ut(-(2 * var9) + var17.field_q, var9);
        var12.e();
        var17.d(-var9, 0);
        ta.e(119);
        nw.field_a = new ut[]{var15, var12, var11};
        if (param2) {
            boolean discarded$1 = id.a(false, (CharSequence) null, 'ﾺ');
        }
    }

    public final void a(int param0, boolean param1, int param2, fd param3, int param4) {
        hf var7 = null;
        int var8 = 0;
        wi var10 = null;
        hf var11 = null;
        hf var12 = null;
        hf var13 = null;
        hf var14 = null;
        hf var15 = null;
        fd stackIn_3_0 = null;
        fd stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          if (param3 instanceof wi) {
            stackOut_2_0 = (fd) param3;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (fd) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var10 = (wi) (Object) stackIn_3_0;
          pt.a(param3.field_t + (param4 - -param3.field_n), -22914, param3.field_t + param4, param3.field_i + (param2 + param3.field_g), param2 + param3.field_g);
          if (var10 == null) {
            break L1;
          } else {
            param1 = param1 & var10.field_y;
            break L1;
          }
        }
        L2: {
          var7 = ((id) this).field_w[0];
          ((id) this).field_x.a(-13136);
          var7.a(param2, -2147483648, (id) this, param3, param4, ((id) this).field_x);
          if (var10 != null) {
            L3: {
              if (!var10.field_A) {
                break L3;
              } else {
                var11 = ((id) this).field_w[1];
                if (var11 != null) {
                  var11.a(param2, -2147483648, (id) this, param3, param4, ((id) this).field_x);
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            if (!var10.field_m) {
              break L2;
            } else {
              L4: {
                var13 = ((id) this).field_w[3];
                if (0 == var10.field_p) {
                  break L4;
                } else {
                  if (var13 != null) {
                    var13.a(param2, -2147483648, (id) this, param3, param4, ((id) this).field_x);
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              var12 = ((id) this).field_w[2];
              if (var12 == null) {
                break L2;
              } else {
                var12.a(param2, -2147483648, (id) this, param3, param4, ((id) this).field_x);
                break L2;
              }
            }
          } else {
            break L2;
          }
        }
        L5: {
          var8 = -44 / ((param0 - 59) / 53);
          if (!param3.b(15)) {
            break L5;
          } else {
            var14 = ((id) this).field_w[5];
            if (var14 != null) {
              var14.a(param2, -2147483648, (id) this, param3, param4, ((id) this).field_x);
              break L5;
            } else {
              break L5;
            }
          }
        }
        L6: {
          if (!param1) {
            var15 = ((id) this).field_w[4];
            if (var15 == null) {
              break L6;
            } else {
              var15.a(param2, -2147483648, (id) this, param3, param4, ((id) this).field_x);
              break L6;
            }
          } else {
            break L6;
          }
        }
        ((id) this).field_x.a(param3, (id) this, param2, param4, 0);
        ta.e(127);
    }

    public id() {
        ((id) this).field_w = new hf[6];
        ((id) this).field_x = new hf();
        hf dupTemp$0 = new hf();
        ((id) this).field_w[0] = dupTemp$0;
        hf var1 = dupTemp$0;
        var1.a(-13136);
    }

    public static void a(int param0) {
        field_r = null;
        field_s = null;
        field_y = null;
        if (param0 > -99) {
            field_r = null;
        }
        field_u = null;
        field_t = null;
    }

    id(id param0, boolean param1) {
        this();
        param0.a((id) this, param1, -116);
    }

    final void a(ut param0, byte param1) {
        hf[] var3 = null;
        int var4 = 0;
        hf var5 = null;
        int var6 = 0;
        L0: {
          var6 = Kickabout.field_G;
          var3 = ((id) this).field_w;
          var4 = 0;
          if (param1 <= -86) {
            break L0;
          } else {
            boolean discarded$2 = id.a(false, (CharSequence) null, 'ﾴ');
            break L0;
          }
        }
        L1: while (true) {
          if (var3.length <= var4) {
            return;
          } else {
            var5 = var3[var4];
            if (var5 != null) {
              var5.field_j = param0;
              var4++;
              continue L1;
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    final void a(int param0, ut[] param1, int param2) {
        int var4 = -99 / ((11 - param2) / 60);
        int var5 = param0;
        if (!(((id) this).field_w[var5] != null)) {
            ((id) this).field_w[var5] = new hf();
        }
        ((id) this).field_w[param0].field_g = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = new byte[520];
        field_t = new r();
        field_r = "Your rating is <%0>";
    }
}
