/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uh {
    static lb field_j;
    static int field_e;
    static String[] field_i;
    private ck[] field_d;
    static String field_f;
    static String field_h;
    static wk field_k;
    private ck field_a;
    private int field_b;
    private int field_g;
    private ck field_c;

    public static void c(int param0) {
        field_h = null;
        int var1 = 54 / ((-11 - param0) / 35);
        field_k = null;
        field_j = null;
        field_f = null;
        field_i = null;
    }

    final void a(long param0, ck param1, int param2) {
        ck var5 = null;
        ck var6 = null;
        ck var7 = null;
        if (param1.field_i == null) {
          var7 = ((uh) this).field_d[(int)(param0 & (long)(((uh) this).field_b - 1))];
          var5 = var7;
          param1.field_i = var7.field_i;
          param1.field_k = var5;
          param1.field_i.field_k = param1;
          if (param2 != -1816) {
            uh.c(30);
            param1.field_j = param0;
            param1.field_k.field_i = param1;
            return;
          } else {
            param1.field_j = param0;
            param1.field_k.field_i = param1;
            return;
          }
        } else {
          param1.b(param2 + 1820);
          var6 = ((uh) this).field_d[(int)(param0 & (long)(((uh) this).field_b - 1))];
          var5 = var6;
          param1.field_i = var6.field_i;
          param1.field_k = var5;
          param1.field_i.field_k = param1;
          if (param2 == -1816) {
            param1.field_j = param0;
            param1.field_k.field_i = param1;
            return;
          } else {
            uh.c(30);
            param1.field_j = param0;
            param1.field_k.field_i = param1;
            return;
          }
        }
    }

    final static void a(int param0) {
        ca.field_r = null;
        dl.field_L = null;
        rl.field_a = null;
        ba.field_d = null;
        oa.field_M = null;
        le.field_L = null;
        if (param0 == 9324) {
          return;
        } else {
          field_i = null;
          return;
        }
    }

    final ck a(byte param0) {
        int var3 = 0;
        ck var4 = null;
        ck var35 = null;
        ck var36 = null;
        ck var37 = null;
        ck var38 = null;
        ck var41 = null;
        var3 = SteelSentinels.field_G;
        if (param0 > 92) {
          if (((uh) this).field_g > 0) {
            if (((uh) this).field_a == ((uh) this).field_d[-1 + ((uh) this).field_g]) {
              L0: while (true) {
                if (((uh) this).field_g < ((uh) this).field_b) {
                  ((uh) this).field_g = ((uh) this).field_g + 1;
                  var38 = ((uh) this).field_d[((uh) this).field_g].field_k;
                  if (((uh) this).field_d[((uh) this).field_g - 1] != var38) {
                    ((uh) this).field_a = var38.field_k;
                    return var38;
                  } else {
                    continue L0;
                  }
                } else {
                  return null;
                }
              }
            } else {
              var41 = ((uh) this).field_a;
              ((uh) this).field_a = var41.field_k;
              return var41;
            }
          } else {
            L1: while (true) {
              if (((uh) this).field_g < ((uh) this).field_b) {
                ((uh) this).field_g = ((uh) this).field_g + 1;
                var37 = ((uh) this).field_d[((uh) this).field_g].field_k;
                if (((uh) this).field_d[((uh) this).field_g - 1] != var37) {
                  ((uh) this).field_a = var37.field_k;
                  return var37;
                } else {
                  continue L1;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          ((uh) this).field_d = null;
          if (((uh) this).field_g > 0) {
            if (((uh) this).field_a != ((uh) this).field_d[-1 + ((uh) this).field_g]) {
              var35 = ((uh) this).field_a;
              ((uh) this).field_a = var35.field_k;
              return var35;
            } else {
              L2: while (true) {
                if (((uh) this).field_g < ((uh) this).field_b) {
                  ((uh) this).field_g = ((uh) this).field_g + 1;
                  var36 = ((uh) this).field_d[((uh) this).field_g].field_k;
                  if (((uh) this).field_d[((uh) this).field_g - 1] != var36) {
                    ((uh) this).field_a = var36.field_k;
                    return var36;
                  } else {
                    continue L2;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            L3: while (true) {
              if (((uh) this).field_g < ((uh) this).field_b) {
                ((uh) this).field_g = ((uh) this).field_g + 1;
                var4 = ((uh) this).field_d[((uh) this).field_g].field_k;
                if (((uh) this).field_d[((uh) this).field_g - 1] != var4) {
                  ((uh) this).field_a = var4.field_k;
                  return var4;
                } else {
                  continue L3;
                }
              } else {
                return null;
              }
            }
          }
        }
    }

    final static int a(boolean param0, int param1, int param2) {
        int var3 = 0;
        if (param0) {
          field_k = null;
          var3 = param1 >> -1769986657 & -1 + param2;
          return var3 + (param1 - -(param1 >>> 1325752159)) % param2;
        } else {
          var3 = param1 >> -1769986657 & -1 + param2;
          return var3 + (param1 - -(param1 >>> 1325752159)) % param2;
        }
    }

    final static void a(int param0, wk[] param1) {
        if (param0 != 1) {
            return;
        }
        jb.field_S = param1;
        if (null == jb.field_S) {
            return;
        }
        if (!(-4 >= (param1.length ^ -1))) {
            throw new IllegalArgumentException("");
        }
    }

    final ck b(int param0) {
        ((uh) this).field_g = param0;
        return ((uh) this).a((byte) 113);
    }

    final ck a(long param0, int param1) {
        ck var4 = null;
        ck var5 = null;
        int var6 = 0;
        var6 = SteelSentinels.field_G;
        var4 = ((uh) this).field_d[(int)(param0 & (long)(-1 + ((uh) this).field_b))];
        ((uh) this).field_c = var4.field_k;
        L0: while (true) {
          if (var4 == ((uh) this).field_c) {
            if (param1 < 122) {
              return null;
            } else {
              ((uh) this).field_c = null;
              return null;
            }
          } else {
            if ((((uh) this).field_c.field_j ^ -1L) == (param0 ^ -1L)) {
              var5 = ((uh) this).field_c;
              ((uh) this).field_c = ((uh) this).field_c.field_k;
              return var5;
            } else {
              ((uh) this).field_c = ((uh) this).field_c.field_k;
              continue L0;
            }
          }
        }
    }

    final static gk a(gk param0, int[] param1, boolean param2) {
        gk var3 = null;
        var3 = new gk(0, 0, 0);
        var3.field_a = param0.field_a;
        var3.field_i = param0.field_i;
        if (param2) {
          field_f = null;
          var3.field_g = param0.field_g;
          var3.field_j = param0.field_j;
          var3.field_d = param0.field_d;
          var3.field_p = param0.field_p;
          var3.field_o = param1;
          var3.field_n = param0.field_n;
          return var3;
        } else {
          var3.field_g = param0.field_g;
          var3.field_j = param0.field_j;
          var3.field_d = param0.field_d;
          var3.field_p = param0.field_p;
          var3.field_o = param1;
          var3.field_n = param0.field_n;
          return var3;
        }
    }

    uh(int param0) {
        int var2 = 0;
        ck var3 = null;
        ((uh) this).field_g = 0;
        ((uh) this).field_d = new ck[param0];
        ((uh) this).field_b = param0;
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            var3 = new ck();
            ((uh) this).field_d[var2] = new ck();
            var3.field_k = var3;
            var3.field_i = var3;
            var2++;
            continue L0;
          } else {
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new String[]{"Flak repeater", "Minigun", "Fire bomb launcher", "Gauss gun", "Pulse laser", "Plasma spray", "Rapier missile", "Piercer rocket", "EMP rocket", "Airburst rocket", "Electron cannon", "Flak cannon", "Heavy gun", "Heavy cannon", "Mortar", "Rifled sniper cannon", "Rail repeater", "Laser beam", "Plasma cannon", "Multirocket", "Heavy rocket", "Lightning cannon", "Magno claw", "Flame cannon", "Bio rocket", "Air mine", "Ultra gun", "Doomsday cannon", "Howitzer", "Rail cannon", "Solaris laser", "Fusion cannon", "DEATH nuke", "Destructor rocket", "Air death missile", "EMP cannon"};
        field_h = "D";
        field_f = "Close";
        field_e = 1;
    }
}
