/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qn extends fa {
    static fm field_l;
    static int field_k;
    static String field_m;
    static int field_p;
    static jk[] field_q;
    static String field_n;
    byte[] field_r;
    static int field_o;

    final static int e(int param0) {
        ck.field_j.b((byte) -2);
        if (param0 != 59) {
          qn.a(-63);
        }
        if (pm.field_h.a(false)) {
          return 0;
        }
        return ph.e(param0 + 25901);
    }

    public static void a(int param0) {
        field_n = null;
        field_m = null;
        if (param0 != -1) {
          qn.e(52);
        }
        field_q = null;
        field_l = null;
    }

    final static String a(java.applet.Applet param0, String param1, byte param2) {
        try {
          int var5 = 0;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          String stackIn_3_0 = null;
          String stackIn_9_0 = null;
          Object stackIn_14_0 = null;
          RuntimeException stackIn_17_0 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          StringBuilder stackIn_20_1 = null;
          String stackIn_21_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3_ref = null;
          RuntimeException var3_ref2 = null;
          var7 = Pixelate.field_H ? 1 : 0;
          try {
            try {
              var3 = (String) (cq.a("getcookies", (byte) -114, param0));
              var4 = dd.a(var3, (byte) -61, ';');
              if (param2 != -85) {
                stackIn_3_0 = (String) null;
                return stackIn_3_0;
              }
              for (var5 = 0; var5 < var4.length; var5++) {
                var6 = var4[var5].indexOf('=');
                if (0 <= var6 &&
                  var4[var5].substring(0, var6).trim().equals(param1)) {
                  stackIn_9_0 = var4[var5].substring(1 + var6).trim();
                  return stackIn_9_0;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = decompiledCaughtException;
            }
            stackIn_14_0 = null;
            return (String) (stackIn_14_0);
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_17_0 = var3_ref2;
            stackIn_17_1 = new StringBuilder().append("qn.A(");
            if (param0 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
            if (param1 == null) {
              stackIn_21_2 = "null";
            } else {
              stackIn_21_2 = "{...}";
            }
            throw aa.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    qn(byte[] param0) {
        try {
          this.field_r = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "qn.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(String param0, int param1, String[] param2, int param3, jl param4) {
        int var9 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        int var6Lifetime1;
        var13 = Pixelate.field_H ? 1 : 0;
        try {
          var5_int = param4.c(param0);
          if (var5_int <= param1 &&
            param0.indexOf("<br>") == -1) {
            param2[0] = param0;
            stackIn_5_0 = 1;
            return stackIn_5_0;
          }
          var6 = (param1 + (var5_int - 1)) / param1;
          param1 = var5_int / var6;
          var6Lifetime1 = 0;
          var7 = 0;
          var8 = param0.length();
          if (param3 >= -99) {
            qn.e(-2);
          }
          for (var9 = 0; var9 < var8; var9++) {
            var10 = param0.charAt(var9);
            if (var10 == 32 ||
              var10 == 45) {
              var11 = param0.substring(var7, var9 + 1).trim();
              var12 = param4.c(var11);
              if (param1 <= var12) {
                var7 = var9 + 1;
                incrementValue$1 = var6Lifetime1;
                var6Lifetime1++;
                param2[incrementValue$1] = var11;
              }
            }
            if (62 == var10 &&
              param0.regionMatches(var9 - 3, "<br>", 0, 4)) {
              incrementValue$2 = var6Lifetime1;
              var6Lifetime1++;
              param2[incrementValue$2] = param0.substring(var7, -3 + var9).trim();
              var7 = var9 + 1;
            }
          }
          if (var8 > var7) {
            incrementValue$0 = var6Lifetime1;
            var6Lifetime1++;
            param2[incrementValue$0] = param0.substring(var7, var8).trim();
          }
          stackIn_29_0 = var6Lifetime1;
          return stackIn_29_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_32_0 = var5;
          stackIn_32_1 = new StringBuilder().append("qn.B(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(')').toString());
        }
    }

    static {
        field_m = "Name";
        field_p = 0;
        field_n = "Invalid name";
    }
}
