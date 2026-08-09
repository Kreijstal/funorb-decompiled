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
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = Pool.field_O;
        try {
          L0: {
            var2_int = param1.length();
            if (0 == var2_int) {
              stackIn_4_0 = uj.field_e;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((var2_int ^ -1) < -256) {
                stackIn_8_0 = la.field_h;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = jc.a(30634, param1, '.');
                if (var3.length < 2) {
                  stackIn_12_0 = uj.field_e;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var4 = -7 % ((3 - param0) / 47);
                  var5 = var3;
                  var6 = 0;
                  L1: while (true) {
                    if (var6 >= var5.length) {
                      stackIn_20_0 = la.a(0, var3[var3.length + -1]);
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      var7 = var5[var6];
                      var8 = dl.a(105, var7);
                      if (var8 == null) {
                        var6++;
                        continue L1;
                      } else {
                        stackIn_17_0 = (ie) (var8);
                        decompiledRegionSelector0 = 3;
                        break L0;
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
            stackIn_23_0 = (RuntimeException) (var2);

            stackIn_23_1 = new StringBuilder().append("jj.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L2;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L2;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0;
              } else {
                return stackIn_20_0;
              }
            }
          }
        }
    }

    jj(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (fp) null);
        this.field_N = new co(new om(10000536), nm.field_b, 0, 0, 140, 25);
        this.field_N.a(-15309, new sn());
        this.field_O = new fe(fg.field_c, (cc) (this));
        this.field_L = new ei[]{(ei) ((Object) this.field_N), (ei) ((Object) this.field_O)};
        this.field_O.field_z = (fp) ((Object) new ng());
        this.e((byte) -72);
    }

    final static void h(int param0) {
        int stackIn_10_0 = 0;
        nm stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
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
        byte[] var10 = null;
        try {
          L0: {
            var1_int = -kk.field_z + gp.field_c;
            kk.field_z = -(var1_int >> 298864001) + ad.field_u;
            gp.field_c = kk.field_z - -var1_int;
            ba.field_wb = m.field_f + -(er.field_R >> -1413223935);
            var2 = ba.field_wb;
            var3 = 0;
            L1: while (true) {
              if (var3 >= qp.field_Sb.length) {
                L2: {
                  if (param0 == -9395) {
                    break L2;
                  } else {
                    var10 = (byte[]) null;
                    jj.a((byte[]) null, (byte) -29);
                    break L2;
                  }
                }
                break L0;
              } else {
                L3: {
                  var4 = ll.field_a[var3];
                  if ((var4 ^ -1) <= -1) {
                    if (un.field_f.field_h == var4) {
                      var5 = bg.field_d;
                      break L3;
                    } else {
                      var5 = hd.field_H;
                      break L3;
                    }
                  } else {
                    var5 = lq.field_V;
                    break L3;
                  }
                }
                L4: {
                  var6 = qp.field_Sb[var3];
                  if (-1 < (var4 ^ -1)) {
                    stackIn_10_0 = 0;
                    break L4;
                  } else {
                    stackIn_10_0 = 1;
                    break L4;
                  }
                }
                L5: {
                  var7 = wm.a(stackIn_10_0 != 0, param0 ^ -9377, var6);
                  var8 = ad.field_u - (var7 >> -1289697951);
                  if (-1 >= (var4 ^ -1)) {
                    L6: {
                      var2 = var2 + bj.field_m;
                      if (un.field_f.field_h == var4) {
                        stackIn_15_0 = uk.field_d;
                        break L6;
                      } else {
                        stackIn_15_0 = rm.field_e;
                        break L6;
                      }
                    }
                    L7: {
                      var9 = stackIn_15_0;
                      if (var9 == null) {
                        break L7;
                      } else {
                        var9.a((qi.field_g << 1558756801) + var7, var2, -6316, -qi.field_g + var8, (oc.field_B << -883765759) + kh.field_yc);
                        break L7;
                      }
                    }
                    var2 = var2 + oc.field_B;
                    break L5;
                  } else {
                    break L5;
                  }
                }
                L8: {
                  if (-1 >= (var4 ^ -1)) {
                    qa.field_t.d(var6, var8, var2 + qr.field_g, var5, -1);
                    var2 = var2 + (kh.field_yc + (oc.field_B - -bj.field_m));
                    break L8;
                  } else {
                    qp.field_ec.d(var6, var8, un.field_h + var2, var5, -1);
                    var2 = var2 + ob.field_u;
                    break L8;
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
          throw wm.a((Throwable) ((Object) var1), "jj.C(" + param0 + ')');
        }
    }

    final void a(ei param0, int param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            this.field_O.field_I = this.field_N.a(param1 + -997).c(-31873) == kr.field_e ? true : false;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "jj.S(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void i(int param0) {
        field_S = null;
        field_R = null;
        field_P = null;
        field_Q = null;
        if (param0 != 100) {
            field_S = (dd[]) null;
        }
    }

    public final void a(boolean param0, int param1, int param2, fe param3, int param4) {
        if (!(this.field_N.a(-41).c(-31873) == kr.field_e)) {
            return;
        }
        try {
            if (!param0) {
                jj.i(82);
            }
            wm.a(-121, this.field_N.h(37), this.field_N.j(25), this.field_N.h((byte) -119));
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "jj.P(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static byte[] a(byte[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = param0.length;
              var3 = new byte[var2_int];
              if (param1 == 91) {
                break L1;
              } else {
                field_S = (dd[]) null;
                break L1;
              }
            }
            qn.a(param0, 0, var3, 0, var2_int);
            stackIn_3_0 = (byte[]) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("jj.B(");

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
          throw wm.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var5 = 17 % ((-42 - param1) / 53);
        super.a(param0, (byte) 110, param2, param3);
        qk.field_a.d(bl.field_t, this.field_C + (param2 + 4), 4 + (param3 + this.field_D) + qk.field_a.field_C, 16777215, -1);
    }

    final void f(byte param0) {
        int var2 = 250;
        this.field_N.a(140, -var2 + this.field_l >> -314276639, 25, false, -25 + (20 + this.field_y) >> -1564239647);
        this.field_O.a(100, (this.field_l - var2 >> 212438881) + 140 + 10, 30, false, 2 + (this.field_y - -20 - 30 >> 1113247201));
        if (param0 > -68) {
            ei var3 = (ei) null;
            this.a((ei) null, 99, -2, 11);
        }
    }

    static {
        field_R = "Enter name of player to delete from list";
        field_P = "Hide players in <%0>'s game";
        field_Q = "Basics Tutorial";
    }
}
