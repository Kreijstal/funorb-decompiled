/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ml {
    boolean field_a;
    String field_e;
    boolean field_f;
    String[] field_d;
    static int[] field_c;
    static int field_h;
    int field_g;
    static int field_b;

    final static bh a(java.applet.Applet param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        bh[] var3 = null;
        int var4 = 0;
        bh var5 = null;
        int var6 = 0;
        bh stackIn_4_0 = null;
        bh stackIn_9_0 = null;
        bh stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = stellarshard.field_B;
        try {
          var2 = bi.a(param0, "jagex-last-login-method", 61);
          if (var2 == null) {
            stackIn_4_0 = ma.field_m;
            return stackIn_4_0;
          }
          var3 = jj.b(-1);
          var4 = 0;
          while (true) {
            if (var3.length <= var4) {
              if (param1 > -7) {
                ml.a((byte) 46);
              }
              stackIn_14_0 = ma.field_m;
              return stackIn_14_0;
            }
            var5 = var3[var4];
            if (!var5.a(-114, var2)) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_9_0 = var5;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_17_0 = var2_ref;
          stackIn_17_1 = new StringBuilder().append("ml.A(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 >= -92) {
          field_h = 125;
          field_c = null;
          return;
        }
        field_c = null;
    }

    final static pb[] a(String param0, byte param1, pf param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        pb[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2.b(param0, (byte) -118);
          var5 = 102 / ((31 - param1) / 48);
          var6 = param2.a(var4_int, param3, (byte) -11);
          stackIn_1_0 = wb.a(var6, var4_int, param2, 55);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("ml.C(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    ml(boolean param0) {
        this.field_f = param0 ? true : false;
    }

    static {
        int var0 = 0;
        field_c = new int[256];
        for (var0 = 0; 256 > var0; var0++) {
          field_c[var0] = 65536 * var0 + 257 * (var0 / 2);
        }
        field_b = 640;
    }
}
