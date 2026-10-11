/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nn extends ne {
    static String field_k;
    gd field_l;
    private md field_m;
    private boolean field_i;
    static int[] field_j;

    final void a(byte param0) {
        ie var2 = null;
        int var3 = DungeonAssault.field_K;
        if (param0 == 80) {
          var2 = (ie) (this.field_m.e(param0 ^ -24124));
          while (var2 != null) {
            var2.field_m.field_p = mo.field_a;
            var2.field_m.field_m = -256 + mo.field_a;
            if (var2.field_m.field_B) {
              var2.field_m.field_L = mo.field_a;
            }
            var2.field_m.field_B = false;
            var2 = (ie) (this.field_m.a(4));
          }
          this.field_l = null;
          return;
        }
    }

    nn(boolean param0) {
        this.field_m = new md();
        this.field_i = param0 ? true : false;
    }

    final void a(gd param0, int param1) {
        ie var3 = null;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var4 = DungeonAssault.field_K;
        try {
          var3 = (ie) (this.field_m.e(-24172));
          if (param1 != -256) {
            this.field_l = (gd) null;
          }
          while (var3 != null) {
            var3.field_m.field_m = mo.field_a - 256;
            var3.field_m.field_p = mo.field_a;
            if (var3.field_m != param0 &&
              var3.field_m.field_B) {
              var3.field_m.field_B = false;
              var3.field_m.field_L = mo.field_a;
            }
            var3 = (ie) (this.field_m.a(4));
          }
          param0.field_C = mo.field_a;
          param0.field_B = true;
          this.field_l = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_14_0 = var3_ref;
          stackIn_14_1 = new StringBuilder().append("nn.F(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    private final void b(gd param0, int param1) {
        ie var3 = null;
        int var4 = DungeonAssault.field_K;
        try {
          if (this != param0.field_M) {
            throw new RuntimeException();
          }
          if (param1 != 29339) {
            field_k = (String) null;
          }
          var3 = (ie) (this.field_m.e(-24172));
          while (var3 != null) {
            if (var3.field_m == param0) {
              var3.a(false);
            }
            var3 = (ie) (this.field_m.a(4));
          }
          param0.field_M = null;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "nn.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(gd param0, byte param1) {
        ie var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = DungeonAssault.field_K;
        try {
          if (param0.field_M != null) {
            param0.field_M.b(param0, 29339);
          }
          param0.field_M = this;
          var3 = (ie) (this.field_m.e(param1 ^ 24184));
          while (var3 != null) {
            if (param0 == var3.field_m) {
              return;
            }
            var3 = (ie) (this.field_m.a(param1 + 24));
          }
          this.field_m.a(new ie(param0), false);
          if (param1 == -20) {
            return;
          }
          this.field_l = (gd) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("nn.C(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void b(byte param0) {
        field_k = null;
        field_j = null;
        if (param0 == -80) {
          return;
        }
        nn.b((byte) 94);
    }

    final void a(byte param0, gd param1) {
        ie var3 = null;
        int var5 = DungeonAssault.field_K;
        if (!this.field_i) {
          return;
        }
        try {
          var3 = (ie) (this.field_m.e(-24172));
          while (var3 != null) {
            var3.field_m.field_m = -256 + mo.field_a;
            var3.field_m.field_p = mo.field_a;
            var3 = (ie) (this.field_m.a(4));
          }
          param1.field_L = mo.field_a;
          int var4 = 43 / ((param0 + 7) / 51);
          if (param1 == this.field_l) {
            this.field_l = null;
          }
          param1.field_B = false;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "nn.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
