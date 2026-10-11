/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bh extends nl {
    private java.nio.ByteBuffer field_d;

    final static void a(byte param0, int param1) {
        int var2_int = 0;
        cg var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          var2_int = -95 % ((25 - param0) / 50);
          var3 = (cg) (ca.field_n.a(true));
          while (var3 != null) {
            Lexicominos.a(-17800, var3, param1);
            var3 = (cg) (ca.field_n.f(2));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2), "bh.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        if (param0 != 0) {
          CharSequence var3 = (CharSequence) null;
          bh.a(true, (CharSequence) null, -76);
        }
        tg.a(param1, true, 114);
    }

    final void a(byte[] param0, boolean param1) {
        try {
          if (!param1) {
            this.field_d = (java.nio.ByteBuffer) null;
          }
          this.field_d = java.nio.ByteBuffer.allocateDirect(param0.length);
          this.field_d.position(0);
          this.field_d.put(param0);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "bh.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void b(byte param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = Lexicominos.field_L ? 1 : 0;
        try {
          nl.a(param1, 0, true, -123, rb.field_a, r.field_D, pf.field_o);
          if (param0 != 83) {
            return;
          }
          for (var2_int = 0; var2_int < pf.field_o; var2_int++) {
            ff.field_a[var2_int + param1] = var2_int;
          }
          nl.a(param1 + param1, param1, false, -93, l.field_G, ve.field_d, pf.field_o + param1);
          if (param1 < pf.field_o) {
            pf.field_o = param1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2), "bh.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static boolean a(boolean param0, CharSequence param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          if (param2 > -68) {
            return false;
          }
          if (!bb.a(param1, param0, -1)) {
            return false;
          }
          for (var3_int = 0; param1.length() > var3_int; var3_int++) {
            if (!ee.a(-125, param1.charAt(var3_int))) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("bh.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(')').toString());
        }
    }

    final byte[] a(byte param0) {
        byte[] var3 = new byte[this.field_d.capacity()];
        byte[] var2 = var3;
        if (param0 != -121) {
          return (byte[]) null;
        }
        this.field_d.position(0);
        this.field_d.get(var3);
        return var3;
    }

    bh() {
    }

    static {
    }
}
