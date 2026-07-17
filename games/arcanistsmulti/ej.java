/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

class ej extends ag {
    private vl field_K;
    static String field_Q;
    private vn field_O;
    private String[] field_I;
    static am field_R;
    static String field_M;
    static String field_H;
    static String field_N;
    static String field_L;
    static String field_P;

    void a(byte param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a((byte) -111, param1, param2, param3);
        if (param2 != 0) {
            return;
        }
        ac var5 = (ac) (Object) ((ej) this).field_r;
        vl var6 = ((ej) this).field_K;
        if (var6 == null) {
        } else {
            var7 = var5.a((qm) this, (byte) -90, param1);
            var8 = var5.a(param3, -13372, (qm) this);
            do {
                oj.a(-32171, var8 - (-var6.field_m + 2), var7 + (var6.field_o + -2), var6.field_n + 2, var6.field_g - -2);
                var6 = var6.field_h;
            } while (var6 != null);
        }
    }

    boolean a(int param0, qm param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
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
            if (param0 == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ej.A(").append(param0).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0 != 0;
    }

    final void a(int param0, int param1, String param2) {
        RuntimeException runtimeException = null;
        String[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        String[] var7 = null;
        String[] var8 = null;
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
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (((ej) this).field_I == null) {
                  break L2;
                } else {
                  if (((ej) this).field_I.length <= param0) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                var7 = new String[param0 - -1];
                var8 = var7;
                var4 = var8;
                if (((ej) this).field_I == null) {
                  break L3;
                } else {
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= ((ej) this).field_I.length) {
                      break L3;
                    } else {
                      var7[var5] = ((ej) this).field_I[var5];
                      var5++;
                      continue L4;
                    }
                  }
                }
              }
              ((ej) this).field_I = var8;
              break L1;
            }
            if (param1 == 0) {
              ((ej) this).field_I[param0] = param2;
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("ej.P(").append(param0).append(44).append(param1).append(44);
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
          throw aa.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 41);
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        ((ej) this).a(((ac) (Object) ((ej) this).field_r).b((qm) this, 1), param3, param2, param0, -123);
        if (param1 != -4) {
            Object var6 = null;
            ((ej) this).a((qm) null, 33, 61, 69);
        }
    }

    public static void f() {
        field_Q = null;
        field_H = null;
        field_R = null;
        field_P = null;
        field_N = null;
        field_L = null;
        field_M = null;
    }

