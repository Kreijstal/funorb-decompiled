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
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 1 & 8355711, 8355711 & param6 >> 1);
    }

    final static int[] j(int param0) {
        if (bk.field_r == null) {
            return null;
        }
        return bk.field_r.a(37);
    }

    final void a(int param0, int param1, int param2) {
        ((jm) this).field_y = (16711422 & param1) >> 1;
        ((jm) this).field_A = param0;
        ((jm) this).field_H = param1;
        if (param2 >= -124) {
            ((jm) this).field_E = null;
        }
        ((jm) this).field_F = (16711422 & param0) >> 1;
        this.k(-27800);
    }

    private final ed e(byte param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        int var9 = EscapeVector.field_A;
        int var2 = ((jm) this).field_x >> 1;
        ed var3 = new ed(var2, ((jm) this).field_x);
        eo.a(var3, (byte) -8);
        for (var4 = 0; var4 < ((jm) this).field_x; var4++) {
            for (var5 = 0; var2 > var5; var5++) {
                var6 = (double)var5 * (double)var5 / (double)(var4 * (-var4 + ((jm) this).field_x));
                var8 = 1;
                if (var6 < 1.0) {
                    var6 = Math.sqrt(-var6 + 1.0);
                    var8 = var6 < 1.0 ? (int)(var6 * 255.0) : 255;
                }
                em.b(var5, var4, var8 << 8 | var8 | var8 << 16);
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
        field_K = null;
    }

    final void a(int param0, int param1, int param2, hm param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (!((jm) this).field_G) {
                break L1;
              } else {
                ((jm) this).field_C = ((jm) this).field_C + 1;
                if (((jm) this).field_C <= 2 * ((jm) this).field_z) {
                  break L1;
                } else {
                  ((jm) this).field_C = ((jm) this).field_C - 2 * ((jm) this).field_z;
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == -14472) {
                break L2;
              } else {
                ed discarded$2 = this.e((byte) 105);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var5;
            stackOut_6_1 = new StringBuilder().append("jm.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
    }

    private final void a(int param0, int param1, ed param2, int param3) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param0 <= -23) {
                break L1;
              } else {
                field_K = null;
                break L1;
              }
            }
            var5_int = ((jm) this).field_g + param3;
            rd.a(var5_int + -((jm) this).field_N.field_s, param3 - -((jm) this).field_N.field_s, param1 - -((jm) this).field_x, 19807, param1);
            var6 = -((jm) this).field_C + param3;
            L2: while (true) {
              if (var6 >= var5_int) {
                L3: {
                  dl.a((byte) -125);
                  if (param3 - -((jm) this).field_N.field_s < em.field_a) {
                    break L3;
                  } else {
                    eo.a(((jm) this).field_E, (byte) -35);
                    param2.e(-((jm) this).field_C, 0);
                    param2.e(-((jm) this).field_C + ((jm) this).field_z * 2, 0);
                    ((jm) this).field_D.f(0, 0);
                    dl.a((byte) 124);
                    ((jm) this).field_E.e(param3, param1);
                    break L3;
                  }
                }
                L4: {
                  if (em.field_b >= -((jm) this).field_N.field_s + var5_int) {
                    eo.a(((jm) this).field_E, (byte) -29);
                    var7 = ((jm) this).field_C + (((jm) this).field_g - ((jm) this).field_N.field_s);
                    L5: while (true) {
                      if (2 * ((jm) this).field_z >= var7) {
                        param2.e(-var7, 0);
                        param2.e(2 * ((jm) this).field_z - var7, 0);
                        ((jm) this).field_N.f(0, 0);
                        dl.a((byte) -65);
                        ((jm) this).field_E.e(var5_int - ((jm) this).field_N.field_s, param1);
                        break L4;
                      } else {
                        var7 = var7 - ((jm) this).field_z * 2;
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
            stackOut_15_0 = (RuntimeException) var5;
            stackOut_15_1 = new StringBuilder().append("jm.C(").append(param0).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L6;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L6;
            }
          }
          throw t.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + ',' + param3 + ')');
        }
    }

    private final void k(int param0) {
        ((jm) this).field_J = new ed[]{this.a(true, ((jm) this).field_H, ((jm) this).field_A), this.a(true, ((jm) this).field_y, ((jm) this).field_F)};
        ((jm) this).field_N = this.e((byte) -122);
        ((jm) this).field_D = ((jm) this).field_N.d();
        ((jm) this).field_E = new ed(((jm) this).field_x >> 1, ((jm) this).field_x);
    }

    final static void a(int param0, n param1) {
        try {
            byte[] var2 = null;
            RuntimeException var2_ref = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            String stackIn_19_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_16_0 = null;
            StringBuilder stackOut_16_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
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
                            if (var3_int >= 24) {
                              throw new IOException();
                            } else {
                              param1.a(24, (byte) 21, 0, var2);
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
                            if (var4 >= 24) {
                              decompiledRegionSelector0 = 1;
                              break L6;
                            } else {
                              var2[var4] = (byte) -1;
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
                  param1.a(24, (byte) 21, 0, var2);
                  break L1;
                }
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L8: {
                var2_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_16_0 = (RuntimeException) var2_ref;
                stackOut_16_1 = new StringBuilder().append("jm.I(").append(0).append(',');
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if (param1 == null) {
                  stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                  stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                  stackOut_18_2 = "null";
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L8;
                } else {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "{...}";
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L8;
                }
              }
              throw t.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
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
        int var5 = ((jm) this).field_k + param3;
        int var6 = param0 - -((jm) this).field_j;
        this.a(-32, var6, ((jm) this).field_J[0], var5);
        if (65536 > ((jm) this).field_B) {
            rd.a(((jm) this).field_g + var5, var5 + (((jm) this).field_B * ((jm) this).field_g >> 16), var6 + ((jm) this).field_x, 19807, var6);
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
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        var13 = EscapeVector.field_A;
        var14 = new ed(2 * ((jm) this).field_z, ((jm) this).field_x);
        eo.a(var14, (byte) -90);
        var5 = ((jm) this).field_x >> 1;
        var6 = 0;
        L0: while (true) {
          if (var6 >= ((jm) this).field_x) {
            dl.a((byte) 127);
            return var14;
          } else {
            L1: {
              var7 = (var6 >> 1) * (2 * ((jm) this).field_z - 1) % (((jm) this).field_z * 2);
              var8 = 16711935 & param1;
              var9 = 65280 & param1;
              var10 = -var5 + var6;
              var11 = 128 + (int)(Math.sqrt((double)(-(var10 * var10) + var5 * var5)) / (double)var5 * 128.0);
              if (var11 < 256) {
                stackOut_4_0 = (var11 * var8 & -16711936 | 16711680 & var11 * var9) >>> 8;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = var9 | var8;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            L2: {
              var12 = stackIn_5_0;
              em.e(var7, var6, ((jm) this).field_z, var12);
              em.e(var7 - ((jm) this).field_z * 2, var6, ((jm) this).field_z, var12);
              var8 = param2 & 16711935;
              var9 = 65280 & param2;
              if (var11 < 256) {
                stackOut_7_0 = (-16711936 & var11 * var8 | 16711680 & var11 * var9) >>> 8;
                stackIn_8_0 = stackOut_7_0;
                break L2;
              } else {
                stackOut_6_0 = var8 | var9;
                stackIn_8_0 = stackOut_6_0;
                break L2;
              }
            }
            var12 = stackIn_8_0;
            em.e(((jm) this).field_z + var7, var6, ((jm) this).field_z, var12);
            em.e(-((jm) this).field_z + var7, var6, ((jm) this).field_z, var12);
            var6++;
            continue L0;
          }
        }
    }

    final static byte[] a(int param0, int param1, c param2, byte[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        byte[] stackIn_16_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_15_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = EscapeVector.field_A;
        try {
          L0: {
            var4_int = param2.j(16, 8);
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
                var5 = param2.j(3, 8);
                var6 = (byte)param2.j(8, 8);
                if (var5 <= 0) {
                  var7 = 0;
                  L4: while (true) {
                    if (var7 >= var4_int) {
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
                    if (var7 >= var4_int) {
                      break L3;
                    } else {
                      param3[var7] = (byte)(var6 + param2.j(var5, 8));
                      var7++;
                      continue L5;
                    }
                  }
                }
              }
              stackOut_15_0 = (byte[]) param3;
              stackIn_16_0 = stackOut_15_0;
              break L0;
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (byte[]) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var4;
            stackOut_17_1 = new StringBuilder().append("jm.A(").append(16).append(',').append(118).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
            stackOut_20_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_20_2).append(',');
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param3 == null) {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw t.a((Throwable) (Object) stackIn_23_0, stackIn_23_2 + ')');
        }
        return stackIn_16_0;
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
