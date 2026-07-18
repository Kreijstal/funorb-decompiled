/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nf implements dja {
    static llb field_c;
    static int field_a;
    static String field_b;

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            field_b = null;
            return (tv[]) (Object) new pca[param1];
        }
        return (tv[]) (Object) new pca[param1];
    }

    public static void a(int param0) {
        field_b = null;
        field_c = null;
    }

    final static void b(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (wj.field_q != null) {
          var1 = (Object) (Object) wj.field_q;
          synchronized (var1) {
            L0: {
              wj.field_q = null;
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    final static vu a(String param0, boolean param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        vu var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        vu stackIn_13_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        vu stackOut_12_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var5 = VoidHunters.field_G;
        try {
          if (null != om.field_c) {
            L0: {
              var6 = (CharSequence) (Object) param0;
              var2 = jwa.a(false, var6);
              if (var2 != null) {
                break L0;
              } else {
                var2 = param0;
                break L0;
              }
            }
            var3 = (vu) (Object) om.field_c.a(-1, (long)var2.hashCode());
            L1: while (true) {
              if (var3 != null) {
                L2: {
                  var7 = (CharSequence) (Object) var3.field_Fb;
                  var4 = jwa.a(false, var7);
                  if (var4 != null) {
                    break L2;
                  } else {
                    var4 = var3.field_Fb;
                    break L2;
                  }
                }
                if (!var4.equals((Object) (Object) var2)) {
                  var3 = (vu) (Object) om.field_c.e(-88);
                  continue L1;
                } else {
                  stackOut_12_0 = (vu) var3;
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                }
              } else {
                return null;
              }
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var2_ref;
            stackOut_16_1 = new StringBuilder().append("nf.D(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + false + ')');
        }
    }

    public final tv a(byte param0) {
        int var2 = 20 / ((-64 - param0) / 50);
        return (tv) (Object) new pca();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Unable to delete name - system busy";
    }
}
