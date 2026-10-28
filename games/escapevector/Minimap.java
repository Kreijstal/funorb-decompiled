/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;
import java.util.Vector;

final class Minimap {
    private int field_B;
    private int field_f;
    static int[] field_u;
    private int field_K;
    static Sprite field_r;
    private GameplaySession session;
    static String field_p;
    private int field_H;
    private IntrusiveDeque field_C;
    static String field_O;
    private LevelObject field_D;
    private int[] field_w;
    private int field_N;
    private int field_a;
    private int field_t;
    private int field_y;
    private int[] field_e;
    boolean field_L;
    private int field_g;
    private wd field_j;
    private int field_x;
    private boolean[] field_s;
    int pixelsPerTile;
    private int field_J;
    private int field_m;
    int field_c;
    private int field_q;
    private int[] field_o;
    private int field_l;
    boolean field_d;
    private pe field_M;
    private int field_b;
    private int field_F;
    private boolean field_I;
    private int field_G;
    private int field_k;
    private pe field_z;
    private int field_i;
    private boolean field_E;
    private int field_h;
    private int field_A;

    private final void drawTerrainTiles(int guard, int screenY, int screenX) {
        int var10 = EscapeVector.obfuscationControl;
        if (guard <= 85) {
          return;
        }
        int var4 = this.session.tilesWide * this.pixelsPerTile;
        int var5 = this.pixelsPerTile * this.session.tilesHigh;
        int var6 = (this.field_f - var4) / 2;
        int var7 = (-var5 + this.field_H) / 2;
        this.a(var6, (byte) 104, var5, var4, var7);
        var7 = var7 + screenY;
        var6 = var6 + screenX;
        for (int var8 = 0; var8 < this.session.tilesHigh; var8++) {
          for (int var9 = 0; this.session.tilesWide > var9; var9++) {
            this.b(var9, (byte) 99, var7 + this.pixelsPerTile * var8, this.pixelsPerTile * var9 + var6, var8);
          }
        }
    }

