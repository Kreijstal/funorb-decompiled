/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ol extends ai {
    static String field_f;
    static vd[] field_e;
    static int field_c;
    private int[] field_d;

    final void a(int param0, float param1, int param2, float param3, int param4, int param5, float param6, float param7, int param8, float[] param9, int param10) {
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        float var15 = 0.0f;
        int var16 = 0;
        int var17 = 0;
        float var18 = 0.0f;
        float var19 = 0.0f;
        float var20 = 0.0f;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        float var24 = 0.0f;
        int var25 = 0;
        int var26 = 0;
        float var27 = 0.0f;
        float var28 = 0.0f;
        float var29 = 0.0f;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        float var35 = 0.0f;
        int var36 = 0;
        int var37 = 0;
        float var38 = 0.0f;
        float var39 = 0.0f;
        float var40 = 0.0f;
        int var41 = 0;
        float[] var42 = null;
        L0: {
          var41 = AceOfSkies.field_G ? 1 : 0;
          var12 = (int)((float)param2 * param6 - 1.0f);
          var12 = var12 & 255;
          var13 = (int)(param7 * (float)param10 - 1.0f);
          var13 = var13 & 255;
          var14 = (int)(param3 * (float)param4 - 1.0f);
          var14 = var14 & 255;
          var15 = (float)param0 * param3;
          var16 = (int)var15;
          var17 = 1 + var16;
          var18 = var15 - (float)var16;
          var19 = -var18 + 1.0f;
          var16 = var16 & var14;
          var17 = var17 & var14;
          var20 = ce.a(var18, -59);
          var21 = ((ol) this).field_d[var16];
          var22 = ((ol) this).field_d[var17];
          var23 = 0;
          if (param5 <= 0) {
            break L0;
          } else {
            var42 = (float[]) null;
            ((ol) this).a(68, -0.00900564156472683f, -53, -0.8669494390487671f, -60, 124, -0.45034173130989075f, -0.870319664478302f, 33, (float[]) null, -26);
            break L0;
          }
        }
        L1: while (true) {
          if (param10 <= var23) {
            return;
          } else {
            var24 = param7 * (float)var23;
            var25 = (int)var24;
            var26 = var25 - -1;
            var27 = var24 - (float)var25;
            var28 = -var27 + 1.0f;
            var26 = var26 & var13;
            var25 = var25 & var13;
            var29 = ce.a(var27, -87);
            var30 = ((ol) this).field_d[var21 + var25];
            var31 = ((ol) this).field_d[var21 + var26];
            var32 = ((ol) this).field_d[var22 + var25];
            var33 = ((ol) this).field_d[var22 + var26];
            var34 = 0;
            L2: while (true) {
              if (param2 <= var34) {
                var23++;
                continue L1;
              } else {
                var35 = param6 * (float)var34;
                var36 = (int)var35;
                var37 = var36 + 1;
                var38 = var35 - (float)var36;
                var39 = -var38 + 1.0f;
                var37 = var37 & var12;
                var40 = ce.a(var38, -81);
                var36 = var36 & var12;
                param8++;
                param9[param8] = hq.a(var20, 26921, hq.a(var29, 26921, hq.a(var40, 26921, ef.a(var38, var18, -87, var27, pg.a(7, ((ol) this).field_d[var37 - -var33])), ef.a(var39, var18, -98, var27, pg.a(7, ((ol) this).field_d[var36 + var33]))), hq.a(var40, 26921, ef.a(var38, var18, -116, var28, pg.a(7, ((ol) this).field_d[var32 + var37])), ef.a(var39, var18, -115, var28, pg.a(((ol) this).field_d[var32 + var36], 7)))), hq.a(var29, 26921, hq.a(var40, 26921, ef.a(var38, var19, -47, var27, pg.a(((ol) this).field_d[var31 + var37], 7)), ef.a(var39, var19, -111, var27, pg.a(7, ((ol) this).field_d[var31 + var36]))), hq.a(var40, 26921, ef.a(var38, var19, -85, var28, pg.a(((ol) this).field_d[var37 - -var30], 7)), ef.a(var39, var19, -35, var28, pg.a(((ol) this).field_d[var30 + var36], 7))))) * param1;
                var34++;
                continue L2;
              }
            }
          }
        }
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 < 88) {
            return;
        }
        field_f = null;
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        if (param1 <= -123) {
          L0: {
            var3 = ph.a(param0, 0);
            if (0 != (param2.indexOf(param0) ^ -1)) {
              break L0;
            } else {
              if (-1 != param2.indexOf(var3)) {
                break L0;
              } else {
                L1: {
                  L2: {
                    if (param2.startsWith(param0)) {
                      break L2;
                    } else {
                      if (param2.startsWith(var3)) {
                        break L2;
                      } else {
                        if (param2.endsWith(param0)) {
                          break L2;
                        } else {
                          if (!param2.endsWith(var3)) {
                            stackOut_12_0 = 0;
                            stackIn_13_0 = stackOut_12_0;
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                    }
                  }
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L1;
                }
                return stackIn_13_0 != 0;
              }
            }
          }
          return true;
        } else {
          return true;
        }
    }

    ol(int param0) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ((ol) this).field_d = new int[512];
        Random var2 = new Random((long)param0);
        for (var3 = 0; var3 < 256; var3++) {
            ((ol) this).field_d[var3 + 256] = var3;
            ((ol) this).field_d[var3] = var3;
        }
        int var6 = 0;
        var3 = var6;
        while (-257 < (var6 ^ -1)) {
            var4 = var2.nextInt() & 255;
            var5 = ((ol) this).field_d[var4];
            ((ol) this).field_d[var4 - -256] = ((ol) this).field_d[var6];
            ((ol) this).field_d[var4] = ((ol) this).field_d[var6];
            ((ol) this).field_d[256 + var6] = var5;
            ((ol) this).field_d[var6] = var5;
            var6++;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Type your email address again to make sure it's correct";
    }
}
