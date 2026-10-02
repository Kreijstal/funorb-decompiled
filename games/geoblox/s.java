/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s extends ee implements pe, pl {
    private hk field_K;
    static ck field_E;
    private vf field_J;
    private r field_C;
    static int field_H;
    static volatile int field_I;
    static dm[][] field_G;
    static String field_F;

    final static void g(int param0) {
        if (null == tl.field_f) {
            jk.field_b = wj.a(jk.field_b, new String[]{"<br><shad=000001><%0></shad><br>"}, (byte) -123);
            mj.field_c = wj.a(mj.field_c, new String[]{"<br><shad=000001><%0></shad><br>"}, (byte) -55);
            tl.field_f = new String[19];
            tl.field_f[12] = lh.field_a;
            tl.field_f[7] = tc.field_b;
            tl.field_f[6] = df.field_b;
            tl.field_f[8] = wb.field_c;
            tl.field_f[14] = ne.field_c;
            tl.field_f[5] = ij.field_Z;
            tl.field_f[0] = nk.field_g;
            tl.field_f[4] = wf.field_q;
            tl.field_f[param0] = fc.field_e;
            tl.field_f[10] = bl.field_a;
            tl.field_f[11] = tl.field_o;
            tl.field_f[15] = em.field_a;
            tl.field_f[1] = id.field_a;
            tl.field_f[13] = gj.field_t;
            tl.field_f[3] = ef.field_c;
            tl.field_f[2] = ii.field_b;
            tl.field_f[18] = vd.field_m[2];
            tl.field_f[16] = vd.field_m[0];
            tl.field_f[17] = vd.field_m[1];
            return;
        }
    }

    final static void a(vd param0, int param1) {
        int var2_int = 0;
        vd var3 = null;
        int var4 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = Geoblox.field_C;
        try {
          if (param1 != 0) {
            return;
          }
          if (null == param0.field_k) {
            return;
          }
          L0: {
            if (param0.field_o == 0) {
              if (0 == param0.field_d) {
                break L0;
              }
            }
            for (var2_int = 0; oj.field_b > var2_int; var2_int++) {
              var3 = n.field_k[var2_int];
              if (2 == var3.field_f) {
                if (param0.field_o == var3.field_o) {
                  if (param0.field_d == var3.field_d) {
                    return;
                  }
                }
              }
            }
            break L0;
          }
          if (null == param0.field_g) {
          }
          ki.a(param0, 31274);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = (RuntimeException) (var2);

          stackIn_21_1 = new StringBuilder().append("s.C(");

          if (param0 == null) {
            stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
            stackIn_22_2 = "null";
          } else {
            stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
            stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
            stackIn_22_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    s(r param0) {
        super(0, 0, 288, 0, (dh) null);
        String var7 = null;
        int var3 = 0;
        ff var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
            this.field_C = param0;
            this.field_K = new hk(cl.field_d, (bb) null);
            this.field_K.field_q = (dh) ((Object) new ml());
            var7 = wj.a(nk.field_i, new String[]{this.f(11501), this.c(false)}, (byte) -114);
            var3 = 20;
            var4 = new ff(ng.field_F, 0, 0, 0, 0, 16777215, -1, 3, 0, ng.field_F.field_o, -1, 2147483647, true);
            this.field_J = new vf(var7, var4);
            this.field_J.field_j = "";
            this.field_J.a(0, -47, eh.field_a);
            this.field_J.a(1, 118, eh.field_a);
            this.field_J.field_u = (bb) (this);
            this.field_J.field_r = this.field_r - 40;
            this.field_J.b(26, 0, var3, this.field_r - 40);
            var3 = var3 + (this.field_J.field_h + 15);
            this.b((byte) -108, this.field_J);
            var5 = 4;
            var6 = 200;
            this.field_K.a(40, var6, (byte) -71, var3, -var6 + 300 >> 1);
            this.field_K.field_u = (bb) (this);
            this.b((byte) -63, this.field_K);
            this.a(var3 + (55 + var5), 300, (byte) -104, 0, 0);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "s.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void a(vf param0, int param1, int param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = Geoblox.field_C;
        try {
          if (0 == param1) {
            uk.a(false, "terms.ws");
          } else {
            if (param1 != 1) {
              if (2 == param1) {
                uk.a(false, "conduct.ws");
              }
            } else {
              uk.a(false, "privacy.ws");
            }
          }
          if (param2 == 2) {
            return;
          }
          this.field_C = (r) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = (RuntimeException) (var5);

          stackIn_13_1 = new StringBuilder().append("s.A(");

          if (param0 == null) {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "null";
          } else {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final String f(int param0) {
        String discarded$0 = null;
        if (param0 != 11501) {
            discarded$0 = this.c(true);
            return "<u=2164A2><col=2164A2>";
        }
        return "<u=2164A2><col=2164A2>";
    }

    final boolean a(int param0, int param1, char param2, el param3) {
        RuntimeException var5 = null;
        int stackIn_3_0 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            stackIn_3_0 = 1;
            return stackIn_3_0 != 0;
          }
          if (param0 == 98) {
            stackIn_6_0 = this.a(7305, param3);
            return stackIn_6_0;
          }
          if (param0 != 99) {
            return false;
          }
          stackIn_10_0 = this.a(param3, -104);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = (RuntimeException) (var5);

          stackIn_13_1 = new StringBuilder().append("s.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

          if (param3 == null) {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "null";
          } else {
            stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
            stackIn_14_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
            field_G = (dm[][]) null;
            field_E = null;
            field_F = null;
            return;
        }
        field_I = 58;
        field_G = (dm[][]) null;
        field_E = null;
        field_F = null;
    }

    private final String c(boolean param0) {
        if (param0) {
            field_E = (ck) null;
            return "</col></u>";
        }
        return "</col></u>";
    }

    public final void a(int param0, byte param1, int param2, int param3, hk param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 == this.field_K) {
            ki.a(77);
            this.field_C.h((byte) -104);
          }
          if (param1 == -20) {
            return;
          }
          this.field_C = (r) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = (RuntimeException) (var6);

          stackIn_7_1 = new StringBuilder().append("s.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

          if (param4 == null) {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "null";
          } else {
            stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
            stackIn_8_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(')').toString());
        }
    }

    final static String a(int param0, java.applet.Applet param1) {
        try {
            int var6 = 0;
            String var3 = null;
            String var4 = null;
            String[] var5 = null;
            int var7 = 0;
            String var8 = null;
            String stackIn_5_0 = null;
            String stackIn_13_0 = null;
            String stackIn_15_0 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var2 = null;
            RuntimeException var2_ref = null;
            try {
              try {
                L0: {
                  var8 = param1.getParameter("cookieprefix");
                  var3 = var8 + "settings";
                  var4 = (String) (wk.a((byte) -6, param1, "getcookies"));
                  var5 = uj.a(';', true, var4);
                  for (var6 = 0; var5.length > var6; var6++) {
                    var7 = var5[var6].indexOf('=');
                    if (var7 >= 0) {
                      if (var5[var6].substring(0, var7).trim().equals(var3)) {
                        stackIn_5_0 = var5[var6].substring(var7 + 1).trim();
                        return stackIn_5_0;
                      }
                    }
                  }
                  break L0;
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var2 = decompiledCaughtException;
              }
              if (param0 != -1) {
                s.g(14);
              }
              if (null == sd.field_z) {
                stackIn_15_0 = param1.getParameter("settings");
                return stackIn_15_0;
              }
              stackIn_13_0 = sd.field_z;
              return stackIn_13_0;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var2_ref = (RuntimeException) (Object) decompiledCaughtException;
              stackIn_18_0 = (RuntimeException) (var2_ref);

              stackIn_18_1 = new StringBuilder().append("s.B(").append(param0).append(',');

              if (param1 == null) {
                stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                stackIn_19_2 = "null";
              } else {
                stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                stackIn_19_2 = "{...}";
              }
              throw t.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(')').toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_E = new ck(7, 0, 1, 1);
        field_G = new dm[7][7];
        field_I = 0;
        field_F = "Growing Pumpkin";
    }
}
