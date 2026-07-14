/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class va extends lg {
    int field_D;
    int field_E;
    static bp field_H;
    int field_G;
    int field_C;
    int field_I;
    int field_F;

    final static boolean b(String param0, int param1) {
        if (param0 != null) {
          if (param0.length() >= fa.field_d) {
            if (param0.length() <= jp.field_i) {
              if (param1 != 25326) {
                field_H = null;
                return false;
              } else {
                return false;
              }
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    final static void a(h param0, byte param1, int param2) {
        df var3 = null;
        Object var4 = null;
        var3 = wa.field_d;
        var3.f(-58, param2);
        var3.b(90, 2);
        if (param1 <= 117) {
          var4 = null;
          int discarded$2 = va.a(82, (byte) 63, (Random) null);
          var3.b(90, 0);
          var3.b(90, param0.field_m);
          return;
        } else {
          var3.b(90, 0);
          var3.b(90, param0.field_m);
          return;
        }
    }

    public static void a(boolean param0) {
        field_H = null;
        if (param0) {
            return;
        }
        field_H = null;
    }

    final static boolean a(int param0, CharSequence param1) {
        if (param0 != -21369) {
            field_H = null;
            return jn.a(param1, (byte) 100, false);
        }
        return jn.a(param1, (byte) 100, false);
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, gm param5, byte param6) {
        int var8 = 0;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        Object var13 = null;
        var12 = Torquing.field_u;
        if (!super.a(param0, param1, param2, param3, param4, param5, (byte) 73)) {
          if (param6 <= 5) {
            var13 = null;
            boolean discarded$1 = va.a(56, (CharSequence) null);
            return false;
          } else {
            return false;
          }
        } else {
          var8 = param4 - ((va) this).field_G - (param1 - -((va) this).field_w);
          var9 = -((va) this).field_k + (-param2 - ((va) this).field_F + param3);
          if (((va) this).field_C * ((va) this).field_C > var9 * var9 + var8 * var8) {
            var10 = Math.atan2((double)var9, (double)var8) - wa.field_e;
            if (0.0 > var10) {
              var10 = var10 - 3.141592653589793 / (double)((va) this).field_E;
              ((va) this).field_D = (int)(var10 * (double)((va) this).field_E / 6.283185307179586);
              L0: while (true) {
                if (((va) this).field_E <= ((va) this).field_D) {
                  ((va) this).field_D = ((va) this).field_D - ((va) this).field_E;
                  continue L0;
                } else {
                  L1: while (true) {
                    if (((va) this).field_D >= 0) {
                      return true;
                    } else {
                      ((va) this).field_D = ((va) this).field_D + ((va) this).field_E;
                      continue L1;
                    }
                  }
                }
              }
            } else {
              if (var10 > 0.0) {
                var10 = var10 + 3.141592653589793 / (double)((va) this).field_E;
                ((va) this).field_D = (int)(var10 * (double)((va) this).field_E / 6.283185307179586);
                L2: while (true) {
                  if (((va) this).field_E <= ((va) this).field_D) {
                    ((va) this).field_D = ((va) this).field_D - ((va) this).field_E;
                    continue L2;
                  } else {
                    L3: while (true) {
                      if (((va) this).field_D >= 0) {
                        return true;
                      } else {
                        ((va) this).field_D = ((va) this).field_D + ((va) this).field_E;
                        continue L3;
                      }
                    }
                  }
                }
              } else {
                ((va) this).field_D = (int)(var10 * (double)((va) this).field_E / 6.283185307179586);
                L4: while (true) {
                  if (((va) this).field_E <= ((va) this).field_D) {
                    ((va) this).field_D = ((va) this).field_D - ((va) this).field_E;
                    continue L4;
                  } else {
                    L5: while (true) {
                      if (((va) this).field_D >= 0) {
                        return true;
                      } else {
                        ((va) this).field_D = ((va) this).field_D + ((va) this).field_E;
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
        }
    }

    final static wc a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6, int[] param7, int param8) {
        wc var9 = null;
        var9 = new wc(param3, param8, param2, param4, param6, param1, param7);
        so.field_t.a((byte) 54, (q) (Object) var9);
        bp.a(var9, 1, param5);
        if (!param0) {
          return null;
        } else {
          return var9;
        }
    }

    private va() throws Throwable {
        throw new Error();
    }

    final static int a(int param0, byte param1, Random param2) {
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        if (-1 > (param0 ^ -1)) {
          if (uk.a(false, param0)) {
            return (int)((4294967295L & (long)param2.nextInt()) * (long)param0 >> -1854246560);
          } else {
            if (param1 < 119) {
              var5 = null;
              va.a((h) null, (byte) -75, 70);
              var3 = -(int)(4294967296L % (long)param0) + -2147483648;
              L0: while (true) {
                var4 = param2.nextInt();
                if (var4 < var3) {
                  return b.e(param0, var4, -25034);
                } else {
                  continue L0;
                }
              }
            } else {
              var3 = -(int)(4294967296L % (long)param0) + -2147483648;
              L1: while (true) {
                var4 = param2.nextInt();
                if (var4 < var3) {
                  return b.e(param0, var4, -25034);
                } else {
                  continue L1;
                }
              }
            }
          }
        } else {
          throw new IllegalArgumentException();
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new bp();
    }
}
