/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk extends vg {
    int field_j;
    int[] field_h;
    private boolean[] field_g;
    static jpa[] field_k;
    int[] field_i;
    int field_l;
    int[][] field_f;

    final static boolean c(int param0) {
        lqa var1;
        boolean stackIn_9_0 = false;
        if (param0 > -26) {
          field_k = (jpa[]) null;
        }
        var1 = uv.b(false);
        if (var1 == null) {
          return false;
        }
        stackIn_9_0 = (!ara.field_wb) && (var1.field_e);
        return stackIn_9_0;
    }

    public static void b(int param0) {
        field_k = null;
        if (param0 != 20) {
          field_k = (jpa[]) null;
        }
    }

    final static vpa a(int param0) {
        if (param0 != -21819) {
          return (vpa) null;
        }
        if (ur.field_a == null) {
          ur.field_a = new vpa(eka.field_o, 20, 0, 0, 0, 11579568, -1, 0, 0, eka.field_o.field_w, -1, 2147483647, true);
        }
        return ur.field_a;
    }

    final static float a(byte param0, float param1) {
        if (param0 != 14) {
          field_k = (jpa[]) null;
        }
        return (10.0f + (-15.0f + param1 * 6.0f) * param1) * (param1 * (param1 * param1));
    }

    nk(int param0, byte[] param1) {
        int[] array$0 = null;
        int var5 = 0;
        boolean[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        boolean stackIn_11_2 = false;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        uia var7 = null;
        uia var8 = null;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var4Lifetime4;
        try {
          this.field_l = param0;
          var7 = new uia(param1);
          var8 = var7;
          this.field_j = var8.h(255);
          this.field_h = new int[this.field_j];
          this.field_i = new int[this.field_j];
          this.field_f = new int[this.field_j][];
          this.field_g = new boolean[this.field_j];
          for (var4 = 0; this.field_j > var4; var4++) {
            this.field_h[var4] = var7.h(255);
            if (this.field_h[var4] == 6) {
              this.field_h[var4] = 2;
            }
          }
          for (var4Lifetime1 = 0; this.field_j > var4Lifetime1; var4Lifetime1++) {
            stackIn_10_0 = this.field_g;
            stackIn_10_1 = var4Lifetime1;
            stackIn_11_2 = (var8.h(255) == 1);
            stackIn_10_0[stackIn_10_1] = stackIn_11_2;
          }
          for (var4Lifetime2 = 0; var4Lifetime2 < this.field_j; var4Lifetime2++) {
            this.field_i[var4Lifetime2] = var7.d(124);
          }
          for (var4Lifetime3 = 0; this.field_j > var4Lifetime3; var4Lifetime3++) {
            array$0 = new int[var7.h(255)];
            this.field_f[var4Lifetime3] = array$0;
          }
          for (var4Lifetime4 = 0; var4Lifetime4 < this.field_j; var4Lifetime4++) {
            for (var5 = 0; this.field_f[var4Lifetime4].length > var5; var5++) {
              this.field_f[var4Lifetime4][var5] = var7.h(255);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_27_0 = var3;
          stackIn_27_1 = new StringBuilder().append("nk.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    static {
    }
}
