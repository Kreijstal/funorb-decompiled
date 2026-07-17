/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tb implements ci {
    private int field_f;
    static sg field_b;
    static int[] field_h;
    private int field_a;
    static String field_e;
    private int field_j;
    private ee field_g;
    static int field_d;
    private int field_i;
    static java.awt.Canvas field_c;
    private int field_l;
    private int field_k;

    public final void a(int param0, lk param1, int param2, int param3, boolean param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        h var12 = null;
        lk stackIn_4_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        lk stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var11 = Main.field_T;
        try {
          L0: {
            L1: {
              if (param1 instanceof h) {
                stackOut_3_0 = (lk) param1;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = null;
                stackIn_4_0 = (lk) (Object) stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var12 = (h) (Object) stackIn_4_0;
              if (var12 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            if (param2 == 11447) {
              vj.c(param0 + param1.field_o, param1.field_i + param3, param1.field_h, param1.field_q, ((tb) this).field_f);
              var7 = -(2 * var12.field_K) + param1.field_h;
              var8 = param1.field_o + (param0 - -var12.field_K);
              var9 = var12.field_J + param3 - -param1.field_i;
              vj.e(var8, var9, var8 + var7, var9, ((tb) this).field_l);
              var10 = var12.a(true) + -1;
              L3: while (true) {
                if (0 > var10) {
                  if (((tb) this).field_g == null) {
                    break L0;
                  } else {
                    ((tb) this).field_g.a(var12.field_r, var7 / 2 + var8, ((tb) this).field_g.field_E + var9 + var12.field_J, ((tb) this).field_k, ((tb) this).field_i);
                    return;
                  }
                } else {
                  vj.b(var8 - -(var12.a((byte) -63, var10) * var7 / var12.f((byte) -40)), var9, ((tb) this).field_j, ((tb) this).field_a);
                  var10--;
                  continue L3;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var6;
            stackOut_13_1 = new StringBuilder().append("tb.C(").append(param0).append(44);
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
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static void a(int param0, int param1) {
        qb var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        dh var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Main.field_T;
        try {
          L0: {
            var5 = (dh) (Object) vb.field_c.a((byte) 74);
            L1: while (true) {
              if (var5 == null) {
                var2 = ue.field_b.a((byte) 74);
                var3 = -27;
                L2: while (true) {
                  if (var2 == null) {
                    break L0;
                  } else {
                    fl.b(1, param0);
                    var2 = ue.field_b.b((byte) -104);
                    continue L2;
                  }
                }
              } else {
                ke.a(var5, param0, 21719);
                var5 = (dh) (Object) vb.field_c.b((byte) -104);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var2_ref, "tb.A(" + param0 + 44 + 78 + 41);
        }
    }

    final static ff a(String param0, String param1, byte param2, boolean param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        Object stackIn_2_0 = null;
        ff stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        ff stackOut_6_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            var4_long = 0L;
            if (param2 == -18) {
              L1: {
                var6 = null;
                if (param1.indexOf('@') == -1) {
                  var7 = (CharSequence) (Object) param1;
                  var4_long = fe.a(var7, 109);
                  break L1;
                } else {
                  var6 = (Object) (Object) param1;
                  break L1;
                }
              }
              stackOut_6_0 = nk.a(-116, false, var4_long, (String) var6, param0);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ff) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("tb.B(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
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
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param2 + 44 + 0 + 41);
        }
        return stackIn_7_0;
    }

    public static void a(int param0) {
        Object var2 = null;
        if (param0 != 128) {
          var2 = null;
          ff discarded$2 = tb.a((String) null, (String) null, (byte) -86, false);
          field_e = null;
          field_b = null;
          field_h = null;
          field_c = null;
          return;
        } else {
          field_e = null;
          field_b = null;
          field_h = null;
          field_c = null;
          return;
        }
    }

    tb(ee param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            ((tb) this).field_i = param2;
            ((tb) this).field_l = param3;
            ((tb) this).field_a = param6;
            ((tb) this).field_j = param5;
            ((tb) this).field_k = param1;
            ((tb) this).field_f = param4;
            ((tb) this).field_g = param0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "tb.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new sg();
        field_e = "Waiting for extra data";
        field_h = new int[128];
    }
}
