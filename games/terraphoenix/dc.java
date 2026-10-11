/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc {
    private String field_d;
    int field_l;
    int field_f;
    private static int[] field_c;
    String field_h;
    private long field_k;
    private int field_m;
    private boolean field_g;
    int field_j;
    int[] field_i;
    static int field_b;
    static int field_a;
    static rj field_n;
    static String[] field_e;

    public static void a(byte param0) {
        if (param0 != -117) {
          return;
        }
        field_c = null;
        field_n = null;
        field_e = null;
    }

    final static short[] a(int param0, short[] param1, int param2, uc param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        short[] stackIn_17_0 = null;
        short[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Terraphoenix.field_V;
        try {
          var4_int = param3.a(false, param2);
          if (var4_int == 0) {
            return null;
          }
          if (param1 == null ||
            var4_int != param1.length) {
            param1 = new short[var4_int];
          }
          var5 = param3.a(false, 4);
          var6 = (short)param3.a(false, 16);
          if (var5 <= 0) {
            for (var7 = 0; var4_int > var7; var7++) {
              param1[var7] = (short)var6;
            }
          } else {
            for (var7 = 0; var4_int > var7; var7++) {
              param1[var7] = (short)(var6 + param3.a(false, var5));
            }
          }
          if (param0 == -25076) {
            stackIn_19_0 = (short[]) (param1);
            return stackIn_19_0;
          }
          stackIn_17_0 = (short[]) null;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("dc.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final int a(int param0) {
        if (!this.field_g && (this.field_l != 2 ||
          this.field_m <= 0)) {
          if (~this.field_k == ~fb.field_i) {
            return 1;
          }
          if (param0 != 2) {
            return 57;
          }
          if (jg.field_gb == 2 &&
            b.a(true, this.field_d)) {
            return 1;
          }
          return 0;
        }
        return 2;
    }

    final static int b(byte param0) {
        if (param0 != 30) {
          field_a = 20;
          return 1;
        }
        return 1;
    }

    dc(boolean param0) {
        this.field_f = wb.field_c;
        this.field_h = ea.field_n;
        this.field_k = pl.field_Q;
        this.field_d = wh.field_a;
        this.field_j = ji.field_k;
        if (!param0) {
          this.field_i = null;
        } else {
          this.field_i = ui.field_e;
        }
        this.field_g = ng.field_s;
        this.field_m = da.field_d;
        this.field_l = im.field_c;
    }

    static {
        int var0 = 0;
        long var6 = 0L;
        long var4 = 0L;
        int var3 = 0;
        int var2 = 0;
        int var1 = 0;
        field_c = new int[98304];
        for (var0 = 92682; var0 >= 46341; var0--) {
          var6 = (long)(1 + (var0 << 1));
          var4 = (long)(-1 + (var0 << 1));
          var3 = (int)((var6 * var6 >> 18) - 32768L);
          var2 = (int)(-32768L + (var4 * var4 >> 18));
          if (field_c.length <= var3) {
            var3 = -1 + field_c.length;
          }
          for (var1 = 0 > var2 ? 0 : var2; var1 <= var3; var1++) {
            field_c[var1] = var0;
          }
        }
        field_e = new String[]{"Unite your forces", "Capture Objectives", "Destroy the enemy", "Research powerful weaponary", "Liberate the cities", "Defend humanity"};
        field_n = new rj();
    }
}
