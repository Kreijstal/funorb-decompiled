/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wd extends hl {
    static String field_H;
    private int field_N;
    private int field_M;
    private int field_L;
    static String field_J;
    static String field_I;
    private int field_Q;
    static boolean field_R;
    private int field_K;
    static String[] field_O;
    private int field_P;

    boolean j(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var5 = 0;
        int var4 = 0;
        if (((wd) this).field_N <= 0) {
        } else {
            var2 = ((wd) this).field_M;
            var3 = ((wd) this).field_L;
            int fieldTemp$0 = ((wd) this).field_Q + 1;
            ((wd) this).field_Q = ((wd) this).field_Q + 1;
            if (((wd) this).field_N > fieldTemp$0) {
                var4 = (((wd) this).field_N * 2 + -((wd) this).field_Q) * ((wd) this).field_Q;
                var5 = ((wd) this).field_N * ((wd) this).field_N;
                var2 = ((wd) this).field_P + var4 * (-((wd) this).field_P + ((wd) this).field_M) / var5;
                var3 = var4 * (((wd) this).field_L - ((wd) this).field_K) / var5 + ((wd) this).field_K;
            } else {
                ((wd) this).field_N = 0;
                ((wd) this).a((byte) -48);
            }
            ((wd) this).a(var2, (byte) -78, var3);
        }
        return super.j(-87);
    }

    final static StringBuilder a(StringBuilder param0) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var6 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            var4_int = param0.length();
            param0.setLength(0);
            var5 = var4_int;
            L1: while (true) {
              if (var5 >= 0) {
                stackOut_6_0 = (StringBuilder) param0;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                param0.setCharAt(var5, ' ');
                var5++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("wd.F(");
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
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + ' ' + ',' + 0 + ',' + 1 + ')');
        }
        return stackIn_7_0;
    }

    boolean k(int param0) {
        ((wd) this).o(0);
        return super.k(0);
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        if (!(0 < param1)) {
            ((wd) this).a(param0, (byte) -75, param3);
            return;
        }
        ((wd) this).field_P = ((wd) this).field_x;
        ((wd) this).field_L = param3;
        ((wd) this).field_Q = 0;
        ((wd) this).field_K = ((wd) this).field_u;
        if (param2) {
            return;
        }
        ((wd) this).field_M = param0;
        ((wd) this).field_N = param1;
    }

    final static k q() {
        return qc.field_e;
    }

    public static void p() {
        field_J = null;
        field_I = null;
        field_H = null;
        field_O = null;
    }

    void o(int param0) {
        if (0 >= ((wd) this).field_N) {
            return;
        }
        ((wd) this).a(((wd) this).field_M, (byte) -88, ((wd) this).field_L);
        ((wd) this).field_N = param0;
        ((wd) this).a((byte) -48);
    }

    wd(vl param0, int param1, int param2) {
        super(param0, param1, param2);
        ((wd) this).field_N = 0;
        ((wd) this).field_Q = 0;
    }

    void b(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = TrackController.field_F ? 1 : 0;
        ll.b(6 + param0, param2 + 35, ((wd) this).field_x - 12, -40 + ((wd) this).field_u, 2105376, 0);
        var5 = 211;
        var4 = 35;
        var6 = 194;
        var7 = 0;
        var8 = param2;
        L0: while (true) {
          if (~var7 <= ~var4) {
            L1: {
              var4 = 22;
              if (param1 == 20) {
                break L1;
              } else {
                field_I = null;
                break L1;
              }
            }
            var6 = 169;
            var5 = 194;
            var7 = 0;
            var8 = 35 + param2;
            L2: while (true) {
              if (var4 <= var7) {
                ol.field_n.e(param0 - -((wd) this).field_x + -90, param2 + 10);
                hc.a(param0 + 5, param2 - -35, ((wd) this).field_x - 10, wj.field_a, -22081);
                hc.a(param0, param2 + (((wd) this).field_u + -22), ((wd) this).field_x, kf.field_d, param1 ^ -22101);
                var6 = 127;
                var4 = -79 + ((wd) this).field_u;
                var5 = 169;
                var7 = 0;
                var8 = 57 + param2;
                L3: while (true) {
                  if (var4 <= var7) {
                    return;
                  } else {
                    var9 = var7 * (-var5 + var6) / var4 + var5;
                    var9 = var9 | (var9 << 8 | var9 << 16);
                    ll.a(param0, var8, 6, var9);
                    ll.a(param0 - (-((wd) this).field_x - -6), var8, 6, var9);
                    var7++;
                    var8++;
                    continue L3;
                  }
                }
              } else {
                var9 = var7 * (-var5 + var6) / var4 + var5;
                var9 = var9 | (var9 << 8 | var9 << 16);
                ll.a(param0, var8, 6, var9);
                ll.a(-6 + param0 - -((wd) this).field_x, var8, 6, var9);
                var7++;
                var8++;
                continue L2;
              }
            }
          } else {
            L4: {
              if (~ll.field_b < ~var8) {
                break L4;
              } else {
                if (ll.field_g <= var8) {
                  break L4;
                } else {
                  L5: {
                    var9 = var5 - -((-var5 + var6) * var7 / var4);
                    var10 = 0;
                    var11 = ((wd) this).field_x;
                    if (var7 > 20) {
                      break L5;
                    } else {
                      L6: while (true) {
                        if (var10 > 20) {
                          break L5;
                        } else {
                          L7: {
                            var12 = (-var10 + 20) * (-var10 + 20) + (20 - var7) * (20 + -var7);
                            if (var12 <= 462) {
                              if (var12 < 420) {
                                break L5;
                              } else {
                                var13 = (462 - var12) * var9 / 42;
                                var13 = var13 | (var13 << 8 | var13 << 16);
                                ll.field_i[param0 + (var8 * ll.field_d - -var10)] = var13;
                                break L7;
                              }
                            } else {
                              break L7;
                            }
                          }
                          var10++;
                          continue L6;
                        }
                      }
                    }
                  }
                  L8: {
                    if (var7 <= 20) {
                      var12 = var11;
                      var11 -= 21;
                      var13 = 0;
                      L9: while (true) {
                        L10: {
                          if (var13 > 20) {
                            break L10;
                          } else {
                            var14 = var13 * var13 + (-var7 + 20) * (20 + -var7);
                            if (var14 <= 462) {
                              L11: {
                                if (var14 < 420) {
                                  var12 = var11 + 1;
                                  break L11;
                                } else {
                                  var15 = var9 * (-var14 + 462) / 42;
                                  var15 = var15 | (var15 << 16 | var15 << 8);
                                  ll.field_i[param0 + var8 * ll.field_d - -var11] = var15;
                                  break L11;
                                }
                              }
                              var13++;
                              var11++;
                              continue L9;
                            } else {
                              break L10;
                            }
                          }
                        }
                        var11 = var12;
                        break L8;
                      }
                    } else {
                      break L8;
                    }
                  }
                  var9 = var9 | (var9 << 16 | var9 << 8);
                  ll.a(param0 + var10, var8, var11 - var10, var9);
                  break L4;
                }
              }
            }
            var7++;
            var8++;
            continue L0;
          }
        }
    }

    void a(byte param0) {
        if (param0 != -48) {
            ((wd) this).field_M = -89;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Email address is unavailable";
        field_I = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_O = new String[]{"Showing by rating", "Showing by win percentage"};
        field_J = "Names cannot start or end with space or underscore";
    }
}
