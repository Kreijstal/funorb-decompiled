/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aaa {
    lha field_c;
    rt[] field_i;
    lha field_h;
    rt[] field_f;
    static hla field_d;
    lha field_a;
    static int field_b;
    static String field_e;
    boolean field_g;

    public static void a(byte param0) {
        int var1 = 84 % ((83 - param0) / 35);
        field_d = null;
        field_e = null;
    }

    final static int a(boolean param0) {
        if (param0) {
          field_d = (hla) null;
          return mma.field_a;
        }
        return mma.field_a;
    }

    aaa(cka param0) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        lha var4 = null;
        mq var10 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        int var2_intLifetime1;
        this.field_i = null;
        this.field_h = null;
        this.field_f = null;
        this.field_c = null;
        this.field_a = null;
        try {
          this.field_g = param0.field_V;
          kga.a(param0, 121);
          if (!this.field_g) {
            this.field_f = new rt[16];
            for (var2_int = 0; 16 > var2_int; var2_int++) {
              var23 = ua.a(hna.field_e, 32768, 32768 * var2_int, false);
              this.field_f[var2_int] = new rt(param0, 3553, 6410, 128, 128, true, var23, 6410, false);
            }
            this.field_i = new rt[16];
            for (var2_intLifetime1 = 0; var2_intLifetime1 < 16; var2_intLifetime1++) {
              var24 = ua.a(gu.field_l, 32768, var2_intLifetime1 * 32768, false);
              this.field_i[var2_intLifetime1] = new rt(param0, 3553, 6410, 128, 128, true, var24, 6410, false);
            }
            return;
          }
          var20 = ir.a(hna.field_e, 13588, false);
          this.field_h = new lha(param0, 6410, 128, 128, 16, var20, 6410);
          var21 = ir.a(gu.field_l, 13588, false);
          this.field_a = new lha(param0, 6410, 128, 128, 16, var21, 6410);
          var10 = param0.field_zc;
          if (var10.a((byte) 11)) {
            var22 = ir.a(uga.field_m, 13588, false);
            this.field_c = new lha(param0, 6408, 128, 128, 16);
            var4 = new lha(param0, 6409, 128, 128, 16, var22, 6409);
            if (var10.a(-112, 2.0f, var4, this.field_c)) {
              this.field_c.e(9729);
              var4.b(0);
              return;
            }
            this.field_c.b(0);
            this.field_c = null;
            var4.b(0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("aaa.<init>(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
        field_e = "To play a multiplayer game, please log in or create a free account.";
    }
}
