/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GrappleLauncherBehaviour implements DiffableState {
    static String field_c;
    int hookId;
    static int field_b;
    static int field_d;
    int reload;
    private int targetRopeLength;
    private int ropeLength;
    static int field_f;

    final void a(int param0, lta param1, int[] param2, int param3, World param4, int param5, int param6) {
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        ShipBody var21 = null;
        ShipComponent var22 = null;
        GrapplingHook var23 = null;
        int var17Lifetime1;
        try {
          var23 = param4.h(this.hookId, -125);
          if (param6 < 73) {
            this.ropeLength = 55;
          }
          if (var23 != null) {
            var9 = Lo.a(param2, 84);
            var10 = param5 + (var9 * GetNumStars.a(param0, (byte) -96) >> 16);
            var11 = param3 + (eu.a(param0, 85) * var9 >> 16);
            var12 = -var10 + var23.d(false);
            var13 = -var11 + var23.g((byte) 124);
            var14 = ar.a(var12, (byte) 118, var13);
            var15 = -this.ropeLength + var14;
            var16 = 39219;
            if (0 < var15) {
              var17 = var15 * 512 / this.ropeLength;
              if (var17 > 255) {
                var17 = 255;
              }
              var16 = 39219 + (var17 << 16);
            }
            var17Lifetime1 = param1.a(var23.d(false), (byte) 115);
            var18 = param1.b(true, var23.g((byte) 119));
            var19 = param1.a(var10, (byte) 122);
            var20 = param1.b(true, var11);
            c.a(var18, var17Lifetime1, var19, var20, -16777216, var16);
            if (var23.l((byte) -68) >= 0) {
              var21 = param4.d((byte) -27, var23.l((byte) -102));
              if (var21 == null) {
                return;
              }
              var22 = var21.chassis.c(var23.getGrabbedComponentId(127), -97);
              if (var22 == null) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_18_0 = var8;
          stackIn_18_1 = new StringBuilder().append("lja.L(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param2 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param5).append(',').append(param6).append(')').toString());
        }
    }

    private final void a(int param0, GrapplingHook param1) {
        if (param0 != 32) {
          return;
        }
        try {
          if (this.targetRopeLength != GetMissionTerrainNebulaProbability.field_r) {
            this.targetRopeLength = GetMissionTerrainNebulaProbability.field_r;
            param1.f(true);
            param1.a(param0 ^ 86, true);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "lja.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int d(byte param0) {
        if (param0 != 126) {
          return -65;
        }
        if (1 == fra.field_a) {
          return 2048;
        }
        return GetRepairModePower.field_q;
    }

    final void a(int param0, int param1, int[] param2, int param3, int param4, int param5, int param6, byte param7, World param8, int param9, ShipBody param10) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        GrapplingHook var22 = null;
        int var23 = 0;
        int var24 = 0;
        GrapplingHook var25 = null;
        int var14Lifetime1;
        try {
          if (param7 <= 3) {
            this.ropeLength = 3;
          }
          if (-1 == this.hookId &&
            this.reload == 0) {
            var12_int = param5 + (param9 * GetNumStars.a(param4, (byte) 30) - eu.a(param4, 103) * param6 >> 16);
            var13 = param1 + (param9 * eu.a(param4, 43) + GetNumStars.a(param4, (byte) 87) * param6 >> 16);
            var14 = Lo.a(param2, -71);
            var15 = param5 + (GetNumStars.a(param4, (byte) -63) * var14 >> 16);
            var16 = (var14 * eu.a(param4, 76) >> 16) + param1;
            var17 = -var12_int + param0;
            var18 = param3 - var13;
            var19 = ecb.a(var18, (byte) -77, var17);
            var20 = GameKeyHandler.a(22433, var19 - param4);
            if (Math.abs(var20) > 256) {
              return;
            }
            this.ropeLength = bia.field_c;
            var21 = -1;
            if (param10 instanceof Ship) {
              var21 = ((Ship) (param10)).getOwner((byte) -117);
            }
            var22 = new GrapplingHook(new ShipComponent(28), param10.id, var21);
            var14Lifetime1 = Lo.a(var22.chassis.i((byte) -112).field_v, 80);
            var22.a(param4, -17);
            var23 = GetNumStars.a(param4, (byte) -127) * var14Lifetime1 >> 16;
            var24 = eu.a(param4, 77) * var14Lifetime1 >> 16;
            var22.a(var23 * 2 + var15, var24 * 2 + var16, (byte) 100);
            param8.a((byte) 67, var22);
            var22.dy = param10.dy;
            var22.dx = param10.dx;
            qba.a(20382, var15, 12, var16, 50);
            var22.a(var16, param4, var15, joa.field_a, 1948934248);
            param10.a(var16, GameKeyHandler.a(22433, param4 + 4096), var15, joa.field_a, 1948934248);
            this.hookId = var22.id;
            this.reload = pca.field_i[0].d((byte) 64);
            this.targetRopeLength = this.ropeLength;
            return;
          }
          var25 = param8.h(this.hookId, -103);
          if (var25 != null) {
            if (-1 != var25.l((byte) 123)) {
              qba.a(20382, var25.d(false), 13, var25.g((byte) -69), 50);
            }
            this.a(32, var25);
            qba.a(20382, param5, 14, param1, 50);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_20_0 = var12;
          stackIn_20_1 = new StringBuilder().append("lja.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    final static void e(byte param0) {
        String var2 = (String) null;
        SetDebrisFoundInPairs.a((String) null, SetResourceNodeCaptureTime.field_p, 0);
        if (param0 <= 11) {
          GrappleLauncherBehaviour.e((byte) 76);
        }
    }

    final void a(ShipBody param0, World param1, int param2, boolean param3, byte param4, int param5, int param6, int[] param7) {
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17_int = 0;
        ShipBody var17 = null;
        int var18_int = 0;
        ShipComponent var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21_int = 0;
        long var21 = 0L;
        long var23 = 0L;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        GrapplingHook var33 = null;
        int var10Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        var32 = VoidHunters.field_G;
        try {
          var33 = param1.h(this.hookId, -126);
          if (var33 == null) {
            if (this.hookId != -1) {
              this.hookId = -1;
              param0.d((byte) -85);
            }
            if (this.reload > 0) {
              this.reload = this.reload - 1;
              param0.d((byte) 40);
            }
          } else {
            param0.d((byte) -74);
            var10 = Lo.a(param7, -82);
            var11 = param5 + (var10 * GetNumStars.a(param6, (byte) -125) >> 16);
            var12 = param2 + (var10 * eu.a(param6, 39) >> 16);
            var13 = var33.d(false) - var11;
            var14 = var33.g((byte) -54) - var12;
            var15 = ar.a(var13, (byte) 114, var14);
            var16 = var15 - this.ropeLength;
            if (var16 > 0) {
              var13 = (var13 << 8) / this.ropeLength;
              var14 = (var14 << 8) / this.ropeLength;
              var17_int = var16 / Math.max(1, this.ropeLength >> 8);
              if (CarouselSlotStateDump.field_i < var15) {
                var33.chassis.a(var33.chassis.i((byte) -112).field_p, (byte) -109);
              } else {
                if (var17_int > nra.field_b) {
                  var17_int = nra.field_b;
                  var16 = var17_int * this.ropeLength >> 8;
                }
                var18_int = (var16 * SetPointDefenceLaserEnergyUsed.field_o >> 8) * var13;
                var19 = var18_int >> 8;
                var20 = var14 * (SetPointDefenceLaserEnergyUsed.field_o * var16 >> 8);
                var21_int = var20 >> 8;
                var33.a(-var21_int, var33.d(false), var33.g((byte) 122), (byte) -128, -var19);
                param0.a(var21_int, var11, var12, (byte) -117, var19);
                if (-1 == var33.l((byte) -106)) {
                  this.a(32, var33);
                }
              }
            }
            if (var33.l((byte) 120) >= 0) {
              var17 = param1.d((byte) -27, var33.l((byte) 121));
              if (var17 == null) {
                var33.f(true);
                return;
              }
              var18 = var17.chassis.c(var33.getGrabbedComponentId(-109), -121);
              if (var18 == null) {
                var33.f(true);
                return;
              }
              if (this.targetRopeLength > bia.field_c >> 1) {
                this.targetRopeLength = bia.field_c >> 1;
              }
              var19Lifetime1 = eu.a(var18.finalangle, 126);
              var20Lifetime1 = GetNumStars.a(var18.finalangle, (byte) -76);
              var21 = (long)var18.finalx + ((long)var20Lifetime1 * (long)var33.o(23463) - (long)var33.getGrabbedComponentOffsety(32) * (long)var19Lifetime1 >> 16);
              var23 = (long)var18.finaly + ((long)var33.o(23463) * (long)var19Lifetime1 + (long)var33.getGrabbedComponentOffsety(32) * (long)var20Lifetime1 >> 16);
              var25 = (int)var21 - var33.d(false);
              var26 = (int)var23 - var33.g((byte) -29);
              var27 = var33.c((byte) -121) - var17.c((byte) -112);
              var28 = var33.f(0) - var17.f(0);
              var29 = Math.min(var33.e(false), var17.e(false) / 4);
              var30 = (var25 - var27) * var29 / 2;
              var31 = (-var28 + var26) * var29 / 2;
              var33.a(var31, var33.d(false), var33.g((byte) 124), (byte) -118, var30);
              var17.a(-var31, (int)var21, (int)var23, (byte) -123, -var30);
            }
            if (this.ropeLength > this.targetRopeLength) {
              this.ropeLength = this.ropeLength - PacketBuffer.field_d;
              if (this.targetRopeLength > this.ropeLength) {
                this.ropeLength = this.targetRopeLength;
              }
              if (this.targetRopeLength == GetMissionTerrainNebulaProbability.field_r &&
                0 <= var33.l((byte) -34)) {
                var33.f(true);
                var33.dx = 0;
                var33.dy = 0;
              }
            }
            if (param3) {
              var33.chassis.a(var33.chassis.i((byte) -112).field_p, (byte) -114);
            }
          }
          var10Lifetime1 = 51 % ((param4 - 69) / 57);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_41_0 = var9;
          stackIn_41_1 = new StringBuilder().append("lja.N(");
          if (param0 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          stackIn_44_1 = ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          stackIn_47_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_41_0), ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        int var1 = 87 % ((46 - param0) / 63);
        field_c = null;
    }

    public final void b(faa param0, int param1) {
        try {
          param0.a(-632, this.hookId, 32);
          if (param1 >= -109) {
            this.ropeLength = -1;
          }
          param0.a(-632, this.targetRopeLength, 32);
          param0.a(-632, this.ropeLength, 32);
          param0.a(-632, this.reload, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "lja.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean b(byte param0) {
        if (param0 != -113) {
          return true;
        }
        return this.hookId == -1 ? true : false;
    }

    public GrappleLauncherBehaviour() {
        this.hookId = -1;
    }

    final int a(byte param0) {
        if (param0 != 12) {
          field_d = -53;
        }
        return dla.field_c;
    }

    final void a(World param0, int param1) {
        GrapplingHook var3 = null;
        World var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param1 != 19278) {
            var4 = (World) null;
            this.a(-123, (lta) null, (int[]) null, -18, (World) null, 75, 40);
          }
          var3 = param0.h(this.hookId, 101);
          if (var3 != null) {
            var3.n(620);
            this.hookId = -1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("lja.I(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        GrappleLauncherBehaviour var5 = null;
        try {
          var5 = (GrappleLauncherBehaviour) (other);
          if (obfuscationGuard > -19) {
            return;
          }
          var4 = 0;
          if (var5.hookId != this.hookId) {
            var4 = 1;
            System.out.println("int hook_id has changed. before=" + var5.hookId + ", now=" + this.hookId);
          }
          if (var5.targetRopeLength != this.targetRopeLength) {
            System.out.println("int target_rope_length has changed. before=" + var5.targetRopeLength + ", now=" + this.targetRopeLength);
            var4 = 1;
          }
          if (var5.ropeLength != this.ropeLength) {
            System.out.println("int rope_length has changed. before=" + var5.ropeLength + ", now=" + this.ropeLength);
            var4 = 1;
          }
          if (var5.reload != this.reload) {
            System.out.println("int reload has changed. before=" + var5.reload + ", now=" + this.reload);
            var4 = 1;
          }
          if (var4 != 0) {
            System.out.println("This instance of GrappleLauncherBehaviour has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("lja.F(");
          if (other == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
          this.hookId = param0.i(0, 32);
          this.targetRopeLength = param0.i(0, 32);
          this.ropeLength = param0.i(0, 32);
          this.reload = param0.i(0, 32);
          if (param1) {
            this.reload = -16;
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "lja.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        GrappleLauncherBehaviour var4 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          var3_int = -37 % ((param0 - 22) / 59);
          var4 = (GrappleLauncherBehaviour) (param1);
          stackIn_7_0 = (this.hookId != var4.hookId) || (var4.targetRopeLength != this.targetRopeLength) || (this.ropeLength != var4.ropeLength) || (this.reload != var4.reload);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("lja.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    public final void b(byte param0, tv param1) {
        GrappleLauncherBehaviour var6 = null;
        GrappleLauncherBehaviour var7 = null;
        try {
          var6 = (GrappleLauncherBehaviour) (param1);
          var7 = var6;
          var7.targetRopeLength = this.targetRopeLength;
          if (param0 <= 54) {
            ShipBody var4 = (ShipBody) null;
            this.a(-126, -1, (int[]) null, -127, 86, -67, -61, (byte) 75, (World) null, -84, (ShipBody) null);
          }
          var7.hookId = this.hookId;
          var7.reload = this.reload;
          var7.ropeLength = this.ropeLength;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "lja.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Win by destroying the enemy VIP";
        field_b = 80;
        field_d = 1;
    }
}
