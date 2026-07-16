/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef extends am {
    private int field_o;
    static String field_p;
    static String field_n;
    private byte[][] field_r;
    static String field_s;
    db[] field_q;

    public static void h(byte param0) {
        int var1 = 35 % ((-83 - param0) / 36);
        field_p = null;
        field_s = null;
        field_n = null;
    }

    final static boolean a(CharSequence param0, int param1) {
        int var2 = 0;
        int var3 = Kickabout.field_G;
        if (!(hw.a(param0, -26200, true))) {
            return false;
        }
        if (param1 != -9907) {
            field_n = null;
        }
        for (var2 = 0; param0.length() > var2; var2++) {
            if (!ws.a(param0.charAt(var2), (byte) 121)) {
                return false;
            }
        }
        return true;
    }

    final boolean g(byte param0) {
        int var2 = 0;
        int[] var2_ref_int__ = null;
        int var3_int = 0;
        tf var3 = null;
        int var4 = 0;
        iw var5_ref_iw = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        iw var9 = null;
        int var10 = 0;
        Object var11 = null;
        je var12 = null;
        int var13 = 0;
        int[] var14 = null;
        je var15 = null;
        int var16 = 0;
        int[] var17 = null;
        int[] var21 = null;
        int[] var25 = null;
        int[] var29 = null;
        byte[] var30 = null;
        int[] var31 = null;
        byte[] var32 = null;
        var13 = Kickabout.field_G;
        if (((ef) this).field_q == null) {
          L0: {
            if (null == ((ef) this).field_r) {
              if (!gd.field_c.b((byte) 20, ((ef) this).field_o)) {
                return false;
              } else {
                var29 = gd.field_c.c(((ef) this).field_o, 4);
                var25 = var29;
                var21 = var25;
                var17 = var21;
                var14 = var17;
                var2_ref_int__ = var14;
                ((ef) this).field_r = new byte[var29.length][];
                var3_int = 0;
                L1: while (true) {
                  if (var29.length <= var3_int) {
                    break L0;
                  } else {
                    ((ef) this).field_r[var3_int] = gd.field_c.b(((ef) this).field_o, -32669, var29[var3_int]);
                    var3_int++;
                    continue L1;
                  }
                }
              }
            } else {
              break L0;
            }
          }
          var2 = 1;
          var16 = 0;
          var3_int = var16;
          L2: while (true) {
            if (var16 >= ((ef) this).field_r.length) {
              if (var2 == 0) {
                return false;
              } else {
                var5 = 57 % ((param0 - 36) / 42);
                var3 = new tf();
                var4 = gd.field_c.a(true, ((ef) this).field_o);
                ((ef) this).field_q = new db[var4];
                var31 = gd.field_c.c(((ef) this).field_o, 4);
                var7 = 0;
                L3: while (true) {
                  if (var31.length <= var7) {
                    ((ef) this).field_r = null;
                    return true;
                  } else {
                    var32 = ((ef) this).field_r[var7];
                    var9 = new iw(var32);
                    var9.field_n = 1;
                    var10 = var9.a((byte) 81);
                    var11 = null;
                    var12 = (je) (Object) var3.g(24009);
                    L4: while (true) {
                      L5: {
                        if (var12 == null) {
                          break L5;
                        } else {
                          if (var12.field_l != var10) {
                            var12 = (je) (Object) var3.c(33);
                            continue L4;
                          } else {
                            var11 = (Object) (Object) var12;
                            break L5;
                          }
                        }
                      }
                      L6: {
                        if (var11 == null) {
                          var15 = new je(var10, gs.field_d.a(0, var10));
                          var11 = (Object) (Object) var15;
                          var3.a((gn) (Object) var15, 3);
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      ((ef) this).field_q[var31[var7]] = new db(var32, (je) var11);
                      var7++;
                      continue L3;
                    }
                  }
                }
              }
            } else {
              var30 = ((ef) this).field_r[var16];
              var5_ref_iw = new iw(var30);
              var5_ref_iw.field_n = 1;
              var6 = var5_ref_iw.a((byte) 81);
              var2 = var2 != 0 & gs.field_d.b(var6, 119) ? 1 : 0;
              var16++;
              continue L2;
            }
          }
        } else {
          return true;
        }
    }

    ef(int param0) {
        ((ef) this).field_o = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Insufficient funds!";
        field_p = "Show all game chat";
        field_s = "<%0> goes through <%1> for making more passes than <%2>";
    }
}
