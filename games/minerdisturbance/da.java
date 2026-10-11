/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da {
    static int field_a;
    static int field_c;
    static int field_d;
    private int[] field_b;

    final static java.awt.Container b(int param0) {
        if (param0 != 24255) {
          field_c = -116;
        }
        if (null != nd.field_f) {
          return (java.awt.Container) ((Object) nd.field_f);
        }
        return (java.awt.Container) ((Object) bm.c(-74));
    }

    final static hg a(int param0) {
        if (param0 != 858) {
          field_d = -63;
        }
        return hj.field_f;
    }

    final static void a(boolean param0, String param1, int param2) {
        int var3_int = 0;
        String var4 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          wc.field_b = false;
          wi.field_C = false;
          if (null != sj.field_h &&
            sj.field_h.field_K) {
            if (param2 == 8) {
              if (gd.field_B) {
                param1 = pj.field_d;
              } else {
                param1 = j.field_a;
              }
              param2 = 2;
              di.field_D.a(pl.field_a, 69);
            }
            var3_int = 1;
            if (10 == param2) {
              bj.a(0);
              var3_int = 0;
            }
            if (var3_int != 0) {
              if (wi.field_C) {
                param1 = oa.a((byte) -93, fe.field_r, new String[]{param1});
              }
              if (oh.field_F) {
                param1 = jg.field_j;
              }
              sj.field_h.a(param1, param2, (byte) -115);
            }
            if (256 != param2 &&
              param2 != 10 &&
              !gd.field_B) {
              di.field_D.n(-6);
            }
          }
          if (!param0) {
            var4 = (String) null;
            da.a(false, (String) null, 106);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_28_0 = var3;
          stackIn_28_1 = new StringBuilder().append("da.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(')').toString());
        }
    }

    da(int[] param0) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3Lifetime1;
        try {
          var2_int = 1;
          while (var2_int <= param0.length + (param0.length >> 1)) {
            var2_int = var2_int << 1;
          }
          this.field_b = new int[var2_int + var2_int];
          for (var3 = 0; var3 < var2_int + var2_int; var3++) {
            this.field_b[var3] = -1;
          }
          for (var3Lifetime1 = 0; param0.length > var3Lifetime1; var3Lifetime1++) {
            var4 = param0[var3Lifetime1] & var2_int - 1;
            while (this.field_b[1 + (var4 + var4)] != -1) {
              var4 = var2_int - 1 & 1 + var4;
            }
            this.field_b[var4 + var4] = param0[var3Lifetime1];
            this.field_b[1 + (var4 + var4)] = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("da.<init>(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final int a(byte param0, int param1) {
        int var3;
        int var4;
        int var5;
        var3 = -1 + (this.field_b.length >> 1);
        var4 = param1 & var3;
        if (param0 != -71) {
          field_a = 116;
        }
        while (true) {
          var5 = this.field_b[var4 + var4 + 1];
          if (var5 == -1) {
            return -1;
          }
          if (param1 == this.field_b[var4 + var4]) {
            return var5;
          }
          var4 = 1 + var4 & var3;
        }
    }

    static {
    }
}
