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
        return (int[]) null;
    }

    final void a(int param0, int param1, int param2) {
        this.field_y = (16711422 & param1) >> 321674849;
        this.field_A = param0;
        this.field_H = param1;
        if (param2 >= -124) {
            this.field_E = (ed) null;
        }
        this.field_F = (16711422 & param0) >> -824642431;
        this.k(-27800);
    }

    private final ed e(byte param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = EscapeVector.field_A;
        int var2 = this.field_x >> 281867905;
        ed var3 = new ed(var2, this.field_x);
        eo.a(var3, (byte) -8);
        for (var4 = 0; var4 < this.field_x; var4++) {
            for (var5 = 0; var2 > var5; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + this.field_x));
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
            return (ed) null;
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
        ed discarded$1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          L0: {
            L1: {
              if (!this.field_G) {
                break L1;
              } else {
                this.field_C = this.field_C + 1;
                if (this.field_C <= 2 * this.field_z) {
                  break L1;
                } else {
                  this.field_C = this.field_C - 2 * this.field_z;
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == -14472) {
                break L2;
              } else {
                discarded$1 = this.e((byte) 105);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var5);

            stackIn_8_1 = new StringBuilder().append("jm.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    private final void a(int param0, int param1, ed param2, int param3) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param0 <= -23) {
                break L1;
              } else {
                field_K = (ed[]) null;
                break L1;
              }
            }
            var5_int = this.field_g + param3;
            rd.a(var5_int + -this.field_N.field_s, param3 - -this.field_N.field_s, param1 - -this.field_x, 19807, param1);
            var6 = -this.field_C + param3;
            L2: while (true) {
              if (var6 >= var5_int) {
                L3: {
                  dl.a((byte) -125);
                  if (param3 - -this.field_N.field_s < em.field_a) {
                    break L3;
                  } else {
                    eo.a(this.field_E, (byte) -35);
                    param2.e(-this.field_C, 0);
                    param2.e(-this.field_C + this.field_z * 2, 0);
                    this.field_D.f(0, 0);
                    dl.a((byte) 124);
                    this.field_E.e(param3, param1);
                    break L3;
                  }
                }
                L4: {
                  if (em.field_b >= -this.field_N.field_s + var5_int) {
                    eo.a(this.field_E, (byte) -29);
                    var7 = this.field_C + (this.field_g - this.field_N.field_s);
                    L5: while (true) {
                      if (2 * this.field_z >= var7) {
                        param2.e(-var7, 0);
                        param2.e(2 * this.field_z - var7, 0);
                        this.field_N.f(0, 0);
                        dl.a((byte) -65);
                        this.field_E.e(var5_int - this.field_N.field_s, param1);
                        break L4;
                      } else {
                        var7 = var7 - this.field_z * 2;
                        continue L5;
                      }
                    }
                  } else {
                    break L4;
                  }
                }
                break L0;
              } else {
                param2.e(var6, param1);
                var6 = var6 + param2.field_s;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("jm.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param3 + ')');
        }
    }

    private final void k(int param0) {
        this.field_J = new ed[]{this.a(true, this.field_H, this.field_A), this.a(true, this.field_y, this.field_F)};
        this.field_N = this.e((byte) -122);
        this.field_D = this.field_N.d();
        if (param0 != -27800) {
            return;
        }
        this.field_E = new ed(this.field_x >> 1829004865, this.field_x);
    }

    final static void a(int param0, n param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            int var5 = 0;
            byte[] var6 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var2_ref = null;
            Exception var3 = null;
            int var4 = 0;
            var5 = EscapeVector.field_A;
            try {
              L0: {
                L1: {
                  L2: {
                    var6 = new byte[24];
                    var2 = var6;
                    if (bd.field_h != null) {
                      try {
                        L3: {
                          bd.field_h.a(0, 0L);
                          bd.field_h.a((byte) 94, var6);
                          var3_int = 0;
                          L4: while (true) {
                            L5: {
                              if (24 <= var3_int) {
                                break L5;
                              } else {
                                if (var6[var3_int] != 0) {
                                  break L5;
                                } else {
                                  var3_int++;
                                  continue L4;
                                }
                              }
                            }
                            if (-25 >= (var3_int ^ -1)) {
                              throw new IOException();
                            } else {
                              param1.a(24, (byte) 21, param0, var2);
                              decompiledRegionSelector0 = 0;
                              break L3;
                            }
                          }
                        }
                      } catch (java.lang.Exception decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L6: {
                          var3 = (Exception) (Object) decompiledCaughtException;
                          var4 = 0;
                          L7: while (true) {
                            if (-25 >= (var4 ^ -1)) {
                              decompiledRegionSelector0 = 1;
                              break L6;
                            } else {
                              var2[var4] = (byte)-1;
                              var4++;
                              continue L7;
                            }
                          }
                        }
                      }
                      if (decompiledRegionSelector0 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    } else {
                      break L2;
                    }
                  }
                  param1.a(24, (byte) 21, param0, var2);
                  break L1;
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_18_0 = (RuntimeException) (var2_ref);

                stackIn_18_1 = new StringBuilder().append("jm.I(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "null";
                  break L8;
                } else {
                  stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
                  stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
                  stackIn_19_2 = "{...}";
                  break L8;
                }
              }
              throw t.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
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
        if (param2 != 0) {
            return;
        }
        int var5 = this.field_k + param3;
        int var6 = param0 - -this.field_j;
        this.a(-32, var6, this.field_J[0], var5);
        if (65536 > this.field_B) {
            rd.a(this.field_g + var5, var5 + (this.field_B * this.field_g >> -1765617680), var6 + this.field_x, 19807, var6);
            this.a(-81, var6, this.field_J[1], var5);
            dl.a((byte) 119);
        }
        if (param1 <= 85) {
            this.field_D = (ed) null;
        }
    }

    private final ed a(boolean param0, int param1, int param2) {
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = EscapeVector.field_A;
        ed var14 = new ed(2 * this.field_z, this.field_x);
        eo.a(var14, (byte) -90);
        int var5 = this.field_x >> 910424289;
        int var6 = 0;
        if (!param0) {
            this.field_B = 60;
        }
        while (var6 < this.field_x) {
            var7 = (var6 >> -1952569727) * (2 * this.field_z - 1) % (this.field_z * 2);
            var8 = 16711935 & param1;
            var9 = 65280 & param1;
            var10 = -var5 + var6;
            var11 = 128 + (int)(Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5 * 128.0);
            var12 = -257 >= (var11 ^ -1) ? var9 | var8 : (var11 * var8 & -16711936 | 16711680 & var11 * var9) >>> -2069982104;
            em.e(var7, var6, this.field_z, var12);
            em.e(var7 - this.field_z * 2, var6, this.field_z, var12);
            var8 = param2 & 16711935;
            var9 = 65280 & param2;
            var12 = (var11 ^ -1) <= -257 ? var8 | var9 : (-16711936 & var11 * var8 | 16711680 & var11 * var9) >>> 333967432;
            em.e(this.field_z + var7, var6, this.field_z, var12);
            em.e(-this.field_z + var7, var6, this.field_z, var12);
            var6++;
        }
        dl.a((byte) 127);
        return var14;
    }

    final static byte[] a(int param0, int param1, c param2, byte[] param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        byte[] stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            var4_int = param2.j(param0, 8);
            if (0 != var4_int) {
              L1: {
                L2: {
                  if (param3 == null) {
                    break L2;
                  } else {
                    if (var4_int == param3.length) {
                      break L1;
                    } else {
                      break L2;
                    }
                  }
                }
                param3 = new byte[var4_int];
                break L1;
              }
              L3: {
                if (param1 > 113) {
                  break L3;
                } else {
                  field_I = (mf) null;
                  break L3;
                }
              }
              L4: {
                var5 = param2.j(3, 8);
                var6 = (byte)param2.j(8, 8);
                if ((var5 ^ -1) >= -1) {
                  var7 = 0;
                  L5: while (true) {
                    if (var7 >= var4_int) {
                      break L4;
                    } else {
                      param3[var7] = (byte)var6;
                      var7++;
                      continue L5;
                    }
                  }
                } else {
                  var7 = 0;
                  L6: while (true) {
                    if (var7 >= var4_int) {
                      break L4;
                    } else {
                      param3[var7] = (byte)(var6 + param2.j(var5, 8));
                      var7++;
                      continue L6;
                    }
                  }
                }
              }
              stackIn_18_0 = (byte[]) (param3);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_3_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4);

            stackIn_21_1 = new StringBuilder().append("jm.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',');

            if (param3 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_22_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (byte[]) ((Object) stackIn_3_0);
        } else {
          return stackIn_18_0;
        }
    }

    private jm(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_z = param4;
        this.field_A = param6;
        this.field_H = param5;
        this.field_F = param8;
        this.field_y = param7;
        this.a(param2, param1, param0, true, param3);
    }

    static {
        field_M = "?";
        field_K = new ed[17];
    }
}
