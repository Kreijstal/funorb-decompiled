/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qra {
    static int[] field_e;
    private boolean field_b;
    static String field_g;
    static float field_d;
    ff field_c;
    private boolean field_i;
    qh field_h;
    static d field_l;
    static int field_j;
    private fna field_k;
    v field_f;
    private ko field_a;

    public static void b(int param0) {
        if (param0 == 96) {
          field_l = null;
          field_e = null;
          field_g = null;
          return;
        }
        qra.b(-96);
        field_l = null;
        field_e = null;
        field_g = null;
    }

    abstract void a(int param0, boolean param1);

    abstract boolean e(int param0);

    final static void a(la param0, int param1, ff param2) {
        if (param1 != 100) {
          field_e = (int[]) null;
        }
        if (vpa.a(84) ||
          param2.k(param1 - 25419)) {
          return;
        }
        if (!(0 <= param0.q((byte) -82))) {
          return;
        }
        try {
          ql.field_k.k(96, -2988);
          ql.field_k.f(-1477662136, param0.q((byte) -82));
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "qra.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    abstract void b(int param0, boolean param1);

    abstract boolean a(char param0, int param1, int param2);

    final static int a(int param0) {
        if (param0 != 96) {
          return 112;
        }
        return ej.field_a.f(param0 ^ -2147483552);
    }

    private final void a(byte param0) {
        this.field_k = new fna(0, wba.field_q[0], 0, false);
        if (param0 == -78) {
          this.field_k.field_b = this.field_k.e(-163) / 2 + 10;
          this.field_k.field_i = -25 + koa.b(0);
          this.field_k.a(false);
          this.field_a = new ko(1);
          return;
        }
        this.a((byte) 97);
        this.field_k.field_b = this.field_k.e(-163) / 2 + 10;
        this.field_k.field_i = -25 + koa.b(0);
        this.field_k.a(false);
        this.field_a = new ko(1);
    }

    final void c(int param0) {
        boolean stackIn_4_1 = false;
        int stackIn_14_0 = 0;
        ko stackIn_16_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_19_2 = 0;
        int stackIn_20_3 = 0;
        boolean stackIn_27_0 = false;
        int stackIn_28_1 = 0;
        boolean stackIn_35_1 = false;
        int stackIn_45_0 = 0;
        ko stackIn_47_0 = null;
        int stackIn_48_1 = 0;
        int stackIn_50_2 = 0;
        int stackIn_51_3 = 0;
        boolean stackIn_58_0 = false;
        int stackIn_59_1 = 0;
        int stackIn_67_0 = 0;
        boolean stackIn_70_1 = false;
        int stackIn_79_0 = 0;
        ko stackIn_81_0 = null;
        int stackIn_82_1 = 0;
        int stackIn_84_2 = 0;
        int stackIn_85_3 = 0;
        boolean stackIn_92_0 = false;
        int stackIn_93_1 = 0;
        int var2;
        int var3;
        int var2Lifetime1;
        int var2Lifetime2;
        int var3Lifetime1;
        int var3Lifetime2;
        this.field_i = true;
        if (this.field_k.field_b - 80 > jba.field_j) {
          var2 = 0;
          stackIn_4_1 = (var2 != 0);
          this.field_b = stackIn_4_1;
          if (this.field_k.field_b <= jm.field_m) {
            if (jm.field_m < 100 + this.field_k.field_b) {
              if (lba.field_p >= this.field_k.field_i) {
                stackIn_14_0 = (20 + this.field_k.field_i > lba.field_p) ? 1 : 0;
              } else {
                stackIn_14_0 = 0;
              }
            } else {
              stackIn_14_0 = 0;
            }
          } else {
            stackIn_14_0 = 0;
          }
          var3 = stackIn_14_0;
          stackIn_16_0 = this.field_a;
          stackIn_17_1 = (var3 != 0) ? 0 : -1;
          stackIn_19_2 = 85;
          stackIn_20_3 = (var2 != 0) ? 0 : -1;
          ((ko) (Object) stackIn_16_0).a(stackIn_17_1, stackIn_19_2, stackIn_20_3);
          this.field_k.a(true, this.field_b, true, 6);
          if (param0 != 7) {
            return;
          }
          if (var2 == 0) {
            return;
          }
          if (0 == hf.field_b) {
            return;
          }
          stackIn_27_0 = false;
          stackIn_28_1 = (!this.field_h.field_D) ? 9 : 7;
          ira.a(stackIn_27_0, stackIn_28_1, (byte) 97);
          return;
        }
        if (this.field_k.field_b + 80 <= jba.field_j) {
          var2Lifetime1 = 0;
          stackIn_35_1 = (var2Lifetime1 != 0);
          this.field_b = stackIn_35_1;
          if (this.field_k.field_b <= jm.field_m) {
            if (jm.field_m < 100 + this.field_k.field_b) {
              if (lba.field_p >= this.field_k.field_i) {
                stackIn_45_0 = (20 + this.field_k.field_i > lba.field_p) ? 1 : 0;
              } else {
                stackIn_45_0 = 0;
              }
            } else {
              stackIn_45_0 = 0;
            }
          } else {
            stackIn_45_0 = 0;
          }
          var3Lifetime1 = stackIn_45_0;
          stackIn_47_0 = this.field_a;
          stackIn_48_1 = (var3Lifetime1 != 0) ? 0 : -1;
          stackIn_50_2 = 85;
          stackIn_51_3 = (var2Lifetime1 != 0) ? 0 : -1;
          ((ko) (Object) stackIn_47_0).a(stackIn_48_1, stackIn_50_2, stackIn_51_3);
          this.field_k.a(true, this.field_b, true, 6);
          if (param0 != 7) {
            return;
          }
          if (var2Lifetime1 == 0) {
            return;
          }
          if (0 == hf.field_b) {
            return;
          }
          stackIn_58_0 = false;
          stackIn_59_1 = (!this.field_h.field_D) ? 9 : 7;
          ira.a(stackIn_58_0, stackIn_59_1, (byte) 97);
          return;
        }
        if (-25 + this.field_k.field_i <= sta.field_B) {
          stackIn_67_0 = (this.field_k.field_i + 25 <= sta.field_B) ? 0 : 1;
        } else {
          stackIn_67_0 = 0;
        }
        var2Lifetime2 = stackIn_67_0;
        stackIn_70_1 = (var2Lifetime2 != 0);
        this.field_b = stackIn_70_1;
        if (this.field_k.field_b <= jm.field_m) {
          if (jm.field_m < 100 + this.field_k.field_b) {
            if (lba.field_p >= this.field_k.field_i) {
              stackIn_79_0 = (20 + this.field_k.field_i <= lba.field_p) ? 0 : 1;
            } else {
              stackIn_79_0 = 0;
            }
          } else {
            stackIn_79_0 = 0;
          }
        } else {
          stackIn_79_0 = 0;
        }
        var3Lifetime2 = stackIn_79_0;
        stackIn_81_0 = this.field_a;
        stackIn_82_1 = (var3Lifetime2 != 0) ? 0 : -1;
        stackIn_84_2 = 85;
        stackIn_85_3 = (var2Lifetime2 != 0) ? 0 : -1;
        ((ko) (Object) stackIn_81_0).a(stackIn_82_1, stackIn_84_2, stackIn_85_3);
        this.field_k.a(true, this.field_b, true, 6);
        if (param0 != 7) {
          return;
        }
        if (var2Lifetime2 == 0) {
          return;
        }
        if (0 == hf.field_b) {
          return;
        }
        stackIn_92_0 = false;
        stackIn_93_1 = (!this.field_h.field_D) ? 9 : 7;
        ira.a(stackIn_92_0, stackIn_93_1, (byte) 97);
        return;
    }

    qra(qh param0, v param1) {
        try {
          this.field_c = param0.field_k;
          this.field_f = param1;
          this.field_h = param0;
          this.a((byte) -78);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "qra.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void d(int param0) {
        if (param0 != -27142) {
          return;
        }
        this.field_k.a(false, this.field_i, param0 + 27143, this.field_b);
    }

    static {
        field_g = "<%0> is not a member, and cannot play with the current options.";
    }
}
