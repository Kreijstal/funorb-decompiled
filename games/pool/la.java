/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    static ie field_h;
    static int[] field_d;
    static int field_a;
    static String field_g;
    static qb[] field_c;
    static int field_b;
    static int field_e;
    static int field_f;

    final static ie a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = Pool.field_O;
        var2 = param1.length();
        var3 = param0;
        L0: while (true) {
          if (var2 > var3) {
            var4 = param1.charAt(var3);
            if (48 <= var4) {
              if (var4 <= 57) {
                var3++;
                var3++;
                continue L0;
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            return pj.field_K;
          }
        }
    }

    final static void a(int param0, int param1, int param2, int param3, String param4, boolean param5, int param6, int param7) {
        int var8 = 0;
        if (-1 != (ph.field_d.field_R ^ -1)) {
          if (ea.field_z) {
            var8 = -106 % ((param0 - -1) / 55);
            if (rg.field_p) {
              lm.a(param1, param6, 20, 4, param2, param7, param4, param3, param3);
              uq.field_D.a(param5, false);
              if (param5) {
                L0: {
                  if (0 != be.field_L.field_R) {
                    rg.field_p = false;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                if (0 == wn.field_g.field_R) {
                  return;
                } else {
                  cl.a(14851);
                  rg.field_p = false;
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            if (hr.field_y) {
              r.c((byte) 50);
              var8 = -106 % ((param0 - -1) / 55);
              if (rg.field_p) {
                lm.a(param1, param6, 20, 4, param2, param7, param4, param3, param3);
                uq.field_D.a(param5, false);
                if (param5) {
                  L1: {
                    if (0 != be.field_L.field_R) {
                      rg.field_p = false;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  if (0 == wn.field_g.field_R) {
                    return;
                  } else {
                    cl.a(14851);
                    rg.field_p = false;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              rg.field_p = true;
              var8 = -106 % ((param0 - -1) / 55);
              if (rg.field_p) {
                lm.a(param1, param6, 20, 4, param2, param7, param4, param3, param3);
                uq.field_D.a(param5, false);
                if (param5) {
                  L2: {
                    if (0 != be.field_L.field_R) {
                      rg.field_p = false;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  if (0 == wn.field_g.field_R) {
                    return;
                  } else {
                    cl.a(14851);
                    rg.field_p = false;
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            }
          }
        } else {
          var8 = -106 % ((param0 - -1) / 55);
          if (rg.field_p) {
            lm.a(param1, param6, 20, 4, param2, param7, param4, param3, param3);
            uq.field_D.a(param5, false);
            if (param5) {
              L3: {
                if (0 != be.field_L.field_R) {
                  rg.field_p = false;
                  break L3;
                } else {
                  break L3;
                }
              }
              if (0 == wn.field_g.field_R) {
                return;
              } else {
                cl.a(14851);
                rg.field_p = false;
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_h = null;
        int var1 = 64 % ((53 - param0) / 52);
        field_d = null;
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = new ie();
        field_b = 0;
        field_g = "Hint: to start quickly, choose 'Don't mind' for as many options as you can!";
        field_e = 10;
    }
}
