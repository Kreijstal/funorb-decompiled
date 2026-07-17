/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk extends mh implements qd {
    private nk field_wb;
    static int field_xb;
    static boolean field_yb;
    private boolean field_Cb;
    static String field_vb;
    static o[] field_Bb;
    static int field_zb;
    private boolean field_Ab;

    final void p(int param0) {
        int discarded$0 = 3899;
        this.a(true, hf.a(param0 + 20320, tk.field_f, 248));
        if (param0 == -20371) {
            return;
        }
        field_xb = 66;
    }

    kk(wi param0, nk param1) {
        super(param0, va.field_i, sc.field_o, false, false);
        try {
            ((kk) this).field_wb = param1;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "kk.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final void a(boolean param0, wd param1) {
        RuntimeException var4 = null;
        String var4_ref = null;
        vc var5 = null;
        int var6 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var6 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              ((kk) this).field_Cb = true;
              if (param1.field_i) {
                var4_ref = jl.field_v;
                break L1;
              } else {
                if (param1.field_c == null) {
                  var4_ref = param1.field_h;
                  if (param1.field_b == 248) {
                    L2: {
                      if (!param0) {
                        int discarded$3 = 63;
                        kb.j();
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    var4_ref = tk.field_f;
                    ((kk) this).field_Ab = true;
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  var4_ref = uc.field_e;
                  if (null != ((kk) this).field_wb) {
                    ((kk) this).field_wb.a(2147483647);
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
            }
            L3: {
              var5 = new vc((mh) this, va.field_i, var4_ref);
              if (!param1.field_i) {
                L4: {
                  if (!((kk) this).field_Ab) {
                    if (param1.field_b != 5) {
                      var5.a((byte) -31, ti.field_h, -1);
                      break L4;
                    } else {
                      var5.a((byte) -31, da.field_j, 11);
                      var5.a((byte) -31, pk.field_q, 17);
                      break L4;
                    }
                  } else {
                    pl discarded$4 = var5.a(0, e.field_e, (ce) this);
                    break L4;
                  }
                }
                if (3 == param1.field_b) {
                  var5.a((byte) -31, vl.field_g, 7);
                  break L3;
                } else {
                  if (param1.field_b == 6) {
                    var5.a((byte) -31, ka.field_h, 9);
                    break L3;
                  } else {
                    ((kk) this).c((ub) (Object) var5, -121);
                    return;
                  }
                }
              } else {
                if (param1.field_d) {
                  ((kk) this).c((ub) (Object) new re((kk) this), -128);
                  return;
                } else {
                  pl discarded$5 = var5.a(0, e.field_e, (ce) this);
                  break L3;
                }
              }
            }
            ((kk) this).c((ub) (Object) var5, -121);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var4;
            stackOut_31_1 = new StringBuilder().append("kk.CC(").append(param0).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param1 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L5;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L5;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + 3899 + 41);
        }
    }

    public static void j(byte param0) {
        field_vb = null;
        field_Bb = null;
        if (param0 > 99) {
            return;
        }
        field_zb = -101;
    }

    final static void o() {
        RuntimeException var1 = null;
        int var2 = 0;
        of var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        mg var15 = null;
        int[][] var19 = null;
        RuntimeException decompiledCaughtException = null;
        var12 = wizardrun.field_H;
        try {
          L0: {
            var15 = nk.field_N;
            var2 = var15.f(255);
            var3 = (of) (Object) bh.field_b.b((byte) 53);
            L1: while (true) {
              L2: {
                if (var3 == null) {
                  break L2;
                } else {
                  if (var2 != var3.field_j) {
                    var3 = (of) (Object) bh.field_b.d(8192);
                    continue L1;
                  } else {
                    break L2;
                  }
                }
              }
              if (var3 == null) {
                ql.a(-93);
                return;
              } else {
                L3: {
                  var4 = var15.f(255);
                  if (var4 != 0) {
                    var5 = var3.field_i;
                    ld.field_c[0] = d.field_a;
                    var6_int = 1;
                    L4: while (true) {
                      if (var4 <= var6_int) {
                        bc.a((byte) -69, var5, var4);
                        var6_int = 0;
                        L5: while (true) {
                          if (var4 <= var6_int) {
                            int discarded$1 = 16;
                            fl.f(var5);
                            var6 = new String[2][var5];
                            var19 = new int[2][4 * var5];
                            var8 = lg.field_d;
                            var9 = 0;
                            var10 = 0;
                            L6: while (true) {
                              if (var9 >= var8) {
                                var13 = 0;
                                var9 = var13;
                                var14 = 0;
                                var10 = var14;
                                L7: while (true) {
                                  if (var8 > var13) {
                                    L8: {
                                      var11 = sj.field_m[var5 + var13];
                                      var6[1][var14] = ld.field_c[var11];
                                      var19[1][4 * var14] = ug.field_I[var11];
                                      var19[1][1 + var14 * 4] = sk.field_B[var11];
                                      var19[1][4 * var14 - -2] = tf.field_c[var11];
                                      var19[1][4 * var14 - -3] = mk.field_c[var11];
                                      if (!qj.a(ld.field_c[var11], 81)) {
                                        break L8;
                                      } else {
                                        if (0 == mk.field_c[var11] + sk.field_B[var11] - -tf.field_c[var11]) {
                                          var6[1][var14] = null;
                                          var14--;
                                          break L8;
                                        } else {
                                          break L8;
                                        }
                                      }
                                    }
                                    var13++;
                                    var14++;
                                    continue L7;
                                  } else {
                                    var3.a(false);
                                    break L3;
                                  }
                                }
                              } else {
                                L9: {
                                  var11 = sj.field_m[var9];
                                  var6[0][var10] = ld.field_c[var11];
                                  var19[0][4 * var10] = ug.field_I[var11];
                                  var19[0][1 + 4 * var10] = sk.field_B[var11];
                                  var19[0][var10 * 4 + 2] = tf.field_c[var11];
                                  var19[0][3 + var10 * 4] = mk.field_c[var11];
                                  if (!qj.a(ld.field_c[var11], 110)) {
                                    break L9;
                                  } else {
                                    if (mk.field_c[var11] + (sk.field_B[var11] - -tf.field_c[var11]) != 0) {
                                      break L9;
                                    } else {
                                      var6[0][var10] = null;
                                      var10--;
                                      break L9;
                                    }
                                  }
                                }
                                var9++;
                                var10++;
                                continue L6;
                              }
                            }
                          } else {
                            L10: {
                              ci.a(2026380485, (va) (Object) var15);
                              if (var6_int != 0) {
                                rd.a(var6_int, ki.field_M, lj.field_a, -82, ia.field_j, bi.field_a);
                                var6_int++;
                                break L10;
                              } else {
                                rd.a(var6_int, ki.field_M, lj.field_a, -121, ia.field_j, bi.field_a);
                                var6_int++;
                                var6_int++;
                                break L10;
                              }
                            }
                            var6_int++;
                            continue L5;
                          }
                        }
                      } else {
                        ld.field_c[var6_int] = var15.d(0);
                        var6_int++;
                        continue L4;
                      }
                    }
                  } else {
                    var3.a(false);
                    break L3;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw bd.a((Throwable) (Object) var1, "kk.DC(" + -114 + 41);
        }
    }

    public final void a(int param0, pl param1, int param2, int param3, int param4) {
        if (((kk) this).field_Ab) {
            di.a(true, false, param0 + 19029);
            return;
        }
        try {
            int discarded$3 = 92682;
            hc.f();
            if (param0 != -18905) {
                ((kk) this).field_Ab = false;
            }
            ((kk) this).l(param0 ^ 9704);
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "kk.DA(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final boolean g(int param0) {
        wd var2 = null;
        if (((kk) this).field_H) {
          if (!((kk) this).field_Cb) {
            int discarded$2 = -123;
            var2 = ti.a();
            if (var2 == null) {
              if (param0 != 1) {
                kk.j((byte) -27);
                return super.g(1);
              } else {
                return super.g(1);
              }
            } else {
              int discarded$3 = 3899;
              this.a(false, var2);
              if (param0 != 1) {
                kk.j((byte) -27);
                return super.g(1);
              } else {
                return super.g(1);
              }
            }
          } else {
            if (param0 != 1) {
              kk.j((byte) -27);
              return super.g(1);
            } else {
              return super.g(1);
            }
          }
        } else {
          if (param0 != 1) {
            kk.j((byte) -27);
            return super.g(1);
          } else {
            return super.g(1);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_vb = "The Demon Fortress";
        field_zb = 500;
    }
}
