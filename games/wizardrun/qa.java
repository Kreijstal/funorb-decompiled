/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa extends ll {
    static int field_s;
    static lg field_r;
    private la field_p;
    private la[] field_t;
    static oi field_q;

    final void a(byte param0, o[] param1) {
        int var4 = 0;
        la[] var3 = null;
        la var5 = null;
        int var6 = 0;
        la[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = wizardrun.field_H;
        try {
          if (param0 != 11) {
            return;
          }
          var7 = this.field_t;
          var3 = var7;
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_j = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("qa.CA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    qa(qa param0, boolean param1) {
        this();
        try {
          param0.a(0, param1, this);
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "qa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final la a(int param0, int param1) {
        if (param0 != 0) {
          qa.c(23);
        }
        la dupTemp$0 = new la();
        this.field_t[param1] = dupTemp$0;
        return dupTemp$0;
    }

    public static void b(int param0) {
        field_r = null;
        field_q = null;
        if (param0 != -10059) {
          field_q = (oi) null;
        }
    }

    final static void c(int param0) {
        if (jd.field_f != -pe.field_B + 0 &&
          250 - pe.field_B != jd.field_f) {
        }
        if (param0 != 250) {
          field_q = (oi) null;
        }
        jd.field_f = jd.field_f + 1;
    }

    public qa() {
        this.field_t = new la[6];
        this.field_p = new la();
        la dupTemp$0 = new la();
        this.field_t[0] = dupTemp$0;
        la var1 = dupTemp$0;
        var1.a(0);
    }

    final void a(int param0, o[] param1, byte param2) {
        int var5 = 0;
        try {
          int var4_int = -120 / ((43 - param2) / 36);
          var5 = param0;
          if (this.field_t[var5] == null) {
            this.field_t[var5] = new la();
          }
          this.field_t[param0].field_j = param1;
        } catch (RuntimeException runtimeException) {
          throw bd.a((Throwable) ((Object) runtimeException), "qa.DA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(byte param0, o param1) {
        int var4 = 0;
        la[] var3 = null;
        la var5 = null;
        int var6 = 0;
        la[] var7 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var6 = wizardrun.field_H;
        try {
          if (param0 < 46) {
            this.a(-74, -15);
          }
          var7 = this.field_t;
          var3 = var7;
          for (var4 = 0; var4 < var7.length; var4++) {
            var5 = var7[var4];
            if (var5 != null) {
              var5.field_i = param1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_12_0 = var3_ref;
          stackIn_12_1 = new StringBuilder().append("qa.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1, qa param2) {
        int var4_int = 0;
        la dupTemp$0 = null;
        la stackIn_9_0 = null;
        la stackIn_10_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        la var5 = null;
        la var6 = null;
        int var7 = 0;
        var7 = wizardrun.field_H;
        try {
          super.a(param2, param0);
          if (param1) {
            for (var4_int = 0; var4_int < 6; var4_int++) {
              var5 = this.field_t[var4_int];
              if (var5 != null) {
                var6 = param2.field_t[var4_int];
                stackIn_9_0 = var5;
                if (var6 == null) {
                  dupTemp$0 = new la();
                  param2.field_t[var4_int] = dupTemp$0;
                  stackIn_10_1 = dupTemp$0;
                } else {
                  stackIn_10_1 = var6;
                }
                ((la) (Object) stackIn_9_0).a(stackIn_10_1, (byte) -26);
              } else {
                param2.field_t[var4_int] = null;
              }
            }
            return;
          }
          g.a(this.field_t, 0, param2.field_t, 0, 6);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("qa.W(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public final void a(int param0, int param1, ub param2, boolean param3, boolean param4) {
        ub stackIn_3_0 = null;
        la stackIn_33_0 = null;
        ub stackIn_33_1 = null;
        boolean stackIn_34_2 = false;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        la var7 = null;
        la var9 = null;
        pl var10 = null;
        la var11 = null;
        la var12 = null;
        la var13 = null;
        la var14 = null;
        try {
          if (!(param2 instanceof pl)) {
            stackIn_3_0 = null;
          } else {
            stackIn_3_0 = (ub) (param2);
          }
          var10 = (pl) (stackIn_3_0);
          eb.a(0, param1 - (-param2.field_l - param2.field_n), param0 + param2.field_o, param2.field_l + param1, param0 + param2.field_o + param2.field_r);
          if (var10 != null) {
            param4 = param4 & var10.field_B;
          }
          var7 = this.field_t[0];
          this.field_p.a(0);
          var7.a(param1, 83, param0, param2, this.field_p, this);
          if (!param3) {
            qa.b(9);
          }
          if (var10 != null) {
            if (var10.field_z) {
              var11 = this.field_t[1];
              if (var11 != null) {
                var11.a(param1, 100, param0, param2, this.field_p, this);
              }
            }
            if (var10.field_v) {
              var12 = this.field_t[3];
              if (var10.field_q != 0 &&
                var12 != null) {
                var12.a(param1, 90, param0, param2, this.field_p, this);
              } else {
                var9 = this.field_t[2];
                if (var9 != null) {
                  var9.a(param1, 100, param0, param2, this.field_p, this);
                }
              }
            }
          }
          if (param2.d((byte) 53)) {
            var13 = this.field_t[5];
            if (var13 != null) {
              var13.a(param1, 92, param0, param2, this.field_p, this);
            }
          }
          if (!param4) {
            var14 = this.field_t[4];
            if (var14 != null) {
              var14.a(param1, 95, param0, param2, this.field_p, this);
            }
          }
          stackIn_33_0 = this.field_p;
          stackIn_33_1 = (ub) (param2);
          stackIn_34_2 = !(param3);
          ((la) (Object) stackIn_33_0).a(stackIn_33_1, stackIn_34_2, param1, this, param0);
          bb.b(4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_38_0 = var6;
          stackIn_38_1 = new StringBuilder().append("qa.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_r = new lg();
        field_q = new oi();
    }
}
