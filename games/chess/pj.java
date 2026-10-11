/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class pj {
    static volatile long field_g;
    static int[] field_b;
    static int field_d;
    static km[][] field_e;
    static int[] field_f;
    private java.util.zip.Inflater field_a;
    static pc field_h;
    static dd[] field_c;

    final static void b(int param0, int param1) {
        nk var2 = qn.field_U;
        var2.f(param1, param0 + 6324);
        var2.c(2, (byte) 107);
        if (param0 == -6446) {
          var2.c(4, (byte) -71);
          var2.c(jg.m(73), (byte) -88);
          return;
        }
        pj.b(27, 37);
        var2.c(4, (byte) -71);
        var2.c(jg.m(73), (byte) -88);
    }

    final static int a(int param0, int param1) {
        if (param0 < 99) {
          return 32;
        }
        param1 = param1 & 8191;
        if (param1 >= 4096) {
          return param1 >= 6144 ? -hj.field_b[8192 - param1] : -hj.field_b[-4096 + param1];
        }
        return param1 >= 2048 ? hj.field_b[4096 - param1] : hj.field_b[param1];
    }

    final static void a(boolean param0, int param1, boolean param2, int param3, dm param4) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          ol.field_S[0] = ph.field_d.nextInt();
          ol.field_S[1] = ph.field_d.nextInt();
          mn.field_h.field_l = 0;
          ol.field_S[2] = (int)(sj.field_h >> 32);
          ol.field_S[3] = (int)sj.field_h;
          mn.field_h.d(ol.field_S[0], (byte) -81);
          mn.field_h.d(ol.field_S[1], (byte) -81);
          mn.field_h.d(ol.field_S[2], (byte) -81);
          mn.field_h.d(ol.field_S[3], (byte) -81);
          sa.a(mn.field_h, 109);
          mn.field_h.b(param3, param1 + 27463);
          param4.a(mn.field_h, (byte) 123);
          qn.field_U.field_l = 0;
          if (param2) {
            qn.field_U.c(18, (byte) -81);
          } else {
            qn.field_U.c(16, (byte) 110);
          }
          qn.field_U.field_l = qn.field_U.field_l + 2;
          var5_int = qn.field_U.field_l;
          qn.field_U.d(gb.field_s, (byte) -81);
          qn.field_U.a(-97, qc.field_a);
          var6 = 0;
          if (param1 != -27359) {
            return;
          }
          if (ln.field_Kb) {
            var6 = var6 | 1;
          }
          if (on.field_a) {
            var6 = var6 | 4;
          }
          if (param0) {
            var6 = var6 | 8;
          }
          if (lf.field_N != null) {
            var6 = var6 | 16;
          }
          qn.field_U.c(var6, (byte) 52);
          var7 = m.a(bh.i(81), (byte) 87);
          if (var7 == null) {
            var7 = "";
          }
          qn.field_U.a(param1 ^ 27325, var7);
          if (null != lf.field_N) {
            qn.field_U.a(true, lf.field_N);
          }
          lk.a(dk.field_k, mn.field_h, qn.field_U, 91, se.field_M);
          qn.field_U.d(qn.field_U.field_l - var5_int, 111);
          vh.a(-1, (byte) -42);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_23_0 = var5;
          stackIn_23_1 = new StringBuilder().append("pj.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final void a(byte[] param0, byte param1, p param2) {
        try {
          Exception exception = null;
          RuntimeException runtimeException = null;
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          StringBuilder stackIn_18_1 = null;
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (31 == param2.field_o[param2.field_l] &&
              param2.field_o[param2.field_l + 1] == -117) {
              if (null == this.field_a) {
                this.field_a = new java.util.zip.Inflater(true);
              }
              try {
                if (param1 >= -19) {
                  pj.b(106, 101);
                }
                this.field_a.setInput(param2.field_o, param2.field_l + 10, -8 - (param2.field_l + 10 - param2.field_o.length));
                this.field_a.inflate(param0);
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                exception = (Exception) (Object) decompiledCaughtException;
                this.field_a.reset();
                throw new RuntimeException("");
              }
              this.field_a.reset();
              return;
            }
            throw new RuntimeException("");
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = runtimeException;
            stackIn_15_1 = new StringBuilder().append("pj.E(");
            if (param0 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw fk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public pj() {
        this(-1, 1000000, 1000000);
    }

    private pj(int param0, int param1, int param2) {
    }

    public static void a(int param0) {
        field_e = (km[][]) null;
        field_h = null;
        field_b = null;
        field_f = null;
        field_c = null;
        if (param0 != -6145) {
          field_f = (int[]) null;
        }
    }

    static {
        field_b = new int[]{4096, 0, 4096, 0, 4096, 0, 4096, 0, 0, 4096, 0, 4096, 0, 4096, 0, 4096, 4096, 0, 4096, 0, 4096, 0, 4096, 0, 0, 4096, 0, 4096, 0, 4096, 0, 4096, 4096, 0, 4096, 0, 4096, 0, 4096, 0, 0, 4096, 0, 4096, 0, 4096, 0, 4096, 4096, 0, 4096, 0, 4096, 0, 4096, 0, 0, 4096, 0, 4096, 0, 4096, 0, 4096};
        field_g = 0L;
        field_d = 3;
        field_c = new dd[7];
    }
}
