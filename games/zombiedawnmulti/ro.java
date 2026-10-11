/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ro extends kb {
    static th field_M;
    static cj field_O;
    static boolean field_L;
    static String field_N;

    ro(String[] param0, fc param1) {
        super(param0, param1);
    }

    public static void b(byte param0) {
        field_N = null;
        field_M = null;
        if (param0 <= 37) {
          field_L = false;
          field_O = null;
          return;
        }
        field_O = null;
    }

    final static int a(int param0, char param1, CharSequence param2) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param0 > -118) {
            stackIn_3_0 = 101;
            return stackIn_3_0;
          }
          var3_int = 0;
          var4 = param2.length();
          for (var5 = 0; var4 > var5; var5++) {
            if (param1 == param2.charAt(var5)) {
              var3_int++;
            }
          }
          stackIn_11_0 = var3_int;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("ro.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void a(k param0, byte param1) {
        k stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_4_2 = 0;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        ek var3 = null;
        ce var3_ref = null;
        RuntimeException var3_ref2 = null;
        bf var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        pa var7 = null;
        og var8 = null;
        ge var9 = null;
        int var3_intLifetime1;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          param0.a(-110, this.field_r);
          param0.a(this.field_H, (byte) -96);
          stackIn_3_0 = (k) (param0);
          stackIn_3_1 = 109;
          if (this.field_i) {
            stackIn_4_2 = 1;
          } else {
            stackIn_4_2 = 0;
          }
          ((k) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_4_2);
          param0.a(this.field_C, (byte) -121);
          param0.a(this.field_I, (byte) -55);
          param0.a(this.field_g, (byte) -54);
          param0.a(-73, this.field_l);
          for (var3_int = 0; this.field_t > var3_int; var3_int++) {
            param0.a(110, this.field_y[var3_int]);
            param0.d(this.field_D[var3_int][0], -8593);
            param0.d(this.field_D[var3_int][1], -8593);
            param0.a(this.field_d[var3_int], (byte) -84);
            param0.d((int)(this.field_e[var3_int] >>> 40), -8593);
            param0.a(this.field_a[var3_int], (byte) -85);
            param0.a(this.field_z[var3_int], (byte) -78);
          }
          var3 = (ek) (this.field_K.c(40));
          while (var3 != null) {
            boolean decompiledFrameRemainder0 = true;
            if (var3 instanceof pa) {
              var7 = (pa) (var3);
              decompiledFrameRemainder0 = (var7.field_Q != 21);
              if (decompiledFrameRemainder0) {
                decompiledFrameRemainder0 = !(var7.field_Z);
              }
            }
            if (decompiledFrameRemainder0) {
              param0.a(108, this.a(var3, (byte) -105));
              param0.a(110, var3.field_x);
              param0.a(var3.e((byte) -112), (byte) -67);
              param0.a(var3.g(1829947600), (byte) -95);
              var4_int = var3.field_D;
              if (var3 instanceof ge) {
                var9 = (ge) (var3);
                var4_int = var4_int | var9.field_gb << 30;
              } else {
                if (var3 instanceof og) {
                  var8 = (og) (var3);
                  if (var8.field_Q) {
                    var4_int = var4_int | 536870912;
                  }
                }
              }
              var4_int = var4_int & 255 | (-16777216 & var4_int) >> 16;
              param0.a(var4_int, (byte) -104);
            }
            var3 = (ek) (this.field_K.b(6));
          }
          var3_ref = (ce) (this.field_s.c(102));
          while (var3_ref != null) {
            param0.a(-64, 5);
            param0.a(112, var3_ref.field_q);
            param0.a((var3_ref.field_m + ip.field_f) * 24, (byte) -69);
            param0.a((ip.field_f + var3_ref.field_t) * 24, (byte) -54);
            param0.a(var3_ref.field_s, (byte) -103);
            var3_ref = (ce) (this.field_s.b(6));
          }
          var3_intLifetime1 = 11 + 16 * this.field_t + (this.field_K.a(0) + this.field_s.a(0) + this.field_A.a(0)) * 8;
          if (57 + var3_intLifetime1 > 2000) {
            param0.a(117, 0);
            return;
          }
          var4 = (bf) (this.field_A.c(59));
          if (param1 >= -107) {
            return;
          }
          while (var4 != null) {
            param0.a(-94, 4);
            param0.a(-36, 0);
            param0.a(var4.field_i, (byte) -104);
            param0.a(var4.field_l, (byte) -107);
            var5 = 0;
            var5 = var5 | var4.field_o << 30;
            param0.a(var5, (byte) -105);
            var4 = (bf) (this.field_A.b(6));
          }
          param0.a(-106, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref2 = decompiledCaughtException;
          stackIn_39_0 = var3_ref2;
          stackIn_39_1 = new StringBuilder().append("ro.E(");
          if (param0 == null) {
            stackIn_40_2 = "null";
          } else {
            stackIn_40_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_39_0), ((StringBuilder) (Object) stackIn_39_1).append(stackIn_40_2).append(',').append(param1).append(')').toString());
        }
    }

    private final int a(ek param0, byte param1) {
        RuntimeException var3 = null;
        k var4 = null;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -80) {
            var4 = (k) null;
            this.a((k) null, (byte) 11);
          }
          if (param0 instanceof ge) {
            stackIn_12_0 = 1;
            return stackIn_12_0;
          }
          if (param0 instanceof lm) {
            stackIn_5_0 = 2;
            return stackIn_5_0;
          }
          if (!(param0 instanceof og)) {
            stackIn_10_0 = 0;
            return stackIn_10_0;
          }
          stackIn_8_0 = 3;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_15_0 = var3;
          stackIn_15_1 = new StringBuilder().append("ro.B(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int c(byte param0) {
        if (param0 < 116) {
          return 69;
        }
        return (li.field_C << 4) + ((qe.field_g << 2) + ba.field_q);
    }

    static {
        field_N = "? ? ?";
    }
}
