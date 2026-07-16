/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jm extends hm {
    static int field_L;
    private int field_z;
    private int field_C;
    private ed[] field_J;
    static String field_M;
    int field_B;
    private ed field_N;
    private int field_y;
    static ed[] field_K;
    private int field_A;
    static mf field_I;
    private int field_H;
    boolean field_G;
    private ed field_D;
    private int field_F;
    private ed field_E;

    jm(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> -288338399 & 8355711, 8355711 & param6 >> -268638399);
    }

    final static int[] j(int param0) {
        if (bk.field_r != null) {
            return bk.field_r.a(37);
        }
        if (param0 == -3282) {
            return null;
        }
        return null;
    }

    final void a(int param0, int param1, int param2) {
        ((jm) this).field_y = (16711422 & param1) >> 321674849;
        ((jm) this).field_A = param0;
        ((jm) this).field_H = param1;
        if (param2 >= -124) {
            ((jm) this).field_E = null;
        }
        ((jm) this).field_F = (16711422 & param0) >> -824642431;
        this.k(-27800);
    }

    private final ed e(byte param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = EscapeVector.field_A;
        int var2 = ((jm) this).field_x >> 281867905;
        ed var3 = new ed(var2, ((jm) this).field_x);
        eo.a(var3, (byte) -8);
        for (var4 = 0; var4 < ((jm) this).field_x; var4++) {
            for (var5 = 0; (var2 ^ -1) < (var5 ^ -1); var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + ((jm) this).field_x));
                var8 = 1;
                if (var6 < 1.0) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = var6 < 1.0 ? (int)(var6 * 255.0) : 255;
                }
                em.b(var5, var4, var8 << -1798125208 | var8 | var8 << -1428143184);
            }
        }
        dl.a((byte) 127);
        if (param0 >= -112) {
            return null;
        }
        return var3;
    }

    public static void a(byte param0) {
        field_I = null;
        field_M = null;
        if (param0 != 127) {
            return;
        }
        field_K = null;
    }

    final void a(int param0, int param1, int param2, hm param3) {
        if (((jm) this).field_G) {
            ((jm) this).field_C = ((jm) this).field_C + 1;
            if ((((jm) this).field_C ^ -1) < (2 * ((jm) this).field_z ^ -1)) {
                ((jm) this).field_C = ((jm) this).field_C - 2 * ((jm) this).field_z;
            }
        }
        if (param0 != -14472) {
            ed discarded$0 = this.e((byte) 105);
        }
    }

    private final void a(int param0, int param1, ed param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = EscapeVector.field_A;
          if (param0 <= -23) {
            break L0;
          } else {
            field_K = null;
            break L0;
          }
        }
        var5 = ((jm) this).field_g + param3;
        rd.a(var5 + -((jm) this).field_N.field_s, param3 - -((jm) this).field_N.field_s, param1 - -((jm) this).field_x, 19807, param1);
        var6 = -((jm) this).field_C + param3;
        L1: while (true) {
          if ((var6 ^ -1) <= (var5 ^ -1)) {
            L2: {
              dl.a((byte) -125);
              if ((param3 - -((jm) this).field_N.field_s ^ -1) > (em.field_a ^ -1)) {
                break L2;
              } else {
                eo.a(((jm) this).field_E, (byte) -35);
                param2.e(-((jm) this).field_C, 0);
                param2.e(-((jm) this).field_C + ((jm) this).field_z * 2, 0);
                ((jm) this).field_D.f(0, 0);
                dl.a((byte) 124);
                ((jm) this).field_E.e(param3, param1);
                break L2;
              }
            }
            L3: {
              if (em.field_b >= -((jm) this).field_N.field_s + var5) {
                eo.a(((jm) this).field_E, (byte) -29);
                var7 = ((jm) this).field_C + (((jm) this).field_g - ((jm) this).field_N.field_s);
                L4: while (true) {
                  if ((2 * ((jm) this).field_z ^ -1) <= (var7 ^ -1)) {
                    param2.e(-var7, 0);
                    param2.e(2 * ((jm) this).field_z - var7, 0);
                    ((jm) this).field_N.f(0, 0);
                    dl.a((byte) -65);
                    ((jm) this).field_E.e(var5 - ((jm) this).field_N.field_s, param1);
                    break L3;
                  } else {
                    var7 = var7 - ((jm) this).field_z * 2;
                    continue L4;
                  }
                }
              } else {
                break L3;
              }
            }
            return;
          } else {
            param2.e(var6, param1);
            var6 = var6 + param2.field_s;
            continue L1;
          }
        }
    }

    private final void k(int param0) {
        ((jm) this).field_J = new ed[]{this.a(true, ((jm) this).field_H, ((jm) this).field_A), this.a(true, ((jm) this).field_y, ((jm) this).field_F)};
        ((jm) this).field_N = this.e((byte) -122);
        ((jm) this).field_D = ((jm) this).field_N.d();
        if (param0 != -27800) {
            return;
        }
        ((jm) this).field_E = new ed(((jm) this).field_x >> 1829004865, ((jm) this).field_x);
    }

    final static void a(int param0, n param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              L1: {
                var5 = EscapeVector.field_A;
                var6 = new byte[24];
                var2 = var6;
                if (bd.field_h != null) {
                  try {
                    L2: {
                      bd.field_h.a(0, 0L);
                      bd.field_h.a((byte) 94, var6);
                      var3_int = 0;
                      L3: while (true) {
                        L4: {
                          if (24 <= var3_int) {
                            break L4;
                          } else {
                            if (var6[var3_int] != 0) {
                              break L4;
                            } else {
                              var3_int++;
                              continue L3;
                            }
                          }
                        }
                        if (-25 >= (var3_int ^ -1)) {
                          throw new IOException();
                        } else {
                          param1.a(24, (byte) 21, param0, var2);
                          decompiledRegionSelector0 = 0;
                          break L2;
                        }
                      }
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L5: {
                      var3 = (Exception) (Object) decompiledCaughtException;
                      var4 = 0;
                      L6: while (true) {
                        if (-25 >= (var4 ^ -1)) {
                          decompiledRegionSelector0 = 1;
                          break L5;
                        } else {
                          var2[var4] = (byte)-1;
                          var4++;
                          continue L6;
                        }
                      }
                    }
                  }
                  if (decompiledRegionSelector0 == 0) {
                    break L0;
                  } else {
                    break L1;
                  }
                } else {
                  break L1;
                }
              }
              param1.a(24, (byte) 21, param0, var2);
              break L0;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(int param0, int param1, int param2, boolean param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.k(-27800);
    }

    final void a(int param0, byte param1, int param2, int param3) {
        if ((param2 ^ -1) != -1) {
            return;
        }
        int var5 = ((jm) this).field_k + param3;
        int var6 = param0 - -((jm) this).field_j;
        this.a(-32, var6, ((jm) this).field_J[0], var5);
        if (65536 > ((jm) this).field_B) {
            rd.a(((jm) this).field_g + var5, var5 + (((jm) this).field_B * ((jm) this).field_g >> -1765617680), var6 + ((jm) this).field_x, 19807, var6);
            this.a(-81, var6, ((jm) this).field_J[1], var5);
            dl.a((byte) 119);
        }
        if (param1 <= 85) {
            ((jm) this).field_D = null;
        }
    }

    private final ed a(boolean param0, int param1, int param2) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        ed var14 = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        L0: {
          var13 = EscapeVector.field_A;
          var14 = new ed(2 * ((jm) this).field_z, ((jm) this).field_x);
          eo.a(var14, (byte) -90);
          var5 = ((jm) this).field_x >> 910424289;
          var6 = 0;
          if (param0) {
            break L0;
          } else {
            ((jm) this).field_B = 60;
            break L0;
          }
        }
        L1: while (true) {
          if (var6 >= ((jm) this).field_x) {
            dl.a((byte) 127);
            return var14;
          } else {
            L2: {
              var7 = (var6 >> -1952569727) * (2 * ((jm) this).field_z - 1) % (((jm) this).field_z * 2);
              var8 = 16711935 & param1;
              var9 = 65280 & param1;
              var10 = -var5 + var6;
              var11 = 128 + (int)(Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5 * 128.0);
              if (-257 < (var11 ^ -1)) {
                stackOut_5_0 = (var11 * var8 & -16711936 | 16711680 & var11 * var9) >>> -2069982104;
                stackIn_6_0 = stackOut_5_0;
                break L2;
              } else {
                stackOut_4_0 = var9 | var8;
                stackIn_6_0 = stackOut_4_0;
                break L2;
              }
            }
            L3: {
              var12 = stackIn_6_0;
              em.e(var7, var6, ((jm) this).field_z, var12);
              em.e(var7 - ((jm) this).field_z * 2, var6, ((jm) this).field_z, var12);
              var8 = param2 & 16711935;
              var9 = 65280 & param2;
              if ((var11 ^ -1) > -257) {
                stackOut_8_0 = (-16711936 & var11 * var8 | 16711680 & var11 * var9) >>> 333967432;
                stackIn_9_0 = stackOut_8_0;
                break L3;
              } else {
                stackOut_7_0 = var8 | var9;
                stackIn_9_0 = stackOut_7_0;
                break L3;
              }
            }
            var12 = stackIn_9_0;
            em.e(((jm) this).field_z + var7, var6, ((jm) this).field_z, var12);
            em.e(-((jm) this).field_z + var7, var6, ((jm) this).field_z, var12);
            var6++;
            continue L1;
          }
        }
    }

    final static byte[] a(int param0, int param1, c param2, byte[] param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = EscapeVector.field_A;
        var4 = param2.j(param0, 8);
        if (0 != var4) {
          L0: {
            L1: {
              if (param3 == null) {
                break L1;
              } else {
                if (var4 == param3.length) {
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            param3 = new byte[var4];
            break L0;
          }
          L2: {
            if (param1 > 113) {
              break L2;
            } else {
              field_I = null;
              break L2;
            }
          }
          L3: {
            var5 = param2.j(3, 8);
            var6 = (byte)param2.j(8, 8);
            if ((var5 ^ -1) >= -1) {
              var7 = 0;
              L4: while (true) {
                if ((var7 ^ -1) <= (var4 ^ -1)) {
                  break L3;
                } else {
                  param3[var7] = (byte)var6;
                  var7++;
                  continue L4;
                }
              }
            } else {
              var7 = 0;
              L5: while (true) {
                if ((var7 ^ -1) <= (var4 ^ -1)) {
                  break L3;
                } else {
                  param3[var7] = (byte)(var6 + param2.j(var5, 8));
                  var7++;
                  continue L5;
                }
              }
            }
          }
          return param3;
        } else {
          return null;
        }
    }

    private jm(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        ((jm) this).field_z = param4;
        ((jm) this).field_A = param6;
        ((jm) this).field_H = param5;
        ((jm) this).field_F = param8;
        ((jm) this).field_y = param7;
        ((jm) this).a(param2, param1, param0, true, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_M = "?";
        field_K = new ed[17];
    }
}
