/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ju extends rt {
    private int field_l;
    static gb field_k;
    static int field_m;

    final static cd e(int param0) {
        String var1 = null;
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
        rb var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_2_1 = 0;
        int stackIn_3_0 = 0;
        int stackIn_3_1 = 0;
        int stackIn_4_0 = 0;
        int stackIn_4_1 = 0;
        int stackIn_4_2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_6_1 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_8_0 = 0;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        int stackOut_5_0 = 0;
        int stackOut_5_1 = 0;
        int stackOut_7_0 = 0;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_6_2 = 0;
        int stackOut_1_0 = 0;
        int stackOut_1_1 = 0;
        int stackOut_3_0 = 0;
        int stackOut_3_1 = 0;
        int stackOut_3_2 = 0;
        int stackOut_2_0 = 0;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        ((ju) this).field_j.a((rt) this, 1);
        if (param0) {
          L0: {
            var4 = (rb) null;
            ju.a(2, (rb) null);
            stackOut_5_0 = ((ju) this).field_f;
            stackOut_5_1 = 10242;
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (!param1) {
              stackOut_7_0 = stackIn_7_0;
              stackOut_7_1 = stackIn_7_1;
              stackOut_7_2 = 33071;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L0;
            } else {
              stackOut_6_0 = stackIn_6_0;
              stackOut_6_1 = stackIn_6_1;
              stackOut_6_2 = 10497;
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L0;
            }
          }
          jaggl.OpenGL.glTexParameteri(stackIn_8_0, stackIn_8_1, stackIn_8_2);
          return;
        } else {
          L1: {
            stackOut_1_0 = ((ju) this).field_f;
            stackOut_1_1 = 10242;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            stackIn_2_0 = stackOut_1_0;
            stackIn_2_1 = stackOut_1_1;
            if (!param1) {
              stackOut_3_0 = stackIn_3_0;
              stackOut_3_1 = stackIn_3_1;
              stackOut_3_2 = 33071;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              stackIn_4_2 = stackOut_3_2;
              break L1;
            } else {
              stackOut_2_0 = stackIn_2_0;
              stackOut_2_1 = stackIn_2_1;
              stackOut_2_2 = 10497;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              stackIn_4_2 = stackOut_2_2;
              break L1;
            }
          }
          jaggl.OpenGL.glTexParameteri(stackIn_4_0, stackIn_4_1, stackIn_4_2);
          return;
        }
    }

    final static String a(int param0, CharSequence param1) {
        String var2 = null;
        rb var3 = null;
        L0: {
          var2 = vf.a(AceOfSkies.a(param1, -44), 28304);
          if (var2 != null) {
            break L0;
          } else {
            var2 = "";
            break L0;
          }
        }
        if (param0 != 0) {
          var3 = (rb) null;
          ju.a(25, (rb) null);
          return var2;
        } else {
          return var2;
        }
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
        ((ju) this).field_l = param2;
        ((ju) this).field_j.a((rt) this, 1);
        jaggl.OpenGL.glPixelStorei(3317, 1);
        jaggl.OpenGL.glTexImage1Dub(((ju) this).field_f, 0, ((ju) this).field_b, ((ju) this).field_l, 0, param4, 5121, param3, 0);
        jaggl.OpenGL.glPixelStorei(3317, 4);
        ((ju) this).a(true, -128);
    }

    final static void a(int param0, rb param1) {
        int var2 = 0;
        rb var3 = null;
        ld.field_a = param1.i((byte) 0) << 1044032549;
        var2 = param1.g(113);
        fs.field_c = 1835008 & var2 << -1937030894;
        if (param0 != 965924047) {
          var3 = (rb) null;
          ju.a(-45, (rb) null);
          ld.field_a = ld.field_a + (var2 >> -1046617053);
          fs.field_c = fs.field_c + (param1.i((byte) 0) << -1607554110);
          var2 = param1.g(57);
          tj.field_o = (63 & var2) << 965924047;
          fs.field_c = fs.field_c + (var2 >> -19527546);
          tj.field_o = tj.field_o + (param1.g(-81) << -691642553);
          var2 = param1.g(-56);
          gl.field_b = 65536 & var2 << 1405141488;
          tj.field_o = tj.field_o + (var2 >> -738820607);
          gl.field_b = gl.field_b + param1.i((byte) 0);
          return;
        } else {
          ld.field_a = ld.field_a + (var2 >> -1046617053);
          fs.field_c = fs.field_c + (param1.i((byte) 0) << -1607554110);
          var2 = param1.g(57);
          tj.field_o = (63 & var2) << 965924047;
          fs.field_c = fs.field_c + (var2 >> -19527546);
          tj.field_o = tj.field_o + (param1.g(-81) << -691642553);
          var2 = param1.g(-56);
          gl.field_b = 65536 & var2 << 1405141488;
          tj.field_o = tj.field_o + (var2 >> -738820607);
          gl.field_b = gl.field_b + param1.i((byte) 0);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new gb(1.5, 2, 3, 100, 3, 5.0, 10.0, 16, 1);
    }
}
