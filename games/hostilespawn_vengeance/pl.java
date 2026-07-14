/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    static nd field_q;
    byte[] field_m;
    static bd field_p;
    int field_d;
    static bd field_j;
    int field_c;
    int field_h;
    byte[] field_n;
    int field_b;
    int field_g;
    int field_o;
    static bd field_f;
    int field_e;
    static boolean field_l;
    static boolean field_k;
    static String field_a;
    static byte[][] field_i;

    public static void a(boolean param0) {
        field_q = null;
        if (!param0) {
            return;
        }
        field_a = null;
        field_p = null;
        field_f = null;
        field_j = null;
        field_i = null;
    }

    final static void a(int param0) {
        int var3 = 0;
        int var4 = HostileSpawn.field_I ? 1 : 0;
        bd var1 = new bd(540, 140);
        sb.a(var1, -118);
        ge.b();
        si.d();
        tk.field_e = 0;
        uc.b(-40);
        bd var2 = var1.h();
        if (param0 != -16183) {
            Object var5 = null;
            pl.a((byte) -53, (oj) null, -107);
        }
        for (var3 = 0; var3 < 15; var3++) {
            var2.a(-2, -2, 16777215);
            si.d(4, 4, 0, 0, 540, 140);
        }
        ti.field_c.a();
        var1.f(0, 0);
        eh.b(false);
    }

    final static void a(byte param0, oj param1, int param2) {
        L0: {
          L1: {
            if (param1.field_n) {
              break L1;
            } else {
              L2: {
                if (0 < ln.field_a.field_i[param2]) {
                  break L2;
                } else {
                  if (0 < ln.field_a.field_i[-1 + param2]) {
                    break L2;
                  } else {
                    if (-1 > (ln.field_a.field_i[-ln.field_a.field_d + (param2 - 1)] ^ -1)) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
              }
              param1.field_n = true;
              break L0;
            }
          }
          if (!param1.field_n) {
            break L0;
          } else {
            if (0 >= nl.field_d) {
              break L0;
            } else {
              L3: {
                if (al.field_Q < 160) {
                  al.field_Q = al.field_Q + 50;
                  jh.a(3 * uh.field_i / 2, (byte) 69, 41, jc.field_c, 6);
                  break L3;
                } else {
                  break L3;
                }
              }
              param1.a(false, 0, 21963, 1, rl.field_c, param1.field_j);
              param1.field_l.a(0.9, 0.9, 1);
              mm.field_m[el.field_j] = new oj(param1.field_j, 232, rl.field_c);
              mm.field_m[el.field_j].field_e = 250;
              mm.field_m[el.field_j].field_b = false;
              mm.field_m[el.field_j].field_w = 0;
              el.field_j = el.field_j + 1;
              return;
            }
          }
        }
        L4: {
          L5: {
            if (-1 > param1.field_I) {
              break L5;
            } else {
              if (-6 == param1.field_w) {
                break L5;
              } else {
                L6: {
                  if (-161 < (al.field_Q ^ -1)) {
                    al.field_Q = al.field_Q + 50;
                    jh.a(uh.field_i * 3 / 2, (byte) 41, 41, jc.field_c, 6);
                    break L6;
                  } else {
                    break L6;
                  }
                }
                param1.field_z = 0;
                param1.field_w = 5;
                param1.e((byte) -49);
                if (ln.field_a.field_c[param2] != 4) {
                  break L4;
                } else {
                  ln.field_a.field_c[param2] = 0;
                  break L4;
                }
              }
            }
          }
          if (-1 <= param1.field_I) {
            break L4;
          } else {
            L7: {
              if (-1 == ln.field_a.field_c[param2]) {
                break L7;
              } else {
                if (1 != ln.field_a.field_c[param2]) {
                  break L4;
                } else {
                  break L7;
                }
              }
            }
            ln.field_a.field_c[param2] = 4;
            break L4;
          }
        }
        if (param0 >= 101) {
          L8: {
            if (param1.field_I > 0) {
              break L8;
            } else {
              if (-25 != (param1.field_i ^ -1)) {
                break L8;
              } else {
                param1.a(false, 0, 21963, 1, rl.field_c, param1.field_j);
                param1.field_l.a(0.9, 0.9, 1);
                mm.field_m[el.field_j] = new oj(param1.field_j, 232, rl.field_c);
                mm.field_m[el.field_j].field_e = 250;
                mm.field_m[el.field_j].field_b = false;
                mm.field_m[el.field_j].field_w = 0;
                el.field_j = el.field_j + 1;
                break L8;
              }
            }
          }
          return;
        } else {
          return;
        }
    }

    final static boolean a(boolean param0, int param1, CharSequence param2) {
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = HostileSpawn.field_I ? 1 : 0;
        if (param2 == null) {
          return false;
        } else {
          var3 = param2.length();
          if (1 > var3) {
            return false;
          } else {
            if (-13 <= (var3 ^ -1)) {
              L0: {
                var4 = mf.a(false, param2);
                if (var4 == null) {
                  break L0;
                } else {
                  if ((var4.length() ^ -1) <= -2) {
                    L1: {
                      if (rg.a((byte) -109, var4.charAt(0))) {
                        break L1;
                      } else {
                        if (!rg.a((byte) -109, var4.charAt(-1 + var4.length()))) {
                          L2: {
                            var5 = 0;
                            if (param1 == 12864) {
                              break L2;
                            } else {
                              field_f = null;
                              break L2;
                            }
                          }
                          var6 = 0;
                          L3: while (true) {
                            if (param2.length() <= var6) {
                              if (0 >= var5) {
                                return true;
                              } else {
                                return false;
                              }
                            } else {
                              L4: {
                                var7 = param2.charAt(var6);
                                if (!rg.a((byte) -109, (char) var7)) {
                                  var5 = 0;
                                  break L4;
                                } else {
                                  var5++;
                                  break L4;
                                }
                              }
                              if (2 <= var5) {
                                if (!param0) {
                                  return false;
                                } else {
                                  var6++;
                                  continue L3;
                                }
                              } else {
                                var6++;
                                continue L3;
                              }
                            }
                          }
                        } else {
                          break L1;
                        }
                      }
                    }
                    return false;
                  } else {
                    break L0;
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

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new nd(9, 0, 4, 1);
        field_l = false;
        field_k = false;
        field_a = "Friends can be added in multiplayer<nbsp>games";
        field_i = new byte[250][];
    }
}
