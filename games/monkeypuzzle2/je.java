/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class je {
    private dc field_b;
    static String field_a;
    static lg field_i;
    static volatile int field_c;
    static boolean field_h;
    private int field_e;
    static String field_f;
    private int field_d;
    private ni field_g;

    private final void a(Object param0, int param1, int param2, long param3) {
        RuntimeException runtimeException = null;
        b var6 = null;
        la var6_ref = null;
        int var7 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            if (param1 > this.field_d) {
              throw new IllegalStateException();
            } else {
              this.a(0, param3);
              this.field_e = this.field_e - param1;
              L1: while (true) {
                L2: {
                  if (this.field_e >= 0) {
                    break L2;
                  } else {
                    var6 = (b) ((Object) this.field_g.b((byte) -86));
                    this.a(var6, 4821);
                    if (var7 == 0) {
                      continue L1;
                    } else {
                      break L2;
                    }
                  }
                }
                var6_ref = new la(param0, param1);
                this.field_b.a(param3, true, var6_ref);
                this.field_g.a(12, var6_ref);
                ((b) ((Object) var6_ref)).field_f = (long)param2;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("je.E(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final static void a(int param0) {
        String var2 = (String) null;
        vh.a("", (String) null, (byte) 115);
        int var1 = 58 / ((-18 - param0) / 61);
    }

    private final void a(b param0, int param1) {
        RuntimeException var3 = null;
        Object var4 = null;
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
            L1: {
              if (param1 == 4821) {
                break L1;
              } else {
                var4 = (Object) null;
                this.a(72L, (Object) null, 37);
                break L1;
              }
            }
            if (param0 == null) {
              break L0;
            } else {
              param0.c(param1 + -24643);
              param0.a(7847);
              this.field_e = this.field_e + param0.field_n;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var3);
            stackOut_5_1 = new StringBuilder().append("je.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ')');
        }
    }

    final void a(long param0, Object param1, int param2) {
        try {
            int var5_int = -91 / ((-39 - param2) / 45);
            this.a(param1, 1, 0, param0);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "je.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final Object a(long param0, byte param1) {
        int var5 = 0;
        Object var6 = null;
        la var7 = null;
        b var8 = null;
        var8 = (b) ((Object) this.field_b.a((byte) -83, param0));
        var5 = -6 / ((param1 - -61) / 51);
        if (var8 != null) {
          var6 = var8.a((byte) -78);
          if (var6 != null) {
            if (var8.b((byte) 63)) {
              var7 = new la(var6, var8.field_n);
              this.field_b.a(var8.field_a, true, var7);
              this.field_g.a(12, var7);
              ((b) ((Object) var7)).field_f = 0L;
              var8.c(-19822);
              var8.a(7847);
              if (MonkeyPuzzle2.field_F) {
                this.field_g.a(12, var8);
                var8.field_f = 0L;
                return var6;
              } else {
                return var6;
              }
            } else {
              this.field_g.a(12, var8);
              var8.field_f = 0L;
              return var6;
            }
          } else {
            var8.c(-19822);
            var8.a(7847);
            this.field_e = this.field_e + var8.field_n;
            return null;
          }
        } else {
          return null;
        }
    }

    private final void a(int param0, long param1) {
        b var4 = null;
        var4 = (b) ((Object) this.field_b.a((byte) -85, param1));
        if (param0 != 0) {
          this.field_d = 94;
          this.a(var4, 4821);
          return;
        } else {
          this.a(var4, 4821);
          return;
        }
    }

    final static k a(int param0, int param1) {
        k var2 = new k();
        int var3 = -77 % ((-39 - param1) / 46);
        cj.field_a.a(-8212, var2);
        f.a(param0, 22492);
        return var2;
    }

    public static void a(byte param0) {
        if (param0 != 12) {
          je.a((byte) -81);
          field_a = null;
          field_f = null;
          field_i = null;
          return;
        } else {
          field_a = null;
          field_f = null;
          field_i = null;
          return;
        }
    }

    private je() throws Throwable {
        throw new Error();
    }

    static {
        field_a = "<shad=6767667>Goal<br></shad>Remove all the monkeys from the level. Clear nuts and monkeys by matching their colours. When three monkeys or nuts of the same colour touch, they'll fall off the vines.<br><br><shad=6767667>Scoring<br></shad>You will score 10,000 points for each level you complete, plus a bonus which drops as the water rises. It starts at 10,000 points and drops to 0 by the time the water has covered a third of the screen.<br><br><shad=6767667>Tips<br></shad>Click the button below to enable or disable popup tips. <%0>";
        field_f = "Please send me news and updates (I can unsubscribe at any time)";
        field_c = 0;
    }
}
