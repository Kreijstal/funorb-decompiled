/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dib extends ev {
    private int field_i;
    private int field_g;
    private int field_f;
    static String field_j;
    private int field_h;

    final static void a(File param0, int param1, byte[] param2, byte param3) throws IOException {
        DataInputStream var4 = null;
        try {
            var4 = new DataInputStream((InputStream) (Object) new BufferedInputStream((InputStream) (Object) new FileInputStream(param0)));
            {
                var4.readFully(param2, 0, param1);
            }
            var4.close();
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) (Object) runtimeException, "dib.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + 119 + ')');
        }
    }

    final static int a(byte param0, int param1, int param2, int param3) {
        int var4 = 0;
        if (param0 <= 49) {
            Object var5 = null;
            tsa[] discarded$3 = dib.a((String) null, 68);
            if (param2 >= 256) {
                return param1;
            }
            if (!(param2 > 0)) {
                return param3;
            }
            var4 = 256 + -param2;
            return (16711935 & var4 * (param3 & 16711935) - -(param2 * (16711935 & param1)) >>> 8) + (-16711936 & ((-16711855 & param1) >>> 8) * param2 + ((param3 & -16711919) >>> 8) * var4);
        }
        if (param2 >= 256) {
            return param1;
        }
        if (!(param2 > 0)) {
            return param3;
        }
        var4 = 256 + -param2;
        return (16711935 & var4 * (param3 & 16711935) - -(param2 * (16711935 & param1)) >>> 8) + (-16711936 & ((-16711855 & param1) >>> 8) * param2 + ((param3 & -16711919) >>> 8) * var4);
    }

    dib(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        super(param4, param5, param6);
        ((dib) this).field_g = param0;
        ((dib) this).field_i = param2;
        ((dib) this).field_f = param1;
        ((dib) this).field_h = param3;
    }

    final static tsa[] a(String param0, int param1) {
        ij var2 = null;
        RuntimeException var2_ref = null;
        tsa[] var3 = null;
        int var4 = 0;
        tsa var5 = null;
        int var6 = 0;
        tsa[] stackIn_4_0 = null;
        Object stackIn_7_0 = null;
        tsa[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        tsa[] stackOut_3_0 = null;
        tsa[] stackOut_10_0 = null;
        Object stackOut_6_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = VoidHunters.field_G;
        try {
          L0: {
            if (param0.equals((Object) (Object) tkb.field_o)) {
              stackOut_3_0 = neb.field_q;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              var2 = ck.a(-1, param0);
              var3 = new tsa[var2.c(3)];
              var4 = 0;
              var5 = (tsa) (Object) var2.d(0);
              if (param1 >= 32) {
                L1: while (true) {
                  if (var5 == null) {
                    neb.field_q = var3;
                    tkb.field_o = param0;
                    stackOut_10_0 = (tsa[]) var3;
                    stackIn_11_0 = stackOut_10_0;
                    break L0;
                  } else {
                    int incrementValue$2 = var4;
                    var4++;
                    var3[incrementValue$2] = var5;
                    var5 = (tsa) (Object) var2.a((byte) 82);
                    continue L1;
                  }
                }
              } else {
                stackOut_6_0 = null;
                stackIn_7_0 = stackOut_6_0;
                return (tsa[]) (Object) stackIn_7_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2_ref;
            stackOut_12_1 = new StringBuilder().append("dib.H(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L2;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ')');
        }
        return stackIn_11_0;
    }

    final void a(byte param0, int param1, int param2) {
        int var4 = param2 * ((dib) this).field_g >> 12;
        int var5 = ((dib) this).field_i * param2 >> 12;
        int var6 = ((dib) this).field_f * param1 >> 12;
        int var8 = 62 % ((-48 - param0) / 40);
        int var7 = ((dib) this).field_h * param1 >> 12;
        pda.a(var7, var4, ((dib) this).field_d, var6, -2, var5, ((dib) this).field_a);
    }

    final void b(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var4 = param1 * ((dib) this).field_g >> 12;
        var5 = ((dib) this).field_i * param1 >> 12;
        if (param0 != -112) {
          int discarded$1 = dib.a((byte) 92, -127, 80, 107);
          var6 = param2 * ((dib) this).field_f >> 12;
          var7 = ((dib) this).field_h * param2 >> 12;
          fcb.a(((dib) this).field_e, var7, var6, var4, var5, (byte) -117);
          return;
        } else {
          var6 = param2 * ((dib) this).field_f >> 12;
          var7 = ((dib) this).field_h * param2 >> 12;
          fcb.a(((dib) this).field_e, var7, var6, var4, var5, (byte) -117);
          return;
        }
    }

    final void a(int param0, byte param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var4 = ((dib) this).field_g * param2 >> 12;
        if (param1 != 110) {
          field_j = null;
          var5 = ((dib) this).field_i * param2 >> 12;
          var6 = param0 * ((dib) this).field_f >> 12;
          var7 = ((dib) this).field_h * param0 >> 12;
          kpa.a(((dib) this).field_a, var5, ((dib) this).field_e, var6, ((dib) this).field_d, var4, var7, 0);
          return;
        } else {
          var5 = ((dib) this).field_i * param2 >> 12;
          var6 = param0 * ((dib) this).field_f >> 12;
          var7 = ((dib) this).field_h * param0 >> 12;
          kpa.a(((dib) this).field_a, var5, ((dib) this).field_e, var6, ((dib) this).field_d, var4, var7, 0);
          return;
        }
    }

    final static boolean a(int param0, int param1) {
        return 2 <= param1;
    }

    public static void a(byte param0) {
        field_j = null;
        if (param0 == 89) {
            return;
        }
        dib.a((byte) 40);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Fullscreen play is an option available to subscribing members only. For more details see the website.";
    }
}
