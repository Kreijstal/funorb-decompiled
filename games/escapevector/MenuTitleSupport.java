/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MenuTitleSupport {
    static int field_d;
    static int field_e;
    static String[] field_c;
    static String field_b;
    static String field_a;

    final static void updateTitleBanner(int guard) {
        int var4 = EscapeVector.obfuscationControl;
        DialogueScreen var1 = DropTargetWidget.f((byte) -49);
        if (guard >= 60) {
          if (null != BoundedRandomAccessFile.activeSession) {
            LaserGateSpan.field_k = 0;
            return;
          }
          if (var1 == null &&
            LaserGateSpan.field_k < 80) {
            LaserGateSpan.field_k = 95;
            ObjectSpriteSet.field_e.playSampleWithPan(SpriteLoadTask.field_i, 100, 3072 * IterableNodeHashTable.field_c / 64, 8192);
          }
          Object var2 = null;
          int var3 = 0;
          if (!wk.field_c) {
            if (TextLayout.field_b) {
              Sprite var18 = TextWidgetPainter.field_j;
              var2 = var18;
              var3 = (77 - var18.fullHeight) / 2;
            } else {
              if (SelfDestructEffects.field_q == 0) {
                Sprite var17 = SocketConnector.field_c;
                var2 = var17;
                var3 = (77 - var17.fullHeight) / 2;
                if (var2 == null) {
                  if (LaserGateSpan.field_k == 110) {
                    ObjectSpriteSet.field_e.playSampleWithPan(NameAvailabilityResultSupport.field_a, 100, IterableNodeHashTable.field_c * 3072 / 64, 8192);
                  }
                  if (LaserGateSpan.field_k > 80) {
                    LaserGateSpan.field_k = LaserGateSpan.field_k - 1;
                  }
                } else {
                  SimulatorAssetSupport.field_b = var3;
                  EmailAvailabilityValidator.field_t = (Sprite) (var2);
                  if (!(LaserGateSpan.field_k >= 95)) {
                    LaserGateSpan.field_k = 95;
                    ObjectSpriteSet.field_e.playSampleWithPan(SpriteLoadTask.field_i, 100, IterableNodeHashTable.field_c * 3072 / 64, 8192);
                  } else if (LaserGateSpan.field_k < 110) {
                    LaserGateSpan.field_k = LaserGateSpan.field_k + 1;
                  }
                }
                return;
              }
              if (SelfDestructEffects.field_q == 1) {
                Sprite var12 = SocketConnector.field_c;
                var2 = var12;
                var3 = (77 - var12.fullHeight) / 2;
              } else if (SelfDestructEffects.field_q == 2) {
                Sprite var13 = p.field_c;
                var2 = var13;
                var3 = (77 - var13.fullHeight) / 2;
              } else if (SelfDestructEffects.field_q == 3) {
                Sprite var14 = ValidationIndicator.field_Q;
                var2 = var14;
                var3 = (77 - var14.fullHeight) / 2;
              } else if (!PacketBuffer.field_h) {
                if (e.field_a) {
                  if (TrackerMusicDefinition.field_f.hasSessionAchievements(123)) {
                    var2 = ValidationHelpWidget.field_I;
                  } else {
                    var2 = DisplayNameForm.field_O;
                  }
                  var3 = (-((Sprite) (var2)).fullHeight + 90) / 2;
                  if (var2 == null) {
                    if (LaserGateSpan.field_k == 110) {
                      ObjectSpriteSet.field_e.playSampleWithPan(NameAvailabilityResultSupport.field_a, 100, IterableNodeHashTable.field_c * 3072 / 64, 8192);
                    }
                    if (LaserGateSpan.field_k > 80) {
                      LaserGateSpan.field_k = LaserGateSpan.field_k - 1;
                    }
                  } else {
                    SimulatorAssetSupport.field_b = var3;
                    EmailAvailabilityValidator.field_t = (Sprite) (var2);
                    if (!(LaserGateSpan.field_k >= 95)) {
                      LaserGateSpan.field_k = 95;
                      ObjectSpriteSet.field_e.playSampleWithPan(SpriteLoadTask.field_i, 100, IterableNodeHashTable.field_c * 3072 / 64, 8192);
                    } else if (LaserGateSpan.field_k < 110) {
                      LaserGateSpan.field_k = LaserGateSpan.field_k + 1;
                    }
                  }
                  return;
                }
                if (CheckboxPainter.field_n) {
                  Sprite var15 = DynamicTerrainRenderer.field_w;
                  var2 = var15;
                  var3 = (66 - var15.fullHeight) / 2;
                } else if (PauseMenuState.instructionsVisible) {
                  Sprite var16 = AccountTermsPanel.field_H;
                  var2 = var16;
                  var3 = (100 - var16.fullHeight) / 2;
                }
              }
            }
          }
          if (var2 == null) {
            if (LaserGateSpan.field_k == 110) {
              ObjectSpriteSet.field_e.playSampleWithPan(NameAvailabilityResultSupport.field_a, 100, IterableNodeHashTable.field_c * 3072 / 64, 8192);
            }
            if (LaserGateSpan.field_k <= 80) {
              return;
            }
            LaserGateSpan.field_k = LaserGateSpan.field_k - 1;
          } else {
            SimulatorAssetSupport.field_b = var3;
            EmailAvailabilityValidator.field_t = (Sprite) (var2);
            if (LaserGateSpan.field_k < 95) {
              LaserGateSpan.field_k = 95;
              ObjectSpriteSet.field_e.playSampleWithPan(SpriteLoadTask.field_i, 100, IterableNodeHashTable.field_c * 3072 / 64, 8192);
              return;
            }
            if (LaserGateSpan.field_k < 110) {
              LaserGateSpan.field_k = LaserGateSpan.field_k + 1;
              return;
            }
          }
          return;
        }
        MenuTitleSupport.releaseStatics((byte) -88);
        if (null != BoundedRandomAccessFile.activeSession) {
          LaserGateSpan.field_k = 0;
          return;
        }
        if (var1 != null) {
          Object var2Lifetime1 = null;
          int var3Lifetime1 = 0;
          if (!wk.field_c) {
            if (TextLayout.field_b) {
              Sprite var25 = TextWidgetPainter.field_j;
              var2Lifetime1 = var25;
              var3Lifetime1 = (77 - var25.fullHeight) / 2;
            } else {
              if (SelfDestructEffects.field_q == 0) {
                Sprite var24 = SocketConnector.field_c;
                var2Lifetime1 = var24;
                var3Lifetime1 = (77 - var24.fullHeight) / 2;
                if (var2Lifetime1 == null) {
                  if (LaserGateSpan.field_k == 110) {
                    ObjectSpriteSet.field_e.playSampleWithPan(NameAvailabilityResultSupport.field_a, 100, IterableNodeHashTable.field_c * 3072 / 64, 8192);
                  }
                  if (LaserGateSpan.field_k > 80) {
                    LaserGateSpan.field_k = LaserGateSpan.field_k - 1;
                  }
                } else {
                  SimulatorAssetSupport.field_b = var3Lifetime1;
                  EmailAvailabilityValidator.field_t = (Sprite) (var2Lifetime1);
                  if (!(LaserGateSpan.field_k >= 95)) {
                    LaserGateSpan.field_k = 95;
                    ObjectSpriteSet.field_e.playSampleWithPan(SpriteLoadTask.field_i, 100, IterableNodeHashTable.field_c * 3072 / 64, 8192);
                  } else if (LaserGateSpan.field_k < 110) {
                    LaserGateSpan.field_k = LaserGateSpan.field_k + 1;
                  }
                }
                return;
              }
              if (SelfDestructEffects.field_q == 1) {
                Sprite var19 = SocketConnector.field_c;
                var2Lifetime1 = var19;
                var3Lifetime1 = (77 - var19.fullHeight) / 2;
              } else if (SelfDestructEffects.field_q == 2) {
                Sprite var20 = p.field_c;
                var2Lifetime1 = var20;
                var3Lifetime1 = (77 - var20.fullHeight) / 2;
              } else if (SelfDestructEffects.field_q == 3) {
                Sprite var21 = ValidationIndicator.field_Q;
                var2Lifetime1 = var21;
                var3Lifetime1 = (77 - var21.fullHeight) / 2;
              } else if (!PacketBuffer.field_h) {
                if (e.field_a) {
                  if (TrackerMusicDefinition.field_f.hasSessionAchievements(123)) {
                    var2Lifetime1 = ValidationHelpWidget.field_I;
                  } else {
                    var2Lifetime1 = DisplayNameForm.field_O;
                  }
                  var3Lifetime1 = (-((Sprite) (var2Lifetime1)).fullHeight + 90) / 2;
                  if (var2Lifetime1 == null) {
                    if (LaserGateSpan.field_k == 110) {
                      ObjectSpriteSet.field_e.playSampleWithPan(NameAvailabilityResultSupport.field_a, 100, IterableNodeHashTable.field_c * 3072 / 64, 8192);
                    }
                    if (LaserGateSpan.field_k > 80) {
                      LaserGateSpan.field_k = LaserGateSpan.field_k - 1;
                    }
                  } else {
                    SimulatorAssetSupport.field_b = var3Lifetime1;
                    EmailAvailabilityValidator.field_t = (Sprite) (var2Lifetime1);
                    if (!(LaserGateSpan.field_k >= 95)) {
                      LaserGateSpan.field_k = 95;
                      ObjectSpriteSet.field_e.playSampleWithPan(SpriteLoadTask.field_i, 100, IterableNodeHashTable.field_c * 3072 / 64, 8192);
                    } else if (LaserGateSpan.field_k < 110) {
                      LaserGateSpan.field_k = LaserGateSpan.field_k + 1;
                    }
                  }
                  return;
                }
                if (CheckboxPainter.field_n) {
                  Sprite var22 = DynamicTerrainRenderer.field_w;
                  var2Lifetime1 = var22;
                  var3Lifetime1 = (66 - var22.fullHeight) / 2;
                } else if (PauseMenuState.instructionsVisible) {
                  Sprite var23 = AccountTermsPanel.field_H;
                  var2Lifetime1 = var23;
                  var3Lifetime1 = (100 - var23.fullHeight) / 2;
                }
              }
            }
          }
          if (var2Lifetime1 == null) {
            if (LaserGateSpan.field_k == 110) {
              ObjectSpriteSet.field_e.playSampleWithPan(NameAvailabilityResultSupport.field_a, 100, IterableNodeHashTable.field_c * 3072 / 64, 8192);
            }
            if (LaserGateSpan.field_k <= 80) {
              return;
            }
            LaserGateSpan.field_k = LaserGateSpan.field_k - 1;
            return;
          }
          SimulatorAssetSupport.field_b = var3Lifetime1;
          EmailAvailabilityValidator.field_t = (Sprite) (var2Lifetime1);
          if (LaserGateSpan.field_k < 95) {
            LaserGateSpan.field_k = 95;
            ObjectSpriteSet.field_e.playSampleWithPan(SpriteLoadTask.field_i, 100, IterableNodeHashTable.field_c * 3072 / 64, 8192);
            return;
          }
          if (LaserGateSpan.field_k >= 110) {
            return;
          }
          LaserGateSpan.field_k = LaserGateSpan.field_k + 1;
          return;
        }
        if (LaserGateSpan.field_k < 80) {
          LaserGateSpan.field_k = 95;
          ObjectSpriteSet.field_e.playSampleWithPan(SpriteLoadTask.field_i, 100, 3072 * IterableNodeHashTable.field_c / 64, 8192);
        }
        Object var2Lifetime2 = null;
        int var3Lifetime2 = 0;
        if (wk.field_c) {
          if (var2Lifetime2 == null) {
            if (LaserGateSpan.field_k == 110) {
              ObjectSpriteSet.field_e.playSampleWithPan(NameAvailabilityResultSupport.field_a, 100, IterableNodeHashTable.field_c * 3072 / 64, 8192);
            }
            if (LaserGateSpan.field_k <= 80) {
              return;
            }
            LaserGateSpan.field_k = LaserGateSpan.field_k - 1;
            return;
          }
          SimulatorAssetSupport.field_b = var3Lifetime2;
          EmailAvailabilityValidator.field_t = (Sprite) (var2Lifetime2);
          if (LaserGateSpan.field_k < 95) {
            LaserGateSpan.field_k = 95;
            ObjectSpriteSet.field_e.playSampleWithPan(SpriteLoadTask.field_i, 100, IterableNodeHashTable.field_c * 3072 / 64, 8192);
            return;
          }
          if (LaserGateSpan.field_k >= 110) {
            return;
          }
          LaserGateSpan.field_k = LaserGateSpan.field_k + 1;
          return;
        }
        if (TextLayout.field_b) {
          Sprite var32 = TextWidgetPainter.field_j;
          var2Lifetime2 = var32;
          var3Lifetime2 = (77 - var32.fullHeight) / 2;
        } else {
          if (SelfDestructEffects.field_q == 0) {
            Sprite var31 = SocketConnector.field_c;
            var2Lifetime2 = var31;
            var3Lifetime2 = (77 - var31.fullHeight) / 2;
            if (var2Lifetime2 == null) {
              if (LaserGateSpan.field_k == 110) {
                ObjectSpriteSet.field_e.playSampleWithPan(NameAvailabilityResultSupport.field_a, 100, IterableNodeHashTable.field_c * 3072 / 64, 8192);
              }
              if (LaserGateSpan.field_k <= 80) {
                return;
              }
              LaserGateSpan.field_k = LaserGateSpan.field_k - 1;
            } else {
              SimulatorAssetSupport.field_b = var3Lifetime2;
              EmailAvailabilityValidator.field_t = (Sprite) (var2Lifetime2);
              if (LaserGateSpan.field_k < 95) {
                LaserGateSpan.field_k = 95;
                ObjectSpriteSet.field_e.playSampleWithPan(SpriteLoadTask.field_i, 100, IterableNodeHashTable.field_c * 3072 / 64, 8192);
                return;
              }
              if (LaserGateSpan.field_k < 110) {
                LaserGateSpan.field_k = LaserGateSpan.field_k + 1;
                return;
              }
            }
            return;
          }
          if (SelfDestructEffects.field_q == 1) {
            Sprite var26 = SocketConnector.field_c;
            var2Lifetime2 = var26;
            var3Lifetime2 = (77 - var26.fullHeight) / 2;
          } else if (SelfDestructEffects.field_q != 2) {
            if (SelfDestructEffects.field_q != 3) {
              if (PacketBuffer.field_h) {
                if (var2Lifetime2 == null) {
                  if (LaserGateSpan.field_k == 110) {
                    ObjectSpriteSet.field_e.playSampleWithPan(NameAvailabilityResultSupport.field_a, 100, IterableNodeHashTable.field_c * 3072 / 64, 8192);
                  }
                  if (LaserGateSpan.field_k <= 80) {
                    return;
                  }
                  LaserGateSpan.field_k = LaserGateSpan.field_k - 1;
                  return;
                }
                SimulatorAssetSupport.field_b = var3Lifetime2;
                EmailAvailabilityValidator.field_t = (Sprite) (var2Lifetime2);
                if (LaserGateSpan.field_k < 95) {
                  LaserGateSpan.field_k = 95;
                  ObjectSpriteSet.field_e.playSampleWithPan(SpriteLoadTask.field_i, 100, IterableNodeHashTable.field_c * 3072 / 64, 8192);
                  return;
                }
                if (LaserGateSpan.field_k >= 110) {
                  return;
                }
                LaserGateSpan.field_k = LaserGateSpan.field_k + 1;
                return;
              }
              if (e.field_a) {
                if (TrackerMusicDefinition.field_f.hasSessionAchievements(123)) {
                  var2Lifetime2 = ValidationHelpWidget.field_I;
                } else {
                  var2Lifetime2 = DisplayNameForm.field_O;
                }
                var3Lifetime2 = (-((Sprite) (var2Lifetime2)).fullHeight + 90) / 2;
                if (var2Lifetime2 == null) {
                  if (LaserGateSpan.field_k == 110) {
                    ObjectSpriteSet.field_e.playSampleWithPan(NameAvailabilityResultSupport.field_a, 100, IterableNodeHashTable.field_c * 3072 / 64, 8192);
                  }
                  if (LaserGateSpan.field_k <= 80) {
                    return;
                  }
                  LaserGateSpan.field_k = LaserGateSpan.field_k - 1;
                } else {
                  SimulatorAssetSupport.field_b = var3Lifetime2;
                  EmailAvailabilityValidator.field_t = (Sprite) (var2Lifetime2);
                  if (LaserGateSpan.field_k < 95) {
                    LaserGateSpan.field_k = 95;
                    ObjectSpriteSet.field_e.playSampleWithPan(SpriteLoadTask.field_i, 100, IterableNodeHashTable.field_c * 3072 / 64, 8192);
                    return;
                  }
                  if (LaserGateSpan.field_k < 110) {
                    LaserGateSpan.field_k = LaserGateSpan.field_k + 1;
                    return;
                  }
                }
                return;
              }
              if (CheckboxPainter.field_n) {
                Sprite var29 = DynamicTerrainRenderer.field_w;
                var2Lifetime2 = var29;
                var3Lifetime2 = (66 - var29.fullHeight) / 2;
                if (var2Lifetime2 == null) {
                  if (LaserGateSpan.field_k == 110) {
                    ObjectSpriteSet.field_e.playSampleWithPan(NameAvailabilityResultSupport.field_a, 100, IterableNodeHashTable.field_c * 3072 / 64, 8192);
                  }
                  if (LaserGateSpan.field_k <= 80) {
                    return;
                  }
                  LaserGateSpan.field_k = LaserGateSpan.field_k - 1;
                  return;
                }
                SimulatorAssetSupport.field_b = var3Lifetime2;
                EmailAvailabilityValidator.field_t = (Sprite) (var2Lifetime2);
                if (LaserGateSpan.field_k < 95) {
                  LaserGateSpan.field_k = 95;
                  ObjectSpriteSet.field_e.playSampleWithPan(SpriteLoadTask.field_i, 100, IterableNodeHashTable.field_c * 3072 / 64, 8192);
                  return;
                }
                if (LaserGateSpan.field_k >= 110) {
                  return;
                }
                LaserGateSpan.field_k = LaserGateSpan.field_k + 1;
                return;
              }
              if (!PauseMenuState.instructionsVisible) {
                if (var2Lifetime2 == null) {
                  if (LaserGateSpan.field_k == 110) {
                    ObjectSpriteSet.field_e.playSampleWithPan(NameAvailabilityResultSupport.field_a, 100, IterableNodeHashTable.field_c * 3072 / 64, 8192);
                  }
                  if (LaserGateSpan.field_k <= 80) {
                    return;
                  }
                  LaserGateSpan.field_k = LaserGateSpan.field_k - 1;
                } else {
                  SimulatorAssetSupport.field_b = var3Lifetime2;
                  EmailAvailabilityValidator.field_t = (Sprite) (var2Lifetime2);
                  if (LaserGateSpan.field_k < 95) {
                    LaserGateSpan.field_k = 95;
                    ObjectSpriteSet.field_e.playSampleWithPan(SpriteLoadTask.field_i, 100, IterableNodeHashTable.field_c * 3072 / 64, 8192);
                    return;
                  }
                  if (LaserGateSpan.field_k < 110) {
                    LaserGateSpan.field_k = LaserGateSpan.field_k + 1;
                    return;
                  }
                }
                return;
              }
              Sprite var30 = AccountTermsPanel.field_H;
              var2Lifetime2 = var30;
              var3Lifetime2 = (100 - var30.fullHeight) / 2;
              if (var2Lifetime2 == null) {
                if (LaserGateSpan.field_k == 110) {
                  ObjectSpriteSet.field_e.playSampleWithPan(NameAvailabilityResultSupport.field_a, 100, IterableNodeHashTable.field_c * 3072 / 64, 8192);
                }
                if (LaserGateSpan.field_k <= 80) {
                  return;
                }
                LaserGateSpan.field_k = LaserGateSpan.field_k - 1;
              } else {
                SimulatorAssetSupport.field_b = var3Lifetime2;
                EmailAvailabilityValidator.field_t = (Sprite) (var2Lifetime2);
                if (LaserGateSpan.field_k < 95) {
                  LaserGateSpan.field_k = 95;
                  ObjectSpriteSet.field_e.playSampleWithPan(SpriteLoadTask.field_i, 100, IterableNodeHashTable.field_c * 3072 / 64, 8192);
                  return;
                }
                if (LaserGateSpan.field_k < 110) {
                  LaserGateSpan.field_k = LaserGateSpan.field_k + 1;
                  return;
                }
              }
              return;
            }
            Sprite var28 = ValidationIndicator.field_Q;
            var2Lifetime2 = var28;
            var3Lifetime2 = (77 - var28.fullHeight) / 2;
          } else {
            Sprite var27 = p.field_c;
            var2Lifetime2 = var27;
            var3Lifetime2 = (77 - var27.fullHeight) / 2;
          }
        }
        if (var2Lifetime2 == null) {
          if (LaserGateSpan.field_k == 110) {
            ObjectSpriteSet.field_e.playSampleWithPan(NameAvailabilityResultSupport.field_a, 100, IterableNodeHashTable.field_c * 3072 / 64, 8192);
          }
          if (LaserGateSpan.field_k <= 80) {
            return;
          }
          LaserGateSpan.field_k = LaserGateSpan.field_k - 1;
        } else {
          SimulatorAssetSupport.field_b = var3Lifetime2;
          EmailAvailabilityValidator.field_t = (Sprite) (var2Lifetime2);
          if (LaserGateSpan.field_k < 95) {
            LaserGateSpan.field_k = 95;
            ObjectSpriteSet.field_e.playSampleWithPan(SpriteLoadTask.field_i, 100, IterableNodeHashTable.field_c * 3072 / 64, 8192);
            return;
          }
          if (LaserGateSpan.field_k < 110) {
            LaserGateSpan.field_k = LaserGateSpan.field_k + 1;
            return;
          }
        }
        return;
    }

    final static void incrementSessionCounter(byte guard, int amount) {
        if (SocketJs5Transport.field_r != null) {
          SocketJs5Transport.field_r.d(amount, 136);
          if (guard != 99) {
            MenuTitleSupport.releaseStatics((byte) -88);
            return;
          }
          return;
        }
        if (guard == 99) {
          return;
        }
        MenuTitleSupport.releaseStatics((byte) -88);
    }

    final static boolean isPointerDriven(byte guard) {
        boolean var1 = true;
        int var3 = 116 / ((guard + 18) / 46);
        MenuInputState var2 = di.field_d;
        if (var2 != null) {
          var1 = (var2.pointerDriven);
        }
        return (var1);
    }

    public static void releaseStatics(byte guard) {
        field_a = null;
        field_b = null;
        if (guard != 26) {
          MenuTitleSupport.isPointerDriven((byte) 37);
          field_c = null;
          return;
        }
        field_c = null;
    }

    static {
        field_c = new String[]{"Commander, you have been tasked with eliminating the alien's fuel processing facilities located in their asteroid belt.", "Seek out and destroy their manufacturing equipment.", "Your ship has been outfitted with a more powerful engine and its guns have also been upgraded."};
        field_b = "Login: ";
        field_a = "Members";
    }
}
