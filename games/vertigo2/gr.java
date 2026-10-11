/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gr extends sp implements ij {
    static int field_Z;
    private d field_X;
    static int field_Y;
    static int[][] field_W;
    static String field_ab;

    public final void a(int param0, d param1, byte param2, int param3, int param4) {
        try {
          if (this.field_X == param1) {
            this.m(19447);
          }
          int var6_int = -23 % ((-63 - param2) / 51);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "gr.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    gr(sd param0, ll param1) {
        super(param0, 200, 150);
        Object var3 = null;
        iq var4 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          if (param1 != b.field_d) {
            if (sd.field_I != param1) {
              if (el.field_d == param1) {
                var3 = w.field_D;
                this.field_s = this.field_s + 30;
              }
            } else {
              var3 = lh.field_a;
              this.field_s = this.field_s + 10;
              if (ui.c(-101)) {
                this.field_s = this.field_s + 20;
                var3 = lk.field_c;
              }
            }
          } else {
            var3 = ko.field_U;
          }
          var4 = new iq((String) (var3), (uf) null);
          var4.field_n = this.field_n;
          var4.field_s = 80;
          var4.field_t = 50;
          var4.field_o = 0;
          var4.field_B = (ur) ((Object) new va(bl.field_N, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.c((byte) 119, var4);
          this.field_X = this.a(-6, (uf) (this), lr.field_N);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("gr.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw wn.a((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          if ((param0 >= param1 ||
            128 <= param1) &&
            (param1 < 160 ||
            255 < param1)) {
            if (param1 != 0) {
              var6 = fa.field_o;
              var2 = var6;
              var3 = 0;
              while (var6.length > var3) {
                var4 = var6[var3];
                if (param1 != var4) {
                  var3++;
                  continue;
                }
                return true;
              }
            }
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var2_ref), "gr.A(" + param0 + ',' + param1 + ')');
        }
    }

    public static void g(byte param0) {
        field_W = (int[][]) null;
        field_ab = null;
        if (param0 <= 52) {
          gr.g((byte) -83);
        }
    }

    private final void m(int param0) {
        if (param0 != 19447) {
          return;
        }
        if (!this.field_I) {
          return;
        }
        this.field_I = false;
    }

    private final d a(int param0, uf param1, String param2) {
        d var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        d stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new d(param2, param1);
          var4.field_B = (ur) ((Object) new vo());
          var5 = param0 + this.field_s;
          this.field_s = this.field_s + 38;
          var4.a(false, 15, var5, 30, -16 + (this.field_n - 14));
          this.c((byte) -119, var4);
          this.g(param0 - 97);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("gr.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static String a(String param0, byte param1, r param2, String param3, String param4) {
        RuntimeException var5 = null;
        String var6 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 34) {
            var6 = (String) null;
            gr.a((String) null, (byte) -120, (r) null, (String) null, (String) null);
          }
          if (param2.b(0)) {
            stackIn_6_0 = param3 + " - " + param2.a(param4, 0) + "%";
            return stackIn_6_0;
          }
          stackIn_4_0 = (String) (param0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("gr.B(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    static {
        field_ab = "Red won!";
        field_Y = 0;
    }
}
