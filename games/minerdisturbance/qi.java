/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi extends cb {
    private boolean field_k;
    static int field_j;
    private String field_i;

    final static boolean f(int param0) {
        if (param0 != -9202) {
          String var2 = (String) null;
          qi.a((String) null, -46, (ik) null, true, -5, (String) null, (String) null);
          if (kj.a(false)) {
            return false;
          }
          if (!si.field_a) {
            return true;
          }
          return false;
        }
        if (kj.a(false)) {
          return false;
        }
        if (!si.field_a) {
          return true;
        }
        return false;
    }

    final static boolean a(String param0, int param1, ik param2, boolean param3, int param4, String param5, String param6) {
        RuntimeException var7 = null;
        uk var8 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (mc.field_t != ic.field_l) {
            return false;
          }
          if (param4 > -81) {
            return false;
          }
          var8 = new uk(mb.field_b, param2);
          mb.field_b.b(1, var8);
          if (cm.a(true)) {
            var8.t(23101);
            return true;
          }
          qf.field_r = param5;
          km.field_b = param6;
          wm.field_d = param0;
          ic.field_l = ci.field_e;
          g.field_o = param3;
          vk.field_g = null;
          me.field_j = param1;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_17_0 = var7;
          stackIn_17_1 = new StringBuilder().append("qi.A(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param6 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    qi(ui param0) {
        super(param0);
        this.field_k = false;
    }

    final ag a(String param0, int param1) {
        ed var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        ag stackIn_2_0 = null;
        ag stackIn_9_0 = null;
        ag stackIn_13_0 = null;
        ag stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param0);
          if (!ra.a((byte) -38, var4)) {
            stackIn_2_0 = fg.field_d;
            return stackIn_2_0;
          }
          if (!param0.equals(this.field_i)) {
            var3 = rf.a((byte) -75, param0);
            if (var3 != null &&
              var3.field_h == null) {
              this.field_i = param0;
              this.field_k = var3.field_c;
            } else {
              stackIn_9_0 = bm.field_o;
              return stackIn_9_0;
            }
          }
          if (param1 != 5) {
            stackIn_13_0 = (ag) null;
            return stackIn_13_0;
          }
          if (this.field_k) {
            stackIn_17_0 = sc.field_a;
          } else {
            stackIn_17_0 = fg.field_d;
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("qi.D(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final void b(byte param0) {
        if (param0 >= -30) {
          this.field_k = false;
          this.field_i = null;
          return;
        }
        this.field_i = null;
    }

    final String a(byte param0, String param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        ed var5 = null;
        CharSequence var6 = null;
        String stackIn_2_0 = null;
        Object stackIn_8_0 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = (CharSequence) ((Object) param1);
          var3 = qa.a((byte) 31, var6);
          var4 = 98 / ((49 - param0) / 56);
          if (var3 != null) {
            stackIn_2_0 = var3;
            return stackIn_2_0;
          }
          if (!param1.equals(this.field_i)) {
            var5 = rf.a((byte) -75, param1);
            if (var5 == null) {
              return null;
            }
            if (var5.field_h != null) {
              stackIn_8_0 = null;
              return (String) (stackIn_8_0);
            }
            this.field_k = var5.field_c;
            this.field_i = param1;
          }
          if (this.field_k) {
            return lg.field_a;
          }
          stackIn_13_0 = hm.field_L;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("qi.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_j = 0;
    }
}
