/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class c extends PacketBuffer {
    static Sprite field_n;
    private int field_r;
    static String[] field_q;
    static String field_p;
    static long[] field_t;
    static String field_o;
    static boolean field_u;
    private df field_s;

    final void a(byte[] param0, int param1, int param2, int param3) {
        String stackIn_10_2 = null;
        int var6 = EscapeVector.obfuscationControl;
        try {
          if (param1 != 19583) {
            return;
          }
          for (int var5_int = 0; param2 > var5_int; var5_int++) {
            int fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param0[param3 + var5_int] = (byte)(this.payload[fieldTemp$0] - this.field_s.a(1736563940));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var5 = decompiledCaughtException;
          RuntimeException stackIn_9_0 = var5;
          StringBuilder stackIn_9_1 = new StringBuilder().append("c.QA(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void m(int param0) {
        if (null != bk.field_r) {
          bk.field_r.a((byte) 33);
        }
        int var1 = -128 / ((param0 - 16) / 38);
    }

    final void l(int param0) {
        this.field_r = 8 * this.position;
        if (param0 != -17928) {
          c.n(-97);
        }
    }

    final void o(int param0) {
        if (param0 == -3879) {
          this.position = (this.field_r + 7) / 8;
          return;
        }
        this.j(-61, -116);
        this.position = (this.field_r + 7) / 8;
    }

    public static void n(int param0) {
        field_t = null;
        field_o = null;
        field_p = null;
        field_q = null;
        if (param0 >= 105) {
          field_n = null;
          return;
        }
        c.m(19);
        field_n = null;
    }

    final void a(int param0, boolean param1) {
        if (param1) {
          int fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte)(this.field_s.a(1736563940) + param0);
          return;
        }
    }

    final static void p(int param0) {
        int var3 = EscapeVector.obfuscationControl;
        try {
          c var1 = om.field_c;
          while (ea.c((byte) -115)) {
            var1.a(8, true);
            int fieldTemp$0 = var1.position + 1;
            var1.position = var1.position + 1;
            int var2 = fieldTemp$0;
            mf.a(param0 ^ -25858, var1);
            om.field_c.e(82, var1.position - var2);
          }
          if (param0 == 11197) {
            return;
          }
          c.p(-41);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1_ref), "c.DB(" + param0 + ')');
        }
    }

    final void a(int[] param0, byte param1) {
        if (param1 < 80) {
          return;
        }
        try {
          this.field_s = new df(param0);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "c.RA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    c(int param0) {
        super(param0);
    }

    final int k(int param0) {
        if (param0 == 8) {
          int fieldTemp$0 = this.position;
          this.position = this.position + 1;
          return 255 & this.payload[fieldTemp$0] - this.field_s.a(1736563940);
        }
        field_u = false;
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        return 255 & this.payload[fieldTemp$1] - this.field_s.a(1736563940);
    }

    final int j(int param0, int param1) {
        int var6 = EscapeVector.obfuscationControl;
        int var3 = this.field_r >> 3;
        int var4 = -(7 & this.field_r) + param1;
        this.field_r = this.field_r + param0;
        int var5 = 0;
        while (var4 < param0) {
          int incrementValue$0 = var3;
          var3++;
          var5 = var5 + ((this.payload[incrementValue$0] & ol.field_ab[var4]) << -var4 + param0);
          param0 = param0 - var4;
          var4 = 8;
        }
        if (var4 != param0) {
          var5 = var5 + (this.payload[var3] >> var4 - param0 & ol.field_ab[param0]);
        } else {
          var5 = var5 + (ol.field_ab[var4] & this.payload[var3]);
        }
        return var5;
    }

    c(byte[] param0) {
        super(param0);
    }

    static {
        field_q = new String[]{"virtual", "virtual", "virtual", "virtual"};
        field_t = new long[32];
        field_o = "Waiting for fonts";
        field_p = "Go Back";
    }
}
