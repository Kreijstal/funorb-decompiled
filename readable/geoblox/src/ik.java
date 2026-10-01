/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ik {
    static int field_a;
    static String field_b;

    final static void a(re param0, int param1, byte param2) {
        pk var3 = fj.field_q;
        var3.a(param1, (byte) -77);
        var3.d((byte) 123, param0.field_k);
        if (param2 < 80) {
            return;
        }
        try {
            var3.d((byte) -49, param0.field_g);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ik.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = Geoblox.field_C;
        try {
          L0: {
            SoftwareRasterizer.c(param0, param2, param3 - -1, 10000536);
            SoftwareRasterizer.c(param0, param2 + param1, param3 + 1, 12105912);
            var5_int = 1;
            if (SoftwareRasterizer.clipTop > param2 + var5_int) {
              var5_int = -param2 + SoftwareRasterizer.clipTop;
            }
            var6 = param1;
            if (SoftwareRasterizer.clipBottom < var6 + param2) {
              var6 = -param2 + SoftwareRasterizer.clipBottom;
            }
            var7 = var5_int;
            if (param4 != -1540604944) {
              field_b = (String) null;
            }
            L4: while (var7 < var6) {
              var8 = 152 - -(48 * var7 / param1);
              var9 = var8 << -1623895256 | var8 << -1540604944 | var8;
              SoftwareRasterizer.framebuffer[param0 + SoftwareRasterizer.stride * (var7 + param2)] = var9;
              SoftwareRasterizer.framebuffer[param3 + (param2 + var7) * SoftwareRasterizer.stride + param0] = var9;
              var7++;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var5), "ik.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 48) {
            field_a = -51;
        }
        field_b = null;
    }

    final static boolean linkTouchingEntities(GameplayEntity firstEntity, GameplayEntity secondEntity, boolean param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_77_0 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        StringBuilder stackIn_83_1 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5_int = 0;
        GameplayEntity var5 = null;
        int var6_int = 0;
        GameplayEntity var6 = null;
        int var7 = 0;
        var7 = Geoblox.field_C;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= secondEntity.relatedEntityCount) {
                L2: {
                  var3_int = param2 ? 1 : 0;
                  var4 = 0;
                  fieldTemp$0 = secondEntity.relatedEntityCount;
                  secondEntity.relatedEntityCount = secondEntity.relatedEntityCount + 1;
                  secondEntity.relatedEntities[fieldTemp$0] = firstEntity;
                  fieldTemp$1 = firstEntity.relatedEntityCount;
                  firstEntity.relatedEntityCount = firstEntity.relatedEntityCount + 1;
                  firstEntity.relatedEntities[fieldTemp$1] = secondEntity;
                  if (secondEntity.entitySpriteKindId == 0) {
                    if (firstEntity.entitySpriteKindId == 0) {
                      break L2;
                    }
                  }
                  var5_int = 0;
                  var6_int = 0;
                  if (-2 != (secondEntity.entitySpriteKindId ^ -1)) {
                    stackIn_14_0 = 0;
                  } else {
                    stackIn_14_0 = 1;
                  }


                  if ((firstEntity.entitySpriteKindId ^ -1) != -2) {

                    stackIn_17_1 = 0;
                  } else {

                    stackIn_17_1 = 1;
                  }
                  L6: {
                    if ((stackIn_14_0 ^ stackIn_17_1) != 0) {
                      if (-2 == (secondEntity.entitySpriteKindId ^ -1)) {
                        if (firstEntity.entitySpriteKindId == 0) {
                          secondEntity.configureEntitySprite(320, secondEntity.entityCategoryKey, firstEntity.spriteVariantIndex, 0);
                          break L6;
                        }
                      }
                      if (secondEntity.entitySpriteKindId == 0) {
                        if (firstEntity.entitySpriteKindId == 1) {
                          var5_int = 1;
                          break L6;
                        }
                      }
                      if (firstEntity.entitySpriteKindId == 2) {
                        if (-2 == (secondEntity.entitySpriteKindId ^ -1)) {
                          var3_int = 1;
                          var4 = 1;
                          var6_int = 1;
                          secondEntity.configureEntitySprite(320, secondEntity.entityCategoryKey, firstEntity.spriteVariantIndex, 0);
                          break L6;
                        }
                      }
                      if (1 == firstEntity.entitySpriteKindId) {
                        if (-3 == (secondEntity.entitySpriteKindId ^ -1)) {
                          secondEntity.configureEntitySprite(320, firstEntity.entityCategoryKey, secondEntity.spriteVariantIndex, 0);
                          var5_int = 1;
                          var3_int = 1;
                        }
                      }
                    } else {
                      if (2 != secondEntity.entitySpriteKindId) {
                        if ((firstEntity.entitySpriteKindId ^ -1) != -3) {
                          break L6;
                        }
                      }
                      if ((secondEntity.entitySpriteKindId ^ -1) == -3) {
                        if (2 != firstEntity.entitySpriteKindId) {
                          secondEntity.configureEntitySprite(320, firstEntity.entityCategoryKey, secondEntity.spriteVariantIndex, firstEntity.entitySpriteKindId);
                          var3_int = 1;
                          break L6;
                        }
                      }
                      if (-3 == (firstEntity.entitySpriteKindId ^ -1)) {
                        if (2 != secondEntity.entitySpriteKindId) {
                          var4 = 1;
                          var6_int = 1;
                          var3_int = 1;
                          firstEntity.configureEntitySprite(320, secondEntity.entityCategoryKey, firstEntity.spriteVariantIndex, secondEntity.entitySpriteKindId);
                        }
                      }
                    }
                  }
                  L12: {
                    if (var5_int == 0) {
                      if (var6_int == 0) {
                        break L12;
                      }
                    }
                    bh.a(var6_int != 0, secondEntity, 1, firstEntity, var5_int != 0);
                  }
                  if (-2 == (secondEntity.entitySpriteKindId ^ -1)) {
                    if (firstEntity.entitySpriteKindId == 1) {
                      if (firstEntity.entityCategoryKey == secondEntity.entityCategoryKey) {
                        secondEntity.sameCategoryEntityCount = secondEntity.sameCategoryEntityCount + 1;
                        firstEntity.sameCategoryEntityCount = firstEntity.sameCategoryEntityCount + 1;
                        break L2;
                      }
                    }
                  }
                  if (secondEntity.entitySpriteKindId == 2) {
                    if (firstEntity.entitySpriteKindId == 2) {
                      if (firstEntity.spriteVariantIndex == secondEntity.spriteVariantIndex) {
                        secondEntity.sameVariantEntityCount = secondEntity.sameVariantEntityCount + 1;
                        firstEntity.sameVariantEntityCount = firstEntity.sameVariantEntityCount + 1;
                      }
                    }
                  }
                }
                if (secondEntity.entitySpriteKindId == 0) {
                  if (-1 == (firstEntity.entitySpriteKindId ^ -1)) {
                    if (secondEntity.entityCategoryKey == firstEntity.entityCategoryKey) {
                      secondEntity.sameCategoryEntityCount = secondEntity.sameCategoryEntityCount + 1;
                      firstEntity.sameCategoryEntityCount = firstEntity.sameCategoryEntityCount + 1;
                    }
                    if (firstEntity.spriteVariantIndex == secondEntity.spriteVariantIndex) {
                      secondEntity.sameVariantEntityCount = secondEntity.sameVariantEntityCount + 1;
                      firstEntity.sameVariantEntityCount = firstEntity.sameVariantEntityCount + 1;
                    }
                  }
                }
                L17: {
                  if (var3_int != 0) {
                    for (var5_int = 0; secondEntity.relatedEntityCount > var5_int; var5_int++) {
                      secondEntity.relatedEntities[var5_int].removeRelatedEntity(secondEntity, 0);
                    }
                    var5 = secondEntity;
                    secondEntity.sameCategoryEntityCount = 0;
                    var6 = secondEntity;
                    var6.sameVariantEntityCount = 0;
                    var5.relatedEntityCount = 0;
                    secondEntity.entityQueue = ji.movingEntities;
                    secondEntity.detachedFromBoard = true;
                    break L17;
                  }
                }
                L19: {
                  if (var4 != 0) {
                    for (var5_int = 0; firstEntity.relatedEntityCount > var5_int; var5_int++) {
                      firstEntity.relatedEntities[var5_int].removeRelatedEntity(firstEntity, 0);
                    }
                    var5 = firstEntity;
                    firstEntity.sameCategoryEntityCount = 0;
                    var6 = firstEntity;
                    var5.relatedEntityCount = 0;
                    firstEntity.touchesAvatar = false;
                    firstEntity.detachedFromBoard = true;
                    firstEntity.entityQueue = ji.movingEntities;
                    var6.sameVariantEntityCount = 0;
                    break L19;
                  }
                }
                stackIn_77_0 = var3_int;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (secondEntity.relatedEntities[var3_int] == firstEntity) {
                  stackIn_6_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var3_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_80_0 = (RuntimeException) (var3);

          stackIn_80_1 = new StringBuilder().append("ik.D(");

          if (firstEntity == null) {
            stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
            stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
            stackIn_81_2 = "null";
          } else {
            stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
            stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
            stackIn_81_2 = "{...}";
          }


          stackIn_83_1 = ((StringBuilder) (Object) stackIn_81_1).append(stackIn_81_2).append(',');

          if (secondEntity == null) {
            stackIn_81_0 = (RuntimeException) ((Object) stackIn_81_0);
            stackIn_84_1 = (StringBuilder) ((Object) stackIn_83_1);
            stackIn_84_2 = "null";
          } else {
            stackIn_81_0 = (RuntimeException) ((Object) stackIn_81_0);
            stackIn_84_1 = (StringBuilder) ((Object) stackIn_83_1);
            stackIn_84_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_81_0), ((StringBuilder) (Object) stackIn_84_1).append(stackIn_84_2).append(',').append(param2).append(')').toString());
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0 != 0;
        } else {
          return stackIn_77_0 != 0;
        }
    }

    static {
        field_b = "Waiting for fonts";
    }
}
