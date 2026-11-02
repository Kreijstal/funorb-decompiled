/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BodyInZoneCondition extends MissionCondition implements DiffableState, hd {
    static String field_c;
    private int bodyId;
    private int zoneId;

    public final void a(faa param0, boolean param1) {
        try {
          super.a(param0, param1);
          if (param1) {
            field_c = (String) null;
          }
          this.bodyId = param0.i(0, 32);
          this.zoneId = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "iia.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final ucb[] a(World param0, int param1) {
        ShipBody var3 = null;
        RuntimeException var3_ref = null;
        MapZone var4 = null;
        ShipBody var5 = null;
        ucb[] stackIn_5_0 = null;
        ucb[] stackIn_12_0 = null;
        ucb[] stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -20605) {
            this.a((faa) null, true);
          }
          var5 = param0.d((byte) -27, this.bodyId);
          var3 = var5;
          var4 = param0.e((byte) -126, this.zoneId);
          if (var3 != null &&
            var4 != null) {
            stackIn_5_0 = new ucb[]{new ucb(var5.d(false), var5.g((byte) 124)), new ucb(var4.x, var4.y)};
            return stackIn_5_0;
          }
          if (var3 != null &&
            var4 == null) {
            stackIn_14_0 = new ucb[]{new ucb(var5.d(false), var5.g((byte) 123))};
            return stackIn_14_0;
          }
          if (var4 == null) {
            return null;
          }
          stackIn_12_0 = new ucb[]{new ucb(var4.x, var4.y)};
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("iia.I(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        int var2;
        int var2Lifetime1;
        if (param1 == 0) {
          return 0;
        }
        if (param1 > 0) {
          var2 = 1;
          if (65535 < param1) {
            var2 += 16;
            param1 = param1 >> 16;
          }
          if (param1 > 255) {
            var2 += 8;
            param1 = param1 >> 8;
          }
          if (param1 > 15) {
            param1 = param1 >> 4;
            var2 += 4;
          }
          if (param1 > 3) {
            param1 = param1 >> 2;
            var2 += 2;
          }
          if (param1 > 1) {
            var2++;
            param1 = param1 >> 1;
          }
          return var2;
        }
        if (param0 >= -59) {
          field_c = (String) null;
        }
        var2Lifetime1 = 2;
        if (param1 < -65536) {
          var2Lifetime1 += 16;
          param1 = param1 >> 16;
        }
        if (param1 < -256) {
          var2Lifetime1 += 8;
          param1 = param1 >> 8;
        }
        if (param1 < -16) {
          var2Lifetime1 += 4;
          param1 = param1 >> 4;
        }
        if (param1 < -4) {
          param1 = param1 >> 2;
          var2Lifetime1 += 2;
        }
        if (param1 < -2) {
          param1 = param1 >> 1;
          var2Lifetime1++;
        }
        return var2Lifetime1;
    }

    public final boolean a(byte param0, tv param1) {
        BodyInZoneCondition var3 = null;
        int var4 = 0;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var4 = -96 % ((param0 - 22) / 59);
          var3 = (BodyInZoneCondition) (param1);
          stackIn_6_0 = (super.a((byte) -126, param1)) || (var3.bodyId != this.bodyId) || (this.zoneId != var3.zoneId);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("iia.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final int[] a(World param0, int param1, int[] param2) {
        int var7 = 0;
        MapZone var4 = null;
        Ship[] var5 = null;
        Ship[] var6 = null;
        Ship var8 = null;
        int var9 = 0;
        int[] stackIn_6_0 = null;
        int[] stackIn_9_0 = null;
        int[] stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var9 = VoidHunters.field_G;
        try {
          if (param1 <= 16) {
            this.zoneId = 118;
          }
          var4 = param0.e((byte) -74, this.zoneId);
          if (var4 == null) {
            stackIn_6_0 = (int[]) (param2);
            return stackIn_6_0;
          }
          if (-1 != this.bodyId) {
            stackIn_9_0 = SetAutozoomSpeedDivide.a(this.bodyId, true, param2, (byte) -14);
            return stackIn_9_0;
          }
          var5 = param0.getShips(1000);
          var6 = var5;
          for (var7 = 0; var7 < var6.length; var7++) {
            var8 = var6[var7];
            if (var8 != null &&
              var4.a(var8.g((byte) 121), var8.d(false), (byte) -98)) {
              param2 = SetAutozoomSpeedDivide.a(var8.getId(false), true, param2, (byte) -14);
            }
          }
          stackIn_21_0 = (int[]) (param2);
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_24_0 = var4_ref;
          stackIn_24_1 = new StringBuilder().append("iia.J(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    public final int[] a(int param0, int[] param1) {
        RuntimeException var3 = null;
        int[] stackIn_2_0 = null;
        int[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 99) {
            stackIn_2_0 = (int[]) null;
            return stackIn_2_0;
          }
          if (this.bodyId >= 0) {
            param1 = SetAutozoomSpeedDivide.a(this.bodyId, true, param1, (byte) -14);
          }
          stackIn_6_0 = (int[]) (param1);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("iia.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final int a(byte param0, int param1) {
        if (param0 > -102) {
          field_c = (String) null;
        }
        if (param1 != 0) {
          return this.zoneId;
        }
        return this.bodyId;
    }

    final static boolean a(int param0, int param1, boolean param2, int param3) {
        if (0 <= param0 &&
          param0 <= 11) {
          if (!param2) {
            return true;
          }
          if (param1 < 1) {
            return false;
          }
          if (param1 <= GetCountermeasuresPulsetime.a(param3, false, param0)) {
            return true;
          }
          return false;
        }
        return false;
    }

    final void a(World param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_7_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var5_intLifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        var9 = VoidHunters.field_G;
        try {
          if (param1 != -2) {
            return;
          }
          if (param2 != 0) {
            stackIn_17_0 = (this.zoneId >= param3) ? -1 : 1;
            var5_int = stackIn_17_0;
            var6 = 50;
            var7 = var6 * var5_int + param3;
            var8 = param3;
            while (true) {
              if (var7 == var8) {
                return;
              }
              if (null == param0.e((byte) -99, var8)) {
                var8 = var8 + var5_int;
                continue;
              }
              break;
            }
            this.zoneId = var8;
            return;
          }
          stackIn_7_0 = (this.bodyId >= param3) ? -1 : 1;
          var5_intLifetime1 = stackIn_7_0;
          var6Lifetime1 = 50;
          var7Lifetime1 = var6Lifetime1 * var5_intLifetime1 + param3;
          var8Lifetime1 = param3;
          while (true) {
            if (var7Lifetime1 == var8Lifetime1) {
              return;
            }
            if (param0.d((byte) -27, var8Lifetime1) == null &&
              var8Lifetime1 != -1) {
              var8Lifetime1 = var8Lifetime1 + var5_intLifetime1;
              continue;
            }
            break;
          }
          this.bodyId = var8Lifetime1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_25_0 = var5;
          stackIn_25_1 = new StringBuilder().append("iia.E(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public final void reportDifferences(tv other, int obfuscationGuard) {
        BodyInZoneCondition var3 = null;
        int var4 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (obfuscationGuard >= -19) {
            field_c = (String) null;
          }
          var3 = (BodyInZoneCondition) (other);
          super.reportDifferences(other, -37);
          var4 = 0;
          if (var3.bodyId != this.bodyId) {
            var4 = 1;
            System.out.println("int body_id has changed. before=" + var3.bodyId + ", now=" + this.bodyId);
          }
          if (this.zoneId != var3.zoneId) {
            System.out.println("int zone_id has changed. before=" + var3.zoneId + ", now=" + this.zoneId);
            var4 = 1;
          }
          if (var4 != 0) {
            System.out.println("This instance of MissionConditionBodyInMapZone has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("iia.F(");
          if (other == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final String a(int param0) {
        String var2 = "Body " + this.bodyId;
        if (this.bodyId == -1) {
          var2 = "Any ship";
        }
        if (param0 != -1) {
          this.a((byte) 14, (tv) null);
        }
        return var2 + " in map zone " + this.zoneId;
    }

    public final void b(faa param0, int param1) {
        try {
          super.b(param0, -125);
          if (param1 > -109) {
            this.bodyId = 10;
          }
          param0.a(-632, this.bodyId, 32);
          param0.a(-632, this.zoneId, 32);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "iia.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean a(int param0, MissionState param1, World param2) {
        int var7 = 0;
        MapZone var4 = null;
        RuntimeException var4_ref = null;
        Ship[] var5 = null;
        Ship[] var6 = null;
        Ship var8 = null;
        int var9 = 0;
        ShipBody var10 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = VoidHunters.field_G;
        try {
          var4 = param2.e((byte) -121, this.zoneId);
          if (var4 == null) {
            return false;
          }
          if (param0 != ~this.bodyId) {
            var10 = param2.d((byte) -27, this.bodyId);
            if (var10 != null) {
              stackIn_9_0 = var4.a(var10.g((byte) -62), var10.d(false), (byte) -98);
              return stackIn_9_0;
            }
            return false;
          }
          var5 = param2.getShips(1000);
          var6 = var5;
          for (var7 = 0; var7 < var6.length; var7++) {
            var8 = var6[var7];
            if (var8 != null &&
              var4.a(var8.g((byte) 124), var8.d(false), (byte) -98)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_21_0 = var4_ref;
          stackIn_21_1 = new StringBuilder().append("iia.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          stackIn_24_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',');
          if (param2 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    BodyInZoneCondition() {
    }

    public static void b(int param0) {
        if (param0 != -15818) {
          BodyInZoneCondition.a(-54, 46, true, 51);
        }
        field_c = null;
    }

    BodyInZoneCondition(int param0, int param1) {
        this.bodyId = param0;
        this.zoneId = param1;
    }

    public final void b(byte param0, tv param1) {
        BodyInZoneCondition var5 = null;
        BodyInZoneCondition var6 = null;
        try {
          if (param0 <= 54) {
            this.bodyId = -91;
          }
          super.b((byte) 66, param1);
          var5 = (BodyInZoneCondition) (param1);
          var6 = var5;
          var6.zoneId = this.zoneId;
          var6.bodyId = this.bodyId;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "iia.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
