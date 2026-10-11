/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fe {
    static boolean field_e;
    static boolean field_b;
    static d field_c;
    static char[] field_g;
    static pb[][] field_d;
    static pb field_a;
    static String field_f;

    abstract void a(int param0, java.awt.Component param1);

    abstract void a(byte param0, java.awt.Component param1);

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = stellarshard.field_B;
        try {
          if (param0 > -100) {
            field_f = (String) null;
          }
          if (param2 <= param1) {
            while (0 != param2) {
              var3_int = param1 % param2;
              param1 = param2;
              param2 = var3_int;
            }
          } else {
            var3_int = param1;
            param1 = param2;
            param2 = var3_int;
            while (0 != param2) {
              var3_int = param1 % param2;
              param1 = param2;
              param2 = var3_int;
            }
          }
          stackIn_10_0 = param1;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3), "fe.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(int param0) {
        field_f = null;
        field_g = null;
        if (param0 == 31147) {
          field_c = null;
          field_a = null;
          field_d = (pb[][]) null;
          return;
        }
        field_g = (char[]) null;
        field_c = null;
        field_a = null;
        field_d = (pb[][]) null;
    }

    final static void a(ka param0, int param1) {
        int var2_int = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        if (param1 != 12726) {
          return;
        }
        try {
          ci.field_b = param0.c((byte) 86) << 5;
          var2_int = param0.f(4);
          rc.field_h = (var2_int & 7) << 18;
          ci.field_b = ci.field_b + (var2_int >> 3);
          rc.field_h = rc.field_h + (param0.c((byte) 60) << 2);
          var2_intLifetime1 = param0.f(4);
          rc.field_h = rc.field_h + (var2_intLifetime1 >> 6);
          b.field_t = var2_intLifetime1 << 15 & 2064384;
          b.field_t = b.field_t + (param0.f(param1 - 12722) << 7);
          var2_intLifetime2 = param0.f(4);
          rb.field_w = 65536 & var2_intLifetime2 << 16;
          b.field_t = b.field_t + (var2_intLifetime2 >> 1);
          rb.field_w = rb.field_w + param0.c((byte) 25);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "fe.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    abstract int b(int param0);

    static {
        field_b = false;
        field_g = new char[]{(char)91, (char)93, (char)35};
        field_f = "Music          ";
        field_d = new pb[8][128];
    }
}
