/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi extends java.awt.Canvas {
    static uf[] field_e;
    private java.awt.Component field_b;
    static ml field_d;
    static String field_c;
    static volatile boolean field_a;

    final static int a(int param0, byte param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        var4 = stellarshard.field_B;
        try {
          L0: {
            L1: {
              if (param1 == 109) {
                break L1;
              } else {
                hi.a((byte) -90);
                break L1;
              }
            }
            var3_int = 0;
            L2: while (true) {
              if (param0 <= 0) {
                stackOut_6_0 = var3_int;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                var3_int = var3_int << 1 | 1 & param2;
                param2 = param2 >>> 1;
                param0--;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) (Object) var3, "hi.A(" + param0 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_7_0;
    }

    public final void paint(java.awt.Graphics param0) {
        try {
            ((hi) this).field_b.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "hi.paint(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    hi(java.awt.Component param0) {
        try {
            ((hi) this).field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "hi.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 != -92) {
            hi.a((byte) 93);
        }
        field_c = null;
        field_d = null;
    }

    public final void update(java.awt.Graphics param0) {
        try {
            ((hi) this).field_b.update(param0);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) (Object) runtimeException, "hi.update(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    final static bk a(String param0, boolean param1) {
        RuntimeException var2 = null;
        bk stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        bk stackOut_3_0 = null;
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
              if (!al.field_f.a(param1)) {
                break L1;
              } else {
                if (param0.equals((Object) (Object) al.field_f.c(-112))) {
                  break L1;
                } else {
                  al.field_f = de.a(param0, -49);
                  break L1;
                }
              }
            }
            stackOut_3_0 = al.field_f;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("hi.B(");
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
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw ma.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    final static void b(byte param0) {
        vi.a(true);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_e = new uf[255];
        field_c = "Create your own free Jagex account";
        for (var0 = 0; var0 < field_e.length; var0++) {
            field_e[var0] = new uf();
        }
        field_a = false;
    }
}
