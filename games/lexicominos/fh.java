/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fh {
    static boolean field_i;
    le field_p;
    static long field_g;
    int field_n;
    private int field_o;
    rd field_b;
    int field_d;
    int field_l;
    private boolean field_q;
    int field_h;
    int field_e;
    int field_c;
    rd field_a;
    rd field_f;
    rd field_j;
    int field_k;
    rd field_m;

    final void a(le param0, int param1) {
        ik var18 = null;
        lh var4 = null;
        db[] var5 = null;
        pi var17 = null;
        pi var19 = null;
        int var7_int = 0;
        lh var6 = null;
        lh var7 = null;
        ib discarded$0 = null;
        og discarded$1 = null;
        lh var8 = null;
        db[] var9 = null;
        db[] var10 = null;
        db dupTemp$2 = null;
        lh var12 = null;
        lh var13 = null;
        db var14 = null;
        lh var15 = null;
        lh var20 = null;
        int var16 = Lexicominos.field_L ? 1 : 0;
        try {
            var18 = new ik(param0, 2, 2, 2236962, 1, 1, 1, 2 + (param0.field_G + param0.field_E));
            this.field_m = (rd) ((Object) var18);
            var18.field_e = 16777215;
            var4 = new lh();
            var18.a(var4, false);
            this.field_h = 5592405;
            this.field_n = 3;
            var4.field_l = 11711154;
            this.field_c = 15658734;
            this.field_p = param0;
            this.field_l = -1;
            var4.field_c = 15658734;
            this.field_o = 15658734;
            this.field_d = 3;
            this.field_e = 3;
            this.field_k = 3;
            var4.a(false, 0).a(15658734, (byte) -81).a((byte) -114, gj.a(10066329, 8947848, false, 7829367));
            var4.a(false, 1).a((byte) -123, gj.a(10066329, 11184810, false, 13421772));
            var4.a(false, 3).a((byte) -126, gj.a(7829367, 8947848, false, 10066329)).a(1, -94).b((byte) 68, 1);
            var5 = new db[9];
            var17 = new pi(32, 32);
            var19 = var17;
            for (var7_int = 0; var19.field_y.length > var7_int; var7_int++) {
                var17.field_y[var7_int] = 1077952576;
            }
            var5[4] = (db) ((Object) var19);
            var4.a(false, 4).a(true, 124).a((byte) -105, var5);
            var4.a(false, 5).a((byte) -105, c.a(0, 65793, 0, 0, 84)).a(true, 116).a(-1, (byte) -116);
            this.field_f = (rd) ((Object) var4);
            var6 = new lh(var4, true);
            var6.field_p = 0;
            var7 = new lh(var4, true);
            var7.field_p = 0;
            var7.a(jg.a(8947848, 4), (byte) -112);
            var7.a(false, 1).a((byte) -119, jg.a(11184810, 4)).a(2236962, (byte) -86);
            this.field_b = (rd) ((Object) new fb(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
            discarded$0 = new ib(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
            discarded$1 = new og(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
            var8 = new lh();
            var18.a(var8, false);
            var8.a(false, 0).a((byte) -114, gj.a(7829367, 15658734, false, 10066329)).a(1118481, (byte) -127).a((byte) 101, -1);
            var8.a(false, 4).a(true, 115).a((byte) -115, var5);
            this.field_a = (rd) ((Object) var8);
            int var11 = 103 % ((param1 - 10) / 32);
            var9 = new db[9];
            var10 = new db[9];
            var9[4] = new db(2, 1);
            var10[4] = new db(1, 2);
            dupTemp$2 = var9[4];
            dupTemp$2.field_y = new int[]{6710886, 7829367};
            var10[4].field_y = new int[]{6710886, 7829367};
            var12 = new lh();
            var13 = new lh();
            var12.a(var9, false, 0);
            var13.a(var10, false, 0);
            var14 = new db(7, 4);
            var14.field_y = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
            var15 = new lh(var4, true);
            var15.a(-10, var14.c());
            var14.a();
            var15 = new lh(var4, true);
            var15.a(30, var14.c());
            var14.a();
            var15 = new lh(var4, true);
            var15.a(-118, var14.c());
            var14.a();
            var20 = new lh(var4, true);
            var20.a(-102, var14);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "fh.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        lf.c(param4, param2, param1, param3, param6, param0);
        if (param5 != 5092) {
            this.a(73, -8, 37, -27, 112, 75, -68);
        }
    }

    private final void a(byte param0, int param1, int param2, String param3) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        var15 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = this.field_d - -this.field_e;
              var6 = this.field_k + this.field_n;
              var7 = this.field_l;
              if (var7 != -1) {
                break L1;
              } else {
                var7 = this.field_p.field_G + this.field_p.field_E;
                break L1;
              }
            }
            L2: {
              L3: {
                var8 = lf.field_f >> -1340441214;
                var9 = this.field_p.b(param3);
                var10 = this.field_p.field_E - -this.field_p.field_G;
                var11 = 1;
                if (var8 < var9) {
                  break L3;
                } else {
                  if (param3.indexOf("<br>") == -1) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (var9 > var8) {
                  var13 = var9 / var8;
                  var12 = (-1 + var9 % var8 - -var13) / var13 * 2 + var8;
                  break L4;
                } else {
                  var12 = var8;
                  break L4;
                }
              }
              L5: {
                if (ob.field_f != null) {
                  break L5;
                } else {
                  ob.field_f = new String[16];
                  break L5;
                }
              }
              var11 = this.field_p.a(param3, new int[]{var12}, ob.field_f);
              var10 = var10 + var7 * (-1 + var11);
              var9 = 0;
              var13 = 0;
              L6: while (true) {
                if (var13 >= var11) {
                  break L2;
                } else {
                  L7: {
                    var14 = this.field_p.b(ob.field_f[var13]);
                    if ((var14 ^ -1) < (var9 ^ -1)) {
                      var9 = var14;
                      break L7;
                    } else {
                      break L7;
                    }
                  }
                  var13++;
                  continue L6;
                }
              }
            }
            L8: {
              var12 = param1;
              if (lf.field_f >= var5_int + var12 - -var9) {
                break L8;
              } else {
                var12 = -var5_int + lf.field_f + -var9;
                break L8;
              }
            }
            L9: {
              var13 = param2 + (-this.field_p.field_t + 32);
              if (lf.field_a >= var10 + var13 + var6) {
                break L9;
              } else {
                var13 = param2 - var10 - var6;
                break L9;
              }
            }
            L10: {
              lf.c(var12, var13, var5_int + var9, var10 - -var6, this.field_c);
              lf.a(1 + var12, 1 + var13, var5_int + var9 + -2, var6 + (var10 - 2), this.field_h);
              if (param0 == -37) {
                break L10;
              } else {
                this.field_e = 36;
                break L10;
              }
            }
            this.field_p.a(param3, var12 + this.field_d, var13 - -this.field_k, var9, var10, this.field_o, -1, 0, 0, var7);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var5 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var5);

            stackIn_28_1 = new StringBuilder().append("fh.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L11;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L11;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3, int param4, int param5) {
        if (param0 != 10) {
            String var8 = (String) null;
            this.a(-18, 5, -60, (String) null);
        }
        lf.b(param4, param5, param3, param1, param2);
    }

    private final void a(int param0, int param1, int param2, String param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              var5_int = this.field_p.b(param3);
              var6 = this.field_p.field_G + this.field_p.field_t;
              var7 = param2;
              if (6 + var7 + var5_int <= lf.field_f) {
                break L1;
              } else {
                var7 = -var5_int + (lf.field_f + -6);
                break L1;
              }
            }
            L2: {
              var8 = -this.field_p.field_t + param1 - -32;
              if (lf.field_a >= 6 + (var8 - -var6)) {
                break L2;
              } else {
                var8 = -6 + (lf.field_a - var6);
                break L2;
              }
            }
            L3: {
              lf.c(var7, var8, var5_int - -6, 6 + var6, this.field_o);
              lf.a(1 + var7, var8 - -1, var5_int + 4, 4 + var6, this.field_h);
              this.field_p.b(param3, var7 + 3, this.field_p.field_t + var8 + 3, this.field_o, -1);
              if (param0 <= -8) {
                break L3;
              } else {
                var9 = (String) null;
                this.a((byte) -8, 96, -90, (String) null);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("fh.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L4;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final void a(int param0, int param1, String param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (param0 == 7829367) {
                break L1;
              } else {
                this.field_b = (rd) null;
                break L1;
              }
            }
            L2: {
              if (this.field_q) {
                this.a((byte) -37, param3, param1, param2);
                break L2;
              } else {
                this.a(-41, param1, param3, param2);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("fh.C(").append(param0).append(',').append(param1).append(',');

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
          throw ld.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param3 + ')');
        }
    }

    public fh() {
        this.field_q = true;
    }

    static {
    }
}
