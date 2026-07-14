/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sta extends rva {
    private int[] field_F;
    private int field_x;
    int field_E;
    private int field_D;
    static String field_G;
    static String field_A;
    private int[] field_C;
    private int[] field_I;
    static nh[] field_y;
    static String field_H;
    static int field_B;
    private int field_z;

    final void a(byte param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        ae var5 = null;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        var2 = 0;
        var3 = 0;
        L0: while (true) {
          L1: {
            if (var2 >= ((sta) this).field_w.length) {
              break L1;
            } else {
              if (var3 >= ((sta) this).field_F.length) {
                break L1;
              } else {
                var4 = 0;
                L2: while (true) {
                  if (var2 < ((sta) this).field_w.length) {
                    if (((sta) this).field_C.length > var4) {
                      var2++;
                      var5 = ((sta) this).field_w[var2];
                      if (var5 != null) {
                        this.a(var3, var5, var4, (byte) 85);
                        var4++;
                        continue L2;
                      } else {
                        var4++;
                        continue L2;
                      }
                    } else {
                      var3++;
                      continue L0;
                    }
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              }
            }
          }
          L3: {
            if (param0 == 88) {
              break L3;
            } else {
              ((sta) this).field_F = null;
              break L3;
            }
          }
          return;
        }
    }

    private final void a(int param0, ae param1, int param2, byte param3) {
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
        Object var21 = null;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        L0: {
          var20 = TombRacer.field_G ? 1 : 0;
          var5 = ((sta) this).field_C[((sta) this).field_C.length - 1];
          var6 = ((sta) this).field_F[((sta) this).field_F.length + -1];
          if (-1 <= (param2 ^ -1)) {
            stackOut_2_0 = 0;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = ((sta) this).field_C[-1 + param2];
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var7 = stackIn_3_0 * ((sta) this).field_m / var5;
          if (param0 > 0) {
            stackOut_5_0 = ((sta) this).field_F[param0 - 1];
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = 0;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var8 = stackIn_6_0 * ((sta) this).field_p / var6;
          var9 = ((sta) this).field_m * ((sta) this).field_C[param2] / var5;
          var10 = ((sta) this).field_F[param0] * ((sta) this).field_p / var6;
          var11 = param2 + param0 * ((sta) this).field_C.length;
          var12 = ((sta) this).field_I[var11] & 48;
          var13 = 192 & ((sta) this).field_I[var11];
          if (param3 == 85) {
            break L2;
          } else {
            var21 = null;
            this.a((int[]) null, -46);
            break L2;
          }
        }
        L3: {
          L4: {
            var14 = param1.field_i;
            var15 = param1.field_n;
            var16 = param1.field_m;
            if (var9 + -var7 <= var16) {
              break L4;
            } else {
              if (0 == (1 & ((sta) this).field_I[var11])) {
                break L4;
              } else {
                var14 = var7;
                var16 = var9 - var7;
                break L3;
              }
            }
          }
          L5: {
            if (var16 <= var9 + -var7) {
              break L5;
            } else {
              if (-1 == (4 & ((sta) this).field_I[var11] ^ -1)) {
                break L5;
              } else {
                var14 = var7;
                var16 = -var7 + var9;
                break L3;
              }
            }
          }
          if (var12 != 16) {
            if (var12 != 32) {
              var14 = var7;
              break L3;
            } else {
              var14 = -var16 + var9;
              break L3;
            }
          } else {
            var14 = -var16 + var7 - -var9 >> 1962241089;
            break L3;
          }
        }
        L6: {
          L7: {
            var17 = param1.field_p;
            if (-var8 + var10 <= var17) {
              break L7;
            } else {
              if (0 == (2 & ((sta) this).field_I[var11])) {
                break L7;
              } else {
                var15 = var8;
                var17 = var10 - var8;
                break L6;
              }
            }
          }
          L8: {
            if (var17 <= -var8 + var10) {
              break L8;
            } else {
              if ((((sta) this).field_I[var11] & 8) == -1) {
                break L8;
              } else {
                var17 = -var8 + var10;
                var15 = var8;
                break L6;
              }
            }
          }
          if (-65 != var13) {
            if (128 != var13) {
              var15 = var8;
              break L6;
            } else {
              var15 = -var17 + var10;
              break L6;
            }
          } else {
            var15 = var10 + (var8 - var17) >> -2117289343;
            break L6;
          }
        }
        var18 = ((sta) this).field_z;
        var19 = ((sta) this).field_x;
        param1.a((byte) -31, var16 - var18 * 2, -(2 * var19) + var17, var14 - -var18, var15 - -var19);
    }

    public static void h(byte param0) {
        if (param0 >= -35) {
            return;
        }
        field_A = null;
        field_G = null;
        field_H = null;
        field_y = null;
    }

    private final void d(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = TombRacer.field_G ? 1 : 0;
        int var4 = null != ((sta) this).field_F ? ((sta) this).field_F.length : 0;
        int[] var5 = new int[param2 * var4];
        if (null != ((sta) this).field_I) {
            if (((sta) this).field_I.length < -1) {
                if (-1 < var5.length) {
                    if (-1 > (param0 ^ -1)) {
                        for (var6 = 0; var4 > var6; var6++) {
                            lua.a(((sta) this).field_I, var6 * param0, var5, var6 * param2, Math.min(param0, param2));
                        }
                    }
                }
            }
        }
        ((sta) this).field_I = var5;
        if (param1 >= -100) {
            field_H = null;
        }
    }

    final void a(int param0, int param1, byte param2) {
        if (param2 != 97) {
            return;
        }
        ((sta) this).field_z = param1;
        ((sta) this).field_x = param0;
    }

    private final void f(int param0, int param1, int param2) {
        int var4 = ((sta) this).field_C != null ? ((sta) this).field_C.length : 0;
        if (param0 != 28705) {
            Object var6 = null;
            ((sta) this).b(9, (ae) null, 31);
        }
        int[] var5 = new int[var4 * param2];
        if (((sta) this).field_I != null) {
            if (0 < ((sta) this).field_I.length) {
                if (-1 > var5.length) {
                    if (-1 < param1) {
                        lua.a(((sta) this).field_I, 0, var5, 0, Math.min(param1, param2) * var4);
                    }
                }
            }
        }
        ((sta) this).field_I = var5;
    }

    private final void c(int param0, int param1, int param2) {
        int var4 = null == ((sta) this).field_C ? 0 : ((sta) this).field_C.length;
        ae[] var5 = new ae[var4 * param0];
        if (null != ((sta) this).field_w) {
            if (-1 > (((sta) this).field_w.length ^ -1)) {
                if ((var5.length ^ -1) < -1) {
                    if (!(param1 <= 0)) {
                        lua.a((Object[]) (Object) ((sta) this).field_w, 0, (Object[]) (Object) var5, 0, var4 * Math.min(param1, param0));
                    }
                }
            }
        }
        if (param2 != 0) {
            return;
        }
        ((sta) this).field_w = var5;
    }

    final boolean a(char param0, ae param1, int param2, boolean param3) {
        int var5 = 0;
        int var6 = 0;
        var6 = TombRacer.field_G ? 1 : 0;
        if (!super.a(param0, param1, param2, param3)) {
          var5 = param2;
          if (-99 != (var5 ^ -1)) {
            if ((var5 ^ -1) != -100) {
              if (96 == var5) {
                return ((sta) this).a(param1, 1);
              } else {
                if (var5 != 97) {
                  return false;
                } else {
                  return ((sta) this).a((byte) 43, param1);
                }
              }
            } else {
              return ((sta) this).a(((sta) this).field_C.length, param1, 0);
            }
          } else {
            return ((sta) this).a(param1, (byte) -14, ((sta) this).field_C.length);
          }
        } else {
          return true;
        }
    }

    final void b(int param0, ae param1, int param2) {
        if (param0 != 0) {
            ((sta) this).field_E = 89;
        }
        int var4 = ((sta) this).field_D % ((sta) this).field_C.length;
        int var5 = ((sta) this).field_D / ((sta) this).field_C.length;
        ((sta) this).field_I[((sta) this).field_D] = param2;
        ((sta) this).field_w[((sta) this).field_D] = param1;
        if (!(param1 == null)) {
            this.a(var5, param1, var4, (byte) 85);
        }
        ((sta) this).field_D = ((sta) this).field_D + 1;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, ae param5, int param6) {
        if (param0 <= 70) {
            field_B = -13;
        }
        return super.a(89, param1, param2, param3, param4, param5, param6);
    }

    final static boolean g(byte param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        L0: {
          if (param0 == 97) {
            break L0;
          } else {
            field_G = null;
            break L0;
          }
        }
        L1: {
          L2: {
            if (wba.field_o == null) {
              break L2;
            } else {
              if (!wba.field_o.a((byte) -127)) {
                break L2;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
          }
          stackOut_5_0 = 0;
          stackIn_6_0 = stackOut_5_0;
          break L1;
        }
        return stackIn_6_0 != 0;
    }

    private final void e(int param0, int param1, int param2) {
        int var6 = 0;
        int var7 = TombRacer.field_G ? 1 : 0;
        int var4 = ((sta) this).field_F != null ? ((sta) this).field_F.length : 0;
        ae[] var5 = new ae[param0 * var4];
        if (param2 != 192) {
            ((sta) this).field_F = null;
        }
        if (null != ((sta) this).field_w) {
            if (-1 > ((sta) this).field_w.length) {
                if (-1 < var5.length) {
                    if (!(param1 <= 0)) {
                        for (var6 = 0; var4 > var6; var6++) {
                            lua.a((Object[]) (Object) ((sta) this).field_w, param1 * var6, (Object[]) (Object) var5, param0 * var6, Math.min(param1, param0));
                        }
                    }
                }
            }
        }
        ((sta) this).field_w = var5;
    }

    sta(int param0, int param1, int param2, int param3, isa param4, int param5, int param6) {
        super(param0, param1, param2, param3, param4);
        ((sta) this).field_D = 0;
        ((sta) this).field_E = 92;
        int[] var10 = new int[param5];
        int[] var8 = var10;
        lua.a(var10, 0, param5, 1);
        int[] var9 = new int[param6];
        lua.a(var9, 0, param6, 1);
        this.a(var10, (byte) -97);
        this.a(var9, 48);
    }

    private final void a(int[] param0, byte param1) {
        int var8 = TombRacer.field_G ? 1 : 0;
        int var3 = ((sta) this).field_C == null ? 0 : ((sta) this).field_C.length;
        int var4 = param0.length;
        ((sta) this).field_C = param0;
        int[] var5 = param0;
        int var6 = 0;
        int var7 = 0;
        while (var6 < var5.length) {
            var7 = var7 + var5[var6];
            var5[var6] = var7 + var5[var6];
            var6++;
        }
        var6 = -21 / ((-43 - param1) / 50);
        this.e(var4, var3, 192);
        this.d(var3, -110, var4);
    }

    private final void a(int[] param0, int param1) {
        int var8 = TombRacer.field_G ? 1 : 0;
        int var3 = null == ((sta) this).field_F ? 0 : ((sta) this).field_F.length;
        int var4 = param0.length;
        ((sta) this).field_F = param0;
        int[] var5 = param0;
        if (param1 != 48) {
            field_G = null;
        }
        int var6 = 0;
        int var7 = 0;
        while (var6 < var5.length) {
            var7 = var7 + var5[var6];
            var5[var6] = var7 + var5[var6];
            var6++;
        }
        this.c(var4, var3, 0);
        this.f(param1 + 28657, var3, var4);
    }

    final void a(byte param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "This option cannot be combined with the current settings for:  ";
        field_B = 0;
        field_A = "Some players haven't unlocked the currently selected game options.<br>Please view the '<%0>' tab on the left for details.";
        field_H = "Mazes";
    }
}
