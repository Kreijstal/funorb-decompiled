/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ja extends bb {
    static int field_P;
    private String[] field_K;
    private vc field_N;
    static String field_L;
    static String field_O;
    private mi field_M;

    final void i(int param0) {
        int var2 = 0;
        eg var3 = null;
        ne var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        pi var12 = null;
        int var13 = 0;
        int var14 = 0;
        mi var15 = null;
        int var16 = 0;
        Object var17 = null;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var16 = fleas.field_A ? 1 : 0;
          ((ja) this).field_N = new vc();
          var2 = 0;
          if (param0 == 424) {
            break L0;
          } else {
            var17 = null;
            ((ja) this).a(-109, 29, (qa) null, (byte) 12);
            break L0;
          }
        }
        var3 = (eg) (Object) ((ja) this).field_p;
        var4 = var3.a((qa) this, (byte) -35);
        L1: while (true) {
          var5 = ((ja) this).field_i.indexOf("<hotspot=", var2);
          if (-1 == var5) {
            return;
          } else {
            var7 = ((ja) this).field_i.indexOf(">", var5);
            var6 = ((ja) this).field_i.substring(var5 - -9, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((ja) this).field_i.indexOf("</hotspot>", var5);
            var8 = var4.b(var5, -1);
            var9 = var4.b(var2, -1);
            var10 = null;
            var11 = var8;
            L2: while (true) {
              if (var9 < var11) {
                continue L1;
              } else {
                L3: {
                  var12 = var4.field_c[var11];
                  if (var8 == var11) {
                    stackOut_8_0 = var4.c(-1, var5);
                    stackIn_9_0 = stackOut_8_0;
                    break L3;
                  } else {
                    stackOut_7_0 = var12.field_d[0];
                    stackIn_9_0 = stackOut_7_0;
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_9_0;
                  if (var11 == var9) {
                    stackOut_13_0 = var4.c(-1, var2);
                    stackIn_14_0 = stackOut_13_0;
                    break L4;
                  } else {
                    if (var12 == null) {
                      stackOut_12_0 = 0;
                      stackIn_14_0 = stackOut_12_0;
                      break L4;
                    } else {
                      stackOut_11_0 = var12.field_d[var12.field_d.length - 1];
                      stackIn_14_0 = stackOut_11_0;
                      break L4;
                    }
                  }
                }
                L5: {
                  var14 = stackIn_14_0;
                  var15 = new mi(var7, var13, var12.field_a, -var13 + var14, Math.max(var3.a((byte) 127), -var12.field_a + var12.field_c));
                  if (var10 != null) {
                    ((mi) var10).field_q = var15;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var10 = (Object) (Object) var15;
                ((ja) this).field_N.a(false, (lh) (Object) var15);
                var11++;
                continue L2;
              }
            }
          }
        }
    }

    final void a(int param0, String param1, int param2) {
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
        var6 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 0) {
                break L1;
              } else {
                ((ja) this).b(55, 20, false, -78);
                break L1;
              }
            }
            L2: {
              L3: {
                if (((ja) this).field_K == null) {
                  break L3;
                } else {
                  if (param2 < ((ja) this).field_K.length) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                var7 = new String[param2 - -1];
                var8 = var7;
                var4 = var8;
                if (null == ((ja) this).field_K) {
                  break L4;
                } else {
                  var5 = 0;
                  L5: while (true) {
                    if (var5 >= ((ja) this).field_K.length) {
                      break L4;
                    } else {
                      var7[var5] = ((ja) this).field_K[var5];
                      var5++;
                      continue L5;
                    }
                  }
                }
              }
              ((ja) this).field_K = var8;
              break L2;
            }
            ((ja) this).field_K[param2] = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("ja.FA(").append(param0).append(44);
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
          throw pf.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param2 + 41);
        }
    }

    ja(String param0, ch param1) {
        super(param0, (kd) null);
        ((ja) this).field_M = null;
        try {
            ((ja) this).field_p = param1;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "ja.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    private final mi b(int param0, int param1, int param2) {
        mi var4 = null;
        mi var5 = null;
        int var6 = 0;
        var6 = fleas.field_A ? 1 : 0;
        var4 = (mi) (Object) ((ja) this).field_N.c((byte) 47);
        if (param2 == -1) {
          L0: while (true) {
            if (var4 != null) {
              var5 = var4;
              L1: while (true) {
                if (var5 == null) {
                  var4 = (mi) (Object) ((ja) this).field_N.b((byte) -105);
                  continue L0;
                } else {
                  L2: {
                    if (param0 < var5.field_i) {
                      break L2;
                    } else {
                      if (param1 < var5.field_j) {
                        break L2;
                      } else {
                        if (param0 >= var5.field_i - -var5.field_n) {
                          break L2;
                        } else {
                          if (var5.field_j + var5.field_l >= param1) {
                            return var4;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  var5 = var5.field_q;
                  continue L1;
                }
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    void a(int param0, int param1, qa param2, byte param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
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
              super.a(param0, param1, param2, (byte) -108);
              ((ja) this).field_M = null;
              if (param3 <= -85) {
                break L1;
              } else {
                ((ja) this).field_M = null;
                break L1;
              }
            }
            L2: {
              if (!((ja) this).field_x) {
                break L2;
              } else {
                var5_int = ag.field_f - (param1 - -((ja) this).field_y);
                var6 = -param0 + kc.field_b + -((ja) this).field_z;
                ((ja) this).field_M = this.b(var5_int, var6, -1);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) runtimeException;
            stackOut_5_1 = new StringBuilder().append("ja.I(").append(param0).append(44).append(param1).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
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
          throw pf.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param3 + 41);
        }
    }

    String g(int param0) {
        if (null == ((ja) this).field_M) {
            return null;
        }
        if (null == ((ja) this).field_K) {
            return null;
        }
        if (param0 != 4) {
            mi discarded$0 = this.b(-37, 104, -16);
        }
        if (((ja) this).field_M.field_m >= ((ja) this).field_K.length) {
            return null;
        }
        return ((ja) this).field_K[((ja) this).field_M.field_m];
    }

    final void b(int param0, int param1, int param2, int param3) {
        ((ja) this).a(param1, param0, param2, ((eg) (Object) ((ja) this).field_p).b(-69, (qa) this), 80);
        if (param3 != -9) {
            ((ja) this).field_K = null;
        }
    }

    public static void j() {
        field_O = null;
        field_L = null;
    }

    boolean a(qa param0, int param1) {
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
            L1: {
              if (param1 <= -26) {
                break L1;
              } else {
                ((ja) this).a(78, 122, -59, -72);
                break L1;
              }
            }
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ja.A(");
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
          throw pf.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        ((ja) this).i(424);
    }

    void b(int param0, int param1, boolean param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.b(param0, param1, param2, param3);
        if (!(param3 == 0)) {
            return;
        }
        eg var5 = (eg) (Object) ((ja) this).field_p;
        mi var6 = ((ja) this).field_M;
        if (var6 != null) {
            var7 = var5.a(false, param1, (qa) this);
            var8 = var5.a(param0, (qa) this, (byte) 84);
            do {
                ek.a(var6.field_l + 2, -2 + (var7 - -var6.field_i), var8 + var6.field_j - 2, 1, var6.field_n + 2);
                var6 = var6.field_q;
            } while (var6 != null);
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        int var5 = param2 - ((ja) this).field_y;
        int var6 = -((ja) this).field_z + param0;
        mi var7 = this.b(var5, var6, -1);
        if (var7 != null) {
            if (!(null == ((ja) this).field_s)) {
                ((dc) (Object) ((ja) this).field_s).a(var7.field_m, (ja) this, param3, param1 ^ 22);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_P = 0;
        field_O = "Close";
        field_L = "Please wait...";
    }
}
