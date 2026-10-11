/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie {
    static String field_c;
    static int[] field_d;
    static int field_g;
    static String field_i;
    static String field_e;
    static String field_b;
    static int field_h;
    static int[][] field_a;
    static jg field_f;

    final static void a(boolean param0, int param1, int param2) {
        int fieldTemp$0 = 0;
        lk stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int stackIn_22_2 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        dd var6 = null;
        aa var7 = null;
        lk var8 = null;
        try {
          if (ne.field_r.c(0)) {
            return;
          }
          var3_int = param0 ? 1 : 0;
          var4 = 0;
          var5 = 0;
          var6 = ((lk) (ne.field_r.c((byte) 63))).field_n;
          if (var6 != null) {
            param1 = param1 - (var6.field_A >> 1);
            if (gg.field_f >= param1 &&
              wn.field_i >= param2 &&
              230 + param2 >= wn.field_i &&
              gg.field_f <= param1 + var6.field_A) {
              if (eq.field_W != -1) {
                var5 = -wn.field_i + eq.field_W;
              }
              eq.field_W = wn.field_i;
              var3_int = 1;
            } else {
              eq.field_W = -1;
            }
          }
          var7 = new aa(ne.field_r);
          var8 = (lk) (var7.b((byte) -92));
          while (var8 != null &&
            var4 < 230) {
            if (var8.field_n == null) {
              var8.c(-1);
              return;
            }
            stackIn_21_0 = var8;
            stackIn_21_1 = var8.field_p;
            if (var3_int != 0) {
              stackIn_22_2 = var5;
            } else {
              stackIn_22_2 = var8.field_q;
            }
            stackIn_21_0.field_p = stackIn_21_1 - stackIn_22_2;
            if (var8.field_p < -var8.field_n.field_z) {
              fieldTemp$0 = var8.field_l - 1;
              var8.field_l = var8.field_l - 1;
              if (fieldTemp$0 == 0) {
                var8.a((byte) -117);
              } else {
                var8.field_p = var8.field_p + (4 + var8.field_n.field_z);
              }
            }
            var4 = var8.field_l * (4 + var8.field_n.field_z) + var8.field_p;
            var8 = (lk) (var7.b(-86));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var3), "ie.F(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(byte param0, java.applet.Applet param1) {
        try {
          int var5 = 0;
          String var2 = null;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          boolean stackIn_17_0 = false;
          RuntimeException stackIn_20_0 = null;
          StringBuilder stackIn_20_1 = null;
          String stackIn_21_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            if (iq.field_j) {
              return true;
            }
            try {
              if (param0 != 28) {
                ie.a(true, true, -103, -121);
              }
              var2 = "tuhstatbut";
              var3 = (String) (mo.a((byte) -88, "getcookies", param1));
              var4 = jc.a(30634, var3, ';');
              for (var5 = 0; var4.length > var5; var5++) {
                var6 = var4[var5].indexOf('=');
                if (var6 >= 0 &&
                  var4[var5].substring(0, var6).trim().equals(var2)) {
                  return true;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
            }
            stackIn_17_0 = (param1.getParameter("tuhstatbut") != null);
            return stackIn_17_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_20_0 = var2_ref2;
            stackIn_20_1 = new StringBuilder().append("ie.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_21_2 = "null";
            } else {
              stackIn_21_2 = "{...}";
            }
            throw wm.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int[] param1, eg param2) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != -2656) {
            ie.a(true, -83, -119);
          }
          d.a(param2, -23109);
          param1[0] = (int)Math.ceil((double)(param2.field_w - param2.field_D) / ((double)nc.field_Y.length / 2.5));
          param1[1] = (int)Math.ceil((double)(param2.field_S - param2.field_y) / ((double)nc.field_Y.length / 2.5));
          param1[2] = (int)Math.ceil((double)(param2.field_x - param2.field_V) / ((double)nc.field_Y.length / 2.5));
          if (0 == param1[1]) {
            param1[1] = 1;
          }
          if (param1[2] == 0) {
            param1[2] = 1;
          }
          if (param1[0] == 0) {
            param1[0] = 1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("ie.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param2 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(byte param0) {
        if (param0 != -13) {
          return;
        }
        field_i = null;
        field_c = null;
        field_b = null;
        field_a = (int[][]) null;
        field_f = null;
        field_e = null;
        field_d = null;
    }

    final static void a(int param0, boolean param1, int param2, int param3) {
        rg.a(tk.field_i, kj.field_j, param0, param1, param2 + 21166, ad.field_x, param3);
        if (param2 != -17156) {
          field_b = (String) null;
        }
    }

    final static void a(boolean param0, boolean param1, int param2, int param3) {
        vh stackIn_9_0 = null;
        boolean stackIn_10_1 = false;
        vh stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        vh stackIn_21_0 = null;
        boolean stackIn_22_1 = false;
        qi.a((byte) -100);
        if (mg.field_d >= 0) {
          pm.field_m.field_nb = nr.a(new String[]{Integer.toString(mg.field_d)}, -1, m.field_a);
        } else {
          pm.field_m.field_nb = null;
        }
        stackIn_9_0 = ir.field_a;
        stackIn_10_1 = (param1) && (!param0) && (!tf.field_d) && (em.field_L == null) && (tp.field_e == null);
        ((vh) (Object) stackIn_9_0).a(stackIn_10_1, false);
        stackIn_16_0 = oi.field_n;
        stackIn_17_1 = (param1) && (!param0) && (!tf.field_d) && (em.field_L == null) && (null == tp.field_e);
        ((vh) (Object) stackIn_16_0).a(stackIn_17_1, false);
        stackIn_21_0 = ln.field_q;
        stackIn_22_1 = (param1) && (!param0) && (tf.field_d);
        ((vh) (Object) stackIn_21_0).a(stackIn_22_1, false);
        kg.field_l.field_i.c(true);
        if (gj.field_K.field_R != 0) {
          jo.field_H = true;
        }
        boolean decompiledFrameRemainder0 = true;
        if (rn.field_f.field_R != 0) {
          if (!rg.field_s &&
            mp.field_V <= 0 && (!(hq.field_i >= 2) ||
            !vj.field_c[12])) {
            gn.field_f = true;
            decompiledFrameRemainder0 = false;
          }
          else {
            rb.c(param3, 100);
          }
        }
        if (uc.field_b.field_R != 0) {
          if (dg.field_T.length == 1 &&
            cr.field_l != dg.field_T[0]) {
            cr.field_l = dg.field_T[0];
          }
          je.a(param3, cr.field_l, true, tq.field_u, 0, false);
        }
        if (param2 > -126) {
          ie.a(true, -43, -89);
        }
        if (sb.field_a.field_R != 0) {
          tf.field_d = false;
        }
    }

    static {
        field_i = "To <u=ffffff>look at</u> a different part of the table: <img=0> <col=99ff99>Click on</col> that <col=99ff99>part of the table</col>, as long as it's not the cue ball.";
        field_d = new int[8192];
        field_h = 0;
        field_c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_b = "Accept";
    }
}
