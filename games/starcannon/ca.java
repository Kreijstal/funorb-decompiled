/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ca extends rd {
    private boolean field_J;
    private boolean field_x;
    private boolean field_L;
    private int field_z;
    private int field_A;
    private int field_T;
    private hl field_F;
    private String field_S;
    private hl field_ab;
    private int field_U;
    private int field_V;
    private int field_db;
    private hl[] field_v;
    private qe field_B;
    private int field_H;
    private boolean field_I;
    private int field_w;
    private hl field_D;
    private int field_Z;
    private hl[] field_s;
    private String field_u;
    private int field_G;
    private hl field_t;
    private int field_Q;
    private hl[] field_eb;
    private int field_y;
    private hl[] field_bb;
    private int field_W;
    private int field_O;
    static String field_M;
    private int field_E;
    static long field_Y;
    private hl field_cb;
    private boolean field_P;
    private hl[] field_K;
    private int field_N;
    private int field_r;
    private int field_C;
    static String field_X;
    private boolean field_R;

    ca(long param0, ca param1) {
        this(param0, param1, 0, 0, 0, 0, (String) null);
    }

    final static void f(int param0) {
        gd.field_g = false;
        int discarded$5 = se.field_p.j(7909);
        if (param0 != 0) {
            field_Y = -84L;
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_X = null;
        field_M = null;
    }

    private final void a(ca param0, byte param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_96_0 = null;
        StringBuilder stackIn_96_1 = null;
        RuntimeException stackIn_97_0 = null;
        StringBuilder stackIn_97_1 = null;
        RuntimeException stackIn_98_0 = null;
        StringBuilder stackIn_98_1 = null;
        String stackIn_98_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_95_0 = null;
        StringBuilder stackOut_95_1 = null;
        RuntimeException stackOut_97_0 = null;
        StringBuilder stackOut_97_1 = null;
        String stackOut_97_2 = null;
        RuntimeException stackOut_96_0 = null;
        StringBuilder stackOut_96_1 = null;
        String stackOut_96_2 = null;
        try {
          L0: {
            if (param1 <= -95) {
              L1: {
                if (param0 != null) {
                  L2: {
                    if (null != param0.field_v) {
                      this.field_v = param0.field_v;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    if (param0.field_r < 0) {
                      break L3;
                    } else {
                      this.field_r = param0.field_r;
                      break L3;
                    }
                  }
                  L4: {
                    if (param0.field_W == -2147483648) {
                      break L4;
                    } else {
                      this.field_W = param0.field_W;
                      break L4;
                    }
                  }
                  L5: {
                    if (-2147483648 == param0.field_E) {
                      break L5;
                    } else {
                      this.field_E = param0.field_E;
                      break L5;
                    }
                  }
                  L6: {
                    if ((param0.field_z ^ -1) != 2147483647) {
                      this.field_z = param0.field_z;
                      break L6;
                    } else {
                      break L6;
                    }
                  }
                  L7: {
                    if (0 == param0.field_y) {
                      break L7;
                    } else {
                      this.field_y = param0.field_y;
                      break L7;
                    }
                  }
                  L8: {
                    if (256 == param0.field_Z) {
                      break L8;
                    } else {
                      this.field_Z = param0.field_Z;
                      break L8;
                    }
                  }
                  L9: {
                    if (param0.field_x) {
                      break L9;
                    } else {
                      this.field_x = param0.field_x;
                      break L9;
                    }
                  }
                  L10: {
                    if (param0.field_S == null) {
                      break L10;
                    } else {
                      this.field_S = param0.field_S;
                      break L10;
                    }
                  }
                  L11: {
                    if (-1 == (param0.field_db ^ -1)) {
                      break L11;
                    } else {
                      this.field_db = param0.field_db;
                      break L11;
                    }
                  }
                  L12: {
                    if ((param0.field_C ^ -1) == -1) {
                      break L12;
                    } else {
                      this.field_C = param0.field_C;
                      break L12;
                    }
                  }
                  L13: {
                    if (param0.field_J) {
                      this.field_J = param0.field_J;
                      break L13;
                    } else {
                      break L13;
                    }
                  }
                  L14: {
                    if (param0.field_P) {
                      this.field_P = param0.field_P;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  L15: {
                    if (param0.field_u == null) {
                      break L15;
                    } else {
                      this.field_u = param0.field_u;
                      break L15;
                    }
                  }
                  L16: {
                    if ((param0.field_N ^ -1) != 2147483647) {
                      this.field_N = param0.field_N;
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  L17: {
                    if (param0.field_t == null) {
                      break L17;
                    } else {
                      this.field_t = param0.field_t;
                      break L17;
                    }
                  }
                  L18: {
                    if (!param0.field_L) {
                      break L18;
                    } else {
                      this.field_L = param0.field_L;
                      break L18;
                    }
                  }
                  L19: {
                    if (!param0.field_R) {
                      break L19;
                    } else {
                      this.field_R = param0.field_R;
                      break L19;
                    }
                  }
                  L20: {
                    if (null != param0.field_F) {
                      this.field_F = param0.field_F;
                      break L20;
                    } else {
                      break L20;
                    }
                  }
                  L21: {
                    if (param0.field_D != null) {
                      this.field_D = param0.field_D;
                      break L21;
                    } else {
                      break L21;
                    }
                  }
                  L22: {
                    if (-1 != (param0.field_Q ^ -1)) {
                      this.field_Q = param0.field_Q;
                      break L22;
                    } else {
                      break L22;
                    }
                  }
                  L23: {
                    if (param0.field_s != null) {
                      this.field_s = param0.field_s;
                      break L23;
                    } else {
                      break L23;
                    }
                  }
                  L24: {
                    if (param0.field_I) {
                      this.field_I = param0.field_I;
                      break L24;
                    } else {
                      break L24;
                    }
                  }
                  L25: {
                    if (param0.field_w == 0) {
                      break L25;
                    } else {
                      this.field_w = param0.field_w;
                      break L25;
                    }
                  }
                  L26: {
                    if (0 <= param0.field_V) {
                      this.field_V = param0.field_V;
                      break L26;
                    } else {
                      break L26;
                    }
                  }
                  L27: {
                    if (null != param0.field_eb) {
                      this.field_eb = param0.field_eb;
                      break L27;
                    } else {
                      break L27;
                    }
                  }
                  L28: {
                    if (null == param0.field_cb) {
                      break L28;
                    } else {
                      this.field_cb = param0.field_cb;
                      break L28;
                    }
                  }
                  L29: {
                    if (param0.field_O == 0) {
                      break L29;
                    } else {
                      this.field_O = param0.field_O;
                      break L29;
                    }
                  }
                  L30: {
                    if (null != param0.field_ab) {
                      this.field_ab = param0.field_ab;
                      break L30;
                    } else {
                      break L30;
                    }
                  }
                  L31: {
                    if (-1 != (param0.field_T ^ -1)) {
                      this.field_T = param0.field_T;
                      break L31;
                    } else {
                      break L31;
                    }
                  }
                  L32: {
                    if ((param0.field_H ^ -1) == 2147483647) {
                      break L32;
                    } else {
                      this.field_H = param0.field_H;
                      break L32;
                    }
                  }
                  L33: {
                    if (param0.field_A < 0) {
                      break L33;
                    } else {
                      this.field_A = param0.field_A;
                      break L33;
                    }
                  }
                  L34: {
                    if (null == param0.field_bb) {
                      break L34;
                    } else {
                      this.field_bb = param0.field_bb;
                      break L34;
                    }
                  }
                  L35: {
                    if (2147483647 != (param0.field_G ^ -1)) {
                      this.field_G = param0.field_G;
                      break L35;
                    } else {
                      break L35;
                    }
                  }
                  L36: {
                    if (param0.field_K == null) {
                      break L36;
                    } else {
                      this.field_K = param0.field_K;
                      break L36;
                    }
                  }
                  L37: {
                    if ((param0.field_U ^ -1) <= -1) {
                      this.field_U = param0.field_U;
                      break L37;
                    } else {
                      break L37;
                    }
                  }
                  if (param0.field_B == null) {
                    break L1;
                  } else {
                    this.field_B = param0.field_B;
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L38: {
            var3 = decompiledCaughtException;
            stackOut_95_0 = (RuntimeException) (var3);
            stackOut_95_1 = new StringBuilder().append("ca.F(");
            stackIn_97_0 = stackOut_95_0;
            stackIn_97_1 = stackOut_95_1;
            stackIn_96_0 = stackOut_95_0;
            stackIn_96_1 = stackOut_95_1;
            if (param0 == null) {
              stackOut_97_0 = (RuntimeException) ((Object) stackIn_97_0);
              stackOut_97_1 = (StringBuilder) ((Object) stackIn_97_1);
              stackOut_97_2 = "null";
              stackIn_98_0 = stackOut_97_0;
              stackIn_98_1 = stackOut_97_1;
              stackIn_98_2 = stackOut_97_2;
              break L38;
            } else {
              stackOut_96_0 = (RuntimeException) ((Object) stackIn_96_0);
              stackOut_96_1 = (StringBuilder) ((Object) stackIn_96_1);
              stackOut_96_2 = "{...}";
              stackIn_98_0 = stackOut_96_0;
              stackIn_98_1 = stackOut_96_1;
              stackIn_98_2 = stackOut_96_2;
              break L38;
            }
          }
          throw sd.a((Throwable) ((Object) stackIn_98_0), stackIn_98_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private ca(long param0, ca param1, int param2, int param3, int param4, int param5, String param6) {
        this.field_A = -1;
        this.field_z = -2147483648;
        this.field_U = -1;
        this.field_x = true;
        this.field_H = -2147483648;
        this.field_V = -1;
        this.field_L = false;
        this.field_E = -2147483648;
        this.field_W = -2147483648;
        this.field_Z = 256;
        this.field_r = -1;
        this.field_N = -2147483648;
        this.field_G = -2147483648;
        try {
            this.field_b = param0;
            this.a(param1, (byte) -105);
            if (param6 != null) {
                this.field_S = param6;
            }
        } catch (RuntimeException runtimeException) {
            throw sd.a((Throwable) ((Object) runtimeException), "ca.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_M = "Type your email address again to make sure it's correct";
        field_X = "Suggested names: ";
    }
}
