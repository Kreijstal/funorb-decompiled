/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ek {
    static fh field_a;
    static dd field_c;
    static int[] field_d;
    static int[] field_b;

    public static void b(byte param0) {
        field_c = null;
        field_d = null;
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var13 = fleas.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = param4 + param1;
              var6 = param2 + param0;
              if (gb.field_l >= param1) {
                stackOut_3_0 = gb.field_l;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = param1;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (param2 > gb.field_b) {
                stackOut_6_0 = param2;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = gb.field_b;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (gb.field_h > var5_int) {
                stackOut_9_0 = var5_int;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = gb.field_h;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_10_0;
              if (gb.field_i <= var6) {
                stackOut_12_0 = gb.field_i;
                stackIn_13_0 = stackOut_12_0;
                break L4;
              } else {
                stackOut_11_0 = var6;
                stackIn_13_0 = stackOut_11_0;
                break L4;
              }
            }
            L5: {
              var10 = stackIn_13_0;
              if (gb.field_l > param1) {
                break L5;
              } else {
                if (param1 < gb.field_h) {
                  var11 = param1 + gb.field_d * var8;
                  var12 = -var8 + var10 + 1 >> 1;
                  L6: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L5;
                    } else {
                      gb.field_a[var11] = 16777215;
                      var11 = var11 + gb.field_d * 2;
                      continue L6;
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (gb.field_b > param2) {
                break L7;
              } else {
                if (var6 >= gb.field_i) {
                  break L7;
                } else {
                  var11 = param2 * gb.field_d + var7;
                  var12 = var9 + (1 - var7) >> 1;
                  L8: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L7;
                    } else {
                      gb.field_a[var11] = 16777215;
                      var11 += 2;
                      continue L8;
                    }
                  }
                }
              }
            }
            L9: {
              if (gb.field_l > var5_int) {
                break L9;
              } else {
                if (var5_int >= gb.field_h) {
                  break L9;
                } else {
                  var11 = var5_int + ((var5_int + -param1 & 1) + var8) * gb.field_d;
                  var12 = var10 + 1 - var8 >> 1;
                  L10: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L9;
                    } else {
                      gb.field_a[var11] = 16777215;
                      var11 = var11 + 2 * gb.field_d;
                      continue L10;
                    }
                  }
                }
              }
            }
            L11: {
              if (gb.field_b > param2) {
                break L11;
              } else {
                if (gb.field_i > var6) {
                  var11 = var7 + var6 * gb.field_d - -(1 & -param2 + var6);
                  var12 = -var7 + (var9 + 1) >> 1;
                  L12: while (true) {
                    var12--;
                    if (0 > var12) {
                      break L11;
                    } else {
                      gb.field_a[var11] = 16777215;
                      var11 += 2;
                      continue L12;
                    }
                  }
                } else {
                  return;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw pf.a((Throwable) (Object) var5, "ek.A(" + param0 + ',' + param1 + ',' + param2 + ',' + 1 + ',' + param4 + ')');
        }
    }

    final static void a(byte param0) {
        String var1 = null;
        if (jg.field_d) {
          if (ok.field_x == null) {
            var1 = ni.d(true);
            lg.field_b = new ul(var1, (String) null, true, false, false);
            nb.field_a.b((qa) (Object) ak.field_a, (byte) -35);
            if (param0 != -6) {
              ek.a((byte) 6);
              ak.field_a.d((qa) (Object) lg.field_b, 26034);
              ak.field_a.l(param0 ^ 5);
              return;
            } else {
              ak.field_a.d((qa) (Object) lg.field_b, 26034);
              ak.field_a.l(param0 ^ 5);
              return;
            }
          } else {
            ok.field_x.n(param0 ^ 22641);
            var1 = ni.d(true);
            lg.field_b = new ul(var1, (String) null, true, false, false);
            nb.field_a.b((qa) (Object) ak.field_a, (byte) -35);
            if (param0 == -6) {
              ak.field_a.d((qa) (Object) lg.field_b, 26034);
              ak.field_a.l(param0 ^ 5);
              return;
            } else {
              ek.a((byte) 6);
              ak.field_a.d((qa) (Object) lg.field_b, 26034);
              ak.field_a.l(param0 ^ 5);
              return;
            }
          }
        } else {
          throw new IllegalStateException();
        }
    }

    final static void a(int param0, int param1) {
        cl.field_a = ol.field_b[param1];
        sg.field_a = hg.field_p[param1];
        mk.field_a = sa.field_c[param1];
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new fh(15, 0, 1, 0);
        field_d = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_b = new int[10];
    }
}
