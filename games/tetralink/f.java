/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f extends gb {
    static hl field_x;
    static String field_w;
    static String[] field_A;
    static String field_t;
    static int field_z;
    private int field_y;
    pc[] field_u;
    private byte[][] field_v;

    public static void c(byte param0) {
        field_A = null;
        field_w = null;
        if (param0 != 87) {
            field_w = null;
        }
        field_x = null;
        field_t = null;
    }

    final boolean b(byte param0) {
        int var2 = 0;
        int var3_int = 0;
        je var3 = null;
        int var4 = 0;
        int var6 = 0;
        bh var8 = null;
        int var9 = 0;
        oe var10 = null;
        oe var11 = null;
        int var12 = 0;
        int var13 = 0;
        bh var16 = null;
        int[] var27 = null;
        byte[] var28 = null;
        int[] var29 = null;
        byte[] var30 = null;
        var12 = TetraLink.field_J;
        if (null != ((f) this).field_u) {
          return true;
        } else {
          L0: {
            if (null == ((f) this).field_v) {
              if (lj.field_c.d(((f) this).field_y, 0)) {
                var27 = lj.field_c.c(((f) this).field_y, param0 ^ -106);
                ((f) this).field_v = new byte[var27.length][];
                var3_int = 0;
                L1: while (true) {
                  if (var3_int >= var27.length) {
                    break L0;
                  } else {
                    ((f) this).field_v[var3_int] = lj.field_c.a(-107, var27[var3_int], ((f) this).field_y);
                    var3_int++;
                    continue L1;
                  }
                }
              } else {
                return false;
              }
            } else {
              break L0;
            }
          }
          var2 = 1;
          var13 = 0;
          var3_int = var13;
          L2: while (true) {
            if (((f) this).field_v.length <= var13) {
              if (var2 != 0) {
                L3: {
                  var3 = new je();
                  var4 = lj.field_c.b(-23126, ((f) this).field_y);
                  ((f) this).field_u = new pc[var4];
                  if (param0 == -106) {
                    break L3;
                  } else {
                    field_z = -125;
                    break L3;
                  }
                }
                var29 = lj.field_c.c(((f) this).field_y, param0 ^ -106);
                var6 = 0;
                L4: while (true) {
                  if (var6 >= var29.length) {
                    ((f) this).field_v = null;
                    return true;
                  } else {
                    var30 = ((f) this).field_v[var6];
                    var8 = new bh(var30);
                    var8.field_t = 1;
                    var9 = var8.e(127);
                    var10 = null;
                    var11 = (oe) (Object) var3.c(false);
                    L5: while (true) {
                      L6: {
                        if (var11 == null) {
                          break L6;
                        } else {
                          if (var9 == var11.field_o) {
                            var10 = var11;
                            break L6;
                          } else {
                            var11 = (oe) (Object) var3.a((byte) -70);
                            continue L5;
                          }
                        }
                      }
                      L7: {
                        if (var10 == null) {
                          var10 = new oe(var9, nn.field_T.a(0, var9));
                          var3.a((mc) (Object) var10, false);
                          break L7;
                        } else {
                          break L7;
                        }
                      }
                      ((f) this).field_u[var29[var6]] = new pc(var30, var10);
                      var6++;
                      continue L4;
                    }
                  }
                }
              } else {
                return false;
              }
            } else {
              var28 = ((f) this).field_v[var13];
              var16 = new bh(var28);
              var16.field_t = 1;
              var6 = var16.e(param0 ^ -23);
              var2 = var2 != 0 & nn.field_T.f(var6, 88) ? 1 : 0;
              var13++;
              continue L2;
            }
          }
        }
    }

    f(int param0) {
        ((f) this).field_y = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_t = "Type your email address again to make sure it's correct";
        field_w = "Unable to add name - system busy";
    }
}
