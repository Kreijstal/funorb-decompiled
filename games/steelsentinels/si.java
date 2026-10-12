/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends da {
    static String field_F;
    static String field_u;
    private int field_G;
    static int[] field_k;
    static boolean field_y;
    private int field_z;
    static rj field_o;
    static String field_w;
    static boolean field_p;
    private int field_B;
    static SceneWidget field_v;
    private int field_q;
    static GameplayController field_A;
    static IndexedSprite[] field_l;
    private int field_r;
    private String field_n;
    static int field_m;
    private BitmapFont field_x;
    static String[] field_D;
    static String[] field_j;
    static String field_C;
    private boolean field_s;
    static String[] field_H;
    static int field_t;
    static RgbSprite[] field_E;

    final static void c(int param0) {
        int var2 = 0;
        int var1_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var3 = SteelSentinels.obfuscationControl;
        try {
          if (param0 <= 12) {
            return;
          }
          var1_int = 255;
          for (var2 = 0; var2 < 50; var2++) {
            SoftwareRaster.c(0, var2, 640, 1052688, var1_int);
            var1_int -= 5;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "si.S(" + param0 + ')');
        }
    }

    final static int a(SceneWidget param0, boolean param1, int param2) {
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        SceneWidget var5 = null;
        String var6 = null;
        SceneWidget var7 = null;
        SceneWidget var9 = null;
        int var10 = 0;
        SceneWidget var11 = null;
        var10 = SteelSentinels.obfuscationControl;
        try {
          stackIn_4_0 = (1 != fg.field_Ob) ? 64 : 78;
          var3_int = stackIn_4_0;
          if ((1008 & fg.field_Ob) != 0) {
            var3_int = 36;
          }
          var4 = qa.field_O;
          var5 = new SceneWidget(-1L, (SceneWidget) null);
          var5.field_Pb = gj.field_a;
          var5.field_Kb = 2;
          var5.a(0, param2, 18, 0, var4);
          param0.a(var5, 118);
          var6 = ResourceArchive.field_p;
          var7 = new SceneWidget(-1L, kh.field_s, var6);
          var7.field_nb = 0;
          var7.field_L = (BitmapFont) ((Object) pl.field_U);
          if (!param1) {
            var11 = (SceneWidget) null;
            si.a((SceneWidget) null, true, -1);
          }
          var7.a(0, param2, 18, 0, var4);
          var7.field_Fb = 1;
          var7.field_sb = 1;
          var7.field_I = null;
          var7.field_Kb = 1;
          param0.a(var7, 119);
          param2 = param2 + var7.field_Lb;
          for (var8 = 0; var8 < ue.field_c.length; var8++) {
            if (ue.field_c[var8] != null) {
              var9 = ff.a(false, 1 + var8, ue.field_c[var8]);
              param2 += 2;
              var9.a(0, param2, var3_int, 0, var4);
              param2 = param2 + var3_int;
              param0.a(var9, 126);
            }
          }
          stackIn_17_0 = param2;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("si.P(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static ik b(int param0) {
        String var1 = jj.a(true);
        if (param0 != 64) {
          si.c(-82);
        }
        if (var1 != null &&
          !(var1.indexOf('@') < 0)) {
          var1 = "";
        }
        return new ik(jj.a(true), Projectile.j(param0 ^ 16777151));
    }

    public static void a(int param0) {
        field_u = null;
        field_A = null;
        field_j = null;
        field_k = null;
        field_D = null;
        field_w = null;
        if (param0 != 24) {
          si.b(30);
        }
        field_o = null;
        field_v = null;
        field_E = null;
        field_H = null;
        field_F = null;
        field_C = null;
        field_l = null;
    }

    final void a(String param0, boolean param1, int param2, int param3, BitmapFont param4) {
        il var8 = null;
        il var9 = null;
        if (param0 == null) {
          this.field_h = null;
          return;
        }
        if (param4 == this.field_x &&
          this.field_s &&
          this.field_r == 2 &&
          this.field_n != null &&
          this.field_n.equals(param0)) {
          return;
        }
        try {
          this.field_x = param4;
          this.field_n = param0;
          if (!param1) {
            this.field_z = -7;
          }
          this.field_r = 2;
          this.field_s = true;
          var8 = this.a(param0, (byte) 118, param4, param3);
          var9 = var8;
          var9.field_f[0] = param2 - param4.c(param0);
          var9.field_f[param0.length()] = param2;
          kk.a(var9, 110, 0, param0, param4);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "si.O(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, String param1, int param2, int param3, BitmapFont param4) {
        il var7 = null;
        il var8 = null;
        if (param1 == null) {
          this.field_h = null;
          return;
        }
        if (param2 < 19) {
          return;
        }
        if (param4 == this.field_x &&
          this.field_s &&
          0 == this.field_r &&
          this.field_n != null &&
          this.field_n.equals(param1)) {
          return;
        }
        try {
          this.field_s = true;
          this.field_n = param1;
          this.field_r = 0;
          this.field_x = param4;
          var7 = this.a(param1, (byte) 117, param4, param3);
          var8 = var7;
          var7.field_f[0] = param0;
          var8.field_f[param1.length()] = param4.c(param1) + param0;
          kk.a(var8, 95, 0, param1, param4);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "si.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, String param1, int param2, int param3, BitmapFont param4) {
        il var8 = null;
        int var7 = 0;
        if (param1 == null) {
          this.field_h = null;
          return;
        }
        if (param4 == this.field_x &&
          this.field_s &&
          this.field_r == 1 &&
          null != this.field_n &&
          this.field_n.equals(param1)) {
          return;
        }
        try {
          if (param3 != -1385548511) {
            si.c(24);
          }
          this.field_x = param4;
          this.field_r = 1;
          this.field_s = true;
          var8 = this.a(param1, (byte) 117, param4, param2);
          var7 = param4.c(param1);
          var8.field_f[0] = param0 - (var7 >> 1);
          var8.field_f[param1.length()] = (var7 >> 1) + param0;
          kk.a(var8, param3 ^ -1385548469, 0, param1, param4);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "si.T(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, String param3, int param4, BitmapFont param5, int param6, int param7) {
        il stackIn_34_0;
        il stackIn_34_1;
        int stackIn_34_2;
        int stackIn_34_3;
        il stackIn_35_0 = null;
        il stackIn_35_1 = null;
        int stackIn_35_4 = 0;
        il stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_39_2 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        il var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        int var12Lifetime1;
        var15 = SteelSentinels.obfuscationControl;
        try {
          if (0 == param2) {
            param2 = param5.field_W;
          }
          if (param3 == null) {
            this.field_h = null;
            return;
          }
          if (this.field_x == param5 &&
            !this.field_s &&
            param1 == this.field_r &&
            param4 == this.field_B &&
            param2 == this.field_z &&
            this.field_q == param6 &&
            this.field_G == param0 &&
            null != this.field_n &&
            this.field_n.equals(param3)) {
            return;
          }
          this.field_s = false;
          this.field_z = param2;
          this.field_B = param4;
          this.field_n = param3;
          this.field_q = param6;
          this.field_x = param5;
          this.field_r = param1;
          this.field_G = param0;
          var16 = new String[param5.b(param3, param0) + param7];
          var17 = var16;
          var10 = Math.max(1, param5.a(param3, new int[]{param0}, var17));
          if (this.field_B == 3 &&
            1 == var10) {
            this.field_B = 1;
          }
          if (this.field_B != 0) {
            if (1 != this.field_B) {
              if (this.field_B == 2) {
                var11 = -(this.field_z * var10) + (this.field_q - param5.field_F);
              } else {
                var12 = (this.field_q - this.field_z * var10) / (var10 + 1);
                if (var12 < 0) {
                  var12 = 0;
                }
                this.field_z = this.field_z + var12;
                var11 = var12 + param5.field_G;
              }
            } else {
              var11 = (-(var10 * this.field_z) + this.field_q >> 1) + param5.field_G;
            }
          } else {
            var11 = param5.field_G;
          }
          this.field_h = new il[var10];
          for (var12Lifetime1 = 0; var10 > var12Lifetime1; var12Lifetime1++) {
            var13 = var16[var12Lifetime1];
            stackIn_34_0 = null;
            stackIn_34_1 = null;
            stackIn_34_2 = -param5.field_G + var11;
            stackIn_34_3 = var11 + param5.field_F;
            if (var13 != null) {
              stackIn_35_0 = null;
              stackIn_35_1 = null;
              stackIn_35_4 = var13.length();
            } else {
              stackIn_35_0 = null;
              stackIn_35_1 = null;
              stackIn_35_4 = 0;
            }
            var14 = new il(stackIn_34_2, stackIn_34_3, stackIn_35_4);
            var14.field_f[0] = 0;
            if (var13 != null) {
              var14.field_f[var13.length()] = param5.c(var13);
              stackIn_38_0 = var14;
              stackIn_38_1 = param7 - 63;
              if (3 == param1) {
                stackIn_39_2 = this.a(var13, param0, param5.c(var13), (byte) 116);
              } else {
                stackIn_39_2 = 0;
              }
              kk.a(stackIn_38_0, stackIn_38_1, stackIn_39_2, var13, param5);
            }
            this.field_h[var12Lifetime1] = var14;
            var11 = var11 + param2;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_44_0 = var9;
          stackIn_44_1 = new StringBuilder().append("si.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          stackIn_47_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    private final il a(String param0, byte param1, BitmapFont param2, int param3) {
        il var5 = null;
        RuntimeException var5_ref = null;
        il var6 = null;
        il stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 116) {
            field_k = (int[]) null;
          }
          var6 = new il(-param2.field_G + param3, param2.field_F + param3, param0.length());
          var5 = var6;
          this.field_h = new il[]{var6};
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("si.L(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    public si() {
    }

    static {
        field_F = "Default head for the <%0>-class sentinel.";
        field_w = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_k = new int[]{92, 106, 48, 24, 24, 24, 95, 24, 24, 24, 24, 93, 37, 37, 37, 52, 9, 14, 27, 20, 31, 4, -1, -1};
        field_p = true;
        field_u = "This game option has not yet been unlocked for use.";
        field_m = 0;
        field_H = new String[]{"WOE TO THE CONQUERED!", "PROCEED ON YOUR WAY TO OBLIVION.", "HAVE YOU NOTHING ELSE?", "THIS WORLD IS MINE."};
        field_D = new String[]{"POWER GENERATION", "ENERGY STORAGE", "ENERGY SHIELDING", "ARMOUR", "TARGETING", "WEAPON ENHANCEMENT", "TRANSPORTATION", "OTHER"};
        field_C = "<%0> must play 1 more rated game before playing with the current options.";
        field_j = new String[]{"Loading text", "Lade Text", "Chargement du texte", "Carregando textos", "Tekst laden", "Cargando texto"};
    }
}
