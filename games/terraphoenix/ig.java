/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    static ci field_a;
    static String field_c;
    static String field_b;
    static tf field_e;
    static String field_d;

    final static dj[] a(int param0, uc param1) {
        int var2_int = 0;
        int var3 = 0;
        dj[] var4 = null;
        int var5 = 0;
        dj var6_ref_dj = null;
        int var6 = 0;
        int var7 = 0;
        Object stackIn_3_0 = null;
        dj[] stackIn_6_0 = null;
        dj[] stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var7 = Terraphoenix.field_V;
        try {
          L0: {
            var2_int = param1.a(false, 8);
            if (0 >= var2_int) {
              var3 = param1.a(false, 12);
              var4 = new dj[var3];
              if (param0 == -25831) {
                var5 = 0;
                L1: while (true) {
                  if (var3 <= var5) {
                    stackIn_15_0 = (dj[]) (var4);
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    L2: {
                      if (!ma.a(param1, (byte) 98)) {
                        var6 = param1.a(false, fb.b(2, var5 - 1));
                        var4[var5] = var4[var6];
                        break L2;
                      } else {
                        var6_ref_dj = new dj();
                        param1.a(false, 24);
                        param1.a(false, 24);
                        var6_ref_dj.field_b = param1.a(false, 24);
                        param1.a(false, 9);
                        param1.a(false, 12);
                        param1.a(false, 12);
                        param1.a(false, 12);
                        var4[var5] = var6_ref_dj;
                        break L2;
                      }
                    }
                    var5++;
                    continue L1;
                  }
                }
              } else {
                stackIn_6_0 = (dj[]) null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var2);

            stackIn_18_1 = new StringBuilder().append("ig.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L3;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L3;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (dj[]) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    final static byte[] a(int param0, int param1, uc param2, byte[] param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        byte[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Terraphoenix.field_V;
        try {
          L0: {
            if (param1 > 81) {
              var4_int = param2.a(false, param0);
              if (-1 != (var4_int ^ -1)) {
                L1: {
                  L2: {
                    if (param3 == null) {
                      break L2;
                    } else {
                      if (param3.length != var4_int) {
                        break L2;
                      } else {
                        break L1;
                      }
                    }
                  }
                  param3 = new byte[var4_int];
                  break L1;
                }
                L3: {
                  var5 = param2.a(false, 3);
                  var6 = (byte)param2.a(false, 8);
                  if (0 < var5) {
                    var7 = 0;
                    L4: while (true) {
                      if (var4_int <= var7) {
                        break L3;
                      } else {
                        param3[var7] = (byte)(var6 + param2.a(false, var5));
                        var7++;
                        continue L4;
                      }
                    }
                  } else {
                    var7 = 0;
                    L5: while (true) {
                      if (var4_int <= var7) {
                        break L3;
                      } else {
                        param3[var7] = (byte)var6;
                        var7++;
                        continue L5;
                      }
                    }
                  }
                }
                stackIn_19_0 = (byte[]) (param3);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_6_0 = null;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_3_0 = (byte[]) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var4);

            stackIn_22_1 = new StringBuilder().append("ig.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L6;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',');

            if (param3 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_23_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return (byte[]) ((Object) stackIn_6_0);
          } else {
            return stackIn_19_0;
          }
        }
    }

    final static void a(int param0, int param1) {
        try {
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            uc var3 = null;
            try {
              L0: {
                L1: {
                  if (param1 == 12) {
                    break L1;
                  } else {
                    var3 = (uc) null;
                    ig.a(47, (uc) null);
                    break L1;
                  }
                }
                cd.a(dg.a(false), "resizing", new Object[]{new Integer(param0)}, 10056);
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                var2 = decompiledCaughtException;
                break L2;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static ci[] a(fa param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        uc var6 = null;
        ci[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 0) {
                break L1;
              } else {
                var6 = (uc) null;
                ig.a(-76, (uc) null);
                break L1;
              }
            }
            var4_int = param0.c(-1, param3);
            var5 = param0.a(-104, var4_int, param2);
            stackIn_3_0 = pb.a(var4_int, false, var5, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("ig.E(");

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    public static void a(int param0) {
        field_a = null;
        field_c = null;
        if (param0 < 98) {
          field_d = (String) null;
          field_d = null;
          field_b = null;
          field_e = null;
          return;
        } else {
          field_d = null;
          field_b = null;
          field_e = null;
          return;
        }
    }

    static {
        field_c = "Allied Soldier";
        field_b = "Open in popup window";
        field_d = "Age:";
    }
}
