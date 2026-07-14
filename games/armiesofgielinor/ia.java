/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia {
    private int field_i;
    private int[] field_h;
    private boolean field_b;
    private tu field_a;
    private int field_c;
    private String field_d;
    private wk[] field_f;
    static int field_g;
    private int field_j;
    private int field_e;

    final void a(int param0) {
        qn.f(((ia) this).field_e, ((ia) this).field_i, ((ia) this).field_j, ((ia) this).field_c, 7829367);
        i.a(((ia) this).field_f, ((ia) this).field_c, ((ia) this).field_e, (byte) -47, ((ia) this).field_i, ((ia) this).field_j);
        if (param0 < 24) {
          ((ia) this).field_f = null;
          this.b(-11727);
          return;
        } else {
          this.b(-11727);
          return;
        }
    }

    final int a(byte param0) {
        if (param0 >= -10) {
            return -87;
        }
        return ((ia) this).field_c;
    }

    final static String a(String param0, char param1, int param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        StringBuilder var13 = null;
        StringBuilder var14 = null;
        var11 = ArmiesOfGielinor.field_M ? 1 : 0;
        var4 = param0.length();
        var5 = param3.length();
        var6 = var4;
        var7 = var5 - 1;
        if (param2 == 3) {
          if (0 == var7) {
            var13 = new StringBuilder(var6);
            var9 = 0;
            L0: while (true) {
              var10 = param0.indexOf((int) param1, var9);
              if (var10 < 0) {
                StringBuilder discarded$13 = var13.append(param0.substring(var9));
                return var13.toString();
              } else {
                StringBuilder discarded$14 = var13.append(param0.substring(var9, var10));
                var9 = 1 + var10;
                StringBuilder discarded$15 = var13.append(param3);
                continue L0;
              }
            }
          } else {
            var8_int = 0;
            L1: while (true) {
              var8_int = param0.indexOf((int) param1, var8_int);
              if (var8_int >= 0) {
                var6 = var6 + var7;
                var8_int++;
                continue L1;
              } else {
                var14 = new StringBuilder(var6);
                var8 = var14;
                var9 = 0;
                L2: while (true) {
                  var10 = param0.indexOf((int) param1, var9);
                  if (var10 < 0) {
                    StringBuilder discarded$16 = var14.append(param0.substring(var9));
                    return var14.toString();
                  } else {
                    StringBuilder discarded$17 = var14.append(param0.substring(var9, var10));
                    var9 = 1 + var10;
                    StringBuilder discarded$18 = var14.append(param3);
                    continue L2;
                  }
                }
              }
            }
          }
        } else {
          var12 = null;
          String discarded$19 = ia.a((String) null, '(', -2, (String) null);
          if (0 == var7) {
            var8 = new StringBuilder(var6);
            var9 = 0;
            L3: while (true) {
              var10 = param0.indexOf((int) param1, var9);
              if (var10 < 0) {
                StringBuilder discarded$20 = var8.append(param0.substring(var9));
                return var8.toString();
              } else {
                StringBuilder discarded$21 = var8.append(param0.substring(var9, var10));
                var9 = 1 + var10;
                StringBuilder discarded$22 = var8.append(param3);
                continue L3;
              }
            }
          } else {
            var8_int = 0;
            L4: while (true) {
              var8_int = param0.indexOf((int) param1, var8_int);
              if (var8_int >= 0) {
                var6 = var6 + var7;
                var8_int++;
                continue L4;
              } else {
                var8 = new StringBuilder(var6);
                var9 = 0;
                L5: while (true) {
                  var10 = param0.indexOf((int) param1, var9);
                  if (var10 < 0) {
                    StringBuilder discarded$23 = var8.append(param0.substring(var9));
                    return var8.toString();
                  } else {
                    StringBuilder discarded$24 = var8.append(param0.substring(var9, var10));
                    var9 = 1 + var10;
                    StringBuilder discarded$25 = var8.append(param3);
                    continue L5;
                  }
                }
              }
            }
          }
        }
    }

    private final void e(int param0) {
        ((ia) this).field_b = false;
        if (param0 < 12) {
            Object var3 = null;
            this.a((byte) -122, (String) null);
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var2 = ((ia) this).field_f[3].field_A;
        var3 = ((ia) this).field_a.a(' ');
        var4 = var3 + (var2 + ((ia) this).field_e);
        var5 = ((ia) this).field_f[1].field_x;
        var6 = 2;
        var7 = ((ia) this).field_a.field_H;
        var8 = var5 + ((ia) this).field_i - (-var6 + -var7);
        if (param0 != -11727) {
          return;
        } else {
          L0: {
            var9 = ((ia) this).field_h[0];
            if (((ia) this).field_b) {
              var9 = ((ia) this).field_h[1];
              break L0;
            } else {
              break L0;
            }
          }
          ((ia) this).field_a.b(((ia) this).field_d, var4, var8, var9, -1);
          return;
        }
    }

    final boolean a(int param0, int param1, int param2) {
        if (param1 != 0) {
          ((ia) this).field_i = 33;
          return mo.a(param0, ((ia) this).field_e, ((ia) this).field_i, param2, ((ia) this).field_j, (byte) 94, ((ia) this).field_c);
        } else {
          return mo.a(param0, ((ia) this).field_e, ((ia) this).field_i, param2, ((ia) this).field_j, (byte) 94, ((ia) this).field_c);
        }
    }

    private final void a(byte param0, String param1) {
        ((ia) this).field_d = param1;
        if (param0 != 20) {
            this.e(99);
            this.d(-94);
            return;
        }
        this.d(-94);
    }

    final void a(int param0, byte param1, int param2) {
        if (param1 < 45) {
          ((ia) this).a(-31, (byte) 34, -5);
          ((ia) this).field_i = param0;
          ((ia) this).field_e = param2;
          return;
        } else {
          ((ia) this).field_i = param0;
          ((ia) this).field_e = param2;
          return;
        }
    }

    final int c(int param0) {
        Object var3 = null;
        if (param0 != -29408) {
          var3 = null;
          String discarded$2 = ia.a((String) null, 'd', -85, (String) null);
          return ((ia) this).field_j;
        } else {
          return ((ia) this).field_j;
        }
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        if (param0 >= -92) {
          ((ia) this).a(94, (byte) 54, -110);
          var2 = ((ia) this).field_f[5].field_A + ((ia) this).field_f[3].field_A;
          var3 = ((ia) this).field_a.a(' ') << -1984378655;
          var4 = ((ia) this).field_a.a(((ia) this).field_d);
          ((ia) this).field_j = var3 + var2 + var4;
          var5 = ((ia) this).field_f[1].field_x - -((ia) this).field_f[7].field_x;
          var6 = 4;
          var7 = ((ia) this).field_a.field_L + ((ia) this).field_a.field_H;
          ((ia) this).field_c = var6 + (var5 + var7);
          return;
        } else {
          var2 = ((ia) this).field_f[5].field_A + ((ia) this).field_f[3].field_A;
          var3 = ((ia) this).field_a.a(' ') << -1984378655;
          var4 = ((ia) this).field_a.a(((ia) this).field_d);
          ((ia) this).field_j = var3 + var2 + var4;
          var5 = ((ia) this).field_f[1].field_x - -((ia) this).field_f[7].field_x;
          var6 = 4;
          var7 = ((ia) this).field_a.field_L + ((ia) this).field_a.field_H;
          ((ia) this).field_c = var6 + (var5 + var7);
          return;
        }
    }

    ia(wk[] param0, tu param1, int[] param2, String param3, int param4, int param5) {
        ((ia) this).field_a = param1;
        ((ia) this).field_f = param0;
        ((ia) this).field_h = param2;
        ((ia) this).a(param5, (byte) 112, param4);
        this.a((byte) 20, param3);
        this.e(15);
    }

    static {
    }
}
