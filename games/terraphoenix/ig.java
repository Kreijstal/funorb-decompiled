/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    static ci field_a;
    static String field_c;
    static String field_b;
    static tf field_e;
    static String field_d;

    final static dj[] a(int param0, uc param1) {
        int var5 = 0;
        int var2_int = 0;
        int var3 = 0;
        dj[] var4 = null;
        dj var6_ref_dj = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_3_0 = null;
        dj[] stackIn_6_0 = null;
        dj[] stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = Terraphoenix.field_V;
        try {
          var2_int = param1.a(false, 8);
          if (0 < var2_int) {
            stackIn_3_0 = null;
            return (dj[]) (stackIn_3_0);
          }
          var3 = param1.a(false, 12);
          var4 = new dj[var3];
          if (param0 != -25831) {
            stackIn_6_0 = (dj[]) null;
            return stackIn_6_0;
          }
          for (var5 = 0; var3 > var5; var5++) {
            if (!ma.a(param1, (byte) 98)) {
              var6 = param1.a(false, fb.b(2, var5 - 1));
              var4[var5] = var4[var6];
            } else {
              var6_ref_dj = new dj();
              param1.a(false, 24);
              param1.a(false, 24);
              var6_ref_dj.field_b = param1.a(false, 24);
              param1.a(false, 9);
              param1.a(false, 12);
              param1.a(false, 12);
              param1.a(false, 12);
              var4[var5] = var6_ref_dj;
            }
          }
          stackIn_15_0 = var4;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("ig.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static byte[] a(int param0, int param1, uc param2, byte[] param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        byte[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Terraphoenix.field_V;
        try {
          if (param1 <= 81) {
            stackIn_3_0 = (byte[]) null;
            return stackIn_3_0;
          }
          var4_int = param2.a(false, param0);
          if (var4_int == 0) {
            stackIn_6_0 = null;
            return (byte[]) (stackIn_6_0);
          }
          if (param3 == null ||
            param3.length != var4_int) {
            param3 = new byte[var4_int];
          }
          var5 = param2.a(false, 3);
          var6 = (byte)param2.a(false, 8);
          if (0 < var5) {
            for (var7 = 0; var4_int > var7; var7++) {
              param3[var7] = (byte)(var6 + param2.a(false, var5));
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param3[var7] = (byte)var6;
            }
          }
          stackIn_19_0 = (byte[]) (param3);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("ig.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        try {
          Throwable decompiledCaughtException = null;
          Throwable var2 = null;
          uc var3 = null;
          try {
            if (param1 != 12) {
              var3 = (uc) null;
              ig.a(47, (uc) null);
            }
            cd.a(dg.a(false), "resizing", new Object[]{new Integer(param0)}, 10056);
          } catch (java.lang.Throwable decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2 = decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static ci[] a(fa param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        uc var6 = null;
        ci[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            var6 = (uc) null;
            ig.a(-76, (uc) null);
          }
          var4_int = param0.c(-1, param3);
          var5 = param0.a(-104, var4_int, param2);
          stackIn_3_0 = pb.a(var4_int, false, var5, param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("ig.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 >= 98) {
          field_d = null;
          field_b = null;
          field_e = null;
          return;
        }
        field_d = (String) null;
        field_d = null;
        field_b = null;
        field_e = null;
    }

    static {
        field_c = "Allied Soldier";
        field_b = "Open in popup window";
        field_d = "Age:";
    }
}
