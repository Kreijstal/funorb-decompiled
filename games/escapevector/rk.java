/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rk {
    static hh field_c;
    static hj field_e;
    private ed[] field_a;
    private ed[] field_f;
    private fn[] field_g;
    static ce[] field_d;
    static boolean field_b;

    private final ed a(byte param0, int param1, ed param2, ed param3, ed param4) {
        int var6 = 0;
        int var7 = 0;
        fn var9 = null;
        fn var10 = null;
        ed var11 = null;
        fn var12 = null;
        fn var13 = null;
        var6 = (param3.field_A + -param2.field_A) / 2;
        var7 = (-param2.field_z + param3.field_z) / 2;
        var12 = new fn(var6, var7);
        var6 = -param2.field_A + (param3.field_A - var6);
        var7 = -param2.field_z + (param3.field_z - var7);
        var9 = new fn(var6, var7);
        var13 = rc.a(param1, (byte) 120, var9, var12);
        var10 = this.a(param1, param2.field_z, -29295, param2.field_A);
        if (param0 <= 21) {
          rk.a(104);
          var11 = new ed(var10.field_c, var10.field_b);
          em.a(oi.field_M);
          var11.g();
          param4.e(-var13.field_c, -var13.field_b);
          md.field_D.a(124);
          em.b(oi.field_M);
          return var11;
        } else {
          var11 = new ed(var10.field_c, var10.field_b);
          em.a(oi.field_M);
          var11.g();
          param4.e(-var13.field_c, -var13.field_b);
          md.field_D.a(124);
          em.b(oi.field_M);
          return var11;
        }
    }

    private final fn a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        L0: {
          var5 = param3;
          var6 = param1;
          if (param0 == 16384) {
            var6 = param3;
            var5 = param1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (-32769 != (param0 ^ -1)) {
            break L1;
          } else {
            var6 = param1;
            var5 = param3;
            break L1;
          }
        }
        L2: {
          if ((param0 ^ -1) == -49153) {
            var6 = param3;
            var5 = param1;
            break L2;
          } else {
            break L2;
          }
        }
        if (param2 != -29295) {
          ((rk) this).field_g = null;
          return new fn(var5, var6);
        } else {
          return new fn(var5, var6);
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_e = null;
        if (param0 < 120) {
            rk.a(53);
        }
    }

    final ed a(int param0, int param1) {
        if (param1 != -1) {
          if (-16385 != param1) {
            if (param0 <= -63) {
              if (-32769 == param1) {
                return ((rk) this).field_f[2];
              } else {
                if (-49153 != param1) {
                  return null;
                } else {
                  return ((rk) this).field_f[3];
                }
              }
            } else {
              rk.a(26, -60, 78);
              if (-32769 == param1) {
                return ((rk) this).field_f[2];
              } else {
                if (-49153 != param1) {
                  return null;
                } else {
                  return ((rk) this).field_f[3];
                }
              }
            }
          } else {
            return ((rk) this).field_f[1];
          }
        } else {
          return ((rk) this).field_f[0];
        }
    }

    private final fn a(ed param0, int param1, ed param2, fn param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        fn var9 = null;
        Object var10 = null;
        var5 = param2.field_A;
        var6 = param2.field_z;
        if (param1 == -1) {
          var7 = param3.field_c;
          var8 = param3.field_b;
          if (param0 != null) {
            L0: {
              if (-1 >= (param3.field_c ^ -1)) {
                break L0;
              } else {
                var5 = var5 + -param3.field_c;
                break L0;
              }
            }
            L1: {
              if ((param3.field_b ^ -1) <= -1) {
                break L1;
              } else {
                var6 = var6 + -param3.field_b;
                break L1;
              }
            }
            L2: {
              var7 = var5 - param0.field_A;
              var8 = -param0.field_z + var6;
              if (-1 >= param3.field_c) {
                var7 = var7 - param3.field_c;
                break L2;
              } else {
                break L2;
              }
            }
            if (-1 > param3.field_b) {
              var9 = new fn(var7, var8);
              return var9;
            } else {
              var8 = var8 - param3.field_b;
              var9 = new fn(var7, var8);
              return var9;
            }
          } else {
            var9 = new fn(var7, var8);
            return var9;
          }
        } else {
          var10 = null;
          ed discarded$1 = this.a((ed) null, 124, 55);
          var7 = param3.field_c;
          var8 = param3.field_b;
          if (param0 != null) {
            L3: {
              if (-1 >= (param3.field_c ^ -1)) {
                break L3;
              } else {
                var5 = var5 + -param3.field_c;
                break L3;
              }
            }
            L4: {
              if ((param3.field_b ^ -1) <= -1) {
                break L4;
              } else {
                var6 = var6 + -param3.field_b;
                break L4;
              }
            }
            L5: {
              var7 = var5 - param0.field_A;
              var8 = -param0.field_z + var6;
              if (-1 >= param3.field_c) {
                var7 = var7 - param3.field_c;
                break L5;
              } else {
                break L5;
              }
            }
            if (-1 > param3.field_b) {
              var9 = new fn(var7, var8);
              return var9;
            } else {
              var8 = var8 - param3.field_b;
              var9 = new fn(var7, var8);
              return var9;
            }
          } else {
            var9 = new fn(var7, var8);
            return var9;
          }
        }
    }

    final fn a(byte param0, int param1) {
        if (-1 == param1) {
            return ((rk) this).field_g[0];
        }
        if (!(16384 != param1)) {
            return ((rk) this).field_g[1];
        }
        if (!(-32769 != param1)) {
            return ((rk) this).field_g[2];
        }
        int var3 = 6 % ((-71 - param0) / 35);
        if (!(param1 != 49152)) {
            return ((rk) this).field_g[3];
        }
        return null;
    }

    private final ed a(ed param0, int param1) {
        int var3 = param0.field_A;
        if (!(param0.field_z <= var3)) {
            var3 = param0.field_z;
        }
        ed var4 = new ed(var3, var3);
        int var5 = (var3 + -param0.field_A) / 2;
        int var6 = (-param0.field_z + var3) / param1;
        em.a(oi.field_M);
        var4.g();
        param0.e(var5, var6);
        md.field_D.a(param1 ^ 126);
        em.b(oi.field_M);
        return var4;
    }

    final ed a(boolean param0, int param1) {
        if (param0) {
            field_e = null;
            if (0 == param1) {
                return ((rk) this).field_a[0];
            }
            if (!(-16385 != param1)) {
                return ((rk) this).field_a[1];
            }
            if (-32769 == param1) {
                return ((rk) this).field_a[2];
            }
            if (!(49152 != param1)) {
                return ((rk) this).field_a[3];
            }
            return null;
        }
        if (0 == param1) {
            return ((rk) this).field_a[0];
        }
        if (!(-16385 != param1)) {
            return ((rk) this).field_a[1];
        }
        if (-32769 == param1) {
            return ((rk) this).field_a[2];
        }
        if (!(49152 != param1)) {
            return ((rk) this).field_a[3];
        }
        return null;
    }

    rk(ed param0, ed param1, fn param2) {
        int var4 = 0;
        int var5 = 0;
        fn var6 = null;
        ((rk) this).field_a = new ed[sc.field_h.length];
        ((rk) this).field_f = new ed[sc.field_h.length];
        ((rk) this).field_g = new fn[sc.field_h.length];
        for (var4 = 0; ((rk) this).field_a.length > var4; var4++) {
            var5 = sc.field_h[var4];
            ((rk) this).field_a[var4] = this.a(param0, -67, var5);
            ((rk) this).field_f[var4] = this.a(param1, -53, var5);
            var6 = this.a(param1, -1, param0, param2);
            ((rk) this).field_g[var4] = rc.a(var5, (byte) 124, var6, param2);
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param2 != 11710) {
            return;
        }
        rn.field_e = param1;
        ng.field_nb = param0;
    }

    private final ed a(ed param0, int param1, int param2) {
        int var4 = 0;
        ed var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ed var10 = null;
        ed var11 = null;
        if (param0 != null) {
          var4 = 4096;
          var5 = this.a(param0, 2);
          if (param1 > -37) {
            return null;
          } else {
            var6 = var5.field_A;
            var7 = var5.field_z;
            var8 = var6 / 2;
            var9 = var7 / 2;
            var10 = new ed(var6, var7);
            em.a(oi.field_M);
            var10.g();
            var5.a(var8, (byte) 34, var4, param2, var9);
            md.field_D.a(124);
            em.b(oi.field_M);
            var11 = this.a((byte) 100, param2, param0, var5, var10);
            return var11;
          }
        } else {
          return null;
        }
    }

    static {
    }
}
