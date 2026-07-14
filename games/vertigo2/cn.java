/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cn {
    private int field_l;
    private int field_b;
    private int field_u;
    private int field_f;
    private int field_i;
    static boolean field_v;
    private int field_x;
    static boolean field_r;
    private int field_m;
    private int field_c;
    private int field_w;
    int[] field_e;
    private int field_s;
    private int field_k;
    private int field_d;
    private int field_B;
    int field_q;
    private int field_j;
    boolean field_o;
    private int field_A;
    private int field_t;
    private int field_a;
    private int field_p;
    private int field_z;
    private int field_y;
    private int field_h;
    private int field_g;
    private int field_n;

    final void a(int param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        ((cn) this).field_i = 1;
        ((cn) this).field_x = 1;
        ((cn) this).field_f = param6;
        ((cn) this).field_h = (param4 - param0) / 2 + param0;
        ((cn) this).field_A = param6 - -((param1 + -param6) / 2);
        ((cn) this).field_n = 30;
        ((cn) this).field_g = param2 + (param5 - param2) / 2;
        ((cn) this).field_o = true;
        ((cn) this).field_y = ((cn) this).field_u;
        if (param3) {
            ((cn) this).field_b = -86;
        }
        ((cn) this).field_b = param1;
    }

    final static String a(byte param0, String param1, char param2, String param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        StringBuilder var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        L0: {
          var12 = Vertigo2.field_L ? 1 : 0;
          var4 = param3.length();
          var5 = param1.length();
          var6 = var4;
          var8 = 109 / ((param0 - -40) / 53);
          var7 = -1 + var5;
          if (var7 != 0) {
            var9_int = 0;
            L1: while (true) {
              var9_int = param3.indexOf((int) param2, var9_int);
              if (0 <= var9_int) {
                var9_int++;
                var6 = var6 + var7;
                continue L1;
              } else {
                break L0;
              }
            }
          } else {
            break L0;
          }
        }
        var9 = new StringBuilder(var6);
        var10 = 0;
        L2: while (true) {
          var11 = param3.indexOf((int) param2, var10);
          if (0 > var11) {
            StringBuilder discarded$3 = var9.append(param3.substring(var10));
            return var9.toString();
          } else {
            StringBuilder discarded$4 = var9.append(param3.substring(var10, var11));
            StringBuilder discarded$5 = var9.append(param1);
            var10 = var11 + 1;
            continue L2;
          }
        }
    }

    final int b(int param0) {
        if (param0 != 1) {
            return -2;
        }
        return ((cn) this).field_x;
    }

    final void a(int param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = Vertigo2.field_L ? 1 : 0;
          var3 = -21 / ((param1 - -33) / 63);
          if (param0 != ((cn) this).field_i) {
            ((cn) this).field_x = ((cn) this).field_i;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          ((cn) this).field_i = param0;
          if (-1 != (param0 ^ -1)) {
            if (1 == param0) {
              ((cn) this).field_d = 214;
              ((cn) this).field_t = 550;
              break L1;
            } else {
              if (param0 != 2) {
                ((cn) this).field_w = ((cn) this).field_w + (param0 << 1190460033);
                ((cn) this).field_t = ((cn) this).field_w;
                break L1;
              } else {
                ((cn) this).field_t = 400;
                ((cn) this).field_d = 195;
                break L1;
              }
            }
          } else {
            ((cn) this).field_t = 400;
            ((cn) this).field_d = 239;
            break L1;
          }
        }
    }

    final int c(int param0) {
        if (param0 != -1870) {
            return 46;
        }
        return ((cn) this).field_i;
    }

    final static void a(ed param0, int param1) {
        try {
            byte[] var2 = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            int var5 = 0;
            byte[] var6 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = Vertigo2.field_L ? 1 : 0;
                        var6 = new byte[24];
                        var2 = var6;
                        if (param1 >= 113) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        field_r = false;
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        if (null == as.field_d) {
                            statePc = 13;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            as.field_d.a(-23669, 0L);
                            as.field_d.a(0, var6);
                            var3_int = 0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if ((var3_int ^ -1) <= -25) {
                                statePc = 7;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (var6[var3_int] != 0) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var3_int++;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (24 > var3_int) {
                                statePc = 13;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        var3 = (Exception) (Object) caughtException;
                        var4 = 0;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (24 <= var4) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        var2[var4] = (byte)-1;
                        var4++;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 13: {
                        param0.a(0, -10140, var2, 24);
                        return;
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
            ((cn) this).a(85, -89, -12, -107);
        }
        return ((cn) this).field_l == ((cn) this).field_q ? true : false;
    }

    private final void a(byte param0, int param1, int param2, int param3, int param4, int param5, int param6) {
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
        L0: {
          if (param0 >= 77) {
            break L0;
          } else {
            int discarded$1 = ((cn) this).c(77);
            break L0;
          }
        }
        L1: {
          if (((cn) this).field_o) {
            var8 = param2;
            param2 = param3;
            param4 = param4 * 4;
            param3 = var8;
            param2 = param2 * 4;
            ((cn) this).field_e[2] = param2;
            ((cn) this).field_e[1] = ((cn) this).field_f;
            ((cn) this).field_e[0] = param4;
            param3 = -param3 + ((cn) this).field_b;
            param2 = -param2 + ((cn) this).field_g;
            param4 = ((cn) this).field_h - param4;
            var9 = wg.a(124, param3 * param3 + param4 * param4 + param2 * param2);
            param2 = (param2 << -990061872) / var9;
            param3 = (param3 << -299678800) / var9;
            param4 = (param4 << -841369488) / var9;
            ((cn) this).field_e[9] = param4;
            ((cn) this).field_e[10] = param3;
            ((cn) this).field_e[11] = param2;
            var10 = param2 * 16384 >> -2003517170;
            var11 = 0;
            var11 = var11 >> 2;
            var10 = var10 >> 2;
            var12 = -16384 * param4 >> 334474766;
            var12 = var12 >> 2;
            var9 = wg.a(92, var10 * var10 - (-(var11 * var11) + -(var12 * var12)));
            var11 = (var11 << 476767952) / var9;
            var12 = (var12 << 2044002224) / var9;
            var10 = (var10 << -1979766896) / var9;
            ((cn) this).field_e[5] = var12;
            ((cn) this).field_e[3] = var10;
            ((cn) this).field_e[4] = var11;
            param3 = param3 >> 1;
            param2 = param2 >> 1;
            var12 = var12 >> 1;
            param4 = param4 >> 1;
            var10 = var10 >> 1;
            var11 = var11 >> 1;
            var13 = param3 * var12 - var11 * param2 >> -535230736;
            var14 = -(var12 * param4) + param2 * var10 >> -2113770192;
            var15 = param4 * var11 + -(param3 * var10) >> -1608657808;
            var9 = wg.a(123, var14 * var14 + (var13 * var13 + var15 * var15));
            var15 = (var15 << -1059464304) / var9;
            var13 = (var13 << 672870896) / var9;
            var14 = (var14 << -676993296) / var9;
            ((cn) this).field_e[6] = var13;
            ((cn) this).field_e[8] = var15;
            ((cn) this).field_e[7] = var14;
            break L1;
          } else {
            L2: {
              param6 = param6 << 1;
              param1 = param1 << 1;
              var8 = 2047 & -param1;
              var9 = -param6 & 2047;
              var10 = 0;
              var11 = 0;
              var12 = param5;
              if (-1 != (param1 ^ -1)) {
                var13 = oo.field_j[param1];
                var14 = oo.field_h[param1];
                var15 = var14 * var11 - var12 * var13 >> -685694928;
                var12 = var11 * var13 - -(var14 * var12) >> -1218279824;
                var11 = var15;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param6 == 0) {
                break L3;
              } else {
                var13 = oo.field_j[param6];
                var14 = oo.field_h[param6];
                var15 = var10 * var14 + var13 * var12 >> -2015608688;
                var12 = var12 * var14 - var13 * var10 >> 1328051504;
                var10 = var15;
                break L3;
              }
            }
            var16 = oo.field_j[var9];
            var17 = oo.field_h[var9];
            var18 = oo.field_j[var8];
            var19 = oo.field_h[var8];
            var20 = (var16 >> 398675585) * (var18 >> -168559903) >> 1000636974;
            var21 = (var19 >> 139629409) * (var16 >> 32525473) >> 632240462;
            var22 = (var17 >> 1827762433) * (var18 >> 273685121) >> -1221954002;
            var23 = (var17 >> 488344545) * (var19 >> -1582137951) >> -421108274;
            var24 = -var10 + param4;
            var25 = -var11 + param3;
            var26 = param2 + -var12;
            ((cn) this).field_e[0] = var24;
            ((cn) this).field_e[1] = var25;
            ((cn) this).field_e[9] = -var21;
            ((cn) this).field_e[4] = 0;
            ((cn) this).field_e[10] = var18;
            ((cn) this).field_e[5] = var16 >> -237113215;
            ((cn) this).field_e[8] = -var22 >> 364405825;
            ((cn) this).field_e[11] = var23;
            ((cn) this).field_e[2] = var26;
            ((cn) this).field_e[6] = var20 >> -578678175;
            ((cn) this).field_e[7] = var19 >> 1540448353;
            ((cn) this).field_e[3] = var17 >> 64937761;
            break L1;
          }
        }
    }

    final void d(int param0) {
        ((cn) this).field_t = param0;
        ((cn) this).field_u = 214;
        ((cn) this).field_w = ((cn) this).field_t / 4;
        ((cn) this).field_z = ((cn) this).field_k;
        ((cn) this).field_c = 214;
    }

    final void a(int param0, int param1, int param2, int param3) {
        if (((cn) this).field_o) {
            this.a((byte) 82, 0, ((cn) this).field_A, ((cn) this).field_s, ((cn) this).field_a, ((cn) this).field_w, 4 * ((cn) this).field_n);
        } else {
            this.a((byte) 92, 4 * ((cn) this).field_c, param3, param0, param1, ((cn) this).field_w, 4 * ((cn) this).field_z);
        }
        if (param2 != 12257) {
            boolean discarded$0 = cn.b(false);
        }
    }

    final static boolean b(boolean param0) {
        if (param0) {
            return false;
        }
        return gd.field_j.field_hc == ao.field_N ? true : false;
    }

    final void a(int param0) {
        int var2 = 0;
        int var3 = 0;
        double var4 = 0.0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        L0: {
          var8 = Vertigo2.field_L ? 1 : 0;
          ((cn) this).field_j = ((cn) this).field_j + 3;
          if (!((cn) this).field_o) {
            break L0;
          } else {
            L1: {
              ((cn) this).field_d = 204;
              ((cn) this).field_t = 50;
              if (((cn) this).field_y >= ((cn) this).field_d) {
                if (((cn) this).field_d >= ((cn) this).field_y) {
                  break L1;
                } else {
                  ((cn) this).field_y = ((cn) this).field_y - 1;
                  break L1;
                }
              } else {
                ((cn) this).field_y = ((cn) this).field_y + 1;
                break L1;
              }
            }
            L2: {
              if (((cn) this).field_b - ((cn) this).field_B > ((cn) this).field_f + ((cn) this).field_m) {
                break L2;
              } else {
                ((cn) this).field_B = ((cn) this).field_B - 240;
                ((cn) this).field_m = ((cn) this).field_m - 240;
                break L2;
              }
            }
            L3: {
              if (((cn) this).field_w >= ((cn) this).field_t) {
                if (((cn) this).field_t < ((cn) this).field_w) {
                  ((cn) this).field_w = ((cn) this).field_w - 5;
                  break L3;
                } else {
                  break L3;
                }
              } else {
                ((cn) this).field_w = ((cn) this).field_w + 5;
                break L3;
              }
            }
            L4: {
              L5: {
                L6: {
                  if (((cn) this).field_A <= ((cn) this).field_b) {
                    break L6;
                  } else {
                    if (-1 > (((cn) this).field_p ^ -1)) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                }
                if (((cn) this).field_A >= ((cn) this).field_f + ((cn) this).field_m) {
                  break L4;
                } else {
                  if (0 <= ((cn) this).field_p) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              ((cn) this).field_p = ((cn) this).field_p * -1;
              break L4;
            }
            L7: {
              var2 = 1;
              if (((cn) this).field_b >= ((cn) this).field_A) {
                break L7;
              } else {
                if (((cn) this).field_p >= 0) {
                  break L7;
                } else {
                  var2 = 3;
                  break L7;
                }
              }
            }
            L8: {
              if (((cn) this).field_A >= ((cn) this).field_f - -((cn) this).field_m) {
                break L8;
              } else {
                if (-1 > (((cn) this).field_p ^ -1)) {
                  var2 = 3;
                  break L8;
                } else {
                  break L8;
                }
              }
            }
            ((cn) this).field_A = ((cn) this).field_A + ((cn) this).field_p * var2;
            ((cn) this).field_a = (oo.field_h[((cn) this).field_j % 2048] * 640 / 2 >> 1213050544) - -160;
            ((cn) this).field_s = (oo.field_j[((cn) this).field_j % 2048] * 640 / 2 >> -618066128) + 160;
            break L0;
          }
        }
        L9: {
          var2 = ((cn) this).field_w + -((cn) this).field_t;
          if (-26 < (var2 * var2 ^ -1)) {
            ((cn) this).field_w = ((cn) this).field_t;
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          var3 = 5;
          var4 = (double)(var2 * var2 / 50000);
          if (-50001 > (var2 * var2 ^ -1)) {
            var3 = (int)(5.0 * Math.sqrt(var4 * 8.0));
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          if ((((cn) this).field_z % 64 ^ -1) == param0) {
            ((cn) this).field_l = ((cn) this).field_q;
            break L11;
          } else {
            break L11;
          }
        }
        L12: {
          if (((cn) this).field_t > ((cn) this).field_w) {
            ((cn) this).field_w = ((cn) this).field_w + var3;
            break L12;
          } else {
            if (((cn) this).field_w > ((cn) this).field_t) {
              ((cn) this).field_w = ((cn) this).field_w - var3;
              break L12;
            } else {
              break L12;
            }
          }
        }
        L13: {
          if (((cn) this).field_c >= ((cn) this).field_d) {
            if (((cn) this).field_d >= ((cn) this).field_c) {
              ((cn) this).field_x = ((cn) this).field_i;
              break L13;
            } else {
              ((cn) this).field_c = ((cn) this).field_c - 1;
              break L13;
            }
          } else {
            ((cn) this).field_c = ((cn) this).field_c + 1;
            break L13;
          }
        }
        L14: {
          L15: {
            L16: {
              ((cn) this).field_k = ((cn) this).field_l * 64;
              var6 = -((cn) this).field_z + ((cn) this).field_k;
              var7 = 4;
              if (0 >= var6) {
                break L16;
              } else {
                if (-129 < (var6 ^ -1)) {
                  break L15;
                } else {
                  break L16;
                }
              }
            }
            L17: {
              if (-128 <= var6) {
                break L17;
              } else {
                if (var6 <= -256) {
                  break L17;
                } else {
                  break L15;
                }
              }
            }
            if (((cn) this).field_k != ((cn) this).field_z) {
              if (16 <= var6 * var6) {
                ((cn) this).field_z = ((cn) this).field_z - var7 & 255;
                break L14;
              } else {
                ((cn) this).field_z = ((cn) this).field_k;
                break L14;
              }
            } else {
              break L14;
            }
          }
          ((cn) this).field_z = 255 & var7 + ((cn) this).field_z;
          break L14;
        }
    }

    cn() {
        ((cn) this).field_i = 0;
        ((cn) this).field_x = 0;
        ((cn) this).field_u = 0;
        ((cn) this).field_k = 0;
        ((cn) this).field_e = new int[12];
        ((cn) this).field_t = 550;
        ((cn) this).field_p = 3;
        ((cn) this).field_B = 720;
        ((cn) this).field_w = 275;
        ((cn) this).field_d = 428;
        ((cn) this).field_z = 125;
        ((cn) this).field_c = 255;
        ((cn) this).field_t = 550;
        ((cn) this).field_m = 720;
    }

    static {
    }
}
