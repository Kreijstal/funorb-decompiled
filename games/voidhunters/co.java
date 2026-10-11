/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class co {
    Runnable field_c;
    boolean field_f;
    private sob field_d;
    private int[] field_b;
    daa field_e;
    float[] field_a;

    final void a(Runnable param0, int param1) {
        try {
          if (param1 != 0) {
            this.field_b = (int[]) null;
          }
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw rta.a((Throwable) ((Object) runtimeException), "co.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(byte param0) {
        this.field_e = new daa(this.field_d, this);
        if (param0 != 3) {
          this.field_f = false;
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, float[] param5, int param6) {
        int var17 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        float[] var12 = null;
        float[] var13 = null;
        float[] var14 = null;
        float var15 = 0.0f;
        int var16 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var23 = 0;
        var23 = VoidHunters.field_G;
        try {
          if (param2 > 0 &&
            !bd.a(param2, (byte) -95)) {
            throw new IllegalArgumentException("");
          }
          if (param4 > 0 &&
            !bd.a(param4, (byte) -95)) {
            throw new IllegalArgumentException("");
          }
          var7_int = pu.a((byte) -104, param0);
          var8 = 0;
          stackIn_12_0 = (param2 >= param4) ? param4 : param2;
          var9 = stackIn_12_0;
          var10 = param2 >> 1;
          var11 = param4 >> 1;
          if (param6 != -29702) {
            return;
          }
          var12 = param5;
          var13 = new float[var7_int * var10 * var11];
          while (true) {
            jaggl.OpenGL.glTexImage2Df(param3, var8, param1, param2, param4, 0, param0, 5126, var12, 0);
            if (var9 <= 1) {
              return;
            }
            var16 = param2 * var7_int;
            for (var17 = 0; var7_int > var17; var17++) {
              var18 = var17;
              var19 = var17;
              var20 = var19 + var16;
              for (var21 = 0; var11 > var21; var21++) {
                for (var22 = 0; var10 > var22; var22++) {
                  var15 = var12[var19];
                  var19 = var19 + var7_int;
                  var15 = var15 + var12[var19];
                  var15 = var15 + var12[var20];
                  var19 = var19 + var7_int;
                  var20 = var20 + var7_int;
                  var15 = var15 + var12[var20];
                  var13[var18] = 0.25f * var15;
                  var20 = var20 + var7_int;
                  var18 = var18 + var7_int;
                }
                var19 = var19 + var16;
                var20 = var20 + var16;
              }
            }
            var14 = var13;
            var13 = var12;
            var12 = var14;
            param4 = var11;
            param2 = var10;
            var11 = var11 >> 1;
            var8++;
            var10 = var10 >> 1;
            var9 = var9 >> 1;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_29_0 = var7;
          stackIn_29_1 = new StringBuilder().append("co.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param6).append(')').toString());
        }
    }

    co(sob param0) {
        b discarded$12 = null;
        b discarded$13 = null;
        b discarded$14 = null;
        b discarded$15 = null;
        b discarded$16 = null;
        b discarded$17 = null;
        b discarded$18 = null;
        b discarded$19 = null;
        b discarded$20 = null;
        b discarded$21 = null;
        int var2_int = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        this.field_f = true;
        lia discarded$11 = new lia();
        this.field_a = new float[2];
        try {
          this.field_d = param0;
          this.field_e = new daa(param0, this);
          discarded$12 = new b(this.field_d);
          discarded$13 = new b(this.field_d);
          discarded$14 = new b(this.field_d);
          discarded$15 = new b(this.field_d);
          discarded$16 = new b(this.field_d);
          discarded$17 = new b(this.field_d);
          discarded$18 = new b(this.field_d);
          discarded$19 = new b(this.field_d);
          discarded$20 = new b(this.field_d);
          discarded$21 = new b(this.field_d);
          this.field_b = new int[b.field_v];
          for (var2_int = 0; var2_int < b.field_v; var2_int++) {
            this.field_b[var2_int] = -1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("co.<init>(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    static {
        pv discarded$0 = new pv();
    }
}
