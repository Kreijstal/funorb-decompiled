/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class il extends l {
    private int field_f;
    private kg field_g;
    static dl field_e;
    static am[] field_h;

    final l a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        pj var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var10 = CrazyCrystals.field_B;
        if (this.field_f != 0) {
          this.field_f = this.field_f - 1;
          return (l) (this);
        } else {
          L0: {
            var2 = 0;
            var3 = 0;
            var4 = 0;
            var5_int = 0;
            if (param0 == -2) {
              break L0;
            } else {
              il.a(true);
              break L0;
            }
          }
          L1: while (true) {
            if (var5_int >= pd.field_g.length) {
              if (0 >= var4) {
                tb.field_d.a(this.field_g);
                tb.field_d.a(dn.field_e, 100, 128 * gi.field_m, 8192);
                var5 = new pj(-1, 1);
                var6 = 0;
                L2: while (true) {
                  if (var6 >= pd.field_g.length) {
                    return (l) ((Object) new o(60, new sm()));
                  } else {
                    var7 = q.field_a[ma.field_n[var6]].field_i;
                    var8 = 0;
                    L3: while (true) {
                      if (var7 <= 0) {
                        var9 = 9 + (m.field_l[var6] + -1);
                        L4: while (true) {
                          if ((var8 ^ -1) > -9) {
                            if (var8 >= 4) {
                              kk.field_a[14][var9] = (f) ((Object) var5);
                              var6++;
                              continue L2;
                            } else {
                              var6++;
                              continue L2;
                            }
                          } else {
                            kk.field_a[14][var9] = aj.field_s;
                            var8 -= 15;
                            var9--;
                            continue L4;
                          }
                        }
                      } else {
                        var7 = var7 / 10;
                        var8 += 9;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                L5: {
                  var5_int = 16 * gi.field_m;
                  if (4 <= var2) {
                    break L5;
                  } else {
                    var5_int = (int)(Math.pow(8.0, (double)(-var2 + 4) / 4.0) * (double)var5_int);
                    break L5;
                  }
                }
                L6: {
                  var6 = var3 / var4;
                  if (this.field_g == null) {
                    this.field_g = kg.a(je.field_f, 150, var5_int, var6);
                    this.field_g.f(-1);
                    tb.field_d.b(this.field_g);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                this.field_g.c(var5_int, var6);
                this.field_f = 2;
                return (l) (this);
              }
            } else {
              L7: {
                var6 = 10;
                var7 = pd.field_g[var5_int];
                if ((var7 ^ -1) <= -1) {
                  break L7;
                } else {
                  var7 = -var7;
                  break L7;
                }
              }
              L8: while (true) {
                if (var7 < 2000) {
                  L9: {
                    if ((var7 ^ -1) > -1001) {
                      if ((var7 ^ -1) <= -501) {
                        var6 = var6 * 2;
                        break L9;
                      } else {
                        break L9;
                      }
                    } else {
                      var6 = var6 * 5;
                      break L9;
                    }
                  }
                  L10: {
                    var7 = pd.field_g[var5_int];
                    var8 = (131072 + (m.field_l[var5_int] * 16384 - -18)) / 37;
                    if (var6 >= var7) {
                      if (-var6 <= var7) {
                        q.field_a[ma.field_n[var5_int]].field_i = q.field_a[ma.field_n[var5_int]].field_i + var7;
                        var7 = 0;
                        break L10;
                      } else {
                        var4++;
                        q.field_a[ma.field_n[var5_int]].field_i = q.field_a[ma.field_n[var5_int]].field_i - var6;
                        var3 = var3 + var8;
                        var7 = var7 + var6;
                        var9 = (-var7 - 1) / var6;
                        if (var9 > var2) {
                          var2 = var9;
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                    } else {
                      var3 = var3 + var8;
                      q.field_a[ma.field_n[var5_int]].field_i = q.field_a[ma.field_n[var5_int]].field_i + var6;
                      var7 = var7 - var6;
                      var4++;
                      var9 = (-1 + var7) / var6;
                      if (var2 >= var9) {
                        break L10;
                      } else {
                        var2 = var9;
                        break L10;
                      }
                    }
                  }
                  pd.field_g[var5_int] = var7;
                  this.a((byte) -95, var5_int);
                  var5_int++;
                  continue L1;
                } else {
                  var7 = var7 / 10;
                  var6 = var6 * 10;
                  continue L8;
                }
              }
            }
          }
        }
    }

    private final void a(byte param0, int param1) {
        int var3 = 0;
        if (uo.field_o <= ke.field_b[jo.field_o]) {
            if (!((jo.field_o ^ -1) > -2)) {
                var3 = q.field_a[ma.field_n[param1]].field_i;
                if (!(1000 > var3)) {
                    rc.a(1, fn.field_j, mb.field_g, 247, wd.field_j, 8, ob.field_l);
                }
                if (5000 <= var3) {
                    rc.a(1, fn.field_j, mb.field_g, 246, wd.field_j, 9, ob.field_l);
                }
                if (!(var3 < 20000)) {
                    rc.a(1, fn.field_j, mb.field_g, 245, wd.field_j, 10, ob.field_l);
                }
                if (!(50000 > var3)) {
                    rc.a(1, fn.field_j, mb.field_g, 244, wd.field_j, 11, ob.field_l);
                }
                gh.j(-10935);
            }
        }
        var3 = -7 % ((19 - param0) / 47);
    }

    final static boolean b(int param0) {
        if (param0 >= -108) {
            return false;
        }
        return hl.a(le.b((byte) -20), -94);
    }

    final void c(byte param0) {
        if (param0 < 123) {
            field_h = (am[]) null;
        }
        if (!(null == this.field_g)) {
            tb.field_d.a(this.field_g);
        }
    }

    final l b(byte param0) {
        int var3 = CrazyCrystals.field_B;
        if (!(null == this.field_g)) {
            tb.field_d.a(this.field_g);
        }
        int var2 = 0;
        if (param0 != -90) {
            il.a(44, true, -68, -50, 65, false);
        }
        while (pd.field_g.length > var2) {
            q.field_a[ma.field_n[var2]].field_i = q.field_a[ma.field_n[var2]].field_i + pd.field_g[var2];
            this.a((byte) -94, var2);
            var2++;
        }
        return (l) ((Object) new sm());
    }

    public static void a(boolean param0) {
        field_h = null;
        if (param0) {
            return;
        }
        field_e = null;
    }

    il() {
        this.field_f = 0;
        this.field_g = null;
    }

    final static void a(int param0, boolean param1, int param2, int param3, int param4, boolean param5) {
        if (param5) {
            field_h = (am[]) null;
        }
        dl[] var6 = h.field_d;
        if (!(!param1)) {
            var6 = af.field_c;
        }
        wi.a(param3, var6, param2, param0, (byte) -71, param4);
    }

    static {
        field_h = new am[4];
    }
}
