/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class we {
    int field_f;
    static String field_c;
    static String field_g;
    static String field_e;
    static uf field_b;
    String field_d;
    static String field_a;

    final static void a(byte param0) {
        if (!gd.field_f) {
          if (param0 <= 46) {
            int discarded$8 = we.a(true);
            return;
          } else {
            return;
          }
        } else {
          int discarded$9 = 1;
          bb.b();
          int discarded$10 = 74;
          jd.g();
          d.a(true);
          gd.field_f = false;
          if (param0 > 46) {
            return;
          } else {
            int discarded$11 = we.a(true);
            return;
          }
        }
    }

    final static ck[] a(ji param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          if (gb.a(param3, param0, param2, 115)) {
            return de.c(false);
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var4 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4;
            stackOut_4_1 = new StringBuilder().append("we.D(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L0;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + -126 + 44 + param2 + 44 + param3 + 41);
        }
    }

    final java.net.Socket b(int param0) throws IOException {
        if (param0 != 2) {
            return null;
        }
        return new java.net.Socket(((we) this).field_d, ((we) this).field_f);
    }

    abstract java.net.Socket a(int param0) throws IOException;

    public static void b() {
        field_g = null;
        field_e = null;
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static int a(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_13_0 = 0;
        var3 = client.field_A ? 1 : 0;
        try {
          L0: {
            var1_int = param0 ? 1 : 0;
            L1: while (true) {
              if (!ab.c((byte) 114)) {
                L2: {
                  wj.field_Jb.a(pm.a(pm.field_f, -2141435999, bh.field_g), -20563, pm.a(nf.field_h, -2141435999, he.field_S));
                  if (!wj.field_Jb.b((byte) 114)) {
                    break L2;
                  } else {
                    var1_int = 1;
                    break L2;
                  }
                }
                L3: {
                  var2 = 0;
                  if (var1_int == 0) {
                    break L3;
                  } else {
                    if (wj.field_Jb.field_h >= 0) {
                      var2 = ef.field_T[wj.field_Jb.field_h];
                      if (var2 == 2) {
                        int discarded$2 = -1209;
                        ek.g();
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                stackOut_13_0 = var2;
                stackIn_14_0 = stackOut_13_0;
                break L0;
              } else {
                wj.field_Jb.a(-38);
                if (!wj.field_Jb.b((byte) 114)) {
                  continue L1;
                } else {
                  var1_int = 1;
                  continue L1;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var1, "we.C(" + param0 + 41);
        }
        return stackIn_14_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "<%0> players want to draw. Hold 'F1' for details.";
        field_c = "achievements to collect";
        field_g = "Rematch!";
        field_a = "EXCLUSIVE";
    }
}
