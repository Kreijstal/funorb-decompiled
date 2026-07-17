/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

final class em extends gd {
    static boolean field_o;
    static int field_j;
    static String[] field_m;
    static int field_l;
    static String[] field_k;
    static int[][] field_i;
    private static int[][] field_n;

    final static void a(int param0, boolean param1) {
        if (param1) {
          if (kf.field_U == null) {
            if (of.a(-969)) {
              if (hf.a(wi.field_b, 0)) {
                int discarded$2 = 640;
                kf.field_U = oc.a(0, 0, 480, -123, wi.field_b);
                if (null != kf.field_U) {
                  int discarded$3 = 114;
                  am.a((java.awt.Canvas) (Object) kf.field_U);
                  return;
                } else {
                  return;
                }
              } else {
                if (!param1) {
                  if (kf.field_U == null) {
                    return;
                  } else {
                    om.a(-46342, (java.awt.Canvas) (Object) kf.field_U);
                    kd.field_b.requestFocus();
                    kf.field_U.a(wi.field_b, 50);
                    kf.field_U = null;
                    return;
                  }
                } else {
                  return;
                }
              }
            } else {
              if (!param1) {
                if (kf.field_U == null) {
                  return;
                } else {
                  om.a(-46342, (java.awt.Canvas) (Object) kf.field_U);
                  kd.field_b.requestFocus();
                  kf.field_U.a(wi.field_b, 50);
                  kf.field_U = null;
                  return;
                }
              } else {
                return;
              }
            }
          } else {
            if (!param1) {
              if (kf.field_U == null) {
                return;
              } else {
                om.a(-46342, (java.awt.Canvas) (Object) kf.field_U);
                kd.field_b.requestFocus();
                kf.field_U.a(wi.field_b, 50);
                kf.field_U = null;
                return;
              }
            } else {
              return;
            }
          }
        } else {
          if (kf.field_U == null) {
            return;
          } else {
            om.a(-46342, (java.awt.Canvas) (Object) kf.field_U);
            kd.field_b.requestFocus();
            kf.field_U.a(wi.field_b, 50);
            kf.field_U = null;
            return;
          }
        }
    }

    final fd a(String param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        Object var4 = null;
        CharSequence var5 = null;
        CharSequence var6 = null;
        fd stackIn_3_0 = null;
        fd stackIn_10_0 = null;
        fd stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        fd stackOut_2_0 = null;
        fd stackOut_11_0 = null;
        fd stackOut_9_0 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            var5 = (CharSequence) (Object) param0;
            int discarded$11 = 1;
            if (!ik.a(var5)) {
              stackOut_2_0 = g.field_k;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            } else {
              L1: {
                var6 = (CharSequence) (Object) param0;
                var3_int = mo.a(var6, (byte) -116);
                if (param1 > 52) {
                  break L1;
                } else {
                  var4 = null;
                  fd discarded$12 = ((em) this).a((String) null, (byte) 76);
                  break L1;
                }
              }
              L2: {
                if (var3_int <= 0) {
                  break L2;
                } else {
                  if (var3_int <= 130) {
                    stackOut_11_0 = tg.field_d;
                    stackIn_12_0 = stackOut_11_0;
                    break L0;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_9_0 = g.field_k;
              stackIn_10_0 = stackOut_9_0;
              return stackIn_10_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var3;
            stackOut_13_1 = new StringBuilder().append("em.N(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          throw kk.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + 44 + param1 + 41);
        }
        return stackIn_12_0;
    }

    final static String b() {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        var5 = HoldTheLine.field_D;
        var6 = "(" + ab.field_pb + " " + hc.field_e + " " + rd.field_l + ") " + vn.field_c;
        if (ad.field_c > 0) {
          var1 = var6 + ":";
          var2 = 0;
          L0: while (true) {
            if (ad.field_c > var2) {
              L1: {
                var7 = var1 + 32;
                var3 = rd.field_e.field_i[var2] & 255;
                var4 = var3 >> 4;
                if (10 <= var4) {
                  var4 += 55;
                  break L1;
                } else {
                  var4 += 48;
                  break L1;
                }
              }
              L2: {
                var3 = var3 & 15;
                var8 = var7 + (char)var4;
                if (var3 < 10) {
                  var3 += 48;
                  break L2;
                } else {
                  var3 += 55;
                  break L2;
                }
              }
              var1 = var8 + (char)var3;
              var2++;
              continue L0;
            } else {
              return var1;
            }
          }
        } else {
          return var6;
        }
    }

    public static void g() {
        field_n = null;
        field_k = null;
        field_m = null;
        int var1 = 0;
        field_i = null;
    }

    final static int a() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_22_0 = 0;
        var2 = HoldTheLine.field_D;
        try {
          L0: {
            boolean discarded$12 = ka.field_b.a(go.field_e, lh.field_b, true, false);
            ka.field_b.g((byte) -59);
            L1: while (true) {
              if (!qh.c(-99)) {
                if (-1 != v.field_B) {
                  var1_int = v.field_B;
                  go.a(0, -1);
                  stackOut_6_0 = var1_int;
                  stackIn_7_0 = stackOut_6_0;
                  return stackIn_7_0;
                } else {
                  if (aa.field_k) {
                    stackOut_10_0 = 3;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0;
                  } else {
                    if (ak.field_b == sf.field_n) {
                      stackOut_14_0 = 1;
                      stackIn_15_0 = stackOut_14_0;
                      return stackIn_15_0;
                    } else {
                      if (!fj.field_o.a(250)) {
                        stackOut_18_0 = 1;
                        stackIn_19_0 = stackOut_18_0;
                        return stackIn_19_0;
                      } else {
                        if (bb.field_a == sf.field_n) {
                          stackOut_22_0 = 2;
                          stackIn_23_0 = stackOut_22_0;
                          break L0;
                        } else {
                          return -1;
                        }
                      }
                    }
                  }
                }
              } else {
                boolean discarded$13 = ka.field_b.a(aa.field_n, pk.field_M, (byte) 108);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) (Object) var1, "em.V(" + 1 + 41);
        }
        return stackIn_23_0;
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        Object stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_5_0 = null;
        String stackOut_1_0 = null;
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
            if (((em) this).a(param0, (byte) 89) != g.field_k) {
              if (!param1) {
                stackOut_5_0 = null;
                stackIn_6_0 = stackOut_5_0;
                break L0;
              } else {
                return null;
              }
            } else {
              stackOut_1_0 = vd.field_d;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3;
            stackOut_8_1 = new StringBuilder().append("em.L(");
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
          throw kk.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 44 + param1 + 41);
        }
        return (String) (Object) stackIn_6_0;
    }

    em(nk param0) {
        super(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = new int[14][];
        field_i = field_n;
        field_n[7] = new int[1];
        field_n[5] = new int[1];
        field_n[9] = new int[2];
        field_n[12] = new int[0];
        field_n[10] = new int[1];
        field_n[13] = new int[2];
        field_n[3] = new int[1];
        field_n[1] = new int[5];
        field_n[11] = new int[0];
        field_n[8] = new int[1];
        field_n[6] = new int[1];
        field_n[2] = new int[1];
        field_n[4] = new int[2];
        field_n[0] = new int[8];
        field_l = -1;
    }
}
