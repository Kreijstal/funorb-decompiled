/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl {
    static bu field_c;
    static String field_f;
    static String field_e;
    static ut field_g;
    static String field_b;
    static boolean field_d;
    private String field_a;

    final boolean a(String param0, int param1) {
        if (param1 > -49) {
            Object var4 = null;
            boolean discarded$0 = vl.a(56, true, true, (CharSequence) null);
        }
        return ((vl) this).field_a.equals((Object) (Object) param0);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static boolean a(int param0, boolean param1, boolean param2, CharSequence param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = Kickabout.field_G;
          if ((param0 ^ -1) > -3) {
            break L0;
          } else {
            if ((param0 ^ -1) < -37) {
              break L0;
            } else {
              L1: {
                var4 = 0;
                var5 = 0;
                var6 = 0;
                if (param2) {
                  break L1;
                } else {
                  field_d = false;
                  break L1;
                }
              }
              var7 = param3.length();
              var8 = 0;
              L2: while (true) {
                if (var8 >= var7) {
                  return var5 != 0;
                } else {
                  L3: {
                    var9 = param3.charAt(var8);
                    if (0 != var8) {
                      break L3;
                    } else {
                      if (var9 == 45) {
                        var4 = 1;
                        var8++;
                        continue L2;
                      } else {
                        if (var9 != 43) {
                          break L3;
                        } else {
                          if (!param1) {
                            break L3;
                          } else {
                            var8++;
                            continue L2;
                          }
                        }
                      }
                    }
                  }
                  L4: {
                    L5: {
                      if (var9 < 48) {
                        break L5;
                      } else {
                        if (var9 <= 57) {
                          var9 -= 48;
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (65 > var9) {
                        break L6;
                      } else {
                        if (90 >= var9) {
                          var9 -= 55;
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L7: {
                      if (var9 < 97) {
                        break L7;
                      } else {
                        if (var9 > 122) {
                          break L7;
                        } else {
                          var9 -= 87;
                          break L4;
                        }
                      }
                    }
                    return false;
                  }
                  if (var9 >= param0) {
                    return false;
                  } else {
                    L8: {
                      if (var4 == 0) {
                        break L8;
                      } else {
                        var9 = -var9;
                        break L8;
                      }
                    }
                    var10 = var9 + var6 * param0;
                    if (var10 / param0 == var6) {
                      var6 = var10;
                      var5 = 1;
                      var8++;
                      continue L2;
                    } else {
                      return false;
                    }
                  }
                }
              }
            }
          }
        }
        throw new IllegalArgumentException("" + param0);
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 < 111) {
            vl.a(-36, -71, -68, 100, 65);
        }
        field_g = null;
        field_c = null;
        field_b = null;
        field_e = null;
    }

    final void a(int param0, java.applet.Applet param1) {
        tj.a(((vl) this).field_a, param1, (byte) -5, 31536000L, "jagex-last-login-method");
        if (param0 > -110) {
            vl.a(78, 31, 85, 37, 61);
        }
    }

    final static void a(nu param0, byte param1) {
        int var7 = 0;
        int var2 = param0.field_V.a(true);
        int var3 = param0.field_V.c(879306160);
        if (param1 >= -39) {
            vl.a(127);
        }
        int var4 = var2 - 448;
        int var5 = -672 + var3;
        int var6 = var4 * var4 + var5 * var5;
        if (-202501 > (var6 ^ -1)) {
            var7 = de.a(var6, (byte) -118);
            var3 = 450 * var5 / var7 + 672;
            var2 = 448 - -(var4 * 450 / var7);
        }
        ql.field_a[1] = var3;
        ql.field_a[0] = var2;
    }

    final static ut a(int param0, int param1, boolean param2, int param3) {
        int var4 = (param1 << 1599722241) + 1;
        ut var5 = new ut(var4, var4);
        iw.a(56, var5);
        on.d(param1, param1, param1, param3);
        on.d(param1, param1, param1 - param0, 0);
        ta.e(120);
        if (!param2) {
            vl.a(8);
        }
        return var5;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        dk.a(param2, -109, param1, param3 / param0, param3 % 3);
        on.a(param2, param1, 156, 225, 10, 16777215, param4);
        ta.e(126);
    }

    final static boolean a(boolean param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (!param0) {
            break L0;
          } else {
            ut discarded$2 = vl.a(12, -70, true, -119);
            break L0;
          }
        }
        L1: {
          L2: {
            if (fp.field_e != -1) {
              break L2;
            } else {
              if (-11 >= (nq.g(0) ^ -1)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    vl(String param0) {
        ((vl) this).field_a = param0;
    }

    final static boolean b(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 0) {
            break L0;
          } else {
            vl.a(-68, -48, 74, 38, -61);
            break L0;
          }
        }
        L1: {
          L2: {
            if (!il.b((byte) 100)) {
              break L2;
            } else {
              if (!c.field_g) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Offensive account name";
        field_d = true;
        field_b = "-";
    }
}
