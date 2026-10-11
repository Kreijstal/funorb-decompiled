/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la extends ej {
    static go field_g;
    static String[] field_f;
    static String field_h;
    private java.nio.ByteBuffer field_i;
    static e field_k;
    static int[] field_j;

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        fb var4 = null;
        jg var5 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = HoldTheLine.field_D;
        try {
          var4 = (fb) (bj.field_O.b((byte) 89));
          while (var4 != null) {
            dn.a(var4, param0, 111);
            var4 = (fb) (bj.field_O.c((byte) 87));
          }
          var5 = (jg) (pc.field_e.b((byte) 86));
          while (var5 != null) {
            gd.a(var5, (byte) 86, param0);
            var5 = (jg) (pc.field_e.c((byte) 90));
          }
          if (param1 == 0) {
            return;
          }
          la.a(41, -85);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2), "la.D(" + param0 + ',' + param1 + ')');
        }
    }

    public static void b(int param0) {
        field_j = null;
        field_f = null;
        if (param0 <= -52) {
          field_k = null;
          field_h = null;
          field_g = null;
          return;
        }
        field_h = (String) null;
        field_k = null;
        field_h = null;
        field_g = null;
    }

    la() {
    }

    final byte[] a(int param0) {
        byte[] var3 = new byte[this.field_i.capacity()];
        byte[] var2 = var3;
        this.field_i.position(0);
        if (param0 >= 14) {
          this.field_i.get(var3);
          return var3;
        }
        return (byte[]) null;
    }

    final void a(int param0, byte[] param1) {
        try {
          this.field_i = java.nio.ByteBuffer.allocateDirect(param1.length);
          this.field_i.position(0);
          this.field_i.put(param1);
          if (param0 <= 94) {
            field_f = (String[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "la.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = "1pt";
        field_k = new e(15, 0, 1, 0);
    }
}
