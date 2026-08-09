/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk extends t {
    static boolean field_g;
    private java.nio.ByteBuffer field_h;
    static fa field_i;
    static String field_j;
    static String field_k;

    final byte[] a(int param0) {
        int var2 = 82 / ((-69 - param0) / 36);
        byte[] var3 = new byte[this.field_h.capacity()];
        this.field_h.position(0);
        this.field_h.get(var3);
        return var3;
    }

    final static ja[] a(int param0, int param1, byte param2) {
        if (param2 != 28) {
            field_i = (fa) null;
            return h.a((byte) -112, param0, 1, param1);
        }
        return h.a((byte) -112, param0, 1, param1);
    }

    final void a(byte[] param0, byte param1) {
        try {
            this.field_h = java.nio.ByteBuffer.allocateDirect(param0.length);
            if (param1 > -68) {
                bk.a(112, 60, (byte) -105);
            }
            this.field_h.position(0);
            this.field_h.put(param0);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "bk.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        CharSequence var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2 = param0.getParameter("username");
            if (param1 == -17708) {
              L1: {
                if (var2 == null) {
                  break L1;
                } else {
                  var3 = (CharSequence) ((Object) var2);
                  if ((cq.a(param1 + 17708, var3) ^ -1L) != -1L) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var2_ref);

            stackIn_7_1 = new StringBuilder().append("bk.G(");

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
          throw fa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            return;
          }
        }
    }

    public static void c(int param0) {
        field_i = null;
        field_j = null;
        if (param0 != 4912) {
            field_i = (fa) null;
            field_k = null;
            return;
        }
        field_k = null;
    }

    bk() {
    }

    static {
        field_k = "Loading patches";
        field_j = "You can join this game";
    }
}
