/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hf {
    static String field_a;
    static boolean field_b;
    static String field_c;

    final static fb a(String param0) {
        String var2 = null;
        RuntimeException var2_ref = null;
        fb var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_10_0 = null;
        fb stackIn_17_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        fb stackOut_16_0 = null;
        Object stackOut_9_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var5 = Bounce.field_N;
        try {
          if (lf.field_q != null) {
            if (param0 != null) {
              if (param0.length() != 0) {
                var6 = (CharSequence) (Object) param0;
                int discarded$4 = 0;
                var2 = ce.a(var6);
                if (var2 != null) {
                  var3 = (fb) (Object) lf.field_q.a((long)var2.hashCode(), 0);
                  L0: while (true) {
                    if (var3 != null) {
                      var7 = (CharSequence) (Object) var3.field_ob;
                      int discarded$5 = 0;
                      var4 = ce.a(var7);
                      if (var4.equals((Object) (Object) var2)) {
                        stackOut_16_0 = (fb) var3;
                        stackIn_17_0 = stackOut_16_0;
                        return stackIn_17_0;
                      } else {
                        var3 = (fb) (Object) lf.field_q.b(0);
                        continue L0;
                      }
                    } else {
                      return null;
                    }
                  }
                } else {
                  stackOut_9_0 = null;
                  stackIn_10_0 = stackOut_9_0;
                  return (fb) (Object) stackIn_10_0;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2_ref;
            stackOut_20_1 = new StringBuilder().append("hf.D(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L1;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L1;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ',' + true + ')');
        }
    }

    final static int b() {
        try {
            IOException var1 = null;
            int var1_int = 0;
            wi var2 = null;
            int stackIn_13_0 = 0;
            int stackIn_24_0 = 0;
            int stackIn_28_0 = 0;
            int stackIn_31_0 = 0;
            int stackIn_33_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_12_0 = 0;
            int stackOut_27_0 = 0;
            int stackOut_23_0 = 0;
            int stackOut_32_0 = 0;
            int stackOut_30_0 = 0;
            if (4 <= tb.field_p.field_l) {
              if (-1 != tb.field_p.field_d) {
                if (tb.field_p.field_d == -2) {
                  return 4;
                } else {
                  return 1;
                }
              } else {
                return 3;
              }
            } else {
              try {
                L0: {
                  L1: {
                    if (ih.field_X == 0) {
                      md.field_q = vc.field_G.a(bd.field_l, a.field_a, 0);
                      ih.field_X = ih.field_X + 1;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  L2: {
                    if (ih.field_X != 1) {
                      break L2;
                    } else {
                      if (md.field_q.field_f != 2) {
                        if (md.field_q.field_f != 1) {
                          break L2;
                        } else {
                          ih.field_X = ih.field_X + 1;
                          break L2;
                        }
                      } else {
                        stackOut_12_0 = qg.a(-23888, -1);
                        stackIn_13_0 = stackOut_12_0;
                        return stackIn_13_0;
                      }
                    }
                  }
                  L3: {
                    if (ih.field_X == 2) {
                      mf.field_a = new pc((java.net.Socket) md.field_q.field_e, vc.field_G);
                      var2 = new wi(13);
                      fj.a(pe.field_c, 6, mf.field_e, var2, fi.field_c);
                      var2.a(15, (byte) 98);
                      var2.b(uj.field_s, (byte) 40);
                      mf.field_a.a(13, var2.field_i, 0, 0);
                      ih.field_X = ih.field_X + 1;
                      kk.field_B = 30000L + fa.a(76);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (ih.field_X == 3) {
                      if (mf.field_a.d(0) <= 0) {
                        if (~kk.field_B <= ~fa.a(125)) {
                          break L4;
                        } else {
                          stackOut_27_0 = qg.a(-23888, -2);
                          stackIn_28_0 = stackOut_27_0;
                          return stackIn_28_0;
                        }
                      } else {
                        var1_int = mf.field_a.b(0);
                        if (var1_int == 0) {
                          ih.field_X = ih.field_X + 1;
                          break L4;
                        } else {
                          stackOut_23_0 = qg.a(-23888, var1_int);
                          stackIn_24_0 = stackOut_23_0;
                          return stackIn_24_0;
                        }
                      }
                    } else {
                      break L4;
                    }
                  }
                  if (ih.field_X != 4) {
                    stackOut_32_0 = -1;
                    stackIn_33_0 = stackOut_32_0;
                    break L0;
                  } else {
                    tb.field_p.a((byte) -114, (Object) (Object) mf.field_a, ke.field_p);
                    ih.field_X = 0;
                    md.field_q = null;
                    mf.field_a = null;
                    stackOut_30_0 = 0;
                    stackIn_31_0 = stackOut_30_0;
                    return stackIn_31_0;
                  }
                }
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var1 = (IOException) (Object) decompiledCaughtException;
                return qg.a(-23888, -3);
              }
              return stackIn_33_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_6_0 = 0;
        int stackIn_8_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_5_0 = 0;
        var2 = Bounce.field_N;
        try {
          L0: {
            boolean discarded$28 = q.field_N.a(dk.field_c, true, true, ee.field_b);
            q.field_N.d((byte) 111);
            L1: while (true) {
              int discarded$29 = -15;
              if (!q.g()) {
                if (m.field_g == -1) {
                  stackOut_7_0 = 81;
                  stackIn_8_0 = stackOut_7_0;
                  break L0;
                } else {
                  var1_int = m.field_g;
                  oh.a(-101, -1);
                  stackOut_5_0 = var1_int;
                  stackIn_6_0 = stackOut_5_0;
                  return stackIn_6_0;
                }
              } else {
                boolean discarded$30 = q.field_N.a((byte) -109, lh.field_f, gk.field_d);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var1, "hf.A(" + false + ')');
        }
        return stackIn_8_0;
    }

    public static void a() {
        field_a = null;
        field_c = null;
        int var1 = 1;
    }

    static long a(long param0, long param1) {
        return param0 ^ param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = true;
        field_a = "The account name you use to access RuneScape and other Jagex.com games";
        field_c = "Press ESCAPE to quit";
    }
}
