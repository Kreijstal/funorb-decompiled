/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rha {
    private StringBuilder field_c;
    static kv[][] field_e;
    static String field_d;
    private int field_b;
    private boolean field_a;

    private final void a(int param0) {
        StringBuilder discarded$0 = this.field_c.append('\n');
        this.field_a = true;
        int var2 = -40 / ((param0 - 26) / 54);
    }

    private final void b(int param0) {
        int var2 = 0;
        StringBuilder discarded$0 = null;
        int var3 = BachelorFridge.field_y;
        for (var2 = 0; this.field_b > var2; var2++) {
          discarded$0 = this.field_c.append(" ");
        }
        if (param0 > 99) {
          this.field_a = false;
          return;
        }
        field_e = (kv[][]) null;
        this.field_a = false;
    }

    final void a(int param0, int param1) {
        int var3 = -60 % ((param0 - 41) / 56);
        if (!this.field_a) {
          this.a(121);
        }
        this.field_b = this.field_b + param1;
    }

    final void a(Object param0, int param1) {
        if (param1 != 4819) {
          return;
        }
        try {
          this.a(true, param0);
          this.a(83);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "rha.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final String a(byte param0) {
        if (param0 > -28) {
          field_d = (String) null;
          return this.field_c.toString();
        }
        return this.field_c.toString();
    }

    final static void a(int param0, boolean param1, int param2) {
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var6Lifetime1;
        int var7Lifetime1;
        var8 = BachelorFridge.field_y;
        if (ur.field_d < 0) {
          return;
        }
        var3 = -135 + param2;
        var4 = param0 - 35;
        var5 = 256;
        if (ur.field_d < 75) {
          var5 = (ur.field_d << 8) / 75;
        }
        if (ur.field_d > 200) {
          var5 = (250 - ur.field_d << 8) / 50;
        }
        bu.a(0, rl.field_r);
        jb.d();
        dg.d();
        tc.b(-8144);
        if (var5 < 256) {
          dg.f(0, 0, dg.field_i, dg.field_c, 0, -var5 + 256);
          db.b(110);
          if (ur.field_d < 150) {
            rl.field_r.f(var3, var4);
          } else {
            nd.field_g.a(var3 + 15, var4 + 10, var5);
          }
          var6 = ur.field_d - 125;
          if (var6 > 0 &&
            var6 < 50) {
            if (var6 < 20) {
              var7 = var6 * 256 / 20;
              rg.field_j.d(var3, var4, var7);
            } else {
              if (30 > var6) {
                rg.field_j.d(var3, var4, 256);
              } else {
                var7 = (-(256 * var6) + 12800) / 20;
                rg.field_j.d(var3, var4, var7);
              }
            }
          }
        } else {
          db.b(110);
          if (ur.field_d >= 150) {
            nd.field_g.a(var3 + 15, var4 + 10, var5);
            var6 = ur.field_d - 125;
            if (var6 > 0 &&
              var6 < 50) {
              sharedTailExit_0: {
                if (var6 < 20) {
                  var7 = var6 * 256 / 20;
                } else {
                  if (30 > var6) {
                    rg.field_j.d(var3, var4, 256);
                    break sharedTailExit_0;
                  }
                  var7 = (-(256 * var6) + 12800) / 20;
                }
                rg.field_j.d(var3, var4, var7);
              }
            }
          } else {
            rl.field_r.f(var3, var4);
            var6 = ur.field_d - 125;
            if (var6 > 0 &&
              var6 < 50) {
              if (var6 < 20) {
                var7 = var6 * 256 / 20;
                rg.field_j.d(var3, var4, var7);
              } else {
                if (30 <= var6) {
                  var7 = (-(256 * var6) + 12800) / 20;
                  rg.field_j.d(var3, var4, var7);
                } else {
                  rg.field_j.d(var3, var4, 256);
                }
              }
            }
          }
        }
        if (param1) {
          rha.c(-72);
        }
        var6Lifetime1 = ur.field_d - 140;
        if (var6Lifetime1 > 0) {
          var7Lifetime1 = 256;
          if (var6Lifetime1 < 20) {
            var7Lifetime1 = 256 * var6Lifetime1 / 20;
          }
          lt.field_a.a(var3 + 15, 10 + var4, var5 * var7Lifetime1 >> 8);
        }
    }

    private final void a(boolean param0, Object param1) {
        StringBuilder discarded$0 = null;
        try {
          if (!param0) {
            this.field_c = (StringBuilder) null;
          }
          if (this.field_a) {
            this.b(101);
          }
          discarded$0 = this.field_c.append(param1.toString());
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "rha.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c(int param0) {
        field_e = (kv[][]) null;
        field_d = null;
        int var1 = -18 % ((40 - param0) / 37);
    }

    final static void a(rk param0, lu param1, byte param2) {
        if (param2 >= -61) {
          field_e = (kv[][]) null;
        }
        if (param0 == null) {
          param1.d(-1, 0);
          return;
        }
        try {
          param0.a((byte) -59, param1);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "rha.G(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    rha() {
        this.field_c = new StringBuilder(1024);
        this.field_a = true;
    }

    static {
    }
}
