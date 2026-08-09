/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc extends bh {
    static int field_g;
    static int field_j;
    private java.nio.ByteBuffer field_f;
    static int[] field_h;
    static int field_i;

    final static vc a(byte param0, String param1) {
        RuntimeException var2 = null;
        vc stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (!ib.field_f.a(false)) {
                break L1;
              } else {
                if (!param1.equals(ib.field_f.a((byte) -58))) {
                  ib.field_f = ug.a(param1, 0);
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == 45) {
                break L2;
              } else {
                jc.c((byte) -81);
                break L2;
              }
            }
            stackIn_7_0 = ib.field_f;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("jc.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        return stackIn_7_0;
    }

    final static void a(int param0, java.applet.Applet param1) {
        RuntimeException runtimeException = null;
        String var2 = null;
        int var3 = 0;
        CharSequence var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2 = param1.getParameter("username");
              if (var2 == null) {
                break L1;
              } else {
                var4 = (CharSequence) ((Object) var2);
                if (-1L != (ub.a(50, var4) ^ -1L)) {
                  var3 = 28 / ((-30 - param0) / 57);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (runtimeException);

            stackIn_8_1 = new StringBuilder().append("jc.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final void a(byte[] param0, byte param1) {
        try {
            this.field_f = java.nio.ByteBuffer.allocateDirect(param0.length);
            this.field_f.position(0);
            if (param1 >= -124) {
                String var4 = (String) null;
                jc.a((byte) -95, (String) null);
            }
            this.field_f.put(param0);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "jc.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final byte[] c(int param0) {
        byte[] var3 = new byte[this.field_f.capacity()];
        byte[] var2 = var3;
        this.field_f.position(0);
        if (param0 != 19707) {
            return (byte[]) null;
        }
        this.field_f.get(var3);
        return var3;
    }

    final static void a(int param0, bg param1, int param2) {
        lh var7 = null;
        lh var8 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
            var7 = nj.field_p;
            var8 = var7;
            var8.d(param0, -18392);
            var8.field_j = var8.field_j + 1;
            var4 = var8.field_j;
            var8.c(1, (byte) -93);
            var8.c(param1.field_i, -17402);
            var8.c(param1.field_u, -17402);
            var8.c(param1.field_m, -17402);
            var8.a(param1.field_o, (byte) 126);
            var8.a(param1.field_s, (byte) 107);
            if (param2 >= -93) {
                jc.c((byte) -14);
            }
            var8.a(param1.field_j, (byte) -112);
            var8.a(param1.field_h, (byte) -16);
            var8.c(param1.field_l.length, (byte) -111);
            for (var5 = 0; var5 < param1.field_l.length; var5++) {
                var7.a(param1.field_l[var5], (byte) 109);
            }
            var8.d(var4, (byte) 123);
            var8.b(-var4 + var8.field_j, (byte) 87);
        } catch (RuntimeException runtimeException) {
            throw ie.a((Throwable) ((Object) runtimeException), "jc.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    jc() {
    }

    final static void a(nh param0, int param1, int param2, byte param3, int param4, int param5) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_34_0 = null;
        StringBuilder stackIn_34_1 = null;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_35_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        var20 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var6_int = (param1 + -param2 << 281971560) / param0.field_z;
              var7 = param0.field_D * var6_int + (param2 << -147816056);
              param4 = param4 + param0.field_v;
              param5 = param5 + param0.field_D;
              var8 = wj.field_k * param4 + param5;
              var9 = 0;
              var10 = param0.field_w;
              var11 = param0.field_y;
              if (param3 >= 28) {
                break L1;
              } else {
                jc.c((byte) -103);
                break L1;
              }
            }
            L2: {
              var12 = wj.field_k - var11;
              var13 = 0;
              if (wj.field_e > param4) {
                var14 = wj.field_e + -param4;
                var8 = var8 + wj.field_k * var14;
                param4 = wj.field_e;
                var9 = var9 + var14 * var11;
                var10 = var10 - var14;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (var10 + param4 > wj.field_j) {
                var10 = var10 - (-wj.field_j + param4 + var10);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              if (wj.field_g <= param5) {
                break L4;
              } else {
                var14 = wj.field_g + -param5;
                var12 = var12 + var14;
                var11 = var11 - var14;
                param5 = wj.field_g;
                var13 = var13 + var14;
                var7 = var7 + var6_int * var14;
                var8 = var8 + var14;
                var9 = var9 + var14;
                break L4;
              }
            }
            L5: {
              if (wj.field_b >= var11 + param5) {
                break L5;
              } else {
                var14 = var11 + param5 + -wj.field_b;
                var13 = var13 + var14;
                var11 = var11 - var14;
                var12 = var12 + var14;
                break L5;
              }
            }
            L6: {
              if (-1 <= (var11 ^ -1)) {
                break L6;
              } else {
                if (var10 > 0) {
                  param4 = -var10;
                  L7: while (true) {
                    if (0 <= param4) {
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var14 = var7;
                      param5 = -var11;
                      L8: while (true) {
                        if (-1 >= (param5 ^ -1)) {
                          var8 = var8 + var12;
                          var9 = var9 + var13;
                          param4++;
                          continue L7;
                        } else {
                          L9: {
                            var15 = var14 >> -2137995576;
                            var14 = var14 + var6_int;
                            var16 = 256 + -var15;
                            if (-1 >= (var15 ^ -1)) {
                              L10: {
                                incrementValue$0 = var9;
                                var9++;
                                var17 = param0.field_B[incrementValue$0];
                                if (var17 != 0) {
                                  if ((var15 ^ -1) < -256) {
                                    wj.field_l[var8] = var17;
                                    break L10;
                                  } else {
                                    var18 = wj.field_l[var8];
                                    var19 = var16 * (16711935 & var18) - -(var15 * (var17 & 16711935)) >> -1727244440 & 16711935;
                                    wj.field_l[var8] = (rk.a(rk.a(65280, var18) * var16 - -(var15 * rk.a(65280, var17)), 16711720) >> -1324456056) + var19;
                                    break L10;
                                  }
                                } else {
                                  break L10;
                                }
                              }
                              var8++;
                              break L9;
                            } else {
                              var9++;
                              var8++;
                              break L9;
                            }
                          }
                          param5++;
                          continue L8;
                        }
                      }
                    }
                  }
                } else {
                  break L6;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var6 = decompiledCaughtException;
            stackIn_34_0 = (RuntimeException) (var6);

            stackIn_34_1 = new StringBuilder().append("jc.D(");

            if (param0 == null) {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "null";
              break L11;
            } else {
              stackIn_35_0 = (RuntimeException) ((Object) stackIn_34_0);
              stackIn_35_1 = (StringBuilder) ((Object) stackIn_34_1);
              stackIn_35_2 = "{...}";
              break L11;
            }
          }
          throw ie.a((Throwable) ((Object) stackIn_35_0), stackIn_35_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void c(byte param0) {
        field_h = null;
        if (param0 <= 24) {
            field_i = -53;
        }
    }

    static {
        field_j = 0;
        field_h = new int[8192];
    }
}
