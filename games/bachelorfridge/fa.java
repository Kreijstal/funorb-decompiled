/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa extends kj {
    private kv field_j;
    private int field_h;
    private kv field_m;
    static sna field_k;
    static int field_f;
    static int field_l;
    private lna field_i;
    static fw field_g;

    final static boolean a(byte param0, pf param1) {
        RuntimeException var2 = null;
        boolean stackIn_6_0 = false;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -75) {
            stackIn_6_0 = (param1.d(1, (byte) -72) == 1);
            return stackIn_6_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("fa.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        sna stackIn_7_0 = null;
        boolean stackIn_8_1 = false;
        sna stackIn_11_0 = null;
        boolean stackIn_12_1 = false;
        sna stackIn_21_0 = null;
        boolean stackIn_22_1 = false;
        sna stackIn_25_0 = null;
        boolean stackIn_26_1 = false;
        sna stackIn_36_0 = null;
        boolean stackIn_37_1 = false;
        sna stackIn_40_0 = null;
        boolean stackIn_41_1 = false;
        pf var3;
        pf var3Lifetime1;
        ah.a(640 + dg.field_i >> 1, (byte) 106, 0, dg.field_i - 640 >> 1, dg.field_c);
        if (0 < lfa.field_q) {
          if (nda.field_l != null) {
            nda.field_l.c(ng.field_e.field_kb, 0);
          }
          stackIn_7_0 = ng.field_e;
          stackIn_8_1 = (param0) && (!eda.field_j);
          ((sna) (Object) stackIn_7_0).a(stackIn_8_1, 7802);
          stackIn_11_0 = ui.field_r;
          stackIn_12_1 = (param0) && (!eda.field_j);
          ((sna) (Object) stackIn_11_0).a(stackIn_12_1, 7802);
        }
        if (ld.field_p > 0) {
          if (nda.field_l != null) {
            nda.field_l.c(ela.field_i.field_kb, 0);
          }
          stackIn_36_0 = ela.field_i;
          stackIn_37_1 = (param0) && (!w.field_e);
          ((sna) (Object) stackIn_36_0).a(stackIn_37_1, 7802);
          stackIn_40_0 = ho.field_g;
          stackIn_41_1 = (param0) && (!w.field_e);
          ((sna) (Object) stackIn_40_0).a(stackIn_41_1, 7802);
        } else {
          if (0 < dja.field_m) {
            if (nda.field_l != null) {
              nda.field_l.c(ela.field_i.field_kb, 0);
            }
            stackIn_21_0 = ela.field_i;
            stackIn_22_1 = (param0) && (!w.field_e);
            ((sna) (Object) stackIn_21_0).a(stackIn_22_1, 7802);
            stackIn_25_0 = ho.field_g;
            stackIn_26_1 = (param0) && (!w.field_e);
            ((sna) (Object) stackIn_25_0).a(stackIn_26_1, 7802);
            db.b(122);
            if (param1 == 26443) {
              return;
            }
            var3 = (pf) null;
            fa.a((byte) 74, (pf) null);
            return;
          }
        }
        db.b(122);
        if (param1 == 26443) {
          return;
        }
        var3Lifetime1 = (pf) null;
        fa.a((byte) 74, (pf) null);
    }

    fa(gj param0, int param1, int param2, lna param3) {
        super(param0, param1, param2);
        try {
          this.field_i = param3;
          this.field_m = new kv(bd.field_i.field_q, bd.field_i.field_p);
          this.field_j = new kv(128, 64);
          bu.a(0, this.field_j);
          param0.field_s.field_p.e(0, 0, 16711680);
          db.b(107);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "fa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(int param0) {
        int var1 = -10 / ((35 - param0) / 63);
        field_k = null;
        field_g = null;
    }

    final void a(int param0, int param1, int param2) {
        int var4 = (int)((-Math.cos((double)(this.field_h * 4) * 3.141592653589793 / 50.0) + 1.0) * 64.0);
        super.a(param0, param1, param2);
        this.field_j.a(param2, param0, var4);
    }

    final boolean b(int param0) {
        int fieldTemp$0 = this.field_h + 1;
        this.field_h = this.field_h + 1;
        if (fieldTemp$0 >= 50) {
          return true;
        }
        if (param0 > 21) {
          return false;
        }
        return true;
    }

    final void a(int param0, boolean param1, int param2) {
        this.field_i.e(86);
        if (this.field_i.field_x) {
          bd.field_i.e();
        }
        this.field_m.b();
        dg.d();
        bd.field_i.c(0, 0, 16711680);
        hga.field_U.a((byte) 127);
        this.field_m.c(param2 + 9, -90 + param0, this.field_m.field_q >> 1, this.field_m.field_p >> 1, (int)((1.0 - Math.cos(3.141592653589793 * (double)(8 * this.field_h) / 50.0)) * 64.0));
        if (param1) {
          return;
        }
        this.a(102, 113, -38);
    }

    static {
        field_g = new fw(0, 0);
    }
}
