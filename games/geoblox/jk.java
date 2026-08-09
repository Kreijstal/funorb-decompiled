/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jk {
    static boolean field_a;
    static int field_d;
    static String field_b;
    static String field_c;

    final static void a(byte param0) {
        d var2;
        if (vl.field_n != null) {
          nb.a(-2, vl.field_n);
          vl.field_n.a(0, ka.field_i);
          if (param0 > -14) {
            L0: {
              var2 = (d) null;
              jk.a((java.awt.Frame) null, 17, (d) null);
              vl.field_n = null;
              if (null != rb.field_d) {
                rb.field_d.b((byte) -101);
                break L0;
              } else {
                break L0;
              }
            }
            f.field_kb.requestFocus();
            return;
          } else {
            L1: {
              vl.field_n = null;
              if (null != rb.field_d) {
                rb.field_d.b((byte) -101);
                break L1;
              } else {
                break L1;
              }
            }
            f.field_kb.requestFocus();
            return;
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != -10848) {
            field_c = (String) null;
            field_b = null;
            field_c = null;
            return;
        }
        field_b = null;
        field_c = null;
    }

    final static void b(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        double var3 = 0.0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var5 = Geoblox.field_C;
        try {
          L0: {
            mh.b();
            ok.field_g = 11;
            jf.field_b = new int[260];
            var1_int = -29 / ((param0 - -40) / 45);
            var2 = 0;
            L1: while (true) {
              if (256 <= var2) {
                var6 = 256;
                var1_int = var6;
                L2: while (true) {
                  if (jf.field_b.length <= var6) {
                    break L0;
                  } else {
                    jf.field_b[var6] = 255;
                    var6++;
                    continue L2;
                  }
                }
              } else {
                var3 = 15.0;
                jf.field_b[var2] = (int)(255.0 * Math.pow((double)((float)var2 / 256.0f), var3));
                var2++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "jk.F(" + param0 + ')');
        }
    }

    final static int a(boolean param0) {
        if (param0) {
            jk.a(-65);
            return gh.field_P;
        }
        return gh.field_P;
    }

    final static nd a(int param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        nd stackIn_5_0 = null;
        nd stackIn_9_0 = null;
        nd stackIn_18_0 = null;
        nd stackIn_21_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              var2_int = param1.length();
              if (param0 == 255) {
                break L1;
              } else {
                jk.a(118);
                break L1;
              }
            }
            if (0 != var2_int) {
              if (-64 > (var2_int ^ -1)) {
                stackIn_9_0 = hk.field_x;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                var3 = 0;
                L2: while (true) {
                  if (var2_int > var3) {
                    L3: {
                      var4 = param1.charAt(var3);
                      if (45 != var4) {
                        if ((pk.field_q.indexOf(var4) ^ -1) != 0) {
                          break L3;
                        } else {
                          stackIn_21_0 = ii.field_h;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      } else {
                        L4: {
                          if (-1 == (var3 ^ -1)) {
                            break L4;
                          } else {
                            if (var3 == -1 + var2_int) {
                              break L4;
                            } else {
                              break L3;
                            }
                          }
                        }
                        stackIn_18_0 = ii.field_h;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      }
                    }
                    var3++;
                    continue L2;
                  } else {
                    return null;
                  }
                }
              }
            } else {
              stackIn_5_0 = pj.field_f;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var2 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("jk.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L5;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0;
            } else {
              return stackIn_21_0;
            }
          }
        }
    }

    final static void a(java.awt.Frame param0, int param1, d param2) {
        cb var3 = null;
        int var4 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = Geoblox.field_C;
        try {
          L0: {
            L1: while (true) {
              var3 = param2.a(param0, 0);
              L2: while (true) {
                if (var3.field_a != 0) {
                  if ((var3.field_a ^ -1) != -2) {
                    bc.a(0, 100L);
                    continue L1;
                  } else {
                    L3: {
                      param0.setVisible(false);
                      if (param1 == 10) {
                        break L3;
                      } else {
                        field_b = (String) null;
                        break L3;
                      }
                    }
                    param0.dispose();
                    break L0;
                  }
                } else {
                  bc.a(0, 10L);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var3_ref);

            stackIn_13_1 = new StringBuilder().append("jk.C(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_16_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L5;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L5;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), stackIn_17_2 + ')');
        }
    }

    static {
        field_d = 0;
        field_a = false;
        field_b = "If you do nothing the game will revert to normal view in <%0> seconds.";
        field_c = "Return to game";
    }
}
