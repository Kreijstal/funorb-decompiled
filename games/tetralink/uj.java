/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj extends al {
    static int[][] field_s;
    private int field_t;
    private int field_v;
    private int field_r;
    private oh[] field_u;
    static int[] field_q;
    static int field_w;

    final static hl b(boolean param0) {
        if (param0) {
          field_w = -76;
          return bl.d(!param0 ? true : false);
        }
        return bl.d(!param0 ? true : false);
    }

    final static void a(long param0, int param1) {
        try {
          Throwable decompiledCaughtException = null;
          InterruptedException var3 = null;
          try {
            Thread.sleep(param0);
            if (param1 != -568127903) {
              field_s = (int[][]) null;
              return;
            }
          } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3 = (InterruptedException) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void a(na param0, int param1, int param2, boolean param3, boolean param4) {
        int stackIn_6_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          if (!param0.field_r) {
            stackIn_6_0 = (param0.c(3)) ? 1 : 0;
          } else {
            stackIn_6_0 = 1;
          }
          var6_int = stackIn_6_0;
          if (param0 instanceof ae) {
            param4 = param4 & ((ae) (param0)).field_K;
          }
          if (!param4) {
            stackIn_14_0 = this.field_t;
          } else {
            if (var6_int == 0) {
              stackIn_14_0 = this.field_r;
            } else {
              stackIn_14_0 = this.field_v;
            }
          }
          var7 = stackIn_14_0;
          if (!param3) {
            this.field_u = (oh[]) null;
          }
          stackIn_19_0 = (!param4) ? 7105644 : 16777215;
          var8 = stackIn_19_0;
          ci.a(var7, (-this.field_u[0].field_F + param0.field_u >> 1) + (param0.field_w + param2), param0.field_F, param0.field_t + param1, this.field_u, -119);
          this.field_b.a(param0.field_A, param0.field_t + param1, param0.field_w + (param2 - 2), param0.field_F, param0.field_u, var8, -1, 1, 1, this.field_b.field_N);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_23_0 = var6;
          stackIn_23_1 = new StringBuilder().append("uj.L(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void b(byte param0) {
        int var1 = -97 % ((43 - param0) / 56);
        field_s = (int[][]) null;
        field_q = null;
    }

    private uj(int param0, int param1, int param2) {
        this.field_u = mf.field_q;
        this.field_v = param1;
        this.field_t = param2;
        this.field_r = param0;
        this.field_b = ab.field_V;
    }

    public uj() {
        this(2188450, 2591221, 9543);
    }

    static {
    }
}
