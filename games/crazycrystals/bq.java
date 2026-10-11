/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bq extends mg {
    private String field_k;
    static double[] field_i;
    private String field_j;

    final wh a(int param0) {
        if (param0 != 0) {
          this.field_j = (String) null;
          return of.field_C;
        }
        return of.field_C;
    }

    public static void a(boolean param0) {
        field_i = null;
        if (param0) {
          return;
        }
        field_i = (double[]) null;
    }

    bq(String param0, String param1) {
        try {
          this.field_j = param0;
          this.field_k = param1;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "bq.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(ng param0, byte param1) {
        try {
          if (param1 < 94) {
            bq.a((byte) -15);
          }
          param0.a(this.field_j, (byte) -105);
          param0.a(-16614, this.field_k);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "bq.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(java.awt.Canvas param0, int param1, int param2, int param3) {
        java.awt.Graphics var4 = null;
        Exception var4_ref = null;
        RuntimeException var4_ref2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          if (param3 != 4) {
            field_i = (double[]) null;
          }
          try {
            var4 = param0.getGraphics();
            dk.field_o.a(var4, param1, (byte) 126, param2);
            var4.dispose();
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var4_ref = (Exception) (Object) decompiledCaughtException;
            param0.repaint();
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_8_0 = var4_ref2;
          stackIn_8_1 = new StringBuilder().append("bq.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(byte param0) {
        int var2 = 0;
        ca var3 = null;
        RuntimeException decompiledCaughtException = null;
        we var1 = null;
        RuntimeException var1_ref = null;
        var2 = CrazyCrystals.field_B;
        try {
          if (lo.field_b != null) {
            ba.a(3, 43, lo.field_b);
          }
          while (true) {
            var3 = (ca) (so.field_h.c(0));
            if (var3 != null) {
              mb.a(var3, 4, 0);
              continue;
            }
            break;
          }
          while (true) {
            var1 = (we) (ec.field_l.c(0));
            if (var1 != null) {
              lj.a(5, var1, param0 ^ 120);
              continue;
            }
            break;
          }
          if (param0 == -12) {
            return;
          }
          field_i = (double[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var1_ref), "bq.F(" + param0 + ')');
        }
    }

    static {
    }
}
