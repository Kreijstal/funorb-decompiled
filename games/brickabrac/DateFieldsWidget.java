/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DateFieldsWidget extends DateInputWidget {
    private boolean monthFirst;
    private TextFieldWidget dayField;
    private TextFieldWidget yearField;
    private TextFieldWidget monthField;
    static LevelPack[] field_L;
    static String field_N;
    static NodeDeque pendingAchievementSubmissions;

    final void setBounds(int height, int x, int y, byte obfuscationGuard, int width) {
        super.setBounds(height, x, y, (byte) -119, width);
        int var6 = -130 + width >> 1;
        if (!this.monthFirst) {
          this.dayField.setBounds(height, var6, 0, (byte) -119, 25);
          this.monthField.setBounds(height, var6 + 45, 0, (byte) -119, 25);
          this.yearField.setBounds(height, 90 + var6, 0, obfuscationGuard, 40);
          return;
        }
        this.monthField.setBounds(height, var6, 0, (byte) -119, 25);
        this.dayField.setBounds(height, 45 + var6, 0, (byte) -119, 25);
        this.yearField.setBounds(height, 90 + var6, 0, obfuscationGuard, 40);
    }

    final String getTooltip(int obfuscationGuard) {
        String var2 = this.monthField.getTooltip(77);
        if (var2 != null) {
          return var2;
        }
        if (obfuscationGuard <= 6) {
          DateFieldsWidget.j((byte) -82);
          if (this.mouseOver) {
            return this.tooltip == null ? this.text : this.tooltip;
          }
          return null;
        }
        if (this.mouseOver) {
          return this.tooltip == null ? this.text : this.tooltip;
        }
        return null;
    }

    final void setBirthDateValidator(BirthDateValidator validator, byte obfuscationGuard) {
        try {
          super.setBirthDateValidator(validator, obfuscationGuard);
          this.dayField.listener = (WidgetListener) ((Object) validator);
          this.monthField.listener = (WidgetListener) ((Object) validator);
          this.yearField.listener = (WidgetListener) ((Object) validator);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "na.N(" + (validator != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    final int getYear(int obfuscationGuard) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (obfuscationGuard != 5390) {
          this.monthField = (TextFieldWidget) null;
        }
        try {
          stackIn_3_0 = Integer.parseInt(this.yearField.text);
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    final static RgbSprite[] a(boolean param0, int param1, int param2, int param3, int param4, int param5) {
        RgbSprite var16 = null;
        int[] var18 = Rasterizer2D.pixels;
        int[] var17 = var18;
        int[] var15 = var17;
        int[] var6 = var15;
        int var7 = Rasterizer2D.width;
        int var8 = Rasterizer2D.height;
        RgbSprite var9 = new RgbSprite(param2, param4 - param2 * 2);
        var9.bindRasterTarget();
        Rasterizer2D.fillVerticalGradient(0, 0, param2, param4 - param2 * 2, param3, param1);
        RgbSprite var10 = new RgbSprite(param2, param2);
        var10.bindRasterTarget();
        Rasterizer2D.fillRectangle(0, 0, param2, param2, param3);
        RgbSprite var11 = new RgbSprite(16, param2);
        var11.bindRasterTarget();
        Rasterizer2D.fillRectangle(0, 0, 16, param2, param3);
        RgbSprite var12 = new RgbSprite(param2, param2);
        var12.bindRasterTarget();
        Rasterizer2D.fillRectangle(0, 0, param2, param2, param1);
        RgbSprite var13 = new RgbSprite(16, param2);
        var13.bindRasterTarget();
        Rasterizer2D.fillRectangle(0, 0, 16, param2, param1);
        Object var14 = null;
        if (0 < param5) {
          var16 = new RgbSprite(16, 16);
          var14 = var16;
          var16.bindRasterTarget();
          Rasterizer2D.fillRectangle(0, 0, 16, 16, param5);
        }
        Rasterizer2D.bind(var18, var7, var8);
        if (!param0) {
          return new RgbSprite[]{var10, var11, var10, var9, (RgbSprite) (var14), var9, var12, var13, var12};
        }
        DateFieldsWidget.a(false, 118, 124, -92, 47, -40);
        return new RgbSprite[]{var10, var11, var10, var9, (RgbSprite) (var14), var9, var12, var13, var12};
    }

    private DateFieldsWidget(WidgetRenderer renderer, boolean monthFirst) {
        super(0, 0, 0, 0, (WidgetRenderer) null);
        try {
          this.dayField = (TextFieldWidget) ((Object) new ValidatedTextFieldWidget("", (WidgetListener) null, 2));
          this.monthField = (TextFieldWidget) ((Object) new ValidatedTextFieldWidget("", (WidgetListener) null, 2));
          this.yearField = (TextFieldWidget) ((Object) new ValidatedTextFieldWidget("", (WidgetListener) null, 4));
          this.yearField.renderer = renderer;
          this.monthField.renderer = renderer;
          this.dayField.renderer = renderer;
          this.monthFirst = monthFirst ? true : false;
          if (!this.monthFirst) {
            this.addChild(this.dayField, true);
            this.addChild(this.monthField, true);
          } else {
            this.addChild(this.monthField, true);
            this.addChild(this.dayField, true);
          }
          this.addChild(this.yearField, true);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "na.<init>(" + (renderer != null ? "{...}" : "null") + ',' + monthFirst + ')');
        }
    }

    final static boolean j(byte param0) {
        if (param0 != -60) {
          DateFieldsWidget.a(true, 76, -125, -71, 104, -123);
          if (MusicCrossfadeStream.nameEntryPopup == null) {
            return false;
          }
          if (MusicCrossfadeStream.nameEntryPopup.handleNormalizedNameKey(param0 ^ -55)) {
            return true;
          }
          return false;
        }
        if (MusicCrossfadeStream.nameEntryPopup == null) {
          return false;
        }
        if (MusicCrossfadeStream.nameEntryPopup.handleNormalizedNameKey(param0 ^ -55)) {
          return true;
        }
        return false;
    }

    final boolean isDateIncomplete(byte obfuscationGuard) {
        if (null == this.dayField.text) {
          return true;
        }
        if (0 == this.dayField.text.length()) {
          return true;
        }
        if (this.monthField.text == null) {
          return true;
        }
        if (this.monthField.text.length() == 0) {
          return true;
        }
        if (obfuscationGuard != -124) {
          pendingAchievementSubmissions = (NodeDeque) null;
        }
        if (this.yearField.text != null &&
          this.yearField.text.length() != 0) {
          return false;
        }
        return true;
    }

    private final void a(Widget param0, String param1, byte param2, int param3, int param4) {
        try {
          QuickChatMenu.field_Yb.drawCentered(param1, param3 + param0.x + (param0.width >> 1), param0.y + (param4 - 5), 16777215, -1);
          int var6_int = -127 % ((-2 - param2) / 59);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "na.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(int param0, String param1, String param2, int param3, int param4) {
        try {
          PasswordValidator.field_n.textColor = param4;
          PasswordValidator.field_n.textSuffix = param1;
          PasswordValidator.field_n.text = param2;
          PasswordValidator.field_n.width = PasswordValidator.field_n.width + ap.field_e.width;
          ap.field_e.localX = ap.field_e.localX + ap.field_e.width;
          ap.field_e.width = param3;
          if (param0 >= -72) {
            DateFieldsWidget.a(true, true, 77, -47);
          }
          PasswordValidator.field_n.width = PasswordValidator.field_n.width - ap.field_e.width;
          ap.field_e.localX = ap.field_e.localX - ap.field_e.width;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "na.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0, boolean param1, int param2, int param3) {
        UiComponent stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        UiComponent stackIn_14_0 = null;
        boolean stackIn_15_1 = false;
        UiComponent stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        UiComponent stackIn_48_0 = null;
        boolean stackIn_49_1 = false;
        UiComponent stackIn_55_0 = null;
        boolean stackIn_56_1 = false;
        UiComponent stackIn_60_0 = null;
        boolean stackIn_61_1 = false;
        int var4;
        Brick.e(-79);
        if (ConditionalTextValue.field_h >= 0) {
          DraggableWidget.field_N.text = rd.a(rm.field_c, new String[]{Integer.toString(ConditionalTextValue.field_h)}, (byte) 103);
          var4 = 34 / ((-10 - param2) / 53);
          stackIn_48_0 = ContentTransitionLayer.field_gb;
          stackIn_49_1 = (param0) && (!param1) && (!sc.field_c) && (null == o.currentLobbyGame) && (nl.pendingLobbyGame == null);
          ((UiComponent) (Object) stackIn_48_0).updateRoot(stackIn_49_1, -15211);
          stackIn_55_0 = rm.field_a;
          stackIn_56_1 = (param0) && (!param1) && (!sc.field_c) && (o.currentLobbyGame == null) && (null == nl.pendingLobbyGame);
          ((UiComponent) (Object) stackIn_55_0).updateRoot(stackIn_56_1, -15211);
          stackIn_60_0 = qp.field_f;
          stackIn_61_1 = (param0) && (!param1) && (sc.field_c);
          ((UiComponent) (Object) stackIn_60_0).updateRoot(stackIn_61_1, -15211);
        } else {
          DraggableWidget.field_N.text = null;
          var4 = 34 / ((-10 - param2) / 53);
          stackIn_7_0 = ContentTransitionLayer.field_gb;
          stackIn_8_1 = (param0) && (!param1) && (!sc.field_c) && (null == o.currentLobbyGame) && (nl.pendingLobbyGame == null);
          ((UiComponent) (Object) stackIn_7_0).updateRoot(stackIn_8_1, -15211);
          stackIn_14_0 = rm.field_a;
          stackIn_15_1 = (param0) && (!param1) && (!sc.field_c) && (o.currentLobbyGame == null) && (null == nl.pendingLobbyGame);
          ((UiComponent) (Object) stackIn_14_0).updateRoot(stackIn_15_1, -15211);
          stackIn_19_0 = qp.field_f;
          stackIn_20_1 = (param0) && (!param1) && (sc.field_c);
          ((UiComponent) (Object) stackIn_19_0).updateRoot(stackIn_20_1, -15211);
        }
        ap.field_b.tabs.processTabPresses(0);
        if (HighscorePackSelector.field_k.pressedButton != 0) {
          tq.field_c = true;
        }
        if (gj.field_b.pressedButton != 0) {
          if (ea.field_g) {
            TextLineLayout.requestMatchmakingOptions(param3, -1);
          } else {
            if (ResourceArchiveFactory.windowModeCapabilityWord > 0) {
              TextLineLayout.requestMatchmakingOptions(param3, -1);
            } else {
              if (QuickChatHelpDialog.field_Yb >= 2 &&
                IntArrayRequest.heldKeys[12]) {
                TextLineLayout.requestMatchmakingOptions(param3, -1);
              }
            }
          }
        }
        if (VolcanicBackground.field_v.pressedButton != 0) {
          if (1 == ScreenshotViewer.field_n.length &&
            RadialSelectorRenderer.field_i != ScreenshotViewer.field_n[0]) {
            RadialSelectorRenderer.field_i = ScreenshotViewer.field_n[0];
          }
          pl.requestCreateGame(param3, Brick.field_O, RadialSelectorRenderer.field_i, true, 0, (byte) -102);
        }
        if (0 != LobbyUiHelpers.cancelCreateGameButton.pressedButton) {
          sc.field_c = false;
        }
    }

    final void drawLayer(int parentY, int parentX, int layer, byte obfuscationGuard) {
        super.drawLayer(parentY, parentX, layer, obfuscationGuard);
        if (layer == 0) {
          parentY = parentY + this.y;
          parentX = parentX + this.x;
          this.a(this.dayField, StrongCacheEntry.field_M, (byte) 127, parentX, parentY);
          this.a(this.monthField, rl.field_f, (byte) 123, parentX, parentY);
          this.a(this.yearField, kk.field_f, (byte) -86, parentX, parentY);
          return;
        }
    }

    DateFieldsWidget(WidgetRenderer renderer, boolean monthFirst, int x, int y, int width, int height) {
        this(renderer, monthFirst);
        try {
          this.setBounds(height, x, y, (byte) -119, width);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "na.<init>(" + (renderer != null ? "{...}" : "null") + ',' + monthFirst + ',' + x + ',' + y + ',' + width + ',' + height + ')');
        }
    }

    final static byte a(int param0, char param1) {
        int var2;
        int var3;
        var3 = BrickABrac.field_J ? 1 : 0;
        if (param1 <= 0) {
          if (param1 < 160) {
            if (param1 == 8364) {
              var2 = -128;
            } else {
              if (8218 != param1) {
                if (param1 != 402) {
                  if (param1 == 8222) {
                    var2 = -124;
                  } else {
                    if (param1 != 8230) {
                      if (8224 != param1) {
                        if (8225 != param1) {
                          if (param1 == 710) {
                            var2 = -120;
                          } else {
                            if (param1 != 8240) {
                              if (param1 == 352) {
                                var2 = -118;
                              } else {
                                if (param1 != 8249) {
                                  if (param1 == 338) {
                                    var2 = -116;
                                  } else {
                                    if (381 != param1) {
                                      if (param1 == 8216) {
                                        var2 = -111;
                                      } else {
                                        if (param1 != 8217) {
                                          if (param1 != 8220) {
                                            if (param1 != 8221) {
                                              if (8226 != param1) {
                                                if (8211 != param1) {
                                                  if (param1 != 8212) {
                                                    if (param1 != 732) {
                                                      if (param1 == 8482) {
                                                        var2 = -103;
                                                      } else {
                                                        if (param1 == 353) {
                                                          var2 = -102;
                                                        } else {
                                                          if (param1 == 8250) {
                                                            var2 = -101;
                                                          } else {
                                                            if (param1 == 339) {
                                                              var2 = -100;
                                                            } else {
                                                              if (param1 != 382) {
                                                                var2 = (param1 == 376) ? -97 : 63;
                                                              } else {
                                                                var2 = -98;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      var2 = -104;
                                                    }
                                                  } else {
                                                    var2 = -105;
                                                  }
                                                } else {
                                                  var2 = -106;
                                                }
                                              } else {
                                                var2 = -107;
                                              }
                                            } else {
                                              var2 = -108;
                                            }
                                          } else {
                                            var2 = -109;
                                          }
                                        } else {
                                          var2 = -110;
                                        }
                                      }
                                    } else {
                                      var2 = -114;
                                    }
                                  }
                                } else {
                                  var2 = -117;
                                }
                              }
                            } else {
                              var2 = -119;
                            }
                          }
                        } else {
                          var2 = -121;
                        }
                      } else {
                        var2 = -122;
                      }
                    } else {
                      var2 = -123;
                    }
                  }
                } else {
                  var2 = -125;
                }
              } else {
                var2 = -126;
              }
            }
            if (param0 != -8250) {
              return (byte) 9;
            }
            return (byte) var2;
          }
          if (param1 <= 255) {
            var2 = (byte)param1;
          } else {
            if (param1 == 8364) {
              var2 = -128;
            } else {
              if (8218 != param1) {
                if (param1 != 402) {
                  if (param1 == 8222) {
                    var2 = -124;
                  } else {
                    if (param1 != 8230) {
                      if (8224 != param1) {
                        if (8225 != param1) {
                          if (param1 == 710) {
                            var2 = -120;
                          } else {
                            if (param1 != 8240) {
                              if (param1 == 352) {
                                var2 = -118;
                              } else {
                                if (param1 != 8249) {
                                  if (param1 == 338) {
                                    var2 = -116;
                                  } else {
                                    if (381 != param1) {
                                      if (param1 == 8216) {
                                        var2 = -111;
                                      } else {
                                        if (param1 != 8217) {
                                          if (param1 != 8220) {
                                            if (param1 != 8221) {
                                              if (8226 != param1) {
                                                if (8211 != param1) {
                                                  if (param1 != 8212) {
                                                    if (param1 != 732) {
                                                      if (param1 == 8482) {
                                                        var2 = -103;
                                                      } else {
                                                        if (param1 == 353) {
                                                          var2 = -102;
                                                        } else {
                                                          if (param1 == 8250) {
                                                            var2 = -101;
                                                          } else {
                                                            if (param1 == 339) {
                                                              var2 = -100;
                                                            } else {
                                                              if (param1 != 382) {
                                                                var2 = (param1 == 376) ? -97 : 63;
                                                              } else {
                                                                var2 = -98;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      var2 = -104;
                                                    }
                                                  } else {
                                                    var2 = -105;
                                                  }
                                                } else {
                                                  var2 = -106;
                                                }
                                              } else {
                                                var2 = -107;
                                              }
                                            } else {
                                              var2 = -108;
                                            }
                                          } else {
                                            var2 = -109;
                                          }
                                        } else {
                                          var2 = -110;
                                        }
                                      }
                                    } else {
                                      var2 = -114;
                                    }
                                  }
                                } else {
                                  var2 = -117;
                                }
                              }
                            } else {
                              var2 = -119;
                            }
                          }
                        } else {
                          var2 = -121;
                        }
                      } else {
                        var2 = -122;
                      }
                    } else {
                      var2 = -123;
                    }
                  }
                } else {
                  var2 = -125;
                }
              } else {
                var2 = -126;
              }
            }
          }
        } else {
          if (param1 < 128) {
            var2 = (byte)param1;
          } else {
            if (param1 < 160) {
              if (param1 == 8364) {
                var2 = -128;
              } else {
                if (8218 != param1) {
                  if (param1 != 402) {
                    if (param1 == 8222) {
                      var2 = -124;
                    } else {
                      if (param1 != 8230) {
                        if (8224 != param1) {
                          if (8225 != param1) {
                            if (param1 == 710) {
                              var2 = -120;
                            } else {
                              if (param1 != 8240) {
                                if (param1 == 352) {
                                  var2 = -118;
                                } else {
                                  if (param1 != 8249) {
                                    if (param1 == 338) {
                                      var2 = -116;
                                    } else {
                                      if (381 != param1) {
                                        if (param1 == 8216) {
                                          var2 = -111;
                                        } else {
                                          if (param1 != 8217) {
                                            if (param1 != 8220) {
                                              if (param1 != 8221) {
                                                if (8226 != param1) {
                                                  if (8211 != param1) {
                                                    if (param1 != 8212) {
                                                      if (param1 != 732) {
                                                        if (param1 == 8482) {
                                                          var2 = -103;
                                                        } else {
                                                          if (param1 == 353) {
                                                            var2 = -102;
                                                          } else {
                                                            if (param1 == 8250) {
                                                              var2 = -101;
                                                            } else {
                                                              if (param1 == 339) {
                                                                var2 = -100;
                                                              } else {
                                                                if (param1 != 382) {
                                                                  if (param1 == 376) {
                                                                    var2 = -97;
                                                                  } else {
                                                                    var2 = 63;
                                                                  }
                                                                } else {
                                                                  var2 = -98;
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        var2 = -104;
                                                      }
                                                    } else {
                                                      var2 = -105;
                                                    }
                                                  } else {
                                                    var2 = -106;
                                                  }
                                                } else {
                                                  var2 = -107;
                                                }
                                              } else {
                                                var2 = -108;
                                              }
                                            } else {
                                              var2 = -109;
                                            }
                                          } else {
                                            var2 = -110;
                                          }
                                        }
                                      } else {
                                        var2 = -114;
                                      }
                                    }
                                  } else {
                                    var2 = -117;
                                  }
                                }
                              } else {
                                var2 = -119;
                              }
                            }
                          } else {
                            var2 = -121;
                          }
                        } else {
                          var2 = -122;
                        }
                      } else {
                        var2 = -123;
                      }
                    }
                  } else {
                    var2 = -125;
                  }
                } else {
                  var2 = -126;
                }
              }
            } else {
              if (param1 <= 255) {
                var2 = (byte)param1;
              } else {
                if (param1 == 8364) {
                  var2 = -128;
                } else {
                  if (8218 != param1) {
                    if (param1 != 402) {
                      if (param1 == 8222) {
                        var2 = -124;
                      } else {
                        if (param1 != 8230) {
                          if (8224 != param1) {
                            if (8225 != param1) {
                              if (param1 == 710) {
                                var2 = -120;
                              } else {
                                if (param1 != 8240) {
                                  if (param1 == 352) {
                                    var2 = -118;
                                  } else {
                                    if (param1 != 8249) {
                                      if (param1 == 338) {
                                        var2 = -116;
                                      } else {
                                        if (381 != param1) {
                                          if (param1 == 8216) {
                                            var2 = -111;
                                          } else {
                                            if (param1 != 8217) {
                                              if (param1 != 8220) {
                                                if (param1 == 8221) {
                                                  var2 = -108;
                                                } else {
                                                  if (8226 == param1) {
                                                    var2 = -107;
                                                  } else {
                                                    if (8211 == param1) {
                                                      var2 = -106;
                                                    } else {
                                                      if (param1 == 8212) {
                                                        var2 = -105;
                                                      } else {
                                                        if (param1 == 732) {
                                                          var2 = -104;
                                                        } else {
                                                          if (param1 == 8482) {
                                                            var2 = -103;
                                                          } else {
                                                            if (param1 == 353) {
                                                              var2 = -102;
                                                            } else {
                                                              if (param1 == 8250) {
                                                                var2 = -101;
                                                              } else {
                                                                if (param1 == 339) {
                                                                  var2 = -100;
                                                                } else {
                                                                  if (param1 == 382) {
                                                                    var2 = -98;
                                                                  } else {
                                                                    if (param1 == 376) {
                                                                      var2 = -97;
                                                                    } else {
                                                                      var2 = 63;
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                var2 = -109;
                                              }
                                            } else {
                                              var2 = -110;
                                            }
                                          }
                                        } else {
                                          var2 = -114;
                                        }
                                      }
                                    } else {
                                      var2 = -117;
                                    }
                                  }
                                } else {
                                  var2 = -119;
                                }
                              }
                            } else {
                              var2 = -121;
                            }
                          } else {
                            var2 = -122;
                          }
                        } else {
                          var2 = -123;
                        }
                      }
                    } else {
                      var2 = -125;
                    }
                  } else {
                    var2 = -126;
                  }
                }
              }
            }
          }
        }
        if (param0 == -8250) {
          return (byte) var2;
        }
        return (byte) 9;
    }

    public static void k(byte param0) {
        int var1 = 13 / ((-32 - param0) / 57);
        field_L = null;
        pendingAchievementSubmissions = null;
        field_N = null;
    }

    final int getDay(byte obfuscationGuard) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (obfuscationGuard > -79) {
          this.monthFirst = true;
        }
        try {
          stackIn_3_0 = Integer.parseInt(this.dayField.text);
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    final int getMonthIndex(byte obfuscationGuard) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        try {
          if (obfuscationGuard != -117) {
            field_N = (String) null;
          }
          stackIn_3_0 = Integer.parseInt(this.monthField.text) - 1;
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    static {
        field_N = "Create a free account to start using this feature";
        pendingAchievementSubmissions = new NodeDeque();
    }
}
