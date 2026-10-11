/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hg {
    static java.awt.Frame field_c;
    static nk field_e;
    static int field_b;
    static String field_d;
    static ck field_a;

    final static void a(boolean param0, int param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = client.field_A ? 1 : 0;
        try {
          if (param0 ||
            null == cd.field_m) {
            dn.field_k = false;
          }
          if (param0) {
            if (0 < lg.field_W) {
              lg.field_W = lg.field_W - 1;
            } else {
              if (bf.field_r > 0) {
                bf.field_r = bf.field_r - 1;
              } else {
                if (tg.field_e > 0) {
                  tg.field_e = tg.field_e - 1;
                }
              }
            }
          } else {
            if (null == cd.field_m) {
              if (null == g.field_N) {
                dn.field_k = false;
                if (bf.field_r > 0) {
                  bf.field_r = bf.field_r - 1;
                } else {
                  if (tg.field_e > 0) {
                    tg.field_e = tg.field_e - 1;
                  } else {
                    if (dl.field_M > lg.field_W) {
                      if (lg.field_W == 0) {
                        tj.h((byte) -40);
                      }
                      lg.field_W = lg.field_W + 1;
                    }
                  }
                }
              } else {
                if (lg.field_W > 0) {
                  lg.field_W = lg.field_W - 1;
                } else {
                  if (tg.field_e > 0) {
                    tg.field_e = tg.field_e - 1;
                  } else {
                    if (dl.field_M > bf.field_r) {
                      if (0 == bf.field_r) {
                        mg.b(param1 + 1843, true);
                      }
                      bf.field_r = bf.field_r + 1;
                    }
                  }
                }
              }
            } else {
              if (0 < lg.field_W) {
                lg.field_W = lg.field_W - 1;
              } else {
                if (0 < bf.field_r) {
                  bf.field_r = bf.field_r - 1;
                } else {
                  if (tg.field_e < dl.field_M) {
                    if (tg.field_e == 0) {
                      mg.b(0, false);
                    }
                    tg.field_e = tg.field_e + 1;
                  }
                }
              }
            }
          }
          if (param1 == -1843) {
            return;
          }
          field_b = -111;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "hg.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$4 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int[] var7 = null;
        int var9 = 0;
        var9 = client.field_A ? 1 : 0;
        try {
          if (param0 < 59) {
            hg.a(true, -112);
          }
          if (null == gn.field_e ||
            !(gn.field_e.length > te.field_w)) {
            var6_int = te.field_w * 2;
            if (var6_int == 0) {
              var6_int = 80;
            }
            var7 = new int[var6_int];
            for (var8 = 0; te.field_w > var8; var8++) {
              var7[var8] = gn.field_e[var8];
            }
            gn.field_e = var7;
          }
          fieldTemp$0 = te.field_w;
          te.field_w = te.field_w + 1;
          gn.field_e[fieldTemp$0] = param2;
          fieldTemp$1 = te.field_w;
          te.field_w = te.field_w + 1;
          gn.field_e[fieldTemp$1] = param1;
          fieldTemp$2 = te.field_w;
          te.field_w = te.field_w + 1;
          gn.field_e[fieldTemp$2] = param5;
          fieldTemp$3 = te.field_w;
          te.field_w = te.field_w + 1;
          gn.field_e[fieldTemp$3] = param4;
          fieldTemp$4 = te.field_w;
          te.field_w = te.field_w + 1;
          gn.field_e[fieldTemp$4] = param3;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var6), "hg.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 <= 87) {
          return;
        }
        try {
          field_d = null;
          field_c = null;
          field_a = null;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "hg.A(" + param0 + ')');
        }
    }

    static {
        field_d = "Activating Special Items";
    }
}
