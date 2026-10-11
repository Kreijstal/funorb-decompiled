/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ta extends jc {
    private int field_X;
    static cc field_eb;
    private td field_Y;
    private int field_gb;
    private int field_ab;
    private int field_cb;
    private n field_W;
    private int field_bb;
    static String field_fb;
    static qj field_hb;
    private lk field_db;
    static double field_Z;
    static String[] field_ib;

    final static int a(int param0, CharSequence param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Main.field_T;
        try {
          var2_int = param1.length();
          var3 = 105 / ((param0 - 12) / 45);
          var4 = 0;
          for (var5 = 0; var5 < var2_int; var5++) {
            var4 = ec.a((byte) -123, param1.charAt(var5)) + (var4 << 5) - var4;
          }
          stackIn_5_0 = var4;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("ta.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    boolean a(boolean param0) {
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int var3;
        var3 = Main.field_T;
        if (!param0) {
          return true;
        }
        if (null != this.field_Y) {
          if (rb.field_h != this.field_Y) {
            if (this.field_Y == jk.field_b) {
              fieldTemp$6 = this.field_ab + 1;
              this.field_ab = this.field_ab + 1;
              if (this.field_X == fieldTemp$6) {
                this.field_W.field_A = 256;
                this.field_Y = null;
              } else {
                this.field_W.field_A = (this.field_ab << 8) / this.field_X;
              }
            }
          } else {
            fieldTemp$7 = this.field_ab + 1;
            this.field_ab = this.field_ab + 1;
            if (fieldTemp$7 == this.field_bb) {
              this.field_Y = aj.field_q;
              this.a((byte) -36, 12 + this.field_db.field_h, this.field_cb + 12 + this.field_db.field_q, this.field_gb);
              this.field_ab = 0;
              this.field_W.field_A = 0;
            } else {
              this.field_W.field_A = -((this.field_ab << 8) / this.field_bb) + 256;
            }
          }
        }
        return super.a(true);
    }

    private final void c(int param0, lk param1) {
        if (null != this.field_W) {
          this.field_W.c(90);
        }
        if (param0 != 0) {
          return;
        }
        try {
          if (param1 == null) {
            this.field_W = new n();
          } else {
            param1.a(param1.field_q, this.field_cb + 6, param1.field_h, 6, true);
            this.field_W = new n(param1);
          }
          this.b(this.field_W, (byte) 118);
          this.field_db = null;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ta.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean o(int param0) {
        this.q(0);
        if (param0 != 928516712) {
          return true;
        }
        return super.o(928516712);
    }

    boolean a(char param0, byte param1, int param2, lk param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, (byte) -114, param2, param3)) {
            return true;
          }
          if (param1 > -99) {
            this.field_W = (n) null;
          }
          if (null != this.field_W) {
            if (param2 == 98) {
              this.field_W.a(123, param3);
            }
            if (99 != param2) {
              return false;
            }
            this.field_W.a(117, param3);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("ta.S(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final void d(byte param0) {
        if (this.field_Y == rb.field_h) {
          return;
        }
        this.field_Y = jk.field_b;
        if (param0 > -29) {
          return;
        }
        this.field_ab = 0;
        this.c(0, this.field_db);
        this.field_db = null;
        this.field_W.field_A = 0;
    }

    final static void c(boolean param0) {
        dg.field_H.field_b = 0;
        if (!param0) {
          return;
        }
        dg.field_H.field_l = 0;
    }

    public static void e(byte param0) {
        field_fb = null;
        int var1 = -62 % ((param0 - 58) / 50);
        field_ib = null;
        field_hb = null;
        field_eb = null;
    }

    ta(j param0, lk param1, int param2, int param3, int param4) {
        super(param0, param1.field_h + 12, param1.field_q + (12 + param2));
        try {
          this.field_X = param3;
          this.field_bb = param3;
          this.field_gb = param4;
          this.field_cb = param2;
          this.c(0, param1);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ta.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final void q(int param0) {
        if (null != this.field_Y) {
          if (jk.field_b != this.field_Y) {
            this.a(this.field_cb + (12 + this.field_db.field_q), this.field_db.field_h + 12, ~param0);
            this.c(0, this.field_db);
          }
          this.field_Y = null;
          this.field_W.field_A = 256;
        }
        super.q(param0);
    }

    void c(lk param0, byte param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 < 28) {
            return;
          }
          this.field_db = param0;
          if (this.field_Y != aj.field_q) {
            if (rb.field_h != this.field_Y) {
              this.field_Y = rb.field_h;
              this.field_ab = 0;
            }
          } else {
            this.a((byte) -86, this.field_db.field_h + 12, 12 + this.field_cb + this.field_db.field_q, this.field_gb);
            this.field_ab = 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ta.J(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_fb = "This password contains repeated characters, and would be easy to guess";
        field_eb = new cc();
        field_Z = Math.atan2(1.0, 0.0);
        field_ib = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
    }
}
