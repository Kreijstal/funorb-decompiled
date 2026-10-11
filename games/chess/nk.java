/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nk extends p {
    static String field_u;
    private int field_s;
    private ke field_p;
    static int[][] field_r;
    static jc field_t;
    static String field_v;
    static String[] field_x;
    static fa field_w;
    static int field_q;

    final void m(int param0) {
        this.field_s = 8 * this.field_l;
        if (param0 != -27123) {
          field_r = (int[][]) null;
        }
    }

    final int e(int param0, int param1) {
        int incrementValue$0 = 0;
        int var7 = Chess.field_G;
        int var3 = this.field_s >> 3;
        int var4 = 8 - (this.field_s & 7);
        this.field_s = this.field_s + param1;
        int var5 = 0;
        int var6 = -116 / ((65 - param0) / 33);
        while (param1 > var4) {
          incrementValue$0 = var3;
          var3++;
          var5 = var5 + ((this.field_o[incrementValue$0] & mi.field_s[var4]) << param1 - var4);
          param1 = param1 - var4;
          var4 = 8;
        }
        if (var4 != param1) {
          var5 = var5 + (this.field_o[var3] >> var4 - param1 & mi.field_s[param1]);
        } else {
          var5 = var5 + (mi.field_s[var4] & this.field_o[var3]);
        }
        return var5;
    }

    nk(int param0) {
        super(param0);
    }

    final void g(byte param0) {
        if (param0 >= 44) {
          this.field_l = (7 + this.field_s) / 8;
          return;
        }
        this.g((byte) -48);
        this.field_l = (7 + this.field_s) / 8;
    }

    nk(byte[] param0) {
        super(param0);
    }

    final int n(int param0) {
        int fieldTemp$0 = 0;
        if (param0 < -15) {
          fieldTemp$0 = this.field_l;
          this.field_l = this.field_l + 1;
          return this.field_o[fieldTemp$0] - this.field_p.b(-1) & 255;
        }
        field_x = (String[]) null;
        int fieldTemp$1 = this.field_l;
        this.field_l = this.field_l + 1;
        return this.field_o[fieldTemp$1] - this.field_p.b(-1) & 255;
    }

    final void a(int[] param0, byte param1) {
        try {
          this.field_p = new ke(param0);
          if (param1 != -92) {
            this.n(-19);
          }
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "nk.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, byte[] param1, boolean param2, int param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = Chess.field_G;
        try {
          for (var5_int = 0; param0 > var5_int; var5_int++) {
            fieldTemp$0 = this.field_l;
            this.field_l = this.field_l + 1;
            param1[param3 + var5_int] = (byte)(this.field_o[fieldTemp$0] - this.field_p.b(-1));
          }
          if (!param2) {
            return;
          }
          field_v = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("nk.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static dm a(boolean param0, String param1, String param2, boolean param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        dm stackIn_5_0 = null;
        dm stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_long = 0L;
          var6 = null;
          if (-1 == param2.indexOf('@')) {
            var7 = (CharSequence) ((Object) param2);
            var4_long = jl.a(var7, false);
          } else {
            var6 = param2;
          }
          if (param3) {
            stackIn_7_0 = l.a(param0, param1, (byte) 36, (String) (var6), var4_long);
            return stackIn_7_0;
          }
          stackIn_5_0 = (dm) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("nk.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(')').toString());
        }
    }

    final void f(int param0, int param1) {
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_o[fieldTemp$0] = (byte)(param0 + this.field_p.b(-1));
        if (param1 > -49) {
          String var4 = (String) null;
          nk.a(true, (String) null, (String) null, true);
        }
    }

    public static void l(int param0) {
        field_r = (int[][]) null;
        field_u = null;
        field_t = null;
        if (param0 == 8) {
          field_x = null;
          field_v = null;
          return;
        }
        String var2 = (String) null;
        nk.a(false, (String) null, (String) null, true);
        field_x = null;
        field_v = null;
    }

    static {
        field_u = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
        field_w = null;
        field_x = new String[3];
        field_v = "Only show game chat from my friends";
    }
}
