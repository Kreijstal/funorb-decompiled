/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vn {
    static int field_g;
    pg field_e;
    static int field_d;
    static in field_i;
    private pg field_h;
    static int field_c;
    static String field_j;
    static String field_a;
    static qb field_b;
    static String field_f;

    final pg a(boolean param0) {
        if (!param0) {
            return null;
        }
        pg var2 = ((vn) this).field_e.field_a;
        if (!(((vn) this).field_e != var2)) {
            ((vn) this).field_h = null;
            return null;
        }
        ((vn) this).field_h = var2.field_a;
        return var2;
    }

    final pg c(boolean param0) {
        pg var2 = ((vn) this).field_e.field_b;
        if (var2 == ((vn) this).field_e) {
            return null;
        }
        var2.a(param0);
        return var2;
    }

    final pg d(boolean param0) {
        pg var2 = ((vn) this).field_e.field_a;
        if (((vn) this).field_e == var2) {
            return null;
        }
        var2.a(param0);
        return var2;
    }

    final static void a(byte param0) {
        if (!(qe.field_p)) {
            throw new IllegalStateException();
        }
        lh.field_n = true;
        tj.a(true, (byte) -125);
        if (param0 != 4) {
            field_d = 12;
        }
        fj.field_j = 0;
    }

    private final void a(vn param0, int param1, pg param2) {
        if (param1 != 3) {
            Object var5 = null;
            pg discarded$0 = ((vn) this).a((pg) null, -100);
        }
        pg var4 = ((vn) this).field_e.field_a;
        ((vn) this).field_e.field_a = param2.field_a;
        param2.field_a.field_b = ((vn) this).field_e;
        if (((vn) this).field_e != param2) {
            param2.field_a = param0.field_e.field_a;
            param2.field_a.field_b = param2;
            var4.field_b = param0.field_e;
            param0.field_e.field_a = var4;
        }
    }

    final void a(vn param0, boolean param1) {
        this.a(param0, 3, ((vn) this).field_e.field_b);
        if (param1) {
            Object var4 = null;
            boolean discarded$0 = vn.a((eg) null, false, (eg) null, (eg) null);
        }
    }

    final pg a(int param0) {
        if (param0 != 0) {
            field_a = null;
        }
        pg var2 = ((vn) this).field_h;
        if (!(((vn) this).field_e != var2)) {
            ((vn) this).field_h = null;
            return null;
        }
        ((vn) this).field_h = var2.field_b;
        return var2;
    }

    final static void a(byte[] param0, int param1, int param2, int param3, int param4, int param5, int param6, byte[] param7, int param8, boolean param9) {
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        Object var15 = null;
        var14 = ArcanistsMulti.field_G ? 1 : 0;
        var11 = -(param1 >> 1836440002);
        param1 = -(param1 & 3);
        var12 = -param6;
        L0: while (true) {
          if (-1 >= (var12 ^ -1)) {
            L1: {
              if (param3 >= 102) {
                break L1;
              } else {
                var15 = null;
                boolean discarded$1 = vn.a((CharSequence) null, -78);
                break L1;
              }
            }
            return;
          } else {
            var13 = var11;
            L2: while (true) {
              if (var13 >= 0) {
                var13 = param1;
                L3: while (true) {
                  if (-1 <= var13) {
                    param4 = param4 + param8;
                    param2 = param2 + param5;
                    var12++;
                    continue L0;
                  } else {
                    param2++;
                    var10 = param0[param2];
                    if (var10 != 0) {
                      L4: {
                        if (param9) {
                          break L4;
                        } else {
                          if (-1 == (param7[param4] ^ -1)) {
                            break L4;
                          } else {
                            param4++;
                            var13++;
                            continue L3;
                          }
                        }
                      }
                      param4++;
                      param7[param4] = (byte)var10;
                      var13++;
                      continue L3;
                    } else {
                      param4++;
                      var13++;
                      continue L3;
                    }
                  }
                }
              } else {
                L5: {
                  L6: {
                    param2++;
                    var10 = param0[param2];
                    if (0 == var10) {
                      break L6;
                    } else {
                      L7: {
                        if (param9) {
                          break L7;
                        } else {
                          if (-1 == (param7[param4] ^ -1)) {
                            break L7;
                          } else {
                            break L6;
                          }
                        }
                      }
                      param4++;
                      param7[param4] = (byte)var10;
                      break L5;
                    }
                  }
                  param4++;
                  break L5;
                }
                L8: {
                  L9: {
                    param2++;
                    var10 = param0[param2];
                    if (var10 == 0) {
                      break L9;
                    } else {
                      L10: {
                        if (param9) {
                          break L10;
                        } else {
                          if (param7[param4] != 0) {
                            break L9;
                          } else {
                            break L10;
                          }
                        }
                      }
                      param4++;
                      param7[param4] = (byte)var10;
                      break L8;
                    }
                  }
                  param4++;
                  break L8;
                }
                L11: {
                  L12: {
                    param2++;
                    var10 = param0[param2];
                    if (var10 == -1) {
                      break L12;
                    } else {
                      L13: {
                        if (param9) {
                          break L13;
                        } else {
                          if (-1 == param7[param4]) {
                            break L13;
                          } else {
                            break L12;
                          }
                        }
                      }
                      param4++;
                      param7[param4] = (byte)var10;
                      break L11;
                    }
                  }
                  param4++;
                  break L11;
                }
                param2++;
                var10 = param0[param2];
                if (var10 != 0) {
                  L14: {
                    if (param9) {
                      break L14;
                    } else {
                      if (-1 == param7[param4]) {
                        break L14;
                      } else {
                        param4++;
                        var13++;
                        continue L2;
                      }
                    }
                  }
                  param4++;
                  param7[param4] = (byte)var10;
                  var13++;
                  continue L2;
                } else {
                  param4++;
                  var13++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    final pg a(pg param0, int param1) {
        pg var3 = null;
        if (param0 != null) {
            var3 = param0;
        } else {
            var3 = ((vn) this).field_e.field_b;
        }
        if (((vn) this).field_e == var3) {
            ((vn) this).field_h = null;
            return null;
        }
        ((vn) this).field_h = var3.field_b;
        int var4 = -40 / ((param1 - 22) / 52);
        return var3;
    }

    final void a(pg param0, byte param1) {
        if (param0.field_a != null) {
            param0.a(true);
        }
        param0.field_a = ((vn) this).field_e;
        param0.field_b = ((vn) this).field_e.field_b;
        param0.field_a.field_b = param0;
        param0.field_b.field_a = param0;
        if (param1 != -58) {
            ((vn) this).field_e = null;
        }
    }

    final pg b(byte param0) {
        if (param0 < 16) {
            field_f = null;
        }
        pg var2 = ((vn) this).field_h;
        if (!(var2 != ((vn) this).field_e)) {
            ((vn) this).field_h = null;
            return null;
        }
        ((vn) this).field_h = var2.field_a;
        return var2;
    }

    final static boolean a(CharSequence param0, int param1) {
        int var2 = 0;
        int var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (!(qc.a(param1 + 640, true, param0))) {
            return false;
        }
        for (var2 = param1; var2 < param0.length(); var2++) {
            if (!(qo.a(param0.charAt(var2), 0))) {
                return false;
            }
        }
        return true;
    }

    public vn() {
        ((vn) this).field_e = new pg();
        ((vn) this).field_e.field_a = ((vn) this).field_e;
        ((vn) this).field_e.field_b = ((vn) this).field_e;
    }

    final void c(int param0) {
        int var2 = 0;
        pg var3 = null;
        int var4 = 0;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = 76 / ((-64 - param0) / 59);
        L0: while (true) {
          var3 = ((vn) this).field_e.field_b;
          if (var3 != ((vn) this).field_e) {
            var3.a(true);
            continue L0;
          } else {
            ((vn) this).field_h = null;
            return;
          }
        }
    }

    public static void e(boolean param0) {
        field_b = null;
        field_a = null;
        if (!param0) {
            Object var2 = null;
            boolean discarded$0 = vn.a((eg) null, false, (eg) null, (eg) null);
        }
        field_j = null;
        field_i = null;
        field_f = null;
    }

    final boolean b(boolean param0) {
        if (!param0) {
            ((vn) this).field_h = null;
        }
        return ((vn) this).field_e == ((vn) this).field_e.field_b ? true : false;
    }

    final void b(pg param0, int param1) {
        if (param1 != -1) {
            return;
        }
        if (null != param0.field_a) {
            param0.a(true);
        }
        param0.field_a = ((vn) this).field_e.field_a;
        param0.field_b = ((vn) this).field_e;
        param0.field_a.field_b = param0;
        param0.field_b.field_a = param0;
    }

    final static boolean a(eg param0, boolean param1, eg param2, eg param3) {
        L0: {
          if (param1) {
            break L0;
          } else {
            vn.e(true);
            break L0;
          }
        }
        L1: {
          if (!param3.c(-10923)) {
            break L1;
          } else {
            if (!param3.a("commonui", -24417)) {
              break L1;
            } else {
              if (!param2.c(-10923)) {
                return false;
              } else {
                if (param2.a("commonui", -24417)) {
                  L2: {
                    if (!param0.c(-10923)) {
                      break L2;
                    } else {
                      if (param0.a("button.gif", -24417)) {
                        return true;
                      } else {
                        break L2;
                      }
                    }
                  }
                  return false;
                } else {
                  return false;
                }
              }
            }
          }
        }
        return false;
    }

    final pg b(int param0) {
        if (param0 != 12623) {
            field_c = -68;
        }
        pg var2 = ((vn) this).field_e.field_b;
        if (!(var2 != ((vn) this).field_e)) {
            ((vn) this).field_h = null;
            return null;
        }
        ((vn) this).field_h = var2.field_b;
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
        field_j = "The Book of Cogs is only available once you have purchased your first prestige hat, after having previously purchased all the other spells. Buy new spells by earning wands in Rated multiplayer games.";
        field_a = "  You summon your familiar by clicking the familiar icon on the game screen.";
    }
}
