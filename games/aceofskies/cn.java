/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cn extends mi {
    int field_y;
    int field_w;
    static String[] field_z;
    int field_C;
    int field_x;
    int field_A;
    int field_B;

    final boolean a(int param0, int param1, int param2, int param3, int param4, ea param5, int param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = AceOfSkies.field_G ? 1 : 0;
        if (this.a((int) (char)param0, param1, param2, param3, param4, param5, param6)) {
          var8 = param2 - ((cn) this).field_C - (param1 - -((cn) this).field_p);
          var9 = param6 - (((cn) this).field_x + ((cn) this).field_h) - param4;
          if (((cn) this).field_A * ((cn) this).field_A > var8 * var8 + var9 * var9) {
            var10 = Math.atan2((double)var9, (double)var8) - gj.field_c;
            if (0.0 <= var10) {
              if (var10 > 0.0) {
                var10 = var10 + 3.141592653589793 / (double)((cn) this).field_w;
                ((cn) this).field_y = (int)(var10 * (double)((cn) this).field_w / 6.283185307179586);
                L0: while (true) {
                  if (((cn) this).field_y >= ((cn) this).field_w) {
                    ((cn) this).field_y = ((cn) this).field_y - ((cn) this).field_w;
                    continue L0;
                  } else {
                    L1: while (true) {
                      if (0 <= ((cn) this).field_y) {
                        return true;
                      } else {
                        ((cn) this).field_y = ((cn) this).field_y + ((cn) this).field_w;
                        continue L1;
                      }
                    }
                  }
                }
              } else {
                ((cn) this).field_y = (int)(var10 * (double)((cn) this).field_w / 6.283185307179586);
                L2: while (true) {
                  if (((cn) this).field_y >= ((cn) this).field_w) {
                    ((cn) this).field_y = ((cn) this).field_y - ((cn) this).field_w;
                    continue L2;
                  } else {
                    L3: while (true) {
                      if (0 <= ((cn) this).field_y) {
                        return true;
                      } else {
                        ((cn) this).field_y = ((cn) this).field_y + ((cn) this).field_w;
                        continue L3;
                      }
                    }
                  }
                }
              }
            } else {
              var10 = var10 - 3.141592653589793 / (double)((cn) this).field_w;
              ((cn) this).field_y = (int)(var10 * (double)((cn) this).field_w / 6.283185307179586);
              L4: while (true) {
                if (((cn) this).field_y >= ((cn) this).field_w) {
                  ((cn) this).field_y = ((cn) this).field_y - ((cn) this).field_w;
                  continue L4;
                } else {
                  L5: while (true) {
                    if (0 <= ((cn) this).field_y) {
                      return true;
                    } else {
                      ((cn) this).field_y = ((cn) this).field_y + ((cn) this).field_w;
                      continue L5;
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

    public static void a(int param0) {
        field_z = null;
        if (param0 < -27) {
            return;
        }
        rk var2 = (rk) null;
        boolean discarded$0 = cn.a((rk) null, (byte) 13);
    }

    final static byte[] a(File param0, int param1, boolean param2) {
        try {
            byte[] var3 = null;
            IOException var3_ref = null;
            rk var4 = null;
            byte[] var5 = null;
            byte[] stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            byte[] stackOut_2_0 = null;
            try {
              L0: {
                if (!param2) {
                  break L0;
                } else {
                  var4 = (rk) null;
                  boolean discarded$2 = cn.a((rk) null, (byte) -127);
                  break L0;
                }
              }
              var5 = new byte[param1];
              var3 = var5;
              nm.a((byte) -106, param1, param0, var5);
              stackOut_2_0 = (byte[]) var5;
              stackIn_3_0 = stackOut_2_0;
            } catch (java.io.IOException decompiledCaughtParameter) {
              decompiledCaughtException = decompiledCaughtParameter;
              return (byte[]) (Object) stackIn_3_0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
        return null;
    }

    final static boolean b(boolean param0) {
        if (!param0) {
            cn.a(95);
            return ks.field_b;
        }
        return ks.field_b;
    }

    private cn() throws Throwable {
        throw new Error();
    }

    final static boolean a(rk param0, byte param1) {
        if (param1 != 75) {
            return true;
        }
        return param0.a((byte) 84);
    }

    static {
    }
}
