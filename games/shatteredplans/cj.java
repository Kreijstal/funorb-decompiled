/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cj extends j {
    static String field_w;
    static boolean field_x;
    static String field_u;
    static String field_t;
    static String field_v;

    final int a(ln param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = param0.field_x;
              if (param0.field_u) {
                var3_int = var3_int * 2 + 5;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var3_int = var3_int + param0.field_D.length;
              if (param1 <= -49) {
                break L2;
              } else {
                field_v = (String) null;
                break L2;
              }
            }
            L3: {
              var3_int = var3_int + this.a((byte) -64, param0);
              if ((var3_int ^ -1) <= -2) {
                break L3;
              } else {
                var3_int = 1;
                break L3;
              }
            }
            stackIn_8_0 = var3_int;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("cj.GA(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L4;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    cj(dc param0, fs param1, mn param2) {
        super(param0, param1, param2, 2);
    }

    final int b(int param0, int param1) {
        int stackIn_40_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_42_0 = 0;
        int stackIn_44_0 = 0;
        fs stackIn_48_0 = null;
        fs stackIn_48_1 = null;
        fs stackOut_8_0;
        fs stackOut_8_1;
        int stackOut_21_0;
        int stackOut_22_0;
        int stackOut_23_0;
        int statePc = 0;
        int var3 = 0;
        ln var4 = null;
        int var5 = 0;
        ln[] var6 = null;
        int var7 = 0;
        ln var8 = null;
        int var9 = 0;
        ln[] var10 = null;
        int var11 = 0;
        ln var12 = null;
        int var13 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var13 = ShatteredPlansClient.field_F ? 1 : 0;
                    var3 = 0;
                    var4 = mj.field_yb.j(18229);
                    if (param1 == -1799) {
                        statePc = 61;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return -61;
                }
                case 5: {
                    return var3;
                }
                case 28: {
                    return var3;
                }
                case 29: {
                    var7++;
                    statePc = 55;
                    continue stateLoop;
                }
                case 30: {
                    var11++;
                    statePc = 45;
                    continue stateLoop;
                }
                case 31: {
                    var11++;
                    statePc = 45;
                    continue stateLoop;
                }
                case 32: {
                    var11++;
                    statePc = 45;
                    continue stateLoop;
                }
                case 33: {
                    var9 = 1;
                    statePc = 43;
                    continue stateLoop;
                }
                case 34: {
                    if (!this.field_n.field_h[var12.field_y.field_x]) {
                        statePc = 33;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 36: {
                    if (null != var12.field_y) {
                        statePc = 34;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 38: {
                    var12 = var10[var11];
                    if (this.field_n != var12.field_y) {
                        statePc = 36;
                    } else {
                        statePc = 30;
                    }
                    continue stateLoop;
                }
                case 40: {
                    stackIn_41_0 = stackIn_40_0;
                    stackIn_41_1 = 2;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    var5 = stackIn_41_0 + stackIn_41_1;
                    var7++;
                    statePc = 55;
                    continue stateLoop;
                }
                case 42: {
                    stackIn_41_0 = stackIn_42_0;
                    stackIn_41_1 = 1;
                    statePc = 41;
                    continue stateLoop;
                }
                case 43: {
                    stackIn_42_0 = var5;
                    stackIn_44_0 = stackIn_42_0;
                    if (var9 == 0) {
                        statePc = 42;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    stackIn_40_0 = stackIn_44_0;
                    statePc = 40;
                    continue stateLoop;
                }
                case 45: {
                    if (var10.length <= var11) {
                        statePc = 43;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 47: {
                    var9 = 0;
                    var10 = var8.field_D;
                    var11 = 0;
                    statePc = 45;
                    continue stateLoop;
                }
                case 48: {
                    if (stackIn_48_0 == stackIn_48_1) {
                        statePc = 47;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 50: {
                    var8 = var6[var7];
                    stackIn_48_0 = var8.field_y;
                    stackIn_48_1 = this.field_n;
                    statePc = 48;
                    continue stateLoop;
                }
                case 51: {
                    var5 = param0;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    wb.field_b[var4.field_p] = wb.field_b[var4.field_p] + var5;
                    param0 = param0 - var5;
                    var3 = var3 + var5;
                    var4 = mj.field_yb.h(-23410);
                    statePc = 61;
                    continue stateLoop;
                }
                case 53: {
                    var5 = var5 >> 1;
                    if (param0 >= var5) {
                        statePc = 52;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (var7 >= var6.length) {
                        statePc = 53;
                    } else {
                        statePc = 50;
                    }
                    continue stateLoop;
                }
                case 57: {
                    var5 = 0;
                    var6 = var4.field_D;
                    var7 = 0;
                    statePc = 55;
                    continue stateLoop;
                }
                case 59: {
                    if (param0 == 0) {
                        statePc = 5;
                    } else {
                        statePc = 57;
                    }
                    continue stateLoop;
                }
                case 61: {
                    if (var4 == null) {
                        statePc = 28;
                    } else {
                        statePc = 59;
                    }
                    continue stateLoop;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void c(boolean param0) {
        field_w = null;
        field_t = null;
        field_u = null;
        if (param0) {
            qr var2 = (qr) null;
            cj.a(40, -110, (qr) null);
        }
        field_v = null;
    }

    final int d(ln param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 2) {
                break L1;
              } else {
                cj.c(true);
                break L1;
              }
            }
            L2: {
              var3_int = param0.field_x - -param0.field_D.length;
              if (-1 == (var3_int ^ -1)) {
                stackIn_5_0 = 1;
                break L2;
              } else {
                stackIn_5_0 = var3_int;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("cj.F(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    final void g(int param0) {
        int[] stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int[] stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        L0: {
          var7 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0 == -18484) {
            break L0;
          } else {
            this.a((byte) -16, -120);
            break L0;
          }
        }
        this.field_k = -1;
        var2 = this.field_g.field_r;
        var3 = 0;
        L1: while (true) {
          if (var3 >= var2) {
            return;
          } else {
            var4 = this.field_g.field_m[var2 - 1 + -var3];
            if (this.field_n.field_x != var4) {
              if (!this.field_n.field_h[var4]) {
                if (-1 == (this.field_g.field_w & 1 << var4 ^ -1)) {
                  var5 = 1;
                  var6 = 0;
                  L2: while (true) {
                    if (this.field_g.field_r <= var6) {
                      L3: {
                        stackIn_23_0 = this.field_b;

                        stackIn_23_1 = var3;

                        if (var5 == 0) {
                          stackIn_24_0 = (int[]) ((Object) stackIn_23_0);
                          stackIn_24_1 = stackIn_23_1;
                          stackIn_24_2 = 4;
                          break L3;
                        } else {
                          stackIn_24_0 = (int[]) ((Object) stackIn_23_0);
                          stackIn_24_1 = stackIn_23_1;
                          stackIn_24_2 = -3;
                          break L3;
                        }
                      }
                      L4: {
                        stackIn_24_0[stackIn_24_1] = stackIn_24_2;
                        if (this.field_g.field_D[this.field_n.field_x] <= 2 * this.field_g.field_D[var3]) {
                          break L4;
                        } else {
                          this.field_b[var3] = 3;
                          var5 = 0;
                          break L4;
                        }
                      }
                      if (var5 != 0) {
                        if (-1 == this.field_k) {
                          this.field_k = var3;
                          var3++;
                          continue L1;
                        } else {
                          var3++;
                          continue L1;
                        }
                      } else {
                        var3++;
                        continue L1;
                      }
                    } else {
                      L5: {
                        L6: {
                          if ((var3 ^ -1) == (var6 ^ -1)) {
                            break L6;
                          } else {
                            if (this.field_g.field_v[var3].field_h[var6]) {
                              break L5;
                            } else {
                              break L6;
                            }
                          }
                        }
                        if (-1 != (1 << var6 & this.field_g.field_w ^ -1)) {
                          break L5;
                        } else {
                          var6++;
                          continue L2;
                        }
                      }
                      var5 = 0;
                      var6++;
                      continue L2;
                    }
                  }
                } else {
                  var3++;
                  continue L1;
                }
              } else {
                var3++;
                continue L1;
              }
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    final static void a(int param0, int param1, qr param2) {
        fc var11 = null;
        bi var12 = null;
        String var13 = null;
        fc var14 = null;
        bi var15 = null;
        String var16 = null;
        fc var17 = null;
        bi var18 = null;
        String var19 = null;
        fc var20 = null;
        String var22 = null;
        fc var23 = null;
        bi var24 = null;
        String var25 = null;
        fc var26 = null;
        bi var27 = null;
        String var28 = null;
        fc var29 = null;
        String var31 = null;
        fc var32 = null;
        bi var33 = null;
        String var34 = null;
        fc var35 = null;
        bi var36 = null;
        String var37 = null;
        fc var38 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        bi var21 = null;
        bi var30 = null;
        try {
            tp.a((int[]) null, 0L, (String) null, (String) null, 293, (ub) null, param2, param0, -1);
            if (!(0 != param0)) {
                var11 = hp.field_m;
                var12 = bh.field_m[0];
                var21 = var12;
                var30 = var21;
                var21 = var12;
                var13 = wi.field_a;
                var11.field_j.a(false, var12, var13, 11);
                var14 = hp.field_m;
                var15 = bh.field_m[1];
                var21 = var15;
                var30 = var21;
                var21 = var15;
                var16 = ts.field_H;
                var14.field_j.a(false, var15, var16, 12);
                var17 = hp.field_m;
                var18 = bh.field_m[2];
                var21 = var18;
                var30 = var21;
                var21 = var18;
                var19 = ah.field_O;
                var17.field_j.a(false, var18, var19, 13);
            }
            if (!((param0 ^ -1) != -2)) {
                var20 = hp.field_m;
                var21 = bh.field_m[0];
                var30 = var21;
                var30 = var21;
                var22 = hk.field_pb;
                var20.field_j.a(false, var21, var22, 11);
                var23 = hp.field_m;
                var24 = bh.field_m[1];
                var30 = var24;
                var30 = var24;
                var25 = so.field_s;
                var23.field_j.a(false, var24, var25, 12);
                var26 = hp.field_m;
                var27 = bh.field_m[2];
                var30 = var27;
                var30 = var27;
                var28 = gn.field_A;
                var26.field_j.a(false, var27, var28, 13);
            }
            if (!(2 != param0)) {
                var29 = hp.field_m;
                var30 = bh.field_m[0];
                var31 = sj.field_d;
                var29.field_j.a(false, var30, var31, 11);
                var32 = hp.field_m;
                var33 = bh.field_m[1];
                var34 = field_w;
                var32.field_j.a(false, var33, var34, 12);
                var35 = hp.field_m;
                var36 = bh.field_m[2];
                var37 = up.field_c;
                var35.field_j.a(false, var36, var37, 13);
            }
            var38 = hp.field_m;
            if (param1 > -107) {
                field_v = (String) null;
            }
            var4 = param2.field_B;
            var5 = param2.field_N;
            var6 = param2.field_K;
            var7 = param2.field_mb;
            var38.field_j.b(var6, var7, 0, var4, var5);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "cj.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(byte param0, int param1) {
        int var3;
        ln var4;
        int var5;
        int var6;
        ln[] var7_ref_ln__;
        int var8;
        ln var9;
        int var10;
        int var7;
        L0: {
          var10 = ShatteredPlansClient.field_F ? 1 : 0;
          if (param0 < -29) {
            break L0;
          } else {
            this.g(-98);
            break L0;
          }
        }
        var3 = 0;
        var4 = mj.field_yb.j(18229);
        L1: while (true) {
          if (var4 == null) {
            return var3;
          } else {
            var5 = var4.field_p;
            var6 = 0;
            var7_ref_ln__ = var4.field_D;
            var8 = 0;
            L2: while (true) {
              if (var7_ref_ln__.length <= var8) {
                ja.field_i[var5] = ja.field_i[var5] + var4.field_x;
                wb.field_b[var5] = var6;
                var7 = var6 + -var4.field_x;
                var4 = mj.field_yb.h(-23410);
                var3 = var3 + var7;
                continue L1;
              } else {
                var9 = var7_ref_ln__[var8];
                if (this.field_n != var9.field_y) {
                  var6++;
                  var8++;
                  continue L2;
                } else {
                  var8++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    static {
        field_w = "Show private chat from my friends and opponents";
        field_t = "Sol is unoccupied";
        field_v = "Menu";
    }
}
