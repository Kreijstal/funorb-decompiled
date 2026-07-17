/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ld {
    private int field_a;
    ql field_e;
    private int field_c;
    static long field_b;
    static he[] field_f;
    static int[] field_h;
    private int field_g;
    static he[] field_d;

    private final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = (int)(Math.exp((double)(-lf.field_b) / 25.0) * -400.0);
        v.field_O.a(0, var2 / 2 + 200);
        this.c(200 + var2 / 2, -66);
        oi.field_f.d(0, 200 + var2 / 2);
        this.a(jk.field_L, 220, var2, -50);
        dj.a(re.field_e, 75, lf.field_b, false, 380);
        var3 = 0;
        L0: while (true) {
          if (var3 >= 3) {
            int discarded$1 = cb.field_b.a(aj.field_f, 285, -cb.field_b.field_x + 122 + (var2 + 64), 200, 140, 0, -1, 0, 0, cb.field_b.field_x);
            return;
          } else {
            var4 = 0;
            L1: while (true) {
              if (var4 >= 3) {
                var3++;
                continue L0;
              } else {
                L2: {
                  var5 = 40 - -(var4 * 70);
                  var6 = var3 * 70 + 122 + var2;
                  var7 = 3 * var3 + var4;
                  if (var7 < 3) {
                    break L2;
                  } else {
                    if (hb.field_g > 0) {
                      break L2;
                    } else {
                      wi.field_a.a(var5, var6);
                      var4++;
                      continue L1;
                    }
                  }
                }
                if (var7 > gf.field_D) {
                  md.field_f.a(var5, var6);
                  var4++;
                  continue L1;
                } else {
                  eb.field_e[var7].a(var5, var6);
                  var4++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    private final void f(byte param0) {
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var11 = new int[v.field_W.length];
        var10 = var11;
        var9 = var10;
        var8 = var9;
        var2 = var8;
        var3 = -1 + v.field_W.length;
        L0: while (true) {
          if (var3 < 0) {
            return;
          } else {
            L1: {
              var4 = l.field_n[sd.field_a.field_q][var3];
              var5 = kc.field_o[sd.field_a.field_q][var3];
              if (ul.field_d <= var4) {
                break L1;
              } else {
                var2[var3] = -var4 + ul.field_d;
                break L1;
              }
            }
            L2: {
              if (var5 >= ul.field_d) {
                break L2;
              } else {
                var2[var3] = 100 - (ul.field_d + -var5);
                break L2;
              }
            }
            L3: {
              if (var11[var3] >= 0) {
                if (100 < var11[var3]) {
                  var11[var3] = 100;
                  break L3;
                } else {
                  break L3;
                }
              } else {
                var11[var3] = 0;
                break L3;
              }
            }
            var6 = (int)(2.55 * (double)var11[var3]);
            if (0 < var6) {
              v.field_W[var3].a(-50 + var11[var3] / 2, var11[var3] / 2 - 50, var6);
              int discarded$1 = cb.field_b.a(mg.field_a[sd.field_a.field_q][var3], 225, kj.field_f[sd.field_a.field_q][var3], 405, 640, var6 * 65793, -1, 0, 0, cb.field_b.field_x);
              var3--;
              continue L0;
            } else {
              var3--;
              continue L0;
            }
          }
        }
    }

    private final void a(he param0, int param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
            ph.field_h.a(0, param2);
            param0.a(0, param2);
            if (param3 != -50) {
                this.d((byte) 68);
            }
            wj.f(17, 116 + param2, 606, param1, 16249576);
            wj.c(16, param2 + 116, param1, 0);
            for (var5_int = 0; 4 > var5_int; var5_int++) {
                wj.c(623 - -var5_int, param2 - -116, param1, 0);
            }
            wj.f(0, param1 + (116 + param2), 640, 480);
            ph.field_h.a(0, param2 + param1);
            wj.a();
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) (Object) runtimeException, "ld.F(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    private final void d(int param0) {
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var12 = new int[mk.field_g.length];
        var11 = var12;
        var10 = var11;
        var9 = var10;
        var8 = var9;
        var2 = var8;
        var3 = mk.field_g.length + -1;
        L0: while (true) {
          if (var3 < 0) {
            L1: {
              if (l.field_n[sd.field_a.field_q][7] >= ul.field_d) {
                break L1;
              } else {
                if (kc.field_o[sd.field_a.field_q][7] > ul.field_d) {
                  wj.d(0, 0, 640, 480, 16777215, 255 + -(int)(2.5 * (double)var12[7]));
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            return;
          } else {
            L2: {
              var4 = l.field_n[sd.field_a.field_q][var3];
              var5 = kc.field_o[sd.field_a.field_q][var3];
              if (var4 >= ul.field_d) {
                break L2;
              } else {
                var8[var3] = -var4 + ul.field_d;
                break L2;
              }
            }
            L3: {
              if (var5 < ul.field_d) {
                var8[var3] = 100 - ul.field_d - -var5;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (0 > var12[var3]) {
                var12[var3] = 0;
                break L4;
              } else {
                if (var12[var3] > 100) {
                  var12[var3] = 100;
                  break L4;
                } else {
                  break L4;
                }
              }
            }
            var6 = (int)((double)var12[var3] * 2.55);
            if (var6 > 0) {
              mk.field_g[var3].a(-50 + var12[var3] / 2, var12[var3] / 2 + -50, var6);
              int discarded$1 = cb.field_b.a(mg.field_a[sd.field_a.field_q][var3], 225, kj.field_f[sd.field_a.field_q][var3], 405, 640, var6 * 65793, -1, 0, 0, cb.field_b.field_x);
              var3--;
              continue L0;
            } else {
              var3--;
              continue L0;
            }
          }
        }
    }

    private final int a(int param0, byte param1) {
        int var3 = ul.field_j[((ld) this).field_c][param0];
        if (!(((ld) this).field_c != 2)) {
            return this.b(param0, true) - -cb.field_b.b(hg.field_ob[var3]);
        }
        if (10 == ((ld) this).field_c) {
            if (ul.field_j[((ld) this).field_c][param0] != 5) {
                if (13 != ul.field_j[((ld) this).field_c][param0]) {
                    return 70 + this.b(param0, true);
                }
            }
        }
        return ul.field_i[((ld) this).field_c];
    }

    private final int b(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (param1) {
            break L0;
          } else {
            field_f = null;
            break L0;
          }
        }
        L1: {
          var3 = ul.field_j[((ld) this).field_c][param0];
          if (((ld) this).field_c != 2) {
            break L1;
          } else {
            if (oh.a(0)) {
              break L1;
            } else {
              if (param0 >= 3) {
                return 320 + -(cb.field_b.b(hg.field_ob[var3]) / 2);
              } else {
                return 140 * (param0 - 1) + 320 - cb.field_b.b(hg.field_ob[var3]) / 2;
              }
            }
          }
        }
        L2: {
          if (((ld) this).field_c != 10) {
            break L2;
          } else {
            if (var3 == 5) {
              break L2;
            } else {
              L3: {
                var4 = var3;
                if (var4 == 26) {
                  break L3;
                } else {
                  if (var4 == 29) {
                    break L3;
                  } else {
                    if (var4 == 32) {
                      break L3;
                    } else {
                      L4: {
                        if (27 != var4) {
                          if (var4 == 30) {
                            break L4;
                          } else {
                            if (var4 == 33) {
                              break L4;
                            } else {
                              L5: {
                                if (var4 == 28) {
                                  break L5;
                                } else {
                                  if (var4 == 31) {
                                    break L5;
                                  } else {
                                    if (var4 != 34) {
                                      break L2;
                                    } else {
                                      break L5;
                                    }
                                  }
                                }
                              }
                              return 180;
                            }
                          }
                        } else {
                          break L4;
                        }
                      }
                      return 110;
                    }
                  }
                }
              }
              return 40;
            }
          }
        }
        return ul.field_b[((ld) this).field_c];
    }

    private final void a(boolean param0, he[] param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            if (!param0) {
              L1: {
                var3_int = 255;
                var4 = td.field_g[sd.field_a.field_q];
                if (ul.field_d < 100) {
                  var3_int = (int)(2.55 * (double)ul.field_d);
                  break L1;
                } else {
                  if (-ul.field_d + var4 < 100) {
                    var3_int = (int)(2.55 * (double)(-ul.field_d + var4));
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                if (var3_int < 0) {
                  var3_int = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                var5 = ul.field_d / 2 + -50;
                if (0 >= var5) {
                  break L3;
                } else {
                  var5 = 0;
                  break L3;
                }
              }
              L4: {
                var6 = -ul.field_d + 100;
                if (var6 >= 0) {
                  break L4;
                } else {
                  var6 = 0;
                  break L4;
                }
              }
              param1[0].a(var5, var6, var3_int);
              int discarded$1 = cb.field_b.a(mg.field_a[sd.field_a.field_q][0], 225, kj.field_f[sd.field_a.field_q][0], 405, 640, var3_int * 65793, -1, 0, 0, cb.field_b.field_x);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var3;
            stackOut_16_1 = new StringBuilder().append("ld.D(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw ie.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    private final int b(int param0, byte param1) {
        if (((ld) this).field_c == 10) {
            if (ul.field_j[((ld) this).field_c][param0] != 5) {
                return 70;
            }
        }
        return 30;
    }

    private final void c(int param0, boolean param1) {
        int var3 = 0;
        L0: {
          L1: {
            tc.field_d = 0;
            var3 = -111 % ((18 - param0) / 61);
            if (!qk.field_c) {
              break L1;
            } else {
              if (hb.field_g > 0) {
                break L1;
              } else {
                L2: {
                  if (((ld) this).field_c == 2) {
                    break L2;
                  } else {
                    if (((ld) this).field_c == 4) {
                      break L2;
                    } else {
                      if (9 != ((ld) this).field_c) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                qk.field_c = false;
                ek.a(-95, param1, 11);
                break L0;
              }
            }
          }
          ek.a(-74, param1, 0);
          break L0;
        }
    }

    private final void k(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var2 = 122;
          if (8 != sd.field_a.field_q) {
            break L0;
          } else {
            sc.a(-1, true, ml.field_l);
            break L0;
          }
        }
        L1: {
          var3 = 0;
          if (r.field_d != ((ld) this).field_c) {
            var3 = -1 + sd.field_a.field_q;
            break L1;
          } else {
            var3 = sd.field_a.field_q;
            break L1;
          }
        }
        L2: {
          if (hh.field_d[var3] == null) {
            if (sd.field_a.field_q == 8) {
              break L2;
            } else {
              mf.h(-8372);
              break L2;
            }
          } else {
            L3: {
              if (var3 != 2) {
                break L3;
              } else {
                if (sd.field_e == 2) {
                  be.a(rh.field_h, 360, (double)lf.field_b / 6.0);
                  var4 = (int)(Math.exp((double)(-lf.field_b) / 25.0) * -200.0);
                  this.a(cj.field_g, 0, var4, -50);
                  break L2;
                } else {
                  break L3;
                }
              }
            }
            hh.field_d[var3].e(0, 0);
            var4 = (int)(Math.exp((double)(-lf.field_b) / 25.0) * -200.0);
            this.a(cj.field_g, 0, var4, -50);
            break L2;
          }
        }
    }

    private final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          ul.field_d = ul.field_d + 1;
          var2 = sd.field_a.field_q;
          if (var2 == 0) {
            this.b((byte) -114);
            break L0;
          } else {
            if (1 != var2) {
              if (var2 == 2) {
                this.b(-9180);
                break L0;
              } else {
                if (var2 == 3) {
                  this.a(true);
                  break L0;
                } else {
                  if (var2 == 4) {
                    this.b(-9180);
                    break L0;
                  } else {
                    if (var2 == 5) {
                      this.b(-9180);
                      break L0;
                    } else {
                      if (var2 != 6) {
                        if (var2 == 7) {
                          this.b(-9180);
                          break L0;
                        } else {
                          if (var2 != 8) {
                            break L0;
                          } else {
                            this.b(-9180);
                            break L0;
                          }
                        }
                      } else {
                        this.h(119);
                        break L0;
                      }
                    }
                  }
                }
              }
            } else {
              this.b(-9180);
              break L0;
            }
          }
        }
        var2 = 50 % ((24 - param0) / 57);
    }

    final void f(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        Object stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        Object stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        Object stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        Object stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        Object stackOut_32_0 = null;
        Object stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        Object stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        int stackOut_46_2 = 0;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        int stackOut_45_2 = 0;
        L0: {
          var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (((ld) this).field_c == -1) {
            break L0;
          } else {
            wj.c();
            break L0;
          }
        }
        L1: {
          if (param0 == -8448) {
            break L1;
          } else {
            int discarded$1 = this.a((byte) 16, 0);
            break L1;
          }
        }
        L2: {
          lg.field_f = kj.field_b[((ld) this).field_c];
          re.field_e = ih.field_O[((ld) this).field_c];
          var3 = ((ld) this).field_c;
          if (var3 == 0) {
            v.field_O.a(0, 0);
            this.c(0, param0 + 8367);
            ph.field_h.a(0, 0);
            uk.field_h.d(-43, 35);
            dj.a(re.field_e, 311, lf.field_b, false, 155);
            qj.field_f.a(0, 0);
            break L2;
          } else {
            if (1 != var3) {
              if (var3 != 2) {
                if (var3 != 3) {
                  L3: {
                    if (var3 != 4) {
                      if (var3 != 9) {
                        if (var3 == 5) {
                          this.b(false);
                          break L2;
                        } else {
                          L4: {
                            if (var3 == 6) {
                              break L4;
                            } else {
                              if (var3 != 7) {
                                if (var3 == 8) {
                                  this.k(-128);
                                  dj.a(re.field_e, 70, lf.field_b, false, 370);
                                  break L2;
                                } else {
                                  if (var3 != 10) {
                                    if (11 != var3) {
                                      break L2;
                                    } else {
                                      v.field_O.a(0, 0);
                                      this.c(0, -93);
                                      uk.field_h.d(-120, 35);
                                      bg.d(param0 ^ 2947);
                                      return;
                                    }
                                  } else {
                                    this.a(0);
                                    break L2;
                                  }
                                }
                              } else {
                                break L4;
                              }
                            }
                          }
                          this.c((byte) 101);
                          break L2;
                        }
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                  L5: {
                    stackOut_32_0 = this;
                    stackIn_34_0 = stackOut_32_0;
                    stackIn_33_0 = stackOut_32_0;
                    if (9 != ((ld) this).field_c) {
                      stackOut_34_0 = this;
                      stackOut_34_1 = 0;
                      stackIn_35_0 = stackOut_34_0;
                      stackIn_35_1 = stackOut_34_1;
                      break L5;
                    } else {
                      stackOut_33_0 = this;
                      stackOut_33_1 = 1;
                      stackIn_35_0 = stackOut_33_0;
                      stackIn_35_1 = stackOut_33_1;
                      break L5;
                    }
                  }
                  this.b(stackIn_35_1 != 0, (byte) -106);
                  break L2;
                } else {
                  this.c(param0 ^ 8331);
                  break L2;
                }
              } else {
                this.d((byte) -74);
                dj.a(re.field_e + 20, 80, lf.field_b, false, 375);
                break L2;
              }
            } else {
              L6: {
                L7: {
                  rh.field_b.d(0, 0);
                  var2 = 241;
                  ph.field_h.a(0, 0);
                  if (oh.a(param0 + 8448)) {
                    break L7;
                  } else {
                    if (hb.field_g > 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                var2 -= 30;
                break L6;
              }
              dj.a(re.field_e, var2, lf.field_b, false, 190);
              break L2;
            }
          }
        }
        var2 = 0;
        L8: while (true) {
          if (~((ld) this).field_e.field_e >= ~var2) {
            return;
          } else {
            L9: {
              if (!this.a(var2, false)) {
                break L9;
              } else {
                L10: {
                  stackOut_44_0 = this;
                  stackOut_44_1 = 1;
                  stackIn_46_0 = stackOut_44_0;
                  stackIn_46_1 = stackOut_44_1;
                  stackIn_45_0 = stackOut_44_0;
                  stackIn_45_1 = stackOut_44_1;
                  if (~((ld) this).field_e.field_f != ~var2) {
                    stackOut_46_0 = this;
                    stackOut_46_1 = stackIn_46_1;
                    stackOut_46_2 = 0;
                    stackIn_47_0 = stackOut_46_0;
                    stackIn_47_1 = stackOut_46_1;
                    stackIn_47_2 = stackOut_46_2;
                    break L10;
                  } else {
                    stackOut_45_0 = this;
                    stackOut_45_1 = stackIn_45_1;
                    stackOut_45_2 = 1;
                    stackIn_47_0 = stackOut_45_0;
                    stackIn_47_1 = stackOut_45_1;
                    stackIn_47_2 = stackOut_45_2;
                    break L10;
                  }
                }
                this.a(stackIn_47_1 != 0, stackIn_47_2 != 0, var2);
                break L9;
              }
            }
            var2++;
            continue L8;
          }
        }
    }

    private final void h(int param0) {
        L0: {
          L1: {
            if (hl.field_d) {
              break L1;
            } else {
              if (td.field_g[sd.field_a.field_q] >= ul.field_d) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ek.a(-80, false, -1);
          ul.field_d = 0;
          break L0;
        }
    }

    private final void b(boolean param0) {
        int var2 = 0;
        jb var3 = null;
        String var4 = null;
        String var5 = null;
        String var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackIn_19_0 = 0;
        int stackIn_19_1 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_20_2 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_19_2 = 0;
        int stackOut_18_0 = 0;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        L0: {
          var2 = (int)(Math.exp((double)(-lf.field_b) / 25.0) * -400.0);
          var3 = ni.field_q;
          v.field_O.a(0, var2 / 2 + 200);
          this.c(200 + var2 / 2, -96);
          oi.field_f.d(0, 200 - -(var2 / 2));
          this.a(oj.field_d, 170, var2, -50);
          if (ej.field_h == 0) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          stackOut_3_0 = stackIn_3_0;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (sd.field_a.field_H == 0) {
            stackOut_5_0 = stackIn_5_0;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = stackIn_4_0;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          stackOut_6_0 = stackIn_6_0;
          stackOut_6_1 = stackIn_6_1;
          stackOut_6_2 = -125;
          stackIn_8_0 = stackOut_6_0;
          stackIn_8_1 = stackOut_6_1;
          stackIn_8_2 = stackOut_6_2;
          stackIn_7_0 = stackOut_6_0;
          stackIn_7_1 = stackOut_6_1;
          stackIn_7_2 = stackOut_6_2;
          if (sd.field_a.field_q == 0) {
            stackOut_8_0 = stackIn_8_0;
            stackOut_8_1 = stackIn_8_1;
            stackOut_8_2 = stackIn_8_2;
            stackOut_8_3 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            stackIn_9_2 = stackOut_8_2;
            stackIn_9_3 = stackOut_8_3;
            break L2;
          } else {
            stackOut_7_0 = stackIn_7_0;
            stackOut_7_1 = stackIn_7_1;
            stackOut_7_2 = stackIn_7_2;
            stackOut_7_3 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_9_2 = stackOut_7_2;
            stackIn_9_3 = stackOut_7_3;
            break L2;
          }
        }
        L3: {
          var4 = nj.a(stackIn_9_0 != 0, stackIn_9_1 != 0, stackIn_9_2, stackIn_9_3 != 0);
          if (var4 != null) {
            break L3;
          } else {
            var4 = tf.field_nb[7];
            break L3;
          }
        }
        L4: {
          var5 = ab.field_c + " " + var4 + " " + ph.field_i;
          if (0 == ej.field_h) {
            stackOut_13_0 = 0;
            stackIn_14_0 = stackOut_13_0;
            break L4;
          } else {
            stackOut_12_0 = 1;
            stackIn_14_0 = stackOut_12_0;
            break L4;
          }
        }
        L5: {
          stackOut_14_0 = stackIn_14_0;
          stackIn_16_0 = stackOut_14_0;
          stackIn_15_0 = stackOut_14_0;
          if (0 == sd.field_a.field_q) {
            stackOut_16_0 = stackIn_16_0;
            stackOut_16_1 = 0;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            break L5;
          } else {
            stackOut_15_0 = stackIn_15_0;
            stackOut_15_1 = 1;
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            break L5;
          }
        }
        L6: {
          stackOut_17_0 = stackIn_17_0;
          stackOut_17_1 = stackIn_17_1;
          stackIn_19_0 = stackOut_17_0;
          stackIn_19_1 = stackOut_17_1;
          stackIn_18_0 = stackOut_17_0;
          stackIn_18_1 = stackOut_17_1;
          if (sd.field_a.field_H == 0) {
            stackOut_19_0 = stackIn_19_0;
            stackOut_19_1 = stackIn_19_1;
            stackOut_19_2 = 0;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            stackIn_20_2 = stackOut_19_2;
            break L6;
          } else {
            stackOut_18_0 = stackIn_18_0;
            stackOut_18_1 = stackIn_18_1;
            stackOut_18_2 = 1;
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_20_2 = stackOut_18_2;
            break L6;
          }
        }
        L7: {
          var4 = jl.a(stackIn_20_0 != 0, stackIn_20_1 != 0, stackIn_20_2 != 0, true);
          if (var4 == null) {
            var4 = kk.field_d[7];
            break L7;
          } else {
            break L7;
          }
        }
        var6 = "<br><br>" + gd.field_e + " " + ih.field_P + " " + var4;
        int discarded$1 = var3.a(var5 + " " + var6, 50, 130 + var2, 540, 480, 0, -1, 1, 0, var3.field_E);
        var7 = re.field_e;
        dj.a(var7, 75, lf.field_b, false, 385);
    }

    private final int a(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (((ld) this).field_c != 2) {
            break L0;
          } else {
            if (!oh.a(0)) {
              if (param1 < 3) {
                return ul.field_e[((ld) this).field_c];
              } else {
                return ul.field_f[((ld) this).field_c] + ul.field_e[((ld) this).field_c];
              }
            } else {
              break L0;
            }
          }
        }
        L1: {
          var3 = ul.field_j[((ld) this).field_c][param1];
          if (10 != ((ld) this).field_c) {
            break L1;
          } else {
            if (var3 == 5) {
              break L1;
            } else {
              L2: {
                var4 = (int)(Math.exp((double)(-lf.field_b) / 25.0) * -400.0);
                var5 = var3;
                if (var5 == 26) {
                  break L2;
                } else {
                  if (var5 == 27) {
                    break L2;
                  } else {
                    if (var5 == 28) {
                      break L2;
                    } else {
                      L3: {
                        if (var5 != 29) {
                          if (30 != var5) {
                            if (var5 == 31) {
                              break L3;
                            } else {
                              L4: {
                                if (var5 == 32) {
                                  break L4;
                                } else {
                                  if (var5 == 33) {
                                    break L4;
                                  } else {
                                    if (34 != var5) {
                                      break L1;
                                    } else {
                                      break L4;
                                    }
                                  }
                                }
                              }
                              return 70 + (var4 + 192);
                            }
                          } else {
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                      return 70 + var4 - -122;
                    }
                  }
                }
              }
              return 122 + var4;
            }
          }
        }
        L5: {
          if (param0 < -62) {
            break L5;
          } else {
            field_f = null;
            break L5;
          }
        }
        return param1 * ul.field_f[((ld) this).field_c] + ul.field_e[((ld) this).field_c];
    }

    private final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var2 = sd.field_a.field_q;
          if (var2 != 0) {
            if (var2 == 1) {
              this.a(false, wb.field_a);
              break L0;
            } else {
              if (2 == var2) {
                this.a(false, gl.field_b);
                break L0;
              } else {
                if (3 == var2) {
                  this.c(true);
                  break L0;
                } else {
                  if (var2 == 4) {
                    this.a(false, ge.field_p);
                    break L0;
                  } else {
                    if (5 == var2) {
                      this.a(false, th.field_b);
                      break L0;
                    } else {
                      if (var2 == 6) {
                        this.f((byte) 35);
                        break L0;
                      } else {
                        if (var2 != 7) {
                          if (var2 != 8) {
                            break L0;
                          } else {
                            this.a(false, rg.field_c);
                            break L0;
                          }
                        } else {
                          this.a(false, ie.field_x);
                          break L0;
                        }
                      }
                    }
                  }
                }
              }
            }
          } else {
            this.d(-1);
            break L0;
          }
        }
    }

    private final void j(int param0) {
        we.a(false, nl.field_r[0]);
    }

    private final void i(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_43_0 = 0;
        int stackIn_46_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        L0: {
          var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (2 != ((ld) this).field_c) {
            break L0;
          } else {
            if (oh.a(0)) {
              break L0;
            } else {
              L1: {
                if (di.field_c == 96) {
                  if (((ld) this).field_e.field_f > 0) {
                    if (3 == ((ld) this).field_e.field_f) {
                      break L1;
                    } else {
                      ((ld) this).field_e.a(((ld) this).field_e.field_f + -1, 100);
                      break L1;
                    }
                  } else {
                    ((ld) this).field_e.a(2, 100);
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              L2: {
                if (97 == di.field_c) {
                  if (2 > ((ld) this).field_e.field_f) {
                    ((ld) this).field_e.a(1 + ((ld) this).field_e.field_f, 100);
                    break L2;
                  } else {
                    if (((ld) this).field_e.field_f != 2) {
                      break L2;
                    } else {
                      ((ld) this).field_e.a(0, 100);
                      break L2;
                    }
                  }
                } else {
                  break L2;
                }
              }
              L3: {
                if (di.field_c != 99) {
                  break L3;
                } else {
                  L4: {
                    if (((ld) this).field_e.field_f < 0) {
                      break L4;
                    } else {
                      if (((ld) this).field_e.field_f > 2) {
                        break L4;
                      } else {
                        ((ld) this).field_e.a(3, 100);
                        break L3;
                      }
                    }
                  }
                  ((ld) this).field_e.a(pa.field_d, 100);
                  break L3;
                }
              }
              L5: {
                if (di.field_c != 98) {
                  break L5;
                } else {
                  if (((ld) this).field_e.field_f == 3) {
                    ((ld) this).field_e.a(pa.field_d, 100);
                    break L5;
                  } else {
                    ((ld) this).field_e.a(3, 100);
                    break L5;
                  }
                }
              }
              ((ld) this).field_e.f(50);
              return;
            }
          }
        }
        L6: {
          if (((ld) this).field_c != 11) {
            if (((ld) this).field_c != 10) {
              ((ld) this).field_e.c(38);
              break L6;
            } else {
              if (((ld) this).field_e.field_f != -1) {
                L7: {
                  ((ld) this).field_e.d(-1);
                  if (0 <= ((ld) this).field_e.field_f) {
                    break L7;
                  } else {
                    ((ld) this).field_e.field_f = 0;
                    break L7;
                  }
                }
                L8: {
                  if (ul.field_j[((ld) this).field_c].length >= ((ld) this).field_e.field_f) {
                    break L8;
                  } else {
                    ((ld) this).field_e.field_f = ul.field_j[((ld) this).field_c].length;
                    break L8;
                  }
                }
                L9: {
                  var2 = ul.field_j[((ld) this).field_c][((ld) this).field_e.field_f];
                  if (oh.a(0)) {
                    stackOut_42_0 = 13;
                    stackIn_43_0 = stackOut_42_0;
                    break L9;
                  } else {
                    stackOut_41_0 = 5;
                    stackIn_43_0 = stackOut_41_0;
                    break L9;
                  }
                }
                L10: {
                  var3 = stackIn_43_0;
                  if (!oh.a(0)) {
                    stackOut_45_0 = 1;
                    stackIn_46_0 = stackOut_45_0;
                    break L10;
                  } else {
                    stackOut_44_0 = 0;
                    stackIn_46_0 = stackOut_44_0;
                    break L10;
                  }
                }
                L11: {
                  var4 = stackIn_46_0;
                  var5 = var2;
                  if (var5 == 5) {
                    L12: {
                      if (di.field_c != 98) {
                        break L12;
                      } else {
                        ((ld) this).field_e.field_f = -var4 + (8 - -((ld) this).field_g);
                        break L12;
                      }
                    }
                    if (di.field_c == 99) {
                      if (~var3 != ~var2) {
                        ((ld) this).field_e.field_f = 1;
                        break L11;
                      } else {
                        ((ld) this).field_e.field_f = ((ld) this).field_e.field_f + (var4 + (1 + ((ld) this).field_g));
                        break L11;
                      }
                    } else {
                      break L11;
                    }
                  } else {
                    if (var5 == 13) {
                      L13: {
                        if (98 != di.field_c) {
                          break L13;
                        } else {
                          ((ld) this).field_e.field_f = 0;
                          break L13;
                        }
                      }
                      if (99 == di.field_c) {
                        ((ld) this).field_e.field_f = ((ld) this).field_e.field_f + (((ld) this).field_g + (1 + var4));
                        break L11;
                      } else {
                        break L11;
                      }
                    } else {
                      L14: {
                        L15: {
                          if (26 != var5) {
                            if (27 != var5) {
                              if (var5 != 28) {
                                L16: {
                                  if (var5 != 29) {
                                    if (var5 == 30) {
                                      break L16;
                                    } else {
                                      if (var5 == 31) {
                                        break L16;
                                      } else {
                                        L17: {
                                          L18: {
                                            if (var5 != 32) {
                                              if (var5 != 33) {
                                                if (var5 != 34) {
                                                  break L11;
                                                } else {
                                                  break L17;
                                                }
                                              } else {
                                                break L18;
                                              }
                                            } else {
                                              ((ld) this).field_g = 0;
                                              break L18;
                                            }
                                          }
                                          if (var2 != 33) {
                                            break L17;
                                          } else {
                                            ((ld) this).field_g = 1;
                                            break L17;
                                          }
                                        }
                                        L19: {
                                          if (di.field_c != 98) {
                                            break L19;
                                          } else {
                                            ((ld) this).field_e.field_f = ((ld) this).field_e.field_f - 3;
                                            break L19;
                                          }
                                        }
                                        L20: {
                                          if (var2 != 34) {
                                            break L20;
                                          } else {
                                            ((ld) this).field_g = 2;
                                            break L20;
                                          }
                                        }
                                        if (di.field_c != 99) {
                                          break L11;
                                        } else {
                                          ((ld) this).field_e.field_f = 0;
                                          break L11;
                                        }
                                      }
                                    }
                                  } else {
                                    break L16;
                                  }
                                }
                                L21: {
                                  if (di.field_c == 98) {
                                    ((ld) this).field_e.field_f = ((ld) this).field_e.field_f - 3;
                                    break L21;
                                  } else {
                                    break L21;
                                  }
                                }
                                if (di.field_c != 99) {
                                  break L11;
                                } else {
                                  ((ld) this).field_e.field_f = ((ld) this).field_e.field_f + 3;
                                  break L11;
                                }
                              } else {
                                break L14;
                              }
                            } else {
                              break L15;
                            }
                          } else {
                            ((ld) this).field_g = 0;
                            break L15;
                          }
                        }
                        if (var2 == 27) {
                          ((ld) this).field_g = 1;
                          break L14;
                        } else {
                          break L14;
                        }
                      }
                      L22: {
                        if (98 != di.field_c) {
                          break L22;
                        } else {
                          ((ld) this).field_e.field_f = -var4 + 1;
                          break L22;
                        }
                      }
                      L23: {
                        if (var2 != 28) {
                          break L23;
                        } else {
                          ((ld) this).field_g = 2;
                          break L23;
                        }
                      }
                      if (di.field_c == 99) {
                        ((ld) this).field_e.field_f = ((ld) this).field_e.field_f + 3;
                        break L11;
                      } else {
                        break L11;
                      }
                    }
                  }
                }
                L24: {
                  if (((ld) this).field_e.field_f > 0) {
                    break L24;
                  } else {
                    ((ld) this).field_e.field_f = ((ld) this).field_e.field_e;
                    break L24;
                  }
                }
                if (((ld) this).field_e.field_e <= ((ld) this).field_e.field_f) {
                  ((ld) this).field_e.field_f = 0;
                  break L6;
                } else {
                  break L6;
                }
              } else {
                L25: {
                  if (98 == di.field_c) {
                    break L25;
                  } else {
                    if (di.field_c != 96) {
                      L26: {
                        if (di.field_c == 99) {
                          break L26;
                        } else {
                          if (di.field_c != 97) {
                            break L6;
                          } else {
                            break L26;
                          }
                        }
                      }
                      ((ld) this).field_e.field_g = false;
                      ((ld) this).field_e.field_f = 1;
                      break L6;
                    } else {
                      break L25;
                    }
                  }
                }
                ((ld) this).field_e.field_g = false;
                ((ld) this).field_e.field_f = 0;
                break L6;
              }
            }
          } else {
            ((ld) this).field_e.d(-1);
            break L6;
          }
        }
    }

    final void a(boolean param0, byte param1) {
        int var3 = 0;
        if (11 == ((ld) this).field_c) {
            var3 = -1;
        }
        if (((ld) this).field_c == 0) {
            if (!(-1 == ((ld) this).field_e.field_f)) {
                var3 = ((ld) this).field_e.field_f;
            }
        }
        if (((ld) this).field_c == 1) {
            if (((ld) this).field_e.field_f != -1) {
                if (hl.field_f != -1) {
                    var3 = ((ld) this).field_e.field_f;
                }
            }
        }
        if (!(((ld) this).field_c != 3)) {
            var3 = 1;
        }
        ((ld) this).field_e.a(var3, this.a(ob.field_g, false, ck.field_c), param0, 113);
        if (param1 < 83) {
            field_b = -113L;
        }
        ie.field_y = -1;
        if (((ld) this).field_c == 11) {
            ti.a(param0, 0);
        }
    }

    private final void a(int param0, int param1) {
        L0: {
          L1: {
            th.field_a[param1].field_e.field_f = -1;
            if (0 < hb.field_g) {
              break L1;
            } else {
              if (param0 < 3) {
                break L1;
              } else {
                ek.a(-126, true, 11);
                break L0;
              }
            }
          }
          bf.field_h = null;
          ob.field_b = null;
          sd.field_a = new j(param0);
          mf.h(-8372);
          break L0;
        }
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_3_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          v.field_O.a(0, 0);
          oi.field_f.d(0, 90);
          if (lf.field_b >= 100) {
            stackOut_2_0 = 100;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = lf.field_b;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var3 = stackIn_3_0;
          if (gf.field_b == 0) {
            var2 = 0;
            break L1;
          } else {
            if (gf.field_b != 1) {
              var2 = -240 + (int)(Math.cos((double)(var3 + 100) * 0.031415926535897934) * -240.0);
              break L1;
            } else {
              var2 = (int)(-240.0 * Math.cos((double)var3 * 0.031415926535897934)) + -240;
              break L1;
            }
          }
        }
        L2: {
          var2 = var2 + kc.field_r;
          this.a(we.field_g, 701, var2, -50);
          var4 = var2 + 125;
          var5 = 198;
          var6 = (31 - -cb.field_b.field_x) / 2;
          na.field_c.a(50, var4);
          cb.field_b.c(hd.field_O, var5, var4 - -var6, 4210752, -1);
          wj.e(50, var4 + 33, 540, 0, 25);
          var4 += 40;
          ul.field_h.a(50, var4);
          qb.field_d.a(83, var4);
          lk.field_k.a(116, var4);
          lb.field_D.a(149, var4);
          cb.field_b.c(ch.field_w, var5, var6 + var4, 4210752, -1);
          wj.e(50, var4 + 33, 540, 0, 25);
          var4 += 40;
          if (param0 < -9) {
            break L2;
          } else {
            this.b(false);
            break L2;
          }
        }
        jl.field_h.a(50, var4);
        cb.field_b.c(mk.field_a, var5, var4 - -var6, 4210752, -1);
        wj.e(50, var4 + 33, 540, 0, 25);
        var4 += 40;
        wg.field_c.a(50, var4);
        cb.field_b.c(hj.field_c, var5, var4 + var6, 4210752, -1);
        wj.e(50, var4 - -33, 540, 0, 25);
        var4 += 56;
        lc.field_s.a(50, var4);
        ki.field_b.a(83, var4 + -16);
        fk.field_l.a(83, 17 + var4);
        si.field_D.a(116, var4);
        cb.field_b.c(fm.field_c, var5, var4 + var6, 4210752, -1);
        var7 = di.field_e[0];
        var8 = 480 + (30 + var2);
        var9 = 50;
        var10 = 60 + var8;
        ri.field_b.a(var9, var10);
        var9 += 34;
        of.field_x.a(var9, var10);
        var9 += 34;
        re.field_d.a(var9, var10);
        var9 += 102;
        od.field_k.a(var9, var10);
        var9 += 34;
        qc.field_a.a(var9, var10);
        var9 += 34;
        p.field_e.a(var9, var10);
        var9 += 68;
        var11 = 0;
        L3: while (true) {
          if (var11 >= 5) {
            L4: {
              var11 = (int)((double)ni.field_q.field_x * 14.5);
              int discarded$1 = ni.field_q.a(var7, 50, var8, 540, var11, 0, 16777215, 0, 0, ni.field_q.field_x);
              wj.d(40, var8, 560, var11, 1);
              if (0 == gf.field_b) {
                stackOut_15_0 = lf.field_b;
                stackIn_16_0 = stackOut_15_0;
                break L4;
              } else {
                stackOut_14_0 = 56;
                stackIn_16_0 = stackOut_14_0;
                break L4;
              }
            }
            var12 = stackIn_16_0;
            dj.a(56, 80, var12, false, -10 + ul.field_e[((ld) this).field_c]);
            return;
          } else {
            var9 += 34;
            c.field_a[var11].a(var9, var10);
            var11++;
            continue L3;
          }
        }
    }

    private final void a(boolean param0, int param1) {
        ((ld) this).field_e.a(this.a(ob.field_g, false, ck.field_c), (byte) 3, param0);
    }

    private final void a(boolean param0) {
        int stackIn_1_0 = 0;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackOut_0_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = 0;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (hl.field_d) {
            stackOut_2_0 = stackIn_2_0;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = stackIn_1_0;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          L2: {
            if (stackIn_3_0 == stackIn_3_1) {
              break L2;
            } else {
              if (td.field_g[sd.field_a.field_q] >= ul.field_d) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          ek.a(-63, false, -1);
          ul.field_d = 0;
          break L1;
        }
    }

    private final int g(int param0) {
        return -4 > kh.field_c % 12 ? 16711680 : 0;
    }

    private final void c(boolean param0) {
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var11 = new int[pc.field_b.length];
        var10 = var11;
        var9 = var10;
        var8 = var9;
        var2 = var8;
        var3 = pc.field_b.length - 1;
        L0: while (true) {
          if (var3 < 0) {
            return;
          } else {
            L1: {
              var4 = l.field_n[sd.field_a.field_q][var3];
              var5 = kc.field_o[sd.field_a.field_q][var3];
              if (ul.field_d > var4) {
                var2[var3] = ul.field_d + -var4;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (var5 < ul.field_d) {
                var2[var3] = 100 - (-var5 + ul.field_d);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (var11[var3] >= 0) {
                if (var11[var3] > 100) {
                  var11[var3] = 100;
                  break L3;
                } else {
                  break L3;
                }
              } else {
                var11[var3] = 0;
                break L3;
              }
            }
            var6 = (int)((double)var11[var3] * 2.55);
            if (var6 > 0) {
              pc.field_b[var3].a(-50 + var11[var3] / 2, -50 + var11[var3] / 2, var6);
              int discarded$1 = cb.field_b.a(mg.field_a[sd.field_a.field_q][var3], 225, kj.field_f[sd.field_a.field_q][var3], 405, 640, var6 * 65793, -1, 0, 0, cb.field_b.field_x);
              var3--;
              continue L0;
            } else {
              var3--;
              continue L0;
            }
          }
        }
    }

    private final void a(boolean param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        jb var7 = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        String[] var15_ref_String__ = null;
        int var16 = 0;
        int var17 = 0;
        int var18_int = 0;
        nh var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        String var22 = null;
        int stackIn_5_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_63_0 = 0;
        String stackIn_82_0 = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        String stackOut_81_0 = null;
        String stackOut_80_0 = null;
        L0: {
          var21 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var4 = this.a((byte) -94, param2);
          var5 = this.b(param2, param0);
          var6 = ul.field_f[((ld) this).field_c];
          var7 = cb.field_b;
          if (param0) {
            break L0;
          } else {
            field_f = null;
            break L0;
          }
        }
        L1: {
          var8 = ul.field_j[((ld) this).field_c][param2];
          var22 = hg.field_ob[var8];
          var9 = var22;
          if (param1) {
            stackOut_4_0 = 16711680;
            stackIn_5_0 = stackOut_4_0;
            break L1;
          } else {
            stackOut_3_0 = 4210752;
            stackIn_5_0 = stackOut_3_0;
            break L1;
          }
        }
        L2: {
          var10 = stackIn_5_0;
          var11 = var5;
          var12 = lf.field_b * 5;
          if (((ld) this).field_c == 3) {
            if (0 != gf.field_b) {
              stackOut_9_0 = 1;
              stackIn_11_0 = stackOut_9_0;
              break L2;
            } else {
              stackOut_8_0 = 0;
              stackIn_11_0 = stackOut_8_0;
              break L2;
            }
          } else {
            stackOut_6_0 = 0;
            stackIn_11_0 = stackOut_6_0;
            break L2;
          }
        }
        L3: {
          L4: {
            var13 = stackIn_11_0;
            if (re.field_e < var12) {
              break L4;
            } else {
              if (var13 != 0) {
                break L4;
              } else {
                break L3;
              }
            }
          }
          L5: {
            var14 = (int)((0.0 + (double)(-re.field_e + var12)) * 256.0 / (0.0 + (double)(lg.field_f + -re.field_e)));
            if (var13 == 0) {
              break L5;
            } else {
              var14 = 256;
              break L5;
            }
          }
          L6: {
            if (var14 < 0) {
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              break L6;
            } else {
              stackOut_17_0 = var14;
              stackIn_19_0 = stackOut_17_0;
              break L6;
            }
          }
          L7: {
            var14 = stackIn_19_0;
            if (var14 <= 256) {
              stackOut_21_0 = var14;
              stackIn_22_0 = stackOut_21_0;
              break L7;
            } else {
              stackOut_20_0 = 256;
              stackIn_22_0 = stackOut_20_0;
              break L7;
            }
          }
          var14 = stackIn_22_0;
          if (8 != var8) {
            L8: {
              if (var8 == 19) {
                var9 = var22 + kk.field_c[sd.field_e];
                break L8;
              } else {
                if (18 != var8) {
                  break L8;
                } else {
                  var9 = var22 + s.field_d[hc.field_G];
                  break L8;
                }
              }
            }
            L9: {
              if (var9 == null) {
                var9 = "ERROR: missing text";
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              var7.c(var9, var11, var4 + var7.field_x, var10, -1, var14);
              if (!param1) {
                break L10;
              } else {
                if (var9.length() != 0) {
                  var7.a("{", var11, var7.field_x + var4, var10, -1, var14);
                  var7.c("}", var7.b(var9) + var11, var7.field_x + var4, var10, -1, var14);
                  break L10;
                } else {
                  break L10;
                }
              }
            }
            L11: {
              if (var8 == 10) {
                break L11;
              } else {
                if (11 == var8) {
                  break L11;
                } else {
                  break L3;
                }
              }
            }
            L12: {
              n.field_c = cb.field_b.b(hg.field_ob[10]);
              var15 = cb.field_b.b(hg.field_ob[11]);
              if (var15 > n.field_c) {
                n.field_c = var15;
                break L12;
              } else {
                break L12;
              }
            }
            L13: {
              var16 = n.field_c + ul.field_b[((ld) this).field_c] + cb.field_b.b(" ");
              if (var8 != 10) {
                stackOut_62_0 = oa.field_b;
                stackIn_63_0 = stackOut_62_0;
                break L13;
              } else {
                stackOut_61_0 = dg.field_e;
                stackIn_63_0 = stackOut_61_0;
                break L13;
              }
            }
            var17 = stackIn_63_0;
            rk.field_a.a(var16, -1 + (var4 + var6 / 4), var14);
            oi.field_h.a(-(oi.field_h.field_h / 4) + (var17 + var16), var6 / 4 + var4 - 1, var14);
            break L3;
          } else {
            var15_ref_String__ = new String[]{hg.field_ob[20], hg.field_ob[21], hg.field_ob[22]};
            var16 = var7.b(var15_ref_String__[1]) / 2 + 15;
            var18_int = 0;
            L14: while (true) {
              if (3 <= var18_int) {
                return;
              } else {
                L15: {
                  if (pj.field_H) {
                    if (ck.field_c >= -var16 + 320) {
                      if (ck.field_c <= 320 - -var16) {
                        var17 = 1;
                        break L15;
                      } else {
                        var17 = 2;
                        break L15;
                      }
                    } else {
                      var17 = 0;
                      break L15;
                    }
                  } else {
                    var17 = pa.field_d;
                    break L15;
                  }
                }
                L16: {
                  L17: {
                    if (!param1) {
                      break L17;
                    } else {
                      if (var17 == var18_int) {
                        var10 = 16711680;
                        break L16;
                      } else {
                        break L17;
                      }
                    }
                  }
                  var10 = 4210752;
                  break L16;
                }
                L18: {
                  if (pa.field_d != var18_int) {
                    if (!param1) {
                      break L18;
                    } else {
                      if (var18_int != var17) {
                        break L18;
                      } else {
                        var15_ref_String__[var18_int] = "{" + var15_ref_String__[var18_int] + "}";
                        break L18;
                      }
                    }
                  } else {
                    var15_ref_String__[var18_int] = "<lt>" + var15_ref_String__[var18_int] + "<gt>";
                    break L18;
                  }
                }
                var7.b(var15_ref_String__[var18_int], (var18_int - 1) * 2 * var16 + 320, var7.field_x + var4, var10, -1, var14);
                var18_int++;
                continue L14;
              }
            }
          }
        }
        L19: {
          if (26 > var8) {
            break L19;
          } else {
            if (var8 > 34) {
              break L19;
            } else {
              if (!param1) {
                break L19;
              } else {
                L20: {
                  var14 = -26 + var8;
                  var15 = var14 / 3;
                  var16 = var14 % 3;
                  var17 = (int)(-400.0 * Math.exp((double)(-lf.field_b) / 25.0));
                  wj.f(285, 122 + var17 + 40, 300, 110, 16249576);
                  if (var14 >= 0) {
                    L21: {
                      L22: {
                        if (var14 < 3) {
                          break L22;
                        } else {
                          if (hb.field_g <= 0) {
                            var18 = wi.field_a;
                            break L21;
                          } else {
                            break L22;
                          }
                        }
                      }
                      if (var14 <= gf.field_D) {
                        var18 = eb.field_e[var14];
                        break L21;
                      } else {
                        var18 = md.field_f;
                        break L21;
                      }
                    }
                    var19 = 0;
                    L23: while (true) {
                      if (var19 >= 4) {
                        L24: {
                          var19 = 5;
                          wj.a(this.b(param2, true) + -var19, -var19 + this.a((byte) -90, param2), var18.field_y - -10, 2 * var19 + var18.field_w, 4227327, (int)(ji.a(65535, (double)lf.field_b / 10.0) * 128.0 + 128.0));
                          var18.b(this.b(param2, true), this.a((byte) -74, param2), (int)(224.0 - 32.0 * ji.a(65535, (double)lf.field_b / 10.0)), 16777215);
                          if (gf.field_D >= var14) {
                            stackOut_81_0 = tc.field_b[var14];
                            stackIn_82_0 = stackOut_81_0;
                            break L24;
                          } else {
                            stackOut_80_0 = s.field_f;
                            stackIn_82_0 = stackOut_80_0;
                            break L24;
                          }
                        }
                        L25: {
                          var9 = stackIn_82_0;
                          if (var14 < 3) {
                            break L25;
                          } else {
                            if (hb.field_g <= 0) {
                              var9 = s.field_f;
                              break L25;
                            } else {
                              break L25;
                            }
                          }
                        }
                        L26: {
                          L27: {
                            cb.field_b.c(var9, 285, 64 + (var17 - -122), 0, -1);
                            var20 = 0;
                            if (hb.field_g > 0) {
                              break L27;
                            } else {
                              if (var14 < 3) {
                                break L27;
                              } else {
                                var20 = this.g(0);
                                var9 = s.field_h;
                                break L26;
                              }
                            }
                          }
                          if (gf.field_D >= var14) {
                            var9 = le.field_a[var14];
                            break L26;
                          } else {
                            var20 = this.g(0);
                            var9 = pe.field_i;
                            break L26;
                          }
                        }
                        int discarded$1 = cb.field_b.a(var9, 285, var17 + 216, 320, 240, var20, -1, 0, 0, cb.field_b.field_x);
                        if (var14 > gf.field_D) {
                          break L20;
                        } else {
                          L28: {
                            L29: {
                              if (hb.field_g > 0) {
                                break L29;
                              } else {
                                if (var14 >= 3) {
                                  var9 = null;
                                  break L28;
                                } else {
                                  break L29;
                                }
                              }
                            }
                            var9 = af.field_a;
                            break L28;
                          }
                          cb.field_b.c(var9, 285, 94 + (122 + var17) + 100, 0, -1);
                          break L20;
                        }
                      } else {
                        wj.a(this.b(param2, true) + -var19, this.a((byte) -113, param2) - var19, var19 * 2 + var18.field_y, var18.field_w - -(var19 * 2), 128, 255 + -(64 * var19));
                        var19++;
                        continue L23;
                      }
                    }
                  } else {
                    break L20;
                  }
                }
                if (var15 == -1) {
                  break L19;
                } else {
                  if (-1 == var16) {
                    break L19;
                  } else {
                    cb.field_b.c(a.a(5044, ek.field_q, new String[2]), 285, var17 + 142, 0, -1);
                    break L19;
                  }
                }
              }
            }
          }
        }
    }

    final void l(int param0) {
        int var2 = 0;
        int var3 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_46_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        L0: {
          var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (((ld) this).field_c != 8) {
            break L0;
          } else {
            if (9 != gf.field_D) {
              break L0;
            } else {
              tc.field_d = 5;
              break L0;
            }
          }
        }
        if (11 != ((ld) this).field_c) {
          L1: {
            L2: {
              if (((ld) this).field_c == 0) {
                break L2;
              } else {
                if (-2 != ((ld) this).field_c) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            tc.field_d = ((ld) this).field_c;
            qk.field_c = false;
            break L1;
          }
          L3: {
            if (((ld) this).field_a != 0) {
              break L3;
            } else {
              ((ld) this).field_a = mh.field_f;
              break L3;
            }
          }
          L4: {
            kh.field_c = kh.field_c + 1;
            if (param0 == -14689) {
              break L4;
            } else {
              field_b = -52L;
              break L4;
            }
          }
          L5: {
            if (((ld) this).field_c != 3) {
              break L5;
            } else {
              if (jc.field_g > 0) {
                kc.field_r = kc.field_r - jc.field_g / 2;
                if (0 != (lf.field_b & 1)) {
                  kc.field_r = kc.field_r - 1;
                  jc.field_g = jc.field_g - 1;
                  break L5;
                } else {
                  break L5;
                }
              } else {
                break L5;
              }
            }
          }
          L6: {
            L7: {
              if (((ld) this).field_c == 6) {
                break L7;
              } else {
                if (7 == ((ld) this).field_c) {
                  break L7;
                } else {
                  break L6;
                }
              }
            }
            this.e(110);
            break L6;
          }
          L8: while (true) {
            if (!th.a(24)) {
              L9: {
                ((ld) this).field_e.a(0, this.a(ob.field_g, false, ck.field_c), this.a(ih.field_R, false, ae.field_gb));
                if (-1 != ((ld) this).field_e.field_f) {
                  this.a(((ld) this).field_e.field_f, 80, true);
                  break L9;
                } else {
                  break L9;
                }
              }
              jk.field_J = ob.field_g;
              pa.field_b = ck.field_c;
              return;
            } else {
              if (di.field_c != 13) {
                this.i(-97);
                if (((ld) this).field_e.field_f == -1) {
                  continue L8;
                } else {
                  this.a(((ld) this).field_e.field_f, 80, false);
                  continue L8;
                }
              } else {
                if (((ld) this).field_c == 1) {
                  L10: {
                    r.field_d = -1;
                    if (hb.field_g <= 0) {
                      stackOut_45_0 = 11;
                      stackIn_46_0 = stackOut_45_0;
                      break L10;
                    } else {
                      stackOut_44_0 = 0;
                      stackIn_46_0 = stackOut_44_0;
                      break L10;
                    }
                  }
                  tc.field_d = stackIn_46_0;
                  continue L8;
                } else {
                  if (((ld) this).field_c != 5) {
                    r.field_d = tc.field_d;
                    continue L8;
                  } else {
                    continue L8;
                  }
                }
              }
            }
          }
        } else {
          L11: {
            stackOut_4_0 = 21;
            stackIn_6_0 = stackOut_4_0;
            stackIn_5_0 = stackOut_4_0;
            if (eh.a(-875)) {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = 0;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              break L11;
            } else {
              stackOut_5_0 = stackIn_5_0;
              stackOut_5_1 = 1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              break L11;
            }
          }
          L12: {
            var2 = wa.a((byte) stackIn_7_0, stackIn_7_1 != 0);
            if (var2 != 3) {
              break L12;
            } else {
              L13: {
                if (null != df.field_l) {
                  qk.a(true);
                  break L13;
                } else {
                  break L13;
                }
              }
              p.a(-161, nb.a(97));
              break L12;
            }
          }
          L14: {
            if (var2 == 1) {
              ek.a(-73, false, 0);
              break L14;
            } else {
              break L14;
            }
          }
          L15: {
            if (2 == var2) {
              ek.a(-112, true, 0);
              break L15;
            } else {
              break L15;
            }
          }
          return;
        }
    }

    private final int a(int param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (!param1) {
            break L0;
          } else {
            field_b = -6L;
            break L0;
          }
        }
        var4 = 0;
        L1: while (true) {
          if (ul.field_j[((ld) this).field_c].length <= var4) {
            return -1;
          } else {
            var5 = this.a((byte) -109, var4);
            if (this.a(var4, false)) {
              if (param2 >= this.b(var4, true)) {
                if (param2 < this.a(var4, (byte) 36)) {
                  if (var5 <= param0) {
                    if (param0 < this.b(var4, (byte) -59) + var5) {
                      return var4;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              } else {
                var4++;
                continue L1;
              }
            } else {
              var4++;
              continue L1;
            }
          }
        }
    }

    private final void a(byte param0) {
        if (100 <= lf.field_b) {
            lf.field_b = 0;
        } else {
            lf.field_b = -lf.field_b + 100;
        }
        if (param0 > -17) {
            this.e(121);
        }
    }

    private final void b(byte param0) {
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          if (hl.field_d) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          L2: {
            if (stackIn_3_0 == 0) {
              break L2;
            } else {
              if (ul.field_d > td.field_g[sd.field_a.field_q]) {
                break L2;
              } else {
                break L1;
              }
            }
          }
          ek.a(-125, true, -1);
          ul.field_d = 0;
          break L1;
        }
    }

    private final void b(int param0) {
        L0: {
          if (param0 == -9180) {
            break L0;
          } else {
            ((ld) this).field_g = -103;
            break L0;
          }
        }
        L1: {
          L2: {
            if (hl.field_d) {
              break L2;
            } else {
              if (ul.field_d <= td.field_g[sd.field_a.field_q]) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          ek.a(-79, false, -1);
          ul.field_d = 0;
          break L1;
        }
    }

    private final void a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        jb var7_ref_jb = null;
        String[] var8_ref_String__ = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_71_0 = 0;
        int stackIn_100_0 = 0;
        int stackIn_205_0 = 0;
        int stackIn_210_0 = 0;
        int stackOut_204_0 = 0;
        int stackOut_203_0 = 0;
        int stackOut_209_0 = 0;
        int stackOut_208_0 = 0;
        int stackOut_99_0 = 0;
        int stackOut_98_0 = 0;
        int stackOut_70_0 = 0;
        int stackOut_69_0 = 0;
        L0: {
          var12 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var4 = r.field_d;
          var5 = ul.field_j[((ld) this).field_c][param0];
          if (var5 == 10) {
            break L0;
          } else {
            if (11 == var5) {
              break L0;
            } else {
              if (!((ld) this).field_e.e(param1 + -828)) {
                break L0;
              } else {
                this.j(13);
                break L0;
              }
            }
          }
        }
        L1: {
          var7 = var5;
          if (var7 == 0) {
            if (!((ld) this).field_e.e(-748)) {
              break L1;
            } else {
              L2: {
                if (nj.field_j < 2) {
                  break L2;
                } else {
                  if (ck.field_f[82]) {
                    L3: {
                      if (null == nb.field_a) {
                        nb.field_a = vj.a((byte) 74);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    sd.field_a = new j(7);
                    sd.field_a.field_G = nb.field_a;
                    ek.a(-57, param2, -1);
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              bf.field_h = null;
              ob.field_b = null;
              ek.a(-126, param2, 10);
              tc.field_d = 0;
              break L1;
            }
          } else {
            if (1 != var7) {
              if (var7 != 2) {
                if (var7 != 12) {
                  if (var7 != 3) {
                    if (4 != var7) {
                      if (var7 == 5) {
                        if (((ld) this).field_e.e(-748)) {
                          this.c(-109, param2);
                          break L1;
                        } else {
                          break L1;
                        }
                      } else {
                        if (var7 == 14) {
                          if (!((ld) this).field_e.e(-748)) {
                            break L1;
                          } else {
                            ek.a(param1 ^ -48, param2, 11);
                            ej.field_h = 0;
                            gf.field_D = 0;
                            hi.field_j = 0;
                            nf.field_x.g(255);
                            break L1;
                          }
                        } else {
                          if (var7 == 6) {
                            if (!((ld) this).field_e.e(param1 ^ -700)) {
                              break L1;
                            } else {
                              if (tc.field_d == 5) {
                                this.c(79, param2);
                                break L1;
                              } else {
                                ek.a(-48, param2, tc.field_d);
                                break L1;
                              }
                            }
                          } else {
                            if (var7 != 7) {
                              if (var7 != 8) {
                                if (var7 == 35) {
                                  if (((ld) this).field_e.e(-748)) {
                                    pa.field_d = 0;
                                    break L1;
                                  } else {
                                    break L1;
                                  }
                                } else {
                                  if (var7 != 36) {
                                    if (37 == var7) {
                                      if (((ld) this).field_e.e(-748)) {
                                        pa.field_d = 2;
                                        break L1;
                                      } else {
                                        break L1;
                                      }
                                    } else {
                                      if (13 != var7) {
                                        if (9 == var7) {
                                          if (!((ld) this).field_e.e(param1 + -828)) {
                                            break L1;
                                          } else {
                                            DrPhlogistonSavesTheEarth.a(nb.a(118), -119);
                                            break L1;
                                          }
                                        } else {
                                          if (var7 != 15) {
                                            if (var7 == 16) {
                                              if (((ld) this).field_e.e(-748)) {
                                                L4: {
                                                  var7 = sd.field_a.field_q;
                                                  var8 = l.field_n[var7].length;
                                                  if (((ld) this).field_c != 6) {
                                                    break L4;
                                                  } else {
                                                    if (~l.field_n[var7][-1 + var8] > ~ul.field_d) {
                                                      hl.field_d = true;
                                                      break L1;
                                                    } else {
                                                      var13 = 0;
                                                      var9 = var13;
                                                      L5: while (true) {
                                                        if (-1 + var8 <= var13) {
                                                          break L4;
                                                        } else {
                                                          L6: {
                                                            if (ul.field_d <= l.field_n[var7][var13]) {
                                                              break L6;
                                                            } else {
                                                              if (ul.field_d >= l.field_n[var7][1 + var13]) {
                                                                break L6;
                                                              } else {
                                                                ul.field_d = l.field_n[var7][var13 + 1];
                                                                break L6;
                                                              }
                                                            }
                                                          }
                                                          var13++;
                                                          continue L5;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                                break L1;
                                              } else {
                                                break L1;
                                              }
                                            } else {
                                              if (var7 != 17) {
                                                if (var7 != 18) {
                                                  if (19 == var7) {
                                                    L7: {
                                                      if (!((ld) this).field_e.b((byte) 59)) {
                                                        break L7;
                                                      } else {
                                                        sd.field_e = sd.field_e + 1;
                                                        if (2 < sd.field_e) {
                                                          sd.field_e = 0;
                                                          break L7;
                                                        } else {
                                                          break L7;
                                                        }
                                                      }
                                                    }
                                                    if (((ld) this).field_e.g(-85)) {
                                                      sd.field_e = sd.field_e - 1;
                                                      if (sd.field_e < 0) {
                                                        sd.field_e = 2;
                                                        break L1;
                                                      } else {
                                                        break L1;
                                                      }
                                                    } else {
                                                      break L1;
                                                    }
                                                  } else {
                                                    if (var7 == 23) {
                                                      if (((ld) this).field_e.e(param1 ^ -700)) {
                                                        gf.field_b = 1;
                                                        al.a((byte) -40);
                                                        this.a((byte) -86);
                                                        break L1;
                                                      } else {
                                                        break L1;
                                                      }
                                                    } else {
                                                      if (var7 != 24) {
                                                        if (var7 == 10) {
                                                          L8: {
                                                            var6 = 0;
                                                            if (!((ld) this).field_e.a(false)) {
                                                              break L8;
                                                            } else {
                                                              lc.a(0, (byte) 24);
                                                              var6 = 1;
                                                              break L8;
                                                            }
                                                          }
                                                          L9: {
                                                            if (!((ld) this).field_e.i(-113)) {
                                                              break L9;
                                                            } else {
                                                              lc.a(80, (byte) 24);
                                                              var6 = 1;
                                                              break L9;
                                                            }
                                                          }
                                                          L10: {
                                                            if (!((ld) this).field_e.a(-14164)) {
                                                              break L10;
                                                            } else {
                                                              L11: {
                                                                var7 = ck.field_c + -284;
                                                                if (var7 <= 0) {
                                                                  lc.a(0, (byte) 24);
                                                                  break L11;
                                                                } else {
                                                                  if (var7 < 80) {
                                                                    lc.a(var7, (byte) 24);
                                                                    break L11;
                                                                  } else {
                                                                    lc.a(80, (byte) 24);
                                                                    break L11;
                                                                  }
                                                                }
                                                              }
                                                              var6 = 1;
                                                              break L10;
                                                            }
                                                          }
                                                          L12: {
                                                            if (((ld) this).field_e.h(-62)) {
                                                              L13: {
                                                                var7 = dg.field_e;
                                                                rd.h(param1 + 220);
                                                                if (!this.b(var7, -90)) {
                                                                  stackOut_204_0 = 0;
                                                                  stackIn_205_0 = stackOut_204_0;
                                                                  break L13;
                                                                } else {
                                                                  stackOut_203_0 = 1;
                                                                  stackIn_205_0 = stackOut_203_0;
                                                                  break L13;
                                                                }
                                                              }
                                                              var6 = stackIn_205_0;
                                                              break L12;
                                                            } else {
                                                              break L12;
                                                            }
                                                          }
                                                          L14: {
                                                            if (!((ld) this).field_e.b(param1 ^ 43)) {
                                                              break L14;
                                                            } else {
                                                              L15: {
                                                                var7 = dg.field_e;
                                                                dg.a((byte) 34);
                                                                if (!this.b(var7, -59)) {
                                                                  stackOut_209_0 = 0;
                                                                  stackIn_210_0 = stackOut_209_0;
                                                                  break L15;
                                                                } else {
                                                                  stackOut_208_0 = 1;
                                                                  stackIn_210_0 = stackOut_208_0;
                                                                  break L15;
                                                                }
                                                              }
                                                              var6 = stackIn_210_0;
                                                              break L14;
                                                            }
                                                          }
                                                          if (var6 == 0) {
                                                            break L1;
                                                          } else {
                                                            eg.field_a.j(dg.field_e);
                                                            if (eg.field_a.m()) {
                                                              eg.field_a.i(-1);
                                                              od.a(param1 + -1630758088, eg.field_a);
                                                              break L1;
                                                            } else {
                                                              break L1;
                                                            }
                                                          }
                                                        } else {
                                                          if (var7 != 11) {
                                                            if (var7 == 26) {
                                                              if (((ld) this).field_e.e(-748)) {
                                                                this.a(0, param1 ^ 81);
                                                                break L1;
                                                              } else {
                                                                break L1;
                                                              }
                                                            } else {
                                                              if (var7 != 27) {
                                                                if (28 != var7) {
                                                                  if (var7 == 29) {
                                                                    if (((ld) this).field_e.e(-748)) {
                                                                      L16: {
                                                                        if (gf.field_D < 3) {
                                                                          break L16;
                                                                        } else {
                                                                          if (0 < hb.field_g) {
                                                                            this.a(3, 1);
                                                                            break L1;
                                                                          } else {
                                                                            break L16;
                                                                          }
                                                                        }
                                                                      }
                                                                      kh.field_c = -50;
                                                                      break L1;
                                                                    } else {
                                                                      break L1;
                                                                    }
                                                                  } else {
                                                                    if (30 != var7) {
                                                                      if (var7 == 31) {
                                                                        if (!((ld) this).field_e.e(-748)) {
                                                                          break L1;
                                                                        } else {
                                                                          L17: {
                                                                            if (gf.field_D < 5) {
                                                                              break L17;
                                                                            } else {
                                                                              if (hb.field_g > 0) {
                                                                                this.a(5, 1);
                                                                                break L1;
                                                                              } else {
                                                                                break L17;
                                                                              }
                                                                            }
                                                                          }
                                                                          kh.field_c = -50;
                                                                          break L1;
                                                                        }
                                                                      } else {
                                                                        if (var7 != 32) {
                                                                          if (var7 == 33) {
                                                                            if (!((ld) this).field_e.e(-748)) {
                                                                              break L1;
                                                                            } else {
                                                                              L18: {
                                                                                if (gf.field_D < 7) {
                                                                                  break L18;
                                                                                } else {
                                                                                  if (hb.field_g <= 0) {
                                                                                    break L18;
                                                                                  } else {
                                                                                    this.a(7, param1 ^ 81);
                                                                                    break L1;
                                                                                  }
                                                                                }
                                                                              }
                                                                              kh.field_c = -50;
                                                                              break L1;
                                                                            }
                                                                          } else {
                                                                            if (34 != var7) {
                                                                              break L1;
                                                                            } else {
                                                                              if (((ld) this).field_e.e(-748)) {
                                                                                L19: {
                                                                                  if (gf.field_D < 8) {
                                                                                    break L19;
                                                                                  } else {
                                                                                    if (hb.field_g > 0) {
                                                                                      this.a(8, 1);
                                                                                      break L1;
                                                                                    } else {
                                                                                      break L19;
                                                                                    }
                                                                                  }
                                                                                }
                                                                                kh.field_c = -50;
                                                                                break L1;
                                                                              } else {
                                                                                break L1;
                                                                              }
                                                                            }
                                                                          }
                                                                        } else {
                                                                          if (((ld) this).field_e.e(param1 + -828)) {
                                                                            L20: {
                                                                              if (gf.field_D < 6) {
                                                                                break L20;
                                                                              } else {
                                                                                if (hb.field_g <= 0) {
                                                                                  break L20;
                                                                                } else {
                                                                                  this.a(6, 1);
                                                                                  break L1;
                                                                                }
                                                                              }
                                                                            }
                                                                            kh.field_c = -50;
                                                                            break L1;
                                                                          } else {
                                                                            break L1;
                                                                          }
                                                                        }
                                                                      }
                                                                    } else {
                                                                      if (!((ld) this).field_e.e(-748)) {
                                                                        break L1;
                                                                      } else {
                                                                        L21: {
                                                                          if (gf.field_D < 4) {
                                                                            break L21;
                                                                          } else {
                                                                            if (0 < hb.field_g) {
                                                                              this.a(4, param1 + -79);
                                                                              break L1;
                                                                            } else {
                                                                              break L21;
                                                                            }
                                                                          }
                                                                        }
                                                                        kh.field_c = -50;
                                                                        break L1;
                                                                      }
                                                                    }
                                                                  }
                                                                } else {
                                                                  if (((ld) this).field_e.e(-748)) {
                                                                    if (gf.field_D >= 2) {
                                                                      this.a(2, 1);
                                                                      break L1;
                                                                    } else {
                                                                      kh.field_c = -50;
                                                                      break L1;
                                                                    }
                                                                  } else {
                                                                    break L1;
                                                                  }
                                                                }
                                                              } else {
                                                                if (((ld) this).field_e.e(-748)) {
                                                                  if (gf.field_D < 1) {
                                                                    kh.field_c = -50;
                                                                    break L1;
                                                                  } else {
                                                                    this.a(1, 1);
                                                                    break L1;
                                                                  }
                                                                } else {
                                                                  break L1;
                                                                }
                                                              }
                                                            }
                                                          } else {
                                                            L22: {
                                                              if (!((ld) this).field_e.a(false)) {
                                                                break L22;
                                                              } else {
                                                                wk.a(80, 0);
                                                                break L22;
                                                              }
                                                            }
                                                            L23: {
                                                              if (!((ld) this).field_e.i(param1 + 33)) {
                                                                break L23;
                                                              } else {
                                                                wk.a(80, 80);
                                                                break L23;
                                                              }
                                                            }
                                                            L24: {
                                                              if (((ld) this).field_e.a(param1 ^ -14084)) {
                                                                var7 = -284 + ck.field_c;
                                                                if (var7 <= 0) {
                                                                  wk.a(param1, 0);
                                                                  break L24;
                                                                } else {
                                                                  if (var7 >= 80) {
                                                                    wk.a(param1, 80);
                                                                    break L24;
                                                                  } else {
                                                                    wk.a(param1, var7);
                                                                    break L24;
                                                                  }
                                                                }
                                                              } else {
                                                                break L24;
                                                              }
                                                            }
                                                            L25: {
                                                              if (((ld) this).field_e.h(76)) {
                                                                jd.g((byte) -104);
                                                                break L25;
                                                              } else {
                                                                break L25;
                                                              }
                                                            }
                                                            if (!((ld) this).field_e.b(93)) {
                                                              break L1;
                                                            } else {
                                                              pk.e(60);
                                                              break L1;
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        if (((ld) this).field_e.e(-748)) {
                                                          gf.field_b = 2;
                                                          al.a((byte) -99);
                                                          this.a((byte) -82);
                                                          break L1;
                                                        } else {
                                                          break L1;
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  L26: {
                                                    if (((ld) this).field_e.b((byte) 86)) {
                                                      hc.field_G = hc.field_G + 1;
                                                      if (2 < hc.field_G) {
                                                        hc.field_G = 0;
                                                        break L26;
                                                      } else {
                                                        break L26;
                                                      }
                                                    } else {
                                                      break L26;
                                                    }
                                                  }
                                                  if (!((ld) this).field_e.g(-85)) {
                                                    break L1;
                                                  } else {
                                                    hc.field_G = hc.field_G - 1;
                                                    if (hc.field_G >= 0) {
                                                      break L1;
                                                    } else {
                                                      hc.field_G = 2;
                                                      break L1;
                                                    }
                                                  }
                                                }
                                              } else {
                                                if (!((ld) this).field_e.e(-748)) {
                                                  break L1;
                                                } else {
                                                  hl.field_d = true;
                                                  break L1;
                                                }
                                              }
                                            }
                                          } else {
                                            if (!((ld) this).field_e.e(-748)) {
                                              break L1;
                                            } else {
                                              if (8 == sd.field_a.field_q) {
                                                sd.field_a.field_q = sd.field_a.field_q + 1;
                                                ek.a(-72, param2, 2);
                                                break L1;
                                              } else {
                                                mf.h(param1 + -8452);
                                                break L1;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        if (((ld) this).field_e.e(-748)) {
                                          if (oh.a(0)) {
                                            L27: {
                                              if (((ld) this).field_c == 4) {
                                                break L27;
                                              } else {
                                                if (((ld) this).field_c == 2) {
                                                  break L27;
                                                } else {
                                                  if (10 == ((ld) this).field_c) {
                                                    break L27;
                                                  } else {
                                                    if (((ld) this).field_c == 5) {
                                                      wl.a(9, 5, 123);
                                                      break L1;
                                                    } else {
                                                      if (11 != ((ld) this).field_c) {
                                                        break L1;
                                                      } else {
                                                        p.a(-161, nb.a(param1 + 43));
                                                        break L1;
                                                      }
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                            wl.a(((ld) this).field_c, ((ld) this).field_c, 57);
                                            break L1;
                                          } else {
                                            break L1;
                                          }
                                        } else {
                                          break L1;
                                        }
                                      }
                                    }
                                  } else {
                                    if (!((ld) this).field_e.e(-748)) {
                                      break L1;
                                    } else {
                                      pa.field_d = 1;
                                      break L1;
                                    }
                                  }
                                }
                              } else {
                                L28: {
                                  if (!((ld) this).field_e.e(-748)) {
                                    break L28;
                                  } else {
                                    var7_ref_jb = cb.field_b;
                                    var8_ref_String__ = new String[]{hg.field_ob[20], hg.field_ob[21], hg.field_ob[22]};
                                    var9 = var7_ref_jb.b(var8_ref_String__[1]);
                                    var10 = -1;
                                    var11 = 0;
                                    L29: while (true) {
                                      if (var11 >= 3) {
                                        if (!param2) {
                                          break L28;
                                        } else {
                                          if (var10 == -1) {
                                            break L28;
                                          } else {
                                            pa.field_d = var10;
                                            pj.field_H = true;
                                            break L28;
                                          }
                                        }
                                      } else {
                                        L30: {
                                          if (~(320 - var9) < ~ck.field_c) {
                                            var10 = 0;
                                            break L30;
                                          } else {
                                            if (ck.field_c > var9 + 320) {
                                              var10 = 2;
                                              break L30;
                                            } else {
                                              var10 = 1;
                                              break L30;
                                            }
                                          }
                                        }
                                        var11++;
                                        continue L29;
                                      }
                                    }
                                  }
                                }
                                L31: {
                                  L32: {
                                    if (pa.field_b != ck.field_c) {
                                      break L32;
                                    } else {
                                      if (ob.field_g == jk.field_J) {
                                        break L31;
                                      } else {
                                        break L32;
                                      }
                                    }
                                  }
                                  pj.field_H = true;
                                  break L31;
                                }
                                L33: {
                                  if (!((ld) this).field_e.h(116)) {
                                    break L33;
                                  } else {
                                    pj.field_H = false;
                                    pa.field_d = pa.field_d - 1;
                                    break L33;
                                  }
                                }
                                L34: {
                                  if (((ld) this).field_e.b(param1 + 15)) {
                                    pa.field_d = pa.field_d + 1;
                                    pj.field_H = false;
                                    break L34;
                                  } else {
                                    break L34;
                                  }
                                }
                                if (pa.field_d >= 0) {
                                  if (pa.field_d <= 2) {
                                    break L1;
                                  } else {
                                    pa.field_d = 0;
                                    break L1;
                                  }
                                } else {
                                  pa.field_d = 2;
                                  break L1;
                                }
                              }
                            } else {
                              if (!((ld) this).field_e.e(-748)) {
                                break L1;
                              } else {
                                L35: {
                                  if (!sd.field_a.C(31578)) {
                                    sd.field_a.d((byte) 120);
                                    break L35;
                                  } else {
                                    ek.a(param1 + -190, param2, 5);
                                    break L35;
                                  }
                                }
                                L36: {
                                  if (hb.field_g <= 0) {
                                    stackOut_99_0 = 11;
                                    stackIn_100_0 = stackOut_99_0;
                                    break L36;
                                  } else {
                                    stackOut_98_0 = 0;
                                    stackIn_100_0 = stackOut_98_0;
                                    break L36;
                                  }
                                }
                                tc.field_d = stackIn_100_0;
                                break L1;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      if (!((ld) this).field_e.e(-748)) {
                        break L1;
                      } else {
                        if (null != df.field_l) {
                          qk.a(true);
                          break L1;
                        } else {
                          s.a(param2, (byte) -121);
                          break L1;
                        }
                      }
                    }
                  } else {
                    if (((ld) this).field_e.e(-748)) {
                      jc.field_g = 31;
                      lf.field_b = 0;
                      gf.field_b = 0;
                      kc.field_r = jc.field_g * (1 + jc.field_g) / 2;
                      al.a((byte) -43);
                      ek.a(param1 ^ -57, param2, 3);
                      tc.field_d = ((ld) this).field_c;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  if (((ld) this).field_e.e(-748)) {
                    ek.a(param1 ^ -127, param2, 4);
                    tc.field_d = ((ld) this).field_c;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                if (!((ld) this).field_e.e(-748)) {
                  break L1;
                } else {
                  ek.a(-85, param2, 2);
                  break L1;
                }
              }
            } else {
              if (((ld) this).field_e.e(-748)) {
                L37: {
                  ek.a(-112, param2, -1);
                  if (hb.field_g > 0) {
                    stackOut_70_0 = 0;
                    stackIn_71_0 = stackOut_70_0;
                    break L37;
                  } else {
                    stackOut_69_0 = 11;
                    stackIn_71_0 = stackOut_69_0;
                    break L37;
                  }
                }
                tc.field_d = stackIn_71_0;
                break L1;
              } else {
                break L1;
              }
            }
          }
        }
        L38: {
          if (param1 == 80) {
            break L38;
          } else {
            field_h = null;
            break L38;
          }
        }
        L39: {
          if (~var4 == ~r.field_d) {
            break L39;
          } else {
            if (r.field_d == -1) {
              break L39;
            } else {
              th.field_a[r.field_d].a(param2, 0);
              break L39;
            }
          }
        }
    }

    private final boolean b(int param0, int param1) {
        int var3 = 0;
        if (!(dg.field_e == param0)) {
            eg.field_a.j(dg.field_e);
            eg.field_a.i(-1);
            od.a(-1630758008, eg.field_a);
        }
        if (param1 >= -21) {
            ((ld) this).field_g = -38;
        }
        return var3 != 0;
    }

    private final void b(boolean param0, byte param1) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        he var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        Object var16 = null;
        String var16_ref = null;
        int var17 = 0;
        he var17_ref_he = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        jb var25 = null;
        int stackIn_3_0 = 0;
        he stackIn_6_0 = null;
        int stackIn_11_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_55_0 = 0;
        he stackIn_62_0 = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        he stackOut_5_0 = null;
        he stackOut_4_0 = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_54_0 = 0;
        int stackOut_53_0 = 0;
        he stackOut_61_0 = null;
        he stackOut_60_0 = null;
        L0: {
          var24 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var25 = cb.field_b;
          var4 = (int)(-400.0 * Math.exp((double)(-lf.field_b) / 25.0));
          v.field_O.a(0, var4 / 2 + 200);
          this.c(200 - -(var4 / 2), 62);
          oi.field_f.d(0, var4 / 2 + 200);
          if (!oh.a(0)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 20;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          var6 = var5 + 220;
          if (!param0) {
            stackOut_5_0 = qe.field_k;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = el.field_ub;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var7 = stackIn_6_0;
          this.a(var7, var6, var4, -50);
          var8 = re.field_e;
          if (5 != ((ld) this).field_c) {
            break L2;
          } else {
            var8 += 140;
            break L2;
          }
        }
        L3: {
          dj.a(var8, 75, lf.field_b, false, 385);
          var9 = 34;
          var10 = 133 + var4;
          if (!param0) {
            stackOut_10_0 = hi.field_j;
            stackIn_11_0 = stackOut_10_0;
            break L3;
          } else {
            stackOut_9_0 = ej.field_h;
            stackIn_11_0 = stackOut_9_0;
            break L3;
          }
        }
        var11 = stackIn_11_0;
        var12 = 0;
        var13 = -1;
        var14 = 0;
        L4: while (true) {
          if (sc.field_b.length <= var14) {
            L5: {
              if (var13 != -1) {
                break L5;
              } else {
                ((ld) this).field_a = 0;
                break L5;
              }
            }
            L6: {
              wj.d(30, -4 + var4 + 133, 120, 200, 0);
              if (ie.field_y != -1) {
                stackOut_45_0 = ie.field_y;
                stackIn_46_0 = stackOut_45_0;
                break L6;
              } else {
                stackOut_44_0 = var13;
                stackIn_46_0 = stackOut_44_0;
                break L6;
              }
            }
            L7: {
              var14 = stackIn_46_0;
              if (var14 != -1) {
                L8: {
                  if (oh.a(0)) {
                    ni.field_q.b(gl.field_f, 320, 116 + (var4 - -var6), 1, -1);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                L9: {
                  wj.d(166, 163 + (var25.field_E + var4), 128, 128, 0);
                  var25.c("<u>" + sc.field_b[var14] + "</u>", 166, var4 - -150, 0, -1);
                  if ((var11 & 1 << var14) == 0) {
                    stackOut_54_0 = 0;
                    stackIn_55_0 = stackOut_54_0;
                    break L9;
                  } else {
                    stackOut_53_0 = 1;
                    stackIn_55_0 = stackOut_53_0;
                    break L9;
                  }
                }
                L10: {
                  var15 = stackIn_55_0;
                  var16 = null;
                  if (var15 == 0) {
                    L11: {
                      L12: {
                        if (ie.field_u[var14]) {
                          break L12;
                        } else {
                          if (hb.field_g <= 0) {
                            stackOut_61_0 = ge.field_d;
                            stackIn_62_0 = stackOut_61_0;
                            break L11;
                          } else {
                            break L12;
                          }
                        }
                      }
                      stackOut_60_0 = tl.field_P;
                      stackIn_62_0 = stackOut_60_0;
                      break L11;
                    }
                    var17_ref_he = stackIn_62_0;
                    var17_ref_he.a(166, 163 + var4 + var25.field_E);
                    var16_ref = cl.field_q;
                    break L10;
                  } else {
                    di.field_b[var14].a(166, var25.field_E + (var4 + 163));
                    var16_ref = vc.field_d;
                    break L10;
                  }
                }
                var25.c(var16_ref, 166, 150 + var4 + var25.field_E, 0, -1);
                var25.c(rc.field_f + rd.field_J[var14], 390, 150 + var4 + var25.field_E, 0, -1);
                var25.c(bj.field_d, 390, var25.field_x + var4 - (-150 + -var25.field_E), 0, -1);
                var17 = 7 + (-(ce.field_b.field_c / 4) + var25.field_x + (var25.field_E + var4) - -150);
                var18 = var25.b(bj.field_d) - -390;
                var19 = 0;
                L13: while (true) {
                  if (qh.field_a[var14] <= var19) {
                    var19 = var25.field_x - 3;
                    var20 = 310;
                    var21 = 185 + var4 + var25.field_E;
                    var22 = 297;
                    var23 = var19 * 5;
                    int discarded$3 = var25.a(jk.field_K[var14], var20, var21, var22, var23, 0, -1, 0, 1, var19);
                    break L7;
                  } else {
                    ce.field_b.b(5 * var19 + var18, var17);
                    var19++;
                    continue L13;
                  }
                }
              } else {
                int discarded$4 = var25.a(re.field_j, 166, -var25.field_x + var4 - -150, 500, 200, 0, -1, 0, 0, var25.field_x);
                if (!oh.a(0)) {
                  break L7;
                } else {
                  int discarded$5 = ni.field_q.a(gl.field_f, 213, 116 + (var4 - -(var6 / 2)), 300, 200, 1, -1, 1, 0, ni.field_q.field_x);
                  break L7;
                }
              }
            }
            L14: {
              if (5 == ((ld) this).field_c) {
                var25.c(ge.field_i + ": " + sd.field_a.field_H, 310, var25.field_E + (150 + var4), 4210752, -1);
                break L14;
              } else {
                break L14;
              }
            }
            return;
          } else {
            L15: {
              if ((1 << var14 & var11) != 0) {
                di.field_b[var14].b(var9, var10);
                break L15;
              } else {
                if (!param0) {
                  if (!ie.field_u[var14]) {
                    if (hb.field_g <= 0) {
                      ge.field_d.b(var9, var10);
                      break L15;
                    } else {
                      tl.field_P.b(var9, var10);
                      break L15;
                    }
                  } else {
                    tl.field_P.b(var9, var10);
                    break L15;
                  }
                } else {
                  var14++;
                  continue L4;
                }
              }
            }
            L16: {
              if (ck.field_c < var9) {
                break L16;
              } else {
                if (40 + var9 <= ck.field_c) {
                  break L16;
                } else {
                  if (ob.field_g < var10) {
                    break L16;
                  } else {
                    if (ob.field_g >= var10 + 40) {
                      break L16;
                    } else {
                      var13 = var14;
                      if (((ld) this).field_a == 1) {
                        ((ld) this).field_a = 0;
                        if (ie.field_y != var13) {
                          ie.field_y = var13;
                          break L16;
                        } else {
                          ie.field_y = -1;
                          break L16;
                        }
                      } else {
                        break L16;
                      }
                    }
                  }
                }
              }
            }
            L17: {
              if (var13 != var14) {
                break L17;
              } else {
                wj.a(var9, var10, 32, 32, 0, 64);
                break L17;
              }
            }
            L18: {
              if (var14 == ie.field_y) {
                wj.d(var9, var10, 32, 32, 0);
                break L18;
              } else {
                break L18;
              }
            }
            var12++;
            if (var12 % 3 != 0) {
              var9 += 40;
              var14++;
              continue L4;
            } else {
              var10 += 40;
              var9 = 34;
              var14++;
              continue L4;
            }
          }
        }
    }

    ld(int param0) {
        ((ld) this).field_a = mh.field_f;
        ((ld) this).field_g = 2;
        ((ld) this).field_c = param0;
        ((ld) this).field_e = new ql(ul.field_j[param0].length);
        if (eg.field_a == null) {
            eg.field_a = ag.a(nl.field_r[0], 256, 256);
            eg.field_a.i(-1);
        }
    }

    private final void d(byte param0) {
        int var2 = 0;
        String var3 = null;
        jb var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        he var8 = null;
        nh var9 = null;
        int var10 = 0;
        vb var11_ref_vb = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String[] var14 = null;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        String var21 = null;
        int var22 = 0;
        int[] var29 = null;
        long[] var30 = null;
        int stackIn_3_0 = 0;
        String stackIn_38_0 = null;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        String stackOut_37_0 = null;
        String stackOut_36_0 = null;
        L0: {
          var22 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          var2 = -113 / ((65 - param0) / 50);
          var3 = bc.field_g;
          var4 = a.field_g;
          var5 = var4.field_x + var4.field_S;
          var6 = 0;
          var7 = 0;
          if (!tc.field_i) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0;
          if (null == sd.field_a) {
            break L1;
          } else {
            var6 = sd.field_a.field_q;
            break L1;
          }
        }
        L2: {
          if (l.field_f.length > var6) {
            var9 = rc.field_a[var6][var7];
            var8 = l.field_f[var6][var7];
            break L2;
          } else {
            var8 = al.field_c;
            var9 = dc.field_a;
            break L2;
          }
        }
        L3: {
          var8.e(0, 0);
          var10 = (int)(Math.exp((double)(-lf.field_b) / 25.0) * -400.0);
          this.a(gg.field_d, 223, var10, -50);
          var9.a(115, var5 + (140 + var10));
          wj.d(115, 140 + var5 - -var10, 160, 120, 0);
          wj.d(85, var10 + 140 + -var5, 465, 14 * var5, 0);
          if (!oh.a(0)) {
            L4: {
              if (ob.field_b != null) {
                break L4;
              } else {
                ob.field_b = bg.a(10, 21, 3, (byte) -105, 1);
                break L4;
              }
            }
            var11_ref_vb = ob.field_b;
            var12 = pa.field_d;
            if (var11_ref_vb.field_r) {
              if (null != var11_ref_vb.field_p) {
                var13 = 0;
                var14 = var11_ref_vb.field_p[var12];
                var30 = var11_ref_vb.field_j[var12];
                var29 = var11_ref_vb.field_t[var12];
                var17 = var10 + (140 + var4.field_x);
                var18 = 0;
                L5: while (true) {
                  if (var18 >= 10) {
                    if (null == sd.field_a) {
                      break L3;
                    } else {
                      if (var13 == 0) {
                        var4.c(oa.field_d, 325, var17, 16711680, -1);
                        var4.a(Integer.toString(sd.field_a.field_H), 535, var17, 16711680, -1);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  } else {
                    L6: {
                      if (var14[var18] == null) {
                        break L6;
                      } else {
                        L7: {
                          var19 = 4210752;
                          var20 = var29[var18];
                          var21 = var14[var18];
                          if (!ta.a(6, var21)) {
                            break L7;
                          } else {
                            if (var13 != 0) {
                              break L7;
                            } else {
                              if (null == bf.field_h) {
                                break L7;
                              } else {
                                if (bf.field_h.field_n != var30[var18]) {
                                  break L7;
                                } else {
                                  if (null == sd.field_a) {
                                    break L7;
                                  } else {
                                    if (sd.field_a.field_H == var20) {
                                      wj.a(300, -var4.field_x - -var17, 241, var5, 0, (int)(64.0 * ji.a(65535, (double)ul.field_d / 30.0)) + 128);
                                      var13 = 1;
                                      var19 = 16711680;
                                      wj.d(300, var17 + -var4.field_x, 241, var5, 33023, (int)(32.0 * ji.a(65535, (double)ul.field_d / 30.0)) + 64);
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        var4.a(var18 - -1 + ". ", 325, var17, var19, -1);
                        var4.c(var21, 325, var17, var19, -1);
                        var4.a(Integer.toString(var20), 535, var17, var19, -1);
                        var3 = "";
                        break L6;
                      }
                    }
                    var17 = var17 + var5;
                    var18++;
                    continue L5;
                  }
                }
              } else {
                var3 = dd.field_o;
                break L3;
              }
            } else {
              var3 = qk.field_e;
              var13 = 0;
              L8: while (true) {
                if (var13 >= lf.field_b / 25 % 4) {
                  break L3;
                } else {
                  var3 = var3 + ".";
                  var13++;
                  continue L8;
                }
              }
            }
          } else {
            break L3;
          }
        }
        L9: {
          var11 = var4.field_x + var10 + (140 + var5 * 9 / 2);
          ni.field_q.b(var3, 430, var11, 4210752, -1);
          if (!oh.a(0)) {
            stackOut_37_0 = mi.field_h;
            stackIn_38_0 = stackOut_37_0;
            break L9;
          } else {
            stackOut_36_0 = gl.field_f;
            stackIn_38_0 = stackOut_36_0;
            break L9;
          }
        }
        var3 = stackIn_38_0;
        var11 = var4.field_x + (140 + var10) - -(var5 * 10);
        int discarded$1 = var4.a(var3, 85, var5 / 2 + var11, 465, 100, 4210752, -1, 1, 0, ni.field_q.field_x);
    }

    private final void c(int param0, int param1) {
        double var3 = 0.0;
        double var5 = 0.0;
        int[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        var11 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (sd.field_e == 0) {
          return;
        } else {
          var3 = ji.a(65535, (double)lf.field_b / 100.0) * 0.75;
          var5 = pj.a((double)lf.field_b / 99.0, 32768) * 0.75;
          var15 = new int[93];
          var14 = var15;
          var13 = var14;
          var12 = var13;
          var7 = var12;
          var8 = 0;
          L0: while (true) {
            if (var8 >= 93) {
              var10 = 0;
              L1: while (true) {
                if (480 <= var10) {
                  var10 = 50 / ((-30 - param1) / 35);
                  wj.a();
                  return;
                } else {
                  L2: {
                    var8 = 100 - -(int)(Math.tan(var3) * (double)(430 + (param0 + -var10)));
                    var9 = 100 - -(int)((double)(430 + (param0 + -var10)) * Math.tan(var3 + 0.25));
                    wj.f(var8, var10, var9, 1 + var10);
                    if (2 == sd.field_e) {
                      wj.a(1600, 430 + param0 << 4, 4800, 92, var15);
                      break L2;
                    } else {
                      wj.c(100, 430 + param0, 300, 16777215, 128);
                      break L2;
                    }
                  }
                  var8 = (int)((double)(430 + (param0 + -var10)) * Math.tan(var5)) + 540;
                  var9 = 540 - -(int)((double)(430 + param0 - var10) * Math.tan(var5 + 0.25));
                  wj.f(var8, var10, var9, 1 + var10);
                  if (2 == sd.field_e) {
                    wj.a(8640, 430 + param0 << 4, 4800, 92, var15);
                    var10++;
                    continue L1;
                  } else {
                    wj.c(540, param0 - -430, 300, 16777215, 128);
                    var10++;
                    continue L1;
                  }
                }
              }
            } else {
              var7[var8] = (int)(2.7 * (double)var8) * 65793;
              var8++;
              continue L0;
            }
          }
        }
    }

    private final boolean a(int param0, boolean param1) {
        return true;
    }

    public static void e(byte param0) {
        field_f = null;
        field_d = null;
        field_h = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new int[]{0, 0, 5, 12, 12, 0, 0, 0, 0, 0, 0, 5, 4, 3, 4, 3, 0, 5, 11, 11, 1, 0, 1, 1, 11, 11, 0, 0, 0, 0};
    }
}
