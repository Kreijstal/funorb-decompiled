/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ig {
    static jn field_b;
    static pl field_a;

    final static boolean b(int param0) {
        int var5 = 0;
        ah[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var11 = 0;
        wc var12 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        ah var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var11 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (ku.field_J == null) {
            return false;
          }
          if (an.field_a == -1) {
            return false;
          }
          if (ku.field_J.length <= an.field_a) {
            return false;
          }
          var12 = ku.field_J[an.field_a];
          var2 = var12.field_b;
          var3 = 0;
          var4 = 26 / ((67 - param0) / 42);
          for (var5 = 0; var5 < var2.length; var5++) {
            if (var2[var5] != null &&
              var2[var5].field_F == g.field_c) {
              var6 = var2[var5];
              var7 = var6.field_C;
              var8 = var6.field_z;
              var9 = var6.field_Q;
              var10 = var6.field_N;
              var3 = 1;
              oc.a(uj.a(var9, var7, var10, (byte) 84, var8), false);
            }
          }
          g.field_c = g.field_c + 1;
          if (var3 != 0) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "ig.A(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        if (param0 != 22075) {
          ig.a(66);
        }
        lf.a(0, 256);
    }

    final static int a(String param0, boolean param1) {
        int var8_int = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_42_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_46_0 = 0;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        String var3 = null;
        byte[] var4 = null;
        Object var5 = null;
        RuntimeException var6_ref_RuntimeException = null;
        int var6 = 0;
        byte[] var7 = null;
        Throwable var8 = null;
        int var9 = 0;
        String var10 = null;
        File var11 = null;
        byte[] var12 = null;
        byte[] var13 = null;
        byte[] var14 = null;
        byte[] var15 = null;
        var9 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (!param1) {
            field_b = (jn) null;
          }
          if (!qn.field_e.field_f) {
            stackIn_6_0 = -1;
            return stackIn_6_0;
          }
          if (mi.field_b.containsKey(param0)) {
            stackIn_10_0 = 100;
            return stackIn_10_0;
          }
          var10 = ua.a((byte) 53, param0);
          if (var10 == null) {
            stackIn_14_0 = -1;
            return stackIn_14_0;
          }
          var3 = pn.field_n + var10;
          if (!ha.field_e.b("", var3, -1)) {
            stackIn_17_0 = -1;
            return stackIn_17_0;
          }
          if (!ha.field_e.a(var3, 100)) {
            stackIn_20_0 = ha.field_e.a(var3, (byte) 33);
            return stackIn_20_0;
          }
          var15 = ha.field_e.a("", var3, -1);
          var13 = var15;
          var4 = var13;
          var5 = null;
          try {
            var11 = el.a(var10, (byte) -8);
          } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6_ref_RuntimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = -1;
            return stackIn_25_0;
          }
          if (var4 != null &&
            var11 != null) {
            boolean decompiledFrameRemainder0 = true;
            boolean decompiledFrameCompleted0 = true;
            var6 = 1;
            var14 = si.a(var11, (byte) -23);
            var12 = var14;
            var7 = var12;
            if (var7 != null &&
              var14.length == var15.length) {
              for (var8_int = 0; var14.length > var8_int; var8_int++) {
                if (var14[var8_int] != var15[var8_int]) {
                  var6 = 0;
                  decompiledFrameCompleted0 = false;
                  break;
                }
              }
              decompiledFrameRemainder0 = !(decompiledFrameCompleted0);
            }
            if ((decompiledFrameRemainder0) &&
              (decompiledFrameCompleted0)) {
              var6 = 0;
            }
            try {
              if (var6 == 0) {
                qn.field_e.a(var15, -31357, var11);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var8 = decompiledCaughtException;
              stackIn_42_0 = -1;
              return stackIn_42_0;
            }
            hw.a(var11, param0, 23295);
            stackIn_44_0 = 100;
            return stackIn_44_0;
          }
          stackIn_46_0 = -1;
          return stackIn_46_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_49_0 = var2;
          stackIn_49_1 = new StringBuilder().append("ig.C(");
          if (param0 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          field_a = (pl) null;
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_b = new jn();
    }
}
