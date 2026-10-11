/*
 * Decompiled by CFR-JS 0.4.0.
 */
class vp extends df {
    static int[] field_s;
    static String field_t;
    static int field_r;
    static ar field_o;
    vp field_p;
    vp field_q;

    final static void c(int param0, int param1) {
        wa dupTemp$0 = null;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        wa var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        int var6Lifetime1;
        int var7Lifetime1;
        int var10Lifetime1;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 != -20677) {
            var13 = (String) null;
            vp.a((String) null, 69);
          }
          var2_int = 16711935 & param1;
          lk.a(param0 ^ 27840);
          var3 = param1 & 65280;
          while (true) {
            dupTemp$0 = tf.a((byte) -92);
            var4 = dupTemp$0;
            if (dupTemp$0 == null) {
              if (bd.field_A) {
                System.out.println(ms.field_a);
              }
              return;
            }
            var5 = gf.field_b * ui.field_p + var4.field_g;
            if (gf.field_b <= var4.field_g) {
              continue;
            }
            var6 = 511 & var4.field_e;
            if (var6 > 256) {
              var6 = 512 - var6;
            }
            var7 = 256 - var6;
            var8 = var4.field_h;
            var9 = var4.field_f;
            if (0 > var4.field_g) {
              var11 = -var4.field_g - 1;
              var8 = var8 - var11;
              var5 = var5 - var4.field_g;
              var9 = var9 - var11 * var4.field_a;
              var4.field_g = 0;
            } else {
              var10 = gf.field_h[var5];
              var10 = ((var7 * (16711935 & var10) & -16711936) + (-16711936 & var2_int * var6) | (var7 * (var10 & 65280) & 16711680) + (16711680 & var3 * var6)) >>> 8;
              incrementValue$1 = var5;
              var5++;
              gf.field_h[incrementValue$1] = var10;
            }
            if (1000 < var8) {
              var8 = 1000;
            }
            if (var8 + var4.field_g > gf.field_b) {
              var8 = -var4.field_g + gf.field_b;
            }
            while (true) {
              var8--;
              if (var8 <= 0) {
                break;
              }
              var6Lifetime1 = 511 & var9;
              if (var6Lifetime1 > 256) {
                var6Lifetime1 = 512 - var6Lifetime1;
              }
              var10Lifetime1 = gf.field_h[var5];
              var7Lifetime1 = -var6Lifetime1 + 256;
              var10Lifetime1 = ((16711680 & var6Lifetime1 * var3) + (var7Lifetime1 * (65280 & var10Lifetime1) & 16711680) | (var2_int * var6Lifetime1 & -16711936) + (-16711936 & (16711935 & var10Lifetime1) * var7Lifetime1)) >>> 8;
              incrementValue$2 = var5;
              var5++;
              gf.field_h[incrementValue$2] = var10Lifetime1;
              var9 = var9 + var4.field_a;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "vp.I(" + param0 + ',' + param1 + ')');
        }
    }

    final void d(boolean param0) {
        if (this.field_p == null) {
          return;
        }
        this.field_p.field_q = this.field_q;
        if (!param0) {
          this.field_q = (vp) null;
        }
        this.field_q.field_p = this.field_p;
        this.field_p = null;
        this.field_q = null;
    }

    final static eg a(byte param0, ln param1) {
        int var5 = 0;
        oh var2 = null;
        eg var3 = null;
        fs[] var4 = null;
        fs var6 = null;
        int var7 = 0;
        eg stackIn_3_0 = null;
        eg stackIn_19_0 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 != -69) {
            stackIn_3_0 = (eg) null;
            return stackIn_3_0;
          }
          if (oq.field_a.field_Q == null) {
            return null;
          }
          var2 = oq.field_a.field_Q.field_a.d(param0 ^ -69);
          while (var2 != null) {
            if (var2 instanceof eg) {
              var3 = (eg) (var2);
              if (param1 == var3.field_p) {
                var4 = var3.field_h;
                for (var5 = 0; var5 < var4.length; var5++) {
                  var6 = var4[var5];
                  if (var6 == ho.field_d) {
                    stackIn_19_0 = var3;
                    return stackIn_19_0;
                  }
                }
                return null;
              }
            }
            var2 = oq.field_a.field_Q.field_a.a((byte) -71);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_26_0 = var2_ref;
          stackIn_26_1 = new StringBuilder().append("vp.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    public static void e(byte param0) {
        if (param0 != -21) {
          vp.e((byte) -56);
        }
        field_o = null;
        field_s = null;
        field_t = null;
    }

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 511) {
            stackIn_4_0 = bc.field_d.a(true, param0, "");
            return stackIn_4_0;
          }
          stackIn_2_0 = (byte[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("vp.G(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    vp() {
    }

    static {
        field_t = "<%0> HAS WON!";
        field_s = new int[4];
    }
}
