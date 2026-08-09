/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mi extends ed {
    private int field_z;
    private wa field_v;
    private int field_y;
    static int[] field_w;
    static String field_x;

    mi(byte[] param0) {
        super(param0);
    }

    final void a(byte param0, int param1, int param2) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int var5 = Vertigo2.field_L ? 1 : 0;
        param2 = param2 & e.field_b[param1];
        while (param1 > this.field_y) {
            param1 = param1 - this.field_y;
            fieldTemp$0 = this.field_u;
            this.field_u = this.field_u + 1;
            this.field_p[fieldTemp$0] = (byte)(this.field_p[fieldTemp$0] + (param2 >>> param1));
            this.field_p[this.field_u] = (byte) 0;
            this.field_y = 8;
        }
        int var4 = -41 / ((62 - param0) / 36);
        if (this.field_y == param1) {
            fieldTemp$1 = this.field_u;
            this.field_u = this.field_u + 1;
            this.field_p[fieldTemp$1] = (byte)(this.field_p[fieldTemp$1] + param2);
            this.field_p[this.field_u] = (byte) 0;
            this.field_y = 8;
            return;
        }
        this.field_y = this.field_y - param1;
        this.field_p[this.field_u] = (byte)(this.field_p[this.field_u] + (param2 << this.field_y));
    }

    final void d(boolean param0) {
        this.field_p[this.field_u] = (byte) 0;
        this.field_y = 8;
        if (param0) {
            mi.r(42);
        }
    }

    final void j(int param0, int param1) {
        int fieldTemp$0 = this.field_u;
        this.field_u = this.field_u + 1;
        this.field_p[fieldTemp$0] = (byte)(this.field_v.a((byte) 72) + param0);
        if (param1 <= 117) {
            this.c((byte) -52, 85);
        }
    }

    final int c(byte param0) {
        int var2 = -43 / ((param0 - -50) / 46);
        int fieldTemp$0 = this.field_u;
        this.field_u = this.field_u + 1;
        return 255 & this.field_p[fieldTemp$0] - this.field_v.a((byte) 72);
    }

    final static er[] a(String param0, r param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        er[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param1.a((byte) 126, param3);
              if (param2 == 34) {
                break L1;
              } else {
                mi.r(66);
                break L1;
              }
            }
            var5 = param1.a(var4_int, param0, 94);
            stackIn_3_0 = bk.a(var4_int, var5, param1, -2724);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("mi.VA(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final void p(int param0) {
        if (param0 != 0) {
            this.d(false);
            this.field_z = this.field_u * 8;
            return;
        }
        this.field_z = this.field_u * 8;
    }

    final int c(byte param0, int param1) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = Vertigo2.field_L ? 1 : 0;
        if (param0 < -92) {
          var3 = this.field_z >> -74625533;
          var4 = 8 + -(7 & this.field_z);
          this.field_z = this.field_z + param1;
          var5 = 0;
          L0: while (true) {
            if (param1 <= var4) {
              L1: {
                if (var4 == param1) {
                  var5 = var5 + (this.field_p[var3] & e.field_b[var4]);
                  break L1;
                } else {
                  var5 = var5 + (this.field_p[var3] >> var4 + -param1 & e.field_b[param1]);
                  break L1;
                }
              }
              return var5;
            } else {
              incrementValue$2 = var3;
              var3++;
              var5 = var5 + ((e.field_b[var4] & this.field_p[incrementValue$2]) << param1 - var4);
              param1 = param1 - var4;
              var4 = 8;
              continue L0;
            }
          }
        } else {
          field_w = (int[]) null;
          var3 = this.field_z >> -74625533;
          var4 = 8 + -(7 & this.field_z);
          this.field_z = this.field_z + param1;
          var5 = 0;
          L2: while (true) {
            if (param1 <= var4) {
              L3: {
                if (var4 == param1) {
                  var5 = var5 + (this.field_p[var3] & e.field_b[var4]);
                  break L3;
                } else {
                  var5 = var5 + (this.field_p[var3] >> var4 + -param1 & e.field_b[param1]);
                  break L3;
                }
              }
              return var5;
            } else {
              incrementValue$3 = var3;
              var3++;
              var5 = var5 + ((e.field_b[var4] & this.field_p[incrementValue$3]) << param1 - var4);
              param1 = param1 - var4;
              var4 = 8;
              continue L2;
            }
          }
        }
    }

    final void a(byte param0, int param1, byte[] param2, int param3) {
        int fieldTemp$2 = 0;
        int var5_int = 0;
        int var6 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 24) {
                break L1;
              } else {
                field_x = (String) null;
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (var5_int >= param1) {
                break L0;
              } else {
                fieldTemp$2 = this.field_u;
                this.field_u = this.field_u + 1;
                param2[param3 + var5_int] = (byte)(this.field_p[fieldTemp$2] + -this.field_v.a((byte) 72));
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var5);

            stackIn_9_1 = new StringBuilder().append("mi.WA(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw wn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param3 + ')');
        }
    }

    final void b(int[] param0, int param1) {
        try {
            if (param1 < 33) {
                this.j(40, -119);
            }
            this.field_v = new wa(param0);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) ((Object) runtimeException), "mi.CB(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void q(int param0) {
        if (!((this.field_y ^ -1) <= param0)) {
            this.field_y = 8;
            this.field_u = this.field_u + 1;
        }
    }

    final void b(byte param0) {
        this.field_u = (this.field_z + 7) / 8;
        if (param0 > -49) {
            this.field_v = (wa) null;
        }
    }

    public static void r(int param0) {
        field_w = null;
        field_x = null;
        if (param0 <= 79) {
            mi.r(84);
        }
    }

    mi(int param0) {
        super(param0);
    }

    final static void k(int param0, int param1) {
        int var2;
        int var3;
        var3 = Vertigo2.field_L ? 1 : 0;
        if (param0 == -32460) {
          m.field_B = param1;
          var2 = param1;
          if (var2 == 0) {
            pn.field_L = 1;
            be.field_q = false;
            pl.field_n = 1;
            oo.field_i = true;
            hn.field_t = false;
            cn.field_r = false;
            lf.field_C = false;
            return;
          } else {
            if (-2 == (var2 ^ -1)) {
              pl.field_n = 0;
              be.field_q = false;
              oo.field_i = true;
              lf.field_C = true;
              pn.field_L = 1;
              hn.field_t = true;
              cn.field_r = true;
              return;
            } else {
              if (var2 == 2) {
                cn.field_r = true;
                hn.field_t = true;
                pl.field_n = 0;
                be.field_q = true;
                lf.field_C = true;
                pn.field_L = 0;
                oo.field_i = false;
                return;
              } else {
                return;
              }
            }
          }
        } else {
          mi.r(53);
          m.field_B = param1;
          var2 = param1;
          if (var2 == 0) {
            pn.field_L = 1;
            be.field_q = false;
            pl.field_n = 1;
            oo.field_i = true;
            hn.field_t = false;
            cn.field_r = false;
            lf.field_C = false;
            return;
          } else {
            if (-2 == (var2 ^ -1)) {
              pl.field_n = 0;
              be.field_q = false;
              oo.field_i = true;
              lf.field_C = true;
              pn.field_L = 1;
              hn.field_t = true;
              cn.field_r = true;
              return;
            } else {
              if (var2 == 2) {
                cn.field_r = true;
                hn.field_t = true;
                pl.field_n = 0;
                be.field_q = true;
                lf.field_C = true;
                pn.field_L = 0;
                oo.field_i = false;
                return;
              } else {
                return;
              }
            }
          }
        }
    }

    static {
        field_x = "Add <%0> to ignore list";
    }
}
