/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qh extends vf {
    private pn field_v;
    static vf field_y;
    static mn field_w;
    static fi field_x;
    private pn[] field_B;
    static String field_u;
    static String field_z;

    public final void a(byte param0, int param1, boolean param2, fj param3, int param4) {
        RuntimeException var6 = null;
        pn var7 = null;
        pn var9 = null;
        rg var10 = null;
        pn var11 = null;
        pn var12 = null;
        pn var13 = null;
        pn var14 = null;
        fj stackIn_3_0 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        fj stackOut_1_0 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        RuntimeException stackOut_34_0 = null;
        StringBuilder stackOut_34_1 = null;
        String stackOut_34_2 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        try {
          L0: {
            L1: {
              if (!(param3 instanceof rg)) {
                stackOut_2_0 = null;
                stackIn_3_0 = (fj) (Object) stackOut_2_0;
                break L1;
              } else {
                stackOut_1_0 = (fj) param3;
                stackIn_3_0 = stackOut_1_0;
                break L1;
              }
            }
            L2: {
              var10 = (rg) (Object) stackIn_3_0;
              int discarded$3 = 14907;
              lc.a(param1 + param3.field_q, param3.field_F + (param1 - -param3.field_q), param4 - (-param3.field_m + -param3.field_z), param4 + param3.field_m);
              if (var10 != null) {
                param2 = param2 & var10.field_L;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              var7 = ((qh) this).field_B[0];
              ((qh) this).field_v.b(2585);
              var7.a(param4, ((qh) this).field_v, param1, 2147483647, param3, (qh) this);
              if (param0 < -97) {
                break L3;
              } else {
                ((qh) this).field_B = null;
                break L3;
              }
            }
            L4: {
              if (var10 != null) {
                L5: {
                  if (var10.field_O) {
                    var11 = ((qh) this).field_B[1];
                    if (var11 == null) {
                      break L5;
                    } else {
                      var11.a(param4, ((qh) this).field_v, param1, 2147483647, param3, (qh) this);
                      break L5;
                    }
                  } else {
                    break L5;
                  }
                }
                if (!var10.field_w) {
                  break L4;
                } else {
                  L6: {
                    var12 = ((qh) this).field_B[3];
                    if (var10.field_o == 0) {
                      break L6;
                    } else {
                      if (var12 == null) {
                        break L6;
                      } else {
                        var12.a(param4, ((qh) this).field_v, param1, 2147483647, param3, (qh) this);
                        break L4;
                      }
                    }
                  }
                  var9 = ((qh) this).field_B[2];
                  if (var9 != null) {
                    var9.a(param4, ((qh) this).field_v, param1, 2147483647, param3, (qh) this);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              } else {
                break L4;
              }
            }
            L7: {
              if (param3.e((byte) -125)) {
                var13 = ((qh) this).field_B[5];
                if (var13 == null) {
                  break L7;
                } else {
                  var13.a(param4, ((qh) this).field_v, param1, 2147483647, param3, (qh) this);
                  break L7;
                }
              } else {
                break L7;
              }
            }
            L8: {
              if (!param2) {
                var14 = ((qh) this).field_B[4];
                if (var14 != null) {
                  var14.a(param4, ((qh) this).field_v, param1, 2147483647, param3, (qh) this);
                  break L8;
                } else {
                  break L8;
                }
              } else {
                break L8;
              }
            }
            ((qh) this).field_v.a(param1, param4, param3, (byte) 100, (qh) this);
            int discarded$4 = 0;
            ib.b();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var6 = decompiledCaughtException;
            stackOut_32_0 = (RuntimeException) var6;
            stackOut_32_1 = new StringBuilder().append("qh.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_34_0 = stackOut_32_0;
            stackIn_34_1 = stackOut_32_1;
            stackIn_33_0 = stackOut_32_0;
            stackIn_33_1 = stackOut_32_1;
            if (param3 == null) {
              stackOut_34_0 = (RuntimeException) (Object) stackIn_34_0;
              stackOut_34_1 = (StringBuilder) (Object) stackIn_34_1;
              stackOut_34_2 = "null";
              stackIn_35_0 = stackOut_34_0;
              stackIn_35_1 = stackOut_34_1;
              stackIn_35_2 = stackOut_34_2;
              break L9;
            } else {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "{...}";
              stackIn_35_0 = stackOut_33_0;
              stackIn_35_1 = stackOut_33_1;
              stackIn_35_2 = stackOut_33_2;
              break L9;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_35_0, stackIn_35_2 + ',' + param4 + ')');
        }
    }

    final static jb a(boolean param0, byte param1) {
        int var3 = 0;
        bd var4 = null;
        bd var5 = null;
        bd var6 = null;
        int var7 = 0;
        jb var8 = null;
        bd var9 = null;
        jb var10 = null;
        bd var11 = null;
        bd var12 = null;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var7 = Confined.field_J ? 1 : 0;
          if (!pa.field_c) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = 1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          al.field_d = stackIn_3_0;
          var8 = new jb(7);
          var10 = var8;
          var10.field_b = 277;
          var10.field_s = 70;
          var10.field_c = 50;
          var10.field_k = 500;
          var3 = 20 + var10.field_c - -var10.field_b;
          int discarded$2 = 1;
          if (tj.a()) {
            var11 = new bd(16, ba.field_Q, (ok) (Object) pn.field_a);
            var11.field_b = var3;
            var11.field_j = -(var11.field_f / 2) + 320;
            var10.a((byte) -53, var11);
            break L1;
          } else {
            var10.a((byte) -83, new bd(18, ca.field_s, (ok) (Object) pn.field_a));
            var10.a((byte) -84, new bd(18, kk.field_a, (ok) (Object) pn.field_a));
            var8.a((byte) -103, new bd(19, dn.field_e[0], (ok) (Object) pn.field_a));
            var8.a((byte) -90, new bd(19, dn.field_e[1], (ok) (Object) pn.field_a));
            var8.a((byte) -123, new bd(19, dn.field_e[2], (ok) (Object) pn.field_a));
            var8.field_h[1].field_f = 200;
            var9 = var8.field_h[0];
            var4 = var9;
            var9.field_f = 200;
            var8.field_h[0].field_j = -(var8.field_h[0].field_f / 2) + 200;
            var8.field_h[1].field_b = var3;
            var8.field_h[0].field_b = var3;
            var8.field_h[1].field_j = -(var8.field_h[1].field_f / 2) + 440;
            var3 += 40;
            var5 = var8.field_h[2];
            var8.field_h[4].field_f = 145;
            var6 = var8.field_h[3];
            var6.field_f = 145;
            var5.field_f = 145;
            var8.field_h[2].field_j = 160 + -(var8.field_h[2].field_f / 2);
            var8.field_h[3].field_j = 320 + -(var8.field_h[3].field_f / 2);
            var8.field_h[4].field_j = -(var8.field_h[4].field_f / 2) + 480;
            var8.field_h[4].field_b = var3;
            var8.field_h[3].field_b = var3;
            var8.field_h[2].field_b = var3;
            break L1;
          }
        }
        var3 += 40;
        var12 = new bd(14, fl.field_b, (ok) (Object) pn.field_a);
        var12.field_b = var3;
        if (param1 >= 102) {
          L2: {
            var12.field_j = 320 - var12.field_f / 2;
            var10.a((byte) -60, var12);
            int discarded$3 = 1;
            if (!tj.a()) {
              var10.a(param0, 26206, 2 - -h.field_W);
              break L2;
            } else {
              var10.a(param0, 26206, 0);
              break L2;
            }
          }
          return var10;
        } else {
          return null;
        }
    }

    public static void d(int param0) {
        field_w = null;
        if (param0 <= 103) {
            field_x = null;
        }
        field_u = null;
        field_z = null;
        field_x = null;
        field_y = null;
    }

    final void a(int param0, nf param1) {
        pn[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        pn var6 = null;
        int var7 = 0;
        pn[] var8 = null;
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
        var7 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var4 = -100 % ((param0 - 1) / 59);
            var8 = ((qh) this).field_B;
            var3 = var8;
            var5 = 0;
            L1: while (true) {
              if (var8.length <= var5) {
                break L0;
              } else {
                L2: {
                  var6 = var8[var5];
                  if (var6 == null) {
                    break L2;
                  } else {
                    var6.field_d = param1;
                    break L2;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3_ref;
            stackOut_7_1 = new StringBuilder().append("qh.H(").append(param0).append(',');
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
          throw sd.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    final void a(byte param0, nf[] param1) {
        pn[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        pn var6 = null;
        int var7 = 0;
        pn[] var8 = null;
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
        var7 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var8 = ((qh) this).field_B;
            var3 = var8;
            var4 = -37 / ((param0 - 45) / 52);
            var5 = 0;
            L1: while (true) {
              if (var5 >= var8.length) {
                break L0;
              } else {
                L2: {
                  var6 = var8[var5];
                  if (var6 == null) {
                    break L2;
                  } else {
                    var6.field_g = param1;
                    break L2;
                  }
                }
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var3_ref;
            stackOut_7_1 = new StringBuilder().append("qh.F(").append(param0).append(',');
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
          throw sd.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    public qh() {
        ((qh) this).field_B = new pn[6];
        ((qh) this).field_v = new pn();
        pn dupTemp$0 = new pn();
        ((qh) this).field_B[0] = dupTemp$0;
        pn var1 = dupTemp$0;
        var1.b(2585);
    }

    final static void c(int param0) {
        if (!(dn.field_d != null)) {
            return;
        }
        if (param0 != 4) {
            qh.d(89);
        }
        fa.a((java.awt.Canvas) (Object) dn.field_d, param0 + 65);
        dn.field_d.a(-94, ki.field_d);
        dn.field_d = null;
        if (null != gg.field_m) {
            gg.field_m.a((byte) -127);
        }
        fb.field_b.requestFocus();
    }

    private final void a(int param0, qh param1, boolean param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        pn var5 = null;
        pn var6 = null;
        int var7 = 0;
        pn stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        pn stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        pn stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        pn stackIn_10_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        pn stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        pn stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        pn stackOut_9_2 = null;
        pn stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        pn stackOut_8_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        var7 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              super.a(false, (vf) (Object) param1);
              if (param2) {
                var4_int = 0;
                L2: while (true) {
                  if (6 <= var4_int) {
                    break L1;
                  } else {
                    L3: {
                      var5 = ((qh) this).field_B[var4_int];
                      var6 = var5;
                      var6 = var5;
                      if (var5 != null) {
                        L4: {
                          var6 = param1.field_B[var4_int];
                          stackOut_7_0 = (pn) var5;
                          stackOut_7_1 = 0;
                          stackIn_9_0 = stackOut_7_0;
                          stackIn_9_1 = stackOut_7_1;
                          stackIn_8_0 = stackOut_7_0;
                          stackIn_8_1 = stackOut_7_1;
                          if (var6 != null) {
                            stackOut_9_0 = (pn) (Object) stackIn_9_0;
                            stackOut_9_1 = stackIn_9_1;
                            stackOut_9_2 = (pn) var6;
                            stackIn_10_0 = stackOut_9_0;
                            stackIn_10_1 = stackOut_9_1;
                            stackIn_10_2 = stackOut_9_2;
                            break L4;
                          } else {
                            pn dupTemp$17 = new pn();
                            param1.field_B[var4_int] = dupTemp$17;
                            stackOut_8_0 = (pn) (Object) stackIn_8_0;
                            stackOut_8_1 = stackIn_8_1;
                            stackOut_8_2 = (pn) dupTemp$17;
                            stackIn_10_0 = stackOut_8_0;
                            stackIn_10_1 = stackOut_8_1;
                            stackIn_10_2 = stackOut_8_2;
                            break L4;
                          }
                        }
                        ((pn) (Object) stackIn_10_0).a(stackIn_10_1 != 0, stackIn_10_2);
                        break L3;
                      } else {
                        param1.field_B[var4_int] = null;
                        break L3;
                      }
                    }
                    var4_int++;
                    continue L2;
                  }
                }
              } else {
                lj.a((Object[]) (Object) ((qh) this).field_B, 0, (Object[]) (Object) param1.field_B, 0, 6);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("qh.A(").append(-29066).append(',');
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ',' + param2 + ')');
        }
    }

    final pn b(int param0, int param1) {
        if (param1 > -34) {
            jb discarded$0 = qh.a(true, (byte) 21);
        }
        pn dupTemp$1 = new pn();
        ((qh) this).field_B[param0] = dupTemp$1;
        return dupTemp$1;
    }

    qh(qh param0, boolean param1) {
        this();
        try {
            param0.a(-29066, (qh) this, param1);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "qh.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0, nf[] param1, int param2) {
        int var4_int = 0;
        try {
            var4_int = param2;
            if (null == ((qh) this).field_B[var4_int]) {
                ((qh) this).field_B[var4_int] = new pn();
            }
            ((qh) this).field_B[param2].field_g = param1;
            var4_int = -53 % ((2 - param0) / 55);
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) (Object) runtimeException, "qh.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = new fi();
        field_z = "Congratulations. #You have done well.";
        field_u = "Unpacking music";
    }
}
