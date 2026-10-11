/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ib {
    static String field_d;
    int field_a;
    int field_j;
    static rk field_k;
    private boolean field_n;
    int field_e;
    int field_l;
    int field_b;
    private boolean field_f;
    static oj field_c;
    int field_i;
    static String[] field_h;
    static String field_m;
    static volatile int field_g;

    void a(int param0, int param1, byte param2, int param3, int param4, boolean param5) {
        int var8;
        var8 = stellarshard.field_B;
        if (param2 != 8) {
          return;
        }
        if (!param5) {
          if (param0 == 1) {
            this.a(424, param3);
          } else {
            this.b(param3, -1);
          }
          rl.field_b = oj.field_b;
          return;
        }
        rl.field_b = rl.field_b - 1;
        if (0 < rl.field_b) {
          return;
        }
        if (param0 != 1) {
          this.b(param3, -1);
        } else {
          this.a(424, param3);
        }
        rl.field_b = h.field_b;
    }

    void a(byte param0) {
        int var4 = stellarshard.field_B;
        int var2 = 0;
        int var3 = this.field_b;
        while (this.field_j > var2) {
          this.a(this.field_l == var2 ? true : false, -9, var2, var3);
          var3 = var3 + this.field_a;
          var2++;
        }
        if (param0 != 85) {
          this.field_b = 82;
        }
    }

    int a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var4Lifetime1;
        if (param2 < this.field_e) {
          return -1;
        }
        if (param2 >= this.field_i) {
          return -1;
        }
        if (param1 < this.field_b) {
          return -1;
        }
        if (param0 != 59) {
          field_m = (String) null;
          var4 = (-this.field_b + param1) / this.field_a;
          if (var4 < this.field_j) {
            return var4;
          }
          return -1;
        }
        var4Lifetime1 = (-this.field_b + param1) / this.field_a;
        if (var4Lifetime1 < this.field_j) {
          return var4Lifetime1;
        }
        return -1;
    }

    abstract void a(int param0, int param1);

    abstract void b(int param0, int param1);

    abstract void a(boolean param0, int param1, int param2, int param3);

    public static void a(int param0) {
        field_c = null;
        if (param0 != 0) {
          return;
        }
        field_k = null;
        field_h = null;
        field_m = null;
        field_d = null;
    }

    final void a(boolean param0) {
        int var2;
        int var3;
        var3 = stellarshard.field_B;
        if (gh.field_c != 0) {
          var2 = this.a((byte) 59, oc.field_e, di.field_b);
          this.field_l = var2;
          if (var2 == -1) {
            this.field_f = false;
          } else {
            this.field_f = true;
            this.a(gh.field_c, di.field_b, (byte) 8, var2, oc.field_e - this.field_b - var2 * this.field_a, false);
          }
        } else {
          if (0 == fb.field_n) {
            this.field_f = false;
            if (qc.field_a) {
              var2 = this.a((byte) 59, eb.field_a, ni.field_e);
              if (var2 != -1) {
                this.field_l = var2;
                this.field_n = false;
                if (param0) {
                  return;
                }
                this.a(false);
                return;
              }
              if (!this.field_n) {
                this.field_l = var2;
                this.field_n = false;
                if (param0) {
                  return;
                }
                this.a(false);
                return;
              }
            }
          } else {
            if (!this.field_f) {
              this.field_f = false;
              if (qc.field_a) {
                var2 = this.a((byte) 59, eb.field_a, ni.field_e);
                if (var2 != -1) {
                  this.field_l = var2;
                  this.field_n = false;
                } else {
                  if (!this.field_n) {
                    this.field_l = var2;
                    this.field_n = false;
                  }
                }
              }
            } else {
              var2 = this.field_l;
              if (var2 != -1) {
                this.a(fb.field_n, ni.field_e, (byte) 8, var2, -(var2 * this.field_a) + (eb.field_a - this.field_b), true);
              }
            }
          }
        }
        if (param0) {
          return;
        }
        this.a(false);
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    ib(int param0, int param1, int param2, int param3, int param4) {
        this.field_n = true;
        this.field_l = 0;
        this.field_a = param4;
        this.field_j = param0;
        this.field_i = param2;
        this.field_e = param1;
        this.field_b = param3;
    }

    static {
        field_d = "Service unavailable";
        field_c = new oj();
        field_g = 0;
        field_m = "Type your email address again to make sure it's correct";
        field_h = new String[]{"Connecting to update server", "Verbinde mit Aktualisierungsserver", "Connexion au serveur de mise à jour", "Conectando ao servidor de atualização", "Met updateserver verbinden", "Connecting to update server (untranslated)"};
    }
}
