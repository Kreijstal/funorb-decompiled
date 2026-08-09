/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qra extends rqa {
    static int[] field_p;
    static int field_o;

    final static void a(int param0) {
        Exception exception = null;
        Object var1 = null;
        File var1_ref = null;
        Throwable decompiledCaughtException = null;
        if (null == wqb.field_e) {
          return;
        } else {
          var1 = null;
          try {
            L0: {
              var1_ref = lfb.a(ata.field_L, (byte) 34);
              break L0;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            L1: {
              exception = (Exception) (Object) decompiledCaughtException;
              break L1;
            }
          }
          if (param0 <= -95) {
            if (var1_ref == null) {
              return;
            } else {
              fkb.a(67, wqb.field_e, var1_ref);
              return;
            }
          } else {
            return;
          }
        }
    }

    qra(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

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
            si.a(132, 62, param0[0].a(12));
            if (param1 <= -119) {
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

            stackIn_7_1 = new StringBuilder().append("qra.A(");

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

    public static void e(byte param0) {
        if (param0 != -80) {
            field_p = (int[]) null;
            field_p = null;
            return;
        }
        field_p = null;
    }

    static {
        field_p = new int[1];
        field_o = 50;
    }
}
