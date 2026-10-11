/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hd extends iv {
    int field_x;
    int field_A;
    boolean field_lb;
    ut field_N;
    private int field_w;
    int field_L;
    boolean field_nb;
    ut field_t;
    int field_T;
    int field_hb;
    ut[] field_R;
    int field_y;
    int field_O;
    hu field_X;
    int field_H;
    ut[] field_u;
    int field_mb;
    private int field_pb;
    ut field_r;
    String field_E;
    int field_s;
    int field_D;
    int field_kb;
    int field_P;
    String field_V;
    int field_M;
    boolean field_I;
    static String field_Z;
    int field_sb;
    int field_bb;
    ut field_vb;
    static String field_C;
    static String field_ib;
    private boolean field_db;
    int field_G;
    boolean field_Y;
    boolean field_wb;
    int field_F;
    int field_fb;
    int field_q;
    ut[] field_tb;
    int field_eb;
    ut[] field_S;
    int field_xb;
    ut[] field_rb;
    boolean field_Q;
    boolean field_gb;
    int field_p;
    tf field_jb;
    int field_qb;
    int field_B;
    int field_U;
    ut field_W;
    private boolean field_z;
    int field_ub;
    int field_v;
    int field_cb;
    int field_ab;
    boolean field_ob;
    int field_J;
    static double field_K;

    final static void a(int param0, int param1, int param2, int param3) {
        ut var10 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = Kickabout.field_G;
        try {
          iw.a(-123, lg.field_a);
          var10 = j.a(-5275);
          var5 = var10.field_o;
          var6 = var10.field_v;
          for (var7 = 0; var7 < on.field_g; var7 = var7 + var5) {
            for (var8 = 0; on.field_f > var8; var8 = var8 + var6) {
              var10.d(var7, var8);
            }
          }
          td.a(param0, 15, param2, param1, param3, false);
          if (ih.field_c == 0) {
            og.a(75, gw.field_d, 15, 15);
          }
          if (1 == ih.field_c) {
            og.a(116, tv.field_b, 15, 15);
          }
          if (2 == ih.field_c) {
            wd.a(15, 15, 124);
          }
          ta.e(param0 ^ 122);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "hd.S(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    hd(long param0, hd param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final void a(int param0, int param1, int param2, boolean param3) {
        hd var10_ref_hd = null;
        int var9 = 0;
        int var11 = Kickabout.field_G;
        int var5 = -this.field_J;
        int var6 = var5 - this.field_v;
        int var7 = this.field_mb;
        int var9Lifetime1;
        if (param0 <= 16) {
          return;
        }
        int var8 = var7 + this.field_L;
        if (!param3) {
          var9 = 0;
          var10_ref_hd = (hd) (this.field_jb.g(24009));
          while (var10_ref_hd != null) {
            var10_ref_hd.field_v = var9 - var10_ref_hd.field_J;
            var9 = var9 + (param1 + var10_ref_hd.field_L + var10_ref_hd.field_mb);
            var10_ref_hd = (hd) (this.field_jb.c(33));
          }
          var8 = var9 - param1;
        }
        var9Lifetime1 = var8 - param2;
        if (var6 > var9Lifetime1) {
          var6 = var9Lifetime1;
        }
        if (var6 < 0) {
          var6 = 0;
        }
        int var10 = -param2 + var7;
        if (var10 < var5) {
          var5 = var10;
        }
        if (0 > var5) {
          var5 = 0;
        }
        this.field_L = -var7 + var8;
        this.field_v = var5 - var6;
        this.field_J = -var5;
        this.field_mb = var7;
    }

    final int a(int param0, int param1) {
        hd var4 = null;
        int var5 = 0;
        int var4_int = 0;
        int var6 = Kickabout.field_G;
        int var3 = param1;
        int var4_intLifetime1;
        if (this.field_E != null &&
          null != this.field_X) {
          var4_int = this.field_X.a(this.field_E, param0);
          if (var3 < var4_int) {
            var3 = var4_int;
          }
        }
        if (null != this.field_N) {
          var4_intLifetime1 = this.field_N.field_o;
          if (var4_intLifetime1 > var3) {
            var3 = var4_intLifetime1;
          }
        }
        if (null != this.field_jb) {
          var4 = (hd) (this.field_jb.g(24009));
          while (var4 != null) {
            var5 = var4.field_s + var4.field_q;
            if (var3 < var5) {
              var3 = var5;
            }
            var4 = (hd) (this.field_jb.c(param1 + 33));
          }
        }
        return var3;
    }

    final void a(int param0, boolean param1) {
        this.a(true, -105, false, 0, false, 0, param1, on.field_g, false, false, on.field_f);
        if (param0 <= 45) {
          this.field_y = 117;
        }
    }

    final void a(hd param0, byte param1) {
        boolean stackIn_87_1 = false;
        RuntimeException stackIn_106_0 = null;
        StringBuilder stackIn_106_1 = null;
        String stackIn_107_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        try {
          var3_int = -37 / ((param1 + 26) / 51);
          if (param0 != null) {
            if (0 != param0.field_y) {
              this.field_y = param0.field_y;
            }
            if (null != param0.field_S) {
              this.field_S = param0.field_S;
            }
            if (param0.field_z) {
              this.field_z = param0.field_z;
            }
            if (param0.field_nb) {
              this.field_nb = param0.field_nb;
            }
            if (null != param0.field_tb) {
              this.field_tb = param0.field_tb;
            }
            if (null != param0.field_V) {
              this.field_V = param0.field_V;
            }
            if (null != param0.field_W) {
              this.field_W = param0.field_W;
            }
            if (null != param0.field_r) {
              this.field_r = param0.field_r;
            }
            if (param0.field_vb != null) {
              this.field_vb = param0.field_vb;
            }
            if (0 <= param0.field_ab) {
              this.field_ab = param0.field_ab;
            }
            if (param0.field_rb != null) {
              this.field_rb = param0.field_rb;
            }
            if (param0.field_H >= 0) {
              this.field_H = param0.field_H;
            }
            if (param0.field_N != null) {
              this.field_N = param0.field_N;
            }
            if (null != param0.field_u) {
              this.field_u = param0.field_u;
            }
            if (!param0.field_lb) {
              this.field_lb = param0.field_lb;
            }
            if (0 != param0.field_xb) {
              this.field_xb = param0.field_xb;
            }
            if (param0.field_E != null) {
              this.field_E = param0.field_E;
            }
            if (param0.field_kb != 0) {
              this.field_kb = param0.field_kb;
            }
            if (param0.field_I) {
              this.field_I = param0.field_I;
            }
            if (param0.field_t != null) {
              this.field_t = param0.field_t;
            }
            if (param0.field_U != 256) {
              this.field_U = param0.field_U;
            }
            if (param0.field_hb >= 0) {
              this.field_hb = param0.field_hb;
            }
            if (param0.field_ob) {
              this.field_ob = param0.field_ob;
            }
            if (param0.field_ub >= 0) {
              this.field_ub = param0.field_ub;
            }
            if (param0.field_R != null) {
              this.field_R = param0.field_R;
            }
            if (null != param0.field_X) {
              this.field_X = param0.field_X;
            }
            if (param0.field_D != 0) {
              this.field_D = param0.field_D;
            }
            if (param0.field_p != 0) {
              this.field_p = param0.field_p;
            }
            if (0 != param0.field_B) {
              this.field_B = param0.field_B;
            }
            if (-2147483648 != param0.field_O) {
              this.field_O = param0.field_O;
            }
            if (param0.field_eb != -2147483648) {
              this.field_eb = param0.field_eb;
            }
            stackIn_87_1 = (this.field_nb) && (param0.field_wb);
            this.field_wb = stackIn_87_1;
            if (param0.field_w != -2147483648) {
              this.field_w = param0.field_w;
            }
            this.field_db = param0.field_db;
            if (-2147483648 != param0.field_x) {
              this.field_x = param0.field_x;
            }
            if (param0.field_Y) {
              this.field_Y = param0.field_Y;
            }
            if (-2147483648 != param0.field_cb) {
              this.field_cb = param0.field_cb;
            }
            if (0 != param0.field_A) {
              this.field_A = param0.field_A;
            }
            if (param0.field_pb != -2147483648) {
              this.field_pb = param0.field_pb;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_106_0 = var3;
          stackIn_106_1 = new StringBuilder().append("hd.U(");
          if (param0 == null) {
            stackIn_107_2 = "null";
          } else {
            stackIn_107_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_106_0), ((StringBuilder) (Object) stackIn_106_1).append(stackIn_107_2).append(',').append(param1).append(')').toString());
        }
    }

    final void b(int param0, boolean param1) {
        ic.field_f = !param1 ? true : false;
        bd.field_D = !param1 ? true : false;
        this.a(0, ~param0, true, on.field_f, param0, on.field_g);
    }

    final static boolean a(boolean param0, int param1, int param2) {
        StringBuilder discarded$0 = null;
        int var3;
        String var4_ref_String;
        int var4;
        int var5;
        String var7;
        String var8;
        int var9;
        int var10;
        int var11;
        String var12;
        String var13;
        String var14;
        String var15;
        String var16;
        Object var17;
        CharSequence var18;
        int var5Lifetime1;
        String var7Lifetime1;
        String var7Lifetime2;
        String var7Lifetime3;
        String var7Lifetime4;
        String var7Lifetime5;
        String var7Lifetime6;
        var17 = null;
        var11 = Kickabout.field_G;
        var3 = 1;
        if (param0) {
          hd.g(-41);
        }
        if (!dg.field_a &&
          mu.field_Y == null) {
          var3 = 0;
        }
        if (ov.field_b == 0 &&
          ow.field_b != null) {
          var3 = 0;
        }
        if (2 == ov.field_b &&
          !jc.b(-3197)) {
          var3 = 0;
        }
        if (84 == cc.field_e) {
          if (var3 == 0) {
            if (ov.field_b == 0) {
              return true;
            }
            td.a(-108);
          } else {
            if (cq.field_m.length() > 0) {
              var4_ref_String = cq.field_m.toString();
              if (tb.a(var4_ref_String, -125)) {
                wi.a((String) null, (String) null, 0, 2, ng.field_i, -125);
                wi.a((String) null, (String) null, 0, 2, mg.field_e, -126);
              } else {
                var5 = ov.field_b;
                if (var5 == 0 &&
                  uv.field_i != null) {
                  var5 = 1;
                }
                if (r.a(0, var5) == 2) {
                  gd.a(-117, 1, var5, param2);
                }
                gp.a(-1, 82, ov.field_b, param1, at.field_Kb, var4_ref_String);
              }
            }
            td.a(99);
          }
          return true;
        }
        if (cc.field_e == 85) {
          if (var3 != 0 &&
            cq.field_m.length() > 0) {
            dj.a(-1 + cq.field_m.length(), ' ', -11407, cq.field_m);
          }
          return true;
        }
        var4 = il.field_c;
        if (!rr.a(-108, (char) var4)) {
          return false;
        }
        if (var3 != 0 &&
          cq.field_m.length() < 80) {
          discarded$0 = cq.field_m.append((char) var4);
          var5Lifetime1 = 485;
          var13 = ow.field_e;
          var7 = var13;
          var7Lifetime1 = var13;
          var12 = ga.a(false, var13);
          var7Lifetime2 = var12;
          var7Lifetime3 = var12;
          var15 = var12;
          var7Lifetime4 = var15;
          var7Lifetime5 = var15;
          if (2 != ov.field_b) {
            var7Lifetime6 = "";
            if (ov.field_b == 0) {
              if (uv.field_i == null &&
                uk.field_d) {
                var7Lifetime6 = "[" + qt.field_z + "] ";
              }
              if (uv.field_i != null) {
                if (ol.field_R &&
                  null != ct.field_x) {
                  var7Lifetime6 = "[" + ct.field_x + "] ";
                } else {
                  var7Lifetime6 = "[" + vo.$cfr$intArgs$a$53ce4ab4c593(-18, bv.field_m, new String[]{uv.field_i.field_ec}) + "] ";
                }
              }
            }
            var16 = var7Lifetime6 + var15 + ": ";
            var5Lifetime1 = var5Lifetime1 - nl.field_i.a(var16);
          } else {
            var18 = (CharSequence) ((Object) at.field_Kb);
            var14 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, b.field_F, new String[]{hv.a(false, var18)});
            var7Lifetime6 = var14;
            var7Lifetime6 = var14;
            var8 = vo.$cfr$intArgs$a$53ce4ab4c593(-18, field_ib, new String[]{var12});
            var7Lifetime6 = var8;
            var7Lifetime6 = var8;
            var9 = nl.field_i.a(var14);
            var10 = nl.field_i.a(var8);
            if (var10 >= var9) {
              var5Lifetime1 = var5Lifetime1 - var10;
            } else {
              var5Lifetime1 = var5Lifetime1 - var9;
            }
          }
          if (nl.field_i.a(cq.field_m.toString()) > var5Lifetime1) {
            dj.a(cq.field_m.length() - 1, ' ', -11407, cq.field_m);
          }
        }
        return true;
    }

    public static void g(int param0) {
        field_Z = null;
        if (param0 != -14457) {
          hd.g(118);
        }
        field_C = null;
        field_ib = null;
    }

    final int g(byte param0) {
        int var2 = -9 % ((56 - param0) / 35);
        return this.a(2147483647, 0);
    }

    hd(long param0, hd param1, String param2) {
        this(param0, param1, 0, 0, 0, 0, param2);
    }

    private final void a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        boolean stackIn_31_1 = false;
        boolean stackIn_39_1 = false;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        hd var13;
        int var14;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        var14 = Kickabout.field_G;
        if (this.field_fb <= 0) {
          var7 = this.field_fb >> 2;
        } else {
          var7 = -(-this.field_fb >> 2);
        }
        this.field_s = this.field_s + var7;
        this.field_fb = this.field_fb - var7;
        if (~this.field_v >= param1) {
          var7Lifetime1 = this.field_v >> 2;
        } else {
          var7Lifetime1 = -(-this.field_v >> 2);
        }
        this.field_v = this.field_v - var7Lifetime1;
        this.field_J = this.field_J + var7Lifetime1;
        if (this.field_G <= 0) {
          var7Lifetime2 = this.field_G >> 2;
        } else {
          var7Lifetime2 = -(-this.field_G >> 2);
        }
        this.field_q = this.field_q + var7Lifetime2;
        this.field_G = this.field_G - var7Lifetime2;
        if (this.field_L > 0) {
          var7Lifetime3 = -(-this.field_L >> 2);
        } else {
          var7Lifetime3 = this.field_L >> 2;
        }
        this.field_T = param4 + this.field_J;
        this.field_L = this.field_L - var7Lifetime3;
        this.field_mb = this.field_mb + var7Lifetime3;
        this.field_F = this.field_s + param0;
        param2 = param2 & this.field_lb;
        var8 = on.field_b;
        var9 = on.field_e;
        var10 = on.field_c;
        var11 = on.field_h;
        on.h(this.field_F, this.field_T, this.field_F + this.field_q, this.field_mb + this.field_T);
        var12 = 0;
        if (!ic.field_f &&
          param2 &&
          wj.field_A != 0 &&
          on.field_b <= sm.field_q &&
          on.field_c > sm.field_q &&
          vc.field_y >= on.field_e &&
          on.field_h > vc.field_y) {
          var12 = 1;
          this.field_bb = -this.field_F + sm.field_q;
          this.field_qb = wj.field_A;
          this.field_sb = wj.field_A;
          this.field_M = vc.field_y - this.field_T;
        } else {
          if (wj.field_A != 0) {
            this.field_qb = 0;
          }
          this.field_sb = 0;
        }
        stackIn_31_1 = (!bd.field_D) && (on.field_b <= el.field_A) && (el.field_A < on.field_c) && (on.field_e <= n.field_m) && (n.field_m < on.field_h);
        this.field_Q = stackIn_31_1;
        if (nl.field_p == 0) {
          this.field_qb = 0;
        }
        stackIn_39_1 = (this.field_Q) && (this.field_qb == nl.field_p) && (param2);
        this.field_gb = stackIn_39_1;
        if (null != this.field_jb) {
          var13 = (hd) (this.field_jb.d(param1 ^ 9032));
          while (var13 != null) {
            var13.a(this.field_F, param1 ^ 0, param2, this.field_mb, this.field_T, this.field_q);
            var13 = (hd) (this.field_jb.e(33));
          }
        }
        if (this.field_Q) {
          bd.field_D = true;
        }
        if (var12 != 0) {
          ic.field_f = true;
        }
        on.e(var8, var9, var10, var11);
        if (this.field_qb != 0 &&
          this.field_Y) {
          this.field_J = -param4 - this.field_M + n.field_m;
          this.field_s = -param0 + (-this.field_bb + el.field_A);
          if (this.field_s < 0) {
            this.field_s = 0;
          }
          if (this.field_s > (-this.field_q + param5)) {
            this.field_s = -this.field_q + param5;
          }
          if (0 > this.field_J) {
            this.field_J = 0;
          }
          this.field_v = 0;
          this.field_fb = 0;
          this.field_F = param0 + this.field_s;
          if (param3 - this.field_mb < this.field_J) {
            this.field_J = -this.field_mb + param3;
          }
          this.field_T = param4 + this.field_J;
        }
    }

    final void a(boolean param0, int param1, hd param2, hd param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param3 == null) {
            param2.field_J = 0;
            param2.field_v = 0;
          } else {
            param2.field_v = param3.field_L + param3.field_v;
            param2.field_J = param3.field_mb + param3.field_J + param1;
          }
          if (!param0) {
            this.a(false, -45, -58, 26, 35);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("hd.R(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param3 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void a(byte param0, hd param1) {
        if (this.field_jb == null) {
          this.field_jb = new tf();
        }
        if (param0 > -103) {
          return;
        }
        try {
          this.field_jb.a(param1, 3);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "hd.FA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(boolean param0) {
        hd var4 = null;
        int var3 = Kickabout.field_G;
        if (param0) {
          return;
        }
        if (this.field_jb != null) {
          var4 = (hd) (this.field_jb.d(-9033));
          while (var4 != null) {
            var4.field_z = true;
            var4.b(param0);
            var4 = (hd) (this.field_jb.e(33));
          }
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4) {
        this.field_fb = 0;
        this.field_v = 0;
        if (!param0) {
          this.a(-115, (hd) null);
        }
        this.field_L = 0;
        this.field_s = param2;
        this.field_J = param3;
        this.field_mb = param4;
        this.field_G = 0;
        this.field_q = param1;
    }

    private final void a(boolean param0, int param1, boolean param2, int param3, boolean param4, int param5, boolean param6, int param7, boolean param8, boolean param9, int param10) {
        boolean stackIn_6_0 = false;
        int var12;
        int var13;
        int var14;
        int var15;
        ut[] var16;
        ut var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23_int;
        String var23;
        hd var23_ref;
        int var24;
        int var25;
        String var26;
        String var23Lifetime1;
        String var23Lifetime2;
        var25 = Kickabout.field_G;
        this.field_F = param5 + this.field_s;
        this.field_T = this.field_J + param3;
        var12 = on.field_b;
        var13 = on.field_e;
        var14 = on.field_c;
        if (param1 >= -7) {
          return;
        }
        var15 = on.field_h;
        on.h(this.field_F, this.field_T, this.field_F + this.field_q, this.field_mb + this.field_T);
        if (!this.field_z) {
          param4 = this.field_gb;
          stackIn_6_0 = (this.field_qb != 0);
          param8 = stackIn_6_0;
          param9 = this.field_I;
        }
        param0 = param0 & this.field_lb;
        var16 = this.field_R;
        var17 = this.field_N;
        var18 = this.field_y;
        var19 = 0;
        if (!param0) {
          if (this.field_hb >= 0) {
            var18 = this.field_hb;
          }
          if (null != this.field_t) {
            var17 = this.field_t;
          }
          if (this.field_tb != null) {
            var16 = this.field_tb;
          }
        }
        var20 = 0;
        if (param4) {
          if (this.field_pb != -2147483648) {
            var19 = this.field_pb;
          }
          if (null != this.field_vb) {
            var17 = this.field_vb;
          }
          if (null != this.field_S) {
            var16 = this.field_S;
          }
          if (this.field_ub >= 0) {
            var18 = this.field_ub;
          }
          if (this.field_w != -2147483648) {
            var20 = this.field_w;
          }
        }
        if (param8) {
          if (this.field_eb != -2147483648) {
            var19 = this.field_eb;
          }
          if (0 <= this.field_ab) {
            var18 = this.field_ab;
          }
          if (this.field_O != -2147483648) {
            var20 = this.field_O;
          }
          if (null != this.field_rb) {
            var16 = this.field_rb;
          }
          if (this.field_r != null) {
            var17 = this.field_r;
          }
        }
        if (param9) {
          if (this.field_W != null) {
            var17 = this.field_W;
          }
          if (-2147483648 != this.field_cb) {
            var20 = this.field_cb;
          }
          if (this.field_H >= 0) {
            var18 = this.field_H;
          }
          if (this.field_x != -2147483648) {
            var19 = this.field_x;
          }
          if (this.field_u != null) {
            var16 = this.field_u;
          }
        }
        var21 = var19 + this.field_D;
        var22 = this.field_B + var20;
        if (!this.field_ob) {
          ea.a(this.field_T, this.field_mb, this.field_F, (byte) -102, var16, this.field_q);
        } else {
          ea.a(param3, param10, param5, (byte) -117, var16, param7);
        }
        if (var17 != null) {
          var23_int = this.field_F + var21;
          if (this.field_A == 1) {
            var23_int = var23_int + (-var17.field_o + this.field_q) / 2;
          }
          var24 = this.field_T + var22;
          if (this.field_p == 1) {
            var24 = var24 + (this.field_mb - var17.field_v) / 2;
          }
          if (2 == this.field_A) {
            var23_int = var23_int + (-var17.field_o + this.field_q);
          }
          if (2 == this.field_p) {
            var24 = var24 + (-var17.field_v + this.field_mb);
          }
          if (this.field_P >= 256) {
            var17.c(var23_int, var24);
          } else {
            var17.b(var23_int, var24, this.field_P);
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (null != this.field_E &&
          this.field_X != null) {
          var26 = this.field_E;
          var23 = var26;
          var23Lifetime1 = var26;
          var23Lifetime2 = var26;
          if (param6 &&
            null != this.field_V) {
            var23Lifetime2 = var26 + this.field_V;
          }
          if (this.field_X.a(var23Lifetime2) <= (this.field_q - 2 * this.field_kb) &&
            var23Lifetime2.indexOf("<br>") < 0) {
            if (this.field_p != 1) {
              if (2 == this.field_p) {
                var22 = var22 + (-this.field_X.field_G + (-this.field_X.field_p + this.field_mb));
              }
            } else {
              var22 = var22 + (-this.field_X.field_p + (this.field_mb - this.field_X.field_G)) / 2;
            }
            if (this.field_A == 0) {
              this.field_X.b(var23Lifetime2, var21 + (this.field_F + this.field_kb), this.field_X.field_G + this.field_T + var22, var18, -1, this.field_U);
            } else {
              if (this.field_A == 1) {
                this.field_X.c(var23Lifetime2, this.field_kb + this.field_F + var21 + (-(2 * this.field_kb) + this.field_q) / 2, this.field_X.field_G + this.field_T + var22, var18, -1, this.field_U);
              } else {
                if (2 != this.field_A) {
                  this.field_X.a(var23Lifetime2, var21 + (this.field_kb + this.field_F), this.field_T + var22, this.field_q - this.field_kb * 2, this.field_mb, var18, -1, this.field_U, this.field_A, this.field_p, this.field_xb);
                } else {
                  this.field_X.a(var23Lifetime2, -(2 * this.field_kb) + this.field_q + this.field_F - (-this.field_kb - var21), this.field_X.field_G + this.field_T + var22, var18, -1, this.field_U);
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.field_X.a(var23Lifetime2, this.field_F - (-this.field_kb - var21), this.field_T + var22, this.field_q - 2 * this.field_kb, this.field_mb, var18, -1, this.field_U, this.field_A, this.field_p, this.field_xb);
          }
        }
        if (null != this.field_jb) {
          var23_ref = (hd) (this.field_jb.g(24009));
          while (var23_ref != null) {
            var23_ref.a(param0, -114, this.field_wb, var20 + this.field_T, param4, var19 + this.field_F, param6, this.field_q, param8, param9, this.field_mb);
            var23_ref = (hd) (this.field_jb.c(33));
          }
        }
        on.e(var12, var13, var14, var15);
        return;
    }

    final void a(int param0, hd param1) {
        nw var3 = null;
        hd var4 = null;
        int var5 = Kickabout.field_G;
        try {
          if (this.field_jb != null) {
            var3 = new nw(this.field_jb);
            var4 = (hd) (var3.a((byte) 54));
            while (var4 != null) {
              var4.a(103, param1);
              var4 = (hd) (var3.a(0));
            }
          }
          this.field_wb = param1 == this ? true : false;
          if (this.field_db) {
            this.field_I = this.field_wb;
          }
          int var3_int = -75 % ((39 - param0) / 48);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "hd.P(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public hd() {
        this.field_H = -1;
        this.field_O = -2147483648;
        this.field_pb = -2147483648;
        this.field_P = 256;
        this.field_w = -2147483648;
        this.field_x = -2147483648;
        this.field_hb = -1;
        this.field_nb = false;
        this.field_wb = false;
        this.field_lb = true;
        this.field_db = false;
        this.field_eb = -2147483648;
        this.field_ub = -1;
        this.field_U = 256;
        this.field_ab = -1;
        this.field_cb = -2147483648;
    }

    hd(long param0, hd param1, int param2, int param3, int param4, int param5, String param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_H = -1;
        this.field_O = -2147483648;
        this.field_pb = -2147483648;
        this.field_P = 256;
        this.field_w = -2147483648;
        this.field_x = -2147483648;
        this.field_hb = -1;
        this.field_nb = false;
        this.field_wb = false;
        this.field_lb = true;
        this.field_db = false;
        this.field_eb = -2147483648;
        this.field_ub = -1;
        this.field_U = 256;
        this.field_ab = -1;
        this.field_cb = -2147483648;
        try {
          this.field_s = param2;
          this.field_mb = param5;
          this.field_a = param0;
          this.field_J = param3;
          this.field_q = param4;
          this.a(param1, (byte) -86);
          if (param6 != null) {
            this.field_E = param6;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("hd.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_Z = "Type your password again to make sure it's correct";
        field_C = "Average rating";
        field_ib = "From <%0>: ";
    }
}
