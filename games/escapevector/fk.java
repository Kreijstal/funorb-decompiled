/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fk {
    static String field_c;
    static volatile int field_b;
    static ed[] field_f;
    int field_d;
    static String field_e;
    static mf field_a;

    public static void a(int param0) {
        field_c = null;
        field_e = null;
        int var1 = 22 % ((-65 - param0) / 36);
        field_f = null;
        field_a = null;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static byte[] a(Object param0, byte param1, boolean param2) {
        byte[] var3 = null;
        int var3_int = 0;
        RuntimeException var3_ref = null;
        fh var4 = null;
        byte[] stackIn_6_0 = null;
        byte[] stackIn_8_0 = null;
        byte[] stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          if (!(param0 instanceof byte[])) {
            if (!(param0 instanceof fh)) {
              var3_int = -100 % ((-31 - param1) / 55);
              throw new IllegalArgumentException();
            }
            var4 = (fh) (param0);
            stackIn_12_0 = var4.a(4);
            return stackIn_12_0;
          }
          var3 = (byte[]) (param0);
          if (!param2) {
            stackIn_8_0 = var3;
            return stackIn_8_0;
          }
          stackIn_6_0 = pn.a(0, var3);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("fk.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        qi.a(param1, param0, param4, param3, param5, -90, param6, param8, param7);
        qi.a(param1, -3 + param0, param4, -1, 3 + param5, 67, param6 + 3, -3 + param8, param7);
        if (param2 <= 52) {
          String var10 = (String) null;
          fk.a(104, (String) null);
        }
    }

    final static boolean a(boolean param0, CharSequence param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            field_a = (mf) null;
          }
          stackIn_3_0 = rl.a(10, (byte) 84, true, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("fk.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static tg a(int param0, String param1) {
        String var2 = null;
        tg var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        Object stackIn_12_0 = null;
        tg stackIn_19_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = EscapeVector.field_A;
        try {
          if (null == bm.field_b) {
            return null;
          }
          if (param1 == null) {
            return null;
          }
          if (0 == param1.length()) {
            stackIn_7_0 = null;
            return (tg) (stackIn_7_0);
          }
          if (param0 != -1465) {
            field_c = (String) null;
          }
          var6 = (CharSequence) ((Object) param1);
          var2 = sf.a(param0 ^ 1499, var6);
          if (var2 == null) {
            stackIn_12_0 = null;
            return (tg) (stackIn_12_0);
          }
          var3 = (tg) (bm.field_b.a(-76, (long)var2.hashCode()));
          while (var3 != null) {
            var7 = (CharSequence) ((Object) var3.field_ob);
            var4 = sf.a(-79, var7);
            if (var4.equals(var2)) {
              stackIn_19_0 = var3;
              return stackIn_19_0;
            }
            var3 = (tg) (bm.field_b.a((byte) -36));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_24_0 = var2_ref;
          stackIn_24_1 = new StringBuilder().append("fk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final static void b(int param0) {
        if (param0 != 0) {
          fk.a(115);
          if (bk.field_r != null) {
            bk.field_r.a((byte) -127);
          }
          return;
        }
        if (bk.field_r != null) {
          bk.field_r.a((byte) -127);
        }
    }

    fk(int param0) {
        this.field_d = param0;
    }

    static {
        field_b = 0;
        field_c = "If you have an account, log in to start at any level you've reached.";
        field_e = "If you are ever unsure what to do, press 'ESC' in-game<br>and select 'Instructions' to view your current objective.";
    }
}
