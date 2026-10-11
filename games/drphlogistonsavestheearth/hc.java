/*
 * Decompiled by CFR-JS 0.4.0.
 */
class hc extends of {
    private String field_z;
    private boolean field_ab;
    private int field_L;
    static he[][] field_M;
    private int field_R;
    private nh field_kb;
    private String field_fb;
    private int field_eb;
    private int field_jb;
    private int field_Q;
    private int field_I;
    private nh field_J;
    private nh field_F;
    private int field_W;
    private boolean field_y;
    private int field_H;
    private nh[] field_U;
    private nh[] field_bb;
    private int field_gb;
    private boolean field_hb;
    private nh[] field_nb;
    private int field_A;
    private int field_Y;
    private boolean field_mb;
    private nh field_B;
    private int field_N;
    private int field_E;
    private boolean field_lb;
    static nh[] field_K;
    private int field_db;
    private nh[] field_D;
    static int field_G;
    private int field_O;
    private int field_Z;
    private nh field_cb;
    private rf field_T;
    private boolean field_C;
    private int field_X;
    private nh[] field_ib;
    private int field_P;

    private final void a(hc param0, int param1) {
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_99_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 > -63) {
            this.field_U = (nh[]) null;
          }
          if (param0 != null) {
            if (param0.field_y) {
              this.field_y = param0.field_y;
            }
            if (null != param0.field_F) {
              this.field_F = param0.field_F;
            }
            if (-2147483648 != param0.field_gb) {
              this.field_gb = param0.field_gb;
            }
            if (null != param0.field_U) {
              this.field_U = param0.field_U;
            }
            if (param0.field_ab) {
              this.field_ab = param0.field_ab;
            }
            if (param0.field_E != 0) {
              this.field_E = param0.field_E;
            }
            if (null != param0.field_D) {
              this.field_D = param0.field_D;
            }
            if (null != param0.field_B) {
              this.field_B = param0.field_B;
            }
            if (-2147483648 != param0.field_Z) {
              this.field_Z = param0.field_Z;
            }
            if (param0.field_O != 0) {
              this.field_O = param0.field_O;
            }
            if (param0.field_X != 0) {
              this.field_X = param0.field_X;
            }
            if (param0.field_lb) {
              this.field_lb = param0.field_lb;
            }
            if (-2147483648 != param0.field_P) {
              this.field_P = param0.field_P;
            }
            if (null != param0.field_T) {
              this.field_T = param0.field_T;
            }
            if (param0.field_H >= 0) {
              this.field_H = param0.field_H;
            }
            if (-2147483648 != param0.field_db) {
              this.field_db = param0.field_db;
            }
            if (param0.field_ib != null) {
              this.field_ib = param0.field_ib;
            }
            if (null != param0.field_fb) {
              this.field_fb = param0.field_fb;
            }
            if (param0.field_hb) {
              this.field_hb = param0.field_hb;
            }
            if (param0.field_R >= 0) {
              this.field_R = param0.field_R;
            }
            if (param0.field_W != 0) {
              this.field_W = param0.field_W;
            }
            if (param0.field_I != -2147483648) {
              this.field_I = param0.field_I;
            }
            if (param0.field_Q != 0) {
              this.field_Q = param0.field_Q;
            }
            if (param0.field_eb != -2147483648) {
              this.field_eb = param0.field_eb;
            }
            if (param0.field_J != null) {
              this.field_J = param0.field_J;
            }
            if (!param0.field_C) {
              this.field_C = param0.field_C;
            }
            if (param0.field_mb) {
              this.field_mb = param0.field_mb;
            }
            if (0 <= param0.field_Y) {
              this.field_Y = param0.field_Y;
            }
            if (param0.field_jb != 0) {
              this.field_jb = param0.field_jb;
            }
            if (param0.field_kb != null) {
              this.field_kb = param0.field_kb;
            }
            if (null != param0.field_nb) {
              this.field_nb = param0.field_nb;
            }
            if (param0.field_A != 0) {
              this.field_A = param0.field_A;
            }
            if (null != param0.field_bb) {
              this.field_bb = param0.field_bb;
            }
            if (param0.field_cb != null) {
              this.field_cb = param0.field_cb;
            }
            if (256 != param0.field_N) {
              this.field_N = param0.field_N;
            }
            if (param0.field_z != null) {
              this.field_z = param0.field_z;
            }
            if (param0.field_L >= 0) {
              this.field_L = param0.field_L;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_98_0 = var3;
          stackIn_98_1 = new StringBuilder().append("hc.D(");
          if (param0 == null) {
            stackIn_99_2 = "null";
          } else {
            stackIn_99_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_98_0), ((StringBuilder) (Object) stackIn_98_1).append(stackIn_99_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void c(byte param0) {
        if (param0 != -98) {
          return;
        }
        field_M = (he[][]) null;
        field_K = null;
    }

    final static boolean a(boolean param0) {
        if (!param0) {
          field_M = (he[][]) null;
          return true;
        }
        return true;
    }

    final static void b(byte param0) {
        int var1 = 0;
        if (!oh.a(param0 ^ -51)) {
          if (!aj.field_e) {
            if (ri.field_f == null) {
              ri.field_f = ge.a(4, (byte) -109);
            }
            if (ri.field_f.field_l) {
              ej.field_h = ej.field_h & ~ri.field_f.field_j;
              hi.field_j = hi.field_j | ri.field_f.field_j;
              ri.field_f = null;
              aj.field_e = true;
            }
          }
          if (null != vi.field_c) {
            if (vi.field_c == null) {
              vi.field_c = ck.a(0, 5, 1, true);
            }
            var1 = 0;
            if (null != vi.field_c &&
              vi.field_c.field_i) {
              var1++;
              if (vi.field_c.field_j[0] > gf.field_D) {
                gf.field_D = vi.field_c.field_j[0];
              }
            }
            if (var1 == 1) {
              vi.field_c = null;
            }
          }
        }
        if (param0 != -51) {
          field_M = (he[][]) null;
        }
    }

    hc(long param0, hc param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    private hc(long param0, hc param1, int param2, int param3, int param4, int param5, String param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_eb = -2147483648;
        this.field_I = -2147483648;
        this.field_R = -1;
        this.field_gb = -2147483648;
        this.field_Y = -1;
        this.field_lb = false;
        this.field_Z = -2147483648;
        this.field_H = -1;
        this.field_db = -2147483648;
        this.field_L = -1;
        this.field_N = 256;
        this.field_P = -2147483648;
        this.field_C = true;
        try {
          this.field_g = param0;
          this.a(param1, -103);
          if (param6 != null) {
            this.field_fb = param6;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("hc.<init>(").append(param0).append(',');
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
          throw ie.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_M = new he[3][];
        field_G = 1;
    }
}
