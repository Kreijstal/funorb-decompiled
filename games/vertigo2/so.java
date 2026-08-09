/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class so extends ji {
    static String field_z;
    static long field_y;
    static int field_B;

    public so() {
        super(1, false);
    }

    final static void a(cr param0, int param1, int param2, int param3, cr param4, byte[] param5, cr param6, int param7, int param8, int param9) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        var12 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            gr.field_Z = param1;
            kr.field_c = param5;
            ao.field_N = -1L;
            ol.field_A = param5.length;
            gd.field_j = null;
            qc.field_w = new byte[(gr.field_Z + 7) / 8];
            qn.field_q = false;
            sj.field_d = null;
            var10_int = 0;
            var11 = 0;
            L1: while (true) {
              if (kr.field_c.length <= var11) {
                L2: {
                  if (param8 > 34) {
                    break L2;
                  } else {
                    field_z = (String) null;
                    break L2;
                  }
                }
                L3: {
                  var10_int = (var10_int - -7) / 8;
                  dj.field_a = new byte[var10_int];
                  if (null == param6.field_M) {
                    param6.field_M = new nj();
                    break L3;
                  } else {
                    break L3;
                  }
                }
                L4: {
                  mk.field_J = param6.field_M;
                  mk.field_J.c(0);
                  kd.field_l = new fi(param7);
                  br.field_Q = 0;
                  rp.field_a = -1;
                  kk.field_j = 0;
                  qn.field_w = -1;
                  if (param4.field_M != null) {
                    break L4;
                  } else {
                    param4.field_M = new nj();
                    break L4;
                  }
                }
                L5: {
                  nr.field_p = param4.field_M;
                  nr.field_p.c(0);
                  lh.field_b = new fi(param3);
                  if (null != param0.field_M) {
                    break L5;
                  } else {
                    param0.field_M = new nj();
                    break L5;
                  }
                }
                kq.field_Rb = param0.field_M;
                kq.field_Rb.c(0);
                ck.field_I = new fi(param9);
                lp.field_D = param2;
                r.field_h = 0L;
                break L0;
              } else {
                var10_int = var10_int + (255 & kr.field_c[var11]);
                var11++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var10 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var10);

            stackIn_17_1 = new StringBuilder().append("so.A(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L7;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param5 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L8;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param6 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L9;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L9;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_18_0), stackIn_27_2 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
        }
    }

    final int[] c(int param0, int param1) {
        int[] var3;
        int[] var4;
        int var5;
        int var6;
        int[] var7;
        var6 = Vertigo2.field_L ? 1 : 0;
        var7 = this.field_x.a(param0, (byte) -113);
        var3 = var7;
        if (this.field_x.field_i) {
          var4 = this.a(0, -1, param0);
          var5 = 0;
          L0: while (true) {
            if (we.field_M <= var5) {
              if (param1 < 91) {
                return (int[]) null;
              } else {
                return var3;
              }
            } else {
              var7[var5] = -var4[var5] + 4096;
              var5++;
              continue L0;
            }
          }
        } else {
          if (param1 < 91) {
            return (int[]) null;
          } else {
            return var3;
          }
        }
    }

    public static void g(int param0) {
        if (param0 != -13533) {
            field_y = 22L;
            field_z = null;
            return;
        }
        field_z = null;
    }

    final void a(byte param0, int param1, ed param2) {
        RuntimeException var4 = null;
        cr var5 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        int stackIn_5_1 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (0 == param1) {
                L2: {
                  stackIn_4_0 = this;

                  if ((param2.h(param0 ^ -101) ^ -1) != -2) {
                    stackIn_5_0 = this;
                    stackIn_5_1 = 0;
                    break L2;
                  } else {
                    stackIn_5_0 = this;
                    stackIn_5_1 = 1;
                    break L2;
                  }
                }
                ((so) (this)).field_o = stackIn_5_1 != 0;
                break L1;
              } else {
                break L1;
              }
            }
            if (param0 == 110) {
              break L0;
            } else {
              var5 = (cr) null;
              so.a((cr) null, 27, 57, 9, (cr) null, (byte[]) null, (cr) null, 16, -49, -71);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var4);

            stackIn_11_1 = new StringBuilder().append("so.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    final int[][] b(int param0, int param1) {
        int[][] var3;
        int[] var8;
        int[] var9;
        int[] var10;
        int var11;
        int var12;
        int[][] var13;
        int[][] var15;
        int[][] var20;
        int[][] var28;
        int[] var29;
        int[] var30;
        int[] var31;
        var12 = Vertigo2.field_L ? 1 : 0;
        var20 = this.field_v.a(param1, -2);
        var15 = var20;
        var13 = var15;
        var3 = var13;
        if (this.field_v.field_c) {
          var28 = this.c(0, 3, param1);
          var29 = var28[0];
          var30 = var28[1];
          var31 = var28[2];
          var8 = var20[0];
          var9 = var20[1];
          var10 = var20[2];
          var11 = 0;
          L0: while (true) {
            if (we.field_M > var11) {
              var8[var11] = -var29[var11] + 4096;
              var9[var11] = -var30[var11] + 4096;
              var10[var11] = 4096 + -var31[var11];
              var11++;
              continue L0;
            } else {
              if (param0 != -3780) {
                field_y = 66L;
                return var3;
              } else {
                return var3;
              }
            }
          }
        } else {
          if (param0 != -3780) {
            field_y = 66L;
            return var3;
          } else {
            return var3;
          }
        }
    }

    static {
        field_z = "Play free version";
        field_B = 0;
    }
}
