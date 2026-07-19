/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie {
    static int field_a;
    static le field_b;
    static String field_c;

    public static void a(int param0) {
        if (param0 != -1962602524) {
            field_a = 6;
        }
        field_b = null;
        field_c = null;
    }

    final static int a(int param0, byte param1) {
        int var2 = param0 >>> 1157703521;
        var2 = var2 | var2 >>> 427432513;
        var2 = var2 | var2 >>> -1363131230;
        var2 = var2 | var2 >>> -1962602524;
        if (param1 != -59) {
            field_c = (String) null;
        }
        var2 = var2 | var2 >>> -704762520;
        var2 = var2 | var2 >>> 931016496;
        return param0 & (var2 ^ -1);
    }

    final static void b(int param0) {
        km var1 = null;
        km var2 = null;
        int var3 = 0;
        int var4 = Chess.field_G;
        try {
            var1 = new km(param0, 140);
            tl.a((byte) -67, var1);
            nh.a();
            wb.b();
            sl.field_a = 0;
            di.k(9);
            var2 = var1.c();
            for (var3 = 0; (var3 ^ -1) > -16; var3++) {
                var2.c(-2, -2, 16777215);
                wb.e(4, 4, 0, 0, 540, 140);
            }
            tg.field_u.e();
            var1.c(0, 0);
            fd.a(28773);
        } catch (RuntimeException runtimeException) {
            throw fk.a((Throwable) ((Object) runtimeException), "ie.C(" + param0 + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_2_0 = 0;
        var4 = Chess.field_G;
        try {
          L0: {
            var3_int = 0;
            if (param1 == -1) {
              L1: while (true) {
                if (-1 <= (param0 ^ -1)) {
                  stackOut_6_0 = var3_int;
                  stackIn_7_0 = stackOut_6_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var3_int = param2 & 1 | var3_int << 1862290177;
                  param2 = param2 >>> 1;
                  param0--;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = 77;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var3), "ie.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_7_0;
        }
    }

    final static sa a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        sa stackIn_3_0 = null;
        sa stackIn_7_0 = null;
        sa stackIn_10_0 = null;
        sa stackIn_20_0 = null;
        sa stackIn_23_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        sa stackOut_6_0 = null;
        sa stackOut_19_0 = null;
        sa stackOut_22_0 = null;
        sa stackOut_9_0 = null;
        sa stackOut_2_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        var5 = Chess.field_G;
        try {
          L0: {
            if (param1 == -55) {
              var2_int = param0.length();
              if (var2_int == 0) {
                stackOut_6_0 = ef.field_j;
                stackIn_7_0 = stackOut_6_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (63 >= var2_int) {
                  var3 = 0;
                  L1: while (true) {
                    if (var3 < var2_int) {
                      L2: {
                        var4 = param0.charAt(var3);
                        if (var4 == 45) {
                          L3: {
                            if (0 == var3) {
                              break L3;
                            } else {
                              if (var3 == -1 + var2_int) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                          stackOut_19_0 = wh.field_b;
                          stackIn_20_0 = stackOut_19_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        } else {
                          if (-1 != oc.field_m.indexOf(var4)) {
                            break L2;
                          } else {
                            stackOut_22_0 = wh.field_b;
                            stackIn_23_0 = stackOut_22_0;
                            decompiledRegionSelector0 = 4;
                            break L0;
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
                  stackOut_9_0 = ok.field_Ob;
                  stackIn_10_0 = stackOut_9_0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                }
              }
            } else {
              stackOut_2_0 = (sa) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) (var2);
            stackOut_26_1 = new StringBuilder().append("ie.D(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param0 == null) {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L4;
            } else {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L4;
            }
          }
          throw fk.a((Throwable) ((Object) stackIn_29_0), stackIn_29_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_7_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_20_0;
              } else {
                return stackIn_23_0;
              }
            }
          }
        }
    }

    final static void a(boolean param0, byte param1, int param2) {
        dh var4_ref_dh = null;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        ve var3 = ca.a(param0, param2, -128);
        if (!(var3 == null)) {
            pi.field_d.a(0, false);
            var4_ref_dh = pi.field_d;
            var5_ref_String = ef.field_m;
            var4_ref_dh.field_b.a((byte) -12, var5_ref_String, 5);
            var4_ref_dh = pi.field_d;
            var5 = re.field_m;
            var6 = ag.field_f;
            var4_ref_dh.field_b.a(true, var5, 0, var6, 0);
        }
        int var4 = 89 / ((param1 - -25) / 46);
        vc.a((byte) 68, param0, param2);
    }

    static {
        field_c = "Email is valid";
        field_a = 0;
    }
}
