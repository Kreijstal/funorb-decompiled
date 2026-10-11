/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gf {
    static boolean field_i;
    static ck field_a;
    static gh field_j;
    static qm field_e;
    static cc field_b;
    static pi[] field_f;
    static w field_g;
    static nm field_c;
    static String field_d;
    static String field_h;

    final static boolean a(int param0, String param1, String param2) {
        RuntimeException var3 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -94) {
            gf.a(-99);
          }
          if (qf.a(param2, 0)) {
            return false;
          }
          if (mc.a(param2, (byte) -111)) {
            return false;
          }
          if (client.a(92, param2)) {
            return false;
          }
          if (param1.length() == 0) {
            return true;
          }
          if (nn.a(false, param1, param2)) {
            return false;
          }
          if (ij.a(param2, param1, (byte) -117)) {
            return false;
          }
          if (!he.a(param1, (byte) 126, param2)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_31_0 = var3;
          stackIn_31_1 = new StringBuilder().append("gf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          stackIn_34_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',');
          if (param2 == null) {
            stackIn_35_2 = "null";
          } else {
            stackIn_35_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_34_1).append(stackIn_35_2).append(')').toString());
        }
    }

    final static String a(int param0, boolean param1, boolean param2, boolean param3) {
        int var4 = 0;
        if (param0 <= -124) {
          var4 = 0;
          if (param3) {
            var4 += 4;
          }
          if (param2) {
            var4 += 2;
          }
          if (param1) {
            var4++;
          }
          return ki.field_n[var4];
        }
        return (String) null;
    }

    final static void a(String[] args, boolean param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            return;
          }
          if (da.field_e != null) {
            da.field_e.field_db.a(32, args);
          }
          if (null == sn.field_k) {
            return;
          }
          sn.field_k.field_W.a(32, args);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("gf.B(");
          if (args == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(byte param0) {
        if (!v.field_d) {
          throw new IllegalStateException();
        }
        if (param0 == -126) {
          qi.field_M = true;
          vk.a(false, 841566312);
          hc.field_d = 0;
          return;
        }
        String[] var2 = (String[]) null;
        gf.a((String[]) null, true);
        qi.field_M = true;
        vk.a(false, 841566312);
        hc.field_d = 0;
    }

    public static void a(int param0) {
        field_f = null;
        field_h = null;
        field_d = null;
        field_g = null;
        field_b = null;
        field_j = null;
        if (param0 == 2) {
          field_a = null;
          field_c = null;
          field_e = null;
          return;
        }
        gf.a(46, true, false, false);
        field_a = null;
        field_c = null;
        field_e = null;
    }

    static {
        field_j = new gh(0);
        field_e = new qm(4, 1, 1, 1);
        field_d = "<%0> has declined the invitation.";
        field_h = "Hide lobby chat";
    }
}
