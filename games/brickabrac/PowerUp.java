/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PowerUp extends CircleBody {
    int activationTick;
    static boolean field_v;
    static String field_x;
    static volatile int keyboardIdleTicks;

    PowerUp(PowerUp source, int activationTick) {
        this(source.x256, source.y256, source.typeId, activationTick);
    }

    final static void detachKeyboardInput(int obfuscationGuard, java.awt.Component component) {
        try {
          component.removeKeyListener(DualLinkDeque.keyboardInput);
          component.removeFocusListener(DualLinkDeque.keyboardInput);
          if (obfuscationGuard != -2846) {
            PowerUp.c(91);
          }
          pl.keyChangeWriteIndex = -1;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ge.F(" + obfuscationGuard + ',' + (component != null ? "{...}" : "null") + ')');
        }
    }

    private PowerUp(int x256, int y256, int typeId, int activationTick) {
        super(x256, y256, 0, 1024, 2048, typeId);
        this.activationTick = activationTick;
    }

    public static void c(int param0) {
        field_x = null;
        if (param0 != 6) {
          PowerUp.c(-60);
        }
    }

    PowerUp(int x256, int y256, int typeId) {
        this(x256, y256, typeId, 0);
    }

    final static RasterCacheSurface a(int param0, int param1, int param2) {
        if (param2 != -20777) {
          java.awt.Component var4 = (java.awt.Component) null;
          PowerUp.detachKeyboardInput(58, (java.awt.Component) null);
        }
        return QuickChatCategoryRegistry.a(param2 ^ -20777, param1, param0, JungleBackground.field_s);
    }

    final boolean isSelfTargeted(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          StringBuilder var3 = (StringBuilder) null;
          this.computeSyncChecksum(61, (StringBuilder) null);
        }
        return DiagnosticTextLine.field_m[this.typeId];
    }

    final int computeSyncChecksum(int obfuscationGuard, StringBuilder diagnostics) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard >= 79) {
            stackIn_4_0 = 139 * this.activationTick + 131 << 5 ^ super.computeSyncChecksum(121, diagnostics);
            return stackIn_4_0;
          }
          stackIn_2_0 = -19;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ge.A(").append(obfuscationGuard).append(',');
          if (diagnostics == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void applyToBoard(PlayerBoard board, byte obfuscationGuard) {
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object var3 = null;
        Ball var3_ref = null;
        RuntimeException var3_ref2 = null;
        int var4 = 0;
        Ball var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        Ball var8 = null;
        int var9 = 0;
        int var10 = 0;
        Ball var11 = null;
        Ball var12 = null;
        Ball var13 = null;
        int var7Lifetime1;
        var3 = null;
        var10 = BrickABrac.field_J ? 1 : 0;
        try {
          if (board.boardState == 3) {
            return;
          }
          if (this.typeId != 3) {
            if (4 == this.typeId) {
              var3_ref = (Ball) (board.queuedBalls.first(-75));
              while (var3_ref != null) {
                var3_ref.extendPenetration((byte) 40, 150);
                var3_ref = (Ball) (board.queuedBalls.next((byte) 116));
              }
              var3_ref = (Ball) (board.activeBalls.first(-9));
              while (var3_ref != null) {
                var3_ref.extendPenetration((byte) 40, 150);
                var3_ref = (Ball) (board.activeBalls.next((byte) 116));
              }
            } else {
              if (5 != this.typeId) {
                if (6 != this.typeId) {
                  if (this.typeId == 7) {
                    board.paddle.shrink((byte) 127);
                  } else {
                    if (this.typeId == 8) {
                      board.paddle.increaseReboundSpeed(true);
                    } else {
                      if (this.typeId == 9) {
                        if (!board.activeBalls.isEmpty(false)) {
                          var12 = (Ball) (board.activeBalls.first(-63));
                          var3_ref = var12;
                          var4 = (31457280 - (var12.y256 << 8)) / var12.velocityY256;
                          var5 = (Ball) (board.activeBalls.first(-8));
                          while (var5 != null) {
                            var5.contactCount = 0;
                            var5.penetrationTicks = 0;
                            var6 = (31457280 - (var5.y256 << 8)) / var5.velocityY256;
                            if (var4 <= var6) {
                              if (var6 > var4) {
                                var3_ref.unlink((byte) 111);
                                var4 = var6;
                                var3_ref = var5;
                              }
                            } else {
                              var5.unlink((byte) 111);
                            }
                            var5 = (Ball) (board.activeBalls.next((byte) 116));
                          }
                        }
                        if (!board.queuedBalls.isEmpty(false)) {
                          if (!board.activeBalls.isEmpty(false)) {
                            board.queuedBalls.clear((byte) -62);
                          } else {
                            var3_ref = (Ball) (board.queuedBalls.first(obfuscationGuard - 108));
                            var3_ref.contactCount = 0;
                            var3_ref.penetrationTicks = 0;
                            board.queuedBalls.clear((byte) -63);
                            board.queuedBalls.addLast(var3_ref, (byte) 3);
                          }
                        }
                        while (board.paddle.sizeStage > 8) {
                          board.paddle.shrink((byte) 126);
                        }
                        board.paddle.field_H = 0;
                        board.paddle.catchTicks = 0;
                      } else {
                        if (10 == this.typeId) {
                          if (board.activeBalls.size(118) == 1) {
                            var11 = (Ball) (board.activeBalls.first(obfuscationGuard - 161));
                            var4 = CacheIoRequest.approximateSqrt256(var11.velocityY256 * var11.velocityY256 + var11.velocityX256 * var11.velocityX256, obfuscationGuard ^ 97) >> 8;
                            var5_int = var11.velocityX256;
                            var6 = var11.velocityY256;
                            for (var7 = 0; 7 > var7; var7++) {
                              board.activeBalls.addLast(new Ball(var11.x256, var11.y256, 0, 0), (byte) 3);
                            }
                            var7Lifetime1 = 0;
                            var8 = (Ball) (board.activeBalls.first(-39));
                            while (var8 != null) {
                              var8.velocityX256 = (15 * BrickABrac.cosine8192(obfuscationGuard + 1949, 1024 * var7Lifetime1) >> 8) + var5_int;
                              var8.velocityY256 = var6 + (15 * InteractiveGameClient.sine8192(var7Lifetime1 * 1024, -4097) >> 8);
                              var9 = CacheIoRequest.approximateSqrt256(var8.velocityY256 * var8.velocityY256 + var8.velocityX256 * var8.velocityX256, 2) >> 8;
                              var8.velocityX256 = var4 * var8.velocityX256 / var9;
                              var8.velocityY256 = var4 * var8.velocityY256 / var9;
                              var7Lifetime1++;
                              var8 = (Ball) (board.activeBalls.next((byte) 116));
                            }
                          }
                        } else {
                          if (this.typeId == 11) {
                            var3_ref = (Ball) (board.activeBalls.first(-54));
                            while (var3_ref != null) {
                              var3_ref.adjustSpeed(512, 128);
                              var3_ref = (Ball) (board.activeBalls.next((byte) 116));
                            }
                          } else {
                            if (this.typeId == 12) {
                              board.paddle.field_H = board.paddle.field_H + 300;
                            } else {
                              if (this.typeId == 13) {
                                var13 = (Ball) (board.activeBalls.first(obfuscationGuard - 224));
                                while (var13 != null) {
                                  var13.adjustSpeed(512, -128);
                                  var13 = (Ball) (board.activeBalls.next((byte) 116));
                                }
                              } else {
                                if (this.typeId != 14) {
                                  if (this.typeId == 15) {
                                    var3_ref = (Ball) (board.queuedBalls.first(-30));
                                    while (var3_ref != null) {
                                      var3_ref.extendPhase(obfuscationGuard - 150, 150);
                                      var3_ref = (Ball) (board.queuedBalls.next((byte) 116));
                                    }
                                    var3_ref = (Ball) (board.activeBalls.first(-88));
                                    while (var3_ref != null) {
                                      var3_ref.extendPhase(-128, 150);
                                      var3_ref = (Ball) (board.activeBalls.next((byte) 116));
                                    }
                                  } else {
                                    if (16 == this.typeId) {
                                      board.field_n = board.field_n + 16;
                                    } else {
                                      if (17 != this.typeId) {
                                        if (18 == this.typeId) {
                                          var3_ref = (Ball) (board.activeBalls.first(-73));
                                          while (var3_ref != null) {
                                            var3_ref.contactCount = var3_ref.contactCount + 40;
                                            var3_ref = (Ball) (board.activeBalls.next((byte) 116));
                                          }
                                        }
                                      } else {
                                        board.paddle.grow(82);
                                      }
                                    }
                                  }
                                } else {
                                  board.paddle.catchTicks = board.paddle.catchTicks + 150;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  if (board.bubbles.isEmpty(false)) {
                    board.bubbleTick = 0;
                    board.bubbleSeed = board.nextRandomInt(obfuscationGuard + 22);
                    board.recreateBubbles(1000);
                  }
                }
              } else {
                board.lives = board.lives + 1;
              }
            }
          } else {
            board.paddle.field_w = board.paddle.field_w + 250;
          }
          if (obfuscationGuard != 99) {
            PowerUp.c(-104);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref2 = decompiledCaughtException;
          stackIn_80_0 = var3_ref2;
          stackIn_80_1 = new StringBuilder().append("ge.C(");
          if (board == null) {
            stackIn_81_2 = "null";
          } else {
            stackIn_81_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_80_0), ((StringBuilder) (Object) stackIn_80_1).append(stackIn_81_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    PowerUp() {
        this(0, 0, 0, 0);
    }

    static {
        field_x = "If you do nothing the game will revert to normal view in <%0> second.";
        keyboardIdleTicks = 0;
        field_v = false;
    }
}
