/*
 * Decompiled by CFR-JS 0.4.0.
 */
class rg extends ig {
    private String[] field_G;
    private oj field_H;
    static int field_F;
    private ja field_K;
    static ua field_J;
    static String field_I;

    String d(int param0) {
        if (((rg) this).field_K == null) {
            return null;
        }
        if (((rg) this).field_G == null) {
            return null;
        }
        if (param0 != 3690) {
            Object var3 = null;
            boolean discarded$0 = ((rg) this).a(86, (rj) null);
        }
        if (((rg) this).field_K.field_l >= ((rg) this).field_G.length) {
            return null;
        }
        return ((rg) this).field_G[((rg) this).field_K.field_l];
    }

    final void b(int param0, byte param1, int param2, int param3) {
        ((rg) this).b(param0, param2, param3, ((pj) (Object) ((rg) this).field_u).a((rj) this, 28361), 23987);
        if (param1 != -11) {
            Object var6 = null;
            boolean discarded$0 = rg.a((byte) -126, (CharSequence) null);
        }
    }

    private final ja b(int param0, int param1, int param2) {
        ja var5 = null;
        int var6 = stellarshard.field_B;
        ja var4 = (ja) (Object) ((rg) this).field_H.b(-127);
        while (var4 != null) {
            var5 = var4;
            while (var5 != null) {
                if (var5.field_s <= param0) {
                    if (var5.field_r <= param2) {
                        if (var5.field_n + var5.field_s > param0) {
                            if (!(param2 > var5.field_o + var5.field_r)) {
                                return var4;
                            }
                        }
                    }
                }
                var5 = var5.field_p;
            }
            var4 = (ja) (Object) ((rg) this).field_H.b((byte) -76);
        }
        if (param1 < -122) {
            return null;
        }
        return null;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (param3 < 39) {
            ((rg) this).a(125, (byte) -86, 89, 28);
        }
        super.a(param0, param1, param2, 84);
        int var5 = param1 - ((rg) this).field_w;
        int var6 = param0 - ((rg) this).field_k;
        ja var7 = this.b(var5, -124, var6);
        if (var7 != null) {
            if (((rg) this).field_v != null) {
                ((md) (Object) ((rg) this).field_v).a(var7.field_l, -2, (rg) this, param2);
            }
        }
    }

