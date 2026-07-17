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
        int var2 = 0;
        int var3_int = 0;
        at var3 = null;
        int var4 = 0;
        int var6 = 0;
        vh var8 = null;
        int var9 = 0;
        Object var10 = null;
        ig var11 = null;
        int var12 = 0;
        int var13 = 0;
        vh var16 = null;
        int[] var27 = null;
        byte[] var28 = null;
        int[] var29 = null;
        byte[] var30 = null;
        L0: {
          var12 = ArmiesOfGielinor.field_M ? 1 : 0;
          if (param0 == -65) {
            break L0;
          } else {
            field_v = null;
            break L0;
          }
        }
        if (null == ((wp) this).field_A) {
          L1: {
            if (((wp) this).field_x != null) {
              break L1;
            } else {
              if (!jj.field_c.a(11894, ((wp) this).field_C)) {
                return false;
              } else {
                var27 = jj.field_c.b(-26, ((wp) this).field_C);
                ((wp) this).field_x = new byte[var27.length][];
                var3_int = 0;
                L2: while (true) {
                  if (var27.length <= var3_int) {
                    break L1;
                  } else {
                    ((wp) this).field_x[var3_int] = jj.field_c.a((byte) 114, var27[var3_int], ((wp) this).field_C);
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
            if (var13 >= ((wp) this).field_x.length) {
              if (var2 != 0) {
                var3 = new at();
                var4 = jj.field_c.d(((wp) this).field_C, param0 ^ 65);
                ((wp) this).field_A = new ht[var4];
                var29 = jj.field_c.b(-92, ((wp) this).field_C);
                var6 = 0;
                L4: while (true) {
                  if (var6 >= var29.length) {
                    ((wp) this).field_x = null;
                    return true;
                  } else {
                    var30 = ((wp) this).field_x[var6];
                    var8 = new vh(var30);
                    var8.field_q = 1;
                    var9 = var8.e((byte) -104);
                    var10 = null;
                    var11 = (ig) (Object) var3.e((byte) 124);
                    L5: while (true) {
                      L6: {
                        if (var11 == null) {
                          break L6;
                        } else {
                          if (var11.field_k != var9) {
                            var11 = (ig) (Object) var3.a((byte) 123);
                            continue L5;
                          } else {
                            var10 = (Object) (Object) var11;
                            break L6;
                          }
                        }
                      }
                      L7: {
                        if (var10 == null) {
                          var10 = (Object) (Object) new ig(var9, up.field_e.c(var9, (byte) 81));
                          var3.a((byte) -119, (tc) var10);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      ((wp) this).field_A[var29[var6]] = new ht(var30, (ig) var10);
                      var6++;
                      continue L4;
                    }
                  }
                }
              } else {
                return false;
              }
            } else {
              var28 = ((wp) this).field_x[var13];
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
        ((wp) this).field_C = param0;
    }

    final static void d(byte param0) {
        if (param0 != -13) {
            wp.d((byte) 11);
        }
    }

    public static void e() {
        field_z = null;
        field_H = null;
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_y = "Remove friend";
        field_I = "Full";
        field_E = 4;
        field_H = new int[][]{new int[9], new int[11], new int[11], new int[11], new int[11], new int[11], new int[11]};
        field_D = new int[]{2, 17, 18, 36, 37, 38, 6, 5, 13};
        field_z = null;
        field_u = "Match by...";
        field_B = "PER MONTH";
        field_F = "Portal";
    }
}
