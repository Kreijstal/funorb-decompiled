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
        if (!param1) {
            te discarded$0 = ((ff) this).b((byte) 13);
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
        ((ff) this).field_c.c((byte) 125);
        if (param0 != -1) {
            ff.c(113);
        }
        kk.field_a = null;
    }

    final static f a(int param0, int param1, int param2, int param3, DataInputStream param4) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        f var8 = null;
        int var9 = 0;
        Object var10 = null;
        f stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        f stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        var9 = CrazyCrystals.field_B;
        try {
          L0: {
            var5_int = param4.readUnsignedByte();
            var6 = 0;
            var7 = kf.field_d[0];
            var8_int = param2;
            L1: while (true) {
              if (var8_int >= kf.field_d.length) {
                var8 = (f) lm.field_d[var6].clone();
                var8.a(var5_int + -var7, 89);
                var8.a(param0, param1, param3, param4, (byte) -35);
                var10 = null;
                var8.a(param2 ^ 393988, param3, param1, (f[][]) null);
                stackOut_6_0 = (f) var8;
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                L2: {
                  if (kf.field_d[var8_int] > var5_int) {
                    break L2;
                  } else {
                    break L2;
                  }
                }
                var8_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var5;
            stackOut_8_1 = new StringBuilder().append("ff.M(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param4 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_7_0;
    }

    ff() {
        jj.field_b = 0;
        kb.field_g = 0;
    }

    te b(byte param0) {
        if (param0 != -39) {
            return null;
        }
        if (kb.field_g < 192) {
            kb.field_g = kb.field_g + 12;
        }
        nj.field_k = kk.field_a[0].length;
        pa.a(kk.field_a, 0, 0, (byte) -45);
        nj.field_k = 0;
        ((ff) this).field_c = ((ff) this).field_c.a(param0 + 37);
        if (null == ((ff) this).field_c) {
            return null;
        }
        return (te) this;
    }

    final void c(byte param0) {
        int var3 = CrazyCrystals.field_B;
        if (param0 != -41) {
            field_b = null;
        }
        l var2 = ((ff) this).field_c;
        while (var2 != null) {
            var2 = var2.b((byte) -90);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Score";
        field_b = new int[8192];
        field_e = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
    }
}
