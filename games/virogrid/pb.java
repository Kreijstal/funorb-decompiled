/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pb extends l {
    static String field_m;
    int field_o;
    int field_j;
    static km field_p;
    static String field_k;
    static int[] field_i;
    pb field_q;
    static String field_l;
    static String field_n;
    int field_g;
    int field_r;
    int field_s;
    static int field_h;

    final static boolean a(int param0) {
        if (param0 != 4) {
          field_p = (km) null;
          if (null == kk.field_q) {
            return false;
          }
          if (kk.field_q.c(-1558)) {
            return true;
          }
          return false;
        }
        if (null == kk.field_q) {
          return false;
        }
        if (kk.field_q.c(-1558)) {
          return true;
        }
        return false;
    }

    final static void a(byte[] param0, eh param1, String[] param2, int param3, boolean param4, int param5, byte[] param6, rm[] param7, eh param8, int[] param9, String[][] param10, int[] param11, String[][] param12, boolean param13, eh param14, mg[][] param15, mg[][] param16) {
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
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        StringBuilder stackIn_41_1 = null;
        String stackIn_42_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var17 = null;
        String[] var18 = null;
        try {
          var18 = (String[]) null;
          nm.a(param6, param7, param9, param12, param0, param8, 1, (String[]) null, param10, param16, param4, param15, param5, param11, (byte) -94, param2, param1, param14, param3);
          if (param13) {
            pb.a((byte[]) null, (eh) null, (String[]) null, 25, false, 29, (byte[]) null, (rm[]) null, (eh) null, (int[]) null, (String[][]) null, (int[]) null, (String[][]) null, false, (eh) null, (mg[][]) null, (mg[][]) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var17 = decompiledCaughtException;
          stackIn_5_0 = var17;
          stackIn_5_1 = new StringBuilder().append("pb.B(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
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
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param11 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',');
          if (param12 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param13).append(',');
          if (param14 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          stackIn_38_1 = ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',');
          if (param15 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',');
          if (param16 == null) {
            stackIn_42_2 = "null";
          } else {
            stackIn_42_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(')').toString());
        }
    }

    pb(int param0, int param1, int param2, int param3, int param4) {
        this.field_j = param3;
        this.field_s = param4;
        this.field_r = param1;
        this.field_o = param0;
        this.field_g = param2;
    }

    public static void a(byte param0) {
        field_m = null;
        int var1 = -55 % ((-5 - param0) / 34);
        field_k = null;
        field_p = null;
        field_i = null;
        field_l = null;
        field_n = null;
    }

    static {
        field_k = "white";
        field_i = new int[4];
        field_h = -1;
        field_n = "Passwords must be between 5 and 20 letters and numbers";
        field_m = "Accept unrated rematch";
    }
}
