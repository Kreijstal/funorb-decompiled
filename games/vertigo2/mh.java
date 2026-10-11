/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mh {
    static boolean field_a;
    static int[] field_c;
    static String field_b;
    static dd field_d;

    final static void a(boolean param0, byte param1, int param2) {
        int var3;
        String var4;
        Object var5;
        String var6;
        CharSequence var7;
        if (null == rc.field_d) {
          if (param1 <= -52) {
            return;
          }
          field_c = (int[]) null;
          return;
        }
        var3 = rc.field_d.c(param0, 104);
        if (var3 != 0) {
          if (var3 == 2 &&
            rc.field_d.field_S != null &&
            !rc.field_d.field_S.equals("")) {
            if (rc.field_d.field_S.charAt(0) != 91) {
              var7 = (CharSequence) ((Object) rc.field_d.field_S);
              var4 = rc.a(var7, 320);
            } else {
              var4 = rc.field_d.field_S;
            }
            var5 = null;
            if (hk.field_n == 0) {
              var5 = ia.a(-113, param2, var4);
            }
            if (hk.field_n == 1) {
              var5 = lk.a((byte) 96, param2, var4);
            }
            if (2 == hk.field_n) {
              var5 = br.a(var4, param2, 100);
            }
            if (hk.field_n == 3) {
              var5 = en.a(var4, (byte) -108, var4, param2);
            }
            if (var5 == null) {
              rc.field_d = null;
              hk.field_n = -1;
              if (param1 <= -52) {
                return;
              }
              field_c = (int[]) null;
              return;
            }
            var6 = (String) null;
            dh.a((byte) -59, (String) (var5), 2, (String) null, 0, var4);
          }
          rc.field_d = null;
          hk.field_n = -1;
        }
        if (param1 <= -52) {
          return;
        }
        field_c = (int[]) null;
        return;
    }

    public static void a(int param0) {
        field_c = null;
        field_d = null;
        field_b = null;
        if (param0 != -1) {
          field_d = (dd) null;
        }
    }

    final static void a(boolean param0, boolean param1) {
        if (param1) {
          field_c = (int[]) null;
          ch.field_e.a(0, 86, 0);
          return;
        }
        ch.field_e.a(0, 86, 0);
    }

    final static void a(boolean param0, er[][] param1, byte[] param2, int param3, r param4, r param5, boolean param6, int[] param7, String[] param8, String[][] param9, er[][] param10, int param11, String[][] param12, byte[] param13, r param14) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        int[] var16 = null;
        u[] var17 = null;
        try {
          var17 = (u[]) null;
          var16 = (int[]) null;
          wn.a(param8, param13, param7, param9, (u[]) null, param5, param4, (byte) -42, param10, param12, param14, param3, param2, param1, param11, (int[]) null, param6);
          if (!param0) {
            field_a = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_5_0 = var15;
          stackIn_5_1 = new StringBuilder().append("mh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param5 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param8 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',');
          if (param9 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param10 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param11).append(',');
          if (param12 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param13 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param14 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    static {
        field_b = "Email is valid";
    }
}
