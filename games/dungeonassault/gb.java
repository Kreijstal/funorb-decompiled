/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gb {
    static int[] field_e;
    private nh field_d;
    static int field_a;
    private nh field_b;
    private eg field_c;

    final nf a(int param0, int param1) {
        byte[] var4 = null;
        nf var3 = (nf) (this.field_c.a(-70, (long)param0));
        if (var3 != null) {
          return var3;
        }
        if (param0 < 32768) {
          var4 = this.field_b.b(5, 1, param0);
        } else {
          var4 = this.field_d.b(5, 1, param0 & 32767);
        }
        if (param1 != -19256) {
          return (nf) null;
        }
        var3 = new nf();
        if (var4 != null) {
          var3.a(new ec(var4), param1 + 19255);
        }
        if (32768 <= param0) {
          var3.d((byte) -74);
        }
        this.field_c.a(true, var3, (long)param0);
        return var3;
    }

    final static ba a(java.applet.Applet param0, int param1) {
        int var4 = 0;
        String var2 = null;
        RuntimeException var2_ref = null;
        ba[] var3 = null;
        ba var5 = null;
        int var6 = 0;
        java.applet.Applet var7 = null;
        ba stackIn_3_0 = null;
        ba stackIn_11_0 = null;
        ba stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = DungeonAssault.field_K;
        try {
          var2 = en.a("jagex-last-login-method", (byte) 121, param0);
          if (var2 == null) {
            stackIn_3_0 = rl.field_j;
            return stackIn_3_0;
          }
          if (param1 >= -74) {
            var7 = (java.applet.Applet) null;
            gb.a((java.applet.Applet) null, 18);
          }
          var3 = jg.b((byte) 24);
          for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (var5.a(var2, 20886)) {
              stackIn_11_0 = var5;
              return stackIn_11_0;
            }
          }
          stackIn_14_0 = rl.field_j;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_17_0 = var2_ref;
          stackIn_17_1 = new StringBuilder().append("gb.A(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != 32767) {
          field_a = 79;
        }
    }

    private gb() throws Throwable {
        throw new Error();
    }

    static {
        field_e = new int[]{10};
    }
}
