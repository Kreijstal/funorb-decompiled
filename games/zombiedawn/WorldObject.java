/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class WorldObject extends SpatialObject {
    boolean field_C;
    int field_x;
    int field_t;
    private int field_v;
    static Sprite[] field_w;
    int field_s;
    private int field_A;
    int field_y;
    int field_u;
    int field_z;
    int field_B;

    void updateGridCell(byte param0) {
        if (ng.field_e) {
          return;
        }
        int var2 = -113 / ((param0 - 66) / 50);
        int var3 = this.field_y >> 23;
        int var4 = this.field_x >> 23;
        if (this.field_B != var3) {
          this.field_u = var4;
          this.field_B = var3;
          Js5Archive.field_e.addToSpatialGrid(false, this);
          return;
        }
        if (this.field_u == var4) {
          return;
        }
        this.field_u = var4;
        this.field_B = var3;
        Js5Archive.field_e.addToSpatialGrid(false, this);
    }

    final WorldObject nextNearbyObject(byte param0) {
        Object var3;
        WorldObject var3_ref;
        WorldObject var6;
        if (param0 == 32) {
          if (-1 == this.field_v) {
            return (WorldObject) (Js5Archive.field_e.spatialGrid.nextQueryObject(false));
          }
          do {
            var6 = (WorldObject) (Js5Archive.field_e.spatialGrid.nextQueryObject(false));
            if (var6 == null) {
              return null;
            }
          } while (!var6.matchesTypeMask((byte) 75, this.field_v) || -1 != this.field_A &&
            this.distanceSquaredTo(var6, 1654152400) >= this.field_A);
          return var6;
        }
        this.field_x = -55;
        if (-1 == this.field_v) {
          return (WorldObject) (Js5Archive.field_e.spatialGrid.nextQueryObject(false));
        }
        while (true) {
          var3_ref = (WorldObject) (Js5Archive.field_e.spatialGrid.nextQueryObject(false));
          if (var3_ref == null) {
            return null;
          }
          if (!var3_ref.matchesTypeMask((byte) 75, this.field_v)) {
            continue;
          }
          if (-1 == this.field_A) {
            return var3_ref;
          }
          if (this.distanceSquaredTo(var3_ref, 1654152400) >= this.field_A) {
            continue;
          }
          break;
        }
        return var3_ref;
    }

    final int distanceSquaredTo(WorldObject param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param0.field_y - this.field_y >> 16;
          if (param1 != 1654152400) {
            this.matchesTypeMask((byte) 21, -16);
          }
          var4 = -this.field_x + param0.field_x >> 16;
          this.field_s = var3_int * var3_int + var4 * var4;
          stackIn_3_0 = this.field_s;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("fb.BB(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract void draw(byte param0, Camera param1);

    final boolean matchesTypeMask(byte param0, int param1) {
        if (this instanceof Human) {
          return (param1 & 1) != 0 ? true : false;
        }
        if (this instanceof Zombie) {
          return 0 != (param1 & 2) ? true : false;
        }
        if (this instanceof id) {
          return 0 != (4 & param1) ? true : false;
        }
        if (this instanceof vb) {
          return 0 != (param1 & 8) ? true : false;
        }
        if (param0 <= 29) {
          return false;
        }
        if (!(this instanceof gb)) {
          return false;
        }
        if ((param1 & 16) != 0) {
          return true;
        }
        return false;
    }

    final WorldObject firstNearbyObject(byte param0, int param1, int param2) {
        Object var4;
        WorldObject var4_ref;
        int var5;
        int var5Lifetime1;
        Object var4Lifetime1;
        WorldObject var4_refLifetime1;
        if (param1 != -1) {
          this.field_A = param1 * param1;
          this.field_v = param2;
          var4 = null;
          if (param1 != -1) {
            var5 = 1 + (param1 >> 7);
            var4_ref = (WorldObject) (Js5Archive.field_e.spatialGrid.firstObjectNear(var5, this.field_u, 29845, this.field_B));
          } else {
            var4_ref = (WorldObject) (Js5Archive.field_e.spatialGrid.firstObject(true));
          }
          if (param0 != -74) {
            return (WorldObject) null;
          }
          if (var4_ref == null) {
            return null;
          }
          if (!var4_ref.matchesTypeMask((byte) 114, param2)) {
            return this.nextNearbyObject((byte) 32);
          }
          if (this.field_A == -1) {
            return var4_ref;
          }
          if (this.distanceSquaredTo(var4_ref, param0 ^ -1654152346) < this.field_A) {
            return var4_ref;
          }
          return this.nextNearbyObject((byte) 32);
        }
        this.field_A = -1;
        this.field_v = param2;
        var4Lifetime1 = null;
        if (param1 != -1) {
          var5Lifetime1 = 1 + (param1 >> 7);
          var4_refLifetime1 = (WorldObject) (Js5Archive.field_e.spatialGrid.firstObjectNear(var5Lifetime1, this.field_u, 29845, this.field_B));
        } else {
          var4_refLifetime1 = (WorldObject) (Js5Archive.field_e.spatialGrid.firstObject(true));
        }
        if (param0 != -74) {
          return (WorldObject) null;
        }
        if (var4_refLifetime1 == null) {
          return null;
        }
        if (!var4_refLifetime1.matchesTypeMask((byte) 114, param2)) {
          return this.nextNearbyObject((byte) 32);
        }
        if (this.field_A == -1) {
          return var4_refLifetime1;
        }
        if (this.distanceSquaredTo(var4_refLifetime1, param0 ^ -1654152346) >= this.field_A) {
          return this.nextNearbyObject((byte) 32);
        }
        return var4_refLifetime1;
    }

    final WorldObject firstNearbyAnyObject(int param0, int param1) {
        int var3 = 0;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        if (param0 != -1) {
          this.field_A = param0 * param0;
          this.field_v = -1;
          if (param1 == 16) {
            if (param0 == -1) {
              return (WorldObject) (Js5Archive.field_e.spatialGrid.firstObject(true));
            }
            var3 = (param0 >> 7) + 1;
            return (WorldObject) (Js5Archive.field_e.spatialGrid.firstObjectNear(var3, this.field_u, 29845, this.field_B));
          }
          this.field_x = 64;
          if (param0 == -1) {
            return (WorldObject) (Js5Archive.field_e.spatialGrid.firstObject(true));
          }
          var3Lifetime3 = (param0 >> 7) + 1;
          return (WorldObject) (Js5Archive.field_e.spatialGrid.firstObjectNear(var3Lifetime3, this.field_u, 29845, this.field_B));
        }
        this.field_A = -1;
        this.field_v = -1;
        if (param1 == 16) {
          if (param0 == -1) {
            return (WorldObject) (Js5Archive.field_e.spatialGrid.firstObject(true));
          }
          var3Lifetime1 = (param0 >> 7) + 1;
          return (WorldObject) (Js5Archive.field_e.spatialGrid.firstObjectNear(var3Lifetime1, this.field_u, 29845, this.field_B));
        }
        this.field_x = 64;
        if (param0 == -1) {
          return (WorldObject) (Js5Archive.field_e.spatialGrid.firstObject(true));
        }
        var3Lifetime2 = (param0 >> 7) + 1;
        return (WorldObject) (Js5Archive.field_e.spatialGrid.firstObjectNear(var3Lifetime2, this.field_u, 29845, this.field_B));
    }

    final static void putIntAt(int param0, byte[] param1, byte param2, int param3) {
        try {
          int var4_int = -40 / ((param2 + 5) / 42);
          param1[param0 * 4] = (byte)(param3 >>> 24);
          param1[1 + param0 * 4] = (byte)(param3 >>> 16);
          param1[2 + 4 * param0] = (byte)(param3 >>> 8);
          param1[param0 * 4 + 3] = (byte)param3;
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "fb.CB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final int getY(int param0) {
        if (param0 != 237239984) {
          WorldObject.releaseStatics(-58);
          return this.field_x >> 16;
        }
        return this.field_x >> 16;
    }

    final int getX(boolean param0) {
        if (!param0) {
          WorldObject.cosFixed(-36, -98);
          return this.field_y >> 16;
        }
        return this.field_y >> 16;
    }

    final static int cosFixed(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        byte[] var3;
        if (param0 == 1311979239) {
          param1 = param1 & 8191;
          if (4096 > param1) {
            if (2048 <= param1) {
              stackIn_19_0 = -lo.field_q[-2048 + param1];
            } else {
              stackIn_19_0 = lo.field_q[-param1 + 2048];
            }
            return stackIn_19_0;
          }
          if (param1 < 6144) {
            stackIn_15_0 = -lo.field_q[-param1 + 6144];
          } else {
            stackIn_15_0 = lo.field_q[param1 - 6144];
          }
          return stackIn_15_0;
        }
        var3 = (byte[]) null;
        WorldObject.putIntAt(28, (byte[]) null, (byte) -56, 124);
        param1 = param1 & 8191;
        if (4096 > param1) {
          if (2048 <= param1) {
            stackIn_9_0 = -lo.field_q[-2048 + param1];
          } else {
            stackIn_9_0 = lo.field_q[-param1 + 2048];
          }
          return stackIn_9_0;
        }
        if (param1 < 6144) {
          stackIn_5_0 = -lo.field_q[-param1 + 6144];
        } else {
          stackIn_5_0 = lo.field_q[param1 - 6144];
        }
        return stackIn_5_0;
    }

    abstract void tick(int param0);

    public static void releaseStatics(int param0) {
        if (param0 != 237239984) {
          field_w = (Sprite[]) null;
          field_w = null;
          return;
        }
        field_w = null;
    }

    WorldObject(int param0, int param1, int param2) {
        this.field_z = 0;
        this.field_C = false;
        this.field_B = -1;
        this.field_u = -1;
        this.field_x = param1 << 16;
        this.field_y = param0 << 16;
        this.field_t = param2;
    }

    static {
    }
}
