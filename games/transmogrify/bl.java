/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl {
    static int[] field_d;
    private ci field_f;
    static String[] field_b;
    private ci field_c;
    private fl field_a;
    private fl field_e;

    private final hb b(int param0, int param1, int[] param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        hb var8 = null;
        hb var8_ref = null;
        ml var9 = null;
        ml var9_ref = null;
        var5 = (param1 << 182970116 & 65529 | param1 >>> 79289964) ^ param0;
        var5 = var5 | param1 << 223475056;
        var6 = (long)var5 ^ 4294967296L;
        var8 = (hb) (Object) ((bl) this).field_e.a(var6, 0);
        if (var8 != null) {
          return var8;
        } else {
          if (param2 != null) {
            if (-1 > (param2[0] ^ -1)) {
              L0: {
                var9 = (ml) (Object) ((bl) this).field_a.a(var6, param3 + -79289964);
                if (var9 != null) {
                  break L0;
                } else {
                  var9_ref = ml.a(((bl) this).field_f, param1, param0);
                  if (var9_ref != null) {
                    ((bl) this).field_a.a(var6, (byte) -100, (wf) (Object) var9_ref);
                    break L0;
                  } else {
                    return null;
                  }
                }
              }
              var8_ref = var9_ref.a(param2);
              if (var8_ref != null) {
                if (param3 != 79289964) {
                  field_b = null;
                  var9_ref.c(5);
                  ((bl) this).field_e.a(var6, (byte) 74, (wf) (Object) var8_ref);
                  return var8_ref;
                } else {
                  var9_ref.c(5);
                  ((bl) this).field_e.a(var6, (byte) 74, (wf) (Object) var8_ref);
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              return null;
            }
          } else {
            L1: {
              var9 = (ml) (Object) ((bl) this).field_a.a(var6, param3 + -79289964);
              if (var9 != null) {
                break L1;
              } else {
                var9_ref = ml.a(((bl) this).field_f, param1, param0);
                if (var9_ref != null) {
                  ((bl) this).field_a.a(var6, (byte) -100, (wf) (Object) var9_ref);
                  break L1;
                } else {
                  return null;
                }
              }
            }
            var8_ref = var9_ref.a(param2);
            if (var8_ref != null) {
              if (param3 != 79289964) {
                field_b = null;
                var9_ref.c(5);
                ((bl) this).field_e.a(var6, (byte) 74, (wf) (Object) var8_ref);
                return var8_ref;
              } else {
                var9_ref.c(5);
                ((bl) this).field_e.a(var6, (byte) 74, (wf) (Object) var8_ref);
                return var8_ref;
              }
            } else {
              return null;
            }
          }
        }
    }

    final static void a(int param0) {
        if (param0 != 858) {
            return;
        }
        ec.a("", param0 ^ 815, (String) null);
    }

    final hb a(int param0, int param1, int[] param2) {
        if (1 != ((bl) this).field_f.a(117)) {
          if (param0 == 1673501264) {
            if ((((bl) this).field_f.a(param1, (byte) 121) ^ -1) == -2) {
              return this.b(0, param1, param2, 79289964);
            } else {
              throw new RuntimeException();
            }
          } else {
            return null;
          }
        } else {
          return this.b(param1, 0, param2, 79289964);
        }
    }

    final hb a(int[] param0, int param1, byte param2) {
        if (param2 != 17) {
            return null;
        }
        if (((bl) this).field_c.a(param2 ^ 112) == 1) {
            return this.a(-94, param1, param0, 0);
        }
        if (!(-2 != (((bl) this).field_c.a(param1, (byte) 101) ^ -1))) {
            return this.a(-48, 0, param0, param1);
        }
        throw new RuntimeException();
    }

    final static void a(boolean param0, int param1) {
        int var3 = 0;
        cf var4 = null;
        var3 = Transmogrify.field_A ? 1 : 0;
        var4 = (cf) (Object) mh.field_e.a((byte) -95);
        L0: while (true) {
          if (var4 == null) {
            if (param0) {
              field_d = null;
              return;
            } else {
              return;
            }
          } else {
            gj.a((byte) 83, var4, param1);
            var4 = (cf) (Object) mh.field_e.a(true);
            continue L0;
          }
        }
    }

    public static void b(int param0) {
        if (param0 <= 81) {
            return;
        }
        field_d = null;
        field_b = null;
    }

    private final hb a(int param0, int param1, int[] param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        hb var8 = null;
        hb var8_ref = null;
        int var10 = 0;
        r var12 = null;
        hb var13 = null;
        r var14 = null;
        hb var15 = null;
        var5 = param1 ^ (65533 & param3 << -341313532 | param3 >>> 1871172812);
        var5 = var5 | param3 << 1673501264;
        var6 = (long)var5;
        var8 = (hb) (Object) ((bl) this).field_e.a(var6, 0);
        if (var8 == null) {
          if (param2 != null) {
            if ((param2[0] ^ -1) < -1) {
              var14 = r.a(((bl) this).field_c, param3, param1);
              if (var14 == null) {
                return null;
              } else {
                L0: {
                  var10 = -92 / ((48 - param0) / 34);
                  var15 = var14.a();
                  var8_ref = var15;
                  ((bl) this).field_e.a(var6, (byte) 75, (wf) (Object) var8_ref);
                  if (param2 != null) {
                    param2[0] = param2[0] - var15.field_l.length;
                    break L0;
                  } else {
                    break L0;
                  }
                }
                return var8_ref;
              }
            } else {
              return null;
            }
          } else {
            var12 = r.a(((bl) this).field_c, param3, param1);
            if (var12 == null) {
              return null;
            } else {
              L1: {
                var10 = -92 / ((48 - param0) / 34);
                var13 = var12.a();
                var8_ref = var13;
                ((bl) this).field_e.a(var6, (byte) 75, (wf) (Object) var8_ref);
                if (param2 != null) {
                  param2[0] = param2[0] - var13.field_l.length;
                  break L1;
                } else {
                  break L1;
                }
              }
              return var8_ref;
            }
          }
        } else {
          return var8;
        }
    }

    bl(ci param0, ci param1) {
        ((bl) this).field_a = new fl(256);
        ((bl) this).field_e = new fl(256);
        ((bl) this).field_f = param1;
        ((bl) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[8192];
        field_b = new String[]{"Score 600+ points", "Score 1,000+ points", "Submit a 6+ letter word that uses exactly the same tiles as the previous word", "Submit a 9+ letter word that uses exactly the same tiles as the previous word", "Submit a word where every tile has already been used at least twice", "Submit a word where every tile has already been used at least three times", "Reuse any one consonant tile in every word", "Reuse any two consonant tiles in every word", "Submit a word of 10+ letters", "Submit a 12-letter word", "Extend a 4+ letter word by using every one of its tiles plus 3 new ones", "Submit a 100-point word", "Get a time bonus of 100+ points", "Get a time bonus of 150+ points", "Score 600+ points, including a time bonus of 100+", "Spell 'pumpkin', 'mummy', 'skeleton' or 'vampire'!"};
    }
}
