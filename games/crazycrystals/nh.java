/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh extends og implements vd {
    private String[] field_B;
    private pc[] field_D;
    private fd field_E;
    static wb field_A;
    static String field_z;
    static int[] field_H;
    static int field_F;
    static String field_C;

    public final void a(byte param0, int param1, int param2, int param3, pc param4) {
        int var7 = 0;
        int var6_int = 0;
        int var8 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var8 = CrazyCrystals.field_B;
        try {
          var6_int = 26 / ((83 - param0) / 36);
          for (var7 = 0; var7 < this.field_B.length; var7++) {
            if (this.field_D[var7] == param4) {
              this.field_E.a(this.field_B[var7], -23752);
            }
          }
          if (param4 == this.field_D[this.field_B.length]) {
            this.field_E.a(20);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_13_0 = var6;
          stackIn_13_1 = new StringBuilder().append("nh.BA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final boolean a(int param0, int param1, qm param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param0 == 98) {
            stackIn_5_0 = this.a((byte) -73, param2);
            return stackIn_5_0;
          }
          if (param0 != 99) {
            return false;
          }
          stackIn_9_0 = this.a(param2, -25911);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("nh.AA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final static jg a(int param0, md param1) {
        int var7 = 0;
        jg stackIn_25_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        jg var5 = null;
        int var6 = 0;
        int var8 = 0;
        var8 = CrazyCrystals.field_B;
        try {
          var2_int = param1.d((byte) -79, 8);
          if (var2_int > 0) {
            throw new IllegalStateException("" + var2_int);
          }
          var3 = fn.a(1, param1) ? 1 : 0;
          var4 = fn.a(param0 ^ -31742, param1) ? 1 : 0;
          var5 = new jg();
          var5.field_n = (short)param1.d((byte) -87, 16);
          var5.field_L = mh.a((byte) -2, param1, 16, var5.field_L);
          if (param0 != -31741) {
            field_z = (String) null;
          }
          var5.field_G = mh.a((byte) -2, param1, 16, var5.field_G);
          var5.field_b = mh.a((byte) -2, param1, 16, var5.field_b);
          var5.field_I = (short)param1.d((byte) -56, 16);
          var5.field_K = mh.a((byte) -2, param1, 16, var5.field_K);
          var5.field_g = mh.a((byte) -2, param1, 16, var5.field_g);
          var5.field_c = mh.a((byte) -2, param1, 16, var5.field_c);
          if (var3 != 0) {
            var5.field_D = (short)param1.d((byte) -73, 16);
            var5.field_a = mh.a((byte) -2, param1, 16, var5.field_a);
            var5.field_N = mh.a((byte) -2, param1, 16, var5.field_N);
            var5.field_u = mh.a((byte) -2, param1, 16, var5.field_u);
            var5.field_A = mh.a((byte) -2, param1, 16, var5.field_A);
            var5.field_v = mh.a((byte) -2, param1, 16, var5.field_v);
            var5.field_R = mh.a((byte) -2, param1, 16, var5.field_R);
          }
          if (var4 != 0) {
            param1.d((byte) -94, 16);
            var5.field_l = mh.a((byte) -2, param1, 16, var5.field_l);
            var5.field_r = mh.a((byte) -2, param1, 16, var5.field_r);
            var5.field_J = mh.a((byte) -2, param1, 16, var5.field_J);
            var5.field_k = mh.a((byte) -2, param1, 16, var5.field_k);
            var5.field_w = mh.a((byte) -2, param1, 16, var5.field_w);
          }
          if (fn.a(1, param1)) {
            var5.field_B = mh.a((byte) -2, param1, 16, var5.field_B);
          }
          if (fn.a(param0 ^ -31742, param1)) {
            var5.field_o = cj.a(16, 2048, param1, var5.field_o);
            var6 = 0;
            for (var7 = 0; var5.field_o.length > var7; var7++) {
              if (var6 < (255 & var5.field_o[var7])) {
                var6 = var5.field_o[var7] & 255;
              }
            }
            if (0 != var6) {
              var5.field_s = (byte)(var6 + 1);
            } else {
              var5.field_o = null;
            }
          }
          stackIn_25_0 = var5;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_28_0 = var2;
          stackIn_28_1 = new StringBuilder().append("nh.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final static Class a(byte param0, String param1) throws ClassNotFoundException {
        int var2_int = 0;
        RuntimeException var2 = null;
        Class stackIn_3_0 = null;
        Class stackIn_7_0 = null;
        Class stackIn_10_0 = null;
        Class stackIn_13_0 = null;
        Class stackIn_17_0 = null;
        Class stackIn_20_0 = null;
        Class stackIn_24_0 = null;
        Class stackIn_28_0 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1.equals("B")) {
            stackIn_3_0 = Byte.TYPE;
            return stackIn_3_0;
          }
          var2_int = 59 % ((36 - param0) / 42);
          if (param1.equals("I")) {
            stackIn_7_0 = Integer.TYPE;
            return stackIn_7_0;
          }
          if (param1.equals("S")) {
            stackIn_10_0 = Short.TYPE;
            return stackIn_10_0;
          }
          if (param1.equals("J")) {
            stackIn_13_0 = Long.TYPE;
            return stackIn_13_0;
          }
          if (param1.equals("Z")) {
            stackIn_17_0 = Boolean.TYPE;
            return stackIn_17_0;
          }
          if (param1.equals("F")) {
            stackIn_20_0 = Float.TYPE;
            return stackIn_20_0;
          }
          if (param1.equals("D")) {
            stackIn_24_0 = Double.TYPE;
            return stackIn_24_0;
          }
          if (!param1.equals("C")) {
            return Class.forName(param1);
          }
          stackIn_28_0 = Character.TYPE;
          return stackIn_28_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_31_0 = var2;
          stackIn_31_1 = new StringBuilder().append("nh.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    final static void a(int param0, byte param1, ca param2) {
        md var5 = null;
        int var4 = 0;
        if (param1 > -13) {
          return;
        }
        try {
          var5 = tp.field_f;
          var5.d(8, param0);
          var5.field_f = var5.field_f + 1;
          var4 = var5.field_f;
          var5.a(true, 1);
          var5.a(true, param2.field_i);
          var5.a(true, param2.field_k);
          var5.a(param2.field_n, -16384);
          var5.a(param2.field_h, -16384);
          var5.a(param2.field_f, -16384);
          var5.a(param2.field_l, -16384);
          var5.b(var4, (byte) -79);
          var5.c((byte) 61, -var4 + var5.field_f);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "nh.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3) {
        super.a(param0, (byte) -30, param2, param3);
        if (param1 > -12) {
          this.field_E = (fd) null;
        }
        if (param3 != 0) {
          return;
        }
        vc var5 = ai.field_h;
        if (null != this.field_B) {
          var5.a(wb.field_b, this.field_r + param2, this.field_j + param0, this.field_g, 20, 16777215, -1, 0, 0, var5.field_u + var5.field_o);
        }
    }

    public static void a(int param0) {
        if (param0 != -7397) {
          return;
        }
        field_H = null;
        field_A = null;
        field_z = null;
        field_C = null;
    }

    nh(fd param0) {
        super(0, 0, 0, 0, (wo) null);
        try {
          this.field_E = param0;
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "nh.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(String[] param0, int param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        ok var4 = null;
        int var6 = 0;
        var6 = CrazyCrystals.field_B;
        try {
          this.field_v.a(param1 ^ 22800);
          if (param0 != null &&
            param0.length != 0) {
            var3_int = param0.length;
            this.field_B = new String[var3_int];
            for (var4_int = 0; var4_int < var3_int; var4_int++) {
              this.field_B[var4_int] = gd.a((byte) 127, (CharSequence) ((Object) param0[var4_int])).replace(' ', ' ');
            }
            var4 = new ok(ai.field_h, 0, 1);
            this.field_D = new pc[var3_int + 1];
            for (var5 = param1; var3_int > var5; var5++) {
              this.field_D[var5] = new pc(this.field_B[var5], (bi) (this));
              this.field_D[var5].field_i = (wo) ((Object) var4);
              this.field_D[var5].field_t = fg.field_l;
              this.field_D[var5].a(15, 0, 16 * var5 + 20, 80, (byte) -52);
              this.b(this.field_D[var5], param1 + 60);
            }
            this.field_D[var3_int] = new pc(qo.field_p, (bi) (this));
            this.field_D[var3_int].field_i = (wo) ((Object) var4);
            this.field_D[var3_int].a(15, 0, 20 + (1 + var3_int) * 16, 100, (byte) -52);
            this.b(this.field_D[var3_int], param1 - 118);
            return;
          }
          this.field_B = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("nh.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_A = new wb();
        field_C = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
    }
}
