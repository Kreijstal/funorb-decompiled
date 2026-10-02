/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameScreen extends MenuScreen {
    private boolean field_S;
    private int field_X;
    private boolean field_H;
    private int field_Z;
    private int field_M;
    private int field_V;
    private int field_w;
    private int field_n;
    private Geoblox gameApplet;
    private int screenId;
    int activeTicks;
    private int field_o;
    private int field_B;
    private int field_t;
    private int field_L;
    private int[] field_P;
    private int field_T;
    private boolean field_C;
    static String[] quickChatShortcutHelpTexts;
    private int field_N;
    private int field_s;
    private int field_Y;
    static int selectedThemeId;
    private double field_A;
    private boolean field_E;
    private int animationTick;
    private int field_u;
    private int field_I;
    private PcmSampleStream volumePreviewStream;
    private int volumePreviewTicks;
    static String createNameLeadingSpaceAlertText;
    private int field_W;
    int field_q;
    private boolean field_v;
    static java.applet.Applet field_x;
    private int field_F;
    private int field_O;
    private int field_z;

    final void handleMenuKey(int itemIndex, int param1) {
        RuntimeException decompiledCaughtException = null;
        int actionId = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        var4 = Geoblox.field_C;
        try {
          L1: {
            L2: {
              L3: {
                actionId = t.menuActionIds[this.screenId][itemIndex];
                if (actionId == 8) {
                  if (var4 == 0) {
                    L5: {
                      if (102 != ki.field_d) {
                        if (ki.field_d != 103) {
                          super.handleMenuKey(itemIndex, -53);
                          if (var4 == 0) {
                            break L5;
                          }
                        }
                        j.field_gb = 80;
                        if (var4 == 0) {
                          break L5;
                        }
                      }
                      j.field_gb = 0;
                    }
                    this.previewMusicVolume(0);
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L3;
                    }
                  }
                }
                if (actionId != 9) {
                  break L2;
                }
              }
              if (102 != ki.field_d) {
                if (103 != ki.field_d) {
                  super.handleMenuKey(itemIndex, -70);
                  if (var4 == 0) {
                    break L1;
                  }
                }
                wg.a(-15346, 80);
                if (var4 == 0) {
                  break L1;
                }
              }
              wg.a(-15346, 0);
              if (var4 == 0) {
                break L1;
              }
            }
            if (ki.field_d == 13) {
              if (!this.field_C) {
                L11: {
                  if (this.screenId == 1) {
                    ai.requestedScreenId = -1;
                    if (var4 == 0) {
                      break L11;
                    }
                  }
                  ai.requestedScreenId = oc.previousMenuScreenId;
                }
                if (~ai.requestedScreenId == ~this.screenId) {
                  break L1;
                } else {
                  if (this.screenId != 1) {
                    if (this.screenId != 0) {
                      break L1;
                    }
                  }
                  oc.previousMenuScreenId = this.screenId;
                  if (var4 == 0) {
                    break L1;
                  }
                }
              }
            }
            if (this.field_C) {
              if (ki.field_d != 84) {
                if (83 != ki.field_d) {
                  break L1;
                }
              }
              if (!fh.c(-103)) {
                L17: {
                  if (og.field_n <= 0) {
                    if (this.field_o == 0) {
                      break L17;
                    } else {
                      if (qa.field_a > 190) {
                        if (qa.field_a < 449) {
                          if (265 < ue.field_e) {
                            if (ue.field_e < 299) {
                              break L17;
                            }
                          }
                        }
                      }
                    }
                  }
                  if (vl.field_n == null) {
                    if (0 != this.field_o) {
                      if (qa.field_a <= 260) {
                        break L1;
                      } else {
                        if (qa.field_a >= 380) {
                          break L1;
                        } else {
                          if (ue.field_e <= 274) {
                            break L1;
                          } else {
                            if (ue.field_e >= 309) {
                              break L1;
                            }
                          }
                        }
                      }
                    }
                    this.pointerInteractionActive = true;
                    this.field_C = false;
                    if (var4 == 0) {
                      break L1;
                    }
                  }
                  L21: {
                    if (1 != this.field_o) {
                      if (this.field_o >= 0) {
                        break L21;
                      } else {
                        if (qa.field_a <= 350) {
                          break L21;
                        } else {
                          if (qa.field_a >= 470) {
                            break L21;
                          } else {
                            if (ue.field_e <= 327) {
                              break L21;
                            } else {
                              if (ue.field_e >= 362) {
                                break L21;
                              }
                            }
                          }
                        }
                      }
                    }
                    this.field_C = false;
                    em.b(255);
                    this.pointerInteractionActive = true;
                    if (var4 == 0) {
                      break L1;
                    }
                  }
                  if (this.field_o != 0) {
                    if (this.field_o >= 0) {
                      break L1;
                    } else {
                      if (qa.field_a <= 170) {
                        break L1;
                      } else {
                        if (qa.field_a >= 290) {
                          break L1;
                        } else {
                          if (ue.field_e <= 327) {
                            break L1;
                          } else {
                            if (ue.field_e >= 362) {
                              break L1;
                            }
                          }
                        }
                      }
                    }
                  }
                  this.pointerInteractionActive = true;
                  this.field_C = false;
                  if (var4 == 0) {
                    break L1;
                  }
                }
                this.pointerInteractionActive = true;
                this.field_C = false;
                if (var4 == 0) {
                  break L1;
                }
              }
              L24: {
                if (this.field_o != 1) {
                  if (this.field_o >= 0) {
                    break L24;
                  } else {
                    if (qa.field_a <= 350) {
                      break L24;
                    } else {
                      if (470 <= qa.field_a) {
                        break L24;
                      } else {
                        if (ue.field_e <= 265) {
                          break L24;
                        } else {
                          if (ue.field_e >= 299) {
                            break L24;
                          }
                        }
                      }
                    }
                  }
                }
                this.pointerInteractionActive = true;
                this.field_C = false;
                if (var4 == 0) {
                  break L1;
                }
              }
              if (this.field_o != 0) {
                if (this.field_o >= 0) {
                  break L1;
                } else {
                  if (qa.field_a <= 170) {
                    break L1;
                  } else {
                    if (qa.field_a >= 290) {
                      break L1;
                    } else {
                      if (ue.field_e <= 265) {
                        break L1;
                      } else {
                        if (ue.field_e >= 299) {
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
              this.pointerInteractionActive = true;
              if (null != el.gameplaySession) {
                el.gameplaySession.submitScore((byte) -70);
              }
              el.gameplayReturnScreenId = 0;
              ai.requestedScreenId = -1;
              cd.gameplayOriginScreenId = 0;
              if (var4 == 0) {
                break L1;
              }
            }
            super.handleMenuKey(itemIndex, -100);
          }
          if (param1 > -26) {
            this.updateTransition(59);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var3), "c.M(" + itemIndex + ',' + param1 + ')');
        }
    }

    private final void b(boolean param0) {
        int stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        var4 = Geoblox.field_C;
        try {
          L0: {
            if (param0) {
              this.field_F = 124;
            }
            this.field_W = this.field_W % ee.field_A.field_s;
            this.field_O = this.field_O % ee.field_A.field_o;
            var2_int = -ee.field_A.field_s + this.field_W;
            L2: while (true) {
              L3: {
                L4: {
                  if (640 > var2_int) {
                    stackIn_16_0 = ee.field_A.field_o + this.field_O + 480;

                    if (var4 != 0) {
                      break L3;
                    } else {
                      var3 = stackIn_16_0;
                      L5: while (true) {
                        L6: {
                          if (~-ee.field_A.field_o >= ~var3) {
                            ee.field_A.c(var2_int, var3);
                            var3 = var3 - ee.field_A.field_o;
                            if (var4 != 0) {
                              break L6;
                            } else {
                              if (var4 == 0) {
                                continue L5;
                              }
                            }
                          }
                          var2_int = var2_int + ee.field_A.field_s;
                        }
                        if (var4 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                this.field_I = this.field_I % vc.field_j.field_o;
                this.field_u = this.field_u % vc.field_j.field_s;
                stackIn_16_0 = this.field_u + (vc.field_j.field_s + 640);
              }
              var2_int = stackIn_16_0;
              L8: while (true) {
                L9: {
                  L10: {
                    if (~-vc.field_j.field_s >= ~var2_int) {
                      if (var4 != 0) {
                        break L9;
                      } else {
                        var3 = this.field_I - -vc.field_j.field_o + 480;
                        L11: while (true) {
                          L12: {
                            if (~var3 <= ~-vc.field_j.field_o) {
                              vc.field_j.b(var2_int, var3);
                              var3 = var3 - vc.field_j.field_o;
                              if (var4 != 0) {
                                break L12;
                              } else {
                                if (var4 == 0) {
                                  continue L11;
                                }
                              }
                            }
                            var2_int = var2_int - vc.field_j.field_s;
                          }
                          if (var4 == 0) {
                            continue L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "c.I(" + param0 + ')');
        }
    }

    private final void g(byte param0) {
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Geoblox.field_C;
        try {
          L1: {
            if (!this.field_H) {
              if (this.field_T < 0) {
                this.field_T = this.field_T + 1;
                if (var3 == 0) {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            if (-4 >= this.field_T) {
              this.field_H = false;
              if (var3 == 0) {
                break L1;
              }
            }
            this.field_T = this.field_T - 1;
          }
          if (param0 >= -11) {
            this.gameApplet = (Geoblox) null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "c.Q(" + param0 + ')');
        }
    }

    final void renderScreen(int param0) {
        int stackIn_73_0 = 0;
        int stackIn_122_0 = 0;
        int stackIn_144_0 = 0;
        int stackIn_191_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var8_ref_String = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        var12 = Geoblox.field_C;
        try {
          if (param0 == -28750) {
            this.b(false);
            var2_int = 270;
            var3 = 140;
            var4 = 400;
            if (this.screenId != 0) {
              if (this.screenId != 1) {
                if (this.screenId != 4) {
                  L2: {
                    if (2 == this.screenId) {
                      var2_int = 235;
                      if (var12 == 0) {
                        break L2;
                      }
                    }
                    var2_int = 285;
                  }
                  L4: {
                    var5 = 120;
                    if (this.screenId == 3) {
                      var5 += 10;
                      if (var12 == 0) {
                        break L4;
                      }
                    }
                    if (this.screenId != 8) {
                      if (this.screenId != 7) {
                        break L4;
                      }
                    }
                    var4 += 20;
                    var5 -= 10;
                  }
                  ma.a(var3, var5, var2_int, (byte) -92, var4, ll.field_h);
                }
              }
            }
            if (!this.field_E) {
              super.renderScreen(param0 + 0);
            }
            L8: {
              if (this.screenId != 2) {
                if (this.screenId != 8) {
                  L10: {
                    if (5 != this.screenId) {
                      if (7 != this.screenId) {
                        break L10;
                      }
                    }
                    kh.field_h[4].b(0, 20);
                    ac.a(false, false, (byte) -93);
                    if (var12 == 0) {
                      break L8;
                    }
                  }
                  if (this.screenId != 6) {
                    if (this.screenId == 4) {
                      kh.field_h[8].b(0, 20);
                      ma.a(var3 + 10, 120, 100, (byte) -92, var4, ll.field_h);
                      var5 = 184;
                      dd.field_G.b(Geoblox.loginMessage, 320, var5, 0, -1);
                      var5 = 185;
                      fi.field_d.a(r.field_sb, 130, var5, 380, 300, 0, -1, 1, 0, 14);
                      ma.a(320, 120, 60, (byte) -92, var4, ll.field_h);
                      fi.field_d.a(bd.field_b, 130, 330, 380, 300, 0, -1, 1, 0, 14);
                      if (var12 == 0) {
                        break L8;
                      }
                    }
                    if (this.screenId != 3) {
                      kh.field_h[0].b(0, 20);
                      if (this.screenId != 0) {
                        if (this.screenId != 1) {
                          break L8;
                        }
                      }
                      if (this.field_C) {
                        if (fh.c(-93)) {
                          if (this.activeTicks <= 200) {
                            stackIn_73_0 = this.activeTicks;
                          } else {
                            stackIn_73_0 = 200;
                          }
                          L18: {
                            var5 = stackIn_73_0;
                            SoftwareRasterizer.b(0, 0, 640, 480, 0, var5);
                            ma.a(160, 150, 80, (byte) -92, 340, ll.field_h);
                            var6 = 170;
                            fi.field_d.a(ki.fullscreenNonmemberText, 160, var6, 320, 300, 0, -1, 1, 0, 16);
                            var7 = 100;
                            var8 = -(20 + var7 >> 374422529) + 410;
                            var6 = 265;
                            var9 = var8 - (-(var7 >> -1761100895) - 10);
                            ma.a(var6, var8, 36, (byte) -92, 20 + var7, eb.field_g);
                            if (1 != this.field_o) {
                              if (this.field_o >= 0) {
                                break L18;
                              } else {
                                if (350 >= qa.field_a) {
                                  break L18;
                                } else {
                                  if (qa.field_a >= 470) {
                                    break L18;
                                  } else {
                                    if (ue.field_e <= 265) {
                                      break L18;
                                    } else {
                                      if (ue.field_e >= 299) {
                                        break L18;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            dd.field_G.field_K[0][wf.field_p] = 15488514;
                          }
                          L20: {
                            dd.field_G.b(hh.fullscreenCloseButtonText, var9, 30 + var6, 0, -1);
                            var8 = 320 - (20 + var7 >> -708984479) - 90;
                            dd.field_G.field_K[0][wf.field_p] = 16689938;
                            var6 = 265;
                            var9 = 10 + (var7 >> -733174591) + var8;
                            ma.a(var6, var8, 36, (byte) -92, var7 + 20, eb.field_g);
                            if (this.field_o != 0) {
                              if (0 <= this.field_o) {
                                break L20;
                              } else {
                                if (170 >= qa.field_a) {
                                  break L20;
                                } else {
                                  if (qa.field_a >= 290) {
                                    break L20;
                                  } else {
                                    if (ue.field_e <= 265) {
                                      break L20;
                                    } else {
                                      if (ue.field_e >= 299) {
                                        break L20;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            dd.field_G.field_K[0][wf.field_p] = 15488514;
                          }
                          dd.field_G.b(qb.fullscreenMembersButtonText, var9, 30 + var6, 0, -1);
                          dd.field_G.field_K[0][wf.field_p] = 16689938;
                          if (var12 == 0) {
                            break L8;
                          }
                        }
                        if (og.field_n > 0) {
                          if (vl.field_n == null) {
                            if (this.activeTicks > 200) {
                              stackIn_122_0 = 200;
                            } else {
                              stackIn_122_0 = this.activeTicks;
                            }
                            L25: {
                              var5 = stackIn_122_0;
                              SoftwareRasterizer.b(0, 0, 640, 480, 0, var5);
                              ma.a(160, 160, 95, (byte) -92, 320, ll.field_h);
                              var6 = 170;
                              var6 = var6 + 16 * fi.field_d.a(sj.fullscreenUnavailableText, 170, var6, 300, 300, 0, -1, 1, 0, 16);
                              var6 += 40;
                              var7 = 100;
                              var8 = 320 + -(var7 + 20 >> 1183785761);
                              var9 = (var7 >> 360391297) + (var8 + 10);
                              ma.a(var6, var8, 36, (byte) -92, 20 + var7, eb.field_g);
                              if (0 != this.field_o) {
                                if (260 >= qa.field_a) {
                                  break L25;
                                } else {
                                  if (qa.field_a >= 380) {
                                    break L25;
                                  } else {
                                    if (ue.field_e <= 274) {
                                      break L25;
                                    } else {
                                      if (ue.field_e >= 309) {
                                        break L25;
                                      }
                                    }
                                  }
                                }
                              }
                              dd.field_G.field_K[0][wf.field_p] = 15488514;
                            }
                            dd.field_G.b(hh.fullscreenCloseButtonText, var9, 30 + var6, 0, -1);
                            dd.field_G.field_K[0][wf.field_p] = 16689938;
                            if (var12 == 0) {
                              break L8;
                            }
                          }
                          if (this.activeTicks <= 200) {
                            stackIn_144_0 = this.activeTicks;
                          } else {
                            stackIn_144_0 = 200;
                          }
                          L28: {
                            var5 = stackIn_144_0;
                            SoftwareRasterizer.b(0, 0, 640, 480, 0, var5);
                            ma.a(160, 160, 140, (byte) -92, 320, ll.field_h);
                            var6 = 170;
                            var7_ref_String = ue.fullscreenBeforeAcceptText + " " + pb.fullscreenAcceptButtonText + " " + wj.fullscreenAfterAcceptText + " " + rb.fullscreenCancelButtonText + " " + uj.fullscreenAfterCancelText;
                            var6 = var6 + 16 * fi.field_d.a(var7_ref_String, 170, var6, 300, 300, 0, -1, 1, 0, 16);
                            var6 += 10;
                            var8_ref_String = Integer.toString((1500 - this.activeTicks) / 150 - -1);
                            if ((1500 - this.activeTicks) / 150 <= 0) {
                              var6 = var6 + fi.field_d.a(wj.a(mj.fullscreenAcceptCountdownSingularText, new String[]{var8_ref_String}, (byte) -51), 170, var6, 300, 300, 0, -1, 1, 0, 16) * 16;
                              if (var12 == 0) {
                                break L28;
                              }
                            }
                            var6 = var6 + fi.field_d.a(wj.a(jk.fullscreenAcceptCountdownPluralText, new String[]{var8_ref_String}, (byte) -45), 170, var6, 300, 300, 0, -1, 1, 0, 16) * 16;
                          }
                          L30: {
                            var6 += 40;
                            var9 = 100;
                            var10 = -(20 + var9 >> -968821055) + 320 - -90;
                            ma.a(var6, var10, 36, (byte) -92, var9 - -20, eb.field_g);
                            var11 = 10 + ((var9 >> 1030901409) + var10);
                            if (this.field_o != 1) {
                              if (0 <= this.field_o) {
                                break L30;
                              } else {
                                if (qa.field_a <= 350) {
                                  break L30;
                                } else {
                                  if (qa.field_a >= 470) {
                                    break L30;
                                  } else {
                                    if (ue.field_e <= 317) {
                                      break L30;
                                    } else {
                                      if (ue.field_e >= 352) {
                                        break L30;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            dd.field_G.field_K[0][wf.field_p] = 15488514;
                          }
                          L32: {
                            dd.field_G.b(rb.fullscreenCancelButtonText, var11, 30 + var6, 0, -1);
                            dd.field_G.field_K[0][wf.field_p] = 16689938;
                            var10 = 320 + -(20 + var9 >> -1873231487) - 90;
                            var11 = 10 + (var9 >> 687806689) + var10;
                            ma.a(var6, var10, 36, (byte) -92, 20 + var9, eb.field_g);
                            if (this.field_o != 0) {
                              if (this.field_o >= 0) {
                                break L32;
                              } else {
                                if (qa.field_a <= 170) {
                                  break L32;
                                } else {
                                  if (qa.field_a >= 290) {
                                    break L32;
                                  } else {
                                    if (ue.field_e <= 317) {
                                      break L32;
                                    } else {
                                      if (ue.field_e >= 352) {
                                        break L32;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            dd.field_G.field_K[0][wf.field_p] = 15488514;
                          }
                          dd.field_G.b(pb.fullscreenAcceptButtonText, var11, 30 + var6, 0, -1);
                          dd.field_G.field_K[0][wf.field_p] = 16689938;
                          if (var12 == 0) {
                            break L8;
                          }
                        }
                        if (this.activeTicks > 200) {
                          stackIn_191_0 = 200;
                        } else {
                          stackIn_191_0 = this.activeTicks;
                        }
                        L35: {
                          var5 = stackIn_191_0;
                          SoftwareRasterizer.b(0, 0, 640, 480, 0, var5);
                          ma.a(170, 160, 80, (byte) -92, 320, ll.field_h);
                          var6 = 180;
                          fi.field_d.a(ki.fullscreenNonmemberText, 170, var6, 300, 300, 0, -1, 1, 0, 16);
                          var7 = 242;
                          var8 = 320 - (var7 + 20 >> -1731032895);
                          var9 = 10 + (var8 + (var7 >> -1298819903));
                          var6 = 265;
                          ma.a(var6, var8, 36, (byte) -92, var7 + 20, eb.field_g);
                          if (this.field_o != 0) {
                            if (qa.field_a <= 190) {
                              break L35;
                            } else {
                              if (qa.field_a >= 449) {
                                break L35;
                              } else {
                                if (ue.field_e <= 265) {
                                  break L35;
                                } else {
                                  if (299 <= ue.field_e) {
                                    break L35;
                                  }
                                }
                              }
                            }
                          }
                          dd.field_G.field_K[0][wf.field_p] = 15488514;
                        }
                        dd.field_G.b(hh.fullscreenCloseButtonText, var9, 30 + var6, 0, -1);
                        dd.field_G.field_K[0][wf.field_p] = 16689938;
                        if (var12 == 0) {
                          break L8;
                        }
                      } else {
                        break L8;
                      }
                    }
                    kh.field_h[5].b(0, 20);
                    if (!this.field_E) {
                      this.b(-97, this.field_q);
                      if (var12 == 0) {
                        break L8;
                      }
                    }
                    L38: {
                      var5 = this.field_F;
                      if (!this.field_v) {
                        var5 = 640 + -var5;
                        SoftwareRasterizer.e(0, 0, var5, 480);
                        this.b(-85, this.field_n);
                        this.field_S = true;
                        super.renderScreen(-28750);
                        this.field_S = false;
                        SoftwareRasterizer.e(var5, 0, 640, 480);
                        this.b(param0 ^ 28757, this.field_q);
                        super.renderScreen(-28750);
                        SoftwareRasterizer.e(0, 0, 640, 480);
                        qj.transitionCurtain.b((qj.transitionCurtain.field_o >> -182880703) + var5, 240, -49150, 4096);
                        if (var12 == 0) {
                          break L38;
                        }
                      }
                      SoftwareRasterizer.e(var5, 0, 640, 480);
                      this.b(-17, this.field_n);
                      this.field_S = true;
                      super.renderScreen(-28750);
                      this.field_S = false;
                      SoftwareRasterizer.e(0, 0, var5, 480);
                      this.b(-48, this.field_q);
                      super.renderScreen(-28750);
                      SoftwareRasterizer.e(0, 0, 640, 480);
                      qj.transitionCurtain.b(-(qj.transitionCurtain.field_o >> 1729526785) + var5, 240, -16383, 4096);
                    }
                    if (var12 == 0) {
                      break L8;
                    }
                  }
                  kh.field_h[7].b(0, 20);
                  ac.a(false, true, (byte) -122);
                  if (var12 == 0) {
                    break L8;
                  }
                }
              }
              this.b(30);
            }
            decompiledRegionSelector0 = 1;
          } else {
            decompiledRegionSelector0 = 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "c.T(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void decreaseMenuValue(int itemIndex, byte param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int actionId = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Geoblox.field_C;
        try {
          L1: {
            L2: {
              var3_int = 121 % ((44 - param1) / 36);
              actionId = t.menuActionIds[this.screenId][itemIndex];
              if (actionId == 8) {
                if (var5 == 0) {
                  if (j.field_gb > 10) {
                    j.field_gb = j.field_gb - 10;
                    if (var5 == 0) {
                      break L1;
                    }
                  }
                  j.field_gb = 0;
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (9 != actionId) {
                break L1;
              }
            }
            if (oc.field_c > 10) {
              wg.a(-15346, oc.field_c - 10);
              if (var5 == 0) {
                break L1;
              }
            }
            wg.a(-15346, 0);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw t.a((Throwable) ((Object) runtimeException), "c.N(" + itemIndex + ',' + param1 + ')');
        }
    }

    public static void d(byte param0) {
        try {
            quickChatShortcutHelpTexts = null;
            field_x = null;
            createNameLeadingSpaceAlertText = null;
            if (param0 != 28) {
                GameScreen.c(79, (byte) -113);
            }
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "c.S(" + param0 + ')');
        }
    }

    private final void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Geoblox.field_C;
        try {
          if (param0 >= -40) {
            this.b(77, -13);
          }
          L2: {
            if (3 == this.screenId) {
              if (!this.field_E) {
                L3: {
                  if (this.field_q != 4) {
                    if (this.selectedItemIndex == 3) {
                      break L3;
                    }
                  }
                  if (4 == this.field_q) {
                    if (this.selectedItemIndex == 2) {
                      this.selectedItemIndex = 3;
                    }
                    if (oc.previousMenuScreenId != 1) {
                      break L2;
                    } else {
                      if (this.selectedItemIndex == 3) {
                        this.selectedItemIndex = 0;
                        if (var3 == 0) {
                          break L2;
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                  if (this.field_q != 0) {
                    break L2;
                  } else {
                    if (this.selectedItemIndex == 0) {
                      this.selectedItemIndex = 1;
                      if (var3 == 0) {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                this.selectedItemIndex = 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "c.C(" + param0 + ')');
        }
    }

    final int hitTestMenuItem(int pointerX, int pointerY, byte param2) {
        int stackIn_2_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_99_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_125_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_133_0 = 0;
        int stackIn_145_0 = 0;
        int stackIn_162_0 = 0;
        int stackIn_168_0 = 0;
        int stackIn_179_0 = 0;
        int stackIn_193_0 = 0;
        int stackIn_195_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            if (param2 >= 20) {
              if (0 != this.screenId) {
                if (this.screenId != 1) {
                  L2: {
                    if (this.screenId == 3) {
                      if (pointerY > 430) {
                        if (pointerY < 470) {
                          if (this.field_q != 0) {
                            if (pointerX > 130) {
                              if (pointerX < 253) {
                                stackIn_162_0 = 0;
                                decompiledRegionSelector0 = 14;
                                break L0;
                              }
                            }
                          }
                          if (pointerX > 268) {
                            if (391 > pointerX) {
                              stackIn_168_0 = 1;
                              decompiledRegionSelector0 = 15;
                              break L0;
                            }
                          }
                          if (this.field_q != 4) {
                            if (pointerX > 406) {
                              if (pointerX < 529) {
                                stackIn_179_0 = 2;
                                decompiledRegionSelector0 = 16;
                                break L0;
                              }
                            }
                          }
                          if (this.field_q == 4) {
                            if (oc.previousMenuScreenId != 1) {
                              if (pointerX > 406) {
                                if (pointerX < 635) {
                                  stackIn_193_0 = 3;
                                  decompiledRegionSelector0 = 17;
                                  break L0;
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      if (this.screenId != 5) {
                        if (this.screenId != 7) {
                          if (this.screenId != 8) {
                            if (2 == this.screenId) {
                              if (pointerY > 380) {
                                if (pointerY < 420) {
                                  if (pointerX > 61) {
                                    if (220 > pointerX) {
                                      stackIn_133_0 = 0;
                                      decompiledRegionSelector0 = 12;
                                      break L0;
                                    }
                                  }
                                  if (241 < pointerX) {
                                    if (pointerX < 400) {
                                      stackIn_125_0 = 1;
                                      decompiledRegionSelector0 = 10;
                                      break L0;
                                    }
                                  }
                                  if (pointerX <= 420) {
                                    break L2;
                                  } else {
                                    if (pointerX >= 579) {
                                      break L2;
                                    } else {
                                      stackIn_131_0 = 2;
                                      decompiledRegionSelector0 = 11;
                                      break L0;
                                    }
                                  }
                                }
                              }
                              if (pointerY <= 430) {
                                break L2;
                              } else {
                                if (pointerY >= 470) {
                                  break L2;
                                } else {
                                  if (pointerX <= 279) {
                                    break L2;
                                  } else {
                                    if (pointerX >= 362) {
                                      break L2;
                                    } else {
                                      stackIn_145_0 = 3;
                                      decompiledRegionSelector0 = 13;
                                      break L0;
                                    }
                                  }
                                }
                              }
                            } else {
                              if (this.screenId != 4) {
                                if (6 != this.screenId) {
                                  break L2;
                                } else {
                                  if (pointerY <= 430) {
                                    break L2;
                                  } else {
                                    if (470 <= pointerY) {
                                      break L2;
                                    } else {
                                      if (pointerX > 146) {
                                        if (pointerX < 306) {
                                          stackIn_99_0 = 0;
                                          decompiledRegionSelector0 = 8;
                                          break L0;
                                        }
                                      }
                                      if (pointerX <= 326) {
                                        break L2;
                                      } else {
                                        if (pointerX < 486) {
                                          stackIn_107_0 = 1;
                                          decompiledRegionSelector0 = 9;
                                          break L0;
                                        } else {
                                          break L2;
                                        }
                                      }
                                    }
                                  }
                                }
                              } else {
                                if (pointerX <= 171) {
                                  break L2;
                                } else {
                                  if (pointerX < 469) {
                                    if (265 < pointerY) {
                                      if (pointerY < 301) {
                                        stackIn_78_0 = 0;
                                        decompiledRegionSelector0 = 6;
                                        break L0;
                                      }
                                    }
                                    if (pointerY <= 395) {
                                      break L2;
                                    } else {
                                      if (431 <= pointerY) {
                                        break L2;
                                      } else {
                                        stackIn_84_0 = 1;
                                        decompiledRegionSelector0 = 7;
                                        break L0;
                                      }
                                    }
                                  } else {
                                    break L2;
                                  }
                                }
                              }
                            }
                          }
                        }
                        if (pointerY > 437) {
                          if (pointerY < 473) {
                            if (pointerX > 121) {
                              if (356 > pointerX) {
                                stackIn_54_0 = 0;
                                decompiledRegionSelector0 = 4;
                                break L0;
                              }
                            }
                            if (436 < pointerX) {
                              if (pointerY < 518) {
                                stackIn_60_0 = 1;
                                decompiledRegionSelector0 = 5;
                                break L0;
                              }
                            }
                          }
                        }
                      } else {
                        if (pointerY > 435) {
                          if (470 > pointerY) {
                            if (pointerX > 279) {
                              if (361 > pointerX) {
                                stackIn_36_0 = 0;
                                decompiledRegionSelector0 = 3;
                                break L0;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  stackIn_195_0 = -1;
                  decompiledRegionSelector0 = 18;
                  break L0;
                }
              }
              if (pointerX >= 149) {
                if (490 >= pointerX) {
                  stackIn_18_0 = super.hitTestMenuItem(pointerX, pointerY, (byte) 127);
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
              stackIn_16_0 = -1;
              decompiledRegionSelector0 = 1;
            } else {
              stackIn_2_0 = -109;
              decompiledRegionSelector0 = 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var4), "c.P(" + pointerX + ',' + pointerY + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_16_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_36_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_54_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_60_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_78_0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_84_0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_99_0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_107_0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_125_0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_131_0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_133_0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_145_0;
                                  } else {
                                    if (decompiledRegionSelector0 == 14) {
                                      return stackIn_162_0;
                                    } else {
                                      if (decompiledRegionSelector0 == 15) {
                                        return stackIn_168_0;
                                      } else {
                                        if (decompiledRegionSelector0 == 16) {
                                          return stackIn_179_0;
                                        } else {
                                          if (decompiledRegionSelector0 == 17) {
                                            return stackIn_193_0;
                                          } else {
                                            return stackIn_195_0;
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
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final void b(int param0) {
        Object stackIn_59_0 = null;
        RuntimeException decompiledCaughtException = null;
        String var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var3 = 0;
        String[] var3_ref_String__ = null;
        bg var4 = null;
        int[] var5 = null;
        String var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        String var8 = null;
        String var9 = null;
        int var10 = 0;
        var10 = Geoblox.field_C;
        try {
          if (ca.field_f == null) {
            if (!fh.c(-115)) {
              ca.field_f = qb.b(22, 1, 0, 10, 3);
            }
          }
          L2: {
            if (0 != da.field_c) {
              if (da.field_c != 2) {
                if (da.field_c != 1) {
                  break L2;
                } else {
                  kh.field_h[3].b(0, 20);
                  if (var10 == 0) {
                    break L2;
                  }
                }
              }
              kh.field_h[2].b(0, 20);
              if (var10 == 0) {
                break L2;
              }
            }
            kh.field_h[1].b(0, 20);
          }
          if (param0 != 30) {
            this.updateTransition(-78);
          }
          L6: {
            if (null != ca.field_f) {
              if (null != ca.field_f.field_k) {
                if (!ca.field_f.field_j) {
                  var2 = eb.field_f;
                  var3 = 76 + (150 + dd.field_G.field_o);
                  dd.field_G.b(var2, 322, var3, 0, -1);
                  if (var10 == 0) {
                    break L6;
                  }
                }
                L9: {
                  var2_int = 0;
                  var3_ref_String__ = ca.field_f.field_k[da.field_c];
                  var4 = fi.field_d;
                  if (var3_ref_String__ != null) {
                    var5 = ca.field_f.field_h[da.field_c];
                    var6 = var4.field_o + 150;
                    var7 = 0;
                    var8_int = 0;
                    L10: while (true) {
                      L11: {
                        if (var8_int < 10) {
                          stackIn_59_0 = null;

                          if (var10 != 0) {
                            break L11;
                          } else {
                            L13: {
                              if (stackIn_59_0 != var3_ref_String__[var8_int]) {
                                var2_int = 1;
                                var9 = var3_ref_String__[var8_int];
                                if (var7 == 0) {
                                  if (null != el.gameplaySession) {
                                    if (var5[var8_int] == Math.abs(el.gameplaySession.score)) {
                                      if (ge.a(var9, (byte) 12)) {
                                        var7 = 1;
                                        var4.c(1 + var8_int + ". ", 165, var6, 16610816, -1);
                                        var4.a(var9, 165, var6, 16610816, -1);
                                        var4.c(Integer.toString(var5[var8_int]), 500, var6, 16610816, -1);
                                        if (var10 == 0) {
                                          break L13;
                                        }
                                      }
                                    }
                                  }
                                }
                                var4.c(1 + var8_int + ". ", 165, var6, 1, -1);
                                var4.a(var9, 165, var6, 1, -1);
                                var4.c(Integer.toString(var5[var8_int]), 500, var6, 1, -1);
                              }
                            }
                            var6 += 15;
                            var8_int++;
                            if (var10 == 0) {
                              continue L10;
                            }
                          }
                        }
                        if (var7 != 0) {
                          break L9;
                        } else {
                          stackIn_59_0 = null;
                        }
                      }
                      if (stackIn_59_0 == el.gameplaySession) {
                        break L9;
                      } else {
                        if (el.gameplaySession.score == 0) {
                          break L9;
                        } else {
                          if (el.gameplaySession.score != -2147483648) {
                            var8 = SecondaryDeque.field_f;
                            var4.a(var8, 165, var6, 16724225, -1);
                            var4.c(Integer.toString(Math.abs(el.gameplaySession.score)), 500, var6, 16724225, -1);
                            break L9;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                  }
                }
                if (var2_int == 0) {
                  var5_ref = sb.noHighscoresText;
                  var6 = 76 + dd.field_G.field_o + 150;
                  dd.field_G.b(var5_ref, 322, var6, 0, -1);
                }
                if (var10 == 0) {
                  break L6;
                }
              }
            }
            L16: {
              if (!fh.c(-89)) {
                var2 = g.serviceUnavailableText;
                if (var10 == 0) {
                  break L16;
                }
              }
              var2 = sb.noHighscoresText;
            }
            var3 = 150 - (-dd.field_G.field_o - 76);
            dd.field_G.b(var2, 322, var3, 0, -1);
            if (fh.c(param0 + -147)) {
              dd.field_G.a(ni.createToUseText, 125, 350, 395, 100, 0, -1, 1, 0, 26);
            }
          }
          if (!fh.c(param0 ^ -109)) {
            var2 = ue.highscoreFriendTipText;
            fi.field_d.a(var2, 140, 325, 360, 300, 0, -1, 1, 0, 16);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2_ref), "c.U(" + param0 + ')');
        }
    }

    final void updateScreen(byte param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        float var2_float = 0.0f;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Geoblox.field_C;
        try {
          L0: {
            fieldTemp$0 = this.animationTick + 1;
            this.animationTick = this.animationTick + 1;
            if (fieldTemp$0 % 5 == 0) {
              this.field_O = this.field_O - 1;
              this.field_W = this.field_W + 1;
              this.g((byte) -102);
            }
            if (3 == (this.animationTick & 3)) {
              this.field_I = this.field_I - 1;
              this.field_u = this.field_u - 1;
            }
            if (!this.field_E) {
              jk.field_a = this.field_C;
              this.volumePreviewTicks = this.volumePreviewTicks + 1;
              this.activeTicks = this.activeTicks + 1;
              if (this.field_C) {
                if (vl.field_n != null) {
                  if (this.activeTicks > 1500) {
                    em.b(255);
                    this.field_C = false;
                  }
                }
              }
              L4: while (true) {
                L5: {
                  if (hh.a(108)) {
                    this.handleScreenKey((byte) 62);
                    if (var3 != 0) {
                      break L5;
                    } else {
                      if (var3 == 0) {
                        continue L4;
                      }
                    }
                  }
                  if (this.screenId == 3) {
                    if (this.selectedItemIndex == 0) {
                      if (this.field_q == 0) {
                        if (!this.field_H) {
                          this.selectedItemIndex = this.selectedItemIndex + 1;
                        }
                      }
                    }
                  }
                }
                if (this.screenId == 3) {
                  L8: {
                    if (0 == (1 & this.animationTick)) {
                      this.field_z = this.field_z + 1;
                      this.field_Z = -(this.field_z >> -137754207) + 60;
                      if (this.field_Z < 15) {
                        this.field_Z = 15;
                        if (var3 == 0) {
                          break L8;
                        }
                      }
                      this.field_A = this.field_A + 0.1;
                    }
                  }
                  if (120 == this.field_z) {
                    this.field_X = qi.b(7, 1);
                    this.field_L = qi.b(7, 1);
                    this.field_z = 0;
                  }
                  if (this.field_q < 4) {
                    if (this.animationTick % 24 == 0) {
                      this.field_w = this.field_w + 1;
                      if (this.field_w >= 4) {
                        this.field_w = 0;
                      }
                    }
                  }
                  L12: {
                    if (this.field_q != 3) {
                      if (4 == this.field_q) {
                        if (49 > (this.animationTick & 255)) {
                          if ((15 & this.animationTick) == 0) {
                            this.field_w = this.field_w + 1;
                            if (this.field_w >= 4) {
                              this.field_w = 0;
                            }
                            this.field_B = this.field_B + 1;
                            if (4 <= this.field_B) {
                              this.field_B = 0;
                              if (var3 == 0) {
                                break L12;
                              }
                            } else {
                              break L12;
                            }
                          } else {
                            break L12;
                          }
                        }
                        this.field_B = 0;
                        this.field_w = 0;
                        if (var3 == 0) {
                          break L12;
                        }
                      } else {
                        break L12;
                      }
                    }
                    var2_float = 0.019999999552965164f * (float)(this.animationTick % 50);
                    this.field_N = ((int)(var2_float * (float)this.field_t) << -1025150840) + (jg.field_h[selectedThemeId][this.field_B] - -((int)(var2_float * (float)this.field_V) << -774715792) + (int)((float)this.field_M * var2_float));
                    if (this.animationTick % 50 == 49) {
                      this.field_B = this.field_B + 1;
                      this.field_B = this.field_B % 7;
                      this.field_V = -((16751678 & jg.field_h[selectedThemeId][this.field_B]) >> -1539020080) + ((jg.field_h[selectedThemeId][(1 + this.field_B) % 7] & 16754682) >> -580890576);
                      this.field_t = (255 & jg.field_h[selectedThemeId][(this.field_B + 1) % 7] >> -1088551928) - ((jg.field_h[selectedThemeId][this.field_B] & 65438) >> 2029681544);
                      this.field_M = (255 & jg.field_h[selectedThemeId][(1 + this.field_B) % 7]) + -(255 & jg.field_h[selectedThemeId][this.field_B]);
                    }
                  }
                  qa.advanceMenuAvatarAnimation((byte) 127);
                }
                L16: {
                  fieldTemp$1 = di.field_a;
                  di.field_a = di.field_a - 1;
                  if (0 > fieldTemp$1) {
                    if (bi.field_g != 0) {
                      di.field_a = 50;
                      if (var3 == 0) {
                        break L16;
                      }
                    } else {
                      break L16;
                    }
                  }
                  bi.field_g = 0;
                }
                if (bi.field_g != 0) {
                  L19: {
                    if (this.screenId != 5) {
                      if (7 != this.screenId) {
                        break L19;
                      }
                    }
                    oe.a(false, false, param0 ^ 189);
                  }
                  if (this.screenId == 6) {
                    oe.a(true, false, param0 + 131);
                  }
                  if (this.screenId == 4) {
                    oe.a(true, true, 160);
                  }
                }
                L22: {
                  if (!this.field_C) {
                    this.updatePointer(true);
                    if (var3 == 0) {
                      break L22;
                    }
                  }
                  if (bi.field_g != 0) {
                    if (fh.c(-104)) {
                      if (265 < he.field_d) {
                        if (he.field_d < 299) {
                          if (mc.field_a > 350) {
                            if (mc.field_a < 470) {
                              this.pointerInteractionActive = true;
                              this.field_C = false;
                              if (var3 == 0) {
                                break L22;
                              }
                            }
                          }
                          L27: {
                            if (mc.field_a > 170) {
                              if (mc.field_a < 290) {
                                break L27;
                              }
                            }
                            this.pointerInteractionActive = false;
                            if (var3 == 0) {
                              break L22;
                            }
                          }
                          this.pointerInteractionActive = true;
                          if (null != el.gameplaySession) {
                            el.gameplaySession.submitScore((byte) -70);
                          }
                          ai.requestedScreenId = -1;
                          el.gameplayReturnScreenId = 0;
                          cd.gameplayOriginScreenId = 0;
                          if (var3 == 0) {
                            break L22;
                          }
                        }
                      }
                      this.pointerInteractionActive = false;
                      if (var3 == 0) {
                        break L22;
                      }
                    }
                    if (og.field_n > 0) {
                      if (null != vl.field_n) {
                        if (he.field_d > 317) {
                          if (352 > he.field_d) {
                            L32: {
                              if (mc.field_a > 350) {
                                if (mc.field_a < 470) {
                                  break L32;
                                }
                              }
                              L34: {
                                if (mc.field_a > 170) {
                                  if (mc.field_a < 290) {
                                    break L34;
                                  }
                                }
                                this.pointerInteractionActive = false;
                                if (var3 == 0) {
                                  break L22;
                                }
                              }
                              this.field_C = false;
                              this.pointerInteractionActive = true;
                              if (var3 == 0) {
                                break L22;
                              }
                            }
                            this.field_C = false;
                            em.b(255);
                            this.pointerInteractionActive = true;
                            if (var3 == 0) {
                              break L22;
                            }
                          }
                        }
                        this.pointerInteractionActive = false;
                        if (var3 == 0) {
                          break L22;
                        }
                      }
                    }
                    this.pointerInteractionActive = true;
                    this.field_C = false;
                  }
                }
                L36: {
                  if (qa.field_a == this.field_s) {
                    if (~ue.field_e == ~this.field_Y) {
                      break L36;
                    }
                  }
                  this.field_o = -1;
                }
                this.field_Y = ue.field_e;
                if (param0 != 29) {
                  this.handleMenuKey(11, 26);
                }
                L39: {
                  this.field_s = qa.field_a;
                  if (this.selectedItemIndex != 0) {
                    L40: {
                      var2_int = (qa.field_a - -he.field_d - (-kd.field_c - ki.field_d)) % 8;
                      if (var2_int != 0) {
                        if (var2_int != 1) {
                          if (var2_int != 2) {
                            if (var2_int == 3) {
                              oa.field_a = oa.field_a - gb.field_g;
                              kb.field_d = kb.field_d + 1;
                              if (var3 == 0) {
                                break L40;
                              }
                            }
                            if (var2_int != 4) {
                              if (var2_int != 5) {
                                if (6 == var2_int) {
                                  gb.field_g = gb.field_g - 1;
                                  ml.field_r = ml.field_r - kb.field_d;
                                  if (var3 == 0) {
                                    break L40;
                                  }
                                }
                                if (var2_int == 7) {
                                  kb.field_d = kb.field_d - 1;
                                  ml.field_r = ml.field_r - gb.field_g;
                                  if (var3 == 0) {
                                    break L40;
                                  }
                                } else {
                                  break L40;
                                }
                              }
                              kb.field_d = kb.field_d + 1;
                              ml.field_r = ml.field_r + gb.field_g;
                              if (var3 == 0) {
                                break L40;
                              }
                            }
                            gb.field_g = gb.field_g + 1;
                            ml.field_r = ml.field_r + kb.field_d;
                            if (var3 == 0) {
                              break L40;
                            }
                          }
                          oa.field_a = oa.field_a - kb.field_d;
                          gb.field_g = gb.field_g + 1;
                          if (var3 == 0) {
                            break L40;
                          }
                        }
                        oa.field_a = oa.field_a + gb.field_g;
                        kb.field_d = kb.field_d - 1;
                        if (var3 == 0) {
                          break L40;
                        }
                      }
                      oa.field_a = oa.field_a + kb.field_d;
                      gb.field_g = gb.field_g - 1;
                    }
                    var2_int = (ki.field_d + qa.field_a - (-he.field_d + -kd.field_c)) % 5;
                    if (0 != var2_int) {
                      if (var2_int != 1) {
                        if (var2_int == 2) {
                          el.field_g = el.field_g - sc.field_f;
                          lb.field_b = lb.field_b - 1;
                          if (var3 == 0) {
                            break L39;
                          }
                        }
                        if (var2_int == 3) {
                          sc.field_f = sc.field_f + 1;
                          el.field_g = el.field_g + lb.field_b;
                          if (var3 == 0) {
                            break L39;
                          }
                        }
                        if (var2_int != 4) {
                          break L39;
                        } else {
                          el.field_g = el.field_g - lb.field_b;
                          sc.field_f = sc.field_f - 1;
                          if (var3 == 0) {
                            break L39;
                          }
                        }
                      }
                      el.field_g = el.field_g + sc.field_f;
                      lb.field_b = lb.field_b + 1;
                      if (var3 == 0) {
                        break L39;
                      }
                    }
                    dc.field_a = dc.field_a | lb.field_b + el.field_g << 595332241;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              this.e((byte) 104);
              decompiledRegionSelector0 = 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "c.R(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void b(int param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4_int = 0;
        Object var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        double var9 = 0.0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = Geoblox.field_C;
        try {
          L1: {
            var3_int = 180;
            SoftwareRasterizer.a(this.field_P);
            if (param1 != 0) {
              if (1 != param1) {
                if (param1 != 2) {
                  ma.a(140, 30, 80, (byte) -92, 80, ll.field_h);
                  ma.a(242, 30, 80, (byte) -92, 80, ll.field_h);
                  if (var11 == 0) {
                    break L1;
                  }
                }
              }
            }
            L3: {
              ma.a(140, 30, 80, (byte) -92, 80, ll.field_h);
              ma.a(242, 30, 80, (byte) -92, 80, ll.field_h);
              ma.a(345, 30, 80, (byte) -92, 80, ll.field_h);
              ri.a(70, 180, 29497);
              vf.spriteScratchRaster.e();
              SoftwareRasterizer.c();
              ke.field_a[1][this.field_X][this.field_L].b((vf.spriteScratchRaster.field_s >> 1398463873) + -(ke.field_a[1][this.field_X][this.field_L].field_s >> -2119905215), (vf.spriteScratchRaster.field_o >> -1954799455) + -(ke.field_a[1][this.field_X][this.field_L].field_o >> 112423521));
              sh.field_y.a(255);
              SoftwareRasterizer.b(this.field_P);
              SoftwareRasterizer.b(50, 250, 90, 310);
              vf.spriteScratchRaster.g(1);
              vf.spriteScratchRaster.b(44, this.field_z + 200);
              SoftwareRasterizer.b(this.field_P);
              SoftwareRasterizer.b(40, 355, 93, 415);
              var4_int = 70;
              var5 = 385;
              var6 = (int)(-Math.sin(this.field_A) * (double)this.field_Z + 0.5) + var4_int;
              var7 = (int)(0.5 + Math.cos(this.field_A) * (double)this.field_Z) + var5;
              var8 = (int)(this.field_A / 6.283185307179586 * 65535.0 + 0.5);
              var9 = 2.0943741584421716;
              if (this.field_Z != 15) {
                vf.spriteScratchRaster.e();
                SoftwareRasterizer.c();
                ke.field_a[1][this.field_X][this.field_L].b(vf.spriteScratchRaster.field_s >> -1401802047, vf.spriteScratchRaster.field_o >> 1779537697, var8, 3072);
                sh.field_y.a(255);
                SoftwareRasterizer.b(this.field_P);
                SoftwareRasterizer.b(40, 355, 103, 415);
                vf.spriteScratchRaster.g(1);
                vf.spriteScratchRaster.b(var6 - (vf.spriteScratchRaster.field_s >> 1920897793), var7 - (vf.spriteScratchRaster.field_o >> 21057857));
                var8 = (int)(0.5 + 65535.0 * ((this.field_A + var9) / 6.283185307179586));
                var6 = var4_int - -(int)(0.5 + -Math.sin(this.field_A + var9) * (double)this.field_Z);
                var7 = (int)(0.5 + Math.cos(this.field_A + var9) * (double)this.field_Z) + var5;
                vf.spriteScratchRaster.e();
                SoftwareRasterizer.c();
                ke.field_a[1][this.field_X][this.field_L].b(vf.spriteScratchRaster.field_s >> -487715007, vf.spriteScratchRaster.field_o >> 278492609, var8, 3072);
                sh.field_y.a(255);
                SoftwareRasterizer.b(this.field_P);
                SoftwareRasterizer.b(40, 355, 103, 415);
                vf.spriteScratchRaster.g(1);
                vf.spriteScratchRaster.b(var6 + -(vf.spriteScratchRaster.field_s >> -635951327), -(vf.spriteScratchRaster.field_o >> -1258578751) + var7);
                var9 = var9 * 2.0;
                var8 = (int)(0.5 + 65535.0 * ((var9 + this.field_A) / 6.283185307179586));
                var6 = (int)(-Math.sin(var9 + this.field_A) * (double)this.field_Z + 0.5) + var4_int;
                var7 = var5 + (int)(Math.cos(var9 + this.field_A) * (double)this.field_Z + 0.5);
                vf.spriteScratchRaster.e();
                SoftwareRasterizer.c();
                ke.field_a[1][this.field_X][this.field_L].b(vf.spriteScratchRaster.field_s >> -856243103, vf.spriteScratchRaster.field_o >> -2039870623, var8, 3072);
                sh.field_y.a(255);
                SoftwareRasterizer.b(this.field_P);
                SoftwareRasterizer.b(40, 355, 103, 415);
                vf.spriteScratchRaster.g(1);
                vf.spriteScratchRaster.b(var6 + -(vf.spriteScratchRaster.field_s >> 105570977), var7 - (vf.spriteScratchRaster.field_o >> -1265029599));
                if (var11 == 0) {
                  break L3;
                }
              }
              wl.field_a.e();
              SoftwareRasterizer.c();
              mi.field_B[this.field_w].a(-10 + (wl.field_a.field_s >> 984917473), (wl.field_a.field_o >> 1405073313) - 10, 20, 20);
              sh.field_y.a(255);
              SoftwareRasterizer.b(this.field_P);
              SoftwareRasterizer.b(40, 355, 103, 415);
              wl.field_a.b(var6 - (wl.field_a.field_s >> -1019060543), var7 - (wl.field_a.field_s >> 394487777));
              var8 = (int)((this.field_A + var9) / 6.283185307179586 * 65535.0 + 0.5);
              var6 = (int)(-Math.sin(var9 + this.field_A) * (double)this.field_Z + 0.5) + var4_int;
              var7 = var5 - -(int)(0.5 + Math.cos(var9 + this.field_A) * (double)this.field_Z);
              wl.field_a.e();
              SoftwareRasterizer.c();
              mi.field_B[this.field_w].a((wl.field_a.field_s >> -1422082207) + -10, (wl.field_a.field_o >> -2056657503) - 10, 20, 20);
              sh.field_y.a(255);
              SoftwareRasterizer.b(this.field_P);
              SoftwareRasterizer.b(40, 355, 103, 415);
              wl.field_a.b(var6 - (wl.field_a.field_s >> 430711393), -(wl.field_a.field_s >> -1508571071) + var7);
              var9 = var9 * 2.0;
              var8 = (int)(0.5 + (this.field_A + var9) / 6.283185307179586 * 65535.0);
              var6 = (int)(0.5 + -Math.sin(var9 + this.field_A) * (double)this.field_Z) + var4_int;
              var7 = var5 + (int)(Math.cos(this.field_A + var9) * (double)this.field_Z + 0.5);
              wl.field_a.e();
              SoftwareRasterizer.c();
              mi.field_B[this.field_w].a((wl.field_a.field_s >> 758393505) + -10, -10 + (wl.field_a.field_o >> 1705859041), 20, 20);
              sh.field_y.a(255);
              SoftwareRasterizer.b(this.field_P);
              SoftwareRasterizer.b(40, 355, 103, 415);
              wl.field_a.b(var6 - (wl.field_a.field_s >> -343158815), var7 + -(wl.field_a.field_s >> -1289823679));
            }
            SoftwareRasterizer.b(this.field_P);
          }
          L5: {
            ma.a(140, 550, 40, (byte) -92, 60, ll.field_h);
            dd.field_G.b(param1 - -1 + "/5", 580, 170, 0, -1);
            var4 = null;
            var5 = 155;
            var6 = param1;
            if (var6 == 0) {
              dd.field_G.a(a.field_a[0], var5, var3_int, 0, -1);
              var4 = ec.field_e[0];
              dd.field_G.a(a.field_a[1], var5, var3_int - -110, 0, -1);
            } else {
              if (1 == var6) {
                if (var11 == 0) {
                  dd.field_G.a(a.field_a[2], var5, var3_int, 0, -1);
                  var4 = ec.field_e[1];
                  break L5;
                }
              }
              if (var6 == 2) {
                dd.field_G.a(a.field_a[3], var5, var3_int, 0, -1);
                var4 = ec.field_e[2];
              } else {
                if (var6 == 3) {
                  vf.spriteScratchRaster.e();
                  SoftwareRasterizer.c();
                  MenuScreen.field_m[1][this.field_L][this.field_w].b(-(MenuScreen.field_m[1][this.field_L][this.field_w].field_s >> 987161601) + (vf.spriteScratchRaster.field_s >> -1269651263), (vf.spriteScratchRaster.field_o >> 2090103937) - (MenuScreen.field_m[1][this.field_L][this.field_w].field_o >> 1687650273));
                  sh.field_y.a(255);
                  SoftwareRasterizer.b(this.field_P);
                  vf.spriteScratchRaster.b(70 + -(vf.spriteScratchRaster.field_s >> -389511871), -(vf.spriteScratchRaster.field_o >> 1896871265) + 180);
                  vf.spriteScratchRaster.e();
                  SoftwareRasterizer.c();
                  s.field_G[1][this.field_X].b((vf.spriteScratchRaster.field_s >> 58463713) - (s.field_G[1][this.field_X].field_s >> -1377280415), (vf.spriteScratchRaster.field_o >> -516762015) + -(s.field_G[1][this.field_X].field_o >> 2065312449), this.field_N);
                  sh.field_y.a(255);
                  SoftwareRasterizer.b(this.field_P);
                  vf.spriteScratchRaster.g(1);
                  vf.spriteScratchRaster.b(70 - (vf.spriteScratchRaster.field_s >> -431583199), 282 - (vf.spriteScratchRaster.field_o >> -1230674015));
                  dd.field_G.a(a.field_a[4], var5, var3_int, 0, -1);
                  var4 = ec.field_e[3];
                } else {
                  if (4 == var6) {
                    vf.spriteScratchRaster.e();
                    SoftwareRasterizer.c();
                    fc.field_g[this.field_w].b(-(fc.field_g[this.field_w].field_s >> -1837581887) + (vf.spriteScratchRaster.field_s >> 1490350017), -(fc.field_g[this.field_w].field_o >> -1811742495) + (vf.spriteScratchRaster.field_o >> 1651106433));
                    k.a(0, 0, vf.spriteScratchRaster.field_s, -27085, vf.spriteScratchRaster.field_o);
                    sh.field_y.a(255);
                    SoftwareRasterizer.b(this.field_P);
                    vf.spriteScratchRaster.b(70 - (vf.spriteScratchRaster.field_s >> -502406015), 180 + -(vf.spriteScratchRaster.field_o >> 842923649));
                    vf.spriteScratchRaster.e();
                    SoftwareRasterizer.c();
                    if (this.field_B >= 4) {
                      this.field_B = 0;
                    }
                    hb.field_d[this.field_B].b(-(hb.field_d[this.field_B].field_s >> 1267431681) + (vf.spriteScratchRaster.field_s >> 992034401), (vf.spriteScratchRaster.field_o >> 1607733665) - (hb.field_d[this.field_B].field_o >> 707716161));
                    k.a(0, 0, vf.spriteScratchRaster.field_s, -27085, vf.spriteScratchRaster.field_o);
                    sh.field_y.a(255);
                    SoftwareRasterizer.b(this.field_P);
                    vf.spriteScratchRaster.b(70 + -(vf.spriteScratchRaster.field_s >> 1189368705), -(vf.spriteScratchRaster.field_o >> -1499046271) + 282);
                    dd.field_G.a(a.field_a[5], var5, var3_int, 0, -1);
                    var4 = ec.field_e[4];
                  }
                }
              }
            }
          }
          var6 = fi.field_d.field_o - -fi.field_d.field_q;
          if (param0 > -14) {
            this.handleMenuPointer(-3, -61, false, -67, true, 116);
          }
          var7 = 355;
          var3_int = var3_int + fi.field_d.a((String) (var4), var5, var3_int, var7, 300, 0, -1, 0, 0, 16) * var6;
          SoftwareRasterizer.b(this.field_P);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw t.a((Throwable) ((Object) runtimeException), "c.B(" + param0 + ',' + param1 + ')');
        }
    }

    final void handleMenuPointer(int itemIndex, int pointerX, boolean initialClick, int rowOffsetY, boolean heldRepeat, int pointerButton) {
        RuntimeException decompiledCaughtException = null;
        int actionId = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        var9 = Geoblox.field_C;
        try {
          if (initialClick) {
            this.field_q = -45;
          }
          L2: {
            L3: {
              actionId = t.menuActionIds[this.screenId][itemIndex];
              var8 = actionId;
              if (var8 == 8) {
                L5: {
                  pointerX -= 280;
                  if (pointerX > 0) {
                    if (pointerX < sd.field_y.field_s) {
                      j.field_gb = 80 * pointerX / sd.field_y.field_s;
                      if (var9 == 0) {
                        break L5;
                      }
                    }
                    j.field_gb = 80;
                    if (var9 == 0) {
                      break L5;
                    }
                  }
                  j.field_gb = 0;
                }
                this.previewMusicVolume(0);
                if (var9 == 0) {
                  break L2;
                }
              } else {
                if (var8 != 9) {
                  break L3;
                }
              }
              pointerX -= 280;
              if (pointerX <= 0) {
                wg.a(-15346, 0);
                if (var9 == 0) {
                  break L2;
                }
              }
              if (~sd.field_y.field_s < ~pointerX) {
                wg.a(-15346, 80 * pointerX / sd.field_y.field_s);
                if (var9 == 0) {
                  break L2;
                }
              }
              wg.a(-15346, 80);
              if (var9 == 0) {
                break L2;
              }
            }
            if (!heldRepeat) {
              super.handleMenuPointer(itemIndex, pointerX, initialClick, rowOffsetY, heldRepeat, pointerButton);
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var7), "c.G(" + itemIndex + ',' + pointerX + ',' + initialClick + ',' + rowOffsetY + ',' + heldRepeat + ',' + pointerButton + ')');
        }
    }

    final static char c(int param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        char stackIn_16_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3 = 0;
        try {
          var2_int = 255 & param1;
          if (var2_int != 0) {
            if (var2_int >= 128) {
              if (160 > var2_int) {
                var3 = lf.extendedTextCharacters[-128 + var2_int];
                if (0 == var3) {
                  var3 = 63;
                }
                var2_int = var3;
              }
            }
            if (param0 <= 21) {
              GameScreen.d((byte) -112);
            }
            stackIn_16_0 = (char)var2_int;
          } else {
            throw new IllegalArgumentException("" + Integer.toString(var2_int, 16));
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "c.A(" + param0 + ',' + param1 + ')');
        }
        return stackIn_16_0;
    }

    final void setItemCount(int param0, int itemCount) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != -12831) {
            this.renderMenuItem(true, (byte) 98, -83, 83);
          }
          this.itemCount = itemCount;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var3), "c.J(" + param0 + ',' + itemCount + ')');
        }
    }

    private final void e(byte param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            if (param0 < 73) {
              this.field_V = 15;
            }
            if (0 == this.field_T) {
              if (!this.field_H) {
                L3: {
                  if (0 == this.field_F) {
                    if (this.keyboardSelectionActive) {
                      if (this.field_q == 4) {
                        this.selectedItemIndex = 3;
                        if (Geoblox.field_C == 0) {
                          break L3;
                        }
                      } else {
                        break L3;
                      }
                    }
                    this.selectedItemIndex = this.hitTestMenuItem(qa.field_a, ue.field_e, (byte) 54);
                  }
                }
                this.field_F = this.field_F + 8;
                if (~(640 + qj.transitionCurtain.height) > ~this.field_F) {
                  this.field_E = false;
                  this.field_F = 0;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
            decompiledRegionSelector0 = 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "c.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void f(byte param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 == 89) {
            if (3 == this.screenId) {
              if (!this.field_E) {
                L2: {
                  if (this.field_q != 4) {
                    if (this.selectedItemIndex == 3) {
                      this.selectedItemIndex = 2;
                      if (Geoblox.field_C == 0) {
                        break L2;
                      }
                    }
                  }
                  if (this.field_q == 4) {
                    if (this.selectedItemIndex == 2) {
                      this.selectedItemIndex = 1;
                    }
                    if (oc.previousMenuScreenId == 1) {
                      if (this.selectedItemIndex == 3) {
                        this.selectedItemIndex = 1;
                      }
                    }
                  }
                }
                if (this.field_q == 0) {
                  if (this.selectedItemIndex == 0) {
                    this.selectedItemIndex = 2;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 1;
          } else {
            decompiledRegionSelector0 = 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "c.F(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    GameScreen(Geoblox param0, int param1) {
        super(t.menuActionIds[param1].length, 140, 500, 140, 40);
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_S = false;
        this.field_L = 0;
        this.field_H = false;
        this.field_X = 0;
        this.animationTick = 0;
        this.field_I = 115;
        this.field_P = new int[4];
        this.field_o = -1;
        this.volumePreviewTicks = 0;
        this.field_u = 123;
        this.field_O = 0;
        this.field_F = 0;
        this.field_z = 0;
        this.field_v = true;
        this.field_W = 0;
        try {
          this.screenId = param1;
          this.gameApplet = param0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = (RuntimeException) (runtimeException);

          stackIn_6_1 = new StringBuilder().append("c.<init>(");

          if (param0 == null) {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
            stackIn_7_2 = "null";
          } else {
            stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void previewMusicVolume(int param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 == 0) {
            L1: {
              if (null != this.volumePreviewStream) {
                if (!this.volumePreviewStream.isSamplePositionOutOfRange()) {
                  if (50 >= this.volumePreviewTicks) {
                    break L1;
                  }
                }
              }
              this.volumePreviewStream = PcmSampleStream.createForPlaybackRate(fl.field_c[8], 100, j.field_gb);
              GameplayEntity.registerAudioStream(false, this.volumePreviewStream);
              this.volumePreviewTicks = 0;
            }
            decompiledRegionSelector0 = 1;
          } else {
            decompiledRegionSelector0 = 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "c.H(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void updateTransition(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          fieldTemp$1 = this.animationTick + 1;
          this.animationTick = this.animationTick + 1;
          if (fieldTemp$1 % 5 == 0) {
            this.field_W = this.field_W + 1;
            this.field_O = this.field_O - 1;
            this.g((byte) -114);
          }
          if ((this.animationTick & 3) == 3) {
            this.field_u = this.field_u - 1;
            this.field_I = this.field_I - 1;
          }
          if (param0 != 16405) {
            this.b(false);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "c.K(" + param0 + ')');
        }
    }

    final void activateMenuItem(int itemIndex, byte param1) {
        int stackIn_105_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int actionId = 0;
        int var6_int = 0;
        String[] var6 = null;
        int var7 = 0;
        var7 = Geoblox.field_C;
        try {
          L0: {
            td.playPcmSample(-348, fl.field_c[29]);
            var3_int = 0;
            var4 = 0;
            actionId = t.menuActionIds[this.screenId][itemIndex];
            if (param1 != -2) {
              this.updateTransition(-70);
            }
            L2: {
              L3: {
                var6_int = actionId;
                if (var6_int == 15) {
                  if (var7 == 0) {
                    if (1 == oc.previousMenuScreenId) {
                      decompiledRegionSelector0 = 0;
                      break L0;
                    } else {
                      var3_int = 1;
                      break L3;
                    }
                  }
                }
                if (var6_int == 0) {
                  if (var7 == 0) {
                    break L3;
                  }
                }
                L6: {
                  L7: {
                    L8: {
                      L9: {
                        L10: {
                          L11: {
                            L12: {
                              L13: {
                                L14: {
                                  L15: {
                                    L16: {
                                      L17: {
                                        L18: {
                                          L19: {
                                            if (1 == var6_int) {
                                              if (var7 == 0) {
                                                ai.requestedScreenId = -1;
                                                if (var7 == 0) {
                                                  break L2;
                                                } else {
                                                  break L19;
                                                }
                                              }
                                            }
                                            if (var6_int == 2) {
                                              if (var7 == 0) {
                                                break L19;
                                              }
                                            }
                                            if (var6_int == 3) {
                                              break L18;
                                            } else {
                                              if (var6_int == 4) {
                                                if (var7 == 0) {
                                                  break L17;
                                                }
                                              }
                                              if (14 == var6_int) {
                                                if (var7 == 0) {
                                                  break L16;
                                                }
                                              }
                                              if (var6_int == 5) {
                                                break L15;
                                              } else {
                                                if (var6_int == 13) {
                                                  break L14;
                                                } else {
                                                  if (6 == var6_int) {
                                                    if (var7 == 0) {
                                                      break L13;
                                                    }
                                                  }
                                                  if (var6_int == 7) {
                                                    break L12;
                                                  } else {
                                                    if (var6_int == 12) {
                                                      break L11;
                                                    } else {
                                                      if (var6_int == 11) {
                                                        break L10;
                                                      } else {
                                                        if (var6_int == 10) {
                                                          break L9;
                                                        } else {
                                                          if (16 == var6_int) {
                                                            if (var7 == 0) {
                                                              break L8;
                                                            }
                                                          }
                                                          if (var6_int == 17) {
                                                            break L7;
                                                          } else {
                                                            if (var6_int == 18) {
                                                              break L6;
                                                            } else {
                                                              break L2;
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
                                          if (!fh.c(-100)) {
                                            ai.requestedScreenId = 2;
                                            if (var7 == 0) {
                                              break L2;
                                            }
                                          }
                                          ai.requestedScreenId = 8;
                                          if (var7 == 0) {
                                            break L2;
                                          }
                                        }
                                        ai.requestedScreenId = 3;
                                        if (var7 == 0) {
                                          break L2;
                                        }
                                      }
                                      if (vl.field_n == null) {
                                        this.field_C = true;
                                      }
                                      if (!em.b(255)) {
                                        if (og.field_n > 0) {
                                          if (sa.a(MenuScreen.field_i, (byte) 37)) {
                                            f.i((byte) -128);
                                          }
                                        }
                                      }
                                      this.field_o = 0;
                                      this.pointerInteractionActive = false;
                                      this.activeTicks = 0;
                                      if (var7 == 0) {
                                        break L2;
                                      }
                                    }
                                    vl.field_p = 0;
                                    ug.field_c = 0;
                                    ra.field_d = -2147483648;
                                  }
                                  if (2 != this.screenId) {
                                    if (this.screenId != 4) {
                                      if (6 != this.screenId) {
                                        if (oc.previousMenuScreenId == 1) {
                                          ai.requestedScreenId = 1;
                                          if (var7 == 0) {
                                            break L2;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  ai.requestedScreenId = 0;
                                  if (var7 == 0) {
                                    break L2;
                                  }
                                }
                                if (null != el.gameplaySession) {
                                  el.gameplaySession.submitScore((byte) -70);
                                }
                                L31: {
                                  L32: {
                                    ai.requestedScreenId = -1;
                                    if (this.screenId != 8) {
                                      if (4 == this.screenId) {
                                        if (null != el.gameplaySession) {
                                          if (el.gameplaySession.newActionCount == 0) {
                                            break L32;
                                          }
                                        }
                                      }
                                      if (this.screenId != 7) {
                                        el.gameplayReturnScreenId = 6;
                                        if (var7 == 0) {
                                          break L31;
                                        }
                                      }
                                      el.gameplayReturnScreenId = 5;
                                      if (var7 == 0) {
                                        break L31;
                                      }
                                    }
                                  }
                                  el.gameplayReturnScreenId = 2;
                                }
                                cd.gameplayOriginScreenId = this.screenId;
                                if (var7 == 0) {
                                  break L2;
                                }
                              }
                              L35: {
                                el.gameplaySession.emitPointsPopup(false);
                                el.gameplaySession.addScore((byte) 127, wa.collectUnfinishedPopupPoints(param1 ^ 25864));
                                el.gameplaySession.addScore((byte) 127, el.gameplaySession.resultBonusPoints);
                                el.gameplaySession.resultBonusPoints = 0;
                                if (fh.c(-114)) {
                                  L37: {
                                    if (!el.gameplaySession.tutorialMode) {
                                      if (el.gameplaySession.score == 0) {
                                        if (ug.field_c == 0) {
                                          break L37;
                                        }
                                      }
                                    }
                                    if (el.gameplaySession.tutorialMode) {
                                      if (el.gameplaySession.updateTick < 750) {
                                        break L37;
                                      }
                                    }
                                    if (0 == el.gameplaySession.score) {
                                      if (0 == ug.field_c) {
                                        ai.requestedScreenId = 0;
                                        if (var7 == 0) {
                                          break L35;
                                        }
                                      }
                                    }
                                    ai.requestedScreenId = 4;
                                    if (var7 == 0) {
                                      break L35;
                                    }
                                  }
                                  ai.requestedScreenId = 0;
                                  if (var7 == 0) {
                                    break L35;
                                  }
                                }
                                if (el.gameplaySession.score == 0) {
                                  if (ug.field_c == 0) {
                                    ai.requestedScreenId = 0;
                                    if (var7 == 0) {
                                      break L35;
                                    }
                                  }
                                }
                                el.gameplaySession.submitScore((byte) -70);
                                if (0 < el.gameplaySession.newActionCount) {
                                  ai.requestedScreenId = 6;
                                  if (var7 == 0) {
                                    break L35;
                                  }
                                }
                                ai.requestedScreenId = 2;
                              }
                              fi.a(param1 + 2, ll.field_d);
                              if (var7 == 0) {
                                break L2;
                              }
                            }
                            gf.a(k.c(param1 ^ -125), 62);
                            if (var7 == 0) {
                              break L2;
                            }
                          }
                          L43: {
                            if (this.field_q < 4) {
                              if (!this.field_E) {
                                break L43;
                              }
                            }
                            var4 = 1;
                            if (var7 == 0) {
                              break L2;
                            }
                          }
                          this.field_n = this.field_q;
                          this.field_q = this.field_q + 1;
                          this.field_v = true;
                          this.field_E = true;
                          if (var7 == 0) {
                            break L2;
                          }
                        }
                        L45: {
                          if (this.field_q > 0) {
                            if (!this.field_E) {
                              break L45;
                            }
                          }
                          var4 = 1;
                          if (var7 == 0) {
                            break L2;
                          }
                        }
                        this.field_n = this.field_q;
                        this.field_E = true;
                        this.field_q = this.field_q - 1;
                        this.field_v = false;
                        if (var7 == 0) {
                          break L2;
                        }
                      }
                      if (fh.c(-112)) {
                        ai.requestedScreenId = 7;
                        if (var7 == 0) {
                          break L2;
                        }
                      }
                      ai.requestedScreenId = 5;
                      if (var7 == 0) {
                        break L2;
                      }
                    }
                    da.field_c = 0;
                    if (var7 == 0) {
                      break L2;
                    }
                  }
                  da.field_c = 1;
                  if (var7 == 0) {
                    break L2;
                  }
                }
                da.field_c = 2;
                break L2;
              }
              L48: {
                if (var3_int == 0) {
                  if (fh.c(param1 ^ 107)) {
                    if (kc.field_c == 0) {
                      var3_int = 1;
                      if (var7 == 0) {
                        break L48;
                      }
                    }
                  }
                  if (ca.field_f != null) {
                    if (ca.field_f.field_j) {
                      if (ca.field_f.field_k != null) {
                        var6 = ca.field_f.field_k[1];
                        if (var6[0] != null) {
                          stackIn_105_0 = 0;
                        } else {
                          stackIn_105_0 = 1;
                        }
                        var3_int = stackIn_105_0;
                      }
                    }
                  }
                }
              }
              kc.field_c = kc.field_c + 1;
              pg.a(param1 ^ -9410);
              el.gameplaySession = new GameplaySession(this.gameApplet, var3_int != 0);
              le.a((byte) -39);
              ai.requestedScreenId = -1;
            }
            if (var4 == 0) {
              this.field_H = true;
              a.field_e = -1;
            }
            L52: {
              if (~this.screenId != ~ai.requestedScreenId) {
                if (this.screenId != 1) {
                  if (this.screenId != 0) {
                    break L52;
                  }
                }
                oc.previousMenuScreenId = this.screenId;
              }
            }
            decompiledRegionSelector0 = 1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var3), "c.L(" + itemIndex + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void increaseMenuValue(byte param0, int itemIndex) {
        RuntimeException runtimeException = null;
        int actionId = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Geoblox.field_C;
        try {
          L1: {
            actionId = t.menuActionIds[this.screenId][itemIndex];
            if (actionId == 8) {
              if (j.field_gb >= 70) {
                j.field_gb = 80;
                if (var4 == 0) {
                  break L1;
                }
              }
              j.field_gb = j.field_gb + 10;
              if (var4 == 0) {
                break L1;
              }
            } else {
              if (9 != actionId) {
                break L1;
              }
            }
            if (oc.field_c >= 70) {
              wg.a(-15346, 80);
              if (var4 == 0) {
                break L1;
              }
            }
            wg.a(-15346, 10 + oc.field_c);
          }
          if (param0 != 90) {
            this.activeTicks = 120;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw t.a((Throwable) ((Object) runtimeException), "c.V(" + param0 + ',' + itemIndex + ')');
        }
    }

    final void renderMenuItem(boolean selected, byte param1, int itemIndex, int rowY) {
        int stackIn_7_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        int stackIn_99_0 = 0;
        int stackIn_99_1 = 0;
        int stackIn_99_2 = 0;
        int stackIn_153_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int actionId = 0;
        String var7 = null;
        nc var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        var14 = Geoblox.field_C;
        try {
          L0: {
            if (param1 < -74) {
              if (this.field_S) {
                stackIn_7_0 = this.field_n;
              } else {
                stackIn_7_0 = this.field_q;
              }
              L2: {
                var5_int = stackIn_7_0;
                if (3 == this.screenId) {
                  L3: {
                    if (itemIndex == 0) {
                      if (var5_int == 0) {
                        break L3;
                      }
                    }
                    if (itemIndex != 2) {
                      break L2;
                    } else {
                      if (var5_int != 4) {
                        break L2;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
              L5: {
                actionId = t.menuActionIds[this.screenId][itemIndex];
                var7 = tl.field_f[actionId];
                if (actionId == 15) {
                  if (var5_int == 4) {
                    if (oc.previousMenuScreenId != 1) {
                      break L5;
                    }
                  }
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
              if (3 == this.screenId) {
                if (this.field_E) {
                  if (this.field_q == 4) {
                    if (oc.previousMenuScreenId != 1) {
                      if (itemIndex == 2) {
                        if (this.selectedItemIndex == 3) {
                          selected = true;
                        }
                      }
                    }
                  }
                }
              }
              L8: {
                L9: {
                  if (this.screenId != 3) {
                    if (this.screenId != 2) {
                      break L9;
                    }
                  }
                  rowY += 280;
                  if (var14 == 0) {
                    break L8;
                  }
                }
                if (this.screenId != 5) {
                  if (this.screenId != 7) {
                    if (this.screenId != 6) {
                      if (this.screenId != 4) {
                        break L8;
                      }
                    }
                  }
                }
                rowY += 295;
              }
              L12: {
                L13: {
                  var8 = dd.field_G;
                  var9 = 320;
                  var10 = 160;
                  if (0 != this.screenId) {
                    if (this.screenId != 1) {
                      break L13;
                    }
                  }
                  var11 = 322;
                  if (var14 == 0) {
                    break L12;
                  }
                }
                var11 = var8.c(var7, 400);
              }
              L15: {
                if (this.screenId != 3) {
                  if (this.screenId != 2) {
                    if (this.screenId != 6) {
                      if (this.screenId != 7) {
                        if (this.screenId != 8) {
                          if (this.screenId != 4) {
                            if (selected) {
                              var9 = var9 + this.field_T;
                              var10 = var10 + this.field_T;
                              rowY = rowY - this.field_T;
                            }
                            var10 = 320 + -(var11 - -20 >> -1545798207);
                            stackIn_98_0 = rowY;

                            stackIn_98_1 = var10;

                            if (!selected) {
                              stackIn_99_0 = stackIn_98_0;
                              stackIn_99_1 = stackIn_98_1;
                              stackIn_99_2 = 0;
                            } else {
                              stackIn_99_0 = stackIn_98_0;
                              stackIn_99_1 = stackIn_98_1;
                              stackIn_99_2 = this.field_T;
                            }
                            ma.a(stackIn_99_0, stackIn_99_1 + stackIn_99_2, 36, (byte) -92, var11 + 20, eb.field_g);
                            if (var14 == 0) {
                              break L15;
                            }
                          }
                          L21: {
                            var11 = 278;
                            var10 = 320 - (var11 - -20 >> -228174143);
                            if (actionId != 13) {
                              rowY = 395;
                              if (var14 == 0) {
                                break L21;
                              }
                            }
                            rowY = 265;
                          }
                          var9 = 10 + (var11 >> 102536641) + var10;
                          if (selected) {
                            var10 = var10 + this.field_T;
                            rowY = rowY - this.field_T;
                            var9 = var9 + this.field_T;
                          }
                          ma.a(rowY, var10, 36, (byte) -92, 20 + var11, eb.field_g);
                          if (var14 == 0) {
                            break L15;
                          }
                        }
                      }
                      L24: {
                        rowY = 437;
                        if (actionId == 13) {
                          var10 = 121;
                          var9 = (var11 >> -568798911) + var10 + 10;
                          if (var14 == 0) {
                            break L24;
                          }
                        }
                        var10 = 436;
                        var9 = (var11 >> -1065471359) + var10 + 10;
                      }
                      if (selected) {
                        var9 = var9 + this.field_T;
                        rowY = rowY - this.field_T;
                        var10 = var10 + this.field_T;
                      }
                      ma.a(rowY, var10, 36, (byte) -92, var11 - -20, eb.field_g);
                      if (var14 == 0) {
                        break L15;
                      }
                    }
                  }
                }
                L27: {
                  if (this.screenId != 3) {
                    var11 = 160;
                    if (var14 == 0) {
                      break L27;
                    }
                  }
                  var11 = 123;
                }
                L29: {
                  var12 = (rowY + (-280 - this.firstItemY)) / this.itemSpacing;
                  var9 = 320 + (var11 - -20) * (var12 + -1);
                  var10 = -(var11 >> -507344063) + var9;
                  if (6 == this.screenId) {
                    var9 += 86;
                    rowY = 430;
                    var10 += 86;
                    if (var14 == 0) {
                      break L29;
                    }
                  }
                  if (this.screenId == 3) {
                    var9 = 9 + (320 + (15 + var11) * (var12 - 1));
                    rowY = 430;
                    var10 = var9 + -(var11 >> -789315295);
                    if (15 == actionId) {
                      var10 -= 138;
                      var11 = 229;
                      var9 = (var11 >> 1525654369) + var10;
                      if (var14 == 0) {
                        break L29;
                      }
                    } else {
                      break L29;
                    }
                  }
                  rowY = 380;
                  if (actionId == 5) {
                    var11 = 83;
                    var9 = 320;
                    rowY += 50;
                    var10 = var9 + -(var11 >> 761927361);
                  }
                }
                L32: {
                  if (!selected) {
                    ma.a(rowY, var10, 40, (byte) -92, var11, eb.field_g);
                    if (var14 == 0) {
                      break L32;
                    }
                  }
                  var9 = var9 + this.field_T;
                  var10 = var10 + this.field_T;
                  rowY = rowY - this.field_T;
                  ma.a(rowY, var10, 40, (byte) -92, var11, eb.field_g);
                }
                rowY += 2;
              }
              L34: {
                if (selected) {
                  dd.field_G.field_K[0][wf.field_p] = 15488514;
                  var12 = this.field_T;
                  if (var14 == 0) {
                    break L34;
                  }
                }
                var12 = 0;
              }
              L36: {
                L37: {
                  if (actionId != 8) {
                    if (9 != actionId) {
                      break L37;
                    }
                  }
                  var8.c(var7, 285 - -var12, 30 + rowY, 0, -1);
                  sd.field_y.b(var12 + 280, rowY + 15);
                  if (actionId == 8) {
                    stackIn_153_0 = j.field_gb;
                  } else {
                    stackIn_153_0 = oc.field_c;
                  }
                  var13 = stackIn_153_0;
                  var13 = var13 * (-4 + sd.field_y.field_s) / 80;
                  re.field_h.b(280 + var13 + -1 + var12, 9 + rowY);
                  if (var14 == 0) {
                    break L36;
                  }
                }
                var8.b(var7, var9, rowY + 30, 0, -1);
              }
              dd.field_G.field_K[0][wf.field_p] = 16689938;
              decompiledRegionSelector0 = 3;
            } else {
              decompiledRegionSelector0 = 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var5), "c.O(" + selected + ',' + param1 + ',' + itemIndex + ',' + rowY + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    private final void handleScreenKey(byte param0) {
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = Geoblox.field_C;
        try {
          if (param0 != 62) {
            this.field_X = -26;
          }
          if (!this.pointerInteractionActive) {
            L2: {
              L3: {
                if (!this.field_C) {
                  if (this.screenId == 0) {
                    break L3;
                  } else {
                    if (1 == this.screenId) {
                      break L3;
                    } else {
                      if (this.screenId == 4) {
                        break L3;
                      }
                    }
                  }
                }
                L5: {
                  if (ki.field_d == 96) {
                    if (this.field_C) {
                      if (this.field_o != 0) {
                        this.field_o = 0;
                        if (var3 == 0) {
                          break L5;
                        }
                      } else {
                        break L5;
                      }
                    }
                    if (0 >= this.selectedItemIndex) {
                      this.selectedItemIndex = this.itemCount;
                    }
                    this.selectedItemIndex = this.selectedItemIndex - 1;
                    this.keyboardSelectionActive = true;
                    this.f((byte) 89);
                    if (var3 == 0) {
                      break L5;
                    }
                  }
                  if (ki.field_d != 97) {
                    if (ki.field_d == 98) {
                      if (2 == this.screenId) {
                        if (this.selectedItemIndex < 0) {
                          this.selectedItemIndex = 3;
                          if (var3 == 0) {
                            break L5;
                          }
                        }
                        if (5 != t.menuActionIds[this.screenId][this.selectedItemIndex]) {
                          break L5;
                        } else {
                          this.selectedItemIndex = 1;
                          if (var3 == 0) {
                            break L5;
                          }
                        }
                      }
                    }
                    if (ki.field_d != 99) {
                      break L5;
                    } else {
                      if (this.screenId == 2) {
                        if (this.selectedItemIndex < 0) {
                          this.selectedItemIndex = 1;
                          if (var3 == 0) {
                            break L5;
                          }
                        }
                        if (t.menuActionIds[this.screenId][this.selectedItemIndex] == 5) {
                          break L5;
                        } else {
                          this.selectedItemIndex = 3;
                          if (var3 == 0) {
                            break L5;
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (this.field_C) {
                    if (this.field_o == 1) {
                      break L5;
                    } else {
                      if (!fh.c(-122)) {
                        if (og.field_n <= 0) {
                          break L5;
                        }
                      }
                      this.field_o = 1;
                      if (var3 == 0) {
                        break L5;
                      }
                    }
                  }
                  this.selectedItemIndex = this.selectedItemIndex + 1;
                  this.keyboardSelectionActive = true;
                  if (this.itemCount <= this.selectedItemIndex) {
                    this.selectedItemIndex = 0;
                  }
                  this.c((byte) -117);
                }
                if (0 > this.selectedItemIndex) {
                  break L2;
                } else {
                  this.handleMenuKey(this.selectedItemIndex, -49);
                  if (var3 == 0) {
                    break L2;
                  }
                }
              }
              if (ki.field_d == 98) {
                if (0 >= this.selectedItemIndex) {
                  this.selectedItemIndex = this.itemCount;
                }
                this.selectedItemIndex = this.selectedItemIndex - 1;
                this.keyboardSelectionActive = true;
                this.f((byte) 89);
                if (var3 == 0) {
                  break L2;
                }
              }
              if (ki.field_d == 99) {
                this.selectedItemIndex = this.selectedItemIndex + 1;
                if (this.selectedItemIndex >= this.itemCount) {
                  this.selectedItemIndex = 0;
                }
                this.keyboardSelectionActive = true;
                this.c((byte) -107);
                if (var3 == 0) {
                  break L2;
                }
              }
              if (0 <= this.selectedItemIndex) {
                this.handleMenuKey(this.selectedItemIndex, -29);
              }
            }
            L20: {
              if (ki.field_d == 69) {
                if (this.screenId == 3) {
                  if (this.field_q < 4) {
                    this.field_q = this.field_q + 1;
                    if (var3 == 0) {
                      break L20;
                    }
                  }
                }
              }
              if (ki.field_d == 41) {
                if (this.screenId == 3) {
                  if (this.field_q > 0) {
                    this.field_q = this.field_q - 1;
                    if (var3 == 0) {
                      break L20;
                    }
                  }
                }
              }
              if (13 == ki.field_d) {
                if (!this.field_C) {
                  if (4 != this.screenId) {
                    L23: {
                      if (this.screenId == 1) {
                        ai.requestedScreenId = -1;
                        if (var3 == 0) {
                          break L23;
                        }
                      }
                      if (this.screenId != 6) {
                        if (this.screenId != 2) {
                          ai.requestedScreenId = oc.previousMenuScreenId;
                          if (var3 == 0) {
                            break L23;
                          }
                        }
                      }
                      ai.requestedScreenId = 0;
                    }
                    if (~this.screenId != ~ai.requestedScreenId) {
                      if (this.screenId != 1) {
                        if (this.screenId != 0) {
                          break L20;
                        }
                      }
                      oc.previousMenuScreenId = this.screenId;
                    }
                  }
                }
              }
            }
            decompiledRegionSelector0 = 1;
          } else {
            decompiledRegionSelector0 = 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "c.D(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        quickChatShortcutHelpTexts = new String[]{"Move back to the previous menu level.", "Return to the top level of the menu.", "Auto-respond to the last thing in your chat window.", "Open the Quick Chat menu.", "Repeat the last thing you said.", "Close the Quick Chat menu."};
        selectedThemeId = 0;
        createNameLeadingSpaceAlertText = "Names cannot start or end with space or underscore";
    }
}
