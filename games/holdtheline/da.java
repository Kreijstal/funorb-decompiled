/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da extends th {
    static da field_p;
    private int field_q;
    private int field_t;
    static String field_s;
    private wn field_r;
    static int[] field_u;

    final void h(byte param0) {
        if (8 > this.field_t) {
            this.field_l = this.field_l + 1;
            this.field_t = 8;
        }
        if (param0 != 0) {
            field_s = (String) null;
        }
    }

    final int h(int param0, int param1) {
        int incrementValue$0 = 0;
        int var6 = HoldTheLine.field_D;
        int var3 = this.field_q >> -69987869;
        int var4 = 8 + -(this.field_q & param1);
        int var5 = 0;
        this.field_q = this.field_q + param0;
        while (param0 > var4) {
            incrementValue$0 = var3;
            var3++;
            var5 = var5 + ((vd.field_c[var4] & this.field_i[incrementValue$0]) << -var4 + param0);
            param0 = param0 - var4;
            var4 = 8;
        }
        if (param0 != var4) {
            var5 = var5 + (this.field_i[var3] >> -param0 + var4 & vd.field_c[param0]);
        } else {
            var5 = var5 + (vd.field_c[var4] & this.field_i[var3]);
        }
        return var5;
    }

    public static void m(int param0) {
        field_p = null;
        field_s = null;
        int var1 = 121 / ((29 - param0) / 58);
        field_u = null;
    }

    final void a(byte[] param0, int param1, int param2, boolean param3) {
        int fieldTemp$1 = 0;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = HoldTheLine.field_D;
        try {
          L0: {
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= param1) {
                L2: {
                  if (param3) {
                    break L2;
                  } else {
                    field_p = (da) null;
                    break L2;
                  }
                }
                break L0;
              } else {
                fieldTemp$1 = this.field_l;
                this.field_l = this.field_l + 1;
                param0[param2 + var5_int] = (byte)(this.field_i[fieldTemp$1] + -this.field_r.c(256));
                var5_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("da.K(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void c(byte param0, int param1) {
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        this.field_i[fieldTemp$0] = (byte)(param1 + this.field_r.c(wb.a((int) param0, 289)));
        if (param0 != 33) {
            this.field_q = -105;
        }
    }

    final void a(int param0, int param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$2 = 0;
        int var5 = HoldTheLine.field_D;
        param2 = param2 & vd.field_c[param1];
        int var4 = 39 % ((14 - param0) / 57);
        while (this.field_t < param1) {
            param1 = param1 - this.field_t;
            fieldTemp$0 = this.field_l;
            this.field_l = this.field_l + 1;
            this.field_i[fieldTemp$0] = (byte)(this.field_i[fieldTemp$0] + (param2 >>> param1));
            this.field_i[this.field_l] = (byte) 0;
            this.field_t = 8;
        }
        if (param1 == this.field_t) {
            fieldTemp$2 = this.field_l;
            this.field_l = this.field_l + 1;
            this.field_i[fieldTemp$2] = (byte)(this.field_i[fieldTemp$2] + param2);
            this.field_i[this.field_l] = (byte) 0;
            this.field_t = 8;
        } else {
            this.field_t = this.field_t - param1;
            this.field_i[this.field_l] = (byte)(this.field_i[this.field_l] + (param2 << this.field_t));
        }
    }

    final void l(int param0) {
        if (param0 > -6) {
            this.field_r = (wn) null;
        }
        this.field_l = (this.field_q - -7) / 8;
    }

    final void i(byte param0) {
        this.field_i[this.field_l] = (byte)param0;
        this.field_t = 8;
    }

    final static void a(boolean param0, String param1, int param2) {
        gn.field_g = param0;
        aa.field_k = true;
        if (param2 != 22676) {
            return;
        }
        try {
            sb.field_c = new ab(ka.field_b, de.field_I, param1, ci.field_o, gn.field_g);
            ka.field_b.a(sb.field_c, false);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "da.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int[] param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              this.field_r = new wn(param0);
              if (!param1) {
                break L1;
              } else {
                this.g((byte) 92);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("da.B(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ',' + param1 + ')');
        }
    }

    final void e(boolean param0) {
        if (!param0) {
            field_u = (int[]) null;
        }
        this.field_q = this.field_l * 8;
    }

    da(int param0) {
        super(param0);
    }

    final int g(byte param0) {
        int var2 = 82 % ((param0 - 21) / 52);
        int fieldTemp$0 = this.field_l;
        this.field_l = this.field_l + 1;
        return this.field_i[fieldTemp$0] - this.field_r.c(256) & 255;
    }

    da(byte[] param0) {
        super(param0);
    }

    static {
        field_s = "Resume";
    }
}
