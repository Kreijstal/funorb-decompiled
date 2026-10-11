/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends rf {
    static String field_D;
    byte field_G;
    dh field_H;
    static int[] field_E;
    int field_F;

    final static nb a(long param0, boolean param1, int param2, String param3, String param4) {
        RuntimeException var6 = null;
        ml stackIn_6_0 = null;
        mi stackIn_8_0 = null;
        nb stackIn_11_0 = null;
        hb stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (0L == param0 &&
            param4 != null) {
            stackIn_8_0 = new mi(param4, param3);
            return (nb) ((Object) stackIn_8_0);
          }
          if (param1) {
            stackIn_6_0 = new ml(param0, param3);
            return (nb) ((Object) stackIn_6_0);
          }
          if (param2 <= -49) {
            stackIn_13_0 = new hb(param0, param3);
            return (nb) ((Object) stackIn_13_0);
          }
          stackIn_11_0 = (nb) null;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("nh.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param4 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public static void d(int param0) {
        if (param0 == 30937) {
          field_D = null;
          field_E = null;
          return;
        }
        CharSequence var2 = (CharSequence) null;
        nh.a(-94, (CharSequence) null);
        field_D = null;
        field_E = null;
    }

    final static String a(int param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_24_0 = null;
        String stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = Terraphoenix.field_V;
        try {
          var2_int = param1.length();
          if (20 < var2_int) {
            var2_int = 20;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          for (var4 = 0; var2_int > var4; var4++) {
            var5 = param1.charAt(var4);
            if (var5 >= 65 &&
              90 >= var5) {
              var3[var4] = (char)(var5 + 32);
            } else if ((var5 < 97 ||
              var5 > 122) &&
              (48 > var5 ||
              var5 > 57)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          if (param0 == -31621) {
            stackIn_26_0 = new String(var8);
            return stackIn_26_0;
          }
          stackIn_24_0 = (String) null;
          return stackIn_24_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_29_0 = var2;
          stackIn_29_1 = new StringBuilder().append("nh.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final static boolean a(fa param0, fa param1, boolean param2, fa param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3.a(0) &&
            param3.a(-3, "commonui")) {
            if (!param0.a(0)) {
              return false;
            }
            if (!param0.a(-3, "commonui")) {
              return false;
            }
            if (param2) {
              return true;
            }
            if (param1.a(0) &&
              param1.a(-3, "button.gif")) {
              return true;
            }
            return false;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("nh.A(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final byte[] b(boolean param0) {
        if (!param0) {
          return (byte[]) null;
        }
        if (this.field_A) {
          throw new RuntimeException();
        }
        if (-this.field_G + this.field_H.field_i.length <= this.field_H.field_k) {
          return this.field_H.field_i;
        }
        throw new RuntimeException();
    }

    nh() {
    }

    final int c(int param0) {
        if (this.field_H == null) {
          return 0;
        }
        if (param0 == 0) {
          return 100 * this.field_H.field_k / (this.field_H.field_i.length - this.field_G);
        }
        return -30;
    }

    static {
        field_E = new int[]{1, 1, 1, 2, 1, 1, 1, 2, 1, 1, 1, 1, 3, 3, 3, 2, 3, 3, 3, 2, 2, 2, 2, 2, 1, 1, 1, 2, 1, 1, 1, 1, 1, 1, 1, 2, 3, 3, 3, 2, 3, 3, 3, 2, 2, 2, 2, 0, 2, 2, 2, 0, 2, 2, 2, 0, 2, 2, 2, 0, 2, 2, 2, 0, 2, 2, 2, 0, 1, 1, 1, 2, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0};
    }
}
