/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pha {
    private int field_e;
    static int field_g;
    static boolean field_a;
    private ou field_b;
    static kv[] field_f;
    private wha field_d;
    static int[][] field_h;
    private int field_c;

    pha(int param0) {
        this(param0, param0);
    }

    private final void a(int param0, ul param1) {
        RuntimeException var3 = null;
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
              if (param1 == null) {
                break L1;
              } else {
                param1.a(false);
                param1.b(param0 + 29063);
                ((pha) this).field_e = ((pha) this).field_e + param1.field_n;
                break L1;
              }
            }
            if (param0 == -29063) {
              break L0;
            } else {
              field_h = null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("pha.B(").append(param0).append(44);
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
          throw pe.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
    }

    final static java.awt.Canvas a(int param0) {
        int var1 = -20 % ((56 - param0) / 46);
        return kga.field_c != null ? (java.awt.Canvas) (Object) kga.field_c : dca.field_y;
    }

    private final void a(byte param0, long param1) {
        if (param0 != -76) {
            return;
        }
        ul var4 = (ul) (Object) ((pha) this).field_d.a(param1, (byte) -122);
        this.a(-29063, var4);
    }

    final void a(long param0, int param1, Object param2) {
        try {
            this.a(126, param1, param0, param2);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "pha.A(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final Object a(int param0, long param1) {
        int var4 = 0;
        ul var5 = null;
        Object var6 = null;
        oea var7 = null;
        var4 = 78 % ((30 - param0) / 60);
        var5 = (ul) (Object) ((pha) this).field_d.a(param1, (byte) -119);
        if (var5 != null) {
          var6 = var5.e(-19795);
          if (var6 == null) {
            var5.a(false);
            var5.b(0);
            ((pha) this).field_e = ((pha) this).field_e + var5.field_n;
            return null;
          } else {
            L0: {
              if (var5.f(125)) {
                var7 = new oea(var6, var5.field_n);
                ((pha) this).field_d.a(0, var5.field_c, (bw) (Object) var7);
                ((pha) this).field_b.a((eo) (Object) var7, (byte) -118);
                ((ul) (Object) var7).field_h = 0L;
                var5.a(false);
                var5.b(0);
                break L0;
              } else {
                ((pha) this).field_b.a((eo) (Object) var5, (byte) -118);
                var5.field_h = 0L;
                break L0;
              }
            }
            return var6;
          }
        } else {
          return null;
        }
    }

    private final void a(int param0, int param1, long param2, Object param3) {
        ul var7 = null;
        oea var7_ref = null;
        int var8 = BachelorFridge.field_y;
        try {
            if (!(((pha) this).field_c >= param1)) {
                throw new IllegalStateException();
            }
            this.a((byte) -76, param2);
            ((pha) this).field_e = ((pha) this).field_e - param1;
            int var6_int = 10 / ((-23 - param0) / 35);
            while (0 > ((pha) this).field_e) {
                var7 = (ul) (Object) ((pha) this).field_b.a(24383);
                this.a(-29063, var7);
            }
            var7_ref = new oea(param3, param1);
            ((pha) this).field_d.a(0, param2, (bw) (Object) var7_ref);
            ((pha) this).field_b.a((eo) (Object) var7_ref, (byte) -118);
            ((ul) (Object) var7_ref).field_h = 0L;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "pha.D(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        field_h = null;
    }

    private pha(int param0, int param1) {
        int var3 = 0;
        ((pha) this).field_b = new ou();
        ((pha) this).field_c = param0;
        ((pha) this).field_e = param0;
        var3 = 1;
        L0: while (true) {
          if (var3 + var3 < param0) {
            if (param1 > var3) {
              var3 = var3 + var3;
              continue L0;
            } else {
              ((pha) this).field_d = new wha(var3);
              return;
            }
          } else {
            ((pha) this).field_d = new wha(var3);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
    }
}
