/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EventPresenter extends IntrusiveNode {
    BattleUnitRenderer unitRenderer;
    int screenY;
    boolean fullCombatScene;
    private Battlefield battlefield;
    int screenX;
    int tileIndex;
    private int elapsedFrames;
    private boolean acknowledged;
    boolean field_w;
    boolean presentationActive;
    static NodeDeque field_q;
    private GameplayController controller;
    EventPresentation presentation;
    GameEvent event;
    static String field_l;
    static boolean[] field_o;
    static RgbSprite field_t;

    final boolean initialize(int obfuscationGuard) {
        MovementPlanner stackIn_17_0 = null;
        boolean stackIn_18_1 = false;
        int stackIn_22_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_34_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_58_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_94_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_112_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_127_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_135_0 = 0;
        int var2;
        TelefragEvent var3;
        int var3_int;
        int var4;
        int var5;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var2 = 0;
        if (0 != this.event.eventKind) {
          if (this.event.eventKind == 1) {
            this.fullCombatScene = true;
            this.presentation = (EventPresentation) ((Object) new CombatPresentation(this.battlefield, this.controller.camera, this));
            stackIn_135_0 = (!this.presentation.initialize(this.event, (byte) 57)) ? 0 : 1;
            var2 = stackIn_135_0;
          } else {
            if (this.event.eventKind == 6) {
              this.fullCombatScene = false;
              this.presentation = (EventPresentation) ((Object) new EffectPresentation(this.battlefield, this.controller.camera, this));
              stackIn_131_0 = (!this.presentation.initialize(this.event, (byte) 57)) ? 0 : 1;
              var2 = stackIn_131_0;
            } else {
              if (this.event.eventKind != 21) {
                if (this.event.eventKind != 26) {
                  if (this.event.eventKind == 5) {
                    var3 = (TelefragEvent) (this.event);
                    if (var3.b(this.battlefield, -75)) {
                      new DeathEvent(this.battlefield.getUnitAt(var3.unit.tileY, true, var3.unit.tileX), true).a(this.controller.eventPresenters, (byte) -86, this.controller);
                    }
                    this.fullCombatScene = false;
                    this.presentation = (EventPresentation) ((Object) new EffectPresentation(this.battlefield, this.controller.camera, this));
                    stackIn_127_0 = (!this.presentation.initialize(this.event, (byte) 57)) ? 0 : 1;
                    var2 = stackIn_127_0;
                  } else {
                    if (this.event.eventKind == 7) {
                      this.fullCombatScene = false;
                      this.presentation = (EventPresentation) ((Object) new MovementPresentation(this.battlefield, this.controller.camera, this));
                      stackIn_120_0 = (!this.presentation.initialize(this.event, (byte) 57)) ? 0 : 1;
                      var2 = stackIn_120_0;
                    } else {
                      if (10 == this.event.eventKind) {
                        this.fullCombatScene = false;
                        this.presentation = (EventPresentation) ((Object) new EffectPresentation(this.battlefield, this.controller.camera, this));
                        stackIn_116_0 = (!this.presentation.initialize(this.event, (byte) 57)) ? 0 : 1;
                        var2 = stackIn_116_0;
                      } else {
                        if (this.event.eventKind == 11) {
                          this.fullCombatScene = false;
                          this.event.applyToBattlefield(this.battlefield, -26661);
                          this.presentation = (EventPresentation) ((Object) new EffectPresentation(this.battlefield, this.controller.camera, this));
                          stackIn_112_0 = (!this.presentation.initialize(this.event, (byte) 57)) ? 0 : 1;
                          var2 = stackIn_112_0;
                        } else {
                          if (this.event.eventKind != 15) {
                            if (this.event.eventKind != 14) {
                              if (12 != this.event.eventKind) {
                                if (this.event.eventKind != 16) {
                                  if (this.event.eventKind == 17) {
                                    this.fullCombatScene = false;
                                    this.presentation = (EventPresentation) ((Object) new EffectPresentation(this.battlefield, this.controller.camera, this));
                                    stackIn_108_0 = (!this.presentation.initialize(this.event, (byte) 57)) ? 0 : 1;
                                    var2 = stackIn_108_0;
                                  } else {
                                    if (this.event.eventKind != 3) {
                                      if (18 == this.event.eventKind) {
                                        this.fullCombatScene = false;
                                        this.presentation = (EventPresentation) ((Object) new EffectPresentation(this.battlefield, this.controller.camera, this));
                                        stackIn_104_0 = (!this.presentation.initialize(this.event, (byte) 57)) ? 0 : 1;
                                        var2 = stackIn_104_0;
                                      } else {
                                        if (this.event.eventKind != 20) {
                                          if (this.event.eventKind != 19) {
                                            if (this.event.eventKind != 2) {
                                              if (this.event.eventKind == 25) {
                                                this.fullCombatScene = false;
                                                this.presentationActive = true;
                                                this.presentation = (EventPresentation) ((Object) new PopupPresentation(this.battlefield, this.controller.camera, this));
                                                stackIn_100_0 = (!this.presentation.initialize(this.event, (byte) 57)) ? 0 : 1;
                                                var2 = stackIn_100_0;
                                              } else {
                                                if (this.event.eventKind != 23) {
                                                  if (this.event.eventKind != 24) {
                                                    if (this.event.eventKind == 27) {
                                                      this.fullCombatScene = false;
                                                      this.presentationActive = false;
                                                      var2 = 1;
                                                    }
                                                  } else {
                                                    this.fullCombatScene = true;
                                                    this.presentationActive = false;
                                                    this.presentation = (EventPresentation) ((Object) new PopupPresentation(this.battlefield, this.controller.camera, this));
                                                    if (this.presentation.initialize(this.event, (byte) 57)) {
                                                      stackIn_94_0 = (-1 < this.controller.controlledPlayerId) ? 1 : 0;
                                                    } else {
                                                      stackIn_94_0 = 0;
                                                    }
                                                    var2 = stackIn_94_0;
                                                  }
                                                } else {
                                                  this.presentationActive = true;
                                                  this.fullCombatScene = false;
                                                  this.presentation = (EventPresentation) ((Object) new PopupPresentation(this.battlefield, this.controller.camera, this));
                                                  stackIn_86_0 = (!this.presentation.initialize(this.event, (byte) 57)) ? 0 : 1;
                                                  var2 = stackIn_86_0;
                                                }
                                              }
                                            } else {
                                              this.presentationActive = true;
                                              this.fullCombatScene = false;
                                              this.presentation = (EventPresentation) ((Object) new PopupPresentation(this.battlefield, this.controller.camera, this));
                                              stackIn_80_0 = (!this.presentation.initialize(this.event, (byte) 57)) ? 0 : 1;
                                              var2 = stackIn_80_0;
                                            }
                                          } else {
                                            this.presentationActive = true;
                                            this.fullCombatScene = false;
                                            this.presentation = (EventPresentation) ((Object) new PopupPresentation(this.battlefield, this.controller.camera, this));
                                            stackIn_75_0 = (!this.presentation.initialize(this.event, (byte) 57)) ? 0 : 1;
                                            var2 = stackIn_75_0;
                                          }
                                        } else {
                                          this.presentationActive = true;
                                          this.fullCombatScene = false;
                                          this.presentation = (EventPresentation) ((Object) new PopupPresentation(this.battlefield, this.controller.camera, this));
                                          stackIn_70_0 = (!this.presentation.initialize(this.event, (byte) 57)) ? 0 : 1;
                                          var2 = stackIn_70_0;
                                        }
                                      }
                                    } else {
                                      this.fullCombatScene = false;
                                      this.presentation = (EventPresentation) ((Object) new EffectPresentation(this.battlefield, this.controller.camera, this));
                                      stackIn_64_0 = (!this.presentation.initialize(this.event, (byte) 57)) ? 0 : 1;
                                      var2 = stackIn_64_0;
                                    }
                                  }
                                } else {
                                  this.fullCombatScene = false;
                                  this.presentation = (EventPresentation) ((Object) new EffectPresentation(this.battlefield, this.controller.camera, this));
                                  stackIn_58_0 = (!this.presentation.initialize(this.event, (byte) 57)) ? 0 : 1;
                                  var2 = stackIn_58_0;
                                }
                              } else {
                                this.fullCombatScene = false;
                                this.presentation = (EventPresentation) ((Object) new EffectPresentation(this.battlefield, this.controller.camera, this));
                                stackIn_53_0 = (!this.presentation.initialize(this.event, (byte) 57)) ? 0 : 1;
                                var2 = stackIn_53_0;
                              }
                            } else {
                              this.fullCombatScene = false;
                              this.presentation = (EventPresentation) ((Object) new EffectPresentation(this.battlefield, this.controller.camera, this));
                              stackIn_48_0 = (!this.presentation.initialize(this.event, (byte) 57)) ? 0 : 1;
                              var2 = stackIn_48_0;
                            }
                          } else {
                            this.fullCombatScene = false;
                            this.event.applyToBattlefield(this.battlefield, -26661);
                            this.presentationActive = true;
                            this.presentation = (EventPresentation) ((Object) new PopupPresentation(this.battlefield, this.controller.camera, this));
                            stackIn_43_0 = (!this.presentation.initialize(this.event, (byte) 57)) ? 0 : 1;
                            var2 = stackIn_43_0;
                          }
                        }
                      }
                    }
                  }
                } else {
                  this.presentationActive = true;
                  this.fullCombatScene = false;
                  this.presentation = (EventPresentation) ((Object) new PopupPresentation(this.battlefield, this.controller.camera, this));
                  stackIn_34_0 = (!this.presentation.initialize(this.event, (byte) 57)) ? 0 : 1;
                  var2 = stackIn_34_0;
                }
              } else {
                this.fullCombatScene = false;
                this.presentation = (EventPresentation) ((Object) new EffectPresentation(this.battlefield, this.controller.camera, this));
                stackIn_29_0 = (!this.presentation.initialize(this.event, (byte) 57)) ? 0 : 1;
                var2 = stackIn_29_0;
              }
            }
          }
        } else {
          var3_int = ((MoveEvent) (this.event)).startX;
          var4 = ((MoveEvent) (this.event)).startY;
          if (var3_int < 0) {
            return false;
          }
          if (this.battlefield.mapWidth <= var3_int) {
            return false;
          }
          if (0 > var4) {
            return false;
          }
          if (var4 >= this.battlefield.mapHeight) {
            return false;
          }
          if (this.battlefield.tiles[((MoveEvent) (this.event)).startX + ((MoveEvent) (this.event)).startY * this.battlefield.mapWidth].occupant == null) {
            return false;
          }
          if (null != this.controller.selectedUnit) {
            stackIn_17_0 = this.controller.movementPlanner;
            stackIn_18_1 = (null != this.controller.field_oc) ? false : true;
            ((MovementPlanner) (Object) stackIn_17_0).prepareForUnit(stackIn_18_1, obfuscationGuard + 19769, this.controller.controlledPlayerId, this.controller.selectedUnit, this.controller.movementPlanner.field_y, this.controller.movementPlanner.spellId);
          }
          this.presentation = (EventPresentation) ((Object) new MovementPresentation(this.battlefield, this.controller.camera, this));
          stackIn_22_0 = (!this.presentation.initialize(this.event, (byte) 57)) ? 0 : 1;
          var2 = stackIn_22_0;
        }
        if (var2 == 0) {
          this.event.acknowledgePresentation((byte) -71);
          this.acknowledged = true;
        }
        this.elapsedFrames = 0;
        if (obfuscationGuard != -19702) {
          this.fullCombatScene = true;
        }
        return var2 != 0;
    }

    public static void f(int param0) {
        field_q = null;
        field_t = null;
        field_o = null;
        int var1 = -72 % ((param0 - 30) / 51);
        field_l = null;
    }

    final void draw(int frameNumber, int obfuscationGuard, boolean overlayLayer) {
        RgbSprite stackIn_14_0;
        int stackIn_14_1;
        int stackIn_14_2;
        int[][] stackIn_14_3;
        int stackIn_15_4 = 0;
        int var4;
        int var5;
        if (this.presentationActive &&
          null != this.presentation) {
          if (overlayLayer) {
            this.presentation.drawOverlayLayer((byte) -52);
          } else {
            this.presentation.drawBaseLayer((byte) -122);
          }
          return;
        }
        if (overlayLayer) {
          return;
        }
        if (null == this.event.unit) {
          return;
        }
        if (this.event.unit.modelPreview == null) {
          return;
        }
        var4 = -40 + this.event.unit.modelPreview.screenPosition[0];
        var5 = -20 + this.event.unit.modelPreview.screenPosition[1];
        stackIn_14_0 = TeamRoster.field_g;
        stackIn_14_1 = 10 + var4;
        stackIn_14_2 = var5 + 5;
        stackIn_14_3 = op.field_c;
        stackIn_15_4 = (this.battlefield.teamGame) ? 1 : 0;
        ((RgbSprite) (Object) stackIn_14_0).b(stackIn_14_1, stackIn_14_2, stackIn_14_3[stackIn_15_4][this.event.unit.ownerPlayer]);
        if (obfuscationGuard != 31785) {
          this.acknowledged = false;
        }
        if (this.controller.selectedUnit == this.event.unit ||
          this.controller.field_oc == this.event.unit) {
          TeamRoster.field_g.f(var4 + 10, 5 + var5, 128 + (int)(64.0 * Math.sin((double)frameNumber / 3.141592653589793)));
        }
        this.event.unit.modelPreview.a((byte) -72, false);
        return;
    }

    final boolean b(int param0, int param1, boolean param2) {
        int var4 = 0;
        if (24 != this.event.eventKind) {
          this.presentationActive = true;
          this.presentation = (EventPresentation) ((Object) new PopupPresentation(this.battlefield, this.controller.camera, this));
          var4 = ((PopupPresentation) (this.presentation)).a(-98, param1, param0, this.event) ? 1 : 0;
        } else {
          this.fullCombatScene = false;
          this.presentationActive = true;
          this.presentation = (EventPresentation) ((Object) new PopupPresentation(this.battlefield, this.controller.camera, this));
          var4 = ((PopupPresentation) (this.presentation)).a(-95, param1, param0, this.event) ? 1 : 0;
        }
        if (var4 == 0) {
          this.event.acknowledgePresentation((byte) -107);
          this.acknowledged = true;
        }
        if (!param2) {
          this.draw(17, 99, true);
        }
        this.elapsedFrames = 0;
        return var4 != 0;
    }

    final boolean isCombatViewReady(byte obfuscationGuard) {
        int var2 = -110 / ((27 - obfuscationGuard) / 35);
        if (this.presentation == null) {
          return false;
        }
        return this.presentation.isCombatViewReady((byte) -91);
    }

    final void advanceFrame(int excludedEventKind) {
        int var3;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.event.eventKind != excludedEventKind &&
          null != this.presentation) {
          if (this.presentation.isFinished(8865) &&
            !this.acknowledged) {
            this.event.acknowledgePresentation((byte) -118);
            this.acknowledged = true;
            this.presentation = null;
          } else {
            this.presentation.advanceFrame(this.event, (byte) 23);
          }
        } else {
          if (!this.acknowledged) {
            this.acknowledged = true;
            this.event.acknowledgePresentation((byte) -64);
          }
        }
        this.elapsedFrames = this.elapsedFrames + 1;
        if (this.elapsedFrames >= 1000) {
          this.acknowledged = true;
          this.presentation = null;
          this.event.f(excludedEventKind + 7);
          oo.e(-387);
        }
    }

    EventPresenter(GameplayController controller, Battlefield battlefield, BattleUnitRenderer unitRenderer, GameEvent event, boolean blocking) {
        j discarded$0 = null;
        this.fullCombatScene = false;
        this.tileIndex = -1;
        try {
          this.battlefield = battlefield;
          this.event = event;
          this.unitRenderer = unitRenderer;
          this.controller = controller;
          discarded$0 = new j(240, controller.camera);
          this.event.a(-97);
          this.elapsedFrames = 0;
          this.presentationActive = false;
          this.field_w = blocking ? true : false;
          this.acknowledged = false;
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "vb.<init>(" + (controller != null ? "{...}" : "null") + ',' + (battlefield != null ? "{...}" : "null") + ',' + (unitRenderer != null ? "{...}" : "null") + ',' + (event != null ? "{...}" : "null") + ',' + blocking + ')');
        }
    }

    EventPresenter(GameplayController param0, Battlefield param1, BattleUnitRenderer param2, GameEvent param3, int param4, int param5, boolean param6) {
        j discarded$0 = null;
        this.fullCombatScene = false;
        this.tileIndex = -1;
        try {
          this.event = param3;
          this.battlefield = param1;
          this.unitRenderer = param2;
          this.controller = param0;
          discarded$0 = new j(240, param0.camera);
          this.event.a(-97);
          this.presentationActive = false;
          this.field_w = param6 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "vb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_l = "You have not yet unlocked this option for use.";
        field_q = new NodeDeque();
    }
}
