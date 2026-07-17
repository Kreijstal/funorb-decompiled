/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve implements db {
    private int field_m;
    static int field_l;
    private wl field_e;
    static hh field_d;
    private int field_c;
    static String field_f;
    static mf field_h;
    private int field_j;
    private int field_a;
    private int field_b;
    static byte[][][] field_n;
    private int field_i;
    static int field_g;
    static int field_k;

    public final void a(int param0, int param1, int param2, hm param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        q var12 = null;
        hm stackIn_4_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        hm stackOut_2_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var11 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (!(param3 instanceof q)) {
                stackOut_3_0 = null;
                stackIn_4_0 = (hm) (Object) stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = (hm) param3;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var12 = (q) (Object) stackIn_4_0;
              if (var12 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            em.a(param3.field_k + param0, param1 + param3.field_j, param3.field_g, param3.field_x, ((ve) this).field_b);
            var7 = param3.field_g + -(2 * var12.field_M);
            var8 = param0 - (-param3.field_k + -var12.field_M);
            var9 = var12.field_J + (param1 + param3.field_j);
            em.d(var8, var9, var8 - -var7, var9, ((ve) this).field_m);
            var10 = -1 + var12.e((byte) 98);
            L3: while (true) {
              if (var10 < 0) {
                L4: {
                  if (param2 <= -14) {
                    break L4;
                  } else {
                    ((ve) this).field_j = -58;
                    break L4;
                  }
                }
                if (((ve) this).field_e == null) {
                  break L0;
                } else {
                  ((ve) this).field_e.c(var12.field_l, var8 - -(var7 / 2), var12.field_J + ((ve) this).field_e.field_y + var9, ((ve) this).field_i, ((ve) this).field_a);
                  return;
                }
              } else {
                em.d(var8 + var7 * var12.b(var10, (byte) 97) / var12.k(-1), var9, ((ve) this).field_j, ((ve) this).field_c);
                var10--;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("ve.M(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
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
          throw t.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param4 + 41);
        }
    }

    final static p a(int param0, mf param1, mf param2, int[] param3) {
        RuntimeException var4 = null;
        Object var5 = null;
        Object var6 = null;
        Object stackIn_3_0 = null;
        p stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
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
        Object stackOut_2_0 = null;
        p stackOut_8_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
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
        try {
          L0: {
            if (null == om.field_e) {
              kc.field_c = dn.a(0, vl.field_f, ej.field_g, param1, 1, param3, dn.field_C);
              var6 = null;
              rb.field_k = dn.a(0, ok.field_b, c.field_q, param2, 0, (int[]) null, q.field_L);
              tk.field_b = new qh(param1, bm.field_e, sb.field_i, 1, od.field_n, param3);
              om.field_e = new p();
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (p) (Object) stackIn_3_0;
            } else {
              L1: {
                if (param0 == 1) {
                  break L1;
                } else {
                  var5 = null;
                  ve.a((byte) 82, (String) null);
                  break L1;
                }
              }
              if (om.field_e.a(23389)) {
                stackOut_8_0 = om.field_e;
                stackIn_9_0 = stackOut_8_0;
                break L0;
              } else {
                return null;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("ve.D(").append(param0).append(44);
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
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          L3: {
            stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
            stackOut_14_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(44);
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param3 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw t.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
        }
        return stackIn_9_0;
    }

    final static void a(int param0, boolean param1, boolean param2) {
        Object var4 = null;
        ff.a((String) null, param2, 64, param1);
        int var3 = 104 / ((31 - param0) / 61);
    }

    final static mf a(int param0, int param1, boolean param2, int param3, boolean param4) {
        if (param1 != 0) {
            return null;
        }
        return ji.a(param2, param0, false, param3, param4, (byte) 114);
    }

    final static void a(byte param0, String param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int stackIn_17_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        String stackOut_43_2 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        var3 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (-1 != bg.field_f) {
                break L1;
              } else {
                if (oj.field_M != -1) {
                  break L1;
                } else {
                  oj.field_M = bj.field_y;
                  bg.field_f = dh.field_d;
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                ei.field_j = ei.field_j + 1;
                if (param1 != null) {
                  if (!param1.equals((Object) (Object) on.field_b)) {
                    break L3;
                  } else {
                    break L2;
                  }
                } else {
                  if (on.field_b != null) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (!un.field_u) {
                  if (ei.field_j >= ef.field_d) {
                    if (ei.field_j < ef.field_d + qf.field_l) {
                      stackOut_15_0 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      break L4;
                    } else {
                      stackOut_14_0 = 0;
                      stackIn_17_0 = stackOut_14_0;
                      break L4;
                    }
                  } else {
                    stackOut_12_0 = 0;
                    stackIn_17_0 = stackOut_12_0;
                    break L4;
                  }
                } else {
                  stackOut_10_0 = 0;
                  stackIn_17_0 = stackOut_10_0;
                  break L4;
                }
              }
              L5: {
                var2_int = stackIn_17_0;
                if (param1 == null) {
                  ei.field_j = 0;
                  break L5;
                } else {
                  if (un.field_u) {
                    ei.field_j = ef.field_d;
                    break L5;
                  } else {
                    if (var2_int == 0) {
                      ei.field_j = 0;
                      break L5;
                    } else {
                      ei.field_j = ef.field_d;
                      break L5;
                    }
                  }
                }
              }
              ni.field_O = bg.field_f;
              ci.field_g = oj.field_M;
              if (param1 != null) {
                un.field_u = false;
                break L2;
              } else {
                if (var2_int == 0) {
                  break L2;
                } else {
                  un.field_u = true;
                  break L2;
                }
              }
            }
            L6: {
              on.field_b = param1;
              if (un.field_u) {
                break L6;
              } else {
                if (ei.field_j >= ef.field_d) {
                  break L6;
                } else {
                  if (ah.field_h) {
                    ei.field_j = 0;
                    ci.field_g = oj.field_M;
                    ni.field_O = bg.field_f;
                    break L6;
                  } else {
                    break L6;
                  }
                }
              }
            }
            L7: {
              if (param0 <= -97) {
                break L7;
              } else {
                mf discarded$1 = ve.a(-81, 8, false, 82, false);
                break L7;
              }
            }
            L8: {
              if (!un.field_u) {
                break L8;
              } else {
                if (ei.field_j != fj.field_jb) {
                  break L8;
                } else {
                  un.field_u = false;
                  ei.field_j = 0;
                  break L8;
                }
              }
            }
            bg.field_f = -1;
            oj.field_M = -1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_41_0 = (RuntimeException) var2;
            stackOut_41_1 = new StringBuilder().append("ve.C(").append(param0).append(44);
            stackIn_43_0 = stackOut_41_0;
            stackIn_43_1 = stackOut_41_1;
            stackIn_42_0 = stackOut_41_0;
            stackIn_42_1 = stackOut_41_1;
            if (param1 == null) {
              stackOut_43_0 = (RuntimeException) (Object) stackIn_43_0;
              stackOut_43_1 = (StringBuilder) (Object) stackIn_43_1;
              stackOut_43_2 = "null";
              stackIn_44_0 = stackOut_43_0;
              stackIn_44_1 = stackOut_43_1;
              stackIn_44_2 = stackOut_43_2;
              break L9;
            } else {
              stackOut_42_0 = (RuntimeException) (Object) stackIn_42_0;
              stackOut_42_1 = (StringBuilder) (Object) stackIn_42_1;
              stackOut_42_2 = "{...}";
              stackIn_44_0 = stackOut_42_0;
              stackIn_44_1 = stackOut_42_1;
              stackIn_44_2 = stackOut_42_2;
              break L9;
            }
          }
          throw t.a((Throwable) (Object) stackIn_44_0, stackIn_44_2 + 41);
        }
    }

    public static void a(int param0) {
        field_n = null;
        field_f = null;
        field_h = null;
        field_d = null;
    }

    ve(wl param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            ((ve) this).field_j = param5;
            ((ve) this).field_e = param0;
            ((ve) this).field_i = param1;
            ((ve) this).field_c = param6;
            ((ve) this).field_b = param4;
            ((ve) this).field_a = param2;
            ((ve) this).field_m = param3;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "ve.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 0;
        field_f = "Try again";
    }
}
