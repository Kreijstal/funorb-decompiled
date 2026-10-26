/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in {
    static int[] field_b;
    long field_d;
    static RenderSprite[] field_c;
    private wl field_a;

    public static void a(boolean param0) {
        if (!param0) {
          field_b = (int[]) null;
        }
        field_b = null;
        field_c = null;
    }

    protected final void finalize() throws Throwable {
        this.field_a.a(this.field_d, 3);
        super.finalize();
    }

    final static fr a(byte param0, boolean param1) {
        fr var2 = new fr(true);
        var2.field_d = param1 ? true : false;
        if (param0 != 111) {
          field_b = (int[]) null;
        }
        return var2;
    }

    in(wl param0, long param1, aq[] param2) {
        try {
          this.field_a = param0;
          this.field_d = param1;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "in.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static w a(int param0, String param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        String var6 = null;
        w var7 = null;
        int var8 = 0;
        w stackIn_4_0 = null;
        w stackIn_8_0 = null;
        w stackIn_12_0 = null;
        w stackIn_20_0 = null;
        w stackIn_23_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          var2_int = param1.length();
          if (var2_int == 0) {
            stackIn_4_0 = nh.field_f;
            return stackIn_4_0;
          }
          if (255 < var2_int) {
            stackIn_8_0 = ei.field_d;
            return stackIn_8_0;
          }
          var3 = ee.a((byte) 10, '.', param1);
          if (var3.length < 2) {
            stackIn_12_0 = nh.field_f;
            return stackIn_12_0;
          }
          if (param0 < 124) {
            field_c = (RenderSprite[]) null;
          }
          var4 = var3;
          for (var5 = 0; var5 < var4.length; var5++) {
            var6 = var4[var5];
            var7 = ic.a(var6, false);
            if (var7 != null) {
              stackIn_20_0 = var7;
              return stackIn_20_0;
            }
          }
          stackIn_23_0 = we.a(var3[-1 + var3.length], -120);
          return stackIn_23_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_26_0 = var2;
          stackIn_26_1 = new StringBuilder().append("in.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    static {
        field_b = new int[1000];
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static fr $cfr$intArgs$a$1ded6534de63(int param0, boolean param1) {
        fr var2 = new fr(true);
        var2.field_d = param1 ? true : false;
        if (param0 != 111) {
          field_b = (int[]) null;
        }
        return var2;
    }
}
