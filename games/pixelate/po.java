/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class po {
    static String field_e;
    static ak field_c;
    static String field_j;
    private nl field_g;
    private fm field_i;
    static po field_d;
    static bb field_b;
    static String field_f;
    private fm field_a;
    private nl field_h;

    private final sp a(int param0, int[] param1, int param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        sp var8 = null;
        sp var8_ref = null;
        qd var9 = null;
        qd var9_ref = null;
        var5 = param2 ^ (param3 << 208937348 & param0 | param3 >>> 644995372);
        var5 = var5 | param3 << -1014726256;
        var6 = (long)var5 ^ 4294967296L;
        var8 = (sp) (Object) ((po) this).field_h.a(-25484, var6);
        if (var8 == null) {
          if (param1 != null) {
            if (-1 > (param1[0] ^ -1)) {
              L0: {
                var9 = (qd) (Object) ((po) this).field_g.a(-25484, var6);
                if (var9 != null) {
                  break L0;
                } else {
                  var9_ref = qd.a(((po) this).field_i, param3, param2);
                  if (var9_ref != null) {
                    ((po) this).field_g.a(var6, param0 ^ 65420, (fa) (Object) var9_ref);
                    break L0;
                  } else {
                    return null;
                  }
                }
              }
              var8_ref = var9_ref.a(param1);
              if (var8_ref == null) {
                return null;
              } else {
                var9_ref.c(2779);
                ((po) this).field_h.a(var6, param0 ^ 65423, (fa) (Object) var8_ref);
                return var8_ref;
              }
            } else {
              return null;
            }
          } else {
            L1: {
              var9 = (qd) (Object) ((po) this).field_g.a(-25484, var6);
              if (var9 != null) {
                break L1;
              } else {
                var9_ref = qd.a(((po) this).field_i, param3, param2);
                if (var9_ref != null) {
                  ((po) this).field_g.a(var6, param0 ^ 65420, (fa) (Object) var9_ref);
                  break L1;
                } else {
                  return null;
                }
              }
            }
            var8_ref = var9_ref.a(param1);
            if (var8_ref == null) {
              return null;
            } else {
              var9_ref.c(2779);
              ((po) this).field_h.a(var6, param0 ^ 65423, (fa) (Object) var8_ref);
              return var8_ref;
            }
          }
        } else {
          return var8;
        }
    }

    final sp a(byte param0, int[] param1, int param2) {
        Object var5 = null;
        if (1 == ((po) this).field_i.b((byte) -89)) {
          return this.a(65521, param1, param2, 0);
        } else {
          if (-2 == (((po) this).field_i.b(param2, (byte) 100) ^ -1)) {
            return this.a(65521, param1, 0, param2);
          } else {
            if (param0 > -39) {
              var5 = null;
              sp discarded$2 = this.a((String) null, (int[]) null, (String) null, -73);
              throw new RuntimeException();
            } else {
              throw new RuntimeException();
            }
          }
        }
    }

    private final sp a(int param0, int param1, int[] param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        sp var8 = null;
        sp var8_ref = null;
        np var9 = null;
        sp var10 = null;
        np var11 = null;
        sp var12 = null;
        np var20 = null;
        sp var21 = null;
        np var23 = null;
        sp var24 = null;
        var5 = param1 ^ ((param3 & -1342173185) << -1249630716 | param3 >>> -1999899444);
        var5 = var5 | param3 << 1722860560;
        if (param0 == 0) {
          var6 = (long)var5;
          var8 = (sp) (Object) ((po) this).field_h.a(param0 + -25484, var6);
          if (var8 != null) {
            return var8;
          } else {
            if (param2 != null) {
              if (-1 > (param2[0] ^ -1)) {
                var23 = np.a(((po) this).field_a, param3, param1);
                if (var23 == null) {
                  return null;
                } else {
                  L0: {
                    var24 = var23.b();
                    var8_ref = var24;
                    ((po) this).field_h.a(var6, param0 ^ 127, (fa) (Object) var8_ref);
                    if (param2 != null) {
                      param2[0] = param2[0] - var24.field_n.length;
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
              var23 = np.a(((po) this).field_a, param3, param1);
              if (var23 == null) {
                return null;
              } else {
                L1: {
                  var24 = var23.b();
                  var8_ref = var24;
                  ((po) this).field_h.a(var6, param0 ^ 127, (fa) (Object) var8_ref);
                  if (param2 != null) {
                    param2[0] = param2[0] - var24.field_n.length;
                    break L1;
                  } else {
                    break L1;
                  }
                }
                return var8_ref;
              }
            }
          }
        } else {
          field_j = null;
          var6 = (long)var5;
          var8 = (sp) (Object) ((po) this).field_h.a(param0 + -25484, var6);
          if (var8 != null) {
            return var8;
          } else {
            if (param2 != null) {
              if (-1 > (param2[0] ^ -1)) {
                var20 = np.a(((po) this).field_a, param3, param1);
                var9 = var20;
                if (var20 == null) {
                  return null;
                } else {
                  L2: {
                    var21 = var20.b();
                    var8_ref = var21;
                    ((po) this).field_h.a(var6, param0 ^ 127, (fa) (Object) var8_ref);
                    if (param2 != null) {
                      param2[0] = param2[0] - var21.field_n.length;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              var11 = np.a(((po) this).field_a, param3, param1);
              var9 = var11;
              if (var11 == null) {
                return null;
              } else {
                L3: {
                  var12 = var11.b();
                  var10 = var12;
                  var8_ref = var12;
                  ((po) this).field_h.a(var6, param0 ^ 127, (fa) (Object) var8_ref);
                  if (param2 != null) {
                    param2[0] = param2[0] - var12.field_n.length;
                    break L3;
                  } else {
                    break L3;
                  }
                }
                return var8_ref;
              }
            }
          }
        }
    }

    final sp a(int param0, int[] param1, byte param2) {
        if (-2 != (((po) this).field_a.b((byte) 98) ^ -1)) {
          if (param2 == 106) {
            if (1 == ((po) this).field_a.b(param0, (byte) 27)) {
              return this.a(0, 0, param1, param0);
            } else {
              throw new RuntimeException();
            }
          } else {
            return null;
          }
        } else {
          return this.a(0, param0, param1, 0);
        }
    }

    final sp a(boolean param0, String param1, String param2) {
        if (!param0) {
            return null;
        }
        return this.a(param2, (int[]) null, param1, -86);
    }

    final static void a(boolean param0) {
        if (!param0) {
            field_c = null;
            if (!un.field_l) {
                return;
            }
            mj.a(false);
            return;
        }
        if (un.field_l) {
            mj.a(false);
            return;
        }
    }

    final static String a(int param0, long param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        pe.field_a.setTime(new Date(param1));
        var3 = pe.field_a.get(7);
        var4 = pe.field_a.get(5);
        if (param0 != 10) {
          po.a(true);
          var5 = pe.field_a.get(2);
          var6 = pe.field_a.get(1);
          var7 = pe.field_a.get(11);
          var8 = pe.field_a.get(12);
          var9 = pe.field_a.get(13);
          return eh.field_g[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + ib.field_c[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        } else {
          var5 = pe.field_a.get(2);
          var6 = pe.field_a.get(1);
          var7 = pe.field_a.get(11);
          var8 = pe.field_a.get(12);
          var9 = pe.field_a.get(13);
          return eh.field_g[-1 + var3] + ", " + var4 / 10 + var4 % 10 + "-" + ib.field_c[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }

    private final sp a(String param0, int[] param1, String param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        if (param3 < -4) {
          var5 = ((po) this).field_a.a(118, param0);
          if ((var5 ^ -1) <= -1) {
            var6 = ((po) this).field_a.a((byte) -117, param2, var5);
            if ((var6 ^ -1) > -1) {
              return null;
            } else {
              return this.a(0, var6, param1, var5);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void a(byte param0) {
        int var1 = -1 % ((param0 - -33) / 41);
        field_e = null;
        field_f = null;
        field_d = null;
        field_b = null;
        field_j = null;
        field_c = null;
    }

    po(fm param0, fm param1) {
        ((po) this).field_g = new nl(256);
        ((po) this).field_h = new nl(256);
        ((po) this).field_i = param1;
        ((po) this).field_a = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = "Level: ";
        field_e = "Pixelate";
        field_f = "Reject <%0> from this game";
        field_b = new bb();
    }
}
