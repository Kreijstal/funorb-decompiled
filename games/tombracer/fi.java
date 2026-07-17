/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

abstract class fi {
    private short[] field_e;
    private int field_d;
    private int field_f;
    private short[] field_g;
    private int field_b;
    static int field_c;
    int field_a;
    private int field_h;

    abstract void a(int param0, byte param1, int param2);

    private final void a(int param0) {
        int var2 = 0;
        int var3 = TombRacer.field_G ? 1 : 0;
        ((fi) this).field_g = new short[((fi) this).field_a];
        if (param0 != -15063) {
            this.a(-68);
        }
        for (var2 = 0; var2 < ((fi) this).field_a; var2++) {
            ((fi) this).field_g[var2] = (short)(int)Math.pow(2.0, (double)var2);
        }
    }

    abstract void c(int param0);

    abstract void a(byte param0);

    private final void b() {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = TombRacer.field_G ? 1 : 0;
        Random var2 = new Random((long)((fi) this).field_h);
        for (var3 = 0; var3 < 255; var3++) {
            ((fi) this).field_e[var3] = (short)var3;
        }
        for (var3 = 0; var3 < 255; var3++) {
            var4 = -var3 + 255;
            var5 = jqa.a(var4, var2, -120);
            var6 = ((fi) this).field_e[var5];
            ((fi) this).field_e[var5] = ((fi) this).field_e[var4];
            ((fi) this).field_e[256 + var4] = (short) var6;
            ((fi) this).field_e[var4] = (short) var6;
        }
    }

    final void a(int param0, int param1, int param2, byte param3) {
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
          var43 = TombRacer.field_G ? 1 : 0;
          var54 = new int[param2];
          var51 = var54;
          var48 = var51;
          var45 = var48;
          var39 = var45;
          var53 = new int[param0];
          var50 = var53;
          var47 = var50;
          var44 = var47;
          var40 = var44;
          var55 = new int[param1];
          var52 = var55;
          var49 = var52;
          var46 = var49;
          var41 = var46;
          if (param3 <= -87) {
            break L0;
          } else {
            ((fi) this).field_f = 92;
            break L0;
          }
        }
        var42 = 0;
        L1: while (true) {
          if (var42 >= param2) {
            var42 = 0;
            L2: while (true) {
              if (var42 >= param0) {
                var42 = 0;
                L3: while (true) {
                  if (param1 <= var42) {
                    ((fi) this).a((byte) 50);
                    var37 = 0;
                    L4: while (true) {
                      if (var37 >= param1) {
                        return;
                      } else {
                        var36 = 0;
                        L5: while (true) {
                          if (var36 >= param0) {
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
                                  if (var38 >= ((fi) this).field_a) {
                                    ((fi) this).c(32164);
                                    var35++;
                                    continue L6;
                                  } else {
                                    L8: {
                                      var42 = ((fi) this).field_g[var38] << 12;
                                      var9 = var42 * ((fi) this).field_d >> 12;
                                      var6 = var42 * var53[var36] >> 12;
                                      var5 = var54[var35] * var42 >> 12;
                                      var7 = var55[var37] * var42 >> 12;
                                      var8 = ((fi) this).field_f * var42 >> 12;
                                      var10 = var42 * ((fi) this).field_b >> 12;
                                      var6 = var6 * ((fi) this).field_d;
                                      var5 = var5 * ((fi) this).field_f;
                                      var7 = var7 * ((fi) this).field_b;
                                      var11 = var5 >> 12;
                                      var12 = var11 - -1;
                                      var13 = var6 >> 12;
                                      var11 = var11 & 255;
                                      var14 = var13 - -1;
                                      var15 = var7 >> 12;
                                      var13 = var13 & 255;
                                      var16 = 1 + var15;
                                      var6 = var6 & 4095;
                                      if (var14 >= var9) {
                                        var14 = 0;
                                        break L8;
                                      } else {
                                        var14 = var14 & 255;
                                        break L8;
                                      }
                                    }
                                    L9: {
                                      var15 = var15 & 255;
                                      if (var12 >= var8) {
                                        var12 = 0;
                                        break L9;
                                      } else {
                                        var12 = var12 & 255;
                                        break L9;
                                      }
                                    }
                                    L10: {
                                      var5 = var5 & 4095;
                                      var7 = var7 & 4095;
                                      if (var10 <= var16) {
                                        var16 = 0;
                                        break L10;
                                      } else {
                                        var16 = var16 & 255;
                                        break L10;
                                      }
                                    }
                                    var19 = pba.field_b[var7];
                                    var24 = ((fi) this).field_e[var16];
                                    var17 = pba.field_b[var5];
                                    var20 = -4096 + var5;
                                    var22 = -4096 + var7;
                                    var21 = var6 - 4096;
                                    var18 = pba.field_b[var6];
                                    var23 = ((fi) this).field_e[var15];
                                    var25 = ((fi) this).field_e[var13 - -var23];
                                    var28 = ((fi) this).field_e[var14 + var24];
                                    var26 = ((fi) this).field_e[var23 + var14];
                                    var27 = ((fi) this).field_e[var24 + var13];
                                    var29 = wsa.a(var6, var5, 0, (int) ((fi) this).field_e[var25 + var11], var7);
                                    var30 = wsa.a(var6, var20, 0, (int) ((fi) this).field_e[var25 + var12], var7);
                                    var31 = var29 + (var17 * (-var29 + var30) >> 12);
                                    var29 = wsa.a(var21, var5, 0, (int) ((fi) this).field_e[var11 + var26], var7);
                                    var30 = wsa.a(var21, var20, 0, (int) ((fi) this).field_e[var26 + var12], var7);
                                    var32 = (var17 * (-var29 + var30) >> 12) + var29;
                                    var29 = wsa.a(var6, var5, 0, (int) ((fi) this).field_e[var27 + var11], var22);
                                    var33 = ((-var31 + var32) * var18 >> 12) + var31;
                                    var30 = wsa.a(var6, var20, 0, (int) ((fi) this).field_e[var12 - -var27], var22);
                                    var31 = ((-var29 + var30) * var17 >> 12) + var29;
                                    var29 = wsa.a(var21, var5, 0, (int) ((fi) this).field_e[var28 + var11], var22);
                                    var30 = wsa.a(var21, var20, 0, (int) ((fi) this).field_e[var28 + var12], var22);
                                    var32 = var29 + ((-var29 + var30) * var17 >> 12);
                                    var34 = ((-var31 + var32) * var18 >> 12) + var31;
                                    ((fi) this).a(((var34 + -var33) * var19 >> 12) + var33, (byte) -96, var38);
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
                    var41[var42] = (var42 << 12) / param1;
                    var42++;
                    continue L3;
                  }
                }
              } else {
                var40[var42] = (var42 << 12) / param0;
                var42++;
                continue L2;
              }
            }
          } else {
            var39[var42] = (var42 << 12) / param2;
            var42++;
            continue L1;
          }
        }
    }

    fi(int param0, int param1, int param2, int param3, int param4) {
        ((fi) this).field_d = 4;
        ((fi) this).field_f = 4;
        ((fi) this).field_a = 4;
        ((fi) this).field_e = new short[512];
        ((fi) this).field_h = 0;
        ((fi) this).field_b = 4;
        ((fi) this).field_b = param4;
        ((fi) this).field_h = param0;
        ((fi) this).field_a = param1;
        ((fi) this).field_f = param2;
        ((fi) this).field_d = param3;
        this.a(-15063);
        int discarded$0 = -256;
        this.b();
    }

    static {
    }
}
