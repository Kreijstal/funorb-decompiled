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
            we.a(true);
            return;
          } else {
            return;
          }
        } else {
          bb.b(true);
          jd.g(74);
          d.a(true);
          gd.field_f = false;
          if (param0 > 46) {
            return;
          } else {
            we.a(true);
            return;
          }
        }
    }

    final static ck[] a(ji param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        ck[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (gb.a(param3, param0, param2, 115)) {
              L1: {
                if (param1 < -123) {
                  break L1;
                } else {
                  we.a((byte) 55);
                  break L1;
                }
              }
              stackIn_6_0 = de.c(false);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("we.D(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_6_0;
    }

    final java.net.Socket b(int param0) throws IOException {
        if (param0 != 2) {
            return (java.net.Socket) null;
        }
        return new java.net.Socket(this.field_d, this.field_f);
    }

    abstract java.net.Socket a(int param0) throws IOException;

    public static void b(byte param0) {
        field_g = null;
        field_e = null;
        if (param0 != -37) {
            return;
        }
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
                    if ((wj.field_Jb.field_h ^ -1) <= -1) {
                      var2 = ef.field_T[wj.field_Jb.field_h];
                      if (var2 == 2) {
                        ek.g(-1209);
                        break L3;
                      } else {
                        break L3;
                      }
                    } else {
                      break L3;
                    }
                  }
                }
                stackIn_14_0 = var2;
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
          throw dh.a((Throwable) ((Object) var1), "we.C(" + param0 + ')');
        }
        return stackIn_14_0;
    }

    static {
        field_e = "<%0> players want to draw. Hold 'F1' for details.";
        field_c = "achievements to collect";
        field_g = "Rematch!";
        field_a = "EXCLUSIVE";
    }
}
