/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

abstract class en {
    private int field_b;
    int field_g;
    static String field_h;
    private short[] field_c;
    private int field_e;
    private int field_i;
    private short[] field_f;
    static String field_d;
    static dk field_j;
    private int field_a;

    abstract void a(boolean param0);

    final void a(int param0, int param1, int param2, int param3) {
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
        int var43 = 0;
        int[] var44 = null;
        int[] var45 = null;
        int[] var46 = null;
        int[] var47 = null;
        int[] var48 = null;
        int[] var49 = null;
        int[] var50 = null;
        int[] var51 = null;
        int[] var52 = null;
        int[] var53 = null;
        int[] var54 = null;
        int[] var55 = null;
        L0: {
          var43 = Sumoblitz.field_L ? 1 : 0;
          if (param1 == 206) {
            break L0;
          } else {
            ((en) this).field_f = null;
            break L0;
          }
        }
        var54 = new int[param3];
        var51 = var54;
        var48 = var51;
        var45 = var48;
        var39 = var45;
        var53 = new int[param2];
        var50 = var53;
        var47 = var50;
        var44 = var47;
        var40 = var44;
        var55 = new int[param0];
        var52 = var55;
        var49 = var52;
        var46 = var49;
        var41 = var46;
        var42 = 0;
        L1: while (true) {
          if (param3 <= var42) {
            var42 = 0;
            L2: while (true) {
              if (param2 <= var42) {
                var42 = 0;
                L3: while (true) {
                  if (param0 <= var42) {
                    ((en) this).b(-21);
                    var37 = 0;
                    L4: while (true) {
                      if (var37 >= param0) {
                        return;
                      } else {
                        var36 = 0;
                        L5: while (true) {
                          if (param2 <= var36) {
                            var37++;
                            continue L4;
                          } else {
                            var35 = 0;
                            L6: while (true) {
                              if (param3 <= var35) {
                                var36++;
                                continue L5;
                              } else {
                                var38 = 0;
                                L7: while (true) {
                                  if (((en) this).field_g <= var38) {
                                    ((en) this).a(false);
                                    var35++;
                                    continue L6;
                                  } else {
                                    L8: {
                                      var42 = ((en) this).field_c[var38] << 12;
                                      var6 = var53[var36] * var42 >> 12;
                                      var8 = ((en) this).field_a * var42 >> 12;
                                      var5 = var54[var35] * var42 >> 12;
                                      var7 = var42 * var55[var37] >> 12;
                                      var10 = ((en) this).field_i * var42 >> 12;
                                      var9 = ((en) this).field_b * var42 >> 12;
                                      var7 = var7 * ((en) this).field_i;
                                      var6 = var6 * ((en) this).field_b;
                                      var5 = var5 * ((en) this).field_a;
                                      var11 = var5 >> 12;
                                      var12 = 1 + var11;
                                      var13 = var6 >> 12;
                                      var11 = var11 & 255;
                                      var14 = 1 + var13;
                                      var13 = var13 & 255;
                                      var15 = var7 >> 12;
                                      var16 = var15 - -1;
                                      if (var16 >= var10) {
                                        var16 = 0;
                                        break L8;
                                      } else {
                                        var16 = var16 & 255;
                                        break L8;
                                      }
                                    }
                                    L9: {
                                      if (var12 < var8) {
                                        var12 = var12 & 255;
                                        break L9;
                                      } else {
                                        var12 = 0;
                                        break L9;
                                      }
                                    }
                                    L10: {
                                      if (var14 >= var9) {
                                        var14 = 0;
                                        break L10;
                                      } else {
                                        var14 = var14 & 255;
                                        break L10;
                                      }
                                    }
                                    var6 = var6 & 4095;
                                    var15 = var15 & 255;
                                    var7 = var7 & 4095;
                                    var5 = var5 & 4095;
                                    var21 = var6 + -4096;
                                    var22 = var7 - 4096;
                                    var17 = mu.field_y[var5];
                                    var18 = mu.field_y[var6];
                                    var20 = var5 - 4096;
                                    var23 = ((en) this).field_f[var15];
                                    var19 = mu.field_y[var7];
                                    var24 = ((en) this).field_f[var16];
                                    var27 = ((en) this).field_f[var13 - -var24];
                                    var25 = ((en) this).field_f[var23 + var13];
                                    var28 = ((en) this).field_f[var24 + var14];
                                    var26 = ((en) this).field_f[var14 + var23];
                                    var29 = qf.a(var6, var7, 8, (int) ((en) this).field_f[var11 - -var25], var5);
                                    var30 = qf.a(var6, var7, 8, (int) ((en) this).field_f[var12 + var25], var20);
                                    var31 = var29 - -((-var29 + var30) * var17 >> 12);
                                    var29 = qf.a(var21, var7, param1 + -198, (int) ((en) this).field_f[var11 + var26], var5);
                                    var30 = qf.a(var21, var7, param1 ^ 198, (int) ((en) this).field_f[var26 + var12], var20);
                                    var32 = var29 + (var17 * (var30 + -var29) >> 12);
                                    var33 = var31 - -(var18 * (var32 - var31) >> 12);
                                    var29 = qf.a(var6, var22, param1 ^ 198, (int) ((en) this).field_f[var11 + var27], var5);
                                    var30 = qf.a(var6, var22, 8, (int) ((en) this).field_f[var27 + var12], var20);
                                    var31 = ((-var29 + var30) * var17 >> 12) + var29;
                                    var29 = qf.a(var21, var22, 8, (int) ((en) this).field_f[var28 + var11], var5);
                                    var30 = qf.a(var21, var22, param1 ^ 198, (int) ((en) this).field_f[var28 + var12], var20);
                                    var32 = ((-var29 + var30) * var17 >> 12) + var29;
                                    var34 = ((var32 - var31) * var18 >> 12) + var31;
                                    ((en) this).a(var38, param1 + 951, (var19 * (var34 + -var33) >> 12) + var33);
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
                    var41[var42] = (var42 << 12) / param0;
                    var42++;
                    continue L3;
                  }
                }
              } else {
                var40[var42] = (var42 << 12) / param2;
                var42++;
                continue L2;
              }
            }
          } else {
            var39[var42] = (var42 << 12) / param3;
            var42++;
            continue L1;
          }
        }
    }

    private final void c(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = Sumoblitz.field_L ? 1 : 0;
        Random var2 = new Random((long)((en) this).field_e);
        for (var3 = 0; var3 < 255; var3++) {
            ((en) this).field_f[var3] = (short)var3;
        }
        for (var3 = 0; var3 < 255; var3++) {
            var4 = 255 + -var3;
            var5 = fi.a(var4, var2, (byte) -96);
            var6 = ((en) this).field_f[var5];
            ((en) this).field_f[var5] = ((en) this).field_f[var4];
            ((en) this).field_f[var4 - -256] = (short) var6;
            ((en) this).field_f[var4] = (short) var6;
        }
    }

    final static void a(byte param0, int param1) {
        c.field_s = 3 & param1 >> 4;
        if (!(c.field_s <= 2)) {
            c.field_s = 2;
        }
        ew.field_f = (param1 & 15) >> 2;
        if (!(ew.field_f <= 2)) {
            ew.field_f = 2;
        }
        rs.field_g = param1 & 3;
        if (rs.field_g > 2) {
            rs.field_g = 2;
        }
    }

    abstract void b(int param0);

    final static boolean a(int param0) {
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          L1: {
            if (10 > jv.field_a) {
              break L1;
            } else {
              if (ms.field_a) {
                break L1;
              } else {
                if (nt.a((byte) 116)) {
                  break L1;
                } else {
                  stackOut_3_0 = 1;
                  stackIn_5_0 = stackOut_3_0;
                  break L0;
                }
              }
            }
          }
          stackOut_4_0 = 0;
          stackIn_5_0 = stackOut_4_0;
          break L0;
        }
        return stackIn_5_0 != 0;
    }

    public static void b(byte param0) {
        field_d = null;
        field_j = null;
        field_h = null;
    }

    private final void a(byte param0) {
        int var2 = 0;
        int var3 = Sumoblitz.field_L ? 1 : 0;
        ((en) this).field_c = new short[((en) this).field_g];
        for (var2 = 0; ((en) this).field_g > var2; var2++) {
            ((en) this).field_c[var2] = (short)(int)Math.pow(2.0, (double)var2);
        }
    }

    abstract void a(int param0, int param1, int param2);

    en(int param0, int param1, int param2, int param3, int param4) {
        ((en) this).field_b = 4;
        ((en) this).field_e = 0;
        ((en) this).field_i = 4;
        ((en) this).field_f = new short[512];
        ((en) this).field_g = 4;
        ((en) this).field_a = 4;
        ((en) this).field_a = param2;
        ((en) this).field_b = param3;
        ((en) this).field_g = param1;
        ((en) this).field_i = param4;
        ((en) this).field_e = param0;
        this.a((byte) 99);
        this.c(0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        String var0 = "Unknown";
        try {
            var0 = System.getProperty("java.vendor").toLowerCase();
        } catch (Exception exception) {
        }
        String discarded$0 = var0.toLowerCase();
        var0 = "Unknown";
        try {
            var0 = System.getProperty("java.version").toLowerCase();
        } catch (Exception exception) {
        }
        String discarded$1 = var0.toLowerCase();
        var0 = "Unknown";
        try {
            var0 = System.getProperty("os.name").toLowerCase();
        } catch (Exception exception) {
        }
        field_h = var0.toLowerCase();
        var0 = "Unknown";
        try {
            var0 = System.getProperty("os.arch").toLowerCase();
        } catch (Exception exception) {
        }
        field_d = var0.toLowerCase();
        var0 = "Unknown";
        try {
            var0 = System.getProperty("os.version").toLowerCase();
        } catch (Exception exception) {
        }
        String discarded$2 = var0.toLowerCase();
        var0 = "~/";
        try {
            var0 = System.getProperty("user.home").toLowerCase();
        } catch (Exception exception) {
        }
        File discarded$3 = new File(var0);
        field_j = new dk();
    }
}
