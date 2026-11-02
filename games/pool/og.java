/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class og extends ob {
    static nl field_L;
    static String mpOfferrematchUnrated;
    static int[] field_J;
    static Sprite[] field_K;
    static int field_I;

    og(Sprite param0, int param1, int param2, int param3, int param4, int param5, int[] param6) {
        super(param0, param1, param2, param3, param4, param5, param6);
    }

    public static void f(byte param0) {
        if (param0 < -85) {
          field_K = null;
          field_L = null;
          field_J = null;
          mpOfferrematchUnrated = null;
          return;
        }
        og.f((byte) -111);
        field_K = null;
        field_L = null;
        field_J = null;
        mpOfferrematchUnrated = null;
    }

    final static void a(java.awt.Frame param0, PlatformTaskDispatcher param1, int param2) {
        AsyncRequest var3 = null;
        PlatformTaskDispatcher var4 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param2 != 24442) {
            var4 = (PlatformTaskDispatcher) null;
            og.a((java.awt.Frame) null, (PlatformTaskDispatcher) null, 107);
          }
          while (true) {
            var3 = param1.a(param0, false);
            while (var3.field_f == 0) {
              cf.a(-108, 10L);
            }
            if (var3.field_f != 1) {
              cf.a(-96, 100L);
              continue;
            }
            break;
          }
          param0.setVisible(false);
          param0.dispose();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_11_0 = var3_ref;
          stackIn_11_1 = new StringBuilder().append("og.E(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final int b(byte param0, int param1) {
        if (param0 != 6) {
          mpOfferrematchUnrated = (String) null;
          if (this.field_h.length - 1 > param1) {
            return this.field_x + param1 * (-8 + this.field_s);
          }
          return this.field_x + param1 * this.field_s;
        }
        if (this.field_h.length - 1 > param1) {
          return this.field_x + param1 * (-8 + this.field_s);
        }
        return this.field_x + param1 * this.field_s;
    }

    static {
        mpOfferrematchUnrated = "Offer unrated rematch";
        field_J = new int[]{62, 20, 21, 49, 5, 3, 61};
        field_L = new nl();
    }
}
