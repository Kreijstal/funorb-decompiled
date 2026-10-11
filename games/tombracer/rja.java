/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rja extends loa {
    static String field_c;
    static String field_b;
    static int field_e;
    private vna field_d;

    private final void a(hj param0, int param1, int param2, int param3) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        oda var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int[] var19 = null;
        var15 = TombRacer.field_G ? 1 : 0;
        try {
          this.a(param3, param0, param2, param1);
          while (true) {
            if (this.field_d.d((byte) 14)) {
              return;
            }
            var6 = this.field_a.a(this.field_d.a((byte) -16), 0);
            var7 = 0;
            var5 = (oda) (this.field_d.f(-80));
            while (var6 != var7) {
              var5 = (oda) (this.field_d.e(param3 ^ 126));
              var7++;
            }
            var19 = this.a(4, param3 - 2354);
            var9 = var5.field_g;
            var10 = var5.field_f;
            var11 = 0;
            var12 = 0;
            while (true) {
              if (var11 != 0) {
                break;
              }
              if (var12 >= 4) {
                break;
              }
              var13 = 2 * dma.field_k[var19[var12]][0] + var9;
              var14 = var10 + dma.field_k[var19[var12]][1] * 2;
              if (param0.a(var13, var14, (byte) -128) &&
                0 == param0.b((byte) -5, var14, var13)) {
                this.a(var10, (byte) -42, param0, var9, var14, var13);
                this.a(param3 + 0, param0, var9, var10);
                var5.p(param3 ^ 30);
                var11 = 1;
              }
              var12++;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_17_0 = var5_ref;
          stackIn_17_1 = new StringBuilder().append("rja.A(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0, int param1, hj param2, byte param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2.a(param0, param1, (byte) -128) &&
            0 < param2.b((byte) -5, param1, param0)) {
            param2.a(param1, -1, 0, param0);
            this.field_d.b((byte) -76, new oda(param0, param1));
          }
          if (param3 >= 93) {
            return;
          }
          field_b = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("rja.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    rja(qea param0) {
        super(param0);
    }

    public static void a(int param0) {
        if (param0 != -21755) {
          rja.a(96);
          field_c = null;
          field_b = null;
          return;
        }
        field_c = null;
        field_b = null;
    }

    private final void a(int param0, hj param1, int param2, int param3) {
        try {
          param1.a(param3, 0, 0, param2);
          this.a(param2, param3 - 2, param1, (byte) 119);
          this.a(param2, param3 + 2, param1, (byte) 126);
          this.a(param2 - 2, param3, param1, (byte) 109);
          this.a(param2 + param0, param3, param1, (byte) 95);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "rja.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, hj param2, int param3) {
        this.field_d = new vna();
        if (param1 < 73) {
          return;
        }
        try {
          this.a(param2, param0, param3, 2);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "rja.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_c = "Total";
        field_b = "Room: ";
    }
}
