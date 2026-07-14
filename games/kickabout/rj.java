/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class rj {
    private sj field_d;
    private kc field_f;
    static boolean[] field_a;
    private sj field_e;
    static hd field_b;
    private kc field_c;

    private final to a(String param0, String param1, byte param2, int[] param3) {
        int var5 = 0;
        int var6 = 0;
        if (param2 <= -27) {
          var5 = ((rj) this).field_e.b(param1, -1);
          if (-1 >= (var5 ^ -1)) {
            var6 = ((rj) this).field_e.a((byte) -98, param0, var5);
            if (var6 < 0) {
              return null;
            } else {
              return this.a(var5, param3, var6, (byte) 125);
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public static void a(byte param0) {
        if (param0 >= -112) {
            rj.a((byte) -31);
            field_a = null;
            field_b = null;
            return;
        }
        field_a = null;
        field_b = null;
    }

    private final to a(int param0, int[] param1, int param2, byte param3) {
        int var5 = 0;
        long var6 = 0L;
        to var8 = null;
        to var8_ref = null;
        int var10 = 0;
        ed var12 = null;
        to var13 = null;
        ed var14 = null;
        to var15 = null;
        var5 = param2 ^ (param0 >>> -1755560628 | param0 << 182328196 & 65535);
        var5 = var5 | param0 << 1202780528;
        var6 = (long)var5;
        var8 = (to) (Object) ((rj) this).field_c.a(true, var6);
        if (var8 != null) {
          return var8;
        } else {
          if (param1 != null) {
            if (param1[0] > 0) {
              var10 = 85 / ((72 - param3) / 45);
              var14 = ed.a(((rj) this).field_e, param0, param2);
              if (var14 == null) {
                return null;
              } else {
                L0: {
                  var15 = var14.a();
                  var8_ref = var15;
                  ((rj) this).field_c.a((gn) (Object) var8_ref, -95, var6);
                  if (param1 != null) {
                    param1[0] = param1[0] - var15.field_i.length;
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
            var10 = 85 / ((72 - param3) / 45);
            var12 = ed.a(((rj) this).field_e, param0, param2);
            if (var12 == null) {
              return null;
            } else {
              L1: {
                var13 = var12.a();
                var8_ref = var13;
                ((rj) this).field_c.a((gn) (Object) var8_ref, -95, var6);
                if (param1 != null) {
                  param1[0] = param1[0] - var13.field_i.length;
                  break L1;
                } else {
                  break L1;
                }
              }
              return var8_ref;
            }
          }
        }
    }

    private final to a(int[] param0, int param1, int param2, int param3) {
        int var5 = 0;
        long var6 = 0L;
        to var8 = null;
        to var8_ref = null;
        tg var9 = null;
        tg var9_ref = null;
        var5 = (65524 & param2 << 1213174116 | param2 >>> 632088396) ^ param3;
        var5 = var5 | param2 << -1034093232;
        var6 = (long)var5 ^ 4294967296L;
        var8 = (to) (Object) ((rj) this).field_c.a(true, var6);
        if (param1 == 0) {
          if (var8_ref != null) {
            return var8_ref;
          } else {
            if (param0 != null) {
              if (-1 > (param0[0] ^ -1)) {
                L0: {
                  var9 = (tg) (Object) ((rj) this).field_f.a(true, var6);
                  if (var9 == null) {
                    var9_ref = tg.a(((rj) this).field_d, param2, param3);
                    if (var9_ref != null) {
                      ((rj) this).field_f.a((gn) (Object) var9_ref, 79, var6);
                      break L0;
                    } else {
                      return null;
                    }
                  } else {
                    break L0;
                  }
                }
                var8_ref = var9_ref.a(param0);
                if (var8_ref == null) {
                  return null;
                } else {
                  var9_ref.c((byte) -109);
                  ((rj) this).field_c.a((gn) (Object) var8_ref, -82, var6);
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              L1: {
                var9 = (tg) (Object) ((rj) this).field_f.a(true, var6);
                if (var9 == null) {
                  var9_ref = tg.a(((rj) this).field_d, param2, param3);
                  if (var9_ref != null) {
                    ((rj) this).field_f.a((gn) (Object) var9_ref, 79, var6);
                    break L1;
                  } else {
                    return null;
                  }
                } else {
                  break L1;
                }
              }
              var8_ref = var9_ref.a(param0);
              if (var8_ref == null) {
                return null;
              } else {
                var9_ref.c((byte) -109);
                ((rj) this).field_c.a((gn) (Object) var8_ref, -82, var6);
                return var8_ref;
              }
            }
          }
        } else {
          ((rj) this).field_f = null;
          if (var8 != null) {
            return var8;
          } else {
            if (param0 != null) {
              if (-1 > (param0[0] ^ -1)) {
                L2: {
                  var9 = (tg) (Object) ((rj) this).field_f.a(true, var6);
                  if (var9 == null) {
                    var9_ref = tg.a(((rj) this).field_d, param2, param3);
                    if (var9_ref != null) {
                      ((rj) this).field_f.a((gn) (Object) var9_ref, 79, var6);
                      break L2;
                    } else {
                      return null;
                    }
                  } else {
                    break L2;
                  }
                }
                var8_ref = var9_ref.a(param0);
                if (var8_ref == null) {
                  return null;
                } else {
                  var9_ref.c((byte) -109);
                  ((rj) this).field_c.a((gn) (Object) var8_ref, -82, var6);
                  return var8_ref;
                }
              } else {
                return null;
              }
            } else {
              L3: {
                var9 = (tg) (Object) ((rj) this).field_f.a(true, var6);
                if (var9 == null) {
                  var9_ref = tg.a(((rj) this).field_d, param2, param3);
                  if (var9_ref != null) {
                    ((rj) this).field_f.a((gn) (Object) var9_ref, 79, var6);
                    break L3;
                  } else {
                    return null;
                  }
                } else {
                  break L3;
                }
              }
              var8_ref = var9_ref.a(param0);
              if (var8_ref == null) {
                return null;
              } else {
                var9_ref.c((byte) -109);
                ((rj) this).field_c.a((gn) (Object) var8_ref, -82, var6);
                return var8_ref;
              }
            }
          }
        }
    }

    final to a(String param0, boolean param1, String param2) {
        if (!param1) {
          ((rj) this).field_f = null;
          return this.a(param2, param0, (byte) -62, (int[]) null);
        } else {
          return this.a(param2, param0, (byte) -62, (int[]) null);
        }
    }

    final static String a(long param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ct.field_y.setTime(new Date(param0));
        var3 = ct.field_y.get(7);
        var4 = ct.field_y.get(5);
        var5 = ct.field_y.get(2);
        var6 = ct.field_y.get(1);
        var7 = ct.field_y.get(11);
        var8 = ct.field_y.get(12);
        var9 = ct.field_y.get(13);
        if (param1 > -69) {
          rj.a((byte) -2);
          return cu.field_e[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + tv.field_a[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        } else {
          return cu.field_e[var3 - 1] + ", " + var4 / 10 + var4 % 10 + "-" + tv.field_a[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
        }
    }

    final to b(int param0, int param1, int[] param2) {
        if (1 == ((rj) this).field_e.a(123)) {
          return this.a(0, param2, param1, (byte) 117);
        } else {
          if (param0 == 10) {
            if (1 == ((rj) this).field_e.a(true, param1)) {
              return this.a(param1, param2, 0, (byte) -35);
            } else {
              throw new RuntimeException();
            }
          } else {
            ((rj) this).field_d = null;
            if (1 == ((rj) this).field_e.a(true, param1)) {
              return this.a(param1, param2, 0, (byte) -35);
            } else {
              throw new RuntimeException();
            }
          }
        }
    }

    final to a(int param0, int param1, int[] param2) {
        if (((rj) this).field_d.a(126) != -2) {
          if (-2 != ((rj) this).field_d.a(true, param0)) {
            if (param1 != 10) {
              return null;
            } else {
              throw new RuntimeException();
            }
          } else {
            return this.a(param2, 0, param0, 0);
          }
        } else {
          return this.a(param2, 0, 0, param0);
        }
    }

    rj(sj param0, sj param1) {
        ((rj) this).field_f = new kc(256);
        ((rj) this).field_c = new kc(256);
        ((rj) this).field_d = param1;
        ((rj) this).field_e = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new boolean[8];
    }
}
