/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ap extends js {
    private gr field_n;
    int field_h;
    boolean field_A;
    nu field_o;
    private boolean field_D;
    boolean field_v;
    private int field_E;
    private boolean field_y;
    int[] field_z;
    private hs field_r;
    nu field_i;
    private up[] field_k;
    nu field_m;
    boolean field_g;
    boolean field_q;
    int field_B;
    static kj field_w;
    boolean field_s;
    boolean field_t;
    private boolean field_u;
    static tf field_j;
    static ah field_p;
    static String field_x;
    static ut field_l;

    final void f(int param0) {
        if (!(((ap) this).field_t)) {
            throw new IllegalStateException();
        }
        if (!((ap) this).e(-2)) {
            if (!(((ap) this).field_o.field_R[((ap) this).field_h].field_s)) {
                this.a(-16046, 2);
            }
        }
        int var2 = 63 / ((33 - param0) / 49);
    }

    final boolean d(byte param0) {
        int var2 = -114 % ((19 - param0) / 39);
        return ((ap) this).field_r instanceof ol;
    }

    final static void a(byte param0, sj param1) {
        int var3_int = 0;
        vn[] var3 = null;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String[] var9 = null;
        var8 = Kickabout.field_G;
        sk.a(param0 + -15, 5, 1);
        var9 = new String[]{"tank", "striker", "specialist", "scout", "keeper"};
        var3_int = 0;
        L0: while (true) {
          if (var3_int >= 5) {
            L1: {
              sk.a(param0 + 111, 5, 2);
              var3 = new vn[9];
              var3[0] = vn.a(param1, "", "balls/skin_football");
              var3[1] = vn.a(param1, "", "balls/skin_beachball");
              var3[2] = vn.a(param1, "", "balls/skin_basketball");
              var3[3] = vn.a(param1, "", "balls/skin_atom");
              var3[4] = vn.a(param1, "", "balls/skin_tennisball");
              var3[5] = vn.a(param1, "", "balls/sphere");
              var3[8] = vn.a(param1, "", "balls/sphere_halloween");
              var3[6] = vn.a(param1, "", "balls/planet2");
              var3[7] = vn.a(param1, "", "balls/asteroid_craters_3");
              sk.a(-104, 5, 3);
              if (param0 == -34) {
                break L1;
              } else {
                ap.a(true);
                break L1;
              }
            }
            var4 = 0;
            L2: while (true) {
              if ((var4 ^ -1) <= -10) {
                sk.a(72, 5, 4);
                gw.field_f[0] = vn.a(param1, "", "fans/fan_01");
                gw.field_f[1] = vn.a(param1, "", "fans/fan_02");
                gw.field_f[2] = vn.a(param1, "", "fans/fan_03");
                gw.field_f[3] = vn.a(param1, "", "fans/fan_04");
                gw.field_f[4] = vn.a(param1, "", "fans/fan_05");
                of.field_f = vn.a(param1, "", "characters/torso");
                es.field_k = vn.a(param1, "", "characters/keeper_body_halloween");
                qd.field_j = new vn[5];
                var4 = 0;
                L3: while (true) {
                  if (5 <= var4) {
                    return;
                  } else {
                    qd.field_j[var4] = vn.a(param1, "", "characters/" + var9[var4] + "_head_halloween");
                    var4++;
                    continue L3;
                  }
                }
              } else {
                L4: {
                  if (-8 == (var4 ^ -1)) {
                    var5 = new int[]{1000, -1000, 45, 532};
                    var6 = var5[0] * t.field_o[0] >> -1279450992;
                    var7 = var5[0] * t.field_f[0] >> -1773267952;
                    qo.field_l[var4] = var3[var4].b(var5[2], var5[3], var6, var5[1], var7);
                    break L4;
                  } else {
                    qo.field_l[var4] = (eg) (Object) var3[var4].a(110, 131072, 1, 1, 1);
                    break L4;
                  }
                }
                var4++;
                continue L2;
              }
            }
          } else {
            iw.field_m[var3_int] = vn.a(param1, "", "Characters/" + var9[var3_int] + "_body");
            var4 = 0;
            L5: while (true) {
              if ((var4 ^ -1) <= -6) {
                kb.field_B[var3_int] = o.a(107, new vn(new vn[2], 2));
                var3_int++;
                continue L0;
              } else {
                wj.field_v[var3_int][var4] = vn.a(param1, "", "Characters/" + var9[var3_int] + "_head_0" + (var4 - -1));
                var4++;
                continue L5;
              }
            }
          }
        }
    }

    final boolean f(byte param0) {
        int stackIn_16_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_15_0 = 0;
        if (((ap) this).field_o.field_u != 4) {
          return false;
        } else {
          L0: {
            if (param0 == 29) {
              break L0;
            } else {
              boolean discarded$2 = ((ap) this).f((byte) -25);
              break L0;
            }
          }
          L1: {
            L2: {
              if (((ap) this).e(-2)) {
                break L2;
              } else {
                if (!((ap) this).field_o.field_R[((ap) this).field_h].d(3511)) {
                  break L2;
                } else {
                  if (-1 < (wt.field_x ^ -1)) {
                    break L2;
                  } else {
                    if (us.field_j < 0) {
                      break L2;
                    } else {
                      if (-641 >= (wt.field_x ^ -1)) {
                        break L2;
                      } else {
                        if ((us.field_j ^ -1) <= -481) {
                          break L2;
                        } else {
                          L3: {
                            if (((va) (Object) ((ap) this).field_r).b((byte) -82)) {
                              break L3;
                            } else {
                              if (kl.b(640)) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                          stackOut_14_0 = 1;
                          stackIn_16_0 = stackOut_14_0;
                          break L1;
                        }
                      }
                    }
                  }
                }
              }
            }
            stackOut_15_0 = 0;
            stackIn_16_0 = stackOut_15_0;
            break L1;
          }
          return stackIn_16_0 != 0;
        }
    }

    private final boolean b(byte param0) {
        Object var3 = null;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -73) {
            break L0;
          } else {
            var3 = null;
            ((ap) this).a(9, true, -127, (js) null);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!((ap) this).e(-2)) {
              break L2;
            } else {
              if (!((ap) this).field_A) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            if (param1 != 0) {
                field_w = null;
            }
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                param0.getAppletContext().showDocument(qr.a(param0, var2, param1 ^ 3), "_top");
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        L0: {
          var6 = Kickabout.field_G;
          var3 = -26 % ((38 - param0) / 60);
          if (param1) {
            break L0;
          } else {
            if (((ap) this).field_t) {
              break L0;
            } else {
              return;
            }
          }
        }
        if (!wh.field_q) {
          if (!((ap) this).field_u) {
            return;
          } else {
            L1: {
              if ((((ap) this).field_o.field_u ^ -1) != -5) {
                break L1;
              } else {
                ((va) (Object) ((ap) this).field_r).g(0);
                break L1;
              }
            }
            L2: {
              ((ap) this).field_o.a((byte) -87);
              ((ap) this).field_o.field_E.b(22997);
              ((ap) this).field_o.d(4);
              if (((ap) this).field_t) {
                ((ap) this).field_i.d(4);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              ie.g(-128);
              re.b(101);
              ((ap) this).field_r.a(true);
              ((ap) this).field_r.a(-117, param1);
              if (!((ap) this).field_t) {
                break L3;
              } else {
                if (pq.field_K) {
                  break L3;
                } else {
                  L4: {
                    if (((ap) this).e(-2)) {
                      stackOut_17_0 = 0;
                      stackIn_18_0 = stackOut_17_0;
                      break L4;
                    } else {
                      stackOut_16_0 = this.g(64);
                      stackIn_18_0 = stackOut_16_0;
                      break L4;
                    }
                  }
                  var4 = stackIn_18_0;
                  var5 = 0;
                  L5: while (true) {
                    if (var5 >= ((ap) this).field_o.field_I) {
                      ((ap) this).field_o.a(((ap) this).field_i, ((ap) this).field_h, var4, -6);
                      break L3;
                    } else {
                      this.a(var4, 20700, var5);
                      var5++;
                      continue L5;
                    }
                  }
                }
              }
            }
            L6: {
              ve.q(-28033);
              if (((ap) this).field_E > 0) {
                ((ap) this).field_E = ((ap) this).field_E - 16;
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (!((ap) this).field_t) {
                if (2 != ((ap) this).field_o.field_u) {
                  if (-4 == ((ap) this).field_o.field_u) {
                    if (!((ap) this).field_o.field_o.a(-127, 0)) {
                      break L7;
                    } else {
                      ((ap) this).b(26415, 4);
                      break L7;
                    }
                  } else {
                    if (-4 != ((ap) this).field_o.field_u) {
                      break L7;
                    } else {
                      if (!((ap) this).field_o.field_o.a(-127, 0)) {
                        break L7;
                      } else {
                        ((ap) this).b(26415, 4);
                        break L7;
                      }
                    }
                  }
                } else {
                  if (-4 == ((ap) this).field_o.field_u) {
                    if (!((ap) this).field_o.field_o.a(-127, 0)) {
                      break L7;
                    } else {
                      ((ap) this).b(26415, 4);
                      break L7;
                    }
                  } else {
                    if (-4 != ((ap) this).field_o.field_u) {
                      break L7;
                    } else {
                      if (!((ap) this).field_o.field_o.a(-127, 0)) {
                        break L7;
                      } else {
                        ((ap) this).b(26415, 4);
                        break L7;
                      }
                    }
                  }
                }
              } else {
                break L7;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    ap(boolean param0, up[] param1, String[] param2, int param3, boolean param4, boolean param5, int param6, int param7, boolean param8, boolean param9, boolean param10, boolean param11, boolean param12, int param13, gr param14) {
        super(-1);
        int[] var16 = null;
        int var17 = 0;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        Object stackIn_13_0 = null;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        Object stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        Object stackOut_9_0 = null;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        Object stackOut_12_0 = null;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        Object stackOut_15_0 = null;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        L0: {
          ((ap) this).field_B = -1;
          ((ap) this).field_g = true;
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param11) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((ap) this).field_D = stackIn_3_1 != 0;
          ((ap) this).field_k = param1;
          ((ap) this).field_h = param3;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param0) {
            stackOut_5_0 = this;
            stackOut_5_1 = 0;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            break L1;
          } else {
            stackOut_4_0 = this;
            stackOut_4_1 = 1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            break L1;
          }
        }
        L2: {
          ((ap) this).field_t = stackIn_6_1 != 0;
          stackOut_6_0 = this;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (!param12) {
            stackOut_8_0 = this;
            stackOut_8_1 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            break L2;
          } else {
            stackOut_7_0 = this;
            stackOut_7_1 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            break L2;
          }
        }
        L3: {
          ((ap) this).field_y = stackIn_9_1 != 0;
          stackOut_9_0 = this;
          stackIn_11_0 = stackOut_9_0;
          stackIn_10_0 = stackOut_9_0;
          if (!param5) {
            stackOut_11_0 = this;
            stackOut_11_1 = 0;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            break L3;
          } else {
            stackOut_10_0 = this;
            stackOut_10_1 = 1;
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            break L3;
          }
        }
        L4: {
          ((ap) this).field_q = stackIn_12_1 != 0;
          ((ap) this).field_B = param13;
          stackOut_12_0 = this;
          stackIn_14_0 = stackOut_12_0;
          stackIn_13_0 = stackOut_12_0;
          if (!param10) {
            stackOut_14_0 = this;
            stackOut_14_1 = 0;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            break L4;
          } else {
            stackOut_13_0 = this;
            stackOut_13_1 = 1;
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            break L4;
          }
        }
        L5: {
          ((ap) this).field_A = stackIn_15_1 != 0;
          ((ap) this).field_n = param14;
          bt.field_e = false;
          stackOut_15_0 = this;
          stackIn_17_0 = stackOut_15_0;
          stackIn_16_0 = stackOut_15_0;
          if (!param4) {
            stackOut_17_0 = this;
            stackOut_17_1 = 0;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            break L5;
          } else {
            stackOut_16_0 = this;
            stackOut_16_1 = 1;
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            break L5;
          }
        }
        ((ap) this).field_s = stackIn_18_1 != 0;
        var23 = ha.field_F;
        var22 = var23;
        var21 = var22;
        var20 = var21;
        var19 = var20;
        var16 = var19;
        var17 = 0;
        L6: while (true) {
          if (-9 >= (var17 ^ -1)) {
            L7: {
              ((ap) this).field_z = new int[param2.length];
              ((ap) this).field_o = new nu(param2, param6, param7, param8, param9, ((ap) this).field_A, ((ap) this).field_D, ((ap) this).field_y, ((ap) this).field_s);
              if (((ap) this).field_t) {
                ((ap) this).field_i = new nu(((ap) this).field_o);
                ((ap) this).field_m = new nu(((ap) this).field_o);
                break L7;
              } else {
                ((ap) this).field_o.field_p = true;
                break L7;
              }
            }
            hv.a((hu) (Object) rq.field_E, -448);
            nc.a(((ap) this).field_o, (byte) -85, ((ap) this).field_h, ((ap) this).field_t);
            ((ap) this).field_u = false;
            return;
          } else {
            var23[var17] = 0;
            var17++;
            continue L6;
          }
        }
    }

    private final void h(int param0) {
        if (param0 != 9) {
            ((ap) this).a(true, 17);
        }
        if (!(null == ((ap) this).field_r)) {
            iw.a(-44, rk.field_h);
            hr.a((byte) -48);
            ((ap) this).a(-5, false);
            ta.e(122);
            ((ap) this).field_E = 256;
        }
    }

    final void a(boolean param0, int param1) {
        if (param1 != 18) {
            ((ap) this).c(27);
        }
        ji.k(0);
        if (((ap) this).e(param1 ^ -20)) {
            return;
        }
        if (!((ap) this).field_t) {
            ng.a(0, 115);
            jm.a(18, param0, -2);
        }
    }

    final void c(byte param0) {
        if (param0 == 80) {
          if (!((ap) this).field_u) {
            return;
          } else {
            L0: {
              if (!((ap) this).field_t) {
                break L0;
              } else {
                if (-1 == (((ap) this).field_o.field_u ^ -1)) {
                  break L0;
                } else {
                  ((ap) this).field_r.a(150, param0 ^ 17789);
                  return;
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final tf e(byte param0) {
        int var2 = -22 % ((param0 - -66) / 57);
        if (!((ap) this).d((byte) -59)) {
            return null;
        }
        return ((ol) (Object) ((ap) this).field_r).h(-19510);
    }

    final void a(int param0, ml param1) {
        int var3 = 0;
        int var4 = Kickabout.field_G;
        if (param0 != -21573) {
            return;
        }
        for (var3 = 0; ((ap) this).field_o.field_I > var3; var3++) {
            ((ap) this).field_z[var3] = param1.a((byte) 81);
        }
    }

    private final void a(int param0, int param1, int param2) {
        gt var5 = null;
        Object var6 = null;
        gt var7 = null;
        var7 = ((ap) this).field_o.field_R[param2];
        var5 = ((ap) this).field_i.field_R[param2];
        if (var7.a(-93, (mo) (Object) var5, param0, ((ap) this).field_h)) {
          return;
        } else {
          var6 = null;
          if (param1 == 20700) {
            L0: {
              L1: {
                if (var7.field_v) {
                  break L1;
                } else {
                  if (var5.field_v) {
                    L2: {
                      if (var7.field_s) {
                        break L2;
                      } else {
                        if (var5.field_s) {
                          var6 = (Object) (Object) r.field_e;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var6 = (Object) (Object) mr.field_F;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                if (var7.field_s) {
                  break L3;
                } else {
                  if (var5.field_s) {
                    var6 = (Object) (Object) nn.field_L;
                    break L0;
                  } else {
                    break L3;
                  }
                }
              }
              if (var7.field_q) {
                break L0;
              } else {
                if (var5.field_q) {
                  var6 = (Object) (Object) wc.field_q;
                  break L0;
                } else {
                  break L0;
                }
              }
            }
            L4: {
              if (var6 == null) {
                break L4;
              } else {
                gv discarded$1 = gm.a(vo.a((byte) -18, (String) var6, new String[1]), false, (byte) -108);
                break L4;
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    final boolean b(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == -21660) {
            break L0;
          } else {
            ((ap) this).field_q = true;
            break L0;
          }
        }
        L1: {
          L2: {
            if (!this.b((byte) -73)) {
              break L2;
            } else {
              if (!((ap) this).field_v) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    private final void a(int param0, int[] param1, boolean param2, int[] param3, int[] param4) {
        int var11 = 0;
        int var6 = -param0 + 1;
        int var7 = je.field_g[param4[var6]].a(-1) ? 1 : 0;
        if (param2) {
            return;
        }
        int var8 = je.field_g[param4[param0]].a(-1) ? 1 : 0;
        int var9 = var7 != 0 ? param3[var6] : param1[var6];
        int var10 = var8 != 0 ? param3[param0] : param1[param0];
        if ((Math.abs((15 & var10) + -(15 & var9)) ^ -1) >= -2) {
            if ((var10 & 16) == (16 & var9)) {
                var11 = var10 ^ 16;
                if (var8 != 0) {
                    param3[param0] = var11;
                } else {
                    param1[param0] = var11;
                }
            }
        }
    }

    final void a(int param0, boolean param1, int param2, js param3) {
        if (param2 > -28) {
            ((ap) this).c((byte) 62);
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            Object var2 = null;
            ap.a((byte) 13, (sj) null);
        }
        field_l = null;
        field_j = null;
        field_x = null;
        field_w = null;
    }

    final void a(int param0, hn param1, byte param2, int param3) {
        if (!(((ap) this).d((byte) -68))) {
            return;
        }
        ((ol) (Object) ((ap) this).field_r).a(1, param1, param0, param3);
        if (param2 > -71) {
            ((ap) this).field_v = true;
        }
    }

    final void a(int param0, boolean param1) {
        uo var3_ref_uo = null;
        la[] var3_ref_la__ = null;
        int var3 = 0;
        int var4 = 0;
        la var5 = null;
        int var6 = 0;
        la[] var7 = null;
        la[] var8 = null;
        int stackIn_24_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        L0: {
          var6 = Kickabout.field_G;
          if (param0 == (((ap) this).field_o.field_u ^ -1)) {
            break L0;
          } else {
            ru.a(true, (byte) -114);
            ru.a(false, (byte) -114);
            break L0;
          }
        }
        if (!((ap) this).field_u) {
          var3_ref_uo = pb.field_C;
          var4 = 90 + ((hu) (Object) var3_ref_uo).a(bm.field_K) >> -162130559;
          on.a(320 - var4, 223, var4 - -var4, 34, 6, 65793, 128);
          ((hu) (Object) var3_ref_uo).d(bm.field_K, 320, 246, 16777215, -1);
          return;
        } else {
          L1: {
            ((ap) this).field_r.e(1);
            if (-1 == (1 & fa.field_j ^ -1)) {
              break L1;
            } else {
              var7 = ((ap) this).field_o.field_B;
              var3_ref_la__ = var7;
              var4 = 0;
              L2: while (true) {
                if (var7.length <= var4) {
                  break L1;
                } else {
                  var5 = var7[var4];
                  var5.a(-2943, 16777215);
                  var4++;
                  continue L2;
                }
              }
            }
          }
          L3: {
            if ((fa.field_j & 2) != 0) {
              var8 = ((ap) this).field_o.field_x;
              var3_ref_la__ = var8;
              var4 = 0;
              L4: while (true) {
                if (var4 >= var8.length) {
                  break L3;
                } else {
                  var5 = var8[var4];
                  var5.a(-2943, 16711680);
                  var4++;
                  continue L4;
                }
              }
            } else {
              break L3;
            }
          }
          L5: {
            us.g((byte) -121);
            if (0 < ((ap) this).field_E) {
              rk.field_h.b(0, 0, ((ap) this).field_E);
              break L5;
            } else {
              break L5;
            }
          }
          L6: {
            if (ja.field_O) {
              break L6;
            } else {
              L7: {
                if (((ap) this).field_r instanceof va) {
                  if (((va) (Object) ((ap) this).field_r).field_l) {
                    stackOut_22_0 = 1;
                    stackIn_24_0 = stackOut_22_0;
                    break L7;
                  } else {
                    stackOut_21_0 = 0;
                    stackIn_24_0 = stackOut_21_0;
                    break L7;
                  }
                } else {
                  stackOut_19_0 = 0;
                  stackIn_24_0 = stackOut_19_0;
                  break L7;
                }
              }
              var3 = stackIn_24_0;
              ql.a((byte) 96, var3 != 0, ((ap) this).field_z);
              break L6;
            }
          }
          mf.b(-109);
          return;
        }
    }

    private final void d(int param0) {
        if (!(0 != ((ap) this).field_o.field_u)) {
            ((ap) this).field_r = (hs) (Object) new wb(((ap) this).field_o, ((ap) this).field_h, ((ap) this).field_t);
        }
        if (!(param0 != ((ap) this).field_o.field_u)) {
            ((ap) this).field_r = (hs) (Object) new fk(((ap) this).field_o, ((ap) this).field_h, ((ap) this).field_t);
        }
        if (!(-3 != ((ap) this).field_o.field_u)) {
            ((ap) this).field_r = (hs) (Object) new lr(((ap) this).field_o, ((ap) this).field_h, ((ap) this).field_t);
        }
        if (!((((ap) this).field_o.field_u ^ -1) != -4)) {
            ((ap) this).field_r = (hs) (Object) new bf(((ap) this).field_o, ((ap) this).field_h, ((ap) this).field_t, ((ap) this).field_k);
        }
        if (!((((ap) this).field_o.field_u ^ -1) != -5)) {
            ((ap) this).field_r = (hs) (Object) new va(((ap) this).field_o, ((ap) this).field_h, ((ap) this).field_i, ((ap) this).field_t, ((ap) this).field_s);
        }
        if (!(((ap) this).field_o.field_u != 5)) {
            ((ap) this).field_r = (hs) (Object) new ol(((ap) this).field_o, ((ap) this).field_h, ((ap) this).field_t);
        }
    }

    private final void a(int param0, int param1) {
        if (param0 != -16046) {
            field_x = null;
        }
        if (((ap) this).field_t) {
            or.field_d.b(75, (byte) 112);
            or.field_d.a(118, param1);
        }
    }

    final void a(byte param0, tf param1) {
        if (((ap) this).field_r instanceof va) {
            ((va) (Object) ((ap) this).field_r).a(param1, (byte) -82);
        }
        if (param0 >= -111) {
            ((ap) this).field_n = null;
        }
    }

    final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = Kickabout.field_G;
        if (param0 != 26415) {
            ((ap) this).a(false, -22);
        }
        ((ap) this).field_u = true;
        this.h(9);
        ((ap) this).field_o.a(param1, (byte) -81);
        this.d(-2);
        ((ap) this).field_o.field_v = -1;
        if (!(2 != ((ap) this).field_o.field_u)) {
            ((ap) this).field_o.a(mf.a(2, 1, (byte) 0), -127);
        }
        if (-4 == (((ap) this).field_o.field_u ^ -1)) {
            for (var3 = 0; 4 > var3; var3++) {
                ((ap) this).field_o.field_i[1][var3] = 1;
            }
            for (var3 = 0; 4 > var3; var3++) {
                ((ap) this).field_o.field_o.a(((ap) this).field_n, ((ap) this).field_k, (byte) -85, var3, 1);
            }
        }
    }

    final boolean a(int param0, int param1, char param2) {
        int var4 = 0;
        if (!(13 != param0)) {
            var4 = 1;
            if (!(!((ap) this).field_t)) {
                var4 = 2;
                if (((ap) this).field_A) {
                    var4 = 3;
                }
                if (!((ap) this).e(-2)) {
                    if (-6 != (((ap) this).field_o.field_u ^ -1)) {
                        if (((ap) this).field_o.field_R[((ap) this).field_h].d(3511)) {
                            jm.a(var4, false, -2);
                            return true;
                        }
                    }
                }
                var4 = 5;
                if (!(!((ap) this).field_A)) {
                    var4 = 6;
                }
            }
            jm.a(var4, false, -2);
            return true;
        }
        if (param0 == il.field_h) {
            bt.field_e = !bt.field_e ? true : false;
        }
        if (param1 > -5) {
            return false;
        }
        if (param0 == tt.field_b) {
            vl.field_d = !vl.field_d ? true : false;
        }
        if (!((ap) this).field_u) {
            return false;
        }
        return ((ap) this).field_r.a(param2, 1670, param0);
    }

    final void a(int param0) {
        if (!(!(((ap) this).field_r instanceof va))) {
            ((va) (Object) ((ap) this).field_r).m(-105);
        }
        int var2 = 109 / ((param0 - 6) / 37);
    }

    private final int g(int param0) {
        if (param0 < 16) {
            field_l = null;
        }
        return 5 + ((ap) this).field_z[((ap) this).field_h] / 20;
    }

    final void a(byte param0, ml param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ch var6_ref_ch = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_2_0 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        L0: {
          var7 = Kickabout.field_G;
          ((ap) this).field_u = true;
          this.h(9);
          ((ap) this).field_i.a(param1, ((ap) this).field_h, param0 ^ -18);
          ((ap) this).field_m.a(((ap) this).field_i, (byte) 77);
          if (((ap) this).field_i.field_u <= 0) {
            break L0;
          } else {
            L1: {
              stackOut_1_0 = 1;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (((ap) this).e(param0 ^ 17)) {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = stackIn_2_0;
                stackOut_2_1 = ((ap) this).field_i.field_g[((ap) this).field_h].field_p;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            var3 = stackIn_4_0 + -stackIn_4_1;
            this.a(var3, ((ap) this).field_i.field_d, false, ((ap) this).field_i.field_Q, ((ap) this).field_i.field_H);
            break L0;
          }
        }
        L2: {
          ((ap) this).field_o.a(((ap) this).field_i, (byte) 122);
          this.d(-2);
          if (param0 == -17) {
            break L2;
          } else {
            ((ap) this).field_n = null;
            break L2;
          }
        }
        L3: {
          if (((ap) this).field_o.field_u <= 0) {
            break L3;
          } else {
            if (((ap) this).field_o.field_u >= 5) {
              break L3;
            } else {
              L4: {
                if (rm.field_C != ((ap) this).field_o.field_m) {
                  break L4;
                } else {
                  if (ih.field_c != ((ap) this).field_o.field_t) {
                    break L4;
                  } else {
                    if (!vi.field_n) {
                      break L4;
                    } else {
                      break L3;
                    }
                  }
                }
              }
              sb.a(true, (byte) -125, ((ap) this).field_o.field_m, ((ap) this).field_o.field_t);
              break L3;
            }
          }
        }
        L5: {
          if (5 == ((ap) this).field_o.field_u) {
            if (-2 == (param1.h((byte) -113) ^ -1)) {
              ((ol) (Object) ((ap) this).field_r).field_u = new int[2];
              ((ol) (Object) ((ap) this).field_r).field_u[0] = param1.h((byte) -113);
              ((ol) (Object) ((ap) this).field_r).field_u[1] = param1.h((byte) -116);
              var3 = param1.h((byte) -125);
              ((ol) (Object) ((ap) this).field_r).field_k = new int[var3];
              var4 = 0;
              L6: while (true) {
                if (var3 <= var4) {
                  ((ol) (Object) ((ap) this).field_r).field_bb.b(22997);
                  ((ol) (Object) ((ap) this).field_r).field_q.b(22997);
                  var4 = param1.a((byte) 81);
                  var5 = 0;
                  L7: while (true) {
                    if (var4 <= var5) {
                      var3 = param1.h((byte) -120);
                      ((ol) (Object) ((ap) this).field_r).field_p = new int[var3][4];
                      ((ol) (Object) ((ap) this).field_r).field_ab = new int[var3][4];
                      var5 = 0;
                      L8: while (true) {
                        if (var3 <= var5) {
                          var5 = 0;
                          L9: while (true) {
                            if (var5 >= var3) {
                              break L5;
                            } else {
                              var6 = 0;
                              L10: while (true) {
                                if (-5 >= (var6 ^ -1)) {
                                  var5++;
                                  continue L9;
                                } else {
                                  ((ol) (Object) ((ap) this).field_r).field_ab[var5][var6] = param1.i(-98);
                                  var6++;
                                  continue L10;
                                }
                              }
                            }
                          }
                        } else {
                          var6 = 0;
                          L11: while (true) {
                            if (var6 >= 4) {
                              var5++;
                              continue L8;
                            } else {
                              ((ol) (Object) ((ap) this).field_r).field_p[var5][var6] = param1.i(-95);
                              var6++;
                              continue L11;
                            }
                          }
                        }
                      }
                    } else {
                      var6_ref_ch = new ch();
                      var6_ref_ch.a((iw) (Object) param1, (byte) -79);
                      if (0 != var6_ref_ch.field_f) {
                        ((ol) (Object) ((ap) this).field_r).field_q.a((gn) (Object) var6_ref_ch, 3);
                        var5++;
                        continue L7;
                      } else {
                        ((ol) (Object) ((ap) this).field_r).field_bb.a((gn) (Object) var6_ref_ch, 3);
                        var5++;
                        continue L7;
                      }
                    }
                  }
                } else {
                  ((ol) (Object) ((ap) this).field_r).field_k[var4] = param1.h((byte) -109);
                  var4++;
                  continue L6;
                }
              }
            } else {
              break L5;
            }
          } else {
            break L5;
          }
        }
    }

    final boolean e(int param0) {
        if (param0 != -2) {
            ((ap) this).field_i = null;
        }
        return ((ap) this).field_h == -2 ? true : false;
    }

    final void c(int param0) {
        if (param0 > -10) {
            Object var3 = null;
            ((ap) this).a((byte) -89, (tf) null);
        }
        if (!(((ap) this).field_t)) {
            throw new IllegalStateException();
        }
        if (!((ap) this).e(-2)) {
            if (!((ap) this).field_o.field_R[((ap) this).field_h].field_s) {
                this.a(-16046, 1);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new kj(2);
        field_j = new tf();
        field_p = null;
        field_x = "OK";
    }
}
