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
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param4 > 44) {
                break L1;
              } else {
                ((jo) this).field_J = true;
                break L1;
              }
            }
            L2: {
              if (param3 != 1) {
                break L2;
              } else {
                if (!((jo) this).field_x) {
                  break L2;
                } else {
                  L3: {
                    if (!((jo) this).field_P) {
                      break L3;
                    } else {
                      if (param2 != ((jo) this).field_F) {
                        break L3;
                      } else {
                        this.a(((jo) this).field_O - ((jo) this).field_M, (byte) -91);
                        break L2;
                      }
                    }
                  }
                  L4: {
                    if (!((jo) this).field_P) {
                      break L4;
                    } else {
                      if (param2 == ((jo) this).field_H) {
                        this.a(((jo) this).field_M + ((jo) this).field_O, (byte) -94);
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (!((jo) this).field_J) {
                      break L5;
                    } else {
                      if (((jo) this).field_L != param2) {
                        break L5;
                      } else {
                        this.b(13328, -((jo) this).field_A + ((jo) this).field_C);
                        break L2;
                      }
                    }
                  }
                  if (!((jo) this).field_J) {
                    break L2;
                  } else {
                    if (((jo) this).field_z == param2) {
                      this.b(13328, ((jo) this).field_A + ((jo) this).field_C);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var6;
            stackOut_20_1 = new StringBuilder().append("jo.M(").append(param0).append(44).append(param1).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param2 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param3 + 44 + param4 + 41);
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
            ((jo) this).field_L.field_n = ((jo) this).field_p + -((jo) this).field_L.field_p >> 1;
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
            ((jo) this).field_z.field_n = -((jo) this).field_z.field_p + ((jo) this).field_p >> 1;
            ((jo) this).field_D.field_m = -((jo) this).field_z.field_m + (((jo) this).field_m - ((jo) this).field_D.field_i);
            break L1;
          }
        }
        L2: {
          this.h((byte) -125);
          if (((jo) this).field_F != null) {
            ((jo) this).field_F.field_i = -((jo) this).field_F.field_m + ((jo) this).field_m >> 1;
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
              ((jo) this).field_H.field_i = -((jo) this).field_H.field_m + ((jo) this).field_m >> 1;
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

    public static void g() {
        field_E = null;
        field_K = null;
    }

    private final void h(byte param0) {
        if (param0 > -30) {
            return;
        }
        int var2 = ((jo) this).field_L == null ? ((jo) this).field_D.field_i : ((jo) this).field_L.field_m + ((jo) this).field_L.field_i;
        int var3 = null != ((jo) this).field_z ? -((jo) this).field_N.field_m + ((jo) this).field_z.field_i : ((jo) this).field_D.field_m + (((jo) this).field_D.field_i - ((jo) this).field_N.field_m);
        ((jo) this).field_N.field_i = var2 + ((var3 - var2) * ((jo) this).field_C >> 16);
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
        RuntimeException var5 = null;
        String var5_ref = null;
        int var6 = 0;
        Object var7 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (null == oea.field_i) {
              L1: {
                ni.field_c = false;
                if (!fua.field_g) {
                  if (ok.field_s) {
                    var5_ref = rsa.field_z;
                    break L1;
                  } else {
                    var5_ref = wn.field_n;
                    break L1;
                  }
                } else {
                  var5_ref = kia.field_a;
                  break L1;
                }
              }
              var7 = null;
              dqa.a(var5_ref, 0, (String) null, sva.field_d, 127);
              pq.field_g.field_N = sva.field_d - (sva.field_d >> 1 & 8355711) + ((bn.field_t.field_N & 16711422) >> 1);
              pq.field_g.field_ab = (8355711 & bn.field_t.field_ab >> 1) + (-((sva.field_d & 16711423) >> 1) + sva.field_d);
              pq.field_g.field_gb = ((16711423 & bn.field_t.field_gb) >> 1) + (sva.field_d - (sva.field_d >> 1 & 8355711));
              rma.field_b = mka.field_b;
              oea.field_i = pq.field_g;
              wi.field_s = new jea(0L, param4);
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
              wi.field_s.b(-122, lra.field_e);
              wi.field_s.b(-123, ep.field_r);
              ep.field_r.b(-123, dh.field_e);
              ep.field_r.b(-126, lra.field_d);
              ep.field_r.b(-125, qpa.field_b);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var5;
            stackOut_10_1 = new StringBuilder().append("jo.E(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L2;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L2;
            }
          }
          L3: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44).append(0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          L4: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          L5: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param4 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 41);
        }
    }

    final void a(int param0, int param1, ae param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                super.a(param0, param1, param2, param3);
                if (!(((jo) this).field_N.field_x instanceof rj)) {
                  break L2;
                } else {
                  if (!((rj) (Object) ((jo) this).field_N.field_x).field_y) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (((jo) this).field_N.field_s == 1) {
                L3: {
                  if (!((jo) this).field_J) {
                    this.h((byte) -101);
                    break L3;
                  } else {
                    var5_int = ((jo) this).field_C;
                    int discarded$1 = -66;
                    this.d();
                    if (((jo) this).field_C == var5_int) {
                      break L3;
                    } else {
                      if (!(((jo) this).field_h instanceof tua)) {
                        break L3;
                      } else {
                        ((tua) (Object) ((jo) this).field_h).a(((jo) this).field_C, (jo) this, true, ((jo) this).field_C);
                        break L3;
                      }
                    }
                  }
                }
                if (!((jo) this).field_P) {
                  this.e(-125);
                  break L1;
                } else {
                  var5_int = ((jo) this).field_O;
                  this.f(param1 + -2031616);
                  if (((jo) this).field_O == var5_int) {
                    break L1;
                  } else {
                    if (((jo) this).field_h instanceof tua) {
                      ((tua) (Object) ((jo) this).field_h).a(((jo) this).field_C, (jo) this, true, ((jo) this).field_O);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
              } else {
                break L1;
              }
            }
            L4: {
              if (!((jo) this).field_D.field_y) {
                break L4;
              } else {
                if (((jo) this).field_D.field_x == 1) {
                  if (((jo) this).field_P) {
                    if (!((jo) this).field_J) {
                      if (sta.field_B <= (((jo) this).field_N.field_p >> 1) + (((jo) this).field_N.field_n + param3)) {
                        this.a(((jo) this).field_O - ((jo) this).field_B, (byte) -91);
                        break L4;
                      } else {
                        this.a(((jo) this).field_O + ((jo) this).field_B, (byte) -109);
                        break L4;
                      }
                    } else {
                      var5_int = -(((jo) this).field_N.field_m >> 1) - (((jo) this).field_N.field_i - -((jo) this).field_i - jba.field_j - -param0);
                      var6 = sta.field_B - param3 - ((jo) this).field_n - ((((jo) this).field_N.field_p >> 1) + ((jo) this).field_N.field_n);
                      if (Math.abs(var6) <= Math.abs(var5_int)) {
                        if (var5_int <= 0) {
                          this.b(13328, ((jo) this).field_C + -((jo) this).field_y);
                          break L4;
                        } else {
                          this.b(13328, ((jo) this).field_y + ((jo) this).field_C);
                          break L4;
                        }
                      } else {
                        if (0 >= var6) {
                          this.a(-((jo) this).field_B + ((jo) this).field_O, (byte) -113);
                          break L4;
                        } else {
                          this.a(((jo) this).field_O - -((jo) this).field_B, (byte) -102);
                          break L4;
                        }
                      }
                    }
                  } else {
                    if (((jo) this).field_J) {
                      if ((((jo) this).field_N.field_m >> 1) + param0 + ((jo) this).field_N.field_i < jba.field_j) {
                        this.b(param1 ^ 2110480, ((jo) this).field_y + ((jo) this).field_C);
                        break L4;
                      } else {
                        this.b(param1 + -2083824, ((jo) this).field_C - ((jo) this).field_y);
                        break L4;
                      }
                    } else {
                      break L4;
                    }
                  }
                } else {
                  break L4;
                }
              }
            }
            L5: {
              if (param1 == 2097152) {
                break L5;
              } else {
                ((jo) this).field_L = null;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var5;
            stackOut_41_1 = new StringBuilder().append("jo.A(").append(param0).append(44).append(param1).append(44);
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param2 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L6;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L6;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + 44 + param3 + 41);
        }
    }

    jo(int param0, int param1, int param2, int param3, isa param4, isa param5, isa param6, int param7, int param8, int param9, int param10, boolean param11, boolean param12, int param13, int param14) {
        super(param0, param1, param2, param3, param4);
        RuntimeException var16 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
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
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        ((jo) this).field_O = 32768;
        ((jo) this).field_y = 8192;
        ((jo) this).field_I = 0;
        ((jo) this).field_C = 32768;
        ((jo) this).field_x = true;
        ((jo) this).field_B = 8192;
        ((jo) this).field_M = 1024;
        ((jo) this).field_G = 0;
        ((jo) this).field_A = 1024;
        try {
          L0: {
            L1: {
              ((jo) this).field_w = new ae[6];
              vp dupTemp$2 = new vp(param0, param1, param7, param8, (isa) null, (qc) null, (ae) (Object) new rj(0, 0, param7, param8, param6, (qc) null), false, false);
              ((jo) this).field_N = dupTemp$2;
              ((jo) this).field_w[0] = (ae) (Object) dupTemp$2;
              rj dupTemp$3 = new rj(param0, param1, param7, param8, param5, (qc) null);
              ((jo) this).field_D = dupTemp$3;
              ((jo) this).field_w[1] = (ae) (Object) dupTemp$3;
              ((jo) this).field_G = param10;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param12) {
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
              ((jo) this).field_P = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param11) {
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
            ((jo) this).field_J = stackIn_7_1 != 0;
            ((jo) this).field_I = param9;
            this.a(27980, param13);
            ((jo) this).c(16, param14);
            ((jo) this).a((byte) -31, param2, param3, param0, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var16 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var16;
            stackOut_9_1 = new StringBuilder().append("jo.<init>(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param4 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
            stackOut_12_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param5 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param6 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + param7 + 44 + param8 + 44 + param9 + 44 + param10 + 44 + param11 + 44 + param12 + 44 + param13 + 44 + param14 + 41);
        }
    }

    private final void f(int param0) {
        if (param0 != 65536) {
            return;
        }
        int var2 = null != ((jo) this).field_F ? ((jo) this).field_F.field_n + ((jo) this).field_F.field_p : ((jo) this).field_D.field_n;
        int var3 = ((jo) this).field_H != null ? ((jo) this).field_H.field_n - ((jo) this).field_N.field_p : -((jo) this).field_N.field_p + ((jo) this).field_D.field_p + ((jo) this).field_D.field_n;
        ((jo) this).c(16, var2 >= var3 ? 0 : (-var2 + ((jo) this).field_N.field_n << 16) / (var3 + -var2));
    }

    private final void a(int param0, int param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        if (param1 < 0) {
            ((jo) this).field_C = 0;
        } else {
            if (param1 <= 65536) {
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
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_33_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_43_0 = 0;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_42_0 = 0;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        String stackOut_46_2 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        try {
          L0: {
            if (super.a(param0, param1, param2, param3)) {
              stackOut_2_0 = 1;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            } else {
              L1: {
                if (!((jo) this).field_x) {
                  break L1;
                } else {
                  if (((jo) this).field_N.b((byte) -34)) {
                    if (param2 != 98) {
                      if (param2 != 99) {
                        if (param2 == 96) {
                          this.b(13328, ((jo) this).field_C + -((jo) this).field_A);
                          stackOut_40_0 = 1;
                          stackIn_41_0 = stackOut_40_0;
                          return stackIn_41_0 != 0;
                        } else {
                          if (97 == param2) {
                            this.b(13328, ((jo) this).field_C - -((jo) this).field_A);
                            stackOut_38_0 = 1;
                            stackIn_39_0 = stackOut_38_0;
                            return stackIn_39_0 != 0;
                          } else {
                            if (104 == param2) {
                              int discarded$2 = 1553449360;
                              this.a(((jo) this).field_O + -this.c(), (byte) -99);
                              stackOut_36_0 = 1;
                              stackIn_37_0 = stackOut_36_0;
                              return stackIn_37_0 != 0;
                            } else {
                              if (105 == param2) {
                                int discarded$3 = 1553449360;
                                this.a(((jo) this).field_O + this.c(), (byte) -127);
                                stackOut_34_0 = 1;
                                stackIn_35_0 = stackOut_34_0;
                                return stackIn_35_0 != 0;
                              } else {
                                if (102 == param2) {
                                  L2: {
                                    if (!((jo) this).field_P) {
                                      break L2;
                                    } else {
                                      if (!oj.field_tb[82]) {
                                        break L2;
                                      } else {
                                        this.a(0, (byte) -105);
                                        stackOut_28_0 = 1;
                                        stackIn_29_0 = stackOut_28_0;
                                        return stackIn_29_0 != 0;
                                      }
                                    }
                                  }
                                  if (((jo) this).field_J) {
                                    this.b(13328, 0);
                                    stackOut_32_0 = 1;
                                    stackIn_33_0 = stackOut_32_0;
                                    return stackIn_33_0 != 0;
                                  } else {
                                    break L1;
                                  }
                                } else {
                                  if (param2 != 103) {
                                    break L1;
                                  } else {
                                    L3: {
                                      if (!((jo) this).field_P) {
                                        break L3;
                                      } else {
                                        if (!oj.field_tb[82]) {
                                          break L3;
                                        } else {
                                          this.a(65536, (byte) -123);
                                          stackOut_21_0 = 1;
                                          stackIn_22_0 = stackOut_21_0;
                                          return stackIn_22_0 != 0;
                                        }
                                      }
                                    }
                                    if (!((jo) this).field_J) {
                                      break L1;
                                    } else {
                                      this.b(13328, 65536);
                                      stackOut_24_0 = 1;
                                      stackIn_25_0 = stackOut_24_0;
                                      return stackIn_25_0 != 0;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        this.a(((jo) this).field_O - -((jo) this).field_M, (byte) -111);
                        stackOut_11_0 = 1;
                        stackIn_12_0 = stackOut_11_0;
                        return stackIn_12_0 != 0;
                      }
                    } else {
                      this.a(((jo) this).field_O + -((jo) this).field_M, (byte) -123);
                      stackOut_8_0 = 1;
                      stackIn_9_0 = stackOut_8_0;
                      return stackIn_9_0 != 0;
                    }
                  } else {
                    return false;
                  }
                }
              }
              stackOut_42_0 = 0;
              stackIn_43_0 = stackOut_42_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackOut_44_0 = (RuntimeException) var5;
            stackOut_44_1 = new StringBuilder().append("jo.P(").append(param0).append(44);
            stackIn_46_0 = stackOut_44_0;
            stackIn_46_1 = stackOut_44_1;
            stackIn_45_0 = stackOut_44_0;
            stackIn_45_1 = stackOut_44_1;
            if (param1 == null) {
              stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
              stackOut_46_1 = (StringBuilder) (Object) stackIn_46_1;
              stackOut_46_2 = "null";
              stackIn_47_0 = stackOut_46_0;
              stackIn_47_1 = stackOut_46_1;
              stackIn_47_2 = stackOut_46_2;
              break L4;
            } else {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "{...}";
              stackIn_47_0 = stackOut_45_0;
              stackIn_47_1 = stackOut_45_1;
              stackIn_47_2 = stackOut_45_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_47_0, stackIn_47_2 + 44 + param2 + 44 + param3 + 41);
        }
        return stackIn_43_0 != 0;
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
        rj stackIn_1_0 = null;
        rj stackIn_2_0 = null;
        rj stackIn_3_0 = null;
        rj stackIn_4_0 = null;
        rj stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        rj stackIn_8_0 = null;
        rj stackIn_9_0 = null;
        rj stackIn_10_0 = null;
        rj stackIn_11_0 = null;
        rj stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        rj stackIn_16_0 = null;
        rj stackIn_17_0 = null;
        rj stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        rj stackIn_21_0 = null;
        rj stackIn_22_0 = null;
        rj stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        rj stackOut_0_0 = null;
        rj stackOut_1_0 = null;
        rj stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        rj stackOut_2_0 = null;
        rj stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        rj stackOut_7_0 = null;
        rj stackOut_8_0 = null;
        rj stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        rj stackOut_9_0 = null;
        rj stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        rj stackOut_15_0 = null;
        rj stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        rj stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        rj stackOut_20_0 = null;
        rj stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        rj stackOut_21_0 = null;
        int stackOut_21_1 = 0;
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
              if (!((jo) this).field_J) {
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
        L2: {
          stackIn_5_0.field_y = stackIn_5_1 != 0;
          if (((jo) this).field_N.field_x instanceof rj) {
            L3: {
              L4: {
                stackOut_7_0 = (rj) (Object) ((jo) this).field_N.field_x;
                stackIn_10_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (param1) {
                  break L4;
                } else {
                  stackOut_8_0 = (rj) (Object) stackIn_8_0;
                  stackIn_11_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (!((jo) this).field_J) {
                    stackOut_11_0 = (rj) (Object) stackIn_11_0;
                    stackOut_11_1 = 0;
                    stackIn_12_0 = stackOut_11_0;
                    stackIn_12_1 = stackOut_11_1;
                    break L3;
                  } else {
                    stackOut_9_0 = (rj) (Object) stackIn_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    break L4;
                  }
                }
              }
              stackOut_10_0 = (rj) (Object) stackIn_10_0;
              stackOut_10_1 = 1;
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              break L3;
            }
            stackIn_12_0.field_y = stackIn_12_1 != 0;
            break L2;
          } else {
            break L2;
          }
        }
        L5: {
          if (null != ((jo) this).field_F) {
            L6: {
              stackOut_15_0 = ((jo) this).field_F;
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
          } else {
            break L5;
          }
        }
        L7: {
          if (((jo) this).field_H == null) {
            break L7;
          } else {
            L8: {
              stackOut_20_0 = ((jo) this).field_H;
              stackIn_22_0 = stackOut_20_0;
              stackIn_21_0 = stackOut_20_0;
              if (!param1) {
                stackOut_22_0 = (rj) (Object) stackIn_22_0;
                stackOut_22_1 = 0;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                break L8;
              } else {
                stackOut_21_0 = (rj) (Object) stackIn_21_0;
                stackOut_21_1 = 1;
                stackIn_23_0 = stackOut_21_0;
                stackIn_23_1 = stackOut_21_1;
                break L8;
              }
            }
            stackIn_23_0.field_y = stackIn_23_1 != 0;
            break L7;
          }
        }
    }

    private final void e(int param0) {
        int var2 = ((jo) this).field_F != null ? ((jo) this).field_F.field_n + ((jo) this).field_F.field_p : ((jo) this).field_D.field_n;
        if (param0 >= -122) {
            ((jo) this).c(127, -127, -34);
        }
        int var3 = null != ((jo) this).field_H ? -((jo) this).field_N.field_p + ((jo) this).field_H.field_n : ((jo) this).field_D.field_p + (((jo) this).field_D.field_n + -((jo) this).field_N.field_p);
        ((jo) this).field_N.field_n = ((var3 + -var2) * ((jo) this).field_O >> 16) + var2;
    }

    final static void a(boolean param0, boolean param1) {
        if (!(!wqa.r((byte) -98))) {
            param1 = false;
        }
        sa.a(param1, (byte) 88);
        int discarded$0 = 23713;
        dla.b();
    }

    private final int c() {
        return (((jo) this).field_N.field_p << 16) / ((jo) this).field_D.field_p;
    }

    final boolean a(ae param0, boolean param1) {
        vp var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                var4 = null;
                boolean discarded$2 = ((jo) this).a('', (ae) null, -82, true);
                break L1;
              }
            }
            L2: {
              var3 = ((jo) this).field_N;
              if (var3 == null) {
                break L2;
              } else {
                if (!((ae) (Object) var3).a(param0, false)) {
                  break L2;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_5_0 = stackOut_4_0;
                  return stackIn_5_0 != 0;
                }
              }
            }
            stackOut_6_0 = 0;
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("jo.S(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
        return stackIn_7_0 != 0;
    }

    private final void d() {
        int var2 = ((jo) this).field_L != null ? ((jo) this).field_L.field_m + ((jo) this).field_L.field_i : ((jo) this).field_D.field_i;
        int var4 = 0;
        int var3 = null != ((jo) this).field_z ? -((jo) this).field_N.field_m + ((jo) this).field_z.field_i : -((jo) this).field_N.field_m + ((jo) this).field_D.field_i + ((jo) this).field_D.field_m;
        this.a(27980, var2 < var3 ? (-var2 + ((jo) this).field_N.field_i << 16) / (var3 - var2) : 0);
    }

    final void c(int param0, int param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        if (param1 < 0) {
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

    final static an a(kh param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        an var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        an stackIn_24_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        an stackOut_23_0 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = param0.b((byte) 44, 8);
            if (0 < var2_int) {
              throw new IllegalStateException("" + var2_int);
            } else {
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
                      L6: {
                        if ((var5.field_q[var7] & 255) > var6) {
                          var6 = var5.field_q[var7] & 255;
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackOut_23_0 = (an) var5;
              stackIn_24_0 = stackOut_23_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_25_0 = (RuntimeException) var2;
            stackOut_25_1 = new StringBuilder().append("jo.O(");
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param0 == null) {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L7;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_28_0, stackIn_28_2 + 44 + 1 + 41);
        }
        return stackIn_24_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = "Account created successfully!";
    }
}
