/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wr extends k {
    private int field_k;
    private int field_l;

    final int[] a(int param0, int param1) {
        int[] var3;
        int[] var4;
        int var5;
        int var6;
        int var7;
        int[] var8;
        int[] stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_9_2 = 0;
        int[] stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_21_2 = 0;
        int var5Lifetime1;
        int var6Lifetime1;
        int[] var4Lifetime1;
        var7 = BachelorFridge.field_y;
        var8 = this.field_j.a(param0, -1);
        var3 = var8;
        if (param1 == 0) {
          if (!this.field_j.field_m) {
            return var8;
          }
          var4 = this.a(0, param0, (byte) 114);
          for (var5 = 0; hh.field_d > var5; var5++) {
            var6 = var4[var5];
            stackIn_19_0 = var8;
            stackIn_19_1 = var5;
            if (this.field_k <= var6 &&
              this.field_l >= var6) {
              stackIn_21_2 = 4096;
            } else {
              stackIn_21_2 = 0;
            }
            stackIn_19_0[stackIn_19_1] = stackIn_21_2;
          }
          return var8;
        }
        this.field_k = -48;
        if (!this.field_j.field_m) {
          return var8;
        }
        var4Lifetime1 = this.a(0, param0, (byte) 114);
        for (var5Lifetime1 = 0; hh.field_d > var5Lifetime1; var5Lifetime1++) {
          var6Lifetime1 = var4Lifetime1[var5Lifetime1];
          stackIn_7_0 = var8;
          stackIn_7_1 = var5Lifetime1;
          if (this.field_k <= var6Lifetime1 &&
            this.field_l >= var6Lifetime1) {
            stackIn_9_2 = 4096;
          } else {
            stackIn_9_2 = 0;
          }
          stackIn_7_0[stackIn_7_1] = stackIn_9_2;
        }
        return var8;
    }

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String[] var5 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -71) {
            var5 = (String[]) null;
            wr.a((String[]) null, (byte) 3);
          }
          var4_int = param2;
          if (0 == var4_int) {
            this.field_k = param1.e((byte) 54);
            return;
          }
          if (var4_int != 1) {
            return;
          }
          this.field_l = param1.e((byte) 109);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("wr.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(String[] args, byte param1) {
        RuntimeException var2 = null;
        String[] var3 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (qi.field_b != null) {
            qi.field_b.field_J.a(args, (byte) -52);
          }
          if (vk.field_q != null) {
            vk.field_q.field_E.a(args, (byte) -35);
          }
          if (param1 == -38) {
            return;
          }
          var3 = (String[]) null;
          wr.a((String[]) null, (byte) 34);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_11_0 = var2;
          stackIn_11_1 = new StringBuilder().append("wr.C(");
          if (args == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    public wr() {
        super(1, true);
        this.field_k = 0;
        this.field_l = 4096;
    }

    static {
    }
}
