/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class td extends ms {
    byte[] field_q;
    static String field_l;
    qp[] field_o;
    byte[] field_t;
    mq[] field_n;
    private int[] field_p;
    static boolean field_m;
    static int field_u;
    byte[] field_r;
    short[] field_k;
    int field_s;

    final boolean a(byte[] param0, int[] param1, og param2, int param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_20_0 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            var5_int = 1;
            if (param3 == 1255750754) {
              var6 = 0;
              var7 = null;
              var8 = 0;
              L1: while (true) {
                if (var8 >= 128) {
                  stackIn_20_0 = var5_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    L3: {
                      if (param0 == null) {
                        break L3;
                      } else {
                        if (param0[var8] == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    var9 = this.field_p[var8];
                    if (var9 == 0) {
                      break L2;
                    } else {
                      L4: {
                        if (var6 == var9) {
                          break L4;
                        } else {
                          L5: {
                            var6 = var9;
                            var9--;
                            if ((1 & var9) != 0) {
                              var7 = param2.b(-94, param1, var9 >> 227756258);
                              break L5;
                            } else {
                              var7 = param2.a(var9 >> 1255750754, param1, 10709);
                              break L5;
                            }
                          }
                          if (var7 != null) {
                            break L4;
                          } else {
                            var5_int = 0;
                            break L4;
                          }
                        }
                      }
                      if (var7 == null) {
                        break L2;
                      } else {
                        this.field_o[var8] = (qp) (var7);
                        this.field_p[var8] = 0;
                        break L2;
                      }
                    }
                  }
                  var8++;
                  continue L1;
                }
              }
            } else {
              stackIn_3_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_23_0 = (RuntimeException) (var5);

            stackIn_23_1 = new StringBuilder().append("td.D(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L6;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_26_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_24_2).append(',');

            if (param1 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L7;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_29_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_27_2).append(',');

            if (param2 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "null";
              break L8;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_30_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackIn_30_2 = "{...}";
              break L8;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_24_0), stackIn_30_2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0 != 0;
        } else {
          return stackIn_20_0 != 0;
        }
    }

    public static void a(byte param0) {
        field_l = null;
        if (param0 <= 62) {
            td.a(86, -115L);
        }
    }

    final static java.net.URL a(byte param0, java.applet.Applet param1, java.net.URL param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        Object stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        Object stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = null;
              var4 = null;
              if (bf.field_d == null) {
                break L1;
              } else {
                if (!bf.field_d.equals(param1.getParameter("settings"))) {
                  var3 = bf.field_d;
                  var4 = var3;
                  var4 = var3;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (js.field_J == null) {
                break L2;
              } else {
                if (!js.field_J.equals(param1.getParameter("session"))) {
                  var4 = js.field_J;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            if (param0 >= 120) {
              stackIn_12_0 = ej.a(param2, (String) (var4), -1, (String) (var3), -1);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_10_0 = (java.net.URL) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_15_0 = var3;

            stackIn_15_1 = new StringBuilder().append("td.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = stackIn_15_0;
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L3;
            } else {
              stackIn_16_0 = stackIn_15_0;
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_18_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',');

            if (param2 == null) {

              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {

              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_16_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0;
        } else {
          return stackIn_12_0;
        }
    }

    final void d(byte param0) {
        this.field_p = null;
        int var2 = -58 % ((param0 - 73) / 51);
    }

    final static byte[] a(int param0, int param1) {
        byte[] var11 = null;
        byte[] var10 = null;
        byte[] var3_ref_byte__ = null;
        Random var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var5 = 0;
        int var9 = Sumoblitz.field_L ? 1 : 0;
        gg var2 = (gg) ((Object) pi.field_a.a((byte) -88, (long)param0));
        if (var2 == null) {
            var11 = new byte[512];
            var10 = var11;
            var3_ref_byte__ = var10;
            var4 = new Random((long)param0);
            for (var5 = 0; -256 < (var5 ^ -1); var5++) {
                var3_ref_byte__[var5] = (byte)var5;
            }
            for (var5 = 0; 255 > var5; var5++) {
                var6 = 255 - var5;
                var7 = fi.a(var6, var4, (byte) -96);
                var8 = var11[var7];
                var3_ref_byte__[var7] = var11[var6];
                var3_ref_byte__[-var5 + 511] = (byte) var8;
                var3_ref_byte__[var6] = (byte) var8;
            }
            var2 = new gg(var11);
            pi.field_a.a((long)param0, var2, -128);
        }
        int var3 = -104 / ((60 - param1) / 58);
        return var2.field_s;
    }

    final static String a(int param0, long param1) {
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        StringBuilder discarded$0 = null;
        int var11 = Sumoblitz.field_L ? 1 : 0;
        if ((param1 ^ -1L) >= -1L) {
            return null;
        }
        if (6582952005840035281L <= param1) {
            return null;
        }
        if (-1L == (param1 % 37L ^ -1L)) {
            return null;
        }
        if (param0 != -29275) {
            field_u = 98;
        }
        int var3 = 0;
        long var4 = param1;
        while (-1L != (var4 ^ -1L)) {
            var3++;
            var4 = var4 / 37L;
        }
        StringBuilder var6 = new StringBuilder(var3);
        while (param1 != 0L) {
            var7 = param1;
            param1 = param1 / 37L;
            var9 = vm.field_b[(int)(-(37L * param1) + var7)];
            if (!(var9 != 95)) {
                var10 = var6.length() - 1;
                var9 = 160;
                var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
            }
            discarded$0 = var6.append((char) var9);
        }
        var6.reverse();
        var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
        return var6.toString();
    }

    final static void c(byte param0) {
        int var1_int = 0;
        ah var2 = null;
        int var3 = Sumoblitz.field_L ? 1 : 0;
        try {
            if (param0 != 77) {
                field_u = -102;
            }
            if (aa.field_a != null) {
                for (var1_int = 0; var1_int < db.field_l; var1_int++) {
                    var2 = aa.field_a[var1_int];
                    if (!(var2 == null)) {
                        var2.d(-76);
                    }
                }
            }
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "td.B(" + param0 + ')');
        }
    }

    td(byte[] param0) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        mq dupTemp$8 = null;
        byte[] stackIn_39_0 = null;
        byte[] stackIn_42_0 = null;
        RuntimeException stackIn_205_0 = null;
        StringBuilder stackIn_205_1 = null;
        RuntimeException stackIn_206_0 = null;
        StringBuilder stackIn_206_1 = null;
        String stackIn_206_2 = null;
        Throwable caughtException = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        byte[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        byte[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        byte[] var10 = null;
        int var11_int = 0;
        byte[] var11 = null;
        int var12 = 0;
        int var13_int = 0;
        mq[] var13 = null;
        int var14 = 0;
        int var15_int = 0;
        byte[] var15 = null;
        mq var15_ref = null;
        byte[] var16 = null;
        int var16_int = 0;
        int var17 = 0;
        byte[] var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        Object var25 = null;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var37 = 0;
        fs var38 = null;
        byte[] var39 = null;
        mq var40 = null;
        byte[] var41 = null;
        byte[] var42 = null;
        byte[] var43 = null;
        byte[] var44 = null;
        mq var45 = null;
        byte[] var46 = null;
        byte[] var47 = null;
        mq var48 = null;
        mq var49 = null;
        mq var50 = null;
        mq var51 = null;
        mq var52 = null;
        byte[] var53 = null;
        byte[] var54 = null;
        byte[] var55 = null;
        byte[] var56 = null;
        byte[] var57 = null;
        byte[] var58 = null;
        try {
          L0: {
            this.field_k = new short[128];
            this.field_n = new mq[128];
            this.field_q = new byte[128];
            this.field_o = new qp[128];
            this.field_p = new int[128];
            this.field_t = new byte[128];
            this.field_r = new byte[128];
            var38 = new fs(param0);
            var3 = 0;
            L1: while (true) {
              if (var38.field_n[var38.field_p + var3] == 0) {
                var55 = new byte[var3];
                var42 = var55;
                var4 = var42;
                var5 = 0;
                L2: while (true) {
                  if (var3 <= var5) {
                    var3++;
                    var38.field_p = var38.field_p + 1;
                    var5 = var38.field_p;
                    var38.field_p = var38.field_p + var3;
                    var6 = 0;
                    L3: while (true) {
                      if (0 == var38.field_n[var6 + var38.field_p]) {
                        var56 = new byte[var6];
                        var43 = var56;
                        var7 = var43;
                        var8 = 0;
                        L4: while (true) {
                          if (var6 <= var8) {
                            var6++;
                            var38.field_p = var38.field_p + 1;
                            var8 = var38.field_p;
                            var38.field_p = var38.field_p + var6;
                            var9 = 0;
                            L5: while (true) {
                              if (var38.field_n[var9 + var38.field_p] == 0) {
                                var57 = new byte[var9];
                                var44 = var57;
                                var10 = var44;
                                var11_int = 0;
                                L6: while (true) {
                                  if (var9 <= var11_int) {
                                    L7: {
                                      var9++;
                                      var38.field_p = var38.field_p + 1;
                                      var53 = new byte[var9];
                                      var39 = var53;
                                      var11 = var39;
                                      if (var9 > 1) {
                                        var53[1] = (byte) 1;
                                        var12 = 2;
                                        var13_int = 1;
                                        var14 = 2;
                                        L8: while (true) {
                                          if (var9 <= var14) {
                                            break L7;
                                          } else {
                                            L9: {
                                              var15_int = var38.e(-31302);
                                              if (var15_int == 0) {
                                                incrementValue$0 = var12;
                                                var12++;
                                                var13_int = incrementValue$0;
                                                break L9;
                                              } else {
                                                L10: {
                                                  if (var13_int < var15_int) {
                                                    break L10;
                                                  } else {
                                                    var15_int--;
                                                    break L10;
                                                  }
                                                }
                                                var13_int = var15_int;
                                                break L9;
                                              }
                                            }
                                            var11[var14] = (byte)var13_int;
                                            var14++;
                                            continue L8;
                                          }
                                        }
                                      } else {
                                        var12 = var9;
                                        break L7;
                                      }
                                    }
                                    var13 = new mq[var12];
                                    var14 = 0;
                                    L11: while (true) {
                                      if (var14 >= var13.length) {
                                        L12: {
                                          var14 = var38.e(-31302);
                                          if (0 < var14) {
                                            stackIn_39_0 = new byte[2 * var14];
                                            break L12;
                                          } else {
                                            stackIn_39_0 = null;
                                            break L12;
                                          }
                                        }
                                        L13: {
                                          var58 = stackIn_39_0;
                                          var46 = var58;
                                          var15 = var46;
                                          var14 = var38.e(-31302);
                                          if (0 >= var14) {
                                            stackIn_42_0 = null;
                                            break L13;
                                          } else {
                                            stackIn_42_0 = new byte[2 * var14];
                                            break L13;
                                          }
                                        }
                                        var47 = stackIn_42_0;
                                        var16 = var47;
                                        var17 = 0;
                                        L14: while (true) {
                                          if (-1 == (var38.field_n[var38.field_p - -var17] ^ -1)) {
                                            var54 = new byte[var17];
                                            var41 = var54;
                                            var18 = var41;
                                            var19 = 0;
                                            L15: while (true) {
                                              if (var19 >= var17) {
                                                var38.field_p = var38.field_p + 1;
                                                var17++;
                                                var19 = 0;
                                                var20 = 0;
                                                L16: while (true) {
                                                  if (var20 >= 128) {
                                                    var19 = 0;
                                                    var20 = 0;
                                                    L17: while (true) {
                                                      if (var20 >= 128) {
                                                        var20 = 0;
                                                        var21 = 0;
                                                        var22 = 0;
                                                        var23 = 0;
                                                        L18: while (true) {
                                                          if (-129 >= (var23 ^ -1)) {
                                                            var20 = 0;
                                                            var21 = 0;
                                                            var23 = 0;
                                                            var24 = 0;
                                                            L19: while (true) {
                                                              if (-129 >= (var24 ^ -1)) {
                                                                var21 = 0;
                                                                var20 = 0;
                                                                var24 = 0;
                                                                var25_int = 0;
                                                                L20: while (true) {
                                                                  if (-129 >= (var25_int ^ -1)) {
                                                                    var21 = 0;
                                                                    var20 = 0;
                                                                    var25 = null;
                                                                    var26 = 0;
                                                                    L21: while (true) {
                                                                      if ((var26 ^ -1) <= -129) {
                                                                        var20 = 0;
                                                                        var21 = 0;
                                                                        var26 = 0;
                                                                        var27 = 0;
                                                                        L22: while (true) {
                                                                          if (128 <= var27) {
                                                                            this.field_s = 1 + var38.e(-31302);
                                                                            var27 = 0;
                                                                            L23: while (true) {
                                                                              if (var12 <= var27) {
                                                                                L24: {
                                                                                  if (var15 == null) {
                                                                                    break L24;
                                                                                  } else {
                                                                                    var27 = 1;
                                                                                    L25: while (true) {
                                                                                      if (var27 >= var58.length) {
                                                                                        break L24;
                                                                                      } else {
                                                                                        var15[var27] = var38.d(true);
                                                                                        var27 += 2;
                                                                                        continue L25;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L26: {
                                                                                  if (var16 == null) {
                                                                                    break L26;
                                                                                  } else {
                                                                                    var27 = 1;
                                                                                    L27: while (true) {
                                                                                      if (var27 >= var47.length) {
                                                                                        break L26;
                                                                                      } else {
                                                                                        var16[var27] = var38.d(true);
                                                                                        var27 += 2;
                                                                                        continue L27;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var27 = 0;
                                                                                L28: while (true) {
                                                                                  if (var27 >= var12) {
                                                                                    var27 = 0;
                                                                                    L29: while (true) {
                                                                                      if (var12 <= var27) {
                                                                                        L30: {
                                                                                          if (var15 == null) {
                                                                                            break L30;
                                                                                          } else {
                                                                                            var19 = var38.e(-31302);
                                                                                            var15[0] = (byte)var19;
                                                                                            var27 = 2;
                                                                                            L31: while (true) {
                                                                                              if (var27 >= var58.length) {
                                                                                                var27 = var58[0];
                                                                                                var28 = var58[1];
                                                                                                var29 = 0;
                                                                                                L32: while (true) {
                                                                                                  if (var29 >= var27) {
                                                                                                    var29 = 2;
                                                                                                    L33: while (true) {
                                                                                                      if (var58.length <= var29) {
                                                                                                        var15 = null;
                                                                                                        var30 = var27;
                                                                                                        L34: while (true) {
                                                                                                          if (-129 >= (var30 ^ -1)) {
                                                                                                            break L30;
                                                                                                          } else {
                                                                                                            this.field_q[var30] = (byte)(this.field_q[var30] * var28 - -32 >> 26655494);
                                                                                                            var30++;
                                                                                                            continue L34;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        var30 = var58[var29];
                                                                                                        var31 = var15[var29 + 1];
                                                                                                        var32 = (-var27 + var30) * var28 - -((-var27 + var30) / 2);
                                                                                                        var33 = var27;
                                                                                                        L35: while (true) {
                                                                                                          if (var30 <= var33) {
                                                                                                            var28 = var31;
                                                                                                            var29 += 2;
                                                                                                            var27 = var30;
                                                                                                            continue L33;
                                                                                                          } else {
                                                                                                            var34 = dh.b(var32, var30 + -var27, false);
                                                                                                            var32 = var32 + (var31 + -var28);
                                                                                                            this.field_q[var33] = (byte)(32 + this.field_q[var33] * var34 >> -1926406522);
                                                                                                            var33++;
                                                                                                            continue L35;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    this.field_q[var29] = (byte)(32 + this.field_q[var29] * var28 >> -387598074);
                                                                                                    var29++;
                                                                                                    continue L32;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var19 = 1 + var19 + var38.e(-31302);
                                                                                                var15[var27] = (byte)var19;
                                                                                                var27 += 2;
                                                                                                continue L31;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        L36: {
                                                                                          if (var16 == null) {
                                                                                            break L36;
                                                                                          } else {
                                                                                            var19 = var38.e(-31302);
                                                                                            var16[0] = (byte)var19;
                                                                                            var27 = 2;
                                                                                            L37: while (true) {
                                                                                              if (var27 >= var47.length) {
                                                                                                var27 = var47[0];
                                                                                                var28 = var47[1] << 1201683361;
                                                                                                var29 = 0;
                                                                                                L38: while (true) {
                                                                                                  if (var29 >= var27) {
                                                                                                    var29 = 2;
                                                                                                    L39: while (true) {
                                                                                                      if (var47.length <= var29) {
                                                                                                        var30 = var27;
                                                                                                        L40: while (true) {
                                                                                                          if (var30 >= 128) {
                                                                                                            var16 = null;
                                                                                                            break L36;
                                                                                                          } else {
                                                                                                            L41: {
                                                                                                              var31 = var28 + (255 & this.field_t[var30]);
                                                                                                              if (-1 >= (var31 ^ -1)) {
                                                                                                                break L41;
                                                                                                              } else {
                                                                                                                var31 = 0;
                                                                                                                break L41;
                                                                                                              }
                                                                                                            }
                                                                                                            L42: {
                                                                                                              if (-129 <= (var31 ^ -1)) {
                                                                                                                break L42;
                                                                                                              } else {
                                                                                                                var31 = 128;
                                                                                                                break L42;
                                                                                                              }
                                                                                                            }
                                                                                                            this.field_t[var30] = (byte)var31;
                                                                                                            var30++;
                                                                                                            continue L40;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        var30 = var47[var29];
                                                                                                        var31 = var16[var29 - -1] << -1374601055;
                                                                                                        var32 = (var30 + -var27) / 2 + (-var27 + var30) * var28;
                                                                                                        var37 = var27;
                                                                                                        var33 = var37;
                                                                                                        L43: while (true) {
                                                                                                          if (var37 >= var30) {
                                                                                                            var29 += 2;
                                                                                                            var28 = var31;
                                                                                                            var27 = var30;
                                                                                                            continue L39;
                                                                                                          } else {
                                                                                                            L44: {
                                                                                                              var34 = dh.b(var32, var30 + -var27, false);
                                                                                                              var35 = (this.field_t[var37] & 255) - -var34;
                                                                                                              if (0 <= var35) {
                                                                                                                break L44;
                                                                                                              } else {
                                                                                                                var35 = 0;
                                                                                                                break L44;
                                                                                                              }
                                                                                                            }
                                                                                                            L45: {
                                                                                                              if (128 >= var35) {
                                                                                                                break L45;
                                                                                                              } else {
                                                                                                                var35 = 128;
                                                                                                                break L45;
                                                                                                              }
                                                                                                            }
                                                                                                            var32 = var32 + (-var28 + var31);
                                                                                                            this.field_t[var37] = (byte)var35;
                                                                                                            var37++;
                                                                                                            continue L43;
                                                                                                          }
                                                                                                        }
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    L46: {
                                                                                                      var30 = (this.field_t[var29] & 255) - -var28;
                                                                                                      if (-1 >= (var30 ^ -1)) {
                                                                                                        break L46;
                                                                                                      } else {
                                                                                                        var30 = 0;
                                                                                                        break L46;
                                                                                                      }
                                                                                                    }
                                                                                                    L47: {
                                                                                                      if (var30 <= 128) {
                                                                                                        break L47;
                                                                                                      } else {
                                                                                                        var30 = 128;
                                                                                                        break L47;
                                                                                                      }
                                                                                                    }
                                                                                                    this.field_t[var29] = (byte)var30;
                                                                                                    var29++;
                                                                                                    continue L38;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                var19 = 1 + var19 - -var38.e(-31302);
                                                                                                var16[var27] = (byte)var19;
                                                                                                var27 += 2;
                                                                                                continue L37;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        var27 = 0;
                                                                                        L48: while (true) {
                                                                                          if (var27 >= var12) {
                                                                                            var27 = 0;
                                                                                            L49: while (true) {
                                                                                              if (var27 >= var12) {
                                                                                                var27 = 0;
                                                                                                L50: while (true) {
                                                                                                  if (var12 <= var27) {
                                                                                                    var27 = 0;
                                                                                                    L51: while (true) {
                                                                                                      if (var12 <= var27) {
                                                                                                        var27 = 0;
                                                                                                        L52: while (true) {
                                                                                                          if (var27 >= var12) {
                                                                                                            break L0;
                                                                                                          } else {
                                                                                                            L53: {
                                                                                                              var52 = var13[var27];
                                                                                                              if (0 >= var52.field_b) {
                                                                                                                break L53;
                                                                                                              } else {
                                                                                                                var52.field_e = var38.e(-31302);
                                                                                                                break L53;
                                                                                                              }
                                                                                                            }
                                                                                                            var27++;
                                                                                                            continue L52;
                                                                                                          }
                                                                                                        }
                                                                                                      } else {
                                                                                                        L54: {
                                                                                                          var51 = var13[var27];
                                                                                                          if (-1 <= (var51.field_j ^ -1)) {
                                                                                                            break L54;
                                                                                                          } else {
                                                                                                            var51.field_b = var38.e(-31302);
                                                                                                            break L54;
                                                                                                          }
                                                                                                        }
                                                                                                        var27++;
                                                                                                        continue L51;
                                                                                                      }
                                                                                                    }
                                                                                                  } else {
                                                                                                    var13[var27].field_j = var38.e(-31302);
                                                                                                    var27++;
                                                                                                    continue L50;
                                                                                                  }
                                                                                                }
                                                                                              } else {
                                                                                                L55: {
                                                                                                  var50 = var13[var27];
                                                                                                  if (null == var50.field_g) {
                                                                                                    break L55;
                                                                                                  } else {
                                                                                                    var50.field_f = var38.e(-31302);
                                                                                                    break L55;
                                                                                                  }
                                                                                                }
                                                                                                L56: {
                                                                                                  if (null == var50.field_h) {
                                                                                                    break L56;
                                                                                                  } else {
                                                                                                    var50.field_c = var38.e(-31302);
                                                                                                    break L56;
                                                                                                  }
                                                                                                }
                                                                                                L57: {
                                                                                                  if ((var50.field_i ^ -1) >= -1) {
                                                                                                    break L57;
                                                                                                  } else {
                                                                                                    var50.field_d = var38.e(-31302);
                                                                                                    break L57;
                                                                                                  }
                                                                                                }
                                                                                                var27++;
                                                                                                continue L49;
                                                                                              }
                                                                                            }
                                                                                          } else {
                                                                                            var13[var27].field_i = var38.e(-31302);
                                                                                            var27++;
                                                                                            continue L48;
                                                                                          }
                                                                                        }
                                                                                      } else {
                                                                                        L58: {
                                                                                          var49 = var13[var27];
                                                                                          if (var49.field_g == null) {
                                                                                            break L58;
                                                                                          } else {
                                                                                            var19 = 0;
                                                                                            var29 = 2;
                                                                                            L59: while (true) {
                                                                                              if (var49.field_g.length <= var29) {
                                                                                                break L58;
                                                                                              } else {
                                                                                                var19 = var38.e(-31302) + (var19 - -1);
                                                                                                var49.field_g[var29] = (byte)var19;
                                                                                                var29 += 2;
                                                                                                continue L59;
                                                                                              }
                                                                                            }
                                                                                          }
                                                                                        }
                                                                                        var27++;
                                                                                        continue L29;
                                                                                      }
                                                                                    }
                                                                                  } else {
                                                                                    L60: {
                                                                                      var48 = var13[var27];
                                                                                      if (var48.field_h == null) {
                                                                                        break L60;
                                                                                      } else {
                                                                                        var19 = 0;
                                                                                        var29 = 2;
                                                                                        L61: while (true) {
                                                                                          if (var29 >= var48.field_h.length) {
                                                                                            break L60;
                                                                                          } else {
                                                                                            var19 = var38.e(-31302) + (var19 - -1);
                                                                                            var48.field_h[var29] = (byte)var19;
                                                                                            var29 += 2;
                                                                                            continue L61;
                                                                                          }
                                                                                        }
                                                                                      }
                                                                                    }
                                                                                    var27++;
                                                                                    continue L28;
                                                                                  }
                                                                                }
                                                                              } else {
                                                                                L62: {
                                                                                  var45 = var13[var27];
                                                                                  if (var45.field_g == null) {
                                                                                    break L62;
                                                                                  } else {
                                                                                    var29 = 1;
                                                                                    L63: while (true) {
                                                                                      if (var45.field_g.length <= var29) {
                                                                                        break L62;
                                                                                      } else {
                                                                                        var45.field_g[var29] = var38.d(true);
                                                                                        var29 += 2;
                                                                                        continue L63;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                L64: {
                                                                                  if (var45.field_h == null) {
                                                                                    break L64;
                                                                                  } else {
                                                                                    var29 = 3;
                                                                                    L65: while (true) {
                                                                                      if (var29 >= -2 + var45.field_h.length) {
                                                                                        break L64;
                                                                                      } else {
                                                                                        var45.field_h[var29] = var38.d(true);
                                                                                        var29 += 2;
                                                                                        continue L65;
                                                                                      }
                                                                                    }
                                                                                  }
                                                                                }
                                                                                var27++;
                                                                                continue L23;
                                                                              }
                                                                            }
                                                                          } else {
                                                                            L66: {
                                                                              if ((var20 ^ -1) != -1) {
                                                                                break L66;
                                                                              } else {
                                                                                L67: {
                                                                                  if (var54.length <= var21) {
                                                                                    var20 = -1;
                                                                                    break L67;
                                                                                  } else {
                                                                                    incrementValue$1 = var21;
                                                                                    var21++;
                                                                                    var20 = var18[incrementValue$1];
                                                                                    break L67;
                                                                                  }
                                                                                }
                                                                                if (-1 <= (this.field_p[var27] ^ -1)) {
                                                                                  break L66;
                                                                                } else {
                                                                                  var26 = var38.e(-31302) + 1;
                                                                                  break L66;
                                                                                }
                                                                              }
                                                                            }
                                                                            var20--;
                                                                            this.field_q[var27] = (byte)var26;
                                                                            var27++;
                                                                            continue L22;
                                                                          }
                                                                        }
                                                                      } else {
                                                                        L68: {
                                                                          if (this.field_p[var26] == 0) {
                                                                            break L68;
                                                                          } else {
                                                                            L69: {
                                                                              if (var20 != 0) {
                                                                                break L69;
                                                                              } else {
                                                                                var25 = var13[var53[var21]];
                                                                                if (var57.length <= var21) {
                                                                                  var20 = -1;
                                                                                  break L69;
                                                                                } else {
                                                                                  incrementValue$2 = var21;
                                                                                  var21++;
                                                                                  var20 = var10[incrementValue$2];
                                                                                  break L69;
                                                                                }
                                                                              }
                                                                            }
                                                                            this.field_n[var26] = (mq) (var25);
                                                                            var20--;
                                                                            break L68;
                                                                          }
                                                                        }
                                                                        var26++;
                                                                        continue L21;
                                                                      }
                                                                    }
                                                                  } else {
                                                                    L70: {
                                                                      if (this.field_p[var25_int] == 0) {
                                                                        break L70;
                                                                      } else {
                                                                        L71: {
                                                                          if (var20 != 0) {
                                                                            break L71;
                                                                          } else {
                                                                            incrementValue$3 = var8;
                                                                            var8++;
                                                                            var24 = 16 + var38.field_n[incrementValue$3] << -463370846;
                                                                            if (var56.length > var21) {
                                                                              incrementValue$4 = var21;
                                                                              var21++;
                                                                              var20 = var7[incrementValue$4];
                                                                              break L71;
                                                                            } else {
                                                                              var20 = -1;
                                                                              break L71;
                                                                            }
                                                                          }
                                                                        }
                                                                        var20--;
                                                                        this.field_t[var25_int] = (byte)var24;
                                                                        break L70;
                                                                      }
                                                                    }
                                                                    var25_int++;
                                                                    continue L20;
                                                                  }
                                                                }
                                                              } else {
                                                                L72: {
                                                                  if (0 == this.field_p[var24]) {
                                                                    break L72;
                                                                  } else {
                                                                    L73: {
                                                                      if (-1 != (var20 ^ -1)) {
                                                                        break L73;
                                                                      } else {
                                                                        L74: {
                                                                          if (var55.length <= var21) {
                                                                            var20 = -1;
                                                                            break L74;
                                                                          } else {
                                                                            incrementValue$5 = var21;
                                                                            var21++;
                                                                            var20 = var4[incrementValue$5];
                                                                            break L74;
                                                                          }
                                                                        }
                                                                        incrementValue$6 = var5;
                                                                        var5++;
                                                                        var23 = -1 + var38.field_n[incrementValue$6];
                                                                        break L73;
                                                                      }
                                                                    }
                                                                    this.field_r[var24] = (byte)var23;
                                                                    var20--;
                                                                    break L72;
                                                                  }
                                                                }
                                                                var24++;
                                                                continue L19;
                                                              }
                                                            }
                                                          } else {
                                                            L75: {
                                                              if (0 != var20) {
                                                                break L75;
                                                              } else {
                                                                L76: {
                                                                  if (var21 >= var54.length) {
                                                                    var20 = -1;
                                                                    break L76;
                                                                  } else {
                                                                    incrementValue$7 = var21;
                                                                    var21++;
                                                                    var20 = var18[incrementValue$7];
                                                                    break L76;
                                                                  }
                                                                }
                                                                var22 = var38.f((byte) 93);
                                                                break L75;
                                                              }
                                                            }
                                                            this.field_k[var23] = (short)(this.field_k[var23] + (eb.a(-1 + var22, 2) << -1005802546));
                                                            this.field_p[var23] = var22;
                                                            var20--;
                                                            var23++;
                                                            continue L18;
                                                          }
                                                        }
                                                      } else {
                                                        var19 = var19 + var38.e(-31302);
                                                        this.field_k[var20] = (short)(this.field_k[var20] + (var19 << 2092308360));
                                                        var20++;
                                                        continue L17;
                                                      }
                                                    }
                                                  } else {
                                                    var19 = var19 + var38.e(-31302);
                                                    this.field_k[var20] = (short)var19;
                                                    var20++;
                                                    continue L16;
                                                  }
                                                }
                                              } else {
                                                var18[var19] = var38.d(true);
                                                var19++;
                                                continue L15;
                                              }
                                            }
                                          } else {
                                            var17++;
                                            continue L14;
                                          }
                                        }
                                      } else {
                                        L77: {
                                          dupTemp$8 = new mq();
                                          var13[var14] = dupTemp$8;
                                          var40 = dupTemp$8;
                                          var15_ref = var40;
                                          var16_int = var38.e(-31302);
                                          if (-1 <= (var16_int ^ -1)) {
                                            break L77;
                                          } else {
                                            var15_ref.field_g = new byte[var16_int * 2];
                                            break L77;
                                          }
                                        }
                                        L78: {
                                          var16_int = var38.e(-31302);
                                          if (-1 <= (var16_int ^ -1)) {
                                            break L78;
                                          } else {
                                            var15_ref.field_h = new byte[2 + 2 * var16_int];
                                            var40.field_h[1] = (byte)64;
                                            break L78;
                                          }
                                        }
                                        var14++;
                                        continue L11;
                                      }
                                    }
                                  } else {
                                    var10[var11_int] = var38.d(true);
                                    var11_int++;
                                    continue L6;
                                  }
                                }
                              } else {
                                var9++;
                                continue L5;
                              }
                            }
                          } else {
                            var7[var8] = var38.d(true);
                            var8++;
                            continue L4;
                          }
                        }
                      } else {
                        var6++;
                        continue L3;
                      }
                    }
                  } else {
                    var4[var5] = var38.d(true);
                    var5++;
                    continue L2;
                  }
                }
              } else {
                var3++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L79: {
            var2 = decompiledCaughtException;
            stackIn_205_0 = (RuntimeException) (var2);

            stackIn_205_1 = new StringBuilder().append("td.<init>(");

            if (param0 == null) {
              stackIn_206_0 = (RuntimeException) ((Object) stackIn_205_0);
              stackIn_206_1 = (StringBuilder) ((Object) stackIn_205_1);
              stackIn_206_2 = "null";
              break L79;
            } else {
              stackIn_206_0 = (RuntimeException) ((Object) stackIn_205_0);
              stackIn_206_1 = (StringBuilder) ((Object) stackIn_205_1);
              stackIn_206_2 = "{...}";
              break L79;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_206_0), stackIn_206_2 + ')');
        }
    }

    static {
        field_l = "editor";
        field_m = true;
    }
}
