/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ura {
    static String field_a;
    static String field_b;

    final static void a(int param0, String[] param1, byte param2, String param3) {
        int var5 = 0;
        int stackIn_10_0 = 0;
        boolean stackIn_11_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          kl.field_a = mua.field_a;
          if (param0 == 255) {
            stackIn_10_0 = -108;
            stackIn_11_1 = !(wua.field_n >= 13);
            ki.field_n = es.$cfr$intArgs$a$78544449ccb1(stackIn_10_0, stackIn_11_1);
          } else {
            if (param0 < 100) {
              ki.field_n = doa.a(param3, param0, (byte) 114);
            } else {
              if (param0 <= 105) {
                ki.field_n = pla.a(param2 + 228, param1);
              } else {
                ki.field_n = doa.a(param3, param0, (byte) 114);
              }
            }
          }
          if (param2 == -103) {
            return;
          }
          ura.a(55, -28, true, -42, -47);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("ura.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static iu[] a(int param0, int param1, boolean param2, int param3, int param4) {
        iu[] var6 = new iu[9];
        iu[] var5 = var6;
        iu dupTemp$0 = jf.a(param0, 48, param3);
        var6[6] = dupTemp$0;
        var5[3] = dupTemp$0;
        var5[2] = dupTemp$0;
        var5[1] = dupTemp$0;
        var5[0] = dupTemp$0;
        iu dupTemp$1 = jf.a(param4, 110, param3);
        var6[8] = dupTemp$1;
        var5[7] = dupTemp$1;
        var5[5] = dupTemp$1;
        if (param1 != 0) {
          var6[4] = jf.a(param1, 112, 64);
        }
        if (!param2) {
          return var5;
        }
        ura.a(true);
        return var5;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        if (param0) {
          ura.a(123, 14, false, 60, -69);
        }
    }

    final static void a(int param0) {
        float var1 = 0.0f;
        int var7 = 0;
        int var5 = 0;
        int var4 = 0;
        int var6 = 0;
        float var2 = 0.0f;
        float var3 = 0.0f;
        if (!ss.a(126)) {
          var1 = 0.10000000149011612f;
          var7 = -24;
          var5 = 0;
          var4 = 16770747;
          var6 = -24;
          var2 = 0.05000000074505806f;
          var3 = 0.6499999761581421f;
          tga.field_a.ZA(var4, var1, var2, (float)var5, (float)var6, (float)var7);
        } else {
          var3 = 1.15234375f;
          var5 = -50;
          var1 = 0.69921875f;
          var4 = 61453;
          var7 = -50;
          var2 = 1.2000000476837158f;
          var6 = -60;
        }
        int var8 = 0;
        tga.field_a.xa(var3);
        int var9 = 16384;
        tga.field_a.L(var8, var9, 0);
        tga.field_a.f(-16384, 16384);
        gda var10 = tga.field_a.b();
        var10.a();
        tga.field_a.a(var10);
        if (param0 == -10985) {
          return;
        }
        field_b = (String) null;
    }

    static {
        field_a = "Please log in to access this feature.";
    }
}
