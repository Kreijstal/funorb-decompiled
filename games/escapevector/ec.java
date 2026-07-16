/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ec {
    static wb field_a;
    private mf field_e;
    private mf field_d;
    static String field_c;
    private ib field_b;
    private ib field_g;
    static te[] field_f;

    private final hh a(int[] param0, byte param1, int param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        hh var8 = null;
        in var9 = null;
        var5 = (param2 << 544295716 & 65522 | param2 >>> -380803412) ^ param3;
        if (param1 > 14) {
          var5 = var5 | param2 << -48065136;
          var6 = 4294967296L ^ (long)var5;
          var8 = (hh) (Object) ((ec) this).field_g.a(var6, -1);
          if (var8 != null) {
            return var8;
          } else {
            if (param0 != null) {
              if (0 < param0[0]) {
                L0: {
                  var9 = (in) (Object) ((ec) this).field_b.a(var6, -1);
                  if (var9 != null) {
                    break L0;
                  } else {
                    var9 = in.a(((ec) this).field_e, param2, param3);
                    if (var9 != null) {
                      ((ec) this).field_b.a((hg) (Object) var9, 10901, var6);
                      break L0;
                    } else {
                      return null;
                    }
                  }
                }
                var8 = var9.a(param0);
                if (var8 == null) {
                  return null;
                } else {
                  var9.c((byte) -27);
                  ((ec) this).field_g.a((hg) (Object) var8, 10901, var6);
                  return var8;
                }
              } else {
                return null;
              }
            } else {
              L1: {
                var9 = (in) (Object) ((ec) this).field_b.a(var6, -1);
                if (var9 != null) {
                  break L1;
                } else {
                  var9 = in.a(((ec) this).field_e, param2, param3);
                  if (var9 != null) {
                    ((ec) this).field_b.a((hg) (Object) var9, 10901, var6);
                    break L1;
                  } else {
                    return null;
                  }
                }
              }
              var8 = var9.a(param0);
              if (var8 == null) {
                return null;
              } else {
                var9.c((byte) -27);
                ((ec) this).field_g.a((hg) (Object) var8, 10901, var6);
                return var8;
              }
            }
          }
        } else {
          return null;
        }
    }

    public static void a(byte param0) {
        field_a = null;
        int var1 = 78 / ((param0 - 56) / 54);
        field_c = null;
        field_f = null;
    }

    private final hh a(int param0, int param1, int[] param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        hh var8 = null;
        Object var10 = null;
        hh var11 = null;
        kj var12 = null;
        hh var13 = null;
        hh var14 = null;
        kj var15 = null;
        hh var16 = null;
        hh var17 = null;
        var5 = param3 ^ (param1 << 1450726116 & 65533 | param1 >>> 1158948012);
        var5 = var5 | param1 << -507826384;
        var6 = (long)var5;
        var8 = (hh) (Object) ((ec) this).field_g.a(var6, -1);
        if (var8 != null) {
          return var8;
        } else {
          if (param2 != null) {
            if (-1 > (param2[0] ^ -1)) {
              var15 = kj.a(((ec) this).field_d, param1, param3);
              if (var15 != null) {
                if (param0 != 1158948012) {
                  L0: {
                    var10 = null;
                    hh discarded$4 = this.a(-13, 124, (int[]) null, 13);
                    var16 = var15.a();
                    var8 = var16;
                    ((ec) this).field_g.a((hg) (Object) var8, 10901, var6);
                    if (param2 != null) {
                      param2[0] = param2[0] - var16.field_h.length;
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  return var8;
                } else {
                  L1: {
                    var17 = var15.a();
                    var11 = var17;
                    var8 = var17;
                    ((ec) this).field_g.a((hg) (Object) var8, 10901, var6);
                    if (param2 != null) {
                      param2[0] = param2[0] - var17.field_h.length;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  return var8;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            var12 = kj.a(((ec) this).field_d, param1, param3);
            if (var12 != null) {
              if (param0 != 1158948012) {
                L2: {
                  var10 = null;
                  hh discarded$5 = this.a(-13, 124, (int[]) null, 13);
                  var13 = var12.a();
                  var8 = var13;
                  ((ec) this).field_g.a((hg) (Object) var8, 10901, var6);
                  if (param2 != null) {
                    param2[0] = param2[0] - var13.field_h.length;
                    break L2;
                  } else {
                    break L2;
                  }
                }
                return var8;
              } else {
                L3: {
                  var14 = var12.a();
                  var8 = var14;
                  ((ec) this).field_g.a((hg) (Object) var8, 10901, var6);
                  if (param2 != null) {
                    param2[0] = param2[0] - var14.field_h.length;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return var8;
              }
            } else {
              return null;
            }
          }
        }
    }

    final hh a(int param0, byte param1, int param2) {
        if (param1 != -128) {
          ((ec) this).field_d = null;
          return this.a((int[]) null, (byte) 18, param0, param2);
        } else {
          return this.a((int[]) null, (byte) 18, param0, param2);
        }
    }

    final hh a(byte param0, int param1, int param2) {
        if (param0 <= 44) {
          ((ec) this).field_e = null;
          return this.a(1158948012, param2, (int[]) null, param1);
        } else {
          return this.a(1158948012, param2, (int[]) null, param1);
        }
    }

    ec(mf param0, mf param1) {
        ((ec) this).field_b = new ib(256);
        ((ec) this).field_g = new ib(256);
        ((ec) this).field_e = param1;
        ((ec) this).field_d = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Email is valid";
    }
}
