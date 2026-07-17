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

    private final void a(fs param0, String param1) {
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        String[] var8 = null;
        String[] var9 = null;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        String var13 = null;
        int stackIn_10_0 = 0;
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
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
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
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (((km) this).field_W) {
              return;
            } else {
              L1: {
                var13 = param0.field_t + ": ";
                var5 = ji.field_I.field_K;
                if (((km) this).field_f) {
                  var5 = var5 - ho.field_f.c("[" + re.a(he.field_q, 4371, new String[1]) + "] ");
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (((km) this).field_f) {
                  stackOut_9_0 = 0;
                  stackIn_10_0 = stackOut_9_0;
                  break L2;
                } else {
                  stackOut_8_0 = param0.field_k;
                  stackIn_10_0 = stackOut_8_0;
                  break L2;
                }
              }
              L3: {
                var6 = stackIn_10_0;
                var7 = -ho.field_f.c(var13) + var5 + -20;
                if (var7 >= ho.field_f.c(param1)) {
                  md.a(1, var13 + param1, var6, ln.field_o, ((km) this).field_P.field_v[0].field_t, -16169);
                  break L3;
                } else {
                  var8 = vi.a(ho.field_f, (byte) 125, param1, new int[1]);
                  var9 = var8;
                  var10 = 0;
                  L4: while (true) {
                    if (var9.length <= var10) {
                      break L3;
                    } else {
                      var11 = var9[var10];
                      md.a(1, var13 + var11, var6, ln.field_o, ((km) this).field_P.field_v[0].field_t, -16169);
                      var10++;
                      continue L4;
                    }
                  }
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4;
            stackOut_16_1 = new StringBuilder().append("km.HA(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          L6: {
            stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(44);
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + 51 + 41);
        }
    }

    private final void a(byte param0, fs param1) {
        sd var6 = null;
        ln var4_ref_ln = null;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
            var6 = (sd) (Object) param1.field_i.d(0);
            while (var6 != null) {
                var4_ref_ln = var6.j(18229);
                while (var4_ref_ln != null) {
                    var4_ref_ln.field_R = null;
                    var4_ref_ln.field_y = null;
                    var4_ref_ln.b((byte) -83);
                    var4_ref_ln = var6.h(-23410);
                }
                var6.b((byte) -89);
                var6 = (sd) (Object) param1.field_i.a((byte) -71);
            }
            int var4 = 107 % ((param0 - 77) / 37);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "km.MA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(int param0, ob param1, int param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            ((km) this).field_P.a(param2, (byte) -124, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("km.OA(").append(1).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw r.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + param2 + 41);
        }
    }

    final void a(boolean param0, boolean param1) {
        int var3 = 0;
        if (param0) {
            return;
        }
        if (!((km) this).field_f) {
            qn.b(117);
            var3 = param1 ? 1 : 0;
            ta.a(0, 0, (byte) 96, var3 != 0);
        }
        if (-1 != de.field_j) {
            if (!(de.field_j == uc.field_A)) {
                int discarded$0 = -69;
                ta.b();
            }
        }
    }

    private final void a(fs param0, int param1) {
        RuntimeException var3 = null;
        ln[] var3_array = null;
        int var4 = 0;
        int var5_int = 0;
        ln[] var5 = null;
        int var6 = 0;
        mg var7_ref_mg = null;
        int var7 = 0;
        int var8 = 0;
        ln[] var8_ref_ln__ = null;
        int var9 = 0;
        int var11 = 0;
        int var13 = 0;
        ln[] var14 = null;
        ln var15 = null;
        ln var16 = null;
        ln[] var17 = null;
        ln var18 = null;
        ln[] var19 = null;
        ln var20 = null;
        ln[] var21 = null;
        ln var22 = null;
        ln[] var23 = null;
        ln var24 = null;
        ln var25 = null;
        ln[] var26 = null;
        ln var27 = null;
        ln[] var28 = null;
        ln var29 = null;
        RuntimeException stackIn_82_0 = null;
        StringBuilder stackIn_82_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_81_0 = null;
        StringBuilder stackOut_81_1 = null;
        RuntimeException stackOut_83_0 = null;
        StringBuilder stackOut_83_1 = null;
        String stackOut_83_2 = null;
        RuntimeException stackOut_82_0 = null;
        StringBuilder stackOut_82_1 = null;
        String stackOut_82_2 = null;
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
            var14 = var3_array;
            var5_int = 0;
            L2: while (true) {
              if (var14.length <= var5_int) {
                L3: {
                  if (((km) this).field_P.field_o.field_k) {
                    var23 = var3_array;
                    var5_int = 0;
                    L4: while (true) {
                      if (var23.length <= var5_int) {
                        break L3;
                      } else {
                        var24 = var23[var5_int];
                        ((km) this).field_t[var24.field_p] = 0;
                        ((km) this).field_r[var24.field_p] = 0;
                        var5_int++;
                        continue L4;
                      }
                    }
                  } else {
                    if (!((km) this).field_P.field_o.field_l) {
                      var19 = var3_array;
                      var5_int = 0;
                      L5: while (true) {
                        if (var5_int >= var19.length) {
                          break L3;
                        } else {
                          var20 = var19[var5_int];
                          var7 = var20.field_p;
                          var8 = 0;
                          var9 = 0;
                          var21 = var20.field_D;
                          var11 = 0;
                          L6: while (true) {
                            if (var21.length <= var11) {
                              ((km) this).field_t[var7] = var8;
                              ((km) this).field_r[var7] = var9;
                              var5_int++;
                              continue L5;
                            } else {
                              L7: {
                                var22 = var21[var11];
                                if (!((km) this).field_w[var22.field_p]) {
                                  var8++;
                                  break L7;
                                } else {
                                  break L7;
                                }
                              }
                              L8: {
                                if (((km) this).field_V[var22.field_p]) {
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
                      var17 = var3_array;
                      var5_int = 0;
                      L9: while (true) {
                        if (var17.length <= var5_int) {
                          break L3;
                        } else {
                          var18 = var17[var5_int];
                          ((km) this).field_t[var18.field_p] = 1;
                          ((km) this).field_r[var18.field_p] = 1;
                          var5_int++;
                          continue L9;
                        }
                      }
                    }
                  }
                }
                L10: {
                  if (!((km) this).field_P.field_o.field_k) {
                    var4 = 1;
                    L11: while (true) {
                      if (var4 == 0) {
                        break L10;
                      } else {
                        var4 = 0;
                        var5 = var3_array;
                        var6 = 0;
                        L12: while (true) {
                          if (var5.length <= var6) {
                            continue L11;
                          } else {
                            L13: {
                              var25 = var5[var6];
                              var8 = var25.field_p;
                              if (!((km) this).field_w[var8]) {
                                break L13;
                              } else {
                                if (((km) this).field_t[var8] > ((km) this).field_p[var8]) {
                                  ((km) this).field_w[var8] = false;
                                  var9 = 1 + ((km) this).field_d[var8];
                                  var4 = 1;
                                  var26 = var25.field_D;
                                  var11 = 0;
                                  L14: while (true) {
                                    if (var26.length <= var11) {
                                      break L13;
                                    } else {
                                      L15: {
                                        var27 = var26[var11];
                                        if (((km) this).field_P.field_o.field_l) {
                                          ((km) this).field_t[var27.field_p] = 1;
                                          break L15;
                                        } else {
                                          ((km) this).field_t[var27.field_p] = ((km) this).field_t[var27.field_p] + 1;
                                          break L15;
                                        }
                                      }
                                      L16: {
                                        L17: {
                                          if (((km) this).field_d[var27.field_p] > var9) {
                                            break L17;
                                          } else {
                                            if (((km) this).field_w[var27.field_p]) {
                                              break L17;
                                            } else {
                                              break L16;
                                            }
                                          }
                                        }
                                        ((km) this).field_d[var27.field_p] = var9;
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
                              if (!((km) this).field_V[var8]) {
                                break L18;
                              } else {
                                if (((km) this).field_r[var8] <= ((km) this).field_J[var8]) {
                                  break L18;
                                } else {
                                  ((km) this).field_V[var8] = false;
                                  ((km) this).field_J[var8] = 0;
                                  var9 = 1 + ((km) this).field_U[var8];
                                  var4 = 1;
                                  var28 = var25.field_D;
                                  var11 = 0;
                                  L19: while (true) {
                                    if (var11 >= var28.length) {
                                      break L18;
                                    } else {
                                      L20: {
                                        var29 = var28[var11];
                                        if (((km) this).field_P.field_o.field_l) {
                                          ((km) this).field_r[var29.field_p] = 1;
                                          break L20;
                                        } else {
                                          ((km) this).field_r[var29.field_p] = ((km) this).field_r[var29.field_p] + 1;
                                          break L20;
                                        }
                                      }
                                      L21: {
                                        L22: {
                                          if (var9 < ((km) this).field_U[var29.field_p]) {
                                            break L22;
                                          } else {
                                            if (!((km) this).field_V[var29.field_p]) {
                                              break L21;
                                            } else {
                                              break L22;
                                            }
                                          }
                                        }
                                        ((km) this).field_U[var29.field_p] = var9;
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
                ((km) this).field_z.a(((km) this).field_p, ((km) this).field_t, ((km) this).field_U, ((km) this).field_V, ((km) this).field_w, ((km) this).field_d, ((km) this).field_r, ((km) this).field_J, 0);
                break L0;
              } else {
                L23: {
                  var15 = var14[var5_int];
                  ((km) this).field_d[var15.field_p] = 0;
                  ((km) this).field_U[var15.field_p] = 0;
                  if (var15.field_y == param0) {
                    ((km) this).field_w[var15.field_p] = true;
                    ((km) this).field_p[var15.field_p] = var15.field_J;
                    ((km) this).field_V[var15.field_p] = true;
                    ((km) this).field_J[var15.field_p] = var15.field_J;
                    break L23;
                  } else {
                    ((km) this).field_w[var15.field_p] = false;
                    ((km) this).field_p[var15.field_p] = 0;
                    ((km) this).field_V[var15.field_p] = false;
                    ((km) this).field_J[var15.field_p] = 0;
                    break L23;
                  }
                }
                var7_ref_mg = (mg) (Object) var15.field_s.c(-128);
                L24: while (true) {
                  if (var7_ref_mg == null) {
                    L25: {
                      if (param0 == null) {
                        break L25;
                      } else {
                        var8_ref_ln__ = var15.field_D;
                        var9 = 0;
                        L26: while (true) {
                          if (var9 >= var8_ref_ln__.length) {
                            break L25;
                          } else {
                            L27: {
                              var16 = var8_ref_ln__[var9];
                              if (param0 == var16.field_y) {
                                break L27;
                              } else {
                                if (null == var16.field_y) {
                                  break L27;
                                } else {
                                  L28: {
                                    if (!var16.field_y.field_h[param0.field_x]) {
                                      break L28;
                                    } else {
                                      if (var15.field_y == param0) {
                                        break L27;
                                      } else {
                                        break L28;
                                      }
                                    }
                                  }
                                  ((km) this).field_V[var15.field_p] = false;
                                  ((km) this).field_J[var15.field_p] = 0;
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
                      if (param0 == var7_ref_mg.field_G) {
                        L30: {
                          ((km) this).field_p[var15.field_p] = ((km) this).field_p[var15.field_p] + var7_ref_mg.field_z;
                          ((km) this).field_w[var15.field_p] = true;
                          if (param0 == var7_ref_mg.field_B.field_y) {
                            break L30;
                          } else {
                            if (var7_ref_mg.field_B.field_x != 0) {
                              break L29;
                            } else {
                              break L30;
                            }
                          }
                        }
                        ((km) this).field_J[var15.field_p] = ((km) this).field_J[var15.field_p] + var7_ref_mg.field_z;
                        ((km) this).field_V[var15.field_p] = true;
                        break L29;
                      } else {
                        break L29;
                      }
                    }
                    var7_ref_mg = (mg) (Object) var15.field_s.b(32);
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
            stackOut_81_0 = (RuntimeException) var3;
            stackOut_81_1 = new StringBuilder().append("km.RA(");
            stackIn_83_0 = stackOut_81_0;
            stackIn_83_1 = stackOut_81_1;
            stackIn_82_0 = stackOut_81_0;
            stackIn_82_1 = stackOut_81_1;
            if (param0 == null) {
              stackOut_83_0 = (RuntimeException) (Object) stackIn_83_0;
              stackOut_83_1 = (StringBuilder) (Object) stackIn_83_1;
              stackOut_83_2 = "null";
              stackIn_84_0 = stackOut_83_0;
              stackIn_84_1 = stackOut_83_1;
              stackIn_84_2 = stackOut_83_2;
              break L31;
            } else {
              stackOut_82_0 = (RuntimeException) (Object) stackIn_82_0;
              stackOut_82_1 = (StringBuilder) (Object) stackIn_82_1;
              stackOut_82_2 = "{...}";
              stackIn_84_0 = stackOut_82_0;
              stackIn_84_1 = stackOut_82_1;
              stackIn_84_2 = stackOut_82_2;
              break L31;
            }
          }
          throw r.a((Throwable) (Object) stackIn_84_0, stackIn_84_2 + 44 + param1 + 41);
        }
    }

    private final void b(int param0, ob param1) {
        RuntimeException var4 = null;
        qa var4_ref = null;
        mg var5 = null;
        ln[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        ln var9 = null;
        int var10 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            ((km) this).field_P.a(param0, (byte) -127, param1);
            var4_ref = (qa) (Object) ((km) this).field_P.field_q.d(0);
            L1: while (true) {
              if (var4_ref == null) {
                var5 = (mg) (Object) ((km) this).field_P.field_p.a(true);
                L2: while (true) {
                  if (var5 == null) {
                    var6 = ((km) this).field_P.field_g.field_e;
                    var7 = 0;
                    var8 = 0;
                    L3: while (true) {
                      if (var7 >= var6.length) {
                        this.a(((km) this).field_n, -94);
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
                    var5 = (mg) (Object) ((km) this).field_P.field_p.a((byte) -68);
                    continue L2;
                  }
                }
              } else {
                L4: {
                  if (((km) this).field_P.field_o.field_i) {
                    var4_ref.field_u.field_y.field_m.field_x = var4_ref.field_u.field_y.field_m.field_x - var4_ref.field_v;
                    break L4;
                  } else {
                    var4_ref.field_u.field_R.field_x = var4_ref.field_u.field_R.field_x - var4_ref.field_v;
                    break L4;
                  }
                }
                var4_ref.field_u.field_J = var4_ref.field_u.field_J + var4_ref.field_v;
                var4_ref = (qa) (Object) ((km) this).field_P.field_q.a((byte) -71);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var4;
            stackOut_15_1 = new StringBuilder().append("km.V(").append(param0).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param1 == null) {
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
          throw r.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 44 + -123 + 41);
        }
    }

    final void a(l param0, int param1) {
        ((km) this).field_P.a(92, param0);
        ((km) this).field_z.a(param0, 0);
        ((km) this).field_p = new int[param0.field_e.length];
        ((km) this).field_t = new int[param0.field_e.length];
        if (param1 != 6) {
            return;
        }
        try {
            ((km) this).field_w = new boolean[param0.field_e.length];
            ((km) this).field_d = new int[param0.field_e.length];
            ((km) this).field_J = new int[param0.field_e.length];
            ((km) this).field_r = new int[param0.field_e.length];
            ((km) this).field_V = new boolean[param0.field_e.length];
            ((km) this).field_U = new int[param0.field_e.length];
            this.a(((km) this).field_n, -74);
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "km.B(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void a(boolean param0, int param1) {
        int var3 = 0;
        tr stackIn_1_0 = null;
        pf stackIn_1_1 = null;
        pf stackIn_1_2 = null;
        tr stackIn_2_0 = null;
        pf stackIn_2_1 = null;
        pf stackIn_2_2 = null;
        tr stackIn_3_0 = null;
        pf stackIn_3_1 = null;
        pf stackIn_3_2 = null;
        tr stackIn_4_0 = null;
        pf stackIn_4_1 = null;
        pf stackIn_4_2 = null;
        int stackIn_4_3 = 0;
        tr stackOut_0_0 = null;
        pf stackOut_0_1 = null;
        pf stackOut_0_2 = null;
        tr stackOut_1_0 = null;
        pf stackOut_1_1 = null;
        pf stackOut_1_2 = null;
        tr stackOut_2_0 = null;
        pf stackOut_2_1 = null;
        pf stackOut_2_2 = null;
        int stackOut_2_3 = 0;
        tr stackOut_3_0 = null;
        pf stackOut_3_1 = null;
        pf stackOut_3_2 = null;
        int stackOut_3_3 = 0;
        L0: {
          L1: {
            var3 = -65 / ((param1 - 11) / 62);
            stackOut_0_0 = ((km) this).field_z;
            stackOut_0_1 = ((km) this).field_P.field_A;
            stackOut_0_2 = ((km) this).field_P.field_i;
            stackIn_3_0 = stackOut_0_0;
            stackIn_3_1 = stackOut_0_1;
            stackIn_3_2 = stackOut_0_2;
            stackIn_1_0 = stackOut_0_0;
            stackIn_1_1 = stackOut_0_1;
            stackIn_1_2 = stackOut_0_2;
            if (!((km) this).field_j) {
              break L1;
            } else {
              stackOut_1_0 = (tr) (Object) stackIn_1_0;
              stackOut_1_1 = (pf) (Object) stackIn_1_1;
              stackOut_1_2 = (pf) (Object) stackIn_1_2;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_3_2 = stackOut_1_2;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              if (!se.field_g) {
                break L1;
              } else {
                stackOut_2_0 = (tr) (Object) stackIn_2_0;
                stackOut_2_1 = (pf) (Object) stackIn_2_1;
                stackOut_2_2 = (pf) (Object) stackIn_2_2;
                stackOut_2_3 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                stackIn_4_3 = stackOut_2_3;
                break L0;
              }
            }
          }
          stackOut_3_0 = (tr) (Object) stackIn_3_0;
          stackOut_3_1 = (pf) (Object) stackIn_3_1;
          stackOut_3_2 = (pf) (Object) stackIn_3_2;
          stackOut_3_3 = 0;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          stackIn_4_2 = stackOut_3_2;
          stackIn_4_3 = stackOut_3_3;
          break L0;
        }
        ((tr) (Object) stackIn_4_0).a(stackIn_4_1, stackIn_4_2, stackIn_4_3 != 0, 12114, param0, ((km) this).field_P.field_p);
    }

    private final void a(int param0, int param1, int param2) {
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        if (je.field_d == 2) {
            if (!(((km) this).field_y)) {
                ((km) this).field_Z = param1;
                ((km) this).field_y = true;
                ((km) this).field_D = param2;
                ((km) this).field_T = false;
                return;
            }
            return;
        }
    }

    public final void a(int param0, byte param1, fs param2, fs param3, int param4) {
        int var6_int = 0;
        RuntimeException var6 = null;
        fs var7 = null;
        String[] var8 = null;
        String var9 = null;
        fs var10 = null;
        String var11 = null;
        String var12 = null;
        String var13 = null;
        String var14 = null;
        fs stackIn_3_0 = null;
        String stackIn_11_0 = null;
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
        RuntimeException decompiledCaughtException = null;
        fs stackOut_2_0 = null;
        fs stackOut_1_0 = null;
        String stackOut_10_0 = null;
        String stackOut_9_0 = null;
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
        try {
          L0: {
            L1: {
              var6_int = -91 / ((-70 - param1) / 36);
              if (((km) this).field_f) {
                stackOut_2_0 = ((km) this).field_n;
                stackIn_3_0 = stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = ((km) this).field_P.field_v[0];
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            var7 = stackIn_3_0;
            if (var7 != param2) {
              return;
            } else {
              var8 = ma.field_s[param4];
              if (0 != var8.length) {
                L2: {
                  var11 = var8[vc.a((byte) -39, var8.length)];
                  var10 = ((km) this).field_P.field_v[((km) this).field_P.field_m[-1 + ((km) this).field_P.field_r]];
                  var12 = vm.a(var10.field_t, 108, "largestplayer", var11);
                  var13 = vm.a(((km) this).field_n.field_t, 124, "you", var12);
                  var14 = vm.a(param3.field_t, 121, "me", var13);
                  if (((km) this).field_P.field_g.field_e.length <= param0) {
                    stackOut_10_0 = "";
                    stackIn_11_0 = stackOut_10_0;
                    break L2;
                  } else {
                    stackOut_9_0 = ((km) this).field_P.field_g.field_e[param0].field_I;
                    stackIn_11_0 = stackOut_9_0;
                    break L2;
                  }
                }
                var9 = vm.a(stackIn_11_0, 100, "system", var14);
                int discarded$1 = 51;
                this.a(param3, var9);
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
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("km.KA(").append(param0).append(44).append(param1).append(44);
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
          throw r.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param4 + 41);
        }
    }

    final boolean c(int param0) {
        int var2 = 0;
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
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        if (66 == ej.field_e) {
          L0: {
            L1: {
              var2 = sa.field_a.j(-108);
              var3 = sa.field_a.f(param0 + -35735);
              var4 = sa.field_a.a(16711680);
              var5 = sa.field_a.a(param0 ^ 16726439);
              var6 = sa.field_a.j(-75);
              var7_int = sa.field_a.j(param0 ^ -14818);
              var8 = sa.field_a.f(-20976);
              if (((km) this).field_P.field_O >= var2) {
                break L1;
              } else {
                if (-1 == ((km) this).field_P.field_O) {
                  break L1;
                } else {
                  int discarded$7 = 0;
                  this.b();
                  this.a((byte) 96, var4, var3);
                  if (var5 == ((km) this).field_P.f(-28824)) {
                    ((km) this).field_j = false;
                    ((km) this).field_P.a(var7_int, var6, false);
                    ((km) this).field_L = false;
                    ((km) this).field_S = var8;
                    int discarded$8 = 1;
                    this.a();
                    break L0;
                  } else {
                    L2: {
                      var9 = js.field_f;
                      var9.h(66, param0 ^ 14680);
                      var9.field_j = var9.field_j + 2;
                      var10 = var9.field_j;
                      if (((km) this).field_h >= 0) {
                        ((km) this).field_P.a((ob) (Object) var9, (byte) 68, ((km) this).field_n);
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: {
                      var9.f(param0 + -549356895, var9.field_j + -var10);
                      if (!se.field_g) {
                        d.a(0, (byte) 82);
                        q.g(-112);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    ((km) this).field_j = true;
                    ((km) this).field_P.a(var7_int, var6, false);
                    ((km) this).field_L = false;
                    ((km) this).field_S = var8;
                    int discarded$9 = 1;
                    this.a();
                    break L0;
                  }
                }
              }
            }
            if (((km) this).field_P.field_O != -1) {
              break L0;
            } else {
              ((km) this).field_P.d(-9778, var2);
              this.a(true, (int[]) null);
              ((km) this).field_q = ((km) this).field_P.field_O;
              break L0;
            }
          }
          ((km) this).field_S = var8;
          return true;
        } else {
          if (ej.field_e != 69) {
            if (ej.field_e != 67) {
              if (70 == ej.field_e) {
                int discarded$10 = -123;
                this.b(rr.field_t, (ob) (Object) sa.field_a);
                return true;
              } else {
                if (68 == ej.field_e) {
                  this.a((ob) (Object) sa.field_a, rr.field_t, -80);
                  return true;
                } else {
                  if (ej.field_e == 62) {
                    ((km) this).field_P.field_y = sa.field_a.j(param0 ^ -14832);
                    if (this == (Object) (Object) ce.field_x) {
                      int discarded$11 = 8;
                      ri.k();
                      return true;
                    } else {
                      return true;
                    }
                  } else {
                    if (ej.field_e == 64) {
                      L4: {
                        ((km) this).field_P.field_e = sa.field_a.j(param0 ^ -14814);
                        if (this == (Object) (Object) ce.field_x) {
                          wp.a(-2);
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                      return true;
                    } else {
                      if (ej.field_e == 63) {
                        ((km) this).field_P.field_f = sa.field_a.j(-119);
                        ((km) this).field_P.field_w = ((km) this).field_P.field_w | ((km) this).field_P.field_f;
                        var2 = 0;
                        L5: while (true) {
                          if (((km) this).field_P.field_r <= var2) {
                            return true;
                          } else {
                            if ((((km) this).field_P.field_f & 1 << var2) != 0) {
                              ((km) this).field_P.a(((km) this).field_P.field_v[var2], (byte) -123);
                              var2++;
                              continue L5;
                            } else {
                              var2++;
                              continue L5;
                            }
                          }
                        }
                      } else {
                        if (ej.field_e != 65) {
                          if (61 != ej.field_e) {
                            if (param0 == 14759) {
                              if (ej.field_e != 72) {
                                if (ej.field_e == 73) {
                                  var2 = sa.field_a.j(-95);
                                  var3 = sa.field_a.j(-112);
                                  var4 = sa.field_a.j(param0 ^ -14805);
                                  ((km) this).a(var4, (byte) 4, ((km) this).field_n, ((km) this).field_P.field_v[var2], var3);
                                  return true;
                                } else {
                                  L6: {
                                    if (ej.field_e != 74) {
                                      break L6;
                                    } else {
                                      if (se.field_g) {
                                        var2 = rr.field_t / 4;
                                        var3 = 0;
                                        L7: while (true) {
                                          if (var2 <= var3) {
                                            return true;
                                          } else {
                                            var4 = sa.field_a.j(-128);
                                            var5 = sa.field_a.j(-126);
                                            var6 = sa.field_a.f(param0 ^ -26697);
                                            var7 = "My personality type is " + wk.field_a[var5] + " and my rating is " + var6;
                                            int discarded$12 = 51;
                                            this.a(((km) this).field_P.field_v[var4], var7);
                                            var3++;
                                            continue L7;
                                          }
                                        }
                                      } else {
                                        break L6;
                                      }
                                    }
                                  }
                                  return false;
                                }
                              } else {
                                int discarded$13 = -126;
                                this.i();
                                return true;
                              }
                            } else {
                              return true;
                            }
                          } else {
                            L8: {
                              L9: {
                                L10: {
                                  var2 = sa.field_a.g(-2852);
                                  ((km) this).field_P.a(var2, 3);
                                  ta.a(0, -1, (byte) 96, false);
                                  ((km) this).field_b = false;
                                  ((km) this).field_Y.o(-4956);
                                  if (((km) this).field_n == null) {
                                    break L10;
                                  } else {
                                    if ((((km) this).field_P.field_w & 1 << ((km) this).field_h) != 0) {
                                      break L9;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                if (!((km) this).field_P.field_x.a((byte) 123, ((km) this).field_n)) {
                                  if (((km) this).field_P.field_z) {
                                    jo.a(32767, hj.field_n, false, 10);
                                    break L8;
                                  } else {
                                    break L8;
                                  }
                                } else {
                                  break L9;
                                }
                              }
                              jo.a(param0 ^ 18008, wh.field_b, false, 10);
                              break L8;
                            }
                            L11: {
                              if (!sm.field_e) {
                                break L11;
                              } else {
                                if ((1 << ((km) this).field_h & ((km) this).field_P.field_e) != 0) {
                                  break L11;
                                } else {
                                  ((km) this).b(-116);
                                  break L11;
                                }
                              }
                            }
                            return true;
                          }
                        } else {
                          ((km) this).field_i = sa.field_a.j(-57);
                          return true;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              this.a(1, (ob) (Object) sa.field_a, rr.field_t);
              return true;
            }
          } else {
            ((km) this).field_N = sa.field_a.j(-78);
            return true;
          }
        }
    }

    private final void a(int param0, ln param1, ln param2) {
        qm var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
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
        RuntimeException decompiledCaughtException = null;
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
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var5 = (qm) (Object) ((km) this).field_P.field_i.d(0);
            L1: while (true) {
              L2: {
                if (var5 == null) {
                  break L2;
                } else {
                  if (var5.field_o != 3) {
                    var5 = (qm) (Object) ((km) this).field_P.field_i.a((byte) -71);
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
                  var5 = new qm(3, ((km) this).field_n, param2, param1);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var6 = 0;
                ((km) this).field_P.field_i.a((byte) -113, (oh) (Object) var5);
                if (((km) this).field_f) {
                  ((km) this).field_ab.a((df) (Object) var5, 32);
                  int discarded$2 = 0;
                  this.e();
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
            var5_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5_ref;
            stackOut_13_1 = new StringBuilder().append("km.F(").append(41).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + 3 + 41);
        }
    }

    private final void b(int param0, int param1) {
        oh var4 = null;
        int var5 = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        ne var8 = null;
        fs[] var8_array = null;
        int var8_int = 0;
        as var10 = null;
        int var11 = 0;
        nr var12 = null;
        fs[] var13 = null;
        mg var14 = null;
        eg var15 = null;
        mg var16 = null;
        nr var17 = null;
        mg var18 = null;
        Object var19 = null;
        qi var19_ref = null;
        Object var20 = null;
        qm var20_ref = null;
        Object var21 = null;
        hj var21_ref = null;
        int[] var25 = null;
        var19 = null;
        var20 = null;
        var21 = null;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        ((km) this).field_Q = new k();
        ((km) this).field_z.b(false);
        int discarded$3 = 44;
        var25 = this.c();
        ((km) this).field_P.a(param0, 1, ((km) this).field_Q, (se) null);
        ((km) this).field_z.a(0);
        var4 = ((km) this).field_Q.field_a.d(0);
        var5 = 0;
        var6 = new StringBuilder();
        L0: while (true) {
          if (var4 == null) {
            var4 = ((km) this).field_Q.field_a.d(0);
            L1: while (true) {
              if (var4 == null) {
                L2: {
                  ((km) this).field_z.field_C = true;
                  ((km) this).field_P.g(-7954);
                  this.a(true, var25);
                  if (var5 != 0) {
                    jq.a(-29901, (Throwable) null, var6.toString());
                    q.g(-118);
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  var7 = -13 % ((param1 - 35) / 40);
                  if (!((km) this).field_W) {
                    break L3;
                  } else {
                    if ((((km) this).field_P.field_w & 1) != 0) {
                      fl.a(0, "losegame");
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (((km) this).field_W) {
                    var13 = ((km) this).field_P.field_x.a((byte) -23);
                    var8_array = var13;
                    if (var8_array == null) {
                      break L4;
                    } else {
                      if (((km) this).field_n != var13[0]) {
                        break L4;
                      } else {
                        fl.a(0, "wingame");
                        break L4;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                return;
              } else {
                L5: {
                  if (!(var4 instanceof hj)) {
                    break L5;
                  } else {
                    var21_ref = (hj) (Object) var4;
                    if (var21_ref.field_j != null) {
                      if (var21_ref.field_j != ((km) this).field_n) {
                        ((km) this).field_z.a(var21_ref.field_j, var21_ref.field_i, false, var21_ref.field_h);
                        if (((km) this).field_z.field_u < var21_ref.field_h) {
                          ((km) this).field_z.field_u = var21_ref.field_h;
                          break L5;
                        } else {
                          break L5;
                        }
                      } else {
                        var4 = ((km) this).field_Q.field_a.a((byte) -71);
                        continue L1;
                      }
                    } else {
                      var5 = 1;
                      StringBuilder discarded$4 = var6.append("Construction event at " + var21_ref.field_i.field_I + " has no owner.\n");
                      break L5;
                    }
                  }
                }
                var4 = ((km) this).field_Q.field_a.a((byte) -71);
                continue L1;
              }
            }
          } else {
            L6: {
              if (!(var4 instanceof mg)) {
                if (!(var4 instanceof eg)) {
                  if (var4 instanceof qm) {
                    L7: {
                      var20_ref = (qm) (Object) var4;
                      if (0 == var20_ref.field_o) {
                        ((km) this).field_z.a(var20_ref.field_q, -124, 0, var20_ref.field_p);
                        break L7;
                      } else {
                        if (var20_ref.field_o == 1) {
                          ((km) this).field_z.a(var20_ref.field_q, -117, 1, var20_ref.field_p);
                          break L7;
                        } else {
                          if (var20_ref.field_o == 3) {
                            ((km) this).field_z.a(var20_ref.field_p, var20_ref.field_r, (byte) -128, var20_ref.field_q);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    if (((km) this).field_n != var20_ref.field_p) {
                      break L6;
                    } else {
                      break L6;
                    }
                  } else {
                    if (var4 instanceof qi) {
                      var19_ref = (qi) (Object) var4;
                      ((km) this).field_z.a(var19_ref.field_l, -123, 2, var19_ref.field_k);
                      break L6;
                    } else {
                      if (!(var4 instanceof nr)) {
                        break L6;
                      } else {
                        L8: {
                          var12 = (nr) (Object) var4;
                          var17 = var12;
                          if (null == var17.field_j) {
                            break L8;
                          } else {
                            var8_int = 0;
                            L9: while (true) {
                              if (var17.field_j.length <= var8_int) {
                                break L8;
                              } else {
                                var18 = new mg(var12.field_p, var12.field_j[var8_int], var17.field_p.field_t, var12.field_i[var8_int]);
                                ((km) this).field_z.field_hb.a((byte) -113, (oh) (Object) sg.a((byte) 101, var18));
                                if (var18.field_z > ((km) this).field_z.field_y) {
                                  ((km) this).field_z.field_y = var18.field_z;
                                  var8_int++;
                                  continue L9;
                                } else {
                                  var8_int++;
                                  continue L9;
                                }
                              }
                            }
                          }
                        }
                        ((km) this).field_z.field_P[var12.field_p.field_p] = true;
                        break L6;
                      }
                    }
                  }
                } else {
                  var15 = (eg) (Object) var4;
                  ((km) this).field_z.field_m.a((byte) -113, (oh) (Object) new vn(var15));
                  var8 = (ne) (Object) var15.field_v.d(0);
                  L10: while (true) {
                    if (var8 == null) {
                      break L6;
                    } else {
                      L11: {
                        if (var8.field_k == null) {
                          break L11;
                        } else {
                          if (var8.field_r == 0) {
                            break L11;
                          } else {
                            if (var8.field_h != var8.field_k.field_y) {
                              break L11;
                            } else {
                              var16 = new mg(var15.field_p, var8.field_k, var8.field_h, var8.field_r);
                              var10 = bb.a(-2, var16);
                              ((km) this).field_z.field_v.a((byte) -113, (oh) (Object) var10);
                              if (var10.field_x <= ((km) this).field_z.field_y) {
                                break L11;
                              } else {
                                ((km) this).field_z.field_y = var10.field_x;
                                break L11;
                              }
                            }
                          }
                        }
                      }
                      var8 = (ne) (Object) var15.field_v.a((byte) -71);
                      continue L10;
                    }
                  }
                }
              } else {
                var14 = (mg) (Object) var4;
                if (var14.field_G != null) {
                  ((km) this).field_z.field_c.a((byte) -113, (oh) (Object) qn.a(-121, var14));
                  if (var14.field_z > ((km) this).field_z.field_y) {
                    ((km) this).field_z.field_y = var14.field_z;
                    break L6;
                  } else {
                    break L6;
                  }
                } else {
                  var5 = 1;
                  StringBuilder discarded$5 = var6.append("Fleet from " + var14.field_y.field_I + " to " + var14.field_B.field_I + " has no owner.\n");
                  break L6;
                }
              }
            }
            var4 = ((km) this).field_Q.field_a.a((byte) -71);
            continue L0;
          }
        }
    }

    final void d(int param0) {
        if (param0 != -7970) {
            return;
        }
        if (!(((km) this).field_f)) {
            throw new IllegalStateException();
        }
        js.field_f.h(64, param0 ^ -8159);
    }

    private final void j() {
        int var2 = 0;
        float var3 = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        int var6 = 0;
        int var7 = 0;
        float var8 = 0.0f;
        float var9 = 0.0f;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = ShatteredPlansClient.field_F ? 1 : 0;
          var2 = 0;
          if (!((km) this).field_Y.a(true, (byte) 63)) {
            L1: {
              if (je.field_d != 1) {
                break L1;
              } else {
                this.a(td.field_P, (byte) -103, nh.field_p);
                break L1;
              }
            }
            this.a(-3587, pd.field_k, bb.field_b);
            ((km) this).field_z.a(((km) this).field_m, 0, pd.field_k, bb.field_b);
            break L0;
          } else {
            ((km) this).field_T = true;
            var2 = 1;
            ((km) this).field_y = false;
            ((km) this).field_z.field_nb[1] = -1;
            ((km) this).field_z.field_nb[0] = -1;
            ((km) this).field_z.field_p = null;
            ((km) this).field_z.field_S = null;
            break L0;
          }
        }
        L2: {
          var3 = ((km) this).field_z.field_k;
          var4 = ((km) this).field_z.field_E;
          if (!di.field_p[96]) {
            break L2;
          } else {
            var3 = var3 - 5.0f * (((km) this).field_z.field_I + 50.0f) / 300.0f;
            if (0.0f <= var3) {
              break L2;
            } else {
              var3 = 0.0f;
              break L2;
            }
          }
        }
        L3: {
          var5 = ((km) this).field_z.field_I;
          if (di.field_p[97]) {
            var3 = var3 + 5.0f * (((km) this).field_z.field_I + 50.0f) / 300.0f;
            if ((float)((km) this).field_P.field_g.field_k >= var3) {
              break L3;
            } else {
              var3 = (float)((km) this).field_P.field_g.field_k;
              break L3;
            }
          } else {
            break L3;
          }
        }
        L4: {
          if (!di.field_p[98]) {
            break L4;
          } else {
            var4 = var4 - 5.0f * (((km) this).field_z.field_I + 50.0f) / 300.0f;
            if (var4 >= 0.0f) {
              break L4;
            } else {
              var4 = 0.0f;
              break L4;
            }
          }
        }
        L5: {
          if (!di.field_p[99]) {
            break L5;
          } else {
            var4 = var4 + 5.0f * (((km) this).field_z.field_I + 50.0f) / 300.0f;
            if ((float)((km) this).field_P.field_g.field_b < var4) {
              var4 = (float)((km) this).field_P.field_g.field_b;
              break L5;
            } else {
              break L5;
            }
          }
        }
        L6: {
          L7: {
            if (di.field_p[27]) {
              break L7;
            } else {
              if (di.field_p[87]) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          var5 = var5 / 1.100000023841858f;
          if (((km) this).field_z.field_g > var5) {
            var5 = ((km) this).field_z.field_g;
            break L6;
          } else {
            break L6;
          }
        }
        L8: {
          L9: {
            if (di.field_p[26]) {
              break L9;
            } else {
              if (di.field_p[88]) {
                break L9;
              } else {
                break L8;
              }
            }
          }
          var5 = var5 * 1.100000023841858f;
          if (((km) this).field_z.field_F < var5) {
            var5 = ((km) this).field_z.field_F;
            break L8;
          } else {
            break L8;
          }
        }
        L10: {
          L11: {
            if (var2 != 0) {
              break L11;
            } else {
              if ((2 & rf.field_n) != 0) {
                L12: {
                  if (((km) this).field_G) {
                    L13: {
                      var6 = -((km) this).field_z.field_db + pd.field_k;
                      var7 = -((km) this).field_z.field_e + bb.field_b;
                      var3 = var3 - ((km) this).field_z.field_I * (float)var6 / 300.0f;
                      if (0.0f <= var3) {
                        break L13;
                      } else {
                        var3 = 0.0f;
                        break L13;
                      }
                    }
                    L14: {
                      var4 = var4 - (float)var7 * ((km) this).field_z.field_I / 300.0f;
                      if (var3 > (float)((km) this).field_P.field_g.field_k) {
                        var3 = (float)((km) this).field_P.field_g.field_k;
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    L15: {
                      if (var4 >= 0.0f) {
                        break L15;
                      } else {
                        var4 = 0.0f;
                        break L15;
                      }
                    }
                    if (var4 <= (float)((km) this).field_P.field_g.field_b) {
                      break L12;
                    } else {
                      var4 = (float)((km) this).field_P.field_g.field_b;
                      break L12;
                    }
                  } else {
                    break L12;
                  }
                }
                ((km) this).field_z.field_e = bb.field_b;
                ((km) this).field_G = true;
                ((km) this).field_z.field_db = pd.field_k;
                break L10;
              } else {
                break L11;
              }
            }
          }
          ((km) this).field_G = false;
          break L10;
        }
        L16: {
          if (var2 != 0) {
            break L16;
          } else {
            if (so.field_o == 0) {
              break L16;
            } else {
              L17: {
                var6 = 320;
                var7 = ((km) this).field_Y.d((byte) 14) / 2;
                var8 = var3 + (float)(pd.field_k - var6) * ((km) this).field_z.field_I / 300.0f;
                var9 = (float)(bb.field_b - var7) * ((km) this).field_z.field_I / 300.0f + var4;
                if (0 < so.field_o) {
                  var10 = 0;
                  L18: while (true) {
                    if (so.field_o * 2 <= var10) {
                      if (var5 <= ((km) this).field_z.field_F) {
                        break L17;
                      } else {
                        var5 = ((km) this).field_z.field_F;
                        break L17;
                      }
                    } else {
                      var5 = var5 * 1.100000023841858f;
                      var10++;
                      continue L18;
                    }
                  }
                } else {
                  var10 = 2 * so.field_o;
                  L19: while (true) {
                    if (var10 >= 0) {
                      if (((km) this).field_z.field_g <= var5) {
                        break L17;
                      } else {
                        var5 = ((km) this).field_z.field_g;
                        break L17;
                      }
                    } else {
                      var5 = var5 / 1.100000023841858f;
                      var10++;
                      continue L19;
                    }
                  }
                }
              }
              L20: {
                var3 = var8 - var5 * (float)(-var6 + pd.field_k) / 300.0f;
                var4 = var9 - var5 * (float)(bb.field_b - var7) / 300.0f;
                if (0.0f > var3) {
                  var3 = 0.0f;
                  break L20;
                } else {
                  break L20;
                }
              }
              L21: {
                if (0.0f > var4) {
                  var4 = 0.0f;
                  break L21;
                } else {
                  break L21;
                }
              }
              L22: {
                if ((float)((km) this).field_P.field_g.field_k >= var3) {
                  break L22;
                } else {
                  var3 = (float)((km) this).field_P.field_g.field_k;
                  break L22;
                }
              }
              if (var4 > (float)((km) this).field_P.field_g.field_b) {
                var4 = (float)((km) this).field_P.field_g.field_b;
                break L16;
              } else {
                break L16;
              }
            }
          }
        }
        L23: {
          L24: {
            if (((km) this).field_z.field_k != var3) {
              break L24;
            } else {
              if (((km) this).field_z.field_E != var4) {
                break L24;
              } else {
                if (((km) this).field_z.field_I != var5) {
                  break L24;
                } else {
                  break L23;
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
          break L23;
        }
        L25: {
          if (rf.field_n != 0) {
            if (((km) this).field_z.field_S == null) {
              break L25;
            } else {
              boolean discarded$1 = this.a((byte) 121, ((km) this).field_z.field_S);
              break L25;
            }
          } else {
            ((km) this).field_I = ((km) this).field_F;
            ((km) this).field_O = 0;
            break L25;
          }
        }
        ((km) this).field_z.c(pd.field_k, bb.field_b, 119);
    }

    private final void a(boolean param0, int param1, ln param2, ln param3) {
        RuntimeException var5 = null;
        mg var5_ref = null;
        int var6 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var5_ref = (mg) (Object) param3.field_T.d(0);
            L1: while (true) {
              L2: {
                if (var5_ref == null) {
                  break L2;
                } else {
                  L3: {
                    if (param2 != var5_ref.field_B) {
                      break L3;
                    } else {
                      if (var5_ref.field_G == ((km) this).field_n) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var5_ref = (mg) (Object) param3.field_T.a((byte) -71);
                  continue L1;
                }
              }
              L4: {
                if (var5_ref != null) {
                  var5_ref.field_z = var5_ref.field_z + param1;
                  break L4;
                } else {
                  var5_ref = new mg(param3, param2, param1);
                  param3.field_T.a((byte) -113, (oh) (Object) var5_ref);
                  param2.field_s.a((df) (Object) var5_ref, 32);
                  ((km) this).field_P.field_p.a((byte) 62, (vp) (Object) var5_ref);
                  break L4;
                }
              }
              L5: {
                param3.field_J = param3.field_J - param1;
                ((km) this).field_C[param3.field_p] = ((km) this).field_C[param3.field_p] - param1;
                kr.a((byte) 83, param3);
                fl.a(param2, (byte) 75);
                this.a(((km) this).field_n, -95);
                if (((km) this).field_f) {
                  ((km) this).field_v.a((byte) 9, (cn) (Object) var5_ref);
                  int discarded$1 = 0;
                  this.e();
                  break L5;
                } else {
                  break L5;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("km.U(").append(0).append(44).append(param1).append(44);
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          L7: {
            stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(44);
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param3 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L7;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L7;
            }
          }
          throw r.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 41);
        }
    }

    private final void l(int param0) {
        sl var2 = js.field_f;
        var2.h(59, 255);
        if (param0 >= -75) {
            return;
        }
        var2.field_j = var2.field_j + 2;
        int var3 = var2.field_j;
        var2.c(((km) this).field_P.field_O, (byte) -109);
        se.a(tr.a((byte) 81, ((km) this).field_o), -256, tr.a((byte) 93, ((km) this).field_ab), rp.a(-125, ((km) this).field_v), var2);
        ((km) this).field_ab.b((byte) 35);
        ((km) this).field_o.b((byte) 87);
        ((km) this).field_v.a((byte) 112);
        var2.f(-549342136, -var3 + var2.field_j);
        ((km) this).field_g = -1;
        ((km) this).field_k = -1;
        if (sm.field_e) {
            ((km) this).m(126);
        }
    }

    private final void a(mg param0, int param1) {
        RuntimeException var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            param0.field_y.field_J = param0.field_y.field_J - param1;
            ((km) this).field_C[param0.field_y.field_p] = ((km) this).field_C[param0.field_y.field_p] - param1;
            param0.field_z = param0.field_z + param1;
            if (param0.field_z >= 0) {
              L1: {
                if (0 != param0.field_z) {
                  break L1;
                } else {
                  param0.b((byte) -106);
                  param0.a(16);
                  param0.d(true);
                  break L1;
                }
              }
              L2: {
                this.a(((km) this).field_n, -117);
                if (((km) this).field_f) {
                  ((km) this).field_v.a((byte) 9, (cn) (Object) param0);
                  int discarded$2 = 0;
                  this.e();
                  break L2;
                } else {
                  break L2;
                }
              }
              break L0;
            } else {
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("km.IA(");
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
          throw r.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 44 + 10755 + 41);
        }
    }

    private final int a(byte param0) {
        if (param0 < 54) {
            ((km) this).field_c = null;
        }
        int var2 = 0;
        if (!(!di.field_p[81])) {
            var2 = 81;
        }
        if (di.field_p[86]) {
            if (!(0 == var2)) {
                return 0;
            }
            var2 = 86;
        }
        if (di.field_p[82]) {
            if (var2 != 0) {
                return 0;
            }
            var2 = 82;
        }
        return var2;
    }

    final void b(int param0) {
        if (!((km) this).field_f) {
            throw new IllegalStateException();
        }
        ((km) this).field_P.field_e = ((km) this).field_P.field_e | 1 << ((km) this).field_h;
        int var2 = 9 / ((-64 - param0) / 51);
        js.field_f.h(65, 255);
    }

    private final boolean a(byte param0, mg param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        ln var5 = null;
        int var6 = 0;
        int var7 = 0;
        int stackIn_6_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_51_0 = 0;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_55_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_37_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_50_0 = 0;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        String stackOut_54_2 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            if (param1.field_G != ((km) this).field_n) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0 != 0;
            } else {
              if (((km) this).field_O <= 0) {
                L1: {
                  if (rf.field_n != 1) {
                    break L1;
                  } else {
                    if (param1 != ((km) this).field_z.field_rb) {
                      ((km) this).field_z.b((byte) -127);
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                }
                L2: {
                  L3: {
                    if (rf.field_n != 1) {
                      break L3;
                    } else {
                      if (((km) this).field_z.field_Ab) {
                        L4: {
                          var3_int = 1;
                          var4 = this.a((byte) 57);
                          var5 = ((km) this).field_z.field_S.field_y;
                          if (82 == var4) {
                            L5: {
                              if (var5.field_N < var5.field_J) {
                                stackOut_38_0 = var5.field_J - var5.field_N;
                                stackIn_39_0 = stackOut_38_0;
                                break L5;
                              } else {
                                stackOut_37_0 = var5.field_J;
                                stackIn_39_0 = stackOut_37_0;
                                break L5;
                              }
                            }
                            var3_int = stackIn_39_0;
                            break L4;
                          } else {
                            if (var4 == 86) {
                              var3_int = 5;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                        }
                        L6: {
                          if (!((km) this).field_P.field_o.field_e) {
                            stackOut_42_0 = var5.field_N;
                            stackIn_43_0 = stackOut_42_0;
                            break L6;
                          } else {
                            stackOut_41_0 = 0;
                            stackIn_43_0 = stackOut_41_0;
                            break L6;
                          }
                        }
                        L7: {
                          var6 = stackIn_43_0;
                          if (~(var5.field_J - var6) <= ~var3_int) {
                            break L7;
                          } else {
                            var3_int = var5.field_J + -var6;
                            break L7;
                          }
                        }
                        if (var3_int > 0) {
                          int discarded$5 = 10755;
                          this.a(((km) this).field_z.field_S, var3_int);
                          break L2;
                        } else {
                          gm discarded$6 = qk.a(jj.field_l, 47);
                          break L2;
                        }
                      } else {
                        break L3;
                      }
                    }
                  }
                  L8: {
                    if (rf.field_n != 1) {
                      break L8;
                    } else {
                      if (!((km) this).field_z.field_Gb) {
                        break L8;
                      } else {
                        L9: {
                          var3_int = -1;
                          var4 = this.a((byte) 55);
                          if (var4 == 82) {
                            var3_int = -((km) this).field_z.field_S.field_z;
                            break L9;
                          } else {
                            if (var4 == 86) {
                              L10: {
                                if (((km) this).field_z.field_S.field_z < 5) {
                                  stackOut_23_0 = ((km) this).field_z.field_S.field_z;
                                  stackIn_24_0 = stackOut_23_0;
                                  break L10;
                                } else {
                                  stackOut_22_0 = 5;
                                  stackIn_24_0 = stackOut_22_0;
                                  break L10;
                                }
                              }
                              var3_int = -stackIn_24_0;
                              break L9;
                            } else {
                              break L9;
                            }
                          }
                        }
                        int discarded$7 = 10755;
                        this.a(((km) this).field_z.field_S, var3_int);
                        if (((km) this).field_z.field_S.field_z != 0) {
                          break L2;
                        } else {
                          ((km) this).field_z.field_nb[1] = -1;
                          ((km) this).field_z.field_nb[0] = -1;
                          ((km) this).field_z.field_S = null;
                          ((km) this).field_z.b((byte) -51);
                          break L2;
                        }
                      }
                    }
                  }
                  if (rf.field_n != 1) {
                    break L2;
                  } else {
                    if (((km) this).field_z.field_Bb) {
                      var3_int = -param1.field_z;
                      int discarded$8 = 10755;
                      this.a(((km) this).field_z.field_S, var3_int);
                      ((km) this).field_z.field_nb[1] = -1;
                      ((km) this).field_z.field_S = null;
                      ((km) this).field_z.field_nb[0] = -1;
                      ((km) this).field_z.b((byte) -74);
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                }
                L11: {
                  int fieldTemp$9 = ((km) this).field_I - 5;
                  ((km) this).field_I = ((km) this).field_I - 5;
                  if (0 <= fieldTemp$9) {
                    break L11;
                  } else {
                    ((km) this).field_I = 0;
                    break L11;
                  }
                }
                ((km) this).field_O = ((km) this).field_I;
                ((km) this).a(2);
                stackOut_50_0 = 1;
                stackIn_51_0 = stackOut_50_0;
                break L0;
              } else {
                ((km) this).field_O = ((km) this).field_O - 1;
                return true;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var3 = decompiledCaughtException;
            stackOut_52_0 = (RuntimeException) var3;
            stackOut_52_1 = new StringBuilder().append("km.FA(").append(121).append(44);
            stackIn_54_0 = stackOut_52_0;
            stackIn_54_1 = stackOut_52_1;
            stackIn_53_0 = stackOut_52_0;
            stackIn_53_1 = stackOut_52_1;
            if (param1 == null) {
              stackOut_54_0 = (RuntimeException) (Object) stackIn_54_0;
              stackOut_54_1 = (StringBuilder) (Object) stackIn_54_1;
              stackOut_54_2 = "null";
              stackIn_55_0 = stackOut_54_0;
              stackIn_55_1 = stackOut_54_1;
              stackIn_55_2 = stackOut_54_2;
              break L12;
            } else {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "{...}";
              stackIn_55_0 = stackOut_53_0;
              stackIn_55_1 = stackOut_53_1;
              stackIn_55_2 = stackOut_53_2;
              break L12;
            }
          }
          throw r.a((Throwable) (Object) stackIn_55_0, stackIn_55_2 + 41);
        }
        return stackIn_51_0 != 0;
    }

    final void a(int param0) {
        int var3 = 0;
        ln var4 = null;
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!(((km) this).field_R.length >= ((km) this).field_P.field_g.field_e.length)) {
            ((km) this).field_R = new fs[((km) this).field_P.field_g.field_e.length];
            ((km) this).field_C = new int[((km) this).field_P.field_g.field_e.length];
            ((km) this).field_l = new sd[((km) this).field_P.field_g.field_e.length];
        }
        ln[] var7 = ((km) this).field_P.field_g.field_e;
        ln[] var2 = var7;
        for (var3 = 0; var3 < var7.length; var3++) {
            var4 = var7[var3];
            var5 = var4.field_p;
            ((km) this).field_R[var5] = var4.field_y;
            ((km) this).field_C[var5] = var4.field_y == ((km) this).field_n ? var4.field_J : var4.field_x;
            ((km) this).field_l[var5] = var4.field_R;
        }
        if (param0 != 2) {
            ((km) this).field_l = null;
        }
        ((km) this).field_z.a(((km) this).field_C, true, ((km) this).field_l, ((km) this).field_R, true);
    }

    final void m(int param0) {
        sl var2 = null;
        L0: {
          if (param0 >= 122) {
            break L0;
          } else {
            this.a((fs) null, -117);
            break L0;
          }
        }
        L1: {
          if (!((km) this).field_f) {
            this.d((byte) -81);
            break L1;
          } else {
            L2: {
              if (-1 == ((km) this).field_k) {
                break L2;
              } else {
                this.l(-113);
                break L2;
              }
            }
            var2 = js.field_f;
            var2.h(61, 255);
            var2.c(((km) this).field_P.field_O, (byte) -93);
            var2.e(11135, this.f(-41));
            ((km) this).field_L = true;
            if (((km) this).field_N > 1) {
              ((km) this).field_N = ((km) this).field_N - 1;
              break L1;
            } else {
              break L1;
            }
          }
        }
    }

    private final void k() {
        if (!((km) this).field_L) {
            throw new RuntimeException();
        }
        int var3 = -27;
        sl var2 = js.field_f;
        var2.h(62, 255);
        var2.c(((km) this).field_P.field_O, (byte) -126);
        ((km) this).field_L = false;
    }

    private final void a(fs param0, fs param1) {
        RuntimeException var4 = null;
        String var5 = null;
        String var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            L1: {
              if (((km) this).field_n == param0) {
                var6 = re.a(ud.field_b, 4371, new String[1]);
                ((km) this).field_H.a((oh) (Object) new n(param1, (fs) null, var6), 0);
                break L1;
              } else {
                if (param1 != ((km) this).field_n) {
                  break L1;
                } else {
                  var5 = re.a(wf.field_h, 4371, new String[1]);
                  ((km) this).field_H.a((oh) (Object) new n(param0, (fs) null, var5), 0);
                  break L1;
                }
              }
            }
            L2: {
              if (null == ((km) this).field_s[param1.field_x]) {
                break L2;
              } else {
                ((km) this).field_s[param1.field_x].a(param0, 7686);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var4;
            stackOut_7_1 = new StringBuilder().append("km.P(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw r.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + 1 + 41);
        }
    }

    private final void e() {
        if (((km) this).field_L) {
            int discarded$0 = -92;
            this.k();
        }
        if (((km) this).field_g == -1) {
            ((km) this).field_g = 250;
        }
        ((km) this).field_k = 25;
    }

    private final void a(byte param0, int param1, int param2) {
        ((km) this).field_P.c(0);
        boolean[][] discarded$0 = ((km) this).field_P.b(param2, 0);
        this.b(param1, 123);
        ((km) this).field_z.field_d = param1;
    }

    private final int f(int param0) {
        int var2 = 0;
        qm var3 = null;
        int var4 = 0;
        qa var5 = null;
        mg var6 = null;
        int var7 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = 406213746;
        var4 = -1 % ((param0 - 29) / 63);
        var3 = (qm) (Object) ((km) this).field_P.field_i.d(0);
        L0: while (true) {
          if (var3 == null) {
            var5 = (qa) (Object) ((km) this).field_P.field_q.d(0);
            L1: while (true) {
              if (var5 == null) {
                var6 = (mg) (Object) ((km) this).field_P.field_p.a(true);
                L2: while (true) {
                  if (var6 == null) {
                    return var2;
                  } else {
                    var2 = var2 + ((1 + var6.field_y.field_p) * (1 + (var6.field_B.field_p - -65536)) - -(var6.field_z * ((1 + var6.field_B.field_p) * (1 + var6.field_y.field_p))));
                    var6 = (mg) (Object) ((km) this).field_P.field_p.a((byte) -68);
                    continue L2;
                  }
                }
              } else {
                var2 = var2 + (var5.field_u.field_p * (var5.field_v ^ 11) << 11);
                var5 = (qa) (Object) ((km) this).field_P.field_q.a((byte) -71);
                continue L1;
              }
            }
          } else {
            L3: {
              stackOut_2_0 = var2;
              stackOut_2_1 = 17 * var3.field_q.field_p + var3.field_o;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_3_0 = stackOut_2_0;
              stackIn_3_1 = stackOut_2_1;
              if (var3.field_r != null) {
                stackOut_4_0 = stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = var3.field_r.field_p - -7;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                break L3;
              } else {
                stackOut_3_0 = stackIn_3_0;
                stackOut_3_1 = stackIn_3_1;
                stackOut_3_2 = 5;
                stackIn_5_0 = stackOut_3_0;
                stackIn_5_1 = stackOut_3_1;
                stackIn_5_2 = stackOut_3_2;
                break L3;
              }
            }
            var2 = stackIn_5_0 + stackIn_5_1 * stackIn_5_2;
            var3 = (qm) (Object) ((km) this).field_P.field_i.a((byte) -71);
            continue L0;
          }
        }
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
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4_int = 30 % ((-1 - param2) / 62);
            L1: while (true) {
              if (param1 <= 0) {
                break L0;
              } else {
                L2: {
                  var5 = param0.j(-82);
                  param1--;
                  if (var5 == 0) {
                    var6 = param0.j(-108);
                    var7 = ~((km) this).field_n.field_A & var6;
                    ((km) this).field_n.field_A = var6;
                    param1--;
                    if (var7 == 0) {
                      break L2;
                    } else {
                      var8 = 0;
                      L3: while (true) {
                        if (~var8 <= ~((km) this).field_P.field_r) {
                          break L2;
                        } else {
                          L4: {
                            if (0 == (var7 & 1 << var8)) {
                              break L4;
                            } else {
                              int discarded$1 = 1;
                              this.a(((km) this).field_P.field_v[var8], ((km) this).field_n);
                              break L4;
                            }
                          }
                          var8++;
                          continue L3;
                        }
                      }
                    }
                  } else {
                    if (var5 != 1) {
                      break L2;
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
                      continue L1;
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
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("km.K(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    private final void a(int param0, ln param1) {
        qm var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var4 = (qm) (Object) ((km) this).field_P.field_i.d(0);
            L1: while (true) {
              L2: {
                if (var4 == null) {
                  break L2;
                } else {
                  if (param0 != var4.field_o) {
                    var4 = (qm) (Object) ((km) this).field_P.field_i.a((byte) -71);
                    continue L1;
                  } else {
                    var4.field_q = param1;
                    break L2;
                  }
                }
              }
              L3: {
                if (var4 != null) {
                  break L3;
                } else {
                  var4 = new qm(param0, ((km) this).field_n, param1);
                  break L3;
                }
              }
              L4: {
                ((km) this).field_P.field_i.a((byte) -113, (oh) (Object) var4);
                if (!((km) this).field_f) {
                  break L4;
                } else {
                  ((km) this).field_ab.a((df) (Object) var4, 32);
                  int discarded$2 = 0;
                  this.e();
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4_ref;
            stackOut_11_1 = new StringBuilder().append("km.R(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw r.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + 0 + 41);
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
        oh var11_ref_oh = null;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        ne var13 = null;
        int var14_int = 0;
        um var14 = null;
        int var15_int = 0;
        sd var15 = null;
        int var16 = 0;
        ln[] var17 = null;
        ln var18 = null;
        fs[] var19 = null;
        fs var20 = null;
        Object var21 = null;
        hj var21_ref = null;
        Object var22 = null;
        eg var22_ref = null;
        fs[] var23 = null;
        fs var24 = null;
        fs[] var25 = null;
        fs var26 = null;
        Object var27 = null;
        qi var27_ref = null;
        Object var28 = null;
        qm var28_ref = null;
        Object var29 = null;
        mg var29_ref = null;
        um var30 = null;
        fs var31 = null;
        int[] var32 = null;
        int[] var33 = null;
        int[] var34 = null;
        int[] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        int[] var51 = null;
        int[] var52 = null;
        int[] var53 = null;
        int[] var54 = null;
        int[] var55 = null;
        int[] var56 = null;
        int[] var57 = null;
        int[] var58 = null;
        int[] var59 = null;
        int[] var60 = null;
        int[] var61 = null;
        int[] var62 = null;
        int[] var63 = null;
        int stackIn_66_0 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_65_0 = 0;
        int stackOut_64_0 = 0;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        var21 = null;
        var22 = null;
        var27 = null;
        var28 = null;
        var29 = null;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var56 = new int[((km) this).field_P.field_r];
            var48 = var56;
            var40 = var48;
            var32 = var40;
            var3_array = var32;
            var57 = new int[((km) this).field_P.field_r];
            var49 = var57;
            var41 = var49;
            var33 = var41;
            var4 = var33;
            var61 = new int[((km) this).field_P.field_r];
            var53 = var61;
            var45 = var53;
            var37 = var45;
            var5 = var37;
            var58 = new int[((km) this).field_P.field_r];
            var50 = var58;
            var42 = var50;
            var34 = var42;
            var6 = var34;
            var60 = new int[((km) this).field_P.field_r];
            var52 = var60;
            var44 = var52;
            var36 = var44;
            var7 = var36;
            var59 = new int[((km) this).field_P.field_r];
            var51 = var59;
            var43 = var51;
            var35 = var43;
            var8 = var35;
            var63 = new int[((km) this).field_P.field_r];
            var55 = var63;
            var47 = var55;
            var39 = var47;
            var9 = var39;
            var62 = new int[((km) this).field_P.field_r];
            var54 = var62;
            var46 = var54;
            var38 = var46;
            var10 = var38;
            var17 = ((km) this).field_P.field_g.field_e;
            var12 = 0;
            L1: while (true) {
              if (var12 >= var17.length) {
                var19 = ((km) this).field_P.field_v;
                var12 = 0;
                L2: while (true) {
                  if (var19.length <= var12) {
                    L3: {
                      if (((km) this).field_Q != null) {
                        var11_ref_oh = ((km) this).field_Q.field_a.d(0);
                        L4: while (true) {
                          if (var11_ref_oh == null) {
                            break L3;
                          } else {
                            L5: {
                              if (!(var11_ref_oh instanceof hj)) {
                                break L5;
                              } else {
                                var21_ref = (hj) (Object) var11_ref_oh;
                                if (var21_ref.field_j == null) {
                                  break L5;
                                } else {
                                  var7[var21_ref.field_j.field_x] = var7[var21_ref.field_j.field_x] + var21_ref.field_h;
                                  break L5;
                                }
                              }
                            }
                            L6: {
                              if (!(var11_ref_oh instanceof eg)) {
                                break L6;
                              } else {
                                var22_ref = (eg) (Object) var11_ref_oh;
                                var13_int = 0;
                                L7: while (true) {
                                  if (((km) this).field_P.field_r <= var13_int) {
                                    L8: {
                                      if (var22_ref.field_i != var22_ref.field_w) {
                                        L9: {
                                          if (null == var22_ref.field_w) {
                                            break L9;
                                          } else {
                                            var22_ref.field_w.field_q.field_a = var22_ref.field_w.field_q.field_a + 1;
                                            break L9;
                                          }
                                        }
                                        L10: {
                                          if (null == var22_ref.field_i) {
                                            break L10;
                                          } else {
                                            var22_ref.field_i.field_q.field_m = var22_ref.field_i.field_q.field_m + 1;
                                            break L10;
                                          }
                                        }
                                        var25 = var22_ref.field_h;
                                        var14_int = 0;
                                        L11: while (true) {
                                          if (var25.length <= var14_int) {
                                            break L8;
                                          } else {
                                            L12: {
                                              var26 = var25[var14_int];
                                              if (var26 == null) {
                                                break L12;
                                              } else {
                                                break L12;
                                              }
                                            }
                                            var14_int++;
                                            continue L11;
                                          }
                                        }
                                      } else {
                                        L13: {
                                          if (null == var22_ref.field_i) {
                                            break L13;
                                          } else {
                                            var22_ref.field_i.field_q.field_y = var22_ref.field_i.field_q.field_y + 1;
                                            break L13;
                                          }
                                        }
                                        var23 = var22_ref.field_h;
                                        var14_int = 0;
                                        L14: while (true) {
                                          if (var14_int >= var23.length) {
                                            break L8;
                                          } else {
                                            L15: {
                                              var24 = var23[var14_int];
                                              if (var24 == null) {
                                                break L15;
                                              } else {
                                                break L15;
                                              }
                                            }
                                            var14_int++;
                                            continue L14;
                                          }
                                        }
                                      }
                                    }
                                    var13 = (ne) (Object) var22_ref.field_v.d(0);
                                    L16: while (true) {
                                      if (var13 == null) {
                                        break L6;
                                      } else {
                                        L17: {
                                          if (var22_ref.field_w != var13.field_h) {
                                            var10[var13.field_h.field_x] = var10[var13.field_h.field_x] + var13.field_i;
                                            break L17;
                                          } else {
                                            break L17;
                                          }
                                        }
                                        var13 = (ne) (Object) var22_ref.field_v.a((byte) -71);
                                        continue L16;
                                      }
                                    }
                                  } else {
                                    var8[var13_int] = var8[var13_int] + var22_ref.field_k[var13_int];
                                    var13_int++;
                                    continue L7;
                                  }
                                }
                              }
                            }
                            L18: {
                              if (var11_ref_oh instanceof qi) {
                                var27_ref = (qi) (Object) var11_ref_oh;
                                var8[var27_ref.field_k.field_x] = var8[var27_ref.field_k.field_x] + var27_ref.field_i;
                                var27_ref.field_k.field_q.field_s = var27_ref.field_k.field_q.field_s + 1;
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            L19: {
                              if (var11_ref_oh instanceof qm) {
                                var28_ref = (qm) (Object) var11_ref_oh;
                                var28_ref.field_p.field_q.field_s = var28_ref.field_p.field_q.field_s + 1;
                                break L19;
                              } else {
                                break L19;
                              }
                            }
                            L20: {
                              if (!(var11_ref_oh instanceof mg)) {
                                break L20;
                              } else {
                                var29_ref = (mg) (Object) var11_ref_oh;
                                var30 = var29_ref.field_G.field_q;
                                var30.field_t = var30.field_t + 1;
                                var30.field_i = var30.field_i + var29_ref.field_z;
                                var9[var29_ref.field_G.field_x] = var9[var29_ref.field_G.field_x] + var29_ref.field_z;
                                break L20;
                              }
                            }
                            var11_ref_oh = ((km) this).field_Q.field_a.a((byte) -71);
                            continue L4;
                          }
                        }
                      } else {
                        break L3;
                      }
                    }
                    L21: {
                      if (((km) this).field_P.field_O == -1) {
                        stackOut_65_0 = 0;
                        stackIn_66_0 = stackOut_65_0;
                        break L21;
                      } else {
                        stackOut_64_0 = ((km) this).field_P.field_O % 100;
                        stackIn_66_0 = stackOut_64_0;
                        break L21;
                      }
                    }
                    var11 = stackIn_66_0;
                    var12 = 0;
                    L22: while (true) {
                      if (((km) this).field_P.field_r <= var12) {
                        break L0;
                      } else {
                        L23: {
                          var31 = ((km) this).field_P.field_v[var12];
                          var14 = var31.field_q;
                          var14.field_g[var11] = var56[var12];
                          var14.field_f[var11] = var57[var12];
                          var14.field_h[var11] = var58[var12];
                          if (var56[var12] > var14.field_A) {
                            var14.field_A = var56[var12];
                            break L23;
                          } else {
                            break L23;
                          }
                        }
                        L24: {
                          var14.field_v = var14.field_v + var59[var12];
                          if (var57[var12] > var14.field_x) {
                            var14.field_x = var57[var12];
                            break L24;
                          } else {
                            break L24;
                          }
                        }
                        L25: {
                          var14.field_o = var14.field_o + var60[var12];
                          var14.field_r = var14.field_e + (var14.field_o - var56[var12]);
                          if (var31.field_i.g(115)) {
                            break L25;
                          } else {
                            break L25;
                          }
                        }
                        var12++;
                        continue L22;
                      }
                    }
                  } else {
                    L26: {
                      var20 = var19[var12];
                      var14_int = var20.field_x;
                      if (((km) this).field_P.field_o.field_i) {
                        if (null == var20.field_m) {
                          break L26;
                        } else {
                          var4[var14_int] = var20.field_m.field_r;
                          break L26;
                        }
                      } else {
                        var15 = (sd) (Object) var20.field_i.d(0);
                        L27: while (true) {
                          if (var15 == null) {
                            break L26;
                          } else {
                            var4[var14_int] = var4[var14_int] + var15.field_r;
                            var15 = (sd) (Object) var20.field_i.a((byte) -71);
                            continue L27;
                          }
                        }
                      }
                    }
                    var12++;
                    continue L2;
                  }
                }
              } else {
                L28: {
                  var18 = var17[var12];
                  if (null != var18.field_y) {
                    var14_int = var18.field_y.field_x;
                    var6[var14_int] = var6[var14_int] + 1;
                    var3_array[var14_int] = var3_array[var14_int] + var18.field_x;
                    if (var18.field_G[0] >= 0) {
                      var15_int = 0;
                      L29: while (true) {
                        if (4 <= var15_int) {
                          break L28;
                        } else {
                          var5[var14_int] = var5[var14_int] + var18.field_G[var15_int];
                          var15_int++;
                          continue L29;
                        }
                      }
                    } else {
                      break L28;
                    }
                  } else {
                    break L28;
                  }
                }
                var12++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L30: {
            var3 = decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) var3;
            stackOut_78_1 = new StringBuilder().append("km.SA(").append(1).append(44);
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param1 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L30;
            } else {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L30;
            }
          }
          throw r.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + 41);
        }
    }

    public final void a(byte param0, fs param1, fs param2) {
        RuntimeException var4 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
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
                  param1.field_w = param1.field_w | 1 << param2.field_x;
                  param2.field_A = param2.field_A | 1 << param1.field_x;
                  if ((1 << param2.field_x & param1.field_A) == 0) {
                    if (((km) this).field_s[param2.field_x] != null) {
                      ((km) this).field_s[param2.field_x].a(param1, param0 ^ -7737);
                      break L3;
                    } else {
                      break L3;
                    }
                  } else {
                    L4: {
                      if (null != ((km) this).field_s[param2.field_x]) {
                        ((km) this).field_s[param2.field_x].a(param1, (byte) -42);
                        break L4;
                      } else {
                        break L4;
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
          L5: {
            var4 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var4;
            stackOut_21_1 = new StringBuilder().append("km.Q(").append(param0).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L5;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L5;
            }
          }
          L6: {
            stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
            stackOut_24_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(44);
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param2 == null) {
              stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
              stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L6;
            } else {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
    }

    final void c(boolean param0) {
        if (!(((km) this).field_f)) {
            throw new IllegalStateException();
        }
        if (param0) {
            ((km) this).c(false);
        }
        js.field_f.h(63, 255);
    }

    final void a(int param0, fs param1) {
        ka var3 = null;
        ka[] var4 = null;
        int var5 = 0;
        ka var6 = null;
        int var7 = 0;
        int var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
            ((km) this).field_P.a(-5, param1);
            var3 = new ka(((km) this).field_P, param1, (mn) this, 2);
            var4 = new ka[((km) this).field_s.length + 1];
            for (var5 = 0; var5 < ((km) this).field_s.length; var5++) {
                if (!(((km) this).field_s[var5] == null)) {
                    var4[var5] = new ka(((km) this).field_P, ((km) this).field_P.field_v[var5], (mn) this, 2);
                    var6 = (ka) (Object) ((km) this).field_s[var5];
                    for (var7 = 0; var6.field_i.length > var7; var7++) {
                        var4[var5].field_i[var7] = var6.field_i[var7];
                    }
                }
            }
            var4[param1.field_x] = new ka(((km) this).field_P, param1, (mn) this, param0);
            var4[var5] = var3;
            ((km) this).field_s = (uj[]) (Object) var4;
        } catch (RuntimeException runtimeException) {
            throw r.a((Throwable) (Object) runtimeException, "km.O(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void g(int param0) {
        int var2_int = 0;
        fs[] var2 = null;
        mg var2_ref = null;
        int var3_int = 0;
        qa var3 = null;
        qm var4 = null;
        ln[] var5 = null;
        int var6 = 0;
        ln var7 = null;
        int var8 = 0;
        fs[] var9 = null;
        int var10 = 0;
        fs var11 = null;
        int stackIn_6_0 = 0;
        boolean stackIn_7_0 = false;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        boolean stackOut_6_0 = false;
        boolean stackOut_2_0 = false;
        L0: {
          var8 = ShatteredPlansClient.field_F ? 1 : 0;
          if (!((km) this).field_f) {
            break L0;
          } else {
            L1: {
              if (0 > ((km) this).field_h) {
                L2: {
                  if (oq.field_j == 13) {
                    stackOut_5_0 = 0;
                    stackIn_6_0 = stackOut_5_0;
                    break L2;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
                stackOut_6_0 = stackIn_6_0 != 0 & ge.field_n;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                stackOut_2_0 = sr.field_h;
                stackIn_7_0 = stackOut_2_0;
                break L1;
              }
            }
            var2_int = stackIn_7_0 ? 1 : 0;
            if (var2_int != 0) {
              return;
            } else {
              break L0;
            }
          }
        }
        if (13 == oq.field_j) {
          var2_int = 1;
          if (((km) this).field_f) {
            L3: {
              if (((km) this).field_h >= 0) {
                if (!((km) this).field_b) {
                  var2_int = 3;
                  break L3;
                } else {
                  var2_int = 2;
                  break L3;
                }
              } else {
                var2_int = 4;
                break L3;
              }
            }
            var3_int = var2_int;
            ta.a(0, var3_int, (byte) 96, false);
            return;
          } else {
            var3_int = var2_int;
            ta.a(0, var3_int, (byte) 96, false);
            return;
          }
        } else {
          if (param0 <= -80) {
            L4: {
              ((km) this).field_Y.h(-1);
              if (!se.field_g) {
                break L4;
              } else {
                if (((km) this).field_f) {
                  break L4;
                } else {
                  L5: {
                    if (!di.field_p[86]) {
                      break L5;
                    } else {
                      if (di.field_p[35]) {
                        this.a((byte) -2, ((km) this).field_n);
                        ((km) this).m(123);
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  if (!di.field_p[86]) {
                    break L4;
                  } else {
                    if (di.field_p[67]) {
                      var9 = ((km) this).field_P.field_v;
                      var2 = var9;
                      var10 = 0;
                      var3_int = var10;
                      L6: while (true) {
                        if (var9.length <= var10) {
                          ((km) this).m(126);
                          break L4;
                        } else {
                          var11 = var9[var10];
                          if (((km) this).field_n != var11) {
                            this.a((byte) -66, var11);
                            var10++;
                            continue L6;
                          } else {
                            var10++;
                            continue L6;
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
            L7: {
              if (!se.field_g) {
                break L7;
              } else {
                if (!((km) this).field_f) {
                  break L7;
                } else {
                  if (null == ((km) this).field_n) {
                    break L7;
                  } else {
                    if (!di.field_p[82]) {
                      break L7;
                    } else {
                      if (!di.field_p[81]) {
                        break L7;
                      } else {
                        if (oq.field_j != 16) {
                          break L7;
                        } else {
                          sm.field_e = true;
                          int discarded$4 = 1;
                          em.a(mq.c((byte) 73));
                          ((km) this).field_s[((km) this).field_h] = (uj) (Object) new hi(((km) this).field_n, ((km) this).field_P, (mn) this);
                          var2_ref = (mg) (Object) ((km) this).field_P.field_p.a(true);
                          L8: while (true) {
                            if (var2_ref == null) {
                              var3 = (qa) (Object) ((km) this).field_P.field_q.d(0);
                              L9: while (true) {
                                if (var3 == null) {
                                  var4 = (qm) (Object) ((km) this).field_P.field_i.d(0);
                                  L10: while (true) {
                                    if (var4 == null) {
                                      int discarded$5 = 0;
                                      this.e();
                                      ((km) this).field_s[((km) this).field_h].b((byte) -98);
                                      this.a(((km) this).field_n, -122);
                                      var5 = ((km) this).field_P.field_g.field_e;
                                      var6 = 0;
                                      L11: while (true) {
                                        if (var6 >= var5.length) {
                                          var2_ref = (mg) (Object) ((km) this).field_P.field_p.a(true);
                                          L12: while (true) {
                                            if (var2_ref == null) {
                                              var3 = (qa) (Object) ((km) this).field_P.field_q.d(0);
                                              L13: while (true) {
                                                if (var3 == null) {
                                                  var4 = (qm) (Object) ((km) this).field_P.field_i.d(0);
                                                  L14: while (true) {
                                                    if (var4 == null) {
                                                      int discarded$6 = 0;
                                                      this.e();
                                                      break L7;
                                                    } else {
                                                      ((km) this).field_ab.a((df) (Object) var4, 32);
                                                      var4 = (qm) (Object) ((km) this).field_P.field_i.a((byte) -71);
                                                      continue L14;
                                                    }
                                                  }
                                                } else {
                                                  ((km) this).field_o.a((df) (Object) var3, 32);
                                                  var3 = (qa) (Object) ((km) this).field_P.field_q.a((byte) -71);
                                                  continue L13;
                                                }
                                              }
                                            } else {
                                              ((km) this).field_v.a((byte) 9, (cn) (Object) var2_ref);
                                              var2_ref = (mg) (Object) ((km) this).field_P.field_p.a((byte) -68);
                                              continue L12;
                                            }
                                          }
                                        } else {
                                          var7 = var5[var6];
                                          fl.a(var7, (byte) 96);
                                          kr.a((byte) -99, var7);
                                          var6++;
                                          continue L11;
                                        }
                                      }
                                    } else {
                                      var4.field_q = null;
                                      var4.field_r = null;
                                      ((km) this).field_ab.a((df) (Object) var4, 32);
                                      var4.b((byte) -71);
                                      var4 = (qm) (Object) ((km) this).field_P.field_i.a((byte) -71);
                                      continue L10;
                                    }
                                  }
                                } else {
                                  var3.field_u.field_J = var3.field_u.field_J - var3.field_v;
                                  ((km) this).field_C[var3.field_u.field_p] = ((km) this).field_C[var3.field_u.field_p] - var3.field_v;
                                  var3.field_v = 0;
                                  var3.b((byte) -74);
                                  ((km) this).field_o.a((df) (Object) var3, 32);
                                  var3 = (qa) (Object) ((km) this).field_P.field_q.a((byte) -71);
                                  continue L9;
                                }
                              }
                            } else {
                              int discarded$7 = 10755;
                              this.a(var2_ref, -var2_ref.field_z);
                              var2_ref = (mg) (Object) ((km) this).field_P.field_p.a((byte) -68);
                              continue L8;
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
            return;
          } else {
            return;
          }
        }
    }

    private final void a(int param0, byte param1, int param2) {
        gm var4 = null;
        int var4_int = 0;
        ln var4_ref = null;
        int var5_int = 0;
        sf var5 = null;
        int var6 = 0;
        ln var7 = null;
        int var7_int = 0;
        int var8 = 0;
        ln[] var9 = null;
        ln var10 = null;
        ln[] var11 = null;
        fs var12 = null;
        ln[] var13 = null;
        ln var14 = null;
        int stackIn_14_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_65_0 = 0;
        int stackOut_64_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        ((km) this).field_z.a(((km) this).field_m, 0, param2, param0);
        if (((km) this).field_b) {
          L0: {
            if (null == ((km) this).field_z.field_p) {
              break L0;
            } else {
              if (((km) this).field_m == 2) {
                L1: {
                  if (((km) this).field_z.field_p.field_R == ((km) this).field_c) {
                    break L1;
                  } else {
                    if (!((km) this).field_P.field_o.field_i) {
                      break L0;
                    } else {
                      if (null == ((km) this).field_z.field_p.field_y) {
                        break L0;
                      } else {
                        if ((Object) (Object) ((km) this).field_c == (Object) (Object) ((km) this).field_z.field_p.field_y.field_m) {
                          break L1;
                        } else {
                          break L0;
                        }
                      }
                    }
                  }
                }
                L2: {
                  ((km) this).field_z.e(-18641);
                  int discarded$8 = -83;
                  this.a(((km) this).field_z.field_p);
                  if (((km) this).field_x <= 3) {
                    var4 = qk.a(qc.field_w, 78);
                    break L2;
                  } else {
                    L3: {
                      var5_int = ((km) this).field_x - 3;
                      var6 = 96 >> (var5_int >> 1);
                      if (0 == (var5_int & 1)) {
                        break L3;
                      } else {
                        var6 = 46341 * var6 >> 16;
                        break L3;
                      }
                    }
                    L4: {
                      if (var6 < 24) {
                        var6 = 24;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var4 = rp.a(96, qc.field_w, var6);
                    break L2;
                  }
                }
                if (null == ((km) this).field_E) {
                  ((km) this).field_E = new sf(var4, cl.field_n);
                  ((km) this).field_x = ((km) this).field_x + 1;
                  ((km) this).a(2);
                  break L0;
                } else {
                  var5 = ((km) this).field_E;
                  L5: while (true) {
                    if (null == var5.field_b) {
                      var5.field_b = new sf(var4, cl.field_n);
                      ((km) this).field_x = ((km) this).field_x + 1;
                      ((km) this).a(2);
                      break L0;
                    } else {
                      var5 = var5.field_b;
                      continue L5;
                    }
                  }
                }
              } else {
                if (((km) this).field_m == 0) {
                  if (((km) this).field_n != ((km) this).field_z.field_p.field_y) {
                    break L0;
                  } else {
                    if (((km) this).field_n == null) {
                      break L0;
                    } else {
                      if (0 < ((km) this).field_z.field_p.field_J) {
                        ((km) this).field_K = ((km) this).field_z.field_p;
                        gm discarded$9 = qk.a(us.field_d, 74);
                        ((km) this).field_Y.a(-107, 1);
                        ((km) this).field_z.field_z[((km) this).field_K.field_p] = 1;
                        var13 = ((km) this).field_K.field_D;
                        var5_int = 0;
                        L6: while (true) {
                          if (var5_int >= var13.length) {
                            var4_ref = ((km) this).field_K.field_R.j(18229);
                            L7: while (true) {
                              if (var4_ref == null) {
                                break L0;
                              } else {
                                L8: {
                                  if (var4_ref == ((km) this).field_K) {
                                    break L8;
                                  } else {
                                    if (((km) this).field_P.a(((km) this).field_K, var4_ref, -1)) {
                                      ((km) this).field_z.field_z[var4_ref.field_p] = 2;
                                      break L8;
                                    } else {
                                      break L8;
                                    }
                                  }
                                }
                                var4_ref = ((km) this).field_K.field_R.h(-23410);
                                continue L7;
                              }
                            }
                          } else {
                            var14 = var13[var5_int];
                            ((km) this).field_z.field_z[var14.field_p] = 2;
                            var5_int++;
                            continue L6;
                          }
                        }
                      } else {
                        break L0;
                      }
                    }
                  }
                } else {
                  if (((km) this).field_m != 1) {
                    if (((km) this).field_m == 3) {
                      if (((km) this).field_z.field_p.field_y != ((km) this).field_n) {
                        break L0;
                      } else {
                        if (((km) this).field_z.field_p.field_u) {
                          break L0;
                        } else {
                          ((km) this).field_z.e(-18641);
                          ((km) this).a(2);
                          int discarded$10 = 0;
                          this.a(0, ((km) this).field_z.field_p);
                          ((km) this).field_Y.a(-119, 0);
                          ((km) this).field_Y.b(0, 2);
                          break L0;
                        }
                      }
                    } else {
                      if (((km) this).field_m != 4) {
                        if (5 == ((km) this).field_m) {
                          L9: {
                            if (((km) this).field_n != ((km) this).field_z.field_p.field_y) {
                              stackOut_64_0 = 0;
                              stackIn_65_0 = stackOut_64_0;
                              break L9;
                            } else {
                              stackOut_63_0 = 1;
                              stackIn_65_0 = stackOut_63_0;
                              break L9;
                            }
                          }
                          var4_int = stackIn_65_0;
                          var11 = ((km) this).field_z.field_p.field_D;
                          var6 = 0;
                          L10: while (true) {
                            if (var6 >= var11.length) {
                              var12 = ((km) this).field_z.field_p.field_y;
                              if (var4_int == 0) {
                                break L0;
                              } else {
                                if (((km) this).field_n == var12) {
                                  break L0;
                                } else {
                                  L11: {
                                    if (var12 == null) {
                                      break L11;
                                    } else {
                                      if (((km) this).field_n.field_h[var12.field_x]) {
                                        break L0;
                                      } else {
                                        break L11;
                                      }
                                    }
                                  }
                                  ((km) this).field_z.e(-18641);
                                  ((km) this).a(2);
                                  int discarded$11 = 0;
                                  this.a(2, ((km) this).field_z.field_p);
                                  ((km) this).field_Y.a(-81, 0);
                                  ((km) this).field_Y.b(2, 2);
                                  break L0;
                                }
                              }
                            } else {
                              var7 = var11[var6];
                              if (var7.field_y == ((km) this).field_n) {
                                var4_int = 1;
                                var6++;
                                continue L10;
                              } else {
                                var6++;
                                continue L10;
                              }
                            }
                          }
                        } else {
                          if (((km) this).field_m == 6) {
                            if (((km) this).field_z.field_p.field_y == ((km) this).field_n) {
                              ((km) this).field_z.e(-18641);
                              ((km) this).a(2);
                              ((km) this).field_K = ((km) this).field_z.field_p;
                              ((km) this).field_Y.a(-84, 7);
                              var9 = ((km) this).field_P.field_g.field_e;
                              var5_int = 0;
                              L12: while (true) {
                                if (var5_int >= var9.length) {
                                  break L0;
                                } else {
                                  var10 = var9[var5_int];
                                  if (!((km) this).field_z.field_p.b(var10, (byte) 10)) {
                                    if (((km) this).field_z.field_p != var10) {
                                      ((km) this).field_z.field_z[var10.field_p] = 2;
                                      var5_int++;
                                      continue L12;
                                    } else {
                                      var5_int++;
                                      continue L12;
                                    }
                                  } else {
                                    var5_int++;
                                    continue L12;
                                  }
                                }
                              }
                            } else {
                              break L0;
                            }
                          } else {
                            if (7 == ((km) this).field_m) {
                              if (((km) this).field_K.b(((km) this).field_z.field_p, (byte) 10)) {
                                break L0;
                              } else {
                                if (((km) this).field_K == ((km) this).field_z.field_p) {
                                  break L0;
                                } else {
                                  ((km) this).field_z.e(-18641);
                                  ((km) this).a(2);
                                  int discarded$12 = 3;
                                  this.a(41, ((km) this).field_z.field_p, ((km) this).field_K);
                                  ((km) this).field_Y.a(-117, 0);
                                  ((km) this).field_Y.b(3, 2);
                                  break L0;
                                }
                              }
                            } else {
                              break L0;
                            }
                          }
                        }
                      } else {
                        if (((km) this).field_z.field_p.field_y != ((km) this).field_n) {
                          break L0;
                        } else {
                          if (((km) this).field_z.field_p.field_L != 0) {
                            break L0;
                          } else {
                            ((km) this).field_z.e(-18641);
                            ((km) this).a(2);
                            int discarded$13 = 0;
                            this.a(1, ((km) this).field_z.field_p);
                            ((km) this).field_Y.a(-122, 0);
                            ((km) this).field_Y.b(1, 2);
                            break L0;
                          }
                        }
                      }
                    }
                  } else {
                    L13: {
                      L14: {
                        if (((km) this).field_K.b(((km) this).field_z.field_p, (byte) 10)) {
                          break L14;
                        } else {
                          if (((km) this).field_K == ((km) this).field_z.field_p) {
                            break L13;
                          } else {
                            if (((km) this).field_K.field_R != ((km) this).field_z.field_p.field_R) {
                              break L13;
                            } else {
                              if (((km) this).field_P.a(((km) this).field_K, ((km) this).field_z.field_p, -1)) {
                                break L14;
                              } else {
                                break L13;
                              }
                            }
                          }
                        }
                      }
                      L15: {
                        ((km) this).field_z.e(-18641);
                        var4_int = -((km) this).field_K.field_N + ((km) this).field_K.field_J;
                        if (0 < var4_int) {
                          stackOut_13_0 = (1 + var4_int) / 2;
                          stackIn_14_0 = stackOut_13_0;
                          break L15;
                        } else {
                          stackOut_12_0 = 1;
                          stackIn_14_0 = stackOut_12_0;
                          break L15;
                        }
                      }
                      L16: {
                        var5_int = stackIn_14_0;
                        var6 = this.a((byte) 105);
                        if (var6 != 81) {
                          if (var6 == 86) {
                            var5_int = 5;
                            break L16;
                          } else {
                            if (82 == var6) {
                              L17: {
                                if (var4_int > 0) {
                                  stackOut_21_0 = var4_int;
                                  stackIn_22_0 = stackOut_21_0;
                                  break L17;
                                } else {
                                  stackOut_20_0 = ((km) this).field_K.field_J;
                                  stackIn_22_0 = stackOut_20_0;
                                  break L17;
                                }
                              }
                              var5_int = stackIn_22_0;
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                        } else {
                          var5_int = 1;
                          break L16;
                        }
                      }
                      L18: {
                        if (!((km) this).field_P.field_o.field_e) {
                          stackOut_26_0 = ((km) this).field_K.field_N;
                          stackIn_27_0 = stackOut_26_0;
                          break L18;
                        } else {
                          stackOut_25_0 = 0;
                          stackIn_27_0 = stackOut_25_0;
                          break L18;
                        }
                      }
                      L19: {
                        var7_int = stackIn_27_0;
                        if (var5_int > ((km) this).field_K.field_J - var7_int) {
                          var5_int = ((km) this).field_K.field_J + -var7_int;
                          break L19;
                        } else {
                          break L19;
                        }
                      }
                      if (var5_int <= 0) {
                        ((km) this).a(2);
                        break L13;
                      } else {
                        L20: {
                          this.a(false, var5_int, ((km) this).field_z.field_p, ((km) this).field_K);
                          if (((km) this).field_n == ((km) this).field_z.field_p.field_y) {
                            break L20;
                          } else {
                            L21: {
                              if (null != ((km) this).field_z.field_p.field_y) {
                                break L21;
                              } else {
                                if (((km) this).field_z.field_p.field_x == 0) {
                                  break L20;
                                } else {
                                  break L21;
                                }
                              }
                            }
                            gm discarded$14 = qk.a(jj.field_l, 78);
                            ((km) this).a(2);
                            ((km) this).field_Y.a(-125, 0);
                            break L0;
                          }
                        }
                        gm discarded$15 = qk.a(hs.field_l, 89);
                        ((km) this).a(2);
                        ((km) this).field_Y.a(-125, 0);
                        break L0;
                      }
                    }
                    ((km) this).field_Y.a(-125, 0);
                    break L0;
                  }
                }
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    private final void d(byte param0) {
        int var2 = 0;
        fs[] var2_ref_fs__ = null;
        int var3 = 0;
        sd var5 = null;
        int var6 = 0;
        fs[] var7 = null;
        fs var8 = null;
        fs[] var9 = null;
        fs var10 = null;
        L0: {
          var6 = ShatteredPlansClient.field_F ? 1 : 0;
          int discarded$5 = 0;
          this.b();
          if (!((km) this).field_W) {
            break L0;
          } else {
            if (0 != ((km) this).field_P.field_O) {
              break L0;
            } else {
              if (!((km) this).field_P.field_o.field_i) {
                var9 = ((km) this).field_P.field_v;
                var3 = 0;
                L1: while (true) {
                  if (var9.length <= var3) {
                    break L0;
                  } else {
                    var10 = var9[var3];
                    var5 = (sd) (Object) var10.field_i.d(0);
                    L2: while (true) {
                      if (var5 == null) {
                        var3++;
                        continue L1;
                      } else {
                        var5.field_x = 0;
                        var5 = (sd) (Object) var10.field_i.a((byte) -71);
                        continue L2;
                      }
                    }
                  }
                }
              } else {
                var7 = ((km) this).field_P.field_v;
                var2_ref_fs__ = var7;
                var3 = 0;
                L3: while (true) {
                  if (var3 >= var7.length) {
                    break L0;
                  } else {
                    var8 = var7[var3];
                    var8.field_m.field_x = 0;
                    var3++;
                    continue L3;
                  }
                }
              }
            }
          }
        }
        L4: {
          int fieldTemp$6 = ((km) this).field_h + 1;
          ((km) this).field_h = ((km) this).field_h + 1;
          if (fieldTemp$6 != ((km) this).field_P.field_v.length) {
            break L4;
          } else {
            ((km) this).field_n = ((km) this).field_P.field_v[0];
            ((km) this).field_h = 0;
            ((km) this).field_P.c(0);
            int discarded$7 = 27;
            this.b(lr.a(), 79);
            int discarded$8 = 27;
            ((km) this).field_z.field_d = lr.a();
            ((km) this).field_P.c((byte) 119);
            var2 = 0;
            L5: while (true) {
              if (((km) this).field_P.field_r <= var2) {
                break L4;
              } else {
                if (null != ((km) this).field_s[var2]) {
                  ((km) this).field_s[var2].a((byte) -63);
                  var2++;
                  continue L5;
                } else {
                  var2++;
                  continue L5;
                }
              }
            }
          }
        }
        L6: {
          if (param0 == -81) {
            break L6;
          } else {
            this.a(false, 84, (ln) null, (ln) null);
            break L6;
          }
        }
        ((km) this).field_n = ((km) this).field_P.field_v[((km) this).field_h];
        ((km) this).field_S = mb.field_o[((km) this).field_P.field_J];
        int discarded$9 = 1;
        this.a();
    }

    final void a(int param0, int param1) {
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        qm var3 = (qm) (Object) ((km) this).field_P.field_i.d(0);
        while (var3 != null) {
            if (!(var3.field_o != param0)) {
                var3.field_r = null;
                var3.field_q = null;
                if (!(!((km) this).field_f)) {
                    ((km) this).field_ab.a((df) (Object) var3, 32);
                    int discarded$0 = 0;
                    this.e();
                }
                var3.b((byte) -117);
            }
            var3 = (qm) (Object) ((km) this).field_P.field_i.a((byte) -71);
        }
        if (param1 != 24) {
            ((km) this).field_f = true;
        }
        ((km) this).field_Y.c(param0, 127);
    }

    public static void h(int param0) {
        field_e = null;
        field_u = null;
        field_a = null;
        field_X = null;
        field_A = null;
        if (param0 != 11) {
            km.h(24);
        }
    }

    final void b(boolean param0, boolean param1) {
        int var4 = 0;
        sl var5 = null;
        tr stackIn_5_0 = null;
        tr stackIn_6_0 = null;
        tr stackIn_7_0 = null;
        pf stackIn_7_1 = null;
        tr stackOut_4_0 = null;
        tr stackOut_6_0 = null;
        Object stackOut_6_1 = null;
        tr stackOut_5_0 = null;
        pf stackOut_5_1 = null;
        L0: {
          L1: {
            var4 = ShatteredPlansClient.field_F ? 1 : 0;
            if (!param0) {
              break L1;
            } else {
              if (ol.a(-114)) {
                break L1;
              } else {
                int discarded$5 = 50;
                this.j();
                break L0;
              }
            }
          }
          boolean discarded$6 = ((km) this).field_Y.a(false, (byte) 110);
          break L0;
        }
        L2: {
          ((km) this).field_Y.h((byte) 122);
          stackOut_4_0 = ((km) this).field_z;
          stackIn_6_0 = stackOut_4_0;
          stackIn_5_0 = stackOut_4_0;
          if (null == ((km) this).field_Q) {
            stackOut_6_0 = (tr) (Object) stackIn_6_0;
            stackOut_6_1 = null;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = (pf) (Object) stackOut_6_1;
            break L2;
          } else {
            stackOut_5_0 = (tr) (Object) stackIn_5_0;
            stackOut_5_1 = ((km) this).field_Q.field_a;
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            break L2;
          }
        }
        ((tr) (Object) stackIn_7_0).a(stackIn_7_1, 66);
        L3: while (true) {
          L4: {
            if (null == ((km) this).field_E) {
              break L4;
            } else {
              if (cl.field_n + -((km) this).field_E.field_c < 50) {
                break L4;
              } else {
                ((km) this).field_x = ((km) this).field_x - 1;
                ((km) this).field_E = ((km) this).field_E.field_b;
                continue L3;
              }
            }
          }
          L5: {
            if (param1) {
              break L5;
            } else {
              field_X = null;
              break L5;
            }
          }
          L6: {
            if (((km) this).field_f) {
              L7: {
                if (1 < ((km) this).field_S) {
                  int fieldTemp$7 = ((km) this).field_S - 1;
                  ((km) this).field_S = ((km) this).field_S - 1;
                  if (fieldTemp$7 != 1) {
                    break L7;
                  } else {
                    if (((km) this).field_L) {
                      break L7;
                    } else {
                      if (((km) this).field_b) {
                        ((km) this).m(123);
                        break L7;
                      } else {
                        break L7;
                      }
                    }
                  }
                } else {
                  break L7;
                }
              }
              if (((km) this).field_S % 200 != 0) {
                break L6;
              } else {
                if (!((km) this).field_L) {
                  break L6;
                } else {
                  var5 = js.field_f;
                  var5.h(61, 255);
                  var5.c(((km) this).field_P.field_O, (byte) -110);
                  var5.e(11135, this.f(109));
                  break L6;
                }
              }
            } else {
              ((km) this).field_S = ((km) this).field_S - 1;
              break L6;
            }
          }
          L8: {
            if (!((km) this).field_f) {
              break L8;
            } else {
              if (!((km) this).field_b) {
                break L8;
              } else {
                if (((km) this).field_k == 0) {
                  break L8;
                } else {
                  int fieldTemp$8 = ((km) this).field_k - 1;
                  ((km) this).field_k = ((km) this).field_k - 1;
                  if (0 != fieldTemp$8) {
                    int fieldTemp$9 = ((km) this).field_g - 1;
                    ((km) this).field_g = ((km) this).field_g - 1;
                    if (fieldTemp$9 < 0) {
                      this.l(-106);
                      break L8;
                    } else {
                      break L8;
                    }
                  } else {
                    this.l(-106);
                    break L8;
                  }
                }
              }
            }
          }
          return;
        }
    }

    private final void a(fs param0, int param1, fs param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (((km) this).field_n != param0) {
                if (param2 != ((km) this).field_n) {
                  var8 = re.a(lh.field_A, 4371, new String[2]);
                  ((km) this).field_H.a((oh) (Object) new n(param2, param0, var8), 0);
                  break L1;
                } else {
                  var7 = re.a(se.field_c, 4371, new String[1]);
                  ((km) this).field_H.a((oh) (Object) new n(param2, param0, var7), 0);
                  break L1;
                }
              } else {
                var6 = re.a(jb.field_a, 4371, new String[1]);
                ((km) this).field_H.a((oh) (Object) new n(param0, param2, var6), 0);
                break L1;
              }
            }
            L2: {
              if (!((km) this).field_W) {
                break L2;
              } else {
                fl.a(0, "signtreaty");
                break L2;
              }
            }
            L3: {
              this.a(((km) this).field_n, param1 + 27510);
              if (null != ((km) this).field_s[param0.field_x]) {
                ((km) this).field_s[param0.field_x].a(param2, (byte) -42);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param1 == -27584) {
                break L4;
              } else {
                ((km) this).field_J = null;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var4;
            stackOut_14_1 = new StringBuilder().append("km.I(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44).append(param1).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
    }

    private final void b() {
        n var2 = null;
        qm var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = (n) (Object) ((km) this).field_H.d(0);
        L0: while (true) {
          if (var2 == null) {
            L1: {
              if (((km) this).field_W) {
                var3 = (qm) (Object) ((km) this).field_P.field_i.d(0);
                L2: while (true) {
                  if (var3 == null) {
                    break L1;
                  } else {
                    L3: {
                      var4 = var3.field_o;
                      if (var4 == 0) {
                        fl.a(0, "defensivenet");
                        break L3;
                      } else {
                        if (var4 == 1) {
                          fl.a(0, "terraforming");
                          break L3;
                        } else {
                          if (var4 == 2) {
                            fl.a(0, "stellarbomb");
                            break L3;
                          } else {
                            if (var4 != 3) {
                              break L3;
                            } else {
                              fl.a(0, "tannhauser");
                              break L3;
                            }
                          }
                        }
                      }
                    }
                    var3 = (qm) (Object) ((km) this).field_P.field_i.a((byte) -71);
                    continue L2;
                  }
                }
              } else {
                break L1;
              }
            }
            return;
          } else {
            L4: {
              int fieldTemp$2 = var2.field_i + 1;
              var2.field_i = var2.field_i + 1;
              if (fieldTemp$2 != 2) {
                break L4;
              } else {
                var2.b((byte) -85);
                break L4;
              }
            }
            var2 = (n) (Object) ((km) this).field_H.a((byte) -71);
            continue L0;
          }
        }
    }

    private final void a() {
        Exception var2_ref_Exception = null;
        int var2 = 0;
        mg var2_ref_mg = null;
        int var3_int = 0;
        qa var3 = null;
        qm var4 = null;
        int var5 = 0;
        int var6 = 0;
        ln[] var7 = null;
        ln var8 = null;
        ln[] var9 = null;
        ln var10 = null;
        ln[] var11 = null;
        ln var12 = null;
        Throwable decompiledCaughtException = null;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        System.gc();
        ((km) this).field_P.field_x.a((byte) -70, ((km) this).field_P, ((km) this).field_Y);
        var7 = ((km) this).field_P.field_g.field_e;
        var3_int = 0;
        L0: while (true) {
          if (var3_int >= var7.length) {
            L1: {
              L2: {
                if (null == ((km) this).field_R) {
                  break L2;
                } else {
                  if (((km) this).field_P.field_g.field_e.length > ((km) this).field_R.length) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              var2 = ((km) this).field_P.field_g.field_e.length;
              ((km) this).field_C = new int[var2];
              ((km) this).field_R = new fs[var2];
              ((km) this).field_l = new sd[var2];
              break L1;
            }
            var9 = ((km) this).field_P.field_g.field_e;
            var3_int = 0;
            L3: while (true) {
              if (var9.length <= var3_int) {
                L4: {
                  ((km) this).field_z.a(((km) this).field_C, true, ((km) this).field_l, ((km) this).field_R, false);
                  ((km) this).field_z.a(((km) this).field_p, ((km) this).field_t, ((km) this).field_U, ((km) this).field_V, ((km) this).field_w, ((km) this).field_d, ((km) this).field_r, ((km) this).field_J, 0);
                  ((km) this).field_z.d(0);
                  this.a(((km) this).field_n, -83);
                  if (((km) this).field_f) {
                    break L4;
                  } else {
                    if (null == ((km) this).field_s[((km) this).field_h]) {
                      break L4;
                    } else {
                      try {
                        L5: {
                          ((km) this).field_s[((km) this).field_h].b((byte) -91);
                          break L5;
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L6: {
                          var2_ref_Exception = (Exception) (Object) decompiledCaughtException;
                          jq.a(-29901, (Throwable) (Object) var2_ref_Exception, "AI has errored in single player game");
                          break L6;
                        }
                      }
                      this.a(((km) this).field_n, -84);
                      this.d((byte) -81);
                      return;
                    }
                  }
                }
                L7: {
                  if (!sm.field_e) {
                    break L7;
                  } else {
                    if (!((km) this).field_j) {
                      if (!((km) this).field_b) {
                        break L7;
                      } else {
                        ((km) this).field_s[((km) this).field_h].a((byte) -63);
                        ((km) this).field_s[((km) this).field_h].b((byte) -15);
                        this.a(((km) this).field_n, -70);
                        var11 = ((km) this).field_P.field_g.field_e;
                        var3_int = 0;
                        L8: while (true) {
                          if (var3_int >= var11.length) {
                            var2_ref_mg = (mg) (Object) ((km) this).field_P.field_p.a(true);
                            L9: while (true) {
                              if (var2_ref_mg == null) {
                                var3 = (qa) (Object) ((km) this).field_P.field_q.d(0);
                                L10: while (true) {
                                  if (var3 == null) {
                                    var4 = (qm) (Object) ((km) this).field_P.field_i.d(0);
                                    L11: while (true) {
                                      if (var4 == null) {
                                        int discarded$1 = 0;
                                        this.e();
                                        break L7;
                                      } else {
                                        ((km) this).field_ab.a((df) (Object) var4, 32);
                                        var4 = (qm) (Object) ((km) this).field_P.field_i.a((byte) -71);
                                        continue L11;
                                      }
                                    }
                                  } else {
                                    ((km) this).field_o.a((df) (Object) var3, 32);
                                    var3 = (qa) (Object) ((km) this).field_P.field_q.a((byte) -71);
                                    continue L10;
                                  }
                                }
                              } else {
                                ((km) this).field_v.a((byte) 9, (cn) (Object) var2_ref_mg);
                                var2_ref_mg = (mg) (Object) ((km) this).field_P.field_p.a((byte) -68);
                                continue L9;
                              }
                            }
                          } else {
                            var12 = var11[var3_int];
                            fl.a(var12, (byte) 73);
                            kr.a((byte) 65, var12);
                            var3_int++;
                            continue L8;
                          }
                        }
                      }
                    } else {
                      break L7;
                    }
                  }
                }
                ((km) this).field_z.a(false);
                ((km) this).field_Y.n(106);
                ((km) this).field_Y.a(-73, 0);
                ((km) this).field_N = 0;
                var2 = 0;
                L12: while (true) {
                  if (var2 >= ((km) this).field_P.field_r) {
                    L13: {
                      L14: {
                        if (((km) this).field_P.field_z) {
                          break L14;
                        } else {
                          if (((km) this).field_n == null) {
                            break L13;
                          } else {
                            if ((1 << ((km) this).field_h & ((km) this).field_P.field_w) == 0) {
                              break L13;
                            } else {
                              break L14;
                            }
                          }
                        }
                      }
                      L15: {
                        L16: {
                          L17: {
                            ta.a(0, -1, (byte) 96, false);
                            ((km) this).field_b = false;
                            ((km) this).field_Y.o(-4956);
                            if (((km) this).field_n == null) {
                              break L17;
                            } else {
                              if ((1 << ((km) this).field_h & ((km) this).field_P.field_w) != 0) {
                                break L16;
                              } else {
                                break L17;
                              }
                            }
                          }
                          if (((km) this).field_P.field_x.a((byte) -123, ((km) this).field_n)) {
                            break L16;
                          } else {
                            if (((km) this).field_P.field_z) {
                              jo.a(32767, hj.field_n, false, 10);
                              break L15;
                            } else {
                              break L15;
                            }
                          }
                        }
                        jo.a(32767, wh.field_b, false, 10);
                        break L15;
                      }
                      if (!sm.field_e) {
                        break L13;
                      } else {
                        if ((((km) this).field_P.field_e & 1 << ((km) this).field_h) != 0) {
                          break L13;
                        } else {
                          ((km) this).b(-118);
                          break L13;
                        }
                      }
                    }
                    return;
                  } else {
                    if ((1 << var2 & ((km) this).field_P.field_w) == 0) {
                      ((km) this).field_N = ((km) this).field_N + 1;
                      var2++;
                      continue L12;
                    } else {
                      var2++;
                      continue L12;
                    }
                  }
                }
              } else {
                var10 = var9[var3_int];
                var5 = var10.field_p;
                ((km) this).field_R[var5] = var10.field_y;
                ((km) this).field_C[var5] = var10.field_x;
                ((km) this).field_l[var5] = var10.field_R;
                var3_int++;
                continue L3;
              }
            }
          } else {
            var8 = var7[var3_int];
            var8.field_J = var8.field_x;
            if (var8.field_y != ((km) this).field_n) {
              ((km) this).field_w[var8.field_p] = false;
              ((km) this).field_V[var8.field_p] = false;
              ((km) this).field_p[var8.field_p] = 0;
              ((km) this).field_J[var8.field_p] = 0;
              var3_int++;
              continue L0;
            } else {
              ((km) this).field_p[var8.field_p] = var8.field_x;
              ((km) this).field_J[var8.field_p] = var8.field_x;
              var3_int++;
              continue L0;
            }
          }
        }
    }

    final void b(byte param0) {
        int var2 = 0;
        fs[] var3_ref_fs__ = null;
        String var3_ref_String = null;
        int var3 = 0;
        int var4 = 0;
        fs var5 = null;
        int var6 = 0;
        fs[] var7 = null;
        Object stackIn_1_0 = null;
        tr stackIn_1_1 = null;
        tr stackIn_1_2 = null;
        l stackIn_1_3 = null;
        fs[] stackIn_1_4 = null;
        fs stackIn_1_5 = null;
        boolean stackIn_1_6 = false;
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
        Object stackIn_4_0 = null;
        tr stackIn_4_1 = null;
        tr stackIn_4_2 = null;
        l stackIn_4_3 = null;
        fs[] stackIn_4_4 = null;
        fs stackIn_4_5 = null;
        boolean stackIn_4_6 = false;
        int stackIn_4_7 = 0;
        Object stackOut_0_0 = null;
        tr stackOut_0_1 = null;
        tr stackOut_0_2 = null;
        l stackOut_0_3 = null;
        fs[] stackOut_0_4 = null;
        fs stackOut_0_5 = null;
        boolean stackOut_0_6 = false;
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
        int stackOut_2_7 = 0;
        Object stackOut_3_0 = null;
        tr stackOut_3_1 = null;
        tr stackOut_3_2 = null;
        l stackOut_3_3 = null;
        fs[] stackOut_3_4 = null;
        fs stackOut_3_5 = null;
        boolean stackOut_3_6 = false;
        int stackOut_3_7 = 0;
        L0: {
          L1: {
            var6 = ShatteredPlansClient.field_F ? 1 : 0;
            stackOut_0_0 = this;
            stackOut_0_1 = null;
            stackOut_0_2 = null;
            stackOut_0_3 = ((km) this).field_P.field_g;
            stackOut_0_4 = ((km) this).field_P.field_v;
            stackOut_0_5 = ((km) this).field_n;
            stackOut_0_6 = ((km) this).field_W;
            stackIn_3_0 = stackOut_0_0;
            stackIn_3_1 = stackOut_0_1;
            stackIn_3_2 = stackOut_0_2;
            stackIn_3_3 = stackOut_0_3;
            stackIn_3_4 = stackOut_0_4;
            stackIn_3_5 = stackOut_0_5;
            stackIn_3_6 = stackOut_0_6;
            stackIn_1_0 = stackOut_0_0;
            stackIn_1_1 = stackOut_0_1;
            stackIn_1_2 = stackOut_0_2;
            stackIn_1_3 = stackOut_0_3;
            stackIn_1_4 = stackOut_0_4;
            stackIn_1_5 = stackOut_0_5;
            stackIn_1_6 = stackOut_0_6;
            if (((km) this).field_P.field_o.field_k) {
              break L1;
            } else {
              stackOut_1_0 = this;
              stackOut_1_1 = null;
              stackOut_1_2 = null;
              stackOut_1_3 = (l) (Object) stackIn_1_3;
              stackOut_1_4 = (fs[]) (Object) stackIn_1_4;
              stackOut_1_5 = (fs) (Object) stackIn_1_5;
              stackOut_1_6 = stackIn_1_6;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_3_2 = stackOut_1_2;
              stackIn_3_3 = stackOut_1_3;
              stackIn_3_4 = stackOut_1_4;
              stackIn_3_5 = stackOut_1_5;
              stackIn_3_6 = stackOut_1_6;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              stackIn_2_2 = stackOut_1_2;
              stackIn_2_3 = stackOut_1_3;
              stackIn_2_4 = stackOut_1_4;
              stackIn_2_5 = stackOut_1_5;
              stackIn_2_6 = stackOut_1_6;
              if (((km) this).field_P.field_o.field_l) {
                break L1;
              } else {
                stackOut_2_0 = this;
                stackOut_2_1 = null;
                stackOut_2_2 = null;
                stackOut_2_3 = (l) (Object) stackIn_2_3;
                stackOut_2_4 = (fs[]) (Object) stackIn_2_4;
                stackOut_2_5 = (fs) (Object) stackIn_2_5;
                stackOut_2_6 = stackIn_2_6;
                stackOut_2_7 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                stackIn_4_3 = stackOut_2_3;
                stackIn_4_4 = stackOut_2_4;
                stackIn_4_5 = stackOut_2_5;
                stackIn_4_6 = stackOut_2_6;
                stackIn_4_7 = stackOut_2_7;
                break L0;
              }
            }
          }
          stackOut_3_0 = this;
          stackOut_3_1 = null;
          stackOut_3_2 = null;
          stackOut_3_3 = (l) (Object) stackIn_3_3;
          stackOut_3_4 = (fs[]) (Object) stackIn_3_4;
          stackOut_3_5 = (fs) (Object) stackIn_3_5;
          stackOut_3_6 = stackIn_3_6;
          stackOut_3_7 = 0;
          stackIn_4_0 = stackOut_3_0;
          stackIn_4_1 = stackOut_3_1;
          stackIn_4_2 = stackOut_3_2;
          stackIn_4_3 = stackOut_3_3;
          stackIn_4_4 = stackOut_3_4;
          stackIn_4_5 = stackOut_3_5;
          stackIn_4_6 = stackOut_3_6;
          stackIn_4_7 = stackOut_3_7;
          break L0;
        }
        L2: {
          ((km) this).field_z = new tr(stackIn_4_3, stackIn_4_4, stackIn_4_5, stackIn_4_6, stackIn_4_7 != 0);
          ((km) this).field_z.field_C = true;
          if (((km) this).field_Y == null) {
            ((km) this).field_Y = new kq((km) this);
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          ((km) this).field_z.a(((km) this).field_Y, param0 + 205);
          if (((km) this).field_f) {
            break L3;
          } else {
            if (!((km) this).field_W) {
              var2 = 0;
              L4: while (true) {
                if (var2 >= ((km) this).field_P.field_r) {
                  break L3;
                } else {
                  if (null != ((km) this).field_s[var2]) {
                    ((km) this).field_s[var2].a(param0 + 7);
                    if (se.field_g) {
                      var3_ref_String = "My personality is " + wk.field_a[((km) this).field_s[var2].a(false)];
                      int discarded$2 = 51;
                      this.a(((km) this).field_P.field_v[var2], var3_ref_String);
                      var2++;
                      continue L4;
                    } else {
                      var2++;
                      continue L4;
                    }
                  } else {
                    var2++;
                    continue L4;
                  }
                }
              }
            } else {
              break L3;
            }
          }
        }
        L5: {
          var2 = ((km) this).field_P.field_g.field_e.length;
          ((km) this).field_J = new int[var2];
          ((km) this).field_w = new boolean[var2];
          ((km) this).field_r = new int[var2];
          ((km) this).field_p = new int[var2];
          ((km) this).field_d = new int[var2];
          ((km) this).field_V = new boolean[var2];
          ((km) this).field_t = new int[var2];
          ((km) this).field_U = new int[var2];
          ((km) this).field_P.b(-99);
          ((km) this).field_z.a(((km) this).field_p, ((km) this).field_t, ((km) this).field_U, ((km) this).field_V, ((km) this).field_w, ((km) this).field_d, ((km) this).field_r, ((km) this).field_J, 0);
          if (((km) this).field_h >= 0) {
            break L5;
          } else {
            sm.field_e = false;
            break L5;
          }
        }
        if (param0 == -81) {
          L6: {
            if (sm.field_e) {
              ((km) this).field_s[((km) this).field_h] = (uj) (Object) new hi(((km) this).field_n, ((km) this).field_P, (mn) this);
              break L6;
            } else {
              break L6;
            }
          }
          var7 = ((km) this).field_P.field_v;
          var3_ref_fs__ = ((km) this).field_P.field_v;
          var4 = 0;
          L7: while (true) {
            if (var4 >= var7.length) {
              ((km) this).field_z.b(false);
              int discarded$3 = 1;
              this.a();
              var3 = 0;
              L8: while (true) {
                if (((km) this).field_P.field_r <= var3) {
                  L9: {
                    L10: {
                      ((km) this).a(param0 + 83);
                      if (null == ((km) this).field_n) {
                        break L10;
                      } else {
                        if (((km) this).field_n.field_i.g(param0 ^ 27)) {
                          break L10;
                        } else {
                          if (!sm.field_e) {
                            ((km) this).field_z.a((sd) (Object) ((km) this).field_n.field_i.d(0), param0 ^ -82);
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                    }
                    ((km) this).field_z.field_I = ((km) this).field_z.field_F;
                    break L9;
                  }
                  ((km) this).field_z.a(false);
                  return;
                } else {
                  if (null != ((km) this).field_s[var3]) {
                    ((km) this).field_s[var3].a((byte) -63);
                    var3++;
                    continue L8;
                  } else {
                    var3++;
                    continue L8;
                  }
                }
              }
            } else {
              var5 = var7[var4];
              if (var5.field_i.g(-124)) {
                ((km) this).field_P.field_w = ((km) this).field_P.field_w | 1 << var5.field_x;
                var4++;
                continue L7;
              } else {
                var4++;
                continue L7;
              }
            }
          }
        } else {
          return;
        }
    }

    private final void i() {
        sl var4 = js.field_f;
        var4.h(60, 255);
        var4.field_j = var4.field_j + 2;
        int var3 = var4.field_j;
        var4.c(((km) this).field_P.field_O, (byte) -73);
        se.a(fp.a(((km) this).field_P.field_q, -71), -256, fp.a(((km) this).field_P.field_i, -88), eh.a(25, ((km) this).field_P.field_p), var4);
        ((km) this).field_ab.b((byte) 108);
        ((km) this).field_o.b((byte) 127);
        ((km) this).field_v.a((byte) 112);
        var4.f(-549342136, -var3 + var4.field_j);
        ((km) this).field_k = -1;
        ((km) this).field_g = -1;
        if (((km) this).field_L) {
            var4.h(61, 255);
            var4.c(((km) this).field_P.field_O, (byte) -74);
            var4.e(11135, this.f(-78));
        }
    }

    private final void a(ln param0) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        qa var5 = null;
        ln var6 = null;
        sd var6_ref = null;
        ln var7 = null;
        int var8 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 1;
              var4 = this.a((byte) 82);
              if (var4 != 82) {
                if (var4 == 86) {
                  L2: {
                    if (5 >= ((km) this).field_c.field_x) {
                      stackOut_7_0 = ((km) this).field_c.field_x;
                      stackIn_8_0 = stackOut_7_0;
                      break L2;
                    } else {
                      stackOut_6_0 = 5;
                      stackIn_8_0 = stackOut_6_0;
                      break L2;
                    }
                  }
                  var3_int = stackIn_8_0;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                var3_int = ((km) this).field_c.field_x;
                break L1;
              }
            }
            param0.field_J = param0.field_J + var3_int;
            ((km) this).field_C[param0.field_p] = ((km) this).field_C[param0.field_p] + var3_int;
            ((km) this).field_p[param0.field_p] = ((km) this).field_p[param0.field_p] + var3_int;
            ((km) this).field_J[param0.field_p] = ((km) this).field_J[param0.field_p] + var3_int;
            var5 = (qa) (Object) ((km) this).field_P.field_q.d(0);
            L3: while (true) {
              L4: {
                if (var5 == null) {
                  break L4;
                } else {
                  if (param0 == var5.field_u) {
                    break L4;
                  } else {
                    var5 = (qa) (Object) ((km) this).field_P.field_q.a((byte) -71);
                    continue L3;
                  }
                }
              }
              L5: {
                if (var5 == null) {
                  var5 = new qa(param0, 0);
                  ((km) this).field_P.field_q.a((byte) -113, (oh) (Object) var5);
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                var5.field_v = var5.field_v + var3_int;
                if (((km) this).field_f) {
                  ((km) this).field_o.a((df) (Object) var5, 32);
                  int discarded$1 = 0;
                  this.e();
                  break L6;
                } else {
                  break L6;
                }
              }
              L7: {
                ((km) this).field_c.field_x = ((km) this).field_c.field_x - var3_int;
                ((km) this).field_Y.e((byte) 43);
                if (((km) this).field_c.field_x > 0) {
                  ((km) this).field_Y.a(-73, 2);
                  var6 = ((km) this).field_c.j(18229);
                  L8: while (true) {
                    if (var6 == null) {
                      break L7;
                    } else {
                      ((km) this).field_z.field_z[var6.field_p] = 2;
                      var6 = ((km) this).field_c.h(-23410);
                      continue L8;
                    }
                  }
                } else {
                  L9: {
                    if (null == ((km) this).field_n) {
                      break L9;
                    } else {
                      if (!((km) this).field_P.field_o.field_i) {
                        var6_ref = (sd) (Object) ((km) this).field_n.field_i.d(0);
                        L10: while (true) {
                          L11: {
                            if (var6_ref == null) {
                              break L11;
                            } else {
                              if (var6_ref.field_x == 0) {
                                var6_ref = (sd) (Object) ((km) this).field_n.field_i.a((byte) -71);
                                continue L10;
                              } else {
                                break L11;
                              }
                            }
                          }
                          L12: {
                            if (var6_ref == null) {
                              L13: {
                                if (((km) this).field_W) {
                                  fl.a(0, "buildships");
                                  break L13;
                                } else {
                                  break L13;
                                }
                              }
                              ((km) this).field_Y.a(-86, 0);
                              break L12;
                            } else {
                              ((km) this).field_c = var6_ref;
                              ((km) this).field_Y.a(-102, 2);
                              var7 = var6_ref.j(18229);
                              L14: while (true) {
                                if (var7 == null) {
                                  break L12;
                                } else {
                                  ((km) this).field_z.field_z[var7.field_p] = 2;
                                  var7 = var6_ref.h(-23410);
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
                  ((km) this).field_Y.a(-87, 0);
                  break L7;
                }
              }
              this.a(((km) this).field_n, -81);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L15: {
            var3 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var3;
            stackOut_43_1 = new StringBuilder().append("km.S(");
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param0 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L15;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L15;
            }
          }
          throw r.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + 44 + -83 + 41);
        }
    }

    private final int[] c() {
        int[] var2 = null;
        int var4 = 0;
        int var6 = 0;
        sd var7 = null;
        int var8 = 0;
        int[] var9 = null;
        ln[] var10 = null;
        ln var11 = null;
        fs[] var12 = null;
        fs var13 = null;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        var9 = new int[((km) this).field_P.field_r];
        var2 = var9;
        var10 = ((km) this).field_P.field_g.field_e;
        var4 = 0;
        L0: while (true) {
          if (var4 >= var10.length) {
            var12 = ((km) this).field_P.field_v;
            var4 = 0;
            L1: while (true) {
              if (var12.length <= var4) {
                return var2;
              } else {
                var13 = var12[var4];
                var6 = var13.field_x;
                if (((km) this).field_P.field_o.field_i) {
                  if (null != var13.field_m) {
                    if (var13.field_m.field_r > 0) {
                      var2[var6] = var2[var6] + var13.field_m.field_r;
                      var4++;
                      continue L1;
                    } else {
                      var4++;
                      continue L1;
                    }
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var7 = (sd) (Object) var13.field_i.d(0);
                  L2: while (true) {
                    if (var7 != null) {
                      L3: {
                        if (0 < var7.field_r) {
                          var2[var6] = var2[var6] + var7.field_r;
                          break L3;
                        } else {
                          break L3;
                        }
                      }
                      var7 = (sd) (Object) var13.field_i.a((byte) -71);
                      continue L2;
                    } else {
                      var4++;
                      continue L1;
                    }
                  }
                }
              }
            }
          } else {
            var11 = var10[var4];
            if (null != var11.field_y) {
              var9[var11.field_y.field_x] = var9[var11.field_y.field_x] + var11.field_x;
              var4++;
              continue L0;
            } else {
              var4++;
              continue L0;
            }
          }
        }
    }

    final void a(fs param0, byte param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        sl var6 = null;
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
                    ((km) this).field_n.field_w = ((km) this).field_n.field_w | 1 << param0.field_x;
                    param0.field_A = param0.field_A | 1 << ((km) this).field_n.field_x;
                    if (!((km) this).field_f) {
                      if ((1 << param0.field_x & ((km) this).field_n.field_A) != 0) {
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
                      } else {
                        int discarded$2 = 1;
                        this.a(((km) this).field_n, param0);
                        break L2;
                      }
                    } else {
                      var6 = js.field_f;
                      var6.h(59, 255);
                      var6.field_j = var6.field_j + 2;
                      var4 = var6.field_j;
                      var6.c(((km) this).field_P.field_O, (byte) -106);
                      var6.c(255, (byte) -78);
                      var6.c(((km) this).field_n.field_x, (byte) -126);
                      var6.c(param0.field_x, (byte) -104);
                      var6.f(-549342136, -var4 + var6.field_j);
                      if ((((km) this).field_n.field_A & 1 << param0.field_x) != 0) {
                        break L2;
                      } else {
                        int discarded$3 = 1;
                        this.a(((km) this).field_n, param0);
                        break L2;
                      }
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
          L3: {
            var3 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("km.EA(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L3;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 44 + param1 + 41);
        }
    }

    km(boolean param0, boolean param1, int param2, vr param3, int param4, String[] param5, int param6, boolean param7, kq param8) {
        RuntimeException var10 = null;
        int var10_int = 0;
        fs[] var10_array = null;
        int var11 = 0;
        fs var12 = null;
        fs[] var14 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        fs stackIn_20_0 = null;
        fs stackIn_21_0 = null;
        fs stackIn_22_0 = null;
        String stackIn_22_1 = null;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        Object stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        RuntimeException stackIn_56_0 = null;
        StringBuilder stackIn_56_1 = null;
        RuntimeException stackIn_57_0 = null;
        StringBuilder stackIn_57_1 = null;
        String stackIn_57_2 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        RuntimeException stackIn_60_0 = null;
        StringBuilder stackIn_60_1 = null;
        String stackIn_60_2 = null;
        RuntimeException stackIn_61_0 = null;
        StringBuilder stackIn_61_1 = null;
        RuntimeException stackIn_62_0 = null;
        StringBuilder stackIn_62_1 = null;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_63_2 = null;
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
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        fs stackOut_19_0 = null;
        fs stackOut_21_0 = null;
        String stackOut_21_1 = null;
        fs stackOut_20_0 = null;
        String stackOut_20_1 = null;
        Object stackOut_31_0 = null;
        Object stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        RuntimeException stackOut_54_0 = null;
        StringBuilder stackOut_54_1 = null;
        RuntimeException stackOut_56_0 = null;
        StringBuilder stackOut_56_1 = null;
        String stackOut_56_2 = null;
        RuntimeException stackOut_55_0 = null;
        StringBuilder stackOut_55_1 = null;
        String stackOut_55_2 = null;
        RuntimeException stackOut_57_0 = null;
        StringBuilder stackOut_57_1 = null;
        RuntimeException stackOut_59_0 = null;
        StringBuilder stackOut_59_1 = null;
        String stackOut_59_2 = null;
        RuntimeException stackOut_58_0 = null;
        StringBuilder stackOut_58_1 = null;
        String stackOut_58_2 = null;
        RuntimeException stackOut_60_0 = null;
        StringBuilder stackOut_60_1 = null;
        RuntimeException stackOut_62_0 = null;
        StringBuilder stackOut_62_1 = null;
        String stackOut_62_2 = null;
        RuntimeException stackOut_61_0 = null;
        StringBuilder stackOut_61_1 = null;
        String stackOut_61_2 = null;
        ((km) this).field_F = 25;
        ((km) this).field_T = false;
        ((km) this).field_I = ((km) this).field_F;
        ((km) this).field_y = false;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param0) {
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
              ((km) this).field_f = stackIn_4_1 != 0;
              ((km) this).field_h = param6;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param1) {
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
            L3: {
              ((km) this).field_W = stackIn_7_1 != 0;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (!param7) {
                stackOut_9_0 = this;
                stackOut_9_1 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                break L3;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                break L3;
              }
            }
            L4: {
              ((km) this).field_M = stackIn_10_1 != 0;
              if (((km) this).field_f) {
                ((km) this).field_P = uq.a(param4, param2, -27579, param5, param3);
                break L4;
              } else {
                if (!((km) this).field_W) {
                  ((km) this).field_P = qr.a(param2, 50, param5, param3, param4, 2);
                  break L4;
                } else {
                  int discarded$4 = 4;
                  int discarded$5 = -22379;
                  ((km) this).field_P = jg.a(param3, param5, param2);
                  ob.a(-126, (km) this);
                  break L4;
                }
              }
            }
            L5: {
              if (((km) this).field_f) {
                var10_int = 0;
                L6: while (true) {
                  if (var10_int >= ((km) this).field_P.field_r) {
                    break L5;
                  } else {
                    L7: {
                      if (!param5[var10_int].equals((Object) (Object) "bot_sp")) {
                        break L7;
                      } else {
                        ((km) this).field_P.field_v[var10_int].field_t = hn.field_f[var10_int];
                        break L7;
                      }
                    }
                    var10_int++;
                    continue L6;
                  }
                }
              } else {
                var10_int = 1;
                L8: while (true) {
                  if (((km) this).field_P.field_r <= var10_int) {
                    L9: {
                      int discarded$6 = 1;
                      stackOut_19_0 = ((km) this).field_P.field_v[0];
                      stackIn_21_0 = stackOut_19_0;
                      stackIn_20_0 = stackOut_19_0;
                      if (w.d()) {
                        stackOut_21_0 = (fs) (Object) stackIn_21_0;
                        stackOut_21_1 = hn.field_f[0];
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        break L9;
                      } else {
                        stackOut_20_0 = (fs) (Object) stackIn_20_0;
                        stackOut_20_1 = ln.field_o;
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_22_1 = stackOut_20_1;
                        break L9;
                      }
                    }
                    stackIn_22_0.field_t = stackIn_22_1;
                    break L5;
                  } else {
                    ((km) this).field_P.field_v[var10_int].field_t = hn.field_f[var10_int];
                    var10_int++;
                    continue L8;
                  }
                }
              }
            }
            L10: {
              if (((km) this).field_h >= 0) {
                ((km) this).field_n = ((km) this).field_P.field_v[((km) this).field_h];
                break L10;
              } else {
                ((km) this).field_n = null;
                break L10;
              }
            }
            L11: {
              stackOut_31_0 = this;
              stackIn_33_0 = stackOut_31_0;
              stackIn_32_0 = stackOut_31_0;
              if (((km) this).field_n == null) {
                stackOut_33_0 = this;
                stackOut_33_1 = 0;
                stackIn_34_0 = stackOut_33_0;
                stackIn_34_1 = stackOut_33_1;
                break L11;
              } else {
                stackOut_32_0 = this;
                stackOut_32_1 = 1;
                stackIn_34_0 = stackOut_32_0;
                stackIn_34_1 = stackOut_32_1;
                break L11;
              }
            }
            ((km) this).field_b = stackIn_34_1 != 0;
            ((km) this).field_s = (uj[]) (Object) new hi[((km) this).field_P.field_v.length];
            var14 = ((km) this).field_P.field_v;
            var10_array = var14;
            var11 = 0;
            L12: while (true) {
              if (var14.length <= var11) {
                L13: {
                  if (((km) this).field_W) {
                    var10_int = 1;
                    L14: while (true) {
                      if (((km) this).field_P.field_r <= var10_int) {
                        break L13;
                      } else {
                        int discarded$7 = -114;
                        ((km) this).field_s[var10_int] = og.a(2, (mn) this, ((km) this).field_P.field_v[var10_int], ((km) this).field_P);
                        ((km) this).field_s[var10_int].a(false, -6861);
                        var10_int++;
                        continue L14;
                      }
                    }
                  } else {
                    if (((km) this).field_f) {
                      break L13;
                    } else {
                      var10_int = 0;
                      L15: while (true) {
                        if (var10_int >= ((km) this).field_P.field_r) {
                          break L13;
                        } else {
                          L16: {
                            if (((km) this).field_h == var10_int) {
                              break L16;
                            } else {
                              ((km) this).field_s[var10_int] = (uj) (Object) new hi(((km) this).field_P.field_v[var10_int], ((km) this).field_P, (mn) this);
                              ((km) this).field_s[var10_int].a(true, -6861);
                              break L16;
                            }
                          }
                          var10_int++;
                          continue L15;
                        }
                      }
                    }
                  }
                }
                L17: {
                  if (param8 == null) {
                    break L17;
                  } else {
                    param8.a((byte) -33, (km) this);
                    ((km) this).field_Y = param8;
                    break L17;
                  }
                }
                L18: {
                  ((km) this).field_H = new pf();
                  if (!((km) this).field_f) {
                    ((km) this).b((byte) -81);
                    ((km) this).field_z.field_p = null;
                    ((km) this).field_P.d(-9778, 0);
                    ((km) this).field_S = mb.field_o[((km) this).field_P.field_J];
                    break L18;
                  } else {
                    ((km) this).field_ab = new db();
                    ((km) this).field_o = new db();
                    ((km) this).field_v = new wb();
                    ((km) this).field_k = -1;
                    ((km) this).field_g = -1;
                    ((km) this).field_P.d(-9778, -1);
                    break L18;
                  }
                }
                ((km) this).field_G = false;
                ((km) this).field_L = false;
                break L0;
              } else {
                var12 = var14[var11];
                var12.field_q = new um(20);
                var11++;
                continue L12;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L19: {
            var10 = decompiledCaughtException;
            stackOut_54_0 = (RuntimeException) var10;
            stackOut_54_1 = new StringBuilder().append("km.<init>(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_56_0 = stackOut_54_0;
            stackIn_56_1 = stackOut_54_1;
            stackIn_55_0 = stackOut_54_0;
            stackIn_55_1 = stackOut_54_1;
            if (param3 == null) {
              stackOut_56_0 = (RuntimeException) (Object) stackIn_56_0;
              stackOut_56_1 = (StringBuilder) (Object) stackIn_56_1;
              stackOut_56_2 = "null";
              stackIn_57_0 = stackOut_56_0;
              stackIn_57_1 = stackOut_56_1;
              stackIn_57_2 = stackOut_56_2;
              break L19;
            } else {
              stackOut_55_0 = (RuntimeException) (Object) stackIn_55_0;
              stackOut_55_1 = (StringBuilder) (Object) stackIn_55_1;
              stackOut_55_2 = "{...}";
              stackIn_57_0 = stackOut_55_0;
              stackIn_57_1 = stackOut_55_1;
              stackIn_57_2 = stackOut_55_2;
              break L19;
            }
          }
          L20: {
            stackOut_57_0 = (RuntimeException) (Object) stackIn_57_0;
            stackOut_57_1 = ((StringBuilder) (Object) stackIn_57_1).append(stackIn_57_2).append(44).append(param4).append(44);
            stackIn_59_0 = stackOut_57_0;
            stackIn_59_1 = stackOut_57_1;
            stackIn_58_0 = stackOut_57_0;
            stackIn_58_1 = stackOut_57_1;
            if (param5 == null) {
              stackOut_59_0 = (RuntimeException) (Object) stackIn_59_0;
              stackOut_59_1 = (StringBuilder) (Object) stackIn_59_1;
              stackOut_59_2 = "null";
              stackIn_60_0 = stackOut_59_0;
              stackIn_60_1 = stackOut_59_1;
              stackIn_60_2 = stackOut_59_2;
              break L20;
            } else {
              stackOut_58_0 = (RuntimeException) (Object) stackIn_58_0;
              stackOut_58_1 = (StringBuilder) (Object) stackIn_58_1;
              stackOut_58_2 = "{...}";
              stackIn_60_0 = stackOut_58_0;
              stackIn_60_1 = stackOut_58_1;
              stackIn_60_2 = stackOut_58_2;
              break L20;
            }
          }
          L21: {
            stackOut_60_0 = (RuntimeException) (Object) stackIn_60_0;
            stackOut_60_1 = ((StringBuilder) (Object) stackIn_60_1).append(stackIn_60_2).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_62_0 = stackOut_60_0;
            stackIn_62_1 = stackOut_60_1;
            stackIn_61_0 = stackOut_60_0;
            stackIn_61_1 = stackOut_60_1;
            if (param8 == null) {
              stackOut_62_0 = (RuntimeException) (Object) stackIn_62_0;
              stackOut_62_1 = (StringBuilder) (Object) stackIn_62_1;
              stackOut_62_2 = "null";
              stackIn_63_0 = stackOut_62_0;
              stackIn_63_1 = stackOut_62_1;
              stackIn_63_2 = stackOut_62_2;
              break L21;
            } else {
              stackOut_61_0 = (RuntimeException) (Object) stackIn_61_0;
              stackOut_61_1 = (StringBuilder) (Object) stackIn_61_1;
              stackOut_61_2 = "{...}";
              stackIn_63_0 = stackOut_61_0;
              stackIn_63_1 = stackOut_61_1;
              stackIn_63_2 = stackOut_61_2;
              break L21;
            }
          }
          throw r.a((Throwable) (Object) stackIn_63_0, stackIn_63_2 + 41);
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
