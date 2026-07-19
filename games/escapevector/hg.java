/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hg {
    static java.applet.Applet field_c;
    hg field_d;
    long field_e;
    static String field_a;
    hg field_b;
    static String field_f;

    final static boolean b(int param0) {
        if (param0 != 12) {
            return false;
        }
        if (null == pn.field_pb) {
            return false;
        }
        if (pn.field_pb.n(0) == null) {
            return false;
        }
        return true;
    }

    final boolean b(byte param0) {
        if (param0 == 48) {
          if (this.field_d == null) {
            return false;
          } else {
            return true;
          }
        } else {
          hg.c(-37);
          if (this.field_d == null) {
            return false;
          } else {
            return true;
          }
        }
    }

    final static void a(int param0, int param1, cc param2) {
        int discarded$0 = 0;
        c var5 = om.field_c;
        var5.a(param1, true);
        var5.field_m = var5.field_m + 1;
        int var4 = var5.field_m;
        if (param0 > -20) {
            return;
        }
        try {
            var5.f(1, -123);
            var5.f(param2.field_i, -123);
            var5.d(12680, param2.field_m);
            var5.a((byte) 126, param2.field_n);
            var5.a((byte) 127, param2.field_h);
            var5.a((byte) 123, param2.field_o);
            var5.a((byte) 125, param2.field_g);
            discarded$0 = var5.c(var4, -61);
            var5.e(118, -var4 + var5.field_m);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "hg.WA(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static ui[] a(c param0, int param1) {
        int discarded$6 = 0;
        int discarded$7 = 0;
        int discarded$8 = 0;
        int discarded$9 = 0;
        int discarded$10 = 0;
        int discarded$11 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        ui[] var4 = null;
        int var5 = 0;
        ui var6 = null;
        int var6_int = 0;
        int var7 = 0;
        Object stackIn_3_0 = null;
        ui[] stackIn_13_0 = null;
        ui[] stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        ui[] stackOut_14_0 = null;
        ui[] stackOut_12_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var7 = EscapeVector.field_A;
        try {
          L0: {
            var2_int = param0.j(8, 8);
            if (0 >= var2_int) {
              var3 = param0.j(12, 8);
              var4 = new ui[var3];
              var5 = 0;
              L1: while (true) {
                if (var3 <= var5) {
                  if (param1 == 22178) {
                    stackOut_14_0 = (ui[]) (var4);
                    stackIn_15_0 = stackOut_14_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    stackOut_12_0 = (ui[]) null;
                    stackIn_13_0 = stackOut_12_0;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  L2: {
                    if (da.a(param0, (byte) -116)) {
                      var6 = new ui();
                      discarded$6 = param0.j(24, param1 ^ 22186);
                      discarded$7 = param0.j(24, 8);
                      var6.field_c = param0.j(24, param1 ^ 22186);
                      discarded$8 = param0.j(9, 8);
                      discarded$9 = param0.j(12, param1 ^ 22186);
                      discarded$10 = param0.j(12, 8);
                      discarded$11 = param0.j(12, 8);
                      var4[var5] = var6;
                      break L2;
                    } else {
                      var6_int = param0.j(wf.a(var5 + -1, 24787), 8);
                      var4[var5] = var4[var6_int];
                      break L2;
                    }
                  }
                  var5++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (var2);
            stackOut_16_1 = new StringBuilder().append("hg.SA(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L3;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (ui[]) ((Object) stackIn_3_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            return stackIn_15_0;
          }
        }
    }

    public static void c(int param0) {
        field_c = null;
        field_a = null;
        field_f = null;
        if (param0 > -26) {
            hg.c(6);
        }
    }

    final static void a(int param0) {
        if (param0 != 12) {
            hg.c(-66);
        }
    }

    final void c(byte param0) {
        boolean discarded$2 = false;
        if (this.field_d == null) {
          return;
        } else {
          if (param0 > -8) {
            discarded$2 = hg.b(-128);
            this.field_d.field_b = this.field_b;
            this.field_b.field_d = this.field_d;
            this.field_b = null;
            this.field_d = null;
            return;
          } else {
            this.field_d.field_b = this.field_b;
            this.field_b.field_d = this.field_d;
            this.field_b = null;
            this.field_d = null;
            return;
          }
        }
    }

    static {
        field_f = "Targets: ";
        field_a = "Create a free account to start using this feature";
    }
}
