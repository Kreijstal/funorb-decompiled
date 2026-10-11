/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk extends kj {
    static java.awt.Color field_H;
    private im field_B;
    static String field_G;
    static String field_C;
    static tl field_E;
    static int[] field_I;

    final void o(int param0) {
        int var5 = OrbDefence.field_D ? 1 : 0;
        km var2 = new km(this.field_B);
        int var4 = -70 / ((param0 - 85) / 32);
        sg var3 = (sg) (var2.d(27935));
        while (var3 != null) {
          if (var3.d(false)) {
            var3.b(57);
          }
          var3 = (sg) (var2.b(true));
        }
        this.field_y = (pj) ((Object) this.k(3469));
    }

    public static void m(int param0) {
        field_I = null;
        field_E = null;
        field_C = null;
        if (param0 > -18) {
          field_H = (java.awt.Color) null;
        }
        field_H = null;
        field_G = null;
    }

    final pj c(boolean param0) {
        int var4 = OrbDefence.field_D ? 1 : 0;
        km var2 = new km(this.field_B);
        sg var3 = (sg) (var2.d(27935));
        while (var3 != null) {
          if (var3.field_A) {
            return var3.b((byte) -109);
          }
          var3 = (sg) (var2.b(!param0 ? true : false));
        }
        if (!param0) {
          return null;
        }
        field_I = (int[]) null;
        return null;
    }

    final void n(int param0) {
        int var4 = OrbDefence.field_D ? 1 : 0;
        if (param0 != 7920) {
          this.field_B = (im) null;
        }
        km var2 = new km(this.field_B);
        sg var3 = (sg) (var2.d(27935));
        while (var3 != null) {
          var3.field_A = false;
          var3 = (sg) (var2.b(true));
        }
        this.field_y = null;
    }

    final sg k(int param0) {
        int var4 = OrbDefence.field_D ? 1 : 0;
        km var2 = new km(this.field_B);
        sg var3 = (sg) (var2.d(param0 + 24466));
        while (var3 != null) {
          if (var3.field_A) {
            return var3;
          }
          var3 = (sg) (var2.b(true));
        }
        if (param0 == 3469) {
          return null;
        }
        CharSequence var5 = (CharSequence) null;
        sk.a((byte) -126, (CharSequence) null);
        return null;
    }

    public sk() {
        super(0, 0, ed.field_a, lh.field_d, (td) null, (ag) null);
        this.field_B = new im();
    }

    final void l(int param0) {
        int var4 = OrbDefence.field_D ? 1 : 0;
        if (param0 > -5) {
          this.o(-56);
        }
        km var2 = new km(this.field_B);
        sg var3 = (sg) (var2.d(27935));
        while (var3 != null) {
          if (var3.l(194)) {
            var3.b(57);
          }
          var3 = (sg) (var2.b(true));
        }
    }

    final static boolean a(char param0, int param1) {
        boolean stackIn_9_0 = false;
        if (param1 != -46) {
          field_H = (java.awt.Color) null;
        }
        stackIn_9_0 = (param0 == 160) || (param0 == 32) || (param0 == 95) || (param0 == 45);
        return stackIn_9_0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var7 = OrbDefence.field_D ? 1 : 0;
        if (null != this.field_j) {
          this.field_j.a(param0, param3, (pj) (this), param2 - 1052969, true);
        }
        km var5 = new km(this.field_B);
        pj var6 = (pj) (var5.c(param2 ^ -1040926));
        if (param2 != 1048575) {
          pj var8 = (pj) null;
          this.b((byte) -95, (pj) null);
        }
        while (var6 != null) {
          var6.a(param0 + this.field_n, param1, param2 ^ 0, param3 + this.field_s);
          var6 = (pj) (var5.a((byte) -84));
        }
    }

    final void b(byte param0, pj param1) {
        sg var3 = null;
        CharSequence var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (!(param1 instanceof sg)) {
            throw new IllegalArgumentException();
          }
          var3 = (sg) (param1);
          this.field_B.a(var3, 9);
          var3.field_A = true;
          var3.a(-81, (pj) (this));
          if (param0 != 74) {
            var4 = (CharSequence) null;
            sk.a((byte) 48, (CharSequence) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_8_0 = var3_ref;
          stackIn_8_1 = new StringBuilder().append("sk.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static int a(byte param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var5 = 0;
        CharSequence var6 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param0 != 76) {
            var6 = (CharSequence) null;
            sk.a((byte) 9, (CharSequence) null);
          }
          var2_int = param1.length();
          var3 = 0;
          for (var4 = 0; var4 < var2_int; var4++) {
            var3 = -var3 + (var3 << 5) + oc.a(-109, param1.charAt(var4));
          }
          stackIn_7_0 = var3;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("sk.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_C = "Continue";
        field_H = new java.awt.Color(10040319);
        field_E = new tl();
        field_I = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
    }
}
