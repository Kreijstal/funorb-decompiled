/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class jm {
    double field_m;
    static int field_j;
    int field_n;
    double field_e;
    int field_a;
    static volatile int field_o;
    int field_c;
    static String field_k;
    static ck[] field_d;
    int field_l;
    static gp field_b;
    int field_f;
    static bd field_q;
    static tf[] field_i;
    static ak field_h;
    static int[] field_g;
    static String field_s;
    static String field_p;
    int field_t;
    static boolean[][] field_r;

    final void a(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                ((jm) this).field_c = -60 + ok.a(ea.field_b, -126, 480);
                ((jm) this).field_l = ok.a(ea.field_b, -126, 50);
                ((jm) this).field_e = (double)((jm) this).field_l / 100.0 + 0.3;
                var2_int = -112 / ((-40 - param0) / 47);
                ((jm) this).field_t = (int)(((jm) this).field_e * 256.0);
                ((jm) this).field_a = (int)(200.0 * (0.2 + ((jm) this).field_e));
                ((jm) this).field_f = (int)((((jm) this).field_e + 0.2) * 120.0);
                ((jm) this).field_n = ok.a(ea.field_b, -108, 2);
                if (ok.a(ea.field_b, -126, 2) == 1) {
                  break L2;
                } else {
                  ((jm) this).field_m = (double)(-((jm) this).field_a);
                  if (!Pixelate.field_H) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              ((jm) this).field_e = -((jm) this).field_e;
              ((jm) this).field_m = 640.0;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) (Object) runtimeException, "jm.B(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_b = null;
        field_i = null;
        field_k = null;
        field_s = null;
        field_h = null;
        if (param0 != -1345) {
            return;
        }
        try {
            field_d = null;
            field_r = null;
            field_g = null;
            field_q = null;
            field_p = null;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "jm.A(" + param0 + ')');
        }
    }

    final static String b(int param0) {
        RuntimeException var1 = null;
        String var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_7_0 = 0;
        int stackIn_7_1 = 0;
        int stackIn_23_0 = 0;
        int stackIn_23_1 = 0;
        String stackIn_27_0 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_6_1 = 0;
        int stackOut_22_0 = 0;
        int stackOut_22_1 = 0;
        String stackOut_26_0 = null;
        var5 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                var1_ref = "(" + oj.field_G + " " + gb.field_d + " " + tm.field_U + ") " + mn.field_e;
                if (0 < jj.field_b) {
                  var1_ref = var1_ref + ":";
                  var2 = 0;
                  L3: while (true) {
                    if (~var2 <= ~jj.field_b) {
                      break L2;
                    } else {
                      var1_ref = var1_ref + ' ';
                      var3 = 255 & vi.field_o.field_k[var2];
                      var4 = var3 >> -1773592156;
                      stackOut_6_0 = 10;
                      stackOut_6_1 = var4;
                      stackIn_23_0 = stackOut_6_0;
                      stackIn_23_1 = stackOut_6_1;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      if (var5 != 0) {
                        break L1;
                      } else {
                        L4: {
                          L5: {
                            if (stackIn_7_0 <= stackIn_7_1) {
                              break L5;
                            } else {
                              var4 += 48;
                              if (var5 == 0) {
                                break L4;
                              } else {
                                break L5;
                              }
                            }
                          }
                          var4 += 55;
                          break L4;
                        }
                        L6: {
                          L7: {
                            var3 = var3 & 15;
                            if (var3 < 10) {
                              break L7;
                            } else {
                              var3 += 55;
                              if (var5 == 0) {
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          var3 += 48;
                          break L6;
                        }
                        var1_ref = var1_ref + (char)var4;
                        var1_ref = var1_ref + (char)var3;
                        var2++;
                        if (var5 == 0) {
                          continue L3;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                } else {
                  break L2;
                }
              }
              stackOut_22_0 = param0;
              stackOut_22_1 = -4;
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              break L1;
            }
            L8: {
              if (stackIn_23_0 < stackIn_23_1) {
                break L8;
              } else {
                String discarded$1 = jm.b(-28);
                break L8;
              }
            }
            stackOut_26_0 = (String) var1_ref;
            stackIn_27_0 = stackOut_26_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) (Object) var1, "jm.C(" + param0 + ')');
        }
        return stackIn_27_0;
    }

    jm() {
        try {
            ((jm) this).a((byte) -107);
            ((jm) this).field_m = (double)(ok.a(ea.field_b, -114, 640) + -100);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) (Object) runtimeException, "jm.<init>()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "<%0> must play 1 more rated game before playing with the current options.";
        field_d = new ck[24];
        field_o = 0;
        field_q = new bd();
        field_p = "From only <%0>/month";
        field_s = "Challenge Mode";
    }
}
