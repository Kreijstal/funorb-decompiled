/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qf extends o {
    int field_i;
    int field_j;
    int field_g;
    static String field_k;
    int field_l;
    int field_h;

    final static boolean a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                field_k = (String) null;
                break L1;
              }
            }
            stackIn_3_0 = mi.a(-120, param0, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("qf.N(");

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
          throw pn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, int param1, int param2, int param3, kc param4) {
        try {
            this.field_d.a(param4, true);
            this.field_l = param2;
            if (param1 < 99) {
                qf.a((byte) -97, true);
            }
            this.field_g = param0;
            this.field_i = 10;
            this.field_h = qq.a(20, es.field_b.length);
            this.field_j = param3;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "qf.O(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    public qf() {
        super(new kc());
        this.field_h = 0;
    }

    final void a(int param0, kc param1, int param2, int param3) {
        try {
            this.field_d.a(param1, true);
            this.field_l = param2;
            this.field_g = param3;
            int var5_int = 68 / ((43 - param0) / 61);
            this.field_i = 10;
            this.field_h = qq.a(20, es.field_b.length);
            this.field_j = 92;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "qf.L(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static String a(String param0, int param1, String param2, gk param3, int param4) {
        RuntimeException var5 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param4 > 65) {
                break L1;
              } else {
                qf.b(-73);
                break L1;
              }
            }
            if (!param3.b((byte) -77)) {
              stackIn_5_0 = (String) (param2);
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              stackIn_7_0 = param0 + " - " + param3.a(param1, 100) + "%";
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var5);

            stackIn_10_1 = new StringBuilder().append("qf.I(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L4;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_11_0), stackIn_17_2 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static void a(byte[] param0, rb param1, int param2, java.math.BigInteger param3, int param4, java.math.BigInteger param5, int param6) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        var10 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              var7_int = dq.a(param4, -70);
              if (null == lp.field_b) {
                lp.field_b = new java.security.SecureRandom();
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var13 = new int[4];
              var12 = var13;
              var8 = var12;
              if (param2 == 25215) {
                break L2;
              } else {
                qf.a((byte) 115, false);
                break L2;
              }
            }
            var9 = 0;
            L3: while (true) {
              if (-5 >= (var9 ^ -1)) {
                L4: {
                  L5: {
                    if (wt.field_l == null) {
                      break L5;
                    } else {
                      if (var7_int > wt.field_l.field_f.length) {
                        break L5;
                      } else {
                        break L4;
                      }
                    }
                  }
                  wt.field_l = new rb(var7_int);
                  break L4;
                }
                L6: {
                  L7: {
                    wt.field_l.field_g = 0;
                    wt.field_l.a(true, param4, param6, param0);
                    wt.field_l.a(var7_int, (byte) 88);
                    wt.field_l.a(var13, 2097272037);
                    if (ke.field_a == null) {
                      break L7;
                    } else {
                      if (-101 >= (ke.field_a.field_f.length ^ -1)) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  ke.field_a = new rb(100);
                  break L6;
                }
                ke.field_a.field_g = 0;
                ke.field_a.b(-1336879960, 10);
                var11 = 0;
                var9 = var11;
                L8: while (true) {
                  if ((var11 ^ -1) <= -5) {
                    ke.field_a.a(param4, 23385);
                    ke.field_a.a(0, param5, param3);
                    param1.a(true, ke.field_a.field_g, 0, ke.field_a.field_f);
                    param1.a(true, wt.field_l.field_g, 0, wt.field_l.field_f);
                    break L0;
                  } else {
                    ke.field_a.a((byte) 87, var13[var11]);
                    var11++;
                    continue L8;
                  }
                }
              } else {
                var8[var9] = lp.field_b.nextInt();
                var9++;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var7);

            stackIn_24_1 = new StringBuilder().append("qf.M(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L9;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_27_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L10;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_30_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_28_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L11;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',').append(param4).append(',');

            if (param5 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L12;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L12;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_25_0), stackIn_34_2 + ',' + param6 + ')');
        }
    }

    public static void b(int param0) {
        if (param0 != 0) {
            qf.a((byte) 104, true);
        }
        field_k = null;
    }

    final static void a(byte param0, boolean param1) {
        if (param0 != 77) {
            return;
        }
        gm.field_x.a(false, param1);
    }

    static {
        field_k = "OK";
    }
}
