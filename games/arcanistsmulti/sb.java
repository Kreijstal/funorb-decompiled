/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb {
    static am field_f;
    static String field_c;
    static String field_b;
    static boolean field_a;
    static qb field_g;
    static int[] field_h;
    static String field_d;
    static int field_e;

    public static void c(int param0) {
        field_b = null;
        field_h = null;
        field_c = null;
        field_g = null;
        field_f = null;
        if (param0 != -1) {
            sb.a(-119);
        }
        field_d = null;
    }

    final static void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        rb var4 = null;
        L0: {
          if (param0 > 42) {
            break L0;
          } else {
            sb.a(-95);
            break L0;
          }
        }
        L1: {
          var4 = (rb) (Object) pb.field_m.b(12623);
          if (var4 == null) {
            break L1;
          } else {
            L2: {
              var2 = an.field_f / 2;
              var3 = an.field_j + -10;
              if (-26 >= (var4.field_h ^ -1)) {
                break L2;
              } else {
                var3 = var3 + (12 - -tj.field_t.field_C) * (-var4.field_h + 25) / 25;
                break L2;
              }
            }
            L3: {
              if (125 < var4.field_h) {
                var3 = var3 + (-125 + var4.field_h) * (12 + tj.field_t.field_C) / 25;
                break L3;
              } else {
                break L3;
              }
            }
            tj.field_t.b(var4.field_j, var2, var3 + -2, 1052688, 1052688);
            tj.field_t.b(var4.field_j, var2 + -2, var3, 1052688, 1052688);
            tj.field_t.b(var4.field_j, -1 + var2, -1 + var3, 1052688, -1);
            tj.field_t.b(var4.field_j, 1 + var2, 1 + var3, 1052688, -1);
            tj.field_t.b(var4.field_j, var2, var3 - -2, 1052688, -1);
            tj.field_t.b(var4.field_j, var2 - -2, var3, 1052688, -1);
            tj.field_t.b(var4.field_j, var2, var3 + -1, 16777215, 12303291);
            tj.field_t.b(var4.field_j, -1 + var2, var3, 14540253, 10066329);
            tj.field_t.b(var4.field_j, var2, var3, var4.field_g, -1);
            break L1;
          }
        }
    }

    final static void a(boolean param0, byte param1, ha param2, int param3) {
        Object var4_ref_Object = null;
        int var4 = 0;
        Throwable var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (null == gg.field_h) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    on.a(1048576, param3, param0, true, param2);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    if (null != jl.field_h) {
                        statePc = 4;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 4: {
                    var4_ref_Object = (Object) (Object) oh.field_k;
                    // monitorenter oh.field_k
                    statePc = 5;
                    continue stateLoop;
                }
                case 5: {
                    try {
                        jl.field_h.b(-1, (byte) 69, param3);
                        if (f.field_g != param2) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        // monitorexit var4_ref_Object
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 7: {
                    return;
                }
                case 8: {
                    try {
                        jl.field_h.a((byte) -128);
                        oh.field_k.f();
                        f.field_g = param2;
                        if (f.field_g == null) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        jl.field_h.a((byte) -96, param0, f.field_g);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        // monitorexit var4_ref_Object
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var5 = caughtException;
                        // monitorexit var4_ref_Object
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 13: {
                    throw (RuntimeException) (Object) var5;
                }
                case 14: {
                    var4 = -21 % ((-79 - param1) / 43);
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        Object var3 = null;
        int[] var3_array = null;
        ml var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        qb stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int[] stackIn_3_3 = null;
        qb stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int[] stackIn_4_3 = null;
        qb stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int[] stackIn_5_3 = null;
        int stackIn_5_4 = 0;
        qb stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int[] stackOut_2_3 = null;
        qb stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int[] stackOut_4_3 = null;
        int stackOut_4_4 = 0;
        qb stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int[] stackOut_3_3 = null;
        int stackOut_3_4 = 0;
        L0: {
          var9 = ArcanistsMulti.field_G ? 1 : 0;
          var2 = n.field_g.field_nb;
          if ((bk.field_J.a(-31497) ^ -1) != -9) {
            break L0;
          } else {
            de.h(0, 0, 391, 480);
            break L0;
          }
        }
        L1: {
          stackOut_2_0 = fe.field_g;
          stackOut_2_1 = 0;
          stackOut_2_2 = 412 + lo.field_q + var2 - 480;
          stackOut_2_3 = nj.field_n;
          stackIn_4_0 = stackOut_2_0;
          stackIn_4_1 = stackOut_2_1;
          stackIn_4_2 = stackOut_2_2;
          stackIn_4_3 = stackOut_2_3;
          stackIn_3_0 = stackOut_2_0;
          stackIn_3_1 = stackOut_2_1;
          stackIn_3_2 = stackOut_2_2;
          stackIn_3_3 = stackOut_2_3;
          if (0 > bm.field_g.field_I) {
            stackOut_4_0 = (qb) (Object) stackIn_4_0;
            stackOut_4_1 = stackIn_4_1;
            stackOut_4_2 = stackIn_4_2;
            stackOut_4_3 = (int[]) (Object) stackIn_4_3;
            stackOut_4_4 = 6;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            stackIn_5_2 = stackOut_4_2;
            stackIn_5_3 = stackOut_4_3;
            stackIn_5_4 = stackOut_4_4;
            break L1;
          } else {
            stackOut_3_0 = (qb) (Object) stackIn_3_0;
            stackOut_3_1 = stackIn_3_1;
            stackOut_3_2 = stackIn_3_2;
            stackOut_3_3 = (int[]) (Object) stackIn_3_3;
            stackOut_3_4 = bm.field_g.field_I;
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_5_2 = stackOut_3_2;
            stackIn_5_3 = stackOut_3_3;
            stackIn_5_4 = stackOut_3_4;
            break L1;
          }
        }
        ((qb) (Object) stackIn_5_0).d(stackIn_5_1, stackIn_5_2, stackIn_5_3[stackIn_5_4]);
        pm.field_a.c(0, -pm.field_a.field_w + (lo.field_q - -var2), 128);
        if (param1 < -38) {
          L2: {
            uj.field_f.c(0, lo.field_q + (var2 + -uj.field_f.field_w));
            de.a();
            if ((mf.field_g ^ -1) == 3) {
              break L2;
            } else {
              mf.field_g = -1;
              break L2;
            }
          }
          L3: {
            var3 = null;
            if (bm.field_g.field_bb == -1) {
              break L3;
            } else {
              var4_ref = bk.field_J.a(bm.field_g.field_bb, true);
              if (var4_ref == null) {
                break L3;
              } else {
                var5 = var4_ref.o(-22625);
                if (17 == var5) {
                  var3_array = gj.field_c[var4_ref.o(-22625)];
                  if (var4_ref.q(26)) {
                    var3_array = lj.field_u;
                    break L3;
                  } else {
                    break L3;
                  }
                } else {
                  if (var5 != 10) {
                    L4: {
                      L5: {
                        L6: {
                          if (-1 == var5) {
                            break L6;
                          } else {
                            if (-28 != var5) {
                              if (var5 != -17) {
                                if (-19 == var5) {
                                  break L6;
                                } else {
                                  if (var5 != -20) {
                                    if (-23 == var5) {
                                      break L6;
                                    } else {
                                      if (var5 == -24) {
                                        break L6;
                                      } else {
                                        if (21 != var5) {
                                          if (24 == var5) {
                                            break L6;
                                          } else {
                                            if (20 == var5) {
                                              break L6;
                                            } else {
                                              if (-36 != var5) {
                                                if (var5 != 38) {
                                                  var3_array = gj.field_c[var4_ref.o(-22625)];
                                                  break L3;
                                                } else {
                                                  var15 = bk.field_J.e(3, var4_ref.y(17571));
                                                  var13 = var15;
                                                  var12 = var13;
                                                  var11 = var12;
                                                  var10 = var11;
                                                  var3_array = var10;
                                                  if (19 != var4_ref.o(-22625)) {
                                                    break L5;
                                                  } else {
                                                    var5 = 0;
                                                    L7: while (true) {
                                                      if (var5 >= 16) {
                                                        break L4;
                                                      } else {
                                                        if (45 == var15[var5]) {
                                                          var15[var5] = 152;
                                                          var5++;
                                                          continue L7;
                                                        } else {
                                                          var5++;
                                                          continue L7;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                break L6;
                                              }
                                            }
                                          }
                                        } else {
                                          break L6;
                                        }
                                      }
                                    }
                                  } else {
                                    break L6;
                                  }
                                }
                              } else {
                                break L6;
                              }
                            } else {
                              break L6;
                            }
                          }
                        }
                        var16 = bk.field_J.e(3, var4_ref.y(17571));
                        var14 = var16;
                        var12 = var14;
                        var11 = var12;
                        var10 = var11;
                        var3_array = var10;
                        if (19 != var4_ref.o(-22625)) {
                          break L5;
                        } else {
                          var5 = 0;
                          L8: while (true) {
                            if (var5 >= 16) {
                              break L4;
                            } else {
                              if (45 == var16[var5]) {
                                var16[var5] = 152;
                                var5++;
                                continue L8;
                              } else {
                                var5++;
                                continue L8;
                              }
                            }
                          }
                        }
                      }
                      var12 = var11;
                      var5 = 0;
                      L9: while (true) {
                        if (-17 >= (var5 ^ -1)) {
                          break L4;
                        } else {
                          if (var12[var5] == 152) {
                            var12[var5] = 45;
                            var5++;
                            continue L9;
                          } else {
                            var5++;
                            continue L9;
                          }
                        }
                      }
                    }
                    if (var4_ref.i((byte) -106) <= bk.field_J.field_H) {
                      break L3;
                    } else {
                      ti.field_N = 4;
                      pn.field_a = th.field_b;
                      var3_array = th.field_b;
                      lm.field_f = th.field_b;
                      break L3;
                    }
                  } else {
                    var3_array = gj.field_c[var4_ref.o(-22625)];
                    if (!var4_ref.q(72)) {
                      break L3;
                    } else {
                      var3_array = vi.field_N;
                      break L3;
                    }
                  }
                }
              }
            }
          }
          L10: {
            if (var3_array == pn.field_a) {
              break L10;
            } else {
              pn.field_a = var3_array;
              lm.field_f = var3_array;
              ti.field_N = -1;
              break L10;
            }
          }
          L11: {
            L12: {
              if (bk.field_J.a(true)) {
                break L12;
              } else {
                if (bm.field_g.field_I != bk.field_J.d(false)) {
                  break L12;
                } else {
                  L13: {
                    if (!bk.field_J.c((byte) 89)) {
                      break L13;
                    } else {
                      if (!bk.field_J.j(39)) {
                        break L12;
                      } else {
                        break L13;
                      }
                    }
                  }
                  if (bk.field_J.g(116)) {
                    break L12;
                  } else {
                    break L11;
                  }
                }
              }
            }
            var3_array = null;
            break L11;
          }
          L14: {
            if (var3_array != null) {
              ej.b(0, param0);
              break L14;
            } else {
              vh.field_n = false;
              break L14;
            }
          }
          L15: {
            if (null == mo.field_f) {
              break L15;
            } else {
              if (!param0) {
                break L15;
              } else {
                L16: {
                  if (!bm.field_g.field_B) {
                    break L16;
                  } else {
                    mo.field_f = mo.field_f + sk.field_c;
                    break L16;
                  }
                }
                var4 = 0;
                var5 = 0;
                var6 = mi.field_B.c(mo.field_f, kl.field_A - 32);
                var7 = 32 + mi.field_B.field_C * mi.field_B.a(mo.field_f, -32 + var6);
                var6 += 32;
                var8 = Math.min(-var6 + an.field_f, an.field_f / 2 - -54);
                de.e(-var4 + var8, var5 - var4, var6 - -(2 * var4), var4 * 2 + var7, 16777215, 192);
                var4++;
                de.a(-var4 + var8, var5 - var4, 2 * var4 + var6, 2 * var4 + var7, 4799269);
                var4++;
                de.a(var8 + -var4, var5 + -var4, var6 - -(var4 * 2), var4 * 2 + var7, 8547138);
                var4++;
                de.a(var8 - var4, var5 + -var4, var6 + 2 * var4, var4 * 2 + var7, 11768360);
                var4++;
                de.a(var8 - var4, -var4 + var5, var6 - -(2 * var4), 2 * var4 + var7, 0);
                int discarded$1 = mi.field_B.a(mo.field_f, 16 + var8, var5, -32 + var6, var7, 0, -1, 1, 1, mi.field_B.field_C);
                var4++;
                break L15;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static void a(int param0) {
        if (null != oh.field_k) {
            oh.field_k.e();
        }
        if (!(null == lf.field_a)) {
            lf.field_a.e();
        }
        if (param0 != 8000) {
            field_b = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
        field_b = "Click or press F10 to open Quick Chat";
        field_c = "VS.";
        field_d = "This is the Book of Stone. Stone spells focus on the creation and destruction of terrain. You require 5 wands to purchase this spellbook; you currently have ";
        field_h = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_f = new am();
    }
}
