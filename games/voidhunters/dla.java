/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dla {
    private lta field_b;
    static llb field_e;
    static int field_d;
    private int field_a;
    static int field_c;
    private World field_f;

    final static int a(int param0) {
        int var1 = -61 % ((47 - param0) / 45);
        return cd.field_c;
    }

    private final void a(boolean param0, Random param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        Ship var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = GetRepairModeRadius.a(-99, 0, za.c((byte) -93), param1);
          if (!param0 && (var5_int == 2 ||
            var5_int == 1)) {
            var5_int = 2 + var5_int;
          }
          var6 = t.a(var5_int, (byte) 94);
          var6.a(new ShipAI(), 4);
          var6.h(17704, param3);
          if (param2 > -26) {
            return;
          }
          var7 = -this.field_f.getWidth((byte) -122) / 2 + hob.a(param1, this.field_f.getWidth((byte) -122), 119);
          var8 = -this.field_f.m(1) / 2 + hob.a(param1, this.field_f.m(1), 120);
          var6.a(var7, var8, (byte) -72);
          var6.a(hob.a(param1, 8192, 126), -85);
          this.field_f.a(var6, (byte) 125);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_11_0 = runtimeException;
          stackIn_11_1 = new StringBuilder().append("dla.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static String c(int param0) {
        if (null == kca.field_a) {
          return "";
        }
        if (param0 <= 106) {
          field_d = 106;
        }
        return kca.field_a;
    }

    final void a(boolean param0, byte param1) {
        int var9_int = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        Debris[] var7;
        Debris var7_ref;
        int var8;
        String var9;
        int var10;
        Debris var10_ref_nbb;
        int var11;
        ShipComponent var11_ref_ml;
        int var12;
        String var12_ref_String;
        int var13;
        int var14;
        int var15;
        int var16;
        Debris[] var17;
        Debris var18;
        int var8Lifetime1;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        Debris var7_refLifetime1;
        Debris var18Lifetime1;
        Debris var7_refLifetime2;
        Debris var18Lifetime2;
        var16 = VoidHunters.field_G;
        var3 = this.field_b.a(true, GetBombletSprayEnergyUsed.field_p.width) - this.field_b.a(true, 0);
        var4 = this.field_b.a(0, GetBombletSprayEnergyUsed.field_p.height) - this.field_b.a(0, 0);
        if (var3 != this.field_f.getWidth((byte) -122)) {
          this.field_f.a(var3, (byte) 113);
          this.field_f.e(var4, 0);
        } else {
          if (this.field_f.m(1) != var4) {
            this.field_f.a(var3, (byte) 113);
            this.field_f.e(var4, 0);
          }
        }
        this.field_b.field_e = GetBombletSprayEnergyUsed.field_p.height / 2;
        this.field_b.field_d = GetBombletSprayEnergyUsed.field_p.width / 2;
        this.field_b.a(GetBombletSprayEnergyUsed.field_p.height, 0, -72, GetBombletSprayEnergyUsed.field_p.width, 0);
        hna.a(this.field_f, this.field_b, false, (byte) -59);
        this.field_f.a(this.field_b, (byte) 85, this.field_a, (Ship) null);
        var5 = this.field_b.a(true, GetUseDetailLines.field_o);
        var6 = this.field_b.a(0, GetTorpedoReload.field_q);
        if (param0 && (GetUseDetailLines.field_o != -1 ||
          GetTorpedoReload.field_q != -1)) {
          var17 = this.field_f.getDebris((byte) -33);
          var7 = var17;
          var8 = -66 % ((param1 + 62) / 63);
          for (var9_int = 0; var9_int < var17.length; var9_int++) {
            var10_ref_nbb = var17[var9_int];
            var18 = var10_ref_nbb;
            var7_ref = var18;
            var18Lifetime2 = var10_ref_nbb;
            var7_refLifetime2 = var18Lifetime2;
            if (var10_ref_nbb != null) {
              var11_ref_ml = var10_ref_nbb.chassis.a(var6, var5, true);
              if (var11_ref_ml != null) {
                var12_ref_String = me.a(var11_ref_ml, (byte) 72);
                var13 = var11_ref_ml.getFinalx(true);
                var14 = var11_ref_ml.getFinaly((byte) 111);
                var15 = this.field_b.a(var13, (byte) 115);
                GetLagStandardDeviationOut.a(1, var12_ref_String, 16777215, this.field_b.b(true, -10000 + var14), -(GetPhasedEnergyBeamProjectiles.a(112, var12_ref_String) >> 1) + var15, 4266);
                c.a(this.field_b.b(true, var14), var15, -(GetPhasedEnergyBeamProjectiles.a(-77, var12_ref_String) >> 2) + var15, this.field_b.b(true, -10000 + var14), -16777216, 16777215);
                return;
              }
            }
          }
          var18Lifetime1 = this.field_f.a(true, var6, var5, var5, var6);
          var7_refLifetime1 = var18Lifetime1;
          if (var18Lifetime1 != null) {
            var8Lifetime1 = var18Lifetime1.g(-71) << 2;
            var9 = me.a(var18Lifetime1.chassis, (byte) 106);
            var10 = var18Lifetime1.chassis.getFinalx(true);
            var11 = -var5 + var10;
            var12 = var18Lifetime1.chassis.getFinaly((byte) 104);
            var13Lifetime1 = -var6 + var12;
            var14Lifetime1 = ar.a(var11, (byte) 106, var13Lifetime1);
            if (var14Lifetime1 <= var8Lifetime1) {
              var15Lifetime1 = this.field_b.a(var10, (byte) 116);
              GetLagStandardDeviationOut.a(1, var9, 16777215, this.field_b.b(true, -10000 + var12), -(GetPhasedEnergyBeamProjectiles.a(-51, var9) >> 1) + var15Lifetime1, 4266);
              c.a(this.field_b.b(true, var12), var15Lifetime1, -(GetPhasedEnergyBeamProjectiles.a(-100, var9) >> 2) + var15Lifetime1, this.field_b.b(true, -10000 + var12), -16777216, 16777215);
            }
          }
          return;
        }
    }

    final void b(int param0) {
        int stackIn_16_0 = 0;
        MissionState var3;
        MessageLog var4;
        Ship[] var5;
        Debris[] var5_array;
        int var6;
        int var7_int;
        Object var7;
        Ship[] var8;
        int var9;
        Ship var10_ref_sg;
        int var10;
        int var11;
        int var12;
        lta var13;
        Ship[] var14;
        Debris[] var15;
        Player[] var16;
        Random var17;
        Random var18;
        int var6Lifetime1;
        int var7_intLifetime1;
        int var9Lifetime1;
        var12 = VoidHunters.field_G;
        var13 = (lta) null;
        GetReverbWidth.a((lta) null, -8077);
        ka.a(this.field_a, -19266);
        var16 = new Player[]{};
        var3 = new MissionState();
        var4 = new MessageLog();
        this.field_f.a(1799937864, true, var4, var16, var3, this.field_a, var16);
        this.field_a = this.field_a + 1;
        if (this.field_f.f(0, param0 - 13766) == 0 ||
          this.field_f.f(1, -13766) == 0) {
          var5 = this.field_f.getShips(1000);
          var6 = 0;
          var7_int = 1;
          var14 = var5;
          var8 = var14;
          var9 = 0;
          scanLoop1: while (true) {
            if (var14.length > var9) {
              var10_ref_sg = var14[var9];
              if (var10_ref_sg != null &&
                var10_ref_sg.getTeam((byte) 78) < SetMissionTerrainAsteroidProbability.field_p) {
                var6 = mjb.b(param0 ^ 21957, var10_ref_sg.getTeam((byte) 102));
                if (1 == var10_ref_sg.chassis.getComponentTypeId(0)) {
                  var7_int = 0;
                  break scanLoop1;
                }
                if (var10_ref_sg.chassis.getComponentTypeId(0) == 2) {
                  var7_int = 0;
                  break scanLoop1;
                }
                stackIn_16_0 = 1;
                var7_int = stackIn_16_0;
                break scanLoop1;
              }
              var9++;
              continue;
            }
            break;
          }
          var17 = new Random();
          this.a(var7_int != 0, var17, param0 - 121, var6);
        }
        Debris[] dupTemp$0 = this.field_f.getDebris((byte) -33);
        var15 = dupTemp$0;
        var5_array = dupTemp$0;
        var6Lifetime1 = param0;
        for (var7_intLifetime1 = 0; var7_intLifetime1 < var15.length; var7_intLifetime1++) {
          if (null != var15[var7_intLifetime1]) {
            var6Lifetime1++;
          }
        }
        if (var6Lifetime1 > 100) {
          var7 = null;
          var18 = new Random();
          var9Lifetime1 = hob.a(var18, var6Lifetime1, 118);
          var10 = 0;
          var11 = 0;
          while (true) {
            boolean decompiledFrameRemainder0 = true;
            if (var15.length > var11) {
              if (var15[var11] != null) {
                if (var10 == var9Lifetime1) {
                  var7 = var15[var11];
                  decompiledFrameRemainder0 = false;
                }
                else {
                  var10++;
                }
              }
              if (decompiledFrameRemainder0) {
                var11++;
                continue;
              }
            }
            if (var7 == null) {
              break;
            }
            this.field_f.a(-118, 1, (ShipBody) (var7));
            break;
          }
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    public static void a(byte param0) {
        if (param0 != 101) {
          return;
        }
        field_e = null;
    }

    final static boolean a(int param0, boolean param1, int param2, int param3) {
        int var4;
        int var5;
        int var6;
        if (param1) {
          if (GetLaserEnergyUsed.field_o[param3] < GetLaserEnergyUsed.field_o[param2]) {
            return true;
          }
          if (GetLaserEnergyUsed.field_o[param3] > GetLaserEnergyUsed.field_o[param2]) {
            return false;
          }
          if (SetRespawnTime.field_o[param2] > SetRespawnTime.field_o[param3]) {
            return true;
          }
          if (SetRespawnTime.field_o[param3] > SetRespawnTime.field_o[param2]) {
            return false;
          }
        } else {
          if (SetRespawnTime.field_o[param3] < SetRespawnTime.field_o[param2]) {
            return true;
          }
          if (SetRespawnTime.field_o[param2] < SetRespawnTime.field_o[param3]) {
            return false;
          }
          if (GetLaserEnergyUsed.field_o[param2] > GetLaserEnergyUsed.field_o[param3]) {
            return true;
          }
          if (GetLaserEnergyUsed.field_o[param3] > GetLaserEnergyUsed.field_o[param2]) {
            return false;
          }
        }
        var4 = -73 / ((param0 - 73) / 52);
        var5 = GetMissionVariablesHudY.field_o[param3] + hma.field_d[param3] + SetPhasedEnergyBeamRandomness.field_o[param3];
        var6 = SetPhasedEnergyBeamRandomness.field_o[param2] - (-hma.field_d[param2] - GetMissionVariablesHudY.field_o[param2]);
        if (var6 > var5) {
          return true;
        }
        if (var5 > var6) {
          return false;
        }
        return !(param2 <= param3);
    }

    dla() {
        int var4 = 0;
        Exception exception = null;
        int var1 = 0;
        int var2 = 0;
        Random var3 = null;
        Ship var5_ref_sg = null;
        int var5 = 0;
        int var6 = 0;
        Asteroid var9 = null;
        int[] var12 = null;
        Throwable decompiledCaughtException = null;
        this.field_f = new World(0);
        this.field_b = new lta();
        var1 = this.field_b.a(true, GetBombletSprayEnergyUsed.field_p.width) - this.field_b.a(true, 0);
        var2 = this.field_b.a(0, GetBombletSprayEnergyUsed.field_p.height) - this.field_b.a(0, 0);
        this.field_f.a(var1, (byte) -93);
        this.field_f.e(var2, 0);
        var3 = new Random();
        if (null != es.field_b &&
          null != es.field_b.blueprint) {
          try {
            var12 = es.field_b.blueprint.description;
            var5_ref_sg = ae.a(var12, (byte) 45);
            var5_ref_sg.h(17704, 3);
            var5_ref_sg.a(new ShipAI(), 4);
            var5_ref_sg.a(hob.a(var3, 8192, 122), -67);
            this.field_f.a(var5_ref_sg, (byte) 107);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
            es.field_b.blueprint = null;
            GetMissionResnetResourceTickTime.e((byte) -111);
            gna.a((Throwable) ((Object) exception), "player_gamedata version " + es.field_b.version + " blueprint is corrupted", 0);
          }
        } else {
          for (var4 = 0; var4 < 2; var4++) {
            var5 = var4 % 2;
            this.a(false, var3, -99, var5);
          }
        }
        var9 = new Asteroid(new ShipComponent(49));
        var5 = -this.field_f.getWidth((byte) -122) / 2 + hob.a(var3, this.field_f.getWidth((byte) -122), 120);
        var6 = -this.field_f.m(1) / 2 + hob.a(var3, this.field_f.m(1), 123);
        var9.a(var5, var6, (byte) 43);
        this.field_f.a((byte) 126, var9);
    }

    static {
        field_c = 1024;
        field_d = 4;
    }
}
