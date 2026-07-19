/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class tl {
    static String field_c;
    static String field_e;
    static qb[] field_a;
    static boolean field_d;
    static String field_g;
    static lc[] field_f;
    static String field_b;

    public static void a(byte param0) {
        field_c = null;
        if (param0 >= -17) {
          field_e = (String) null;
          field_a = null;
          field_b = null;
          field_e = null;
          field_g = null;
          field_f = null;
          return;
        } else {
          field_a = null;
          field_b = null;
          field_e = null;
          field_g = null;
          field_f = null;
          return;
        }
    }

    final static void e(byte param0) {
        int discarded$42 = 0;
        int incrementValue$43 = 0;
        int incrementValue$44 = 0;
        int incrementValue$45 = 0;
        int incrementValue$46 = 0;
        int incrementValue$47 = 0;
        int incrementValue$48 = 0;
        int incrementValue$49 = 0;
        int incrementValue$50 = 0;
        int[] var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < -52) {
                break L1;
              } else {
                discarded$42 = tl.c((byte) -27);
                break L1;
              }
            }
            var5 = kl.field_B;
            var1 = var5;
            var2 = 0;
            var3 = var5.length;
            L2: while (true) {
              if (var3 <= var2) {
                break L0;
              } else {
                incrementValue$43 = var2;
                var2++;
                var5[incrementValue$43] = 0;
                incrementValue$44 = var2;
                var2++;
                var5[incrementValue$44] = 0;
                incrementValue$45 = var2;
                var2++;
                var5[incrementValue$45] = 0;
                incrementValue$46 = var2;
                var2++;
                var5[incrementValue$46] = 0;
                incrementValue$47 = var2;
                var2++;
                var5[incrementValue$47] = 0;
                incrementValue$48 = var2;
                var2++;
                var5[incrementValue$48] = 0;
                incrementValue$49 = var2;
                var2++;
                var5[incrementValue$49] = 0;
                incrementValue$50 = var2;
                var2++;
                var5[incrementValue$50] = 0;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1_ref), "tl.E(" + param0 + ')');
        }
    }

    final static int c(byte param0) {
        if (-3 < (ih.field_f ^ -1)) {
          return 0;
        } else {
          L0: {
            if (param0 == -77) {
              break L0;
            } else {
              tl.e((byte) -108);
              break L0;
            }
          }
          if (-1 != (gm.field_f ^ -1)) {
            if (null != lh.field_g) {
              if (!lh.field_g.c(-10923)) {
                return 14;
              } else {
                if (!lh.field_g.a(true, "")) {
                  return 29;
                } else {
                  if (lh.field_g.a("", -24417)) {
                    if (da.field_b.c(param0 ^ 10982)) {
                      if (da.field_b.a("commonui", -24417)) {
                        if (ea.field_C.c(-10923)) {
                          if (ea.field_C.a("commonui", param0 ^ 24364)) {
                            if (ho.field_g.c(-10923)) {
                              if (!ho.field_g.a(param0 ^ 35)) {
                                return 86;
                              } else {
                                return 100;
                              }
                            } else {
                              return 82;
                            }
                          } else {
                            return 80;
                          }
                        } else {
                          return 71;
                        }
                      } else {
                        return 57;
                      }
                    } else {
                      return 43;
                    }
                  } else {
                    return 29;
                  }
                }
              }
            } else {
              if (da.field_b.c(param0 ^ 10982)) {
                if (da.field_b.a("commonui", -24417)) {
                  if (ea.field_C.c(-10923)) {
                    if (ea.field_C.a("commonui", param0 ^ 24364)) {
                      if (ho.field_g.c(-10923)) {
                        if (!ho.field_g.a(param0 ^ 35)) {
                          return 86;
                        } else {
                          return 100;
                        }
                      } else {
                        return 82;
                      }
                    } else {
                      return 80;
                    }
                  } else {
                    return 71;
                  }
                } else {
                  return 57;
                }
              } else {
                return 43;
              }
            }
          } else {
            if (!da.field_b.c(-10923)) {
              return 20;
            } else {
              if (!da.field_b.a("commonui", -24417)) {
                return 40;
              } else {
                if (ea.field_C.c(-10923)) {
                  if (!ea.field_C.a("commonui", -24417)) {
                    return 60;
                  } else {
                    if (!ho.field_g.c(-10923)) {
                      return 70;
                    } else {
                      if (ho.field_g.a(-86)) {
                        return 100;
                      } else {
                        return 80;
                      }
                    }
                  }
                } else {
                  return 50;
                }
              }
            }
          }
        }
    }

    final static String b(byte param0) {
        if (param0 < 95) {
            tl.a((byte) 55);
            return vi.field_F;
        }
        return vi.field_F;
    }

    abstract int a(int param0, byte param1);

    abstract jk d(byte param0);

    abstract byte[] a(int param0, boolean param1);

    final static void a(int param0) {
        if (ob.field_Y == null) {
          li.a(0, param0 + 30267);
          if (param0 != -30267) {
            field_e = (String) null;
            return;
          } else {
            return;
          }
        } else {
          ob.field_Y.field_l = false;
          li.a(0, param0 + 30267);
          if (param0 == -30267) {
            return;
          } else {
            field_e = (String) null;
            return;
          }
        }
    }

    static {
        field_c = "<%0> might change the options - wait and see.";
        field_e = "MOST KILLS - ";
        field_g = "Reading Book of Nature";
        field_d = false;
        field_b = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_f = new lc[17];
    }
}
