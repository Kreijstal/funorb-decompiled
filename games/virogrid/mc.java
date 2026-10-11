/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class mc {
    static v field_b;
    static int field_a;
    static String field_e;
    static Random field_c;
    static String field_d;

    final static byte[] a(byte[] param0, int param1) {
        byte[] stackIn_9_0 = null;
        byte[] stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        byte[] var5_ref_byte__ = null;
        byte[] var6 = null;
        Object var7 = null;
        byte[] var9 = null;
        jc var10 = null;
        byte[] var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        try {
          var10 = new jc(param0);
          if (param1 <= 110) {
            var9 = (byte[]) null;
            mc.a((byte[]) null, 98);
          }
          var3 = var10.g(11132);
          var4 = var10.d((byte) 93);
          if (0 <= var4 && (on.field_c == 0 ||
            !(var4 > on.field_c))) {
            if (0 == var3) {
              var13 = new byte[var4];
              var11 = var13;
              var5_ref_byte__ = var11;
              var10.a(0, var4, true, var13);
              stackIn_9_0 = var5_ref_byte__;
              return stackIn_9_0;
            }
            var5 = var10.d((byte) 123);
            if (var5 >= 0 && (on.field_c == 0 ||
              !(on.field_c < var5))) {
              var14 = new byte[var5];
              var12 = var14;
              var6 = var12;
              if (var3 != 1) {
                var7 = te.field_b;
                synchronized (var7) {
                  te.field_b.a((byte) 50, var14, var10);
                }
              } else {
                bb.a(var14, var5, param0, var4, 9);
              }
              stackIn_23_0 = var6;
              return stackIn_23_0;
            }
            throw new RuntimeException();
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("mc.C(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(int param0, boolean param1, boolean param2, int param3, int param4, int param5, int param6) {
        if (!param2) {
          if (ag.c(-117)) {
            hd.a(param0, (byte) -116, param6, param1);
            if (md.field_e != null &&
              md.field_e.a(param3, param5, param0, param1, (byte) 95)) {
              ch.a(true);
              param1 = false;
            }
            qg.a(7377, param1, param0);
            te.a(param1, -121, param4);
            param1 = false;
          }
          return param1;
        }
        field_c = (Random) null;
        if (ag.c(-117)) {
          hd.a(param0, (byte) -116, param6, param1);
          if (md.field_e != null &&
            md.field_e.a(param3, param5, param0, param1, (byte) 95)) {
            ch.a(true);
            param1 = false;
          }
          qg.a(7377, param1, param0);
          te.a(param1, -121, param4);
          param1 = false;
        }
        return param1;
    }

    public static void a(boolean param0) {
        field_d = null;
        if (!param0) {
          field_b = null;
          field_e = null;
          field_c = null;
          return;
        }
        mc.a(44, true, false, -98, 124, 89, 122);
        field_b = null;
        field_e = null;
        field_c = null;
    }

    static {
        field_a = -1;
        field_e = "<%0> has lost connection.";
        field_c = new Random();
        field_d = "Rotate camera left";
    }
}
