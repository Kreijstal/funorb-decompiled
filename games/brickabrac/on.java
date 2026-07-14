/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class on extends bn {
    static String field_F;
    int field_H;
    int field_B;
    int field_N;
    static int[] field_D;
    private int field_v;
    private static int[] field_y;
    static int[] field_L;
    int field_M;
    ee[] field_P;
    static jp field_K;
    int field_S;
    int field_J;
    private int field_G;
    static jp[][] field_I;
    static int field_E;
    static kg field_x;
    static byte[] field_O;
    static mh field_A;
    static String field_z;
    int field_R;
    int field_C;
    static jp field_w;

    final int a(int param0, StringBuilder param1) {
        int var3 = 0;
        L0: {
          if (param0 > 79) {
            break L0;
          } else {
            ((on) this).f(-33);
            break L0;
          }
        }
        L1: {
          var3 = super.a(107, param1);
          if (param1 == null) {
            break L1;
          } else {
            StringBuilder discarded$4 = param1.append(((on) this).field_j + " " + ((on) this).field_m + " ");
            StringBuilder discarded$5 = param1.append(((on) this).field_k + " " + " " + ((on) this).field_o + " ");
            StringBuilder discarded$6 = param1.append(((on) this).field_G + " " + ((on) this).field_J + " " + ((on) this).field_S + " " + ((on) this).field_M + " ");
            StringBuilder discarded$7 = param1.append(((on) this).field_R + "\n");
            break L1;
          }
        }
        var3 = var3 ^ (((on) this).field_J * 19 + ((on) this).field_G * 23 - (-(((on) this).field_S * 17) - 4641) ^ 405 + 27 * ((on) this).field_N << -243762059 ^ 47802 + ((on) this).field_M * 3 << -970213756 ^ 4643 + ((on) this).field_R * 23 << -128595032);
        var3 = var3 ^ ((on) this).field_H * 7 - -35 << 1072801154;
        return var3;
    }

    private final void a(cl param0, byte param1) {
        int var5 = BrickABrac.field_J ? 1 : 0;
        if (!(!param0.field_p.a(false))) {
            return;
        }
        if (param1 > -87) {
            return;
        }
        ((on) this).field_G = param0.field_t;
        ((on) this).field_P = new ee[param0.field_p.e(119)];
        int var3 = 0;
        ee var4_ref_ee = (ee) (Object) param0.field_p.d(-38);
        while (var4_ref_ee != null) {
            var3++;
            ((on) this).field_P[var3] = var4_ref_ee;
            var4_ref_ee = (ee) (Object) param0.field_p.a((byte) 116);
        }
        ((on) this).field_v = -1 + ((on) this).field_P.length;
        ((on) this).field_C = 0;
        var3 = 0;
        int var4 = 0;
        while (var3 <= ((on) this).field_J) {
            var4 = var3;
            ((on) this).f(68);
            var3 = var3 + ((on) this).field_P[((on) this).field_C].field_t;
        }
        ((on) this).field_S = -var4 + ((on) this).field_J;
    }

    on() {
        this(0, 0, 0, 0, 0);
    }

    on(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        super(param0, param1, param2, param3, 8704, 4096, param4);
        ((on) this).field_R = -1;
        ((on) this).field_J = param7;
        ((on) this).field_N = param5;
        ((on) this).field_M = param6;
    }

    private final void a(j param0, int param1) {
        if (param1 != 15165) {
            ((on) this).a((byte) -67, false);
        }
        if ((((on) this).field_N & 2) != 0) {
            if (param0.a(26, ((on) this).field_i)) {
                param0.field_pb.a((nm) (Object) new ge(((on) this).field_j - -(((on) this).field_u / 2) - 2048, ((on) this).field_m - -(((on) this).field_s * 2), ((on) this).field_i), (byte) 3);
                if (!(!r.field_A)) {
                    jc.a(((on) this).field_i, 2, (byte) -92);
                }
            }
        }
    }

    final void a(cl param0, boolean param1, int param2) {
        this.a(param0, (byte) -105);
        ((on) this).a((byte) 36, param1);
        if (param2 != 4) {
            int discarded$0 = on.a((byte) -120, -81);
        }
    }

    final void a(byte param0, boolean param1) {
        ee var6 = ((on) this).field_P[((on) this).field_v];
        ee var4 = ((on) this).field_P[((on) this).field_C];
        ((on) this).field_k = -var6.field_j + var4.field_j;
        int var5 = var4.field_t;
        ((on) this).field_o = var4.field_m + -var6.field_m;
        if (param0 <= 33) {
            ((on) this).f(-3);
        }
        ((on) this).field_j = ((on) this).field_S * ((on) this).field_k / var5 + var6.field_j;
        ((on) this).field_m = var6.field_m + ((on) this).field_o * ((on) this).field_S / var5;
        if (param1) {
            ((on) this).field_k = ((on) this).field_k / var5;
            ((on) this).field_o = ((on) this).field_o / var5;
        } else {
            ((on) this).field_k = 0;
            ((on) this).field_o = 0;
        }
    }

    public static void d(int param0) {
        field_D = null;
        field_w = null;
        field_I = null;
        field_A = null;
        field_z = null;
        if (param0 != 4641) {
            field_x = null;
        }
        field_L = null;
        field_y = null;
        field_x = null;
        field_K = null;
        field_O = null;
        field_F = null;
    }

    final void a(byte param0, j param1, no param2) {
        int var5 = 0;
        int var6 = 0;
        vn var7 = null;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_25_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackOut_18_0;
        int stackOut_17_0;
        int stackOut_19_0;
        int stackOut_20_0;
        int stackOut_23_0;
        int stackOut_23_1;
        int stackOut_21_0;
        int stackOut_22_0;
        int stackOut_22_1;
        int stackOut_24_0;
        int stackOut_25_0;
        int stackOut_28_0;
        int stackOut_28_1;
        int stackOut_26_0;
        int stackOut_27_0;
        int stackOut_27_1;
        var6 = BrickABrac.field_J ? 1 : 0;
        var7 = (vn) (Object) param2;
        if (((on) this).field_i != 28) {
          L0: {
            L1: {
              if ((sg.field_n & 1 << ((on) this).field_i) != 0) {
                break L1;
              } else {
                if (var7.field_v != 0) {
                  break L0;
                } else {
                  if (var7.field_J != 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L2: {
              L3: {
                super.a((byte) 53, param1, param2);
                var7.field_I = var7.field_I + 1;
                if (sh.field_a == 8) {
                  break L3;
                } else {
                  if ((sh.field_a ^ -1) != -5) {
                    var7.field_o = -var7.field_o;
                    var5 = ae.field_b * (((on) this).field_o - var7.field_o);
                    if ((var5 ^ -1) <= -1) {
                      break L2;
                    } else {
                      var7.field_o = ((on) this).field_o;
                      break L2;
                    }
                  } else {
                    break L3;
                  }
                }
              }
              var7.field_k = -var7.field_k;
              var5 = mn.field_A * (((on) this).field_k - var7.field_k);
              if (0 <= var5) {
                break L2;
              } else {
                var7.field_k = ((on) this).field_k;
                break L2;
              }
            }
            var7.field_C = var7.field_C + 1;
            if (-1 == (var7.field_I & 3 ^ -1)) {
              var7.field_k = var7.field_k + (-param1.a(4, (byte) 62) + 2);
              var7.field_o = var7.field_o + (2 + -param1.a(4, (byte) 62));
              break L0;
            } else {
              break L0;
            }
          }
          L4: {
            if (-1 != (var7.field_J ^ -1)) {
              stackOut_18_0 = 0;
              stackIn_19_0 = stackOut_18_0;
              break L4;
            } else {
              stackOut_17_0 = 1;
              stackIn_19_0 = stackOut_17_0;
              break L4;
            }
          }
          L5: {
            L6: {
              var5 = stackIn_19_0;
              stackOut_19_0 = var5;
              stackIn_22_0 = stackOut_19_0;
              stackIn_20_0 = stackOut_19_0;
              if (((on) this).field_i != -20) {
                break L6;
              } else {
                stackOut_20_0 = stackIn_20_0;
                stackIn_23_0 = stackOut_20_0;
                stackIn_21_0 = stackOut_20_0;
                if (-2 != sh.field_a) {
                  stackOut_23_0 = stackIn_23_0;
                  stackOut_23_1 = 0;
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  break L5;
                } else {
                  stackOut_21_0 = stackIn_21_0;
                  stackIn_22_0 = stackOut_21_0;
                  break L6;
                }
              }
            }
            stackOut_22_0 = stackIn_22_0;
            stackOut_22_1 = 1;
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            break L5;
          }
          L7: {
            L8: {
              var5 = stackIn_24_0 & stackIn_24_1;
              stackOut_24_0 = var5;
              stackIn_27_0 = stackOut_24_0;
              stackIn_25_0 = stackOut_24_0;
              if (20 != ((on) this).field_i) {
                break L8;
              } else {
                stackOut_25_0 = stackIn_25_0;
                stackIn_28_0 = stackOut_25_0;
                stackIn_26_0 = stackOut_25_0;
                if (sh.field_a != 2) {
                  stackOut_28_0 = stackIn_28_0;
                  stackOut_28_1 = 0;
                  stackIn_29_0 = stackOut_28_0;
                  stackIn_29_1 = stackOut_28_1;
                  break L7;
                } else {
                  stackOut_26_0 = stackIn_26_0;
                  stackIn_27_0 = stackOut_26_0;
                  break L8;
                }
              }
            }
            stackOut_27_0 = stackIn_27_0;
            stackOut_27_1 = 1;
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            break L7;
          }
          L9: {
            L10: {
              var5 = stackIn_29_0 & stackIn_29_1;
              if (var5 != 0) {
                L11: {
                  if (25 != ((on) this).field_i) {
                    break L11;
                  } else {
                    param1.a(-27);
                    break L11;
                  }
                }
                if (((on) this).field_i != 27) {
                  L12: {
                    L13: {
                      if (((on) this).field_i != -27) {
                        break L13;
                      } else {
                        if (-28 != ((on) this).field_R) {
                          break L13;
                        } else {
                          ((on) this).field_i = 27;
                          ((on) this).field_R = 0;
                          ((on) this).field_B = 1;
                          break L12;
                        }
                      }
                    }
                    L14: {
                      if (param1.field_l + 1 != ej.field_E[((on) this).field_i]) {
                        if ((((on) this).field_N & 1) != 0) {
                          break L14;
                        } else {
                          param1.field_l = 0;
                          break L14;
                        }
                      } else {
                        param1.field_l = param1.field_l + 1;
                        break L14;
                      }
                    }
                    L15: {
                      ((on) this).field_R = ue.field_b[((on) this).field_i];
                      ((on) this).field_B = rb.field_a[((on) this).field_i];
                      if ((rb.field_a[((on) this).field_i] ^ -1) > -1) {
                        if (param1.a(100, (byte) 62) < -66) {
                          if (-2 != sh.field_a) {
                            if (sh.field_a == 2) {
                              ((on) this).field_B = 7;
                              break L15;
                            } else {
                              if (-9 != (sh.field_a ^ -1)) {
                                ((on) this).field_B = 9;
                                break L15;
                              } else {
                                ((on) this).field_B = 8;
                                break L15;
                              }
                            }
                          } else {
                            ((on) this).field_B = 6;
                            break L15;
                          }
                        } else {
                          ((on) this).field_B = param1.a(6, (byte) 62);
                          break L15;
                        }
                      } else {
                        break L15;
                      }
                    }
                    this.a(param1, 15165);
                    break L12;
                  }
                  ((on) this).field_l = 0;
                  break L10;
                } else {
                  if (((on) this).field_R == 26) {
                    if (19 != ((on) this).field_i) {
                      break L9;
                    } else {
                      if ((((on) this).field_R ^ -1) <= -1) {
                        break L9;
                      } else {
                        ((on) this).field_R = ((on) this).field_i;
                        ((on) this).field_B = 12;
                        break L9;
                      }
                    }
                  } else {
                    if (19 != ((on) this).field_i) {
                      break L9;
                    } else {
                      if ((((on) this).field_R ^ -1) <= -1) {
                        break L9;
                      } else {
                        ((on) this).field_R = ((on) this).field_i;
                        ((on) this).field_B = 12;
                        break L9;
                      }
                    }
                  }
                }
              } else {
                break L10;
              }
            }
            if (19 != ((on) this).field_i) {
              break L9;
            } else {
              if (((on) this).field_R <= -1) {
                break L9;
              } else {
                ((on) this).field_R = ((on) this).field_i;
                ((on) this).field_B = 12;
                break L9;
              }
            }
          }
          L16: {
            if (20 != ((on) this).field_i) {
              break L16;
            } else {
              if (-1 > ((on) this).field_R) {
                ((on) this).field_B = 12;
                ((on) this).field_R = ((on) this).field_i;
                break L16;
              } else {
                break L16;
              }
            }
          }
          L17: {
            if (param0 == 53) {
              break L17;
            } else {
              field_F = null;
              break L17;
            }
          }
          return;
        } else {
          param1.a((byte) -63, (on) this, var7);
          return;
        }
    }

    final boolean a(no param0, byte param1) {
        if (0 != (4 & ((on) this).field_N)) {
            if (((on) this).field_P[((on) this).field_v].field_t == 1) {
                if (0 == ((on) this).field_S) {
                    return false;
                }
            }
        }
        if ((1 << ((on) this).field_i & sg.field_n) == 0) {
            if (0 != ((vn) (Object) param0).field_J) {
                return false;
            }
        }
        if (((on) this).field_R == 0) {
            return false;
        }
        int var3 = -83 % ((-29 - param1) / 35);
        return super.a(param0, (byte) -120);
    }

    final static void e(int param0) {
        int var1 = (-640 + kp.field_a) / 2;
        int var2 = hj.field_Yb * hj.field_Yb;
        int var3 = var2 - ml.field_b * ml.field_b;
        fe.field_gb.a(-124 + (lb.field_d + -90), 90, -(199 * var3 / var2) + var1, 199, (byte) 64);
        if (param0 >= -50) {
            on.d(61);
        }
        rm.field_a.a(-4 + lb.field_d + -120, 0, 438 * var3 / var2 + (var1 - -202), 438, (byte) 64);
    }

    on(int param0, int param1, int param2, int param3, int param4) {
        this(param0, param1, param2, param3, param4, 0, 0, 0);
    }

    final void f(int param0) {
        ((on) this).field_C = ((on) this).field_C + 1;
        ((on) this).field_C = (((on) this).field_C + 1) % ((on) this).field_P.length;
        ((on) this).field_v = ((on) this).field_v + 1;
        ((on) this).field_v = (((on) this).field_v + 1) % ((on) this).field_P.length;
        if (param0 <= 61) {
            Object var3 = null;
            ((on) this).a(-99, (wq) null);
        }
        ((on) this).field_J = ((on) this).field_J % ((on) this).field_G;
        ((on) this).field_S = 0;
    }

    final static int a(byte param0, int param1) {
        int var4 = BrickABrac.field_J ? 1 : 0;
        qj.field_j = 0;
        dm.field_d = null;
        fc.field_e = null;
        int var2 = gd.field_a;
        gd.field_a = up.field_z;
        int var3 = -47 / ((param0 - -22) / 61);
        if (-52 == (param1 ^ -1)) {
            vd.field_f.field_f = 2;
        } else {
            if ((param1 ^ -1) != -51) {
                vd.field_f.field_f = 1;
            } else {
                vd.field_f.field_f = 5;
            }
        }
        up.field_z = var2;
        vd.field_f.field_i = vd.field_f.field_i + 1;
        if (2 <= vd.field_f.field_i) {
            if (param1 == -52) {
                return 2;
            }
        }
        if (-3 <= vd.field_f.field_i) {
            if (!(param1 != 50)) {
                return 5;
            }
        }
        if (!(-5 < (vd.field_f.field_i ^ -1))) {
            return 1;
        }
        return -1;
    }

    final void a(int param0, wq param1) {
        if (param0 <= 89) {
            Object var4 = null;
            this.a((cl) null, (byte) 44);
        }
        super.a(93, param1);
        ((on) this).field_R = param1.b(true);
        if ((((on) this).field_R ^ -1) < -1) {
            ((on) this).field_B = param1.l(255);
        }
        ((on) this).field_N = param1.l(255) & 255;
        if (!((4 & ((on) this).field_N) == 0)) {
            ((on) this).field_M = param1.l(255);
            ((on) this).field_J = param1.i(65280);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        double var1 = 0.0;
        field_y = new int[65536];
        field_L = new int[65536];
        field_D = new int[]{100, 200, 300, 300, 500, 100, 300, 300, 500, 200, 500, 500, 500, 1000, 300, 1000, 100, 300, 500, 300, 500, 1000, 500, 300, 500, 1000, 300, 200, 500, 200, 100, 200, 100, 200, 100, 100, 100, 100, 100, 500, 1000, 200};
        field_F = "You must play <%1> more rated games before playing with the current options.";
        var0 = 0;
        L0: while (true) {
          if (var0 >= 65536) {
            var0 = 0;
            L1: while (true) {
              if ((var0 ^ -1) <= -65537) {
                field_z = "<%0> has lost connection.";
              } else {
                var1 = Math.sqrt((double)var0);
                field_y[var0] = (int)Math.floor((double)var0 * 0.0234375 + (-(9.0 * var1) + 768.5));
                var0++;
                continue L1;
              }
            }
          } else {
            var1 = 256.0 - Math.sqrt((double)var0);
            field_L[var0] = (int)(var1 * var1 + 0.5);
            var0++;
            continue L0;
          }
        }
    }
}
