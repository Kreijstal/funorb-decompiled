/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jj extends fm implements tb {
    private fe field_O;
    private co field_N;
    static String field_P;
    static dd[] field_S;
    static String field_R;
    static int field_F;
    static String field_Q;

    final static ie a(int param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        int var4 = 0;
        String[] var5 = null;
        int var6 = 0;
        String var7 = null;
        ie var8 = null;
        int var9 = 0;
        ie stackIn_4_0 = null;
        ie stackIn_8_0 = null;
        ie stackIn_12_0 = null;
        ie stackIn_17_0 = null;
        ie stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        ie stackOut_3_0 = null;
        ie stackOut_7_0 = null;
        ie stackOut_11_0 = null;
        ie stackOut_19_0 = null;
        ie stackOut_16_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var9 = Pool.field_O;
        try {
          L0: {
            var2_int = param1.length();
            if (0 == var2_int) {
              stackOut_3_0 = uj.field_e;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              if (var2_int > 255) {
                stackOut_7_0 = la.field_h;
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              } else {
                var3 = jc.a(30634, param1, '.');
                if (var3.length < 2) {
                  stackOut_11_0 = uj.field_e;
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  var4 = -1;
                  var5 = var3;
                  var6 = 0;
                  L1: while (true) {
                    if (var6 >= var5.length) {
                      stackOut_19_0 = la.a(0, var3[var3.length + -1]);
                      stackIn_20_0 = stackOut_19_0;
                      break L0;
                    } else {
                      var7 = var5[var6];
                      var8 = dl.a(105, var7);
                      if (var8 == null) {
                        var6++;
                        continue L1;
                      } else {
                        stackOut_16_0 = (ie) var8;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2;
            stackOut_21_1 = new StringBuilder().append("jj.A(").append(102).append(44);
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L2;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + 41);
        }
        return stackIn_20_0;
    }

    jj(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (fp) null);
        ((jj) this).field_N = new co((fp) (Object) new om(10000536), nm.field_b, 0, 0, 140, 25);
        ((jj) this).field_N.a(-15309, new sn());
        ((jj) this).field_O = new fe(fg.field_c, (cc) this);
        ((jj) this).field_L = new ei[]{(ei) (Object) ((jj) this).field_N, (ei) (Object) ((jj) this).field_O};
        ((jj) this).field_O.field_z = (fp) (Object) new ng();
        ((jj) this).e((byte) -72);
    }

    final static void h() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        nm var9 = null;
        int stackIn_10_0 = 0;
        nm stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        nm stackOut_14_0 = null;
        nm stackOut_13_0 = null;
        try {
          L0: {
            var1_int = -kk.field_z + gp.field_c;
            kk.field_z = -(var1_int >> 1) + ad.field_u;
            gp.field_c = kk.field_z - -var1_int;
            ba.field_wb = m.field_f + -(er.field_R >> 1);
            var2 = ba.field_wb;
            var3 = 0;
            L1: while (true) {
              if (var3 >= qp.field_Sb.length) {
                break L0;
              } else {
                L2: {
                  var4 = ll.field_a[var3];
                  if (var4 >= 0) {
                    if (un.field_f.field_h == var4) {
                      var5 = bg.field_d;
                      break L2;
                    } else {
                      var5 = hd.field_H;
                      break L2;
                    }
                  } else {
                    var5 = lq.field_V;
                    break L2;
                  }
                }
                L3: {
                  var6 = qp.field_Sb[var3];
                  if (var4 < 0) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L3;
                  } else {
                    stackOut_8_0 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    break L3;
                  }
                }
                L4: {
                  var7 = wm.a(stackIn_10_0 != 0, 18, var6);
                  var8 = ad.field_u - (var7 >> 1);
                  if (var4 >= 0) {
                    L5: {
                      var2 = var2 + bj.field_m;
                      if (~un.field_f.field_h == ~var4) {
                        stackOut_14_0 = uk.field_d;
                        stackIn_15_0 = stackOut_14_0;
                        break L5;
                      } else {
                        stackOut_13_0 = rm.field_e;
                        stackIn_15_0 = stackOut_13_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_15_0;
                      if (var9 == null) {
                        break L6;
                      } else {
                        var9.a((qi.field_g << 1) + var7, var2, -6316, -qi.field_g + var8, (oc.field_B << 1) + kh.field_yc);
                        break L6;
                      }
                    }
                    var2 = var2 + oc.field_B;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L7: {
                  if (var4 >= 0) {
                    qa.field_t.d(var6, var8, var2 + qr.field_g, var5, -1);
                    var2 = var2 + (kh.field_yc + (oc.field_B - -bj.field_m));
                    break L7;
                  } else {
                    qp.field_ec.d(var6, var8, un.field_h + var2, var5, -1);
                    var2 = var2 + ob.field_u;
                    break L7;
                  }
                }
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "jj.C(" + -9395 + 41);
        }
    }

    final void a(ei param0, int param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            ((jj) this).field_O.field_I = ((jj) this).field_N.a(param1 + -997).c(-31873) == kr.field_e ? true : false;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "jj.S(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 41);
        }
    }

    public static void i(int param0) {
        field_S = null;
        field_R = null;
        field_P = null;
        field_Q = null;
        if (param0 != 100) {
            field_S = null;
        }
    }

    public final void a(boolean param0, int param1, int param2, fe param3, int param4) {
        if (!(((jj) this).field_N.a(-41).c(-31873) == kr.field_e)) {
            return;
        }
        try {
            if (!param0) {
                jj.i(82);
            }
            wm.a(-121, ((jj) this).field_N.h(37), ((jj) this).field_N.j(25), ((jj) this).field_N.h((byte) -119));
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) (Object) runtimeException, "jj.P(" + param0 + 44 + param1 + 44 + param2 + 44 + (param3 != null ? "{...}" : "null") + 44 + param4 + 41);
        }
    }

    final static byte[] a(byte[] param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = param0.length;
            var3 = new byte[var2_int];
            qn.a(param0, 0, var3, 0, var2_int);
            stackOut_0_0 = (byte[]) var3;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var2;
            stackOut_2_1 = new StringBuilder().append("jj.B(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + 44 + 91 + 41);
        }
        return stackIn_1_0;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 17 % ((-42 - param1) / 53);
        super.a(param0, (byte) 110, param2, param3);
        qk.field_a.d(bl.field_t, ((jj) this).field_C + (param2 + 4), 4 + (param3 + ((jj) this).field_D) + qk.field_a.field_C, 16777215, -1);
    }

    final void f(byte param0) {
        int var2 = 250;
        ((jj) this).field_N.a(140, -var2 + ((jj) this).field_l >> 1, 25, false, -25 + (20 + ((jj) this).field_y) >> 1);
        ((jj) this).field_O.a(100, (((jj) this).field_l - var2 >> 1) + 150, 30, false, 2 + (((jj) this).field_y - 10 >> 1));
        if (param0 > -68) {
            Object var3 = null;
            ((jj) this).a((ei) null, 99, -2, 11);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_R = "Enter name of player to delete from list";
        field_P = "Hide players in <%0>'s game";
        field_Q = "Basics Tutorial";
    }
}
