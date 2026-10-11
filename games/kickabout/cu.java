/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cu {
    static tf field_a;
    static String[] field_f;
    static String field_g;
    static int field_c;
    static String field_b;
    static String[] field_d;
    static String[] field_e;

    final static cf a(boolean param0, int param1, int param2, int param3, boolean param4, boolean param5) {
        cf stackIn_6_0 = null;
        boolean stackIn_7_1 = false;
        cf stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        cf stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        cf stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        Object var6;
        cf var6_ref;
        iw var7;
        cf var6_refLifetime1;
        var6 = null;
        if (param1 == 0) {
          var6_ref = (cf) (field_a.b((byte) -32));
          if (var6_ref == null) {
            var6_ref = new cf();
          }
          var6_ref.field_Ab = param2;
          var6_ref.field_yb = param3;
          stackIn_6_0 = var6_ref;
          stackIn_7_1 = (!param0) ? false : true;
          stackIn_6_0.field_Fb = stackIn_7_1;
          stackIn_9_0 = var6_ref;
          stackIn_9_1 = new StringBuilder().append("");
          if (var6_ref.field_Fb) {
            stackIn_10_2 = "=";
          } else {
            stackIn_10_2 = Integer.toString(param3 + 1);
          }
          stackIn_9_0.field_Bb = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).toString();
          return var6_ref;
        }
        var7 = (iw) null;
        cu.a((byte) 95, (String) null, (iw) null);
        var6_refLifetime1 = (cf) (field_a.b((byte) -32));
        if (var6_refLifetime1 == null) {
          var6_refLifetime1 = new cf();
        }
        var6_refLifetime1.field_Ab = param2;
        var6_refLifetime1.field_yb = param3;
        stackIn_16_0 = var6_refLifetime1;
        stackIn_17_1 = (!param0) ? false : true;
        stackIn_16_0.field_Fb = stackIn_17_1;
        stackIn_19_0 = var6_refLifetime1;
        stackIn_19_1 = new StringBuilder().append("");
        if (var6_refLifetime1.field_Fb) {
          stackIn_20_2 = "=";
        } else {
          stackIn_20_2 = Integer.toString(param3 + 1);
        }
        stackIn_19_0.field_Bb = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).toString();
        return var6_refLifetime1;
    }

    final static boolean a(int param0, sj param1, int param2, int param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = param1.b(param2, -32669, param0);
          var4 = var5;
          if (param3 <= 95) {
            return true;
          }
          if (var5 == null) {
            return false;
          }
          vo.a((byte) -77, var5);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("cu.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 == 0) {
          field_a = null;
          field_f = null;
          field_e = null;
          field_b = null;
          field_d = null;
          field_g = null;
          return;
        }
        field_g = (String) null;
        field_a = null;
        field_f = null;
        field_e = null;
        field_b = null;
        field_d = null;
        field_g = null;
    }

    final static void a(byte param0, int param1, int param2) {
        hn var3 = new hn(3, new int[]{param1, param2});
        ii.a(var3, 106);
        if (25 == cq.field_h.field_c) {
          ((b) (cq.field_h)).h((byte) 84);
        }
        int var4 = -22 / ((param0 - 36) / 39);
    }

    final static int a(byte param0, String param1, iw param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        byte[] var4 = null;
        CharSequence var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 104) {
            field_a = (tf) null;
          }
          var3_int = param2.field_n;
          var5 = (CharSequence) ((Object) param1);
          var4 = ok.a(var5, (byte) 106);
          param2.f(-53, var4.length);
          param2.field_n = param2.field_n + os.field_I.a(-1, var4.length, param2.field_n, param2.field_f, var4, 0);
          stackIn_3_0 = param2.field_n - var3_int;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("cu.E(").append(param0).append(',');
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
          throw nb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_f = new String[]{"By rating", "By win percentage"};
        field_a = new tf();
        field_c = 0;
        field_b = "Waiting for animations";
        field_g = "kick";
        field_e = new String[]{"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
        field_d = new String[]{"Use the 'WASD' keys to move around.", "Use the arrow keys to move around."};
    }
}
