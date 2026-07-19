/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ol {
    static int field_g;
    static int field_i;
    static String field_a;
    ml field_d;
    static ec field_f;
    mi field_h;
    static String field_e;
    static String field_c;
    static String field_b;

    final static void a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            var1_int = kl.field_B[0];
            var2 = 1;
            L1: while (true) {
              if (var2 >= kl.field_B.length) {
                L2: {
                  if (param0 == 91) {
                    break L2;
                  } else {
                    field_f = (ec) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                var3 = kl.field_B[var2];
                sf.a(w.field_Lb, var2 << -1704635708, w.field_Lb, var1_int, var3);
                var1_int = var1_int + var3;
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "ol.A(" + param0 + ')');
        }
    }

    final static void a(int param0, int[] param1, boolean param2, int param3, int param4) {
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
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
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (!param2) {
                break L1;
              } else {
                ol.b(64);
                break L1;
              }
            }
            L2: while (true) {
              param4--;
              if (-1 < (param4 ^ -1)) {
                break L0;
              } else {
                var9 = param1;
                var5 = var9;
                var6 = param0;
                var7 = param3;
                var9[var6] = var7 + (dg.a(16711422, var9[var6]) >> -1642397951);
                param0++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var5_ref);
            stackOut_6_1 = new StringBuilder().append("ol.G(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void a(int param0) {
        this.field_d = null;
        this.field_h = null;
        if (param0 != 0) {
            int[] var3 = (int[]) null;
            ol.a(-9, (int[]) null, false, -58, 111);
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_f = null;
        field_c = null;
        field_a = null;
        if (param0 != -23971) {
            ol.a((byte) -20);
        }
        field_e = null;
    }

    final static uk a(int param0, int param1, boolean param2, dl param3, int param4, int param5) {
        java.awt.Component discarded$9 = null;
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        uk var7 = null;
        java.awt.Frame var8 = null;
        uk stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        uk stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            var8 = vh.a(param1, param3, param5, param4, 10, param0);
            var6 = var8;
            if (var8 != null) {
              L1: {
                var7 = new uk();
                var7.field_b = var8;
                discarded$9 = var7.field_b.add((java.awt.Component) ((Object) var7));
                var7.setBounds(0, 0, param5, param4);
                var7.addFocusListener(var7);
                var7.requestFocus();
                if (!param2) {
                  break L1;
                } else {
                  field_a = (String) null;
                  break L1;
                }
              }
              stackOut_5_0 = (uk) (var7);
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) (var6_ref);
            stackOut_7_1 = new StringBuilder().append("ol.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param3 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_6_0;
    }

    final void a(int param0, ml param1) {
        try {
            this.field_h = null;
            if (param0 > -79) {
                field_e = (String) null;
            }
            this.field_d = param1;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ol.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(mi param0, int param1) {
        try {
            if (param1 >= -122) {
                field_b = (String) null;
            }
            this.field_h = param0;
            this.field_d = null;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "ol.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_i = 0;
        field_a = "Multiplayer";
        field_c = "Hide private chat and appear offline to friends";
        field_e = "Only two targets left! Imps can also be increased in power with the Arcane<nbsp>Arrows and Arcane<nbsp>Flash spells. A powered-up Imp can be deadly in the hands of a master wizard.";
        field_b = "Spectate";
    }
}
