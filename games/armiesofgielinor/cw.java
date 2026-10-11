/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cw {
    static String field_a;
    static String field_b;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var15 = 0;
        int stackIn_19_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_38_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var18 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var6_int = 50 + GameplayController.field_f;
          if (param3 > -116) {
            field_b = (String) null;
          }
          if (null != jf.field_C.selectedUnit) {
            if (jf.field_C.field_q != CipherPacketBuffer.currentBattlefield.currentPlayer &&
              jf.field_C.selectedUnit.ownerPlayer == jf.field_C.field_q) {
              return;
            }
            if (jf.field_C.selectedUnit.packedLowFlags > 0) {
              if (!jf.field_C.selectedUnit.packedFlag4 &&
                jf.field_C.selectedUnit.ownerPlayer == jf.field_C.field_q &&
                !jf.field_C.selectedUnit.h(-13494)) {
                var7 = jf.field_C.selectedUnit.B(3257);
                var8 = jf.field_C.selectedUnit.l((byte) -79);
                var9 = jf.field_C.movementPlanner.field_n;
                var10 = jf.field_C.movementPlanner.field_b;
                if (jf.field_C.selectedUnit.o(-28467)) {
                  var9 = jf.field_C.selectedUnit.a(false);
                  var10 = jf.field_C.selectedUnit.D(-65);
                }
                var11 = Math.abs(var9 - param4);
                var12 = Math.abs(var10 - param5);
                if (var11 + var12 <= var7 &&
                  var8 <= var11 + var12) {
                  stackIn_19_0 = (var12 + var11 != 1) ? 0 : 1;
                  var13 = stackIn_19_0;
                  if (var13 == 0) {
                    if ((CipherPacketBuffer.currentBattlefield.b(31, var10, var9, jf.field_C.selectedUnit.ownerPlayer) & 2) == 0) {
                      if ((2 & CipherPacketBuffer.currentBattlefield.b(31, param5, param4, jf.field_C.selectedUnit.ownerPlayer)) == 0) {
                        stackIn_29_0 = (CipherPacketBuffer.currentBattlefield.field_j.a(var10, param4, var9, jf.field_C.selectedUnit.x(-111), var7, param5, (byte) 62)) ? 1 : 0;
                      } else {
                        stackIn_29_0 = 0;
                      }
                    } else {
                      stackIn_29_0 = 0;
                    }
                  } else {
                    stackIn_29_0 = 0;
                  }
                  var14 = stackIn_29_0;
                  if (var13 != 0 ||
                    var14 != 0) {
                    for (var15 = 1; var15 < 40; var15 += 2) {
                      var16 = Math.abs(-(var15 * 2) + 40);
                      var17 = -20 + (param1 + var15);
                      SoftwareRaster.d(-40 + param2 + var16, var17, -1 - var16 + param2 + 40, var17, 16711680, var6_int);
                    }
                  }
                }
              }
              stackIn_38_0 = (jf.field_C.selectedUnit.packedFlag4) ? 1 : 3;
              var7Lifetime1 = stackIn_38_0;
              var8Lifetime1 = jf.field_C.movementPlanner.c(27732);
              if ((jf.field_C.movementPlanner.field_e[param0] & var7Lifetime1) != 0) {
                if (!jf.field_C.selectedUnit.packedFlag4 &&
                  jf.field_C.movementPlanner.field_q[param0] <= var8Lifetime1) {
                  return;
                }
                if (param5 == 0 ||
                  (!(var8Lifetime1 >= jf.field_C.movementPlanner.field_q[-CipherPacketBuffer.currentBattlefield.mapWidth + param0]) ||
                  jf.field_C.selectedUnit.packedFlag4) &&
                  (var7Lifetime1 & jf.field_C.movementPlanner.field_e[param0 - ks.field_y]) == 0) {
                  SoftwareRaster.d(-40 + param2, param1, param2, -20 + param1, 16711680, var6_int);
                }
                if (param5 == -1 + ef.field_c ||
                  (!(var8Lifetime1 >= jf.field_C.movementPlanner.field_q[ks.field_y + param0]) ||
                  jf.field_C.selectedUnit.packedFlag4) &&
                  (jf.field_C.movementPlanner.field_e[ks.field_y + param0] & var7Lifetime1) == 0) {
                  SoftwareRaster.d(40 + param2, param1, param2, param1 + 20, 16711680, var6_int);
                }
                if (0 == param4 ||
                  (!(jf.field_C.movementPlanner.field_q[-1 + param0] <= var8Lifetime1) ||
                  jf.field_C.selectedUnit.packedFlag4) &&
                  (var7Lifetime1 & jf.field_C.movementPlanner.field_e[param0 - 1]) == 0) {
                  SoftwareRaster.d(param2 - 40, param1, param2, 20 + param1, 16711680, var6_int);
                }
                if (param4 != -1 + ks.field_y) {
                  if (var8Lifetime1 >= jf.field_C.movementPlanner.field_q[1 + param0] &&
                    !jf.field_C.selectedUnit.packedFlag4) {
                    return;
                  }
                  if ((var7Lifetime1 & jf.field_C.movementPlanner.field_e[param0 + 1]) != 0) {
                    return;
                  }
                }
                SoftwareRaster.d(40 + param2, param1, param2, -20 + param1, 16711680, var6_int);
                return;
              }
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var6), "cw.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 > -91) {
          cw.a(-12, 36, -105, 64, -39, -61);
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_b = "Options";
        field_a = "This unit has an attack range of <%0> to <%1>";
    }
}
