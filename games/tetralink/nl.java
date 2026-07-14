/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl {
    int field_h;
    static String field_c;
    static ah field_b;
    int field_k;
    static boolean field_j;
    int field_i;
    static ug field_a;
    static volatile int field_d;
    int field_e;
    static int[] field_f;
    static ah field_g;
    static String field_l;

    final static void a(String param0, int param1, String param2) {
        om.a(false, false, param0, param2);
        if (param1 <= 27) {
            field_l = null;
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            field_l = null;
        }
        field_b = null;
        field_c = null;
        field_f = null;
        field_a = null;
        field_l = null;
        field_g = null;
    }

    final static void a(int param0, int param1) {
        bc var2 = nd.field_Lb;
        var2.f(param1, (byte) -92);
        var2.a(2, false);
        if (param0 <= 55) {
            return;
        }
        var2.a(4, false);
        var2.a(wg.a(true), false);
    }

    final static oh a(int param0) {
        int var4_int = 0;
        int var5 = TetraLink.field_J;
        int var1 = je.field_h[0] * sn.field_e[param0];
        byte[] var2 = ga.field_a[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var1 > var4_int; var4_int++) {
            var3[var4_int] = ti.field_c[pl.a((int) var2[var4_int], 255)];
        }
        oh var4 = new oh(wm.field_l, mm.field_w, qa.field_x[0], i.field_t[0], je.field_h[0], sn.field_e[0], var3);
        an.b(-83);
        return var4;
    }

    final static boolean a(CharSequence param0, int param1, boolean param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = TetraLink.field_J;
          if (param1 < 2) {
            break L0;
          } else {
            if (36 < param1) {
              break L0;
            } else {
              var4 = 0;
              if (param2) {
                var5 = 0;
                var6 = 0;
                var7 = param0.length();
                var8 = 0;
                L1: while (true) {
                  if (var7 <= var8) {
                    return var5 != 0;
                  } else {
                    L2: {
                      var9 = param0.charAt(var8);
                      if (-1 != (var8 ^ -1)) {
                        break L2;
                      } else {
                        if (var9 == 45) {
                          var4 = 1;
                          var8++;
                          continue L1;
                        } else {
                          if (var9 != 43) {
                            break L2;
                          } else {
                            if (!param3) {
                              break L2;
                            } else {
                              var8++;
                              continue L1;
                            }
                          }
                        }
                      }
                    }
                    L3: {
                      L4: {
                        if (var9 < 48) {
                          break L4;
                        } else {
                          if (57 < var9) {
                            break L4;
                          } else {
                            var9 -= 48;
                            break L3;
                          }
                        }
                      }
                      L5: {
                        if (65 > var9) {
                          break L5;
                        } else {
                          if (90 < var9) {
                            break L5;
                          } else {
                            var9 -= 55;
                            break L3;
                          }
                        }
                      }
                      L6: {
                        if (var9 < 97) {
                          break L6;
                        } else {
                          if (122 < var9) {
                            break L6;
                          } else {
                            var9 -= 87;
                            break L3;
                          }
                        }
                      }
                      return false;
                    }
                    if (var9 >= param1) {
                      return false;
                    } else {
                      L7: {
                        if (var4 != 0) {
                          var9 = -var9;
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var10 = var9 + var6 * param1;
                      if (var10 / param1 != var6) {
                        return false;
                      } else {
                        var6 = var10;
                        var5 = 1;
                        var8++;
                        continue L1;
                      }
                    }
                  }
                }
              } else {
                return false;
              }
            }
          }
        }
        throw new IllegalArgumentException("" + param1);
    }

    final static String a(byte param0, char param1, int param2) {
        int var4 = 0;
        int var5 = TetraLink.field_J;
        char[] var6 = new char[param2];
        char[] var3 = var6;
        if (param0 != 52) {
            field_b = null;
        }
        for (var4 = 0; var4 < param2; var4++) {
            var6[var4] = param1;
        }
        return new String(var6);
    }

    final static void a(oh param0, byte param1, int param2) {
        int var4 = TetraLink.field_J;
        int var3 = param0.field_E * param0.field_u;
        while (var3 != 0) {
            var3--;
            param0.field_C[var3] = param2;
        }
        if (param1 > -118) {
            field_d = -72;
        }
    }

    final static boolean a(byte param0, String param1, long param2) {
        ud var4 = null;
        Object var5 = null;
        int stackIn_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_8_0 = 0;
        L0: {
          if (param0 >= 126) {
            break L0;
          } else {
            var5 = null;
            nl.a((oh) null, (byte) -84, -67);
            break L0;
          }
        }
        L1: {
          var4 = ke.a(param1, false);
          if (var4 == null) {
            break L1;
          } else {
            if (var4.field_Ub == null) {
              break L1;
            } else {
              return true;
            }
          }
        }
        L2: {
          L3: {
            if (null == qb.field_N) {
              break L3;
            } else {
              if (sf.a(-18701, param2) == null) {
                break L3;
              } else {
                stackOut_7_0 = 1;
                stackIn_9_0 = stackOut_7_0;
                break L2;
              }
            }
          }
          stackOut_8_0 = 0;
          stackIn_9_0 = stackOut_8_0;
          break L2;
        }
        return stackIn_9_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Orb coins: <%0>";
        field_d = -1;
        field_j = false;
        field_f = new int[8192];
        field_l = "This password contains your email address, and would be easy to guess";
    }
}
