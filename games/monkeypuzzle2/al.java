/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class al {
    int field_a;
    String field_b;

    final static boolean a(ad param0) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_2_0 = false;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            stackOut_2_0 = param0.b(0);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("al.G(");
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
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw la.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 39 + 41);
        }
        return stackIn_3_0;
    }

    abstract java.net.Socket a(int param0) throws IOException;

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = 50;
        var4 = aa.field_a;
        if (var4 != 1) {
          if (var4 != 2) {
            if (var4 != 3) {
              return;
            } else {
              tj.field_a.c(0, 0);
              return;
            }
          } else {
            ne.field_a[1].b(0, 0);
            var3 = 50 - -(int)(ia.a(true, 0.14000000059604645f * (float)param0) * 30.0f + 10.0f * ha.a((byte) 51, (float)param0 * 0.11999999731779099f));
            ne.field_a[0].b(0, 0, var3);
            ge.h(80, 0, 560, 480);
            ik.field_p[i.field_n].b(100, 0, 70);
            cl.field_c[sk.field_G].b(0, 0, 100);
            ge.b();
            return;
          }
        } else {
          ib.field_b.a(0, 0);
          var4 = (int)(20.0f * ia.a(true, (float)param0 * 0.009999999776482582f)) + 70;
          m.field_k.b(0, 0, var4);
          return;
        }
    }

    final static String a(char param0, int param1, int param2) {
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param2 != 12663) {
          return null;
        } else {
          var6 = new char[param1];
          var3 = var6;
          var4 = 0;
          L0: while (true) {
            if (param1 <= var4) {
              return new String(var6);
            } else {
              var6[var4] = param0;
              var4++;
              continue L0;
            }
          }
        }
    }

    final static void a(byte param0, int param1) {
        try {
            Throwable decompiledCaughtException = null;
            L0: {
              if (param0 == -71) {
                break L0;
              } else {
                String discarded$2 = al.a('ﾑ', -120, -100);
                break L0;
              }
            }
            L1: {
              if (null == ol.field_g) {
                break L1;
              } else {
                L2: {
                  if (0 > param1) {
                    break L2;
                  } else {
                    if (dk.field_h == wh.field_b) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                L3: {
                  if (gf.field_c.field_h != 0) {
                    break L3;
                  } else {
                    if (10000L + qg.field_d < pf.a(0)) {
                      gf.field_c.b(true, param1);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                }
                L4: {
                  if (0 >= gf.field_c.field_h) {
                    break L4;
                  } else {
                    {
                      L5: {
                        ol.field_g.a(gf.field_c.field_g, 0, (byte) 122, gf.field_c.field_h);
                        qg.field_d = pf.a(param0 + 71);
                        break L5;
                      }
                    }
                    gf.field_c.field_h = 0;
                    break L4;
                  }
                }
                return;
              }
            }
            gf.field_c.field_h = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a() {
        return fd.field_s;
    }

    final static void c(byte param0) {
        int var1 = pf.a((byte) -92, 3);
        cj.a((byte) 108, ke.field_h[25 + var1]);
        if (param0 > -80) {
            return;
        }
    }

    final java.net.Socket b(byte param0) throws IOException {
        if (param0 < 120) {
          ((al) this).field_a = 127;
          return new java.net.Socket(((al) this).field_b, ((al) this).field_a);
        } else {
          return new java.net.Socket(((al) this).field_b, ((al) this).field_a);
        }
    }

    final static int a(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_12_0 = 0;
        int stackOut_10_0 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = 1;
            L1: while (true) {
              if (param1 <= 1) {
                if (param1 != 1) {
                  stackOut_12_0 = var3_int;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  stackOut_10_0 = param0 * var3_int;
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                }
              } else {
                L2: {
                  if (0 != (param1 & 1)) {
                    var3_int = var3_int * param0;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                param1 = param1 >> 1;
                param0 = param0 * param0;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw la.a((Throwable) (Object) var3, "al.I(" + param0 + 44 + param1 + 44 + 1 + 41);
        }
        return stackIn_13_0;
    }

    static {
    }
}
