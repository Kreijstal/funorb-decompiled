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
              if (var4.field_h >= 25) {
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
        Object var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        Throwable var5 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        Throwable decompiledCaughtException = null;
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
              if (null == gg.field_h) {
                break L1;
              } else {
                on.a(1048576, 256, true, true, param2);
                break L1;
              }
            }
            L2: {
              if (null != jl.field_h) {
                var4 = (Object) (Object) oh.field_k;
                synchronized (var4) {
                  L3: {
                    jl.field_h.b(-1, (byte) 69, 256);
                    if (f.field_g != param2) {
                      L4: {
                        jl.field_h.a((byte) -128);
                        oh.field_k.f();
                        f.field_g = param2;
                        if (f.field_g == null) {
                          break L4;
                        } else {
                          jl.field_h.a((byte) -96, true, f.field_g);
                          break L4;
                        }
                      }
                      break L3;
                    } else {
                      return;
                    }
                  }
                }
                break L2;
              } else {
                break L2;
              }
            }
            var4_int = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4_ref;
            stackOut_16_1 = new StringBuilder().append("sb.C(").append(true).append(',').append(-33).append(',');
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
          throw aa.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + 256 + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        Object var3 = null;
        ml var4_ref_ml = null;
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
        qb stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int[] stackIn_4_3 = null;
        qb stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        int stackIn_5_2 = 0;
        int[] stackIn_5_3 = null;
        qb stackIn_6_0 = null;
        int stackIn_6_1 = 0;
        int stackIn_6_2 = 0;
        int[] stackIn_6_3 = null;
        int stackIn_6_4 = 0;
        RuntimeException decompiledCaughtException = null;
        qb stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int[] stackOut_3_3 = null;
        qb stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        int stackOut_5_2 = 0;
        int[] stackOut_5_3 = null;
        int stackOut_5_4 = 0;
        qb stackOut_4_0 = null;
        int stackOut_4_1 = 0;
        int stackOut_4_2 = 0;
        int[] stackOut_4_3 = null;
        int stackOut_4_4 = 0;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var2_int = n.field_g.field_nb;
              if (bk.field_J.a(-31497) != 8) {
                break L1;
              } else {
                de.h(0, 0, 391, 480);
                break L1;
              }
            }
            L2: {
              stackOut_3_0 = fe.field_g;
              stackOut_3_1 = 0;
              stackOut_3_2 = 412 + lo.field_q + var2_int - 480;
              stackOut_3_3 = nj.field_n;
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              stackIn_5_3 = stackOut_3_3;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              stackIn_4_3 = stackOut_3_3;
              if (0 > bm.field_g.field_I) {
                stackOut_5_0 = (qb) (Object) stackIn_5_0;
                stackOut_5_1 = stackIn_5_1;
                stackOut_5_2 = stackIn_5_2;
                stackOut_5_3 = (int[]) (Object) stackIn_5_3;
                stackOut_5_4 = 6;
                stackIn_6_0 = stackOut_5_0;
                stackIn_6_1 = stackOut_5_1;
                stackIn_6_2 = stackOut_5_2;
                stackIn_6_3 = stackOut_5_3;
                stackIn_6_4 = stackOut_5_4;
                break L2;
              } else {
                stackOut_4_0 = (qb) (Object) stackIn_4_0;
                stackOut_4_1 = stackIn_4_1;
                stackOut_4_2 = stackIn_4_2;
                stackOut_4_3 = (int[]) (Object) stackIn_4_3;
                stackOut_4_4 = bm.field_g.field_I;
                stackIn_6_0 = stackOut_4_0;
                stackIn_6_1 = stackOut_4_1;
                stackIn_6_2 = stackOut_4_2;
                stackIn_6_3 = stackOut_4_3;
                stackIn_6_4 = stackOut_4_4;
                break L2;
              }
            }
            ((qb) (Object) stackIn_6_0).d(stackIn_6_1, stackIn_6_2, stackIn_6_3[stackIn_6_4]);
            pm.field_a.c(0, -pm.field_a.field_w + (lo.field_q - -var2_int), 128);
            L3: {
              uj.field_f.c(0, lo.field_q + (var2_int + -uj.field_f.field_w));
              de.a();
              if (mf.field_g == -4) {
                break L3;
              } else {
                mf.field_g = -1;
                break L3;
              }
            }
            L4: {
              var3 = null;
              if (bm.field_g.field_bb == -1) {
                break L4;
              } else {
                var4_ref_ml = bk.field_J.a(bm.field_g.field_bb, true);
                if (var4_ref_ml == null) {
                  break L4;
                } else {
                  var5 = var4_ref_ml.o(-22625);
                  if (17 == var5) {
                    var3 = (Object) (Object) gj.field_c[var4_ref_ml.o(-22625)];
                    if (var4_ref_ml.q(26)) {
                      var3 = (Object) (Object) lj.field_u;
                      break L4;
                    } else {
                      break L4;
                    }
                  } else {
                    if (var5 != 10) {
                      L5: {
                        L6: {
                          L7: {
                            if (var5 == 0) {
                              break L7;
                            } else {
                              if (var5 != 27) {
                                if (var5 != 16) {
                                  if (var5 == 18) {
                                    break L7;
                                  } else {
                                    if (var5 != 19) {
                                      if (var5 == 22) {
                                        break L7;
                                      } else {
                                        if (var5 == 23) {
                                          break L7;
                                        } else {
                                          if (21 != var5) {
                                            if (24 == var5) {
                                              break L7;
                                            } else {
                                              if (20 == var5) {
                                                break L7;
                                              } else {
                                                if (var5 != 35) {
                                                  if (var5 != 38) {
                                                    var3 = (Object) (Object) gj.field_c[var4_ref_ml.o(-22625)];
                                                    break L4;
                                                  } else {
                                                    var15 = bk.field_J.e(3, var4_ref_ml.y(17571));
                                                    var13 = var15;
                                                    var12 = var13;
                                                    var11 = var12;
                                                    var10 = var11;
                                                    var3 = (Object) (Object) var10;
                                                    if (19 != var4_ref_ml.o(-22625)) {
                                                      break L6;
                                                    } else {
                                                      var5 = 0;
                                                      L8: while (true) {
                                                        if (var5 >= 16) {
                                                          break L5;
                                                        } else {
                                                          L9: {
                                                            if (45 == var15[var5]) {
                                                              var15[var5] = 152;
                                                              break L9;
                                                            } else {
                                                              break L9;
                                                            }
                                                          }
                                                          var5++;
                                                          continue L8;
                                                        }
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  break L7;
                                                }
                                              }
                                            }
                                          } else {
                                            break L7;
                                          }
                                        }
                                      }
                                    } else {
                                      break L7;
                                    }
                                  }
                                } else {
                                  break L7;
                                }
                              } else {
                                break L7;
                              }
                            }
                          }
                          var16 = bk.field_J.e(3, var4_ref_ml.y(17571));
                          var14 = var16;
                          var12 = var14;
                          var11 = var12;
                          var10 = var11;
                          var3 = (Object) (Object) var10;
                          if (19 != var4_ref_ml.o(-22625)) {
                            break L6;
                          } else {
                            var5 = 0;
                            L10: while (true) {
                              if (var5 >= 16) {
                                break L5;
                              } else {
                                L11: {
                                  if (45 == var16[var5]) {
                                    var16[var5] = 152;
                                    break L11;
                                  } else {
                                    break L11;
                                  }
                                }
                                var5++;
                                continue L10;
                              }
                            }
                          }
                        }
                        var5 = 0;
                        L12: while (true) {
                          if (var5 >= 16) {
                            break L5;
                          } else {
                            L13: {
                              if (var12[var5] == 152) {
                                var12[var5] = 45;
                                break L13;
                              } else {
                                break L13;
                              }
                            }
                            var5++;
                            continue L12;
                          }
                        }
                      }
                      if (var4_ref_ml.i((byte) -106) <= bk.field_J.field_H) {
                        break L4;
                      } else {
                        ti.field_N = 4;
                        pn.field_a = th.field_b;
                        var3 = (Object) (Object) th.field_b;
                        lm.field_f = th.field_b;
                        break L4;
                      }
                    } else {
                      var3 = (Object) (Object) gj.field_c[var4_ref_ml.o(-22625)];
                      if (!var4_ref_ml.q(72)) {
                        break L4;
                      } else {
                        var3 = (Object) (Object) vi.field_N;
                        break L4;
                      }
                    }
                  }
                }
              }
            }
            L14: {
              if (var3 == (Object) (Object) pn.field_a) {
                break L14;
              } else {
                pn.field_a = (int[]) var3;
                lm.field_f = (int[]) var3;
                ti.field_N = -1;
                break L14;
              }
            }
            L15: {
              L16: {
                if (bk.field_J.a(true)) {
                  break L16;
                } else {
                  if (~bm.field_g.field_I != ~bk.field_J.d(false)) {
                    break L16;
                  } else {
                    L17: {
                      if (!bk.field_J.c((byte) 89)) {
                        break L17;
                      } else {
                        if (!bk.field_J.j(39)) {
                          break L16;
                        } else {
                          break L17;
                        }
                      }
                    }
                    if (bk.field_J.g(116)) {
                      break L16;
                    } else {
                      break L15;
                    }
                  }
                }
              }
              var3 = null;
              break L15;
            }
            L18: {
              if (var3 != null) {
                ej.b(0, param0);
                break L18;
              } else {
                vh.field_n = false;
                break L18;
              }
            }
            L19: {
              if (null == mo.field_f) {
                break L19;
              } else {
                if (!param0) {
                  break L19;
                } else {
                  L20: {
                    if (!bm.field_g.field_B) {
                      break L20;
                    } else {
                      mo.field_f = mo.field_f + sk.field_c;
                      break L20;
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
                  break L19;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var2, "sb.B(" + param0 + ',' + -58 + ')');
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
