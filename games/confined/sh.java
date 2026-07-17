/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sh extends am {
    static volatile int field_K;
    private mn field_J;

    final void i(byte param0) {
        int var4 = Confined.field_J ? 1 : 0;
        if (param0 <= 9) {
            return;
        }
        vb var2 = new vb(((sh) this).field_J);
        oe var3 = (oe) (Object) var2.a((byte) 120);
        while (var3 != null) {
            if (!(!var3.l(-6))) {
                var3.a(true);
            }
            var3 = (oe) (Object) var2.b(-92);
        }
        ((sh) this).field_H = (fj) (Object) ((sh) this).h(0);
    }

    public sh() {
        super(0, 0, tg.field_L, qk.field_c, (fe) null, (uk) null);
        ((sh) this).field_J = new mn();
    }

    final oe h(int param0) {
        vb var2 = null;
        oe var3 = null;
        int var4 = 0;
        var4 = Confined.field_J ? 1 : 0;
        var2 = new vb(((sh) this).field_J);
        if (param0 == 0) {
          var3 = (oe) (Object) var2.a((byte) 120);
          L0: while (true) {
            if (var3 != null) {
              if (var3.field_H) {
                return var3;
              } else {
                var3 = (oe) (Object) var2.b(param0 ^ -90);
                continue L0;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final void g(byte param0) {
        int var4 = Confined.field_J ? 1 : 0;
        vb var2 = new vb(((sh) this).field_J);
        oe var3 = (oe) (Object) var2.a((byte) 120);
        while (var3 != null) {
            var3.field_H = false;
            var3 = (oe) (Object) var2.b(-102);
        }
        ((sh) this).field_H = null;
        if (param0 <= 103) {
            ((sh) this).field_J = null;
        }
    }

    final void c(fj param0, int param1) {
        oe var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param0 instanceof oe) {
              L1: {
                var3 = (oe) (Object) param0;
                ((sh) this).field_J.a((rk) (Object) var3, -1);
                var3.field_H = true;
                boolean discarded$10 = var3.a((fj) this, param1 ^ 418);
                if (param1 == 0) {
                  break L1;
                } else {
                  ((sh) this).h((byte) -3);
                  break L1;
                }
              }
              break L0;
            } else {
              throw new IllegalArgumentException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var3_ref;
            stackOut_5_1 = new StringBuilder().append("sh.J(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var7 = Confined.field_J ? 1 : 0;
        if (((sh) this).field_n != null) {
            ((sh) this).field_n.a((byte) -122, param3, true, (fj) this, param0);
        }
        if (param2 < 36) {
            return;
        }
        vb var5 = new vb(((sh) this).field_J);
        fj var6 = (fj) (Object) var5.c(7);
        while (var6 != null) {
            var6.a(((sh) this).field_m + param0, param1, (byte) 38, ((sh) this).field_q + param3);
            var6 = (fj) (Object) var5.a(0);
        }
    }

    final static em a(int param0, String param1, String param2, boolean param3) {
        long var4_long = 0L;
        RuntimeException var4 = null;
        Object var6 = null;
        CharSequence var7 = null;
        Object stackIn_5_0 = null;
        em stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        em stackOut_6_0 = null;
        Object stackOut_4_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              var4_long = 0L;
              var6 = null;
              if (param1.indexOf('@') == -1) {
                var7 = (CharSequence) (Object) param1;
                var4_long = ra.a(var7, 125);
                break L1;
              } else {
                var6 = (Object) (Object) param1;
                break L1;
              }
            }
            if (param0 == 12831) {
              stackOut_6_0 = g.a(-26547, var4_long, false, (String) var6, param2);
              stackIn_7_0 = stackOut_6_0;
              break L0;
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (em) (Object) stackIn_5_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var4;
            stackOut_8_1 = new StringBuilder().append("sh.P(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          L3: {
            stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw sd.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + 0 + 41);
        }
        return stackIn_7_0;
    }

    final fj a(byte param0) {
        vb var2 = null;
        oe var3 = null;
        int var4 = 0;
        Object var5 = null;
        L0: {
          var4 = Confined.field_J ? 1 : 0;
          var2 = new vb(((sh) this).field_J);
          var3 = (oe) (Object) var2.a((byte) 120);
          if (param0 == -110) {
            break L0;
          } else {
            var5 = null;
            em discarded$2 = sh.a(64, (String) null, (String) null, false);
            break L0;
          }
        }
        L1: while (true) {
          if (var3 != null) {
            if (!var3.field_H) {
              var3 = (oe) (Object) var2.b(-24);
              continue L1;
            } else {
              return var3.f(-1);
            }
          } else {
            return null;
          }
        }
    }

    final void h(byte param0) {
        int var4 = Confined.field_J ? 1 : 0;
        vb var2 = new vb(((sh) this).field_J);
        if (param0 != -3) {
            ((sh) this).h((byte) -125);
        }
        oe var3 = (oe) (Object) var2.a((byte) 120);
        while (var3 != null) {
            if (!(!var3.j(-53))) {
                var3.a(true);
            }
            var3 = (oe) (Object) var2.b(62);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_K = 0;
    }
}
