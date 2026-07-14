/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wm extends ee {
    int field_P;
    private int field_K;
    private int field_Q;
    int field_T;
    int field_J;
    private int field_M;
    static ll field_U;
    int field_F;
    int field_D;
    private int field_I;
    hj field_H;
    int field_C;
    private ja field_G;
    private int field_R;
    private int[] field_S;
    om field_E;
    int field_O;

    final static void a(boolean param0, boolean param1, int param2) {
        int var4 = HoldTheLine.field_D;
        if (param1) {
            field_U = null;
        }
        lm.field_a = ej.field_b;
        if (param2 == dg.field_c) {
            if (-2 == (ej.field_b ^ -1)) {
                dg.field_c = 1;
                ((ti) (Object) l.field_a[1]).f(0);
            }
            ej.field_b = param2;
            return;
        }
        ej.field_b = param2;
        if (13 != dg.field_c) {
            // ifeq L122
            ((ti) (Object) l.field_a[dg.field_c]).i(123);
        } else {
            ((ec) (Object) l.field_a[dg.field_c]).d((byte) -116);
        }
        if (ej.field_b != 13) {
            // if_icmpeq L177
            ((ti) (Object) l.field_a[ej.field_b]).b(param0, -110);
        } else {
            ((ec) (Object) l.field_a[ej.field_b]).a((byte) 69, param0);
        }
    }

    final boolean a(int param0, qm param1) {
        if (!((wm) this).field_E.field_d) {
            // if_icmple L212
            return true;
        }
        float var3 = (float)(-((wm) this).field_A.field_h + param1.field_h);
        float var4 = (float)(param1.field_f - ((wm) this).field_A.field_f);
        float var5 = ((wm) this).field_w.field_g * var4 + ((wm) this).field_w.field_j * var3;
        float var6 = var3 * ((wm) this).field_w.field_g - var4 * ((wm) this).field_w.field_j;
        if (Math.abs(var5) < (float)((wm) this).field_E.field_m) {
            if (Math.abs(var6) < (float)((wm) this).field_E.field_h) {
                return true;
            }
        }
        if (param0 != 2048) {
            hj discarded$0 = ((wm) this).a((byte) -59);
            return false;
        }
        return false;
    }

    final void g(int param0) {
        float var2 = 0.0f;
        float var3 = 0.0f;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackOut_20_0 = null;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        L0: {
          if (((wm) this).field_S != null) {
            ((wm) this).field_R = ((wm) this).field_R - 1;
            if (((wm) this).field_R - 1 <= 0) {
              L1: {
                ((wm) this).field_I = ((wm) this).field_I + 1;
                if (((wm) this).field_K <= ((wm) this).field_I + 1) {
                  ((wm) this).field_I = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
              ((wm) this).field_Q = ((wm) this).field_S[((wm) this).field_I * 2];
              ((wm) this).field_R = ((wm) this).field_S[1 + ((wm) this).field_I * 2];
              break L0;
            } else {
              break L0;
            }
          } else {
            break L0;
          }
        }
        L2: {
          if ((4 & ((wm) this).field_J) == param0) {
            break L2;
          } else {
            ((wm) this).a(0);
            if (-1 == (((wm) this).field_J & 16 ^ -1)) {
              break L2;
            } else {
              ((wm) this).field_x = ((wm) this).field_x * o.field_c;
              ((wm) this).field_t = ((wm) this).field_t * o.field_c;
              if (((wm) this).field_t * ((wm) this).field_t + ((wm) this).field_x * ((wm) this).field_x < 0.25f) {
                ((wm) this).field_J = ((wm) this).field_J & -5;
                if ((((wm) this).field_J & 1024) == 0) {
                  break L2;
                } else {
                  ((wm) this).field_J = ((wm) this).field_J | 2048;
                  ((wm) this).a(fh.field_d, 98);
                  break L2;
                }
              } else {
                break L2;
              }
            }
          }
        }
        L3: {
          if ((8192 & ((wm) this).field_J) != 0) {
            this.a(false);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (0 == (((wm) this).field_J & 131072)) {
            break L4;
          } else {
            L5: {
              ((wm) this).field_C = ((wm) this).field_C - 1;
              if (0 == ((wm) this).field_C - 1) {
                L6: {
                  ((wm) this).field_J = ((wm) this).field_J & -131073;
                  ((wm) this).field_q = ((wm) this).field_T;
                  stackOut_20_0 = this;
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_21_0 = stackOut_20_0;
                  if ((((wm) this).field_J & 8) == 0) {
                    stackOut_22_0 = this;
                    stackOut_22_1 = 0;
                    stackIn_23_0 = stackOut_22_0;
                    stackIn_23_1 = stackOut_22_1;
                    break L6;
                  } else {
                    stackOut_21_0 = this;
                    stackOut_21_1 = 1;
                    stackIn_23_0 = stackOut_21_0;
                    stackIn_23_1 = stackOut_21_1;
                    break L6;
                  }
                }
                ((wm) this).field_z = stackIn_23_1 != 0;
                break L5;
              } else {
                break L5;
              }
            }
            var2 = (float)((wm) this).field_C / 150.0f;
            var3 = 0.1428571343421936f * var2 + (-(var2 * (-2.5714285373687744f * var2)) + var2 * -1.7142857313156128f * var2 * var2);
            ((wm) this).field_A.field_h = ((wm) this).field_D - (int)(var3 * (float)((wm) this).field_P);
            ((wm) this).field_A.field_f = -(int)(var3 * (float)((wm) this).field_O) + ((wm) this).field_F;
            break L4;
          }
        }
    }

    final hj a(byte param0) {
        if (param0 > -107) {
            ((wm) this).field_K = -60;
        }
        if ((32 & ((wm) this).field_J) == 0) {
            ((wm) this).field_H = ((wm) this).field_E.field_g[((wm) this).field_Q];
        } else {
            ((wm) this).field_H = ((wm) this).field_E.field_f[((wm) this).field_Q].a(((wm) this).field_r, 27788);
        }
        return ((wm) this).field_H;
    }

    private final void a(boolean param0) {
        float var2 = 0.0f;
        float var3 = 0.0f;
        int var3_int = 0;
        int var4 = 0;
        ja var4_ref_ja = null;
        int var5 = 0;
        float var5_float = 0.0f;
        int var6 = 0;
        float var6_float = 0.0f;
        int var7 = 0;
        float var7_float = 0.0f;
        int var8 = 0;
        float var8_float = 0.0f;
        int var9 = 0;
        float var9_float = 0.0f;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        L0: {
          var16 = HoldTheLine.field_D;
          if (((wm) this).field_M < -1) {
            ((wm) this).field_M = ((wm) this).field_M - 1;
            if (-1 != ((wm) this).field_M - 1) {
              break L0;
            } else {
              ((wm) this).field_J = ((wm) this).field_J | 2048;
              break L0;
            }
          } else {
            break L0;
          }
        }
        L1: {
          if (((wm) this).field_G != null) {
            break L1;
          } else {
            if ((((wm) this).field_J & 2048) != 0) {
              var2 = -1.0f;
              var3_int = 0;
              L2: while (true) {
                if (var3_int >= bl.field_r.field_h) {
                  break L1;
                } else {
                  if (var3_int != (((wm) this).field_J & 3)) {
                    var4_ref_ja = bl.field_r.field_C[var3_int];
                    if (var4_ref_ja != null) {
                      if (-1 <= ((wm) this).field_q + -var4_ref_ja.field_q) {
                        if (((wm) this).field_q - var4_ref_ja.field_q <= 1) {
                          var5_float = var4_ref_ja.field_y - ((wm) this).field_y;
                          var6_float = var4_ref_ja.field_u - ((wm) this).field_u;
                          var7_float = ((wm) this).field_w.field_j * var5_float + ((wm) this).field_w.field_g * var6_float;
                          var8_float = var5_float * ((wm) this).field_w.field_g - ((wm) this).field_w.field_j * var6_float;
                          if (2.0f * Math.abs(var8_float) < var7_float) {
                            L3: {
                              var9_float = Math.abs(var8_float) + var7_float;
                              if (null == ((wm) this).field_G) {
                                break L3;
                              } else {
                                if (var9_float < var2) {
                                  break L3;
                                } else {
                                  var3_int++;
                                  continue L2;
                                }
                              }
                            }
                            ((wm) this).field_G = var4_ref_ja;
                            var2 = var9_float;
                            var3_int++;
                            continue L2;
                          } else {
                            var3_int++;
                            continue L2;
                          }
                        } else {
                          var3_int++;
                          continue L2;
                        }
                      } else {
                        var3_int++;
                        continue L2;
                      }
                    } else {
                      var3_int++;
                      continue L2;
                    }
                  } else {
                    var3_int++;
                    continue L2;
                  }
                }
              }
            } else {
              break L1;
            }
          }
        }
        L4: {
          if (((wm) this).field_G == null) {
            break L4;
          } else {
            L5: {
              var2 = ha.a(((wm) this).field_A, ((wm) this).field_G.field_A, false);
              var3 = var2 - ((wm) this).field_r;
              if ((double)var3 <= 3.141592653589793) {
                break L5;
              } else {
                var3 = (float)((double)var3 - 6.283185307179586);
                break L5;
              }
            }
            L6: {
              if (-3.141592653589793 <= (double)var3) {
                break L6;
              } else {
                var3 = (float)((double)var3 + 6.283185307179586);
                break L6;
              }
            }
            L7: {
              if (10.0f < var3) {
                var3 = 10.0f;
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (var3 < -10.0f) {
                var3 = -10.0f;
                break L8;
              } else {
                break L8;
              }
            }
            ((wm) this).field_r = ((wm) this).field_r + var3;
            ((wm) this).field_w.a(((wm) this).field_r, (byte) -54);
            break L4;
          }
        }
        L9: {
          var2 = (float)Math.sqrt((double)(((wm) this).field_t * ((wm) this).field_t + ((wm) this).field_x * ((wm) this).field_x));
          var2 = var2 + 0.05000000074505806f * (55.0f - var2);
          ((wm) this).field_t = ((wm) this).field_w.field_j * var2;
          ((wm) this).field_x = var2 * ((wm) this).field_w.field_g;
          var3 = 4.0f * (float)Math.cos((double)((float)((wm) this).field_M / 10.0f));
          var4 = ((wm) this).field_A.field_h + -(int)(((wm) this).field_w.field_j * 5.0f) + (int)(((wm) this).field_w.field_g * var3);
          var5 = ((wm) this).field_A.field_f - ((int)(((wm) this).field_w.field_g * 5.0f) - -(int)(((wm) this).field_w.field_j * var3));
          if (!param0) {
            break L9;
          } else {
            ((wm) this).field_S = null;
            break L9;
          }
        }
        L10: {
          if (!bl.field_r.d((byte) 47)) {
            L11: {
              if (bl.field_r.field_ab % 2 != 0) {
                break L11;
              } else {
                jk discarded$3 = kn.a((int)(-((wm) this).field_w.field_j * 2048.0f), var5, 1, 64, 1, -2, var4, ((wm) this).field_q, bl.field_r.field_O, 12632256, (int)(-((wm) this).field_w.field_g * 2048.0f), 32, 4);
                break L11;
              }
            }
            var6 = (int)(1024.0f * -((wm) this).field_w.field_j);
            var7 = (int)(-((wm) this).field_w.field_g * 1024.0f);
            var6 = var6 + (-256 + kj.b(2, 512));
            var7 = var7 + (kj.b(2, 512) + -256);
            var8 = (kj.b(2, 128) | 520159104) << 1275358504;
            jk discarded$4 = kn.a(var6, var5, 0, 16, 1, -16, var4, ((wm) this).field_q, bl.field_r.field_O, var8, var7, 128, 1);
            break L10;
          } else {
            var6 = bl.field_r.field_C[((wm) this).field_J & 3].field_Eb;
            var7 = (int)(-((wm) this).field_w.field_j * 1024.0f);
            var8 = (int)(-((wm) this).field_w.field_g * 1024.0f);
            var9 = 0;
            L12: while (true) {
              if (-5 >= var9) {
                break L10;
              } else {
                L13: {
                  var11 = kj.b(2, 256);
                  if (-129 > var11) {
                    var10 = -16711936 & (-var11 + 256) * (16711935 & var6) | 16711680 & (var6 & 65280) * (256 + -var11);
                    var10 = var10 + (-16711936 & var11 * 16711935 | 16711680 & 65280 * var11);
                    var10 = var10 >>> 8;
                    break L13;
                  } else {
                    var10 = 16744448 | var11 - 128 << 973190824;
                    break L13;
                  }
                }
                var12 = var4 + dg.a(-2, -1, 2);
                var13 = dg.a(-2, -1, 2) + var5;
                var14 = var7 + dg.a(-512, -1, 512);
                var15 = dg.a(-512, -1, 512) + var8;
                jk discarded$5 = kn.a(var14, var13, 0, 16, 1, -16, var12, ((wm) this).field_q, bl.field_r.field_O, var10, var15, 128, 2);
                var9++;
                continue L12;
              }
            }
          }
        }
    }

    wm(qm param0, int param1, int param2) {
        super((float)param0.field_h, (float)param0.field_f, param2);
        this.a(-43, param1, 0.0f, 0.0f);
    }

    final void a(int[] param0, int param1) {
        ((wm) this).field_Q = 0;
        ((wm) this).field_S = param0;
        if (!(null == ((wm) this).field_S)) {
            ((wm) this).field_K = ((wm) this).field_S.length / 2;
            ((wm) this).field_I = 0;
            ((wm) this).field_Q = ((wm) this).field_S[0];
            ((wm) this).field_R = ((wm) this).field_S[1];
        }
        if (param1 < 3) {
            ((wm) this).field_K = -78;
        }
    }

    private final void a(int param0, int param1, float param2, float param3) {
        ((wm) this).field_E = ci.a(param1, (byte) 17);
        if (param0 >= -35) {
            ((wm) this).field_J = 78;
        }
        ((wm) this).field_J = ((wm) this).field_E.field_b;
        ((wm) this).field_x = param3;
        ((wm) this).field_t = param2;
        if (!((256 & ((wm) this).field_J) != 0)) {
            ((wm) this).a(((wm) this).field_E.field_l, 71);
        }
        if (0 != (8192 & ((wm) this).field_J)) {
            ((wm) this).field_G = null;
            ((wm) this).field_M = 5;
        }
        if (!(0 == (8 & ((wm) this).field_J))) {
            ((wm) this).field_B = ((wm) this).field_E.field_a;
            ((wm) this).field_z = true;
            if (-1 != (1024 & ((wm) this).field_J ^ -1)) {
                ((wm) this).field_B = 6;
            }
        }
    }

    public static void f(int param0) {
        field_U = null;
        if (param0 != -20668) {
            field_U = null;
        }
    }

    wm(qm param0, int param1, int param2, float param3, float param4, float param5) {
        super((float)param0.field_h, (float)param0.field_f, param2, param3);
        this.a(-62, param1, param4, param5);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_U = new ll();
    }
}
