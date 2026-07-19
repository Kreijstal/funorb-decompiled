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
        return this.b((byte) 88) >= 20 ? true : false;
    }

    final boolean b(int param0) {
        vk discarded$18 = null;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != -21) {
          L0: {
            discarded$18 = this.a(-35, true, 82, (byte) 60, (byte) -102);
            if (-21 < (this.a(-88) ^ -1)) {
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
            if (-21 < (this.a(-88) ^ -1)) {
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
        return this.field_f.b((byte) -123) - -this.field_m.b((byte) -90);
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
        boolean discarded$7 = false;
        if (param1 > -3) {
            discarded$7 = lk.f(-108);
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
        RuntimeException var4_ref = null;
        nf var5 = null;
        int var6 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_6_0 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              var4 = jb.field_z;
              if (param1 == 10) {
                break L1;
              } else {
                field_d = false;
                break L1;
              }
            }
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
            stackOut_6_0 = (String) (param0);
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var4_ref);
            stackOut_8_1 = new StringBuilder().append("lk.M(");
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param0 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L4;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L4;
            }
          }
          L5: {
            stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param3 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L5;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(int param0, int param1, String param2, int param3, int param4, int param5) {
        boolean discarded$0 = false;
        try {
            tj.field_t.a(param2, param1 - -1, 1 + tj.field_t.field_C + param0, (16711422 & param3) >> 1874660609, 4144959 & param3 >> 2005321122);
            if (param5 >= -104) {
                discarded$0 = lk.f(68);
            }
            tj.field_t.a(param2, param1, tj.field_t.field_C + (param0 - 1), param3, param3);
            tj.field_t.a(param2, -1 + param1, tj.field_t.field_C + param0, param3, param3);
            tj.field_t.a(param2, param1, param0 + tj.field_t.field_C, param4, -1);
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "lk.R(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void d(int param0) {
        field_h = null;
        field_l = null;
        field_j = null;
        if (param0 != 11959) {
            field_l = (String) null;
        }
    }

    final vk a(int param0, boolean param1, int param2, byte param3, byte param4) {
        boolean discarded$1 = false;
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
            stackOut_13_0 = (vk) (var8);
            stackIn_15_0 = stackOut_13_0;
            stackIn_14_0 = stackOut_13_0;
            if (!param1) {
              stackOut_15_0 = (vk) ((Object) stackIn_15_0);
              stackOut_15_1 = 0;
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              break L0;
            } else {
              stackOut_14_0 = (vk) ((Object) stackIn_14_0);
              stackOut_14_1 = 1;
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              break L0;
            }
          }
          stackIn_16_0.field_q = stackIn_16_1 != 0;
          var8.field_k = var6;
          if (!param1) {
            if (this.a(-72) >= 20) {
              throw new RuntimeException();
            } else {
              this.field_f.a(var8, param3 ^ -15963);
              return var8;
            }
          } else {
            if (-21 < (this.b((byte) 88) ^ -1)) {
              this.field_b.a(var8, 15893);
              return var8;
            } else {
              throw new RuntimeException();
            }
          }
        } else {
          L1: {
            discarded$1 = this.c((byte) -127);
            var8 = new vk();
            var8.field_y = param4;
            stackOut_1_0 = (vk) (var8);
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (!param1) {
              stackOut_3_0 = (vk) ((Object) stackIn_3_0);
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L1;
            } else {
              stackOut_2_0 = (vk) ((Object) stackIn_2_0);
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L1;
            }
          }
          stackIn_4_0.field_q = stackIn_4_1 != 0;
          var8.field_k = var6;
          if (!param1) {
            if (this.a(-72) >= 20) {
              throw new RuntimeException();
            } else {
              this.field_f.a(var8, param3 ^ -15963);
              return var8;
            }
          } else {
            if (-21 < (this.b((byte) 88) ^ -1)) {
              this.field_b.a(var8, 15893);
              return var8;
            } else {
              throw new RuntimeException();
            }
          }
        }
    }

    final int b(byte param0) {
        if (param0 != 88) {
          this.field_p = -111L;
          return this.field_b.b((byte) -112) + this.field_g.b((byte) -68);
        } else {
          return this.field_b.b((byte) -112) + this.field_g.b((byte) -68);
        }
    }

    lk() {
        this.field_b = new tg();
        this.field_g = new tg();
        this.field_f = new tg();
        this.field_m = new tg();
        this.field_c = new wk(6);
        this.field_i = 0;
        this.field_a = (byte) 0;
        this.field_o = 0;
        this.field_e = new wk(10);
    }

    static {
        field_l = "Show private chat from my friends and opponents";
        field_j = new vn();
        field_h = "Quick Chat lobby";
    }
}
