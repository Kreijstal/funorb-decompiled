/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj extends mk {
    private boolean field_k;
    static je field_n;
    private String field_m;
    static int[] field_o;
    static je field_l;
    static int field_j;

    final gu a(int param0, String param1) {
        wd var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        gu stackIn_2_0 = null;
        gu stackIn_10_0 = null;
        gu stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param1);
          if (!vq.a(var4, true)) {
            stackIn_2_0 = rn.field_e;
            return stackIn_2_0;
          }
          if (param0 != -3137) {
            field_o = (int[]) null;
          }
          if (!param1.equals(this.field_m)) {
            var3 = ji.a(0, param1);
            if (var3 != null &&
              null == var3.field_i) {
              this.field_m = param1;
              this.field_k = var3.field_a;
            } else {
              stackIn_10_0 = so.field_e;
              return stackIn_10_0;
            }
          }
          if (this.field_k) {
            stackIn_15_0 = oo.field_g;
          } else {
            stackIn_15_0 = rn.field_e;
          }
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("uj.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final String a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        wd var4 = null;
        CharSequence var5 = null;
        String stackIn_2_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (CharSequence) ((Object) param1);
          var3 = SummonRequest.a(var5, false);
          if (var3 != null) {
            stackIn_2_0 = var3;
            return stackIn_2_0;
          }
          if (!param1.equals(this.field_m)) {
            var4 = ji.a(0, param1);
            if (var4 == null) {
              return null;
            }
            if (var4.field_i != null) {
              return null;
            }
            this.field_k = var4.field_a;
            this.field_m = param1;
          }
          if (!this.field_k) {
            stackIn_13_0 = oc.field_Ob;
            return stackIn_13_0;
          }
          if (param0 < 89) {
            this.g(5);
          }
          stackIn_17_0 = fa.field_d;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("uj.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public static void h(int param0) {
        field_n = null;
        field_o = null;
        field_l = null;
        if (param0 != 29151) {
          field_j = -105;
        }
    }

    final void g(int param0) {
        if (param0 != 50) {
          this.field_k = false;
          this.field_m = null;
          return;
        }
        this.field_m = null;
    }

    final static me[] c(byte param0) {
        if (param0 > 100) {
          return new me[]{jk.field_b, na.field_G, oa.field_F, PacketBuffer.field_l, NodeHashIterator.field_i, MovementPlanner.field_c, ab.field_d, lg.field_e, du.field_e, Widget.field_y, MapLayout.field_q, nf.field_Ib, rs.field_v, kq.field_M};
        }
        uj.h(67);
        return new me[]{jk.field_b, na.field_G, oa.field_F, PacketBuffer.field_l, NodeHashIterator.field_i, MovementPlanner.field_c, ab.field_d, lg.field_e, du.field_e, Widget.field_y, MapLayout.field_q, nf.field_Ib, rs.field_v, kq.field_M};
    }

    uj(fn param0) {
        super(param0);
        this.field_k = false;
    }

    static {
        field_j = 3;
        field_o = new int[]{53, 52, 49, 50, 51};
    }
}
