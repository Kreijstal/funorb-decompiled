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
        int var5 = Vertigo2.field_L ? 1 : 0;
        param2 = param2 & e.field_b[param1];
        while (param1 > ((mi) this).field_y) {
            param1 = param1 - ((mi) this).field_y;
            int fieldTemp$0 = ((mi) this).field_u;
            ((mi) this).field_u = ((mi) this).field_u + 1;
            ((mi) this).field_p[fieldTemp$0] = (byte)(((mi) this).field_p[fieldTemp$0] + (param2 >>> param1));
            ((mi) this).field_p[((mi) this).field_u] = (byte) 0;
            ((mi) this).field_y = 8;
        }
        int var4 = -41 / ((62 - param0) / 36);
        if (((mi) this).field_y == param1) {
            int fieldTemp$1 = ((mi) this).field_u;
            ((mi) this).field_u = ((mi) this).field_u + 1;
            ((mi) this).field_p[fieldTemp$1] = (byte)(((mi) this).field_p[fieldTemp$1] + param2);
            ((mi) this).field_p[((mi) this).field_u] = (byte) 0;
            ((mi) this).field_y = 8;
            return;
        }
        ((mi) this).field_y = ((mi) this).field_y - param1;
        ((mi) this).field_p[((mi) this).field_u] = (byte)(((mi) this).field_p[((mi) this).field_u] + (param2 << ((mi) this).field_y));
    }

    final void d(boolean param0) {
        ((mi) this).field_p[((mi) this).field_u] = (byte) 0;
        ((mi) this).field_y = 8;
        if (param0) {
            mi.r(42);
        }
    }

    final void j(int param0, int param1) {
        int fieldTemp$0 = ((mi) this).field_u;
        ((mi) this).field_u = ((mi) this).field_u + 1;
        ((mi) this).field_p[fieldTemp$0] = (byte)(((mi) this).field_v.a((byte) 72) + param0);
        if (param1 <= 117) {
            int discarded$1 = ((mi) this).c((byte) -52, 85);
        }
    }

    final int c(byte param0) {
        int var2 = -43 / ((param0 - -50) / 46);
        int fieldTemp$0 = ((mi) this).field_u;
        ((mi) this).field_u = ((mi) this).field_u + 1;
        return 255 & ((mi) this).field_p[fieldTemp$0] - ((mi) this).field_v.a((byte) 72);
    }

    final static er[] a(String param0, r param1, byte param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        er[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        er[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
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
            stackOut_2_0 = bk.a(var4_int, var5, param1, -2724);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("mi.VA(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          L4: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param2).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param3 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + 41);
        }
        return stackIn_3_0;
    }

    final void p(int param0) {
        if (param0 != 0) {
            ((mi) this).d(false);
            ((mi) this).field_z = ((mi) this).field_u * 8;
            return;
        }
        ((mi) this).field_z = ((mi) this).field_u * 8;
    }

    final int c(byte param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Vertigo2.field_L ? 1 : 0;
        if (param0 < -92) {
          var3 = ((mi) this).field_z >> 3;
          var4 = 8 + -(7 & ((mi) this).field_z);
          ((mi) this).field_z = ((mi) this).field_z + param1;
          var5 = 0;
          L0: while (true) {
            if (param1 <= var4) {
              L1: {
                if (var4 == param1) {
                  var5 = var5 + (((mi) this).field_p[var3] & e.field_b[var4]);
                  break L1;
                } else {
                  var5 = var5 + (((mi) this).field_p[var3] >> var4 + -param1 & e.field_b[param1]);
                  break L1;
                }
              }
              return var5;
            } else {
              int incrementValue$2 = var3;
              var3++;
              var5 = var5 + ((e.field_b[var4] & ((mi) this).field_p[incrementValue$2]) << param1 - var4);
              param1 = param1 - var4;
              var4 = 8;
              continue L0;
            }
          }
        } else {
          field_w = null;
          var3 = ((mi) this).field_z >> 3;
          var4 = 8 + -(7 & ((mi) this).field_z);
          ((mi) this).field_z = ((mi) this).field_z + param1;
          var5 = 0;
          L2: while (true) {
            if (param1 <= var4) {
              L3: {
                if (var4 == param1) {
                  var5 = var5 + (((mi) this).field_p[var3] & e.field_b[var4]);
                  break L3;
                } else {
                  var5 = var5 + (((mi) this).field_p[var3] >> var4 + -param1 & e.field_b[param1]);
                  break L3;
                }
              }
              return var5;
            } else {
              int incrementValue$3 = var3;
              var3++;
              var5 = var5 + ((e.field_b[var4] & ((mi) this).field_p[incrementValue$3]) << param1 - var4);
              param1 = param1 - var4;
              var4 = 8;
              continue L2;
            }
          }
        }
    }

    final void a(byte param0, int param1, byte[] param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        var6 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 >= 24) {
                break L1;
              } else {
                field_x = null;
                break L1;
              }
            }
            var5_int = 0;
            L2: while (true) {
              if (var5_int >= param1) {
                break L0;
              } else {
                int fieldTemp$5 = ((mi) this).field_u;
                ((mi) this).field_u = ((mi) this).field_u + 1;
                param2[param3 + var5_int] = (byte)(((mi) this).field_p[fieldTemp$5] + -((mi) this).field_v.a((byte) 72));
                var5_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("mi.WA(").append(param0).append(44).append(param1).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param3 + 41);
        }
    }

    final void b(int[] param0, int param1) {
        try {
            if (param1 < 33) {
                ((mi) this).j(40, -119);
            }
            ((mi) this).field_v = new wa(param0);
        } catch (RuntimeException runtimeException) {
            throw wn.a((Throwable) (Object) runtimeException, "mi.CB(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final void q(int param0) {
        if (!(~((mi) this).field_y <= param0)) {
            ((mi) this).field_y = 8;
            ((mi) this).field_u = ((mi) this).field_u + 1;
        }
    }

    final void b(byte param0) {
        ((mi) this).field_u = (((mi) this).field_z + 7) / 8;
        if (param0 > -49) {
            ((mi) this).field_v = null;
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
        int var2 = 0;
        int var3 = 0;
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
            if (var2 == 1) {
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
            if (var2 == 1) {
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = "Add <%0> to ignore list";
    }
}
