/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck extends ud {
    static ko field_cb;
    static String[] field_fb;
    static String field_eb;
    static am field_db;

    public static void l(int param0) {
        if (param0 >= 14) {
          field_eb = null;
          field_fb = null;
          field_db = null;
          field_cb = null;
          return;
        }
        ck.l(-61);
        field_eb = null;
        field_fb = null;
        field_db = null;
        field_cb = null;
    }

    final void a(qm param0, byte param1) {
        try {
          super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "ck.CA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void n(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = CrazyCrystals.field_B;
        try {
          var5 = to.field_b;
          var1 = var5;
          if (param0 != 48) {
            return;
          }
          var2 = 0;
          var3 = var5.length;
          while (var2 < var3) {
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
            var5[var2++] = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var1_ref), "ck.T(" + param0 + ')');
        }
    }

    final static void m(int param0) {
        kf.field_f = null;
        co.field_F = false;
        cl.field_o = param0;
        rf.field_G = -1;
        ni.field_b = -1;
    }

    final static long a(byte param0, CharSequence param1) {
        int var5 = 0;
        long stackIn_20_0 = 0L;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        int var4 = 0;
        int var6 = 0;
        int var7 = 0;
        int var6Lifetime1;
        var7 = CrazyCrystals.field_B;
        try {
          var2_long = 0L;
          var4 = param1.length();
          for (var5 = 0; var4 > var5; var5++) {
            var2_long = var2_long * 37L;
            var6 = param1.charAt(var5);
            if (65 <= var6 &&
              90 >= var6) {
              var2_long = var2_long + (long)(var6 + 1 - 65);
            } else if (var6 >= 97 &&
              var6 <= 122) {
              var2_long = var2_long + (long)(1 + var6 - 97);
            } else {
              if (48 <= var6 &&
                var6 <= 57) {
                var2_long = var2_long + (long)(27 + var6 - 48);
              }
            }
            if (177917621779460413L > var2_long) {
              continue;
            }
            break;
          }
          var6Lifetime1 = -71 % ((param0 - 52) / 38);
          while (var2_long % 37L == 0L) {
            if (var2_long != 0L) {
              var2_long = var2_long / 37L;
              continue;
            }
            break;
          }
          stackIn_20_0 = var2_long;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("ck.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    ck(ol param0, qm param1) {
        super(param0, param1, 33, 20, 30);
    }

    static {
        field_eb = "Player";
        field_fb = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
    }
}
