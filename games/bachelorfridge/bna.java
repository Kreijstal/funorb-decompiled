/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bna extends ana {
    static kv field_v;
    static wba field_x;
    private lca field_A;
    static kv field_y;
    static sna field_z;
    static int field_w;

    final boolean c(byte param0) {
        int fieldTemp$0 = this.field_l - 1;
        this.field_l = this.field_l - 1;
        if (fieldTemp$0 < 0) {
          int var2 = -58 / ((71 - param0) / 47);
          this.f((byte) -85);
          return true;
        }
        if (this.field_l != 25) {
          return false;
        }
        this.e((byte) -86);
        return false;
    }

    public static void d(int param0) {
        field_z = null;
        field_v = null;
        field_x = null;
        int var1 = 11 % ((param0 - 66) / 32);
        field_y = null;
    }

    bna(gj param0, lca param1) {
        super(param0, param1);
        try {
          this.field_A = param1;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "bna.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static nea b(int param0, String param1) {
        String var2 = null;
        nea var3 = null;
        String var4 = null;
        int var5 = 0;
        String var6 = null;
        CharSequence var7 = null;
        CharSequence var8 = null;
        Object stackIn_7_0 = null;
        Object stackIn_10_0 = null;
        nea stackIn_19_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = BachelorFridge.field_y;
        try {
          if (null == wja.field_m) {
            return null;
          }
          if (param1 == null) {
            return null;
          }
          if (param1.length() == 0) {
            stackIn_7_0 = null;
            return (nea) (stackIn_7_0);
          }
          var7 = (CharSequence) ((Object) param1);
          var2 = fq.a(0, var7);
          if (var2 == null) {
            stackIn_10_0 = null;
            return (nea) (stackIn_10_0);
          }
          if (param0 > -19) {
            var6 = (String) null;
            bna.a((byte) -52, (String) null);
          }
          var3 = (nea) (wja.field_m.a((long)var2.hashCode(), (byte) -87));
          while (var3 != null) {
            var8 = (CharSequence) ((Object) var3.field_xb);
            var4 = fq.a(0, var8);
            if (var4.equals(var2)) {
              stackIn_19_0 = var3;
              return stackIn_19_0;
            }
            var3 = (nea) (wja.field_m.a((byte) -31));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_24_0 = var2_ref;
          stackIn_24_1 = new StringBuilder().append("bna.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    private final void e(byte param0) {
        if (param0 < -69) {
          dha.a(-108, this.field_A, this.field_q);
          return;
        }
        field_v = (kv) null;
        dha.a(-108, this.field_A, this.field_q);
    }

    private final void f(byte param0) {
        int var2 = -50 / ((13 - param0) / 40);
    }

    final static kv[] a(int param0, vr param1, int param2, int param3) {
        RuntimeException var4 = null;
        kv[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!g.a(param0, param3, -30744, param1)) {
            return null;
          }
          if (param2 >= -20) {
            field_x = (wba) null;
          }
          stackIn_6_0 = vma.c(22);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("bna.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        String var3 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 5) {
            var3 = (String) null;
            bna.b(65, (String) null);
          }
          stackIn_5_0 = (null != di.a(param1, -125));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("bna.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    static {
        field_x = new wba(2);
    }
}
