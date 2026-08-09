/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class raa extends rqa {
    static String field_q;
    static int[][] field_p;
    static String field_o;

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 <= -119) {
              si.a(103, 62, param0[0].a(96));
              stackIn_4_0 = new nc("void");
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (nc) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("raa.A(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    raa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static dj e(int param0) {
        String var1;
        int var2;
        var2 = -9 % ((param0 - -52) / 62);
        var1 = wnb.a(87);
        if (var1 != null) {
          if ((var1.indexOf('@') ^ -1) > -1) {
            return new dj(wnb.a(94), rta.e(-3840));
          } else {
            var1 = "";
            return new dj(wnb.a(94), rta.e(-3840));
          }
        } else {
          return new dj(wnb.a(94), rta.e(-3840));
        }
    }

    final static void a(byte param0, lta param1) {
        pd var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = VoidHunters.field_G;
        try {
          L0: {
            if (null == rb.field_c) {
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var2 = (pd) ((Object) rb.field_c.d(0));
              L1: while (true) {
                if (var2 == null) {
                  if (param0 == -99) {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    field_p = (int[][]) null;
                    return;
                  }
                } else {
                  sn.a(var2.field_e, (byte) 83, var2.field_h, var2.field_f, var2.field_i, 16711935, param1);
                  var2 = (pd) ((Object) rb.field_c.a((byte) 108));
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_12_0 = (RuntimeException) (var2_ref);

            stackIn_12_1 = new StringBuilder().append("raa.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_o = null;
        if (param0 != 0) {
            return;
        }
        field_q = null;
        field_p = (int[][]) null;
    }

    static {
        field_o = "Spawn <%0>";
        field_q = "Auto-respond to <%0>";
    }
}
