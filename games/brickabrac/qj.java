/*
 * Decompiled by CFR-JS 0.4.0.
 */
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

    private final void a() {
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_28_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_13_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_27_0 = 0;
        int stackOut_26_0 = 0;
        L0: {
          if (!pf.field_p) {
            if (!la.field_c) {
              stackOut_4_0 = 1;
              stackIn_6_0 = stackOut_4_0;
              break L0;
            } else {
              stackOut_3_0 = 0;
              stackIn_6_0 = stackOut_3_0;
              break L0;
            }
          } else {
            stackOut_1_0 = 0;
            stackIn_6_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var2 = stackIn_6_0;
          stackOut_6_0 = var2;
          stackIn_8_0 = stackOut_6_0;
          stackIn_7_0 = stackOut_6_0;
          if ((((qj) this).field_o & (((qj) this).field_w.field_i | ((qj) this).field_w.field_g | ((qj) this).field_w.field_a)) != ((qj) this).field_o) {
            stackOut_8_0 = stackIn_8_0;
            stackOut_8_1 = 0;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            break L1;
          } else {
            stackOut_7_0 = stackIn_7_0;
            stackOut_7_1 = 1;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            break L1;
          }
        }
        L2: {
          L3: {
            var2 = stackIn_9_0 & stackIn_9_1;
            stackOut_9_0 = var2;
            stackIn_14_0 = stackOut_9_0;
            stackIn_10_0 = stackOut_9_0;
            if (2 >= ((qj) this).field_w.field_k) {
              break L3;
            } else {
              L4: {
                stackOut_10_0 = stackIn_10_0;
                stackIn_13_0 = stackOut_10_0;
                stackIn_11_0 = stackOut_10_0;
                if (((qj) this).field_k < 0) {
                  break L4;
                } else {
                  stackOut_11_0 = stackIn_11_0;
                  stackIn_14_0 = stackOut_11_0;
                  stackIn_12_0 = stackOut_11_0;
                  if (((qj) this).field_w.field_l[((qj) this).field_k].field_U < 50) {
                    break L3;
                  } else {
                    stackOut_12_0 = stackIn_12_0;
                    stackIn_13_0 = stackOut_12_0;
                    break L4;
                  }
                }
              }
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = 1;
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              break L2;
            }
          }
          stackOut_14_0 = stackIn_14_0;
          stackOut_14_1 = 0;
          stackIn_15_0 = stackOut_14_0;
          stackIn_15_1 = stackOut_14_1;
          break L2;
        }
        L5: {
          var2 = stackIn_15_0 & stackIn_15_1;
          if (var2 == 0) {
            break L5;
          } else {
            L6: {
              if (pe.field_l[fq.field_b]) {
                break L6;
              } else {
                if (!pe.field_l[td.field_u]) {
                  if (!pe.field_l[ac.field_f]) {
                    break L5;
                  } else {
                    int fieldTemp$5 = ((qj) this).field_m - 1;
                    ((qj) this).field_m = ((qj) this).field_m - 1;
                    ((qj) this).field_m = (((qj) this).field_w.field_k + fieldTemp$5) % ((qj) this).field_w.field_k;
                    break L5;
                  }
                } else {
                  break L6;
                }
              }
            }
            int fieldTemp$6 = ((qj) this).field_m + 1;
            ((qj) this).field_m = ((qj) this).field_m + 1;
            ((qj) this).field_m = fieldTemp$6 % ((qj) this).field_w.field_k;
            break L5;
          }
        }
        L7: {
          L8: {
            if (pe.field_l[fq.field_b]) {
              break L8;
            } else {
              if (pe.field_l[ac.field_f]) {
                break L8;
              } else {
                if (!pe.field_l[td.field_u]) {
                  stackOut_27_0 = 0;
                  stackIn_28_0 = stackOut_27_0;
                  break L7;
                } else {
                  break L8;
                }
              }
            }
          }
          stackOut_26_0 = 1;
          stackIn_28_0 = stackOut_26_0;
          break L7;
        }
        la.field_c = stackIn_28_0 != 0;
    }

    private final boolean a(int param0, int param1) {
        int discarded$9 = -75;
        if (!(!eo.a(mk.field_b, param0))) {
            return true;
        }
        int[] var5 = mk.field_b;
        int[] var3 = var5;
        int var4 = param0;
        var5[var4 >> 5] = ud.d(var5[var4 >> 5], 1 << ik.a(31, var4));
        int[] var6 = pl.field_b;
        var3 = var6;
        var4 = param0;
        var6[var4 >> 5] = ud.d(var6[var4 >> 5], 1 << ik.a(var4, 31));
        kp.field_c.a((nm) (Object) new kq(param0), (byte) 3);
        return false;
    }

    final void b(byte param0) {
        lb.a();
        if (!(((qj) this).field_q)) {
            return;
        }
        if (param0 > -14) {
            ((qj) this).a((byte) -47, -81);
        }
        int discarded$0 = 41;
        this.g();
    }

    final void a(pi param0, boolean param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param0.l(255);
              ((qj) this).field_w.field_l[var4_int].field_V = param0.j(48);
              var5 = -101 % ((param2 - 26) / 60);
              if (param1) {
                ((qj) this).field_w.field_l[var4_int].field_zb = param0.l(255);
                ((qj) this).field_w.field_a = ((qj) this).field_w.field_a | 1 << var4_int;
                break L1;
              } else {
                ((qj) this).field_w.field_g = ((qj) this).field_w.field_g | 1 << var4_int;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("qj.A(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void a(byte param0, pi param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            stackOut_3_1 = new StringBuilder().append("qj.M(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    private final void a(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        if (!(!this.a(param2, 1))) {
            return;
        }
        if (!(((qj) this).field_s)) {
            var4 = ((qj) this).field_w.field_l[0].field_ob;
            ep.field_i = ep.field_i - (var4 - -((qj) this).field_t);
            var5 = ((qj) this).field_w.field_l[0].field_qb;
            fp.field_z = fp.field_z + var5;
            lp.field_wb.a((nm) (Object) new e(param2, param0, fp.field_z, ep.field_i, od.field_c, og.field_Wb), (byte) 3);
            fp.field_z = fp.field_z + (var4 + ((qj) this).field_t);
            ep.field_i = ep.field_i - var5;
        }
    }

    final void a(boolean param0, boolean param1, int param2) {
        int var4 = 0;
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
        j var15 = null;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_110_0 = 0;
        int stackIn_115_0 = 0;
        String stackIn_205_0 = null;
        Object stackIn_216_0 = null;
        int stackIn_216_1 = 0;
        int stackIn_216_2 = 0;
        Object stackIn_217_0 = null;
        int stackIn_217_1 = 0;
        int stackIn_217_2 = 0;
        Object stackIn_218_0 = null;
        int stackIn_218_1 = 0;
        int stackIn_218_2 = 0;
        int stackIn_218_3 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_114_0 = 0;
        int stackOut_113_0 = 0;
        int stackOut_109_0 = 0;
        int stackOut_108_0 = 0;
        String stackOut_204_0 = null;
        String stackOut_203_0 = null;
        Object stackOut_215_0 = null;
        int stackOut_215_1 = 0;
        int stackOut_215_2 = 0;
        Object stackOut_217_0 = null;
        int stackOut_217_1 = 0;
        int stackOut_217_2 = 0;
        int stackOut_217_3 = 0;
        Object stackOut_216_0 = null;
        int stackOut_216_1 = 0;
        int stackOut_216_2 = 0;
        int stackOut_216_3 = 0;
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
              int fieldTemp$20 = km.field_i - 1;
              km.field_i = km.field_i - 1;
              if (fieldTemp$20 != 0) {
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
              stackOut_11_0 = 0;
              stackIn_12_0 = stackOut_11_0;
              break L2;
            } else {
              stackOut_10_0 = 1;
              stackIn_12_0 = stackOut_10_0;
              break L2;
            }
          }
          L3: {
            L4: {
              var4 = stackIn_12_0;
              stackOut_12_0 = var4;
              stackIn_16_0 = stackOut_12_0;
              stackIn_13_0 = stackOut_12_0;
              if (((qj) this).field_p) {
                break L4;
              } else {
                stackOut_13_0 = stackIn_13_0;
                stackIn_16_0 = stackOut_13_0;
                stackIn_14_0 = stackOut_13_0;
                if (((qj) this).field_w.field_k != 2) {
                  break L4;
                } else {
                  stackOut_14_0 = stackIn_14_0;
                  stackIn_16_0 = stackOut_14_0;
                  stackIn_15_0 = stackOut_14_0;
                  if (-1 == ((qj) this).field_w.field_l[-((qj) this).field_m + 1].field_M) {
                    break L4;
                  } else {
                    stackOut_15_0 = stackIn_15_0;
                    stackOut_15_1 = 1;
                    stackIn_17_0 = stackOut_15_0;
                    stackIn_17_1 = stackOut_15_1;
                    break L3;
                  }
                }
              }
            }
            stackOut_16_0 = stackIn_16_0;
            stackOut_16_1 = 0;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            break L3;
          }
          L5: {
            L6: {
              var4 = stackIn_17_0 | stackIn_17_1;
              if (1 != ((qj) this).field_w.field_k) {
                break L6;
              } else {
                if (((qj) this).field_w.field_l[0].field_Z == 5) {
                  int discarded$21 = 1;
                  int discarded$22 = 1;
                  int discarded$23 = 1;
                  ji.a(25459, true, c.field_j);
                  break L5;
                } else {
                  break L6;
                }
              }
            }
            if (!((qj) this).field_w.field_c) {
              if (var4 != 0) {
                int discarded$24 = 1;
                int discarded$25 = 1;
                int discarded$26 = 1;
                ji.a(25459, true, uk.field_t);
                break L5;
              } else {
                L7: {
                  if (oa.field_Sb == null) {
                    break L7;
                  } else {
                    if (!oa.field_Sb.field_q) {
                      break L7;
                    } else {
                      int discarded$27 = 1;
                      wj.a(1, true, oa.field_Sb.c(-109), false, 1, oa.field_Sb.field_n);
                      break L5;
                    }
                  }
                }
                int discarded$28 = 1;
                int discarded$29 = 1;
                int discarded$30 = 1;
                ji.a(25459, true, cd.field_g);
                break L5;
              }
            } else {
              int discarded$31 = 1;
              int discarded$32 = 1;
              int discarded$33 = 1;
              ji.a(25459, true, oj.field_q);
              break L5;
            }
          }
          L8: {
            if (!((qj) this).field_w.field_c) {
              break L8;
            } else {
              if (((qj) this).field_w.field_k <= 1) {
                break L8;
              } else {
                int fieldTemp$34 = be.field_j + 1;
                be.field_j = be.field_j + 1;
                if (fieldTemp$34 != 300) {
                  break L8;
                } else {
                  L9: {
                    if (!m.field_a) {
                      break L9;
                    } else {
                      int fieldTemp$35 = ml.field_f + 1;
                      ml.field_f = ml.field_f + 1;
                      System.out.println("Concluded " + fieldTemp$35 + " games (" + cf.field_a + " errors)");
                      if ((1 << ((qj) this).field_k & ((qj) this).field_w.field_j) != 0) {
                        break L9;
                      } else {
                        ((qj) this).f(87);
                        break L9;
                      }
                    }
                  }
                  int discarded$36 = -97;
                  po.a();
                  if (!((qj) this).field_p) {
                    ng.a(false, 62, 20);
                    cc.field_G = true;
                    break L8;
                  } else {
                    if (op.field_a) {
                      L10: {
                        if (null == hd.field_d) {
                          break L10;
                        } else {
                          if (hd.field_d.field_a == -2) {
                            break L8;
                          } else {
                            break L10;
                          }
                        }
                      }
                      ng.a(false, 101, 19);
                      break L8;
                    } else {
                      int discarded$37 = 122;
                      da.f();
                      break L8;
                    }
                  }
                }
              }
            }
          }
          L11: {
            if (param2 < -52) {
              break L11;
            } else {
              ((qj) this).field_w = null;
              break L11;
            }
          }
          L12: {
            var5 = oo.field_w.a(-37880252, 10);
            var6_int = oo.field_w.a(-37880252, 3);
            if (var5 == 0) {
              od.field_c = od.field_c + 1;
              fp.field_z = fp.field_z + og.field_Wb;
              break L12;
            } else {
              break L12;
            }
          }
          L13: {
            if (var5 == 1) {
              od.field_c = od.field_c - 2;
              fp.field_z = fp.field_z - 2 * og.field_Wb;
              break L13;
            } else {
              break L13;
            }
          }
          L14: {
            if (var5 != 2) {
              break L14;
            } else {
              fp.field_z = fp.field_z + 2 * od.field_c;
              og.field_Wb = og.field_Wb + 2;
              break L14;
            }
          }
          L15: {
            if (var5 != 3) {
              break L15;
            } else {
              og.field_Wb = og.field_Wb - 1;
              fp.field_z = fp.field_z - od.field_c;
              break L15;
            }
          }
          L16: {
            if (var5 != 4) {
              break L16;
            } else {
              od.field_c = od.field_c + 1;
              ep.field_i = ep.field_i + og.field_Wb;
              break L16;
            }
          }
          L17: {
            if (var5 != 5) {
              break L17;
            } else {
              ep.field_i = ep.field_i - og.field_Wb * 2;
              od.field_c = od.field_c - 2;
              break L17;
            }
          }
          L18: {
            if (6 != var5) {
              break L18;
            } else {
              ep.field_i = ep.field_i + og.field_Wb;
              od.field_c = od.field_c + 1;
              break L18;
            }
          }
          L19: {
            if (var5 == 7) {
              ep.field_i = ep.field_i - od.field_c * 2;
              og.field_Wb = og.field_Wb - 2;
              break L19;
            } else {
              break L19;
            }
          }
          L20: {
            if (var5 != 8) {
              break L20;
            } else {
              fp.field_z = fp.field_z + var6_int;
              fp.field_z = fp.field_z - var6_int;
              break L20;
            }
          }
          L21: {
            if (var5 != 9) {
              break L21;
            } else {
              ep.field_i = ep.field_i + var6_int;
              fp.field_z = fp.field_z - var6_int;
              break L21;
            }
          }
          L22: {
            var5 = oo.field_w.a(-37880252, 5);
            if (var5 != 0) {
              break L22;
            } else {
              hg.field_e = hg.field_e ^ tm.field_g + qm.field_a << 16;
              break L22;
            }
          }
          L23: {
            if (var5 != 1) {
              break L23;
            } else {
              ek.field_kb = ek.field_kb - tm.field_g;
              qm.field_a = qm.field_a - 1;
              break L23;
            }
          }
          L24: {
            if (var5 != 2) {
              break L24;
            } else {
              ek.field_kb = ek.field_kb + tm.field_g;
              qm.field_a = qm.field_a + 1;
              break L24;
            }
          }
          L25: {
            if (var5 == 3) {
              ek.field_kb = ek.field_kb - qm.field_a;
              tm.field_g = tm.field_g - 1;
              break L25;
            } else {
              break L25;
            }
          }
          L26: {
            if (var5 != 4) {
              break L26;
            } else {
              ek.field_kb = ek.field_kb + qm.field_a;
              tm.field_g = tm.field_g + 1;
              break L26;
            }
          }
          L27: {
            if (((qj) this).field_p) {
              var5 = 0;
              L28: while (true) {
                if (~((qj) this).field_w.field_k >= ~var5) {
                  break L27;
                } else {
                  L29: {
                    if ((((qj) this).field_o & 1 << var5) != 0) {
                      var15 = ((qj) this).field_w.field_l[var5];
                      var6 = var15;
                      var6 = var15;
                      var6 = var15;
                      var6.field_vb[var15.field_F % 5] = 0;
                      break L29;
                    } else {
                      break L29;
                    }
                  }
                  var5++;
                  continue L28;
                }
              }
            } else {
              break L27;
            }
          }
          L30: {
            if (!param1) {
              break L30;
            } else {
              int discarded$38 = -1;
              this.a();
              break L30;
            }
          }
          var5 = 0;
          L31: while (true) {
            if (var5 >= ((qj) this).field_w.field_k) {
              L32: {
                var5 = 0;
                var6_ref = new vl();
                var7 = new vl();
                if (!r.field_A) {
                  L33: {
                    if (!this.a(var7, true, var6_ref)) {
                      stackOut_114_0 = 0;
                      stackIn_115_0 = stackOut_114_0;
                      break L33;
                    } else {
                      stackOut_113_0 = 1;
                      stackIn_115_0 = stackOut_113_0;
                      break L33;
                    }
                  }
                  var5 = stackIn_115_0;
                  break L32;
                } else {
                  if (km.field_i != 0) {
                    break L32;
                  } else {
                    L34: {
                      od.a((byte) 32);
                      var8_ref_j = ((qj) this).field_w.field_l[0];
                      if (2 != var8_ref_j.field_Z) {
                        break L34;
                      } else {
                        jc.a(var8_ref_j.field_db, 0, (byte) -85);
                        break L34;
                      }
                    }
                    L35: {
                      L36: {
                        if (var8_ref_j.field_Z == 0) {
                          break L36;
                        } else {
                          if (ka.a((byte) 62)) {
                            break L35;
                          } else {
                            break L36;
                          }
                        }
                      }
                      L37: {
                        if (!this.a(var7, true, var6_ref)) {
                          stackOut_109_0 = 0;
                          stackIn_110_0 = stackOut_109_0;
                          break L37;
                        } else {
                          stackOut_108_0 = 1;
                          stackIn_110_0 = stackOut_108_0;
                          break L37;
                        }
                      }
                      var5 = stackIn_110_0;
                      break L35;
                    }
                    break L32;
                  }
                }
              }
              L38: {
                bm.a(96, 96, false, -30791, var6_ref);
                bm.a(48, 48, true, -30791, var7);
                if (((qj) this).field_w.field_k != 1) {
                  break L38;
                } else {
                  L39: {
                    var8_ref_j = ((qj) this).field_w.field_l[0];
                    if (var8_ref_j.field_qb > ((qj) this).field_i) {
                      L40: {
                        var9_long = ue.a(false);
                        int discarded$39 = 1000;
                        this.a(gq.field_Yb, ((qj) this).field_i, var9_long + -fl.field_l, true);
                        fl.field_l = var9_long;
                        ((qj) this).field_i = var8_ref_j.field_qb;
                        this.a(((qj) this).field_w.field_b.field_b, var8_ref_j.field_ob, (byte) -125, var8_ref_j.field_qb);
                        if (((qj) this).field_i != 1) {
                          break L40;
                        } else {
                          if (0 == ((qj) this).field_w.field_b.field_b.field_h) {
                            var11 = var8_ref_j;
                            var8_ref_j.field_Q = 0;
                            var11.field_m = 0;
                            var8_ref_j.field_u = 0;
                            var12 = var8_ref_j;
                            var12.field_N = 0;
                            var13 = (vn) (Object) var8_ref_j.field_gb.d(-66);
                            L41: while (true) {
                              if (var13 == null) {
                                break L40;
                              } else {
                                var13.field_I = 0;
                                var13 = (vn) (Object) var8_ref_j.field_gb.a((byte) 116);
                                continue L41;
                              }
                            }
                          } else {
                            break L40;
                          }
                        }
                      }
                      L42: {
                        L43: {
                          if (((qj) this).field_i > 1) {
                            break L43;
                          } else {
                            if (((qj) this).field_w.field_b.field_b.field_h != 1) {
                              break L42;
                            } else {
                              break L43;
                            }
                          }
                        }
                        if (lc.a(0, -119)) {
                          if (!(oa.field_Sb instanceof dp)) {
                            break L42;
                          } else {
                            this.a(false, 239, 16);
                            break L42;
                          }
                        } else {
                          break L42;
                        }
                      }
                      if (~((qj) this).field_i <= ~((qj) this).field_w.field_b.a(95)) {
                        break L39;
                      } else {
                        w.field_r = lg.a(2, ((qj) this).field_w.field_b.a(((qj) this).field_i, (byte) -122), -1);
                        break L39;
                      }
                    } else {
                      break L39;
                    }
                  }
                  L44: {
                    if (var8_ref_j.field_tb) {
                      var9_int = (33423360 - 2 * (var8_ref_j.field_yb.field_j - -(var8_ref_j.field_yb.field_u / 2) << 8)) / 510;
                      nk.field_c.g();
                      oa.field_Sb.a(true, var9_int, 0, 0, 0);
                      kc.field_q.a((byte) 78);
                      ih.field_k = oa.field_Sb.c((byte) -116);
                      fq.field_c = oa.field_Sb.b(-102);
                      oa.field_Sb = rd.a(var8_ref_j.field_ab.field_p, (byte) 19);
                      km.field_i = 32;
                      var8_ref_j.field_tb = false;
                      pe.field_n = var8_ref_j.field_ab.field_p;
                      break L44;
                    } else {
                      break L44;
                    }
                  }
                  L45: {
                    L46: {
                      if (var8_ref_j.field_qb > 0) {
                        break L46;
                      } else {
                        if (((qj) this).field_w.field_b.field_b.field_h != 0) {
                          break L46;
                        } else {
                          break L45;
                        }
                      }
                    }
                    L47: {
                      if (dp.field_r[0] <= var8_ref_j.field_m) {
                        this.b(0, -64, 255);
                        break L47;
                      } else {
                        break L47;
                      }
                    }
                    L48: {
                      if (~var8_ref_j.field_m > ~dp.field_r[1]) {
                        break L48;
                      } else {
                        this.b(1, 119, 254);
                        break L48;
                      }
                    }
                    L49: {
                      if (~var8_ref_j.field_m > ~dp.field_r[2]) {
                        break L49;
                      } else {
                        this.b(2, -42, 253);
                        break L49;
                      }
                    }
                    L50: {
                      if (dp.field_r[39] <= var8_ref_j.field_m) {
                        this.b(39, 109, 216);
                        break L50;
                      } else {
                        break L50;
                      }
                    }
                    L51: {
                      if (var8_ref_j.field_qb + -((qj) this).field_t < dp.field_r[3]) {
                        break L51;
                      } else {
                        this.a(false, 252, 3);
                        break L51;
                      }
                    }
                    L52: {
                      if (var8_ref_j.field_qb - ((qj) this).field_t < dp.field_r[4]) {
                        break L52;
                      } else {
                        this.a(false, 251, 4);
                        break L52;
                      }
                    }
                    L53: {
                      if (~var8_ref_j.field_qb <= ~(dp.field_r[5] - 1)) {
                        this.a(250, 67, 5);
                        break L53;
                      } else {
                        break L53;
                      }
                    }
                    L54: {
                      if (-1 + dp.field_r[6] > var8_ref_j.field_qb) {
                        break L54;
                      } else {
                        if (var8_ref_j.field_Z != 5) {
                          break L54;
                        } else {
                          this.a(249, 67, 6);
                          break L54;
                        }
                      }
                    }
                    L55: {
                      if (dp.field_r[7] <= var8_ref_j.field_ob) {
                        this.a((byte) 68, 7, 248);
                        break L55;
                      } else {
                        break L55;
                      }
                    }
                    L56: {
                      if (dp.field_r[8] <= var8_ref_j.field_ob) {
                        this.a((byte) 97, 8, 247);
                        break L56;
                      } else {
                        break L56;
                      }
                    }
                    L57: {
                      if (~var8_ref_j.field_ob <= ~dp.field_r[40]) {
                        this.a((byte) 39, 40, 215);
                        break L57;
                      } else {
                        break L57;
                      }
                    }
                    var9_ref = (vn) (Object) var8_ref_j.field_gb.d(-119);
                    L58: while (true) {
                      L59: {
                        if (var9_ref == null) {
                          break L59;
                        } else {
                          L60: {
                            if (~dp.field_r[9] >= ~var9_ref.field_I) {
                              this.b(9, 106, 246);
                              break L60;
                            } else {
                              break L60;
                            }
                          }
                          if (var9_ref.field_I < dp.field_r[10]) {
                            var9_ref = (vn) (Object) var8_ref_j.field_gb.a((byte) 116);
                            continue L58;
                          } else {
                            this.b(10, -52, 245);
                            break L59;
                          }
                        }
                      }
                      L61: {
                        if (dp.field_r[22] > var8_ref_j.field_l) {
                          break L61;
                        } else {
                          this.b(22, -65, 233);
                          break L61;
                        }
                      }
                      L62: {
                        if (~var8_ref_j.field_hb > ~dp.field_r[29]) {
                          break L62;
                        } else {
                          this.b(29, 114, 226);
                          break L62;
                        }
                      }
                      L63: {
                        if (dp.field_r[30] > var8_ref_j.field_u) {
                          break L63;
                        } else {
                          this.b(30, -118, 225);
                          break L63;
                        }
                      }
                      L64: {
                        if (dp.field_r[31] > var8_ref_j.field_u) {
                          break L64;
                        } else {
                          this.b(31, -33, 224);
                          break L64;
                        }
                      }
                      L65: {
                        if (var8_ref_j.field_N < dp.field_r[32]) {
                          break L65;
                        } else {
                          this.b(32, -94, 223);
                          break L65;
                        }
                      }
                      L66: {
                        if (var8_ref_j.field_N < dp.field_r[33]) {
                          break L66;
                        } else {
                          this.b(33, 112, 222);
                          break L66;
                        }
                      }
                      L67: {
                        if (var8_ref_j.field_t >= dp.field_r[19]) {
                          this.b(19, 85, 236);
                          break L67;
                        } else {
                          break L67;
                        }
                      }
                      L68: {
                        if (~var8_ref_j.field_t > ~dp.field_r[20]) {
                          break L68;
                        } else {
                          this.b(20, -128, 235);
                          break L68;
                        }
                      }
                      if (~var8_ref_j.field_t <= ~dp.field_r[21]) {
                        this.b(21, 109, 234);
                        break L45;
                      } else {
                        break L45;
                      }
                    }
                  }
                  L69: {
                    if (dj.field_b != var8_ref_j.field_ob) {
                      dj.field_b = var8_ref_j.field_ob;
                      vd.field_d = Integer.toString(dj.field_b);
                      break L69;
                    } else {
                      break L69;
                    }
                  }
                  if (pg.field_m != 1 + pp.a(var8_ref_j, (byte) 59, ((qj) this).field_w)) {
                    L70: {
                      pg.field_m = pp.a(var8_ref_j, (byte) -100, ((qj) this).field_w) + 1;
                      if (pg.field_m < 10) {
                        stackOut_204_0 = "0" + pg.field_m;
                        stackIn_205_0 = stackOut_204_0;
                        break L70;
                      } else {
                        stackOut_203_0 = Integer.toString(pg.field_m);
                        stackIn_205_0 = stackOut_203_0;
                        break L70;
                      }
                    }
                    lq.field_e = stackIn_205_0;
                    break L38;
                  } else {
                    break L38;
                  }
                }
              }
              L71: {
                if (!((qj) this).field_p) {
                  break L71;
                } else {
                  if (((qj) this).field_o != 0) {
                    var8 = 0;
                    L72: while (true) {
                      if (~var8 <= ~((qj) this).field_w.field_k) {
                        break L71;
                      } else {
                        L73: {
                          if ((((qj) this).field_o & 1 << var8) == 0) {
                            break L73;
                          } else {
                            if (((((qj) this).field_w.field_i | (((qj) this).field_w.field_a | ((qj) this).field_w.field_g)) & 1 << var8) != 0) {
                              break L73;
                            } else {
                              var9 = ((qj) this).field_w.field_l[var8];
                              if (var5 == 0) {
                                break L73;
                              } else {
                                if (0 != var9.field_F % 5) {
                                  break L73;
                                } else {
                                  L74: {
                                    stackOut_215_0 = this;
                                    stackOut_215_1 = 120;
                                    stackOut_215_2 = var8;
                                    stackIn_217_0 = stackOut_215_0;
                                    stackIn_217_1 = stackOut_215_1;
                                    stackIn_217_2 = stackOut_215_2;
                                    stackIn_216_0 = stackOut_215_0;
                                    stackIn_216_1 = stackOut_215_1;
                                    stackIn_216_2 = stackOut_215_2;
                                    if (var9.field_F % 5 != 0) {
                                      stackOut_217_0 = this;
                                      stackOut_217_1 = stackIn_217_1;
                                      stackOut_217_2 = stackIn_217_2;
                                      stackOut_217_3 = 0;
                                      stackIn_218_0 = stackOut_217_0;
                                      stackIn_218_1 = stackOut_217_1;
                                      stackIn_218_2 = stackOut_217_2;
                                      stackIn_218_3 = stackOut_217_3;
                                      break L74;
                                    } else {
                                      stackOut_216_0 = this;
                                      stackOut_216_1 = stackIn_216_1;
                                      stackOut_216_2 = stackIn_216_2;
                                      stackOut_216_3 = 1;
                                      stackIn_218_0 = stackOut_216_0;
                                      stackIn_218_1 = stackOut_216_1;
                                      stackIn_218_2 = stackOut_216_2;
                                      stackIn_218_3 = stackOut_216_3;
                                      break L74;
                                    }
                                  }
                                  this.a((byte) stackIn_218_1, stackIn_218_2, stackIn_218_3 != 0);
                                  break L73;
                                }
                              }
                            }
                          }
                        }
                        var8++;
                        continue L72;
                      }
                    }
                  } else {
                    break L71;
                  }
                }
              }
              return;
            } else {
              L75: {
                if ((((qj) this).field_o & 1 << var5) != 0) {
                  L76: {
                    var6 = ((qj) this).field_w.field_l[var5];
                    if (param1) {
                      this.a((byte) 73, var6);
                      break L76;
                    } else {
                      var6.field_db = 0;
                      break L76;
                    }
                  }
                  if (((qj) this).field_p) {
                    var6.field_vb[var6.field_F % 5] = var6.field_db;
                    break L75;
                  } else {
                    break L75;
                  }
                } else {
                  break L75;
                }
              }
              var5++;
              continue L31;
            }
          }
        } else {
          return;
        }
    }

    final boolean c(int param0) {
        if (param0 < 93) {
            ((qj) this).a(false, (byte) -87);
        }
        return ((qj) this).field_k == -2 ? true : false;
    }

    private final void e() {
        if (((qj) this).field_s) {
            return;
        }
        if (null == fj.field_Ub) {
            if (!(0 >= ((qj) this).field_w.field_l[0].field_ob)) {
                fj.field_Ub = new sp(((qj) this).field_w.field_b.field_b.field_d, 65535 ^ ((qj) this).field_w.field_b.field_b.field_d, fp.field_z, ep.field_i, od.field_c, og.field_Wb, new int[2]);
                if (!og.h(-26090)) {
                    bd.a(3, (byte) 25, fj.field_Ub);
                }
            }
        }
    }

    final void a(byte param0, boolean param1) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (!((qj) this).field_p) {
            L1: {
              if (1 == ((qj) this).field_w.field_k) {
                if (((qj) this).field_s) {
                  break L1;
                } else {
                  L2: {
                    this.a(pp.a(((qj) this).field_w.field_l[0], (byte) 115, ((qj) this).field_w), false);
                    int discarded$15 = 0;
                    this.e();
                    int discarded$16 = 1000;
                    this.a(gq.field_Yb, ((qj) this).field_r, -fl.field_l + ue.a(false), false);
                    int discarded$17 = 1;
                    jj.field_d = jj.field_d | ja.a(((qj) this).field_t, ((qj) this).field_w.field_b, -1 + ((qj) this).field_r);
                    if (hh.field_b[0] != 0) {
                      stackOut_7_0 = 0;
                      stackIn_8_0 = stackOut_7_0;
                      break L2;
                    } else {
                      stackOut_6_0 = 1;
                      stackIn_8_0 = stackOut_6_0;
                      break L2;
                    }
                  }
                  be.field_a = stackIn_8_0 != 0;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L3: {
              if (((qj) this).field_w.field_k != 1) {
                break L3;
              } else {
                if (((qj) this).field_w.field_l[0].field_Z == 8) {
                  ng.a(param1, 107, 18);
                  int discarded$18 = 1;
                  int discarded$19 = 1;
                  int discarded$20 = 1;
                  ji.a(25459, true, cd.field_g);
                  break L0;
                } else {
                  break L3;
                }
              }
            }
            ((qj) this).a(param1, (byte) 69);
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 == 40) {
          pe.field_n = si.field_k.field_m;
          return;
        } else {
          return;
        }
    }

    final void a(boolean param0, byte param1) {
        int var4 = 0;
        L0: {
          L1: {
            var4 = BrickABrac.field_J ? 1 : 0;
            rj.a((byte) 80, to.field_k);
            rj.a((byte) 80, me.field_d);
            if (((qj) this).field_w.field_k > 1) {
              break L1;
            } else {
              if (9 == ((qj) this).field_w.field_l[0].field_Z) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          int discarded$34 = 1;
          int discarded$35 = 1;
          int discarded$36 = 1;
          ji.a(25459, true, cd.field_g);
          break L0;
        }
        if (!((qj) this).field_p) {
          if (param1 == 69) {
            L2: {
              if (og.h(-26090)) {
                L3: {
                  int discarded$37 = -1;
                  if (ib.a(pl.field_b)) {
                    break L3;
                  } else {
                    if (fj.field_Ub != null) {
                      break L3;
                    } else {
                      ng.a(param0, 121, 0);
                      break L2;
                    }
                  }
                }
                ng.a(param0, 68, 10);
                break L2;
              } else {
                int discarded$38 = -1;
                if (!ib.a(pl.field_b)) {
                  if (fj.field_Ub != null) {
                    ng.a(param0, 68, 5);
                    break L2;
                  } else {
                    ng.a(param0, 100, 0);
                    break L2;
                  }
                } else {
                  ng.a(param0, 60, 9);
                  break L2;
                }
              }
            }
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final void a(byte param0, pi param1, boolean param2) {
        RuntimeException var4 = null;
        int var4_int = 0;
        p var5 = null;
        int var6_int = 0;
        j var6 = null;
        int var7 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
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
                if (var6_int >= 5) {
                  L2: {
                    if (param0 == -15) {
                      break L2;
                    } else {
                      this.b(-25, 35, 50);
                      break L2;
                    }
                  }
                  L3: {
                    param1.f((byte) 100);
                    if (!param2) {
                      break L3;
                    } else {
                      var5.field_m = param1.e(255);
                      var5.field_l = true;
                      break L3;
                    }
                  }
                  var6 = ((qj) this).field_w.field_l[var4_int];
                  var6.field_E = var6.field_E + 5;
                  var6.field_q = var6.field_q + 5;
                  var6.field_eb.a((nm) (Object) var5, (byte) 3);
                  break L0;
                } else {
                  var5.field_n[var6_int] = param1.c(3, (byte) 117);
                  var6_int++;
                  continue L1;
                }
              }
            } else {
              rk.a("K1: (" + var4_int + "/" + param1.field_l + ") " + eq.c((byte) -110), (Throwable) null, param0 + 125);
              hn.a((byte) 89);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("qj.B(").append(param0).append(44);
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
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param2 + 41);
        }
    }

    final void a(int param0, pi param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
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
            var3 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3;
            stackOut_3_1 = new StringBuilder().append("qj.CA(").append(param0).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    private final void a(byte param0, int param1, boolean param2) {
        int var6 = 0;
        int var7 = BrickABrac.field_J ? 1 : 0;
        int var4 = 0;
        k.field_h.e(-13413, !param2 ? 68 : 69);
        k.field_h.p(62);
        j var5 = ((qj) this).field_w.field_l[param1];
        for (var6 = 0; var6 < 5; var6++) {
            k.field_h.a(3, -17566, var5.field_vb[var6]);
        }
        k.field_h.q(-105);
        if (!(!param2)) {
            k.field_h.a(var5.a(true, (StringBuilder) null) ^ var5.e(122), (byte) -79);
        }
    }

    final boolean a(char param0, int param1, int param2) {
        int var4_int = 0;
        j var4 = null;
        int var5 = 0;
        vn var5_ref_vn = null;
        int var6 = 0;
        j var7 = null;
        int stackIn_151_0 = 0;
        int stackOut_150_0 = 0;
        int stackOut_149_0 = 0;
        L0: {
          var6 = BrickABrac.field_J ? 1 : 0;
          var4_int = oo.field_w.a(-37880252, 10);
          var5 = oo.field_w.a(-37880252, 5);
          if (var4_int != 0) {
            break L0;
          } else {
            fp.field_z = fp.field_z + og.field_Wb;
            od.field_c = od.field_c + 1;
            break L0;
          }
        }
        L1: {
          if (var4_int == 1) {
            fp.field_z = fp.field_z - og.field_Wb * 2;
            od.field_c = od.field_c - 2;
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (var4_int == 2) {
            og.field_Wb = og.field_Wb + 2;
            fp.field_z = fp.field_z + od.field_c * 2;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (var4_int != 3) {
            break L3;
          } else {
            og.field_Wb = og.field_Wb - 1;
            fp.field_z = fp.field_z - od.field_c;
            break L3;
          }
        }
        L4: {
          if (4 == var4_int) {
            od.field_c = od.field_c + 1;
            ep.field_i = ep.field_i + og.field_Wb;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if (var4_int == 5) {
            od.field_c = od.field_c - 2;
            ep.field_i = ep.field_i - 2 * og.field_Wb;
            break L5;
          } else {
            break L5;
          }
        }
        if (param1 > 98) {
          L6: {
            if (6 != var4_int) {
              break L6;
            } else {
              ep.field_i = ep.field_i + og.field_Wb;
              od.field_c = od.field_c + 1;
              break L6;
            }
          }
          L7: {
            if (var4_int == 7) {
              og.field_Wb = og.field_Wb - 2;
              ep.field_i = ep.field_i - od.field_c * 2;
              break L7;
            } else {
              break L7;
            }
          }
          L8: {
            if (8 == var4_int) {
              fp.field_z = fp.field_z + var5;
              fp.field_z = fp.field_z - var5;
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            if (var4_int == 9) {
              ep.field_i = ep.field_i + var5;
              fp.field_z = fp.field_z - var5;
              break L9;
            } else {
              break L9;
            }
          }
          L10: {
            var4_int = oo.field_w.a(-37880252, 5);
            if (var4_int == 0) {
              hg.field_e = hg.field_e ^ tm.field_g + qm.field_a << 16;
              break L10;
            } else {
              break L10;
            }
          }
          L11: {
            if (var4_int != 1) {
              break L11;
            } else {
              ek.field_kb = ek.field_kb - tm.field_g;
              qm.field_a = qm.field_a - 1;
              break L11;
            }
          }
          L12: {
            if (var4_int != 2) {
              break L12;
            } else {
              qm.field_a = qm.field_a + 1;
              ek.field_kb = ek.field_kb + tm.field_g;
              break L12;
            }
          }
          L13: {
            if (var4_int != 3) {
              break L13;
            } else {
              tm.field_g = tm.field_g - 1;
              ek.field_kb = ek.field_kb - qm.field_a;
              break L13;
            }
          }
          L14: {
            if (var4_int != 4) {
              break L14;
            } else {
              tm.field_g = tm.field_g + 1;
              ek.field_kb = ek.field_kb + qm.field_a;
              break L14;
            }
          }
          if (param2 != 13) {
            L15: {
              if (((qj) this).field_w.field_k != 1) {
                break L15;
              } else {
                if (!r.field_A) {
                  break L15;
                } else {
                  if (ka.a((byte) 113)) {
                    L16: {
                      if (84 == param2) {
                        im.b(-8);
                        break L16;
                      } else {
                        break L16;
                      }
                    }
                    return true;
                  } else {
                    break L15;
                  }
                }
              }
            }
            L17: {
              if (1 != ((qj) this).field_w.field_k) {
                break L17;
              } else {
                if (!((qj) this).field_y) {
                  break L17;
                } else {
                  var7 = ((qj) this).field_w.field_l[0];
                  var4 = var7;
                  if (48 == param2) {
                    ((qj) this).field_s = true;
                    var7.field_m = dp.field_r[0] + -5;
                    return true;
                  } else {
                    if (param2 == 68) {
                      var7.field_m = dp.field_r[1] - 5;
                      ((qj) this).field_s = true;
                      return true;
                    } else {
                      if (66 != param2) {
                        if (param2 == 50) {
                          ((qj) this).field_t = -dp.field_r[3] + (var4.field_qb + 1);
                          ((qj) this).field_s = true;
                          return true;
                        } else {
                          if (param2 == 34) {
                            ((qj) this).field_s = true;
                            ((qj) this).field_t = var7.field_qb + 1 + -dp.field_r[4];
                            return true;
                          } else {
                            if (51 == param2) {
                              var7.field_ob = dp.field_r[7] + -20;
                              ((qj) this).field_s = true;
                              return true;
                            } else {
                              L18: {
                                if (param2 != 52) {
                                  break L18;
                                } else {
                                  ((qj) this).field_s = true;
                                  var7.field_ob = -20 + dp.field_r[8];
                                  break L18;
                                }
                              }
                              if (param2 != 53) {
                                if (param2 == 39) {
                                  var5_ref_vn = (vn) (Object) var4.field_gb.d(-114);
                                  L19: while (true) {
                                    if (var5_ref_vn == null) {
                                      ((qj) this).field_s = true;
                                      return true;
                                    } else {
                                      var5_ref_vn.field_I = dp.field_r[10] - 2;
                                      var5_ref_vn = (vn) (Object) var4.field_gb.a((byte) 116);
                                      continue L19;
                                    }
                                  }
                                } else {
                                  if (param2 != 54) {
                                    if (param2 == 55) {
                                      var5 = 0;
                                      L20: while (true) {
                                        if (29 <= var5) {
                                          ((qj) this).field_s = true;
                                          return true;
                                        } else {
                                          L21: {
                                            if (to.field_f[var5] > -1) {
                                              var7.field_o[var5] = (byte)(-1 + to.field_f[var5]);
                                              break L21;
                                            } else {
                                              break L21;
                                            }
                                          }
                                          var5++;
                                          continue L20;
                                        }
                                      }
                                    } else {
                                      if (param2 == 56) {
                                        var4.field_rb = 5;
                                        ((qj) this).field_s = true;
                                        return true;
                                      } else {
                                        L22: {
                                          if (param2 < 16) {
                                            break L22;
                                          } else {
                                            if (25 < param2) {
                                              break L22;
                                            } else {
                                              L23: {
                                                var5 = -16 - (-param2 - 1);
                                                ((qj) this).field_s = true;
                                                if (!pe.field_l[81]) {
                                                  break L23;
                                                } else {
                                                  var5 += 10;
                                                  break L23;
                                                }
                                              }
                                              if (var5 <= 11) {
                                                oa.field_Sb = rd.a(var5, (byte) 19);
                                                return true;
                                              } else {
                                                break L22;
                                              }
                                            }
                                          }
                                        }
                                        if (70 != param2) {
                                          if (param2 != 69) {
                                            if (param2 == 40) {
                                              var7.field_u = -1 + dp.field_r[30];
                                              ((qj) this).field_s = true;
                                              return true;
                                            } else {
                                              if (41 != param2) {
                                                if (param2 != 32) {
                                                  if (param2 != 35) {
                                                    if (49 != param2) {
                                                      if (param2 == 36) {
                                                        ((qj) this).field_s = true;
                                                        var7.field_ob = dp.field_r[40] + -20;
                                                        return true;
                                                      } else {
                                                        if (38 != param2) {
                                                          break L17;
                                                        } else {
                                                          var4.field_Z = 0;
                                                          ((qj) this).field_s = true;
                                                          var4.field_P = 0;
                                                          return true;
                                                        }
                                                      }
                                                    } else {
                                                      ((qj) this).field_s = true;
                                                      var7.field_m = dp.field_r[39] + -5;
                                                      return true;
                                                    }
                                                  } else {
                                                    var7.field_N = -1 + dp.field_r[33];
                                                    ((qj) this).field_s = true;
                                                    return true;
                                                  }
                                                } else {
                                                  var7.field_N = dp.field_r[32] + -1;
                                                  ((qj) this).field_s = true;
                                                  return true;
                                                }
                                              } else {
                                                var7.field_u = dp.field_r[31] - 1;
                                                ((qj) this).field_s = true;
                                                return true;
                                              }
                                            }
                                          } else {
                                            ((qj) this).field_s = true;
                                            var7.field_hb = -1 + dp.field_r[29];
                                            return true;
                                          }
                                        } else {
                                          var4.field_l = 6;
                                          ((qj) this).field_s = true;
                                          return true;
                                        }
                                      }
                                    }
                                  } else {
                                    L24: {
                                      int fieldTemp$1 = var4.field_qb + 1;
                                      var4.field_qb = var4.field_qb + 1;
                                      if (tk.field_q > fieldTemp$1) {
                                        var4.field_Z = 0;
                                        break L24;
                                      } else {
                                        var4.field_Z = 5;
                                        break L24;
                                      }
                                    }
                                    ((qj) this).field_s = true;
                                    var4.field_P = 0;
                                    return true;
                                  }
                                }
                              } else {
                                var5_ref_vn = (vn) (Object) var4.field_gb.d(-19);
                                L25: while (true) {
                                  if (var5_ref_vn == null) {
                                    ((qj) this).field_s = true;
                                    return true;
                                  } else {
                                    var5_ref_vn.field_I = dp.field_r[9] + -2;
                                    var5_ref_vn = (vn) (Object) var4.field_gb.a((byte) 116);
                                    continue L25;
                                  }
                                }
                              }
                            }
                          }
                        }
                      } else {
                        var7.field_m = -5 + dp.field_r[2];
                        ((qj) this).field_s = true;
                        return true;
                      }
                    }
                  }
                }
              }
            }
            L26: {
              if (pf.field_p) {
                stackOut_150_0 = 0;
                stackIn_151_0 = stackOut_150_0;
                break L26;
              } else {
                stackOut_149_0 = 1;
                stackIn_151_0 = stackOut_149_0;
                break L26;
              }
            }
            return stackIn_151_0 != 0;
          } else {
            L27: {
              var4_int = 1;
              if (((qj) this).field_p) {
                if (((qj) this).c(113)) {
                  var4_int = 4;
                  break L27;
                } else {
                  L28: {
                    if (((qj) this).field_w.field_c) {
                      break L28;
                    } else {
                      if (((((qj) this).field_w.field_a | (((qj) this).field_w.field_i | ((qj) this).field_w.field_g)) & 1 << ((qj) this).field_k) != 0) {
                        break L28;
                      } else {
                        var4_int = 2;
                        break L27;
                      }
                    }
                  }
                  var4_int = 3;
                  break L27;
                }
              } else {
                if (((qj) this).field_w.field_k == 1) {
                  L29: {
                    var5 = ((qj) this).field_w.field_l[0].field_Z;
                    if (5 == var5) {
                      break L29;
                    } else {
                      if (9 == var5) {
                        break L29;
                      } else {
                        if (var5 == 3) {
                          break L29;
                        } else {
                          if (var5 == 8) {
                            break L29;
                          } else {
                            break L27;
                          }
                        }
                      }
                    }
                  }
                  return true;
                } else {
                  if (((qj) this).field_w.field_k == 2) {
                    var4_int = 17;
                    break L27;
                  } else {
                    break L27;
                  }
                }
              }
            }
            L30: {
              L31: {
                if (((qj) this).field_w.field_k == 1) {
                  break L31;
                } else {
                  if (!((qj) this).field_w.field_c) {
                    break L31;
                  } else {
                    if (200 >= be.field_j) {
                      break L30;
                    } else {
                      be.field_j = 299;
                      return true;
                    }
                  }
                }
              }
              ng.a(false, 64, var4_int);
              break L30;
            }
            return true;
          }
        } else {
          return false;
        }
    }

    private final void a(int param0, int param1, long param2, boolean param3) {
        int var7 = 0;
        if (!((qj) this).field_s) {
            if (!(!og.h(-26090))) {
                return;
            }
            param1 = param1 + param0 * 1000;
            var7 = param3 ? 1 : 0;
            hq.a(param1, var7, 532, ((int)param2 - -500) / 1000);
            return;
        }
    }

    final void b(int param0) {
        if (!((qj) this).field_p) {
            throw new IllegalStateException();
        }
        ((qj) this).field_w.field_i = ((qj) this).field_w.field_i | 1 << ((qj) this).field_k;
        int var2 = 116 % ((param0 - -55) / 62);
        k.field_h.e(-13413, 66);
    }

    private final void a(boolean param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        if (!(!this.a(param2, 1))) {
            return;
        }
        ((qj) this).field_q = true;
        if (!((qj) this).field_s) {
            var4 = ((qj) this).field_w.field_l[0].field_ob;
            var5 = ((qj) this).field_w.field_l[0].field_qb;
            fp.field_z = fp.field_z - (((qj) this).field_t + var4);
            ep.field_i = ep.field_i + (-((qj) this).field_t + var5);
            lp.field_wb.a((nm) (Object) new e(param2, param1, fp.field_z, ep.field_i, od.field_c, og.field_Wb), (byte) 3);
            fp.field_z = fp.field_z - (-((qj) this).field_t + var5);
            ep.field_i = ep.field_i + (((qj) this).field_t + var4);
        }
    }

    final void a(byte param0, int param1) {
        int var3 = 0;
        int var4 = BrickABrac.field_J ? 1 : 0;
        if (param0 != 119) {
            return;
        }
        for (var3 = 0; var3 < ((qj) this).field_w.field_l.length; var3++) {
            ((qj) this).field_w.field_l[var3].field_qb = param1;
        }
        if (((qj) this).field_w.field_k == 1) {
            ((qj) this).field_t = param1;
            ((qj) this).field_i = param1;
            var3 = param1;
            fp.field_z = fp.field_z + var3;
            w.field_r = lg.a(2, ((qj) this).field_w.field_b.a(((qj) this).field_i, (byte) -122), -1);
        }
    }

    final static void b(byte param0, boolean param1) {
        int var2 = 0;
        String[] var3 = new String[]{tb.field_cb == null ? we.field_c : tb.field_cb, pg.field_q};
        oi var4 = new oi(qh.field_b, kk.a(false, qh.field_b.field_i, hi.field_w), 3);
        r.field_A = false;
        oa.field_Sb = rd.a(0, (byte) 19);
        int discarded$0 = -12665;
        sk.a(var3, 0, var4, 2, param1);
    }

    final void a(pi param0, int param1) {
        int var3_int = 0;
        int var4 = BrickABrac.field_J ? 1 : 0;
        try {
            for (var3_int = param1; ((qj) this).field_w.field_k > var3_int; var3_int++) {
                byte dupTemp$0 = param0.b(true);
                ((qj) this).field_w.field_m[var3_int] = dupTemp$0;
                op.field_a = op.field_a | (0 <= dupTemp$0 ? true : false);
            }
            ((qj) this).field_w.a(false);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "qj.Q(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    public static void d() {
        field_u = null;
        field_l = null;
        int var1 = 47;
    }

    private final void a(int param0, boolean param1) {
        int var3 = 0;
        if (!(((qj) this).field_w.field_k != 1)) {
            var3 = param0;
            ep.field_i = ep.field_i - var3;
        }
        ((qj) this).field_r = param0;
    }

    private final void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (!(!this.a(param0, 1))) {
            return;
        }
        if (!((qj) this).field_s) {
            var4 = param0;
            var5 = param2;
            if (!((255 ^ var5) == var4)) {
                throw new IllegalArgumentException();
            }
            var6 = ed.field_f[var4];
            if (!(0 <= var6)) {
                throw new IllegalArgumentException();
            }
            ek.field_kb = ek.field_kb + hg.field_e;
            var7 = 1 << var6;
            hg.field_e = hg.field_e ^ var7;
            ek.field_kb = ek.field_kb - hg.field_e;
            lp.field_wb.a((nm) (Object) new e(param0, param2, hg.field_e, ek.field_kb, tm.field_g, qm.field_a), (byte) 3);
        }
        var4 = 90 % ((param1 - 36) / 46);
    }

    private final void a(byte param0, int param1, int param2) {
        int var5 = BrickABrac.field_J ? 1 : 0;
        if (!(!this.a(param1, 1))) {
            return;
        }
        if (param0 <= 17) {
            return;
        }
        if (((qj) this).field_s) {
        } else {
            if (param1 == 7) {
                fp.field_z = fp.field_z - ((qj) this).field_t;
            } else {
                ep.field_i = ep.field_i - ((qj) this).field_t;
            }
            lp.field_wb.a((nm) (Object) new e(param1, param2, fp.field_z, ep.field_i, od.field_c, og.field_Wb), (byte) 3);
            if (param1 != 7) {
                ep.field_i = ep.field_i + ((qj) this).field_t;
            } else {
                fp.field_z = fp.field_z + ((qj) this).field_t;
            }
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
        int var10 = 0;
        int var13 = 0;
        int var14 = 0;
        vl stackIn_4_0 = null;
        int stackIn_91_0 = 0;
        RuntimeException stackIn_93_0 = null;
        StringBuilder stackIn_93_1 = null;
        RuntimeException stackIn_94_0 = null;
        StringBuilder stackIn_94_1 = null;
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_95_2 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_98_2 = null;
        RuntimeException decompiledCaughtException = null;
        vl stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_90_0 = 0;
        RuntimeException stackOut_92_0 = null;
        StringBuilder stackOut_92_1 = null;
        RuntimeException stackOut_94_0 = null;
        StringBuilder stackOut_94_1 = null;
        String stackOut_94_2 = null;
        RuntimeException stackOut_93_0 = null;
        StringBuilder stackOut_93_1 = null;
        String stackOut_93_2 = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = 0;
              if (!((qj) this).field_p) {
                stackOut_3_0 = new vl();
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = null;
                stackIn_4_0 = (vl) (Object) stackOut_2_0;
                break L1;
              }
            }
            var5 = stackIn_4_0;
            var6_int = 0;
            L2: while (true) {
              if (var6_int >= ((qj) this).field_w.field_k) {
                var6_int = 0;
                L3: while (true) {
                  if (((qj) this).field_w.field_k <= var6_int) {
                    L4: {
                      if (((qj) this).field_w.field_k <= 1) {
                        break L4;
                      } else {
                        var6_int = 0;
                        L5: while (true) {
                          if (var6_int >= ((qj) this).field_w.field_k) {
                            break L4;
                          } else {
                            L6: {
                              var7_ref_j = ((qj) this).field_w.field_l[var6_int];
                              var8_int = var7_ref_j.field_p + var7_ref_j.field_ub << 8;
                              var7_ref_j.field_J = var7_ref_j.field_J + (var8_int + -var7_ref_j.field_G) / 100;
                              var7_ref_j.field_J = 7 * var7_ref_j.field_J / 8;
                              if (var7_ref_j.field_J > 1280) {
                                var7_ref_j.field_J = 1280;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            L7: {
                              var7_ref_j.field_G = var7_ref_j.field_G + var7_ref_j.field_J;
                              if (var7_ref_j.field_G <= var8_int) {
                                break L7;
                              } else {
                                var7_ref_j.field_G = var8_int;
                                break L7;
                              }
                            }
                            var6_int++;
                            continue L5;
                          }
                        }
                      }
                    }
                    L8: {
                      if (((qj) this).field_w.field_k > 1) {
                        var6_int = ((qj) this).field_w.a(125);
                        var7 = 0;
                        L9: while (true) {
                          if (((qj) this).field_w.field_k <= var7) {
                            break L8;
                          } else {
                            L10: {
                              var8 = ((qj) this).field_w.field_l[var7];
                              if ((1 << var7 & var6_int) != 0) {
                                if (var8.field_M != -1) {
                                  break L10;
                                } else {
                                  var8.field_M = 500;
                                  break L10;
                                }
                              } else {
                                var8.field_M = -1;
                                break L10;
                              }
                            }
                            var7++;
                            continue L9;
                          }
                        }
                      } else {
                        break L8;
                      }
                    }
                    L11: {
                      if (!((qj) this).field_p) {
                        if (((qj) this).field_w.field_k == 1) {
                          L12: {
                            var6 = ((qj) this).field_w.field_l[0];
                            if (var6.field_Z == 8) {
                              break L12;
                            } else {
                              if (var6.field_Z != 9) {
                                break L11;
                              } else {
                                break L12;
                              }
                            }
                          }
                          ((qj) this).a((byte) 40, false);
                          if (8 != var6.field_Z) {
                            cc.field_G = true;
                            break L11;
                          } else {
                            break L11;
                          }
                        } else {
                          if (((qj) this).field_w.field_c) {
                            break L11;
                          } else {
                            ((qj) this).field_w.field_a = ((qj) this).field_w.field_a | ((qj) this).field_w.c(-17566);
                            ((qj) this).field_w.field_g = ((qj) this).field_w.field_g | ((qj) this).field_w.a((byte) -92);
                            if (!((qj) this).field_w.b(82)) {
                              break L11;
                            } else {
                              L13: {
                                if (-1 != ((qj) this).field_w.field_h) {
                                  break L13;
                                } else {
                                  ((qj) this).field_w.field_h = 0;
                                  break L13;
                                }
                              }
                              L14: {
                                var6_int = ((qj) this).field_w.field_h;
                                var7 = 1 - ((qj) this).field_w.field_h;
                                if ((((qj) this).field_w.field_a & 1 << var7) == 0) {
                                  break L14;
                                } else {
                                  var6_int = var7;
                                  break L14;
                                }
                              }
                              ((qj) this).field_w.field_l[var6_int].field_zb = 1;
                              ((qj) this).field_w.field_m[0] = var6_int;
                              ((qj) this).field_w.field_l[-var6_int + 1].field_zb = 2;
                              ((qj) this).field_w.field_m[1] = 1 - var6_int;
                              ((qj) this).field_w.a(false);
                              op.field_a = true;
                              break L11;
                            }
                          }
                        }
                      } else {
                        break L11;
                      }
                    }
                    stackOut_90_0 = var4_int;
                    stackIn_91_0 = stackOut_90_0;
                    break L0;
                  } else {
                    var7_ref_j = ((qj) this).field_w.field_l[var6_int];
                    var8_int = 0;
                    var9_ref_ge = (ge) (Object) var7_ref_j.field_pb.d(-48);
                    L15: while (true) {
                      if (var9_ref_ge == null) {
                        var14 = 0;
                        var9 = var14;
                        L16: while (true) {
                          if (var14 >= 29) {
                            var6_int++;
                            continue L3;
                          } else {
                            L17: {
                              if (to.field_f[var14] >= 1) {
                                L18: {
                                  var10 = (20 * var7_ref_j.field_o[var14] << 8) / to.field_f[var14];
                                  if ((1 << var14 & var8_int) == 0) {
                                    break L18;
                                  } else {
                                    var10 = 5120;
                                    break L18;
                                  }
                                }
                                L19: {
                                  var7_ref_j.field_xb[var14] = var7_ref_j.field_xb[var14] + (-var7_ref_j.field_cb[var14] + var10) / 100;
                                  var7_ref_j.field_xb[var14] = 7 * var7_ref_j.field_xb[var14] / 8;
                                  if (512 >= var7_ref_j.field_xb[var14]) {
                                    break L19;
                                  } else {
                                    var7_ref_j.field_xb[var14] = 512;
                                    break L19;
                                  }
                                }
                                L20: {
                                  if (var7_ref_j.field_xb[var14] < -512) {
                                    var7_ref_j.field_xb[var14] = -512;
                                    break L20;
                                  } else {
                                    break L20;
                                  }
                                }
                                L21: {
                                  var7_ref_j.field_cb[var14] = var7_ref_j.field_cb[var14] + var7_ref_j.field_xb[var14];
                                  if (var7_ref_j.field_xb[var14] >= -1) {
                                    break L21;
                                  } else {
                                    if (var7_ref_j.field_cb[var14] > var10) {
                                      var7_ref_j.field_cb[var14] = var10;
                                      break L17;
                                    } else {
                                      break L21;
                                    }
                                  }
                                }
                                L22: {
                                  if (-1 <= var7_ref_j.field_xb[var14]) {
                                    break L22;
                                  } else {
                                    break L22;
                                  }
                                }
                                var14++;
                                continue L16;
                              } else {
                                break L17;
                              }
                            }
                            var14++;
                            continue L16;
                          }
                        }
                      } else {
                        var8_int = var8_int | 1 << var9_ref_ge.field_i;
                        var9_ref_ge = (ge) (Object) var7_ref_j.field_pb.a((byte) 116);
                        continue L15;
                      }
                    }
                  }
                }
              } else {
                L23: {
                  var7_ref_j = ((qj) this).field_w.field_l[var6_int];
                  if ((1 << var6_int & (((qj) this).field_w.field_i | (((qj) this).field_w.field_g | ((qj) this).field_w.field_a))) == 0) {
                    break L23;
                  } else {
                    var7_ref_j.field_U = var7_ref_j.field_U + 1;
                    break L23;
                  }
                }
                if ((1 << var6_int & ((qj) this).field_o) != 0) {
                  L24: {
                    L25: {
                      if (!((qj) this).field_p) {
                        break L25;
                      } else {
                        var8_int = var7_ref_j.field_F - var7_ref_j.field_E;
                        if (var8_int <= 30) {
                          L26: {
                            if (40 >= var8_int) {
                              break L26;
                            } else {
                              if (0 != de.field_x % 5) {
                                break L26;
                              } else {
                                break L24;
                              }
                            }
                          }
                          if (50 != var8_int) {
                            break L25;
                          } else {
                            break L24;
                          }
                        } else {
                          L27: {
                            if (0 == de.field_x % 10) {
                              break L27;
                            } else {
                              break L27;
                            }
                          }
                          var6_int++;
                          continue L2;
                        }
                      }
                    }
                    if (((((qj) this).field_w.field_a | (((qj) this).field_w.field_g | ((qj) this).field_w.field_i)) & 1 << var6_int) == 0) {
                      L28: {
                        ((qj) this).field_w.a((byte) 127, var6_int);
                        ((qj) this).field_w.a(var7_ref_j, param2, var5, 0);
                        if (((qj) this).field_p) {
                          break L28;
                        } else {
                          ((qj) this).field_w.a(var6_int, 1, var5, (byte) -122);
                          var7_ref_j.field_p = var7_ref_j.field_Q;
                          break L28;
                        }
                      }
                      L29: {
                        var4_int = var4_int | 1;
                        var7_ref_j.field_F = var7_ref_j.field_F + 1;
                        if (var5 == null) {
                          break L29;
                        } else {
                          var5.c((byte) -110);
                          break L29;
                        }
                      }
                      var7_ref_j.c(-101);
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  var6_int++;
                  continue L2;
                } else {
                  L30: {
                    if (var7_ref_j.field_q == 0) {
                      break L30;
                    } else {
                      break L30;
                    }
                  }
                  var6_int++;
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L31: {
            var4 = decompiledCaughtException;
            stackOut_92_0 = (RuntimeException) var4;
            stackOut_92_1 = new StringBuilder().append("qj.P(");
            stackIn_94_0 = stackOut_92_0;
            stackIn_94_1 = stackOut_92_1;
            stackIn_93_0 = stackOut_92_0;
            stackIn_93_1 = stackOut_92_1;
            if (param0 == null) {
              stackOut_94_0 = (RuntimeException) (Object) stackIn_94_0;
              stackOut_94_1 = (StringBuilder) (Object) stackIn_94_1;
              stackOut_94_2 = "null";
              stackIn_95_0 = stackOut_94_0;
              stackIn_95_1 = stackOut_94_1;
              stackIn_95_2 = stackOut_94_2;
              break L31;
            } else {
              stackOut_93_0 = (RuntimeException) (Object) stackIn_93_0;
              stackOut_93_1 = (StringBuilder) (Object) stackIn_93_1;
              stackOut_93_2 = "{...}";
              stackIn_95_0 = stackOut_93_0;
              stackIn_95_1 = stackOut_93_1;
              stackIn_95_2 = stackOut_93_2;
              break L31;
            }
          }
          L32: {
            stackOut_95_0 = (RuntimeException) (Object) stackIn_95_0;
            stackOut_95_1 = ((StringBuilder) (Object) stackIn_95_1).append(stackIn_95_2).append(44).append(1).append(44);
            stackIn_97_0 = stackOut_95_0;
            stackIn_97_1 = stackOut_95_1;
            stackIn_96_0 = stackOut_95_0;
            stackIn_96_1 = stackOut_95_1;
            if (param2 == null) {
              stackOut_97_0 = (RuntimeException) (Object) stackIn_97_0;
              stackOut_97_1 = (StringBuilder) (Object) stackIn_97_1;
              stackOut_97_2 = "null";
              stackIn_98_0 = stackOut_97_0;
              stackIn_98_1 = stackOut_97_1;
              stackIn_98_2 = stackOut_97_2;
              break L32;
            } else {
              stackOut_96_0 = (RuntimeException) (Object) stackIn_96_0;
              stackOut_96_1 = (StringBuilder) (Object) stackIn_96_1;
              stackOut_96_2 = "{...}";
              stackIn_98_0 = stackOut_96_0;
              stackIn_98_1 = stackOut_96_1;
              stackIn_98_2 = stackOut_96_2;
              break L32;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_98_0, stackIn_98_2 + 41);
        }
        return stackIn_91_0 != 0;
    }

    private final void a(nc param0, int param1, byte param2, int param3) {
        pn var5 = null;
        RuntimeException var5_ref = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (!((qj) this).field_s) {
              L1: {
                ep.field_i = ep.field_i + (param3 + param0.field_b);
                fp.field_z = fp.field_z - (param1 + ((qj) this).field_t);
                var5 = new pn(param0.field_h, -1 + param3, fp.field_z, ep.field_i, od.field_c, og.field_Wb);
                kq.field_j.a((nm) (Object) var5, (byte) 3);
                fp.field_z = fp.field_z - (param0.field_b + param3);
                ep.field_i = ep.field_i + (param1 - -((qj) this).field_t);
                if (hh.field_b[param0.field_h] >= param3) {
                  break L1;
                } else {
                  hh.field_b[param0.field_h] = param3;
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
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5_ref;
            stackOut_5_1 = new StringBuilder().append("qj.AA(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + -125 + 44 + param3 + 41);
        }
    }

    final void a(pi param0, byte param1) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        ge var6 = null;
        try {
            var3_int = param0.l(255);
            var4 = param0.l(255);
            var5 = param0.e(255);
            var6 = new ge(0, 0, var4);
            int var7 = 102 / ((-65 - param1) / 34);
            var6.field_y = var5;
            ((qj) this).field_w.field_l[var3_int].field_kb.a((Object) (Object) var6, (byte) -39);
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "qj.G(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    private final void a(byte param0, j param1) {
        RuntimeException var3 = null;
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
            stackOut_20_0 = (RuntimeException) var3;
            stackOut_20_1 = new StringBuilder().append("qj.GA(").append(param0).append(44);
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param1 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L9;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L9;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
    }

    private final void g() {
        int[] var2 = null;
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
        int stackIn_44_0 = 0;
        int stackIn_50_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_56_0 = 0;
        boolean stackIn_57_0 = false;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        boolean stackIn_58_0 = false;
        int stackIn_58_1 = 0;
        int stackIn_58_2 = 0;
        boolean stackIn_59_0 = false;
        int stackIn_59_1 = 0;
        int stackIn_59_2 = 0;
        boolean stackIn_60_0 = false;
        int stackIn_60_1 = 0;
        int stackIn_60_2 = 0;
        boolean stackIn_61_0 = false;
        int stackIn_61_1 = 0;
        int stackIn_61_2 = 0;
        int stackIn_61_3 = 0;
        boolean stackIn_62_0 = false;
        int stackIn_62_1 = 0;
        int stackIn_62_2 = 0;
        int stackIn_62_3 = 0;
        j stackIn_62_4 = null;
        int stackIn_62_5 = 0;
        int stackIn_62_6 = 0;
        boolean stackIn_63_0 = false;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        int stackIn_63_3 = 0;
        j stackIn_63_4 = null;
        int stackIn_63_5 = 0;
        int stackIn_63_6 = 0;
        boolean stackIn_64_0 = false;
        int stackIn_64_1 = 0;
        int stackIn_64_2 = 0;
        int stackIn_64_3 = 0;
        j stackIn_64_4 = null;
        int stackIn_64_5 = 0;
        int stackIn_64_6 = 0;
        boolean stackIn_65_0 = false;
        int stackIn_65_1 = 0;
        int stackIn_65_2 = 0;
        int stackIn_65_3 = 0;
        j stackIn_65_4 = null;
        int stackIn_65_5 = 0;
        int stackIn_65_6 = 0;
        boolean stackIn_66_0 = false;
        int stackIn_66_1 = 0;
        int stackIn_66_2 = 0;
        int stackIn_66_3 = 0;
        j stackIn_66_4 = null;
        int stackIn_66_5 = 0;
        int stackIn_66_6 = 0;
        int stackIn_66_7 = 0;
        int stackIn_69_0 = 0;
        boolean stackIn_70_0 = false;
        int stackIn_70_1 = 0;
        int stackIn_70_2 = 0;
        boolean stackIn_71_0 = false;
        int stackIn_71_1 = 0;
        int stackIn_71_2 = 0;
        boolean stackIn_72_0 = false;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
        boolean stackIn_73_0 = false;
        int stackIn_73_1 = 0;
        int stackIn_73_2 = 0;
        boolean stackIn_74_0 = false;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        int stackIn_74_3 = 0;
        boolean stackIn_75_0 = false;
        int stackIn_75_1 = 0;
        int stackIn_75_2 = 0;
        int stackIn_75_3 = 0;
        j stackIn_75_4 = null;
        int stackIn_75_5 = 0;
        int stackIn_75_6 = 0;
        boolean stackIn_76_0 = false;
        int stackIn_76_1 = 0;
        int stackIn_76_2 = 0;
        int stackIn_76_3 = 0;
        j stackIn_76_4 = null;
        int stackIn_76_5 = 0;
        int stackIn_76_6 = 0;
        boolean stackIn_77_0 = false;
        int stackIn_77_1 = 0;
        int stackIn_77_2 = 0;
        int stackIn_77_3 = 0;
        j stackIn_77_4 = null;
        int stackIn_77_5 = 0;
        int stackIn_77_6 = 0;
        boolean stackIn_78_0 = false;
        int stackIn_78_1 = 0;
        int stackIn_78_2 = 0;
        int stackIn_78_3 = 0;
        j stackIn_78_4 = null;
        int stackIn_78_5 = 0;
        int stackIn_78_6 = 0;
        boolean stackIn_79_0 = false;
        int stackIn_79_1 = 0;
        int stackIn_79_2 = 0;
        int stackIn_79_3 = 0;
        j stackIn_79_4 = null;
        int stackIn_79_5 = 0;
        int stackIn_79_6 = 0;
        int stackIn_79_7 = 0;
        int stackIn_83_0 = 0;
        boolean stackIn_84_0 = false;
        int stackIn_84_1 = 0;
        int stackIn_84_2 = 0;
        boolean stackIn_85_0 = false;
        int stackIn_85_1 = 0;
        int stackIn_85_2 = 0;
        boolean stackIn_86_0 = false;
        int stackIn_86_1 = 0;
        int stackIn_86_2 = 0;
        boolean stackIn_87_0 = false;
        int stackIn_87_1 = 0;
        int stackIn_87_2 = 0;
        boolean stackIn_88_0 = false;
        int stackIn_88_1 = 0;
        int stackIn_88_2 = 0;
        int stackIn_88_3 = 0;
        int stackOut_82_0 = 0;
        int stackOut_81_0 = 0;
        boolean stackOut_83_0 = false;
        int stackOut_83_1 = 0;
        int stackOut_83_2 = 0;
        boolean stackOut_84_0 = false;
        int stackOut_84_1 = 0;
        int stackOut_84_2 = 0;
        boolean stackOut_87_0 = false;
        int stackOut_87_1 = 0;
        int stackOut_87_2 = 0;
        int stackOut_87_3 = 0;
        boolean stackOut_85_0 = false;
        int stackOut_85_1 = 0;
        int stackOut_85_2 = 0;
        boolean stackOut_86_0 = false;
        int stackOut_86_1 = 0;
        int stackOut_86_2 = 0;
        int stackOut_86_3 = 0;
        int stackOut_43_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_48_0 = 0;
        int stackOut_47_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_52_0 = 0;
        int stackOut_51_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_54_0 = 0;
        boolean stackOut_56_0 = false;
        int stackOut_56_1 = 0;
        int stackOut_56_2 = 0;
        boolean stackOut_57_0 = false;
        int stackOut_57_1 = 0;
        int stackOut_57_2 = 0;
        boolean stackOut_60_0 = false;
        int stackOut_60_1 = 0;
        int stackOut_60_2 = 0;
        int stackOut_60_3 = 0;
        boolean stackOut_58_0 = false;
        int stackOut_58_1 = 0;
        int stackOut_58_2 = 0;
        boolean stackOut_59_0 = false;
        int stackOut_59_1 = 0;
        int stackOut_59_2 = 0;
        int stackOut_59_3 = 0;
        boolean stackOut_61_0 = false;
        int stackOut_61_1 = 0;
        int stackOut_61_2 = 0;
        int stackOut_61_3 = 0;
        j stackOut_61_4 = null;
        int stackOut_61_5 = 0;
        int stackOut_61_6 = 0;
        boolean stackOut_62_0 = false;
        int stackOut_62_1 = 0;
        int stackOut_62_2 = 0;
        int stackOut_62_3 = 0;
        j stackOut_62_4 = null;
        int stackOut_62_5 = 0;
        int stackOut_62_6 = 0;
        boolean stackOut_65_0 = false;
        int stackOut_65_1 = 0;
        int stackOut_65_2 = 0;
        int stackOut_65_3 = 0;
        j stackOut_65_4 = null;
        int stackOut_65_5 = 0;
        int stackOut_65_6 = 0;
        int stackOut_65_7 = 0;
        boolean stackOut_63_0 = false;
        int stackOut_63_1 = 0;
        int stackOut_63_2 = 0;
        int stackOut_63_3 = 0;
        j stackOut_63_4 = null;
        int stackOut_63_5 = 0;
        int stackOut_63_6 = 0;
        boolean stackOut_64_0 = false;
        int stackOut_64_1 = 0;
        int stackOut_64_2 = 0;
        int stackOut_64_3 = 0;
        j stackOut_64_4 = null;
        int stackOut_64_5 = 0;
        int stackOut_64_6 = 0;
        int stackOut_64_7 = 0;
        int stackOut_68_0 = 0;
        int stackOut_67_0 = 0;
        boolean stackOut_69_0 = false;
        int stackOut_69_1 = 0;
        int stackOut_69_2 = 0;
        boolean stackOut_70_0 = false;
        int stackOut_70_1 = 0;
        int stackOut_70_2 = 0;
        boolean stackOut_73_0 = false;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        int stackOut_73_3 = 0;
        boolean stackOut_71_0 = false;
        int stackOut_71_1 = 0;
        int stackOut_71_2 = 0;
        boolean stackOut_72_0 = false;
        int stackOut_72_1 = 0;
        int stackOut_72_2 = 0;
        int stackOut_72_3 = 0;
        boolean stackOut_74_0 = false;
        int stackOut_74_1 = 0;
        int stackOut_74_2 = 0;
        int stackOut_74_3 = 0;
        j stackOut_74_4 = null;
        int stackOut_74_5 = 0;
        int stackOut_74_6 = 0;
        boolean stackOut_75_0 = false;
        int stackOut_75_1 = 0;
        int stackOut_75_2 = 0;
        int stackOut_75_3 = 0;
        j stackOut_75_4 = null;
        int stackOut_75_5 = 0;
        int stackOut_75_6 = 0;
        boolean stackOut_78_0 = false;
        int stackOut_78_1 = 0;
        int stackOut_78_2 = 0;
        int stackOut_78_3 = 0;
        j stackOut_78_4 = null;
        int stackOut_78_5 = 0;
        int stackOut_78_6 = 0;
        int stackOut_78_7 = 0;
        boolean stackOut_76_0 = false;
        int stackOut_76_1 = 0;
        int stackOut_76_2 = 0;
        int stackOut_76_3 = 0;
        j stackOut_76_4 = null;
        int stackOut_76_5 = 0;
        int stackOut_76_6 = 0;
        boolean stackOut_77_0 = false;
        int stackOut_77_1 = 0;
        int stackOut_77_2 = 0;
        int stackOut_77_3 = 0;
        j stackOut_77_4 = null;
        int stackOut_77_5 = 0;
        int stackOut_77_6 = 0;
        int stackOut_77_7 = 0;
        L0: {
          var11 = BrickABrac.field_J ? 1 : 0;
          var4 = 25;
          var2 = kh.field_c[((qj) this).field_w.field_k - 1];
          var3 = kh.field_e[((qj) this).field_w.field_k - 1];
          var5 = kh.field_h[-1 + ((qj) this).field_w.field_k];
          var6 = ((qj) this).field_m;
          if (null != oa.field_Sb) {
            var7 = 0;
            L1: while (true) {
              if (var7 >= ((qj) this).field_w.field_k) {
                break L0;
              } else {
                var8 = ((qj) this).field_w.field_l[var6].field_yb;
                if (1 == ((qj) this).field_w.field_k) {
                  L2: {
                    L3: {
                      var9 = (-((var8.field_j - -(var8.field_u / 2) << 8) * 2) + 33423360) / 510;
                      oa.field_Sb.a(true, var9, 0, 0, 0);
                      if (oa.field_Sb.field_m == 7) {
                        break L3;
                      } else {
                        if (((qj) this).field_w.field_l[var6].field_Z == 5) {
                          break L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                    gh.a(121, true);
                    break L2;
                  }
                  if (km.field_i > 0) {
                    var10 = km.field_i * 256 / 32;
                    nk.field_c.b(0, 0, var10);
                    break L0;
                  } else {
                    break L0;
                  }
                } else {
                  L4: {
                    if (var5[var7] != 1) {
                      vi.a((byte) 124, 153 + var2[var7], var2[var7], var3[var7], 233 + var3[var7]);
                      oa.field_Sb.a((byte) -102, var6, var2[var7], var3[var7]);
                      sc.b(-79);
                      break L4;
                    } else {
                      vi.a((byte) 76, 306 + var2[var7], var2[var7], var3[var7], var3[var7] - -480);
                      var9 = (-(2 * (var8.field_j - -(var8.field_u / 2) << 8)) + 20054016) / 306;
                      oa.field_Sb.a(var3[var7], (byte) -107, var2[var7], var6, var9 / 2);
                      sc.b(-122);
                      break L4;
                    }
                  }
                  var6++;
                  var6 = var6 % ((qj) this).field_w.field_k;
                  var7++;
                  continue L1;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L5: {
          if (oa.field_Sb != null) {
            if (((qj) this).field_w.field_k <= 2) {
              break L5;
            } else {
              var7 = ((qj) this).field_w.field_k;
              L6: while (true) {
                if (var7 >= 5) {
                  break L5;
                } else {
                  oa.field_Sb.a((byte) -79, -1, var2[var7], var3[var7]);
                  lb.d(var2[var7], var3[var7], 153, 233, 0, 160);
                  var7++;
                  continue L6;
                }
              }
            }
          } else {
            break L5;
          }
        }
        var6 = ((qj) this).field_m;
        var7 = 0;
        L7: while (true) {
          if (var7 >= ((qj) this).field_w.field_k) {
            L8: {
              if (((qj) this).field_w.field_k != 1) {
                if (2 != ((qj) this).field_w.field_k) {
                  L9: {
                    var3 = kh.field_e[4];
                    var2 = kh.field_c[4];
                    nh.a(169, 482, -40, -1, cd.field_h, -1);
                    nh.a(169, 482, -40, 472, cd.field_h, -1);
                    if ((((qj) this).field_o & 1 << ((qj) this).field_m) == 0) {
                      stackOut_82_0 = 0;
                      stackIn_83_0 = stackOut_82_0;
                      break L9;
                    } else {
                      stackOut_81_0 = 1;
                      stackIn_83_0 = stackOut_81_0;
                      break L9;
                    }
                  }
                  L10: {
                    L11: {
                      var7 = stackIn_83_0;
                      stackOut_83_0 = ((qj) this).field_n;
                      stackOut_83_1 = -103;
                      stackOut_83_2 = var2[0];
                      stackIn_86_0 = stackOut_83_0;
                      stackIn_86_1 = stackOut_83_1;
                      stackIn_86_2 = stackOut_83_2;
                      stackIn_84_0 = stackOut_83_0;
                      stackIn_84_1 = stackOut_83_1;
                      stackIn_84_2 = stackOut_83_2;
                      if (var7 != 0) {
                        break L11;
                      } else {
                        stackOut_84_0 = stackIn_84_0;
                        stackOut_84_1 = stackIn_84_1;
                        stackOut_84_2 = stackIn_84_2;
                        stackIn_87_0 = stackOut_84_0;
                        stackIn_87_1 = stackOut_84_1;
                        stackIn_87_2 = stackOut_84_2;
                        stackIn_85_0 = stackOut_84_0;
                        stackIn_85_1 = stackOut_84_1;
                        stackIn_85_2 = stackOut_84_2;
                        if (0 != ((qj) this).field_o) {
                          stackOut_87_0 = stackIn_87_0;
                          stackOut_87_1 = stackIn_87_1;
                          stackOut_87_2 = stackIn_87_2;
                          stackOut_87_3 = 0;
                          stackIn_88_0 = stackOut_87_0;
                          stackIn_88_1 = stackOut_87_1;
                          stackIn_88_2 = stackOut_87_2;
                          stackIn_88_3 = stackOut_87_3;
                          break L10;
                        } else {
                          stackOut_85_0 = stackIn_85_0;
                          stackOut_85_1 = stackIn_85_1;
                          stackOut_85_2 = stackIn_85_2;
                          stackIn_86_0 = stackOut_85_0;
                          stackIn_86_1 = stackOut_85_1;
                          stackIn_86_2 = stackOut_85_2;
                          break L11;
                        }
                      }
                    }
                    stackOut_86_0 = stackIn_86_0;
                    stackOut_86_1 = stackIn_86_1;
                    stackOut_86_2 = stackIn_86_2;
                    stackOut_86_3 = 1;
                    stackIn_88_0 = stackOut_86_0;
                    stackIn_88_1 = stackOut_86_1;
                    stackIn_88_2 = stackOut_86_2;
                    stackIn_88_3 = stackOut_86_3;
                    break L10;
                  }
                  om.a(stackIn_88_0, (byte) stackIn_88_1, stackIn_88_2, stackIn_88_3 != 0, ((qj) this).field_w.field_l[((qj) this).field_m], var3[0], ((qj) this).field_m, var7 != 0, ((qj) this).field_w);
                  nh.a(169, 9, -40, -1, cd.field_h, var3[2] + -3);
                  nh.a(169, 9, -40, 472, cd.field_h, -3 + var3[2]);
                  break L8;
                } else {
                  L12: {
                    if (((qj) this).field_p) {
                      stackOut_43_0 = 0;
                      stackIn_44_0 = stackOut_43_0;
                      break L12;
                    } else {
                      stackOut_42_0 = 1;
                      stackIn_44_0 = stackOut_42_0;
                      break L12;
                    }
                  }
                  L13: {
                    var7 = stackIn_44_0;
                    if (((qj) this).field_p) {
                      if (((qj) this).field_o == 0) {
                        stackOut_48_0 = 1;
                        stackIn_50_0 = stackOut_48_0;
                        break L13;
                      } else {
                        stackOut_47_0 = 0;
                        stackIn_50_0 = stackOut_47_0;
                        break L13;
                      }
                    } else {
                      stackOut_45_0 = 1;
                      stackIn_50_0 = stackOut_45_0;
                      break L13;
                    }
                  }
                  L14: {
                    var8_int = stackIn_50_0;
                    if (((qj) this).field_p) {
                      stackOut_52_0 = ((qj) this).field_m;
                      stackIn_53_0 = stackOut_52_0;
                      break L14;
                    } else {
                      stackOut_51_0 = 1;
                      stackIn_53_0 = stackOut_51_0;
                      break L14;
                    }
                  }
                  L15: {
                    var9 = stackIn_53_0;
                    if ((((qj) this).field_o & 1 << var9) == 0) {
                      stackOut_55_0 = 0;
                      stackIn_56_0 = stackOut_55_0;
                      break L15;
                    } else {
                      stackOut_54_0 = 1;
                      stackIn_56_0 = stackOut_54_0;
                      break L15;
                    }
                  }
                  L16: {
                    L17: {
                      var10 = stackIn_56_0;
                      stackOut_56_0 = ((qj) this).field_n;
                      stackOut_56_1 = -103;
                      stackOut_56_2 = var2[0];
                      stackIn_59_0 = stackOut_56_0;
                      stackIn_59_1 = stackOut_56_1;
                      stackIn_59_2 = stackOut_56_2;
                      stackIn_57_0 = stackOut_56_0;
                      stackIn_57_1 = stackOut_56_1;
                      stackIn_57_2 = stackOut_56_2;
                      if (var8_int != 0) {
                        break L17;
                      } else {
                        stackOut_57_0 = stackIn_57_0;
                        stackOut_57_1 = stackIn_57_1;
                        stackOut_57_2 = stackIn_57_2;
                        stackIn_60_0 = stackOut_57_0;
                        stackIn_60_1 = stackOut_57_1;
                        stackIn_60_2 = stackOut_57_2;
                        stackIn_58_0 = stackOut_57_0;
                        stackIn_58_1 = stackOut_57_1;
                        stackIn_58_2 = stackOut_57_2;
                        if (var10 == 0) {
                          stackOut_60_0 = stackIn_60_0;
                          stackOut_60_1 = stackIn_60_1;
                          stackOut_60_2 = stackIn_60_2;
                          stackOut_60_3 = 0;
                          stackIn_61_0 = stackOut_60_0;
                          stackIn_61_1 = stackOut_60_1;
                          stackIn_61_2 = stackOut_60_2;
                          stackIn_61_3 = stackOut_60_3;
                          break L16;
                        } else {
                          stackOut_58_0 = stackIn_58_0;
                          stackOut_58_1 = stackIn_58_1;
                          stackOut_58_2 = stackIn_58_2;
                          stackIn_59_0 = stackOut_58_0;
                          stackIn_59_1 = stackOut_58_1;
                          stackIn_59_2 = stackOut_58_2;
                          break L17;
                        }
                      }
                    }
                    stackOut_59_0 = stackIn_59_0;
                    stackOut_59_1 = stackIn_59_1;
                    stackOut_59_2 = stackIn_59_2;
                    stackOut_59_3 = 1;
                    stackIn_61_0 = stackOut_59_0;
                    stackIn_61_1 = stackOut_59_1;
                    stackIn_61_2 = stackOut_59_2;
                    stackIn_61_3 = stackOut_59_3;
                    break L16;
                  }
                  L18: {
                    L19: {
                      stackOut_61_0 = stackIn_61_0;
                      stackOut_61_1 = stackIn_61_1;
                      stackOut_61_2 = stackIn_61_2;
                      stackOut_61_3 = stackIn_61_3;
                      stackOut_61_4 = ((qj) this).field_w.field_l[var9];
                      stackOut_61_5 = var3[0];
                      stackOut_61_6 = var9;
                      stackIn_64_0 = stackOut_61_0;
                      stackIn_64_1 = stackOut_61_1;
                      stackIn_64_2 = stackOut_61_2;
                      stackIn_64_3 = stackOut_61_3;
                      stackIn_64_4 = stackOut_61_4;
                      stackIn_64_5 = stackOut_61_5;
                      stackIn_64_6 = stackOut_61_6;
                      stackIn_62_0 = stackOut_61_0;
                      stackIn_62_1 = stackOut_61_1;
                      stackIn_62_2 = stackOut_61_2;
                      stackIn_62_3 = stackOut_61_3;
                      stackIn_62_4 = stackOut_61_4;
                      stackIn_62_5 = stackOut_61_5;
                      stackIn_62_6 = stackOut_61_6;
                      if (var7 != 0) {
                        break L19;
                      } else {
                        stackOut_62_0 = stackIn_62_0;
                        stackOut_62_1 = stackIn_62_1;
                        stackOut_62_2 = stackIn_62_2;
                        stackOut_62_3 = stackIn_62_3;
                        stackOut_62_4 = (j) (Object) stackIn_62_4;
                        stackOut_62_5 = stackIn_62_5;
                        stackOut_62_6 = stackIn_62_6;
                        stackIn_65_0 = stackOut_62_0;
                        stackIn_65_1 = stackOut_62_1;
                        stackIn_65_2 = stackOut_62_2;
                        stackIn_65_3 = stackOut_62_3;
                        stackIn_65_4 = stackOut_62_4;
                        stackIn_65_5 = stackOut_62_5;
                        stackIn_65_6 = stackOut_62_6;
                        stackIn_63_0 = stackOut_62_0;
                        stackIn_63_1 = stackOut_62_1;
                        stackIn_63_2 = stackOut_62_2;
                        stackIn_63_3 = stackOut_62_3;
                        stackIn_63_4 = stackOut_62_4;
                        stackIn_63_5 = stackOut_62_5;
                        stackIn_63_6 = stackOut_62_6;
                        if (var10 == 0) {
                          stackOut_65_0 = stackIn_65_0;
                          stackOut_65_1 = stackIn_65_1;
                          stackOut_65_2 = stackIn_65_2;
                          stackOut_65_3 = stackIn_65_3;
                          stackOut_65_4 = (j) (Object) stackIn_65_4;
                          stackOut_65_5 = stackIn_65_5;
                          stackOut_65_6 = stackIn_65_6;
                          stackOut_65_7 = 0;
                          stackIn_66_0 = stackOut_65_0;
                          stackIn_66_1 = stackOut_65_1;
                          stackIn_66_2 = stackOut_65_2;
                          stackIn_66_3 = stackOut_65_3;
                          stackIn_66_4 = stackOut_65_4;
                          stackIn_66_5 = stackOut_65_5;
                          stackIn_66_6 = stackOut_65_6;
                          stackIn_66_7 = stackOut_65_7;
                          break L18;
                        } else {
                          stackOut_63_0 = stackIn_63_0;
                          stackOut_63_1 = stackIn_63_1;
                          stackOut_63_2 = stackIn_63_2;
                          stackOut_63_3 = stackIn_63_3;
                          stackOut_63_4 = (j) (Object) stackIn_63_4;
                          stackOut_63_5 = stackIn_63_5;
                          stackOut_63_6 = stackIn_63_6;
                          stackIn_64_0 = stackOut_63_0;
                          stackIn_64_1 = stackOut_63_1;
                          stackIn_64_2 = stackOut_63_2;
                          stackIn_64_3 = stackOut_63_3;
                          stackIn_64_4 = stackOut_63_4;
                          stackIn_64_5 = stackOut_63_5;
                          stackIn_64_6 = stackOut_63_6;
                          break L19;
                        }
                      }
                    }
                    stackOut_64_0 = stackIn_64_0;
                    stackOut_64_1 = stackIn_64_1;
                    stackOut_64_2 = stackIn_64_2;
                    stackOut_64_3 = stackIn_64_3;
                    stackOut_64_4 = (j) (Object) stackIn_64_4;
                    stackOut_64_5 = stackIn_64_5;
                    stackOut_64_6 = stackIn_64_6;
                    stackOut_64_7 = 1;
                    stackIn_66_0 = stackOut_64_0;
                    stackIn_66_1 = stackOut_64_1;
                    stackIn_66_2 = stackOut_64_2;
                    stackIn_66_3 = stackOut_64_3;
                    stackIn_66_4 = stackOut_64_4;
                    stackIn_66_5 = stackOut_64_5;
                    stackIn_66_6 = stackOut_64_6;
                    stackIn_66_7 = stackOut_64_7;
                    break L18;
                  }
                  L20: {
                    om.a(stackIn_66_0, (byte) stackIn_66_1, stackIn_66_2, stackIn_66_3 != 0, stackIn_66_4, stackIn_66_5, stackIn_66_6, stackIn_66_7 != 0, ((qj) this).field_w);
                    var9 = 1 + -var9;
                    if (0 == (1 << var9 & ((qj) this).field_o)) {
                      stackOut_68_0 = 0;
                      stackIn_69_0 = stackOut_68_0;
                      break L20;
                    } else {
                      stackOut_67_0 = 1;
                      stackIn_69_0 = stackOut_67_0;
                      break L20;
                    }
                  }
                  L21: {
                    L22: {
                      var10 = stackIn_69_0;
                      stackOut_69_0 = ((qj) this).field_n;
                      stackOut_69_1 = -103;
                      stackOut_69_2 = var2[1];
                      stackIn_72_0 = stackOut_69_0;
                      stackIn_72_1 = stackOut_69_1;
                      stackIn_72_2 = stackOut_69_2;
                      stackIn_70_0 = stackOut_69_0;
                      stackIn_70_1 = stackOut_69_1;
                      stackIn_70_2 = stackOut_69_2;
                      if (var8_int != 0) {
                        break L22;
                      } else {
                        stackOut_70_0 = stackIn_70_0;
                        stackOut_70_1 = stackIn_70_1;
                        stackOut_70_2 = stackIn_70_2;
                        stackIn_73_0 = stackOut_70_0;
                        stackIn_73_1 = stackOut_70_1;
                        stackIn_73_2 = stackOut_70_2;
                        stackIn_71_0 = stackOut_70_0;
                        stackIn_71_1 = stackOut_70_1;
                        stackIn_71_2 = stackOut_70_2;
                        if (var10 == 0) {
                          stackOut_73_0 = stackIn_73_0;
                          stackOut_73_1 = stackIn_73_1;
                          stackOut_73_2 = stackIn_73_2;
                          stackOut_73_3 = 0;
                          stackIn_74_0 = stackOut_73_0;
                          stackIn_74_1 = stackOut_73_1;
                          stackIn_74_2 = stackOut_73_2;
                          stackIn_74_3 = stackOut_73_3;
                          break L21;
                        } else {
                          stackOut_71_0 = stackIn_71_0;
                          stackOut_71_1 = stackIn_71_1;
                          stackOut_71_2 = stackIn_71_2;
                          stackIn_72_0 = stackOut_71_0;
                          stackIn_72_1 = stackOut_71_1;
                          stackIn_72_2 = stackOut_71_2;
                          break L22;
                        }
                      }
                    }
                    stackOut_72_0 = stackIn_72_0;
                    stackOut_72_1 = stackIn_72_1;
                    stackOut_72_2 = stackIn_72_2;
                    stackOut_72_3 = 1;
                    stackIn_74_0 = stackOut_72_0;
                    stackIn_74_1 = stackOut_72_1;
                    stackIn_74_2 = stackOut_72_2;
                    stackIn_74_3 = stackOut_72_3;
                    break L21;
                  }
                  L23: {
                    L24: {
                      stackOut_74_0 = stackIn_74_0;
                      stackOut_74_1 = stackIn_74_1;
                      stackOut_74_2 = stackIn_74_2;
                      stackOut_74_3 = stackIn_74_3;
                      stackOut_74_4 = ((qj) this).field_w.field_l[var9];
                      stackOut_74_5 = var3[1];
                      stackOut_74_6 = var9;
                      stackIn_77_0 = stackOut_74_0;
                      stackIn_77_1 = stackOut_74_1;
                      stackIn_77_2 = stackOut_74_2;
                      stackIn_77_3 = stackOut_74_3;
                      stackIn_77_4 = stackOut_74_4;
                      stackIn_77_5 = stackOut_74_5;
                      stackIn_77_6 = stackOut_74_6;
                      stackIn_75_0 = stackOut_74_0;
                      stackIn_75_1 = stackOut_74_1;
                      stackIn_75_2 = stackOut_74_2;
                      stackIn_75_3 = stackOut_74_3;
                      stackIn_75_4 = stackOut_74_4;
                      stackIn_75_5 = stackOut_74_5;
                      stackIn_75_6 = stackOut_74_6;
                      if (var7 != 0) {
                        break L24;
                      } else {
                        stackOut_75_0 = stackIn_75_0;
                        stackOut_75_1 = stackIn_75_1;
                        stackOut_75_2 = stackIn_75_2;
                        stackOut_75_3 = stackIn_75_3;
                        stackOut_75_4 = (j) (Object) stackIn_75_4;
                        stackOut_75_5 = stackIn_75_5;
                        stackOut_75_6 = stackIn_75_6;
                        stackIn_78_0 = stackOut_75_0;
                        stackIn_78_1 = stackOut_75_1;
                        stackIn_78_2 = stackOut_75_2;
                        stackIn_78_3 = stackOut_75_3;
                        stackIn_78_4 = stackOut_75_4;
                        stackIn_78_5 = stackOut_75_5;
                        stackIn_78_6 = stackOut_75_6;
                        stackIn_76_0 = stackOut_75_0;
                        stackIn_76_1 = stackOut_75_1;
                        stackIn_76_2 = stackOut_75_2;
                        stackIn_76_3 = stackOut_75_3;
                        stackIn_76_4 = stackOut_75_4;
                        stackIn_76_5 = stackOut_75_5;
                        stackIn_76_6 = stackOut_75_6;
                        if (var10 == 0) {
                          stackOut_78_0 = stackIn_78_0;
                          stackOut_78_1 = stackIn_78_1;
                          stackOut_78_2 = stackIn_78_2;
                          stackOut_78_3 = stackIn_78_3;
                          stackOut_78_4 = (j) (Object) stackIn_78_4;
                          stackOut_78_5 = stackIn_78_5;
                          stackOut_78_6 = stackIn_78_6;
                          stackOut_78_7 = 0;
                          stackIn_79_0 = stackOut_78_0;
                          stackIn_79_1 = stackOut_78_1;
                          stackIn_79_2 = stackOut_78_2;
                          stackIn_79_3 = stackOut_78_3;
                          stackIn_79_4 = stackOut_78_4;
                          stackIn_79_5 = stackOut_78_5;
                          stackIn_79_6 = stackOut_78_6;
                          stackIn_79_7 = stackOut_78_7;
                          break L23;
                        } else {
                          stackOut_76_0 = stackIn_76_0;
                          stackOut_76_1 = stackIn_76_1;
                          stackOut_76_2 = stackIn_76_2;
                          stackOut_76_3 = stackIn_76_3;
                          stackOut_76_4 = (j) (Object) stackIn_76_4;
                          stackOut_76_5 = stackIn_76_5;
                          stackOut_76_6 = stackIn_76_6;
                          stackIn_77_0 = stackOut_76_0;
                          stackIn_77_1 = stackOut_76_1;
                          stackIn_77_2 = stackOut_76_2;
                          stackIn_77_3 = stackOut_76_3;
                          stackIn_77_4 = stackOut_76_4;
                          stackIn_77_5 = stackOut_76_5;
                          stackIn_77_6 = stackOut_76_6;
                          break L24;
                        }
                      }
                    }
                    stackOut_77_0 = stackIn_77_0;
                    stackOut_77_1 = stackIn_77_1;
                    stackOut_77_2 = stackIn_77_2;
                    stackOut_77_3 = stackIn_77_3;
                    stackOut_77_4 = (j) (Object) stackIn_77_4;
                    stackOut_77_5 = stackIn_77_5;
                    stackOut_77_6 = stackIn_77_6;
                    stackOut_77_7 = 1;
                    stackIn_79_0 = stackOut_77_0;
                    stackIn_79_1 = stackOut_77_1;
                    stackIn_79_2 = stackOut_77_2;
                    stackIn_79_3 = stackOut_77_3;
                    stackIn_79_4 = stackOut_77_4;
                    stackIn_79_5 = stackOut_77_5;
                    stackIn_79_6 = stackOut_77_6;
                    stackIn_79_7 = stackOut_77_7;
                    break L23;
                  }
                  om.a(stackIn_79_0, (byte) stackIn_79_1, stackIn_79_2, stackIn_79_3 != 0, stackIn_79_4, stackIn_79_5, stackIn_79_6, stackIn_79_7 != 0, ((qj) this).field_w);
                  break L8;
                }
              } else {
                L25: {
                  L26: {
                    var7_ref_j = ((qj) this).field_w.field_l[0];
                    nh.a(526, 482, -40, -1, cd.field_h, -1);
                    lb.d(7, 473, 510, 7, 0, 96);
                    lb.d(524, 0, 116, 480, 0, 96);
                    nh.a(125, 482, -40, 516, cd.field_h, -1);
                    int discarded$5 = 85;
                    int discarded$6 = 10;
                    int discarded$7 = 527;
                    int discarded$8 = -104;
                    tk.a(130, ((qj) this).field_w, nn.field_g, var7_ref_j);
                    nh.a(125, 9, -40, 516, cd.field_h, 137);
                    if (!r.field_A) {
                      break L26;
                    } else {
                      if (wc.field_b) {
                        break L26;
                      } else {
                        break L25;
                      }
                    }
                  }
                  ua.a(var7_ref_j, 524, 85, -68, 147, 81, ((qj) this).field_w);
                  break L25;
                }
                L27: {
                  nh.a(125, 9, -40, 516, cd.field_h, 229);
                  a.a(640, ((qj) this).field_w, var7_ref_j);
                  if (!r.field_A) {
                    break L27;
                  } else {
                    if (ka.a((byte) 124)) {
                      ui.a(tb.field_eb + ro.field_v, ob.field_D, 6, c.field_i, 100, 621, 1729, 340, 230, 0);
                      break L8;
                    } else {
                      break L27;
                    }
                  }
                }
                if (null == var7_ref_j.field_fb) {
                  break L8;
                } else {
                  ui.a(var7_ref_j.field_fb, nn.field_g, 0, (tp[]) null, 80, 621, 1729, 340, 85, -1);
                  break L8;
                }
              }
            }
            L28: {
              if (((qj) this).field_w.field_k > 1) {
                if (((((qj) this).field_w.field_g | ((qj) this).field_w.field_i) & 1 << ((qj) this).field_m) != 0) {
                  break L28;
                } else {
                  v.a(var2[0], 424, false, ((qj) this).field_w, ((qj) this).field_m, var3[0]);
                  break L28;
                }
              } else {
                break L28;
              }
            }
            L29: {
              if (((qj) this).field_w.field_k != 2) {
                break L29;
              } else {
                if (0 != (1 << 1 + -((qj) this).field_m & (((qj) this).field_w.field_g | ((qj) this).field_w.field_i))) {
                  break L29;
                } else {
                  v.a(var2[1], 424, false, ((qj) this).field_w, 1 + -((qj) this).field_m, var3[1]);
                  break L29;
                }
              }
            }
            var3 = kh.field_e[((qj) this).field_w.field_k + -1];
            var6 = ((qj) this).field_m;
            var2 = kh.field_c[((qj) this).field_w.field_k - 1];
            var7 = 0;
            L30: while (true) {
              if (((qj) this).field_w.field_k <= var7) {
                return;
              } else {
                L31: {
                  if (var5[var7] == 2) {
                    var8_ref = ul.field_k[((qj) this).field_w.field_l[var6].field_H];
                    var9 = ob.field_D.field_F - -ob.field_D.field_P;
                    lb.d(var2[var7], 235 - -var3[var7] + -23, 153, var9, 0, 141);
                    var8_ref.c(-var8_ref.field_x + (153 + var2[var7]), -var8_ref.field_z + var3[var7] + 233);
                    ce.field_e.c(((qj) this).field_w.field_f[var6], var2[var7] + 4, 2 + var3[var7] + 223, 2, -1);
                    break L31;
                  } else {
                    break L31;
                  }
                }
                var6++;
                var6 = var6 % ((qj) this).field_w.field_k;
                var7++;
                continue L30;
              }
            }
          } else {
            L32: {
              if (tn.field_C != var5[var7]) {
                int discarded$9 = -28463;
                gr.b(var5[var7]);
                break L32;
              } else {
                break L32;
              }
            }
            pi.a((byte) 90, var6, var5[var7], var3[var7], ((qj) this).field_w, var2[var7]);
            var6++;
            var6 = var6 % ((qj) this).field_w.field_k;
            var7++;
            continue L7;
          }
        }
    }

    qj(String[] param0, int param1, int param2, oi param3, int[] param4, int[] param5) {
        this(false, false, param0, param1, param2, param3, param4, param5);
    }

    final void f(int param0) {
        if (!(((qj) this).field_p)) {
            throw new IllegalStateException();
        }
        k.field_h.e(-13413, 67);
        int var2 = 68 % ((param0 - -65) / 59);
    }

    qj(boolean param0, boolean param1, String[] param2, int param3, int param4, oi param5, int[] param6, int[] param7) {
        super(-1);
        RuntimeException var9 = null;
        int[] var9_array = null;
        int var9_int = 0;
        int var10 = 0;
        int[] var12 = null;
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
        Object stackIn_19_0 = null;
        Object stackIn_20_0 = null;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_38_2 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_41_2 = null;
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
        Object stackOut_18_0 = null;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_19_0 = null;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        Object stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        String stackOut_36_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        ((qj) this).field_x = 0;
        ((qj) this).field_s = false;
        try {
          L0: {
            L1: {
              stackOut_1_0 = this;
              stackIn_3_0 = stackOut_1_0;
              stackIn_2_0 = stackOut_1_0;
              if (!param1) {
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
              ((qj) this).field_n = stackIn_4_1 != 0;
              stackOut_4_0 = this;
              stackIn_6_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (!param0) {
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
              ((qj) this).field_p = stackIn_7_1 != 0;
              ((qj) this).field_o = param4;
              ((qj) this).field_k = param3;
              stackOut_7_0 = this;
              stackIn_9_0 = stackOut_7_0;
              stackIn_8_0 = stackOut_7_0;
              if (kb.field_Yb < 2) {
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
            ((qj) this).field_y = stackIn_10_1 != 0;
            var12 = pl.field_b;
            var9_array = var12;
            var10 = 0;
            L4: while (true) {
              if (8 <= var10) {
                ((qj) this).field_w = new ak(param2, ((qj) this).field_o, param5, param6, param7);
                var9_int = 0;
                var10 = 0;
                L5: while (true) {
                  if (((qj) this).field_w.field_k <= var10) {
                    L6: {
                      stackOut_18_0 = this;
                      stackIn_22_0 = stackOut_18_0;
                      stackIn_19_0 = stackOut_18_0;
                      if (var9_int == 2) {
                        stackOut_22_0 = this;
                        stackOut_22_1 = 1;
                        stackIn_23_0 = stackOut_22_0;
                        stackIn_23_1 = stackOut_22_1;
                        break L6;
                      } else {
                        stackOut_19_0 = this;
                        stackIn_21_0 = stackOut_19_0;
                        stackIn_20_0 = stackOut_19_0;
                        if (((qj) this).field_k < 0) {
                          stackOut_21_0 = this;
                          stackOut_21_1 = 0;
                          stackIn_23_0 = stackOut_21_0;
                          stackIn_23_1 = stackOut_21_1;
                          break L6;
                        } else {
                          stackOut_20_0 = this;
                          stackOut_20_1 = ((qj) this).field_k;
                          stackIn_23_0 = stackOut_20_0;
                          stackIn_23_1 = stackOut_20_1;
                          break L6;
                        }
                      }
                    }
                    L7: {
                      ((qj) this).field_m = stackIn_23_1;
                      if (oo.field_w != null) {
                        break L7;
                      } else {
                        oo.field_w = new fo(new int[1]);
                        break L7;
                      }
                    }
                    L8: {
                      km.field_i = 0;
                      int discarded$7 = 0;
                      int discarded$8 = 256;
                      to.field_k = kl.a(ta.field_e[2]);
                      int discarded$9 = 0;
                      int discarded$10 = 256;
                      me.field_d = kl.a(ta.field_e[2]);
                      to.field_k.f(-1);
                      me.field_d.f(-1);
                      l discarded$11 = sk.a((byte) 125, to.field_k);
                      l discarded$12 = sk.a((byte) 5, me.field_d);
                      tn.field_C = 1;
                      int discarded$13 = -28463;
                      gr.b(tn.field_C);
                      pg.field_m = -1;
                      dj.field_b = -1;
                      if (jo.field_j != null) {
                        break L8;
                      } else {
                        jo.field_j = rd.a(cm.field_p, new String[1], (byte) 103).toLowerCase();
                        ff.field_j = pn.field_j.toLowerCase();
                        break L8;
                      }
                    }
                    be.field_j = 0;
                    op.field_a = false;
                    fl.field_l = ue.a(false);
                    gq.field_Yb = param5.field_b.field_h;
                    tk.field_q = param5.a(96);
                    break L0;
                  } else {
                    L9: {
                      if ((((qj) this).field_o & 1 << var10) == 0) {
                        break L9;
                      } else {
                        var9_int++;
                        break L9;
                      }
                    }
                    var10++;
                    continue L5;
                  }
                }
              } else {
                var12[var10] = 0;
                var10++;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var9 = decompiledCaughtException;
            stackOut_29_0 = (RuntimeException) var9;
            stackOut_29_1 = new StringBuilder().append("qj.<init>(").append(param0).append(44).append(param1).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param2 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L10;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L10;
            }
          }
          L11: {
            stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
            stackOut_32_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_32_2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param5 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L11;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L11;
            }
          }
          L12: {
            stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
            stackOut_35_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_35_2).append(44);
            stackIn_37_0 = stackOut_35_0;
            stackIn_37_1 = stackOut_35_1;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            if (param6 == null) {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "null";
              stackIn_38_0 = stackOut_37_0;
              stackIn_38_1 = stackOut_37_1;
              stackIn_38_2 = stackOut_37_2;
              break L12;
            } else {
              stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
              stackOut_36_1 = (StringBuilder) (Object) stackIn_36_1;
              stackOut_36_2 = "{...}";
              stackIn_38_0 = stackOut_36_0;
              stackIn_38_1 = stackOut_36_1;
              stackIn_38_2 = stackOut_36_2;
              break L12;
            }
          }
          L13: {
            stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
            stackOut_38_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_38_2).append(44);
            stackIn_40_0 = stackOut_38_0;
            stackIn_40_1 = stackOut_38_1;
            stackIn_39_0 = stackOut_38_0;
            stackIn_39_1 = stackOut_38_1;
            if (param7 == null) {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "null";
              stackIn_41_0 = stackOut_40_0;
              stackIn_41_1 = stackOut_40_1;
              stackIn_41_2 = stackOut_40_2;
              break L13;
            } else {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "{...}";
              stackIn_41_0 = stackOut_39_0;
              stackIn_41_1 = stackOut_39_1;
              stackIn_41_2 = stackOut_39_2;
              break L13;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_41_0, stackIn_41_2 + 41);
        }
    }

    static {
    }
}
