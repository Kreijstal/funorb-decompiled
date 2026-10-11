/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ed {
    static String[] field_b;
    static String field_e;
    static Calendar field_a;
    static String field_d;
    static int field_f;
    static int field_g;
    static String field_c;

    final static void a(int param0, int param1, String param2, int param3, byte param4, mm param5) {
        int var6_int = 0;
        try {
          var6_int = 2;
          if (se.field_S == param5) {
            var6_int = 1;
          }
          param5.b(param2, param1 - var6_int, param3 - var6_int, 0, -1);
          param5.b(param2, -var6_int + param1, param3, 0, -1);
          param5.b(param2, param1 - var6_int, param3 + var6_int, 0, -1);
          param5.b(param2, param1, param3 - var6_int, 0, -1);
          param5.b(param2, param1, var6_int + param3, 0, -1);
          param5.b(param2, param1 + var6_int, param3 - var6_int, 0, -1);
          param5.b(param2, var6_int + param1, param3, 0, -1);
          param5.b(param2, param1 + var6_int, param3 + var6_int, 0, -1);
          if (param5 == w.field_kb) {
            param5.b(param2, 1 + param1, param3 - var6_int, 0, -1);
            param5.b(param2, param1 - 1, -var6_int + param3, 0, -1);
            param5.b(param2, param1 + var6_int, param3 - 1, 0, -1);
            param5.b(param2, -var6_int + param1, -1 + param3, 0, -1);
            param5.b(param2, var6_int + param1, 1 + param3, 0, -1);
            param5.b(param2, param1 - var6_int, 1 + param3, 0, -1);
            param5.b(param2, param1 + 1, var6_int + param3, 0, -1);
            param5.b(param2, param1 - 1, var6_int + param3, 0, -1);
          }
          if (param4 != 75) {
            field_c = (String) null;
          }
          param5.b(param2, param1, param3, param0, -1);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "ed.E(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_d = null;
        field_b = null;
        int var1 = -49 / ((-30 - param0) / 54);
        field_e = null;
        field_a = null;
        field_c = null;
    }

    final static void a(byte param0, boolean param1) {
        int var2 = -33 / ((param0 - 79) / 41);
        ea.field_D.a(1141039778, param1);
        mf var3 = bc.field_E;
        if (var3 == null) {
          return;
        }
        var3.a(ea.field_D.field_pb, ea.field_D.field_E, (byte) -72);
    }

    final static void a(ji param0, int param1, mi param2, int param3) {
        sh.field_i = param1 * n.a((byte) -74) / 1000;
        if (param3 != 20350) {
          return;
        }
        try {
          wi.a((byte) -51, param0);
          pb.a(param0, -2);
          em.a((byte) -113, param0);
          bg.a(-120);
          bb.a(true);
          gd.field_e = 0 - sh.field_i;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "ed.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void a(int param0) {
        if (!v.field_d) {
          throw new IllegalStateException();
        }
        qi.field_M = true;
        vk.a(true, 841566312);
        hc.field_d = 0;
        if (param0 > 101) {
          return;
        }
        String var2 = (String) null;
        ed.a((String) null, (byte) -16);
    }

    final static wb a(String param0, byte param1) {
        String var2 = null;
        int var3 = 0;
        wb var4 = null;
        String var5 = null;
        int var6 = 0;
        CharSequence var7 = null;
        CharSequence var8 = null;
        wb stackIn_17_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var6 = client.field_A ? 1 : 0;
        try {
          if (mc.field_a == null) {
            return null;
          }
          if (param0 == null) {
            return null;
          }
          if (param0.length() == 0) {
            return null;
          }
          var7 = (CharSequence) ((Object) param0);
          var2 = kf.a(var7, (byte) 2);
          var3 = 38 % ((-44 - param1) / 47);
          if (var2 == null) {
            return null;
          }
          var4 = (wb) (mc.field_a.a(24710, (long)var2.hashCode()));
          while (var4 != null) {
            var8 = (CharSequence) ((Object) var4.field_Ob);
            var5 = kf.a(var8, (byte) 2);
            if (var5.equals(var2)) {
              stackIn_17_0 = var4;
              return stackIn_17_0;
            }
            var4 = (wb) (mc.field_a.d(-17713));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_22_0 = var2_ref;
          stackIn_22_1 = new StringBuilder().append("ed.B(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_e = "Name is available";
        field_a = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_d = null;
    }
}
