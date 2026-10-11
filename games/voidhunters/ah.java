/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ah extends rqa {
    static int[] field_o;

    final static void e(int param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = VoidHunters.field_G;
        try {
          if (!wgb.field_g) {
            return;
          }
          mmb.field_d = new aja[hwa.field_r.length];
          var1_int = 0;
          if (param0 > -8) {
            field_o = (int[]) null;
          }
          while (mmb.field_d.length > var1_int) {
            if (null != hwa.field_r[var1_int]) {
              mmb.field_d[var1_int] = og.field_r.a(hwa.field_r[var1_int], false);
            }
            var1_int++;
          }
          mmb.field_d[30] = wba.a((byte) -62, og.field_r, oaa.field_j);
          nkb.a(false, "Finished building sprites");
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rta.a((Throwable) ((Object) var1), "ah.D(" + param0 + ')');
        }
    }

    ah(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 == 233) {
          return;
        }
        field_o = (int[]) null;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -119) {
            stackIn_2_0 = (nc) null;
            return stackIn_2_0;
          }
          si.a(233, 62, param0[0].a(15));
          stackIn_4_0 = new nc("void");
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ah.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        int var2;
        int var3;
        var3 = VoidHunters.field_G;
        if (0 >= hcb.field_o) {
          if (fda.e((byte) 120)) {
            var2 = 0;
          } else {
            var2 = 1;
          }
        } else {
          if (null == efb.field_b) {
            psb.field_b = ob.a(0, bm.field_o, 640, 480, 0, 0);
            if (psb.field_b != null) {
              var2 = 2;
              qa.a((byte) 77, psb.field_b);
            } else {
              var2 = 3;
            }
          } else {
            psb.field_b = efb.field_b.a((byte) 124);
            mb.h(2, 117);
            if (psb.field_b != null) {
              var2 = 2;
              qa.a((byte) 77, psb.field_b);
            } else {
              var2 = 3;
            }
          }
        }
        if (param0 != 2) {
          return;
        }
        if (null != efb.field_b) {
          return;
        }
        if (vbb.field_p) {
          wha.a(2, param1, var2);
        }
    }

    static {
        field_o = new int[4];
    }
}
