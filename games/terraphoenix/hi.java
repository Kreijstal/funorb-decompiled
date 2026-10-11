/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi extends ei implements n {
    private eb field_X;
    static int field_ab;
    static String field_Y;
    static String field_Z;
    static bg[] field_W;

    private final void k(int param0) {
        int var2 = 93 % ((68 - param0) / 58);
        if (!this.field_J) {
          return;
        }
        this.field_J = false;
    }

    final static String a(long param0, int param1) {
        StringBuilder discarded$0 = null;
        int var3;
        long var4;
        StringBuilder var6;
        long var7;
        int var9;
        int var10;
        int var11;
        var11 = Terraphoenix.field_V;
        if (0L >= param0) {
          return null;
        }
        if (param0 >= 6582952005840035281L) {
          return null;
        }
        if (param0 % 37L == 0L) {
          return null;
        }
        var3 = 0;
        var4 = param0;
        while (var4 != 0L) {
          var4 = var4 / 37L;
          var3++;
        }
        var6 = new StringBuilder(var3);
        while (param0 != 0L) {
          var7 = param0;
          param0 = param0 / 37L;
          var9 = ed.field_a[(int)(var7 - 37L * param0)];
          if (var9 == 95) {
            var10 = var6.length() - 1;
            var9 = 160;
            var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
          }
          discarded$0 = var6.append((char) var9);
        }
        var6.reverse();
        if (param1 != -12382) {
          return (String) null;
        }
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    public final void a(eb param0, int param1, int param2, int param3, int param4) {
        try {
          if (this.field_X == param0) {
            this.k(126);
          }
          int var6_int = 102 % ((-5 - param4) / 57);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "hi.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final eb a(boolean param0, String param1, sc param2) {
        eb var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        eb stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new eb(param1, param2);
          if (param0) {
            field_W = (bg[]) null;
          }
          var4.field_l = (cj) ((Object) new ic());
          var5 = -6 + this.field_n;
          this.field_n = this.field_n + 38;
          var4.a(var5, (byte) 80, -16 + (-14 + this.field_p), 15, 30);
          this.b((byte) 95, var4);
          this.c(0);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("hi.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    hi(d param0, qf param1) {
        super(param0, 200, 150);
        Object var3 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        gl var4 = null;
        try {
          var3 = null;
          if (u.field_d == param1) {
            var3 = ra.field_h;
          } else {
            if (ql.field_e != param1) {
              if (param1 == gi.field_r) {
                this.field_n = this.field_n + 30;
                var3 = va.field_a;
              }
            } else {
              var3 = tb.field_i;
              this.field_n = this.field_n + 10;
              if (ea.a(-20512)) {
                var3 = nf.field_a;
                this.field_n = this.field_n + 20;
              }
            }
          }
          var4 = new gl((String) (var3), (sc) null);
          var4.field_n = 80;
          var4.field_u = 50;
          var4.field_p = this.field_p;
          var4.field_w = 0;
          var4.field_l = (cj) ((Object) new fd(ra.field_l, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.b((byte) 95, var4);
          this.field_X = this.a(false, te.field_e, (sc) (this));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("hi.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qk.a((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public static void l(int param0) {
        field_Z = null;
        if (param0 != 0) {
          hi.a(-21L, -41);
          field_Y = null;
          field_W = null;
          return;
        }
        field_Y = null;
        field_W = null;
    }

    static {
        field_Y = " cost: 14tus";
        field_Z = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
