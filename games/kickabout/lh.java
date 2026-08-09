/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh extends tm {
    static int[][] field_E;
    static al field_D;
    static String field_A;
    static String field_C;
    static String field_F;

    final static ut a(int param0, byte param1, int param2) {
        ut var3;
        int var4;
        int var5;
        ut var6;
        var5 = Kickabout.field_G;
        if (param1 != -96) {
          return (ut) null;
        } else {
          var6 = new ut(param2, param2);
          var3 = var6;
          var4 = 0;
          L0: while (true) {
            if (var3.field_y.length <= var4) {
              return var3;
            } else {
              var6.field_y[var4] = param0;
              var4++;
              continue L0;
            }
          }
        }
    }

    lh(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static String a(int param0, int param1, String param2) {
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        String stackIn_13_0 = null;
        String stackIn_17_0 = null;
        String stackIn_20_0 = null;
        String stackIn_24_0 = null;
        Object stackIn_26_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        ml var5 = null;
        CharSequence var6 = null;
        try {
          L0: {
            var6 = (CharSequence) ((Object) param2);
            if (ef.a(var6, param1 + -10007)) {
              if ((ts.field_d ^ -1) != -3) {
                stackIn_6_0 = ss.field_h;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                if (hm.a((byte) 82, param2)) {
                  stackIn_10_0 = ec.field_g;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (!lf.a(param2, -64)) {
                    L1: {
                      if (param1 > bc.field_d) {
                        break L1;
                      } else {
                        if (-1 > (eq.field_d ^ -1)) {
                          break L1;
                        } else {
                          stackIn_17_0 = jg.field_A;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        }
                      }
                    }
                    if (-201 < (bc.field_d ^ -1)) {
                      if (hi.a(0, param2)) {
                        stackIn_24_0 = vo.a((byte) -18, at.field_Gb, new String[]{param2});
                        decompiledRegionSelector0 = 6;
                        break L0;
                      } else {
                        var5 = or.field_d;
                        var5.b(param0, (byte) 93);
                        var5.field_n = var5.field_n + 1;
                        var4 = var5.field_n;
                        var5.a(123, 0);
                        var5.a(param1 ^ 14090, param2);
                        var5.c(62, -var4 + var5.field_n);
                        stackIn_26_0 = null;
                        decompiledRegionSelector0 = 7;
                        break L0;
                      }
                    } else {
                      stackIn_20_0 = jg.field_A;
                      decompiledRegionSelector0 = 5;
                      break L0;
                    }
                  } else {
                    stackIn_13_0 = vo.a((byte) -18, ah.field_m, new String[]{param2});
                    decompiledRegionSelector0 = 3;
                    break L0;
                  }
                }
              }
            } else {
              stackIn_2_0 = kq.field_Ib;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_29_0 = (RuntimeException) (var3);

            stackIn_29_1 = new StringBuilder().append("lh.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L2;
            } else {
              stackIn_30_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L2;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_10_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_13_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_17_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_20_0;
                  } else {
                    if (decompiledRegionSelector0 == 6) {
                      return stackIn_24_0;
                    } else {
                      return (String) ((Object) stackIn_26_0);
                    }
                  }
                }
              }
            }
          }
        }
    }

    public static void g(byte param0) {
        field_A = null;
        field_C = null;
        if (param0 != 96) {
            return;
        }
        field_F = null;
        field_D = null;
        field_E = (int[][]) null;
    }

    final li a(byte param0, li[] param1) {
        RuntimeException var3 = null;
        li stackIn_2_0 = null;
        li stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == 84) {
              lb.a(-28153, (String) (param1[0].field_d));
              stackIn_4_0 = new li("void");
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (li) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("lh.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw nb.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static bc a(iw param0, int param1) {
        bc var2 = null;
        RuntimeException var2_ref = null;
        String var3 = null;
        bc stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 18653) {
                break L1;
              } else {
                var3 = (String) null;
                lh.a(8, 73, (String) null);
                break L1;
              }
            }
            var2 = new bc();
            var2.a(param0, 62);
            stackIn_3_0 = (bc) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2_ref);

            stackIn_6_1 = new StringBuilder().append("lh.D(");

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
          throw nb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_C = "Amateur Teams";
        field_F = "Go to Auctions";
    }
}
