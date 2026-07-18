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
        RuntimeException var2 = null;
        int var3_int = 0;
        vn[] var3 = null;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String[] var9 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var8 = Kickabout.field_G;
        try {
          L0: {
            sk.a(-49, 5, 1);
            var9 = new String[]{"tank", "striker", "specialist", "scout", "keeper"};
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= 5) {
                sk.a(77, 5, 2);
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
                var4 = 0;
                L2: while (true) {
                  if (var4 >= 9) {
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
                        break L0;
                      } else {
                        qd.field_j[var4] = vn.a(param1, "", "characters/" + var9[var4] + "_head_halloween");
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    L4: {
                      if (var4 == 7) {
                        var5 = new int[]{1000, -1000, 45, 532};
                        var6 = var5[0] * t.field_o[0] >> 16;
                        var7 = var5[0] * t.field_f[0] >> 16;
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
                  if (var4 >= 5) {
                    kb.field_B[var3_int] = o.a(107, new vn(new vn[2], 2));
                    var3_int++;
                    continue L1;
                  } else {
                    wj.field_v[var3_int][var4] = vn.a(param1, "", "Characters/" + var9[var3_int] + "_head_0" + (var4 - -1));
                    var4++;
                    continue L5;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var2 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var2;
            stackOut_17_1 = new StringBuilder().append("ap.J(").append(-34).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
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
                  if (wt.field_x < 0) {
                    break L2;
                  } else {
                    if (us.field_j < 0) {
                      break L2;
                    } else {
                      if (wt.field_x >= 640) {
                        break L2;
                      } else {
                        if (us.field_j >= 480) {
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
        return ((ap) this).e(-2) && ((ap) this).field_A;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            try {
                var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                param0.getAppletContext().showDocument(qr.a(param0, var2, 3), "_top");
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
              if (((ap) this).field_o.field_u != 4) {
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
        RuntimeException var16 = null;
        int[] var16_array = null;
        int var17 = 0;
        int[] var19 = null;
        int[] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        Object stackIn_11_0 = null;
        Object stackIn_12_0 = null;
        Object stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        Object stackIn_14_0 = null;
        Object stackIn_15_0 = null;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        Object stackIn_18_0 = null;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        Object stackOut_10_0 = null;
        Object stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        Object stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        Object stackOut_13_0 = null;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_16_0 = null;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        ((ap) this).field_B = -1;
        ((ap) this).field_g = true;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param11) {
                stackOut_3_0 = this;
                stackOut_3_1 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                break L1;
              }
            }
            L2: {
              ((ap) this).field_D = stackIn_4_1 != 0;
              ((ap) this).field_k = param1;
              ((ap) this).field_h = param3;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param0) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L2;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L2;
              }
            }
            L3: {
              ((ap) this).field_t = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!param12) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            L4: {
              ((ap) this).field_y = stackIn_10_1 != 0;
              stackOut_10_0 = this;
              stackIn_12_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if (!param5) {
                stackOut_12_0 = this;
                stackOut_12_1 = 0;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                break L4;
              } else {
                stackOut_11_0 = this;
                stackOut_11_1 = 1;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                break L4;
              }
            }
            L5: {
              ((ap) this).field_q = stackIn_13_1 != 0;
              ((ap) this).field_B = param13;
              stackOut_13_0 = this;
              stackIn_15_0 = stackOut_13_0;
              stackIn_14_0 = stackOut_13_0;
              if (!param10) {
                stackOut_15_0 = this;
                stackOut_15_1 = 0;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L5;
              } else {
                stackOut_14_0 = this;
                stackOut_14_1 = 1;
                stackIn_16_0 = stackOut_14_0;
                stackIn_16_1 = stackOut_14_1;
                break L5;
              }
            }
            L6: {
              ((ap) this).field_A = stackIn_16_1 != 0;
              ((ap) this).field_n = param14;
              bt.field_e = false;
              stackOut_16_0 = this;
              stackIn_18_0 = stackOut_16_0;
              stackIn_17_0 = stackOut_16_0;
              if (!param4) {
                stackOut_18_0 = this;
                stackOut_18_1 = 0;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                break L6;
              } else {
                stackOut_17_0 = this;
                stackOut_17_1 = 1;
                stackIn_19_0 = stackOut_17_0;
                stackIn_19_1 = stackOut_17_1;
                break L6;
              }
            }
            ((ap) this).field_s = stackIn_19_1 != 0;
            var23 = ha.field_F;
            var22 = var23;
            var21 = var22;
            var20 = var21;
            var19 = var20;
            var16_array = var19;
            var17 = 0;
            L7: while (true) {
              if (var17 >= 8) {
                L8: {
                  ((ap) this).field_z = new int[param2.length];
                  ((ap) this).field_o = new nu(param2, param6, param7, param8, param9, ((ap) this).field_A, ((ap) this).field_D, ((ap) this).field_y, ((ap) this).field_s);
                  if (((ap) this).field_t) {
                    ((ap) this).field_i = new nu(((ap) this).field_o);
                    ((ap) this).field_m = new nu(((ap) this).field_o);
                    break L8;
                  } else {
                    ((ap) this).field_o.field_p = true;
                    break L8;
                  }
                }
                hv.a((hu) (Object) rq.field_E, -448);
                nc.a(((ap) this).field_o, (byte) -85, ((ap) this).field_h, ((ap) this).field_t);
                ((ap) this).field_u = false;
                break L0;
              } else {
                var23[var17] = 0;
                var17++;
                continue L7;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var16 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var16;
            stackOut_27_1 = new StringBuilder().append("ap.<init>(").append(param0).append(',');
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          L10: {
            stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param2 == null) {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L10;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L10;
            }
          }
          L11: {
            stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
            stackOut_33_1 = ((StringBuilder) (Object) stackIn_33_1).append(stackIn_33_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',');
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param14 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L11;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L11;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_36_0, stackIn_36_2 + ')');
        }
    }

    private final void h(int param0) {
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
                if (((ap) this).field_o.field_u == 0) {
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
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var4 = Kickabout.field_G;
        try {
          L0: {
            if (param0 == -21573) {
              var3_int = 0;
              L1: while (true) {
                if (((ap) this).field_o.field_I <= var3_int) {
                  break L0;
                } else {
                  ((ap) this).field_z[var3_int] = param1.a((byte) 81);
                  var3_int++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3;
            stackOut_7_1 = new StringBuilder().append("ap.V(").append(param0).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
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
          L0: {
            L1: {
              var6 = null;
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
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            var6_int = -param0 + 1;
            var7 = je.field_g[param4[var6_int]].a(-1) ? 1 : 0;
            L1: {
              var8 = je.field_g[param4[param0]].a(-1) ? 1 : 0;
              if (var7 == 0) {
                stackOut_4_0 = param1[var6_int];
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = param3[var6_int];
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              var9 = stackIn_5_0;
              if (var8 == 0) {
                stackOut_7_0 = param1[param0];
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = param3[param0];
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            L3: {
              var10 = stackIn_8_0;
              if (Math.abs((15 & var10) + -(15 & var9)) > 1) {
                break L3;
              } else {
                if ((var10 & 16) != (16 & var9)) {
                  break L3;
                } else {
                  var11 = var10 ^ 16;
                  if (var8 == 0) {
                    param1[param0] = var11;
                    break L3;
                  } else {
                    param3[param0] = var11;
                    break L3;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("ap.M(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(false).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L5;
            }
          }
          L6: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param4 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L6;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
    }

    final void a(int param0, boolean param1, int param2, js param3) {
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
              if (param2 <= -28) {
                break L1;
              } else {
                ((ap) this).c((byte) 62);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("ap.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    public static void a(boolean param0) {
        field_l = null;
        field_j = null;
        field_x = null;
        field_w = null;
    }

    final void a(int param0, hn param1, byte param2, int param3) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (!((ap) this).d((byte) -68)) {
              return;
            } else {
              L1: {
                ((ol) (Object) ((ap) this).field_r).a(1, param1, param0, param3);
                if (param2 <= -71) {
                  break L1;
                } else {
                  ((ap) this).field_v = true;
                  break L1;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) runtimeException;
            stackOut_6_1 = new StringBuilder().append("ap.EA(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
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
          if (param0 == ~((ap) this).field_o.field_u) {
            break L0;
          } else {
            ru.a(true, (byte) -114);
            ru.a(false, (byte) -114);
            break L0;
          }
        }
        if (!((ap) this).field_u) {
          var3_ref_uo = pb.field_C;
          var4 = 90 + ((hu) (Object) var3_ref_uo).a(bm.field_K) >> 1;
          on.a(320 - var4, 223, var4 - -var4, 34, 6, 65793, 128);
          ((hu) (Object) var3_ref_uo).d(bm.field_K, 320, 246, 16777215, -1);
          return;
        } else {
          L1: {
            ((ap) this).field_r.e(1);
            if ((1 & fa.field_j) == 0) {
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
        if (!(-2 != ((ap) this).field_o.field_u)) {
            ((ap) this).field_r = (hs) (Object) new fk(((ap) this).field_o, ((ap) this).field_h, ((ap) this).field_t);
        }
        if (!(-3 != ((ap) this).field_o.field_u)) {
            ((ap) this).field_r = (hs) (Object) new lr(((ap) this).field_o, ((ap) this).field_h, ((ap) this).field_t);
        }
        if (!(((ap) this).field_o.field_u != 3)) {
            ((ap) this).field_r = (hs) (Object) new bf(((ap) this).field_o, ((ap) this).field_h, ((ap) this).field_t, ((ap) this).field_k);
        }
        if (!(((ap) this).field_o.field_u != 4)) {
            ((ap) this).field_r = (hs) (Object) new va(((ap) this).field_o, ((ap) this).field_h, ((ap) this).field_i, ((ap) this).field_t, ((ap) this).field_s);
        }
        if (!(((ap) this).field_o.field_u != 5)) {
            ((ap) this).field_r = (hs) (Object) new ol(((ap) this).field_o, ((ap) this).field_h, ((ap) this).field_t);
        }
    }

    private final void a(int param0, int param1) {
        if (((ap) this).field_t) {
            or.field_d.b(75, (byte) 112);
            or.field_d.a(118, param1);
        }
    }

    final void a(byte param0, tf param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              if (!(((ap) this).field_r instanceof va)) {
                break L1;
              } else {
                ((va) (Object) ((ap) this).field_r).a(param1, (byte) -82);
                break L1;
              }
            }
            L2: {
              if (param0 < -111) {
                break L2;
              } else {
                ((ap) this).field_n = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ap.B(").append(param0).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
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
        if (((ap) this).field_o.field_u == 3) {
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
                    if (((ap) this).field_o.field_u != 5) {
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
        return 5 + ((ap) this).field_z[((ap) this).field_h] / 20;
    }

    final void a(byte param0, ml param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        ch var6_ref_ch = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var7 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              ((ap) this).field_u = true;
              this.h(9);
              ((ap) this).field_i.a(param1, ((ap) this).field_h, param0 ^ -18);
              ((ap) this).field_m.a(((ap) this).field_i, (byte) 77);
              if (((ap) this).field_i.field_u <= 0) {
                break L1;
              } else {
                L2: {
                  stackOut_2_0 = 1;
                  stackIn_4_0 = stackOut_2_0;
                  stackIn_3_0 = stackOut_2_0;
                  if (((ap) this).e(param0 ^ 17)) {
                    stackOut_4_0 = stackIn_4_0;
                    stackOut_4_1 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    stackIn_5_1 = stackOut_4_1;
                    break L2;
                  } else {
                    stackOut_3_0 = stackIn_3_0;
                    stackOut_3_1 = ((ap) this).field_i.field_g[((ap) this).field_h].field_p;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    break L2;
                  }
                }
                var3_int = stackIn_5_0 + -stackIn_5_1;
                this.a(var3_int, ((ap) this).field_i.field_d, false, ((ap) this).field_i.field_Q, ((ap) this).field_i.field_H);
                break L1;
              }
            }
            L3: {
              ((ap) this).field_o.a(((ap) this).field_i, (byte) 122);
              this.d(-2);
              if (param0 == -17) {
                break L3;
              } else {
                ((ap) this).field_n = null;
                break L3;
              }
            }
            L4: {
              if (((ap) this).field_o.field_u <= 0) {
                break L4;
              } else {
                if (((ap) this).field_o.field_u >= 5) {
                  break L4;
                } else {
                  L5: {
                    if (rm.field_C != ((ap) this).field_o.field_m) {
                      break L5;
                    } else {
                      if (ih.field_c != ((ap) this).field_o.field_t) {
                        break L5;
                      } else {
                        if (!vi.field_n) {
                          break L5;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  sb.a(true, (byte) -125, ((ap) this).field_o.field_m, ((ap) this).field_o.field_t);
                  break L4;
                }
              }
            }
            L6: {
              if (5 == ((ap) this).field_o.field_u) {
                if (param1.h((byte) -113) == 1) {
                  ((ol) (Object) ((ap) this).field_r).field_u = new int[2];
                  ((ol) (Object) ((ap) this).field_r).field_u[0] = param1.h((byte) -113);
                  ((ol) (Object) ((ap) this).field_r).field_u[1] = param1.h((byte) -116);
                  var3_int = param1.h((byte) -125);
                  ((ol) (Object) ((ap) this).field_r).field_k = new int[var3_int];
                  var4 = 0;
                  L7: while (true) {
                    if (var3_int <= var4) {
                      ((ol) (Object) ((ap) this).field_r).field_bb.b(22997);
                      ((ol) (Object) ((ap) this).field_r).field_q.b(22997);
                      var4 = param1.a((byte) 81);
                      var5 = 0;
                      L8: while (true) {
                        if (var4 <= var5) {
                          var3_int = param1.h((byte) -120);
                          ((ol) (Object) ((ap) this).field_r).field_p = new int[var3_int][4];
                          ((ol) (Object) ((ap) this).field_r).field_ab = new int[var3_int][4];
                          var5 = 0;
                          L9: while (true) {
                            if (var3_int <= var5) {
                              var5 = 0;
                              L10: while (true) {
                                if (var5 >= var3_int) {
                                  break L6;
                                } else {
                                  var6 = 0;
                                  L11: while (true) {
                                    if (var6 >= 4) {
                                      var5++;
                                      continue L10;
                                    } else {
                                      ((ol) (Object) ((ap) this).field_r).field_ab[var5][var6] = param1.i(-98);
                                      var6++;
                                      continue L11;
                                    }
                                  }
                                }
                              }
                            } else {
                              var6 = 0;
                              L12: while (true) {
                                if (var6 >= 4) {
                                  var5++;
                                  continue L9;
                                } else {
                                  ((ol) (Object) ((ap) this).field_r).field_p[var5][var6] = param1.i(-95);
                                  var6++;
                                  continue L12;
                                }
                              }
                            }
                          }
                        } else {
                          L13: {
                            var6_ref_ch = new ch();
                            var6_ref_ch.a((iw) (Object) param1, (byte) -79);
                            if (0 != var6_ref_ch.field_f) {
                              ((ol) (Object) ((ap) this).field_r).field_q.a((gn) (Object) var6_ref_ch, 3);
                              break L13;
                            } else {
                              ((ol) (Object) ((ap) this).field_r).field_bb.a((gn) (Object) var6_ref_ch, 3);
                              break L13;
                            }
                          }
                          var5++;
                          continue L8;
                        }
                      }
                    } else {
                      ((ol) (Object) ((ap) this).field_r).field_k[var4] = param1.h((byte) -109);
                      var4++;
                      continue L7;
                    }
                  }
                } else {
                  break L6;
                }
              } else {
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var3 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var3;
            stackOut_41_1 = new StringBuilder().append("ap.AA(").append(param0).append(',');
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param1 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L14;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L14;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + ')');
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
