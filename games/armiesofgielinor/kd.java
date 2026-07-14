/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd extends tj implements nq, he, mf {
    static String field_U;
    kv field_T;
    static je field_M;
    static int[][] field_Z;
    static wo field_J;
    private ma field_I;
    private ma field_K;
    private hv field_W;
    private fw field_bb;
    private ma field_H;
    private ma field_O;
    static String field_Y;
    private vu field_ab;
    static int field_X;
    private ma field_V;
    static String field_Q;
    static je field_F;
    static wo field_R;
    static String field_L;
    static String field_S;
    static String field_E;
    private fw field_G;
    private ma field_N;

    public final void a(int param0, String param1) {
        if (param0 != -1) {
            Object var5 = null;
            byte[] discarded$0 = kd.a(11, (bv) null, (byte[]) null, (byte) -8);
        }
        ma var3 = ((kd) this).field_O;
        String var4 = param1;
        ((fn) (Object) var3).a(false, var4, -27934);
    }

    final static byte[] a(int param0, bv param1, byte[] param2, byte param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        L0: {
          var8 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param3 <= -101) {
            break L0;
          } else {
            var9 = null;
            byte[] discarded$2 = kd.a(-26, (bv) null, (byte[]) null, (byte) -65);
            break L0;
          }
        }
        var4 = param1.g(-122, param0);
        if (-1 != (var4 ^ -1)) {
          L1: {
            L2: {
              if (param2 == null) {
                break L2;
              } else {
                if (var4 == param2.length) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            param2 = new byte[var4];
            break L1;
          }
          L3: {
            var5 = param1.g(-117, 3);
            var6 = (byte)param1.g(77, 8);
            if ((var5 ^ -1) >= -1) {
              var7 = 0;
              L4: while (true) {
                if (var7 >= var4) {
                  break L3;
                } else {
                  param2[var7] = (byte)var6;
                  var7++;
                  continue L4;
                }
              }
            } else {
              var7 = 0;
              L5: while (true) {
                if (var7 >= var4) {
                  break L3;
                } else {
                  param2[var7] = (byte)(var6 + param1.g(44, var5));
                  var7++;
                  continue L5;
                }
              }
            }
          }
          return param2;
        } else {
          return null;
        }
    }

    final static void a(int param0, String param1, ts param2, ka param3, byte param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param4 > 78) {
          var5 = 0;
          var6 = -1;
          var7 = 1;
          L0: while (true) {
            if (var7 >= param1.length()) {
              return;
            } else {
              L1: {
                var8 = param1.charAt(var7);
                if (var8 == 60) {
                  var6 = param2.field_i[0] + (var5 >> -771694200) - -param3.a(param1.substring(0, var7));
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (0 != (var6 ^ -1)) {
                  param2.field_i[var7] = var6;
                  break L2;
                } else {
                  L3: {
                    if (var8 != 32) {
                      break L3;
                    } else {
                      var5 = var5 + param0;
                      break L3;
                    }
                  }
                  param2.field_i[var7] = (var5 >> 543810344) - -param2.field_i[0] - (-param3.a(param1.substring(0, 1 + var7)) + param3.a((char) var8));
                  break L2;
                }
              }
              if (var8 == 62) {
                var6 = -1;
                var7++;
                continue L0;
              } else {
                var7++;
                continue L0;
              }
            }
          }
        } else {
          return;
        }
    }

    public kd() {
        super(0, 0, 496, 0, (kh) null);
        ((kd) this).field_O = new ma("", (qo) null, 12);
        ((kd) this).field_I = new ma("", (qo) null, 100);
        ((kd) this).field_H = new ma("", (qo) null, 100);
        ((kd) this).field_V = new ma("", (qo) null, 20);
        ((kd) this).field_K = new ma("", (qo) null, 20);
        ((kd) this).field_N = new ma("", (qo) null, 3);
        int var1 = 1;
        ((kd) this).field_ab = new vu("", (qo) null, var1 != 0);
        ((kd) this).field_bb = new fw(ed.field_c, (qo) null);
        ((kd) this).field_G = new fw(pt.field_Y, (qo) null);
        ((kd) this).field_O.field_s = ms.field_m;
        ((kd) this).field_I.field_s = bb.field_d;
        ((kd) this).field_H.field_s = oc.field_Jb;
        ((kd) this).field_V.field_s = bm.field_k;
        ((kd) this).field_K.field_s = ge.field_i;
        ((kd) this).field_N.field_s = f.field_A;
        ((kd) this).field_ab.field_s = rd.field_g;
        ((kd) this).field_O.a((byte) 16, (n) (Object) new uj((fn) (Object) ((kd) this).field_O));
        ((kd) this).field_I.a((byte) 16, (n) (Object) new vl((fn) (Object) ((kd) this).field_I));
        ((kd) this).field_H.a((byte) 16, (n) (Object) new kt((fn) (Object) ((kd) this).field_H, (fn) (Object) ((kd) this).field_I));
        ((kd) this).field_V.a((byte) 16, (n) (Object) new ib((fn) (Object) ((kd) this).field_V, (fn) (Object) ((kd) this).field_O, (fn) (Object) ((kd) this).field_I));
        ((kd) this).field_K.a((byte) 16, (n) (Object) new di((fn) (Object) ((kd) this).field_K, (fn) (Object) ((kd) this).field_V));
        ((kd) this).field_N.a((byte) 16, (n) (Object) new jh((fn) (Object) ((kd) this).field_N));
        ((kd) this).field_bb.field_I = false;
        ((kd) this).field_bb.field_k = (kh) (Object) new nu();
        ((kd) this).field_G.field_k = (kh) (Object) new td();
        ((kd) this).field_O.field_k = (kh) (Object) new lu(10000536);
        ((kd) this).field_H.field_k = (kh) (Object) new lu(10000536);
        ((kd) this).field_I.field_k = (kh) (Object) new lu(10000536);
        ((kd) this).field_N.field_k = (kh) (Object) new lu(10000536);
        ((kd) this).field_ab.field_k = (kh) (Object) new oi();
        ((kd) this).field_K.field_k = (kh) (Object) new ol(10000536);
        ((kd) this).field_V.field_k = (kh) (Object) new ol(10000536);
        String var2 = fo.a(4800, qq.field_D, new String[2]);
        int var3 = 20;
        var3 = var3 + this.a(tn.field_X, var3, 170, (byte) 18, (kb) (Object) ((kd) this).field_I);
        var3 = var3 + (this.a(false, 170, (kb) (Object) ((kd) this).field_H, hh.field_j, 20, "", var3) - -5);
        var3 = var3 + this.a(jj.field_h, var3, 170, (byte) 18, (kb) (Object) ((kd) this).field_V);
        var3 = var3 + (this.a(st.field_B, (kb) (Object) ((kd) this).field_K, 170, tf.field_m, 210, var3) + 5);
        var3 = var3 + (5 + this.a(dn.field_Ob, (kb) (Object) ((kd) this).field_O, 170, fq.field_k, 210, var3));
        var3 = var3 + this.a(var3, (kb) (Object) ((kd) this).field_N, 170, field_S, 27270);
        ta var4 = new ta(46, var3, ((kd) this).field_l + -90, 25, (kb) (Object) ((kd) this).field_ab, true, ((kd) this).field_l + -120, 5, gl.field_e, 11579568, wg.field_c);
        ((kd) this).a((byte) 10, (kb) (Object) var4);
        var3 = var3 + var4.field_w;
        lk var5 = new lk(ArmiesOfGielinor.field_J, 0, 0, 0, 0, 16777215, -1, 0, 0, ArmiesOfGielinor.field_J.field_H, -1, 2147483647, true);
        ((kd) this).field_W = new hv(var2, (kh) (Object) var5);
        ((kd) this).field_W.field_s = "";
        ((kd) this).field_W.a(nh.field_I, false, 0);
        ((kd) this).field_W.a(nh.field_I, false, 1);
        ((kd) this).field_W.field_x = (qo) this;
        ((kd) this).field_W.a(((kd) this).field_l + -90, 9567, 46, var3);
        var3 = var3 + (((kd) this).field_W.field_w + 15);
        ((kd) this).a((byte) 10, (kb) (Object) ((kd) this).field_W);
        int var6 = 4;
        int var7 = 200;
        ((kd) this).field_bb.a(496 + -var7 >> 59129633, var7, var3, 8192, 40);
        ((kd) this).field_G.a(var6 - -3, 60, 15 + var3, 8192, 40);
        ((kd) this).field_G.field_x = (qo) this;
        ((kd) this).field_bb.field_x = (qo) this;
        ((kd) this).a((byte) 10, (kb) (Object) ((kd) this).field_bb);
        ((kd) this).a((byte) 10, (kb) (Object) ((kd) this).field_G);
        ((kd) this).field_T = new kv((mf) this);
        ((kd) this).field_T.a(((kd) this).field_O.field_B - (-((kd) this).field_O.field_l - 60), ((kd) this).field_l + (-((kd) this).field_O.field_B - ((kd) this).field_O.field_l - 60), ((kd) this).field_O.field_p - -20, 8192, 150);
        ((kd) this).a((byte) 10, (kb) (Object) ((kd) this).field_T);
        ((kd) this).a(0, 496, 0, 8192, var3 + (55 + var6));
    }

    private final String m(int param0) {
        if (param0 != 150) {
            return null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    private final boolean a(boolean param0, eg param1) {
        if (!param0) {
            return false;
        }
        n var3 = param1.a(-918933630);
        if (!(var3 != null)) {
            return true;
        }
        gu var4 = var3.a(false);
        if (var4 == rn.field_e) {
            return false;
        }
        if (var4 == ad.field_K) {
            return false;
        }
        if (lq.field_c == var4) {
            return false;
        }
        return true;
    }

    public static void f(byte param0) {
        field_L = null;
        field_S = null;
        field_F = null;
        field_E = null;
        field_M = null;
        field_Z = null;
        field_Q = null;
        if (param0 != 19) {
            kd.f((byte) -98);
        }
        field_Y = null;
        field_R = null;
        field_U = null;
        field_J = null;
    }

    public final void a(int param0, int param1, byte param2, hv param3) {
        int var6 = 0;
        L0: {
          var6 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param2 >= 102) {
            break L0;
          } else {
            field_F = null;
            break L0;
          }
        }
        L1: {
          if (0 == param0) {
            ak.a("terms.ws", (byte) -106);
            break L1;
          } else {
            if ((param0 ^ -1) == -2) {
              ak.a("privacy.ws", (byte) -81);
              break L1;
            } else {
              if (param0 != 2) {
                break L1;
              } else {
                ak.a("conduct.ws", (byte) -98);
                break L1;
              }
            }
          }
        }
    }

    private final int a(int param0, kb param1, int param2, String param3, int param4) {
        ta var8 = new ta(20, param0, param2 + 120, 25, param1, false, 120, 3, ArmiesOfGielinor.field_J, 16777215, param3);
        if (param4 != 27270) {
            return -80;
        }
        ((kd) this).a((byte) 10, (kb) (Object) var8);
        kw var7 = new kw(((eg) (Object) param1).a(-918933630));
        ((kd) this).a((byte) 10, (kb) (Object) var7);
        var7.a(3 + var8.field_l + var8.field_B, 15, var8.field_p + (-15 + var8.field_w >> 230010881), 8192, 15);
        return var8.field_w;
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        L0: {
          if (param1 == 11) {
            break L0;
          } else {
            ((kd) this).field_I = null;
            break L0;
          }
        }
        L1: {
          if (((kd) this).field_G == param4) {
            ba.g(111);
            break L1;
          } else {
            if (param4 == ((kd) this).field_bb) {
              boolean discarded$5 = this.a(-1);
              break L1;
            } else {
              break L1;
            }
          }
        }
    }

    final void a(int param0, int param1, int param2, kb param3) {
        this.a(param0, param1, param2, param3);
        ((kd) this).field_bb.field_I = this.k(param0 ^ 32673);
    }

    private final String l(int param0) {
        if (param0 != 29406) {
            kd.a(109, -112, true);
        }
        return "</col></u>";
    }

    private final boolean k(int param0) {
        if (this.a(true, (eg) (Object) ((kd) this).field_O)) {
            // ifeq L75
            // ifeq L75
            // ifeq L75
            // ifeq L75
            // ifeq L75
        } else {
            return false;
        }
        if (param0 <= 96) {
            Object var3 = null;
            ((kd) this).a(6, (String) null);
        }
        return true;
    }

    final boolean a(kb param0, int param1, char param2, int param3) {
        if (!(!this.a(param0, param1, param2, param3))) {
            return true;
        }
        if (!((param1 ^ -1) != -99)) {
            return ((kd) this).a(false, param0);
        }
        if (99 != param1) {
            return false;
        }
        return ((kd) this).b((byte) -123, param0);
    }

    public final void a(byte param0) {
        if (param0 != -116) {
            return;
        }
        ((uj) (Object) ((kd) this).field_O.a(-918933630)).g(50);
    }

    private final int a(boolean param0, int param1, kb param2, String param3, int param4, String param5, int param6) {
        ta var10 = new ta(20, param6, 120 + param1, 25, param2, param0, 120, 3, ArmiesOfGielinor.field_J, 16777215, param3);
        ((kd) this).a((byte) 10, (kb) (Object) var10);
        pk var9 = new pk(((eg) (Object) param2).a(-918933630), param5, 126, var10.field_w + param6, param1 + 50, param4);
        var9.field_x = (qo) this;
        ((kd) this).a((byte) 10, (kb) (Object) var9);
        return var10.field_w - -var9.field_w;
    }

    private final int a(String param0, kb param1, int param2, String param3, int param4, int param5) {
        if (param4 != 210) {
            field_Y = null;
        }
        return this.a(false, param2, param1, param3, 35, param0, param5);
    }

    private final int a(String param0, int param1, int param2, byte param3, kb param4) {
        ta var6 = new ta(20, param1, param2 + 120, 25, param4, false, 120, 3, ArmiesOfGielinor.field_J, 16777215, param0);
        ((kd) this).a((byte) 10, (kb) (Object) var6);
        if (param3 != 18) {
            ((kd) this).field_G = null;
        }
        return var6.field_w;
    }

    final static void a(int param0, int param1, boolean param2) {
        int var3 = 0;
        CharSequence var6 = null;
        String var5 = null;
        String var4 = null;
        if (null != tb.field_e) {
            var3 = tb.field_e.b(true, param2);
            if (0 == var3) {
            } else {
                if (var3 == 2) {
                    if (tb.field_e.field_X != null) {
                        if (!tb.field_e.field_X.equals((Object) (Object) "")) {
                            if (tb.field_e.field_X.charAt(0) == 91) {
                                var4 = tb.field_e.field_X;
                            } else {
                                var6 = (CharSequence) (Object) tb.field_e.field_X;
                                var4 = k.a(var6, false);
                                var5 = var4;
                                var5 = var4;
                            }
                            var5 = null;
                            if (!(0 != ut.field_fb)) {
                                var5 = op.a(20, var4, param1);
                            }
                            if (!((ut.field_fb ^ -1) != -2)) {
                                var5 = nw.a(var4, (byte) -27, param1);
                            }
                            if (!((ut.field_fb ^ -1) != -3)) {
                                var5 = se.a(var4, param1, param0 + -83);
                            }
                            if ((ut.field_fb ^ -1) == -4) {
                                var5 = fq.a(param1, var4, false, var4);
                            }
                            if (!(var5 == null)) {
                                ta.a((String) null, 2, param0 ^ -18117, var4, var5, 0);
                            }
                        }
                    }
                }
                tb.field_e = null;
                ut.field_fb = -1;
            }
        }
        if (param0 != 2) {
            field_F = null;
        }
    }

    private final boolean a(int param0) {
        if (!(this.k(97))) {
            return false;
        }
        int var2 = param0;
        try {
            if (false) throw (NumberFormatException) null;
            var2 = Integer.parseInt(((kd) this).field_N.field_v);
        } catch (NumberFormatException numberFormatException) {
        }
        return eo.a(((kd) this).field_ab.field_K, (kd) this, ((kd) this).field_V.field_v, ((kd) this).field_I.field_v, var2, (byte) -110, ((kd) this).field_O.field_v);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_X = -1;
        field_Y = "Continue Mission";
        field_U = "Names cannot start or end with space or underscore";
        field_Q = "King Black Dragon summoner";
        field_S = "Age:";
        field_Z = new int[][]{new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[0], new int[0], new int[0], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10], new int[10]};
        field_E = "Team chat off";
        field_L = "Friends";
    }
}
