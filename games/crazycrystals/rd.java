/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rd extends oh {
    static boolean field_h;
    static ko field_i;
    static un field_g;
    static int field_f;

    final int a(int param0, int param1) {
        if (param0 == 1843275042) {
          return q.field_a[ma.field_n[param1]].field_d;
        }
        String var4 = (String) null;
        rd.a(false, (String) null);
        return q.field_a[ma.field_n[param1]].field_d;
    }

    final static jp a(boolean param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        jp var7 = null;
        int var8 = 0;
        jp stackIn_3_0 = null;
        jp stackIn_8_0 = null;
        jp stackIn_12_0 = null;
        jp stackIn_17_0 = null;
        jp stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = CrazyCrystals.field_B;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_3_0 = ma.field_m;
            return stackIn_3_0;
          }
          if (!param0) {
            field_h = false;
          }
          if (var2_int > 255) {
            stackIn_8_0 = hk.field_d;
            return stackIn_8_0;
          }
          var3 = ik.a(param1, (byte) -76, '.');
          if (var3.length < 2) {
            stackIn_12_0 = ma.field_m;
            return stackIn_12_0;
          }
          var4 = var3;
          var5 = 0;
          while (true) {
            if (var4.length <= var5) {
              stackIn_20_0 = uk.a((byte) 46, var3[var3.length - 1]);
              return stackIn_20_0;
            }
            var6 = var4[var5];
            var7 = w.a((byte) -44, var6);
            if (var7 == null) {
              var5++;
              continue;
            }
            break;
          }
          stackIn_17_0 = var7;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("rd.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_i = null;
        if (!param0) {
          field_f = -104;
          field_g = null;
          return;
        }
        field_g = null;
    }

    final int a(byte param0, boolean param1) {
        if (param0 > -53) {
          return 1;
        }
        return 16;
    }

    rd() {
    }

    final static hm[] a(md param0, int param1) {
        int var5 = 0;
        hm[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        hm[] var4 = null;
        hm var6 = null;
        int var6_int = 0;
        int var7 = 0;
        var7 = CrazyCrystals.field_B;
        try {
          var2_int = param0.d((byte) -125, 8);
          if (0 < var2_int) {
            return null;
          }
          var3 = param0.d((byte) -62, 12);
          var4 = new hm[var3];
          for (var5 = 0; var3 > var5; var5++) {
            if (fn.a(1, param0)) {
              var6 = new hm();
              param0.d((byte) -56, 24);
              param0.d((byte) -103, 24);
              var6.field_b = param0.d((byte) -95, 24);
              param0.d((byte) -98, 9);
              param0.d((byte) -114, 12);
              param0.d((byte) -87, 12);
              param0.d((byte) -70, 12);
              var4[var5] = var6;
            } else {
              var6_int = param0.d((byte) -61, bd.a(-1 + var5, (byte) 62));
              var4[var5] = var4[var6_int];
            }
          }
          if (param1 > -80) {
            field_i = (ko) null;
          }
          stackIn_14_0 = var4;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("rd.K(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_h = false;
    }
}
