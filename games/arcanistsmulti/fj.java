/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fj extends pg {
    static String field_g;
    static int field_h;
    static String field_i;
    static int field_j;
    int field_k;

    final static void a(java.awt.Component param0, int param1) {
        param0.removeKeyListener((java.awt.event.KeyListener) (Object) ch.field_a);
        if (param1 <= 77) {
            field_j = -47;
        }
        param0.removeFocusListener((java.awt.event.FocusListener) (Object) ch.field_a);
        ub.field_b = -1;
    }

    final static boolean a(int param0, CharSequence param1, boolean param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        L0: {
          var11 = ArcanistsMulti.field_G ? 1 : 0;
          if ((param3 ^ -1) > -3) {
            break L0;
          } else {
            if (36 < param3) {
              break L0;
            } else {
              L1: {
                var4 = 0;
                var5 = 0;
                var6 = 0;
                var7 = param1.length();
                if (param0 == 97) {
                  break L1;
                } else {
                  field_h = -110;
                  break L1;
                }
              }
              var8 = 0;
              L2: while (true) {
                if (var8 >= var7) {
                  return var5 != 0;
                } else {
                  L3: {
                    var9 = param1.charAt(var8);
                    if (0 == var8) {
                      if (45 == var9) {
                        var4 = 1;
                        var8++;
                        continue L2;
                      } else {
                        if (var9 != 43) {
                          break L3;
                        } else {
                          if (!param2) {
                            break L3;
                          } else {
                            var8++;
                            continue L2;
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    L5: {
                      if (var9 < 48) {
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
                      if (var9 < 65) {
                        break L6;
                      } else {
                        if (var9 > 90) {
                          break L6;
                        } else {
                          var9 -= 55;
                          break L4;
                        }
                      }
                    }
                    L7: {
                      if (97 > var9) {
                        break L7;
                      } else {
                        if (122 < var9) {
                          break L7;
                        } else {
                          var9 -= 87;
                          break L4;
                        }
                      }
                    }
                    return false;
                  }
                  if (var9 < param3) {
                    L8: {
                      if (var4 == 0) {
                        break L8;
                      } else {
                        var9 = -var9;
                        break L8;
                      }
                    }
                    var10 = param3 * var6 - -var9;
                    if (var10 / param3 != var6) {
                      return false;
                    } else {
                      var6 = var10;
                      var5 = 1;
                      var8++;
                      continue L2;
                    }
                  } else {
                    return false;
                  }
                }
              }
            }
          }
        }
        throw new IllegalArgumentException("" + param3);
    }

    final static void a(int param0, nk param1, int param2) {
        ab var3 = he.field_e;
        var3.b((byte) -36, param2);
        if (param0 != -26971) {
            Object var4 = null;
            qb discarded$0 = fj.a((String) null, 34, (eg) null, (String) null);
        }
        var3.f(param1.field_p, (byte) -41);
        var3.f(param1.field_t, (byte) -85);
    }

    final static qb a(String param0, int param1, eg param2, String param3) {
        int var4 = param2.c(param0, 98);
        if (param1 != -22612) {
            field_h = -32;
        }
        int var5 = param2.a(param3, (byte) 106, var4);
        return r.a(param1 + 4684, var5, var4, param2);
    }

    static int b(int param0, int param1) {
        return param0 | param1;
    }

    private fj() throws Throwable {
        throw new Error();
    }

    final static void c(int param0) {
        if (!(hk.field_s)) {
            throw new IllegalStateException();
        }
        if (param0 >= -107) {
            Object var2 = null;
            fj.a(-37, (nk) null, 73);
        }
        if (!(null == vf.field_k)) {
            vf.field_k.h(77);
        }
        String var1 = ho.b((byte) 103);
        wh.field_f = new e(var1, (String) null, true, false, false);
        p.field_b.b((qm) (Object) g.field_e, 15637);
        g.field_e.a((byte) -92, (qm) (Object) wh.field_f);
        g.field_e.a(111);
    }

    public static void a(int param0) {
        if (param0 <= 74) {
            return;
        }
        field_g = null;
        field_i = null;
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (!(param0 != 0)) {
            return 0;
        }
        if (param0 < -1) {
            var2 = 1;
            if (-65536 < param0) {
                param0 = param0 >> 16;
                var2 += 16;
            }
            if (!(param0 <= 255)) {
                param0 = param0 >> 8;
                var2 += 8;
            }
            if (15 < param0) {
                param0 = param0 >> 4;
                var2 += 4;
            }
            if (!(-4 <= (param0 ^ -1))) {
                var2 += 2;
                param0 = param0 >> 2;
            }
            if (param0 > 1) {
                var2++;
                param0 = param0 >> 1;
            }
            return var2;
        }
        if (param1 != 29797) {
            Object var3 = null;
            fj.a(-58, (nk) null, 1);
        }
        var2 = 2;
        if (!((param0 ^ -1) <= 65535)) {
            param0 = param0 >> 16;
            var2 += 16;
        }
        if (!(-256 <= param0)) {
            param0 = param0 >> 8;
            var2 += 8;
        }
        if (!(-16 <= param0)) {
            var2 += 4;
            param0 = param0 >> 4;
        }
        if (3 < (param0 ^ -1)) {
            param0 = param0 >> 2;
            var2 += 2;
        }
        if ((param0 ^ -1) > 1) {
            param0 = param0 >> 1;
            var2++;
        }
        return var2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Movement:";
    }
}
