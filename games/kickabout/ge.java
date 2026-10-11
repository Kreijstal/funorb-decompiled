/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ge extends jd {
    static ff field_j;
    static String[] field_o;
    private ga field_l;
    static ut field_k;
    static int[] field_m;
    static hd field_n;

    final static void a(int param0, int param1, byte param2, int param3) {
        hn var4 = null;
        hn var4Lifetime1;
        if (param2 < 93) {
          field_o = (String[]) null;
          var4 = new hn(2, new int[]{param1, param3, param0});
          ii.a(var4, 73);
          if (25 == cq.field_h.field_c) {
            ((b) (cq.field_h)).h((byte) 84);
            return;
          }
          return;
        }
        var4Lifetime1 = new hn(2, new int[]{param1, param3, param0});
        ii.a(var4Lifetime1, 73);
        if (25 != cq.field_h.field_c) {
          return;
        }
        ((b) (cq.field_h)).h((byte) 84);
    }

    ge(ga param0, ga param1) {
        super(param0);
        try {
          this.field_l = param1;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "ge.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(byte param0) {
        field_o = null;
        field_m = null;
        field_n = null;
        field_j = null;
        if (param0 == 76) {
          field_k = null;
          return;
        }
        field_j = (ff) null;
        field_k = null;
    }

    final String a(byte param0, String param1) {
        l var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        String stackIn_6_0 = null;
        String stackIn_8_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_l instanceof cw) {
            var3 = ((cw) ((Object) this.field_l)).a((byte) -115);
            if (var3 != null) {
              if (var3.c(-24407) == he.field_yb &&
                !param1.equals(this.field_l.field_q)) {
                stackIn_6_0 = rl.field_p;
                return stackIn_6_0;
              }
              stackIn_8_0 = var3.b(-67);
              return stackIn_8_0;
            }
          }
          if (param0 != 25) {
            var4 = (String) null;
            this.a((byte) -109, (String) null);
          }
          if (param1.equals(this.field_l.field_q)) {
            return null;
          }
          stackIn_14_0 = rl.field_p;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("ge.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static void a(gv param0, boolean param1) {
        int var2_int = 0;
        int var3 = Kickabout.field_G;
        for (var2_int = bk.field_c.length - 1; 1 <= var2_int; var2_int--) {
          bk.field_c[var2_int] = bk.field_c[var2_int - 1];
        }
        if (param1) {
          return;
        }
        try {
          bk.field_c[0] = param0;
          e.field_j = 0;
        } catch (RuntimeException runtimeException) {
          throw nb.a((Throwable) ((Object) runtimeException), "ge.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final rv a(String param0, int param1) {
        l var3 = null;
        RuntimeException var3_ref = null;
        rv stackIn_8_0 = null;
        rv stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -5) {
            field_j = (ff) null;
          }
          if (this.field_l instanceof cw) {
            var3 = ((cw) ((Object) this.field_l)).a((byte) -113);
            if (var3 != null &&
              var3.c(-24407) != he.field_yb) {
              stackIn_8_0 = jt.field_Bb;
              return stackIn_8_0;
            }
          }
          if (param0.equals(this.field_l.field_q)) {
            stackIn_12_0 = he.field_yb;
          } else {
            stackIn_12_0 = jt.field_Bb;
          }
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("ge.E(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final static byte[] a(int param0, ut param1) {
        int var5 = 0;
        int var6 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        byte[] stackIn_3_0 = null;
        byte[] stackIn_33_0 = null;
        RuntimeException stackIn_36_0 = null;
        StringBuilder stackIn_36_1 = null;
        String stackIn_37_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] var9 = null;
        var8 = Kickabout.field_G;
        try {
          var9 = new byte[param1.field_v * (param1.field_o >> 3)];
          var2 = var9;
          if (param0 != 16) {
            stackIn_3_0 = (byte[]) null;
            return stackIn_3_0;
          }
          var3 = 0;
          var4 = 0;
          for (var5 = 0; param1.field_v > var5; var5++) {
            for (var6 = 0; param1.field_o > var6; var6 += 8) {
              var7 = 0;
              incrementValue$0 = var4;
              var4++;
              if (param1.field_y[incrementValue$0] != 0) {
                var7 = (byte)(var7 | 1);
              }
              incrementValue$1 = var4;
              var4++;
              if (0 != param1.field_y[incrementValue$1]) {
                var7 = (byte)(var7 | 2);
              }
              incrementValue$2 = var4;
              var4++;
              if (param1.field_y[incrementValue$2] != 0) {
                var7 = (byte)(var7 | 4);
              }
              incrementValue$3 = var4;
              var4++;
              if (param1.field_y[incrementValue$3] != 0) {
                var7 = (byte)(var7 | 8);
              }
              incrementValue$4 = var4;
              var4++;
              if (param1.field_y[incrementValue$4] != 0) {
                var7 = (byte)(var7 | 16);
              }
              incrementValue$5 = var4;
              var4++;
              if (param1.field_y[incrementValue$5] != 0) {
                var7 = (byte)(var7 | 32);
              }
              incrementValue$6 = var4;
              var4++;
              if (param1.field_y[incrementValue$6] != 0) {
                var7 = (byte)(var7 | 64);
              }
              incrementValue$7 = var4;
              var4++;
              if (param1.field_y[incrementValue$7] != 0) {
                var7 = (byte)(var7 | 128);
              }
              incrementValue$8 = var3;
              var3++;
              var9[incrementValue$8] = (byte)var7;
            }
          }
          stackIn_33_0 = var9;
          return stackIn_33_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_36_0 = var2_ref;
          stackIn_36_1 = new StringBuilder().append("ge.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_37_2 = "null";
          } else {
            stackIn_37_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_36_0), ((StringBuilder) (Object) stackIn_36_1).append(stackIn_37_2).append(')').toString());
        }
    }

    static {
        field_j = new ff(9, 0, 4, 1);
        field_m = new int[2];
    }
}
