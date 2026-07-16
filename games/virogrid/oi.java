/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class oi {
    private int field_e;
    private tn field_f;
    static int field_g;
    static boolean field_d;
    static StringBuilder field_h;
    static volatile long field_b;
    static p field_a;
    static sc[] field_c;

    private final void a(int param0, int param1, boolean param2, int param3, int param4, int param5) {
        mg var7 = null;
        int var8 = 0;
        mg var9 = null;
        mg var10 = null;
        mg stackIn_4_0 = null;
        mg stackIn_10_0 = null;
        mg stackOut_9_0 = null;
        mg stackOut_8_0 = null;
        mg stackOut_3_0 = null;
        mg stackOut_2_0 = null;
        L0: {
          var8 = Virogrid.field_F ? 1 : 0;
          if (-33 == (param4 ^ -1)) {
            L1: {
              if ((1 << param3 & rn.field_c) != 0) {
                stackOut_9_0 = vd.field_Y[param3];
                stackIn_10_0 = stackOut_9_0;
                break L1;
              } else {
                stackOut_8_0 = tn.field_b;
                stackIn_10_0 = stackOut_8_0;
                break L1;
              }
            }
            var10 = stackIn_10_0;
            var7 = var10;
            var10.d(-16 + param0, param5 + -16);
            break L0;
          } else {
            L2: {
              if ((1 << param3 & rn.field_c) != 0) {
                stackOut_3_0 = cb.field_d[param3];
                stackIn_4_0 = stackOut_3_0;
                break L2;
              } else {
                stackOut_2_0 = mj.field_F;
                stackIn_4_0 = stackOut_2_0;
                break L2;
              }
            }
            var9 = stackIn_4_0;
            var10 = var9;
            var7 = var10;
            var10 = var9;
            var7 = var10;
            var7 = var9;
            if (param4 != 128) {
              var9.a(param0 + -(param4 >> -873540255), -(param4 >> 423239361) + param5, param4, param4);
              break L0;
            } else {
              var9.d(param0 - 64, -64 + param5);
              break L0;
            }
          }
        }
        L3: {
          if (param2) {
            a.field_C[ea.field_d] = param0;
            a.field_F[ea.field_d] = param5;
            a.field_B[ea.field_d] = param4;
            a.field_G[ea.field_d] = param3;
            ea.field_d = ea.field_d + 1;
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (param1 == 3624) {
            break L4;
          } else {
            int discarded$1 = this.a(74, (byte) -42, -91);
            break L4;
          }
        }
    }

    private final void b(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int stackIn_13_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_30_0 = 0;
        v stackIn_76_0 = null;
        v stackIn_77_0 = null;
        v stackIn_78_0 = null;
        String stackIn_78_1 = null;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        v stackOut_75_0 = null;
        v stackOut_77_0 = null;
        String stackOut_77_1 = null;
        v stackOut_76_0 = null;
        String stackOut_76_1 = null;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var26 = Virogrid.field_F ? 1 : 0;
          var3 = 10;
          if (db.b((byte) 13, 0)) {
            break L0;
          } else {
            if ((512 & rn.field_c ^ -1) != -1) {
              break L0;
            } else {
              var3--;
              break L0;
            }
          }
        }
        L1: {
          var4 = -(20 * var3) - -20 + 320;
          ea.field_d = 0;
          var5 = 104;
          var6 = 0;
          if (param0 <= -101) {
            break L1;
          } else {
            this.b((byte) -40);
            break L1;
          }
        }
        L2: while (true) {
          if (10 <= var6) {
            L3: {
              if ((ll.field_d ^ -1) != 0) {
                stackOut_19_0 = ll.field_d;
                stackIn_20_0 = stackOut_19_0;
                break L3;
              } else {
                stackOut_18_0 = vm.field_c;
                stackIn_20_0 = stackOut_18_0;
                break L3;
              }
            }
            L4: {
              var6 = stackIn_20_0;
              ah.a(400, 100, 32 + var5, 1141646, 120);
              var7 = 124;
              if (-1 != var6) {
                L5: {
                  L6: {
                    if (og.field_j[var6]) {
                      break L6;
                    } else {
                      if ((rn.field_c & 1 << var6) == 0) {
                        stackOut_29_0 = 0;
                        stackIn_30_0 = stackOut_29_0;
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  stackOut_28_0 = 1;
                  stackIn_30_0 = stackOut_28_0;
                  break L5;
                }
                L7: {
                  var8 = stackIn_30_0;
                  if (-3 == (param1 ^ -1)) {
                    break L7;
                  } else {
                    mc.field_b.b(qk.field_d[var6].toUpperCase(), 320, 60 + var7, 8437759, -1);
                    if (-1 == (rn.field_c & 1 << var6 ^ -1)) {
                      vg.field_H.b(rk.field_g.toUpperCase(), 320, var7 + 78, 16711680, -1);
                      break L7;
                    } else {
                      vg.field_H.b(fl.field_j.toUpperCase(), 320, 78 + var7, 65280, -1);
                      break L7;
                    }
                  }
                }
                L8: {
                  var9 = (int)(Math.cos((double)((float)id.field_r / 50.0f)) * 76.0);
                  var10 = (int)(28.0 * Math.sin((double)((float)id.field_r / 50.0f)));
                  var11 = (int)(Math.sin((double)((float)id.field_r / 50.0f)) * 76.0);
                  var12 = (int)(Math.cos((double)((float)id.field_r / 50.0f)) * 28.0);
                  var13 = (int)(Math.sin((double)((float)(id.field_r - -50) / 50.0f)) * 76.0);
                  var14 = (int)(28.0 * Math.cos((double)((float)(id.field_r - -50) / 50.0f)));
                  var15 = (int)(Math.sin((double)((float)(id.field_r + 100) / 50.0f)) * 76.0);
                  var16 = (int)(28.0 * Math.cos((double)((float)(id.field_r - -100) / 50.0f)));
                  var17 = (int)(Math.sin((double)((float)(id.field_r + 150) / 50.0f)) * 76.0);
                  var18 = (int)(Math.cos((double)((float)(150 + id.field_r) / 50.0f)) * 28.0);
                  var19 = 3072 / (-var10 + 96);
                  var20 = 3072 / (-var12 + 96);
                  var21 = 3072 / (96 - var14);
                  var22 = 3072 / (96 - var16);
                  var23 = 3072 / (96 + -var18);
                  var24 = 210;
                  var25 = var7 + 108;
                  if (vc.field_eb[var6] < 1) {
                    break L8;
                  } else {
                    L9: {
                      if ((var10 ^ -1) <= -1) {
                        break L9;
                      } else {
                        ad.field_b.a(-(var19 >> 1918836641) + var9 + var24, -(var19 >> -694969855) + (var25 + (var9 / 2 - -var10)), var19, var19);
                        break L9;
                      }
                    }
                    L10: {
                      if ((vc.field_eb[var6] ^ -1) <= -3) {
                        if (var12 >= 0) {
                          break L10;
                        } else {
                          ad.field_b.a(var11 + var24 + -(var20 >> -1186501183), -(var20 >> -924344223) + -(var11 / 2) + (var25 + var12), var20, var20);
                          break L10;
                        }
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (3 <= vc.field_eb[var6]) {
                        if (-1 >= (var14 ^ -1)) {
                          break L11;
                        } else {
                          ad.field_b.a(-(var21 >> -929316319) + (var24 + var13), -(var21 >> 418896033) + -(var13 / 2) + (var25 - -var14), var21, var21);
                          break L11;
                        }
                      } else {
                        break L11;
                      }
                    }
                    L12: {
                      if (vc.field_eb[var6] >= 4) {
                        if (-1 < (var16 ^ -1)) {
                          ad.field_b.a(-(var22 >> -1419420223) + var24 - -var15, var16 + var25 - var15 / 2 - (var22 >> 270916865), var22, var22);
                          break L12;
                        } else {
                          break L12;
                        }
                      } else {
                        break L12;
                      }
                    }
                    if (vc.field_eb[var6] < 5) {
                      break L8;
                    } else {
                      if (0 > var18) {
                        ad.field_b.a(var17 + var24 - (var23 >> 1682625601), var25 - (var17 / 2 + -var18 - -(var23 >> -327835423)), var23, var23);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                L13: {
                  this.a(var24, 3624, false, var6, 128, var25);
                  if ((vc.field_eb[var6] ^ -1) <= -2) {
                    L14: {
                      if (-1 >= (var10 ^ -1)) {
                        ad.field_b.a(var24 - (-var9 + (var19 >> -872265471)), -(var19 >> 1472837217) + var10 + var25 - -(var9 / 2), var19, var19);
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if (-3 >= (vc.field_eb[var6] ^ -1)) {
                        if (0 > var12) {
                          break L15;
                        } else {
                          ad.field_b.a(-(var20 >> 42957825) + var24 - -var11, -(var20 >> -144031231) + var12 + var25 + -(var11 / 2), var20, var20);
                          break L15;
                        }
                      } else {
                        break L15;
                      }
                    }
                    L16: {
                      if (vc.field_eb[var6] < 3) {
                        break L16;
                      } else {
                        if (-1 < (var14 ^ -1)) {
                          break L16;
                        } else {
                          ad.field_b.a(var13 + var24 + -(var21 >> -1388123743), -(var21 >> -50719007) + (var14 + var25 + -(var13 / 2)), var21, var21);
                          break L16;
                        }
                      }
                    }
                    L17: {
                      if (vc.field_eb[var6] < 4) {
                        break L17;
                      } else {
                        if (-1 >= (var16 ^ -1)) {
                          ad.field_b.a(-(var22 >> 1573054113) + var24 - -var15, var16 + var25 - (var15 / 2 - -(var22 >> 1071332545)), var22, var22);
                          break L17;
                        } else {
                          break L17;
                        }
                      }
                    }
                    if (5 <= vc.field_eb[var6]) {
                      if ((var18 ^ -1) > -1) {
                        break L13;
                      } else {
                        ad.field_b.a(-(var23 >> -1767683711) + var24 + var17, -(var23 >> -1014673887) + (var18 + -(var17 / 2) + var25), var23, var23);
                        break L13;
                      }
                    } else {
                      break L13;
                    }
                  } else {
                    break L13;
                  }
                }
                if ((param1 ^ -1) == -3) {
                  break L4;
                } else {
                  L18: {
                    vg.field_H.b(qg.field_m.toUpperCase(), 320, var7 + 158, 8437759, -1);
                    vg.field_H.b(Integer.toString(h.field_c[var6]), 420, 158 + var7, 8437759, -1);
                    vg.field_H.b(wb.field_i.toUpperCase(), 320, var7 - -178, 8437759, -1);
                    vg.field_H.b(Integer.toString(vc.field_eb[var6]), 420, var7 + 178, 8437759, -1);
                    stackOut_75_0 = vg.field_H;
                    stackIn_77_0 = stackOut_75_0;
                    stackIn_76_0 = stackOut_75_0;
                    if (var8 == 0) {
                      stackOut_77_0 = (v) (Object) stackIn_77_0;
                      stackOut_77_1 = "???";
                      stackIn_78_0 = stackOut_77_0;
                      stackIn_78_1 = stackOut_77_1;
                      break L18;
                    } else {
                      stackOut_76_0 = (v) (Object) stackIn_76_0;
                      stackOut_76_1 = ak.field_b[var6].toUpperCase();
                      stackIn_78_0 = stackOut_76_0;
                      stackIn_78_1 = stackOut_76_1;
                      break L18;
                    }
                  }
                  int discarded$3 = ((v) (Object) stackIn_78_0).a(stackIn_78_1, 320, var7 + 92, 190, 80, 8437759, -1, 0, 0, 20);
                  break L4;
                }
              } else {
                if ((param1 ^ -1) == -3) {
                  break L4;
                } else {
                  if (qm.i(20)) {
                    vg.field_H.c(pc.field_a.toUpperCase(), 320, 270, 8437759, -1);
                    vg.field_H.c(dd.field_f.toUpperCase(), 320, 290, 8437759, -1);
                    int discarded$4 = vg.field_H.a(kn.field_L.toUpperCase(), 160, 210, 320, 80, 8437759, -1, 1, 0, 20);
                    break L4;
                  } else {
                    int discarded$5 = vg.field_H.a(kn.field_L.toUpperCase(), 160, 240, 320, 80, 8437759, -1, 1, 0, 20);
                    break L4;
                  }
                }
              }
            }
            L19: {
              var8 = 340;
              if (!qm.i(20)) {
                break L19;
              } else {
                var8 -= 20;
                break L19;
              }
            }
            L20: {
              vg.field_H.c(dg.field_G.toUpperCase(), 320, var8, 8437759, -1);
              if (!qm.i(20)) {
                ah.a(400, 100, 350, 1141646, 120);
                break L20;
              } else {
                break L20;
              }
            }
            return;
          } else {
            L21: {
              L22: {
                var7 = var6;
                if (!jk.field_d[var7]) {
                  break L22;
                } else {
                  if (0 != (1 << var7 & rn.field_c)) {
                    break L22;
                  } else {
                    L23: {
                      if (!jk.field_d[var7]) {
                        break L23;
                      } else {
                        if (!db.b((byte) 13, 0)) {
                          break L23;
                        } else {
                          break L22;
                        }
                      }
                    }
                    stackOut_12_0 = 0;
                    stackIn_13_0 = stackOut_12_0;
                    break L21;
                  }
                }
              }
              stackOut_11_0 = 1;
              stackIn_13_0 = stackOut_11_0;
              break L21;
            }
            L24: {
              var8 = stackIn_13_0;
              if (var8 != 0) {
                this.a(var4, 3624, true, var7, a.field_J[var7], var5);
                break L24;
              } else {
                break L24;
              }
            }
            var4 += 40;
            var6++;
            continue L2;
          }
        }
    }

    private final void a(int param0) {
        int var2 = 0;
        L0: {
          var2 = ((oi) this).field_f.field_d;
          if (param0 == 0) {
            break L0;
          } else {
            field_h = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (i.field_y != 6) {
              break L2;
            } else {
              if (qm.i(param0 + 20)) {
                break L2;
              } else {
                this.b(72);
                break L1;
              }
            }
          }
          if (0 != ag.field_j[((oi) this).field_e].length) {
            ((oi) this).field_f.e(param0 ^ 61);
            break L1;
          } else {
            break L1;
          }
        }
        L3: {
          if (((oi) this).field_f.field_d != var2) {
            pe discarded$2 = vm.a((byte) 30, wc.field_a);
            break L3;
          } else {
            break L3;
          }
        }
    }

    final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_1_0 = 0;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        int stackIn_1_3 = 0;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_2_3 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int stackOut_0_0 = 0;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        int stackOut_0_3 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_2_4 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        int stackOut_1_4 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        L0: {
          var7 = Virogrid.field_F ? 1 : 0;
          df.b(100, 0, 10, 400, 0);
          df.b(530, 0, 10, 400, 0);
          stackOut_0_0 = 110;
          stackOut_0_1 = 0;
          stackOut_0_2 = 420;
          stackOut_0_3 = 400;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_2_3 = stackOut_0_3;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          stackIn_1_3 = stackOut_0_3;
          if ((param1 ^ -1) == -2) {
            stackOut_2_0 = stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = stackIn_2_3;
            stackOut_2_4 = 127;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            stackIn_3_4 = stackOut_2_4;
            break L0;
          } else {
            stackOut_1_0 = stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = stackIn_1_3;
            stackOut_1_4 = 263172;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            stackIn_3_4 = stackOut_1_4;
            break L0;
          }
        }
        df.b(stackIn_3_0, stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4);
        if (-11 != (((oi) this).field_e ^ -1)) {
          var4 = -(hd.field_b.a(lc.field_e[((oi) this).field_e]) / 2) + 320;
          if (param2 < -61) {
            L1: {
              var5 = 40;
              if ((((oi) this).field_e ^ -1) == -1) {
                eh.field_l.a(-(eh.field_l.field_j / 2) + 320, 20);
                break L1;
              } else {
                hd.field_b.b(lc.field_e[((oi) this).field_e], var4, var5, 1141646, -1);
                break L1;
              }
            }
            ah.a(400, 100, 72, 1141646, 120);
            var6 = 0;
            L2: while (true) {
              if (((oi) this).field_f.field_o <= var6) {
                L3: {
                  if ((((oi) this).field_e ^ -1) == -7) {
                    this.a(param1, 16290);
                    break L3;
                  } else {
                    if (7 == ((oi) this).field_e) {
                      this.a(param0, param1, (byte) 20);
                      break L3;
                    } else {
                      if (8 != ((oi) this).field_e) {
                        L4: {
                          if ((((oi) this).field_e ^ -1) != -10) {
                            break L4;
                          } else {
                            if (param1 == 2) {
                              break L4;
                            } else {
                              int discarded$1 = hd.field_b.a(kn.field_J, 135, 78, 370, 180, 8437759, -1, 1, 0, 18);
                              break L3;
                            }
                          }
                        }
                        break L3;
                      } else {
                        this.b((byte) -113, param1);
                        break L3;
                      }
                    }
                  }
                }
                return;
              } else {
                L5: {
                  if (this.b(var6, -115)) {
                    L6: {
                      stackOut_14_0 = this;
                      stackOut_14_1 = 64;
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_16_1 = stackOut_14_1;
                      stackIn_15_0 = stackOut_14_0;
                      stackIn_15_1 = stackOut_14_1;
                      if ((((oi) this).field_f.field_d ^ -1) != (var6 ^ -1)) {
                        stackOut_16_0 = this;
                        stackOut_16_1 = stackIn_16_1;
                        stackOut_16_2 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        stackIn_17_2 = stackOut_16_2;
                        break L6;
                      } else {
                        stackOut_15_0 = this;
                        stackOut_15_1 = stackIn_15_1;
                        stackOut_15_2 = 1;
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        stackIn_17_2 = stackOut_15_2;
                        break L6;
                      }
                    }
                    this.a((byte) stackIn_17_1, stackIn_17_2 != 0, param1, var6);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var6++;
                continue L2;
              }
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static String a(String[] args, String param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        L0: {
          var11 = Virogrid.field_F ? 1 : 0;
          var3 = param1.length();
          var4 = var3;
          var5 = 0;
          if (param2 == 2) {
            break L0;
          } else {
            var12 = null;
            String discarded$4 = oi.a((String[]) null, (String) null, -50);
            break L0;
          }
        }
        L1: while (true) {
          var6_int = param1.indexOf("<%", var5);
          if (-1 < (var6_int ^ -1)) {
            var6 = new StringBuilder(var4);
            var7 = 0;
            var5 = 0;
            L2: while (true) {
              var8 = param1.indexOf("<%", var5);
              if (-1 >= (var8 ^ -1)) {
                var5 = var8 + 2;
                L3: while (true) {
                  L4: {
                    if (var5 >= var3) {
                      break L4;
                    } else {
                      if (!kf.a(0, param1.charAt(var5))) {
                        break L4;
                      } else {
                        var5++;
                        continue L3;
                      }
                    }
                  }
                  var9 = param1.substring(var8 + 2, var5);
                  if (pa.a((CharSequence) (Object) var9, param2 ^ -123)) {
                    if (var5 >= var3) {
                      continue L2;
                    } else {
                      if (param1.charAt(var5) == 62) {
                        var5++;
                        var10 = fm.a((CharSequence) (Object) var9, false);
                        StringBuilder discarded$5 = var6.append(param1.substring(var7, var8));
                        var7 = var5;
                        StringBuilder discarded$6 = var6.append(args[var10]);
                        continue L2;
                      } else {
                        continue L2;
                      }
                    }
                  } else {
                    continue L2;
                  }
                }
              } else {
                StringBuilder discarded$7 = var6.append(param1.substring(var7));
                return var6.toString();
              }
            }
          } else {
            var5 = 2 + var6_int;
            L5: while (true) {
              L6: {
                if (var3 <= var5) {
                  break L6;
                } else {
                  if (!kf.a(0, param1.charAt(var5))) {
                    break L6;
                  } else {
                    var5++;
                    continue L5;
                  }
                }
              }
              var7_ref_String = param1.substring(2 + var6_int, var5);
              if (pa.a((CharSequence) (Object) var7_ref_String, param2 + -113)) {
                if (var3 <= var5) {
                  continue L1;
                } else {
                  if (param1.charAt(var5) != 62) {
                    continue L1;
                  } else {
                    var5++;
                    var8 = fm.a((CharSequence) (Object) var7_ref_String, false);
                    var4 = var4 + (-var5 - -var6_int + args[var8].length());
                    continue L1;
                  }
                }
              } else {
                continue L1;
              }
            }
          }
        }
    }

    final static void a(boolean param0, int param1) {
        mi.a(param0, -8241);
        if (param1 != 6) {
            field_c = null;
        }
        we.a(false, param0);
    }

    private final int a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Virogrid.field_F ? 1 : 0;
        var4 = 0;
        L0: while (true) {
          if (ea.field_d <= var4) {
            var4 = 107 % ((70 - param1) / 37);
            return -1;
          } else {
            var5 = a.field_C[var4] + -param0;
            var6 = -param2 + a.field_F[var4];
            var7 = a.field_B[var4] >> 2140016289;
            if (-var7 <= var5) {
              if (var7 >= var5) {
                if (var6 >= -var7) {
                  if (var7 >= var6) {
                    return a.field_G[var4];
                  } else {
                    var4++;
                    continue L0;
                  }
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    private final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String[] var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        int stackIn_24_3 = 0;
        int stackIn_25_0 = 0;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        int stackIn_25_3 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_26_2 = 0;
        int stackIn_26_3 = 0;
        int stackIn_26_4 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        int stackOut_23_3 = 0;
        int stackOut_25_0 = 0;
        int stackOut_25_1 = 0;
        int stackOut_25_2 = 0;
        int stackOut_25_3 = 0;
        int stackOut_25_4 = 0;
        int stackOut_24_0 = 0;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        int stackOut_24_3 = 0;
        int stackOut_24_4 = 0;
        var11 = Virogrid.field_F ? 1 : 0;
        if (param0 != 2) {
          if (!qm.i(20)) {
            L0: {
              if (null == mm.field_j) {
                mm.field_j = i.a(0, 7, 10, param1 ^ -16301);
                break L0;
              } else {
                break L0;
              }
            }
            L1: {
              var3 = 1141646;
              if (param1 == 16290) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            L2: {
              var4 = hd.field_b.field_H + 64;
              var5 = var4;
              if (ih.field_c == 3) {
                var4 = var4 + vg.field_H.field_H;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              re.field_o.c(qe.field_j.toUpperCase(), 310, var5, var3, -1);
              re.field_o.c(aj.field_h.toUpperCase(), 368, var4, var3, -1);
              re.field_o.c(rl.field_s.toUpperCase(), 420, var5, var3, -1);
              re.field_o.c(ql.field_s.toUpperCase(), 458, var4, var3, -1);
              var4 += 24;
              re.field_o.c(rl.field_o.toUpperCase(), 500, var5, var3, -1);
              if (mm.field_j.field_s) {
                if (mm.field_j.field_j != null) {
                  var6 = qg.field_s.toUpperCase();
                  var7 = mm.field_j.field_j[uk.field_c];
                  var8 = mm.field_j.field_t[uk.field_c];
                  var9 = 0;
                  var10 = 0;
                  L4: while (true) {
                    if ((var10 ^ -1) <= -11) {
                      if (var9 != 0) {
                        break L3;
                      } else {
                        if (0 >= mm.field_j.field_q + (mm.field_j.field_m + mm.field_j.field_h)) {
                          break L3;
                        } else {
                          var3 = 8437759;
                          this.a(param1 + -16112, mm.field_j.field_m, mi.field_d, var4, mm.field_j.field_q, var3, -1, mm.field_j.field_h, mm.field_j.field_u);
                          break L3;
                        }
                      }
                    } else {
                      if (var7[var10] != null) {
                        L5: {
                          var3 = 1141646;
                          if (jc.a(var7[var10], true)) {
                            var3 = 16777215;
                            var9 = 1;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          stackOut_23_0 = 118;
                          stackOut_23_1 = -vg.field_H.field_H + -vg.field_H.field_G + var4;
                          stackOut_23_2 = 400;
                          stackOut_23_3 = 22;
                          stackIn_25_0 = stackOut_23_0;
                          stackIn_25_1 = stackOut_23_1;
                          stackIn_25_2 = stackOut_23_2;
                          stackIn_25_3 = stackOut_23_3;
                          stackIn_24_0 = stackOut_23_0;
                          stackIn_24_1 = stackOut_23_1;
                          stackIn_24_2 = stackOut_23_2;
                          stackIn_24_3 = stackOut_23_3;
                          if (var10 % 2 != 1) {
                            stackOut_25_0 = stackIn_25_0;
                            stackOut_25_1 = stackIn_25_1;
                            stackOut_25_2 = stackIn_25_2;
                            stackOut_25_3 = stackIn_25_3;
                            stackOut_25_4 = 665399;
                            stackIn_26_0 = stackOut_25_0;
                            stackIn_26_1 = stackOut_25_1;
                            stackIn_26_2 = stackOut_25_2;
                            stackIn_26_3 = stackOut_25_3;
                            stackIn_26_4 = stackOut_25_4;
                            break L6;
                          } else {
                            stackOut_24_0 = stackIn_24_0;
                            stackOut_24_1 = stackIn_24_1;
                            stackOut_24_2 = stackIn_24_2;
                            stackOut_24_3 = stackIn_24_3;
                            stackOut_24_4 = 996169;
                            stackIn_26_0 = stackOut_24_0;
                            stackIn_26_1 = stackOut_24_1;
                            stackIn_26_2 = stackOut_24_2;
                            stackIn_26_3 = stackOut_24_3;
                            stackIn_26_4 = stackOut_24_4;
                            break L6;
                          }
                        }
                        df.b(stackIn_26_0, stackIn_26_1, stackIn_26_2, stackIn_26_3, stackIn_26_4);
                        var6 = "";
                        this.a(178, var8[3 + var10 * 4], var7[var10], var4, var8[4 * var10 - -2], var3, var10, var8[4 * var10 + 1], var8[var10 * 4]);
                        var4 += 21;
                        var10++;
                        continue L4;
                      } else {
                        var4 += 21;
                        var10++;
                        continue L4;
                      }
                    }
                  }
                } else {
                  var6 = te.field_a.toUpperCase();
                  break L3;
                }
              } else {
                var6 = wc.field_b.toUpperCase();
                break L3;
              }
            }
            var4 = 120 - -vg.field_H.field_H + 10 * ag.field_a[6] / 2;
            vg.field_H.c(var6, 320, var4, 8437759, -1);
            return;
          } else {
            this.b((byte) -86);
            return;
          }
        } else {
          return;
        }
    }

    private final void a(int param0, int param1, String param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int var10 = 0;
        String var11 = null;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        String stackIn_8_0 = null;
        String stackOut_7_0 = null;
        String stackOut_6_0 = null;
        L0: {
          var10 = param1 + param7 - -param4;
          if (0 == (param6 ^ -1)) {
            break L0;
          } else {
            vg.field_H.a(param6 + 1 + ". ", 140, param3, param5, -1);
            break L0;
          }
        }
        L1: {
          if (var10 != 0) {
            param4 = (param4 * 200 - -var10) / (var10 * 2);
            param1 = (var10 + param1 * 200) / (2 * var10);
            param7 = (param7 * 200 + var10) / (var10 * 2);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          var12 = param2;
          vg.field_H.b(var12, 140, param3, param5, -1);
          var13 = Integer.toString(param8);
          vg.field_H.c(var13, 310, param3, param5, -1);
          if (var10 >= 50) {
            stackOut_7_0 = "50+";
            stackIn_8_0 = stackOut_7_0;
            break L2;
          } else {
            stackOut_6_0 = Integer.toString(var10);
            stackIn_8_0 = stackOut_6_0;
            break L2;
          }
        }
        var14 = stackIn_8_0;
        var11 = var14;
        vg.field_H.c(var14, 368, param3, param5, -1);
        var15 = param7 + "%";
        vg.field_H.c(var15, 420, param3, param5, -1);
        var16 = param1 + "%";
        if (param0 == 178) {
          vg.field_H.c(var16, 458, param3, param5, -1);
          var17 = param4 + "%";
          vg.field_H.c(var17, 500, param3, param5, -1);
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, double param1, double param2, int param3, int param4, int param5) {
        int var9 = 0;
        int var10 = 0;
        int var11 = Virogrid.field_F ? 1 : 0;
        if ((param3 ^ -1) == -3) {
            return;
        }
        if (!qe.field_k) {
            if (!eh.field_e) {
                if (((oi) this).field_e != 8) {
                } else {
                    vm.field_c = param0 ? -1 : this.a((int)param2, -94, (int)param1);
                    if ((param5 ^ -1) == -2) {
                        if (ll.field_d == vm.field_c) {
                            ll.field_d = -1;
                        } else {
                            if (-1 != vm.field_c) {
                                ll.field_d = vm.field_c;
                            }
                        }
                    }
                }
                if (param0) {
                    ((oi) this).field_f.a(-1, false, -1);
                } else {
                    var9 = ((oi) this).field_f.field_d;
                    var10 = this.a((int)param1, (byte) -128, (int)param2);
                    ((oi) this).field_f.a(var10, false, var10);
                    if (-1 != ((oi) this).field_f.field_d) {
                        this.a(((oi) this).field_f.field_d, true, param4 ^ -423235729);
                    }
                    if (((oi) this).field_f.field_d != var9) {
                        pe discarded$0 = vm.a((byte) 30, wc.field_a);
                    }
                }
            }
        }
        if (param4 != -3666) {
            field_a = null;
        }
    }

    private final void b(int param0) {
        int var3 = 0;
        L0: {
          var3 = Virogrid.field_F ? 1 : 0;
          if (96 == um.field_Gb) {
            if (((oi) this).field_f.field_d > 0) {
              if (((oi) this).field_f.field_d == 2) {
                break L0;
              } else {
                ((oi) this).field_f.a(-75, 0);
                break L0;
              }
            } else {
              ((oi) this).field_f.a(param0 + -168, 1);
              break L0;
            }
          } else {
            break L0;
          }
        }
        L1: {
          if (97 != um.field_Gb) {
            break L1;
          } else {
            if ((((oi) this).field_f.field_d ^ -1) != -2) {
              if (-3 != (((oi) this).field_f.field_d ^ -1)) {
                ((oi) this).field_f.a(-120, 1);
                break L1;
              } else {
                break L1;
              }
            } else {
              ((oi) this).field_f.a(param0 + -105, 0);
              break L1;
            }
          }
        }
        L2: {
          if ((um.field_Gb ^ -1) == -100) {
            L3: {
              if ((((oi) this).field_f.field_d ^ -1) > -1) {
                break L3;
              } else {
                if ((((oi) this).field_f.field_d ^ -1) < -2) {
                  break L3;
                } else {
                  ((oi) this).field_f.a(-75, 2);
                  break L2;
                }
              }
            }
            ((oi) this).field_f.a(param0 ^ -39, uk.field_c);
            break L2;
          } else {
            break L2;
          }
        }
        L4: {
          if (-99 != (um.field_Gb ^ -1)) {
            break L4;
          } else {
            if (-3 == (((oi) this).field_f.field_d ^ -1)) {
              ((oi) this).field_f.a(-61, uk.field_c);
              break L4;
            } else {
              ((oi) this).field_f.a(-76, 2);
              break L4;
            }
          }
        }
        L5: {
          if (param0 == 72) {
            break L5;
          } else {
            ((oi) this).a((byte) -44);
            break L5;
          }
        }
        ((oi) this).field_f.d((byte) 32);
    }

    private final void b(byte param0) {
        vg.field_H.c(mb.field_mb.toUpperCase(), 320, 197 + hd.field_b.field_H, 8437759, -1);
        if (param0 > -1) {
            this.a((byte) -58, false, -58, 36);
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        int var4 = ag.field_j[((oi) this).field_e][param0];
        this.b(param0, var4, (byte) 124);
        if (param2 != 423239361) {
            field_b = 60L;
        }
        if (((oi) this).field_f.b(83)) {
            if (14 != var4) {
                if ((var4 ^ -1) != -16) {
                    pe discarded$0 = vm.a((byte) 30, bg.field_Lb);
                }
            }
            wh.a(2094, param1, var4);
        }
    }

    final void a(byte param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = Virogrid.field_F ? 1 : 0;
        if ((((oi) this).field_f.field_d ^ -1) != 0) {
            param1 = ((oi) this).field_f.field_d;
        }
        if (param0 <= 115) {
            return;
        }
        ((oi) this).field_f.a(param2, this.a((int)fa.field_k, (byte) -128, (int)sf.field_M), -563, param1);
        qd.field_c = id.field_r;
        if (!((((oi) this).field_e ^ -1) != -9)) {
            vm.field_c = -1;
            ll.field_d = -1;
            for (var4 = 0; -11 < (var4 ^ -1); var4++) {
                a.field_J[var4] = 0;
            }
        }
    }

    private final int d(int param0, int param1) {
        if (6 == ((oi) this).field_e) {
            if (!qm.i(param0 ^ 2)) {
                if (!(-3 >= (param1 ^ -1))) {
                    return ag.field_f[((oi) this).field_e];
                }
                return ag.field_f[((oi) this).field_e] + ag.field_a[((oi) this).field_e];
            }
        }
        if (param0 != 22) {
            field_h = null;
        }
        return param1 * ag.field_a[((oi) this).field_e] + ag.field_f[((oi) this).field_e];
    }

    private final int a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Virogrid.field_F ? 1 : 0;
        if (hk.field_Jb > we.field_c.field_J) {
          return -1;
        } else {
          var4 = 0;
          L0: while (true) {
            if (ag.field_j[((oi) this).field_e].length <= var4) {
              L1: {
                if (param1 <= -124) {
                  break L1;
                } else {
                  field_g = -3;
                  break L1;
                }
              }
              return -1;
            } else {
              var5 = this.d(22, var4);
              if (this.b(var4, -107)) {
                if (param2 >= this.c(-57, var4)) {
                  if (param2 < this.a((byte) -94, var4)) {
                    if (var5 <= param0) {
                      if (param0 < this.a(var4, (byte) 94) + var5) {
                        return var4;
                      } else {
                        var4++;
                        continue L0;
                      }
                    } else {
                      var4++;
                      continue L0;
                    }
                  } else {
                    var4++;
                    continue L0;
                  }
                } else {
                  var4++;
                  continue L0;
                }
              } else {
                var4++;
                continue L0;
              }
            }
          }
        }
    }

    private final void b(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_113_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_111_0 = 0;
        L0: {
          var8 = Virogrid.field_F ? 1 : 0;
          if (param2 >= 81) {
            break L0;
          } else {
            ((oi) this).b(-95, 86, -94);
            break L0;
          }
        }
        L1: {
          var5 = param1;
          if (var5 != 0) {
            L2: {
              if ((var5 ^ -1) == -25) {
                break L2;
              } else {
                if ((var5 ^ -1) != -2) {
                  if (2 != var5) {
                    if ((var5 ^ -1) != -8) {
                      if (-4 != (var5 ^ -1)) {
                        if (5 == var5) {
                          break L2;
                        } else {
                          if (8 == var5) {
                            break L2;
                          } else {
                            if (-5 == (var5 ^ -1)) {
                              break L2;
                            } else {
                              if (-7 == (var5 ^ -1)) {
                                break L2;
                              } else {
                                if (9 != var5) {
                                  if ((var5 ^ -1) != -11) {
                                    if ((var5 ^ -1) == -12) {
                                      break L2;
                                    } else {
                                      if ((var5 ^ -1) != -19) {
                                        if (19 == var5) {
                                          break L2;
                                        } else {
                                          if (12 == var5) {
                                            break L2;
                                          } else {
                                            if ((var5 ^ -1) != -21) {
                                              if ((var5 ^ -1) == -22) {
                                                break L2;
                                              } else {
                                                if ((var5 ^ -1) != -23) {
                                                  if ((var5 ^ -1) == -14) {
                                                    break L2;
                                                  } else {
                                                    if (-24 != (var5 ^ -1)) {
                                                      if (var5 != 14) {
                                                        if (-16 == (var5 ^ -1)) {
                                                          L3: {
                                                            if (((oi) this).field_f.a((byte) 119)) {
                                                              bm.d(0, 0);
                                                              break L3;
                                                            } else {
                                                              break L3;
                                                            }
                                                          }
                                                          L4: {
                                                            if (((oi) this).field_f.c((byte) 102)) {
                                                              bm.d(256, 0);
                                                              break L4;
                                                            } else {
                                                              break L4;
                                                            }
                                                          }
                                                          L5: {
                                                            if (((oi) this).field_f.e((byte) 122)) {
                                                              var5 = -120 + (this.c(82, param0) - (-this.a((byte) -94, param0) + -ok.field_L)) >> 169877793;
                                                              var6 = (int)sf.field_M - var5;
                                                              var7 = 256 * var6 / 120;
                                                              if ((var7 ^ -1) < -1) {
                                                                if (var7 >= 256) {
                                                                  bm.d(256, 0);
                                                                  break L5;
                                                                } else {
                                                                  bm.d(var7, 0);
                                                                  break L5;
                                                                }
                                                              } else {
                                                                bm.d(0, 0);
                                                                break L5;
                                                              }
                                                            } else {
                                                              break L5;
                                                            }
                                                          }
                                                          L6: {
                                                            if (((oi) this).field_f.g(31)) {
                                                              vl.a(11864);
                                                              break L6;
                                                            } else {
                                                              break L6;
                                                            }
                                                          }
                                                          if (!((oi) this).field_f.b((byte) -128)) {
                                                            break L2;
                                                          } else {
                                                            ib.a((byte) 99);
                                                            break L1;
                                                          }
                                                        } else {
                                                          if ((var5 ^ -1) == -17) {
                                                            L7: {
                                                              if (((oi) this).field_f.d(26505)) {
                                                                break L7;
                                                              } else {
                                                                if (!((oi) this).field_f.c(-1)) {
                                                                  break L2;
                                                                } else {
                                                                  break L7;
                                                                }
                                                              }
                                                            }
                                                            L8: {
                                                              if (-3 >= (bc.field_c ^ -1)) {
                                                                bc.field_c = 0;
                                                                break L8;
                                                              } else {
                                                                bc.field_c = co.field_l;
                                                                break L8;
                                                              }
                                                            }
                                                            ka.a(true, (byte) 87);
                                                            break L1;
                                                          } else {
                                                            if (-18 != (var5 ^ -1)) {
                                                              L9: {
                                                                if ((var5 ^ -1) == -29) {
                                                                  L10: {
                                                                    if (((oi) this).field_f.c(-1)) {
                                                                      break L10;
                                                                    } else {
                                                                      if (((oi) this).field_f.d(26505)) {
                                                                        break L10;
                                                                      } else {
                                                                        break L9;
                                                                      }
                                                                    }
                                                                  }
                                                                  L11: {
                                                                    if (b.field_Db) {
                                                                      stackOut_112_0 = 0;
                                                                      stackIn_113_0 = stackOut_112_0;
                                                                      break L11;
                                                                    } else {
                                                                      stackOut_111_0 = 1;
                                                                      stackIn_113_0 = stackOut_111_0;
                                                                      break L11;
                                                                    }
                                                                  }
                                                                  b.field_Db = stackIn_113_0 != 0;
                                                                  break L9;
                                                                } else {
                                                                  if ((var5 ^ -1) != -26) {
                                                                    if (-27 != (var5 ^ -1)) {
                                                                      if (var5 == 27) {
                                                                        if (!((oi) this).field_f.c(-1)) {
                                                                          if (!((oi) this).field_f.d(26505)) {
                                                                            break L2;
                                                                          } else {
                                                                            ce.field_I = (mh.field_i.length - (1 - ce.field_I)) % mh.field_i.length;
                                                                            break L1;
                                                                          }
                                                                        } else {
                                                                          ce.field_I = (ce.field_I - -1) % mh.field_i.length;
                                                                          break L1;
                                                                        }
                                                                      } else {
                                                                        break L1;
                                                                      }
                                                                    } else {
                                                                      if (((oi) this).field_f.c(-1)) {
                                                                        eg.field_y = (eg.field_y + 1) % sh.field_yb.length;
                                                                        break L1;
                                                                      } else {
                                                                        if (!((oi) this).field_f.d(26505)) {
                                                                          break L2;
                                                                        } else {
                                                                          eg.field_y = (-1 - (-sh.field_yb.length - eg.field_y)) % sh.field_yb.length;
                                                                          break L1;
                                                                        }
                                                                      }
                                                                    }
                                                                  } else {
                                                                    break L9;
                                                                  }
                                                                }
                                                              }
                                                              if (!((oi) this).field_f.c(-1)) {
                                                                if (((oi) this).field_f.d(26505)) {
                                                                  ll.field_b = (ra.field_a.length + -1 + ll.field_b) % ra.field_a.length;
                                                                  break L1;
                                                                } else {
                                                                  break L1;
                                                                }
                                                              } else {
                                                                ll.field_b = (ll.field_b + 1) % ra.field_a.length;
                                                                break L1;
                                                              }
                                                            } else {
                                                              if (!gb.field_H.field_g) {
                                                                break L2;
                                                              } else {
                                                                L12: {
                                                                  if (!((oi) this).field_f.d(26505)) {
                                                                    if (!((oi) this).field_f.c(-1)) {
                                                                      break L2;
                                                                    } else {
                                                                      int fieldTemp$3 = bc.field_c + 1;
                                                                      bc.field_c = bc.field_c + 1;
                                                                      if ((fieldTemp$3 ^ -1) > (cc.field_v.length ^ -1)) {
                                                                        break L12;
                                                                      } else {
                                                                        bc.field_c = 2;
                                                                        break L12;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    int fieldTemp$4 = bc.field_c - 1;
                                                                    bc.field_c = bc.field_c - 1;
                                                                    if (2 > fieldTemp$4) {
                                                                      bc.field_c = cc.field_v.length + -1;
                                                                      break L12;
                                                                    } else {
                                                                      co.field_l = bc.field_c;
                                                                      ka.a(true, (byte) 87);
                                                                      break L1;
                                                                    }
                                                                  }
                                                                }
                                                                co.field_l = bc.field_c;
                                                                ka.a(true, (byte) 87);
                                                                break L1;
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        L13: {
                                                          var4 = 0;
                                                          if (!((oi) this).field_f.a((byte) 104)) {
                                                            break L13;
                                                          } else {
                                                            if (-1 > (ag.field_c ^ -1)) {
                                                              qe.a((byte) 83, 0);
                                                              var4 = 1;
                                                              break L13;
                                                            } else {
                                                              break L13;
                                                            }
                                                          }
                                                        }
                                                        L14: {
                                                          if (!((oi) this).field_f.c((byte) 46)) {
                                                            break L14;
                                                          } else {
                                                            if ((ag.field_c ^ -1) <= -257) {
                                                              break L14;
                                                            } else {
                                                              qe.a((byte) 43, 256);
                                                              var4 = 1;
                                                              break L14;
                                                            }
                                                          }
                                                        }
                                                        L15: {
                                                          if (!((oi) this).field_f.e((byte) 121)) {
                                                            break L15;
                                                          } else {
                                                            L16: {
                                                              var5 = -120 + (this.c(102, param0) + this.a((byte) -94, param0)) + ok.field_L >> 888064353;
                                                              var6 = (int)sf.field_M + -var5;
                                                              var7 = var6 * 256 / 120;
                                                              if (0 >= var7) {
                                                                qe.a((byte) 58, 0);
                                                                break L16;
                                                              } else {
                                                                if (-257 >= (var7 ^ -1)) {
                                                                  qe.a((byte) 61, 256);
                                                                  break L16;
                                                                } else {
                                                                  qe.a((byte) 35, var7);
                                                                  break L16;
                                                                }
                                                              }
                                                            }
                                                            var4 = 1;
                                                            break L15;
                                                          }
                                                        }
                                                        L17: {
                                                          if (!((oi) this).field_f.g(31)) {
                                                            break L17;
                                                          } else {
                                                            if ((ag.field_c ^ -1) >= -1) {
                                                              break L17;
                                                            } else {
                                                              on.a(88);
                                                              var4 = 1;
                                                              break L17;
                                                            }
                                                          }
                                                        }
                                                        L18: {
                                                          if (!((oi) this).field_f.b((byte) -125)) {
                                                            break L18;
                                                          } else {
                                                            if (-257 >= (ag.field_c ^ -1)) {
                                                              break L18;
                                                            } else {
                                                              ul.c((byte) 64);
                                                              var4 = 1;
                                                              break L18;
                                                            }
                                                          }
                                                        }
                                                        if (var4 != 0) {
                                                          L19: {
                                                            if (!((oi) this).field_f.e((byte) 122)) {
                                                              break L19;
                                                            } else {
                                                              if ((qd.field_c ^ -1) > (id.field_r ^ -1)) {
                                                                break L19;
                                                              } else {
                                                                break L1;
                                                              }
                                                            }
                                                          }
                                                          pe discarded$5 = vm.a((byte) 30, bg.field_Lb);
                                                          qd.field_c = id.field_r + 20;
                                                          break L1;
                                                        } else {
                                                          break L1;
                                                        }
                                                      }
                                                    } else {
                                                      break L1;
                                                    }
                                                  }
                                                } else {
                                                  break L1;
                                                }
                                              }
                                            } else {
                                              break L1;
                                            }
                                          }
                                        }
                                      } else {
                                        break L1;
                                      }
                                    }
                                  } else {
                                    break L1;
                                  }
                                } else {
                                  break L1;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        break L1;
                      }
                    } else {
                      break L1;
                    }
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
            }
            break L1;
          } else {
            break L1;
          }
        }
    }

    oi(int param0) {
        ((oi) this).field_e = param0;
        ((oi) this).field_f = new tn(ag.field_j[((oi) this).field_e].length);
        if (ag.field_j[((oi) this).field_e].length == 0) {
            ((oi) this).field_f.field_d = -1;
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int stackIn_31_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        L0: {
          var4 = Virogrid.field_F ? 1 : 0;
          if (qe.field_k) {
            break L0;
          } else {
            if (!eh.field_e) {
              L1: while (true) {
                if (!nd.b((byte) -125)) {
                  break L0;
                } else {
                  if (-14 == (um.field_Gb ^ -1)) {
                    L2: {
                      if (-3 == ((oi) this).field_e) {
                        break L2;
                      } else {
                        if (-4 == ((oi) this).field_e) {
                          break L2;
                        } else {
                          if (-5 == (((oi) this).field_e ^ -1)) {
                            break L2;
                          } else {
                            if (((oi) this).field_e != 5) {
                              if (bd.field_e == ((oi) this).field_e) {
                                continue L1;
                              } else {
                                L3: {
                                  if (0 == bd.field_e) {
                                    break L3;
                                  } else {
                                    if (bd.field_e == 2) {
                                      break L3;
                                    } else {
                                      if (3 == bd.field_e) {
                                        break L3;
                                      } else {
                                        if ((bd.field_e ^ -1) == -5) {
                                          break L3;
                                        } else {
                                          if ((bd.field_e ^ -1) != -6) {
                                            continue L1;
                                          } else {
                                            wh.a(2094, false, 8);
                                            continue L1;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                                wh.a(2094, false, 8);
                                continue L1;
                              }
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                    }
                    wh.a(2094, false, 2);
                    continue L1;
                  } else {
                    this.a(0);
                    if (-1 == ((oi) this).field_f.field_d) {
                      continue L1;
                    } else {
                      this.a(((oi) this).field_f.field_d, false, 423239361);
                      continue L1;
                    }
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        L4: {
          if (param0 < -45) {
            break L4;
          } else {
            int discarded$1 = this.c(-89, -85);
            break L4;
          }
        }
        L5: {
          if (-9 != ((oi) this).field_e) {
            break L5;
          } else {
            var2 = 0;
            L6: while (true) {
              if (-11 <= var2) {
                break L5;
              } else {
                L7: {
                  if (var2 == ll.field_d) {
                    stackOut_30_0 = 48;
                    stackIn_31_0 = stackOut_30_0;
                    break L7;
                  } else {
                    if (vm.field_c == var2) {
                      stackOut_29_0 = 40;
                      stackIn_31_0 = stackOut_29_0;
                      break L7;
                    } else {
                      stackOut_28_0 = 32;
                      stackIn_31_0 = stackOut_28_0;
                      break L7;
                    }
                  }
                }
                var3 = stackIn_31_0;
                if (a.field_J[var2] <= var3) {
                  if (a.field_J[var2] < var3) {
                    a.field_J[var2] = a.field_J[var2] + 1;
                    var2++;
                    continue L6;
                  } else {
                    var2++;
                    continue L6;
                  }
                } else {
                  a.field_J[var2] = a.field_J[var2] - 1;
                  var2++;
                  continue L6;
                }
              }
            }
          }
        }
    }

    private final void a(int param0, int param1, byte param2) {
        String var4 = em.field_b[param0];
        int var5 = vg.field_H.b(var4, 370);
        int var7 = 100 % ((-48 - param2) / 63);
        int var6 = 16 + 18 * var5;
        ah.a(400, 100, 72, 1141646, 120);
        ah.a(400, 100, 72 + var6, 1141646, 120);
        pe.a(73, 1141646, 120, (byte) -122, -1 + var6);
        pe.a(73, 1141646, 519, (byte) -110, -1 + var6);
        if (param1 != 2) {
            int discarded$0 = vg.field_H.a(var4, 135, 78, 370, 180, 8437759, -1, 0, 0, 18);
        }
    }

    private final boolean b(int param0, int param1) {
        if (param1 > -100) {
            this.a((byte) 52, false, -102, -36);
        }
        return true;
    }

    private final void a(byte param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        String var19 = null;
        String var20 = null;
        StringBuilder stackIn_5_0 = null;
        StringBuilder stackIn_6_0 = null;
        StringBuilder stackIn_7_0 = null;
        String stackIn_7_1 = null;
        StringBuilder stackIn_10_0 = null;
        StringBuilder stackIn_11_0 = null;
        StringBuilder stackIn_12_0 = null;
        String stackIn_12_1 = null;
        StringBuilder stackIn_15_0 = null;
        StringBuilder stackIn_16_0 = null;
        StringBuilder stackIn_17_0 = null;
        String stackIn_17_1 = null;
        String stackIn_26_0 = null;
        int stackIn_52_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_64_0 = 0;
        String stackOut_25_0 = null;
        String stackOut_24_0 = null;
        StringBuilder stackOut_14_0 = null;
        StringBuilder stackOut_16_0 = null;
        String stackOut_16_1 = null;
        StringBuilder stackOut_15_0 = null;
        String stackOut_15_1 = null;
        StringBuilder stackOut_9_0 = null;
        StringBuilder stackOut_11_0 = null;
        String stackOut_11_1 = null;
        StringBuilder stackOut_10_0 = null;
        String stackOut_10_1 = null;
        StringBuilder stackOut_4_0 = null;
        StringBuilder stackOut_6_0 = null;
        String stackOut_6_1 = null;
        StringBuilder stackOut_5_0 = null;
        String stackOut_5_1 = null;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_62_0 = 0;
        var18 = Virogrid.field_F ? 1 : 0;
        if ((param2 ^ -1) != -3) {
          L0: {
            var5 = -24 % ((param0 - -92) / 33);
            var6 = ag.field_j[((oi) this).field_e][param3];
            var19 = de.field_pb[var6];
            var7 = var19;
            var7 = var19;
            if (var6 == 8) {
              L1: {
                if (bd.field_e == 0) {
                  break L1;
                } else {
                  if ((hm.field_c ^ -1) != -1) {
                    L2: {
                      if (-3 == (bd.field_e ^ -1)) {
                        break L2;
                      } else {
                        if (hm.field_c != 2) {
                          L3: {
                            if ((bd.field_e ^ -1) == -4) {
                              break L3;
                            } else {
                              if (hm.field_c == 3) {
                                break L3;
                              } else {
                                if ((bd.field_e ^ -1) == -5) {
                                  break L3;
                                } else {
                                  if (hm.field_c == 4) {
                                    break L3;
                                  } else {
                                    if (5 == bd.field_e) {
                                      break L3;
                                    } else {
                                      if (5 != hm.field_c) {
                                        break L0;
                                      } else {
                                        break L3;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                          var7 = ql.field_j;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var7 = sn.field_p;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              var7 = de.field_pb[7];
              break L0;
            } else {
              if ((var6 ^ -1) != -17) {
                if (-18 != (var6 ^ -1)) {
                  if ((var6 ^ -1) != -29) {
                    if (-27 != (var6 ^ -1)) {
                      if (var6 == 25) {
                        var7 = oi.a(new String[1], var19, 2);
                        break L0;
                      } else {
                        if (27 == var6) {
                          var7 = oi.a(new String[1], var19, 2);
                          break L0;
                        } else {
                          if (var6 != 19) {
                            break L0;
                          } else {
                            L4: {
                              if (-1 != (nf.field_g ^ -1)) {
                                stackOut_25_0 = en.field_Eb;
                                stackIn_26_0 = stackOut_25_0;
                                break L4;
                              } else {
                                stackOut_24_0 = hk.field_Gb;
                                stackIn_26_0 = stackOut_24_0;
                                break L4;
                              }
                            }
                            var7 = stackIn_26_0;
                            break L0;
                          }
                        }
                      }
                    } else {
                      var7 = oi.a(new String[1], var19, 2);
                      break L0;
                    }
                  } else {
                    L5: {
                      stackOut_14_0 = new StringBuilder().append(var19);
                      stackIn_16_0 = stackOut_14_0;
                      stackIn_15_0 = stackOut_14_0;
                      if (!b.field_Db) {
                        stackOut_16_0 = (StringBuilder) (Object) stackIn_16_0;
                        stackOut_16_1 = am.field_b;
                        stackIn_17_0 = stackOut_16_0;
                        stackIn_17_1 = stackOut_16_1;
                        break L5;
                      } else {
                        stackOut_15_0 = (StringBuilder) (Object) stackIn_15_0;
                        stackOut_15_1 = ad.field_f;
                        stackIn_17_0 = stackOut_15_0;
                        stackIn_17_1 = stackOut_15_1;
                        break L5;
                      }
                    }
                    var7 = stackIn_17_1;
                    break L0;
                  }
                } else {
                  L6: {
                    stackOut_9_0 = new StringBuilder().append(var19);
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (!gb.field_H.field_g) {
                      stackOut_11_0 = (StringBuilder) (Object) stackIn_11_0;
                      stackOut_11_1 = fn.field_g;
                      stackIn_12_0 = stackOut_11_0;
                      stackIn_12_1 = stackOut_11_1;
                      break L6;
                    } else {
                      stackOut_10_0 = (StringBuilder) (Object) stackIn_10_0;
                      stackOut_10_1 = cc.field_v[bc.field_c];
                      stackIn_12_0 = stackOut_10_0;
                      stackIn_12_1 = stackOut_10_1;
                      break L6;
                    }
                  }
                  var7 = stackIn_12_1;
                  break L0;
                }
              } else {
                L7: {
                  stackOut_4_0 = new StringBuilder().append(var19);
                  stackIn_6_0 = stackOut_4_0;
                  stackIn_5_0 = stackOut_4_0;
                  if (gb.field_H.field_g) {
                    stackOut_6_0 = (StringBuilder) (Object) stackIn_6_0;
                    stackOut_6_1 = ld.field_f;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L7;
                  } else {
                    stackOut_5_0 = (StringBuilder) (Object) stackIn_5_0;
                    stackOut_5_1 = sd.field_b;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    break L7;
                  }
                }
                var7 = stackIn_7_1;
                break L0;
              }
            }
          }
          L8: {
            L9: {
              var20 = var7.toUpperCase();
              var8 = mc.field_b.a(var20);
              var9 = this.c(108, param3);
              var10 = this.a((byte) -94, param3);
              var11 = this.d(22, param3);
              if (-15 == (var6 ^ -1)) {
                break L9;
              } else {
                if (15 != var6) {
                  break L8;
                } else {
                  break L9;
                }
              }
            }
            var8 = ok.field_L + 120;
            break L8;
          }
          L10: {
            var12 = -var8 + (var9 + var10) >> 964551617;
            var13 = this.a(param3, (byte) -123);
            var14 = var10 - var9;
            var15 = this.a(param3, (byte) 56);
            fd.a(param2, 6752, var14, var9, param1, var11, var15);
            if (!param1) {
              stackOut_51_0 = 8437759;
              stackIn_52_0 = stackOut_51_0;
              break L10;
            } else {
              stackOut_50_0 = 16777215;
              stackIn_52_0 = stackOut_50_0;
              break L10;
            }
          }
          L11: {
            var16 = stackIn_52_0;
            if (17 != var6) {
              break L11;
            } else {
              if (gb.field_H.field_g) {
                break L11;
              } else {
                L12: {
                  if (param1) {
                    stackOut_56_0 = 12632256;
                    stackIn_57_0 = stackOut_56_0;
                    break L12;
                  } else {
                    stackOut_55_0 = 7829367;
                    stackIn_57_0 = stackOut_55_0;
                    break L12;
                  }
                }
                var16 = stackIn_57_0;
                break L11;
              }
            }
          }
          L13: {
            L14: {
              mc.field_b.b(var20, var12, var11 + mc.field_b.field_H, var16, -1);
              if ((var6 ^ -1) == -15) {
                break L14;
              } else {
                if ((var6 ^ -1) == -16) {
                  break L14;
                } else {
                  break L13;
                }
              }
            }
            L15: {
              var12 = var12 + ok.field_L;
              df.e(var12, -1 + var13 / 2 + var11, 121, 2, var16);
              if (14 == var6) {
                stackOut_63_0 = 120 * ag.field_c / 256;
                stackIn_64_0 = stackOut_63_0;
                break L15;
              } else {
                stackOut_62_0 = c.field_a * 120 / 256;
                stackIn_64_0 = stackOut_62_0;
                break L15;
              }
            }
            var17 = stackIn_64_0;
            df.e(var17 + var12 - 1, 3 + var11, 3, -6 + var13, var16);
            break L13;
          }
          return;
        } else {
          return;
        }
    }

    private final int a(byte param0, int param1) {
        if (((oi) this).field_e == 6) {
            if (!(qm.i(20))) {
                return (param1 ^ -1) <= -3 ? ag.field_h[((oi) this).field_e] : 310 - -(param1 * 180);
            }
        }
        if (param0 != -94) {
            this.b((byte) -114, -126);
        }
        return ag.field_h[((oi) this).field_e];
    }

    private final int c(int param0, int param1) {
        int var3 = 104 / ((param0 - 9) / 63);
        if (((oi) this).field_e == 6) {
            if (!qm.i(20)) {
                return param1 < 2 ? 150 + 180 * param1 : ag.field_b[((oi) this).field_e];
            }
        }
        return ag.field_b[((oi) this).field_e];
    }

    private final int a(int param0, byte param1) {
        int var3 = 122 / ((param1 - -60) / 54);
        return 30;
    }

    public static void c(int param0) {
        field_a = null;
        field_c = null;
        if (param0 < 76) {
            field_b = -59L;
        }
        field_h = null;
    }

    final void d(int param0) {
        if ((((oi) this).field_e ^ -1) == -7) {
            mm.field_j = null;
        }
        if (param0 != -11308) {
            field_h = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = true;
        field_g = 0;
        field_h = new StringBuilder(80);
        field_b = 0L;
        field_a = new p();
    }
}
