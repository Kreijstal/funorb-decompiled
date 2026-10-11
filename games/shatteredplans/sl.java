/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sl extends ob {
    static String field_q;
    static nq field_p;
    static int field_r;
    private int field_n;
    static in field_m;
    private mh field_o;

    final int b(byte param0, int param1) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        int var3 = this.field_n >> 3;
        int var4Lifetime1;
        int var5Lifetime1;
        if (param0 <= 76) {
          this.i((byte) 45);
        } else {
          var4 = -(7 & this.field_n) + 8;
          var5 = 0;
          this.field_n = this.field_n + param1;
          while (var4 < param1) {
            incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((this.field_h[incrementValue$0] & rq.field_j[var4]) << -var4 + param1);
            param1 = param1 - var4;
            var4 = 8;
          }
          if (var4 != param1) {
            var5 = var5 + (this.field_h[var3] >> var4 - param1 & rq.field_j[param1]);
          } else {
            var5 = var5 + (rq.field_j[var4] & this.field_h[var3]);
          }
          return var5;
        }
        var4Lifetime1 = -(7 & this.field_n) + 8;
        var5Lifetime1 = 0;
        this.field_n = this.field_n + param1;
        while (var4Lifetime1 < param1) {
          incrementValue$1 = var3;
          var3++;
          var5Lifetime1 = var5Lifetime1 + ((this.field_h[incrementValue$1] & rq.field_j[var4Lifetime1]) << -var4Lifetime1 + param1);
          param1 = param1 - var4Lifetime1;
          var4Lifetime1 = 8;
        }
        if (var4Lifetime1 != param1) {
          var5Lifetime1 = var5Lifetime1 + (this.field_h[var3] >> var4Lifetime1 - param1 & rq.field_j[param1]);
        } else {
          var5Lifetime1 = var5Lifetime1 + (rq.field_j[var4Lifetime1] & this.field_h[var3]);
        }
        return var5Lifetime1;
    }

    final void h(int param0, int param1) {
        int fieldTemp$0 = this.field_j;
        this.field_j = this.field_j + 1;
        this.field_h[fieldTemp$0] = (byte)(this.field_o.d(13) + param0);
        if (param1 != 255) {
          field_r = -37;
        }
    }

    sl(byte[] param0) {
        super(param0);
    }

    final void b(int param0, int param1, int param2, byte[] param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          for (var5_int = param1; param0 > var5_int; var5_int++) {
            fieldTemp$0 = this.field_j;
            this.field_j = this.field_j + 1;
            param3[param2 + var5_int] = (byte)(this.field_h[fieldTemp$0] - this.field_o.d(13));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("sl.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static e j(byte param0) {
        if (param0 != 64) {
          return (e) null;
        }
        return new e(of.a((byte) 42), bo.q(-108));
    }

    public static void l(int param0) {
        field_q = null;
        if (param0 != 0) {
          field_m = (in) null;
          field_p = null;
          field_m = null;
          return;
        }
        field_p = null;
        field_m = null;
    }

    sl(int param0) {
        super(param0);
    }

    final static void a(String param0, java.applet.Applet param1, byte param2) {
        try {
          java.net.URL var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          StringBuilder stackIn_11_1 = null;
          String stackIn_12_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param2 <= 33) {
              field_p = (nq) null;
            }
            try {
              var3 = new java.net.URL(param1.getCodeBase(), param0);
              var3 = jg.a(param1, false, var3);
              ue.a(param1, true, var3.toString(), -102);
              return;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3_ref = (Exception) (Object) decompiledCaughtException;
              var3_ref.printStackTrace();
              return;
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var3_ref2;
            stackIn_8_1 = new StringBuilder().append("sl.C(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
            if (param1 == null) {
              stackIn_12_2 = "null";
            } else {
              stackIn_12_2 = "{...}";
            }
            throw r.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static lp a(int param0, int param1, fs param2, int param3) {
        RuntimeException var4 = null;
        uc var5 = null;
        ff var6 = null;
        qk var7 = null;
        lp var8 = null;
        lp stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = new lp(0, 0, 182, kb.field_y.field_o + 4);
          var5 = new uc(0, var8.field_i / 2 - 3, param3, 6, 0, param2.field_k);
          var8.a(var5, 8);
          if (param1 != -30577) {
            field_r = 123;
          }
          var6 = new ff(-(param2.field_v.field_o / 2) + param3, -(param2.field_v.field_p / 2) + var8.field_i / 2, param2.field_v);
          var8.a(var6, 8);
          var7 = new qk(-(param2.field_v.field_o / 2) + param3, var8.field_i / 2 - rs.field_Cb.field_J / 2, param2.field_v.field_o, rs.field_Cb.field_J, Integer.toString(param0));
          var8.a(var7, 8);
          stackIn_3_0 = var8;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("sl.L(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int[] param0, byte param1) {
        try {
          int var3_int = 31 / ((param1 - 45) / 58);
          this.field_o = new mh(param0);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "sl.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int h(byte param0) {
        int fieldTemp$0 = 0;
        if (param0 == 126) {
          fieldTemp$0 = this.field_j;
          this.field_j = this.field_j + 1;
          return this.field_h[fieldTemp$0] - this.field_o.d(13) & 255;
        }
        return -76;
    }

    final void m(int param0) {
        if (param0 <= -16) {
          this.field_n = this.field_j * 8;
          return;
        }
        this.h(53, 123);
        this.field_n = this.field_j * 8;
    }

    final static void a(int param0, vm param1) {
        if (param1 == null) {
          return;
        }
        try {
          mr.field_h = param1;
          ua.field_f.field_M.a(param0);
          ua.field_f.a(4, mr.field_h);
          dp.field_t = true;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "sl.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void i(byte param0) {
        this.field_j = (7 + this.field_n) / 8;
        int var2 = 126 / ((param0 - 50) / 63);
    }

    static {
        field_q = "Press TAB to chat or F10 to open Quick Chat.";
    }
}
