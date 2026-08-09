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
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != -21) {
          L0: {
            this.a(-35, true, 82, (byte) 60, (byte) -102);
            if (-21 < (this.a(-88) ^ -1)) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (-21 < (this.a(-88) ^ -1)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
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
        if (param1 > -3) {
            lk.f(-108);
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_7_0 = (String) (param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var4_ref);

            stackIn_10_1 = new StringBuilder().append("lk.M(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(int param0, int param1, String param2, int param3, int param4, int param5) {
        try {
            tj.field_t.a(param2, param1 - -1, 1 + tj.field_t.field_C + param0, (16711422 & param3) >> 1874660609, 4144959 & param3 >> 2005321122);
            if (param5 >= -104) {
                lk.f(68);
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
        vk stackIn_3_0 = null;
        vk stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        vk stackIn_15_0 = null;
        vk stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        long var6;
        vk var8;
        var6 = ((long)param2 << 442828576) - -(long)param0;
        if (param3 == -80) {
          L0: {
            var8 = new vk();
            var8.field_y = param4;
            stackIn_15_0 = (vk) (var8);

            if (!param1) {
              stackIn_16_0 = (vk) ((Object) stackIn_15_0);
              stackIn_16_1 = 0;
              break L0;
            } else {
              stackIn_16_0 = (vk) ((Object) stackIn_15_0);
              stackIn_16_1 = 1;
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
            this.c((byte) -127);
            var8 = new vk();
            var8.field_y = param4;
            stackIn_3_0 = (vk) (var8);

            if (!param1) {
              stackIn_4_0 = (vk) ((Object) stackIn_3_0);
              stackIn_4_1 = 0;
              break L1;
            } else {
              stackIn_4_0 = (vk) ((Object) stackIn_3_0);
              stackIn_4_1 = 1;
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
