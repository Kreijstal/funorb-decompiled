/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nq extends IntrusiveNode {
    static boolean field_p;
    private int field_o;
    static String field_k;
    private int field_r;
    private int field_m;
    private int field_q;
    private RgbSprite field_s;
    static String field_n;
    private String field_l;
    static int field_i;
    private boolean field_j;

    final static void a(mf param0, mf param1, byte param2, mf param3) {
        RgbSprite var17 = null;
        tp[] var5 = null;
        tp[][] var6 = null;
        int[][] var19 = null;
        int[][] var16 = null;
        int[][] var7 = null;
        tp[] var14 = null;
        int var11_int = 0;
        RgbSprite var15 = null;
        RgbSprite var18 = null;
        RgbSprite var11 = null;
        RgbSprite var12 = null;
        int var8 = 0;
        int var9 = 0;
        int var13 = BrickABrac.field_J ? 1 : 0;
        int var8Lifetime1;
        int var9Lifetime1;
        try {
          nf.field_W = cr.a("commonui", param3, "frame_top", param2 ^ -57);
          GameplayAudioEvent.field_l = cr.a("commonui", param3, "frame_bottom", 2);
          ka.field_n = pl.a("commonui", "jagex_logo_grey", (byte) -110, param3);
          sf.field_U = cr.a("commonui", param3, "button", 2);
          df.field_a = bd.a("commonui", "validation", param3, (byte) -8);
          og.field_Yb = (dh) ((Object) si.a((byte) -118, "commonui", "arezzo12", param3, param0));
          a.field_u = (dh) ((Object) si.a((byte) -108, "commonui", "arezzo14", param3, param0));
          wm.field_a = (dh) ((Object) si.a((byte) -126, "commonui", "arezzo14bold", param3, param0));
          var17 = new RgbSprite(param1.a(122, "button.gif", ""), (java.awt.Component) ((Object) kj.field_D));
          uo.a((byte) 29, param3, "dropdown", "commonui");
          var5 = PacketBuffer.a("commonui", param3, "screen_options", param2 ^ 946715361);
          LevelPackLoader.field_b = new tp[4];
          cd.field_b = new tp[4];
          ng.field_d = new tp[4];
          var6 = new tp[][]{LevelPackLoader.field_b, ng.field_d, cd.field_b};
          var19 = new int[4][];
          var16 = var19;
          var7 = var16;
          var7[0] = var5[0].field_j;
          for (var8 = 1; var19.length > var8; var8++) {
            var7[var8] = (int[]) ((Object) var19[0].clone());
          }
          var8Lifetime1 = var5[0].field_i[0];
          var19[2][var8Lifetime1] = 16777215;
          var19[1][var8Lifetime1] = 2394342;
          var19[3][var8Lifetime1] = 4767999;
          for (var9 = 0; var9 < 3; var9++) {
            var14 = var6[var9];
            tp[] var10 = var14;
            for (var11_int = 0; var11_int < var14.length; var11_int++) {
              var14[var11_int] = ek.a(var5[var9], (byte) -85, var19[var11_int]);
            }
          }
          var9Lifetime1 = var17.height;
          jf.d(param2 ^ 88);
          var17.bindRasterTarget();
          Rasterizer2D.grayscaleRectangle(0, 0, Rasterizer2D.width, Rasterizer2D.height);
          var15 = new RgbSprite(var9Lifetime1, var9Lifetime1);
          var18 = var15;
          var18.bindRasterTarget();
          var17.drawAt(0, 0);
          var11 = new RgbSprite(var9Lifetime1, var9Lifetime1);
          var11.bindRasterTarget();
          if (param2 != -59) {
            nq.d(-50);
          }
          var17.drawAt(var9Lifetime1 - var17.width, 0);
          var12 = new RgbSprite(-(var9Lifetime1 * 2) + var17.width, var9Lifetime1);
          var12.bindRasterTarget();
          var17.drawAt(-var9Lifetime1, 0);
          sc.b(-81);
          sf.field_U = new RgbSprite[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "nq.G(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void c(int param0) {
        if (param0 != 0) {
          return;
        }
        this.field_j = oh.a(pq.pointerX, po.pointerY, (byte) -24, this.field_r, this.field_m, this.field_s);
        this.field_j = this.field_s.containsPixel(this.field_m, this.field_r, pq.pointerX, po.pointerY);
    }

    final static void e(int param0) {
        if (eo.field_f != null) {
          eo.field_f.f();
        }
        if (jk.field_w != null) {
          jk.field_w.f();
        }
        if (param0 < 39) {
          nq.a(-13, -69);
        }
    }

    public static void a(byte param0) {
        field_k = null;
        if (param0 > -40) {
          return;
        }
        field_n = null;
    }

    final static void d(int param0) {
        if (param0 != 2) {
          field_i = 90;
        }
        ld.field_s = true;
        ng.field_b = 0;
    }

    final static void a(int param0, int param1) {
        IntrusiveNode var2 = null;
        int var3 = 0;
        e var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = BrickABrac.field_J ? 1 : 0;
        try {
          if (param1 != 13330) {
            field_n = (String) null;
          }
          var4 = (e) (na.field_Q.first(-37));
          while (var4 != null) {
            LevelSelectScreen.a(param0, var4, (byte) 80);
            var4 = (e) (na.field_Q.next((byte) 116));
          }
          var2 = ej.field_F.first(param1 ^ -13402);
          while (var2 != null) {
            ma.b((byte) -85, param0);
            var2 = ej.field_F.next((byte) 116);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var2_ref), "nq.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static hl a(byte param0, String param1, mf param2, mf param3, String param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        hl stackIn_2_0 = null;
        hl stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = param2.a(param1, false);
          var6 = param2.a(var5_int, -80, param4);
          if (param0 == -37) {
            stackIn_4_0 = wn.a(var5_int, param3, param2, var6, (byte) -112);
            return stackIn_4_0;
          }
          stackIn_2_0 = (hl) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("nq.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    nq(int param0, int param1, RgbSprite param2, String param3) {
        try {
          this.field_s = param2;
          this.field_m = param0;
          this.field_r = param1;
          this.field_l = param3.toLowerCase();
          this.field_q = 2 * lm.field_b + ob.field_D.c(this.field_l);
          this.field_o = ob.field_D.field_P + 2 * ki.field_a + ob.field_D.field_F;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "nq.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0) {
        this.field_s.drawTransparent(this.field_m, this.field_r);
        if (param0 != 2) {
          return;
        }
        if (this.field_j) {
          hj.a(-lm.field_b + pq.pointerX, -ki.field_a + po.pointerY, this.field_o, this.field_q, this.field_l, 16777215);
        }
    }

    static {
        field_k = "Join";
        field_n = "Invalid password.";
        field_p = false;
    }
}
