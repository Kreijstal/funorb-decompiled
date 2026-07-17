/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class w {
    static wj[] field_a;
    static int field_b;

    abstract jh b(byte param0);

    abstract int a(int param0, int param1);

    abstract byte[] a(int param0, byte param1);

    final static void a(vn[] param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var3 = ZombieDawn.field_J;
        try {
          L0: {
            ni.field_b = param0;
            nf.field_d = new vn(55, 130);
            if (param1 < -58) {
              nf.field_d.a();
              ni.field_b[2].h(5, -5, 16777215);
              ni.field_b[3].h(5, -5, 16777215);
              bi.h(4, 4, 0, 0, bi.field_f, bi.field_a);
              ni.field_b[2].h(5, -5, 0);
              ni.field_b[3].h(5, -5, 0);
              mk.field_a = new vn[16];
              qp.field_c = new vn[mk.field_a.length];
              var2_int = 0;
              L1: while (true) {
                if (var2_int >= mk.field_a.length) {
                  al.field_f = ul.a(false, tg.field_c);
                  fk.field_K = ul.a(false, gj.field_m);
                  tb.field_G = ul.a(false, km.field_b);
                  rc.field_v = ul.a(false, hc.field_a);
                  hn.field_h = so.a(al.field_f);
                  cn.field_i = so.a(fk.field_K);
                  md.field_tb = so.a(tb.field_G);
                  eb.field_b = so.a(rc.field_v);
                  cn.field_f.b(115);
                  break L0;
                } else {
                  mk.field_a[var2_int] = new vn(200, 25);
                  mk.field_a[var2_int].a();
                  bj.field_q.a(qp.a(var2_int, 90), 100, 17, 16777215, -1);
                  qp.field_c[var2_int] = so.a(mk.field_a[var2_int]);
                  var2_int++;
                  continue L1;
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var2;
            stackOut_8_1 = new StringBuilder().append("w.E(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw sh.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
    }

    public static void a(byte param0) {
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new wj[14];
    }
}
