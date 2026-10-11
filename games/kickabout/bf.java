/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf extends hs {
    private kq[] field_j;
    private hd field_q;
    private up[] field_k;
    static np field_u;
    private int field_r;
    private int field_B;
    private kq[] field_z;
    private jw field_o;
    private int field_p;
    private hd field_A;
    private boolean field_v;
    private hd[] field_t;
    static gd field_y;
    private int field_l;
    static kg[][] field_s;
    private int field_w;
    static ic field_m;
    static ot field_x;
    static String field_n;

    private final int a(byte param0, int param1) {
        if (param0 <= 98) {
          this.a((byte) 101, true, 125, true);
        }
        int var3 = this.g(param1, 0);
        if (var3 == -1) {
          return 75 * (param1 / 3) + this.field_A.field_T;
        }
        return this.field_t[var3].field_T;
    }

    private final void a(byte param0, boolean param1, int param2, boolean param3) {
        int stackIn_3_0;
        int stackIn_3_1;
        int stackIn_3_2;
        int stackIn_3_3;
        int stackIn_3_4;
        int stackIn_3_5;
        int stackIn_4_6 = 0;
        int stackIn_6_0;
        int stackIn_6_1;
        int stackIn_6_2;
        int stackIn_6_3;
        int stackIn_6_4;
        int stackIn_7_5;
        ut stackIn_17_0;
        int stackIn_17_1;
        int stackIn_17_2;
        int stackIn_17_3;
        int stackIn_17_4;
        int stackIn_18_5 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        var5 = this.field_t[param2].field_F;
        var6 = this.field_t[param2].field_T;
        var7 = this.field_t[param2].field_q;
        var8 = this.field_t[param2].field_mb;
        var9 = es.field_f.field_o * 13 >> 4;
        var10 = es.field_f.field_v * 13 >> 4;
        if (param1) {
          stackIn_3_0 = var5;
          stackIn_3_1 = var6;
          stackIn_3_2 = var7;
          stackIn_3_3 = var8;
          stackIn_3_4 = 10;
          stackIn_3_5 = 65793;
          stackIn_4_6 = (!param3) ? 200 : 256;
          on.a(stackIn_3_0, stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4, stackIn_3_5, stackIn_4_6);
          stackIn_6_0 = var5;
          stackIn_6_1 = var6;
          stackIn_6_2 = var7;
          stackIn_6_3 = var8;
          stackIn_6_4 = 10;
          stackIn_7_5 = (param3) ? 16777215 : 8947848;
          on.f(stackIn_6_0, stackIn_6_1, stackIn_6_2, stackIn_6_3, stackIn_6_4, stackIn_7_5);
        }
        var11 = (var7 - var9 >> 1) + var5;
        if (param0 > -72) {
          this.a((byte) 82, true, -69, false);
        }
        var12 = var6 - (-(var8 - var10 >> 1) + 6);
        if (!this.field_v) {
          var12 += 4;
        }
        stackIn_17_0 = es.field_f;
        stackIn_17_1 = var11;
        stackIn_17_2 = var12;
        stackIn_17_3 = var9;
        stackIn_17_4 = var10;
        if (param3) {
          stackIn_18_5 = 256;
        } else {
          stackIn_18_5 = (!param1) ? 100 : 200;
        }
        ((ut) (Object) stackIn_17_0).d(stackIn_17_1, stackIn_17_2, stackIn_17_3, stackIn_17_4, stackIn_18_5);
        if (param1) {
          un.field_d.d(Integer.toString(1 + param2), (var7 >> 1) + var5, 23 + var12, 65793, -1);
        }
    }

    private final hd a(int param0, int param1, byte param2) {
        hd var5 = new hd();
        hd var4 = var5;
        var5.field_s = ws.field_b[param0][param1] * 147 / 896 - 26;
        var5.field_J = ws.field_d[param0][param1] * 220 / 1344 - 37;
        var4.field_mb = 75;
        var4.field_q = 52;
        if (param2 != -75) {
          this.field_p = 40;
        }
        return var4;
    }

    private final boolean a(boolean param0, hd param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        java.applet.Applet var5 = null;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = wt.field_x;
          if (param0) {
            var5 = (java.applet.Applet) null;
            bf.a(43, (String[]) null, 37, (java.applet.Applet) null, -63, -56);
          }
          var4 = us.field_j;
          stackIn_8_0 = (var3_int > param1.field_F) && (param1.field_T < var4) && (var3_int < param1.field_F + param1.field_q) && (param1.field_mb + param1.field_T > var4);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("bf.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void a(int param0, boolean param1) {
        int stackIn_6_0 = 0;
        up stackIn_9_0 = null;
        int stackIn_41_0 = 0;
        int stackIn_51_0 = 0;
        int var3;
        int var5;
        up var6;
        int var7;
        int var8;
        int var9;
        int var10;
        kq var11;
        up var12;
        int var3Lifetime1;
        int var3Lifetime2;
        int var9Lifetime1;
        var10 = Kickabout.field_G;
        this.field_q.b(0, param1);
        if (this.a((byte) 13)) {
          this.field_l = -1;
          for (var3 = 0; 9 > var3; var3++) {
            var11 = this.field_j[var3];
            if (this.field_a.field_e) {
              stackIn_6_0 = var3;
            } else {
              stackIn_6_0 = tu.field_E.field_q[var3];
            }
            var5 = stackIn_6_0;
            if (this.field_a.field_e) {
              stackIn_9_0 = this.field_k[var5];
            } else {
              stackIn_9_0 = tu.field_E.field_i[var5];
            }
            var6 = stackIn_9_0;
            var11.a(this.field_r, this.field_w, (byte) 125, this.field_B, var6);
            if (!this.field_a.field_e) {
              var11.a((byte) -128, tu.field_E, var5);
            }
            if (!var11.field_Eb.c(-2) &&
              var11.field_qb != 0 &&
              !var11.field_Gb) {
              var11.field_F = -(var11.field_q >> 1) + wt.field_x;
              var11.field_s = -(var11.field_q >> 1) + wt.field_x;
              var11.field_T = us.field_j - (var11.field_mb >> 1);
              var11.field_J = us.field_j - (var11.field_mb >> 1);
              this.field_l = var3;
              this.field_p = var3;
            } else {
              if (this.field_p != var3) {
                var7 = this.h(var3, 3);
                var8 = this.a((byte) 116, var3);
                if (var7 != var11.field_s) {
                  var9 = -var11.field_s + (var7 + var11.field_s * 3 >> 2);
                  if (0 == var9) {
                    stackIn_41_0 = (var7 > var11.field_s) ? 1 : -1;
                    var9 = stackIn_41_0;
                  }
                  var11.field_s = var11.field_s + var9;
                }
                if (var8 != var11.field_J) {
                  var9Lifetime1 = (var11.field_J * 3 + var8 >> 2) - var11.field_J;
                  if (var9Lifetime1 == 0) {
                    stackIn_51_0 = (var11.field_J < var8) ? 1 : -1;
                    var9Lifetime1 = stackIn_51_0;
                  }
                  var11.field_J = var11.field_J + var9Lifetime1;
                }
              } else {
                this.field_p = -1;
                if (!this.a(false, this.field_A)) {
                  for (var7 = 3; 0 <= var7; var7--) {
                    if (~this.field_a.field_i[this.field_h][var7] == ~this.field_g &&
                      this.a(false, this.field_t[var7])) {
                      kj.a((byte) 45);
                      this.i(74, var5 + 1 << 2 | var7);
                    }
                  }
                } else {
                  var7 = this.g(var3, 0);
                  if (var7 != -1) {
                    this.i(74, var7);
                  }
                }
              }
            }
          }
          if (this.field_l == -1) {
            for (var3Lifetime2 = 0; var3Lifetime2 < 9; var3Lifetime2++) {
              if (!this.field_j[var3Lifetime2].field_Eb.c(-2) &&
                this.field_j[var3Lifetime2].field_gb &&
                !this.field_j[var3Lifetime2].field_Gb) {
                this.field_l = var3Lifetime2;
              }
            }
          }
          if (this.field_o.field_sb == 1) {
            this.i(74, -1);
            sp.c(61, 47);
          }
          this.field_o.field_Gb = this.field_a.field_o.a(-82, this.field_g);
          this.field_o.field_lb = this.field_a.field_o.a(false, this.field_g);
        } else {
          this.field_l = -1;
        }
        for (var3Lifetime1 = 0; var3Lifetime1 < 4; var3Lifetime1++) {
          if (~this.field_a.field_i[this.field_h][var3Lifetime1] != ~this.field_g) {
            var12 = this.field_a.field_b[this.field_h][var3Lifetime1];
            this.field_z[var3Lifetime1].a(this.field_r, this.field_w, (byte) 127, this.field_B, var12);
          }
        }
        if (param0 >= -92) {
          field_u = (np) null;
        }
    }

    public static void b(byte param0) {
        field_m = null;
        field_s = (kg[][]) null;
        field_n = null;
        field_y = null;
        field_u = null;
        field_x = null;
        int var1 = -57 / ((param0 - 52) / 45);
    }

    final static void a(tv param0, byte param1) {
        hd stackIn_2_0;
        boolean stackIn_2_1;
        Object stackIn_2_2;
        int stackIn_2_3;
        String stackIn_2_4;
        Object stackIn_2_5;
        long stackIn_2_6;
        String stackIn_2_7;
        int stackIn_3_8 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        uv var5 = null;
        String var6 = null;
        uv var7 = null;
        String var8 = null;
        uv var9 = null;
        String var10 = null;
        uv var11 = null;
        String var12 = null;
        uv var13 = null;
        try {
          stackIn_2_0 = param0.field_s;
          stackIn_2_1 = false;
          stackIn_2_2 = null;
          stackIn_2_3 = param0.field_c;
          stackIn_2_4 = param0.field_q;
          stackIn_2_5 = null;
          stackIn_2_6 = param0.field_d;
          stackIn_2_7 = param0.field_h;
          if (param0.field_c == 1) {
            stackIn_3_8 = param0.field_n;
          } else {
            stackIn_3_8 = 0;
          }
          el.a(stackIn_2_0, stackIn_2_1, (np) (stackIn_2_2), stackIn_2_3, stackIn_2_4, (int[]) (stackIn_2_5), stackIn_2_6, stackIn_2_7, stackIn_3_8);
          if (param0.field_c == 0 &&
            !wm.c((byte) -121) &&
            null == uv.field_i &&
            ow.field_b == null) {
            if (!kb.field_C) {
              var5 = wi.field_v;
              var6 = sp.field_Cb;
              var5.field_j.a(0, 14, var6);
            }
            var7 = wi.field_v;
            var8 = em.field_c;
            var7.field_j.a(0, 20, var8);
          }
          if (param0.field_c == 1 &&
            !wm.c((byte) -121) &&
            uv.field_i != null &&
            param0.field_n == uv.field_i.h((byte) -105)) {
            if (!kb.field_C) {
              var9 = wi.field_v;
              var10 = vo.field_db;
              var9.field_j.a(param1 ^ -60, 14, var10);
            }
            var11 = wi.field_v;
            var12 = st.field_f;
            var11.field_j.a(0, 20, var12);
          }
          wi.field_v.d(1);
          wi.field_v.a(false, 0);
          wi.field_v.a(param0.field_c, -118, param0.field_r);
          wi.field_v.b(-120);
          wi.field_v.a(param0, (byte) 11);
          var13 = wi.field_v;
          if (param1 != -60) {
            return;
          }
          var3 = sm.field_q;
          var4 = vc.field_y;
          var13.field_j.a(0, 0, var3, var4, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("bf.J(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    final void e(int param0) {
        boolean discarded$0 = false;
        int var8 = 0;
        int stackIn_24_1 = 0;
        boolean stackIn_25_2 = false;
        jw stackIn_34_0 = null;
        boolean stackIn_35_1 = false;
        int var2;
        int var3;
        int var4;
        int var5_int;
        String var5;
        int var6;
        int var7;
        int var9;
        hd var10;
        int var11;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        int var4Lifetime5;
        int var5_intLifetime1;
        var9 = Kickabout.field_G;
        this.c(62);
        this.a(false, k.field_h);
        this.b(param0 ^ -2352, this.field_a.field_v);
        this.d(126);
        this.field_q.a(120, false);
        var2 = -1;
        var3 = -1;
        for (var4 = 3; 0 <= var4; var4--) {
          if (this.field_g == this.field_a.field_i[this.field_h][var4] &&
            this.a(false, this.field_t[var4])) {
            var2 = var4;
          }
        }
        if (var2 == -1 &&
          this.field_l != -1) {
          if (!this.a(false, this.field_A)) {
            var2 = this.g(this.field_l, param0 - 1);
          }
          if (var2 == -1) {
            var3 = this.field_l;
          }
        }
        for (var4Lifetime1 = 3; var4Lifetime1 >= 0; var4Lifetime1--) {
          if (~var4Lifetime1 != ~var2) {
            stackIn_24_1 = -105;
            stackIn_25_2 = (this.field_a.field_i[this.field_h][var4Lifetime1] == this.field_g);
            this.a((byte) stackIn_24_1, stackIn_25_2, var4Lifetime1, false);
          }
        }
        if (var2 != -1) {
          this.a((byte) -108, true, var2, true);
        }
        if (this.a((byte) 13)) {
          gd.a(-1, this.field_A.field_T, this.field_A.field_F, (byte) -96, var3);
          stackIn_34_0 = this.field_o;
          stackIn_35_1 = (this.field_o.field_lb) && (!this.field_o.field_Gb);
          ((jw) (Object) stackIn_34_0).a(stackIn_35_1, (byte) 46);
          for (var4Lifetime2 = 0; var4Lifetime2 < 9; var4Lifetime2++) {
            if (this.field_l != var4Lifetime2) {
              this.field_j[var4Lifetime2].h((byte) -116);
            }
          }
        }
        for (var4Lifetime3 = 0; var4Lifetime3 < 4; var4Lifetime3++) {
          this.field_z[var4Lifetime3].h((byte) -124);
        }
        if (param0 != 1) {
          var10 = (hd) null;
          discarded$0 = this.a(true, (hd) null);
        }
        if (this.field_v) {
          for (var4Lifetime4 = 0; 4 > var4Lifetime4; var4Lifetime4++) {
            var5_int = this.field_a.field_i[this.field_h][var4Lifetime4];
            var6 = (this.field_t[var4Lifetime4].field_q >> 1) + this.field_t[var4Lifetime4].field_F;
            var7 = -16 + this.field_t[var4Lifetime4].field_T + this.field_t[var4Lifetime4].field_mb;
            iw.a(67, ff.field_b);
            on.b();
            q.field_d.d(this.field_a.field_S[var5_int].toLowerCase(), on.field_g >> 1, -1 + on.field_f, 16777062, -1);
            ta.e(param0 + 116);
            eo.a(ff.field_b, 65793);
            ff.field_b.c(-(ff.field_b.field_o >> 1) + var6, var7 - ff.field_b.field_v);
          }
        }
        if (this.field_l != -1) {
          this.field_j[this.field_l].h((byte) -117);
        }
        if (this.field_v) {
          this.a(this.field_h, 240, (byte) -60, 412);
          pt.a(640, -22914, 574, 480, 0);
          var4Lifetime5 = 263;
          var11 = 0;
          var5_intLifetime1 = var11;
          while (var11 < this.field_a.field_I) {
            if (this.field_h == this.field_a.field_g[var11].field_p) {
              on.a(412, var4Lifetime5, 186, 21, 7, 65793, 128);
              if (this.field_a.field_o.a(param0 - 87, var11)) {
                vb.field_l.c(574, var4Lifetime5 - 4);
              }
              var4Lifetime5 += 23;
            }
            var11++;
          }
          ta.e(param0 ^ 124);
          if (this.a((byte) 13)) {
            var6 = -1;
            var7 = -1;
            for (var8 = 0; var8 < 4; var8++) {
              if (this.field_g == this.field_a.field_i[this.field_h][var8]) {
                if (-1 == var6) {
                  var6 = var8;
                } else {
                  var7 = var8;
                }
              }
            }
            if (var7 != -1) {
              var5 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, ss.field_i, new String[]{Integer.toString(1 + var6), Integer.toString(var7 + 1)});
            } else {
              var5 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, sm.field_p, new String[]{Integer.toString(var6 + 1)});
            }
          } else {
            var5 = ig.field_j;
          }
          ul.a(130, 1, 105, true, (byte) 26, 225, 18, 380, 1, var5);
        } else {
          ul.a(230, 1, 105, true, (byte) -123, 210, 18, 390, 1, ni.field_q);
        }
        if (this.field_a.field_f) {
          un.field_d.a("FB", 5, 17, 16777215, -1);
        }
    }

    final static void a(int param0, String[] param1, int param2, java.applet.Applet param3, int param4, int param5) {
        int var7 = 0;
        String var6 = null;
        int var8 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref = null;
        var8 = Kickabout.field_G;
        try {
          rd.field_c = param3.getParameter("overxgames");
          if (null == rd.field_c) {
            rd.field_c = "0";
          }
          gm.field_lb = param3.getParameter("overxachievements");
          if (null == gm.field_lb) {
            gm.field_lb = "0";
          }
          if (param0 >= -46) {
            return;
          }
          var6 = param3.getParameter("currency");
          if (var6 != null &&
            gr.a((byte) 15, (CharSequence) ((Object) var6))) {
            rr.a(10, (CharSequence) ((Object) var6));
          }
          sb.field_b = new ut[param1.length];
          for (var7 = 0; param1.length > var7; var7++) {
            sb.field_b[var7] = new ut(317, 34);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_19_0 = var6_ref;
          stackIn_19_1 = new StringBuilder().append("bf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final int h(int param0, int param1) {
        if (param1 != 3) {
          field_n = (String) null;
        }
        int var3 = this.g(param0, 0);
        if (-1 == var3) {
          return this.field_A.field_F + 52 * (param0 % 3);
        }
        return this.field_t[var3].field_F;
    }

    private final void i(int param0, int param1) {
        this.field_a.a(wd.a(18238, this.field_k, tu.field_E, param1, this.field_g), -121);
        if (param0 != 74) {
          return;
        }
        if (this.field_f) {
          or.field_d.b(74, (byte) 121);
          or.field_d.g(-1207444472, param1);
        }
    }

    final boolean a(char param0, int param1, int param2) {
        if (param1 != 1670) {
          field_m = (ic) null;
        }
        if (this.a((byte) 13) && ne.field_G[82] &&
          param2 == 48) {
          this.i(74, -2);
          return true;
        }
        return super.a(param0, 1670, param2);
    }

    bf(nu param0, int param1, boolean param2, up[] param3) {
        super(param0, param1, param2, (int[]) null);
        int var6 = 0;
        int var7 = 0;
        hd var8 = null;
        int var9 = 0;
        hd var11 = null;
        hd var12 = null;
        int stackIn_6_0 = 0;
        up stackIn_8_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var7Lifetime1;
        int var7Lifetime2;
        this.field_l = -1;
        this.field_v = false;
        this.field_p = -1;
        try {
          this.field_k = param3;
          this.field_w = param0.field_H[this.field_h];
          this.field_B = param0.field_d[this.field_h];
          this.field_r = param0.field_Q[this.field_h];
          this.field_q = new hd();
          this.field_q.a(true, 640, 0, 0, 480);
          var11 = new hd();
          var12 = var11;
          var12.field_N = qj.field_f;
          var12.a(true, var12.field_N.field_o, 220, 100, var12.field_N.field_v);
          this.field_q.a((byte) -114, var11);
          var6 = param0.field_r[this.field_h];
          this.field_z = new kq[4];
          this.field_t = new hd[4];
          for (var7 = 3; var7 >= 0; var7--) {
            this.field_t[var7] = this.a(var6, var7, (byte) -75);
            var11.a((byte) -111, this.field_t[var7]);
            this.field_z[var7] = new kq();
            var8 = this.field_t[var7];
            this.field_z[var7].a(true, var8.field_q, var8.field_s, var8.field_J, var8.field_mb);
            var11.a((byte) -104, (hd) (this.field_z[var7]));
            stackIn_6_0 = ((1 << param0.field_i[this.field_h][var7] & param0.field_c) == 0) ? 0 : 1;
            var9 = stackIn_6_0;
            stackIn_8_0 = this.field_z[var7].field_Eb;
            if (var9 == 0) {
              stackIn_9_1 = 1;
            } else {
              stackIn_9_1 = 2;
            }
            stackIn_8_0.field_i = stackIn_9_1;
          }
          if (this.a((byte) 13)) {
            this.field_A = new hd();
            this.field_A.a(true, 156, 45, 112, 225);
            this.field_q.a((byte) -104, this.field_A);
            this.field_q.b(0, true);
            this.field_o = new jw(sl.field_Ab, un.field_d, var12.field_q);
            this.field_o.field_lb = false;
            this.field_o.field_J = 7 + var12.field_mb + var12.field_T;
            this.field_o.field_s = var12.field_F;
            this.field_q.a((byte) -127, (hd) (this.field_o));
            this.field_j = new kq[9];
            for (var7Lifetime1 = 0; var7Lifetime1 < 9; var7Lifetime1++) {
              this.field_j[var7Lifetime1] = new kq();
              this.field_j[var7Lifetime1].a(true, 52, this.h(var7Lifetime1, 3), this.a((byte) 113, var7Lifetime1), 75);
              this.field_j[var7Lifetime1].field_F = this.field_j[var7Lifetime1].field_s;
              this.field_j[var7Lifetime1].field_T = this.field_j[var7Lifetime1].field_J;
              this.field_q.a((byte) -125, (hd) (this.field_j[var7Lifetime1]));
            }
          }
          for (var7Lifetime2 = 0; param0.field_I > var7Lifetime2; var7Lifetime2++) {
            if (this.field_h == param0.field_g[var7Lifetime2].field_p &&
              var7Lifetime2 != param1 &&
              param0.field_R[var7Lifetime2].d(3511)) {
              this.field_v = true;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("bf.<init>(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    private final int g(int param0, int param1) {
        int var3 = 0;
        int var4;
        var4 = Kickabout.field_G;
        for (var3 = param1; var3 < 4; var3++) {
          if (this.field_a.field_i[this.field_h][var3] == this.field_g && (this.field_a.field_e &&
            param0 == this.field_a.field_k[this.field_h][var3] ||
            !this.field_a.field_e &&
            tu.field_E.field_q[param0] == this.field_a.field_k[this.field_h][var3])) {
            return var3;
          }
        }
        return -1;
    }

    final void f(int param0, int param1) {
        if (param0 <= 98) {
          this.a((byte) -5, false, -85, false);
        }
    }

    static {
        field_y = new gd();
        field_m = new ic();
        field_n = "Press TAB to chat or F10 to open Quick Chat.";
    }
}
