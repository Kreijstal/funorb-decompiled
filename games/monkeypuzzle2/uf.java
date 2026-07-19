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
            field_k = (String) null;
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
        long stackIn_4_0 = 0L;
        long stackIn_6_0 = 0L;
        long stackIn_11_0 = 0L;
        long stackIn_13_0 = 0L;
        long stackIn_19_0 = 0L;
        long stackIn_21_0 = 0L;
        long stackIn_25_0 = 0L;
        long stackIn_27_0 = 0L;
        long stackOut_18_0 = 0L;
        long stackOut_20_0 = 0L;
        long stackOut_24_0 = 0L;
        long stackOut_26_0 = 0L;
        long stackOut_10_0 = 0L;
        long stackOut_12_0 = 0L;
        long stackOut_3_0 = 0L;
        long stackOut_5_0 = 0L;
        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
        var2 = System.nanoTime();
        var4 = var2 + -this.field_h;
        this.field_h = var2;
        if (-5000000000L < var4) {
          if (-5000000001L < (var4 ^ -1L)) {
            this.field_i[this.field_j] = var4;
            if (1 <= this.field_g) {
              this.field_j = (this.field_j - -1) % 10;
              var6 = (long)param0;
              var8 = 1;
              L0: while (true) {
                L1: {
                  L2: {
                    if (this.field_g < var8) {
                      break L2;
                    } else {
                      stackOut_18_0 = var6 + this.field_i[(-var8 + this.field_j - -10) % 10];
                      stackIn_21_0 = stackOut_18_0;
                      stackIn_19_0 = stackOut_18_0;
                      if (var9 != 0) {
                        break L1;
                      } else {
                        var6 = stackIn_19_0;
                        var8++;
                        if (var9 == 0) {
                          continue L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  stackOut_20_0 = var6 / (long)this.field_g;
                  stackIn_21_0 = stackOut_20_0;
                  break L1;
                }
                return stackIn_21_0;
              }
            } else {
              this.field_g = this.field_g + 1;
              this.field_j = (this.field_j - -1) % 10;
              var6 = (long)param0;
              var8 = 1;
              L3: while (true) {
                L4: {
                  L5: {
                    if (this.field_g < var8) {
                      break L5;
                    } else {
                      stackOut_24_0 = var6 + this.field_i[(-var8 + this.field_j - -10) % 10];
                      stackIn_27_0 = stackOut_24_0;
                      stackIn_25_0 = stackOut_24_0;
                      if (var9 != 0) {
                        break L4;
                      } else {
                        var6 = stackIn_25_0;
                        var8++;
                        if (var9 == 0) {
                          continue L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                  }
                  stackOut_26_0 = var6 / (long)this.field_g;
                  stackIn_27_0 = stackOut_26_0;
                  break L4;
                }
                return stackIn_27_0;
              }
            }
          } else {
            var6 = (long)param0;
            var8 = 1;
            L6: while (true) {
              L7: {
                L8: {
                  if (this.field_g < var8) {
                    break L8;
                  } else {
                    stackOut_10_0 = var6 + this.field_i[(-var8 + this.field_j - -10) % 10];
                    stackIn_13_0 = stackOut_10_0;
                    stackIn_11_0 = stackOut_10_0;
                    if (var9 != 0) {
                      break L7;
                    } else {
                      var6 = stackIn_11_0;
                      var8++;
                      if (var9 == 0) {
                        continue L6;
                      } else {
                        break L8;
                      }
                    }
                  }
                }
                stackOut_12_0 = var6 / (long)this.field_g;
                stackIn_13_0 = stackOut_12_0;
                break L7;
              }
              return stackIn_13_0;
            }
          }
        } else {
          var6 = (long)param0;
          var8 = 1;
          L9: while (true) {
            L10: {
              L11: {
                if (this.field_g < var8) {
                  break L11;
                } else {
                  stackOut_3_0 = var6 + this.field_i[(-var8 + this.field_j - -10) % 10];
                  stackIn_6_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var9 != 0) {
                    break L10;
                  } else {
                    var6 = stackIn_4_0;
                    var8++;
                    if (var9 == 0) {
                      continue L9;
                    } else {
                      break L11;
                    }
                  }
                }
              }
              stackOut_5_0 = var6 / (long)this.field_g;
              stackIn_6_0 = stackOut_5_0;
              break L10;
            }
            return stackIn_6_0;
          }
        }
    }

    final long a(int param0) {
        this.field_d = this.field_d + this.b(0);
        if (!(this.field_d >= this.field_f)) {
            return (this.field_f - this.field_d) / 1000000L;
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
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_7_0 = 0;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param1 == 37) {
          if ((this.field_f ^ -1L) >= (this.field_d ^ -1L)) {
            var4 = 0;
            L0: while (true) {
              this.field_f = this.field_f + param0;
              var4++;
              stackOut_15_0 = var4;
              stackIn_16_0 = stackOut_15_0;
              L1: while (true) {
                L2: {
                  if (stackIn_16_0 >= 10) {
                    break L2;
                  } else {
                    if ((this.field_d ^ -1L) < (this.field_f ^ -1L)) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
                stackOut_18_0 = (this.field_f < this.field_d ? -1 : (this.field_f == this.field_d ? 0 : 1));
                stackIn_16_0 = stackOut_18_0;
                stackIn_19_0 = stackOut_18_0;
                if (var5 != 0) {
                  continue L1;
                } else {
                  if (stackIn_19_0 < 0) {
                    this.field_f = this.field_d;
                    return var4;
                  } else {
                    return var4;
                  }
                }
              }
            }
          } else {
            this.field_h = this.field_h + (-this.field_d + this.field_f);
            this.field_d = this.field_d + (-this.field_d + this.field_f);
            this.field_f = this.field_f + param0;
            return 1;
          }
        } else {
          field_k = (String) null;
          if ((this.field_f ^ -1L) >= (this.field_d ^ -1L)) {
            var4 = 0;
            L3: while (true) {
              this.field_f = this.field_f + param0;
              var4++;
              stackOut_4_0 = var4;
              stackIn_5_0 = stackOut_4_0;
              L4: while (true) {
                L5: {
                  if (stackIn_5_0 >= 10) {
                    break L5;
                  } else {
                    if ((this.field_d ^ -1L) < (this.field_f ^ -1L)) {
                      continue L3;
                    } else {
                      break L5;
                    }
                  }
                }
                stackOut_7_0 = (this.field_f < this.field_d ? -1 : (this.field_f == this.field_d ? 0 : 1));
                stackIn_5_0 = stackOut_7_0;
                stackIn_8_0 = stackOut_7_0;
                if (var5 != 0) {
                  continue L4;
                } else {
                  if (stackIn_8_0 >= 0) {
                    return var4;
                  } else {
                    this.field_f = this.field_d;
                    return var4;
                  }
                }
              }
            }
          } else {
            this.field_h = this.field_h + (-this.field_d + this.field_f);
            this.field_d = this.field_d + (-this.field_d + this.field_f);
            this.field_f = this.field_f + param0;
            return 1;
          }
        }
    }

    final static java.net.URL a(java.applet.Applet param0, byte param1, java.net.URL param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_2_0 = null;
        java.net.URL stackIn_12_0 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        Object stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        Object stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        Object stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        java.net.URL stackOut_11_0 = null;
        java.net.URL stackOut_1_0 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        Object stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        Object stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        Object stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        Object stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        Object stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            var3 = null;
            if (param1 > 74) {
              L1: {
                if (e.field_c == null) {
                  break L1;
                } else {
                  if (!e.field_c.equals(param0.getParameter("settings"))) {
                    var3 = e.field_c;
                    var4 = var3;
                    var4 = var3;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                var4 = null;
                if (null == kd.field_e) {
                  break L2;
                } else {
                  if (!kd.field_e.equals(param0.getParameter("session"))) {
                    var4 = kd.field_e;
                    break L2;
                  } else {
                    break L2;
                  }
                }
              }
              stackOut_11_0 = fc.a((String) (var3), param2, (String) (var4), -1, 35);
              stackIn_12_0 = stackOut_11_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (java.net.URL) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackOut_13_0 = var3;
            stackOut_13_1 = new StringBuilder().append("uf.H(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_15_0 = stackIn_15_0;
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L3;
            } else {
              stackOut_14_0 = stackIn_14_0;
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L3;
            }
          }
          L4: {
            stackOut_16_0 = stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = stackIn_18_0;
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = stackIn_17_0;
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_12_0;
        }
    }

    final void a(boolean param0) {
        L0: {
          if (this.field_d < this.field_f) {
            this.field_d = this.field_d + (-this.field_d + this.field_f);
            break L0;
          } else {
            break L0;
          }
        }
        if (!param0) {
          return;
        } else {
          this.field_h = 0L;
          return;
        }
    }

    uf() {
        this.field_g = 1;
        this.field_h = 0L;
        this.field_i = new long[10];
        this.field_j = 0;
        this.field_f = 0L;
        this.field_d = 0L;
        this.field_d = System.nanoTime();
        this.field_f = System.nanoTime();
    }

    static {
        field_c = "Cancel";
        field_e = "Not yet achieved";
        field_k = "To Customer Support";
    }
}
