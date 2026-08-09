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
            field_a = (ed[]) null;
        }
        field_d = null;
        field_a = null;
        field_b = null;
    }

    final int a(int param0, byte param1) {
        if (this.field_e != null) {
            param0 = (int)((long)this.field_f * (long)param0 / (long)this.field_i);
        }
        if (param1 != -87) {
            field_a = (ed[]) null;
        }
        return param0;
    }

    final int a(boolean param0, int param1) {
        if (!(this.field_e == null)) {
            param1 = 6 - -(int)((long)param1 * (long)this.field_f / (long)this.field_i);
        }
        if (param0) {
            dd.a(-23);
        }
        return param1;
    }

    final byte[] a(int param0, byte[] param1) {
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
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
        var11 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (null == this.field_e) {
                break L1;
              } else {
                var3_int = (int)((long)this.field_f * (long)param1.length / (long)this.field_i) - -14;
                var16 = new int[var3_int];
                var14 = var16;
                var4 = var14;
                var5 = 0;
                var6 = 0;
                var7 = 0;
                L2: while (true) {
                  if (var7 >= param1.length) {
                    param1 = new byte[var3_int];
                    var12 = 0;
                    var7 = var12;
                    L3: while (true) {
                      if (var12 >= var3_int) {
                        break L1;
                      } else {
                        L4: {
                          var8 = 32768 + var16[var12] >> 720567248;
                          if ((var8 ^ -1) <= 127) {
                            if (-128 > (var8 ^ -1)) {
                              param1[var12] = (byte)127;
                              break L4;
                            } else {
                              param1[var12] = (byte)var8;
                              break L4;
                            }
                          } else {
                            param1[var12] = (byte)-128;
                            break L4;
                          }
                        }
                        var12++;
                        continue L3;
                      }
                    }
                  } else {
                    var8 = param1[var7];
                    var18 = this.field_e[var6];
                    var10 = 0;
                    L5: while (true) {
                      if (-15 >= (var10 ^ -1)) {
                        var6 = var6 + this.field_f;
                        var10 = var6 / this.field_i;
                        var5 = var5 + var10;
                        var6 = var6 - var10 * this.field_i;
                        var7++;
                        continue L2;
                      } else {
                        var4[var5 - -var10] = var4[var5 - -var10] + var8 * var18[var10];
                        var10++;
                        continue L5;
                      }
                    }
                  }
                }
              }
            }
            L6: {
              if (param0 == -128) {
                break L6;
              } else {
                field_g = (hh) null;
                break L6;
              }
            }
            stackIn_21_0 = (byte[]) (param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var3);

            stackIn_24_1 = new StringBuilder().append("dd.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L7;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L7;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        return stackIn_21_0;
    }

    dd(int param0, int param1) {
        int var3;
        int var4;
        int[] var5;
        double var6;
        int var8;
        int var9;
        double var10;
        double var12;
        double var14;
        if (param1 != param0) {
          var3 = im.a(param1, param0, 62);
          param1 = param1 / var3;
          param0 = param0 / var3;
          this.field_f = param1;
          this.field_e = new int[param0][14];
          this.field_i = param0;
          var4 = 0;
          L0: while (true) {
            if (var4 >= param0) {
              return;
            } else {
              L1: {
                var5 = this.field_e[var4];
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
          return;
        }
    }

    final static vn a(java.awt.Component param0, int param1, byte param2, int param3) {
        try {
            Class var4 = null;
            Throwable var4_ref = null;
            RuntimeException var4_ref2 = null;
            vn var5 = null;
            cg var5_ref = null;
            vn stackIn_2_0 = null;
            vn stackIn_4_0 = null;
            cg stackIn_6_0 = null;
            RuntimeException stackIn_9_0 = null;
            StringBuilder stackIn_9_1 = null;
            RuntimeException stackIn_10_0 = null;
            StringBuilder stackIn_10_1 = null;
            String stackIn_10_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                try {
                  L1: {
                    if (param2 == 125) {
                      var4 = Class.forName("kd");
                      var5 = (vn) (var4.newInstance());
                      var5.a(1018, param3, param0, param1);
                      stackIn_4_0 = (vn) (var5);
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      stackIn_2_0 = (vn) null;
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4_ref = decompiledCaughtException;
                  var5_ref = new cg();
                  ((vn) ((Object) var5_ref)).a(1018, param3, param0, param1);
                  stackIn_6_0 = (cg) (var5_ref);
                  return (vn) ((Object) stackIn_6_0);
                }
                if (decompiledRegionSelector0 == 0) {
                  decompiledRegionSelector1 = 0;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L2: {
                var4_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_9_0 = (RuntimeException) (var4_ref2);

                stackIn_9_1 = new StringBuilder().append("dd.B(");

                if (param0 == null) {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "null";
                  break L2;
                } else {
                  stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
                  stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
                  stackIn_10_2 = "{...}";
                  break L2;
                }
              }
              throw t.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
            }
            if (decompiledRegionSelector1 == 0) {
              return stackIn_2_0;
            } else {
              return stackIn_4_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
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
        field_b = "Five rock busters -  'ENTER' or 'R' or 'ALT' to fire";
        field_a = new ed[7];
        field_c = 0;
    }
}
