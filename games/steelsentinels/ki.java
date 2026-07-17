/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ki extends ac {
    static String field_pb;
    private String field_jb;
    private String field_qb;
    static boolean field_ib;
    private boolean field_nb;
    private boolean field_lb;
    static String field_kb;
    private bk field_mb;
    static String field_ob;

    final static int[] b(int param0, byte param1) {
        int[] var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5_int = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        int[] var16 = null;
        int[] var17 = null;
        var7 = SteelSentinels.field_G;
        var16 = nl.a(param0, (byte) 125);
        var14 = var16;
        var12 = var14;
        var10 = var12;
        var8 = var10;
        var2 = var8;
        if (var8 != null) {
          if (var16.length != 0) {
            L0: {
              var17 = new int[8];
              var15 = var17;
              var13 = var15;
              var11 = var13;
              var3 = var11;
              ii.a(var8, var16.length - 8, var3, 0, var17.length);
              var4 = 0;
              if (param1 <= -77) {
                break L0;
              } else {
                field_ib = true;
                break L0;
              }
            }
            var5_int = 0;
            L1: while (true) {
              if (var5_int >= var17.length) {
                var5 = new int[var4];
                var4 = 0;
                var9 = 0;
                var6 = var9;
                L2: while (true) {
                  if (var9 >= var17.length) {
                    return var5;
                  } else {
                    if (-1 != var17[var9]) {
                      int incrementValue$1 = var4;
                      var4++;
                      var5[incrementValue$1] = var17[var9];
                      var9++;
                      continue L2;
                    } else {
                      var9++;
                      continue L2;
                    }
                  }
                }
              } else {
                if (var17[var5_int] >= 0) {
                  var4++;
                  var6 = var5_int - -1;
                  L3: while (true) {
                    if (var6 < var17.length) {
                      if (var17[var5_int] == var17[var6]) {
                        var17[var6] = -1;
                        var6++;
                        continue L3;
                      } else {
                        var6++;
                        continue L3;
                      }
                    } else {
                      var5_int++;
                      continue L1;
                    }
                  }
                } else {
                  var5_int++;
                  continue L1;
                }
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final void m(int param0) {
        ((ki) this).field_mb.field_N = false;
        if (param0 != -13521) {
            Object var3 = null;
            ((ki) this).a(-17, true, (String) null, 0.5387943387031555f);
        }
        ((ki) this).field_lb = true;
    }

    final static long l(int param0) {
        return -oe.field_b + mm.a(115);
    }

    final void a(int param0, boolean param1, String param2, float param3) {
        try {
            if ((!param1 ? 1 : 0) == (((ki) this).field_nb ? 1 : 0)) {
                ((ki) this).field_nb = param1 ? true : false;
                if (((ki) this).field_nb) {
                    ((ki) this).field_mb.b(4210752, 8405024, 16711422);
                    ((ki) this).field_mb.field_N = true;
                } else {
                    ((ki) this).field_mb.b(4210752, 2113632, 16711422);
                    if (!(!((ki) this).field_lb)) {
                        ((ki) this).field_mb.field_N = false;
                    }
                }
            }
            ((ki) this).field_mb.field_I = (int)(param3 / 100.0f * 65536.0f);
            ((ki) this).field_qb = param2;
            int var5_int = 68 / ((param0 - 52) / 57);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ki.B(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 44 + param3 + 41);
        }
    }

    public static void l() {
        int var1 = 0;
        field_ob = null;
        field_pb = null;
        field_kb = null;
    }

    ki(ka param0, String param1) {
        super(param0, 300, 120);
        int var3_int = 0;
        try {
            ((ki) this).field_jb = param1;
            if (((ki) this).field_jb != null) {
                var3_int = gf.field_d.a(((ki) this).field_jb, 260, gf.field_d.field_G);
                ((ki) this).a((byte) 67, 300, 150 - -var3_int);
            }
            ((ki) this).field_mb = new bk(13, 50, 274, 30, 15, 2113632, 4210752);
            ((ki) this).field_lb = false;
            ((ki) this).field_mb.field_N = true;
            ((ki) this).field_nb = false;
            ((ki) this).a((lh) (Object) ((ki) this).field_mb, -110);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ki.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final static void a(byte param0, String[] param1) {
        try {
            if (!(null == da.field_b)) {
                da.field_b.field_S.a(true, param1);
            }
            if (null != nm.field_o) {
                nm.field_o.field_R.a(true, param1);
            }
            int var2_int = -30 / ((15 - param0) / 62);
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "ki.K(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    final void a(int param0, int param1, boolean param2) {
        super.a(param0, param1, param2);
        gf.field_d.a(((ki) this).field_qb, param0 + (((ki) this).field_x >> 1), 103 + param1, 16777215, -1);
        if (!(null == ((ki) this).field_jb)) {
            pb.g(20 + param0, -7 + param1 - -120, 260, 8421504);
            int discarded$0 = gf.field_d.a(((ki) this).field_jb, 20 + param0, 128 + param1, 260, 100, 16777215, -1, 1, 0, gf.field_d.field_G);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_kb = "Click";
        field_ob = "Public chat is unavailable while setting up a rated game.";
        field_pb = "<%1> was too close to a rocket intercepted by <%0>";
    }
}
