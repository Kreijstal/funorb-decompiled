/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie {
    static sd field_c;
    private int[] field_a;
    static java.awt.Canvas field_e;
    static String field_d;
    static le[] field_b;

    final static void a(int param0, int param1) {
        int var2 = -59 % ((param1 - 43) / 50);
        nf.a(param0, (byte) 115, 0, 0);
    }

    final static byte[] a(int param0, byte[] param1, int param2, int param3) {
        int var5_int = 0;
        byte[] var4 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        gi var5 = null;
        byte[] var6 = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          if (param3 > 0) {
            var8 = new byte[param2];
            var4 = var8;
            for (var5_int = 0; var5_int < param2; var5_int++) {
              var8[var5_int] = param1[param3 + var5_int];
            }
          } else {
            var4 = param1;
          }
          if (param0 >= -40) {
            ie.a(73, -111);
          }
          var5 = new gi();
          var5.a((byte) 0);
          var5.a((long)(param2 * 8), -102, var4);
          var6 = new byte[64];
          var5.a(0, (byte) -70, var6);
          stackIn_9_0 = var6;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_12_0 = var4_ref;
          stackIn_12_1 = new StringBuilder().append("ie.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final int a(boolean param0, int param1) {
        int var3;
        int var4;
        int var5;
        if (!param0) {
          field_b = (le[]) null;
        }
        var3 = -1 + (this.field_a.length >> 1);
        var4 = var3 & param1;
        while (true) {
          var5 = this.field_a[1 + (var4 + var4)];
          if (-1 == var5) {
            return -1;
          }
          if (param1 == this.field_a[var4 + var4]) {
            return var5;
          }
          var4 = var4 + 1 & var3;
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_d = null;
        field_b = null;
        if (param0 >= -82) {
          return;
        }
        field_c = null;
    }

    ie(int[] param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3Lifetime1;
        try {
          var2_int = 1;
          while (param0.length + (param0.length >> 1) >= var2_int) {
            var2_int = var2_int << 1;
          }
          this.field_a = new int[var2_int + var2_int];
          for (var3 = 0; var3 < var2_int + var2_int; var3++) {
            this.field_a[var3] = -1;
          }
          for (var3Lifetime1 = 0; param0.length > var3Lifetime1; var3Lifetime1++) {
            var4 = -1 + var2_int & param0[var3Lifetime1];
            while (this.field_a[1 + (var4 + var4)] != -1) {
              var4 = -1 + var2_int & var4 + 1;
            }
            this.field_a[var4 + var4] = param0[var3Lifetime1];
            this.field_a[1 + (var4 + var4)] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("ie.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_c = new sd();
        field_d = "ON";
    }
}
