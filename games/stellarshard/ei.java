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
        ug var2 = new ug(((ei) this).field_C);
        if (param0 != -21535) {
            field_H = null;
        }
        ui var3 = (ui) (Object) var2.b((byte) 115);
        while (var3 != null) {
            if (!(!var3.h(103))) {
                var3.c(20);
            }
            var3 = (ui) (Object) var2.a(true);
        }
    }

    public static void g(byte param0) {
        field_I = null;
        field_E = null;
        field_H = null;
        field_B = null;
        field_D = null;
        field_G = null;
        if (param0 < 21) {
            ei.g((byte) -109);
        }
        field_A = null;
    }

    final void f(byte param0) {
        int var4 = stellarshard.field_B;
        ug var2 = new ug(((ei) this).field_C);
        if (param0 >= -126) {
            ui discarded$0 = ((ei) this).d((byte) -45);
        }
        ui var3 = (ui) (Object) var2.b((byte) 119);
        while (var3 != null) {
            if (!(!var3.d(true))) {
                var3.c(20);
            }
            var3 = (ui) (Object) var2.a(true);
        }
        ((ei) this).field_y = (rj) (Object) ((ei) this).d((byte) -97);
    }

    final void e(byte param0) {
        int var4 = stellarshard.field_B;
        ug var2 = new ug(((ei) this).field_C);
        ui var3 = (ui) (Object) var2.b((byte) 124);
        while (var3 != null) {
            var3.field_G = false;
            var3 = (ui) (Object) var2.a(true);
        }
        ((ei) this).field_y = null;
        if (param0 <= 7) {
            ((ei) this).e((byte) 100);
        }
    }

    final void a(byte param0, rj param1) {
        if (!(param1 instanceof ui)) {
            throw new IllegalArgumentException();
        }
        int var3 = 32 / ((-36 - param0) / 50);
        ui var4 = (ui) (Object) param1;
        ((ei) this).field_C.a(-1, (gg) (Object) var4);
        var4.field_G = true;
        boolean discarded$0 = var4.a(-2147483648, (rj) this);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        int var7 = stellarshard.field_B;
        if (((ei) this).field_u != null) {
            ((ei) this).field_u.a(true, param3, param2, (rj) this, param1 + 4606);
        }
        ug var5 = new ug(((ei) this).field_C);
        if (param1 != -57) {
            return;
        }
        rj var6 = (rj) (Object) var5.a((byte) -87);
        while (var6 != null) {
            var6.a(param0, (byte) -57, param2 - -((ei) this).field_k, ((ei) this).field_w + param3);
            var6 = (rj) (Object) var5.a(90);
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
            field_E = null;
            break L0;
          }
        }
        var2 = new ug(((ei) this).field_C);
        var3 = (ui) (Object) var2.b((byte) 115);
        L1: while (true) {
          if (var3 != null) {
            if (var3.field_G) {
              return var3.a((byte) -45);
            } else {
              var3 = (ui) (Object) var2.a(true);
              continue L1;
            }
          } else {
            return null;
          }
        }
    }

    final ui d(byte param0) {
        int var4 = stellarshard.field_B;
        ug var2 = new ug(((ei) this).field_C);
        ui var3 = (ui) (Object) var2.b((byte) 116);
        while (var3 != null) {
            if (!(!var3.field_G)) {
                return var3;
            }
            var3 = (ui) (Object) var2.a(true);
        }
        if (param0 <= -91) {
            return null;
        }
        Object var5 = null;
        String discarded$0 = ei.a((CharSequence[]) null, (byte) 55);
        return null;
    }

    final static String a(CharSequence[] param0, byte param1) {
        int var2 = 114 % ((param1 - 64) / 58);
        return ge.a((byte) -50, param0, 0, param0.length);
    }

    public ei() {
        super(0, 0, ml.field_b, vf.field_F, (uk) null, (lf) null);
        ((ei) this).field_C = new oj();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
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
