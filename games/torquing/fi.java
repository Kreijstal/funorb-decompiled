/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi {
    private la field_a;
    private eb field_d;
    private la field_b;
    static String field_f;
    private eb field_e;
    static String field_c;

    final gg a(int param0, int param1, byte param2) {
        if (param2 != -84) {
          ((fi) this).field_e = null;
          return this.a((int[]) null, param2 ^ -21825, param0, param1);
        } else {
          return this.a((int[]) null, param2 ^ -21825, param0, param1);
        }
    }

    final gg b(int param0, int param1, byte param2) {
        Object var5 = null;
        if (param2 != 122) {
          var5 = null;
          gg discarded$2 = this.a((int[]) null, -25, -2, -31);
          return this.a(param1, param0, (int[]) null, (byte) 73);
        } else {
          return this.a(param1, param0, (int[]) null, (byte) 73);
        }
    }

    private final gg a(int[] param0, int param1, int param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        gg var8 = null;
        gg var8_ref = null;
        cg var11 = null;
        gg var12 = null;
        gg var13 = null;
        cg var14 = null;
        gg var15 = null;
        gg var16 = null;
        var5 = ((param3 & -805302273) << -1565690812 | param3 >>> -1240266932) ^ param2;
        var5 = var5 | param3 << 1970016080;
        var6 = (long)var5;
        var8 = (gg) (Object) ((fi) this).field_e.a(var6, (byte) 98);
        if (var8 != null) {
          return var8;
        } else {
          if (param0 != null) {
            if (param0[0] > 0) {
              var14 = cg.a(((fi) this).field_b, param3, param2);
              if (var14 != null) {
                if (param1 == 21779) {
                  var16 = var14.b();
                  var8_ref = var16;
                  ((fi) this).field_e.a(false, var6, (q) (Object) var8_ref);
                  if (param0 != null) {
                    param0[0] = param0[0] - var16.field_n.length;
                    return var8_ref;
                  } else {
                    return var8_ref;
                  }
                } else {
                  ((fi) this).field_a = null;
                  var15 = var14.b();
                  var8_ref = var15;
                  ((fi) this).field_e.a(false, var6, (q) (Object) var8_ref);
                  if (param0 != null) {
                    param0[0] = param0[0] - var15.field_n.length;
                    return var8_ref;
                  } else {
                    return var8_ref;
                  }
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            var11 = cg.a(((fi) this).field_b, param3, param2);
            if (var11 != null) {
              if (param1 == 21779) {
                var13 = var11.b();
                var8_ref = var13;
                ((fi) this).field_e.a(false, var6, (q) (Object) var8_ref);
                if (param0 != null) {
                  param0[0] = param0[0] - var13.field_n.length;
                  return var8_ref;
                } else {
                  return var8_ref;
                }
              } else {
                ((fi) this).field_a = null;
                var12 = var11.b();
                var8_ref = var12;
                ((fi) this).field_e.a(false, var6, (q) (Object) var8_ref);
                if (param0 != null) {
                  param0[0] = param0[0] - var12.field_n.length;
                  return var8_ref;
                } else {
                  return var8_ref;
                }
              }
            } else {
              return null;
            }
          }
        }
    }

    private final gg a(String param0, String param1, int[] param2, byte param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var6 = 59 / ((param3 - 53) / 36);
        var5 = ((fi) this).field_a.a(-1, param1);
        if ((var5 ^ -1) <= -1) {
          var7 = ((fi) this).field_a.a(param0, -115, var5);
          if (0 > var7) {
            return null;
          } else {
            return this.a(var5, var7, param2, (byte) 77);
          }
        } else {
          return null;
        }
    }

    final static bp a(byte param0, String param1) {
        int var2 = 0;
        String[] var3 = null;
        int var5 = 0;
        bp var7 = null;
        int var8 = 0;
        Object var9 = null;
        String[] var10 = null;
        String var11 = null;
        String[] var12 = null;
        String var13 = null;
        var8 = Torquing.field_u;
        var2 = param1.length();
        if (var2 != 0) {
          if ((var2 ^ -1) >= -256) {
            var3 = kc.a('.', param1, 0);
            if (2 <= var3.length) {
              if (param0 <= -90) {
                var12 = var3;
                var5 = 0;
                L0: while (true) {
                  if (var12.length > var5) {
                    var13 = var12[var5];
                    var7 = lc.a(false, var13);
                    if (var7 == null) {
                      var5++;
                      continue L0;
                    } else {
                      return var7;
                    }
                  } else {
                    return vb.a(4, var3[-1 + var3.length]);
                  }
                }
              } else {
                var9 = null;
                fi.a((q) null, (q) null, 124);
                var10 = var3;
                var5 = 0;
                L1: while (true) {
                  if (var10.length > var5) {
                    var11 = var10[var5];
                    var7 = lc.a(false, var11);
                    if (var7 == null) {
                      var5++;
                      continue L1;
                    } else {
                      return var7;
                    }
                  } else {
                    return vb.a(4, var3[-1 + var3.length]);
                  }
                }
              }
            } else {
              return oj.field_l;
            }
          } else {
            return wn.field_s;
          }
        } else {
          return oj.field_l;
        }
    }

    private final gg a(int param0, int param1, int[] param2, byte param3) {
        int var5 = 0;
        long var6 = 0L;
        gg var8 = null;
        gg var8_ref = null;
        ho var9 = null;
        ho var9_ref = null;
        int var10 = 0;
        var5 = (param0 << -1742174684 & 65528 | param0 >>> 981592428) ^ param1;
        var5 = var5 | param0 << -550503408;
        var6 = (long)var5 ^ 4294967296L;
        var8 = (gg) (Object) ((fi) this).field_e.a(var6, (byte) 91);
        if (var8 != null) {
          return var8;
        } else {
          if (param2 != null) {
            if (param2[0] > 0) {
              L0: {
                var10 = -73 % ((param3 - -23) / 49);
                var9 = (ho) (Object) ((fi) this).field_d.a(var6, (byte) 83);
                if (var9 != null) {
                  break L0;
                } else {
                  var9_ref = ho.a(((fi) this).field_a, param0, param1);
                  if (var9_ref != null) {
                    ((fi) this).field_d.a(false, var6, (q) (Object) var9_ref);
                    break L0;
                  } else {
                    return null;
                  }
                }
              }
              var8_ref = var9_ref.a(param2);
              if (var8_ref == null) {
                return null;
              } else {
                var9_ref.f(0);
                ((fi) this).field_e.a(false, var6, (q) (Object) var8_ref);
                return var8_ref;
              }
            } else {
              return null;
            }
          } else {
            L1: {
              var10 = -73 % ((param3 - -23) / 49);
              var9 = (ho) (Object) ((fi) this).field_d.a(var6, (byte) 83);
              if (var9 != null) {
                break L1;
              } else {
                var9_ref = ho.a(((fi) this).field_a, param0, param1);
                if (var9_ref != null) {
                  ((fi) this).field_d.a(false, var6, (q) (Object) var9_ref);
                  break L1;
                } else {
                  return null;
                }
              }
            }
            var8_ref = var9_ref.a(param2);
            if (var8_ref == null) {
              return null;
            } else {
              var9_ref.f(0);
              ((fi) this).field_e.a(false, var6, (q) (Object) var8_ref);
              return var8_ref;
            }
          }
        }
    }

    final static void a(q param0, q param1, int param2) {
        L0: {
          if (null != param0.field_h) {
            param0.f(0);
            break L0;
          } else {
            break L0;
          }
        }
        if (param2 != -1240266932) {
          field_f = null;
          param0.field_h = param1.field_h;
          param0.field_e = param1;
          param0.field_h.field_e = param0;
          param0.field_e.field_h = param0;
          return;
        } else {
          param0.field_h = param1.field_h;
          param0.field_e = param1;
          param0.field_h.field_e = param0;
          param0.field_e.field_h = param0;
          return;
        }
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 < 62) {
            Object var2 = null;
            vn discarded$0 = fi.a((byte) 36, (byte[]) null);
            field_c = null;
            return;
        }
        field_c = null;
    }

    fi(la param0, la param1) {
        ((fi) this).field_d = new eb(256);
        ((fi) this).field_e = new eb(256);
        ((fi) this).field_a = param1;
        ((fi) this).field_b = param0;
    }

    final gg a(String param0, int param1, String param2) {
        if (param1 >= -66) {
          ((fi) this).field_e = null;
          return this.a(param0, param2, (int[]) null, (byte) 115);
        } else {
          return this.a(param0, param2, (int[]) null, (byte) 115);
        }
    }

    final static vn a(byte param0, byte[] param1) {
        vn var2 = null;
        Object var3 = null;
        if (param1 != null) {
          var2 = new vn(param1, fj.field_o, na.field_G, vo.field_b, ij.field_o, pn.field_b);
          if (param0 != -9) {
            var3 = null;
            vn discarded$2 = fi.a((byte) 17, (byte[]) null);
            go.b(0);
            return var2;
          } else {
            go.b(0);
            return var2;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "This password contains your email address, and would be easy to guess";
        field_c = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
