/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wg {
    static sb field_d;
    static int[] field_c;
    int[] field_f;
    static int field_e;
    static tf[] field_g;
    static boolean field_a;
    static int field_b;

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (-1 == (param0 ^ -1)) {
            return 0;
        }
        if (param1 != 15598) {
            return 95;
        }
        if (!(0 >= param0)) {
            var2 = 1;
            if (!((param0 ^ -1) >= -65536)) {
                param0 = param0 >> 16;
                var2 += 16;
            }
            if (255 < param0) {
                param0 = param0 >> 8;
                var2 += 8;
            }
            if (!(-16 <= (param0 ^ -1))) {
                var2 += 4;
                param0 = param0 >> 4;
            }
            if (!(-4 <= (param0 ^ -1))) {
                param0 = param0 >> 2;
                var2 += 2;
            }
            if ((param0 ^ -1) < -2) {
                var2++;
                param0 = param0 >> 1;
            }
            return var2;
        }
        var2 = 2;
        if (param0 < -65536) {
            param0 = param0 >> 16;
            var2 += 16;
        }
        if (!(param0 >= -256)) {
            var2 += 8;
            param0 = param0 >> 8;
        }
        if (!((param0 ^ -1) <= 15)) {
            param0 = param0 >> 4;
            var2 += 4;
        }
        if (!(3 >= (param0 ^ -1))) {
            param0 = param0 >> 2;
            var2 += 2;
        }
        if ((param0 ^ -1) > 1) {
            param0 = param0 >> 1;
            var2++;
        }
        return var2;
    }

    final static boolean a(String param0, String param1, byte param2) {
        RuntimeException var3 = null;
        byte[] var4 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_27_0 = 0;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        StringBuilder stackIn_34_1 = null;
        String stackIn_34_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (!nm.a(param0, 24)) {
              if (cm.a(param0, param2 ^ -98)) {
                stackIn_6_0 = 0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param2 == -4) {
                    break L1;
                  } else {
                    var4 = (byte[]) null;
                    wg.a((byte[]) null, 103, 27);
                    break L1;
                  }
                }
                if (ep.a((byte) 34, param0)) {
                  stackIn_12_0 = 0;
                  decompiledRegionSelector0 = 2;
                  break L0;
                } else {
                  if (-1 == (param1.length() ^ -1)) {
                    stackIn_16_0 = 1;
                    decompiledRegionSelector0 = 3;
                    break L0;
                  } else {
                    if (kb.a(param0, param1, (byte) -123)) {
                      stackIn_20_0 = 0;
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      if (!pc.a(param0, (byte) -47, param1)) {
                        if (gb.a(param0, param1, 95)) {
                          stackIn_27_0 = 0;
                          decompiledRegionSelector0 = 6;
                          break L0;
                        } else {
                          return true;
                        }
                      } else {
                        stackIn_23_0 = 0;
                        decompiledRegionSelector0 = 5;
                        break L0;
                      }
                    }
                  }
                }
              }
            } else {
              stackIn_2_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_30_0 = (RuntimeException) (var3);

            stackIn_30_1 = new StringBuilder().append("wg.E(");

            if (param0 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "null";
              break L2;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackIn_31_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackIn_31_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_33_1 = ((StringBuilder) (Object) stackIn_31_1).append(stackIn_31_2).append(',');

            if (param1 == null) {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "null";
              break L3;
            } else {
              stackIn_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackIn_34_1 = (StringBuilder) ((Object) stackIn_33_1);
              stackIn_34_2 = "{...}";
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_31_0), stackIn_34_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_12_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_16_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_20_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_23_0 != 0;
                  } else {
                    return stackIn_27_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    final ae a(ae param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        ae stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3_int = param0.field_h >> 1248022498;
              var4 = param0.field_g >> -1711839166;
              if (param1 >= 35) {
                break L1;
              } else {
                wg.b(-124, 49);
                break L1;
              }
            }
            var5 = param0.field_i >> 1708776290;
            stackIn_3_0 = new ae(this.field_f[0] * var3_int - (-(var4 * this.field_f[1]) + -(var5 * this.field_f[2])) >> 582335214, var3_int * this.field_f[3] + (this.field_f[4] * var4 - -(var5 * this.field_f[5])) >> -1357313266, var5 * this.field_f[8] + this.field_f[7] * var4 + this.field_f[6] * var3_int >> 1040638254);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("wg.G(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    final static int a(byte[] param0, int param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param1 >= 124) {
              stackIn_4_0 = da.a(param0, (byte) 110, 0, param2);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = -91;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var3);

            stackIn_7_1 = new StringBuilder().append("wg.H(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static boolean a(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param0 != -5057) {
          L0: {
            wg.a(26, 126);
            if (an.field_e.d(125)) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (an.field_e.d(125)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final static mc b(int param0, int param1) {
        mc var2;
        var2 = new mc();
        if (param0 != 255) {
          wg.a((byte) 74);
          tj.field_z.a(22125, var2);
          ro.a(127, param1);
          return var2;
        } else {
          tj.field_z.a(22125, var2);
          ro.a(127, param1);
          return var2;
        }
    }

    private wg(int[] param0) {
        try {
            if (param0.length != 9) {
                throw new RuntimeException();
            }
            this.field_f = param0;
        } catch (RuntimeException runtimeException) {
            throw aa.a((Throwable) ((Object) runtimeException), "wg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    wg(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_f = new int[9];
        this.field_f[4] = param4;
        this.field_f[5] = param5;
        this.field_f[2] = param2;
        this.field_f[6] = param6;
        this.field_f[1] = param1;
        this.field_f[7] = param7;
        this.field_f[8] = param8;
        this.field_f[3] = param3;
        this.field_f[0] = param0;
    }

    final wg a(int param0, wg param1) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        long var6 = 0L;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        wg stackIn_3_0 = null;
        wg stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var9 = Pixelate.field_H ? 1 : 0;
        try {
          L0: {
            var11 = new int[9];
            var10 = var11;
            var3 = var10;
            if (param0 == 8) {
              var4 = 0;
              L1: while (true) {
                if (-4 >= (var4 ^ -1)) {
                  stackIn_14_0 = new wg(var11);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var5 = 0;
                  L2: while (true) {
                    if (-4 >= (var5 ^ -1)) {
                      var4++;
                      continue L1;
                    } else {
                      var6 = 0L;
                      var8 = 0;
                      L3: while (true) {
                        if (-4 >= (var8 ^ -1)) {
                          var3[3 * var4 + var5] = (int)(var6 >> -486180464);
                          var5++;
                          continue L2;
                        } else {
                          var6 = var6 + (long)param1.field_f[var8 * 3 - -var5] * (long)this.field_f[var4 * 3 + var8];
                          var8++;
                          continue L3;
                        }
                      }
                    }
                  }
                }
              }
            } else {
              stackIn_3_0 = (wg) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3_ref);

            stackIn_17_1 = new StringBuilder().append("wg.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_14_0;
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_c = null;
        if (param0 != -27) {
            field_a = true;
            field_d = null;
            return;
        }
        field_d = null;
    }

    static {
        field_c = new int[4];
    }
}
