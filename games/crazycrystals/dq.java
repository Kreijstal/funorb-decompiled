/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dq extends pc {
    static String field_C;
    static String field_H;
    static String field_F;
    private int field_I;
    int field_E;
    private ch field_B;
    int field_J;
    static String field_G;

    final static void a(int param0, boolean param1) {
        int var3 = 0;
        var3 = CrazyCrystals.field_B;
        if (param0 == -32056) {
          if (mo.field_l > 0) {
            ph.field_E = io.a(640, 0, param0 ^ -1038173815, te.field_a, 480, 0);
            if (null == ph.field_E) {
              se.a((byte) -108, param1, 3);
              return;
            } else {
              int discarded$2 = 1;
              mm.a((java.awt.Canvas) (Object) ph.field_E);
              se.a((byte) -80, param1, 2);
              return;
            }
          } else {
            if (rc.a(param0 ^ 32034)) {
              se.a((byte) -63, param1, 0);
              return;
            } else {
              se.a((byte) -64, param1, 1);
              return;
            }
          }
        } else {
          dq.a(-128, true);
          if (mo.field_l > 0) {
            ph.field_E = io.a(640, 0, param0 ^ -1038173815, te.field_a, 480, 0);
            if (null == ph.field_E) {
              se.a((byte) -108, param1, 3);
              return;
            } else {
              int discarded$3 = 1;
              mm.a((java.awt.Canvas) (Object) ph.field_E);
              se.a((byte) -80, param1, 2);
              return;
            }
          } else {
            if (rc.a(param0 ^ 32034)) {
              se.a((byte) -63, param1, 0);
              return;
            } else {
              se.a((byte) -64, param1, 1);
              return;
            }
          }
        }
    }

    public static void f(byte param0) {
        field_F = null;
        if (param0 >= -60) {
          field_C = null;
          field_H = null;
          field_G = null;
          field_C = null;
          return;
        } else {
          field_H = null;
          field_G = null;
          field_C = null;
          return;
        }
    }

    final static void a() {
        oj.a(true, tm.field_d, 480, 480, bq.field_i[1], 0, bq.field_i[2], 0, (byte) -32, bq.field_i[0]);
        if (ab.field_D == null) {
          if (go.field_i) {
            kh.d(0, 0, 480, 480, 0, 192);
            return;
          } else {
            return;
          }
        } else {
          ab.field_D.b(-1771219320);
          return;
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        RuntimeException var3_ref = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              param2 = qe.a((byte) 36, '_', param2, "");
              if (param1 < -53) {
                break L1;
              } else {
                field_C = null;
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = pc.a(param0, 0);
                if (param2.indexOf(param0) != -1) {
                  break L3;
                } else {
                  if (param2.indexOf(var3) == -1) {
                    stackOut_6_0 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackOut_5_0 = 1;
              stackIn_7_0 = stackOut_5_0;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("dq.A(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          L5: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44).append(param1).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_7_0 != 0;
    }

    final int e(byte param0) {
        if (param0 != -49) {
            return 23;
        }
        return ((dq) this).field_B.a(true);
    }

    final static dh a(int param0, byte[] param1) {
        dh var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_2_0 = null;
        dh stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        dh stackOut_5_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            if (param1 != null) {
              L1: {
                var2 = new dh(param1, uo.field_k, jm.field_a, uo.field_l, je.field_c, gh.field_z, ui.field_c);
                int discarded$5 = 2188450;
                ok.a();
                if (param0 == -18289) {
                  break L1;
                } else {
                  dq.f((byte) -96);
                  break L1;
                }
              }
              stackOut_5_0 = (dh) var2;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (dh) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2_ref;
            stackOut_7_1 = new StringBuilder().append("dq.C(").append(param0).append(44);
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
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 41);
        }
        return stackIn_6_0;
    }

    final int a(int param0, int param1) {
        int var3 = 0;
        if (param0 >= 0) {
          if (param0 >= ((dq) this).field_B.a(true)) {
            return -1;
          } else {
            var3 = 20 % ((-49 - param1) / 54);
            return ((dq) this).field_B.d(-32240, param0);
          }
        } else {
          return -1;
        }
    }

    final boolean a(int param0, int param1, qm param2, boolean param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        Object var15 = null;
        ch stackIn_12_0 = null;
        ch stackIn_13_0 = null;
        ch stackIn_14_0 = null;
        int stackIn_14_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_29_0 = 0;
        ch stackOut_11_0 = null;
        ch stackOut_13_0 = null;
        int stackOut_13_1 = 0;
        ch stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_25_0 = 0;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        RuntimeException stackOut_33_0 = null;
        StringBuilder stackOut_33_1 = null;
        String stackOut_33_2 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        var14 = CrazyCrystals.field_B;
        try {
          L0: {
            if (!super.a(param0, param1, param2, param3, param4, param5, param6)) {
              L1: {
                if (!param3) {
                  break L1;
                } else {
                  var15 = null;
                  dh discarded$1 = dq.a(116, (byte[]) null);
                  break L1;
                }
              }
              stackOut_29_0 = 0;
              stackIn_30_0 = stackOut_29_0;
              break L0;
            } else {
              L2: {
                var8_int = -param0 + param6 - ((dq) this).field_E;
                var9 = ((dq) this).field_g - ((dq) this).field_E * 2;
                if (var9 < var8_int) {
                  var8_int = var9;
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (0 > var8_int) {
                  var8_int = 0;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                var8_int = ((dq) this).field_I * var8_int / var9;
                if (1 == param5) {
                  ((dq) this).field_B.a(var8_int, (byte) 123);
                  break L4;
                } else {
                  if (param5 != 2) {
                    break L4;
                  } else {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L5: while (true) {
                      L6: {
                        stackOut_11_0 = ((dq) this).field_B;
                        stackIn_13_0 = stackOut_11_0;
                        stackIn_12_0 = stackOut_11_0;
                        if (param3) {
                          stackOut_13_0 = (ch) (Object) stackIn_13_0;
                          stackOut_13_1 = 0;
                          stackIn_14_0 = stackOut_13_0;
                          stackIn_14_1 = stackOut_13_1;
                          break L6;
                        } else {
                          stackOut_12_0 = (ch) (Object) stackIn_12_0;
                          stackOut_12_1 = 1;
                          stackIn_14_0 = stackOut_12_0;
                          stackIn_14_1 = stackOut_12_1;
                          break L6;
                        }
                      }
                      if (((ch) (Object) stackIn_14_0).a(stackIn_14_1 != 0) <= var12) {
                        if (var11 >= 0) {
                          ((dq) this).field_B.c(127, var11);
                          break L4;
                        } else {
                          return true;
                        }
                      } else {
                        L7: {
                          var13 = -var8_int + ((dq) this).field_B.d(-32240, var12);
                          var13 = var13 * var13;
                          if (var10 <= var13) {
                            var12++;
                            break L7;
                          } else {
                            var10 = var13;
                            var11 = var12;
                            var12++;
                            break L7;
                          }
                        }
                        var12++;
                        continue L5;
                      }
                    }
                  }
                }
              }
              stackOut_25_0 = 1;
              stackIn_26_0 = stackOut_25_0;
              return stackIn_26_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var8 = decompiledCaughtException;
            stackOut_31_0 = (RuntimeException) var8;
            stackOut_31_1 = new StringBuilder().append("dq.KA(").append(param0).append(44).append(param1).append(44);
            stackIn_33_0 = stackOut_31_0;
            stackIn_33_1 = stackOut_31_1;
            stackIn_32_0 = stackOut_31_0;
            stackIn_32_1 = stackOut_31_1;
            if (param2 == null) {
              stackOut_33_0 = (RuntimeException) (Object) stackIn_33_0;
              stackOut_33_1 = (StringBuilder) (Object) stackIn_33_1;
              stackOut_33_2 = "null";
              stackIn_34_0 = stackOut_33_0;
              stackIn_34_1 = stackOut_33_1;
              stackIn_34_2 = stackOut_33_2;
              break L8;
            } else {
              stackOut_32_0 = (RuntimeException) (Object) stackIn_32_0;
              stackOut_32_1 = (StringBuilder) (Object) stackIn_32_1;
              stackOut_32_2 = "{...}";
              stackIn_34_0 = stackOut_32_0;
              stackIn_34_1 = stackOut_32_1;
              stackIn_34_2 = stackOut_32_2;
              break L8;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_34_0, stackIn_34_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
        return stackIn_30_0 != 0;
    }

    private dq() throws Throwable {
        throw new Error();
    }

    final int h(int param0) {
        if (param0 != -1) {
            int discarded$0 = ((dq) this).h(-4);
            return ((dq) this).field_I;
        }
        return ((dq) this).field_I;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "Type your email address again to make sure it's correct";
        field_F = "Log";
        field_H = "Earth";
        field_G = "Passwords must be between 5 and 20 characters long";
    }
}
