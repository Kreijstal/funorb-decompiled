/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la {
    private int field_b;
    private int field_h;
    private int field_j;
    static ut field_e;
    private int field_g;
    private int field_i;
    private int field_l;
    static int[][] field_k;
    static double field_d;
    static String field_f;
    static ib field_a;
    static int field_c;

    final static boolean b(int param0) {
        if (param0 != 820907312) {
            field_k = null;
            return n.field_c;
        }
        return n.field_c;
    }

    public static void a() {
        field_a = null;
        field_f = null;
        field_e = null;
        field_k = null;
    }

    final void a(int param0, int param1) {
        int var3 = ug.a(param0 ^ -2943, ((la) this).field_g >> 16);
        int var4 = lf.a((byte) -123, ((la) this).field_b >> 16);
        int var5 = -var3 + ug.a(param0 ^ param0, ((la) this).field_i >> 16);
        int var6 = -var4 + lf.a((byte) -117, ((la) this).field_h >> 16);
        on.a(var3, var4, var5, var6, param1, 50);
        on.e(var3, var4, var5, var6, param1);
    }

    final static void a(nu param0) {
        try {
            ja.field_O = true;
            et.field_d = param0;
            if (!(null != ss.field_b)) {
                int discarded$0 = 0;
                ss.field_b = gt.c();
            }
            ld.field_f = (gm) (Object) et.field_d.field_P[0][3];
            fc.field_c = (gm) (Object) et.field_d.field_P[0][4];
            mc.field_a = 0;
            cq.field_g = 640;
            mh.field_k = (gm) (Object) et.field_d.field_P[0][1];
            jw.c(1, false);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "la.F(" + (param0 != null ? "{...}" : "null") + 44 + 0 + 41);
        }
    }

    final boolean a(int param0, int param1, int param2, int param3) {
        int stackIn_15_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_41_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_40_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_14_0 = 0;
        if (param2 == 703166480) {
          if (param0 >= ((la) this).field_g) {
            if (param1 >= ((la) this).field_b) {
              if (((la) this).field_i >= param0) {
                if (param1 <= ((la) this).field_h) {
                  if (((la) this).field_j != ((la) this).field_l) {
                    if (((la) this).field_l <= param3) {
                      if (param3 > ((la) this).field_j) {
                        return false;
                      } else {
                        return true;
                      }
                    } else {
                      return false;
                    }
                  } else {
                    if (0 > param3) {
                      L0: {
                        L1: {
                          if (((la) this).field_l > param3) {
                            break L1;
                          } else {
                            if (param3 > ((la) this).field_j) {
                              break L1;
                            } else {
                              stackOut_39_0 = 1;
                              stackIn_41_0 = stackOut_39_0;
                              break L0;
                            }
                          }
                        }
                        stackOut_40_0 = 0;
                        stackIn_41_0 = stackOut_40_0;
                        break L0;
                      }
                      return stackIn_41_0 != 0;
                    } else {
                      stackOut_34_0 = 1;
                      stackIn_36_0 = stackOut_34_0;
                      return stackIn_36_0 != 0;
                    }
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        } else {
          ((la) this).a(-14, 82);
          if (param0 >= ((la) this).field_g) {
            if (param1 >= ((la) this).field_b) {
              if (((la) this).field_i >= param0) {
                if (param1 <= ((la) this).field_h) {
                  if (((la) this).field_j == ((la) this).field_l) {
                    if (0 <= param3) {
                      return true;
                    } else {
                      L2: {
                        L3: {
                          if (((la) this).field_l > param3) {
                            break L3;
                          } else {
                            if (param3 > ((la) this).field_j) {
                              break L3;
                            } else {
                              stackOut_19_0 = 1;
                              stackIn_21_0 = stackOut_19_0;
                              break L2;
                            }
                          }
                        }
                        stackOut_20_0 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        break L2;
                      }
                      return stackIn_21_0 != 0;
                    }
                  } else {
                    L4: {
                      L5: {
                        if (((la) this).field_l > param3) {
                          break L5;
                        } else {
                          if (param3 > ((la) this).field_j) {
                            break L5;
                          } else {
                            stackOut_13_0 = 1;
                            stackIn_15_0 = stackOut_13_0;
                            break L4;
                          }
                        }
                      }
                      stackOut_14_0 = 0;
                      stackIn_15_0 = stackOut_14_0;
                      break L4;
                    }
                    return stackIn_15_0 != 0;
                  }
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    final static boolean a(int param0) {
        if (param0 != 100) {
            boolean discarded$0 = la.b(78);
            return nb.field_f;
        }
        return nb.field_f;
    }

    la(int param0, int param1, int param2, int param3) {
        this(param0, param1, param2, param3, 0, 0);
    }

    final static void a(boolean param0) {
        ad.a(gk.field_h, (byte) -49);
    }

    la(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((la) this).field_i = param2 << 16;
        ((la) this).field_j = param5 << 16;
        ((la) this).field_h = param3 << 16;
        ((la) this).field_l = param4 << 16;
        ((la) this).field_b = param1 << 16;
        ((la) this).field_g = param0 << 16;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new ut(100, 100);
        field_f = "You can't auction this player as his value is £0";
    }
}
