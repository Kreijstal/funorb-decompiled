/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends rqa {
    static ij field_p;
    static byte[] field_o;

    public static void a(int param0) {
        if (param0 != 8) {
          field_p = (ij) null;
          field_p = null;
          field_o = null;
          return;
        }
        field_p = null;
        field_o = null;
    }

    final nc a(nc[] param0, int param1) {
        RuntimeException var3 = null;
        nc[] var4 = null;
        nc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 > -119) {
            var4 = (nc[]) null;
            this.a((nc[]) null, -2);
          }
          stackIn_3_0 = new nc(frb.a(226, 110));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ce.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void b(boolean param0) {
        ema.field_o = new mfb[12];
        ema.field_o[0] = (mfb) ((Object) new fpb());
        ema.field_o[1] = (mfb) ((Object) new deb());
        ema.field_o[2] = (mfb) ((Object) new ifb());
        ema.field_o[3] = (mfb) ((Object) new wqb());
        ema.field_o[4] = (mfb) ((Object) new mna());
        ema.field_o[5] = (mfb) ((Object) new teb());
        ema.field_o[6] = (mfb) ((Object) new fma());
        ema.field_o[11] = (mfb) ((Object) new rma());
        ema.field_o[7] = (mfb) ((Object) new wca());
        ema.field_o[8] = (mfb) ((Object) new dm());
        ema.field_o[9] = (mfb) ((Object) new ira());
        ema.field_o[10] = (mfb) ((Object) new jeb());
        if (param0) {
          ce.b(false);
        }
    }

    final static void a(asb param0, boolean param1) {
        fca var2 = null;
        try {
          fca.b(param0.a("", true, "headers.packvorbis"));
          if (param1) {
            asb var3 = (asb) null;
            ce.a((asb) null, false);
          }
          var2 = fca.a(param0, "jagex logo2.packvorbis", "");
          var2.b();
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "ce.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    ce(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    static {
        field_p = new ij();
    }
}
