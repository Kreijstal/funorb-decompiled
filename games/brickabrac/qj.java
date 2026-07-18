/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class qj extends gf {
    boolean field_p;
    static int field_h;
    ak field_w;
    static jp field_l;
    int field_v;
    int field_r;
    private int field_i;
    int field_x;
    static mh field_u;
    boolean field_n;
    static int field_j;
    int field_k;
    boolean field_s;
    private int field_m;
    private boolean field_y;
    boolean field_q;
    int field_o;
    private int field_t;

    private final void a(int param0) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_49_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_21_1 = 0;
        int stackOut_23_0 = 0;
        int stackOut_23_1 = 0;
        int stackOut_48_0 = 0;
        int stackOut_46_0 = 0;
        try {
          L0: {
            L1: {
              L2: {
                if (pf.field_p) {
                  break L2;
                } else {
                  if (la.field_c) {
                    break L2;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_7_0 = stackOut_4_0;
                    break L1;
                  }
                }
              }
              stackOut_6_0 = 0;
              stackIn_7_0 = stackOut_6_0;
              break L1;
            }
            L3: {
              var2_int = stackIn_7_0;
              if (param0 == -1) {
                break L3;
              } else {
                this.a((byte) -2, (j) null);
                break L3;
              }
            }
            L4: {
              stackOut_10_0 = var2_int;
              stackIn_13_0 = stackOut_10_0;
              stackIn_11_0 = stackOut_10_0;
              if ((((qj) this).field_o & (((qj) this).field_w.field_i | ((qj) this).field_w.field_g | ((qj) this).field_w.field_a)) != ((qj) this).field_o) {
                stackOut_13_0 = stackIn_13_0;
                stackOut_13_1 = 0;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                break L4;
              } else {
                stackOut_11_0 = stackIn_11_0;
                stackOut_11_1 = 1;
                stackIn_14_0 = stackOut_11_0;
                stackIn_14_1 = stackOut_11_1;
                break L4;
              }
            }
            L5: {
              L6: {
                var2_int = stackIn_14_0 & stackIn_14_1;
                stackOut_14_0 = var2_int;
                stackIn_23_0 = stackOut_14_0;
                stackIn_15_0 = stackOut_14_0;
                if (2 >= ((qj) this).field_w.field_k) {
                  break L6;
                } else {
                  L7: {
                    stackOut_15_0 = stackIn_15_0;
                    stackIn_21_0 = stackOut_15_0;
                    stackIn_16_0 = stackOut_15_0;
                    if (((qj) this).field_k < 0) {
                      break L7;
                    } else {
                      stackOut_16_0 = stackIn_16_0;
                      stackIn_18_0 = stackOut_16_0;
                      stackOut_18_0 = stackIn_18_0;
                      stackIn_23_0 = stackOut_18_0;
                      stackIn_19_0 = stackOut_18_0;
                      if (((qj) this).field_w.field_l[((qj) this).field_k].field_U < 50) {
                        break L6;
                      } else {
                        stackOut_19_0 = stackIn_19_0;
                        stackIn_21_0 = stackOut_19_0;
                        break L7;
                      }
                    }
                  }
                  stackOut_21_0 = stackIn_21_0;
                  stackOut_21_1 = 1;
                  stackIn_24_0 = stackOut_21_0;
                  stackIn_24_1 = stackOut_21_1;
                  break L5;
                }
              }
              stackOut_23_0 = stackIn_23_0;
              stackOut_23_1 = 0;
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              break L5;
            }
            L8: {
              var2_int = stackIn_24_0 & stackIn_24_1;
              if (var2_int == 0) {
                break L8;
              } else {
                L9: {
                  L10: {
                    if (pe.field_l[fq.field_b]) {
                      break L10;
                    } else {
                      if (!pe.field_l[td.field_u]) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  int fieldTemp$2 = ((qj) this).field_m + 1;
                  ((qj) this).field_m = ((qj) this).field_m + 1;
                  ((qj) this).field_m = fieldTemp$2 % ((qj) this).field_w.field_k;
                  if (!BrickABrac.field_J) {
                    break L8;
                  } else {
                    break L9;
                  }
                }
                if (!pe.field_l[ac.field_f]) {
                  break L8;
                } else {
                  int fieldTemp$3 = ((qj) this).field_m - 1;
                  ((qj) this).field_m = ((qj) this).field_m - 1;
                  ((qj) this).field_m = (((qj) this).field_w.field_k + fieldTemp$3) % ((qj) this).field_w.field_k;
                  break L8;
                }
              }
            }
            L11: {
              L12: {
                if (pe.field_l[fq.field_b]) {
                  break L12;
                } else {
                  if (pe.field_l[ac.field_f]) {
                    break L12;
                  } else {
                    if (!pe.field_l[td.field_u]) {
                      stackOut_48_0 = 0;
                      stackIn_49_0 = stackOut_48_0;
                      break L11;
                    } else {
                      break L12;
                    }
                  }
                }
              }
              stackOut_46_0 = 1;
              stackIn_49_0 = stackOut_46_0;
              break L11;
            }
            la.field_c = stackIn_49_0 != 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "qj.W(" + param0 + ')');
        }
    }

    private final boolean a(int param0, int param1) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_5_0 = 0;
        try {
          L0: {
            if (eo.a(mk.field_b, param0, (byte) -75)) {
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              var3 = mk.field_b;
              var4 = param0;
              var3[var4 >> 775242053] = ud.d(var3[var4 >> 775242053], 1 << ik.a(31, var4));
              var3 = pl.field_b;
              var4 = param0;
              var3[var4 >> 1405197989] = ud.d(var3[var4 >> 1405197989], param1 << ik.a(var4, 31));
              kp.field_c.a((nm) (Object) new kq(param0), (byte) 3);
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var3_ref, "qj.FA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_6_0 != 0;
    }

    final void b(byte param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            lb.a();
            if (!((qj) this).field_q) {
              return;
            } else {
              L1: {
                if (param0 <= -14) {
                  break L1;
                } else {
                  ((qj) this).a((byte) -47, -81);
                  break L1;
                }
              }
              this.g(41);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "qj.L(" + param0 + ')');
        }
    }

    final void a(pi param0, boolean param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              L2: {
                var4_int = param0.l(255);
                ((qj) this).field_w.field_l[var4_int].field_V = param0.j(48);
                var5 = -101 % ((param2 - 26) / 60);
                if (param1) {
                  break L2;
                } else {
                  ((qj) this).field_w.field_g = ((qj) this).field_w.field_g | 1 << var4_int;
                  if (!BrickABrac.field_J) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((qj) this).field_w.field_l[var4_int].field_zb = param0.l(255);
              ((qj) this).field_w.field_a = ((qj) this).field_w.field_a | 1 << var4_int;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) runtimeException;
            stackOut_7_1 = new StringBuilder().append("qj.A(");
            stackIn_10_0 = stackOut_7_0;
            stackIn_10_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_11_0 = stackOut_8_0;
              stackIn_11_1 = stackOut_8_1;
              stackIn_11_2 = stackOut_8_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte param0, pi param1) {
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
              ((qj) this).field_w.field_l[((qj) this).field_k].field_E = ((qj) this).field_w.field_l[((qj) this).field_k].field_E + 5;
              ((qj) this).field_w.field_l[((qj) this).field_k].field_p = param1.i(65280);
              if (param0 == 33) {
                break L1;
              } else {
                this.a((byte) 15, (j) null);
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
            stackOut_3_1 = new StringBuilder().append("qj.M(").append(param0).append(',');
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
          throw qb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
    }

    private final void a(int param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a(param2, 1)) {
              return;
            } else {
              L1: {
                if (!((qj) this).field_s) {
                  var4_int = ((qj) this).field_w.field_l[0].field_ob;
                  ep.field_i = ep.field_i - (var4_int - -((qj) this).field_t);
                  var5 = ((qj) this).field_w.field_l[0].field_qb;
                  fp.field_z = fp.field_z + var5;
                  lp.field_wb.a((nm) (Object) new e(param2, param0, fp.field_z, ep.field_i, od.field_c, og.field_Wb), (byte) 3);
                  fp.field_z = fp.field_z + (var4_int + ((qj) this).field_t);
                  ep.field_i = ep.field_i - var5;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (param1 == 67) {
                  break L2;
                } else {
                  ((qj) this).field_i = 125;
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var4, "qj.S(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(boolean param0, boolean param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6_int = 0;
        j var6 = null;
        vl var6_ref = null;
        vl var7 = null;
        j var8_ref_j = null;
        int var8 = 0;
        long var9_long = 0L;
        int var9_int = 0;
        j var9 = null;
        vn var9_ref = null;
        j var11 = null;
        j var12 = null;
        vn var13 = null;
        int var14 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_104_0 = 0;
        int stackIn_111_0 = 0;
        int stackIn_116_0 = 0;
        int stackIn_129_0 = 0;
        int stackIn_201_0 = 0;
        int stackIn_201_1 = 0;
        int stackIn_210_0 = 0;
        int stackIn_210_1 = 0;
        String stackIn_238_0 = null;
        Object stackIn_254_0 = null;
        int stackIn_254_1 = 0;
        int stackIn_254_2 = 0;
        Object stackIn_255_0 = null;
        int stackIn_255_1 = 0;
        int stackIn_255_2 = 0;
        Object stackIn_256_0 = null;
        int stackIn_256_1 = 0;
        int stackIn_256_2 = 0;
        Object stackIn_257_0 = null;
        int stackIn_257_1 = 0;
        int stackIn_257_2 = 0;
        int stackIn_257_3 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_19_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_103_0 = 0;
        boolean stackOut_110_0 = false;
        int stackOut_115_0 = 0;
        int stackOut_128_0 = 0;
        int stackOut_200_0 = 0;
        int stackOut_200_1 = 0;
        int stackOut_209_0 = 0;
        int stackOut_209_1 = 0;
        String stackOut_237_0 = null;
        String stackOut_236_0 = null;
        Object stackOut_253_0 = null;
        int stackOut_253_1 = 0;
        int stackOut_253_2 = 0;
        Object stackOut_256_0 = null;
        int stackOut_256_1 = 0;
        int stackOut_256_2 = 0;
        int stackOut_256_3 = 0;
        Object stackOut_254_0 = null;
        int stackOut_254_1 = 0;
        int stackOut_254_2 = 0;
        Object stackOut_255_0 = null;
        int stackOut_255_1 = 0;
        int stackOut_255_2 = 0;
        int stackOut_255_3 = 0;
        var14 = BrickABrac.field_J ? 1 : 0;
        if (((qj) this).field_q) {
          L0: {
            if (null == oa.field_Sb) {
              break L0;
            } else {
              oa.field_Sb.e(1);
              if (!oa.field_Sb.field_q) {
                oa.field_Sb.d(59);
                break L0;
              } else {
                break L0;
              }
            }
          }
          L1: {
            if (km.field_i <= 0) {
              break L1;
            } else {
              int fieldTemp$3 = km.field_i - 1;
              km.field_i = km.field_i - 1;
              if (fieldTemp$3 != 0) {
                break L1;
              } else {
                fq.field_c = null;
                ih.field_k = null;
                break L1;
              }
            }
          }
          L2: {
            if (((qj) this).field_w.field_l[((qj) this).field_m].field_M == -1) {
              stackOut_13_0 = 0;
              stackIn_14_0 = stackOut_13_0;
              break L2;
            } else {
              stackOut_12_0 = 1;
              stackIn_14_0 = stackOut_12_0;
              break L2;
            }
          }
          L3: {
            L4: {
              var4_int = stackIn_14_0;
              stackOut_14_0 = var4_int;
              stackIn_20_0 = stackOut_14_0;
              stackIn_15_0 = stackOut_14_0;
              if (((qj) this).field_p) {
                break L4;
              } else {
                stackOut_15_0 = stackIn_15_0;
                stackIn_20_0 = stackOut_15_0;
                stackIn_16_0 = stackOut_15_0;
                if (((qj) this).field_w.field_k != 2) {
                  break L4;
                } else {
                  stackOut_16_0 = stackIn_16_0;
                  stackIn_17_0 = stackOut_16_0;
                  stackOut_17_0 = stackIn_17_0;
                  stackIn_20_0 = stackOut_17_0;
                  stackIn_18_0 = stackOut_17_0;
                  if (-1 == ((qj) this).field_w.field_l[-((qj) this).field_m + 1].field_M) {
                    break L4;
                  } else {
                    stackOut_18_0 = stackIn_18_0;
                    stackIn_19_0 = stackOut_18_0;
                    stackOut_19_0 = stackIn_19_0;
                    stackOut_19_1 = 1;
                    stackIn_21_0 = stackOut_19_0;
                    stackIn_21_1 = stackOut_19_1;
                    break L3;
                  }
                }
              }
            }
            stackOut_20_0 = stackIn_20_0;
            stackOut_20_1 = 0;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            break L3;
          }
          L5: {
            L6: {
              L7: {
                var4_int = stackIn_21_0 | stackIn_21_1;
                if (1 != ((qj) this).field_w.field_k) {
                  break L7;
                } else {
                  if (((qj) this).field_w.field_l[0].field_Z == 5) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              L8: {
                if (!((qj) this).field_w.field_c) {
                  break L8;
                } else {
                  ji.a(25459, true, oj.field_q, 1, 1, true);
                  if (var14 == 0) {
                    break L5;
                  } else {
                    break L8;
                  }
                }
              }
              L9: {
                if (var4_int != 0) {
                  break L9;
                } else {
                  L10: {
                    if (oa.field_Sb == null) {
                      break L10;
                    } else {
                      if (!oa.field_Sb.field_q) {
                        break L10;
                      } else {
                        wj.a(1, true, oa.field_Sb.c(-109), false, 1, oa.field_Sb.field_n, true);
                        if (var14 == 0) {
                          break L5;
                        } else {
                          break L10;
                        }
                      }
                    }
                  }
                  ji.a(25459, true, cd.field_g, 1, 1, true);
                  if (var14 == 0) {
                    break L5;
                  } else {
                    break L9;
                  }
                }
              }
              ji.a(25459, true, uk.field_t, 1, 1, true);
              if (var14 == 0) {
                break L5;
              } else {
                break L6;
              }
            }
            ji.a(25459, true, c.field_j, 1, 1, true);
            break L5;
          }
          L11: {
            if (!((qj) this).field_w.field_c) {
              break L11;
            } else {
              if (((qj) this).field_w.field_k <= 1) {
                break L11;
              } else {
                int fieldTemp$4 = be.field_j + 1;
                be.field_j = be.field_j + 1;
                if (fieldTemp$4 != 300) {
                  break L11;
                } else {
                  L12: {
                    if (!m.field_a) {
                      break L12;
                    } else {
                      int fieldTemp$5 = ml.field_f + 1;
                      ml.field_f = ml.field_f + 1;
                      System.out.println("Concluded " + fieldTemp$5 + " games (" + cf.field_a + " errors)");
                      if ((1 << ((qj) this).field_k & ((qj) this).field_w.field_j) != 0) {
                        break L12;
                      } else {
                        ((qj) this).f(87);
                        break L12;
                      }
                    }
                  }
                  L13: {
                    po.a((byte) -97);
                    if (!((qj) this).field_p) {
                      break L13;
                    } else {
                      L14: {
                        if (op.field_a) {
                          break L14;
                        } else {
                          da.f((byte) 122);
                          if (var14 == 0) {
                            break L11;
                          } else {
                            break L14;
                          }
                        }
                      }
                      L15: {
                        if (null == hd.field_d) {
                          break L15;
                        } else {
                          if (hd.field_d.field_a == -2) {
                            break L11;
                          } else {
                            break L15;
                          }
                        }
                      }
                      ng.a(false, 101, 19);
                      if (var14 == 0) {
                        break L11;
                      } else {
                        break L13;
                      }
                    }
                  }
                  ng.a(false, 62, 20);
                  cc.field_G = true;
                  break L11;
                }
              }
            }
          }
          L16: {
            if (param2 < -52) {
              break L16;
            } else {
              ((qj) this).field_w = null;
              break L16;
            }
          }
          L17: {
            var5 = oo.field_w.a(-37880252, 10);
            var6_int = oo.field_w.a(-37880252, 3);
            if (var5 == 0) {
              od.field_c = od.field_c + 1;
              fp.field_z = fp.field_z + og.field_Wb;
              break L17;
            } else {
              break L17;
            }
          }
          L18: {
            if (var5 == 1) {
              od.field_c = od.field_c - 2;
              fp.field_z = fp.field_z - 2 * og.field_Wb;
              break L18;
            } else {
              break L18;
            }
          }
          L19: {
            if (var5 != 2) {
              break L19;
            } else {
              fp.field_z = fp.field_z + 2 * od.field_c;
              og.field_Wb = og.field_Wb + 2;
              break L19;
            }
          }
          L20: {
            if (var5 != 3) {
              break L20;
            } else {
              og.field_Wb = og.field_Wb - 1;
              fp.field_z = fp.field_z - od.field_c;
              break L20;
            }
          }
          L21: {
            if (var5 != 4) {
              break L21;
            } else {
              od.field_c = od.field_c + 1;
              ep.field_i = ep.field_i + og.field_Wb;
              break L21;
            }
          }
          L22: {
            if (var5 != 5) {
              break L22;
            } else {
              ep.field_i = ep.field_i - og.field_Wb * 2;
              od.field_c = od.field_c - 2;
              break L22;
            }
          }
          L23: {
            if (6 != var5) {
              break L23;
            } else {
              ep.field_i = ep.field_i + og.field_Wb;
              od.field_c = od.field_c + 1;
              break L23;
            }
          }
          L24: {
            if (var5 == 7) {
              ep.field_i = ep.field_i - od.field_c * 2;
              og.field_Wb = og.field_Wb - 2;
              break L24;
            } else {
              break L24;
            }
          }
          L25: {
            if (var5 != 8) {
              break L25;
            } else {
              fp.field_z = fp.field_z + var6_int;
              fp.field_z = fp.field_z - var6_int;
              break L25;
            }
          }
          L26: {
            if (var5 != 9) {
              break L26;
            } else {
              ep.field_i = ep.field_i + var6_int;
              fp.field_z = fp.field_z - var6_int;
              break L26;
            }
          }
          L27: {
            var5 = oo.field_w.a(-37880252, 5);
            if (var5 != 0) {
              break L27;
            } else {
              hg.field_e = hg.field_e ^ tm.field_g + qm.field_a << -2077966224;
              break L27;
            }
          }
          L28: {
            if (var5 != 1) {
              break L28;
            } else {
              ek.field_kb = ek.field_kb - tm.field_g;
              qm.field_a = qm.field_a - 1;
              break L28;
            }
          }
          L29: {
            if (var5 != 2) {
              break L29;
            } else {
              ek.field_kb = ek.field_kb + tm.field_g;
              qm.field_a = qm.field_a + 1;
              break L29;
            }
          }
          L30: {
            if (var5 == 3) {
              ek.field_kb = ek.field_kb - qm.field_a;
              tm.field_g = tm.field_g - 1;
              break L30;
            } else {
              break L30;
            }
          }
          L31: {
            if (var5 != 4) {
              break L31;
            } else {
              ek.field_kb = ek.field_kb + qm.field_a;
              tm.field_g = tm.field_g + 1;
              break L31;
            }
          }
          L32: {
            L33: {
              if (((qj) this).field_p) {
                var5 = 0;
                L34: while (true) {
                  if (~((qj) this).field_w.field_k >= ~var5) {
                    break L33;
                  } else {
                    stackOut_103_0 = ((qj) this).field_o & 1 << var5;
                    stackIn_111_0 = stackOut_103_0;
                    stackIn_104_0 = stackOut_103_0;
                    if (var14 != 0) {
                      break L32;
                    } else {
                      L35: {
                        L36: {
                          if (stackIn_104_0 != 0) {
                            break L36;
                          } else {
                            if (var14 == 0) {
                              break L35;
                            } else {
                              break L36;
                            }
                          }
                        }
                        var6 = ((qj) this).field_w.field_l[var5];
                        var6.field_vb[var6.field_F % 5] = 0;
                        break L35;
                      }
                      var5++;
                      if (var14 == 0) {
                        continue L34;
                      } else {
                        break L33;
                      }
                    }
                  }
                }
              } else {
                break L33;
              }
            }
            stackOut_110_0 = param1;
            stackIn_111_0 = stackOut_110_0 ? 1 : 0;
            break L32;
          }
          L37: {
            if (stackIn_111_0 == 0) {
              break L37;
            } else {
              this.a(-1);
              break L37;
            }
          }
          var5 = 0;
          L38: while (true) {
            L39: {
              L40: {
                if (var5 >= ((qj) this).field_w.field_k) {
                  break L40;
                } else {
                  stackOut_115_0 = ((qj) this).field_o & 1 << var5;
                  stackIn_129_0 = stackOut_115_0;
                  stackIn_116_0 = stackOut_115_0;
                  if (var14 != 0) {
                    break L39;
                  } else {
                    L41: {
                      L42: {
                        if (stackIn_116_0 != 0) {
                          break L42;
                        } else {
                          if (var14 == 0) {
                            break L41;
                          } else {
                            break L42;
                          }
                        }
                      }
                      L43: {
                        L44: {
                          var6 = ((qj) this).field_w.field_l[var5];
                          if (param1) {
                            break L44;
                          } else {
                            var6.field_db = 0;
                            if (var14 == 0) {
                              break L43;
                            } else {
                              break L44;
                            }
                          }
                        }
                        this.a((byte) 73, var6);
                        break L43;
                      }
                      if (((qj) this).field_p) {
                        var6.field_vb[var6.field_F % 5] = var6.field_db;
                        break L41;
                      } else {
                        break L41;
                      }
                    }
                    var5++;
                    if (var14 == 0) {
                      continue L38;
                    } else {
                      break L40;
                    }
                  }
                }
              }
              stackOut_128_0 = 0;
              stackIn_129_0 = stackOut_128_0;
              break L39;
            }
            L45: {
              L46: {
                var5 = stackIn_129_0;
                var6_ref = new vl();
                var7 = new vl();
                if (!r.field_A) {
                  break L46;
                } else {
                  if (km.field_i != 0) {
                    break L45;
                  } else {
                    L47: {
                      od.a((byte) 32);
                      var8_ref_j = ((qj) this).field_w.field_l[0];
                      if (2 != var8_ref_j.field_Z) {
                        break L47;
                      } else {
                        jc.a(var8_ref_j.field_db, 0, (byte) -85);
                        break L47;
                      }
                    }
                    L48: {
                      L49: {
                        if (var8_ref_j.field_Z == 0) {
                          break L49;
                        } else {
                          if (ka.a((byte) 62)) {
                            break L48;
                          } else {
                            break L49;
                          }
                        }
                      }
                      var5 = this.a(var7, true, var6_ref) ? 1 : 0;
                      break L48;
                    }
                    if (var14 == 0) {
                      break L45;
                    } else {
                      break L46;
                    }
                  }
                }
              }
              var5 = this.a(var7, true, var6_ref) ? 1 : 0;
              break L45;
            }
            L50: {
              bm.a(96, 96, false, -30791, var6_ref);
              bm.a(48, 48, true, -30791, var7);
              if (((qj) this).field_w.field_k != 1) {
                break L50;
              } else {
                L51: {
                  var8_ref_j = ((qj) this).field_w.field_l[0];
                  if (var8_ref_j.field_qb > ((qj) this).field_i) {
                    L52: {
                      L53: {
                        L54: {
                          var9_long = ue.a(false);
                          this.a(gq.field_Yb, ((qj) this).field_i, var9_long + -fl.field_l, true, 1000);
                          fl.field_l = var9_long;
                          ((qj) this).field_i = var8_ref_j.field_qb;
                          this.a(((qj) this).field_w.field_b.field_b, var8_ref_j.field_ob, (byte) -125, var8_ref_j.field_qb);
                          if (((qj) this).field_i != 1) {
                            break L54;
                          } else {
                            if (0 == ((qj) this).field_w.field_b.field_b.field_h) {
                              var11 = var8_ref_j;
                              var8_ref_j.field_Q = 0;
                              var11.field_m = 0;
                              var8_ref_j.field_u = 0;
                              var12 = var8_ref_j;
                              var12.field_N = 0;
                              var13 = (vn) (Object) var8_ref_j.field_gb.d(-66);
                              L55: while (true) {
                                if (null == var13) {
                                  break L54;
                                } else {
                                  var13.field_I = 0;
                                  var13 = (vn) (Object) var8_ref_j.field_gb.a((byte) 116);
                                  if (var14 != 0) {
                                    break L53;
                                  } else {
                                    if (var14 == 0) {
                                      continue L55;
                                    } else {
                                      break L54;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L54;
                            }
                          }
                        }
                        if (((qj) this).field_i > 1) {
                          break L53;
                        } else {
                          if (((qj) this).field_w.field_b.field_b.field_h != 1) {
                            break L52;
                          } else {
                            break L53;
                          }
                        }
                      }
                      if (lc.a(0, -119)) {
                        if (!(oa.field_Sb instanceof dp)) {
                          break L52;
                        } else {
                          this.a(false, 239, 16);
                          break L52;
                        }
                      } else {
                        break L52;
                      }
                    }
                    if (~((qj) this).field_i <= ~((qj) this).field_w.field_b.a(95)) {
                      break L51;
                    } else {
                      w.field_r = lg.a(2, ((qj) this).field_w.field_b.a(((qj) this).field_i, (byte) -122), -1);
                      break L51;
                    }
                  } else {
                    break L51;
                  }
                }
                L56: {
                  if (var8_ref_j.field_tb) {
                    var9_int = (33423360 - 2 * (var8_ref_j.field_yb.field_j - -(var8_ref_j.field_yb.field_u / 2) << 191197160)) / 510;
                    nk.field_c.g();
                    oa.field_Sb.a(true, var9_int, 0, 0, 0);
                    kc.field_q.a((byte) 78);
                    ih.field_k = oa.field_Sb.c((byte) -116);
                    fq.field_c = oa.field_Sb.b(-102);
                    oa.field_Sb = rd.a(var8_ref_j.field_ab.field_p, (byte) 19);
                    km.field_i = 32;
                    var8_ref_j.field_tb = false;
                    pe.field_n = var8_ref_j.field_ab.field_p;
                    break L56;
                  } else {
                    break L56;
                  }
                }
                L57: {
                  L58: {
                    if (var8_ref_j.field_qb > 0) {
                      break L58;
                    } else {
                      if (((qj) this).field_w.field_b.field_b.field_h != 0) {
                        break L58;
                      } else {
                        break L57;
                      }
                    }
                  }
                  L59: {
                    if (dp.field_r[0] <= var8_ref_j.field_m) {
                      this.b(0, -64, 255);
                      break L59;
                    } else {
                      break L59;
                    }
                  }
                  L60: {
                    if (~var8_ref_j.field_m > ~dp.field_r[1]) {
                      break L60;
                    } else {
                      this.b(1, 119, 254);
                      break L60;
                    }
                  }
                  L61: {
                    if (~var8_ref_j.field_m > ~dp.field_r[2]) {
                      break L61;
                    } else {
                      this.b(2, -42, 253);
                      break L61;
                    }
                  }
                  L62: {
                    if (dp.field_r[39] <= var8_ref_j.field_m) {
                      this.b(39, 109, 216);
                      break L62;
                    } else {
                      break L62;
                    }
                  }
                  L63: {
                    if (var8_ref_j.field_qb + -((qj) this).field_t < dp.field_r[3]) {
                      break L63;
                    } else {
                      this.a(false, 252, 3);
                      break L63;
                    }
                  }
                  L64: {
                    if (var8_ref_j.field_qb - ((qj) this).field_t < dp.field_r[4]) {
                      break L64;
                    } else {
                      this.a(false, 251, 4);
                      break L64;
                    }
                  }
                  L65: {
                    if (~var8_ref_j.field_qb <= ~(dp.field_r[5] - 1)) {
                      this.a(250, 67, 5);
                      break L65;
                    } else {
                      break L65;
                    }
                  }
                  L66: {
                    if (-1 + dp.field_r[6] > var8_ref_j.field_qb) {
                      break L66;
                    } else {
                      if (var8_ref_j.field_Z != 5) {
                        break L66;
                      } else {
                        this.a(249, 67, 6);
                        break L66;
                      }
                    }
                  }
                  L67: {
                    if (dp.field_r[7] <= var8_ref_j.field_ob) {
                      this.a((byte) 68, 7, 248);
                      break L67;
                    } else {
                      break L67;
                    }
                  }
                  L68: {
                    if (dp.field_r[8] <= var8_ref_j.field_ob) {
                      this.a((byte) 97, 8, 247);
                      break L68;
                    } else {
                      break L68;
                    }
                  }
                  L69: {
                    if (~var8_ref_j.field_ob <= ~dp.field_r[40]) {
                      this.a((byte) 39, 40, 215);
                      break L69;
                    } else {
                      break L69;
                    }
                  }
                  var9_ref = (vn) (Object) var8_ref_j.field_gb.d(-119);
                  L70: while (true) {
                    L71: {
                      L72: {
                        if (var9_ref == null) {
                          break L72;
                        } else {
                          stackOut_200_0 = ~dp.field_r[9];
                          stackOut_200_1 = ~var9_ref.field_I;
                          stackIn_210_0 = stackOut_200_0;
                          stackIn_210_1 = stackOut_200_1;
                          stackIn_201_0 = stackOut_200_0;
                          stackIn_201_1 = stackOut_200_1;
                          if (var14 != 0) {
                            break L71;
                          } else {
                            L73: {
                              if (stackIn_201_0 >= stackIn_201_1) {
                                this.b(9, 106, 246);
                                break L73;
                              } else {
                                break L73;
                              }
                            }
                            L74: {
                              if (var9_ref.field_I < dp.field_r[10]) {
                                break L74;
                              } else {
                                this.b(10, -52, 245);
                                if (var14 == 0) {
                                  break L72;
                                } else {
                                  break L74;
                                }
                              }
                            }
                            var9_ref = (vn) (Object) var8_ref_j.field_gb.a((byte) 116);
                            if (var14 == 0) {
                              continue L70;
                            } else {
                              break L72;
                            }
                          }
                        }
                      }
                      stackOut_209_0 = dp.field_r[22];
                      stackOut_209_1 = var8_ref_j.field_l;
                      stackIn_210_0 = stackOut_209_0;
                      stackIn_210_1 = stackOut_209_1;
                      break L71;
                    }
                    L75: {
                      if (stackIn_210_0 > stackIn_210_1) {
                        break L75;
                      } else {
                        this.b(22, -65, 233);
                        break L75;
                      }
                    }
                    L76: {
                      if (~var8_ref_j.field_hb > ~dp.field_r[29]) {
                        break L76;
                      } else {
                        this.b(29, 114, 226);
                        break L76;
                      }
                    }
                    L77: {
                      if (dp.field_r[30] > var8_ref_j.field_u) {
                        break L77;
                      } else {
                        this.b(30, -118, 225);
                        break L77;
                      }
                    }
                    L78: {
                      if (dp.field_r[31] > var8_ref_j.field_u) {
                        break L78;
                      } else {
                        this.b(31, -33, 224);
                        break L78;
                      }
                    }
                    L79: {
                      if (var8_ref_j.field_N < dp.field_r[32]) {
                        break L79;
                      } else {
                        this.b(32, -94, 223);
                        break L79;
                      }
                    }
                    L80: {
                      if (var8_ref_j.field_N < dp.field_r[33]) {
                        break L80;
                      } else {
                        this.b(33, 112, 222);
                        break L80;
                      }
                    }
                    L81: {
                      if (var8_ref_j.field_t >= dp.field_r[19]) {
                        this.b(19, 85, 236);
                        break L81;
                      } else {
                        break L81;
                      }
                    }
                    L82: {
                      if (~var8_ref_j.field_t > ~dp.field_r[20]) {
                        break L82;
                      } else {
                        this.b(20, -128, 235);
                        break L82;
                      }
                    }
                    if (~var8_ref_j.field_t <= ~dp.field_r[21]) {
                      this.b(21, 109, 234);
                      break L57;
                    } else {
                      break L57;
                    }
                  }
                }
                L83: {
                  if (dj.field_b != var8_ref_j.field_ob) {
                    dj.field_b = var8_ref_j.field_ob;
                    vd.field_d = Integer.toString(dj.field_b);
                    break L83;
                  } else {
                    break L83;
                  }
                }
                if (pg.field_m != 1 + pp.a(var8_ref_j, (byte) 59, ((qj) this).field_w)) {
                  L84: {
                    pg.field_m = pp.a(var8_ref_j, (byte) -100, ((qj) this).field_w) + 1;
                    if (pg.field_m < 10) {
                      stackOut_237_0 = "0" + pg.field_m;
                      stackIn_238_0 = stackOut_237_0;
                      break L84;
                    } else {
                      stackOut_236_0 = Integer.toString(pg.field_m);
                      stackIn_238_0 = stackOut_236_0;
                      break L84;
                    }
                  }
                  lq.field_e = stackIn_238_0;
                  break L50;
                } else {
                  break L50;
                }
              }
            }
            L85: {
              L86: {
                if (!((qj) this).field_p) {
                  break L86;
                } else {
                  if (((qj) this).field_o != 0) {
                    var8 = 0;
                    L87: while (true) {
                      if (~var8 <= ~((qj) this).field_w.field_k) {
                        break L86;
                      } else {
                        if (var14 != 0) {
                          break L85;
                        } else {
                          L88: {
                            if ((((qj) this).field_o & 1 << var8) == 0) {
                              break L88;
                            } else {
                              if (((((qj) this).field_w.field_i | (((qj) this).field_w.field_a | ((qj) this).field_w.field_g)) & 1 << var8) != 0) {
                                break L88;
                              } else {
                                var9 = ((qj) this).field_w.field_l[var8];
                                if (var5 == 0) {
                                  break L88;
                                } else {
                                  if (0 != var9.field_F % 5) {
                                    break L88;
                                  } else {
                                    L89: {
                                      stackOut_253_0 = this;
                                      stackOut_253_1 = 120;
                                      stackOut_253_2 = var8;
                                      stackIn_256_0 = stackOut_253_0;
                                      stackIn_256_1 = stackOut_253_1;
                                      stackIn_256_2 = stackOut_253_2;
                                      stackIn_254_0 = stackOut_253_0;
                                      stackIn_254_1 = stackOut_253_1;
                                      stackIn_254_2 = stackOut_253_2;
                                      if (var9.field_F % 5 != 0) {
                                        stackOut_256_0 = this;
                                        stackOut_256_1 = stackIn_256_1;
                                        stackOut_256_2 = stackIn_256_2;
                                        stackOut_256_3 = 0;
                                        stackIn_257_0 = stackOut_256_0;
                                        stackIn_257_1 = stackOut_256_1;
                                        stackIn_257_2 = stackOut_256_2;
                                        stackIn_257_3 = stackOut_256_3;
                                        break L89;
                                      } else {
                                        stackOut_254_0 = this;
                                        stackOut_254_1 = stackIn_254_1;
                                        stackOut_254_2 = stackIn_254_2;
                                        stackIn_255_0 = stackOut_254_0;
                                        stackIn_255_1 = stackOut_254_1;
                                        stackIn_255_2 = stackOut_254_2;
                                        stackOut_255_0 = this;
                                        stackOut_255_1 = stackIn_255_1;
                                        stackOut_255_2 = stackIn_255_2;
                                        stackOut_255_3 = 1;
                                        stackIn_257_0 = stackOut_255_0;
                                        stackIn_257_1 = stackOut_255_1;
                                        stackIn_257_2 = stackOut_255_2;
                                        stackIn_257_3 = stackOut_255_3;
                                        break L89;
                                      }
                                    }
                                    this.a((byte) stackIn_257_1, stackIn_257_2, stackIn_257_3 != 0);
                                    break L88;
                                  }
                                }
                              }
                            }
                          }
                          var8++;
                          if (var14 == 0) {
                            continue L87;
                          } else {
                            break L86;
                          }
                        }
                      }
                    }
                  } else {
                    break L86;
                  }
                }
              }
              break L85;
            }
            return;
          }
        } else {
          return;
        }
    }

    final boolean c(int param0) {
        RuntimeException var2 = null;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 >= 93) {
                break L1;
              } else {
                ((qj) this).a(false, (byte) -87);
                break L1;
              }
            }
            L2: {
              if (((qj) this).field_k != -2) {
                stackOut_6_0 = 0;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_7_0 = stackOut_4_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "qj.D(" + param0 + ')');
        }
        return stackIn_7_0 != 0;
    }

    private final void e(int param0) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                ((qj) this).field_q = true;
                break L1;
              }
            }
            if (!((qj) this).field_s) {
              L2: {
                if (null != fj.field_Ub) {
                  break L2;
                } else {
                  if (0 < ((qj) this).field_w.field_l[0].field_ob) {
                    fj.field_Ub = new sp(((qj) this).field_w.field_b.field_b.field_d, 65535 ^ ((qj) this).field_w.field_b.field_b.field_d, fp.field_z, ep.field_i, od.field_c, og.field_Wb, new int[2]);
                    if (og.h(-26090)) {
                      break L2;
                    } else {
                      bd.a(3, (byte) 25, fj.field_Ub);
                      break L2;
                    }
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
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "qj.R(" + param0 + ')');
        }
    }

    final void a(byte param0, boolean param1) {
        RuntimeException var3 = null;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        try {
          L0: {
            L1: {
              if (!((qj) this).field_p) {
                L2: {
                  if (1 == ((qj) this).field_w.field_k) {
                    if (((qj) this).field_s) {
                      break L2;
                    } else {
                      L3: {
                        this.a(pp.a(((qj) this).field_w.field_l[0], (byte) 115, ((qj) this).field_w), false);
                        this.e(0);
                        this.a(gq.field_Yb, ((qj) this).field_r, -fl.field_l + ue.a(false), false, 1000);
                        jj.field_d = jj.field_d | ja.a(((qj) this).field_t, ((qj) this).field_w.field_b, -1 + ((qj) this).field_r, true);
                        if (hh.field_b[0] != 0) {
                          stackOut_12_0 = 0;
                          stackIn_13_0 = stackOut_12_0;
                          break L3;
                        } else {
                          stackOut_10_0 = 1;
                          stackIn_13_0 = stackOut_10_0;
                          break L3;
                        }
                      }
                      be.field_a = stackIn_13_0 != 0;
                      break L2;
                    }
                  } else {
                    break L2;
                  }
                }
                L4: {
                  L5: {
                    if (((qj) this).field_w.field_k != 1) {
                      break L5;
                    } else {
                      if (((qj) this).field_w.field_l[0].field_Z == 8) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  ((qj) this).a(param1, (byte) 69);
                  if (!BrickABrac.field_J) {
                    break L1;
                  } else {
                    break L4;
                  }
                }
                ng.a(param1, 107, 18);
                ji.a(25459, true, cd.field_g, 1, 1, true);
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 == 40) {
              pe.field_n = si.field_k.field_m;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var3, "qj.J(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(boolean param0, byte param1) {
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                rj.a((byte) 80, to.field_k);
                rj.a((byte) 80, me.field_d);
                if (((qj) this).field_w.field_k > 1) {
                  break L2;
                } else {
                  if (9 == ((qj) this).field_w.field_l[0].field_Z) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ji.a(25459, true, cd.field_g, 1, 1, true);
              break L1;
            }
            if (!((qj) this).field_p) {
              if (param1 == 69) {
                L3: {
                  L4: {
                    if (og.h(-26090)) {
                      break L4;
                    } else {
                      L5: {
                        if (!ib.a(pl.field_b, -1)) {
                          break L5;
                        } else {
                          ng.a(param0, 60, 9);
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (fj.field_Ub != null) {
                          break L6;
                        } else {
                          ng.a(param0, 100, 0);
                          if (var4 == 0) {
                            break L3;
                          } else {
                            break L6;
                          }
                        }
                      }
                      ng.a(param0, 68, 5);
                      if (var4 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L7: {
                    if (ib.a(pl.field_b, -1)) {
                      break L7;
                    } else {
                      if (fj.field_Ub != null) {
                        break L7;
                      } else {
                        ng.a(param0, 121, 0);
                        if (var4 == 0) {
                          break L3;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  ng.a(param0, 68, 10);
                  break L3;
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
          var3 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var3, "qj.F(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(byte param0, pi param1, boolean param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        p var5 = null;
        int var6_int = 0;
        j var6 = null;
        int var7 = 0;
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
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var4_int = param1.l(255);
            if (((qj) this).field_w.field_k > var4_int) {
              var5 = new p();
              var5.field_k = param1.i(65280);
              param1.n(-79);
              var6_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var6_int >= 5) {
                      break L3;
                    } else {
                      var5.field_n[var6_int] = param1.c(3, (byte) 117);
                      var6_int++;
                      if (var7 != 0) {
                        break L2;
                      } else {
                        if (var7 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    if (param0 == -15) {
                      break L4;
                    } else {
                      this.b(-25, 35, 50);
                      break L4;
                    }
                  }
                  param1.f((byte) 100);
                  break L2;
                }
                L5: {
                  if (!param2) {
                    break L5;
                  } else {
                    var5.field_m = param1.e(255);
                    var5.field_l = true;
                    break L5;
                  }
                }
                var6 = ((qj) this).field_w.field_l[var4_int];
                var6.field_E = var6.field_E + 5;
                var6.field_q = var6.field_q + 5;
                var6.field_eb.a((nm) (Object) var5, (byte) 3);
                break L0;
              }
            } else {
              rk.a("K1: (" + var4_int + "/" + param1.field_l + ") " + eq.c((byte) -110), (Throwable) null, param0 + 125);
              hn.a((byte) 89);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4;
            stackOut_19_1 = new StringBuilder().append("qj.B(").append(param0).append(',');
            stackIn_22_0 = stackOut_19_0;
            stackIn_22_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L6;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_23_0 = stackOut_20_0;
              stackIn_23_1 = stackOut_20_1;
              stackIn_23_2 = stackOut_20_2;
              break L6;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + param2 + ')');
        }
    }

    final void a(int param0, pi param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
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
            L1: {
              var3_int = param1.l(param0 ^ 18615);
              ((qj) this).field_w.field_l[var3_int].field_V = param1.j(48);
              ((qj) this).field_w.field_i = ((qj) this).field_w.field_i | 1 << var3_int;
              if (param0 == 18504) {
                break L1;
              } else {
                field_u = null;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("qj.CA(").append(param0).append(',');
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
    }

    private final void a(byte param0, int param1, boolean param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        j var5 = null;
        int var6 = 0;
        int var7 = 0;
        pi stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        pi stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        pi stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        RuntimeException decompiledCaughtException = null;
        pi stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        pi stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        pi stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = 17 % ((29 - param0) / 57);
              stackOut_1_0 = k.field_h;
              stackOut_1_1 = -13413;
              stackIn_4_0 = stackOut_1_0;
              stackIn_4_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (param2) {
                stackOut_4_0 = (pi) (Object) stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = 69;
                stackIn_5_0 = stackOut_4_0;
                stackIn_5_1 = stackOut_4_1;
                stackIn_5_2 = stackOut_4_2;
                break L1;
              } else {
                stackOut_2_0 = (pi) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = 68;
                stackIn_5_0 = stackOut_2_0;
                stackIn_5_1 = stackOut_2_1;
                stackIn_5_2 = stackOut_2_2;
                break L1;
              }
            }
            ((pi) (Object) stackIn_5_0).e(stackIn_5_1, stackIn_5_2);
            k.field_h.p(62);
            var5 = ((qj) this).field_w.field_l[param1];
            var6 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (var6 >= 5) {
                    break L4;
                  } else {
                    k.field_h.a(3, -17566, var5.field_vb[var6]);
                    var6++;
                    if (var7 != 0) {
                      break L3;
                    } else {
                      if (var7 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                k.field_h.q(-105);
                break L3;
              }
              L5: {
                if (param2) {
                  k.field_h.a(var5.a(true, (StringBuilder) null) ^ var5.e(122), (byte) -79);
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
          runtimeException = decompiledCaughtException;
          throw qb.a((Throwable) (Object) runtimeException, "qj.EA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean a(char param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        j var4_ref = null;
        int var5 = 0;
        vn var5_ref_vn = null;
        int var6 = 0;
        int stackIn_25_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_108_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_132_0 = 0;
        int stackIn_137_0 = 0;
        int stackIn_140_0 = 0;
        int stackIn_145_0 = 0;
        int stackIn_150_0 = 0;
        int stackIn_155_0 = 0;
        int stackIn_168_0 = 0;
        int stackIn_180_0 = 0;
        int stackIn_191_0 = 0;
        int stackIn_198_0 = 0;
        int stackIn_206_0 = 0;
        int stackIn_211_0 = 0;
        int stackIn_223_0 = 0;
        int stackIn_226_0 = 0;
        int stackIn_229_0 = 0;
        int stackIn_234_0 = 0;
        int stackIn_237_0 = 0;
        int stackIn_240_0 = 0;
        int stackIn_243_0 = 0;
        int stackIn_246_0 = 0;
        int stackIn_251_0 = 0;
        int stackIn_254_0 = 0;
        int stackIn_259_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_122_0 = 0;
        int stackOut_131_0 = 0;
        int stackOut_136_0 = 0;
        int stackOut_144_0 = 0;
        int stackOut_149_0 = 0;
        int stackOut_154_0 = 0;
        int stackOut_179_0 = 0;
        int stackOut_197_0 = 0;
        int stackOut_205_0 = 0;
        int stackOut_210_0 = 0;
        int stackOut_222_0 = 0;
        int stackOut_233_0 = 0;
        int stackOut_250_0 = 0;
        int stackOut_253_0 = 0;
        int stackOut_245_0 = 0;
        int stackOut_242_0 = 0;
        int stackOut_239_0 = 0;
        int stackOut_236_0 = 0;
        int stackOut_228_0 = 0;
        int stackOut_225_0 = 0;
        int stackOut_190_0 = 0;
        int stackOut_167_0 = 0;
        int stackOut_139_0 = 0;
        int stackOut_258_0 = 0;
        int stackOut_256_0 = 0;
        int stackOut_80_0 = 0;
        int stackOut_107_0 = 0;
        int stackOut_24_0 = 0;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = oo.field_w.a(-37880252, 10);
              var5 = oo.field_w.a(-37880252, 5);
              if (var4_int != 0) {
                break L1;
              } else {
                fp.field_z = fp.field_z + og.field_Wb;
                od.field_c = od.field_c + 1;
                break L1;
              }
            }
            L2: {
              if (var4_int == 1) {
                fp.field_z = fp.field_z - og.field_Wb * 2;
                od.field_c = od.field_c - 2;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (var4_int == 2) {
                og.field_Wb = og.field_Wb + 2;
                fp.field_z = fp.field_z + od.field_c * 2;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (var4_int != 3) {
                break L4;
              } else {
                og.field_Wb = og.field_Wb - 1;
                fp.field_z = fp.field_z - od.field_c;
                break L4;
              }
            }
            L5: {
              if (4 == var4_int) {
                od.field_c = od.field_c + 1;
                ep.field_i = ep.field_i + og.field_Wb;
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (var4_int == 5) {
                od.field_c = od.field_c - 2;
                ep.field_i = ep.field_i - 2 * og.field_Wb;
                break L6;
              } else {
                break L6;
              }
            }
            if (param1 > 98) {
              L7: {
                if (6 != var4_int) {
                  break L7;
                } else {
                  ep.field_i = ep.field_i + og.field_Wb;
                  od.field_c = od.field_c + 1;
                  break L7;
                }
              }
              L8: {
                if (var4_int == 7) {
                  og.field_Wb = og.field_Wb - 2;
                  ep.field_i = ep.field_i - od.field_c * 2;
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (8 == var4_int) {
                  fp.field_z = fp.field_z + var5;
                  fp.field_z = fp.field_z - var5;
                  break L9;
                } else {
                  break L9;
                }
              }
              L10: {
                if (var4_int == 9) {
                  ep.field_i = ep.field_i + var5;
                  fp.field_z = fp.field_z - var5;
                  break L10;
                } else {
                  break L10;
                }
              }
              L11: {
                var4_int = oo.field_w.a(-37880252, 5);
                if (var4_int == 0) {
                  hg.field_e = hg.field_e ^ tm.field_g + qm.field_a << 1285268400;
                  break L11;
                } else {
                  break L11;
                }
              }
              L12: {
                if (var4_int != 1) {
                  break L12;
                } else {
                  ek.field_kb = ek.field_kb - tm.field_g;
                  qm.field_a = qm.field_a - 1;
                  break L12;
                }
              }
              L13: {
                if (var4_int != 2) {
                  break L13;
                } else {
                  qm.field_a = qm.field_a + 1;
                  ek.field_kb = ek.field_kb + tm.field_g;
                  break L13;
                }
              }
              L14: {
                if (var4_int != 3) {
                  break L14;
                } else {
                  tm.field_g = tm.field_g - 1;
                  ek.field_kb = ek.field_kb - qm.field_a;
                  break L14;
                }
              }
              L15: {
                if (var4_int != 4) {
                  break L15;
                } else {
                  tm.field_g = tm.field_g + 1;
                  ek.field_kb = ek.field_kb + qm.field_a;
                  break L15;
                }
              }
              if (param2 != 13) {
                L16: {
                  if (((qj) this).field_w.field_k != 1) {
                    break L16;
                  } else {
                    if (!r.field_A) {
                      break L16;
                    } else {
                      if (ka.a((byte) 113)) {
                        L17: {
                          if (84 == param2) {
                            im.b(-8);
                            break L17;
                          } else {
                            break L17;
                          }
                        }
                        stackOut_122_0 = 1;
                        stackIn_123_0 = stackOut_122_0;
                        return stackIn_123_0 != 0;
                      } else {
                        break L16;
                      }
                    }
                  }
                }
                L18: {
                  if (1 != ((qj) this).field_w.field_k) {
                    break L18;
                  } else {
                    if (!((qj) this).field_y) {
                      break L18;
                    } else {
                      var4_ref = ((qj) this).field_w.field_l[0];
                      if (48 == param2) {
                        ((qj) this).field_s = true;
                        var4_ref.field_m = dp.field_r[0] + -5;
                        stackOut_131_0 = 1;
                        stackIn_132_0 = stackOut_131_0;
                        return stackIn_132_0 != 0;
                      } else {
                        if (param2 == 68) {
                          var4_ref.field_m = dp.field_r[1] - 5;
                          ((qj) this).field_s = true;
                          stackOut_136_0 = 1;
                          stackIn_137_0 = stackOut_136_0;
                          return stackIn_137_0 != 0;
                        } else {
                          if (66 != param2) {
                            if (param2 == 50) {
                              ((qj) this).field_t = -dp.field_r[3] + (var4_ref.field_qb + 1);
                              ((qj) this).field_s = true;
                              stackOut_144_0 = 1;
                              stackIn_145_0 = stackOut_144_0;
                              return stackIn_145_0 != 0;
                            } else {
                              if (param2 == 34) {
                                ((qj) this).field_s = true;
                                ((qj) this).field_t = var4_ref.field_qb + 1 + -dp.field_r[4];
                                stackOut_149_0 = 1;
                                stackIn_150_0 = stackOut_149_0;
                                return stackIn_150_0 != 0;
                              } else {
                                if (51 == param2) {
                                  var4_ref.field_ob = dp.field_r[7] + -20;
                                  ((qj) this).field_s = true;
                                  stackOut_154_0 = 1;
                                  stackIn_155_0 = stackOut_154_0;
                                  return stackIn_155_0 != 0;
                                } else {
                                  L19: {
                                    if (param2 != 52) {
                                      break L19;
                                    } else {
                                      ((qj) this).field_s = true;
                                      var4_ref.field_ob = -20 + dp.field_r[8];
                                      break L19;
                                    }
                                  }
                                  if (param2 != 53) {
                                    if (param2 == 39) {
                                      var5_ref_vn = (vn) (Object) var4_ref.field_gb.d(-114);
                                      L20: while (true) {
                                        L21: {
                                          L22: {
                                            if (var5_ref_vn == null) {
                                              break L22;
                                            } else {
                                              var5_ref_vn.field_I = dp.field_r[10] - 2;
                                              var5_ref_vn = (vn) (Object) var4_ref.field_gb.a((byte) 116);
                                              if (var6 != 0) {
                                                break L21;
                                              } else {
                                                if (var6 == 0) {
                                                  continue L20;
                                                } else {
                                                  break L22;
                                                }
                                              }
                                            }
                                          }
                                          ((qj) this).field_s = true;
                                          break L21;
                                        }
                                        stackOut_179_0 = 1;
                                        stackIn_180_0 = stackOut_179_0;
                                        return stackIn_180_0 != 0;
                                      }
                                    } else {
                                      if (param2 != 54) {
                                        if (param2 == 55) {
                                          var5 = 0;
                                          L23: while (true) {
                                            L24: {
                                              L25: {
                                                if (29 <= var5) {
                                                  break L25;
                                                } else {
                                                  stackOut_197_0 = to.field_f[var5];
                                                  stackIn_206_0 = stackOut_197_0;
                                                  stackIn_198_0 = stackOut_197_0;
                                                  if (var6 != 0) {
                                                    break L24;
                                                  } else {
                                                    L26: {
                                                      if (stackIn_198_0 > -1) {
                                                        var4_ref.field_o[var5] = (byte)(-1 + to.field_f[var5]);
                                                        break L26;
                                                      } else {
                                                        break L26;
                                                      }
                                                    }
                                                    var5++;
                                                    if (var6 == 0) {
                                                      continue L23;
                                                    } else {
                                                      break L25;
                                                    }
                                                  }
                                                }
                                              }
                                              ((qj) this).field_s = true;
                                              stackOut_205_0 = 1;
                                              stackIn_206_0 = stackOut_205_0;
                                              break L24;
                                            }
                                            return stackIn_206_0 != 0;
                                          }
                                        } else {
                                          if (param2 == 56) {
                                            var4_ref.field_rb = 5;
                                            ((qj) this).field_s = true;
                                            stackOut_210_0 = 1;
                                            stackIn_211_0 = stackOut_210_0;
                                            return stackIn_211_0 != 0;
                                          } else {
                                            L27: {
                                              if (param2 < 16) {
                                                break L27;
                                              } else {
                                                if (25 < param2) {
                                                  break L27;
                                                } else {
                                                  L28: {
                                                    var5 = -16 - (-param2 - 1);
                                                    ((qj) this).field_s = true;
                                                    if (!pe.field_l[81]) {
                                                      break L28;
                                                    } else {
                                                      var5 += 10;
                                                      break L28;
                                                    }
                                                  }
                                                  if (var5 <= 11) {
                                                    oa.field_Sb = rd.a(var5, (byte) 19);
                                                    stackOut_222_0 = 1;
                                                    stackIn_223_0 = stackOut_222_0;
                                                    return stackIn_223_0 != 0;
                                                  } else {
                                                    break L27;
                                                  }
                                                }
                                              }
                                            }
                                            if (70 != param2) {
                                              if (param2 != 69) {
                                                if (param2 == 40) {
                                                  var4_ref.field_u = -1 + dp.field_r[30];
                                                  ((qj) this).field_s = true;
                                                  stackOut_233_0 = 1;
                                                  stackIn_234_0 = stackOut_233_0;
                                                  return stackIn_234_0 != 0;
                                                } else {
                                                  if (41 != param2) {
                                                    if (param2 != 32) {
                                                      if (param2 != 35) {
                                                        if (49 != param2) {
                                                          if (param2 == 36) {
                                                            ((qj) this).field_s = true;
                                                            var4_ref.field_ob = dp.field_r[40] + -20;
                                                            stackOut_250_0 = 1;
                                                            stackIn_251_0 = stackOut_250_0;
                                                            return stackIn_251_0 != 0;
                                                          } else {
                                                            if (38 != param2) {
                                                              break L18;
                                                            } else {
                                                              var4_ref.field_Z = 0;
                                                              ((qj) this).field_s = true;
                                                              var4_ref.field_P = 0;
                                                              stackOut_253_0 = 1;
                                                              stackIn_254_0 = stackOut_253_0;
                                                              return stackIn_254_0 != 0;
                                                            }
                                                          }
                                                        } else {
                                                          ((qj) this).field_s = true;
                                                          var4_ref.field_m = dp.field_r[39] + -5;
                                                          stackOut_245_0 = 1;
                                                          stackIn_246_0 = stackOut_245_0;
                                                          return stackIn_246_0 != 0;
                                                        }
                                                      } else {
                                                        var4_ref.field_N = -1 + dp.field_r[33];
                                                        ((qj) this).field_s = true;
                                                        stackOut_242_0 = 1;
                                                        stackIn_243_0 = stackOut_242_0;
                                                        return stackIn_243_0 != 0;
                                                      }
                                                    } else {
                                                      var4_ref.field_N = dp.field_r[32] + -1;
                                                      ((qj) this).field_s = true;
                                                      stackOut_239_0 = 1;
                                                      stackIn_240_0 = stackOut_239_0;
                                                      return stackIn_240_0 != 0;
                                                    }
                                                  } else {
                                                    var4_ref.field_u = dp.field_r[31] - 1;
                                                    ((qj) this).field_s = true;
                                                    stackOut_236_0 = 1;
                                                    stackIn_237_0 = stackOut_236_0;
                                                    return stackIn_237_0 != 0;
                                                  }
                                                }
                                              } else {
                                                ((qj) this).field_s = true;
                                                var4_ref.field_hb = -1 + dp.field_r[29];
                                                stackOut_228_0 = 1;
                                                stackIn_229_0 = stackOut_228_0;
                                                return stackIn_229_0 != 0;
                                              }
                                            } else {
                                              var4_ref.field_l = 6;
                                              ((qj) this).field_s = true;
                                              stackOut_225_0 = 1;
                                              stackIn_226_0 = stackOut_225_0;
                                              return stackIn_226_0 != 0;
                                            }
                                          }
                                        }
                                      } else {
                                        L29: {
                                          L30: {
                                            int fieldTemp$1 = var4_ref.field_qb + 1;
                                            var4_ref.field_qb = var4_ref.field_qb + 1;
                                            if (tk.field_q > fieldTemp$1) {
                                              break L30;
                                            } else {
                                              var4_ref.field_Z = 5;
                                              if (var6 == 0) {
                                                break L29;
                                              } else {
                                                break L30;
                                              }
                                            }
                                          }
                                          var4_ref.field_Z = 0;
                                          break L29;
                                        }
                                        ((qj) this).field_s = true;
                                        var4_ref.field_P = 0;
                                        stackOut_190_0 = 1;
                                        stackIn_191_0 = stackOut_190_0;
                                        return stackIn_191_0 != 0;
                                      }
                                    }
                                  } else {
                                    var5_ref_vn = (vn) (Object) var4_ref.field_gb.d(-19);
                                    L31: while (true) {
                                      L32: {
                                        L33: {
                                          if (var5_ref_vn == null) {
                                            break L33;
                                          } else {
                                            var5_ref_vn.field_I = dp.field_r[9] + -2;
                                            var5_ref_vn = (vn) (Object) var4_ref.field_gb.a((byte) 116);
                                            if (var6 != 0) {
                                              break L32;
                                            } else {
                                              if (var6 == 0) {
                                                continue L31;
                                              } else {
                                                break L33;
                                              }
                                            }
                                          }
                                        }
                                        ((qj) this).field_s = true;
                                        break L32;
                                      }
                                      stackOut_167_0 = 1;
                                      stackIn_168_0 = stackOut_167_0;
                                      return stackIn_168_0 != 0;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            var4_ref.field_m = -5 + dp.field_r[2];
                            ((qj) this).field_s = true;
                            stackOut_139_0 = 1;
                            stackIn_140_0 = stackOut_139_0;
                            return stackIn_140_0 != 0;
                          }
                        }
                      }
                    }
                  }
                }
                L34: {
                  if (pf.field_p) {
                    stackOut_258_0 = 0;
                    stackIn_259_0 = stackOut_258_0;
                    break L34;
                  } else {
                    stackOut_256_0 = 1;
                    stackIn_259_0 = stackOut_256_0;
                    break L34;
                  }
                }
                break L0;
              } else {
                L35: {
                  L36: {
                    var4_int = 1;
                    if (((qj) this).field_p) {
                      break L36;
                    } else {
                      L37: {
                        if (((qj) this).field_w.field_k == 1) {
                          break L37;
                        } else {
                          if (((qj) this).field_w.field_k == 2) {
                            var4_int = 17;
                            if (var6 == 0) {
                              break L35;
                            } else {
                              break L37;
                            }
                          } else {
                            break L35;
                          }
                        }
                      }
                      L38: {
                        var5 = ((qj) this).field_w.field_l[0].field_Z;
                        if (5 == var5) {
                          break L38;
                        } else {
                          if (9 == var5) {
                            break L38;
                          } else {
                            if (var5 == 3) {
                              break L38;
                            } else {
                              if (var5 == 8) {
                                break L38;
                              } else {
                                if (var6 == 0) {
                                  break L35;
                                } else {
                                  break L36;
                                }
                              }
                            }
                          }
                        }
                      }
                      stackOut_80_0 = 1;
                      stackIn_81_0 = stackOut_80_0;
                      return stackIn_81_0 != 0;
                    }
                  }
                  L39: {
                    if (((qj) this).c(113)) {
                      break L39;
                    } else {
                      L40: {
                        if (((qj) this).field_w.field_c) {
                          break L40;
                        } else {
                          if (((((qj) this).field_w.field_a | (((qj) this).field_w.field_i | ((qj) this).field_w.field_g)) & 1 << ((qj) this).field_k) != 0) {
                            break L40;
                          } else {
                            var4_int = 2;
                            if (var6 == 0) {
                              break L35;
                            } else {
                              break L40;
                            }
                          }
                        }
                      }
                      var4_int = 3;
                      if (var6 == 0) {
                        break L35;
                      } else {
                        break L39;
                      }
                    }
                  }
                  var4_int = 4;
                  break L35;
                }
                L41: {
                  L42: {
                    if (((qj) this).field_w.field_k == 1) {
                      break L42;
                    } else {
                      if (!((qj) this).field_w.field_c) {
                        break L42;
                      } else {
                        if (200 >= be.field_j) {
                          break L41;
                        } else {
                          be.field_j = 299;
                          if (var6 == 0) {
                            break L41;
                          } else {
                            break L42;
                          }
                        }
                      }
                    }
                  }
                  ng.a(false, 64, var4_int);
                  break L41;
                }
                stackOut_107_0 = 1;
                stackIn_108_0 = stackOut_107_0;
                return stackIn_108_0 != 0;
              }
            } else {
              stackOut_24_0 = 0;
              stackIn_25_0 = stackOut_24_0;
              return stackIn_25_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var4, "qj.T(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_259_0 != 0;
    }

    private final void a(int param0, int param1, long param2, boolean param3, int param4) {
        RuntimeException runtimeException = null;
        int var7_int = 0;
        int stackIn_11_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        try {
          L0: {
            L1: {
              if (((qj) this).field_s) {
                break L1;
              } else {
                if (og.h(-26090)) {
                  break L1;
                } else {
                  L2: {
                    param1 = param1 + param0 * 1000;
                    if (!param3) {
                      stackOut_10_0 = 0;
                      stackIn_11_0 = stackOut_10_0;
                      break L2;
                    } else {
                      stackOut_8_0 = 1;
                      stackIn_11_0 = stackOut_8_0;
                      break L2;
                    }
                  }
                  var7_int = stackIn_11_0;
                  hq.a(param1, var7_int, param4 + -468, ((int)param2 - -500) / param4);
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qb.a((Throwable) (Object) runtimeException, "qj.U(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void b(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (((qj) this).field_p) {
              ((qj) this).field_w.field_i = ((qj) this).field_w.field_i | 1 << ((qj) this).field_k;
              var2_int = 116 % ((param0 - -55) / 62);
              k.field_h.e(-13413, 66);
              break L0;
            } else {
              throw new IllegalStateException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "qj.C(" + param0 + ')');
        }
    }

    private final void a(boolean param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a(param2, 1)) {
              return;
            } else {
              L1: {
                if (!param0) {
                  break L1;
                } else {
                  ((qj) this).field_q = true;
                  break L1;
                }
              }
              L2: {
                if (((qj) this).field_s) {
                  break L2;
                } else {
                  var4_int = ((qj) this).field_w.field_l[0].field_ob;
                  var5 = ((qj) this).field_w.field_l[0].field_qb;
                  fp.field_z = fp.field_z - (((qj) this).field_t + var4_int);
                  ep.field_i = ep.field_i + (-((qj) this).field_t + var5);
                  lp.field_wb.a((nm) (Object) new e(param2, param1, fp.field_z, ep.field_i, od.field_c, og.field_Wb), (byte) 3);
                  fp.field_z = fp.field_z - (-((qj) this).field_t + var5);
                  ep.field_i = ep.field_i + (((qj) this).field_t + var4_int);
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var4, "qj.N(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (param0 == 119) {
              var3_int = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var3_int >= ((qj) this).field_w.field_l.length) {
                      break L3;
                    } else {
                      ((qj) this).field_w.field_l[var3_int].field_qb = param1;
                      var3_int++;
                      if (var4 != 0) {
                        break L2;
                      } else {
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  if (((qj) this).field_w.field_k != 1) {
                    break L2;
                  } else {
                    ((qj) this).field_t = param1;
                    ((qj) this).field_i = param1;
                    var3_int = param1;
                    fp.field_z = fp.field_z + var3_int;
                    w.field_r = lg.a(2, ((qj) this).field_w.field_b.a(((qj) this).field_i, (byte) -122), -1);
                    break L2;
                  }
                }
                break L0;
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qb.a((Throwable) (Object) runtimeException, "qj.K(" + param0 + ',' + param1 + ')');
        }
    }

    final static void b(byte param0, boolean param1) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        String[] var3 = null;
        oi var4 = null;
        String[] stackIn_1_0 = null;
        String[] stackIn_1_1 = null;
        int stackIn_1_2 = 0;
        String[] stackIn_3_0 = null;
        String[] stackIn_3_1 = null;
        int stackIn_3_2 = 0;
        String[] stackIn_4_0 = null;
        String[] stackIn_4_1 = null;
        int stackIn_4_2 = 0;
        String stackIn_4_3 = null;
        RuntimeException decompiledCaughtException = null;
        String[] stackOut_0_0 = null;
        String[] stackOut_0_1 = null;
        int stackOut_0_2 = 0;
        String[] stackOut_3_0 = null;
        String[] stackOut_3_1 = null;
        int stackOut_3_2 = 0;
        String stackOut_3_3 = null;
        String[] stackOut_1_0 = null;
        String[] stackOut_1_1 = null;
        int stackOut_1_2 = 0;
        String stackOut_1_3 = null;
        try {
          L0: {
            L1: {
              var2_int = 9 % ((param0 - -73) / 49);
              stackOut_0_0 = new String[2];
              stackOut_0_1 = new String[2];
              stackOut_0_2 = 0;
              stackIn_3_0 = stackOut_0_0;
              stackIn_3_1 = stackOut_0_1;
              stackIn_3_2 = stackOut_0_2;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              stackIn_1_2 = stackOut_0_2;
              if (tb.field_cb != null) {
                stackOut_3_0 = (String[]) (Object) stackIn_3_0;
                stackOut_3_1 = (String[]) (Object) stackIn_3_1;
                stackOut_3_2 = stackIn_3_2;
                stackOut_3_3 = tb.field_cb;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                stackIn_4_3 = stackOut_3_3;
                break L1;
              } else {
                stackOut_1_0 = (String[]) (Object) stackIn_1_0;
                stackOut_1_1 = (String[]) (Object) stackIn_1_1;
                stackOut_1_2 = stackIn_1_2;
                stackOut_1_3 = we.field_c;
                stackIn_4_0 = stackOut_1_0;
                stackIn_4_1 = stackOut_1_1;
                stackIn_4_2 = stackOut_1_2;
                stackIn_4_3 = stackOut_1_3;
                break L1;
              }
            }
            stackIn_4_1[stackIn_4_2] = stackIn_4_3;
            stackIn_4_0[1] = pg.field_q;
            var3 = stackIn_4_0;
            var4 = new oi(qh.field_b, kk.a(false, qh.field_b.field_i, hi.field_w), 3);
            r.field_A = false;
            oa.field_Sb = rd.a(0, (byte) 19);
            sk.a(var3, 0, var4, 2, param1, -12665);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qb.a((Throwable) (Object) runtimeException, "qj.V(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(pi param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_7_0 = false;
        boolean stackIn_9_0 = false;
        boolean stackIn_10_0 = false;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_4_0 = false;
        boolean stackOut_9_0 = false;
        int stackOut_9_1 = 0;
        boolean stackOut_5_0 = false;
        boolean stackOut_7_0 = false;
        int stackOut_7_1 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            var3_int = param1;
            L1: while (true) {
              L2: {
                L3: {
                  if (~((qj) this).field_w.field_k >= ~var3_int) {
                    break L3;
                  } else {
                    if (var4 != 0) {
                      break L2;
                    } else {
                      L4: {
                        byte dupTemp$5 = param0.b(true);
                        ((qj) this).field_w.field_m[var3_int] = dupTemp$5;
                        stackOut_4_0 = op.field_a;
                        stackIn_9_0 = stackOut_4_0;
                        stackIn_5_0 = stackOut_4_0;
                        if (0 > dupTemp$5) {
                          stackOut_9_0 = stackIn_9_0;
                          stackOut_9_1 = 0;
                          stackIn_10_0 = stackOut_9_0;
                          stackIn_10_1 = stackOut_9_1;
                          break L4;
                        } else {
                          stackOut_5_0 = stackIn_5_0;
                          stackIn_7_0 = stackOut_5_0;
                          stackOut_7_0 = stackIn_7_0;
                          stackOut_7_1 = 1;
                          stackIn_10_0 = stackOut_7_0;
                          stackIn_10_1 = stackOut_7_1;
                          break L4;
                        }
                      }
                      op.field_a = stackIn_10_0 | stackIn_10_1 != 0;
                      var3_int++;
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                ((qj) this).field_w.a(false);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("qj.Q(");
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
          throw qb.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param1 + ')');
        }
    }

    public static void d(int param0) {
        try {
            field_u = null;
            field_l = null;
            int var1_int = 47 / ((param0 - 14) / 59);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "qj.BA(" + param0 + ')');
        }
    }

    private final void a(int param0, boolean param1) {
        RuntimeException var3 = null;
        int var3_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!param1) {
                break L1;
              } else {
                ((qj) this).field_n = true;
                break L1;
              }
            }
            L2: {
              if (((qj) this).field_w.field_k == 1) {
                var3_int = param0;
                ep.field_i = ep.field_i - var3_int;
                break L2;
              } else {
                break L2;
              }
            }
            ((qj) this).field_r = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var3, "qj.I(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(int param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this.a(param0, 1)) {
              return;
            } else {
              L1: {
                if (((qj) this).field_s) {
                  break L1;
                } else {
                  var4_int = param0;
                  var5 = param2;
                  if (~(255 ^ var5) != ~var4_int) {
                    throw new IllegalArgumentException();
                  } else {
                    var6 = ed.field_f[var4_int];
                    if (0 > var6) {
                      throw new IllegalArgumentException();
                    } else {
                      ek.field_kb = ek.field_kb + hg.field_e;
                      var7 = 1 << var6;
                      hg.field_e = hg.field_e ^ var7;
                      ek.field_kb = ek.field_kb - hg.field_e;
                      lp.field_wb.a((nm) (Object) new e(param0, param2, hg.field_e, ek.field_kb, tm.field_g, qm.field_a), (byte) 3);
                      break L1;
                    }
                  }
                }
              }
              var4_int = 90 % ((param1 - 36) / 46);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qb.a((Throwable) (Object) runtimeException, "qj.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void a(byte param0, int param1, int param2) {
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            if (this.a(param1, 1)) {
              return;
            } else {
              if (param0 > 17) {
                L1: {
                  if (!((qj) this).field_s) {
                    L2: {
                      L3: {
                        if (param1 != 7) {
                          break L3;
                        } else {
                          fp.field_z = fp.field_z - ((qj) this).field_t;
                          if (var5 == 0) {
                            break L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      ep.field_i = ep.field_i - ((qj) this).field_t;
                      break L2;
                    }
                    L4: {
                      lp.field_wb.a((nm) (Object) new e(param1, param2, fp.field_z, ep.field_i, od.field_c, og.field_Wb), (byte) 3);
                      if (param1 == 7) {
                        break L4;
                      } else {
                        ep.field_i = ep.field_i + ((qj) this).field_t;
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L4;
                        }
                      }
                    }
                    fp.field_z = fp.field_z + ((qj) this).field_t;
                    break L1;
                  } else {
                    break L1;
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
          var4 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var4, "qj.HA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final boolean a(vl param0, boolean param1, vl param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        vl var5 = null;
        int var6_int = 0;
        j var6 = null;
        j var7_ref_j = null;
        int var7 = 0;
        int var8_int = 0;
        j var8 = null;
        ge var9_ref_ge = null;
        int var9 = 0;
        p var10_ref_p = null;
        int var10 = 0;
        Object var11 = null;
        int var12 = 0;
        int var13 = 0;
        vl stackIn_5_0 = null;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        boolean stackIn_27_0 = false;
        int stackIn_77_0 = 0;
        int stackIn_77_1 = 0;
        int stackIn_81_0 = 0;
        int stackIn_81_1 = 0;
        j stackIn_83_0 = null;
        int stackIn_90_0 = 0;
        int stackIn_90_1 = 0;
        int stackIn_122_0 = 0;
        int stackIn_122_1 = 0;
        int stackIn_132_0 = 0;
        int stackIn_132_1 = 0;
        int stackIn_137_0 = 0;
        int stackIn_137_1 = 0;
        int stackIn_153_0 = 0;
        int stackIn_153_1 = 0;
        j stackIn_170_0 = null;
        int stackIn_181_0 = 0;
        RuntimeException stackIn_183_0 = null;
        StringBuilder stackIn_183_1 = null;
        RuntimeException stackIn_185_0 = null;
        StringBuilder stackIn_185_1 = null;
        RuntimeException stackIn_186_0 = null;
        StringBuilder stackIn_186_1 = null;
        String stackIn_186_2 = null;
        RuntimeException stackIn_187_0 = null;
        StringBuilder stackIn_187_1 = null;
        RuntimeException stackIn_189_0 = null;
        StringBuilder stackIn_189_1 = null;
        RuntimeException stackIn_190_0 = null;
        StringBuilder stackIn_190_1 = null;
        String stackIn_190_2 = null;
        RuntimeException decompiledCaughtException = null;
        vl stackOut_4_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        boolean stackOut_26_0 = false;
        boolean stackOut_76_0 = false;
        int stackOut_76_1 = 0;
        int stackOut_80_0 = 0;
        int stackOut_80_1 = 0;
        j stackOut_82_0 = null;
        int stackOut_89_0 = 0;
        int stackOut_89_1 = 0;
        int stackOut_121_0 = 0;
        int stackOut_121_1 = 0;
        int stackOut_131_0 = 0;
        int stackOut_131_1 = 0;
        int stackOut_136_0 = 0;
        int stackOut_136_1 = 0;
        int stackOut_152_0 = 0;
        int stackOut_152_1 = 0;
        j stackOut_168_0 = null;
        int stackOut_180_0 = 0;
        RuntimeException stackOut_182_0 = null;
        StringBuilder stackOut_182_1 = null;
        RuntimeException stackOut_185_0 = null;
        StringBuilder stackOut_185_1 = null;
        String stackOut_185_2 = null;
        RuntimeException stackOut_183_0 = null;
        StringBuilder stackOut_183_1 = null;
        String stackOut_183_2 = null;
        RuntimeException stackOut_186_0 = null;
        StringBuilder stackOut_186_1 = null;
        RuntimeException stackOut_189_0 = null;
        StringBuilder stackOut_189_1 = null;
        String stackOut_189_2 = null;
        RuntimeException stackOut_187_0 = null;
        StringBuilder stackOut_187_1 = null;
        String stackOut_187_2 = null;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = 0;
              if (!((qj) this).field_p) {
                stackOut_4_0 = new vl();
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_2_0 = null;
                stackIn_5_0 = (vl) (Object) stackOut_2_0;
                break L1;
              }
            }
            var5 = stackIn_5_0;
            var6_int = 0;
            L2: while (true) {
              stackOut_6_0 = ~var6_int;
              stackIn_7_0 = stackOut_6_0;
              L3: while (true) {
                L4: {
                  L5: {
                    if (stackIn_7_0 <= ~((qj) this).field_w.field_k) {
                      break L5;
                    } else {
                      var7_ref_j = ((qj) this).field_w.field_l[var6_int];
                      stackOut_8_0 = ~(1 << var6_int & (((qj) this).field_w.field_i | (((qj) this).field_w.field_g | ((qj) this).field_w.field_a)));
                      stackOut_8_1 = -1;
                      stackIn_77_0 = stackOut_8_0;
                      stackIn_77_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (var13 != 0) {
                        break L4;
                      } else {
                        L6: {
                          if (stackIn_9_0 == stackIn_9_1) {
                            break L6;
                          } else {
                            var7_ref_j.field_U = var7_ref_j.field_U + 1;
                            break L6;
                          }
                        }
                        L7: {
                          L8: {
                            L9: {
                              if ((1 << var6_int & ((qj) this).field_o) != 0) {
                                break L9;
                              } else {
                                if (var7_ref_j.field_q == 0) {
                                  break L7;
                                } else {
                                  L10: {
                                    var8_int = 1;
                                    if (var7_ref_j.field_q <= 25) {
                                      break L10;
                                    } else {
                                      var8_int = 3;
                                      break L10;
                                    }
                                  }
                                  L11: {
                                    if (50 < var7_ref_j.field_q) {
                                      var8_int = -25 + var7_ref_j.field_q;
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                  var9 = 0;
                                  var10_ref_p = (p) (Object) var7_ref_j.field_eb.d(-84);
                                  L12: while (true) {
                                    L13: {
                                      if (var9 >= var8_int) {
                                        break L13;
                                      } else {
                                        ((qj) this).field_w.a((byte) 120, var6_int);
                                        var7_ref_j.field_db = var10_ref_p.a((byte) -104);
                                        ((qj) this).field_w.a(var7_ref_j, param0, var5, 0);
                                        var7_ref_j.field_F = var7_ref_j.field_F + 1;
                                        stackOut_26_0 = var10_ref_p.c(1);
                                        stackIn_7_0 = stackOut_26_0 ? 1 : 0;
                                        stackIn_27_0 = stackOut_26_0;
                                        if (var13 != 0) {
                                          continue L3;
                                        } else {
                                          L14: {
                                            if (!stackIn_27_0) {
                                              break L14;
                                            } else {
                                              L15: {
                                                var10_ref_p.b((byte) 111);
                                                var7_ref_j.field_p = var10_ref_p.field_k;
                                                if (!var10_ref_p.field_l) {
                                                  break L15;
                                                } else {
                                                  var11 = null;
                                                  var12 = var7_ref_j.a(param1, (StringBuilder) var11) ^ var7_ref_j.e(120);
                                                  if (var10_ref_p.field_m == var12) {
                                                    break L15;
                                                  } else {
                                                    hn.a((byte) 91);
                                                    rk.a("T2 " + var10_ref_p.field_m + " " + var12 + " ", (Throwable) null, 54);
                                                    cf.field_a = cf.field_a + 1;
                                                    break L15;
                                                  }
                                                }
                                              }
                                              var10_ref_p = (p) (Object) var7_ref_j.field_eb.d(-21);
                                              break L14;
                                            }
                                          }
                                          var9++;
                                          var7_ref_j.field_q = var7_ref_j.field_q - 1;
                                          if (var13 == 0) {
                                            continue L12;
                                          } else {
                                            break L13;
                                          }
                                        }
                                      }
                                    }
                                    if (var13 == 0) {
                                      break L8;
                                    } else {
                                      break L9;
                                    }
                                  }
                                }
                              }
                            }
                            L16: {
                              if (!((qj) this).field_p) {
                                break L16;
                              } else {
                                L17: {
                                  var8_int = var7_ref_j.field_F - var7_ref_j.field_E;
                                  if (var8_int <= 30) {
                                    break L17;
                                  } else {
                                    if (0 == de.field_x % 10) {
                                      break L7;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                                L18: {
                                  if (40 >= var8_int) {
                                    break L18;
                                  } else {
                                    if (0 != de.field_x % 5) {
                                      break L18;
                                    } else {
                                      if (var13 == 0) {
                                        break L7;
                                      } else {
                                        break L18;
                                      }
                                    }
                                  }
                                }
                                if (50 != var8_int) {
                                  break L16;
                                } else {
                                  if (var13 == 0) {
                                    break L7;
                                  } else {
                                    break L16;
                                  }
                                }
                              }
                            }
                            L19: {
                              if (((((qj) this).field_w.field_a | (((qj) this).field_w.field_g | ((qj) this).field_w.field_i)) & 1 << var6_int) == 0) {
                                break L19;
                              } else {
                                if (var13 == 0) {
                                  break L7;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            L20: {
                              ((qj) this).field_w.a((byte) 127, var6_int);
                              ((qj) this).field_w.a(var7_ref_j, param2, var5, 0);
                              if (((qj) this).field_p) {
                                break L20;
                              } else {
                                ((qj) this).field_w.a(var6_int, 1, var5, (byte) -122);
                                var7_ref_j.field_p = var7_ref_j.field_Q;
                                break L20;
                              }
                            }
                            var4_int = var4_int | 1;
                            var7_ref_j.field_F = var7_ref_j.field_F + 1;
                            break L8;
                          }
                          L21: {
                            if (var5 == null) {
                              break L21;
                            } else {
                              var5.c((byte) -110);
                              break L21;
                            }
                          }
                          var7_ref_j.c(-101);
                          break L7;
                        }
                        var6_int++;
                        if (var13 == 0) {
                          continue L2;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  var6_int = 0;
                  stackOut_76_0 = param1;
                  stackOut_76_1 = 1;
                  stackIn_77_0 = stackOut_76_0 ? 1 : 0;
                  stackIn_77_1 = stackOut_76_1;
                  break L4;
                }
                L22: {
                  if (stackIn_77_0 == stackIn_77_1) {
                    break L22;
                  } else {
                    ((qj) this).field_k = 29;
                    break L22;
                  }
                }
                L23: while (true) {
                  stackOut_80_0 = ((qj) this).field_w.field_k;
                  stackOut_80_1 = var6_int;
                  stackIn_81_0 = stackOut_80_0;
                  stackIn_81_1 = stackOut_80_1;
                  L24: while (true) {
                    L25: {
                      L26: {
                        L27: {
                          if (stackIn_81_0 <= stackIn_81_1) {
                            break L27;
                          } else {
                            var7_ref_j = ((qj) this).field_w.field_l[var6_int];
                            var8_int = 0;
                            stackOut_82_0 = (j) var7_ref_j;
                            stackIn_170_0 = stackOut_82_0;
                            stackIn_83_0 = stackOut_82_0;
                            if (var13 != 0) {
                              break L26;
                            } else {
                              var9_ref_ge = (ge) (Object) ((vl) (Object) stackIn_83_0.field_pb).d(-48);
                              L28: while (true) {
                                L29: {
                                  if (null == var9_ref_ge) {
                                    break L29;
                                  } else {
                                    var8_int = var8_int | 1 << var9_ref_ge.field_i;
                                    var9_ref_ge = (ge) (Object) var7_ref_j.field_pb.a((byte) 116);
                                    if (var13 != 0) {
                                      continue L23;
                                    } else {
                                      if (var13 == 0) {
                                        continue L28;
                                      } else {
                                        break L29;
                                      }
                                    }
                                  }
                                }
                                var9 = 0;
                                L30: while (true) {
                                  L31: {
                                    if (var9 >= 29) {
                                      break L31;
                                    } else {
                                      stackOut_89_0 = to.field_f[var9];
                                      stackOut_89_1 = 1;
                                      stackIn_81_0 = stackOut_89_0;
                                      stackIn_81_1 = stackOut_89_1;
                                      stackIn_90_0 = stackOut_89_0;
                                      stackIn_90_1 = stackOut_89_1;
                                      if (var13 != 0) {
                                        continue L24;
                                      } else {
                                        L32: {
                                          L33: {
                                            if (stackIn_90_0 >= stackIn_90_1) {
                                              break L33;
                                            } else {
                                              if (var13 == 0) {
                                                break L32;
                                              } else {
                                                break L33;
                                              }
                                            }
                                          }
                                          L34: {
                                            var10 = (20 * var7_ref_j.field_o[var9] << -1472610392) / to.field_f[var9];
                                            if ((1 << var9 & var8_int) == 0) {
                                              break L34;
                                            } else {
                                              var10 = 5120;
                                              break L34;
                                            }
                                          }
                                          L35: {
                                            var7_ref_j.field_xb[var9] = var7_ref_j.field_xb[var9] + (-var7_ref_j.field_cb[var9] + var10) / 100;
                                            var7_ref_j.field_xb[var9] = 7 * var7_ref_j.field_xb[var9] / 8;
                                            if (512 >= var7_ref_j.field_xb[var9]) {
                                              break L35;
                                            } else {
                                              var7_ref_j.field_xb[var9] = 512;
                                              break L35;
                                            }
                                          }
                                          L36: {
                                            if (var7_ref_j.field_xb[var9] < -512) {
                                              var7_ref_j.field_xb[var9] = -512;
                                              break L36;
                                            } else {
                                              break L36;
                                            }
                                          }
                                          L37: {
                                            L38: {
                                              var7_ref_j.field_cb[var9] = var7_ref_j.field_cb[var9] + var7_ref_j.field_xb[var9];
                                              if (var7_ref_j.field_xb[var9] <= 0) {
                                                break L38;
                                              } else {
                                                if (var7_ref_j.field_cb[var9] > var10) {
                                                  break L37;
                                                } else {
                                                  break L38;
                                                }
                                              }
                                            }
                                            if (var7_ref_j.field_xb[var9] >= 0) {
                                              break L32;
                                            } else {
                                              if (~var10 < ~var7_ref_j.field_cb[var9]) {
                                                break L37;
                                              } else {
                                                break L32;
                                              }
                                            }
                                          }
                                          var7_ref_j.field_cb[var9] = var10;
                                          break L32;
                                        }
                                        var9++;
                                        if (var13 == 0) {
                                          continue L30;
                                        } else {
                                          break L31;
                                        }
                                      }
                                    }
                                  }
                                  var6_int++;
                                  if (var13 == 0) {
                                    continue L23;
                                  } else {
                                    break L27;
                                  }
                                }
                              }
                            }
                          }
                        }
                        L39: {
                          L40: {
                            if (((qj) this).field_w.field_k <= 1) {
                              break L40;
                            } else {
                              var6_int = 0;
                              L41: while (true) {
                                if (var6_int >= ((qj) this).field_w.field_k) {
                                  break L40;
                                } else {
                                  var7_ref_j = ((qj) this).field_w.field_l[var6_int];
                                  var8_int = var7_ref_j.field_p + var7_ref_j.field_ub << 2067259976;
                                  var7_ref_j.field_J = var7_ref_j.field_J + (var8_int + -var7_ref_j.field_G) / 100;
                                  var7_ref_j.field_J = 7 * var7_ref_j.field_J / 8;
                                  stackOut_121_0 = var7_ref_j.field_J;
                                  stackOut_121_1 = 1280;
                                  stackIn_132_0 = stackOut_121_0;
                                  stackIn_132_1 = stackOut_121_1;
                                  stackIn_122_0 = stackOut_121_0;
                                  stackIn_122_1 = stackOut_121_1;
                                  if (var13 != 0) {
                                    break L39;
                                  } else {
                                    L42: {
                                      if (stackIn_122_0 > stackIn_122_1) {
                                        var7_ref_j.field_J = 1280;
                                        break L42;
                                      } else {
                                        break L42;
                                      }
                                    }
                                    L43: {
                                      var7_ref_j.field_G = var7_ref_j.field_G + var7_ref_j.field_J;
                                      if (~var7_ref_j.field_G >= ~var8_int) {
                                        break L43;
                                      } else {
                                        var7_ref_j.field_G = var8_int;
                                        break L43;
                                      }
                                    }
                                    var6_int++;
                                    if (var13 == 0) {
                                      continue L41;
                                    } else {
                                      break L40;
                                    }
                                  }
                                }
                              }
                            }
                          }
                          stackOut_131_0 = -2;
                          stackOut_131_1 = ~((qj) this).field_w.field_k;
                          stackIn_132_0 = stackOut_131_0;
                          stackIn_132_1 = stackOut_131_1;
                          break L39;
                        }
                        L44: {
                          L45: {
                            if (stackIn_132_0 > stackIn_132_1) {
                              var6_int = ((qj) this).field_w.a(125);
                              var7 = 0;
                              L46: while (true) {
                                if (~((qj) this).field_w.field_k >= ~var7) {
                                  break L45;
                                } else {
                                  var8 = ((qj) this).field_w.field_l[var7];
                                  stackOut_136_0 = -1;
                                  stackOut_136_1 = ~(1 << var7 & var6_int);
                                  stackIn_153_0 = stackOut_136_0;
                                  stackIn_153_1 = stackOut_136_1;
                                  stackIn_137_0 = stackOut_136_0;
                                  stackIn_137_1 = stackOut_136_1;
                                  if (var13 != 0) {
                                    break L44;
                                  } else {
                                    L47: {
                                      L48: {
                                        if (stackIn_137_0 != stackIn_137_1) {
                                          break L48;
                                        } else {
                                          var8.field_M = -1;
                                          if (var13 == 0) {
                                            break L47;
                                          } else {
                                            break L48;
                                          }
                                        }
                                      }
                                      if (var8.field_M != -1) {
                                        break L47;
                                      } else {
                                        var8.field_M = 500;
                                        break L47;
                                      }
                                    }
                                    var7++;
                                    if (var13 == 0) {
                                      continue L46;
                                    } else {
                                      break L45;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L45;
                            }
                          }
                          if (!((qj) this).field_p) {
                            stackOut_152_0 = ~((qj) this).field_w.field_k;
                            stackOut_152_1 = -2;
                            stackIn_153_0 = stackOut_152_0;
                            stackIn_153_1 = stackOut_152_1;
                            break L44;
                          } else {
                            break L25;
                          }
                        }
                        L49: {
                          if (stackIn_153_0 == stackIn_153_1) {
                            break L49;
                          } else {
                            if (((qj) this).field_w.field_c) {
                              break L25;
                            } else {
                              ((qj) this).field_w.field_a = ((qj) this).field_w.field_a | ((qj) this).field_w.c(-17566);
                              ((qj) this).field_w.field_g = ((qj) this).field_w.field_g | ((qj) this).field_w.a((byte) -92);
                              if (!((qj) this).field_w.b(82)) {
                                break L25;
                              } else {
                                L50: {
                                  if (-1 != ((qj) this).field_w.field_h) {
                                    break L50;
                                  } else {
                                    ((qj) this).field_w.field_h = 0;
                                    break L50;
                                  }
                                }
                                L51: {
                                  var6_int = ((qj) this).field_w.field_h;
                                  var7 = 1 - ((qj) this).field_w.field_h;
                                  if ((((qj) this).field_w.field_a & 1 << var7) == 0) {
                                    break L51;
                                  } else {
                                    var6_int = var7;
                                    break L51;
                                  }
                                }
                                ((qj) this).field_w.field_l[var6_int].field_zb = 1;
                                ((qj) this).field_w.field_m[0] = var6_int;
                                ((qj) this).field_w.field_l[-var6_int + 1].field_zb = 2;
                                ((qj) this).field_w.field_m[1] = 1 - var6_int;
                                ((qj) this).field_w.a(false);
                                op.field_a = true;
                                if (var13 == 0) {
                                  break L25;
                                } else {
                                  break L49;
                                }
                              }
                            }
                          }
                        }
                        stackOut_168_0 = ((qj) this).field_w.field_l[0];
                        stackIn_170_0 = stackOut_168_0;
                        break L26;
                      }
                      L52: {
                        var6 = stackIn_170_0;
                        if (var6.field_Z == 8) {
                          break L52;
                        } else {
                          if (var6.field_Z != 9) {
                            break L25;
                          } else {
                            break L52;
                          }
                        }
                      }
                      ((qj) this).a((byte) 40, false);
                      if (8 != var6.field_Z) {
                        cc.field_G = true;
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                    stackOut_180_0 = var4_int;
                    stackIn_181_0 = stackOut_180_0;
                    break L0;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L53: {
            var4 = decompiledCaughtException;
            stackOut_182_0 = (RuntimeException) var4;
            stackOut_182_1 = new StringBuilder().append("qj.P(");
            stackIn_185_0 = stackOut_182_0;
            stackIn_185_1 = stackOut_182_1;
            stackIn_183_0 = stackOut_182_0;
            stackIn_183_1 = stackOut_182_1;
            if (param0 == null) {
              stackOut_185_0 = (RuntimeException) (Object) stackIn_185_0;
              stackOut_185_1 = (StringBuilder) (Object) stackIn_185_1;
              stackOut_185_2 = "null";
              stackIn_186_0 = stackOut_185_0;
              stackIn_186_1 = stackOut_185_1;
              stackIn_186_2 = stackOut_185_2;
              break L53;
            } else {
              stackOut_183_0 = (RuntimeException) (Object) stackIn_183_0;
              stackOut_183_1 = (StringBuilder) (Object) stackIn_183_1;
              stackOut_183_2 = "{...}";
              stackIn_186_0 = stackOut_183_0;
              stackIn_186_1 = stackOut_183_1;
              stackIn_186_2 = stackOut_183_2;
              break L53;
            }
          }
          L54: {
            stackOut_186_0 = (RuntimeException) (Object) stackIn_186_0;
            stackOut_186_1 = ((StringBuilder) (Object) stackIn_186_1).append(stackIn_186_2).append(',').append(param1).append(',');
            stackIn_189_0 = stackOut_186_0;
            stackIn_189_1 = stackOut_186_1;
            stackIn_187_0 = stackOut_186_0;
            stackIn_187_1 = stackOut_186_1;
            if (param2 == null) {
              stackOut_189_0 = (RuntimeException) (Object) stackIn_189_0;
              stackOut_189_1 = (StringBuilder) (Object) stackIn_189_1;
              stackOut_189_2 = "null";
              stackIn_190_0 = stackOut_189_0;
              stackIn_190_1 = stackOut_189_1;
              stackIn_190_2 = stackOut_189_2;
              break L54;
            } else {
              stackOut_187_0 = (RuntimeException) (Object) stackIn_187_0;
              stackOut_187_1 = (StringBuilder) (Object) stackIn_187_1;
              stackOut_187_2 = "{...}";
              stackIn_190_0 = stackOut_187_0;
              stackIn_190_1 = stackOut_187_1;
              stackIn_190_2 = stackOut_187_2;
              break L54;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_190_0, stackIn_190_2 + ')');
        }
        return stackIn_181_0 != 0;
    }

    private final void a(nc param0, int param1, byte param2, int param3) {
        pn var5 = null;
        RuntimeException var5_ref = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (!((qj) this).field_s) {
              L1: {
                ep.field_i = ep.field_i + (param3 + param0.field_b);
                if (param2 <= -87) {
                  break L1;
                } else {
                  ((qj) this).field_p = true;
                  break L1;
                }
              }
              L2: {
                fp.field_z = fp.field_z - (param1 + ((qj) this).field_t);
                var5 = new pn(param0.field_h, -1 + param3, fp.field_z, ep.field_i, od.field_c, og.field_Wb);
                kq.field_j.a((nm) (Object) var5, (byte) 3);
                fp.field_z = fp.field_z - (param0.field_b + param3);
                ep.field_i = ep.field_i + (param1 - -((qj) this).field_t);
                if (~hh.field_b[param0.field_h] <= ~param3) {
                  break L2;
                } else {
                  hh.field_b[param0.field_h] = param3;
                  break L2;
                }
              }
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var5_ref;
            stackOut_9_1 = new StringBuilder().append("qj.AA(");
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(pi param0, byte param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        ge var6 = null;
        int var7 = 0;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var3_int = param0.l(255);
            var4 = param0.l(255);
            var5 = param0.e(255);
            var6 = new ge(0, 0, var4);
            var7 = 102 / ((-65 - param1) / 34);
            var6.field_y = var5;
            ((qj) this).field_w.field_l[var3_int].field_kb.a((Object) (Object) var6, (byte) -39);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("qj.G(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param1 + ')');
        }
    }

    private final void a(byte param0, j param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        try {
          L0: {
            L1: {
              param1.field_db = 0;
              if (!pe.field_l[param1.field_bb]) {
                break L1;
              } else {
                param1.field_db = param1.field_db | 1;
                break L1;
              }
            }
            L2: {
              if (!pe.field_l[param1.field_j]) {
                break L2;
              } else {
                param1.field_db = param1.field_db | 2;
                break L2;
              }
            }
            L3: {
              if (pe.field_l[param1.field_I]) {
                param1.field_db = param1.field_db | 4;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (param0 > 50) {
                break L4;
              } else {
                ((qj) this).b(60);
                break L4;
              }
            }
            L5: {
              L6: {
                if (((qj) this).field_w.field_k == 1) {
                  break L6;
                } else {
                  if (!((qj) this).field_p) {
                    break L5;
                  } else {
                    break L6;
                  }
                }
              }
              L7: {
                if (!pe.field_l[ah.field_w[1][0]]) {
                  break L7;
                } else {
                  param1.field_db = param1.field_db | 1;
                  break L7;
                }
              }
              L8: {
                if (!pe.field_l[ah.field_w[1][1]]) {
                  break L8;
                } else {
                  param1.field_db = param1.field_db | 2;
                  break L8;
                }
              }
              if (pe.field_l[ah.field_w[1][2]]) {
                param1.field_db = param1.field_db | 4;
                break L5;
              } else {
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var3 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) var3;
            stackOut_30_1 = new StringBuilder().append("qj.GA(").append(param0).append(',');
            stackIn_33_0 = stackOut_30_0;
            stackIn_33_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L9;
            } else {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "{...}";
              stackIn_34_0 = stackOut_31_0;
              stackIn_34_1 = stackOut_31_1;
              stackIn_34_2 = stackOut_31_2;
              break L9;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + ')');
        }
    }

    private final void g(int param0) {
        RuntimeException var2 = null;
        int[] var2_array = null;
        int[] var3 = null;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        j var7_ref_j = null;
        vo var8 = null;
        int var8_int = 0;
        jp var8_ref = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_33_0 = 0;
        int stackIn_33_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_44_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_79_0 = 0;
        int stackIn_86_0 = 0;
        int stackIn_90_0 = 0;
        int stackIn_94_0 = 0;
        boolean stackIn_95_0 = false;
        int stackIn_95_1 = 0;
        int stackIn_95_2 = 0;
        boolean stackIn_96_0 = false;
        int stackIn_96_1 = 0;
        int stackIn_96_2 = 0;
        boolean stackIn_98_0 = false;
        int stackIn_98_1 = 0;
        int stackIn_98_2 = 0;
        boolean stackIn_100_0 = false;
        int stackIn_100_1 = 0;
        int stackIn_100_2 = 0;
        boolean stackIn_101_0 = false;
        int stackIn_101_1 = 0;
        int stackIn_101_2 = 0;
        int stackIn_101_3 = 0;
        boolean stackIn_102_0 = false;
        int stackIn_102_1 = 0;
        int stackIn_102_2 = 0;
        int stackIn_102_3 = 0;
        j stackIn_102_4 = null;
        int stackIn_102_5 = 0;
        int stackIn_102_6 = 0;
        boolean stackIn_103_0 = false;
        int stackIn_103_1 = 0;
        int stackIn_103_2 = 0;
        int stackIn_103_3 = 0;
        j stackIn_103_4 = null;
        int stackIn_103_5 = 0;
        int stackIn_103_6 = 0;
        boolean stackIn_105_0 = false;
        int stackIn_105_1 = 0;
        int stackIn_105_2 = 0;
        int stackIn_105_3 = 0;
        j stackIn_105_4 = null;
        int stackIn_105_5 = 0;
        int stackIn_105_6 = 0;
        boolean stackIn_107_0 = false;
        int stackIn_107_1 = 0;
        int stackIn_107_2 = 0;
        int stackIn_107_3 = 0;
        j stackIn_107_4 = null;
        int stackIn_107_5 = 0;
        int stackIn_107_6 = 0;
        boolean stackIn_108_0 = false;
        int stackIn_108_1 = 0;
        int stackIn_108_2 = 0;
        int stackIn_108_3 = 0;
        j stackIn_108_4 = null;
        int stackIn_108_5 = 0;
        int stackIn_108_6 = 0;
        int stackIn_108_7 = 0;
        int stackIn_112_0 = 0;
        boolean stackIn_113_0 = false;
        int stackIn_113_1 = 0;
        int stackIn_113_2 = 0;
        boolean stackIn_114_0 = false;
        int stackIn_114_1 = 0;
        int stackIn_114_2 = 0;
        boolean stackIn_116_0 = false;
        int stackIn_116_1 = 0;
        int stackIn_116_2 = 0;
        boolean stackIn_118_0 = false;
        int stackIn_118_1 = 0;
        int stackIn_118_2 = 0;
        boolean stackIn_119_0 = false;
        int stackIn_119_1 = 0;
        int stackIn_119_2 = 0;
        int stackIn_119_3 = 0;
        boolean stackIn_120_0 = false;
        int stackIn_120_1 = 0;
        int stackIn_120_2 = 0;
        int stackIn_120_3 = 0;
        j stackIn_120_4 = null;
        int stackIn_120_5 = 0;
        int stackIn_120_6 = 0;
        boolean stackIn_121_0 = false;
        int stackIn_121_1 = 0;
        int stackIn_121_2 = 0;
        int stackIn_121_3 = 0;
        j stackIn_121_4 = null;
        int stackIn_121_5 = 0;
        int stackIn_121_6 = 0;
        boolean stackIn_123_0 = false;
        int stackIn_123_1 = 0;
        int stackIn_123_2 = 0;
        int stackIn_123_3 = 0;
        j stackIn_123_4 = null;
        int stackIn_123_5 = 0;
        int stackIn_123_6 = 0;
        boolean stackIn_125_0 = false;
        int stackIn_125_1 = 0;
        int stackIn_125_2 = 0;
        int stackIn_125_3 = 0;
        j stackIn_125_4 = null;
        int stackIn_125_5 = 0;
        int stackIn_125_6 = 0;
        boolean stackIn_126_0 = false;
        int stackIn_126_1 = 0;
        int stackIn_126_2 = 0;
        int stackIn_126_3 = 0;
        j stackIn_126_4 = null;
        int stackIn_126_5 = 0;
        int stackIn_126_6 = 0;
        int stackIn_126_7 = 0;
        int stackIn_131_0 = 0;
        boolean stackIn_132_0 = false;
        int stackIn_132_1 = 0;
        int stackIn_132_2 = 0;
        boolean stackIn_133_0 = false;
        int stackIn_133_1 = 0;
        int stackIn_133_2 = 0;
        boolean stackIn_135_0 = false;
        int stackIn_135_1 = 0;
        int stackIn_135_2 = 0;
        boolean stackIn_137_0 = false;
        int stackIn_137_1 = 0;
        int stackIn_137_2 = 0;
        boolean stackIn_138_0 = false;
        int stackIn_138_1 = 0;
        int stackIn_138_2 = 0;
        int stackIn_138_3 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_32_0 = 0;
        int stackOut_32_1 = 0;
        int stackOut_43_0 = 0;
        int stackOut_43_1 = 0;
        int stackOut_50_0 = 0;
        int stackOut_50_1 = 0;
        int stackOut_78_0 = 0;
        int stackOut_76_0 = 0;
        int stackOut_85_0 = 0;
        int stackOut_83_0 = 0;
        int stackOut_89_0 = 0;
        int stackOut_87_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_91_0 = 0;
        boolean stackOut_94_0 = false;
        int stackOut_94_1 = 0;
        int stackOut_94_2 = 0;
        boolean stackOut_95_0 = false;
        int stackOut_95_1 = 0;
        int stackOut_95_2 = 0;
        boolean stackOut_100_0 = false;
        int stackOut_100_1 = 0;
        int stackOut_100_2 = 0;
        int stackOut_100_3 = 0;
        boolean stackOut_96_0 = false;
        int stackOut_96_1 = 0;
        int stackOut_96_2 = 0;
        boolean stackOut_98_0 = false;
        int stackOut_98_1 = 0;
        int stackOut_98_2 = 0;
        int stackOut_98_3 = 0;
        boolean stackOut_101_0 = false;
        int stackOut_101_1 = 0;
        int stackOut_101_2 = 0;
        int stackOut_101_3 = 0;
        j stackOut_101_4 = null;
        int stackOut_101_5 = 0;
        int stackOut_101_6 = 0;
        boolean stackOut_102_0 = false;
        int stackOut_102_1 = 0;
        int stackOut_102_2 = 0;
        int stackOut_102_3 = 0;
        j stackOut_102_4 = null;
        int stackOut_102_5 = 0;
        int stackOut_102_6 = 0;
        boolean stackOut_107_0 = false;
        int stackOut_107_1 = 0;
        int stackOut_107_2 = 0;
        int stackOut_107_3 = 0;
        j stackOut_107_4 = null;
        int stackOut_107_5 = 0;
        int stackOut_107_6 = 0;
        int stackOut_107_7 = 0;
        boolean stackOut_103_0 = false;
        int stackOut_103_1 = 0;
        int stackOut_103_2 = 0;
        int stackOut_103_3 = 0;
        j stackOut_103_4 = null;
        int stackOut_103_5 = 0;
        int stackOut_103_6 = 0;
        boolean stackOut_105_0 = false;
        int stackOut_105_1 = 0;
        int stackOut_105_2 = 0;
        int stackOut_105_3 = 0;
        j stackOut_105_4 = null;
        int stackOut_105_5 = 0;
        int stackOut_105_6 = 0;
        int stackOut_105_7 = 0;
        int stackOut_111_0 = 0;
        int stackOut_109_0 = 0;
        boolean stackOut_112_0 = false;
        int stackOut_112_1 = 0;
        int stackOut_112_2 = 0;
        boolean stackOut_113_0 = false;
        int stackOut_113_1 = 0;
        int stackOut_113_2 = 0;
        boolean stackOut_118_0 = false;
        int stackOut_118_1 = 0;
        int stackOut_118_2 = 0;
        int stackOut_118_3 = 0;
        boolean stackOut_114_0 = false;
        int stackOut_114_1 = 0;
        int stackOut_114_2 = 0;
        boolean stackOut_116_0 = false;
        int stackOut_116_1 = 0;
        int stackOut_116_2 = 0;
        int stackOut_116_3 = 0;
        boolean stackOut_119_0 = false;
        int stackOut_119_1 = 0;
        int stackOut_119_2 = 0;
        int stackOut_119_3 = 0;
        j stackOut_119_4 = null;
        int stackOut_119_5 = 0;
        int stackOut_119_6 = 0;
        boolean stackOut_120_0 = false;
        int stackOut_120_1 = 0;
        int stackOut_120_2 = 0;
        int stackOut_120_3 = 0;
        j stackOut_120_4 = null;
        int stackOut_120_5 = 0;
        int stackOut_120_6 = 0;
        boolean stackOut_125_0 = false;
        int stackOut_125_1 = 0;
        int stackOut_125_2 = 0;
        int stackOut_125_3 = 0;
        j stackOut_125_4 = null;
        int stackOut_125_5 = 0;
        int stackOut_125_6 = 0;
        int stackOut_125_7 = 0;
        boolean stackOut_121_0 = false;
        int stackOut_121_1 = 0;
        int stackOut_121_2 = 0;
        int stackOut_121_3 = 0;
        j stackOut_121_4 = null;
        int stackOut_121_5 = 0;
        int stackOut_121_6 = 0;
        boolean stackOut_123_0 = false;
        int stackOut_123_1 = 0;
        int stackOut_123_2 = 0;
        int stackOut_123_3 = 0;
        j stackOut_123_4 = null;
        int stackOut_123_5 = 0;
        int stackOut_123_6 = 0;
        int stackOut_123_7 = 0;
        int stackOut_130_0 = 0;
        int stackOut_128_0 = 0;
        boolean stackOut_131_0 = false;
        int stackOut_131_1 = 0;
        int stackOut_131_2 = 0;
        boolean stackOut_132_0 = false;
        int stackOut_132_1 = 0;
        int stackOut_132_2 = 0;
        boolean stackOut_137_0 = false;
        int stackOut_137_1 = 0;
        int stackOut_137_2 = 0;
        int stackOut_137_3 = 0;
        boolean stackOut_133_0 = false;
        int stackOut_133_1 = 0;
        int stackOut_133_2 = 0;
        boolean stackOut_135_0 = false;
        int stackOut_135_1 = 0;
        int stackOut_135_2 = 0;
        int stackOut_135_3 = 0;
        var11 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  L4: {
                    var4 = -76 / ((-79 - param0) / 35);
                    var2_array = kh.field_c[((qj) this).field_w.field_k - 1];
                    var3 = kh.field_e[((qj) this).field_w.field_k - 1];
                    var5 = kh.field_h[-1 + ((qj) this).field_w.field_k];
                    var6 = ((qj) this).field_m;
                    if (null != oa.field_Sb) {
                      var7 = 0;
                      L5: while (true) {
                        if (~var7 <= ~((qj) this).field_w.field_k) {
                          break L4;
                        } else {
                          var8 = ((qj) this).field_w.field_l[var6].field_yb;
                          stackOut_6_0 = 1;
                          stackOut_6_1 = ((qj) this).field_w.field_k;
                          stackIn_33_0 = stackOut_6_0;
                          stackIn_33_1 = stackOut_6_1;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          if (var11 != 0) {
                            break L3;
                          } else {
                            L6: {
                              if (stackIn_7_0 == stackIn_7_1) {
                                L7: {
                                  L8: {
                                    var9 = (-((var8.field_j - -(var8.field_u / 2) << -563346808) * 2) + 33423360) / 510;
                                    oa.field_Sb.a(true, var9, 0, 0, 0);
                                    if (oa.field_Sb.field_m == 7) {
                                      break L8;
                                    } else {
                                      if (((qj) this).field_w.field_l[var6].field_Z == 5) {
                                        break L8;
                                      } else {
                                        break L7;
                                      }
                                    }
                                  }
                                  gh.a(121, true);
                                  break L7;
                                }
                                if (km.field_i > 0) {
                                  var10 = km.field_i * 256 / 32;
                                  nk.field_c.b(0, 0, var10);
                                  if (var11 == 0) {
                                    break L4;
                                  } else {
                                    break L6;
                                  }
                                } else {
                                  break L4;
                                }
                              } else {
                                break L6;
                              }
                            }
                            L9: {
                              L10: {
                                if (var5[var7] != 1) {
                                  break L10;
                                } else {
                                  vi.a((byte) 76, 306 + var2_array[var7], var2_array[var7], var3[var7], var3[var7] - -480);
                                  var9 = (-(2 * (var8.field_j - -(var8.field_u / 2) << 1524245384)) + 20054016) / 306;
                                  oa.field_Sb.a(var3[var7], (byte) -107, var2_array[var7], var6, var9 / 2);
                                  sc.b(-122);
                                  if (var11 == 0) {
                                    break L9;
                                  } else {
                                    break L10;
                                  }
                                }
                              }
                              vi.a((byte) 124, 153 + var2_array[var7], var2_array[var7], var3[var7], 233 + var3[var7]);
                              oa.field_Sb.a((byte) -102, var6, var2_array[var7], var3[var7]);
                              sc.b(-79);
                              break L9;
                            }
                            var6++;
                            var6 = var6 % ((qj) this).field_w.field_k;
                            var7++;
                            if (var11 == 0) {
                              continue L5;
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
                  if (oa.field_Sb != null) {
                    stackOut_32_0 = ((qj) this).field_w.field_k;
                    stackOut_32_1 = 2;
                    stackIn_33_0 = stackOut_32_0;
                    stackIn_33_1 = stackOut_32_1;
                    break L3;
                  } else {
                    break L2;
                  }
                }
                if (stackIn_33_0 <= stackIn_33_1) {
                  break L2;
                } else {
                  var7 = ((qj) this).field_w.field_k;
                  L11: while (true) {
                    if (var7 >= 5) {
                      break L2;
                    } else {
                      oa.field_Sb.a((byte) -79, -1, var2_array[var7], var3[var7]);
                      lb.d(var2_array[var7], var3[var7], 153, 233, 0, 160);
                      var7++;
                      if (var11 != 0) {
                        break L1;
                      } else {
                        if (var11 == 0) {
                          continue L11;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              var6 = ((qj) this).field_m;
              break L1;
            }
            var7 = 0;
            L12: while (true) {
              L13: {
                L14: {
                  if (var7 >= ((qj) this).field_w.field_k) {
                    break L14;
                  } else {
                    stackOut_43_0 = ~tn.field_C;
                    stackOut_43_1 = ~var5[var7];
                    stackIn_51_0 = stackOut_43_0;
                    stackIn_51_1 = stackOut_43_1;
                    stackIn_44_0 = stackOut_43_0;
                    stackIn_44_1 = stackOut_43_1;
                    if (var11 != 0) {
                      break L13;
                    } else {
                      L15: {
                        if (stackIn_44_0 != stackIn_44_1) {
                          gr.b(var5[var7], -28463);
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      pi.a((byte) 90, var6, var5[var7], var3[var7], ((qj) this).field_w, var2_array[var7]);
                      var6++;
                      var6 = var6 % ((qj) this).field_w.field_k;
                      var7++;
                      if (var11 == 0) {
                        continue L12;
                      } else {
                        break L14;
                      }
                    }
                  }
                }
                stackOut_50_0 = ~((qj) this).field_w.field_k;
                stackOut_50_1 = -2;
                stackIn_51_0 = stackOut_50_0;
                stackIn_51_1 = stackOut_50_1;
                break L13;
              }
              L16: {
                if (stackIn_51_0 != stackIn_51_1) {
                  L17: {
                    if (2 != ((qj) this).field_w.field_k) {
                      break L17;
                    } else {
                      L18: {
                        if (((qj) this).field_p) {
                          stackOut_78_0 = 0;
                          stackIn_79_0 = stackOut_78_0;
                          break L18;
                        } else {
                          stackOut_76_0 = 1;
                          stackIn_79_0 = stackOut_76_0;
                          break L18;
                        }
                      }
                      L19: {
                        L20: {
                          var7 = stackIn_79_0;
                          if (!((qj) this).field_p) {
                            break L20;
                          } else {
                            if (((qj) this).field_o != 0) {
                              stackOut_85_0 = 0;
                              stackIn_86_0 = stackOut_85_0;
                              break L19;
                            } else {
                              break L20;
                            }
                          }
                        }
                        stackOut_83_0 = 1;
                        stackIn_86_0 = stackOut_83_0;
                        break L19;
                      }
                      L21: {
                        var8_int = stackIn_86_0;
                        if (((qj) this).field_p) {
                          stackOut_89_0 = ((qj) this).field_m;
                          stackIn_90_0 = stackOut_89_0;
                          break L21;
                        } else {
                          stackOut_87_0 = 1;
                          stackIn_90_0 = stackOut_87_0;
                          break L21;
                        }
                      }
                      L22: {
                        var9 = stackIn_90_0;
                        if ((((qj) this).field_o & 1 << var9) == 0) {
                          stackOut_93_0 = 0;
                          stackIn_94_0 = stackOut_93_0;
                          break L22;
                        } else {
                          stackOut_91_0 = 1;
                          stackIn_94_0 = stackOut_91_0;
                          break L22;
                        }
                      }
                      L23: {
                        L24: {
                          var10 = stackIn_94_0;
                          stackOut_94_0 = ((qj) this).field_n;
                          stackOut_94_1 = -103;
                          stackOut_94_2 = var2_array[0];
                          stackIn_98_0 = stackOut_94_0;
                          stackIn_98_1 = stackOut_94_1;
                          stackIn_98_2 = stackOut_94_2;
                          stackIn_95_0 = stackOut_94_0;
                          stackIn_95_1 = stackOut_94_1;
                          stackIn_95_2 = stackOut_94_2;
                          if (var8_int != 0) {
                            break L24;
                          } else {
                            stackOut_95_0 = stackIn_95_0;
                            stackOut_95_1 = stackIn_95_1;
                            stackOut_95_2 = stackIn_95_2;
                            stackIn_100_0 = stackOut_95_0;
                            stackIn_100_1 = stackOut_95_1;
                            stackIn_100_2 = stackOut_95_2;
                            stackIn_96_0 = stackOut_95_0;
                            stackIn_96_1 = stackOut_95_1;
                            stackIn_96_2 = stackOut_95_2;
                            if (var10 == 0) {
                              stackOut_100_0 = stackIn_100_0;
                              stackOut_100_1 = stackIn_100_1;
                              stackOut_100_2 = stackIn_100_2;
                              stackOut_100_3 = 0;
                              stackIn_101_0 = stackOut_100_0;
                              stackIn_101_1 = stackOut_100_1;
                              stackIn_101_2 = stackOut_100_2;
                              stackIn_101_3 = stackOut_100_3;
                              break L23;
                            } else {
                              stackOut_96_0 = stackIn_96_0;
                              stackOut_96_1 = stackIn_96_1;
                              stackOut_96_2 = stackIn_96_2;
                              stackIn_98_0 = stackOut_96_0;
                              stackIn_98_1 = stackOut_96_1;
                              stackIn_98_2 = stackOut_96_2;
                              break L24;
                            }
                          }
                        }
                        stackOut_98_0 = stackIn_98_0;
                        stackOut_98_1 = stackIn_98_1;
                        stackOut_98_2 = stackIn_98_2;
                        stackOut_98_3 = 1;
                        stackIn_101_0 = stackOut_98_0;
                        stackIn_101_1 = stackOut_98_1;
                        stackIn_101_2 = stackOut_98_2;
                        stackIn_101_3 = stackOut_98_3;
                        break L23;
                      }
                      L25: {
                        L26: {
                          stackOut_101_0 = stackIn_101_0;
                          stackOut_101_1 = stackIn_101_1;
                          stackOut_101_2 = stackIn_101_2;
                          stackOut_101_3 = stackIn_101_3;
                          stackOut_101_4 = ((qj) this).field_w.field_l[var9];
                          stackOut_101_5 = var3[0];
                          stackOut_101_6 = var9;
                          stackIn_105_0 = stackOut_101_0;
                          stackIn_105_1 = stackOut_101_1;
                          stackIn_105_2 = stackOut_101_2;
                          stackIn_105_3 = stackOut_101_3;
                          stackIn_105_4 = stackOut_101_4;
                          stackIn_105_5 = stackOut_101_5;
                          stackIn_105_6 = stackOut_101_6;
                          stackIn_102_0 = stackOut_101_0;
                          stackIn_102_1 = stackOut_101_1;
                          stackIn_102_2 = stackOut_101_2;
                          stackIn_102_3 = stackOut_101_3;
                          stackIn_102_4 = stackOut_101_4;
                          stackIn_102_5 = stackOut_101_5;
                          stackIn_102_6 = stackOut_101_6;
                          if (var7 != 0) {
                            break L26;
                          } else {
                            stackOut_102_0 = stackIn_102_0;
                            stackOut_102_1 = stackIn_102_1;
                            stackOut_102_2 = stackIn_102_2;
                            stackOut_102_3 = stackIn_102_3;
                            stackOut_102_4 = (j) (Object) stackIn_102_4;
                            stackOut_102_5 = stackIn_102_5;
                            stackOut_102_6 = stackIn_102_6;
                            stackIn_107_0 = stackOut_102_0;
                            stackIn_107_1 = stackOut_102_1;
                            stackIn_107_2 = stackOut_102_2;
                            stackIn_107_3 = stackOut_102_3;
                            stackIn_107_4 = stackOut_102_4;
                            stackIn_107_5 = stackOut_102_5;
                            stackIn_107_6 = stackOut_102_6;
                            stackIn_103_0 = stackOut_102_0;
                            stackIn_103_1 = stackOut_102_1;
                            stackIn_103_2 = stackOut_102_2;
                            stackIn_103_3 = stackOut_102_3;
                            stackIn_103_4 = stackOut_102_4;
                            stackIn_103_5 = stackOut_102_5;
                            stackIn_103_6 = stackOut_102_6;
                            if (var10 == 0) {
                              stackOut_107_0 = stackIn_107_0;
                              stackOut_107_1 = stackIn_107_1;
                              stackOut_107_2 = stackIn_107_2;
                              stackOut_107_3 = stackIn_107_3;
                              stackOut_107_4 = (j) (Object) stackIn_107_4;
                              stackOut_107_5 = stackIn_107_5;
                              stackOut_107_6 = stackIn_107_6;
                              stackOut_107_7 = 0;
                              stackIn_108_0 = stackOut_107_0;
                              stackIn_108_1 = stackOut_107_1;
                              stackIn_108_2 = stackOut_107_2;
                              stackIn_108_3 = stackOut_107_3;
                              stackIn_108_4 = stackOut_107_4;
                              stackIn_108_5 = stackOut_107_5;
                              stackIn_108_6 = stackOut_107_6;
                              stackIn_108_7 = stackOut_107_7;
                              break L25;
                            } else {
                              stackOut_103_0 = stackIn_103_0;
                              stackOut_103_1 = stackIn_103_1;
                              stackOut_103_2 = stackIn_103_2;
                              stackOut_103_3 = stackIn_103_3;
                              stackOut_103_4 = (j) (Object) stackIn_103_4;
                              stackOut_103_5 = stackIn_103_5;
                              stackOut_103_6 = stackIn_103_6;
                              stackIn_105_0 = stackOut_103_0;
                              stackIn_105_1 = stackOut_103_1;
                              stackIn_105_2 = stackOut_103_2;
                              stackIn_105_3 = stackOut_103_3;
                              stackIn_105_4 = stackOut_103_4;
                              stackIn_105_5 = stackOut_103_5;
                              stackIn_105_6 = stackOut_103_6;
                              break L26;
                            }
                          }
                        }
                        stackOut_105_0 = stackIn_105_0;
                        stackOut_105_1 = stackIn_105_1;
                        stackOut_105_2 = stackIn_105_2;
                        stackOut_105_3 = stackIn_105_3;
                        stackOut_105_4 = (j) (Object) stackIn_105_4;
                        stackOut_105_5 = stackIn_105_5;
                        stackOut_105_6 = stackIn_105_6;
                        stackOut_105_7 = 1;
                        stackIn_108_0 = stackOut_105_0;
                        stackIn_108_1 = stackOut_105_1;
                        stackIn_108_2 = stackOut_105_2;
                        stackIn_108_3 = stackOut_105_3;
                        stackIn_108_4 = stackOut_105_4;
                        stackIn_108_5 = stackOut_105_5;
                        stackIn_108_6 = stackOut_105_6;
                        stackIn_108_7 = stackOut_105_7;
                        break L25;
                      }
                      L27: {
                        om.a(stackIn_108_0, (byte) stackIn_108_1, stackIn_108_2, stackIn_108_3 != 0, stackIn_108_4, stackIn_108_5, stackIn_108_6, stackIn_108_7 != 0, ((qj) this).field_w);
                        var9 = 1 + -var9;
                        if (0 == (1 << var9 & ((qj) this).field_o)) {
                          stackOut_111_0 = 0;
                          stackIn_112_0 = stackOut_111_0;
                          break L27;
                        } else {
                          stackOut_109_0 = 1;
                          stackIn_112_0 = stackOut_109_0;
                          break L27;
                        }
                      }
                      L28: {
                        L29: {
                          var10 = stackIn_112_0;
                          stackOut_112_0 = ((qj) this).field_n;
                          stackOut_112_1 = -103;
                          stackOut_112_2 = var2_array[1];
                          stackIn_116_0 = stackOut_112_0;
                          stackIn_116_1 = stackOut_112_1;
                          stackIn_116_2 = stackOut_112_2;
                          stackIn_113_0 = stackOut_112_0;
                          stackIn_113_1 = stackOut_112_1;
                          stackIn_113_2 = stackOut_112_2;
                          if (var8_int != 0) {
                            break L29;
                          } else {
                            stackOut_113_0 = stackIn_113_0;
                            stackOut_113_1 = stackIn_113_1;
                            stackOut_113_2 = stackIn_113_2;
                            stackIn_118_0 = stackOut_113_0;
                            stackIn_118_1 = stackOut_113_1;
                            stackIn_118_2 = stackOut_113_2;
                            stackIn_114_0 = stackOut_113_0;
                            stackIn_114_1 = stackOut_113_1;
                            stackIn_114_2 = stackOut_113_2;
                            if (var10 == 0) {
                              stackOut_118_0 = stackIn_118_0;
                              stackOut_118_1 = stackIn_118_1;
                              stackOut_118_2 = stackIn_118_2;
                              stackOut_118_3 = 0;
                              stackIn_119_0 = stackOut_118_0;
                              stackIn_119_1 = stackOut_118_1;
                              stackIn_119_2 = stackOut_118_2;
                              stackIn_119_3 = stackOut_118_3;
                              break L28;
                            } else {
                              stackOut_114_0 = stackIn_114_0;
                              stackOut_114_1 = stackIn_114_1;
                              stackOut_114_2 = stackIn_114_2;
                              stackIn_116_0 = stackOut_114_0;
                              stackIn_116_1 = stackOut_114_1;
                              stackIn_116_2 = stackOut_114_2;
                              break L29;
                            }
                          }
                        }
                        stackOut_116_0 = stackIn_116_0;
                        stackOut_116_1 = stackIn_116_1;
                        stackOut_116_2 = stackIn_116_2;
                        stackOut_116_3 = 1;
                        stackIn_119_0 = stackOut_116_0;
                        stackIn_119_1 = stackOut_116_1;
                        stackIn_119_2 = stackOut_116_2;
                        stackIn_119_3 = stackOut_116_3;
                        break L28;
                      }
                      L30: {
                        L31: {
                          stackOut_119_0 = stackIn_119_0;
                          stackOut_119_1 = stackIn_119_1;
                          stackOut_119_2 = stackIn_119_2;
                          stackOut_119_3 = stackIn_119_3;
                          stackOut_119_4 = ((qj) this).field_w.field_l[var9];
                          stackOut_119_5 = var3[1];
                          stackOut_119_6 = var9;
                          stackIn_123_0 = stackOut_119_0;
                          stackIn_123_1 = stackOut_119_1;
                          stackIn_123_2 = stackOut_119_2;
                          stackIn_123_3 = stackOut_119_3;
                          stackIn_123_4 = stackOut_119_4;
                          stackIn_123_5 = stackOut_119_5;
                          stackIn_123_6 = stackOut_119_6;
                          stackIn_120_0 = stackOut_119_0;
                          stackIn_120_1 = stackOut_119_1;
                          stackIn_120_2 = stackOut_119_2;
                          stackIn_120_3 = stackOut_119_3;
                          stackIn_120_4 = stackOut_119_4;
                          stackIn_120_5 = stackOut_119_5;
                          stackIn_120_6 = stackOut_119_6;
                          if (var7 != 0) {
                            break L31;
                          } else {
                            stackOut_120_0 = stackIn_120_0;
                            stackOut_120_1 = stackIn_120_1;
                            stackOut_120_2 = stackIn_120_2;
                            stackOut_120_3 = stackIn_120_3;
                            stackOut_120_4 = (j) (Object) stackIn_120_4;
                            stackOut_120_5 = stackIn_120_5;
                            stackOut_120_6 = stackIn_120_6;
                            stackIn_125_0 = stackOut_120_0;
                            stackIn_125_1 = stackOut_120_1;
                            stackIn_125_2 = stackOut_120_2;
                            stackIn_125_3 = stackOut_120_3;
                            stackIn_125_4 = stackOut_120_4;
                            stackIn_125_5 = stackOut_120_5;
                            stackIn_125_6 = stackOut_120_6;
                            stackIn_121_0 = stackOut_120_0;
                            stackIn_121_1 = stackOut_120_1;
                            stackIn_121_2 = stackOut_120_2;
                            stackIn_121_3 = stackOut_120_3;
                            stackIn_121_4 = stackOut_120_4;
                            stackIn_121_5 = stackOut_120_5;
                            stackIn_121_6 = stackOut_120_6;
                            if (var10 == 0) {
                              stackOut_125_0 = stackIn_125_0;
                              stackOut_125_1 = stackIn_125_1;
                              stackOut_125_2 = stackIn_125_2;
                              stackOut_125_3 = stackIn_125_3;
                              stackOut_125_4 = (j) (Object) stackIn_125_4;
                              stackOut_125_5 = stackIn_125_5;
                              stackOut_125_6 = stackIn_125_6;
                              stackOut_125_7 = 0;
                              stackIn_126_0 = stackOut_125_0;
                              stackIn_126_1 = stackOut_125_1;
                              stackIn_126_2 = stackOut_125_2;
                              stackIn_126_3 = stackOut_125_3;
                              stackIn_126_4 = stackOut_125_4;
                              stackIn_126_5 = stackOut_125_5;
                              stackIn_126_6 = stackOut_125_6;
                              stackIn_126_7 = stackOut_125_7;
                              break L30;
                            } else {
                              stackOut_121_0 = stackIn_121_0;
                              stackOut_121_1 = stackIn_121_1;
                              stackOut_121_2 = stackIn_121_2;
                              stackOut_121_3 = stackIn_121_3;
                              stackOut_121_4 = (j) (Object) stackIn_121_4;
                              stackOut_121_5 = stackIn_121_5;
                              stackOut_121_6 = stackIn_121_6;
                              stackIn_123_0 = stackOut_121_0;
                              stackIn_123_1 = stackOut_121_1;
                              stackIn_123_2 = stackOut_121_2;
                              stackIn_123_3 = stackOut_121_3;
                              stackIn_123_4 = stackOut_121_4;
                              stackIn_123_5 = stackOut_121_5;
                              stackIn_123_6 = stackOut_121_6;
                              break L31;
                            }
                          }
                        }
                        stackOut_123_0 = stackIn_123_0;
                        stackOut_123_1 = stackIn_123_1;
                        stackOut_123_2 = stackIn_123_2;
                        stackOut_123_3 = stackIn_123_3;
                        stackOut_123_4 = (j) (Object) stackIn_123_4;
                        stackOut_123_5 = stackIn_123_5;
                        stackOut_123_6 = stackIn_123_6;
                        stackOut_123_7 = 1;
                        stackIn_126_0 = stackOut_123_0;
                        stackIn_126_1 = stackOut_123_1;
                        stackIn_126_2 = stackOut_123_2;
                        stackIn_126_3 = stackOut_123_3;
                        stackIn_126_4 = stackOut_123_4;
                        stackIn_126_5 = stackOut_123_5;
                        stackIn_126_6 = stackOut_123_6;
                        stackIn_126_7 = stackOut_123_7;
                        break L30;
                      }
                      om.a(stackIn_126_0, (byte) stackIn_126_1, stackIn_126_2, stackIn_126_3 != 0, stackIn_126_4, stackIn_126_5, stackIn_126_6, stackIn_126_7 != 0, ((qj) this).field_w);
                      if (var11 == 0) {
                        break L16;
                      } else {
                        break L17;
                      }
                    }
                  }
                  L32: {
                    var3 = kh.field_e[4];
                    var2_array = kh.field_c[4];
                    nh.a(169, 482, -40, -1, cd.field_h, -1);
                    nh.a(169, 482, -40, 472, cd.field_h, -1);
                    if ((((qj) this).field_o & 1 << ((qj) this).field_m) == 0) {
                      stackOut_130_0 = 0;
                      stackIn_131_0 = stackOut_130_0;
                      break L32;
                    } else {
                      stackOut_128_0 = 1;
                      stackIn_131_0 = stackOut_128_0;
                      break L32;
                    }
                  }
                  L33: {
                    L34: {
                      var7 = stackIn_131_0;
                      stackOut_131_0 = ((qj) this).field_n;
                      stackOut_131_1 = -103;
                      stackOut_131_2 = var2_array[0];
                      stackIn_135_0 = stackOut_131_0;
                      stackIn_135_1 = stackOut_131_1;
                      stackIn_135_2 = stackOut_131_2;
                      stackIn_132_0 = stackOut_131_0;
                      stackIn_132_1 = stackOut_131_1;
                      stackIn_132_2 = stackOut_131_2;
                      if (var7 != 0) {
                        break L34;
                      } else {
                        stackOut_132_0 = stackIn_132_0;
                        stackOut_132_1 = stackIn_132_1;
                        stackOut_132_2 = stackIn_132_2;
                        stackIn_137_0 = stackOut_132_0;
                        stackIn_137_1 = stackOut_132_1;
                        stackIn_137_2 = stackOut_132_2;
                        stackIn_133_0 = stackOut_132_0;
                        stackIn_133_1 = stackOut_132_1;
                        stackIn_133_2 = stackOut_132_2;
                        if (0 != ((qj) this).field_o) {
                          stackOut_137_0 = stackIn_137_0;
                          stackOut_137_1 = stackIn_137_1;
                          stackOut_137_2 = stackIn_137_2;
                          stackOut_137_3 = 0;
                          stackIn_138_0 = stackOut_137_0;
                          stackIn_138_1 = stackOut_137_1;
                          stackIn_138_2 = stackOut_137_2;
                          stackIn_138_3 = stackOut_137_3;
                          break L33;
                        } else {
                          stackOut_133_0 = stackIn_133_0;
                          stackOut_133_1 = stackIn_133_1;
                          stackOut_133_2 = stackIn_133_2;
                          stackIn_135_0 = stackOut_133_0;
                          stackIn_135_1 = stackOut_133_1;
                          stackIn_135_2 = stackOut_133_2;
                          break L34;
                        }
                      }
                    }
                    stackOut_135_0 = stackIn_135_0;
                    stackOut_135_1 = stackIn_135_1;
                    stackOut_135_2 = stackIn_135_2;
                    stackOut_135_3 = 1;
                    stackIn_138_0 = stackOut_135_0;
                    stackIn_138_1 = stackOut_135_1;
                    stackIn_138_2 = stackOut_135_2;
                    stackIn_138_3 = stackOut_135_3;
                    break L33;
                  }
                  om.a(stackIn_138_0, (byte) stackIn_138_1, stackIn_138_2, stackIn_138_3 != 0, ((qj) this).field_w.field_l[((qj) this).field_m], var3[0], ((qj) this).field_m, var7 != 0, ((qj) this).field_w);
                  nh.a(169, 9, -40, -1, cd.field_h, var3[2] + -3);
                  nh.a(169, 9, -40, 472, cd.field_h, -3 + var3[2]);
                  break L16;
                } else {
                  L35: {
                    L36: {
                      var7_ref_j = ((qj) this).field_w.field_l[0];
                      nh.a(526, 482, -40, -1, cd.field_h, -1);
                      lb.d(7, 473, 510, 7, 0, 96);
                      lb.d(524, 0, 116, 480, 0, 96);
                      nh.a(125, 482, -40, 516, cd.field_h, -1);
                      tk.a(130, ((qj) this).field_w, nn.field_g, var7_ref_j, (byte) -104, 527, 10, 85);
                      nh.a(125, 9, -40, 516, cd.field_h, 137);
                      if (!r.field_A) {
                        break L36;
                      } else {
                        if (wc.field_b) {
                          break L36;
                        } else {
                          break L35;
                        }
                      }
                    }
                    ua.a(var7_ref_j, 524, 85, -68, 147, 81, ((qj) this).field_w);
                    break L35;
                  }
                  L37: {
                    L38: {
                      L39: {
                        nh.a(125, 9, -40, 516, cd.field_h, 229);
                        a.a(640, ((qj) this).field_w, var7_ref_j);
                        if (!r.field_A) {
                          break L39;
                        } else {
                          if (ka.a((byte) 124)) {
                            break L38;
                          } else {
                            break L39;
                          }
                        }
                      }
                      if (null == var7_ref_j.field_fb) {
                        break L37;
                      } else {
                        ui.a(var7_ref_j.field_fb, nn.field_g, 0, (tp[]) null, 80, 621, 1729, 340, 85, -1);
                        if (var11 == 0) {
                          break L37;
                        } else {
                          break L38;
                        }
                      }
                    }
                    ui.a(tb.field_eb + ro.field_v, ob.field_D, 6, c.field_i, 100, 621, 1729, 340, 230, 0);
                    break L37;
                  }
                  break L16;
                }
              }
              L40: {
                if (((qj) this).field_w.field_k > 1) {
                  if (((((qj) this).field_w.field_g | ((qj) this).field_w.field_i) & 1 << ((qj) this).field_m) != 0) {
                    break L40;
                  } else {
                    v.a(var2_array[0], 424, false, ((qj) this).field_w, ((qj) this).field_m, var3[0]);
                    break L40;
                  }
                } else {
                  break L40;
                }
              }
              L41: {
                if (((qj) this).field_w.field_k != 2) {
                  break L41;
                } else {
                  if (0 != (1 << 1 + -((qj) this).field_m & (((qj) this).field_w.field_g | ((qj) this).field_w.field_i))) {
                    break L41;
                  } else {
                    v.a(var2_array[1], 424, false, ((qj) this).field_w, 1 + -((qj) this).field_m, var3[1]);
                    break L41;
                  }
                }
              }
              var3 = kh.field_e[((qj) this).field_w.field_k + -1];
              var6 = ((qj) this).field_m;
              var2_array = kh.field_c[((qj) this).field_w.field_k - 1];
              var7 = 0;
              L42: while (true) {
                L43: {
                  L44: {
                    if (~((qj) this).field_w.field_k >= ~var7) {
                      break L44;
                    } else {
                      if (var11 != 0) {
                        break L43;
                      } else {
                        L45: {
                          if (var5[var7] == 2) {
                            var8_ref = ul.field_k[((qj) this).field_w.field_l[var6].field_H];
                            var9 = ob.field_D.field_F - -ob.field_D.field_P;
                            lb.d(var2_array[var7], 235 - -var3[var7] + -23, 153, var9, 0, 141);
                            var8_ref.c(-var8_ref.field_x + (153 + var2_array[var7]), -var8_ref.field_z + var3[var7] + 233);
                            ce.field_e.c(((qj) this).field_w.field_f[var6], var2_array[var7] + 4, 2 + var3[var7] + 223, 2, -1);
                            break L45;
                          } else {
                            break L45;
                          }
                        }
                        var6++;
                        var6 = var6 % ((qj) this).field_w.field_k;
                        var7++;
                        if (var11 == 0) {
                          continue L42;
                        } else {
                          break L44;
                        }
                      }
                    }
                  }
                  break L43;
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "qj.DA(" + param0 + ')');
        }
    }

    qj(String[] param0, int param1, int param2, oi param3, int[] param4, int[] param5) {
        this(false, false, param0, param1, param2, param3, param4, param5);
    }

    final void f(int param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!((qj) this).field_p) {
              throw new IllegalStateException();
            } else {
              k.field_h.e(-13413, 67);
              var2_int = 68 % ((param0 - -65) / 59);
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (Object) var2, "qj.O(" + param0 + ')');
        }
    }

    qj(boolean param0, boolean param1, String[] param2, int param3, int param4, oi param5, int[] param6, int[] param7) {
        super(-1);
        RuntimeException var9 = null;
        int[] var9_array = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int stackIn_32_0 = 0;
        int stackIn_32_1 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException stackIn_47_0 = null;
        StringBuilder stackIn_47_1 = null;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        RuntimeException stackIn_50_0 = null;
        StringBuilder stackIn_50_1 = null;
        String stackIn_50_2 = null;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        RuntimeException stackIn_54_0 = null;
        StringBuilder stackIn_54_1 = null;
        String stackIn_54_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        Object stackOut_20_0 = null;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        Object stackOut_21_0 = null;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_22_0 = null;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_31_0 = 0;
        int stackOut_31_1 = 0;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_46_0 = null;
        StringBuilder stackOut_46_1 = null;
        RuntimeException stackOut_49_0 = null;
        StringBuilder stackOut_49_1 = null;
        String stackOut_49_2 = null;
        RuntimeException stackOut_47_0 = null;
        StringBuilder stackOut_47_1 = null;
        String stackOut_47_2 = null;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_53_0 = null;
        StringBuilder stackOut_53_1 = null;
        String stackOut_53_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var11 = BrickABrac.field_J ? 1 : 0;
        ((qj) this).field_x = 0;
        ((qj) this).field_s = false;
        try {
          L0: {
            L1: {
              ((qj) this).field_n = param1;
              ((qj) this).field_p = param0;
              ((qj) this).field_o = param4;
              ((qj) this).field_k = param3;
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (kb.field_Yb < 2) {
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
            ((qj) this).field_y = stackIn_4_1 != 0;
            var9_array = pl.field_b;
            var10 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (8 <= var10) {
                    break L4;
                  } else {
                    var9_array[var10] = 0;
                    var10++;
                    if (var11 != 0) {
                      break L3;
                    } else {
                      if (var11 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                ((qj) this).field_w = new ak(param2, ((qj) this).field_o, param5, param6, param7);
                break L3;
              }
              var9_int = 0;
              var10 = 0;
              L5: while (true) {
                L6: {
                  L7: {
                    if (((qj) this).field_w.field_k <= var10) {
                      break L7;
                    } else {
                      stackOut_13_0 = ~(((qj) this).field_o & 1 << var10);
                      stackOut_13_1 = -1;
                      stackIn_32_0 = stackOut_13_0;
                      stackIn_32_1 = stackOut_13_1;
                      stackIn_14_0 = stackOut_13_0;
                      stackIn_14_1 = stackOut_13_1;
                      if (var11 != 0) {
                        break L6;
                      } else {
                        L8: {
                          if (stackIn_14_0 != stackIn_14_1) {
                            var9_int++;
                            break L8;
                          } else {
                            break L8;
                          }
                        }
                        var10++;
                        if (var11 == 0) {
                          continue L5;
                        } else {
                          break L7;
                        }
                      }
                    }
                  }
                  L9: {
                    stackOut_20_0 = this;
                    stackIn_27_0 = stackOut_20_0;
                    stackIn_21_0 = stackOut_20_0;
                    if (var9_int == 2) {
                      stackOut_27_0 = this;
                      stackOut_27_1 = 1;
                      stackIn_28_0 = stackOut_27_0;
                      stackIn_28_1 = stackOut_27_1;
                      break L9;
                    } else {
                      stackOut_21_0 = this;
                      stackIn_26_0 = stackOut_21_0;
                      stackIn_22_0 = stackOut_21_0;
                      if (((qj) this).field_k < 0) {
                        stackOut_26_0 = this;
                        stackOut_26_1 = 0;
                        stackIn_28_0 = stackOut_26_0;
                        stackIn_28_1 = stackOut_26_1;
                        break L9;
                      } else {
                        stackOut_22_0 = this;
                        stackIn_24_0 = stackOut_22_0;
                        stackOut_24_0 = this;
                        stackOut_24_1 = ((qj) this).field_k;
                        stackIn_28_0 = stackOut_24_0;
                        stackIn_28_1 = stackOut_24_1;
                        break L9;
                      }
                    }
                  }
                  L10: {
                    ((qj) this).field_m = stackIn_28_1;
                    if (oo.field_w != null) {
                      break L10;
                    } else {
                      oo.field_w = new fo(new int[1]);
                      break L10;
                    }
                  }
                  km.field_i = 0;
                  to.field_k = kl.a(ta.field_e[2], 256, 0);
                  me.field_d = kl.a(ta.field_e[2], 256, 0);
                  to.field_k.f(-1);
                  me.field_d.f(-1);
                  l discarded$2 = sk.a((byte) 125, to.field_k);
                  l discarded$3 = sk.a((byte) 5, me.field_d);
                  tn.field_C = 1;
                  stackOut_31_0 = tn.field_C;
                  stackOut_31_1 = -28463;
                  stackIn_32_0 = stackOut_31_0;
                  stackIn_32_1 = stackOut_31_1;
                  break L6;
                }
                L11: {
                  gr.b(stackIn_32_0, stackIn_32_1);
                  pg.field_m = -1;
                  dj.field_b = -1;
                  if (jo.field_j == null) {
                    jo.field_j = rd.a(cm.field_p, new String[1], (byte) 103).toLowerCase();
                    ff.field_j = pn.field_j.toLowerCase();
                    break L11;
                  } else {
                    break L11;
                  }
                }
                be.field_j = 0;
                op.field_a = false;
                fl.field_l = ue.a(false);
                gq.field_Yb = param5.field_b.field_h;
                tk.field_q = param5.a(96);
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L12: {
            var9 = decompiledCaughtException;
            stackOut_38_0 = (RuntimeException) var9;
            stackOut_38_1 = new StringBuilder().append("qj.<init>(").append(param0).append(',').append(param1).append(',');
            stackIn_41_0 = stackOut_38_0;
            stackIn_41_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param2 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L12;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_42_0 = stackOut_39_0;
              stackIn_42_1 = stackOut_39_1;
              stackIn_42_2 = stackOut_39_2;
              break L12;
            }
          }
          L13: {
            stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
            stackOut_42_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(',').append(param3).append(',').append(param4).append(',');
            stackIn_45_0 = stackOut_42_0;
            stackIn_45_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param5 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L13;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_46_0 = stackOut_43_0;
              stackIn_46_1 = stackOut_43_1;
              stackIn_46_2 = stackOut_43_2;
              break L13;
            }
          }
          L14: {
            stackOut_46_0 = (RuntimeException) (Object) stackIn_46_0;
            stackOut_46_1 = ((StringBuilder) (Object) stackIn_46_1).append(stackIn_46_2).append(',');
            stackIn_49_0 = stackOut_46_0;
            stackIn_49_1 = stackOut_46_1;
            stackIn_47_0 = stackOut_46_0;
            stackIn_47_1 = stackOut_46_1;
            if (param6 == null) {
              stackOut_49_0 = (RuntimeException) (Object) stackIn_49_0;
              stackOut_49_1 = (StringBuilder) (Object) stackIn_49_1;
              stackOut_49_2 = "null";
              stackIn_50_0 = stackOut_49_0;
              stackIn_50_1 = stackOut_49_1;
              stackIn_50_2 = stackOut_49_2;
              break L14;
            } else {
              stackOut_47_0 = (RuntimeException) (Object) stackIn_47_0;
              stackOut_47_1 = (StringBuilder) (Object) stackIn_47_1;
              stackOut_47_2 = "{...}";
              stackIn_50_0 = stackOut_47_0;
              stackIn_50_1 = stackOut_47_1;
              stackIn_50_2 = stackOut_47_2;
              break L14;
            }
          }
          L15: {
            stackOut_50_0 = (RuntimeException) (Object) stackIn_50_0;
            stackOut_50_1 = ((StringBuilder) (Object) stackIn_50_1).append(stackIn_50_2).append(',');
            stackIn_53_0 = stackOut_50_0;
            stackIn_53_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param7 == null) {
              stackOut_53_0 = (RuntimeException) (Object) stackIn_53_0;
              stackOut_53_1 = (StringBuilder) (Object) stackIn_53_1;
              stackOut_53_2 = "null";
              stackIn_54_0 = stackOut_53_0;
              stackIn_54_1 = stackOut_53_1;
              stackIn_54_2 = stackOut_53_2;
              break L15;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_54_0 = stackOut_51_0;
              stackIn_54_1 = stackOut_51_1;
              stackIn_54_2 = stackOut_51_2;
              break L15;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_54_0, stackIn_54_2 + ')');
        }
    }

    static {
    }
}
