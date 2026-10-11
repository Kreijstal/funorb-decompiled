/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lk extends bca {
    static int field_q;
    static int field_r;

    final static String a(CharSequence param0, boolean param1, byte param2) {
        int var7 = 0;
        String stackIn_4_0 = null;
        String stackIn_9_0 = null;
        String stackIn_14_0 = null;
        String stackIn_19_0 = null;
        String stackIn_29_0 = null;
        String stackIn_34_0 = null;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        String stackIn_38_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = BachelorFridge.field_y;
        try {
          if (param0 == null) {
            stackIn_4_0 = tb.field_a;
            return stackIn_4_0;
          }
          var3_int = param0.length();
          var4 = 57 / ((71 - param2) / 51);
          if (var3_int >= 1 &&
            12 >= var3_int) {
            var5 = fq.a(0, param0);
            if (var5 != null &&
              1 <= var5.length()) {
              if (!mp.a(true, var5.charAt(0)) &&
                !mp.a(true, var5.charAt(var5.length() - 1))) {
                var6 = 0;
                for (var7 = 0; param0.length() > var7; var7++) {
                  var8 = param0.charAt(var7);
                  if (!mp.a(true, (char) var8)) {
                    var6 = 0;
                  } else {
                    var6++;
                  }
                  if (var6 >= 2 &&
                    !param1) {
                    stackIn_29_0 = jr.field_a;
                    return stackIn_29_0;
                  }
                }
                if (var6 <= 0) {
                  return null;
                }
                stackIn_34_0 = oga.field_r;
                return stackIn_34_0;
              }
              stackIn_19_0 = oga.field_r;
              return stackIn_19_0;
            }
            stackIn_14_0 = tb.field_a;
            return stackIn_14_0;
          }
          stackIn_9_0 = tb.field_a;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_37_0 = var3;
          stackIn_37_1 = new StringBuilder().append("lk.D(");
          if (param0 == null) {
            stackIn_38_2 = "null";
          } else {
            stackIn_38_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_37_0), ((StringBuilder) (Object) stackIn_37_1).append(stackIn_38_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    lk(int param0, nq param1) {
        super(param0, param1);
    }

    lk(lu param0) {
        super(param0);
        int var2_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          this.field_k = param0.e((byte) 85);
          this.field_o = new eaa();
          var2_int = param0.b(16711935);
          while (true) {
            var2_int--;
            if (var2_int < 0) {
              return;
            }
            this.field_o.a(dca.a((byte) 102, param0), true);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("lk.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final at a(int param0, gj param1) {
        RuntimeException var3 = null;
        CharSequence var4 = null;
        nt stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 5) {
            var4 = (CharSequence) null;
            lk.a((CharSequence) null, true, (byte) 120);
          }
          stackIn_3_0 = new nt(param1, this);
          return (at) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("lk.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static uha c(int param0, int param1) {
        if (param0 == -12411) {
          return null != ola.field_g ? (uha) (ola.field_g.a((long)param1, (byte) -87)) : null;
        }
        CharSequence var3 = (CharSequence) null;
        lk.a((CharSequence) null, true, (byte) 50);
        return null != ola.field_g ? (uha) (ola.field_g.a((long)param1, (byte) -87)) : null;
    }

    final static boolean d(int param0) {
        if (param0 != 2) {
          return false;
        }
        if (null == wh.field_p) {
          return false;
        }
        if (!wh.field_p.b(true)) {
          return false;
        }
        return true;
    }

    final void a(op param0, int param1) {
        try {
          int var3_int = 49 / ((12 - param1) / 35);
          this.a(param0, (byte) -2);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "lk.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
    }
}
