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
          if (((hg) this).field_d == null) {
            return false;
          } else {
            return true;
          }
        } else {
          hg.c(-37);
          if (((hg) this).field_d == null) {
            return false;
          } else {
            return true;
          }
        }
    }

    final static void a(int param0, int param1, cc param2) {
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
            int discarded$0 = var5.c(var4, -61);
            var5.e(118, -var4 + var5.field_m);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "hg.WA(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static ui[] a(c param0, int param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        ui[] var4 = null;
        int var5 = 0;
        ui var6 = null;
        int var6_int = 0;
        int var7 = 0;
        Object stackIn_3_0 = null;
        ui[] stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        ui[] stackOut_16_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
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
                  stackOut_16_0 = (ui[]) var4;
                  stackIn_17_0 = stackOut_16_0;
                  break L0;
                } else {
                  L2: {
                    if (da.a(param0, (byte) -116)) {
                      var6 = new ui();
                      int discarded$6 = param0.j(24, 8);
                      int discarded$7 = param0.j(24, 8);
                      var6.field_c = param0.j(24, 8);
                      int discarded$8 = param0.j(9, 8);
                      int discarded$9 = param0.j(12, 8);
                      int discarded$10 = param0.j(12, 8);
                      int discarded$11 = param0.j(12, 8);
                      var4[var5] = var6;
                      var5++;
                      break L2;
                    } else {
                      var6_int = param0.j(wf.a(var5 + -1, 24787), 8);
                      var4[var5] = var4[var6_int];
                      var5++;
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
              return (ui[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var2;
            stackOut_18_1 = new StringBuilder().append("hg.SA(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L3;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_21_0, stackIn_21_2 + 44 + 22178 + 41);
        }
        return stackIn_17_0;
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
    }

    final void c(byte param0) {
        if (((hg) this).field_d == null) {
          return;
        } else {
          if (param0 > -8) {
            boolean discarded$2 = hg.b(-128);
            ((hg) this).field_d.field_b = ((hg) this).field_b;
            ((hg) this).field_b.field_d = ((hg) this).field_d;
            ((hg) this).field_b = null;
            ((hg) this).field_d = null;
            return;
          } else {
            ((hg) this).field_d.field_b = ((hg) this).field_b;
            ((hg) this).field_b.field_d = ((hg) this).field_d;
            ((hg) this).field_b = null;
            ((hg) this).field_d = null;
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Targets: ";
        field_a = "Create a free account to start using this feature";
    }
}
