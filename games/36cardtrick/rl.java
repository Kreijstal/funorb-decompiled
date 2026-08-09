/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rl extends r {
    static int field_u;
    static String field_t;

    final static void a(boolean param0, le param1, java.awt.Frame param2) {
        vi var3 = null;
        int var4 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = Main.field_T;
        try {
          L0: {
            L1: while (true) {
              var3 = param1.a((byte) -39, param2);
              L2: while (true) {
                if (var3.field_a != 0) {
                  if ((var3.field_a ^ -1) == -2) {
                    param2.setVisible(param0);
                    param2.dispose();
                    break L0;
                  } else {
                    wk.a((byte) -90, 100L);
                    continue L1;
                  }
                } else {
                  wk.a((byte) -114, 10L);
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("rl.FA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
    }

    private rl(ee param0, int param1) {
        super(param0, param1);
    }

    static long a(long param0, long param1) {
        return param0 & param1;
    }

    rl(int param0) {
        this(j.field_C, param0);
    }

    public static void c(byte param0) {
        if (param0 > -65) {
            aa var2 = (aa) null;
            rl.a((byte) -120, (aa) null, (aa) null);
        }
        field_t = null;
    }

    final static String a(CharSequence[] param0, int param1, int param2, boolean param3) {
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        CharSequence var4 = null;
        int var4_int = 0;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        CharSequence var7_ref_CharSequence = null;
        int var7 = 0;
        CharSequence var8 = null;
        int var9 = 0;
        CharSequence var10 = null;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_24_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = Main.field_T;
        try {
          L0: {
            if (0 != param2) {
              if (param2 != 1) {
                L1: {
                  var4_int = param1 + param2;
                  var5 = 0;
                  if (param3) {
                    break L1;
                  } else {
                    field_u = -12;
                    break L1;
                  }
                }
                var6_int = param1;
                L2: while (true) {
                  if (var6_int >= var4_int) {
                    var6 = new StringBuilder(var5);
                    var7 = param1;
                    L3: while (true) {
                      if (var7 >= var4_int) {
                        stackIn_24_0 = var6.toString();
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        L4: {
                          var8 = param0[var7];
                          if (var8 != null) {
                            discarded$3 = var6.append(var8);
                            break L4;
                          } else {
                            discarded$4 = var6.append("null");
                            break L4;
                          }
                        }
                        var7++;
                        continue L3;
                      }
                    }
                  } else {
                    L5: {
                      var7_ref_CharSequence = param0[var6_int];
                      if (var7_ref_CharSequence == null) {
                        var5 += 4;
                        break L5;
                      } else {
                        var5 = var5 + var7_ref_CharSequence.length();
                        break L5;
                      }
                    }
                    var6_int++;
                    continue L2;
                  }
                }
              } else {
                var10 = param0[param1];
                var4 = var10;
                if (var4 == null) {
                  stackIn_8_0 = "null";
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  return var10.toString();
                }
              }
            } else {
              stackIn_3_0 = "";
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = decompiledCaughtException;
            stackIn_27_0 = (RuntimeException) (var4_ref);

            stackIn_27_1 = new StringBuilder().append("rl.HA(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L6;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L6;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_24_0;
          }
        }
    }

    final static boolean a(byte param0, aa param1, aa param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Main.field_T;
        try {
          L0: {
            L1: {
              var3_int = -param1.field_eb + param2.field_eb;
              if (param0 > 123) {
                break L1;
              } else {
                field_u = -23;
                break L1;
              }
            }
            L2: {
              if (bc.field_b != param2.field_cb) {
                if (param2.field_cb != null) {
                  break L2;
                } else {
                  var3_int += 200;
                  break L2;
                }
              } else {
                var3_int -= 200;
                break L2;
              }
            }
            L3: {
              if (bc.field_b == param1.field_cb) {
                var3_int += 200;
                break L3;
              } else {
                if (param1.field_cb != null) {
                  break L3;
                } else {
                  var3_int -= 200;
                  break L3;
                }
              }
            }
            L4: {
              if (0 >= var3_int) {
                stackIn_14_0 = 0;
                break L4;
              } else {
                stackIn_14_0 = 1;
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3);

            stackIn_17_1 = new StringBuilder().append("rl.GA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L6;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
        return stackIn_14_0 != 0;
    }

    final String b(int param0, lk param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = 64 % ((-48 - param0) / 42);
            stackIn_1_0 = vf.a(4, param1.field_r.length(), '*');
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var3);

            stackIn_4_1 = new StringBuilder().append("rl.U(").append(param0).append(',');

            if (param1 == null) {
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
          throw ma.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(boolean param0) {
        int var1 = qf.m(-32749);
        if (param0) {
            field_u = -103;
        }
        int var2 = v.g((byte) -111);
        ij.field_f.a((byte) -115, qe.field_E - dh.field_k, var2 + (dh.field_k << -1698290335), cb.field_i + -eg.field_d, var1 - -(eg.field_d << 145322753));
        sj.a((byte) -100);
    }

    static {
        field_t = "Invalid password.";
        field_u = 0;
    }
}
