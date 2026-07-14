/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fb extends cj {
    static int field_I;
    static int[] field_Q;
    static String field_N;
    static String field_C;
    static String field_O;
    static int field_T;
    private ga field_K;
    private ga field_L;
    static int[] field_M;
    private ga field_P;
    static int field_R;
    static bo field_J;
    private boolean field_U;
    static String field_S;

    final static void a(int param0, boolean param1) {
        if (null != field_J) {
            on.g(on.field_b, on.field_e, -on.field_b + on.field_c, on.field_h + -on.field_e);
            field_J.a(param0 ^ 30543, param1);
        }
        if (param0 != 30521) {
            fb.n(81);
        }
    }

    final int l(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        if (param0 > 79) {
          try {
            stackOut_2_0 = Integer.parseInt(((fb) this).field_L.field_q);
            stackIn_3_0 = stackOut_2_0;
          } catch (java.lang.Exception decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
            return stackIn_3_0;
          }
        } else {
          return 33;
        }
        return 0;
    }

    final boolean b(boolean param0) {
        int stackIn_14_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_13_0 = 0;
        L0: {
          if (param0) {
            break L0;
          } else {
            field_Q = null;
            break L0;
          }
        }
        L1: {
          if (((fb) this).field_L.field_q == null) {
            break L1;
          } else {
            if (0 == ((fb) this).field_L.field_q.length()) {
              break L1;
            } else {
              if (((fb) this).field_K.field_q == null) {
                return true;
              } else {
                if (((fb) this).field_K.field_q.length() != 0) {
                  L2: {
                    L3: {
                      if (null == ((fb) this).field_P.field_q) {
                        break L3;
                      } else {
                        if (((fb) this).field_P.field_q.length() == 0) {
                          break L3;
                        } else {
                          stackOut_12_0 = 0;
                          stackIn_14_0 = stackOut_12_0;
                          break L2;
                        }
                      }
                    }
                    stackOut_13_0 = 1;
                    stackIn_14_0 = stackOut_13_0;
                    break L2;
                  }
                  return stackIn_14_0 != 0;
                } else {
                  return true;
                }
              }
            }
          }
        }
        return true;
    }

    final String f(int param0) {
        String var2 = ((fb) this).field_K.f(param0);
        if (!(var2 == null)) {
            return var2;
        }
        if (!((fb) this).field_m) {
            return null;
        }
        return null != ((fb) this).field_u ? ((fb) this).field_u : ((fb) this).field_q;
    }

    final int h(byte param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        try {
          L0: {
            if (param0 == 48) {
              break L0;
            } else {
              ((fb) this).a(-35, -39, 1, -65);
              break L0;
            }
          }
          stackOut_2_0 = -1 + Integer.parseInt(((fb) this).field_K.field_q);
          stackIn_3_0 = stackOut_2_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_3_0;
        }
        return 0;
    }

    private fb(gj param0, boolean param1) {
        super(0, 0, 0, 0, (gj) null);
        ((fb) this).field_L = (ga) (Object) new mr("", (jv) null, 2);
        ((fb) this).field_K = (ga) (Object) new mr("", (jv) null, 2);
        ((fb) this).field_P = (ga) (Object) new mr("", (jv) null, 4);
        ((fb) this).field_P.field_r = param0;
        ((fb) this).field_K.field_r = param0;
        ((fb) this).field_L.field_r = param0;
        ((fb) this).field_U = param1 ? true : false;
        if (((fb) this).field_U) {
            ((fb) this).a(-126, (fd) (Object) ((fb) this).field_K);
            ((fb) this).a(-20, (fd) (Object) ((fb) this).field_L);
        } else {
            ((fb) this).a(-123, (fd) (Object) ((fb) this).field_L);
            ((fb) this).a(-46, (fd) (Object) ((fb) this).field_K);
        }
        ((fb) this).a(-57, (fd) (Object) ((fb) this).field_P);
    }

    final void a(hl param0, int param1) {
        super.a(param0, param1);
        ((fb) this).field_L.field_k = (jv) (Object) param0;
        ((fb) this).field_K.field_k = (jv) (Object) param0;
        ((fb) this).field_P.field_k = (jv) (Object) param0;
    }

    final int m(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        try {
          L0: {
            if (param0 == -1) {
              break L0;
            } else {
              fb.a(-65, false);
              break L0;
            }
          }
          stackOut_2_0 = Integer.parseInt(((fb) this).field_P.field_q);
          stackIn_3_0 = stackOut_2_0;
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          return stackIn_3_0;
        }
        return 0;
    }

    fb(gj param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        ((fb) this).a(param5, 1, param2, param4, param3);
    }

    private final void a(fd param0, String param1, int param2, byte param3, int param4) {
        if (param3 < 86) {
            field_R = 41;
        }
        qo.field_k.d(param1, param4 + param0.field_t - -(param0.field_n >> -1702966015), -5 + param0.field_g + param2, 16777215, -1);
    }

    final static kg[] i(byte param0) {
        int var2 = 0;
        int var3 = Kickabout.field_G;
        kg[] var1 = new kg[io.field_l];
        for (var2 = 0; var2 < io.field_l; var2++) {
            var1[var2] = new kg(kw.field_i, ai.field_J, aq.field_f[var2], fc.field_g[var2], ku.field_c[var2], lo.field_j[var2], pq.field_O[var2], lt.field_a);
        }
        if (param0 <= 78) {
            fb.n(-91);
        }
        tk.h((byte) -118);
        return var1;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1 + 0, param2, param3, param4);
        int var6 = -130 + param3 >> 1267612225;
        if (((fb) this).field_U) {
            ((fb) this).field_K.a(param0, 1, var6, 25, 0);
            ((fb) this).field_L.a(param0, param1 + 0, 45 + var6, 25, 0);
        } else {
            ((fb) this).field_L.a(param0, 1, var6, 25, 0);
            ((fb) this).field_K.a(param0, param1 + 0, var6 - -45, 25, 0);
        }
        ((fb) this).field_P.a(param0, param1, 90 + var6, 40, 0);
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, (int) (char)param1, param2, param3);
        if (param0 != 0) {
            return;
        }
        param3 = param3 + ((fb) this).field_g;
        param2 = param2 + ((fb) this).field_t;
        this.a((fd) (Object) ((fb) this).field_L, ec.field_d, param3, (byte) 117, param2);
        this.a((fd) (Object) ((fb) this).field_K, mo.field_d, param3, (byte) 96, param2);
        this.a((fd) (Object) ((fb) this).field_P, at.field_Ab, param3, (byte) 108, param2);
    }

    public static void n(int param0) {
        field_Q = null;
        field_C = null;
        field_J = null;
        field_N = null;
        if (param0 != -23192) {
            return;
        }
        field_M = null;
        field_O = null;
        field_S = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Q = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_I = 0;
        field_N = "Offer draw";
        field_O = "Outbidded";
        field_M = new int[8192];
        field_C = "Tutorial";
        field_T = 0;
        field_S = "header";
    }
}
