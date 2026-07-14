/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob {
    static String field_f;
    private ph field_g;
    static int field_d;
    static long[] field_c;
    static int field_e;
    private gk field_a;
    private gk field_h;
    private ph field_b;

    final al a(int param0, int[] param1, byte param2) {
        if (1 == ((ob) this).field_a.a((byte) 127)) {
          return this.a(0, param0, param1, 1452176260);
        } else {
          if ((((ob) this).field_a.b(param0, param2 + 28004) ^ -1) != -2) {
            if (param2 != -92) {
              return (al) null;
            } else {
              throw new RuntimeException();
            }
          } else {
            return this.a(param0, 0, param1, 1452176260);
          }
        }
    }

    public static void a(boolean param0) {
        field_f = null;
        if (param0) {
            field_e = 125;
            field_c = null;
            return;
        }
        field_c = null;
    }

    private final al a(int param0, int param1, int[] param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        al var8 = null;
        al var8_ref = null;
        t var9 = null;
        t var9_ref = null;
        var5 = param1 ^ ((param0 & -268431361) << 1452176260 | param0 >>> 1538666732);
        var5 = var5 | param0 << 900436400;
        if (param3 == 1452176260) {
          var6 = 4294967296L ^ (long)var5;
          var8 = (al) ((ob) this).field_b.a((byte) 106, var6);
          if (var8 != null) {
            return var8;
          } else {
            if (param2 != null) {
              if (-1 > (param2[0] ^ -1)) {
                L0: {
                  var9 = (t) ((ob) this).field_g.a((byte) 106, var6);
                  if (var9 != null) {
                    break L0;
                  } else {
                    var9_ref = t.a(((ob) this).field_a, param0, param1);
                    if (var9_ref != null) {
                      ((ob) this).field_g.a(-105, var6, (wf) (Object) var9_ref);
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
                  var9_ref.c(-125);
                  ((ob) this).field_b.a(124, var6, (wf) (Object) var8_ref);
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              L1: {
                var9 = (t) ((ob) this).field_g.a((byte) 106, var6);
                if (var9 != null) {
                  break L1;
                } else {
                  var9_ref = t.a(((ob) this).field_a, param0, param1);
                  if (var9_ref != null) {
                    ((ob) this).field_g.a(-105, var6, (wf) (Object) var9_ref);
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
                var9_ref.c(-125);
                ((ob) this).field_b.a(124, var6, (wf) (Object) var8_ref);
                return var8_ref;
              }
            }
          }
        } else {
          return (al) null;
        }
    }

    final static String a(String param0, byte param1) {
        if (!rr.field_b.startsWith("win")) {
          if (!rr.field_b.startsWith("linux")) {
            if (!rr.field_b.startsWith("mac")) {
              if (param1 == -18) {
                return null;
              } else {
                return (String) null;
              }
            } else {
              return "lib" + param0 + ".dylib";
            }
          } else {
            return "lib" + param0 + ".so";
          }
        } else {
          return param0 + ".dll";
        }
    }

    private final al a(int param0, int[] param1, int param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        al var8 = null;
        al var8_ref = null;
        bj var9 = null;
        int[] var10 = null;
        bj var12 = null;
        al var13 = null;
        bj var40 = null;
        al var41 = null;
        bj var48 = null;
        al var49 = null;
        var5 = (param2 >>> -1019373908 | (param2 & -805302273) << 155976932) ^ param0;
        var5 = var5 | param2 << 2137337232;
        var6 = (long)var5;
        if (param3 <= -37) {
          var8 = (al) ((ob) this).field_b.a((byte) 106, var6);
          if (var8 != null) {
            return var8;
          } else {
            if (param1 != null) {
              if ((param1[0] ^ -1) < -1) {
                var48 = bj.a(((ob) this).field_h, param2, param0);
                if (var48 != null) {
                  var49 = var48.a();
                  var8_ref = var49;
                  ((ob) this).field_b.a(105, var6, (wf) (Object) var8_ref);
                  if (param1 != null) {
                    param1[0] = param1[0] - ((al) var49).field_g.length;
                    return var8_ref;
                  } else {
                    return var8_ref;
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              var48 = bj.a(((ob) this).field_h, param2, param0);
              if (var48 != null) {
                var49 = var48.a();
                var8_ref = var49;
                ((ob) this).field_b.a(105, var6, (wf) (Object) var8_ref);
                if (param1 != null) {
                  param1[0] = param1[0] - ((al) var49).field_g.length;
                  return var8_ref;
                } else {
                  return var8_ref;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          var10 = (int[]) null;
          al discarded$1 = this.a(-58, -101, (int[]) null, -98);
          var8 = (al) ((ob) this).field_b.a((byte) 106, var6);
          if (var8 != null) {
            return var8;
          } else {
            if (param1 != null) {
              if ((param1[0] ^ -1) < -1) {
                var40 = bj.a(((ob) this).field_h, param2, param0);
                var9 = var40;
                if (var40 != null) {
                  var41 = var40.a();
                  var8_ref = var41;
                  ((ob) this).field_b.a(105, var6, (wf) (Object) var8_ref);
                  if (param1 != null) {
                    param1[0] = param1[0] - ((al) var41).field_g.length;
                    return var8_ref;
                  } else {
                    return var8_ref;
                  }
                } else {
                  return null;
                }
              } else {
                return null;
              }
            } else {
              var12 = bj.a(((ob) this).field_h, param2, param0);
              var9 = var12;
              if (var12 != null) {
                var13 = var12.a();
                var8_ref = var13;
                ((ob) this).field_b.a(105, var6, (wf) (Object) var8_ref);
                if (param1 != null) {
                  param1[0] = param1[0] - ((al) var13).field_g.length;
                  return var8_ref;
                } else {
                  return var8_ref;
                }
              } else {
                return null;
              }
            }
          }
        }
    }

    final al a(int[] param0, int param1, byte param2) {
        if (((ob) this).field_h.a((byte) 113) == 1) {
            return this.a(param1, param0, 0, -58);
        }
        if (param2 <= 96) {
            field_f = (String) null;
            if (!(((ob) this).field_h.b(param1, 27912) != 1)) {
                return this.a(0, param0, param1, -58);
            }
            throw new RuntimeException();
        }
        if (!(((ob) this).field_h.b(param1, 27912) != 1)) {
            return this.a(0, param0, param1, -58);
        }
        throw new RuntimeException();
    }

    ob(gk param0, gk param1) {
        ((ob) this).field_g = new ph(256);
        ((ob) this).field_b = new ph(256);
        ((ob) this).field_h = param0;
        ((ob) this).field_a = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new long[32];
        field_f = "Name";
    }
}
