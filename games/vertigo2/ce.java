/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ce {
    static boolean field_c;
    static String field_a;
    static String field_d;
    static int field_b;

    public static void a(boolean param0) {
        field_d = null;
        field_a = null;
        if (!param0) {
          field_a = (String) null;
        }
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var7 = 0;
        int var5_intLifetime1;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param1 >= 0) {
            return;
          }
          if (param4 >= param2) {
            for (var5_int = param2; param4 > var5_int; var5_int++) {
              vl.field_e[var5_int][param0] = param3;
            }
            return;
          }
          var7 = param4;
          var5_intLifetime1 = var7;
          while (param2 > var7) {
            vl.field_e[var7][param0] = param3;
            var7++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var5), "ce.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static boolean a(byte param0, boolean param1) {
        long dupTemp$2 = 0L;
        int var2;
        if (null == hb.field_q) {
          hb.field_q = kr.field_g.a(-121, cl.field_d, nb.field_y);
        }
        if (hb.field_q.field_b == 0) {
          return false;
        }
        dupTemp$2 = gk.a(99);
        bm.field_H = dupTemp$2;
        gn.field_b = dupTemp$2;
        var2 = 67 % ((param0 - 60) / 39);
        if (1 != hb.field_q.field_b) {
        }
        rg.field_d = gf.field_h;
        hb.field_q = null;
        return true;
    }

    final static String a(byte param0, boolean param1, CharSequence param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        Object stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          var3 = dp.a(param2, false, param1);
          if (var3 != null) {
            stackIn_3_0 = var3;
            return stackIn_3_0;
          }
          var4 = 0;
          while (true) {
            if (var4 >= param2.length()) {
              if (param0 < -112) {
                return null;
              }
              field_d = (String) null;
              stackIn_13_0 = null;
              return (String) (stackIn_13_0);
            }
            if (wb.a(param2.charAt(var4), (byte) 123)) {
              var4++;
              continue;
            }
            break;
          }
          stackIn_8_0 = ud.field_w;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("ce.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(boolean param0, uh param1) {
        uh var2 = null;
        int var3 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Vertigo2.field_L ? 1 : 0;
        try {
          param1.c(2);
          if (!param0) {
            field_b = -90;
          }
          var2 = (uh) (nr.field_p.a((byte) 100));
          while (var2 != null) {
            if (var2.a(true, param1)) {
              var2 = (uh) (nr.field_p.b(25));
              continue;
            }
            break;
          }
          if (var2 == null) {
            nr.field_p.a(param1, false);
          } else {
            jn.a(param1, var2, 18724);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_13_0 = var2_ref;
          stackIn_13_1 = new StringBuilder().append("ce.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_a = "Enter name of friend to delete from list";
        field_d = "Unable to add friend - system busy";
        field_b = 480;
    }
}
