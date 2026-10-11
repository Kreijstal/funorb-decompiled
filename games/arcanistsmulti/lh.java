/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh implements pf {
    private int field_k;
    private int field_f;
    private int field_m;
    private int field_l;
    private int field_b;
    private dj field_j;
    static vn field_c;
    private int field_i;
    static String field_h;
    static String field_d;
    static boolean field_n;
    static eg field_g;
    static String field_a;
    static String[] field_e;

    public final void a(qm param0, int param1, int param2, int param3, boolean param4) {
        int var10 = 0;
        qm stackIn_4_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        wg var12 = null;
        var11 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (!(param0 instanceof wg)) {
            stackIn_4_0 = null;
          } else {
            stackIn_4_0 = (qm) (param0);
          }
          var12 = (wg) (stackIn_4_0);
          de.d(param0.field_n + param2, param3 + param0.field_j, param0.field_v, param0.field_k, this.field_k);
          if (var12 == null) {
          }
          if (param1 != 5592405) {
            return;
          }
          var7 = -(2 * var12.field_H) + param0.field_v;
          var8 = param0.field_n + param2 + var12.field_H;
          var9 = var12.field_L + (param0.field_j + param3);
          de.b(var8, var9, var7 + var8, var9, this.field_b);
          for (var10 = -1 + var12.c(false); 0 <= var10; var10--) {
            de.i(var8 + var7 * var12.a(0, var10) / var12.g((byte) -102), var9, this.field_i, this.field_m);
          }
          if (null == this.field_j) {
            return;
          }
          this.field_j.b(var12.field_g, var8 + var7 / 2, var12.field_L + (this.field_j.field_H + var9), this.field_l, this.field_f);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("lh.A(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_h = null;
        field_e = null;
        field_d = null;
        if (param0 == 2) {
          field_a = null;
          field_g = null;
          return;
        }
        field_d = (String) null;
        field_a = null;
        field_g = null;
    }

    lh(dj param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          this.field_i = param5;
          this.field_f = param2;
          this.field_b = param3;
          this.field_j = param0;
          this.field_k = param4;
          this.field_l = param1;
          this.field_m = param6;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "lh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
        field_c = new vn();
        field_d = "Just one target left; you're almost there! If a target is hard to hit, try aiming away from it and watching how Arcane Arrow curves around to the focus point.";
        field_h = "Remaining time this turn";
        field_a = "Discard";
        field_e = new String[]{"All scores", "My scores", "Best each"};
    }
}
