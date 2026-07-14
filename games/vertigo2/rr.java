/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rr extends ji {
    static String field_A;
    static boolean[] field_z;
    static boolean field_C;
    static short[] field_D;
    static String field_y;
    static ra[] field_B;

    public rr() {
        super(1, false);
    }

    final static String a(int param0, CharSequence param1) {
        int var2 = 0;
        char[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        L0: {
          var6 = Vertigo2.field_L ? 1 : 0;
          var2 = param1.length();
          if (-21 <= (var2 ^ -1)) {
            break L0;
          } else {
            var2 = 20;
            break L0;
          }
        }
        L1: {
          var8 = new char[var2];
          var7 = var8;
          var3 = var7;
          if (param0 < -74) {
            break L1;
          } else {
            field_D = null;
            break L1;
          }
        }
        var4 = 0;
        L2: while (true) {
          if (var4 >= var2) {
            return new String(var8);
          } else {
            L3: {
              var5 = param1.charAt(var4);
              if (65 > var5) {
                break L3;
              } else {
                if (90 < var5) {
                  break L3;
                } else {
                  var3[var4] = (char)(var5 + -65 - -97);
                  var4++;
                  continue L2;
                }
              }
            }
            L4: {
              L5: {
                if (var5 < 97) {
                  break L5;
                } else {
                  if (var5 <= 122) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (48 > var5) {
                  break L6;
                } else {
                  if (var5 > 57) {
                    break L6;
                  } else {
                    break L4;
                  }
                }
              }
              var3[var4] = (char)95;
              var4++;
              continue L2;
            }
            var3[var4] = (char)var5;
            var4++;
            continue L2;
          }
        }
    }

    private final void d(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        float var6 = 0.0f;
        int var7 = 0;
        L0: {
          L1: {
            var7 = Vertigo2.field_L ? 1 : 0;
            var4 = rh.field_O[param1];
            var5 = lf.field_y[param2];
            var6 = (float)Math.atan2((double)(-2048 + var4), (double)(var5 - param0));
            if ((double)var6 < -3.141592653589793) {
              break L1;
            } else {
              if ((double)var6 <= -2.356194490192345) {
                tn.field_j = param1;
                bh.field_c = param2;
                break L0;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if ((double)var6 > -1.5707963267948966) {
              break L2;
            } else {
              if (-2.356194490192345 <= (double)var6) {
                bh.field_c = param1;
                tn.field_j = param2;
                break L0;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (-0.7853981633974483 < (double)var6) {
              break L3;
            } else {
              if (-1.5707963267948966 > (double)var6) {
                break L3;
              } else {
                tn.field_j = we.field_M + -param2;
                bh.field_c = param1;
                break L0;
              }
            }
          }
          L4: {
            if (0.0f < var6) {
              break L4;
            } else {
              if ((double)var6 >= -0.7853981633974483) {
                tn.field_j = param1;
                bh.field_c = aa.field_Vb + -param2;
                break L0;
              } else {
                break L4;
              }
            }
          }
          L5: {
            if (var6 < 0.0f) {
              break L5;
            } else {
              if (0.7853981633974483 >= (double)var6) {
                bh.field_c = aa.field_Vb - param2;
                tn.field_j = -param1 + we.field_M;
                break L0;
              } else {
                break L5;
              }
            }
          }
          L6: {
            if ((double)var6 < 0.7853981633974483) {
              break L6;
            } else {
              if ((double)var6 > 1.5707963267948966) {
                break L6;
              } else {
                tn.field_j = we.field_M - param2;
                bh.field_c = -param1 + aa.field_Vb;
                break L0;
              }
            }
          }
          if ((double)var6 < 1.5707963267948966) {
            if (2.356194490192345 <= (double)var6) {
              if ((double)var6 > 3.141592653589793) {
                break L0;
              } else {
                tn.field_j = we.field_M + -param1;
                bh.field_c = param2;
                break L0;
              }
            } else {
              if (2.356194490192345 > (double)var6) {
                break L0;
              } else {
                if ((double)var6 > 3.141592653589793) {
                  break L0;
                } else {
                  tn.field_j = we.field_M + -param1;
                  bh.field_c = param2;
                  break L0;
                }
              }
            }
          } else {
            if (2.356194490192345 > (double)var6) {
              break L0;
            } else {
              if ((double)var6 > 3.141592653589793) {
                break L0;
              } else {
                tn.field_j = we.field_M + -param1;
                bh.field_c = param2;
                break L0;
              }
            }
          }
        }
        tn.field_j = tn.field_j & rm.field_z;
        bh.field_c = bh.field_c & fk.field_x;
    }

    public static void b(byte param0) {
        field_z = null;
        field_A = null;
        field_B = null;
        field_y = null;
        field_D = null;
        int var1 = 82 % ((-3 - param0) / 49);
    }

    final void a(byte param0, int param1, ed param2) {
        if (!(0 != param1)) {
            ((rr) this).field_o = param2.h(-11) == 1 ? true : false;
        }
        if (param0 != 110) {
            Object var5 = null;
            ((rr) this).a((byte) -97, 81, (ed) null);
        }
    }

    final int[] c(int param0, int param1) {
        int var4 = 0;
        int[] var5 = null;
        int var6 = Vertigo2.field_L ? 1 : 0;
        int[] var7 = ((rr) this).field_x.a(param0, (byte) 103);
        int[] var3 = var7;
        if (param1 <= 91) {
            int[][] discarded$0 = ((rr) this).b(58, 20);
        }
        if (!(!((rr) this).field_x.field_i)) {
            for (var4 = 0; var4 < we.field_M; var4++) {
                this.d(2048, var4, param0);
                var5 = ((rr) this).a(0, -1, bh.field_c);
                var7[var4] = var5[tn.field_j];
            }
        }
        return var3;
    }

    final int[][] b(int param0, int param1) {
        int[] var4 = null;
        int[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        int[][] var14 = null;
        int var9 = Vertigo2.field_L ? 1 : 0;
        if (param0 != -3780) {
            rr.b((byte) -10);
        }
        int[][] var13 = ((rr) this).field_v.a(param1, param0 ^ 3778);
        int[][] var11 = var13;
        int[][] var10 = var11;
        int[][] var3 = var10;
        if (!(!((rr) this).field_v.field_c)) {
            var4 = var13[0];
            var5 = var13[1];
            var6 = var13[2];
            for (var7 = 0; var7 < we.field_M; var7++) {
                this.d(param0 ^ -1732, var7, param1);
                var14 = ((rr) this).c(0, param0 ^ -3777, bh.field_c);
                var4[var7] = var14[0][tn.field_j];
                var5[var7] = var14[1][tn.field_j];
                var6[var7] = var14[2][tn.field_j];
            }
        }
        return var10;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Rankings";
        field_D = new short[4096];
        field_y = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_C = true;
        field_B = new ra[3];
        field_z = new boolean[field_B.length];
    }
}