    final static boolean a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
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
            if (param0 == 19) {
              stackOut_3_0 = th.a(-123, true, 10, param1);
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
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("rg.M(").append(param0).append(',');
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
          throw ma.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ')');
        }
        return stackIn_4_0;
    }

    final static void g(int param0) {
        int var1_int = 0;
        int var2 = stellarshard.field_B;
        rb.field_u.a((byte) -115);
        try {
            for (var1_int = 0; 32 > var1_int; var1_int++) {
                vg.field_t[var1_int] = 0L;
            }
            for (var1_int = 0; var1_int < 32; var1_int++) {
                ce.field_c[var1_int] = 0L;
            }
            ol.field_c = 0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "rg.I(" + -33 + ')');
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
        var6 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              L2: {
                if (null == ((rg) this).field_G) {
                  break L2;
                } else {
                  if (param1 >= ((rg) this).field_G.length) {
                    break L2;
                  } else {
                    break L1;
                  }
                }
              }
              L3: {
                var7 = new String[1 + param1];
                var8 = var7;
                var4 = var8;
                if (((rg) this).field_G == null) {
                  break L3;
                } else {
                  var5 = 0;
                  L4: while (true) {
                    if (((rg) this).field_G.length <= var5) {
                      break L3;
                    } else {
                      var7[var5] = ((rg) this).field_G[var5];
                      var5++;
                      continue L4;
                    }
                  }
                }
              }
              ((rg) this).field_G = var8;
              break L1;
            }
            if (param2 == 1) {
              ((rg) this).field_G[param1] = param0;
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
            stackOut_13_1 = new StringBuilder().append("rg.K(");
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
          throw ma.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    boolean a(int param0, rj param1) {
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
              if (param0 == -2147483648) {
                break L1;
              } else {
                ((rg) this).b(-88, (byte) -84, -22, 108);
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
            stackOut_4_1 = new StringBuilder().append("rg.J(").append(param0).append(',');
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
          throw ma.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    rg(String param0, uk param1) {
        super(param0, (lf) null);
        ((rg) this).field_K = null;
        try {
            ((rg) this).field_u = param1;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "rg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1, int param2, int param3, int param4) {
        super.b(param0, param1, param2, param3, param4);
        ((rg) this).a((byte) 66);
    }

    void a(int param0, byte param1, int param2, int param3) {
        int var7 = 0;
        int var8 = 0;
        super.a(param0, param1, param2, param3);
        if (!(param0 == 0)) {
            return;
        }
        pj var9 = (pj) (Object) ((rg) this).field_u;
        ja var6 = ((rg) this).field_K;
        if (var6 == null) {
        } else {
            var7 = var9.a(param1 ^ -57, (rj) this, param3);
            var8 = var9.a((byte) -2, (rj) this, param2);
            do {
                og.a(-2 + var7 + var6.field_s, (byte) 105, var6.field_n - -2, 2 + var6.field_o, -2 + (var8 - -var6.field_r));
                var6 = var6.field_p;
            } while (var6 != null);
        }
    }

    final void a(byte param0) {
        int var2 = 0;
        pj var3 = null;
        vk var4 = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        Object var11 = null;
        int var12 = 0;
        uj var13 = null;
        int var14 = 0;
        int var15 = 0;
        ja var16 = null;
        int var17 = 0;
        int stackIn_7_0 = 0;
        int stackIn_12_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_8_0 = 0;
        var17 = stellarshard.field_B;
        ((rg) this).field_H = new oj();
        var2 = 0;
        var3 = (pj) (Object) ((rg) this).field_u;
        var5 = -101 / ((param0 - -30) / 33);
        var4 = var3.b((rj) this, (byte) 94);
        L0: while (true) {
          var6 = ((rg) this).field_m.indexOf("<hotspot=", var2);
          if (var6 == -1) {
            return;
          } else {
            var8 = ((rg) this).field_m.indexOf(">", var6);
            var7 = ((rg) this).field_m.substring(var6 + 9, var8);
            var8 = Integer.parseInt(var7);
            var2 = ((rg) this).field_m.indexOf("</hotspot>", var6);
            var9 = var4.a(48, var6);
            var10 = var4.a(113, var2);
            var11 = null;
            var12 = var9;
            L1: while (true) {
              if (var10 < var12) {
                continue L0;
              } else {
                L2: {
                  var13 = var4.field_a[var12];
                  if (var12 == var9) {
                    stackOut_6_0 = var4.b(var6, 26);
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    stackOut_5_0 = var13.field_a[0];
                    stackIn_7_0 = stackOut_5_0;
                    break L2;
                  }
                }
                L3: {
                  var14 = stackIn_7_0;
                  if (var10 != var12) {
                    if (var13 != null) {
                      stackOut_11_0 = var13.field_a[var13.field_a.length + -1];
                      stackIn_12_0 = stackOut_11_0;
                      break L3;
                    } else {
                      stackOut_10_0 = 0;
                      stackIn_12_0 = stackOut_10_0;
                      break L3;
                    }
                  } else {
                    stackOut_8_0 = var4.b(var2, -127);
                    stackIn_12_0 = stackOut_8_0;
                    break L3;
                  }
                }
                L4: {
                  var15 = stackIn_12_0;
                  var16 = new ja(var8, var14, var13.field_b, -var14 + var15, Math.max(var3.a((byte) -73), var13.field_c - var13.field_b));
                  if (var11 == null) {
                    break L4;
                  } else {
                    ((ja) var11).field_p = var16;
                    break L4;
                  }
                }
                var11 = (Object) (Object) var16;
                ((rg) this).field_H.b(-71, (gg) (Object) var16);
                var12++;
                continue L1;
              }
            }
          }
        }
    }

    public static void d(boolean param0) {
        field_J = null;
        field_I = null;
    }

    void a(int param0, boolean param1, int param2, rj param3) {
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
              ((rg) this).field_K = null;
              if (!((rg) this).field_q) {
                break L1;
              } else {
                var5_int = -((rg) this).field_w + -param2 + ni.field_e;
                var6 = -param0 + eb.field_a + -((rg) this).field_k;
                ((rg) this).field_K = this.b(var5_int, -127, var6);
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
            stackOut_3_1 = new StringBuilder().append("rg.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param3 == null) {
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
          throw ma.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        pi discarded$0 = new pi();
        field_J = new ua(0);
    }
}
