/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bk extends m {
    private long field_f;
    private long field_h;
    private int field_i;
    private long field_g;
    private long[] field_l;
    private int field_k;
    static ia field_e;
    static he[] field_j;
    static he[] field_d;

    final long a(int param0) {
        if (param0 == 1) {
          ((bk) this).field_h = ((bk) this).field_h + this.c(false);
          if (~((bk) this).field_h > ~((bk) this).field_f) {
            return (-((bk) this).field_h + ((bk) this).field_f) / 1000000L;
          } else {
            return 0L;
          }
        } else {
          field_d = null;
          ((bk) this).field_h = ((bk) this).field_h + this.c(false);
          if (~((bk) this).field_h > ~((bk) this).field_f) {
            return (-((bk) this).field_h + ((bk) this).field_f) / 1000000L;
          } else {
            return 0L;
          }
        }
    }

    private final long c(boolean param0) {
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = System.nanoTime();
        var4 = -((bk) this).field_g + var2;
        ((bk) this).field_g = var2;
        if (var4 > -5000000000L) {
          if (var4 < 5000000000L) {
            ((bk) this).field_l[((bk) this).field_k] = var4;
            ((bk) this).field_k = (1 + ((bk) this).field_k) % 10;
            if (((bk) this).field_i >= 1) {
              var6 = 0L;
              var8 = 1;
              L0: while (true) {
                if (((bk) this).field_i < var8) {
                  return var6 / (long)((bk) this).field_i;
                } else {
                  var6 = var6 + ((bk) this).field_l[(((bk) this).field_k + (-var8 + 10)) % 10];
                  var8++;
                  continue L0;
                }
              }
            } else {
              ((bk) this).field_i = ((bk) this).field_i + 1;
              var6 = 0L;
              var8 = 1;
              L1: while (true) {
                if (((bk) this).field_i < var8) {
                  return var6 / (long)((bk) this).field_i;
                } else {
                  var6 = var6 + ((bk) this).field_l[(((bk) this).field_k + (-var8 + 10)) % 10];
                  var8++;
                  continue L1;
                }
              }
            }
          } else {
            var6 = 0L;
            var8 = 1;
            L2: while (true) {
              if (((bk) this).field_i < var8) {
                return var6 / (long)((bk) this).field_i;
              } else {
                var6 = var6 + ((bk) this).field_l[(((bk) this).field_k + (-var8 + 10)) % 10];
                var8++;
                continue L2;
              }
            }
          }
        } else {
          var6 = 0L;
          var8 = 1;
          L3: while (true) {
            if (((bk) this).field_i < var8) {
              return var6 / (long)((bk) this).field_i;
            } else {
              var6 = var6 + ((bk) this).field_l[(((bk) this).field_k + (-var8 + 10)) % 10];
              var8++;
              continue L3;
            }
          }
        }
    }

    final void b(boolean param0) {
        if (param0) {
          L0: {
            field_j = null;
            ((bk) this).field_g = 0L;
            if (((bk) this).field_f > ((bk) this).field_h) {
              ((bk) this).field_h = ((bk) this).field_h + (-((bk) this).field_h + ((bk) this).field_f);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            ((bk) this).field_g = 0L;
            if (((bk) this).field_f > ((bk) this).field_h) {
              ((bk) this).field_h = ((bk) this).field_h + (-((bk) this).field_h + ((bk) this).field_f);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final int a(long param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (param1 < -92) {
          if (((bk) this).field_f <= ((bk) this).field_h) {
            var4 = 0;
            L0: while (true) {
              L1: {
                ((bk) this).field_f = ((bk) this).field_f + param0;
                var4++;
                if (10 <= var4) {
                  break L1;
                } else {
                  if (((bk) this).field_f < ((bk) this).field_h) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (((bk) this).field_h > ((bk) this).field_f) {
                ((bk) this).field_f = ((bk) this).field_h;
                return var4;
              } else {
                return var4;
              }
            }
          } else {
            ((bk) this).field_g = ((bk) this).field_g + (((bk) this).field_f + -((bk) this).field_h);
            ((bk) this).field_h = ((bk) this).field_h + (-((bk) this).field_h + ((bk) this).field_f);
            ((bk) this).field_f = ((bk) this).field_f + param0;
            return 1;
          }
        } else {
          ((bk) this).field_f = 20L;
          if (((bk) this).field_f <= ((bk) this).field_h) {
            var4 = 0;
            L2: while (true) {
              L3: {
                ((bk) this).field_f = ((bk) this).field_f + param0;
                var4++;
                if (10 <= var4) {
                  break L3;
                } else {
                  if (((bk) this).field_f < ((bk) this).field_h) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (((bk) this).field_h <= ((bk) this).field_f) {
                return var4;
              } else {
                ((bk) this).field_f = ((bk) this).field_h;
                return var4;
              }
            }
          } else {
            ((bk) this).field_g = ((bk) this).field_g + (((bk) this).field_f + -((bk) this).field_h);
            ((bk) this).field_h = ((bk) this).field_h + (-((bk) this).field_h + ((bk) this).field_f);
            ((bk) this).field_f = ((bk) this).field_f + param0;
            return 1;
          }
        }
    }

    public static void b(int param0) {
        field_d = null;
        field_e = null;
        int var1 = -77;
        field_j = null;
    }

    bk() {
        ((bk) this).field_f = 0L;
        ((bk) this).field_i = 1;
        ((bk) this).field_l = new long[10];
        ((bk) this).field_g = 0L;
        ((bk) this).field_k = 0;
        ((bk) this).field_h = 0L;
        ((bk) this).field_h = System.nanoTime();
        ((bk) this).field_f = System.nanoTime();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new ia();
    }
}
