/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wua extends le {
    private int field_j;
    static int field_k;
    private int field_i;

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          if (param1 >= -60) {
            this.a(28, false);
          }
          var4_int = param0;
          if (var4_int == 0) {
            this.field_j = param2.e(1869);
            return;
          }
          if (1 != var4_int) {
            return;
          }
          this.field_i = param2.e(1869);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("wua.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final int[] a(int param0, boolean param1) {
        int var5 = 0;
        int[] var3;
        int[] var4;
        int var6;
        int var7;
        int[] var8;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_11_2 = 0;
        var7 = VoidHunters.field_G;
        var8 = this.field_f.a((byte) 117, param0);
        var3 = var8;
        if (!param1) {
          return (int[]) null;
        }
        if (!this.field_f.field_e) {
          return var8;
        }
        var4 = this.a(0, param0, 255);
        for (var5 = 0; hob.field_d > var5; var5++) {
          var6 = var4[var5];
          stackIn_10_0 = var8;
          stackIn_10_1 = var5;
          if (this.field_j <= var6 &&
            this.field_i >= var6) {
            stackIn_11_2 = 4096;
          } else {
            stackIn_11_2 = 0;
          }
          stackIn_10_0[stackIn_10_1] = stackIn_11_2;
        }
        return var8;
    }

    public wua() {
        super(1, true);
        this.field_i = 4096;
        this.field_j = 0;
    }

    static {
    }
}
