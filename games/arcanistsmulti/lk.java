/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class lk {
    tg field_b;
    static vn field_j;
    static String field_l;
    static boolean field_d;
    tg field_g;
    static String field_h;
    tg field_f;
    tg field_m;
    int field_k;
    wk field_c;
    long field_p;
    wk field_e;
    volatile int field_o;
    byte field_a;
    volatile int field_i;
    vk field_n;

    final boolean c(byte param0) {
        int var2 = 68 / ((param0 - -24) / 40);
        return ((lk) this).b((byte) 88) >= 20 ? true : false;
    }

    final boolean b(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -21) {
          L0: {
            vk discarded$18 = ((lk) this).a(-35, true, 82, (byte) 60, (byte) -102);
            if (-21 < ((lk) this).a(-88)) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-21 > ((lk) this).a(-88)) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    abstract void c(int param0);

    abstract void a(byte param0);

    final int a(int param0) {
        int var2 = 52 / ((param0 - -23) / 41);
        return ((lk) this).field_f.b((byte) -123) - -((lk) this).field_m.b((byte) -90);
    }

    final static boolean f(int param0) {
        if (!ef.field_r) {
            return false;
        }
        if ((nj.field_c ^ -1) == param0) {
            return true;
        }
        return false;
    }

    final static boolean a(int param0, byte param1) {
        if (param1 > -3) {
            boolean discarded$7 = lk.f(-108);
            if (!(-1 != param0)) {
                return true;
            }
            return (1 << param0 & k.field_o) != 0 ? true : false;
        }
        if (!(-1 != param0)) {
            return true;
        }
        return (1 << param0 & k.field_o) != 0 ? true : false;
    }

    abstract boolean e(int param0);

    abstract void a(boolean param0, boolean param1, Object param2);

    final static String a(String param0, int param1, int param2, String param3) {
        le var4 = null;
        nf var5 = null;
        int var6 = 0;
        var4 = jb.field_z;
        if (param1 != 10) {
          L0: {
            field_d = false;
            if (var4 != null) {
              break L0;
            } else {
              var4 = r.field_b;
              break L0;
            }
          }
          L1: {
            var5 = var4.field_V;
            var6 = var5.a((byte) 120, param2);
            if (0 == (var6 ^ -1)) {
              break L1;
            } else {
              param0 = param0 + param3 + var5.field_k[var6] + "<br>";
              break L1;
            }
          }
          return param0;
        } else {
          L2: {
            if (var4 != null) {
              break L2;
            } else {
              var4 = r.field_b;
              break L2;
            }
          }
          L3: {
            var5 = var4.field_V;
            var6 = var5.a((byte) 120, param2);
            if (0 == (var6 ^ -1)) {
              break L3;
            } else {
              param0 = param0 + param3 + var5.field_k[var6] + "<br>";
              break L3;
            }
          }
          return param0;
        }
    }

    final static void a(int param0, int param1, String param2, int param3, int param4, int param5) {
        tj.field_t.a(param2, param1 - -1, 1 + tj.field_t.field_C + param0, (16711422 & param3) >> 1874660609, 4144959 & param3 >> 2005321122);
        if (param5 >= -104) {
          boolean discarded$1 = lk.f(68);
          tj.field_t.a(param2, param1, tj.field_t.field_C + (param0 - 1), param3, param3);
          tj.field_t.a(param2, -1 + param1, tj.field_t.field_C + param0, param3, param3);
          tj.field_t.a(param2, param1, param0 + tj.field_t.field_C, param4, -1);
          return;
        } else {
          tj.field_t.a(param2, param1, tj.field_t.field_C + (param0 - 1), param3, param3);
          tj.field_t.a(param2, -1 + param1, tj.field_t.field_C + param0, param3, param3);
          tj.field_t.a(param2, param1, param0 + tj.field_t.field_C, param4, -1);
          return;
        }
    }

    public static void d(int param0) {
        field_h = null;
        field_l = null;
        field_j = null;
        if (param0 != 11959) {
            field_l = null;
        }
    }

    final vk a(int param0, boolean param1, int param2, byte param3, byte param4) {
        long var6 = 0L;
        vk var8 = null;
        vk stackIn_2_0 = null;
        vk stackIn_3_0 = null;
        vk stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        vk stackIn_14_0 = null;
        vk stackIn_15_0 = null;
        vk stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        vk stackOut_13_0 = null;
        vk stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        vk stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        vk stackOut_1_0 = null;
        vk stackOut_3_0 = null;
        int stackOut_3_1 = 0;
        vk stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        var6 = ((long)param2 << 442828576) - -(long)param0;
        if (param3 == -80) {
          L0: {
            var8 = new vk();
            var8.field_y = param4;
            stackOut_13_0 = (vk) var8;
            stackIn_15_0 = stackOut_13_0;
            stackIn_14_0 = stackOut_13_0;
            if (!param1) {
              stackOut_15_0 = (vk) (Object) stackIn_15_0;
              stackOut_15_1 = 0;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              break L0;
            } else {
              stackOut_14_0 = (vk) (Object) stackIn_14_0;
              stackOut_14_1 = 1;
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              break L0;
            }
          }
          ((vk) (Object) stackIn_16_0).field_q = stackIn_16_1 != 0;
          var8.field_k = var6;
          if (!param1) {
            if (((lk) this).a(-72) >= 20) {
              throw new RuntimeException();
            } else {
              ((lk) this).field_f.a((tf) (Object) var8, param3 ^ -15963);
              return var8;
            }
          } else {
            if (-21 < (((lk) this).b((byte) 88) ^ -1)) {
              ((lk) this).field_b.a((tf) (Object) var8, 15893);
              return var8;
            } else {
              throw new RuntimeException();
            }
          }
        } else {
          L1: {
            boolean discarded$1 = ((lk) this).c((byte) -127);
            var8 = new vk();
            var8.field_y = param4;
            stackOut_1_0 = (vk) var8;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
              stackOut_3_0 = (vk) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (vk) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          ((vk) (Object) stackIn_4_0).field_q = stackIn_4_1 != 0;
          var8.field_k = var6;
          if (!param1) {
            if (((lk) this).a(-72) >= 20) {
              throw new RuntimeException();
            } else {
              ((lk) this).field_f.a((tf) (Object) var8, param3 ^ -15963);
              return var8;
            }
          } else {
            if (-21 < (((lk) this).b((byte) 88) ^ -1)) {
              ((lk) this).field_b.a((tf) (Object) var8, 15893);
              return var8;
            } else {
              throw new RuntimeException();
            }
          }
        }
    }

    final int b(byte param0) {
        if (param0 != 88) {
          ((lk) this).field_p = -111L;
          return ((lk) this).field_b.b((byte) -112) + ((lk) this).field_g.b((byte) -68);
        } else {
          return ((lk) this).field_b.b((byte) -112) + ((lk) this).field_g.b((byte) -68);
        }
    }

    lk() {
        ((lk) this).field_b = new tg();
        ((lk) this).field_g = new tg();
        ((lk) this).field_f = new tg();
        ((lk) this).field_m = new tg();
        ((lk) this).field_c = new wk(6);
        ((lk) this).field_i = 0;
        ((lk) this).field_a = (byte) 0;
        ((lk) this).field_o = 0;
        ((lk) this).field_e = new wk(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "Show private chat from my friends and opponents";
        field_j = new vn();
        field_h = "Quick Chat lobby";
    }
}
