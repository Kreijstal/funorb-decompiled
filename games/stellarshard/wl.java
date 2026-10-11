/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wl extends tb {
    private oa field_Q;
    private int field_bb;
    static boolean field_ab;
    static volatile int field_R;
    private rd field_X;
    private int field_U;
    private int field_V;
    private int field_Z;
    private rj field_Y;
    static String field_W;
    private int field_S;
    static String field_T;
    static int[] field_P;

    boolean a(int param0, int param1, char param2, rj param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(param0, param1, param2, param3)) {
            return true;
          }
          if (this.field_Q == null) {
            return false;
          }
          if (param1 == 98) {
            this.field_Q.a(-2147483648, param3);
          }
          if (param1 == 99) {
            this.field_Q.a(param0 ^ -2147453991, param3);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_14_0 = var5;
          stackIn_14_1 = new StringBuilder().append("wl.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void i(int param0) {
        if (this.field_X != null) {
          if (this.field_X != cj.field_b) {
            this.a(12 + this.field_Y.field_p, (byte) -68, 12 + (this.field_Z + this.field_Y.field_t));
            this.c(9, this.field_Y);
          }
          this.field_X = null;
          this.field_Q.field_A = 256;
        }
        super.i(param0);
    }

    final static void l(int param0) {
        o.field_g = null;
        pd.field_g = null;
        qh.field_g = false;
        if (param0 == -12128) {
          bb.field_k = null;
          fb.field_e = null;
          return;
        }
        field_ab = false;
        bb.field_k = null;
        fb.field_e = null;
    }

    final void j(int param0) {
        if (this.field_X == hj.field_d) {
          return;
        }
        this.field_U = 0;
        this.field_X = cj.field_b;
        if (param0 == -21) {
          this.c(-94, this.field_Y);
          this.field_Q.field_A = 0;
          this.field_Y = null;
          return;
        }
    }

    final static void a(int param0, int param1, String param2) {
        int var3_int = 0;
        try {
          ie.field_r = false;
          ck.field_db = false;
          if (param1 != -8440) {
            String var4 = (String) null;
            wl.a(-111, -58, (String) null);
          }
          if (ei.field_G != null &&
            ei.field_G.field_G) {
            var3_int = 1;
            if (8 != param0) {
            } else {
              if (gk.field_a) {
                param2 = ce.field_g;
              } else {
                param2 = dd.field_f;
              }
              param0 = 2;
              af.field_r.b(va.field_a, 15);
            }
            if (param0 == 10) {
              var3_int = 0;
              pi.a(false);
            }
            if (var3_int != 0) {
              if (ie.field_r) {
                param2 = h.a(oa.field_F, 0, new String[]{param2});
              }
              if (ak.field_a) {
                param2 = sj.field_E;
              }
              ei.field_G.a(param2, param0, param1 + 8517);
            }
            if (param0 != 256 &&
              param0 != 10) {
              if (gk.field_a) {
                return;
              }
              af.field_r.e((byte) 41);
            }
          }
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "wl.EB(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    boolean d(boolean param0) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int var3 = stellarshard.field_B;
        if (param0) {
          if (this.field_X == null) {
            return super.d(true);
          }
          if (hj.field_d != this.field_X) {
            if (cj.field_b != this.field_X) {
              return super.d(true);
            }
            fieldTemp$0 = this.field_U + 1;
            this.field_U = this.field_U + 1;
            if (this.field_bb != fieldTemp$0) {
              this.field_Q.field_A = (this.field_U << 8) / this.field_bb;
              return super.d(true);
            }
            this.field_Q.field_A = 256;
            this.field_X = null;
            return super.d(true);
          }
          fieldTemp$1 = this.field_U + 1;
          this.field_U = this.field_U + 1;
          if (this.field_V != fieldTemp$1) {
            this.field_Q.field_A = -((this.field_U << 8) / this.field_V) + 256;
            return super.d(true);
          }
          this.field_X = fj.field_i;
          this.a(this.field_S, 12 + this.field_Y.field_p, (byte) -97, this.field_Z + 12 + this.field_Y.field_t);
          this.field_Q.field_A = 0;
          this.field_U = 0;
          return super.d(true);
        }
        this.i(-92);
        if (this.field_X == null) {
          return super.d(true);
        }
        if (hj.field_d != this.field_X) {
          if (cj.field_b != this.field_X) {
            return super.d(true);
          }
          fieldTemp$2 = this.field_U + 1;
          this.field_U = this.field_U + 1;
          if (this.field_bb != fieldTemp$2) {
            this.field_Q.field_A = (this.field_U << 8) / this.field_bb;
            return super.d(true);
          }
          this.field_Q.field_A = 256;
          this.field_X = null;
          return super.d(true);
        }
        int fieldTemp$3 = this.field_U + 1;
        this.field_U = this.field_U + 1;
        if (this.field_V != fieldTemp$3) {
          this.field_Q.field_A = -((this.field_U << 8) / this.field_V) + 256;
          return super.d(true);
        }
        this.field_X = fj.field_i;
        this.a(this.field_S, 12 + this.field_Y.field_p, (byte) -97, this.field_Z + 12 + this.field_Y.field_t);
        this.field_Q.field_A = 0;
        this.field_U = 0;
        return super.d(true);
    }

    public static void k(int param0) {
        int var1 = -94 / ((-26 - param0) / 49);
        field_W = null;
        field_T = null;
        field_P = null;
    }

    void b(rj param0, int param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        rj var4 = null;
        try {
          this.field_Y = param0;
          if (fj.field_i == this.field_X) {
            this.a(this.field_S, this.field_Y.field_p + 12, (byte) -97, this.field_Z + (12 + this.field_Y.field_t));
            this.field_U = 0;
          } else {
            if (hj.field_d != this.field_X) {
              this.field_U = 0;
              this.field_X = hj.field_d;
            }
          }
          if (param1 == 23143) {
            return;
          }
          var4 = (rj) null;
          this.b((rj) null, 17);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("wl.I(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    wl(ei param0, rj param1, int param2, int param3, int param4) {
        super(param0, param1.field_p + 12, 12 + param2 + param1.field_t);
        try {
          this.field_S = param4;
          this.field_bb = param3;
          this.field_V = param3;
          this.field_Z = param2;
          this.c(16, param1);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "wl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean h(int param0) {
        this.i(3642);
        if (param0 < 98) {
          this.field_Q = (oa) null;
          return super.h(106);
        }
        return super.h(106);
    }

    private final void c(int param0, rj param1) {
        try {
          int var3_int = -55 % ((param0 + 47) / 47);
          if (this.field_Q != null) {
            this.field_Q.c(20);
          }
          if (param1 == null) {
            this.field_Q = new oa();
          } else {
            param1.b(param1.field_p, 6, 6 + this.field_Z, param1.field_t, 23987);
            this.field_Q = new oa(param1);
          }
          this.b(4, this.field_Q);
          this.field_Y = null;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "wl.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static pf a(int param0, int param1) {
        if (param0 != 1) {
          return (pf) null;
        }
        return na.a(1, 255, param1, false, false, true);
    }

    static {
        field_R = 0;
        field_ab = false;
        field_W = "Please wait...";
        field_T = "Log in / Create account";
        field_P = new int[8192];
    }
}
