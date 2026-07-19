/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa extends ii {
    static String field_j;
    static String[] field_n;
    private long field_m;
    private long field_k;
    private int field_f;
    static int field_o;
    static cj field_l;
    static String field_p;
    static ri[] field_h;
    private int field_q;
    private long[] field_g;
    private long field_i;

    final static ra b(int param0, int param1) {
        ra var2 = null;
        uj var3 = null;
        var2 = new ra();
        if (param0 != -19300) {
          var3 = (uj) null;
          aa.a(true, (uj) null);
          so.field_j.a(var2, false);
          qo.b(true, param1);
          return var2;
        } else {
          so.field_j.a(var2, false);
          qo.b(true, param1);
          return var2;
        }
    }

    final long a(byte param0) {
        this.field_k = this.field_k + this.d(1);
        if (!((this.field_k ^ -1L) <= (this.field_i ^ -1L))) {
            return (this.field_i + -this.field_k) / 1000000L;
        }
        int var2 = 33 % ((73 - param0) / 46);
        return 0L;
    }

    final static void a(byte param0, boolean param1) {
        if (ki.field_e != null) {
          if (!ki.field_e.b(0, param1)) {
            if (param0 <= 113) {
              field_l = (cj) null;
              return;
            } else {
              return;
            }
          } else {
            ki.field_e = null;
            if (param0 > 113) {
              return;
            } else {
              field_l = (cj) null;
              return;
            }
          }
        } else {
          if (param0 > 113) {
            return;
          } else {
            field_l = (cj) null;
            return;
          }
        }
    }

    final static boolean e(int param0) {
        if (param0 != 0) {
            field_n = (String[]) null;
            return ch.field_e;
        }
        return ch.field_e;
    }

    public static void f(int param0) {
        if (param0 != 0) {
            return;
        }
        field_n = null;
        field_p = null;
        field_l = null;
        field_h = null;
        field_j = null;
    }

    private final long d(int param0) {
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        long stackIn_4_0 = 0L;
        long stackIn_6_0 = 0L;
        long stackIn_14_0 = 0L;
        long stackIn_16_0 = 0L;
        long stackIn_20_0 = 0L;
        long stackIn_22_0 = 0L;
        long stackOut_19_0 = 0L;
        long stackOut_21_0 = 0L;
        long stackOut_13_0 = 0L;
        long stackOut_15_0 = 0L;
        long stackOut_3_0 = 0L;
        long stackOut_5_0 = 0L;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        var2 = System.nanoTime();
        var4 = var2 + -this.field_m;
        this.field_m = var2;
        if (var4 > -5000000000L) {
          if (var4 >= 5000000000L) {
            var6 = 0L;
            var8 = param0;
            L0: while (true) {
              L1: {
                L2: {
                  if (var8 > this.field_f) {
                    break L2;
                  } else {
                    stackOut_19_0 = var6 + this.field_g[(-var8 + (this.field_q - -10)) % 10];
                    stackIn_22_0 = stackOut_19_0;
                    stackIn_20_0 = stackOut_19_0;
                    if (var9 != 0) {
                      break L1;
                    } else {
                      var6 = stackIn_20_0;
                      var8++;
                      if (var9 == 0) {
                        continue L0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                stackOut_21_0 = var6 / (long)this.field_f;
                stackIn_22_0 = stackOut_21_0;
                break L1;
              }
              return stackIn_22_0;
            }
          } else {
            L3: {
              this.field_g[this.field_q] = var4;
              if (1 > this.field_f) {
                this.field_f = this.field_f + 1;
                break L3;
              } else {
                break L3;
              }
            }
            this.field_q = (this.field_q - -1) % 10;
            var6 = 0L;
            var8 = param0;
            L4: while (true) {
              L5: {
                L6: {
                  if (var8 > this.field_f) {
                    break L6;
                  } else {
                    stackOut_13_0 = var6 + this.field_g[(-var8 + (this.field_q - -10)) % 10];
                    stackIn_16_0 = stackOut_13_0;
                    stackIn_14_0 = stackOut_13_0;
                    if (var9 != 0) {
                      break L5;
                    } else {
                      var6 = stackIn_14_0;
                      var8++;
                      if (var9 == 0) {
                        continue L4;
                      } else {
                        break L6;
                      }
                    }
                  }
                }
                stackOut_15_0 = var6 / (long)this.field_f;
                stackIn_16_0 = stackOut_15_0;
                break L5;
              }
              return stackIn_16_0;
            }
          }
        } else {
          var6 = 0L;
          var8 = param0;
          L7: while (true) {
            L8: {
              L9: {
                if (var8 > this.field_f) {
                  break L9;
                } else {
                  stackOut_3_0 = var6 + this.field_g[(-var8 + (this.field_q - -10)) % 10];
                  stackIn_6_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var9 != 0) {
                    break L8;
                  } else {
                    var6 = stackIn_4_0;
                    var8++;
                    if (var9 == 0) {
                      continue L7;
                    } else {
                      break L9;
                    }
                  }
                }
              }
              stackOut_5_0 = var6 / (long)this.field_f;
              stackIn_6_0 = stackOut_5_0;
              break L8;
            }
            return stackIn_6_0;
          }
        }
    }

    final int a(long param0, boolean param1) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param1) {
          if ((this.field_k ^ -1L) > (this.field_i ^ -1L)) {
            this.field_m = this.field_m + (this.field_i - this.field_k);
            this.field_k = this.field_k + (this.field_i - this.field_k);
            this.field_i = this.field_i + param0;
            return 1;
          } else {
            var4 = 0;
            L0: while (true) {
              this.field_i = this.field_i + param0;
              var4++;
              stackOut_4_0 = var4;
              stackIn_5_0 = stackOut_4_0;
              L1: while (true) {
                L2: {
                  if (stackIn_5_0 >= 10) {
                    break L2;
                  } else {
                    if (this.field_k > this.field_i) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_7_0 = (this.field_i < this.field_k ? -1 : (this.field_i == this.field_k ? 0 : 1));
                stackIn_5_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (var5 != 0) {
                  continue L1;
                } else {
                  L3: {
                    if (stackIn_8_0 < 0) {
                      this.field_i = this.field_k;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  return var4;
                }
              }
            }
          }
        } else {
          return 31;
        }
    }

    final static void a(boolean param0, uj param1) {
        if (!param0) {
            return;
        }
        try {
            bh.field_a.a(param1);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) ((Object) runtimeException), "aa.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0) {
        L0: {
          if (this.field_i > this.field_k) {
            this.field_k = this.field_k + (this.field_i + -this.field_k);
            break L0;
          } else {
            break L0;
          }
        }
        this.field_m = 0L;
        if (param0 >= -93) {
          field_l = (cj) null;
          return;
        } else {
          return;
        }
    }

    aa() {
        this.field_f = 1;
        this.field_k = 0L;
        this.field_m = 0L;
        this.field_q = 0;
        this.field_i = 0L;
        this.field_g = new long[10];
        this.field_k = System.nanoTime();
        this.field_i = System.nanoTime();
    }

    static {
        field_j = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
        field_o = 20;
        field_p = "(Research Points can only be earned in Rated games!)";
    }
}
