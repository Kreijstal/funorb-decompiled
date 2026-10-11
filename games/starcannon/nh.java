/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    int field_g;
    private static int[] field_a;
    static int field_i;
    static int field_e;
    int[] field_d;
    int field_c;
    static volatile long field_b;
    static java.awt.Image field_h;
    static int field_f;

    final int a(byte param0) {
        int stackIn_7_0 = 0;
        if (param0 < 106) {
          return -51;
        }
        if (null != this.field_d &&
          this.field_d.length != 0) {
          stackIn_7_0 = this.field_d[this.field_d.length - 1];
        } else {
          stackIn_7_0 = 0;
        }
        return stackIn_7_0;
    }

    public static void a(boolean param0) {
        field_a = null;
        field_h = null;
        if (param0) {
          field_f = -39;
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              if (param1 != 337033697) {
                nh.a(false);
              }
              var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
              param0.getAppletContext().showDocument(wh.a(127, var2, param0), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("nh.C(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw sd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    nh(int param0, int param1, int param2) {
        this.field_c = param1;
        this.field_g = param0;
        this.field_d = new int[param2 + 1];
    }

    final int a(int param0, int param1) {
        int var3;
        int var4;
        var4 = StarCannon.field_A;
        if (null != this.field_d &&
          this.field_d.length != 0) {
          var3 = 1;
          if (param1 != -1) {
            return 19;
          }
          while (var3 < this.field_d.length) {
            if (param0 < this.field_d[-1 + var3] + this.field_d[var3] >> 1) {
              return var3 - 1;
            }
            var3++;
          }
          return this.field_d.length - 1;
        }
        return 0;
    }

    static {
        int var0 = 0;
        long var6 = 0L;
        long var4 = 0L;
        int var3 = 0;
        int var2 = 0;
        int var1 = 0;
        field_i = 100;
        field_e = 0;
        field_a = new int[98304];
        for (var0 = 92682; 46341 <= var0; var0--) {
          var6 = (long)((var0 << 1) + 1);
          var4 = (long)(-1 + (var0 << 1));
          var3 = (int)(-32768L + (var6 * var6 >> 18));
          var2 = (int)(-32768L + (var4 * var4 >> 18));
          if (!(field_a.length > var3)) {
            var3 = -1 + field_a.length;
          }
          for (var1 = var2 >= 0 ? var2 : 0; var3 >= var1; var1++) {
            field_a[var1] = var0;
          }
        }
        field_b = 0L;
    }
}
