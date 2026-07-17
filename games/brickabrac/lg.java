/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lg extends d {
    private String[] field_K;
    private vl field_O;
    private gg field_N;
    static int field_L;
    static String field_M;

    final void i(int param0) {
        int var2 = 0;
        qe var3 = null;
        ep var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        ml var12 = null;
        int var13 = 0;
        int var14 = 0;
        gg var15 = null;
        int var16 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var16 = BrickABrac.field_J ? 1 : 0;
          ((lg) this).field_O = new vl();
          var2 = 0;
          var3 = (qe) (Object) ((lg) this).field_l;
          if (param0 == -1) {
            break L0;
          } else {
            ((lg) this).a(-10, (byte) -28, 79, -11);
            break L0;
          }
        }
        var4 = var3.c((oc) this, -7);
        L1: while (true) {
          var5 = ((lg) this).field_A.indexOf("<hotspot=", var2);
          if (var5 != -1) {
            var7 = ((lg) this).field_A.indexOf(">", var5);
            var6 = ((lg) this).field_A.substring(var5 + 9, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((lg) this).field_A.indexOf("</hotspot>", var5);
            var8 = var4.a(var5, true);
            var9 = var4.a(var2, true);
            var10 = null;
            var11 = var8;
            L2: while (true) {
              if (var9 < var11) {
                continue L1;
              } else {
                L3: {
                  var12 = var4.field_c[var11];
                  if (var11 == var8) {
                    stackOut_9_0 = var4.a(var5, (byte) -53);
                    stackIn_10_0 = stackOut_9_0;
                    break L3;
                  } else {
                    stackOut_8_0 = var12.field_g[0];
                    stackIn_10_0 = stackOut_8_0;
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_10_0;
                  if (var9 != var11) {
                    if (var12 != null) {
                      stackOut_14_0 = var12.field_g[var12.field_g.length + -1];
                      stackIn_15_0 = stackOut_14_0;
                      break L4;
                    } else {
                      stackOut_13_0 = 0;
                      stackIn_15_0 = stackOut_13_0;
                      break L4;
                    }
                  } else {
                    stackOut_11_0 = var4.a(var2, (byte) -79);
                    stackIn_15_0 = stackOut_11_0;
                    break L4;
                  }
                }
                L5: {
                  var14 = stackIn_15_0;
                  var15 = new gg(var7, var13, var12.field_d, -var13 + var14, Math.max(var3.a((byte) 71), -var12.field_d + var12.field_a));
                  if (var10 != null) {
                    ((gg) var10).field_k = var15;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                ((lg) this).field_O.a((nm) (Object) var15, (byte) 3);
                var10 = (Object) (Object) var15;
                var11++;
                continue L2;
              }
            }
          } else {
            return;
          }
        }
    }

    String d(int param0) {
        if (null == ((lg) this).field_N) {
            return null;
        }
        if (null == ((lg) this).field_K) {
            return null;
        }
        if (param0 <= 6) {
            ((lg) this).a(-25, -88, 90, 70);
        }
        if (((lg) this).field_N.field_u >= ((lg) this).field_K.length) {
            return null;
        }
        return ((lg) this).field_K[((lg) this).field_N.field_u];
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if (param1 != 46) {
            return;
        }
        ((lg) this).a(((qe) (Object) ((lg) this).field_l).a((oc) this, 46695), param0, param3, (byte) -119, param2);
    }

    boolean a(boolean param0, oc param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
            if (param0) {
              stackOut_2_0 = 0;
              stackIn_3_0 = stackOut_2_0;
              break L0;
            } else {
              field_L = 12;
              return false;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("lg.CA(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 41);
        }
        return stackIn_3_0 != 0;
    }

    private final gg b(int param0, int param1, int param2) {
        gg var4 = null;
        gg var5 = null;
        int var6 = 0;
        L0: {
          var6 = BrickABrac.field_J ? 1 : 0;
          if (param1 == 0) {
            break L0;
          } else {
            ((lg) this).a(3, -6, -76, (byte) 116, -98);
            break L0;
          }
        }
        var4 = (gg) (Object) ((lg) this).field_O.d(param1 + -75);
        L1: while (true) {
          if (var4 != null) {
            var5 = var4;
            L2: while (true) {
              if (var5 == null) {
                var4 = (gg) (Object) ((lg) this).field_O.a((byte) 116);
                continue L1;
              } else {
                L3: {
                  if (var5.field_j > param2) {
                    break L3;
                  } else {
                    if (var5.field_s > param0) {
                      break L3;
                    } else {
                      if (var5.field_j + var5.field_r <= param2) {
                        break L3;
                      } else {
                        if (param0 <= var5.field_s + var5.field_n) {
                          return var4;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_k;
                continue L2;
              }
            }
          } else {
            return null;
          }
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        ((lg) this).i(-1);
    }

    void a(oc param0, byte param1, int param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
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
              super.a(param0, param1, param2, param3);
              ((lg) this).field_N = null;
              if (((lg) this).field_q) {
                var5_int = -param2 + (pq.field_k - ((lg) this).field_o);
                var6 = -param3 + (po.field_a - ((lg) this).field_w);
                ((lg) this).field_N = this.b(var6, 0, var5_int);
                break L1;
              } else {
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5;
            stackOut_4_1 = new StringBuilder().append("lg.WA(");
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
          throw qb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public static void j(int param0) {
        field_M = null;
    }

    final static boolean a(int param0) {
        return ik.field_j;
    }

    final static jp a(int param0, String param1, int param2) {
        RuntimeException var3 = null;
        jp stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        jp stackOut_2_0 = null;
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
              if (param2 == -1) {
                break L1;
              } else {
                field_L = -26;
                break L1;
              }
            }
            stackOut_2_0 = fp.a(2, param0, param1, false);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("lg.C(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
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
          throw qb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param2 + 41);
        }
        return stackIn_3_0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, -106, param3);
        if (param2 >= -8) {
            Object var8 = null;
            jp discarded$0 = lg.a(-127, (String) null, 62);
        }
        int var5 = -((lg) this).field_o + param3;
        int var6 = -((lg) this).field_w + param0;
        gg var7 = this.b(var6, 0, var5);
        if (var7 != null) {
            if (!(((lg) this).field_i == null)) {
                ((ha) (Object) ((lg) this).field_i).a(param1, -526, var7.field_u, (lg) this);
            }
        }
    }

    final static void h(int param0) {
        ob.field_E.c((byte) -114);
        dl.field_f = 0;
    }

    final void a(String param0, int param1, byte param2) {
        String[] var4 = null;
        RuntimeException var4_ref = null;
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
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (((lg) this).field_K == null) {
                  break L2;
                } else {
                  if (((lg) this).field_K.length <= param1) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                var7 = new String[param1 - -1];
                var8 = var7;
                var4 = var8;
                if (null != ((lg) this).field_K) {
                  var5 = 0;
                  L4: while (true) {
                    if (var5 >= ((lg) this).field_K.length) {
                      break L3;
                    } else {
                      var7[var5] = ((lg) this).field_K[var5];
                      var5++;
                      continue L4;
                    }
                  }
                } else {
                  break L3;
                }
              }
              ((lg) this).field_K = var8;
              break L1;
            }
            L5: {
              ((lg) this).field_K[param1] = param0;
              if (param2 == -98) {
                break L5;
              } else {
                String discarded$2 = ((lg) this).d(-97);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4_ref;
            stackOut_13_1 = new StringBuilder().append("lg.E(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L6;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L6;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    void a(int param0, int param1, int param2, byte param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (!(param2 == 0)) {
            return;
        }
        qe var9 = (qe) (Object) ((lg) this).field_l;
        gg var6 = ((lg) this).field_N;
        if (var6 == null) {
        } else {
            var7 = var9.a((oc) this, (byte) 77, param1);
            var8 = var9.a(param0, (byte) -100, (oc) this);
            do {
                hj.a(-2 + (var8 + var6.field_s), var7 - (-var6.field_j + 2), param3 + 132, var6.field_n + 2, 2 + var6.field_r);
                var6 = var6.field_k;
            } while (var6 != null);
        }
    }

    lg(String param0, ub param1) {
        super(param0, (uh) null);
        ((lg) this).field_N = null;
        try {
            ((lg) this).field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw qb.a((Throwable) (Object) runtimeException, "lg.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "Show private chat from my friends and opponents";
    }
}
