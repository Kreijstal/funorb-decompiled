/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class m {
    private vh field_f;
    static va field_g;
    static nf[] field_i;
    static int field_a;
    static int field_l;
    private mi field_c;
    private mi field_e;
    static java.awt.Color field_k;
    private vh field_j;
    static String field_h;
    static long field_b;
    static mn field_d;

    final bi a(int param0, int param1, int param2) {
        if (param2 != 256) {
            return null;
        }
        return this.a(param0, (int[]) null, false, param1);
    }

    private final bi a(int param0, int[] param1, boolean param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        bi var8 = null;
        bi var8_ref = null;
        bi var10 = null;
        fk var11 = null;
        bi var12 = null;
        fk var13 = null;
        bi var14 = null;
        var5 = ((268439551 & param0) << 1137083396 | param0 >>> 1103357548) ^ param3;
        var5 = var5 | param0 << -369972368;
        var6 = (long)var5;
        var8 = (bi) (Object) ((m) this).field_j.a(1, var6);
        if (var8 == null) {
          if (param1 != null) {
            if (-1 > (param1[0] ^ -1)) {
              var13 = fk.a(((m) this).field_c, param0, param3);
              if (var13 != null) {
                if (param2) {
                  return null;
                } else {
                  L0: {
                    var14 = var13.a();
                    var10 = var14;
                    var8_ref = var14;
                    ((m) this).field_j.a((rk) (Object) var8_ref, 11, var6);
                    if (param1 != null) {
                      param1[0] = param1[0] - var14.field_o.length;
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
              return null;
            }
          } else {
            var11 = fk.a(((m) this).field_c, param0, param3);
            if (var11 != null) {
              if (param2) {
                return null;
              } else {
                L1: {
                  var12 = var11.a();
                  var8_ref = var12;
                  ((m) this).field_j.a((rk) (Object) var8_ref, 11, var6);
                  if (param1 != null) {
                    param1[0] = param1[0] - var12.field_o.length;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return var8_ref;
              }
            } else {
              return null;
            }
          }
        } else {
          return var8;
        }
    }

    final bi a(int param0, byte param1, int param2) {
        if (param1 != 76) {
          bi discarded$2 = ((m) this).a(-124, (byte) -9, -5);
          return this.a(param2, param0, (int[]) null, (byte) -117);
        } else {
          return this.a(param2, param0, (int[]) null, (byte) -117);
        }
    }

    private final bi a(int param0, int param1, int[] param2, byte param3) {
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        bi var9 = null;
        bi var9_ref = null;
        ph var10 = null;
        ph var10_ref = null;
        var5 = (param0 >>> -888029556 | param0 << 1956007684 & 65527) ^ param1;
        var5 = var5 | param0 << -945358160;
        var6 = (long)var5 ^ 4294967296L;
        var8 = 17 / ((param3 - -56) / 58);
        var9 = (bi) (Object) ((m) this).field_j.a(1, var6);
        if (var9 == null) {
          if (param2 != null) {
            if (0 < param2[0]) {
              L0: {
                var10 = (ph) (Object) ((m) this).field_f.a(1, var6);
                if (var10 == null) {
                  var10_ref = ph.a(((m) this).field_e, param0, param1);
                  if (var10_ref != null) {
                    ((m) this).field_f.a((rk) (Object) var10_ref, 11, var6);
                    break L0;
                  } else {
                    return null;
                  }
                } else {
                  break L0;
                }
              }
              var9_ref = var10_ref.a(param2);
              if (var9_ref == null) {
                return null;
              } else {
                var10_ref.a(true);
                ((m) this).field_j.a((rk) (Object) var9_ref, 11, var6);
                return var9_ref;
              }
            } else {
              return null;
            }
          } else {
            L1: {
              var10 = (ph) (Object) ((m) this).field_f.a(1, var6);
              if (var10 == null) {
                var10_ref = ph.a(((m) this).field_e, param0, param1);
                if (var10_ref != null) {
                  ((m) this).field_f.a((rk) (Object) var10_ref, 11, var6);
                  break L1;
                } else {
                  return null;
                }
              } else {
                break L1;
              }
            }
            var9_ref = var10_ref.a(param2);
            if (var9_ref == null) {
              return null;
            } else {
              var10_ref.a(true);
              ((m) this).field_j.a((rk) (Object) var9_ref, 11, var6);
              return var9_ref;
            }
          }
        } else {
          return var9;
        }
    }

    public static void a(int param0) {
        field_k = null;
        field_d = null;
        field_i = null;
        field_g = null;
        if (param0 != 27244) {
          m.a(23);
          field_h = null;
          return;
        } else {
          field_h = null;
          return;
        }
    }

    m(mi param0, mi param1) {
        ((m) this).field_f = new vh(256);
        ((m) this).field_j = new vh(256);
        ((m) this).field_e = param1;
        ((m) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0;
        field_l = 0;
        field_g = new va();
        field_h = "If we could get#our hands on their#technology#we could become#supreme rulers#of the galaxy.";
        field_k = new java.awt.Color(10040319);
        field_d = new mn();
    }
}
