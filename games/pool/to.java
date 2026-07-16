/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class to extends tm {
    static boolean field_q;
    static jg field_l;
    static int field_p;
    static String field_n;
    static int field_o;
    static boolean[][] field_m;

    final void a(di param0, byte param1) {
        if (((to) this).field_a != null) {
          return;
        } else {
          if (param1 != 117) {
            field_q = true;
            ((to) this).field_a = new eg[16];
            ((to) this).field_a[0] = eg.a(param0, "", "balls/POLAR/polar_ball_white");
            eg dupTemp$4 = eg.a(param0, "", "balls/POLAR/polar_ball_1");
            ((to) this).field_a[7] = dupTemp$4;
            ((to) this).field_a[6] = dupTemp$4;
            ((to) this).field_a[5] = dupTemp$4;
            ((to) this).field_a[4] = dupTemp$4;
            ((to) this).field_a[3] = dupTemp$4;
            ((to) this).field_a[2] = dupTemp$4;
            ((to) this).field_a[1] = dupTemp$4;
            ((to) this).field_a[8] = eg.a(param0, "", "balls/POLAR/polar_ball_black");
            eg dupTemp$5 = eg.a(param0, "", "balls/POLAR/polar_ball_2");
            ((to) this).field_a[15] = dupTemp$5;
            ((to) this).field_a[14] = dupTemp$5;
            ((to) this).field_a[13] = dupTemp$5;
            ((to) this).field_a[12] = dupTemp$5;
            ((to) this).field_a[11] = dupTemp$5;
            ((to) this).field_a[10] = dupTemp$5;
            ((to) this).field_a[9] = dupTemp$5;
            ((to) this).field_a[0].a(8, 8, 8, 8);
            ((to) this).field_a[1].a(8, 8, 8, 8);
            ((to) this).field_a[8].a(8, 8, 8, 8);
            ((to) this).field_a[9].a(8, 8, 8, 8);
            return;
          } else {
            ((to) this).field_a = new eg[16];
            ((to) this).field_a[0] = eg.a(param0, "", "balls/POLAR/polar_ball_white");
            eg dupTemp$6 = eg.a(param0, "", "balls/POLAR/polar_ball_1");
            ((to) this).field_a[7] = dupTemp$6;
            ((to) this).field_a[6] = dupTemp$6;
            ((to) this).field_a[5] = dupTemp$6;
            ((to) this).field_a[4] = dupTemp$6;
            ((to) this).field_a[3] = dupTemp$6;
            ((to) this).field_a[2] = dupTemp$6;
            ((to) this).field_a[1] = dupTemp$6;
            ((to) this).field_a[8] = eg.a(param0, "", "balls/POLAR/polar_ball_black");
            eg dupTemp$7 = eg.a(param0, "", "balls/POLAR/polar_ball_2");
            ((to) this).field_a[15] = dupTemp$7;
            ((to) this).field_a[14] = dupTemp$7;
            ((to) this).field_a[13] = dupTemp$7;
            ((to) this).field_a[12] = dupTemp$7;
            ((to) this).field_a[11] = dupTemp$7;
            ((to) this).field_a[10] = dupTemp$7;
            ((to) this).field_a[9] = dupTemp$7;
            ((to) this).field_a[0].a(8, 8, 8, 8);
            ((to) this).field_a[1].a(8, 8, 8, 8);
            ((to) this).field_a[8].a(8, 8, 8, 8);
            ((to) this).field_a[9].a(8, 8, 8, 8);
            return;
          }
        }
    }

    private final int b(int param0, byte param1) {
        if (param1 == -102) {
          if (param0 != 0) {
            if (param0 == 1) {
              return 6715289;
            } else {
              return 16777215;
            }
          } else {
            return 13158;
          }
        } else {
          field_o = 0;
          if (param0 != 0) {
            if (param0 == 1) {
              return 6715289;
            } else {
              return 16777215;
            }
          } else {
            return 13158;
          }
        }
    }

    to() {
    }

    final boolean c(int param0) {
        if (param0 != 2) {
            String discarded$0 = ((to) this).a((byte) -23, 90);
            return false;
        }
        return false;
    }

    public static void i(int param0) {
        field_l = null;
        field_n = null;
        if (param0 != 8) {
            to.a((byte) 80, true);
            field_m = null;
            return;
        }
        field_m = null;
    }

    final int a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = Pool.field_O;
        var3 = param0;
        if (-1 != (var3 ^ -1)) {
          if (1 != var3) {
            if (2 != var3) {
              if (-4 != (var3 ^ -1)) {
                if (4 != var3) {
                  if (-6 != (var3 ^ -1)) {
                    if ((var3 ^ -1) != -7) {
                      if (var3 != 7) {
                        if (-9 == (var3 ^ -1)) {
                          return 3355443;
                        } else {
                          if (var3 != 9) {
                            if (var3 != 10) {
                              if ((var3 ^ -1) != -12) {
                                if ((var3 ^ -1) != -13) {
                                  if (var3 != 13) {
                                    if (-15 == (var3 ^ -1)) {
                                      return this.b(1, (byte) -102);
                                    } else {
                                      if (var3 != 15) {
                                        if (param1) {
                                          return 16711935;
                                        } else {
                                          field_q = true;
                                          return 16711935;
                                        }
                                      } else {
                                        return this.b(1, (byte) -102);
                                      }
                                    }
                                  } else {
                                    return this.b(1, (byte) -102);
                                  }
                                } else {
                                  return this.b(1, (byte) -102);
                                }
                              } else {
                                return this.b(1, (byte) -102);
                              }
                            } else {
                              return this.b(1, (byte) -102);
                            }
                          } else {
                            return this.b(1, (byte) -102);
                          }
                        }
                      } else {
                        return this.b(0, (byte) -102);
                      }
                    } else {
                      return this.b(0, (byte) -102);
                    }
                  } else {
                    return this.b(0, (byte) -102);
                  }
                } else {
                  return this.b(0, (byte) -102);
                }
              } else {
                return this.b(0, (byte) -102);
              }
            } else {
              return this.b(0, (byte) -102);
            }
          } else {
            return this.b(0, (byte) -102);
          }
        } else {
          return 13421772;
        }
    }

    final void a(int param0, di param1) {
        if (param0 != 198123656) {
            return;
        }
        ((to) this).field_e = aj.a(0, "", param1, "top_bar_balls_polar");
    }

    final static void a(byte param0, boolean param1) {
        wd.field_Ub.a(0, (byte) 92, 0);
        int var2 = -32 % ((37 - param0) / 60);
    }

    final String a(byte param0, int param1) {
        if (param0 < 9) {
            field_l = null;
            return -1 == (param1 ^ -1) ? ij.field_t : ld.field_h;
        }
        return -1 == (param1 ^ -1) ? ij.field_t : ld.field_h;
    }

    final static ml[] a(byte param0) {
        if (param0 != -66) {
          field_p = 19;
          return new ml[]{eo.field_Xb, ug.field_v, ve.field_l};
        } else {
          return new ml[]{eo.field_Xb, ug.field_v, ve.field_l};
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 0;
        field_q = false;
        field_n = "Password: ";
        field_m = new boolean[][]{new boolean[6], new boolean[3], new boolean[6], new boolean[2]};
    }
}
