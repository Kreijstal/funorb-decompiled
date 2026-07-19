/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei extends dg {
    private oj field_C;
    static pb[] field_D;
    static String field_E;
    static int[] field_I;
    static ck field_G;
    static byte[][] field_H;
    static int[] field_B;
    static int field_F;
    static String field_A;

    final void i(int param0) {
        int var4 = stellarshard.field_B;
        ug var2 = new ug(this.field_C);
        if (param0 != -21535) {
            field_H = (byte[][]) null;
        }
        ui var3 = (ui) ((Object) var2.b((byte) 115));
        while (var3 != null) {
            if (!(!var3.h(103))) {
                var3.c(20);
            }
            var3 = (ui) ((Object) var2.a(true));
        }
    }

    public static void g(byte param0) {
        field_I = null;
        field_E = null;
        field_H = (byte[][]) null;
        field_B = null;
        field_D = null;
        field_G = null;
        if (param0 < 21) {
            ei.g((byte) -109);
        }
        field_A = null;
    }

    final void f(byte param0) {
        ui discarded$0 = null;
        int var4 = stellarshard.field_B;
        ug var2 = new ug(this.field_C);
        if (param0 >= -126) {
            discarded$0 = this.d((byte) -45);
        }
        ui var3 = (ui) ((Object) var2.b((byte) 119));
        while (var3 != null) {
            if (!(!var3.d(true))) {
                var3.c(20);
            }
            var3 = (ui) ((Object) var2.a(true));
        }
        this.field_y = (rj) ((Object) this.d((byte) -97));
    }

    final void e(byte param0) {
        int var4 = stellarshard.field_B;
        ug var2 = new ug(this.field_C);
        ui var3 = (ui) ((Object) var2.b((byte) 124));
        while (var3 != null) {
            var3.field_G = false;
            var3 = (ui) ((Object) var2.a(true));
        }
        this.field_y = null;
        if (param0 <= 7) {
            this.e((byte) 100);
        }
    }

    final void a(byte param0, rj param1) {
        ui var4 = null;
        boolean discarded$0 = false;
        try {
            if (!(param1 instanceof ui)) {
                throw new IllegalArgumentException();
            }
            int var3_int = 32 / ((-36 - param0) / 50);
            var4 = (ui) ((Object) param1);
            this.field_C.a(-1, var4);
            var4.field_G = true;
            discarded$0 = var4.a(-2147483648, (rj) (this));
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "ei.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var7 = stellarshard.field_B;
        if (this.field_u != null) {
            this.field_u.a(true, param3, param2, (rj) (this), param1 + 4606);
        }
        ug var5 = new ug(this.field_C);
        if (param1 != -57) {
            return;
        }
        rj var6 = (rj) ((Object) var5.a((byte) -87));
        while (var6 != null) {
            var6.a(param0, (byte) -57, param2 - -this.field_k, this.field_w + param3);
            var6 = (rj) ((Object) var5.a(90));
        }
    }

    final rj a(int param0) {
        ug var2 = null;
        ui var3 = null;
        int var4 = 0;
        L0: {
          var4 = stellarshard.field_B;
          if (param0 == 257) {
            break L0;
          } else {
            field_E = (String) null;
            break L0;
          }
        }
        var2 = new ug(this.field_C);
        var3 = (ui) ((Object) var2.b((byte) 115));
        L1: while (true) {
          if (var3 != null) {
            if (var3.field_G) {
              return var3.a((byte) -45);
            } else {
              var3 = (ui) ((Object) var2.a(true));
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final ui d(byte param0) {
        int var4 = stellarshard.field_B;
        ug var2 = new ug(this.field_C);
        ui var3 = (ui) ((Object) var2.b((byte) 116));
        while (var3 != null) {
            if (!(!var3.field_G)) {
                return var3;
            }
            var3 = (ui) ((Object) var2.a(true));
        }
        if (param0 <= -91) {
            return null;
        }
        CharSequence[] var5 = (CharSequence[]) null;
        String discarded$0 = ei.a((CharSequence[]) null, (byte) 55);
        return null;
    }

    final static String a(CharSequence[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var2_int = 114 % ((param1 - 64) / 58);
            stackOut_0_0 = ge.a((byte) -50, param0, 0, param0.length);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var2);
            stackOut_2_1 = new StringBuilder().append("ei.S(");
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw ma.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    public ei() {
        super(0, 0, ml.field_b, vf.field_F, (uk) null, (lf) null);
        this.field_C = new oj();
    }

    static {
        int var0 = 0;
        field_E = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_H = new byte[250][];
        field_B = new int[256];
        field_I = new int[256];
        for (var0 = 0; field_B.length > var0; var0++) {
            field_B[var0] = 65793 * var0;
            field_I[var0] = var0 * 257;
        }
        field_A = "Tri gun";
    }
}
