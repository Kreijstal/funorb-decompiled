/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kw extends InteractiveWidget {
    static int[][] field_P;
    static String field_N;
    private ValidationSource field_O;
    static String field_Q;
    private int field_L;
    static int[] awtToClientKeyCodes;
    static int campaignPacketWord0;

    final boolean takeFocus(int obfuscationGuard, Widget rootWidget) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard == 11) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("kw.M(").append(obfuscationGuard).append(',');
          if (rootWidget == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final void updatePointer(int obfuscationGuard, int originX, int originY, Widget rootWidget) {
        try {
          this.field_L = this.field_L + 1;
          super.updatePointer(obfuscationGuard ^ 0, originX, originY, rootWidget);
          if (obfuscationGuard != 32722) {
            Widget var6 = (Widget) null;
            this.takeFocus(107, (Widget) null);
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "kw.P(" + obfuscationGuard + ',' + originX + ',' + originY + ',' + (rootWidget != null ? "{...}" : "null") + ')');
        }
    }

    final String getTooltipText(int obfuscationGuard) {
        if (obfuscationGuard != 21384) {
          kw.b(true);
          if (this.hovered) {
            return this.field_O.getValidationMessage((byte) 55);
          }
          return null;
        }
        if (this.hovered) {
          return this.field_O.getValidationMessage((byte) 55);
        }
        return null;
    }

    final void drawWidget(int originX, int originY, byte obfuscationGuard, int renderLayer) {
        int var5;
        int var6;
        ValidationState var8;
        int var9;
        int var10;
        int var11;
        RgbSprite var14;
        RgbSprite var15;
        RgbSprite var16;
        RgbSprite var17;
        RgbSprite var18;
        RgbSprite var19;
        RgbSprite var20;
        RgbSprite var21;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        ValidationState var8Lifetime1;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        super.drawWidget(originX, originY, (byte) -120, renderLayer);
        if (renderLayer != 0) {
          return;
        }
        var5 = this.x + (originX + (this.width >> 1));
        var6 = this.y + originY + (this.height >> 1);
        if (obfuscationGuard <= -82) {
          var8 = this.field_O.getValidationState(false);
          if (ad.validationWaiting != var8 &&
            so.validationChecking != var8) {
            if (var8 == rn.validationInvalid) {
              var19 = db.validationStatusIcons[2];
              var19.f(-(var19.pixelWidth >> 1) + var5, -(var19.pixelHeight >> 1) + var6, 256);
              return;
            }
            if (var8 != oo.validationValid) {
              return;
            }
            var20 = db.validationStatusIcons[1];
            var20.f(-(var20.pixelWidth >> 1) + var5, var6 - (var20.pixelHeight >> 1), 256);
            return;
          }
          var21 = db.validationStatusIcons[0];
          var9 = var21.canvasWidth << 1;
          var10 = var21.canvasHeight << 1;
          if (null == PreparedAction.field_p) {
            PreparedAction.field_p = new RgbSprite(var9, var10);
            CombatSandbox.a(PreparedAction.field_p, 3);
          } else {
            if (var9 > PreparedAction.field_p.pixelWidth) {
              PreparedAction.field_p = new RgbSprite(var9, var10);
              CombatSandbox.a(PreparedAction.field_p, 3);
            } else {
              if (var10 <= PreparedAction.field_p.pixelHeight) {
                CombatSandbox.a(PreparedAction.field_p, 3);
                SoftwareRaster.b();
              } else {
                PreparedAction.field_p = new RgbSprite(var9, var10);
                CombatSandbox.a(PreparedAction.field_p, 3);
              }
            }
          }
          var21.b(112, 144, var21.canvasWidth << 4, var21.canvasHeight << 4, -this.field_L << 10, 4096);
          QuickChatPhraseRepository.popRasterState(-18862);
          PreparedAction.field_p.f(-var21.canvasWidth + var5, -var21.canvasHeight + var6, 256);
          return;
        }
        this.drawWidget(105, -107, (byte) -98, -86);
        var8Lifetime1 = this.field_O.getValidationState(false);
        if (ad.validationWaiting == var8Lifetime1) {
          var15 = db.validationStatusIcons[0];
          var9Lifetime1 = var15.canvasWidth << 1;
          var10Lifetime1 = var15.canvasHeight << 1;
          if (null != PreparedAction.field_p &&
            var9Lifetime1 <= PreparedAction.field_p.pixelWidth &&
            var10Lifetime1 <= PreparedAction.field_p.pixelHeight) {
            CombatSandbox.a(PreparedAction.field_p, 3);
            SoftwareRaster.b();
          } else {
            PreparedAction.field_p = new RgbSprite(var9Lifetime1, var10Lifetime1);
            CombatSandbox.a(PreparedAction.field_p, 3);
          }
          var15.b(112, 144, var15.canvasWidth << 4, var15.canvasHeight << 4, -this.field_L << 10, 4096);
          QuickChatPhraseRepository.popRasterState(-18862);
          PreparedAction.field_p.f(-var15.canvasWidth + var5, -var15.canvasHeight + var6, 256);
          return;
        }
        if (so.validationChecking != var8Lifetime1) {
          if (var8Lifetime1 == rn.validationInvalid) {
            var17 = db.validationStatusIcons[2];
            var17.f(-(var17.pixelWidth >> 1) + var5, -(var17.pixelHeight >> 1) + var6, 256);
            return;
          }
          if (var8Lifetime1 != oo.validationValid) {
            return;
          }
          var18 = db.validationStatusIcons[1];
          var18.f(-(var18.pixelWidth >> 1) + var5, var6 - (var18.pixelHeight >> 1), 256);
          return;
        }
        var16 = db.validationStatusIcons[0];
        var14 = var16;
        var9Lifetime2 = var16.canvasWidth << 1;
        var10Lifetime2 = var16.canvasHeight << 1;
        if (null == PreparedAction.field_p) {
          PreparedAction.field_p = new RgbSprite(var9Lifetime2, var10Lifetime2);
          CombatSandbox.a(PreparedAction.field_p, 3);
        } else {
          if (var9Lifetime2 > PreparedAction.field_p.pixelWidth) {
            PreparedAction.field_p = new RgbSprite(var9Lifetime2, var10Lifetime2);
            CombatSandbox.a(PreparedAction.field_p, 3);
          } else {
            if (var10Lifetime2 <= PreparedAction.field_p.pixelHeight) {
              CombatSandbox.a(PreparedAction.field_p, 3);
              SoftwareRaster.b();
            } else {
              PreparedAction.field_p = new RgbSprite(var9Lifetime2, var10Lifetime2);
              CombatSandbox.a(PreparedAction.field_p, 3);
            }
          }
        }
        var16.b(112, 144, var16.canvasWidth << 4, var16.canvasHeight << 4, -this.field_L << 10, 4096);
        QuickChatPhraseRepository.popRasterState(-18862);
        PreparedAction.field_p.f(-var16.canvasWidth + var5, -var16.canvasHeight + var6, 256);
    }

    kw(ValidationSource param0) {
        try {
          this.field_O = param0;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "kw.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static byte a(char param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        var3 = -112 % ((param1 + 33) / 51);
        if (param0 <= 0) {
          if (160 <= param0 &&
            param0 <= 255) {
            var2 = (byte)param0;
          } else {
            if (8364 != param0) {
              if (param0 == 8218) {
                var2 = -126;
                return (byte) var2;
              }
              if (param0 == 402) {
                var2 = -125;
                return (byte) var2;
              }
              if (8222 == param0) {
                var2 = -124;
                return (byte) var2;
              }
              if (param0 == 8230) {
                var2 = -123;
                return (byte) var2;
              }
              if (param0 != 8224) {
                if (param0 == 8225) {
                  var2 = -121;
                  return (byte) var2;
                }
                if (param0 == 710) {
                  var2 = -120;
                  return (byte) var2;
                }
                if (param0 != 8240) {
                  if (param0 != 352) {
                    if (param0 != 8249) {
                      if (338 == param0) {
                        var2 = -116;
                        return (byte) var2;
                      }
                      if (param0 == 381) {
                        var2 = -114;
                      } else {
                        if (param0 == 8216) {
                          var2 = -111;
                        } else {
                          if (8217 != param0) {
                            if (param0 == 8220) {
                              var2 = -109;
                            } else {
                              if (8221 == param0) {
                                var2 = -108;
                              } else {
                                if (param0 != 8226) {
                                  if (param0 != 8211) {
                                    if (param0 != 8212) {
                                      if (param0 != 732) {
                                        if (param0 == 8482) {
                                          var2 = -103;
                                        } else {
                                          if (353 != param0) {
                                            if (param0 == 8250) {
                                              var2 = -101;
                                            } else {
                                              if (339 != param0) {
                                                if (param0 == 382) {
                                                  var2 = -98;
                                                } else {
                                                  var2 = (376 == param0) ? -97 : 63;
                                                }
                                              } else {
                                                var2 = -100;
                                              }
                                            }
                                          } else {
                                            var2 = -102;
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
                              }
                            }
                          } else {
                            var2 = -110;
                          }
                        }
                      }
                    } else {
                      var2 = -117;
                    }
                  } else {
                    var2 = -118;
                  }
                } else {
                  var2 = -119;
                }
              } else {
                var2 = -122;
              }
            } else {
              var2 = -128;
            }
          }
          return (byte) var2;
        }
        if (param0 < 128) {
          var2Lifetime1 = (byte)param0;
          return (byte) var2Lifetime1;
        }
        if (160 <= param0 &&
          param0 <= 255) {
          var2Lifetime2 = (byte)param0;
          return (byte) var2Lifetime2;
        }
        if (8364 != param0) {
          if (param0 == 8218) {
            var2Lifetime3 = -126;
          } else {
            if (param0 == 402) {
              var2Lifetime3 = -125;
            } else {
              if (8222 == param0) {
                var2Lifetime3 = -124;
              } else {
                if (param0 == 8230) {
                  var2Lifetime3 = -123;
                } else {
                  if (param0 != 8224) {
                    if (param0 == 8225) {
                      var2Lifetime3 = -121;
                    } else {
                      if (param0 == 710) {
                        var2Lifetime3 = -120;
                      } else {
                        if (param0 != 8240) {
                          if (param0 != 352) {
                            if (param0 != 8249) {
                              if (338 == param0) {
                                var2Lifetime3 = -116;
                              } else {
                                if (param0 == 381) {
                                  var2Lifetime3 = -114;
                                } else {
                                  if (param0 == 8216) {
                                    var2Lifetime3 = -111;
                                  } else {
                                    if (8217 != param0) {
                                      if (param0 == 8220) {
                                        var2Lifetime3 = -109;
                                      } else {
                                        if (8221 == param0) {
                                          var2Lifetime3 = -108;
                                        } else {
                                          if (param0 != 8226) {
                                            if (param0 != 8211) {
                                              if (param0 != 8212) {
                                                if (param0 != 732) {
                                                  if (param0 == 8482) {
                                                    var2Lifetime3 = -103;
                                                  } else {
                                                    if (353 != param0) {
                                                      if (param0 == 8250) {
                                                        var2Lifetime3 = -101;
                                                      } else {
                                                        if (339 != param0) {
                                                          if (param0 == 382) {
                                                            var2Lifetime3 = -98;
                                                          } else {
                                                            var2Lifetime3 = (376 == param0) ? -97 : 63;
                                                          }
                                                        } else {
                                                          var2Lifetime3 = -100;
                                                        }
                                                      }
                                                    } else {
                                                      var2Lifetime3 = -102;
                                                    }
                                                  }
                                                } else {
                                                  var2Lifetime3 = -104;
                                                }
                                              } else {
                                                var2Lifetime3 = -105;
                                              }
                                            } else {
                                              var2Lifetime3 = -106;
                                            }
                                          } else {
                                            var2Lifetime3 = -107;
                                          }
                                        }
                                      }
                                    } else {
                                      var2Lifetime3 = -110;
                                    }
                                  }
                                }
                              }
                            } else {
                              var2Lifetime3 = -117;
                            }
                          } else {
                            var2Lifetime3 = -118;
                          }
                        } else {
                          var2Lifetime3 = -119;
                        }
                      }
                    }
                  } else {
                    var2Lifetime3 = -122;
                  }
                }
              }
            }
          }
        } else {
          var2Lifetime3 = -128;
        }
        return (byte) var2Lifetime3;
    }

    public static void b(boolean param0) {
        field_N = null;
        awtToClientKeyCodes = null;
        field_P = (int[][]) null;
        if (param0) {
          field_Q = null;
          return;
        }
        kw.a('￣', -69);
        field_Q = null;
    }

    static {
        field_P = new int[][]{new int[]{1000, 1300, 700, 1150, 850}, new int[]{1200, 800, 1000}, new int[]{1000}};
        awtToClientKeyCodes = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_Q = "Concluded";
        field_N = "InstructionS";
    }
}
