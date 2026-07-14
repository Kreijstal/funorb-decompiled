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
        var2.c(param1, (byte) 113);
        var2.field_g = var2.field_g + 1;
        int var3 = var2.field_g;
        var2.d(5, 0);
        if (param0 > -107) {
            field_h = false;
            var2.d(pw.field_w.field_Pb, 0);
            var4 = (pw.field_w.field_Lb << -1421154650) + pw.field_w.field_Kb;
            var2.d(var4, 0);
            var2.a(0, -77, pw.field_w.field_Eb.length, pw.field_w.field_Eb);
            var2.b((byte) -32, -var3 + var2.field_g);
            return;
        }
        var2.d(pw.field_w.field_Pb, 0);
        var4 = (pw.field_w.field_Lb << -1421154650) + pw.field_w.field_Kb;
        var2.d(var4, 0);
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
        to.field_b = new kv(param0.a((byte) 123, "dirty-floor.jpg", ""), (java.awt.Component) (Object) dca.field_y);
        if (!param1) {
          field_h = true;
          r.field_n = new kv(param0.a((byte) 123, "instr_fridge_view.jpg", ""), (java.awt.Component) (Object) dca.field_y);
          return;
        } else {
          r.field_n = new kv(param0.a((byte) 123, "instr_fridge_view.jpg", ""), (java.awt.Component) (Object) dca.field_y);
          return;
        }
    }

    public final void a(int param0, wj param1, int param2, int param3, boolean param4) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        bb var12 = null;
        wj stackIn_3_0 = null;
        wj stackOut_2_0 = null;
        Object stackOut_1_0 = null;
        L0: {
          var11 = BachelorFridge.field_y;
          if (param1 instanceof bb) {
            stackOut_2_0 = (wj) param1;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = null;
            stackIn_3_0 = (wj) (Object) stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var12 = (bb) (Object) stackIn_3_0;
          if (var12 == null) {
            break L1;
          } else {
            break L1;
          }
        }
        dg.c(param0 + param1.field_s, param1.field_v + param3, param1.field_p, param1.field_q, ((bka) this).field_g);
        var7 = -(2 * var12.field_A) + param1.field_p;
        var8 = var12.field_A + param0 - -param1.field_s;
        var9 = param3 - (-param1.field_v - var12.field_D);
        dg.d(var8, var9, var8 - -var7, var9, ((bka) this).field_f);
        if (param2 == 32679) {
          var10 = -1 + var12.a(param2 ^ 32677);
          L2: while (true) {
            if (-1 < (var10 ^ -1)) {
              if (((bka) this).field_a != null) {
                ((bka) this).field_a.a(var12.field_w, var8 + var7 / 2, var12.field_D + (var9 + ((bka) this).field_a.field_F), ((bka) this).field_d, ((bka) this).field_b);
                return;
              } else {
                return;
              }
            } else {
              dg.b(var8 - -(var12.a(var10, -1) * var7 / var12.g(param2 + -32679)), var9, ((bka) this).field_e, ((bka) this).field_c);
              var10--;
              continue L2;
            }
          }
        } else {
          return;
        }
    }

    bka(po param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((bka) this).field_g = param4;
        ((bka) this).field_d = param1;
        ((bka) this).field_c = param6;
        ((bka) this).field_b = param2;
        ((bka) this).field_f = param3;
        ((bka) this).field_e = param5;
        ((bka) this).field_a = param0;
    }

    static {
    }
}
