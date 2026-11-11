/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class MenuScreen extends GameScreen {
    static int field_j;
    int itemSpacing;
    int field_p;
    int itemX;
    MenuEntry[] items;
    int firstItemY;
    MenuInputState field_k;
    int itemRight;
    static IntrusiveDeque field_l;
    static String field_h;
    boolean field_o;

    void draw(byte param0, boolean param1) {
        int discarded$1 = 0;
        RuntimeException runtimeException = null;
        int var3_int = 0;
        MenuEntry var4 = null;
        int var5 = 0;
        boolean stackIn_4_0 = false;
        MenuEntry stackIn_12_0;
        boolean stackIn_12_1;
        boolean stackIn_12_2;
        int stackIn_12_3;
        boolean stackIn_13_4;
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          var3_int = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(this.field_k.itemCount > var3_int)))) {
            var4 = this.items[var3_int];
            stackOut_3_0 = this.isItemEnabled(var3_int, param0 + 28);
            stackIn_16_0 = stackOut_3_0 ? 1 : 0;
            stackIn_4_0 = stackOut_3_0;
            if (var5 == 0) {
              if (stackIn_4_0) {
                stackIn_12_0 = var4;
                stackIn_12_1 = this.a(param0 + 15, var3_int);
                stackIn_12_2 = this.isActionEnabled(var4.field_g, -30487);
                stackIn_12_3 = 1;
                stackIn_13_4 = (this.field_k.selectedIndex == var3_int);
                ((MenuEntry) (Object) stackIn_12_0).draw(stackIn_12_1, stackIn_12_2, stackIn_12_3, stackIn_13_4);
              }
              var3_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_16_0 = param0;
          }
          if (stackIn_16_0 != -28) {
            discarded$1 = this.f(-3, -5);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "wv.I(" + param0 + ',' + param1 + ')');
        }
    }

    void activateItem(boolean param0, boolean param1, int param2) {
        boolean discarded$0 = false;
        int stackIn_44_0 = 0;
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
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var11 = TombRacer.field_G ? 1 : 0;
        try {
          if (0 <= param2 &&
            this.items.length > param2) {
            var4_int = this.items[param2].field_g;
            var5 = this.field_k.isActivated(param0) ? 1 : 0;
            if (var5 != 0) {
              dsa.a(-80);
              discarded$0 = this.performAction(var4_int, param1, (byte) 119);
            }
            var8 = var4_int;
            if ((5 != var8 ||
              var11 != 0) && var8 != 6) {
              return;
            }
            if (5 == var8 &&
              var11 == 0 || var11 != 0) {
              var6 = 0;
              if (this.field_k.isHomePressed(0) &&
                tk.a(-22636) > 0) {
                qfa.a(0, 20815);
                var6 = 1;
              }
              if (this.field_k.isEndPressed(75) &&
                tk.a(-22636) < CircleMovementLocomotor.e((byte) 71)) {
                var6 = 1;
                qfa.a(CircleMovementLocomotor.e((byte) 126), 20815);
              }
              if (this.field_k.isPointerHeld((byte) -128)) {
                var8 = -24 + (aaa.a(false) >> 1);
                var9 = -var8 + AgeValidator.field_j;
                var10 = var9 << 1;
                if (var10 > 0) {
                  if (!(CircleMovementLocomotor.e((byte) 68) > var10)) {
                    var10 = CircleMovementLocomotor.e((byte) 61);
                    if (var11 != 0) {
                      var10 = 0;
                    }
                  }
                } else {
                  var10 = 0;
                }
                stackIn_44_0 = (~tk.a(-22636) == ~var10) ? 0 : 1;
                var6 = stackIn_44_0;
                qfa.a(var10, 20815);
              }
              if (this.field_k.isLeftPressed(96) &&
                0 < tk.a(-22636)) {
                var6 = 1;
                to.b(11);
              }
              if (this.field_k.isRightPressed(94) &&
                tk.a(-22636) < CircleMovementLocomotor.e((byte) 87)) {
                var6 = 1;
                EventFactory.a((byte) -117);
              }
              if (var6 == 0) {
                return;
              }
              if (this.field_k.isPointerHeld((byte) -127) &&
                AgeValidator.field_j % 5 != 0) {
                return;
              }
              it.a(255, 198);
              if (var11 == 0) {
                return;
              }
            }
            var7 = CircleMovementLocomotor.e((byte) 124);
            if (this.field_k.isHomePressed(0)) {
              mqa.a(0, (byte) -118);
            }
            if (this.field_k.isEndPressed(-6)) {
              mqa.a(var7, (byte) 124);
            }
            if (this.field_k.isPointerHeld((byte) -128)) {
              var8Lifetime1 = -24 + (aaa.a(false) >> 1);
              var9Lifetime1 = -var8Lifetime1 + AgeValidator.field_j;
              var10Lifetime1 = var9Lifetime1 << 1;
              if (var10Lifetime1 <= 0) {
                mqa.a(0, (byte) 121);
                if (var11 != 0) {
                  if (var10Lifetime1 < var7) {
                    mqa.a(var10Lifetime1, (byte) -48);
                    mqa.a(var7, (byte) 85);
                  } else {
                    mqa.a(var7, (byte) 85);
                  }
                }
              } else {
                if (var10Lifetime1 < var7) {
                  mqa.a(var10Lifetime1, (byte) -48);
                  if (var11 != 0) {
                    mqa.a(var7, (byte) 85);
                  }
                } else {
                  mqa.a(var7, (byte) 85);
                }
              }
            }
            if (this.field_k.isLeftPressed(96)) {
              bv.d((byte) -55);
            }
            if (this.field_k.isRightPressed(97)) {
              ila.a(true);
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "wv.V(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    boolean isActionEnabled(int param0, int param1) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -30487) {
            discarded$1 = this.findItemAt(-53, false, -31);
          }
          if (param0 != 28) {
            return true;
          }
          stackIn_5_0 = TextWidgetPainter.a(param1 ^ -30555);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "wv.T(" + param0 + ',' + param1 + ')');
        }
    }

    MenuScreen(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_o = true;
        try {
          this.itemX = param1;
          this.itemSpacing = param4;
          this.itemRight = param2;
          if (null == param5) {
            param5 = new int[]{};
          }
          this.firstItemY = param3;
          this.setItems(22174, param5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("wv.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    int getItemX(byte param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < 111) {
            this.isFullScreen(61);
          }
          stackIn_4_0 = this.itemX;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "wv.F(" + param0 + ',' + param1 + ')');
        }
    }

    void update(boolean param0, boolean param1, int param2) {
        MenuEntry stackIn_11_0 = null;
        boolean stackIn_11_1 = false;
        boolean stackIn_12_2 = false;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        SoundEventPlayer var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (lca.a(false)) {
            return;
          }
          var4_int = 0;
          scanLoop1: while (true) {
            if (this.field_k.itemCount > var4_int) {
              if (var5 == 0) {
                stackIn_11_0 = this.items[var4_int];
                stackIn_11_1 = param0;
                stackIn_12_2 = (~this.field_k.selectedIndex == ~var4_int);
                ((MenuEntry) (Object) stackIn_11_0).update(stackIn_11_1, stackIn_12_2, param1, 6);
                if (6 == this.items[var4_int].field_g) {
                  this.items[var4_int].field_i = this.items[var4_int - 1].field_i + 33;
                }
                var4_int++;
                continue;
              }
            } else {
              if (param2 != 15283) {
                this.c(34);
              }
              if (!param1) {
                break scanLoop1;
              }
              if (LegacyOpenGlEnvironmentWaterEffect.field_d) {
                break scanLoop1;
              }
              if (ColouriseOperator.field_q) {
                break scanLoop1;
              }
              this.field_k.updatePointer(this.findItemAt(RidgedNoise3D.field_p, true, PasswordValidator.field_m), 71, this.findItemAt(GridWidgetContainer.field_B, true, AgeValidator.field_j));
            }
            if (this.field_k.selectedIndex != -1) {
              this.activateItem(false, true, this.field_k.selectedIndex);
            }
            break;
          }
          if (param1 &&
            param0) {
            if (this.field_c != 7 &&
              8 != this.field_c) {
              return;
            }
            if (SecondaryNodeDequeIterator.field_a != null &&
              null != SecondaryNodeDequeIterator.field_a.matchState &&
              SecondaryNodeDequeIterator.field_a.matchState.getPlayerRoom(param2 ^ 15283, SecondaryNodeDequeIterator.field_a.getViewedPlayerIndex(param2 ^ 15336)) != null) {
              var4 = (SoundEventPlayer) (SecondaryNodeDequeIterator.field_a.matchState.getPlayerRoom(0, SecondaryNodeDequeIterator.field_a.getViewedPlayerIndex(param2 ^ 15326)).soundQueue);
              if (var4 != null) {
                var4.a(108, true);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4_ref), "wv.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    int getItemRight(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -48) {
            this.items = (MenuEntry[]) null;
          }
          stackIn_4_0 = this.itemRight;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "wv.O(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean isFullScreen(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 31923) {
            this.getItemY(-42, 120);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "wv.L(" + param0 + ')');
        }
    }

    private final boolean d(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (4 != param1 &&
            param1 != 13 &&
            14 != param1 &&
            param1 != 6 &&
            30 != param1 &&
            param1 != 41) {
            if (param0 <= -64) {
              return false;
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "wv.U(" + param0 + ',' + param1 + ')');
        }
    }

    final boolean a(boolean param0, MenuScreen param1) {
        RuntimeException var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            this.itemSpacing = 44;
          }
          stackIn_7_0 = !(this.field_p >= param1.field_p);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("wv.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final boolean performAction(int param0, boolean param1, byte param2) {
        boolean stackIn_312_0 = false;
        boolean stackIn_318_0 = false;
        boolean stackIn_324_0 = false;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          if (param2 <= 117) {
            return false;
          }
          if (!this.isActionEnabled(param0, -30487)) {
            return true;
          }
          boolean decompiledFrameRemainder0 = true;
          var7 = param0;
          if (var7 != 22 ||
            var8 != 0) {
            if (var7 == 1) {
              ConstrainToRectangleLocomotor.a(param1, 9, (byte) -16);
              return true;
            }
            if (2 == var7 &&
              var8 == 0) {
              return true;
            }
            if (3 == var7 &&
              var8 == 0) {
              if (!TextWidgetPainter.a(27)) {
                uv.d(30785);
              } else {
                ConstrainToRectangleLocomotor.a(param1, 11, (byte) 106);
                PasswordValidator.field_n = -2;
              }
              return true;
            }
            if (var7 == 12) {
              if (this.field_c != 7) {
                ConstrainToRectangleLocomotor.a(param1, 4, (byte) -11);
                if (var8 != 0) {
                  ConstrainToRectangleLocomotor.a(param1, 12, (byte) -113);
                }
              } else {
                ConstrainToRectangleLocomotor.a(param1, 12, (byte) -113);
              }
              return true;
            }
            if (35 == var7 &&
              var8 == 0) {
              if (SecondaryNodeDequeIterator.field_a != null &&
                null != SecondaryNodeDequeIterator.field_a.matchState &&
                SecondaryNodeDequeIterator.field_a.field_D &&
                !SecondaryNodeDequeIterator.field_a.isSpectating((byte) 90)) {
                ql.field_k.writeCipheredOpcode(65, -2988);
                ConstrainToRectangleLocomotor.a(param1, -1, (byte) 105);
                return true;
              }
              return true;
            }
            if (var7 == 33) {
              if (null != SecondaryNodeDequeIterator.field_a) {
                SecondaryNodeDequeIterator.field_a.endMatch(param1, true, 0);
                r.a(0, SecondaryNodeDequeIterator.field_a.isSpectating((byte) 86));
              }
              return true;
            }
            if (13 == var7 &&
              var8 == 0) {
              ConstrainToRectangleLocomotor.a(param1, 5, (byte) -112);
              return true;
            }
            if (14 == var7) {
              ConstrainToRectangleLocomotor.a(param1, 6, (byte) 82);
              return true;
            }
            if (var7 == 0 &&
              var8 == 0) {
              ConstrainToRectangleLocomotor.a(param1, 0, (byte) -17);
              return true;
            }
            if (var7 == 4 &&
              var8 == 0) {
              ConstrainToRectangleLocomotor.a(param1, 2, (byte) 85);
              return true;
            }
            if (var7 == 8) {
              ConstrainToRectangleLocomotor.a(param1, 3, (byte) -101);
              return true;
            }
            if (var7 != 5 &&
              var7 != 6) {
              if (var7 == 7) {
                OpenGlTexture.e((byte) -122);
                return true;
              }
              if (var7 == 9) {
                ArchiveRequest.openQuitPage(di.a(94), (byte) -112);
                return true;
              }
              if (var7 == 16) {
                SecondaryNodeDequeIterator.field_a.endMatch(param1, true, 0);
                return true;
              }
              if (41 == var7 &&
                var8 == 0) {
                var4_int = SecondaryNodeDequeIterator.field_a.m(-1);
                var5 = SecondaryNodeDequeIterator.field_a.getCharacterChoice(0, 9);
                var6 = SecondaryNodeDequeIterator.field_a.matchState.field_K;
                TextLayout.a(var4_int, (byte) 101, var6);
                SecondaryNodeDequeIterator.field_a.setCharacterChoice(var5, 50, 0);
                SecondaryNodeDequeIterator.field_a.initPlayers((byte) -49);
                SecondaryNodeDequeIterator.field_a.startRound(125);
                if (3 == var6) {
                  SecondaryNodeDequeIterator.field_a.startTutorial((byte) 110);
                }
                return true;
              }
              if (var7 == 15) {
                ConstrainToRectangleLocomotor.a(param1, -1, (byte) 107);
                return true;
              }
              if (17 == var7 &&
                var8 == 0) {
                ConstrainToRectangleLocomotor.a(param1, 7, (byte) -101);
                return true;
              }
              if (18 == var7 &&
                var8 == 0) {
                ConstrainToRectangleLocomotor.a(param1, 8, (byte) -109);
                return true;
              }
              if (var7 == 23 &&
                var8 == 0) {
                ((pk) (RenderScene.field_g[3])).b((byte) 94, 0);
                return true;
              }
              if (var7 == 24) {
                ((pk) (RenderScene.field_g[3])).b((byte) 84, 1);
                return true;
              }
              if (var7 == 25 &&
                var8 == 0) {
                ((pk) (RenderScene.field_g[3])).b((byte) 126, 2);
                return true;
              }
              if (var7 == 26 &&
                var8 == 0) {
                ((qp) (RenderScene.field_g[5])).h(18608, 0);
                return true;
              }
              if (27 == var7 &&
                var8 == 0) {
                ((qp) (RenderScene.field_g[5])).h(18608, 1);
                return true;
              }
              if (var7 == 28 &&
                var8 == 0) {
                boolean decompiledFrameRemainder1 = true;
                if (2147483647 == PasswordValidator.field_n) {
                  if (this.field_c != 10) {
                    PasswordValidator.field_n = this.field_c;
                  } else {
                    if (!GameClock.field_b) {
                      if (uma.field_c) {
                        PasswordValidator.field_n = 3;
                      } else {
                        PasswordValidator.field_n = 9;
                      }
                      decompiledFrameRemainder1 = false;
                    }
                    else {
                      PasswordValidator.field_n = 6;
                    }
                  }
                }
                RoomEffectTraps.a((byte) -63, ura.field_a, true);
                return true;
              }
              if (var7 == 32 &&
                var8 == 0) {
                mpa.field_X = true;
                ConstrainToRectangleLocomotor.a(param1, 0, (byte) -107);
                return true;
              }
              if (var7 == 36) {
                Trap.a(0, baa.field_e);
                return true;
              }
              if (37 == var7) {
                Trap.a(0, tia.field_d);
                return true;
              }
              if (var7 == 38) {
                Trap.a(0, PitModel.field_s);
                return true;
              }
              if (var7 == 39 &&
                var8 == 0) {
                RangeOperator.a(true, WeaponShooterBehaviour.field_r);
                return true;
              }
              if (var7 == 40) {
                RangeOperator.a(true, CourseLayoutFactory.field_d);
                return true;
              }
              if (var7 == 29) {
                stackIn_312_0 = !(SimpleHoverMountComponent.field_M);
                SimpleHoverMountComponent.field_M = stackIn_312_0;
                return true;
              }
              if (30 == var7 &&
                var8 == 0) {
                stackIn_318_0 = !(ConstrainToLatticeLocomotor.field_s);
                ConstrainToLatticeLocomotor.field_s = stackIn_318_0;
                return true;
              }
              if (var7 == 31) {
                stackIn_324_0 = !(ara.field_wb);
                ara.field_wb = stackIn_324_0;
                return true;
              }
              if ((19 != var7 ||
                var8 != 0) &&
                (var7 != 20 ||
                var8 != 0) &&
                (21 != var7 &&
                10 != var7)) {
                if (var7 != 11) {
                  return false;
                }
                decompiledFrameRemainder0 = (var8 == 0);
              }
              if (decompiledFrameRemainder0) {
                return true;
              }
            }
            if (decompiledFrameRemainder0) {
              return true;
            }
          }
          UrlDownloadRequest.a((byte) 105);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "wv.J(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int f(int param0, int param1) {
        int stackIn_16_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_80_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != 0) {
            this.activateItem(false, false, 19);
          }
          if (this.field_c == 0 &&
            3 != param1 &&
            param1 != 21 &&
            param1 != 9) {
            stackIn_16_0 = 1;
            return stackIn_16_0;
          }
          if (param1 != 14 &&
            27 != param1) {
            if (param1 != 1 &&
              4 != param1 &&
              param1 != 8 &&
              param1 != 13 &&
              param1 != 12 &&
              param1 != 30 &&
              31 != param1 &&
              29 != param1 &&
              param1 != 7 &&
              param1 != 20 &&
              param1 != 6 &&
              param1 != 5 &&
              param1 != 15 &&
              18 != param1 &&
              param1 != 16 &&
              33 != param1 &&
              param1 != 35 &&
              param1 != 41) {
              stackIn_80_0 = 0;
              return stackIn_80_0;
            }
            stackIn_78_0 = 2;
            return stackIn_78_0;
          }
          stackIn_22_0 = 3;
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "wv.M(" + param0 + ',' + param1 + ')');
        }
    }

    void a(int param0, int param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          this.field_k.initializeSelection(param2, param0 + 29954, param1, this.findItemAt(GridWidgetContainer.field_B, true, AgeValidator.field_j));
          var4_int = param0;
          while (var4_int < this.items.length) {
            this.items[var4_int].reset(1701110401);
            var4_int++;
            if (var5 != 0) {
              return;
            }
          }
          FacePlayerLocomotor.field_p = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "wv.H(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    void onActivated(byte param0) {
        try {
          if (param0 <= 78) {
            this.firstItemY = 36;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "wv.B(" + param0 + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_l = null;
          if (param0) {
            MenuScreen.releaseStatics(false);
          }
          field_h = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "wv.S(" + param0 + ')');
        }
    }

    boolean handleKey(int param0, char param1, int param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (13 != param0) {
            if (!this.field_o) {
              this.field_k.handleHorizontalNavigation(0, param2 ^ -123);
              if (var5 != 0) {
                this.field_k.handleVerticalNavigation(117);
                this.c(-6);
              }
            } else {
              this.field_k.handleVerticalNavigation(117);
              if (var5 != 0) {
                this.c(-6);
              }
            }
          } else {
            this.c(-6);
          }
          if (param2 != 1) {
            this.firstItemY = 76;
          }
          if (RasterizerOperator.d(20125) &&
            39 == param0) {
            CoinItemComponent.a(cq.field_d, (byte) -128);
          }
          this.activateItem(false, false, this.field_k.selectedIndex);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "wv.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    String getActionLabel(int param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        String stackIn_3_0 = null;
        StringBuilder stackIn_16_0 = null;
        String stackIn_17_1 = null;
        StringBuilder stackIn_23_0 = null;
        String stackIn_24_1 = null;
        StringBuilder stackIn_30_0 = null;
        String stackIn_31_1 = null;
        String stackIn_33_0 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 < 111) {
            stackIn_3_0 = (String) null;
            return stackIn_3_0;
          }
          var3 = OpenGlSceneLight.field_q[param0];
          if (param0 != 29) {
            if (param0 != 30) {
              if (param0 == 31) {
                stackIn_16_0 = new StringBuilder().append(var3).append(" ");
                if (!ara.field_wb) {
                  stackIn_17_1 = Behaviour.field_h.toLowerCase();
                } else {
                  stackIn_17_1 = PathMoverComponent.field_H.toLowerCase();
                }
                var3 = ((StringBuilder) (Object) stackIn_16_0).append(stackIn_17_1).toString();
                if (var4 != 0) {
                  stackIn_23_0 = new StringBuilder().append(var3).append(" ");
                  if (ConstrainToLatticeLocomotor.field_s) {
                    stackIn_24_1 = PathMoverComponent.field_H.toLowerCase();
                  } else {
                    stackIn_24_1 = Behaviour.field_h.toLowerCase();
                  }
                  var3 = ((StringBuilder) (Object) stackIn_23_0).append(stackIn_24_1).toString();
                  stackIn_30_0 = new StringBuilder().append(var3).append(" ");
                  if (SimpleHoverMountComponent.field_M) {
                    stackIn_31_1 = PathMoverComponent.field_H.toLowerCase();
                  } else {
                    stackIn_31_1 = Behaviour.field_h.toLowerCase();
                  }
                  var3 = ((StringBuilder) (Object) stackIn_30_0).append(stackIn_31_1).toString();
                }
              }
            } else {
              stackIn_23_0 = new StringBuilder().append(var3).append(" ");
              if (ConstrainToLatticeLocomotor.field_s) {
                stackIn_24_1 = PathMoverComponent.field_H.toLowerCase();
              } else {
                stackIn_24_1 = Behaviour.field_h.toLowerCase();
              }
              var3 = ((StringBuilder) (Object) stackIn_23_0).append(stackIn_24_1).toString();
              if (var4 != 0) {
                stackIn_30_0 = new StringBuilder().append(var3).append(" ");
                if (SimpleHoverMountComponent.field_M) {
                  stackIn_31_1 = PathMoverComponent.field_H.toLowerCase();
                } else {
                  stackIn_31_1 = Behaviour.field_h.toLowerCase();
                }
                var3 = ((StringBuilder) (Object) stackIn_30_0).append(stackIn_31_1).toString();
              }
            }
          } else {
            stackIn_30_0 = new StringBuilder().append(var3).append(" ");
            if (SimpleHoverMountComponent.field_M) {
              stackIn_31_1 = PathMoverComponent.field_H.toLowerCase();
            } else {
              stackIn_31_1 = Behaviour.field_h.toLowerCase();
            }
            var3 = ((StringBuilder) (Object) stackIn_30_0).append(stackIn_31_1).toString();
          }
          stackIn_33_0 = var3;
          return stackIn_33_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3_ref), "wv.G(" + param0 + ',' + param1 + ')');
        }
    }

    int getItemHeight(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 121) {
            this.activateItem(false, false, 75);
          }
          stackIn_4_0 = this.items[param0].getHeight(11919);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "wv.P(" + param0 + ',' + param1 + ')');
        }
    }

    boolean a(int param0, int param1) {
        RuntimeException var3 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -13) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "wv.E(" + param0 + ',' + param1 + ')');
        }
    }

    final void onDeactivated(int param0) {
        try {
          if (param0 >= -102) {
            field_h = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "wv.Q(" + param0 + ')');
        }
    }

    boolean isItemEnabled(int param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_13_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            return false;
          }
          if (param0 >= 0 &&
            param0 < this.items.length &&
            28 == this.items[param0].field_g) {
            stackIn_13_0 = TextWidgetPainter.a(83);
            return stackIn_13_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "wv.N(" + param0 + ',' + param1 + ')');
        }
    }

    int getItemY(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 30) {
            this.itemX = -17;
          }
          stackIn_4_0 = this.firstItemY + this.itemSpacing * param0 - this.getItemHeight(param0, 126);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var3), "wv.D(" + param0 + ',' + param1 + ')');
        }
    }

    void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != -6) {
            field_j = 79;
          }
          MotionTrackingModel.a(0, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "wv.K(" + param0 + ')');
        }
    }

    private final int findItemAt(int param0, boolean param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_15_0 = false;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_14_0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          if (this.field_k.selectedIndex >= 0 &&
            this.isItemEnabled(this.field_k.selectedIndex, 0) &&
            this.items[this.field_k.selectedIndex].a(-30323, param2, param0)) {
            stackIn_9_0 = this.field_k.selectedIndex;
            return stackIn_9_0;
          }
          var4_int = 0;
          if (!param1) {
            stackIn_12_0 = -7;
            return stackIn_12_0;
          }
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (this.items.length <= var4_int))) {
            stackOut_14_0 = this.isItemEnabled(var4_int, 0);
            stackIn_25_0 = stackOut_14_0 ? 1 : 0;
            stackIn_15_0 = stackOut_14_0;
            if (var5 == 0) {
              if (stackIn_15_0 &&
                this.items[var4_int].a(-30323, param2, param0)) {
                stackIn_22_0 = var4_int;
                return stackIn_22_0;
              }
              var4_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_25_0 = -1;
          }
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "wv.AA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void setItems(int param0, int[] param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_43_0 = 0;
        int stackIn_43_1 = 0;
        RuntimeException stackIn_66_0 = null;
        StringBuilder stackIn_66_1 = null;
        String stackIn_67_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        Object var4 = null;
        int var5 = 0;
        Object var6 = null;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        int var10 = 0;
        int stackIn_43_0Lifetime1;
        int stackIn_43_1Lifetime1;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          this.items = new MenuEntry[param1.length];
          var3_int = 0;
          if (param0 != 22174) {
            return;
          }
          var4 = null;
          var5 = 0;
          var6 = null;
          var7 = 0;
          var8 = null;
          var9 = 0;
          scanLoop1: while (true) {
            boolean decompiledFrameRemainder1 = true;
            boolean decompiledFrameCompleted0 = true;
            boolean decompiledFrameRemainder0 = true;
            if (param1.length > var9) {
              this.items[var9] = new MenuEntry(param1[var9], this.getActionLabel(param1[var9], (byte) 125), this.f(0, param1[var9]), this.d(-72, param1[var9]));
              this.items[var9].field_b = this.getItemX((byte) 119, var9) + this.getItemRight(var9, (byte) -48) >> 1;
              this.items[var9].reset(1701110401);
              stackIn_43_0 = -38;
              stackIn_43_1 = ~param1[var9];
              if (var10 != 0) {
                if (stackIn_43_0 < stackIn_43_1) {
                  this.items[var9].field_i = this.getItemY(var9, param0 ^ 22144);
                  var9++;
                  decompiledFrameRemainder1 = false;
                }
                else {
                  decompiledFrameRemainder0 = false;
                }
              }
              if ((decompiledFrameRemainder1) &&
                (decompiledFrameRemainder0)) {
                if (stackIn_43_0 == stackIn_43_1 ||
                  36 == param1[var9] ||
                  param1[var9] == 38) {
                  if (null == var6) {
                    var6 = new int[3];
                  }
                  incrementValue$0 = var5;
                  var5++;
                  ((int[]) (var6))[incrementValue$0] = var9;
                }
                if (param1[var9] == 39 ||
                  param1[var9] == 40) {
                  if (var8 == null) {
                    var8 = new int[2];
                  }
                  incrementValue$1 = var7;
                  var7++;
                  ((int[]) (var8))[incrementValue$1] = var9;
                }
                if (param1[var9] == 5 ||
                  6 == param1[var9]) {
                  if (null == var4) {
                    var4 = new int[2];
                  }
                  incrementValue$2 = var3_int;
                  var3_int++;
                  ((int[]) (var4))[incrementValue$2] = var9;
                }
                var9++;
                continue;
              }
            }
            if ((decompiledFrameRemainder1) &&
              (decompiledFrameRemainder0)) {
              var9 = 0;
              while (true) {
                stackIn_43_0Lifetime1 = var9;
                stackIn_43_1Lifetime1 = param1.length;
                if (stackIn_43_0Lifetime1 >= stackIn_43_1Lifetime1) {
                  break;
                }
                this.items[var9].field_i = this.getItemY(var9, param0 ^ 22144);
                var9++;
                if (var10 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
            }
            if ((decompiledFrameRemainder1) &&
              (decompiledFrameCompleted0) &&
              (var6 == null)) {
              break scanLoop1;
            }
            TextSpewerBehaviour.a((byte) -91, new MenuEntry[]{this.items[((int[]) (var6))[0]], this.items[((int[]) (var6))[1]], this.items[((int[]) (var6))[2]]});
            break;
          }
          if (var8 != null) {
            TextSpewerBehaviour.a((byte) -91, new MenuEntry[]{this.items[((int[]) (var8))[0]], this.items[((int[]) (var8))[1]]});
          }
          if (null != var4) {
            TextSpewerBehaviour.a((byte) -91, new MenuEntry[]{this.items[((int[]) (var4))[0]], this.items[((int[]) (var4))[1]]});
          }
          this.field_k = new MenuInputState(this.items.length);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_66_0 = var3;
          stackIn_66_1 = new StringBuilder().append("wv.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_67_2 = "null";
          } else {
            stackIn_67_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_66_0), ((StringBuilder) (Object) stackIn_66_1).append(stackIn_67_2).append(')').toString());
        }
    }

    static {
        field_j = 0;
        field_h = "The previous occupant of the temple put too much money in the Spinning Disc of Death vending machines, and now they won't stop.";
    }
}
