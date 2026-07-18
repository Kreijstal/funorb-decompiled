/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class td extends hk {
    private dg field_F;
    static od field_I;
    private int field_G;
    static boolean field_H;
    static int field_E;

    final static int a(int param0, byte param1) {
        int var2 = 0;
        if (!(param0 != 0)) {
            return 0;
        }
        if (!(param0 <= 0)) {
            var2 = 1;
            if (param0 > 65535) {
                param0 = param0 >> 16;
                var2 += 16;
            }
            if (param0 > 255) {
                var2 += 8;
                param0 = param0 >> 8;
            }
            if (!(param0 <= 15)) {
                var2 += 4;
                param0 = param0 >> 4;
            }
            if (param0 > 3) {
                var2 += 2;
                param0 = param0 >> 2;
            }
            if (!(param0 <= 1)) {
                param0 = param0 >> 1;
                var2++;
            }
            return var2;
        }
        var2 = 2;
        if (!(param0 >= -65536)) {
            var2 += 16;
            param0 = param0 >> 16;
        }
        if (param0 < -256) {
            param0 = param0 >> 8;
            var2 += 8;
        }
        if (-16 > param0) {
            param0 = param0 >> 4;
            var2 += 4;
        }
        if (param0 < -4) {
            param0 = param0 >> 2;
            var2 += 2;
        }
        if (-2 > param0) {
            var2++;
            param0 = param0 >> 1;
        }
        return var2;
    }

    public static void f(int param0) {
        field_I = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        lh var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        dm var13 = null;
        dm var14 = null;
        dm var15 = null;
        var12 = Geoblox.field_C;
        super.a(param0, param1, (byte) -86, param3);
        if (0 == param3) {
          L0: {
            L1: {
              var5 = (((td) this).field_r >> 1) + (((td) this).field_v + param0);
              var7 = -74 % ((param2 - 1) / 43);
              var6 = param1 - (-((td) this).field_m - (((td) this).field_h >> 1));
              var9 = ((td) this).field_F.a((byte) -105);
              if (var9 == bf.field_g) {
                break L1;
              } else {
                if (si.field_n != var9) {
                  if (si.field_m != var9) {
                    if (var9 == kk.field_w) {
                      var15 = oa.field_e[1];
                      var15.c(-(var15.field_r >> 1) + var5, var6 - (var15.field_m >> 1), 256);
                      break L0;
                    } else {
                      break L0;
                    }
                  } else {
                    var14 = oa.field_e[2];
                    var14.c(-(var14.field_r >> 1) + var5, var6 - (var14.field_m >> 1), 256);
                    break L0;
                  }
                } else {
                  break L1;
                }
              }
            }
            L2: {
              L3: {
                var13 = oa.field_e[0];
                var10 = var13.field_s << 1;
                var11 = var13.field_o << 1;
                if (null == da.field_b) {
                  break L3;
                } else {
                  if (var10 > da.field_b.field_r) {
                    break L3;
                  } else {
                    if (var11 > da.field_b.field_m) {
                      break L3;
                    } else {
                      Geoblox.a(1, da.field_b);
                      vb.c();
                      break L2;
                    }
                  }
                }
              }
              da.field_b = new dm(var10, var11);
              Geoblox.a(1, da.field_b);
              break L2;
            }
            var13.a(112, 144, var13.field_s << 4, var13.field_o << 4, -((td) this).field_G << 10, 4096);
            id.a(true);
            da.field_b.c(-var13.field_s + var5, var6 - var13.field_o, 256);
            break L0;
          }
          return;
        } else {
          return;
        }
    }

    final static void a(int param0, gd param1) {
        try {
            if (param0 != -348) {
                Object var3 = null;
                td.a(-67, (gd) null);
            }
            ja.a(false, kl.a(param1, 100, 96));
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "td.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static StringBuilder a(CharSequence param0, StringBuilder param1, int param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object var9 = null;
        StringBuilder stackIn_9_0 = null;
        StringBuilder stackIn_17_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        StringBuilder stackOut_16_0 = null;
        StringBuilder stackOut_8_0 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var8 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              if (param3 > 23) {
                break L1;
              } else {
                var9 = null;
                td.a(-80, (gd) null);
                break L1;
              }
            }
            L2: {
              var4_int = param1.length();
              if (param2 < 0) {
                break L2;
              } else {
                if (var4_int < param2) {
                  break L2;
                } else {
                  var5 = param0.length();
                  if (var5 != 0) {
                    L3: {
                      var6 = param2 - -var5;
                      if (var4_int < var6) {
                        param1.setLength(var6);
                        break L3;
                      } else {
                        break L3;
                      }
                    }
                    var7 = 0;
                    L4: while (true) {
                      if (var7 >= var5) {
                        stackOut_16_0 = (StringBuilder) param1;
                        stackIn_17_0 = stackOut_16_0;
                        break L0;
                      } else {
                        int incrementValue$2 = param2;
                        param2++;
                        param1.setCharAt(incrementValue$2, param0.charAt(var7));
                        var7++;
                        continue L4;
                      }
                    }
                  } else {
                    stackOut_8_0 = (StringBuilder) param1;
                    stackIn_9_0 = stackOut_8_0;
                    return stackIn_9_0;
                  }
                }
              }
            }
            throw new StringIndexOutOfBoundsException("length=" + var4_int + " startPos=" + param2);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_18_0 = (RuntimeException) var4;
            stackOut_18_1 = new StringBuilder().append("td.J(");
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param0 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          L6: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param1 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L6;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L6;
            }
          }
          throw t.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_17_0;
    }

    final void a(boolean param0, int param1, el param2, int param3) {
        try {
            ((td) this).field_G = ((td) this).field_G + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "td.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void g(byte param0) {
        int var1 = 0;
        if (gb.field_f != -uf.field_a) {
            if (250 - uf.field_a == gb.field_f) {
            }
        }
        gb.field_f = gb.field_f + 1;
    }

    final boolean a(byte param0, el param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param0 <= -30) {
                break L1;
              } else {
                ((td) this).a(89, -88, (byte) -40, -90);
                break L1;
              }
            }
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("td.UA(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final static void a(byte param0) {
        md.field_a.a(ue.field_f, (byte) -70);
    }

    td(dg param0) {
        try {
            ((td) this).field_F = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "td.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final String c(byte param0) {
        if (param0 != 69) {
            return null;
        }
        if (!(!((td) this).field_l)) {
            return ((td) this).field_F.c(-21666);
        }
        return null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_I = new od("");
    }
}
