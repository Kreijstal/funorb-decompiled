/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ci {
    static int field_b;
    static String field_d;
    static String[] field_a;
    static String field_c;

    public static void c(int param0) {
        if (param0 == -1) {
          field_c = null;
          field_d = null;
          field_a = null;
          return;
        }
        field_c = (String) null;
        field_c = null;
        field_d = null;
        field_a = null;
    }

    final int a(long param0, int param1) {
        if (param1 != 1) {
          return 38;
        }
        long var4 = this.b(30393);
        if (var4 <= 0L) {
          return this.a(true, param0);
        }
        jj.a((byte) -114, var4);
        return this.a(true, param0);
    }

    abstract void a(byte param0);

    abstract int a(boolean param0, long param1);

    final static String a(String param0, char param1, String param2, int param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        StringBuilder discarded$5 = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String stackIn_7_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = stellarshard.field_B;
        try {
          var4_int = param0.length();
          var5 = param2.length();
          var6 = var4_int;
          var7 = var5 - 1;
          if (var7 != 0) {
            var8_int = 0;
            while (true) {
              var8_int = param0.indexOf((int) param1, var8_int);
              if (var8_int < 0) {
                break;
              }
              var6 = var6 + var7;
              var8_int++;
            }
          }
          var8 = new StringBuilder(var6);
          if (param3 != 2619) {
            stackIn_7_0 = (String) null;
            return stackIn_7_0;
          }
          var9 = 0;
          while (true) {
            var10 = param0.indexOf((int) param1, var9);
            if (var10 < 0) {
              discarded$3 = var8.append(param0.substring(var9));
              stackIn_12_0 = var8.toString();
              return stackIn_12_0;
            }
            discarded$4 = var8.append(param0.substring(var9, var10));
            var9 = 1 + var10;
            discarded$5 = var8.append(param2);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("ci.I(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0) {
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        String var5 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var4 = stellarshard.field_B;
        try {
          var1 = pk.field_e;
          synchronized (var1) {
            if (param0 <= 30) {
              var5 = (String) null;
              ci.a((String) null, 'ￛ', (String) null, -48);
            }
            ce.field_e = ce.field_e + 1;
            di.field_a = q.field_c;
            if (se.field_H < 0) {
              for (var2 = 0; var2 < 112; var2++) {
                si.field_jb[var2] = false;
              }
              se.field_H = vd.field_e;
            } else {
              while (se.field_H != vd.field_e) {
                var2 = ob.field_c[vd.field_e];
                vd.field_e = 1 + vd.field_e & 127;
                if (var2 < 0) {
                  si.field_jb[~var2] = false;
                  continue;
                }
                si.field_jb[var2] = true;
              }
            }
            q.field_c = l.field_h;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1_ref), "ci.J(" + param0 + ')');
        }
    }

    abstract long b(int param0);

    static {
        field_d = "Homes in";
        field_c = "Updates will sent to the email address you've given";
        field_a = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
    }
}
