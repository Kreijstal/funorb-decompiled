/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class a {
    static ri[][] field_a;
    static th field_c;
    static int field_b;

    public static void a(boolean param0) {
        if (!param0) {
          field_a = (ri[][]) null;
          field_c = null;
          return;
        }
        ul var2 = (ul) null;
        a.a(-28, (byte) -5, (ul) null, -70);
        field_a = (ri[][]) null;
        field_c = null;
    }

    final static void b(int param0) {
        int var1;
        int var2;
        String var3;
        String var3Lifetime1;
        var2 = ZombieDawnMulti.field_E ? 1 : 0;
        pm.field_P = null;
        nj.field_f = false;
        if (ch.field_e) {
          h.field_L.c(false);
          if (param0 == -1) {
            return;
          }
          var3 = (String) null;
          a.a((String) null, (String) null, (byte) 24);
          return;
        }
        var1 = qq.field_a;
        if (0 < var1) {
          if (1 == var1) {
            pm.field_P = rp.field_e;
          } else {
            pm.field_P = vl.a(al.field_cb, new String[]{Integer.toString(var1)}, 2);
          }
          pm.field_P = wi.a(new CharSequence[]{(CharSequence) ((Object) pm.field_P), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) mi.field_Nb)}, 77);
        }
        h.field_L.m(-7435);
        sp.c(param0 + 1);
        if (param0 == -1) {
          return;
        }
        var3Lifetime1 = (String) null;
        a.a((String) null, (String) null, (byte) 24);
    }

    final static boolean a(int param0) {
        if (param0 >= -38) {
          field_c = (th) null;
          return rn.field_f == null ? ro.field_L : true;
        }
        return rn.field_f == null ? ro.field_L : true;
    }

    final static ja[] a(int param0, byte param1, ul param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        ja[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!ud.a(param3, param2, param0, (byte) -42)) {
            return null;
          }
          var4_int = -18 / ((param1 + 16) / 62);
          stackIn_4_0 = tg.a(0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("a.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(String param0, String param1, byte param2) {
        String var3 = null;
        boolean stackIn_7_0 = false;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          param1 = ee.a('_', "", param1, -121);
          if (param2 > -71) {
            field_c = (th) null;
          }
          var3 = qc.b((byte) -32, param0);
          stackIn_7_0 = (param1.indexOf(param0) != -1) || (param1.indexOf(var3) != -1);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("a.D(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_c = new th();
    }
}
