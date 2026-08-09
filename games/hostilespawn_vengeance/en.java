/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class en extends vi {
    static bd field_q;
    private gi field_r;
    static String field_v;
    private int field_x;
    static bd field_y;
    static bd field_t;
    static ji field_u;
    static int field_s;
    static String field_z;
    static bd field_w;

    final static bd[] h(int param0, int param1) {
        bd[] var2;
        bd[] var3;
        var3 = new bd[9];
        var2 = var3;
        var3[4] = el.a(-106, 64, param1);
        if (param0 >= -7) {
          en.r(117);
          return var2;
        } else {
          return var2;
        }
    }

    en(byte[] param0) {
        super(param0);
    }

    en(int param0) {
        super(param0);
    }

    final void a(int[] param0, int param1) {
        try {
            if (param1 != 8) {
                this.c(true);
            }
            this.field_r = new gi(param0);
        } catch (RuntimeException runtimeException) {
            throw wg.a((Throwable) ((Object) runtimeException), "en.FB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int a(int param0, boolean param1) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = HostileSpawn.field_I ? 1 : 0;
        var3 = this.field_x >> -1480227389;
        if (param1) {
          var4 = -(7 & this.field_x) + 8;
          this.field_x = this.field_x + param0;
          var5 = 0;
          L0: while (true) {
            if (var4 >= param0) {
              L1: {
                if (param0 != var4) {
                  var5 = var5 + (this.field_n[var3] >> -param0 + var4 & pf.field_j[param0]);
                  break L1;
                } else {
                  var5 = var5 + (pf.field_j[var4] & this.field_n[var3]);
                  break L1;
                }
              }
              return var5;
            } else {
              incrementValue$2 = var3;
              var3++;
              var5 = var5 + ((this.field_n[incrementValue$2] & pf.field_j[var4]) << -var4 + param0);
              param0 = param0 - var4;
              var4 = 8;
              continue L0;
            }
          }
        } else {
          field_z = (String) null;
          var4 = -(7 & this.field_x) + 8;
          this.field_x = this.field_x + param0;
          var5 = 0;
          L2: while (true) {
            if (var4 >= param0) {
              L3: {
                if (param0 != var4) {
                  var5 = var5 + (this.field_n[var3] >> -param0 + var4 & pf.field_j[param0]);
                  break L3;
                } else {
                  var5 = var5 + (pf.field_j[var4] & this.field_n[var3]);
                  break L3;
                }
              }
              return var5;
            } else {
              incrementValue$3 = var3;
              var3++;
              var5 = var5 + ((this.field_n[incrementValue$3] & pf.field_j[var4]) << -var4 + param0);
              param0 = param0 - var4;
              var4 = 8;
              continue L2;
            }
          }
        }
    }

    final void c(boolean param0) {
        byte[] var3;
        if (param0) {
          var3 = (byte[]) null;
          this.a(0, 102, (byte[]) null, (byte) 55);
          this.field_x = 8 * this.field_i;
          return;
        } else {
          this.field_x = 8 * this.field_i;
          return;
        }
    }

    public static void r(int param0) {
        if (param0 != -10723) {
          return;
        } else {
          field_z = null;
          field_w = null;
          field_u = null;
          field_v = null;
          field_y = null;
          field_q = null;
          field_t = null;
          return;
        }
    }

    final void q(int param0) {
        int var2 = -24 % ((55 - param0) / 40);
        this.field_i = (this.field_x - -7) / 8;
    }

    final int p(int param0) {
        int fieldTemp$1 = 0;
        if (param0 != 64) {
          return 42;
        } else {
          fieldTemp$1 = this.field_i;
          this.field_i = this.field_i + 1;
          return this.field_n[fieldTemp$1] + -this.field_r.a(true) & 255;
        }
    }

    final void a(int param0, int param1, byte[] param2, byte param3) {
        int fieldTemp$2 = 0;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = 0;
              if (param3 > 66) {
                break L1;
              } else {
                this.field_r = (gi) null;
                break L1;
              }
            }
            L2: while (true) {
              if (param1 <= var5_int) {
                break L0;
              } else {
                fieldTemp$2 = this.field_i;
                this.field_i = this.field_i + 1;
                param2[var5_int + param0] = (byte)(this.field_n[fieldTemp$2] + -this.field_r.a(true));
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("en.EB(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw wg.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    final void i(int param0, int param1) {
        int fieldTemp$1 = this.field_i;
        this.field_i = this.field_i + 1;
        this.field_n[fieldTemp$1] = (byte)(this.field_r.a(true) + param1);
        if (param0 == 19319) {
          return;
        } else {
          this.field_x = -13;
          return;
        }
    }

    static {
        field_v = "Destroy the spawn queen.";
        field_y = new bd(8, 13);
        kf.a(field_y.field_D, 0, 64, 8421376);
        field_q = new bd(8, 13);
        kf.a(field_q.field_D, 0, 64, 16776960);
        field_t = new bd(8, 13);
        kf.a(field_t.field_D, 0, 64, 65793);
        field_z = "Please check if address is correct";
    }
}
