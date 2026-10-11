/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dtb implements dja {
    static String field_a;

    public static void b(byte param0) {
        if (param0 != 124) {
          return;
        }
        field_a = null;
    }

    public final tv a(byte param0) {
        int var2 = 49 % ((-64 - param0) / 50);
        return (tv) ((Object) new bea());
    }

    final static fm[] a(eab param0, int param1) {
        int var5 = 0;
        fm[] stackIn_4_0 = null;
        fm[] stackIn_10_0 = null;
        fm[] stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        fm[] var4 = null;
        fm var6 = null;
        int var7 = 0;
        mob var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var7 = VoidHunters.field_G;
        try {
          if (!param0.a(0)) {
            stackIn_4_0 = new fm[]{};
            return stackIn_4_0;
          }
          var8 = param0.d(85);
          while (var8.field_f == 0) {
            gdb.b(127, 10L);
          }
          if (2 == var8.field_f) {
            stackIn_10_0 = new fm[]{};
            return stackIn_10_0;
          }
          if (param1 != -30334) {
            field_a = (String) null;
          }
          var10 = (int[]) (var8.field_d);
          var9 = var10;
          var3 = var9;
          var4 = new fm[var10.length >> 2];
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = new fm();
            var4[var5] = var6;
            var6.field_c = var3[var5 << 2];
            var6.field_a = var3[1 + (var5 << 2)];
            var6.field_e = var3[2 + (var5 << 2)];
            var6.field_d = var3[(var5 << 2) + 3];
          }
          stackIn_17_0 = var4;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_20_0 = var2;
          stackIn_20_1 = new StringBuilder().append("dtb.D(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
          CharSequence var4 = (CharSequence) null;
          dtb.a('￸', 101, (CharSequence) null);
        }
        return (tv[]) ((Object) new bea[param1]);
    }

    final static boolean a(char param0, int param1, CharSequence param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 18) {
            return true;
          }
          if (!qnb.a((byte) -35, param0)) {
            return false;
          }
          if (param2 == null) {
            return false;
          }
          var3_int = param2.length();
          if (12 <= var3_int) {
            return false;
          }
          if (fg.a(param0, 70) &&
            var3_int == 0) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_20_0 = var3;
          stackIn_20_1 = new StringBuilder().append("dtb.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        field_a = "Keep the tech in your spawn to deplete the enemy's score";
    }
}