    final void g(byte param0) {
        int var2 = 0;
        ac var3 = null;
        kh var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        vd var12 = null;
        int var13 = 0;
        int var14 = 0;
        vl var15 = null;
        int var16 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        L0: {
          var16 = ArcanistsMulti.field_G ? 1 : 0;
          if (param0 == 63) {
            break L0;
          } else {
            ej.a(-9);
            break L0;
          }
        }
        ((ej) this).field_O = new vn();
        var2 = 0;
        var3 = (ac) (Object) ((ej) this).field_r;
        var4 = var3.a((qm) this, -127);
        L1: while (true) {
          var5 = ((ej) this).field_g.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            return;
          } else {
            var7 = ((ej) this).field_g.indexOf(">", var5);
            var6 = ((ej) this).field_g.substring(var5 + 9, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((ej) this).field_g.indexOf("</hotspot>", var5);
            var8 = var4.a((byte) 104, var5);
            var9 = var4.a((byte) 79, var2);
            var10 = null;
            var11 = var8;
            L2: while (true) {
              if (var9 < var11) {
                continue L1;
              } else {
                L3: {
                  var12 = var4.field_f[var11];
                  if (var11 != var8) {
                    stackOut_8_0 = var12.field_f[0];
                    stackIn_9_0 = stackOut_8_0;
                    break L3;
                  } else {
                    stackOut_7_0 = var4.a(var5, 0);
                    stackIn_9_0 = stackOut_7_0;
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_9_0;
                  if (var9 != var11) {
                    if (var12 != null) {
                      stackOut_13_0 = var12.field_f[-1 + var12.field_f.length];
                      stackIn_14_0 = stackOut_13_0;
                      break L4;
                    } else {
                      stackOut_12_0 = 0;
                      stackIn_14_0 = stackOut_12_0;
                      break L4;
                    }
                  } else {
                    stackOut_10_0 = var4.a(var2, param0 + -63);
                    stackIn_14_0 = stackOut_10_0;
                    break L4;
                  }
                }
                L5: {
                  var14 = stackIn_14_0;
                  var15 = new vl(var7, var13, var12.field_g, var14 - var13, Math.max(var3.a(27184), var12.field_e + -var12.field_g));
                  if (var10 == null) {
                    break L5;
                  } else {
                    ((vl) var10).field_h = var15;
                    break L5;
                  }
                }
                ((ej) this).field_O.b((pg) (Object) var15, -1);
                var10 = (Object) (Object) var15;
                var11++;
                continue L2;
              }
            }
          }
        }
    }

    private final vl a(int param0, byte param1, int param2) {
        vl var4 = null;
        vl var5 = null;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        var4 = (vl) (Object) ((ej) this).field_O.b(12623);
        L0: while (true) {
          if (var4 != null) {
            var5 = var4;
            L1: while (true) {
              if (var5 == null) {
                var4 = (vl) (Object) ((ej) this).field_O.a(0);
                continue L0;
              } else {
                L2: {
                  if (param0 < var5.field_o) {
                    break L2;
                  } else {
                    if (var5.field_m > param2) {
                      break L2;
                    } else {
                      if (param0 >= var5.field_g + var5.field_o) {
                        break L2;
                      } else {
                        if (var5.field_m - -var5.field_n < param2) {
                          break L2;
                        } else {
                          return var4;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_h;
                continue L1;
              }
            }
          } else {
            return null;
          }
        }
    }

    final static void a(int param0, boolean param1) {
        kc stackIn_5_0 = null;
        kc stackIn_6_0 = null;
        kc stackIn_7_0 = null;
        kc stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        kc stackIn_9_0 = null;
        kc stackIn_10_0 = null;
        kc stackIn_11_0 = null;
        kc stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        kc stackIn_20_0 = null;
        kc stackIn_21_0 = null;
        kc stackIn_22_0 = null;
        kc stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        kc stackIn_24_0 = null;
        kc stackIn_25_0 = null;
        kc stackIn_26_0 = null;
        kc stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        kc stackOut_4_0 = null;
        kc stackOut_5_0 = null;
        kc stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        kc stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        kc stackOut_8_0 = null;
        kc stackOut_9_0 = null;
        kc stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        kc stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        kc stackOut_19_0 = null;
        kc stackOut_20_0 = null;
        kc stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        kc stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        kc stackOut_23_0 = null;
        kc stackOut_24_0 = null;
        kc stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        kc stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        L0: {
          da.a(640 + de.field_e >> 1, de.field_j, 121, -640 + de.field_e >> 1, 0);
          if (ce.field_h <= 0) {
            break L0;
          } else {
            L1: {
              if (null != oo.field_t) {
                oo.field_t.h(k.field_d.field_T, 0);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                stackOut_4_0 = k.field_d;
                stackIn_7_0 = stackOut_4_0;
                stackIn_5_0 = stackOut_4_0;
                if (!param1) {
                  break L3;
                } else {
                  stackOut_5_0 = (kc) (Object) stackIn_5_0;
                  stackIn_7_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (pg.field_d) {
                    break L3;
                  } else {
                    stackOut_6_0 = (kc) (Object) stackIn_6_0;
                    stackOut_6_1 = 1;
                    stackIn_8_0 = stackOut_6_0;
                    stackIn_8_1 = stackOut_6_1;
                    break L2;
                  }
                }
              }
              stackOut_7_0 = (kc) (Object) stackIn_7_0;
              stackOut_7_1 = 0;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              break L2;
            }
            L4: {
              L5: {
                ((kc) (Object) stackIn_8_0).a(stackIn_8_1 != 0, true);
                stackOut_8_0 = fn.field_e;
                stackIn_11_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (!param1) {
                  break L5;
                } else {
                  stackOut_9_0 = (kc) (Object) stackIn_9_0;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_10_0 = stackOut_9_0;
                  if (pg.field_d) {
                    break L5;
                  } else {
                    stackOut_10_0 = (kc) (Object) stackIn_10_0;
                    stackOut_10_1 = 1;
                    stackIn_12_0 = stackOut_10_0;
                    stackIn_12_1 = stackOut_10_1;
                    break L4;
                  }
                }
              }
              stackOut_11_0 = (kc) (Object) stackIn_11_0;
              stackOut_11_1 = 0;
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              break L4;
            }
            ((kc) (Object) stackIn_12_0).a(stackIn_12_1 != 0, true);
            break L0;
          }
        }
        L6: {
          L7: {
            if (sm.field_a > 0) {
              break L7;
            } else {
              if (0 < oo.field_y) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          L8: {
            if (oo.field_t != null) {
              oo.field_t.h(hl.field_m.field_T, 0);
              break L8;
            } else {
              break L8;
            }
          }
          L9: {
            L10: {
              stackOut_19_0 = hl.field_m;
              stackIn_22_0 = stackOut_19_0;
              stackIn_20_0 = stackOut_19_0;
              if (!param1) {
                break L10;
              } else {
                stackOut_20_0 = (kc) (Object) stackIn_20_0;
                stackIn_22_0 = stackOut_20_0;
                stackIn_21_0 = stackOut_20_0;
                if (so.field_j) {
                  break L10;
                } else {
                  stackOut_21_0 = (kc) (Object) stackIn_21_0;
                  stackOut_21_1 = 1;
                  stackIn_23_0 = stackOut_21_0;
                  stackIn_23_1 = stackOut_21_1;
                  break L9;
                }
              }
            }
            stackOut_22_0 = (kc) (Object) stackIn_22_0;
            stackOut_22_1 = 0;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            break L9;
          }
          L11: {
            L12: {
              ((kc) (Object) stackIn_23_0).a(stackIn_23_1 != 0, true);
              stackOut_23_0 = oh.field_h;
              stackIn_26_0 = stackOut_23_0;
              stackIn_24_0 = stackOut_23_0;
              if (!param1) {
                break L12;
              } else {
                stackOut_24_0 = (kc) (Object) stackIn_24_0;
                stackIn_26_0 = stackOut_24_0;
                stackIn_25_0 = stackOut_24_0;
                if (so.field_j) {
                  break L12;
                } else {
                  stackOut_25_0 = (kc) (Object) stackIn_25_0;
                  stackOut_25_1 = 1;
                  stackIn_27_0 = stackOut_25_0;
                  stackIn_27_1 = stackOut_25_1;
                  break L11;
                }
              }
            }
            stackOut_26_0 = (kc) (Object) stackIn_26_0;
            stackOut_26_1 = 0;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            break L11;
          }
          ((kc) (Object) stackIn_27_0).a(stackIn_27_1 != 0, true);
          break L6;
        }
        oo.c(-15405);
    }

    final static void a(int param0) {
        String var2 = null;
        if (!(null == va.field_e)) {
            var2 = va.field_e;
            String var1 = var2;
            jl.a(99, tj.a(-118, new String[1], i.field_b));
            va.field_e = null;
        }
        if (param0 < 94) {
            field_P = null;
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, -111);
        ((ej) this).g((byte) 63);
        if (param4 >= -49) {
            ((ej) this).field_K = null;
        }
    }

    final static void a(int param0, int param1) {
        int var2 = (-640 + fh.field_g) / 2;
        int var3 = ea.field_F * ea.field_F;
        int var4 = var3 - param1 * param1;
        hl.field_m.a(199, -(var4 * 199 / var3) + var2, 90, -4 + de.field_j - 210, (byte) -120);
        oh.field_h.a(438, 202 + (var2 - -(438 * var4 / var3)), 0, -4 + de.field_j + -120, (byte) -120);
    }

    String b(boolean param0) {
        if (null == ((ej) this).field_K) {
            return null;
        }
        if (((ej) this).field_I == null) {
            return null;
        }
        if (param0) {
            return null;
        }
        if (((ej) this).field_K.field_j >= ((ej) this).field_I.length) {
            return null;
        }
        return ((ej) this).field_I[((ej) this).field_K.field_j];
    }

    ej(String param0, pf param1) {
        super(param0, (wc) null);
        ((ej) this).field_K = null;
        try {
            ((ej) this).field_r = param1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "ej.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void b(int param0, boolean param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var12_ref_String = null;
        int var13 = 0;
        String var14 = null;
        int var14_int = 0;
        String var15 = null;
        int var17 = 0;
        String var18 = null;
        ml var19 = null;
        String var20 = null;
        String var21 = null;
        String var22 = null;
        String var23 = null;
        String var24 = null;
        ml var25 = null;
        ml var26 = null;
        String var27 = null;
        ml var28 = null;
        String var29 = null;
        String var30 = null;
        String var31 = null;
        String var32 = null;
        int stackIn_1_0 = 0;
        int stackIn_1_1 = 0;
        int stackIn_1_2 = 0;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_2_2 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        int stackIn_3_3 = 0;
        int stackIn_6_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_7_2 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        int stackIn_9_3 = 0;
        lg stackIn_10_0 = null;
        String stackIn_10_1 = null;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        lg stackIn_11_0 = null;
        String stackIn_11_1 = null;
        int stackIn_11_2 = 0;
        int stackIn_11_3 = 0;
        lg stackIn_12_0 = null;
        String stackIn_12_1 = null;
        int stackIn_12_2 = 0;
        int stackIn_12_3 = 0;
        int stackIn_12_4 = 0;
        StringBuilder stackIn_108_0 = null;
        StringBuilder stackIn_109_0 = null;
        StringBuilder stackIn_110_0 = null;
        String stackIn_110_1 = null;
        StringBuilder stackIn_129_0 = null;
        StringBuilder stackIn_130_0 = null;
        StringBuilder stackIn_131_0 = null;
        String stackIn_131_1 = null;
        StringBuilder stackIn_163_0 = null;
        StringBuilder stackIn_164_0 = null;
        StringBuilder stackIn_165_0 = null;
        String stackIn_165_1 = null;
        StringBuilder stackIn_181_0 = null;
        StringBuilder stackIn_182_0 = null;
        StringBuilder stackIn_183_0 = null;
        String stackIn_183_1 = null;
        int stackOut_0_0 = 0;
        int stackOut_0_1 = 0;
        int stackOut_0_2 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        int stackOut_2_3 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        int stackOut_1_3 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_7_3 = 0;
        lg stackOut_9_0 = null;
        String stackOut_9_1 = null;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        lg stackOut_11_0 = null;
        String stackOut_11_1 = null;
        int stackOut_11_2 = 0;
        int stackOut_11_3 = 0;
        int stackOut_11_4 = 0;
        lg stackOut_10_0 = null;
        String stackOut_10_1 = null;
        int stackOut_10_2 = 0;
        int stackOut_10_3 = 0;
        int stackOut_10_4 = 0;
        StringBuilder stackOut_180_0 = null;
        StringBuilder stackOut_182_0 = null;
        String stackOut_182_1 = null;
        StringBuilder stackOut_181_0 = null;
        String stackOut_181_1 = null;
        StringBuilder stackOut_162_0 = null;
        StringBuilder stackOut_164_0 = null;
        String stackOut_164_1 = null;
        StringBuilder stackOut_163_0 = null;
        String stackOut_163_1 = null;
        StringBuilder stackOut_128_0 = null;
        StringBuilder stackOut_130_0 = null;
        String stackOut_130_1 = null;
        StringBuilder stackOut_129_0 = null;
        String stackOut_129_1 = null;
        StringBuilder stackOut_107_0 = null;
        StringBuilder stackOut_109_0 = null;
        String stackOut_109_1 = null;
        StringBuilder stackOut_108_0 = null;
        String stackOut_108_1 = null;
        L0: {
          var17 = ArcanistsMulti.field_G ? 1 : 0;
          var2_int = n.field_g.field_nb;
          var3 = 90;
          var4 = lo.field_q + -30 + var2_int;
          var5 = 13;
          var6 = 18;
          var7 = lo.field_q + var2_int + -100;
          stackOut_0_0 = var6;
          stackOut_0_1 = var7;
          stackOut_0_2 = 9;
          stackIn_2_0 = stackOut_0_0;
          stackIn_2_1 = stackOut_0_1;
          stackIn_2_2 = stackOut_0_2;
          stackIn_1_0 = stackOut_0_0;
          stackIn_1_1 = stackOut_0_1;
          stackIn_1_2 = stackOut_0_2;
          if (!hc.field_f) {
            stackOut_2_0 = stackIn_2_0;
            stackOut_2_1 = stackIn_2_1;
            stackOut_2_2 = stackIn_2_2;
            stackOut_2_3 = 8421504;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            stackIn_3_2 = stackOut_2_2;
            stackIn_3_3 = stackOut_2_3;
            break L0;
          } else {
            stackOut_1_0 = stackIn_1_0;
            stackOut_1_1 = stackIn_1_1;
            stackOut_1_2 = stackIn_1_2;
            stackOut_1_3 = 16777215;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_3_2 = stackOut_1_2;
            stackIn_3_3 = stackOut_1_3;
            break L0;
          }
        }
        L1: {
          de.i(stackIn_3_0, stackIn_3_1, stackIn_3_2, stackIn_3_3);
          de.c(var6, var7, 9, 0);
          if (bm.field_g.field_I >= 0) {
            stackOut_5_0 = bm.field_g.field_I;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 6;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var8 = stackIn_6_0;
          var9 = nj.field_n[var8];
          stackOut_6_0 = var6;
          stackOut_6_1 = var7;
          stackOut_6_2 = 7;
          stackIn_8_0 = stackOut_6_0;
          stackIn_8_1 = stackOut_6_1;
          stackIn_8_2 = stackOut_6_2;
          stackIn_7_0 = stackOut_6_0;
          stackIn_7_1 = stackOut_6_1;
          stackIn_7_2 = stackOut_6_2;
          if (hc.field_f) {
            stackOut_8_0 = stackIn_8_0;
            stackOut_8_1 = stackIn_8_1;
            stackOut_8_2 = stackIn_8_2;
            stackOut_8_3 = var9;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            stackIn_9_2 = stackOut_8_2;
            stackIn_9_3 = stackOut_8_3;
            break L2;
          } else {
            stackOut_7_0 = stackIn_7_0;
            stackOut_7_1 = stackIn_7_1;
            stackOut_7_2 = stackIn_7_2;
            stackOut_7_3 = var9 >> 1 & 8355711;
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_9_2 = stackOut_7_2;
            stackIn_9_3 = stackOut_7_3;
            break L2;
          }
        }
        L3: {
          de.i(stackIn_9_0, stackIn_9_1, stackIn_9_2, stackIn_9_3);
          de.c(var6, var7, 7, 0);
          stackOut_9_0 = mi.field_B;
          stackOut_9_1 = "?";
          stackOut_9_2 = var6;
          stackOut_9_3 = var7 - (-(mi.field_B.field_C / 2) - -(mi.field_B.field_m / 2));
          stackIn_11_0 = stackOut_9_0;
          stackIn_11_1 = stackOut_9_1;
          stackIn_11_2 = stackOut_9_2;
          stackIn_11_3 = stackOut_9_3;
          stackIn_10_0 = stackOut_9_0;
          stackIn_10_1 = stackOut_9_1;
          stackIn_10_2 = stackOut_9_2;
          stackIn_10_3 = stackOut_9_3;
          if (!hc.field_f) {
            stackOut_11_0 = (lg) (Object) stackIn_11_0;
            stackOut_11_1 = (String) (Object) stackIn_11_1;
            stackOut_11_2 = stackIn_11_2;
            stackOut_11_3 = stackIn_11_3;
            stackOut_11_4 = 8421504;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            stackIn_12_2 = stackOut_11_2;
            stackIn_12_3 = stackOut_11_3;
            stackIn_12_4 = stackOut_11_4;
            break L3;
          } else {
            stackOut_10_0 = (lg) (Object) stackIn_10_0;
            stackOut_10_1 = (String) (Object) stackIn_10_1;
            stackOut_10_2 = stackIn_10_2;
            stackOut_10_3 = stackIn_10_3;
            stackOut_10_4 = 16777215;
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_12_2 = stackOut_10_2;
            stackIn_12_3 = stackOut_10_3;
            stackIn_12_4 = stackOut_10_4;
            break L3;
          }
        }
        L4: {
          ((lg) (Object) stackIn_12_0).b(stackIn_12_1, stackIn_12_2, stackIn_12_3, stackIn_12_4, 0);
          var10 = -an.field_g + var6;
          var11 = var7 - me.field_I;
          if (var11 * var11 + var10 * var10 >= 81) {
            break L4;
          } else {
            if (!param1) {
              break L4;
            } else {
              mf.field_g = -2;
              de.c(var6, var7, 9, 16777215, 128);
              var18 = mk.field_L;
              mi.field_B.a(var18, 5 + var6, -1 + var7, 0, 0);
              mi.field_B.a(var18, var6 + 4, var7, 0, 0);
              mi.field_B.a(var18, 5 + var6 + 1, var7, 0, 0);
              mi.field_B.a(var18, var6 + 5, 1 + var7, 0, 0);
              mi.field_B.a(var18, 5 + var6, var7, 16777215, 0);
              break L4;
            }
          }
        }
        L5: {
          if (bk.field_J.a(-31497) != 8) {
            break L5;
          } else {
            if (12 >= lm.field_f.length) {
              break L5;
            } else {
              var4 -= 6;
              var3 -= 40;
              break L5;
            }
          }
        }
        var12 = 0;
        L6: while (true) {
          if (var12 >= lm.field_f.length) {
            L7: {
              if (ti.field_N != -1) {
                var3 = 22;
                var4 = lo.field_q + 387 + (-480 + var2_int);
                bb.field_g[dd.field_f[ti.field_N]].c(var3, var4);
                var3 = 75;
                var4 = var2_int - 50;
                tj.field_t.a(tc.field_w[ti.field_N], var3, var4, 16777215, 0);
                break L7;
              } else {
                break L7;
              }
            }
            L8: {
              if (mf.field_g <= -1) {
                break L8;
              } else {
                L9: {
                  var3 = 75;
                  if (hc.field_f) {
                    kl.field_A = 256;
                    mo.field_f = vm.field_d[lm.field_f[mf.field_g]];
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  L11: {
                    var4 = -50 + var2_int;
                    if (8 != bk.field_J.a(-31497)) {
                      break L11;
                    } else {
                      if (lm.field_f.length > 12) {
                        var4 = -(16 * (1 & mf.field_g)) - 30 + var2_int;
                        var3 = 50 - -(mf.field_g * 22);
                        break L10;
                      } else {
                        break L11;
                      }
                    }
                  }
                  var4 = -480 + var2_int + (450 + -(8 * (mf.field_g & 1)));
                  var3 = 90 + 26 * mf.field_g;
                  break L10;
                }
                var5 = 24;
                de.c(var3 + 2, 2 + var4, var5, 0, 128);
                de.i(var3, var4, var5, 13680256);
                de.i(var3, var4, var5 + -3, 16777215);
                de.c(var3, var4, var5, 0);
                de.c(var3, var4, var5 - 3, 0);
                bb.field_g[dd.field_f[lm.field_f[mf.field_g]]].c(-20 + var3, -20 + var4);
                var24 = tc.field_w[lm.field_f[mf.field_g]];
                var12_ref_String = var24;
                mi.field_B.b(var12_ref_String, var3, var4 + (-1 + -var5), 0, 0);
                mi.field_B.b(var12_ref_String, -1 + var3, var4 + -var5, 0, 0);
                mi.field_B.b(var24, var3 + 1, var4 - var5, 0, 0);
                mi.field_B.b(var12_ref_String, var3, var4 + 1 + -var5, 0, 0);
                mi.field_B.b(var12_ref_String, var3, -var5 + var4, 16777215, 0);
                var12 = bk.field_J.a(lm.field_f[mf.field_g], bk.field_J.d(false), -770226943);
                if (bk.field_J.a(lm.field_f[mf.field_g], true, bm.field_g.field_bb)) {
                  if (var12 > 0) {
                    L12: {
                      stackOut_180_0 = new StringBuilder().append(var12);
                      stackIn_182_0 = stackOut_180_0;
                      stackIn_181_0 = stackOut_180_0;
                      if (1 >= var12) {
                        stackOut_182_0 = (StringBuilder) (Object) stackIn_182_0;
                        stackOut_182_1 = tc.field_z;
                        stackIn_183_0 = stackOut_182_0;
                        stackIn_183_1 = stackOut_182_1;
                        break L12;
                      } else {
                        stackOut_181_0 = (StringBuilder) (Object) stackIn_181_0;
                        stackOut_181_1 = tk.field_s;
                        stackIn_183_0 = stackOut_181_0;
                        stackIn_183_1 = stackOut_181_1;
                        break L12;
                      }
                    }
                    L13: {
                      var14 = stackIn_183_1;
                      if (-1 != hh.field_b[lm.field_f[mf.field_g]]) {
                        break L13;
                      } else {
                        var14 = mj.field_x;
                        break L13;
                      }
                    }
                    mi.field_B.a(var14, var5 + var3, -1 + var4, 0, 0);
                    mi.field_B.a(var14, var3 - (-var5 - -1), var4, 0, 0);
                    mi.field_B.a(var14, var3 - -var5 + 1, var4, 0, 0);
                    mi.field_B.a(var14, var5 + var3, 1 + var4, 0, 0);
                    mi.field_B.a(var14, var5 + var3, var4, 16777215, 0);
                    break L8;
                  } else {
                    break L8;
                  }
                } else {
                  L14: {
                    de.c(var3, var4, var5, 0, 192);
                    if (11 == lm.field_f[mf.field_g]) {
                      break L14;
                    } else {
                      L15: {
                        if (93 != lm.field_f[mf.field_g]) {
                          break L15;
                        } else {
                          if (bk.field_J.a(bm.field_g.field_bb, true).o(-22625) != 33) {
                            break L14;
                          } else {
                            break L15;
                          }
                        }
                      }
                      L16: {
                        if (lm.field_f[mf.field_g] != 95) {
                          break L16;
                        } else {
                          if (bk.field_J.a(bm.field_g.field_bb, true).o(-22625) != 31) {
                            break L14;
                          } else {
                            break L16;
                          }
                        }
                      }
                      L17: {
                        if (!bk.field_J.field_f) {
                          break L17;
                        } else {
                          if (!bk.field_J.d((byte) 66, lm.field_f[mf.field_g])) {
                            L18: {
                              var31 = s.field_a;
                              if (8 + mi.field_B.b(var31) + var5 + var3 > 640) {
                                var3 = 640 + (-var5 + -mi.field_B.b(var31) - 8);
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            mi.field_B.a(var31, var5 + var3, -1 + var4, 0, 0);
                            mi.field_B.a(var31, var5 + (var3 - 1), var4, 0, 0);
                            mi.field_B.a(var31, 1 + (var5 + var3), var4, 0, 0);
                            mi.field_B.a(var31, var3 + var5, 1 + var4, 0, 0);
                            mi.field_B.a(var31, var3 - -var5, var4, 16777215, 0);
                            break L8;
                          } else {
                            break L17;
                          }
                        }
                      }
                      if (lm.field_f[mf.field_g] == 150) {
                        L19: {
                          var30 = bj.field_jb;
                          if (var5 + (var3 - (-mi.field_B.b(var30) + -8)) <= 640) {
                            break L19;
                          } else {
                            var3 = -8 - (mi.field_B.b(var30) + var5) + 640;
                            break L19;
                          }
                        }
                        mi.field_B.a(var30, var5 + var3, -1 + var4, 0, 0);
                        mi.field_B.a(var30, var3 + var5 - 1, var4, 0, 0);
                        mi.field_B.a(var30, 1 + var3 - -var5, var4, 0, 0);
                        mi.field_B.a(var30, var5 + var3, 1 + var4, 0, 0);
                        mi.field_B.a(var30, var3 - -var5, var4, 16777215, 0);
                        break L8;
                      } else {
                        if (var12 > 0) {
                          if (hh.field_b[lm.field_f[mf.field_g]] == 0) {
                            break L8;
                          } else {
                            var14_int = le.field_d[lm.field_f[mf.field_g]] + -(bk.field_J.n((byte) -75) / bk.field_J.s(0));
                            if (var14_int > 0) {
                              L20: {
                                stackOut_162_0 = new StringBuilder().append(var14_int);
                                stackIn_164_0 = stackOut_162_0;
                                stackIn_163_0 = stackOut_162_0;
                                if (var14_int > 1) {
                                  stackOut_164_0 = (StringBuilder) (Object) stackIn_164_0;
                                  stackOut_164_1 = ki.field_x;
                                  stackIn_165_0 = stackOut_164_0;
                                  stackIn_165_1 = stackOut_164_1;
                                  break L20;
                                } else {
                                  stackOut_163_0 = (StringBuilder) (Object) stackIn_163_0;
                                  stackOut_163_1 = tg.field_g;
                                  stackIn_165_0 = stackOut_163_0;
                                  stackIn_165_1 = stackOut_163_1;
                                  break L20;
                                }
                              }
                              L21: {
                                var29 = stackIn_165_1;
                                if (640 >= mi.field_B.b(var29) + (var5 + var3 - -8)) {
                                  break L21;
                                } else {
                                  var3 = -var5 - mi.field_B.b(var29) + 632;
                                  break L21;
                                }
                              }
                              mi.field_B.a(var29, var3 + var5, -1 + var4, 0, 0);
                              mi.field_B.a(var29, var5 + (var3 + -1), var4, 0, 0);
                              mi.field_B.a(var29, var3 + var5 - -1, var4, 0, 0);
                              mi.field_B.a(var29, var3 + var5, 1 + var4, 0, 0);
                              mi.field_B.a(var29, var5 + var3, var4, 16777215, 0);
                              break L8;
                            } else {
                              L22: {
                                var15 = qa.field_k;
                                var28 = bk.field_J.a(bm.field_g.field_bb, true);
                                if (var28.o(-22625) == 19) {
                                  var15 = sc.field_T;
                                  break L22;
                                } else {
                                  break L22;
                                }
                              }
                              L23: {
                                if (var28.o(-22625) == 18) {
                                  var15 = bj.field_sb;
                                  break L23;
                                } else {
                                  break L23;
                                }
                              }
                              L24: {
                                if (16 != var28.o(-22625)) {
                                  break L24;
                                } else {
                                  var15 = oi.field_a;
                                  break L24;
                                }
                              }
                              L25: {
                                if (cf.field_f) {
                                  var15 = tk.field_p;
                                  break L25;
                                } else {
                                  break L25;
                                }
                              }
                              L26: {
                                if (lm.field_f[mf.field_g] != 87) {
                                  break L26;
                                } else {
                                  if (var28.o(-22625) == 19) {
                                    break L26;
                                  } else {
                                    var15 = hc.field_g;
                                    break L26;
                                  }
                                }
                              }
                              L27: {
                                if (lm.field_f[mf.field_g] != 87) {
                                  break L27;
                                } else {
                                  if (var28.o(-22625) == 19) {
                                    var15 = rc.field_l;
                                    break L27;
                                  } else {
                                    break L27;
                                  }
                                }
                              }
                              L28: {
                                if (lm.field_f[mf.field_g] != 116) {
                                  break L28;
                                } else {
                                  var15 = hc.field_g;
                                  break L28;
                                }
                              }
                              L29: {
                                if (lm.field_f[mf.field_g] == 4) {
                                  var15 = "Being entangled blocks this spell.";
                                  break L29;
                                } else {
                                  break L29;
                                }
                              }
                              L30: {
                                if (mi.field_B.b(var15) + var5 + (var3 - -8) <= 640) {
                                  break L30;
                                } else {
                                  var3 = -8 - mi.field_B.b(var15) - (var5 - 640);
                                  break L30;
                                }
                              }
                              mi.field_B.a(var15, var3 - -var5, var4 - 1, 0, 0);
                              mi.field_B.a(var15, -1 + var5 + var3, var4, 0, 0);
                              mi.field_B.a(var15, var3 - (-var5 + -1), var4, 0, 0);
                              mi.field_B.a(var15, var5 + var3, 1 + var4, 0, 0);
                              mi.field_B.a(var15, var3 - -var5, var4, 16777215, 0);
                              break L8;
                            }
                          }
                        } else {
                          if (hh.field_b[lm.field_f[mf.field_g]] == -1) {
                            var14_int = bk.field_J.b(lm.field_f[mf.field_g], -102, bk.field_J.d(false));
                            if (var14_int > 0) {
                              L31: {
                                stackOut_128_0 = new StringBuilder().append(var14_int);
                                stackIn_130_0 = stackOut_128_0;
                                stackIn_129_0 = stackOut_128_0;
                                if (var14_int > 1) {
                                  stackOut_130_0 = (StringBuilder) (Object) stackIn_130_0;
                                  stackOut_130_1 = ki.field_x;
                                  stackIn_131_0 = stackOut_130_0;
                                  stackIn_131_1 = stackOut_130_1;
                                  break L31;
                                } else {
                                  stackOut_129_0 = (StringBuilder) (Object) stackIn_129_0;
                                  stackOut_129_1 = tg.field_g;
                                  stackIn_131_0 = stackOut_129_0;
                                  stackIn_131_1 = stackOut_129_1;
                                  break L31;
                                }
                              }
                              L32: {
                                var27 = stackIn_131_1;
                                if (var5 + (var3 - -mi.field_B.b(var27)) + 8 <= 640) {
                                  break L32;
                                } else {
                                  var3 = -8 - (var5 + (mi.field_B.b(var27) - 640));
                                  break L32;
                                }
                              }
                              mi.field_B.a(var27, var3 + var5, -1 + var4, 0, 0);
                              mi.field_B.a(var27, var5 + (var3 + -1), var4, 0, 0);
                              mi.field_B.a(var27, var3 - -var5 - -1, var4, 0, 0);
                              mi.field_B.a(var27, var3 - -var5, 1 + var4, 0, 0);
                              mi.field_B.a(var27, var5 + var3, var4, 16777215, 0);
                              break L8;
                            } else {
                              break L8;
                            }
                          } else {
                            if (hh.field_b[lm.field_f[mf.field_g]] == 0) {
                              L33: {
                                var14_int = le.field_d[lm.field_f[mf.field_g]] + -(bk.field_J.n((byte) -75) / bk.field_J.s(0));
                                stackOut_107_0 = new StringBuilder().append(var14_int);
                                stackIn_109_0 = stackOut_107_0;
                                stackIn_108_0 = stackOut_107_0;
                                if (var14_int > 1) {
                                  stackOut_109_0 = (StringBuilder) (Object) stackIn_109_0;
                                  stackOut_109_1 = ki.field_x;
                                  stackIn_110_0 = stackOut_109_0;
                                  stackIn_110_1 = stackOut_109_1;
                                  break L33;
                                } else {
                                  stackOut_108_0 = (StringBuilder) (Object) stackIn_108_0;
                                  stackOut_108_1 = tg.field_g;
                                  stackIn_110_0 = stackOut_108_0;
                                  stackIn_110_1 = stackOut_108_1;
                                  break L33;
                                }
                              }
                              L34: {
                                var15 = stackIn_110_1;
                                if (0 <= var14_int) {
                                  break L34;
                                } else {
                                  var15 = "";
                                  break L34;
                                }
                              }
                              L35: {
                                if (lm.field_f[mf.field_g] != 104) {
                                  break L35;
                                } else {
                                  var15 = tk.field_p;
                                  break L35;
                                }
                              }
                              L36: {
                                L37: {
                                  var26 = bk.field_J.a(bm.field_g.field_bb, true);
                                  if (lm.field_f[mf.field_g] == 124) {
                                    break L37;
                                  } else {
                                    if (lm.field_f[mf.field_g] != 130) {
                                      break L36;
                                    } else {
                                      break L37;
                                    }
                                  }
                                }
                                if (!var26.c(false)) {
                                  break L36;
                                } else {
                                  var15 = qn.field_kb;
                                  break L36;
                                }
                              }
                              L38: {
                                if (var26.o(-22625) == 18) {
                                  var15 = bj.field_sb;
                                  break L38;
                                } else {
                                  break L38;
                                }
                              }
                              L39: {
                                if (var26.o(-22625) == 16) {
                                  var15 = oi.field_a;
                                  break L39;
                                } else {
                                  break L39;
                                }
                              }
                              mi.field_B.a(var15, var3 + var5, var4 + -1, 0, 0);
                              mi.field_B.a(var15, -1 + (var5 + var3), var4, 0, 0);
                              mi.field_B.a(var15, 1 + var3 - -var5, var4, 0, 0);
                              mi.field_B.a(var15, var5 + var3, 1 + var4, 0, 0);
                              mi.field_B.a(var15, var3 - -var5, var4, 16777215, 0);
                              break L8;
                            } else {
                              if (0 <= var12) {
                                break L8;
                              } else {
                                L40: {
                                  var14 = qa.field_k;
                                  var25 = bk.field_J.a(bm.field_g.field_bb, true);
                                  if (18 == var25.o(-22625)) {
                                    var14 = bj.field_sb;
                                    break L40;
                                  } else {
                                    break L40;
                                  }
                                }
                                L41: {
                                  if (16 == var25.o(-22625)) {
                                    var14 = oi.field_a;
                                    break L41;
                                  } else {
                                    break L41;
                                  }
                                }
                                mi.field_B.a(var14, var5 + var3, var4 - 1, 0, 0);
                                mi.field_B.a(var14, var5 + var3 - 1, var4, 0, 0);
                                mi.field_B.a(var14, var5 + (var3 + 1), var4, 0, 0);
                                mi.field_B.a(var14, var5 + var3, 1 + var4, 0, 0);
                                mi.field_B.a(var14, var3 - -var5, var4, 16777215, 0);
                                break L8;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  L42: {
                    var32 = "";
                    var14 = var32;
                    var14 = var32;
                    var14 = var32;
                    if (mi.field_B.b(var32) + var5 + var3 + 8 <= 640) {
                      break L42;
                    } else {
                      var3 = -mi.field_B.b(var32) - (var5 + 8) + 640;
                      break L42;
                    }
                  }
                  mi.field_B.a(var32, var5 + var3, -1 + var4, 0, 0);
                  mi.field_B.a(var14, -1 + (var3 - -var5), var4, 0, 0);
                  mi.field_B.a(var32, 1 + (var3 + var5), var4, 0, 0);
                  mi.field_B.a(var32, var5 + var3, 1 + var4, 0, 0);
                  mi.field_B.a(var14, var5 + var3, var4, 16777215, 0);
                  break L8;
                }
              }
            }
            vh.field_n = true;
            return;
          } else {
            L43: {
              if (lm.field_f[var12] <= -1) {
                break L43;
              } else {
                L44: {
                  L45: {
                    if (bk.field_J.a(-31497) != 8) {
                      break L45;
                    } else {
                      if (lm.field_f.length > 12) {
                        L46: {
                          if (0 != (var12 & 1)) {
                            var4 -= 16;
                            break L46;
                          } else {
                            var4 += 16;
                            break L46;
                          }
                        }
                        var3 -= 4;
                        break L44;
                      } else {
                        break L45;
                      }
                    }
                  }
                  if ((1 & var12) == 0) {
                    var4 += 8;
                    break L44;
                  } else {
                    var4 -= 8;
                    break L44;
                  }
                }
                L47: {
                  de.c(2 + var3, var4 + 2, var5, 0, 128);
                  de.i(var3, var4, var5, 13680256);
                  de.i(var3, var4, -3 + var5, 16777215);
                  de.c(var3, var4, var5, 0);
                  de.c(var3, var4, var5 - 3, 0);
                  bb.field_g[dd.field_f[lm.field_f[var12]]].b(var3 - 9, -9 + var4);
                  if (bk.field_J.a(lm.field_f[var12], true, bm.field_g.field_bb)) {
                    var13 = bk.field_J.a(lm.field_f[var12], bk.field_J.d(false), -770226943);
                    if (var13 <= 0) {
                      break L47;
                    } else {
                      if (0 >= hh.field_b[lm.field_f[var12]]) {
                        break L47;
                      } else {
                        var23 = Integer.toString(var13);
                        mi.field_B.c(var23, var3 + (var5 / 2 + -1), 10 + var4, 0, 0);
                        mi.field_B.c(var23, var3 - -(var5 / 2), -1 + (10 + var4), 0, 0);
                        mi.field_B.c(var23, var5 / 2 + var3, var4 - -10, 16777215, 0);
                        break L47;
                      }
                    }
                  } else {
                    L48: {
                      de.c(var3, var4, var5, 0, 192);
                      var13 = bk.field_J.a(lm.field_f[var12], bk.field_J.d(false), -770226943);
                      if (bk.field_J.field_f) {
                        if (lm.field_f[var12] == 11) {
                          break L48;
                        } else {
                          bb.field_g[90].b(var3 - 9, var4 + -9);
                          break L47;
                        }
                      } else {
                        L49: {
                          if (var13 > 0) {
                            break L49;
                          } else {
                            if (lm.field_f[var12] == 37) {
                              break L49;
                            } else {
                              if (hh.field_b[lm.field_f[var12]] == -1) {
                                L50: {
                                  var14_int = bk.field_J.b(lm.field_f[var12], -102, bk.field_J.d(false));
                                  if (var14_int <= 0) {
                                    break L50;
                                  } else {
                                    var21 = Integer.toString(var14_int);
                                    mi.field_B.c(var21, -1 + var3 - -(var5 / 2), 10 + var4, 0, 0);
                                    mi.field_B.c(var21, var5 / 2 + var3, 10 + (var4 - 1), 0, 0);
                                    mi.field_B.c(var21, var5 / 2 + var3, var4 + 10, 16711680, 0);
                                    break L50;
                                  }
                                }
                                break L47;
                              } else {
                                L51: {
                                  if (hh.field_b[lm.field_f[var12]] != 0) {
                                    break L51;
                                  } else {
                                    if (150 == lm.field_f[var12]) {
                                      break L51;
                                    } else {
                                      if (104 == lm.field_f[var12]) {
                                        break L51;
                                      } else {
                                        if (lm.field_f[var12] == 11) {
                                          break L51;
                                        } else {
                                          L52: {
                                            L53: {
                                              var14 = "";
                                              var19 = bk.field_J.a(bm.field_g.field_bb, true);
                                              if (lm.field_f[var12] == 124) {
                                                break L53;
                                              } else {
                                                if (lm.field_f[var12] != 130) {
                                                  break L52;
                                                } else {
                                                  break L53;
                                                }
                                              }
                                            }
                                            if (!var19.c(false)) {
                                              break L52;
                                            } else {
                                              var14 = "X";
                                              break L52;
                                            }
                                          }
                                          mi.field_B.c(var14, var3 - -(var5 / 2) + -1, 10 + var4, 0, 0);
                                          mi.field_B.c(var14, var5 / 2 + var3, 10 + var4 - 1, 0, 0);
                                          mi.field_B.c(var14, var5 / 2 + var3, 10 + var4, 16711680, 0);
                                          break L47;
                                        }
                                      }
                                    }
                                  }
                                }
                                if (var13 != -1) {
                                  break L48;
                                } else {
                                  var20 = "X";
                                  var14 = var20;
                                  mi.field_B.c(var20, var5 / 2 + var3 - 1, var4 + 10, 0, 0);
                                  mi.field_B.c(var20, var5 / 2 + var3, 10 + (var4 + -1), 0, 0);
                                  mi.field_B.c(var14, var3 - -(var5 / 2), var4 + 10, 16711680, 0);
                                  break L47;
                                }
                              }
                            }
                          }
                        }
                        if (le.field_d[lm.field_f[var12]] + -(bk.field_J.n((byte) -75) / bk.field_J.s(0)) > 0) {
                          var22 = Integer.toString(le.field_d[lm.field_f[var12]] + -(bk.field_J.n((byte) -75) / bk.field_J.s(0)));
                          mi.field_B.c(var22, -1 + var3 + var5 / 2, 10 + var4, 0, 0);
                          mi.field_B.c(var22, var5 / 2 + var3, -1 + var4 + 10, 0, 0);
                          mi.field_B.c(var22, var5 / 2 + var3, 10 + var4, 16711680, 0);
                          break L47;
                        } else {
                          L54: {
                            L55: {
                              var14 = "X";
                              if (lm.field_f[var12] == 87) {
                                break L55;
                              } else {
                                if (116 != lm.field_f[var12]) {
                                  break L54;
                                } else {
                                  break L55;
                                }
                              }
                            }
                            var14 = Integer.toString(var13);
                            break L54;
                          }
                          mi.field_B.c(var14, -1 + var3 - -(var5 / 2), 10 + var4, 0, 0);
                          mi.field_B.c(var14, var3 - -(var5 / 2), -1 + var4 + 10, 0, 0);
                          mi.field_B.c(var14, var3 + var5 / 2, 10 + var4, 16711680, 0);
                          break L47;
                        }
                      }
                    }
                    break L47;
                  }
                }
                L56: {
                  if (!param1) {
                    break L56;
                  } else {
                    if (an.field_g < var3 + -12) {
                      break L56;
                    } else {
                      if (var4 + -12 > me.field_I) {
                        break L56;
                      } else {
                        if (an.field_g >= var3 - -14) {
                          break L56;
                        } else {
                          if (var4 + 14 <= me.field_I) {
                            break L56;
                          } else {
                            mf.field_g = var12;
                            break L56;
                          }
                        }
                      }
                    }
                  }
                }
                var3 += 26;
                break L43;
              }
            }
            var12++;
            continue L6;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param0 > -99) {
            return;
        }
        super.a(-114, param1, param2, param3);
        int var5 = -((ej) this).field_n + param1;
        int var6 = -((ej) this).field_j + param3;
        vl var7 = this.a(var5, (byte) 102, var6);
        if (var7 != null) {
            if (!(((ej) this).field_o == null)) {
                ((pj) (Object) ((ej) this).field_o).a(param2, (ej) this, -1607, var7.field_j);
            }
        }
    }

    void a(qm param0, int param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
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
              super.a(param0, param1, param2, param3);
              ((ej) this).field_K = null;
              if (!((ej) this).field_w) {
                break L1;
              } else {
                var5_int = -param1 + (an.field_g + -((ej) this).field_n);
                var6 = -((ej) this).field_j + me.field_I - param3;
                ((ej) this).field_K = this.a(var5_int, (byte) 102, var6);
                break L1;
              }
            }
            L2: {
              if (param2 == 170) {
                break L2;
              } else {
                field_Q = null;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("ej.E(");
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
          throw aa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = "Now the Fire Ball spell is selected, you will see an aiming arc in front of your Arcanist. This arc will fill up as you hold down the mouse button, which sets the spell's initial velocity. Try shooting the target in front of you.";
        field_R = new am();
        field_N = "MOST MINIONS - ";
        field_H = "Played";
        field_M = "Book of Overlight";
        field_L = "Kick";
        field_P = "Click to buy this spell for 3 wands.";
    }
}
