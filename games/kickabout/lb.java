/*
 * Decompiled by CFR-JS 0.4.0.
 */
class lb extends wi {
    static String[] field_K;
    private String[] field_J;
    static ut field_L;
    static String field_H;
    static String field_G;
    static String field_N;
    private tf field_E;
    static volatile int field_M;
    static boolean field_F;
    private er field_I;

    private final er b(int param0, int param1, int param2) {
        er var4 = null;
        er var5 = null;
        int var6 = 0;
        var6 = Kickabout.field_G;
        var4 = (er) (Object) ((lb) this).field_E.g(24009);
        L0: while (true) {
          if (var4 != null) {
            var5 = var4;
            L1: while (true) {
              if (var5 == null) {
                var4 = (er) (Object) ((lb) this).field_E.c(33);
                continue L0;
              } else {
                L2: {
                  if (param0 < var5.field_g) {
                    break L2;
                  } else {
                    if (param2 < var5.field_m) {
                      break L2;
                    } else {
                      if (var5.field_g - -var5.field_e <= param0) {
                        break L2;
                      } else {
                        if (var5.field_m + var5.field_f >= param2) {
                          return var4;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
                var5 = var5.field_j;
                continue L1;
              }
            }
          } else {
            return null;
          }
        }
    }

    final static boolean a(int param0, int param1) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          L1: {
            if (20 + param0 <= 0) {
              break L1;
            } else {
              if (param1 <= 0) {
                break L1;
              } else {
                if (param0 - 20 >= 640) {
                  break L1;
                } else {
                  if (480 <= -40 + param1) {
                    break L1;
                  } else {
                    stackOut_4_0 = 1;
                    stackIn_6_0 = stackOut_4_0;
                    break L0;
                  }
                }
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L0;
        }
        return stackIn_6_0 != 0;
    }

    final void b(int param0, int param1, int param2, int param3) {
        super.b(param0, param1, param2, param3);
        int var5 = -((lb) this).field_t + param1;
        int var6 = -((lb) this).field_g + param2;
        er var7 = this.b(var5, 2, var6);
        if (var7 != null) {
            if (null != ((lb) this).field_k) {
                ((qu) (Object) ((lb) this).field_k).a((lb) this, param0, var7.field_i, 40);
            }
        }
    }

    public static void i(int param0) {
        field_L = null;
        field_K = null;
        field_G = null;
        field_N = null;
        field_H = null;
        if (param0 != 9574) {
            field_M = 34;
        }
    }

    final static void a(byte param0, int param1) {
        ml var2 = or.field_d;
        var2.b(param1, (byte) -80);
        var2.a(116, 1);
        var2.a(119, 2);
    }

    final void c(int param0, int param1, int param2, int param3) {
        if (param0 != -1) {
            field_H = null;
        }
        ((lb) this).a(((ke) (Object) ((lb) this).field_r).b(param0 + 4, (fd) this), 1, param2, param1, param3);
    }

    lb(String param0, gj param1) {
        super(param0, (jv) null);
        ((lb) this).field_I = null;
        try {
            ((lb) this).field_r = param1;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "lb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, String param1) {
        int var2_int = 0;
        int discarded$5 = 15137;
        if (!(cq.e())) {
            return;
        }
        try {
            or.field_d.b(89, (byte) 77);
            or.field_d.field_n = or.field_d.field_n + 2;
            var2_int = or.field_d.field_n;
            or.field_d.a(14190, param1);
            or.field_d.d(or.field_d.field_n + -var2_int, 62);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "lb.C(" + -28153 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    String f(int param0) {
        if (null == ((lb) this).field_I) {
            return null;
        }
        if (null == ((lb) this).field_J) {
            return null;
        }
        if (param0 != -1) {
            ((lb) this).b(112, 119, -84, -8);
        }
        if (((lb) this).field_I.field_i >= ((lb) this).field_J.length) {
            return null;
        }
        return ((lb) this).field_J[((lb) this).field_I.field_i];
    }

    void a(byte param0, fd param1, int param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
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
              super.a(param0, param1, param2, param3);
              ((lb) this).field_I = null;
              if (!((lb) this).field_m) {
                break L1;
              } else {
                var5_int = -param2 + (el.field_A - ((lb) this).field_t);
                var6 = n.field_m - (param3 + ((lb) this).field_g);
                ((lb) this).field_I = this.b(var5_int, 2, var6);
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
            stackOut_3_1 = new StringBuilder().append("lb.P(").append(param0).append(',');
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
          throw nb.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static ak a(gm param0) {
        ak var2 = null;
        RuntimeException var2_ref = null;
        ak stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        ak stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2 = new ak(1);
            var2.field_m = param0;
            stackOut_0_0 = (ak) var2;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2_ref;
            stackOut_2_1 = new StringBuilder().append("lb.D(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ',' + 1 + ')');
        }
        return stackIn_1_0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        ((lb) this).a((byte) -41);
        if (param1 != 1) {
            field_H = null;
        }
    }

    final void a(String param0, int param1, int param2) {
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
        var6 = Kickabout.field_G;
        try {
          L0: {
            L1: {
              if (param2 == 12082) {
                break L1;
              } else {
                field_H = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (((lb) this).field_J == null) {
                  break L3;
                } else {
                  if (param1 >= ((lb) this).field_J.length) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                var7 = new String[1 + param1];
                var8 = var7;
                var4 = var8;
                if (null == ((lb) this).field_J) {
                  break L4;
                } else {
                  var5 = 0;
                  L5: while (true) {
                    if (var5 >= ((lb) this).field_J.length) {
                      break L4;
                    } else {
                      var7[var5] = ((lb) this).field_J[var5];
                      var5++;
                      continue L5;
                    }
                  }
                }
              }
              ((lb) this).field_J = var8;
              break L2;
            }
            ((lb) this).field_J[param1] = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) runtimeException;
            stackOut_13_1 = new StringBuilder().append("lb.K(");
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
          throw nb.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    boolean a(fd param0, int param1) {
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
            if (param1 == 0) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("lb.HA(");
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
          throw nb.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0 != 0;
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, (int) (char)param1, param2, param3);
        if (0 != param0) {
            return;
        }
        ke var5 = (ke) (Object) ((lb) this).field_r;
        er var6 = ((lb) this).field_I;
        if (var6 != null) {
            var7 = var5.a((fd) this, param2, -1);
            var8 = var5.a(true, (fd) this, param3);
            do {
                ob.b(param1 + -63, 2 + var6.field_e, var6.field_m + (var8 - 2), var6.field_f - -2, -2 + (var7 + var6.field_g));
                var6 = var6.field_j;
            } while (var6 != null);
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        ke var3 = null;
        iq var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        qj var12 = null;
        int var13 = 0;
        int var14 = 0;
        er var15 = null;
        int var16 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        L0: {
          var16 = Kickabout.field_G;
          ((lb) this).field_E = new tf();
          var2 = 0;
          var3 = (ke) (Object) ((lb) this).field_r;
          var4 = var3.a(param0 ^ -4996, (fd) this);
          if (param0 == -41) {
            break L0;
          } else {
            field_H = null;
            break L0;
          }
        }
        L1: while (true) {
          var5 = ((lb) this).field_q.indexOf("<hotspot=", var2);
          if (-1 != var5) {
            var7 = ((lb) this).field_q.indexOf(">", var5);
            var6 = ((lb) this).field_q.substring(9 + var5, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((lb) this).field_q.indexOf("</hotspot>", var5);
            var8 = var4.a(param0 + 41, var5);
            var9 = var4.a(0, var2);
            var10 = null;
            var11 = var8;
            L2: while (true) {
              if (var11 > var9) {
                continue L1;
              } else {
                L3: {
                  var12 = var4.field_c[var11];
                  if (var11 == var8) {
                    stackOut_8_0 = var4.b(0, var5);
                    stackIn_9_0 = stackOut_8_0;
                    break L3;
                  } else {
                    stackOut_7_0 = var12.field_b[0];
                    stackIn_9_0 = stackOut_7_0;
                    break L3;
                  }
                }
                L4: {
                  var13 = stackIn_9_0;
                  if (var11 == var9) {
                    stackOut_13_0 = var4.b(param0 + 41, var2);
                    stackIn_14_0 = stackOut_13_0;
                    break L4;
                  } else {
                    if (var12 != null) {
                      stackOut_12_0 = var12.field_b[-1 + var12.field_b.length];
                      stackIn_14_0 = stackOut_12_0;
                      break L4;
                    } else {
                      stackOut_11_0 = 0;
                      stackIn_14_0 = stackOut_11_0;
                      break L4;
                    }
                  }
                }
                L5: {
                  var14 = stackIn_14_0;
                  var15 = new er(var7, var13, var12.field_g, -var13 + var14, Math.max(var3.a((byte) -76), -var12.field_g + var12.field_d));
                  if (var10 != null) {
                    ((er) var10).field_j = var15;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                var10 = (Object) (Object) var15;
                ((lb) this).field_E.a((gn) (Object) var15, param0 + 44);
                var11++;
                continue L2;
              }
            }
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = new String[]{"Auto-Switch: Off", "Auto-Switch: On"};
        field_H = "Tips";
        field_N = "Names cannot contain consecutive spaces";
        field_M = 0;
        field_G = "Use this alternative as your account name";
    }
}
