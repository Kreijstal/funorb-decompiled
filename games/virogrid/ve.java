/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class ve extends qe {
    static String[] field_r;
    static String field_z;
    static String[] field_p;
    static String field_u;
    static int field_y;
    static int field_o;
    static int field_s;
    static int[] field_A;
    static km field_w;
    static int[] field_B;
    static String field_n;
    static ao field_q;
    static int[] field_x;
    static int field_t;
    static String[] field_v;

    final String a(int param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        String stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        String stackOut_7_0 = null;
        Object stackOut_5_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            if (((ve) this).a(param1, true) == ee.field_c) {
              stackOut_2_0 = ma.field_a;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              if (param0 == -26358) {
                stackOut_7_0 = bk.field_c;
                stackIn_8_0 = stackOut_7_0;
                break L0;
              } else {
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                return (String) (Object) stackIn_6_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("ve.H(").append(param0).append(',');
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L1;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L1;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ')');
        }
        return stackIn_8_0;
    }

    final static int a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_7_0 = 0;
        var8 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 0;
              var4 = tl.field_i;
              if (param2 == 66) {
                break L1;
              } else {
                int discarded$2 = ve.a(38, -113, (byte) -85);
                break L1;
              }
            }
            L2: while (true) {
              if (var3_int >= vg.field_F.length) {
                stackOut_11_0 = -1;
                stackIn_12_0 = stackOut_11_0;
                break L0;
              } else {
                L3: {
                  var5 = wf.field_f[var3_int];
                  if (var5 >= 0) {
                    var6 = an.a(true, (byte) 114, vg.field_F[var3_int]);
                    var4 = var4 + hd.field_e;
                    var7 = mh.field_g - (var6 >> 1);
                    if (!wf.a(var7 + -dj.field_e, param1, var6 + (dj.field_e << 1), true, var4, param0, (ng.field_P << 1) + di.field_o)) {
                      var4 = var4 + (di.field_o + (ng.field_P << 1) + hd.field_e);
                      break L3;
                    } else {
                      stackOut_7_0 = var5;
                      stackIn_8_0 = stackOut_7_0;
                      return stackIn_8_0;
                    }
                  } else {
                    var4 = var4 + bn.field_b;
                    break L3;
                  }
                }
                var3_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var3, "ve.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_12_0;
    }

    public static void c(boolean param0) {
        field_q = null;
        field_u = null;
        field_v = null;
        field_w = null;
        field_A = null;
        field_p = null;
        field_x = null;
        field_r = null;
        field_B = null;
        field_n = null;
        field_z = null;
    }

    ve(wa param0) {
        super(param0);
    }

    final static void c(byte param0) {
        int var1 = 0;
        L0: {
          L1: {
            if (j.field_l == 10) {
              break L1;
            } else {
              if (md.a(11265)) {
                break L0;
              } else {
                break L1;
              }
            }
          }
          ii.b((byte) -107);
          j.field_l = 11;
          break L0;
        }
        j.field_g = true;
        var1 = 82 % ((18 - param0) / 59);
    }

    final wl a(String param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_5_0 = 0;
        wl stackIn_8_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        wl stackOut_7_0 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                field_B = null;
                break L1;
              }
            }
            L2: {
              if (null != vd.a(param0, 119)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            var3_int = stackIn_5_0;
            if (var3_int == 0) {
              stackOut_7_0 = ee.field_c;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              return bm.field_i;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) var3;
            stackOut_9_1 = new StringBuilder().append("ve.E(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L3;
            }
          }
          throw kg.a((Throwable) (Object) stackIn_12_0, stackIn_12_2 + ',' + param1 + ')');
        }
        return stackIn_8_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Passwords can only contain letters and numbers";
        field_t = 20;
        field_r = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_y = 0;
        field_B = new int[4];
        field_p = new String[4];
        field_A = new int[4];
        field_v = new String[4];
        field_n = "Change display name";
    }
}
