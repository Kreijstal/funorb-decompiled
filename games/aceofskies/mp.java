/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mp extends vo {
    static RenderSprite titleImage;
    static String field_e;
    private boolean field_f;
    static volatile int field_g;
    private String field_i;

    final pt a(String param0, int param1) {
        fr var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        CharSequence var5 = null;
        pt stackIn_3_0 = null;
        pt stackIn_12_0 = null;
        pt stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (CharSequence) ((Object) param0);
          if (!SmokeParticle.a(var5, 0)) {
            stackIn_3_0 = bt.field_a;
            return stackIn_3_0;
          }
          if (param1 != 8192) {
            var4 = (String) null;
            this.a((String) null, (byte) -114);
          }
          if (!param0.equals(this.field_i)) {
            var3 = hg.a(param1 ^ 2147475455, param0);
            if (var3 != null &&
              var3.field_f == null) {
              this.field_f = var3.field_b;
              this.field_i = param0;
            } else {
              stackIn_12_0 = ce.field_t;
              return stackIn_12_0;
            }
          }
          if (!this.field_f) {
            stackIn_17_0 = bt.field_a;
          } else {
            stackIn_17_0 = fd.field_a;
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("mp.DA(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    mp(bm param0) {
        super(param0);
        this.field_f = false;
    }

    public static void c(byte param0) {
        if (param0 != -11) {
          mp.c((byte) -28);
          field_e = null;
          titleImage = null;
          return;
        }
        field_e = null;
        titleImage = null;
    }

    final void e(int param0) {
        this.field_i = null;
        if (param0 >= -86) {
          mp.c((byte) 34);
        }
    }

    final String a(String param0, byte param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        fr var4 = null;
        CharSequence var5 = null;
        String stackIn_2_0 = null;
        String stackIn_5_0 = null;
        Object stackIn_12_0 = null;
        String stackIn_16_0 = null;
        String stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 72) {
            stackIn_2_0 = (String) null;
            return stackIn_2_0;
          }
          var5 = (CharSequence) ((Object) param0);
          var3 = ee.a(var5, 0);
          if (var3 != null) {
            stackIn_5_0 = var3;
            return stackIn_5_0;
          }
          if (!param0.equals(this.field_i)) {
            var4 = hg.a(2147483647, param0);
            if (var4 == null) {
              return null;
            }
            if (var4.field_f != null) {
              stackIn_12_0 = null;
              return (String) (stackIn_12_0);
            }
            this.field_f = var4.field_b;
            this.field_i = param0;
          }
          if (this.field_f) {
            stackIn_18_0 = dk.field_k;
            return stackIn_18_0;
          }
          stackIn_16_0 = HudMessage.field_e;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_21_0 = var3_ref;
          stackIn_21_1 = new StringBuilder().append("mp.EA(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_e = "Loading...";
        field_g = 0;
    }
}
