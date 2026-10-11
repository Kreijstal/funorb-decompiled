/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc extends jf implements qn {
    static RgbSprite field_wb;
    private tl field_zb;
    static RgbSprite field_sb;
    static String field_mb;
    static int[] field_ob;
    static RgbSprite field_ub;
    private int field_tb;
    static RgbSprite field_qb;
    static String field_xb;
    static byte[][] field_vb;
    static RgbSprite field_pb;
    static String field_yb;
    static RgbSprite[] field_rb;
    static String field_nb;

    final static void a(String param0, CombatWorld param1, byte param2) {
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String[] var4 = null;
        String[] var5 = null;
        String var7 = null;
        int var8 = 0;
        RgbSprite var9 = null;
        var8 = SteelSentinels.obfuscationControl;
        try {
          if (ed.field_j == -2) {
            return;
          }
          if (param2 != 100) {
            var9 = (RgbSprite) null;
            bc.a(32, 18, 86, -6, (RgbSprite) null, -101, -54);
          }
          var3_int = sn.field_j.field_zb - 20 - pl.field_X.c("[" + db.a(pd.field_ab, -49, new String[]{param1.playerNames[0], "] "}));
          if (var3_int < pl.field_X.c(param0)) {
            var4 = ao.a(pl.field_X, new int[]{var3_int}, 18985, param0);
            var5 = var4;
            for (var6 = 0; var6 < var5.length; var6++) {
              var7 = var5[var6];
              sj.a(param1.playerNames[0], var7, 0, (byte) 21, (String) null, 1);
              ln.field_e = ln.field_e - 1;
            }
            return;
          }
          sj.a(param1.playerNames[0], param0, 0, (byte) 21, (String) null, 1);
          ln.field_e = ln.field_e - 1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("bc.Q(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1, boolean param2, me param3, int param4) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          dj.field_k[0] = rb.field_g.nextInt();
          dj.field_k[1] = rb.field_g.nextInt();
          ne.field_y.position = 0;
          dj.field_k[param1] = (int)(oa.field_G >> 32);
          dj.field_k[3] = (int)oa.field_G;
          ne.field_y.b(true, dj.field_k[0]);
          ne.field_y.b(true, dj.field_k[1]);
          ne.field_y.b(true, dj.field_k[2]);
          ne.field_y.b(true, dj.field_k[3]);
          jk.a(125, ne.field_y);
          ne.field_y.d(param4, 18);
          param3.a(ne.field_y, false);
          mm.field_g.position = 0;
          if (!param0) {
            mm.field_g.a((byte) 126, 16);
          } else {
            mm.field_g.a((byte) 120, 18);
          }
          mm.field_g.position = mm.field_g.position + 2;
          var5_int = mm.field_g.position;
          mm.field_g.b(true, kk.field_d);
          mm.field_g.b(-28875, og.field_b);
          var6 = 0;
          if (ki.field_ib) {
            var6 = var6 | 1;
          }
          if (cd.field_a) {
            var6 = var6 | 4;
          }
          if (param2) {
            var6 = var6 | 8;
          }
          if (on.field_k != null) {
            var6 = var6 | 16;
          }
          mm.field_g.a((byte) 124, var6);
          var7 = SceneWidget.a(param1 ^ -82, Projectile.d((byte) -21));
          if (var7 == null) {
            var7 = "";
          }
          mm.field_g.a(var7, -67);
          if (null != on.field_k) {
            mm.field_g.a(13588, on.field_k);
          }
          qi.a(jd.field_ib, ne.field_y, mm.field_g, qe.field_d, 5);
          mm.field_g.c(param1 ^ 28, -var5_int + mm.field_g.position);
          gj.a(0, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("bc.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, byte param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = SteelSentinels.obfuscationControl;
        try {
          cj.a(param0, k.field_Lb, (byte) 125, kc.field_z, 0, true, nj.field_S);
          if (param1 <= 94) {
            return;
          }
          for (var2_int = 0; var2_int < kc.field_z; var2_int++) {
            un.field_j[param0 + var2_int] = var2_int;
          }
          cj.a(param0 + param0, mj.field_cc, (byte) 125, kc.field_z + param0, param0, false, ti.field_w);
          if (param0 < kc.field_z) {
            kc.field_z = param0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "bc.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(long param0, String param1, int param2) {
        CharSequence var5 = null;
        try {
          ib.field_b = param2;
          en.field_e = param1;
          var5 = (CharSequence) ((Object) param1);
          bk.field_U = ui.a(param2 ^ 3, var5);
          jn.field_g = true;
          ti.field_p = param0;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "bc.BA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, RgbSprite param4, int param5, int param6) {
        int var11 = 0;
        int var10 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var12 = 0;
        var12 = SteelSentinels.obfuscationControl;
        try {
          param2 = param2 & 255;
          param1 = param1 & param6;
          var7_int = param4.field_z;
          var8 = param3 * var7_int;
          for (var11 = param3; var11 < param0; var11++) {
            var9 = ((-var11 + param0) * param1 + (var11 - param3) * param2) / (param0 - param3);
            var9 = var9 * 65793;
            for (var10 = 0; var7_int > var10; var10++) {
              if (~param5 == ~param4.field_E[var10 + var8]) {
                param4.field_E[var10 + var8] = var9;
              }
            }
            var8 = var8 + var7_int;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_13_0 = var7;
          stackIn_13_1 = new StringBuilder().append("bc.DA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    final void a(boolean param0, tl param1) {
        if (!param0) {
          return;
        }
        try {
          this.field_zb = param1;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "bc.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void k(int param0) {
        super.k(-118);
        int var2 = -88 / ((param0 + 37) / 43);
        if (this.field_zb != null) {
          this.field_zb.a(-17382);
        }
    }

    public final tl a(boolean param0) {
        if (param0) {
          return (tl) null;
        }
        return this.field_zb;
    }

    public static void i(byte param0) {
        field_wb = null;
        field_qb = null;
        field_vb = (byte[][]) null;
        field_ob = null;
        if (param0 >= -36) {
          return;
        }
        field_nb = null;
        field_xb = null;
        field_mb = null;
        field_rb = null;
        field_sb = null;
        field_yb = null;
        field_pb = null;
        field_ub = null;
    }

    bc(String param0, tn param1, int param2) {
        super(param0, param1, param2);
    }

    final void a(int param0, int param1, lh param2, int param3) {
        try {
          super.a(param0, 112, param2, param3);
          if (param1 < 56) {
            field_wb = (RgbSprite) null;
          }
          this.field_tb = oh.field_f - (this.field_o + param0);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "bc.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final String e(int param0) {
        if (!this.field_C) {
          return null;
        }
        if (null == this.field_v) {
          return null;
        }
        if (param0 != 0) {
          return (String) null;
        }
        hk.a(pi.field_c, oh.field_f + this.field_x - this.field_tb, 17237);
        return this.field_v;
    }

    static {
        field_mb = "Error connecting to server. Please try using a different server.";
        field_vb = new byte[50][];
        field_xb = "Who can join";
        field_yb = "To disable this control, click on <col=1f76a6><%0></col> in the options menu.";
        field_nb = "Empty slot";
    }
}
