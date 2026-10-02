/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh extends ee implements pe, pl, ta {
    static gk field_F;
    private hc field_N;
    private hc field_R;
    private hc field_G;
    vh field_K;
    private hc field_H;
    private hc field_M;
    private hc field_I;
    static int field_J;
    private vf field_E;
    static Sprite[] field_O;
    private hk field_D;
    static boolean[] field_C;
    private vi field_P;
    static String createPasswordHintText;
    static String tutorialFailedMessage;
    private hk field_L;

    private final int a(int param0, String param1, int param2, el param3, int param4) {
        hd var6 = null;
        RuntimeException var6_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 == 5) {
            var6 = new hd(20, param0, 120 + param2, 25, param3, false, 120, 3, ng.field_F, 16777215, param1);
            this.b((byte) -114, var6);
            stackIn_4_0 = var6.field_h;
            decompiledRegionSelector0 = 1;
          } else {
            stackIn_2_0 = 0;
            decompiledRegionSelector0 = 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_7_0 = (RuntimeException) (var6_ref);

          stackIn_7_1 = new StringBuilder().append("qh.S(").append(param0).append(',');

          if (param1 == null) {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "null";
          } else {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "{...}";
          }


          stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param2).append(',');

          if (param3 == null) {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "null";
          } else {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param4).append(')').toString());
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    private final int a(el param0, int param1, String param2, int param3, String param4, int param5, byte param6) {
        RuntimeException var8 = null;
        pi var9 = null;
        int var10 = 0;
        hd var11 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var11 = new hd(20, param5, 120 - -param1, 25, param0, false, 120, 3, ng.field_F, 16777215, param2);
          this.b((byte) -128, var11);
          var9 = new pi(((nl) ((Object) param0)).a((byte) -101), param4, 126, param5 - -var11.field_h, param1 - -50, param3);
          var9.field_u = (bb) (this);
          this.b((byte) -127, var9);
          var10 = 38 / ((-14 - param6) / 46);
          stackIn_1_0 = var9.field_h + var11.field_h;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_4_0 = (RuntimeException) (var8);

          stackIn_4_1 = new StringBuilder().append("qh.E(");

          if (param0 == null) {
            stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
            stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
            stackIn_5_2 = "null";
          } else {
            stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
            stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
            stackIn_5_2 = "{...}";
          }


          stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',');

          if (param2 == null) {
            stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "null";
          } else {
            stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "{...}";
          }


          stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param3).append(',');

          if (param4 == null) {
            stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "null";
          } else {
            stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
        return stackIn_1_0;
    }

    public qh() {
        super(0, 0, 496, 0, (dh) null);
        this.field_H = new hc("", (bb) null, 12);
        this.field_I = new hc("", (bb) null, 100);
        this.field_G = new hc("", (bb) null, 100);
        this.field_M = new hc("", (bb) null, 20);
        this.field_N = new hc("", (bb) null, 20);
        this.field_R = new hc("", (bb) null, 3);
        int var1 = 1;
        this.field_P = new vi("", (bb) null, var1 != 0);
        this.field_D = new hk(di.createText, (bb) null);
        this.field_L = new hk(hc.goBackText, (bb) null);
        this.field_H.field_j = ud.createDisplayNameTooltipText;
        this.field_I.field_j = ll.createEmailTooltipText;
        this.field_G.field_j = ok.createEmailConfirmationTooltipText;
        this.field_M.field_j = ij.createPasswordTooltipText;
        this.field_N.field_j = oi.createPasswordConfirmationTooltipText;
        this.field_R.field_j = pb.createAgeTooltipText;
        this.field_P.field_j = vi.createNewsOptInTooltipText;
        this.field_H.a((byte) -27, new uk(this.field_H));
        this.field_I.a((byte) -111, new ag(this.field_I));
        this.field_G.a((byte) 126, new mk(this.field_G, this.field_I));
        this.field_M.a((byte) 83, new g(this.field_M, this.field_H, this.field_I));
        this.field_N.a((byte) -71, new MatchingTextValidator(this.field_N, this.field_M));
        this.field_R.a((byte) -116, new cf(this.field_R));
        this.field_D.field_D = false;
        this.field_D.field_q = (dh) ((Object) new ml());
        this.field_L.field_q = (dh) ((Object) new fh());
        this.field_H.field_q = (dh) ((Object) new ac(10000536));
        ac dupTemp$0 = new ac(10000536);
        this.field_G.field_q = (dh) ((Object) dupTemp$0);
        this.field_I.field_q = (dh) ((Object) dupTemp$0);
        this.field_R.field_q = (dh) ((Object) new ac(10000536));
        this.field_P.field_q = (dh) ((Object) new oc());
        uh dupTemp$1 = new uh(10000536);
        this.field_N.field_q = (dh) ((Object) dupTemp$1);
        this.field_M.field_q = (dh) ((Object) dupTemp$1);
        String var2 = wj.a(bm.createAgreeTermsText, new String[]{this.b(false), this.c(false)}, (byte) -72);
        int var3 = 20;
        var3 = var3 + this.a(var3, ug.createEmailText, 170, this.field_I, 5);
        var3 = var3 + (5 + this.a(this.field_G, 170, ok.createEmailConfirmationText, 20, "", var3, (byte) -65));
        var3 = var3 + this.a(var3, qg.createPasswordText, 170, this.field_M, 5);
        var3 = var3 + (this.a(-99, this.field_N, v.createPasswordConfirmationText, var3, 170, createPasswordHintText) + 5);
        var3 = var3 + (this.a(-103, this.field_H, wj.createDisplayNameText, var3, 170, gk.createDisplayNameHintText) + 5);
        var3 = var3 + this.a(var3, 170, this.field_R, ue.createAgeText, (byte) -127);
        hd var4 = new hd(46, var3, this.field_r - 90, 25, this.field_P, true, this.field_r + -120, 5, hh.field_d, 11579568, ue.createNewsOptInText);
        this.b((byte) -106, var4);
        var3 = var3 + var4.field_h;
        ff var5 = new ff(ng.field_F, 0, 0, 0, 0, 16777215, -1, 0, 0, ng.field_F.field_o, -1, 2147483647, true);
        this.field_E = new vf(var2, var5);
        this.field_E.field_j = "";
        this.field_E.a(0, -42, eh.openInPopupWindowText);
        this.field_E.a(1, -62, eh.openInPopupWindowText);
        this.field_E.field_u = (bb) (this);
        this.field_E.b(46, 0, var3, -90 + this.field_r);
        var3 = var3 + (this.field_E.field_h + 15);
        this.b((byte) -73, this.field_E);
        int var6 = 4;
        int var7 = 200;
        this.field_D.a(40, var7, (byte) -53, var3, -var7 + 496 >> 1);
        this.field_L.a(40, 60, (byte) -118, var3 + 15, 3 + var6);
        this.field_L.field_u = (bb) (this);
        this.field_D.field_u = (bb) (this);
        this.b((byte) -83, this.field_D);
        this.b((byte) -108, this.field_L);
        this.field_K = new vh((ta) (this));
        this.field_K.a(150, -this.field_H.field_v + this.field_r - this.field_H.field_r + -60, (byte) -13, 20 + this.field_H.field_m, 60 + (this.field_H.field_r + this.field_H.field_v));
        this.b((byte) -113, this.field_K);
        this.a(55 + var3 - -var6, 496, (byte) -65, 0, 0);
    }

    private final boolean g(int param0) {
        if (!this.f(param0 ^ -19038)) {
            return false;
        }
        int var2 = -1;
        if (param0 != -21440) {
            field_C = (boolean[]) null;
        }
        try {
            var2 = Integer.parseInt(this.field_R.field_s);
        } catch (NumberFormatException numberFormatException) {
        }
        return mc.a(this.field_H.field_s, this.field_I.field_s, var2, (qh) (this), 0, this.field_P.field_y, this.field_M.field_s);
    }

    final static mb i(int param0) {
        String var1 = al.b(0);
        if (param0 == 25) {
            if (var1 != null && var1.indexOf('@') >= 0) {
                var1 = "";
            }
            return new mb(al.b(0), rl.n(-1071908447));
        }
        field_J = 84;
        if (var1 != null && var1.indexOf('@') >= 0) {
            var1 = "";
        }
        return new mb(al.b(0), rl.n(-1071908447));
    }

    private final int a(int param0, int param1, el param2, String param3, byte param4) {
        String discarded$1 = null;
        RuntimeException var6 = null;
        td var7 = null;
        hd var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = new hd(20, param0, param1 + 120, 25, param2, false, 120, 3, ng.field_F, 16777215, param3);
          this.b((byte) -120, var8);
          var7 = new td(((nl) ((Object) param2)).a((byte) -124));
          this.b((byte) -79, var7);
          if (param4 > -123) {
            discarded$1 = this.b(false);
          }
          var7.a(15, 15, (byte) -22, var8.field_m + (-15 + var8.field_h >> 1), 3 + var8.field_r + var8.field_v);
          stackIn_3_0 = var8.field_h;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_6_0 = (RuntimeException) (var6);

          stackIn_6_1 = new StringBuilder().append("qh.G(").append(param0).append(',').append(param1).append(',');

          if (param2 == null) {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
            stackIn_7_2 = "null";
          } else {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
            stackIn_7_2 = "{...}";
          }


          stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

          if (param3 == null) {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
            stackIn_10_2 = "null";
          } else {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param4).append(')').toString());
        }
        return stackIn_3_0;
    }

    public final void a(vf param0, int param1, int param2, int param3) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Geoblox.field_C;
        try {
          if (0 != param1) {
            if (param1 != 1) {
              if (param1 == 2) {
                uk.a(false, "conduct.ws");
              }
            } else {
              uk.a(false, "privacy.ws");
            }
          } else {
            uk.a(false, "terms.ws");
          }
          if (param2 != 2) {
            this.field_N = (hc) null;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = (RuntimeException) (var5);

          stackIn_13_1 = new StringBuilder().append("qh.A(");

          if (param0 == null) {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "null";
          } else {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void h(byte param0) {
        hb.field_j = f.p(125);
        int var1 = -117 / ((12 - param0) / 57);
        kd.field_e = new ng();
        b.a(true, true, false);
    }

    private final String c(boolean param0) {
        if (param0) {
            field_J = 75;
            return "</col></u>";
        }
        return "</col></u>";
    }

    public final void a(int param0, byte param1, int param2, int param3, hk param4) {
        boolean discarded$1 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          if (param4 == this.field_L) {
            qc.g(0);
          } else {
            if (this.field_D == param4) {
              discarded$1 = this.g(-21440);
            }
          }
          if (param1 != -20) {
            field_O = (Sprite[]) null;
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = (RuntimeException) (var6);

          stackIn_10_1 = new StringBuilder().append("qh.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

          if (param4 == null) {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "null";
          } else {
            stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final boolean a(byte param0, nl param1) {
        boolean discarded$1 = false;
        dg var3 = null;
        RuntimeException var3_ref = null;
        lh var4 = null;
        nl var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param1.a((byte) -106);
          if (var3 == null) {
            stackIn_3_0 = 1;
            decompiledRegionSelector0 = 0;
          } else {
            var4 = var3.a((byte) -105);
            if (si.field_m == var4) {
              stackIn_7_0 = 0;
              decompiledRegionSelector0 = 1;
            } else {
              if (param0 >= -73) {
                var5 = (nl) null;
                discarded$1 = this.a((byte) 82, (nl) null);
              }
              if (bf.field_g == var4) {
                stackIn_13_0 = 0;
                decompiledRegionSelector0 = 2;
              } else {
                if (var4 != oj.field_d) {
                  stackIn_18_0 = 1;
                  decompiledRegionSelector0 = 4;
                } else {
                  stackIn_16_0 = 0;
                  decompiledRegionSelector0 = 3;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_21_0 = (RuntimeException) (var3_ref);

          stackIn_21_1 = new StringBuilder().append("qh.C(").append(param0).append(',');

          if (param1 == null) {
            stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
            stackIn_22_2 = "null";
          } else {
            stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
            stackIn_22_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(')').toString());
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_13_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0 != 0;
              } else {
                return stackIn_18_0 != 0;
              }
            }
          }
        }
    }

    public static void h(int param0) {
        createPasswordHintText = null;
        field_O = null;
        if (param0 == 0) {
            field_C = null;
            tutorialFailedMessage = null;
            field_F = null;
            return;
        }
        createPasswordHintText = (String) null;
        field_C = null;
        tutorialFailedMessage = null;
        field_F = null;
    }

    private final boolean f(int param0) {
        if (!this.a((byte) -104, (nl) (this.field_H))) {
            return false;
        }
        if (!this.a((byte) -118, (nl) (this.field_I))) {
            return false;
        }
        if (!this.a((byte) -108, (nl) (this.field_G))) {
            return false;
        }
        if (!this.a((byte) -103, (nl) (this.field_M))) {
            return false;
        }
        if (!this.a((byte) -117, (nl) (this.field_N))) {
            return false;
        }
        if (!this.a((byte) -128, (nl) (this.field_R))) {
            return false;
        }
        if (param0 == 6626) {
            return true;
        }
        return false;
    }

    public final void a(String param0, int param1) {
        hc var3 = this.field_H;
        String var4 = param0;
        if (param1 != 20) {
            return;
        }
        try {
            ((dj) ((Object) var3)).a(-121, var4, false);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "qh.P(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    private final String b(boolean param0) {
        if (param0) {
            return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    final boolean a(int param0, int param1, char param2, el param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_7_0 = false;
        boolean stackIn_13_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1 ^ 0, param2, param3)) {
            stackIn_3_0 = 1;
            decompiledRegionSelector0 = 0;
          } else {
            if (98 == param0) {
              stackIn_7_0 = this.a(7305, param3);
              decompiledRegionSelector0 = 1;
            } else {
              if (param1 != 13) {
                createPasswordHintText = (String) null;
              }
              if (99 == param0) {
                stackIn_13_0 = this.a(param3, -125);
                decompiledRegionSelector0 = 2;
              } else {
                return false;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = (RuntimeException) (var5);

          stackIn_16_1 = new StringBuilder().append("qh.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

          if (param3 == null) {
            stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
            stackIn_17_2 = "null";
          } else {
            stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
            stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(')').toString());
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    private final int a(int param0, el param1, String param2, int param3, int param4, String param5) {
        RuntimeException var7 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= -66) {
            stackIn_4_0 = this.a(param1, param4, param2, 35, param5, param3, (byte) -121);
            decompiledRegionSelector0 = 1;
          } else {
            stackIn_2_0 = -10;
            decompiledRegionSelector0 = 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_7_0 = (RuntimeException) (var7);

          stackIn_7_1 = new StringBuilder().append("qh.L(").append(param0).append(',');

          if (param1 == null) {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "null";
          } else {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "{...}";
          }


          stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

          if (param2 == null) {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "null";
          } else {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
            stackIn_11_2 = "{...}";
          }


          stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(',');

          if (param5 == null) {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "null";
          } else {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(')').toString());
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final void a(byte param0) {
        ((uk) ((Object) this.field_H.a((byte) -128))).c((byte) -89);
        if (param0 != 83) {
            this.a((byte) -25);
        }
    }

    final void a(boolean param0, int param1, el param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_D.field_D = this.f(6626);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "qh.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_F = new gk();
        tutorialFailedMessage = "Unfortunately, you've failed the tutorial. In Geoblox you lose if any geoblox stuck to your avatar reach the edge of the rotating play area. You can either choose to replay the tutorial or, if you feel confident, you can proceed to the proper game.<br>Press <img=2> to continue to the game. Press <img=5> to replay the tutorial.";
        createPasswordHintText = "Passwords must be between 5 and 20 letters and numbers";
    }
}
