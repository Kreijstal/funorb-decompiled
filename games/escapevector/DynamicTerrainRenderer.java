/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DynamicTerrainRenderer {
    static int field_b;
    static Sprite field_w;
    private int[] field_c;
    private int[] fullTileMask;
    private int[][] field_l;
    private wi[][] field_a;
    private int tilesHigh;
    private boolean[] field_e;
    private int tilesWide;
    private wi[][] field_p;
    private boolean[][] field_A;
    int field_z;
    private int[][] terrainMasks;
    int field_B;
    private boolean[] dirtyTiles;
    static String field_t;
    private int field_q;
    private int field_o;
    private int[] field_n;
    private int[][] field_s;
    private boolean[] field_k;
    static int[] field_i;
    private int tileHeight;
    private int[] field_u;
    private int tileWidth;
    private Sprite[] field_y;
    private int[] field_j;
    static String field_m;

    private final void a(int[][] param0, boolean[][] param1, byte param2) {
        try {
          param1[0][0] = this.a(this.tileWidth - 1, -1 + this.tileHeight, (byte) -23, param0[0]);
          param1[0][1 + this.tileWidth] = this.a(0, -1 + this.tileHeight, (byte) -66, param0[2]);
          param1[1 + this.tileHeight][0] = this.a(this.tileWidth - 1, 0, (byte) -78, param0[6]);
          param1[this.tileHeight + 1][1 + this.tileWidth] = this.a(0, 0, (byte) -44, param0[8]);
          if (param2 < 63) {
            this.b(16);
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "na.VA(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final void a(int param0, int[] param1, int param2) {
        param2 = param2 - 1;
        for (int var4 = 0; var4 < this.tileWidth; var4++) {
          param2++;
          param1[param2] = param0;
        }
    }

    private final int[][] e(int param0) {
        int var4 = EscapeVector.obfuscationControl;
        int[][] var5 = new int[this.tilesHigh * this.tilesWide][];
        int[][] var2 = var5;
        int var3 = 0;
        do {
          if (var3 >= var5.length) {
            if (param0 != 1) {
              this.field_k = (boolean[]) null;
            }
            break;
          }
          var5[var3] = this.field_n;
          var3++;
        } while (var4 == 0);
        return var2;
    }

    private final void a(int param0, int param1, int param2) {
        int stackIn_7_0 = 0;
        int var9 = EscapeVector.obfuscationControl;
        if (param0 >= -96) {
          this.a((wi[][]) null, 102);
        }
        int var4 = -param2;
        int var5 = param1;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var5 >= this.tilesHigh))) {
          stackIn_7_0 = var4 + this.tileHeight;
          if (var9 == 0) {
            var4 = stackIn_7_0;
            var5++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_7_0 = this.field_j[0];
        }
        int var6 = stackIn_7_0;
        int var7 = this.field_j[1];
        int var8 = 1 + (-var4 + 479);
        if (0 >= var8) {
          return;
        }
        SoftwareRasterizer.fillVerticalGradient(0, var4, 640, var8, var6, var7);
        this.a(var4, (byte) 104);
        return;
    }

    private final int a(int[] param0, byte param1, int param2) {
        String stackIn_16_2 = null;
        try {
          int var4_int = -12 / ((43 - param1) / 44);
          if (this.fullTileMask == param0) {
            int stackIn_2_0 = -1;
            return stackIn_2_0;
          }
          if (this.field_n == param0) {
            int stackIn_5_0 = 0;
            return stackIn_5_0;
          }
          if (param2 < 0) {
            int stackIn_10_0 = 0;
            return stackIn_10_0;
          }
          if (param2 >= this.tileHeight) {
            return 0;
          }
          int stackIn_12_0 = param0[param2];
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_15_0 = var4;
          StringBuilder stackIn_15_1 = new StringBuilder().append("na.D(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void releaseStatics(int guard) {
        field_t = null;
        field_i = null;
        field_m = null;
        field_w = null;
        if (guard != 3) {
          DynamicTerrainRenderer.a(-86, (int[]) null, 29, -25, (BinaryBitmapFont) null, (String[]) null, (int[]) null, false, (int[]) null);
        }
    }

    private final boolean c(int param0, int param1) {
        int var3 = 1 << param1;
        int var4 = param0 & var3;
        return var4 == 0 ? true : false;
    }

    private final boolean[][] a(int param0, int[][] param1) {
        String stackIn_5_2 = null;
        try {
          this.a((byte) 121, param1, this.field_A);
          this.a(param1, (byte) 62, this.field_A);
          int var3_int = -64 / ((param0 + 50) / 40);
          this.a(param1, this.field_A, (byte) 107);
          boolean[][] stackIn_1_0 = this.field_A;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_4_0 = var3;
          StringBuilder stackIn_4_1 = new StringBuilder().append("na.T(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    private final boolean a(int param0, int param1, byte param2, int[] param3) {
        String stackIn_8_2 = null;
        try {
          int var5_int = this.a(param3, (byte) 125, param1);
          if (param2 >= -18) {
            return true;
          }
          boolean var6 = (this.a(var5_int, param0));
          boolean stackIn_4_0 = var6;
          return (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_7_0 = var5;
          StringBuilder stackIn_7_1 = new StringBuilder().append("na.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final wi[][] a(int param0, wi[][] param1, int param2, boolean param3, int param4) {
        String stackIn_28_2 = null;
        int var14 = EscapeVector.obfuscationControl;
        try {
          if (param1 != null) {
            wi[][] stackIn_4_0 = (wi[][]) (param1);
            return stackIn_4_0;
          }
          int var6_int = 640;
          int var7 = 480;
          int var8 = 1 + var6_int / this.tileWidth;
          int var9 = var7 / this.tileHeight + 1;
          param1 = new wi[var9][var8];
          int var10 = param0;
          scanLoop1: while (true) {
            int stackIn_7_0 = ~var10;
            scanLoop2: while (true) {
              if (stackIn_7_0 > ~var9) {
                int var11 = var10 + param4;
                int var12 = 0;
                while (var8 > var12) {
                  stackIn_7_0 = var12 + param2;
                  if (var14 != 0) {
                    continue scanLoop2;
                  }
                  int var13 = stackIn_7_0;
                  while (var13 < 0) {
                    var13 = var13 + this.tilesWide;
                  }
                  while (var13 >= this.tilesWide) {
                    var13 = var13 - this.tilesWide;
                  }
                  param1[var10][var12] = new wi(this.tileWidth, this.tileHeight, var11, var13);
                  var12++;
                }
                var10++;
                if (var14 == 0) {
                  continue scanLoop1;
                }
              }
              break;
            }
            break;
          }
          wi[][] stackIn_24_0 = (wi[][]) (param1);
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_27_0 = var6;
          StringBuilder stackIn_27_1 = new StringBuilder().append("na.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final boolean a(int param0, int param1) {
        int var3 = 1 << param1;
        int var4 = param0 & var3;
        return var4 != 0 ? true : false;
    }

    private final int[] a(int param0, int[] param1, boolean param2, int param3, int param4) {
        String stackIn_15_2 = null;
        try {
          if (param0 >= 0 &&
            param0 < this.tileHeight) {
            if (param4 >= 0 &&
              param4 < this.tileWidth) {
              param1 = this.a(param0, param1, param4, 72);
              int var6_int = this.a(param1, (byte) -47, param0);
              var6_int = this.a(param2, var6_int, param4, param3 + param3);
              param1[param0] = var6_int;
              int[] stackIn_11_0 = (int[]) (param1);
              return stackIn_11_0;
            }
            int[] stackIn_9_0 = (int[]) (param1);
            return stackIn_9_0;
          }
          int[] stackIn_4_0 = (int[]) (param1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var6 = decompiledCaughtException;
          RuntimeException stackIn_14_0 = var6;
          StringBuilder stackIn_14_1 = new StringBuilder().append("na.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final void invalidateTileNeighborhood(int tileX, int tileY, boolean guard) {
        int var7 = EscapeVector.obfuscationControl;
        if (tileY >= 0) {
          if (this.tilesHigh <= tileY) {
            return;
          }
          if (0 <= tileX) {
            if (tileX >= this.tilesWide) {
              return;
            }
            if (!guard) {
              this.tilesHigh = 38;
            }
            int var4 = -1;
            scanLoop1: while (true) {
              int stackIn_11_0 = -2;
              while (stackIn_11_0 <= ~var4) {
                if (var7 == 0) {
                  if (var4 + tileY >= 0 &&
                    this.tilesHigh > tileY + var4) {
                    int var5 = this.tilesWide * (var4 + tileY);
                    int var6 = -1;
                    while (1 >= var6) {
                      stackIn_11_0 = var6 + tileX;
                      if (stackIn_11_0 >= 0 &&
                        var6 + tileX < this.tilesWide) {
                        this.dirtyTiles[var6 + tileX + var5] = true;
                      }
                      var6++;
                    }
                  }
                  var4++;
                  continue scanLoop1;
                }
                break;
              }
              break;
            }
            return;
          }
        }
    }

    private final void a(int param0, byte param1, int param2) {
        boolean stackIn_15_0 = false;
        boolean stackIn_18_1 = false;
        int var13 = EscapeVector.obfuscationControl;
        int var4 = this.field_a.length;
        int var5 = this.field_a[0].length;
        int var6 = -this.tileHeight - param2;
        if (param1 != 1) {
          return;
        }
        int var7 = 0;
        while (true) {
          int stackIn_4_0 = ~var4;
          if (stackIn_4_0 < ~var7) {
            var6 = var6 + this.tileHeight;
            int var8 = -this.tileWidth - param0;
            if (var13 == 0) {
              int var9 = 0;
              while (var9 < var5) {
                var8 = var8 + this.tileWidth;
                wi var10 = this.field_a[var7][var9];
                stackIn_4_0 = var10.field_b;
                if (stackIn_4_0 >= 0) {
                  stackIn_15_0 = (this.tilesHigh > var10.field_b);
                } else {
                  stackIn_15_0 = false;
                }
                boolean var11 = stackIn_15_0;
                int[] var12 = this.a(var10.field_b, -2981, var10.field_a, this.field_l);
                boolean stackIn_17_0 = var11;
                stackIn_18_1 = !(this.field_n == var12);
                boolean var11Lifetime1 = stackIn_17_0 & stackIn_18_1;
                if (var11Lifetime1) {
                  var10.field_e.drawTransparent(var8, var6);
                }
                var9++;
              }
              var7++;
              continue;
            }
          }
          return;
        }
    }

    final static void a(int param0, gi param1) {
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        String stackIn_25_2 = null;
        int var4 = EscapeVector.obfuscationControl;
        try {
          if (null == param1.field_n) {
            return;
          }
          boolean decompiledFrameCompleted0 = true;
          if (param1.field_f != 0 ||
            param1.field_h != 0) {
            int var2_int = 0;
            while (!(hf.field_b <= var2_int)) {
              gi var3 = IterableNodeHashTable.field_d[var2_int];
              stackIn_17_0 = var3.field_a;
              stackIn_17_1 = 2;
              if (var4 != 0) {
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_17_0 == stackIn_17_1 &&
                param1.field_f == var3.field_f &&
                var3.field_h == param1.field_h) {
                return;
              }
              var2_int++;
            }
          }
          if (decompiledFrameCompleted0) {
            stackIn_17_0 = param0;
            stackIn_17_1 = 19956;
          }
          if (stackIn_17_0 != stackIn_17_1) {
            field_b = -79;
          }
          if (null == param1.field_k) {
          }
          vi.a(param1, 3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_24_0 = var2;
          StringBuilder stackIn_24_1 = new StringBuilder().append("na.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    private final void a(int param0, boolean[] param1, int param2, boolean[][] param3, int param4, int param5) {
        String stackIn_12_2 = null;
        String stackIn_15_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          int var7_int = 0;
          while (var7_int < param2) {
            boolean var8 = (param1[var7_int + param0]);
            param3[param0 + var7_int][param5] = (var8);
            var7_int++;
            if (var9 != 0) {
              return;
            }
          }
          if (param4 != -23372) {
            int discarded$4 = this.a(48, -27, (int[]) null);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var7;
          StringBuilder stackIn_11_1 = new StringBuilder().append("na.LA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          StringBuilder stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final void renderTerrain(int viewportWidth, int cameraX, int cameraY) {
        int var12 = EscapeVector.obfuscationControl;
        int var4 = 0;
        int var5 = 0;
        int var6 = this.tileWidth * this.tilesWide;
        int var7 = cameraX;
        scanLoop1: while (true) {
          if (var7 < 0) {
            var7 = var7 + var6;
            if (var12 == 0) {
              continue;
            }
          } else {
            while (var6 <= var7) {
              var7 = var7 - var6;
              if (var12 != 0) {
                break scanLoop1;
              }
            }
            var4 = var7 / this.tileWidth;
            var5 = var7 % this.tileWidth;
          }
          break;
        }
        int var8 = 0;
        int var9 = 0;
        int var10 = this.tilesHigh * this.tileHeight;
        int var11 = cameraY;
        scanLoop2: while (true) {
          if (0 > var11) {
            var8 = var8 - this.tilesHigh;
            var11 = var11 + var10;
            if (var12 == 0) {
              continue;
            }
          } else if (cameraY >= 0) {
            var8 = var11 / this.tileHeight;
            if (var12 == 0) {
              break scanLoop2;
            }
          }
          var8 = var8 + var11 / this.tileHeight;
          break;
        }
        int var9Lifetime1 = var11 % this.tileHeight;
        this.a(false, cameraY);
        this.field_p = this.a(viewportWidth - 640, this.field_p, var4, false, var8);
        this.a((byte) -66, this.field_p, var4, var8);
        this.a((byte) 122, var8, var4);
        this.a(var9Lifetime1, var5, (byte) 110);
        this.field_a = this.a(0, this.field_a, var4, true, var8);
        this.a((byte) -66, this.field_a, var4, var8);
        this.b((byte) 89, var8, var4);
        this.a(var5, (byte) 1, var9Lifetime1);
        this.a(viewportWidth ^ -744, var8, var9Lifetime1);
        if (viewportWidth != 640) {
          DynamicTerrainRenderer.a(93, -16, 127, -111);
        }
        return;
    }

    private final void a(int param0, byte param1) {
        SoftwareRasterizer.saveClip(this.field_c);
        SoftwareRasterizer.setClip(0, param0, 639, 479);
        this.field_y[0].drawTransparent(0, 0);
        if (param1 != 104) {
          field_w = (Sprite) null;
        }
        SoftwareRasterizer.restoreClip(this.field_c);
    }

    private final boolean f(int param0) {
        return param0 == -1;
    }

    private final boolean d(int param0, int param1, int param2) {
        if (param0 < 0) {
          return false;
        }
        if (this.tilesHigh <= param0) {
          return false;
        }
        if (param1 != 2) {
          this.b(-80, 10, -58);
        }
        if (param2 >= 0 &&
          this.tilesWide > param2) {
          return this.dirtyTiles[param2 + param0 * this.tilesWide];
        }
        return false;
    }

    final static String a(String param0, boolean param1) {
        String stackIn_12_2 = null;
        int var5 = EscapeVector.obfuscationControl;
        try {
          int var2_int = param0.length();
          if (param1) {
            String stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          char[] var3 = new char[var2_int];
          int var4 = 0;
          while (var2_int > var4) {
            var3[-1 + (var2_int - var4)] = param0.charAt(var4);
            var4++;
            if (var5 == 0) {
              continue;
            }
            break;
          }
          String stackIn_8_0 = new String(var3);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var2;
          StringBuilder stackIn_11_1 = new StringBuilder().append("na.FB(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(byte param0, int param1, int param2) {
        int var13 = EscapeVector.obfuscationControl;
        int var4 = this.field_p.length;
        int var5 = this.field_p[0].length;
        int var6 = 47 % ((param0 - 75) / 36);
        int var7 = 0;
        scanLoop1: while (true) {
          int stackIn_2_0 = var7;
          if (stackIn_2_0 < var4 &&
            var13 == 0) {
            int var8 = 0;
            while (var8 < var5) {
              int var9 = param1 + var7;
              stackIn_2_0 = var8 + param2;
              int var10 = stackIn_2_0;
              while (var10 < 0) {
                var10 = var10 + this.tilesWide;
              }
              while (this.tilesWide <= var10) {
                var10 = var10 - this.tilesWide;
              }
              wi var11 = this.field_p[var7][var8];
              boolean stackIn_18_0 = !(!this.d(var9, 2, var10));
              boolean var12 = stackIn_18_0;
              var12 = ((var12) | var11.field_g);
              if (var12) {
                var11.field_a = var10;
                var11.field_b = var9;
                this.a(var9, this.terrainMasks, 1, 0, var11.field_e.pixels, var10);
                var11.field_g = false;
              }
              var8++;
            }
            var7++;
            continue scanLoop1;
          }
          break;
        }
        return;
    }

    private final int[] a(boolean[][] param0, int param1, int[] param2) {
        String stackIn_18_2 = null;
        String stackIn_21_2 = null;
        int var11 = EscapeVector.obfuscationControl;
        try {
          int var4_int = 14 % ((58 - param1) / 57);
          int var5 = 0;
          scanLoop1: while (true) {
            int stackIn_3_0 = var5;
            scanLoop2: while (stackIn_3_0 < this.tileHeight) {
              int var6 = this.a(param2, (byte) 108, var5);
              int var7 = 0;
              while (this.tileWidth > var7) {
                boolean var8 = (this.a(var6, var7));
                boolean[] var13 = this.a(var7, param0, var5, (byte) 110);
                boolean var10 = (this.a(var13, false));
                boolean stackOut_6_0 = this.a((var10), (var8), 0);
                stackIn_3_0 = stackOut_6_0 ? 1 : 0;
                boolean stackIn_7_0 = stackOut_6_0;
                if (var11 != 0) {
                  continue scanLoop2;
                }
                if (stackIn_7_0 ||
                  var11 != 0) {
                  param2 = this.a(var5, param2, (var10), 0, var7);
                }
                var7++;
              }
              var5++;
              if (var11 == 0) {
                continue scanLoop1;
              }
              break;
            }
            break;
          }
          int[] stackIn_14_0 = (int[]) (param2);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var4;
          StringBuilder stackIn_17_1 = new StringBuilder().append("na.G(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          StringBuilder stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final void a(int param0, int param1, int[] param2, int param3) {
        param3 = param3 - 1;
        for (int var5 = 0; var5 < this.tileWidth; var5++) {
          param3++;
          if (!this.c(param1, var5)) {
            param2[param3] = param0;
          }
        }
    }

    private final void b(byte param0, int param1, int param2) {
        int var12 = EscapeVector.obfuscationControl;
        if (param0 <= 62) {
          boolean discarded$0 = this.a(94, 29);
        }
        int var4 = this.field_a.length;
        int var5 = this.field_a[0].length;
        int var6 = 0;
        scanLoop1: while (true) {
          int stackIn_4_0 = ~var6;
          if (stackIn_4_0 > ~var4 &&
            var12 == 0) {
            int var7 = 0;
            while (var5 > var7) {
              int var8 = var6 + param1;
              stackIn_4_0 = var7 + param2;
              int var9 = stackIn_4_0;
              while (0 > var9) {
                var9 = var9 + this.tilesWide;
              }
              while (var9 >= this.tilesWide) {
                var9 = var9 - this.tilesWide;
              }
              boolean stackIn_20_0 = !(!this.d(var8, 2, var9));
              boolean var10 = stackIn_20_0;
              if (var10) {
                this.c((byte) 105, var9, var8);
              }
              wi var11 = this.field_a[var6][var7];
              var10 = ((var10) | var11.field_g);
              if (var10) {
                var11.field_a = var9;
                var11.field_b = var8;
                this.a(var8, this.field_l, this.field_z, 0, var11.field_e.pixels, var9);
                var11.field_g = false;
              }
              var7++;
            }
            var6++;
            continue scanLoop1;
          }
          break;
        }
        return;
    }

    private final int a(boolean param0, int param1, int param2, int param3) {
        if (param2 >= 0 &&
          this.tileWidth > param2) {
          int var5 = 1 << param2;
          int var6 = ~var5;
          if (param3 != 0) {
            this.field_n = (int[]) null;
          }
          int var7 = param1 & var6;
          if (param0) {
            param1 = var7 | var5;
          }
          if (!param0 ||
            EscapeVector.obfuscationControl != 0) {
            param1 = var7;
          }
          return param1;
        }
        return param1;
    }

    private final boolean a(boolean[] param0, boolean param1) {
        String stackIn_24_2 = null;
        try {
          if (param1) {
            this.a((wi[][]) null, (byte) 54);
          }
          if (!param0[4]) {
            return false;
          }
          if (!param0[1]) {
            return true;
          }
          if (!param0[3]) {
            return true;
          }
          if (!param0[5]) {
            return true;
          }
          if (param0[7]) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_23_0 = var3;
          StringBuilder stackIn_23_1 = new StringBuilder().append("na.WA(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int[] param0, boolean param1, int[] param2) {
        String stackIn_31_2 = null;
        String stackIn_34_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          if (!param1) {
            DynamicTerrainRenderer.a(-40, (gi) null);
          }
          int var4_int = param2.length / 8;
          int var5 = 0;
          int var6 = 0;
          while (var6 < var4_int) {
            if (var7 != 0) {
              return;
            }
            int incrementValue$0 = var5;
            var5++;
            if (0 == param0[incrementValue$0]) {
              param2[var5 - 1] = 0;
            }
            if (param0[var5++] == 0) {
              param2[var5 - 1] = 0;
            }
            if (param0[var5++] == 0) {
              param2[-1 + var5] = 0;
            }
            if (param0[var5++] == 0) {
              param2[var5 - 1] = 0;
            }
            if (param0[var5++] == 0) {
              param2[var5 - 1] = 0;
            }
            int incrementValue$5 = var5;
            var5++;
            if (0 == param0[incrementValue$5]) {
              param2[var5 - 1] = 0;
            }
            if (param0[var5++] == 0) {
              param2[-1 + var5] = 0;
            }
            int incrementValue$7 = var5;
            var5++;
            if (0 == param0[incrementValue$7]) {
              param2[-1 + var5] = 0;
            }
            var6++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_30_0 = var4;
          StringBuilder stackIn_30_1 = new StringBuilder().append("na.HA(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          StringBuilder stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(')').toString());
        }
    }

    private final boolean[] a(int param0, boolean[][] param1, int param2, byte param3) {
        String stackIn_17_2 = null;
        int var13 = EscapeVector.obfuscationControl;
        try {
          int var5_int = 3;
          int var6 = 3;
          if (param3 <= 84) {
            this.c(65, -13, 112);
          }
          int var7 = param2 + 1 - 1;
          int var8 = 1 + (param0 - 1);
          int var9 = 0;
          scanLoop1: while (var6 > var9) {
            int var10 = 0;
            while (true) {
              if (var5_int > var10) {
                boolean var11 = (param1[var7 + var9][var8 + var10]);
                int var12 = var9 * var5_int + var10;
                this.field_k[var12] = (var11);
                var10++;
                if (var13 == 0) {
                  continue;
                }
              } else {
                var9++;
              }
              break;
            }
            if (var13 == 0) {
              continue scanLoop1;
            }
            break;
          }
          boolean[] stackIn_13_0 = this.field_k;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var5;
          StringBuilder stackIn_16_1 = new StringBuilder().append("na.PA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void b(int param0, int param1) {
        int var3 = EscapeVector.obfuscationControl;
        try {
          vj.a((byte) -116, AccountTermsPanel.field_J, param0, ArchiveRequest.field_t, true, TextLayoutLine.field_e, param1);
          int var2_int = 0;
          do {
            if (!(AccountTermsPanel.field_J > var2_int)) {
              vj.a((byte) -128, AccountTermsPanel.field_J + param0, param0 + param0, pl.field_r, false, TextLayout.field_d, param0);
              break;
            }
            cd.field_q[var2_int + param0] = var2_int;
            var2_int++;
          } while (var3 == 0);
          if (AccountTermsPanel.field_J > param0) {
            AccountTermsPanel.field_J = param0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "na.TA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int[][] param1, int param2, int param3, int[] param4, int param5) {
        String stackIn_18_2 = null;
        String stackIn_21_2 = null;
        int var13 = EscapeVector.obfuscationControl;
        try {
          int[] var14 = this.a(param0, param3 - 2981, param5, param1);
          int[] var7 = var14;
          this.a(param4, param3);
          if (this.field_n == var14) {
            return;
          }
          int var8 = -this.tileWidth;
          int var9 = 0;
          while (var9 < this.tileHeight) {
            var8 = var8 + this.tileWidth;
            int var10 = this.a(var14, (byte) 89, var9);
            boolean var11 = (this.a(var10));
            if (var13 != 0) {
              return;
            }
            if (!var11 ||
              var13 != 0) {
              if (this.f(var10)) {
                this.a(param2, param4, var8);
              } else {
                this.a(param2, var10, param4, var8);
              }
            }
            var9++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_17_0 = runtimeException;
          StringBuilder stackIn_17_1 = new StringBuilder().append("na.QA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          StringBuilder stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param5).append(')').toString());
        }
    }

    private final void a(wi[][] param0, int param1, byte param2) {
        String stackIn_14_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          int var4_int = 117 / ((30 - param2) / 52);
          int var5 = param0[0][0].field_b;
          while (var5 < param1) {
            var5++;
            this.a(param0, 0);
            if (var6 != 0) {
              return;
            }
          }
          while (param1 < var5) {
            var5--;
            this.a(param0, (byte) 122);
            if (var6 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_13_0 = var4;
          StringBuilder stackIn_13_1 = new StringBuilder().append("na.EB(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final int[] a(int param0, int param1, int param2, int[][] param3) {
        int stackIn_17_0 = 0;
        String stackIn_33_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          if (param0 < 0) {
            int[] stackIn_4_0 = this.field_n;
            return stackIn_4_0;
          }
          if (param0 >= this.tilesHigh) {
            int[] stackIn_8_0 = this.fullTileMask;
            return stackIn_8_0;
          }
          scanLoop1: while (true) {
            if (this.tilesWide <= param2) {
              param2 = param2 - this.tilesWide;
              if (var6 == 0) {
                continue;
              }
            } else {
              while (param2 < 0) {
                stackIn_17_0 = param2 + this.tilesWide;
                if (var6 != 0) {
                  break scanLoop1;
                }
                param2 = stackIn_17_0;
              }
            }
            stackIn_17_0 = param2 + this.tilesWide * param0;
            break;
          }
          int var5_int = stackIn_17_0;
          if (0 > var5_int) {
            int[] stackIn_20_0 = this.field_n;
            return stackIn_20_0;
          }
          if (var5_int >= param3.length) {
            int[] stackIn_24_0 = this.field_n;
            return stackIn_24_0;
          }
          if (param1 == -2981) {
            int[] stackIn_29_0 = param3[var5_int];
            return stackIn_29_0;
          }
          int[] stackIn_27_0 = (int[]) null;
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_32_0 = var5;
          StringBuilder stackIn_32_1 = new StringBuilder().append("na.EA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    private final boolean a(boolean param0, boolean param1, int param2) {
        if (param2 != 0) {
          return false;
        }
        return param1 ^ param0;
    }

    private final void a(boolean param0, int param1) {
        int var3 = 640;
        int var4 = 480;
        int var5 = (BoundedRandomAccessFile.activeSession.field_M >> 16) % var3;
        SoftwareRasterizer.saveClip(this.field_c);
        int var6 = param1 % var4;
        this.field_y[0].bindAsFramebuffer();
        this.b(-126, var5, var6);
        if (param0) {
          this.invalidateTileNeighborhood(98, 82, true);
        }
        int var7 = -var5 + var3;
        int var8 = -var6 + var4;
        int var9 = 0;
        int var10 = var7;
        int var11 = 0;
        int var12 = var8;
        int var13 = -var5;
        int var14 = -var6;
        int var15 = var5 >= 0 ? 1 : -1;
        SoftwareRasterizer.setClip(var9, var11, var10, var12);
        dj.a(var14, -24, var13);
        SoftwareRasterizer.setClip(var7 * var15 + var9, var11, var10 + var5 * var15, var12);
        dj.a(var14, -123, var13 + var15 * var3);
        SoftwareRasterizer.setClip(var9, var11 + var8, var10, var6 + var12);
        dj.a(var14 + var4, -127, var13);
        SoftwareRasterizer.setClip(var9 + var7 * var15, var11 + var8, var10 + var5 * var15, var12 + var6);
        dj.a(var14 + var4, -94, var3 * var15 + var13);
        AlphaContainer.field_D.a(107);
        SoftwareRasterizer.restoreClip(this.field_c);
    }

    private final void a(int[][] param0, byte param1, boolean[][] param2) {
        try {
          int[] var13 = param0[1];
          int var5 = this.a(var13, (byte) 121, -1 + this.tileHeight);
          this.a(1, -1, 0, this.tileWidth, var5, param2[0]);
          int var7 = 102 / ((param1 + 63) / 41);
          int[] var6 = param0[7];
          int var8 = this.a(var6, (byte) -81, 0);
          this.a(1, -1, 0, this.tileWidth, var8, param2[1 + this.tileHeight]);
          int[] var9 = param0[3];
          int var10 = this.a(-103, this.tileWidth - 1, var9);
          this.a(1, -1, 0, this.tileHeight, var10, this.field_e);
          this.a(1, this.field_e, this.tileHeight, param2, -23372, 0);
          int[] var11 = param0[5];
          int var12 = this.a(-95, 0, var11);
          this.a(1, -1, 0, this.tileHeight, var12, this.field_e);
          this.a(1, this.field_e, this.tileHeight, param2, -23372, 1 + this.tileWidth);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "na.DB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(boolean param0, wi[][] param1) {
        String stackIn_21_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          int var3_int = param1.length;
          if (param0) {
            return;
          }
          int var4 = param1[0].length;
          int var5 = 0;
          while (var3_int > var5) {
            wi var6 = param1[var5][var4 - 1];
            var6.field_g = true;
            if (var9 != 0) {
              return;
            }
            int var7_int = -1 + var4;
            while (var7_int > 0) {
              param1[var5][var7_int] = param1[var5][-1 + var7_int];
              var7_int--;
            }
            wi var7 = param1[var5][1];
            var6.field_b = var7.field_b;
            int var8 = var7.field_a - 1;
            while (var8 < 0) {
              var8 = var8 + this.tilesWide;
            }
            var6.field_a = var8;
            param1[var5][0] = var6;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_20_0 = var3;
          StringBuilder stackIn_20_1 = new StringBuilder().append("na.KB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final void a(byte param0, wi[][] param1, int param2, int param3) {
        try {
          this.a((byte) -3, param1, param2);
          if (param0 != -66) {
            this.field_o = 10;
          }
          this.a(param1, param3, (byte) -40);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "na.O(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(byte param0, int[][] param1, boolean[][] param2) {
        int stackIn_12_0 = 0;
        String stackIn_18_2 = null;
        String stackIn_21_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          int[] var4 = param1[4];
          int var5 = 0;
          scanLoop1: while (true) {
            if (var5 < this.tileHeight) {
              int var6 = this.a(var4, (byte) 111, var5);
              stackIn_12_0 = 0;
              if (var9 != 0) {
                break scanLoop1;
              }
              int var7 = stackIn_12_0;
              while (this.tileWidth > var7) {
                boolean var8 = (this.a(var6, var7));
                param2[1 + var5][1 + var7] = (var8);
                var7++;
              }
              var5++;
              continue scanLoop1;
            }
            stackIn_12_0 = param0;
            break;
          }
          if (stackIn_12_0 != 121) {
            int[] discarded$1 = this.a(97, (int[]) null, -32, 39);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4_ref = decompiledCaughtException;
          RuntimeException stackIn_17_0 = var4_ref;
          StringBuilder stackIn_17_1 = new StringBuilder().append("na.AB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          StringBuilder stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    private final void a(byte param0, wi[][] param1, int param2) {
        String stackIn_39_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          int var4_int = this.tilesWide / 2;
          int var5 = param1[0][0].field_a;
          int var6 = -var5 + param2;
          if (0 > var6) {
            var6 = var6 + this.tilesWide;
          }
          regionExit1: {
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            if (var5 > param2) {
              if (var4_int < var6) {
                while (param2 > var5) {
                  if (var4_int < var6) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  this.b(param1, 7);
                  var5++;
                  while (true) {
                    if (var5 < this.tilesWide) {
                      break;
                    }
                    var5 = var5 - this.tilesWide;
                    if (var7 != 0) {
                      break regionExit1;
                    }
                  }
                }
                decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
              }
              if (decompiledFrameRemainder0 &&
                decompiledFrameCompleted0) {
                var5 = var5 - this.tilesWide;
              }
            }
            if (decompiledFrameRemainder0 &&
              decompiledFrameCompleted0) {
              while (param2 > var5) {
                if (var4_int < var6) {
                  break;
                }
                this.b(param1, 7);
                var5++;
                while (true) {
                  if (var5 < this.tilesWide) {
                    break;
                  }
                  var5 = var5 - this.tilesWide;
                  if (var7 != 0) {
                    break regionExit1;
                  }
                }
              }
            }
            if (param0 != -3) {
              this.field_q = -127;
            }
            var6 = var5 - param2;
          }
          if (var6 < 0) {
            var6 = this.tilesWide + var6;
          }
          if (var5 < param2 &&
            var4_int >= var6) {
            var5 = var5 + this.tilesWide;
          }
          scanLoop2: while (param2 < var5 &&
            var4_int >= var6) {
            this.a(false, param1);
            var5--;
            while (true) {
              if (var5 >= 0) {
                continue scanLoop2;
              }
              var5 = var5 + this.tilesWide;
              if (var7 != 0) {
                break;
              }
            }
            break;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_38_0 = var4;
          StringBuilder stackIn_38_1 = new StringBuilder().append("na.HB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void b(int param0, int param1, int param2) {
        int var12 = EscapeVector.obfuscationControl;
        int[] var13 = this.field_u;
        int[] var4 = var13;
        boolean stackIn_3_0 = !((param1 & 1 ^ 1 & param2) != 1);
        boolean var5 = stackIn_3_0;
        int var7 = -39 % ((param0 - 74) / 47);
        if (var5) {
          var13[0] = this.field_q;
          var13[1] = this.field_o;
        }
        if (!var5 ||
          var12 != 0) {
          var13[1] = this.field_q;
          var13[0] = this.field_o;
        }
        int[] var6 = SoftwareRasterizer.pixels;
        int var8 = 640;
        int var9 = 480;
        int var10 = var8 * var9;
        int var11 = 0;
        while (var10 > var11) {
          var6[var11] = var13[SpriteCheckboxPainter.bitwiseAnd(var11, 1)];
          var11++;
          if (var12 == 0) {
            continue;
          }
          break;
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, boolean[] param5) {
        String stackIn_12_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          if (param1 != -1) {
            DynamicTerrainRenderer.a((String) null, true);
          }
          int var7_int = 0;
          while (param3 > var7_int) {
            boolean var8 = (this.a(param4, param2 + var7_int));
            param5[param0 + var7_int] = (var8);
            var7_int++;
            if (var9 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var7;
          StringBuilder stackIn_11_1 = new StringBuilder().append("na.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2, int param3) {
        int var4 = param0 + param1;
        int var5 = -param3 + param2;
        int var6 = var5 / var4;
        return var6;
    }

    private final void a(wi[][] param0, byte param1) {
        String stackIn_13_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          int var3_int = param0.length;
          int var4 = param0[0].length;
          int var5 = -89 / ((param1 - 76) / 43);
          int var6 = 0;
          while (var6 < var4) {
            wi var7 = param0[-1 + var3_int][var6];
            var7.field_g = true;
            if (var9 != 0) {
              return;
            }
            int var8_int = var3_int - 1;
            while (var8_int > 0) {
              param0[var8_int][var6] = param0[-1 + var8_int][var6];
              var8_int--;
            }
            wi var8 = param0[1][var6];
            var7.field_a = var8.field_a;
            var7.field_b = var8.field_b - 1;
            param0[0][var6] = var7;
            var6++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_12_0 = runtimeException;
          StringBuilder stackIn_12_1 = new StringBuilder().append("na.SA(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int a(int param0, int param1, int[] param2) {
        int stackIn_23_0 = 0;
        String stackIn_27_2 = null;
        int var9 = EscapeVector.obfuscationControl;
        try {
          if (param2 == this.fullTileMask) {
            int stackIn_3_0 = -1;
            return stackIn_3_0;
          }
          if (this.field_n == param2) {
            int stackIn_6_0 = 0;
            return stackIn_6_0;
          }
          if (param1 >= 0 &&
            param1 < this.tileHeight) {
            if (param0 > -88) {
              this.tilesHigh = 1;
            }
            int var4_int = 0;
            int var5 = 0;
            boolean decompiledNaturalLoopExit0 = false;
            while (!(decompiledNaturalLoopExit0 = (this.tileHeight <= var5))) {
              int var6 = this.a(param2, (byte) -83, var5);
              int var7 = this.a(var6, param1) ? 1 : 0;
              stackIn_23_0 = var7;
              if (var9 == 0) {
                if (stackIn_23_0 != 0) {
                  int var8 = 1 << var5;
                  var4_int = var8 | var4_int;
                }
                var5++;
                continue;
              }
              break;
            }
            if (decompiledNaturalLoopExit0) {
              stackIn_23_0 = var4_int;
            }
            return stackIn_23_0;
          }
          int stackIn_11_0 = 0;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var4 = decompiledCaughtException;
          RuntimeException stackIn_26_0 = var4;
          StringBuilder stackIn_26_1 = new StringBuilder().append("na.JA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    private final void b(wi[][] param0, int param1) {
        String stackIn_19_2 = null;
        int var10 = EscapeVector.obfuscationControl;
        try {
          int var3_int = param0.length;
          int var4 = param0[0].length;
          int var6 = -81 / ((param1 - 56) / 48);
          int var5 = 0;
          while (var3_int > var5) {
            wi var7 = param0[var5][0];
            var7.field_g = true;
            if (var10 != 0) {
              return;
            }
            int var8_int = 0;
            while (var8_int < -1 + var4) {
              param0[var5][var8_int] = param0[var5][var8_int + 1];
              var8_int++;
            }
            wi var8 = param0[var5][-2 + var4];
            var7.field_b = var8.field_b;
            int var9 = 1 + var8.field_a;
            while (var9 >= this.tilesWide) {
              var9 = var9 - this.tilesWide;
            }
            var7.field_a = var9;
            param0[var5][-1 + var4] = var7;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_18_0 = var3;
          StringBuilder stackIn_18_1 = new StringBuilder().append("na.BB(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void a(int[] param0, int param1) {
        String stackIn_10_2 = null;
        int var4 = EscapeVector.obfuscationControl;
        try {
          int var3_int = param1;
          while (param0.length > var3_int) {
            param0[var3_int] = 0;
            var3_int++;
            if (var4 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var3;
          StringBuilder stackIn_9_1 = new StringBuilder().append("na.E(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void c(byte param0, int param1, int param2) {
        int[][] var7 = this.a(param2, this.terrainMasks, false, param1);
        int[][] var4 = var7;
        if (param0 < 103) {
          return;
        }
        int[] var8 = this.a(param2, -2981, param1, this.field_l);
        int[] var5 = var8;
        boolean[][] var6 = this.a(0, var7);
        var5 = this.a(var6, 115, var8);
        this.field_l[param1 + param2 * this.tilesWide] = var5;
        this.c(param1, -1, param2);
    }

    final static LegacyButton[] a(int param0, int[] param1, int param2, int param3, BinaryBitmapFont param4, String[] param5, int[] param6, boolean param7, int[] param8) {
        LegacyButton[] stackIn_8_0 = null;
        String stackIn_12_2 = null;
        String stackIn_15_2 = null;
        String stackIn_18_2 = null;
        String stackIn_21_2 = null;
        String stackIn_24_2 = null;
        int var18 = EscapeVector.obfuscationControl;
        try {
          int var9_int = 3;
          int var10 = param1.length;
          int var11 = jd.a(param4, (byte) -121, param5);
          int var12 = DynamicTerrainRenderer.a(1, var10, param0, var11);
          int var13 = PcmResampler.a(var11, (byte) 122, param0, var10, var12);
          LegacyButton[] var14 = new LegacyButton[var10];
          int var15 = 0;
          if (param7) {
            field_w = (Sprite) null;
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var15 >= var10))) {
            int var16 = ji.a(var12, param4, param5, var13, var15, param3, 0);
            LegacyButton var17 = new LegacyButton(var9_int, param1[var15], param5[var15], param8[var15], param6[var15], param4);
            var17.setPosition((byte) 114, var16, param2);
            stackIn_8_0 = var14;
            if (var18 == 0) {
              stackIn_8_0[var15] = var17;
              var15++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_8_0 = var14;
          }
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var9 = decompiledCaughtException;
          RuntimeException stackIn_11_0 = var9;
          StringBuilder stackIn_11_1 = new StringBuilder().append("na.J(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          StringBuilder stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          StringBuilder stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param5 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          StringBuilder stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param6 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          StringBuilder stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    private final void b(int param0) {
        int var4 = EscapeVector.obfuscationControl;
        int var2 = param0;
        while (var2 < this.tilesHigh &&
          var4 == 0) {
          int var3 = 0;
          while (var3 < this.tilesWide) {
            this.c((byte) 107, var3, var2);
            var3++;
          }
          var2++;
        }
        return;
    }

    private final boolean a(int param0) {
        return param0 == 0;
    }

    private final void a(wi[][] param0, int param1) {
        String stackIn_13_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          int var3_int = param0.length;
          int var4 = param0[param1].length;
          int var5 = 0;
          while (var5 < var4) {
            wi var6 = param0[0][var5];
            var6.field_g = true;
            if (var8 != 0) {
              return;
            }
            int var7_int = 0;
            while (var3_int - 1 > var7_int) {
              param0[var7_int][var5] = param0[var7_int + 1][var5];
              var7_int++;
            }
            wi var7 = param0[-2 + var3_int][var5];
            var6.field_b = var7.field_b + 1;
            var6.field_a = var7.field_a;
            param0[-1 + var3_int][var5] = var6;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_12_0 = runtimeException;
          StringBuilder stackIn_12_1 = new StringBuilder().append("na.P(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void c(int param0, int param1, int param2) {
        if (param2 >= 0) {
          if (this.tilesHigh <= param2) {
            return;
          }
          if (~param0 <= param1) {
            if (param0 >= this.tilesWide) {
              return;
            }
            this.dirtyTiles[param2 * this.tilesWide + param0] = false;
            return;
          }
        }
    }

    private final void a(int param0, int param1, byte param2) {
        int stackIn_14_0 = 0;
        int var14 = EscapeVector.obfuscationControl;
        int var4 = 640;
        SoftwareRasterizer.saveClip(this.field_c);
        int var5 = 480;
        this.field_y[1].bindAsFramebuffer();
        SoftwareRasterizer.setClip(0, 0, var4, var5);
        SoftwareRasterizer.clearFramebuffer();
        int var6 = this.field_p.length;
        int var7 = this.field_p[0].length;
        int var8 = -this.tileHeight - param0;
        int var9 = 0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (var9 >= var6))) {
          var8 = var8 + this.tileHeight;
          int var10 = -param1 - this.tileWidth;
          stackIn_14_0 = 0;
          if (var14 == 0) {
            int var11 = stackIn_14_0;
            while (var11 < var7) {
              var10 = var10 + this.tileWidth;
              wi var12 = this.field_p[var9][var11];
              int[] var13 = this.a(var12.field_b, -2981, var12.field_a, this.terrainMasks);
              int[] stackIn_17_0 = this.field_n;
              if (stackIn_17_0 != var13) {
                if (var13 == this.fullTileMask) {
                  SoftwareRasterizer.fillRectangle(var10, var8, this.tileWidth, this.tileHeight, 1);
                } else {
                  var12.field_e.drawOpaque(var10, var8);
                }
              }
              var11++;
            }
            var9++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_14_0 = param2;
        }
        if (stackIn_14_0 <= 102) {
          this.a((int[][]) null, (byte) 106, (boolean[][]) null);
        }
        AlphaContainer.field_D.a(126);
        int[] stackIn_17_0Lifetime1 = this.field_c;
        SoftwareRasterizer.restoreClip(stackIn_17_0Lifetime1);
        this.a(this.field_y[1].pixels, true, this.field_y[0].pixels);
        this.field_y[0].drawTransparent(0, 0);
        return;
    }

    private final int[] a(int param0, int[] param1, int param2, int param3) {
        int[] stackIn_17_0 = null;
        String stackIn_21_2 = null;
        int var8 = EscapeVector.obfuscationControl;
        try {
          if (this.fullTileMask != param1 &&
            this.field_n != param1) {
            int[] stackIn_4_0 = (int[]) (param1);
            return stackIn_4_0;
          }
          int var6 = 67 / ((-63 - param3) / 62);
          int var5_int = 0;
          if (this.fullTileMask == param1) {
            var5_int = -1;
          }
          if (this.field_n == param1) {
            var5_int = 0;
          }
          param1 = new int[this.tileHeight];
          int var7 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (param1.length <= var7))) {
            stackIn_17_0 = (int[]) (param1);
            if (var8 == 0) {
              stackIn_17_0[var7] = var5_int;
              var7++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_17_0 = (int[]) (param1);
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_20_0 = var5;
          StringBuilder stackIn_20_1 = new StringBuilder().append("na.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void c(int param0) {
        int var3 = EscapeVector.obfuscationControl;
        this.field_y = new Sprite[2];
        int var2 = 0;
        while (var2 < this.field_y.length) {
          this.field_y[var2] = new Sprite(640, 480);
          var2++;
          if (var3 != 0) {
            return;
          }
        }
        if (param0 < 48) {
          this.field_B = 101;
        }
        return;
    }

    private final int[][] a(int param0, int[][] param1, boolean param2, int param3) {
        String stackIn_17_2 = null;
        int var13 = EscapeVector.obfuscationControl;
        try {
          int var5_int = 3;
          int var6 = 3;
          int var7 = -1 + param0;
          int var8 = -1 + param3;
          int var9 = 0;
          if (param2) {
            int[][] stackIn_3_0 = (int[][]) null;
            return stackIn_3_0;
          }
          scanLoop1: while (var9 < var6) {
            int var10 = 0;
            while (true) {
              if (var10 < var5_int) {
                int[] var15 = this.a(var9 + var7, -2981, var8 + var10, param1);
                int var12 = var10 + var5_int * var9;
                this.field_s[var12] = var15;
                var10++;
                if (var13 == 0) {
                  continue;
                }
              } else {
                var9++;
              }
              break;
            }
            if (var13 == 0) {
              continue scanLoop1;
            }
            break;
          }
          int[][] stackIn_13_0 = this.field_s;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var5;
          StringBuilder stackIn_16_1 = new StringBuilder().append("na.JB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    DynamicTerrainRenderer(int[][] terrainMasks, int[] fullTileMask, int[] options, int tilesWide, int tilesHigh) {
        this.field_B = 1458707;
        this.tileHeight = 32;
        this.field_u = new int[2];
        this.field_j = new int[]{199169, 0};
        this.field_o = 199169;
        this.tileWidth = 32;
        this.field_z = 2917671;
        this.field_q = 597511;
        try {
          this.field_n = options;
          this.fullTileMask = fullTileMask;
          this.tilesWide = tilesWide;
          this.tilesHigh = tilesHigh;
          this.terrainMasks = terrainMasks;
          this.field_l = this.e(1);
          this.field_e = new boolean[2 + this.tileHeight];
          this.field_k = new boolean[9];
          this.field_s = new int[9][];
          this.dirtyTiles = new boolean[this.tilesHigh * this.tilesWide];
          this.field_A = new boolean[this.tileHeight + 2][2 + this.tileWidth];
          this.b(0);
          this.c(96);
          this.field_c = new int[4];
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "na.<init>(" + (terrainMasks != null ? "{...}" : "null") + ',' + (fullTileMask != null ? "{...}" : "null") + ',' + (options != null ? "{...}" : "null") + ',' + tilesWide + ',' + tilesHigh + ')');
        }
    }

    static {
        field_b = 0;
        field_t = " - fire rock buster";
        field_m = "Highscores";
        field_i = new int[]{11, 14, 15, 16, 17, 18};
    }
}
