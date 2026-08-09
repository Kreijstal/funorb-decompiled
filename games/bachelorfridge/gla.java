/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gla extends nu {
    static kv field_j;
    private java.nio.ByteBuffer field_i;
    static boolean field_k;

    public static void a(byte param0) {
        field_j = null;
        if (param0 != -62) {
            lu var2 = (lu) null;
            gla.a((lu) null, (byte) -126);
        }
    }

    final static cj a(lu param0, byte param1) {
        RuntimeException var2 = null;
        vg stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == -19) {
                break L1;
              } else {
                field_j = (kv) null;
                break L1;
              }
            }
            stackIn_3_0 = new vg(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("gla.B(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return (cj) ((Object) stackIn_3_0);
    }

    final byte[] a(boolean param0) {
        byte[] var2;
        byte[] var3;
        var3 = new byte[this.field_i.capacity()];
        var2 = var3;
        if (param0) {
          this.field_i = (java.nio.ByteBuffer) null;
          this.field_i.position(0);
          this.field_i.get(var3);
          return var3;
        } else {
          this.field_i.position(0);
          this.field_i.get(var3);
          return var3;
        }
    }

    final static void a(int param0, int param1, int param2, kv[] param3) {
        try {
            if (param0 > -97) {
                lu var5 = (lu) null;
                gla.a((lu) null, (byte) 47);
            }
            it.field_s = new lda(param3);
            fh.field_v = param2;
            lda.field_a = param1;
            oba.d(-1488922239);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "gla.D(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    gla() {
    }

    final void a(byte param0, byte[] param1) {
        RuntimeException runtimeException = null;
        lu var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_i = java.nio.ByteBuffer.allocateDirect(param1.length);
              this.field_i.position(0);
              this.field_i.put(param1);
              if (param0 >= 14) {
                break L1;
              } else {
                var4 = (lu) null;
                gla.a((lu) null, (byte) 36);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("gla.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    static {
        field_k = true;
    }
}
