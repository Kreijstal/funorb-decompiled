/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pp extends rj {
    static md field_K;
    static String[] field_F;
    static String field_I;
    private cn field_B;
    private cn field_z;
    boolean field_D;
    static int field_J;
    private cn field_C;
    static String[] field_E;
    private cn field_A;
    private boolean field_G;

    final void a(cn param0, cn param1, cn param2, cn param3, int param4) {
        try {
          this.a(-66, param0);
          this.field_C = param1;
          if (param4 <= 15) {
            field_E = (String[]) null;
          }
          this.field_A = param3;
          this.field_z = param2;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "pp.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final void b(int param0, int param1, int param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = DungeonAssault.field_K;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        if (param1 != 8187) {
          return;
        }
        if (!this.field_D) {
          return;
        }
        if (!this.field_w) {
          this.field_A.h(param0 + this.field_t, this.field_i + param2);
          return;
        }
        int var4 = this != wi.field_ob ? this.field_p : mo.field_a;
        int var5 = var4 - this.field_m >> 2;
        if (var5 > 64) {
          var5 = 64;
        }
        int var6 = var5 + (this.field_p - mo.field_a);
        if (this.field_G) {
          if (wi.field_ob == this) {
            var7 = var5;
            this.field_z.h(this.field_t + param0, param2 + this.field_i);
          } else {
            this.field_B.h(this.field_t + param0, param2 + this.field_i);
            var7 = var6;
            this.field_z.d(param0 + this.field_t, param2 + this.field_i, 4 * var7);
          }
          var8 = (int)((te.c(mo.field_a, 1, 0.015625) + 2.0) * (double)var7);
          if (0 > var8) {
            var8 = 0;
          }
          this.field_C.b(this.field_t + param0, this.field_i + param2, var8);
          return;
        }
        if (this == wi.field_ob) {
          if (wi.field_ob == this) {
            var7Lifetime1 = var5;
            this.field_z.h(this.field_t + param0, param2 + this.field_i);
          } else {
            this.field_B.h(this.field_t + param0, param2 + this.field_i);
            var7Lifetime1 = var6;
            this.field_z.d(param0 + this.field_t, param2 + this.field_i, 4 * var7Lifetime1);
          }
          var8Lifetime1 = (int)((te.c(mo.field_a, 1, 0.015625) + 2.0) * (double)var7Lifetime1);
          if (0 > var8Lifetime1) {
            var8Lifetime1 = 0;
          }
          this.field_C.b(this.field_t + param0, this.field_i + param2, var8Lifetime1);
          return;
        }
        if (var6 <= 0) {
          this.field_B.h(param0 + this.field_t, param2 + this.field_i);
          return;
        }
        if (wi.field_ob == this) {
          var7Lifetime2 = var5;
          this.field_z.h(this.field_t + param0, param2 + this.field_i);
        } else {
          this.field_B.h(this.field_t + param0, param2 + this.field_i);
          var7Lifetime2 = var6;
          this.field_z.d(param0 + this.field_t, param2 + this.field_i, 4 * var7Lifetime2);
        }
        var8Lifetime2 = (int)((te.c(mo.field_a, 1, 0.015625) + 2.0) * (double)var7Lifetime2);
        if (0 > var8Lifetime2) {
          var8Lifetime2 = 0;
        }
        this.field_C.b(this.field_t + param0, this.field_i + param2, var8Lifetime2);
    }

    private pp(cn param0, cn param1, cn param2, cn param3, int param4, int param5, int param6) {
        super(param4, param5, param0.field_y, param0.field_v, param6);
        try {
          this.field_D = true;
          this.field_z = param2;
          this.field_A = param1;
          this.field_B = param0;
          this.field_C = param3;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "pp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2) {
        if (param0) {
          this.field_C = (cn) null;
          throw new RuntimeException("Unsupported");
        }
        throw new RuntimeException("Unsupported");
    }

    pp(cn param0, cn param1, cn param2, cn param3, int param4, int param5) {
        this(param0, param1, param2, param3, param4, param5, 0);
    }

    private final void a(int param0, cn param1) {
        try {
          this.field_z = param1;
          this.field_B = param1;
          if (param0 != -66) {
            this.field_D = true;
          }
          super.a(false, this.field_B.field_y, this.field_B.field_v);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "pp.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void e(int param0) {
        field_F = null;
        field_E = null;
        field_K = null;
        if (param0 <= 42) {
          field_F = (String[]) null;
          field_I = null;
          return;
        }
        field_I = null;
    }

    final static boolean a(int param0, char param1) {
        boolean stackIn_28_0 = false;
        boolean stackIn_50_0 = false;
        boolean stackIn_64_0 = false;
        if (param0 >= -15) {
          field_F = (String[]) null;
          if (param1 < 48) {
            if (param1 >= 65 &&
              param1 <= 90) {
              return true;
            }
            if (97 > param1) {
              return false;
            }
            if (param1 > 122) {
              return false;
            }
            return true;
          }
          if (param1 <= 57) {
            return true;
          }
          if (param1 < 65) {
            if (97 > param1) {
              return false;
            }
            if (param1 <= 122) {
              return true;
            }
            return false;
          }
          if (param1 <= 90) {
            return true;
          }
          stackIn_28_0 = (97 <= param1) && (param1 <= 122);
          return stackIn_28_0;
        }
        if (param1 < 48) {
          if (param1 < 65) {
            if (97 > param1) {
              return false;
            }
            if (param1 > 122) {
              return false;
            }
            return true;
          }
          if (param1 <= 90) {
            return true;
          }
          stackIn_64_0 = (97 <= param1) && (param1 <= 122);
          return stackIn_64_0;
        }
        if (param1 <= 57) {
          return true;
        }
        if (param1 < 65) {
          if (97 > param1) {
            return false;
          }
          if (param1 > 122) {
            return false;
          }
          return true;
        }
        if (param1 <= 90) {
          return true;
        }
        stackIn_50_0 = (97 <= param1) && (param1 <= 122);
        return stackIn_50_0;
    }

    static {
        field_F = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_I = "Go Back";
        field_E = new String[]{"Rooms", "Rooms you have not yet visited are dark. Your raiders will light torches in each new room as they enter."};
        field_J = -1;
    }
}
