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
          this.field_h = this.field_h + this.c(false);
          if ((this.field_h ^ -1L) > (this.field_f ^ -1L)) {
            return (-this.field_h + this.field_f) / 1000000L;
          } else {
            return 0L;
          }
        } else {
          field_d = (he[]) null;
          this.field_h = this.field_h + this.c(false);
          if ((this.field_h ^ -1L) > (this.field_f ^ -1L)) {
            return (-this.field_h + this.field_f) / 1000000L;
          } else {
            return 0L;
          }
        }
    }

    private final long c(boolean param0) {
        int discarded$4 = 0;
        int discarded$5 = 0;
        int discarded$6 = 0;
        int discarded$7 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var2 = System.nanoTime();
        var4 = -this.field_g + var2;
        this.field_g = var2;
        if ((var4 ^ -1L) < 4999999999L) {
          if (-5000000001L < (var4 ^ -1L)) {
            this.field_l[this.field_k] = var4;
            this.field_k = (1 + this.field_k) % 10;
            if ((this.field_i ^ -1) <= -2) {
              var6 = 0L;
              if (param0) {
                discarded$4 = this.a(-62L, 63);
                var8 = 1;
                L0: while (true) {
                  if (this.field_i < var8) {
                    return var6 / (long)this.field_i;
                  } else {
                    var6 = var6 + this.field_l[(this.field_k + (-var8 + 10)) % 10];
                    var8++;
                    continue L0;
                  }
                }
              } else {
                var8 = 1;
                L1: while (true) {
                  if (this.field_i < var8) {
                    return var6 / (long)this.field_i;
                  } else {
                    var6 = var6 + this.field_l[(this.field_k + (-var8 + 10)) % 10];
                    var8++;
                    continue L1;
                  }
                }
              }
            } else {
              this.field_i = this.field_i + 1;
              var6 = 0L;
              if (param0) {
                discarded$5 = this.a(-62L, 63);
                var8 = 1;
                L2: while (true) {
                  if (this.field_i < var8) {
                    return var6 / (long)this.field_i;
                  } else {
                    var6 = var6 + this.field_l[(this.field_k + (-var8 + 10)) % 10];
                    var8++;
                    continue L2;
                  }
                }
              } else {
                var8 = 1;
                L3: while (true) {
                  if (this.field_i < var8) {
                    return var6 / (long)this.field_i;
                  } else {
                    var6 = var6 + this.field_l[(this.field_k + (-var8 + 10)) % 10];
                    var8++;
                    continue L3;
                  }
                }
              }
            }
          } else {
            var6 = 0L;
            if (!param0) {
              var8 = 1;
              L4: while (true) {
                if (this.field_i < var8) {
                  return var6 / (long)this.field_i;
                } else {
                  var6 = var6 + this.field_l[(this.field_k + (-var8 + 10)) % 10];
                  var8++;
                  continue L4;
                }
              }
            } else {
              discarded$6 = this.a(-62L, 63);
              var8 = 1;
              L5: while (true) {
                if (this.field_i < var8) {
                  return var6 / (long)this.field_i;
                } else {
                  var6 = var6 + this.field_l[(this.field_k + (-var8 + 10)) % 10];
                  var8++;
                  continue L5;
                }
              }
            }
          }
        } else {
          var6 = 0L;
          if (param0) {
            discarded$7 = this.a(-62L, 63);
            var8 = 1;
            L6: while (true) {
              if (this.field_i < var8) {
                return var6 / (long)this.field_i;
              } else {
                var6 = var6 + this.field_l[(this.field_k + (-var8 + 10)) % 10];
                var8++;
                continue L6;
              }
            }
          } else {
            var8 = 1;
            L7: while (true) {
              if (this.field_i < var8) {
                return var6 / (long)this.field_i;
              } else {
                var6 = var6 + this.field_l[(this.field_k + (-var8 + 10)) % 10];
                var8++;
                continue L7;
              }
            }
          }
        }
    }

    final void b(boolean param0) {
        if (param0) {
          L0: {
            field_j = (he[]) null;
            this.field_g = 0L;
            if (this.field_f > this.field_h) {
              this.field_h = this.field_h + (-this.field_h + this.field_f);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            this.field_g = 0L;
            if (this.field_f > this.field_h) {
              this.field_h = this.field_h + (-this.field_h + this.field_f);
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
          if (this.field_f <= this.field_h) {
            var4 = 0;
            L0: while (true) {
              L1: {
                this.field_f = this.field_f + param0;
                var4++;
                if (10 <= var4) {
                  break L1;
                } else {
                  if (this.field_f < this.field_h) {
                    continue L0;
                  } else {
                    break L1;
                  }
                }
              }
              if (this.field_h > this.field_f) {
                this.field_f = this.field_h;
                return var4;
              } else {
                return var4;
              }
            }
          } else {
            this.field_g = this.field_g + (this.field_f + -this.field_h);
            this.field_h = this.field_h + (-this.field_h + this.field_f);
            this.field_f = this.field_f + param0;
            return 1;
          }
        } else {
          this.field_f = 20L;
          if (this.field_f <= this.field_h) {
            var4 = 0;
            L2: while (true) {
              L3: {
                this.field_f = this.field_f + param0;
                var4++;
                if (10 <= var4) {
                  break L3;
                } else {
                  if (this.field_f < this.field_h) {
                    continue L2;
                  } else {
                    break L3;
                  }
                }
              }
              if (this.field_h <= this.field_f) {
                return var4;
              } else {
                this.field_f = this.field_h;
                return var4;
              }
            }
          } else {
            this.field_g = this.field_g + (this.field_f + -this.field_h);
            this.field_h = this.field_h + (-this.field_h + this.field_f);
            this.field_f = this.field_f + param0;
            return 1;
          }
        }
    }

    public static void b(int param0) {
        field_d = null;
        field_e = null;
        int var1 = -77 / ((param0 - 6) / 44);
        field_j = null;
    }

    bk() {
        this.field_f = 0L;
        this.field_i = 1;
        this.field_l = new long[10];
        this.field_g = 0L;
        this.field_k = 0;
        this.field_h = 0L;
        this.field_h = System.nanoTime();
        this.field_f = System.nanoTime();
    }

    static {
        field_e = new ia();
    }
}
