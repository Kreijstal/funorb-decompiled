/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ih extends fd {
    private int field_W;
    private boolean field_x;
    private tg[] field_I;
    private boolean field_N;
    private tg field_t;
    private tg[] field_C;
    private int field_H;
    private int field_G;
    private boolean field_eb;
    private int field_L;
    static bc field_w;
    static String field_P;
    private int field_M;
    private int field_hb;
    private tg[] field_S;
    static int[] field_db;
    private tg field_F;
    private tg[] field_ab;
    private int field_r;
    private tg[] field_U;
    private int field_E;
    static oj field_Q;
    private int field_y;
    private String field_z;
    private int field_R;
    private int field_O;
    static int field_D;
    private String field_fb;
    static int[] field_V;
    private int field_J;
    private tg field_Z;
    static gk field_p;
    private boolean field_q;
    private boolean field_Y;
    static int field_X;
    private int field_A;
    private int field_ib;
    private int field_B;
    private int field_K;
    private boolean field_bb;
    private int field_s;
    static tg[] field_T;
    private int field_v;
    private tg field_gb;
    private tj field_u;
    private tg field_cb;

    public static void d(byte param0) {
        field_T = null;
        field_Q = null;
        field_V = null;
        field_P = null;
        field_p = null;
        if (param0 != -58) {
          ih.d((byte) -127);
        }
        field_w = null;
        field_db = null;
    }

    final static void a(int param0, int param1) {
        ai var2 = null;
        int var3 = 0;
        ke var4 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var3 = Bounce.field_N;
        try {
          var4 = (ke) (uk.field_d.a((byte) -107));
          while (var4 != null) {
            qh.a(var4, param0, -22762);
            var4 = (ke) (uk.field_d.d((byte) -127));
          }
          if (param1 != -1) {
            field_X = -78;
          }
          var2 = ne.field_r.a((byte) -59);
          while (var2 != null) {
            ea.a(2, param0);
            var2 = ne.field_r.d((byte) -24);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var2_ref), "ih.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static String a(boolean param0, CharSequence param1, boolean param2) {
        int var6 = 0;
        String stackIn_3_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_18_0 = null;
        String stackIn_28_0 = null;
        String stackIn_35_0 = null;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        String stackIn_39_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        String var4 = null;
        int var5 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Bounce.field_N;
        try {
          if (param1 == null) {
            stackIn_3_0 = ub.field_e;
            return stackIn_3_0;
          }
          var3_int = param1.length();
          if (1 <= var3_int &&
            12 >= var3_int) {
            var4 = ce.a(param1, 0);
            if (var4 != null &&
              var4.length() >= 1) {
              if (!f.a(var4.charAt(0), param2) &&
                !f.a(var4.charAt(-1 + var4.length()), false)) {
                var5 = 0;
                for (var6 = 0; param1.length() > var6; var6++) {
                  var7 = param1.charAt(var6);
                  if (!f.a((char) var7, false)) {
                    var5 = 0;
                  } else {
                    var5++;
                  }
                  if (var5 >= 2 &&
                    !param0) {
                    stackIn_28_0 = sg.field_c;
                    return stackIn_28_0;
                  }
                }
                if (param2) {
                  ih.d((byte) -38);
                }
                if (var5 <= 0) {
                  return null;
                }
                stackIn_35_0 = hi.field_a;
                return stackIn_35_0;
              }
              stackIn_18_0 = hi.field_a;
              return stackIn_18_0;
            }
            stackIn_13_0 = ub.field_e;
            return stackIn_13_0;
          }
          stackIn_8_0 = ub.field_e;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_38_0 = var3;
          stackIn_38_1 = new StringBuilder().append("ih.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_39_2 = "null";
          } else {
            stackIn_39_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(int param0, ih param1) {
        RuntimeException stackIn_95_0 = null;
        StringBuilder stackIn_95_1 = null;
        String stackIn_96_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 != null) {
            if (256 != param1.field_K) {
              this.field_K = param1.field_K;
            }
            if (null != param1.field_cb) {
              this.field_cb = param1.field_cb;
            }
            if (param1.field_x) {
              this.field_x = param1.field_x;
            }
            if (param1.field_R != 0) {
              this.field_R = param1.field_R;
            }
            if (param1.field_hb >= 0) {
              this.field_hb = param1.field_hb;
            }
            if (0 != param1.field_r) {
              this.field_r = param1.field_r;
            }
            if (param1.field_eb) {
              this.field_eb = param1.field_eb;
            }
            if (param1.field_A != -2147483648) {
              this.field_A = param1.field_A;
            }
            if (param1.field_M != 0) {
              this.field_M = param1.field_M;
            }
            if (!param1.field_bb) {
              this.field_bb = param1.field_bb;
            }
            if (-2147483648 != param1.field_W) {
              this.field_W = param1.field_W;
            }
            if (-2147483648 != param1.field_ib) {
              this.field_ib = param1.field_ib;
            }
            if (param1.field_B != 0) {
              this.field_B = param1.field_B;
            }
            if (param1.field_E != -2147483648) {
              this.field_E = param1.field_E;
            }
            if (-2147483648 != param1.field_y) {
              this.field_y = param1.field_y;
            }
            if (param1.field_U != null) {
              this.field_U = param1.field_U;
            }
            if (param1.field_s >= 0) {
              this.field_s = param1.field_s;
            }
            if (param1.field_ab != null) {
              this.field_ab = param1.field_ab;
            }
            if (null != param1.field_u) {
              this.field_u = param1.field_u;
            }
            if (param1.field_F != null) {
              this.field_F = param1.field_F;
            }
            if (null != param1.field_C) {
              this.field_C = param1.field_C;
            }
            if (param1.field_z != null) {
              this.field_z = param1.field_z;
            }
            if (null != param1.field_t) {
              this.field_t = param1.field_t;
            }
            if (null != param1.field_fb) {
              this.field_fb = param1.field_fb;
            }
            if (param1.field_q) {
              this.field_q = param1.field_q;
            }
            if (null != param1.field_gb) {
              this.field_gb = param1.field_gb;
            }
            if (0 != param1.field_J) {
              this.field_J = param1.field_J;
            }
            if (param1.field_v >= 0) {
              this.field_v = param1.field_v;
            }
            if (param1.field_N) {
              this.field_N = param1.field_N;
            }
            if (param1.field_L != 0) {
              this.field_L = param1.field_L;
            }
            if (null != param1.field_I) {
              this.field_I = param1.field_I;
            }
            if (param1.field_S != null) {
              this.field_S = param1.field_S;
            }
            if (param1.field_Y) {
              this.field_Y = param1.field_Y;
            }
            if (param1.field_Z != null) {
              this.field_Z = param1.field_Z;
            }
            if (param1.field_G >= 0) {
              this.field_G = param1.field_G;
            }
            if (param1.field_O != -2147483648) {
              this.field_O = param1.field_O;
            }
            if (param1.field_H != 0) {
              this.field_H = param1.field_H;
            }
          }
          if (param0 != -1) {
            this.field_x = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_95_0 = var3;
          stackIn_95_1 = new StringBuilder().append("ih.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_96_2 = "null";
          } else {
            stackIn_96_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_95_0), ((StringBuilder) (Object) stackIn_95_1).append(stackIn_96_2).append(')').toString());
        }
    }

    ih(long param0, ih param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    private ih(long param0, ih param1, int param2, int param3, int param4, int param5, String param6) {
        this.field_W = -2147483648;
        this.field_hb = -1;
        this.field_G = -1;
        this.field_O = -2147483648;
        this.field_E = -2147483648;
        this.field_y = -2147483648;
        this.field_Y = false;
        this.field_bb = true;
        this.field_v = -1;
        this.field_K = 256;
        this.field_ib = -2147483648;
        this.field_s = -1;
        this.field_A = -2147483648;
        try {
          this.field_d = param0;
          this.a(-1, param1);
          if (param6 != null) {
            this.field_fb = param6;
          }
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "ih.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_P = "Unfortunately you are not eligible to create an account.";
        field_db = new int[8192];
    }
}
