/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bka implements qda {
    private po field_a;
    private int field_b;
    private int field_c;
    static boolean field_h;
    private int field_g;
    private int field_d;
    private int field_e;
    private int field_f;

    final static void b(int param0, int param1) {
        int var4 = 0;
        pf var2 = sja.field_fb;
        int var4Lifetime1;
        var2.c(param1, (byte) 113);
        var2.field_g = var2.field_g + 1;
        int var3 = var2.field_g;
        var2.d(5, 0);
        if (param0 > -107) {
          field_h = false;
          var2.d(pw.field_w.field_Pb, 0);
          var4 = (pw.field_w.field_Lb << 6) + pw.field_w.field_Kb;
          var2.d(var4, 0);
          var2.a(0, -77, pw.field_w.field_Eb.length, pw.field_w.field_Eb);
          var2.b((byte) -32, -var3 + var2.field_g);
          return;
        }
        var2.d(pw.field_w.field_Pb, 0);
        var4Lifetime1 = (pw.field_w.field_Lb << 6) + pw.field_w.field_Kb;
        var2.d(var4Lifetime1, 0);
        var2.a(0, -77, pw.field_w.field_Eb.length, pw.field_w.field_Eb);
        var2.b((byte) -32, -var3 + var2.field_g);
    }

    final static void a(int param0, int param1) {
        cm.a(param1, (byte) -111);
        if (param0 != -14305) {
          field_h = false;
        }
    }

    final static void a(vr param0, boolean param1) {
        try {
          to.field_b = new kv(param0.a((byte) 123, "dirty-floor.jpg", ""), (java.awt.Component) ((Object) dca.field_y));
          if (!param1) {
            field_h = true;
          }
          r.field_n = new kv(param0.a((byte) 123, "instr_fridge_view.jpg", ""), (java.awt.Component) ((Object) dca.field_y));
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "bka.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void a(int param0, wj param1, int param2, int param3, boolean param4) {
        int var10 = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        bb var12 = null;
        wj stackIn_4_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = BachelorFridge.field_y;
        try {
          if (param1 instanceof bb) {
            stackIn_4_0 = (wj) (param1);
          } else {
            stackIn_4_0 = null;
          }
          var12 = (bb) (stackIn_4_0);
          if (var12 == null) {
          }
          dg.c(param0 + param1.field_s, param1.field_v + param3, param1.field_p, param1.field_q, this.field_g);
          var7 = -(2 * var12.field_A) + param1.field_p;
          var8 = var12.field_A + param0 + param1.field_s;
          var9 = param3 - (-param1.field_v - var12.field_D);
          dg.d(var8, var9, var8 + var7, var9, this.field_f);
          if (param2 != 32679) {
            return;
          }
          for (var10 = -1 + var12.a(param2 ^ 32677); var10 >= 0; var10--) {
            dg.b(var8 + var12.a(var10, -1) * var7 / var12.g(param2 - 32679), var9, this.field_e, this.field_c);
          }
          if (this.field_a == null) {
            return;
          }
          this.field_a.a(var12.field_w, var8 + var7 / 2, var12.field_D + (var9 + this.field_a.field_F), this.field_d, this.field_b);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_15_0 = var6;
          stackIn_15_1 = new StringBuilder().append("bka.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    bka(po param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          this.field_g = param4;
          this.field_d = param1;
          this.field_c = param6;
          this.field_b = param2;
          this.field_f = param3;
          this.field_e = param5;
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "bka.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    static {
    }
}
