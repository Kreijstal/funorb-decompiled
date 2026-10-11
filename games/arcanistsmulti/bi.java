/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bi extends rn implements el {
    static int field_I;
    private int field_V;
    private pd field_T;
    static kc field_U;
    static String field_W;

    final static void a(byte param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          nb.a(true, ao.field_g, -24595, 0, je.field_b, param1, tm.field_g);
          for (var2_int = 0; je.field_b > var2_int; var2_int++) {
            ki.field_r[var2_int + param1] = var2_int;
          }
          if (param0 > -103) {
            field_U = (kc) null;
          }
          nb.a(false, ld.field_m, -24595, param1, param1 + je.field_b, param1 + param1, qa.field_m);
          if (param1 >= je.field_b) {
            return;
          }
          je.field_b = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "bi.H(" + param0 + ',' + param1 + ')');
        }
    }

    final static Object a(boolean param0, int param1, byte[] param2) {
        wi var3 = null;
        RuntimeException var3_ref = null;
        wi stackIn_8_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            field_U = (kc) null;
          }
          if (param2 == null) {
            return null;
          }
          if (136 < param2.length) {
            var3 = new wi();
            ((bg) ((Object) var3)).a(110, param2);
            stackIn_8_0 = var3;
            return stackIn_8_0;
          }
          if (!param0) {
            stackIn_13_0 = (byte[]) (param2);
            return stackIn_13_0;
          }
          stackIn_11_0 = dd.a(param2, 0);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("bi.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final String b(boolean param0) {
        if (param0) {
          field_U = (kc) null;
          if (!this.field_w) {
            return null;
          }
          if (this.field_q != null) {
            ih.a(this.field_v - (this.field_V - an.field_g), me.field_I, (byte) 69);
            return this.field_q;
          }
          return null;
        }
        if (!this.field_w) {
          return null;
        }
        if (this.field_q != null) {
          ih.a(this.field_v - (this.field_V - an.field_g), me.field_I, (byte) 69);
          return this.field_q;
        }
        return null;
    }

    final void a(qm param0, int param1, int param2, int param3) {
        try {
          super.a(param0, param1, param2, param3);
          this.field_V = an.field_g - (this.field_n + param1);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "bi.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public final pd a(int param0) {
        if (param0 != 0) {
          return (pd) null;
        }
        return this.field_T;
    }

    final void l(int param0) {
        super.l(param0);
        if (null != this.field_T) {
          this.field_T.b(-17444);
        }
    }

    final void a(pd param0, byte param1) {
        try {
          this.field_T = param0;
          int var3_int = -16 / ((-87 - param1) / 37);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "bi.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    bi(String param0, wc param1, int param2) {
        super(param0, param1, param2);
    }

    public static void o(int param0) {
        if (param0 != 0) {
          bi.a((byte) 84, -108);
          field_W = null;
          field_U = null;
          return;
        }
        field_W = null;
        field_U = null;
    }

    static {
        field_W = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find a suitable opponent in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
