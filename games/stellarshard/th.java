/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    static int[] field_a;
    static String field_b;

    final boolean b(int param0) {
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        L0: {
          if (param0 == 48) {
            break L0;
          } else {
            field_b = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (this == (Object) (Object) lb.field_o) {
              break L2;
            } else {
              if ((Object) (Object) ge.field_m == this) {
                break L2;
              } else {
                if (this != (Object) (Object) la.field_O) {
                  stackOut_7_0 = 0;
                  stackIn_8_0 = stackOut_7_0;
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          stackOut_6_0 = 1;
          stackIn_8_0 = stackOut_6_0;
          break L1;
        }
        return stackIn_8_0 != 0;
    }

    final static void a(boolean param0, boolean param1, int param2) {
        Object var4 = null;
        ai.a(param1, -1, (String) null, param0);
        if (param2 != 4) {
            th.a(false, true, -6);
        }
    }

    final static boolean a(int param0, boolean param1, int param2, CharSequence param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = stellarshard.field_B;
          if (param2 < 2) {
            break L0;
          } else {
            if ((param2 ^ -1) >= -37) {
              var4 = 0;
              var5 = 0;
              var6 = 0;
              var7 = param3.length();
              var8 = 0;
              L1: while (true) {
                if (var8 >= var7) {
                  L2: {
                    if (param0 == -123) {
                      break L2;
                    } else {
                      field_a = null;
                      break L2;
                    }
                  }
                  return var5 != 0;
                } else {
                  L3: {
                    var9 = param3.charAt(var8);
                    if (var8 == 0) {
                      if (var9 == 45) {
                        var4 = 1;
                        var8++;
                        continue L1;
                      } else {
                        if (var9 != 43) {
                          break L3;
                        } else {
                          if (!param1) {
                            break L3;
                          } else {
                            var8++;
                            continue L1;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      if (48 > var9) {
                        break L5;
                      } else {
                        if (var9 > 57) {
                          break L5;
                        } else {
                          var9 -= 48;
                          break L4;
                        }
                      }
                    }
                    L6: {
                      if (65 > var9) {
                        break L6;
                      } else {
                        if (var9 <= 90) {
                          var9 -= 55;
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (97 > var9) {
                      return false;
                    } else {
                      if (var9 <= 122) {
                        var9 -= 87;
                        break L4;
                      } else {
                        return false;
                      }
                    }
                  }
                  if (param2 <= var9) {
                    return false;
                  } else {
                    L7: {
                      if (var4 == 0) {
                        break L7;
                      } else {
                        var9 = -var9;
                        break L7;
                      }
                    }
                    var10 = param2 * var6 - -var9;
                    if (var10 / param2 != var6) {
                      return false;
                    } else {
                      var5 = 1;
                      var6 = var10;
                      var8++;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              break L0;
            }
          }
        }
        throw new IllegalArgumentException("" + param2);
    }

    final static void a(bd param0, bd param1, int param2, int param3) {
        pe.field_c = param1;
        mj.field_E = param0;
        if (param3 >= -99) {
            Object var5 = null;
            boolean discarded$0 = th.a(-70, false, 43, (CharSequence) null);
        }
        gg.field_d = param2;
        ki.a(ti.field_i / 2, ti.field_b / 2, -116);
        qe.a(param0.field_x, -29770, param1.field_r + param1.field_x, param1.field_x, param0.field_r + param0.field_x);
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_a = null;
        field_b = null;
        if (param0 > -22) {
            field_a = null;
        }
    }

    final static void a(int param0, fk param1, int param2) {
        ha var5 = pg.field_fb;
        var5.f(param0, 950);
        var5.field_k = var5.field_k + 1;
        int var4 = var5.field_k;
        var5.a(false, param2);
        var5.a(false, param1.field_l);
        var5.a((byte) 67, param1.field_p);
        var5.b(0, param1.field_m);
        var5.b(0, param1.field_s);
        var5.b(0, param1.field_o);
        var5.b(0, param1.field_n);
        int discarded$0 = var5.c(var4, (byte) -3);
        var5.a(-var4 + var5.field_k, (byte) 80);
    }

    final static void a(byte param0) {
        int var4 = 0;
        int var5 = stellarshard.field_B;
        pb var1 = new pb(540, 140);
        hj.a(var1, 1);
        cc.a();
        int var2 = 104 / ((param0 - -41) / 39);
        ti.d();
        ni.field_d = 0;
        ja.a(4);
        pb var3 = var1.a();
        for (var4 = 0; var4 < 15; var4++) {
            var3.b(-2, -2, 16777215);
            ti.d(4, 4, 0, 0, 540, 140);
        }
        pd.field_s.e();
        var1.b(0, 0);
        id.b((byte) -58);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Password: ";
        field_a = new int[]{1, 4, 0, 1, 2, 3};
    }
}
