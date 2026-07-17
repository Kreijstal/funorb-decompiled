/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc implements kg {
    private int field_h;
    static float field_d;
    private int field_g;
    private int field_a;
    private int field_j;
    private jb field_c;
    static hl field_e;
    static ah field_k;
    private int field_b;
    private int field_f;
    static String field_i;
    static hl field_l;

    public static void b(int param0) {
        field_i = null;
        int var1 = -95;
        field_e = null;
        field_l = null;
        field_k = null;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        long var3_long = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        ve var9 = null;
        int var10 = 0;
        int stackIn_20_0 = 0;
        String stackIn_26_0 = null;
        int stackIn_30_0 = 0;
        String stackIn_36_0 = null;
        int stackIn_43_0 = 0;
        ve stackIn_47_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        String stackOut_25_0 = null;
        String stackOut_24_0 = null;
        int stackOut_29_0 = 0;
        int stackOut_28_0 = 0;
        String stackOut_35_0 = null;
        String stackOut_34_0 = null;
        int stackOut_42_0 = 0;
        int stackOut_41_0 = 0;
        ve stackOut_46_0 = null;
        ve stackOut_45_0 = null;
        var10 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              var1_int = pj.field_e;
              var2 = 0;
              if (f.field_z == 2) {
                var3_long = -tg.field_a + k.a(0);
                var2 = (int)((10999L + -var3_long) / 1000L);
                if (var2 >= 0) {
                  break L1;
                } else {
                  var2 = 0;
                  break L1;
                }
              } else {
                break L1;
              }
            }
            var3 = 0;
            L2: while (true) {
              if (pj.field_h.length <= var3) {
                break L0;
              } else {
                L3: {
                  var4 = ml.field_mb[var3];
                  if (0 <= var4) {
                    if (gm.field_h.field_b == var4) {
                      var5 = mc.field_b;
                      break L3;
                    } else {
                      var5 = lk.field_wb;
                      break L3;
                    }
                  } else {
                    var5 = ve.field_b;
                    break L3;
                  }
                }
                L4: {
                  var6 = pj.field_h[var3];
                  if (f.field_z != 2) {
                    break L4;
                  } else {
                    if (var2 == 1) {
                      L5: {
                        if (jl.field_b.length <= fi.field_Ab.length) {
                          stackOut_19_0 = fi.field_Ab.length;
                          stackIn_20_0 = stackOut_19_0;
                          break L5;
                        } else {
                          stackOut_18_0 = jl.field_b.length;
                          stackIn_20_0 = stackOut_18_0;
                          break L5;
                        }
                      }
                      L6: {
                        var7 = stackIn_20_0;
                        if (var3 < 6) {
                          break L6;
                        } else {
                          if (var3 < 6 + var7) {
                            L7: {
                              if (-6 + var3 - -fi.field_Ab.length + -var7 < 0) {
                                stackOut_25_0 = "";
                                stackIn_26_0 = stackOut_25_0;
                                break L7;
                              } else {
                                stackOut_24_0 = fi.field_Ab[-var7 + var3 + (-6 - -fi.field_Ab.length)];
                                stackIn_26_0 = stackOut_24_0;
                                break L7;
                              }
                            }
                            var6 = stackIn_26_0;
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                      }
                      L8: {
                        if (qc.field_db.length < ah.field_j.length) {
                          stackOut_29_0 = ah.field_j.length;
                          stackIn_30_0 = stackOut_29_0;
                          break L8;
                        } else {
                          stackOut_28_0 = qc.field_db.length;
                          stackIn_30_0 = stackOut_28_0;
                          break L8;
                        }
                      }
                      var8 = stackIn_30_0;
                      if (var7 + 7 > var3) {
                        break L4;
                      } else {
                        if (var3 < var7 + (7 - -var8)) {
                          L9: {
                            if (qc.field_db.length > var3 - (7 - -var7)) {
                              stackOut_35_0 = qc.field_db[-var7 + -7 + var3];
                              stackIn_36_0 = stackOut_35_0;
                              break L9;
                            } else {
                              stackOut_34_0 = "";
                              stackIn_36_0 = stackOut_34_0;
                              break L9;
                            }
                          }
                          var6 = stackIn_36_0;
                          break L4;
                        } else {
                          break L4;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                }
                L10: {
                  if (-2 == var4) {
                    var6 = Integer.toString(var2);
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (var4 < 0) {
                    stackOut_42_0 = 0;
                    stackIn_43_0 = stackOut_42_0;
                    break L11;
                  } else {
                    stackOut_41_0 = 1;
                    stackIn_43_0 = stackOut_41_0;
                    break L11;
                  }
                }
                L12: {
                  var7 = fi.a(stackIn_43_0 != 0, var6, (byte) -75);
                  var8 = -(var7 >> 1) + vg.field_Lb;
                  if (var4 < 0) {
                    break L12;
                  } else {
                    L13: {
                      var1_int = var1_int + mn.field_c;
                      if (gm.field_h.field_b != var4) {
                        stackOut_46_0 = hj.field_e;
                        stackIn_47_0 = stackOut_46_0;
                        break L13;
                      } else {
                        stackOut_45_0 = hd.field_t;
                        stackIn_47_0 = stackOut_45_0;
                        break L13;
                      }
                    }
                    L14: {
                      var9 = stackIn_47_0;
                      if (var9 != null) {
                        var9.a(var1_int, var8 + -io.field_a, (byte) -125, (io.field_a << 1) + var7, bj.field_d - -(da.field_e << 1));
                        break L14;
                      } else {
                        break L14;
                      }
                    }
                    var1_int = var1_int + da.field_e;
                    break L12;
                  }
                }
                L15: {
                  if (0 > var4) {
                    dk.field_d.b(var6, var8, jj.field_b + var1_int, var5, -1);
                    var1_int = var1_int + la.field_e;
                    var3++;
                    break L15;
                  } else {
                    cf.field_o.b(var6, var8, rn.field_b + var1_int, var5, -1);
                    var1_int = var1_int + (mn.field_c + da.field_e + bj.field_d);
                    var3++;
                    break L15;
                  }
                }
                var3++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) (Object) var1, "dc.A(" + 1000 + 41);
        }
    }

    dc(jb param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            ((dc) this).field_c = param0;
            ((dc) this).field_a = param6;
            ((dc) this).field_f = param2;
            ((dc) this).field_g = param3;
            ((dc) this).field_j = param1;
            ((dc) this).field_h = param5;
            ((dc) this).field_b = param4;
        } catch (RuntimeException runtimeException) {
            throw oi.a((Throwable) (Object) runtimeException, "dc.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    final static int a(byte param0) {
        if (param0 <= 74) {
            return 13;
        }
        return -lb.field_V + ia.field_K;
    }

    public final void a(na param0, int param1, int param2, boolean param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        kk var12 = null;
        na stackIn_4_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        na stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var11 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param0 instanceof kk) {
                stackOut_3_0 = (na) param0;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = null;
                stackIn_4_0 = (na) (Object) stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var12 = (kk) (Object) stackIn_4_0;
              if (param3) {
                break L2;
              } else {
                field_d = -0.23190410435199738f;
                break L2;
              }
            }
            L3: {
              if (var12 != null) {
                break L3;
              } else {
                break L3;
              }
            }
            ra.c(param1 + param0.field_t, param0.field_w + param2, param0.field_F, param0.field_u, ((dc) this).field_b);
            var7 = -(var12.field_W * 2) + param0.field_F;
            var8 = param1 - (-param0.field_t + -var12.field_W);
            var9 = param2 - -param0.field_w + var12.field_V;
            ra.d(var8, var9, var8 - -var7, var9, ((dc) this).field_g);
            var10 = var12.e((byte) -116) - 1;
            L4: while (true) {
              if (0 > var10) {
                if (null != ((dc) this).field_c) {
                  ((dc) this).field_c.a(var12.field_A, var7 / 2 + var8, var9 - (-((dc) this).field_c.field_H - var12.field_V), ((dc) this).field_j, ((dc) this).field_f);
                  break L0;
                } else {
                  return;
                }
              } else {
                ra.f(var7 * var12.a(var10, (byte) 119) / var12.a(23329) + var8, var9, ((dc) this).field_h, ((dc) this).field_a);
                var10--;
                continue L4;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("dc.L(");
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
          throw oi.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 481.0f;
        field_i = "Drawn";
    }
}
