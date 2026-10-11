/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cl {
    static jc field_e;
    static long field_b;
    static km field_g;
    static int field_d;
    static String field_f;
    static km[][][][] field_c;
    static String field_a;
    static String field_h;

    final static void a(int param0, boolean param1) {
        if (param0 == -1) {
          pi.field_c.a(param1, -1730123902);
          return;
        }
        nk var3 = (nk) null;
        cl.a(-24, (nk) null);
        pi.field_c.a(param1, -1730123902);
    }

    final static void a(byte param0) {
        int var1 = 0;
        int var1Lifetime1;
        if (bc.field_b >= 70) {
          rf.b(80, 80);
          var1 = -102 % ((param0 + 89) / 32);
          return;
        }
        rf.b(80, 10 + bc.field_b);
        var1Lifetime1 = -102 % ((param0 + 89) / 32);
    }

    public static void a(int param0) {
        field_f = null;
        field_h = null;
        field_g = null;
        field_a = null;
        if (param0 == 12) {
          field_c = (km[][][][]) null;
          field_e = null;
          return;
        }
        cl.a(40);
        field_c = (km[][][][]) null;
        field_e = null;
    }

    final static fn[] a(int param0, nk param1) {
        int var5 = 0;
        Object stackIn_5_0 = null;
        fn[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        fn[] var4 = null;
        int var6 = 0;
        fn var6_ref_fn = null;
        int var7 = 0;
        var7 = Chess.field_G;
        try {
          if (param0 != -4974) {
            field_g = (km) null;
          }
          var2_int = param1.e(-16, 8);
          if (var2_int > 0) {
            stackIn_5_0 = null;
            return (fn[]) (stackIn_5_0);
          }
          var3 = param1.e(param0 + 5082, 12);
          var4 = new fn[var3];
          for (var5 = 0; var3 > var5; var5++) {
            if (!r.a(true, param1)) {
              var6 = param1.e(-63, kb.a(-1 + var5, param0 ^ -4904));
              var4[var5] = var4[var6];
            } else {
              var6_ref_fn = new fn();
              param1.e(param0 + 5096, 24);
              param1.e(-33, 24);
              var6_ref_fn.field_g = param1.e(-94, 24);
              param1.e(123, 9);
              param1.e(-18, 12);
              param1.e(110, 12);
              param1.e(105, 12);
              var4[var5] = var6_ref_fn;
            }
          }
          stackIn_14_0 = var4;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("cl.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
        field_g = new km(0, 0);
        field_f = "Create unrated game";
        field_c = new km[2][2][2][7];
        field_a = "Match by...";
        field_h = "Honour";
    }
}
