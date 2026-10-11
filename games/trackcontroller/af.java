/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class af extends di {
    static String field_n;
    static kd field_o;
    private boolean field_p;
    private String field_m;

    public static void d(byte param0) {
        int var1 = -80 / ((0 - param0) / 46);
        field_n = null;
        field_o = null;
    }

    af(lb param0) {
        super(param0);
        this.field_p = false;
    }

    final ud a(int param0, String param1) {
        nj var3 = null;
        RuntimeException var3_ref = null;
        CharSequence var4 = null;
        ud stackIn_3_0 = null;
        ud stackIn_6_0 = null;
        ud stackIn_13_0 = null;
        ud stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (CharSequence) ((Object) param1);
          if (!pl.a(43, var4)) {
            stackIn_3_0 = ef.field_b;
            return stackIn_3_0;
          }
          if (param0 > -106) {
            stackIn_6_0 = (ud) null;
            return stackIn_6_0;
          }
          if (!param1.equals(this.field_m)) {
            var3 = kj.a(param1, 63);
            if (var3 != null &&
              null == var3.field_c) {
              this.field_m = param1;
              this.field_p = var3.field_e;
            } else {
              stackIn_13_0 = tk.field_t;
              return stackIn_13_0;
            }
          }
          if (this.field_p) {
            stackIn_18_0 = TrackController.field_G;
          } else {
            stackIn_18_0 = ef.field_b;
          }
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_21_0 = var3_ref;
          stackIn_21_1 = new StringBuilder().append("af.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void a(java.applet.Applet param0, byte param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            if (param1 != -9) {
              return;
            }
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "quit.ws");
              param0.getAppletContext().showDocument(of.a(param0, var2, false), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_8_0 = var2_ref2;
            stackIn_8_1 = new StringBuilder().append("af.A(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw sl.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, String param2) {
        int var3_int = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          gh.field_k = false;
          u.field_i = false;
          if (kb.field_a != null &&
            kb.field_a.field_E) {
            var3_int = 1;
            if (param1 == 8) {
              if (vg.field_o) {
                param2 = vi.field_e;
              } else {
                param2 = ba.field_d;
              }
              param1 = 2;
              ra.field_y.a((byte) 114, qg.field_c);
            }
            if (param1 == 10) {
              pl.a(0);
              var3_int = 0;
            }
            if (var3_int != 0) {
              if (u.field_i) {
                param2 = dh.a((byte) -73, new String[]{param2}, od.field_b);
              }
              if (pc.field_h) {
                param2 = cb.field_a;
              }
              kb.field_a.a(param1, param2, -10);
            }
            if (param1 != 256 &&
              10 != param1 &&
              !vg.field_o) {
              ra.field_y.a((byte) 121);
            }
          }
          if (param0 >= -60) {
            field_n = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_25_0 = var3;
          stackIn_25_1 = new StringBuilder().append("af.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final String a(String param0, int param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        nj var4 = null;
        CharSequence var5 = null;
        String stackIn_2_0 = null;
        String stackIn_15_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (CharSequence) ((Object) param0);
          var3 = il.a(-67, var5);
          if (var3 != null) {
            stackIn_2_0 = var3;
            return stackIn_2_0;
          }
          if (!param0.equals(this.field_m)) {
            var4 = kj.a(param0, 63);
            if (var4 == null) {
              return null;
            }
            if (var4.field_c != null) {
              return null;
            }
            this.field_m = param0;
            this.field_p = var4.field_e;
          }
          if (param1 != 426) {
            this.field_m = (String) null;
          }
          if (this.field_p) {
            stackIn_17_0 = qk.field_K;
            return stackIn_17_0;
          }
          stackIn_15_0 = ga.field_f;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("af.B(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
          int var5 = 0;
          String var2 = null;
          String var3 = null;
          String[] var4 = null;
          int var6 = 0;
          int var7 = 0;
          boolean stackIn_19_0 = false;
          RuntimeException stackIn_22_0 = null;
          StringBuilder stackIn_22_1 = null;
          String stackIn_23_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var2_ref = null;
          RuntimeException var2_ref2 = null;
          var7 = TrackController.field_F ? 1 : 0;
          try {
            if (wd.field_R) {
              return true;
            }
            if (param0 != 9819) {
              af.d((byte) 51);
            }
            try {
              var2 = "tuhstatbut";
              var3 = (String) (sj.a((byte) -29, "getcookies", param1));
              var4 = te.a(var3, ';', (byte) -46);
              for (var5 = 0; var5 < var4.length; var5++) {
                var6 = var4[var5].indexOf('=');
                if (0 <= var6 &&
                  var4[var5].substring(0, var6).trim().equals(var2)) {
                  return true;
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
            }
            stackIn_19_0 = (param1.getParameter("tuhstatbut") != null);
            return stackIn_19_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_22_0 = var2_ref2;
            stackIn_22_1 = new StringBuilder().append("af.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_23_2 = "null";
            } else {
              stackIn_23_2 = "{...}";
            }
            throw sl.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(boolean param0) {
        if (param0) {
          this.a(true);
        }
        this.field_m = null;
    }

    static {
        field_n = "Highscores";
        field_o = null;
    }
}
