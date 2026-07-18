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

    final static void g() {
        if (!(db.field_J == null)) {
            db.field_J.d();
        }
        if (null != tg.field_i) {
            tg.field_i.d();
        }
    }

    final static int d() {
        if (!(ib.field_k >= 2)) {
            return 0;
        }
        if (cg.field_y != 0) {
            if (null != il.field_a) {
                if (!(il.field_a.b((byte) -103))) {
                    return 14;
                }
                if (!(il.field_a.b("", 37))) {
                    return 29;
                }
                if (!(il.field_a.a("", -128))) {
                    return 29;
                }
            }
            if (!rl.field_d.b((byte) -120)) {
                return 43;
            }
            if (!(rl.field_d.a("commonui", -99))) {
                return 57;
            }
            if (!oa.field_l.b((byte) -105)) {
                return 71;
            }
            if (!oa.field_l.a("commonui", -95)) {
                return 80;
            }
            if (!(kc.field_d.b((byte) -116))) {
                return 82;
            }
            if (kc.field_d.a(-122)) {
                return 100;
            }
            return 86;
        }
        if (!rl.field_d.b((byte) -115)) {
            return 20;
        }
        if (!(rl.field_d.a("commonui", -114))) {
            return 40;
        }
        if (!(oa.field_l.b((byte) -111))) {
            return 50;
        }
        if (!(oa.field_l.a("commonui", -106))) {
            return 60;
        }
        if (!(kc.field_d.b((byte) -122))) {
            return 70;
        }
        if (!(kc.field_d.a(-121))) {
            return 80;
        }
        return 100;
    }

    public static void b() {
        field_C = null;
    }

    private final void a(hl param0, boolean param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        RuntimeException stackIn_103_0 = null;
        StringBuilder stackIn_103_1 = null;
        RuntimeException stackIn_104_0 = null;
        StringBuilder stackIn_104_1 = null;
        RuntimeException stackIn_105_0 = null;
        StringBuilder stackIn_105_1 = null;
        String stackIn_105_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_102_0 = null;
        StringBuilder stackOut_102_1 = null;
        RuntimeException stackOut_104_0 = null;
        StringBuilder stackOut_104_1 = null;
        String stackOut_104_2 = null;
        RuntimeException stackOut_103_0 = null;
        StringBuilder stackOut_103_1 = null;
        String stackOut_103_2 = null;
        try {
          L0: {
            L1: {
              if (param0 != null) {
                L2: {
                  if (param0.field_hb >= 0) {
                    ((hl) this).field_hb = param0.field_hb;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                L3: {
                  if (param0.field_z == null) {
                    break L3;
                  } else {
                    ((hl) this).field_z = param0.field_z;
                    break L3;
                  }
                }
                L4: {
                  if (param0.field_K == 0) {
                    break L4;
                  } else {
                    ((hl) this).field_K = param0.field_K;
                    break L4;
                  }
                }
                L5: {
                  if (param0.field_H == 0) {
                    break L5;
                  } else {
                    ((hl) this).field_H = param0.field_H;
                    break L5;
                  }
                }
                L6: {
                  if (param0.field_y < 0) {
                    break L6;
                  } else {
                    ((hl) this).field_y = param0.field_y;
                    break L6;
                  }
                }
                L7: {
                  if (param0.field_F) {
                    break L7;
                  } else {
                    ((hl) this).field_F = param0.field_F;
                    break L7;
                  }
                }
                L8: {
                  if (!param0.field_w) {
                    break L8;
                  } else {
                    ((hl) this).field_w = param0.field_w;
                    break L8;
                  }
                }
                L9: {
                  if (param0.field_X != 0) {
                    ((hl) this).field_X = param0.field_X;
                    break L9;
                  } else {
                    break L9;
                  }
                }
                L10: {
                  if (param0.field_J != null) {
                    ((hl) this).field_J = param0.field_J;
                    break L10;
                  } else {
                    break L10;
                  }
                }
                L11: {
                  if (param0.field_V != 0) {
                    ((hl) this).field_V = param0.field_V;
                    break L11;
                  } else {
                    break L11;
                  }
                }
                L12: {
                  if (param0.field_N != -2147483648) {
                    ((hl) this).field_N = param0.field_N;
                    break L12;
                  } else {
                    break L12;
                  }
                }
                L13: {
                  if (param0.field_x == null) {
                    break L13;
                  } else {
                    ((hl) this).field_x = param0.field_x;
                    break L13;
                  }
                }
                L14: {
                  if (null != param0.field_R) {
                    ((hl) this).field_R = param0.field_R;
                    break L14;
                  } else {
                    break L14;
                  }
                }
                L15: {
                  if (param0.field_M != 0) {
                    ((hl) this).field_M = param0.field_M;
                    break L15;
                  } else {
                    break L15;
                  }
                }
                L16: {
                  if (param0.field_S < 0) {
                    break L16;
                  } else {
                    ((hl) this).field_S = param0.field_S;
                    break L16;
                  }
                }
                L17: {
                  if (null != param0.field_db) {
                    ((hl) this).field_db = param0.field_db;
                    break L17;
                  } else {
                    break L17;
                  }
                }
                L18: {
                  if (param0.field_D != null) {
                    ((hl) this).field_D = param0.field_D;
                    break L18;
                  } else {
                    break L18;
                  }
                }
                L19: {
                  if (param0.field_cb) {
                    ((hl) this).field_cb = param0.field_cb;
                    break L19;
                  } else {
                    break L19;
                  }
                }
                L20: {
                  if (param0.field_T == null) {
                    break L20;
                  } else {
                    ((hl) this).field_T = param0.field_T;
                    break L20;
                  }
                }
                L21: {
                  if (param0.field_ab == 256) {
                    break L21;
                  } else {
                    ((hl) this).field_ab = param0.field_ab;
                    break L21;
                  }
                }
                L22: {
                  if (param0.field_O) {
                    ((hl) this).field_O = param0.field_O;
                    break L22;
                  } else {
                    break L22;
                  }
                }
                L23: {
                  if (param0.field_G != null) {
                    ((hl) this).field_G = param0.field_G;
                    break L23;
                  } else {
                    break L23;
                  }
                }
                L24: {
                  if (param0.field_L != 0) {
                    ((hl) this).field_L = param0.field_L;
                    break L24;
                  } else {
                    break L24;
                  }
                }
                L25: {
                  if (-2147483648 != param0.field_gb) {
                    ((hl) this).field_gb = param0.field_gb;
                    break L25;
                  } else {
                    break L25;
                  }
                }
                L26: {
                  if (param0.field_A == null) {
                    break L26;
                  } else {
                    ((hl) this).field_A = param0.field_A;
                    break L26;
                  }
                }
                L27: {
                  if (param0.field_Y != -2147483648) {
                    ((hl) this).field_Y = param0.field_Y;
                    break L27;
                  } else {
                    break L27;
                  }
                }
                L28: {
                  if (param0.field_bb < 0) {
                    break L28;
                  } else {
                    ((hl) this).field_bb = param0.field_bb;
                    break L28;
                  }
                }
                L29: {
                  if (null != param0.field_P) {
                    ((hl) this).field_P = param0.field_P;
                    break L29;
                  } else {
                    break L29;
                  }
                }
                L30: {
                  if (param0.field_fb != null) {
                    ((hl) this).field_fb = param0.field_fb;
                    break L30;
                  } else {
                    break L30;
                  }
                }
                L31: {
                  if (null != param0.field_U) {
                    ((hl) this).field_U = param0.field_U;
                    break L31;
                  } else {
                    break L31;
                  }
                }
                L32: {
                  if (param0.field_E) {
                    ((hl) this).field_E = param0.field_E;
                    break L32;
                  } else {
                    break L32;
                  }
                }
                L33: {
                  if (param0.field_B != -2147483648) {
                    ((hl) this).field_B = param0.field_B;
                    break L33;
                  } else {
                    break L33;
                  }
                }
                L34: {
                  if (-2147483648 == param0.field_eb) {
                    break L34;
                  } else {
                    ((hl) this).field_eb = param0.field_eb;
                    break L34;
                  }
                }
                L35: {
                  if (!param0.field_I) {
                    break L35;
                  } else {
                    ((hl) this).field_I = param0.field_I;
                    break L35;
                  }
                }
                L36: {
                  if (param0.field_Q != 0) {
                    ((hl) this).field_Q = param0.field_Q;
                    break L36;
                  } else {
                    break L36;
                  }
                }
                L37: {
                  if (param0.field_W != null) {
                    ((hl) this).field_W = param0.field_W;
                    break L37;
                  } else {
                    break L37;
                  }
                }
                if (-2147483648 != param0.field_Z) {
                  ((hl) this).field_Z = param0.field_Z;
                  break L1;
                } else {
                  break L1;
                }
              } else {
                break L1;
              }
            }
            L38: {
              if (param1) {
                break L38;
              } else {
                var4 = null;
                this.a((hl) null, false);
                break L38;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L39: {
            var3 = decompiledCaughtException;
            stackOut_102_0 = (RuntimeException) var3;
            stackOut_102_1 = new StringBuilder().append("hl.H(");
            stackIn_104_0 = stackOut_102_0;
            stackIn_104_1 = stackOut_102_1;
            stackIn_103_0 = stackOut_102_0;
            stackIn_103_1 = stackOut_102_1;
            if (param0 == null) {
              stackOut_104_0 = (RuntimeException) (Object) stackIn_104_0;
              stackOut_104_1 = (StringBuilder) (Object) stackIn_104_1;
              stackOut_104_2 = "null";
              stackIn_105_0 = stackOut_104_0;
              stackIn_105_1 = stackOut_104_1;
              stackIn_105_2 = stackOut_104_2;
              break L39;
            } else {
              stackOut_103_0 = (RuntimeException) (Object) stackIn_103_0;
              stackOut_103_1 = (StringBuilder) (Object) stackIn_103_1;
              stackOut_103_2 = "{...}";
              stackIn_105_0 = stackOut_103_0;
              stackIn_105_1 = stackOut_103_1;
              stackIn_105_2 = stackOut_103_2;
              break L39;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_105_0, stackIn_105_2 + ',' + param1 + ')');
        }
    }

    private hl(long param0, hl param1, int param2, int param3, int param4, int param5, String param6) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        ((hl) this).field_B = -2147483648;
        ((hl) this).field_eb = -2147483648;
        ((hl) this).field_F = true;
        ((hl) this).field_bb = -1;
        ((hl) this).field_ab = 256;
        ((hl) this).field_hb = -1;
        ((hl) this).field_O = false;
        ((hl) this).field_y = -1;
        ((hl) this).field_gb = -2147483648;
        ((hl) this).field_N = -2147483648;
        ((hl) this).field_Z = -2147483648;
        ((hl) this).field_Y = -2147483648;
        ((hl) this).field_S = -1;
        try {
          L0: {
            L1: {
              ((hl) this).field_c = param0;
              this.a(param1, true);
              if (param6 == null) {
                break L1;
              } else {
                ((hl) this).field_G = param6;
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("hl.<init>(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param6 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw pf.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = new int[10];
    }
}
