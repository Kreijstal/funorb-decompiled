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
        if (!(-1 != (param0 ^ -1))) {
            return 0;
        }
        if (!((param0 ^ -1) >= -1)) {
            var2 = 1;
            if (param0 > 65535) {
                param0 = param0 >> 16;
                var2 += 16;
            }
            if (-256 > (param0 ^ -1)) {
                var2 += 8;
                param0 = param0 >> 8;
            }
            if (!(param0 <= 15)) {
                var2 += 4;
                param0 = param0 >> 4;
            }
            if (-4 > (param0 ^ -1)) {
                var2 += 2;
                param0 = param0 >> 2;
            }
            if (!(-2 <= (param0 ^ -1))) {
                param0 = param0 >> 1;
                var2++;
            }
            return var2;
        }
        var2 = 2;
        if (!((param0 ^ -1) <= 65535)) {
            var2 += 16;
            param0 = param0 >> 16;
        }
        if ((param0 ^ -1) > 255) {
            param0 = param0 >> 8;
            var2 += 8;
        }
        if (param1 != 66) {
            field_H = true;
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
        if (param0 > -114) {
            StringBuilder var2 = (StringBuilder) null;
            td.a((CharSequence) null, (StringBuilder) null, -1, -77);
        }
        field_I = null;
    }

    final void a(int param0, int param1, byte param2, int param3) {
        int var5;
        int var6;
        int var7;
        lh var9;
        int var10;
        int var11;
        int var12;
        dm var13;
        dm var14;
        dm var15;
        var12 = Geoblox.field_C;
        super.a(param0, param1, (byte) -86, param3);
        if (0 == param3) {
          L0: {
            L1: {
              var5 = (this.field_r >> -649339007) + (this.field_v + param0);
              var7 = -74 % ((param2 - 1) / 43);
              var6 = param1 - (-this.field_m - (this.field_h >> -471639295));
              var9 = this.field_F.a((byte) -105);
              if (var9 == bf.field_g) {
                break L1;
              } else {
                if (si.field_n != var9) {
                  if (si.field_m != var9) {
                    if (var9 == kk.field_w) {
                      var15 = oa.field_e[1];
                      var15.c(-(var15.field_r >> -1719863487) + var5, var6 - (var15.field_m >> 2009440097), 256);
                      break L0;
                    } else {
                      break L0;
                    }
                  } else {
                    var14 = oa.field_e[2];
                    var14.c(-(var14.field_r >> 1489383873) + var5, var6 - (var14.field_m >> -2129057855), 256);
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
                var10 = var13.field_s << 1539250049;
                var11 = var13.field_o << 1598652321;
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
            var13.a(112, 144, var13.field_s << -972988668, var13.field_o << -1953583196, -this.field_G << -867460086, 4096);
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
                gd var3 = (gd) null;
                td.a(-67, (gd) null);
            }
            ja.a(false, kl.a(param1, 100, 96));
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "td.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static StringBuilder a(CharSequence param0, StringBuilder param1, int param2, int param3) {
        int incrementValue$1 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        gd var9 = null;
        StringBuilder stackIn_9_0 = null;
        StringBuilder stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              if (param3 > 23) {
                break L1;
              } else {
                var9 = (gd) null;
                td.a(-80, (gd) null);
                break L1;
              }
            }
            L2: {
              var4_int = param1.length();
              if ((param2 ^ -1) > -1) {
                break L2;
              } else {
                if (var4_int < param2) {
                  break L2;
                } else {
                  var5 = param0.length();
                  if (-1 != (var5 ^ -1)) {
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
                        stackIn_17_0 = (StringBuilder) (param1);
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        incrementValue$1 = param2;
                        param2++;
                        param1.setCharAt(incrementValue$1, param0.charAt(var7));
                        var7++;
                        continue L4;
                      }
                    }
                  } else {
                    stackIn_9_0 = (StringBuilder) (param1);
                    decompiledRegionSelector0 = 0;
                    break L0;
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
            stackIn_20_0 = (RuntimeException) (var4);

            stackIn_20_1 = new StringBuilder().append("td.J(");

            if (param0 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          L6: {


            stackIn_23_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');

            if (param1 == null) {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_21_0), stackIn_24_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_17_0;
        }
    }

    final void a(boolean param0, int param1, el param2, int param3) {
        try {
            this.field_G = this.field_G + 1;
            super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "td.H(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static void g(byte param0) {
        int var1 = -28 % ((param0 - 36) / 43);
        if (gb.field_f != -uf.field_a + 0 && 250 - uf.field_a == gb.field_f) {
        }
        gb.field_f = gb.field_f + 1;
    }

    final boolean a(byte param0, el param1) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -30) {
                break L1;
              } else {
                this.a(89, -88, (byte) -40, -90);
                break L1;
              }
            }
            stackIn_3_0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("td.UA(").append(param0).append(',');

            if (param1 == null) {
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
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0 != 0;
    }

    final static void a(byte param0) {
        if (param0 != -93) {
            return;
        }
        md.field_a.a(ue.field_f, (byte) -70);
    }

    td(dg param0) {
        try {
            this.field_F = param0;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "td.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final String c(byte param0) {
        if (param0 != 69) {
            return (String) null;
        }
        if (!(!this.field_l)) {
            return this.field_F.c(-21666);
        }
        return null;
    }

    static {
        field_I = new od("");
    }
}
