/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class vi extends df {
    static ih field_C;
    h field_H;
    static int field_L;
    static String field_F;
    static long field_P;
    static qb field_I;
    static ll[] field_M;
    boolean field_G;
    static String field_Q;
    static String field_K;
    static int[] field_N;
    static String field_D;
    static byte[][] field_O;
    static String field_J;
    private int field_S;
    static qb[] field_E;
    static String field_R;

    final static void a(byte param0, String param1) {
        try {
          if (param0 < 58) {
            String var3 = (String) null;
            vi.a((byte) 16, (String) null);
          }
          rj.field_i = param1;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "vi.SA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final int i(byte param0) {
        if (param0 == -52) {
          return this.field_G ? this != this.field_H.g(7213) ? 0 : 256 : 0;
        }
        String var3 = (String) null;
        vi.a((byte) -57, (String) null);
        return this.field_G ? this != this.field_H.g(7213) ? 0 : 256 : 0;
    }

    final static void a(int param0, int param1, int param2, int param3) {
        to.field_m = param3;
        if (param0 != -1) {
          return;
        }
        p.field_c = param2;
        sl.field_T = param1;
    }

    public static void h(byte param0) {
        if (param0 == 62) {
          field_O = (byte[][]) null;
          field_Q = null;
          field_K = null;
          field_D = null;
          field_N = null;
          field_R = null;
          field_M = null;
          field_C = null;
          field_I = null;
          field_E = null;
          field_F = null;
          field_J = null;
          return;
        }
        String var2 = (String) null;
        vi.a((byte) 8, (String) null);
        field_O = (byte[][]) null;
        field_Q = null;
        field_K = null;
        field_D = null;
        field_N = null;
        field_R = null;
        field_M = null;
        field_C = null;
        field_I = null;
        field_E = null;
        field_F = null;
        field_J = null;
    }

    abstract void a(int param0, byte param1, int param2);

    final void a(int param0, int param1, int param2) {
        this.a(param2, -param2 + mf.field_c >> 1, param0, -param0 + gi.field_c >> 1, -112);
        if (param1 != 0) {
          this.a((byte) -50, 71, 43, -75);
        }
    }

    vi(h param0, int param1, int param2) {
        super(-param1 + gi.field_c >> 1, mf.field_c - param2 >> 1, param1, param2, (pf) null);
        try {
          this.field_H = param0;
          this.field_G = false;
          this.field_S = 0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "vi.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(byte param0, int param1, int param2, int param3) {
        if (0 == this.field_S) {
          return;
        }
        if (this.field_S >= 256) {
          if (param2 != 0) {
            return;
          }
          this.a(param1 + this.field_n, (byte) -117, param3 + this.field_j);
          super.a((byte) -76, param1, param2, param3);
          return;
        }
        if (null == ed.field_vb) {
          ed.field_vb = new qb(this.field_v, this.field_k);
        } else {
          if (ed.field_vb.field_q < this.field_v) {
            ed.field_vb = new qb(this.field_v, this.field_k);
          } else {
            if (this.field_k > ed.field_vb.field_y) {
              ed.field_vb = new qb(this.field_v, this.field_k);
            }
          }
        }
        if (param0 >= -52) {
          field_E = (qb[]) null;
        }
        fk.a(ed.field_vb, -23095);
        de.b();
        this.a(0, (byte) -117, 0);
        super.a((byte) -117, -param1 - this.field_n, param2, -this.field_j - param3);
        oo.c(-15405);
        ed.field_vb.c(param1 + this.field_n, param3 + this.field_j, this.field_S);
    }

    boolean a(byte param0) {
        boolean stackIn_10_0 = false;
        boolean stackIn_20_0 = false;
        boolean stackIn_29_0 = false;
        boolean stackIn_35_0 = false;
        int var2;
        int var3;
        if (param0 < 19) {
          return true;
        }
        var2 = this.i((byte) -52);
        var3 = -this.field_S + var2;
        if (var3 > 0) {
          this.field_S = this.field_S + (-1 + (8 + var3)) / 8;
          if (var3 >= 0) {
            if (this.field_S != 0) {
              return false;
            }
            if (var2 != 0) {
              return false;
            }
            stackIn_10_0 = !(this.field_G);
            return stackIn_10_0;
          }
          this.field_S = this.field_S + (1 + (-16 + var3)) / 16;
          if (this.field_S != 0) {
            return false;
          }
          if (var2 != 0) {
            return false;
          }
          stackIn_20_0 = !(this.field_G);
          return stackIn_20_0;
        }
        if (var3 >= 0) {
          stackIn_29_0 = (this.field_S == 0) && (var2 == 0) && (!this.field_G);
          return stackIn_29_0;
        }
        this.field_S = this.field_S + (1 + (-16 + var3)) / 16;
        stackIn_35_0 = (this.field_S == 0) && (var2 == 0) && (!this.field_G);
        return stackIn_35_0;
    }

    final qm e(int param0) {
        qm var2 = super.e(param0);
        if (var2 != null) {
          return var2;
        }
        return (qm) (this);
    }

    boolean g(byte param0) {
        if (param0 != 45) {
          field_F = (String) null;
          this.field_S = this.i((byte) -52);
          if (this.field_S != 0) {
            return false;
          }
          if (!this.field_G) {
            return true;
          }
          return false;
        }
        this.field_S = this.i((byte) -52);
        if (this.field_S != 0) {
          return false;
        }
        if (!this.field_G) {
          return true;
        }
        return false;
    }

    static {
        field_Q = "Unpacking spellbooks";
        field_K = "Unable to add name - system busy";
        field_D = "Only two targets left! Remember to control the velocity of your attack.";
        field_N = new int[]{62};
        field_F = null;
        field_J = "Unpacking music";
        field_C = new ih();
        field_R = "You are offering a rematch.";
    }
}
