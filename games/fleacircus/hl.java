/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hl extends lc {
    private int field_eb;
    private int field_Z;
    private int field_Q;
    private boolean field_E;
    private dd[] field_T;
    private dd field_fb;
    private int field_hb;
    private int field_H;
    private dd[] field_J;
    private int field_y;
    private boolean field_F;
    private String field_G;
    private int field_ab;
    private int field_L;
    private int field_M;
    private int field_S;
    private dd[] field_x;
    private int field_K;
    private int field_V;
    private int field_B;
    private dd field_R;
    private dd field_db;
    private boolean field_cb;
    private boolean field_w;
    private String field_A;
    private dd field_P;
    private int field_X;
    static int[] field_C;
    private fa field_W;
    private dd[] field_z;
    private int field_bb;
    private dd[] field_D;
    private boolean field_I;
    private boolean field_O;
    private dd field_U;
    private int field_gb;
    private int field_N;
    private int field_Y;

    hl(long param0, hl param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final static void g(int param0) {
        if (param0 != 0) {
          return;
        }
        if (db.field_J != null) {
          db.field_J.d();
        }
        if (null != tg.field_i) {
          tg.field_i.d();
        }
    }

    final static int d(byte param0) {
        if (ib.field_k < 2) {
          return 0;
        }
        if (cg.field_y == 0) {
          if (!rl.field_d.b((byte) -115)) {
            return 20;
          }
          if (!rl.field_d.a("commonui", -114)) {
            return 40;
          }
          if (!oa.field_l.b((byte) -111)) {
            return 50;
          }
          if (!oa.field_l.a("commonui", -106)) {
            return 60;
          }
          if (!kc.field_d.b((byte) -122)) {
            return 70;
          }
          if (!kc.field_d.a(-121)) {
            return 80;
          }
        } else {
          if (null != il.field_a) {
            if (!il.field_a.b((byte) -103)) {
              return 14;
            }
            if (!il.field_a.b("", 37)) {
              return 29;
            }
            if (!il.field_a.a("", -128)) {
              return 29;
            }
          }
          if (!rl.field_d.b((byte) -120)) {
            return 43;
          }
          if (!rl.field_d.a("commonui", -99)) {
            return 57;
          }
          if (!oa.field_l.b((byte) -105)) {
            return 71;
          }
          if (!oa.field_l.a("commonui", -95)) {
            return 80;
          }
          if (!kc.field_d.b((byte) -116)) {
            return 82;
          }
          if (!kc.field_d.a(-122)) {
            return 86;
          }
        }
        if (param0 >= -48) {
          return 2;
        }
        return 100;
    }

    public static void b(boolean param0) {
        if (!param0) {
          return;
        }
        field_C = null;
    }

    private final void a(hl param0, boolean param1) {
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        String stackIn_105_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        hl var4 = null;
        try {
          if (param0 != null) {
            if (param0.field_hb >= 0) {
              this.field_hb = param0.field_hb;
            }
            if (param0.field_z != null) {
              this.field_z = param0.field_z;
            }
            if (param0.field_K != 0) {
              this.field_K = param0.field_K;
            }
            if (param0.field_H != 0) {
              this.field_H = param0.field_H;
            }
            if (param0.field_y >= 0) {
              this.field_y = param0.field_y;
            }
            if (!param0.field_F) {
              this.field_F = param0.field_F;
            }
            if (param0.field_w) {
              this.field_w = param0.field_w;
            }
            if (param0.field_X != 0) {
              this.field_X = param0.field_X;
            }
            if (param0.field_J != null) {
              this.field_J = param0.field_J;
            }
            if (param0.field_V != 0) {
              this.field_V = param0.field_V;
            }
            if (param0.field_N != -2147483648) {
              this.field_N = param0.field_N;
            }
            if (param0.field_x != null) {
              this.field_x = param0.field_x;
            }
            if (null != param0.field_R) {
              this.field_R = param0.field_R;
            }
            if (param0.field_M != 0) {
              this.field_M = param0.field_M;
            }
            if (param0.field_S >= 0) {
              this.field_S = param0.field_S;
            }
            if (null != param0.field_db) {
              this.field_db = param0.field_db;
            }
            if (param0.field_D != null) {
              this.field_D = param0.field_D;
            }
            if (param0.field_cb) {
              this.field_cb = param0.field_cb;
            }
            if (param0.field_T != null) {
              this.field_T = param0.field_T;
            }
            if (param0.field_ab != 256) {
              this.field_ab = param0.field_ab;
            }
            if (param0.field_O) {
              this.field_O = param0.field_O;
            }
            if (param0.field_G != null) {
              this.field_G = param0.field_G;
            }
            if (param0.field_L != 0) {
              this.field_L = param0.field_L;
            }
            if (-2147483648 != param0.field_gb) {
              this.field_gb = param0.field_gb;
            }
            if (param0.field_A != null) {
              this.field_A = param0.field_A;
            }
            if (param0.field_Y != -2147483648) {
              this.field_Y = param0.field_Y;
            }
            if (param0.field_bb >= 0) {
              this.field_bb = param0.field_bb;
            }
            if (null != param0.field_P) {
              this.field_P = param0.field_P;
            }
            if (param0.field_fb != null) {
              this.field_fb = param0.field_fb;
            }
            if (null != param0.field_U) {
              this.field_U = param0.field_U;
            }
            if (param0.field_E) {
              this.field_E = param0.field_E;
            }
            if (param0.field_B != -2147483648) {
              this.field_B = param0.field_B;
            }
            if (-2147483648 != param0.field_eb) {
              this.field_eb = param0.field_eb;
            }
            if (param0.field_I) {
              this.field_I = param0.field_I;
            }
            if (param0.field_Q != 0) {
              this.field_Q = param0.field_Q;
            }
            if (param0.field_W != null) {
              this.field_W = param0.field_W;
            }
            if (-2147483648 != param0.field_Z) {
              this.field_Z = param0.field_Z;
            }
          }
          if (!param1) {
            var4 = (hl) null;
            this.a((hl) null, false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_104_0 = var3;
          stackIn_104_1 = new StringBuilder().append("hl.H(");
          if (param0 == null) {
            stackIn_105_2 = "null";
          } else {
            stackIn_105_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_104_0), ((StringBuilder) (Object) stackIn_104_1).append(stackIn_105_2).append(',').append(param1).append(')').toString());
        }
    }

    private hl(long param0, hl param1, int param2, int param3, int param4, int param5, String param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_B = -2147483648;
        this.field_eb = -2147483648;
        this.field_F = true;
        this.field_bb = -1;
        this.field_ab = 256;
        this.field_hb = -1;
        this.field_O = false;
        this.field_y = -1;
        this.field_gb = -2147483648;
        this.field_N = -2147483648;
        this.field_Z = -2147483648;
        this.field_Y = -2147483648;
        this.field_S = -1;
        try {
          this.field_c = param0;
          this.a(param1, true);
          if (param6 != null) {
            this.field_G = param6;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("hl.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_C = new int[10];
    }
}
