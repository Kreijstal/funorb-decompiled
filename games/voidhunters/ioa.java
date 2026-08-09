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
        short[] var4 = null;
        short[] var5 = null;
        short[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 > 70) {
                break L1;
              } else {
                var4 = (short[]) null;
                ioa.a((short[]) null, -85, 57);
                break L1;
              }
            }
            var5 = new short[param2];
            var3 = var5;
            cua.a(param0, 0, var5, 0, param2);
            stackIn_3_0 = (short[]) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("ioa.B(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1, byte param2) {
        nl var3;
        int var4;
        nl var8;
        nl var9;
        gd var10;
        ana var11;
        gd var12;
        ana var13;
        if (kba.field_a == null) {
          return;
        } else {
          var8 = ohb.a(param0, -26, param1);
          var9 = var8;
          if (param2 < -31) {
            if (var9 == null) {
              L0: {
                var4 = param0;
                if ((fbb.field_j[param0] ^ -1) >= -2) {
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
              var3.field_l = param1;
              var3.field_g = false;
              var3.field_k = param0;
              gtb.field_d.b(-10258, var3);
              return;
            } else {
              var9.field_h = true;
              return;
            }
          } else {
            field_q = (dja) null;
            if (var9 == null) {
              L1: {
                var4 = param0;
                if ((fbb.field_j[param0] ^ -1) >= -2) {
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
              var3.field_l = param1;
              var3.field_g = false;
              var3.field_k = param0;
              gtb.field_d.b(-10258, var3);
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
            if (param1 < -119) {
              stackIn_4_0 = new nc(frb.a(148, 90));
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

            stackIn_7_1 = new StringBuilder().append("ioa.A(");

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

    static {
        field_p = 0;
        field_o = 10;
        field_q = (dja) ((Object) new fr());
    }
}
