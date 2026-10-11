/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tf extends o {
    static int field_o;
    int field_n;
    static String field_k;
    static bn[] field_l;
    long field_m;
    byte[] field_j;

    final static String a(int param0, long param1) {
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        StringBuilder discarded$0 = null;
        int var11 = Chess.field_G;
        if (param1 <= 0L) {
          return null;
        }
        if (param1 >= 6582952005840035281L) {
          return null;
        }
        if (0L != param1 % (long)param0) {
          var3 = 0;
          var4 = param1;
          while (var4 != 0L) {
            var3++;
            var4 = var4 / 37L;
          }
          var6 = new StringBuilder(var3);
          while (param1 != 0L) {
            var7 = param1;
            param1 = param1 / 37L;
            var9 = sa.field_a[(int)(var7 - param1 * 37L)];
            if (95 == var9) {
              var10 = -1 + var6.length();
              var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
              var9 = 160;
            }
            discarded$0 = var6.append((char) var9);
          }
          var6.reverse();
          var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
          return var6.toString();
        }
        return null;
    }

    final static String a(int param0, CharSequence param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= -25) {
            tf.a(10, (byte) -9, -40);
          }
          stackIn_3_0 = cf.a(param1, -51, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("tf.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        int var1 = (-640 + vi.field_d) / 2;
        int var2 = ug.field_b * ug.field_b;
        int var3 = -(an.field_e * an.field_e) + var2;
        ql.field_d.a(-(var3 * 199 / var2) + var1, 199, -2147483648, -4 + (-120 + (wb.field_c - param0)), 90);
        rb.field_c.a(var3 * 438 / var2 + (var1 + 202), 438, -2147483648, -120 + wb.field_c - 4, 0);
    }

    final static km[] a(int param0, byte param1, int param2) {
        if (param1 != -46) {
          field_k = (String) null;
          return om.a(1, param0, param2, (byte) -87);
        }
        return om.a(1, param0, param2, (byte) -87);
    }

    public static void a(boolean param0) {
        field_k = null;
        if (param0) {
          return;
        }
        field_l = null;
    }

    tf(long param0, int param1, byte[] param2) {
        try {
          this.field_j = param2;
          this.field_m = param0;
          this.field_n = param1;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "tf.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = "Unable to add friend - system busy";
    }
}
