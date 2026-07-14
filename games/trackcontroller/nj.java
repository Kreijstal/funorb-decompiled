/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nj {
    static String field_d;
    String field_c;
    boolean field_e;
    boolean field_f;
    String[] field_a;
    int field_b;

    final static void a(int param0) {
        jf.e(640);
        vg.field_o = true;
        u.field_i = true;
        gl.field_E.l(24910);
        nb.a(oj.field_c, false, -16257);
        if (param0 != -27958) {
            nj.b((byte) -82);
        }
    }

    public static void b(int param0) {
        if (param0 <= 6) {
            nj.a((byte) -57);
        }
        field_d = null;
    }

    final static void b(byte param0) {
        int var1 = 82 % ((param0 - 2) / 59);
        hb.field_i = null;
        dc.field_s = null;
    }

    final static ve a(byte param0, String param1) {
        String var2 = null;
        ve var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        var5 = TrackController.field_F ? 1 : 0;
        if (ug.field_cb != null) {
          L0: {
            var6 = (CharSequence) (Object) param1;
            var2 = r.a(var6, -11133);
            if (param0 >= 122) {
              break L0;
            } else {
              field_d = null;
              break L0;
            }
          }
          L1: {
            if (var2 == null) {
              var2 = param1;
              break L1;
            } else {
              break L1;
            }
          }
          var3 = (ve) (Object) ug.field_cb.a(-1, (long)var2.hashCode());
          L2: while (true) {
            if (var3 != null) {
              L3: {
                var7 = (CharSequence) (Object) var3.field_jb;
                var4 = r.a(var7, -11133);
                if (var4 == null) {
                  var4 = var3.field_jb;
                  break L3;
                } else {
                  break L3;
                }
              }
              if (!var4.equals((Object) (Object) var2)) {
                var3 = (ve) (Object) ug.field_cb.a(-1);
                continue L2;
              } else {
                return var3;
              }
            } else {
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final static void a(byte param0) {
        int var4 = TrackController.field_F ? 1 : 0;
        int[] var5 = ok.field_F;
        int[] var1 = var5;
        int var2 = 0;
        int var3 = var5.length;
        while (var3 > var2) {
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
            var2++;
            var5[var2] = 0;
        }
        if (param0 != 125) {
            field_d = null;
        }
    }

    final static void a(q param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = TrackController.field_F ? 1 : 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 3) {
            var2 = 0;
            L1: while (true) {
              if (var2 >= rk.field_ab) {
                L2: {
                  if (param1 >= 16) {
                    break L2;
                  } else {
                    field_d = null;
                    break L2;
                  }
                }
                rk.field_T[param0.a((byte) -94)] = rk.field_T[param0.a((byte) -94)] + 1;
                var2 = 0;
                var3 = 0;
                L3: while (true) {
                  if (var3 >= rk.field_ab) {
                    rk.field_ab = var2;
                    rk.field_ab = rk.field_ab + 1;
                    rl.field_C[rk.field_ab] = param0;
                    return;
                  } else {
                    L4: {
                      if (param0.field_e == rl.field_C[var3].field_e) {
                        var4 = rl.field_C[var3].a((byte) -123);
                        if (hi.field_y >= rk.field_T[var4]) {
                          break L4;
                        } else {
                          rk.field_T[var4] = rk.field_T[var4] - 1;
                          var3++;
                          continue L3;
                        }
                      } else {
                        break L4;
                      }
                    }
                    var2++;
                    rl.field_C[var2] = rl.field_C[var3];
                    var3++;
                    continue L3;
                  }
                }
              } else {
                if (rl.field_C[var2].field_e == param0.field_e) {
                  rk.field_T[rl.field_C[var2].a((byte) -111)] = rk.field_T[rl.field_C[var2].a((byte) -111)] + 1;
                  var2++;
                  continue L1;
                } else {
                  var2++;
                  continue L1;
                }
              }
            }
          } else {
            rk.field_T[var2] = 0;
            var2++;
            continue L0;
          }
        }
    }

    nj(boolean param0) {
        ((nj) this).field_e = param0 ? true : false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Score: ";
    }
}
