/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class km implements mn {
    private int[] field_r;
    static ln field_u;
    private int field_D;
    int field_S;
    private int[] field_t;
    k field_Q;
    private int field_g;
    private int field_Z;
    private db field_ab;
    private int[] field_U;
    int field_N;
    boolean[] field_V;
    sd field_c;
    boolean field_L;
    int field_i;
    private boolean[] field_w;
    int field_q;
    private db field_o;
    dc field_P;
    static String field_a;
    private int field_I;
    private boolean field_G;
    private int[] field_J;
    int field_m;
    uj[] field_s;
    private sf field_E;
    private int[] field_d;
    int field_h;
    boolean field_j;
    static String field_A;
    private int field_k;
    private int field_F;
    private sd[] field_l;
    private pf field_H;
    kq field_Y;
    private int[] field_C;
    private int field_x;
    private boolean field_b;
    private fs[] field_R;
    tr field_z;
    private wb field_v;
    private ln field_K;
    boolean field_f;
    boolean field_W;
    private boolean field_T;
    static qr field_e;
    private int field_O;
    boolean field_M;
    private boolean field_y;
    private int[] field_p;
    static String field_X;
    fs field_n;

    private final void a(fs param0, String param1, byte param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        String[] var9 = null;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 51) {
                break L1;
              } else {
                this.field_q = -105;
                break L1;
              }
            }
            if (this.field_W) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L2: {
                var4_ref = param0.field_t + ": ";
                var5 = ji.field_I.field_K;
                if (this.field_f) {
                  var5 = var5 - ho.field_f.c("[" + re.a(he.field_q, 4371, new String[]{this.field_P.field_v[0].field_t}) + "] ");
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (this.field_f) {
                  stackOut_15_0 = 0;
                  stackIn_16_0 = stackOut_15_0;
                  break L3;
                } else {
                  stackOut_13_0 = param0.field_k;
                  stackIn_16_0 = stackOut_13_0;
                  break L3;
                }
              }
              L4: {
                var6 = stackIn_16_0;
                var7 = -ho.field_f.c(var4_ref) + var5 + -20;
                if (var7 >= ho.field_f.c(param1)) {
                  md.a(1, var4_ref + param1, var6, ln.field_o, this.field_P.field_v[0].field_t, -16169);
                  break L4;
                } else {
                  var8 = vi.a(ho.field_f, (byte) 125, param1, new int[]{var7});
                  var9 = var8;
                  var10 = 0;
                  L5: while (true) {
                    if (var9.length <= var10) {
                      break L4;
                    } else {
                      var11 = var9[var10];
                      md.a(1, var4_ref + var11, var6, ln.field_o, this.field_P.field_v[0].field_t, -16169);
                      var10++;
                      continue L5;
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var4);
            stackOut_26_1 = new StringBuilder().append("km.HA(");
            stackIn_29_0 = stackOut_26_0;
            stackIn_29_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L6;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_30_0 = stackOut_27_0;
              stackIn_30_1 = stackOut_27_1;
              stackIn_30_2 = stackOut_27_2;
              break L6;
            }
          }
          L7: {
            stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
            stackOut_30_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',');
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) ((Object) stackIn_33_0);
              stackOut_33_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L7;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_34_0 = stackOut_31_0;
              stackIn_34_1 = stackOut_31_1;
              stackIn_34_2 = stackOut_31_2;
              break L7;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_34_0), stackIn_34_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(byte param0, fs param1) {
        sd var3 = null;
        RuntimeException var3_ref = null;
        ln var4_ref_ln = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3 = (sd) ((Object) param1.field_i.d(0));
            L1: while (true) {
              if (var3 == null) {
                var4 = 107 % ((param0 - 77) / 37);
                break L0;
              } else {
                var4_ref_ln = var3.j(18229);
                L2: while (true) {
                  if (var4_ref_ln == null) {
                    var3.b((byte) -89);
                    var3 = (sd) ((Object) param1.field_i.a((byte) -71));
                    continue L1;
                  } else {
                    var4_ref_ln.field_R = null;
                    var4_ref_ln.field_y = null;
                    var4_ref_ln.b((byte) -83);
                    var4_ref_ln = var3.h(-23410);
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var3_ref);
            stackOut_11_1 = new StringBuilder().append("km.MA(").append(param0).append(',');
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    private final void a(int param0, ob param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              this.field_P.a(param2, (byte) -124, param1);
              if (param0 == 1) {
                break L1;
              } else {
                this.field_r = (int[]) null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("km.OA(").append(param0).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, boolean param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0) {
              L1: {
                if (this.field_f) {
                  break L1;
                } else {
                  qn.b(117);
                  var3_int = param1 ? 1 : 0;
                  ta.a(0, 0, (byte) 96, var3_int != 0);
                  break L1;
                }
              }
              L2: {
                if (-1 == de.field_j) {
                  break L2;
                } else {
                  if ((de.field_j ^ -1) != (uc.field_A ^ -1)) {
                    ta.b((byte) -69);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) ((Object) runtimeException), "km.WA(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(fs param0, int param1) {
        RuntimeException var3 = null;
        ln[] var3_array = null;
        ln[] var4_ref_ln__ = null;
        int var4 = 0;
        int var5_int = 0;
        ln[] var5 = null;
        ln var6_ref_ln = null;
        int var6 = 0;
        mg var7 = null;
        int var7_int = 0;
        ln var7_ref = null;
        int var8 = 0;
        ln[] var8_ref_ln__ = null;
        int var9 = 0;
        ln[] var10 = null;
        ln var10_ref = null;
        int var11 = 0;
        ln var12 = null;
        int var13 = 0;
        fs stackIn_8_0 = null;
        fs stackIn_8_1 = null;
        RuntimeException stackIn_125_0 = null;
        StringBuilder stackIn_125_1 = null;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        String stackIn_128_2 = null;
        RuntimeException decompiledCaughtException = null;
        fs stackOut_6_0 = null;
        fs stackOut_6_1 = null;
        RuntimeException stackOut_124_0 = null;
        StringBuilder stackOut_124_1 = null;
        RuntimeException stackOut_127_0 = null;
        StringBuilder stackOut_127_1 = null;
        String stackOut_127_2 = null;
        RuntimeException stackOut_125_0 = null;
        StringBuilder stackOut_125_1 = null;
        String stackOut_125_2 = null;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_array = this.field_P.field_g.field_e;
              if (param1 <= -65) {
                break L1;
              } else {
                this.d((byte) -75);
                break L1;
              }
            }
            var4_ref_ln__ = var3_array;
            var5_int = 0;
            L2: while (true) {
              if ((var4_ref_ln__.length ^ -1) >= (var5_int ^ -1)) {
                L3: {
                  if (this.field_P.field_o.field_k) {
                    var4_ref_ln__ = var3_array;
                    var5_int = 0;
                    L4: while (true) {
                      if (var4_ref_ln__.length <= var5_int) {
                        break L3;
                      } else {
                        var6_ref_ln = var4_ref_ln__[var5_int];
                        this.field_t[var6_ref_ln.field_p] = 0;
                        this.field_r[var6_ref_ln.field_p] = 0;
                        var5_int++;
                        continue L4;
                      }
                    }
                  } else {
                    if (!this.field_P.field_o.field_l) {
                      var4_ref_ln__ = var3_array;
                      var5_int = 0;
                      L5: while (true) {
                        if ((var5_int ^ -1) <= (var4_ref_ln__.length ^ -1)) {
                          break L3;
                        } else {
                          var6_ref_ln = var4_ref_ln__[var5_int];
                          var7_int = var6_ref_ln.field_p;
                          var8 = 0;
                          var9 = 0;
                          var10 = var6_ref_ln.field_D;
                          var11 = 0;
                          L6: while (true) {
                            if ((var10.length ^ -1) >= (var11 ^ -1)) {
                              this.field_t[var7_int] = var8;
                              this.field_r[var7_int] = var9;
                              var5_int++;
                              continue L5;
                            } else {
                              L7: {
                                var12 = var10[var11];
                                if (!this.field_w[var12.field_p]) {
                                  var8++;
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              L8: {
                                if (this.field_V[var12.field_p]) {
                                  break L8;
                                } else {
                                  var9++;
                                  break L8;
                                }
                              }
                              var11++;
                              continue L6;
                            }
                          }
                        }
                      }
                    } else {
                      var4_ref_ln__ = var3_array;
                      var5_int = 0;
                      L9: while (true) {
                        if ((var4_ref_ln__.length ^ -1) >= (var5_int ^ -1)) {
                          break L3;
                        } else {
                          var6_ref_ln = var4_ref_ln__[var5_int];
                          this.field_t[var6_ref_ln.field_p] = 1;
                          this.field_r[var6_ref_ln.field_p] = 1;
                          var5_int++;
                          continue L9;
                        }
                      }
                    }
                  }
                }
                L10: {
                  if (!this.field_P.field_o.field_k) {
                    var4 = 1;
                    L11: while (true) {
                      if (var4 == 0) {
                        break L10;
                      } else {
                        var4 = 0;
                        var5 = var3_array;
                        var6 = 0;
                        L12: while (true) {
                          if ((var5.length ^ -1) >= (var6 ^ -1)) {
                            continue L11;
                          } else {
                            L13: {
                              var7_ref = var5[var6];
                              var8 = var7_ref.field_p;
                              if (!this.field_w[var8]) {
                                break L13;
                              } else {
                                if (this.field_t[var8] > this.field_p[var8]) {
                                  this.field_w[var8] = false;
                                  var9 = 1 + this.field_d[var8];
                                  var4 = 1;
                                  var10 = var7_ref.field_D;
                                  var11 = 0;
                                  L14: while (true) {
                                    if ((var10.length ^ -1) >= (var11 ^ -1)) {
                                      break L13;
                                    } else {
                                      L15: {
                                        var12 = var10[var11];
                                        if (this.field_P.field_o.field_l) {
                                          this.field_t[var12.field_p] = 1;
                                          break L15;
                                        } else {
                                          this.field_t[var12.field_p] = this.field_t[var12.field_p] + 1;
                                          break L15;
                                        }
                                      }
                                      L16: {
                                        L17: {
                                          if ((this.field_d[var12.field_p] ^ -1) < (var9 ^ -1)) {
                                            break L17;
                                          } else {
                                            if (this.field_w[var12.field_p]) {
                                              break L17;
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                        this.field_d[var12.field_p] = var9;
                                        break L16;
                                      }
                                      var11++;
                                      continue L14;
                                    }
                                  }
                                } else {
                                  break L13;
                                }
                              }
                            }
                            L18: {
                              if (!this.field_V[var8]) {
                                break L18;
                              } else {
                                if (this.field_r[var8] <= this.field_J[var8]) {
                                  break L18;
                                } else {
                                  this.field_V[var8] = false;
                                  this.field_J[var8] = 0;
                                  var9 = 1 + this.field_U[var8];
                                  var4 = 1;
                                  var10 = var7_ref.field_D;
                                  var11 = 0;
                                  L19: while (true) {
                                    if ((var11 ^ -1) <= (var10.length ^ -1)) {
                                      break L18;
                                    } else {
                                      L20: {
                                        var12 = var10[var11];
                                        if (this.field_P.field_o.field_l) {
                                          this.field_r[var12.field_p] = 1;
                                          break L20;
                                        } else {
                                          this.field_r[var12.field_p] = this.field_r[var12.field_p] + 1;
                                          break L20;
                                        }
                                      }
                                      L21: {
                                        L22: {
                                          if (var9 < this.field_U[var12.field_p]) {
                                            break L22;
                                          } else {
                                            if (!this.field_V[var12.field_p]) {
                                              break L21;
                                            } else {
                                              break L22;
                                            }
                                          }
                                        }
                                        this.field_U[var12.field_p] = var9;
                                        break L21;
                                      }
                                      var11++;
                                      continue L19;
                                    }
                                  }
                                }
                              }
                            }
                            var6++;
                            continue L12;
                          }
                        }
                      }
                    }
                  } else {
                    break L10;
                  }
                }
                this.field_z.a(this.field_p, this.field_t, this.field_U, this.field_V, this.field_w, this.field_d, this.field_r, this.field_J, 0);
                break L0;
              } else {
                var6_ref_ln = var4_ref_ln__[var5_int];
                this.field_d[var6_ref_ln.field_p] = 0;
                this.field_U[var6_ref_ln.field_p] = 0;
                stackOut_6_0 = var6_ref_ln.field_y;
                stackOut_6_1 = (fs) (param0);
                stackIn_8_0 = stackOut_6_0;
                stackIn_8_1 = stackOut_6_1;
                L23: {
                  if (stackIn_8_0 == stackIn_8_1) {
                    this.field_w[var6_ref_ln.field_p] = true;
                    this.field_p[var6_ref_ln.field_p] = var6_ref_ln.field_J;
                    this.field_V[var6_ref_ln.field_p] = true;
                    this.field_J[var6_ref_ln.field_p] = var6_ref_ln.field_J;
                    break L23;
                  } else {
                    this.field_w[var6_ref_ln.field_p] = false;
                    this.field_p[var6_ref_ln.field_p] = 0;
                    this.field_V[var6_ref_ln.field_p] = false;
                    this.field_J[var6_ref_ln.field_p] = 0;
                    break L23;
                  }
                }
                var7 = (mg) ((Object) var6_ref_ln.field_s.c(-128));
                L24: while (true) {
                  if (null == var7) {
                    L25: {
                      if (null == param0) {
                        break L25;
                      } else {
                        var8_ref_ln__ = var6_ref_ln.field_D;
                        var9 = 0;
                        L26: while (true) {
                          if (var9 >= var8_ref_ln__.length) {
                            break L25;
                          } else {
                            L27: {
                              var10_ref = var8_ref_ln__[var9];
                              if (param0 == var10_ref.field_y) {
                                break L27;
                              } else {
                                if (null == var10_ref.field_y) {
                                  break L27;
                                } else {
                                  L28: {
                                    if (!var10_ref.field_y.field_h[param0.field_x]) {
                                      break L28;
                                    } else {
                                      if (var6_ref_ln.field_y == param0) {
                                        break L27;
                                      } else {
                                        break L28;
                                      }
                                    }
                                  }
                                  this.field_V[var6_ref_ln.field_p] = false;
                                  this.field_J[var6_ref_ln.field_p] = 0;
                                  break L25;
                                }
                              }
                            }
                            var9++;
                            continue L26;
                          }
                        }
                      }
                    }
                    var5_int++;
                    continue L2;
                  } else {
                    L29: {
                      if (param0 == var7.field_G) {
                        L30: {
                          this.field_p[var6_ref_ln.field_p] = this.field_p[var6_ref_ln.field_p] + var7.field_z;
                          this.field_w[var6_ref_ln.field_p] = true;
                          if (param0 == var7.field_B.field_y) {
                            break L30;
                          } else {
                            if ((var7.field_B.field_x ^ -1) != -1) {
                              break L29;
                            } else {
                              break L30;
                            }
                          }
                        }
                        this.field_J[var6_ref_ln.field_p] = this.field_J[var6_ref_ln.field_p] + var7.field_z;
                        this.field_V[var6_ref_ln.field_p] = true;
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                    var7 = (mg) ((Object) var6_ref_ln.field_s.b(32));
                    continue L24;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L31: {
            var3 = decompiledCaughtException;
            stackOut_124_0 = (RuntimeException) (var3);
            stackOut_124_1 = new StringBuilder().append("km.RA(");
            stackIn_127_0 = stackOut_124_0;
            stackIn_127_1 = stackOut_124_1;
            stackIn_125_0 = stackOut_124_0;
            stackIn_125_1 = stackOut_124_1;
            if (param0 == null) {
              stackOut_127_0 = (RuntimeException) ((Object) stackIn_127_0);
              stackOut_127_1 = (StringBuilder) ((Object) stackIn_127_1);
              stackOut_127_2 = "null";
              stackIn_128_0 = stackOut_127_0;
              stackIn_128_1 = stackOut_127_1;
              stackIn_128_2 = stackOut_127_2;
              break L31;
            } else {
              stackOut_125_0 = (RuntimeException) ((Object) stackIn_125_0);
              stackOut_125_1 = (StringBuilder) ((Object) stackIn_125_1);
              stackOut_125_2 = "{...}";
              stackIn_128_0 = stackOut_125_0;
              stackIn_128_1 = stackOut_125_1;
              stackIn_128_2 = stackOut_125_2;
              break L31;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_128_0), stackIn_128_2 + ',' + param1 + ')');
        }
    }

    private final void b(int param0, ob param1, int param2) {
        RuntimeException var4 = null;
        qa var4_ref = null;
        mg var5 = null;
        ln[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        ln var9 = null;
        int var10 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            this.field_P.a(param0, (byte) -127, param1);
            var4_ref = (qa) ((Object) this.field_P.field_q.d(0));
            L1: while (true) {
              if (null == var4_ref) {
                var5 = (mg) ((Object) this.field_P.field_p.a(true));
                L2: while (true) {
                  if (var5 == null) {
                    var6 = this.field_P.field_g.field_e;
                    var7 = 0;
                    var8 = -104 % ((param2 - -36) / 56);
                    L3: while (true) {
                      if ((var7 ^ -1) <= (var6.length ^ -1)) {
                        this.a(this.field_n, -94);
                        break L0;
                      } else {
                        var9 = var6[var7];
                        fl.a(var9, (byte) 49);
                        kr.a((byte) -127, var9);
                        var7++;
                        continue L3;
                      }
                    }
                  } else {
                    var5.field_y.field_J = var5.field_y.field_J - var5.field_z;
                    var5 = (mg) ((Object) this.field_P.field_p.a((byte) -68));
                    continue L2;
                  }
                }
              } else {
                L4: {
                  if (this.field_P.field_o.field_i) {
                    var4_ref.field_u.field_y.field_m.field_x = var4_ref.field_u.field_y.field_m.field_x - var4_ref.field_v;
                    break L4;
                  } else {
                    var4_ref.field_u.field_R.field_x = var4_ref.field_u.field_R.field_x - var4_ref.field_v;
                    break L4;
                  }
                }
                var4_ref.field_u.field_J = var4_ref.field_u.field_J + var4_ref.field_v;
                var4_ref = (qa) ((Object) this.field_P.field_q.a((byte) -71));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var4);
            stackOut_22_1 = new StringBuilder().append("km.V(").append(param0).append(',');
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L5;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param2 + ')');
        }
    }

    final void a(l param0, int param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            this.field_P.a(92, param0);
            this.field_z.a(param0, 0);
            this.field_p = new int[param0.field_e.length];
            this.field_t = new int[param0.field_e.length];
            if (param1 == 6) {
              this.field_w = new boolean[param0.field_e.length];
              this.field_d = new int[param0.field_e.length];
              this.field_J = new int[param0.field_e.length];
              this.field_r = new int[param0.field_e.length];
              this.field_V = new boolean[param0.field_e.length];
              this.field_U = new int[param0.field_e.length];
              this.a(this.field_n, -74);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (runtimeException);
            stackOut_4_1 = new StringBuilder().append("km.B(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        tr stackIn_1_0 = null;
        pf stackIn_1_1 = null;
        pf stackIn_1_2 = null;
        tr stackIn_2_0 = null;
        pf stackIn_2_1 = null;
        pf stackIn_2_2 = null;
        tr stackIn_4_0 = null;
        pf stackIn_4_1 = null;
        pf stackIn_4_2 = null;
        tr stackIn_6_0 = null;
        pf stackIn_6_1 = null;
        pf stackIn_6_2 = null;
        tr stackIn_7_0 = null;
        pf stackIn_7_1 = null;
        pf stackIn_7_2 = null;
        int stackIn_7_3 = 0;
        RuntimeException decompiledCaughtException = null;
        tr stackOut_0_0 = null;
        pf stackOut_0_1 = null;
        pf stackOut_0_2 = null;
        tr stackOut_1_0 = null;
        pf stackOut_1_1 = null;
        pf stackOut_1_2 = null;
        tr stackOut_2_0 = null;
        pf stackOut_2_1 = null;
        pf stackOut_2_2 = null;
        tr stackOut_4_0 = null;
        pf stackOut_4_1 = null;
        pf stackOut_4_2 = null;
        int stackOut_4_3 = 0;
        tr stackOut_6_0 = null;
        pf stackOut_6_1 = null;
        pf stackOut_6_2 = null;
        int stackOut_6_3 = 0;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = -65 / ((param1 - 11) / 62);
                stackOut_0_0 = this.field_z;
                stackOut_0_1 = this.field_P.field_A;
                stackOut_0_2 = this.field_P.field_i;
                stackIn_6_0 = stackOut_0_0;
                stackIn_6_1 = stackOut_0_1;
                stackIn_6_2 = stackOut_0_2;
                stackIn_1_0 = stackOut_0_0;
                stackIn_1_1 = stackOut_0_1;
                stackIn_1_2 = stackOut_0_2;
                if (!this.field_j) {
                  break L2;
                } else {
                  stackOut_1_0 = (tr) ((Object) stackIn_1_0);
                  stackOut_1_1 = (pf) ((Object) stackIn_1_1);
                  stackOut_1_2 = (pf) ((Object) stackIn_1_2);
                  stackIn_6_0 = stackOut_1_0;
                  stackIn_6_1 = stackOut_1_1;
                  stackIn_6_2 = stackOut_1_2;
                  stackIn_2_0 = stackOut_1_0;
                  stackIn_2_1 = stackOut_1_1;
                  stackIn_2_2 = stackOut_1_2;
                  if (!se.field_g) {
                    break L2;
                  } else {
                    stackOut_2_0 = (tr) ((Object) stackIn_2_0);
                    stackOut_2_1 = (pf) ((Object) stackIn_2_1);
                    stackOut_2_2 = (pf) ((Object) stackIn_2_2);
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_4_1 = stackOut_2_1;
                    stackIn_4_2 = stackOut_2_2;
                    stackOut_4_0 = (tr) ((Object) stackIn_4_0);
                    stackOut_4_1 = (pf) ((Object) stackIn_4_1);
                    stackOut_4_2 = (pf) ((Object) stackIn_4_2);
                    stackOut_4_3 = 1;
                    stackIn_7_0 = stackOut_4_0;
                    stackIn_7_1 = stackOut_4_1;
                    stackIn_7_2 = stackOut_4_2;
                    stackIn_7_3 = stackOut_4_3;
                    break L1;
                  }
                }
              }
              stackOut_6_0 = (tr) ((Object) stackIn_6_0);
              stackOut_6_1 = (pf) ((Object) stackIn_6_1);
              stackOut_6_2 = (pf) ((Object) stackIn_6_2);
              stackOut_6_3 = 0;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              stackIn_7_3 = stackOut_6_3;
              break L1;
            }
            ((tr) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2, stackIn_7_3 != 0, 12114, param0, this.field_P.field_p);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) ((Object) runtimeException), "km.D(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        gm discarded$1 = null;
        RuntimeException var4 = null;
        qm var4_ref = null;
        int var5 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if ((je.field_d ^ -1) != -3) {
                break L1;
              } else {
                if (!this.field_y) {
                  this.field_Z = param1;
                  this.field_y = true;
                  this.field_D = param2;
                  this.field_T = false;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (param0 == -3587) {
              L2: {
                if (!this.field_y) {
                  break L2;
                } else {
                  if (2 == rf.field_n) {
                    if (-26 <= ((this.field_D + -param2) * (this.field_D + -param2) + (-param1 + this.field_Z) * (-param1 + this.field_Z) ^ -1)) {
                      break L2;
                    } else {
                      this.field_T = true;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (!this.field_y) {
                  break L3;
                } else {
                  if ((rf.field_n ^ -1) == -3) {
                    break L3;
                  } else {
                    this.field_y = false;
                    if (this.field_T) {
                      break L3;
                    } else {
                      if (this.field_m == 0) {
                        if (null != this.field_z.field_p) {
                          var4_ref = (qm) ((Object) this.field_P.field_i.d(param0 + 3587));
                          L4: while (true) {
                            if (var4_ref == null) {
                              break L3;
                            } else {
                              L5: {
                                if (var4_ref.field_p != this.field_n) {
                                  break L5;
                                } else {
                                  L6: {
                                    if (var4_ref.field_q == this.field_z.field_p) {
                                      break L6;
                                    } else {
                                      if (var4_ref.field_r == this.field_z.field_p) {
                                        break L6;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                  L7: {
                                    var4_ref.field_q = null;
                                    var4_ref.field_r = null;
                                    if (this.field_f) {
                                      this.field_ab.a(var4_ref, 32);
                                      this.e(param0 + 3587);
                                      break L7;
                                    } else {
                                      break L7;
                                    }
                                  }
                                  var4_ref.b((byte) -105);
                                  this.field_Y.c(var4_ref.field_o, 127);
                                  break L5;
                                }
                              }
                              var4_ref = (qm) ((Object) this.field_P.field_i.a((byte) -71));
                              continue L4;
                            }
                          }
                        } else {
                          break L3;
                        }
                      } else {
                        discarded$1 = qk.a(us.field_d, param0 ^ -3671);
                        this.field_Y.a(-76, 0);
                        break L3;
                      }
                    }
                  }
                }
              }
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var4), "km.L(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public final void a(int param0, byte param1, fs param2, fs param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        fs var7 = null;
        String[] var8 = null;
        String var9 = null;
        fs var10 = null;
        fs stackIn_4_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        fs stackOut_3_0 = null;
        fs stackOut_1_0 = null;
        String stackOut_13_0 = null;
        String stackOut_11_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              var6_int = -91 / ((-70 - param1) / 36);
              if (this.field_f) {
                stackOut_3_0 = this.field_n;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = this.field_P.field_v[0];
                stackIn_4_0 = stackOut_1_0;
                break L1;
              }
            }
            var7 = stackIn_4_0;
            if (var7 != param2) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var8 = ma.field_s[param4];
              if (0 != var8.length) {
                L2: {
                  var9 = var8[vc.a((byte) -39, var8.length)];
                  var10 = this.field_P.field_v[this.field_P.field_m[-1 + this.field_P.field_r]];
                  var9 = vm.a(var10.field_t, 108, "largestplayer", var9);
                  var9 = vm.a(this.field_n.field_t, 124, "you", var9);
                  var9 = vm.a(param3.field_t, 121, "me", var9);
                  if ((this.field_P.field_g.field_e.length ^ -1) >= (param0 ^ -1)) {
                    stackOut_13_0 = "";
                    stackIn_14_0 = stackOut_13_0;
                    break L2;
                  } else {
                    stackOut_11_0 = this.field_P.field_g.field_e[param0].field_I;
                    stackIn_14_0 = stackOut_11_0;
                    break L2;
                  }
                }
                var9 = vm.a(stackIn_14_0, 100, "system", var9);
                this.a(param3, var9, (byte) 51);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var6);
            stackOut_16_1 = new StringBuilder().append("km.KA(").append(param0).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L3;
            }
          }
          L4: {
            stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final boolean c(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        String var7 = null;
        int var8 = 0;
        sl var9 = null;
        int var10 = 0;
        int var11 = 0;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_63_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_79_0 = 0;
        int stackIn_104_0 = 0;
        int stackIn_107_0 = 0;
        int stackIn_110_0 = 0;
        int stackIn_115_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_128_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_75_0 = 0;
        int stackOut_114_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_106_0 = 0;
        int stackOut_103_0 = 0;
        int stackOut_78_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_31_0 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (66 == ej.field_e) {
              L1: {
                L2: {
                  var2_int = sa.field_a.j(-108);
                  var3 = sa.field_a.f(param0 + -35735);
                  var4 = sa.field_a.a(16711680);
                  var5 = sa.field_a.a(param0 ^ 16726439);
                  var6 = sa.field_a.j(-75);
                  var7_int = sa.field_a.j(param0 ^ -14818);
                  var8 = sa.field_a.f(-20976);
                  if (this.field_P.field_O >= var2_int) {
                    break L2;
                  } else {
                    if (-1 == this.field_P.field_O) {
                      break L2;
                    } else {
                      L3: {
                        this.b(false);
                        this.a((byte) 96, var4, var3);
                        if ((var5 ^ -1) == (this.field_P.f(-28824) ^ -1)) {
                          this.field_j = false;
                          break L3;
                        } else {
                          L4: {
                            var9 = js.field_f;
                            var9.h(66, param0 ^ 14680);
                            var9.field_j = var9.field_j + 2;
                            var10 = var9.field_j;
                            if (-1 >= (this.field_h ^ -1)) {
                              this.field_P.a(var9, (byte) 68, this.field_n);
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          L5: {
                            var9.f(param0 + -549356895, var9.field_j + -var10);
                            if (!se.field_g) {
                              d.a(0, (byte) 82);
                              q.g(-112);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          this.field_j = true;
                          break L3;
                        }
                      }
                      this.field_P.a(var7_int, var6, false);
                      this.field_L = false;
                      this.field_S = var8;
                      this.a(true);
                      break L1;
                    }
                  }
                }
                if ((this.field_P.field_O ^ -1) != 0) {
                  break L1;
                } else {
                  this.field_P.d(-9778, var2_int);
                  this.a(true, (int[]) null);
                  this.field_q = this.field_P.field_O;
                  break L1;
                }
              }
              this.field_S = var8;
              stackOut_28_0 = 1;
              stackIn_29_0 = stackOut_28_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((ej.field_e ^ -1) != -70) {
                if ((ej.field_e ^ -1) != -68) {
                  if (70 == ej.field_e) {
                    this.b(rr.field_t, sa.field_a, -123);
                    stackOut_39_0 = 1;
                    stackIn_40_0 = stackOut_39_0;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (68 == ej.field_e) {
                      this.a(sa.field_a, rr.field_t, -80);
                      stackOut_44_0 = 1;
                      stackIn_45_0 = stackOut_44_0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if ((ej.field_e ^ -1) == -63) {
                        L6: {
                          this.field_P.field_y = sa.field_a.j(param0 ^ -14832);
                          if (this == ce.field_x) {
                            ri.k(8);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        stackOut_53_0 = 1;
                        stackIn_54_0 = stackOut_53_0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        if (-65 == (ej.field_e ^ -1)) {
                          L7: {
                            this.field_P.field_e = sa.field_a.j(param0 ^ -14814);
                            if (this == ce.field_x) {
                              wp.a(-2);
                              break L7;
                            } else {
                              break L7;
                            }
                          }
                          stackOut_62_0 = 1;
                          stackIn_63_0 = stackOut_62_0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          if (-64 == (ej.field_e ^ -1)) {
                            this.field_P.field_f = sa.field_a.j(-119);
                            this.field_P.field_w = this.field_P.field_w | this.field_P.field_f;
                            var2_int = 0;
                            L8: while (true) {
                              if ((this.field_P.field_r ^ -1) >= (var2_int ^ -1)) {
                                stackOut_75_0 = 1;
                                stackIn_76_0 = stackOut_75_0;
                                decompiledRegionSelector0 = 7;
                                break L0;
                              } else {
                                L9: {
                                  if ((this.field_P.field_f & 1 << var2_int) == 0) {
                                    break L9;
                                  } else {
                                    this.field_P.a(this.field_P.field_v[var2_int], (byte) -123);
                                    break L9;
                                  }
                                }
                                var2_int++;
                                continue L8;
                              }
                            }
                          } else {
                            if (-66 != (ej.field_e ^ -1)) {
                              if (61 != ej.field_e) {
                                if (param0 == 14759) {
                                  if (-73 != (ej.field_e ^ -1)) {
                                    if (ej.field_e == 73) {
                                      var2_int = sa.field_a.j(-95);
                                      var3 = sa.field_a.j(-112);
                                      var4 = sa.field_a.j(param0 ^ -14805);
                                      this.a(var4, (byte) 4, this.field_n, this.field_P.field_v[var2_int], var3);
                                      stackOut_114_0 = 1;
                                      stackIn_115_0 = stackOut_114_0;
                                      decompiledRegionSelector0 = 12;
                                      break L0;
                                    } else {
                                      L10: {
                                        if ((ej.field_e ^ -1) != -75) {
                                          break L10;
                                        } else {
                                          if (se.field_g) {
                                            var2_int = rr.field_t / 4;
                                            var3 = 0;
                                            L11: while (true) {
                                              if ((var2_int ^ -1) >= (var3 ^ -1)) {
                                                stackOut_125_0 = 1;
                                                stackIn_126_0 = stackOut_125_0;
                                                decompiledRegionSelector0 = 13;
                                                break L0;
                                              } else {
                                                var4 = sa.field_a.j(-128);
                                                var5 = sa.field_a.j(-126);
                                                var6 = sa.field_a.f(param0 ^ -26697);
                                                var7 = "My personality type is " + wk.field_a[var5] + " and my rating is " + var6;
                                                this.a(this.field_P.field_v[var4], var7, (byte) 51);
                                                var3++;
                                                continue L11;
                                              }
                                            }
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                      stackOut_127_0 = 0;
                                      stackIn_128_0 = stackOut_127_0;
                                      decompiledRegionSelector0 = 14;
                                      break L0;
                                    }
                                  } else {
                                    this.i(-126);
                                    stackOut_109_0 = 1;
                                    stackIn_110_0 = stackOut_109_0;
                                    decompiledRegionSelector0 = 11;
                                    break L0;
                                  }
                                } else {
                                  stackOut_106_0 = 1;
                                  stackIn_107_0 = stackOut_106_0;
                                  decompiledRegionSelector0 = 10;
                                  break L0;
                                }
                              } else {
                                L12: {
                                  L13: {
                                    L14: {
                                      var2_int = sa.field_a.g(-2852);
                                      this.field_P.a(var2_int, 3);
                                      ta.a(0, -1, (byte) 96, false);
                                      this.field_b = false;
                                      this.field_Y.o(-4956);
                                      if (this.field_n == null) {
                                        break L14;
                                      } else {
                                        if ((this.field_P.field_w & 1 << this.field_h) != 0) {
                                          break L13;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    }
                                    if (!this.field_P.field_x.a((byte) 123, this.field_n)) {
                                      if (this.field_P.field_z) {
                                        jo.a(32767, hj.field_n, false, 10);
                                        break L12;
                                      } else {
                                        break L12;
                                      }
                                    } else {
                                      break L13;
                                    }
                                  }
                                  jo.a(param0 ^ 18008, wh.field_b, false, 10);
                                  break L12;
                                }
                                L15: {
                                  if (!sm.field_e) {
                                    break L15;
                                  } else {
                                    if ((1 << this.field_h & this.field_P.field_e) != 0) {
                                      break L15;
                                    } else {
                                      this.b(-116);
                                      break L15;
                                    }
                                  }
                                }
                                stackOut_103_0 = 1;
                                stackIn_104_0 = stackOut_103_0;
                                decompiledRegionSelector0 = 9;
                                break L0;
                              }
                            } else {
                              this.field_i = sa.field_a.j(-57);
                              stackOut_78_0 = 1;
                              stackIn_79_0 = stackOut_78_0;
                              decompiledRegionSelector0 = 8;
                              break L0;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  this.a(1, sa.field_a, rr.field_t);
                  stackOut_34_0 = 1;
                  stackIn_35_0 = stackOut_34_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              } else {
                this.field_N = sa.field_a.j(-78);
                stackOut_31_0 = 1;
                stackIn_32_0 = stackOut_31_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "km.M(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_29_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_32_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_35_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_40_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_45_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_54_0 != 0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_63_0 != 0;
                    } else {
                      if (decompiledRegionSelector0 == 7) {
                        return stackIn_76_0 != 0;
                      } else {
                        if (decompiledRegionSelector0 == 8) {
                          return stackIn_79_0 != 0;
                        } else {
                          if (decompiledRegionSelector0 == 9) {
                            return stackIn_104_0 != 0;
                          } else {
                            if (decompiledRegionSelector0 == 10) {
                              return stackIn_107_0 != 0;
                            } else {
                              if (decompiledRegionSelector0 == 11) {
                                return stackIn_110_0 != 0;
                              } else {
                                if (decompiledRegionSelector0 == 12) {
                                  return stackIn_115_0 != 0;
                                } else {
                                  if (decompiledRegionSelector0 == 13) {
                                    return stackIn_126_0 != 0;
                                  } else {
                                    return stackIn_128_0 != 0;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
    }

    private final void a(int param0, ln param1, ln param2, int param3) {
        RuntimeException runtimeException = null;
        qm var5 = null;
        int var6 = 0;
        int var7 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var5 = (qm) ((Object) this.field_P.field_i.d(0));
            L1: while (true) {
              L2: {
                if (var5 == null) {
                  break L2;
                } else {
                  if ((param3 ^ -1) != (var5.field_o ^ -1)) {
                    var5 = (qm) ((Object) this.field_P.field_i.a((byte) -71));
                    continue L1;
                  } else {
                    var5.field_r = param1;
                    var5.field_q = param2;
                    break L2;
                  }
                }
              }
              L3: {
                if (var5 == null) {
                  var5 = new qm(param3, this.field_n, param2, param1);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var6 = 86 % ((param0 - 6) / 34);
                this.field_P.field_i.a((byte) -113, var5);
                if (this.field_f) {
                  this.field_ab.a(var5, 32);
                  this.e(0);
                  break L4;
                } else {
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (runtimeException);
            stackOut_19_1 = new StringBuilder().append("km.F(").append(param0).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L5;
            }
          }
          L6: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param3 + ')');
        }
    }

    private final void b(int param0, int param1) {
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        RuntimeException var3 = null;
        int[] var3_array = null;
        oh var4 = null;
        int var5 = 0;
        StringBuilder var6 = null;
        mg var7_ref_mg = null;
        qm var7_ref_qm = null;
        eg var7_ref_eg = null;
        int var7 = 0;
        hj var7_ref_hj = null;
        qi var7_ref_qi = null;
        nr var7_ref_nr = null;
        ne var8 = null;
        fs[] var8_array = null;
        int var8_int = 0;
        mg var9 = null;
        as var10 = null;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            this.field_Q = new k();
            this.field_z.b(false);
            var3_array = this.c((byte) 44);
            this.field_P.a(param0, 1, this.field_Q, (se) null);
            this.field_z.a(0);
            var4 = this.field_Q.field_a.d(0);
            var5 = 0;
            var6 = new StringBuilder();
            L1: while (true) {
              if (null == var4) {
                var4 = this.field_Q.field_a.d(0);
                L2: while (true) {
                  if (var4 == null) {
                    L3: {
                      this.field_z.field_C = true;
                      this.field_P.g(-7954);
                      this.a(true, var3_array);
                      if (var5 != 0) {
                        jq.a(-29901, (Throwable) null, var6.toString());
                        q.g(-118);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    L4: {
                      var7 = -13 % ((param1 - 35) / 40);
                      if (!this.field_W) {
                        break L4;
                      } else {
                        if ((this.field_P.field_w & 1 ^ -1) != -1) {
                          fl.a(0, "losegame");
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (this.field_W) {
                        var8_array = this.field_P.field_x.a((byte) -23);
                        if (var8_array == null) {
                          break L5;
                        } else {
                          if (this.field_n != var8_array[0]) {
                            break L5;
                          } else {
                            fl.a(0, "wingame");
                            break L5;
                          }
                        }
                      } else {
                        break L5;
                      }
                    }
                    break L0;
                  } else {
                    L6: {
                      if (!(var4 instanceof hj)) {
                        break L6;
                      } else {
                        var7_ref_hj = (hj) ((Object) var4);
                        if (var7_ref_hj.field_j != null) {
                          if (var7_ref_hj.field_j != this.field_n) {
                            this.field_z.a(var7_ref_hj.field_j, var7_ref_hj.field_i, false, var7_ref_hj.field_h);
                            if (this.field_z.field_u < var7_ref_hj.field_h) {
                              this.field_z.field_u = var7_ref_hj.field_h;
                              break L6;
                            } else {
                              break L6;
                            }
                          } else {
                            break L6;
                          }
                        } else {
                          var5 = 1;
                          discarded$2 = var6.append("Construction event at " + var7_ref_hj.field_i.field_I + " has no owner.\n");
                          break L6;
                        }
                      }
                    }
                    var4 = this.field_Q.field_a.a((byte) -71);
                    continue L2;
                  }
                }
              } else {
                L7: {
                  if (!(var4 instanceof mg)) {
                    if (!(var4 instanceof eg)) {
                      if (var4 instanceof qm) {
                        L8: {
                          var7_ref_qm = (qm) ((Object) var4);
                          if (0 == var7_ref_qm.field_o) {
                            this.field_z.a(var7_ref_qm.field_q, -124, 0, var7_ref_qm.field_p);
                            break L8;
                          } else {
                            if ((var7_ref_qm.field_o ^ -1) == -2) {
                              this.field_z.a(var7_ref_qm.field_q, -117, 1, var7_ref_qm.field_p);
                              break L8;
                            } else {
                              if ((var7_ref_qm.field_o ^ -1) == -4) {
                                this.field_z.a(var7_ref_qm.field_p, var7_ref_qm.field_r, (byte) -128, var7_ref_qm.field_q);
                                break L8;
                              } else {
                                break L8;
                              }
                            }
                          }
                        }
                        if (this.field_n != var7_ref_qm.field_p) {
                          break L7;
                        } else {
                          break L7;
                        }
                      } else {
                        if (var4 instanceof qi) {
                          var7_ref_qi = (qi) ((Object) var4);
                          this.field_z.a(var7_ref_qi.field_l, -123, 2, var7_ref_qi.field_k);
                          break L7;
                        } else {
                          if (!(var4 instanceof nr)) {
                            break L7;
                          } else {
                            L9: {
                              var7_ref_nr = (nr) ((Object) var4);
                              if (null == var7_ref_nr.field_j) {
                                break L9;
                              } else {
                                var8_int = 0;
                                L10: while (true) {
                                  if (var7_ref_nr.field_j.length <= var8_int) {
                                    break L9;
                                  } else {
                                    L11: {
                                      var9 = new mg(var7_ref_nr.field_p, var7_ref_nr.field_j[var8_int], var7_ref_nr.field_p.field_t, var7_ref_nr.field_i[var8_int]);
                                      this.field_z.field_hb.a((byte) -113, sg.a((byte) 101, var9));
                                      if (var9.field_z > this.field_z.field_y) {
                                        this.field_z.field_y = var9.field_z;
                                        break L11;
                                      } else {
                                        break L11;
                                      }
                                    }
                                    var8_int++;
                                    continue L10;
                                  }
                                }
                              }
                            }
                            this.field_z.field_P[var7_ref_nr.field_p.field_p] = true;
                            break L7;
                          }
                        }
                      }
                    } else {
                      var7_ref_eg = (eg) ((Object) var4);
                      this.field_z.field_m.a((byte) -113, new vn(var7_ref_eg));
                      var8 = (ne) ((Object) var7_ref_eg.field_v.d(0));
                      L12: while (true) {
                        if (var8 == null) {
                          break L7;
                        } else {
                          L13: {
                            if (var8.field_k == null) {
                              break L13;
                            } else {
                              if ((var8.field_r ^ -1) == -1) {
                                break L13;
                              } else {
                                if (var8.field_h != var8.field_k.field_y) {
                                  break L13;
                                } else {
                                  var9 = new mg(var7_ref_eg.field_p, var8.field_k, var8.field_h, var8.field_r);
                                  var10 = bb.a(-2, var9);
                                  this.field_z.field_v.a((byte) -113, var10);
                                  if (var10.field_x <= this.field_z.field_y) {
                                    break L13;
                                  } else {
                                    this.field_z.field_y = var10.field_x;
                                    break L13;
                                  }
                                }
                              }
                            }
                          }
                          var8 = (ne) ((Object) var7_ref_eg.field_v.a((byte) -71));
                          continue L12;
                        }
                      }
                    }
                  } else {
                    L14: {
                      var7_ref_mg = (mg) ((Object) var4);
                      if (var7_ref_mg.field_G != null) {
                        this.field_z.field_c.a((byte) -113, qn.a(-121, var7_ref_mg));
                        if (var7_ref_mg.field_z > this.field_z.field_y) {
                          this.field_z.field_y = var7_ref_mg.field_z;
                          break L14;
                        } else {
                          break L14;
                        }
                      } else {
                        var5 = 1;
                        discarded$3 = var6.append("Fleet from " + var7_ref_mg.field_y.field_I + " to " + var7_ref_mg.field_B.field_I + " has no owner.\n");
                        break L14;
                      }
                    }
                    break L7;
                  }
                }
                var4 = this.field_Q.field_a.a((byte) -71);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var3), "km.AB(" + param0 + ',' + param1 + ')');
        }
    }

    final void d(int param0) {
        RuntimeException var2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -7970) {
              if (!this.field_f) {
                throw new IllegalStateException();
              } else {
                js.field_f.h(64, param0 ^ -8159);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "km.H(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void j(int param0) {
        boolean discarded$1 = false;
        RuntimeException var2 = null;
        int var2_int = 0;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        int var6 = 0;
        int var7 = 0;
        float var8 = 0.0f;
        float var9 = 0.0f;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = 0;
              if (!this.field_Y.a(true, (byte) 63)) {
                L2: {
                  if ((je.field_d ^ -1) != -2) {
                    break L2;
                  } else {
                    this.a(td.field_P, (byte) -103, nh.field_p);
                    break L2;
                  }
                }
                this.a(-3587, pd.field_k, bb.field_b);
                this.field_z.a(this.field_m, 0, pd.field_k, bb.field_b);
                break L1;
              } else {
                this.field_T = true;
                var2_int = 1;
                this.field_y = false;
                this.field_z.field_nb[1] = -1;
                this.field_z.field_nb[0] = -1;
                this.field_z.field_p = null;
                this.field_z.field_S = null;
                break L1;
              }
            }
            L3: {
              var3 = this.field_z.field_k;
              var4 = this.field_z.field_E;
              if (!di.field_p[96]) {
                break L3;
              } else {
                var3 = var3 - 5.0f * (this.field_z.field_I + 50.0f) / 300.0f;
                if (0.0f <= var3) {
                  break L3;
                } else {
                  var3 = 0.0f;
                  break L3;
                }
              }
            }
            L4: {
              if (param0 == 50) {
                break L4;
              } else {
                this.d(88);
                break L4;
              }
            }
            L5: {
              var5 = this.field_z.field_I;
              if (di.field_p[97]) {
                var3 = var3 + 5.0f * (this.field_z.field_I + 50.0f) / 300.0f;
                if ((float)(this.field_P.field_g.field_k + 0) >= var3) {
                  break L5;
                } else {
                  var3 = (float)(0 + this.field_P.field_g.field_k);
                  break L5;
                }
              } else {
                break L5;
              }
            }
            L6: {
              if (!di.field_p[98]) {
                break L6;
              } else {
                var4 = var4 - 5.0f * (this.field_z.field_I + 50.0f) / 300.0f;
                if (var4 >= 0.0f) {
                  break L6;
                } else {
                  var4 = 0.0f;
                  break L6;
                }
              }
            }
            L7: {
              if (!di.field_p[99]) {
                break L7;
              } else {
                var4 = var4 + 5.0f * (this.field_z.field_I + 50.0f) / 300.0f;
                if ((float)(0 + this.field_P.field_g.field_b) < var4) {
                  var4 = (float)(this.field_P.field_g.field_b + 0);
                  break L7;
                } else {
                  break L7;
                }
              }
            }
            L8: {
              L9: {
                if (di.field_p[27]) {
                  break L9;
                } else {
                  if (di.field_p[87]) {
                    break L9;
                  } else {
                    break L8;
                  }
                }
              }
              var5 = var5 / 1.100000023841858f;
              if (this.field_z.field_g > var5) {
                var5 = this.field_z.field_g;
                break L8;
              } else {
                break L8;
              }
            }
            L10: {
              L11: {
                if (di.field_p[26]) {
                  break L11;
                } else {
                  if (di.field_p[88]) {
                    break L11;
                  } else {
                    break L10;
                  }
                }
              }
              var5 = var5 * 1.100000023841858f;
              if (this.field_z.field_F < var5) {
                var5 = this.field_z.field_F;
                break L10;
              } else {
                break L10;
              }
            }
            L12: {
              L13: {
                if (var2_int != 0) {
                  break L13;
                } else {
                  if ((2 & rf.field_n) != 0) {
                    L14: {
                      if (this.field_G) {
                        L15: {
                          var6 = -this.field_z.field_db + pd.field_k;
                          var7 = -this.field_z.field_e + bb.field_b;
                          var3 = var3 - this.field_z.field_I * (float)var6 / 300.0f;
                          if (0.0f <= var3) {
                            break L15;
                          } else {
                            var3 = 0.0f;
                            break L15;
                          }
                        }
                        L16: {
                          var4 = var4 - (float)var7 * this.field_z.field_I / 300.0f;
                          if (var3 > (float)(this.field_P.field_g.field_k + 0)) {
                            var3 = (float)(this.field_P.field_g.field_k - 0);
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        L17: {
                          if (var4 >= 0.0f) {
                            break L17;
                          } else {
                            var4 = 0.0f;
                            break L17;
                          }
                        }
                        if (var4 <= (float)(this.field_P.field_g.field_b + 0)) {
                          break L14;
                        } else {
                          var4 = (float)(this.field_P.field_g.field_b - 0);
                          break L14;
                        }
                      } else {
                        break L14;
                      }
                    }
                    this.field_z.field_e = bb.field_b;
                    this.field_G = true;
                    this.field_z.field_db = pd.field_k;
                    break L12;
                  } else {
                    break L13;
                  }
                }
              }
              this.field_G = false;
              break L12;
            }
            L18: {
              if (var2_int != 0) {
                break L18;
              } else {
                if (so.field_o == 0) {
                  break L18;
                } else {
                  L19: {
                    var6 = 320;
                    var7 = this.field_Y.d((byte) 14) / 2;
                    var8 = var3 + (float)(pd.field_k - var6) * this.field_z.field_I / 300.0f;
                    var9 = (float)(bb.field_b - var7) * this.field_z.field_I / 300.0f + var4;
                    if (0 < so.field_o) {
                      var10 = 0;
                      L20: while (true) {
                        if ((so.field_o * 2 ^ -1) >= (var10 ^ -1)) {
                          if (var5 <= this.field_z.field_F) {
                            break L19;
                          } else {
                            var5 = this.field_z.field_F;
                            break L19;
                          }
                        } else {
                          var5 = var5 * 1.100000023841858f;
                          var10++;
                          continue L20;
                        }
                      }
                    } else {
                      var10 = 2 * so.field_o;
                      L21: while (true) {
                        if (-1 >= (var10 ^ -1)) {
                          if (this.field_z.field_g <= var5) {
                            break L19;
                          } else {
                            var5 = this.field_z.field_g;
                            break L19;
                          }
                        } else {
                          var5 = var5 / 1.100000023841858f;
                          var10++;
                          continue L21;
                        }
                      }
                    }
                  }
                  L22: {
                    var3 = var8 - var5 * (float)(-var6 + pd.field_k) / 300.0f;
                    var4 = var9 - var5 * (float)(bb.field_b - var7) / 300.0f;
                    if (0.0f > var3) {
                      var3 = 0.0f;
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  L23: {
                    if (0.0f > var4) {
                      var4 = 0.0f;
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    if ((float)(0 + this.field_P.field_g.field_k) >= var3) {
                      break L24;
                    } else {
                      var3 = (float)(this.field_P.field_g.field_k - 0);
                      break L24;
                    }
                  }
                  if (var4 > (float)(this.field_P.field_g.field_b + 0)) {
                    var4 = (float)(this.field_P.field_g.field_b - 0);
                    break L18;
                  } else {
                    break L18;
                  }
                }
              }
            }
            L25: {
              L26: {
                if (this.field_z.field_k != var3) {
                  break L26;
                } else {
                  if (this.field_z.field_E != var4) {
                    break L26;
                  } else {
                    if (this.field_z.field_I != var5) {
                      break L26;
                    } else {
                      break L25;
                    }
                  }
                }
              }
              this.field_z.field_I = var5;
              this.field_z.field_x = false;
              this.field_z.field_fb = null;
              this.field_z.field_E = var4;
              this.field_z.field_k = var3;
              this.field_z.a(false);
              break L25;
            }
            L27: {
              if (-1 != (rf.field_n ^ -1)) {
                if (this.field_z.field_S == null) {
                  break L27;
                } else {
                  discarded$1 = this.a((byte) 121, this.field_z.field_S);
                  break L27;
                }
              } else {
                this.field_I = this.field_F;
                this.field_O = 0;
                break L27;
              }
            }
            this.field_z.c(pd.field_k, bb.field_b, param0 ^ 69);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "km.W(" + param0 + ')');
        }
    }

    private final void a(boolean param0, int param1, ln param2, ln param3) {
        RuntimeException var5 = null;
        mg var5_ref = null;
        int var6 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var5_ref = (mg) ((Object) param3.field_T.d(0));
            L1: while (true) {
              L2: {
                if (null == var5_ref) {
                  break L2;
                } else {
                  L3: {
                    if (param2 != var5_ref.field_B) {
                      break L3;
                    } else {
                      if (var5_ref.field_G == this.field_n) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var5_ref = (mg) ((Object) param3.field_T.a((byte) -71));
                  continue L1;
                }
              }
              if (!param0) {
                L4: {
                  if (null != var5_ref) {
                    var5_ref.field_z = var5_ref.field_z + param1;
                    break L4;
                  } else {
                    var5_ref = new mg(param3, param2, param1);
                    param3.field_T.a((byte) -113, var5_ref);
                    param2.field_s.a(var5_ref, 32);
                    this.field_P.field_p.a((byte) 62, var5_ref);
                    break L4;
                  }
                }
                L5: {
                  param3.field_J = param3.field_J - param1;
                  this.field_C[param3.field_p] = this.field_C[param3.field_p] - param1;
                  kr.a((byte) 83, param3);
                  fl.a(param2, (byte) 75);
                  this.a(this.field_n, -95);
                  if (this.field_f) {
                    this.field_v.a((byte) 9, var5_ref);
                    this.e(0);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                decompiledRegionSelector0 = 0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var5);
            stackOut_21_1 = new StringBuilder().append("km.U(").append(param0).append(',').append(param1).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L6;
            }
          }
          L7: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L7;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L7;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void l(int param0) {
        RuntimeException runtimeException = null;
        sl var2 = null;
        int var3 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2 = js.field_f;
            var2.h(59, 255);
            if (param0 < -75) {
              L1: {
                var2.field_j = var2.field_j + 2;
                var3 = var2.field_j;
                var2.c(this.field_P.field_O, (byte) -109);
                se.a(tr.a((byte) 81, this.field_o), -256, tr.a((byte) 93, this.field_ab), rp.a(-125, this.field_v), var2);
                this.field_ab.b((byte) 35);
                this.field_o.b((byte) 87);
                this.field_v.a((byte) 112);
                var2.f(-549342136, -var3 + var2.field_j);
                this.field_g = -1;
                this.field_k = -1;
                if (!sm.field_e) {
                  break L1;
                } else {
                  this.m(126);
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) ((Object) runtimeException), "km.VA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(mg param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        try {
          L0: {
            L1: {
              param0.field_y.field_J = param0.field_y.field_J - param1;
              this.field_C[param0.field_y.field_p] = this.field_C[param0.field_y.field_p] - param1;
              param0.field_z = param0.field_z + param1;
              if (param2 == 10755) {
                break L1;
              } else {
                this.a(101);
                break L1;
              }
            }
            if ((param0.field_z ^ -1) <= -1) {
              L2: {
                if (0 != param0.field_z) {
                  break L2;
                } else {
                  param0.b((byte) -106);
                  param0.a(16);
                  param0.d(true);
                  break L2;
                }
              }
              L3: {
                this.a(this.field_n, -117);
                if (this.field_f) {
                  this.field_v.a((byte) 9, param0);
                  this.e(0);
                  break L3;
                } else {
                  break L3;
                }
              }
              break L0;
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var4);
            stackOut_14_1 = new StringBuilder().append("km.IA(");
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_14_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_23_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 >= 54) {
                break L1;
              } else {
                this.field_c = (sd) null;
                break L1;
              }
            }
            L2: {
              var2_int = 0;
              if (di.field_p[81]) {
                var2_int = 81;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!di.field_p[86]) {
                break L3;
              } else {
                if (0 != var2_int) {
                  stackOut_13_0 = 0;
                  stackIn_14_0 = stackOut_13_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  var2_int = 86;
                  break L3;
                }
              }
            }
            L4: {
              if (!di.field_p[82]) {
                break L4;
              } else {
                if ((var2_int ^ -1) == -1) {
                  var2_int = 82;
                  break L4;
                } else {
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            stackOut_23_0 = var2_int;
            stackIn_24_0 = stackOut_23_0;
            decompiledRegionSelector0 = 2;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "km.PA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_14_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_21_0;
          } else {
            return stackIn_24_0;
          }
        }
    }

    final void b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_f) {
              this.field_P.field_e = this.field_P.field_e | 1 << this.field_h;
              var2_int = 9 / ((-64 - param0) / 51);
              js.field_f.h(65, 255);
              break L0;
            } else {
              throw new IllegalStateException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "km.C(" + param0 + ')');
        }
    }

    private final boolean a(byte param0, mg param1) {
        gm discarded$2 = null;
        int fieldTemp$3 = 0;
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        ln var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_70_0 = 0;
        int stackIn_75_0 = 0;
        int stackIn_88_0 = 0;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        String stackIn_93_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        String stackOut_92_2 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        String stackOut_90_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param0 > 95) {
              if (param1.field_G != this.field_n) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (-1 <= (this.field_O ^ -1)) {
                    L2: {
                      if ((rf.field_n ^ -1) != -2) {
                        break L2;
                      } else {
                        if (param1 != this.field_z.field_rb) {
                          this.field_z.b((byte) -127);
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                    }
                    L3: {
                      L4: {
                        if ((rf.field_n ^ -1) != -2) {
                          break L4;
                        } else {
                          if (this.field_z.field_Ab) {
                            L5: {
                              var3_int = 1;
                              var4 = this.a((byte) 57);
                              var5 = this.field_z.field_S.field_y;
                              if (82 == var4) {
                                L6: {
                                  if (var5.field_N < var5.field_J) {
                                    stackOut_69_0 = var5.field_J - var5.field_N;
                                    stackIn_70_0 = stackOut_69_0;
                                    break L6;
                                  } else {
                                    stackOut_67_0 = var5.field_J;
                                    stackIn_70_0 = stackOut_67_0;
                                    break L6;
                                  }
                                }
                                var3_int = stackIn_70_0;
                                break L5;
                              } else {
                                if ((var4 ^ -1) == -87) {
                                  var3_int = 5;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            L7: {
                              if (!this.field_P.field_o.field_e) {
                                stackOut_74_0 = var5.field_N;
                                stackIn_75_0 = stackOut_74_0;
                                break L7;
                              } else {
                                stackOut_72_0 = 0;
                                stackIn_75_0 = stackOut_72_0;
                                break L7;
                              }
                            }
                            L8: {
                              var6 = stackIn_75_0;
                              if ((var5.field_J - var6 ^ -1) <= (var3_int ^ -1)) {
                                break L8;
                              } else {
                                var3_int = var5.field_J + -var6;
                                break L8;
                              }
                            }
                            if (-1 > (var3_int ^ -1)) {
                              this.a(this.field_z.field_S, var3_int, 10755);
                              break L3;
                            } else {
                              discarded$2 = qk.a(jj.field_l, 47);
                              break L3;
                            }
                          } else {
                            break L4;
                          }
                        }
                      }
                      L9: {
                        if ((rf.field_n ^ -1) != -2) {
                          break L9;
                        } else {
                          if (!this.field_z.field_Gb) {
                            break L9;
                          } else {
                            L10: {
                              var3_int = -1;
                              var4 = this.a((byte) 55);
                              if ((var4 ^ -1) == -83) {
                                var3_int = -this.field_z.field_S.field_z;
                                break L10;
                              } else {
                                if (var4 == 86) {
                                  L11: {
                                    if (-6 < (this.field_z.field_S.field_z ^ -1)) {
                                      stackOut_41_0 = this.field_z.field_S.field_z;
                                      stackIn_42_0 = stackOut_41_0;
                                      break L11;
                                    } else {
                                      stackOut_39_0 = 5;
                                      stackIn_42_0 = stackOut_39_0;
                                      break L11;
                                    }
                                  }
                                  var3_int = -stackIn_42_0;
                                  break L10;
                                } else {
                                  break L10;
                                }
                              }
                            }
                            L12: {
                              this.a(this.field_z.field_S, var3_int, 10755);
                              if (this.field_z.field_S.field_z != 0) {
                                break L12;
                              } else {
                                this.field_z.field_nb[1] = -1;
                                this.field_z.field_nb[0] = -1;
                                this.field_z.field_S = null;
                                this.field_z.b((byte) -51);
                                break L12;
                              }
                            }
                            break L3;
                          }
                        }
                      }
                      if ((rf.field_n ^ -1) != -2) {
                        break L3;
                      } else {
                        if (this.field_z.field_Bb) {
                          var3_int = -param1.field_z;
                          this.a(this.field_z.field_S, var3_int, 10755);
                          this.field_z.field_nb[1] = -1;
                          this.field_z.field_S = null;
                          this.field_z.field_nb[0] = -1;
                          this.field_z.b((byte) -74);
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L13: {
                      fieldTemp$3 = this.field_I - 5;
                      this.field_I = this.field_I - 5;
                      if (0 <= fieldTemp$3) {
                        break L13;
                      } else {
                        this.field_I = 0;
                        break L13;
                      }
                    }
                    this.field_O = this.field_I;
                    this.a(2);
                    break L1;
                  } else {
                    this.field_O = this.field_O - 1;
                    break L1;
                  }
                }
                stackOut_87_0 = 1;
                stackIn_88_0 = stackOut_87_0;
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var3 = decompiledCaughtException;
            stackOut_89_0 = (RuntimeException) (var3);
            stackOut_89_1 = new StringBuilder().append("km.FA(").append(param0).append(',');
            stackIn_92_0 = stackOut_89_0;
            stackIn_92_1 = stackOut_89_1;
            stackIn_90_0 = stackOut_89_0;
            stackIn_90_1 = stackOut_89_1;
            if (param1 == null) {
              stackOut_92_0 = (RuntimeException) ((Object) stackIn_92_0);
              stackOut_92_1 = (StringBuilder) ((Object) stackIn_92_1);
              stackOut_92_2 = "null";
              stackIn_93_0 = stackOut_92_0;
              stackIn_93_1 = stackOut_92_1;
              stackIn_93_2 = stackOut_92_2;
              break L14;
            } else {
              stackOut_90_0 = (RuntimeException) ((Object) stackIn_90_0);
              stackOut_90_1 = (StringBuilder) ((Object) stackIn_90_1);
              stackOut_90_2 = "{...}";
              stackIn_93_0 = stackOut_90_0;
              stackIn_93_1 = stackOut_90_1;
              stackIn_93_2 = stackOut_90_2;
              break L14;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_93_0), stackIn_93_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0 != 0;
          } else {
            return stackIn_88_0 != 0;
          }
        }
    }

    final void a(int param0) {
        ln[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ln var4 = null;
        int var5 = 0;
        int var6 = 0;
        int[] stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int stackOut_10_2 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_R.length < this.field_P.field_g.field_e.length) {
                this.field_R = new fs[this.field_P.field_g.field_e.length];
                this.field_C = new int[this.field_P.field_g.field_e.length];
                this.field_l = new sd[this.field_P.field_g.field_e.length];
                break L1;
              } else {
                break L1;
              }
            }
            var2 = this.field_P.field_g.field_e;
            var3 = 0;
            L2: while (true) {
              if (var3 >= var2.length) {
                L3: {
                  if (param0 == 2) {
                    break L3;
                  } else {
                    this.field_l = (sd[]) null;
                    break L3;
                  }
                }
                this.field_z.a(this.field_C, true, this.field_l, this.field_R, true);
                break L0;
              } else {
                L4: {
                  var4 = var2[var3];
                  var5 = var4.field_p;
                  this.field_R[var5] = var4.field_y;
                  stackOut_7_0 = this.field_C;
                  stackOut_7_1 = var5;
                  stackIn_12_0 = stackOut_7_0;
                  stackIn_12_1 = stackOut_7_1;
                  stackIn_8_0 = stackOut_7_0;
                  stackIn_8_1 = stackOut_7_1;
                  if (var4.field_y != this.field_n) {
                    stackOut_12_0 = (int[]) ((Object) stackIn_12_0);
                    stackOut_12_1 = stackIn_12_1;
                    stackOut_12_2 = var4.field_x;
                    stackIn_13_0 = stackOut_12_0;
                    stackIn_13_1 = stackOut_12_1;
                    stackIn_13_2 = stackOut_12_2;
                    break L4;
                  } else {
                    stackOut_8_0 = (int[]) ((Object) stackIn_8_0);
                    stackOut_8_1 = stackIn_8_1;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    stackOut_10_0 = (int[]) ((Object) stackIn_10_0);
                    stackOut_10_1 = stackIn_10_1;
                    stackOut_10_2 = var4.field_J;
                    stackIn_13_0 = stackOut_10_0;
                    stackIn_13_1 = stackOut_10_1;
                    stackIn_13_2 = stackOut_10_2;
                    break L4;
                  }
                }
                stackIn_13_0[stackIn_13_1] = stackIn_13_2;
                this.field_l[var5] = var4.field_R;
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2_ref), "km.A(" + param0 + ')');
        }
    }

    final void m(int param0) {
        sl var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 >= 122) {
                break L1;
              } else {
                this.a((fs) null, -117);
                break L1;
              }
            }
            L2: {
              if (!this.field_f) {
                this.d((byte) -81);
                break L2;
              } else {
                L3: {
                  if (-1 == this.field_k) {
                    break L3;
                  } else {
                    this.l(-113);
                    break L3;
                  }
                }
                L4: {
                  var2 = js.field_f;
                  var2.h(61, 255);
                  var2.c(this.field_P.field_O, (byte) -93);
                  var2.e(11135, this.f(-41));
                  this.field_L = true;
                  if (-2 > (this.field_N ^ -1)) {
                    this.field_N = this.field_N - 1;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2_ref), "km.QA(" + param0 + ')');
        }
    }

    private final void k(int param0) {
        sl var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.field_L) {
              var3 = 82 / ((param0 - 61) / 51);
              var2 = js.field_f;
              var2.h(62, 255);
              var2.c(this.field_P.field_O, (byte) -126);
              this.field_L = false;
              break L0;
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2_ref), "km.N(" + param0 + ')');
        }
    }

    private final void a(fs param0, fs param1, boolean param2) {
        String var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              if (this.field_n == param0) {
                var4 = re.a(ud.field_b, 4371, new String[]{param1.field_t});
                this.field_H.a(new n(param1, (fs) null, var4), 0);
                break L1;
              } else {
                if (param1 != this.field_n) {
                  break L1;
                } else {
                  var4 = re.a(wf.field_h, 4371, new String[]{param0.field_t});
                  this.field_H.a(new n(param0, (fs) null, var4), 0);
                  break L1;
                }
              }
            }
            L2: {
              if (null == this.field_s[param1.field_x]) {
                break L2;
              } else {
                this.field_s[param1.field_x].a(param0, 7686);
                break L2;
              }
            }
            L3: {
              if (param2) {
                break L3;
              } else {
                this.a(true, 25, (ln) null, (ln) null);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var4_ref);
            stackOut_13_1 = new StringBuilder().append("km.P(");
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param2 + ')');
        }
    }

    private final void e(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!this.field_L) {
                break L1;
              } else {
                this.k(-92);
                break L1;
              }
            }
            L2: {
              if (param0 != (this.field_g ^ -1)) {
                break L2;
              } else {
                this.field_g = 250;
                break L2;
              }
            }
            this.field_k = 25;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "km.E(" + param0 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2) {
        boolean[][] discarded$12 = null;
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_P.c(0);
              discarded$12 = this.field_P.b(param2, 0);
              if (param0 > 89) {
                break L1;
              } else {
                this.field_n = (fs) null;
                break L1;
              }
            }
            this.b(param1, 123);
            this.field_z.field_d = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var4), "km.NA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int f(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        qm var3 = null;
        int var4 = 0;
        qa var5 = null;
        mg var6 = null;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = 406213746;
            var4 = -1 % ((param0 - 29) / 63);
            var3 = (qm) ((Object) this.field_P.field_i.d(0));
            L1: while (true) {
              if (var3 == null) {
                var5 = (qa) ((Object) this.field_P.field_q.d(0));
                L2: while (true) {
                  if (null == var5) {
                    var6 = (mg) ((Object) this.field_P.field_p.a(true));
                    L3: while (true) {
                      if (var6 == null) {
                        stackOut_14_0 = var2_int;
                        stackIn_15_0 = stackOut_14_0;
                        break L0;
                      } else {
                        var2_int = var2_int + ((1 + var6.field_y.field_p) * (1 + (var6.field_B.field_p - -65536)) - -(var6.field_z * ((1 + var6.field_B.field_p) * (1 + var6.field_y.field_p))));
                        var6 = (mg) ((Object) this.field_P.field_p.a((byte) -68));
                        continue L3;
                      }
                    }
                  } else {
                    var2_int = var2_int + (var5.field_u.field_p * (var5.field_v ^ 11) << -1411704405);
                    var5 = (qa) ((Object) this.field_P.field_q.a((byte) -71));
                    continue L2;
                  }
                }
              } else {
                L4: {
                  stackOut_3_0 = var2_int;
                  stackOut_3_1 = 17 * var3.field_q.field_p + var3.field_o;
                  stackIn_6_0 = stackOut_3_0;
                  stackIn_6_1 = stackOut_3_1;
                  stackIn_4_0 = stackOut_3_0;
                  stackIn_4_1 = stackOut_3_1;
                  if (var3.field_r != null) {
                    stackOut_6_0 = stackIn_6_0;
                    stackOut_6_1 = stackIn_6_1;
                    stackOut_6_2 = var3.field_r.field_p - -7;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    stackIn_7_2 = stackOut_6_2;
                    break L4;
                  } else {
                    stackOut_4_0 = stackIn_4_0;
                    stackOut_4_1 = stackIn_4_1;
                    stackOut_4_2 = 5;
                    stackIn_7_0 = stackOut_4_0;
                    stackIn_7_1 = stackOut_4_1;
                    stackIn_7_2 = stackOut_4_2;
                    break L4;
                  }
                }
                var2_int = stackIn_7_0 + stackIn_7_1 * stackIn_7_2;
                var3 = (qm) ((Object) this.field_P.field_i.a((byte) -71));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "km.AA(" + param0 + ')');
        }
        return stackIn_15_0;
    }

    private final void a(ob param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        fs var8_ref_fs = null;
        fs var9 = null;
        int var10 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4_int = 30 % ((-1 - param2) / 62);
            L1: while (true) {
              if (-1 <= (param1 ^ -1)) {
                break L0;
              } else {
                L2: {
                  var5 = param0.j(-82);
                  param1--;
                  if ((var5 ^ -1) == -1) {
                    var6 = param0.j(-108);
                    var7 = (this.field_n.field_A ^ -1) & var6;
                    this.field_n.field_A = var6;
                    param1--;
                    if (var7 == 0) {
                      break L2;
                    } else {
                      var8 = 0;
                      L3: while (true) {
                        if ((var8 ^ -1) <= (this.field_P.field_r ^ -1)) {
                          break L2;
                        } else {
                          L4: {
                            if (0 == (var7 & 1 << var8)) {
                              break L4;
                            } else {
                              this.a(this.field_P.field_v[var8], this.field_n, true);
                              break L4;
                            }
                          }
                          var8++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    if (-2 != (var5 ^ -1)) {
                      break L2;
                    } else {
                      var6 = param0.j(-96);
                      var7 = param0.j(-120);
                      var8_ref_fs = this.field_P.field_v[var6];
                      var9 = this.field_P.field_v[var7];
                      var8_ref_fs.field_f[var7] = 3;
                      var8_ref_fs.field_h[var7] = true;
                      var9.field_f[var6] = 3;
                      var9.field_h[var6] = true;
                      var8_ref_fs.field_A = var8_ref_fs.field_A & (1 << var7 ^ -1);
                      var8_ref_fs.field_w = var8_ref_fs.field_w & (1 << var7 ^ -1);
                      var9.field_A = var9.field_A & (1 << var6 ^ -1);
                      var9.field_w = var9.field_w & (1 << var6 ^ -1);
                      this.a(var8_ref_fs, -27584, var9);
                      param1 -= 3;
                      break L2;
                    }
                  }
                }
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var4);
            stackOut_19_1 = new StringBuilder().append("km.K(");
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, ln param1, int param2) {
        RuntimeException runtimeException = null;
        qm var4 = null;
        int var5 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4 = (qm) ((Object) this.field_P.field_i.d(param2 + param2));
            L1: while (true) {
              L2: {
                if (null == var4) {
                  break L2;
                } else {
                  if (param0 != var4.field_o) {
                    var4 = (qm) ((Object) this.field_P.field_i.a((byte) -71));
                    continue L1;
                  } else {
                    var4.field_q = param1;
                    break L2;
                  }
                }
              }
              L3: {
                if (null != var4) {
                  break L3;
                } else {
                  var4 = new qm(param0, this.field_n, param1);
                  break L3;
                }
              }
              L4: {
                this.field_P.field_i.a((byte) -113, var4);
                if (!this.field_f) {
                  break L4;
                } else {
                  this.field_ab.a(var4, 32);
                  this.e(param2 ^ 0);
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (runtimeException);
            stackOut_16_1 = new StringBuilder().append("km.R(").append(param0).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L5;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param2 + ')');
        }
    }

    private final void a(boolean param0, int[] param1) {
        RuntimeException var3 = null;
        int[] var3_array = null;
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        ln[] var11_ref_ln__ = null;
        fs[] var11_ref_fs__ = null;
        oh var11_ref_oh = null;
        int var11 = 0;
        int var12 = 0;
        eg var12_ref_eg = null;
        hj var12_ref_hj = null;
        qi var12_ref_qi = null;
        qm var12_ref_qm = null;
        mg var12_ref_mg = null;
        ln var13 = null;
        fs var13_ref = null;
        int var13_int = 0;
        fs[] var13_array = null;
        um var13_ref2 = null;
        ne var13_ref3 = null;
        int var14_int = 0;
        um var14 = null;
        int var15_int = 0;
        sd var15 = null;
        fs var15_ref = null;
        int var16 = 0;
        int stackIn_117_0 = 0;
        RuntimeException stackIn_144_0 = null;
        StringBuilder stackIn_144_1 = null;
        RuntimeException stackIn_146_0 = null;
        StringBuilder stackIn_146_1 = null;
        RuntimeException stackIn_147_0 = null;
        StringBuilder stackIn_147_1 = null;
        String stackIn_147_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_116_0 = 0;
        int stackOut_114_0 = 0;
        RuntimeException stackOut_143_0 = null;
        StringBuilder stackOut_143_1 = null;
        RuntimeException stackOut_146_0 = null;
        StringBuilder stackOut_146_1 = null;
        String stackOut_146_2 = null;
        RuntimeException stackOut_144_0 = null;
        StringBuilder stackOut_144_1 = null;
        String stackOut_144_2 = null;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                this.field_R = (fs[]) null;
                break L1;
              }
            }
            var3_array = new int[this.field_P.field_r];
            var4 = new int[this.field_P.field_r];
            var5 = new int[this.field_P.field_r];
            var6 = new int[this.field_P.field_r];
            var7 = new int[this.field_P.field_r];
            var8 = new int[this.field_P.field_r];
            var9 = new int[this.field_P.field_r];
            var10 = new int[this.field_P.field_r];
            var11_ref_ln__ = this.field_P.field_g.field_e;
            var12 = 0;
            L2: while (true) {
              if (var12 >= var11_ref_ln__.length) {
                var11_ref_fs__ = this.field_P.field_v;
                var12 = 0;
                L3: while (true) {
                  if (var11_ref_fs__.length <= var12) {
                    L4: {
                      if (this.field_Q != null) {
                        var11_ref_oh = this.field_Q.field_a.d(0);
                        L5: while (true) {
                          if (null == var11_ref_oh) {
                            break L4;
                          } else {
                            L6: {
                              if (!(var11_ref_oh instanceof hj)) {
                                break L6;
                              } else {
                                var12_ref_hj = (hj) ((Object) var11_ref_oh);
                                if (var12_ref_hj.field_j == null) {
                                  break L6;
                                } else {
                                  var7[var12_ref_hj.field_j.field_x] = var7[var12_ref_hj.field_j.field_x] + var12_ref_hj.field_h;
                                  break L6;
                                }
                              }
                            }
                            L7: {
                              if (!(var11_ref_oh instanceof eg)) {
                                break L7;
                              } else {
                                var12_ref_eg = (eg) ((Object) var11_ref_oh);
                                var13_int = 0;
                                L8: while (true) {
                                  if (this.field_P.field_r <= var13_int) {
                                    L9: {
                                      if (var12_ref_eg.field_i != var12_ref_eg.field_w) {
                                        L10: {
                                          if (null == var12_ref_eg.field_w) {
                                            break L10;
                                          } else {
                                            var12_ref_eg.field_w.field_q.field_a = var12_ref_eg.field_w.field_q.field_a + 1;
                                            break L10;
                                          }
                                        }
                                        L11: {
                                          if (null == var12_ref_eg.field_i) {
                                            break L11;
                                          } else {
                                            var12_ref_eg.field_i.field_q.field_m = var12_ref_eg.field_i.field_q.field_m + 1;
                                            break L11;
                                          }
                                        }
                                        var13_array = var12_ref_eg.field_h;
                                        var14_int = 0;
                                        L12: while (true) {
                                          if ((var13_array.length ^ -1) >= (var14_int ^ -1)) {
                                            break L9;
                                          } else {
                                            L13: {
                                              var15_ref = var13_array[var14_int];
                                              if (null == var15_ref) {
                                                break L13;
                                              } else {
                                                if (var12_ref_eg.field_w == var15_ref) {
                                                  break L13;
                                                } else {
                                                  if (var12_ref_eg.field_i != var15_ref) {
                                                    var15_ref.field_q.field_q = var15_ref.field_q.field_q + 1;
                                                    break L13;
                                                  } else {
                                                    break L13;
                                                  }
                                                }
                                              }
                                            }
                                            var14_int++;
                                            continue L12;
                                          }
                                        }
                                      } else {
                                        L14: {
                                          if (null == var12_ref_eg.field_i) {
                                            break L14;
                                          } else {
                                            var12_ref_eg.field_i.field_q.field_y = var12_ref_eg.field_i.field_q.field_y + 1;
                                            break L14;
                                          }
                                        }
                                        var13_array = var12_ref_eg.field_h;
                                        var14_int = 0;
                                        L15: while (true) {
                                          if (var14_int >= var13_array.length) {
                                            break L9;
                                          } else {
                                            L16: {
                                              var15_ref = var13_array[var14_int];
                                              if (var15_ref == null) {
                                                break L16;
                                              } else {
                                                if (var15_ref != var12_ref_eg.field_w) {
                                                  var15_ref.field_q.field_q = var15_ref.field_q.field_q + 1;
                                                  break L16;
                                                } else {
                                                  break L16;
                                                }
                                              }
                                            }
                                            var14_int++;
                                            continue L15;
                                          }
                                        }
                                      }
                                    }
                                    var13_ref3 = (ne) ((Object) var12_ref_eg.field_v.d(0));
                                    L17: while (true) {
                                      if (var13_ref3 == null) {
                                        break L7;
                                      } else {
                                        L18: {
                                          if (var12_ref_eg.field_w != var13_ref3.field_h) {
                                            var10[var13_ref3.field_h.field_x] = var10[var13_ref3.field_h.field_x] + var13_ref3.field_i;
                                            break L18;
                                          } else {
                                            break L18;
                                          }
                                        }
                                        var13_ref3 = (ne) ((Object) var12_ref_eg.field_v.a((byte) -71));
                                        continue L17;
                                      }
                                    }
                                  } else {
                                    var8[var13_int] = var8[var13_int] + var12_ref_eg.field_k[var13_int];
                                    var13_int++;
                                    continue L8;
                                  }
                                }
                              }
                            }
                            L19: {
                              if (var11_ref_oh instanceof qi) {
                                var12_ref_qi = (qi) ((Object) var11_ref_oh);
                                var8[var12_ref_qi.field_k.field_x] = var8[var12_ref_qi.field_k.field_x] + var12_ref_qi.field_i;
                                var12_ref_qi.field_k.field_q.field_s = var12_ref_qi.field_k.field_q.field_s + 1;
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                            L20: {
                              if (var11_ref_oh instanceof qm) {
                                var12_ref_qm = (qm) ((Object) var11_ref_oh);
                                var12_ref_qm.field_p.field_q.field_s = var12_ref_qm.field_p.field_q.field_s + 1;
                                break L20;
                              } else {
                                break L20;
                              }
                            }
                            L21: {
                              if (!(var11_ref_oh instanceof mg)) {
                                break L21;
                              } else {
                                var12_ref_mg = (mg) ((Object) var11_ref_oh);
                                var13_ref2 = var12_ref_mg.field_G.field_q;
                                var13_ref2.field_t = var13_ref2.field_t + 1;
                                var13_ref2.field_i = var13_ref2.field_i + var12_ref_mg.field_z;
                                var9[var12_ref_mg.field_G.field_x] = var9[var12_ref_mg.field_G.field_x] + var12_ref_mg.field_z;
                                break L21;
                              }
                            }
                            var11_ref_oh = this.field_Q.field_a.a((byte) -71);
                            continue L5;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    L22: {
                      if ((this.field_P.field_O ^ -1) == 0) {
                        stackOut_116_0 = 0;
                        stackIn_117_0 = stackOut_116_0;
                        break L22;
                      } else {
                        stackOut_114_0 = this.field_P.field_O % 100;
                        stackIn_117_0 = stackOut_114_0;
                        break L22;
                      }
                    }
                    var11 = stackIn_117_0;
                    var12 = 0;
                    L23: while (true) {
                      if (this.field_P.field_r <= var12) {
                        break L0;
                      } else {
                        L24: {
                          var13_ref = this.field_P.field_v[var12];
                          var14 = var13_ref.field_q;
                          var14.field_g[var11] = var3_array[var12];
                          var14.field_f[var11] = var4[var12];
                          var14.field_h[var11] = var6[var12];
                          if ((var3_array[var12] ^ -1) < (var14.field_A ^ -1)) {
                            var14.field_A = var3_array[var12];
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                        L25: {
                          var14.field_v = var14.field_v + var8[var12];
                          if ((var4[var12] ^ -1) < (var14.field_x ^ -1)) {
                            var14.field_x = var4[var12];
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                        L26: {
                          var14.field_o = var14.field_o + var7[var12];
                          var14.field_r = var14.field_e + (var14.field_o - var3_array[var12]);
                          if (var13_ref.field_i.g(115)) {
                            break L26;
                          } else {
                            L27: {
                              if (param1 == null) {
                                break L27;
                              } else {
                                L28: {
                                  if ((var5[var12] ^ -1) < -1) {
                                    var14.field_u = var14.field_u + (var4[var12] * 800 - -var5[var12]) / (var5[var12] * 2);
                                    break L28;
                                  } else {
                                    break L28;
                                  }
                                }
                                var14.field_z = var14.field_z + (param1[var12] + 200 * var10[var12]) / (2 * param1[var12]);
                                var14.field_w = var14.field_w + (param1[var12] + 200 * var9[var12]) / (2 * param1[var12]);
                                break L27;
                              }
                            }
                            var14.field_l = this.field_P.field_O + -this.field_q;
                            break L26;
                          }
                        }
                        var12++;
                        continue L23;
                      }
                    }
                  } else {
                    L29: {
                      var13_ref = var11_ref_fs__[var12];
                      var14_int = var13_ref.field_x;
                      if (this.field_P.field_o.field_i) {
                        if (null == var13_ref.field_m) {
                          break L29;
                        } else {
                          var4[var14_int] = var13_ref.field_m.field_r;
                          break L29;
                        }
                      } else {
                        var15 = (sd) ((Object) var13_ref.field_i.d(0));
                        L30: while (true) {
                          if (var15 == null) {
                            break L29;
                          } else {
                            var4[var14_int] = var4[var14_int] + var15.field_r;
                            var15 = (sd) ((Object) var13_ref.field_i.a((byte) -71));
                            continue L30;
                          }
                        }
                      }
                    }
                    var12++;
                    continue L3;
                  }
                }
              } else {
                L31: {
                  var13 = var11_ref_ln__[var12];
                  if (null != var13.field_y) {
                    var14_int = var13.field_y.field_x;
                    var6[var14_int] = var6[var14_int] + 1;
                    var3_array[var14_int] = var3_array[var14_int] + var13.field_x;
                    if (-1 >= (var13.field_G[0] ^ -1)) {
                      var15_int = 0;
                      L32: while (true) {
                        if (4 <= var15_int) {
                          break L31;
                        } else {
                          var5[var14_int] = var5[var14_int] + var13.field_G[var15_int];
                          var15_int++;
                          continue L32;
                        }
                      }
                    } else {
                      break L31;
                    }
                  } else {
                    break L31;
                  }
                }
                var12++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L33: {
            var3 = decompiledCaughtException;
            stackOut_143_0 = (RuntimeException) (var3);
            stackOut_143_1 = new StringBuilder().append("km.SA(").append(param0).append(',');
            stackIn_146_0 = stackOut_143_0;
            stackIn_146_1 = stackOut_143_1;
            stackIn_144_0 = stackOut_143_0;
            stackIn_144_1 = stackOut_143_1;
            if (param1 == null) {
              stackOut_146_0 = (RuntimeException) ((Object) stackIn_146_0);
              stackOut_146_1 = (StringBuilder) ((Object) stackIn_146_1);
              stackOut_146_2 = "null";
              stackIn_147_0 = stackOut_146_0;
              stackIn_147_1 = stackOut_146_1;
              stackIn_147_2 = stackOut_146_2;
              break L33;
            } else {
              stackOut_144_0 = (RuntimeException) ((Object) stackIn_144_0);
              stackOut_144_1 = (StringBuilder) ((Object) stackIn_144_1);
              stackOut_144_2 = "{...}";
              stackIn_147_0 = stackOut_144_0;
              stackIn_147_1 = stackOut_144_1;
              stackIn_147_2 = stackOut_144_2;
              break L33;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_147_0), stackIn_147_2 + ')');
        }
    }

    public final void a(byte param0, fs param1, fs param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == -63) {
                break L1;
              } else {
                field_A = (String) null;
                break L1;
              }
            }
            L2: {
              if (this.field_f) {
                if (sm.field_e) {
                  this.a(param2, (byte) 50);
                  break L2;
                } else {
                  throw new RuntimeException();
                }
              } else {
                break L2;
              }
            }
            if (param2 == param1) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if (0 == (param1.field_w & 1 << param2.field_x)) {
                L3: {
                  param1.field_w = param1.field_w | 1 << param2.field_x;
                  param2.field_A = param2.field_A | 1 << param1.field_x;
                  if ((1 << param2.field_x & param1.field_A ^ -1) == -1) {
                    if (this.field_s[param2.field_x] != null) {
                      this.field_s[param2.field_x].a(param1, param0 ^ -7737);
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    L4: {
                      if (null != this.field_s[param2.field_x]) {
                        this.field_s[param2.field_x].a(param1, (byte) -42);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    param1.field_f[param2.field_x] = 3;
                    param1.field_h[param2.field_x] = true;
                    param2.field_f[param1.field_x] = 3;
                    param2.field_h[param1.field_x] = true;
                    param1.field_A = param1.field_A & (1 << param2.field_x ^ -1);
                    param1.field_w = param1.field_w & (1 << param2.field_x ^ -1);
                    param2.field_A = param2.field_A & (1 << param1.field_x ^ -1);
                    param2.field_w = param2.field_w & (1 << param1.field_x ^ -1);
                    this.a(param2, param0 ^ 27521, param1);
                    break L3;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var4);
            stackOut_31_1 = new StringBuilder().append("km.Q(").append(param0).append(',');
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L5;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L5;
            }
          }
          L6: {
            stackOut_35_0 = (RuntimeException) ((Object) stackIn_35_0);
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');
            stackIn_38_0 = stackOut_35_0;
            stackIn_38_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param2 == null) {
              stackOut_38_0 = (RuntimeException) ((Object) stackIn_38_0);
              stackOut_38_1 = (StringBuilder) ((Object) stackIn_38_1);
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L6;
            } else {
              stackOut_36_0 = (RuntimeException) ((Object) stackIn_36_0);
              stackOut_36_1 = (StringBuilder) ((Object) stackIn_36_1);
              stackOut_36_2 = "{...}";
              stackIn_39_0 = stackOut_36_0;
              stackIn_39_1 = stackOut_36_1;
              stackIn_39_2 = stackOut_36_2;
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_39_0), stackIn_39_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    final void c(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!this.field_f) {
              throw new IllegalStateException();
            } else {
              L1: {
                if (!param0) {
                  break L1;
                } else {
                  this.c(false);
                  break L1;
                }
              }
              js.field_f.h(63, 255);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "km.LA(" + param0 + ')');
        }
    }

    final void a(int param0, fs param1) {
        RuntimeException var3 = null;
        ka var3_ref = null;
        ka[] var4 = null;
        int var5 = 0;
        ka var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            this.field_P.a(-5, param1);
            var3_ref = new ka(this.field_P, param1, (mn) (this), 2);
            var4 = new ka[this.field_s.length + 1];
            var5 = 0;
            L1: while (true) {
              if (var5 >= this.field_s.length) {
                var4[param1.field_x] = new ka(this.field_P, param1, (mn) (this), param0);
                var4[var5] = var3_ref;
                this.field_s = (uj[]) ((Object) var4);
                break L0;
              } else {
                L2: {
                  if (this.field_s[var5] != null) {
                    var4[var5] = new ka(this.field_P, this.field_P.field_v[var5], (mn) (this), 2);
                    var6 = (ka) ((Object) this.field_s[var5]);
                    var7 = 0;
                    L3: while (true) {
                      if ((var6.field_i.length ^ -1) >= (var7 ^ -1)) {
                        break L2;
                      } else {
                        var4[var5].field_i[var7] = var6.field_i[var7];
                        var7++;
                        continue L3;
                      }
                    }
                  } else {
                    break L2;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3);
            stackOut_16_1 = new StringBuilder().append("km.O(").append(param0).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ')');
        }
    }

    final void g(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        fs[] var2_array = null;
        mg var2_ref = null;
        int var3_int = 0;
        qa var3 = null;
        fs var4 = null;
        qm var4_ref = null;
        ln[] var5 = null;
        int var6 = 0;
        ln var7 = null;
        int var8 = 0;
        int stackIn_11_0 = 0;
        boolean stackIn_12_0 = false;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        boolean stackOut_11_0 = false;
        boolean stackOut_5_0 = false;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!this.field_f) {
                break L1;
              } else {
                L2: {
                  if (0 > this.field_h) {
                    L3: {
                      if ((oq.field_j ^ -1) == -14) {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        break L3;
                      } else {
                        stackOut_8_0 = 1;
                        stackIn_11_0 = stackOut_8_0;
                        break L3;
                      }
                    }
                    stackOut_11_0 = stackIn_11_0 != 0 & ge.field_n;
                    stackIn_12_0 = stackOut_11_0;
                    break L2;
                  } else {
                    stackOut_5_0 = sr.field_h;
                    stackIn_12_0 = stackOut_5_0;
                    break L2;
                  }
                }
                var2_int = stackIn_12_0 ? 1 : 0;
                if (var2_int != 0) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            if (13 == oq.field_j) {
              L4: {
                var2_int = 1;
                if (this.field_f) {
                  if (-1 >= (this.field_h ^ -1)) {
                    if (!this.field_b) {
                      var2_int = 3;
                      break L4;
                    } else {
                      var2_int = 2;
                      break L4;
                    }
                  } else {
                    var2_int = 4;
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
              var3_int = var2_int;
              ta.a(0, var3_int, (byte) 96, false);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              if (param0 <= -80) {
                L5: {
                  this.field_Y.h(-1);
                  if (!se.field_g) {
                    break L5;
                  } else {
                    if (this.field_f) {
                      break L5;
                    } else {
                      L6: {
                        if (!di.field_p[86]) {
                          break L6;
                        } else {
                          if (di.field_p[35]) {
                            this.a((byte) -2, this.field_n);
                            this.m(123);
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      if (!di.field_p[86]) {
                        break L5;
                      } else {
                        if (di.field_p[67]) {
                          var2_array = this.field_P.field_v;
                          var3_int = 0;
                          L7: while (true) {
                            if ((var2_array.length ^ -1) >= (var3_int ^ -1)) {
                              this.m(126);
                              break L5;
                            } else {
                              L8: {
                                var4 = var2_array[var3_int];
                                if (this.field_n == var4) {
                                  break L8;
                                } else {
                                  this.a((byte) -66, var4);
                                  break L8;
                                }
                              }
                              var3_int++;
                              continue L7;
                            }
                          }
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                }
                L9: {
                  if (!se.field_g) {
                    break L9;
                  } else {
                    if (!this.field_f) {
                      break L9;
                    } else {
                      if (null == this.field_n) {
                        break L9;
                      } else {
                        if (!di.field_p[82]) {
                          break L9;
                        } else {
                          if (!di.field_p[81]) {
                            break L9;
                          } else {
                            if ((oq.field_j ^ -1) != -17) {
                              break L9;
                            } else {
                              sm.field_e = true;
                              em.a(mq.c((byte) 73), 1);
                              this.field_s[this.field_h] = (uj) ((Object) new hi(this.field_n, this.field_P, (mn) (this)));
                              var2_ref = (mg) ((Object) this.field_P.field_p.a(true));
                              L10: while (true) {
                                if (null == var2_ref) {
                                  var3 = (qa) ((Object) this.field_P.field_q.d(0));
                                  L11: while (true) {
                                    if (null == var3) {
                                      var4_ref = (qm) ((Object) this.field_P.field_i.d(0));
                                      L12: while (true) {
                                        if (var4_ref == null) {
                                          this.e(0);
                                          this.field_s[this.field_h].b((byte) -98);
                                          this.a(this.field_n, -122);
                                          var5 = this.field_P.field_g.field_e;
                                          var6 = 0;
                                          L13: while (true) {
                                            if ((var6 ^ -1) <= (var5.length ^ -1)) {
                                              var2_ref = (mg) ((Object) this.field_P.field_p.a(true));
                                              L14: while (true) {
                                                if (var2_ref == null) {
                                                  var3 = (qa) ((Object) this.field_P.field_q.d(0));
                                                  L15: while (true) {
                                                    if (var3 == null) {
                                                      var4_ref = (qm) ((Object) this.field_P.field_i.d(0));
                                                      L16: while (true) {
                                                        if (null == var4_ref) {
                                                          this.e(0);
                                                          break L9;
                                                        } else {
                                                          this.field_ab.a(var4_ref, 32);
                                                          var4_ref = (qm) ((Object) this.field_P.field_i.a((byte) -71));
                                                          continue L16;
                                                        }
                                                      }
                                                    } else {
                                                      this.field_o.a(var3, 32);
                                                      var3 = (qa) ((Object) this.field_P.field_q.a((byte) -71));
                                                      continue L15;
                                                    }
                                                  }
                                                } else {
                                                  this.field_v.a((byte) 9, var2_ref);
                                                  var2_ref = (mg) ((Object) this.field_P.field_p.a((byte) -68));
                                                  continue L14;
                                                }
                                              }
                                            } else {
                                              var7 = var5[var6];
                                              fl.a(var7, (byte) 96);
                                              kr.a((byte) -99, var7);
                                              var6++;
                                              continue L13;
                                            }
                                          }
                                        } else {
                                          var4_ref.field_q = null;
                                          var4_ref.field_r = null;
                                          this.field_ab.a(var4_ref, 32);
                                          var4_ref.b((byte) -71);
                                          var4_ref = (qm) ((Object) this.field_P.field_i.a((byte) -71));
                                          continue L12;
                                        }
                                      }
                                    } else {
                                      var3.field_u.field_J = var3.field_u.field_J - var3.field_v;
                                      this.field_C[var3.field_u.field_p] = this.field_C[var3.field_u.field_p] - var3.field_v;
                                      var3.field_v = 0;
                                      var3.b((byte) -74);
                                      this.field_o.a(var3, 32);
                                      var3 = (qa) ((Object) this.field_P.field_q.a((byte) -71));
                                      continue L11;
                                    }
                                  }
                                } else {
                                  this.a(var2_ref, -var2_ref.field_z, 10755);
                                  var2_ref = (mg) ((Object) this.field_P.field_p.a((byte) -68));
                                  continue L10;
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 3;
                break L0;
              } else {
                decompiledRegionSelector0 = 2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "km.G(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    private final void a(int param0, byte param1, int param2) {
        gm discarded$3 = null;
        gm discarded$4 = null;
        gm discarded$5 = null;
        RuntimeException var4 = null;
        gm var4_ref = null;
        int var4_int = 0;
        ln[] var4_array = null;
        ln var4_ref2 = null;
        int var5_int = 0;
        sf var5 = null;
        ln[] var5_array = null;
        fs var5_ref = null;
        int var6 = 0;
        ln var6_ref_ln = null;
        ln var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int stackIn_33_0 = 0;
        int stackIn_47_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_131_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_130_0 = 0;
        int stackOut_128_0 = 0;
        int stackOut_32_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_50_0 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            this.field_z.a(this.field_m, 0, param2, param0);
            if (this.field_b) {
              if (param1 <= -66) {
                L1: {
                  if (null == this.field_z.field_p) {
                    break L1;
                  } else {
                    if (this.field_m == 2) {
                      L2: {
                        if (this.field_z.field_p.field_R == this.field_c) {
                          break L2;
                        } else {
                          if (!this.field_P.field_o.field_i) {
                            break L1;
                          } else {
                            if (null == this.field_z.field_p.field_y) {
                              break L1;
                            } else {
                              if (this.field_c == this.field_z.field_p.field_y.field_m) {
                                break L2;
                              } else {
                                break L1;
                              }
                            }
                          }
                        }
                      }
                      L3: {
                        this.field_z.e(-18641);
                        this.a(this.field_z.field_p, -83);
                        if ((this.field_x ^ -1) >= -4) {
                          var4_ref = qk.a(qc.field_w, 78);
                          break L3;
                        } else {
                          L4: {
                            var5_int = this.field_x - 3;
                            var6 = 96 >> (var5_int >> 1071934977);
                            if (0 == (var5_int & 1)) {
                              break L4;
                            } else {
                              var6 = 46341 * var6 >> -56733360;
                              break L4;
                            }
                          }
                          L5: {
                            if (var6 < 24) {
                              var6 = 24;
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var4_ref = rp.a(96, qc.field_w, var6);
                          break L3;
                        }
                      }
                      L6: {
                        if (null == this.field_E) {
                          this.field_E = new sf(var4_ref, cl.field_n);
                          break L6;
                        } else {
                          var5 = this.field_E;
                          L7: while (true) {
                            if (null == var5.field_b) {
                              var5.field_b = new sf(var4_ref, cl.field_n);
                              break L6;
                            } else {
                              var5 = var5.field_b;
                              continue L7;
                            }
                          }
                        }
                      }
                      this.field_x = this.field_x + 1;
                      this.a(2);
                      break L1;
                    } else {
                      if (-1 == (this.field_m ^ -1)) {
                        if (this.field_n != this.field_z.field_p.field_y) {
                          break L1;
                        } else {
                          if (this.field_n == null) {
                            break L1;
                          } else {
                            if (0 < this.field_z.field_p.field_J) {
                              this.field_K = this.field_z.field_p;
                              discarded$3 = qk.a(us.field_d, 74);
                              this.field_Y.a(-107, 1);
                              this.field_z.field_z[this.field_K.field_p] = 1;
                              var4_array = this.field_K.field_D;
                              var5_int = 0;
                              L8: while (true) {
                                if ((var5_int ^ -1) <= (var4_array.length ^ -1)) {
                                  var4_ref2 = this.field_K.field_R.j(18229);
                                  L9: while (true) {
                                    if (null == var4_ref2) {
                                      break L1;
                                    } else {
                                      L10: {
                                        if (var4_ref2 == this.field_K) {
                                          break L10;
                                        } else {
                                          if (this.field_P.a(this.field_K, var4_ref2, -1)) {
                                            this.field_z.field_z[var4_ref2.field_p] = 2;
                                            break L10;
                                          } else {
                                            break L10;
                                          }
                                        }
                                      }
                                      var4_ref2 = this.field_K.field_R.h(-23410);
                                      continue L9;
                                    }
                                  }
                                } else {
                                  var6_ref_ln = var4_array[var5_int];
                                  this.field_z.field_z[var6_ref_ln.field_p] = 2;
                                  var5_int++;
                                  continue L8;
                                }
                              }
                            } else {
                              break L1;
                            }
                          }
                        }
                      } else {
                        if ((this.field_m ^ -1) != -2) {
                          if (-4 == (this.field_m ^ -1)) {
                            if (this.field_z.field_p.field_y != this.field_n) {
                              break L1;
                            } else {
                              if (this.field_z.field_p.field_u) {
                                break L1;
                              } else {
                                this.field_z.e(-18641);
                                this.a(2);
                                this.a(0, this.field_z.field_p, 0);
                                this.field_Y.a(-119, 0);
                                this.field_Y.b(0, 2);
                                break L1;
                              }
                            }
                          } else {
                            if (this.field_m != 4) {
                              if (5 == this.field_m) {
                                L11: {
                                  if (this.field_n != this.field_z.field_p.field_y) {
                                    stackOut_130_0 = 0;
                                    stackIn_131_0 = stackOut_130_0;
                                    break L11;
                                  } else {
                                    stackOut_128_0 = 1;
                                    stackIn_131_0 = stackOut_128_0;
                                    break L11;
                                  }
                                }
                                var4_int = stackIn_131_0;
                                var5_array = this.field_z.field_p.field_D;
                                var6 = 0;
                                L12: while (true) {
                                  if ((var6 ^ -1) <= (var5_array.length ^ -1)) {
                                    L13: {
                                      var5_ref = this.field_z.field_p.field_y;
                                      if (var4_int == 0) {
                                        break L13;
                                      } else {
                                        if (this.field_n == var5_ref) {
                                          break L13;
                                        } else {
                                          L14: {
                                            if (null == var5_ref) {
                                              break L14;
                                            } else {
                                              if (this.field_n.field_h[var5_ref.field_x]) {
                                                break L13;
                                              } else {
                                                break L14;
                                              }
                                            }
                                          }
                                          this.field_z.e(-18641);
                                          this.a(2);
                                          this.a(2, this.field_z.field_p, 0);
                                          this.field_Y.a(-81, 0);
                                          this.field_Y.b(2, 2);
                                          break L13;
                                        }
                                      }
                                    }
                                    break L1;
                                  } else {
                                    L15: {
                                      var7 = var5_array[var6];
                                      if (var7.field_y == this.field_n) {
                                        var4_int = 1;
                                        break L15;
                                      } else {
                                        break L15;
                                      }
                                    }
                                    var6++;
                                    continue L12;
                                  }
                                }
                              } else {
                                if (this.field_m == 6) {
                                  if (this.field_z.field_p.field_y == this.field_n) {
                                    this.field_z.e(-18641);
                                    this.a(2);
                                    this.field_K = this.field_z.field_p;
                                    this.field_Y.a(-84, 7);
                                    var4_array = this.field_P.field_g.field_e;
                                    var5_int = 0;
                                    L16: while (true) {
                                      if (var5_int >= var4_array.length) {
                                        break L1;
                                      } else {
                                        L17: {
                                          var6_ref_ln = var4_array[var5_int];
                                          if (this.field_z.field_p.b(var6_ref_ln, (byte) 10)) {
                                            break L17;
                                          } else {
                                            if (this.field_z.field_p != var6_ref_ln) {
                                              this.field_z.field_z[var6_ref_ln.field_p] = 2;
                                              break L17;
                                            } else {
                                              break L17;
                                            }
                                          }
                                        }
                                        var5_int++;
                                        continue L16;
                                      }
                                    }
                                  } else {
                                    break L1;
                                  }
                                } else {
                                  if (7 == this.field_m) {
                                    if (this.field_K.b(this.field_z.field_p, (byte) 10)) {
                                      break L1;
                                    } else {
                                      if (this.field_K == this.field_z.field_p) {
                                        break L1;
                                      } else {
                                        this.field_z.e(-18641);
                                        this.a(2);
                                        this.a(41, this.field_z.field_p, this.field_K, 3);
                                        this.field_Y.a(-117, 0);
                                        this.field_Y.b(3, 2);
                                        break L1;
                                      }
                                    }
                                  } else {
                                    break L1;
                                  }
                                }
                              }
                            } else {
                              if (this.field_z.field_p.field_y != this.field_n) {
                                break L1;
                              } else {
                                if ((this.field_z.field_p.field_L ^ -1) != -1) {
                                  break L1;
                                } else {
                                  this.field_z.e(-18641);
                                  this.a(2);
                                  this.a(1, this.field_z.field_p, 0);
                                  this.field_Y.a(-122, 0);
                                  this.field_Y.b(1, 2);
                                  break L1;
                                }
                              }
                            }
                          }
                        } else {
                          L18: {
                            L19: {
                              if (this.field_K.b(this.field_z.field_p, (byte) 10)) {
                                break L19;
                              } else {
                                if (this.field_K == this.field_z.field_p) {
                                  break L18;
                                } else {
                                  if (this.field_K.field_R != this.field_z.field_p.field_R) {
                                    break L18;
                                  } else {
                                    if (this.field_P.a(this.field_K, this.field_z.field_p, -1)) {
                                      break L19;
                                    } else {
                                      break L18;
                                    }
                                  }
                                }
                              }
                            }
                            L20: {
                              this.field_z.e(-18641);
                              var4_int = -this.field_K.field_N + this.field_K.field_J;
                              if (0 < var4_int) {
                                stackOut_32_0 = (1 + var4_int) / 2;
                                stackIn_33_0 = stackOut_32_0;
                                break L20;
                              } else {
                                stackOut_30_0 = 1;
                                stackIn_33_0 = stackOut_30_0;
                                break L20;
                              }
                            }
                            L21: {
                              var5_int = stackIn_33_0;
                              var6 = this.a((byte) 105);
                              if ((var6 ^ -1) != -82) {
                                if ((var6 ^ -1) == -87) {
                                  var5_int = 5;
                                  break L21;
                                } else {
                                  if (82 == var6) {
                                    L22: {
                                      if ((var4_int ^ -1) < -1) {
                                        stackOut_46_0 = var4_int;
                                        stackIn_47_0 = stackOut_46_0;
                                        break L22;
                                      } else {
                                        stackOut_44_0 = this.field_K.field_J;
                                        stackIn_47_0 = stackOut_44_0;
                                        break L22;
                                      }
                                    }
                                    var5_int = stackIn_47_0;
                                    break L21;
                                  } else {
                                    break L21;
                                  }
                                }
                              } else {
                                var5_int = 1;
                                break L21;
                              }
                            }
                            L23: {
                              if (!this.field_P.field_o.field_e) {
                                stackOut_52_0 = this.field_K.field_N;
                                stackIn_53_0 = stackOut_52_0;
                                break L23;
                              } else {
                                stackOut_50_0 = 0;
                                stackIn_53_0 = stackOut_50_0;
                                break L23;
                              }
                            }
                            L24: {
                              var7_int = stackIn_53_0;
                              if (var5_int > this.field_K.field_J - var7_int) {
                                var5_int = this.field_K.field_J + -var7_int;
                                break L24;
                              } else {
                                break L24;
                              }
                            }
                            L25: {
                              if (var5_int <= 0) {
                                break L25;
                              } else {
                                L26: {
                                  this.a(false, var5_int, this.field_z.field_p, this.field_K);
                                  if (this.field_n == this.field_z.field_p.field_y) {
                                    break L26;
                                  } else {
                                    L27: {
                                      if (null != this.field_z.field_p.field_y) {
                                        break L27;
                                      } else {
                                        if (this.field_z.field_p.field_x == 0) {
                                          break L26;
                                        } else {
                                          break L27;
                                        }
                                      }
                                    }
                                    discarded$4 = qk.a(jj.field_l, 78);
                                    break L25;
                                  }
                                }
                                discarded$5 = qk.a(hs.field_l, 89);
                                break L25;
                              }
                            }
                            this.a(2);
                            break L18;
                          }
                          this.field_Y.a(-125, 0);
                          break L1;
                        }
                      }
                    }
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var4), "km.BA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    private final void d(byte param0) {
        int fieldTemp$1 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        fs[] var2_array = null;
        int var3 = 0;
        fs var4 = null;
        sd var5 = null;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              this.b(false);
              if (!this.field_W) {
                break L1;
              } else {
                if (0 != this.field_P.field_O) {
                  break L1;
                } else {
                  if (!this.field_P.field_o.field_i) {
                    var2_array = this.field_P.field_v;
                    var3 = 0;
                    L2: while (true) {
                      if ((var2_array.length ^ -1) >= (var3 ^ -1)) {
                        break L1;
                      } else {
                        var4 = var2_array[var3];
                        var5 = (sd) ((Object) var4.field_i.d(0));
                        L3: while (true) {
                          if (null == var5) {
                            var3++;
                            continue L2;
                          } else {
                            var5.field_x = 0;
                            var5 = (sd) ((Object) var4.field_i.a((byte) -71));
                            continue L3;
                          }
                        }
                      }
                    }
                  } else {
                    var2_array = this.field_P.field_v;
                    var3 = 0;
                    L4: while (true) {
                      if ((var3 ^ -1) <= (var2_array.length ^ -1)) {
                        break L1;
                      } else {
                        var4 = var2_array[var3];
                        var4.field_m.field_x = 0;
                        var3++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            }
            L5: {
              fieldTemp$1 = this.field_h + 1;
              this.field_h = this.field_h + 1;
              if (fieldTemp$1 != this.field_P.field_v.length) {
                break L5;
              } else {
                this.field_n = this.field_P.field_v[0];
                this.field_h = 0;
                this.field_P.c(0);
                this.b(lr.a((byte) 27), 79);
                this.field_z.field_d = lr.a((byte) 27);
                this.field_P.c((byte) 119);
                var2_int = 0;
                L6: while (true) {
                  if (this.field_P.field_r <= var2_int) {
                    break L5;
                  } else {
                    L7: {
                      if (null == this.field_s[var2_int]) {
                        break L7;
                      } else {
                        this.field_s[var2_int].a((byte) -63);
                        break L7;
                      }
                    }
                    var2_int++;
                    continue L6;
                  }
                }
              }
            }
            L8: {
              if (param0 == -81) {
                break L8;
              } else {
                this.a(false, 84, (ln) null, (ln) null);
                break L8;
              }
            }
            this.field_n = this.field_P.field_v[this.field_h];
            this.field_S = mb.field_o[this.field_P.field_J];
            this.a(true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "km.TA(" + param0 + ')');
        }
    }

    final void a(int param0, int param1) {
        qm var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3 = (qm) ((Object) this.field_P.field_i.d(0));
            L1: while (true) {
              if (var3 == null) {
                L2: {
                  if (param1 == 24) {
                    break L2;
                  } else {
                    this.field_f = true;
                    break L2;
                  }
                }
                this.field_Y.c(param0, 127);
                break L0;
              } else {
                L3: {
                  if ((var3.field_o ^ -1) == (param0 ^ -1)) {
                    L4: {
                      var3.field_r = null;
                      var3.field_q = null;
                      if (this.field_f) {
                        this.field_ab.a(var3, 32);
                        this.e(0);
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var3.b((byte) -117);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                var3 = (qm) ((Object) this.field_P.field_i.a((byte) -71));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var3_ref), "km.BB(" + param0 + ',' + param1 + ')');
        }
    }

    public static void h(int param0) {
        try {
            field_e = null;
            field_u = null;
            field_a = null;
            field_X = null;
            field_A = null;
            if (param0 != 11) {
                km.h(24);
            }
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) ((Object) runtimeException), "km.JA(" + param0 + ')');
        }
    }

    final void b(boolean param0, boolean param1) {
        boolean discarded$4 = false;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        RuntimeException var3 = null;
        sl var3_ref = null;
        int var4 = 0;
        tr stackIn_11_0 = null;
        tr stackIn_13_0 = null;
        tr stackIn_14_0 = null;
        pf stackIn_14_1 = null;
        RuntimeException decompiledCaughtException = null;
        tr stackOut_10_0 = null;
        tr stackOut_13_0 = null;
        Object stackOut_13_1 = null;
        tr stackOut_11_0 = null;
        pf stackOut_11_1 = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (!param0) {
                  break L2;
                } else {
                  if (ol.a(-114)) {
                    break L2;
                  } else {
                    this.j(50);
                    break L1;
                  }
                }
              }
              discarded$4 = this.field_Y.a(false, (byte) 110);
              break L1;
            }
            L3: {
              this.field_Y.h((byte) 122);
              stackOut_10_0 = this.field_z;
              stackIn_13_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if (null == this.field_Q) {
                stackOut_13_0 = (tr) ((Object) stackIn_13_0);
                stackOut_13_1 = null;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = (pf) ((Object) stackOut_13_1);
                break L3;
              } else {
                stackOut_11_0 = (tr) ((Object) stackIn_11_0);
                stackOut_11_1 = this.field_Q.field_a;
                stackIn_14_0 = stackOut_11_0;
                stackIn_14_1 = stackOut_11_1;
                break L3;
              }
            }
            ((tr) (Object) stackIn_14_0).a(stackIn_14_1, 66);
            L4: while (true) {
              L5: {
                if (null == this.field_E) {
                  break L5;
                } else {
                  if (cl.field_n + -this.field_E.field_c < 50) {
                    break L5;
                  } else {
                    this.field_x = this.field_x - 1;
                    this.field_E = this.field_E.field_b;
                    continue L4;
                  }
                }
              }
              L6: {
                if (param1) {
                  break L6;
                } else {
                  field_X = (String) null;
                  break L6;
                }
              }
              L7: {
                if (this.field_f) {
                  L8: {
                    if (1 < this.field_S) {
                      fieldTemp$5 = this.field_S - 1;
                      this.field_S = this.field_S - 1;
                      if (fieldTemp$5 != 1) {
                        break L8;
                      } else {
                        if (this.field_L) {
                          break L8;
                        } else {
                          if (this.field_b) {
                            this.m(123);
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                      }
                    } else {
                      break L8;
                    }
                  }
                  if (-1 != (this.field_S % 200 ^ -1)) {
                    break L7;
                  } else {
                    if (!this.field_L) {
                      break L7;
                    } else {
                      var3_ref = js.field_f;
                      var3_ref.h(61, 255);
                      var3_ref.c(this.field_P.field_O, (byte) -110);
                      var3_ref.e(11135, this.f(109));
                      break L7;
                    }
                  }
                } else {
                  this.field_S = this.field_S - 1;
                  break L7;
                }
              }
              L9: {
                if (!this.field_f) {
                  break L9;
                } else {
                  if (!this.field_b) {
                    break L9;
                  } else {
                    if ((this.field_k ^ -1) == 0) {
                      break L9;
                    } else {
                      L10: {
                        fieldTemp$6 = this.field_k - 1;
                        this.field_k = this.field_k - 1;
                        if (0 == (fieldTemp$6 ^ -1)) {
                          break L10;
                        } else {
                          fieldTemp$7 = this.field_g - 1;
                          this.field_g = this.field_g - 1;
                          if (-1 < (fieldTemp$7 ^ -1)) {
                            break L10;
                          } else {
                            break L9;
                          }
                        }
                      }
                      this.l(-106);
                      break L9;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var3), "km.GA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(fs param0, int param1, fs param2) {
        RuntimeException var4 = null;
        String var4_ref = null;
        int var5 = 0;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (this.field_n != param0) {
                if (param2 != this.field_n) {
                  var4_ref = re.a(lh.field_A, 4371, new String[]{param0.field_t, param2.field_t});
                  this.field_H.a(new n(param2, param0, var4_ref), 0);
                  break L1;
                } else {
                  var4_ref = re.a(se.field_c, 4371, new String[]{param0.field_t});
                  this.field_H.a(new n(param2, param0, var4_ref), 0);
                  break L1;
                }
              } else {
                var4_ref = re.a(jb.field_a, 4371, new String[]{param2.field_t});
                this.field_H.a(new n(param0, param2, var4_ref), 0);
                break L1;
              }
            }
            L2: {
              if (!this.field_W) {
                break L2;
              } else {
                fl.a(0, "signtreaty");
                break L2;
              }
            }
            L3: {
              this.a(this.field_n, param1 + 27510);
              if (null != this.field_s[param0.field_x]) {
                this.field_s[param0.field_x].a(param2, (byte) -42);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param1 == -27584) {
                break L4;
              } else {
                this.field_J = (int[]) null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) (var4);
            stackOut_19_1 = new StringBuilder().append("km.I(");
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L5;
            }
          }
          L6: {
            stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L6;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
    }

    private final void b(boolean param0) {
        int fieldTemp$1 = 0;
        RuntimeException var2 = null;
        n var2_ref = null;
        qm var3 = null;
        int var4 = 0;
        int var5 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_ref = (n) ((Object) this.field_H.d(0));
            if (!param0) {
              L1: while (true) {
                if (var2_ref == null) {
                  L2: {
                    if (this.field_W) {
                      var3 = (qm) ((Object) this.field_P.field_i.d(0));
                      L3: while (true) {
                        if (var3 == null) {
                          break L2;
                        } else {
                          L4: {
                            var4 = var3.field_o;
                            if (-1 == (var4 ^ -1)) {
                              fl.a(0, "defensivenet");
                              break L4;
                            } else {
                              if ((var4 ^ -1) == -2) {
                                fl.a(0, "terraforming");
                                break L4;
                              } else {
                                if (-3 == (var4 ^ -1)) {
                                  fl.a(0, "stellarbomb");
                                  break L4;
                                } else {
                                  if ((var4 ^ -1) != -4) {
                                    break L4;
                                  } else {
                                    fl.a(0, "tannhauser");
                                    break L4;
                                  }
                                }
                              }
                            }
                          }
                          var3 = (qm) ((Object) this.field_P.field_i.a((byte) -71));
                          continue L3;
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L5: {
                    fieldTemp$1 = var2_ref.field_i + 1;
                    var2_ref.field_i = var2_ref.field_i + 1;
                    if (-3 != (fieldTemp$1 ^ -1)) {
                      break L5;
                    } else {
                      var2_ref.b((byte) -85);
                      break L5;
                    }
                  }
                  var2_ref = (n) ((Object) this.field_H.a((byte) -71));
                  continue L1;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "km.DA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(boolean param0) {
        Exception var2 = null;
        RuntimeException var2_ref = null;
        ln[] var2_array = null;
        int var2_int = 0;
        mg var2_ref2 = null;
        int var3_int = 0;
        qa var3 = null;
        ln var4 = null;
        qm var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_78_0 = 0;
        int stackIn_78_1 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_76_0 = 0;
        int stackOut_76_1 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            System.gc();
            this.field_P.field_x.a((byte) -70, this.field_P, this.field_Y);
            var2_array = this.field_P.field_g.field_e;
            var3_int = 0;
            L1: while (true) {
              if (var3_int >= var2_array.length) {
                L2: {
                  L3: {
                    if (null == this.field_R) {
                      break L3;
                    } else {
                      if (this.field_P.field_g.field_e.length > this.field_R.length) {
                        break L3;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var2_int = this.field_P.field_g.field_e.length;
                  this.field_C = new int[var2_int];
                  this.field_R = new fs[var2_int];
                  this.field_l = new sd[var2_int];
                  break L2;
                }
                var2_array = this.field_P.field_g.field_e;
                var3_int = 0;
                L4: while (true) {
                  if ((var2_array.length ^ -1) >= (var3_int ^ -1)) {
                    L5: {
                      this.field_z.a(this.field_C, param0, this.field_l, this.field_R, false);
                      this.field_z.a(this.field_p, this.field_t, this.field_U, this.field_V, this.field_w, this.field_d, this.field_r, this.field_J, 0);
                      this.field_z.d(0);
                      this.a(this.field_n, -83);
                      if (this.field_f) {
                        break L5;
                      } else {
                        if (null == this.field_s[this.field_h]) {
                          break L5;
                        } else {
                          try {
                            L6: {
                              this.field_s[this.field_h].b((byte) -91);
                              break L6;
                            }
                          } catch (java.lang.Exception decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            L7: {
                              var2 = (Exception) (Object) decompiledCaughtException;
                              jq.a(-29901, (Throwable) ((Object) var2), "AI has errored in single player game");
                              break L7;
                            }
                          }
                          this.a(this.field_n, -84);
                          this.d((byte) -81);
                          decompiledRegionSelector0 = 0;
                          break L0;
                        }
                      }
                    }
                    L8: {
                      if (!sm.field_e) {
                        break L8;
                      } else {
                        if (!this.field_j) {
                          if (!this.field_b) {
                            break L8;
                          } else {
                            this.field_s[this.field_h].a((byte) -63);
                            this.field_s[this.field_h].b((byte) -15);
                            this.a(this.field_n, -70);
                            var2_array = this.field_P.field_g.field_e;
                            var3_int = 0;
                            L9: while (true) {
                              if ((var3_int ^ -1) <= (var2_array.length ^ -1)) {
                                var2_ref2 = (mg) ((Object) this.field_P.field_p.a(true));
                                L10: while (true) {
                                  if (var2_ref2 == null) {
                                    var3 = (qa) ((Object) this.field_P.field_q.d(0));
                                    L11: while (true) {
                                      if (var3 == null) {
                                        var4_ref = (qm) ((Object) this.field_P.field_i.d(0));
                                        L12: while (true) {
                                          if (null == var4_ref) {
                                            this.e(0);
                                            break L8;
                                          } else {
                                            this.field_ab.a(var4_ref, 32);
                                            var4_ref = (qm) ((Object) this.field_P.field_i.a((byte) -71));
                                            continue L12;
                                          }
                                        }
                                      } else {
                                        this.field_o.a(var3, 32);
                                        var3 = (qa) ((Object) this.field_P.field_q.a((byte) -71));
                                        continue L11;
                                      }
                                    }
                                  } else {
                                    this.field_v.a((byte) 9, var2_ref2);
                                    var2_ref2 = (mg) ((Object) this.field_P.field_p.a((byte) -68));
                                    continue L10;
                                  }
                                }
                              } else {
                                var4 = var2_array[var3_int];
                                fl.a(var4, (byte) 73);
                                kr.a((byte) 65, var4);
                                var3_int++;
                                continue L9;
                              }
                            }
                          }
                        } else {
                          break L8;
                        }
                      }
                    }
                    this.field_z.a(false);
                    this.field_Y.n(106);
                    this.field_Y.a(-73, 0);
                    this.field_N = 0;
                    var2_int = 0;
                    L13: while (true) {
                      if (var2_int >= this.field_P.field_r) {
                        L14: {
                          L15: {
                            if (this.field_P.field_z) {
                              break L15;
                            } else {
                              if (this.field_n == null) {
                                break L14;
                              } else {
                                if ((1 << this.field_h & this.field_P.field_w ^ -1) == -1) {
                                  break L14;
                                } else {
                                  break L15;
                                }
                              }
                            }
                          }
                          stackOut_76_0 = 0;
                          stackOut_76_1 = -1;
                          stackIn_78_0 = stackOut_76_0;
                          stackIn_78_1 = stackOut_76_1;
                          L16: {
                            L17: {
                              L18: {
                                ta.a(stackIn_78_0, stackIn_78_1, (byte) 96, false);
                                this.field_b = false;
                                this.field_Y.o(-4956);
                                if (this.field_n == null) {
                                  break L18;
                                } else {
                                  if ((1 << this.field_h & this.field_P.field_w) != 0) {
                                    break L17;
                                  } else {
                                    break L18;
                                  }
                                }
                              }
                              if (this.field_P.field_x.a((byte) -123, this.field_n)) {
                                break L17;
                              } else {
                                if (this.field_P.field_z) {
                                  jo.a(32767, hj.field_n, false, 10);
                                  break L16;
                                } else {
                                  break L16;
                                }
                              }
                            }
                            jo.a(32767, wh.field_b, false, 10);
                            break L16;
                          }
                          if (!sm.field_e) {
                            break L14;
                          } else {
                            if ((this.field_P.field_e & 1 << this.field_h) != 0) {
                              break L14;
                            } else {
                              this.b(-118);
                              break L14;
                            }
                          }
                        }
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        L19: {
                          if ((1 << var2_int & this.field_P.field_w ^ -1) != -1) {
                            break L19;
                          } else {
                            this.field_N = this.field_N + 1;
                            break L19;
                          }
                        }
                        var2_int++;
                        continue L13;
                      }
                    }
                  } else {
                    var4 = var2_array[var3_int];
                    var5 = var4.field_p;
                    this.field_R[var5] = var4.field_y;
                    this.field_C[var5] = var4.field_x;
                    this.field_l[var5] = var4.field_R;
                    var3_int++;
                    continue L4;
                  }
                }
              } else {
                L20: {
                  var4 = var2_array[var3_int];
                  var4.field_J = var4.field_x;
                  if (var4.field_y != this.field_n) {
                    this.field_w[var4.field_p] = false;
                    this.field_V[var4.field_p] = false;
                    this.field_p[var4.field_p] = 0;
                    this.field_J[var4.field_p] = 0;
                    break L20;
                  } else {
                    this.field_p[var4.field_p] = var4.field_x;
                    this.field_J[var4.field_p] = var4.field_x;
                    break L20;
                  }
                }
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2_ref), "km.J(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        fs[] var3_ref_fs__ = null;
        int var3 = 0;
        String var3_ref_String = null;
        int var4 = 0;
        fs var5 = null;
        int var6 = 0;
        Object stackIn_2_0 = null;
        tr stackIn_2_1 = null;
        tr stackIn_2_2 = null;
        l stackIn_2_3 = null;
        fs[] stackIn_2_4 = null;
        fs stackIn_2_5 = null;
        boolean stackIn_2_6 = false;
        Object stackIn_3_0 = null;
        tr stackIn_3_1 = null;
        tr stackIn_3_2 = null;
        l stackIn_3_3 = null;
        fs[] stackIn_3_4 = null;
        fs stackIn_3_5 = null;
        boolean stackIn_3_6 = false;
        Object stackIn_5_0 = null;
        tr stackIn_5_1 = null;
        tr stackIn_5_2 = null;
        l stackIn_5_3 = null;
        fs[] stackIn_5_4 = null;
        fs stackIn_5_5 = null;
        boolean stackIn_5_6 = false;
        Object stackIn_6_0 = null;
        tr stackIn_6_1 = null;
        tr stackIn_6_2 = null;
        l stackIn_6_3 = null;
        fs[] stackIn_6_4 = null;
        fs stackIn_6_5 = null;
        boolean stackIn_6_6 = false;
        Object stackIn_7_0 = null;
        tr stackIn_7_1 = null;
        tr stackIn_7_2 = null;
        l stackIn_7_3 = null;
        fs[] stackIn_7_4 = null;
        fs stackIn_7_5 = null;
        boolean stackIn_7_6 = false;
        int stackIn_7_7 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        tr stackOut_1_1 = null;
        tr stackOut_1_2 = null;
        l stackOut_1_3 = null;
        fs[] stackOut_1_4 = null;
        fs stackOut_1_5 = null;
        boolean stackOut_1_6 = false;
        Object stackOut_2_0 = null;
        tr stackOut_2_1 = null;
        tr stackOut_2_2 = null;
        l stackOut_2_3 = null;
        fs[] stackOut_2_4 = null;
        fs stackOut_2_5 = null;
        boolean stackOut_2_6 = false;
        Object stackOut_3_0 = null;
        tr stackOut_3_1 = null;
        tr stackOut_3_2 = null;
        l stackOut_3_3 = null;
        fs[] stackOut_3_4 = null;
        fs stackOut_3_5 = null;
        boolean stackOut_3_6 = false;
        Object stackOut_5_0 = null;
        tr stackOut_5_1 = null;
        tr stackOut_5_2 = null;
        l stackOut_5_3 = null;
        fs[] stackOut_5_4 = null;
        fs stackOut_5_5 = null;
        boolean stackOut_5_6 = false;
        int stackOut_5_7 = 0;
        Object stackOut_6_0 = null;
        tr stackOut_6_1 = null;
        tr stackOut_6_2 = null;
        l stackOut_6_3 = null;
        fs[] stackOut_6_4 = null;
        fs stackOut_6_5 = null;
        boolean stackOut_6_6 = false;
        int stackOut_6_7 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                stackOut_1_0 = this;
                stackOut_1_1 = null;
                stackOut_1_2 = null;
                stackOut_1_3 = this.field_P.field_g;
                stackOut_1_4 = this.field_P.field_v;
                stackOut_1_5 = this.field_n;
                stackOut_1_6 = this.field_W;
                stackIn_6_0 = stackOut_1_0;
                stackIn_6_1 = stackOut_1_1;
                stackIn_6_2 = stackOut_1_2;
                stackIn_6_3 = stackOut_1_3;
                stackIn_6_4 = stackOut_1_4;
                stackIn_6_5 = stackOut_1_5;
                stackIn_6_6 = stackOut_1_6;
                stackIn_2_0 = stackOut_1_0;
                stackIn_2_1 = stackOut_1_1;
                stackIn_2_2 = stackOut_1_2;
                stackIn_2_3 = stackOut_1_3;
                stackIn_2_4 = stackOut_1_4;
                stackIn_2_5 = stackOut_1_5;
                stackIn_2_6 = stackOut_1_6;
                if (this.field_P.field_o.field_k) {
                  break L2;
                } else {
                  stackOut_2_0 = this;
                  stackOut_2_1 = null;
                  stackOut_2_2 = null;
                  stackOut_2_3 = (l) ((Object) stackIn_2_3);
                  stackOut_2_4 = (fs[]) ((Object) stackIn_2_4);
                  stackOut_2_5 = (fs) ((Object) stackIn_2_5);
                  stackOut_2_6 = stackIn_2_6;
                  stackIn_6_0 = stackOut_2_0;
                  stackIn_6_1 = stackOut_2_1;
                  stackIn_6_2 = stackOut_2_2;
                  stackIn_6_3 = stackOut_2_3;
                  stackIn_6_4 = stackOut_2_4;
                  stackIn_6_5 = stackOut_2_5;
                  stackIn_6_6 = stackOut_2_6;
                  stackIn_3_0 = stackOut_2_0;
                  stackIn_3_1 = stackOut_2_1;
                  stackIn_3_2 = stackOut_2_2;
                  stackIn_3_3 = stackOut_2_3;
                  stackIn_3_4 = stackOut_2_4;
                  stackIn_3_5 = stackOut_2_5;
                  stackIn_3_6 = stackOut_2_6;
                  if (this.field_P.field_o.field_l) {
                    break L2;
                  } else {
                    stackOut_3_0 = this;
                    stackOut_3_1 = null;
                    stackOut_3_2 = null;
                    stackOut_3_3 = (l) ((Object) stackIn_3_3);
                    stackOut_3_4 = (fs[]) ((Object) stackIn_3_4);
                    stackOut_3_5 = (fs) ((Object) stackIn_3_5);
                    stackOut_3_6 = stackIn_3_6;
                    stackIn_5_0 = stackOut_3_0;
                    stackIn_5_1 = stackOut_3_1;
                    stackIn_5_2 = stackOut_3_2;
                    stackIn_5_3 = stackOut_3_3;
                    stackIn_5_4 = stackOut_3_4;
                    stackIn_5_5 = stackOut_3_5;
                    stackIn_5_6 = stackOut_3_6;
                    stackOut_5_0 = this;
                    stackOut_5_1 = null;
                    stackOut_5_2 = null;
                    stackOut_5_3 = (l) ((Object) stackIn_5_3);
                    stackOut_5_4 = (fs[]) ((Object) stackIn_5_4);
                    stackOut_5_5 = (fs) ((Object) stackIn_5_5);
                    stackOut_5_6 = stackIn_5_6;
                    stackOut_5_7 = 1;
                    stackIn_7_0 = stackOut_5_0;
                    stackIn_7_1 = stackOut_5_1;
                    stackIn_7_2 = stackOut_5_2;
                    stackIn_7_3 = stackOut_5_3;
                    stackIn_7_4 = stackOut_5_4;
                    stackIn_7_5 = stackOut_5_5;
                    stackIn_7_6 = stackOut_5_6;
                    stackIn_7_7 = stackOut_5_7;
                    break L1;
                  }
                }
              }
              stackOut_6_0 = this;
              stackOut_6_1 = null;
              stackOut_6_2 = null;
              stackOut_6_3 = (l) ((Object) stackIn_6_3);
              stackOut_6_4 = (fs[]) ((Object) stackIn_6_4);
              stackOut_6_5 = (fs) ((Object) stackIn_6_5);
              stackOut_6_6 = stackIn_6_6;
              stackOut_6_7 = 0;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              stackIn_7_3 = stackOut_6_3;
              stackIn_7_4 = stackOut_6_4;
              stackIn_7_5 = stackOut_6_5;
              stackIn_7_6 = stackOut_6_6;
              stackIn_7_7 = stackOut_6_7;
              break L1;
            }
            L3: {
              ((km) (this)).field_z = new tr(stackIn_7_3, stackIn_7_4, stackIn_7_5, stackIn_7_6, stackIn_7_7 != 0);
              this.field_z.field_C = true;
              if (this.field_Y == null) {
                this.field_Y = new kq((km) (this));
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              this.field_z.a(this.field_Y, param0 + 205);
              if (this.field_f) {
                break L4;
              } else {
                if (!this.field_W) {
                  var2_int = 0;
                  L5: while (true) {
                    if (var2_int >= this.field_P.field_r) {
                      break L4;
                    } else {
                      L6: {
                        if (null == this.field_s[var2_int]) {
                          break L6;
                        } else {
                          this.field_s[var2_int].a(param0 + 7);
                          if (se.field_g) {
                            var3_ref_String = "My personality is " + wk.field_a[this.field_s[var2_int].a(false)];
                            this.a(this.field_P.field_v[var2_int], var3_ref_String, (byte) 51);
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var2_int++;
                      continue L5;
                    }
                  }
                } else {
                  break L4;
                }
              }
            }
            L7: {
              var2_int = this.field_P.field_g.field_e.length;
              this.field_J = new int[var2_int];
              this.field_w = new boolean[var2_int];
              this.field_r = new int[var2_int];
              this.field_p = new int[var2_int];
              this.field_d = new int[var2_int];
              this.field_V = new boolean[var2_int];
              this.field_t = new int[var2_int];
              this.field_U = new int[var2_int];
              this.field_P.b(-99);
              this.field_z.a(this.field_p, this.field_t, this.field_U, this.field_V, this.field_w, this.field_d, this.field_r, this.field_J, 0);
              if (this.field_h >= 0) {
                break L7;
              } else {
                sm.field_e = false;
                break L7;
              }
            }
            if (param0 == -81) {
              L8: {
                if (sm.field_e) {
                  this.field_s[this.field_h] = (uj) ((Object) new hi(this.field_n, this.field_P, (mn) (this)));
                  break L8;
                } else {
                  break L8;
                }
              }
              var3_ref_fs__ = this.field_P.field_v;
              var4 = 0;
              L9: while (true) {
                if (var4 >= var3_ref_fs__.length) {
                  this.field_z.b(false);
                  this.a(true);
                  var3 = 0;
                  L10: while (true) {
                    if ((this.field_P.field_r ^ -1) >= (var3 ^ -1)) {
                      L11: {
                        L12: {
                          this.a(param0 + 83);
                          if (null == this.field_n) {
                            break L12;
                          } else {
                            if (this.field_n.field_i.g(param0 ^ 27)) {
                              break L12;
                            } else {
                              if (!sm.field_e) {
                                this.field_z.a((sd) ((Object) this.field_n.field_i.d(0)), param0 ^ -82);
                                break L11;
                              } else {
                                break L12;
                              }
                            }
                          }
                        }
                        this.field_z.field_I = this.field_z.field_F;
                        break L11;
                      }
                      this.field_z.a(false);
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      L13: {
                        if (null != this.field_s[var3]) {
                          this.field_s[var3].a((byte) -63);
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      var3++;
                      continue L10;
                    }
                  }
                } else {
                  L14: {
                    var5 = var3_ref_fs__[var4];
                    if (!var5.field_i.g(-124)) {
                      break L14;
                    } else {
                      this.field_P.field_w = this.field_P.field_w | 1 << var5.field_x;
                      break L14;
                    }
                  }
                  var4++;
                  continue L9;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "km.T(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void i(int param0) {
        RuntimeException runtimeException = null;
        sl var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = js.field_f;
              var2.h(60, 255);
              var2.field_j = var2.field_j + 2;
              var3 = var2.field_j;
              var2.c(this.field_P.field_O, (byte) -73);
              if (param0 < -114) {
                break L1;
              } else {
                this.field_Q = (k) null;
                break L1;
              }
            }
            L2: {
              se.a(fp.a(this.field_P.field_q, -71), -256, fp.a(this.field_P.field_i, -88), eh.a(25, this.field_P.field_p), var2);
              this.field_ab.b((byte) 108);
              this.field_o.b((byte) 127);
              this.field_v.a((byte) 112);
              var2.f(-549342136, -var3 + var2.field_j);
              this.field_k = -1;
              this.field_g = -1;
              if (!this.field_L) {
                break L2;
              } else {
                var2.h(61, 255);
                var2.c(this.field_P.field_O, (byte) -74);
                var2.e(11135, this.f(-78));
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) ((Object) runtimeException), "km.CA(" + param0 + ')');
        }
    }

    private final void a(ln param0, int param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        qa var5 = null;
        ln var6 = null;
        sd var6_ref = null;
        ln var7 = null;
        int var8 = 0;
        int stackIn_12_0 = 0;
        boolean stackIn_55_0 = false;
        ln stackIn_62_0 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        ln stackOut_60_0 = null;
        boolean stackOut_53_0 = false;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 1;
              var4 = this.a((byte) 82);
              if (param1 != (var4 ^ -1)) {
                if (-87 == (var4 ^ -1)) {
                  L2: {
                    if (5 >= this.field_c.field_x) {
                      stackOut_11_0 = this.field_c.field_x;
                      stackIn_12_0 = stackOut_11_0;
                      break L2;
                    } else {
                      stackOut_9_0 = 5;
                      stackIn_12_0 = stackOut_9_0;
                      break L2;
                    }
                  }
                  var3_int = stackIn_12_0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                var3_int = this.field_c.field_x;
                break L1;
              }
            }
            param0.field_J = param0.field_J + var3_int;
            this.field_C[param0.field_p] = this.field_C[param0.field_p] + var3_int;
            this.field_p[param0.field_p] = this.field_p[param0.field_p] + var3_int;
            this.field_J[param0.field_p] = this.field_J[param0.field_p] + var3_int;
            var5 = (qa) ((Object) this.field_P.field_q.d(0));
            L3: while (true) {
              L4: {
                if (null == var5) {
                  break L4;
                } else {
                  if (param0 == var5.field_u) {
                    break L4;
                  } else {
                    var5 = (qa) ((Object) this.field_P.field_q.a((byte) -71));
                    continue L3;
                  }
                }
              }
              L5: {
                if (null == var5) {
                  var5 = new qa(param0, 0);
                  this.field_P.field_q.a((byte) -113, var5);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                var5.field_v = var5.field_v + var3_int;
                if (this.field_f) {
                  this.field_o.a(var5, 32);
                  this.e(0);
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                this.field_c.field_x = this.field_c.field_x - var3_int;
                this.field_Y.e((byte) 43);
                if ((this.field_c.field_x ^ -1) < -1) {
                  this.field_Y.a(-73, 2);
                  stackOut_60_0 = this.field_c.j(18229);
                  stackIn_62_0 = stackOut_60_0;
                  var6 = stackIn_62_0;
                  L8: while (true) {
                    if (null == var6) {
                      break L7;
                    } else {
                      this.field_z.field_z[var6.field_p] = 2;
                      var6 = this.field_c.h(-23410);
                      continue L8;
                    }
                  }
                } else {
                  L9: {
                    if (null == this.field_n) {
                      break L9;
                    } else {
                      if (!this.field_P.field_o.field_i) {
                        var6_ref = (sd) ((Object) this.field_n.field_i.d(param1 + 83));
                        L10: while (true) {
                          L11: {
                            if (var6_ref == null) {
                              break L11;
                            } else {
                              if (-1 == (var6_ref.field_x ^ -1)) {
                                var6_ref = (sd) ((Object) this.field_n.field_i.a((byte) -71));
                                continue L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                          L12: {
                            if (null == var6_ref) {
                              stackOut_53_0 = this.field_W;
                              stackIn_55_0 = stackOut_53_0;
                              L13: {
                                if (stackIn_55_0) {
                                  fl.a(0, "buildships");
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              this.field_Y.a(-86, 0);
                              break L12;
                            } else {
                              this.field_c = var6_ref;
                              this.field_Y.a(-102, 2);
                              var7 = var6_ref.j(18229);
                              L14: while (true) {
                                if (null == var7) {
                                  break L12;
                                } else {
                                  this.field_z.field_z[var7.field_p] = 2;
                                  var7 = var6_ref.h(param1 + -23327);
                                  continue L14;
                                }
                              }
                            }
                          }
                          break L7;
                        }
                      } else {
                        break L9;
                      }
                    }
                  }
                  this.field_Y.a(param1 + -4, 0);
                  break L7;
                }
              }
              this.a(this.field_n, param1 ^ 2);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var3 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) (var3);
            stackOut_69_1 = new StringBuilder().append("km.S(");
            stackIn_72_0 = stackOut_69_0;
            stackIn_72_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param0 == null) {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L15;
            } else {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "{...}";
              stackIn_73_0 = stackOut_70_0;
              stackIn_73_1 = stackOut_70_1;
              stackIn_73_2 = stackOut_70_2;
              break L15;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ',' + param1 + ')');
        }
    }

    private final int[] c(byte param0) {
        RuntimeException var2 = null;
        int[] var2_array = null;
        ln[] var3 = null;
        fs[] var3_array = null;
        int var4 = 0;
        ln var5 = null;
        fs var5_ref = null;
        int var6 = 0;
        sd var7 = null;
        int var8 = 0;
        int[] stackIn_34_0 = null;
        RuntimeException decompiledCaughtException = null;
        int[] stackOut_33_0 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_array = new int[this.field_P.field_r];
            var3 = this.field_P.field_g.field_e;
            var4 = 0;
            L1: while (true) {
              if ((var4 ^ -1) <= (var3.length ^ -1)) {
                L2: {
                  if (param0 == 44) {
                    break L2;
                  } else {
                    this.a((fs) null, (String) null, (byte) -53);
                    break L2;
                  }
                }
                var3_array = this.field_P.field_v;
                var4 = 0;
                L3: while (true) {
                  if ((var3_array.length ^ -1) >= (var4 ^ -1)) {
                    stackOut_33_0 = (int[]) (var2_array);
                    stackIn_34_0 = stackOut_33_0;
                    break L0;
                  } else {
                    L4: {
                      var5_ref = var3_array[var4];
                      var6 = var5_ref.field_x;
                      if (this.field_P.field_o.field_i) {
                        if (null != var5_ref.field_m) {
                          if (var5_ref.field_m.field_r > 0) {
                            var2_array[var6] = var2_array[var6] + var5_ref.field_m.field_r;
                            break L4;
                          } else {
                            break L4;
                          }
                        } else {
                          break L4;
                        }
                      } else {
                        var7 = (sd) ((Object) var5_ref.field_i.d(param0 ^ 44));
                        L5: while (true) {
                          if (var7 == null) {
                            break L4;
                          } else {
                            L6: {
                              if (0 < var7.field_r) {
                                var2_array[var6] = var2_array[var6] + var7.field_r;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            var7 = (sd) ((Object) var5_ref.field_i.a((byte) -71));
                            continue L5;
                          }
                        }
                      }
                    }
                    var4++;
                    continue L3;
                  }
                }
              } else {
                L7: {
                  var5 = var3[var4];
                  if (null != var5.field_y) {
                    var2_array[var5.field_y.field_x] = var2_array[var5.field_y.field_x] + var5.field_x;
                    break L7;
                  } else {
                    break L7;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "km.UA(" + param0 + ')');
        }
        return stackIn_34_0;
    }

    final void a(fs param0, byte param1) {
        RuntimeException var3 = null;
        sl var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (0 == ((1 << param0.field_x | 1 << this.field_h) & this.field_P.field_w)) {
              L1: {
                if (param1 > 44) {
                  break L1;
                } else {
                  this.a((ob) null, -6, 94);
                  break L1;
                }
              }
              if (param0 == this.field_n) {
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if ((1 << param0.field_x & this.field_n.field_w ^ -1) != -1) {
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  L2: {
                    this.field_n.field_w = this.field_n.field_w | 1 << param0.field_x;
                    param0.field_A = param0.field_A | 1 << this.field_n.field_x;
                    if (!this.field_f) {
                      if ((1 << param0.field_x & this.field_n.field_A) != 0) {
                        this.field_n.field_f[param0.field_x] = 3;
                        this.field_n.field_h[param0.field_x] = true;
                        param0.field_f[this.field_n.field_x] = 3;
                        param0.field_h[this.field_n.field_x] = true;
                        this.field_n.field_A = this.field_n.field_A & (1 << param0.field_x ^ -1);
                        this.field_n.field_w = this.field_n.field_w & (1 << param0.field_x ^ -1);
                        param0.field_A = param0.field_A & (1 << this.field_n.field_x ^ -1);
                        param0.field_w = param0.field_w & (1 << this.field_n.field_x ^ -1);
                        this.a(param0, -27584, this.field_n);
                        if (this.field_W) {
                          fl.a(0, "signtreaty");
                          break L2;
                        } else {
                          break L2;
                        }
                      } else {
                        this.a(this.field_n, param0, true);
                        break L2;
                      }
                    } else {
                      L3: {
                        var3_ref = js.field_f;
                        var3_ref.h(59, 255);
                        var3_ref.field_j = var3_ref.field_j + 2;
                        var4 = var3_ref.field_j;
                        var3_ref.c(this.field_P.field_O, (byte) -106);
                        var3_ref.c(255, (byte) -78);
                        var3_ref.c(this.field_n.field_x, (byte) -126);
                        var3_ref.c(param0.field_x, (byte) -104);
                        var3_ref.f(-549342136, -var4 + var3_ref.field_j);
                        if ((this.field_n.field_A & 1 << param0.field_x) != 0) {
                          break L3;
                        } else {
                          this.a(this.field_n, param0, true);
                          break L3;
                        }
                      }
                      break L2;
                    }
                  }
                  decompiledRegionSelector0 = 3;
                  break L0;
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) (var3);
            stackOut_31_1 = new StringBuilder().append("km.EA(");
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackOut_34_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L4;
            } else {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L4;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              return;
            }
          }
        }
    }

    km(boolean param0, boolean param1, int param2, vr param3, int param4, String[] param5, int param6, boolean param7, kq param8) {
        RuntimeException var10 = null;
        int var10_int = 0;
        fs[] var10_array = null;
        int var11 = 0;
        fs var12 = null;
        int var13 = 0;
        fs stackIn_18_0 = null;
        fs stackIn_20_0 = null;
        fs stackIn_21_0 = null;
        String stackIn_21_1 = null;
        Object stackIn_37_0 = null;
        Object stackIn_39_0 = null;
        Object stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_83_2 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        String stackIn_87_2 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        String stackIn_91_2 = null;
        RuntimeException decompiledCaughtException = null;
        fs stackOut_17_0 = null;
        fs stackOut_20_0 = null;
        String stackOut_20_1 = null;
        fs stackOut_18_0 = null;
        String stackOut_18_1 = null;
        Object stackOut_36_0 = null;
        Object stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        Object stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        String stackOut_86_2 = null;
        RuntimeException stackOut_84_0 = null;
        StringBuilder stackOut_84_1 = null;
        String stackOut_84_2 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        RuntimeException stackOut_90_0 = null;
        StringBuilder stackOut_90_1 = null;
        String stackOut_90_2 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        this.field_F = 25;
        this.field_T = false;
        this.field_I = this.field_F;
        this.field_y = false;
        try {
          L0: {
            L1: {
              this.field_f = param0;
              this.field_h = param6;
              this.field_W = param1;
              this.field_M = param7;
              if (this.field_f) {
                this.field_P = uq.a(param4, param2, -27579, param5, param3);
                break L1;
              } else {
                if (!this.field_W) {
                  this.field_P = qr.a(param2, 50, param5, param3, param4, 2);
                  break L1;
                } else {
                  this.field_P = jg.a(param3, param5, param2, -22379, 4);
                  ob.a(-126, (km) (this));
                  break L1;
                }
              }
            }
            L2: {
              if (this.field_f) {
                var10_int = 0;
                L3: while (true) {
                  if (var10_int >= this.field_P.field_r) {
                    break L2;
                  } else {
                    L4: {
                      if (!param5[var10_int].equals("bot_sp")) {
                        break L4;
                      } else {
                        this.field_P.field_v[var10_int].field_t = hn.field_f[var10_int];
                        break L4;
                      }
                    }
                    var10_int++;
                    continue L3;
                  }
                }
              } else {
                var10_int = 1;
                L5: while (true) {
                  if (this.field_P.field_r <= var10_int) {
                    L6: {
                      stackOut_17_0 = this.field_P.field_v[0];
                      stackIn_20_0 = stackOut_17_0;
                      stackIn_18_0 = stackOut_17_0;
                      if (w.d(true)) {
                        stackOut_20_0 = (fs) ((Object) stackIn_20_0);
                        stackOut_20_1 = hn.field_f[0];
                        stackIn_21_0 = stackOut_20_0;
                        stackIn_21_1 = stackOut_20_1;
                        break L6;
                      } else {
                        stackOut_18_0 = (fs) ((Object) stackIn_18_0);
                        stackOut_18_1 = ln.field_o;
                        stackIn_21_0 = stackOut_18_0;
                        stackIn_21_1 = stackOut_18_1;
                        break L6;
                      }
                    }
                    stackIn_21_0.field_t = stackIn_21_1;
                    break L2;
                  } else {
                    this.field_P.field_v[var10_int].field_t = hn.field_f[var10_int];
                    var10_int++;
                    continue L5;
                  }
                }
              }
            }
            L7: {
              if (-1 >= (this.field_h ^ -1)) {
                this.field_n = this.field_P.field_v[this.field_h];
                break L7;
              } else {
                this.field_n = null;
                break L7;
              }
            }
            L8: {
              stackOut_36_0 = this;
              stackIn_39_0 = stackOut_36_0;
              stackIn_37_0 = stackOut_36_0;
              if (this.field_n == null) {
                stackOut_39_0 = this;
                stackOut_39_1 = 0;
                stackIn_40_0 = stackOut_39_0;
                stackIn_40_1 = stackOut_39_1;
                break L8;
              } else {
                stackOut_37_0 = this;
                stackOut_37_1 = 1;
                stackIn_40_0 = stackOut_37_0;
                stackIn_40_1 = stackOut_37_1;
                break L8;
              }
            }
            ((km) (this)).field_b = stackIn_40_1 != 0;
            this.field_s = (uj[]) ((Object) new hi[this.field_P.field_v.length]);
            var10_array = this.field_P.field_v;
            var11 = 0;
            L9: while (true) {
              if ((var10_array.length ^ -1) >= (var11 ^ -1)) {
                L10: {
                  if (this.field_W) {
                    var10_int = 1;
                    L11: while (true) {
                      if ((this.field_P.field_r ^ -1) >= (var10_int ^ -1)) {
                        break L10;
                      } else {
                        this.field_s[var10_int] = og.a(2, (mn) (this), this.field_P.field_v[var10_int], this.field_P, -114);
                        this.field_s[var10_int].a(false, -6861);
                        var10_int++;
                        continue L11;
                      }
                    }
                  } else {
                    if (!this.field_f) {
                      var10_int = 0;
                      L12: while (true) {
                        if (var10_int >= this.field_P.field_r) {
                          break L10;
                        } else {
                          L13: {
                            if ((this.field_h ^ -1) != (var10_int ^ -1)) {
                              this.field_s[var10_int] = (uj) ((Object) new hi(this.field_P.field_v[var10_int], this.field_P, (mn) (this)));
                              this.field_s[var10_int].a(true, -6861);
                              break L13;
                            } else {
                              break L13;
                            }
                          }
                          var10_int++;
                          continue L12;
                        }
                      }
                    } else {
                      break L10;
                    }
                  }
                }
                L14: {
                  if (param8 == null) {
                    break L14;
                  } else {
                    param8.a((byte) -33, (km) (this));
                    this.field_Y = param8;
                    break L14;
                  }
                }
                L15: {
                  this.field_H = new pf();
                  if (!this.field_f) {
                    this.b((byte) -81);
                    this.field_z.field_p = null;
                    this.field_P.d(-9778, 0);
                    this.field_S = mb.field_o[this.field_P.field_J];
                    break L15;
                  } else {
                    this.field_ab = new db();
                    this.field_o = new db();
                    this.field_v = new wb();
                    this.field_k = -1;
                    this.field_g = -1;
                    this.field_P.d(-9778, -1);
                    break L15;
                  }
                }
                this.field_G = false;
                this.field_L = false;
                break L0;
              } else {
                var12 = var10_array[var11];
                var12.field_q = new um(20);
                var11++;
                continue L9;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L16: {
            var10 = decompiledCaughtException;
            stackOut_79_0 = (RuntimeException) (var10);
            stackOut_79_1 = new StringBuilder().append("km.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_82_0 = stackOut_79_0;
            stackIn_82_1 = stackOut_79_1;
            stackIn_80_0 = stackOut_79_0;
            stackIn_80_1 = stackOut_79_1;
            if (param3 == null) {
              stackOut_82_0 = (RuntimeException) ((Object) stackIn_82_0);
              stackOut_82_1 = (StringBuilder) ((Object) stackIn_82_1);
              stackOut_82_2 = "null";
              stackIn_83_0 = stackOut_82_0;
              stackIn_83_1 = stackOut_82_1;
              stackIn_83_2 = stackOut_82_2;
              break L16;
            } else {
              stackOut_80_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackOut_80_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackOut_80_2 = "{...}";
              stackIn_83_0 = stackOut_80_0;
              stackIn_83_1 = stackOut_80_1;
              stackIn_83_2 = stackOut_80_2;
              break L16;
            }
          }
          L17: {
            stackOut_83_0 = (RuntimeException) ((Object) stackIn_83_0);
            stackOut_83_1 = ((StringBuilder) (Object) stackIn_83_1).append(stackIn_83_2).append(',').append(param4).append(',');
            stackIn_86_0 = stackOut_83_0;
            stackIn_86_1 = stackOut_83_1;
            stackIn_84_0 = stackOut_83_0;
            stackIn_84_1 = stackOut_83_1;
            if (param5 == null) {
              stackOut_86_0 = (RuntimeException) ((Object) stackIn_86_0);
              stackOut_86_1 = (StringBuilder) ((Object) stackIn_86_1);
              stackOut_86_2 = "null";
              stackIn_87_0 = stackOut_86_0;
              stackIn_87_1 = stackOut_86_1;
              stackIn_87_2 = stackOut_86_2;
              break L17;
            } else {
              stackOut_84_0 = (RuntimeException) ((Object) stackIn_84_0);
              stackOut_84_1 = (StringBuilder) ((Object) stackIn_84_1);
              stackOut_84_2 = "{...}";
              stackIn_87_0 = stackOut_84_0;
              stackIn_87_1 = stackOut_84_1;
              stackIn_87_2 = stackOut_84_2;
              break L17;
            }
          }
          L18: {
            stackOut_87_0 = (RuntimeException) ((Object) stackIn_87_0);
            stackOut_87_1 = ((StringBuilder) (Object) stackIn_87_1).append(stackIn_87_2).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_90_0 = stackOut_87_0;
            stackIn_90_1 = stackOut_87_1;
            stackIn_88_0 = stackOut_87_0;
            stackIn_88_1 = stackOut_87_1;
            if (param8 == null) {
              stackOut_90_0 = (RuntimeException) ((Object) stackIn_90_0);
              stackOut_90_1 = (StringBuilder) ((Object) stackIn_90_1);
              stackOut_90_2 = "null";
              stackIn_91_0 = stackOut_90_0;
              stackIn_91_1 = stackOut_90_1;
              stackIn_91_2 = stackOut_90_2;
              break L18;
            } else {
              stackOut_88_0 = (RuntimeException) ((Object) stackIn_88_0);
              stackOut_88_1 = (StringBuilder) ((Object) stackIn_88_1);
              stackOut_88_2 = "{...}";
              stackIn_91_0 = stackOut_88_0;
              stackIn_91_1 = stackOut_88_1;
              stackIn_91_2 = stackOut_88_2;
              break L18;
            }
          }
          throw r.a((Throwable) ((Object) stackIn_91_0), stackIn_91_2 + ')');
        }
    }

    static {
        field_a = "Enter multiplayer lobby";
        field_A = "Enter name of friend to add to list";
        field_X = "Connecting to<br>friend server...";
    }
}
