/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    static int field_b;
    static String field_a;

    final static void b(boolean param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        var1 = tf.field_a;
        synchronized (var1) {
          ka.field_L = ka.field_L + 1;
          Confined.field_I = pe.field_n;
          ld.field_l = r.field_a;
          jh.field_R = rd.field_Nb;
          hn.field_D = th.field_cb;
          th.field_cb = param0;
          rh.field_X = sh.field_K;
          wm.field_hb = va.field_a;
          m.field_a = qf.field_f;
          sh.field_K = 0;
          b.field_f = mg.field_e;
        }
    }

    final static void a(sf param0, int param1, int param2) {
        RuntimeException var3 = null;
        int var4 = 0;
        sf var5 = null;
        hb var6 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = vh.field_a;
          var6.b(true, param2);
          var6.field_n = var6.field_n + 1;
          var4 = var6.field_n;
          var6.f(100, 1);
          var6.f(117, param0.field_r);
          var6.f(param1 ^ 119, param0.field_u);
          var6.d(-90, param0.field_n);
          var6.d(-99, param0.field_v);
          var6.d(-95, param0.field_m);
          var6.d(-120, param0.field_q);
          var6.e(26199, var4);
          var6.a(25859, -var4 + var6.field_n);
          if (param1 == 0) {
            return;
          }
          var5 = (sf) null;
          nh.a((sf) null, 93, 84);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("nh.C(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          String var2 = (String) null;
          nh.a((String) null, -4);
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static fg a(String param0, int param1) {
        String var2 = null;
        fg var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_3_0 = null;
        fg stackIn_15_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = Confined.field_J ? 1 : 0;
        try {
          if (null == ij.field_t) {
            stackIn_3_0 = null;
            return (fg) (stackIn_3_0);
          }
          var6 = (CharSequence) ((Object) param0);
          var2 = hh.a(param1 + param1, var6);
          if (var2 == null) {
            var2 = param0;
          }
          var3 = (fg) (ij.field_t.a((long)var2.hashCode(), -1));
          while (var3 != null) {
            var7 = (CharSequence) ((Object) var3.field_ob);
            var4 = hh.a(param1 + 0, var7);
            if (var4 == null) {
              var4 = var3.field_ob;
            }
            if (var4.equals(var2)) {
              stackIn_15_0 = var3;
              return stackIn_15_0;
            }
            var3 = (fg) (ij.field_t.a(param1 ^ 114));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_20_0 = var2_ref;
          stackIn_20_1 = new StringBuilder().append("nh.B(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_a = "Discard";
    }
}
