/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qc extends mf {
    private String field_o;
    static String[] field_k;
    private boolean field_h;
    static boolean field_n;
    static e field_l;
    private lf field_j;
    static String field_m;
    static String field_i;

    final static String a(boolean param0, boolean param1, int param2, boolean param3) {
        int var4;
        int var4Lifetime1;
        if (param2 == 2) {
          var4 = 0;
          if (param3) {
            var4 += 4;
          }
          if (param0) {
            var4 += 2;
          }
          if (param1) {
            var4++;
          }
          return hl.field_h[var4];
        }
        field_n = false;
        var4Lifetime1 = 0;
        if (param3) {
          var4Lifetime1 += 4;
        }
        if (param0) {
          var4Lifetime1 += 2;
        }
        if (param1) {
          var4Lifetime1++;
        }
        return hl.field_h[var4Lifetime1];
    }

    qc(ul param0, ul param1) {
        super(param0);
        this.field_h = false;
        this.field_o = "";
        try {
          this.field_j = new lf(param0, param1);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "qc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final String a(String param0, boolean param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_j.a((byte) -60, param0) == fb.field_e) {
            stackIn_2_0 = this.field_j.a(param0, true);
            return stackIn_2_0;
          }
          if (this.a((byte) -95, param0) == fb.field_e) {
            stackIn_6_0 = te.field_d;
            return stackIn_6_0;
          }
          if (!param1) {
            qc.a(false, true, -100, true);
          }
          stackIn_10_0 = si.field_d;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("qc.A(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final fi a(byte param0, String param1) {
        vj var3 = null;
        RuntimeException var3_ref = null;
        fi stackIn_2_0 = null;
        fi stackIn_5_0 = null;
        fi stackIn_10_0 = null;
        fi stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -44) {
            stackIn_2_0 = (fi) null;
            return stackIn_2_0;
          }
          if (this.field_j.a((byte) -112, param1) == fb.field_e) {
            stackIn_5_0 = fb.field_e;
            return stackIn_5_0;
          }
          if (!param1.equals(this.field_o)) {
            var3 = uc.a(-112, param1);
            if (!var3.c(17237)) {
              stackIn_10_0 = qh.field_x;
              return stackIn_10_0;
            }
            this.field_o = param1;
            this.field_h = var3.b(8909);
          }
          if (this.field_h) {
            stackIn_15_0 = nn.field_q;
          } else {
            stackIn_15_0 = fb.field_e;
          }
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("qc.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public static void e(int param0) {
        if (param0 != -1) {
          return;
        }
        field_k = null;
        field_i = null;
        field_m = null;
        field_l = null;
    }

    final static void a(String param0, java.applet.Applet param1, int param2) {
        try {
          String var6 = null;
          String var5 = null;
          String var4 = null;
          String var7 = null;
          String var5Lifetime1;
          String var5Lifetime2;
          String var5Lifetime3;
          String var5Lifetime4;
          String var5Lifetime5;
          String var5Lifetime6;
          try {
            wm.field_jb = param0;
            try {
              var6 = param1.getParameter("cookieprefix");
              var5 = var6;
              var5Lifetime1 = var6;
              var4 = param1.getParameter("cookiehost");
              var5Lifetime2 = var4;
              var5Lifetime3 = var4;
              var7 = var6 + "settings=" + param0 + "; version=1; path=/; domain=" + var4;
              var5Lifetime4 = var7;
              var5Lifetime5 = var7;
              if (~param0.length() != param2) {
                var5Lifetime6 = var7 + "; Expires=" + ha.a(ri.a(-3) + 94608000000L, 13) + "; Max-Age=" + 94608000L;
              } else {
                var5Lifetime6 = var7 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
              }
              kf.a(param1, true, "document.cookie=\"" + var5Lifetime6 + "\"");
            } catch (Throwable throwable) {
            }
            am.a(param2 + 73, param1);
          } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "qc.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_k = new String[]{null, "To store your progress, you<nbsp>must", "To store your score, you<nbsp>must", "To store your score and progress, you<nbsp>must", "To store your achievements, you<nbsp>must", "To store your achievements and progress, you<nbsp>must", "To store your achievements and score, you<nbsp>must", "To store your achievements, score and progress, you<nbsp>must"};
        field_n = false;
        field_l = new e(0, 2, 2, 1);
        field_i = "Return to Pause Menu";
    }
}
