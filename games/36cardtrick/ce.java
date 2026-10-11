/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends java.awt.Canvas {
    static int field_b;
    private java.awt.Component field_a;

    public final void paint(java.awt.Graphics param0) {
        try {
          this.field_a.paint(param0);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ce.paint(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static kc a(int param0, String param1, String param2, qk param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object var6 = null;
        kc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -125) {
            var6 = (Object) null;
            ce.a(true, 19, (Object) null);
          }
          var4_int = param3.a(18659, param2);
          var5 = param3.a(var4_int, param1, (byte) 7);
          stackIn_3_0 = rh.a(var4_int, param3, var5, -30851);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ce.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        w var2 = null;
        cb var1 = (cb) (ha.field_d.a((byte) 74));
        w var2Lifetime1;
        if (param0 != 0) {
          qk var3 = (qk) null;
          ce.a(-22, (String) null, (String) null, (qk) null);
          if (var1 != null) {
            var2 = rd.field_j;
            var2.e((byte) 127);
            var2.e((byte) 124);
            var2.e((byte) 124);
            var2.e((byte) 126);
            var1.c(96);
            return;
          }
          mc.a((byte) -128);
          return;
        }
        if (var1 != null) {
          var2Lifetime1 = rd.field_j;
          var2Lifetime1.e((byte) 127);
          var2Lifetime1.e((byte) 124);
          var2Lifetime1.e((byte) 124);
          var2Lifetime1.e((byte) 126);
          var1.c(96);
          return;
        }
        mc.a((byte) -128);
    }

    public final void update(java.awt.Graphics param0) {
        try {
          this.field_a.update(param0);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ce.update(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(qb param0, int param1, qb param2) {
        try {
          if (param1 != 0) {
            field_b = 70;
          }
          if (null != param2.field_a) {
            param2.c(112);
          }
          param2.field_d = param0;
          param2.field_a = param0.field_a;
          param2.field_a.field_d = param2;
          param2.field_d.field_a = param2;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ce.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static byte[] a(boolean param0, int param1, Object param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        vf var4 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_10_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            field_b = -25;
          }
          if (param2 == null) {
            return null;
          }
          if (!(param2 instanceof byte[])) {
            if (!(param2 instanceof vf)) {
              throw new IllegalArgumentException();
            }
            var4 = (vf) (param2);
            stackIn_13_0 = var4.a((byte) 25);
            return stackIn_13_0;
          }
          var3 = (byte[]) (param2);
          if (param0) {
            stackIn_10_0 = bf.a(param1 ^ 0, var3);
            return stackIn_10_0;
          }
          stackIn_8_0 = var3;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("ce.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    ce(java.awt.Component param0) {
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ce.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = 0;
    }
}
