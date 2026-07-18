/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class mj extends fqa {
    static String[] field_L;
    static il field_J;
    static String field_K;
    static String field_M;

    public static void s(byte param0) {
        field_J = null;
        field_K = null;
        field_L = null;
        field_M = null;
    }

    final boolean s(int param0) {
        if (param0 != -15254) {
            return true;
        }
        return false;
    }

    final void a(boolean param0, kh param1) {
        try {
            super.a(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "mj.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final boolean v(int param0) {
        if (param0 != 555277520) {
            return false;
        }
        return false;
    }

    final boolean z(int param0) {
        if (param0 != 0) {
            return false;
        }
        return false;
    }

    final fsa a(boolean param0, int param1, la param2) {
        RuntimeException var4 = null;
        sm var5 = null;
        jma var6 = null;
        mfa var7 = null;
        cv var8 = null;
        fsa var9 = null;
        fsa stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        fsa stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          L0: {
            var9 = new fsa(param2, param0);
            var9.b((byte) -11, ((mj) this).field_k, ((mj) this).field_l);
            var9.h(3, param1 ^ param1);
            var9.a((byte) 83, (nv) (Object) new eq(param2, param0));
            var5 = new sm(param2, param0);
            var5.b(0, 1);
            ((mj) this).a((ut) (Object) var5, (byte) -101);
            var6 = var5.k((byte) -98);
            var6.b(1, 106);
            var9.a((byte) 83, (nv) (Object) var5);
            var7 = rm.field_a;
            var8 = (cv) (Object) var7.a(9, param1 + 103);
            var8.b(3, (byte) -112);
            var9.a((gr) (Object) var5, (byte) 124, (dg) (Object) var8);
            stackOut_0_0 = (fsa) var9;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var4;
            stackOut_2_1 = new StringBuilder().append("mj.AC(").append(param0).append(',').append(param1).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param2 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_5_0, stackIn_5_2 + ')');
        }
        return stackIn_1_0;
    }

    final int B(int param0) {
        if (param0 != 31609) {
            return 57;
        }
        return 3;
    }

    final static void a(String param0, File param1, int param2) {
        try {
            Object discarded$0 = gj.field_d.put((Object) (Object) param0, (Object) (Object) param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "mj.FC(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + 1 + ')');
        }
    }

    final boolean r(byte param0) {
        if (param0 != 93) {
            field_M = null;
            return false;
        }
        return false;
    }

    final int t(int param0) {
        if (param0 != 8) {
            field_J = null;
            return 7;
        }
        return 7;
    }

    mj(la param0, int param1, kh param2, csa param3) {
        super(param0, param1, param2, param3);
    }

    mj(la param0, int param1) {
        super(param0, param1);
    }

    final void q(byte param0) {
        super.q(param0);
        ((mj) this).b(param0 + 223, 2097152, 2097152);
    }

    final static void a(byte param0, String param1, cn param2, cn param3, int param4) {
        RuntimeException var5 = null;
        sra var6 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
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
            var6 = (sra) (Object) dma.field_l;
            var6.a(param4, (byte) 47, param1);
            o.field_d = jta.a((byte) 120, "b12_old", param3, "", param2);
            int incrementValue$9 = param4;
            param4++;
            var6.a(incrementValue$9, (byte) 47, param1);
            cq.field_d = jta.a((byte) 112, "newfont_old", param3, "", param2);
            int incrementValue$10 = param4;
            param4++;
            var6.a(incrementValue$10, (byte) 47, param1);
            kv.field_a = joa.a("b12", param2, "", (byte) 76);
            int incrementValue$11 = param4;
            param4++;
            var6.a(incrementValue$11, (byte) 47, param1);
            ds.field_n = joa.a("newfont", param2, "", (byte) -111);
            int incrementValue$12 = param4;
            param4++;
            var6.a(incrementValue$12, (byte) 47, param1);
            wb.field_a = joa.a("newfont_lrg", param2, "", (byte) -92);
            int incrementValue$13 = param4;
            param4++;
            var6.a(incrementValue$13, (byte) 47, param1);
            qp.field_r = joa.a("newfont_sml", param2, "", (byte) 126);
            int incrementValue$14 = param4;
            param4++;
            var6.a(incrementValue$14, (byte) 47, param1);
            rc.field_b = jpa.b(param3, "", "fillfont");
            int incrementValue$15 = param4;
            param4++;
            var6.a(incrementValue$15, (byte) 47, param1);
            gga.field_O = jpa.b(param3, "", "font_small");
            int incrementValue$16 = param4;
            param4++;
            var6.a(incrementValue$16, (byte) 47, param1);
            ff.field_j = jpa.b(param3, "", "font_med");
            int incrementValue$17 = param4;
            param4++;
            var6.a(incrementValue$17, (byte) 47, param1);
            ps.field_O = jpa.b(param3, "", "font_large");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5;
            stackOut_2_1 = new StringBuilder().append("mj.VB(").append(-86).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param3 == null) {
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
          throw tba.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + ',' + param4 + ')');
        }
    }

    final static boolean c(int param0, int param1, int param2) {
        if (param0 == 2097152) {
          if (fna.field_h == 13) {
            la.l(param0);
            return true;
          } else {
            if (fna.field_h == 102) {
              kga.field_n.a(true);
              return true;
            } else {
              if (null != kga.field_n) {
                if (!kga.field_n.a(param2, (byte) -105, param1)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            }
          }
        } else {
          field_M = null;
          if (fna.field_h == 13) {
            la.l(param0);
            return true;
          } else {
            if (fna.field_h == 102) {
              kga.field_n.a(true);
              return true;
            } else {
              if (null != kga.field_n) {
                if (!kga.field_n.a(param2, (byte) -105, param1)) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            }
          }
        }
    }

    final boolean n(byte param0) {
        if (param0 != -122) {
            return true;
        }
        return false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_L = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_M = "Connection lost - attempting to reconnect";
        field_K = "Please try again in a few minutes.";
    }
}
