/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ji extends rqa {
    static qkb field_p;
    static int[] field_o;

    ji(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static boolean b(boolean param0) {
        boolean[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        boolean[] var5 = null;
        var4 = VoidHunters.field_G;
        var5 = qd.field_a;
        var1 = var5;
        var2 = 0;
        L0: while (true) {
          if (var5.length <= var2) {
            if (!param0) {
              boolean discarded$2 = ji.b(false);
              return true;
            } else {
              return true;
            }
          } else {
            var3 = var5[var2] ? 1 : 0;
            if (var3 != 0) {
              var2++;
              continue L0;
            } else {
              return false;
            }
          }
        }
    }

    final static void e(int param0) {
        ana var1 = null;
        int var2 = 0;
        var2 = VoidHunters.field_G;
        if (param0 == 200) {
          flb.field_o.h();
          aaa.field_b.h();
          m.field_o = m.field_o - 1;
          if (m.field_o == 0) {
            m.field_o = 200;
            var1 = (ana) (Object) cg.field_p.d(0);
            L0: while (true) {
              if (var1 == null) {
                L1: {
                  if (rd.field_o == null) {
                    break L1;
                  } else {
                    var1 = (ana) (Object) rd.field_o.d(0);
                    L2: while (true) {
                      if (var1 == null) {
                        break L1;
                      } else {
                        L3: {
                          if (var1.field_g.b((byte) -63)) {
                            break L3;
                          } else {
                            var1.b(-3846);
                            break L3;
                          }
                        }
                        var1 = (ana) (Object) rd.field_o.a((byte) 47);
                        continue L2;
                      }
                    }
                  }
                }
                L4: {
                  if (aab.field_o == null) {
                    break L4;
                  } else {
                    if (aab.field_o.c(-100)) {
                      break L4;
                    } else {
                      dha.field_u = null;
                      return;
                    }
                  }
                }
                return;
              } else {
                L5: {
                  if (var1.field_g.b((byte) -63)) {
                    break L5;
                  } else {
                    var1.b(-3846);
                    break L5;
                  }
                }
                var1 = (ana) (Object) cg.field_p.a((byte) 96);
                continue L0;
              }
            }
          } else {
            if (aab.field_o != null) {
              if (!aab.field_o.c(-100)) {
                dha.field_u = null;
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        } else {
          return;
        }
    }

    final nc a(nc[] param0, int param1) {
        if (param1 >= -119) {
          boolean discarded$2 = ji.b(true);
          qua.field_b = param0[0].d(0);
          return new nc((Object) (Object) "void");
        } else {
          qua.field_b = param0[0].d(0);
          return new nc((Object) (Object) "void");
        }
    }

    public static void a(int param0) {
        if (param0 != 200) {
            return;
        }
        field_o = null;
        field_p = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new int[8192];
    }
}
