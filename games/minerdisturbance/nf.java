/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nf {
    static int field_c;
    static String[] field_a;
    static String field_g;
    mg[] field_f;
    static int field_e;
    static int[] field_d;
    static String field_b;
    static int field_h;

    final int a(int param0) {
        int var2;
        mg[] var3;
        int var4;
        mg var5;
        int var7;
        int var6;
        L0: {
          var7 = MinerDisturbance.field_ab;
          var2 = param0;
          if (null == this.field_f) {
            break L0;
          } else {
            var3 = this.field_f;
            var4 = 0;
            L1: while (true) {
              if (var4 >= var3.length) {
                break L0;
              } else {
                var5 = var3[var4];
                if (var5 != null) {
                  var6 = var5.b(-23719);
                  if (var6 > var2) {
                    var2 = var6;
                    var4++;
                    continue L1;
                  } else {
                    var4++;
                    continue L1;
                  }
                } else {
                  var4++;
                  continue L1;
                }
              }
            }
          }
        }
        return var2;
    }

    public static void a(boolean param0) {
        field_g = null;
        field_d = null;
        if (param0) {
            return;
        }
        field_b = null;
        field_a = null;
    }

    final int a(int param0, byte param1) {
        int var4 = 0;
        mg var5 = null;
        int var6 = MinerDisturbance.field_ab;
        if (param1 > -116) {
            field_c = -37;
        }
        mg[] var7 = this.field_f;
        mg[] var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (!(param0 >= var5.field_d.length)) {
                return var5.field_d[param0];
            }
            param0 = param0 - (var5.field_d.length - 1);
        }
        return 0;
    }

    final int a(byte param0, int param1) {
        mg var4 = null;
        int var5 = MinerDisturbance.field_ab;
        int var3 = 0;
        if (param0 != 39) {
            return 0;
        }
        while (var3 < this.field_f.length) {
            var4 = this.field_f[var3];
            if (var4.field_d.length > param1) {
                return var3;
            }
            param1 = param1 - (-1 + var4.field_d.length);
            var3++;
        }
        return this.field_f.length;
    }

    final int a(int param0, String param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_17_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = MinerDisturbance.field_ab;
        try {
          L0: {
            var5_int = 0;
            var6 = 0;
            var7 = param1.length();
            var8 = 0;
            L1: while (true) {
              if (var7 <= var8) {
                if (param0 >= 48) {
                  if ((var5_int ^ -1) < -1) {
                    stackIn_21_0 = (param3 - param2 << -606800696) / var5_int;
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    return 0;
                  }
                } else {
                  stackIn_17_0 = 125;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L2: {
                  var9 = param1.charAt(var8);
                  if (60 == var9) {
                    var6 = 1;
                    break L2;
                  } else {
                    if (var9 != 62) {
                      if (var6 == 0) {
                        if (var9 == 32) {
                          var5_int++;
                          break L2;
                        } else {
                          var8++;
                          continue L1;
                        }
                      } else {
                        var8++;
                        continue L1;
                      }
                    } else {
                      var6 = 0;
                      break L2;
                    }
                  }
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var5);

            stackIn_24_1 = new StringBuilder().append("nf.M(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L3;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L3;
            }
          }
          throw lj.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_17_0;
        } else {
          return stackIn_21_0;
        }
    }

    final int a(boolean param0, int param1, int param2) {
        int var5 = 0;
        mg var6 = null;
        int var7 = 0;
        int var8 = MinerDisturbance.field_ab;
        if (null == this.field_f || -1 == (this.field_f.length ^ -1) || param2 < this.field_f[0].field_h) {
            return -1;
        }
        if (this.field_f[this.field_f.length + -1].field_i < param2) {
            return -1;
        }
        if (-2 == (this.field_f.length ^ -1)) {
            return this.field_f[0].a(param1, -24040);
        }
        if (!param0) {
            return 45;
        }
        int var4 = 0;
        for (var5 = 0; var5 < this.field_f.length; var5++) {
            var6 = this.field_f[var5];
            if (param2 >= var6.field_h) {
                if (!(param2 > var6.field_i)) {
                    var7 = var6.a(param1, -24040);
                    if (!(-1 != var7)) {
                        return -1;
                    }
                    return var4 + var7;
                }
            }
            var4 = var4 + (-1 + var6.field_d.length);
        }
        return -1;
    }

    final int b(int param0) {
        int stackIn_7_0 = 0;
        L0: {
          if (param0 > 63) {
            break L0;
          } else {
            nf.a(false);
            break L0;
          }
        }
        L1: {
          L2: {
            if (this.field_f == null) {
              break L2;
            } else {
              if (-1 > (this.field_f.length ^ -1)) {
                stackIn_7_0 = -this.field_f[0].field_h + this.field_f[-1 + this.field_f.length].field_i;
                break L1;
              } else {
                break L2;
              }
            }
          }
          stackIn_7_0 = 0;
          break L1;
        }
        return stackIn_7_0;
    }

    static {
        field_a = new String[]{"Showing by rating", "Showing by win percentage"};
        field_d = new int[8192];
        field_b = "Finally! Science put to a practical use! Drop this into water to create ice cubes. Set it off near the ice cubes and perma freeze them! Don't go freezing yourself, though.";
    }
}
