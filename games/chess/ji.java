/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji extends kn {
    static ci field_N;
    static int field_S;
    static long field_U;
    static int field_R;
    static ed field_T;
    static fm field_V;
    static int field_O;
    static String field_Q;
    static boolean field_P;

    public static void i(int param0) {
        field_V = null;
        field_Q = null;
        field_T = null;
        field_N = null;
        if (param0 != 5849) {
          String var2 = (String) null;
          ji.a(-34, true, (String) null, (String) null, (byte) -54, true);
        }
    }

    final void a(int param0, mf param1, int param2, int param3, int param4, int param5) {
        kb var7 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7_ref = null;
        try {
          super.a(param0, param1, param2, param3, param4 ^ param4, param5);
          var7 = vj.field_a;
          if (var7 != null &&
            this.a(param0, param5, param2, (byte) -117, param3)) {
            if (this.field_p instanceof cj) {
              ((cj) (this.field_p)).a(var7, -10925, this);
              vj.field_a = null;
              return;
            }
            if (var7.field_p instanceof cj) {
              ((cj) (var7.field_p)).a(var7, -10925, this);
              vj.field_a = null;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_9_0 = var7_ref;
          stackIn_9_1 = new StringBuilder().append("ji.VA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static String a(String param0, String param1, String param2, um param3, byte param4) {
        RuntimeException var5 = null;
        String var6 = null;
        String stackIn_5_0 = null;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 < 15) {
            var6 = (String) null;
            ji.a(74, true, (String) null, (String) null, (byte) 108, true);
          }
          if (!param3.c((byte) 125)) {
            stackIn_5_0 = (String) (param0);
            return stackIn_5_0;
          }
          stackIn_7_0 = param2 + " - " + param3.c(param1, 0) + "%";
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("ji.SA(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param4).append(')').toString());
        }
    }

    final static int a(int param0, boolean param1, String param2, String param3, byte param4, boolean param5) {
        try {
          int stackIn_6_0 = 0;
          int stackIn_31_0 = 0;
          boolean stackIn_43_0 = false;
          boolean stackIn_46_0 = false;
          boolean stackIn_49_0 = false;
          boolean stackIn_55_0 = false;
          int stackIn_82_0 = 0;
          int stackIn_93_0 = 0;
          int stackIn_95_0 = 0;
          int stackIn_104_0 = 0;
          int stackIn_106_0 = 0;
          RuntimeException stackIn_109_0 = null;
          StringBuilder stackIn_109_1 = null;
          String stackIn_110_2 = null;
          StringBuilder stackIn_112_1 = null;
          String stackIn_113_2 = null;
          Throwable decompiledCaughtException = null;
          int var6_int = 0;
          RuntimeException var6 = null;
          int var7 = 0;
          String var7_ref_String = null;
          int var8 = 0;
          int var9 = 0;
          Throwable var9_ref_Throwable = null;
          int var10 = 0;
          String var11 = null;
          CharSequence var12 = null;
          int var7Lifetime1;
          int var7Lifetime2;
          int var9Lifetime1;
          var10 = Chess.field_G;
          try {
            var6_int = -87 % ((20 - param4) / 61);
            if (null == lj.field_a &&
              !gd.a((byte) 68, param1)) {
              stackIn_6_0 = -1;
              return stackIn_6_0;
            }
            if (tb.field_f == ca.field_h) {
              if (!param1) {
                eh.field_K = nk.a(false, param2, param3, true);
              } else {
                var11 = (String) null;
                eh.field_K = l.a(false, param2, (byte) 118, (String) null, sj.field_i);
              }
              qn.field_U.field_l = 0;
              qn.field_U.c(14, (byte) 61);
              qn.field_U.c(eh.field_K.b((byte) 70).field_c, (byte) -73);
              vh.a(-1, (byte) 83);
              tb.field_f = rm.field_J;
            }
            if (rm.field_J == tb.field_f &&
              tk.a(5, 1)) {
              var7 = tk.field_h.i(-89);
              tk.field_h.field_l = 0;
              if (0 == var7) {
                tb.field_f = tg.field_d;
              } else {
                tb.field_f = qd.field_m;
                wg.field_B = var7;
                sb.field_sb = -1;
              }
            }
            if (tb.field_f == tg.field_d &&
              tk.a(120, 8)) {
              sj.field_h = tk.field_h.d((byte) 116);
              tk.field_h.field_l = 0;
              pj.a(param5, -27359, param1, param0, eh.field_K);
              tb.field_f = dl.field_j;
            }
            boolean decompiledFrameRemainder0 = true;
            if (tb.field_f == dl.field_j &&
              tk.a(81, 1)) {
              var7Lifetime1 = tk.field_h.i(-106);
              wg.field_B = var7Lifetime1;
              tk.field_h.field_l = 0;
              lf.field_N = null;
              if (var7Lifetime1 != 0 &&
                var7Lifetime1 != 1) {
                if (8 != var7Lifetime1) {
                  sb.field_sb = -1;
                  tb.field_f = qd.field_m;
                  decompiledFrameRemainder0 = false;
                }
                else {
                  si.d(65280);
                  ja.field_f = false;
                  stackIn_31_0 = var7Lifetime1;
                  return stackIn_31_0;
                }
              }
              if (decompiledFrameRemainder0) {
                sb.field_sb = -1;
                tb.field_f = gi.field_d;
              }
            }
            if (tb.field_f == gi.field_d &&
              jl.a(false)) {
              sj.field_i = tk.field_h.d((byte) 123);
              gi.field_g = param2;
              sk.field_t = tk.field_h.i(-79);
              sb.field_rb = tk.field_h.i(-113);
              cl.field_d = tk.field_h.f(674914976);
              var7_ref_String = tk.field_h.b(true);
              var8 = tk.field_h.i(-91);
              if ((1 & var8) != 0) {
                bh.f((byte) -74);
              }
              if (!param1) {
                stackIn_43_0 = ((8 & var8) != 0);
                qf.field_b = stackIn_43_0;
                stackIn_46_0 = ((var8 & 4) != 0);
                j.field_u = stackIn_46_0;
                stackIn_49_0 = (0 != (var8 & 2));
                kh.field_o = stackIn_49_0;
                if (qf.field_b) {
                  kh.field_o = true;
                }
              }
              stackIn_55_0 = ((16 & var8) != 0);
              ej.field_f = stackIn_55_0;
              if (on.field_a) {
                tk.field_h.i(-87);
                tk.field_h.i(-86);
                tk.field_h.e((byte) -106);
                si.field_n = tk.field_h.f(674914976);
                jn.field_P = new byte[si.field_n];
                for (var9 = 0; si.field_n > var9; var9++) {
                  jn.field_P[var9] = tk.field_h.g(0);
                }
              }
              ci.field_J = tk.field_h.d(0);
              var12 = (CharSequence) ((Object) ci.field_J);
              cc.field_A = ad.a(var12, -2);
              gm.field_d = tk.field_h.i(-114);
              tb.field_f = ik.field_e;
              if (eh.field_K.b((byte) 31) == ec.field_i) {
                ph.field_g.a(25799, bh.i(81));
              } else {
                if (eh.field_K.b((byte) 68) == kn.field_H) {
                  le.field_g.a(25799, bh.i(81));
                }
              }
              ja.field_f = false;
              if (var7_ref_String != null) {
                aa.a(bh.i(81), -1, var7_ref_String);
              }
              if (cl.field_d <= 0 &&
                !j.field_u) {
                try {
                  u.a(true, "unzap", bh.i(81));
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var9_ref_Throwable = decompiledCaughtException;
                }
              } else {
                try {
                  u.a(bh.i(81), true, new Object[]{tf.a(37, sj.field_i)}, "zap");
                } catch (java.lang.Throwable decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var9_ref_Throwable = decompiledCaughtException;
                }
              }
              if (cl.field_d > 0) {
                ln.field_Kb = true;
              }
              qn.field_U.a(ol.field_S, (byte) -92);
              for (var9Lifetime1 = 0; var9Lifetime1 < 4; var9Lifetime1++) {
                ol.field_S[var9Lifetime1] = ol.field_S[var9Lifetime1] + 50;
              }
              tk.field_h.a(ol.field_S, (byte) -92);
              stackIn_82_0 = wg.field_B;
              return stackIn_82_0;
            }
            if (qd.field_m == tb.field_f &&
              jl.a(false)) {
              si.d(65280);
              if (wg.field_B == 7 &&
                !ja.field_f) {
                ja.field_f = true;
                stackIn_95_0 = -1;
                return stackIn_95_0;
              }
              if (wg.field_B == 7) {
                wg.field_B = 3;
              }
              n.field_c = tk.field_h.d(0);
              ja.field_f = false;
              stackIn_93_0 = wg.field_B;
              return stackIn_93_0;
            }
            if (lj.field_a == null) {
              if (ja.field_f) {
                if (ea.i((byte) 17) > 30000L) {
                  n.field_c = nc.field_Q;
                } else {
                  n.field_c = li.field_b;
                }
                ja.field_f = false;
                stackIn_104_0 = 3;
                return stackIn_104_0;
              }
              var7Lifetime2 = qh.field_a;
              qh.field_a = bk.field_n;
              bk.field_n = var7Lifetime2;
              ja.field_f = true;
            }
            stackIn_106_0 = -1;
            return stackIn_106_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var6 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_109_0 = var6;
            stackIn_109_1 = new StringBuilder().append("ji.TA(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_110_2 = "null";
            } else {
              stackIn_110_2 = "{...}";
            }
            stackIn_112_1 = ((StringBuilder) (Object) stackIn_109_1).append(stackIn_110_2).append(',');
            if (param3 == null) {
              stackIn_113_2 = "null";
            } else {
              stackIn_113_2 = "{...}";
            }
            throw fk.a((Throwable) ((Object) stackIn_109_0), ((StringBuilder) (Object) stackIn_112_1).append(stackIn_113_2).append(',').append(param4).append(',').append(param5).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private ji(int param0, int param1, int param2, int param3, jm param4, rg param5, mf param6) {
        super(param0, param1, param2, param3, param4, param5);
        try {
          this.field_M = param6;
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "ji.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + (param5 != null ? "{...}" : "null") + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_S = 0;
        field_U = 20000000L;
        field_R = 20;
        field_O = 2;
        field_T = new ed();
        field_Q = "Names cannot contain consecutive spaces";
    }
}
