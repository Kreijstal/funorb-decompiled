/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vj extends kc implements ga {
    private dk field_Z;
    static boolean field_X;
    static int field_ab;
    static String field_W;
    static volatile boolean field_Y;
    static boolean field_V;

    public final void a(dk param0, int param1, boolean param2, int param3, int param4) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        try {
          L0: {
            L1: {
              if (!param2) {
                break L1;
              } else {
                field_Y = true;
                break L1;
              }
            }
            L2: {
              if (param0 == this.field_Z) {
                this.l(-14064);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var6 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var6);

            stackIn_8_1 = new StringBuilder().append("vj.E(");

            if (param0 == null) {
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
          throw sd.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(byte[] param0, int param1, java.math.BigInteger param2, rb param3, int param4, byte param5, java.math.BigInteger param6) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        int[] var12 = null;
        try {
          L0: {
            L1: {
              var7_int = ek.a(23201, param4);
              if (bd.field_e == null) {
                bd.field_e = new java.security.SecureRandom();
                break L1;
              } else {
                break L1;
              }
            }
            var12 = new int[4];
            var11 = var12;
            var8 = var11;
            var9 = 0;
            L2: while (true) {
              if (-5 >= (var9 ^ -1)) {
                L3: {
                  if (param5 == 99) {
                    break L3;
                  } else {
                    vj.e(false);
                    break L3;
                  }
                }
                L4: {
                  L5: {
                    if (null == dd.field_a) {
                      break L5;
                    } else {
                      if (dd.field_a.field_f.length >= var7_int) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  dd.field_a = new rb(var7_int);
                  break L4;
                }
                L6: {
                  L7: {
                    dd.field_a.field_g = 0;
                    dd.field_a.a(param0, param4, param5 + -20243, param1);
                    dd.field_a.a(var7_int, true);
                    dd.field_a.a((byte) -81, var12);
                    if (th.field_d == null) {
                      break L7;
                    } else {
                      if ((th.field_d.field_f.length ^ -1) <= -101) {
                        break L6;
                      } else {
                        break L7;
                      }
                    }
                  }
                  th.field_d = new rb(100);
                  break L6;
                }
                th.field_d.field_g = 0;
                th.field_d.a(10, param5 + -224);
                var10 = 0;
                var9 = var10;
                L8: while (true) {
                  if (var10 >= 4) {
                    th.field_d.c(param4, -306);
                    th.field_d.a(param2, param6, param5 + -8498);
                    param3.a(th.field_d.field_f, th.field_d.field_g, -20144, 0);
                    param3.a(dd.field_a.field_f, dd.field_a.field_g, -20144, 0);
                    break L0;
                  } else {
                    th.field_d.c((byte) -106, var12[var10]);
                    var10++;
                    continue L8;
                  }
                }
              } else {
                var8[var9] = bd.field_e.nextInt();
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var7 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var7);

            stackIn_23_1 = new StringBuilder().append("vj.C(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L9;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L10;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param3 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L11;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L11;
            }
          }
          L12: {


            stackIn_32_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_30_2).append(',').append(param4).append(',').append(param5).append(',');

            if (param6 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "null";
              break L12;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackIn_33_2 = "{...}";
              break L12;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_24_0), stackIn_33_2 + ')');
        }
    }

    private final void l(int param0) {
        if (!(this.field_G)) {
            return;
        }
        this.field_G = false;
        if (param0 != -14064) {
            field_ab = 33;
        }
    }

    public static void e(boolean param0) {
        field_W = null;
        if (!param0) {
            field_V = false;
        }
    }

    vj(tc param0, ae param1) {
        super(param0, 200, 150);
        Object var3 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        uj var4 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              if (param1 == oj.field_j) {
                var3 = wc.field_h;
                break L1;
              } else {
                if (cb.field_d == param1) {
                  var3 = kd.field_D;
                  this.field_f = this.field_f + 10;
                  if (!wi.a(-10214)) {
                    break L1;
                  } else {
                    var3 = cf.field_m;
                    this.field_f = this.field_f + 20;
                    break L1;
                  }
                } else {
                  if (param1 != wk.field_b) {
                    break L1;
                  } else {
                    var3 = mc.field_a;
                    this.field_f = this.field_f + 30;
                    break L1;
                  }
                }
              }
            }
            var4 = new uj((String) (var3), (qg) null);
            var4.field_s = 0;
            var4.field_f = 80;
            var4.field_j = 50;
            var4.field_i = this.field_i;
            var4.field_o = (de) ((Object) new hd(nb.field_b, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
            this.a(true, var4);
            this.field_Z = this.a(mc.field_e, (qg) (this), true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_12_0 = var3;

            stackIn_12_1 = new StringBuilder().append("vj.<init>(");

            if (param0 == null) {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L2;
            } else {
              stackIn_13_0 = stackIn_12_0;
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_15_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',');

            if (param1 == null) {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {

              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), stackIn_16_2 + ')');
        }
    }

    private final dk a(String param0, qg param1, boolean param2) {
        dk var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        dk stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new dk(param0, param1);
            var4.field_o = (de) ((Object) new gb());
            var5 = -6 + this.field_f;
            this.field_f = this.field_f + 38;
            var4.a(15, -16 + (this.field_i + -14), (byte) 124, 30, var5);
            this.a(param2, var4);
            this.d((byte) -30);
            stackIn_1_0 = (dk) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4_ref);

            stackIn_4_1 = new StringBuilder().append("vj.F(");

            if (param0 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    static {
        field_Y = false;
        field_X = false;
        field_W = "Names should contain a maximum of 12 characters";
        field_V = false;
    }
}
