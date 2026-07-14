/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf extends fg {
    private int field_g;
    private int field_j;
    static String field_c;
    private long[] field_i;
    static String field_k;
    static String field_e;
    private long field_d;
    private long field_h;
    private long field_f;

    public static void a(byte param0) {
        field_e = null;
        if (param0 >= -106) {
            field_k = null;
            field_c = null;
            field_k = null;
            return;
        }
        field_c = null;
        field_k = null;
    }

    private final long b(int param0) {
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = System.nanoTime();
        var4 = var2 + -((uf) this).field_h;
        ((uf) this).field_h = var2;
        if (-5000000000L < var4) {
          if (-5000000001L < (var4 ^ -1L)) {
            ((uf) this).field_i[((uf) this).field_j] = var4;
            if (1 <= ((uf) this).field_g) {
              ((uf) this).field_j = (((uf) this).field_j - -1) % 10;
              var6 = (long)param0;
              var8 = 1;
              L0: while (true) {
                if (((uf) this).field_g < var8) {
                  return var6 / (long)((uf) this).field_g;
                } else {
                  var6 = var6 + ((uf) this).field_i[(-var8 + ((uf) this).field_j - -10) % 10];
                  var8++;
                  continue L0;
                }
              }
            } else {
              ((uf) this).field_g = ((uf) this).field_g + 1;
              ((uf) this).field_j = (((uf) this).field_j - -1) % 10;
              var6 = (long)param0;
              var8 = 1;
              L1: while (true) {
                if (((uf) this).field_g < var8) {
                  return var6 / (long)((uf) this).field_g;
                } else {
                  var6 = var6 + ((uf) this).field_i[(-var8 + ((uf) this).field_j - -10) % 10];
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            var6 = (long)param0;
            var8 = 1;
            L2: while (true) {
              if (((uf) this).field_g < var8) {
                return var6 / (long)((uf) this).field_g;
              } else {
                var6 = var6 + ((uf) this).field_i[(-var8 + ((uf) this).field_j - -10) % 10];
                var8++;
                continue L2;
              }
            }
          }
        } else {
          var6 = (long)param0;
          var8 = 1;
          L3: while (true) {
            if (((uf) this).field_g < var8) {
              return var6 / (long)((uf) this).field_g;
            } else {
              var6 = var6 + ((uf) this).field_i[(-var8 + ((uf) this).field_j - -10) % 10];
              var8++;
              continue L3;
            }
          }
        }
    }

    final long a(int param0) {
        ((uf) this).field_d = ((uf) this).field_d + this.b(0);
        if (!(((uf) this).field_d >= ((uf) this).field_f)) {
            return (((uf) this).field_f - ((uf) this).field_d) / 1000000L;
        }
        int var2 = -90 % ((34 - param0) / 38);
        return 0L;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 76 % ((param0 - -1) / 36);
        int var4 = param2 >> -398340353 & -1 + param1;
        return var4 + (param2 - -(param2 >>> -1780228321)) % param1;
    }

    final int a(long param0, byte param1) {
        int var4 = 0;
        int var5 = 0;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param1 == 37) {
          if ((((uf) this).field_f ^ -1L) >= (((uf) this).field_d ^ -1L)) {
            var4 = 0;
            L0: while (true) {
              L1: {
                ((uf) this).field_f = ((uf) this).field_f + param0;
                var4++;
                if (var4 >= 10) {
                  break L1;
                } else {
                  if ((((uf) this).field_d ^ -1L) < (((uf) this).field_f ^ -1L)) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (((uf) this).field_f < ((uf) this).field_d) {
                ((uf) this).field_f = ((uf) this).field_d;
                return var4;
              } else {
                return var4;
              }
            }
          } else {
            ((uf) this).field_h = ((uf) this).field_h + (-((uf) this).field_d + ((uf) this).field_f);
            ((uf) this).field_d = ((uf) this).field_d + (-((uf) this).field_d + ((uf) this).field_f);
            ((uf) this).field_f = ((uf) this).field_f + param0;
            return 1;
          }
        } else {
          field_k = null;
          if ((((uf) this).field_f ^ -1L) >= (((uf) this).field_d ^ -1L)) {
            var4 = 0;
            L2: while (true) {
              L3: {
                ((uf) this).field_f = ((uf) this).field_f + param0;
                var4++;
                if (var4 >= 10) {
                  break L3;
                } else {
                  if ((((uf) this).field_d ^ -1L) < (((uf) this).field_f ^ -1L)) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (((uf) this).field_f >= ((uf) this).field_d) {
                return var4;
              } else {
                ((uf) this).field_f = ((uf) this).field_d;
                return var4;
              }
            }
          } else {
            ((uf) this).field_h = ((uf) this).field_h + (-((uf) this).field_d + ((uf) this).field_f);
            ((uf) this).field_d = ((uf) this).field_d + (-((uf) this).field_d + ((uf) this).field_f);
            ((uf) this).field_f = ((uf) this).field_f + param0;
            return 1;
          }
        }
    }

    final static java.net.URL a(java.applet.Applet param0, byte param1, java.net.URL param2) {
        String var3 = null;
        String var4 = null;
        var3 = null;
        if (param1 > 74) {
          L0: {
            if (e.field_c == null) {
              break L0;
            } else {
              if (!e.field_c.equals((Object) (Object) param0.getParameter("settings"))) {
                var3 = e.field_c;
                var4 = var3;
                var4 = var3;
                break L0;
              } else {
                var4 = null;
                if (null == kd.field_e) {
                  return fc.a(var3, param2, var4, -1, 35);
                } else {
                  L1: {
                    if (!kd.field_e.equals((Object) (Object) param0.getParameter("session"))) {
                      var4 = kd.field_e;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                  return fc.a(var3, param2, var4, -1, 35);
                }
              }
            }
          }
          var4 = null;
          if (null != kd.field_e) {
            if (kd.field_e.equals((Object) (Object) param0.getParameter("session"))) {
              return fc.a(var3, param2, var4, -1, 35);
            } else {
              var4 = kd.field_e;
              return fc.a(var3, param2, var4, -1, 35);
            }
          } else {
            return fc.a(var3, param2, var4, -1, 35);
          }
        } else {
          return null;
        }
    }

    final void a(boolean param0) {
        L0: {
          if (((uf) this).field_d < ((uf) this).field_f) {
            ((uf) this).field_d = ((uf) this).field_d + (-((uf) this).field_d + ((uf) this).field_f);
            break L0;
          } else {
            break L0;
          }
        }
        if (!param0) {
          return;
        } else {
          ((uf) this).field_h = 0L;
          return;
        }
    }

    uf() {
        ((uf) this).field_g = 1;
        ((uf) this).field_h = 0L;
        ((uf) this).field_i = new long[10];
        ((uf) this).field_j = 0;
        ((uf) this).field_f = 0L;
        ((uf) this).field_d = 0L;
        ((uf) this).field_d = System.nanoTime();
        ((uf) this).field_f = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Cancel";
        field_e = "Not yet achieved";
        field_k = "To Customer Support";
    }
}
