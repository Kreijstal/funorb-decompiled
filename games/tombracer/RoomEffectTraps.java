/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RoomEffectTraps {
    private Room room;
    static int field_b;
    private Trap[] field_d;
    private boolean field_a;
    private Trap[] field_e;
    private Trap[] darknessTraps;
    static String field_g;

    final void update(boolean param0) {
        boolean stackIn_17_1 = false;
        int stackIn_20_1 = 0;
        PlayerSimulation stackIn_20_2 = null;
        boolean stackIn_21_3 = false;
        boolean stackIn_24_1 = false;
        int var3;
        PlayerSimulation var4;
        var3 = TombRacer.field_G ? 1 : 0;
        if (!param0) {
          return;
        }
        var4 = this.getSimulation((byte) -115);
        if (null == this.field_e &&
          var4.isEffectActive(4, 10915)) {
          this.a(1, 3, (byte) -127, 2);
        } else {
          if (null != this.field_e &&
            !var4.isEffectActive(4, 10915)) {
            this.a(-83);
          }
        }
        if (this.darknessTraps == null &&
          var4.isEffectActive(5, 10915)) {
          stackIn_20_1 = -1;
          stackIn_20_2 = var4;
          stackIn_21_3 = !(param0);
          stackIn_24_1 = (stackIn_20_1 == ~((PlayerSimulation) (Object) stackIn_20_2).getCombinedEffectSlot(stackIn_21_3, 5));
          this.spawnDarknessTrap(stackIn_24_1, (byte) 25);
        } else {
          if (this.darknessTraps != null &&
            !var4.isEffectActive(5, 10915)) {
            stackIn_17_1 = !(param0);
            this.b(stackIn_17_1);
          }
        }
        if (null == this.field_d &&
          var4.isEffectActive(6, 10915)) {
          this.a((byte) 82, 5);
        } else {
          if (null != this.field_d &&
            !var4.isEffectActive(6, 10915)) {
            this.a(false);
          }
        }
        if (!this.field_a &&
          var4.isEffectActive(7, 10915)) {
          this.c((byte) 96);
        } else {
          if (this.field_a &&
            !var4.isEffectActive(7, 10915)) {
            this.c((byte) 54);
          }
        }
    }

    final void forgetTraps(byte param0) {
        int var2 = 49 / ((46 - param0) / 38);
        this.field_e = null;
        this.darknessTraps = null;
        this.field_a = false;
        this.field_d = null;
    }

    private final void a(boolean param0) {
        int var3 = 0;
        Trap[] var2;
        Trap var4;
        int var5;
        Trap[] var6;
        var5 = TombRacer.field_G ? 1 : 0;
        if (null == this.field_d) {
          return;
        }
        if (param0) {
          return;
        }
        var6 = this.field_d;
        var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          if (var4 != null) {
            this.room.removeTrap(var4, 2);
          }
        }
        this.field_d = null;
    }

    final static void a(int param0, int param1, int param2, String param3, int param4, GameFont param5, int param6) {
        try {
          if (param1 >= -11) {
            field_b = -58;
          }
          param5.a(param2, false, param3, param4, fm.a(false, param6), fm.a(false, param0));
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ts.M(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ',' + param6 + ')');
        }
    }

    final static void a(byte param0, String param1, boolean param2) {
        if (param0 != -63) {
          return;
        }
        try {
          ObjectList.field_c = nla.field_a;
          SoftReferenceCache.field_a = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ts.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private final PlayerSimulation getSimulation(byte param0) {
        if (param0 != -115) {
          return (PlayerSimulation) null;
        }
        return this.room.getSimulation(-1553494544);
    }

    private final void spawnDarknessTrap(boolean param0, byte param1) {
        if (this.darknessTraps != null) {
          this.b(false);
        }
        int var3 = this.room.getWidth((byte) -86) >> 16;
        int var4 = this.room.getHeight(param1 ^ -107) >> 16;
        this.darknessTraps = new Trap[1];
        this.darknessTraps[0] = new Trap(this.room, var3 / 2, var4 / 2, var3 + 32, var4 + 32, 0, true);
        DarknessBehaviour var5 = new DarknessBehaviour(this.room, true);
        if (param1 != 25) {
          this.update(false);
        }
        this.darknessTraps[0].addBehaviour((byte) 83, (Behaviour) (var5));
        this.darknessTraps[0].c(437453352, false);
        this.room.addTrap(this.darknessTraps[0], (byte) 32);
        if (param0) {
          var5.e(false);
        }
    }

    private final void a(int param0, int param1, byte param2, int param3) {
        Room stackIn_14_0;
        Object stackIn_14_1;
        int stackIn_14_2;
        int stackIn_14_3;
        int stackIn_14_4;
        int stackIn_15_5 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_27_3;
        Room stackIn_34_0;
        Object stackIn_34_1;
        int stackIn_34_2;
        int stackIn_34_3;
        int stackIn_34_4;
        int stackIn_34_5;
        int stackIn_35_6 = 0;
        int stackIn_47_0 = 0;
        int stackIn_48_1 = 0;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        WindZoneBehaviour var14;
        int var15;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var15 = TombRacer.field_G ? 1 : 0;
        if (null != this.field_e) {
          this.a(-93);
        }
        var5 = this.room.getWidth((byte) -86);
        var6 = this.room.getHeight(param2 ^ -29);
        if (param2 != -127) {
          this.field_d = (Trap[]) null;
        }
        if (param3 != 0 &&
          param3 != 2) {
          var10 = 32;
          this.field_e = new Trap[(var6 >> 16) / 32];
          var9 = var5 >> 16;
          var7 = var9 / 2;
          var8 = 16;
          var11 = 0;
          var12 = 0;
          while (var12 == 0) {
            for (var13 = 0; var13 < this.field_e.length; var13++) {
              stackIn_34_0 = this.room;
              stackIn_34_1 = null;
              stackIn_34_2 = 2097152;
              stackIn_34_3 = 2;
              stackIn_34_4 = 4;
              stackIn_34_5 = var13 * 32 + 16 << 16;
              if (param3 != 3) {
                stackIn_35_6 = 16 + var11 * 32;
              } else {
                stackIn_35_6 = -(32 * var11) + (var9 - 16);
              }
              if (((Room) (Object) stackIn_34_0).a((Collidable) (stackIn_34_1), stackIn_34_2, stackIn_34_3, stackIn_34_4, stackIn_34_5, stackIn_35_6 << 16, false, (WorldBody) null, 2097152)) {
                continue;
              }
              var12 = 1;
              break;
            }
            if (var12 != 0) {
              continue;
            }
            var11++;
            if (var11 >= 0 &&
              var11 <= var9 / 32) {
              continue;
            }
            var12 = 1;
            var11 = 0;
          }
          var9 = var9 - var11 * 32;
          stackIn_47_0 = var7;
          if (param3 != 3) {
            stackIn_48_1 = 1;
          } else {
            stackIn_48_1 = -1;
          }
          var7 = stackIn_47_0 + stackIn_48_1 * 16 * var11;
        } else {
          var9 = 32;
          var10 = var6 >> 16;
          var7 = 16;
          this.field_e = new Trap[(var5 >> 16) / 32];
          var8 = var10 / 2;
          var11 = 0;
          var12 = 0;
          while (var12 == 0) {
            for (var13 = 0; var13 < this.field_e.length; var13++) {
              stackIn_14_0 = this.room;
              stackIn_14_1 = null;
              stackIn_14_2 = 2097152;
              stackIn_14_3 = param2 + 129;
              stackIn_14_4 = 4;
              if (param3 == 0) {
                stackIn_15_5 = -(32 * var11) - 16 + var10;
              } else {
                stackIn_15_5 = var11 * 32 + 16;
              }
              if (((Room) (Object) stackIn_14_0).a((Collidable) (stackIn_14_1), stackIn_14_2, stackIn_14_3, stackIn_14_4, stackIn_15_5 << 16, 16 + 32 * var13 << 16, false, (WorldBody) null, 2097152)) {
                continue;
              }
              var12 = 1;
              break;
            }
            if (var12 != 0) {
              continue;
            }
            var11++;
            if (var11 >= 0 &&
              var10 / 32 >= var11) {
              continue;
            }
            var12 = 1;
            var11 = 0;
          }
          var10 = var10 - 32 * var11;
          stackIn_26_0 = var8;
          stackIn_26_1 = var11;
          stackIn_26_2 = 16;
          if (param3 != 0) {
            stackIn_27_3 = 1;
          } else {
            stackIn_27_3 = -1;
          }
          var8 = stackIn_26_0 + stackIn_26_1 * (stackIn_26_2 * stackIn_27_3);
        }
        for (var11Lifetime1 = 0; var11Lifetime1 < this.field_e.length; var11Lifetime1++) {
          if (param3 != 0 &&
            param3 != 2) {
            var12Lifetime1 = var7;
            var13Lifetime1 = var8 + 32 * var11Lifetime1;
          } else {
            var13Lifetime1 = var8;
            var12Lifetime1 = var11Lifetime1 * 32 + var7;
          }
          this.field_e[var11Lifetime1] = new Trap(this.room, var12Lifetime1, var13Lifetime1, var9, var10, 0, true);
          var14 = new WindZoneBehaviour(this.room, true);
          var14.b(param2 ^ 5, param3);
          var14.a(param0, param1, 19072);
          this.field_e[var11Lifetime1].addBehaviour((byte) 83, (Behaviour) (var14));
          this.room.addTrap(this.field_e[var11Lifetime1], (byte) 32);
        }
    }

    private final void c(byte param0) {
        if (param0 < 9) {
          this.a(-57, -122, (byte) 28, -22);
        }
        this.field_a = !this.field_a ? true : false;
        this.room.b(7, true);
    }

    public static void releaseStatics(int param0) {
        field_g = null;
        if (param0 != 32) {
          RoomEffectTraps.releaseStatics(67);
        }
    }

    private final void a(int param0) {
        int var3 = 0;
        Trap var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        if (this.field_e == null) {
          return;
        }
        if (param0 > -72) {
          this.update(true);
        }
        Trap[] var6 = this.field_e;
        Trap[] var2 = var6;
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          this.room.removeTrap(var4, 2);
        }
        this.field_e = null;
    }

    private final void a(byte param0, int param1) {
        int var10 = 0;
        int stackIn_17_0 = 0;
        int var3;
        int var4;
        RoomComponent var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        var16 = TombRacer.field_G ? 1 : 0;
        if (null != this.field_d) {
          this.a(false);
        }
        var3 = this.room.getWidth((byte) -86);
        var4 = this.room.getHeight(125);
        this.field_d = new Trap[param1];
        var5 = vha.field_c.createSkeletonComponent(this.room, (byte) 118);
        var6 = var5.getWidth(-41);
        var7 = var5.getHeight((byte) 55);
        var8 = 0;
        if (param0 != 82) {
          return;
        }
        var9 = 50;
        for (var10 = 0; param1 > var10; var10++) {
          var11 = 1;
          while (var11 != 0) {
            if (var9 > var8) {
              var8++;
              var12 = var6 / 2 + this.room.getRandom(param0 - 41).nextBounded(var3 - var6, 0);
              var13 = this.room.getRandom(param0 - 195).nextBounded(var4 - var7, 0) + var7 / 2;
              var14 = -var12 + this.room.getPlayer(-53).getX(3) >> 16;
              var15 = -var13 + this.room.getPlayer(-79).getY(param0 ^ 9698) >> 16;
              if (4096 > var15 * var15 + var14 * var14) {
                continue;
              }
              stackIn_17_0 = (!this.room.a((Collidable) null, var7, 2, 1, var13, var12, false, (WorldBody) null, var6)) ? 0 : 1;
              var11 = stackIn_17_0;
              if (var11 != 0) {
                continue;
              }
              var5.setPosition(1434528720, var13, var12);
              var5.instantiate(true, true, this.room, 0, 0, -1, (Trap) null);
              this.field_d[var10] = (Trap) (var5.u(kha.bitwiseXor((int) param0, -24)));
              continue;
            }
            break;
          }
        }
        return;
    }

    private final void b(boolean param0) {
        PlayerSimulation discarded$0 = null;
        int var3 = 0;
        Trap var4 = null;
        int var5 = TombRacer.field_G ? 1 : 0;
        if (null == this.darknessTraps) {
          return;
        }
        Trap[] var6 = this.darknessTraps;
        Trap[] var2 = var6;
        if (param0) {
          discarded$0 = this.getSimulation((byte) 106);
        }
        for (var3 = 0; var3 < var6.length; var3++) {
          var4 = var6[var3];
          this.room.removeTrap(var4, 2);
        }
        this.darknessTraps = null;
    }

    final static void a(byte param0, byte[] param1, int param2, int param3, int param4, int param5, int param6) {
        int var17 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        int var15 = 0;
        int var16 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var23 = 0;
        String var24 = null;
        var23 = TombRacer.field_G ? 1 : 0;
        try {
          if (0 < param3 &&
            !cla.isPowerOfTwoOrZero(9181, param3)) {
            throw new IllegalArgumentException("");
          }
          if (param4 > 0 &&
            !cla.isPowerOfTwoOrZero(9181, param4)) {
            throw new IllegalArgumentException("");
          }
          var7_int = jj.glFormatComponents(param5, (byte) -104);
          var8 = 0;
          if (param0 <= 51) {
            var24 = (String) null;
            RoomEffectTraps.a((byte) -93, (String) null, false);
          }
          stackIn_12_0 = (param4 > param3) ? param3 : param4;
          var9 = stackIn_12_0;
          var10 = param3 >> 1;
          var11 = param4 >> 1;
          var12 = param1;
          var13 = new byte[var7_int * var11 * var10];
          while (true) {
            jaggl.OpenGL.glTexImage2Dub(param2, var8, param6, param3, param4, 0, param5, 5121, var12, 0);
            if (var9 <= 1) {
              return;
            }
            var16 = param3 * var7_int;
            for (var17 = 0; var17 < var7_int; var17++) {
              var18 = var17;
              var19 = var17;
              var20 = var16 + var19;
              for (var21 = 0; var21 < var11; var21++) {
                for (var22 = 0; var22 < var10; var22++) {
                  var15 = var12[var19];
                  var19 = var19 + var7_int;
                  var15 = var15 + var12[var19];
                  var19 = var19 + var7_int;
                  var15 = var15 + var12[var20];
                  var20 = var20 + var7_int;
                  var15 = var15 + var12[var20];
                  var20 = var20 + var7_int;
                  var13[var18] = (byte)(var15 >> 2);
                  var18 = var18 + var7_int;
                }
                var20 = var20 + var16;
                var19 = var19 + var16;
              }
            }
            var14 = var13;
            var13 = var12;
            var12 = var14;
            param4 = var11;
            param3 = var10;
            var8++;
            var9 = var9 >> 1;
            var11 = var11 >> 1;
            var10 = var10 >> 1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_27_0 = var7;
          stackIn_27_1 = new StringBuilder().append("ts.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    RoomEffectTraps(Room param0) {
        try {
          this.room = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "ts.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = 3;
    }
}
