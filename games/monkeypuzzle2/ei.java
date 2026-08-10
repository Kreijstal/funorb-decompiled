/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei {
    static java.awt.Image field_b;
    static int field_a;

    final static cd a(java.applet.Applet param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        cd[] var4 = null;
        int var5 = 0;
        cd var6 = null;
        int var7 = 0;
        cd stackIn_4_0 = null;
        cd stackIn_10_0 = null;
        cd stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var3 = 13 / ((param1 - 49) / 51);
            var2 = dl.a(param0, 14278, "jagex-last-login-method");
            if (var2 == null) {
              stackIn_4_0 = jf.field_k;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var4 = si.f(0);
              var5 = 0;
              L1: while (true) {
                if (var5 >= var4.length) {
                  stackIn_13_0 = jf.field_k;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var6 = var4[var5];
                  if (var6.a(var2, -1)) {
                    stackIn_10_0 = (cd) (var6);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2_ref);

            stackIn_16_1 = new StringBuilder().append("ei.A(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    public static void a(int param0) {
        if (param0 != -22787) {
            ud var2 = (ud) null;
            ei.a((ad) null, (byte) 11, (ud) null, 44, -94);
        }
        field_b = null;
    }

    final static void b(int param0) {
        int fieldTemp$2 = 0;
        hb var1 = null;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var3 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 8) {
                break L1;
              } else {
                field_a = 33;
                break L1;
              }
            }
            var1 = gf.field_c;
            L2: while (true) {
              if (!kj.m(0)) {
                break L0;
              } else {
                var1.b(true, 8);
                fieldTemp$2 = var1.field_h + 1;
                var1.field_h = var1.field_h + 1;
                var2 = fieldTemp$2;
                nf.a(param0 ^ -93, var1);
                gf.field_c.a(var1.field_h + -var2, (byte) 31);
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1_ref), "ei.B(" + param0 + ')');
        }
    }

    final static lg a(ad param0, byte param1, ud param2, int param3, int param4) {
        byte[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        byte[] var7 = null;
        lg stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var7 = param0.b(255, param3, param4);
            var5 = var7;
            var6 = 16 / ((param1 - 67) / 42);
            if (var7 != null) {
              stackIn_4_0 = new lg(new gk(var7), param2);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5_ref);

            stackIn_7_1 = new StringBuilder().append("ei.D(");

            if (param0 == null) {
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
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param3 + ',' + param4 + ')');
        }
        return stackIn_4_0;
    }

    static {
        field_a = 0;
    }
}
