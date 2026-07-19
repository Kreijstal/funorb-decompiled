/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj extends sk {
    private go[] field_h;
    private boolean field_i;
    private boolean field_f;
    static volatile int field_g;

    oj(bf param0) {
        super(param0);
        RuntimeException var2 = null;
        int var2_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        float var10 = 0.0f;
        float var11 = 0.0f;
        float var12 = 0.0f;
        float var13 = 0.0f;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[][] var27 = null;
        int[][] var28 = null;
        int[][] var29 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        this.field_f = false;
        try {
          L0: {
            L1: {
              if (!param0.field_Pb) {
                break L1;
              } else {
                L2: {
                  stackOut_2_0 = this;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (3 <= param0.field_h) {
                    stackOut_4_0 = this;
                    stackOut_4_1 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    break L2;
                  } else {
                    stackOut_3_0 = this;
                    stackOut_3_1 = 1;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    break L2;
                  }
                }
                L3: {
                  ((oj) (this)).field_i = stackIn_5_1 != 0;
                  if (!this.field_i) {
                    stackOut_7_0 = 127;
                    stackIn_8_0 = stackOut_7_0;
                    break L3;
                  } else {
                    stackOut_6_0 = 48;
                    stackIn_8_0 = stackOut_6_0;
                    break L3;
                  }
                }
                var2_int = stackIn_8_0;
                var29 = new int[6][4096];
                var27 = new int[6][4096];
                var28 = new int[6][4096];
                var9 = 0;
                var14 = 0;
                L4: while (true) {
                  if (-65 >= (var14 ^ -1)) {
                    this.field_h = new go[3];
                    this.field_h[0] = this.field_b.a(64, -118, false, var27);
                    this.field_h[1] = this.field_b.a(64, 80, false, var28);
                    this.field_h[2] = this.field_b.a(64, -69, false, var29);
                    break L1;
                  } else {
                    var15 = 0;
                    L5: while (true) {
                      if (-65 >= (var15 ^ -1)) {
                        var14++;
                        continue L4;
                      } else {
                        var11 = 2.0f * (float)var15 / 64.0f - 1.0f;
                        var12 = -1.0f + (float)var14 * 2.0f / 64.0f;
                        var13 = (float)(1.0 / Math.sqrt((double)(var12 * var12 + (var11 * var11 + 1.0f))));
                        var11 = var11 * var13;
                        var12 = var12 * var13;
                        var16 = 0;
                        L6: while (true) {
                          if (var16 >= 6) {
                            var9++;
                            var15++;
                            continue L5;
                          } else {
                            L7: {
                              if (-1 != (var16 ^ -1)) {
                                if (var16 != 1) {
                                  if ((var16 ^ -1) != -3) {
                                    if (var16 != 3) {
                                      if (var16 == 4) {
                                        var10 = var13;
                                        break L7;
                                      } else {
                                        var10 = -var13;
                                        break L7;
                                      }
                                    } else {
                                      var10 = -var12;
                                      break L7;
                                    }
                                  } else {
                                    var10 = var12;
                                    break L7;
                                  }
                                } else {
                                  var10 = var11;
                                  break L7;
                                }
                              } else {
                                var10 = -var11;
                                break L7;
                              }
                            }
                            L8: {
                              if (0.0f >= var10) {
                                var6 = 0;
                                var7 = 0;
                                var8 = 0;
                                break L8;
                              } else {
                                var6 = (int)((double)var2_int * Math.pow((double)var10, 96.0));
                                var7 = (int)(Math.pow((double)var10, 36.0) * (double)var2_int);
                                var8 = (int)((double)var2_int * Math.pow((double)var10, 12.0));
                                break L8;
                              }
                            }
                            var27[var16][var9] = var6 << -916303880;
                            var28[var16][var9] = var7 << 1237101720;
                            var29[var16][var9] = var8 << 327094392;
                            var16++;
                            continue L6;
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) (var2);
            stackOut_33_1 = new StringBuilder().append("oj.<init>(");
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param0 == null) {
              stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
              stackOut_35_1 = (StringBuilder) ((Object) stackIn_35_1);
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L9;
            } else {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L9;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_36_0), stackIn_36_2 + ')');
        }
    }

    final void a(boolean param0, byte param1) {
        int var4 = 0;
        jj var5 = null;
        ec var6 = null;
        L0: {
          var4 = AceOfSkies.field_G ? 1 : 0;
          if (param1 > 2) {
            break L0;
          } else {
            var5 = (jj) null;
            this.a(-6, -33, (jj) null);
            break L0;
          }
        }
        L1: {
          if (null == this.field_h) {
            this.field_b.a(ac.field_b, 0, 0);
            break L1;
          } else {
            if (!param0) {
              this.field_b.a(ac.field_b, 0, 0);
              break L1;
            } else {
              this.field_b.a(1, (byte) 78);
              this.field_b.a(rg.field_A, false);
              var6 = this.field_b.d(12343);
              var6.a(1024, 1);
              this.field_b.a(qn.field_a, (byte) -127);
              if (this.field_i) {
                this.field_b.a(lo.field_j, true, bd.field_C);
                this.field_b.a(true, 0, true, dl.field_p, false);
                this.field_b.a(ac.field_b, 0, 0);
                this.field_b.a(0, (byte) 40);
                this.field_f = true;
                break L1;
              } else {
                this.field_b.a(bd.field_C, true, ru.field_a);
                this.field_b.a((byte) 119, 0, un.field_i);
                this.field_b.a(2, (byte) 79);
                this.field_b.a(lo.field_j, true, bd.field_C);
                this.field_b.a((byte) 120, 0, un.field_i);
                this.field_b.a(true, 1, true, un.field_i, false);
                this.field_b.a(ac.field_b, 0, 0);
                this.field_b.a(this.field_b.field_Kb, -9135);
                this.field_b.a(0, (byte) 40);
                this.field_f = true;
                break L1;
              }
            }
          }
        }
    }

    final static boolean a(char param0, byte param1) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var2 = 72 / ((param1 - -82) / 34);
            if (param0 < 48) {
              break L1;
            } else {
              if (param0 > 57) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    final void a(int param0, int param1, jj param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_b.a(param2, -9135);
              this.field_b.b(param0, false);
              if (param1 > 66) {
                break L1;
              } else {
                this.field_h = (go[]) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("oj.I(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static int f(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        int stackIn_9_0 = 0;
        int stackIn_29_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        int stackOut_8_0 = 0;
        var7 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            var1_int = 0;
            var2 = 0;
            L1: while (true) {
              if (!ek.a((byte) -127)) {
                if (param0 == 5) {
                  L2: {
                    pr.field_b.a(rc.b((byte) -113, ln.field_c, lq.field_a), rc.b((byte) -105, ic.field_b, cf.field_g), -24702);
                    if (pr.field_b.e((byte) 83)) {
                      var1_int = 1;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    L4: {
                      var3 = 0;
                      if (var1_int == 0) {
                        break L4;
                      } else {
                        if (pr.field_b.field_g >= 0) {
                          L5: {
                            var3 = rm.field_g[pr.field_b.field_g];
                            if (var3 == 2) {
                              break L5;
                            } else {
                              if (5 == var3) {
                                break L5;
                              } else {
                                break L3;
                              }
                            }
                          }
                          ld.a(param0 + 14178);
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (var2 == 0) {
                      break L3;
                    } else {
                      if (2 == ol.field_c) {
                        break L3;
                      } else {
                        ld.a(14183);
                        break L3;
                      }
                    }
                  }
                  L6: {
                    if (-1 != (var3 ^ -1)) {
                      break L6;
                    } else {
                      if (-3 != (ol.field_c ^ -1)) {
                        break L6;
                      } else {
                        var4 = kh.a(param0 ^ -64) - rb.field_e;
                        var6 = (int)((-var4 + 10999L) / 1000L);
                        if (var6 <= 0) {
                          nk.a((byte) -119, 5, true);
                          var3 = 2;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  stackOut_28_0 = var3;
                  stackIn_29_0 = stackOut_28_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackOut_8_0 = 65;
                  stackIn_9_0 = stackOut_8_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L7: {
                  pr.field_b.a(true);
                  if (!pr.field_b.e((byte) 115)) {
                    break L7;
                  } else {
                    var1_int = 1;
                    break L7;
                  }
                }
                if ((bk.field_f ^ -1) != -14) {
                  continue L1;
                } else {
                  var2 = 1;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "oj.B(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_29_0;
        }
    }

    final void a(boolean param0, boolean param1) {
        this.field_b.a(ru.field_a, true, bd.field_C);
        if (param0) {
            this.a(false);
        }
    }

    final static void a(String param0, java.awt.Color param1, int param2, int param3, boolean param4) {
        boolean discarded$1 = false;
        Exception var5 = null;
        RuntimeException var5_ref = null;
        Exception var6 = null;
        int var7 = 0;
        int var8 = 0;
        java.awt.Graphics var9 = null;
        java.awt.Graphics var10 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  var9 = ci.field_f.getGraphics();
                  if (null != aq.field_b) {
                    break L2;
                  } else {
                    aq.field_b = new java.awt.Font("Helvetica", 1, 13);
                    break L2;
                  }
                }
                L3: {
                  if (param4) {
                    var9.setColor(java.awt.Color.black);
                    var9.fillRect(0, 0, td.field_b, ps.field_h);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  if (param1 == null) {
                    param1 = new java.awt.Color(140, 17, 17);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (param2 == 140) {
                  try {
                    L5: {
                      L6: {
                        if (null == qn.field_d) {
                          qn.field_d = ci.field_f.createImage(304, 34);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var10 = qn.field_d.getGraphics();
                      var10.setColor(param1);
                      var10.drawRect(0, 0, 303, 33);
                      var10.fillRect(2, 2, 3 * param3, 30);
                      var10.setColor(java.awt.Color.black);
                      var10.drawRect(1, 1, 301, 31);
                      var10.fillRect(2 + 3 * param3, 2, 300 - 3 * param3, 30);
                      var10.setFont(aq.field_b);
                      var10.setColor(java.awt.Color.white);
                      var10.drawString(param0, (304 - param0.length() * 6) / 2, 22);
                      discarded$1 = var9.drawImage(qn.field_d, td.field_b / 2 + -152, -18 + ps.field_h / 2, (java.awt.image.ImageObserver) null);
                      break L5;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L7: {
                      var6 = (Exception) (Object) decompiledCaughtException;
                      var7 = td.field_b / 2 - 152;
                      var8 = ps.field_h / 2 - 18;
                      var9.setColor(param1);
                      var9.drawRect(var7, var8, 303, 33);
                      var9.fillRect(var7 - -2, 2 + var8, param3 * 3, 30);
                      var9.setColor(java.awt.Color.black);
                      var9.drawRect(var7 - -1, var8 - -1, 301, 31);
                      var9.fillRect(2 + (var7 - -(3 * param3)), var8 + 2, -(param3 * 3) + 300, 30);
                      var9.setFont(aq.field_b);
                      var9.setColor(java.awt.Color.white);
                      var9.drawString(param0, (304 + -(6 * param0.length())) / 2 + var7, 22 + var8);
                      break L7;
                    }
                  }
                  L8: {
                    if (qh.field_b != null) {
                      var9.setFont(aq.field_b);
                      var9.setColor(java.awt.Color.white);
                      var9.drawString(qh.field_b, td.field_b / 2 + -(6 * qh.field_b.length() / 2), ps.field_h / 2 - 26);
                      break L8;
                    } else {
                      break L8;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L1;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L9: {
                var5 = (Exception) (Object) decompiledCaughtException;
                ci.field_f.repaint();
                decompiledRegionSelector0 = 1;
                break L9;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              decompiledRegionSelector1 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          L10: {
            var5_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var5_ref);
            stackOut_22_1 = new StringBuilder().append("oj.C(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L10;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L10;
            }
          }
          L11: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param1 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L11;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L11;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0) {
        int var3 = AceOfSkies.field_G ? 1 : 0;
        if (!this.field_f) {
            this.field_b.a(dl.field_p, 0, 0);
        } else {
            this.field_b.a(1, (byte) 45);
            this.field_b.a((jj) null, -9135);
            this.field_b.a(b.field_b, false);
            this.field_b.f(-21041);
            if (this.field_i) {
                this.field_b.a(ru.field_a, true, ru.field_a);
                this.field_b.a((byte) 118, 0, dl.field_p);
                this.field_b.a(dl.field_p, 0, 0);
            } else {
                this.field_b.a(ru.field_a, param0, ru.field_a);
                this.field_b.a((byte) 121, 0, dl.field_p);
                this.field_b.a(2, (byte) 26);
                this.field_b.a(ru.field_a, true, ru.field_a);
                this.field_b.a((byte) 122, 0, dl.field_p);
                this.field_b.a((byte) 121, 1, un.field_i);
                this.field_b.a(dl.field_p, 0, 0);
                this.field_b.a((jj) null, -9135);
            }
            this.field_b.a(0, (byte) 103);
            this.field_f = false;
        }
        this.field_b.a(ru.field_a, param0, ru.field_a);
    }

    final void a(int param0, int param1, int param2) {
        int discarded$0 = 0;
        if (param0 != 1786747298) {
            discarded$0 = oj.f(-93);
        }
        if (!(!this.field_f)) {
            this.field_b.a(1, (byte) 101);
            this.field_b.a(this.field_h[param1 - 1], -9135);
            this.field_b.a(0, (byte) 104);
        }
    }

    final static void a(int param0, java.applet.Applet param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String var3 = null;
        long var4 = 0L;
        java.awt.Color var6 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              jr.field_u = true;
              var2 = "tuhstatbut";
              var3 = "rvnadlm";
              var4 = -1L;
              jt.a(var2, var3, var4, param1, 0);
              if (param0 == 26099) {
                break L1;
              } else {
                var6 = (java.awt.Color) null;
                oj.a((String) null, (java.awt.Color) null, -128, 49, true);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (var2_ref);
            stackOut_3_1 = new StringBuilder().append("oj.E(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final boolean e(int param0) {
        if (param0 != 3) {
            this.a(true, (byte) -77);
        }
        return true;
    }

    static {
        field_g = 0;
    }
}
