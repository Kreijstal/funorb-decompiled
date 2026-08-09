/*
 * Decompiled by CFR-JS 0.4.0.
 */
class qm {
    static oa field_c;
    static int[] field_i;
    int field_f;
    int field_h;
    private static long[] field_d;
    static String field_g;
    static String field_a;
    static vn field_e;
    static int field_b;

    public static void a(int param0) {
        if (param0 != -22525) {
            return;
        }
        field_a = null;
        field_c = null;
        field_g = null;
        field_d = null;
        field_e = null;
        field_i = null;
    }

    final static void a(hj param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (param2 == -1) {
                break L1;
              } else {
                field_c = (oa) null;
                break L1;
              }
            }
            L2: while (true) {
              if (param0.field_s * param0.field_y <= var3_int) {
                break L0;
              } else {
                var4 = param0.field_z[var3_int];
                var5 = 16711935 & var4;
                var5 = var5 * param1;
                var4 = var4 & 65280;
                var4 = var4 * param1;
                var5 = var5 & -16711936;
                var4 = var4 & 16711680;
                var4 = var4 | var5;
                param0.field_z[var3_int] = var4 >>> 59931912;
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("qm.A(");

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
          throw kk.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        if (0 > param0 || (param0 ^ -1) <= -65537) {
            param0 = param0 >>> 16;
            var2 += 16;
        }
        if (param0 >= 256) {
            param0 = param0 >>> 8;
            var2 += 8;
        }
        if (!(param0 < 16)) {
            var2 += 4;
            param0 = param0 >>> 4;
        }
        if (param1 > -60) {
            qm.a(29, (byte) -27);
        }
        if (!(param0 < 4)) {
            var2 += 2;
            param0 = param0 >>> 2;
        }
        if (param0 >= 1) {
            var2++;
            param0 = param0 >>> 1;
        }
        return var2 + param0;
    }

    final void a(in param0, byte param1) {
        if (param1 <= 84) {
            return;
        }
        try {
            this.field_f = (int)((float)this.field_f + param0.field_g);
            this.field_h = (int)((float)this.field_h + param0.field_j);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "qm.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0, ei param1, int param2, qm param3, qm param4) {
        int stackIn_20_0 = 0;
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
        RuntimeException decompiledCaughtException = null;
        float var5_float = 0.0f;
        RuntimeException var5 = null;
        int var6 = 0;
        lb var7 = null;
        int var8 = 0;
        ei var9 = null;
        int var10 = 0;
        lb var11 = null;
        int var12 = 0;
        var12 = HoldTheLine.field_D;
        try {
          L0: {
            var5_float = 0.0f;
            var6 = 0;
            var7 = new lb(param3, param4, 0, false, true);
            var8 = 0;
            L1: while (true) {
              if (var8 >= param1.field_e) {
                L2: {
                  if (param2 == -20484) {
                    break L2;
                  } else {
                    qm.a(-86, (byte) 69);
                    break L2;
                  }
                }
                mm.field_d = var5_float;
                stackIn_20_0 = var6;
                break L0;
              } else {
                var9 = (ei) (param1.field_b[var8]);
                var10 = 0;
                L3: while (true) {
                  if (var9.field_e <= var10) {
                    var8++;
                    continue L1;
                  } else {
                    var11 = (lb) (var9.field_b[var10]);
                    if ((param0 + -1 ^ -1) >= (var11.field_k ^ -1)) {
                      if (param0 - -1 >= var11.field_k) {
                        if (th.a(-1, var7, var11)) {
                          L4: {
                            L5: {
                              if (var5_float > mm.field_d) {
                                break L5;
                              } else {
                                if (var6 != 0) {
                                  break L4;
                                } else {
                                  break L5;
                                }
                              }
                            }
                            var5_float = mm.field_d;
                            break L4;
                          }
                          var6 = 1;
                          var10++;
                          continue L3;
                        } else {
                          var10++;
                          continue L3;
                        }
                      } else {
                        var10++;
                        continue L3;
                      }
                    } else {
                      var10++;
                      continue L3;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5);

            stackIn_23_1 = new StringBuilder().append("qm.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param4 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L8;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_24_0), stackIn_30_2 + ')');
        }
        return stackIn_20_0 != 0;
    }

    final void a(in param0, int param1) {
        this.field_f = (int)((float)this.field_f - param0.field_g);
        if (param1 != -13201) {
            return;
        }
        try {
            this.field_h = (int)((float)this.field_h - param0.field_j);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "qm.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    qm(int param0, int param1) {
        this.field_h = param0;
        this.field_f = param1;
    }

    qm(qm param0) {
        try {
            this.field_f = param0.field_f;
            this.field_h = param0.field_h;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "qm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit: {
            long var0;
            int var2;
            int var3;
            field_d = new long[256];
            field_i = new int[]{65280, 16760703, 16777215, 4144959};
            var2 = 0;
            L0: while (true) {
              if (-257 >= (var2 ^ -1)) {
                field_g = "Demolition";
                field_a = "<img=5>";
                break $cfr$clinit;
              } else {
                var0 = (long)var2;
                var3 = 0;
                L1: while (true) {
                  if ((var3 ^ -1) <= -9) {
                    field_d[var2] = var0;
                    var2++;
                    continue L0;
                  } else {
                    if ((1L & var0) != 1L) {
                      var0 = var0 >>> 1;
                      var3++;
                      continue L1;
                    } else {
                      var0 = var0 >>> 1551423937 ^ -3932672073523589310L;
                      var3++;
                      continue L1;
                    }
                  }
                }
              }
            }
        }
    }
}
