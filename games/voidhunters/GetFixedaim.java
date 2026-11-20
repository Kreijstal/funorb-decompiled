/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class GetFixedaim extends ConsoleCommand {
    static GameStateFactory field_q;
    static int field_p;
    static int field_o;

    final static dj g(byte param0) {
        if (param0 != -65) {
          GetFixedaim.g((byte) 0);
        }
        return new dj(GetPointDefenceLaserRandomness.a(param0 + 117), RandomLinesTextureOperation.e((byte) -34));
    }

    GetFixedaim(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9_ref_int__ = null;
        int var9 = 0;
        int[] var10_ref_int__ = null;
        int var10 = 0;
        int var11_int = 0;
        int[] var11 = null;
        int var12_int = 0;
        int[] var12 = null;
        int var13 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var13 = VoidHunters.field_G;
        try {
          if (param4 != 2) {
            GetFixedaim.f((byte) -69);
          }
          var5_int = 0;
          var6 = param3;
          var7 = -param3;
          GetSalvoRepairTimeMultiplier.fillArraySpan(param0, param3 + param1, ResourceNode.field_b[param2], (byte) 75, param1 - param3);
          var8 = -1;
          while (var6 > var5_int) {
            var8 += 2;
            var7 = var7 + var8;
            var5_int++;
            if (var7 >= 0) {
              var6--;
              var7 = var7 - (var6 << 1);
              var9_ref_int__ = ResourceNode.field_b[param2 + var6];
              var10_ref_int__ = ResourceNode.field_b[-var6 + param2];
              var11_int = param1 + var5_int;
              var12_int = param1 - var5_int;
              GetSalvoRepairTimeMultiplier.fillArraySpan(param0, var11_int, var9_ref_int__, (byte) 75, var12_int);
              GetSalvoRepairTimeMultiplier.fillArraySpan(param0, var11_int, var10_ref_int__, (byte) 75, var12_int);
            }
            var9 = param1 + var6;
            var10 = -var6 + param1;
            var11 = ResourceNode.field_b[var5_int + param2];
            var12 = ResourceNode.field_b[-var5_int + param2];
            GetSalvoRepairTimeMultiplier.fillArraySpan(param0, var9, var11, (byte) 75, var10);
            GetSalvoRepairTimeMultiplier.fillArraySpan(param0, var9, var12, (byte) 75, var10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) var5), "wlb.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void clearSharedReferences(byte param0) {
        if (param0 != -70) {
          field_o = -17;
        }
        field_q = null;
    }

    final static void f(byte param0) {
        class $CfrPartitionedState {
            int var1_int;
            int var2;
            int var3;
            int var4;
            long var4_long;
            Random var4_ref_Random;
            int var5;
            int[] var6;
            int var6_int;
            int[][] var6_array;
            int[] var7_ref_int__;
            int var7;
            ShipComponentDefinition var8_ref_wfb;
            int var8;
            int var9;
            long var10;
            long var12;
            int var14;
            Object var16;
            ShipComponentDefinition var16_ref;
            Object var17;
            ShipComponentDefinition var17_ref;
            Object var18;
            ShipComponentDefinition var18_ref;
            Object var19;
            ShipComponentDefinition var19_ref;
            ShipComponentDefinition var20;
            int[] var21;
            Object var22;
            ShipComponentDefinition var22_ref;
            int[] var23;
            Object var24;
            ShipComponentDefinition var24_ref;
            Object var25;
            ShipComponentDefinition var25_ref;
            int[] var26;
            Object var27;
            ShipComponentDefinition var27_ref;
            int[] var28;
            Object var29;
            ShipComponentDefinition var29_ref;
            Object var30;
            ShipComponentDefinition var30_ref;
            Object var31;
            ShipComponentDefinition var31_ref;
            Object var32;
            ShipComponentDefinition var32_ref;
            int[] var33;
            Object var34;
            ShipComponentDefinition var34_ref;
            int[] var35;
            Object var36;
            ShipComponentDefinition var36_ref;
            int[] var37;
            Object var38;
            ShipComponentDefinition var38_ref;
            Object var39;
            ShipComponentDefinition var39_ref;
            Object var40;
            ShipComponentDefinition var40_ref;
            int[] var41;
            Object var44;
            ShipComponentDefinition var44_ref;
            Object var46;
            ShipComponentDefinition var46_ref;
            Object var48;
            ShipComponentDefinition var48_ref;
            Object var50;
            ShipComponentDefinition var50_ref;
            Object var52;
            ShipComponentDefinition var52_ref;
            Object var54;
            ShipComponentDefinition var54_ref;
            Object var56;
            ShipComponentDefinition var56_ref;
            Object var58;
            ShipComponentDefinition var58_ref;
            Object var60;
            ShipComponentDefinition var60_ref;
            int[] var61;
            ShipComponentDefinition var62;
            int[][] var63;
            int[] var64;
            int[] var65;
            int[] var66;
            int[] var67;
            int[] var78;
            int[][] var79;
            int[] var90;
            int[] var91;
            int[] var92;
            int[] var93;
            int[] var94;
            int[] var95;
            int[] var96;
            int[] var97;
            int[] var98;
            int[] var99;
            RuntimeException decompiledCaughtException;
            RuntimeException var1;
            int var15;
            int statePc;
            Throwable caughtException;
            byte param0;
            boolean finished;
            $CfrPartitionedState(byte initialParam0) {
                this.param0 = initialParam0;
                this.var1_int = 0;
                this.var2 = 0;
                this.var3 = 0;
                this.var4 = 0;
                this.var4_long = 0L;
                this.var4_ref_Random = null;
                this.var5 = 0;
                this.var6 = null;
                this.var6_int = 0;
                this.var6_array = null;
                this.var7_ref_int__ = null;
                this.var7 = 0;
                this.var8_ref_wfb = null;
                this.var8 = 0;
                this.var9 = 0;
                this.var10 = 0L;
                this.var12 = 0L;
                this.var14 = 0;
                this.var16 = null;
                this.var16_ref = null;
                this.var17 = null;
                this.var17_ref = null;
                this.var18 = null;
                this.var18_ref = null;
                this.var19 = null;
                this.var19_ref = null;
                this.var20 = null;
                this.var21 = null;
                this.var22 = null;
                this.var22_ref = null;
                this.var23 = null;
                this.var24 = null;
                this.var24_ref = null;
                this.var25 = null;
                this.var25_ref = null;
                this.var26 = null;
                this.var27 = null;
                this.var27_ref = null;
                this.var28 = null;
                this.var29 = null;
                this.var29_ref = null;
                this.var30 = null;
                this.var30_ref = null;
                this.var31 = null;
                this.var31_ref = null;
                this.var32 = null;
                this.var32_ref = null;
                this.var33 = null;
                this.var34 = null;
                this.var34_ref = null;
                this.var35 = null;
                this.var36 = null;
                this.var36_ref = null;
                this.var37 = null;
                this.var38 = null;
                this.var38_ref = null;
                this.var39 = null;
                this.var39_ref = null;
                this.var40 = null;
                this.var40_ref = null;
                this.var41 = null;
                this.var44 = null;
                this.var44_ref = null;
                this.var46 = null;
                this.var46_ref = null;
                this.var48 = null;
                this.var48_ref = null;
                this.var50 = null;
                this.var50_ref = null;
                this.var52 = null;
                this.var52_ref = null;
                this.var54 = null;
                this.var54_ref = null;
                this.var56 = null;
                this.var56_ref = null;
                this.var58 = null;
                this.var58_ref = null;
                this.var60 = null;
                this.var60_ref = null;
                this.var61 = null;
                this.var62 = null;
                this.var63 = null;
                this.var64 = null;
                this.var65 = null;
                this.var66 = null;
                this.var67 = null;
                this.var78 = null;
                this.var79 = null;
                this.var90 = null;
                this.var91 = null;
                this.var92 = null;
                this.var93 = null;
                this.var94 = null;
                this.var95 = null;
                this.var96 = null;
                this.var97 = null;
                this.var98 = null;
                this.var99 = null;
                this.decompiledCaughtException = null;
                this.var1 = null;
                this.var15 = 0;
                this.statePc = 0;
                this.caughtException = null;
            }
            void runPartition0() {
                scanLoop1: while (true) {
                    switch (statePc) {
                        case 0: {
                            var16 = null;
                            var17 = null;
                            var18 = null;
                            var19 = null;
                            var22 = null;
                            var24 = null;
                            var25 = null;
                            var27 = null;
                            var29 = null;
                            var30 = null;
                            var31 = null;
                            var32 = null;
                            var34 = null;
                            var36 = null;
                            var38 = null;
                            var39 = null;
                            var40 = null;
                            var44 = null;
                            var46 = null;
                            var48 = null;
                            var50 = null;
                            var52 = null;
                            var54 = null;
                            var56 = null;
                            var58 = null;
                            var60 = null;
                            var14 = VoidHunters.field_G;
                            statePc = 1;
                            continue scanLoop1;
                        }
                        case 1: {
                            try {
                                EnvironmentReflectionGpuMaterialEffect.field_g = new ShipComponentDefinition[56];
                                var16_ref = new ShipComponentDefinition(new int[]{5, 0, -5, 4, -5, -4}, 0, 0);
                                var16_ref.addHardpoint(1, new HardpointDefinition(5, 0, 0));
                                var16_ref.addHardpoint(param0 - 27, new HardpointDefinition(2, -2, -2048));
                                var16_ref.addHardpoint(102, new HardpointDefinition(2, 2, 2048));
                                var16_ref.addHardpoint(param0 ^ -56, new HardpointDefinition(-1, 0, 0));
                                var16_ref.addHardpoint(-120, new HardpointDefinition(-5, 0, 4096));
                                EnvironmentReflectionGpuMaterialEffect.field_g[0] = var16_ref;
                                var16_ref.field_w = new int[][]{new int[]{-2564, 0, -2564, -2086, -1456, -1626, -1456, -2233, -745, -2400, -117, -1103, 2559, 0}, new int[]{-515, -1919, 405, -1773, -305, -1501}};
                                EnvironmentReflectionGpuMaterialEffect.field_g[1] = new ShipComponentDefinition(new int[]{40, 0, 0, 40, -40, 0, 0, -40}, 0, 0);
                                EnvironmentReflectionGpuMaterialEffect.field_g[1].addHardpoint(-119, new HardpointDefinition(40, 0, 0));
                                EnvironmentReflectionGpuMaterialEffect.field_g[1].addHardpoint(53, new HardpointDefinition(0, 40, 2048));
                                EnvironmentReflectionGpuMaterialEffect.field_g[1].addHardpoint(-9, new HardpointDefinition(-40, 0, 4096));
                                EnvironmentReflectionGpuMaterialEffect.field_g[1].addHardpoint(18, new HardpointDefinition(0, -40, -2048));
                                EnvironmentReflectionGpuMaterialEffect.field_g[1].setHealthScale(1024, true);
                                EnvironmentReflectionGpuMaterialEffect.field_g[1].field_h = 1024;
                                EnvironmentReflectionGpuMaterialEffect.field_g[2] = new ShipComponentDefinition(new int[]{10, 0, 0, 10, -10, 0, 0, -10}, 0, 0);
                                EnvironmentReflectionGpuMaterialEffect.field_g[2].addHardpoint(10, new HardpointDefinition(10, 0, 0));
                                EnvironmentReflectionGpuMaterialEffect.field_g[2].addHardpoint(31, new HardpointDefinition(0, 10, 2048));
                                EnvironmentReflectionGpuMaterialEffect.field_g[2].addHardpoint(-120, new HardpointDefinition(-10, 0, 4096));
                                EnvironmentReflectionGpuMaterialEffect.field_g[2].addHardpoint(param0 - 71, new HardpointDefinition(0, -10, -2048));
                                EnvironmentReflectionGpuMaterialEffect.field_g[2].setHealthScale(1024, true);
                                var17_ref = new ShipComponentDefinition(new int[]{2, 0, -2, 1, -2, -1}, 0, 0);
                                var17_ref.field_t = new ThrusterBehaviour();
                                var17_ref.field_w = new int[][]{new int[]{-1024, 0, -1024, -517, -486, -517, -104, -423, 151, -219, 151, 0}};
                                EnvironmentReflectionGpuMaterialEffect.field_g[12] = var17_ref;
                                var17_ref.field_a = 5;
                                var18_ref = new ShipComponentDefinition(new int[]{3, 0, -4, 3, -4, -3}, 0, 0);
                                var18_ref.field_t = new ThrusterBehaviour();
                                var18_ref.field_a = 5;
                                EnvironmentReflectionGpuMaterialEffect.field_g[13] = var18_ref;
                                var18_ref.field_w = new int[][]{new int[]{-2049, 0, -2049, -1547, -1223, -1547, -784, -1108, 376, -1108, 941, -543, 941, 0}};
                                var19_ref = new ShipComponentDefinition(new int[]{10, 0, -8, 4, -8, -4}, 0, 0);
                                var19_ref.field_t = new ThrusterBehaviour(46);
                                var19_ref.setSpecialOrderId((byte) -128, 5);
                                var19_ref.field_w = new int[][]{new int[]{-4112, 0, -4112, -2233, -2941, -2233, -2313, -1605, 4358, -1605, 5132, -832, 5132, 0}};
                                var19_ref.field_a = 5;
                                EnvironmentReflectionGpuMaterialEffect.field_g[46] = var19_ref;
                                EnvironmentReflectionGpuMaterialEffect.field_g[14] = new ShipComponentDefinition(new int[]{2, -1, 2, 1, -2, 0}, -2, 0);
                                EnvironmentReflectionGpuMaterialEffect.field_g[14].field_c = new WeaponBehaviour(11);
                                EnvironmentReflectionGpuMaterialEffect.field_g[14].field_w = new int[][]{new int[]{-1019, 0, -1019, -402, 658, -402, 658, -203, 1024, -203, 1024, 0}};
                                EnvironmentReflectionGpuMaterialEffect.field_g[14].field_a = 0;
                                EnvironmentReflectionGpuMaterialEffect.field_g[15] = new ShipComponentDefinition(new int[]{5, -1, 5, 1, -5, 3, -5, -3}, -5, 0);
                                EnvironmentReflectionGpuMaterialEffect.field_g[15].field_c = new WeaponBehaviour(0);
                                EnvironmentReflectionGpuMaterialEffect.field_g[15].field_a = 0;
                                EnvironmentReflectionGpuMaterialEffect.field_g[15].field_w = new int[][]{new int[]{-2562, 0, -2562, -1464, -826, -1464, -324, -962, 627, -962, 627, -627, 2562, -627, 2562, 0}};
                                EnvironmentReflectionGpuMaterialEffect.field_g[16] = new ShipComponentDefinition(new int[]{10, -3, 10, 3, -10, 1, -10, -1}, -10, 0);
                                EnvironmentReflectionGpuMaterialEffect.field_g[16].field_c = new WeaponBehaviour(3);
                                EnvironmentReflectionGpuMaterialEffect.field_g[16].field_w = new int[][]{new int[]{-5124, 0, -5124, -512, -4810, -826, 1202, -836, 1558, -1192, 4193, -1192, 4538, -1537, 5124, -1532, 5124, 0}};
                                EnvironmentReflectionGpuMaterialEffect.field_g[16].field_a = 0;
                                EnvironmentReflectionGpuMaterialEffect.field_g[27] = new ShipComponentDefinition(new int[]{8, -3, 8, 3, -8, 1, -8, -1}, -8, 0);
                                EnvironmentReflectionGpuMaterialEffect.field_g[27].field_c = new WeaponBehaviour(8);
                                EnvironmentReflectionGpuMaterialEffect.field_g[27].setSpecialOrderId((byte) -118, 2);
                                EnvironmentReflectionGpuMaterialEffect.field_g[27].field_w = new int[][]{new int[]{-4099, 0, -3911, -606, -2467, -983, 4078, -1547, 3911, -1024, 3220, -794, 2928, 0}};
                                EnvironmentReflectionGpuMaterialEffect.field_g[27].field_a = 4;
                                EnvironmentReflectionGpuMaterialEffect.field_g[17] = new ShipComponentDefinition(new int[]{10, -5, 10, 5, -10, 3, -10, -3}, -10, 0);
                                EnvironmentReflectionGpuMaterialEffect.field_g[17].field_c = new WeaponBehaviour(1);
                                EnvironmentReflectionGpuMaterialEffect.field_g[17].field_a = 0;
                                EnvironmentReflectionGpuMaterialEffect.field_g[19] = new ShipComponentDefinition(new int[]{40, 5, -40, 5, -40, -5, 40, -5}, -35, 0);
                                EnvironmentReflectionGpuMaterialEffect.field_g[19].addHardpoint(20, new HardpointDefinition(40, 0, 0));
                                EnvironmentReflectionGpuMaterialEffect.field_g[19].field_e = new ArmBehaviour();
                                EnvironmentReflectionGpuMaterialEffect.field_g[20] = new ShipComponentDefinition(new int[]{20, 5, -20, 5, -20, -5, 20, -5}, -15, 0);
                                EnvironmentReflectionGpuMaterialEffect.field_g[20].addHardpoint(74, new HardpointDefinition(20, 0, 0));
                                EnvironmentReflectionGpuMaterialEffect.field_g[20].field_e = new ArmBehaviour();
                                EnvironmentReflectionGpuMaterialEffect.field_g[29] = new ShipComponentDefinition(new int[]{5, -5, 5, 5, -5, 5, -5, -5}, -5, 0);
                                EnvironmentReflectionGpuMaterialEffect.field_g[29].addHardpoint(12, new HardpointDefinition(5, 0, 0));
                                EnvironmentReflectionGpuMaterialEffect.field_g[29].addHardpoint(-115, new HardpointDefinition(0, 5, 2048));
                                EnvironmentReflectionGpuMaterialEffect.field_g[29].addHardpoint(param0 - 190, new HardpointDefinition(0, -5, -2048));
                                EnvironmentReflectionGpuMaterialEffect.field_g[29].field_a = 2;
                                EnvironmentReflectionGpuMaterialEffect.field_g[23] = new ShipComponentDefinition(new int[]{3, -3, 3, 3, -3, 1, -3, -1}, -3, 0);
                                EnvironmentReflectionGpuMaterialEffect.field_g[23].field_c = new WeaponBehaviour(4);
                                EnvironmentReflectionGpuMaterialEffect.field_g[23].field_w = new int[][]{new int[]{-1537, 0, -1537, -752, -1401, -888, -345, -888, 596, -1819, 1244, -1171, 543, -470, 1537, -470, 1537, 5}};
                                EnvironmentReflectionGpuMaterialEffect.field_g[23].field_a = 0;
                                EnvironmentReflectionGpuMaterialEffect.field_g[24] = new ShipComponentDefinition(new int[]{4, -1, 4, 1, -4, 1, -4, -1}, -4, 0);
                                EnvironmentReflectionGpuMaterialEffect.field_g[24].field_c = new WeaponBehaviour(6);
                                EnvironmentReflectionGpuMaterialEffect.field_g[24].field_w = new int[][]{new int[]{-2049, 0, -2049, -512, -1045, -512, -1045, -324, -151, -324, -151, -156, 1181, -156, 1537, -512, 2049, 0}};
                                EnvironmentReflectionGpuMaterialEffect.field_g[24].field_a = 0;
                                EnvironmentReflectionGpuMaterialEffect.field_g[25] = new ShipComponentDefinition(new int[]{8, -1, 8, 1, -8, 2, -8, -2}, -8, 0);
                                EnvironmentReflectionGpuMaterialEffect.field_g[25].field_c = new WeaponBehaviour(7);
                                if (param0 == 64) {
                                    statePc = 3;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 2. */
                                    {
                                        GetFixedaim.clearSharedReferences((byte) 124);
                                        statePc = 3;
                                        continue scanLoop1;
                                    }
                                }
                            } catch (Throwable stateCaught_1) {
                                statePc = (stateCaught_1 instanceof RuntimeException ? 34 : -1);
                                if (statePc == -1) {
                                    throw GetFixedaim.<RuntimeException>throwUnchecked(stateCaught_1);
                                }
                                caughtException = stateCaught_1;
                                continue scanLoop1;
                            }
                        }
                        case 3: {
                            try {
                                EnvironmentReflectionGpuMaterialEffect.field_g[25].field_a = 0;
                                EnvironmentReflectionGpuMaterialEffect.field_g[25].field_w = new int[][]{new int[]{-4109, 0, -4109, -1129, 428, -1129, 428, -836, 1871, -836, 1871, -606, 4099, -606, 4099, -130, 1861, -130, 1861, 0}};
                                EnvironmentReflectionGpuMaterialEffect.field_g[26] = new ShipComponentDefinition(new int[]{6, -4, 6, 4, -6, 3, -6, -3}, -6, 0);
                                EnvironmentReflectionGpuMaterialEffect.field_g[26].field_x = new GrappleLauncherBehaviour();
                                EnvironmentReflectionGpuMaterialEffect.field_g[26].setSpecialOrderId((byte) -103, 0);
                                EnvironmentReflectionGpuMaterialEffect.field_g[26].field_w = new int[][]{new int[]{-3074, 0, -3074, -1003, -2854, -1223, -2185, -1223, -1840, -1568, -62, -1568, 428, -2049, 3084, -2049, 3084, -1192, 2562, -1192, 2562, 0}};
                                EnvironmentReflectionGpuMaterialEffect.field_g[26].field_a = 4;
                                EnvironmentReflectionGpuMaterialEffect.field_g[28] = new ShipComponentDefinition(new int[]{3, -3, 3, 3, -3, 3, -3, -3}, 0, 0);
                                EnvironmentReflectionGpuMaterialEffect.field_g[28].field_w = new int[][]{new int[]{-1537, 0, -1537, -653, -653, -1537, 653, -1537, 1532, -658, 1532, 5}, new int[]{-658, -1537, 10, -2196, 669, -1537, 1537, -1537, 1537, -669, 2206, 0}, new int[]{-658, -1537, -1537, -1537, -1537, -653, -2196, 0}};
                                EnvironmentReflectionGpuMaterialEffect.field_g[42] = new ShipComponentDefinition(new int[]{5, -8, 5, 8, -5, 5, -5, -5}, -5, 0);
                                EnvironmentReflectionGpuMaterialEffect.field_g[42].field_g = new ShieldBehaviour();
                                EnvironmentReflectionGpuMaterialEffect.field_g[42].setSpecialOrderId((byte) -126, 3);
                                EnvironmentReflectionGpuMaterialEffect.field_g[42].field_w = new int[][]{new int[]{-2562, 0, -2562, -2572, -1662, -2572, -1662, -2091, -658, -2091, -658, -3994, 282, -3994, 1035, -3618, 1579, -2969, 2081, -2154, 2332, -1171, 2415, 0}};
                                EnvironmentReflectionGpuMaterialEffect.field_g[42].field_a = 1;
                                EnvironmentReflectionGpuMaterialEffect.field_g[43] = new ShipComponentDefinition(new int[]{3, -1, 3, 1, -3, 1, -3, -1}, -3, 0);
                                EnvironmentReflectionGpuMaterialEffect.field_g[43].field_c = new WeaponBehaviour(9);
                                EnvironmentReflectionGpuMaterialEffect.field_g[43].field_w = new int[][]{new int[]{-1537, 0, -1537, -512, -1045, -512, -1045, -386, -444, -386, -444, -177, 690, -177, 1024, -512, 1537, 0}};
                                EnvironmentReflectionGpuMaterialEffect.field_g[43].field_a = 1;
                                EnvironmentReflectionGpuMaterialEffect.field_g[44] = new ShipComponentDefinition(new int[]{3, -3, 3, 3, -3, 5, -3, -5}, -3, 0);
                                EnvironmentReflectionGpuMaterialEffect.field_g[44].field_c = new WeaponBehaviour(10);
                                EnvironmentReflectionGpuMaterialEffect.field_g[44].setSpecialOrderId((byte) -105, 7);
                                EnvironmentReflectionGpuMaterialEffect.field_g[44].field_a = 1;
                                EnvironmentReflectionGpuMaterialEffect.field_g[44].field_w = new int[][]{new int[]{-1537, 0, -1537, -522, -491, -2572, -73, -2572, -73, -669, 1537, 0}};
                                EnvironmentReflectionGpuMaterialEffect.field_g[47] = new ShipComponentDefinition(new int[]{20, -18, 20, 18, -11, 18, -11, 5, -20, 5, -20, -5, -11, -5, -11, -18}, -20, 0);
                                EnvironmentReflectionGpuMaterialEffect.field_g[47].field_B = 0;
                                EnvironmentReflectionGpuMaterialEffect.field_g[47].field_A = new int[][]{new int[]{5, 6, 3, 4}, new int[]{7, 0, 1, 2}};
                                EnvironmentReflectionGpuMaterialEffect.field_g[47].field_a = 6;
                                EnvironmentReflectionGpuMaterialEffect.field_g[47].field_w = new int[][]{new int[]{-10248, 0, -10248, -1694, -9223, -2718, -7403, -2718, -7403, -1882, -6546, -1882, -6546, -2990, -146, -2990, -146, -1945, 794, -1945, 794, -3346, 3262, -3346, 3241, -4224, -5688, -4224, -5688, -8282, 10227, -8282, 10227, -4224, 4538, -4224, 4559, -3346, 6776, -3346, 6776, -2007, 7654, -2007, 7654, -2949, 9286, -2949, 10248, -1986, 10248, 0}};
                                EnvironmentReflectionGpuMaterialEffect.field_g[47].field_q = 0;
                                var1_int = 0;
                                statePc = 4;
                                continue scanLoop1;
                            } catch (Throwable stateCaught_3) {
                                statePc = (stateCaught_3 instanceof RuntimeException ? 34 : -1);
                                if (statePc == -1) {
                                    throw GetFixedaim.<RuntimeException>throwUnchecked(stateCaught_3);
                                }
                                caughtException = stateCaught_3;
                                continue scanLoop1;
                            }
                        }
                        case 4: {
                            try {
                                if (EnvironmentReflectionGpuMaterialEffect.field_g.length <= var1_int) {
                                    statePc = 9;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 5. */
                                    {
                                        if (EnvironmentReflectionGpuMaterialEffect.field_g[var1_int] != null) {
                                            /* Inlined CFG state: 7. */
                                            {
                                                EnvironmentReflectionGpuMaterialEffect.field_g[var1_int].scaleGeometry(1, 89, true);
                                                EnvironmentReflectionGpuMaterialEffect.field_g[var1_int].scaleGeometry(8, param0 - 1, false);
                                                statePc = 8;
                                                continue scanLoop1;
                                            }
                                        } else {
                                            /* Inlined CFG state: 6. */
                                            {
                                                statePc = 8;
                                                continue scanLoop1;
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable stateCaught_4) {
                                statePc = (stateCaught_4 instanceof RuntimeException ? 34 : -1);
                                if (statePc == -1) {
                                    throw GetFixedaim.<RuntimeException>throwUnchecked(stateCaught_4);
                                }
                                caughtException = stateCaught_4;
                                continue scanLoop1;
                            }
                        }
                        case 8: {
                            try {
                                var1_int++;
                                statePc = 4;
                                continue scanLoop1;
                            } catch (Throwable stateCaught_8) {
                                statePc = (stateCaught_8 instanceof RuntimeException ? 34 : -1);
                                if (statePc == -1) {
                                    throw GetFixedaim.<RuntimeException>throwUnchecked(stateCaught_8);
                                }
                                caughtException = stateCaught_8;
                                continue scanLoop1;
                            }
                        }
                        default: return;
                    }
                }
            }
            void runPartition1() {
                scanLoop1: while (true) {
                    switch (statePc) {
                        case 9: {
                            try {
                                var1_int = 2560;
                                var2 = (int)((double)var1_int * Math.sin(1.0471975511965976));
                                EnvironmentReflectionGpuMaterialEffect.field_g[30] = new ShipComponentDefinition(new int[]{var2, 0, -var2, var1_int, -var2, -var1_int}, -var2, 0);
                                var3 = 1365;
                                EnvironmentReflectionGpuMaterialEffect.field_g[30].addHardpoint(-119, new HardpointDefinition(0, var1_int / 2, var3));
                                EnvironmentReflectionGpuMaterialEffect.field_g[30].addHardpoint(param0 + 50, new HardpointDefinition(0, -var1_int / 2, -var3));
                                EnvironmentReflectionGpuMaterialEffect.field_g[30].scaleMassDown(106, 15);
                                EnvironmentReflectionGpuMaterialEffect.field_g[30].field_a = 2;
                                var20 = new ShipComponentDefinition(new int[]{-var1_int, -var1_int, var1_int, -var1_int, var1_int + var2 * 2, 0, var1_int, var1_int, -var1_int, var1_int}, -var1_int, 0);
                                var20.addHardpoint(-116, new HardpointDefinition(var1_int + var2, var1_int / 2, var3));
                                var20.addHardpoint(96, new HardpointDefinition(var2 + var1_int, -var1_int / 2, -var3));
                                var20.addHardpoint(-126, new HardpointDefinition(0, var1_int, 2048));
                                var20.addHardpoint(-11, new HardpointDefinition(0, -var1_int, -2048));
                                var20.scaleMassDown(126, 15);
                                var20.field_a = 2;
                                EnvironmentReflectionGpuMaterialEffect.field_g[31] = var20;
                                var4 = -var1_int;
                                var5 = var1_int;
                                var4 += 0;
                                int localTemp$174 = var5;
                                int localTemp$175 = var5 - 2 * var1_int;
                                var5 = localTemp$175;
                                var4 += 0;
                                int localTemp$176 = var5 - var1_int * 2;
                                var5 = localTemp$176;
                                int localTemp$177 = var4;
                                int localTemp$178 = var4;
                                int localTemp$179 = var4;
                                int localTemp$180 = var4 + 2 * var1_int;
                                var4 = localTemp$180;
                                var5 += 0;
                                var4 += 0;
                                int localTemp$181 = var5;
                                int localTemp$182 = var5 + var1_int * 2;
                                var5 = localTemp$182;
                                var4 += 0;
                                int localTemp$183 = var5 + 2 * var1_int;
                                var5 = localTemp$183;
                                var4 += 0;
                                int localTemp$184 = var5 + var1_int * 2;
                                var5 = localTemp$184;
                                int localTemp$185 = var4;
                                int localTemp$186 = var4;
                                int localTemp$187 = var4;
                                int localTemp$188 = var4 - 2 * var1_int;
                                var4 = localTemp$188;
                                var5 += 0;
                                var21 = new int[]{localTemp$177, localTemp$174, localTemp$178, localTemp$175, localTemp$179, localTemp$176, localTemp$180, localTemp$181, localTemp$185, localTemp$182, localTemp$186, localTemp$183, localTemp$187, localTemp$184, localTemp$188, var5};
                                var6 = var21;
                                var22_ref = new ShipComponentDefinition(var6, -var1_int, 0);
                                ta.a(var21, 124, var22_ref);
                                var22_ref.scaleMassDown(105, 15);
                                var22_ref.field_a = 2;
                                EnvironmentReflectionGpuMaterialEffect.field_g[32] = var22_ref;
                                var4 = -var1_int * 3;
                                var5 = -var1_int;
                                var64 = GameSession.buildPathPolyline(var5, (byte) 9, new int[]{6, 6, 6, 9, 0, 0, 0}, var4);
                                var23 = var64;
                                var6 = var23;
                                var24_ref = new ShipComponentDefinition(var6, 3 * -var1_int, 0);
                                ta.a(var64, 119, var24_ref);
                                var24_ref.scaleMassDown(127, 15);
                                var24_ref.field_a = 2;
                                EnvironmentReflectionGpuMaterialEffect.field_g[40] = var24_ref;
                                var4 = -var2;
                                var5 = var1_int;
                                var6 = GameSession.buildPathPolyline(var5, (byte) 9, new int[]{3, 3, 7, 9, 9, 11}, var4);
                                var25_ref = new ShipComponentDefinition(var6, -var2, 0);
                                var25_ref.scaleMassDown(param0 + 43, 15);
                                var25_ref.field_a = 3;
                                EnvironmentReflectionGpuMaterialEffect.field_g[37] = var25_ref;
                                var25_ref.field_B = 0;
                                var25_ref.field_q = 0;
                                var4 = 0;
                                var5 = 2 * -var2 - var1_int;
                                int localTemp$189 = var4;
                                int localTemp$190 = var4 + var1_int;
                                var4 = localTemp$190;
                                int localTemp$191 = var5;
                                int localTemp$192 = var5 + 2 * var2;
                                var5 = localTemp$192;
                                var4 += 0;
                                int localTemp$193 = var5 + var1_int * 2;
                                var5 = localTemp$193;
                                int localTemp$194 = var4;
                                int localTemp$195 = var4 - var1_int;
                                var4 = localTemp$195;
                                int localTemp$196 = var5 + var2 * 2;
                                var5 = localTemp$196;
                                int localTemp$197 = var4 - var1_int;
                                var4 = localTemp$197;
                                int localTemp$198 = var5 - var2 * 2;
                                var5 = localTemp$198;
                                var4 += 0;
                                int localTemp$199 = var5 - var1_int * 2;
                                var5 = localTemp$199;
                                var26 = new int[]{localTemp$189, localTemp$191, localTemp$190, localTemp$192, localTemp$194, localTemp$193, localTemp$195, localTemp$196, localTemp$197, localTemp$198, var4, localTemp$199};
                                var6 = var26;
                                var27_ref = new ShipComponentDefinition(var6, -var1_int, 0);
                                ta.a(var26, 127, var27_ref);
                                var27_ref.scaleMassDown(118, 15);
                                EnvironmentReflectionGpuMaterialEffect.field_g[33] = var27_ref;
                                var27_ref.field_a = 2;
                                var4 = 5120;
                                var5 = 0;
                                var6_int = -ArchiveProvider.field_a - var4 / 2;
                                int localTemp$200 = var5;
                                int localTemp$201 = var5 + var4 / 2;
                                var5 = localTemp$201;
                                int localTemp$202 = var6_int;
                                int localTemp$203 = var6_int + ArchiveProvider.field_a;
                                var6_int = localTemp$203;
                                int localTemp$204 = var5 + var4;
                                var5 = localTemp$204;
                                var6_int += 0;
                                var5 += 0;
                                int localTemp$205 = var6_int;
                                int localTemp$206 = var6_int + var4;
                                var6_int = localTemp$206;
                                int localTemp$207 = var5;
                                int localTemp$208 = var5 - var4;
                                var5 = localTemp$208;
                                var6_int += 0;
                                int localTemp$209 = var5 - var4 / 2;
                                var5 = localTemp$209;
                                int localTemp$210 = var6_int;
                                int localTemp$211 = var6_int + ArchiveProvider.field_a;
                                var6_int = localTemp$211;
                                int localTemp$212 = var5 - var4 / 2;
                                var5 = localTemp$212;
                                int localTemp$213 = var6_int - ArchiveProvider.field_a;
                                var6_int = localTemp$213;
                                var5 += 0;
                                int localTemp$214 = var6_int - var4;
                                var6_int = localTemp$214;
                                var28 = new int[]{localTemp$200, localTemp$202, localTemp$201, localTemp$203, localTemp$204, localTemp$205, localTemp$207, localTemp$206, localTemp$208, localTemp$210, localTemp$209, localTemp$211, localTemp$212, localTemp$213, var5, localTemp$214};
                                var7_ref_int__ = var28;
                                var29_ref = new ShipComponentDefinition(var7_ref_int__, -var4 / 2, 0);
                                ta.a(var28, 114, var29_ref);
                                var29_ref.scaleMassDown(110, 15);
                                var29_ref.field_a = 2;
                                EnvironmentReflectionGpuMaterialEffect.field_g[34] = var29_ref;
                                var29_ref.field_A = new int[][]{new int[]{0, 1, 4, 5, 6, 7}, new int[]{1, 2, 3, 4}};
                                var4 = -ArchiveProvider.field_b / 2;
                                var5 = -ArchiveProvider.field_b / 2;
                                var6 = GameSession.buildPathPolyline(var5, (byte) 9, new int[]{1, 4, 7, 8, 9, 10, 11, 2, 5}, var4);
                                var30_ref = new ShipComponentDefinition(var6, -ArchiveProvider.field_b / 2, 0);
                                var30_ref.scaleMassDown(111, 15);
                                var30_ref.field_A = new int[][]{new int[]{0, 1, 2, 3}, new int[]{0, 3, 4, 5, 6, 9}, new int[]{6, 7, 8, 9}};
                                var30_ref.field_a = 3;
                                EnvironmentReflectionGpuMaterialEffect.field_g[35] = var30_ref;
                                var30_ref.field_B = 0;
                                var30_ref.field_q = 0;
                                var4 = -ArchiveProvider.field_b / 2;
                                var5 = 0;
                                var6 = GameSession.buildPathPolyline(var5, (byte) 9, new int[]{3, 7, 8, 11, 0}, var4);
                                var31_ref = new ShipComponentDefinition(var6, -ArchiveProvider.field_b / 2, -ArchiveProvider.field_b / 2);
                                var31_ref.scaleMassDown(113, 15);
                                var31_ref.field_A = new int[][]{new int[]{0, 1, 2, 3, 4}, new int[]{4, 5, 0}};
                                var31_ref.field_a = 3;
                                var31_ref.field_B = 0;
                                EnvironmentReflectionGpuMaterialEffect.field_g[36] = var31_ref;
                                var31_ref.field_q = 0;
                                var4 = -ArchiveProvider.field_b / 2;
                                var5 = 0;
                                var6 = GameSession.buildPathPolyline(var5, (byte) 9, new int[]{2, 6, 7, 10, 11}, var4);
                                var32_ref = new ShipComponentDefinition(var6, -ArchiveProvider.field_b / 2, ArchiveProvider.field_b / 2);
                                var32_ref.scaleMassDown(101, 15);
                                var32_ref.field_B = 0;
                                var32_ref.field_A = new int[][]{new int[]{0, 1, 2, 3, 4}, new int[]{4, 5, 0}};
                                var32_ref.field_q = 0;
                                EnvironmentReflectionGpuMaterialEffect.field_g[51] = var32_ref;
                                var32_ref.field_a = 3;
                                var4 = -ArchiveProvider.field_b / 2;
                                var5 = 0;
                                var65 = GameSession.buildPathPolyline(var5, (byte) 9, new int[]{4, 3, 7, 9, 10, 11}, var4);
                                var33 = var65;
                                var6 = var33;
                                var34_ref = new ShipComponentDefinition(var6, -ArchiveProvider.field_b / 2, ArchiveProvider.field_b / 2);
                                ta.a(var65, 120, var34_ref);
                                var34_ref.scaleMassDown(param0 + 63, 15);
                                var34_ref.field_a = 2;
                                var34_ref.field_A = new int[][]{new int[]{0, 1, 4, 5, 6}, new int[]{1, 2, 3, 4}};
                                EnvironmentReflectionGpuMaterialEffect.field_g[38] = var34_ref;
                                var4 = -ArchiveProvider.field_b / 2;
                                var5 = -ArchiveProvider.field_b;
                                var66 = GameSession.buildPathPolyline(var5, (byte) 9, new int[]{7, 8, 9, 11, 3, 2}, var4);
                                var35 = var66;
                                var6 = var35;
                                var36_ref = new ShipComponentDefinition(var6, -ArchiveProvider.field_b / 2, -ArchiveProvider.field_b / 2);
                                ta.a(var66, 119, var36_ref);
                                var36_ref.scaleMassDown(param0 + 44, 15);
                                var36_ref.field_A = new int[][]{new int[]{0, 1, 2, 5, 6}, new int[]{2, 3, 4, 5}};
                                EnvironmentReflectionGpuMaterialEffect.field_g[39] = var36_ref;
                                var36_ref.field_a = 2;
                                var4 = -ArchiveProvider.field_a;
                                var5 = -ArchiveProvider.field_b / 2;
                                var67 = GameSession.buildPathPolyline(var5, (byte) 9, new int[]{5, 7, 9, 11, 1}, var4);
                                var37 = var67;
                                var6 = var37;
                                var38_ref = new ShipComponentDefinition(var6, -ArchiveProvider.field_a, 0);
                                ta.a(var67, 118, var38_ref);
                                var38_ref.scaleMassDown(114, 15);
                                EnvironmentReflectionGpuMaterialEffect.field_g[41] = var38_ref;
                                var38_ref.field_a = 2;
                                var4 = -ArchiveProvider.field_a;
                                var5 = -ArchiveProvider.field_b / 2;
                                var6 = GameSession.buildPathPolyline(var5, (byte) 9, new int[]{5, 7, 11, 7, 11, 1}, var4);
                                var39_ref = new ShipComponentDefinition(var6, -ArchiveProvider.field_a, 0);
                                var39_ref.scaleMassDown(108, 15);
                                var39_ref.field_a = 4;
                                EnvironmentReflectionGpuMaterialEffect.field_g[18] = var39_ref;
                                var39_ref.field_B = 512;
                                var39_ref.field_w = new int[][]{new int[]{-4454, 0, -4454, -4162, -3492, -5124, 20, -5124, 3681, -5124, 4643, -4162, 4643, -3471, 3670, -3471, 3681, 0}};
                                var39_ref.field_A = new int[][]{new int[]{0, 1, 2, 3}, new int[]{0, 4, 5, 6}};
                                EnvironmentReflectionGpuMaterialEffect.field_g[18].field_c = new WeaponBehaviour(2);
                                EnvironmentReflectionGpuMaterialEffect.field_g[18].setSpecialOrderId((byte) -121, 6);
                                var4 = -ArchiveProvider.field_a;
                                var5 = -ArchiveProvider.field_b / 2;
                                var6 = GameSession.buildPathPolyline(var5, (byte) 9, new int[]{5, 7, 9, 11, 1}, var4);
                                var40_ref = new ShipComponentDefinition(var6, -ArchiveProvider.field_a, 0);
                                var40_ref.scaleMassDown(111, 15);
                                var40_ref.energyCapacity = 125;
                                var40_ref.field_y = 50;
                                var40_ref.field_w = new int[][]{new int[]{-4444, 0, -4444, -2572, -3011, -1735, -2290, -2269, -2698, -2760, -1129, -3869, -752, -3356, 10, -3848, 10, -5124, 4444, -2572, 3064, -1756, 3064, -941, 3733, -941, 3733, 0}};
                                var40_ref.field_a = 6;
                                var40_ref.field_d = 1;
                                EnvironmentReflectionGpuMaterialEffect.field_g[45] = var40_ref;
                                var40_ref.field_B = 896;
                                var4 = 6 * -var1_int;
                                var5 = 0;
                                int localTemp$215 = var4;
                                int localTemp$216 = var4 + var1_int;
                                var4 = localTemp$216;
                                int localTemp$217 = var5;
                                int localTemp$218 = var5 + -var2 * 2;
                                var5 = localTemp$218;
                                int localTemp$219 = var4 + 2 * var2;
                                var4 = localTemp$219;
                                int localTemp$220 = var5 - var1_int;
                                var5 = localTemp$220;
                                int localTemp$221 = var4 + var2 * 2;
                                var4 = localTemp$221;
                                int localTemp$222 = var5 - var1_int;
                                var5 = localTemp$222;
                                int localTemp$223 = var4 + 2 * var2;
                                var4 = localTemp$223;
                                int localTemp$224 = var5 + var1_int;
                                var5 = localTemp$224;
                                int localTemp$225 = var4 + 2 * var1_int;
                                var4 = localTemp$225;
                                var5 += 0;
                                int localTemp$226 = var4 + var2 * 2;
                                var4 = localTemp$226;
                                int localTemp$227 = var5;
                                int localTemp$228 = var5 - var1_int;
                                var5 = localTemp$228;
                                int localTemp$229 = var4 + var1_int;
                                var4 = localTemp$229;
                                int localTemp$230 = var5 + var2 * 2;
                                var5 = localTemp$230;
                                var4 += 0;
                                int localTemp$231 = var5 + 2 * var1_int;
                                var5 = localTemp$231;
                                var41 = new int[]{localTemp$215, localTemp$217, localTemp$216, localTemp$218, localTemp$219, localTemp$220, localTemp$221, localTemp$222, localTemp$223, localTemp$224, localTemp$225, localTemp$227, localTemp$226, localTemp$228, localTemp$229, localTemp$230, var4, localTemp$231};
                                var90 = GetGrapplingHookCooldown.a((byte) 104, var41);
                                var91 = OpenGlToolkit.reflectXAndReversePoints(1, var90);
                                var44_ref = new ShipComponentDefinition(var91, 0, 0);
                                ta.a(var91, 114, var44_ref);
                                var44_ref.scaleMassDown(param0 ^ 49, 15);
                                var44_ref.field_s = true;
                                var8_ref_wfb = var44_ref;
                                EnvironmentReflectionGpuMaterialEffect.field_g[3] = var44_ref;
                                var44_ref.field_A = new int[][]{new int[]{0, 2, 3, 11, 12, 14, 15}, new int[]{3, 4, 10, 11}, new int[]{4, 5, 6, 8, 9, 10}};
                                var8_ref_wfb.field_f = true;
                                var4 = -ArchiveProvider.field_b * 4;
                                var5 = -ArchiveProvider.field_b / 2;
                                var92 = GameSession.buildPathPolyline(var5, (byte) 9, new int[]{5, 7, 6, 5, 6, 6, 7, 9, 11, 0, 0, 1, 0, 11, 1}, var4);
                                var46_ref = new ShipComponentDefinition(var92, 0, 0);
                                ta.a(var92, 127, var46_ref);
                                var46_ref.addHardpoint(-113, new HardpointDefinition(ArchiveProvider.field_b, 0, 4096));
                                var46_ref.addHardpoint(-117, new HardpointDefinition(3 * -ArchiveProvider.field_b, 0, 4096));
                                var46_ref.scaleMassDown(119, 15);
                                var46_ref.field_s = true;
                                var8_ref_wfb = var46_ref;
                                var8_ref_wfb.field_f = true;
                                EnvironmentReflectionGpuMaterialEffect.field_g[4] = var46_ref;
                                var46_ref.field_A = new int[][]{new int[]{0, 1, 2, 13, 14, 15}, new int[]{2, 3, 12, 13}, new int[]{3, 4, 5, 6, 7, 8, 9, 10, 11, 12}};
                                var4 = 2 * -ArchiveProvider.field_b;
                                var5 = 0;
                                var93 = GameSession.buildPathPolyline(var5, (byte) 9, new int[]{3, 5, 2, 5, 8, 9, 6, 6, 7, 9, 11, 0, 0, 9, 10, 1, 4, 1}, var4);
                                var48_ref = new ShipComponentDefinition(var93, 0, 0);
                                ta.a(var93, 116, var48_ref);
                                var48_ref.scaleMassDown(param0 + 42, 15);
                                var8_ref_wfb = var48_ref;
                                var48_ref.field_s = true;
                                EnvironmentReflectionGpuMaterialEffect.field_g[5] = var48_ref;
                                var8_ref_wfb.field_f = true;
                                var48_ref.field_A = new int[][]{new int[]{1, 5, 14, 18}, new int[]{2, 3, 4, 5}, new int[]{6, 8, 9, 10, 11, 13}, new int[]{14, 15, 16, 17}};
                                var4 = -ArchiveProvider.field_b * 2;
                                var5 = -ArchiveProvider.field_b;
                                var94 = GameSession.buildPathPolyline(var5, (byte) 9, new int[]{5, 7, 6, 7, 9, 11, 0, 11, 1, 3}, var4);
                                var50_ref = new ShipComponentDefinition(var94, 0, 0);
                                ta.a(var94, 124, var50_ref);
                                var50_ref.addHardpoint(param0 ^ 92, new HardpointDefinition(-ArchiveProvider.field_b, 0, 0));
                                var50_ref.scaleMassDown(120, 15);
                                var50_ref.field_s = true;
                                var8_ref_wfb = var50_ref;
                                EnvironmentReflectionGpuMaterialEffect.field_g[6] = var50_ref;
                                var50_ref.field_A = new int[][]{new int[]{0, 1, 2, 7, 8, 9}, new int[]{2, 3, 4, 5, 6, 7}};
                                var8_ref_wfb.field_f = true;
                                var4 = -ArchiveProvider.field_b;
                                var5 = -ArchiveProvider.field_b / 2;
                                var95 = GameSession.buildPathPolyline(var5, (byte) 9, new int[]{1, 1, 4, 7, 7, 6, 7, 8, 10, 11, 0, 11, 11, 2, 5, 5}, var4);
                                var52_ref = new ShipComponentDefinition(var95, 0, 0);
                                ta.a(var95, 122, var52_ref);
                                var52_ref.scaleMassDown(param0 ^ 37, 15);
                                var8_ref_wfb = var52_ref;
                                var52_ref.field_s = true;
                                EnvironmentReflectionGpuMaterialEffect.field_g[7] = var52_ref;
                                var8_ref_wfb.field_f = true;
                                var52_ref.field_A = new int[][]{new int[]{0, 2, 3, 5}, new int[]{0, 5, 6, 7, 8, 9, 10, 11, 16}, new int[]{11, 13, 14, 16}};
                                var4 = 2 * -ArchiveProvider.field_b;
                                var5 = -ArchiveProvider.field_b / 2;
                                var96 = GameSession.buildPathPolyline(var5, (byte) 9, new int[]{5, 5, 5, 7, 9, 9, 9, 11, 1, 1, 1}, var4);
                                var54_ref = new ShipComponentDefinition(var96, 0, 0);
                                ta.a(var96, param0 ^ 51, var54_ref);
                                var54_ref.scaleMassDown(104, 15);
                                var8_ref_wfb = var54_ref;
                                var54_ref.field_s = true;
                                EnvironmentReflectionGpuMaterialEffect.field_g[8] = var54_ref;
                                var8_ref_wfb.field_f = true;
                                var4 = -ArchiveProvider.field_b * 6;
                                var5 = 0;
                                var97 = GameSession.buildPathPolyline(var5, (byte) 9, new int[]{5, 6, 6, 4, 4, 5, 5, 6, 6, 7, 7, 8, 8, 9, 10, 10, 11, 11, 0, 0, 1, 1, 2, 2, 0, 0}, var4);
                                var56_ref = new ShipComponentDefinition(var97, 0, 0);
                                ta.a(var97, 121, var56_ref);
                                var56_ref.scaleMassDown(107, 15);
                                var56_ref.energyCapacity = 125;
                                var56_ref.field_y = 50;
                                var56_ref.field_d = 1;
                                var8_ref_wfb = var56_ref;
                                var56_ref.field_s = true;
                                EnvironmentReflectionGpuMaterialEffect.field_g[9] = var56_ref;
                                var56_ref.field_A = new int[][]{new int[]{0, 1, 3, 24, 26}, new int[]{3, 5, 7, 9, 11, 13, 14, 16, 18, 20, 22, 24}};
                                var8_ref_wfb.field_f = true;
                                var4 = -ArchiveProvider.field_a * 2;
                                var5 = -ArchiveProvider.field_b / 2;
                                var98 = GameSession.buildPathPolyline(var5, (byte) 9, new int[]{5, 6, 7, 6, 9, 0, 11, 0, 1}, var4);
                                var58_ref = new ShipComponentDefinition(var98, 0, 0);
                                ta.a(var98, 120, var58_ref);
                                var58_ref.scaleMassDown(114, 15);
                                var8_ref_wfb = var58_ref;
                                var58_ref.field_s = true;
                                var58_ref.field_A = new int[][]{new int[]{0, 1, 2, 3, 6, 7, 8, 9}, new int[]{3, 4, 5, 6}};
                                var8_ref_wfb.field_f = true;
                                EnvironmentReflectionGpuMaterialEffect.field_g[10] = var58_ref;
                                var4 = -(ArchiveProvider.field_b / 2) + 4 * -ArchiveProvider.field_b;
                                var5 = ArchiveProvider.field_b / 2;
                                var99 = GameSession.buildPathPolyline(var5, (byte) 9, new int[]{3, 4, 6, 8, 6, 4, 6, 8, 6, 6, 4, 6, 8, 9, 10, 0, 2, 0, 0, 10, 0, 2, 0, 10, 0}, var4);
                                var60_ref = new ShipComponentDefinition(var99, 0, 0);
                                ta.a(var99, 114, var60_ref);
                                var60_ref.scaleMassDown(120, 15);
                                var60_ref.field_s = true;
                                var8_ref_wfb = var60_ref;
                                EnvironmentReflectionGpuMaterialEffect.field_g[11] = var60_ref;
                                var8_ref_wfb.field_f = true;
                                var60_ref.field_A = new int[][]{new int[]{0, 1, 2, 3, 4, 23, 24, 25}, new int[]{4, 5, 22, 23}, new int[]{5, 6, 7, 8, 19, 20, 21, 22}, new int[]{8, 9, 10, 17, 18, 19}, new int[]{10, 11, 12, 13, 14, 15, 16, 17}};
                                var4_long = 32L;
                                var6_int = 12;
                                var78 = new int[var6_int << 1];
                                var61 = var78;
                                var7_ref_int__ = var61;
                                var8 = 0;
                                statePc = 10;
                                continue scanLoop1;
                            } catch (Throwable stateCaught_9) {
                                statePc = (stateCaught_9 instanceof RuntimeException ? 34 : -1);
                                if (statePc == -1) {
                                    throw GetFixedaim.<RuntimeException>throwUnchecked(stateCaught_9);
                                }
                                caughtException = stateCaught_9;
                                continue scanLoop1;
                            }
                        }
                        case 10: {
                            try {
                                if (var8 >= var78.length) {
                                    /* Inlined CFG state: 12. */
                                    {
                                        EnvironmentReflectionGpuMaterialEffect.field_g[22] = new ShipComponentDefinition(var78, 0, 0);
                                        var62 = EnvironmentReflectionGpuMaterialEffect.field_g[22];
                                        var62.field_w = new int[][]{new int[]{-8198, 0, -7236, -4099, -4392, -7194, 0, -8198, 3848, -7194, 6943, -4392, 8198, 0}, new int[]{-8198, 0, -8784, -2467, -7236, -4099, -6567, -6400, -4350, -7194, -2551, -8575, 0, -8198, 2509, -8491, 3848, -7194, 5981, -6483, 6901, -4392, 8282, -2509, 8156, 0}};
                                        var62.field_a = 0;
                                        var62.field_c = new WeaponBehaviour(5);
                                        var62.setHealthScale(128, true);
                                        var62.maxHealth = var62.maxHealth >> 8;
                                        var62.mass = var62.mass >> 16;
                                        var4_ref_Random = new Random(135435642L);
                                        EnvironmentReflectionGpuMaterialEffect.field_g[21] = UiValueTrackRenderer.createAsteroidDefinition(new int[][]{new int[]{-334, -50865, -28779, -43837, -43503, -24094, -43168, 3346, -48857, 21416, -40156, 38149, -5688, 46515, 10708, 38818, 38483, 39152, 53207, 18405, 56888, -9704, 45176, -20747, 36475, -42499, 17735, -44172}, new int[]{-26771, -40826, -38149, -23090, -28779, -3346, -36141, 14724, -26436, 27775, -3011, 18739, 17401, 26101, 42164, 18405, 52538, -7362, 42499, -18405, 33798, -39152, 16732, -40156, -334, -47518}, new int[]{-669, -43837, -21416, -35806, -27105, -25767, -20413, -10708, 334, -13050, 12047, 6692, 31456, 8366, 39822, -7027, 32460, -13385, 30117, -33129, 13385, -35471}}, 1000L, 12, var4_ref_Random, SetFixedaim.xorBits((int) param0, 47), 2500L);
                                        EnvironmentReflectionGpuMaterialEffect.field_g[48] = UiValueTrackRenderer.createAsteroidDefinition(new int[][]{new int[]{-4684, -53877, -25767, -48522, -29783, -36141, -48522, -21416, -49861, 10039, -29448, 20413, -8700, 41495, 32460, 39152, 45845, 28779, 45845, 6358, 56219, -20747, 46180, -41495, 22086, -50865}, new int[]{-4350, -50530, -20747, -45176, -23424, -32794, -35471, -17735, -28109, 1673, -6692, -334, 17401, 19743, 36475, 18739, 39487, 4350, 50530, -19743, 41830, -37479, 21082, -47853}, new int[]{-4015, -46849, -14389, -40826, -14724, -29783, -17735, -15393, 4350, -11043, 19074, -18739, 36810, -18070, 35806, -32125, 20413, -43503}}, 1000L, 12, var4_ref_Random, SetFixedaim.xorBits((int) param0, 61), 2500L);
                                        EnvironmentReflectionGpuMaterialEffect.field_g[49] = UiValueTrackRenderer.createAsteroidDefinition(new int[][]{new int[]{-669, -23759, -22086, -18405, -26771, 7027, -10039, 30452, 7027, 33129, 21082, 15058, 34133, 8700, 29113, -9704, 13050, -13720}, new int[]{-2342, -19074, -17735, -13720, -17066, 2342, -1673, 18739, 14389, 12381, 19743, -2677, 8366, -9369}, new int[]{-3011, -14054, -13720, -11043, -8700, 1003, 3681, 5354, 7027, -5354}}, 500L, 12, var4_ref_Random, param0 + 45, 1250L);
                                        EnvironmentReflectionGpuMaterialEffect.field_g[50] = UiValueTrackRenderer.createAsteroidDefinition(new int[][]{new int[]{9369, -28109, -12716, -23424, -22420, -5354, -14724, 8366, -10708, 26101, 11377, 30117, 30117, 13385, 27105, -3011, 26771, -21082}, new int[]{8700, -23759, -9035, -19074, -14054, -5354, -5019, 3681, -334, 16062, 16397, 8700, 19074, -15058}, new int[]{7696, -19409, -5354, -15728, -2007, -4350, 10039, 1338, 15058, -13385}}, 500L, 12, var4_ref_Random, SetFixedaim.xorBits((int) param0, -10), 1250L);
                                        EnvironmentReflectionGpuMaterialEffect.field_g[52] = UiValueTrackRenderer.createAsteroidDefinition(new int[][]{new int[]{1003, -55550, -24428, -54211, -37479, -47184, -39822, -33798, -56888, -20078, -61573, 7696, -48188, 37145, -27105, 40156, -13385, 55884, 19409, 59231, 41160, 46515, 56219, 29448, 50865, 10039, 53207, -6692, 41160, -22755, 39487, -39152, 24763, -50530}, new int[]{-19743, -49192, -31456, -42833, -32794, -27105, -49526, -13385, -48857, 11712, -32125, 21751, -10708, 17066, 8366, 29448, 27440, 29448, 32794, 11043, 43168, -4350, 36810, -19074, 24763, -32125, 22086, -45176, 0, -50865}, new int[]{-17735, -44841, -26101, -39152, -25098, -22420, -37479, -5354, -32794, 8366, -7362, -334, 11712, 4350, 30117, -10708, 16397, -26436, 13720, -41830, -2342, -40156}}, 1500L, 12, var4_ref_Random, -127, 3000L);
                                        EnvironmentReflectionGpuMaterialEffect.field_g[53] = UiValueTrackRenderer.createAsteroidDefinition(new int[][]{new int[]{-1003, -63916, -30452, -63581, -39822, -47518, -62912, -37479, -74290, 2007, -61239, 35471, -38818, 40826, -32125, 56888, 1338, 67597, 29448, 58227, 64250, 57558, 77636, 31456, 66928, 7362, 70943, -20747, 46849, -41495, 32125, -60235}, new int[]{-26436, -57892, -32794, -41160, -54546, -30117, -56888, 334, -31790, 15058, -19409, 39152, 13385, 39822, 24094, 13385, 48857, 3681, 54881, -20747, 41830, -34802, 28109, -53877, -669, -59231}, new int[]{-20413, -51534, -24094, -35471, -40156, -20413, -38818, -6023, -13050, 2677, 6023, -13720, 30117, -10708, 37145, -25098, 22755, -46180, -669, -54211}}, 1500L, 12, var4_ref_Random, 123, 3000L);
                                        EnvironmentReflectionGpuMaterialEffect.field_g[54] = UiValueTrackRenderer.createAsteroidDefinition(new int[][]{new int[]{-3681, -11294, -11126, -5103, -11126, 5856, 83, 12549, 11294, 8115, 10373, -8533}, new int[]{-3011, -9202, -8700, -4433, -7445, 3681, -501, 5521, 6609, 3262, 7362, -6525}, new int[]{-2509, -7529, -6609, -3764, -2258, 585, 3262, -1422, 4099, -5688}}, 250L, 10, var4_ref_Random, SetFixedaim.xorBits((int) param0, -108), 625L);
                                        EnvironmentReflectionGpuMaterialEffect.field_g[55] = UiValueTrackRenderer.createAsteroidDefinition(new int[][]{new int[]{-3848, -11377, -12800, -5605, -12632, 6609, -6525, 12130, 10708, 8784, 12800, -250, 4183, -11294}, new int[]{-3346, -9118, -10206, -3764, -8951, 4433, 5186, 6190, 7362, 836, 3179, -8951}, new int[]{-2844, -6943, -7027, -3346, -4099, 1840, 2426, 1338, 1840, -6776}}, 250L, 10, var4_ref_Random, 122, 625L);
                                        SetSniperCannonEnergyUsed.field_o = 0;
                                        OpenGlGpuRectangleTexture.field_m = 0;
                                        var4 = 0;
                                        var5 = 0;
                                        statePc = 13;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 11. */
                                    {
                                        var9 = (8192 * (var8 >> 1) + 8192) / var6_int;
                                        var10 = (long)GetNumStars.cosAngle(var9, (byte) -86) * var4_long >> 8;
                                        var12 = var4_long * (long)TextureLineShape.sinAngle(var9, param0 ^ 12) >> 8;
                                        var7_ref_int__[var8] = (int)var10;
                                        var7_ref_int__[var8 + 1] = (int)var12;
                                        var8 += 2;
                                        statePc = 10;
                                        continue scanLoop1;
                                    }
                                }
                            } catch (Throwable stateCaught_10) {
                                statePc = (stateCaught_10 instanceof RuntimeException ? 34 : -1);
                                if (statePc == -1) {
                                    throw GetFixedaim.<RuntimeException>throwUnchecked(stateCaught_10);
                                }
                                caughtException = stateCaught_10;
                                continue scanLoop1;
                            }
                        }
                        default: return;
                    }
                }
            }
            void runPartition2() {
                scanLoop1: while (true) {
                    switch (statePc) {
                        case 13: {
                            try {
                                if (var5 >= EnvironmentReflectionGpuMaterialEffect.field_g.length) {
                                    /* Inlined CFG state: 32. */
                                    {
                                        GetLaserBeamProjectileDamage.field_p = new int[var4];
                                        ToolkitRasterStateCache.field_b = new int[var4];
                                        statePc = 35;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 14. */
                                    {
                                        if (SetMassDriverAimarc.a(130, var5)) {
                                            /* Inlined CFG state: 16. */
                                            {
                                                OpenGlGpuRectangleTexture.field_m = OpenGlGpuRectangleTexture.field_m + 1;
                                                statePc = 17;
                                                continue scanLoop1;
                                            }
                                        } else {
                                            /* Inlined CFG state: 15. */
                                            {
                                                statePc = 17;
                                                continue scanLoop1;
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable stateCaught_13) {
                                statePc = (stateCaught_13 instanceof RuntimeException ? 34 : -1);
                                if (statePc == -1) {
                                    throw GetFixedaim.<RuntimeException>throwUnchecked(stateCaught_13);
                                }
                                caughtException = stateCaught_13;
                                continue scanLoop1;
                            }
                        }
                        case 17: {
                            try {
                                if (LegacyOpenGlMaterialEffectManager.isDebrisEligibleComponentType(var5, 15923)) {
                                    statePc = 18;
                                } else {
                                    statePc = 18;
                                }
                                continue scanLoop1;
                            } catch (Throwable stateCaught_17) {
                                statePc = (stateCaught_17 instanceof RuntimeException ? 34 : -1);
                                if (statePc == -1) {
                                    throw GetFixedaim.<RuntimeException>throwUnchecked(stateCaught_17);
                                }
                                caughtException = stateCaught_17;
                                continue scanLoop1;
                            }
                        }
                        case 18: {
                            try {
                                if (SettingsInstance.isAsteroidComponentType(125, var5)) {
                                    /* Inlined CFG state: 20. */
                                    {
                                        SetSniperCannonEnergyUsed.field_o = SetSniperCannonEnergyUsed.field_o + 1;
                                        statePc = 21;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 19. */
                                    {
                                        statePc = 21;
                                        continue scanLoop1;
                                    }
                                }
                            } catch (Throwable stateCaught_18) {
                                statePc = (stateCaught_18 instanceof RuntimeException ? 34 : -1);
                                if (statePc == -1) {
                                    throw GetFixedaim.<RuntimeException>throwUnchecked(stateCaught_18);
                                }
                                caughtException = stateCaught_18;
                                continue scanLoop1;
                            }
                        }
                        case 21: {
                            try {
                                var79 = EnvironmentReflectionGpuMaterialEffect.field_g[var5].field_w;
                                var63 = var79;
                                var6_array = var63;
                                if (var6_array != null) {
                                    /* Inlined CFG state: 25. */
                                    {
                                        var15 = 0;
                                        var7 = var15;
                                        statePc = 26;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 22. */
                                    {
                                        var7 = EnvironmentReflectionGpuMaterialEffect.field_g[var5].outline.length;
                                        if (var7 > var4) {
                                            /* Inlined CFG state: 24. */
                                            {
                                                var4 = var7;
                                                statePc = 31;
                                                continue scanLoop1;
                                            }
                                        } else {
                                            /* Inlined CFG state: 23. */
                                            {
                                                statePc = 31;
                                                continue scanLoop1;
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable stateCaught_21) {
                                statePc = (stateCaught_21 instanceof RuntimeException ? 34 : -1);
                                if (statePc == -1) {
                                    throw GetFixedaim.<RuntimeException>throwUnchecked(stateCaught_21);
                                }
                                caughtException = stateCaught_21;
                                continue scanLoop1;
                            }
                        }
                        case 26: {
                            try {
                                if (var15 >= var79.length) {
                                    statePc = 31;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 27. */
                                    {
                                        var8 = var79[var15].length;
                                        if (var8 > var4) {
                                            /* Inlined CFG state: 29. */
                                            {
                                                var4 = var8;
                                                statePc = 30;
                                                continue scanLoop1;
                                            }
                                        } else {
                                            /* Inlined CFG state: 28. */
                                            {
                                                statePc = 30;
                                                continue scanLoop1;
                                            }
                                        }
                                    }
                                }
                            } catch (Throwable stateCaught_26) {
                                statePc = (stateCaught_26 instanceof RuntimeException ? 34 : -1);
                                if (statePc == -1) {
                                    throw GetFixedaim.<RuntimeException>throwUnchecked(stateCaught_26);
                                }
                                caughtException = stateCaught_26;
                                continue scanLoop1;
                            }
                        }
                        case 30: {
                            try {
                                var15++;
                                statePc = 26;
                                continue scanLoop1;
                            } catch (Throwable stateCaught_30) {
                                statePc = (stateCaught_30 instanceof RuntimeException ? 34 : -1);
                                if (statePc == -1) {
                                    throw GetFixedaim.<RuntimeException>throwUnchecked(stateCaught_30);
                                }
                                caughtException = stateCaught_30;
                                continue scanLoop1;
                            }
                        }
                        case 31: {
                            try {
                                var5++;
                                statePc = 13;
                                continue scanLoop1;
                            } catch (Throwable stateCaught_31) {
                                statePc = (stateCaught_31 instanceof RuntimeException ? 34 : -1);
                                if (statePc == -1) {
                                    throw GetFixedaim.<RuntimeException>throwUnchecked(stateCaught_31);
                                }
                                caughtException = stateCaught_31;
                                continue scanLoop1;
                            }
                        }
                        case 34: {
                            var1 = (RuntimeException) ((Object) caughtException);
                            throw GetMissileLauncherRandomness.a((Throwable) ((Object) var1), "wlb.D(" + param0 + ')');
                        }
                        case 35: {
                            finished = true; return;
                        }
                        default: return;
                    }
                }
            }
            void run() {
                while (!finished) {
                    if (statePc <= 8) {
                        runPartition0();
                    }
                    else if (statePc <= 10) {
                        runPartition1();
                    }
                    else if (statePc <= 35) {
                        runPartition2();
                    }
                    else {
                        throw new IllegalStateException("invalid CFG state " + statePc);
                    }
                }
            }
        }
        $CfrPartitionedState decompiledState = new $CfrPartitionedState(param0);
        decompiledState.run();
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -119) {
            field_o = 94;
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(27, 82));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("wlb.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    static {
        field_q = (GameStateFactory) ((Object) new AdjustBodyComponentsActionFactory());
        field_p = 0;
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException throwUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
