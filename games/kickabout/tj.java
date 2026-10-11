/*
 * Decompiled by CFR-JS 0.4.0.
 */
class tj extends mo {
    int field_j;
    int field_i;
    int field_q;
    boolean field_y;
    int field_o;
    int field_h;
    int field_v;
    int field_A;
    static ff field_z;
    int field_l;
    int field_t;
    static boolean field_u;
    static kg[] field_f;
    boolean field_x;
    boolean field_k;
    static String field_g;
    static String[][] field_w;
    int field_r;
    int field_s;
    int field_n;
    int field_m;
    int field_p;

    public static void f(int param0) {
        field_w = (String[][]) null;
        field_f = null;
        field_g = null;
        if (param0 != 0) {
          return;
        }
        field_z = null;
    }

    final int d(int param0) {
        int var3 = 18 / ((81 - param0) / 37);
        int var2 = 0;
        var2 = fj.a(-40, var2 ^ this.field_t);
        var2 = fj.a(-40, this.field_p ^ var2);
        var2 = fj.a(-40, this.field_v ^ var2);
        var2 = fj.a(-40, this.field_q ^ var2);
        var2 = fj.a(-40, var2 ^ this.field_h);
        var2 = fj.a(-40, var2 ^ this.field_n);
        var2 = fj.a(-40, this.field_m ^ var2);
        var2 = fj.a(-40, this.field_s ^ var2);
        var2 = fj.a(-40, var2 ^ this.field_r);
        var2 = fj.a(-40, this.field_A ^ var2);
        var2 = fj.a(-40, this.field_l ^ var2);
        return var2;
    }

    void a(int param0, int param1, byte param2, int param3) {
        if (param2 == 26) {
          this.field_t = param0;
          this.field_n = 0;
          this.field_p = param3;
          this.field_v = param1;
          this.field_q = 0;
          this.field_h = 0;
          return;
        }
    }

    public final String toString() {
        StringBuilder var2 = new StringBuilder("AgentBall p=[");
        eh.a(this.field_t, 100, var2);
        StringBuilder discarded$0 = var2.append(",");
        eh.a(this.field_p, 100, var2);
        StringBuilder discarded$1 = var2.append(",");
        eh.a(this.field_v, 100, var2);
        StringBuilder discarded$2 = var2.append("]\tv=[");
        eh.a(this.field_q, 100, var2);
        StringBuilder discarded$3 = var2.append(",");
        eh.a(this.field_h, 100, var2);
        StringBuilder discarded$4 = var2.append(",");
        eh.a(this.field_n, 100, var2);
        StringBuilder discarded$5 = var2.append("]\tposessor=" + this.field_m + "/" + this.field_s);
        StringBuilder discarded$6 = var2.append("\tuncatchable=" + this.field_r);
        StringBuilder discarded$7 = var2.append("\thigh_friction=" + this.field_A);
        StringBuilder discarded$8 = var2.append("\tmodel_id=" + this.field_l);
        return var2.toString();
    }

