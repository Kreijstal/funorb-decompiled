/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql extends pm {
    private boolean field_h;
    static String field_f;
    private String field_i;
    static float field_j;
    static vn field_g;

    final static void d(int param0) {
        int var1 = 0;
        int var2 = 0;
        if (param0 == -160793343) {
          var1 = rf.a(false);
          var2 = co.b(param0 + 160780300);
          cj.field_i.a(var1 + (af.field_b << 1), wm.field_d - ia.field_c, wh.field_c - af.field_b, (byte) -80, var2 + (ia.field_c << 1));
          d.a(false);
          return;
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        am var4 = null;
        int var5 = 0;
        if (!po.w(13296)) {
          var4 = dp.field_e;
          var4.j(11, param1);
          var4.field_j = var4.field_j + 1;
          var5 = var4.field_j;
          var4.i(0, 97);
          var4.a(param3, (byte) 105);
          var4.i(param2, 82);
          var4.a(param0, (byte) 105);
          var4.d(60, var4.field_j - var5);
          return;
        }
    }

    final rh a(String param0, int param1) {
        eo var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        rh stackIn_2_0 = null;
        rh stackIn_9_0 = null;
        rh stackIn_16_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param0);
          if (!ea.a(20000000, var4)) {
            stackIn_2_0 = uc.field_b;
            return stackIn_2_0;
          }
          if (!param0.equals(this.field_i)) {
            var3 = tm.a((byte) 51, param0);
            if (var3 != null &&
              null == var3.field_e) {
              this.field_i = param0;
              this.field_h = var3.field_b;
            } else {
              stackIn_9_0 = gj.field_v;
              return stackIn_9_0;
            }
          }
          if (param1 != 2) {
            field_g = (vn) null;
          }
          if (this.field_h) {
            stackIn_16_0 = mc.field_g;
          } else {
            stackIn_16_0 = uc.field_b;
          }
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("ql.I(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        field_g = null;
        field_f = null;
        if (!param0) {
          field_f = (String) null;
        }
    }

    ql(tb param0) {
        super(param0);
        this.field_h = false;
    }

    final void e(int param0) {
        if (param0 != -28769) {
          field_j = 0.772375226020813f;
          this.field_i = null;
          return;
        }
        this.field_i = null;
    }

    final String a(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        eo var4 = null;
        CharSequence var5 = null;
        String stackIn_4_0 = null;
        String stackIn_15_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -94) {
            field_g = (vn) null;
          }
          var5 = (CharSequence) ((Object) param0);
          var3 = ed.a(var5, (byte) -105);
          if (var3 != null) {
            stackIn_4_0 = var3;
            return stackIn_4_0;
          }
          if (!param0.equals(this.field_i)) {
            var4 = tm.a((byte) 51, param0);
            if (var4 == null) {
              return null;
            }
            if (null != var4.field_e) {
              return null;
            }
            this.field_h = var4.field_b;
            this.field_i = param0;
          }
          if (this.field_h) {
            stackIn_17_0 = kf.field_X;
            return stackIn_17_0;
          }
          stackIn_15_0 = ma.field_i;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("ql.B(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_f = "Loading...";
        field_j = -1.0f;
    }
}
