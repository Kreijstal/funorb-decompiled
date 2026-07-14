/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa extends pj implements kd, ke {
    private hf field_P;
    static int field_N;
    private hf field_S;
    private kl field_L;
    private String field_J;
    static int[] field_Q;
    static int field_R;
    static he[] field_O;
    private boolean field_U;
    private hf field_K;
    private boolean field_V;
    private boolean field_T;
    private kl field_M;

    public final void a(kl param0, byte param1) {
        if (param1 != 83) {
          return;
        } else {
          L0: {
            if (param0 == ((wa) this).field_L) {
              boolean discarded$2 = ((wa) this).field_M.a(false, (vg) this);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (param0 != ((wa) this).field_M) {
              break L1;
            } else {
              this.g((byte) -121);
              break L1;
            }
          }
          return;
        }
    }

    public static void j(int param0) {
        field_Q = null;
        if (param0 != -11179) {
            int discarded$0 = wa.a((byte) 75, false);
        }
        field_O = null;
    }

    private final void g(byte param0) {
        if (!na.b(-1)) {
            // if_icmpge L58
            // ifgt L37
        } else {
            pc.a(param0 ^ 32, ((wa) this).field_L.field_p, ((wa) this).field_M.field_p);
        }
        if (param0 != -121) {
            this.g((byte) -63);
        }
    }

    final void i(int param0) {
        if (param0 != 134) {
            ((wa) this).field_P = null;
        }
        ((wa) this).field_L.h((byte) 88);
        ((wa) this).field_M.h((byte) 88);
    }

    public final void a(boolean param0, kl param1) {
        if (!param0) {
            field_O = null;
        }
    }

    final String b(boolean param0) {
        if (param0) {
            this.g((byte) 79);
        }
        if (!(null != ((wa) this).field_L.field_p)) {
            return "";
        }
        return ((wa) this).field_L.field_p;
    }

    final static void a(String param0, boolean param1, java.applet.Applet param2, byte param3) {
        try {
            if (param3 != 9) {
                wa.a((byte) 5);
            }
            if (bl.field_r.startsWith("win")) {
                if (!(!og.a(param0, 0))) {
                    return;
                }
            }
            try {
                param2.getAppletContext().showDocument(new java.net.URL(param0), "_blank");
            } catch (java.net.MalformedURLException malformedURLException) {
                gb.a((Throwable) null, "MGR1: " + param0, 10);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (null != ((wa) this).field_J) {
            int discarded$0 = uh.field_i.a(((wa) this).field_J, 20 + (param0 + ((wa) this).field_o), ((wa) this).field_m + (param3 + 15), ((wa) this).field_w + -40, ((wa) this).field_k, 16777215, -1, 1, 0, uh.field_i.field_x);
        }
        if (!(null == ((wa) this).field_K)) {
            wj.g(10 + param0, param3 + 134, -20 + ((wa) this).field_w, 4210752);
        }
        super.a(param0, param1, param2, param3);
    }

    wa(String param0, String param1, boolean param2, boolean param3, boolean param4) {
        super(0, 0, 310, 190, (cg) null);
        ie var6 = null;
        rf var7 = null;
        String var8 = null;
        sd var9 = null;
        dh var12 = null;
        dh var13 = null;
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
        Object stackIn_16_0 = null;
        hf stackIn_16_1 = null;
        hf stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        hf stackIn_17_1 = null;
        hf stackIn_17_2 = null;
        Object stackIn_18_0 = null;
        hf stackIn_18_1 = null;
        hf stackIn_18_2 = null;
        String stackIn_18_3 = null;
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
        Object stackOut_15_0 = null;
        hf stackOut_15_1 = null;
        hf stackOut_15_2 = null;
        Object stackOut_17_0 = null;
        hf stackOut_17_1 = null;
        hf stackOut_17_2 = null;
        String stackOut_17_3 = null;
        Object stackOut_16_0 = null;
        hf stackOut_16_1 = null;
        hf stackOut_16_2 = null;
        String stackOut_16_3 = null;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param3) {
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
          ((wa) this).field_V = stackIn_3_1 != 0;
          ((wa) this).field_J = param1;
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (!param2) {
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
          ((wa) this).field_T = stackIn_6_1 != 0;
          stackOut_6_0 = this;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if (!param4) {
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
          ((wa) this).field_U = stackIn_9_1 != 0;
          if (!((wa) this).field_T) {
            break L3;
          } else {
            L4: {
              if (((wa) this).field_V) {
                break L4;
              } else {
                if (!((wa) this).field_U) {
                  break L3;
                } else {
                  break L4;
                }
              }
            }
            throw new IllegalStateException();
          }
        }
        L5: {
          ((wa) this).field_L = (kl) (Object) new qg(param0, (fd) this, 100);
          ((wa) this).field_M = (kl) (Object) new qg("", (fd) this, 20);
          if (!((wa) this).field_T) {
            L6: {
              ((wa) this).field_S = new hf(rc.field_b, (fd) null);
              stackOut_15_0 = this;
              stackOut_15_1 = null;
              stackOut_15_2 = null;
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              if (!((wa) this).field_U) {
                stackOut_17_0 = this;
                stackOut_17_1 = null;
                stackOut_17_2 = null;
                stackOut_17_3 = f.field_m;
                stackIn_18_0 = stackOut_17_0;
                stackIn_18_1 = stackOut_17_1;
                stackIn_18_2 = stackOut_17_2;
                stackIn_18_3 = stackOut_17_3;
                break L6;
              } else {
                stackOut_16_0 = this;
                stackOut_16_1 = null;
                stackOut_16_2 = null;
                stackOut_16_3 = ml.field_m;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_18_2 = stackOut_16_2;
                stackIn_18_3 = stackOut_16_3;
                break L6;
              }
            }
            new hf(stackIn_18_3, (fd) null);
            ((wa) this).field_P = stackIn_18_1;
            if (!((wa) this).field_V) {
              break L5;
            } else {
              ((wa) this).field_K = new hf(ai.field_v, (fd) this);
              break L5;
            }
          } else {
            ((wa) this).field_S = new hf(DrPhlogistonSavesTheEarth.field_E, (fd) null);
            ((wa) this).field_P = new hf(qk.field_d, (fd) null);
            ((wa) this).field_L.field_E = false;
            break L5;
          }
        }
        L7: {
          ((wa) this).field_L.field_l = (cg) (Object) new mj(10000536);
          ((wa) this).field_M.field_l = (cg) (Object) new dm(10000536);
          var6 = new ie();
          ((wa) this).field_S.field_l = (cg) (Object) var6;
          if (null == ((wa) this).field_P) {
            break L7;
          } else {
            ((wa) this).field_P.field_l = (cg) (Object) var6;
            break L7;
          }
        }
        L8: {
          ((wa) this).field_L.field_v = bf.field_x;
          if (((wa) this).field_K == null) {
            break L8;
          } else {
            ((wa) this).field_K.field_l = (cg) (Object) var6;
            break L8;
          }
        }
        L9: {
          if (null == ((wa) this).field_K) {
            break L9;
          } else {
            ((wa) this).field_K.field_v = ai.field_w;
            break L9;
          }
        }
        L10: {
          if (!((wa) this).field_T) {
            if (!((wa) this).field_U) {
              ((wa) this).field_P.field_l = (cg) (Object) new uk();
              break L10;
            } else {
              ((wa) this).field_P.field_v = v.field_X;
              ((wa) this).field_P.field_l = (cg) (Object) new uk();
              break L10;
            }
          } else {
            ((wa) this).field_P.field_v = ka.field_l;
            break L10;
          }
        }
        L11: {
          ((wa) this).field_m = 15;
          var7 = uh.field_i;
          if (((wa) this).field_J == null) {
            break L11;
          } else {
            ((wa) this).field_m = ((wa) this).field_m + (var7.a(((wa) this).field_J, -40 + ((wa) this).field_w, var7.field_x) + 5);
            break L11;
          }
        }
        L12: {
          var8 = ij.field_b;
          var9 = dg.a(nb.a(-117), (byte) -87);
          if (var9 == p.field_d) {
            var8 = rc.field_c;
            break L12;
          } else {
            if (var9 != ka.field_q) {
              break L12;
            } else {
              var8 = gk.field_b;
              break L12;
            }
          }
        }
        L13: {
          var12 = new dh(10, ((wa) this).field_m, ((wa) this).field_w - 20, 25, (vg) (Object) ((wa) this).field_L, false, 80, 3, var7, 16777215, var8);
          ((wa) this).b((vg) (Object) new dh(10, ((wa) this).field_m, ((wa) this).field_w - 20, 25, (vg) (Object) ((wa) this).field_L, false, 80, 3, var7, 16777215, var8), (byte) 53);
          ((wa) this).field_m = ((wa) this).field_m + (((vg) (Object) var12).field_k - -5);
          var13 = new dh(10, ((wa) this).field_m, -20 + ((wa) this).field_w, 25, (vg) (Object) ((wa) this).field_M, false, 80, 3, var7, 16777215, qf.field_a);
          ((wa) this).b((vg) (Object) new dh(10, ((wa) this).field_m, -20 + ((wa) this).field_w, 25, (vg) (Object) ((wa) this).field_M, false, 80, 3, var7, 16777215, qf.field_a), (byte) 77);
          ((wa) this).field_m = ((wa) this).field_m + (((vg) (Object) var13).field_k + 5);
          ((wa) this).field_S.field_u = (fd) this;
          if (((wa) this).field_K == null) {
            break L13;
          } else {
            ((wa) this).field_K.field_u = (fd) this;
            break L13;
          }
        }
        L14: {
          if (((wa) this).field_P == null) {
            break L14;
          } else {
            ((wa) this).field_P.field_u = (fd) this;
            break L14;
          }
        }
        L15: {
          if (null != ((wa) this).field_K) {
            ((wa) this).field_S.a(((wa) this).field_m, 30, 85, 16535, -95 + ((wa) this).field_w);
            ((wa) this).field_m = ((wa) this).field_m + 60;
            break L15;
          } else {
            ((wa) this).field_S.a(((wa) this).field_m, 30, 8, 16535, -16 + ((wa) this).field_w);
            ((wa) this).field_m = ((wa) this).field_m + 35;
            break L15;
          }
        }
        L16: {
          if (((wa) this).field_K == null) {
            break L16;
          } else {
            ((wa) this).field_K.a(((wa) this).field_m, 30, 8, 16535, -6 + (((wa) this).field_w + -10));
            ((wa) this).field_m = ((wa) this).field_m + 35;
            break L16;
          }
        }
        L17: {
          if (((wa) this).field_P == null) {
            break L17;
          } else {
            L18: {
              if (((wa) this).field_T) {
                break L18;
              } else {
                if (!((wa) this).field_U) {
                  ((wa) this).field_P.a(((wa) this).field_m, 20, 8, 16535, 40);
                  ((wa) this).field_m = ((wa) this).field_m + 25;
                  break L17;
                } else {
                  break L18;
                }
              }
            }
            ((wa) this).field_P.a(((wa) this).field_m, 30, 8, 16535, -6 + (((wa) this).field_w - 10));
            ((wa) this).field_m = ((wa) this).field_m + 35;
            break L17;
          }
        }
        L19: {
          ((wa) this).a(0, 3 + ((wa) this).field_m, 0, 16535, ((wa) this).field_w);
          ((wa) this).b((vg) (Object) ((wa) this).field_S, (byte) 89);
          if (null == ((wa) this).field_K) {
            break L19;
          } else {
            ((wa) this).b((vg) (Object) ((wa) this).field_K, (byte) 90);
            break L19;
          }
        }
        L20: {
          if (((wa) this).field_P == null) {
            break L20;
          } else {
            ((wa) this).b((vg) (Object) ((wa) this).field_P, (byte) 54);
            break L20;
          }
        }
    }

    final boolean a(int param0, char param1, vg param2, int param3) {
        if (super.a(param0, param1, param2, 72)) {
          return true;
        } else {
          L0: {
            if (param3 > 63) {
              break L0;
            } else {
              ((wa) this).field_S = null;
              break L0;
            }
          }
          if (-99 == (param0 ^ -1)) {
            return ((wa) this).a(param2, 65535);
          } else {
            if (99 != param0) {
              return false;
            } else {
              return ((wa) this).a(param2, (byte) 98);
            }
          }
        }
    }

    public final void a(int param0, int param1, boolean param2, hf param3, int param4) {
        int var7 = 0;
        Object var8 = null;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          if (((wa) this).field_S != param3) {
            if (param3 == ((wa) this).field_K) {
              L1: {
                if (param2) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L1;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L1;
                }
              }
              ta.b(stackIn_13_0 != 0);
              break L0;
            } else {
              if (((wa) this).field_P == param3) {
                if (((wa) this).field_T) {
                  sg.a(param2);
                  break L0;
                } else {
                  if (((wa) this).field_U) {
                    gf.d((byte) 89);
                    break L0;
                  } else {
                    oh.a((byte) 75);
                    break L0;
                  }
                }
              } else {
                break L0;
              }
            }
          } else {
            this.g((byte) -121);
            break L0;
          }
        }
        L2: {
          if (param2) {
            break L2;
          } else {
            var8 = null;
            wa.a((String) null, true, (java.applet.Applet) null, (byte) -7);
            break L2;
          }
        }
    }

    final static void a(byte param0) {
        if (param0 != -43) {
            field_R = -56;
        }
    }

    final static int a(byte param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        nf.field_w = nf.field_w + 65536;
        L0: while (true) {
          if (65536 > bj.a(false, nf.field_w, rd.field_G)) {
            L1: {
              var2 = -1;
              if (null != gl.field_e) {
                var2 = gl.field_e.length;
                break L1;
              } else {
                if (bh.field_c != null) {
                  var2 = bh.field_c.length;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              var3 = -10 / ((param0 - -62) / 33);
              if (var2 != -1) {
                L3: {
                  if (rd.field_D > la.field_b) {
                    L4: {
                      la.field_b = la.field_b + 1;
                      if (rd.field_F >= la.field_b) {
                        break L4;
                      } else {
                        if (null != gl.field_e) {
                          if (null != gl.field_e[ig.field_k]) {
                            break L4;
                          } else {
                            la.field_b = la.field_b - 1;
                            break L3;
                          }
                        } else {
                          la.field_b = la.field_b - 1;
                          break L3;
                        }
                      }
                    }
                    if (rd.field_D > la.field_b) {
                      break L3;
                    } else {
                      if (gl.field_e[(1 + ig.field_k) % var2] == null) {
                        la.field_b = la.field_b - 1;
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                L5: {
                  if (rd.field_D <= la.field_b) {
                    L6: {
                      bd.field_L = ig.field_k;
                      if (!ie.field_B) {
                        ig.field_k = ig.field_k - 1;
                        if ((ig.field_k ^ -1) > -1) {
                          ig.field_k = ig.field_k + var2;
                          break L6;
                        } else {
                          break L6;
                        }
                      } else {
                        ig.field_k = ig.field_k + 1;
                        if (ig.field_k >= var2) {
                          ig.field_k = ig.field_k - var2;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                    }
                    la.field_b = la.field_b - rd.field_D;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                if (la.field_b <= rd.field_F) {
                  break L2;
                } else {
                  ie.field_B = true;
                  break L2;
                }
              } else {
                break L2;
              }
            }
            L7: {
              if (sc.field_c == null) {
                break L7;
              } else {
                L8: {
                  var4 = 357 + -(sc.field_c.field_C / 2);
                  var5 = 0;
                  if (-1 == (mh.field_f ^ -1)) {
                    break L8;
                  } else {
                    if (var4 >= ih.field_R) {
                      break L8;
                    } else {
                      if (ih.field_R < var4 - -sc.field_c.field_w) {
                        L9: {
                          if (ae.field_gb <= -sc.field_c.field_y + 269) {
                            break L9;
                          } else {
                            if ((ae.field_gb ^ -1) <= -270) {
                              break L9;
                            } else {
                              ie.field_B = false;
                              var5 = 1;
                              la.field_b = rd.field_D;
                              break L9;
                            }
                          }
                        }
                        if (ae.field_gb <= 586) {
                          break L8;
                        } else {
                          if (ae.field_gb < sc.field_c.field_y + 586) {
                            var5 = 1;
                            la.field_b = rd.field_D;
                            ie.field_B = true;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                if (var5 != 0) {
                  break L7;
                } else {
                  if (rd.field_F >= la.field_b) {
                    break L7;
                  } else {
                    if (ob.field_g <= var4) {
                      break L7;
                    } else {
                      if (ob.field_g >= var4 + sc.field_c.field_w) {
                        break L7;
                      } else {
                        L10: {
                          if (-sc.field_c.field_y + 269 >= ck.field_c) {
                            break L10;
                          } else {
                            if (-270 >= ck.field_c) {
                              break L10;
                            } else {
                              la.field_b = rd.field_F;
                              break L10;
                            }
                          }
                        }
                        if (-587 >= ck.field_c) {
                          break L7;
                        } else {
                          if (sc.field_c.field_y + 586 > ck.field_c) {
                            la.field_b = rd.field_F;
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
            }
            if (param1) {
              L11: {
                lb.field_w.a(0, ua.a(ob.field_g, -13412, ck.field_c), ua.a(ih.field_R, -13412, ae.field_gb));
                if (!lb.field_w.c((byte) -82)) {
                  break L11;
                } else {
                  if (-1 == (lb.field_w.field_f ^ -1)) {
                    return 3;
                  } else {
                    if (1 != lb.field_w.field_f) {
                      break L11;
                    } else {
                      return 2;
                    }
                  }
                }
              }
              L12: while (true) {
                if (th.a(83)) {
                  L13: {
                    lb.field_w.a(0, (byte) 123);
                    if (!lb.field_w.c((byte) -82)) {
                      break L13;
                    } else {
                      if (lb.field_w.field_f == 0) {
                        return 3;
                      } else {
                        if (lb.field_w.field_f != 1) {
                          break L13;
                        } else {
                          return 1;
                        }
                      }
                    }
                  }
                  if (di.field_c == 13) {
                    return 1;
                  } else {
                    continue L12;
                  }
                } else {
                  return 0;
                }
              }
            } else {
              return 0;
            }
          } else {
            k.field_L = k.field_L + 1;
            nf.field_w = nf.field_w - rd.field_G;
            continue L0;
          }
        }
    }

    final void b(byte param0, String param1) {
        if (param0 < 24) {
            ((wa) this).field_M = null;
        }
        kl var3 = ((wa) this).field_L;
        String var4 = param1;
        var3.a(false, var4, -19116);
        ((wa) this).field_M.h((byte) 88);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = new int[75];
    }
}
