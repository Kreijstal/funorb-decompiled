/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class hr implements bu {
    abstract int c();

    abstract void a(float param0, float param1, float param2, float param3, float param4, float param5, int param6, int param7, int param8, int param9);

    abstract int a();

    private final void a(float param0, float param1, float param2, float param3, int param4, int param5, int param6, int param7, int param8) {
        double var10 = 0.0;
        float var12 = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        float var18 = 0.0f;
        float var19 = 0.0f;
        if (param4 == 0) {
          return;
        } else {
          var10 = (double)(param5 & 65535) * 0.00009587379924285257;
          var12 = (float)Math.sin(var10) * (float)param4;
          var13 = (float)Math.cos(var10) * (float)param4;
          var14 = (-param2 * var13 + -param3 * var12) / 4096.0f + param0;
          var15 = (--param2 * var12 + -param3 * var13) / 4096.0f + param1;
          var16 = (((float)((hr) this).b() - param2) * var13 + -param3 * var12) / 4096.0f + param0;
          var17 = (-((float)((hr) this).b() - param2) * var12 + -param3 * var13) / 4096.0f + param1;
          var18 = (-param2 * var13 + ((float)((hr) this).d() - param3) * var12) / 4096.0f + param0;
          var19 = (--param2 * var12 + ((float)((hr) this).d() - param3) * var13) / 4096.0f + param1;
          this.a(var14, var15, var16, var17, var18, var19, param6, param7, param8);
          return;
        }
    }

    abstract void a(int param0, int param1, int param2, int param3);

    final void a(float param0, float param1, int param2, int param3) {
        this.a(param0, param1, (float)((hr) this).b() / 2.0f, (float)((hr) this).d() / 2.0f, param2, param3, 1, 0, 1);
    }

    abstract int d();

    abstract int b();

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        ((hr) this).a(param0, param1, param2, param3, param4, param5, param6, 1);
    }

    final void a(int param0, int param1) {
        ((hr) this).a(param0, param1, 1, 0, 1);
    }

    private final void a(float param0, float param1, float param2, float param3, float param4, float param5, int param6, int param7, int param8) {
        ((hr) this).a(param0, param1, param2, param3, param4, param5, param6, param7, param8, 1);
    }

    abstract void a(int param0, int param1, int param2, int param3, int param4);

    abstract void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7);

    final void a(float param0, float param1, int param2, int param3, int param4, int param5, int param6) {
        this.a(param0, param1, (float)((hr) this).b() / 2.0f, (float)((hr) this).d() / 2.0f, param2, param3, param4, param5, param6);
    }
}
