/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vn extends le {
    private int field_k;
    static int field_m;
    static String field_i;
    private int field_l;
    private int field_j;

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        ds var6 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var4_int = param0;
              if (var4_int == 0) {
                this.field_j = param2.e((byte) -108);
                break L1;
              } else {
                if (1 != var4_int) {
                  if (2 == var4_int) {
                    this.field_k = param2.e(1869);
                    break L1;
                  } else {
                    break L1;
                  }
                } else {
                  this.field_l = param2.e((byte) -93);
                  break L1;
                }
              }
            }
            L2: {
              if (param1 < -60) {
                break L2;
              } else {
                var6 = (ds) null;
                this.a(-122, -52, (ds) null);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("vn.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
            return;
        }
        field_i = null;
    }

    final int[] a(int param0, boolean param1) {
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
        int[] var13;
        L0: {
          var11 = VoidHunters.field_G;
          var13 = this.field_f.a((byte) 120, param0);
          var12 = var13;
          var3 = var12;
          if (this.field_f.field_e) {
            var4 = 0;
            L1: while (true) {
              if (var4 >= hob.field_d) {
                break L0;
              } else {
                L2: {
                  var5 = grb.field_l[var4];
                  var6 = sj.field_p[param0];
                  var7 = var5 * this.field_j >> -1508719092;
                  var8 = this.field_l * var6 >> -445983476;
                  var9 = this.field_j * (var5 % (4096 / this.field_j));
                  var10 = var6 % (4096 / this.field_l) * this.field_l;
                  if (var10 >= this.field_k) {
                    break L2;
                  } else {
                    var7 = var7 - var8;
                    L3: while (true) {
                      if (var7 >= 0) {
                        L4: while (true) {
                          if (3 >= var7) {
                            var13 = var12;
                            if ((var7 ^ -1) == -2) {
                              var13 = var12;
                              if (this.field_k <= var9) {
                                break L2;
                              } else {
                                var13[var4] = 0;
                                var4++;
                                continue L1;
                              }
                            } else {
                              var13[var4] = 0;
                              var4++;
                              continue L1;
                            }
                          } else {
                            var7 -= 4;
                            continue L4;
                          }
                        }
                      } else {
                        var7 += 4;
                        continue L3;
                      }
                    }
                  }
                }
                L5: {
                  if (this.field_k <= var9) {
                    break L5;
                  } else {
                    var7 = var7 - var8;
                    L6: while (true) {
                      if ((var7 ^ -1) <= -1) {
                        L7: while (true) {
                          if ((var7 ^ -1) >= -4) {
                            if (0 < var7) {
                              var13[var4] = 0;
                              var4++;
                              continue L1;
                            } else {
                              break L5;
                            }
                          } else {
                            var7 -= 4;
                            continue L7;
                          }
                        }
                      } else {
                        var7 += 4;
                        continue L6;
                      }
                    }
                  }
                }
                var13[var4] = 4096;
                var4++;
                continue L1;
              }
            }
          } else {
            break L0;
          }
        }
        if (param1) {
          return var3;
        } else {
          return (int[]) null;
        }
    }

    public vn() {
        super(0, true);
        this.field_k = 204;
        this.field_l = 1;
        this.field_j = 1;
    }

    static {
        field_m = 32;
        field_i = "Standard thruster";
    }
}
