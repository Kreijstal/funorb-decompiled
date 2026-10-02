/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg {
    static le field_c;
    static int[] field_d;
    static String[] field_a;
    static boolean screenChangePending;
    static int field_b;

    final static void resetGameplayDifficulty(int methodGuard) {
        og.entityMotionSpeed = 0.4000000059604645f;
        sa.specialSpriteKindProbability = 0.0;
        ul.releasedInCurrentTheme = 0;
        ag.availableSpriteVariantCount = 3;
        fj.field_m = 0;
        ji.difficultyStep = 0;
        fa.releasesPerTheme = 40;
        f.availableEntityCategoryCount = 4;
        qe.adjustThemeReleaseQuota(10);
        ij.spawnIntervalScale = 0.75f;
        DualLinkNode.rotationStepRadians = 0.01666666753590107f;
        if (methodGuard != 9408) {
            return;
        }
        di.releasedInDifficultyStep = 0;
        sa.recomputeSpawnReleaseInterval(true);
        el.field_t = 0;
        gb.field_c = 0;
    }

    final static void a(int param0, PlatformTaskDispatcher param1, int param2, qc param3) {
        try {
            int var11_int = 0;
            int var12_int = 0;
            byte[] array$0 = null;
            RuntimeException stackIn_41_0 = null;
            StringBuilder stackIn_41_1 = null;
            RuntimeException stackIn_42_0 = null;
            StringBuilder stackIn_42_1 = null;
            String stackIn_42_2 = null;
            StringBuilder stackIn_44_1 = null;
            StringBuilder stackIn_45_1 = null;
            String stackIn_45_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var4 = null;
            int var5 = 0;
            int var6_int = 0;
            ClassNotFoundException var6 = null;
            SecurityException var6_ref = null;
            NullPointerException var6_ref2 = null;
            Exception var6_ref3 = null;
            Throwable var6_ref4 = null;
            String var7 = null;
            String var8 = null;
            int var9 = 0;
            String[] var10 = null;
            byte[][] var11 = null;
            Class[] var12 = null;
            int var13 = 0;
            int var14 = 0;
            qc var15 = null;
            String var16 = null;
            String var17 = null;
            int var18 = 0;
            eg var19 = null;
            byte[][] var20 = null;
            String var21 = null;
            byte[][] var22 = null;
            var14 = Geoblox.field_C;
            try {
              var19 = new eg();
              var19.field_f = param3.c((byte) 34);
              var19.field_m = param3.a((byte) -127);
              var19.field_j = new int[var19.field_f];
              var19.field_i = new PlatformTask[var19.field_f];
              var19.field_g = new int[var19.field_f];
              var19.field_n = new PlatformTask[var19.field_f];
              var19.field_k = new int[var19.field_f];
              var19.field_o = new byte[var19.field_f][][];
              var5 = 0;
              L0: while (var5 < var19.field_f) {
                try {
                  L2: {
                    L3: {
                      var6_int = param3.c((byte) 34);
                      if (0 != var6_int) {
                        if (1 != var6_int) {
                          if (var6_int != 2) {
                            if (var6_int != 3) {
                              if (var6_int != 4) {
                                var5++;
                                decompiledRegionSelector0 = 1;
                                break L2;
                              }
                            }
                            var21 = param3.e((byte) 103);
                            var8 = param3.e((byte) 98);
                            var9 = param3.c((byte) 34);
                            var10 = new String[var9];
                            for (var11_int = 0; var9 > var11_int; var11_int++) {
                              var10[var11_int] = param3.e((byte) 120);
                            }
                            L7: {
                              var22 = new byte[var9][];
                              var20 = var22;
                              var11 = var20;
                              if (var6_int == 3) {
                                for (var12_int = 0; var12_int < var9; var12_int++) {
                                  var13 = param3.a((byte) -70);
                                  array$0 = new byte[var13];
                                  var11[var12_int] = array$0;
                                  param3.b(29915, var13, var22[var12_int], 0);
                                }
                                break L7;
                              }
                            }
                            var19.field_k[var5] = var6_int;
                            var12 = new Class[var9];
                            var18 = 0;
                            var13 = var18;
                            L9: while (var18 < var9) {
                              var12[var18] = ag.a(var10[var18], false);
                              var18++;
                            }
                            var19.field_i[var5] = param1.requestDeclaredMethod(var8, -126, var12, ag.a(var21, false));
                            var19.field_o[var5] = var22;
                            break L3;
                          }
                        }
                      }
                      var16 = param3.e((byte) 117);
                      var7 = var16;
                      var17 = param3.e((byte) 125);
                      var8 = var17;
                      var9 = 0;
                      if (var6_int == 1) {
                        var9 = param3.a((byte) -123);
                      }
                      var19.field_k[var5] = var6_int;
                      var19.field_g[var5] = var9;
                      var19.field_n[var5] = param1.requestDeclaredField(ag.a(var16, false), 0, var17);
                    }
                    decompiledRegionSelector0 = 0;
                  }
                } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                  var19.field_j[var5] = -1;
                  decompiledRegionSelector0 = 0;
                } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var6_ref = (SecurityException) (Object) decompiledCaughtException;
                  var19.field_j[var5] = -2;
                  decompiledRegionSelector0 = 0;
                } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                  var19.field_j[var5] = -3;
                  decompiledRegionSelector0 = 0;
                } catch (java.lang.Exception decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  var6_ref3 = (Exception) (Object) decompiledCaughtException;
                  var19.field_j[var5] = -4;
                  decompiledRegionSelector0 = 0;
                } catch (java.lang.Throwable decompiledCaughtParameter4) {
                  decompiledCaughtException = decompiledCaughtParameter4;
                  var6_ref4 = decompiledCaughtException;
                  var19.field_j[var5] = -5;
                  decompiledRegionSelector0 = 0;
                }
                if (!(decompiledRegionSelector0 == 0)) {
                  continue L0;
                }
                var5++;
              }
              if (param0 != -4) {
                var15 = (qc) null;
                pg.a(96, (PlatformTaskDispatcher) null, -109, (qc) null);
              }
              sl.field_k.addLast(-92, var19);
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
              decompiledCaughtException = decompiledCaughtParameter5;
              var4 = (RuntimeException) (Object) decompiledCaughtException;
              stackIn_41_0 = (RuntimeException) (var4);

              stackIn_41_1 = new StringBuilder().append("pg.C(").append(param0).append(',');

              if (param1 == null) {
                stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
                stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
                stackIn_42_2 = "null";
              } else {
                stackIn_42_0 = (RuntimeException) ((Object) stackIn_41_0);
                stackIn_42_1 = (StringBuilder) ((Object) stackIn_41_1);
                stackIn_42_2 = "{...}";
              }


              stackIn_44_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(',').append(param2).append(',');

              if (param3 == null) {
                stackIn_42_0 = (RuntimeException) ((Object) stackIn_42_0);
                stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
                stackIn_45_2 = "null";
              } else {
                stackIn_42_0 = (RuntimeException) ((Object) stackIn_42_0);
                stackIn_45_1 = (StringBuilder) ((Object) stackIn_44_1);
                stackIn_45_2 = "{...}";
              }
              throw t.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_45_2).append(')').toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        field_d = null;
        field_c = null;
        field_a = null;
        if (param0 != 22059) {
            pg.resetGameplayDifficulty(52);
        }
    }

    static {
        field_d = new int[8192];
        field_c = new le();
        field_a = new String[]{"Geoblox Flush", "Ordered Geometry", "Perfect Geometry", "Chain Geometry", "Sequence Geometry", "Succession Geometry", "Dark Geometry", "Lightning Geometrician", "Natural Geometrician", "Sweet Geometrician", "Sparkly Geometrician", "Sick Geometrician", "Stellar Geometrician", "Sporty Geometrician", "Cooking Geometrician", "Parallel Geometrician", "Spooky Geometrician"};
    }
}
