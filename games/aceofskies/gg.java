/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class gg {
    int field_f;
    static String field_i;
    private int field_b;
    private int field_c;
    static al field_a;
    private int field_g;
    private short[] field_h;
    private short[] field_d;
    private int field_e;

    abstract void a(int param0, int param1, byte param2);

    private final void a(byte param0) {
        int var5 = 0;
        int var6 = 0;
        int var4 = 0;
        Random var7 = new Random((long)this.field_c);
        Random var2 = var7;
        int var3 = -35 / ((param0 - -73) / 50);
        for (var4 = 0; (var4 ^ -1) > -256; var4++) {
            this.field_d[var4] = (short)var4;
        }
        for (var3 = 0; 255 > var3; var3++) {
            var4 = 255 + -var3;
            var5 = bs.a(-1, var7, var4);
            var6 = this.field_d[var5];
            this.field_d[var5] = this.field_d[var4];
            this.field_d[256 + var4] = (short) var6;
            this.field_d[var4] = (short) var6;
        }
    }

    final static byte[] a(int param0, int param1, float param2, ai param3, int param4, int param5, float param6, float param7, float param8, int param9, float param10) {
        byte[] var11 = null;
        RuntimeException var11_ref = null;
        byte[] var12 = null;
        byte[] stackIn_2_0 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_3_0 = null;
        byte[] stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var12 = new byte[param4 * param5 * param9];
            var11 = var12;
            if (param1 <= -63) {
              fr.a(param7, param6, 0, param8, param2, param9, var12, param4, param5, param10, param0, 0, param3);
              stackOut_3_0 = (byte[]) (var12);
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = (byte[]) null;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var11_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var11_ref);
            stackOut_5_1 = new StringBuilder().append("gg.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    abstract void c(int param0);

    final static rh a(al param0, int param1, int param2) {
        RuntimeException var3 = null;
        rh stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        rh stackOut_2_0 = null;
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
              if (param2 == -27227) {
                break L1;
              } else {
                field_a = (al) null;
                break L1;
              }
            }
            stackOut_2_0 = jo.a(param0, param1, (byte) -33);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var3);
            stackOut_4_1 = new StringBuilder().append("gg.H(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw pn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final static void b(byte param0) {
        byte[] discarded$0 = null;
        nf.field_a = false;
        if (param0 != -98) {
            ai var2 = (ai) null;
            discarded$0 = gg.a(121, 109, 0.5157560110092163f, (ai) null, 51, 109, -0.17956805229187012f, 1.0828834772109985f, -1.4294534921646118f, 111, 0.21281719207763672f);
        }
        ss.field_t = false;
        oi.a(-1, 20665);
        nb.field_c = dk.field_h;
        ht.field_k = dk.field_h;
    }

    public static void a(boolean param0) {
        byte[] discarded$0 = null;
        if (!param0) {
            ai var2 = (ai) null;
            discarded$0 = gg.a(-90, 43, 0.35438913106918335f, (ai) null, 65, -70, 1.1266902685165405f, -1.0076642036437988f, -1.1031489372253418f, -37, 0.5276761054992676f);
        }
        field_a = null;
        field_i = null;
    }

    final void a(boolean param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
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
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
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
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int[] var39 = null;
        int[] var40 = null;
        int[] var41 = null;
        int var42 = 0;
        int[] var43 = null;
        int[] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        L0: {
          if (param0) {
            break L0;
          } else {
            gg.a(false);
            break L0;
          }
        }
        var47 = new int[param2];
        var44 = var47;
        var39 = var44;
        var48 = new int[param3];
        var45 = var48;
        var40 = var45;
        var42 = 0;
        L1: while (true) {
          if (param2 <= var42) {
            var46 = new int[param1];
            var43 = var46;
            var41 = var43;
            var42 = 0;
            L2: while (true) {
              if (param3 <= var42) {
                var42 = 0;
                L3: while (true) {
                  if (param1 <= var42) {
                    this.c(-30042);
                    var37 = 0;
                    L4: while (true) {
                      if (var37 >= param1) {
                        return;
                      } else {
                        var36 = 0;
                        L5: while (true) {
                          if (param3 <= var36) {
                            var37++;
                            continue L4;
                          } else {
                            var35 = 0;
                            L6: while (true) {
                              if (param2 <= var35) {
                                var36++;
                                continue L5;
                              } else {
                                var38 = 0;
                                L7: while (true) {
                                  if (this.field_f <= var38) {
                                    this.a(0);
                                    var35++;
                                    continue L6;
                                  } else {
                                    L8: {
                                      var42 = this.field_h[var38] << 533233740;
                                      var9 = this.field_e * var42 >> -1425613812;
                                      var7 = var42 * var46[var37] >> 154286220;
                                      var10 = this.field_g * var42 >> 939605004;
                                      var5 = var42 * var47[var35] >> 399166156;
                                      var6 = var42 * var48[var36] >> 1816855564;
                                      var8 = var42 * this.field_b >> -1652920180;
                                      var6 = var6 * this.field_e;
                                      var7 = var7 * this.field_g;
                                      var5 = var5 * this.field_b;
                                      var11 = var5 >> -654915028;
                                      var12 = var11 - -1;
                                      var11 = var11 & 255;
                                      var13 = var6 >> 1572466956;
                                      var14 = 1 + var13;
                                      var13 = var13 & 255;
                                      var15 = var7 >> 1514339596;
                                      var16 = var15 + 1;
                                      if (var16 >= var10) {
                                        var16 = 0;
                                        break L8;
                                      } else {
                                        var16 = var16 & 255;
                                        break L8;
                                      }
                                    }
                                    L9: {
                                      if (var8 <= var12) {
                                        var12 = 0;
                                        break L9;
                                      } else {
                                        var12 = var12 & 255;
                                        break L9;
                                      }
                                    }
                                    L10: {
                                      var6 = var6 & 4095;
                                      var15 = var15 & 255;
                                      if (var14 >= var9) {
                                        var14 = 0;
                                        break L10;
                                      } else {
                                        var14 = var14 & 255;
                                        break L10;
                                      }
                                    }
                                    var5 = var5 & 4095;
                                    var7 = var7 & 4095;
                                    var22 = var7 - 4096;
                                    var21 = -4096 + var6;
                                    var17 = ua.field_h[var5];
                                    var20 = -4096 + var5;
                                    var23 = this.field_d[var15];
                                    var24 = this.field_d[var16];
                                    var18 = ua.field_h[var6];
                                    var19 = ua.field_h[var7];
                                    var26 = this.field_d[var23 + var14];
                                    var27 = this.field_d[var24 + var13];
                                    var28 = this.field_d[var14 - -var24];
                                    var25 = this.field_d[var23 + var13];
                                    var29 = mq.a((byte) -128, var5, var7, (int) this.field_d[var25 + var11], var6);
                                    var30 = mq.a((byte) -125, var20, var7, (int) this.field_d[var12 - -var25], var6);
                                    var31 = var29 - -(var17 * (-var29 + var30) >> 1788394348);
                                    var29 = mq.a((byte) -84, var5, var7, (int) this.field_d[var26 + var11], var21);
                                    var30 = mq.a((byte) -109, var20, var7, (int) this.field_d[var26 + var12], var21);
                                    var32 = ((-var29 + var30) * var17 >> -1631052468) + var29;
                                    var33 = var31 + (var18 * (var32 + -var31) >> -1710995508);
                                    var29 = mq.a((byte) 78, var5, var22, (int) this.field_d[var27 + var11], var6);
                                    var30 = mq.a((byte) -62, var20, var22, (int) this.field_d[var12 + var27], var6);
                                    var31 = var29 - -((var30 - var29) * var17 >> -566593140);
                                    var29 = mq.a((byte) 110, var5, var22, (int) this.field_d[var11 - -var28], var21);
                                    var30 = mq.a((byte) 108, var20, var22, (int) this.field_d[var12 - -var28], var21);
                                    var32 = ((var30 + -var29) * var17 >> 1614552428) + var29;
                                    var34 = var31 - -(var18 * (var32 - var31) >> -1619336596);
                                    this.a(var38, var33 - -(var19 * (-var33 + var34) >> 1277909004), (byte) 119);
                                    var38++;
                                    continue L7;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var41[var42] = (var42 << -1260232500) / param1;
                    var42++;
                    continue L3;
                  }
                }
              } else {
                var40[var42] = (var42 << -687629812) / param3;
                var42++;
                continue L2;
              }
            }
          } else {
            var39[var42] = (var42 << 190855084) / param2;
            var42++;
            continue L1;
          }
        }
    }

    private final void b(int param0) {
        int var2 = 0;
        this.field_h = new short[this.field_f];
        int var3 = 61 / ((param0 - -67) / 53);
        for (var2 = 0; this.field_f > var2; var2++) {
            this.field_h[var2] = (short)(int)Math.pow(2.0, (double)var2);
        }
    }

    abstract void a(int param0);

    gg(int param0, int param1, int param2, int param3, int param4) {
        this.field_f = 4;
        this.field_g = 4;
        this.field_c = 0;
        this.field_d = new short[512];
        this.field_e = 4;
        this.field_b = 4;
        this.field_c = param0;
        this.field_b = param2;
        this.field_f = param1;
        this.field_e = param3;
        this.field_g = param4;
        this.b(48);
        this.a((byte) 96);
    }

    static {
        field_i = "You are not currently logged in to the<nbsp>game.";
    }
}
