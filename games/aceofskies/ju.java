/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ju extends rt {
    private int field_l;
    static gb field_k;
    static int field_m;

    final static cd e(int param0) {
        String var1;
        L0: {
          var1 = la.a(4);
          if (var1 == null) {
            break L0;
          } else {
            if ((var1.indexOf('@') ^ -1) > -1) {
              break L0;
            } else {
              var1 = "";
              break L0;
            }
          }
        }
        if (param0 <= 120) {
          field_k = (gb) null;
          return new cd(la.a(4), pk.d(-98));
        } else {
          return new cd(la.a(4), pk.d(-98));
        }
    }

    final void b(boolean param0, boolean param1) {
        rb var4;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        this.field_j.a((rt) (this), 1);
        if (param0) {
          L0: {
            var4 = (rb) null;
            ju.a(2, (rb) null);
            stackIn_7_0 = this.field_f;

            stackIn_7_1 = 10242;

            if (!param1) {
              stackIn_8_0 = stackIn_7_0;
              stackIn_8_1 = stackIn_7_1;
              stackIn_8_2 = 33071;
              break L0;
            } else {
              stackIn_8_0 = stackIn_7_0;
              stackIn_8_1 = stackIn_7_1;
              stackIn_8_2 = 10497;
              break L0;
            }
          }
          jaggl.OpenGL.glTexParameteri(stackIn_8_0, stackIn_8_1, stackIn_8_2);
          return;
        } else {
          L1: {
            stackIn_3_0 = this.field_f;

            stackIn_3_1 = 10242;

            if (!param1) {
              stackIn_4_0 = stackIn_3_0;
              stackIn_4_1 = stackIn_3_1;
              stackIn_4_2 = 33071;
              break L1;
            } else {
              stackIn_4_0 = stackIn_3_0;
              stackIn_4_1 = stackIn_3_1;
              stackIn_4_2 = 10497;
              break L1;
            }
          }
          jaggl.OpenGL.glTexParameteri(stackIn_4_0, stackIn_4_1, stackIn_4_2);
          return;
        }
    }

    final static String a(int param0, CharSequence param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        rb var3 = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = vf.a(AceOfSkies.a(param1, -44), 28304);
              if (var2 != null) {
                break L1;
              } else {
                var2 = "";
                break L1;
              }
            }
            L2: {
              if (param0 == 0) {
                break L2;
              } else {
                var3 = (rb) null;
                ju.a(25, (rb) null);
                break L2;
              }
            }
            stackIn_5_0 = (String) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2_ref);

            stackIn_8_1 = new StringBuilder().append("ju.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_5_0;
    }

    public final void a(byte param0) {
        if (param0 != 11) {
            field_k = (gb) null;
        }
    }

    public static void d(int param0) {
        if (param0 <= 121) {
            field_k = (gb) null;
            field_k = null;
            return;
        }
        field_k = null;
    }

    ju(wl param0, int param1, int param2, byte[] param3, int param4) {
        super(param0, 3552, param1, param2, false);
        try {
            this.field_l = param2;
            this.field_j.a((rt) (this), 1);
            jaggl.OpenGL.glPixelStorei(3317, 1);
            jaggl.OpenGL.glTexImage1Dub(this.field_f, 0, this.field_b, this.field_l, 0, param4, 5121, param3, 0);
            jaggl.OpenGL.glPixelStorei(3317, 4);
            this.a(true, -128);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "ju.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void a(int param0, rb param1) {
        int var2_int = 0;
        try {
            ld.field_a = param1.i((byte) 0) << 1044032549;
            var2_int = param1.g(113);
            fs.field_c = 1835008 & var2_int << -1937030894;
            if (param0 != 965924047) {
                rb var3 = (rb) null;
                ju.a(-45, (rb) null);
            }
            ld.field_a = ld.field_a + (var2_int >> -1046617053);
            fs.field_c = fs.field_c + (param1.i((byte) 0) << -1607554110);
            var2_int = param1.g(57);
            tj.field_o = (63 & var2_int) << 965924047;
            fs.field_c = fs.field_c + (var2_int >> -19527546);
            tj.field_o = tj.field_o + (param1.g(-81) << -691642553);
            var2_int = param1.g(-56);
            gl.field_b = 65536 & var2_int << 1405141488;
            tj.field_o = tj.field_o + (var2_int >> -738820607);
            gl.field_b = gl.field_b + param1.i((byte) 0);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "ju.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = new gb(1.5, 2, 3, 100, 3, 5.0, 10.0, 16, 1);
    }
}
