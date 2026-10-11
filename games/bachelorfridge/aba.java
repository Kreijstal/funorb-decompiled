/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class aba extends pk implements fca {
    static boolean field_f;
    private lka field_e;

    final jg c(byte param0) {
        if (param0 == 35) {
          return this.a(this.field_e.field_w, false);
        }
        field_f = true;
        return this.a(this.field_e.field_w, false);
    }

    public final boolean b(byte param0) {
        if (param0 != 5) {
          field_f = true;
          if (null != this.field_e.field_w) {
            return this.field_e.field_w.length() == 0 ? true : false;
          }
          return true;
        }
        if (null == this.field_e.field_w) {
          return true;
        }
        if (this.field_e.field_w.length() != 0) {
          return false;
        }
        return true;
    }

    final static kv[] a(kv param0, boolean param1) {
        kv[] var2 = null;
        RuntimeException var2_ref = null;
        kv var3 = null;
        kv[] var4 = null;
        kv[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            var3 = (kv) null;
            aba.a((kv) null, true);
          }
          var4 = new kv[9];
          var2 = var4;
          var4[4] = param0;
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("aba.CA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void a(lka param0, byte param1) {
        try {
          int var3_int = 96 % ((param1 - 0) / 49);
          this.a(574);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "aba.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String d(byte param0) {
        if (param0 < 97) {
          return (String) null;
        }
        return this.a((byte) 112, this.field_e.field_w);
    }

    final static void a(byte param0, int param1) {
        int var2 = 84 % ((param0 + 18) / 34);
        ol.a(jga.field_y[param1], true);
    }

    public final void a(lka param0, int param1) {
        try {
          if (param1 != 0) {
            this.c((byte) 6);
          }
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "aba.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static pp a(lu param0, int param1) {
        RuntimeException var2 = null;
        lu var3 = null;
        eba stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 9) {
            var3 = (lu) null;
            aba.a((lu) null, 85);
          }
          stackIn_3_0 = new eba();
          return (pp) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("aba.BA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    abstract jg a(String param0, boolean param1);

    abstract String a(byte param0, String param1);

    aba(lka param0) {
        try {
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "aba.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
