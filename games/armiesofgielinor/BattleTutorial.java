/*
 * Decompiled by CFR-JS 0.4.0.
 */
class BattleTutorial {
    static int pointerPressX;
    int panelWidth;
    static boolean field_n;
    private int messageId;
    private int targetPanelWidth;
    int buttonMode;
    static ClientUiComponent field_d;
    static String field_b;
    private int autoAdvanceFrames;
    private int panelHeight;
    private boolean enemyWaveSpawned;
    private boolean field_o;
    boolean expanded;
    GameplayController controller;
    static String field_l;
    static String field_r;
    int stage;
    private boolean field_s;
    static String field_i;
    private String message;
    private int expandedPanelHeight;
    static boolean quickChatMenuVisible;
    static int consoleStringKind;
    static String field_u;

    private final boolean isEnemyWaveDefeated(byte obfuscationGuard) {
        if (this.controller.battlefield.unitsByPlayer[1].size(false) == 0 &&
          this.controller.battlefield.tiles[DeployAction.field_s[0]].ownerPlayer == 0) {
          return true;
        }
        if (obfuscationGuard != -62) {
          this.draw((byte) -125);
        }
        return false;
    }

    final void setMessage(String message, byte obfuscationGuard) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          this.message = message;
          if (this.message != null &&
            this.expanded) {
            this.expandedPanelHeight = 50 + rs.field_n.getParagraphHeight(this.message, 220, 0);
            this.targetPanelWidth = 240;
            if (ArmiesOfGielinor.obfuscationControl) {
              this.expandedPanelHeight = 40;
              if (this.stage == 34) {
                this.targetPanelWidth = 100;
              }
            }
          } else {
            this.expandedPanelHeight = 40;
            if (this.stage == 34) {
              this.targetPanelWidth = 100;
            }
          }
          if (obfuscationGuard <= 108) {
            this.j((byte) 81);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("iu.FA(");
          if (message == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    void handleInteraction(int tileIndex, int obfuscationGuard, int interactionKind) {
        int var4;
        int var5;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard != -3) {
          return;
        }
        if (interactionKind == 5) {
          interactionKind = this.classifyTerrainInteraction(tileIndex, (byte) -124);
        }
        if (this.isEnemyWaveDefeated((byte) -62) &&
          this.enemyWaveSpawned) {
          this.setStage(28, -30659);
          return;
        }
        regionExit1: {
          boolean decompiledFrameRemainder1 = true;
          regionExit2: {
            regionExit3: {
              regionExit4: {
                regionExit5: {
                  regionExit6: {
                    regionExit7: {
                      regionExit8: {
                        regionExit9: {
                          boolean decompiledFrameRemainder22 = true;
                          boolean decompiledFrameRemainder21 = true;
                          boolean decompiledFrameRemainder20 = true;
                          boolean decompiledFrameRemainder19 = true;
                          boolean decompiledFrameRemainder18 = true;
                          boolean decompiledFrameRemainder17 = true;
                          boolean decompiledFrameRemainder16 = true;
                          boolean decompiledFrameRemainder15 = true;
                          boolean decompiledFrameRemainder14 = true;
                          boolean decompiledFrameRemainder13 = true;
                          boolean decompiledFrameRemainder12 = true;
                          boolean decompiledFrameRemainder11 = true;
                          boolean decompiledFrameRemainder10 = true;
                          boolean decompiledFrameRemainder9 = true;
                          boolean decompiledFrameRemainder8 = true;
                          boolean decompiledFrameRemainder7 = true;
                          boolean decompiledFrameRemainder6 = true;
                          boolean decompiledFrameRemainder5 = true;
                          boolean decompiledFrameRemainder4 = true;
                          boolean decompiledFrameRemainder3 = true;
                          boolean decompiledFrameRemainder2 = true;
                          boolean decompiledFrameRemainder0 = true;
                          var4 = this.stage;
                          if (var4 == 0) {
                            if (interactionKind != 1) {
                              break regionExit1;
                            }
                            this.setStage(1, -30659);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          } else {
                            if ((var4 != 1) &&
                              (decompiledFrameRemainder0 = (2 != var4)) &&
                              (decompiledFrameRemainder2 = (var4 != 3)) &&
                              (decompiledFrameRemainder3 = (var4 != 4 ||
                              var5 != 0)) &&
                              (decompiledFrameRemainder4 = (var4 != 5)) &&
                              (decompiledFrameRemainder5 = (var4 != 6)) &&
                              (decompiledFrameRemainder6 = (var4 != 7 ||
                              var5 != 0)) &&
                              (decompiledFrameRemainder7 = (var4 != 8)) &&
                              (decompiledFrameRemainder8 = (var4 != 9 ||
                              var5 != 0)) &&
                              (decompiledFrameRemainder9 = (30 != var4 ||
                              var5 != 0)) &&
                              (decompiledFrameRemainder10 = (var4 != 10)) &&
                              (decompiledFrameRemainder11 = (11 != var4)) &&
                              (decompiledFrameRemainder12 = (var4 != 12)) &&
                              (decompiledFrameRemainder13 = (var4 != 13)) &&
                              (decompiledFrameRemainder14 = (var4 != 14 ||
                              var5 != 0)) &&
                              (decompiledFrameRemainder15 = (var4 != 15)) &&
                              (decompiledFrameRemainder16 = (var4 != 16 ||
                              var5 != 0)) &&
                              (decompiledFrameRemainder17 = (var4 != 17 ||
                              var5 != 0)) &&
                              (decompiledFrameRemainder18 = (18 != var4)) &&
                              (decompiledFrameRemainder19 = (31 != var4)) &&
                              (decompiledFrameRemainder20 = (32 != var4)) &&
                              (decompiledFrameRemainder21 = (var4 != 19 ||
                              var5 != 0)) &&
                              (decompiledFrameRemainder22 = (20 != var4))) {
                              if (var4 == 21 &&
                                var5 == 0) {
                                break regionExit9;
                              }
                              if (var4 == 29) {
                                break regionExit8;
                              }
                              if (var4 == 22) {
                                break regionExit7;
                              }
                              if (var4 == 23 &&
                                var5 == 0) {
                                break regionExit6;
                              }
                              if (var4 == 24) {
                                break regionExit5;
                              }
                              if (var4 == 25 &&
                                var5 == 0) {
                                break regionExit4;
                              }
                              if (var4 == 26) {
                                break regionExit3;
                              }
                              if (27 == var4 &&
                                var5 == 0) {
                                break regionExit2;
                              }
                              decompiledFrameRemainder1 = (var4 != 34);
                              if (decompiledFrameRemainder1) {
                                break regionExit1;
                              }
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder17) &&
                            (decompiledFrameRemainder16) &&
                            (decompiledFrameRemainder15) &&
                            (decompiledFrameRemainder14) &&
                            (decompiledFrameRemainder13) &&
                            (decompiledFrameRemainder12) &&
                            (decompiledFrameRemainder11) &&
                            (decompiledFrameRemainder10) &&
                            (decompiledFrameRemainder9) &&
                            (decompiledFrameRemainder8) &&
                            (decompiledFrameRemainder7) &&
                            (decompiledFrameRemainder6) &&
                            (decompiledFrameRemainder5) &&
                            (decompiledFrameRemainder4) &&
                            (decompiledFrameRemainder3) &&
                            (decompiledFrameRemainder2) &&
                            (decompiledFrameRemainder1) &&
                            (decompiledFrameRemainder0)) {
                            if (interactionKind != 2) {
                              break regionExit1;
                            }
                            this.setStage(2, -30659);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder17) &&
                            (decompiledFrameRemainder16) &&
                            (decompiledFrameRemainder15) &&
                            (decompiledFrameRemainder14) &&
                            (decompiledFrameRemainder13) &&
                            (decompiledFrameRemainder12) &&
                            (decompiledFrameRemainder11) &&
                            (decompiledFrameRemainder10) &&
                            (decompiledFrameRemainder9) &&
                            (decompiledFrameRemainder8) &&
                            (decompiledFrameRemainder7) &&
                            (decompiledFrameRemainder6) &&
                            (decompiledFrameRemainder5) &&
                            (decompiledFrameRemainder4) &&
                            (decompiledFrameRemainder3) &&
                            (decompiledFrameRemainder2) &&
                            (decompiledFrameRemainder1)) {
                            if (interactionKind != 3) {
                              break regionExit1;
                            }
                            this.setStage(3, -30659);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder17) &&
                            (decompiledFrameRemainder16) &&
                            (decompiledFrameRemainder15) &&
                            (decompiledFrameRemainder14) &&
                            (decompiledFrameRemainder13) &&
                            (decompiledFrameRemainder12) &&
                            (decompiledFrameRemainder11) &&
                            (decompiledFrameRemainder10) &&
                            (decompiledFrameRemainder9) &&
                            (decompiledFrameRemainder8) &&
                            (decompiledFrameRemainder7) &&
                            (decompiledFrameRemainder6) &&
                            (decompiledFrameRemainder5) &&
                            (decompiledFrameRemainder4) &&
                            (decompiledFrameRemainder3) &&
                            (decompiledFrameRemainder1)) {
                            if (2 != interactionKind) {
                              if (interactionKind != 4) {
                                break regionExit1;
                              }
                              this.setStage(5, obfuscationGuard - 30656);
                              if (var5 == 0) {
                                break regionExit1;
                              }
                            }
                            this.setStage(4, -30659);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder17) &&
                            (decompiledFrameRemainder16) &&
                            (decompiledFrameRemainder15) &&
                            (decompiledFrameRemainder14) &&
                            (decompiledFrameRemainder13) &&
                            (decompiledFrameRemainder12) &&
                            (decompiledFrameRemainder11) &&
                            (decompiledFrameRemainder10) &&
                            (decompiledFrameRemainder9) &&
                            (decompiledFrameRemainder8) &&
                            (decompiledFrameRemainder7) &&
                            (decompiledFrameRemainder6) &&
                            (decompiledFrameRemainder5) &&
                            (decompiledFrameRemainder4) &&
                            (decompiledFrameRemainder1)) {
                            if (interactionKind != 4) {
                              break regionExit1;
                            }
                            this.setStage(5, -30659);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder17) &&
                            (decompiledFrameRemainder16) &&
                            (decompiledFrameRemainder15) &&
                            (decompiledFrameRemainder14) &&
                            (decompiledFrameRemainder13) &&
                            (decompiledFrameRemainder12) &&
                            (decompiledFrameRemainder11) &&
                            (decompiledFrameRemainder10) &&
                            (decompiledFrameRemainder9) &&
                            (decompiledFrameRemainder8) &&
                            (decompiledFrameRemainder7) &&
                            (decompiledFrameRemainder6) &&
                            (decompiledFrameRemainder5) &&
                            (decompiledFrameRemainder1)) {
                            if (interactionKind == 2) {
                              this.setStage(6, -30659);
                              if (var5 == 0) {
                                break regionExit1;
                              }
                            }
                            if (interactionKind == 6) {
                              this.setStage(8, -30659);
                              if (var5 == 0) {
                                break regionExit1;
                              }
                            }
                            if (7 == interactionKind) {
                              this.setStage(9, -30659);
                              if (var5 == 0) {
                                break regionExit1;
                              }
                            }
                            if (interactionKind != 9) {
                              break regionExit1;
                            }
                            this.setStage(10, -30659);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder17) &&
                            (decompiledFrameRemainder16) &&
                            (decompiledFrameRemainder15) &&
                            (decompiledFrameRemainder14) &&
                            (decompiledFrameRemainder13) &&
                            (decompiledFrameRemainder12) &&
                            (decompiledFrameRemainder11) &&
                            (decompiledFrameRemainder10) &&
                            (decompiledFrameRemainder9) &&
                            (decompiledFrameRemainder8) &&
                            (decompiledFrameRemainder7) &&
                            (decompiledFrameRemainder6) &&
                            (decompiledFrameRemainder1)) {
                            if (interactionKind != 18 &&
                              5 != interactionKind &&
                              interactionKind != 9) {
                              break regionExit1;
                            }
                            this.setStage(7, obfuscationGuard ^ 30656);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder17) &&
                            (decompiledFrameRemainder16) &&
                            (decompiledFrameRemainder15) &&
                            (decompiledFrameRemainder14) &&
                            (decompiledFrameRemainder13) &&
                            (decompiledFrameRemainder12) &&
                            (decompiledFrameRemainder11) &&
                            (decompiledFrameRemainder10) &&
                            (decompiledFrameRemainder9) &&
                            (decompiledFrameRemainder8) &&
                            (decompiledFrameRemainder7) &&
                            (decompiledFrameRemainder1)) {
                            if (interactionKind != 6) {
                              if (interactionKind == 7) {
                                this.setStage(9, obfuscationGuard ^ 30656);
                                if (var5 == 0) {
                                  break regionExit1;
                                }
                              }
                              if (interactionKind != 9) {
                                break regionExit1;
                              }
                              this.setStage(10, obfuscationGuard - 30656);
                              if (var5 == 0) {
                                break regionExit1;
                              }
                            }
                            this.setStage(8, -30659);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder17) &&
                            (decompiledFrameRemainder16) &&
                            (decompiledFrameRemainder15) &&
                            (decompiledFrameRemainder14) &&
                            (decompiledFrameRemainder13) &&
                            (decompiledFrameRemainder12) &&
                            (decompiledFrameRemainder11) &&
                            (decompiledFrameRemainder10) &&
                            (decompiledFrameRemainder9) &&
                            (decompiledFrameRemainder8) &&
                            (decompiledFrameRemainder1)) {
                            if (interactionKind == 2) {
                              this.setStage(30, -30659);
                              if (var5 == 0) {
                                break regionExit1;
                              }
                            }
                            if (interactionKind != 14) {
                              break regionExit1;
                            }
                            this.setStage(12, -30659);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder17) &&
                            (decompiledFrameRemainder16) &&
                            (decompiledFrameRemainder15) &&
                            (decompiledFrameRemainder14) &&
                            (decompiledFrameRemainder13) &&
                            (decompiledFrameRemainder12) &&
                            (decompiledFrameRemainder11) &&
                            (decompiledFrameRemainder10) &&
                            (decompiledFrameRemainder9) &&
                            (decompiledFrameRemainder1)) {
                            if (interactionKind == 2) {
                              this.setStage(30, -30659);
                              if (var5 == 0) {
                                break regionExit1;
                              }
                            }
                            if (14 != interactionKind) {
                              break regionExit1;
                            }
                            this.setStage(12, -30659);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder17) &&
                            (decompiledFrameRemainder16) &&
                            (decompiledFrameRemainder15) &&
                            (decompiledFrameRemainder14) &&
                            (decompiledFrameRemainder13) &&
                            (decompiledFrameRemainder12) &&
                            (decompiledFrameRemainder11) &&
                            (decompiledFrameRemainder10) &&
                            (decompiledFrameRemainder1)) {
                            if (interactionKind == 2) {
                              this.setStage(11, -30659);
                              if (var5 == 0) {
                                break regionExit1;
                              }
                            }
                            if (interactionKind != 14) {
                              break regionExit1;
                            }
                            this.setStage(12, obfuscationGuard ^ 30656);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder17) &&
                            (decompiledFrameRemainder16) &&
                            (decompiledFrameRemainder15) &&
                            (decompiledFrameRemainder14) &&
                            (decompiledFrameRemainder13) &&
                            (decompiledFrameRemainder12) &&
                            (decompiledFrameRemainder11) &&
                            (decompiledFrameRemainder1)) {
                            if (interactionKind != 14) {
                              break regionExit1;
                            }
                            this.setStage(12, -30659);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder17) &&
                            (decompiledFrameRemainder16) &&
                            (decompiledFrameRemainder15) &&
                            (decompiledFrameRemainder14) &&
                            (decompiledFrameRemainder13) &&
                            (decompiledFrameRemainder12) &&
                            (decompiledFrameRemainder1)) {
                            if (interactionKind != 14) {
                              break regionExit1;
                            }
                            this.setStage(12, -30659);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder17) &&
                            (decompiledFrameRemainder16) &&
                            (decompiledFrameRemainder15) &&
                            (decompiledFrameRemainder14) &&
                            (decompiledFrameRemainder13) &&
                            (decompiledFrameRemainder1)) {
                            if (this.field_s ||
                              interactionKind != 6) {
                              if (this.field_o ||
                                interactionKind != 7) {
                                if (interactionKind != 2) {
                                  break regionExit1;
                                }
                                if (!this.field_s) {
                                  this.setStage(13, -30659);
                                  if (var5 == 0) {
                                    break regionExit1;
                                  }
                                }
                                if (this.field_o) {
                                  this.setStage(31, obfuscationGuard - 30656);
                                  if (var5 == 0) {
                                    break regionExit1;
                                  }
                                }
                                this.setStage(16, obfuscationGuard - 30656);
                                if (var5 == 0) {
                                  break regionExit1;
                                }
                              }
                              this.setStage(17, obfuscationGuard - 30656);
                              if (var5 == 0) {
                                break regionExit1;
                              }
                            }
                            this.setStage(14, obfuscationGuard ^ 30656);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder17) &&
                            (decompiledFrameRemainder16) &&
                            (decompiledFrameRemainder15) &&
                            (decompiledFrameRemainder14) &&
                            (decompiledFrameRemainder1)) {
                            if (6 != interactionKind) {
                              break regionExit1;
                            }
                            this.setStage(14, -30659);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder17) &&
                            (decompiledFrameRemainder16) &&
                            (decompiledFrameRemainder15) &&
                            (decompiledFrameRemainder1)) {
                            if (interactionKind == 14) {
                              if (!this.field_o) {
                                this.setStage(16, obfuscationGuard - 30656);
                                if (var5 != 0) {
                                  this.setStage(31, -30659);
                                }
                              } else {
                                this.setStage(31, -30659);
                              }
                            }
                            if (2 != interactionKind) {
                              break regionExit1;
                            }
                            this.setStage(15, -30659);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder17) &&
                            (decompiledFrameRemainder16) &&
                            (decompiledFrameRemainder1) &&
                            (14 == interactionKind)) {
                            if (!this.field_o) {
                              this.setStage(16, -30659);
                              if (var5 != 0) {
                                this.setStage(31, -30659);
                              }
                            } else {
                              this.setStage(31, -30659);
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder17) &&
                            (decompiledFrameRemainder1)) {
                            if (7 != interactionKind) {
                              break regionExit1;
                            }
                            this.setStage(17, -30659);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder18) &&
                            (decompiledFrameRemainder1)) {
                            if (interactionKind == 14) {
                              if (!this.field_s) {
                                this.setStage(13, obfuscationGuard - 30656);
                                if (var5 != 0) {
                                  this.setStage(31, -30659);
                                }
                              } else {
                                this.setStage(31, -30659);
                              }
                            }
                            if (interactionKind != 2) {
                              break regionExit1;
                            }
                            this.setStage(18, -30659);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder19) &&
                            (decompiledFrameRemainder1) &&
                            (14 == interactionKind)) {
                            if (!this.field_s) {
                              this.setStage(13, -30659);
                              if (var5 != 0) {
                                this.setStage(31, -30659);
                              }
                            } else {
                              this.setStage(31, -30659);
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder20) &&
                            (decompiledFrameRemainder1)) {
                            if (interactionKind != 2) {
                              break regionExit1;
                            }
                            this.setStage(32, -30659);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder21) &&
                            (decompiledFrameRemainder1)) {
                            if (interactionKind != 2) {
                              break regionExit1;
                            }
                            this.setStage(19, -30659);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if ((decompiledFrameRemainder22) &&
                            (decompiledFrameRemainder1)) {
                            if (interactionKind != 3) {
                              break regionExit1;
                            }
                            this.setStage(20, obfuscationGuard - 30656);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                          if (decompiledFrameRemainder1) {
                            if (2 == interactionKind) {
                              this.setStage(21, -30659);
                            }
                            if (interactionKind != 16) {
                              break regionExit1;
                            }
                            this.setStage(29, obfuscationGuard - 30656);
                            if (var5 == 0) {
                              break regionExit1;
                            }
                          }
                        }
                        if (decompiledFrameRemainder1) {
                          if (interactionKind != 16) {
                            break regionExit1;
                          }
                          this.setStage(29, -30659);
                          if (var5 == 0) {
                            break regionExit1;
                          }
                        }
                      }
                      if (decompiledFrameRemainder1) {
                        if (interactionKind != 17) {
                          break regionExit1;
                        }
                        this.setStage(22, -30659);
                        if (var5 == 0) {
                          break regionExit1;
                        }
                      }
                    }
                    if (decompiledFrameRemainder1) {
                      if (10 != interactionKind) {
                        break regionExit1;
                      }
                      this.setStage(23, -30659);
                      if (var5 == 0) {
                        break regionExit1;
                      }
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    if (11 != interactionKind) {
                      break regionExit1;
                    }
                    this.setStage(24, -30659);
                    if (var5 == 0) {
                      break regionExit1;
                    }
                  }
                }
                if (decompiledFrameRemainder1) {
                  if (interactionKind != 12) {
                    break regionExit1;
                  }
                  this.setStage(25, -30659);
                  if (var5 == 0) {
                    break regionExit1;
                  }
                }
              }
              if (decompiledFrameRemainder1) {
                if (interactionKind != 2) {
                  break regionExit1;
                }
                this.setStage(26, obfuscationGuard - 30656);
                if (var5 == 0) {
                  break regionExit1;
                }
              }
            }
            if (decompiledFrameRemainder1) {
              if (interactionKind != 2) {
                break regionExit1;
              }
              this.setStage(27, -30659);
              if (var5 == 0) {
                break regionExit1;
              }
            }
          }
          if (decompiledFrameRemainder1) {
            if (interactionKind != 13 &&
              interactionKind != 15) {
              break regionExit1;
            }
            if (!this.isEnemyWaveDefeated((byte) -62)) {
              break regionExit1;
            }
            this.setStage(28, obfuscationGuard - 30656);
            if (var5 == 0) {
              break regionExit1;
            }
          }
          if (interactionKind == 2) {
            this.panelHeight = 0;
          }
        }
    }

    final void advancePanelAnimation(int obfuscationGuard) {
        int stackIn_13_1 = 0;
        int stackIn_14_2 = 0;
        int stackIn_18_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_23_1 = 0;
        int stackIn_24_2 = 0;
        int stackIn_28_1 = 0;
        int stackIn_29_2 = 0;
        int targetHeight;
        int guardArithmetic;
        int heightToShrink;
        int heightToGrow;
        int widthToShrink;
        int widthToGrow;
        targetHeight = 40;
        if (this.stage != 33) {
          if (this.expanded) {
            targetHeight = this.expandedPanelHeight;
            if (ArmiesOfGielinor.obfuscationControl) {
              targetHeight = 0;
            }
          }
        } else {
          targetHeight = 0;
        }
        if (0 < this.autoAdvanceFrames) {
          this.autoAdvanceFrames = this.autoAdvanceFrames - 1;
          if (this.autoAdvanceFrames == 0) {
            this.handleInteraction(-1, -3, 1);
          }
        }
        guardArithmetic = 0 / ((-9 - obfuscationGuard) / 47);
        if (targetHeight < this.panelHeight) {
          heightToShrink = -targetHeight + this.panelHeight;
          stackIn_13_1 = this.panelHeight;
          if (heightToShrink > 5) {
            stackIn_14_2 = 5;
          } else {
            stackIn_14_2 = heightToShrink;
          }
          this.panelHeight = stackIn_13_1 - stackIn_14_2;
        }
        if (targetHeight > this.panelHeight) {
          heightToGrow = -this.panelHeight + targetHeight;
          stackIn_18_1 = this.panelHeight;
          if (5 < heightToGrow) {
            stackIn_19_2 = 5;
          } else {
            stackIn_19_2 = heightToGrow;
          }
          this.panelHeight = stackIn_18_1 + stackIn_19_2;
        }
        if (this.panelWidth > this.targetPanelWidth) {
          widthToShrink = this.panelWidth - this.targetPanelWidth;
          stackIn_23_1 = this.panelWidth;
          if (widthToShrink > 5) {
            stackIn_24_2 = 5;
          } else {
            stackIn_24_2 = widthToShrink;
          }
          this.panelWidth = stackIn_23_1 - stackIn_24_2;
        }
        if (this.targetPanelWidth > this.panelWidth) {
          widthToGrow = this.targetPanelWidth - this.panelWidth;
          stackIn_28_1 = this.panelWidth;
          if (widthToGrow > 5) {
            stackIn_29_2 = 5;
          } else {
            stackIn_29_2 = widthToGrow;
          }
          this.panelWidth = stackIn_28_1 + stackIn_29_2;
        }
    }

    private final void b(byte param0) {
        if (param0 <= 72) {
          return;
        }
        this.controller.field_jc = true;
    }

    private final void g(int param0) {
        int var2 = 103 / ((param0 + 42) / 55);
        uh.a(DateOfBirthValidator.field_g, 125);
    }

    private final void g(byte param0) {
        int var2 = -88 % ((param0 - 8) / 48);
        this.controller.field_Ab = true;
    }

    private final void setStage(int stage, int obfuscationGuard) {
        int var3;
        int var4;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.expanded = true;
        this.stage = stage;
        this.clearControlHighlights((byte) 37);
        if (obfuscationGuard != -30659) {
          this.panelWidth = -114;
        }
        regionExit1: {
          regionExit2: {
            regionExit3: {
              regionExit4: {
                regionExit5: {
                  regionExit6: {
                    regionExit7: {
                      regionExit8: {
                        regionExit9: {
                          regionExit10: {
                            boolean decompiledFrameRemainder23 = true;
                            boolean decompiledFrameRemainder22 = true;
                            boolean decompiledFrameRemainder21 = true;
                            boolean decompiledFrameRemainder20 = true;
                            boolean decompiledFrameRemainder19 = true;
                            boolean decompiledFrameRemainder18 = true;
                            boolean decompiledFrameRemainder17 = true;
                            boolean decompiledFrameRemainder16 = true;
                            boolean decompiledFrameRemainder15 = true;
                            boolean decompiledFrameRemainder14 = true;
                            boolean decompiledFrameRemainder13 = true;
                            boolean decompiledFrameRemainder12 = true;
                            boolean decompiledFrameRemainder11 = true;
                            boolean decompiledFrameRemainder10 = true;
                            boolean decompiledFrameRemainder9 = true;
                            boolean decompiledFrameRemainder8 = true;
                            boolean decompiledFrameRemainder7 = true;
                            boolean decompiledFrameRemainder6 = true;
                            boolean decompiledFrameRemainder5 = true;
                            boolean decompiledFrameRemainder4 = true;
                            boolean decompiledFrameRemainder3 = true;
                            boolean decompiledFrameRemainder2 = true;
                            boolean decompiledFrameRemainder1 = true;
                            boolean decompiledFrameRemainder0 = true;
                            var3 = this.stage;
                            if (var3 == 0 &&
                              var4 == 0) {
                              this.buttonMode = 2;
                              this.autoAdvanceFrames = 150;
                              this.message = TutorialController.field_f[0];
                              break regionExit2;
                            } else if (var3 != 1 ||
                              var4 != 0) {
                              decompiledFrameRemainder0 = (2 != var3 ||
                                var4 != 0);
                              if ((decompiledFrameRemainder0) &&
                                (decompiledFrameRemainder1 = (var3 != 3 ||
                                var4 != 0)) &&
                                (decompiledFrameRemainder2 = (4 != var3)) &&
                                (decompiledFrameRemainder3 = (var3 != 5 ||
                                var4 != 0)) &&
                                (decompiledFrameRemainder4 = (var3 != 6)) &&
                                (decompiledFrameRemainder5 = (7 != var3 ||
                                var4 != 0)) &&
                                (decompiledFrameRemainder6 = (8 != var3 ||
                                var4 != 0)) &&
                                (decompiledFrameRemainder7 = (var3 != 9)) &&
                                (decompiledFrameRemainder8 = (var3 != 30 ||
                                var4 != 0)) &&
                                (decompiledFrameRemainder9 = (var3 != 10)) &&
                                (decompiledFrameRemainder10 = (11 != var3 ||
                                var4 != 0)) &&
                                (decompiledFrameRemainder11 = (12 != var3)) &&
                                (decompiledFrameRemainder12 = (13 != var3 ||
                                var4 != 0)) &&
                                (decompiledFrameRemainder13 = (var3 != 14 ||
                                var4 != 0)) &&
                                (decompiledFrameRemainder14 = (var3 != 15)) &&
                                (decompiledFrameRemainder15 = (var3 != 16 ||
                                var4 != 0)) &&
                                (decompiledFrameRemainder16 = (17 != var3)) &&
                                (decompiledFrameRemainder17 = (var3 != 18 ||
                                var4 != 0)) &&
                                (decompiledFrameRemainder18 = (var3 != 31)) &&
                                (decompiledFrameRemainder19 = (var3 != 32)) &&
                                (decompiledFrameRemainder20 = (var3 != 19)) &&
                                (decompiledFrameRemainder21 = (var3 != 20 ||
                                var4 != 0)) &&
                                (decompiledFrameRemainder22 = (var3 != 21)) &&
                                (decompiledFrameRemainder23 = (var3 != 22))) {
                                if (var3 == 23) {
                                  break regionExit10;
                                }
                                if (var3 == 24 &&
                                  var4 == 0) {
                                  break regionExit9;
                                }
                                if (var3 == 25) {
                                  break regionExit8;
                                }
                                if (26 == var3) {
                                  break regionExit7;
                                }
                                if (var3 == 27 &&
                                  var4 == 0) {
                                  break regionExit6;
                                }
                                switch (var3) {
                                  case 28:
                                    break regionExit5;
                                  case 29:
                                    break regionExit4;
                                  case 34:
                                    break regionExit3;
                                  default:
                                    this.setMessage(this.message, (byte) 112);
                                    break regionExit1;
                                }
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17) &&
                              (decompiledFrameRemainder16) &&
                              (decompiledFrameRemainder15) &&
                              (decompiledFrameRemainder14) &&
                              (decompiledFrameRemainder13) &&
                              (decompiledFrameRemainder12) &&
                              (decompiledFrameRemainder11) &&
                              (decompiledFrameRemainder10) &&
                              (decompiledFrameRemainder9) &&
                              (decompiledFrameRemainder8) &&
                              (decompiledFrameRemainder7) &&
                              (decompiledFrameRemainder6) &&
                              (decompiledFrameRemainder5) &&
                              (decompiledFrameRemainder4) &&
                              (decompiledFrameRemainder3) &&
                              (decompiledFrameRemainder2) &&
                              (decompiledFrameRemainder1) &&
                              (decompiledFrameRemainder0)) {
                              this.message = TutorialController.field_f[1];
                              this.buttonMode = 0;
                              break regionExit2;
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17) &&
                              (decompiledFrameRemainder16) &&
                              (decompiledFrameRemainder15) &&
                              (decompiledFrameRemainder14) &&
                              (decompiledFrameRemainder13) &&
                              (decompiledFrameRemainder12) &&
                              (decompiledFrameRemainder11) &&
                              (decompiledFrameRemainder10) &&
                              (decompiledFrameRemainder9) &&
                              (decompiledFrameRemainder8) &&
                              (decompiledFrameRemainder7) &&
                              (decompiledFrameRemainder6) &&
                              (decompiledFrameRemainder5) &&
                              (decompiledFrameRemainder4) &&
                              (decompiledFrameRemainder3) &&
                              (decompiledFrameRemainder2) &&
                              (decompiledFrameRemainder1)) {
                              this.message = null;
                              this.a(3, 4, obfuscationGuard + 30685);
                              this.buttonMode = 2;
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17) &&
                              (decompiledFrameRemainder16) &&
                              (decompiledFrameRemainder15) &&
                              (decompiledFrameRemainder14) &&
                              (decompiledFrameRemainder13) &&
                              (decompiledFrameRemainder12) &&
                              (decompiledFrameRemainder11) &&
                              (decompiledFrameRemainder10) &&
                              (decompiledFrameRemainder9) &&
                              (decompiledFrameRemainder8) &&
                              (decompiledFrameRemainder7) &&
                              (decompiledFrameRemainder6) &&
                              (decompiledFrameRemainder5) &&
                              (decompiledFrameRemainder4) &&
                              (decompiledFrameRemainder3) &&
                              (decompiledFrameRemainder2)) {
                              this.d(-4);
                              this.message = TutorialController.field_f[2];
                              this.buttonMode = 0;
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17) &&
                              (decompiledFrameRemainder16) &&
                              (decompiledFrameRemainder15) &&
                              (decompiledFrameRemainder14) &&
                              (decompiledFrameRemainder13) &&
                              (decompiledFrameRemainder12) &&
                              (decompiledFrameRemainder11) &&
                              (decompiledFrameRemainder10) &&
                              (decompiledFrameRemainder9) &&
                              (decompiledFrameRemainder8) &&
                              (decompiledFrameRemainder7) &&
                              (decompiledFrameRemainder6) &&
                              (decompiledFrameRemainder5) &&
                              (decompiledFrameRemainder4) &&
                              (decompiledFrameRemainder3)) {
                              this.message = TutorialController.field_f[3];
                              this.buttonMode = 1;
                              this.a((byte) -122);
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17) &&
                              (decompiledFrameRemainder16) &&
                              (decompiledFrameRemainder15) &&
                              (decompiledFrameRemainder14) &&
                              (decompiledFrameRemainder13) &&
                              (decompiledFrameRemainder12) &&
                              (decompiledFrameRemainder11) &&
                              (decompiledFrameRemainder10) &&
                              (decompiledFrameRemainder9) &&
                              (decompiledFrameRemainder8) &&
                              (decompiledFrameRemainder7) &&
                              (decompiledFrameRemainder6) &&
                              (decompiledFrameRemainder5) &&
                              (decompiledFrameRemainder4)) {
                              this.message = TutorialController.field_f[4];
                              this.buttonMode = 0;
                              this.f((byte) -34);
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17) &&
                              (decompiledFrameRemainder16) &&
                              (decompiledFrameRemainder15) &&
                              (decompiledFrameRemainder14) &&
                              (decompiledFrameRemainder13) &&
                              (decompiledFrameRemainder12) &&
                              (decompiledFrameRemainder11) &&
                              (decompiledFrameRemainder10) &&
                              (decompiledFrameRemainder9) &&
                              (decompiledFrameRemainder8) &&
                              (decompiledFrameRemainder7) &&
                              (decompiledFrameRemainder6) &&
                              (decompiledFrameRemainder5)) {
                              this.buttonMode = 1;
                              this.message = TutorialController.field_f[5];
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17) &&
                              (decompiledFrameRemainder16) &&
                              (decompiledFrameRemainder15) &&
                              (decompiledFrameRemainder14) &&
                              (decompiledFrameRemainder13) &&
                              (decompiledFrameRemainder12) &&
                              (decompiledFrameRemainder11) &&
                              (decompiledFrameRemainder10) &&
                              (decompiledFrameRemainder9) &&
                              (decompiledFrameRemainder8) &&
                              (decompiledFrameRemainder7) &&
                              (decompiledFrameRemainder6)) {
                              this.buttonMode = 1;
                              this.message = TutorialController.field_f[6];
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17) &&
                              (decompiledFrameRemainder16) &&
                              (decompiledFrameRemainder15) &&
                              (decompiledFrameRemainder14) &&
                              (decompiledFrameRemainder13) &&
                              (decompiledFrameRemainder12) &&
                              (decompiledFrameRemainder11) &&
                              (decompiledFrameRemainder10) &&
                              (decompiledFrameRemainder9) &&
                              (decompiledFrameRemainder8) &&
                              (decompiledFrameRemainder7)) {
                              this.buttonMode = 0;
                              this.message = TutorialController.field_f[8];
                              this.field_s = true;
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17) &&
                              (decompiledFrameRemainder16) &&
                              (decompiledFrameRemainder15) &&
                              (decompiledFrameRemainder14) &&
                              (decompiledFrameRemainder13) &&
                              (decompiledFrameRemainder12) &&
                              (decompiledFrameRemainder11) &&
                              (decompiledFrameRemainder10) &&
                              (decompiledFrameRemainder9) &&
                              (decompiledFrameRemainder8)) {
                              this.field_o = true;
                              this.buttonMode = 0;
                              this.message = TutorialController.field_f[7];
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17) &&
                              (decompiledFrameRemainder16) &&
                              (decompiledFrameRemainder15) &&
                              (decompiledFrameRemainder14) &&
                              (decompiledFrameRemainder13) &&
                              (decompiledFrameRemainder12) &&
                              (decompiledFrameRemainder11) &&
                              (decompiledFrameRemainder10) &&
                              (decompiledFrameRemainder9)) {
                              this.buttonMode = 0;
                              this.message = TutorialController.field_f[25];
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17) &&
                              (decompiledFrameRemainder16) &&
                              (decompiledFrameRemainder15) &&
                              (decompiledFrameRemainder14) &&
                              (decompiledFrameRemainder13) &&
                              (decompiledFrameRemainder12) &&
                              (decompiledFrameRemainder11) &&
                              (decompiledFrameRemainder10)) {
                              this.b((byte) 113);
                              this.buttonMode = 1;
                              this.message = TutorialController.field_f[9];
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17) &&
                              (decompiledFrameRemainder16) &&
                              (decompiledFrameRemainder15) &&
                              (decompiledFrameRemainder14) &&
                              (decompiledFrameRemainder13) &&
                              (decompiledFrameRemainder12) &&
                              (decompiledFrameRemainder11)) {
                              this.b((byte) 111);
                              this.buttonMode = 1;
                              this.message = TutorialController.field_f[10];
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17) &&
                              (decompiledFrameRemainder16) &&
                              (decompiledFrameRemainder15) &&
                              (decompiledFrameRemainder14) &&
                              (decompiledFrameRemainder13) &&
                              (decompiledFrameRemainder12)) {
                              this.buttonMode = 0;
                              this.message = TutorialController.field_f[11];
                              this.e(31);
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17) &&
                              (decompiledFrameRemainder16) &&
                              (decompiledFrameRemainder15) &&
                              (decompiledFrameRemainder14) &&
                              (decompiledFrameRemainder13)) {
                              this.buttonMode = 1;
                              this.message = TutorialController.field_f[12];
                              this.g(26);
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17) &&
                              (decompiledFrameRemainder16) &&
                              (decompiledFrameRemainder15) &&
                              (decompiledFrameRemainder14)) {
                              this.message = TutorialController.field_f[8];
                              this.f((byte) -34);
                              this.field_s = true;
                              this.buttonMode = 0;
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17) &&
                              (decompiledFrameRemainder16) &&
                              (decompiledFrameRemainder15)) {
                              this.message = TutorialController.field_f[14];
                              this.f((byte) -34);
                              this.b((byte) 120);
                              this.buttonMode = 1;
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17) &&
                              (decompiledFrameRemainder16)) {
                              this.message = TutorialController.field_f[13];
                              this.buttonMode = 1;
                              this.a(5);
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18) &&
                              (decompiledFrameRemainder17)) {
                              this.message = TutorialController.field_f[7];
                              this.f((byte) -34);
                              this.buttonMode = 0;
                              this.field_o = true;
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19) &&
                              (decompiledFrameRemainder18)) {
                              this.message = TutorialController.field_f[14];
                              this.f((byte) -34);
                              this.b((byte) 90);
                              this.buttonMode = 1;
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20) &&
                              (decompiledFrameRemainder19)) {
                              this.message = TutorialController.field_f[26];
                              this.buttonMode = 0;
                              this.j((byte) -119);
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21) &&
                              (decompiledFrameRemainder20)) {
                              this.message = TutorialController.field_f[27];
                              this.buttonMode = 0;
                              this.k((byte) -120);
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22) &&
                              (decompiledFrameRemainder21)) {
                              this.buttonMode = 2;
                              this.message = null;
                              this.spawnEnemyWave(obfuscationGuard ^ -30659);
                              this.a(13, 17, 26);
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if ((decompiledFrameRemainder23) &&
                              (decompiledFrameRemainder22)) {
                              this.buttonMode = 0;
                              this.message = TutorialController.field_f[15];
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            if (decompiledFrameRemainder23) {
                              this.message = TutorialController.field_f[16];
                              this.buttonMode = 1;
                              if (var4 == 0) {
                                break regionExit2;
                              }
                            }
                            this.message = TutorialController.field_f[17];
                            this.buttonMode = 1;
                            if (var4 == 0) {
                              break regionExit2;
                            }
                          }
                          this.message = TutorialController.field_f[18];
                          this.buttonMode = 1;
                          if (var4 == 0) {
                            break regionExit2;
                          }
                        }
                        this.message = TutorialController.field_f[19];
                        this.buttonMode = 1;
                        if (var4 == 0) {
                          break regionExit2;
                        }
                      }
                      this.message = TutorialController.field_f[20];
                      this.buttonMode = 0;
                      this.g((byte) 59);
                      if (var4 == 0) {
                        break regionExit2;
                      }
                    }
                    this.buttonMode = 0;
                    this.message = TutorialController.field_f[21];
                    this.e((byte) 115);
                    if (var4 == 0) {
                      break regionExit2;
                    }
                  }
                  this.message = TutorialController.field_f[22];
                  this.f((byte) -34);
                  this.buttonMode = 1;
                  if (var4 == 0) {
                    break regionExit2;
                  }
                }
                this.message = TutorialController.field_f[23];
                this.buttonMode = 3;
                this.i((byte) 44);
                if (var4 == 0) {
                  break regionExit2;
                }
              }
              this.buttonMode = 1;
              this.message = TutorialController.field_f[24];
              if (var4 == 0) {
                break regionExit2;
              }
            }
            this.message = EmailValidator.battleHintMessages[this.messageId];
            this.buttonMode = 1;
          }
          this.setMessage(this.message, (byte) 112);
        }
    }

    private final void a(int param0) {
        uh.a(IterableNodeHashTable.field_a, 124);
        if (param0 != 5) {
          this.expandedPanelHeight = 30;
        }
    }

    private final void spawnEnemyWave(int secondUnitBonus) {
        this.controller.battlefield.tiles[9 + this.controller.battlefield.mapWidth * 12].terrainType = 10;
        Bzip2State.a((byte) 106);
        this.controller.battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new SummonEvent(0, 9, 12, -4, 1)));
        this.controller.battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new SummonEvent(0, 15, 13, secondUnitBonus, 1)));
        this.controller.battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new SummonEvent(5, 16, 17, 0, 1)));
        this.enemyWaveSpawned = true;
    }

    private final void a(byte param0) {
        if (param0 != -122) {
          this.f((byte) 104);
        }
        uh.a(StrongCacheEntry.field_D, 125);
    }

    final void draw(byte obfuscationGuard) {
        int stackIn_12_0;
        int stackIn_12_1;
        int stackIn_12_2;
        int stackIn_12_3;
        RgbSprite[] stackIn_12_4;
        int[] stackIn_13_5 = null;
        int stackIn_20_0 = 0;
        String stackIn_24_0 = null;
        String stackIn_28_0 = null;
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard != 21) {
          this.expandedPanelHeight = -21;
        }
        if (this.stage == 0) {
          MaskedTextEntryPainter.field_y.drawTransparent(db.a(true, 320) - (MaskedTextEntryPainter.field_y.pixelWidth >> 1), MatchConditionEntry.a(100, (byte) 94));
          GradientUiRenderer.drawCenteredTextBackdrop(this.message, db.a(true, 320), MatchConditionEntry.a(130, (byte) 94));
          GradientUiRenderer.drawCenteredGradientText(this.message, db.a(true, 320), MatchConditionEntry.a(130, (byte) 94), ConsoleValue.field_b, false);
          this.panelHeight = 40;
        }
        if (0 == this.panelHeight) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        var2 = so.field_b.field_a;
        var3 = so.field_b.field_g;
        SoftwareRaster.setClip(-10 + var2 - this.panelWidth, -this.panelHeight + var3 - 10, -10 + var2, var3);
        GradientUiRenderer.drawHollowGradientFrame(-10 + (-this.panelWidth + var2), -10 - this.panelHeight + var3, this.panelWidth, this.panelHeight, MusicPatch.field_m, ConsoleValue.field_b, 0, 192);
        if (4 != this.buttonMode) {
          stackIn_12_0 = -5 + var2 - this.panelWidth;
          stackIn_12_1 = -45 + var3;
          stackIn_12_2 = this.panelWidth - 10;
          stackIn_12_3 = 30;
          stackIn_12_4 = DisplacedUnitMarker.field_s;
          if (this.buttonMode != 2 &&
            IterableDualNodeDeque.isPointerInBounds(obfuscationGuard - 54, -5 - this.panelWidth + var2, var2 - 15, -45 + var3, var3 - 15)) {
            stackIn_13_5 = TutorialController.field_e;
          } else {
            stackIn_13_5 = ConsoleValue.field_b;
          }
          GradientUiRenderer.drawGradientFrame(stackIn_12_0, stackIn_12_1, stackIn_12_2, stackIn_12_3, stackIn_12_4, stackIn_13_5, 0, 192, true);
          if (this.buttonMode == 0) {
            GradientUiRenderer.drawCenteredSolidText(qf.field_c, -10 + (-120 + var2), -16 + var3, 0, true);
            decompiledFrameRemainder0 = (var5 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (this.buttonMode == 1) {
              stackIn_20_0 = (this.stage != 34) ? 0 : 1;
              var4 = stackIn_20_0;
              if (!this.expanded) {
                if (var4 != 0) {
                  stackIn_24_0 = vg.field_k;
                } else {
                  stackIn_24_0 = DeployAction.field_z;
                }
                GradientUiRenderer.drawCenteredSolidText(stackIn_24_0, var2 - this.panelWidth / 2 - 10, var3 - 16, 0, true);
                if (var5 != 0) {
                  if (var4 == 0) {
                    stackIn_28_0 = jk.field_a;
                  } else {
                    stackIn_28_0 = SkeletonLimitMarker.field_t;
                  }
                  GradientUiRenderer.drawCenteredSolidText(stackIn_28_0, -10 + (var2 - this.panelWidth / 2), var3 - 16, 0, true);
                }
              } else {
                if (var4 == 0) {
                  stackIn_28_0 = jk.field_a;
                } else {
                  stackIn_28_0 = SkeletonLimitMarker.field_t;
                }
                GradientUiRenderer.drawCenteredSolidText(stackIn_28_0, -10 + (var2 - this.panelWidth / 2), var3 - 16, 0, true);
              }
              decompiledFrameRemainder0 = (var5 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (this.buttonMode == 2) {
                GradientUiRenderer.drawCenteredSolidText(SectorCacheStore.field_f, -120 + var2 - 10, -16 + var3, 0, true);
                decompiledFrameRemainder0 = (var5 != 0);
              }
              if (decompiledFrameRemainder0) {
                if (this.buttonMode == 3) {
                  GradientUiRenderer.drawCenteredSolidText(ac.field_u, -10 + var2 - 120, -16 + var3, 0, true);
                  decompiledFrameRemainder0 = (var5 != 0);
                }
                if ((decompiledFrameRemainder0) &&
                  (this.buttonMode == 5)) {
                  GradientUiRenderer.drawCenteredSolidText(GlobalSpell.field_m, -120 + var2 - 10, var3 - 16, 0, true);
                  if (var5 != 0) {
                    GradientUiRenderer.drawGradientFrame(-5 - this.panelWidth + var2, -45 + var3, -10 + this.panelWidth, 30, DisplacedUnitMarker.field_s, AgeValidator.field_k, 0, 192, true);
                  }
                }
              }
            }
          }
        } else {
          GradientUiRenderer.drawGradientFrame(-5 - this.panelWidth + var2, -45 + var3, -10 + this.panelWidth, 30, DisplacedUnitMarker.field_s, AgeValidator.field_k, 0, 192, true);
        }
        if (this.message != null) {
          SoftwareRaster.setClip(var2 - this.panelWidth, -this.panelHeight + var3, var2 - 10, var3 - 45);
          rs.field_n.drawParagraph(this.message, -this.panelWidth + var2, -this.panelHeight + var3, 220, 400, 16777215, -1, 0, 0, 0);
        }
        SoftwareRaster.a();
    }

    private final void a(int param0, int param1, int param2) {
        if (param2 != 26) {
          return;
        }
        this.controller.focusCameraOnTile(25, param0, param1);
    }

    final void clearControlHighlights(byte obfuscationGuard) {
        this.controller.field_fc = false;
        this.controller.field_Mb = false;
        this.controller.field_Ab = false;
        this.controller.field_ac = false;
        if (obfuscationGuard != 37) {
          field_i = (String) null;
        }
    }

    private final void a(int param0, int param1) {
        if (param1 != 13567) {
          return;
        }
        this.messageId = param0;
        this.setStage(34, -30659);
    }

    private final void e(byte param0) {
        if (param0 <= 90) {
          return;
        }
        uh.a(DeployAction.field_s, -91);
    }

    private final void i(byte param0) {
        RevivalEvent.d((byte) 113);
        int var2 = 47 / ((param0 + 75) / 34);
        this.controller.a(0, (byte) 30, 255);
    }

    final void activateButton(boolean obfuscationGuard) {
        int var3;
        boolean stackIn_13_1 = false;
        int stackIn_18_1 = 0;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (obfuscationGuard) {
          this.a((byte) -26);
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.buttonMode != 0) {
          if (1 != this.buttonMode) {
            if (this.buttonMode == 3) {
              this.controller.d(114, true);
              decompiledFrameRemainder0 = (var3 != 0);
            }
            if ((decompiledFrameRemainder0) &&
              (this.buttonMode == 5)) {
              this.stage = 33;
              if (var3 != 0) {
                stackIn_13_1 = !(this.expanded);
                this.expanded = stackIn_13_1;
                if (!this.expanded) {
                  if (this.stage != 34) {
                    stackIn_18_1 = 240;
                  } else {
                    stackIn_18_1 = 100;
                  }
                } else {
                  stackIn_18_1 = 240;
                }
                this.targetPanelWidth = stackIn_18_1;
                this.handleInteraction(-1, -3, 2);
              }
            }
          } else {
            stackIn_13_1 = !(this.expanded);
            this.expanded = stackIn_13_1;
            if (!this.expanded) {
              if (this.stage != 34) {
                stackIn_18_1 = 240;
              } else {
                stackIn_18_1 = 100;
              }
            } else {
              stackIn_18_1 = 240;
            }
            this.targetPanelWidth = stackIn_18_1;
            if (var3 != 0) {
              this.handleInteraction(-1, -3, 2);
            }
          }
        } else {
          this.handleInteraction(-1, -3, 2);
        }

    }

    private final void j(byte param0) {
        if (param0 > -95) {
          this.messageId = 95;
        }
        this.controller.field_fc = true;
    }

    private final void d(int param0) {
        this.controller.battlefield.pendingEvents.addLast((byte) -119, (IntrusiveNode) (new SummonEvent(0, 3, 4, 5, 0, true)));
        int var2 = -44 % ((-70 - param0) / 43);
    }

    private final int classifyTerrainInteraction(int tileIndex, byte obfuscationGuard) {
        int var3;
        int var4;
        if (obfuscationGuard > -108) {
          return -34;
        }
        var3 = this.controller.battlefield.tiles[tileIndex].terrainType;
        var4 = var3;
        if (var4 == 7) {
          return 6;
        }
        if (var4 == 8) {
          return 7;
        }
        if (9 == var4) {
          return 8;
        }
        return 9;
    }

    private final void k(byte param0) {
        if (param0 > -55) {
          return;
        }
        this.controller.field_Mb = true;
    }

    private final void f(byte param0) {
        IndexedSpriteBase.b(13829);
        if (param0 != -34) {
          this.field_s = false;
        }
    }

    final static int a(int param0, String param1, int param2, BitmapFont param3, String[] param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var6Lifetime1;
        var13 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var5_int = param3.textWidth(param1);
          if (param0 >= var5_int &&
            param1.indexOf("<br>") == -1) {
            param4[0] = param1;
            stackIn_4_0 = 1;
            return stackIn_4_0;
          }
          if (param2 != 7502) {
            BattleTutorial.b(6);
          }
          var6 = (-1 + var5_int + param0) / param0;
          param0 = var5_int / var6;
          var6Lifetime1 = 0;
          var7 = 0;
          var8 = param1.length();
          var9 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var8 <= var9))) {
            var10 = param1.charAt(var9);
            stackIn_21_0 = var10;
            stackIn_21_1 = 32;
            if (var13 == 0) {
              if (stackIn_21_0 == stackIn_21_1 ||
                45 == var10) {
                var11 = param1.substring(var7, var9 + 1).trim();
                var12 = param3.textWidth(var11);
                if (var12 >= param0) {
                  incrementValue$0 = var6Lifetime1;
                  var6Lifetime1++;
                  param4[incrementValue$0] = var11;
                  var7 = 1 + var9;
                }
              }
              if (var10 == 62 &&
                param1.regionMatches(-3 + var9, "<br>", 0, 4)) {
                incrementValue$1 = var6Lifetime1;
                var6Lifetime1++;
                param4[incrementValue$1] = param1.substring(var7, -3 + var9).trim();
                var7 = var9 + 1;
              }
              var9++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_21_0 = var8;
            stackIn_21_1 = var7;
          }
          if (stackIn_21_0 > stackIn_21_1) {
            incrementValue$2 = var6Lifetime1;
            var6Lifetime1++;
            param4[incrementValue$2] = param1.substring(var7, var8).trim();
          }
          stackIn_25_0 = var6Lifetime1;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("iu.MA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param4 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    private final void e(int param0) {
        this.controller.field_ac = true;
        if (param0 != 31) {
          this.message = (String) null;
        }
    }

    public static void b(int param0) {
        field_i = null;
        field_u = null;
        field_l = null;
        if (param0 != 1) {
          return;
        }
        field_d = null;
        field_b = null;
        field_r = null;
    }

    BattleTutorial(GameplayController controller, int messageId) {
        this.panelWidth = 240;
        this.buttonMode = 0;
        this.autoAdvanceFrames = 0;
        this.stage = 0;
        this.panelHeight = 40;
        try {
          this.expandedPanelHeight = 40;
          this.controller = controller;
          this.a(messageId, 13567);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "iu.<init>(" + (controller != null ? "{...}" : "null") + ',' + messageId + ')');
        }
    }

    BattleTutorial(GameplayController controller) {
        this.panelWidth = 240;
        this.buttonMode = 0;
        this.autoAdvanceFrames = 0;
        this.stage = 0;
        this.panelHeight = 40;
        try {
          this.expandedPanelHeight = 40;
          this.controller = controller;
          this.field_s = false;
          this.enemyWaveSpawned = false;
          this.field_o = false;
          this.setStage(0, -30659);
          this.controller.battlefield.tiles[DeployAction.field_s[0]].ownerPlayer = 1;
          this.controller.battlefield.bypassDefeatAndSpellConsumption = true;
          this.controller.battlefield.teamStructureCounts[1][1] = 1;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "iu.<init>(" + (controller != null ? "{...}" : "null") + ')');
        }
    }

    static {
        pointerPressX = 0;
        field_b = "Change display name";
        field_l = "Year";
        field_i = "Offline";
        consoleStringKind = 4;
        quickChatMenuVisible = false;
        field_r = "This unit already has a poisonous attack.";
        field_u = "You need to choose a name before you can log in. This is the name that will be displayed to other players.";
    }
}
