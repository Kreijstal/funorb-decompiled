/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class km extends hf {
    int field_I;
    int field_D;
    int field_J;
    int field_A;
    int field_F;
    int field_G;

    final boolean b(int param0, int param1, int param2, int param3, int param4, wj param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = BachelorFridge.field_y;
        if (this.b(param0, param1, param2, param3, param4, param5, param6)) {
          var8 = -((km) this).field_s - (param2 + (((km) this).field_A - param0));
          var9 = param6 - ((km) this).field_D - ((km) this).field_v - param4;
          if (var9 * var9 + var8 * var8 < ((km) this).field_G * ((km) this).field_G) {
            var10 = Math.atan2((double)var9, (double)var8) - nd.field_j;
            if (0.0 > var10) {
              var10 = var10 - 3.141592653589793 / (double)((km) this).field_F;
              ((km) this).field_I = (int)((double)((km) this).field_F * var10 / 6.283185307179586);
              L0: while (true) {
                if (((km) this).field_F <= ((km) this).field_I) {
                  ((km) this).field_I = ((km) this).field_I - ((km) this).field_F;
                  continue L0;
                } else {
                  L1: while (true) {
                    if (-1 >= (((km) this).field_I ^ -1)) {
                      return true;
                    } else {
                      ((km) this).field_I = ((km) this).field_I + ((km) this).field_F;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              if (var10 > 0.0) {
                var10 = var10 + 3.141592653589793 / (double)((km) this).field_F;
                ((km) this).field_I = (int)((double)((km) this).field_F * var10 / 6.283185307179586);
                L2: while (true) {
                  if (((km) this).field_F <= ((km) this).field_I) {
                    ((km) this).field_I = ((km) this).field_I - ((km) this).field_F;
                    continue L2;
                  } else {
                    L3: while (true) {
                      if (-1 >= (((km) this).field_I ^ -1)) {
                        return true;
                      } else {
                        ((km) this).field_I = ((km) this).field_I + ((km) this).field_F;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                ((km) this).field_I = (int)((double)((km) this).field_F * var10 / 6.283185307179586);
                L4: while (true) {
                  if (((km) this).field_F <= ((km) this).field_I) {
                    ((km) this).field_I = ((km) this).field_I - ((km) this).field_F;
                    continue L4;
                  } else {
                    L5: while (true) {
                      if (-1 >= (((km) this).field_I ^ -1)) {
                        return true;
                      } else {
                        ((km) this).field_I = ((km) this).field_I + ((km) this).field_F;
                        continue L5;
                      }
                    }
                  }
                }
              }
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final static String a(long param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          if (param1 == -1) {
            break L0;
          } else {
            String discarded$1 = km.a(-37L, 30);
            break L0;
          }
        }
        gd.field_o.setTime(new Date(param0));
        var3 = gd.field_o.get(7);
        var4 = gd.field_o.get(5);
        var5 = gd.field_o.get(2);
        var6 = gd.field_o.get(1);
        var7 = gd.field_o.get(11);
        var8 = gd.field_o.get(12);
        var9 = gd.field_o.get(13);
        return gp.field_B[var3 + -1] + ", " + var4 / 10 + var4 % 10 + "-" + sh.field_E[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
    }

    private km() throws Throwable {
        throw new Error();
    }

    static {
    }
}
