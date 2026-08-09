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
              if ((param0 ^ -1) >= -1) {
                stackIn_7_0 = var3_int;
                break L0;
              } else {
                var3_int = var3_int << 62269921 | 1 & param2;
                param2 = param2 >>> 1;
                param0--;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3), "hi.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    public final void paint(java.awt.Graphics param0) {
        try {
            this.field_b.paint(param0);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "hi.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    hi(java.awt.Component param0) {
        try {
            this.field_b = param0;
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "hi.<init>(" + (param0 != null ? "{...}" : "null") + ')');
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
            this.field_b.update(param0);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "hi.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static bk a(String param0, boolean param1) {
        RuntimeException var2 = null;
        bk stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!al.field_f.a(param1)) {
                break L1;
              } else {
                if (param0.equals(al.field_f.c(-112))) {
                  break L1;
                } else {
                  al.field_f = de.a(param0, -49);
                  break L1;
                }
              }
            }
            stackIn_4_0 = al.field_f;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2);

            stackIn_7_1 = new StringBuilder().append("hi.B(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    final static void b(byte param0) {
        vi.a(true);
        if (param0 != 109) {
            String var2 = (String) null;
            hi.a((String) null, false);
        }
    }

    static {
        int var0 = 0;
        field_e = new uf[255];
        field_c = "Create your own free Jagex account";
        for (var0 = 0; var0 < field_e.length; var0++) {
            field_e[var0] = new uf();
        }
        field_a = false;
    }
}
