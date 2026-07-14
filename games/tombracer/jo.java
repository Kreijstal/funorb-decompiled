/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jo extends rva implements tsa {
    int field_C;
    private int field_y;
    static String field_K;
    private boolean field_J;
    int field_O;
    private int field_B;
    private int field_I;
    static String field_E;
    private rj field_D;
    private rj field_F;
    private vp field_N;
    private rj field_z;
    private boolean field_P;
    private boolean field_x;
    private rj field_H;
    private int field_G;
    private rj field_L;
    int field_M;
    private int field_A;

    public final void a(int param0, int param1, rj param2, int param3, byte param4) {
        int var7 = 0;
        L0: {
          var7 = TombRacer.field_G ? 1 : 0;
          if (param4 > 44) {
            break L0;
          } else {
            ((jo) this).field_J = true;
            break L0;
          }
        }
        L1: {
          if (param3 != 1) {
            break L1;
          } else {
            if (!((jo) this).field_x) {
              break L1;
            } else {
              L2: {
                if (!((jo) this).field_P) {
                  break L2;
                } else {
                  if (param2 != ((jo) this).field_F) {
                    break L2;
                  } else {
                    this.a(((jo) this).field_O - ((jo) this).field_M, (byte) -91);
                    break L1;
                  }
                }
              }
              L3: {
                if (!((jo) this).field_P) {
                  break L3;
                } else {
                  if (param2 == ((jo) this).field_H) {
                    this.a(((jo) this).field_M + ((jo) this).field_O, (byte) -94);
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!((jo) this).field_J) {
                  break L4;
                } else {
                  if (((jo) this).field_L != param2) {
                    break L4;
                  } else {
                    this.b(13328, -((jo) this).field_A + ((jo) this).field_C);
                    break L1;
                  }
                }
              }
              if (!((jo) this).field_J) {
                break L1;
              } else {
                if (((jo) this).field_z == param2) {
                  this.b(13328, ((jo) this).field_A + ((jo) this).field_C);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
          }
        }
    }

    final void a(byte param0) {
        int var3 = 0;
        L0: {
          var3 = TombRacer.field_G ? 1 : 0;
          if (((jo) this).field_L == null) {
            ((jo) this).field_D.field_i = 0;
            break L0;
          } else {
            ((jo) this).field_L.field_i = 0;
            ((jo) this).field_L.field_n = ((jo) this).field_p + -((jo) this).field_L.field_p >> -1916107615;
            ((jo) this).field_D.field_i = ((jo) this).field_L.field_i + ((jo) this).field_L.field_m;
            break L0;
          }
        }
        L1: {
          if (((jo) this).field_z == null) {
            ((jo) this).field_D.field_m = ((jo) this).field_m + -((jo) this).field_D.field_i;
            break L1;
          } else {
            ((jo) this).field_z.field_i = ((jo) this).field_m + -((jo) this).field_z.field_m;
            ((jo) this).field_z.field_n = -((jo) this).field_z.field_p + ((jo) this).field_p >> 1001194177;
            ((jo) this).field_D.field_m = -((jo) this).field_z.field_m + (((jo) this).field_m - ((jo) this).field_D.field_i);
            break L1;
          }
        }
        L2: {
          this.h((byte) -125);
          if (((jo) this).field_F != null) {
            ((jo) this).field_F.field_i = -((jo) this).field_F.field_m + ((jo) this).field_m >> -1349481183;
            ((jo) this).field_F.field_n = 0;
            ((jo) this).field_D.field_n = ((jo) this).field_F.field_p + ((jo) this).field_F.field_n;
            break L2;
          } else {
            ((jo) this).field_D.field_n = 0;
            break L2;
          }
        }
        if (param0 == 88) {
          L3: {
            if (null != ((jo) this).field_H) {
              ((jo) this).field_H.field_n = -((jo) this).field_H.field_p + ((jo) this).field_p;
              ((jo) this).field_H.field_i = -((jo) this).field_H.field_m + ((jo) this).field_m >> -1482613119;
              ((jo) this).field_D.field_p = -((jo) this).field_D.field_n + (((jo) this).field_p - ((jo) this).field_H.field_p);
              break L3;
            } else {
              ((jo) this).field_D.field_p = ((jo) this).field_p + -((jo) this).field_D.field_n;
              break L3;
            }
          }
          L4: {
            this.e(param0 + -214);
            if (!((jo) this).field_P) {
              ((jo) this).field_N.field_n = 0;
              ((jo) this).field_N.field_p = ((jo) this).field_D.field_p;
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (((jo) this).field_J) {
              break L5;
            } else {
              ((jo) this).field_N.field_i = 0;
              ((jo) this).field_N.field_m = ((jo) this).field_D.field_m;
              break L5;
            }
          }
          ((jo) this).field_N.c((byte) 121);
          return;
        } else {
          return;
        }
    }

    private final void b(int param0, boolean param1) {
        rj stackIn_1_0 = null;
        rj stackIn_2_0 = null;
        rj stackIn_3_0 = null;
        rj stackIn_4_0 = null;
        rj stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        rj stackIn_9_0 = null;
        rj stackIn_10_0 = null;
        rj stackIn_11_0 = null;
        rj stackIn_12_0 = null;
        rj stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        rj stackIn_16_0 = null;
        rj stackIn_17_0 = null;
        rj stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        rj stackIn_22_0 = null;
        rj stackIn_23_0 = null;
        rj stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        rj stackOut_0_0 = null;
        rj stackOut_1_0 = null;
        rj stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        rj stackOut_2_0 = null;
        rj stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        rj stackOut_8_0 = null;
        rj stackOut_9_0 = null;
        rj stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        rj stackOut_10_0 = null;
        rj stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        rj stackOut_15_0 = null;
        rj stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        rj stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        rj stackOut_21_0 = null;
        rj stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        rj stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        L0: {
          L1: {
            stackOut_0_0 = ((jo) this).field_D;
            stackIn_3_0 = stackOut_0_0;
            stackIn_1_0 = stackOut_0_0;
            if (param1) {
              break L1;
            } else {
              stackOut_1_0 = (rj) (Object) stackIn_1_0;
              stackIn_4_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!((jo) this).field_P) {
                stackOut_4_0 = (rj) (Object) stackIn_4_0;
                stackOut_4_1 = 0;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                break L0;
              } else {
                stackOut_2_0 = (rj) (Object) stackIn_2_0;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              }
            }
          }
          stackOut_3_0 = (rj) (Object) stackIn_3_0;
          stackOut_3_1 = 1;
          stackIn_5_0 = stackOut_3_0;
          stackIn_5_1 = stackOut_3_1;
          break L0;
        }
        stackIn_5_0.field_y = stackIn_5_1 != 0;
        if (param0 < -80) {
          L2: {
            if (!(((jo) this).field_N.field_x instanceof rj)) {
              break L2;
            } else {
              L3: {
                L4: {
                  stackOut_8_0 = (rj) (Object) ((jo) this).field_N.field_x;
                  stackIn_11_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (param1) {
                    break L4;
                  } else {
                    stackOut_9_0 = (rj) (Object) stackIn_9_0;
                    stackIn_12_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (!((jo) this).field_P) {
                      stackOut_12_0 = (rj) (Object) stackIn_12_0;
                      stackOut_12_1 = 0;
                      stackIn_13_0 = stackOut_12_0;
                      stackIn_13_1 = stackOut_12_1;
                      break L3;
                    } else {
                      stackOut_10_0 = (rj) (Object) stackIn_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      break L4;
                    }
                  }
                }
                stackOut_11_0 = (rj) (Object) stackIn_11_0;
                stackOut_11_1 = 1;
                stackIn_13_0 = stackOut_11_0;
                stackIn_13_1 = stackOut_11_1;
                break L3;
              }
              stackIn_13_0.field_y = stackIn_13_1 != 0;
              break L2;
            }
          }
          L5: {
            if (((jo) this).field_L == null) {
              break L5;
            } else {
              L6: {
                stackOut_15_0 = ((jo) this).field_L;
                stackIn_17_0 = stackOut_15_0;
                stackIn_16_0 = stackOut_15_0;
                if (!param1) {
                  stackOut_17_0 = (rj) (Object) stackIn_17_0;
                  stackOut_17_1 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  break L6;
                } else {
                  stackOut_16_0 = (rj) (Object) stackIn_16_0;
                  stackOut_16_1 = 1;
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_18_1 = stackOut_16_1;
                  break L6;
                }
              }
              stackIn_18_0.field_y = stackIn_18_1 != 0;
              break L5;
            }
          }
          L7: {
            if (((jo) this).field_z != null) {
              L8: {
                stackOut_21_0 = ((jo) this).field_z;
                stackIn_23_0 = stackOut_21_0;
                stackIn_22_0 = stackOut_21_0;
                if (!param1) {
                  stackOut_23_0 = (rj) (Object) stackIn_23_0;
                  stackOut_23_1 = 0;
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  break L8;
                } else {
                  stackOut_22_0 = (rj) (Object) stackIn_22_0;
                  stackOut_22_1 = 1;
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_24_1 = stackOut_22_1;
                  break L8;
                }
              }
              stackIn_24_0.field_y = stackIn_24_1 != 0;
              break L7;
            } else {
              break L7;
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void b(int param0, int param1) {
        this.a(param0 ^ 22876, param1);
        if (param0 != 13328) {
            return;
        }
        if (!(!(((jo) this).field_h instanceof tua))) {
            ((tua) (Object) ((jo) this).field_h).a(9776, (jo) this, ((jo) this).field_C, ((jo) this).field_O);
        }
    }

    public static void g(byte param0) {
        if (param0 >= -86) {
            return;
        }
        field_E = null;
        field_K = null;
    }

    private final void h(byte param0) {
        if (param0 > -30) {
            return;
        }
        int var2 = ((jo) this).field_L == null ? ((jo) this).field_D.field_i : ((jo) this).field_L.field_m + ((jo) this).field_L.field_i;
        int var3 = null != ((jo) this).field_z ? -((jo) this).field_N.field_m + ((jo) this).field_z.field_i : ((jo) this).field_D.field_m + (((jo) this).field_D.field_i - ((jo) this).field_N.field_m);
        ((jo) this).field_N.field_i = var2 + ((var3 - var2) * ((jo) this).field_C >> 2118902000);
    }

    private final void a(int param0, byte param1) {
        ((jo) this).c(16, param0);
        if (param1 >= -90) {
            ((jo) this).field_A = 107;
        }
        if (((jo) this).field_h instanceof tua) {
            ((tua) (Object) ((jo) this).field_h).a(9776, (jo) this, ((jo) this).field_O, ((jo) this).field_O);
        }
    }

    final static void a(jea param0, int param1, jea param2, jea param3, jea param4) {
        String var5 = null;
        int var6 = 0;
        Object var7 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        if (null == oea.field_i) {
          L0: {
            ni.field_c = false;
            if (!fua.field_g) {
              if (ok.field_s) {
                var5 = rsa.field_z;
                break L0;
              } else {
                var5 = wn.field_n;
                break L0;
              }
            } else {
              var5 = kia.field_a;
              break L0;
            }
          }
          var7 = null;
          dqa.a(var5, 0, (String) null, sva.field_d, 127);
          pq.field_g.field_N = sva.field_d - (sva.field_d >> -1435144575 & 8355711) + ((bn.field_t.field_N & 16711422) >> -1980545055);
          pq.field_g.field_ab = (8355711 & bn.field_t.field_ab >> -1789710879) + (-((sva.field_d & 16711423) >> -615129791) + sva.field_d);
          pq.field_g.field_gb = ((16711423 & bn.field_t.field_gb) >> -67066655) + (sva.field_d - (sva.field_d >> 2119614145 & 8355711));
          rma.field_b = mka.field_b;
          oea.field_i = pq.field_g;
          wi.field_s = new jea((long)param1, param4);
          lra.field_e = new jea(0L, param0);
          ep.field_r = new jea(0L, (jea) null);
          dh.field_e = new jea(0L, param3);
          pq.field_g = new jea(0L, param2);
          pq.field_g.field_H = lpa.field_s;
          dh.field_e.b(-123, pq.field_g);
          mka.field_b = new jea(0L, rma.field_b);
          dh.field_e.b(-128, mka.field_b);
          lra.field_d = new jea(0L, bn.field_t, fw.field_a);
          qpa.field_b = new jea(0L, bn.field_t);
          wi.field_s.b(param1 ^ -122, lra.field_e);
          wi.field_s.b(-123, ep.field_r);
          ep.field_r.b(-123, dh.field_e);
          ep.field_r.b(-126, lra.field_d);
          ep.field_r.b(-125, qpa.field_b);
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, ae param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          L1: {
            var7 = TombRacer.field_G ? 1 : 0;
            super.a(param0, param1 ^ 0, param2, param3);
            if (!(((jo) this).field_N.field_x instanceof rj)) {
              break L1;
            } else {
              if (!((rj) (Object) ((jo) this).field_N.field_x).field_y) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          if (((jo) this).field_N.field_s == 1) {
            L2: {
              if (!((jo) this).field_J) {
                this.h((byte) -101);
                break L2;
              } else {
                var5 = ((jo) this).field_C;
                this.d(-66);
                if (((jo) this).field_C == var5) {
                  break L2;
                } else {
                  if (!(((jo) this).field_h instanceof tua)) {
                    break L2;
                  } else {
                    ((tua) (Object) ((jo) this).field_h).a(((jo) this).field_C, (jo) this, true, ((jo) this).field_C);
                    break L2;
                  }
                }
              }
            }
            if (!((jo) this).field_P) {
              this.e(-125);
              break L0;
            } else {
              var5 = ((jo) this).field_O;
              this.f(param1 + -2031616);
              if (((jo) this).field_O == var5) {
                break L0;
              } else {
                if (((jo) this).field_h instanceof tua) {
                  ((tua) (Object) ((jo) this).field_h).a(((jo) this).field_C, (jo) this, true, ((jo) this).field_O);
                  break L0;
                } else {
                  break L0;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L3: {
          if (!((jo) this).field_D.field_y) {
            break L3;
          } else {
            if ((((jo) this).field_D.field_x ^ -1) == -2) {
              if (((jo) this).field_P) {
                if (!((jo) this).field_J) {
                  if (sta.field_B <= (((jo) this).field_N.field_p >> -372084575) + (((jo) this).field_N.field_n + param3)) {
                    this.a(((jo) this).field_O - ((jo) this).field_B, (byte) -91);
                    break L3;
                  } else {
                    this.a(((jo) this).field_O + ((jo) this).field_B, (byte) -109);
                    break L3;
                  }
                } else {
                  var5 = -(((jo) this).field_N.field_m >> -1375942303) - (((jo) this).field_N.field_i - -((jo) this).field_i - jba.field_j - -param0);
                  var6 = sta.field_B - param3 - ((jo) this).field_n - ((((jo) this).field_N.field_p >> -1545721567) + ((jo) this).field_N.field_n);
                  if (Math.abs(var6) <= Math.abs(var5)) {
                    if ((var5 ^ -1) >= -1) {
                      this.b(13328, ((jo) this).field_C + -((jo) this).field_y);
                      break L3;
                    } else {
                      this.b(13328, ((jo) this).field_y + ((jo) this).field_C);
                      break L3;
                    }
                  } else {
                    if (0 >= var6) {
                      this.a(-((jo) this).field_B + ((jo) this).field_O, (byte) -113);
                      break L3;
                    } else {
                      this.a(((jo) this).field_O - -((jo) this).field_B, (byte) -102);
                      break L3;
                    }
                  }
                }
              } else {
                if (((jo) this).field_J) {
                  if ((((jo) this).field_N.field_m >> -999252223) + param0 + ((jo) this).field_N.field_i < jba.field_j) {
                    this.b(param1 ^ 2110480, ((jo) this).field_y + ((jo) this).field_C);
                    break L3;
                  } else {
                    this.b(param1 + -2083824, ((jo) this).field_C - ((jo) this).field_y);
                    break L3;
                  }
                } else {
                  break L3;
                }
              }
            } else {
              break L3;
            }
          }
        }
        L4: {
          if (param1 == 2097152) {
            break L4;
          } else {
            ((jo) this).field_L = null;
            break L4;
          }
        }
    }

    jo(int param0, int param1, int param2, int param3, isa param4, isa param5, isa param6, int param7, int param8, int param9, int param10, boolean param11, boolean param12, int param13, int param14) {
        super(param0, param1, param2, param3, param4);
        ((jo) this).field_O = 32768;
        ((jo) this).field_y = 8192;
        ((jo) this).field_I = 0;
        ((jo) this).field_C = 32768;
        ((jo) this).field_x = true;
        ((jo) this).field_B = 8192;
        ((jo) this).field_M = 1024;
        ((jo) this).field_G = 0;
        ((jo) this).field_A = 1024;
        ((jo) this).field_w = new ae[6];
        ((jo) this).field_N = new vp(param0, param1, param7, param8, (isa) null, (qc) null, (ae) (Object) new rj(0, 0, param7, param8, param6, (qc) null), false, false);
        ((jo) this).field_w[0] = (ae) (Object) new vp(param0, param1, param7, param8, (isa) null, (qc) null, (ae) (Object) new rj(0, 0, param7, param8, param6, (qc) null), false, false);
        ((jo) this).field_D = new rj(param0, param1, param7, param8, param5, (qc) null);
        ((jo) this).field_w[1] = (ae) (Object) new rj(param0, param1, param7, param8, param5, (qc) null);
        ((jo) this).field_G = param10;
        ((jo) this).field_P = param12 ? true : false;
        ((jo) this).field_J = param11 ? true : false;
        ((jo) this).field_I = param9;
        this.a(27980, param13);
        ((jo) this).c(16, param14);
        ((jo) this).a((byte) -31, param2, param3, param0, param1);
    }

    private final void f(int param0) {
        if (param0 != 65536) {
            return;
        }
        int var2 = null != ((jo) this).field_F ? ((jo) this).field_F.field_n + ((jo) this).field_F.field_p : ((jo) this).field_D.field_n;
        int var3 = ((jo) this).field_H != null ? ((jo) this).field_H.field_n - ((jo) this).field_N.field_p : -((jo) this).field_N.field_p + ((jo) this).field_D.field_p + ((jo) this).field_D.field_n;
        ((jo) this).c(16, var2 >= var3 ? 0 : (-var2 + ((jo) this).field_N.field_n << -1027416880) / (var3 + -var2));
    }

    private final void a(int param0, int param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        if (param1 > -1) {
            ((jo) this).field_C = 0;
        } else {
            if (-65537 >= param1) {
                ((jo) this).field_C = param1;
            } else {
                ((jo) this).field_C = 65536;
            }
        }
        this.h((byte) -110);
        if (param0 != 27980) {
            ((jo) this).field_D = null;
        }
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        if (super.a(param0, param1, param2, param3)) {
          return true;
        } else {
          L0: {
            if (!((jo) this).field_x) {
              break L0;
            } else {
              if (((jo) this).field_N.b((byte) -34)) {
                if (param2 != 98) {
                  if (param2 != 99) {
                    if (param2 == 96) {
                      this.b(13328, ((jo) this).field_C + -((jo) this).field_A);
                      return true;
                    } else {
                      if (97 == param2) {
                        this.b(13328, ((jo) this).field_C - -((jo) this).field_A);
                        return true;
                      } else {
                        if (104 == param2) {
                          this.a(((jo) this).field_O + -this.c(1553449360), (byte) -99);
                          return true;
                        } else {
                          if (105 == param2) {
                            this.a(((jo) this).field_O + this.c(1553449360), (byte) -127);
                            return true;
                          } else {
                            if (102 == param2) {
                              L1: {
                                if (!((jo) this).field_P) {
                                  break L1;
                                } else {
                                  if (!oj.field_tb[82]) {
                                    break L1;
                                  } else {
                                    this.a(0, (byte) -105);
                                    return true;
                                  }
                                }
                              }
                              if (((jo) this).field_J) {
                                this.b(13328, 0);
                                return true;
                              } else {
                                break L0;
                              }
                            } else {
                              if (param2 != 103) {
                                break L0;
                              } else {
                                L2: {
                                  if (!((jo) this).field_P) {
                                    break L2;
                                  } else {
                                    if (!oj.field_tb[82]) {
                                      break L2;
                                    } else {
                                      this.a(65536, (byte) -123);
                                      return true;
                                    }
                                  }
                                }
                                if (!((jo) this).field_J) {
                                  break L0;
                                } else {
                                  this.b(13328, 65536);
                                  return true;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    this.a(((jo) this).field_O - -((jo) this).field_M, (byte) -111);
                    return true;
                  }
                } else {
                  this.a(((jo) this).field_O + -((jo) this).field_M, (byte) -123);
                  return true;
                }
              } else {
                return false;
              }
            }
          }
          return false;
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = 0;
        if (param1 < param2) {
            var4 = param1 * ((jo) this).field_D.field_m / param2;
            if (!(var4 >= ((jo) this).field_I)) {
                var4 = ((jo) this).field_I;
            }
            ((jo) this).field_N.a((byte) -31, var4, ((jo) this).field_N.field_p, ((jo) this).field_N.field_i, ((jo) this).field_N.field_n);
            this.b(-122, true);
        } else {
            ((jo) this).field_N.a((byte) -31, ((jo) this).field_D.field_m, ((jo) this).field_N.field_p, ((jo) this).field_N.field_i, ((jo) this).field_N.field_n);
            this.b(-82, false);
        }
        if (param0 >= -81) {
            ((jo) this).field_z = null;
        }
        this.h((byte) -110);
    }

    final void c(int param0, int param1, int param2) {
        int var4 = 0;
        if (param2 != -1789710879) {
            ((jo) this).c(-65, -82, -68);
        }
        if (param1 >= param0) {
            ((jo) this).field_N.a((byte) -31, ((jo) this).field_N.field_m, ((jo) this).field_D.field_p, ((jo) this).field_N.field_i, ((jo) this).field_N.field_n);
            this.a(1, false);
        } else {
            var4 = param1 * ((jo) this).field_D.field_p / param0;
            if (!(((jo) this).field_G <= var4)) {
                var4 = ((jo) this).field_G;
            }
            ((jo) this).field_N.a((byte) -31, ((jo) this).field_N.field_m, var4, ((jo) this).field_N.field_i, ((jo) this).field_N.field_n);
            this.a(1, true);
        }
        this.e(param2 ^ 1789710944);
    }

    private final void a(int param0, boolean param1) {
        rj stackIn_3_0 = null;
        rj stackIn_4_0 = null;
        rj stackIn_5_0 = null;
        rj stackIn_6_0 = null;
        rj stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        rj stackIn_10_0 = null;
        rj stackIn_11_0 = null;
        rj stackIn_12_0 = null;
        rj stackIn_13_0 = null;
        rj stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        rj stackIn_18_0 = null;
        rj stackIn_19_0 = null;
        rj stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        rj stackIn_23_0 = null;
        rj stackIn_24_0 = null;
        rj stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        rj stackOut_2_0 = null;
        rj stackOut_3_0 = null;
        rj stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        rj stackOut_4_0 = null;
        rj stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        rj stackOut_9_0 = null;
        rj stackOut_10_0 = null;
        rj stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        rj stackOut_11_0 = null;
        rj stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        rj stackOut_17_0 = null;
        rj stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        rj stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        rj stackOut_22_0 = null;
        rj stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        rj stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        L0: {
          if (param0 == 1) {
            break L0;
          } else {
            this.d(64);
            break L0;
          }
        }
        L1: {
          L2: {
            stackOut_2_0 = ((jo) this).field_D;
            stackIn_5_0 = stackOut_2_0;
            stackIn_3_0 = stackOut_2_0;
            if (param1) {
              break L2;
            } else {
              stackOut_3_0 = (rj) (Object) stackIn_3_0;
              stackIn_6_0 = stackOut_3_0;
              stackIn_4_0 = stackOut_3_0;
              if (!((jo) this).field_J) {
                stackOut_6_0 = (rj) (Object) stackIn_6_0;
                stackOut_6_1 = 0;
                stackIn_7_0 = stackOut_6_0;
                stackIn_7_1 = stackOut_6_1;
                break L1;
              } else {
                stackOut_4_0 = (rj) (Object) stackIn_4_0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              }
            }
          }
          stackOut_5_0 = (rj) (Object) stackIn_5_0;
          stackOut_5_1 = 1;
          stackIn_7_0 = stackOut_5_0;
          stackIn_7_1 = stackOut_5_1;
          break L1;
        }
        L3: {
          stackIn_7_0.field_y = stackIn_7_1 != 0;
          if (((jo) this).field_N.field_x instanceof rj) {
            L4: {
              L5: {
                stackOut_9_0 = (rj) (Object) ((jo) this).field_N.field_x;
                stackIn_12_0 = stackOut_9_0;
                stackIn_10_0 = stackOut_9_0;
                if (param1) {
                  break L5;
                } else {
                  stackOut_10_0 = (rj) (Object) stackIn_10_0;
                  stackIn_13_0 = stackOut_10_0;
                  stackIn_11_0 = stackOut_10_0;
                  if (!((jo) this).field_J) {
                    stackOut_13_0 = (rj) (Object) stackIn_13_0;
                    stackOut_13_1 = 0;
                    stackIn_14_0 = stackOut_13_0;
                    stackIn_14_1 = stackOut_13_1;
                    break L4;
                  } else {
                    stackOut_11_0 = (rj) (Object) stackIn_11_0;
                    stackIn_12_0 = stackOut_11_0;
                    break L5;
                  }
                }
              }
              stackOut_12_0 = (rj) (Object) stackIn_12_0;
              stackOut_12_1 = 1;
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              break L4;
            }
            stackIn_14_0.field_y = stackIn_14_1 != 0;
            break L3;
          } else {
            break L3;
          }
        }
        L6: {
          if (null != ((jo) this).field_F) {
            L7: {
              stackOut_17_0 = ((jo) this).field_F;
              stackIn_19_0 = stackOut_17_0;
              stackIn_18_0 = stackOut_17_0;
              if (!param1) {
                stackOut_19_0 = (rj) (Object) stackIn_19_0;
                stackOut_19_1 = 0;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                break L7;
              } else {
                stackOut_18_0 = (rj) (Object) stackIn_18_0;
                stackOut_18_1 = 1;
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                break L7;
              }
            }
            stackIn_20_0.field_y = stackIn_20_1 != 0;
            break L6;
          } else {
            break L6;
          }
        }
        L8: {
          if (((jo) this).field_H == null) {
            break L8;
          } else {
            L9: {
              stackOut_22_0 = ((jo) this).field_H;
              stackIn_24_0 = stackOut_22_0;
              stackIn_23_0 = stackOut_22_0;
              if (!param1) {
                stackOut_24_0 = (rj) (Object) stackIn_24_0;
                stackOut_24_1 = 0;
                stackIn_25_0 = stackOut_24_0;
                stackIn_25_1 = stackOut_24_1;
                break L9;
              } else {
                stackOut_23_0 = (rj) (Object) stackIn_23_0;
                stackOut_23_1 = 1;
                stackIn_25_0 = stackOut_23_0;
                stackIn_25_1 = stackOut_23_1;
                break L9;
              }
            }
            stackIn_25_0.field_y = stackIn_25_1 != 0;
            break L8;
          }
        }
    }

    private final void e(int param0) {
        int var2 = ((jo) this).field_F != null ? ((jo) this).field_F.field_n + ((jo) this).field_F.field_p : ((jo) this).field_D.field_n;
        if (param0 >= -122) {
            ((jo) this).c(127, -127, -34);
        }
        int var3 = null != ((jo) this).field_H ? -((jo) this).field_N.field_p + ((jo) this).field_H.field_n : ((jo) this).field_D.field_p + (((jo) this).field_D.field_n + -((jo) this).field_N.field_p);
        ((jo) this).field_N.field_n = ((var3 + -var2) * ((jo) this).field_O >> -649866768) + var2;
    }

    final static void a(boolean param0, boolean param1) {
        if (!(!wqa.r((byte) -98))) {
            param1 = false;
        }
        sa.a(param1, (byte) 88);
        dla.b(23713);
        if (!param0) {
            jo.g((byte) 92);
        }
    }

    private final int c(int param0) {
        if (param0 != 1553449360) {
            return 79;
        }
        return (((jo) this).field_N.field_p << 1553449360) / ((jo) this).field_D.field_p;
    }

    final boolean a(ae param0, boolean param1) {
        if (param1) {
            Object var4 = null;
            boolean discarded$0 = ((jo) this).a('', (ae) null, -82, true);
        }
        vp var3 = ((jo) this).field_N;
        if (var3 != null) {
            if (((ae) (Object) var3).a(param0, false)) {
                return true;
            }
        }
        return false;
    }

    private final void d(int param0) {
        int var2 = ((jo) this).field_L != null ? ((jo) this).field_L.field_m + ((jo) this).field_L.field_i : ((jo) this).field_D.field_i;
        int var4 = 26 % ((param0 - 22) / 59);
        int var3 = null != ((jo) this).field_z ? -((jo) this).field_N.field_m + ((jo) this).field_z.field_i : -((jo) this).field_N.field_m + ((jo) this).field_D.field_i + ((jo) this).field_D.field_m;
        this.a(27980, var2 < var3 ? (-var2 + ((jo) this).field_N.field_i << -411069264) / (var3 - var2) : 0);
    }

    final void c(int param0, int param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        if ((param1 ^ -1) > -1) {
            ((jo) this).field_O = 0;
        } else {
            if (65536 < param1) {
                ((jo) this).field_O = 65536;
            } else {
                ((jo) this).field_O = param1;
            }
        }
        if (param0 != 16) {
            return;
        }
        this.e(param0 ^ -111);
    }

    final static an a(kh param0, boolean param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        an var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = TombRacer.field_G ? 1 : 0;
        var2 = param0.b((byte) 44, 8);
        if (0 < var2) {
          throw new IllegalStateException("" + var2);
        } else {
          L0: {
            if (param1) {
              break L0;
            } else {
              field_E = null;
              break L0;
            }
          }
          L1: {
            var3 = uha.a(5907, param0) ? 1 : 0;
            var4 = uha.a(5907, param0) ? 1 : 0;
            var5 = new an();
            var5.field_I = (short)param0.b((byte) 44, 16);
            var5.field_l = me.a((byte) 76, 16, param0, var5.field_l);
            var5.field_h = me.a((byte) 88, 16, param0, var5.field_h);
            var5.field_t = me.a((byte) 73, 16, param0, var5.field_t);
            var5.field_u = (short)param0.b((byte) 44, 16);
            var5.field_B = me.a((byte) 102, 16, param0, var5.field_B);
            var5.field_w = me.a((byte) 98, 16, param0, var5.field_w);
            var5.field_f = me.a((byte) 94, 16, param0, var5.field_f);
            if (var3 != 0) {
              var5.field_A = (short)param0.b((byte) 44, 16);
              var5.field_k = me.a((byte) 96, 16, param0, var5.field_k);
              var5.field_c = me.a((byte) 89, 16, param0, var5.field_c);
              var5.field_r = me.a((byte) 91, 16, param0, var5.field_r);
              var5.field_C = me.a((byte) 73, 16, param0, var5.field_C);
              var5.field_s = me.a((byte) 111, 16, param0, var5.field_s);
              var5.field_y = me.a((byte) 101, 16, param0, var5.field_y);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (var4 != 0) {
              int discarded$1 = param0.b((byte) 44, 16);
              var5.field_H = me.a((byte) 76, 16, param0, var5.field_H);
              var5.field_e = me.a((byte) 73, 16, param0, var5.field_e);
              var5.field_d = me.a((byte) 105, 16, param0, var5.field_d);
              var5.field_N = me.a((byte) 101, 16, param0, var5.field_N);
              var5.field_D = me.a((byte) 100, 16, param0, var5.field_D);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (uha.a(5907, param0)) {
              var5.field_M = me.a((byte) 74, 16, param0, var5.field_M);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (!uha.a(5907, param0)) {
              break L4;
            } else {
              var5.field_q = goa.a(16, -4854, param0, var5.field_q);
              var6 = 0;
              var7 = 0;
              L5: while (true) {
                if (var7 >= var5.field_q.length) {
                  if (var6 != 0) {
                    var5.field_K = (byte)(1 + var6);
                    break L4;
                  } else {
                    var5.field_q = null;
                    break L4;
                  }
                } else {
                  if ((var5.field_q[var7] & 255) > var6) {
                    var6 = var5.field_q[var7] & 255;
                    var7++;
                    continue L5;
                  } else {
                    var7++;
                    continue L5;
                  }
                }
              }
            }
          }
          return var5;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Account created successfully!";
    }
}
