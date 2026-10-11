/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    static long field_c;
    static String field_b;
    static int field_a;
    static int field_d;

    final static void a(int param0, float param1, float param2, ei param3, ei param4) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        float var7 = 0.0f;
        float var8 = 0.0f;
        int var9 = 0;
        int var10 = 0;
        int var9Lifetime1;
        var10 = HoldTheLine.field_D;
        try {
          var5_int = (int)param2;
          if (param0 != 2) {
            return;
          }
          var6 = (int)param1;
          var7 = (float)(-var5_int) + param2;
          var8 = (float)(-var6) + param1;
          if (var6 == var5_int) {
            if (var7 != var8) {
              param4.a(fk.a(1, var8, (vj) (param3.field_b[var5_int]), var7), (byte) 6);
            }
            return;
          }
          if (var5_int >= var6) {
            if (0.0f < var7) {
              param4.a(td.a(150, var7, (vj) (param3.field_b[var5_int])).c(false), (byte) 6);
            }
            for (var9 = -1 + var5_int; var6 < var9; var9--) {
              param4.a(((vj) (param3.field_b[var9])).c(false), (byte) 6);
            }
            param4.a(ik.a(119, (vj) (param3.field_b[var6]), var8).c(false), (byte) 6);
            return;
          }
          param4.a(ik.a(92, (vj) (param3.field_b[var5_int]), var7), (byte) 6);
          for (var9Lifetime1 = var5_int + 1; var6 > var9Lifetime1; var9Lifetime1++) {
            param4.a(param3.field_b[var9Lifetime1], (byte) 6);
          }
          if (var8 > 0.0f) {
            param4.a(td.a(param0 + 148, var8, (vj) (param3.field_b[var6])), (byte) 6);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_24_0 = var5;
          stackIn_24_1 = new StringBuilder().append("fc.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',');
          if (param4 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final static int[] a(int param0, int param1, int param2) {
        int var4 = 0;
        int[] var5 = new int[2 * param2];
        int[] var3 = var5;
        for (var4 = 0; param2 > var4; var4++) {
          var5[var4 * 2] = var4;
          var5[2 * var4 + 1] = param1;
        }
        if (param0 <= -1) {
          return var5;
        }
        field_d = 35;
        return var5;
    }

    public static void a(int param0) {
        int var1 = 15 / ((param0 + 77) / 48);
        field_b = null;
    }

    final static bm a(boolean param0) {
        bm var1 = null;
        if (param0) {
          var1 = new bm(bo.field_b, ih.field_o, la.field_j[0], wb.field_g[0], nk.field_K[0], ad.field_d[0], lk.field_e[0], dd.field_E);
          tk.a(false);
          return var1;
        }
        return (bm) null;
    }

    static {
        field_d = 20;
        field_b = "Not yet achieved";
    }
}
