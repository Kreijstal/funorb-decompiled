/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class jj extends ln {
    static e field_p;
    int field_o;

    final static void a(int param0, String param1, float param2) {
        aa.field_m = param1;
        if (param0 < 79) {
            return;
        }
        try {
            nj.field_e = param2;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "jj.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void f(int param0) {
        field_p = null;
        int var1 = -28 / ((44 - param0) / 47);
    }

    final static String a(byte param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -53) {
                break L1;
              } else {
                field_p = (e) null;
                break L1;
              }
            }
            stackIn_3_0 = ae.a(param1, (byte) -44, param1.length, 0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("jj.F(").append(param0).append(',');

            if (param1 == null) {
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
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static mf a(java.applet.Applet param0, byte param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        mf[] var3 = null;
        int var4 = 0;
        mf var5 = null;
        int var6 = 0;
        mf stackIn_4_0 = null;
        mf stackIn_12_0 = null;
        mf stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var6 = HoldTheLine.field_D;
        try {
          L0: {
            var2 = ph.a("jagex-last-login-method", (byte) 30, param0);
            if (var2 == null) {
              stackIn_4_0 = ho.field_n;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (param1 == 124) {
                  break L1;
                } else {
                  field_p = (e) null;
                  break L1;
                }
              }
              var3 = ko.a(84);
              var4 = 0;
              L2: while (true) {
                if (var4 >= var3.length) {
                  stackIn_15_0 = ho.field_n;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  var5 = var3[var4];
                  if (var5.a(param1 ^ 37, var2)) {
                    stackIn_12_0 = (mf) (var5);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    var4++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var2_ref);

            stackIn_18_1 = new StringBuilder().append("jj.B(");

            if (param0 == null) {
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
          throw kk.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    abstract boolean g(int param0);

    abstract Object b(byte param0);

    jj(int param0) {
        this.field_o = param0;
    }

    static {
        field_p = new e(2, 4, 4, 0);
    }
}
