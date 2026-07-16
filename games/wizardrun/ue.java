/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue {
    private kl field_f;
    static bh field_h;
    private kl field_c;
    static String field_b;
    private ab field_g;
    private ab field_a;
    static o field_d;
    static byte[][] field_e;

    public static void a(int param0) {
        if (param0 != 0) {
          field_e = null;
          field_d = null;
          field_e = null;
          field_h = null;
          field_b = null;
          return;
        } else {
          field_d = null;
          field_e = null;
          field_h = null;
          field_b = null;
          return;
        }
    }

    final je a(int param0, int[] param1, int param2) {
        if (-2 == (((ue) this).field_c.c(0) ^ -1)) {
          return this.a(param2, true, 0, param1);
        } else {
          if (param0 == 19830) {
            if (1 == ((ue) this).field_c.d(param0 ^ -19719, param2)) {
              return this.a(0, true, param2, param1);
            } else {
              throw new RuntimeException();
            }
          } else {
            return null;
          }
        }
    }

    final je b(int param0, int[] param1, int param2) {
        if (!(((ue) this).field_f.c(param0 ^ param0) != 1)) {
            return this.a(param1, param0 + 29237, param2, 0);
        }
        if (!(((ue) this).field_f.d(-110, param2) != 1)) {
            return this.a(param1, param0 + 29237, 0, param2);
        }
        throw new RuntimeException();
    }

    private final je a(int param0, boolean param1, int param2, int[] param3) {
        int var5 = 0;
        long var6 = 0L;
        je var8 = null;
        nc var9 = null;
        if (param1) {
          var5 = (param2 >>> -11488788 | 65522 & param2 << 1789938532) ^ param0;
          var5 = var5 | param2 << 1916234736;
          var6 = 4294967296L ^ (long)var5;
          var8 = (je) (Object) ((ue) this).field_a.a(1, var6);
          if (var8 == null) {
            if (param3 != null) {
              if (-1 > (param3[0] ^ -1)) {
                L0: {
                  var9 = (nc) (Object) ((ue) this).field_g.a(1, var6);
                  if (var9 != null) {
                    break L0;
                  } else {
                    var9 = nc.a(((ue) this).field_c, param2, param0);
                    if (var9 != null) {
                      ((ue) this).field_g.a((wl) (Object) var9, -37, var6);
                      break L0;
                    } else {
                      return null;
                    }
                  }
                }
                var8 = var9.a(param3);
                if (var8 == null) {
                  return null;
                } else {
                  var9.a(false);
                  ((ue) this).field_a.a((wl) (Object) var8, -41, var6);
                  return var8;
                }
              } else {
                return null;
              }
            } else {
              L1: {
                var9 = (nc) (Object) ((ue) this).field_g.a(1, var6);
                if (var9 != null) {
                  break L1;
                } else {
                  var9 = nc.a(((ue) this).field_c, param2, param0);
                  if (var9 != null) {
                    ((ue) this).field_g.a((wl) (Object) var9, -37, var6);
                    break L1;
                  } else {
                    return null;
                  }
                }
              }
              var8 = var9.a(param3);
              if (var8 == null) {
                return null;
              } else {
                var9.a(false);
                ((ue) this).field_a.a((wl) (Object) var8, -41, var6);
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

    private final je a(int[] param0, int param1, int param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        je var8 = null;
        b var11 = null;
        je var12 = null;
        b var13 = null;
        je var14 = null;
        var5 = param2 ^ (param3 >>> 1839980940 | (-1342173185 & param3) << 670898180);
        if (param1 == -3243) {
          var5 = var5 | param3 << 386443696;
          var6 = (long)var5;
          var8 = (je) (Object) ((ue) this).field_a.a(param1 + 3244, var6);
          if (var8 != null) {
            return var8;
          } else {
            if (param0 != null) {
              if (param0[0] > 0) {
                var13 = b.a(((ue) this).field_f, param3, param2);
                if (var13 == null) {
                  return null;
                } else {
                  L0: {
                    var14 = var13.b();
                    var8 = var14;
                    ((ue) this).field_a.a((wl) (Object) var8, param1 + 3139, var6);
                    if (param0 != null) {
                      param0[0] = param0[0] - var14.field_k.length;
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  return var8;
                }
              } else {
                return null;
              }
            } else {
              var11 = b.a(((ue) this).field_f, param3, param2);
              if (var11 == null) {
                return null;
              } else {
                L1: {
                  var12 = var11.b();
                  var8 = var12;
                  ((ue) this).field_a.a((wl) (Object) var8, param1 + 3139, var6);
                  if (param0 != null) {
                    param0[0] = param0[0] - var12.field_k.length;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return var8;
              }
            }
          }
        } else {
          return null;
        }
    }

    ue(kl param0, kl param1) {
        ((ue) this).field_g = new ab(256);
        ((ue) this).field_a = new ab(256);
        ((ue) this).field_f = param0;
        ((ue) this).field_c = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Log in";
        field_h = new bh(7, 0, 1, 1);
    }
}
