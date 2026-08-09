/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ms extends tc {
    static String field_m;
    ms field_l;
    static int field_t;
    static boolean field_o;
    long field_q;
    static je field_k;
    ms field_s;
    static int field_r;
    static String field_n;
    static String field_p;

    final boolean a(byte param0) {
        if (!(this.field_l != null)) {
            return false;
        }
        int var2 = 106 / ((10 - param0) / 60);
        return true;
    }

    final void c(byte param0) {
        if (this.field_l == null) {
          return;
        } else {
          this.field_l.field_s = this.field_s;
          this.field_s.field_l = this.field_l;
          if (param0 != -76) {
            this.a(true, -70L);
            this.field_s = null;
            this.field_l = null;
            return;
          } else {
            this.field_s = null;
            this.field_l = null;
            return;
          }
        }
    }

    final static int a(int param0, og[] param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.field_M ? 1 : 0;
        try {
          L0: {
            var3_int = 0;
            L1: while (true) {
              if (-1 + param1.length <= var3_int) {
                if (param2 < -81) {
                  stackIn_13_0 = -1 + param1.length;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  stackIn_11_0 = -74;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              } else {
                if ((param0 + -1 ^ -1) <= (param1[1 + var3_int].field_s ^ -1)) {
                  var3_int++;
                  continue L1;
                } else {
                  stackIn_7_0 = var3_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var3);

            stackIn_16_1 = new StringBuilder().append("ms.FA(").append(param0).append(',');

            if (param1 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_7_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0;
          } else {
            return stackIn_13_0;
          }
        }
    }

    public static void f(int param0) {
        if (param0 != -1) {
            return;
        }
        field_n = null;
        field_p = null;
        field_k = null;
        field_m = null;
    }

    final long a(int param0) {
        if (param0 < 101) {
            field_o = true;
            return this.field_q;
        }
        return this.field_q;
    }

    final void a(boolean param0, long param1) {
        if (this.field_l == null) {
          if (!param0) {
            this.field_l = (ms) null;
            this.field_q = param1;
            return;
          } else {
            this.field_q = param1;
            return;
          }
        } else {
          throw new RuntimeException();
        }
    }

    final static void e(int param0) {
        int var1;
        int var2;
        var2 = ArmiesOfGielinor.field_M ? 1 : 0;
        if (param0 >= 111) {
          ac.field_n = false;
          aw.field_h = null;
          if (!fh.field_i) {
            var1 = vt.field_n;
            if (var1 > 0) {
              if (1 != var1) {
                aw.field_h = fo.a(4800, lw.field_nb, new String[]{Integer.toString(var1)});
                aw.field_h = pj.a(593277313, new CharSequence[]{(CharSequence) ((Object) aw.field_h), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) c.field_a)});
                qc.field_a.b(true);
                qf.a(56);
                return;
              } else {
                aw.field_h = hh.field_a;
                aw.field_h = pj.a(593277313, new CharSequence[]{(CharSequence) ((Object) aw.field_h), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) c.field_a)});
                qc.field_a.b(true);
                qf.a(56);
                return;
              }
            } else {
              qc.field_a.b(true);
              qf.a(56);
              return;
            }
          } else {
            qc.field_a.o(4259);
            return;
          }
        } else {
          ms.e(75);
          ac.field_n = false;
          aw.field_h = null;
          if (!fh.field_i) {
            var1 = vt.field_n;
            if (var1 > 0) {
              if (1 != var1) {
                aw.field_h = fo.a(4800, lw.field_nb, new String[]{Integer.toString(var1)});
                aw.field_h = pj.a(593277313, new CharSequence[]{(CharSequence) ((Object) aw.field_h), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) c.field_a)});
                qc.field_a.b(true);
                qf.a(56);
                return;
              } else {
                aw.field_h = hh.field_a;
                aw.field_h = pj.a(593277313, new CharSequence[]{(CharSequence) ((Object) aw.field_h), (CharSequence) ((Object) "<br>"), (CharSequence) ((Object) c.field_a)});
                qc.field_a.b(true);
                qf.a(56);
                return;
              }
            } else {
              qc.field_a.b(true);
              qf.a(56);
              return;
            }
          } else {
            qc.field_a.o(4259);
            return;
          }
        }
    }

    protected ms() {
    }

    static {
        field_n = "Aerial";
        field_p = "Camouflage";
        field_m = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
