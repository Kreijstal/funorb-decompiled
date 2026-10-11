/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nm {
    static String field_b;
    private bb field_a;
    static tf field_f;
    private fa field_e;
    static int field_c;
    static boolean field_d;

    final fa a(byte param0) {
        fa var2 = this.field_e;
        if (var2 == this.field_a.field_f) {
          this.field_e = null;
          return null;
        }
        this.field_e = var2.field_a;
        if (param0 != -104) {
          return (fa) null;
        }
        return var2;
    }

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
          nm.c(44);
        }
        field_f = null;
    }

    final fa d(int param0) {
        fa var2 = this.field_a.field_f.field_a;
        if (param0 != 0) {
          field_b = (String) null;
        }
        if (this.field_a.field_f == var2) {
          this.field_e = null;
          return null;
        }
        this.field_e = var2.field_a;
        return var2;
    }

    final static void c(int param0) {
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        uj var1 = null;
        eq var1_ref = null;
        RuntimeException var1_ref2 = null;
        int var2 = 0;
        String var3 = null;
        uj var1Lifetime1;
        var2 = Pixelate.field_H ? 1 : 0;
        try {
          if (param0 != -1) {
            var3 = (String) null;
            nm.a((String) null, -43);
          }
          var1 = (uj) (i.field_n.c(1504642273));
          while (var1 != null) {
            if (var1.field_Tb > 0) {
              var1.field_Tb = var1.field_Tb - 1;
              if (var1.field_Tb == 0) {
                var1.field_Eb = 0;
                if (var1.b((byte) 109)) {
                  var1.c(param0 ^ -2780);
                }
              }
            }
            var1 = (uj) (i.field_n.f(param0 ^ -1504642274));
          }
          var1_ref = (eq) (nk.field_a.c(param0 ^ -1504642274));
          while (var1_ref != null) {
            if (var1_ref.field_Rb > 0) {
              var1_ref.field_Rb = var1_ref.field_Rb - 1;
              if (var1_ref.field_Rb == 0) {
                var1_ref.field_Qb = 0;
                if (var1_ref.j(433)) {
                  var1_ref.c(2779);
                }
              }
            }
            var1_ref = (eq) (nk.field_a.f(1504642273));
          }
          var1Lifetime1 = (uj) (wi.field_a.c(1504642273));
          while (var1Lifetime1 != null) {
            stackIn_23_0 = -1;
            if (stackIn_23_0 > ~var1Lifetime1.field_Tb) {
              var1Lifetime1.field_Tb = var1Lifetime1.field_Tb - 1;
              if (var1Lifetime1.field_Tb != 0) {
                var1Lifetime1 = (uj) (wi.field_a.f(1504642273));
                continue;
              }
              var1Lifetime1.field_Eb = 0;
              if (var1Lifetime1.b((byte) -116)) {
                var1Lifetime1.c(2779);
              }
            }
            var1Lifetime1 = (uj) (wi.field_a.f(1504642273));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1_ref2), "nm.I(" + param0 + ')');
        }
    }

    final fa b(byte param0, fa param1) {
        fa var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        fa stackIn_8_0 = null;
        fa stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null) {
            var3 = param1;
          } else {
            var3 = this.field_a.field_f.field_a;
          }
          if (this.field_a.field_f == var3) {
            this.field_e = null;
            stackIn_5_0 = null;
            return (fa) (stackIn_5_0);
          }
          this.field_e = var3.field_a;
          if (param0 < -72) {
            stackIn_10_0 = var3;
            return stackIn_10_0;
          }
          stackIn_8_0 = (fa) null;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("nm.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void b(boolean param0) {
        String var2 = (String) null;
        al.a("", -110, (String) null);
        if (!param0) {
          field_f = (tf) null;
        }
    }

    final fa e(int param0) {
        fa var2 = this.field_e;
        if (this.field_a.field_f == var2) {
          this.field_e = null;
          return null;
        }
        if (param0 > -56) {
          return (fa) null;
        }
        this.field_e = var2.field_h;
        return var2;
    }

    final fa a(byte param0, fa param1) {
        fa var3 = null;
        RuntimeException var3_ref = null;
        fa var4 = null;
        Object stackIn_6_0 = null;
        fa stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != null) {
            var3 = param1;
          } else {
            var3 = this.field_a.field_f.field_h;
          }
          if (var3 == this.field_a.field_f) {
            this.field_e = null;
            stackIn_6_0 = null;
            return (fa) (stackIn_6_0);
          }
          this.field_e = var3.field_h;
          if (param0 != -99) {
            var4 = (fa) null;
            this.b((byte) -11, (fa) null);
          }
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("nm.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static boolean a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          if (param1 < 18) {
            return false;
          }
          for (var2_int = 0; var2_int < param0.length(); var2_int++) {
            var3 = param0.charAt(var2_int);
            if (!tk.a(-66, (char) var3) &&
              !ti.a(57, (char) var3)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("nm.K(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final fa b(int param0) {
        if (param0 != -1) {
          field_c = 52;
        }
        fa var2 = this.field_a.field_f.field_h;
        if (var2 == this.field_a.field_f) {
          this.field_e = null;
          return null;
        }
        this.field_e = var2.field_h;
        return var2;
    }

    final static void a(int param0) {
        if (fc.field_e == ti.field_t) {
          return;
        }
        if (tk.a((byte) -104, fc.field_e)) {
          wo.b(126, fc.field_e).a(true);
        }
        fc.field_e = ti.field_t;
        if (og.field_l) {
          og.field_l = false;
          qo.field_r = null;
          ro.field_e = null;
        }
        ec.field_t = param0;
        if (ce.field_a) {
          wh.field_p = null;
          nj.field_h = new bb();
          go.field_k = 0;
          ce.field_a = false;
          de.field_n = 0;
        }
        if (mi.field_o) {
          ak.i(param0 ^ 0);
          kj.a(23949);
          bd.a((byte) -1);
          mi.field_o = false;
        }
    }

    nm(bb param0) {
        try {
          this.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "nm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = "Clan";
        field_d = false;
        field_c = 0;
    }
}
