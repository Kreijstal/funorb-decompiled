/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ih {
    static String ticketingOneUnreadText;
    static df field_a;
    static h field_c;

    final static void b(int param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = Geoblox.field_C;
        try {
            eg.field_p.a(111);
            var1_int = 10 / ((param0 - 68) / 57);
            for (var2 = 0; var2 < 32; var2++) {
                pb.field_p[var2] = 0L;
            }
            for (var1_int = 0; var1_int < 32; var1_int++) {
                tl.field_l[var1_int] = 0L;
            }
            nf.field_w = 0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ih.C(" + param0 + ')');
        }
    }

    final static boolean areEntityQueuesSettled(int param0) {
        int stackIn_8_0 = 0;
        if (param0 == 0) {
          L0: {
            if (ji.movingEntities.isEmpty(13519)) {
              if (SecondaryDeque.spawnQueue.isEmpty(13519)) {
                if (bh.field_c.isEmpty(param0 + 13519)) {
                  if (!jl.avatarShockContactPending) {
                    stackIn_8_0 = 1;
                    break L0;
                  }
                }
              }
            }
            stackIn_8_0 = 0;
          }
          return stackIn_8_0 != 0;
        } else {
          return true;
        }
    }

    public static void a(byte param0) {
        if (param0 <= 46) {
            return;
        }
        field_a = null;
        field_c = null;
        ticketingOneUnreadText = null;
    }

    final static void linkEntityAtMaskContacts(int param0, int contactY, GameplayEntity entity, int contactX) {
        int var22 = 0;
        int var23 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        String stackIn_56_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
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
        GameplayEntity var24 = null;
        int var25 = 0;
        Object var26 = null;
        GameplayEntity var26_ref = null;
        int var27 = 0;
        int[] var34 = null;
        int[] var35 = null;
        var26 = null;
        var27 = Geoblox.field_C;
        try {
          L0: {
            var4_int = contactX + -(vf.spriteScratchRaster.field_s / 2);
            var4_int = var4_int + vf.spriteScratchRaster.trimX;
            var5 = -(vf.spriteScratchRaster.field_o / 2) + contactY;
            var5 = var5 + vf.spriteScratchRaster.trimY;
            var6 = -var4_int + bk.boardOwnershipRaster.trimX;
            var7 = bk.boardOwnershipRaster.trimY - var5;
            var8 = vf.spriteScratchRaster.width;
            if (var8 <= var6) {
              stackIn_4_0 = 0;
            } else {
              stackIn_4_0 = bk.boardOwnershipRaster.width;
            }
            var9 = stackIn_4_0;
            var10 = vf.spriteScratchRaster.height;
            if (var7 >= var10) {
              stackIn_7_0 = 0;
            } else {
              stackIn_7_0 = bk.boardOwnershipRaster.height;
            }
            var11 = stackIn_7_0;
            if (~var6 >= param0) {
              stackIn_10_0 = 0;
            } else {
              stackIn_10_0 = var6;
            }
            var12 = stackIn_10_0;
            if (var7 > 0) {
              stackIn_13_0 = var7;
            } else {
              stackIn_13_0 = 0;
            }
            var13 = stackIn_13_0;
            var14 = var6 - -var9;
            if (var14 > var8) {
              var14 = var8;
            }
            var15 = var11 + var7;
            if (var15 > var10) {
              var15 = var10;
            }
            var14 = var14 - var12;
            var15 = var15 - var13;
            var16 = var8 * var13 - -var12;
            var17 = -var14 + var8;
            var18 = var12 + (-var6 + (-var7 + var13) * var9);
            var19 = -var14 + var9;
            var34 = vf.spriteScratchRaster.pixels;
            var35 = bk.boardOwnershipRaster.pixels;
            for (var22 = var15; 0 < var22; var22--) {
              for (var23 = var14; var23 > 0; var23--) {
                if (var34[var16] != 0) {
                  if (var35[var18] != 16777215) {
                    if (var35[var18] != 0) {
                      var24 = tl.entitiesById[-1 + var35[var18]];
                      if (var24.entitySpriteKindId != 2) {
                        stackIn_35_0 = 0;
                      } else {
                        stackIn_35_0 = 1;
                      }


                      if (entity.entitySpriteKindId != 2) {

                        stackIn_38_1 = 0;
                      } else {

                        stackIn_38_1 = 1;
                      }
                      var25 = stackIn_35_0 ^ stackIn_38_1;
                      if (var25 != 0) {
                        var26_ref = (GameplayEntity) ((Object) ra.availableEntities.removeLast(1));
                        if (var26_ref != null) {
                          L13: {
                            if (entity.entitySpriteKindId == 2) {
                              if (var25 != 0) {
                                var26_ref.initializeEntityMotion(param0 ^ -97, (float)contactX, 8, entity.velocityX, entity.spriteVariantIndex, 0, entity.spriteAngleRadians, (float)contactY, entity.velocityY, entity.entityCategoryKey, 0.0f);
                                break L13;
                              }
                            }
                            var26_ref.initializeEntityMotion(-121, var24.positionX, 8, var24.velocityX, var24.spriteVariantIndex, 0, var24.spriteAngleRadians, var24.positionY, var24.velocityY, var24.entityCategoryKey, 0.0f);
                          }
                          bh.field_c.addLast(-42, var26_ref);
                        }
                      }
                      if (ik.linkTouchingEntities(var24, entity, false)) {
                        decompiledRegionSelector0 = 1;
                        break L0;
                      }
                    }
                  } else {
                    entity.touchesAvatar = true;
                    if (entity.entitySpriteKindId != 3) {
                      if (4 == entity.entitySpriteKindId) {
                        jc.requestAvatarFeedback(7, false);
                      }
                    } else {
                      jl.avatarShockContactPending = true;
                    }
                  }
                }
                var18++;
                var16++;
              }
              var18 = var18 + var19;
              var16 = var16 + var17;
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_55_0 = (RuntimeException) (var4);

          stackIn_55_1 = new StringBuilder().append("ih.A(").append(param0).append(',').append(contactY).append(',');

          if (entity == null) {
            stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
            stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
            stackIn_56_2 = "null";
          } else {
            stackIn_56_0 = (RuntimeException) ((Object) stackIn_55_0);
            stackIn_56_1 = (StringBuilder) ((Object) stackIn_55_1);
            stackIn_56_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_56_0), ((StringBuilder) (Object) stackIn_56_1).append(stackIn_56_2).append(',').append(contactX).append(')').toString());
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static byte[] a(int param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 119) {
            stackIn_4_0 = pf.field_O.a(0, param1, "");
            decompiledRegionSelector0 = 1;
          } else {
            stackIn_2_0 = (byte[]) null;
            decompiledRegionSelector0 = 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = (RuntimeException) (var2);

          stackIn_7_1 = new StringBuilder().append("ih.E(").append(param0).append(',');

          if (param1 == null) {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "null";
          } else {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(')').toString());
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    static {
        ticketingOneUnreadText = "You have 1 unread message!";
        field_a = null;
    }
}
