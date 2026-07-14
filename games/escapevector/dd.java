/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dd {
    private int field_i;
    static ll field_h;
    static h field_d;
    static hh field_g;
    static volatile int field_c;
    static String field_b;
    private int field_f;
    static ed[] field_a;
    private int[][] field_e;

    public static void a(int param0) {
        field_h = null;
        field_g = null;
        if (param0 < 88) {
            field_a = null;
        }
        field_d = null;
        field_a = null;
        field_b = null;
    }

    final int a(int param0, byte param1) {
        if (((dd) this).field_e != null) {
            param0 = (int)((long)((dd) this).field_f * (long)param0 / (long)((dd) this).field_i);
        }
        if (param1 != -87) {
            field_a = null;
        }
        return param0;
    }

    final int a(boolean param0, int param1) {
        if (!(((dd) this).field_e == null)) {
            param1 = 6 - -(int)((long)param1 * (long)((dd) this).field_f / (long)((dd) this).field_i);
        }
        if (param0) {
            dd.a(-23);
        }
        return param1;
    }

    final byte[] a(int param0, byte[] param1) {
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int[] var14 = null;
        int[] var16 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] var20 = null;
        L0: {
          var11 = EscapeVector.field_A;
          if (null == ((dd) this).field_e) {
            break L0;
          } else {
            var3 = (int)((long)((dd) this).field_f * (long)param1.length / (long)((dd) this).field_i) - -14;
            var20 = new int[var3];
            var18 = var20;
            var16 = var18;
            var14 = var16;
            var4 = var14;
            var5 = 0;
            var6 = 0;
            var7 = 0;
            L1: while (true) {
              if (var7 >= param1.length) {
                param1 = new byte[var3];
                var12 = 0;
                var7 = var12;
                L2: while (true) {
                  if (var12 >= var3) {
                    break L0;
                  } else {
                    var8 = 32768 + var20[var12] >> 720567248;
                    if (var8 <= 127) {
                      if (-128 < var8) {
                        param1[var12] = (byte)127;
                        var12++;
                        continue L2;
                      } else {
                        param1[var12] = (byte)var8;
                        var12++;
                        continue L2;
                      }
                    } else {
                      param1[var12] = (byte)-128;
                      var12++;
                      continue L2;
                    }
                  }
                }
              } else {
                var8 = param1[var7];
                var19 = ((dd) this).field_e[var6];
                var10 = 0;
                L3: while (true) {
                  if (-15 >= (var10 ^ -1)) {
                    var6 = var6 + ((dd) this).field_f;
                    var10 = var6 / ((dd) this).field_i;
                    var5 = var5 + var10;
                    var6 = var6 - var10 * ((dd) this).field_i;
                    var7++;
                    continue L1;
                  } else {
                    var4[var5 - -var10] = var4[var5 - -var10] + var8 * var19[var10];
                    var10++;
                    continue L3;
                  }
                }
              }
            }
          }
        }
        L4: {
          if (param0 == -128) {
            break L4;
          } else {
            field_g = null;
            break L4;
          }
        }
        return param1;
    }

    dd(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        double var12 = 0.0;
        double var14 = 0.0;
        if (param1 != param0) {
          var3 = im.a(param1, param0, 62);
          param1 = param1 / var3;
          param0 = param0 / var3;
          ((dd) this).field_f = param1;
          ((dd) this).field_e = new int[param0][14];
          ((dd) this).field_i = param0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= param0) {
            } else {
              L1: {
                var5 = ((dd) this).field_e[var4];
                var6 = (double)var4 / (double)param0 + 6.0;
                var8 = (int)Math.floor(-7.0 + var6 + 1.0);
                if (-1 >= (var8 ^ -1)) {
                  break L1;
                } else {
                  var8 = 0;
                  break L1;
                }
              }
              L2: {
                var9 = (int)Math.ceil(var6 + 7.0);
                if ((var9 ^ -1) >= -15) {
                  break L2;
                } else {
                  var9 = 14;
                  break L2;
                }
              }
              var10 = (double)param1 / (double)param0;
              L3: while (true) {
                if (var9 <= var8) {
                  var4++;
                  continue L0;
                } else {
                  L4: {
                    L5: {
                      var12 = ((double)var8 - var6) * 3.141592653589793;
                      var14 = var10;
                      if (var12 < -0.0001) {
                        break L5;
                      } else {
                        if (var12 <= 0.0001) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    var14 = var14 * (Math.sin(var12) / var12);
                    break L4;
                  }
                  var14 = var14 * (Math.cos(0.2243994752564138 * (-var6 + (double)var8)) * 0.46 + 0.54);
                  var5[var8] = (int)Math.floor(var14 * 65536.0 + 0.5);
                  var8++;
                  continue L3;
                }
              }
            }
          }
        } else {
        }
    }

    final static vn a(java.awt.Component param0, int param1, byte param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            vn var5 = null;
            cg var5_ref = null;
            Object stackIn_2_0 = null;
            vn stackIn_4_0 = null;
            Throwable decompiledCaughtException = null;
            Object stackOut_1_0 = null;
            vn stackOut_3_0 = null;
            try {
              if (param2 == 125) {
                return (vn) (Object) stackIn_2_0;
              } else {
                stackOut_1_0 = null;
                stackIn_2_0 = stackOut_1_0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              var4 = Class.forName("kd");
              var5 = (vn) var4.newInstance();
              var5.a(1018, param3, param0, param1);
              stackOut_3_0 = (vn) var5;
              stackIn_4_0 = stackOut_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    final static int a(int param0, byte param1, int param2, int param3, int param4) {
        int var5 = param4;
        int var6 = 1 + param3;
        int var7 = -param0 + param2;
        int var8 = var7 - param4 * var6;
        var5 = var5 + var8 / 2;
        var8 = -(var8 / 2 * 2) + (-(var6 * param4) + var7);
        if (param1 <= 75) {
            return 19;
        }
        var5 = var5 + var8;
        return var5;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Five rock busters -  'ENTER' or 'R' or 'ALT' to fire";
        field_a = new ed[7];
        field_c = 0;
    }
}
