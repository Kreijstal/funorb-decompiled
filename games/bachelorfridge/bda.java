/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bda extends lw {
    static String field_o;
    static String[] field_n;
    static sna[] field_m;
    static String field_p;
    static int field_l;

    public static void d(int param0) {
        field_o = null;
        if (param0 > 0) {
          field_l = -113;
          field_p = null;
          field_n = null;
          field_m = null;
          return;
        } else {
          field_p = null;
          field_n = null;
          field_m = null;
          return;
        }
    }

    final void a(int param0, byte param1) {
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        if (param0 == 34) {
          if (0 != ((bda) this).field_e) {
            if (((bda) this).field_e != 1) {
              L0: {
                if (!um.a(true)) {
                  break L0;
                } else {
                  if (!((bda) this).c((byte) 95)) {
                    break L0;
                  } else {
                    fla.b(23621);
                    if (param1 == 73) {
                      return;
                    } else {
                      ((bda) this).a(-88, (byte) -14);
                      return;
                    }
                  }
                }
              }
              if (param1 == 73) {
                return;
              } else {
                ((bda) this).a(-88, (byte) -14);
                return;
              }
            } else {
              L1: {
                wf.field_x = true;
                if (!um.a(true)) {
                  break L1;
                } else {
                  if (!((bda) this).c((byte) 95)) {
                    break L1;
                  } else {
                    fla.b(23621);
                    if (param1 == 73) {
                      return;
                    } else {
                      ((bda) this).a(-88, (byte) -14);
                      return;
                    }
                  }
                }
              }
              if (param1 == 73) {
                return;
              } else {
                ((bda) this).a(-88, (byte) -14);
                return;
              }
            }
          } else {
            ((bda) this).b(1);
            ((bda) this).c(101);
            if (((bda) this).field_e != 1) {
              if (um.a(true)) {
                if (!((bda) this).c((byte) 95)) {
                  if (param1 == 73) {
                    return;
                  } else {
                    ((bda) this).a(-88, (byte) -14);
                    return;
                  }
                } else {
                  fla.b(23621);
                  if (param1 != 73) {
                    ((bda) this).a(-88, (byte) -14);
                    return;
                  } else {
                    return;
                  }
                }
              } else {
                if (param1 != 73) {
                  ((bda) this).a(-88, (byte) -14);
                  return;
                } else {
                  return;
                }
              }
            } else {
              L2: {
                wf.field_x = true;
                if (!um.a(true)) {
                  break L2;
                } else {
                  if (!((bda) this).c((byte) 95)) {
                    break L2;
                  } else {
                    fla.b(23621);
                    if (param1 != 73) {
                      ((bda) this).a(-88, (byte) -14);
                      return;
                    } else {
                      return;
                    }
                  }
                }
              }
              if (param1 != 73) {
                ((bda) this).a(-88, (byte) -14);
                return;
              } else {
                return;
              }
            }
          }
        } else {
          if (-20 != (param0 ^ -1)) {
            if (-19 == (param0 ^ -1)) {
              if (((bda) this).field_e >= 1) {
                fla.b(param1 + 23548);
                if (param1 != 73) {
                  ((bda) this).a(-88, (byte) -14);
                  return;
                } else {
                  return;
                }
              } else {
                if (param1 != 73) {
                  ((bda) this).a(-88, (byte) -14);
                  return;
                } else {
                  return;
                }
              }
            } else {
              if (param1 != 73) {
                ((bda) this).a(-88, (byte) -14);
                return;
              } else {
                return;
              }
            }
          } else {
            ((bda) this).b(1);
            ((bda) this).c(param1 ^ 17);
            if (param1 == 73) {
              return;
            } else {
              ((bda) this).a(-88, (byte) -14);
              return;
            }
          }
        }
    }

    final void a(int param0) {
        int var2 = -102 % ((59 - param0) / 33);
        ((bda) this).c(98);
    }

    final void a(byte param0) {
        int var2 = 0;
        if (param0 >= 103) {
          var2 = (int)((1.0 - Math.cos((double)(vr.field_b * 4) * 3.141592653589793 / 100.0)) * 256.0);
          if (-2 == (((bda) this).field_e ^ -1)) {
            vg.a(sia.field_j, 8640, 22997, 33000, var2 + 4096, 6480, 4096 - -var2, sia.field_j.field_o << -1175365565, sia.field_j.field_n << -471586781);
            return;
          } else {
            return;
          }
        } else {
          return;
        }
    }

    bda() {
        super(true, new String[2], au.field_a);
        ((bda) this).field_c = new int[][]{new int[2], new int[2]};
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Encouraging rule breaking";
        field_n = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_p = "Please remove <%0> from your ignore list first.";
    }
}
