/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ri extends sl {
    private qj field_ab;
    private int field_W;
    private int field_U;
    static int field_V;
    private int field_Y;
    private int field_r;
    private int field_cb;
    private int field_J;
    private int field_C;
    private cd field_A;
    private int field_X;
    private int field_x;
    private int field_R;
    int field_O;
    private String field_L;
    private boolean field_F;
    private ja field_S;
    private int field_Z;
    static int[] field_H;
    private int field_q;
    private int field_T;
    private int field_s;
    private int field_G;
    private ea field_I;
    private int field_E;
    private int field_t;
    private int field_p;
    static int field_P;
    private int field_v;
    private long field_w;
    private int field_bb;
    private String field_y;
    private int field_D;
    static int[] field_B;
    private ja field_M;
    private int field_N;
    private boolean field_z;
    private boolean field_K;
    private ra field_u;

    private final void a(int param0, int param1, int param2) {
        if (param2 != -5383) {
            return;
        }
        int var4 = 1 << param1;
        if (!((th.field_l & var4) == 0)) {
            return;
        }
        th.field_l = th.field_l | var4;
        oe.field_e = oe.field_e | var4;
        ((ri) this).field_s = ((ri) this).field_s | var4;
        ka.field_d.a((byte) -123, (fc) (Object) new cf(param1, param0, ((ri) this).field_R, ((ri) this).field_bb, ((ri) this).field_cb, ((ri) this).field_E));
    }

    private final void a(ja param0, int param1, ja param2, me param3) {
        int var6 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        L0: {
          var6 = TrackController.field_F ? 1 : 0;
          if (param3.e(param1 + -3045)) {
            break L0;
          } else {
            param3.a(-68);
            ((ri) this).field_d[param3.field_s][param3.field_r] = tc.a(((ri) this).field_d[param3.field_s][param3.field_r], this.b(16384, param3.field_o, param3.field_j) ^ -1);
            param3.f(param1 ^ 3098);
            ((ri) this).field_d[param3.field_s][param3.field_r] = param3.field_m;
            if (param3.field_m == 38) {
              L1: {
                ((ri) this).field_D = param3.field_s;
                ((ri) this).field_Z = param3.field_r;
                if (((ri) this).field_D != ((ri) this).field_G) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  stackOut_6_0 = 1;
                  stackIn_8_0 = stackOut_6_0;
                  break L1;
                }
              }
              L2: {
                stackOut_8_0 = stackIn_8_0;
                stackIn_10_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (((ri) this).field_x != ((ri) this).field_Z) {
                  stackOut_10_0 = stackIn_10_0;
                  stackOut_10_1 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  break L2;
                } else {
                  stackOut_9_0 = stackIn_9_0;
                  stackOut_9_1 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  break L2;
                }
              }
              if ((stackIn_11_0 ^ stackIn_11_1) != 0) {
                break L0;
              } else {
                ((ri) this).field_G = -1;
                ((ri) this).field_x = -1;
                break L0;
              }
            } else {
              if (((ri) this).field_o[param3.field_s][param3.field_r] == 1) {
                param2.a((byte) -118, (fc) (Object) param3);
                break L0;
              } else {
                param0.a((byte) -123, (fc) (Object) param3);
                break L0;
              }
            }
          }
        }
        L3: {
          if (param1 == 3098) {
            break L3;
          } else {
            ((ri) this).field_C = 32;
            break L3;
          }
        }
    }

    private final int a(byte param0, int param1) {
        int stackIn_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 > 105) {
            break L0;
          } else {
            ((ri) this).field_L = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (param1 == 38) {
              break L2;
            } else {
              if ((32640 & param1) == 0) {
                stackOut_6_0 = -65 & param1;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_7_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_7_0;
    }

    private final int a(int[][] param0, int param1, int param2, int param3) {
        L0: {
          if (param3 < 0) {
            break L0;
          } else {
            if (param0.length <= param3) {
              break L0;
            } else {
              if (0 > param1) {
                break L0;
              } else {
                if (param0[param3].length > param1) {
                  L1: {
                    if (param2 == 21278) {
                      break L1;
                    } else {
                      field_B = null;
                      break L1;
                    }
                  }
                  return this.a((byte) 110, param0[param3][param1]);
                } else {
                  return 0;
                }
              }
            }
          }
        }
        return 0;
    }

    private final void b(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        dh var7_ref_dh = null;
        int var8 = 0;
        int var9 = 0;
        var9 = TrackController.field_F ? 1 : 0;
        if (param0 == 247) {
          var3 = bc.field_c[((ri) this).field_bb & 7][((ri) this).field_E & 7];
          ((ri) this).field_R = ((ri) this).field_R - var3 * ((ri) this).field_E;
          ((ri) this).field_cb = ((ri) this).field_cb + var3;
          ((ri) this).field_bb = ((ri) this).field_bb + var3;
          if (param1 == ((ri) this).field_J) {
            return;
          } else {
            L0: {
              ((ri) this).field_v = ((ri) this).field_h;
              ((ri) this).field_J = param1;
              var7 = ((ri) this).field_J;
              if (var7 != 2) {
                break L0;
              } else {
                L1: {
                  fe.a(false, pf.field_P[2], param0 ^ 503);
                  si.a((byte) -68, 3);
                  var4 = ((ri) this).field_X >> -334978015;
                  var5 = ((ri) this).field_I.field_v + var4;
                  ((ri) this).field_R = ((ri) this).field_R + var5;
                  ((ri) this).field_O = ((ri) this).field_O + var5;
                  ((ri) this).field_y = dh.a((byte) -127, new String[3], ob.field_o);
                  ((ri) this).field_Y = 156;
                  var6 = bk.field_E.a(((ri) this).field_y) - -4;
                  if (((ri) this).field_Y >= var6) {
                    break L1;
                  } else {
                    ((ri) this).field_Y = var6 - -(var6 % 26);
                    ((ri) this).field_Y = ((ri) this).field_Y - ((ri) this).field_Y % 26;
                    break L1;
                  }
                }
                L2: {
                  if (!((ri) this).field_F) {
                    ((ri) this).field_p = 0;
                    break L2;
                  } else {
                    ((ri) this).field_L = tc.field_e + (var5 << 832515233);
                    ((ri) this).field_O = ((ri) this).field_O + var5;
                    ((ri) this).field_R = ((ri) this).field_R + var5;
                    ((ri) this).field_p = ((ri) this).field_p + 1;
                    var6 = 4 + bk.field_E.a(((ri) this).field_L);
                    if (((ri) this).field_Y < var6) {
                      ((ri) this).field_Y = var6 % 26 + var6;
                      ((ri) this).field_Y = ((ri) this).field_Y - ((ri) this).field_Y % 26;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L3: {
                  if (!ui.a(0, true)) {
                    break L3;
                  } else {
                    ((ri) this).field_W = ((ri) this).field_W + 1;
                    break L3;
                  }
                }
                L4: {
                  ((ri) this).field_t = -((ri) this).field_Y;
                  if (((ri) this).field_I.field_x == gj.field_f.length) {
                    ((ri) this).g(63);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L5: {
                  if (Math.abs(((ri) this).field_O) <= ((ri) this).field_T) {
                    break L5;
                  } else {
                    vd.b(-1, 10, 23636);
                    break L5;
                  }
                }
                L6: {
                  ((ri) this).field_A.a(-1, ((ri) this).field_A.field_a, (byte) 100);
                  if (pc.field_i + 1 != ((ri) this).field_I.field_x) {
                    break L6;
                  } else {
                    pc.field_i = ((ri) this).field_I.field_x;
                    var7_ref_dh = new dh(0, -1 + ((ri) this).field_I.field_x, ((ri) this).field_R, ((ri) this).field_bb, ((ri) this).field_cb, ((ri) this).field_E);
                    if (!jj.s(param0 + -205)) {
                      ij.a(var7_ref_dh, 5, -124);
                      break L6;
                    } else {
                      cd.field_h.a((byte) -97, (fc) (Object) var7_ref_dh);
                      break L6;
                    }
                  }
                }
                L7: {
                  if (-6 != (pc.field_i ^ -1)) {
                    if (10 != pc.field_i) {
                      if (pc.field_i != 20) {
                        if (pc.field_i != 30) {
                          break L7;
                        } else {
                          this.a(252, 3, -5383);
                          break L7;
                        }
                      } else {
                        this.a(253, 2, param0 + -5630);
                        break L7;
                      }
                    } else {
                      this.a(254, 1, param0 ^ -5618);
                      break L7;
                    }
                  } else {
                    this.a(255, 0, param0 ^ -5618);
                    break L7;
                  }
                }
                L8: {
                  if (-6 != (((ri) this).field_p ^ -1)) {
                    if (10 == ((ri) this).field_p) {
                      this.a(250, 5, param0 + -5630);
                      break L8;
                    } else {
                      if ((((ri) this).field_p ^ -1) == -21) {
                        this.a(249, 6, -5383);
                        break L8;
                      } else {
                        if (30 != ((ri) this).field_p) {
                          break L8;
                        } else {
                          this.a(248, 7, -5383);
                          break L8;
                        }
                      }
                    }
                  } else {
                    this.a(251, 4, param0 + -5630);
                    break L8;
                  }
                }
                L9: {
                  if (-100001 < (((ri) this).field_O ^ -1)) {
                    if (50000 > ((ri) this).field_O) {
                      if (((ri) this).field_O < 25000) {
                        if ((((ri) this).field_O ^ -1) > -10001) {
                          break L9;
                        } else {
                          this.a(247, 8, -5383);
                          break L9;
                        }
                      } else {
                        this.a(246, 9, -5383);
                        break L9;
                      }
                    } else {
                      this.a(245, 10, param0 + -5630);
                      break L9;
                    }
                  } else {
                    this.a(244, 11, -5383);
                    break L9;
                  }
                }
                L10: {
                  if (!ui.a(0, true)) {
                    break L10;
                  } else {
                    if (20 == ((ri) this).field_W) {
                      this.a(243, 12, param0 + -5630);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                }
                var7 = 0;
                L11: while (true) {
                  if (var7 >= 16) {
                    ((ri) this).field_u = new ra(((ri) this).field_o, ((ri) this).field_d, ((ri) this).field_i, 16, 48, true);
                    ((ri) this).field_u.field_h = ((ri) this).field_h;
                    break L0;
                  } else {
                    var8 = 0;
                    L12: while (true) {
                      if (-17 >= (var8 ^ -1)) {
                        var7++;
                        continue L11;
                      } else {
                        ((ri) this).field_d[var7][var8] = tc.a(((ri) this).field_d[var7][var8], -32641);
                        var8++;
                        continue L12;
                      }
                    }
                  }
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    private final int b(int param0, byte param1, int param2) {
        int var4 = 0;
        L0: {
          if (param1 < -29) {
            break L0;
          } else {
            ri.e(-34);
            break L0;
          }
        }
        var4 = param0 + param2 * 2;
        if (0 == (var4 ^ -1)) {
          return 128;
        } else {
          if (-2 == (var4 ^ -1)) {
            return 1024;
          } else {
            if (var4 == -2) {
              return 512;
            } else {
              if (-3 == (var4 ^ -1)) {
                return 256;
              } else {
                throw new IllegalStateException();
              }
            }
          }
        }
    }

    public static void a(int param0) {
        field_B = null;
        field_H = null;
        if (param0 > -27) {
            field_V = -43;
        }
    }

    ri() {
        super(true, 16, 48);
        ((ri) this).field_W = 0;
        ((ri) this).field_U = -1;
        ((ri) this).field_r = -1;
        ((ri) this).field_cb = 4194336;
        ((ri) this).field_x = -1;
        ((ri) this).field_E = -17;
        ((ri) this).field_R = 0;
        ((ri) this).field_t = -1000;
        ((ri) this).field_G = -1;
        ((ri) this).field_p = 0;
        ((ri) this).field_F = true;
        ((ri) this).field_bb = 16777219;
        ((ri) this).field_A = new cd(1);
        ((ri) this).field_z = false;
        ((ri) this).field_bb = qh.field_b.field_x;
        ((ri) this).field_R = -692867528;
        ((ri) this).field_cb = 640022790;
        ((ri) this).field_E = 0;
        ((ri) this).a(qh.field_b, 42);
    }

    private final void a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = TrackController.field_F ? 1 : 0;
          if (((ri) this).field_u == null) {
            break L0;
          } else {
            ((ri) this).field_u.a(true, 105);
            break L0;
          }
        }
        L1: {
          var3 = ((ri) this).field_a + 130;
          if (((ri) this).field_t < var3) {
            ((ri) this).field_t = ((ri) this).field_t + 3;
            if (var3 < ((ri) this).field_t) {
              ((ri) this).field_t = var3;
              break L1;
            } else {
              break L1;
            }
          } else {
            break L1;
          }
        }
        L2: {
          if (param0 == 150) {
            break L2;
          } else {
            int discarded$1 = this.b(-96, 54, 106);
            break L2;
          }
        }
        L3: {
          if ((((ri) this).field_q ^ -1) < -1) {
            L4: {
              var4 = 20;
              if (((ri) this).field_q >= var4) {
                break L4;
              } else {
                var4 = ((ri) this).field_q;
                break L4;
              }
            }
            L5: {
              var5 = ((ri) this).field_q % 20;
              if (-1 == (var5 ^ -1)) {
                break L5;
              } else {
                var4 = var5;
                break L5;
              }
            }
            ((ri) this).field_T = ((ri) this).field_T + (var4 >> -573638239);
            ((ri) this).field_q = ((ri) this).field_q - var4;
            if (((ri) this).field_F) {
              ((ri) this).field_T = ((ri) this).field_T + (var4 >> 1722002657);
              break L3;
            } else {
              break L3;
            }
          } else {
            if (((ri) this).field_X > 0) {
              L6: {
                var4 = 20;
                if (var4 > ((ri) this).field_X) {
                  var4 = ((ri) this).field_X;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                var5 = ((ri) this).field_X % 20;
                if (var5 != 0) {
                  var4 = var5;
                  break L7;
                } else {
                  break L7;
                }
              }
              ((ri) this).field_X = ((ri) this).field_X - var4;
              ((ri) this).field_T = ((ri) this).field_T + (var4 >> 697144257);
              if (!((ri) this).field_F) {
                break L3;
              } else {
                ((ri) this).field_T = ((ri) this).field_T + (var4 >> 610561761);
                break L3;
              }
            } else {
              break L3;
            }
          }
        }
        L8: {
          if (0 == ((ri) this).field_X) {
            hl.a(10, 0);
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          if (!param1) {
            break L9;
          } else {
            var4 = 0;
            L10: while (true) {
              if (!mh.e(127)) {
                L11: {
                  ((ri) this).field_A.a(26 + ((ri) this).field_C, ((ri) this).field_t, 26, false, 156 + ((ri) this).field_t);
                  if (((ri) this).field_A.b(false)) {
                    var4 = 1;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                if (var4 == 0) {
                  break L9;
                } else {
                  ((ri) this).field_T = Math.abs(((ri) this).field_O);
                  hl.a(10, 0);
                  sc.field_g = -2;
                  break L9;
                }
              } else {
                ((ri) this).field_A.b((byte) -107);
                if (!((ri) this).field_A.b(false)) {
                  continue L10;
                } else {
                  var4 = 1;
                  continue L10;
                }
              }
            }
          }
        }
    }

    private final void f(int param0) {
        int var2 = 0;
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
        var14 = TrackController.field_F ? 1 : 0;
        var2 = -((ri) this).field_v + ((ri) this).field_h;
        var3 = 69;
        if (param0 < -93) {
          L0: {
            var4 = 92;
            var5 = 150;
            var6 = (480 - var5) * (var2 + -var4) * (var2 + -var4) / ((var3 + -var4) * (-var4 + var3)) + var5;
            if (var4 >= var2) {
              break L0;
            } else {
              if ((var6 ^ -1) >= -195) {
                break L0;
              } else {
                var6 = 194;
                break L0;
              }
            }
          }
          L1: {
            if (var2 > var3 << -893247103) {
              var6 = 194;
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (var2 <= var4) {
              break L2;
            } else {
              L3: {
                if (null != jj.field_fb) {
                  break L3;
                } else {
                  jj.field_fb = new int[pi.field_f.length()];
                  break L3;
                }
              }
              var7 = var2;
              var8 = 0;
              L4: while (true) {
                if (var8 >= jj.field_fb.length) {
                  var8 = bk.field_E.a(pi.field_f);
                  bk.field_E.b(8, -1);
                  bk.field_E.a(pi.field_f, 466 - -(-var8 + j.field_b[0].field_s >> -1422015711), -20 + var6, (int[]) null, jj.field_fb);
                  break L2;
                } else {
                  jj.field_fb[var8] = (int)(Math.sin((double)(-250 + var7) / 5.0) * 5.0);
                  var7--;
                  var8++;
                  continue L4;
                }
              }
            }
          }
          L5: {
            if (0 != ((ri) this).field_s) {
              L6: {
                j.field_b[1].e(466, var6);
                cl.a(nd.field_L, 457, 124, var6 - -71, 176, 4);
                var7 = ((ri) this).field_s;
                var8 = sc.a(var7, -1);
                var9 = (-var3 + var2) / 300;
                var10 = var9 + -1;
                if (0 > var9) {
                  var9 = 0;
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                if (var9 < var8) {
                  break L7;
                } else {
                  var9 = var8 + -1;
                  var10 = -1;
                  break L7;
                }
              }
              var11 = -1;
              var12 = 0;
              L8: while (true) {
                if (var12 >= wa.field_k.length) {
                  L9: {
                    if (var11 != -1) {
                      var12 = (var2 + -var3) % 300;
                      var13 = var6 + (var12 * var12 >> -593271902);
                      cl.a(nd.field_L, 457, 124, 71 + var13, 176, 4);
                      bb.field_b[var11].b(467, 26 + (81 + var13));
                      int discarded$2 = bk.field_E.a(wa.field_k[var11], 499, 10 + (var13 + 71) + 26, 124, 1000, 4, -1, 0, 0, 25);
                      break L9;
                    } else {
                      break L9;
                    }
                  }
                  j.field_b[2].e(466, var6);
                  break L5;
                } else {
                  if (-1 != (1 << var12 & var7 ^ -1)) {
                    L10: {
                      if (var10 != 0) {
                        break L10;
                      } else {
                        var11 = var12;
                        break L10;
                      }
                    }
                    if (var9 == 0) {
                      bb.field_b[var12].b(467, 26 + var6 - -71 - -10);
                      int discarded$3 = bk.field_E.a(wa.field_k[var12], 499, var6 - -71 - -36, 124, 1000, 4, -1, 0, 0, 25);
                      var9--;
                      var10--;
                      var12++;
                      continue L8;
                    } else {
                      var9--;
                      var10--;
                      var12++;
                      continue L8;
                    }
                  } else {
                    var12++;
                    continue L8;
                  }
                }
              }
            } else {
              j.field_b[0].e(466, var6);
              break L5;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final boolean d(int param0) {
        int var2 = 0;
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
        L0: {
          var13 = TrackController.field_F ? 1 : 0;
          if (-3 < (sl.field_j ^ -1)) {
            break L0;
          } else {
            if (ni.field_m[12]) {
              return true;
            } else {
              break L0;
            }
          }
        }
        L1: {
          if (param0 >= 79) {
            break L1;
          } else {
            ((ri) this).field_v = 41;
            break L1;
          }
        }
        if (((ri) this).field_S.a(true) < -2) {
          return false;
        } else {
          L2: {
            if (-2 != ((ri) this).field_S.a(true)) {
              break L2;
            } else {
              if (((me) (Object) ((ri) this).field_S.b(2)).field_m == 38) {
                break L2;
              } else {
                return false;
              }
            }
          }
          if (this.b(((ri) this).field_d, (byte) -66) == ((ri) this).field_w) {
            var2 = this.a(((ri) this).field_i, 0);
            var3 = this.a(((ri) this).field_i, (byte) -76);
            var4 = -var2 + this.a(((ri) this).field_d, 0);
            var5 = -var3 + this.a(((ri) this).field_d, (byte) -69);
            var6 = ((ri) this).field_i.length;
            var7 = ((ri) this).field_i[0].length;
            var8 = var2;
            L3: while (true) {
              if (var6 <= var8) {
                var8 = var4 + var2;
                var9 = 0;
                var10 = ((ri) this).field_d[0].length;
                var11 = ((ri) this).field_d.length + -1;
                L4: while (true) {
                  L5: {
                    if ((var11 ^ -1) > -1) {
                      break L5;
                    } else {
                      var12 = 0;
                      L6: while (true) {
                        if (var10 <= var12) {
                          var11--;
                          var9++;
                          continue L4;
                        } else {
                          if (this.a((byte) 121, ((ri) this).field_d[var11][var12]) != 0) {
                            break L5;
                          } else {
                            var12++;
                            continue L6;
                          }
                        }
                      }
                    }
                  }
                  L7: {
                    if (var8 <= var9) {
                      ((ri) this).field_C = -26 + (-(13 * var9) + 416) + ((ri) this).field_f;
                      break L7;
                    } else {
                      ((ri) this).field_C = 13 * var8 + ((ri) this).field_f - 26;
                      break L7;
                    }
                  }
                  L8: {
                    if (!((ri) this).field_F) {
                      break L8;
                    } else {
                      ((ri) this).field_C = ((ri) this).field_C + 13;
                      break L8;
                    }
                  }
                  return true;
                }
              } else {
                var9 = var3;
                L9: while (true) {
                  if (var7 <= var9) {
                    var8++;
                    continue L3;
                  } else {
                    if (((ri) this).field_i[var8][var9] == this.a(((ri) this).field_d, var5 + var9, 21278, var4 + var8)) {
                      var9++;
                      continue L9;
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
          } else {
            return false;
          }
        }
    }

    final void c(int param0, int param1) {
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var4 = TrackController.field_F ? 1 : 0;
          hl.a(10, 0);
          if (param0 != 0) {
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
          fe.a(stackIn_3_0 != 0, pf.field_P[param0], 256);
          if (param1 > 110) {
            break L1;
          } else {
            this.b(27, 2);
            break L1;
          }
        }
        L2: {
          if (!jj.s(24)) {
            ((ri) this).g(18);
            if (oe.field_e != 0) {
              sc.field_g = 16;
              break L2;
            } else {
              if (0 != ((ri) this).field_O) {
                sc.field_g = 11;
                break L2;
              } else {
                sc.field_g = 1;
                break L2;
              }
            }
          } else {
            if ((((ri) this).field_O | oe.field_e) == 0) {
              sc.field_g = 0;
              break L2;
            } else {
              sc.field_g = 15;
              break L2;
            }
          }
        }
    }

    final void a(boolean param0, int param1) {
        int var3 = 0;
        int var4_int = 0;
        ja var4 = null;
        ja var5 = null;
        int var6 = 0;
        int var7_int = 0;
        me var7 = null;
        oc var7_ref = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14_int = 0;
        me var14 = null;
        me var15 = null;
        int var16 = 0;
        Object var17 = null;
        me var18 = null;
        int stackIn_20_0 = 0;
        Object stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        Object stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_43_2 = 0;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        int stackIn_44_3 = 0;
        int stackIn_50_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_53_1 = 0;
        int stackIn_62_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_65_1 = 0;
        int stackIn_84_0 = 0;
        int stackIn_89_0 = 0;
        int stackIn_119_0 = 0;
        int stackIn_120_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_122_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_124_0 = 0;
        int stackIn_125_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_127_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_130_0 = 0;
        int stackIn_131_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_132_1 = 0;
        int stackIn_172_0 = 0;
        Object stackIn_199_0 = null;
        int stackIn_199_1 = 0;
        int stackIn_199_2 = 0;
        Object stackIn_200_0 = null;
        int stackIn_200_1 = 0;
        int stackIn_200_2 = 0;
        Object stackIn_201_0 = null;
        int stackIn_201_1 = 0;
        int stackIn_201_2 = 0;
        int stackIn_201_3 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        Object stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        int stackOut_43_3 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        int stackOut_42_3 = 0;
        int stackOut_49_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        int stackOut_61_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_64_1 = 0;
        int stackOut_63_0 = 0;
        int stackOut_63_1 = 0;
        int stackOut_83_0 = 0;
        int stackOut_82_0 = 0;
        int stackOut_81_0 = 0;
        int stackOut_88_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_118_0 = 0;
        int stackOut_119_0 = 0;
        int stackOut_120_0 = 0;
        int stackOut_121_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_123_0 = 0;
        int stackOut_124_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_128_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_131_1 = 0;
        int stackOut_130_0 = 0;
        int stackOut_130_1 = 0;
        int stackOut_171_0 = 0;
        int stackOut_170_0 = 0;
        Object stackOut_198_0 = null;
        int stackOut_198_1 = 0;
        int stackOut_198_2 = 0;
        Object stackOut_200_0 = null;
        int stackOut_200_1 = 0;
        int stackOut_200_2 = 0;
        int stackOut_200_3 = 0;
        Object stackOut_199_0 = null;
        int stackOut_199_1 = 0;
        int stackOut_199_2 = 0;
        int stackOut_199_3 = 0;
        L0: {
          var17 = null;
          var16 = TrackController.field_F ? 1 : 0;
          super.a(param0, 107);
          if (!param0) {
            break L0;
          } else {
            this.c((byte) -4);
            break L0;
          }
        }
        L1: {
          if (param1 >= 72) {
            break L1;
          } else {
            boolean discarded$3 = this.a(true, -46, 126);
            break L1;
          }
        }
        L2: {
          if (!param0) {
            break L2;
          } else {
            if (mg.field_a) {
              ((ri) this).field_A.field_a = true;
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (!param0) {
            break L3;
          } else {
            if ((uk.field_a ^ -1) != -2) {
              break L3;
            } else {
              if (((ri) this).field_J != 2) {
                L4: {
                  int fieldTemp$4 = ((ri) this).field_E;
                  int fieldTemp$5 = ((ri) this).field_E + 1;
                  ((ri) this).field_E = ((ri) this).field_E + 1;
                  ((ri) this).field_bb = ((ri) this).field_bb ^ (fieldTemp$4 ^ fieldTemp$5);
                  ((ri) this).field_R = ((ri) this).field_R - ((ri) this).field_cb;
                  var3 = db.field_X - 467;
                  var4_int = wg.field_e + -138;
                  if (0 > var3) {
                    break L4;
                  } else {
                    if (26 + ba.field_b.field_G <= var4_int) {
                      break L4;
                    } else {
                      if (-157 >= (var3 ^ -1)) {
                        break L4;
                      } else {
                        if (var4_int >= 0) {
                          L5: {
                            si.a((byte) -68, 5);
                            if (!jj.s(29)) {
                              stackOut_19_0 = 12;
                              stackIn_20_0 = stackOut_19_0;
                              break L5;
                            } else {
                              stackOut_18_0 = 13;
                              stackIn_20_0 = stackOut_18_0;
                              break L5;
                            }
                          }
                          sc.field_g = stackIn_20_0;
                          return;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                var4_int = wg.field_e + -178;
                if ((var3 ^ -1) > -1) {
                  break L3;
                } else {
                  if (26 - -ba.field_b.field_G <= var4_int) {
                    break L3;
                  } else {
                    if (156 <= var3) {
                      break L3;
                    } else {
                      if (var4_int < 0) {
                        break L3;
                      } else {
                        si.a((byte) -68, 5);
                        sc.field_g = -2;
                        return;
                      }
                    }
                  }
                }
              } else {
                break L3;
              }
            }
          }
        }
        L6: {
          if (1 == g.field_p) {
            if (1 != ((ri) this).field_J) {
              break L6;
            } else {
              si.a((byte) -68, 5);
              sc.field_g = -2;
              return;
            }
          } else {
            break L6;
          }
        }
        if (2 != ((ri) this).field_J) {
          L7: {
            var3 = -3 + ((ri) this).field_E;
            ((ri) this).field_bb = ((ri) this).field_bb ^ (((ri) this).field_E ^ var3);
            if (0 < ((ri) this).field_X) {
              ((ri) this).field_X = ((ri) this).field_X - 1;
              break L7;
            } else {
              break L7;
            }
          }
          ((ri) this).field_R = ((ri) this).field_R + ((ri) this).field_cb * 3;
          ((ri) this).field_E = var3;
          var4 = new ja();
          var5 = new ja();
          var18 = (me) (Object) ((ri) this).field_S.b(2);
          L8: while (true) {
            if (var18 == null) {
              L9: {
                if (-1 == (((ri) this).field_b ^ -1)) {
                  break L9;
                } else {
                  ((ri) this).field_b = ((ri) this).field_b + 1;
                  break L9;
                }
              }
              L10: {
                if (((ri) this).field_N == ((ri) this).field_l) {
                  break L10;
                } else {
                  L11: {
                    var6 = -((ri) this).field_l + ((ri) this).field_N;
                    var7_int = -16 + gj.a(2, 32, 16 + var6);
                    stackOut_41_0 = this;
                    stackOut_41_1 = 2;
                    stackOut_41_2 = 32;
                    stackIn_43_0 = stackOut_41_0;
                    stackIn_43_1 = stackOut_41_1;
                    stackIn_43_2 = stackOut_41_2;
                    stackIn_42_0 = stackOut_41_0;
                    stackIn_42_1 = stackOut_41_1;
                    stackIn_42_2 = stackOut_41_2;
                    if (-1 <= (var7_int ^ -1)) {
                      stackOut_43_0 = this;
                      stackOut_43_1 = stackIn_43_1;
                      stackOut_43_2 = stackIn_43_2;
                      stackOut_43_3 = ((ri) this).field_l + -1;
                      stackIn_44_0 = stackOut_43_0;
                      stackIn_44_1 = stackOut_43_1;
                      stackIn_44_2 = stackOut_43_2;
                      stackIn_44_3 = stackOut_43_3;
                      break L11;
                    } else {
                      stackOut_42_0 = this;
                      stackOut_42_1 = stackIn_42_1;
                      stackOut_42_2 = stackIn_42_2;
                      stackOut_42_3 = ((ri) this).field_l - -1;
                      stackIn_44_0 = stackOut_42_0;
                      stackIn_44_1 = stackOut_42_1;
                      stackIn_44_2 = stackOut_42_2;
                      stackIn_44_3 = stackOut_42_3;
                      break L11;
                    }
                  }
                  ((ri) this).field_l = gj.a(stackIn_44_1, stackIn_44_2, stackIn_44_3);
                  break L10;
                }
              }
              L12: {
                var6 = 0;
                if (1 != (((ri) this).field_Z ^ -1)) {
                  L13: {
                    ((ri) this).field_K = false;
                    ((ri) this).field_r = -1;
                    ((ri) this).field_U = -1;
                    if (!ni.field_m[98]) {
                      stackOut_49_0 = 0;
                      stackIn_50_0 = stackOut_49_0;
                      break L13;
                    } else {
                      stackOut_48_0 = -1;
                      stackIn_50_0 = stackOut_48_0;
                      break L13;
                    }
                  }
                  L14: {
                    stackOut_50_0 = stackIn_50_0;
                    stackIn_52_0 = stackOut_50_0;
                    stackIn_51_0 = stackOut_50_0;
                    if (ni.field_m[99]) {
                      stackOut_52_0 = stackIn_52_0;
                      stackOut_52_1 = 1;
                      stackIn_53_0 = stackOut_52_0;
                      stackIn_53_1 = stackOut_52_1;
                      break L14;
                    } else {
                      stackOut_51_0 = stackIn_51_0;
                      stackOut_51_1 = 0;
                      stackIn_53_0 = stackOut_51_0;
                      stackIn_53_1 = stackOut_51_1;
                      break L14;
                    }
                  }
                  L15: {
                    L16: {
                      var7_int = stackIn_53_0 + stackIn_53_1;
                      if (ni.field_m[98]) {
                        break L16;
                      } else {
                        if (ni.field_m[99]) {
                          break L16;
                        } else {
                          if (ni.field_m[96]) {
                            break L16;
                          } else {
                            if (ni.field_m[97]) {
                              break L16;
                            } else {
                              break L15;
                            }
                          }
                        }
                      }
                    }
                    ((ri) this).field_A.field_a = false;
                    break L15;
                  }
                  L17: {
                    if (ni.field_m[96]) {
                      stackOut_61_0 = -1;
                      stackIn_62_0 = stackOut_61_0;
                      break L17;
                    } else {
                      stackOut_60_0 = 0;
                      stackIn_62_0 = stackOut_60_0;
                      break L17;
                    }
                  }
                  L18: {
                    stackOut_62_0 = stackIn_62_0;
                    stackIn_64_0 = stackOut_62_0;
                    stackIn_63_0 = stackOut_62_0;
                    if (ni.field_m[97]) {
                      stackOut_64_0 = stackIn_64_0;
                      stackOut_64_1 = 1;
                      stackIn_65_0 = stackOut_64_0;
                      stackIn_65_1 = stackOut_64_1;
                      break L18;
                    } else {
                      stackOut_63_0 = stackIn_63_0;
                      stackOut_63_1 = 0;
                      stackIn_65_0 = stackOut_63_0;
                      stackIn_65_1 = stackOut_63_1;
                      break L18;
                    }
                  }
                  L19: {
                    var8 = stackIn_65_0 + stackIn_65_1;
                    if (rj.field_a != 0) {
                      var9 = (kf.field_b + -16) / 26;
                      var10 = (fg.field_a - 48) / 26;
                      if (-1 < (var10 ^ -1)) {
                        break L19;
                      } else {
                        if (var9 < 0) {
                          break L19;
                        } else {
                          if (16 <= var10) {
                            break L19;
                          } else {
                            if (16 <= var9) {
                              break L19;
                            } else {
                              L20: {
                                if ((var10 ^ -1) == (((ri) this).field_D ^ -1)) {
                                  break L20;
                                } else {
                                  if ((((ri) this).field_Z ^ -1) != (var9 ^ -1)) {
                                    break L19;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                              if (38 != ((ri) this).field_d[var10][var9]) {
                                ((ri) this).field_x = var9;
                                ((ri) this).field_G = var10;
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      break L19;
                    }
                  }
                  L21: {
                    if ((((ri) this).field_G ^ -1) < 0) {
                      L22: {
                        if ((((ri) this).field_D ^ -1) > (((ri) this).field_G ^ -1)) {
                          stackOut_83_0 = 1;
                          stackIn_84_0 = stackOut_83_0;
                          break L22;
                        } else {
                          if ((((ri) this).field_D ^ -1) >= (((ri) this).field_G ^ -1)) {
                            stackOut_82_0 = 0;
                            stackIn_84_0 = stackOut_82_0;
                            break L22;
                          } else {
                            stackOut_81_0 = -1;
                            stackIn_84_0 = stackOut_81_0;
                            break L22;
                          }
                        }
                      }
                      L23: {
                        var9 = stackIn_84_0;
                        if ((((ri) this).field_Z ^ -1) <= (((ri) this).field_x ^ -1)) {
                          if ((((ri) this).field_x ^ -1) <= (((ri) this).field_Z ^ -1)) {
                            stackOut_88_0 = 0;
                            stackIn_89_0 = stackOut_88_0;
                            break L23;
                          } else {
                            stackOut_87_0 = -1;
                            stackIn_89_0 = stackOut_87_0;
                            break L23;
                          }
                        } else {
                          stackOut_85_0 = 1;
                          stackIn_89_0 = stackOut_85_0;
                          break L23;
                        }
                      }
                      L24: {
                        L25: {
                          var10 = stackIn_89_0;
                          if ((var7_int * var9 ^ -1) > -1) {
                            break L25;
                          } else {
                            if (0 > var10 * var8) {
                              break L25;
                            } else {
                              if (0 != var7_int * var10) {
                                break L25;
                              } else {
                                if (var9 * var8 != 0) {
                                  break L25;
                                } else {
                                  break L24;
                                }
                              }
                            }
                          }
                        }
                        var9 = 0;
                        ((ri) this).field_x = -1;
                        var10 = 0;
                        ((ri) this).field_G = -1;
                        break L24;
                      }
                      L26: {
                        if ((var8 ^ -1) != -1) {
                          break L26;
                        } else {
                          var8 = var10;
                          break L26;
                        }
                      }
                      if (-1 == (var7_int ^ -1)) {
                        var7_int = var9;
                        break L21;
                      } else {
                        break L21;
                      }
                    } else {
                      break L21;
                    }
                  }
                  L27: {
                    if (((ri) this).field_x != -1) {
                      if ((((ri) this).field_Z ^ -1) > (((ri) this).field_x ^ -1)) {
                        ((ri) this).field_ab = da.field_p[16][0];
                        break L27;
                      } else {
                        if (((ri) this).field_x >= ((ri) this).field_Z) {
                          if ((((ri) this).field_G ^ -1) >= (((ri) this).field_D ^ -1)) {
                            ((ri) this).field_ab = da.field_p[24][0];
                            break L27;
                          } else {
                            ((ri) this).field_ab = da.field_p[8][0];
                            break L27;
                          }
                        } else {
                          ((ri) this).field_ab = da.field_p[0][0];
                          break L27;
                        }
                      }
                    } else {
                      ((ri) this).field_ab = null;
                      break L27;
                    }
                  }
                  L28: {
                    L29: {
                      L30: {
                        var9 = ((ri) this).field_o[((ri) this).field_D][((ri) this).field_Z];
                        if (0 != var7_int) {
                          break L30;
                        } else {
                          if (var9 == 6) {
                            break L29;
                          } else {
                            if ((var9 ^ -1) == -6) {
                              break L29;
                            } else {
                              break L30;
                            }
                          }
                        }
                      }
                      if (var8 != 0) {
                        break L28;
                      } else {
                        if (var9 == 4) {
                          break L29;
                        } else {
                          if (var9 != 3) {
                            break L28;
                          } else {
                            break L29;
                          }
                        }
                      }
                    }
                    var6 = 1;
                    break L28;
                  }
                  L31: {
                    L32: {
                      L33: {
                        stackOut_118_0 = var6;
                        stackIn_121_0 = stackOut_118_0;
                        stackIn_119_0 = stackOut_118_0;
                        if (4 != var9) {
                          break L33;
                        } else {
                          stackOut_119_0 = stackIn_119_0;
                          stackIn_130_0 = stackOut_119_0;
                          stackIn_120_0 = stackOut_119_0;
                          if ((var8 ^ -1) == -2) {
                            break L32;
                          } else {
                            stackOut_120_0 = stackIn_120_0;
                            stackIn_121_0 = stackOut_120_0;
                            break L33;
                          }
                        }
                      }
                      L34: {
                        stackOut_121_0 = stackIn_121_0;
                        stackIn_124_0 = stackOut_121_0;
                        stackIn_122_0 = stackOut_121_0;
                        if (-4 != (var9 ^ -1)) {
                          break L34;
                        } else {
                          stackOut_122_0 = stackIn_122_0;
                          stackIn_130_0 = stackOut_122_0;
                          stackIn_123_0 = stackOut_122_0;
                          if (-1 == var8) {
                            break L32;
                          } else {
                            stackOut_123_0 = stackIn_123_0;
                            stackIn_124_0 = stackOut_123_0;
                            break L34;
                          }
                        }
                      }
                      L35: {
                        stackOut_124_0 = stackIn_124_0;
                        stackIn_127_0 = stackOut_124_0;
                        stackIn_125_0 = stackOut_124_0;
                        if (var9 != 5) {
                          break L35;
                        } else {
                          stackOut_125_0 = stackIn_125_0;
                          stackIn_130_0 = stackOut_125_0;
                          stackIn_126_0 = stackOut_125_0;
                          if (var7_int == -1) {
                            break L32;
                          } else {
                            stackOut_126_0 = stackIn_126_0;
                            stackIn_127_0 = stackOut_126_0;
                            break L35;
                          }
                        }
                      }
                      L36: {
                        stackOut_127_0 = stackIn_127_0;
                        stackIn_131_0 = stackOut_127_0;
                        stackIn_128_0 = stackOut_127_0;
                        if (var9 != 6) {
                          break L36;
                        } else {
                          stackOut_128_0 = stackIn_128_0;
                          stackIn_131_0 = stackOut_128_0;
                          stackIn_129_0 = stackOut_128_0;
                          if (1 != var7_int) {
                            break L36;
                          } else {
                            stackOut_129_0 = stackIn_129_0;
                            stackIn_130_0 = stackOut_129_0;
                            break L32;
                          }
                        }
                      }
                      stackOut_131_0 = stackIn_131_0;
                      stackOut_131_1 = 0;
                      stackIn_132_0 = stackOut_131_0;
                      stackIn_132_1 = stackOut_131_1;
                      break L31;
                    }
                    stackOut_130_0 = stackIn_130_0;
                    stackOut_130_1 = 1;
                    stackIn_132_0 = stackOut_130_0;
                    stackIn_132_1 = stackOut_130_1;
                    break L31;
                  }
                  L37: {
                    var6 = stackIn_132_0 | stackIn_132_1;
                    if (var6 == 0) {
                      break L37;
                    } else {
                      L38: {
                        if (-5 == (var9 ^ -1)) {
                          break L38;
                        } else {
                          if (-4 != (var9 ^ -1)) {
                            var7_int = 0;
                            break L37;
                          } else {
                            break L38;
                          }
                        }
                      }
                      var8 = 0;
                      break L37;
                    }
                  }
                  L39: {
                    if (0 != ((ri) this).field_b) {
                      break L39;
                    } else {
                      ((ri) this).field_b = 1;
                      break L39;
                    }
                  }
                  L40: {
                    L41: {
                      if (-1 == (var7_int ^ -1)) {
                        break L41;
                      } else {
                        if ((var8 ^ -1) != -1) {
                          break L41;
                        } else {
                          ((ri) this).field_N = (2 - var7_int) * 32 / 4;
                          break L40;
                        }
                      }
                    }
                    if ((var8 ^ -1) != -1) {
                      ((ri) this).field_N = 32 * (1 + var8) / 4;
                      break L40;
                    } else {
                      if (var6 == 0) {
                        ((ri) this).field_b = 0;
                        break L40;
                      } else {
                        var10 = var9;
                        if (-5 == (var10 ^ -1)) {
                          ((ri) this).field_N = 16;
                          break L40;
                        } else {
                          if (3 != var10) {
                            if (-7 != (var10 ^ -1)) {
                              if (-6 == (var10 ^ -1)) {
                                ((ri) this).field_N = 24;
                                break L40;
                              } else {
                                throw new IllegalStateException();
                              }
                            } else {
                              ((ri) this).field_N = 8;
                              break L40;
                            }
                          } else {
                            ((ri) this).field_N = 0;
                            break L40;
                          }
                        }
                      }
                    }
                  }
                  if (this.a(false, var8, var7_int)) {
                    L42: {
                      var10 = ((ri) this).field_D - -var7_int;
                      var11 = var8 + ((ri) this).field_Z;
                      var12 = ((ri) this).field_d[var10][var11] & 32640;
                      if ((((ri) this).field_d[var10][var11] ^ -1) == -1) {
                        break L42;
                      } else {
                        if (var12 == 0) {
                          L43: {
                            L44: {
                              si.a((byte) -68, 6);
                              if (this.a(((ri) this).field_d, var11, 21278, var10 - 1) != 0) {
                                break L44;
                              } else {
                                if (0 != this.a(((ri) this).field_d, var11, 21278, var10 + 1)) {
                                  break L44;
                                } else {
                                  if ((this.a(((ri) this).field_d, var11 - 1, 21278, var10) ^ -1) != -1) {
                                    break L44;
                                  } else {
                                    if (this.a(((ri) this).field_d, var11 - -1, 21278, var10) == 0) {
                                      stackOut_171_0 = 0;
                                      stackIn_172_0 = stackOut_171_0;
                                      break L43;
                                    } else {
                                      break L44;
                                    }
                                  }
                                }
                              }
                            }
                            stackOut_170_0 = 1;
                            stackIn_172_0 = stackOut_170_0;
                            break L43;
                          }
                          L45: {
                            var13 = stackIn_172_0;
                            if (var13 == 0) {
                              break L45;
                            } else {
                              var14_int = 1;
                              var15 = (me) (Object) var4.b(2);
                              L46: while (true) {
                                if (var15 == null) {
                                  var15 = (me) (Object) var5.b(2);
                                  L47: while (true) {
                                    if (var15 == null) {
                                      if (var14_int != 0) {
                                        vd.b(0, 11, 23636);
                                        break L45;
                                      } else {
                                        break L45;
                                      }
                                    } else {
                                      L48: {
                                        if (var15.field_s != var10) {
                                          break L48;
                                        } else {
                                          if (var15.field_r == var11) {
                                            var14_int = 0;
                                            break L48;
                                          } else {
                                            break L48;
                                          }
                                        }
                                      }
                                      var15 = (me) (Object) var5.a(10);
                                      continue L47;
                                    }
                                  }
                                } else {
                                  L49: {
                                    if (var10 != var15.field_s) {
                                      break L49;
                                    } else {
                                      if ((var11 ^ -1) != (var15.field_r ^ -1)) {
                                        break L49;
                                      } else {
                                        var14_int = 0;
                                        break L49;
                                      }
                                    }
                                  }
                                  var15 = (me) (Object) var4.a(10);
                                  continue L46;
                                }
                              }
                            }
                          }
                          L50: {
                            this.a(var8, var10, 1, var7_int, var11, (byte) 103);
                            if (0 != (((ri) this).field_G ^ -1)) {
                              ((ri) this).field_r = var8 + ((ri) this).field_x;
                              ((ri) this).field_U = var7_int + ((ri) this).field_G;
                              break L50;
                            } else {
                              break L50;
                            }
                          }
                          ((ri) this).field_K = true;
                          var14 = (me) (Object) var4.b(2);
                          L51: while (true) {
                            if (var14 == null) {
                              break L42;
                            } else {
                              L52: {
                                if (var14.field_s != var10) {
                                  break L52;
                                } else {
                                  if ((var11 ^ -1) != (var14.field_r ^ -1)) {
                                    break L52;
                                  } else {
                                    var14.a(-78);
                                    break L52;
                                  }
                                }
                              }
                              var14 = (me) (Object) var4.a(10);
                              continue L51;
                            }
                          }
                        } else {
                          break L42;
                        }
                      }
                    }
                    L53: {
                      stackOut_198_0 = this;
                      stackOut_198_1 = var8;
                      stackOut_198_2 = ((ri) this).field_D;
                      stackIn_200_0 = stackOut_198_0;
                      stackIn_200_1 = stackOut_198_1;
                      stackIn_200_2 = stackOut_198_2;
                      stackIn_199_0 = stackOut_198_0;
                      stackIn_199_1 = stackOut_198_1;
                      stackIn_199_2 = stackOut_198_2;
                      if ((((ri) this).field_d[var10][var11] ^ -1) != -1) {
                        stackOut_200_0 = this;
                        stackOut_200_1 = stackIn_200_1;
                        stackOut_200_2 = stackIn_200_2;
                        stackOut_200_3 = 1;
                        stackIn_201_0 = stackOut_200_0;
                        stackIn_201_1 = stackOut_200_1;
                        stackIn_201_2 = stackOut_200_2;
                        stackIn_201_3 = stackOut_200_3;
                        break L53;
                      } else {
                        stackOut_199_0 = this;
                        stackOut_199_1 = stackIn_199_1;
                        stackOut_199_2 = stackIn_199_2;
                        stackOut_199_3 = 2;
                        stackIn_201_0 = stackOut_199_0;
                        stackIn_201_1 = stackOut_199_1;
                        stackIn_201_2 = stackOut_199_2;
                        stackIn_201_3 = stackOut_199_3;
                        break L53;
                      }
                    }
                    this.a(stackIn_201_1, stackIn_201_2, stackIn_201_3, var7_int, ((ri) this).field_Z, (byte) -121);
                    ((ri) this).field_z = true;
                    si.a((byte) -68, 8);
                    break L12;
                  } else {
                    if (-1 != (rj.field_a ^ -1)) {
                      break L12;
                    } else {
                      ((ri) this).field_x = -1;
                      ((ri) this).field_G = -1;
                      break L12;
                    }
                  }
                } else {
                  break L12;
                }
              }
              var7 = (me) (Object) var4.b(2);
              L54: while (true) {
                if (var7 == null) {
                  var7_ref = (oc) (Object) ((ri) this).field_M.b(2);
                  L55: while (true) {
                    if (var7_ref == null) {
                      var7 = (me) (Object) var5.b(2);
                      L56: while (true) {
                        L57: {
                          if (var7 == null) {
                            break L57;
                          } else {
                            L58: {
                              if (0 != (32640 & ((ri) this).field_d[var7.field_s][var7.field_r])) {
                                break L58;
                              } else {
                                L59: {
                                  if (-1 != (this.a(((ri) this).field_d, var7.field_r, 21278, var7.field_s - 1) ^ -1)) {
                                    break L59;
                                  } else {
                                    if (this.a(((ri) this).field_d, var7.field_r, 21278, 1 + var7.field_s) != 0) {
                                      break L59;
                                    } else {
                                      if (0 != this.a(((ri) this).field_d, var7.field_r + -1, 21278, var7.field_s)) {
                                        break L59;
                                      } else {
                                        if (this.a(((ri) this).field_d, 1 + var7.field_r, 21278, var7.field_s) == 0) {
                                          break L58;
                                        } else {
                                          break L59;
                                        }
                                      }
                                    }
                                  }
                                }
                                vd.b(0, 7, 23636);
                                break L57;
                              }
                            }
                            var7 = (me) (Object) var5.a(10);
                            continue L56;
                          }
                        }
                        L60: {
                          if (this.d(102)) {
                            this.b(247, 2);
                            break L60;
                          } else {
                            break L60;
                          }
                        }
                        return;
                      }
                    } else {
                      L61: {
                        var8 = var7_ref.field_l >> 766903800 & 255;
                        var9 = (var7_ref.field_l & 16760288) >> -678192976;
                        if (((ri) this).field_d[var8][var9] == 0) {
                          break L61;
                        } else {
                          if (-1 != (32640 & ((ri) this).field_d[var8][var9] ^ -1)) {
                            break L61;
                          } else {
                            var10 = (byte)(var7_ref.field_l >> -1710616408);
                            var11 = (byte)var7_ref.field_l;
                            var12 = var8 + var10;
                            var13 = var9 + var11;
                            if (!this.a(var11, var10, 86, var13, var12)) {
                              break L61;
                            } else {
                              L62: {
                                if (((ri) this).field_d[var8][var9] != 38) {
                                  break L62;
                                } else {
                                  if (var6 != 0) {
                                    break L61;
                                  } else {
                                    break L62;
                                  }
                                }
                              }
                              this.a(var11, var8, 1, var10, var9, (byte) -90);
                              break L61;
                            }
                          }
                        }
                      }
                      var7_ref = (oc) (Object) ((ri) this).field_M.a(10);
                      continue L55;
                    }
                  }
                } else {
                  L63: {
                    if (this.a(var7.field_o, var7.field_j, 99, var7.field_o + var7.field_r, var7.field_j + var7.field_s)) {
                      ((ri) this).field_S.a((byte) -125, (fc) (Object) var7);
                      this.a((byte) -91, var7);
                      si.a((byte) -68, 9);
                      break L63;
                    } else {
                      var5.a((byte) -113, (fc) (Object) var7);
                      break L63;
                    }
                  }
                  var7 = (me) (Object) var4.a(10);
                  continue L54;
                }
              }
            } else {
              this.a(var5, 3098, var4, var18);
              var18 = (me) (Object) ((ri) this).field_S.a(10);
              continue L8;
            }
          }
        } else {
          this.a(150, param0);
          return;
        }
    }

    private final void b(boolean param0, int param1) {
        Object var3 = null;
        int var4 = 0;
        me var5 = null;
        int var6 = 0;
        L0: {
          var6 = TrackController.field_F ? 1 : 0;
          if (((ri) this).field_I.field_x == 1) {
            break L0;
          } else {
            if (-4 != ((ri) this).field_I.field_x) {
              return;
            } else {
              break L0;
            }
          }
        }
        if (-2 == ((ri) this).field_J) {
          if ((((ri) this).field_I.field_x ^ -1) == -4) {
            L1: {
              L2: {
                if (((ri) this).field_D == -2) {
                  var3 = (Object) (Object) (me) (Object) ((ri) this).field_S.b(2);
                  L3: while (true) {
                    if (var3 == null) {
                      break L1;
                    } else {
                      L4: {
                        if (38 == ((me) var3).field_m) {
                          if (((me) var3).field_r != 12) {
                            break L2;
                          } else {
                            if (-1 == (((me) var3).field_o ^ -1)) {
                              break L4;
                            } else {
                              return;
                            }
                          }
                        } else {
                          break L4;
                        }
                      }
                      var3 = (Object) (Object) (me) (Object) ((ri) this).field_S.a(10);
                      continue L3;
                    }
                  }
                } else {
                  if (((ri) this).field_D > 11) {
                    break L2;
                  } else {
                    if (((ri) this).field_Z == 12) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
              }
              return;
            }
            cl.a(nd.field_L, 58, 98, 376, 332, 4);
            int discarded$3 = bk.field_E.a(ki.field_a, 73, -bk.field_E.field_G + 386 + bk.field_E.field_G, 302, 1000, 5, -1, 0, 0, 26);
            return;
          } else {
            L5: {
              var3 = null;
              var4 = 0;
              var5 = (me) (Object) ((ri) this).field_S.b(2);
              if (param1 == -28786) {
                break L5;
              } else {
                ((ri) this).field_ab = null;
                break L5;
              }
            }
            L6: while (true) {
              if (var5 == null) {
                L7: {
                  L8: {
                    if (((ri) this).field_d[11][8] == 13) {
                      break L8;
                    } else {
                      if (13 == ((ri) this).field_d[9][8]) {
                        break L8;
                      } else {
                        if (13 == ((ri) this).field_d[7][8]) {
                          break L8;
                        } else {
                          if (-14 == (((ri) this).field_d[11][7] ^ -1)) {
                            break L8;
                          } else {
                            if ((((ri) this).field_d[4][7] ^ -1) == -14) {
                              break L8;
                            } else {
                              if (var4 == 0) {
                                if (((ri) this).field_z) {
                                  if (((ri) this).field_d[9][9] != 0) {
                                    if (0 == ((ri) this).field_d[7][9]) {
                                      L9: {
                                        if (!param0) {
                                          break L9;
                                        } else {
                                          if (15 <= ((ri) this).field_h % 30) {
                                            break L9;
                                          } else {
                                            ii.field_r[50].e(((ri) this).field_a - -182, 182 + ((ri) this).field_f);
                                            break L9;
                                          }
                                        }
                                      }
                                      if (param0) {
                                        break L7;
                                      } else {
                                        var3 = (Object) (Object) jk.field_b;
                                        break L7;
                                      }
                                    } else {
                                      L10: {
                                        if (((ri) this).field_d[5][8] == 0) {
                                          break L10;
                                        } else {
                                          if (((ri) this).field_d[4][8] == 0) {
                                            break L10;
                                          } else {
                                            break L7;
                                          }
                                        }
                                      }
                                      if (!param0) {
                                        var3 = (Object) (Object) sk.field_g;
                                        break L7;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  } else {
                                    L11: {
                                      if (!param0) {
                                        break L11;
                                      } else {
                                        if (-16 >= (((ri) this).field_h % 30 ^ -1)) {
                                          break L11;
                                        } else {
                                          ii.field_r[50].e(182 + ((ri) this).field_a, ((ri) this).field_f + 234);
                                          break L11;
                                        }
                                      }
                                    }
                                    if (!param0) {
                                      var3 = (Object) (Object) va.field_a;
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                } else {
                                  if (param0) {
                                    break L7;
                                  } else {
                                    var3 = (Object) (Object) ej.field_b;
                                    break L7;
                                  }
                                }
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  if (!param0) {
                    var3 = (Object) (Object) wa.field_n;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                L12: {
                  if (var3 != null) {
                    cl.a(nd.field_L, 110, 98, 376, 228, 4);
                    int discarded$4 = bk.field_E.a((String) var3, 125, -bk.field_E.field_G + (bk.field_E.field_G + 386), 198, 1000, 5, -1, 0, 0, 26);
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (-2 != (((ri) this).field_I.field_x ^ -1)) {
                    break L13;
                  } else {
                    if (param0) {
                      break L13;
                    } else {
                      if (!fi.field_i) {
                        cl.a(nd.field_L, 58, 72, 64, 332, 4);
                        int discarded$5 = bk.field_E.a(uk.field_d, 73, -bk.field_E.field_G + 74 - -bk.field_E.field_G, 302, 1000, 5, -1, 0, 0, 26);
                        break L13;
                      } else {
                        break L13;
                      }
                    }
                  }
                }
                return;
              } else {
                L14: {
                  if (-14 != (var5.field_m ^ -1)) {
                    break L14;
                  } else {
                    if (var5.field_s != 11) {
                      break L14;
                    } else {
                      if (7 == var5.field_r) {
                        var4 = 1;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                  }
                }
                var5 = (me) (Object) ((ri) this).field_S.a(10);
                continue L6;
              }
            }
          }
        } else {
          return;
        }
    }

    private final boolean a(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        L0: {
          if (param4 < 0) {
            break L0;
          } else {
            if (-17 >= (param4 ^ -1)) {
              break L0;
            } else {
              if (-1 < (param3 ^ -1)) {
                break L0;
              } else {
                if ((param3 ^ -1) <= -17) {
                  break L0;
                } else {
                  if ((((ri) this).field_o[param4][param3] ^ -1) == -3) {
                    break L0;
                  } else {
                    L1: {
                      if (0 != param1) {
                        break L1;
                      } else {
                        if (0 != param0) {
                          break L1;
                        } else {
                          return false;
                        }
                      }
                    }
                    if (param2 >= 79) {
                      L2: {
                        L3: {
                          if (0 == ((ri) this).field_d[param4][param3]) {
                            break L3;
                          } else {
                            if ((((ri) this).field_d[param4][param3] & 32640) != this.b(16384, param0, param1)) {
                              stackOut_15_0 = 0;
                              stackIn_16_0 = stackOut_15_0;
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        stackOut_14_0 = 1;
                        stackIn_16_0 = stackOut_14_0;
                        break L2;
                      }
                      return stackIn_16_0 != 0;
                    } else {
                      return true;
                    }
                  }
                }
              }
            }
          }
        }
        return false;
    }

    final boolean c(int param0) {
        if (param0 > -120) {
            return true;
        }
        return 2 == ((ri) this).field_J ? true : false;
    }

    final void a(ea param0, int param1) {
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        Object stackOut_3_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        Object stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        L0: {
          if (null == bc.field_c) {
            bc.field_c = new int[][]{new int[8], new int[8], new int[8], new int[8], new int[8], new int[8], new int[8], new int[8]};
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          stackOut_3_0 = this;
          stackIn_5_0 = stackOut_3_0;
          stackIn_4_0 = stackOut_3_0;
          if (param0 == ((ri) this).field_I) {
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
        ((ri) this).field_F = stackIn_6_1 != 0;
        ((ri) this).field_I = param0;
        super.a(param0, 107);
        ((ri) this).field_D = param0.a(-8299);
        ((ri) this).field_Z = param0.c((byte) 107);
        ((ri) this).field_w = this.b(((ri) this).field_i, (byte) -66);
        ((ri) this).field_h = 0;
        this.b(247, 1);
        ((ri) this).field_x = -1;
        if (param1 >= 36) {
          ((ri) this).field_r = -1;
          ((ri) this).field_X = param0.field_r * 50;
          ((ri) this).field_U = -1;
          ((ri) this).field_s = 0;
          ((ri) this).field_q = param0.field_v << 1768358113;
          ((ri) this).field_G = -1;
          ((ri) this).field_S = new ja();
          ((ri) this).field_M = this.i(123);
          ((ri) this).field_u = null;
          ((ri) this).field_t = -1000;
          vl.n(-27145);
          vg.field_p = true;
          ((ri) this).field_A.field_e = 0;
          ((ri) this).field_z = false;
          fe.a(true, pf.field_P[1], 256);
          return;
        } else {
          return;
        }
    }

    private final int a(int[][] param0, byte param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = TrackController.field_F ? 1 : 0;
        int var3 = param0.length;
        int var4 = param0[0].length;
        for (var5 = 0; var4 > var5; var5++) {
            for (var6 = 0; var3 > var6; var6++) {
                if (!(this.a((byte) 115, param0[var6][var5]) == 0)) {
                    return var5;
                }
            }
        }
        if (param1 >= -67) {
            return -68;
        }
        throw new IllegalStateException();
    }

    final void a(boolean param0) {
        cl.a(nd.field_L, 457, 124, 10, 176, 4);
        bk.field_E.c(nj.field_d, 471, 40, 5, -1);
        bk.field_E.a(Integer.toString(((ri) this).field_T), 622, 40, 5, -1);
        bk.field_E.c(ba.field_e, 471, 66, 5, -1);
        bk.field_E.a(Integer.toString(((ri) this).field_q >> 1665744673), 622, 66, 5, -1);
        bk.field_E.c(hb.field_c, 471, 92, 5, -1);
        bk.field_E.a(Integer.toString(((ri) this).field_X >> 322884033), 622, 92, 5, -1);
        if (param0) {
            return;
        }
        bk.field_E.c(ra.field_r + ((ri) this).field_I.field_x + u.field_k, 471, 118, 5, -1);
        bk.field_E.a(((ri) this).field_I.field_q, 622, 118, 5, -1);
    }

    private final ja i(int param0) {
        ja var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = TrackController.field_F ? 1 : 0;
          if (param0 >= 102) {
            break L0;
          } else {
            int discarded$2 = this.a((int[][]) null, -88, -65, 122);
            break L0;
          }
        }
        var2 = new ja();
        var3 = 0;
        L1: while (true) {
          if (-17 >= (var3 ^ -1)) {
            return var2;
          } else {
            var4 = 0;
            L2: while (true) {
              if ((var4 ^ -1) <= -17) {
                var3++;
                continue L1;
              } else {
                L3: {
                  var5 = 0;
                  var6 = 0;
                  var7 = ((ri) this).field_o[var3][var4];
                  if (var7 != 4) {
                    if ((var7 ^ -1) == -4) {
                      var6 = 1;
                      break L3;
                    } else {
                      if (6 != var7) {
                        if (var7 == 5) {
                          var5 = 1;
                          break L3;
                        } else {
                          break L3;
                        }
                      } else {
                        var5 = -1;
                        break L3;
                      }
                    }
                  } else {
                    var6 = -1;
                    break L3;
                  }
                }
                L4: {
                  if (0 != var5) {
                    break L4;
                  } else {
                    if (0 != var6) {
                      break L4;
                    } else {
                      var4++;
                      continue L2;
                    }
                  }
                }
                var2.a((byte) -98, (fc) (Object) new oc(var3 << -1426453864 | var4 << 1566851536 | var5 << 292740840 & 65280 | 255 & var6));
                var4++;
                continue L2;
              }
            }
          }
        }
    }

    final static boolean a(byte param0, String param1, String param2) {
        if (sd.a(param1, (byte) 89)) {
            return false;
        }
        if (!(!ba.a(param1, false))) {
            return false;
        }
        if (ac.a(param1, -23797)) {
            return false;
        }
        if (!(param2.length() != 0)) {
            return true;
        }
        if (param0 != 56) {
            ri.a(106);
        }
        if (!(!cb.a(param2, param1, (byte) 96))) {
            return false;
        }
        if (rh.a(19438, param2, param1)) {
            return false;
        }
        if (ui.a(param1, param2, (byte) 100)) {
            return false;
        }
        return true;
    }

    final void h(int param0) {
        int var2_int = 0;
        me var2 = null;
        String var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        L0: {
          var7 = TrackController.field_F ? 1 : 0;
          cl.a(ha.field_m, 6, 436, 38, 436, 4);
          al.field_z[0].e(41, 1);
          if (null == ((ri) this).field_u) {
            L1: {
              this.b(true, param0 + -53447);
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (((ri) this).field_z) {
                stackOut_6_0 = this;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L1;
              } else {
                stackOut_5_0 = this;
                stackOut_5_1 = 1;
                stackIn_7_0 = stackOut_5_0;
                stackIn_7_1 = stackOut_5_1;
                break L1;
              }
            }
            L2: {
              L3: {
                super.a(stackIn_7_1 != 0, 0, true);
                fd.field_d.e(0, 0);
                var2_int = kf.field_b - 467;
                var3 = fg.field_a + -138;
                if ((var2_int ^ -1) > -1) {
                  break L3;
                } else {
                  if ((26 + ba.field_b.field_G ^ -1) >= (var3 ^ -1)) {
                    break L3;
                  } else {
                    if (var2_int >= 156) {
                      break L3;
                    } else {
                      if (-1 < (var3 ^ -1)) {
                        break L3;
                      } else {
                        al.field_t.e(0, 0);
                        break L2;
                      }
                    }
                  }
                }
              }
              ai.field_a.e(0, 0);
              break L2;
            }
            L4: {
              var3 = fg.field_a + -178;
              if (-1 < (var2_int ^ -1)) {
                break L4;
              } else {
                if ((var3 ^ -1) <= (ba.field_b.field_G + 26 ^ -1)) {
                  break L4;
                } else {
                  if ((var2_int ^ -1) <= -157) {
                    break L4;
                  } else {
                    if (-1 >= (var3 ^ -1)) {
                      vl.field_K.e(0, 0);
                      break L0;
                    } else {
                      break L4;
                    }
                  }
                }
              }
            }
            bf.field_o.e(0, 0);
            break L0;
          } else {
            ((ri) this).field_u.a(true);
            this.f(-111);
            var2_int = Math.min(255, -((ri) this).field_v + ((ri) this).field_h << 607914114);
            ((ri) this).a(467, (byte) -121, (((ri) this).field_h + -((ri) this).field_v << -834499806) + 229);
            var3 = 255 + -var2_int;
            fd.field_d.e(0, -((ri) this).field_v + ((ri) this).field_h << 432193986);
            if ((var3 ^ -1) < -1) {
              ai.field_a.d(0, 0, var3);
              bf.field_o.d(0, 0, var3);
              break L0;
            } else {
              break L0;
            }
          }
        }
        L5: {
          ((ri) this).a(false);
          if (param0 == 24661) {
            break L5;
          } else {
            ri.a(11);
            break L5;
          }
        }
        var2 = (me) (Object) ((ri) this).field_S.b(2);
        L6: while (true) {
          if (var2 == null) {
            L7: {
              if ((((ri) this).field_J ^ -1) != -2) {
                break L7;
              } else {
                if (((ri) this).field_G != -1) {
                  ((ri) this).field_ab.d(16 + ((ri) this).field_x * 26, ((ri) this).field_G * 26 + 48, 127);
                  if (((ri) this).field_U != -1) {
                    ii.field_r[51].d(16 + ((ri) this).field_r * 26, 48 + ((ri) this).field_U * 26, 127);
                    break L7;
                  } else {
                    break L7;
                  }
                } else {
                  break L7;
                }
              }
            }
            L8: {
              var2_ref = rh.field_E;
              if (((ri) this).field_I == gj.field_f[gj.field_f.length - 1]) {
                var2_ref = TrackController.field_C;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              var3 = 0;
              if (((ri) this).field_A.field_e == 0) {
                var3 = 1;
                break L9;
              } else {
                break L9;
              }
            }
            L10: {
              if (!((ri) this).field_F) {
                cl.a(nd.field_L, -(-156 + ((ri) this).field_Y >> -1922422559) + -10 + ((ri) this).field_t, 72, ((ri) this).field_C + -10, 20 + ((ri) this).field_Y, param0 + -24657);
                cl.a(gb.field_l, ((ri) this).field_t, 26, 26 + ((ri) this).field_C, 156, 4);
                bk.field_E.b(((ri) this).field_y, 78 + ((ri) this).field_t, ((ri) this).field_C - -bk.field_E.field_G, 5, -1);
                bk.field_E.b(var2_ref, 78 + ((ri) this).field_t, bk.field_E.field_G + ((ri) this).field_C + 24, var3, -1);
                break L10;
              } else {
                cl.a(nd.field_L, -(((ri) this).field_Y - 156 >> 902339041) + (((ri) this).field_t - 10), 98, -26 + (-10 + ((ri) this).field_C), 20 + ((ri) this).field_Y, 4);
                cl.a(gb.field_l, ((ri) this).field_t, 26, 26 + ((ri) this).field_C, 156, param0 + -24657);
                bk.field_E.b(((ri) this).field_y, 78 + ((ri) this).field_t, ((ri) this).field_C + bk.field_E.field_G - 26, 5, -1);
                bk.field_E.b(((ri) this).field_L, ((ri) this).field_t - -78, bk.field_E.field_G + ((ri) this).field_C, 5, -1);
                bk.field_E.b(var2_ref, 78 + ((ri) this).field_t, ((ri) this).field_C + (26 + (bk.field_E.field_G + -2)), var3, -1);
                break L10;
              }
            }
            L11: {
              this.b(false, -28786);
              if (ak.field_b == -1) {
                break L11;
              } else {
                vl.a(-21173, ag.field_c[ak.field_b]);
                break L11;
              }
            }
            return;
          } else {
            L12: {
              var3 = var2.field_o * var2.field_l + 26 * var2.field_r + 16;
              var4 = var2.field_j * var2.field_l + (var2.field_s * 26 + 48);
              if (-39 == (var2.field_m ^ -1)) {
                L13: {
                  L14: {
                    var5 = ((ri) this).field_b / 3 % 4;
                    stackOut_28_0 = ((ri) this).field_l;
                    stackIn_31_0 = stackOut_28_0;
                    stackIn_29_0 = stackOut_28_0;
                    if (((ri) this).field_K) {
                      break L14;
                    } else {
                      stackOut_29_0 = stackIn_29_0;
                      stackIn_32_0 = stackOut_29_0;
                      stackIn_30_0 = stackOut_29_0;
                      if (!ui.a(0, true)) {
                        stackOut_32_0 = stackIn_32_0;
                        stackOut_32_1 = 0;
                        stackIn_33_0 = stackOut_32_0;
                        stackIn_33_1 = stackOut_32_1;
                        break L13;
                      } else {
                        stackOut_30_0 = stackIn_30_0;
                        stackIn_31_0 = stackOut_30_0;
                        break L14;
                      }
                    }
                  }
                  stackOut_31_0 = stackIn_31_0;
                  stackOut_31_1 = 32;
                  stackIn_33_0 = stackOut_31_0;
                  stackIn_33_1 = stackOut_31_1;
                  break L13;
                }
                var6 = stackIn_33_0 - -stackIn_33_1;
                da.field_p[var6][var5].e(var3, var4);
                break L12;
              } else {
                ii.field_r[-65 & var2.field_m].e(var3, var4);
                if ((var2.field_m & 64 ^ -1) != -1) {
                  ue.a(var3, var2.field_m, (byte) 91, var4);
                  break L12;
                } else {
                  break L12;
                }
              }
            }
            var2 = (me) (Object) ((ri) this).field_S.a(10);
            continue L6;
          }
        }
    }

    final void b(int param0) {
        int var3 = TrackController.field_F ? 1 : 0;
        if (1 == ((ri) this).field_J) {
            wg.b(117);
            ((ri) this).a(((ri) this).field_I, param0 ^ 97);
        } else {
            if (((ri) this).field_J != 2) {
            } else {
                ((ri) this).field_T = Math.abs(((ri) this).field_O);
                hl.a(10, 0);
                ((ri) this).field_R = ((ri) this).field_R + ((ri) this).field_E;
                ((ri) this).field_cb = ((ri) this).field_cb - 1;
                if (((ri) this).field_I.field_x >= gj.field_f.length) {
                    ((ri) this).c(0, 114);
                    sc.field_g = 14;
                } else {
                    ((ri) this).a(gj.field_f[((ri) this).field_I.field_x], param0 ^ 120);
                }
            }
        }
        if (param0 != 0) {
            int discarded$0 = this.a((byte) 32, 84);
        }
    }

    private final void a(int param0, int param1, int param2, int param3, int param4, byte param5) {
        int var7 = 32 % ((-43 - param5) / 41);
        if (!(((ri) this).field_d[param1][param4] != 38)) {
            ((ri) this).field_D = -2;
            ((ri) this).field_Z = -2;
        }
        me var8 = new me(((ri) this).field_d[param1][param4], param1, param4, param3, param0, param2);
        ((ri) this).field_S.a((byte) -122, (fc) (Object) var8);
        this.a((byte) -32, var8);
    }

    private final int a(int[][] param0, int param1) {
        int var5 = 0;
        int var6 = 0;
        int var7 = TrackController.field_F ? 1 : 0;
        int var3 = param0.length;
        int var4 = param0[param1].length;
        for (var5 = 0; var5 < var3; var5++) {
            for (var6 = 0; var6 < var4; var6++) {
                if (this.a((byte) 119, param0[var5][var6]) != 0) {
                    return var5;
                }
            }
        }
        throw new IllegalStateException();
    }

    private final long b(int[][] param0, byte param1) {
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = TrackController.field_F ? 1 : 0;
        var3 = 0L;
        var5 = param0.length;
        var6 = param0[0].length;
        var7 = -1;
        L0: while (true) {
          if (var7 >= var5) {
            var7 = -1;
            L1: while (true) {
              if (var7 >= var6) {
                if (param1 == -66) {
                  return var3;
                } else {
                  return 75L;
                }
              } else {
                var8 = 0;
                L2: while (true) {
                  if (var5 <= var8) {
                    var7++;
                    continue L1;
                  } else {
                    L3: {
                      var9 = this.a(param0, var7, 21278, var8);
                      var10 = this.a(param0, 1 + var7, 21278, var8);
                      if (var9 != 0) {
                        break L3;
                      } else {
                        if (var10 != 0) {
                          break L3;
                        } else {
                          var8++;
                          continue L2;
                        }
                      }
                    }
                    var3 = var3 * 37L + (long)var9 + -(long)var10;
                    var8++;
                    continue L2;
                  }
                }
              }
            }
          } else {
            var8 = 0;
            L4: while (true) {
              if (var6 <= var8) {
                var7++;
                continue L0;
              } else {
                L5: {
                  var9 = this.a(param0, var8, 21278, var7);
                  var10 = this.a(param0, var8, 21278, var7 - -1);
                  if (var9 != 0) {
                    break L5;
                  } else {
                    if (-1 != (var10 ^ -1)) {
                      break L5;
                    } else {
                      var8++;
                      continue L4;
                    }
                  }
                }
                var3 = -(long)var10 + 37L * var3 + (long)var9;
                var8++;
                continue L4;
              }
            }
          }
        }
    }

    private final boolean a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        L0: {
          if (-1 != (param1 ^ -1)) {
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
          if ((param2 ^ -1) != -1) {
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
        if ((stackIn_6_0 ^ stackIn_6_1) != 0) {
          L2: {
            var4 = ((ri) this).field_D + param2;
            var5 = param1 + ((ri) this).field_Z;
            if (0 > var5) {
              break L2;
            } else {
              if (var5 >= 16) {
                break L2;
              } else {
                if (var4 < 0) {
                  break L2;
                } else {
                  if (16 <= var4) {
                    break L2;
                  } else {
                    L3: {
                      if (!param0) {
                        break L3;
                      } else {
                        int discarded$2 = this.a((int[][]) null, -72);
                        break L3;
                      }
                    }
                    if ((((ri) this).field_o[var4][var5] ^ -1) != -3) {
                      L4: {
                        var6 = 32640 & ((ri) this).field_d[var4][var5];
                        if (-1 == (var6 ^ -1)) {
                          break L4;
                        } else {
                          if ((this.b(16384, param1, param2) ^ -1) == (var6 ^ -1)) {
                            break L4;
                          } else {
                            return false;
                          }
                        }
                      }
                      L5: {
                        if (((ri) this).field_d[var4][var5] == 0) {
                          break L5;
                        } else {
                          if (-1 != (var6 ^ -1)) {
                            break L5;
                          } else {
                            if (this.a(param1, param2, 103, param1 + var5, param2 + var4)) {
                              break L5;
                            } else {
                              vd.b(0, 12, 23636);
                              return false;
                            }
                          }
                        }
                      }
                      return true;
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
          }
          return false;
        } else {
          return false;
        }
    }

    private final void a(byte param0, me param1) {
        ((ri) this).field_d[param1.field_s][param1.field_r] = tc.a(ok.a(((ri) this).field_d[param1.field_s][param1.field_r], this.b(16384, param1.field_o, param1.field_j)), 32640);
        if (param0 > 0) {
            ((ri) this).field_r = -66;
        }
        ((ri) this).field_d[param1.field_j + param1.field_s][param1.field_o + param1.field_r] = tc.a(32640, ok.a(((ri) this).field_d[param1.field_s - -param1.field_j][param1.field_r - -param1.field_o], this.b(param1.field_j, (byte) -86, param1.field_o)));
    }

    final void g(int param0) {
        L0: {
          if (param0 > 11) {
            break L0;
          } else {
            ((ri) this).c(100, 98);
            break L0;
          }
        }
        if (-1 <= (((ri) this).field_O ^ -1)) {
          return;
        } else {
          L1: {
            if (jj.s(51)) {
              break L1;
            } else {
              if (rk.field_bb != null) {
                break L1;
              } else {
                g.field_w = null;
                rk.field_bb = sd.a(((ri) this).field_cb, 3, 65525, 10, true, ((ri) this).field_R, ((ri) this).field_bb, new int[1], ((ri) this).field_E);
                return;
              }
            }
          }
          return;
        }
    }

    private final int b(int param0, int param1, int param2) {
        int var4 = 0;
        if (param0 == 16384) {
          var4 = 2 * param1 + param2;
          if ((var4 ^ -1) == 0) {
            return 16384;
          } else {
            if (1 == var4) {
              return 2048;
            } else {
              if (var4 != -2) {
                if (2 == var4) {
                  return 8192;
                } else {
                  throw new IllegalStateException();
                }
              } else {
                return 4096;
              }
            }
          }
        } else {
          return 10;
        }
    }

    private final void c(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4_int = 0;
        me var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = TrackController.field_F ? 1 : 0;
          if (mg.field_a) {
            vg.field_p = false;
            break L0;
          } else {
            break L0;
          }
        }
        ak.field_b = -1;
        var2 = ((ri) this).field_f;
        var3 = 0;
        var4_int = 48 % ((-64 - param0) / 42);
        L1: while (true) {
          if (((ri) this).field_o.length <= var3) {
            L2: {
              if (((ri) this).field_u == null) {
                L3: {
                  if (eb.a(467, fg.field_a, 10, 156, 229, kf.field_b, 208)) {
                    ak.field_b = 5;
                    break L3;
                  } else {
                    if (!eb.a(ai.field_a.field_r, fg.field_a, 10, ai.field_a.field_t, ai.field_a.field_o, kf.field_b, ai.field_a.field_q)) {
                      if (eb.a(bf.field_o.field_r, fg.field_a, 10, bf.field_o.field_t, bf.field_o.field_o, kf.field_b, bf.field_o.field_q)) {
                        ak.field_b = 7;
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      ak.field_b = 6;
                      break L3;
                    }
                  }
                }
                if ((((ri) this).field_I.field_x ^ -1) != -2) {
                  if (3 != ((ri) this).field_I.field_x) {
                    break L2;
                  } else {
                    if (eb.a(68, fg.field_a, 10, 312, 386, kf.field_b, 78)) {
                      L4: {
                        var3 = 1;
                        if (1 == (((ri) this).field_D ^ -1)) {
                          var4 = (me) (Object) ((ri) this).field_S.b(2);
                          L5: while (true) {
                            if (var4 == null) {
                              break L4;
                            } else {
                              L6: {
                                if (-39 == (var4.field_m ^ -1)) {
                                  L7: {
                                    if ((var4.field_r ^ -1) != -13) {
                                      break L7;
                                    } else {
                                      if (-1 == (var4.field_o ^ -1)) {
                                        break L6;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  var3 = 0;
                                  break L6;
                                } else {
                                  break L6;
                                }
                              }
                              var4 = (me) (Object) ((ri) this).field_S.a(10);
                              continue L5;
                            }
                          }
                        } else {
                          L8: {
                            if ((((ri) this).field_D ^ -1) < -12) {
                              break L8;
                            } else {
                              if (((ri) this).field_Z == 12) {
                                break L4;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var3 = 0;
                          break L4;
                        }
                      }
                      if (var3 == 0) {
                        break L2;
                      } else {
                        ak.field_b = 11;
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                } else {
                  if (eb.a(68, fg.field_a, 10, 312, 74, kf.field_b, 52)) {
                    ak.field_b = 11;
                    break L2;
                  } else {
                    if (eb.a(120, fg.field_a, 10, 208, 386, kf.field_b, 78)) {
                      ak.field_b = 11;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              } else {
                break L2;
              }
            }
            L9: {
              if (!eb.a(467, fg.field_a, 10, 156, 20, kf.field_b, 26)) {
                if (!eb.a(467, fg.field_a, 10, 156, 46, kf.field_b, 26)) {
                  if (!eb.a(467, fg.field_a, 10, 156, 72, kf.field_b, 26)) {
                    break L9;
                  } else {
                    ak.field_b = 9;
                    break L9;
                  }
                } else {
                  ak.field_b = 12;
                  break L9;
                }
              } else {
                ak.field_b = 8;
                break L9;
              }
            }
            L10: {
              if (eb.a(467, fg.field_a, 10, 156, 98, kf.field_b, 26)) {
                ak.field_b = 10;
                break L10;
              } else {
                break L10;
              }
            }
            L11: {
              L12: {
                if (vg.field_p) {
                  break L12;
                } else {
                  if (!fi.field_i) {
                    break L11;
                  } else {
                    break L12;
                  }
                }
              }
              ak.field_b = -1;
              break L11;
            }
            qc.a(ak.field_b, (byte) 20);
            return;
          } else {
            var5 = ((ri) this).field_a;
            var6 = 0;
            L13: while (true) {
              if (((ri) this).field_o[0].length <= var6) {
                var2 += 26;
                var3++;
                continue L1;
              } else {
                L14: {
                  if (eb.a(var5, fg.field_a, 10, 26, var2, kf.field_b, 26)) {
                    if (-2 != (((ri) this).field_o[var3][var6] ^ -1)) {
                      if (((ri) this).field_o[var3][var6] != 2) {
                        L15: {
                          if ((((ri) this).field_o[var3][var6] ^ -1) > -4) {
                            break L15;
                          } else {
                            if (-7 <= (((ri) this).field_o[var3][var6] ^ -1)) {
                              ak.field_b = 2;
                              break L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                        L16: {
                          var7 = -65 & ((ri) this).field_d[var3][var6];
                          if ((var7 ^ -1) > -8) {
                            break L16;
                          } else {
                            if ((var7 ^ -1) <= -39) {
                              break L16;
                            } else {
                              ak.field_b = 3;
                              break L14;
                            }
                          }
                        }
                        if ((var7 ^ -1) == -39) {
                          ak.field_b = 4;
                          break L14;
                        } else {
                          break L14;
                        }
                      } else {
                        ak.field_b = 1;
                        break L14;
                      }
                    } else {
                      ak.field_b = 0;
                      break L14;
                    }
                  } else {
                    break L14;
                  }
                }
                var5 += 26;
                var6++;
                continue L13;
              }
            }
          }
        }
    }

    final static void e(int param0) {
        int var1 = 0;
        int var2 = 0;
        L0: {
          var2 = TrackController.field_F ? 1 : 0;
          if (param0 <= -21) {
            break L0;
          } else {
            field_P = -65;
            break L0;
          }
        }
        L1: {
          tk.field_r = null;
          gh.field_k = false;
          if (!vg.field_o) {
            var1 = si.field_d;
            if ((var1 ^ -1) < -1) {
              if ((var1 ^ -1) == -2) {
                tk.field_r = ob.field_x;
                tk.field_r = fi.a(116, new CharSequence[3]);
                kb.field_a.t(20252);
                r.f(-635);
                break L1;
              } else {
                tk.field_r = dh.a((byte) -75, new String[1], be.field_l);
                tk.field_r = fi.a(116, new CharSequence[3]);
                kb.field_a.t(20252);
                r.f(-635);
                break L1;
              }
            } else {
              kb.field_a.t(20252);
              r.f(-635);
              break L1;
            }
          } else {
            kb.field_a.r(44);
            break L1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new int[]{40, 41, 42, 43, 44};
        field_P = 0;
        field_B = new int[8192];
        field_V = 0;
    }
}