    private final boolean[] a(int[] param0, int param1, int param2, byte param3) {
        String stackIn_34_2 = null;
        int var18 = EscapeVector.obfuscationControl;
        try {
          if (param0 == null) {
            return null;
          }
          if (null == this.field_s) {
            this.field_s = new boolean[param1 * param2];
          }
          if (param0 == this.field_w) {
            boolean[] stackIn_9_0 = this.g(0);
            return stackIn_9_0;
          }
          this.field_s = this.a(0, this.field_s);
          if (param3 < 104) {
            boolean[] stackIn_12_0 = (boolean[]) null;
            return stackIn_12_0;
          }
          int var5_int = this.field_B / param1;
          int var6 = this.field_N / param2;
          for (int var7 = 0; param2 > var7; var7++) {
            int var8 = var7 * var6;
            int var9 = param1 * var7;
            for (int var10 = 0; param1 > var10; var10++) {
              int var11 = var10 * var5_int;
              for (int var12 = 0; var6 > var12; var12++) {
                int var13 = var8 + var12;
                if (this.field_N > var13) {
                  int var14 = param0[var13];
                  int var15 = var10 + var9;
                  for (int var16 = 0; var5_int > var16; var16++) {
                    int var17 = var16 + var11;
                    if (var17 < this.field_B) {
                      this.field_s[var15] = IsaacRandom.a(this.field_s[var15], this.c(var14, var17, -2));
                      continue;
                    }
                    break;
                  }
                  continue;
                }
                break;
              }
            }
          }
          boolean[] stackIn_30_0 = this.field_s;
          return stackIn_30_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_33_0 = var5;
          StringBuilder stackIn_33_1 = new StringBuilder().append("li.IA(");
          if (param0 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(LevelObject param0, int param1) {
        String stackIn_22_2 = null;
        int var5 = EscapeVector.obfuscationControl;
        try {
          if (param0 == null) {
            return;
          }
          if (1 == param0.objectType) {
            this.field_D = null;
          }
          if (this.field_C.isEmpty(param1 ^ -4348)) {
            return;
          }
          if (param1 != 4236) {
            return;
          }
          IntrusiveNode var3 = this.field_C.first(false);
          while (var3 != null) {
            LevelObject var4 = (LevelObject) (var3);
            if (var4.objectId == param0.objectId) {
              var4.unlink((byte) -60);
              return;
            }
            var3 = this.field_C.next((byte) 70);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3_ref = decompiledCaughtException;
          RuntimeException stackIn_21_0 = var3_ref;
          StringBuilder stackIn_21_1 = new StringBuilder().append("li.D(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    private final Sprite a(int param0, int param1) {
        ih var3 = fh.field_g;
        int var4 = var3.field_r + var3.field_x;
        int var5 = var4 / 2;
        int var6 = (-var5 + var4) / 2;
        if (param1 != -5425) {
          this.a(85, false, 28, 3);
        }
        Sprite var7 = new Sprite(var4, var4);
        var7.g();
        SoftwareRasterizer.a(var6, var6, var5, var5, param0);
        md.field_D.a(param1 + 5535);
        return var7;
    }

    private final void a(boolean param0, int param1, int param2, int param3) {
        this.drawTerrainTiles(98, param1, param2);
        this.a(false, param1, param2);
        this.d(param1, param2, 109);
        this.b(89, param1, param2);
        if (param3 != 4) {
          this.a(-104, 44, -51, -65, 36, -11, -3);
        }
        if (param0) {
          this.e(-124, param1, param2);
        }
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        int var5 = SoftwareRasterizer.pixels[param3];
        int var6 = 16711680;
        int var7 = 16;
        int var8 = 65280;
        int var9 = 8;
        int var10 = 255;
        int var11 = 0;
        int var12 = this.a(var6, param0, 256, param2, var5, var7);
        int var13 = this.a(var8, param0, 256, param2, var5, var9);
        int var14 = this.a(var10, param0, 256, param2, var5, var11);
        int var15 = 0;
        var15 = var15 | var6 & var12 << var7;
        var15 = var15 | var13 << var9 & var8;
        if (param1) {
          return;
        }
        var15 = var15 | var14 << var11 & var10;
        SoftwareRasterizer.pixels[param3] = var15;
    }

    public static void releaseStatics(int guard) {
        field_u = null;
        field_p = null;
        field_O = null;
        int var1 = 30 / ((guard + 2) / 47);
        field_r = null;
    }

    private final void e(int param0) {
        int var2 = (this.field_f - this.field_j.a(true)) / 2;
        int var3 = (this.field_f - this.pixelsPerTile * this.session.tilesWide) / 2;
        int var4 = this.session.tilesWide * this.pixelsPerTile;
        if (param0 <= 118) {
          int discarded$0 = this.a(28, -44, (byte) -72, -60, -37, 49, -114);
        }
        int var5 = 8;
        int var6 = var5 + var3 + var4;
        int var7 = var6 - var2;
        this.field_j.a((byte) -93, var7);
    }

    final boolean b(byte param0) {
        if (param0 >= -101) {
          return true;
        }
        return this.field_I;
    }

    final void b(int param0, boolean param1, int param2, int param3) {
        if (!this.field_I) {
          return;
        }
        if (this.field_L) {
          SoftwareRasterizer.b(0, 0, this.field_f, this.field_H);
        }
        this.a(param2, -32279, param0);
        if (!this.field_E) {
          this.a(param1, param0, param2, param3 ^ 4);
          return;
        }
        int var5 = this.session.tilesWide * this.pixelsPerTile;
        int var6 = this.f(56);
        int var7 = var6 - var5;
        if (param3 > var6) {
          this.a(param1, param0, -var6 + param2, 4);
          this.a(param1, param0, param2 - var7, 4);
        } else {
          this.a(param1, param0, var7 + param2, 4);
          this.a(param1, param0, var6 + param2, param3 + 4);
        }
    }

    private final SpriteStrip[] a(IntrusiveDeque param0, int param1) {
        String stackIn_9_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          int var3_int = param0.size((byte) 62);
          SpriteStrip[] var4 = new SpriteStrip[var3_int];
          int var5 = param1;
          IntrusiveNode var6 = param0.first(false);
          while (var6 != null) {
            SpriteStrip var7 = (SpriteStrip) (var6);
            int incrementValue$1 = var5;
            var5++;
            var4[incrementValue$1] = var7;
            var6 = param0.next((byte) 70);
          }
          SpriteStrip[] stackIn_5_0 = var4;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var3;
          StringBuilder stackIn_8_1 = new StringBuilder().append("li.K(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6) {
        int var8 = (param5 & param4) >>> param0;
        int var9 = (param4 & param3) >>> param0;
        int var10 = -var8 + var9;
        if (param6 <= 1) {
          return var8;
        }
        int var11 = var8 + var10 * param1 / (-1 + param6);
        if (param2 <= 117) {
          this.drawTerrainTiles(-52, -118, -38);
        }
        return var11;
    }

    private final int d(byte param0) {
        int var3 = this.field_a / this.session.tilesWide;
        int var4 = this.field_K / this.session.tilesHigh;
        if (param0 > -98) {
          this.c((byte) 81);
        }
        int var2 = var3;
        if (var4 < var3) {
          var2 = var4;
        }
        return var2;
    }

    private final int[] a(int[] param0, int param1, boolean param2) {
        String stackIn_20_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          if (param0 == null) {
            return null;
          }
          int var4_int = this.pixelsPerTile * param1;
          if (var4_int < 0) {
            Object stackIn_6_0 = null;
            return (int[]) (stackIn_6_0);
          }
          if (!param2) {
            this.field_L = false;
          }
          int var5 = 0;
          int var6 = var4_int;
          while (var5 < this.field_o.length) {
            if (this.field_e.length > var6) {
              this.field_o[var5] = this.field_e[var6];
            } else {
              this.field_o[var5] = this.field_e[this.field_e.length - 1];
            }
            var5++;
            var6++;
          }
          int[] stackIn_16_0 = this.field_o;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_19_0 = var4;
          StringBuilder stackIn_19_1 = new StringBuilder().append("li.W(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final int a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = this.a(param4, (byte) -119, param5, param0);
        int var8 = this.a(param3, (byte) -119, param5, param0);
        int var9 = -param1 + param2;
        int var10 = param1;
        int var11 = var7 * var9 + var8 * var10 >> 8;
        return var11;
    }

    private final void a(int[] param0, int param1, int param2, int param3, boolean[] param4, int param5, byte param6, int param7, int param8) {
        String stackIn_56_2 = null;
        String stackIn_59_2 = null;
        int var25 = EscapeVector.obfuscationControl;
        try {
          if (param3 >= 0 &&
            param3 <= 256) {
            if (param6 >= -62) {
              this.a(false);
            }
            int var10_int = param8 * this.field_f + param2;
            if (var10_int < 0) {
              return;
            }
            boolean stackIn_13_0 = !(param0 == null);
            boolean var11 = stackIn_13_0;
            for (int var12 = 0; var12 < param7; var12++) {
              int var13 = var12 + param8;
              if (this.field_M.field_a <= var13 &&
                var13 < this.field_z.field_a) {
                int var14 = param1 * var12;
                int var15 = var12 * this.field_f + var10_int;
                int var16 = param5;
                if (var11) {
                  var16 = param0[var12];
                }
                boolean var17 = false;
                if (var11) {
                  boolean stackIn_24_0 = !(var13 % this.field_i != 0);
                  var17 = stackIn_24_0;
                }
                for (int var18 = 0; var18 < param1; var18++) {
                  int var19 = param2 + var18;
                  if (this.field_M.field_b <= var19 &&
                    var19 < this.field_z.field_b) {
                    int var20 = var15 + var18;
                    if (var20 >= 0 &&
                      SoftwareRasterizer.pixels.length > var20) {
                      int var21 = var14 + var18;
                      boolean var22 = true;
                      if (param4 != null) {
                        var22 = (param4[var21]);
                      }
                      int var23 = param5;
                      if (var22) {
                        var23 = var16;
                      }
                      boolean var24 = false;
                      if (var11 &&
                        !var17) {
                        boolean stackIn_41_0 = !(0 != var19 % this.field_h);
                        var24 = stackIn_41_0;
                      }
                      if (var22 && (var24 ||
                        var17)) {
                        var23 = this.field_A;
                      }
                      if (param3 == 256) {
                        SoftwareRasterizer.pixels[var20] = var23;
                      } else {
                        this.a(param3, false, var23, var20);
                      }
                    }
                  }
                }
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var10 = decompiledCaughtException;
          RuntimeException stackIn_55_0 = var10;
          StringBuilder stackIn_55_1 = new StringBuilder().append("li.T(");
          if (param0 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          StringBuilder stackIn_58_1 = ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    private final void a(int param0, byte param1, int param2, int param3, int param4) {
        if (!this.field_d) {
          return;
        }
        int var6 = param3 + param0;
        int var7 = param2 + param4;
        int var8 = 6;
        fk.a(var6 + var8, this.field_F, 73, 0, this.field_g, -var8 + param4, param0 - var8, 0, var7 + var8);
        ih var9 = fh.field_g;
        int var10 = var9.field_x + var9.field_r;
        if (param1 != 104) {
          this.field_E = false;
        }
        int var11 = -var8 + (param4 - (var10 + var9.field_x));
        int var12 = 15658734;
        String var13 = null == this.field_D ? sj.field_k : FullscreenFocusCanvas.field_b;
        var9.c(var13, this.field_f / 2, var11, var12, -1);
        this.d(111);
    }

    private final void d(int param0) {
        if (this.field_j == null) {
          return;
        }
        int var3 = -40 / ((param0 + 5) / 37);
        int var2 = (this.field_H - this.pixelsPerTile * this.session.tilesHigh) / 2;
        int var4 = this.pixelsPerTile * this.session.tilesHigh;
        int var5 = this.field_j.b((byte) -90);
        int var6 = (-var5 + var4) / 2 + var2;
        this.field_j.a(var6, 3);
    }

    private final boolean c(int param0, int param1, int param2) {
        if (param2 != -2) {
          this.field_f = -61;
        }
        return 0 != (1 << param1 & param0) ? true : false;
    }

    private final void b(int param0, int param1, int param2) {
        int var8 = EscapeVector.obfuscationControl;
        IntrusiveDeque var4 = this.session.missionTargets;
        if (var4 == null) {
          return;
        }
        if (var4.isEmpty(-116)) {
          return;
        }
        int var5 = this.a((byte) -29, this.field_x);
        IntrusiveNode var6 = var4.first(false);
        while (var6 != null) {
          LevelObject var7 = (LevelObject) (var6);
          if (var7.missionTarget) {
            this.a(param2, var7.x, this.field_l, var5, param1, var7.y, 4);
          }
          var6 = var4.next((byte) 70);
        }
        if (param0 < 40) {
          this.field_e = (int[]) null;
        }
    }

    private final void d(int param0, int param1, int param2) {
        int var7 = EscapeVector.obfuscationControl;
        if (this.field_C.isEmpty(-103)) {
          return;
        }
        IntrusiveNode var4 = this.field_C.first(false);
        if (param2 < 35) {
          this.c((byte) 4);
        }
        while (var4 != null) {
          LevelObject var5 = (LevelObject) (var4);
          int var6 = this.a((byte) -29, this.field_m);
          this.a(param1, var5.x, this.field_G, var6, param0, var5.y, 4);
          var4 = this.field_C.next((byte) 70);
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int var8 = (this.field_f - this.session.tilesWide * this.pixelsPerTile) / 2;
        int var9 = (this.field_H - this.pixelsPerTile * this.session.tilesHigh) / 2;
        int var10 = param1 * this.pixelsPerTile / this.field_B;
        int var11 = this.pixelsPerTile * param5 / this.field_N;
        int var12 = var8 + var10;
        if (param6 != 4) {
          this.session = (GameplaySession) null;
        }
        int var13 = var11 + var9;
        int var14 = this.pixelsPerTile * this.field_t;
        var14 = 20 < var14 ? 20 : var14;
        int var15 = var14;
        int var16 = var14;
        this.a((int[]) null, var15, var12 + param0, param3, (boolean[]) null, param2, (byte) -72, var16, var13 + param4);
    }

    private final void c(byte param0) {
        ih var2 = fh.field_g;
        int var3 = 16777215;
        int var4 = 16777215;
        if (param0 != -112) {
          this.field_b = 95;
        }
        this.field_j.a(var4, var2, var3, 125);
    }

    private final String[] b(IntrusiveDeque param0, int param1) {
        String stackIn_11_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          int var3_int = param0.size((byte) 73);
          String[] var4 = new String[var3_int];
          int var5 = 0;
          IntrusiveNode var6 = param0.first(false);
          while (var6 != null) {
            sj var7 = (sj) (var6);
            int incrementValue$3 = var5;
            var5++;
            var4[incrementValue$3] = var7.field_g;
            var6 = param0.next((byte) 70);
          }
          if (param1 != 11125) {
            int discarded$2 = this.a(54, -100, (byte) 126, 78, 66, 10, 81);
          }
          String[] stackIn_7_0 = var4;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_10_0 = var3;
          StringBuilder stackIn_10_1 = new StringBuilder().append("li.G(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void b(int param0) {
        int var8 = EscapeVector.obfuscationControl;
        this.field_o = new int[this.pixelsPerTile];
        if (param0 != 100) {
          int discarded$0 = this.a(76, (byte) -11, -116, -105);
        }
        int var2 = this.session.tilesHigh * this.pixelsPerTile;
        this.field_e = new int[var2];
        for (int var3 = 0; var3 < this.field_e.length; var3++) {
          int var4 = this.a(16, var3, (byte) 122, this.field_k, 16711680, this.field_b, this.field_e.length);
          int var5 = this.a(8, var3, (byte) 120, this.field_k, 65280, this.field_b, this.field_e.length);
          int var6 = this.a(0, var3, (byte) 118, this.field_k, 255, this.field_b, this.field_e.length);
          int var7 = 16770546 & var4 << 16;
          var7 = var7 | (-1442840321 & var5) << 8;
          var7 = var7 | 255 & var6;
          this.field_e[var3] = var7;
        }
    }

    final void a(byte param0) {
        this.b(0, true, 0, 0);
        if (param0 != -120) {
          Minimap.releaseStatics(80);
        }
    }

    private final int a(byte param0, int param1) {
        int var3 = this.field_c;
        var3 = var3 % param1;
        param1 = param1 / 2;
        boolean var4 = (param1 <= var3);
        if (var4) {
          var3 = var3 - param1;
        }
        if (param0 != -29) {
          this.field_e = (int[]) null;
        }
        if (var4) {
          return var3 * 255 / param1;
        }
        return -(255 * var3 / param1) + 255;
    }

    final void e(byte param0) {
        if (param0 != -101) {
          return;
        }
        this.field_I = !this.field_I ? true : false;
    }

    private final boolean[] g(int param0) {
        int var3 = EscapeVector.obfuscationControl;
        for (int var2 = param0; this.field_s.length > var2; var2++) {
          this.field_s[var2] = true;
        }
        return this.field_s;
    }

    private final void c(int param0) {
        int var7 = EscapeVector.obfuscationControl;
        if (this.session == null) {
          return;
        }
        Vector var2 = this.session.levelObjects;
        int var3 = var2.size();
        for (int var4 = param0; var3 > var4; var4++) {
          LevelObject var5 = (LevelObject) (var2.elementAt(var4));
          if (var5 != null) {
            int var6 = var5.objectType;
            if ((ResourceArchive.isPowerupType(var6, -64) ||
              var6 == 0 ||
              var6 == 5) && var6 != 1) {
              this.field_C.addLast(param0 - 12328, var5);
            }
          }
        }
    }

    private final int f(int param0) {
        int var2 = this.session.tilesWide * this.pixelsPerTile;
        int var3 = var2 / 2;
        int var4 = this.session.spawnXQ16 >> 16;
        var4 = this.pixelsPerTile * var4 / this.field_B;
        int var5 = 1 + var3 - var4;
        if (param0 < 24) {
          return 24;
        }
        return var5;
    }

    private final void e(int param0, int param1, int param2) {
        int var4 = this.session.shipXQ16 >> 16;
        if (param0 > -117) {
          return;
        }
        int var5 = this.session.shipYQ16 >> 16;
        this.a(param2, var4, this.field_y, 256, param1, var5, 4);
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = this.session.tilesWide * this.pixelsPerTile;
        int var5 = this.session.tilesHigh * this.pixelsPerTile;
        if (param1 != -32279) {
          Sprite discarded$0 = this.a(91, -67);
        }
        int var6 = (this.field_f - var4) / 2 + param0;
        int var7 = var4 + var6;
        int var8 = (this.field_H - var5) / 2 + param2;
        int var9 = var8 + var5;
        this.field_M.field_a = var8;
        this.field_M.field_b = var6;
        this.field_z.field_b = var7;
        this.field_z.field_a = var9;
    }

    private final int a(int param0, byte param1, int param2, int param3) {
        if (param1 != -119) {
          Sprite discarded$0 = this.a(118, -21);
        }
        return (param3 & param0) >> param2;
    }

    private final boolean[] a(int param0, boolean[] param1) {
        String stackIn_9_2 = null;
        int var4 = EscapeVector.obfuscationControl;
        try {
          for (int var3_int = param0; param1.length > var3_int; var3_int++) {
            param1[var3_int] = false;
          }
          boolean[] stackIn_5_0 = (boolean[]) (param1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var3;
          StringBuilder stackIn_8_1 = new StringBuilder().append("li.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        if (param0) {
          boolean[] var5 = (boolean[]) null;
          boolean[] discarded$0 = this.a(122, (boolean[]) null);
        }
        if (null == this.field_D) {
          return;
        }
        if (this.session.cargoLost) {
          return;
        }
        int var4 = this.a((byte) -29, this.field_J);
        this.a(param2, this.field_D.x, this.field_q, var4, param1, this.field_D.y, 4);
    }

    private final void a(boolean param0) {
        String var2 = sf.field_n;
        IntrusiveDeque var3 = new IntrusiveDeque();
        IntrusiveDeque var4 = new IntrusiveDeque();
        var3.addLast(-12328, new sj(qj.field_d));
        if (!param0) {
          return;
        }
        var4.addLast(-12328, new SpriteStrip(new Sprite[]{this.a(this.field_y, -5425)}, 0));
        if (null != this.field_D) {
          var3.addLast(-12328, new sj(gk.field_b));
          var4.addLast(-12328, new SpriteStrip(new Sprite[]{this.a(this.field_q, -5425)}, 0));
        }
        IntrusiveDeque var5 = this.session.missionTargets;
        if (var5 != null &&
          !var5.isEmpty(-103)) {
          var3.addLast(-12328, new sj(wd.field_q));
          var4.addLast(-12328, new SpriteStrip(new Sprite[]{this.a(this.field_l, -5425)}, 0));
        }
        if (this.field_C != null &&
          !this.field_C.isEmpty(-111)) {
          var3.addLast(-12328, new sj(IterableDualLinkDeque.field_a));
          var4.addLast(-12328, new SpriteStrip(new Sprite[]{this.a(this.field_G, -5425)}, 0));
        }
        this.field_j = new wd(var2, this.a(var4, 0), this.b(var3, 11125));
        this.c((byte) -112);
        this.e(126);
        return;
    }

    private final void b(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 <= 60) {
          return;
        }
        int[][] var11 = this.session.terrainMasks;
        int[][] var6 = var11;
        int var7 = param4 * this.session.tilesWide + param0;
        if (var11 == null) {
          return;
        }
        if (var7 >= 0) {
          if (var11.length <= var7) {
            return;
          }
          int[] var8 = var11[var7];
          int[] var9 = this.a(var8, param4, true);
          boolean[] var10 = this.a(var8, this.pixelsPerTile, this.pixelsPerTile, (byte) 109);
          this.a(var9, this.pixelsPerTile, param3, 256, var10, this.field_F, (byte) -99, this.pixelsPerTile, param2);
          return;
        }
    }

    Minimap(GameplaySession session, LevelObject focusObject, boolean option) {
        this.field_B = 32;
        this.field_w = QuickChatPhraseDefinition.fullTileMask;
        this.field_f = 640;
        this.field_K = 349;
        this.field_H = 480;
        this.field_N = 32;
        this.field_a = 402;
        this.field_C = new IntrusiveDeque();
        this.field_L = true;
        this.field_g = 4755528;
        this.field_y = 15658734;
        this.field_m = 100;
        this.field_c = 0;
        this.field_J = 100;
        this.field_t = 2;
        this.pixelsPerTile = 1;
        this.field_d = true;
        this.field_I = false;
        this.field_q = 16711680;
        this.field_x = 100;
        this.field_l = 16711680;
        this.field_F = 1;
        this.field_k = 998158;
        this.field_G = 16776960;
        this.field_b = 3568436;
        this.field_M = new pe(0, 0);
        this.field_z = new pe(this.field_f, this.field_H);
        this.field_i = 4;
        this.field_h = 4;
        this.field_A = 1138193;
        try {
          this.field_D = focusObject;
          this.field_E = option ? true : false;
          this.session = session;
          this.c(0);
          this.pixelsPerTile = this.d((byte) -105);
          this.b(100);
          this.a(true);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "li.<init>(" + (session != null ? "{...}" : "null") + ',' + (focusObject != null ? "{...}" : "null") + ',' + option + ')');
        }
    }

    static {
        field_u = new int[8192];
        field_p = "Rock Buster";
        field_O = "Back";
    }
}
