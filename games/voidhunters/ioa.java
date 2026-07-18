/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ioa extends rqa {
    static dja field_q;
    static int field_o;
    static int field_p;

    final static short[] a(short[] param0, int param1, int param2) {
        short[] var3 = null;
        RuntimeException var3_ref = null;
        Object var4 = null;
        short[] var5 = null;
        short[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        short[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 > 70) {
                break L1;
              } else {
                var4 = null;
                short[] discarded$2 = ioa.a((short[]) null, -85, 57);
                break L1;
              }
            }
            var5 = new short[param2];
            var3 = var5;
            cua.a(param0, 0, var5, 0, param2);
            stackOut_2_0 = (short[]) var5;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3_ref;
            stackOut_4_1 = new StringBuilder().append("ioa.B(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1, byte param2) {
        nl var3 = null;
        int var4 = 0;
        nl var8 = null;
        nl var9 = null;
        gd var10 = null;
        ana var11 = null;
        gd var12 = null;
        ana var13 = null;
        if (kba.field_a == null) {
          return;
        } else {
          var8 = ohb.a(param0, -26, 0);
          var9 = var8;
          if (param2 < -31) {
            if (var9 == null) {
              L0: {
                var4 = param0;
                if (fbb.field_j[param0] <= 1) {
                  break L0;
                } else {
                  var4 = hob.a(jp.field_Jc, fbb.field_j[param0], 123) + param0;
                  break L0;
                }
              }
              var12 = fa.field_d[var4];
              var13 = lha.a(-102, var12);
              var13.field_e.d(-1);
              var3 = new nl();
              var3.field_h = true;
              var3.field_d = var13;
              var3.field_l = 0;
              var3.field_g = false;
              var3.field_k = param0;
              gtb.field_d.b(-10258, (ksa) (Object) var3);
              return;
            } else {
              var9.field_h = true;
              return;
            }
          } else {
            field_q = null;
            if (var9 == null) {
              L1: {
                var4 = param0;
                if (fbb.field_j[param0] <= 1) {
                  break L1;
                } else {
                  var4 = hob.a(jp.field_Jc, fbb.field_j[param0], 123) + param0;
                  break L1;
                }
              }
              var10 = fa.field_d[var4];
              var12 = var10;
              var12 = var10;
              var11 = lha.a(-102, var10);
              var11.field_e.d(-1);
              var3 = new nl();
              var3.field_h = true;
              var3.field_d = var11;
              var3.field_l = 0;
              var3.field_g = false;
              var3.field_k = param0;
              gtb.field_d.b(-10258, (ksa) (Object) var3);
              return;
            } else {
              var9.field_h = true;
              return;
            }
          }
        }
    }

    public static void e(byte param0) {
        field_q = null;
        if (param0 != -102) {
            ioa.e((byte) -93);
        }
    }

    ioa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        Object stackIn_2_0 = null;
        nc stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        nc stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 < -119) {
              stackOut_3_0 = new nc((Object) (Object) frb.a(148, 90));
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (nc) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3;
            stackOut_5_1 = new StringBuilder().append("ioa.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 0;
        field_o = 10;
        field_q = (dja) (Object) new fr();
    }
}