    final static void a(String param0, java.applet.Applet param1, byte param2, long param3, String param4) {
        try {
          RuntimeException stackIn_11_0 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var6 = null;
          RuntimeException var6_ref = null;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var7Lifetime1;
          String var7Lifetime2;
          String var7Lifetime3;
          String var7Lifetime4;
          try {
            try {
              var8 = param1.getParameter("cookiehost");
              var7 = var8;
              var7Lifetime1 = var8;
              var9 = param4 + "=" + param0 + "; version=1; path=/; domain=" + var8;
              var7Lifetime2 = var9;
              var7Lifetime3 = var9;
              if (param2 != -5) {
                field_u = false;
              }
              if (param3 < 0L) {
                var7Lifetime4 = var9 + "; Discard;";
              } else {
                var7Lifetime4 = var9 + "; Expires=" + rj.a(nj.a(-121) + 1000L * param3, -102) + "; Max-Age=" + param3;
              }
              mm.a("document.cookie=\"" + var7Lifetime4 + "\"", param1, (byte) 24);
              return;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6 = decompiledCaughtException;
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var6_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var6_ref;
            stackIn_11_1 = new StringBuilder().append("tj.I(");
            if (param0 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
            if (param1 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw nb.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final int b(boolean param0) {
        if (!param0) {
          return 99;
        }
        return this.field_v >> 16;
    }

    final int a(boolean param0) {
        if (!param0) {
          this.field_p = 99;
          return this.field_t >> 16;
        }
        return this.field_t >> 16;
    }

    final int e(int param0) {
        int var2 = this.field_q >> 8;
        int var3 = this.field_h >> 8;
        int var4 = -84 / ((-60 - param0) / 39);
        return var3 * var3 + var2 * var2;
    }

    final int c(int param0) {
        if (param0 != 879306160) {
          return 87;
        }
        return this.field_p >> 16;
    }

    final void c(ml param0, int param1) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (mu.a(param0, (byte) -39)) {
            this.field_m = -1 + param0.l(2, param1 ^ 42);
            this.field_s = param0.l(3, 59);
          }
          if (param1 != 17) {
            return;
          }
          if (mu.a(param0, (byte) -39)) {
            this.field_t = this.field_t + ew.a((byte) 125, 17, param0, 0, 22, 30);
            this.field_p = this.field_p + ew.a((byte) 125, 17, param0, 0, 22, 30);
            this.field_v = this.field_v + ew.a((byte) 125, 20, param0, 0, 24, 30);
            this.field_q = this.field_q + ew.a((byte) 125, 11, param0, 0, 16, 30);
            this.field_h = this.field_h + ew.a((byte) 125, 11, param0, 0, 16, 30);
            this.field_n = this.field_n + ew.a((byte) 125, 18, param0, 0, 24, 30);
          }
          if (!mu.a(param0, (byte) -39)) {
            return;
          }
          this.field_r = hq.a(22531, 9, param0, 0);
          this.field_A = hq.a(22531, 5, param0, 0);
          this.field_l = param0.l(4, 59);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("tj.F(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(ml param0, byte param1) {
        int discarded$0 = 0;
        try {
          this.field_m = param0.l(2, 59) - 1;
          this.field_s = param0.l(3, 59);
          this.field_t = param0.l(32, 59);
          this.field_p = param0.l(32, 59);
          this.field_v = param0.l(32, 59);
          this.field_q = param0.l(32, 59);
          this.field_h = param0.l(32, 59);
          this.field_n = param0.l(32, 59);
          this.field_r = param0.l(10, 59);
          this.field_A = param0.l(5, 59);
          if (param1 >= -94) {
            discarded$0 = this.b(false);
          }
          this.field_l = param0.l(4, 59);
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "tj.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final boolean g(int param0) {
        int var2 = 58 / ((param0 + 51) / 54);
        if (this.field_r != 0) {
          return false;
        }
        if (this.b(true) >= 30) {
          return false;
        }
        if (0 > this.field_p) {
          return false;
        }
        if (this.field_p <= 88080384) {
          return true;
        }
        return false;
    }

    final void a(byte param0, mo param1) {
        tj var5 = null;
        try {
          var5 = (tj) (param1);
          this.field_m = var5.field_m;
          this.field_n = var5.field_n;
          this.field_s = var5.field_s;
          this.field_l = var5.field_l;
          this.field_o = var5.field_o;
          this.field_v = var5.field_v;
          if (param0 > -52) {
            ml var4 = (ml) null;
            this.c((ml) null, -54);
          }
          this.field_t = var5.field_t;
          this.field_q = var5.field_q;
          this.field_p = var5.field_p;
          this.field_A = var5.field_A;
          this.field_r = var5.field_r;
          this.field_i = var5.field_i;
          this.field_h = var5.field_h;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "tj.R(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    void a(byte param0, int param1, la[] param2) {
        int stackIn_14_0 = 0;
        long stackIn_17_0 = 0L;
        long stackIn_38_0 = 0L;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_47_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        long var6 = 0L;
        long var8 = 0L;
        long var11 = 0L;
        int var13 = 0;
        int[] var17 = null;
        try {
          this.field_x = false;
          if (this.field_r > 0) {
            this.field_r = this.field_r - 1;
          }
          this.field_y = false;
          this.field_k = false;
          if (this.field_A > 0) {
            this.field_A = this.field_A - 1;
          }
          var4_int = 90 / ((-3 - param0) / 59);
          this.field_j = -1;
          if (this.field_m != -1) {
            return;
          }
          if (this.field_p >= -65536) {
            stackIn_14_0 = (this.field_p > 88145920) ? 1 : 0;
          } else {
            stackIn_14_0 = 1;
          }
          var5 = stackIn_14_0;
          stackIn_17_0 = (var5 != 0) ? 2000L : 58982L;
          var6 = stackIn_17_0;
          var8 = jk.field_m[param1];
          var17 = lt.a(this.field_q, this.field_h, param2, -66, this.field_v, this.field_p, this.field_t, this.field_n);
          this.field_v = var17[2];
          this.field_t = var17[0];
          this.field_p = var17[1];
          if (this.field_q != var17[3]) {
            this.field_q = jw.a(var6, var17[3], (byte) 115);
            this.field_y = true;
          }
          if (this.field_h != var17[4]) {
            this.field_h = jw.a(var6, var17[4], (byte) 119);
            this.field_y = true;
          }
          if (var17[5] != this.field_n) {
            this.field_n = d.a(true, jw.a(var8, var17[5], (byte) 105));
            if (this.field_n == 0) {
              this.field_v = 0;
            }
            this.field_k = true;
          }
          if (this.field_q == 0 &&
            this.field_h == 0 &&
            this.field_n == 0 &&
            this.field_v == 0) {
            return;
          }
          if (this.field_A > 10) {
            stackIn_38_0 = 60293L;
          } else {
            if (this.field_v >= 65536) {
              stackIn_38_0 = sg.field_d[param1];
            } else {
              stackIn_38_0 = en.field_q[param1];
            }
          }
          var11 = stackIn_38_0;
          this.field_q = (int)(var11 * (long)this.field_q >> 16);
          this.field_h = (int)((long)this.field_h * var11 >> 16);
          if (this.field_v > 0) {
            this.field_n = this.field_n - 16384;
          }
          var13 = this.e(-128);
          if (4096 <= var13) {
            return;
          }
          this.field_h = 0;
          this.field_q = 0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_46_0 = var4;
          stackIn_46_1 = new StringBuilder().append("tj.JA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_47_2 = "null";
          } else {
            stackIn_47_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_46_0), ((StringBuilder) (Object) stackIn_46_1).append(stackIn_47_2).append(')').toString());
        }
    }

    public tj() {
        this.field_j = -1;
        this.field_o = -1;
        this.field_s = 0;
        this.field_i = -1;
        this.field_m = -1;
        this.field_A = 0;
    }

    static {
        field_z = new ff(14, 0, 4, 1);
        field_u = false;
        field_g = "Move";
        field_w = new String[][]{new String[]{"<img=0>Use the 'Bid' button on a lot to submit a bid. <col=ffff00>There are no refunds! Once submitted, your bid cannot be retracted.</col>", "<img=0>The bid price is automatically set by the auction house. To outbid somebody, you must offer 10% more than them.", "<img=0>If the option is available, click the 'Buyout' button to instantly purchase a character for a set price.", "<img=0>The Auction House takes a <col=ffff00>10%<nbsp>commission</col> on all auctions sold."}, new String[]{"<img=0>Characters you are bidding on appear in your team grid under a green hammer icon. They cannot be used in-game; the slot is reserved for them, should you win the auction.", "<img=0>Characters you are selling appear in your team grid under a red hammer icon. They cannot be used in-game."}};
    }
}
