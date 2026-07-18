/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rg {
    static ul field_d;
    static String field_g;
    static boolean field_e;
    static boolean field_h;
    static boolean field_f;
    static String field_c;
    static ak field_b;
    static String field_a;

    final static int a(String param0, boolean param1, byte param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param2 <= -62) {
              if (param1) {
                stackOut_6_0 = a.field_a.c(param0);
                stackIn_7_0 = stackOut_6_0;
                break L0;
              } else {
                stackOut_4_0 = re.field_ib.c(param0);
                stackIn_5_0 = stackOut_4_0;
                return stackIn_5_0;
              }
            } else {
              stackOut_1_0 = 94;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("rg.B(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L1;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L1;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(boolean param0, wk param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var9 = SteelSentinels.field_G;
        try {
          L0: {
            if ((3 & (param1.field_D | (param1.field_F | param1.field_A) | param1.field_H)) == 0) {
              return;
            } else {
              var2_int = param1.field_A - -(param1.field_D & 3);
              var2_int = var2_int - -4 + -(3 & var2_int);
              var3 = (param1.field_H & 3) + param1.field_F;
              var3 = 4 - ((var3 & 3) - var3);
              var4 = new int[var3 * var2_int];
              var5 = 0;
              var6 = (3 & param1.field_H) * var2_int + (param1.field_D & 3);
              var7 = 0;
              L1: while (true) {
                if (param1.field_F <= var7) {
                  param1.field_E = var4;
                  param1.field_A = var2_int;
                  param1.field_H = param1.field_H & -4;
                  param1.field_F = var3;
                  param1.field_D = param1.field_D & -4;
                  break L0;
                } else {
                  var8 = 0;
                  L2: while (true) {
                    if (var8 >= param1.field_A) {
                      var6 = var6 + (var2_int - param1.field_A);
                      var7++;
                      continue L1;
                    } else {
                      int incrementValue$2 = var6;
                      var6++;
                      int incrementValue$3 = var5;
                      var5++;
                      var4[incrementValue$2] = param1.field_E[incrementValue$3];
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var2;
            stackOut_12_1 = new StringBuilder().append("rg.A(").append(false).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param1 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ')');
        }
    }

    public static void c(int param0) {
        field_d = null;
        field_c = null;
        field_a = null;
        field_g = null;
        field_b = null;
    }

    final static int d(int param0) {
        if (param0 != -1900) {
            return 43;
        }
        return new Date().getYear() - -1900;
    }

    final static void a(int param0) {
        RuntimeException var1 = null;
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        int var8 = 0;
        int var9 = 0;
        ak var10 = null;
        int var11 = 0;
        String stackIn_9_0 = null;
        String stackIn_10_0 = null;
        String stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        ak stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_8_0 = null;
        String stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        String stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        ak stackOut_15_0 = null;
        ak stackOut_14_0 = null;
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            var1_int = hb.field_b + -hl.field_q;
            hl.field_q = vg.field_f - (var1_int >> 1);
            lk.field_W = qg.field_a + -(gh.field_hb >> 1);
            hb.field_b = var1_int + hl.field_q;
            var3 = 0;
            var2 = lk.field_W;
            var4 = 0;
            L1: while (true) {
              if (var4 >= an.field_g.length) {
                break L0;
              } else {
                L2: {
                  var5 = kk.field_g[var4];
                  if (var5 >= 0) {
                    if (var5 != se.field_c.field_e) {
                      var6 = bf.field_Fb;
                      break L2;
                    } else {
                      var6 = o.field_b;
                      break L2;
                    }
                  } else {
                    var6 = vg.field_c;
                    break L2;
                  }
                }
                L3: {
                  var7 = an.field_g[var4];
                  stackOut_8_0 = (String) var7;
                  stackIn_10_0 = stackOut_8_0;
                  stackIn_9_0 = stackOut_8_0;
                  if (var5 < 0) {
                    stackOut_10_0 = (String) (Object) stackIn_10_0;
                    stackOut_10_1 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    stackIn_11_1 = stackOut_10_1;
                    break L3;
                  } else {
                    stackOut_9_0 = (String) (Object) stackIn_9_0;
                    stackOut_9_1 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    stackIn_11_1 = stackOut_9_1;
                    break L3;
                  }
                }
                L4: {
                  var8 = rg.a(stackIn_11_0, stackIn_11_1 != 0, (byte) -94);
                  var9 = vg.field_f - (var8 >> 1);
                  if (var5 >= 0) {
                    L5: {
                      var2 = var2 + tf.field_c;
                      if (var5 == se.field_c.field_e) {
                        stackOut_15_0 = (ak) field_b;
                        stackIn_16_0 = stackOut_15_0;
                        break L5;
                      } else {
                        stackOut_14_0 = qh.field_Xb;
                        stackIn_16_0 = stackOut_14_0;
                        break L5;
                      }
                    }
                    L6: {
                      var10 = stackIn_16_0;
                      if (var10 != null) {
                        var10.a(var8 + (h.field_U << 1), -15203, var9 + -h.field_U, (id.field_ac << 1) + ig.field_e, var2);
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    var2 = var2 + id.field_ac;
                    break L4;
                  } else {
                    break L4;
                  }
                }
                L7: {
                  if (var5 >= 0) {
                    a.field_a.b(var7, var9, var2 - -rm.field_g, var6, -1);
                    var2 = var2 + (ig.field_e + (tf.field_c + id.field_ac));
                    break L7;
                  } else {
                    re.field_ib.b(var7, var9, var2 - -jk.field_d, var6, -1);
                    var2 = var2 + ck.field_e;
                    break L7;
                  }
                }
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "rg.F(" + 118 + ')');
        }
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        int var2_int = 0;
        Object var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        wk var6 = null;
        wk var7 = null;
        wk var8 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            pb.h(243, 197, 369, 143, 16777215);
            pb.a(244, 198, 367, 141, 0);
            if (jb.field_S == null) {
              L1: {
                if (null != wn.field_a) {
                  int discarded$3 = wn.field_a.a(eb.field_q, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                  break L1;
                } else {
                  break L1;
                }
              }
              return;
            } else {
              L2: {
                var6 = jb.field_S[lh.field_r];
                var7 = var6;
                var7 = var6;
                if (var6 == null) {
                  if (wn.field_a == null) {
                    break L2;
                  } else {
                    int discarded$4 = wn.field_a.a(eb.field_q, 245, 199, 365, 139, 16777215, -1, 1, 1, 0);
                    break L2;
                  }
                } else {
                  var6.a(245, 199);
                  break L2;
                }
              }
              L3: {
                if (ul.field_g < hh.field_i) {
                  var7 = jb.field_S[oe.field_e];
                  if (var7 == null) {
                    break L3;
                  } else {
                    var2_int = (var7.field_z - -60) * ul.field_g / hh.field_i;
                    var3 = var2_int + -30;
                    if (rf.field_b) {
                      nn.a(245, -256 * var3 / 30, (var7.field_z - var3) * 256 / 30, 199, var7, -1);
                      break L3;
                    } else {
                      nn.a(245, (var7.field_z + -var3) * 256 / 30, var3 * -256 / 30, 199, var7, -1);
                      break L3;
                    }
                  }
                } else {
                  break L3;
                }
              }
              L4: {
                if (null != wn.field_a) {
                  var2 = null;
                  var5 = 0;
                  var3 = var5;
                  L5: while (true) {
                    if (jb.field_S.length <= var5) {
                      if (var2 == null) {
                        break L4;
                      } else {
                        int discarded$5 = wn.field_a.a("Screenshot(s) " + (String) var2 + " is/are the wrong size! Should be " + 365 + "<times>" + 139, 245, 199, 365, 139, 16737843, 0, 1, 1, 0);
                        break L4;
                      }
                    } else {
                      L6: {
                        var8 = jb.field_S[var5];
                        if (var8 == null) {
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var5++;
                      continue L5;
                    }
                  }
                } else {
                  break L4;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) (Object) var1, "rg.D(" + 30 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new ul();
        field_g = "Play the game without logging in just yet";
        field_f = true;
        field_a = "Connection restored.";
    }
}
