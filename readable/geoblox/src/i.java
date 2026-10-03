/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class i {
    static Sprite avatarMaskRaster;

    public static void a(boolean param0) {
        try {
            avatarMaskRaster = null;
            if (param0) {
                avatarMaskRaster = (Sprite) null;
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "i.A(" + param0 + ')');
        }
    }

    final static GameplayEntity findOutermostAttachedEntity(byte methodGuard) {
        float maxDistanceSquared = 0.0f;
        RuntimeException var1 = null;
        Object farthestEntity = null;
        GameplayEntity candidateEntity = null;
        float candidateDistanceSquared = 0.0f;
        int controlFlowGuard = 0;
        Object stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        controlFlowGuard = Geoblox.field_C;
        try {
          maxDistanceSquared = 1.401298464324817e-45f;
          farthestEntity = null;
          candidateEntity = (GameplayEntity) ((Object) a.attachedEntities.lastForIteration(false));
          if (methodGuard >= -127) {
            i.a(false);
          }
          while (null != candidateEntity) {
            candidateDistanceSquared = (-240.0f + candidateEntity.positionY) * (-240.0f + candidateEntity.positionY) + (-320.0f + candidateEntity.positionX) * (candidateEntity.positionX - 320.0f);
            if (maxDistanceSquared < candidateDistanceSquared) {
              maxDistanceSquared = candidateDistanceSquared;
              farthestEntity = candidateEntity;
            }
            candidateEntity = (GameplayEntity) ((Object) a.attachedEntities.previousForIteration(0));
            if (controlFlowGuard == 0) {
              continue;
            }
            break;
          }
          stackIn_11_0 = farthestEntity;
          return (GameplayEntity) ((Object) stackIn_11_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "i.D(" + methodGuard + ')');
        }
    }

    final static void a(int param0, byte param1, java.awt.Canvas param2, int param3) {
        java.awt.Graphics var4 = null;
        int var5 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        try {
          try {
            var4 = param2.getGraphics();
            sh.mainRasterBuffer.drawImage(param3, var4, param0, 0);
            var5 = 56 % ((-32 - param1) / 59);
            var4.dispose();
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param2.repaint();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_7_0 = (RuntimeException) (var4_ref2);
          stackIn_7_1 = new StringBuilder().append("i.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, nf param2, int param3, boolean param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_11_0 = false;
        int stackIn_28_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_10_0;
        int var5_int = 0;
        RuntimeException var5 = null;
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
        var19 = Geoblox.field_C;
        try {
          var5_int = hj.a((byte) 58, (param3 - param0) * 3);
          var6 = param0 * 3;
          var7 = var5_int - 10;
          oe.l(0);
          if (param2.field_v > 0) {
            if (null != param2.field_n) {
              ma.a((byte) -35);
            }
          }
          ch.field_b = 0;
          var8 = 0;
          while (true) {
            L2: {
              if (var8 < param2.field_f) {
                var9 = param2.field_r[var8];
                var10 = param2.field_B[var8];
                var11 = param2.field_c[var8];
                stackOut_10_0 = param4;
                stackIn_49_0 = stackOut_10_0 ? 1 : 0;
                stackIn_11_0 = stackOut_10_0;
                if (var19 != 0) {
                  break L2;
                }
                L4: {
                  if (stackIn_11_0) {
                    var12 = sh.field_x[var9];
                    var13 = dj.field_N[var9];
                    var14 = sh.field_x[var10] - var12;
                    var15 = sh.field_x[var11] - var12;
                    var16 = dj.field_N[var10] - var13;
                    var17 = -var13 + dj.field_N[var11];
                    if (-(var16 * var15) + var14 * var17 >= 0) {
                      break L4;
                    }
                  }
                  var12 = CachedArchiveSource.field_j[var9];
                  if (-2147483648 == var12) {
                    if (var19 == 0) {
                      break L4;
                    }
                  }
                  var13 = CachedArchiveSource.field_j[var10];
                  if (-2147483648 == var13) {
                    if (var19 == 0) {
                      break L4;
                    }
                  }
                  var14 = CachedArchiveSource.field_j[var11];
                  if (var14 != -2147483648) {
                    var15 = var13 + (var12 + var14 - var6);
                    if (var7 < 0) {
                      stackIn_28_0 = var15 << -var7;
                    } else {
                      stackIn_28_0 = var15 >> var7;
                    }
                    var16 = -stackIn_28_0 + (-1 + ch.field_d.length);
                    var17 = ch.field_d[var16];
                    while (true) {
                      L10: {
                        if (var17 >> 4 != 0) {
                          var16--;
                          stackIn_39_0 = var16;
                          if (var19 != 0) {
                            break L10;
                          }
                          if (stackIn_39_0 < 0) {
                            System.err.println("Out of range!");
                            if (var19 == 0) {
                              break L4;
                            }
                          }
                          var17 = ch.field_d[var16];
                          if (var19 == 0) {
                            continue;
                          }
                        }
                        stackIn_39_0 = (var16 << 4) + var17;
                      }
                      var18 = stackIn_39_0;
                      pj.field_i[var18] = var8;
                      ch.field_d[var16] = 1 + var17;
                      if (0 < param2.field_v) {
                        if (null != param2.field_n) {
                          dupTemp$0 = param2.field_n[var8];
                          uh.field_x[dupTemp$0] = uh.field_x[dupTemp$0] + 1;
                        }
                      }
                      ch.field_b = ch.field_b + 1;
                      break L4;
                    }
                  }
                }
                var8++;
                if (var19 == 0) {
                  continue;
                }
              }
              stackIn_49_0 = -1;
            }
            L14: {
              L15: {
                if (stackIn_49_0 > ~param2.field_v) {
                  if (null != param2.field_n) {
                    var8 = 0;
                    var9 = 0;
                    while (true) {
                      if (uh.field_x.length <= var9) {
                        break L15;
                      }
                      var10 = uh.field_x[var9];
                      uh.field_x[var9] = var8;
                      var8 = var8 + var10;
                      var9++;
                      if (var19 != 0) {
                        break L14;
                      }
                      if (var19 == 0) {
                        continue;
                      }
                      break L15;
                    }
                  }
                }
              }
              if (param1 != 22) {
                avatarMaskRaster = (Sprite) null;
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_68_0 = (RuntimeException) (var5);
          stackIn_68_1 = new StringBuilder().append("i.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
    }
}
