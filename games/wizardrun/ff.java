/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ff extends pl {
    private String[] field_I;
    static oj field_H;
    private oi field_G;
    private dd field_F;
    static int field_J;

    final void b(int param0, int param1, int param2, int param3) {
        super.b(-120, param1, param2, param3);
        int var5 = param1 - ((ff) this).field_o;
        int var6 = -((ff) this).field_l + param2;
        if (param0 > -45) {
            ((ff) this).a(-20, (byte) -111, 69, -112);
        }
        dd var7 = this.a((byte) -117, var6, var5);
        if (var7 != null) {
            if (!(null == ((ff) this).field_s)) {
                ((ng) (Object) ((ff) this).field_s).a(var7.field_k, (ff) this, param3, 111);
            }
        }
    }

    ff(String param0, bf param1) {
        super(param0, (ce) null);
        ((ff) this).field_F = null;
        try {
            ((ff) this).field_w = param1;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) (Object) runtimeException, "ff.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void d() {
        int var1 = 1;
        field_H = null;
    }

    String c(boolean param0) {
        if (((ff) this).field_F == null) {
            return null;
        }
        if (null == ((ff) this).field_I) {
            return null;
        }
        if (param0) {
            return null;
        }
        if (((ff) this).field_F.field_k >= ((ff) this).field_I.length) {
            return null;
        }
        return ((ff) this).field_I[((ff) this).field_F.field_k];
    }

    final static sc c() {
        sc var4 = new sc();
        var4.field_n = new int[1];
        var4.field_k = 0;
        tg.field_c.a((wl) (Object) var4, false);
        int discarded$0 = 0;
        ld.a(5, var4);
        return var4;
    }

    void a(int param0, int param1, int param2, ub param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              super.a(param0, param1, param2, param3);
              if (param0 == 10000536) {
                break L1;
              } else {
                ((ff) this).field_G = null;
                break L1;
              }
            }
            L2: {
              ((ff) this).field_F = null;
              if (((ff) this).field_v) {
                var5_int = pg.field_n - param2 + -((ff) this).field_o;
                var6 = -((ff) this).field_l + (fi.field_B + -param1);
                ((ff) this).field_F = this.a((byte) -120, var6, var5_int);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("ff.H(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        ((ff) this).a(127, param0, ((qe) (Object) ((ff) this).field_w).a((byte) 89, (ub) this), param2, param3);
        if (param1 != 61) {
            field_H = null;
        }
    }

    void a(int param0, int param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (param2 != 0) {
            return;
        }
        qe var5 = (qe) (Object) ((ff) this).field_w;
        dd var6 = ((ff) this).field_F;
        if (var6 != null) {
            var7 = var5.a((ub) this, param1, param0);
            var8 = var5.a(true, param3, (ub) this);
            do {
                nh.a((byte) 69, 2 + var6.field_o, var6.field_j + (var8 - 2), 2 + var6.field_n, var7 + (var6.field_i + -2));
                var6 = var6.field_l;
            } while (var6 != null);
        }
    }

    final static nj a(int param0, int param1, byte param2, int param3, int param4) {
        int var6 = wizardrun.field_H;
        nj var5 = (nj) (Object) pc.field_l.b((byte) 93);
        while (var5 != null) {
            if (!(param1 != var5.field_l)) {
                return var5;
            }
            var5 = (nj) (Object) pc.field_l.d(8192);
        }
        var5 = new nj();
        var5.field_j = param0;
        var5.field_l = param1;
        var5.field_o = param4;
        pc.field_l.a((wl) (Object) var5, false);
        int discarded$10 = 121;
        ri.a(var5, param3);
        if (param2 != 59) {
            nj discarded$11 = ff.a(88, 105, (byte) -48, -68, 37);
        }
        return var5;
    }

    final void e(int param0) {
        int var2 = 0;
        qe var3 = null;
        af var4 = null;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int var11 = 0;
        fg var12 = null;
        int var13 = 0;
        int var14 = 0;
        dd var15 = null;
        int var16 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        var16 = wizardrun.field_H;
        ((ff) this).field_G = new oi();
        var2 = param0;
        var3 = (qe) (Object) ((ff) this).field_w;
        var4 = var3.a((ub) this, (byte) 116);
        L0: while (true) {
          var5 = ((ff) this).field_k.indexOf("<hotspot=", var2);
          if (var5 == -1) {
            return;
          } else {
            var7 = ((ff) this).field_k.indexOf(">", var5);
            var6 = ((ff) this).field_k.substring(var5 + 9, var7);
            var7 = Integer.parseInt(var6);
            var2 = ((ff) this).field_k.indexOf("</hotspot>", var5);
            var8 = var4.a((byte) 110, var5);
            var9 = var4.a((byte) 89, var2);
            var10 = null;
            var11 = var8;
            L1: while (true) {
              if (var11 > var9) {
                continue L0;
              } else {
                L2: {
                  var12 = var4.field_d[var11];
                  if (var11 == var8) {
                    stackOut_6_0 = var4.a(62, var5);
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    stackOut_5_0 = var12.field_e[0];
                    stackIn_7_0 = stackOut_5_0;
                    break L2;
                  }
                }
                L3: {
                  var13 = stackIn_7_0;
                  if (var11 == var9) {
                    stackOut_11_0 = var4.a(62, var2);
                    stackIn_12_0 = stackOut_11_0;
                    break L3;
                  } else {
                    if (var12 != null) {
                      stackOut_10_0 = var12.field_e[-1 + var12.field_e.length];
                      stackIn_12_0 = stackOut_10_0;
                      break L3;
                    } else {
                      stackOut_9_0 = 0;
                      stackIn_12_0 = stackOut_9_0;
                      break L3;
                    }
                  }
                }
                L4: {
                  var14 = stackIn_12_0;
                  var15 = new dd(var7, var13, var12.field_a, var14 - var13, Math.max(var3.a((byte) -104), -var12.field_a + var12.field_b));
                  if (var10 != null) {
                    ((dd) var10).field_l = var15;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                var10 = (Object) (Object) var15;
                ((ff) this).field_G.a((wl) (Object) var15, false);
                var11++;
                continue L1;
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
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var6 = wizardrun.field_H;
        try {
          L0: {
            L1: {
              if (param0 == 1) {
                break L1;
              } else {
                ((ff) this).field_F = null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == ((ff) this).field_I) {
                  break L3;
                } else {
                  if (param2 < ((ff) this).field_I.length) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                var7 = new String[1 + param2];
                var8 = var7;
                var4 = var8;
                if (((ff) this).field_I != null) {
                  var5 = 0;
                  L5: while (true) {
                    if (((ff) this).field_I.length <= var5) {
                      break L4;
                    } else {
                      var7[var5] = ((ff) this).field_I[var5];
                      var5++;
                      continue L5;
                    }
                  }
                } else {
                  break L4;
                }
              }
              ((ff) this).field_I = var8;
              break L2;
            }
            ((ff) this).field_I[param2] = param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) runtimeException;
            stackOut_14_1 = new StringBuilder().append("ff.HA(").append(param0).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L6;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L6;
            }
          }
          throw bd.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ',' + param2 + ')');
        }
    }

    boolean a(ub param0, int param1) {
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
            if (param1 == 8) {
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
            stackOut_5_1 = new StringBuilder().append("ff.J(");
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
          throw bd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0 != 0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(126, param1, param2, param3, param4);
        if (param0 < 108) {
            return;
        }
        ((ff) this).e(0);
    }

    private final dd a(byte param0, int param1, int param2) {
        dd var4 = null;
        dd var5 = null;
        int var6 = 0;
        var6 = wizardrun.field_H;
        if (param0 <= -91) {
          var4 = (dd) (Object) ((ff) this).field_G.b((byte) 80);
          L0: while (true) {
            if (var4 != null) {
              var5 = var4;
              L1: while (true) {
                if (var5 == null) {
                  var4 = (dd) (Object) ((ff) this).field_G.d(8192);
                  continue L0;
                } else {
                  L2: {
                    if (var5.field_i > param2) {
                      break L2;
                    } else {
                      if (param1 < var5.field_j) {
                        break L2;
                      } else {
                        if (var5.field_i - -var5.field_o <= param2) {
                          break L2;
                        } else {
                          if (param1 <= var5.field_j - -var5.field_n) {
                            return var4;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  var5 = var5.field_l;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new oj();
    }
}
