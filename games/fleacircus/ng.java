/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ng {
    private rh field_b;
    static dd[] field_h;
    private rh field_d;
    static String[] field_g;
    static int field_c;
    private hc field_e;
    static int[] field_a;
    private hc field_f;

    final sf a(int param0, boolean param1, int[] param2) {
        if (!((((ng) this).field_b.d((byte) -111) ^ -1) != -2)) {
            return this.a(0, param0, (byte) 85, param2);
        }
        if (!param1) {
            field_c = 28;
            if (!((((ng) this).field_b.a(param0, (byte) -105) ^ -1) != -2)) {
                return this.a(param0, 0, (byte) 79, param2);
            }
            throw new RuntimeException();
        }
        if (!((((ng) this).field_b.a(param0, (byte) -105) ^ -1) != -2)) {
            return this.a(param0, 0, (byte) 79, param2);
        }
        throw new RuntimeException();
    }

    private final sf a(int param0, int param1, int[] param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        sf var8 = null;
        sf var8_ref = null;
        qf var11 = null;
        sf var12 = null;
        qf var13 = null;
        sf var14 = null;
        if (param3 > 7) {
          var5 = (param1 >>> -1977810868 | (-1879044097 & param1) << 1294747940) ^ param0;
          var5 = var5 | param1 << 712350960;
          var6 = (long)var5;
          var8 = (sf) (Object) ((ng) this).field_f.a(var6, -1110);
          if (var8 != null) {
            return var8;
          } else {
            if (param2 != null) {
              if ((param2[0] ^ -1) < -1) {
                var13 = qf.a(((ng) this).field_d, param1, param0);
                if (var13 != null) {
                  var14 = var13.b();
                  var8_ref = var14;
                  ((ng) this).field_f.a((lh) (Object) var8_ref, true, var6);
                  if (param2 != null) {
                    param2[0] = param2[0] - var14.field_l.length;
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
              var11 = qf.a(((ng) this).field_d, param1, param0);
              if (var11 != null) {
                var12 = var11.b();
                var8_ref = var12;
                ((ng) this).field_f.a((lh) (Object) var8_ref, true, var6);
                if (param2 != null) {
                  param2[0] = param2[0] - var12.field_l.length;
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
          return null;
        }
    }

    final static boolean a(String param0, byte param1) {
        if (param1 != 7) {
            return false;
        }
        CharSequence var3 = (CharSequence) (Object) param0;
        return ma.field_a.equals((Object) (Object) uk.a(98, var3));
    }

    final sf a(int[] param0, int param1, int param2) {
        if (-2 == (((ng) this).field_d.d((byte) 60) ^ -1)) {
          return this.a(param1, 0, param0, 95);
        } else {
          if (1 != ((ng) this).field_d.a(param1, (byte) -116)) {
            if (param2 != 29037) {
              ng.a(-126);
              throw new RuntimeException();
            } else {
              throw new RuntimeException();
            }
          } else {
            return this.a(0, param1, param0, param2 ^ 29055);
          }
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_a = null;
        field_g = null;
        if (param0 != 0) {
            ng.a(110);
        }
    }

    private final sf a(int param0, int param1, byte param2, int[] param3) {
        int var5 = 0;
        long var6 = 0L;
        sf var8 = null;
        sf var8_ref = null;
        hk var9 = null;
        hk var9_ref = null;
        var5 = ((-1879044097 & param0) << -1326494716 | param0 >>> 1964415948) ^ param1;
        var5 = var5 | param0 << -1572942736;
        var6 = (long)var5 ^ 4294967296L;
        var8 = (sf) (Object) ((ng) this).field_f.a(var6, -1110);
        if (var8 == null) {
          if (param3 != null) {
            if (param3[0] > 0) {
              if (param2 >= 59) {
                L0: {
                  var9 = (hk) (Object) ((ng) this).field_e.a(var6, -1110);
                  if (var9 == null) {
                    var9_ref = hk.a(((ng) this).field_b, param0, param1);
                    if (var9_ref != null) {
                      ((ng) this).field_e.a((lh) (Object) var9_ref, true, var6);
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    break L0;
                  }
                }
                var8_ref = var9_ref.a(param3);
                if (var8_ref == null) {
                  return null;
                } else {
                  var9_ref.c(-1);
                  ((ng) this).field_f.a((lh) (Object) var8_ref, true, var6);
                  return var8_ref;
                }
              } else {
                L1: {
                  field_c = 19;
                  var9 = (hk) (Object) ((ng) this).field_e.a(var6, -1110);
                  if (var9 == null) {
                    var9_ref = hk.a(((ng) this).field_b, param0, param1);
                    if (var9_ref != null) {
                      ((ng) this).field_e.a((lh) (Object) var9_ref, true, var6);
                      break L1;
                    } else {
                      return null;
                    }
                  } else {
                    break L1;
                  }
                }
                var8_ref = var9_ref.a(param3);
                if (var8_ref == null) {
                  return null;
                } else {
                  var9_ref.c(-1);
                  ((ng) this).field_f.a((lh) (Object) var8_ref, true, var6);
                  return var8_ref;
                }
              }
            } else {
              return null;
            }
          } else {
            if (param2 >= 59) {
              L2: {
                var9 = (hk) (Object) ((ng) this).field_e.a(var6, -1110);
                if (var9 == null) {
                  var9_ref = hk.a(((ng) this).field_b, param0, param1);
                  if (var9_ref != null) {
                    ((ng) this).field_e.a((lh) (Object) var9_ref, true, var6);
                    break L2;
                  } else {
                    return null;
                  }
                } else {
                  break L2;
                }
              }
              var8_ref = var9_ref.a(param3);
              if (var8_ref == null) {
                return null;
              } else {
                var9_ref.c(-1);
                ((ng) this).field_f.a((lh) (Object) var8_ref, true, var6);
                return var8_ref;
              }
            } else {
              L3: {
                field_c = 19;
                var9 = (hk) (Object) ((ng) this).field_e.a(var6, -1110);
                if (var9 == null) {
                  var9_ref = hk.a(((ng) this).field_b, param0, param1);
                  if (var9_ref != null) {
                    ((ng) this).field_e.a((lh) (Object) var9_ref, true, var6);
                    break L3;
                  } else {
                    return null;
                  }
                } else {
                  break L3;
                }
              }
              var8_ref = var9_ref.a(param3);
              if (var8_ref == null) {
                return null;
              } else {
                var9_ref.c(-1);
                ((ng) this).field_f.a((lh) (Object) var8_ref, true, var6);
                return var8_ref;
              }
            }
          }
        } else {
          return var8;
        }
    }

    ng(rh param0, rh param1) {
        ((ng) this).field_e = new hc(256);
        ((ng) this).field_f = new hc(256);
        ((ng) this).field_d = param0;
        ((ng) this).field_b = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new String[]{"£3.20", "€4.25", "US$ 5.00", "Can$ 4.95", "Aus$ 6.50", "Krn 29.95", "", "Rp 160", "Rng 17.95", "NZ$ 7.95", "SG$ 6.95", "Krn 44.95", "R$ 7,00"};
        field_a = new int[4];
    }
}
