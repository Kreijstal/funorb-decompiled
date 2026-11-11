/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DefaultTileRenderable extends TileRenderable {
    private int field_j;
    static String[] field_g;
    private int field_m;
    private int field_i;
    private int field_k;
    private int field_h;
    private int field_l;
    private int field_n;

    public final int getRenderY(byte param0) {
        if (param0 < 91) {
          this.getRenderZ((byte) -93);
          return this.cell.getCenterY(true);
        }
        return this.cell.getCenterY(true);
    }

    private final void chooseFloorSprite(byte param0) {
        int var3 = TombRacer.field_G ? 1 : 0;
        if (this.field_k < 25) {
          this.field_m = 12;
          this.field_m = this.field_m + (2 + this.getCheckerIndex(16094)) % 4;
          if (param0 <= 125) {
            this.getRenderY((byte) -70);
            return;
          }
          return;
        }
        if (50 <= this.field_k) {
          if (this.field_k >= 75) {
            this.field_m = 0;
            this.field_m = this.field_m + (2 + this.getCheckerIndex(16094)) % 4;
            if (param0 <= 125) {
              this.getRenderY((byte) -70);
              return;
            }
            return;
          }
          this.field_m = 4;
          this.field_m = this.field_m + (2 + this.getCheckerIndex(16094)) % 4;
          if (param0 > 125) {
            return;
          }
          this.getRenderY((byte) -70);
          return;
        }
        this.field_m = 8;
        this.field_m = this.field_m + (2 + this.getCheckerIndex(16094)) % 4;
        if (param0 > 125) {
          return;
        }
        this.getRenderY((byte) -70);
    }

    final void chooseSprite(byte param0) {
        int var2;
        int var3;
        TileRenderable var4;
        int var5;
        int var2Lifetime1;
        int var2Lifetime2;
        var5 = TombRacer.field_G ? 1 : 0;
        if (0 == this.getCheckerIndex(16094)) {
          this.field_k = this.getRoom(10685).getSeededRandom(true).nextBounded(100, 0);
          this.field_m = -1;
          this.field_n = 0;
          this.field_i = -1;
          var2 = this.field_h;
          if (var2 == 0) {
            this.chooseSpriteForTileType((byte) -84);
          } else {
            if (var2 == 1) {
              this.chooseEdgeSprite((byte) -93);
            }
          }
          if (param0 <= -31) {
            return;
          }
          this.resetStyle(97);
          return;
        }
        var2Lifetime1 = this.cell.getColumn((byte) 106) / 2 * 2;
        var3 = this.cell.getRow(116) / 2 * 2;
        var4 = this.cell.getGrid(18641).getCell(25, var2Lifetime1, var3).getRenderable((byte) -95);
        if (var4 instanceof DefaultTileRenderable) {
          this.field_k = ((DefaultTileRenderable) (var4)).field_k;
        }
        this.field_m = -1;
        this.field_n = 0;
        this.field_i = -1;
        var2Lifetime2 = this.field_h;
        if (var2Lifetime2 == 0) {
          this.chooseSpriteForTileType((byte) -84);
        } else {
          if (var2Lifetime2 == 1) {
            this.chooseEdgeSprite((byte) -93);
          }
        }
        if (param0 <= -31) {
          return;
        }
        this.resetStyle(97);
        return;
    }

    final void mirror(boolean param0) {
        if (param0) {
          this.field_l = EditableTextField.a(this.field_l, 6);
          this.chooseSprite((byte) -49);
          return;
        }
        this.chooseFloorSprite((byte) -116);
        this.field_l = EditableTextField.a(this.field_l, 6);
        this.chooseSprite((byte) -49);
    }

    private final void chooseSpriteForTileType(byte param0) {
        int var2 = 0;
        int var2Lifetime1;
        if (param0 != -84) {
          this.field_h = 93;
          var2 = this.cell.tileType;
          if (0 == var2) {
            this.chooseFloorSprite((byte) 127);
            return;
          }
          if (var2 == 1) {
            this.b(false);
            return;
          }
          return;
        }
        var2Lifetime1 = this.cell.tileType;
        if (0 == var2Lifetime1) {
          this.chooseFloorSprite((byte) 127);
          return;
        }
        if (var2Lifetime1 == 1) {
          this.b(false);
          return;
        }
    }

    public static void releaseStatics(int param0) {
        field_g = null;
        if (param0 != -1) {
          field_g = (String[]) null;
        }
    }

    private final int getCheckerIndex(int param0) {
        if (param0 == 16094) {
          return this.cell.getColumn((byte) 102) % 2 + 2 * (this.cell.getRow(-77) % 2);
        }
        field_g = (String[]) null;
        return this.cell.getColumn((byte) 102) % 2 + 2 * (this.cell.getRow(-77) % 2);
    }

    public final void render(int param0, Camera param1) {
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        TileGridCell var12 = null;
        TileGridCell var13 = null;
        int var11Lifetime1;
        try {
          var3_int = this.cell.getColumn((byte) 83);
          var4 = this.cell.getRow(111);
          var5 = this.cell.getGrid(18641).getRowCount(31);
          if (param0 < 103) {
            this.getRenderY((byte) 39);
          }
          var6 = 4;
          var7 = var5 - 5;
          if (var6 > var4) {
            return;
          }
          if (var4 >= var7) {
            return;
          }
          var8 = this.cell.getCenterX((byte) -104);
          var9 = this.cell.getCenterY(true);
          if (!this.cell.hasWideOccupancy(false)) {
            if (-1 != this.field_m) {
              gqa.a(0, -83584144, var9, var8, gca.field_g[this.field_m], 0);
            }
            if (SpriteTileOperator.d(43) &&
              this.field_i != -1) {
              gqa.a(this.field_n, -83584144, var9, var8, gca.field_g[this.field_i], 0);
            }
          }
          if (!SpriteTileOperator.d(-81)) {
            return;
          }
          if (var4 == var6 + 1 &&
            0 < var3_int &&
            var3_int % 2 == 1) {
            var12 = this.cell.getGrid(18641).getCell(-104, var3_int - 1, var4);
            if (var12 != null && (!this.cell.hasWideOccupancy(false) ||
              !var12.hasWideOccupancy(false))) {
              var11 = this.cell.getGrid(18641).getTileSize(-30551) / 2;
              gqa.a(1024, -83584144, -var11 + var9, var8 - var11, gca.field_g[25], 65536);
            }
          }
          if (-1 + var7 == var4 &&
            var3_int > 0 &&
            1 == var3_int % 2) {
            var13 = this.cell.getGrid(18641).getCell(-100, var3_int - 1, var4);
            if (var13 != null) {
              if (this.cell.hasWideOccupancy(false) &&
                var13.hasWideOccupancy(false)) {
                return;
              }
              var11Lifetime1 = this.cell.getGrid(18641).getTileSize(-30551) / 2;
              gqa.a(0, -83584144, var9 - var11Lifetime1, -var11Lifetime1 + var8, gca.field_g[25], 65536);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("mba.DB(").append(param0).append(',');
          if (param1 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw tba.wrapException((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(')').toString());
        }
    }

    public final boolean isRenderExpired(byte param0) {
        if (param0 != 48) {
          return false;
        }
        return false;
    }

    public final void updateAnimation(int param0) {
        if (param0 != -4366) {
          this.field_m = -69;
        }
    }

    public final int getRenderZ(byte param0) {
        if (param0 >= -86) {
          this.field_h = -55;
          return 0;
        }
        return 0;
    }

    public final int getRenderX(byte param0) {
        int var2 = -111 % ((-23 - param0) / 53);
        return this.cell.getCenterX((byte) -104);
    }

    private final void chooseEdgeSprite(byte param0) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = TombRacer.field_G ? 1 : 0;
        this.chooseFloorSprite((byte) 126);
        if (param0 > -83) {
          this.isDusty(-10);
        }
        var2 = this.field_j;
        if (0 == var2) {
          var2 = this.field_l;
          if (var2 == 0) {
            this.field_n = -512;
          } else {
            if (var2 == 4) {
              this.field_n = 512;
            } else {
              if (var2 == 6) {
                this.field_n = 1024;
              } else {
                if (2 == var2) {
                  this.field_n = 0;
                }
              }
            }
          }
          this.field_i = 18;
          return;
        }
        if (var2 == 1) {
          var2 = this.field_l;
          if (var2 == 3) {
            this.field_n = 1024;
          } else {
            if (var2 == 5) {
              this.field_n = -512;
            } else {
              if (var2 == 1) {
                this.field_n = 512;
              } else {
                if (var2 == 7) {
                  this.field_n = 0;
                }
              }
            }
          }
          this.field_i = 20;
          return;
        }
        if (var2 != 2) {
          return;
        }
        var2Lifetime1 = this.field_l;
        if (var2Lifetime1 == 3) {
          this.field_n = 0;
        } else {
          if (var2Lifetime1 == 5) {
            this.field_n = 512;
          } else {
            if (var2Lifetime1 == 1) {
              this.field_n = -512;
            } else {
              if (var2Lifetime1 == 7) {
                this.field_n = 1024;
              }
            }
          }
        }
        this.field_i = 19;
    }

    final static boolean e(int param0) {
        lqa var1 = null;
        lqa var1Lifetime1;
        if (param0 != -22766) {
          DefaultTileRenderable.e(85);
          var1 = LegacyOpenGlBloomEffect.b(false);
          if (var1 == null) {
            return false;
          }
          if (SimpleHoverMountComponent.field_M) {
            return false;
          }
          if (var1.field_k) {
            return true;
          }
          return false;
        }
        var1Lifetime1 = LegacyOpenGlBloomEffect.b(false);
        if (var1Lifetime1 == null) {
          return false;
        }
        if (SimpleHoverMountComponent.field_M) {
          return false;
        }
        if (var1Lifetime1.field_k) {
          return true;
        }
        return false;
    }

    final void resetStyle(int param0) {
        this.field_h = 0;
        if (param0 != -23801) {
          this.chooseEdgeSprite((byte) 74);
        }
    }

    private final void b(boolean param0) {
        if (this.field_k < 50) {
          this.field_m = 16;
          if (param0) {
            this.chooseFloorSprite((byte) -45);
            return;
          }
          return;
        }
        this.field_m = 17;
        if (param0) {
          this.chooseFloorSprite((byte) -45);
          return;
        }
    }

    final void setEdgeStyle(int param0, int param1, int param2, byte param3) {
        if (param3 == 73) {
          this.field_h = param0;
          this.field_j = param2;
          this.field_l = param1;
          return;
        }
        this.chooseEdgeSprite((byte) -40);
        this.field_h = param0;
        this.field_j = param2;
        this.field_l = param1;
    }

    final boolean isDusty(int param0) {
        if (param0 == -2) {
          return this.cell.tileType == 1 ? true : false;
        }
        this.chooseEdgeSprite((byte) -97);
        return this.cell.tileType == 1 ? true : false;
    }

    DefaultTileRenderable() {
    }

    static {
    }
}
