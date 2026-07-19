/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class ff extends te {
    static String field_d;
    l field_c;
    static int[] field_b;
    static char[] field_e;

    final void a(double param0, boolean param1) {
        te discarded$0 = null;
        if (!param1) {
            discarded$0 = this.b((byte) 13);
        }
        kh.d(0, 0, 480, 480, 0, kb.field_g);
        oj.a(false, kk.field_a, 480, 480, (double)(-jj.field_b) + (double)kk.field_a.length * param0, 0, param0, 0, (byte) -32, param0 * (double)kk.field_a[0].length);
    }

    public static void c(int param0) {
        if (param0 != -18692) {
            ff.c(33);
        }
        field_e = null;
        field_d = null;
        field_b = null;
    }

    void a(int param0) {
        this.field_c.c((byte) 125);
        if (param0 != -1) {
            ff.c(113);
        }
        kk.field_a = (f[][]) null;
    }

    final static f a(int param0, int param1, int param2, int param3, DataInputStream param4) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        f var8 = null;
        int var9 = 0;
        f[][] var10 = null;
        f stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        f stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var9 = CrazyCrystals.field_B;
        try {
          L0: {
            var5_int = param4.readUnsignedByte();
            var6 = 0;
            var7 = kf.field_d[0];
            var8_int = param2;
            L1: while (true) {
              if (var8_int >= kf.field_d.length) {
                var8 = (f) (lm.field_d[var6].clone());
                var8.a(var5_int + -var7, 89);
                var8.a(param0, param1, param3, param4, (byte) -35);
                var10 = (f[][]) null;
                var8.a(param2 ^ 393988, param3, param1, (f[][]) null);
                stackOut_9_0 = (f) (var8);
                stackIn_10_0 = stackOut_9_0;
                break L0;
              } else {
                if (kf.field_d[var8_int] <= var5_int) {
                  L2: {
                    if (kf.field_d[var8_int] > var7) {
                      var6 = var8_int;
                      var7 = kf.field_d[var8_int];
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  var8_int++;
                  continue L1;
                } else {
                  var8_int++;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var5);
            stackOut_11_1 = new StringBuilder().append("ff.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param4 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        return stackIn_10_0;
    }

    ff() {
        jj.field_b = 0;
        kb.field_g = 0;
    }

    te b(byte param0) {
        if (param0 != -39) {
            return (te) null;
        }
        if ((kb.field_g ^ -1) > -193) {
            kb.field_g = kb.field_g + 12;
        }
        nj.field_k = kk.field_a[0].length;
        pa.a(kk.field_a, 0, 0, (byte) -45);
        nj.field_k = 0;
        this.field_c = this.field_c.a(param0 + 37);
        if (null == this.field_c) {
            return null;
        }
        return (te) (this);
    }

    final void c(byte param0) {
        int var3 = CrazyCrystals.field_B;
        if (param0 != -41) {
            field_b = (int[]) null;
        }
        l var2 = this.field_c;
        while (var2 != null) {
            var2 = var2.b((byte) -90);
        }
    }

    static {
        field_d = "Score";
        field_b = new int[8192];
        field_e = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
    }
}
