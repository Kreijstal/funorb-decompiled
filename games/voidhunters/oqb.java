/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oqb extends le {
    private int field_q;
    private int field_p;
    private int field_l;
    private int field_i;
    private int field_m;
    private int field_o;
    private int field_j;
    static String field_n;
    static String field_k;

    private final boolean d(int param0, int param1, int param2) {
        int var4;
        int var5;
        int stackIn_6_0 = 0;
        var4 = this.field_q * (param2 - -param0) >> -1354488756;
        if (param1 == 1047718) {
          L0: {
            L1: {
              var5 = jmb.field_q[(255 * var4 & 1046912) >> -422708276];
              var5 = (var5 << -1205133428) / this.field_q;
              var5 = (var5 << 800317100) / this.field_m;
              var5 = this.field_p * var5 >> 425999628;
              if (var5 <= param2 - param0) {
                break L1;
              } else {
                if (-param0 + param2 <= -var5) {
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    public oqb() {
        super(0, true);
        this.field_i = 2048;
        this.field_q = 12288;
        this.field_m = 8192;
        this.field_j = 0;
        this.field_p = 4096;
        this.field_l = 0;
        this.field_o = 2048;
    }

    final void c(byte param0) {
        boolean discarded$0 = false;
        if (param0 >= -35) {
            discarded$0 = this.d(-93, -27, 100);
        }
        taa.e((byte) 118);
    }

    final int[] a(int param0, boolean param1) {
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int[] stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int[] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int[] var12;
        L0: {
          var11 = VoidHunters.field_G;
          if (param1) {
            break L0;
          } else {
            this.c((byte) -85);
            break L0;
          }
        }
        L1: {
          var12 = this.field_f.a((byte) 119, param0);
          var3 = var12;
          if (!this.field_f.field_e) {
            break L1;
          } else {
            var4 = sj.field_p[param0] + -2048;
            var5 = 0;
            L2: while (true) {
              if (var5 >= hob.field_d) {
                break L1;
              } else {
                L3: {
                  var6 = -2048 + grb.field_l[var5];
                  var7 = this.field_o + var6;
                  if (var7 >= -2048) {
                    stackIn_8_0 = var7;
                    break L3;
                  } else {
                    stackIn_8_0 = 4096 + var7;
                    break L3;
                  }
                }
                L4: {
                  var7 = stackIn_8_0;
                  if (-2049 <= (var7 ^ -1)) {
                    stackIn_11_0 = var7;
                    break L4;
                  } else {
                    stackIn_11_0 = -4096 + var7;
                    break L4;
                  }
                }
                L5: {
                  var7 = stackIn_11_0;
                  var8 = var4 + this.field_j;
                  if (2047 < (var8 ^ -1)) {
                    stackIn_14_0 = var8 - -4096;
                    break L5;
                  } else {
                    stackIn_14_0 = var8;
                    break L5;
                  }
                }
                L6: {
                  var8 = stackIn_14_0;
                  if (-2049 <= (var8 ^ -1)) {
                    stackIn_17_0 = var8;
                    break L6;
                  } else {
                    stackIn_17_0 = var8 + -4096;
                    break L6;
                  }
                }
                L7: {
                  var8 = stackIn_17_0;
                  var9 = var6 + this.field_l;
                  if (-2048 <= var9) {
                    stackIn_20_0 = var9;
                    break L7;
                  } else {
                    stackIn_20_0 = var9 - -4096;
                    break L7;
                  }
                }
                L8: {
                  var9 = stackIn_20_0;
                  if (2048 < var9) {
                    stackIn_23_0 = -4096 + var9;
                    break L8;
                  } else {
                    stackIn_23_0 = var9;
                    break L8;
                  }
                }
                L9: {
                  var9 = stackIn_23_0;
                  var10 = var4 - -this.field_i;
                  if ((var10 ^ -1) <= 2047) {
                    stackIn_26_0 = var10;
                    break L9;
                  } else {
                    stackIn_26_0 = var10 - -4096;
                    break L9;
                  }
                }
                L10: {
                  var10 = stackIn_26_0;
                  if (2048 < var10) {
                    stackIn_29_0 = var10 + -4096;
                    break L10;
                  } else {
                    stackIn_29_0 = var10;
                    break L10;
                  }
                }
                L11: {
                  L12: {
                    var10 = stackIn_29_0;
                    stackIn_32_0 = (int[]) (var12);

                    stackIn_32_1 = var5;

                    if (this.c(var8, -23429, var7)) {
                      break L12;
                    } else {




                      if (!this.d(var9, 1047718, var10)) {
                        stackIn_34_0 = (int[]) ((Object) stackIn_32_0);
                        stackIn_34_1 = stackIn_32_1;
                        stackIn_34_2 = 0;
                        break L11;
                      } else {
                        stackIn_32_0 = (int[]) ((Object) stackIn_32_0);

                        break L12;
                      }
                    }
                  }
                  stackIn_34_0 = (int[]) ((Object) stackIn_32_0);
                  stackIn_34_1 = stackIn_32_1;
                  stackIn_34_2 = 4096;
                  break L11;
                }
                stackIn_34_0[stackIn_34_1] = stackIn_34_2;
                var5++;
                continue L2;
              }
            }
          }
        }
        return var12;
    }

    public static void e(byte param0) {
        field_k = null;
        field_n = null;
        if (param0 > -117) {
            field_n = (String) null;
        }
    }

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var4_int = param0;
              if (var4_int != 0) {
                if (var4_int == 1) {
                  this.field_j = param2.e(1869);
                  break L1;
                } else {
                  if (-3 != (var4_int ^ -1)) {
                    if ((var4_int ^ -1) != -4) {
                      if (-5 == (var4_int ^ -1)) {
                        this.field_q = param2.e(1869);
                        break L1;
                      } else {
                        if (5 != var4_int) {
                          if (-7 == (var4_int ^ -1)) {
                            this.field_m = param2.e(1869);
                            break L1;
                          } else {
                            break L1;
                          }
                        } else {
                          this.field_p = param2.e(1869);
                          break L1;
                        }
                      }
                    } else {
                      this.field_i = param2.e(1869);
                      break L1;
                    }
                  } else {
                    this.field_l = param2.e(1869);
                    break L1;
                  }
                }
              } else {
                this.field_o = param2.e(1869);
                break L1;
              }
            }
            L2: {
              if (param1 <= -60) {
                break L2;
              } else {
                this.a(116, true);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var4);

            stackIn_25_1 = new StringBuilder().append("oqb.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L3;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
    }

    private final boolean c(int param0, int param1, int param2) {
        int var4;
        int var5;
        int stackIn_6_0 = 0;
        var4 = (-param2 + param0) * this.field_q >> 619212300;
        var5 = jmb.field_q[(var4 * 255 & 1047718) >> -1249142644];
        var5 = (var5 << 807292172) / this.field_q;
        if (param1 == -23429) {
          L0: {
            L1: {
              var5 = (var5 << 85288460) / this.field_m;
              var5 = var5 * this.field_p >> -1192175284;
              if (var5 <= param2 - -param0) {
                break L1;
              } else {
                if (-var5 >= param0 + param2) {
                  break L1;
                } else {
                  stackIn_6_0 = 1;
                  break L0;
                }
              }
            }
            stackIn_6_0 = 0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    static {
        field_k = "Quick Chat game";
        field_n = "Respect";
    }
}
