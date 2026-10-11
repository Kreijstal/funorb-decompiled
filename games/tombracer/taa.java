/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class taa extends vg {
    private int field_f;
    private int field_h;
    static nc field_g;

    final void a(uia param0, int param1) {
        try {
          if (param1 != 32654) {
            taa.a((byte) -36);
          }
          param0.i(this.field_h, 0);
          param0.i(this.field_f, 0);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "taa.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final int c(int param0) {
        if (param0 != 16) {
          return -13;
        }
        return this.field_h;
    }

    final static void a(byte param0, int param1, int param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          if (param2 == 10) {
            param3 = param3 - (id.field_h[0].a() * 2 + id.field_h[0].a() / 2);
            for (var4_int = 0; var4_int < 4; var4_int++) {
              var5 = var4_int + 12;
              id.field_h[var5].a(param3, param1 - (id.field_h[var5].c() >> 1));
              param3 = param3 + id.field_h[var5].a();
            }
          } else if (param2 == 9) {
            param3 = param3 - (id.field_h[0].a() + id.field_h[0].a() / 2);
            for (var4_int = 0; var4_int < 2; var4_int++) {
              var5 = var4_int + 10;
              id.field_h[var5].a(param3, -(id.field_h[var5].c() >> 1) + param1);
              param3 = param3 + id.field_h[var5].a();
            }
          } else if (param2 == 8) {
            param3 = param3 - (id.field_h[0].a() + id.field_h[0].a() / 2);
            for (var4_int = 0; var4_int < 2; var4_int++) {
              var5 = var4_int + 8;
              id.field_h[var5].a(param3, -(id.field_h[var5].c() >> 1) + param1);
              param3 = param3 + id.field_h[var5].a();
            }
          } else if (param2 >= 0 &&
            7 >= param2) {
            id.field_h[param2].a(-(id.field_h[param2].a() >> 1) + param3, -(id.field_h[param2].c() >> 1) + param1);
          } else {
            if (param2 == 11) {
              id.field_h[16].a(-(id.field_h[16].a() >> 1) + param3, -(id.field_h[16].c() >> 1) + param1);
            }
          }
          if (param0 >= -106) {
            taa.a((byte) -56, 127, 63, -18);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var4), "taa.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    taa(int param0, int param1) {
        this.field_h = param0;
        this.field_f = param1;
    }

    final boolean b(int param0) {
        boolean stackIn_10_0 = false;
        if (param0 != 1) {
          return false;
        }
        stackIn_10_0 = ((this.field_h == 0 &&
          !(di.field_f[this.field_f])) ||
          (this.field_h == 1 &&
          !(wk.field_i[this.field_f])));
        return stackIn_10_0;
    }

    final int a(int param0) {
        if (param0 != -13939) {
          this.field_f = 74;
        }
        return this.field_f;
    }

    public static void a(byte param0) {
        field_g = null;
        int var1 = 122 % ((69 - param0) / 39);
    }

    static {
        eqa discarded$0 = new eqa();
    }
}
