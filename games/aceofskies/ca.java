/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ca {
    private int field_a;
    static int field_h;
    private qq[] field_c;
    static String field_g;
    static eg field_f;
    float field_d;
    private int field_e;
    String field_j;
    static ph field_i;
    private int field_b;

    final boolean a(int param0) {
        qq var2 = null;
        int var3 = 0;
        qq var4 = null;
        L0: {
          var3 = AceOfSkies.field_G ? 1 : 0;
          if (param0 == -18738) {
            break L0;
          } else {
            ((ca) this).field_e = 91;
            break L0;
          }
        }
        L1: while (true) {
          if (((ca) this).field_e >= ((ca) this).field_a) {
            return true;
          } else {
            var4 = ((ca) this).field_c[((ca) this).field_e];
            var2 = var4;
            if (((qq) var4).field_d.b((byte) -95)) {
              L2: {
                if ((((qq) var4).field_f ^ -1) > -1) {
                  break L2;
                } else {
                  if (!((qq) var4).field_d.c(((qq) var4).field_f, 0)) {
                    this.a(-1, var2, ((qq) var4).field_d.a(((qq) var4).field_f, 100));
                    return false;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (((qq) var4).field_b == null) {
                  break L3;
                } else {
                  if (((qq) var4).field_d.c(((qq) var4).field_b, -14012)) {
                    break L3;
                  } else {
                    this.a(-1, var2, ((qq) var4).field_d.a(((qq) var4).field_b, (byte) -79));
                    return false;
                  }
                }
              }
              L4: {
                if (0 <= ((qq) var4).field_f) {
                  break L4;
                } else {
                  if (null != ((qq) var4).field_b) {
                    break L4;
                  } else {
                    if (null == ((qq) var4).field_c) {
                      break L4;
                    } else {
                      if (!((qq) var4).field_d.b(0)) {
                        this.a(-1, var2, ((qq) var4).field_d.a(-83));
                        return false;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
              }
              ((ca) this).field_e = ((ca) this).field_e + 1;
              continue L1;
            } else {
              this.a(param0 + 18737, var4, 0);
              return false;
            }
          }
        }
    }

    private final void a(int param0, qq param1, int param2) {
        float var4 = (float)param2 / 100.0f + (float)(1 + ((ca) this).field_e);
        ((ca) this).field_d = var4 * (float)((ca) this).field_b / (float)(((ca) this).field_a - param0);
        if (param2 != 0) {
            ((ca) this).field_j = ((qq) param1).field_c + " - " + param2 + "%";
        } else {
            ((ca) this).field_j = ((qq) param1).field_a;
        }
    }

    final static int a(uc param0, byte param1, int param2, ga param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = AceOfSkies.field_G ? 1 : 0;
          if (param0 == null) {
            break L0;
          } else {
            if (((uc) param0).field_h == null) {
              break L0;
            } else {
              if (param3 == null) {
                break L0;
              } else {
                if (((ga) param3).field_e != ((uc) param0).field_n) {
                  break L0;
                } else {
                  var4 = ((ga) param3).field_h.length;
                  var5 = ((uc) param0).field_h[param2].length / var4;
                  if (param1 > 101) {
                    var6 = 0;
                    L1: while (true) {
                      if (var6 >= var5) {
                        return -1;
                      } else {
                        if ((((ga) param3).field_j ^ -1L) == (((uc) param0).field_f[param2][var6] ^ -1L)) {
                          if (fd.a(((uc) param0).field_e[param2][var6], (byte) -6)) {
                            var7 = 0;
                            L2: while (true) {
                              if (var7 >= var4) {
                                return var6;
                              } else {
                                if (((ga) param3).field_h[var7] == ((uc) param0).field_h[param2][var7 + var6 * var4]) {
                                  var6 = var6;
                                  var7++;
                                  continue L2;
                                } else {
                                  var6++;
                                  continue L1;
                                }
                              }
                            }
                          } else {
                            var6++;
                            continue L1;
                          }
                        } else {
                          var6++;
                          continue L1;
                        }
                      }
                    }
                  } else {
                    return 94;
                  }
                }
              }
            }
          }
        }
        return -1;
    }

    public static void b(int param0) {
        if (param0 != 0) {
            ca.b(76);
        }
        field_g = null;
        field_f = null;
        field_i = null;
    }

    private ca() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new ph(8);
    }
}
