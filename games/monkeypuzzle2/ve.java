/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ve extends mg {
    static ad field_z;
    static te field_A;
    static int[][] field_x;
    static long[] field_w;
    static int[] field_y;

    public static void a(byte param0) {
        field_A = null;
        field_y = null;
        int var1 = -95 / ((-34 - param0) / 38);
        field_w = null;
        field_z = null;
        field_x = (int[][]) null;
    }

    private ve(ta param0, int param1) {
        super(param0, param1);
    }

    ve(int param0) {
        this(t.field_z, param0);
    }

    final String c(we param0, int param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -775) {
            ve.a((byte) 94);
          }
          stackIn_3_0 = al.a('*', param0.field_s.length(), 12663);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ve.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, lg param3) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (lg.field_M == param3) {
            return;
          }
          if (null != vl.field_h &&
            param3 != null &&
            param1 != 0) {
            vl.field_h.a(param3, param2, 0, param1);
          } else {
            if (vl.field_h != null) {
              i.field_p.b(vl.field_h);
              vl.field_h = null;
            }
            if (param3 != null) {
              vl.field_h = new qf(param3);
              w.a(-1, ol.field_e);
              if (param3 == kb.field_d) {
                vl.field_h.a(false);
                i.field_p.c(vl.field_h);
              } else {
                if (bl.field_g == param3) {
                  vl.field_h.a(false);
                  i.field_p.c(vl.field_h);
                } else {
                  if (param3 != b.field_l) {
                    i.field_p.c(vl.field_h);
                  } else {
                    vl.field_h.a(false);
                    i.field_p.c(vl.field_h);
                  }
                }
              }
            }
          }
          lg.field_M = param3;
          if (param0 > 64) {
            return;
          }
          field_y = (int[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_28_0 = var4;
          stackIn_28_1 = new StringBuilder().append("ve.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    static {
        field_x = new int[200][2];
        field_w = new long[32];
        field_A = new te(12, 0, 1, 0);
        field_y = new int[]{500, 500, 300, 100, 200, 300, 300, 100, 200, 300};
    }
}
