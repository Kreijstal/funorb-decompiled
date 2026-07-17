/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi extends gb implements n {
    static ci field_J;
    private eb[] field_K;
    private int[] field_L;
    private pk field_I;
    static java.awt.Color field_H;
    private int field_F;
    private String field_N;
    static String[] field_M;
    private si field_G;

    final void a(int param0, int param1, int param2, int param3) {
        Object var6 = null;
        super.a(param0, -126, param2, param3);
        if (param1 >= -106) {
          var6 = null;
          eb discarded$3 = ((oi) this).a((byte) 29, (sc) null, (String) null);
          int discarded$4 = ((oi) this).field_I.a(((oi) this).field_N, param0 - (-((oi) this).field_w - 14), 10 + (param3 - -((oi) this).field_u), -28 + ((oi) this).field_p, ((oi) this).field_n, 16777215, -1, 0, 0, ((oi) this).field_I.field_s);
          return;
        } else {
          int discarded$5 = ((oi) this).field_I.a(((oi) this).field_N, param0 - (-((oi) this).field_w - 14), 10 + (param3 - -((oi) this).field_u), -28 + ((oi) this).field_p, ((oi) this).field_n, 16777215, -1, 0, 0, ((oi) this).field_I.field_s);
          return;
        }
    }

    private final void b(int param0, int param1) {
        eb[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        eb[] var7 = null;
        var6 = Terraphoenix.field_V;
        if (param0 <= ((oi) this).field_F) {
          return;
        } else {
          var7 = new eb[param0];
          var3 = var7;
          var4 = new int[param0];
          var5 = 0;
          L0: while (true) {
            if (((oi) this).field_F <= var5) {
              ((oi) this).field_K = var3;
              ((oi) this).field_L = var4;
              ((oi) this).field_F = param0;
              return;
            } else {
              var7[var5] = ((oi) this).field_K[var5];
              var4[var5] = ((oi) this).field_L[var5];
              var5++;
              continue L0;
            }
          }
        }
    }

    oi(si param0, pk param1, String param2) {
        super(0, 0, 288, 0, (cj) null);
        int var4_int = 0;
        ((oi) this).field_F = 0;
        try {
            ((oi) this).field_N = param2;
            ((oi) this).field_G = param0;
            ((oi) this).field_I = param1;
            var4_int = null == ((oi) this).field_N ? 0 : ((oi) this).field_I.a(((oi) this).field_N, 260, ((oi) this).field_I.field_s);
            ((oi) this).a(0, (byte) 126, 288, 0, var4_int + 22);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "oi.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public static void f(byte param0) {
        field_H = null;
        int var1 = 38 / ((84 - param0) / 35);
        field_J = null;
        field_M = null;
    }

    public final void a(eb param0, int param1, int param2, int param3, int param4) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = Terraphoenix.field_V;
        try {
            for (var6_int = 0; ((oi) this).field_F > var6_int; var6_int++) {
                if (param0 == ((oi) this).field_K[var6_int]) {
                    var7 = ((oi) this).field_L[var6_int];
                    if (var7 == -1) {
                        ((oi) this).field_G.h((byte) -126);
                        break;
                    }
                    bm.a(((oi) this).field_L[var6_int], (byte) 1);
                    break;
                }
                var6_int++;
            }
            var6_int = -43 / ((param4 - -5) / 57);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "oi.I(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final void a(int param0, String param1, byte param2) {
        int var4_int = 0;
        try {
            int var5 = 53 / (param2 / 41);
            var4_int = ((oi) this).field_F;
            this.b(1 + var4_int, 20682);
            ((oi) this).field_K[var4_int] = ((oi) this).a((byte) 23, (sc) this, param1);
            ((oi) this).field_L[var4_int] = param0;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) (Object) runtimeException, "oi.G(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 41);
        }
    }

    final eb a(byte param0, sc param1, String param2) {
        eb var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        Object var6 = null;
        eb stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        eb stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
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
            L1: {
              if (param0 == 23) {
                break L1;
              } else {
                var6 = null;
                ((oi) this).a(-103, (String) null, (byte) -64);
                break L1;
              }
            }
            var4 = new eb(param2, param1);
            var4.field_l = (cj) (Object) new ic();
            var5 = -2 + ((oi) this).field_n;
            ((oi) this).a(0, (byte) 107, ((oi) this).field_p, 0, 34 + ((oi) this).field_n);
            var4.a(var5, (byte) 85, ((oi) this).field_p - 14, 7, 30);
            ((oi) this).b((byte) 95, (gl) (Object) var4);
            stackOut_2_0 = (eb) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("oi.D(").append(param0).append(44);
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
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_3_0;
    }

    final static void a(int param0, boolean param1) {
        if (param0 != -22417) {
            oi.f((byte) 108);
            jl.field_I.a((byte) -43, 0, 0);
            return;
        }
        jl.field_I.a((byte) -43, 0, 0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = new ci(128, 160);
        field_H = new java.awt.Color(10040319);
        field_M = new String[]{"Capture objective", "The alien with this icon is holding the data you need. Kill it at all costs.", "Once dead, the alien will drop the equipment on the floor. Send a soldier to pick it up by clicking on it's square.", "After the equipment is in your possession, get your whole remaining squad to the flashing areas of the map to complete your objective."};
    }
}
