/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
        int discarded$0 = 0;
        mg var7;
        int var8;
        mg var9;
        mg var10;
        mg stackIn_4_0 = null;
        mg stackIn_10_0 = null;
        L0: {
          var8 = Virogrid.field_F ? 1 : 0;
          if (-33 == (param4 ^ -1)) {
            L1: {
              if ((1 << param3 & rn.field_c) != 0) {
                stackIn_10_0 = vd.field_Y[param3];
                break L1;
              } else {
                stackIn_10_0 = tn.field_b;
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
                stackIn_4_0 = cb.field_d[param3];
                break L2;
              } else {
                stackIn_4_0 = mj.field_F;
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
            discarded$0 = this.a(74, (byte) -42, -91);
            break L4;
          }
        }
    }

    private final void b(byte param0, int param1) {
        int stackIn_22_0 = 0;
        int stackIn_33_0 = 0;
        v stackIn_80_0 = null;
        v stackIn_81_0 = null;
        String stackIn_81_1 = null;
        int stackIn_94_0 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23;
        int var24;
        int var25;
        int var26;
        L0: {
          var26 = Virogrid.field_F ? 1 : 0;
          var3 = 10;
          if (db.b((byte) 13, 0)) {
            break L0;
          } else {
            if ((512 & rn.field_c) != 0) {
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
                stackIn_22_0 = ll.field_d;
                break L3;
              } else {
                stackIn_22_0 = vm.field_c;
                break L3;
              }
            }
            L4: {
              var6 = stackIn_22_0;
              ah.a(400, 100, 32 + var5, 1141646, 120);
              var7 = 124;
              if (-1 != var6) {
                L5: {
                  if (!og.field_j[var6]) {
                    if ((rn.field_c & 1 << var6) != 0) {
                      stackIn_33_0 = 1;
                      break L5;
                    } else {
                      stackIn_33_0 = 0;
                      break L5;
                    }
                  } else {
                    stackIn_33_0 = 1;
                    break L5;
                  }
                }
                L6: {
                  var8 = stackIn_33_0;
                  if (-3 == (param1 ^ -1)) {
                    break L6;
                  } else {
                    mc.field_b.b(qk.field_d[var6].toUpperCase(), 320, 60 + var7, 8437759, -1);
                    if (-1 == (rn.field_c & 1 << var6 ^ -1)) {
                      vg.field_H.b(rk.field_g.toUpperCase(), 320, var7 + 78, 16711680, -1);
                      break L6;
                    } else {
                      vg.field_H.b(fl.field_j.toUpperCase(), 320, 78 + var7, 65280, -1);
                      break L6;
                    }
                  }
                }
                L7: {
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
                    break L7;
                  } else {
                    L8: {
                      if ((var10 ^ -1) <= -1) {
                        break L8;
                      } else {
                        ad.field_b.a(-(var19 >> 1918836641) + var9 + var24, -(var19 >> -694969855) + (var25 + (var9 / 2 - -var10)), var19, var19);
                        break L8;
                      }
                    }
                    L9: {
                      if ((vc.field_eb[var6] ^ -1) <= -3) {
                        if (var12 >= 0) {
                          break L9;
                        } else {
                          ad.field_b.a(var11 + var24 + -(var20 >> -1186501183), -(var20 >> -924344223) + -(var11 / 2) + (var25 + var12), var20, var20);
                          break L9;
                        }
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      if (3 <= vc.field_eb[var6]) {
                        if (-1 >= (var14 ^ -1)) {
                          break L10;
                        } else {
                          ad.field_b.a(-(var21 >> -929316319) + (var24 + var13), -(var21 >> 418896033) + -(var13 / 2) + (var25 - -var14), var21, var21);
                          break L10;
                        }
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      if (vc.field_eb[var6] >= 4) {
                        if (-1 < (var16 ^ -1)) {
                          ad.field_b.a(-(var22 >> -1419420223) + var24 - -var15, var16 + var25 - var15 / 2 - (var22 >> 270916865), var22, var22);
                          break L11;
                        } else {
                          break L11;
                        }
                      } else {
                        break L11;
                      }
                    }
                    if (vc.field_eb[var6] < 5) {
                      break L7;
                    } else {
                      if (0 > var18) {
                        ad.field_b.a(var17 + var24 - (var23 >> 1682625601), var25 - (var17 / 2 + -var18 - -(var23 >> -327835423)), var23, var23);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                }
                L12: {
                  this.a(var24, 3624, false, var6, 128, var25);
                  if ((vc.field_eb[var6] ^ -1) <= -2) {
                    L13: {
                      if (-1 >= (var10 ^ -1)) {
                        ad.field_b.a(var24 - (-var9 + (var19 >> -872265471)), -(var19 >> 1472837217) + var10 + var25 - -(var9 / 2), var19, var19);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                    L14: {
                      if (-3 >= (vc.field_eb[var6] ^ -1)) {
                        if (0 > var12) {
                          break L14;
                        } else {
                          ad.field_b.a(-(var20 >> 42957825) + var24 - -var11, -(var20 >> -144031231) + var12 + var25 + -(var11 / 2), var20, var20);
                          break L14;
                        }
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if (vc.field_eb[var6] < 3) {
                        break L15;
                      } else {
                        if (-1 < (var14 ^ -1)) {
                          break L15;
                        } else {
                          ad.field_b.a(var13 + var24 + -(var21 >> -1388123743), -(var21 >> -50719007) + (var14 + var25 + -(var13 / 2)), var21, var21);
                          break L15;
                        }
                      }
                    }
                    L16: {
                      if (vc.field_eb[var6] < 4) {
                        break L16;
                      } else {
                        if (-1 >= (var16 ^ -1)) {
                          ad.field_b.a(-(var22 >> 1573054113) + var24 - -var15, var16 + var25 - (var15 / 2 - -(var22 >> 1071332545)), var22, var22);
                          break L16;
                        } else {
                          break L16;
                        }
                      }
                    }
                    if (5 <= vc.field_eb[var6]) {
                      if ((var18 ^ -1) > -1) {
                        break L12;
                      } else {
                        ad.field_b.a(-(var23 >> -1767683711) + var24 + var17, -(var23 >> -1014673887) + (var18 + -(var17 / 2) + var25), var23, var23);
                        break L12;
                      }
                    } else {
                      break L12;
                    }
                  } else {
                    break L12;
                  }
                }
                if ((param1 ^ -1) == -3) {
                  break L4;
                } else {
                  L17: {
                    vg.field_H.b(qg.field_m.toUpperCase(), 320, var7 + 158, 8437759, -1);
                    vg.field_H.b(Integer.toString(h.field_c[var6]), 420, 158 + var7, 8437759, -1);
                    vg.field_H.b(wb.field_i.toUpperCase(), 320, var7 - -178, 8437759, -1);
                    vg.field_H.b(Integer.toString(vc.field_eb[var6]), 420, var7 + 178, 8437759, -1);
                    stackIn_80_0 = vg.field_H;

                    if (var8 == 0) {
                      stackIn_81_0 = (v) ((Object) stackIn_80_0);
                      stackIn_81_1 = "???";
                      break L17;
                    } else {
                      stackIn_81_0 = (v) ((Object) stackIn_80_0);
                      stackIn_81_1 = ak.field_b[var6].toUpperCase();
                      break L17;
                    }
                  }
                  ((v) (Object) stackIn_81_0).a(stackIn_81_1, 320, var7 + 92, 190, 80, 8437759, -1, 0, 0, 20);
                  break L4;
                }
              } else {
                if ((param1 ^ -1) == -3) {
                  break L4;
                } else {
                  if (qm.i(20)) {
                    vg.field_H.c(pc.field_a.toUpperCase(), 320, 270, 8437759, -1);
                    vg.field_H.c(dd.field_f.toUpperCase(), 320, 290, 8437759, -1);
                    vg.field_H.a(kn.field_L.toUpperCase(), 160, 210, 320, 80, 8437759, -1, 1, 0, 20);
                    break L4;
                  } else {
                    vg.field_H.a(kn.field_L.toUpperCase(), 160, 240, 320, 80, 8437759, -1, 1, 0, 20);
                    break L4;
                  }
                }
              }
            }
            L18: {
              var8 = 340;
              if (!qm.i(20)) {
                break L18;
              } else {
                var8 -= 20;
                break L18;
              }
            }
            L19: {
              vg.field_H.c(dg.field_G.toUpperCase(), 320, var8, 8437759, -1);
              if (!qm.i(20)) {
                ah.a(400, 100, 350, 1141646, 120);
                break L19;
              } else {
                break L19;
              }
            }
            return;
          } else {
            L20: {
              var7 = var6;
              if (jk.field_d[var7]) {
                if (0 == (1 << var7 & rn.field_c)) {
                  if (jk.field_d[var7]) {
                    if (db.b((byte) 13, 0)) {
                      stackIn_94_0 = 1;
                      break L20;
                    } else {
                      stackIn_94_0 = 0;
                      break L20;
                    }
                  } else {
                    stackIn_94_0 = 0;
                    break L20;
                  }
                } else {
                  stackIn_94_0 = 1;
                  break L20;
                }
              } else {
                stackIn_94_0 = 1;
                break L20;
              }
            }
            var8 = stackIn_94_0;
            if (var8 != 0) {
              this.a(var4, 3624, true, var7, a.field_J[var7], var5);
              var4 += 40;
              var6++;
              continue L2;
            } else {
              var4 += 40;
              var6++;
              continue L2;
            }
          }
        }
    }

    private final void a(int param0) {
        int var2;
        L0: {
          var2 = this.field_f.field_d;
          if (param0 == 0) {
            break L0;
          } else {
            field_h = (StringBuilder) null;
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
          if (0 != ag.field_j[this.field_e].length) {
            this.field_f.e(param0 ^ 61);
            break L1;
          } else {
            break L1;
          }
        }
        L3: {
          if (this.field_f.field_d != var2) {
            vm.a((byte) 30, wc.field_a);
            break L3;
          } else {
            break L3;
          }
        }
    }

    final void b(int param0, int param1, int param2) {
        int stackIn_2_0;
        int stackIn_2_1;
        int stackIn_2_2;
        int stackIn_2_3;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        int stackIn_3_4 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        L0: {
          var7 = Virogrid.field_F ? 1 : 0;
          df.b(100, 0, 10, 400, 0);
          df.b(530, 0, 10, 400, 0);
          stackIn_2_0 = 110;

          stackIn_2_1 = 0;

          stackIn_2_2 = 420;

          stackIn_2_3 = 400;

          if ((param1 ^ -1) == -2) {
            stackIn_3_0 = stackIn_2_0;
            stackIn_3_1 = stackIn_2_1;
            stackIn_3_2 = stackIn_2_2;
            stackIn_3_3 = stackIn_2_3;
            stackIn_3_4 = 127;
            break L0;
          } else {
            stackIn_3_0 = stackIn_2_0;
            stackIn_3_1 = stackIn_2_1;
            stackIn_3_2 = stackIn_2_2;
            stackIn_3_3 = stackIn_2_3;
            stackIn_3_4 = 263172;
            break L0;
          }
        }
        df.b(stackIn_3_0, stackIn_3_1, stackIn_3_2, stackIn_3_3, stackIn_3_4);
        if (-11 != (this.field_e ^ -1)) {
          var4 = -(hd.field_b.a(lc.field_e[this.field_e]) / 2) + 320;
          if (param2 < -61) {
            L1: {
              var5 = 40;
              if (this.field_e == 0) {
                eh.field_l.a(-(eh.field_l.field_j / 2) + 320, 20);
                break L1;
              } else {
                hd.field_b.b(lc.field_e[this.field_e], var4, var5, 1141646, -1);
                break L1;
              }
            }
            ah.a(400, 100, 72, 1141646, 120);
            var6 = 0;
            L2: while (true) {
              if (this.field_f.field_o <= var6) {
                L3: {
                  if ((this.field_e ^ -1) == -7) {
                    this.a(param1, 16290);
                    break L3;
                  } else {
                    if (7 == this.field_e) {
                      this.a(param0, param1, (byte) 20);
                      break L3;
                    } else {
                      if (8 != this.field_e) {
                        L4: {
                          if ((this.field_e ^ -1) != -10) {
                            break L4;
                          } else {
                            if (param1 == 2) {
                              break L4;
                            } else {
                              hd.field_b.a(kn.field_J, 135, 78, 370, 180, 8437759, -1, 1, 0, 18);
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
                if (this.b(var6, -115)) {
                  L5: {
                    stackIn_16_0 = this;

                    stackIn_16_1 = 64;

                    if (this.field_f.field_d != var6) {
                      stackIn_17_0 = this;
                      stackIn_17_1 = stackIn_16_1;
                      stackIn_17_2 = 0;
                      break L5;
                    } else {
                      stackIn_17_0 = this;
                      stackIn_17_1 = stackIn_16_1;
                      stackIn_17_2 = 1;
                      break L5;
                    }
                  }
                  this.a((byte) stackIn_17_1, stackIn_17_2 != 0, param1, var6);
                  var6++;
                  continue L2;
                } else {
                  var6++;
                  continue L2;
                }
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
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        String stackIn_27_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
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
        String var12 = null;
        var11 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = param1.length();
              var4 = var3_int;
              var5 = 0;
              if (param2 == 2) {
                break L1;
              } else {
                var12 = (String) null;
                oi.a((String[]) null, (String) null, -50);
                break L1;
              }
            }
            L2: while (true) {
              var6_int = param1.indexOf("<%", var5);
              if (-1 < (var6_int ^ -1)) {
                var6 = new StringBuilder(var4);
                var7 = 0;
                var5 = 0;
                L3: while (true) {
                  var8 = param1.indexOf("<%", var5);
                  if (-1 >= (var8 ^ -1)) {
                    var5 = var8 + 2;
                    L4: while (true) {
                      L5: {
                        if (var5 >= var3_int) {
                          break L5;
                        } else {
                          if (!kf.a(0, param1.charAt(var5))) {
                            break L5;
                          } else {
                            var5++;
                            continue L4;
                          }
                        }
                      }
                      var9 = param1.substring(var8 + 2, var5);
                      if (pa.a((CharSequence) ((Object) var9), param2 ^ -123)) {
                        if (var5 >= var3_int) {
                          continue L3;
                        } else {
                          if (param1.charAt(var5) == 62) {
                            var5++;
                            var10 = fm.a((CharSequence) ((Object) var9), false);
                            discarded$0 = var6.append(param1.substring(var7, var8));
                            var7 = var5;
                            discarded$1 = var6.append(args[var10]);
                            continue L3;
                          } else {
                            continue L3;
                          }
                        }
                      } else {
                        continue L3;
                      }
                    }
                  } else {
                    discarded$2 = var6.append(param1.substring(var7));
                    stackIn_27_0 = var6.toString();
                    break L0;
                  }
                }
              } else {
                var5 = 2 + var6_int;
                L6: while (true) {
                  L7: {
                    if (var3_int <= var5) {
                      break L7;
                    } else {
                      if (!kf.a(0, param1.charAt(var5))) {
                        break L7;
                      } else {
                        var5++;
                        continue L6;
                      }
                    }
                  }
                  var7_ref_String = param1.substring(2 + var6_int, var5);
                  if (pa.a((CharSequence) ((Object) var7_ref_String), param2 + -113)) {
                    if (var3_int <= var5) {
                      continue L2;
                    } else {
                      if (param1.charAt(var5) != 62) {
                        continue L2;
                      } else {
                        var5++;
                        var8 = fm.a((CharSequence) ((Object) var7_ref_String), false);
                        var4 = var4 + (-var5 - -var6_int + args[var8].length());
                        continue L2;
                      }
                    }
                  } else {
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var3);

            stackIn_30_1 = new StringBuilder().append("oi.F(");

            if (args == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L8;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L9;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L9;
            }
          }
          throw kg.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ',' + param2 + ')');
        }
        return stackIn_27_0;
    }

    final static void a(boolean param0, int param1) {
        mi.a(param0, -8241);
        if (param1 != 6) {
            field_c = (sc[]) null;
        }
        we.a(false, param0);
    }

    private final int a(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
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
        int stackIn_25_0;
        int stackIn_25_1;
        int stackIn_25_2;
        int stackIn_25_3;
        int stackIn_26_0;
        int stackIn_26_1;
        int stackIn_26_2;
        int stackIn_26_3;
        int stackIn_26_4;
        int var3;
        int var4;
        int var5;
        String var6;
        String[] var7;
        int[] var8;
        int var9;
        int var10;
        int var11;
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
                field_c = (sc[]) null;
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
                          stackIn_25_0 = 118;

                          stackIn_25_1 = -vg.field_H.field_H + -vg.field_H.field_G + var4;

                          stackIn_25_2 = 400;

                          stackIn_25_3 = 22;

                          if (var10 % 2 != 1) {
                            stackIn_26_0 = stackIn_25_0;
                            stackIn_26_1 = stackIn_25_1;
                            stackIn_26_2 = stackIn_25_2;
                            stackIn_26_3 = stackIn_25_3;
                            stackIn_26_4 = 665399;
                            break L6;
                          } else {
                            stackIn_26_0 = stackIn_25_0;
                            stackIn_26_1 = stackIn_25_1;
                            stackIn_26_2 = stackIn_25_2;
                            stackIn_26_3 = stackIn_25_3;
                            stackIn_26_4 = 996169;
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
        String var17 = null;
        int var10_int = param1 + param7 - -param4;
        if (0 != (param6 ^ -1)) {
            vg.field_H.a(param6 + 1 + ". ", 140, param3, param5, -1);
        }
        if (!(var10_int == 0)) {
            param4 = (param4 * 200 - -var10_int) / (var10_int * 2);
            param1 = (var10_int + param1 * 200) / (2 * var10_int);
            param7 = (param7 * 200 + var10_int) / (var10_int * 2);
        }
        String var12 = param2;
        vg.field_H.b(var12, 140, param3, param5, -1);
        String var13 = Integer.toString(param8);
        vg.field_H.c(var13, 310, param3, param5, -1);
        String var14 = var10_int < 50 ? Integer.toString(var10_int) : "50+";
        String var11 = var14;
        vg.field_H.c(var14, 368, param3, param5, -1);
        String var15 = param7 + "%";
        vg.field_H.c(var15, 420, param3, param5, -1);
        String var16 = param1 + "%";
        if (param0 != 178) {
            return;
        }
        try {
            vg.field_H.c(var16, 458, param3, param5, -1);
            var17 = param4 + "%";
            vg.field_H.c(var17, 500, param3, param5, -1);
        } catch (RuntimeException runtimeException) {
            throw kg.a((Throwable) ((Object) runtimeException), "oi.CA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final void a(boolean param0, double param1, double param2, int param3, int param4, int param5) {
        int var9 = 0;
        int var10 = 0;
        int var11 = Virogrid.field_F ? 1 : 0;
        if ((param3 ^ -1) == -3) {
            return;
        }
        if (!qe.field_k && !eh.field_e) {
            if (this.field_e != 8) {
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
                this.field_f.a(-1, false, -1);
            } else {
                var9 = this.field_f.field_d;
                var10 = this.a((int)param1, (byte) -128, (int)param2);
                this.field_f.a(var10, false, var10);
                if (-1 != this.field_f.field_d) {
                    this.a(this.field_f.field_d, true, param4 ^ -423235729);
                }
                if (this.field_f.field_d != var9) {
                    vm.a((byte) 30, wc.field_a);
                }
            }
        }
        if (param4 != -3666) {
            field_a = (p) null;
        }
    }

    private final void b(int param0) {
        int var3;
        L0: {
          var3 = Virogrid.field_F ? 1 : 0;
          if (96 == um.field_Gb) {
            if (this.field_f.field_d > 0) {
              if (this.field_f.field_d == 2) {
                break L0;
              } else {
                this.field_f.a(-75, 0);
                break L0;
              }
            } else {
              this.field_f.a(param0 + -168, 1);
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
            if ((this.field_f.field_d ^ -1) != -2) {
              if (-3 != (this.field_f.field_d ^ -1)) {
                this.field_f.a(-120, 1);
                break L1;
              } else {
                break L1;
              }
            } else {
              this.field_f.a(param0 + -105, 0);
              break L1;
            }
          }
        }
        L2: {
          if ((um.field_Gb ^ -1) == -100) {
            L3: {
              if ((this.field_f.field_d ^ -1) > -1) {
                break L3;
              } else {
                if ((this.field_f.field_d ^ -1) < -2) {
                  break L3;
                } else {
                  this.field_f.a(-75, 2);
                  break L2;
                }
              }
            }
            this.field_f.a(param0 ^ -39, uk.field_c);
            break L2;
          } else {
            break L2;
          }
        }
        L4: {
          if (-99 != (um.field_Gb ^ -1)) {
            break L4;
          } else {
            if (-3 == (this.field_f.field_d ^ -1)) {
              this.field_f.a(-61, uk.field_c);
              break L4;
            } else {
              this.field_f.a(-76, 2);
              break L4;
            }
          }
        }
        L5: {
          if (param0 == 72) {
            break L5;
          } else {
            this.a((byte) -44);
            break L5;
          }
        }
        this.field_f.d((byte) 32);
    }

    private final void b(byte param0) {
        vg.field_H.c(mb.field_mb.toUpperCase(), 320, 197 + hd.field_b.field_H, 8437759, -1);
        if (param0 > -1) {
            this.a((byte) -58, false, -58, 36);
        }
    }

    private final void a(int param0, boolean param1, int param2) {
        int var4 = ag.field_j[this.field_e][param0];
        this.b(param0, var4, (byte) 124);
        if (param2 != 423239361) {
            field_b = 60L;
        }
        if (this.field_f.b(83)) {
            if (14 != var4 && (var4 ^ -1) != -16) {
                vm.a((byte) 30, bg.field_Lb);
            }
            wh.a(2094, param1, var4);
        }
    }

    final void a(byte param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = Virogrid.field_F ? 1 : 0;
        if ((this.field_f.field_d ^ -1) != 0) {
            param1 = this.field_f.field_d;
        }
        if (param0 <= 115) {
            return;
        }
        this.field_f.a(param2, this.a((int)fa.field_k, (byte) -128, (int)sf.field_M), -563, param1);
        qd.field_c = id.field_r;
        if (!((this.field_e ^ -1) != -9)) {
            vm.field_c = -1;
            ll.field_d = -1;
            for (var4 = 0; -11 < (var4 ^ -1); var4++) {
                a.field_J[var4] = 0;
            }
        }
    }

    private final int d(int param0, int param1) {
        if (6 == this.field_e && !qm.i(param0 ^ 2)) {
            if (!(-3 >= (param1 ^ -1))) {
                return ag.field_f[this.field_e];
            }
            return ag.field_f[this.field_e] + ag.field_a[this.field_e];
        }
        if (param0 != 22) {
            field_h = (StringBuilder) null;
        }
        return param1 * ag.field_a[this.field_e] + ag.field_f[this.field_e];
    }

    private final int a(int param0, byte param1, int param2) {
        int var4;
        int var5;
        int var6;
        var6 = Virogrid.field_F ? 1 : 0;
        if (hk.field_Jb > we.field_c.field_J) {
          return -1;
        } else {
          var4 = 0;
          L0: while (true) {
            if (ag.field_j[this.field_e].length <= var4) {
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
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int stackIn_116_0 = 0;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        L0: {
          var8 = Virogrid.field_F ? 1 : 0;
          if (param2 >= 81) {
            break L0;
          } else {
            this.b(-95, 86, -94);
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
                                                            if (this.field_f.a((byte) 119)) {
                                                              bm.d(0, 0);
                                                              break L3;
                                                            } else {
                                                              break L3;
                                                            }
                                                          }
                                                          L4: {
                                                            if (this.field_f.c((byte) 102)) {
                                                              bm.d(256, 0);
                                                              break L4;
                                                            } else {
                                                              break L4;
                                                            }
                                                          }
                                                          L5: {
                                                            if (this.field_f.e((byte) 122)) {
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
                                                            if (this.field_f.g(31)) {
                                                              vl.a(11864);
                                                              break L6;
                                                            } else {
                                                              break L6;
                                                            }
                                                          }
                                                          if (!this.field_f.b((byte) -128)) {
                                                            break L2;
                                                          } else {
                                                            ib.a((byte) 99);
                                                            break L1;
                                                          }
                                                        } else {
                                                          if ((var5 ^ -1) == -17) {
                                                            L7: {
                                                              if (this.field_f.d(26505)) {
                                                                break L7;
                                                              } else {
                                                                if (!this.field_f.c(-1)) {
                                                                  break L2;
                                                                } else {
                                                                  break L7;
                                                                }
                                                              }
                                                            }
                                                            if (-3 >= (bc.field_c ^ -1)) {
                                                              bc.field_c = 0;
                                                              ka.a(true, (byte) 87);
                                                              break L1;
                                                            } else {
                                                              bc.field_c = co.field_l;
                                                              ka.a(true, (byte) 87);
                                                              break L1;
                                                            }
                                                          } else {
                                                            if (-18 != (var5 ^ -1)) {
                                                              L8: {
                                                                if ((var5 ^ -1) == -29) {
                                                                  L9: {
                                                                    if (this.field_f.c(-1)) {
                                                                      break L9;
                                                                    } else {
                                                                      if (this.field_f.d(26505)) {
                                                                        break L9;
                                                                      } else {
                                                                        break L8;
                                                                      }
                                                                    }
                                                                  }
                                                                  L10: {
                                                                    if (b.field_Db) {
                                                                      stackIn_116_0 = 0;
                                                                      break L10;
                                                                    } else {
                                                                      stackIn_116_0 = 1;
                                                                      break L10;
                                                                    }
                                                                  }
                                                                  b.field_Db = stackIn_116_0 != 0;
                                                                  break L8;
                                                                } else {
                                                                  if ((var5 ^ -1) != -26) {
                                                                    if (-27 != (var5 ^ -1)) {
                                                                      if (var5 == 27) {
                                                                        if (!this.field_f.c(-1)) {
                                                                          if (!this.field_f.d(26505)) {
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
                                                                      if (this.field_f.c(-1)) {
                                                                        eg.field_y = (eg.field_y + 1) % sh.field_yb.length;
                                                                        break L1;
                                                                      } else {
                                                                        if (!this.field_f.d(26505)) {
                                                                          break L2;
                                                                        } else {
                                                                          eg.field_y = (-1 - (-sh.field_yb.length - eg.field_y)) % sh.field_yb.length;
                                                                          break L1;
                                                                        }
                                                                      }
                                                                    }
                                                                  } else {
                                                                    break L8;
                                                                  }
                                                                }
                                                              }
                                                              if (!this.field_f.c(-1)) {
                                                                if (this.field_f.d(26505)) {
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
                                                                if (!this.field_f.d(26505)) {
                                                                  if (!this.field_f.c(-1)) {
                                                                    break L2;
                                                                  } else {
                                                                    L11: {
                                                                      fieldTemp$0 = bc.field_c + 1;
                                                                      bc.field_c = bc.field_c + 1;
                                                                      if (fieldTemp$0 < cc.field_v.length) {
                                                                        break L11;
                                                                      } else {
                                                                        bc.field_c = 2;
                                                                        break L11;
                                                                      }
                                                                    }
                                                                    co.field_l = bc.field_c;
                                                                    ka.a(true, (byte) 87);
                                                                    break L1;
                                                                  }
                                                                } else {
                                                                  fieldTemp$1 = bc.field_c - 1;
                                                                  bc.field_c = bc.field_c - 1;
                                                                  if (2 > fieldTemp$1) {
                                                                    bc.field_c = cc.field_v.length + -1;
                                                                    co.field_l = bc.field_c;
                                                                    ka.a(true, (byte) 87);
                                                                    break L1;
                                                                  } else {
                                                                    co.field_l = bc.field_c;
                                                                    ka.a(true, (byte) 87);
                                                                    break L1;
                                                                  }
                                                                }
                                                              }
                                                            }
                                                          }
                                                        }
                                                      } else {
                                                        L12: {
                                                          var4 = 0;
                                                          if (!this.field_f.a((byte) 104)) {
                                                            break L12;
                                                          } else {
                                                            if (-1 > (ag.field_c ^ -1)) {
                                                              qe.a((byte) 83, 0);
                                                              var4 = 1;
                                                              break L12;
                                                            } else {
                                                              break L12;
                                                            }
                                                          }
                                                        }
                                                        L13: {
                                                          if (!this.field_f.c((byte) 46)) {
                                                            break L13;
                                                          } else {
                                                            if ((ag.field_c ^ -1) <= -257) {
                                                              break L13;
                                                            } else {
                                                              qe.a((byte) 43, 256);
                                                              var4 = 1;
                                                              break L13;
                                                            }
                                                          }
                                                        }
                                                        L14: {
                                                          if (!this.field_f.e((byte) 121)) {
                                                            break L14;
                                                          } else {
                                                            L15: {
                                                              var5 = -120 + (this.c(102, param0) + this.a((byte) -94, param0)) + ok.field_L >> 888064353;
                                                              var6 = (int)sf.field_M + -var5;
                                                              var7 = var6 * 256 / 120;
                                                              if (0 >= var7) {
                                                                qe.a((byte) 58, 0);
                                                                break L15;
                                                              } else {
                                                                if (-257 >= (var7 ^ -1)) {
                                                                  qe.a((byte) 61, 256);
                                                                  break L15;
                                                                } else {
                                                                  qe.a((byte) 35, var7);
                                                                  break L15;
                                                                }
                                                              }
                                                            }
                                                            var4 = 1;
                                                            break L14;
                                                          }
                                                        }
                                                        L16: {
                                                          if (!this.field_f.g(31)) {
                                                            break L16;
                                                          } else {
                                                            if ((ag.field_c ^ -1) >= -1) {
                                                              break L16;
                                                            } else {
                                                              on.a(88);
                                                              var4 = 1;
                                                              break L16;
                                                            }
                                                          }
                                                        }
                                                        L17: {
                                                          if (!this.field_f.b((byte) -125)) {
                                                            break L17;
                                                          } else {
                                                            if (-257 >= (ag.field_c ^ -1)) {
                                                              break L17;
                                                            } else {
                                                              ul.c((byte) 64);
                                                              var4 = 1;
                                                              break L17;
                                                            }
                                                          }
                                                        }
                                                        if (var4 != 0) {
                                                          L18: {
                                                            if (!this.field_f.e((byte) 122)) {
                                                              break L18;
                                                            } else {
                                                              if (qd.field_c < id.field_r) {
                                                                break L18;
                                                              } else {
                                                                break L1;
                                                              }
                                                            }
                                                          }
                                                          vm.a((byte) 30, bg.field_Lb);
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
        this.field_e = param0;
        this.field_f = new tn(ag.field_j[this.field_e].length);
        if (ag.field_j[this.field_e].length == 0) {
            this.field_f.field_d = -1;
        }
    }

    final void a(byte param0) {
        int discarded$0 = 0;
        int stackIn_31_0 = 0;
        int var2;
        int var3;
        int var4;
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
                      if (-3 == (this.field_e ^ -1)) {
                        break L2;
                      } else {
                        if (-4 == (this.field_e ^ -1)) {
                          break L2;
                        } else {
                          if (-5 == (this.field_e ^ -1)) {
                            break L2;
                          } else {
                            if (this.field_e != 5) {
                              if (bd.field_e == this.field_e) {
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
                    if (-1 == this.field_f.field_d) {
                      continue L1;
                    } else {
                      this.a(this.field_f.field_d, false, 423239361);
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
            discarded$0 = this.c(-89, -85);
            break L4;
          }
        }
        L5: {
          if (-9 != (this.field_e ^ -1)) {
            break L5;
          } else {
            var2 = 0;
            L6: while (true) {
              if (-11 >= (var2 ^ -1)) {
                break L5;
              } else {
                L7: {
                  if (var2 == ll.field_d) {
                    stackIn_31_0 = 48;
                    break L7;
                  } else {
                    if (vm.field_c == var2) {
                      stackIn_31_0 = 40;
                      break L7;
                    } else {
                      stackIn_31_0 = 32;
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
            vg.field_H.a(var4, 135, 78, 370, 180, 8437759, -1, 0, 0, 18);
        }
    }

    private final boolean b(int param0, int param1) {
        if (param1 > -100) {
            this.a((byte) 52, false, -102, -36);
        }
        return true;
    }

    private final void a(byte param0, boolean param1, int param2, int param3) {
        StringBuilder stackIn_6_0 = null;
        StringBuilder stackIn_7_0 = null;
        String stackIn_7_1 = null;
        StringBuilder stackIn_11_0 = null;
        StringBuilder stackIn_12_0 = null;
        String stackIn_12_1 = null;
        StringBuilder stackIn_16_0 = null;
        StringBuilder stackIn_17_0 = null;
        String stackIn_17_1 = null;
        String stackIn_26_0 = null;
        int stackIn_52_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_64_0 = 0;
        int var5;
        int var6;
        String var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        String var19;
        String var20;
        var18 = Virogrid.field_F ? 1 : 0;
        if ((param2 ^ -1) != -3) {
          L0: {
            var5 = -24 % ((param0 - -92) / 33);
            var6 = ag.field_j[this.field_e][param3];
            var19 = de.field_pb[var6];
            var7 = var19;
            var7 = var19;
            var7 = var19;
            if (var6 == 8) {
              L1: {
                if (bd.field_e == 0) {
                  break L1;
                } else {
                  if (hm.field_c != 0) {
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
                        var7 = oi.a(new String[]{wc.field_c[1][ll.field_b]}, var19, 2);
                        break L0;
                      } else {
                        if (27 == var6) {
                          var7 = oi.a(new String[]{mh.field_i[ce.field_I]}, var19, 2);
                          break L0;
                        } else {
                          if (var6 != 19) {
                            break L0;
                          } else {
                            L4: {
                              if (-1 != (nf.field_g ^ -1)) {
                                stackIn_26_0 = en.field_Eb;
                                break L4;
                              } else {
                                stackIn_26_0 = hk.field_Gb;
                                break L4;
                              }
                            }
                            var7 = stackIn_26_0;
                            break L0;
                          }
                        }
                      }
                    } else {
                      var7 = oi.a(new String[]{wc.field_c[0][eg.field_y]}, var19, 2);
                      break L0;
                    }
                  } else {
                    L5: {
                      stackIn_16_0 = new StringBuilder().append(var19);

                      if (!b.field_Db) {
                        stackIn_17_0 = (StringBuilder) ((Object) stackIn_16_0);
                        stackIn_17_1 = am.field_b;
                        break L5;
                      } else {
                        stackIn_17_0 = (StringBuilder) ((Object) stackIn_16_0);
                        stackIn_17_1 = ad.field_f;
                        break L5;
                      }
                    }
                    var7 = stackIn_17_1;
                    break L0;
                  }
                } else {
                  L6: {
                    stackIn_11_0 = new StringBuilder().append(var19);

                    if (!gb.field_H.field_g) {
                      stackIn_12_0 = (StringBuilder) ((Object) stackIn_11_0);
                      stackIn_12_1 = fn.field_g;
                      break L6;
                    } else {
                      stackIn_12_0 = (StringBuilder) ((Object) stackIn_11_0);
                      stackIn_12_1 = cc.field_v[bc.field_c];
                      break L6;
                    }
                  }
                  var7 = stackIn_12_1;
                  break L0;
                }
              } else {
                L7: {
                  stackIn_6_0 = new StringBuilder().append(var19);

                  if (gb.field_H.field_g) {
                    stackIn_7_0 = (StringBuilder) ((Object) stackIn_6_0);
                    stackIn_7_1 = ld.field_f;
                    break L7;
                  } else {
                    stackIn_7_0 = (StringBuilder) ((Object) stackIn_6_0);
                    stackIn_7_1 = sd.field_b;
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
              stackIn_52_0 = 8437759;
              break L10;
            } else {
              stackIn_52_0 = 16777215;
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
                    stackIn_57_0 = 12632256;
                    break L12;
                  } else {
                    stackIn_57_0 = 7829367;
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
                stackIn_64_0 = 120 * ag.field_c / 256;
                break L15;
              } else {
                stackIn_64_0 = c.field_a * 120 / 256;
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
        if (this.field_e == 6) {
            if (!(qm.i(20))) {
                return (param1 ^ -1) <= -3 ? ag.field_h[this.field_e] : 310 - -(param1 * 180);
            }
        }
        if (param0 != -94) {
            this.b((byte) -114, -126);
        }
        return ag.field_h[this.field_e];
    }

    private final int c(int param0, int param1) {
        int var3 = 104 / ((param0 - 9) / 63);
        if (this.field_e == 6 && !qm.i(20)) {
            return param1 < 2 ? 150 + 180 * param1 : ag.field_b[this.field_e];
        }
        return ag.field_b[this.field_e];
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
        if ((this.field_e ^ -1) == -7) {
            mm.field_j = null;
        }
        if (param0 != -11308) {
            field_h = (StringBuilder) null;
        }
    }

    static {
        field_d = true;
        field_g = 0;
        field_h = new StringBuilder(80);
        field_b = 0L;
        field_a = new p();
    }
}
