/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

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
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 == 51) {
                break L1;
              } else {
                ((km) this).field_q = -105;
                break L1;
              }
            }
            if (((km) this).field_W) {
              return;
            } else {
              L2: {
                var4_ref = param0.field_t + ": ";
                var5 = ji.field_I.field_K;
                if (((km) this).field_f) {
                  var5 = var5 - ho.field_f.c("[" + re.a(he.field_q, 4371, new String[1]) + "] ");
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (((km) this).field_f) {
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
                L5: {
                  var6 = stackIn_16_0;
                  var7 = -ho.field_f.c(var4_ref) + var5 + -20;
                  if (var7 >= ho.field_f.c(param1)) {
                    break L5;
                  } else {
                    var8 = vi.a(ho.field_f, (byte) 125, param1, new int[1]);
                    var9 = var8;
                    var10 = 0;
                    L6: while (true) {
                      L7: {
                        if (var9.length <= var10) {
                          break L7;
                        } else {
                          var11 = var9[var10];
                          md.a(1, var4_ref + var11, var6, ln.field_o, ((km) this).field_P.field_v[0].field_t, -16169);
                          var10++;
                          if (var12 != 0) {
                            break L4;
                          } else {
                            if (var12 == 0) {
                              continue L6;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      if (var12 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
                md.a(1, var4_ref + param1, var6, ln.field_o, ((km) this).field_P.field_v[0].field_t, -16169);
                break L4;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var4;
            stackOut_27_1 = new StringBuilder().append("km.HA(");
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L8;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L8;
            }
          }
          L9: {
            stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
            stackOut_31_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L9;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L9;
            }
          }
          throw r.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ',' + param2 + ')');
        }
    }

    private final void a(byte param0, fs param1) {
        RuntimeException runtimeException = null;
        sd var3 = null;
        ln var4_ref_ln = null;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3 = (sd) (Object) param1.field_i.d(0);
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  var4_ref_ln = var3.j(18229);
                  L3: while (true) {
                    L4: {
                      L5: {
                        if (var4_ref_ln == null) {
                          break L5;
                        } else {
                          var4_ref_ln.field_R = null;
                          var4_ref_ln.field_y = null;
                          var4_ref_ln.b((byte) -83);
                          var4_ref_ln = var3.h(-23410);
                          if (var5 != 0) {
                            break L4;
                          } else {
                            if (var5 == 0) {
                              continue L3;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      var3.b((byte) -89);
                      var3 = (sd) (Object) param1.field_i.a((byte) -71);
                      break L4;
                    }
                    if (var5 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var4 = 107 % ((param0 - 77) / 37);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("km.MA(").append(param0).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
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
              ((km) this).field_P.a(param2, (byte) -124, param1);
              if (param0 == 1) {
                break L1;
              } else {
                ((km) this).field_r = null;
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
            stackOut_3_1 = new StringBuilder().append("km.OA(").append(param0).append(',');
            stackIn_6_0 = stackOut_3_0;
            stackIn_6_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_7_0 = stackOut_4_0;
              stackIn_7_1 = stackOut_4_1;
              stackIn_7_2 = stackOut_4_2;
              break L2;
            }
          }
          throw r.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, boolean param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!param0) {
              L1: {
                if (((km) this).field_f) {
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
                  if (~de.field_j != ~uc.field_A) {
                    ta.b((byte) -69);
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) (Object) runtimeException, "km.WA(" + param0 + ',' + param1 + ')');
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
        ln stackIn_7_0 = null;
        fs stackIn_9_0 = null;
        fs stackIn_9_1 = null;
        fs stackIn_16_0 = null;
        fs stackIn_16_1 = null;
        fs stackIn_29_0 = null;
        fs stackIn_29_1 = null;
        int stackIn_59_0 = 0;
        int stackIn_61_0 = 0;
        boolean stackIn_64_0 = false;
        ln stackIn_76_0 = null;
        int stackIn_81_0 = 0;
        int stackIn_85_0 = 0;
        int stackIn_89_0 = 0;
        boolean stackIn_91_0 = false;
        boolean stackIn_100_0 = false;
        boolean stackIn_117_0 = false;
        boolean stackIn_124_0 = false;
        RuntimeException stackIn_142_0 = null;
        StringBuilder stackIn_142_1 = null;
        RuntimeException stackIn_144_0 = null;
        StringBuilder stackIn_144_1 = null;
        RuntimeException stackIn_145_0 = null;
        StringBuilder stackIn_145_1 = null;
        String stackIn_145_2 = null;
        RuntimeException decompiledCaughtException = null;
        ln stackOut_6_0 = null;
        ln stackOut_75_0 = null;
        fs stackOut_7_0 = null;
        fs stackOut_7_1 = null;
        fs stackOut_15_0 = null;
        fs stackOut_15_1 = null;
        fs stackOut_28_0 = null;
        fs stackOut_28_1 = null;
        int stackOut_58_0 = 0;
        int stackOut_60_0 = 0;
        boolean stackOut_63_0 = false;
        boolean stackOut_80_0 = false;
        int stackOut_84_0 = 0;
        int stackOut_88_0 = 0;
        boolean stackOut_90_0 = false;
        boolean stackOut_99_0 = false;
        boolean stackOut_116_0 = false;
        boolean stackOut_123_0 = false;
        RuntimeException stackOut_141_0 = null;
        StringBuilder stackOut_141_1 = null;
        RuntimeException stackOut_144_0 = null;
        StringBuilder stackOut_144_1 = null;
        String stackOut_144_2 = null;
        RuntimeException stackOut_142_0 = null;
        StringBuilder stackOut_142_1 = null;
        String stackOut_142_2 = null;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_array = ((km) this).field_P.field_g.field_e;
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
              L3: {
                L4: {
                  L5: {
                    L6: {
                      L7: {
                        L8: {
                          L9: {
                            if (~var4_ref_ln__.length >= ~var5_int) {
                              break L9;
                            } else {
                              var6_ref_ln = var4_ref_ln__[var5_int];
                              ((km) this).field_d[var6_ref_ln.field_p] = 0;
                              ((km) this).field_U[var6_ref_ln.field_p] = 0;
                              stackOut_6_0 = (ln) var6_ref_ln;
                              stackIn_76_0 = stackOut_6_0;
                              stackIn_7_0 = stackOut_6_0;
                              if (var13 != 0) {
                                L10: while (true) {
                                  var6_ref_ln = stackIn_76_0;
                                  ((km) this).field_t[var6_ref_ln.field_p] = 0;
                                  ((km) this).field_r[var6_ref_ln.field_p] = 0;
                                  var5_int++;
                                  if (var13 != 0) {
                                    break L5;
                                  } else {
                                    if (var13 == 0) {
                                      if (var4_ref_ln__.length <= var5_int) {
                                        break L7;
                                      } else {
                                        stackOut_75_0 = var4_ref_ln__[var5_int];
                                        stackIn_76_0 = stackOut_75_0;
                                        continue L10;
                                      }
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                              } else {
                                stackOut_7_0 = stackIn_7_0.field_y;
                                stackOut_7_1 = (fs) param0;
                                stackIn_9_0 = stackOut_7_0;
                                stackIn_9_1 = stackOut_7_1;
                                L11: while (true) {
                                  L12: {
                                    L13: {
                                      if (stackIn_9_0 == stackIn_9_1) {
                                        break L13;
                                      } else {
                                        ((km) this).field_w[var6_ref_ln.field_p] = false;
                                        ((km) this).field_p[var6_ref_ln.field_p] = 0;
                                        ((km) this).field_V[var6_ref_ln.field_p] = false;
                                        ((km) this).field_J[var6_ref_ln.field_p] = 0;
                                        if (var13 == 0) {
                                          break L12;
                                        } else {
                                          break L13;
                                        }
                                      }
                                    }
                                    ((km) this).field_w[var6_ref_ln.field_p] = true;
                                    ((km) this).field_p[var6_ref_ln.field_p] = var6_ref_ln.field_J;
                                    ((km) this).field_V[var6_ref_ln.field_p] = true;
                                    ((km) this).field_J[var6_ref_ln.field_p] = var6_ref_ln.field_J;
                                    break L12;
                                  }
                                  var7 = (mg) (Object) var6_ref_ln.field_s.c(-128);
                                  L14: while (true) {
                                    L15: {
                                      if (null == var7) {
                                        break L15;
                                      } else {
                                        stackOut_15_0 = (fs) param0;
                                        stackOut_15_1 = var7.field_G;
                                        stackIn_9_0 = stackOut_15_0;
                                        stackIn_9_1 = stackOut_15_1;
                                        stackIn_16_0 = stackOut_15_0;
                                        stackIn_16_1 = stackOut_15_1;
                                        if (var13 != 0) {
                                          continue L11;
                                        } else {
                                          L16: {
                                            if (stackIn_16_0 == stackIn_16_1) {
                                              L17: {
                                                ((km) this).field_p[var6_ref_ln.field_p] = ((km) this).field_p[var6_ref_ln.field_p] + var7.field_z;
                                                ((km) this).field_w[var6_ref_ln.field_p] = true;
                                                if (param0 == var7.field_B.field_y) {
                                                  break L17;
                                                } else {
                                                  if (var7.field_B.field_x != 0) {
                                                    break L16;
                                                  } else {
                                                    break L17;
                                                  }
                                                }
                                              }
                                              ((km) this).field_J[var6_ref_ln.field_p] = ((km) this).field_J[var6_ref_ln.field_p] + var7.field_z;
                                              ((km) this).field_V[var6_ref_ln.field_p] = true;
                                              break L16;
                                            } else {
                                              break L16;
                                            }
                                          }
                                          var7 = (mg) (Object) var6_ref_ln.field_s.b(32);
                                          if (var13 == 0) {
                                            continue L14;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                    }
                                    L18: {
                                      if (null == param0) {
                                        break L18;
                                      } else {
                                        var8_ref_ln__ = var6_ref_ln.field_D;
                                        var9 = 0;
                                        L19: while (true) {
                                          if (var9 >= var8_ref_ln__.length) {
                                            break L18;
                                          } else {
                                            var10_ref = var8_ref_ln__[var9];
                                            stackOut_28_0 = (fs) param0;
                                            stackOut_28_1 = var10_ref.field_y;
                                            stackIn_9_0 = stackOut_28_0;
                                            stackIn_9_1 = stackOut_28_1;
                                            stackIn_29_0 = stackOut_28_0;
                                            stackIn_29_1 = stackOut_28_1;
                                            if (var13 != 0) {
                                              continue L11;
                                            } else {
                                              L20: {
                                                if (stackIn_29_0 == stackIn_29_1) {
                                                  break L20;
                                                } else {
                                                  if (null == var10_ref.field_y) {
                                                    break L20;
                                                  } else {
                                                    L21: {
                                                      if (!var10_ref.field_y.field_h[param0.field_x]) {
                                                        break L21;
                                                      } else {
                                                        if (var6_ref_ln.field_y == param0) {
                                                          break L20;
                                                        } else {
                                                          break L21;
                                                        }
                                                      }
                                                    }
                                                    ((km) this).field_V[var6_ref_ln.field_p] = false;
                                                    ((km) this).field_J[var6_ref_ln.field_p] = 0;
                                                    if (var13 == 0) {
                                                      break L18;
                                                    } else {
                                                      break L20;
                                                    }
                                                  }
                                                }
                                              }
                                              var9++;
                                              if (var13 == 0) {
                                                continue L19;
                                              } else {
                                                break L18;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var5_int++;
                                    if (var13 == 0) {
                                      continue L2;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          L22: {
                            if (((km) this).field_P.field_o.field_k) {
                              break L22;
                            } else {
                              L23: {
                                if (!((km) this).field_P.field_o.field_l) {
                                  break L23;
                                } else {
                                  var4_ref_ln__ = var3_array;
                                  var5_int = 0;
                                  L24: while (true) {
                                    L25: {
                                      if (~var4_ref_ln__.length >= ~var5_int) {
                                        break L25;
                                      } else {
                                        var6_ref_ln = var4_ref_ln__[var5_int];
                                        ((km) this).field_t[var6_ref_ln.field_p] = 1;
                                        ((km) this).field_r[var6_ref_ln.field_p] = 1;
                                        var5_int++;
                                        if (var13 != 0) {
                                          break L7;
                                        } else {
                                          if (var13 == 0) {
                                            continue L24;
                                          } else {
                                            break L25;
                                          }
                                        }
                                      }
                                    }
                                    if (var13 == 0) {
                                      break L7;
                                    } else {
                                      break L23;
                                    }
                                  }
                                }
                              }
                              var4_ref_ln__ = var3_array;
                              var5_int = 0;
                              L26: while (true) {
                                stackOut_58_0 = ~var5_int;
                                stackIn_59_0 = stackOut_58_0;
                                L27: while (true) {
                                  L28: {
                                    if (stackIn_59_0 <= ~var4_ref_ln__.length) {
                                      break L28;
                                    } else {
                                      var6_ref_ln = var4_ref_ln__[var5_int];
                                      var7_int = var6_ref_ln.field_p;
                                      var8 = 0;
                                      var9 = 0;
                                      var10 = var6_ref_ln.field_D;
                                      stackOut_60_0 = 0;
                                      stackIn_81_0 = stackOut_60_0;
                                      stackIn_61_0 = stackOut_60_0;
                                      if (var13 != 0) {
                                        break L6;
                                      } else {
                                        var11 = stackIn_61_0;
                                        L29: while (true) {
                                          L30: {
                                            if (~var10.length >= ~var11) {
                                              break L30;
                                            } else {
                                              var12 = var10[var11];
                                              stackOut_63_0 = ((km) this).field_w[var12.field_p];
                                              stackIn_59_0 = stackOut_63_0 ? 1 : 0;
                                              stackIn_64_0 = stackOut_63_0;
                                              if (var13 != 0) {
                                                continue L27;
                                              } else {
                                                L31: {
                                                  if (!stackIn_64_0) {
                                                    var8++;
                                                    break L31;
                                                  } else {
                                                    break L31;
                                                  }
                                                }
                                                L32: {
                                                  if (((km) this).field_V[var12.field_p]) {
                                                    break L32;
                                                  } else {
                                                    var9++;
                                                    break L32;
                                                  }
                                                }
                                                var11++;
                                                if (var13 == 0) {
                                                  continue L29;
                                                } else {
                                                  break L30;
                                                }
                                              }
                                            }
                                          }
                                          ((km) this).field_t[var7_int] = var8;
                                          ((km) this).field_r[var7_int] = var9;
                                          var5_int++;
                                          if (var13 == 0) {
                                            continue L26;
                                          } else {
                                            break L28;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  if (var13 == 0) {
                                    break L7;
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                            }
                          }
                          var4_ref_ln__ = var3_array;
                          var5_int = 0;
                          L33: while (true) {
                            if (var4_ref_ln__.length <= var5_int) {
                              break L7;
                            } else {
                              stackOut_75_0 = var4_ref_ln__[var5_int];
                              stackIn_76_0 = stackOut_75_0;
                              var6_ref_ln = stackIn_76_0;
                              ((km) this).field_t[var6_ref_ln.field_p] = 0;
                              ((km) this).field_r[var6_ref_ln.field_p] = 0;
                              var5_int++;
                              if (var13 != 0) {
                                break L5;
                              } else {
                                if (var13 == 0) {
                                  continue L33;
                                } else {
                                  break L8;
                                }
                              }
                            }
                          }
                        }
                        break L7;
                      }
                      stackOut_80_0 = ((km) this).field_P.field_o.field_k;
                      stackIn_81_0 = stackOut_80_0 ? 1 : 0;
                      break L6;
                    }
                    if (stackIn_81_0 == 0) {
                      break L5;
                    } else {
                      break L4;
                    }
                  }
                  var4 = 1;
                  L34: while (true) {
                    stackOut_84_0 = var4;
                    stackIn_85_0 = stackOut_84_0;
                    L35: while (true) {
                      if (stackIn_85_0 == 0) {
                        break L4;
                      } else {
                        var4 = 0;
                        var5 = var3_array;
                        if (var13 != 0) {
                          break L3;
                        } else {
                          var6 = 0;
                          L36: while (true) {
                            stackOut_88_0 = ~var5.length;
                            stackIn_89_0 = stackOut_88_0;
                            L37: while (true) {
                              L38: {
                                if (stackIn_89_0 >= ~var6) {
                                  break L38;
                                } else {
                                  var7_ref = var5[var6];
                                  var8 = var7_ref.field_p;
                                  stackOut_90_0 = ((km) this).field_w[var8];
                                  stackIn_85_0 = stackOut_90_0 ? 1 : 0;
                                  stackIn_91_0 = stackOut_90_0;
                                  if (var13 != 0) {
                                    continue L35;
                                  } else {
                                    L39: {
                                      L40: {
                                        if (!stackIn_91_0) {
                                          break L40;
                                        } else {
                                          if (((km) this).field_t[var8] > ((km) this).field_p[var8]) {
                                            ((km) this).field_w[var8] = false;
                                            var9 = 1 + ((km) this).field_d[var8];
                                            var4 = 1;
                                            var10 = var7_ref.field_D;
                                            var11 = 0;
                                            L41: while (true) {
                                              if (~var10.length >= ~var11) {
                                                break L40;
                                              } else {
                                                var12 = var10[var11];
                                                stackOut_99_0 = ((km) this).field_P.field_o.field_l;
                                                stackIn_117_0 = stackOut_99_0;
                                                stackIn_100_0 = stackOut_99_0;
                                                if (var13 != 0) {
                                                  break L39;
                                                } else {
                                                  L42: {
                                                    L43: {
                                                      if (stackIn_100_0) {
                                                        break L43;
                                                      } else {
                                                        ((km) this).field_t[var12.field_p] = ((km) this).field_t[var12.field_p] + 1;
                                                        if (var13 == 0) {
                                                          break L42;
                                                        } else {
                                                          break L43;
                                                        }
                                                      }
                                                    }
                                                    ((km) this).field_t[var12.field_p] = 1;
                                                    break L42;
                                                  }
                                                  L44: {
                                                    L45: {
                                                      if (~((km) this).field_d[var12.field_p] < ~var9) {
                                                        break L45;
                                                      } else {
                                                        if (((km) this).field_w[var12.field_p]) {
                                                          break L45;
                                                        } else {
                                                          break L44;
                                                        }
                                                      }
                                                    }
                                                    ((km) this).field_d[var12.field_p] = var9;
                                                    break L44;
                                                  }
                                                  var11++;
                                                  if (var13 == 0) {
                                                    continue L41;
                                                  } else {
                                                    break L40;
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            break L40;
                                          }
                                        }
                                      }
                                      stackOut_116_0 = ((km) this).field_V[var8];
                                      stackIn_117_0 = stackOut_116_0;
                                      break L39;
                                    }
                                    L46: {
                                      if (!stackIn_117_0) {
                                        break L46;
                                      } else {
                                        if (((km) this).field_r[var8] <= ((km) this).field_J[var8]) {
                                          break L46;
                                        } else {
                                          ((km) this).field_V[var8] = false;
                                          ((km) this).field_J[var8] = 0;
                                          var9 = 1 + ((km) this).field_U[var8];
                                          var4 = 1;
                                          var10 = var7_ref.field_D;
                                          var11 = 0;
                                          L47: while (true) {
                                            if (~var11 <= ~var10.length) {
                                              break L46;
                                            } else {
                                              var12 = var10[var11];
                                              stackOut_123_0 = ((km) this).field_P.field_o.field_l;
                                              stackIn_89_0 = stackOut_123_0 ? 1 : 0;
                                              stackIn_124_0 = stackOut_123_0;
                                              if (var13 != 0) {
                                                continue L37;
                                              } else {
                                                L48: {
                                                  L49: {
                                                    if (stackIn_124_0) {
                                                      break L49;
                                                    } else {
                                                      ((km) this).field_r[var12.field_p] = ((km) this).field_r[var12.field_p] + 1;
                                                      if (var13 == 0) {
                                                        break L48;
                                                      } else {
                                                        break L49;
                                                      }
                                                    }
                                                  }
                                                  ((km) this).field_r[var12.field_p] = 1;
                                                  break L48;
                                                }
                                                L50: {
                                                  L51: {
                                                    if (var9 < ((km) this).field_U[var12.field_p]) {
                                                      break L51;
                                                    } else {
                                                      if (!((km) this).field_V[var12.field_p]) {
                                                        break L50;
                                                      } else {
                                                        break L51;
                                                      }
                                                    }
                                                  }
                                                  ((km) this).field_U[var12.field_p] = var9;
                                                  break L50;
                                                }
                                                var11++;
                                                if (var13 == 0) {
                                                  continue L47;
                                                } else {
                                                  break L46;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    var6++;
                                    if (var13 == 0) {
                                      continue L36;
                                    } else {
                                      break L38;
                                    }
                                  }
                                }
                              }
                              if (var13 == 0) {
                                continue L34;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                ((km) this).field_z.a(((km) this).field_p, ((km) this).field_t, ((km) this).field_U, ((km) this).field_V, ((km) this).field_w, ((km) this).field_d, ((km) this).field_r, ((km) this).field_J, 0);
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L52: {
            var3 = decompiledCaughtException;
            stackOut_141_0 = (RuntimeException) var3;
            stackOut_141_1 = new StringBuilder().append("km.RA(");
            stackIn_144_0 = stackOut_141_0;
            stackIn_144_1 = stackOut_141_1;
            stackIn_142_0 = stackOut_141_0;
            stackIn_142_1 = stackOut_141_1;
            if (param0 == null) {
              stackOut_144_0 = (RuntimeException) (Object) stackIn_144_0;
              stackOut_144_1 = (StringBuilder) (Object) stackIn_144_1;
              stackOut_144_2 = "null";
              stackIn_145_0 = stackOut_144_0;
              stackIn_145_1 = stackOut_144_1;
              stackIn_145_2 = stackOut_144_2;
              break L52;
            } else {
              stackOut_142_0 = (RuntimeException) (Object) stackIn_142_0;
              stackOut_142_1 = (StringBuilder) (Object) stackIn_142_1;
              stackOut_142_2 = "{...}";
              stackIn_145_0 = stackOut_142_0;
              stackIn_145_1 = stackOut_142_1;
              stackIn_145_2 = stackOut_142_2;
              break L52;
            }
          }
          throw r.a((Throwable) (Object) stackIn_145_0, stackIn_145_2 + ',' + param1 + ')');
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
        dc stackIn_4_0 = null;
        dc stackIn_14_0 = null;
        dc stackIn_17_0 = null;
        dc stackIn_19_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        dc stackOut_3_0 = null;
        dc stackOut_13_0 = null;
        dc stackOut_16_0 = null;
        dc stackOut_18_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            ((km) this).field_P.a(param0, (byte) -127, param1);
            var4_ref = (qa) (Object) ((km) this).field_P.field_q.d(0);
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var4_ref) {
                    break L3;
                  } else {
                    stackOut_3_0 = ((km) this).field_P;
                    stackIn_14_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var10 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (stackIn_4_0.field_o.field_i) {
                            break L5;
                          } else {
                            var4_ref.field_u.field_R.field_x = var4_ref.field_u.field_R.field_x - var4_ref.field_v;
                            if (var10 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        var4_ref.field_u.field_y.field_m.field_x = var4_ref.field_u.field_y.field_m.field_x - var4_ref.field_v;
                        break L4;
                      }
                      var4_ref.field_u.field_J = var4_ref.field_u.field_J + var4_ref.field_v;
                      var4_ref = (qa) (Object) ((km) this).field_P.field_q.a((byte) -71);
                      if (var10 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_13_0 = ((km) this).field_P;
                stackIn_14_0 = stackOut_13_0;
                break L2;
              }
              var5 = (mg) (Object) ((el) (Object) stackIn_14_0.field_p).a(true);
              L6: while (true) {
                L7: {
                  L8: {
                    if (var5 == null) {
                      break L8;
                    } else {
                      var5.field_y.field_J = var5.field_y.field_J - var5.field_z;
                      stackOut_16_0 = ((km) this).field_P;
                      stackIn_19_0 = stackOut_16_0;
                      stackIn_17_0 = stackOut_16_0;
                      if (var10 != 0) {
                        break L7;
                      } else {
                        var5 = (mg) (Object) ((el) (Object) stackIn_17_0.field_p).a((byte) -68);
                        if (var10 == 0) {
                          continue L6;
                        } else {
                          break L8;
                        }
                      }
                    }
                  }
                  stackOut_18_0 = ((km) this).field_P;
                  stackIn_19_0 = stackOut_18_0;
                  break L7;
                }
                var6 = stackIn_19_0.field_g.field_e;
                var7 = 0;
                var8 = -104 % ((param2 - -36) / 56);
                L9: while (true) {
                  L10: {
                    L11: {
                      if (~var7 <= ~var6.length) {
                        break L11;
                      } else {
                        var9 = var6[var7];
                        fl.a(var9, (byte) 49);
                        kr.a((byte) -127, var9);
                        var7++;
                        if (var10 != 0) {
                          break L10;
                        } else {
                          if (var10 == 0) {
                            continue L9;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    this.a(((km) this).field_n, -94);
                    break L10;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var4;
            stackOut_27_1 = new StringBuilder().append("km.V(").append(param0).append(',');
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L12;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L12;
            }
          }
          throw r.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ',' + param2 + ')');
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
            ((km) this).field_P.a(92, param0);
            ((km) this).field_z.a(param0, 0);
            ((km) this).field_p = new int[param0.field_e.length];
            ((km) this).field_t = new int[param0.field_e.length];
            if (param1 == 6) {
              ((km) this).field_w = new boolean[param0.field_e.length];
              ((km) this).field_d = new int[param0.field_e.length];
              ((km) this).field_J = new int[param0.field_e.length];
              ((km) this).field_r = new int[param0.field_e.length];
              ((km) this).field_V = new boolean[param0.field_e.length];
              ((km) this).field_U = new int[param0.field_e.length];
              this.a(((km) this).field_n, -74);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("km.B(");
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
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
                stackOut_0_0 = ((km) this).field_z;
                stackOut_0_1 = ((km) this).field_P.field_A;
                stackOut_0_2 = ((km) this).field_P.field_i;
                stackIn_6_0 = stackOut_0_0;
                stackIn_6_1 = stackOut_0_1;
                stackIn_6_2 = stackOut_0_2;
                stackIn_1_0 = stackOut_0_0;
                stackIn_1_1 = stackOut_0_1;
                stackIn_1_2 = stackOut_0_2;
                if (!((km) this).field_j) {
                  break L2;
                } else {
                  stackOut_1_0 = (tr) (Object) stackIn_1_0;
                  stackOut_1_1 = (pf) (Object) stackIn_1_1;
                  stackOut_1_2 = (pf) (Object) stackIn_1_2;
                  stackIn_6_0 = stackOut_1_0;
                  stackIn_6_1 = stackOut_1_1;
                  stackIn_6_2 = stackOut_1_2;
                  stackIn_2_0 = stackOut_1_0;
                  stackIn_2_1 = stackOut_1_1;
                  stackIn_2_2 = stackOut_1_2;
                  if (!se.field_g) {
                    break L2;
                  } else {
                    stackOut_2_0 = (tr) (Object) stackIn_2_0;
                    stackOut_2_1 = (pf) (Object) stackIn_2_1;
                    stackOut_2_2 = (pf) (Object) stackIn_2_2;
                    stackIn_4_0 = stackOut_2_0;
                    stackIn_4_1 = stackOut_2_1;
                    stackIn_4_2 = stackOut_2_2;
                    stackOut_4_0 = (tr) (Object) stackIn_4_0;
                    stackOut_4_1 = (pf) (Object) stackIn_4_1;
                    stackOut_4_2 = (pf) (Object) stackIn_4_2;
                    stackOut_4_3 = 1;
                    stackIn_7_0 = stackOut_4_0;
                    stackIn_7_1 = stackOut_4_1;
                    stackIn_7_2 = stackOut_4_2;
                    stackIn_7_3 = stackOut_4_3;
                    break L1;
                  }
                }
              }
              stackOut_6_0 = (tr) (Object) stackIn_6_0;
              stackOut_6_1 = (pf) (Object) stackIn_6_1;
              stackOut_6_2 = (pf) (Object) stackIn_6_2;
              stackOut_6_3 = 0;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              stackIn_7_3 = stackOut_6_3;
              break L1;
            }
            ((tr) (Object) stackIn_7_0).a(stackIn_7_1, stackIn_7_2, stackIn_7_3 != 0, 12114, param0, ((km) this).field_P.field_p);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) (Object) runtimeException, "km.D(" + param0 + ',' + param1 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        qm var4_ref = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (je.field_d != 2) {
                break L1;
              } else {
                if (!((km) this).field_y) {
                  ((km) this).field_Z = param1;
                  ((km) this).field_y = true;
                  ((km) this).field_D = param2;
                  ((km) this).field_T = false;
                  return;
                } else {
                  break L1;
                }
              }
            }
            if (param0 == -3587) {
              L2: {
                if (!((km) this).field_y) {
                  break L2;
                } else {
                  if (2 == rf.field_n) {
                    if ((((km) this).field_D + -param2) * (((km) this).field_D + -param2) + (-param1 + ((km) this).field_Z) * (-param1 + ((km) this).field_Z) <= 25) {
                      break L2;
                    } else {
                      ((km) this).field_T = true;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                L4: {
                  if (!((km) this).field_y) {
                    break L4;
                  } else {
                    if (rf.field_n == 2) {
                      break L4;
                    } else {
                      ((km) this).field_y = false;
                      if (((km) this).field_T) {
                        break L4;
                      } else {
                        L5: {
                          if (((km) this).field_m == 0) {
                            break L5;
                          } else {
                            gm discarded$1 = qk.a(us.field_d, param0 ^ -3671);
                            ((km) this).field_Y.a(-76, 0);
                            if (var5 == 0) {
                              break L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                        if (null != ((km) this).field_z.field_p) {
                          var4_ref = (qm) (Object) ((km) this).field_P.field_i.d(param0 + 3587);
                          L6: while (true) {
                            if (var4_ref == null) {
                              break L4;
                            } else {
                              if (var5 != 0) {
                                break L3;
                              } else {
                                L7: {
                                  if (var4_ref.field_p != ((km) this).field_n) {
                                    break L7;
                                  } else {
                                    L8: {
                                      if (var4_ref.field_q == ((km) this).field_z.field_p) {
                                        break L8;
                                      } else {
                                        if (var4_ref.field_r == ((km) this).field_z.field_p) {
                                          break L8;
                                        } else {
                                          break L7;
                                        }
                                      }
                                    }
                                    L9: {
                                      var4_ref.field_q = null;
                                      var4_ref.field_r = null;
                                      if (((km) this).field_f) {
                                        ((km) this).field_ab.a((df) (Object) var4_ref, 32);
                                        this.e(param0 + 3587);
                                        break L9;
                                      } else {
                                        break L9;
                                      }
                                    }
                                    var4_ref.b((byte) -105);
                                    ((km) this).field_Y.c(var4_ref.field_o, 127);
                                    break L7;
                                  }
                                }
                                var4_ref = (qm) (Object) ((km) this).field_P.field_i.a((byte) -71);
                                if (var5 == 0) {
                                  continue L6;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                break L3;
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var4, "km.L(" + param0 + ',' + param1 + ',' + param2 + ')');
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
              if (((km) this).field_f) {
                stackOut_3_0 = ((km) this).field_n;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_1_0 = ((km) this).field_P.field_v[0];
                stackIn_4_0 = stackOut_1_0;
                break L1;
              }
            }
            var7 = stackIn_4_0;
            if (var7 != param2) {
              return;
            } else {
              var8 = ma.field_s[param4];
              if (0 != var8.length) {
                L2: {
                  var9 = var8[vc.a((byte) -39, var8.length)];
                  var10 = ((km) this).field_P.field_v[((km) this).field_P.field_m[-1 + ((km) this).field_P.field_r]];
                  var9 = vm.a(var10.field_t, 108, "largestplayer", var9);
                  var9 = vm.a(((km) this).field_n.field_t, 124, "you", var9);
                  var9 = vm.a(param3.field_t, 121, "me", var9);
                  if (~((km) this).field_P.field_g.field_e.length >= ~param0) {
                    stackOut_13_0 = "";
                    stackIn_14_0 = stackOut_13_0;
                    break L2;
                  } else {
                    stackOut_11_0 = ((km) this).field_P.field_g.field_e[param0].field_I;
                    stackIn_14_0 = stackOut_11_0;
                    break L2;
                  }
                }
                var9 = vm.a(stackIn_14_0, 100, "system", var9);
                this.a(param3, var9, (byte) 51);
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var6;
            stackOut_16_1 = new StringBuilder().append("km.KA(").append(param0).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L3;
            }
          }
          L4: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param4 + ')');
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
        int stackIn_70_0 = 0;
        int stackIn_77_0 = 0;
        int stackIn_80_0 = 0;
        int stackIn_105_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_126_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_130_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_115_0 = 0;
        int stackOut_125_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_110_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_104_0 = 0;
        int stackOut_79_0 = 0;
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
                  if (((km) this).field_P.field_O >= var2_int) {
                    break L2;
                  } else {
                    if (-1 == ((km) this).field_P.field_O) {
                      break L2;
                    } else {
                      L3: {
                        L4: {
                          this.b(false);
                          this.a((byte) 96, var4, var3);
                          if (~var5 == ~((km) this).field_P.f(-28824)) {
                            break L4;
                          } else {
                            L5: {
                              var9 = js.field_f;
                              var9.h(66, param0 ^ 14680);
                              var9.field_j = var9.field_j + 2;
                              var10 = var9.field_j;
                              if (((km) this).field_h >= 0) {
                                ((km) this).field_P.a((ob) (Object) var9, (byte) 68, ((km) this).field_n);
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            L6: {
                              var9.f(param0 + -549356895, var9.field_j + -var10);
                              if (!se.field_g) {
                                d.a(0, (byte) 82);
                                q.g(-112);
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            ((km) this).field_j = true;
                            if (var11 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                        ((km) this).field_j = false;
                        break L3;
                      }
                      ((km) this).field_P.a(var7_int, var6, false);
                      ((km) this).field_L = false;
                      ((km) this).field_S = var8;
                      this.a(true);
                      if (var11 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                if (((km) this).field_P.field_O != -1) {
                  break L1;
                } else {
                  ((km) this).field_P.d(-9778, var2_int);
                  this.a(true, (int[]) null);
                  ((km) this).field_q = ((km) this).field_P.field_O;
                  break L1;
                }
              }
              ((km) this).field_S = var8;
              stackOut_28_0 = 1;
              stackIn_29_0 = stackOut_28_0;
              return stackIn_29_0 != 0;
            } else {
              if (ej.field_e != 69) {
                if (ej.field_e != 67) {
                  if (70 == ej.field_e) {
                    this.b(rr.field_t, (ob) (Object) sa.field_a, -123);
                    stackOut_39_0 = 1;
                    stackIn_40_0 = stackOut_39_0;
                    return stackIn_40_0 != 0;
                  } else {
                    if (68 == ej.field_e) {
                      this.a((ob) (Object) sa.field_a, rr.field_t, -80);
                      stackOut_44_0 = 1;
                      stackIn_45_0 = stackOut_44_0;
                      return stackIn_45_0 != 0;
                    } else {
                      if (ej.field_e == 62) {
                        L7: {
                          ((km) this).field_P.field_y = sa.field_a.j(param0 ^ -14832);
                          if (this == (Object) (Object) ce.field_x) {
                            ri.k(8);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        stackOut_53_0 = 1;
                        stackIn_54_0 = stackOut_53_0;
                        return stackIn_54_0 != 0;
                      } else {
                        if (ej.field_e == 64) {
                          L8: {
                            ((km) this).field_P.field_e = sa.field_a.j(param0 ^ -14814);
                            if (this == (Object) (Object) ce.field_x) {
                              wp.a(-2);
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          stackOut_62_0 = 1;
                          stackIn_63_0 = stackOut_62_0;
                          return stackIn_63_0 != 0;
                        } else {
                          if (ej.field_e == 63) {
                            ((km) this).field_P.field_f = sa.field_a.j(-119);
                            ((km) this).field_P.field_w = ((km) this).field_P.field_w | ((km) this).field_P.field_f;
                            var2_int = 0;
                            L9: while (true) {
                              L10: {
                                L11: {
                                  if (~((km) this).field_P.field_r >= ~var2_int) {
                                    break L11;
                                  } else {
                                    stackOut_69_0 = ((km) this).field_P.field_f & 1 << var2_int;
                                    stackIn_77_0 = stackOut_69_0;
                                    stackIn_70_0 = stackOut_69_0;
                                    if (var11 != 0) {
                                      break L10;
                                    } else {
                                      L12: {
                                        if (stackIn_70_0 == 0) {
                                          break L12;
                                        } else {
                                          ((km) this).field_P.a(((km) this).field_P.field_v[var2_int], (byte) -123);
                                          break L12;
                                        }
                                      }
                                      var2_int++;
                                      if (var11 == 0) {
                                        continue L9;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                }
                                stackOut_76_0 = 1;
                                stackIn_77_0 = stackOut_76_0;
                                break L10;
                              }
                              return stackIn_77_0 != 0;
                            }
                          } else {
                            if (ej.field_e != 65) {
                              if (61 != ej.field_e) {
                                if (param0 == 14759) {
                                  if (ej.field_e != 72) {
                                    if (ej.field_e == 73) {
                                      var2_int = sa.field_a.j(-95);
                                      var3 = sa.field_a.j(-112);
                                      var4 = sa.field_a.j(param0 ^ -14805);
                                      ((km) this).a(var4, (byte) 4, ((km) this).field_n, ((km) this).field_P.field_v[var2_int], var3);
                                      stackOut_115_0 = 1;
                                      stackIn_116_0 = stackOut_115_0;
                                      return stackIn_116_0 != 0;
                                    } else {
                                      L13: {
                                        if (ej.field_e != 74) {
                                          break L13;
                                        } else {
                                          if (se.field_g) {
                                            var2_int = rr.field_t / 4;
                                            var3 = 0;
                                            L14: while (true) {
                                              L15: {
                                                L16: {
                                                  if (~var2_int >= ~var3) {
                                                    break L16;
                                                  } else {
                                                    var4 = sa.field_a.j(-128);
                                                    var5 = sa.field_a.j(-126);
                                                    stackOut_125_0 = sa.field_a.f(param0 ^ -26697);
                                                    stackIn_128_0 = stackOut_125_0;
                                                    stackIn_126_0 = stackOut_125_0;
                                                    if (var11 != 0) {
                                                      break L15;
                                                    } else {
                                                      var6 = stackIn_126_0;
                                                      var7 = "My personality type is " + wk.field_a[var5] + " and my rating is " + var6;
                                                      this.a(((km) this).field_P.field_v[var4], var7, (byte) 51);
                                                      var3++;
                                                      if (var11 == 0) {
                                                        continue L14;
                                                      } else {
                                                        break L16;
                                                      }
                                                    }
                                                  }
                                                }
                                                stackOut_127_0 = 1;
                                                stackIn_128_0 = stackOut_127_0;
                                                break L15;
                                              }
                                              return stackIn_128_0 != 0;
                                            }
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                      stackOut_129_0 = 0;
                                      stackIn_130_0 = stackOut_129_0;
                                      break L0;
                                    }
                                  } else {
                                    this.i(-126);
                                    stackOut_110_0 = 1;
                                    stackIn_111_0 = stackOut_110_0;
                                    return stackIn_111_0 != 0;
                                  }
                                } else {
                                  stackOut_107_0 = 1;
                                  stackIn_108_0 = stackOut_107_0;
                                  return stackIn_108_0 != 0;
                                }
                              } else {
                                L17: {
                                  L18: {
                                    L19: {
                                      L20: {
                                        var2_int = sa.field_a.g(-2852);
                                        ((km) this).field_P.a(var2_int, 3);
                                        ta.a(0, -1, (byte) 96, false);
                                        ((km) this).field_b = false;
                                        ((km) this).field_Y.o(-4956);
                                        if (((km) this).field_n == null) {
                                          break L20;
                                        } else {
                                          if ((((km) this).field_P.field_w & 1 << ((km) this).field_h) != 0) {
                                            break L19;
                                          } else {
                                            break L20;
                                          }
                                        }
                                      }
                                      if (!((km) this).field_P.field_x.a((byte) 123, ((km) this).field_n)) {
                                        break L18;
                                      } else {
                                        break L19;
                                      }
                                    }
                                    jo.a(param0 ^ 18008, wh.field_b, false, 10);
                                    if (var11 == 0) {
                                      break L17;
                                    } else {
                                      break L18;
                                    }
                                  }
                                  if (((km) this).field_P.field_z) {
                                    jo.a(32767, hj.field_n, false, 10);
                                    break L17;
                                  } else {
                                    break L17;
                                  }
                                }
                                L21: {
                                  if (!sm.field_e) {
                                    break L21;
                                  } else {
                                    if ((1 << ((km) this).field_h & ((km) this).field_P.field_e) != 0) {
                                      break L21;
                                    } else {
                                      ((km) this).b(-116);
                                      break L21;
                                    }
                                  }
                                }
                                stackOut_104_0 = 1;
                                stackIn_105_0 = stackOut_104_0;
                                return stackIn_105_0 != 0;
                              }
                            } else {
                              ((km) this).field_i = sa.field_a.j(-57);
                              stackOut_79_0 = 1;
                              stackIn_80_0 = stackOut_79_0;
                              return stackIn_80_0 != 0;
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  this.a(1, (ob) (Object) sa.field_a, rr.field_t);
                  stackOut_34_0 = 1;
                  stackIn_35_0 = stackOut_34_0;
                  return stackIn_35_0 != 0;
                }
              } else {
                ((km) this).field_N = sa.field_a.j(-78);
                stackOut_31_0 = 1;
                stackIn_32_0 = stackOut_31_0;
                return stackIn_32_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "km.M(" + param0 + ')');
        }
        return stackIn_130_0 != 0;
    }

    private final void a(int param0, ln param1, ln param2, int param3) {
        RuntimeException runtimeException = null;
        qm var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
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
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var5 = (qm) (Object) ((km) this).field_P.field_i.d(0);
            L1: while (true) {
              L2: {
                L3: {
                  if (var5 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = ~param3;
                    stackOut_3_1 = ~var5.field_o;
                    stackIn_16_0 = stackOut_3_0;
                    stackIn_16_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var7 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 != stackIn_4_1) {
                          break L4;
                        } else {
                          var5.field_r = param1;
                          var5.field_q = param2;
                          if (var7 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var5 = (qm) (Object) ((km) this).field_P.field_i.a((byte) -71);
                      if (var7 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L5: {
                  if (var5 == null) {
                    var5 = new qm(param3, ((km) this).field_n, param2, param1);
                    break L5;
                  } else {
                    break L5;
                  }
                }
                stackOut_15_0 = 86;
                stackOut_15_1 = (param0 - 6) / 34;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                break L2;
              }
              L6: {
                var6 = stackIn_16_0 % stackIn_16_1;
                ((km) this).field_P.field_i.a((byte) -113, (oh) (Object) var5);
                if (((km) this).field_f) {
                  ((km) this).field_ab.a((df) (Object) var5, 32);
                  this.e(0);
                  break L6;
                } else {
                  break L6;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            runtimeException = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) runtimeException;
            stackOut_21_1 = new StringBuilder().append("km.F(").append(param0).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L7;
            }
          }
          L8: {
            stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');
            stackIn_28_0 = stackOut_25_0;
            stackIn_28_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param2 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L8;
            } else {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "{...}";
              stackIn_29_0 = stackOut_26_0;
              stackIn_29_1 = stackOut_26_1;
              stackIn_29_2 = stackOut_26_2;
              break L8;
            }
          }
          throw r.a((Throwable) (Object) stackIn_29_0, stackIn_29_2 + ',' + param3 + ')');
        }
    }

    private final void b(int param0, int param1) {
        RuntimeException var3 = null;
        int[] var3_array = null;
        oh var4 = null;
        int var5 = 0;
        StringBuilder var6 = null;
        mg var7_ref_mg = null;
        int var7 = 0;
        qm var7_ref_qm = null;
        eg var7_ref_eg = null;
        hj var7_ref_hj = null;
        qi var7_ref_qi = null;
        nr var7_ref_nr = null;
        ne var8 = null;
        fs[] var8_array = null;
        int var8_int = 0;
        mg var9 = null;
        as var10 = null;
        int var11 = 0;
        boolean stackIn_4_0 = false;
        ln stackIn_22_0 = null;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        Object stackIn_74_0 = null;
        boolean stackIn_78_0 = false;
        int stackIn_94_0 = 0;
        int stackIn_98_0 = 0;
        int stackIn_98_1 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        ln stackOut_21_0 = null;
        int stackOut_48_0 = 0;
        int stackOut_48_1 = 0;
        oh stackOut_73_0 = null;
        boolean stackOut_77_0 = false;
        int stackOut_93_0 = 0;
        int stackOut_97_0 = 0;
        int stackOut_97_1 = 0;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            ((km) this).field_Q = new k();
            ((km) this).field_z.b(false);
            var3_array = this.c((byte) 44);
            ((km) this).field_P.a(param0, 1, ((km) this).field_Q, (se) null);
            ((km) this).field_z.a(0);
            var4 = ((km) this).field_Q.field_a.d(0);
            var5 = 0;
            var6 = new StringBuilder();
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (null == var4) {
                      break L4;
                    } else {
                      stackOut_3_0 = var4 instanceof mg;
                      stackIn_94_0 = stackOut_3_0 ? 1 : 0;
                      stackIn_4_0 = stackOut_3_0;
                      if (var11 != 0) {
                        break L3;
                      } else {
                        L5: {
                          L6: {
                            L7: {
                              if (!stackIn_4_0) {
                                break L7;
                              } else {
                                L8: {
                                  L9: {
                                    var7_ref_mg = (mg) (Object) var4;
                                    if (var7_ref_mg.field_G != null) {
                                      break L9;
                                    } else {
                                      var5 = 1;
                                      StringBuilder discarded$2 = var6.append("Fleet from " + var7_ref_mg.field_y.field_I + " to " + var7_ref_mg.field_B.field_I + " has no owner.\n");
                                      if (var11 == 0) {
                                        break L8;
                                      } else {
                                        break L9;
                                      }
                                    }
                                  }
                                  ((km) this).field_z.field_c.a((byte) -113, (oh) (Object) qn.a(-121, var7_ref_mg));
                                  if (var7_ref_mg.field_z > ((km) this).field_z.field_y) {
                                    ((km) this).field_z.field_y = var7_ref_mg.field_z;
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                }
                                if (var11 == 0) {
                                  break L6;
                                } else {
                                  break L7;
                                }
                              }
                            }
                            L10: {
                              if (!(var4 instanceof eg)) {
                                break L10;
                              } else {
                                var7_ref_eg = (eg) (Object) var4;
                                ((km) this).field_z.field_m.a((byte) -113, (oh) (Object) new vn(var7_ref_eg));
                                var8 = (ne) (Object) var7_ref_eg.field_v.d(0);
                                L11: while (true) {
                                  L12: {
                                    if (var8 == null) {
                                      break L12;
                                    } else {
                                      stackOut_21_0 = var8.field_k;
                                      stackIn_74_0 = (Object) (Object) stackOut_21_0;
                                      stackIn_22_0 = stackOut_21_0;
                                      if (var11 != 0) {
                                        break L5;
                                      } else {
                                        L13: {
                                          if (stackIn_22_0 == null) {
                                            break L13;
                                          } else {
                                            if (var8.field_r == 0) {
                                              break L13;
                                            } else {
                                              if (var8.field_h != var8.field_k.field_y) {
                                                break L13;
                                              } else {
                                                var9 = new mg(var7_ref_eg.field_p, var8.field_k, var8.field_h, var8.field_r);
                                                var10 = bb.a(-2, var9);
                                                ((km) this).field_z.field_v.a((byte) -113, (oh) (Object) var10);
                                                if (var10.field_x <= ((km) this).field_z.field_y) {
                                                  break L13;
                                                } else {
                                                  ((km) this).field_z.field_y = var10.field_x;
                                                  break L13;
                                                }
                                              }
                                            }
                                          }
                                        }
                                        var8 = (ne) (Object) var7_ref_eg.field_v.a((byte) -71);
                                        if (var11 == 0) {
                                          continue L11;
                                        } else {
                                          break L12;
                                        }
                                      }
                                    }
                                  }
                                  if (var11 == 0) {
                                    break L6;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                            }
                            L14: {
                              if (var4 instanceof qm) {
                                break L14;
                              } else {
                                L15: {
                                  if (var4 instanceof qi) {
                                    break L15;
                                  } else {
                                    if (!(var4 instanceof nr)) {
                                      break L6;
                                    } else {
                                      L16: {
                                        var7_ref_nr = (nr) (Object) var4;
                                        if (null == var7_ref_nr.field_j) {
                                          break L16;
                                        } else {
                                          var8_int = 0;
                                          L17: while (true) {
                                            if (var7_ref_nr.field_j.length <= var8_int) {
                                              break L16;
                                            } else {
                                              var9 = new mg(var7_ref_nr.field_p, var7_ref_nr.field_j[var8_int], var7_ref_nr.field_p.field_t, var7_ref_nr.field_i[var8_int]);
                                              ((km) this).field_z.field_hb.a((byte) -113, (oh) (Object) sg.a((byte) 101, var9));
                                              stackOut_48_0 = var9.field_z;
                                              stackOut_48_1 = ((km) this).field_z.field_y;
                                              stackIn_98_0 = stackOut_48_0;
                                              stackIn_98_1 = stackOut_48_1;
                                              stackIn_49_0 = stackOut_48_0;
                                              stackIn_49_1 = stackOut_48_1;
                                              if (var11 != 0) {
                                                break L2;
                                              } else {
                                                L18: {
                                                  if (stackIn_49_0 > stackIn_49_1) {
                                                    ((km) this).field_z.field_y = var9.field_z;
                                                    break L18;
                                                  } else {
                                                    break L18;
                                                  }
                                                }
                                                var8_int++;
                                                if (var11 == 0) {
                                                  continue L17;
                                                } else {
                                                  break L16;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      ((km) this).field_z.field_P[var7_ref_nr.field_p.field_p] = true;
                                      if (var11 == 0) {
                                        break L6;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                }
                                var7_ref_qi = (qi) (Object) var4;
                                ((km) this).field_z.a(var7_ref_qi.field_l, -123, 2, var7_ref_qi.field_k);
                                if (var11 == 0) {
                                  break L6;
                                } else {
                                  break L14;
                                }
                              }
                            }
                            L19: {
                              L20: {
                                var7_ref_qm = (qm) (Object) var4;
                                if (0 == var7_ref_qm.field_o) {
                                  break L20;
                                } else {
                                  L21: {
                                    if (var7_ref_qm.field_o == 1) {
                                      break L21;
                                    } else {
                                      if (var7_ref_qm.field_o == 3) {
                                        ((km) this).field_z.a(var7_ref_qm.field_p, var7_ref_qm.field_r, (byte) -128, var7_ref_qm.field_q);
                                        if (var11 == 0) {
                                          break L19;
                                        } else {
                                          break L21;
                                        }
                                      } else {
                                        break L19;
                                      }
                                    }
                                  }
                                  ((km) this).field_z.a(var7_ref_qm.field_q, -117, 1, var7_ref_qm.field_p);
                                  if (var11 == 0) {
                                    break L19;
                                  } else {
                                    break L20;
                                  }
                                }
                              }
                              ((km) this).field_z.a(var7_ref_qm.field_q, -124, 0, var7_ref_qm.field_p);
                              break L19;
                            }
                            if (((km) this).field_n != var7_ref_qm.field_p) {
                              break L6;
                            } else {
                              break L6;
                            }
                          }
                          stackOut_73_0 = ((km) this).field_Q.field_a.a((byte) -71);
                          stackIn_74_0 = (Object) (Object) stackOut_73_0;
                          break L5;
                        }
                        var4 = (oh) (Object) stackIn_74_0;
                        if (var11 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  var4 = ((km) this).field_Q.field_a.d(0);
                  L22: while (true) {
                    L23: {
                      if (var4 == null) {
                        break L23;
                      } else {
                        stackOut_77_0 = var4 instanceof hj;
                        stackIn_94_0 = stackOut_77_0 ? 1 : 0;
                        stackIn_78_0 = stackOut_77_0;
                        if (var11 != 0) {
                          break L3;
                        } else {
                          L24: {
                            if (!stackIn_78_0) {
                              break L24;
                            } else {
                              L25: {
                                var7_ref_hj = (hj) (Object) var4;
                                if (var7_ref_hj.field_j != null) {
                                  break L25;
                                } else {
                                  var5 = 1;
                                  StringBuilder discarded$3 = var6.append("Construction event at " + var7_ref_hj.field_i.field_I + " has no owner.\n");
                                  if (var11 == 0) {
                                    break L24;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                              if (var7_ref_hj.field_j != ((km) this).field_n) {
                                ((km) this).field_z.a(var7_ref_hj.field_j, var7_ref_hj.field_i, false, var7_ref_hj.field_h);
                                if (((km) this).field_z.field_u < var7_ref_hj.field_h) {
                                  ((km) this).field_z.field_u = var7_ref_hj.field_h;
                                  break L24;
                                } else {
                                  break L24;
                                }
                              } else {
                                break L24;
                              }
                            }
                          }
                          var4 = ((km) this).field_Q.field_a.a((byte) -71);
                          if (var11 == 0) {
                            continue L22;
                          } else {
                            break L23;
                          }
                        }
                      }
                    }
                    ((km) this).field_z.field_C = true;
                    ((km) this).field_P.g(-7954);
                    this.a(true, var3_array);
                    stackOut_93_0 = var5;
                    stackIn_94_0 = stackOut_93_0;
                    break L3;
                  }
                }
                L26: {
                  if (stackIn_94_0 != 0) {
                    jq.a(-29901, (Throwable) null, var6.toString());
                    q.g(-118);
                    break L26;
                  } else {
                    break L26;
                  }
                }
                stackOut_97_0 = -13;
                stackOut_97_1 = (param1 - 35) / 40;
                stackIn_98_0 = stackOut_97_0;
                stackIn_98_1 = stackOut_97_1;
                break L2;
              }
              L27: {
                var7 = stackIn_98_0 % stackIn_98_1;
                if (!((km) this).field_W) {
                  break L27;
                } else {
                  if ((((km) this).field_P.field_w & 1) != 0) {
                    fl.a(0, "losegame");
                    break L27;
                  } else {
                    break L27;
                  }
                }
              }
              L28: {
                if (((km) this).field_W) {
                  var8_array = ((km) this).field_P.field_x.a((byte) -23);
                  if (var8_array == null) {
                    break L28;
                  } else {
                    if (((km) this).field_n != var8_array[0]) {
                      break L28;
                    } else {
                      fl.a(0, "wingame");
                      break L28;
                    }
                  }
                } else {
                  break L28;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var3, "km.AB(" + param0 + ',' + param1 + ')');
        }
    }

    final void d(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -7970) {
              if (!((km) this).field_f) {
                throw new IllegalStateException();
              } else {
                js.field_f.h(64, param0 ^ -8159);
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "km.H(" + param0 + ')');
        }
    }

    private final void j(int param0) {
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
              L2: {
                var2_int = 0;
                if (!((km) this).field_Y.a(true, (byte) 63)) {
                  break L2;
                } else {
                  ((km) this).field_T = true;
                  var2_int = 1;
                  ((km) this).field_y = false;
                  ((km) this).field_z.field_nb[1] = -1;
                  ((km) this).field_z.field_nb[0] = -1;
                  ((km) this).field_z.field_p = null;
                  ((km) this).field_z.field_S = null;
                  if (var11 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (je.field_d != 1) {
                  break L3;
                } else {
                  this.a(td.field_P, (byte) -103, nh.field_p);
                  break L3;
                }
              }
              this.a(-3587, pd.field_k, bb.field_b);
              ((km) this).field_z.a(((km) this).field_m, 0, pd.field_k, bb.field_b);
              break L1;
            }
            L4: {
              var3 = ((km) this).field_z.field_k;
              var4 = ((km) this).field_z.field_E;
              if (!di.field_p[96]) {
                break L4;
              } else {
                var3 = var3 - 5.0f * (((km) this).field_z.field_I + 50.0f) / 300.0f;
                if (0.0f <= var3) {
                  break L4;
                } else {
                  var3 = 0.0f;
                  break L4;
                }
              }
            }
            L5: {
              if (param0 == 50) {
                break L5;
              } else {
                ((km) this).d(88);
                break L5;
              }
            }
            L6: {
              var5 = ((km) this).field_z.field_I;
              if (di.field_p[97]) {
                var3 = var3 + 5.0f * (((km) this).field_z.field_I + 50.0f) / 300.0f;
                if ((float)((km) this).field_P.field_g.field_k >= var3) {
                  break L6;
                } else {
                  var3 = (float)((km) this).field_P.field_g.field_k;
                  break L6;
                }
              } else {
                break L6;
              }
            }
            L7: {
              if (!di.field_p[98]) {
                break L7;
              } else {
                var4 = var4 - 5.0f * (((km) this).field_z.field_I + 50.0f) / 300.0f;
                if (var4 >= 0.0f) {
                  break L7;
                } else {
                  var4 = 0.0f;
                  break L7;
                }
              }
            }
            L8: {
              if (!di.field_p[99]) {
                break L8;
              } else {
                var4 = var4 + 5.0f * (((km) this).field_z.field_I + 50.0f) / 300.0f;
                if ((float)((km) this).field_P.field_g.field_b < var4) {
                  var4 = (float)((km) this).field_P.field_g.field_b;
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            L9: {
              L10: {
                if (di.field_p[27]) {
                  break L10;
                } else {
                  if (di.field_p[87]) {
                    break L10;
                  } else {
                    break L9;
                  }
                }
              }
              var5 = var5 / 1.100000023841858f;
              if (((km) this).field_z.field_g > var5) {
                var5 = ((km) this).field_z.field_g;
                break L9;
              } else {
                break L9;
              }
            }
            L11: {
              L12: {
                if (di.field_p[26]) {
                  break L12;
                } else {
                  if (di.field_p[88]) {
                    break L12;
                  } else {
                    break L11;
                  }
                }
              }
              var5 = var5 * 1.100000023841858f;
              if (((km) this).field_z.field_F < var5) {
                var5 = ((km) this).field_z.field_F;
                break L11;
              } else {
                break L11;
              }
            }
            L13: {
              L14: {
                L15: {
                  if (var2_int != 0) {
                    break L15;
                  } else {
                    if ((2 & rf.field_n) != 0) {
                      break L14;
                    } else {
                      break L15;
                    }
                  }
                }
                ((km) this).field_G = false;
                if (var11 == 0) {
                  break L13;
                } else {
                  break L14;
                }
              }
              L16: {
                if (((km) this).field_G) {
                  L17: {
                    var6 = -((km) this).field_z.field_db + pd.field_k;
                    var7 = -((km) this).field_z.field_e + bb.field_b;
                    var3 = var3 - ((km) this).field_z.field_I * (float)var6 / 300.0f;
                    if (0.0f <= var3) {
                      break L17;
                    } else {
                      var3 = 0.0f;
                      break L17;
                    }
                  }
                  L18: {
                    var4 = var4 - (float)var7 * ((km) this).field_z.field_I / 300.0f;
                    if (var3 > (float)((km) this).field_P.field_g.field_k) {
                      var3 = (float)((km) this).field_P.field_g.field_k;
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  L19: {
                    if (var4 >= 0.0f) {
                      break L19;
                    } else {
                      var4 = 0.0f;
                      break L19;
                    }
                  }
                  if (var4 <= (float)((km) this).field_P.field_g.field_b) {
                    break L16;
                  } else {
                    var4 = (float)((km) this).field_P.field_g.field_b;
                    break L16;
                  }
                } else {
                  break L16;
                }
              }
              ((km) this).field_z.field_e = bb.field_b;
              ((km) this).field_G = true;
              ((km) this).field_z.field_db = pd.field_k;
              break L13;
            }
            L20: {
              if (var2_int != 0) {
                break L20;
              } else {
                if (so.field_o == 0) {
                  break L20;
                } else {
                  L21: {
                    L22: {
                      L23: {
                        var6 = 320;
                        var7 = ((km) this).field_Y.d((byte) 14) / 2;
                        var8 = var3 + (float)(pd.field_k - var6) * ((km) this).field_z.field_I / 300.0f;
                        var9 = (float)(bb.field_b - var7) * ((km) this).field_z.field_I / 300.0f + var4;
                        if (0 < so.field_o) {
                          break L23;
                        } else {
                          var10 = 2 * so.field_o;
                          L24: while (true) {
                            L25: {
                              if (var10 >= 0) {
                                break L25;
                              } else {
                                var5 = var5 / 1.100000023841858f;
                                var10++;
                                if (var11 != 0) {
                                  break L21;
                                } else {
                                  if (var11 == 0) {
                                    continue L24;
                                  } else {
                                    break L25;
                                  }
                                }
                              }
                            }
                            if (((km) this).field_z.field_g <= var5) {
                              break L22;
                            } else {
                              var5 = ((km) this).field_z.field_g;
                              if (var11 == 0) {
                                break L22;
                              } else {
                                break L23;
                              }
                            }
                          }
                        }
                      }
                      var10 = 0;
                      L26: while (true) {
                        L27: {
                          if (~(so.field_o * 2) >= ~var10) {
                            break L27;
                          } else {
                            var5 = var5 * 1.100000023841858f;
                            var10++;
                            if (var11 != 0) {
                              break L21;
                            } else {
                              if (var11 == 0) {
                                continue L26;
                              } else {
                                break L27;
                              }
                            }
                          }
                        }
                        if (var5 <= ((km) this).field_z.field_F) {
                          break L22;
                        } else {
                          var5 = ((km) this).field_z.field_F;
                          break L22;
                        }
                      }
                    }
                    var3 = var8 - var5 * (float)(-var6 + pd.field_k) / 300.0f;
                    var4 = var9 - var5 * (float)(bb.field_b - var7) / 300.0f;
                    break L21;
                  }
                  L28: {
                    if (0.0f > var3) {
                      var3 = 0.0f;
                      break L28;
                    } else {
                      break L28;
                    }
                  }
                  L29: {
                    if (0.0f > var4) {
                      var4 = 0.0f;
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                  L30: {
                    if ((float)((km) this).field_P.field_g.field_k >= var3) {
                      break L30;
                    } else {
                      var3 = (float)((km) this).field_P.field_g.field_k;
                      break L30;
                    }
                  }
                  if (var4 > (float)((km) this).field_P.field_g.field_b) {
                    var4 = (float)((km) this).field_P.field_g.field_b;
                    break L20;
                  } else {
                    break L20;
                  }
                }
              }
            }
            L31: {
              L32: {
                if (((km) this).field_z.field_k != var3) {
                  break L32;
                } else {
                  if (((km) this).field_z.field_E != var4) {
                    break L32;
                  } else {
                    if (((km) this).field_z.field_I != var5) {
                      break L32;
                    } else {
                      break L31;
                    }
                  }
                }
              }
              ((km) this).field_z.field_I = var5;
              ((km) this).field_z.field_x = false;
              ((km) this).field_z.field_fb = null;
              ((km) this).field_z.field_E = var4;
              ((km) this).field_z.field_k = var3;
              ((km) this).field_z.a(false);
              break L31;
            }
            L33: {
              L34: {
                if (rf.field_n != 0) {
                  break L34;
                } else {
                  ((km) this).field_I = ((km) this).field_F;
                  ((km) this).field_O = 0;
                  if (var11 == 0) {
                    break L33;
                  } else {
                    break L34;
                  }
                }
              }
              if (((km) this).field_z.field_S == null) {
                break L33;
              } else {
                boolean discarded$1 = this.a((byte) 121, ((km) this).field_z.field_S);
                break L33;
              }
            }
            ((km) this).field_z.c(pd.field_k, bb.field_b, param0 ^ 69);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "km.W(" + param0 + ')');
        }
    }

    private final void a(boolean param0, int param1, ln param2, ln param3) {
        RuntimeException var5 = null;
        mg var5_ref = null;
        int var6 = 0;
        ln stackIn_4_0 = null;
        ln stackIn_4_1 = null;
        ln stackIn_18_0 = null;
        ln stackIn_18_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        ln stackOut_3_0 = null;
        ln stackOut_3_1 = null;
        ln stackOut_17_0 = null;
        ln stackOut_17_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var5_ref = (mg) (Object) param3.field_T.d(0);
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var5_ref) {
                    break L3;
                  } else {
                    stackOut_3_0 = (ln) param2;
                    stackOut_3_1 = var5_ref.field_B;
                    stackIn_18_0 = stackOut_3_0;
                    stackIn_18_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var6 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 != stackIn_4_1) {
                          break L4;
                        } else {
                          if (var5_ref.field_G == ((km) this).field_n) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var5_ref = (mg) (Object) param3.field_T.a((byte) -71);
                      if (var6 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (!param0) {
                  L5: {
                    L6: {
                      if (null != var5_ref) {
                        break L6;
                      } else {
                        var5_ref = new mg(param3, param2, param1);
                        param3.field_T.a((byte) -113, (oh) (Object) var5_ref);
                        param2.field_s.a((df) (Object) var5_ref, 32);
                        ((km) this).field_P.field_p.a((byte) 62, (vp) (Object) var5_ref);
                        if (var6 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    var5_ref.field_z = var5_ref.field_z + param1;
                    break L5;
                  }
                  stackOut_17_0 = (ln) param3;
                  stackOut_17_1 = (ln) param3;
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  break L2;
                } else {
                  return;
                }
              }
              L7: {
                stackIn_18_0.field_J = stackIn_18_1.field_J - param1;
                ((km) this).field_C[param3.field_p] = ((km) this).field_C[param3.field_p] - param1;
                kr.a((byte) 83, param3);
                fl.a(param2, (byte) 75);
                this.a(((km) this).field_n, -95);
                if (((km) this).field_f) {
                  ((km) this).field_v.a((byte) 9, (cn) (Object) var5_ref);
                  this.e(0);
                  break L7;
                } else {
                  break L7;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var5 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var5;
            stackOut_23_1 = new StringBuilder().append("km.U(").append(param0).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L8;
            }
          }
          L9: {
            stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
            stackOut_27_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');
            stackIn_30_0 = stackOut_27_0;
            stackIn_30_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param3 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_31_0 = stackOut_28_0;
              stackIn_31_1 = stackOut_28_1;
              stackIn_31_2 = stackOut_28_2;
              break L9;
            }
          }
          throw r.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + ')');
        }
    }

    private final void l(int param0) {
        RuntimeException runtimeException = null;
        sl var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2 = js.field_f;
            var2.h(59, 255);
            if (param0 < -75) {
              L1: {
                var2.field_j = var2.field_j + 2;
                var3 = var2.field_j;
                var2.c(((km) this).field_P.field_O, (byte) -109);
                se.a(tr.a((byte) 81, ((km) this).field_o), -256, tr.a((byte) 93, ((km) this).field_ab), rp.a(-125, ((km) this).field_v), var2);
                ((km) this).field_ab.b((byte) 35);
                ((km) this).field_o.b((byte) 87);
                ((km) this).field_v.a((byte) 112);
                var2.f(-549342136, -var3 + var2.field_j);
                ((km) this).field_g = -1;
                ((km) this).field_k = -1;
                if (!sm.field_e) {
                  break L1;
                } else {
                  ((km) this).m(126);
                  break L1;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) (Object) runtimeException, "km.VA(" + param0 + ')');
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
              ((km) this).field_C[param0.field_y.field_p] = ((km) this).field_C[param0.field_y.field_p] - param1;
              param0.field_z = param0.field_z + param1;
              if (param2 == 10755) {
                break L1;
              } else {
                ((km) this).a(101);
                break L1;
              }
            }
            if (param0.field_z >= 0) {
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
                this.a(((km) this).field_n, -117);
                if (((km) this).field_f) {
                  ((km) this).field_v.a((byte) 9, (cn) (Object) param0);
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
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("km.IA(");
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int a(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int stackIn_14_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
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
                ((km) this).field_c = null;
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
                  return stackIn_14_0;
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
                if (var2_int == 0) {
                  var2_int = 82;
                  break L4;
                } else {
                  stackOut_20_0 = 0;
                  stackIn_21_0 = stackOut_20_0;
                  return stackIn_21_0;
                }
              }
            }
            stackOut_23_0 = var2_int;
            stackIn_24_0 = stackOut_23_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "km.PA(" + param0 + ')');
        }
        return stackIn_24_0;
    }

    final void b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((km) this).field_f) {
              ((km) this).field_P.field_e = ((km) this).field_P.field_e | 1 << ((km) this).field_h;
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
          throw r.a((Throwable) (Object) var2, "km.C(" + param0 + ')');
        }
    }

    private final boolean a(byte param0, mg param1) {
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
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_69_0 = 0;
        int stackOut_67_0 = 0;
        int stackOut_74_0 = 0;
        int stackOut_72_0 = 0;
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
              if (param1.field_G != ((km) this).field_n) {
                stackOut_7_0 = 0;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0 != 0;
              } else {
                L1: {
                  L2: {
                    if (((km) this).field_O <= 0) {
                      break L2;
                    } else {
                      ((km) this).field_O = ((km) this).field_O - 1;
                      if (var7 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  L3: {
                    if (rf.field_n != 1) {
                      break L3;
                    } else {
                      if (param1 != ((km) this).field_z.field_rb) {
                        ((km) this).field_z.b((byte) -127);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                  }
                  L4: {
                    L5: {
                      L6: {
                        if (rf.field_n != 1) {
                          break L6;
                        } else {
                          if (((km) this).field_z.field_Ab) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (rf.field_n != 1) {
                          break L7;
                        } else {
                          if (!((km) this).field_z.field_Gb) {
                            break L7;
                          } else {
                            L8: {
                              L9: {
                                var3_int = -1;
                                var4 = this.a((byte) 55);
                                if (var4 == 82) {
                                  break L9;
                                } else {
                                  if (var4 == 86) {
                                    L10: {
                                      if (((km) this).field_z.field_S.field_z < 5) {
                                        stackOut_41_0 = ((km) this).field_z.field_S.field_z;
                                        stackIn_42_0 = stackOut_41_0;
                                        break L10;
                                      } else {
                                        stackOut_39_0 = 5;
                                        stackIn_42_0 = stackOut_39_0;
                                        break L10;
                                      }
                                    }
                                    var3_int = -stackIn_42_0;
                                    if (var7 == 0) {
                                      break L8;
                                    } else {
                                      break L9;
                                    }
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                              var3_int = -((km) this).field_z.field_S.field_z;
                              break L8;
                            }
                            L11: {
                              this.a(((km) this).field_z.field_S, var3_int, 10755);
                              if (((km) this).field_z.field_S.field_z != 0) {
                                break L11;
                              } else {
                                ((km) this).field_z.field_nb[1] = -1;
                                ((km) this).field_z.field_nb[0] = -1;
                                ((km) this).field_z.field_S = null;
                                ((km) this).field_z.b((byte) -51);
                                break L11;
                              }
                            }
                            if (var7 == 0) {
                              break L4;
                            } else {
                              break L7;
                            }
                          }
                        }
                      }
                      if (rf.field_n != 1) {
                        break L4;
                      } else {
                        if (((km) this).field_z.field_Bb) {
                          var3_int = -param1.field_z;
                          this.a(((km) this).field_z.field_S, var3_int, 10755);
                          ((km) this).field_z.field_nb[1] = -1;
                          ((km) this).field_z.field_S = null;
                          ((km) this).field_z.field_nb[0] = -1;
                          ((km) this).field_z.b((byte) -74);
                          if (var7 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        } else {
                          break L4;
                        }
                      }
                    }
                    L12: {
                      L13: {
                        var3_int = 1;
                        var4 = this.a((byte) 57);
                        var5 = ((km) this).field_z.field_S.field_y;
                        if (82 == var4) {
                          break L13;
                        } else {
                          if (var4 == 86) {
                            var3_int = 5;
                            if (var7 == 0) {
                              break L12;
                            } else {
                              break L13;
                            }
                          } else {
                            break L12;
                          }
                        }
                      }
                      L14: {
                        if (var5.field_N < var5.field_J) {
                          stackOut_69_0 = var5.field_J - var5.field_N;
                          stackIn_70_0 = stackOut_69_0;
                          break L14;
                        } else {
                          stackOut_67_0 = var5.field_J;
                          stackIn_70_0 = stackOut_67_0;
                          break L14;
                        }
                      }
                      var3_int = stackIn_70_0;
                      break L12;
                    }
                    L15: {
                      if (!((km) this).field_P.field_o.field_e) {
                        stackOut_74_0 = var5.field_N;
                        stackIn_75_0 = stackOut_74_0;
                        break L15;
                      } else {
                        stackOut_72_0 = 0;
                        stackIn_75_0 = stackOut_72_0;
                        break L15;
                      }
                    }
                    L16: {
                      var6 = stackIn_75_0;
                      if (~(var5.field_J - var6) <= ~var3_int) {
                        break L16;
                      } else {
                        var3_int = var5.field_J + -var6;
                        break L16;
                      }
                    }
                    L17: {
                      if (var3_int > 0) {
                        break L17;
                      } else {
                        gm discarded$2 = qk.a(jj.field_l, 47);
                        if (var7 == 0) {
                          break L4;
                        } else {
                          break L17;
                        }
                      }
                    }
                    this.a(((km) this).field_z.field_S, var3_int, 10755);
                    break L4;
                  }
                  L18: {
                    int fieldTemp$3 = ((km) this).field_I - 5;
                    ((km) this).field_I = ((km) this).field_I - 5;
                    if (0 <= fieldTemp$3) {
                      break L18;
                    } else {
                      ((km) this).field_I = 0;
                      break L18;
                    }
                  }
                  ((km) this).field_O = ((km) this).field_I;
                  ((km) this).a(2);
                  break L1;
                }
                stackOut_87_0 = 1;
                stackIn_88_0 = stackOut_87_0;
                break L0;
              }
            } else {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var3 = decompiledCaughtException;
            stackOut_89_0 = (RuntimeException) var3;
            stackOut_89_1 = new StringBuilder().append("km.FA(").append(param0).append(',');
            stackIn_92_0 = stackOut_89_0;
            stackIn_92_1 = stackOut_89_1;
            stackIn_90_0 = stackOut_89_0;
            stackIn_90_1 = stackOut_89_1;
            if (param1 == null) {
              stackOut_92_0 = (RuntimeException) (Object) stackIn_92_0;
              stackOut_92_1 = (StringBuilder) (Object) stackIn_92_1;
              stackOut_92_2 = "null";
              stackIn_93_0 = stackOut_92_0;
              stackIn_93_1 = stackOut_92_1;
              stackIn_93_2 = stackOut_92_2;
              break L19;
            } else {
              stackOut_90_0 = (RuntimeException) (Object) stackIn_90_0;
              stackOut_90_1 = (StringBuilder) (Object) stackIn_90_1;
              stackOut_90_2 = "{...}";
              stackIn_93_0 = stackOut_90_0;
              stackIn_93_1 = stackOut_90_1;
              stackIn_93_2 = stackOut_90_2;
              break L19;
            }
          }
          throw r.a((Throwable) (Object) stackIn_93_0, stackIn_93_2 + ')');
        }
        return stackIn_88_0 != 0;
    }

    final void a(int param0) {
        ln[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        ln var4 = null;
        int var5 = 0;
        int var6 = 0;
        Object stackIn_8_0 = null;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int[] stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_14_2 = 0;
        Object stackIn_19_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        int[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int[] stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        int stackOut_13_2 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        Object stackOut_18_0 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((km) this).field_R.length < ((km) this).field_P.field_g.field_e.length) {
                ((km) this).field_R = new fs[((km) this).field_P.field_g.field_e.length];
                ((km) this).field_C = new int[((km) this).field_P.field_g.field_e.length];
                ((km) this).field_l = new sd[((km) this).field_P.field_g.field_e.length];
                break L1;
              } else {
                break L1;
              }
            }
            var2 = ((km) this).field_P.field_g.field_e;
            var3 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var3 >= var2.length) {
                    break L4;
                  } else {
                    var4 = var2[var3];
                    var5 = var4.field_p;
                    ((km) this).field_R[var5] = var4.field_y;
                    stackOut_7_0 = this;
                    stackIn_19_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (var6 != 0) {
                      break L3;
                    } else {
                      L5: {
                        stackOut_8_0 = ((km) this).field_C;
                        stackOut_8_1 = var5;
                        stackIn_13_0 = stackOut_8_0;
                        stackIn_13_1 = stackOut_8_1;
                        stackIn_9_0 = stackOut_8_0;
                        stackIn_9_1 = stackOut_8_1;
                        if (var4.field_y != ((km) this).field_n) {
                          stackOut_13_0 = (int[]) (Object) stackIn_13_0;
                          stackOut_13_1 = stackIn_13_1;
                          stackOut_13_2 = var4.field_x;
                          stackIn_14_0 = stackOut_13_0;
                          stackIn_14_1 = stackOut_13_1;
                          stackIn_14_2 = stackOut_13_2;
                          break L5;
                        } else {
                          stackOut_9_0 = (int[]) (Object) stackIn_9_0;
                          stackOut_9_1 = stackIn_9_1;
                          stackIn_11_0 = stackOut_9_0;
                          stackIn_11_1 = stackOut_9_1;
                          stackOut_11_0 = (int[]) (Object) stackIn_11_0;
                          stackOut_11_1 = stackIn_11_1;
                          stackOut_11_2 = var4.field_J;
                          stackIn_14_0 = stackOut_11_0;
                          stackIn_14_1 = stackOut_11_1;
                          stackIn_14_2 = stackOut_11_2;
                          break L5;
                        }
                      }
                      stackIn_14_0[stackIn_14_1] = stackIn_14_2;
                      ((km) this).field_l[var5] = var4.field_R;
                      var3++;
                      if (var6 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                L6: {
                  if (param0 == 2) {
                    break L6;
                  } else {
                    ((km) this).field_l = null;
                    break L6;
                  }
                }
                stackOut_18_0 = this;
                stackIn_19_0 = stackOut_18_0;
                break L3;
              }
              ((km) this).field_z.a(((km) this).field_C, true, ((km) this).field_l, ((km) this).field_R, true);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2_ref, "km.A(" + param0 + ')');
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
              L3: {
                if (!((km) this).field_f) {
                  break L3;
                } else {
                  L4: {
                    if (-1 == ((km) this).field_k) {
                      break L4;
                    } else {
                      this.l(-113);
                      break L4;
                    }
                  }
                  L5: {
                    var2 = js.field_f;
                    var2.h(61, 255);
                    var2.c(((km) this).field_P.field_O, (byte) -93);
                    var2.e(11135, this.f(-41));
                    ((km) this).field_L = true;
                    if (((km) this).field_N > 1) {
                      ((km) this).field_N = ((km) this).field_N - 1;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  if (!ShatteredPlansClient.field_F) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              this.d((byte) -81);
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2_ref, "km.QA(" + param0 + ')');
        }
    }

    private final void k(int param0) {
        sl var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((km) this).field_L) {
              var3 = 82 / ((param0 - 61) / 51);
              var2 = js.field_f;
              var2.h(62, 255);
              var2.c(((km) this).field_P.field_O, (byte) -126);
              ((km) this).field_L = false;
              break L0;
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2_ref, "km.N(" + param0 + ')');
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
              L2: {
                if (((km) this).field_n == param0) {
                  break L2;
                } else {
                  if (param1 != ((km) this).field_n) {
                    break L1;
                  } else {
                    var4 = re.a(wf.field_h, 4371, new String[1]);
                    ((km) this).field_H.a((oh) (Object) new n(param0, (fs) null, var4), 0);
                    if (!ShatteredPlansClient.field_F) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              var4 = re.a(ud.field_b, 4371, new String[1]);
              ((km) this).field_H.a((oh) (Object) new n(param1, (fs) null, var4), 0);
              break L1;
            }
            L3: {
              if (null == ((km) this).field_s[param1.field_x]) {
                break L3;
              } else {
                ((km) this).field_s[param1.field_x].a(param0, 7686);
                break L3;
              }
            }
            L4: {
              if (param2) {
                break L4;
              } else {
                this.a(true, 25, (ln) null, (ln) null);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4_ref;
            stackOut_13_1 = new StringBuilder().append("km.P(");
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param1 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + ',' + param2 + ')');
        }
    }

    private final void e(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!((km) this).field_L) {
                break L1;
              } else {
                this.k(-92);
                break L1;
              }
            }
            L2: {
              if (param0 != ~((km) this).field_g) {
                break L2;
              } else {
                ((km) this).field_g = 250;
                break L2;
              }
            }
            ((km) this).field_k = 25;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "km.E(" + param0 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              ((km) this).field_P.c(0);
              boolean[][] discarded$12 = ((km) this).field_P.b(param2, 0);
              if (param0 > 89) {
                break L1;
              } else {
                ((km) this).field_n = null;
                break L1;
              }
            }
            this.b(param1, 123);
            ((km) this).field_z.field_d = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var4, "km.NA(" + param0 + ',' + param1 + ',' + param2 + ')');
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
        dc stackIn_11_0 = null;
        dc stackIn_13_0 = null;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        dc stackOut_10_0 = null;
        dc stackOut_12_0 = null;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = 406213746;
            var4 = -1 % ((param0 - 29) / 63);
            var3 = (qm) (Object) ((km) this).field_P.field_i.d(0);
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  L3: {
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
                      break L3;
                    } else {
                      stackOut_4_0 = stackIn_4_0;
                      stackOut_4_1 = stackIn_4_1;
                      stackOut_4_2 = 5;
                      stackIn_7_0 = stackOut_4_0;
                      stackIn_7_1 = stackOut_4_1;
                      stackIn_7_2 = stackOut_4_2;
                      break L3;
                    }
                  }
                  var2_int = stackIn_7_0 + stackIn_7_1 * stackIn_7_2;
                  var3 = (qm) (Object) ((km) this).field_P.field_i.a((byte) -71);
                  if (var7 == 0) {
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              var5 = (qa) (Object) ((km) this).field_P.field_q.d(0);
              L4: while (true) {
                L5: {
                  L6: {
                    if (null == var5) {
                      break L6;
                    } else {
                      var2_int = var2_int + (var5.field_u.field_p * (var5.field_v ^ 11) << 11);
                      stackOut_10_0 = ((km) this).field_P;
                      stackIn_13_0 = stackOut_10_0;
                      stackIn_11_0 = stackOut_10_0;
                      if (var7 != 0) {
                        break L5;
                      } else {
                        var5 = (qa) (Object) ((pf) (Object) stackIn_11_0.field_q).a((byte) -71);
                        if (var7 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  stackOut_12_0 = ((km) this).field_P;
                  stackIn_13_0 = stackOut_12_0;
                  break L5;
                }
                var6 = (mg) (Object) ((el) (Object) stackIn_13_0.field_p).a(true);
                L7: while (true) {
                  L8: {
                    L9: {
                      if (var6 == null) {
                        break L9;
                      } else {
                        stackOut_15_0 = var2_int + ((1 + var6.field_y.field_p) * (1 + (var6.field_B.field_p - -65536)) - -(var6.field_z * ((1 + var6.field_B.field_p) * (1 + var6.field_y.field_p))));
                        stackIn_18_0 = stackOut_15_0;
                        stackIn_16_0 = stackOut_15_0;
                        if (var7 != 0) {
                          break L8;
                        } else {
                          var2_int = stackIn_16_0;
                          var6 = (mg) (Object) ((km) this).field_P.field_p.a((byte) -68);
                          if (var7 == 0) {
                            continue L7;
                          } else {
                            break L9;
                          }
                        }
                      }
                    }
                    stackOut_17_0 = var2_int;
                    stackIn_18_0 = stackOut_17_0;
                    break L8;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "km.AA(" + param0 + ')');
        }
        return stackIn_18_0;
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
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
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
            var4_int = 30 % ((-1 - param2) / 62);
            L1: while (true) {
              stackOut_2_0 = -1;
              stackOut_2_1 = ~param1;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              L2: while (true) {
                L3: {
                  L4: {
                    if (stackIn_3_0 <= stackIn_3_1) {
                      break L4;
                    } else {
                      var5 = param0.j(-82);
                      param1--;
                      if (var10 != 0) {
                        break L3;
                      } else {
                        L5: {
                          L6: {
                            if (var5 == 0) {
                              break L6;
                            } else {
                              if (var5 != 1) {
                                break L5;
                              } else {
                                var6 = param0.j(-96);
                                var7 = param0.j(-120);
                                var8_ref_fs = ((km) this).field_P.field_v[var6];
                                var9 = ((km) this).field_P.field_v[var7];
                                var8_ref_fs.field_f[var7] = 3;
                                var8_ref_fs.field_h[var7] = true;
                                var9.field_f[var6] = 3;
                                var9.field_h[var6] = true;
                                var8_ref_fs.field_A = var8_ref_fs.field_A & ~(1 << var7);
                                var8_ref_fs.field_w = var8_ref_fs.field_w & ~(1 << var7);
                                var9.field_A = var9.field_A & ~(1 << var6);
                                var9.field_w = var9.field_w & ~(1 << var6);
                                this.a(var8_ref_fs, -27584, var9);
                                param1 -= 3;
                                if (var10 == 0) {
                                  break L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var6 = param0.j(-108);
                          var7 = ~((km) this).field_n.field_A & var6;
                          ((km) this).field_n.field_A = var6;
                          param1--;
                          if (var7 == 0) {
                            break L5;
                          } else {
                            var8 = 0;
                            L7: while (true) {
                              if (~var8 <= ~((km) this).field_P.field_r) {
                                break L5;
                              } else {
                                stackOut_15_0 = 0;
                                stackOut_15_1 = var7 & 1 << var8;
                                stackIn_3_0 = stackOut_15_0;
                                stackIn_3_1 = stackOut_15_1;
                                stackIn_16_0 = stackOut_15_0;
                                stackIn_16_1 = stackOut_15_1;
                                if (var10 != 0) {
                                  continue L2;
                                } else {
                                  L8: {
                                    if (stackIn_16_0 == stackIn_16_1) {
                                      break L8;
                                    } else {
                                      this.a(((km) this).field_P.field_v[var8], ((km) this).field_n, true);
                                      break L8;
                                    }
                                  }
                                  var8++;
                                  if (var10 == 0) {
                                    continue L7;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          }
                        }
                        if (var10 == 0) {
                          continue L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                  break L3;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var4;
            stackOut_22_1 = new StringBuilder().append("km.K(");
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L9;
            }
          }
          throw r.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(int param0, ln param1, int param2) {
        RuntimeException runtimeException = null;
        qm var4 = null;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        boolean stackOut_13_0 = false;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4 = (qm) (Object) ((km) this).field_P.field_i.d(param2 + param2);
            L1: while (true) {
              L2: {
                L3: {
                  if (null == var4) {
                    break L3;
                  } else {
                    stackOut_3_0 = param0;
                    stackIn_14_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 != var4.field_o) {
                          break L4;
                        } else {
                          var4.field_q = param1;
                          if (var5 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var4 = (qm) (Object) ((km) this).field_P.field_i.a((byte) -71);
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                L5: {
                  if (null != var4) {
                    break L5;
                  } else {
                    var4 = new qm(param0, ((km) this).field_n, param1);
                    break L5;
                  }
                }
                ((km) this).field_P.field_i.a((byte) -113, (oh) (Object) var4);
                stackOut_13_0 = ((km) this).field_f;
                stackIn_14_0 = stackOut_13_0 ? 1 : 0;
                break L2;
              }
              L6: {
                if (stackIn_14_0 == 0) {
                  break L6;
                } else {
                  ((km) this).field_ab.a((df) (Object) var4, 32);
                  this.e(param2);
                  break L6;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            runtimeException = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) runtimeException;
            stackOut_18_1 = new StringBuilder().append("km.R(").append(param0).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L7;
            }
          }
          throw r.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + ',' + param2 + ')');
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
        boolean stackIn_27_0 = false;
        Object stackIn_49_0 = null;
        boolean stackIn_51_0 = false;
        fs stackIn_73_0 = null;
        fs stackIn_93_0 = null;
        Object stackIn_94_0 = null;
        eg stackIn_108_0 = null;
        Object stackIn_116_0 = null;
        int stackIn_128_0 = 0;
        int stackIn_132_0 = 0;
        RuntimeException stackIn_160_0 = null;
        StringBuilder stackIn_160_1 = null;
        RuntimeException stackIn_162_0 = null;
        StringBuilder stackIn_162_1 = null;
        RuntimeException stackIn_163_0 = null;
        StringBuilder stackIn_163_1 = null;
        String stackIn_163_2 = null;
        boolean stackOut_26_0 = false;
        Object stackOut_48_0 = null;
        boolean stackOut_50_0 = false;
        fs stackOut_72_0 = null;
        fs stackOut_92_0 = null;
        Object stackOut_93_0 = null;
        eg stackOut_107_0 = null;
        oh stackOut_115_0 = null;
        int stackOut_127_0 = 0;
        int stackOut_129_0 = 0;
        int stackOut_131_0 = 0;
        RuntimeException stackOut_159_0 = null;
        StringBuilder stackOut_159_1 = null;
        RuntimeException stackOut_160_0 = null;
        StringBuilder stackOut_160_1 = null;
        String stackOut_160_2 = null;
        RuntimeException stackOut_162_0 = null;
        StringBuilder stackOut_162_1 = null;
        String stackOut_162_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = ShatteredPlansClient.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((km) this).field_R = null;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var3_array = new int[((km) this).field_P.field_r];
                        var4 = new int[((km) this).field_P.field_r];
                        var5 = new int[((km) this).field_P.field_r];
                        var6 = new int[((km) this).field_P.field_r];
                        var7 = new int[((km) this).field_P.field_r];
                        var8 = new int[((km) this).field_P.field_r];
                        var9 = new int[((km) this).field_P.field_r];
                        var10 = new int[((km) this).field_P.field_r];
                        var11_ref_ln__ = ((km) this).field_P.field_g.field_e;
                        var12 = 0;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (var12 >= var11_ref_ln__.length) {
                            statePc = 24;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var13 = var11_ref_ln__[var12];
                        if (var16 != 0) {
                            statePc = 127;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (null != var13.field_y) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var14_int = var13.field_y.field_x;
                        var6[var14_int] = var6[var14_int] + 1;
                        var3_array[var14_int] = var3_array[var14_int] + var13.field_x;
                        if (var13.field_G[0] >= 0) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (var16 == 0) {
                            statePc = 22;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        var15_int = 0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        if (4 <= var15_int) {
                            statePc = 22;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var5[var14_int] = var5[var14_int] + var13.field_G[var15_int];
                        var15_int++;
                        if (var16 != 0) {
                            statePc = 23;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        if (var16 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var12++;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (var16 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var11_ref_fs__ = ((km) this).field_P.field_v;
                        var12 = 0;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        if (var11_ref_fs__.length <= var12) {
                            statePc = 44;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        var13_ref = var11_ref_fs__[var12];
                        var14_int = var13_ref.field_x;
                        stackOut_26_0 = ((km) this).field_P.field_o.field_i;
                        stackIn_128_0 = stackOut_26_0 ? 1 : 0;
                        stackIn_27_0 = stackOut_26_0;
                        if (var16 != 0) {
                            statePc = 128;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        if (stackIn_27_0) {
                            statePc = 37;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        var15 = (sd) (Object) var13_ref.field_i.d(0);
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        if (var15 == null) {
                            statePc = 36;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        var4[var14_int] = var4[var14_int] + var15.field_r;
                        var15 = (sd) (Object) var13_ref.field_i.a((byte) -71);
                        if (var16 != 0) {
                            statePc = 43;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (var16 == 0) {
                            statePc = 31;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        if (var16 == 0) {
                            statePc = 42;
                        } else {
                            statePc = 37;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        if (null == var13_ref.field_m) {
                            statePc = 42;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var4[var14_int] = var13_ref.field_m.field_r;
                        statePc = 42;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        var12++;
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        if (var16 == 0) {
                            statePc = 25;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        if (((km) this).field_Q != null) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        statePc = 127;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var11_ref_oh = ((km) this).field_Q.field_a.d(0);
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        stackOut_48_0 = null;
                        stackIn_49_0 = stackOut_48_0;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (stackIn_49_0 == (Object) (Object) var11_ref_oh) {
                            statePc = 127;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        stackOut_50_0 = var11_ref_oh instanceof hj;
                        stackIn_128_0 = stackOut_50_0 ? 1 : 0;
                        stackIn_51_0 = stackOut_50_0;
                        if (var16 != 0) {
                            statePc = 128;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        if (!stackIn_51_0) {
                            statePc = 57;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        var12_ref_hj = (hj) (Object) var11_ref_oh;
                        if (var12_ref_hj.field_j == null) {
                            statePc = 57;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        var7[var12_ref_hj.field_j.field_x] = var7[var12_ref_hj.field_j.field_x] + var12_ref_hj.field_h;
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        if (!(var11_ref_oh instanceof eg)) {
                            statePc = 115;
                        } else {
                            statePc = 58;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        var12_ref_eg = (eg) (Object) var11_ref_oh;
                        var13_int = 0;
                        statePc = 59;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        if (((km) this).field_P.field_r <= var13_int) {
                            statePc = 64;
                        } else {
                            statePc = 60;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        var8[var13_int] = var8[var13_int] + var12_ref_eg.field_k[var13_int];
                        var13_int++;
                        if (var16 != 0) {
                            statePc = 84;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (var16 == 0) {
                            statePc = 59;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        if (var12_ref_eg.field_i != var12_ref_eg.field_w) {
                            statePc = 84;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (null == var12_ref_eg.field_i) {
                            statePc = 70;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var12_ref_eg.field_i.field_q.field_y = var12_ref_eg.field_i.field_q.field_y + 1;
                        statePc = 70;
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        var13_array = var12_ref_eg.field_h;
                        var14_int = 0;
                        statePc = 71;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        if (var14_int >= var13_array.length) {
                            statePc = 83;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var15_ref = var13_array[var14_int];
                        stackOut_72_0 = (fs) var15_ref;
                        stackIn_93_0 = stackOut_72_0;
                        stackIn_73_0 = stackOut_72_0;
                        if (var16 != 0) {
                            statePc = 93;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (stackIn_73_0 == null) {
                            statePc = 82;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        if (var15_ref != var12_ref_eg.field_w) {
                            statePc = 81;
                        } else {
                            statePc = 77;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 81: {
                    try {
                        var15_ref.field_q.field_q = var15_ref.field_q.field_q + 1;
                        statePc = 82;
                        continue stateLoop;
                    } catch (Throwable stateCaught_81) {
                        caughtException = stateCaught_81;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 82: {
                    try {
                        var14_int++;
                        if (var16 == 0) {
                            statePc = 71;
                        } else {
                            statePc = 83;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_82) {
                        caughtException = stateCaught_82;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 83: {
                    try {
                        statePc = 105;
                        continue stateLoop;
                    } catch (Throwable stateCaught_83) {
                        caughtException = stateCaught_83;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 84: {
                    try {
                        if (null == var12_ref_eg.field_w) {
                            statePc = 87;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_84) {
                        caughtException = stateCaught_84;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 85: {
                    try {
                        var12_ref_eg.field_w.field_q.field_a = var12_ref_eg.field_w.field_q.field_a + 1;
                        statePc = 87;
                        continue stateLoop;
                    } catch (Throwable stateCaught_85) {
                        caughtException = stateCaught_85;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 87: {
                    try {
                        if (null == var12_ref_eg.field_i) {
                            statePc = 90;
                        } else {
                            statePc = 88;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_87) {
                        caughtException = stateCaught_87;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 88: {
                    try {
                        var12_ref_eg.field_i.field_q.field_m = var12_ref_eg.field_i.field_q.field_m + 1;
                        statePc = 90;
                        continue stateLoop;
                    } catch (Throwable stateCaught_88) {
                        caughtException = stateCaught_88;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 90: {
                    try {
                        var13_array = var12_ref_eg.field_h;
                        var14_int = 0;
                        statePc = 91;
                        continue stateLoop;
                    } catch (Throwable stateCaught_90) {
                        caughtException = stateCaught_90;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 91: {
                    try {
                        if (~var13_array.length >= ~var14_int) {
                            statePc = 105;
                        } else {
                            statePc = 92;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_91) {
                        caughtException = stateCaught_91;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 92: {
                    try {
                        stackOut_92_0 = var13_array[var14_int];
                        stackIn_93_0 = stackOut_92_0;
                        statePc = 93;
                        continue stateLoop;
                    } catch (Throwable stateCaught_92) {
                        caughtException = stateCaught_92;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 93: {
                    try {
                        var15_ref = stackIn_93_0;
                        stackOut_93_0 = null;
                        stackIn_49_0 = stackOut_93_0;
                        stackIn_94_0 = stackOut_93_0;
                        if (var16 != 0) {
                            statePc = 49;
                        } else {
                            statePc = 94;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_93) {
                        caughtException = stateCaught_93;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 94: {
                    try {
                        if (stackIn_94_0 == (Object) (Object) var15_ref) {
                            statePc = 104;
                        } else {
                            statePc = 95;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_94) {
                        caughtException = stateCaught_94;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 95: {
                    try {
                        if (var12_ref_eg.field_w == var15_ref) {
                            statePc = 104;
                        } else {
                            statePc = 96;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_95) {
                        caughtException = stateCaught_95;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 96: {
                    try {
                        statePc = 98;
                        continue stateLoop;
                    } catch (Throwable stateCaught_96) {
                        caughtException = stateCaught_96;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 98: {
                    try {
                        if (var12_ref_eg.field_i != var15_ref) {
                            statePc = 103;
                        } else {
                            statePc = 99;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_98) {
                        caughtException = stateCaught_98;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 99: {
                    try {
                        statePc = 101;
                        continue stateLoop;
                    } catch (Throwable stateCaught_99) {
                        caughtException = stateCaught_99;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 101: {
                    try {
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_101) {
                        caughtException = stateCaught_101;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 103: {
                    try {
                        var15_ref.field_q.field_q = var15_ref.field_q.field_q + 1;
                        statePc = 104;
                        continue stateLoop;
                    } catch (Throwable stateCaught_103) {
                        caughtException = stateCaught_103;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 104: {
                    try {
                        var14_int++;
                        if (var16 == 0) {
                            statePc = 91;
                        } else {
                            statePc = 105;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_104) {
                        caughtException = stateCaught_104;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 105: {
                    try {
                        var13_ref3 = (ne) (Object) var12_ref_eg.field_v.d(0);
                        statePc = 106;
                        continue stateLoop;
                    } catch (Throwable stateCaught_105) {
                        caughtException = stateCaught_105;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 106: {
                    try {
                        if (var13_ref3 == null) {
                            statePc = 115;
                        } else {
                            statePc = 107;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_106) {
                        caughtException = stateCaught_106;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 107: {
                    try {
                        stackOut_107_0 = (eg) var12_ref_eg;
                        stackIn_116_0 = (Object) (Object) stackOut_107_0;
                        stackIn_108_0 = stackOut_107_0;
                        if (var16 != 0) {
                            statePc = 116;
                        } else {
                            statePc = 108;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_107) {
                        caughtException = stateCaught_107;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 108: {
                    try {
                        if (stackIn_108_0.field_w != var13_ref3.field_h) {
                            statePc = 113;
                        } else {
                            statePc = 109;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_108) {
                        caughtException = stateCaught_108;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 109: {
                    try {
                        statePc = 111;
                        continue stateLoop;
                    } catch (Throwable stateCaught_109) {
                        caughtException = stateCaught_109;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 111: {
                    try {
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_111) {
                        caughtException = stateCaught_111;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 113: {
                    try {
                        var10[var13_ref3.field_h.field_x] = var10[var13_ref3.field_h.field_x] + var13_ref3.field_i;
                        statePc = 114;
                        continue stateLoop;
                    } catch (Throwable stateCaught_113) {
                        caughtException = stateCaught_113;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 114: {
                    try {
                        var13_ref3 = (ne) (Object) var12_ref_eg.field_v.a((byte) -71);
                        if (var16 == 0) {
                            statePc = 106;
                        } else {
                            statePc = 115;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_114) {
                        caughtException = stateCaught_114;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 115: {
                    try {
                        stackOut_115_0 = (oh) var11_ref_oh;
                        stackIn_116_0 = (Object) (Object) stackOut_115_0;
                        statePc = 116;
                        continue stateLoop;
                    } catch (Throwable stateCaught_115) {
                        caughtException = stateCaught_115;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 116: {
                    try {
                        if (stackIn_116_0 instanceof qi) {
                            statePc = 119;
                        } else {
                            statePc = 117;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_116) {
                        caughtException = stateCaught_116;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 117: {
                    try {
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_117) {
                        caughtException = stateCaught_117;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 119: {
                    try {
                        var12_ref_qi = (qi) (Object) var11_ref_oh;
                        var8[var12_ref_qi.field_k.field_x] = var8[var12_ref_qi.field_k.field_x] + var12_ref_qi.field_i;
                        var12_ref_qi.field_k.field_q.field_s = var12_ref_qi.field_k.field_q.field_s + 1;
                        statePc = 120;
                        continue stateLoop;
                    } catch (Throwable stateCaught_119) {
                        caughtException = stateCaught_119;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 120: {
                    try {
                        if (var11_ref_oh instanceof qm) {
                            statePc = 123;
                        } else {
                            statePc = 121;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_120) {
                        caughtException = stateCaught_120;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 121: {
                    try {
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_121) {
                        caughtException = stateCaught_121;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 123: {
                    try {
                        var12_ref_qm = (qm) (Object) var11_ref_oh;
                        var12_ref_qm.field_p.field_q.field_s = var12_ref_qm.field_p.field_q.field_s + 1;
                        statePc = 124;
                        continue stateLoop;
                    } catch (Throwable stateCaught_123) {
                        caughtException = stateCaught_123;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 124: {
                    try {
                        if (!(var11_ref_oh instanceof mg)) {
                            statePc = 126;
                        } else {
                            statePc = 125;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_124) {
                        caughtException = stateCaught_124;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 125: {
                    try {
                        var12_ref_mg = (mg) (Object) var11_ref_oh;
                        var13_ref2 = var12_ref_mg.field_G.field_q;
                        var13_ref2.field_t = var13_ref2.field_t + 1;
                        var13_ref2.field_i = var13_ref2.field_i + var12_ref_mg.field_z;
                        var9[var12_ref_mg.field_G.field_x] = var9[var12_ref_mg.field_G.field_x] + var12_ref_mg.field_z;
                        statePc = 126;
                        continue stateLoop;
                    } catch (Throwable stateCaught_125) {
                        caughtException = stateCaught_125;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 126: {
                    try {
                        var11_ref_oh = ((km) this).field_Q.field_a.a((byte) -71);
                        if (var16 == 0) {
                            statePc = 48;
                        } else {
                            statePc = 127;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_126) {
                        caughtException = stateCaught_126;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 127: {
                    try {
                        stackOut_127_0 = ~((km) this).field_P.field_O;
                        stackIn_128_0 = stackOut_127_0;
                        statePc = 128;
                        continue stateLoop;
                    } catch (Throwable stateCaught_127) {
                        caughtException = stateCaught_127;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 128: {
                    try {
                        if (stackIn_128_0 == 0) {
                            statePc = 131;
                        } else {
                            statePc = 129;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_128) {
                        caughtException = stateCaught_128;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 129: {
                    try {
                        stackOut_129_0 = ((km) this).field_P.field_O % 100;
                        stackIn_132_0 = stackOut_129_0;
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_129) {
                        caughtException = stateCaught_129;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 131: {
                    try {
                        stackOut_131_0 = 0;
                        stackIn_132_0 = stackOut_131_0;
                        statePc = 132;
                        continue stateLoop;
                    } catch (Throwable stateCaught_131) {
                        caughtException = stateCaught_131;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 132: {
                    try {
                        var11 = stackIn_132_0;
                        var12 = 0;
                        statePc = 133;
                        continue stateLoop;
                    } catch (Throwable stateCaught_132) {
                        caughtException = stateCaught_132;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 133: {
                    try {
                        if (((km) this).field_P.field_r <= var12) {
                            statePc = 164;
                        } else {
                            statePc = 134;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_133) {
                        caughtException = stateCaught_133;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 134: {
                    try {
                        var13_ref = ((km) this).field_P.field_v[var12];
                        var14 = var13_ref.field_q;
                        var14.field_g[var11] = var3_array[var12];
                        var14.field_f[var11] = var4[var12];
                        var14.field_h[var11] = var6[var12];
                        if (var16 != 0) {
                            statePc = 164;
                        } else {
                            statePc = 135;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_134) {
                        caughtException = stateCaught_134;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 135: {
                    try {
                        if (~var3_array[var12] < ~var14.field_A) {
                            statePc = 140;
                        } else {
                            statePc = 136;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_135) {
                        caughtException = stateCaught_135;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 136: {
                    try {
                        statePc = 138;
                        continue stateLoop;
                    } catch (Throwable stateCaught_136) {
                        caughtException = stateCaught_136;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 138: {
                    try {
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_138) {
                        caughtException = stateCaught_138;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 140: {
                    try {
                        var14.field_A = var3_array[var12];
                        statePc = 141;
                        continue stateLoop;
                    } catch (Throwable stateCaught_140) {
                        caughtException = stateCaught_140;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 141: {
                    try {
                        var14.field_v = var14.field_v + var8[var12];
                        if (~var4[var12] < ~var14.field_x) {
                            statePc = 144;
                        } else {
                            statePc = 142;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_141) {
                        caughtException = stateCaught_141;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 142: {
                    try {
                        statePc = 145;
                        continue stateLoop;
                    } catch (Throwable stateCaught_142) {
                        caughtException = stateCaught_142;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 144: {
                    try {
                        var14.field_x = var4[var12];
                        statePc = 145;
                        continue stateLoop;
                    } catch (Throwable stateCaught_144) {
                        caughtException = stateCaught_144;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 145: {
                    try {
                        var14.field_o = var14.field_o + var7[var12];
                        var14.field_r = var14.field_e + (var14.field_o - var3_array[var12]);
                        if (var13_ref.field_i.g(115)) {
                            statePc = 157;
                        } else {
                            statePc = 146;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_145) {
                        caughtException = stateCaught_145;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 146: {
                    try {
                        if (param1 == null) {
                            statePc = 156;
                        } else {
                            statePc = 147;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_146) {
                        caughtException = stateCaught_146;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 147: {
                    try {
                        statePc = 149;
                        continue stateLoop;
                    } catch (Throwable stateCaught_147) {
                        caughtException = stateCaught_147;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 149: {
                    try {
                        if (var5[var12] > 0) {
                            statePc = 154;
                        } else {
                            statePc = 150;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_149) {
                        caughtException = stateCaught_149;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 150: {
                    try {
                        statePc = 152;
                        continue stateLoop;
                    } catch (Throwable stateCaught_150) {
                        caughtException = stateCaught_150;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 152: {
                    try {
                        statePc = 155;
                        continue stateLoop;
                    } catch (Throwable stateCaught_152) {
                        caughtException = stateCaught_152;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 154: {
                    try {
                        var14.field_u = var14.field_u + (var4[var12] * 800 - -var5[var12]) / (var5[var12] * 2);
                        statePc = 155;
                        continue stateLoop;
                    } catch (Throwable stateCaught_154) {
                        caughtException = stateCaught_154;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 155: {
                    try {
                        var14.field_z = var14.field_z + (param1[var12] + 200 * var10[var12]) / (2 * param1[var12]);
                        var14.field_w = var14.field_w + (param1[var12] + 200 * var9[var12]) / (2 * param1[var12]);
                        statePc = 156;
                        continue stateLoop;
                    } catch (Throwable stateCaught_155) {
                        caughtException = stateCaught_155;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 156: {
                    try {
                        var14.field_l = ((km) this).field_P.field_O + -((km) this).field_q;
                        statePc = 157;
                        continue stateLoop;
                    } catch (Throwable stateCaught_156) {
                        caughtException = stateCaught_156;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 157: {
                    try {
                        var12++;
                        if (var16 == 0) {
                            statePc = 133;
                        } else {
                            statePc = 164;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_157) {
                        caughtException = stateCaught_157;
                        statePc = 159;
                        continue stateLoop;
                    }
                }
                case 159: {
                    var3 = (RuntimeException) (Object) caughtException;
                    stackOut_159_0 = (RuntimeException) var3;
                    stackOut_159_1 = new StringBuilder().append("km.SA(").append(param0).append(',');
                    stackIn_162_0 = stackOut_159_0;
                    stackIn_162_1 = stackOut_159_1;
                    stackIn_160_0 = stackOut_159_0;
                    stackIn_160_1 = stackOut_159_1;
                    if (param1 == null) {
                        statePc = 162;
                    } else {
                        statePc = 160;
                    }
                    continue stateLoop;
                }
                case 160: {
                    stackOut_160_0 = (RuntimeException) (Object) stackIn_160_0;
                    stackOut_160_1 = (StringBuilder) (Object) stackIn_160_1;
                    stackOut_160_2 = "{...}";
                    stackIn_163_0 = stackOut_160_0;
                    stackIn_163_1 = stackOut_160_1;
                    stackIn_163_2 = stackOut_160_2;
                    statePc = 163;
                    continue stateLoop;
                }
                case 162: {
                    stackOut_162_0 = (RuntimeException) (Object) stackIn_162_0;
                    stackOut_162_1 = (StringBuilder) (Object) stackIn_162_1;
                    stackOut_162_2 = "null";
                    stackIn_163_0 = stackOut_162_0;
                    stackIn_163_1 = stackOut_162_1;
                    stackIn_163_2 = stackOut_162_2;
                    statePc = 163;
                    continue stateLoop;
                }
                case 163: {
                    throw r.a((Throwable) (Object) stackIn_163_0, stackIn_163_2 + ')');
                }
                case 164: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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
                field_A = null;
                break L1;
              }
            }
            L2: {
              if (((km) this).field_f) {
                if (sm.field_e) {
                  ((km) this).a(param2, (byte) 50);
                  break L2;
                } else {
                  throw new RuntimeException();
                }
              } else {
                break L2;
              }
            }
            if (param2 == param1) {
              return;
            } else {
              if (0 == (param1.field_w & 1 << param2.field_x)) {
                L3: {
                  L4: {
                    param1.field_w = param1.field_w | 1 << param2.field_x;
                    param2.field_A = param2.field_A | 1 << param1.field_x;
                    if ((1 << param2.field_x & param1.field_A) == 0) {
                      break L4;
                    } else {
                      L5: {
                        if (null != ((km) this).field_s[param2.field_x]) {
                          ((km) this).field_s[param2.field_x].a(param1, (byte) -42);
                          break L5;
                        } else {
                          break L5;
                        }
                      }
                      param1.field_f[param2.field_x] = 3;
                      param1.field_h[param2.field_x] = true;
                      param2.field_f[param1.field_x] = 3;
                      param2.field_h[param1.field_x] = true;
                      param1.field_A = param1.field_A & ~(1 << param2.field_x);
                      param1.field_w = param1.field_w & ~(1 << param2.field_x);
                      param2.field_A = param2.field_A & ~(1 << param1.field_x);
                      param2.field_w = param2.field_w & ~(1 << param1.field_x);
                      this.a(param2, param0 ^ 27521, param1);
                      if (!ShatteredPlansClient.field_F) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  if (((km) this).field_s[param2.field_x] != null) {
                    ((km) this).field_s[param2.field_x].a(param1, param0 ^ -7737);
                    break L3;
                  } else {
                    break L3;
                  }
                }
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var4;
            stackOut_31_1 = new StringBuilder().append("km.Q(").append(param0).append(',');
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L6;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L6;
            }
          }
          L7: {
            stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(',');
            stackIn_38_0 = stackOut_35_0;
            stackIn_38_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param2 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L7;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_39_0 = stackOut_36_0;
              stackIn_39_1 = stackOut_36_1;
              stackIn_39_2 = stackOut_36_2;
              break L7;
            }
          }
          throw r.a((Throwable) (Object) stackIn_39_0, stackIn_39_2 + ')');
        }
    }

    final void c(boolean param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!((km) this).field_f) {
              throw new IllegalStateException();
            } else {
              L1: {
                if (!param0) {
                  break L1;
                } else {
                  ((km) this).c(false);
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
          throw r.a((Throwable) (Object) var2, "km.LA(" + param0 + ')');
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
        Object stackIn_4_0 = null;
        Object stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        Object stackOut_17_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            ((km) this).field_P.a(-5, param1);
            var3_ref = new ka(((km) this).field_P, param1, (mn) this, 2);
            var4 = new ka[((km) this).field_s.length + 1];
            var5 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (var5 >= ((km) this).field_s.length) {
                    break L3;
                  } else {
                    stackOut_3_0 = this;
                    stackIn_18_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var8 != 0) {
                      break L2;
                    } else {
                      L4: {
                        L5: {
                          if (((km) this).field_s[var5] != null) {
                            var4[var5] = new ka(((km) this).field_P, ((km) this).field_P.field_v[var5], (mn) this, 2);
                            var6 = (ka) (Object) ((km) this).field_s[var5];
                            var7 = 0;
                            L6: while (true) {
                              if (~var6.field_i.length >= ~var7) {
                                break L5;
                              } else {
                                var4[var5].field_i[var7] = var6.field_i[var7];
                                var7++;
                                if (var8 != 0) {
                                  break L4;
                                } else {
                                  if (var8 == 0) {
                                    continue L6;
                                  } else {
                                    break L5;
                                  }
                                }
                              }
                            }
                          } else {
                            break L5;
                          }
                        }
                        var5++;
                        break L4;
                      }
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var4[param1.field_x] = new ka(((km) this).field_P, param1, (mn) this, param0);
                var4[var5] = var3_ref;
                stackOut_17_0 = this;
                stackIn_18_0 = stackOut_17_0;
                break L2;
              }
              ((km) this).field_s = (uj[]) (Object) var4;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("km.O(").append(param0).append(',');
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L7;
            }
          }
          throw r.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
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
        Object stackIn_54_0 = null;
        Object stackIn_61_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        boolean stackOut_11_0 = false;
        boolean stackOut_5_0 = false;
        Object stackOut_53_0 = null;
        Object stackOut_60_0 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!((km) this).field_f) {
                break L1;
              } else {
                L2: {
                  if (0 > ((km) this).field_h) {
                    L3: {
                      if (oq.field_j == 13) {
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
                  return;
                } else {
                  break L1;
                }
              }
            }
            if (13 == oq.field_j) {
              L4: {
                var2_int = 1;
                if (((km) this).field_f) {
                  L5: {
                    if (((km) this).field_h >= 0) {
                      break L5;
                    } else {
                      var2_int = 4;
                      if (var8 == 0) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (!((km) this).field_b) {
                      break L6;
                    } else {
                      var2_int = 2;
                      if (var8 == 0) {
                        break L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var2_int = 3;
                  break L4;
                } else {
                  break L4;
                }
              }
              var3_int = var2_int;
              ta.a(0, var3_int, (byte) 96, false);
              return;
            } else {
              if (param0 <= -80) {
                L7: {
                  ((km) this).field_Y.h(-1);
                  if (!se.field_g) {
                    break L7;
                  } else {
                    if (((km) this).field_f) {
                      break L7;
                    } else {
                      L8: {
                        L9: {
                          if (!di.field_p[86]) {
                            break L9;
                          } else {
                            if (di.field_p[35]) {
                              break L8;
                            } else {
                              break L9;
                            }
                          }
                        }
                        if (!di.field_p[86]) {
                          break L7;
                        } else {
                          if (di.field_p[67]) {
                            var2_array = ((km) this).field_P.field_v;
                            var3_int = 0;
                            L10: while (true) {
                              L11: {
                                L12: {
                                  if (~var2_array.length >= ~var3_int) {
                                    break L12;
                                  } else {
                                    var4 = var2_array[var3_int];
                                    stackOut_53_0 = this;
                                    stackIn_61_0 = stackOut_53_0;
                                    stackIn_54_0 = stackOut_53_0;
                                    if (var8 != 0) {
                                      break L11;
                                    } else {
                                      L13: {
                                        if (((km) this).field_n == var4) {
                                          break L13;
                                        } else {
                                          this.a((byte) -66, var4);
                                          break L13;
                                        }
                                      }
                                      var3_int++;
                                      if (var8 == 0) {
                                        continue L10;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                }
                                stackOut_60_0 = this;
                                stackIn_61_0 = stackOut_60_0;
                                break L11;
                              }
                              ((km) this).m(126);
                              if (var8 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          } else {
                            break L7;
                          }
                        }
                      }
                      this.a((byte) -2, ((km) this).field_n);
                      ((km) this).m(123);
                      break L7;
                    }
                  }
                }
                L14: {
                  if (!se.field_g) {
                    break L14;
                  } else {
                    if (!((km) this).field_f) {
                      break L14;
                    } else {
                      if (null == ((km) this).field_n) {
                        break L14;
                      } else {
                        if (!di.field_p[82]) {
                          break L14;
                        } else {
                          if (!di.field_p[81]) {
                            break L14;
                          } else {
                            if (oq.field_j != 16) {
                              break L14;
                            } else {
                              sm.field_e = true;
                              em.a(mq.c((byte) 73), 1);
                              ((km) this).field_s[((km) this).field_h] = (uj) (Object) new hi(((km) this).field_n, ((km) this).field_P, (mn) this);
                              var2_ref = (mg) (Object) ((km) this).field_P.field_p.a(true);
                              L15: while (true) {
                                L16: {
                                  if (null == var2_ref) {
                                    break L16;
                                  } else {
                                    this.a(var2_ref, -var2_ref.field_z, 10755);
                                    var2_ref = (mg) (Object) ((km) this).field_P.field_p.a((byte) -68);
                                    if (var8 != 0) {
                                      break L14;
                                    } else {
                                      if (var8 == 0) {
                                        continue L15;
                                      } else {
                                        break L16;
                                      }
                                    }
                                  }
                                }
                                var3 = (qa) (Object) ((km) this).field_P.field_q.d(0);
                                L17: while (true) {
                                  L18: {
                                    if (null == var3) {
                                      break L18;
                                    } else {
                                      var3.field_u.field_J = var3.field_u.field_J - var3.field_v;
                                      ((km) this).field_C[var3.field_u.field_p] = ((km) this).field_C[var3.field_u.field_p] - var3.field_v;
                                      var3.field_v = 0;
                                      var3.b((byte) -74);
                                      ((km) this).field_o.a((df) (Object) var3, 32);
                                      var3 = (qa) (Object) ((km) this).field_P.field_q.a((byte) -71);
                                      if (var8 != 0) {
                                        break L14;
                                      } else {
                                        if (var8 == 0) {
                                          continue L17;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                  }
                                  var4_ref = (qm) (Object) ((km) this).field_P.field_i.d(0);
                                  L19: while (true) {
                                    L20: {
                                      L21: {
                                        if (var4_ref == null) {
                                          break L21;
                                        } else {
                                          var4_ref.field_q = null;
                                          var4_ref.field_r = null;
                                          ((km) this).field_ab.a((df) (Object) var4_ref, 32);
                                          var4_ref.b((byte) -71);
                                          var4_ref = (qm) (Object) ((km) this).field_P.field_i.a((byte) -71);
                                          if (var8 != 0) {
                                            break L20;
                                          } else {
                                            if (var8 == 0) {
                                              continue L19;
                                            } else {
                                              break L21;
                                            }
                                          }
                                        }
                                      }
                                      this.e(0);
                                      ((km) this).field_s[((km) this).field_h].b((byte) -98);
                                      this.a(((km) this).field_n, -122);
                                      break L20;
                                    }
                                    var5 = ((km) this).field_P.field_g.field_e;
                                    var6 = 0;
                                    L22: while (true) {
                                      L23: {
                                        L24: {
                                          if (~var6 <= ~var5.length) {
                                            break L24;
                                          } else {
                                            var7 = var5[var6];
                                            fl.a(var7, (byte) 96);
                                            kr.a((byte) -99, var7);
                                            var6++;
                                            if (var8 != 0) {
                                              break L23;
                                            } else {
                                              if (var8 == 0) {
                                                continue L22;
                                              } else {
                                                break L24;
                                              }
                                            }
                                          }
                                        }
                                        var2_ref = (mg) (Object) ((km) this).field_P.field_p.a(true);
                                        break L23;
                                      }
                                      L25: while (true) {
                                        L26: {
                                          L27: {
                                            if (var2_ref == null) {
                                              break L27;
                                            } else {
                                              ((km) this).field_v.a((byte) 9, (cn) (Object) var2_ref);
                                              var2_ref = (mg) (Object) ((km) this).field_P.field_p.a((byte) -68);
                                              if (var8 != 0) {
                                                break L26;
                                              } else {
                                                if (var8 == 0) {
                                                  continue L25;
                                                } else {
                                                  break L27;
                                                }
                                              }
                                            }
                                          }
                                          var3 = (qa) (Object) ((km) this).field_P.field_q.d(0);
                                          break L26;
                                        }
                                        L28: while (true) {
                                          L29: {
                                            L30: {
                                              if (var3 == null) {
                                                break L30;
                                              } else {
                                                ((km) this).field_o.a((df) (Object) var3, 32);
                                                var3 = (qa) (Object) ((km) this).field_P.field_q.a((byte) -71);
                                                if (var8 != 0) {
                                                  break L29;
                                                } else {
                                                  if (var8 == 0) {
                                                    continue L28;
                                                  } else {
                                                    break L30;
                                                  }
                                                }
                                              }
                                            }
                                            var4_ref = (qm) (Object) ((km) this).field_P.field_i.d(0);
                                            break L29;
                                          }
                                          L31: while (true) {
                                            L32: {
                                              if (null == var4_ref) {
                                                break L32;
                                              } else {
                                                ((km) this).field_ab.a((df) (Object) var4_ref, 32);
                                                var4_ref = (qm) (Object) ((km) this).field_P.field_i.a((byte) -71);
                                                if (var8 != 0) {
                                                  break L14;
                                                } else {
                                                  if (var8 == 0) {
                                                    continue L31;
                                                  } else {
                                                    break L32;
                                                  }
                                                }
                                              }
                                            }
                                            this.e(0);
                                            break L14;
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
                break L0;
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "km.G(" + param0 + ')');
        }
    }

    private final void a(int param0, byte param1, int param2) {
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
        int stackIn_132_0 = 0;
        fs stackIn_135_0 = null;
        fs stackIn_143_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_32_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_46_0 = 0;
        int stackOut_44_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_129_0 = 0;
        fs stackOut_134_0 = null;
        fs stackOut_142_0 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            ((km) this).field_z.a(((km) this).field_m, 0, param2, param0);
            if (((km) this).field_b) {
              if (param1 <= -66) {
                L1: {
                  if (null == ((km) this).field_z.field_p) {
                    break L1;
                  } else {
                    L2: {
                      if (((km) this).field_m == 2) {
                        break L2;
                      } else {
                        L3: {
                          if (((km) this).field_m == 0) {
                            break L3;
                          } else {
                            L4: {
                              if (((km) this).field_m != 1) {
                                break L4;
                              } else {
                                L5: {
                                  L6: {
                                    if (((km) this).field_K.b(((km) this).field_z.field_p, (byte) 10)) {
                                      break L6;
                                    } else {
                                      if (((km) this).field_K == ((km) this).field_z.field_p) {
                                        break L5;
                                      } else {
                                        if (((km) this).field_K.field_R != ((km) this).field_z.field_p.field_R) {
                                          break L5;
                                        } else {
                                          if (((km) this).field_P.a(((km) this).field_K, ((km) this).field_z.field_p, -1)) {
                                            break L6;
                                          } else {
                                            break L5;
                                          }
                                        }
                                      }
                                    }
                                  }
                                  L7: {
                                    ((km) this).field_z.e(-18641);
                                    var4_int = -((km) this).field_K.field_N + ((km) this).field_K.field_J;
                                    if (0 < var4_int) {
                                      stackOut_32_0 = (1 + var4_int) / 2;
                                      stackIn_33_0 = stackOut_32_0;
                                      break L7;
                                    } else {
                                      stackOut_30_0 = 1;
                                      stackIn_33_0 = stackOut_30_0;
                                      break L7;
                                    }
                                  }
                                  L8: {
                                    L9: {
                                      var5_int = stackIn_33_0;
                                      var6 = this.a((byte) 105);
                                      if (var6 != 81) {
                                        break L9;
                                      } else {
                                        var5_int = 1;
                                        if (var8 == 0) {
                                          break L8;
                                        } else {
                                          break L9;
                                        }
                                      }
                                    }
                                    L10: {
                                      if (var6 == 86) {
                                        break L10;
                                      } else {
                                        if (82 == var6) {
                                          L11: {
                                            if (var4_int > 0) {
                                              stackOut_46_0 = var4_int;
                                              stackIn_47_0 = stackOut_46_0;
                                              break L11;
                                            } else {
                                              stackOut_44_0 = ((km) this).field_K.field_J;
                                              stackIn_47_0 = stackOut_44_0;
                                              break L11;
                                            }
                                          }
                                          var5_int = stackIn_47_0;
                                          if (var8 == 0) {
                                            break L8;
                                          } else {
                                            break L10;
                                          }
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    var5_int = 5;
                                    break L8;
                                  }
                                  L12: {
                                    if (!((km) this).field_P.field_o.field_e) {
                                      stackOut_52_0 = ((km) this).field_K.field_N;
                                      stackIn_53_0 = stackOut_52_0;
                                      break L12;
                                    } else {
                                      stackOut_50_0 = 0;
                                      stackIn_53_0 = stackOut_50_0;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    var7_int = stackIn_53_0;
                                    if (var5_int > ((km) this).field_K.field_J - var7_int) {
                                      var5_int = ((km) this).field_K.field_J + -var7_int;
                                      break L13;
                                    } else {
                                      break L13;
                                    }
                                  }
                                  L14: {
                                    if (var5_int <= 0) {
                                      break L14;
                                    } else {
                                      L15: {
                                        this.a(false, var5_int, ((km) this).field_z.field_p, ((km) this).field_K);
                                        if (((km) this).field_n == ((km) this).field_z.field_p.field_y) {
                                          break L15;
                                        } else {
                                          L16: {
                                            if (null != ((km) this).field_z.field_p.field_y) {
                                              break L16;
                                            } else {
                                              if (((km) this).field_z.field_p.field_x == 0) {
                                                break L15;
                                              } else {
                                                break L16;
                                              }
                                            }
                                          }
                                          gm discarded$3 = qk.a(jj.field_l, 78);
                                          if (var8 == 0) {
                                            break L14;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                      gm discarded$4 = qk.a(hs.field_l, 89);
                                      break L14;
                                    }
                                  }
                                  ((km) this).a(2);
                                  break L5;
                                }
                                ((km) this).field_Y.a(-125, 0);
                                if (var8 == 0) {
                                  break L1;
                                } else {
                                  break L4;
                                }
                              }
                            }
                            L17: {
                              if (((km) this).field_m == 3) {
                                break L17;
                              } else {
                                L18: {
                                  if (((km) this).field_m != 4) {
                                    break L18;
                                  } else {
                                    if (((km) this).field_z.field_p.field_y != ((km) this).field_n) {
                                      break L1;
                                    } else {
                                      if (((km) this).field_z.field_p.field_L != 0) {
                                        break L1;
                                      } else {
                                        ((km) this).field_z.e(-18641);
                                        ((km) this).a(2);
                                        this.a(1, ((km) this).field_z.field_p, 0);
                                        ((km) this).field_Y.a(-122, 0);
                                        ((km) this).field_Y.b(1, 2);
                                        if (var8 == 0) {
                                          break L1;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                  }
                                }
                                L19: {
                                  if (5 == ((km) this).field_m) {
                                    break L19;
                                  } else {
                                    L20: {
                                      if (((km) this).field_m == 6) {
                                        break L20;
                                      } else {
                                        if (7 == ((km) this).field_m) {
                                          if (((km) this).field_K.b(((km) this).field_z.field_p, (byte) 10)) {
                                            break L1;
                                          } else {
                                            if (((km) this).field_K == ((km) this).field_z.field_p) {
                                              break L1;
                                            } else {
                                              ((km) this).field_z.e(-18641);
                                              ((km) this).a(2);
                                              this.a(41, ((km) this).field_z.field_p, ((km) this).field_K, 3);
                                              ((km) this).field_Y.a(-117, 0);
                                              ((km) this).field_Y.b(3, 2);
                                              if (var8 == 0) {
                                                break L1;
                                              } else {
                                                break L20;
                                              }
                                            }
                                          }
                                        } else {
                                          break L1;
                                        }
                                      }
                                    }
                                    if (((km) this).field_z.field_p.field_y == ((km) this).field_n) {
                                      ((km) this).field_z.e(-18641);
                                      ((km) this).a(2);
                                      ((km) this).field_K = ((km) this).field_z.field_p;
                                      ((km) this).field_Y.a(-84, 7);
                                      var4_array = ((km) this).field_P.field_g.field_e;
                                      var5_int = 0;
                                      L21: while (true) {
                                        L22: {
                                          if (var5_int >= var4_array.length) {
                                            break L22;
                                          } else {
                                            var6_ref_ln = var4_array[var5_int];
                                            if (var8 != 0) {
                                              break L1;
                                            } else {
                                              L23: {
                                                if (((km) this).field_z.field_p.b(var6_ref_ln, (byte) 10)) {
                                                  break L23;
                                                } else {
                                                  if (((km) this).field_z.field_p != var6_ref_ln) {
                                                    ((km) this).field_z.field_z[var6_ref_ln.field_p] = 2;
                                                    break L23;
                                                  } else {
                                                    break L23;
                                                  }
                                                }
                                              }
                                              var5_int++;
                                              if (var8 == 0) {
                                                continue L21;
                                              } else {
                                                break L22;
                                              }
                                            }
                                          }
                                        }
                                        if (var8 == 0) {
                                          break L1;
                                        } else {
                                          break L19;
                                        }
                                      }
                                    } else {
                                      break L1;
                                    }
                                  }
                                }
                                L24: {
                                  if (((km) this).field_n != ((km) this).field_z.field_p.field_y) {
                                    stackOut_131_0 = 0;
                                    stackIn_132_0 = stackOut_131_0;
                                    break L24;
                                  } else {
                                    stackOut_129_0 = 1;
                                    stackIn_132_0 = stackOut_129_0;
                                    break L24;
                                  }
                                }
                                var4_int = stackIn_132_0;
                                var5_array = ((km) this).field_z.field_p.field_D;
                                var6 = 0;
                                L25: while (true) {
                                  L26: {
                                    L27: {
                                      if (~var6 <= ~var5_array.length) {
                                        break L27;
                                      } else {
                                        var7 = var5_array[var6];
                                        stackOut_134_0 = var7.field_y;
                                        stackIn_143_0 = stackOut_134_0;
                                        stackIn_135_0 = stackOut_134_0;
                                        if (var8 != 0) {
                                          break L26;
                                        } else {
                                          L28: {
                                            if (stackIn_135_0 == ((km) this).field_n) {
                                              var4_int = 1;
                                              break L28;
                                            } else {
                                              break L28;
                                            }
                                          }
                                          var6++;
                                          if (var8 == 0) {
                                            continue L25;
                                          } else {
                                            break L27;
                                          }
                                        }
                                      }
                                    }
                                    stackOut_142_0 = ((km) this).field_z.field_p.field_y;
                                    stackIn_143_0 = stackOut_142_0;
                                    break L26;
                                  }
                                  L29: {
                                    var5_ref = stackIn_143_0;
                                    if (var4_int == 0) {
                                      break L29;
                                    } else {
                                      if (((km) this).field_n == var5_ref) {
                                        break L29;
                                      } else {
                                        L30: {
                                          if (null == var5_ref) {
                                            break L30;
                                          } else {
                                            if (((km) this).field_n.field_h[var5_ref.field_x]) {
                                              break L29;
                                            } else {
                                              break L30;
                                            }
                                          }
                                        }
                                        ((km) this).field_z.e(-18641);
                                        ((km) this).a(2);
                                        this.a(2, ((km) this).field_z.field_p, 0);
                                        ((km) this).field_Y.a(-81, 0);
                                        ((km) this).field_Y.b(2, 2);
                                        break L29;
                                      }
                                    }
                                  }
                                  if (var8 == 0) {
                                    break L1;
                                  } else {
                                    break L17;
                                  }
                                }
                              }
                            }
                            if (((km) this).field_z.field_p.field_y != ((km) this).field_n) {
                              break L1;
                            } else {
                              if (((km) this).field_z.field_p.field_u) {
                                break L1;
                              } else {
                                ((km) this).field_z.e(-18641);
                                ((km) this).a(2);
                                this.a(0, ((km) this).field_z.field_p, 0);
                                ((km) this).field_Y.a(-119, 0);
                                ((km) this).field_Y.b(0, 2);
                                if (var8 == 0) {
                                  break L1;
                                } else {
                                  break L3;
                                }
                              }
                            }
                          }
                        }
                        if (((km) this).field_n != ((km) this).field_z.field_p.field_y) {
                          break L1;
                        } else {
                          if (((km) this).field_n == null) {
                            break L1;
                          } else {
                            if (0 < ((km) this).field_z.field_p.field_J) {
                              ((km) this).field_K = ((km) this).field_z.field_p;
                              gm discarded$5 = qk.a(us.field_d, 74);
                              ((km) this).field_Y.a(-107, 1);
                              ((km) this).field_z.field_z[((km) this).field_K.field_p] = 1;
                              var4_array = ((km) this).field_K.field_D;
                              var5_int = 0;
                              L31: while (true) {
                                L32: {
                                  if (~var5_int <= ~var4_array.length) {
                                    break L32;
                                  } else {
                                    var6_ref_ln = var4_array[var5_int];
                                    ((km) this).field_z.field_z[var6_ref_ln.field_p] = 2;
                                    var5_int++;
                                    if (var8 != 0) {
                                      break L1;
                                    } else {
                                      if (var8 == 0) {
                                        continue L31;
                                      } else {
                                        break L32;
                                      }
                                    }
                                  }
                                }
                                var4_ref2 = ((km) this).field_K.field_R.j(18229);
                                L33: while (true) {
                                  L34: {
                                    if (null == var4_ref2) {
                                      break L34;
                                    } else {
                                      if (var8 != 0) {
                                        break L1;
                                      } else {
                                        L35: {
                                          if (var4_ref2 == ((km) this).field_K) {
                                            break L35;
                                          } else {
                                            if (((km) this).field_P.a(((km) this).field_K, var4_ref2, -1)) {
                                              ((km) this).field_z.field_z[var4_ref2.field_p] = 2;
                                              break L35;
                                            } else {
                                              break L35;
                                            }
                                          }
                                        }
                                        var4_ref2 = ((km) this).field_K.field_R.h(-23410);
                                        if (var8 == 0) {
                                          continue L33;
                                        } else {
                                          break L34;
                                        }
                                      }
                                    }
                                  }
                                  if (var8 == 0) {
                                    break L1;
                                  } else {
                                    break L2;
                                  }
                                }
                              }
                            } else {
                              break L1;
                            }
                          }
                        }
                      }
                    }
                    L36: {
                      if (((km) this).field_z.field_p.field_R == ((km) this).field_c) {
                        break L36;
                      } else {
                        if (!((km) this).field_P.field_o.field_i) {
                          break L1;
                        } else {
                          if (null == ((km) this).field_z.field_p.field_y) {
                            break L1;
                          } else {
                            if ((Object) (Object) ((km) this).field_c == (Object) (Object) ((km) this).field_z.field_p.field_y.field_m) {
                              break L36;
                            } else {
                              break L1;
                            }
                          }
                        }
                      }
                    }
                    L37: {
                      L38: {
                        ((km) this).field_z.e(-18641);
                        this.a(((km) this).field_z.field_p, -83);
                        if (((km) this).field_x <= 3) {
                          break L38;
                        } else {
                          L39: {
                            var5_int = ((km) this).field_x - 3;
                            var6 = 96 >> (var5_int >> 1);
                            if (0 == (var5_int & 1)) {
                              break L39;
                            } else {
                              var6 = 46341 * var6 >> 16;
                              break L39;
                            }
                          }
                          L40: {
                            if (var6 < 24) {
                              var6 = 24;
                              break L40;
                            } else {
                              break L40;
                            }
                          }
                          var4_ref = rp.a(96, qc.field_w, var6);
                          if (var8 == 0) {
                            break L37;
                          } else {
                            break L38;
                          }
                        }
                      }
                      var4_ref = qk.a(qc.field_w, 78);
                      break L37;
                    }
                    L41: {
                      L42: {
                        if (null == ((km) this).field_E) {
                          break L42;
                        } else {
                          var5 = ((km) this).field_E;
                          L43: while (true) {
                            L44: {
                              L45: {
                                if (null == var5.field_b) {
                                  break L45;
                                } else {
                                  var5 = var5.field_b;
                                  if (var8 != 0) {
                                    break L44;
                                  } else {
                                    if (var8 == 0) {
                                      continue L43;
                                    } else {
                                      break L45;
                                    }
                                  }
                                }
                              }
                              var5.field_b = new sf(var4_ref, cl.field_n);
                              break L44;
                            }
                            if (var8 == 0) {
                              break L41;
                            } else {
                              break L42;
                            }
                          }
                        }
                      }
                      ((km) this).field_E = new sf(var4_ref, cl.field_n);
                      break L41;
                    }
                    ((km) this).field_x = ((km) this).field_x + 1;
                    ((km) this).a(2);
                    break L1;
                  }
                }
                break L0;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var4, "km.BA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void d(byte param0) {
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
              L2: {
                L3: {
                  this.b(false);
                  if (!((km) this).field_W) {
                    break L3;
                  } else {
                    if (0 != ((km) this).field_P.field_O) {
                      break L3;
                    } else {
                      L4: {
                        if (!((km) this).field_P.field_o.field_i) {
                          break L4;
                        } else {
                          var2_array = ((km) this).field_P.field_v;
                          var3 = 0;
                          L5: while (true) {
                            L6: {
                              if (~var3 <= ~var2_array.length) {
                                break L6;
                              } else {
                                var4 = var2_array[var3];
                                var4.field_m.field_x = 0;
                                var3++;
                                if (var6 != 0) {
                                  break L3;
                                } else {
                                  if (var6 == 0) {
                                    continue L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            if (var6 == 0) {
                              break L3;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      var2_array = ((km) this).field_P.field_v;
                      var3 = 0;
                      L7: while (true) {
                        if (~var2_array.length >= ~var3) {
                          break L3;
                        } else {
                          var4 = var2_array[var3];
                          if (var6 != 0) {
                            break L2;
                          } else {
                            var5 = (sd) (Object) var4.field_i.d(0);
                            L8: while (true) {
                              L9: {
                                L10: {
                                  if (null == var5) {
                                    break L10;
                                  } else {
                                    var5.field_x = 0;
                                    var5 = (sd) (Object) var4.field_i.a((byte) -71);
                                    if (var6 != 0) {
                                      break L9;
                                    } else {
                                      if (var6 == 0) {
                                        continue L8;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                }
                                var3++;
                                break L9;
                              }
                              if (var6 == 0) {
                                continue L7;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
                int fieldTemp$1 = ((km) this).field_h + 1;
                ((km) this).field_h = ((km) this).field_h + 1;
                if (fieldTemp$1 != ((km) this).field_P.field_v.length) {
                  break L2;
                } else {
                  ((km) this).field_n = ((km) this).field_P.field_v[0];
                  ((km) this).field_h = 0;
                  ((km) this).field_P.c(0);
                  this.b(lr.a((byte) 27), 79);
                  ((km) this).field_z.field_d = lr.a((byte) 27);
                  ((km) this).field_P.c((byte) 119);
                  var2_int = 0;
                  L11: while (true) {
                    if (((km) this).field_P.field_r <= var2_int) {
                      break L2;
                    } else {
                      if (var6 != 0) {
                        break L1;
                      } else {
                        L12: {
                          if (null == ((km) this).field_s[var2_int]) {
                            break L12;
                          } else {
                            ((km) this).field_s[var2_int].a((byte) -63);
                            break L12;
                          }
                        }
                        var2_int++;
                        if (var6 == 0) {
                          continue L11;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              L13: {
                if (param0 == -81) {
                  break L13;
                } else {
                  this.a(false, 84, (ln) null, (ln) null);
                  break L13;
                }
              }
              ((km) this).field_n = ((km) this).field_P.field_v[((km) this).field_h];
              ((km) this).field_S = mb.field_o[((km) this).field_P.field_J];
              this.a(true);
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "km.TA(" + param0 + ')');
        }
    }

    final void a(int param0, int param1) {
        qm var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var3 = (qm) (Object) ((km) this).field_P.field_i.d(0);
            L1: while (true) {
              L2: {
                L3: {
                  if (var3 == null) {
                    break L3;
                  } else {
                    stackOut_3_0 = ~var3.field_o;
                    stackOut_3_1 = ~param0;
                    stackIn_15_0 = stackOut_3_0;
                    stackIn_15_1 = stackOut_3_1;
                    stackIn_4_0 = stackOut_3_0;
                    stackIn_4_1 = stackOut_3_1;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (stackIn_4_0 == stackIn_4_1) {
                          L5: {
                            var3.field_r = null;
                            var3.field_q = null;
                            if (((km) this).field_f) {
                              ((km) this).field_ab.a((df) (Object) var3, 32);
                              this.e(0);
                              break L5;
                            } else {
                              break L5;
                            }
                          }
                          var3.b((byte) -117);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var3 = (qm) (Object) ((km) this).field_P.field_i.a((byte) -71);
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_14_0 = param1;
                stackOut_14_1 = 24;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                break L2;
              }
              L6: {
                if (stackIn_15_0 == stackIn_15_1) {
                  break L6;
                } else {
                  ((km) this).field_f = true;
                  break L6;
                }
              }
              ((km) this).field_Y.c(param0, 127);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw r.a((Throwable) (Object) var3_ref, "km.BB(" + param0 + ',' + param1 + ')');
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
            throw r.a((Throwable) (Object) runtimeException, "km.JA(" + param0 + ')');
        }
    }

    final void b(boolean param0, boolean param1) {
        RuntimeException var3 = null;
        sl var3_ref = null;
        int var4 = 0;
        tr stackIn_11_0 = null;
        tr stackIn_13_0 = null;
        tr stackIn_14_0 = null;
        pf stackIn_14_1 = null;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        RuntimeException decompiledCaughtException = null;
        tr stackOut_10_0 = null;
        tr stackOut_13_0 = null;
        Object stackOut_13_1 = null;
        tr stackOut_11_0 = null;
        pf stackOut_11_1 = null;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        boolean stackOut_23_0 = false;
        int stackOut_23_1 = 0;
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
                    if (var4 == 0) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              boolean discarded$4 = ((km) this).field_Y.a(false, (byte) 110);
              break L1;
            }
            L3: {
              ((km) this).field_Y.h((byte) 122);
              stackOut_10_0 = ((km) this).field_z;
              stackIn_13_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if (null == ((km) this).field_Q) {
                stackOut_13_0 = (tr) (Object) stackIn_13_0;
                stackOut_13_1 = null;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = (pf) (Object) stackOut_13_1;
                break L3;
              } else {
                stackOut_11_0 = (tr) (Object) stackIn_11_0;
                stackOut_11_1 = ((km) this).field_Q.field_a;
                stackIn_14_0 = stackOut_11_0;
                stackIn_14_1 = stackOut_11_1;
                break L3;
              }
            }
            ((tr) (Object) stackIn_14_0).a(stackIn_14_1, 66);
            L4: while (true) {
              L5: {
                L6: {
                  if (null == ((km) this).field_E) {
                    break L6;
                  } else {
                    stackOut_16_0 = cl.field_n + -((km) this).field_E.field_c;
                    stackOut_16_1 = 50;
                    stackIn_24_0 = stackOut_16_0;
                    stackIn_24_1 = stackOut_16_1;
                    stackIn_17_0 = stackOut_16_0;
                    stackIn_17_1 = stackOut_16_1;
                    if (var4 != 0) {
                      break L5;
                    } else {
                      if (stackIn_17_0 < stackIn_17_1) {
                        break L6;
                      } else {
                        ((km) this).field_x = ((km) this).field_x - 1;
                        ((km) this).field_E = ((km) this).field_E.field_b;
                        if (var4 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                }
                stackOut_23_0 = param1;
                stackOut_23_1 = 1;
                stackIn_24_0 = stackOut_23_0 ? 1 : 0;
                stackIn_24_1 = stackOut_23_1;
                break L5;
              }
              L7: {
                if (stackIn_24_0 == stackIn_24_1) {
                  break L7;
                } else {
                  field_X = null;
                  break L7;
                }
              }
              L8: {
                L9: {
                  if (((km) this).field_f) {
                    break L9;
                  } else {
                    ((km) this).field_S = ((km) this).field_S - 1;
                    if (var4 == 0) {
                      break L8;
                    } else {
                      break L9;
                    }
                  }
                }
                L10: {
                  if (1 < ((km) this).field_S) {
                    int fieldTemp$5 = ((km) this).field_S - 1;
                    ((km) this).field_S = ((km) this).field_S - 1;
                    if (fieldTemp$5 != 1) {
                      break L10;
                    } else {
                      if (((km) this).field_L) {
                        break L10;
                      } else {
                        if (((km) this).field_b) {
                          ((km) this).m(123);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    }
                  } else {
                    break L10;
                  }
                }
                if (((km) this).field_S % 200 != 0) {
                  break L8;
                } else {
                  if (!((km) this).field_L) {
                    break L8;
                  } else {
                    var3_ref = js.field_f;
                    var3_ref.h(61, 255);
                    var3_ref.c(((km) this).field_P.field_O, (byte) -110);
                    var3_ref.e(11135, this.f(109));
                    break L8;
                  }
                }
              }
              L11: {
                if (!((km) this).field_f) {
                  break L11;
                } else {
                  if (!((km) this).field_b) {
                    break L11;
                  } else {
                    if (((km) this).field_k == -1) {
                      break L11;
                    } else {
                      L12: {
                        int fieldTemp$6 = ((km) this).field_k - 1;
                        ((km) this).field_k = ((km) this).field_k - 1;
                        if (fieldTemp$6 == -1) {
                          break L12;
                        } else {
                          int fieldTemp$7 = ((km) this).field_g - 1;
                          ((km) this).field_g = ((km) this).field_g - 1;
                          if (fieldTemp$7 < 0) {
                            break L12;
                          } else {
                            break L11;
                          }
                        }
                      }
                      this.l(-106);
                      break L11;
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
          throw r.a((Throwable) (Object) var3, "km.GA(" + param0 + ',' + param1 + ')');
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
              L2: {
                if (((km) this).field_n != param0) {
                  break L2;
                } else {
                  var4_ref = re.a(jb.field_a, 4371, new String[1]);
                  ((km) this).field_H.a((oh) (Object) new n(param0, param2, var4_ref), 0);
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param2 != ((km) this).field_n) {
                  break L3;
                } else {
                  var4_ref = re.a(se.field_c, 4371, new String[1]);
                  ((km) this).field_H.a((oh) (Object) new n(param2, param0, var4_ref), 0);
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              var4_ref = re.a(lh.field_A, 4371, new String[2]);
              ((km) this).field_H.a((oh) (Object) new n(param2, param0, var4_ref), 0);
              break L1;
            }
            L4: {
              if (!((km) this).field_W) {
                break L4;
              } else {
                fl.a(0, "signtreaty");
                break L4;
              }
            }
            L5: {
              this.a(((km) this).field_n, param1 + 27510);
              if (null != ((km) this).field_s[param0.field_x]) {
                ((km) this).field_s[param0.field_x].a(param2, (byte) -42);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (param1 == -27584) {
                break L6;
              } else {
                ((km) this).field_J = null;
                break L6;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("km.I(");
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L7;
            }
          }
          L8: {
            stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
            stackOut_23_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param1).append(',');
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L8;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_27_0 = stackOut_24_0;
              stackIn_27_1 = stackOut_24_1;
              stackIn_27_2 = stackOut_24_2;
              break L8;
            }
          }
          throw r.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + ')');
        }
    }

    private final void b(boolean param0) {
        RuntimeException var2 = null;
        n var2_ref = null;
        qm var3 = null;
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        boolean stackOut_11_0 = false;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_ref = (n) (Object) ((km) this).field_H.d(0);
            if (!param0) {
              L1: while (true) {
                L2: {
                  L3: {
                    if (var2_ref == null) {
                      break L3;
                    } else {
                      stackOut_4_0 = -3;
                      stackIn_12_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        L4: {
                          int fieldTemp$1 = var2_ref.field_i + 1;
                          var2_ref.field_i = var2_ref.field_i + 1;
                          if (stackIn_5_0 != ~fieldTemp$1) {
                            break L4;
                          } else {
                            var2_ref.b((byte) -85);
                            break L4;
                          }
                        }
                        var2_ref = (n) (Object) ((km) this).field_H.a((byte) -71);
                        if (var5 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_11_0 = ((km) this).field_W;
                  stackIn_12_0 = stackOut_11_0 ? 1 : 0;
                  break L2;
                }
                L5: {
                  L6: {
                    if (stackIn_12_0 != 0) {
                      var3 = (qm) (Object) ((km) this).field_P.field_i.d(0);
                      L7: while (true) {
                        if (var3 == null) {
                          break L6;
                        } else {
                          var4 = var3.field_o;
                          if (var5 != 0) {
                            break L5;
                          } else {
                            L8: {
                              L9: {
                                L10: {
                                  L11: {
                                    L12: {
                                      if (var4 == 0) {
                                        break L12;
                                      } else {
                                        if (var4 == 1) {
                                          break L11;
                                        } else {
                                          if (var4 == 2) {
                                            break L10;
                                          } else {
                                            if (var4 != 3) {
                                              break L8;
                                            } else {
                                              if (var5 == 0) {
                                                break L9;
                                              } else {
                                                break L12;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                    fl.a(0, "defensivenet");
                                    if (var5 == 0) {
                                      break L8;
                                    } else {
                                      break L11;
                                    }
                                  }
                                  fl.a(0, "terraforming");
                                  if (var5 == 0) {
                                    break L8;
                                  } else {
                                    break L10;
                                  }
                                }
                                fl.a(0, "stellarbomb");
                                if (var5 == 0) {
                                  break L8;
                                } else {
                                  break L9;
                                }
                              }
                              fl.a(0, "tannhauser");
                              break L8;
                            }
                            var3 = (qm) (Object) ((km) this).field_P.field_i.a((byte) -71);
                            if (var5 == 0) {
                              continue L7;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                    } else {
                      break L6;
                    }
                  }
                  break L5;
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "km.DA(" + param0 + ')');
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
        ln stackIn_4_0 = null;
        ln stackIn_46_0 = null;
        int stackIn_73_0 = 0;
        int stackIn_73_1 = 0;
        int stackIn_88_0 = 0;
        int stackIn_88_1 = 0;
        Throwable decompiledCaughtException = null;
        ln stackOut_3_0 = null;
        ln stackOut_45_0 = null;
        int stackOut_72_0 = 0;
        int stackOut_72_1 = 0;
        int stackOut_86_0 = 0;
        int stackOut_86_1 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            System.gc();
            ((km) this).field_P.field_x.a((byte) -70, ((km) this).field_P, ((km) this).field_Y);
            var2_array = ((km) this).field_P.field_g.field_e;
            var3_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      L6: {
                        if (var3_int >= var2_array.length) {
                          break L6;
                        } else {
                          var4 = var2_array[var3_int];
                          var4.field_J = var4.field_x;
                          stackOut_3_0 = (ln) var4;
                          stackIn_46_0 = stackOut_3_0;
                          stackIn_4_0 = stackOut_3_0;
                          if (var6 != 0) {
                            L7: while (true) {
                              fl.a(stackIn_46_0, (byte) 73);
                              kr.a((byte) 65, var4);
                              var3_int++;
                              if (var6 != 0) {
                                break L2;
                              } else {
                                if (var6 == 0) {
                                  if (~var3_int <= ~var2_array.length) {
                                    break L4;
                                  } else {
                                    var4 = var2_array[var3_int];
                                    stackOut_45_0 = (ln) var4;
                                    stackIn_46_0 = stackOut_45_0;
                                    continue L7;
                                  }
                                } else {
                                  break L5;
                                }
                              }
                            }
                          } else {
                            L8: {
                              L9: {
                                if (stackIn_4_0.field_y != ((km) this).field_n) {
                                  break L9;
                                } else {
                                  ((km) this).field_p[var4.field_p] = var4.field_x;
                                  ((km) this).field_J[var4.field_p] = var4.field_x;
                                  if (var6 == 0) {
                                    break L8;
                                  } else {
                                    break L9;
                                  }
                                }
                              }
                              ((km) this).field_w[var4.field_p] = false;
                              ((km) this).field_V[var4.field_p] = false;
                              ((km) this).field_p[var4.field_p] = 0;
                              ((km) this).field_J[var4.field_p] = 0;
                              break L8;
                            }
                            var3_int++;
                            if (var6 == 0) {
                              continue L1;
                            } else {
                              break L6;
                            }
                          }
                        }
                      }
                      L10: {
                        L11: {
                          if (null == ((km) this).field_R) {
                            break L11;
                          } else {
                            if (((km) this).field_P.field_g.field_e.length > ((km) this).field_R.length) {
                              break L11;
                            } else {
                              break L10;
                            }
                          }
                        }
                        var2_int = ((km) this).field_P.field_g.field_e.length;
                        ((km) this).field_C = new int[var2_int];
                        ((km) this).field_R = new fs[var2_int];
                        ((km) this).field_l = new sd[var2_int];
                        break L10;
                      }
                      var2_array = ((km) this).field_P.field_g.field_e;
                      var3_int = 0;
                      L12: while (true) {
                        L13: {
                          L14: {
                            if (~var2_array.length >= ~var3_int) {
                              break L14;
                            } else {
                              var4 = var2_array[var3_int];
                              var5 = var4.field_p;
                              ((km) this).field_R[var5] = var4.field_y;
                              ((km) this).field_C[var5] = var4.field_x;
                              ((km) this).field_l[var5] = var4.field_R;
                              var3_int++;
                              if (var6 != 0) {
                                break L13;
                              } else {
                                if (var6 == 0) {
                                  continue L12;
                                } else {
                                  break L14;
                                }
                              }
                            }
                          }
                          ((km) this).field_z.a(((km) this).field_C, param0, ((km) this).field_l, ((km) this).field_R, false);
                          ((km) this).field_z.a(((km) this).field_p, ((km) this).field_t, ((km) this).field_U, ((km) this).field_V, ((km) this).field_w, ((km) this).field_d, ((km) this).field_r, ((km) this).field_J, 0);
                          ((km) this).field_z.d(0);
                          this.a(((km) this).field_n, -83);
                          break L13;
                        }
                        L15: {
                          if (((km) this).field_f) {
                            break L15;
                          } else {
                            if (null == ((km) this).field_s[((km) this).field_h]) {
                              break L15;
                            } else {
                              try {
                                L16: {
                                  ((km) this).field_s[((km) this).field_h].b((byte) -91);
                                  break L16;
                                }
                              } catch (java.lang.Exception decompiledCaughtParameter0) {
                                decompiledCaughtException = decompiledCaughtParameter0;
                                L17: {
                                  var2 = (Exception) (Object) decompiledCaughtException;
                                  jq.a(-29901, (Throwable) (Object) var2, "AI has errored in single player game");
                                  break L17;
                                }
                              }
                              this.a(((km) this).field_n, -84);
                              this.d((byte) -81);
                              return;
                            }
                          }
                        }
                        if (!sm.field_e) {
                          break L3;
                        } else {
                          if (!((km) this).field_j) {
                            if (!((km) this).field_b) {
                              break L3;
                            } else {
                              ((km) this).field_s[((km) this).field_h].a((byte) -63);
                              ((km) this).field_s[((km) this).field_h].b((byte) -15);
                              this.a(((km) this).field_n, -70);
                              var2_array = ((km) this).field_P.field_g.field_e;
                              var3_int = 0;
                              L18: while (true) {
                                if (~var3_int <= ~var2_array.length) {
                                  break L4;
                                } else {
                                  var4 = var2_array[var3_int];
                                  stackOut_45_0 = (ln) var4;
                                  stackIn_46_0 = stackOut_45_0;
                                  fl.a(stackIn_46_0, (byte) 73);
                                  kr.a((byte) 65, var4);
                                  var3_int++;
                                  if (var6 != 0) {
                                    break L2;
                                  } else {
                                    if (var6 == 0) {
                                      continue L18;
                                    } else {
                                      break L5;
                                    }
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
                    break L4;
                  }
                  var2_ref2 = (mg) (Object) ((km) this).field_P.field_p.a(true);
                  L19: while (true) {
                    L20: {
                      if (var2_ref2 == null) {
                        break L20;
                      } else {
                        ((km) this).field_v.a((byte) 9, (cn) (Object) var2_ref2);
                        var2_ref2 = (mg) (Object) ((km) this).field_P.field_p.a((byte) -68);
                        if (var6 != 0) {
                          break L2;
                        } else {
                          if (var6 == 0) {
                            continue L19;
                          } else {
                            break L20;
                          }
                        }
                      }
                    }
                    var3 = (qa) (Object) ((km) this).field_P.field_q.d(0);
                    L21: while (true) {
                      L22: {
                        if (var3 == null) {
                          break L22;
                        } else {
                          ((km) this).field_o.a((df) (Object) var3, 32);
                          var3 = (qa) (Object) ((km) this).field_P.field_q.a((byte) -71);
                          if (var6 != 0) {
                            break L2;
                          } else {
                            if (var6 == 0) {
                              continue L21;
                            } else {
                              break L22;
                            }
                          }
                        }
                      }
                      var4_ref = (qm) (Object) ((km) this).field_P.field_i.d(0);
                      L23: while (true) {
                        L24: {
                          if (null == var4_ref) {
                            break L24;
                          } else {
                            ((km) this).field_ab.a((df) (Object) var4_ref, 32);
                            var4_ref = (qm) (Object) ((km) this).field_P.field_i.a((byte) -71);
                            if (var6 != 0) {
                              break L2;
                            } else {
                              if (var6 == 0) {
                                continue L23;
                              } else {
                                break L24;
                              }
                            }
                          }
                        }
                        this.e(0);
                        break L3;
                      }
                    }
                  }
                }
                ((km) this).field_z.a(false);
                ((km) this).field_Y.n(106);
                ((km) this).field_Y.a(-73, 0);
                ((km) this).field_N = 0;
                break L2;
              }
              var2_int = 0;
              L25: while (true) {
                L26: {
                  L27: {
                    L28: {
                      if (var2_int >= ((km) this).field_P.field_r) {
                        break L28;
                      } else {
                        stackOut_72_0 = ~(1 << var2_int & ((km) this).field_P.field_w);
                        stackOut_72_1 = -1;
                        stackIn_88_0 = stackOut_72_0;
                        stackIn_88_1 = stackOut_72_1;
                        stackIn_73_0 = stackOut_72_0;
                        stackIn_73_1 = stackOut_72_1;
                        if (var6 != 0) {
                          break L27;
                        } else {
                          L29: {
                            if (stackIn_73_0 != stackIn_73_1) {
                              break L29;
                            } else {
                              ((km) this).field_N = ((km) this).field_N + 1;
                              break L29;
                            }
                          }
                          var2_int++;
                          if (var6 == 0) {
                            continue L25;
                          } else {
                            break L28;
                          }
                        }
                      }
                    }
                    L30: {
                      if (((km) this).field_P.field_z) {
                        break L30;
                      } else {
                        if (((km) this).field_n == null) {
                          break L26;
                        } else {
                          if ((1 << ((km) this).field_h & ((km) this).field_P.field_w) == 0) {
                            break L26;
                          } else {
                            break L30;
                          }
                        }
                      }
                    }
                    stackOut_86_0 = 0;
                    stackOut_86_1 = -1;
                    stackIn_88_0 = stackOut_86_0;
                    stackIn_88_1 = stackOut_86_1;
                    break L27;
                  }
                  L31: {
                    L32: {
                      L33: {
                        ta.a(stackIn_88_0, stackIn_88_1, (byte) 96, false);
                        ((km) this).field_b = false;
                        ((km) this).field_Y.o(-4956);
                        if (((km) this).field_n == null) {
                          break L33;
                        } else {
                          if ((1 << ((km) this).field_h & ((km) this).field_P.field_w) != 0) {
                            break L32;
                          } else {
                            break L33;
                          }
                        }
                      }
                      if (((km) this).field_P.field_x.a((byte) -123, ((km) this).field_n)) {
                        break L32;
                      } else {
                        if (((km) this).field_P.field_z) {
                          jo.a(32767, hj.field_n, false, 10);
                          if (var6 == 0) {
                            break L31;
                          } else {
                            break L32;
                          }
                        } else {
                          break L31;
                        }
                      }
                    }
                    jo.a(32767, wh.field_b, false, 10);
                    break L31;
                  }
                  if (!sm.field_e) {
                    break L26;
                  } else {
                    if ((((km) this).field_P.field_e & 1 << ((km) this).field_h) != 0) {
                      break L26;
                    } else {
                      ((km) this).b(-118);
                      break L26;
                    }
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw r.a((Throwable) (Object) var2_ref, "km.J(" + param0 + ')');
        }
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        fs[] var3_ref_fs__ = null;
        String var3_ref_String = null;
        int var3 = 0;
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
        boolean stackIn_42_0 = false;
        int stackIn_49_0 = 0;
        Object stackIn_52_0 = null;
        Object stackIn_52_1 = null;
        Object stackIn_60_0 = null;
        Object stackIn_60_1 = null;
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
        boolean stackOut_41_0 = false;
        int stackOut_48_0 = 0;
        Object stackOut_51_0 = null;
        Object stackOut_51_1 = null;
        Object stackOut_59_0 = null;
        Object stackOut_59_1 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                stackOut_1_0 = this;
                stackOut_1_1 = null;
                stackOut_1_2 = null;
                stackOut_1_3 = ((km) this).field_P.field_g;
                stackOut_1_4 = ((km) this).field_P.field_v;
                stackOut_1_5 = ((km) this).field_n;
                stackOut_1_6 = ((km) this).field_W;
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
                if (((km) this).field_P.field_o.field_k) {
                  break L2;
                } else {
                  stackOut_2_0 = this;
                  stackOut_2_1 = null;
                  stackOut_2_2 = null;
                  stackOut_2_3 = (l) (Object) stackIn_2_3;
                  stackOut_2_4 = (fs[]) (Object) stackIn_2_4;
                  stackOut_2_5 = (fs) (Object) stackIn_2_5;
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
                  if (((km) this).field_P.field_o.field_l) {
                    break L2;
                  } else {
                    stackOut_3_0 = this;
                    stackOut_3_1 = null;
                    stackOut_3_2 = null;
                    stackOut_3_3 = (l) (Object) stackIn_3_3;
                    stackOut_3_4 = (fs[]) (Object) stackIn_3_4;
                    stackOut_3_5 = (fs) (Object) stackIn_3_5;
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
                    stackOut_5_3 = (l) (Object) stackIn_5_3;
                    stackOut_5_4 = (fs[]) (Object) stackIn_5_4;
                    stackOut_5_5 = (fs) (Object) stackIn_5_5;
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
              stackOut_6_3 = (l) (Object) stackIn_6_3;
              stackOut_6_4 = (fs[]) (Object) stackIn_6_4;
              stackOut_6_5 = (fs) (Object) stackIn_6_5;
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
              ((km) this).field_z = new tr(stackIn_7_3, stackIn_7_4, stackIn_7_5, stackIn_7_6, stackIn_7_7 != 0);
              ((km) this).field_z.field_C = true;
              if (((km) this).field_Y == null) {
                ((km) this).field_Y = new kq((km) this);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              L5: {
                ((km) this).field_z.a(((km) this).field_Y, param0 + 205);
                if (((km) this).field_f) {
                  break L5;
                } else {
                  if (!((km) this).field_W) {
                    var2_int = 0;
                    L6: while (true) {
                      if (var2_int >= ((km) this).field_P.field_r) {
                        break L5;
                      } else {
                        if (var6 != 0) {
                          break L4;
                        } else {
                          L7: {
                            if (null == ((km) this).field_s[var2_int]) {
                              break L7;
                            } else {
                              ((km) this).field_s[var2_int].a(param0 + 7);
                              if (se.field_g) {
                                var3_ref_String = "My personality is " + wk.field_a[((km) this).field_s[var2_int].a(false)];
                                this.a(((km) this).field_P.field_v[var2_int], var3_ref_String, (byte) 51);
                                break L7;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var2_int++;
                          if (var6 == 0) {
                            continue L6;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                  } else {
                    break L5;
                  }
                }
              }
              var2_int = ((km) this).field_P.field_g.field_e.length;
              ((km) this).field_J = new int[var2_int];
              ((km) this).field_w = new boolean[var2_int];
              ((km) this).field_r = new int[var2_int];
              ((km) this).field_p = new int[var2_int];
              ((km) this).field_d = new int[var2_int];
              ((km) this).field_V = new boolean[var2_int];
              ((km) this).field_t = new int[var2_int];
              ((km) this).field_U = new int[var2_int];
              ((km) this).field_P.b(-99);
              ((km) this).field_z.a(((km) this).field_p, ((km) this).field_t, ((km) this).field_U, ((km) this).field_V, ((km) this).field_w, ((km) this).field_d, ((km) this).field_r, ((km) this).field_J, 0);
              break L4;
            }
            L8: {
              if (((km) this).field_h >= 0) {
                break L8;
              } else {
                sm.field_e = false;
                break L8;
              }
            }
            if (param0 == -81) {
              L9: {
                if (sm.field_e) {
                  ((km) this).field_s[((km) this).field_h] = (uj) (Object) new hi(((km) this).field_n, ((km) this).field_P, (mn) this);
                  break L9;
                } else {
                  break L9;
                }
              }
              var3_ref_fs__ = ((km) this).field_P.field_v;
              var4 = 0;
              L10: while (true) {
                L11: {
                  L12: {
                    if (var4 >= var3_ref_fs__.length) {
                      break L12;
                    } else {
                      var5 = var3_ref_fs__[var4];
                      stackOut_41_0 = var5.field_i.g(-124);
                      stackIn_49_0 = stackOut_41_0 ? 1 : 0;
                      stackIn_42_0 = stackOut_41_0;
                      if (var6 != 0) {
                        break L11;
                      } else {
                        L13: {
                          if (!stackIn_42_0) {
                            break L13;
                          } else {
                            ((km) this).field_P.field_w = ((km) this).field_P.field_w | 1 << var5.field_x;
                            break L13;
                          }
                        }
                        var4++;
                        if (var6 == 0) {
                          continue L10;
                        } else {
                          break L12;
                        }
                      }
                    }
                  }
                  ((km) this).field_z.b(false);
                  this.a(true);
                  stackOut_48_0 = 0;
                  stackIn_49_0 = stackOut_48_0;
                  break L11;
                }
                var3 = stackIn_49_0;
                L14: while (true) {
                  L15: {
                    L16: {
                      if (~((km) this).field_P.field_r >= ~var3) {
                        break L16;
                      } else {
                        stackOut_51_0 = null;
                        stackOut_51_1 = this;
                        stackIn_60_0 = stackOut_51_0;
                        stackIn_60_1 = stackOut_51_1;
                        stackIn_52_0 = stackOut_51_0;
                        stackIn_52_1 = stackOut_51_1;
                        if (var6 != 0) {
                          break L15;
                        } else {
                          L17: {
                            if (stackIn_52_0 != (Object) (Object) ((km) this).field_s[var3]) {
                              ((km) this).field_s[var3].a((byte) -63);
                              break L17;
                            } else {
                              break L17;
                            }
                          }
                          var3++;
                          if (var6 == 0) {
                            continue L14;
                          } else {
                            break L16;
                          }
                        }
                      }
                    }
                    ((km) this).a(param0 + 83);
                    stackOut_59_0 = null;
                    stackOut_59_1 = this;
                    stackIn_60_0 = stackOut_59_0;
                    stackIn_60_1 = stackOut_59_1;
                    break L15;
                  }
                  L18: {
                    L19: {
                      L20: {
                        if (stackIn_60_0 == (Object) (Object) ((km) this).field_n) {
                          break L20;
                        } else {
                          if (((km) this).field_n.field_i.g(param0 ^ 27)) {
                            break L20;
                          } else {
                            if (!sm.field_e) {
                              break L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                      }
                      ((km) this).field_z.field_I = ((km) this).field_z.field_F;
                      if (var6 == 0) {
                        break L18;
                      } else {
                        break L19;
                      }
                    }
                    ((km) this).field_z.a((sd) (Object) ((km) this).field_n.field_i.d(0), param0 ^ -82);
                    break L18;
                  }
                  ((km) this).field_z.a(false);
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "km.T(" + param0 + ')');
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
              var2.c(((km) this).field_P.field_O, (byte) -73);
              if (param0 < -114) {
                break L1;
              } else {
                ((km) this).field_Q = null;
                break L1;
              }
            }
            L2: {
              se.a(fp.a(((km) this).field_P.field_q, -71), -256, fp.a(((km) this).field_P.field_i, -88), eh.a(25, ((km) this).field_P.field_p), var2);
              ((km) this).field_ab.b((byte) 108);
              ((km) this).field_o.b((byte) 127);
              ((km) this).field_v.a((byte) 112);
              var2.f(-549342136, -var3 + var2.field_j);
              ((km) this).field_k = -1;
              ((km) this).field_g = -1;
              if (!((km) this).field_L) {
                break L2;
              } else {
                var2.h(61, 255);
                var2.c(((km) this).field_P.field_O, (byte) -74);
                var2.e(11135, this.f(-78));
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw r.a((Throwable) (Object) runtimeException, "km.CA(" + param0 + ')');
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
        ln stackIn_16_0 = null;
        int stackIn_41_0 = 0;
        int stackIn_58_0 = 0;
        ln stackIn_65_0 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        ln stackOut_15_0 = null;
        int stackOut_40_0 = 0;
        boolean stackOut_56_0 = false;
        ln stackOut_63_0 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = 1;
                var4 = this.a((byte) 82);
                if (param1 != ~var4) {
                  break L2;
                } else {
                  var3_int = ((km) this).field_c.field_x;
                  if (var8 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var4 == 86) {
                L3: {
                  if (5 >= ((km) this).field_c.field_x) {
                    stackOut_11_0 = ((km) this).field_c.field_x;
                    stackIn_12_0 = stackOut_11_0;
                    break L3;
                  } else {
                    stackOut_9_0 = 5;
                    stackIn_12_0 = stackOut_9_0;
                    break L3;
                  }
                }
                var3_int = stackIn_12_0;
                break L1;
              } else {
                break L1;
              }
            }
            param0.field_J = param0.field_J + var3_int;
            ((km) this).field_C[param0.field_p] = ((km) this).field_C[param0.field_p] + var3_int;
            ((km) this).field_p[param0.field_p] = ((km) this).field_p[param0.field_p] + var3_int;
            ((km) this).field_J[param0.field_p] = ((km) this).field_J[param0.field_p] + var3_int;
            var5 = (qa) (Object) ((km) this).field_P.field_q.d(0);
            L4: while (true) {
              L5: {
                L6: {
                  L7: {
                    L8: {
                      if (null == var5) {
                        break L8;
                      } else {
                        stackOut_15_0 = (ln) param0;
                        stackIn_65_0 = stackOut_15_0;
                        stackIn_16_0 = stackOut_15_0;
                        if (var8 != 0) {
                          break L7;
                        } else {
                          if (stackIn_16_0 == var5.field_u) {
                            break L8;
                          } else {
                            var5 = (qa) (Object) ((km) this).field_P.field_q.a((byte) -71);
                            if (var8 == 0) {
                              continue L4;
                            } else {
                              break L8;
                            }
                          }
                        }
                      }
                    }
                    L9: {
                      if (null == var5) {
                        var5 = new qa(param0, 0);
                        ((km) this).field_P.field_q.a((byte) -113, (oh) (Object) var5);
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: {
                      var5.field_v = var5.field_v + var3_int;
                      if (((km) this).field_f) {
                        ((km) this).field_o.a((df) (Object) var5, 32);
                        this.e(0);
                        break L10;
                      } else {
                        break L10;
                      }
                    }
                    L11: {
                      ((km) this).field_c.field_x = ((km) this).field_c.field_x - var3_int;
                      ((km) this).field_Y.e((byte) 43);
                      if (((km) this).field_c.field_x > 0) {
                        break L11;
                      } else {
                        L12: {
                          L13: {
                            if (null == ((km) this).field_n) {
                              break L13;
                            } else {
                              if (!((km) this).field_P.field_o.field_i) {
                                break L12;
                              } else {
                                break L13;
                              }
                            }
                          }
                          ((km) this).field_Y.a(param1 + -4, 0);
                          if (var8 == 0) {
                            break L6;
                          } else {
                            break L12;
                          }
                        }
                        var6_ref = (sd) (Object) ((km) this).field_n.field_i.d(param1 + 83);
                        L14: while (true) {
                          L15: {
                            L16: {
                              L17: {
                                if (var6_ref == null) {
                                  break L17;
                                } else {
                                  stackOut_40_0 = -1;
                                  stackIn_58_0 = stackOut_40_0;
                                  stackIn_41_0 = stackOut_40_0;
                                  if (var8 != 0) {
                                    break L16;
                                  } else {
                                    L18: {
                                      if (stackIn_41_0 == ~var6_ref.field_x) {
                                        break L18;
                                      } else {
                                        if (var8 == 0) {
                                          break L17;
                                        } else {
                                          break L18;
                                        }
                                      }
                                    }
                                    var6_ref = (sd) (Object) ((km) this).field_n.field_i.a((byte) -71);
                                    if (var8 == 0) {
                                      continue L14;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                              }
                              L19: {
                                if (null == var6_ref) {
                                  break L19;
                                } else {
                                  ((km) this).field_c = var6_ref;
                                  ((km) this).field_Y.a(-102, 2);
                                  var7 = var6_ref.j(18229);
                                  L20: while (true) {
                                    L21: {
                                      if (null == var7) {
                                        break L21;
                                      } else {
                                        ((km) this).field_z.field_z[var7.field_p] = 2;
                                        var7 = var6_ref.h(param1 + -23327);
                                        if (var8 != 0) {
                                          break L15;
                                        } else {
                                          if (var8 == 0) {
                                            continue L20;
                                          } else {
                                            break L21;
                                          }
                                        }
                                      }
                                    }
                                    if (var8 == 0) {
                                      break L15;
                                    } else {
                                      break L19;
                                    }
                                  }
                                }
                              }
                              stackOut_56_0 = ((km) this).field_W;
                              stackIn_58_0 = stackOut_56_0 ? 1 : 0;
                              break L16;
                            }
                            L22: {
                              if (stackIn_58_0 != 0) {
                                fl.a(0, "buildships");
                                break L22;
                              } else {
                                break L22;
                              }
                            }
                            ((km) this).field_Y.a(-86, 0);
                            break L15;
                          }
                          if (var8 == 0) {
                            break L6;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    ((km) this).field_Y.a(-73, 2);
                    stackOut_63_0 = ((km) this).field_c.j(18229);
                    stackIn_65_0 = stackOut_63_0;
                    break L7;
                  }
                  var6 = stackIn_65_0;
                  L23: while (true) {
                    if (null == var6) {
                      break L6;
                    } else {
                      ((km) this).field_z.field_z[var6.field_p] = 2;
                      var6 = ((km) this).field_c.h(-23410);
                      if (var8 != 0) {
                        break L5;
                      } else {
                        if (var8 == 0) {
                          continue L23;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                }
                this.a(((km) this).field_n, param1 ^ 2);
                break L5;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L24: {
            var3 = decompiledCaughtException;
            stackOut_73_0 = (RuntimeException) var3;
            stackOut_73_1 = new StringBuilder().append("km.S(");
            stackIn_76_0 = stackOut_73_0;
            stackIn_76_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param0 == null) {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L24;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_77_0 = stackOut_74_0;
              stackIn_77_1 = stackOut_74_1;
              stackIn_77_2 = stackOut_74_2;
              break L24;
            }
          }
          throw r.a((Throwable) (Object) stackIn_77_0, stackIn_77_2 + ',' + param1 + ')');
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
        int stackIn_16_0 = 0;
        int stackIn_16_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int[] stackIn_37_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int[] stackOut_36_0 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_array = new int[((km) this).field_P.field_r];
            var3 = ((km) this).field_P.field_g.field_e;
            var4 = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (~var4 <= ~var3.length) {
                    break L3;
                  } else {
                    var5 = var3[var4];
                    if (var8 != 0) {
                      break L2;
                    } else {
                      L4: {
                        if (null != var5.field_y) {
                          var2_array[var5.field_y.field_x] = var2_array[var5.field_y.field_x] + var5.field_x;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      var4++;
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0 == 44) {
                  break L2;
                } else {
                  this.a((fs) null, (String) null, (byte) -53);
                  break L2;
                }
              }
              var3_array = ((km) this).field_P.field_v;
              var4 = 0;
              L5: while (true) {
                stackOut_15_0 = ~var3_array.length;
                stackOut_15_1 = ~var4;
                stackIn_16_0 = stackOut_15_0;
                stackIn_16_1 = stackOut_15_1;
                L6: while (true) {
                  L7: {
                    if (stackIn_16_0 >= stackIn_16_1) {
                      break L7;
                    } else {
                      L8: {
                        L9: {
                          var5_ref = var3_array[var4];
                          var6 = var5_ref.field_x;
                          if (((km) this).field_P.field_o.field_i) {
                            break L9;
                          } else {
                            var7 = (sd) (Object) var5_ref.field_i.d(param0 ^ 44);
                            L10: while (true) {
                              L11: {
                                if (var7 == null) {
                                  break L11;
                                } else {
                                  stackOut_20_0 = 0;
                                  stackOut_20_1 = var7.field_r;
                                  stackIn_16_0 = stackOut_20_0;
                                  stackIn_16_1 = stackOut_20_1;
                                  stackIn_21_0 = stackOut_20_0;
                                  stackIn_21_1 = stackOut_20_1;
                                  if (var8 != 0) {
                                    continue L6;
                                  } else {
                                    L12: {
                                      if (stackIn_21_0 < stackIn_21_1) {
                                        var2_array[var6] = var2_array[var6] + var7.field_r;
                                        break L12;
                                      } else {
                                        break L12;
                                      }
                                    }
                                    var7 = (sd) (Object) var5_ref.field_i.a((byte) -71);
                                    if (var8 == 0) {
                                      continue L10;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                              }
                              if (var8 == 0) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                        if (null != var5_ref.field_m) {
                          if (var5_ref.field_m.field_r > 0) {
                            var2_array[var6] = var2_array[var6] + var5_ref.field_m.field_r;
                            break L8;
                          } else {
                            break L8;
                          }
                        } else {
                          break L8;
                        }
                      }
                      var4++;
                      if (var8 == 0) {
                        continue L5;
                      } else {
                        break L7;
                      }
                    }
                  }
                  stackOut_36_0 = (int[]) var2_array;
                  stackIn_37_0 = stackOut_36_0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var2, "km.UA(" + param0 + ')');
        }
        return stackIn_37_0;
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
            if (0 == ((1 << param0.field_x | 1 << ((km) this).field_h) & ((km) this).field_P.field_w)) {
              L1: {
                if (param1 > 44) {
                  break L1;
                } else {
                  this.a((ob) null, -6, 94);
                  break L1;
                }
              }
              if (param0 == ((km) this).field_n) {
                return;
              } else {
                if ((1 << param0.field_x & ((km) this).field_n.field_w) != 0) {
                  return;
                } else {
                  L2: {
                    L3: {
                      ((km) this).field_n.field_w = ((km) this).field_n.field_w | 1 << param0.field_x;
                      param0.field_A = param0.field_A | 1 << ((km) this).field_n.field_x;
                      if (!((km) this).field_f) {
                        break L3;
                      } else {
                        L4: {
                          var3_ref = js.field_f;
                          var3_ref.h(59, 255);
                          var3_ref.field_j = var3_ref.field_j + 2;
                          var4 = var3_ref.field_j;
                          var3_ref.c(((km) this).field_P.field_O, (byte) -106);
                          var3_ref.c(255, (byte) -78);
                          var3_ref.c(((km) this).field_n.field_x, (byte) -126);
                          var3_ref.c(param0.field_x, (byte) -104);
                          var3_ref.f(-549342136, -var4 + var3_ref.field_j);
                          if ((((km) this).field_n.field_A & 1 << param0.field_x) != 0) {
                            break L4;
                          } else {
                            this.a(((km) this).field_n, param0, true);
                            break L4;
                          }
                        }
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L5: {
                      if ((1 << param0.field_x & ((km) this).field_n.field_A) != 0) {
                        break L5;
                      } else {
                        this.a(((km) this).field_n, param0, true);
                        if (var5 == 0) {
                          break L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                    ((km) this).field_n.field_f[param0.field_x] = 3;
                    ((km) this).field_n.field_h[param0.field_x] = true;
                    param0.field_f[((km) this).field_n.field_x] = 3;
                    param0.field_h[((km) this).field_n.field_x] = true;
                    ((km) this).field_n.field_A = ((km) this).field_n.field_A & ~(1 << param0.field_x);
                    ((km) this).field_n.field_w = ((km) this).field_n.field_w & ~(1 << param0.field_x);
                    param0.field_A = param0.field_A & ~(1 << ((km) this).field_n.field_x);
                    param0.field_w = param0.field_w & ~(1 << ((km) this).field_n.field_x);
                    this.a(param0, -27584, ((km) this).field_n);
                    if (((km) this).field_W) {
                      fl.a(0, "signtreaty");
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  break L0;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var3;
            stackOut_31_1 = new StringBuilder().append("km.EA(");
            stackIn_34_0 = stackOut_31_0;
            stackIn_34_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param0 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L6;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_35_0 = stackOut_32_0;
              stackIn_35_1 = stackOut_32_1;
              stackIn_35_2 = stackOut_32_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ',' + param1 + ')');
        }
    }

    km(boolean param0, boolean param1, int param2, vr param3, int param4, String[] param5, int param6, boolean param7, kq param8) {
        RuntimeException var10 = null;
        int var10_int = 0;
        fs[] var10_array = null;
        int var11 = 0;
        fs var12 = null;
        int var13 = 0;
        fs stackIn_19_0 = null;
        fs stackIn_21_0 = null;
        fs stackIn_22_0 = null;
        String stackIn_22_1 = null;
        boolean stackIn_27_0 = false;
        int stackIn_34_0 = 0;
        Object stackIn_41_0 = null;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_59_0 = 0;
        int stackIn_80_0 = 0;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        RuntimeException stackIn_91_0 = null;
        StringBuilder stackIn_91_1 = null;
        RuntimeException stackIn_92_0 = null;
        StringBuilder stackIn_92_1 = null;
        String stackIn_92_2 = null;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        String stackIn_96_2 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        RuntimeException stackIn_100_0 = null;
        StringBuilder stackIn_100_1 = null;
        String stackIn_100_2 = null;
        RuntimeException decompiledCaughtException = null;
        fs stackOut_18_0 = null;
        fs stackOut_21_0 = null;
        String stackOut_21_1 = null;
        fs stackOut_19_0 = null;
        String stackOut_19_1 = null;
        boolean stackOut_26_0 = false;
        int stackOut_33_0 = 0;
        Object stackOut_40_0 = null;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        Object stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_58_0 = 0;
        boolean stackOut_79_0 = false;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        RuntimeException stackOut_91_0 = null;
        StringBuilder stackOut_91_1 = null;
        String stackOut_91_2 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        String stackOut_89_2 = null;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        String stackOut_95_2 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        String stackOut_93_2 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        RuntimeException stackOut_99_0 = null;
        StringBuilder stackOut_99_1 = null;
        String stackOut_99_2 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        var13 = ShatteredPlansClient.field_F ? 1 : 0;
        ((km) this).field_F = 25;
        ((km) this).field_T = false;
        ((km) this).field_I = ((km) this).field_F;
        ((km) this).field_y = false;
        try {
          L0: {
            L1: {
              L2: {
                ((km) this).field_f = param0;
                ((km) this).field_h = param6;
                ((km) this).field_W = param1;
                ((km) this).field_M = param7;
                if (((km) this).field_f) {
                  break L2;
                } else {
                  L3: {
                    if (!((km) this).field_W) {
                      break L3;
                    } else {
                      ((km) this).field_P = jg.a(param3, param5, param2, -22379, 4);
                      ob.a(-126, (km) this);
                      if (var13 == 0) {
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  ((km) this).field_P = qr.a(param2, 50, param5, param3, param4, 2);
                  if (var13 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((km) this).field_P = uq.a(param4, param2, -27579, param5, param3);
              break L1;
            }
            L4: {
              L5: {
                L6: {
                  if (((km) this).field_f) {
                    break L6;
                  } else {
                    var10_int = 1;
                    L7: while (true) {
                      L8: {
                        L9: {
                          if (((km) this).field_P.field_r <= var10_int) {
                            break L9;
                          } else {
                            ((km) this).field_P.field_v[var10_int].field_t = hn.field_f[var10_int];
                            var10_int++;
                            if (var13 != 0) {
                              break L8;
                            } else {
                              if (var13 == 0) {
                                continue L7;
                              } else {
                                break L9;
                              }
                            }
                          }
                        }
                        L10: {
                          stackOut_18_0 = ((km) this).field_P.field_v[0];
                          stackIn_21_0 = stackOut_18_0;
                          stackIn_19_0 = stackOut_18_0;
                          if (w.d(true)) {
                            stackOut_21_0 = (fs) (Object) stackIn_21_0;
                            stackOut_21_1 = hn.field_f[0];
                            stackIn_22_0 = stackOut_21_0;
                            stackIn_22_1 = stackOut_21_1;
                            break L10;
                          } else {
                            stackOut_19_0 = (fs) (Object) stackIn_19_0;
                            stackOut_19_1 = ln.field_o;
                            stackIn_22_0 = stackOut_19_0;
                            stackIn_22_1 = stackOut_19_1;
                            break L10;
                          }
                        }
                        stackIn_22_0.field_t = stackIn_22_1;
                        break L8;
                      }
                      if (var13 == 0) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                var10_int = 0;
                L11: while (true) {
                  if (var10_int >= ((km) this).field_P.field_r) {
                    break L5;
                  } else {
                    stackOut_26_0 = param5[var10_int].equals((Object) (Object) "bot_sp");
                    stackIn_34_0 = stackOut_26_0 ? 1 : 0;
                    stackIn_27_0 = stackOut_26_0;
                    if (var13 != 0) {
                      break L4;
                    } else {
                      L12: {
                        if (!stackIn_27_0) {
                          break L12;
                        } else {
                          ((km) this).field_P.field_v[var10_int].field_t = hn.field_f[var10_int];
                          break L12;
                        }
                      }
                      var10_int++;
                      if (var13 == 0) {
                        continue L11;
                      } else {
                        break L5;
                      }
                    }
                  }
                }
              }
              stackOut_33_0 = -1;
              stackIn_34_0 = stackOut_33_0;
              break L4;
            }
            L13: {
              L14: {
                if (stackIn_34_0 >= ~((km) this).field_h) {
                  break L14;
                } else {
                  ((km) this).field_n = null;
                  if (var13 == 0) {
                    break L13;
                  } else {
                    break L14;
                  }
                }
              }
              ((km) this).field_n = ((km) this).field_P.field_v[((km) this).field_h];
              break L13;
            }
            L15: {
              stackOut_40_0 = this;
              stackIn_43_0 = stackOut_40_0;
              stackIn_41_0 = stackOut_40_0;
              if (((km) this).field_n == null) {
                stackOut_43_0 = this;
                stackOut_43_1 = 0;
                stackIn_44_0 = stackOut_43_0;
                stackIn_44_1 = stackOut_43_1;
                break L15;
              } else {
                stackOut_41_0 = this;
                stackOut_41_1 = 1;
                stackIn_44_0 = stackOut_41_0;
                stackIn_44_1 = stackOut_41_1;
                break L15;
              }
            }
            ((km) this).field_b = stackIn_44_1 != 0;
            ((km) this).field_s = (uj[]) (Object) new hi[((km) this).field_P.field_v.length];
            var10_array = ((km) this).field_P.field_v;
            var11 = 0;
            L16: while (true) {
              L17: {
                L18: {
                  L19: {
                    L20: {
                      L21: {
                        if (~var10_array.length >= ~var11) {
                          break L21;
                        } else {
                          var12 = var10_array[var11];
                          var12.field_q = new um(20);
                          var11++;
                          if (var13 != 0) {
                            break L20;
                          } else {
                            if (var13 == 0) {
                              continue L16;
                            } else {
                              break L21;
                            }
                          }
                        }
                      }
                      if (((km) this).field_W) {
                        break L20;
                      } else {
                        if (!((km) this).field_f) {
                          var10_int = 0;
                          L22: while (true) {
                            L23: {
                              if (var10_int >= ((km) this).field_P.field_r) {
                                break L23;
                              } else {
                                stackOut_58_0 = ~((km) this).field_h;
                                stackIn_80_0 = stackOut_58_0;
                                stackIn_59_0 = stackOut_58_0;
                                if (var13 != 0) {
                                  break L17;
                                } else {
                                  L24: {
                                    L25: {
                                      if (stackIn_59_0 != ~var10_int) {
                                        break L25;
                                      } else {
                                        if (var13 == 0) {
                                          break L24;
                                        } else {
                                          break L25;
                                        }
                                      }
                                    }
                                    ((km) this).field_s[var10_int] = (uj) (Object) new hi(((km) this).field_P.field_v[var10_int], ((km) this).field_P, (mn) this);
                                    ((km) this).field_s[var10_int].a(true, -6861);
                                    break L24;
                                  }
                                  var10_int++;
                                  if (var13 == 0) {
                                    continue L22;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                            }
                            break L19;
                          }
                        } else {
                          break L19;
                        }
                      }
                    }
                    var10_int = 1;
                    L26: while (true) {
                      if (~((km) this).field_P.field_r >= ~var10_int) {
                        break L19;
                      } else {
                        ((km) this).field_s[var10_int] = og.a(2, (mn) this, ((km) this).field_P.field_v[var10_int], ((km) this).field_P, -114);
                        ((km) this).field_s[var10_int].a(false, -6861);
                        var10_int++;
                        if (var13 != 0) {
                          break L18;
                        } else {
                          if (var13 == 0) {
                            continue L26;
                          } else {
                            break L19;
                          }
                        }
                      }
                    }
                  }
                  L27: {
                    if (param8 == null) {
                      break L27;
                    } else {
                      param8.a((byte) -33, (km) this);
                      ((km) this).field_Y = param8;
                      break L27;
                    }
                  }
                  ((km) this).field_H = new pf();
                  break L18;
                }
                stackOut_79_0 = ((km) this).field_f;
                stackIn_80_0 = stackOut_79_0 ? 1 : 0;
                break L17;
              }
              L28: {
                L29: {
                  if (stackIn_80_0 == 0) {
                    break L29;
                  } else {
                    ((km) this).field_ab = new db();
                    ((km) this).field_o = new db();
                    ((km) this).field_v = new wb();
                    ((km) this).field_k = -1;
                    ((km) this).field_g = -1;
                    ((km) this).field_P.d(-9778, -1);
                    if (var13 == 0) {
                      break L28;
                    } else {
                      break L29;
                    }
                  }
                }
                ((km) this).b((byte) -81);
                ((km) this).field_z.field_p = null;
                ((km) this).field_P.d(-9778, 0);
                ((km) this).field_S = mb.field_o[((km) this).field_P.field_J];
                break L28;
              }
              ((km) this).field_G = false;
              ((km) this).field_L = false;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L30: {
            var10 = decompiledCaughtException;
            stackOut_88_0 = (RuntimeException) var10;
            stackOut_88_1 = new StringBuilder().append("km.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_91_0 = stackOut_88_0;
            stackIn_91_1 = stackOut_88_1;
            stackIn_89_0 = stackOut_88_0;
            stackIn_89_1 = stackOut_88_1;
            if (param3 == null) {
              stackOut_91_0 = (RuntimeException) (Object) stackIn_91_0;
              stackOut_91_1 = (StringBuilder) (Object) stackIn_91_1;
              stackOut_91_2 = "null";
              stackIn_92_0 = stackOut_91_0;
              stackIn_92_1 = stackOut_91_1;
              stackIn_92_2 = stackOut_91_2;
              break L30;
            } else {
              stackOut_89_0 = (RuntimeException) (Object) stackIn_89_0;
              stackOut_89_1 = (StringBuilder) (Object) stackIn_89_1;
              stackOut_89_2 = "{...}";
              stackIn_92_0 = stackOut_89_0;
              stackIn_92_1 = stackOut_89_1;
              stackIn_92_2 = stackOut_89_2;
              break L30;
            }
          }
          L31: {
            stackOut_92_0 = (RuntimeException) (Object) stackIn_92_0;
            stackOut_92_1 = ((StringBuilder) (Object) stackIn_92_1).append(stackIn_92_2).append(',').append(param4).append(',');
            stackIn_95_0 = stackOut_92_0;
            stackIn_95_1 = stackOut_92_1;
            stackIn_93_0 = stackOut_92_0;
            stackIn_93_1 = stackOut_92_1;
            if (param5 == null) {
              stackOut_95_0 = (RuntimeException) (Object) stackIn_95_0;
              stackOut_95_1 = (StringBuilder) (Object) stackIn_95_1;
              stackOut_95_2 = "null";
              stackIn_96_0 = stackOut_95_0;
              stackIn_96_1 = stackOut_95_1;
              stackIn_96_2 = stackOut_95_2;
              break L31;
            } else {
              stackOut_93_0 = (RuntimeException) (Object) stackIn_93_0;
              stackOut_93_1 = (StringBuilder) (Object) stackIn_93_1;
              stackOut_93_2 = "{...}";
              stackIn_96_0 = stackOut_93_0;
              stackIn_96_1 = stackOut_93_1;
              stackIn_96_2 = stackOut_93_2;
              break L31;
            }
          }
          L32: {
            stackOut_96_0 = (RuntimeException) (Object) stackIn_96_0;
            stackOut_96_1 = ((StringBuilder) (Object) stackIn_96_1).append(stackIn_96_2).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_99_0 = stackOut_96_0;
            stackIn_99_1 = stackOut_96_1;
            stackIn_97_0 = stackOut_96_0;
            stackIn_97_1 = stackOut_96_1;
            if (param8 == null) {
              stackOut_99_0 = (RuntimeException) (Object) stackIn_99_0;
              stackOut_99_1 = (StringBuilder) (Object) stackIn_99_1;
              stackOut_99_2 = "null";
              stackIn_100_0 = stackOut_99_0;
              stackIn_100_1 = stackOut_99_1;
              stackIn_100_2 = stackOut_99_2;
              break L32;
            } else {
              stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
              stackOut_97_1 = (StringBuilder) (Object) stackIn_97_1;
              stackOut_97_2 = "{...}";
              stackIn_100_0 = stackOut_97_0;
              stackIn_100_1 = stackOut_97_1;
              stackIn_100_2 = stackOut_97_2;
              break L32;
            }
          }
          throw r.a((Throwable) (Object) stackIn_100_0, stackIn_100_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Enter multiplayer lobby";
        field_A = "Enter name of friend to add to list";
        field_X = "Connecting to<br>friend server...";
    }
}
