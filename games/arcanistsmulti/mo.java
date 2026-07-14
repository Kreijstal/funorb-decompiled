/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mo {
    static String field_l;
    static kc field_o;
    private int field_e;
    private tf[] field_n;
    static int field_p;
    static String field_d;
    static qb[] field_a;
    static int field_h;
    private int field_i;
    static String field_g;
    static String field_f;
    private tf field_k;
    private tf field_c;
    static qb[] field_b;
    private long field_m;
    static String field_j;

    final tf a(int param0) {
        int var3 = 0;
        tf var4 = null;
        tf var5 = null;
        tf var9 = null;
        tf var12 = null;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        if (param0 > (((mo) this).field_i ^ -1)) {
          if (((mo) this).field_k != ((mo) this).field_n[((mo) this).field_i + -1]) {
            var12 = ((mo) this).field_k;
            ((mo) this).field_k = var12.field_l;
            return var12;
          } else {
            L0: while (true) {
              if (((mo) this).field_i < ((mo) this).field_e) {
                ((mo) this).field_i = ((mo) this).field_i + 1;
                var4 = ((mo) this).field_n[((mo) this).field_i].field_l;
                var9 = var4;
                if (var4 == ((mo) this).field_n[-1 + ((mo) this).field_i]) {
                  continue L0;
                } else {
                  ((mo) this).field_k = var9.field_l;
                  return var9;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          L1: while (true) {
            if (((mo) this).field_i < ((mo) this).field_e) {
              ((mo) this).field_i = ((mo) this).field_i + 1;
              var4 = ((mo) this).field_n[((mo) this).field_i].field_l;
              var5 = var4;
              if (var4 == ((mo) this).field_n[-1 + ((mo) this).field_i]) {
                continue L1;
              } else {
                ((mo) this).field_k = var5.field_l;
                return var5;
              }
            } else {
              return null;
            }
          }
        }
    }

    final tf f(int param0) {
        ((mo) this).field_i = 0;
        int var2 = -85 / ((param0 - 26) / 58);
        return ((mo) this).a(-1);
    }

    final static fg a(byte param0, eg param1, int param2) {
        byte[] var4 = null;
        byte[] var3 = null;
        if (param0 != -127) {
            field_j = null;
            var4 = param1.d(param2, 31662);
            var3 = var4;
            if (var4 == null) {
                return null;
            }
            return new fg(var4);
        }
        var4 = param1.d(param2, 31662);
        var3 = var4;
        if (var4 == null) {
            return null;
        }
        return new fg(var4);
    }

    final tf d(int param0) {
        tf var3 = null;
        int var4 = ArcanistsMulti.field_G ? 1 : 0;
        if (null == ((mo) this).field_c) {
            return null;
        }
        tf var2 = ((mo) this).field_n[(int)((long)(-1 + ((mo) this).field_e) & ((mo) this).field_m)];
        while (((mo) this).field_c != var2) {
            if (!(((mo) this).field_c.field_k != ((mo) this).field_m)) {
                var3 = ((mo) this).field_c;
                ((mo) this).field_c = ((mo) this).field_c.field_l;
                return var3;
            }
            ((mo) this).field_c = ((mo) this).field_c.field_l;
        }
        if (param0 >= -12) {
            return null;
        }
        ((mo) this).field_c = null;
        return null;
    }

    final static void g(int param0) {
        if (param0 != -1) {
            field_b = null;
            ff.a(true, kf.field_a, (byte) -97, on.field_d);
            di.field_h = true;
            return;
        }
        ff.a(true, kf.field_a, (byte) -97, on.field_d);
        di.field_h = true;
    }

    final static int b(int param0) {
        if (param0 != 25117) {
            return -35;
        }
        return ih.field_b;
    }

    final static void a(int param0, boolean param1, int param2) {
        wa var3 = null;
        ne var4 = null;
        String var5_ref = null;
        int var5 = 0;
        int var6 = 0;
        if (param0 != 1) {
            field_j = null;
            var3 = bj.a(param1, -3, param2);
            if (!(var3 == null)) {
                eo.field_c.a((byte) 72, false);
                var4 = eo.field_c;
                var5_ref = vk.field_z;
                var4.field_l.a(5, var5_ref, (byte) -26);
                var4 = eo.field_c;
                var5 = pb.field_h;
                var6 = ja.field_s;
                var4.field_l.a(0, 0, param0 + -29467, var6, var5);
            }
            hg.a(param2, param1, false);
            return;
        }
        var3 = bj.a(param1, -3, param2);
        if (!(var3 == null)) {
            eo.field_c.a((byte) 72, false);
            var4 = eo.field_c;
            var5_ref = vk.field_z;
            var4.field_l.a(5, var5_ref, (byte) -26);
            var4 = eo.field_c;
            var5 = pb.field_h;
            var6 = ja.field_s;
            var4.field_l.a(0, 0, param0 + -29467, var6, var5);
        }
        hg.a(param2, param1, false);
    }

    final static ri a(String param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        var2 = param0.length();
        if (param1 == 45) {
          if (var2 == 0) {
            return uh.field_i;
          } else {
            if ((var2 ^ -1) < -64) {
              return b.field_e;
            } else {
              var3 = 0;
              L0: while (true) {
                if (var2 > var3) {
                  var4 = param0.charAt(var3);
                  if (var4 == 45) {
                    L1: {
                      if (0 == var3) {
                        break L1;
                      } else {
                        if (var3 == var2 - 1) {
                          break L1;
                        } else {
                          var3++;
                          var3++;
                          continue L0;
                        }
                      }
                    }
                    return n.field_b;
                  } else {
                    if (-1 == rj.field_e.indexOf(var4)) {
                      return n.field_b;
                    } else {
                      var3++;
                      continue L0;
                    }
                  }
                } else {
                  return null;
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    public static void c(int param0) {
        field_l = null;
        if (param0 != 0) {
            int discarded$0 = mo.b(31);
            field_d = null;
            field_j = null;
            field_a = null;
            field_f = null;
            field_b = null;
            field_g = null;
            field_o = null;
            return;
        }
        field_d = null;
        field_j = null;
        field_a = null;
        field_f = null;
        field_b = null;
        field_g = null;
        field_o = null;
    }

    final void a(tf param0, long param1, byte param2) {
        if (!(null == param0.field_i)) {
            param0.a((byte) 88);
        }
        tf var5 = ((mo) this).field_n[(int)((long)(((mo) this).field_e - 1) & param1)];
        param0.field_i = var5.field_i;
        param0.field_l = var5;
        param0.field_i.field_l = param0;
        param0.field_l.field_i = param0;
        if (param2 <= 106) {
            mo.a(109, true, 64);
            param0.field_k = param1;
            return;
        }
        param0.field_k = param1;
    }

    final tf a(long param0, byte param1) {
        tf var5 = null;
        int var6 = ArcanistsMulti.field_G ? 1 : 0;
        ((mo) this).field_m = param0;
        tf var4 = ((mo) this).field_n[(int)(param0 & (long)(((mo) this).field_e + -1))];
        ((mo) this).field_c = var4.field_l;
        while (var4 != ((mo) this).field_c) {
            if (!(param0 != ((mo) this).field_c.field_k)) {
                var5 = ((mo) this).field_c;
                ((mo) this).field_c = ((mo) this).field_c.field_l;
                return var5;
            }
            ((mo) this).field_c = ((mo) this).field_c.field_l;
        }
        if (param1 > -61) {
            return null;
        }
        ((mo) this).field_c = null;
        return null;
    }

    mo(int param0) {
        int var2 = 0;
        tf var3 = null;
        ((mo) this).field_i = 0;
        ((mo) this).field_e = param0;
        ((mo) this).field_n = new tf[param0];
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            var3 = new tf();
            ((mo) this).field_n[var2] = new tf();
            var3.field_l = var3;
            var3.field_i = var3;
            var2++;
            continue L0;
          } else {
          }
        }
    }

    final static void e(int param0) {
        fk var1 = null;
        int var2 = 0;
        var2 = ArcanistsMulti.field_G ? 1 : 0;
        oh.field_k.g();
        lf.field_a.g();
        if (param0 == 200) {
          L0: {
            ja.field_u = ja.field_u - 1;
            if (ja.field_u != 0) {
              break L0;
            } else {
              ja.field_u = 200;
              var1 = (fk) (Object) qn.field_mb.b(12623);
              L1: while (true) {
                if (var1 == null) {
                  if (he.field_f == null) {
                    break L0;
                  } else {
                    var1 = (fk) (Object) he.field_f.b(12623);
                    L2: while (true) {
                      if (var1 == null) {
                        break L0;
                      } else {
                        L3: {
                          if (!var1.field_n.b((byte) -44)) {
                            var1.a(true);
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var1 = (fk) (Object) he.field_f.a(0);
                        continue L2;
                      }
                    }
                  }
                } else {
                  L4: {
                    if (!var1.field_n.b((byte) -93)) {
                      var1.a(true);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  var1 = (fk) (Object) qn.field_mb.a(0);
                  continue L1;
                }
              }
            }
          }
          if (null != jl.field_h) {
            if (jl.field_h.e((byte) -8)) {
              return;
            } else {
              f.field_g = null;
              return;
            }
          } else {
            return;
          }
        } else {
          field_a = null;
          ja.field_u = ja.field_u - 1;
          if (ja.field_u == 0) {
            ja.field_u = 200;
            var1 = (fk) (Object) qn.field_mb.b(12623);
            L5: while (true) {
              if (var1 == null) {
                if (he.field_f != null) {
                  var1 = (fk) (Object) he.field_f.b(12623);
                  L6: while (true) {
                    if (var1 == null) {
                      if (null != jl.field_h) {
                        if (jl.field_h.e((byte) -8)) {
                          return;
                        } else {
                          f.field_g = null;
                          return;
                        }
                      } else {
                        return;
                      }
                    } else {
                      L7: {
                        if (!var1.field_n.b((byte) -44)) {
                          var1.a(true);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      var1 = (fk) (Object) he.field_f.a(0);
                      continue L6;
                    }
                  }
                } else {
                  if (null != jl.field_h) {
                    if (jl.field_h.e((byte) -8)) {
                      return;
                    } else {
                      f.field_g = null;
                      return;
                    }
                  } else {
                    return;
                  }
                }
              } else {
                L8: {
                  if (!var1.field_n.b((byte) -93)) {
                    var1.a(true);
                    break L8;
                  } else {
                    break L8;
                  }
                }
                var1 = (fk) (Object) qn.field_mb.a(0);
                continue L5;
              }
            }
          } else {
            if (null != jl.field_h) {
              if (jl.field_h.e((byte) -8)) {
                return;
              } else {
                f.field_g = null;
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = "You have fallen into the water! Falling into the water will cause you to cast an emergency Arcane Gate spell, even if it is not in your spellbook. If that is the case, you will lose half of your current health, so try to avoid it. You will not lose health if the Arcane Gate spell is ready to cast in your spellbook.";
        field_d = "Sandbox";
        field_p = -1;
        field_g = "Accept rematch";
        field_j = "Quick Chat Help";
    }
}
