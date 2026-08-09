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
        if (param0 != -12) {
            return;
        }
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
            throw tba.a((Throwable) ((Object) runtimeException), "mj.V(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
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
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var9 = new fsa(param2, param0);
            var9.b((byte) -11, this.field_k, this.field_l);
            var9.h(3, param1 ^ param1);
            var9.a((byte) 83, (nv) (new eq(param2, param0)));
            var5 = new sm(param2, param0);
            var5.b(0, 1);
            this.a(var5, (byte) -101);
            var6 = var5.k((byte) -98);
            var6.b(1, 106);
            var9.a((byte) 83, (nv) (var5));
            var7 = rm.field_a;
            var8 = (cv) ((Object) var7.a(9, param1 + 103));
            var8.b(3, (byte) -112);
            var9.a(var5, (byte) 124, var8);
            stackIn_1_0 = (fsa) (var9);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("mj.AC(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ')');
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
            if (param2 != 1) {
                mj.s((byte) -30);
            }
            gj.field_d.put(param0, param1);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "mj.FC(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final boolean r(byte param0) {
        if (param0 != 93) {
            field_M = (String) null;
            return false;
        }
        return false;
    }

    final int t(int param0) {
        if (param0 != 8) {
            field_J = (il) null;
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
        this.b(param0 + 223, 2097152, 2097152);
    }

    final static void a(byte param0, String param1, cn param2, cn param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        File var6 = null;
        sra var7 = null;
        try {
          L0: {
            L1: {
              var7 = (sra) ((Object) dma.field_l);
              var7.a(param4, (byte) 47, param1);
              o.field_d = jta.a((byte) 120, "b12_old", param3, "", param2);
              incrementValue$0 = param4;
              param4++;
              var7.a(incrementValue$0, (byte) 47, param1);
              if (param0 <= -8) {
                break L1;
              } else {
                var6 = (File) null;
                mj.a((String) null, (File) null, -60);
                break L1;
              }
            }
            cq.field_d = jta.a((byte) 112, "newfont_old", param3, "", param2);
            incrementValue$1 = param4;
            param4++;
            var7.a(incrementValue$1, (byte) 47, param1);
            kv.field_a = joa.a("b12", param2, "", (byte) 76);
            incrementValue$2 = param4;
            param4++;
            var7.a(incrementValue$2, (byte) 47, param1);
            ds.field_n = joa.a("newfont", param2, "", (byte) -111);
            incrementValue$3 = param4;
            param4++;
            var7.a(incrementValue$3, (byte) 47, param1);
            wb.field_a = joa.a("newfont_lrg", param2, "", (byte) -92);
            incrementValue$4 = param4;
            param4++;
            var7.a(incrementValue$4, (byte) 47, param1);
            qp.field_r = joa.a("newfont_sml", param2, "", (byte) 126);
            incrementValue$5 = param4;
            param4++;
            var7.a(incrementValue$5, (byte) 47, param1);
            rc.field_b = jpa.b(param3, "", "fillfont");
            incrementValue$6 = param4;
            param4++;
            var7.a(incrementValue$6, (byte) 47, param1);
            gga.field_O = jpa.b(param3, "", "font_small");
            incrementValue$7 = param4;
            param4++;
            var7.a(incrementValue$7, (byte) 47, param1);
            ff.field_j = jpa.b(param3, "", "font_med");
            incrementValue$8 = param4;
            param4++;
            var7.a(incrementValue$8, (byte) 47, param1);
            ps.field_O = jpa.b(param3, "", "font_large");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5);

            stackIn_6_1 = new StringBuilder().append("mj.VB(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param4 + ')');
        }
    }

    final static boolean c(int param0, int param1, int param2) {
        if (param0 == 2097152) {
          if ((fna.field_h ^ -1) == -14) {
            la.l(param0 + 0);
            return true;
          } else {
            if ((fna.field_h ^ -1) == -103) {
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
          field_M = (String) null;
          if ((fna.field_h ^ -1) == -14) {
            la.l(param0 + 0);
            return true;
          } else {
            if ((fna.field_h ^ -1) == -103) {
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
        field_L = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_M = "Connection lost - attempting to reconnect";
        field_K = "Please try again in a few minutes.";
    }
}
