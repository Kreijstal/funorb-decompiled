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
        int var1Lifetime1;
        var3 = BachelorFridge.field_y;
        var1 = 1;
        var2 = kca.field_a;
        if (0 == var2) {
          wc.field_p = kia.a(oaa.field_b, "", "bf_titlescreen_version2");
          stackIn_32_0 = (wc.field_p == null) ? 0 : 1;
          var1Lifetime1 = stackIn_32_0;
        } else {
          if (var2 == 1) {
            jga.field_z = kia.a(oaa.field_b, "", "bf_shopping_screen");
            stackIn_36_0 = (null == jga.field_z) ? 0 : 1;
            var1Lifetime1 = stackIn_36_0;
          } else {
            if (var2 != 2) {
              if (var2 == 3) {
                pm.field_z = kia.a(oaa.field_b, "", "bf_main_view2");
                stackIn_44_0 = (pm.field_z == null) ? 0 : 1;
                var1Lifetime1 = stackIn_44_0;
              } else {
                if (var2 != 4) {
                  if (5 == var2) {
                    wba.field_e[1] = kia.a(oaa.field_b, "", "bf_new_battle3");
                    stackIn_52_0 = (null == wba.field_e[1]) ? 0 : 1;
                    var1Lifetime1 = stackIn_52_0;
                  } else {
                    if (var2 == 6) {
                      wba.field_e[2] = kia.a(oaa.field_b, "", "bf_new_battle2");
                      stackIn_56_0 = (wba.field_e[2] == null) ? 0 : 1;
                      var1Lifetime1 = stackIn_56_0;
                    } else {
                      if (var2 == 7) {
                        iq.field_m = kia.a(oaa.field_b, "", "bf_competition_arena_intro_jingle");
                        stackIn_60_0 = (null == iq.field_m) ? 0 : 1;
                        var1Lifetime1 = stackIn_60_0;
                      } else {
                        if (var2 == 8) {
                          nu.field_h = kia.a(oaa.field_b, "", "bf_competition_lose_jingle");
                          stackIn_64_0 = (null == nu.field_h) ? 0 : 1;
                          var1Lifetime1 = stackIn_64_0;
                        } else {
                          if (var2 != 9) {
                            if (var2 != 10) {
                              if (var2 == 11) {
                                stackIn_76_0 = (!uf.field_c.a(db.field_a, wc.field_p, ai.field_d, (byte) -98, 22050)) ? 0 : 1;
                                var1Lifetime1 = stackIn_76_0;
                              } else {
                                if (var2 != 12) {
                                  if (var2 == 13) {
                                    stackIn_84_0 = (!uf.field_c.a(db.field_a, eda.field_i, ai.field_d, (byte) -13, 22050)) ? 0 : 1;
                                    var1Lifetime1 = stackIn_84_0;
                                  } else {
                                    if (14 == var2) {
                                      stackIn_88_0 = (!uf.field_c.a(db.field_a, pm.field_z, ai.field_d, (byte) 103, 22050)) ? 0 : 1;
                                      var1Lifetime1 = stackIn_88_0;
                                    } else {
                                      if (15 == var2) {
                                        stackIn_92_0 = (!uf.field_c.a(db.field_a, wba.field_e[0], ai.field_d, (byte) 107, 22050)) ? 0 : 1;
                                        var1Lifetime1 = stackIn_92_0;
                                      } else {
                                        if (var2 == 16) {
                                          stackIn_96_0 = (!uf.field_c.a(db.field_a, wba.field_e[1], ai.field_d, (byte) -91, 22050)) ? 0 : 1;
                                          var1Lifetime1 = stackIn_96_0;
                                        } else {
                                          if (17 == var2) {
                                            stackIn_100_0 = (!uf.field_c.a(db.field_a, wba.field_e[2], ai.field_d, (byte) 116, 22050)) ? 0 : 1;
                                            var1Lifetime1 = stackIn_100_0;
                                          } else {
                                            if (18 != var2) {
                                              if (var2 != 19) {
                                                if (20 != var2) {
                                                  uf.field_c.b(-5359);
                                                  return true;
                                                }
                                                stackIn_112_0 = (!uf.field_c.a(db.field_a, mu.field_d, ai.field_d, (byte) -102, 22050)) ? 0 : 1;
                                                var1Lifetime1 = stackIn_112_0;
                                              } else {
                                                stackIn_108_0 = (!uf.field_c.a(db.field_a, nu.field_h, ai.field_d, (byte) -89, 22050)) ? 0 : 1;
                                                var1Lifetime1 = stackIn_108_0;
                                              }
                                            } else {
                                              stackIn_104_0 = (!uf.field_c.a(db.field_a, iq.field_m, ai.field_d, (byte) 118, 22050)) ? 0 : 1;
                                              var1Lifetime1 = stackIn_104_0;
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  stackIn_80_0 = (!uf.field_c.a(db.field_a, jga.field_z, ai.field_d, (byte) -26, 22050)) ? 0 : 1;
                                  var1Lifetime1 = stackIn_80_0;
                                }
                              }
                            } else {
                              rba.field_c = kia.a(oaa.field_b, "", "bf_combat_arena");
                              stackIn_72_0 = (null == rba.field_c) ? 0 : 1;
                              var1Lifetime1 = stackIn_72_0;
                            }
                          } else {
                            mu.field_d = kia.a(oaa.field_b, "", "bf_competition_victory_jingle");
                            stackIn_68_0 = (null == mu.field_d) ? 0 : 1;
                            var1Lifetime1 = stackIn_68_0;
                          }
                        }
                      }
                    }
                  }
                } else {
                  wba.field_e[0] = kia.a(oaa.field_b, "", "bf_new_battle1");
                  stackIn_48_0 = (wba.field_e[0] == null) ? 0 : 1;
                  var1Lifetime1 = stackIn_48_0;
                }
              }
            } else {
              eda.field_i = kia.a(oaa.field_b, "", "bf_main_view1");
              stackIn_40_0 = (eda.field_i == null) ? 0 : 1;
              var1Lifetime1 = stackIn_40_0;
            }
          }
        }
        if (param0 <= 12) {
          field_b = (po) null;
        }
        if (var1Lifetime1 == 0) {
          return false;
        }
        kca.field_a = kca.field_a + 1;
        return false;
    }

    final void a(boolean param0) {
        if (!param0) {
          this.field_c = -117;
        }
        dc.field_y[this.field_g].e((int)this.field_f - 12, -12 + (int)this.field_d);
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
          fs.field_f = fs.field_f + (hga.field_U.field_f - pda.field_p);
          pda.field_p = hga.field_U.field_f;
        }
        if (param0 <= 59) {
          field_b = (po) null;
        }
        if (!(eb.field_t <= 0)) {
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
        if (this.field_e) {
          this.field_d = this.field_d + (-this.field_d + (float)this.field_a) * 0.1599999964237213f;
          this.field_f = this.field_f + ((float)this.field_c - this.field_f) * 0.1599999964237213f;
        }
        if (param0 == 50) {
          if (this.a(this.field_f, (float)this.field_c, (byte) -103) &&
            this.a(this.field_d, (float)this.field_a, (byte) -98)) {
            this.field_e = false;
          }
          return;
        }
    }

    final static void a(String param0, java.awt.Color param1, int param2, boolean param3, int param4) {
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
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
          try {
            var9 = dca.field_y.getGraphics();
            if (null == tb.field_b) {
              tb.field_b = new java.awt.Font("Helvetica", 1, 13);
            }
            if (param3) {
              var9.setColor(java.awt.Color.black);
              var9.fillRect(0, 0, dda.field_j, nn.field_b);
            }
            if (param1 == null) {
              param1 = new java.awt.Color(140, 17, 17);
            }
            try {
              if (null == et.field_m) {
                et.field_m = dca.field_y.createImage(304, 34);
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
              var10.drawString(param0, (304 - 6 * param0.length()) / 2, 22);
              var9.drawImage(et.field_m, dda.field_j / 2 - 152, -18 + nn.field_b / 2, (java.awt.image.ImageObserver) null);
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = (Exception) (Object) decompiledCaughtException;
              var7 = -152 + dda.field_j / 2;
              var8 = nn.field_b / 2 - 18;
              var9.setColor(param1);
              var9.drawRect(var7, var8, 303, 33);
              var9.fillRect(2 + var7, var8 + 2, 3 * param2, 30);
              var9.setColor(java.awt.Color.black);
              var9.drawRect(var7 + 1, 1 + var8, 301, 31);
              var9.fillRect(3 * param2 + var7 + 2, 2 + var8, -(3 * param2) + 300, 30);
              var9.setFont(tb.field_b);
              var9.setColor(java.awt.Color.white);
              var9.drawString(param0, var7 + (-(param0.length() * 6) + 304) / 2, var8 + 22);
            }
            if (ina.field_r != null) {
              var9.setFont(tb.field_b);
              var9.setColor(java.awt.Color.white);
              var9.drawString(ina.field_r, dda.field_j / 2 - 6 * ina.field_r.length() / 2, -26 + nn.field_b / 2);
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var5 = (Exception) (Object) decompiledCaughtException;
            dca.field_y.repaint();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var5_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_20_0 = var5_ref;
          stackIn_20_1 = new StringBuilder().append("lha.I(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
              param0.getAppletContext().showDocument(ow.a(var2, (byte) -91, param0), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            if (param1 != -17672) {
              lha.a(-63);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("lha.E(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw pe.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
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
