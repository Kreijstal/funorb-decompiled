/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rna {
    private eaa field_c;
    static String field_b;
    static String[] field_a;
    private bw field_d;

    final bw c(byte param0) {
        bw var2 = null;
        var2 = ((rna) this).field_c.field_g.field_e;
        if (param0 >= 118) {
          if (var2 == ((rna) this).field_c.field_g) {
            ((rna) this).field_d = null;
            return null;
          } else {
            ((rna) this).field_d = var2.field_e;
            return var2;
          }
        } else {
          return null;
        }
    }

    final bw a(byte param0) {
        bw var2 = null;
        if (param0 == 0) {
          var2 = ((rna) this).field_d;
          if (((rna) this).field_c.field_g == var2) {
            ((rna) this).field_d = null;
            return null;
          } else {
            ((rna) this).field_d = var2.field_b;
            return var2;
          }
        } else {
          return null;
        }
    }

    final bw b(byte param0) {
        bw var2 = null;
        int var3 = 0;
        var3 = 30 / ((param0 - -47) / 53);
        var2 = ((rna) this).field_c.field_g.field_b;
        if (var2 == ((rna) this).field_c.field_g) {
          ((rna) this).field_d = null;
          return null;
        } else {
          ((rna) this).field_d = var2.field_b;
          return var2;
        }
    }

    final static boolean b(int param0) {
        long var1 = 0L;
        long var3 = 0L;
        int var5 = 0;
        int var6 = 0;
        var6 = BachelorFridge.field_y;
        if (param0 == 7) {
          var1 = f.b((byte) 73);
          var3 = -pla.field_g + var1;
          if (30000L >= var3) {
            L0: {
              var5 = 3000;
              if (qla.field_f >= 7) {
                var5 = 12000;
                break L0;
              } else {
                if (-6 < (qla.field_f ^ -1)) {
                  if ((qla.field_f ^ -1) > -4) {
                    break L0;
                  } else {
                    var5 = 6000;
                    if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
                      qla.field_f = qla.field_f + 1;
                      pla.field_g = var1;
                      return true;
                    } else {
                      return false;
                    }
                  }
                } else {
                  var5 = 9000;
                  if (((long)var5 ^ -1L) <= (var3 ^ -1L)) {
                    return false;
                  } else {
                    qla.field_f = qla.field_f + 1;
                    pla.field_g = var1;
                    return true;
                  }
                }
              }
            }
            if (((long)var5 ^ -1L) > (var3 ^ -1L)) {
              qla.field_f = qla.field_f + 1;
              pla.field_g = var1;
              return true;
            } else {
              return false;
            }
          } else {
            pla.field_g = var1;
            qla.field_f = 0;
            return true;
          }
        } else {
          return true;
        }
    }

    public static void a(int param0) {
        if (param0 != 7) {
            return;
        }
        field_b = null;
        field_a = null;
    }

    final bw d(byte param0) {
        bw var2 = ((rna) this).field_d;
        if (param0 != -124) {
            return null;
        }
        if (!(((rna) this).field_c.field_g != var2)) {
            ((rna) this).field_d = null;
            return null;
        }
        ((rna) this).field_d = var2.field_e;
        return var2;
    }

    final bw a(bw param0, byte param1) {
        bw var3 = null;
        if (param1 == -86) {
          L0: {
            if (param0 == null) {
              var3 = ((rna) this).field_c.field_g.field_e;
              break L0;
            } else {
              var3 = param0;
              break L0;
            }
          }
          if (var3 == ((rna) this).field_c.field_g) {
            ((rna) this).field_d = null;
            return null;
          } else {
            ((rna) this).field_d = var3.field_e;
            return var3;
          }
        } else {
          return null;
        }
    }

    final bw a(int param0, bw param1) {
        bw var3 = null;
        if (param1 != null) {
            var3 = param1;
        } else {
            var3 = ((rna) this).field_c.field_g.field_b;
        }
        if (param0 != 6000) {
            return null;
        }
        if (!(var3 != ((rna) this).field_c.field_g)) {
            ((rna) this).field_d = null;
            return null;
        }
        ((rna) this).field_d = var3.field_b;
        return var3;
    }

    rna(eaa param0) {
        ((rna) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Offer unrated rematch";
    }
}
