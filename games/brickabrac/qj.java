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

    private final void a(int param0) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_27_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        int stackOut_12_0 = 0;
        int stackOut_12_1 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        L0: {
          L1: {
            if (pf.field_p) {
              break L1;
            } else {
              if (la.field_c) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        L2: {
          var2 = stackIn_4_0;
          stackOut_4_0 = var2;
          stackIn_6_0 = stackOut_4_0;
          stackIn_5_0 = stackOut_4_0;
          if ((((qj) this).field_o & (((qj) this).field_w.field_i | ((qj) this).field_w.field_g | ((qj) this).field_w.field_a)) != ((qj) this).field_o) {
            stackOut_6_0 = stackIn_6_0;
            stackOut_6_1 = 0;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            break L2;
          } else {
            stackOut_5_0 = stackIn_5_0;
            stackOut_5_1 = 1;
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            break L2;
          }
        }
        L3: {
          L4: {
            var2 = stackIn_7_0 & stackIn_7_1;
            stackOut_7_0 = var2;
            stackIn_12_0 = stackOut_7_0;
            stackIn_8_0 = stackOut_7_0;
            if (2 >= ((qj) this).field_w.field_k) {
              break L4;
            } else {
              L5: {
                stackOut_8_0 = stackIn_8_0;
                stackIn_11_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (((qj) this).field_k < 0) {
                  break L5;
                } else {
                  stackOut_9_0 = stackIn_9_0;
                  stackIn_12_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (((qj) this).field_w.field_l[((qj) this).field_k].field_U < 50) {
                    break L4;
                  } else {
                    stackOut_10_0 = stackIn_10_0;
                    stackIn_11_0 = stackOut_10_0;
                    break L5;
                  }
                }
              }
              stackOut_11_0 = stackIn_11_0;
              stackOut_11_1 = 1;
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              break L3;
            }
          }
          stackOut_12_0 = stackIn_12_0;
          stackOut_12_1 = 0;
          stackIn_13_0 = stackOut_12_0;
          stackIn_13_1 = stackOut_12_1;
          break L3;
        }
        L6: {
          var2 = stackIn_13_0 & stackIn_13_1;
          if (var2 == 0) {
            break L6;
          } else {
            L7: {
              L8: {
                if (pe.field_l[fq.field_b]) {
                  break L8;
                } else {
                  if (!pe.field_l[td.field_u]) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              int fieldTemp$4 = ((qj) this).field_m + 1;
              ((qj) this).field_m = ((qj) this).field_m + 1;
              ((qj) this).field_m = fieldTemp$4 % ((qj) this).field_w.field_k;
              if (!BrickABrac.field_J) {
                break L6;
              } else {
                break L7;
              }
            }
            if (!pe.field_l[ac.field_f]) {
              break L6;
            } else {
              int fieldTemp$5 = ((qj) this).field_m - 1;
              ((qj) this).field_m = ((qj) this).field_m - 1;
              ((qj) this).field_m = (((qj) this).field_w.field_k + fieldTemp$5) % ((qj) this).field_w.field_k;
              break L6;
            }
          }
        }
        L9: {
          L10: {
            if (pe.field_l[fq.field_b]) {
              break L10;
            } else {
              if (pe.field_l[ac.field_f]) {
                break L10;
              } else {
                if (!pe.field_l[td.field_u]) {
                  stackOut_26_0 = 0;
                  stackIn_27_0 = stackOut_26_0;
                  break L9;
                } else {
                  break L10;
                }
              }
            }
          }
          stackOut_25_0 = 1;
          stackIn_27_0 = stackOut_25_0;
          break L9;
        }
        la.field_c = stackIn_27_0 != 0;
    }

    private final boolean a(int param0, int param1) {
        if (!(!eo.a(mk.field_b, param0, (byte) -75))) {
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
        this.g(41);
    }

    final void a(pi param0, boolean param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
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
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("qj.A(");
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
              break L3;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L3;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    final void a(byte param0, pi param1) {
        try {
            ((qj) this).field_w.field_l[((qj) this).field_k].field_E = ((qj) this).field_w.field_l[((qj) this).field_k].field_E + 5;
            ((qj) this).field_w.field_l[((qj) this).field_k].field_p = param1.i(65280);
            if (param0 != 33) {
                this.a((byte) 15, (j) null);
            }
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "qj.M(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
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
        if (param1 != 67) {
            ((qj) this).field_i = 125;
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
        int stackIn_12_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_17_1 = 0;
        int stackIn_90_0 = 0;
        int stackIn_96_0 = 0;
        int stackIn_101_0 = 0;
        int stackIn_113_0 = 0;
        int stackIn_123_0 = 0;
        int stackIn_128_0 = 0;
        int stackIn_187_0 = 0;
        int stackIn_187_1 = 0;
        int stackIn_195_0 = 0;
        int stackIn_195_1 = 0;
        String stackIn_223_0 = null;
        Object stackIn_235_0 = null;
        int stackIn_235_1 = 0;
        int stackIn_235_2 = 0;
        Object stackIn_236_0 = null;
        int stackIn_236_1 = 0;
        int stackIn_236_2 = 0;
        Object stackIn_237_0 = null;
        int stackIn_237_1 = 0;
        int stackIn_237_2 = 0;
        int stackIn_237_3 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_15_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        int stackOut_89_0 = 0;
        boolean stackOut_95_0 = false;
        int stackOut_100_0 = 0;
        int stackOut_112_0 = 0;
        int stackOut_122_0 = 0;
        int stackOut_121_0 = 0;
        int stackOut_127_0 = 0;
        int stackOut_126_0 = 0;
        int stackOut_186_0 = 0;
        int stackOut_186_1 = 0;
        int stackOut_194_0 = 0;
        int stackOut_194_1 = 0;
        String stackOut_222_0 = null;
        String stackOut_221_0 = null;
        Object stackOut_234_0 = null;
        int stackOut_234_1 = 0;
        int stackOut_234_2 = 0;
        Object stackOut_236_0 = null;
        int stackOut_236_1 = 0;
        int stackOut_236_2 = 0;
        int stackOut_236_3 = 0;
        Object stackOut_235_0 = null;
        int stackOut_235_1 = 0;
        int stackOut_235_2 = 0;
        int stackOut_235_3 = 0;
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
              L7: {
                var4 = stackIn_17_0 | stackIn_17_1;
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
                if (var4 != 0) {
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
              hg.field_e = hg.field_e ^ tm.field_g + qm.field_a << 16;
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
                    stackOut_89_0 = ((qj) this).field_o & 1 << var5;
                    stackIn_96_0 = stackOut_89_0;
                    stackIn_90_0 = stackOut_89_0;
                    if (var14 != 0) {
                      break L32;
                    } else {
                      L35: {
                        L36: {
                          if (stackIn_90_0 != 0) {
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
            stackOut_95_0 = param1;
            stackIn_96_0 = stackOut_95_0 ? 1 : 0;
            break L32;
          }
          L37: {
            if (stackIn_96_0 == 0) {
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
                  stackOut_100_0 = ((qj) this).field_o & 1 << var5;
                  stackIn_113_0 = stackOut_100_0;
                  stackIn_101_0 = stackOut_100_0;
                  if (var14 != 0) {
                    break L39;
                  } else {
                    L41: {
                      L42: {
                        if (stackIn_101_0 != 0) {
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
              stackOut_112_0 = 0;
              stackIn_113_0 = stackOut_112_0;
              break L39;
            }
            L45: {
              L46: {
                var5 = stackIn_113_0;
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
                      L50: {
                        if (!this.a(var7, true, var6_ref)) {
                          stackOut_122_0 = 0;
                          stackIn_123_0 = stackOut_122_0;
                          break L50;
                        } else {
                          stackOut_121_0 = 1;
                          stackIn_123_0 = stackOut_121_0;
                          break L50;
                        }
                      }
                      var5 = stackIn_123_0;
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
              L51: {
                if (!this.a(var7, true, var6_ref)) {
                  stackOut_127_0 = 0;
                  stackIn_128_0 = stackOut_127_0;
                  break L51;
                } else {
                  stackOut_126_0 = 1;
                  stackIn_128_0 = stackOut_126_0;
                  break L51;
                }
              }
              var5 = stackIn_128_0;
              break L45;
            }
            L52: {
              bm.a(96, 96, false, -30791, var6_ref);
              bm.a(48, 48, true, -30791, var7);
              if (((qj) this).field_w.field_k != 1) {
                break L52;
              } else {
                L53: {
                  var8_ref_j = ((qj) this).field_w.field_l[0];
                  if (var8_ref_j.field_qb > ((qj) this).field_i) {
                    L54: {
                      L55: {
                        L56: {
                          var9_long = ue.a(false);
                          this.a(gq.field_Yb, ((qj) this).field_i, var9_long + -fl.field_l, true, 1000);
                          fl.field_l = var9_long;
                          ((qj) this).field_i = var8_ref_j.field_qb;
                          this.a(((qj) this).field_w.field_b.field_b, var8_ref_j.field_ob, (byte) -125, var8_ref_j.field_qb);
                          if (((qj) this).field_i != 1) {
                            break L56;
                          } else {
                            if (0 == ((qj) this).field_w.field_b.field_b.field_h) {
                              var11 = var8_ref_j;
                              var8_ref_j.field_Q = 0;
                              var11.field_m = 0;
                              var8_ref_j.field_u = 0;
                              var12 = var8_ref_j;
                              var12.field_N = 0;
                              var13 = (vn) (Object) var8_ref_j.field_gb.d(-66);
                              L57: while (true) {
                                if (var13 == null) {
                                  break L56;
                                } else {
                                  var13.field_I = 0;
                                  var13 = (vn) (Object) var8_ref_j.field_gb.a((byte) 116);
                                  if (var14 != 0) {
                                    break L55;
                                  } else {
                                    if (var14 == 0) {
                                      continue L57;
                                    } else {
                                      break L56;
                                    }
                                  }
                                }
                              }
                            } else {
                              break L56;
                            }
                          }
                        }
                        if (((qj) this).field_i > 1) {
                          break L55;
                        } else {
                          if (((qj) this).field_w.field_b.field_b.field_h != 1) {
                            break L54;
                          } else {
                            break L55;
                          }
                        }
                      }
                      if (lc.a(0, -119)) {
                        if (!(oa.field_Sb instanceof dp)) {
                          break L54;
                        } else {
                          this.a(false, 239, 16);
                          break L54;
                        }
                      } else {
                        break L54;
                      }
                    }
                    if (~((qj) this).field_i <= ~((qj) this).field_w.field_b.a(95)) {
                      break L53;
                    } else {
                      w.field_r = lg.a(2, ((qj) this).field_w.field_b.a(((qj) this).field_i, (byte) -122), -1);
                      break L53;
                    }
                  } else {
                    break L53;
                  }
                }
                L58: {
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
                    break L58;
                  } else {
                    break L58;
                  }
                }
                L59: {
                  L60: {
                    if (var8_ref_j.field_qb > 0) {
                      break L60;
                    } else {
                      if (((qj) this).field_w.field_b.field_b.field_h != 0) {
                        break L60;
                      } else {
                        break L59;
                      }
                    }
                  }
                  L61: {
                    if (dp.field_r[0] <= var8_ref_j.field_m) {
                      this.b(0, -64, 255);
                      break L61;
                    } else {
                      break L61;
                    }
                  }
                  L62: {
                    if (~var8_ref_j.field_m > ~dp.field_r[1]) {
                      break L62;
                    } else {
                      this.b(1, 119, 254);
                      break L62;
                    }
                  }
                  L63: {
                    if (~var8_ref_j.field_m > ~dp.field_r[2]) {
                      break L63;
                    } else {
                      this.b(2, -42, 253);
                      break L63;
                    }
                  }
                  L64: {
                    if (dp.field_r[39] <= var8_ref_j.field_m) {
                      this.b(39, 109, 216);
                      break L64;
                    } else {
                      break L64;
                    }
                  }
                  L65: {
                    if (var8_ref_j.field_qb + -((qj) this).field_t < dp.field_r[3]) {
                      break L65;
                    } else {
                      this.a(false, 252, 3);
                      break L65;
                    }
                  }
                  L66: {
                    if (var8_ref_j.field_qb - ((qj) this).field_t < dp.field_r[4]) {
                      break L66;
                    } else {
                      this.a(false, 251, 4);
                      break L66;
                    }
                  }
                  L67: {
                    if (~var8_ref_j.field_qb <= ~(dp.field_r[5] - 1)) {
                      this.a(250, 67, 5);
                      break L67;
                    } else {
                      break L67;
                    }
                  }
                  L68: {
                    if (-1 + dp.field_r[6] > var8_ref_j.field_qb) {
                      break L68;
                    } else {
                      if (var8_ref_j.field_Z != 5) {
                        break L68;
                      } else {
                        this.a(249, 67, 6);
                        break L68;
                      }
                    }
                  }
                  L69: {
                    if (dp.field_r[7] <= var8_ref_j.field_ob) {
                      this.a((byte) 68, 7, 248);
                      break L69;
                    } else {
                      break L69;
                    }
                  }
                  L70: {
                    if (dp.field_r[8] <= var8_ref_j.field_ob) {
                      this.a((byte) 97, 8, 247);
                      break L70;
                    } else {
                      break L70;
                    }
                  }
                  L71: {
                    if (~var8_ref_j.field_ob <= ~dp.field_r[40]) {
                      this.a((byte) 39, 40, 215);
                      break L71;
                    } else {
                      break L71;
                    }
                  }
                  var9_ref = (vn) (Object) var8_ref_j.field_gb.d(-119);
                  L72: while (true) {
                    L73: {
                      L74: {
                        if (var9_ref == null) {
                          break L74;
                        } else {
                          stackOut_186_0 = ~dp.field_r[9];
                          stackOut_186_1 = ~var9_ref.field_I;
                          stackIn_195_0 = stackOut_186_0;
                          stackIn_195_1 = stackOut_186_1;
                          stackIn_187_0 = stackOut_186_0;
                          stackIn_187_1 = stackOut_186_1;
                          if (var14 != 0) {
                            break L73;
                          } else {
                            L75: {
                              if (stackIn_187_0 >= stackIn_187_1) {
                                this.b(9, 106, 246);
                                break L75;
                              } else {
                                break L75;
                              }
                            }
                            L76: {
                              if (var9_ref.field_I < dp.field_r[10]) {
                                break L76;
                              } else {
                                this.b(10, -52, 245);
                                if (var14 == 0) {
                                  break L74;
                                } else {
                                  break L76;
                                }
                              }
                            }
                            var9_ref = (vn) (Object) var8_ref_j.field_gb.a((byte) 116);
                            if (var14 == 0) {
                              continue L72;
                            } else {
                              break L74;
                            }
                          }
                        }
                      }
                      stackOut_194_0 = dp.field_r[22];
                      stackOut_194_1 = var8_ref_j.field_l;
                      stackIn_195_0 = stackOut_194_0;
                      stackIn_195_1 = stackOut_194_1;
                      break L73;
                    }
                    L77: {
                      if (stackIn_195_0 > stackIn_195_1) {
                        break L77;
                      } else {
                        this.b(22, -65, 233);
                        break L77;
                      }
                    }
                    L78: {
                      if (~var8_ref_j.field_hb > ~dp.field_r[29]) {
                        break L78;
                      } else {
                        this.b(29, 114, 226);
                        break L78;
                      }
                    }
                    L79: {
                      if (dp.field_r[30] > var8_ref_j.field_u) {
                        break L79;
                      } else {
                        this.b(30, -118, 225);
                        break L79;
                      }
                    }
                    L80: {
                      if (dp.field_r[31] > var8_ref_j.field_u) {
                        break L80;
                      } else {
                        this.b(31, -33, 224);
                        break L80;
                      }
                    }
                    L81: {
                      if (var8_ref_j.field_N < dp.field_r[32]) {
                        break L81;
                      } else {
                        this.b(32, -94, 223);
                        break L81;
                      }
                    }
                    L82: {
                      if (var8_ref_j.field_N < dp.field_r[33]) {
                        break L82;
                      } else {
                        this.b(33, 112, 222);
                        break L82;
                      }
                    }
                    L83: {
                      if (var8_ref_j.field_t >= dp.field_r[19]) {
                        this.b(19, 85, 236);
                        break L83;
                      } else {
                        break L83;
                      }
                    }
                    L84: {
                      if (~var8_ref_j.field_t > ~dp.field_r[20]) {
                        break L84;
                      } else {
                        this.b(20, -128, 235);
                        break L84;
                      }
                    }
                    if (~var8_ref_j.field_t <= ~dp.field_r[21]) {
                      this.b(21, 109, 234);
                      break L59;
                    } else {
                      break L59;
                    }
                  }
                }
                L85: {
                  if (dj.field_b != var8_ref_j.field_ob) {
                    dj.field_b = var8_ref_j.field_ob;
                    vd.field_d = Integer.toString(dj.field_b);
                    break L85;
                  } else {
                    break L85;
                  }
                }
                if (pg.field_m != 1 + pp.a(var8_ref_j, (byte) 59, ((qj) this).field_w)) {
                  L86: {
                    pg.field_m = pp.a(var8_ref_j, (byte) -100, ((qj) this).field_w) + 1;
                    if (pg.field_m < 10) {
                      stackOut_222_0 = "0" + pg.field_m;
                      stackIn_223_0 = stackOut_222_0;
                      break L86;
                    } else {
                      stackOut_221_0 = Integer.toString(pg.field_m);
                      stackIn_223_0 = stackOut_221_0;
                      break L86;
                    }
                  }
                  lq.field_e = stackIn_223_0;
                  break L52;
                } else {
                  break L52;
                }
              }
            }
            L87: {
              if (!((qj) this).field_p) {
                break L87;
              } else {
                if (((qj) this).field_o != 0) {
                  var8 = 0;
                  L88: while (true) {
                    L89: {
                      if (~var8 <= ~((qj) this).field_w.field_k) {
                        break L89;
                      } else {
                        if (var14 != 0) {
                          break L87;
                        } else {
                          L90: {
                            if ((((qj) this).field_o & 1 << var8) == 0) {
                              break L90;
                            } else {
                              if (((((qj) this).field_w.field_i | (((qj) this).field_w.field_a | ((qj) this).field_w.field_g)) & 1 << var8) != 0) {
                                break L90;
                              } else {
                                var9 = ((qj) this).field_w.field_l[var8];
                                if (var5 == 0) {
                                  break L90;
                                } else {
                                  if (0 != var9.field_F % 5) {
                                    break L90;
                                  } else {
                                    L91: {
                                      stackOut_234_0 = this;
                                      stackOut_234_1 = 120;
                                      stackOut_234_2 = var8;
                                      stackIn_236_0 = stackOut_234_0;
                                      stackIn_236_1 = stackOut_234_1;
                                      stackIn_236_2 = stackOut_234_2;
                                      stackIn_235_0 = stackOut_234_0;
                                      stackIn_235_1 = stackOut_234_1;
                                      stackIn_235_2 = stackOut_234_2;
                                      if (var9.field_F % 5 != 0) {
                                        stackOut_236_0 = this;
                                        stackOut_236_1 = stackIn_236_1;
                                        stackOut_236_2 = stackIn_236_2;
                                        stackOut_236_3 = 0;
                                        stackIn_237_0 = stackOut_236_0;
                                        stackIn_237_1 = stackOut_236_1;
                                        stackIn_237_2 = stackOut_236_2;
                                        stackIn_237_3 = stackOut_236_3;
                                        break L91;
                                      } else {
                                        stackOut_235_0 = this;
                                        stackOut_235_1 = stackIn_235_1;
                                        stackOut_235_2 = stackIn_235_2;
                                        stackOut_235_3 = 1;
                                        stackIn_237_0 = stackOut_235_0;
                                        stackIn_237_1 = stackOut_235_1;
                                        stackIn_237_2 = stackOut_235_2;
                                        stackIn_237_3 = stackOut_235_3;
                                        break L91;
                                      }
                                    }
                                    this.a((byte) stackIn_237_1, stackIn_237_2, stackIn_237_3 != 0);
                                    break L90;
                                  }
                                }
                              }
                            }
                          }
                          var8++;
                          if (var14 == 0) {
                            continue L88;
                          } else {
                            break L89;
                          }
                        }
                      }
                    }
                    break L87;
                  }
                } else {
                  break L87;
                }
              }
            }
            return;
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

    private final void e(int param0) {
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
                    this.e(0);
                    this.a(gq.field_Yb, ((qj) this).field_r, -fl.field_l + ue.a(false), false, 1000);
                    jj.field_d = jj.field_d | ja.a(((qj) this).field_t, ((qj) this).field_w.field_b, -1 + ((qj) this).field_r, true);
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
              L4: {
                if (((qj) this).field_w.field_k != 1) {
                  break L4;
                } else {
                  if (((qj) this).field_w.field_l[0].field_Z == 8) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              ((qj) this).a(param1, (byte) 69);
              if (!BrickABrac.field_J) {
                break L0;
              } else {
                break L3;
              }
            }
            ng.a(param1, 107, 18);
            ji.a(25459, true, cd.field_g, 1, 1, true);
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
          ji.a(25459, true, cd.field_g, 1, 1, true);
          break L0;
        }
        if (!((qj) this).field_p) {
          if (param1 == 69) {
            L2: {
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
                          break L2;
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
                break L2;
              }
              break L2;
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
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
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
            stackOut_16_0 = (RuntimeException) var4;
            stackOut_16_1 = new StringBuilder().append("qj.B(").append(param0).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
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
          throw qb.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + param2 + 41);
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
        int var4 = 0;
        j var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = BrickABrac.field_J ? 1 : 0;
        var4 = 17 % ((29 - param0) / 57);
        k.field_h.e(-13413, 68);
        k.field_h.p(62);
        var5 = ((qj) this).field_w.field_l[param1];
        var6 = 0;
        L0: while (true) {
          L1: {
            L2: {
              if (var6 >= 5) {
                break L2;
              } else {
                k.field_h.a(3, -17566, var5.field_vb[var6]);
                var6++;
                if (var7 != 0) {
                  break L1;
                } else {
                  if (var7 == 0) {
                    continue L0;
                  } else {
                    break L2;
                  }
                }
              }
            }
            k.field_h.q(-105);
            break L1;
          }
          return;
        }
    }

    final boolean a(char param0, int param1, int param2) {
        int var4_int = 0;
        j var4 = null;
        int var5 = 0;
        vn var5_ref_vn = null;
        int var6 = 0;
        j var7 = null;
        int stackIn_122_0 = 0;
        int stackIn_160_0 = 0;
        int stackIn_161_0 = 0;
        int stackOut_121_0 = 0;
        int stackOut_159_0 = 0;
        int stackOut_158_0 = 0;
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
                    if (84 == param2) {
                      im.b(-8);
                      return true;
                    } else {
                      return true;
                    }
                  } else {
                    break L15;
                  }
                }
              }
            }
            L16: {
              if (1 != ((qj) this).field_w.field_k) {
                break L16;
              } else {
                if (!((qj) this).field_y) {
                  break L16;
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
                              L17: {
                                if (param2 != 52) {
                                  break L17;
                                } else {
                                  ((qj) this).field_s = true;
                                  var7.field_ob = -20 + dp.field_r[8];
                                  break L17;
                                }
                              }
                              if (param2 != 53) {
                                if (param2 == 39) {
                                  var5_ref_vn = (vn) (Object) var4.field_gb.d(-114);
                                  L18: while (true) {
                                    L19: {
                                      L20: {
                                        if (var5_ref_vn == null) {
                                          break L20;
                                        } else {
                                          var5_ref_vn.field_I = dp.field_r[10] - 2;
                                          var5_ref_vn = (vn) (Object) var4.field_gb.a((byte) 116);
                                          if (var6 != 0) {
                                            break L19;
                                          } else {
                                            if (var6 == 0) {
                                              continue L18;
                                            } else {
                                              break L20;
                                            }
                                          }
                                        }
                                      }
                                      ((qj) this).field_s = true;
                                      break L19;
                                    }
                                    return true;
                                  }
                                } else {
                                  if (param2 != 54) {
                                    if (param2 == 55) {
                                      var5 = 0;
                                      L21: while (true) {
                                        L22: {
                                          if (29 <= var5) {
                                            break L22;
                                          } else {
                                            stackOut_121_0 = to.field_f[var5];
                                            stackIn_161_0 = stackOut_121_0;
                                            stackIn_122_0 = stackOut_121_0;
                                            if (var6 != 0) {
                                              return stackIn_161_0 != 0;
                                            } else {
                                              L23: {
                                                if (stackIn_122_0 > -1) {
                                                  var7.field_o[var5] = (byte)(-1 + to.field_f[var5]);
                                                  break L23;
                                                } else {
                                                  break L23;
                                                }
                                              }
                                              var5++;
                                              if (var6 == 0) {
                                                continue L21;
                                              } else {
                                                break L22;
                                              }
                                            }
                                          }
                                        }
                                        ((qj) this).field_s = true;
                                        return true;
                                      }
                                    } else {
                                      if (param2 == 56) {
                                        var4.field_rb = 5;
                                        ((qj) this).field_s = true;
                                        return true;
                                      } else {
                                        L24: {
                                          if (param2 < 16) {
                                            break L24;
                                          } else {
                                            if (25 < param2) {
                                              break L24;
                                            } else {
                                              L25: {
                                                var5 = -16 - (-param2 - 1);
                                                ((qj) this).field_s = true;
                                                if (!pe.field_l[81]) {
                                                  break L25;
                                                } else {
                                                  var5 += 10;
                                                  break L25;
                                                }
                                              }
                                              if (var5 <= 11) {
                                                oa.field_Sb = rd.a(var5, (byte) 19);
                                                return true;
                                              } else {
                                                break L24;
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
                                                          break L16;
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
                                    L26: {
                                      L27: {
                                        int fieldTemp$1 = var4.field_qb + 1;
                                        var4.field_qb = var4.field_qb + 1;
                                        if (tk.field_q > fieldTemp$1) {
                                          break L27;
                                        } else {
                                          var4.field_Z = 5;
                                          if (var6 == 0) {
                                            break L26;
                                          } else {
                                            break L27;
                                          }
                                        }
                                      }
                                      var4.field_Z = 0;
                                      break L26;
                                    }
                                    ((qj) this).field_s = true;
                                    var4.field_P = 0;
                                    return true;
                                  }
                                }
                              } else {
                                var5_ref_vn = (vn) (Object) var4.field_gb.d(-19);
                                L28: while (true) {
                                  L29: {
                                    L30: {
                                      if (var5_ref_vn == null) {
                                        break L30;
                                      } else {
                                        var5_ref_vn.field_I = dp.field_r[9] + -2;
                                        var5_ref_vn = (vn) (Object) var4.field_gb.a((byte) 116);
                                        if (var6 != 0) {
                                          break L29;
                                        } else {
                                          if (var6 == 0) {
                                            continue L28;
                                          } else {
                                            break L30;
                                          }
                                        }
                                      }
                                    }
                                    ((qj) this).field_s = true;
                                    break L29;
                                  }
                                  return true;
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
            L31: {
              if (pf.field_p) {
                stackOut_159_0 = 0;
                stackIn_160_0 = stackOut_159_0;
                break L31;
              } else {
                stackOut_158_0 = 1;
                stackIn_160_0 = stackOut_158_0;
                break L31;
              }
            }
            return stackIn_160_0 != 0;
          } else {
            L32: {
              L33: {
                var4_int = 1;
                if (((qj) this).field_p) {
                  break L33;
                } else {
                  L34: {
                    if (((qj) this).field_w.field_k == 1) {
                      break L34;
                    } else {
                      if (((qj) this).field_w.field_k == 2) {
                        var4_int = 17;
                        if (var6 == 0) {
                          break L32;
                        } else {
                          break L34;
                        }
                      } else {
                        break L32;
                      }
                    }
                  }
                  L35: {
                    var5 = ((qj) this).field_w.field_l[0].field_Z;
                    if (5 == var5) {
                      break L35;
                    } else {
                      if (9 == var5) {
                        break L35;
                      } else {
                        if (var5 == 3) {
                          break L35;
                        } else {
                          if (var5 == 8) {
                            break L35;
                          } else {
                            if (var6 == 0) {
                              break L32;
                            } else {
                              break L33;
                            }
                          }
                        }
                      }
                    }
                  }
                  return true;
                }
              }
              L36: {
                if (((qj) this).c(113)) {
                  break L36;
                } else {
                  L37: {
                    if (((qj) this).field_w.field_c) {
                      break L37;
                    } else {
                      if (((((qj) this).field_w.field_a | (((qj) this).field_w.field_i | ((qj) this).field_w.field_g)) & 1 << ((qj) this).field_k) != 0) {
                        break L37;
                      } else {
                        var4_int = 2;
                        if (var6 == 0) {
                          break L32;
                        } else {
                          break L37;
                        }
                      }
                    }
                  }
                  var4_int = 3;
                  if (var6 == 0) {
                    break L32;
                  } else {
                    break L36;
                  }
                }
              }
              var4_int = 4;
              break L32;
            }
            L38: {
              L39: {
                if (((qj) this).field_w.field_k == 1) {
                  break L39;
                } else {
                  if (!((qj) this).field_w.field_c) {
                    break L39;
                  } else {
                    if (200 >= be.field_j) {
                      break L38;
                    } else {
                      be.field_j = 299;
                      if (var6 == 0) {
                        break L38;
                      } else {
                        break L39;
                      }
                    }
                  }
                }
              }
              ng.a(false, 64, var4_int);
              break L38;
            }
            return true;
          }
        } else {
          return false;
        }
    }

    private final void a(int param0, int param1, long param2, boolean param3, int param4) {
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
        if (param0) {
            ((qj) this).field_q = true;
        }
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
        int var4 = 0;
        var4 = BrickABrac.field_J ? 1 : 0;
        if (param0 == 119) {
          var3 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (var3 >= ((qj) this).field_w.field_l.length) {
                  break L2;
                } else {
                  ((qj) this).field_w.field_l[var3].field_qb = param1;
                  var3++;
                  if (var4 != 0) {
                    break L1;
                  } else {
                    if (var4 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                if (((qj) this).field_w.field_k != 1) {
                  break L3;
                } else {
                  ((qj) this).field_t = param1;
                  ((qj) this).field_i = param1;
                  var3 = param1;
                  fp.field_z = fp.field_z + var3;
                  w.field_r = lg.a(2, ((qj) this).field_w.field_b.a(((qj) this).field_i, (byte) -122), -1);
                  break L3;
                }
              }
              break L1;
            }
            return;
          }
        } else {
          return;
        }
    }

    final static void b(byte param0, boolean param1) {
        int var2 = 9 % ((param0 - -73) / 49);
        String[] var3 = new String[]{tb.field_cb == null ? we.field_c : tb.field_cb, pg.field_q};
        oi var4 = new oi(qh.field_b, kk.a(false, qh.field_b.field_i, hi.field_w), 3);
        r.field_A = false;
        oa.field_Sb = rd.a(0, (byte) 19);
        sk.a(var3, 0, var4, 2, param1, -12665);
    }

    final void a(pi param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        boolean stackIn_5_0 = false;
        boolean stackIn_6_0 = false;
        boolean stackIn_7_0 = false;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_4_0 = false;
        boolean stackOut_6_0 = false;
        int stackOut_6_1 = 0;
        boolean stackOut_5_0 = false;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
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
                        byte dupTemp$2 = param0.b(true);
                        ((qj) this).field_w.field_m[var3_int] = dupTemp$2;
                        stackOut_4_0 = op.field_a;
                        stackIn_6_0 = stackOut_4_0;
                        stackIn_5_0 = stackOut_4_0;
                        if (0 > dupTemp$2) {
                          stackOut_6_0 = stackIn_6_0;
                          stackOut_6_1 = 0;
                          stackIn_7_0 = stackOut_6_0;
                          stackIn_7_1 = stackOut_6_1;
                          break L4;
                        } else {
                          stackOut_5_0 = stackIn_5_0;
                          stackOut_5_1 = 1;
                          stackIn_7_0 = stackOut_5_0;
                          stackIn_7_1 = stackOut_5_1;
                          break L4;
                        }
                      }
                      op.field_a = stackIn_7_0 | stackIn_7_1 != 0;
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
            stackOut_10_0 = (RuntimeException) runtimeException;
            stackOut_10_1 = new StringBuilder().append("qj.Q(");
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
              break L5;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L5;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 44 + param1 + 41);
        }
    }

    public static void d(int param0) {
        field_u = null;
        field_l = null;
        int var1 = 47 / ((param0 - 14) / 59);
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
            if (!(~(255 ^ var5) == ~var4)) {
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
        int var5 = 0;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (this.a(param1, 1)) {
          return;
        } else {
          if (param0 > 17) {
            L0: {
              if (!((qj) this).field_s) {
                L1: {
                  L2: {
                    if (param1 != 7) {
                      break L2;
                    } else {
                      fp.field_z = fp.field_z - ((qj) this).field_t;
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  ep.field_i = ep.field_i - ((qj) this).field_t;
                  break L1;
                }
                L3: {
                  lp.field_wb.a((nm) (Object) new e(param1, param2, fp.field_z, ep.field_i, od.field_c, og.field_Wb), (byte) 3);
                  if (param1 == 7) {
                    break L3;
                  } else {
                    ep.field_i = ep.field_i + ((qj) this).field_t;
                    if (var5 == 0) {
                      break L0;
                    } else {
                      break L3;
                    }
                  }
                }
                fp.field_z = fp.field_z + ((qj) this).field_t;
                break L0;
              } else {
                break L0;
              }
            }
            return;
          } else {
            return;
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
        p var10_ref_p = null;
        int var10 = 0;
        Object var11 = null;
        int var12 = 0;
        int var13 = 0;
        j var14 = null;
        vl stackIn_4_0 = null;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        boolean stackIn_20_0 = false;
        int stackIn_49_0 = 0;
        int stackIn_49_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_52_1 = 0;
        j stackIn_54_0 = null;
        int stackIn_61_0 = 0;
        int stackIn_61_1 = 0;
        int stackIn_84_0 = 0;
        int stackIn_84_1 = 0;
        int stackIn_91_0 = 0;
        int stackIn_91_1 = 0;
        int stackIn_96_0 = 0;
        int stackIn_96_1 = 0;
        int stackIn_105_0 = 0;
        int stackIn_105_1 = 0;
        j stackIn_114_0 = null;
        int stackIn_121_0 = 0;
        RuntimeException stackIn_123_0 = null;
        StringBuilder stackIn_123_1 = null;
        RuntimeException stackIn_124_0 = null;
        StringBuilder stackIn_124_1 = null;
        RuntimeException stackIn_125_0 = null;
        StringBuilder stackIn_125_1 = null;
        String stackIn_125_2 = null;
        RuntimeException stackIn_126_0 = null;
        StringBuilder stackIn_126_1 = null;
        RuntimeException stackIn_127_0 = null;
        StringBuilder stackIn_127_1 = null;
        RuntimeException stackIn_128_0 = null;
        StringBuilder stackIn_128_1 = null;
        String stackIn_128_2 = null;
        RuntimeException decompiledCaughtException = null;
        vl stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_5_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        boolean stackOut_19_0 = false;
        boolean stackOut_48_0 = false;
        int stackOut_48_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_51_1 = 0;
        j stackOut_53_0 = null;
        int stackOut_60_0 = 0;
        int stackOut_60_1 = 0;
        int stackOut_83_0 = 0;
        int stackOut_83_1 = 0;
        int stackOut_90_0 = 0;
        int stackOut_90_1 = 0;
        int stackOut_95_0 = 0;
        int stackOut_95_1 = 0;
        int stackOut_104_0 = 0;
        int stackOut_104_1 = 0;
        j stackOut_113_0 = null;
        int stackOut_120_0 = 0;
        RuntimeException stackOut_122_0 = null;
        StringBuilder stackOut_122_1 = null;
        RuntimeException stackOut_124_0 = null;
        StringBuilder stackOut_124_1 = null;
        String stackOut_124_2 = null;
        RuntimeException stackOut_123_0 = null;
        StringBuilder stackOut_123_1 = null;
        String stackOut_123_2 = null;
        RuntimeException stackOut_125_0 = null;
        StringBuilder stackOut_125_1 = null;
        RuntimeException stackOut_127_0 = null;
        StringBuilder stackOut_127_1 = null;
        String stackOut_127_2 = null;
        RuntimeException stackOut_126_0 = null;
        StringBuilder stackOut_126_1 = null;
        String stackOut_126_2 = null;
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
              stackOut_5_0 = ~var6_int;
              stackIn_6_0 = stackOut_5_0;
              L3: while (true) {
                L4: {
                  L5: {
                    if (stackIn_6_0 <= ~((qj) this).field_w.field_k) {
                      break L5;
                    } else {
                      var7_ref_j = ((qj) this).field_w.field_l[var6_int];
                      stackOut_7_0 = ~(1 << var6_int & (((qj) this).field_w.field_i | (((qj) this).field_w.field_g | ((qj) this).field_w.field_a)));
                      stackOut_7_1 = -1;
                      stackIn_49_0 = stackOut_7_0;
                      stackIn_49_1 = stackOut_7_1;
                      stackIn_8_0 = stackOut_7_0;
                      stackIn_8_1 = stackOut_7_1;
                      if (var13 != 0) {
                        break L4;
                      } else {
                        L6: {
                          if (stackIn_8_0 == stackIn_8_1) {
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
                                        stackOut_19_0 = var10_ref_p.c(1);
                                        stackIn_6_0 = stackOut_19_0 ? 1 : 0;
                                        stackIn_20_0 = stackOut_19_0;
                                        if (var13 != 0) {
                                          continue L3;
                                        } else {
                                          L14: {
                                            if (!stackIn_20_0) {
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
                  stackOut_48_0 = param1;
                  stackOut_48_1 = 1;
                  stackIn_49_0 = stackOut_48_0 ? 1 : 0;
                  stackIn_49_1 = stackOut_48_1;
                  break L4;
                }
                L22: {
                  if (stackIn_49_0 == stackIn_49_1) {
                    break L22;
                  } else {
                    ((qj) this).field_k = 29;
                    break L22;
                  }
                }
                L23: while (true) {
                  stackOut_51_0 = ((qj) this).field_w.field_k;
                  stackOut_51_1 = var6_int;
                  stackIn_52_0 = stackOut_51_0;
                  stackIn_52_1 = stackOut_51_1;
                  L24: while (true) {
                    L25: {
                      L26: {
                        L27: {
                          if (stackIn_52_0 <= stackIn_52_1) {
                            break L27;
                          } else {
                            var14 = ((qj) this).field_w.field_l[var6_int];
                            var7_ref_j = var14;
                            var8_int = 0;
                            stackOut_53_0 = (j) var7_ref_j;
                            stackIn_114_0 = stackOut_53_0;
                            stackIn_54_0 = stackOut_53_0;
                            if (var13 != 0) {
                              break L26;
                            } else {
                              var9_ref_ge = (ge) (Object) ((vl) (Object) stackIn_54_0.field_pb).d(-48);
                              L28: while (true) {
                                L29: {
                                  if (var9_ref_ge == null) {
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
                                      stackOut_60_0 = to.field_f[var9];
                                      stackOut_60_1 = 1;
                                      stackIn_52_0 = stackOut_60_0;
                                      stackIn_52_1 = stackOut_60_1;
                                      stackIn_61_0 = stackOut_60_0;
                                      stackIn_61_1 = stackOut_60_1;
                                      if (var13 != 0) {
                                        continue L24;
                                      } else {
                                        L32: {
                                          L33: {
                                            if (stackIn_61_0 >= stackIn_61_1) {
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
                                            var10 = (20 * var14.field_o[var9] << 8) / to.field_f[var9];
                                            if ((1 << var9 & var8_int) == 0) {
                                              break L34;
                                            } else {
                                              var10 = 5120;
                                              break L34;
                                            }
                                          }
                                          L35: {
                                            var14.field_xb[var9] = var14.field_xb[var9] + (-var14.field_cb[var9] + var10) / 100;
                                            var7_ref_j.field_xb[var9] = 7 * var14.field_xb[var9] / 8;
                                            if (512 >= var14.field_xb[var9]) {
                                              break L35;
                                            } else {
                                              var14.field_xb[var9] = 512;
                                              break L35;
                                            }
                                          }
                                          L36: {
                                            if (var14.field_xb[var9] < -512) {
                                              var14.field_xb[var9] = -512;
                                              break L36;
                                            } else {
                                              break L36;
                                            }
                                          }
                                          L37: {
                                            L38: {
                                              var14.field_cb[var9] = var14.field_cb[var9] + var14.field_xb[var9];
                                              if (var14.field_xb[var9] <= 0) {
                                                break L38;
                                              } else {
                                                if (var14.field_cb[var9] > var10) {
                                                  break L37;
                                                } else {
                                                  break L38;
                                                }
                                              }
                                            }
                                            if (var14.field_xb[var9] >= 0) {
                                              break L32;
                                            } else {
                                              if (~var10 < ~var14.field_cb[var9]) {
                                                break L37;
                                              } else {
                                                break L32;
                                              }
                                            }
                                          }
                                          var14.field_cb[var9] = var10;
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
                                  var8_int = var7_ref_j.field_p + var7_ref_j.field_ub << 8;
                                  var7_ref_j.field_J = var7_ref_j.field_J + (var8_int + -var7_ref_j.field_G) / 100;
                                  var7_ref_j.field_J = 7 * var7_ref_j.field_J / 8;
                                  stackOut_83_0 = var7_ref_j.field_J;
                                  stackOut_83_1 = 1280;
                                  stackIn_91_0 = stackOut_83_0;
                                  stackIn_91_1 = stackOut_83_1;
                                  stackIn_84_0 = stackOut_83_0;
                                  stackIn_84_1 = stackOut_83_1;
                                  if (var13 != 0) {
                                    break L39;
                                  } else {
                                    L42: {
                                      if (stackIn_84_0 > stackIn_84_1) {
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
                          stackOut_90_0 = -2;
                          stackOut_90_1 = ~((qj) this).field_w.field_k;
                          stackIn_91_0 = stackOut_90_0;
                          stackIn_91_1 = stackOut_90_1;
                          break L39;
                        }
                        L44: {
                          L45: {
                            if (stackIn_91_0 > stackIn_91_1) {
                              var6_int = ((qj) this).field_w.a(125);
                              var7 = 0;
                              L46: while (true) {
                                if (~((qj) this).field_w.field_k >= ~var7) {
                                  break L45;
                                } else {
                                  var8 = ((qj) this).field_w.field_l[var7];
                                  stackOut_95_0 = -1;
                                  stackOut_95_1 = ~(1 << var7 & var6_int);
                                  stackIn_105_0 = stackOut_95_0;
                                  stackIn_105_1 = stackOut_95_1;
                                  stackIn_96_0 = stackOut_95_0;
                                  stackIn_96_1 = stackOut_95_1;
                                  if (var13 != 0) {
                                    break L44;
                                  } else {
                                    L47: {
                                      L48: {
                                        if (stackIn_96_0 != stackIn_96_1) {
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
                            stackOut_104_0 = ~((qj) this).field_w.field_k;
                            stackOut_104_1 = -2;
                            stackIn_105_0 = stackOut_104_0;
                            stackIn_105_1 = stackOut_104_1;
                            break L44;
                          } else {
                            break L25;
                          }
                        }
                        L49: {
                          if (stackIn_105_0 == stackIn_105_1) {
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
                        stackOut_113_0 = ((qj) this).field_w.field_l[0];
                        stackIn_114_0 = stackOut_113_0;
                        break L26;
                      }
                      L52: {
                        var6 = stackIn_114_0;
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
                    stackOut_120_0 = var4_int;
                    stackIn_121_0 = stackOut_120_0;
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
            stackOut_122_0 = (RuntimeException) var4;
            stackOut_122_1 = new StringBuilder().append("qj.P(");
            stackIn_124_0 = stackOut_122_0;
            stackIn_124_1 = stackOut_122_1;
            stackIn_123_0 = stackOut_122_0;
            stackIn_123_1 = stackOut_122_1;
            if (param0 == null) {
              stackOut_124_0 = (RuntimeException) (Object) stackIn_124_0;
              stackOut_124_1 = (StringBuilder) (Object) stackIn_124_1;
              stackOut_124_2 = "null";
              stackIn_125_0 = stackOut_124_0;
              stackIn_125_1 = stackOut_124_1;
              stackIn_125_2 = stackOut_124_2;
              break L53;
            } else {
              stackOut_123_0 = (RuntimeException) (Object) stackIn_123_0;
              stackOut_123_1 = (StringBuilder) (Object) stackIn_123_1;
              stackOut_123_2 = "{...}";
              stackIn_125_0 = stackOut_123_0;
              stackIn_125_1 = stackOut_123_1;
              stackIn_125_2 = stackOut_123_2;
              break L53;
            }
          }
          L54: {
            stackOut_125_0 = (RuntimeException) (Object) stackIn_125_0;
            stackOut_125_1 = ((StringBuilder) (Object) stackIn_125_1).append(stackIn_125_2).append(44).append(param1).append(44);
            stackIn_127_0 = stackOut_125_0;
            stackIn_127_1 = stackOut_125_1;
            stackIn_126_0 = stackOut_125_0;
            stackIn_126_1 = stackOut_125_1;
            if (param2 == null) {
              stackOut_127_0 = (RuntimeException) (Object) stackIn_127_0;
              stackOut_127_1 = (StringBuilder) (Object) stackIn_127_1;
              stackOut_127_2 = "null";
              stackIn_128_0 = stackOut_127_0;
              stackIn_128_1 = stackOut_127_1;
              stackIn_128_2 = stackOut_127_2;
              break L54;
            } else {
              stackOut_126_0 = (RuntimeException) (Object) stackIn_126_0;
              stackOut_126_1 = (StringBuilder) (Object) stackIn_126_1;
              stackOut_126_2 = "{...}";
              stackIn_128_0 = stackOut_126_0;
              stackIn_128_1 = stackOut_126_1;
              stackIn_128_2 = stackOut_126_2;
              break L54;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_128_0, stackIn_128_2 + 41);
        }
        return stackIn_121_0 != 0;
    }

    private final void a(nc param0, int param1, byte param2, int param3) {
        pn var5 = null;
        RuntimeException var5_ref = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
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
            stackOut_7_0 = (RuntimeException) var5_ref;
            stackOut_7_1 = new StringBuilder().append("qj.AA(");
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
          throw qb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
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
                L7: {
                  if (((qj) this).field_w.field_k == 1) {
                    break L7;
                  } else {
                    if (!((qj) this).field_p) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                L8: {
                  if (!pe.field_l[ah.field_w[1][0]]) {
                    break L8;
                  } else {
                    param1.field_db = param1.field_db | 1;
                    break L8;
                  }
                }
                L9: {
                  if (!pe.field_l[ah.field_w[1][1]]) {
                    break L9;
                  } else {
                    param1.field_db = param1.field_db | 2;
                    break L9;
                  }
                }
                if (pe.field_l[ah.field_w[1][2]]) {
                  param1.field_db = param1.field_db | 4;
                  break L6;
                } else {
                  break L5;
                }
              }
              break L5;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
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
              break L10;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L10;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + 41);
        }
    }

    private final void g(int param0) {
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
        int stackIn_5_0 = 0;
        int stackIn_5_1 = 0;
        int stackIn_21_0 = 0;
        int stackIn_21_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_36_0 = 0;
        int stackIn_36_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_60_0 = 0;
        int stackIn_63_0 = 0;
        boolean stackIn_64_0 = false;
        int stackIn_64_1 = 0;
        int stackIn_64_2 = 0;
        boolean stackIn_65_0 = false;
        int stackIn_65_1 = 0;
        int stackIn_65_2 = 0;
        boolean stackIn_66_0 = false;
        int stackIn_66_1 = 0;
        int stackIn_66_2 = 0;
        boolean stackIn_67_0 = false;
        int stackIn_67_1 = 0;
        int stackIn_67_2 = 0;
        boolean stackIn_68_0 = false;
        int stackIn_68_1 = 0;
        int stackIn_68_2 = 0;
        int stackIn_68_3 = 0;
        boolean stackIn_69_0 = false;
        int stackIn_69_1 = 0;
        int stackIn_69_2 = 0;
        int stackIn_69_3 = 0;
        j stackIn_69_4 = null;
        int stackIn_69_5 = 0;
        int stackIn_69_6 = 0;
        boolean stackIn_70_0 = false;
        int stackIn_70_1 = 0;
        int stackIn_70_2 = 0;
        int stackIn_70_3 = 0;
        j stackIn_70_4 = null;
        int stackIn_70_5 = 0;
        int stackIn_70_6 = 0;
        boolean stackIn_71_0 = false;
        int stackIn_71_1 = 0;
        int stackIn_71_2 = 0;
        int stackIn_71_3 = 0;
        j stackIn_71_4 = null;
        int stackIn_71_5 = 0;
        int stackIn_71_6 = 0;
        boolean stackIn_72_0 = false;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
        int stackIn_72_3 = 0;
        j stackIn_72_4 = null;
        int stackIn_72_5 = 0;
        int stackIn_72_6 = 0;
        boolean stackIn_73_0 = false;
        int stackIn_73_1 = 0;
        int stackIn_73_2 = 0;
        int stackIn_73_3 = 0;
        j stackIn_73_4 = null;
        int stackIn_73_5 = 0;
        int stackIn_73_6 = 0;
        int stackIn_73_7 = 0;
        int stackIn_76_0 = 0;
        boolean stackIn_77_0 = false;
        int stackIn_77_1 = 0;
        int stackIn_77_2 = 0;
        boolean stackIn_78_0 = false;
        int stackIn_78_1 = 0;
        int stackIn_78_2 = 0;
        boolean stackIn_79_0 = false;
        int stackIn_79_1 = 0;
        int stackIn_79_2 = 0;
        boolean stackIn_80_0 = false;
        int stackIn_80_1 = 0;
        int stackIn_80_2 = 0;
        boolean stackIn_81_0 = false;
        int stackIn_81_1 = 0;
        int stackIn_81_2 = 0;
        int stackIn_81_3 = 0;
        boolean stackIn_82_0 = false;
        int stackIn_82_1 = 0;
        int stackIn_82_2 = 0;
        int stackIn_82_3 = 0;
        j stackIn_82_4 = null;
        int stackIn_82_5 = 0;
        int stackIn_82_6 = 0;
        boolean stackIn_83_0 = false;
        int stackIn_83_1 = 0;
        int stackIn_83_2 = 0;
        int stackIn_83_3 = 0;
        j stackIn_83_4 = null;
        int stackIn_83_5 = 0;
        int stackIn_83_6 = 0;
        boolean stackIn_84_0 = false;
        int stackIn_84_1 = 0;
        int stackIn_84_2 = 0;
        int stackIn_84_3 = 0;
        j stackIn_84_4 = null;
        int stackIn_84_5 = 0;
        int stackIn_84_6 = 0;
        boolean stackIn_85_0 = false;
        int stackIn_85_1 = 0;
        int stackIn_85_2 = 0;
        int stackIn_85_3 = 0;
        j stackIn_85_4 = null;
        int stackIn_85_5 = 0;
        int stackIn_85_6 = 0;
        boolean stackIn_86_0 = false;
        int stackIn_86_1 = 0;
        int stackIn_86_2 = 0;
        int stackIn_86_3 = 0;
        j stackIn_86_4 = null;
        int stackIn_86_5 = 0;
        int stackIn_86_6 = 0;
        int stackIn_86_7 = 0;
        int stackIn_90_0 = 0;
        boolean stackIn_91_0 = false;
        int stackIn_91_1 = 0;
        int stackIn_91_2 = 0;
        boolean stackIn_92_0 = false;
        int stackIn_92_1 = 0;
        int stackIn_92_2 = 0;
        boolean stackIn_93_0 = false;
        int stackIn_93_1 = 0;
        int stackIn_93_2 = 0;
        boolean stackIn_94_0 = false;
        int stackIn_94_1 = 0;
        int stackIn_94_2 = 0;
        boolean stackIn_95_0 = false;
        int stackIn_95_1 = 0;
        int stackIn_95_2 = 0;
        int stackIn_95_3 = 0;
        int stackOut_4_0 = 0;
        int stackOut_4_1 = 0;
        int stackOut_20_0 = 0;
        int stackOut_20_1 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_56_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_59_0 = 0;
        int stackOut_58_0 = 0;
        int stackOut_62_0 = 0;
        int stackOut_61_0 = 0;
        boolean stackOut_63_0 = false;
        int stackOut_63_1 = 0;
        int stackOut_63_2 = 0;
        boolean stackOut_64_0 = false;
        int stackOut_64_1 = 0;
        int stackOut_64_2 = 0;
        boolean stackOut_67_0 = false;
        int stackOut_67_1 = 0;
        int stackOut_67_2 = 0;
        int stackOut_67_3 = 0;
        boolean stackOut_65_0 = false;
        int stackOut_65_1 = 0;
        int stackOut_65_2 = 0;
        boolean stackOut_66_0 = false;
        int stackOut_66_1 = 0;
        int stackOut_66_2 = 0;
        int stackOut_66_3 = 0;
        boolean stackOut_68_0 = false;
        int stackOut_68_1 = 0;
        int stackOut_68_2 = 0;
        int stackOut_68_3 = 0;
        j stackOut_68_4 = null;
        int stackOut_68_5 = 0;
        int stackOut_68_6 = 0;
        boolean stackOut_69_0 = false;
        int stackOut_69_1 = 0;
        int stackOut_69_2 = 0;
        int stackOut_69_3 = 0;
        j stackOut_69_4 = null;
        int stackOut_69_5 = 0;
        int stackOut_69_6 = 0;
        boolean stackOut_72_0 = false;
        int stackOut_72_1 = 0;
        int stackOut_72_2 = 0;
        int stackOut_72_3 = 0;
        j stackOut_72_4 = null;
        int stackOut_72_5 = 0;
        int stackOut_72_6 = 0;
        int stackOut_72_7 = 0;
        boolean stackOut_70_0 = false;
        int stackOut_70_1 = 0;
        int stackOut_70_2 = 0;
        int stackOut_70_3 = 0;
        j stackOut_70_4 = null;
        int stackOut_70_5 = 0;
        int stackOut_70_6 = 0;
        boolean stackOut_71_0 = false;
        int stackOut_71_1 = 0;
        int stackOut_71_2 = 0;
        int stackOut_71_3 = 0;
        j stackOut_71_4 = null;
        int stackOut_71_5 = 0;
        int stackOut_71_6 = 0;
        int stackOut_71_7 = 0;
        int stackOut_75_0 = 0;
        int stackOut_74_0 = 0;
        boolean stackOut_76_0 = false;
        int stackOut_76_1 = 0;
        int stackOut_76_2 = 0;
        boolean stackOut_77_0 = false;
        int stackOut_77_1 = 0;
        int stackOut_77_2 = 0;
        boolean stackOut_80_0 = false;
        int stackOut_80_1 = 0;
        int stackOut_80_2 = 0;
        int stackOut_80_3 = 0;
        boolean stackOut_78_0 = false;
        int stackOut_78_1 = 0;
        int stackOut_78_2 = 0;
        boolean stackOut_79_0 = false;
        int stackOut_79_1 = 0;
        int stackOut_79_2 = 0;
        int stackOut_79_3 = 0;
        boolean stackOut_81_0 = false;
        int stackOut_81_1 = 0;
        int stackOut_81_2 = 0;
        int stackOut_81_3 = 0;
        j stackOut_81_4 = null;
        int stackOut_81_5 = 0;
        int stackOut_81_6 = 0;
        boolean stackOut_82_0 = false;
        int stackOut_82_1 = 0;
        int stackOut_82_2 = 0;
        int stackOut_82_3 = 0;
        j stackOut_82_4 = null;
        int stackOut_82_5 = 0;
        int stackOut_82_6 = 0;
        boolean stackOut_85_0 = false;
        int stackOut_85_1 = 0;
        int stackOut_85_2 = 0;
        int stackOut_85_3 = 0;
        j stackOut_85_4 = null;
        int stackOut_85_5 = 0;
        int stackOut_85_6 = 0;
        int stackOut_85_7 = 0;
        boolean stackOut_83_0 = false;
        int stackOut_83_1 = 0;
        int stackOut_83_2 = 0;
        int stackOut_83_3 = 0;
        j stackOut_83_4 = null;
        int stackOut_83_5 = 0;
        int stackOut_83_6 = 0;
        boolean stackOut_84_0 = false;
        int stackOut_84_1 = 0;
        int stackOut_84_2 = 0;
        int stackOut_84_3 = 0;
        j stackOut_84_4 = null;
        int stackOut_84_5 = 0;
        int stackOut_84_6 = 0;
        int stackOut_84_7 = 0;
        int stackOut_89_0 = 0;
        int stackOut_88_0 = 0;
        boolean stackOut_90_0 = false;
        int stackOut_90_1 = 0;
        int stackOut_90_2 = 0;
        boolean stackOut_91_0 = false;
        int stackOut_91_1 = 0;
        int stackOut_91_2 = 0;
        boolean stackOut_94_0 = false;
        int stackOut_94_1 = 0;
        int stackOut_94_2 = 0;
        int stackOut_94_3 = 0;
        boolean stackOut_92_0 = false;
        int stackOut_92_1 = 0;
        int stackOut_92_2 = 0;
        boolean stackOut_93_0 = false;
        int stackOut_93_1 = 0;
        int stackOut_93_2 = 0;
        int stackOut_93_3 = 0;
        L0: {
          L1: {
            L2: {
              L3: {
                var11 = BrickABrac.field_J ? 1 : 0;
                var4 = 25;
                var2 = kh.field_c[((qj) this).field_w.field_k - 1];
                var3 = kh.field_e[((qj) this).field_w.field_k - 1];
                var5 = kh.field_h[-1 + ((qj) this).field_w.field_k];
                var6 = ((qj) this).field_m;
                if (null != oa.field_Sb) {
                  var7 = 0;
                  L4: while (true) {
                    if (~var7 <= ~((qj) this).field_w.field_k) {
                      break L3;
                    } else {
                      var8 = ((qj) this).field_w.field_l[var6].field_yb;
                      stackOut_4_0 = 1;
                      stackOut_4_1 = ((qj) this).field_w.field_k;
                      stackIn_21_0 = stackOut_4_0;
                      stackIn_21_1 = stackOut_4_1;
                      stackIn_5_0 = stackOut_4_0;
                      stackIn_5_1 = stackOut_4_1;
                      if (var11 != 0) {
                        break L2;
                      } else {
                        L5: {
                          if (stackIn_5_0 == stackIn_5_1) {
                            L6: {
                              L7: {
                                var9 = (-((var8.field_j - -(var8.field_u / 2) << 8) * 2) + 33423360) / 510;
                                oa.field_Sb.a(true, var9, 0, 0, 0);
                                if (oa.field_Sb.field_m == 7) {
                                  break L7;
                                } else {
                                  if (((qj) this).field_w.field_l[var6].field_Z == 5) {
                                    break L7;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              gh.a(121, true);
                              break L6;
                            }
                            if (km.field_i > 0) {
                              var10 = km.field_i * 256 / 32;
                              nk.field_c.b(0, 0, var10);
                              if (var11 == 0) {
                                break L3;
                              } else {
                                break L5;
                              }
                            } else {
                              break L3;
                            }
                          } else {
                            break L5;
                          }
                        }
                        L8: {
                          L9: {
                            if (var5[var7] != 1) {
                              break L9;
                            } else {
                              vi.a((byte) 76, 306 + var2[var7], var2[var7], var3[var7], var3[var7] - -480);
                              var9 = (-(2 * (var8.field_j - -(var8.field_u / 2) << 8)) + 20054016) / 306;
                              oa.field_Sb.a(var3[var7], (byte) -107, var2[var7], var6, var9 / 2);
                              sc.b(-122);
                              if (var11 == 0) {
                                break L8;
                              } else {
                                break L9;
                              }
                            }
                          }
                          vi.a((byte) 124, 153 + var2[var7], var2[var7], var3[var7], 233 + var3[var7]);
                          oa.field_Sb.a((byte) -102, var6, var2[var7], var3[var7]);
                          sc.b(-79);
                          break L8;
                        }
                        var6++;
                        var6 = var6 % ((qj) this).field_w.field_k;
                        var7++;
                        if (var11 == 0) {
                          continue L4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                } else {
                  break L3;
                }
              }
              if (oa.field_Sb != null) {
                stackOut_20_0 = ((qj) this).field_w.field_k;
                stackOut_20_1 = 2;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                break L2;
              } else {
                break L1;
              }
            }
            if (stackIn_21_0 <= stackIn_21_1) {
              break L1;
            } else {
              var7 = ((qj) this).field_w.field_k;
              L10: while (true) {
                if (var7 >= 5) {
                  break L1;
                } else {
                  oa.field_Sb.a((byte) -79, -1, var2[var7], var3[var7]);
                  lb.d(var2[var7], var3[var7], 153, 233, 0, 160);
                  var7++;
                  if (var11 != 0) {
                    break L0;
                  } else {
                    if (var11 == 0) {
                      continue L10;
                    } else {
                      break L1;
                    }
                  }
                }
              }
            }
          }
          var6 = ((qj) this).field_m;
          break L0;
        }
        var7 = 0;
        L11: while (true) {
          L12: {
            L13: {
              if (var7 >= ((qj) this).field_w.field_k) {
                break L13;
              } else {
                stackOut_30_0 = ~tn.field_C;
                stackOut_30_1 = ~var5[var7];
                stackIn_36_0 = stackOut_30_0;
                stackIn_36_1 = stackOut_30_1;
                stackIn_31_0 = stackOut_30_0;
                stackIn_31_1 = stackOut_30_1;
                if (var11 != 0) {
                  break L12;
                } else {
                  L14: {
                    if (stackIn_31_0 != stackIn_31_1) {
                      gr.b(var5[var7], -28463);
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  pi.a((byte) 90, var6, var5[var7], var3[var7], ((qj) this).field_w, var2[var7]);
                  var6++;
                  var6 = var6 % ((qj) this).field_w.field_k;
                  var7++;
                  if (var11 == 0) {
                    continue L11;
                  } else {
                    break L13;
                  }
                }
              }
            }
            stackOut_35_0 = ~((qj) this).field_w.field_k;
            stackOut_35_1 = -2;
            stackIn_36_0 = stackOut_35_0;
            stackIn_36_1 = stackOut_35_1;
            break L12;
          }
          L15: {
            if (stackIn_36_0 != stackIn_36_1) {
              L16: {
                if (2 != ((qj) this).field_w.field_k) {
                  break L16;
                } else {
                  L17: {
                    if (((qj) this).field_p) {
                      stackOut_51_0 = 0;
                      stackIn_52_0 = stackOut_51_0;
                      break L17;
                    } else {
                      stackOut_50_0 = 1;
                      stackIn_52_0 = stackOut_50_0;
                      break L17;
                    }
                  }
                  L18: {
                    L19: {
                      var7 = stackIn_52_0;
                      if (!((qj) this).field_p) {
                        break L19;
                      } else {
                        if (((qj) this).field_o != 0) {
                          stackOut_56_0 = 0;
                          stackIn_57_0 = stackOut_56_0;
                          break L18;
                        } else {
                          break L19;
                        }
                      }
                    }
                    stackOut_55_0 = 1;
                    stackIn_57_0 = stackOut_55_0;
                    break L18;
                  }
                  L20: {
                    var8_int = stackIn_57_0;
                    if (((qj) this).field_p) {
                      stackOut_59_0 = ((qj) this).field_m;
                      stackIn_60_0 = stackOut_59_0;
                      break L20;
                    } else {
                      stackOut_58_0 = 1;
                      stackIn_60_0 = stackOut_58_0;
                      break L20;
                    }
                  }
                  L21: {
                    var9 = stackIn_60_0;
                    if ((((qj) this).field_o & 1 << var9) == 0) {
                      stackOut_62_0 = 0;
                      stackIn_63_0 = stackOut_62_0;
                      break L21;
                    } else {
                      stackOut_61_0 = 1;
                      stackIn_63_0 = stackOut_61_0;
                      break L21;
                    }
                  }
                  L22: {
                    L23: {
                      var10 = stackIn_63_0;
                      stackOut_63_0 = ((qj) this).field_n;
                      stackOut_63_1 = -103;
                      stackOut_63_2 = var2[0];
                      stackIn_66_0 = stackOut_63_0;
                      stackIn_66_1 = stackOut_63_1;
                      stackIn_66_2 = stackOut_63_2;
                      stackIn_64_0 = stackOut_63_0;
                      stackIn_64_1 = stackOut_63_1;
                      stackIn_64_2 = stackOut_63_2;
                      if (var8_int != 0) {
                        break L23;
                      } else {
                        stackOut_64_0 = stackIn_64_0;
                        stackOut_64_1 = stackIn_64_1;
                        stackOut_64_2 = stackIn_64_2;
                        stackIn_67_0 = stackOut_64_0;
                        stackIn_67_1 = stackOut_64_1;
                        stackIn_67_2 = stackOut_64_2;
                        stackIn_65_0 = stackOut_64_0;
                        stackIn_65_1 = stackOut_64_1;
                        stackIn_65_2 = stackOut_64_2;
                        if (var10 == 0) {
                          stackOut_67_0 = stackIn_67_0;
                          stackOut_67_1 = stackIn_67_1;
                          stackOut_67_2 = stackIn_67_2;
                          stackOut_67_3 = 0;
                          stackIn_68_0 = stackOut_67_0;
                          stackIn_68_1 = stackOut_67_1;
                          stackIn_68_2 = stackOut_67_2;
                          stackIn_68_3 = stackOut_67_3;
                          break L22;
                        } else {
                          stackOut_65_0 = stackIn_65_0;
                          stackOut_65_1 = stackIn_65_1;
                          stackOut_65_2 = stackIn_65_2;
                          stackIn_66_0 = stackOut_65_0;
                          stackIn_66_1 = stackOut_65_1;
                          stackIn_66_2 = stackOut_65_2;
                          break L23;
                        }
                      }
                    }
                    stackOut_66_0 = stackIn_66_0;
                    stackOut_66_1 = stackIn_66_1;
                    stackOut_66_2 = stackIn_66_2;
                    stackOut_66_3 = 1;
                    stackIn_68_0 = stackOut_66_0;
                    stackIn_68_1 = stackOut_66_1;
                    stackIn_68_2 = stackOut_66_2;
                    stackIn_68_3 = stackOut_66_3;
                    break L22;
                  }
                  L24: {
                    L25: {
                      stackOut_68_0 = stackIn_68_0;
                      stackOut_68_1 = stackIn_68_1;
                      stackOut_68_2 = stackIn_68_2;
                      stackOut_68_3 = stackIn_68_3;
                      stackOut_68_4 = ((qj) this).field_w.field_l[var9];
                      stackOut_68_5 = var3[0];
                      stackOut_68_6 = var9;
                      stackIn_71_0 = stackOut_68_0;
                      stackIn_71_1 = stackOut_68_1;
                      stackIn_71_2 = stackOut_68_2;
                      stackIn_71_3 = stackOut_68_3;
                      stackIn_71_4 = stackOut_68_4;
                      stackIn_71_5 = stackOut_68_5;
                      stackIn_71_6 = stackOut_68_6;
                      stackIn_69_0 = stackOut_68_0;
                      stackIn_69_1 = stackOut_68_1;
                      stackIn_69_2 = stackOut_68_2;
                      stackIn_69_3 = stackOut_68_3;
                      stackIn_69_4 = stackOut_68_4;
                      stackIn_69_5 = stackOut_68_5;
                      stackIn_69_6 = stackOut_68_6;
                      if (var7 != 0) {
                        break L25;
                      } else {
                        stackOut_69_0 = stackIn_69_0;
                        stackOut_69_1 = stackIn_69_1;
                        stackOut_69_2 = stackIn_69_2;
                        stackOut_69_3 = stackIn_69_3;
                        stackOut_69_4 = (j) (Object) stackIn_69_4;
                        stackOut_69_5 = stackIn_69_5;
                        stackOut_69_6 = stackIn_69_6;
                        stackIn_72_0 = stackOut_69_0;
                        stackIn_72_1 = stackOut_69_1;
                        stackIn_72_2 = stackOut_69_2;
                        stackIn_72_3 = stackOut_69_3;
                        stackIn_72_4 = stackOut_69_4;
                        stackIn_72_5 = stackOut_69_5;
                        stackIn_72_6 = stackOut_69_6;
                        stackIn_70_0 = stackOut_69_0;
                        stackIn_70_1 = stackOut_69_1;
                        stackIn_70_2 = stackOut_69_2;
                        stackIn_70_3 = stackOut_69_3;
                        stackIn_70_4 = stackOut_69_4;
                        stackIn_70_5 = stackOut_69_5;
                        stackIn_70_6 = stackOut_69_6;
                        if (var10 == 0) {
                          stackOut_72_0 = stackIn_72_0;
                          stackOut_72_1 = stackIn_72_1;
                          stackOut_72_2 = stackIn_72_2;
                          stackOut_72_3 = stackIn_72_3;
                          stackOut_72_4 = (j) (Object) stackIn_72_4;
                          stackOut_72_5 = stackIn_72_5;
                          stackOut_72_6 = stackIn_72_6;
                          stackOut_72_7 = 0;
                          stackIn_73_0 = stackOut_72_0;
                          stackIn_73_1 = stackOut_72_1;
                          stackIn_73_2 = stackOut_72_2;
                          stackIn_73_3 = stackOut_72_3;
                          stackIn_73_4 = stackOut_72_4;
                          stackIn_73_5 = stackOut_72_5;
                          stackIn_73_6 = stackOut_72_6;
                          stackIn_73_7 = stackOut_72_7;
                          break L24;
                        } else {
                          stackOut_70_0 = stackIn_70_0;
                          stackOut_70_1 = stackIn_70_1;
                          stackOut_70_2 = stackIn_70_2;
                          stackOut_70_3 = stackIn_70_3;
                          stackOut_70_4 = (j) (Object) stackIn_70_4;
                          stackOut_70_5 = stackIn_70_5;
                          stackOut_70_6 = stackIn_70_6;
                          stackIn_71_0 = stackOut_70_0;
                          stackIn_71_1 = stackOut_70_1;
                          stackIn_71_2 = stackOut_70_2;
                          stackIn_71_3 = stackOut_70_3;
                          stackIn_71_4 = stackOut_70_4;
                          stackIn_71_5 = stackOut_70_5;
                          stackIn_71_6 = stackOut_70_6;
                          break L25;
                        }
                      }
                    }
                    stackOut_71_0 = stackIn_71_0;
                    stackOut_71_1 = stackIn_71_1;
                    stackOut_71_2 = stackIn_71_2;
                    stackOut_71_3 = stackIn_71_3;
                    stackOut_71_4 = (j) (Object) stackIn_71_4;
                    stackOut_71_5 = stackIn_71_5;
                    stackOut_71_6 = stackIn_71_6;
                    stackOut_71_7 = 1;
                    stackIn_73_0 = stackOut_71_0;
                    stackIn_73_1 = stackOut_71_1;
                    stackIn_73_2 = stackOut_71_2;
                    stackIn_73_3 = stackOut_71_3;
                    stackIn_73_4 = stackOut_71_4;
                    stackIn_73_5 = stackOut_71_5;
                    stackIn_73_6 = stackOut_71_6;
                    stackIn_73_7 = stackOut_71_7;
                    break L24;
                  }
                  L26: {
                    om.a(stackIn_73_0, (byte) stackIn_73_1, stackIn_73_2, stackIn_73_3 != 0, stackIn_73_4, stackIn_73_5, stackIn_73_6, stackIn_73_7 != 0, ((qj) this).field_w);
                    var9 = 1 + -var9;
                    if (0 == (1 << var9 & ((qj) this).field_o)) {
                      stackOut_75_0 = 0;
                      stackIn_76_0 = stackOut_75_0;
                      break L26;
                    } else {
                      stackOut_74_0 = 1;
                      stackIn_76_0 = stackOut_74_0;
                      break L26;
                    }
                  }
                  L27: {
                    L28: {
                      var10 = stackIn_76_0;
                      stackOut_76_0 = ((qj) this).field_n;
                      stackOut_76_1 = -103;
                      stackOut_76_2 = var2[1];
                      stackIn_79_0 = stackOut_76_0;
                      stackIn_79_1 = stackOut_76_1;
                      stackIn_79_2 = stackOut_76_2;
                      stackIn_77_0 = stackOut_76_0;
                      stackIn_77_1 = stackOut_76_1;
                      stackIn_77_2 = stackOut_76_2;
                      if (var8_int != 0) {
                        break L28;
                      } else {
                        stackOut_77_0 = stackIn_77_0;
                        stackOut_77_1 = stackIn_77_1;
                        stackOut_77_2 = stackIn_77_2;
                        stackIn_80_0 = stackOut_77_0;
                        stackIn_80_1 = stackOut_77_1;
                        stackIn_80_2 = stackOut_77_2;
                        stackIn_78_0 = stackOut_77_0;
                        stackIn_78_1 = stackOut_77_1;
                        stackIn_78_2 = stackOut_77_2;
                        if (var10 == 0) {
                          stackOut_80_0 = stackIn_80_0;
                          stackOut_80_1 = stackIn_80_1;
                          stackOut_80_2 = stackIn_80_2;
                          stackOut_80_3 = 0;
                          stackIn_81_0 = stackOut_80_0;
                          stackIn_81_1 = stackOut_80_1;
                          stackIn_81_2 = stackOut_80_2;
                          stackIn_81_3 = stackOut_80_3;
                          break L27;
                        } else {
                          stackOut_78_0 = stackIn_78_0;
                          stackOut_78_1 = stackIn_78_1;
                          stackOut_78_2 = stackIn_78_2;
                          stackIn_79_0 = stackOut_78_0;
                          stackIn_79_1 = stackOut_78_1;
                          stackIn_79_2 = stackOut_78_2;
                          break L28;
                        }
                      }
                    }
                    stackOut_79_0 = stackIn_79_0;
                    stackOut_79_1 = stackIn_79_1;
                    stackOut_79_2 = stackIn_79_2;
                    stackOut_79_3 = 1;
                    stackIn_81_0 = stackOut_79_0;
                    stackIn_81_1 = stackOut_79_1;
                    stackIn_81_2 = stackOut_79_2;
                    stackIn_81_3 = stackOut_79_3;
                    break L27;
                  }
                  L29: {
                    L30: {
                      stackOut_81_0 = stackIn_81_0;
                      stackOut_81_1 = stackIn_81_1;
                      stackOut_81_2 = stackIn_81_2;
                      stackOut_81_3 = stackIn_81_3;
                      stackOut_81_4 = ((qj) this).field_w.field_l[var9];
                      stackOut_81_5 = var3[1];
                      stackOut_81_6 = var9;
                      stackIn_84_0 = stackOut_81_0;
                      stackIn_84_1 = stackOut_81_1;
                      stackIn_84_2 = stackOut_81_2;
                      stackIn_84_3 = stackOut_81_3;
                      stackIn_84_4 = stackOut_81_4;
                      stackIn_84_5 = stackOut_81_5;
                      stackIn_84_6 = stackOut_81_6;
                      stackIn_82_0 = stackOut_81_0;
                      stackIn_82_1 = stackOut_81_1;
                      stackIn_82_2 = stackOut_81_2;
                      stackIn_82_3 = stackOut_81_3;
                      stackIn_82_4 = stackOut_81_4;
                      stackIn_82_5 = stackOut_81_5;
                      stackIn_82_6 = stackOut_81_6;
                      if (var7 != 0) {
                        break L30;
                      } else {
                        stackOut_82_0 = stackIn_82_0;
                        stackOut_82_1 = stackIn_82_1;
                        stackOut_82_2 = stackIn_82_2;
                        stackOut_82_3 = stackIn_82_3;
                        stackOut_82_4 = (j) (Object) stackIn_82_4;
                        stackOut_82_5 = stackIn_82_5;
                        stackOut_82_6 = stackIn_82_6;
                        stackIn_85_0 = stackOut_82_0;
                        stackIn_85_1 = stackOut_82_1;
                        stackIn_85_2 = stackOut_82_2;
                        stackIn_85_3 = stackOut_82_3;
                        stackIn_85_4 = stackOut_82_4;
                        stackIn_85_5 = stackOut_82_5;
                        stackIn_85_6 = stackOut_82_6;
                        stackIn_83_0 = stackOut_82_0;
                        stackIn_83_1 = stackOut_82_1;
                        stackIn_83_2 = stackOut_82_2;
                        stackIn_83_3 = stackOut_82_3;
                        stackIn_83_4 = stackOut_82_4;
                        stackIn_83_5 = stackOut_82_5;
                        stackIn_83_6 = stackOut_82_6;
                        if (var10 == 0) {
                          stackOut_85_0 = stackIn_85_0;
                          stackOut_85_1 = stackIn_85_1;
                          stackOut_85_2 = stackIn_85_2;
                          stackOut_85_3 = stackIn_85_3;
                          stackOut_85_4 = (j) (Object) stackIn_85_4;
                          stackOut_85_5 = stackIn_85_5;
                          stackOut_85_6 = stackIn_85_6;
                          stackOut_85_7 = 0;
                          stackIn_86_0 = stackOut_85_0;
                          stackIn_86_1 = stackOut_85_1;
                          stackIn_86_2 = stackOut_85_2;
                          stackIn_86_3 = stackOut_85_3;
                          stackIn_86_4 = stackOut_85_4;
                          stackIn_86_5 = stackOut_85_5;
                          stackIn_86_6 = stackOut_85_6;
                          stackIn_86_7 = stackOut_85_7;
                          break L29;
                        } else {
                          stackOut_83_0 = stackIn_83_0;
                          stackOut_83_1 = stackIn_83_1;
                          stackOut_83_2 = stackIn_83_2;
                          stackOut_83_3 = stackIn_83_3;
                          stackOut_83_4 = (j) (Object) stackIn_83_4;
                          stackOut_83_5 = stackIn_83_5;
                          stackOut_83_6 = stackIn_83_6;
                          stackIn_84_0 = stackOut_83_0;
                          stackIn_84_1 = stackOut_83_1;
                          stackIn_84_2 = stackOut_83_2;
                          stackIn_84_3 = stackOut_83_3;
                          stackIn_84_4 = stackOut_83_4;
                          stackIn_84_5 = stackOut_83_5;
                          stackIn_84_6 = stackOut_83_6;
                          break L30;
                        }
                      }
                    }
                    stackOut_84_0 = stackIn_84_0;
                    stackOut_84_1 = stackIn_84_1;
                    stackOut_84_2 = stackIn_84_2;
                    stackOut_84_3 = stackIn_84_3;
                    stackOut_84_4 = (j) (Object) stackIn_84_4;
                    stackOut_84_5 = stackIn_84_5;
                    stackOut_84_6 = stackIn_84_6;
                    stackOut_84_7 = 1;
                    stackIn_86_0 = stackOut_84_0;
                    stackIn_86_1 = stackOut_84_1;
                    stackIn_86_2 = stackOut_84_2;
                    stackIn_86_3 = stackOut_84_3;
                    stackIn_86_4 = stackOut_84_4;
                    stackIn_86_5 = stackOut_84_5;
                    stackIn_86_6 = stackOut_84_6;
                    stackIn_86_7 = stackOut_84_7;
                    break L29;
                  }
                  om.a(stackIn_86_0, (byte) stackIn_86_1, stackIn_86_2, stackIn_86_3 != 0, stackIn_86_4, stackIn_86_5, stackIn_86_6, stackIn_86_7 != 0, ((qj) this).field_w);
                  if (var11 == 0) {
                    break L15;
                  } else {
                    break L16;
                  }
                }
              }
              L31: {
                var3 = kh.field_e[4];
                var2 = kh.field_c[4];
                nh.a(169, 482, -40, -1, cd.field_h, -1);
                nh.a(169, 482, -40, 472, cd.field_h, -1);
                if ((((qj) this).field_o & 1 << ((qj) this).field_m) == 0) {
                  stackOut_89_0 = 0;
                  stackIn_90_0 = stackOut_89_0;
                  break L31;
                } else {
                  stackOut_88_0 = 1;
                  stackIn_90_0 = stackOut_88_0;
                  break L31;
                }
              }
              L32: {
                L33: {
                  var7 = stackIn_90_0;
                  stackOut_90_0 = ((qj) this).field_n;
                  stackOut_90_1 = -103;
                  stackOut_90_2 = var2[0];
                  stackIn_93_0 = stackOut_90_0;
                  stackIn_93_1 = stackOut_90_1;
                  stackIn_93_2 = stackOut_90_2;
                  stackIn_91_0 = stackOut_90_0;
                  stackIn_91_1 = stackOut_90_1;
                  stackIn_91_2 = stackOut_90_2;
                  if (var7 != 0) {
                    break L33;
                  } else {
                    stackOut_91_0 = stackIn_91_0;
                    stackOut_91_1 = stackIn_91_1;
                    stackOut_91_2 = stackIn_91_2;
                    stackIn_94_0 = stackOut_91_0;
                    stackIn_94_1 = stackOut_91_1;
                    stackIn_94_2 = stackOut_91_2;
                    stackIn_92_0 = stackOut_91_0;
                    stackIn_92_1 = stackOut_91_1;
                    stackIn_92_2 = stackOut_91_2;
                    if (0 != ((qj) this).field_o) {
                      stackOut_94_0 = stackIn_94_0;
                      stackOut_94_1 = stackIn_94_1;
                      stackOut_94_2 = stackIn_94_2;
                      stackOut_94_3 = 0;
                      stackIn_95_0 = stackOut_94_0;
                      stackIn_95_1 = stackOut_94_1;
                      stackIn_95_2 = stackOut_94_2;
                      stackIn_95_3 = stackOut_94_3;
                      break L32;
                    } else {
                      stackOut_92_0 = stackIn_92_0;
                      stackOut_92_1 = stackIn_92_1;
                      stackOut_92_2 = stackIn_92_2;
                      stackIn_93_0 = stackOut_92_0;
                      stackIn_93_1 = stackOut_92_1;
                      stackIn_93_2 = stackOut_92_2;
                      break L33;
                    }
                  }
                }
                stackOut_93_0 = stackIn_93_0;
                stackOut_93_1 = stackIn_93_1;
                stackOut_93_2 = stackIn_93_2;
                stackOut_93_3 = 1;
                stackIn_95_0 = stackOut_93_0;
                stackIn_95_1 = stackOut_93_1;
                stackIn_95_2 = stackOut_93_2;
                stackIn_95_3 = stackOut_93_3;
                break L32;
              }
              om.a(stackIn_95_0, (byte) stackIn_95_1, stackIn_95_2, stackIn_95_3 != 0, ((qj) this).field_w.field_l[((qj) this).field_m], var3[0], ((qj) this).field_m, var7 != 0, ((qj) this).field_w);
              nh.a(169, 9, -40, -1, cd.field_h, var3[2] + -3);
              nh.a(169, 9, -40, 472, cd.field_h, -3 + var3[2]);
              break L15;
            } else {
              L34: {
                L35: {
                  var7_ref_j = ((qj) this).field_w.field_l[0];
                  nh.a(526, 482, -40, -1, cd.field_h, -1);
                  lb.d(7, 473, 510, 7, 0, 96);
                  lb.d(524, 0, 116, 480, 0, 96);
                  nh.a(125, 482, -40, 516, cd.field_h, -1);
                  tk.a(130, ((qj) this).field_w, nn.field_g, var7_ref_j, (byte) -104, 527, 10, 85);
                  nh.a(125, 9, -40, 516, cd.field_h, 137);
                  if (!r.field_A) {
                    break L35;
                  } else {
                    if (wc.field_b) {
                      break L35;
                    } else {
                      break L34;
                    }
                  }
                }
                ua.a(var7_ref_j, 524, 85, -68, 147, 81, ((qj) this).field_w);
                break L34;
              }
              L36: {
                L37: {
                  nh.a(125, 9, -40, 516, cd.field_h, 229);
                  a.a(640, ((qj) this).field_w, var7_ref_j);
                  if (!r.field_A) {
                    break L37;
                  } else {
                    if (ka.a((byte) 124)) {
                      break L36;
                    } else {
                      break L37;
                    }
                  }
                }
                if (null == var7_ref_j.field_fb) {
                  break L15;
                } else {
                  ui.a(var7_ref_j.field_fb, nn.field_g, 0, (tp[]) null, 80, 621, 1729, 340, 85, -1);
                  if (var11 == 0) {
                    break L15;
                  } else {
                    break L36;
                  }
                }
              }
              ui.a(tb.field_eb + ro.field_v, ob.field_D, 6, c.field_i, 100, 621, 1729, 340, 230, 0);
              break L15;
            }
          }
          L38: {
            if (((qj) this).field_w.field_k > 1) {
              if (((((qj) this).field_w.field_g | ((qj) this).field_w.field_i) & 1 << ((qj) this).field_m) != 0) {
                break L38;
              } else {
                v.a(var2[0], 424, false, ((qj) this).field_w, ((qj) this).field_m, var3[0]);
                break L38;
              }
            } else {
              break L38;
            }
          }
          L39: {
            if (((qj) this).field_w.field_k != 2) {
              break L39;
            } else {
              if (0 != (1 << 1 + -((qj) this).field_m & (((qj) this).field_w.field_g | ((qj) this).field_w.field_i))) {
                break L39;
              } else {
                v.a(var2[1], 424, false, ((qj) this).field_w, 1 + -((qj) this).field_m, var3[1]);
                break L39;
              }
            }
          }
          var3 = kh.field_e[((qj) this).field_w.field_k + -1];
          var6 = ((qj) this).field_m;
          var2 = kh.field_c[((qj) this).field_w.field_k - 1];
          var7 = 0;
          L40: while (true) {
            L41: {
              if (~((qj) this).field_w.field_k >= ~var7) {
                break L41;
              } else {
                if (var11 != 0) {
                  break L41;
                } else {
                  L42: {
                    if (var5[var7] == 2) {
                      var8_ref = ul.field_k[((qj) this).field_w.field_l[var6].field_H];
                      var9 = ob.field_D.field_F - -ob.field_D.field_P;
                      lb.d(var2[var7], 235 - -var3[var7] + -23, 153, var9, 0, 141);
                      var8_ref.c(-var8_ref.field_x + (153 + var2[var7]), -var8_ref.field_z + var3[var7] + 233);
                      ce.field_e.c(((qj) this).field_w.field_f[var6], var2[var7] + 4, 2 + var3[var7] + 223, 2, -1);
                      break L42;
                    } else {
                      break L42;
                    }
                  }
                  var6++;
                  var6 = var6 % ((qj) this).field_w.field_k;
                  var7++;
                  if (var11 == 0) {
                    continue L40;
                  } else {
                    break L41;
                  }
                }
              }
            }
            return;
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
        int var11 = 0;
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
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        int stackIn_26_1 = 0;
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_36_2 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_39_2 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_42_2 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_45_2 = null;
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
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        Object stackOut_21_0 = null;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Object stackOut_22_0 = null;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        RuntimeException stackOut_35_0 = null;
        StringBuilder stackOut_35_1 = null;
        String stackOut_35_2 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        String stackOut_40_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        var11 = BrickABrac.field_J ? 1 : 0;
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
              L5: {
                L6: {
                  if (8 <= var10) {
                    break L6;
                  } else {
                    var12[var10] = 0;
                    var10++;
                    if (var11 != 0) {
                      break L5;
                    } else {
                      if (var11 == 0) {
                        continue L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                ((qj) this).field_w = new ak(param2, ((qj) this).field_o, param5, param6, param7);
                break L5;
              }
              var9_int = 0;
              var10 = 0;
              L7: while (true) {
                L8: {
                  L9: {
                    if (((qj) this).field_w.field_k <= var10) {
                      break L9;
                    } else {
                      stackOut_17_0 = ~(((qj) this).field_o & 1 << var10);
                      stackOut_17_1 = -1;
                      stackIn_29_0 = stackOut_17_0;
                      stackIn_29_1 = stackOut_17_1;
                      stackIn_18_0 = stackOut_17_0;
                      stackIn_18_1 = stackOut_17_1;
                      if (var11 != 0) {
                        break L8;
                      } else {
                        L10: {
                          if (stackIn_18_0 == stackIn_18_1) {
                            break L10;
                          } else {
                            var9_int++;
                            break L10;
                          }
                        }
                        var10++;
                        if (var11 == 0) {
                          continue L7;
                        } else {
                          break L9;
                        }
                      }
                    }
                  }
                  L11: {
                    stackOut_21_0 = this;
                    stackIn_25_0 = stackOut_21_0;
                    stackIn_22_0 = stackOut_21_0;
                    if (var9_int == 2) {
                      stackOut_25_0 = this;
                      stackOut_25_1 = 1;
                      stackIn_26_0 = stackOut_25_0;
                      stackIn_26_1 = stackOut_25_1;
                      break L11;
                    } else {
                      stackOut_22_0 = this;
                      stackIn_24_0 = stackOut_22_0;
                      stackIn_23_0 = stackOut_22_0;
                      if (((qj) this).field_k < 0) {
                        stackOut_24_0 = this;
                        stackOut_24_1 = 0;
                        stackIn_26_0 = stackOut_24_0;
                        stackIn_26_1 = stackOut_24_1;
                        break L11;
                      } else {
                        stackOut_23_0 = this;
                        stackOut_23_1 = ((qj) this).field_k;
                        stackIn_26_0 = stackOut_23_0;
                        stackIn_26_1 = stackOut_23_1;
                        break L11;
                      }
                    }
                  }
                  L12: {
                    ((qj) this).field_m = stackIn_26_1;
                    if (oo.field_w != null) {
                      break L12;
                    } else {
                      oo.field_w = new fo(new int[1]);
                      break L12;
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
                  stackOut_28_0 = tn.field_C;
                  stackOut_28_1 = -28463;
                  stackIn_29_0 = stackOut_28_0;
                  stackIn_29_1 = stackOut_28_1;
                  break L8;
                }
                L13: {
                  gr.b(stackIn_29_0, stackIn_29_1);
                  pg.field_m = -1;
                  dj.field_b = -1;
                  if (jo.field_j != null) {
                    break L13;
                  } else {
                    jo.field_j = rd.a(cm.field_p, new String[1], (byte) 103).toLowerCase();
                    ff.field_j = pn.field_j.toLowerCase();
                    break L13;
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
          L14: {
            var9 = decompiledCaughtException;
            stackOut_33_0 = (RuntimeException) var9;
            stackOut_33_1 = new StringBuilder().append("qj.<init>(").append(param0).append(44).append(param1).append(44);
            stackIn_35_0 = stackOut_33_0;
            stackIn_35_1 = stackOut_33_1;
            stackIn_34_0 = stackOut_33_0;
            stackIn_34_1 = stackOut_33_1;
            if (param2 == null) {
              stackOut_35_0 = (RuntimeException) (Object) stackIn_35_0;
              stackOut_35_1 = (StringBuilder) (Object) stackIn_35_1;
              stackOut_35_2 = "null";
              stackIn_36_0 = stackOut_35_0;
              stackIn_36_1 = stackOut_35_1;
              stackIn_36_2 = stackOut_35_2;
              break L14;
            } else {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "{...}";
              stackIn_36_0 = stackOut_34_0;
              stackIn_36_1 = stackOut_34_1;
              stackIn_36_2 = stackOut_34_2;
              break L14;
            }
          }
          L15: {
            stackOut_36_0 = (RuntimeException) (Object) stackIn_36_0;
            stackOut_36_1 = ((StringBuilder) (Object) stackIn_36_1).append(stackIn_36_2).append(44).append(param3).append(44).append(param4).append(44);
            stackIn_38_0 = stackOut_36_0;
            stackIn_38_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param5 == null) {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "null";
              stackIn_39_0 = stackOut_38_0;
              stackIn_39_1 = stackOut_38_1;
              stackIn_39_2 = stackOut_38_2;
              break L15;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_39_0 = stackOut_37_0;
              stackIn_39_1 = stackOut_37_1;
              stackIn_39_2 = stackOut_37_2;
              break L15;
            }
          }
          L16: {
            stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
            stackOut_39_1 = ((StringBuilder) (Object) stackIn_39_1).append(stackIn_39_2).append(44);
            stackIn_41_0 = stackOut_39_0;
            stackIn_41_1 = stackOut_39_1;
            stackIn_40_0 = stackOut_39_0;
            stackIn_40_1 = stackOut_39_1;
            if (param6 == null) {
              stackOut_41_0 = (RuntimeException) (Object) stackIn_41_0;
              stackOut_41_1 = (StringBuilder) (Object) stackIn_41_1;
              stackOut_41_2 = "null";
              stackIn_42_0 = stackOut_41_0;
              stackIn_42_1 = stackOut_41_1;
              stackIn_42_2 = stackOut_41_2;
              break L16;
            } else {
              stackOut_40_0 = (RuntimeException) (Object) stackIn_40_0;
              stackOut_40_1 = (StringBuilder) (Object) stackIn_40_1;
              stackOut_40_2 = "{...}";
              stackIn_42_0 = stackOut_40_0;
              stackIn_42_1 = stackOut_40_1;
              stackIn_42_2 = stackOut_40_2;
              break L16;
            }
          }
          L17: {
            stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
            stackOut_42_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_42_2).append(44);
            stackIn_44_0 = stackOut_42_0;
            stackIn_44_1 = stackOut_42_1;
            stackIn_43_0 = stackOut_42_0;
            stackIn_43_1 = stackOut_42_1;
            if (param7 == null) {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "null";
              stackIn_45_0 = stackOut_44_0;
              stackIn_45_1 = stackOut_44_1;
              stackIn_45_2 = stackOut_44_2;
              break L17;
            } else {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "{...}";
              stackIn_45_0 = stackOut_43_0;
              stackIn_45_1 = stackOut_43_1;
              stackIn_45_2 = stackOut_43_2;
              break L17;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_45_0, stackIn_45_2 + 41);
        }
    }

    static {
    }
}
