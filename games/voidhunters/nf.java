/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf implements dja {
    static llb field_c;
    static int field_a;
    static String field_b;

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
          field_b = (String) null;
          return (tv[]) ((Object) new pca[param1]);
        }
        return (tv[]) ((Object) new pca[param1]);
    }

    public static void a(int param0) {
        if (param0 != 27167) {
          return;
        }
        field_b = null;
        field_c = null;
    }

    final static void b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (param0 != 14194) {
          field_a = 27;
        }
        if (wj.field_q == null) {
          return;
        }
        var1 = wj.field_q;
        synchronized (var1) {
          wj.field_q = null;
        }
    }

    final static vu a(String param0, boolean param1) {
        String var2 = null;
        vu var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        vu stackIn_13_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = VoidHunters.field_G;
        try {
          if (null == om.field_c) {
            return null;
          }
          var6 = (CharSequence) ((Object) param0);
          var2 = jwa.a(param1, var6);
          if (var2 == null) {
            var2 = param0;
          }
          var3 = (vu) (om.field_c.a(-1, (long)var2.hashCode()));
          while (true) {
            if (var3 == null) {
              return null;
            }
            var7 = (CharSequence) ((Object) var3.field_Fb);
            var4 = jwa.a(param1, var7);
            if (var4 == null) {
              var4 = var3.field_Fb;
            }
            if (!var4.equals(var2)) {
              var3 = (vu) (om.field_c.e(-88));
              continue;
            }
            break;
          }
          stackIn_13_0 = var3;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_18_0 = var2_ref;
          stackIn_18_1 = new StringBuilder().append("nf.D(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    public final tv a(byte param0) {
        int var2 = 20 / ((-64 - param0) / 50);
        return (tv) ((Object) new pca());
    }

    static {
        field_b = "Unable to delete name - system busy";
    }
}
