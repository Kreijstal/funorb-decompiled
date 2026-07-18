/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ko {
    static int[] field_c;
    static int field_b;
    static String field_a;

    public static void b() {
        field_c = null;
        field_a = null;
    }

    final static long a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        long var2_long = 0L;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Object var8 = null;
        long stackIn_22_0 = 0L;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        long stackOut_21_0 = 0L;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var7 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              var2_long = 0L;
              var4 = param0.length();
              if (param1 == -13820) {
                break L1;
              } else {
                var8 = null;
                break L1;
              }
            }
            var5 = 0;
            L2: while (true) {
              L3: {
                if (var4 <= var5) {
                  break L3;
                } else {
                  L4: {
                    L5: {
                      var2_long = var2_long * 37L;
                      var6 = param0.charAt(var5);
                      if (var6 < 65) {
                        break L5;
                      } else {
                        if (var6 <= 90) {
                          var2_long = var2_long + (long)(-65 + (var6 + 1));
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var6 < 97) {
                        break L6;
                      } else {
                        if (var6 > 122) {
                          break L6;
                        } else {
                          var2_long = var2_long + (long)(1 - (-var6 + 97));
                          break L4;
                        }
                      }
                    }
                    if (var6 < 48) {
                      break L4;
                    } else {
                      if (var6 > 57) {
                        break L4;
                      } else {
                        var2_long = var2_long + (long)(-21 + var6);
                        break L4;
                      }
                    }
                  }
                  if (var2_long >= 177917621779460413L) {
                    break L3;
                  } else {
                    var5++;
                    continue L2;
                  }
                }
              }
              L7: while (true) {
                L8: {
                  if (var2_long % 37L != 0L) {
                    break L8;
                  } else {
                    if (var2_long == 0L) {
                      break L8;
                    } else {
                      var2_long = var2_long / 37L;
                      continue L7;
                    }
                  }
                }
                stackOut_21_0 = var2_long;
                stackIn_22_0 = stackOut_21_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("ko.E(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L9;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L9;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param1 + ')');
        }
        return stackIn_22_0;
    }

    final static mf[] a() {
        int var1 = 0;
        return new mf[]{ja.field_Wb, gj.field_s, ho.field_n};
    }

    final static hj[] a(boolean param0) {
        int var1 = 0;
        int var4 = HoldTheLine.field_D;
        hj[] var2 = new hj[28];
        hj var3 = dl.a(fb.field_i, "overlayfont", false, "");
        for (var1 = 0; var1 < 10; var1++) {
            var2[var1] = fj.a(0, 30 * var1, var3, 50, 0, 30);
        }
        var2[24] = fj.a(0, 300, var3, 20, 0, 40);
        var2[26] = fj.a(0, 340, var3, 20, 0, 40);
        for (var1 = 0; var1 < 10; var1++) {
            var2[var1 + 10] = fj.a(0, 20 * var1, var3, 20, 60, 20);
        }
        var2[27] = fj.a(0, 300, var3, 20, 70, 15);
        var2[25] = fj.a(0, 320, var3, 30, 60, 75);
        for (var1 = 0; var1 < 4; var1++) {
            var2[20 - -var1] = fj.a(0, var1 * 60, var3, 30, 90, 60);
        }
        return var2;
    }

    final static void a(byte param0, java.awt.Canvas param1, boolean param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var4 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              if (10 > pf.field_d) {
                L2: {
                  var3_int = 0;
                  if (cg.field_a) {
                    cg.field_a = false;
                    var3_int = 1;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                int discarded$154 = 118;
                jd.a(q.b(), dm.field_d, ni.a((byte) -120), 300, var3_int != 0);
                break L1;
              } else {
                if (!ge.a(true)) {
                  tc.c();
                  int discarded$155 = 320;
                  int discarded$156 = 240;
                  int discarded$157 = -76;
                  vb.a();
                  int discarded$158 = 0;
                  int discarded$159 = 1;
                  int discarded$160 = 0;
                  hi.a(param1);
                  break L1;
                } else {
                  if (bk.field_w != 0) {
                    ck.a((byte) -97, param1);
                    break L1;
                  } else {
                    vk.a(param2, false, 86);
                    int discarded$161 = 0;
                    int discarded$162 = 1;
                    int discarded$163 = 0;
                    hi.a(param1);
                    break L1;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var3;
            stackOut_12_1 = new StringBuilder().append("ko.D(").append(-63).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0;
        field_a = "<col=2>You are not currently logged in.</col><br><br>To store your score, progress or achievements, you must log in or register by clicking <col=1>Log in/Register</col> above.<br><br>Otherwise, click <col=1>Discard</col> to lose them and continue.";
        field_c = fc.a(-117, 25, 4);
    }
}
