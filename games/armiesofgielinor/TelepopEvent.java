/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TelepopEvent extends GameEvent {
    int tileX;
    static String field_y;
    int tileY;
    static float field_C;
    static int field_B;
    static boolean field_D;
    static int field_F;

    public static void g(int param0) {
        if (param0 >= -63) {
          TelepopEvent.g(6);
        }
        field_y = null;
    }

    final static void a(boolean param0, String param1) {
        try {
          fp.a(param1, (byte) -65);
          af.a(param0, MapLayout.field_o, -1);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "q.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String describeEvent(byte obfuscationGuard, boolean verbose) {
        if (verbose) {
          System.out.println("Teleport disappear event debug");
          System.out.println("Unit at " + this.tileX + "," + this.tileY);
        }
        String var3 = "EventTelepop: pos: (" + this.tileX + "," + this.tileY + ")";
        int var4 = -35 % ((obfuscationGuard - 53) / 51);
        return var3;
    }

    TelepopEvent(int param0, int param1) {
        this.tileY = param1;
        this.tileX = param0;
        this.eventKind = 6;
    }

    final boolean a(NodeDeque param0, byte param1, GameplayController param2) {
        RuntimeException var4 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -84) {
            this.describeEvent((byte) -47, true);
          }
          stackIn_3_0 = this.a((byte) -39, param2, param0, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("q.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final void applyToBattlefield(Battlefield battlefield, int obfuscationGuard) {
        Unit var5 = null;
        Unit var6 = null;
        try {
          if (obfuscationGuard != -26661) {
            this.tileY = -18;
          }
          if (!this.unit.packedFlag256) {
            this.unit.removeFromBattlefield(obfuscationGuard + 26574);
          } else {
            var5 = battlefield.getUnitAt(this.tileY, true, this.tileX);
            var6 = var5;
            var6.packedFlag256 = false;
            this.unit.unlink(obfuscationGuard ^ 26707);
          }
          fl.a(battlefield, -112);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "q.G(" + (battlefield != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, boolean param13, int param14, int param15, int param16) {
        int var17_int = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var34 = 0;
        int var35 = 0;
        int var42 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        int var33 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var41 = 0;
        int var35Lifetime1;
        int var36Lifetime1;
        int var37Lifetime1;
        int var38Lifetime1;
        int var39Lifetime1;
        int var40Lifetime1;
        int var36Lifetime2;
        int var36Lifetime3;
        int var37Lifetime2;
        int var38Lifetime2;
        int var39Lifetime2;
        int var40Lifetime2;
        var42 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param11 >= 0 &&
            param15 < tm.field_q) {
            if (param14 < 0 &&
              param12 < 0 &&
              0 > param9) {
              return;
            }
            if (param14 >= tm.field_l &&
              tm.field_l <= param12 &&
              tm.field_l <= param9) {
              return;
            }
            if (!param13) {
              return;
            }
            var34 = param11 - param15;
            if (param10 != param15) {
              var18 = param14 << 16;
              var17_int = param14 << 16;
              var30 = param4 << 16;
              var29 = param4 << 16;
              var26 = param1 << 16;
              var25 = param1 << 16;
              var22 = param8 << 16;
              var21 = param8 << 16;
              var35 = -param15 + param10;
              var20 = (param9 - param14 << 16) / var34;
              var19 = (-param14 + param12 << 16) / var35;
              if (var19 < var20) {
                var28 = (-param1 + param5 << 16) / var34;
                var32 = (param3 - param4 << 16) / var34;
                var33 = 0;
                var23 = (param6 - param8 << 16) / var35;
                var31 = (-param4 + param2 << 16) / var35;
                var27 = (-param1 + param7 << 16) / var35;
                var24 = (-param8 + param16 << 16) / var34;
              } else {
                var36 = var19;
                var19 = var20;
                var20 = var36;
                var23 = (param16 - param8 << 16) / var34;
                var27 = (-param1 + param5 << 16) / var34;
                var32 = (param2 - param4 << 16) / var35;
                var24 = (param6 - param8 << 16) / var35;
                var33 = 1;
                var31 = (-param4 + param3 << 16) / var34;
                var28 = (-param1 + param7 << 16) / var35;
              }
              boolean decompiledFrameRemainder0 = true;
              if (param15 < 0) {
                if (param10 < 0) {
                  param15 = -param15 + param10;
                  var30 = var30 + var32 * param15;
                  var21 = var21 + var23 * param15;
                  var18 = var18 + param15 * var20;
                  var29 = var29 + param15 * var31;
                  var22 = var22 + var24 * param15;
                  var26 = var26 + param15 * var28;
                  var25 = var25 + param15 * var27;
                  var17_int = var17_int + var19 * param15;
                  param15 = param10;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  param15 = -param15;
                  var18 = var18 + param15 * var20;
                  var17_int = var17_int + param15 * var19;
                  var29 = var29 + var31 * param15;
                  var25 = var25 + var27 * param15;
                  var30 = var30 + param15 * var32;
                  var21 = var21 + param15 * var23;
                  var22 = var22 + var24 * param15;
                  var26 = var26 + param15 * var28;
                  param15 = 0;
                }
              }
              if (decompiledFrameRemainder0) {
                var36Lifetime2 = tm.field_k[param15];
                while (param15 < param10) {
                  var37 = var17_int >> 16;
                  if (var37 < tm.field_l) {
                    var38 = -(var17_int >> 16) + (var18 >> 16);
                    if (var38 == 0) {
                      if (0 <= var37 &&
                        tm.field_l > var37) {
                        jn.a(var29, var21, 0, 33423424, var37 + var36Lifetime2, var38, var25, param0, 0, 0);
                      }
                    } else {
                      var39 = (var22 - var21) / var38;
                      var40 = (-var25 + var26) / var38;
                      var41 = (-var29 + var30) / var38;
                      if (tm.field_l <= var38 + var37) {
                        var38 = tm.field_l - (var37 + 1);
                      }
                      if (var37 >= 0) {
                        jn.a(var29, var21, var39, 33423424, var36Lifetime2 + var37, var38, var25, param0, var40, var41);
                      } else {
                        jn.a(var29 - var37 * var41, -(var37 * var39) + var21, var39, 33423424, var36Lifetime2, var37 + var38, var25 - var40 * var37, param0, var40, var41);
                      }
                    }
                  }
                  param15++;
                  if (tm.field_q <= param15) {
                    return;
                  }
                  var18 = var18 + var20;
                  var26 = var26 + var28;
                  var22 = var22 + var24;
                  var30 = var30 + var32;
                  var17_int = var17_int + var19;
                  var25 = var25 + var27;
                  var21 = var21 + var23;
                  var36Lifetime2 = var36Lifetime2 + SoftwareRaster.field_l;
                  var29 = var29 + var31;
                }
              }
              var36Lifetime3 = param11 - param10;
              if (0 != var36Lifetime3) {
                var37Lifetime2 = param9 << 16;
                var38Lifetime2 = param16 << 16;
                var39Lifetime2 = param5 << 16;
                var40Lifetime2 = param3 << 16;
                if (var33 == 0) {
                  var21 = param6 << 16;
                  var25 = param7 << 16;
                  var17_int = param12 << 16;
                  var29 = param2 << 16;
                } else {
                  var22 = param6 << 16;
                  var18 = param12 << 16;
                  var30 = param2 << 16;
                  var26 = param7 << 16;
                }
                var24 = (-var22 + var38Lifetime2) / var36Lifetime3;
                var31 = (-var29 + var40Lifetime2) / var36Lifetime3;
                var32 = (-var30 + var40Lifetime2) / var36Lifetime3;
                var28 = (-var26 + var39Lifetime2) / var36Lifetime3;
                var20 = (var37Lifetime2 - var18) / var36Lifetime3;
                var27 = (var39Lifetime2 - var25) / var36Lifetime3;
                var19 = (-var17_int + var37Lifetime2) / var36Lifetime3;
                var23 = (var38Lifetime2 - var21) / var36Lifetime3;
              } else {
                var28 = 0;
                var19 = 0;
                var23 = 0;
                var24 = 0;
                var20 = 0;
                var27 = 0;
                var32 = 0;
                var31 = 0;
              }
            } else {
              if (param15 == param11) {
                var20 = 0;
                var28 = 0;
                var25 = param1;
                var19 = 0;
                var23 = 0;
                var31 = 0;
                var29 = param4;
                var32 = 0;
                var22 = param6;
                var26 = param7;
                var18 = param12 << 16;
                var21 = param8;
                var30 = param2;
                var24 = 0;
                var27 = 0;
                var17_int = param14 << 16;
              } else {
                var35 = param11 - param10;
                if (param12 <= param14) {
                  var27 = (param5 - param7 << 16) / var35;
                  var20 = (-param14 + param9 << 16) / var34;
                  var24 = (-param8 + param16 << 16) / var34;
                  var17_int = param12 << 16;
                  var28 = (param5 - param1 << 16) / var34;
                  var21 = param6 << 16;
                  var31 = (param3 - param2 << 16) / var35;
                  var25 = param7 << 16;
                  var18 = param14 << 16;
                  var19 = (-param12 + param9 << 16) / var35;
                  var26 = param1 << 16;
                  var29 = param2 << 16;
                  var30 = param4 << 16;
                  var22 = param8 << 16;
                  var32 = (-param4 + param3 << 16) / var34;
                  var23 = (-param6 + param16 << 16) / var35;
                } else {
                  var31 = (-param4 + param3 << 16) / var34;
                  var32 = (-param2 + param3 << 16) / var35;
                  var21 = param8 << 16;
                  var24 = (-param6 + param16 << 16) / var35;
                  var19 = (-param14 + param9 << 16) / var34;
                  var22 = param6 << 16;
                  var17_int = param14 << 16;
                  var26 = param7 << 16;
                  var27 = (param5 - param1 << 16) / var34;
                  var20 = (-param12 + param9 << 16) / var35;
                  var23 = (-param8 + param16 << 16) / var34;
                  var25 = param1 << 16;
                  var29 = param4 << 16;
                  var30 = param2 << 16;
                  var28 = (param5 - param7 << 16) / var35;
                  var18 = param12 << 16;
                }
              }
              if (param15 < 0) {
                param15 = Math.min(-param15, param10 - param15);
                var29 = var29 + var31 * param15;
                var26 = var26 + var28 * param15;
                var22 = var22 + var24 * param15;
                var21 = var21 + param15 * var23;
                var18 = var18 + var20 * param15;
                var30 = var30 + var32 * param15;
                var25 = var25 + param15 * var27;
                var17_int = var17_int + param15 * var19;
                param15 = 0;
              }
              var33 = 0;
            }
            if (param15 < 0) {
              param15 = -param15;
              var18 = var18 + var20 * param15;
              var17_int = var17_int + param15 * var19;
              var30 = var30 + param15 * var32;
              var29 = var29 + param15 * var31;
              var25 = var25 + param15 * var27;
              var26 = var26 + param15 * var28;
              var22 = var22 + var24 * param15;
              var21 = var21 + var23 * param15;
              param15 = 0;
            }
            var35Lifetime1 = tm.field_k[param15];
            while (param15 < param11) {
              var36Lifetime1 = var17_int >> 16;
              if (var36Lifetime1 < tm.field_l) {
                var37Lifetime1 = -(var17_int >> 16) + (var18 >> 16);
                if (var37Lifetime1 != 0) {
                  var38Lifetime1 = (var22 - var21) / var37Lifetime1;
                  var39Lifetime1 = (-var25 + var26) / var37Lifetime1;
                  var40Lifetime1 = (var30 - var29) / var37Lifetime1;
                  if (var37Lifetime1 + var36Lifetime1 >= tm.field_l) {
                    var37Lifetime1 = -var36Lifetime1 + (tm.field_l - 1);
                  }
                  if (var36Lifetime1 >= 0) {
                    jn.a(var29, var21, var38Lifetime1, 33423424, var35Lifetime1 + var36Lifetime1, var37Lifetime1, var25, param0, var39Lifetime1, var40Lifetime1);
                  } else {
                    jn.a(-(var36Lifetime1 * var40Lifetime1) + var29, -(var36Lifetime1 * var38Lifetime1) + var21, var38Lifetime1, 33423424, var35Lifetime1, var36Lifetime1 + var37Lifetime1, var25 - var36Lifetime1 * var39Lifetime1, param0, var39Lifetime1, var40Lifetime1);
                  }
                } else {
                  if (var36Lifetime1 >= 0 &&
                    var36Lifetime1 < tm.field_l) {
                    jn.a(var29, var21, 0, 33423424, var35Lifetime1 + var36Lifetime1, var37Lifetime1, var25, param0, 0, 0);
                  }
                }
              }
              param15++;
              if (param15 >= tm.field_q) {
                return;
              }
              var35Lifetime1 = var35Lifetime1 + SoftwareRaster.field_l;
              var29 = var29 + var31;
              var26 = var26 + var28;
              var21 = var21 + var23;
              var22 = var22 + var24;
              var18 = var18 + var20;
              var17_int = var17_int + var19;
              var25 = var25 + var27;
              var30 = var30 + var32;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_79_0 = var17;
          stackIn_79_1 = new StringBuilder().append("q.E(");
          if (param0 == null) {
            stackIn_80_2 = "null";
          } else {
            stackIn_80_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_79_0), ((StringBuilder) (Object) stackIn_79_1).append(stackIn_80_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',').append(param16).append(')').toString());
        }
    }

    static {
        field_y = "<%0> has withdrawn a draw offer";
        field_D = false;
    }
}
