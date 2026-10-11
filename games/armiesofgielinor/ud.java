/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ud extends sf implements he {
    static String field_Y;
    static String field_Z;
    static String field_W;
    static wk[] field_X;
    static String field_ab;
    private fw field_bb;

    final static void b(int param0, boolean param1, int param2, int param3) {
        if (param1) {
          field_X = (wk[]) null;
          if (param2 != 0) {
            if (param2 == 1) {
              if (va.field_D == param0) {
                if (2 == param2 &&
                  cd.field_c != param0) {
                  cd.field_c = param0;
                  kr.field_J = true;
                  ae.a(896, param3);
                }
                return;
              }
              va.field_D = param0;
              kr.field_J = true;
              ae.a(896, param3);
            }
          } else {
            if (param0 != ol.field_B) {
              ol.field_B = param0;
              kr.field_J = true;
              ae.a(896, param3);
            }
            if (param2 == 1 &&
              va.field_D != param0) {
              va.field_D = param0;
              kr.field_J = true;
              ae.a(896, param3);
            }
          }
        } else {
          if (param2 == 0 &&
            param0 != ol.field_B) {
            ol.field_B = param0;
            kr.field_J = true;
            ae.a(896, param3);
          }
          if (param2 == 1 &&
            va.field_D != param0) {
            va.field_D = param0;
            kr.field_J = true;
            ae.a(896, param3);
          }
        }
        if (2 != param2) {
          return;
        }
        if (cd.field_c == param0) {
          return;
        }
        cd.field_c = param0;
        kr.field_J = true;
        ae.a(896, param3);
    }

    private final fw a(String param0, qo param1, int param2) {
        fw var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        int var6 = 0;
        fw stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new fw(param0, param1);
          var4.field_k = (kh) ((Object) new nu());
          var5 = this.field_w - 6;
          this.field_w = this.field_w + 38;
          var4.a(15, -16 + (-14 + this.field_l), var5, 8192, 30);
          this.a((byte) 10, (kb) (var4));
          this.e(0);
          var6 = -126 / ((-6 - param2) / 40);
          stackIn_1_0 = var4;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_4_0 = var4_ref;
          stackIn_4_1 = new StringBuilder().append("ud.E(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    ud(gk param0, jl param1) {
        super(param0, 200, 150);
        Object var3 = null;
        kb var4 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          if (param1 != hm.field_h) {
            if (mp.field_Mb == param1) {
              this.field_w = this.field_w + 10;
              var3 = am.field_y;
              if (pr.b(-108)) {
                this.field_w = this.field_w + 20;
                var3 = field_W;
              }
            } else {
              if (param1 == tn.field_cb) {
                this.field_w = this.field_w + 30;
                var3 = hb.field_a;
              }
            }
          } else {
            var3 = tl.field_a;
          }
          var4 = new kb((String) (var3), (qo) null);
          var4.field_B = 0;
          var4.field_p = 50;
          var4.field_l = this.field_l;
          var4.field_w = 80;
          var4.field_k = (kh) ((Object) new lk(gl.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.a((byte) 10, var4);
          this.field_bb = this.a(pd.field_f, (qo) (this), 93);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ud.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ig.a((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public final void a(int param0, int param1, int param2, int param3, fw param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 11) {
            field_Z = (String) null;
          }
          if (param4 != this.field_bb) {
            return;
          }
          this.i((byte) 60);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("ud.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void n(int param0) {
        if (param0 == 12213) {
          field_X = null;
          field_Y = null;
          field_Z = null;
          field_W = null;
          field_ab = null;
          return;
        }
        ud.n(4);
        field_X = null;
        field_Y = null;
        field_Z = null;
        field_W = null;
        field_ab = null;
    }

    private final void i(byte param0) {
        if (param0 != 60) {
          ud.n(-98);
          if (!this.field_L) {
            return;
          }
          this.field_L = false;
          return;
        }
        if (!this.field_L) {
          return;
        }
        this.field_L = false;
    }

    static {
        field_Y = "This unit has an attack range of <%0>";
        field_Z = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_W = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_ab = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
