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
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 <= 70) {
            var4 = (short[]) null;
            ioa.a((short[]) null, -85, 57);
          }
          var5 = new short[param2];
          var3 = var5;
          cua.a(param0, 0, var5, 0, param2);
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_6_0 = var3_ref;
          stackIn_6_1 = new StringBuilder().append("ioa.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, byte param2) {
        gd var10 = null;
        ana var11 = null;
        int var4 = 0;
        gd var12 = null;
        nl var3 = null;
        gd var12Lifetime1;
        nl var3Lifetime1;
        gd var12Lifetime2;
        int var4Lifetime1;
        if (kba.field_a == null) {
          return;
        }
        nl var8 = ohb.a(param0, -26, param1);
        nl var9 = var8;
        if (param2 >= -31) {
          field_q = (dja) null;
          if (var9 != null) {
            var9.field_h = true;
            return;
          }
          var4 = param0;
          if (fbb.field_j[param0] > 1) {
            var4 = hob.a(jp.field_Jc, fbb.field_j[param0], 123) + param0;
          }
          var10 = fa.field_d[var4];
          var12 = var10;
          var12Lifetime2 = var10;
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
        }
        if (var9 != null) {
          var9.field_h = true;
          return;
        }
        var4Lifetime1 = param0;
        if (fbb.field_j[param0] > 1) {
          var4Lifetime1 = hob.a(jp.field_Jc, fbb.field_j[param0], 123) + param0;
        }
        var12Lifetime1 = fa.field_d[var4Lifetime1];
        ana var13 = lha.a(-102, var12Lifetime1);
        var13.field_e.d(-1);
        var3Lifetime1 = new nl();
        var3Lifetime1.field_h = true;
        var3Lifetime1.field_d = var13;
        var3Lifetime1.field_l = param1;
        var3Lifetime1.field_g = false;
        var3Lifetime1.field_k = param0;
        gtb.field_d.b(-10258, var3Lifetime1);
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
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < -119) {
            stackIn_4_0 = new nc(frb.a(148, 90));
            return stackIn_4_0;
          }
          stackIn_2_0 = (nc) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("ioa.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_p = 0;
        field_o = 10;
        field_q = (dja) ((Object) new fr());
    }
}
