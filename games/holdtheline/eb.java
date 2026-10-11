/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eb extends qm {
    boolean field_m;
    static String field_p;
    int field_l;
    static boolean[] field_j;
    static String[] field_n;
    static fb field_o;
    static String field_k;

    eb(eb param0) {
        super(param0.field_h, param0.field_f);
        try {
          this.field_m = false;
          this.field_l = param0.field_l;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "eb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static sd a(String param0, long param1, boolean param2, String param3, boolean param4) {
        RuntimeException var6 = null;
        sd stackIn_2_0 = null;
        fh stackIn_6_0 = null;
        bn stackIn_10_0 = null;
        pd stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param4) {
            stackIn_2_0 = (sd) null;
            return stackIn_2_0;
          }
          if (0L == param1 &&
            param0 != null) {
            stackIn_6_0 = new fh(param0, param3);
            return (sd) ((Object) stackIn_6_0);
          }
          if (param2) {
            stackIn_10_0 = new bn(param1, param3);
            return (sd) ((Object) stackIn_10_0);
          }
          stackIn_12_0 = new pd(param1, param3);
          return (sd) ((Object) stackIn_12_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("eb.H(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void b(int param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        da var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        String var4 = null;
        var3 = HoldTheLine.field_D;
        try {
          var1 = da.field_p;
          while (ad.a(100)) {
            var1.c((byte) 33, 8);
            fieldTemp$0 = var1.field_l + 1;
            var1.field_l = var1.field_l + 1;
            var2 = fieldTemp$0;
            dl.a(0, var1);
            da.field_p.a(-268435456, var1.field_l - var2);
          }
          if (param0 >= -67) {
            var4 = (String) null;
            eb.a((String) null, 111L, true, (String) null, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1_ref), "eb.G(" + param0 + ')');
        }
    }

    eb(qm param0, int param1) {
        super(param0.field_h, param0.field_f);
        try {
          this.field_l = param1;
          this.field_m = false;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "eb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void c(int param0) {
        field_o = null;
        field_k = null;
        field_n = null;
        field_j = null;
        if (param0 != 8) {
          return;
        }
        field_p = null;
    }

    final static void a(boolean param0, ah[] param1) {
        int var3 = 0;
        ah[] var2 = null;
        ah var4 = null;
        int var5 = 0;
        ah[] var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = HoldTheLine.field_D;
        try {
          var6 = param1;
          var2 = var6;
          if (param0) {
            return;
          }
          for (var3 = 0; var3 < var6.length; var3++) {
            var4 = var6[var3];
            ol.a(256, var4);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("eb.I(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_p = "Play Tutorial";
        field_n = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_j = new boolean[64];
        field_k = "Accept";
    }
}
