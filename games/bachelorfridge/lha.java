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
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
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
        int stackOut_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_86_0 = 0;
        int stackOut_91_0 = 0;
        int stackOut_90_0 = 0;
        int stackOut_95_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_111_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_102_0 = 0;
        int stackOut_79_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_66_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_38_0 = 0;
        L0: {
          var3 = BachelorFridge.field_y;
          var1 = 1;
          var2 = kca.field_a;
          if (0 == var2) {
            L1: {
              wc.field_p = kia.a(oaa.field_b, "", "bf_titlescreen_version2");
              if (wc.field_p == null) {
                stackOut_31_0 = 0;
                stackIn_32_0 = stackOut_31_0;
                break L1;
              } else {
                stackOut_30_0 = 1;
                stackIn_32_0 = stackOut_30_0;
                break L1;
              }
            }
            var1 = stackIn_32_0;
            break L0;
          } else {
            if (var2 == 1) {
              L2: {
                jga.field_z = kia.a(oaa.field_b, "", "bf_shopping_screen");
                if (null == jga.field_z) {
                  stackOut_35_0 = 0;
                  stackIn_36_0 = stackOut_35_0;
                  break L2;
                } else {
                  stackOut_34_0 = 1;
                  stackIn_36_0 = stackOut_34_0;
                  break L2;
                }
              }
              var1 = stackIn_36_0;
              break L0;
            } else {
              if (var2 != 2) {
                if (var2 == 3) {
                  L3: {
                    pm.field_z = kia.a(oaa.field_b, "", "bf_main_view2");
                    if (pm.field_z == null) {
                      stackOut_43_0 = 0;
                      stackIn_44_0 = stackOut_43_0;
                      break L3;
                    } else {
                      stackOut_42_0 = 1;
                      stackIn_44_0 = stackOut_42_0;
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
                          stackOut_51_0 = 0;
                          stackIn_52_0 = stackOut_51_0;
                          break L4;
                        } else {
                          stackOut_50_0 = 1;
                          stackIn_52_0 = stackOut_50_0;
                          break L4;
                        }
                      }
                      var1 = stackIn_52_0;
                      break L0;
                    } else {
                      if (var2 == 6) {
                        L5: {
                          wba.field_e[2] = kia.a(oaa.field_b, "", "bf_new_battle2");
                          if (wba.field_e[2] == null) {
                            stackOut_55_0 = 0;
                            stackIn_56_0 = stackOut_55_0;
                            break L5;
                          } else {
                            stackOut_54_0 = 1;
                            stackIn_56_0 = stackOut_54_0;
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
                              stackOut_59_0 = 0;
                              stackIn_60_0 = stackOut_59_0;
                              break L6;
                            } else {
                              stackOut_58_0 = 1;
                              stackIn_60_0 = stackOut_58_0;
                              break L6;
                            }
                          }
                          var1 = stackIn_60_0;
                          break L0;
                        } else {
                          if (var2 == 8) {
                            L7: {
                              nu.field_h = kia.a(oaa.field_b, "", "bf_competition_lose_jingle");
                              if (null == nu.field_h) {
                                stackOut_63_0 = 0;
                                stackIn_64_0 = stackOut_63_0;
                                break L7;
                              } else {
                                stackOut_62_0 = 1;
                                stackIn_64_0 = stackOut_62_0;
                                break L7;
                              }
                            }
                            var1 = stackIn_64_0;
                            break L0;
                          } else {
                            if (var2 != 9) {
                              if (var2 != 10) {
                                if (var2 == 11) {
                                  L8: {
                                    if (!uf.field_c.a(db.field_a, wc.field_p, ai.field_d, (byte) -98, 22050)) {
                                      stackOut_75_0 = 0;
                                      stackIn_76_0 = stackOut_75_0;
                                      break L8;
                                    } else {
                                      stackOut_74_0 = 1;
                                      stackIn_76_0 = stackOut_74_0;
                                      break L8;
                                    }
                                  }
                                  var1 = stackIn_76_0;
                                  break L0;
                                } else {
                                  if (var2 != 12) {
                                    if (var2 == 13) {
                                      L9: {
                                        if (!uf.field_c.a(db.field_a, eda.field_i, ai.field_d, (byte) -13, 22050)) {
                                          stackOut_83_0 = 0;
                                          stackIn_84_0 = stackOut_83_0;
                                          break L9;
                                        } else {
                                          stackOut_82_0 = 1;
                                          stackIn_84_0 = stackOut_82_0;
                                          break L9;
                                        }
                                      }
                                      var1 = stackIn_84_0;
                                      break L0;
                                    } else {
                                      if (14 == var2) {
                                        L10: {
                                          if (!uf.field_c.a(db.field_a, pm.field_z, ai.field_d, (byte) 103, 22050)) {
                                            stackOut_87_0 = 0;
                                            stackIn_88_0 = stackOut_87_0;
                                            break L10;
                                          } else {
                                            stackOut_86_0 = 1;
                                            stackIn_88_0 = stackOut_86_0;
                                            break L10;
                                          }
                                        }
                                        var1 = stackIn_88_0;
                                        break L0;
                                      } else {
                                        if (15 == var2) {
                                          L11: {
                                            if (!uf.field_c.a(db.field_a, wba.field_e[0], ai.field_d, (byte) 107, 22050)) {
                                              stackOut_91_0 = 0;
                                              stackIn_92_0 = stackOut_91_0;
                                              break L11;
                                            } else {
                                              stackOut_90_0 = 1;
                                              stackIn_92_0 = stackOut_90_0;
                                              break L11;
                                            }
                                          }
                                          var1 = stackIn_92_0;
                                          break L0;
                                        } else {
                                          if (var2 == 16) {
                                            L12: {
                                              if (!uf.field_c.a(db.field_a, wba.field_e[1], ai.field_d, (byte) -91, 22050)) {
                                                stackOut_95_0 = 0;
                                                stackIn_96_0 = stackOut_95_0;
                                                break L12;
                                              } else {
                                                stackOut_94_0 = 1;
                                                stackIn_96_0 = stackOut_94_0;
                                                break L12;
                                              }
                                            }
                                            var1 = stackIn_96_0;
                                            break L0;
                                          } else {
                                            if (17 == var2) {
                                              L13: {
                                                if (!uf.field_c.a(db.field_a, wba.field_e[2], ai.field_d, (byte) 116, 22050)) {
                                                  stackOut_99_0 = 0;
                                                  stackIn_100_0 = stackOut_99_0;
                                                  break L13;
                                                } else {
                                                  stackOut_98_0 = 1;
                                                  stackIn_100_0 = stackOut_98_0;
                                                  break L13;
                                                }
                                              }
                                              var1 = stackIn_100_0;
                                              break L0;
                                            } else {
                                              if (18 != var2) {
                                                if (var2 != 19) {
                                                  if (20 == var2) {
                                                    L14: {
                                                      if (!uf.field_c.a(db.field_a, mu.field_d, ai.field_d, (byte) -102, 22050)) {
                                                        stackOut_111_0 = 0;
                                                        stackIn_112_0 = stackOut_111_0;
                                                        break L14;
                                                      } else {
                                                        stackOut_110_0 = 1;
                                                        stackIn_112_0 = stackOut_110_0;
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
                                                      stackOut_107_0 = 0;
                                                      stackIn_108_0 = stackOut_107_0;
                                                      break L15;
                                                    } else {
                                                      stackOut_106_0 = 1;
                                                      stackIn_108_0 = stackOut_106_0;
                                                      break L15;
                                                    }
                                                  }
                                                  var1 = stackIn_108_0;
                                                  break L0;
                                                }
                                              } else {
                                                L16: {
                                                  if (!uf.field_c.a(db.field_a, iq.field_m, ai.field_d, (byte) 118, 22050)) {
                                                    stackOut_103_0 = 0;
                                                    stackIn_104_0 = stackOut_103_0;
                                                    break L16;
                                                  } else {
                                                    stackOut_102_0 = 1;
                                                    stackIn_104_0 = stackOut_102_0;
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
                                        stackOut_79_0 = 0;
                                        stackIn_80_0 = stackOut_79_0;
                                        break L17;
                                      } else {
                                        stackOut_78_0 = 1;
                                        stackIn_80_0 = stackOut_78_0;
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
                                    stackOut_71_0 = 0;
                                    stackIn_72_0 = stackOut_71_0;
                                    break L18;
                                  } else {
                                    stackOut_70_0 = 1;
                                    stackIn_72_0 = stackOut_70_0;
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
                                  stackOut_67_0 = 0;
                                  stackIn_68_0 = stackOut_67_0;
                                  break L19;
                                } else {
                                  stackOut_66_0 = 1;
                                  stackIn_68_0 = stackOut_66_0;
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
                        stackOut_47_0 = 0;
                        stackIn_48_0 = stackOut_47_0;
                        break L20;
                      } else {
                        stackOut_46_0 = 1;
                        stackIn_48_0 = stackOut_46_0;
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
                    stackOut_39_0 = 0;
                    stackIn_40_0 = stackOut_39_0;
                    break L21;
                  } else {
                    stackOut_38_0 = 1;
                    stackIn_40_0 = stackOut_38_0;
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
            field_b = null;
            break L22;
          }
        }
        if (var1 == 0) {
          return false;
        } else {
          kca.field_a = kca.field_a + 1;
          return false;
        }
    }

    final void a(boolean param0) {
        if (!param0) {
            ((lha) this).field_c = -117;
        }
        dc.field_y[((lha) this).field_g].e((int)((lha) this).field_f + -12, -12 + (int)((lha) this).field_d);
    }

    private final boolean a(float param0, float param1, byte param2) {
        if (param2 > -79) {
            boolean discarded$0 = lha.b(-39);
        }
        return 2.0f > Math.abs(-param1 + param0) ? true : false;
    }

    final static int a(byte param0) {
        return fga.field_f;
    }

    lha(int param0, int param1, int param2) {
        ((lha) this).field_f = (float)param0;
        ((lha) this).field_d = (float)param1;
        ((lha) this).field_g = param2;
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
        if (!(eb.field_t <= 0)) {
            iv.b(false);
        }
    }

    public static void a(int param0) {
        if (param0 != 1) {
            field_b = null;
        }
        field_b = null;
    }

    final void c(byte param0) {
        L0: {
          if (((lha) this).field_e) {
            ((lha) this).field_d = ((lha) this).field_d + (-((lha) this).field_d + (float)((lha) this).field_a) * 0.1599999964237213f;
            ((lha) this).field_f = ((lha) this).field_f + ((float)((lha) this).field_c - ((lha) this).field_f) * 0.1599999964237213f;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 50) {
          return;
        } else {
          L1: {
            if (!this.a(((lha) this).field_f, (float)((lha) this).field_c, (byte) -103)) {
              break L1;
            } else {
              if (this.a(((lha) this).field_d, (float)((lha) this).field_a, (byte) -98)) {
                ((lha) this).field_e = false;
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
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
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
                    var10.fillRect(2 + 3 * param2, 2, -(3 * param2) + 300, 30);
                    var10.setFont(tb.field_b);
                    var10.setColor(java.awt.Color.white);
                    var10.drawString(param0, (304 + -(6 * param0.length())) / 2, 22);
                    boolean discarded$1 = var9.drawImage(et.field_m, dda.field_j / 2 - 152, -18 + nn.field_b / 2, (java.awt.image.ImageObserver) null);
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
            stackOut_18_0 = (RuntimeException) var5_ref;
            stackOut_18_1 = new StringBuilder().append("lha.I(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L10;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L10;
            }
          }
          L11: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L11;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L11;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 44 + param2 + 44 + param3 + 44 + 3 + 41);
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            RuntimeException var2_ref2 = null;
            RuntimeException stackIn_5_0 = null;
            StringBuilder stackIn_5_1 = null;
            RuntimeException stackIn_6_0 = null;
            StringBuilder stackIn_6_1 = null;
            RuntimeException stackIn_7_0 = null;
            StringBuilder stackIn_7_1 = null;
            String stackIn_7_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_4_0 = null;
            StringBuilder stackOut_4_1 = null;
            RuntimeException stackOut_6_0 = null;
            StringBuilder stackOut_6_1 = null;
            String stackOut_6_2 = null;
            RuntimeException stackOut_5_0 = null;
            StringBuilder stackOut_5_1 = null;
            String stackOut_5_2 = null;
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
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L3: {
                var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_4_0 = (RuntimeException) var2_ref2;
                stackOut_4_1 = new StringBuilder().append("lha.E(");
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                if (param0 == null) {
                  stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
                  stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
                  stackOut_6_2 = "null";
                  stackIn_7_0 = stackOut_6_0;
                  stackIn_7_1 = stackOut_6_1;
                  stackIn_7_2 = stackOut_6_2;
                  break L3;
                } else {
                  stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
                  stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
                  stackOut_5_2 = "{...}";
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_7_1 = stackOut_5_1;
                  stackIn_7_2 = stackOut_5_2;
                  break L3;
                }
              }
              throw pe.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + -17672 + 41);
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
