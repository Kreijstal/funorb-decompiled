/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we extends ta implements ai {
    static String field_F;
    static String field_A;
    static boolean field_B;
    private String[] field_D;
    private bf field_E;
    private s[] field_C;

    public final void a(byte param0, int param1, int param2, s param3, int param4) {
        int var6 = 0;
        int var7 = 0;
        var7 = OrbDefence.field_D ? 1 : 0;
        var6 = 0;
        L0: while (true) {
          if (var6 >= ((we) this).field_D.length) {
            L1: {
              var6 = 2 % ((-3 - param0) / 62);
              if (((we) this).field_C[((we) this).field_D.length] == param3) {
                ((we) this).field_E.a((byte) -8);
                break L1;
              } else {
                break L1;
              }
            }
            return;
          } else {
            if (param3 == ((we) this).field_C[var6]) {
              ((we) this).field_E.a(120, ((we) this).field_D[var6]);
              var6++;
              continue L0;
            } else {
              var6++;
              continue L0;
            }
          }
        }
    }

    final boolean a(char param0, int param1, pj param2, int param3) {
        if (!(!super.a(param0, param1, param2, param3))) {
            return true;
        }
        if (-99 == param1) {
            return ((we) this).a(param2, false);
        }
        if (-100 != param1) {
            return false;
        }
        return ((we) this).b(param2, false);
    }

    we(bf param0) {
        super(0, 0, 0, 0, (td) null);
        ((we) this).field_E = param0;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (!(param1 == 0)) {
            return;
        }
        kc var5 = lm.field_f;
        if (null != ((we) this).field_D) {
            int discarded$0 = var5.a(pe.field_c, ((we) this).field_s + param3, ((we) this).field_n + param0, ((we) this).field_m, 20, 16777215, -1, 0, 0, var5.field_B + var5.field_H);
        }
    }

    final void a(String[] param0, byte param1) {
        int var3 = 0;
        int var4_int = 0;
        qc var4 = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = OrbDefence.field_D ? 1 : 0;
          ((we) this).field_x.a(false);
          if (param0 == null) {
            break L0;
          } else {
            if (param0.length == 0) {
              break L0;
            } else {
              var3 = param0.length;
              ((we) this).field_D = new String[var3];
              var4_int = 0;
              L1: while (true) {
                if (var3 <= var4_int) {
                  var4 = new qc(lm.field_f, 0, 1);
                  ((we) this).field_C = new s[1 + var3];
                  var5 = 0;
                  L2: while (true) {
                    if (var3 <= var5) {
                      L3: {
                        if (param1 == -34) {
                          break L3;
                        } else {
                          ((we) this).a(95, -43, 80, 127);
                          break L3;
                        }
                      }
                      ((we) this).field_C[var3] = new s(mm.field_B, (ag) this);
                      ((we) this).field_C[var3].field_j = (td) (Object) var4;
                      ((we) this).field_C[var3].a(0, 20 + (var3 + 1) * 16, 15, (byte) -90, 100);
                      ((we) this).a((pj) (Object) ((we) this).field_C[var3], (byte) 74);
                      return;
                    } else {
                      ((we) this).field_C[var5] = new s(((we) this).field_D[var5], (ag) this);
                      ((we) this).field_C[var5].field_j = (td) (Object) var4;
                      ((we) this).field_C[var5].field_i = oa.field_f;
                      ((we) this).field_C[var5].a(0, var5 * 16 + 20, 15, (byte) -90, 80);
                      ((we) this).a((pj) (Object) ((we) this).field_C[var5], (byte) 74);
                      var5++;
                      continue L2;
                    }
                  }
                } else {
                  ((we) this).field_D[var4_int] = g.a((CharSequence) (Object) param0[var4_int], (byte) -119).replace(' ', ' ');
                  var4_int++;
                  continue L1;
                }
              }
            }
          }
        }
        ((we) this).field_D = null;
    }

    final static boolean a(int param0, int param1, CharSequence param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        L0: {
          var11 = OrbDefence.field_D ? 1 : 0;
          if (param1 == 87) {
            break L0;
          } else {
            var12 = null;
            boolean discarded$1 = we.a(24, 92, (CharSequence) null, true);
            break L0;
          }
        }
        L1: {
          if (2 > param0) {
            break L1;
          } else {
            if (-37 <= (param0 ^ -1)) {
              var4 = 0;
              var5 = 0;
              var6 = 0;
              var7 = param2.length();
              var8 = 0;
              L2: while (true) {
                if (var8 >= var7) {
                  return var5 != 0;
                } else {
                  L3: {
                    var9 = param2.charAt(var8);
                    if (-1 != (var8 ^ -1)) {
                      break L3;
                    } else {
                      if (var9 != 45) {
                        if (var9 != 43) {
                          break L3;
                        } else {
                          if (!param3) {
                            break L3;
                          } else {
                            var8++;
                            continue L2;
                          }
                        }
                      } else {
                        var4 = 1;
                        var8++;
                        continue L2;
                      }
                    }
                  }
                  L4: {
                    L5: {
                      if (var9 < 48) {
                        break L5;
                      } else {
                        if (57 >= var9) {
                          var9 -= 48;
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var9 < 65) {
                        break L6;
                      } else {
                        if (90 < var9) {
                          break L6;
                        } else {
                          var9 -= 55;
                          break L4;
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
                  if (param0 <= var9) {
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
                    var10 = var6 * param0 - -var9;
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
            } else {
              break L1;
            }
          }
        }
        throw new IllegalArgumentException("" + param0);
    }

    public static void k(int param0) {
        field_A = null;
        if (param0 != 29858) {
            return;
        }
        field_F = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_F = "Score";
        field_A = "TOUGHO";
        field_B = false;
    }
}
