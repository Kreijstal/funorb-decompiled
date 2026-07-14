/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class npa {
    private int field_i;
    private boolean field_g;
    static nl field_f;
    private ji field_h;
    private af field_e;
    private int field_c;
    private nf field_b;
    private int field_d;
    private ffa[] field_a;

    npa(boolean param0, int param1) {
        this(5, param0, param1);
    }

    final void a(ffa param0, byte param1) {
        int var4 = TombRacer.field_G ? 1 : 0;
        if (param1 <= 72) {
            ((npa) this).field_g = false;
        }
        q var5 = (q) (Object) ((npa) this).field_e.a(-128, (long)param0.a(true));
        while (var5 != null) {
            if (param0 == var5.a((byte) -128)) {
                var5.p(100);
                var5.c(-7975);
                ft.a(var5, -201);
            }
            var5 = (q) (Object) ((npa) this).field_e.b((byte) 27);
        }
    }

    final ffa[] b(int param0, int param1, int param2, int param3, int param4) {
        if (param1 != -1) {
            return null;
        }
        return this.a(-1 + (param3 / 2 + param2), -(param3 / 2) + param2, -1 + (param0 + param4 / 2), (byte) -102, -(param4 / 2) + param0);
    }

    final ffa[] a(byte param0, ffa param1) {
        if (param0 != -26) {
            return null;
        }
        return ((npa) this).b(param1.e(9648), -1, param1.d(3), param1.c(-48), param1.a((byte) 55));
    }

    private final ffa[] a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        q var8 = null;
        int var9 = 0;
        ffa var10 = null;
        int var11 = 0;
        int var12 = 0;
        var12 = TombRacer.field_G ? 1 : 0;
        ((npa) this).field_b.a(-2147483648, (byte) 7, 32, 2147483647, param1 >> ((npa) this).field_c, param2 >> ((npa) this).field_c, param3 >> ((npa) this).field_c, param0 >> ((npa) this).field_c, 2147483647, -2147483648);
        ((npa) this).field_d = param4;
        L0: while (true) {
          if (((npa) this).field_b.field_d) {
            return this.b(0);
          } else {
            var6 = ((npa) this).field_b.b((byte) 75);
            var7 = ((npa) this).field_b.b(2);
            var8 = (q) (Object) ((npa) this).field_h.a((byte) -119, (long)ira.a(var6, var7, (byte) 36));
            L1: while (true) {
              if (var8 == null) {
                ((npa) this).field_b.d(113);
                continue L0;
              } else {
                L2: {
                  if (!var8.a(var6, var7, true)) {
                    break L2;
                  } else {
                    var9 = 1;
                    var10 = var8.a((byte) -80);
                    var11 = 0;
                    L3: while (true) {
                      L4: {
                        if (var11 >= ((npa) this).field_d) {
                          break L4;
                        } else {
                          if (var10 == ((npa) this).field_a[var11]) {
                            var9 = 0;
                            break L4;
                          } else {
                            var11++;
                            continue L3;
                          }
                        }
                      }
                      if (var9 != 0) {
                        ((npa) this).field_d = ((npa) this).field_d + 1;
                        ((npa) this).field_a[((npa) this).field_d] = var8.a((byte) -96);
                        if (((npa) this).field_a.length > ((npa) this).field_d) {
                          break L2;
                        } else {
                          return this.b(0);
                        }
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var8 = (q) (Object) ((npa) this).field_h.b(-128);
                continue L1;
              }
            }
          }
        }
    }

    private final int a(int param0, int param1) {
        if (param0 != 2) {
            return 112;
        }
        if (0 > param1) {
            return (-31 + (param1 >> ((npa) this).field_c)) / 32;
        }
        return (param1 >> ((npa) this).field_c) / 32;
    }

    private final ffa[] a(int param0, int param1, int param2, byte param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        q var12 = null;
        int var13 = 0;
        ffa var14 = null;
        int var15 = 0;
        int var16 = 0;
        L0: {
          var16 = TombRacer.field_G ? 1 : 0;
          var6 = this.a(2, param1);
          if (param3 < -46) {
            break L0;
          } else {
            ((npa) this).field_i = -110;
            break L0;
          }
        }
        var7 = this.a(2, param4);
        var8 = this.a(2, param0);
        var9 = this.a(2, param2);
        ((npa) this).field_d = 0;
        var10 = var6;
        L1: while (true) {
          if (var8 < var10) {
            return this.b(0);
          } else {
            var11 = var7;
            L2: while (true) {
              if (var11 > var9) {
                var10++;
                continue L1;
              } else {
                var12 = (q) (Object) ((npa) this).field_h.a((byte) -80, (long)ira.a(var10, var11, (byte) -124));
                L3: while (true) {
                  if (var12 != null) {
                    L4: {
                      if (var12.a(var10, var11, true)) {
                        var13 = 1;
                        var14 = var12.a((byte) -75);
                        var15 = 0;
                        L5: while (true) {
                          L6: {
                            if (var15 >= ((npa) this).field_d) {
                              break L6;
                            } else {
                              if (((npa) this).field_a[var15] == var14) {
                                var13 = 0;
                                break L6;
                              } else {
                                var15++;
                                continue L5;
                              }
                            }
                          }
                          if (var13 != 0) {
                            ((npa) this).field_d = ((npa) this).field_d + 1;
                            ((npa) this).field_a[((npa) this).field_d] = var12.a((byte) -71);
                            if (((npa) this).field_d < ((npa) this).field_a.length) {
                              break L4;
                            } else {
                              return this.b(0);
                            }
                          } else {
                            break L4;
                          }
                        }
                      } else {
                        break L4;
                      }
                    }
                    var12 = (q) (Object) ((npa) this).field_h.b(-106);
                    continue L3;
                  } else {
                    var11++;
                    continue L2;
                  }
                }
              }
            }
          }
        }
    }

    public static void c(int param0) {
        if (param0 != -2147483648) {
            return;
        }
        field_f = null;
    }

    private final ffa[] b(int param0) {
        ffa[] var2 = new ffa[((npa) this).field_d];
        lua.a((Object[]) (Object) ((npa) this).field_a, param0, (Object[]) (Object) var2, 0, ((npa) this).field_d);
        return var2;
    }

    final void b(ffa param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        q var9 = null;
        q var10 = null;
        int var11 = 0;
        var11 = TombRacer.field_G ? 1 : 0;
        var3 = this.a(2, param0.d(param1 + -7070) - param0.c(-55) / 2);
        var4 = this.a(2, param0.e(9648) - param0.a((byte) 55) / 2);
        if (param1 == 7073) {
          var5 = this.a(param1 + -7071, -1 + param0.d(3) + param0.c(-58) / 2);
          var6 = this.a(2, param0.e(param1 + 2575) - (-(param0.a((byte) 55) / 2) + 1));
          var7 = var3;
          L0: while (true) {
            if (var5 < var7) {
              return;
            } else {
              var8 = var4;
              L1: while (true) {
                if (var6 < var8) {
                  var7++;
                  continue L0;
                } else {
                  L2: {
                    if (!((npa) this).field_g) {
                      break L2;
                    } else {
                      if (param0.a(32 << ((npa) this).field_c, (gma) null, 113, 32 << ((npa) this).field_c, var8 * 32 + 16 << ((npa) this).field_c, (ffa) null, 32 * var7 + 16 << ((npa) this).field_c, 0)) {
                        break L2;
                      } else {
                        var8++;
                        continue L1;
                      }
                    }
                  }
                  var9 = (q) (Object) ((npa) this).field_e.a(-121, (long)param0.a(true));
                  L3: while (true) {
                    if (var9 == null) {
                      var10 = vw.a(var7, param0, var8, true);
                      ((npa) this).field_e.a(param1 ^ -7074, (od) (Object) var10, (long)param0.a(true));
                      ((npa) this).field_h.a((long)var10.hashCode(), 115, (vg) (Object) var10);
                      var8++;
                      continue L1;
                    } else {
                      if (!var9.a(var8, var7, param0, 123)) {
                        var9 = (q) (Object) ((npa) this).field_e.b((byte) 35);
                        continue L3;
                      } else {
                        var8++;
                        continue L1;
                      }
                    }
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final ffa[] a(pc param0, byte param1) {
        if (param1 > -4) {
            ((npa) this).field_b = null;
        }
        return this.a(param0.field_e, param0.field_d, param0.field_k, param0.field_a, 0);
    }

    final void a(ffa param0, int param1) {
        int var9 = TombRacer.field_G ? 1 : 0;
        int var3 = this.a(2, param0.d(3) - param0.c(-14) / 2);
        int var5 = -25 / ((param1 - 13) / 51);
        int var4 = this.a(2, param0.e(9648) - param0.a((byte) 55) / 2);
        int var6 = this.a(2, -1 + param0.d(3) - -(param0.c(-51) / 2));
        int var7 = this.a(2, -1 + (param0.e(9648) + param0.a((byte) 55) / 2));
        q var8 = (q) (Object) ((npa) this).field_e.a(-120, (long)param0.a(true));
        while (var8 != null) {
            if (var8.a((byte) -76) == param0) {
                if (!(var8.a(var7, var6, var4, var3, -98))) {
                    var8.p(104);
                    var8.c(-7975);
                    ft.a(var8, -201);
                }
            }
            var8 = (q) (Object) ((npa) this).field_e.b((byte) 119);
        }
    }

    final static boolean a(int param0) {
        if (param0 != 32) {
            npa.c(-128);
        }
        return wt.field_d == gsa.field_y ? true : false;
    }

    private npa(int param0, boolean param1, int param2) {
        ((npa) this).field_b = new nf();
        ((npa) this).field_a = new ffa[128];
        ((npa) this).field_i = 1 << param0;
        ((npa) this).field_h = new ji(((npa) this).field_i);
        ((npa) this).field_e = new af(((npa) this).field_i);
        ((npa) this).field_g = param1 ? true : false;
        ((npa) this).field_c = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new nl("");
    }
}
