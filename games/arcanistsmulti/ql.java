/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql {
    static int field_a;
    static String field_e;
    static qb field_c;
    static int[] field_b;
    private String field_d;

    final static void a(jg param0, byte param1) {
        int var2 = 0;
        jg var3 = null;
        int var4 = 0;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (null == param0.field_e) {
          return;
        } else {
          L0: {
            L1: {
              if (param0.field_d != 0) {
                break L1;
              } else {
                if (param0.field_k == 0) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            var2 = 0;
            L2: while (true) {
              if (gb.field_f <= var2) {
                break L0;
              } else {
                var3 = g.field_d[var2];
                if (var3.field_m == 2) {
                  if (var3.field_d == param0.field_d) {
                    if (param0.field_k == var3.field_k) {
                      return;
                    } else {
                      var2++;
                      continue L2;
                    }
                  } else {
                    var2++;
                    continue L2;
                  }
                } else {
                  var2++;
                  continue L2;
                }
              }
            }
          }
          if (param1 >= 74) {
            L3: {
              if (param0.field_f == null) {
                break L3;
              } else {
                fo.field_h = param0.field_h;
                ao.field_e = param0.field_f;
                gd.field_rb = param0.field_m;
                of.field_c = param0.field_n;
                break L3;
              }
            }
            vd.a(param0, (byte) -74);
            return;
          } else {
            return;
          }
        }
    }

    final static void a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        qb var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_9_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var13 = ArcanistsMulti.field_G ? 1 : 0;
          if (de.field_e == 0) {
            break L0;
          } else {
            if (de.field_j != 0) {
              L1: {
                if (640 >= param0) {
                  if ((param1 ^ -1) < -481) {
                    stackOut_7_0 = 1;
                    stackIn_9_0 = stackOut_7_0;
                    break L1;
                  } else {
                    stackOut_6_0 = 0;
                    stackIn_9_0 = stackOut_6_0;
                    break L1;
                  }
                } else {
                  stackOut_4_0 = 1;
                  stackIn_9_0 = stackOut_4_0;
                  break L1;
                }
              }
              L2: {
                var3 = stackIn_9_0;
                var4 = 2949191;
                var5 = 4325449;
                var6 = sm.field_d;
                var7 = var6.field_A.length;
                if (var3 == 0) {
                  de.c(0, 0, 640, 480, var4, var5);
                  break L2;
                } else {
                  L3: {
                    var8 = uc.field_a + 480;
                    if (-2 > (uc.field_a ^ -1)) {
                      var9 = gf.a((uc.field_a * 1024 - -491520) / 480, (byte) 16, var5, var4);
                      de.c(0, 0, param0 / 2, uc.field_a / 2, var9, var4);
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  de.c(0, uc.field_a / 2, param0 / 2, 240, var4, var5);
                  if ((param1 + -var8 ^ -1) >= -2) {
                    break L2;
                  } else {
                    var9 = gf.a((491520 + (param1 - var8) * 1024) / 480, (byte) 14, var4, var5);
                    de.c(0, var8 / 2, param0 / 2, (param1 + -var8) / 2, var5, var9);
                    break L2;
                  }
                }
              }
              L4: {
                var8 = param2;
                var9 = 0;
                if (-641 > (param0 ^ -1)) {
                  var8 = (-639 + param0) / 2;
                  var8 = var8 % var7;
                  if (0 < var8) {
                    var8 = var8 - var7;
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  break L4;
                }
              }
              L5: {
                if (480 < param1) {
                  var9 = (param1 + -480 - -1) / 2;
                  var9 = var9 % var7;
                  if ((var9 ^ -1) >= -1) {
                    break L5;
                  } else {
                    var9 = var9 - var7;
                    break L5;
                  }
                } else {
                  break L5;
                }
              }
              L6: {
                if (var3 != 0) {
                  var10 = var9;
                  L7: while (true) {
                    if (var10 >= param1) {
                      break L6;
                    } else {
                      var11 = var6.field_q * ((-var9 + var10) % var6.field_y);
                      var11 = dh.a(var11, true, var6.field_A.length);
                      var12 = var8;
                      L8: while (true) {
                        if (param0 <= var12) {
                          var10 += 2;
                          continue L7;
                        } else {
                          L9: {
                            de.g(var12 / 2, var10 / 2, 6035051, -(var6.field_A[var11] & 255) + 255 >> 886081346);
                            var11++;
                            if (var11 < var6.field_A.length) {
                              break L9;
                            } else {
                              var11 = 0;
                              break L9;
                            }
                          }
                          var11++;
                          if (var6.field_A.length <= var11) {
                            var11 = 0;
                            var12 += 2;
                            continue L8;
                          } else {
                            var12 += 2;
                            continue L8;
                          }
                        }
                      }
                    }
                  }
                } else {
                  var10 = var9;
                  L10: while (true) {
                    if (param1 <= var10) {
                      break L6;
                    } else {
                      var11 = (-var9 + var10) % var6.field_y * var6.field_q;
                      var11 = dh.a(var11, true, var6.field_A.length);
                      var12 = var8;
                      L11: while (true) {
                        if (param0 <= var12) {
                          var10++;
                          continue L10;
                        } else {
                          de.g(var12, var10, 6035051, -(var6.field_A[var11] & 255) + 255 >> 1203796962);
                          var11++;
                          if (var11 >= var6.field_A.length) {
                            var11 = 0;
                            var12++;
                            continue L11;
                          } else {
                            var12++;
                            continue L11;
                          }
                        }
                      }
                    }
                  }
                }
              }
              return;
            } else {
              break L0;
            }
          }
        }
    }

    public static void a(byte param0) {
        if (param0 >= -61) {
            return;
        }
        field_b = null;
        field_c = null;
        field_e = null;
    }

    final static kc a(int param0) {
        if (param0 != 1) {
            return null;
        }
        return mc.a((byte) 21);
    }

    final static qb[] a(int param0, byte param1, int param2, int param3) {
        int var5 = 0;
        int var6 = ArcanistsMulti.field_G ? 1 : 0;
        qb[] var7 = new qb[9];
        qb[] var4 = var7;
        var7[0] = ce.b(param0, param3, 21385);
        if (param1 < 69) {
            return null;
        }
        for (var5 = 1; (var5 ^ -1) > -10; var5++) {
            var7[var5] = var7[0];
        }
        var4[4] = ce.b(64, param2, 21385);
        return var4;
    }

    final void a(java.applet.Applet param0, byte param1) {
        if (param1 > -3) {
            field_a = 59;
        }
        sm.a(31536000L, "jagex-last-login-method", param0, -15367, ((ql) this).field_d);
    }

    final boolean a(String param0, int param1) {
        if (param1 > -10) {
            return false;
        }
        return ((ql) this).field_d.equals((Object) (Object) param0);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (de.field_j >= param2 + (param1 + param3)) {
            return param3 + param1;
        }
        if (param0 != 10) {
            field_e = null;
        }
        if (!(-1 < (param3 + -param2 ^ -1))) {
            return param3 + -param2;
        }
        return de.field_j - param2;
    }

    ql(String param0) {
        ((ql) this).field_d = param0;
    }

    final static void a(boolean param0) {
        ah.field_b = df.field_z.l(-1);
        CharSequence var2 = (CharSequence) (Object) ah.field_b;
        nm.field_b = gk.a(var2, -13);
        if (!param0) {
            field_b = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[]{2, 20, 21, 6, 5, 10, 11, 13};
        field_e = "Searching for an opponent";
    }
}
