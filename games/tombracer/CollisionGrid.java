/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CollisionGrid {
    private int field_i;
    private boolean field_g;
    static LoginMethod field_f;
    private NodeHashTable field_h;
    private SecondaryNodeHashTable field_e;
    private int field_c;
    private GridLineWalker field_b;
    private int field_d;
    private Collidable[] field_a;

    CollisionGrid(boolean param0, int param1) {
        this(5, param0, param1);
    }

    final void remove(Collidable param0, byte param1) {
        int var4 = 0;
        CollisionGridEntry var5 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 <= 72) {
            this.field_g = false;
          }
          var5 = (CollisionGridEntry) (this.field_e.get(-128, (long)param0.getCollisionId(true)));
          while (var5 != null) {
            if (param0 == var5.getCollidable((byte) -128)) {
              var5.unlink(100);
              var5.unlinkSecondary(-7975);
              TextureFormat.releaseGridEntry(var5, -201);
            }
            var5 = (CollisionGridEntry) (this.field_e.nextWithSameKey((byte) 27));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("npa.A(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final Collidable[] queryBox(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != -1) {
          return (Collidable[]) null;
        }
        return this.queryRect(-1 + (param3 / 2 + param2), -(param3 / 2) + param2, -1 + (param0 + param4 / 2), (byte) -102, -(param4 / 2) + param0);
    }

    final Collidable[] queryCollidable(byte param0, Collidable param1) {
        RuntimeException var3 = null;
        Collidable[] stackIn_2_0 = null;
        Collidable[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -26) {
            stackIn_4_0 = this.queryBox(param1.getY(9648), -1, param1.getX(3), param1.getWidth(-48), param1.getHeight((byte) 55));
            return stackIn_4_0;
          }
          stackIn_2_0 = (Collidable[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("npa.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    private final Collidable[] queryLine(int param0, int param1, int param2, int param3, int param4) {
        int var11 = 0;
        int fieldTemp$0 = 0;
        int var6;
        int var7;
        CollisionGridEntry var8;
        int var9;
        Collidable var10;
        int var12;
        var12 = TombRacer.field_G ? 1 : 0;
        this.field_b.begin(-2147483648, (byte) 7, 32, 2147483647, param1 >> this.field_c, param2 >> this.field_c, param3 >> this.field_c, param0 >> this.field_c, 2147483647, -2147483648);
        this.field_d = param4;
        while (!this.field_b.field_d) {
          var6 = this.field_b.cellX((byte) 75);
          var7 = this.field_b.cellY(2);
          var8 = (CollisionGridEntry) (this.field_h.get((byte) -119, (long)ConstrainToRectangleLocomotor.hashCell(var6, var7, (byte) 36)));
          while (var8 != null) {
            if (var8.isAtCell(var6, var7, true)) {
              var9 = 1;
              var10 = var8.getCollidable((byte) -80);
              for (var11 = 0; var11 < this.field_d; var11++) {
                if (var10 != this.field_a[var11]) {
                  continue;
                }
                var9 = 0;
                break;
              }
              if (var9 != 0) {
                fieldTemp$0 = this.field_d;
                this.field_d = this.field_d + 1;
                this.field_a[fieldTemp$0] = var8.getCollidable((byte) -96);
                if (this.field_a.length <= this.field_d) {
                  return this.copyResults(0);
                }
              }
            }
            var8 = (CollisionGridEntry) (this.field_h.nextWithSameKey(-128));
          }
          this.field_b.step(113);
        }
        return this.copyResults(0);
    }

    private final int toCell(int param0, int param1) {
        if (param0 != 2) {
          return 112;
        }
        if (0 > param1) {
          return (-31 + (param1 >> this.field_c)) / 32;
        }
        return (param1 >> this.field_c) / 32;
    }

    private final Collidable[] queryRect(int param0, int param1, int param2, byte param3, int param4) {
        int var10 = 0;
        int var11 = 0;
        int var15 = 0;
        int fieldTemp$0 = 0;
        int var6;
        int var7;
        int var8;
        int var9;
        CollisionGridEntry var12;
        int var13;
        Collidable var14;
        int var16;
        var16 = TombRacer.field_G ? 1 : 0;
        var6 = this.toCell(2, param1);
        if (param3 >= -46) {
          this.field_i = -110;
        }
        var7 = this.toCell(2, param4);
        var8 = this.toCell(2, param0);
        var9 = this.toCell(2, param2);
        this.field_d = 0;
        for (var10 = var6; var8 >= var10; var10++) {
          for (var11 = var7; var11 <= var9; var11++) {
            var12 = (CollisionGridEntry) (this.field_h.get((byte) -80, (long)ConstrainToRectangleLocomotor.hashCell(var10, var11, (byte) -124)));
            while (var12 != null) {
              if (var12.isAtCell(var10, var11, true)) {
                var13 = 1;
                var14 = var12.getCollidable((byte) -75);
                for (var15 = 0; var15 < this.field_d; var15++) {
                  if (this.field_a[var15] != var14) {
                    continue;
                  }
                  var13 = 0;
                  break;
                }
                if (var13 != 0) {
                  fieldTemp$0 = this.field_d;
                  this.field_d = this.field_d + 1;
                  this.field_a[fieldTemp$0] = var12.getCollidable((byte) -71);
                  if (this.field_d >= this.field_a.length) {
                    return this.copyResults(0);
                  }
                }
              }
              var12 = (CollisionGridEntry) (this.field_h.nextWithSameKey(-106));
            }
          }
        }
        return this.copyResults(0);
    }

    public static void releaseStatics(int param0) {
        if (param0 != -2147483648) {
          return;
        }
        field_f = null;
    }

    private final Collidable[] copyResults(int param0) {
        Collidable[] var2 = new Collidable[this.field_d];
        ArrayUtils.copy(this.field_a, param0, var2, 0, this.field_d);
        return var2;
    }

    final void insert(Collidable param0, int param1) {
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        CollisionGridEntry var9 = null;
        CollisionGridEntry var10 = null;
        int var11 = 0;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          var3_int = this.toCell(2, param0.getX(param1 - 7070) - param0.getWidth(-55) / 2);
          var4 = this.toCell(2, param0.getY(9648) - param0.getHeight((byte) 55) / 2);
          if (param1 != 7073) {
            return;
          }
          var5 = this.toCell(param1 - 7071, -1 + param0.getX(3) + param0.getWidth(-58) / 2);
          var6 = this.toCell(2, param0.getY(param1 + 2575) - (-(param0.getHeight((byte) 55) / 2) + 1));
          for (var7 = var3_int; var5 >= var7; var7++) {
            for (var8 = var4; var6 >= var8; var8++) {
              boolean decompiledFrameCompleted0 = true;
              if (!this.field_g ||
                param0.overlapsBox(32 << this.field_c, (WorldBody) null, 113, 32 << this.field_c, var8 * 32 + 16 << this.field_c, (Collidable) null, 32 * var7 + 16 << this.field_c, 0)) {
                var9 = (CollisionGridEntry) (this.field_e.get(-121, (long)param0.getCollisionId(true)));
                while (var9 != null) {
                  if (var9.matches(var8, var7, param0, 123)) {
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                  var9 = (CollisionGridEntry) (this.field_e.nextWithSameKey((byte) 35));
                }
                if (decompiledFrameCompleted0) {
                  var10 = ShaderEffect.obtainGridEntry(var7, param0, var8, true);
                  this.field_e.put(param1 ^ -7074, var10, (long)param0.getCollisionId(true));
                  this.field_h.put((long)var10.hashCode(), 115, var10);
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_23_0 = var3;
          stackIn_23_1 = new StringBuilder().append("npa.H(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    final Collidable[] querySegment(BeamSegment param0, byte param1) {
        RuntimeException var3 = null;
        Collidable[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -4) {
            this.field_b = (GridLineWalker) null;
          }
          stackIn_3_0 = this.queryLine(param0.field_e, param0.field_d, param0.field_k, param0.field_a, 0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("npa.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final void pruneOutsideBounds(Collidable param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        CollisionGridEntry var8 = null;
        int var9 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var9 = TombRacer.field_G ? 1 : 0;
        try {
          var3_int = this.toCell(2, param0.getX(3) - param0.getWidth(-14) / 2);
          var5 = -25 / ((param1 - 13) / 51);
          var4 = this.toCell(2, param0.getY(9648) - param0.getHeight((byte) 55) / 2);
          var6 = this.toCell(2, -1 + param0.getX(3) + param0.getWidth(-51) / 2);
          var7 = this.toCell(2, -1 + (param0.getY(9648) + param0.getHeight((byte) 55) / 2));
          var8 = (CollisionGridEntry) (this.field_e.get(-120, (long)param0.getCollisionId(true)));
          while (var8 != null) {
            if (var8.getCollidable((byte) -76) == param0 &&
              !var8.intersectsBounds(var7, var6, var4, var3_int, -98)) {
              var8.unlink(104);
              var8.unlinkSecondary(-7975);
              TextureFormat.releaseGridEntry(var8, -201);
            }
            var8 = (CollisionGridEntry) (this.field_e.nextWithSameKey((byte) 119));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("npa.G(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        if (param0 != 32) {
          CollisionGrid.releaseStatics(-128);
        }
        return wt.field_d == PlayerResultRow.field_y ? true : false;
    }

    private CollisionGrid(int param0, boolean param1, int param2) {
        this.field_b = new GridLineWalker();
        this.field_a = new Collidable[128];
        this.field_i = 1 << param0;
        this.field_h = new NodeHashTable(this.field_i);
        this.field_e = new SecondaryNodeHashTable(this.field_i);
        this.field_g = param1 ? true : false;
        this.field_c = param2;
    }

    static {
        field_f = new LoginMethod("");
    }
}
