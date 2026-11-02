/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PartitionZoneList implements DiffableState, ofa {
    private int field_b;
    private PartitionZone[] zones;

    public final void reportDifferences(tv other, int obfuscationGuard) {
        PartitionZoneList var3 = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          var3 = (PartitionZoneList) (other);
          tja.a(var3.zones, 1, this.zones, false, 5547);
          if (obfuscationGuard > -19) {
            this.zones = (PartitionZone[]) null;
          }
          var4 = 0;
          if (SetCountermeasureLauncherAimspeed.a(var3.zones, false, 1, this.zones, -57)) {
            var4 = 1;
            System.out.println("PartitionZone[] zones has changed. ");
          }
          if (var4 != 0) {
            System.out.println("This instance of PartitionZoneList has changed");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("cda.F(");
          if (other == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5;
        var5 = VoidHunters.field_G;
        if (null != this.zones) {
          for (var4 = 0; var4 < this.zones.length; var4++) {
            if (~param1 == ~this.zones[var4].type) {
              this.zones[var4].b(11964, param0);
              this.a(-104);
            }
          }
        }
        if (param2 != -21) {
          this.zones = (PartitionZone[]) null;
        }
    }

    final PartitionZone a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6;
        var6 = VoidHunters.field_G;
        for (var5 = 0; var5 < this.zones.length; var5++) {
          if (param2 == this.zones[var5].gridx &&
            param3 == this.zones[var5].gridy &&
            this.zones[var5].type == param1) {
            return this.zones[var5];
          }
        }
        if (param0 >= 98) {
          return null;
        }
        this.a(83);
        return null;
    }

    public final void a(faa param0, boolean param1) {
        try {
          this.zones = (PartitionZone[]) (SetAutoDetail.a(8, dp.field_b, param0, 1, -76, this.zones));
          if (param1) {
            this.a(-8);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "cda.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        if (param0 < 54) {
          this.field_b = -73;
        }
        PartitionZoneList var3 = (PartitionZoneList) (param1);
        if (this.field_b == var3.field_b) {
          return;
        }
        try {
          var3.field_b = this.field_b;
          var3.zones = (PartitionZone[]) (sqb.a(var3.zones, this.zones, 1, dp.field_b, false));
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "cda.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public final void b(faa param0, int param1) {
        int var7 = 0;
        faa var3 = null;
        PartitionZone[] var4 = null;
        int var5 = 0;
        PartitionZone[] var6 = null;
        PartitionZone var8 = null;
        int var9 = 0;
        int stackIn_6_0 = 0;
        faa stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        boolean stackIn_13_2 = false;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var9 = VoidHunters.field_G;
        try {
          var3 = param0;
          if (param1 > -109) {
            return;
          }
          var4 = this.zones;
          if (var4 == null) {
            stackIn_6_0 = 0;
          } else {
            stackIn_6_0 = var4.length;
          }
          var5 = stackIn_6_0;
          var3.a(-632, var5, 8);
          if (var5 != 0) {
            var6 = var4;
            for (var7 = 0; var7 < var6.length; var7++) {
              var8 = var6[var7];
              stackIn_12_0 = var3;
              stackIn_12_1 = 46;
              stackIn_13_2 = (var8 != null);
              if (vq.a(stackIn_12_0, stackIn_12_1, stackIn_13_2)) {
                GetComponentBreakingExplosionForceMultiplier.a(2, 1, var3, var8);
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("cda.B(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, String param1, String param2) {
        if (param0 > -11) {
          return;
        }
        try {
          kma.a(param1, false, -17833, param2);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "cda.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final boolean a(byte param0, tv param1) {
        PartitionZoneList var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        boolean stackIn_1_0 = false;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = 107 / ((22 - param0) / 59);
          var3 = (PartitionZoneList) (param1);
          stackIn_1_0 = SetCountermeasureLauncherAimspeed.a(var3.zones, false, 1, this.zones, 3);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_4_0 = var3_ref;
          stackIn_4_1 = new StringBuilder().append("cda.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(')').toString());
        }
    }

    final PartitionZone a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6;
        PartitionZone var7;
        var6 = VoidHunters.field_G;
        if (null != this.zones) {
          for (var5 = 0; var5 < this.zones.length; var5++) {
            if (this.zones[var5].gridx == param1 &&
              param2 == this.zones[var5].gridy &&
              param3 == this.zones[var5].type) {
              return this.zones[var5];
            }
          }
        }
        var7 = new PartitionZone(param1, param2, param3);
        if (param0 <= 118) {
          this.field_b = -59;
        }
        this.zones = (PartitionZone[]) (qlb.a(this.zones, var7, dp.field_b, true, true, 1));
        this.a(125);
        return var7;
    }

    final void a(int param0) {
        int fieldTemp$0 = ggb.field_a;
        ggb.field_a = ggb.field_a + 1;
        this.field_b = fieldTemp$0;
        int var2 = -124 % ((-66 - param0) / 32);
    }

    PartitionZoneList() {
        this.field_b = 0;
        this.a(-33);
    }

    final boolean b(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        int var7;
        var7 = VoidHunters.field_G;
        if (param1 != -6775) {
          this.zones = (PartitionZone[]) null;
        }
        var5 = -1;
        var6 = 0;
        while (this.zones.length > var6) {
          if (~param3 == ~this.zones[var6].gridx &&
            this.zones[var6].gridy == param2 &&
            this.zones[var6].type == param0) {
            var5 = var6;
          } else {
            var6++;
            continue;
          }
          break;
        }
        if (var5 == -1) {
          return false;
        }
        this.zones = (PartitionZone[]) (GetSalvoUsesAllEnergy.a(dp.field_b, var5, 15667, this.zones));
        this.a(-100);
        if (this.zones != null &&
          this.zones.length != 0) {
          return false;
        }
        return true;
    }

    static {
    }
}
