/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mla {
    int field_d;
    int field_c;
    static kv[] field_b;
    int[] field_a;

    final int a(int param0, int param1) {
        int var3 = 0;
        int var4;
        var4 = BachelorFridge.field_y;
        if (this.field_a != null &&
          this.field_a.length != 0) {
          for (var3 = 1; var3 < this.field_a.length; var3++) {
            if ((this.field_a[var3 - 1] + this.field_a[var3] >> 1) > param0) {
              return -1 + var3;
            }
          }
          if (param1 != 0) {
            mla.a((byte) 105);
          }
          return -1 + this.field_a.length;
        }
        return 0;
    }

    final int a(int param0) {
        int stackIn_6_0 = 0;
        if (param0 != 0) {
          return 72;
        }
        if (null != this.field_a &&
          0 != this.field_a.length) {
          stackIn_6_0 = this.field_a[this.field_a.length - 1];
        } else {
          stackIn_6_0 = 0;
        }
        return stackIn_6_0;
    }

    final static void b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        ema var1 = null;
        uha var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        int var3 = 0;
        ema var1Lifetime1;
        var3 = BachelorFridge.field_y;
        try {
          var1 = (ema) (aa.field_l.b((byte) 90));
          while (var1 != null) {
            if (0 < var1.field_Mb) {
              var1.field_Mb = var1.field_Mb - 1;
              if (var1.field_Mb == 0) {
                var1.field_yb = 0;
                if (var1.f((byte) 21)) {
                  var1.a(false);
                }
              }
            }
            var1 = (ema) (aa.field_l.c(0));
          }
          var1_ref = (uha) (uma.field_M.b((byte) 90));
          while (var1_ref != null) {
            if (var1_ref.field_Mb > 0) {
              var1_ref.field_Mb = var1_ref.field_Mb - 1;
              if (var1_ref.field_Mb == 0) {
                var1_ref.field_ec = 0;
                if (var1_ref.f(26)) {
                  var1_ref.a(false);
                }
              }
            }
            var1_ref = (uha) (uma.field_M.c(0));
          }
          var1Lifetime1 = (ema) (bia.field_g.b((byte) 90));
          while (var1Lifetime1 != null) {
            if (var1Lifetime1.field_Mb <= 0) {
              var1Lifetime1 = (ema) (bia.field_g.c(0));
              continue;
            }
            var1Lifetime1.field_Mb = var1Lifetime1.field_Mb - 1;
            if (0 == var1Lifetime1.field_Mb) {
              var1Lifetime1.field_yb = 0;
              if (var1Lifetime1.f((byte) 21)) {
                var1Lifetime1.a(false);
              }
            }
            var1Lifetime1 = (ema) (bia.field_g.c(0));
          }
          var2 = -100 % ((param0 + 66) / 37);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1_ref2), "mla.D(" + param0 + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        if (param0 < 52) {
          mla.a((byte) -89);
        }
    }

    mla(int param0, int param1, int param2) {
        this.field_d = param1;
        this.field_c = param0;
        this.field_a = new int[1 + param2];
    }

    static {
    }
}
