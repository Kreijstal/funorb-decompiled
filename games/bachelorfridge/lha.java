/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lha {
    int field_a;
    int field_c;
    float field_d;
    float field_f;
    static po field_b;
    boolean field_e;
    int field_g;

    final static boolean b(int param0) {
        int stackIn_32_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_68_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_84_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_92_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_112_0 = 0;
        int var1;
        int var2;
        int var3;
        L0: {
          var3 = BachelorFridge.field_y;
          var1 = 1;
          var2 = kca.field_a;
          if (0 == var2) {
            L1: {
              wc.field_p = kia.a(oaa.field_b, "", "bf_titlescreen_version2");
              if (wc.field_p == null) {
                stackIn_32_0 = 0;
                break L1;
              } else {
                stackIn_32_0 = 1;
                break L1;
              }
            }
            var1 = stackIn_32_0;
            break L0;
          } else {
            if (-2 == (var2 ^ -1)) {
              L2: {
                jga.field_z = kia.a(oaa.field_b, "", "bf_shopping_screen");
                if (null == jga.field_z) {
                  stackIn_36_0 = 0;
                  break L2;
                } else {
                  stackIn_36_0 = 1;
                  break L2;
                }
              }
              var1 = stackIn_36_0;
              break L0;
            } else {
              if ((var2 ^ -1) != -3) {
                if (var2 == 3) {
                  L3: {
                    pm.field_z = kia.a(oaa.field_b, "", "bf_main_view2");
                    if (pm.field_z == null) {
                      stackIn_44_0 = 0;
                      break L3;
                    } else {
                      stackIn_44_0 = 1;
                      break L3;
                    }
                  }
                  var1 = stackIn_44_0;
                  break L0;
                } else {
                  if (var2 != 4) {
                    if (5 == var2) {
                      L4: {
                        wba.field_e[1] = kia.a(oaa.field_b, "", "bf_new_battle3");
                        if (null == wba.field_e[1]) {
                          stackIn_52_0 = 0;
                          break L4;
                        } else {
                          stackIn_52_0 = 1;
                          break L4;
                        }
                      }
                      var1 = stackIn_52_0;
                      break L0;
                    } else {
                      if (-7 == (var2 ^ -1)) {
                        L5: {
                          wba.field_e[2] = kia.a(oaa.field_b, "", "bf_new_battle2");
                          if (wba.field_e[2] == null) {
                            stackIn_56_0 = 0;
                            break L5;
                          } else {
                            stackIn_56_0 = 1;
                            break L5;
                          }
                        }
                        var1 = stackIn_56_0;
                        break L0;
                      } else {
                        if (var2 == 7) {
                          L6: {
                            iq.field_m = kia.a(oaa.field_b, "", "bf_competition_arena_intro_jingle");
                            if (null == iq.field_m) {
                              stackIn_60_0 = 0;
                              break L6;
                            } else {
                              stackIn_60_0 = 1;
                              break L6;
                            }
                          }
                          var1 = stackIn_60_0;
                          break L0;
                        } else {
                          if (-9 == (var2 ^ -1)) {
                            L7: {
                              nu.field_h = kia.a(oaa.field_b, "", "bf_competition_lose_jingle");
                              if (null == nu.field_h) {
                                stackIn_64_0 = 0;
                                break L7;
                              } else {
                                stackIn_64_0 = 1;
                                break L7;
                              }
                            }
                            var1 = stackIn_64_0;
                            break L0;
                          } else {
                            if (var2 != 9) {
                              if (-11 != (var2 ^ -1)) {
                                if (var2 == 11) {
                                  L8: {
                                    if (!uf.field_c.a(db.field_a, wc.field_p, ai.field_d, (byte) -98, 22050)) {
                                      stackIn_76_0 = 0;
                                      break L8;
                                    } else {
                                      stackIn_76_0 = 1;
                                      break L8;
                                    }
                                  }
                                  var1 = stackIn_76_0;
                                  break L0;
                                } else {
                                  if (var2 != 12) {
                                    if (-14 == (var2 ^ -1)) {
                                      L9: {
                                        if (!uf.field_c.a(db.field_a, eda.field_i, ai.field_d, (byte) -13, 22050)) {
                                          stackIn_84_0 = 0;
                                          break L9;
                                        } else {
                                          stackIn_84_0 = 1;
                                          break L9;
                                        }
                                      }
                                      var1 = stackIn_84_0;
                                      break L0;
                                    } else {
                                      if (14 == var2) {
                                        L10: {
                                          if (!uf.field_c.a(db.field_a, pm.field_z, ai.field_d, (byte) 103, 22050)) {
                                            stackIn_88_0 = 0;
                                            break L10;
                                          } else {
                                            stackIn_88_0 = 1;
                                            break L10;
                                          }
                                        }
                                        var1 = stackIn_88_0;
                                        break L0;
                                      } else {
                                        if (15 == var2) {
                                          L11: {
                                            if (!uf.field_c.a(db.field_a, wba.field_e[0], ai.field_d, (byte) 107, 22050)) {
                                              stackIn_92_0 = 0;
                                              break L11;
                                            } else {
                                              stackIn_92_0 = 1;
                                              break L11;
                                            }
                                          }
                                          var1 = stackIn_92_0;
                                          break L0;
                                        } else {
                                          if ((var2 ^ -1) == -17) {
                                            L12: {
                                              if (!uf.field_c.a(db.field_a, wba.field_e[1], ai.field_d, (byte) -91, 22050)) {
                                                stackIn_96_0 = 0;
                                                break L12;
                                              } else {
                                                stackIn_96_0 = 1;
                                                break L12;
                                              }
                                            }
                                            var1 = stackIn_96_0;
                                            break L0;
                                          } else {
                                            if (17 == var2) {
                                              L13: {
                                                if (!uf.field_c.a(db.field_a, wba.field_e[2], ai.field_d, (byte) 116, 22050)) {
                                                  stackIn_100_0 = 0;
                                                  break L13;
                                                } else {
                                                  stackIn_100_0 = 1;
                                                  break L13;
                                                }
                                              }
                                              var1 = stackIn_100_0;
                                              break L0;
                                            } else {
                                              if (18 != var2) {
                                                if ((var2 ^ -1) != -20) {
                                                  if (20 == var2) {
                                                    L14: {
                                                      if (!uf.field_c.a(db.field_a, mu.field_d, ai.field_d, (byte) -102, 22050)) {
                                                        stackIn_112_0 = 0;
                                                        break L14;
                                                      } else {
                                                        stackIn_112_0 = 1;
                                                        break L14;
                                                      }
                                                    }
                                                    var1 = stackIn_112_0;
                                                    break L0;
                                                  } else {
                                                    uf.field_c.b(-5359);
                                                    return true;
                                                  }
                                                } else {
                                                  L15: {
                                                    if (!uf.field_c.a(db.field_a, nu.field_h, ai.field_d, (byte) -89, 22050)) {
                                                      stackIn_108_0 = 0;
                                                      break L15;
                                                    } else {
                                                      stackIn_108_0 = 1;
                                                      break L15;
                                                    }
                                                  }
                                                  var1 = stackIn_108_0;
                                                  break L0;
                                                }
                                              } else {
                                                L16: {
                                                  if (!uf.field_c.a(db.field_a, iq.field_m, ai.field_d, (byte) 118, 22050)) {
                                                    stackIn_104_0 = 0;
                                                    break L16;
                                                  } else {
                                                    stackIn_104_0 = 1;
                                                    break L16;
                                                  }
                                                }
                                                var1 = stackIn_104_0;
                                                break L0;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  } else {
                                    L17: {
                                      if (!uf.field_c.a(db.field_a, jga.field_z, ai.field_d, (byte) -26, 22050)) {
                                        stackIn_80_0 = 0;
                                        break L17;
                                      } else {
                                        stackIn_80_0 = 1;
                                        break L17;
                                      }
                                    }
                                    var1 = stackIn_80_0;
                                    break L0;
                                  }
                                }
                              } else {
                                L18: {
                                  rba.field_c = kia.a(oaa.field_b, "", "bf_combat_arena");
                                  if (null == rba.field_c) {
                                    stackIn_72_0 = 0;
                                    break L18;
                                  } else {
                                    stackIn_72_0 = 1;
                                    break L18;
                                  }
                                }
                                var1 = stackIn_72_0;
                                break L0;
                              }
                            } else {
                              L19: {
                                mu.field_d = kia.a(oaa.field_b, "", "bf_competition_victory_jingle");
                                if (null == mu.field_d) {
                                  stackIn_68_0 = 0;
                                  break L19;
                                } else {
                                  stackIn_68_0 = 1;
                                  break L19;
                                }
                              }
                              var1 = stackIn_68_0;
                              break L0;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    L20: {
                      wba.field_e[0] = kia.a(oaa.field_b, "", "bf_new_battle1");
                      if (wba.field_e[0] == null) {
                        stackIn_48_0 = 0;
                        break L20;
                      } else {
                        stackIn_48_0 = 1;
                        break L20;
                      }
                    }
                    var1 = stackIn_48_0;
                    break L0;
                  }
                }
              } else {
                L21: {
                  eda.field_i = kia.a(oaa.field_b, "", "bf_main_view1");
                  if (eda.field_i == null) {
                    stackIn_40_0 = 0;
                    break L21;
                  } else {
                    stackIn_40_0 = 1;
                    break L21;
                  }
                }
                var1 = stackIn_40_0;
                break L0;
              }
            }
          }
        }
        L22: {
          if (param0 > 12) {
            break L22;
          } else {
            field_b = (po) null;
            break L22;
          }
        }
        if (var1 != 0) {
          kca.field_a = kca.field_a + 1;
          return false;
        } else {
          return false;
        }
    }

    final void a(boolean param0) {
        if (!param0) {
            this.field_c = -117;
        }
        dc.field_y[this.field_g].e((int)this.field_f + -12, -12 + (int)this.field_d);
    }

    private final boolean a(float param0, float param1, byte param2) {
        if (param2 > -79) {
            lha.b(-39);
        }
        return 2.0f > Math.abs(-param1 + param0) ? true : false;
    }

    final static int a(byte param0) {
        if (param0 >= -47) {
            lha.a(-54);
        }
        return fga.field_f;
    }

    lha(int param0, int param1, int param2) {
        this.field_f = (float)param0;
        this.field_d = (float)param1;
        this.field_g = param2;
        qm.a(4, 7758);
    }

    final static void b(byte param0) {
        if (0 < eb.field_t) {
            eb.field_t = eb.field_t - 1;
        }
        if (hga.field_U.field_f != pda.field_p) {
            fs.field_f = fs.field_f + (hga.field_U.field_f + -pda.field_p);
            pda.field_p = hga.field_U.field_f;
        }
        if (param0 <= 59) {
            field_b = (po) null;
        }
        if (!((eb.field_t ^ -1) >= -1)) {
            iv.b(false);
        }
    }

    public static void a(int param0) {
        if (param0 != 1) {
            field_b = (po) null;
        }
        field_b = null;
    }

    final void c(byte param0) {
        L0: {
          if (this.field_e) {
            this.field_d = this.field_d + (-this.field_d + (float)this.field_a) * 0.1599999964237213f;
            this.field_f = this.field_f + ((float)this.field_c - this.field_f) * 0.1599999964237213f;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 50) {
          return;
        } else {
          L1: {
            if (!this.a(this.field_f, (float)this.field_c, (byte) -103)) {
              break L1;
            } else {
              if (this.a(this.field_d, (float)this.field_a, (byte) -98)) {
                this.field_e = false;
                break L1;
              } else {
                break L1;
              }
            }
          }
          return;
        }
    }

    final static void a(String param0, java.awt.Color param1, int param2, boolean param3, int param4) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var9 = dca.field_y.getGraphics();
                  if (null == tb.field_b) {
                    tb.field_b = new java.awt.Font("Helvetica", 1, 13);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param3) {
                    var9.setColor(java.awt.Color.black);
                    var9.fillRect(0, 0, dda.field_j, nn.field_b);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param1 != null) {
                    break L4;
                  } else {
                    param1 = new java.awt.Color(140, 17, 17);
                    break L4;
                  }
                }
                try {
                  L5: {
                    L6: {
                      if (null != et.field_m) {
                        break L6;
                      } else {
                        et.field_m = dca.field_y.createImage(304, 34);
                        break L6;
                      }
                    }
                    var10 = et.field_m.getGraphics();
                    var10.setColor(param1);
                    var10.drawRect(0, 0, 303, 33);
                    var10.fillRect(2, 2, 3 * param2, 30);
                    var10.setColor(java.awt.Color.black);
                    var10.drawRect(1, 1, 301, 31);
                    var10.fillRect(2 + 3 * param2, 2, -(param4 * param2) + 300, 30);
                    var10.setFont(tb.field_b);
                    var10.setColor(java.awt.Color.white);
                    var10.drawString(param0, (304 + -(6 * param0.length())) / 2, 22);
                    var9.drawImage(et.field_m, dda.field_j / 2 - 152, -18 + nn.field_b / 2, (java.awt.image.ImageObserver) null);
                    break L5;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L7: {
                    var6 = (Exception) (Object) decompiledCaughtException;
                    var7 = -152 + dda.field_j / 2;
                    var8 = nn.field_b / 2 + -18;
                    var9.setColor(param1);
                    var9.drawRect(var7, var8, 303, 33);
                    var9.fillRect(2 + var7, var8 - -2, 3 * param2, 30);
                    var9.setColor(java.awt.Color.black);
                    var9.drawRect(var7 + 1, 1 + var8, 301, 31);
                    var9.fillRect(3 * param2 + var7 + 2, 2 + var8, -(3 * param2) + 300, 30);
                    var9.setFont(tb.field_b);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(param0, var7 - -((-(param0.length() * 6) + 304) / 2), var8 + 22);
                    break L7;
                  }
                }
                L8: {
                  if (ina.field_r == null) {
                    break L8;
                  } else {
                    var9.setFont(tb.field_b);
                    var9.setColor(java.awt.Color.white);
                    var9.drawString(ina.field_r, dda.field_j / 2 - 6 * ina.field_r.length() / 2, -26 + nn.field_b / 2);
                    break L8;
                  }
                }
                break L1;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L9: {
                var5 = (Exception) (Object) decompiledCaughtException;
                dca.field_y.repaint();
                break L9;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L10: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = (RuntimeException) (var5_ref);

            stackIn_20_1 = new StringBuilder().append("lha.I(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L10;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L11;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L11;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_21_0), stackIn_24_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            RuntimeException stackIn_8_0 = null;
            StringBuilder stackIn_8_1 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            String stackIn_9_2 = null;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            try {
              L0: {
                try {
                  L1: {
                    var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                    param0.getAppletContext().showDocument(ow.a(var2, (byte) -91, param0), "_top");
                    break L1;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L2: {
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var2_ref.printStackTrace();
                    break L2;
                  }
                }
                L3: {
                  if (param1 == -17672) {
                    break L3;
                  } else {
                    lha.a(-63);
                    break L3;
                  }
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_8_0 = (RuntimeException) (var2_ref2);

                stackIn_8_1 = new StringBuilder().append("lha.E(");

                if (param0 == null) {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "null";
                  break L4;
                } else {
                  stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
                  stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
                  stackIn_9_2 = "{...}";
                  break L4;
                }
              }
              throw pe.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
    }
}
