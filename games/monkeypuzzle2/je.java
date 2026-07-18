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
        b var6 = null;
        la var6_ref = null;
        int var7 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
            if (!(((je) this).field_d >= 1)) {
                throw new IllegalStateException();
            }
            this.a(0, param3);
            ((je) this).field_e = ((je) this).field_e - 1;
            while (((je) this).field_e < 0) {
                var6 = (b) (Object) ((je) this).field_g.b((byte) -86);
                int discarded$0 = 4821;
                this.a(var6);
            }
            var6_ref = new la(param0, 1);
            ((je) this).field_b.a(param3, true, (ug) (Object) var6_ref);
            ((je) this).field_g.a(12, (bf) (Object) var6_ref);
            ((b) (Object) var6_ref).field_f = 0L;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "je.E(" + (param0 != null ? "{...}" : "null") + ',' + 1 + ',' + 0 + ',' + param3 + ')');
        }
    }

    final static void a(int param0) {
        Object var2 = null;
        vh.a("", (String) null, (byte) 115);
        int var1 = 58 / ((-18 - param0) / 61);
    }

    private final void a(b param0) {
        RuntimeException var3 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            if (param0 == null) {
              break L0;
            } else {
              param0.c(-19822);
              param0.a(7847);
              ((je) this).field_e = ((je) this).field_e + param0.field_n;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) var3;
            stackOut_3_1 = new StringBuilder().append("je.C(");
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L1;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L1;
            }
          }
          throw la.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ',' + 4821 + ')');
        }
    }

    final void a(long param0, Object param1, int param2) {
        try {
            int var5_int = -91 / ((-39 - param2) / 45);
            this.a(param1, 1, 0, param0);
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) (Object) runtimeException, "je.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final Object a(long param0, byte param1) {
        int var5 = 0;
        Object var6 = null;
        la var7 = null;
        b var8 = null;
        var8 = (b) (Object) ((je) this).field_b.a((byte) -83, param0);
        var5 = -6 / ((param1 - -61) / 51);
        if (var8 != null) {
          var6 = var8.a((byte) -78);
          if (var6 != null) {
            if (var8.b((byte) 63)) {
              var7 = new la(var6, var8.field_n);
              ((je) this).field_b.a(var8.field_a, true, (ug) (Object) var7);
              ((je) this).field_g.a(12, (bf) (Object) var7);
              ((b) (Object) var7).field_f = 0L;
              var8.c(-19822);
              var8.a(7847);
              return var6;
            } else {
              ((je) this).field_g.a(12, (bf) (Object) var8);
              var8.field_f = 0L;
              return var6;
            }
          } else {
            var8.c(-19822);
            var8.a(7847);
            ((je) this).field_e = ((je) this).field_e + var8.field_n;
            return null;
          }
        } else {
          return null;
        }
    }

    private final void a(int param0, long param1) {
        b var4 = (b) (Object) ((je) this).field_b.a((byte) -85, param1);
        int discarded$0 = 4821;
        this.a(var4);
    }

    final static k a() {
        k var2 = new k();
        int var3 = 0;
        cj.field_a.a(-8212, (ug) (Object) var2);
        f.a(4, 22492);
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "<shad=6767667>Goal<br></shad>Remove all the monkeys from the level. Clear nuts and monkeys by matching their colours. When three monkeys or nuts of the same colour touch, they'll fall off the vines.<br><br><shad=6767667>Scoring<br></shad>You will score 10,000 points for each level you complete, plus a bonus which drops as the water rises. It starts at 10,000 points and drops to 0 by the time the water has covered a third of the screen.<br><br><shad=6767667>Tips<br></shad>Click the button below to enable or disable popup tips. <%0>";
        field_f = "Please send me news and updates (I can unsubscribe at any time)";
        field_c = 0;
    }
}
