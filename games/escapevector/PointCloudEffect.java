/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class PointCloudEffect extends DualLinkNode {
    static String[] field_r;
    int[] field_C;
    boolean field_B;
    private boolean field_s;
    static boolean field_t;
    static String field_v;
    int[] field_y;
    int[] field_x;
    boolean field_q;
    private int field_F;
    static ResourceArchive field_D;
    int[] field_A;
    int[] field_w;
    private int field_G;
    boolean[] field_E;
    static int field_u;
    static String[] field_z;

    final void a(int param0, int param1, int param2) {
        int var11 = EscapeVector.obfuscationControl;
        int var4 = 2147483647;
        int var5 = -2147483648;
        int var6 = 2147483647;
        int var7 = -2147483648;
        for (int var8 = 0; var8 < this.field_F; var8++) {
          if (this.field_E == null ||
            this.field_E[var8]) {
            int var9 = this.field_x[var8] >> 16;
            if (var9 - 2 < var4) {
              var4 = -2 + var9;
            }
            if (var5 < var9 + 3) {
              var5 = 3 + var9;
            }
            int var10 = this.field_A[var8] >> 16;
            if (-2 + var10 < var6) {
              var6 = var10 - 2;
            }
            if (var7 < var10 + 3) {
              var7 = var10 + 3;
            }
          }
        }
        if (param0 < 79) {
          this.a(126, 35, 57, -87, -120, 87);
        }
        if (var4 >= var5) {
          return;
        }
        if (var7 <= var6) {
          return;
        }
        int var8Lifetime1 = var5 - var4;
        this.a(var8Lifetime1, var6, 58, var5, var7, var4);
        this.a(var6, var4, 26, var8Lifetime1);
        this.f(19507);
        this.b(var6, -641, var8Lifetime1, param2, var4, param1);
    }

    private final void d(int param0, int param1) {
        this.field_w = new int[param0];
        this.field_A = new int[param0];
        this.field_y = new int[param0];
        if (param1 != 0) {
          return;
        }
        this.field_x = new int[param0];
        this.field_C = new int[param0];
    }

    final void a() {
        for (int var1 = 0; var1 < this.field_F; var1++) {
          if (this.field_E == null ||
            this.field_E[var1]) {
            this.i(var1);
            double var2 = (double)this.field_y[var1];
            double var4 = (double)this.field_C[var1];
            double var6 = (double)this.field_w[var1];
            double var8 = 1.0 - 0.000002 * Math.sqrt(var2 * var2 + var4 * var4 + var6 * var6);
            if (var8 < 0.5) {
              var8 = 0.5;
            }
            var2 = var2 * var8;
            var4 = var4 * var8;
            var6 = var6 * var8;
            this.field_y[var1] = (int)var2;
            this.field_C[var1] = (int)var4;
            this.field_w[var1] = (int)var6;
          }
        }
        if (this.field_s) {
          return;
        }
        this.field_G = this.field_G + 3;
    }

    final void f(byte param0) {
        int var3 = EscapeVector.obfuscationControl;
        int var2 = 0;
        if (param0 > -124) {
          return;
        }
        while (var2 < this.field_F) {
          this.field_E[var2] = false;
          var2++;
        }
    }

    private final boolean b(int param0, int param1) {
        int[][] var3 = BoundedRandomAccessFile.activeSession.terrainMasks;
        int var4 = BoundedRandomAccessFile.activeSession.tilesWide;
        int[] var5 = QuickChatPhraseDefinition.fullTileMask;
        param0 = param0 >> 16;
        param1 = param1 >> 16;
        int var6 = param0 >> 5;
        int var7 = param1 >> 5;
        if (var7 < 0) {
          return false;
        }
        int[] var8 = var5;
        if (var7 < BoundedRandomAccessFile.activeSession.tilesHigh) {
          while (var6 < 0) {
            var6 = var6 + var4;
          }
          var6 = var6 % var4;
          var8 = var3[var7 * var4 + var6];
          if (var8 == null) {
            return false;
          }
        }
        if (var8 != var5) {
          int var9 = param0 & 31;
          int var10 = param1 & 31;
          if ((var8[var10] & 1 << var9) == 0) {
            return false;
          }
        }
        return true;
    }

    public static void releaseStatics(int guard) {
        field_z = null;
        field_D = null;
        field_r = null;
        if (guard <= 66) {
          PointCloudEffect.d((byte) 25);
        }
        field_v = null;
    }

    private final void b(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = 0;
        IndexedSprite stackIn_8_0 = null;
        int var10 = EscapeVector.obfuscationControl;
        for (var7 = -param5 + param4; -param2 < var7; var7 = var7 - BoundedRandomAccessFile.activeSession.worldWidth) {
        }
        if (param1 != -641) {
          this.e(-1, -98);
        }
        var7 = var7 + BoundedRandomAccessFile.activeSession.worldWidth;
        if (this.field_q) {
          stackIn_8_0 = gi.field_c;
        } else {
          stackIn_8_0 = rl.field_k;
        }
        IndexedSprite var8 = stackIn_8_0;
        try {
          IndexedSprite var9 = this.e((byte) 96);
          while (var7 < 640) {
            var8.draw(var7, param0 - param3);
            if (var9 != null) {
              var9.draw(var7, -param3 + param0);
            }
            var7 = var7 + BoundedRandomAccessFile.activeSession.worldWidth;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          Throwable decompiledCaughtException = decompiledCaughtParameter0;
          Exception var9_ref = (Exception) (Object) decompiledCaughtException;
          System.out.println("Error");
        }
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var11 = EscapeVector.obfuscationControl;
        if (param2 <= 8) {
          IndexedSprite var12 = (IndexedSprite) null;
          this.a(-110, (IndexedSprite) null, (IndexedSprite) null);
        }
        for (int var5 = 0; var5 < this.field_F; var5++) {
          if (null == this.field_E ||
            this.field_E[var5]) {
            int var6 = this.field_x[var5] >> 16;
            int var7 = this.field_A[var5] >> 16;
            var6 = var6 - param1;
            var7 = var7 - param0;
            int var8 = var7 * param3 + var6;
            int var9 = 4096 - this.field_G * 16 >> 8;
            kh.a((byte) 99, var9, var8);
            int var10 = 14 * var9 >> 4;
            kh.a((byte) -101, var10, -1 + var8);
            kh.a((byte) -127, var10, var8 + 1);
            kh.a((byte) -113, var10, -param3 + var8);
            kh.a((byte) -108, var10, var8 + param3);
            int var10Lifetime1 = var9 * 12 >> 4;
            kh.a((byte) -84, var10Lifetime1, -1 + (-param3 + var8));
            kh.a((byte) 117, var10Lifetime1, 1 + (var8 - param3));
            kh.a((byte) 50, var10Lifetime1, var8 + param3 - 1);
            kh.a((byte) -47, var10Lifetime1, 1 + (var8 + param3));
            var9 = var9 >> 1;
            kh.a((byte) -103, var9, var8 - 2);
            kh.a((byte) 78, var9, var8 + 2);
            kh.a((byte) 79, var9, -(param3 * 2) + var8);
            int var10Lifetime2 = var9 * 5 >> 3;
            kh.a((byte) 36, var9, var8 + param3 * 2);
            kh.a((byte) -69, var10Lifetime2, var8 - param3 - 2);
            kh.a((byte) 23, var10Lifetime2, -2 + var8 + param3);
            kh.a((byte) 61, var10Lifetime2, var8 - param3 + 2);
            kh.a((byte) 88, var10Lifetime2, 2 + var8 + param3);
            kh.a((byte) 65, var10Lifetime2, var8 - (param3 * 2 + 1));
            kh.a((byte) 55, var10Lifetime2, -(param3 * 2) + var8 + 1);
            kh.a((byte) -114, var10Lifetime2, -1 + 2 * param3 + var8);
            kh.a((byte) 119, var10Lifetime2, 1 + var8 + 2 * param3);
          }
        }
    }

    final static void a(int param0, byte param1, cc param2) {
        try {
          if (param1 != -107) {
            field_t = true;
          }
          RasterBuffer.field_e.addLast(-12328, param2);
          IntrusiveNode.a(-97, param0, param2);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oc.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void g(byte param0) {
        int var7 = EscapeVector.obfuscationControl;
        int var3 = 118 / ((param0 + 12) / 57);
        for (int var2 = 0; var2 < 256; var2++) {
          int var4 = -(var2 * var2) + 512 * var2 >> 8;
          int var5 = var2;
          int var6 = var2 * var2 >> 8;
          if (var2 < 128) {
            var6 = var6 + (var2 * 128 - var2 * var2 >> 5);
          }
          rl.field_k.field_l[var2] = MatchingTextValidator.a(MatchingTextValidator.a(var4 << 16, var5 << 8), var6);
        }
    }

    private final void a(int param0, IndexedSprite param1, IndexedSprite param2) {
        try {
          param2.field_a = param1.field_a;
          param2.field_g = param1.field_g;
          if (param0 <= 53) {
            this.f(32);
          }
          param2.field_d = param1.field_d;
          param2.field_h = param1.field_h;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oc.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final boolean c(int param0, int param1) {
        int var7;
        for (int var3 = 0; var3 < BoundedRandomAccessFile.activeSession.levelObjects.size(); var3++) {
          LevelObject var4 = (LevelObject) (BoundedRandomAccessFile.activeSession.levelObjects.elementAt(var3));
          Sprite var5 = var4.collisionSprite;
          int var6 = var4.y + var5.offsetY;
          if (param1 >= var6 &&
            param1 < var6 + var5.height) {
            for (var7 = var4.x + var5.offsetX; var7 < param0; var7 = var7 + BoundedRandomAccessFile.activeSession.worldWidth) {
            }
            while (var7 > param0) {
              var7 = var7 - BoundedRandomAccessFile.activeSession.worldWidth;
            }
            if (!(param0 >= var7 + var5.width) &&
              var5.pixels[(param1 - var6) * var5.width + (param0 - var7)] != 0) {
              return true;
            }
          }
        }
        return false;
    }

    final static void a(byte param0, java.awt.Component param1) {
        param1.setFocusTraversalKeysEnabled(false);
        param1.addKeyListener(ck.field_v);
        if (param0 != -38) {
          return;
        }
        try {
          param1.addFocusListener(ck.field_v);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oc.Q(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void e(int param0, int param1) {
        int var3 = BoundedRandomAccessFile.activeSession.tilesWide;
        int[] var4 = QuickChatPhraseDefinition.fullTileMask;
        param0 = param0 >> 16;
        param1 = param1 >> 16;
        if (this.c(param0, param1)) {
          return;
        }
        int var5 = param0 >> 5;
        int var6 = param1 >> 5;
        if (var6 < 0) {
          return;
        }
        BoundedRandomAccessFile.activeSession.ensureTerrainRow(var6);
        while (var5 < 0) {
          var5 = var5 + var3;
        }
        var5 = var5 % var3;
        if (BoundedRandomAccessFile.activeSession.dynamicTerrain != null) {
          BoundedRandomAccessFile.activeSession.dynamicTerrain.invalidateTileNeighborhood(var5, var6, true);
        }
        int[][] var7 = BoundedRandomAccessFile.activeSession.terrainMasks;
        int[] var8 = var7[var6 * var3 + var5];
        if (var8 == null) {
          return;
        }
        if (var8 == var4) {
          int[] var11 = new int[32];
          var8 = var11;
          var7[var6 * var3 + var5] = new int[32];
          for (int var9 = 0; var9 < 32; var9++) {
            var11[var9] = -1;
          }
        }
        int var9Lifetime1 = param0 & 31;
        int var10 = param1 & 31;
        var8[var10] = var8[var10] & ~(1 << var9Lifetime1);
    }

    final static java.applet.Applet d(byte param0) {
        if (param0 >= -58) {
          cc var2 = (cc) null;
          PointCloudEffect.a(56, (byte) 48, (cc) null);
        }
        if (null != bb.field_P) {
          return bb.field_P;
        }
        return (java.applet.Applet) ((Object) he.field_r);
    }

    final void i(int param0) {
        boolean stackIn_19_0 = false;
        boolean stackIn_22_1 = false;
        boolean stackIn_29_0 = false;
        boolean stackIn_32_1 = false;
        int var2 = this.field_x[param0];
        int var3 = this.field_A[param0];
        int var4 = this.field_y[param0];
        int var5 = this.field_C[param0];
        int var6 = var2 + var4;
        int var7 = var3 + var5;
        if (!this.field_s &&
          !this.b(var6, var7)) {
          this.field_x[param0] = var6;
          this.field_A[param0] = var7;
        } else {
          int var8 = (int)Math.sqrt((double)var4 * (double)var4 + (double)var5 * (double)var5) >> 16;
          var4 = var4 / (var8 + 1);
          var5 = var5 / (var8 + 1);
          int var9 = 0;
          while (true) {
            if (var9 >= var8) {
              var2 = var6;
              var3 = var7;
              if (this.field_s &&
                !this.b(var2, var3)) {
                this.field_x[param0] = var2;
                this.field_A[param0] = var3;
                break;
              }
            } else {
              var2 = var2 + var4;
              var3 = var3 + var5;
              if (!this.b(var2, var3)) {
                var9++;
                continue;
              }
            }
            int stackIn_14_0 = (!this.b(var2 - 65536, var3)) ? 0 : 1;
            boolean decompiledFrameRemainder0 = true;
            var9 = stackIn_14_0;
            int var10 = this.b(var2 + 65536, var3) ? 1 : 0;
            boolean var11 = (this.b(var2, var3 - 65536));
            boolean var12 = (this.b(var2, var3 + 65536));
            if (var11 != var12) {
              stackIn_19_0 = ((var11) &&
                (!(var12)));
              stackIn_22_1 = !(this.field_C[param0] >= 0);
              if (stackIn_19_0 == stackIn_22_1) {
                this.field_C[param0] = -this.field_C[param0] >> 2;
                this.field_y[param0] = this.field_y[param0] + this.field_y[param0] * 3;
                decompiledFrameRemainder0 = false;
              }
            }
            if (decompiledFrameRemainder0) {
              if (var9 != var10) {
                stackIn_29_0 = (var9 != 0 &&
                  var10 == 0);
                stackIn_32_1 = !(this.field_y[param0] >= 0);
                if (stackIn_29_0 == stackIn_32_1) {
                  this.field_y[param0] = -this.field_y[param0] >> 2;
                  this.field_C[param0] = this.field_C[param0] + this.field_C[param0] * 3;
                  decompiledFrameRemainder0 = false;
                }
              }
              if (decompiledFrameRemainder0) {
                if (!this.field_s &&
                  BoundedRandomAccessFile.activeSession.levelIndex >= 0) {
                  if (var9 == 0) {
                    this.e(var2, var3);
                  } else if (var10 == 0) {
                    this.e(var2, var3);
                  } else if (!var11) {
                    this.e(var2, var3);
                  } else if (!var12) {
                    this.e(var2, var3);
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var2 = var2 - var4;
                  var3 = var3 - var5;
                }
              }
            }
            this.field_x[param0] = var2;
            this.field_A[param0] = var3;
            break;
          }
        }
    }

    private final void f(int param0) {
        int var5 = EscapeVector.obfuscationControl;
        this.field_B = true;
        if (param0 != 19507) {
          return;
        }
        int var2 = rl.field_k.field_g * rl.field_k.field_d;
        for (int var3 = 0; var2 > var3; var3++) {
          int var4 = rl.field_k.field_k[var3] & 255;
          if (this.field_G >= var4) {
            rl.field_k.field_k[var3] = (byte) 0;
          } else {
            this.field_B = false;
          }
        }
    }

    private final void g(int param0) {
        this.a(109, rl.field_k, gi.field_c);
        gi.field_c.field_k = rl.field_k.field_k;
        if (param0 < 114) {
          field_r = (String[]) null;
        }
        this.a(112, rl.field_k, gi.field_i);
        int var2 = gi.field_i.field_h * gi.field_i.field_a;
        if (gi.field_i.field_k.length < var2) {
          gi.field_i.field_k = new byte[var2];
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var10 = EscapeVector.obfuscationControl;
        int var7 = -100 % ((-7 - param2) / 38);
        if (rl.field_k == null) {
          rl.field_k = new IndexedSprite(param3 - param5, param4 - param1, 256);
          this.g((byte) -82);
        } else {
          rl.field_k.field_g = param0;
          rl.field_k.field_a = param0;
          rl.field_k.field_d = -param1 + param4;
          rl.field_k.field_h = -param1 + param4;
          int var8 = rl.field_k.field_d * rl.field_k.field_g;
          if (rl.field_k.field_k.length < var8) {
            rl.field_k.field_k = new byte[var8];
          } else {
            for (int var9 = 0; var8 > var9; var9++) {
              rl.field_k.field_k[var9] = (byte) 0;
            }
          }
        }
        this.g(122);
    }

    PointCloudEffect(Sprite param0, int param1, int param2, PcmSample param3) {
        String stackIn_21_2 = null;
        String stackIn_24_2 = null;
        this.field_s = false;
        this.field_q = false;
        this.field_G = 0;
        try {
          param2 = param2 + param0.offsetY;
          param1 = param1 + param0.offsetX;
          int var5_int = (param0.width << 15) + (param1 << 16);
          int var6 = (param0.height << 15) + (param2 << 16);
          int var7 = 0;
          int var8 = param0.width * param0.height;
          for (int var9 = 0; var8 > var9; var9++) {
            if (param0.pixels[var9] != 0) {
              var7++;
            }
          }
          this.field_F = var7 * 8;
          this.d(this.field_F, 0);
          int var9Lifetime1 = 0;
          for (int var10 = 0; var10 < var8; var10++) {
            if (param0.pixels[var10] != 0) {
              for (int var11 = 0; var11 < 8; var11++) {
                this.field_x[var9Lifetime1] = var10 % param0.width + param1 << 16;
                this.field_A[var9Lifetime1] = param2 + var10 / param0.width << 16;
                var9Lifetime1++;
              }
            }
          }
          for (int var10Lifetime1 = 0; this.field_F > var10Lifetime1; var10Lifetime1++) {
            this.field_y[var10Lifetime1] = -262144 + (int)(Math.random() * 524289.0);
            this.field_C[var10Lifetime1] = -262144 + (int)(524289.0 * Math.random());
            this.field_w[var10Lifetime1] = -262144 + (int)(Math.random() * 524289.0);
          }
          pl.field_n.playSampleWithPan(param3, 100, BoundedRandomAccessFile.activeSession.spatialVolume(131072 * (param0.height + param0.width), var5_int, 96, var6), BoundedRandomAccessFile.activeSession.spatialPan(var5_int, 112));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_20_0 = var5;
          StringBuilder stackIn_20_1 = new StringBuilder().append("oc.<init>(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          StringBuilder stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    PointCloudEffect(int param0, int param1, PcmSample param2) {
        this.field_s = false;
        this.field_q = false;
        this.field_G = 0;
        try {
          this.field_F = 4096;
          this.d(this.field_F, 0);
          for (int var4_int = 0; this.field_F > var4_int; var4_int++) {
            double var5 = 6.283185307179586 * Math.random();
            double var7 = Math.sqrt(Math.random()) * 524288.0;
            this.field_x[var4_int] = param0 + (int)(Math.sin(var5) * var7);
            this.field_A[var4_int] = (int)(var7 * Math.cos(var5)) + param1;
            this.field_y[var4_int] = -262144 + (int)(524289.0 * Math.random());
            this.field_C[var4_int] = -262144 + (int)(Math.random() * 524289.0);
            this.field_w[var4_int] = -262144 + (int)(524289.0 * Math.random());
          }
          pl.field_n.playSampleWithPan(param2, 100, BoundedRandomAccessFile.activeSession.spatialVolume(4194304, param0, 96, param1), BoundedRandomAccessFile.activeSession.spatialPan(param0, 109));
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "oc.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final IndexedSprite e(byte param0) {
        int var15 = EscapeVector.obfuscationControl;
        if (!this.field_q) {
          return null;
        }
        if (param0 <= 86) {
          field_z = (String[]) null;
        }
        byte[] var20 = gi.field_i.field_k;
        byte[] var17 = var20;
        byte[] var16 = var17;
        byte[] var26 = var16;
        byte[] var25 = rl.field_k.field_k;
        for (int var4 = 0; var20.length > var4; var4++) {
          var20[var4] = (byte) 0;
        }
        int var4Lifetime1 = rl.field_k.field_a;
        int var5 = rl.field_k.field_h;
        int var6 = 0;
        int var7 = 0;
        while (var5 > var7) {
          int var8 = var6;
          int var9 = var6 - (-var4Lifetime1 + 1);
          boolean var10 = false;
          boolean var11 = false;
          int var12 = 0;
          while (!var10 ||
            !var11) {
            int stackIn_14_0 = ~var12;
            if (stackIn_14_0 > ~var4Lifetime1) {
              if (!var10 &&
                var25[var8] != 0) {
                var10 = true;
                var26[var8] = (byte) 1;
              }
              if (!var11 &&
                var25[var9] != 0) {
                var26[var9] = (byte) 1;
                var11 = true;
              }
              var8++;
              var9--;
              var12++;
              continue;
            }
            break;
          }
          var6 = var6 + var4Lifetime1;
          var7++;
        }
        int var7Lifetime1 = 0;
        int var8Lifetime1 = (-1 + var5) * var4Lifetime1;
        int var9Lifetime1 = 0;
        while (true) {
          if (var9Lifetime1 >= var4Lifetime1) {
            return gi.field_i;
          }
          int var10Lifetime1 = var7Lifetime1;
          int var11Lifetime1 = var7Lifetime1 + var8Lifetime1;
          boolean var12Lifetime1 = false;
          boolean var13 = false;
          int var14 = 0;
          var7Lifetime1++;
          while (!var12Lifetime1 ||
            !var13) {
            int stackIn_36_0 = ~var14;
            if (stackIn_36_0 > ~var5) {
              if (!var12Lifetime1 &&
                var25[var10Lifetime1] != 0) {
                var12Lifetime1 = true;
                var26[var10Lifetime1] = (byte) 1;
              }
              if (!var13 &&
                var25[var11Lifetime1] != 0) {
                var26[var11Lifetime1] = (byte) 1;
                var13 = true;
              }
              var10Lifetime1 = var10Lifetime1 + var4Lifetime1;
              var14++;
              var11Lifetime1 = var11Lifetime1 - var4Lifetime1;
              continue;
            }
            break;
          }
          var9Lifetime1++;
        }
    }

    PointCloudEffect(int param0) {
        this.field_s = false;
        this.field_q = false;
        this.field_G = 0;
        this.field_G = 96;
        this.field_s = true;
        this.field_F = param0;
        this.d(this.field_F, 0);
        this.field_E = new boolean[this.field_F];
    }

    static {
        field_r = new String[]{"Showing by rating", "Showing by win percentage"};
        field_v = "Objective";
        field_z = new String[]{"By rating", "By win percentage"};
    }
}
