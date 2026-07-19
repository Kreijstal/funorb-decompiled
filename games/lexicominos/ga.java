/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ga {
    static int field_c;
    static String field_b;
    static sh field_a;

    final static void a(nc param0, int param1, int param2) {
        int discarded$1 = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        th var7 = null;
        th var8 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var7 = ed.field_q;
            var8 = var7;
            if (param2 > 71) {
              var8.h(param1, 0);
              var8.field_h = var8.field_h + 1;
              var4 = var8.field_h;
              var8.c(1, -1);
              var8.e(96, param0.field_j);
              var8.e(105, param0.field_k);
              var8.e(111, param0.field_l);
              var8.f(param0.field_i, -32287);
              var8.f(param0.field_q, -32287);
              var8.f(param0.field_o, -32287);
              var8.f(param0.field_s, -32287);
              var8.c(param0.field_m.length, -1);
              var5 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (param0.field_m.length <= var5) {
                      break L3;
                    } else {
                      var7.f(param0.field_m[var5], -32287);
                      var5++;
                      if (var6 != 0) {
                        break L2;
                      } else {
                        if (var6 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  discarded$1 = var8.a(var4, (byte) 29);
                  var8.d(-var4 + var8.field_h, (byte) -124);
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) (var3);
            stackOut_10_1 = new StringBuilder().append("ga.B(");
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L4;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_13_0), stackIn_13_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static void a(byte param0, boolean param1, java.awt.Canvas param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (-11 >= (wf.field_i ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    var3_int = 0;
                    if (dl.field_b) {
                      dl.field_b = false;
                      var3_int = 1;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  hd.a(aa.a((byte) 92), (byte) -90, ik.a((byte) 94), var3_int != 0, te.field_E);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                if (og.a(23440)) {
                  break L4;
                } else {
                  lf.a();
                  ra.a(320, 150, 240);
                  lj.a(0, param2, 0, (byte) -128);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (-1 != (ta.field_g ^ -1)) {
                  break L5;
                } else {
                  tg.a(param1, false, param0 + 49);
                  lj.a(0, param2, 0, (byte) -128);
                  if (var4 == 0) {
                    break L1;
                  } else {
                    break L5;
                  }
                }
              }
              uj.a(param0 + -126, param2);
              break L1;
            }
            if (param0 == 57) {
              break L0;
            } else {
              field_b = (String) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var3);
            stackOut_16_1 = new StringBuilder().append("ga.A(").append(param0).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
    }

    final static void b(int param0) {
        if (param0 != 0) {
            return;
        }
        di.field_x.b(123, new mh());
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 0) {
            java.awt.Canvas var2 = (java.awt.Canvas) null;
            ga.a((byte) -81, true, (java.awt.Canvas) null);
        }
    }

    static {
        field_c = 0;
        field_b = "GAME OVER";
    }
}
