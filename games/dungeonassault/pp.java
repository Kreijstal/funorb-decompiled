/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pp extends rj {
    static IntrusiveDeque field_K;
    static String[] field_F;
    static String field_I;
    private RgbSprite field_B;
    private RgbSprite field_z;
    boolean field_D;
    static int field_J;
    private RgbSprite field_C;
    static String[] field_E;
    private RgbSprite field_A;
    private boolean field_G;

    final void a(RgbSprite param0, RgbSprite param1, RgbSprite param2, RgbSprite param3, int param4) {
        try {
          this.a(-66, param0);
          this.field_C = param1;
          if (param4 <= 15) {
            field_E = (String[]) null;
          }
          this.field_A = param3;
          this.field_z = param2;
        } catch (RuntimeException runtimeException) {
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) runtimeException), "pp.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
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
          this.field_A.draw(param0 + this.field_t, this.field_i + param2);
          return;
        }
        int var4 = this != ProgressDialog.field_ob ? this.field_p : mo.field_a;
        int var5 = var4 - this.field_m >> 2;
        if (var5 > 64) {
          var5 = 64;
        }
        int var6 = var5 + (this.field_p - mo.field_a);
        if (this.field_G) {
          if (ProgressDialog.field_ob == this) {
            var7 = var5;
            this.field_z.draw(this.field_t + param0, param2 + this.field_i);
          } else {
            this.field_B.draw(this.field_t + param0, param2 + this.field_i);
            var7 = var6;
            this.field_z.drawWithOpacity(param0 + this.field_t, param2 + this.field_i, 4 * var7);
          }
          var8 = (int)((te.c(mo.field_a, 1, 0.015625) + 2.0) * (double)var7);
          if (0 > var8) {
            var8 = 0;
          }
          this.field_C.drawAdditive(this.field_t + param0, this.field_i + param2, var8);
          return;
        }
        if (this == ProgressDialog.field_ob) {
          if (ProgressDialog.field_ob == this) {
            var7Lifetime1 = var5;
            this.field_z.draw(this.field_t + param0, param2 + this.field_i);
          } else {
            this.field_B.draw(this.field_t + param0, param2 + this.field_i);
            var7Lifetime1 = var6;
            this.field_z.drawWithOpacity(param0 + this.field_t, param2 + this.field_i, 4 * var7Lifetime1);
          }
          var8Lifetime1 = (int)((te.c(mo.field_a, 1, 0.015625) + 2.0) * (double)var7Lifetime1);
          if (0 > var8Lifetime1) {
            var8Lifetime1 = 0;
          }
          this.field_C.drawAdditive(this.field_t + param0, this.field_i + param2, var8Lifetime1);
          return;
        }
        if (var6 <= 0) {
          this.field_B.draw(param0 + this.field_t, param2 + this.field_i);
          return;
        }
        if (ProgressDialog.field_ob == this) {
          var7Lifetime2 = var5;
          this.field_z.draw(this.field_t + param0, param2 + this.field_i);
        } else {
          this.field_B.draw(this.field_t + param0, param2 + this.field_i);
          var7Lifetime2 = var6;
          this.field_z.drawWithOpacity(param0 + this.field_t, param2 + this.field_i, 4 * var7Lifetime2);
        }
        var8Lifetime2 = (int)((te.c(mo.field_a, 1, 0.015625) + 2.0) * (double)var7Lifetime2);
        if (0 > var8Lifetime2) {
          var8Lifetime2 = 0;
        }
        this.field_C.drawAdditive(this.field_t + param0, this.field_i + param2, var8Lifetime2);
    }

    private pp(RgbSprite param0, RgbSprite param1, RgbSprite param2, RgbSprite param3, int param4, int param5, int param6) {
        super(param4, param5, param0.field_y, param0.field_v, param6);
        try {
          this.field_D = true;
          this.field_z = param2;
          this.field_A = param1;
          this.field_B = param0;
          this.field_C = param3;
        } catch (RuntimeException runtimeException) {
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) runtimeException), "pp.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final void a(boolean param0, int param1, int param2) {
        if (param0) {
          this.field_C = (RgbSprite) null;
          throw new RuntimeException("Unsupported");
        }
        throw new RuntimeException("Unsupported");
    }

    pp(RgbSprite param0, RgbSprite param1, RgbSprite param2, RgbSprite param3, int param4, int param5) {
        this(param0, param1, param2, param3, param4, param5, 0);
    }

    private final void a(int param0, RgbSprite param1) {
        try {
          this.field_z = param1;
          this.field_B = param1;
          if (param0 != -66) {
            this.field_D = true;
          }
          super.a(false, this.field_B.field_y, this.field_B.field_v);
        } catch (RuntimeException runtimeException) {
          throw AccountServiceResult.wrapClientException((Throwable) ((Object) runtimeException), "pp.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearDeclaredStaticReferences(int param0) {
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
