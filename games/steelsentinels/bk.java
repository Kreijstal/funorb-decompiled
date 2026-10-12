/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk extends lh {
    private RgbSprite field_Y;
    private int field_S;
    private RgbSprite field_K;
    private int field_V;
    private RgbSprite[] field_R;
    boolean field_N;
    private int field_G;
    static fm field_M;
    private int field_T;
    private RgbSprite field_L;
    private int field_Q;
    int field_I;
    static String field_X;
    private int field_J;
    static int[] field_W;
    static String field_ab;
    static int field_Z;
    static String field_U;
    static String field_O;
    static String field_H;
    static String field_P;

    public static void g(int param0) {
        field_M = null;
        field_O = null;
        if (param0 != -47) {
          field_X = (String) null;
        }
        field_U = null;
        field_X = null;
        field_ab = null;
        field_W = null;
        field_H = null;
        field_P = null;
    }

    final void b(int param0, int param1, int param2) {
        this.field_V = param1;
        this.field_J = param0;
        this.field_Q = (param2 & param0) >> 1;
        this.field_S = 8355711 & param1 >> 1;
        this.f(-99);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (param3 != 0) {
          return;
        }
        int var5 = param2 + this.field_o;
        int var6 = this.field_z + param0;
        if (param1 > -99) {
          this.b(49, -19, 99);
        }
        this.a(var5, (byte) -8, var6, this.field_R[0]);
        if (this.field_I < 65536) {
          fe.a((this.field_I * this.field_x >> 16) + var5, var6, 115, this.field_x + var5, this.field_E + var6);
          this.a(var5, (byte) -87, var6, this.field_R[1]);
          tk.$cfr$intArgs$f$20d51497949f(97);
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        super.a(param0, (byte) -108, param2, param3, param4);
        this.f(-85);
        if (param1 > -71) {
          RgbSprite var7 = (RgbSprite) null;
          this.a(13, (byte) 41, 96, (RgbSprite) null);
        }
    }

    final void a(int param0, int param1, lh param2, int param3) {
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (this.field_N) {
            this.field_G = this.field_G + 1;
            if (this.field_T * 2 < this.field_G) {
              this.field_G = this.field_G - 2 * this.field_T;
            }
          }
          if (param1 <= 56) {
            this.field_J = 1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("bk.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    private final RgbSprite a(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = SteelSentinels.obfuscationControl;
        RgbSprite var14 = new RgbSprite(2 * this.field_T, this.field_E);
        int var8Lifetime1;
        int var9Lifetime1;
        int var12Lifetime1;
        q.a(var14, (byte) -116);
        if (param1 != 18634) {
          field_W = (int[]) null;
        }
        int var5 = this.field_E >> 1;
        for (var6 = 0; this.field_E > var6; var6++) {
          var7 = (var6 >> 1) * (this.field_T * 2 - 1) % (2 * this.field_T);
          var8 = param2 & 16711935;
          var9 = param2 & 65280;
          var10 = var6 - var5;
          var11 = (int)(Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5 * 128.0) + 128;
          var12 = 256 > var11 ? (16711680 & var11 * var9 | -16711936 & var11 * var8) >>> 8 : var8 | var9;
          SoftwareRaster.g(var7, var6, this.field_T, var12);
          SoftwareRaster.g(var7 - 2 * this.field_T, var6, this.field_T, var12);
          var9Lifetime1 = 65280 & param0;
          var8Lifetime1 = 16711935 & param0;
          var12Lifetime1 = var11 >= 256 ? var8Lifetime1 | var9Lifetime1 : (16711680 & var11 * var9Lifetime1 | var8Lifetime1 * var11 & -16711936) >>> 8;
          SoftwareRaster.g(var7 + this.field_T, var6, this.field_T, var12Lifetime1);
          SoftwareRaster.g(-this.field_T + var7, var6, this.field_T, var12Lifetime1);
        }
        tk.$cfr$intArgs$f$20d51497949f(107);
        return var14;
    }

    private final void a(int param0, byte param1, int param2, RgbSprite param3) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = SteelSentinels.obfuscationControl;
        try {
          var5_int = this.field_x + param0;
          fe.a(this.field_L.field_A + param0, param2, 86, -this.field_L.field_A + var5_int, this.field_E + param2);
          var6 = -this.field_G + param0;
          if (param1 >= -6) {
            field_P = (String) null;
          }
          while (var5_int > var6) {
            param3.a(var6, param2);
            var6 = var6 + param3.field_A;
          }
          tk.$cfr$intArgs$f$20d51497949f(113);
          if (this.field_L.field_A + param0 >= SoftwareRaster.field_i) {
            q.a(this.field_Y, (byte) -75);
            param3.a(-this.field_G, 0);
            param3.a(2 * this.field_T - this.field_G, 0);
            this.field_K.c(0, 0);
            tk.$cfr$intArgs$f$20d51497949f(107);
            this.field_Y.a(param0, param2);
          }
          if (SoftwareRaster.field_b >= var5_int - this.field_L.field_A) {
            q.a(this.field_Y, (byte) -63);
            for (var7 = -this.field_L.field_A + (this.field_x + this.field_G); 2 * this.field_T < var7; var7 = var7 - 2 * this.field_T) {
            }
            param3.a(-var7, 0);
            param3.a(this.field_T * 2 - var7, 0);
            this.field_L.c(0, 0);
            tk.$cfr$intArgs$f$20d51497949f(109);
            this.field_Y.a(var5_int - this.field_L.field_A, param2);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("bk.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static ef a(int param0, String param1) {
        ef stackIn_3_0 = null;
        ef stackIn_6_0 = null;
        ef stackIn_9_0 = null;
        ef stackIn_15_0 = null;
        int stackIn_24_0 = 0;
        ef stackIn_28_0 = null;
        ef stackIn_42_0 = null;
        ef stackIn_47_0 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var3Lifetime1;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = SteelSentinels.obfuscationControl;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_3_0 = ud.field_A;
            return stackIn_3_0;
          }
          if (var2_int > 64) {
            stackIn_6_0 = ma.field_cb;
            return stackIn_6_0;
          }
          if (param0 < 86) {
            stackIn_9_0 = (ef) null;
            return stackIn_9_0;
          }
          if (param1.charAt(0) == 34) {
            if (34 != param1.charAt(-1 + var2_int)) {
              stackIn_15_0 = ec.field_b;
              return stackIn_15_0;
            }
            var3 = 0;
            for (var4 = 1; var2_int - 1 > var4; var4++) {
              var5 = param1.charAt(var4);
              if (92 == var5) {
                stackIn_24_0 = (var3 != 0) ? 0 : 1;
                var3 = stackIn_24_0;
              } else {
                if (var5 == 34 &&
                  var3 == 0) {
                  stackIn_28_0 = ec.field_b;
                  return stackIn_28_0;
                }
                var3 = 0;
              }
            }
            return null;
          }
          var3Lifetime1 = 0;
          for (var4Lifetime1 = 0; var2_int > var4Lifetime1; var4Lifetime1++) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime1 = param1.charAt(var4Lifetime1);
            if (var5Lifetime1 == 46) {
              if (0 != var4Lifetime1 &&
                var4Lifetime1 != var2_int - 1 &&
                var3Lifetime1 == 0) {
                var3Lifetime1 = 1;
                decompiledFrameRemainder0 = false;
              }
              else {
                stackIn_42_0 = ec.field_b;
                return stackIn_42_0;
              }
            }
            if (decompiledFrameRemainder0) {
              if (nc.field_g.indexOf(var5Lifetime1) == -1) {
                stackIn_47_0 = ec.field_b;
                return stackIn_47_0;
              }
              var3Lifetime1 = 0;
            }
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_53_0 = var2;
          stackIn_53_1 = new StringBuilder().append("bk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_54_2 = "null";
          } else {
            stackIn_54_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_53_0), ((StringBuilder) (Object) stackIn_53_1).append(stackIn_54_2).append(')').toString());
        }
    }

    private final void f(int param0) {
        this.field_R = new RgbSprite[]{this.a(this.field_J, 18634, this.field_V), this.a(this.field_Q, 18634, this.field_S)};
        if (param0 > -66) {
          return;
        }
        this.field_L = this.a((byte) -127);
        this.field_K = this.field_L.a();
        this.field_Y = new RgbSprite(this.field_E >> 1, this.field_E);
    }

    final static void a(ResourceArchive param0, byte param1, BitmapFont param2) {
        int var6 = 0;
        int var7 = 0;
        int[] var16 = null;
        int var9 = 0;
        int var10 = SteelSentinels.obfuscationControl;
        int var3_int = dh.field_D;
        qf.field_c = new SceneWidget(0L, (SceneWidget) null);
        int var4 = -124 / ((param1 + 78) / 32);
        if (param0 == null) {
          sj.a("QC1", -29, (Throwable) null);
          return;
        }
        param0.fileRetentionMode = 0;
        param0.discardPackedGroups = false;
        cd.field_e = new co(var3_int, param0, param0);
        ArchiveIndex.field_w = new oe(var3_int, param0, param0, new kb());
        mn var5 = NodeDeque.d(0);
        if (var5 == null) {
          sj.a("QC2", -49, (Throwable) null);
          return;
        }
        try {
          fc.a(var5, 101);
          pg.field_u = fm.a(65793, false, 2245737, 1127256, 65793, 4020342, 1513239, 0, 1513239, 5138823, 8947848, (BitmapFont) null, 65793);
          Sprite.field_f = fm.a(0, false, 0, 0, 0, 0, 0, 16764006, 0, 0, 0, param2, 0);
          fb.field_l = fm.a(0, false, 0, 0, 0, 0, 0, 16777215, 0, 0, 0, param2, 0);
          var6 = SoftwareRaster.field_c;
          var7 = SoftwareRaster.field_j;
          var16 = SoftwareRaster.field_g;
          ik.field_g = new RgbSprite(10, 14);
          ik.field_g.d();
          for (var9 = 2; var9 < 7; var9++) {
            SoftwareRaster.d(var9, var9 + 1, 14 - (var9 << 1), 16777215);
          }
          SoftwareRaster.a(var16, var6, var7);
          ti.field_m = sg.a(fb.field_l, var5, false, Sprite.field_f, pg.field_u);
          qf.field_c.field_M = new NodeDeque();
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "bk.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    bk(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, (16711422 & param5) >> 1, 8355711 & param6 >> 1);
    }

    private final RgbSprite a(byte param0) {
        int var5 = 0;
        int var6 = 0;
        double var7 = 0.0;
        int var9 = 0;
        int var10 = SteelSentinels.obfuscationControl;
        int var2 = this.field_E >> 1;
        RgbSprite var3 = new RgbSprite(var2, this.field_E);
        q.a(var3, (byte) -62);
        int var4 = -8 % ((param0 + 87) / 36);
        for (var5 = 0; var5 < this.field_E; var5++) {
          for (var6 = 0; var6 < var2; var6++) {
            var7 = (double)var6 * (double)var6 / (double)((-var5 + this.field_E) * var5);
            var9 = 1;
            if (1.0 > var7) {
              var7 = Math.sqrt(1.0 - var7);
              var9 = var7 >= 1.0 ? 255 : (int)(255.0 * var7);
            }
            SoftwareRaster.b(var6, var5, var9 | var9 << 8 | var9 << 16);
          }
        }
        tk.$cfr$intArgs$f$20d51497949f(108);
        return var3;
    }

    private bk(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_S = param7;
        this.field_J = param6;
        this.field_V = param5;
        this.field_Q = param8;
        this.field_T = param4;
        this.a(param0, (byte) -73, param1, param2, param3);
    }

    static {
        field_X = "Play free version";
        field_M = new fm(0, 2, 2, 1);
        field_O = "EDD";
        field_H = "Your email address is used to identify this account";
        field_P = "Game";
    }
}
