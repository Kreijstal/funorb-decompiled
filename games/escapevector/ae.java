/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ae implements db {
    static uk field_b;
    static lk field_a;
    static ed[] field_c;
    static java.security.SecureRandom field_d;
    static String[] field_e;

    final static int a(byte[] param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = EscapeVector.field_A;
        try {
          var4_int = -1;
          if (param1 > -37) {
            ae.a(45L, (byte) -21);
          }
          for (var5 = param3; var5 < param2; var5++) {
            var4_int = al.field_a[(param0[var5] ^ var4_int) & 255] ^ var4_int >>> 8;
          }
          var4_int = ~var4_int;
          stackIn_7_0 = var4_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ae.A(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(long param0, byte param1) {
        try {
          Throwable decompiledCaughtException = null;
          InterruptedException var3 = null;
          if (param1 != 118) {
            return;
          }
          try {
            Thread.sleep(param0);
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (InterruptedException) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int b(int param0) {
        af.field_e.a((byte) 12);
        if (param0 != -1021831775) {
          field_b = (uk) null;
        }
        if (!od.field_j.d(-3994)) {
          return un.f(param0 + 1021831755);
        }
        return 0;
    }

    final static te[] a(String param0, String param1, byte param2, mf param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        te[] stackIn_2_0 = null;
        te[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 >= -45) {
            stackIn_2_0 = (te[]) null;
            return stackIn_2_0;
          }
          var4_int = param3.b(-1, param0);
          var5 = param3.a(var4_int, param1, true);
          stackIn_4_0 = bl.a(var5, 255, param3, var4_int);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("ae.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_c = null;
        field_a = null;
        field_b = null;
        field_d = null;
        if (param0 != 1) {
          ae.a(-128);
        }
    }

    public final void a(int param0, int param1, int param2, hm param3, boolean param4) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        ed var8 = null;
        hm var9 = null;
        try {
          if (param2 > -14) {
            var9 = (hm) null;
            this.a(-95, 88, 12, (hm) null, false);
          }
          var6_int = param0 + param3.field_k;
          var7 = param1 + param3.field_j;
          mn.a(-27951, var6_int, var7, param3.field_g, param3.field_x);
          var8 = ul.field_E[1];
          if (param3 instanceof hc &&
            ((hc) (param3)).field_z) {
            var8.c((-var8.field_A + param3.field_g >> 1) + 1 + var6_int, var7 - (-1 - (param3.field_x - var8.field_z >> 1)), 256);
          }
          if (param3.h(0)) {
            ic.a(false, param3.field_g - 4, 2 + var6_int, -4 + param3.field_x, 2 + var7);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_10_0 = var6;
          stackIn_10_1 = new StringBuilder().append("ae.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param4).append(')').toString());
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    static {
        field_c = new ed[30];
        field_b = new uk();
        field_e = new String[]{"Congratulations on your success so far.<delay><br><br>We have just received intelligence on two types of alien defence.", "These blue cylinders will repel your ship.", "These green pods will shoot energy balls at any unidentified ship within range of their sensors."};
    }
}
