/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wp extends ms {
    private byte[][] field_x;
    static int[][] field_H;
    static int[] field_w;
    private int field_C;
    static int[] field_D;
    static int field_E;
    static String field_y;
    static String field_I;
    static nt field_z;
    static String field_u;
    static String[] field_v;
    ht[] field_A;
    static String field_B;
    static String field_F;

    final boolean f(byte param0) {
        int var2;
        int var3_int;
        at var3;
        int var4;
        int var6;
        vh var8;
        int var9;
        Object var10;
        ig var11;
        int var12;
        int var13;
        vh var16;
        int[] var27;
        byte[] var28;
        int[] var29;
        byte[] var30;
        L0: {
          var12 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 == -65) {
            break L0;
          } else {
            field_v = (String[]) null;
            break L0;
          }
        }
        if (null == this.field_A) {
          L1: {
            if (this.field_x != null) {
              break L1;
            } else {
              if (!jj.field_c.a(11894, this.field_C)) {
                return false;
              } else {
                var27 = jj.field_c.b(-26, this.field_C);
                this.field_x = new byte[var27.length][];
                var3_int = 0;
                L2: while (true) {
                  if (var27.length <= var3_int) {
                    break L1;
                  } else {
                    this.field_x[var3_int] = jj.field_c.a((byte) 114, var27[var3_int], this.field_C);
                    var3_int++;
                    continue L2;
                  }
                }
              }
            }
          }
          var2 = 1;
          var13 = 0;
          var3_int = var13;
          L3: while (true) {
            if (var13 >= this.field_x.length) {
              if (var2 != 0) {
                var3 = new at();
                var4 = jj.field_c.d(this.field_C, param0 ^ 65);
                this.field_A = new ht[var4];
                var29 = jj.field_c.b(-92, this.field_C);
                var6 = 0;
                L4: while (true) {
                  if (var6 >= var29.length) {
                    this.field_x = (byte[][]) null;
                    return true;
                  } else {
                    var30 = this.field_x[var6];
                    var8 = new vh(var30);
                    var8.field_q = 1;
                    var9 = var8.e((byte) -104);
                    var10 = null;
                    var11 = (ig) ((Object) var3.e((byte) 124));
                    L5: while (true) {
                      L6: {
                        if (var11 == null) {
                          break L6;
                        } else {
                          if ((var11.field_k ^ -1) != (var9 ^ -1)) {
                            var11 = (ig) ((Object) var3.a((byte) 123));
                            continue L5;
                          } else {
                            var10 = var11;
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (var10 == null) {
                          var10 = new ig(var9, up.field_e.c(var9, (byte) 81));
                          var3.a((byte) -119, (tc) (var10));
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      this.field_A[var29[var6]] = new ht(var30, (ig) (var10));
                      var6++;
                      continue L4;
                    }
                  }
                }
              } else {
                return false;
              }
            } else {
              var28 = this.field_x[var13];
              var16 = new vh(var28);
              var16.field_q = 1;
              var6 = var16.e((byte) -104);
              var2 = var2 != 0 & up.field_e.a(var6, (byte) -56) ? 1 : 0;
              var13++;
              continue L3;
            }
          }
        } else {
          return true;
        }
    }

    wp(int param0) {
        this.field_C = param0;
    }

    final static void d(byte param0) {
        if (param0 != -13) {
            wp.d((byte) 11);
        }
    }

    public static void e(byte param0) {
        field_z = null;
        field_H = (int[][]) null;
        if (param0 >= -54) {
            field_B = (String) null;
        }
        field_F = null;
        field_y = null;
        field_v = null;
        field_B = null;
        field_w = null;
        field_u = null;
        field_D = null;
        field_I = null;
    }

    static {
        field_y = "Remove friend";
        field_I = "Full";
        field_E = 4;
        field_H = new int[][]{new int[]{0, 2, 1, 3, 5, 6, 7, 74, 4}, new int[]{10, 8, 9, 16, 12, 11, 15, 13, 14, 17, 18}, new int[]{19, 20, 21, 25, 23, 22, 26, 27, 24, 28, 29}, new int[]{31, 32, 33, 36, 30, 34, 38, 35, 37, 39, 40}, new int[]{42, 41, 47, 48, 46, 44, 43, 45, 49, 50, 51}, new int[]{52, 53, 54, 55, 57, 59, 61, 58, 60, 56, 62}, new int[]{64, 68, 70, 67, 66, 69, 65, 71, 72, 63, 73}};
        field_D = new int[]{2, 17, 18, 36, 37, 38, 6, 5, 13};
        field_z = null;
        field_u = "Match by...";
        field_B = "PER MONTH";
        field_F = "Portal";
    }
}
