/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nd extends lc implements rc {
    private String[] field_D;
    static int[] field_F;
    private wd[] field_z;
    static int field_E;
    static String field_G;
    private rf field_C;
    static bj field_A;

    final boolean a(lk param0, char param1, int param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (param2 == 98) {
            stackIn_6_0 = this.a((byte) -126, param0);
            return stackIn_6_0;
          }
          if (99 != param2) {
            return false;
          }
          stackIn_9_0 = this.a(param0, param3 ^ -30160);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("nd.E(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        java.applet.Applet var5 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Bounce.field_N;
        try {
          for (var2_int = 0; param0.length() > var2_int; var2_int++) {
            var3 = param0.charAt(var2_int);
            if (!j.a((char) var3, (byte) 56) &&
              !kf.a(-49, (char) var3)) {
              return true;
            }
          }
          if (param1 >= 34) {
            return false;
          }
          var5 = (java.applet.Applet) null;
          nd.a(true, (java.applet.Applet) null);
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("nd.A(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    nd(rf param0) {
        super(0, 0, 0, 0, (fc) null);
        try {
          this.field_C = param0;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "nd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_8_0 = null;
          StringBuilder stackIn_8_1 = null;
          String stackIn_9_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            if (param1 != 8192) {
              return;
            }
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
              param0.getAppletContext().showDocument(ag.a(param0, var2, false), "_top");
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
            stackIn_8_1 = new StringBuilder().append("nd.H(");
            if (param0 == null) {
              stackIn_9_2 = "null";
            } else {
              stackIn_9_2 = "{...}";
            }
            throw ii.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0) {
        if (param0 != -21065) {
          field_A = (bj) null;
        }
        return ef.field_a;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, 48, param3);
        if (param0 != 0) {
          return;
        }
        tj var5 = sg.field_a;
        if (this.field_D != null) {
          var5.a(nk.field_e, param3 + this.field_r, param1 + this.field_i, this.field_k, 20, 16777215, -1, 0, 0, var5.field_s + var5.field_x);
        }
        if (param2 < 33) {
          field_F = (int[]) null;
        }
    }

    final void a(byte param0, String[] param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        r var4 = null;
        int var6 = 0;
        var6 = Bounce.field_N;
        try {
          this.field_w.b(-77);
          if (param1 != null &&
            param1.length != 0) {
            if (param0 > -66) {
              this.field_C = (rf) null;
            }
            var3_int = param1.length;
            this.field_D = new String[var3_int];
            for (var4_int = 0; var3_int > var4_int; var4_int++) {
              this.field_D[var4_int] = qa.a((CharSequence) ((Object) param1[var4_int]), true).replace(' ', ' ');
            }
            var4 = new r(sg.field_a, 0, 1);
            this.field_z = new wd[1 + var3_int];
            for (var5 = 0; var5 < var3_int; var5++) {
              this.field_z[var5] = new wd(this.field_D[var5], (sk) (this));
              this.field_z[var5].field_j = (fc) ((Object) var4);
              this.field_z[var5].field_q = eg.field_p;
              this.field_z[var5].b(15, 80, 80, 0, var5 * 16 + 20);
              this.b(this.field_z[var5], true);
            }
            this.field_z[var3_int] = new wd(kj.field_g, (sk) (this));
            this.field_z[var3_int].field_j = (fc) ((Object) var4);
            this.field_z[var3_int].b(15, 80, 100, 0, var3_int * 16 + 36);
            this.b(this.field_z[var3_int], true);
            return;
          }
          this.field_D = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("nd.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static boolean a(boolean param0, java.applet.Applet param1) {
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
          java.applet.Applet var8 = null;
          var7 = Bounce.field_N;
          try {
            if (oh.field_e) {
              return true;
            }
            try {
              var2 = "tuhstatbut";
              var3 = (String) (ac.a(param1, "getcookies", -31185));
              var4 = di.a(-112, ';', var3);
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
            if (param0) {
              var8 = (java.applet.Applet) null;
              nd.a(true, (java.applet.Applet) null);
            }
            stackIn_19_0 = (null != param1.getParameter("tuhstatbut"));
            return stackIn_19_0;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_22_0 = var2_ref2;
            stackIn_22_1 = new StringBuilder().append("nd.G(").append(param0).append(',');
            if (param1 == null) {
              stackIn_23_2 = "null";
            } else {
              stackIn_23_2 = "{...}";
            }
            throw ii.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        field_A = null;
        field_G = null;
        field_F = null;
        if (!param0) {
          String var2 = (String) null;
          nd.a((String) null, 51);
        }
    }

    public final void a(byte param0, int param1, int param2, int param3, wd param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Bounce.field_N;
        try {
          if (param0 <= 6) {
            return;
          }
          for (var6_int = 0; this.field_D.length > var6_int; var6_int++) {
            if (this.field_z[var6_int] == param4) {
              this.field_C.a(this.field_D[var6_int], (byte) 43);
            }
          }
          if (this.field_z[this.field_D.length] == param4) {
            this.field_C.a(-3814);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("nd.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_F = new int[8192];
        field_G = "Visit the Account Management section on the main site to view.";
    }
}
