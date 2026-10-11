/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qb {
    static int field_b;
    int field_d;
    int field_g;
    int field_a;
    static int field_i;
    int field_h;
    static String field_f;
    int field_j;
    static int[] field_c;
    int field_e;

    abstract void a(int param0, int param1, int param2);

    final static String a(int param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = ZombieDawn.field_J;
        try {
          var2_int = param1.length();
          if (var2_int > 20) {
            var2_int = 20;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          if (param0 > -106) {
            field_f = (String) null;
          }
          for (var4 = 0; var2_int > var4; var4++) {
            var5 = param1.charAt(var4);
            if (65 <= var5 &&
              90 >= var5) {
              var3[var4] = (char)(97 + (-65 + var5));
            } else if ((97 > var5 ||
              var5 > 122) &&
              (var5 < 48 ||
              var5 > 57)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          stackIn_21_0 = new String(var8);
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("qb.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    abstract void a(int param0, int param1);

    final static void a(boolean param0, int param1) {
        hn var2 = null;
        int var3 = 0;
        boolean stackIn_14_0 = false;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        hn var2Lifetime1;
        var3 = ZombieDawn.field_J;
        try {
          ge.field_c = param1;
          if (param0) {
            return;
          }
          var2 = (hn) (fj.field_i.b((byte) 26));
          while (var2 != null) {
            if (var2.field_k.a((byte) 73)) {
              var2.field_n.g(ge.field_c * var2.field_i + 128 >> 8);
            } else {
              var2.b(-27598);
            }
            var2 = (hn) (fj.field_i.a(false));
          }
          if (sf.field_n != null) {
            var2Lifetime1 = (hn) (sf.field_n.b((byte) 26));
            while (var2Lifetime1 != null) {
              stackIn_14_0 = var2Lifetime1.field_k.a((byte) 73);
              if (!stackIn_14_0) {
                var2Lifetime1.b(-27598);
              } else {
                var2Lifetime1.field_n.g(128 + ge.field_c * var2Lifetime1.field_i >> 8);
              }
              var2Lifetime1 = (hn) (sf.field_n.a(param0));
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var2_ref), "qb.E(" + param0 + ',' + param1 + ')');
        }
    }

    final static int a(int param0, byte param1) {
        if (param1 == 91) {
          return (1044493 & 15 * (param0 & 65280)) >> 4 | 16711935 & 15 * (param0 & 16711935) >> 4;
        }
        return 18;
    }

    public static void a(int param0) {
        field_c = null;
        if (param0 != -6633) {
          qb.a(62, (byte) -7);
          field_f = null;
          return;
        }
        field_f = null;
    }

    static {
        field_f = "We closed the connection because the game was left unattended for 20 minutes. Please feel free to reconnect immediately if you are there.";
        field_c = new int[8192];
    }
}
