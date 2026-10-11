/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qha {
    private ap[] field_f;
    private int field_g;
    static int[] field_c;
    String field_d;
    float field_b;
    private int field_e;
    private int field_a;
    static String field_h;

    public static void a(int param0) {
        if (param0 < 123) {
          return;
        }
        field_c = null;
        field_h = null;
    }

    private final void a(ap param0, int param1, int param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_float = (float)(this.field_a - param1) + (float)param2 / 100.0f;
          this.field_b = (float)this.field_e * var4_float / (float)(this.field_g + 1);
          if (param2 == 0) {
            this.field_d = param0.field_a;
            return;
          }
          this.field_d = param0.field_b + " - " + param2 + "%";
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("qha.A(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, vr param1) {
        try {
          wha.field_a = param1;
          vj.field_p = wfa.a("logo", param1, "minimal", (byte) -86);
          if (param0 < 114) {
            vr var3 = (vr) null;
            qha.a(-41, (vr) null);
          }
          em.field_S = wfa.a("loading", param1, "minimal", (byte) -74);
          ml.field_a = ch.a(param1, -1, "minimal", "fridgedoor2d");
          ada.field_p = ch.a(param1, -1, "minimal", "fridge_left");
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "qha.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private qha() throws Throwable {
        throw new Error();
    }

    final boolean a(byte param0) {
        ap var2;
        int var3;
        ap var4;
        var3 = BachelorFridge.field_y;
        while (this.field_g > this.field_a) {
          var4 = this.field_f[this.field_a];
          var2 = var4;
          if (!var4.field_e.a(0)) {
            this.a(var4, -1, 0);
            return false;
          }
          if (var4.field_d >= 0 &&
            !var4.field_e.c(var4.field_d, -734)) {
            this.a(var2, -1, var4.field_e.b(var4.field_d, (byte) -87));
            return false;
          }
          if (null != var4.field_f &&
            !var4.field_e.a(var4.field_f, 20637)) {
            this.a(var2, -1, var4.field_e.a(0, var4.field_f));
            return false;
          }
          if (var4.field_d < 0 &&
            var4.field_f == null &&
            var4.field_b != null &&
            !var4.field_e.b((byte) 111)) {
            this.a(var2, -1, var4.field_e.a(true));
            return false;
          }
          this.field_a = this.field_a + 1;
        }
        if (param0 == 49) {
          return true;
        }
        field_h = (String) null;
        return true;
    }

    static {
        field_h = "Create your own free Jagex account";
    }
}
