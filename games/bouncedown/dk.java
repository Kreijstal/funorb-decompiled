/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk {
    static int field_a;
    static String field_b;
    static int field_c;

    final static void a(int param0, int param1, wi param2, int param3, java.math.BigInteger param4, java.math.BigInteger param5, byte[] param6) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        var10 = Bounce.field_N;
        try {
          L0: {
            L1: {
              var7_int = ca.a(param0, (byte) 27);
              if (null == ug.field_g) {
                ug.field_g = new java.security.SecureRandom();
                break L1;
              } else {
                break L1;
              }
            }
            var13 = new int[4];
            var12 = var13;
            var8 = var12;
            var9 = 0;
            L2: while (true) {
              if ((var9 ^ -1) <= -5) {
                L3: {
                  L4: {
                    if (ae.field_a == null) {
                      break L4;
                    } else {
                      if (var7_int <= ae.field_a.field_i.length) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  ae.field_a = new wi(var7_int);
                  break L3;
                }
                L5: {
                  L6: {
                    ae.field_a.field_h = 0;
                    ae.field_a.a(param1, true, param0, param6);
                    ae.field_a.a(var7_int, false);
                    ae.field_a.a(var13, 4);
                    if (null == fb.field_jb) {
                      break L6;
                    } else {
                      if ((fb.field_jb.field_i.length ^ -1) <= -101) {
                        break L5;
                      } else {
                        break L6;
                      }
                    }
                  }
                  fb.field_jb = new wi(100);
                  break L5;
                }
                fb.field_jb.field_h = 0;
                fb.field_jb.a(10, (byte) 54);
                var11 = param3;
                var9 = var11;
                L7: while (true) {
                  if (4 <= var11) {
                    fb.field_jb.e(param3 ^ -750655096, param0);
                    fb.field_jb.a((byte) 50, param5, param4);
                    param2.a(0, true, fb.field_jb.field_h, fb.field_jb.field_i);
                    param2.a(0, true, ae.field_a.field_h, ae.field_a.field_i);
                    break L0;
                  } else {
                    fb.field_jb.b(var13[var11], (byte) -46);
                    var11++;
                    continue L7;
                  }
                }
              } else {
                var8[var9] = ug.field_g.nextInt();
                var9++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var7 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var7);

            stackIn_22_1 = new StringBuilder().append("dk.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L8;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L8;
            }
          }
          L9: {


            stackIn_25_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_23_2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L9;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_28_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_26_2).append(',');

            if (param5 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L10;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L10;
            }
          }
          L11: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');

            if (param6 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L11;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L11;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_23_0), stackIn_32_2 + ')');
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_b = null;
    }

    final static lj a(int param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        lj stackIn_4_0 = null;
        lj stackIn_7_0 = null;
        lj stackIn_17_0 = null;
        lj stackIn_21_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = Bounce.field_N;
        try {
          L0: {
            var2_int = param1.length();
            if (-1 == (var2_int ^ -1)) {
              stackIn_4_0 = uc.field_E;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              if ((var2_int ^ -1) >= param0) {
                var3 = 0;
                L1: while (true) {
                  if (var2_int > var3) {
                    L2: {
                      var4 = param1.charAt(var3);
                      if (var4 == 45) {
                        L3: {
                          if (0 == var3) {
                            break L3;
                          } else {
                            if (var3 != -1 + var2_int) {
                              break L2;
                            } else {
                              break L3;
                            }
                          }
                        }
                        stackIn_17_0 = mh.field_R;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        if (0 == (vh.field_g.indexOf(var4) ^ -1)) {
                          stackIn_21_0 = mh.field_R;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                    var3++;
                    continue L1;
                  } else {
                    return null;
                  }
                }
              } else {
                stackIn_7_0 = lk.field_t;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_26_0 = (RuntimeException) (var2);

            stackIn_26_1 = new StringBuilder().append("dk.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L4;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L4;
            }
          }
          throw ii.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_17_0;
            } else {
              return stackIn_21_0;
            }
          }
        }
    }

    final static void a(boolean param0, int param1, int param2) {
        if (param0) {
            field_a = 1;
        }
        int var3 = 1 << param1;
        if (0 != (ui.field_g & var3)) {
            return;
        }
        kb.field_a = kb.field_a | var3;
        ui.field_g = ui.field_g | var3;
        ci.field_F.a(1, new ab(param1));
        if (!bf.field_k) {
            if (jh.b(767564065)) {
                m.field_c.a(1, new ke(param1, param2, qf.field_c, vg.field_j, nb.field_a, ve.field_a));
            } else {
                hc.a(param1, vg.field_j, param2, qf.field_c, 4, (byte) -127, ve.field_a, nb.field_a);
            }
        }
    }

    static {
        field_b = "Waiting for graphics";
        field_a = 0;
    }
}
