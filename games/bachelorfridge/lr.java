/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lr extends bw {
    int field_q;
    int[][] field_h;
    int field_f;
    private int field_n;
    int field_g;
    boolean field_i;
    private int[][][] field_p;
    wia[][] field_o;
    private int field_j;
    int field_m;
    private int field_l;
    static String[] field_k;

    final int[][] b(int param0, int param1) {
        if (param1 >= -1) {
            return (int[][]) null;
        }
        return this.field_p[param0];
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5, boolean param6, boolean param7, boolean param8, boolean param9) {
        int var11 = 0;
        L0: {
          var11 = BachelorFridge.field_y;
          if (param6) {
            break L0;
          } else {
            L1: {
              if (kg.field_b != dg.field_i) {
                break L1;
              } else {
                if (kq.field_i == dg.field_c) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (dg.field_c != hga.field_U.field_f) {
              break L0;
            } else {
              if (dg.field_i != hga.field_U.field_b) {
                break L0;
              } else {
                if (pw.field_w != null) {
                  pv.a(false, true);
                  break L0;
                } else {
                  if (null == rv.field_n) {
                    kf.a((byte) -6);
                    break L0;
                  } else {
                    pv.a(true, true);
                    break L0;
                  }
                }
              }
            }
          }
        }
        L2: {
          if (!param6) {
            ce.field_t = (-640 + kg.field_b) / 2;
            break L2;
          } else {
            ce.field_t = wq.field_n;
            break L2;
          }
        }
        L3: {
          nja.a(param6, (byte) 81);
          if (-1 <= (lfa.field_q ^ -1)) {
            break L3;
          } else {
            ada.a(param9, 0, param4, param6);
            break L3;
          }
        }
        L4: {
          cw.field_yb.field_L = rea.field_g.field_L;
          cw.field_yb.field_N = param5;
          if (0 < ld.field_p) {
            sr.a(true, param6, param4, param9);
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if ((dja.field_m ^ -1) < -1) {
            mh.a(param0, param6, param9, param4, (byte) -51);
            break L5;
          } else {
            break L5;
          }
        }
        L6: {
          L7: {
            if (!w.field_e) {
              break L7;
            } else {
              if (pw.field_w.field_Pb <= pw.field_w.field_Rb) {
                qba.field_m.field_wb.field_Z = oia.field_i;
                tv.field_o.field_u = false;
                nn.a((byte) -126, qba.field_m.field_vb);
                break L6;
              } else {
                break L7;
              }
            }
          }
          qba.field_m.field_wb.field_Z = null;
          tv.field_o.field_u = true;
          vt.a(qba.field_m, param4, 0, param8, param1);
          break L6;
        }
        sma.a(param7, param8, -6, param1, param2, param4, param3);
        vt.a(ak.field_q, param4, 0, param8, param1);
        qf.field_v = qf.field_v + 1;
    }

    final static void a(int param0, int param1, int param2, eaa param3, int param4, byte param5) {
        RuntimeException var6 = null;
        lh var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        eaa var10 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              param4 += 8;
              param1 -= 32;
              var6_ref = (lh) ((Object) param3.b((byte) 90));
              if (param5 == -4) {
                break L1;
              } else {
                var10 = (eaa) null;
                lr.a(44, -29, -91, (eaa) null, 24, -68);
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              if (var6_ref == null) {
                break L0;
              } else {
                L3: {
                  var8 = (8357 * var6_ref.field_i + var6_ref.field_h * 326565 & 63) + (var6_ref.field_o >> -207991455);
                  if (var8 <= 256) {
                    break L3;
                  } else {
                    var8 = 256;
                    break L3;
                  }
                }
                var7++;
                ed.field_f[3 + (var7 & 3)].a(param4 + (param2 * var6_ref.field_i >> -889186192) - 32, param1 + (-(param2 * var6_ref.field_q >> 2102823600) - 34), var6_ref.field_o << 566248001);
                var6_ref = (lh) ((Object) param3.c(0));
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var6);
            stackOut_9_1 = new StringBuilder().append("lr.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final boolean a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = BachelorFridge.field_y;
        if (!this.field_i) {
          var3 = 0;
          L0: while (true) {
            if (var3 >= this.field_m) {
              var3 = param0;
              L1: while (true) {
                if (var3 >= this.field_l) {
                  return true;
                } else {
                  var4 = 0;
                  L2: while (true) {
                    if (this.field_n <= var4) {
                      var3++;
                      continue L1;
                    } else {
                      L3: {
                        if (-1 == this.field_p[var3][var4][0]) {
                          break L3;
                        } else {
                          if (-1 != this.field_p[var3][var4][1]) {
                            var4++;
                            continue L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      return false;
                    }
                  }
                }
              }
            } else {
              if ((param1 ^ -1) == -3) {
                if (this.field_h[var3][0] == -1) {
                  return false;
                } else {
                  if (-1 == this.field_h[var3][1]) {
                    return false;
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              } else {
                var3++;
                continue L0;
              }
            }
          }
        } else {
          return true;
        }
    }

    final static void a(int param0, int param1, int param2, eaa param3, int param4, int param5) {
        RuntimeException var6 = null;
        lh var6_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var9 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var6_ref = (lh) ((Object) param3.b((byte) 90));
              if (param4 == 265949093) {
                break L1;
              } else {
                field_k = (String[]) null;
                break L1;
              }
            }
            var7 = 0;
            L2: while (true) {
              if (var6_ref == null) {
                break L0;
              } else {
                L3: {
                  var8 = (var6_ref.field_o >> 842776385) - -(630 & 8357 * var6_ref.field_i + var6_ref.field_h * 326565);
                  if (-257 <= (var8 ^ -1)) {
                    break L3;
                  } else {
                    var8 = 256;
                    break L3;
                  }
                }
                lw.field_b[1 + (var7 & 1)].a(-32 + param1 + (var6_ref.field_i >> 870558980), -32 + (-2 + (var6_ref.field_q >> 78991812) + param5) + -(var6_ref.field_h >> 265949093), 256 - ((var6_ref.field_o << -1516933694) + (var6_ref.field_o << -237713183)));
                var6_ref = (lh) ((Object) param3.c(0));
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (var6);
            stackOut_9_1 = new StringBuilder().append("lr.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param3 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(int param0) {
        field_k = null;
        if (param0 != 34) {
            lr.a(54);
        }
    }

    lr(lu param0) {
        int discarded$2 = 0;
        int discarded$3 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
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
        try {
          L0: {
            L1: {
              if (param0.b(16711935) != 0) {
                param0.field_g = param0.field_g - 1;
                this.field_j = 2;
                break L1;
              } else {
                discarded$2 = param0.b(16711935);
                this.field_j = param0.b(16711935);
                break L1;
              }
            }
            this.field_f = param0.b(16711935);
            this.field_q = param0.b(16711935);
            this.field_o = new wia[this.field_f][this.field_q];
            var2_int = 0;
            L2: while (true) {
              if (var2_int >= this.field_f) {
                this.field_l = param0.b(16711935);
                this.field_n = param0.b(16711935);
                this.field_m = param0.b(16711935);
                discarded$3 = param0.b(16711935);
                this.field_h = new int[this.field_m][2];
                var2_int = 0;
                L3: while (true) {
                  if (this.field_m <= var2_int) {
                    this.field_p = new int[this.field_l][this.field_n][2];
                    var2_int = 0;
                    L4: while (true) {
                      if (this.field_l <= var2_int) {
                        break L0;
                      } else {
                        var3 = 0;
                        L5: while (true) {
                          if (this.field_n <= var3) {
                            var2_int++;
                            continue L4;
                          } else {
                            this.field_p[var2_int][var3] = new int[]{param0.b(true), param0.b(true)};
                            var3++;
                            continue L5;
                          }
                        }
                      }
                    }
                  } else {
                    this.field_h[var2_int] = new int[]{param0.b(true), param0.b(true)};
                    var2_int++;
                    continue L3;
                  }
                }
              } else {
                var3 = 0;
                L6: while (true) {
                  if (this.field_q <= var3) {
                    var2_int++;
                    continue L2;
                  } else {
                    this.field_o[var2_int][var3] = new wia(param0.b(16711935));
                    this.field_o[var2_int][var3].field_a = param0.b(true);
                    var3++;
                    continue L6;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var2);
            stackOut_20_1 = new StringBuilder().append("lr.<init>(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ')');
        }
    }

    final boolean a(boolean param0, int param1, int param2, int param3, int param4) {
        if (this.field_i) {
            if (!(!param0)) {
                return true;
            }
        }
        if (param0) {
            return false;
        }
        if (!(this.field_l >= param1)) {
            return false;
        }
        if (param4 != -2581) {
            eaa var7 = (eaa) null;
            lr.a(-128, -48, 46, (eaa) null, -89, (byte) 122);
        }
        if (param3 > this.field_n) {
            return false;
        }
        if (param2 == this.field_j) {
            return true;
        }
        return false;
    }

    static {
    }
}
