/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ka {
    static byte[][] field_e;
    private dj field_g;
    static String field_a;
    static byte[][] field_f;
    private dl field_c;
    private dj field_b;
    static boolean[] field_h;
    private dl field_d;

    private final gi a(int param0, int param1, int[] param2, boolean param3) {
        int var5 = 0;
        long var6 = 0L;
        gi var8 = null;
        ml var9 = null;
        ml var11 = null;
        gi var12 = null;
        ml var34 = null;
        gi var35 = null;
        ml var42 = null;
        gi var43 = null;
        if (param3) {
          var5 = param1 ^ ((268439551 & param0) << 1856253636 | param0 >>> -436098324);
          var5 = var5 | param0 << -682493520;
          var6 = (long)var5;
          var8 = (gi) (Object) ((ka) this).field_d.a(var6, 75);
          if (var8 != null) {
            return var8;
          } else {
            if (param2 != null) {
              if (-1 > (param2[0] ^ -1)) {
                var42 = ml.a(((ka) this).field_g, param0, param1);
                if (var42 != null) {
                  var43 = var42.b();
                  var8 = var43;
                  ((ka) this).field_d.a(-99, var6, (le) (Object) var8);
                  if (param2 != null) {
                    param2[0] = param2[0] - var43.field_l.length;
                    return var8;
                  } else {
                    return var8;
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              var42 = ml.a(((ka) this).field_g, param0, param1);
              if (var42 != null) {
                var43 = var42.b();
                var8 = var43;
                ((ka) this).field_d.a(-99, var6, (le) (Object) var8);
                if (param2 != null) {
                  param2[0] = param2[0] - var43.field_l.length;
                  return var8;
                } else {
                  return var8;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          field_e = null;
          var5 = param1 ^ ((268439551 & param0) << 1856253636 | param0 >>> -436098324);
          var5 = var5 | param0 << -682493520;
          var6 = (long)var5;
          var8 = (gi) (Object) ((ka) this).field_d.a(var6, 75);
          if (var8 != null) {
            return var8;
          } else {
            if (param2 != null) {
              if (-1 > (param2[0] ^ -1)) {
                var34 = ml.a(((ka) this).field_g, param0, param1);
                var9 = var34;
                if (var34 != null) {
                  var35 = var34.b();
                  var8 = var35;
                  ((ka) this).field_d.a(-99, var6, (le) (Object) var8);
                  if (param2 != null) {
                    param2[0] = param2[0] - var35.field_l.length;
                    return var8;
                  } else {
                    return var8;
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              var11 = ml.a(((ka) this).field_g, param0, param1);
              var9 = var11;
              if (var11 != null) {
                var12 = var11.b();
                var8 = var12;
                ((ka) this).field_d.a(-99, var6, (le) (Object) var8);
                if (param2 != null) {
                  param2[0] = param2[0] - var12.field_l.length;
                  return var8;
                } else {
                  return var8;
                }
              } else {
                return null;
              }
            }
          }
        }
    }

    final gi a(int param0, boolean param1, int[] param2) {
        Object var5 = null;
        if (1 == ((ka) this).field_g.d(-1)) {
          return this.a(0, param0, param2, true);
        } else {
          if (!param1) {
            if (-2 == (((ka) this).field_g.a((byte) 105, param0) ^ -1)) {
              return this.a(param0, 0, param2, true);
            } else {
              throw new RuntimeException();
            }
          } else {
            var5 = null;
            gi discarded$5 = ((ka) this).a(-25, (int[]) null, -10);
            if (-2 == (((ka) this).field_g.a((byte) 105, param0) ^ -1)) {
              return this.a(param0, 0, param2, true);
            } else {
              throw new RuntimeException();
            }
          }
        }
    }

    public static void a(byte param0) {
        field_f = null;
        field_a = null;
        field_h = null;
        if (param0 <= 14) {
            return;
        }
        field_e = null;
    }

    final gi a(int param0, int[] param1, int param2) {
        if (!((((ka) this).field_b.d(param0 ^ -1856253637) ^ -1) != -2)) {
            return this.a(param2, param1, 0, 117);
        }
        if (param0 != 1856253636) {
            ((ka) this).field_d = null;
            if (!(((ka) this).field_b.a((byte) 82, param2) != 1)) {
                return this.a(0, param1, param2, 113);
            }
            throw new RuntimeException();
        }
        if (!(((ka) this).field_b.a((byte) 82, param2) != 1)) {
            return this.a(0, param1, param2, 113);
        }
        throw new RuntimeException();
    }

    private final gi a(int param0, int[] param1, int param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        gi var8 = null;
        mb var9 = null;
        var5 = param0 ^ (param2 >>> 2000147436 | param2 << -1890624124 & 65531);
        var5 = var5 | param2 << -871989392;
        var6 = 4294967296L ^ (long)var5;
        var8 = (gi) (Object) ((ka) this).field_d.a(var6, 58);
        if (param3 >= 95) {
          if (var8 == null) {
            if (param1 != null) {
              if (-1 > (param1[0] ^ -1)) {
                L0: {
                  var9 = (mb) (Object) ((ka) this).field_c.a(var6, 100);
                  if (var9 != null) {
                    break L0;
                  } else {
                    var9 = mb.a(((ka) this).field_b, param2, param0);
                    if (var9 != null) {
                      ((ka) this).field_c.a(-118, var6, (le) (Object) var9);
                      break L0;
                    } else {
                      return null;
                    }
                  }
                }
                var8 = var9.a(param1);
                if (var8 == null) {
                  return null;
                } else {
                  var9.b(-27598);
                  ((ka) this).field_d.a(-102, var6, (le) (Object) var8);
                  return var8;
                }
              } else {
                return null;
              }
            } else {
              L1: {
                var9 = (mb) (Object) ((ka) this).field_c.a(var6, 100);
                if (var9 != null) {
                  break L1;
                } else {
                  var9 = mb.a(((ka) this).field_b, param2, param0);
                  if (var9 != null) {
                    ((ka) this).field_c.a(-118, var6, (le) (Object) var9);
                    break L1;
                  } else {
                    return null;
                  }
                }
              }
              var8 = var9.a(param1);
              if (var8 == null) {
                return null;
              } else {
                var9.b(-27598);
                ((ka) this).field_d.a(-102, var6, (le) (Object) var8);
                return var8;
              }
            }
          } else {
            return var8;
          }
        } else {
          return null;
        }
    }

    ka(dj param0, dj param1) {
        ((ka) this).field_c = new dl(256);
        ((ka) this).field_d = new dl(256);
        ((ka) this).field_g = param0;
        ((ka) this).field_b = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new byte[250][];
        field_h = new boolean[]{};
    }
}
