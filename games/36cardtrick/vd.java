/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vd extends he {
    static cc field_q;
    static volatile int field_s;
    private int[][] field_v;
    private int[] field_t;
    private String[] field_o;
    int[] field_m;
    static ee field_p;
    static byte[][] field_r;
    static volatile boolean field_w;
    static String field_l;
    static String field_k;
    static int field_u;
    static String field_n;

    private final void a(int param0, pb param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        de var8 = null;
        int var9 = 0;
        int var10 = 0;
        L0: {
          var10 = Main.field_T;
          var4 = -30 % ((param2 - 34) / 63);
          if (1 != param0) {
            if (-3 == param0) {
              var5 = param1.f(29);
              ((vd) this).field_m = new int[var5];
              var6 = 0;
              L1: while (true) {
                if (var6 >= var5) {
                  break L0;
                } else {
                  ((vd) this).field_m[var6] = param1.d((byte) 72);
                  var6++;
                  continue L1;
                }
              }
            } else {
              if (-4 != param0) {
                if ((param0 ^ -1) == -5) {
                  break L0;
                } else {
                  break L0;
                }
              } else {
                var5 = param1.f(-96);
                ((vd) this).field_v = new int[var5][];
                ((vd) this).field_t = new int[var5];
                var6 = 0;
                L2: while (true) {
                  if (var5 <= var6) {
                    break L0;
                  } else {
                    var7 = param1.d((byte) 72);
                    var8 = p.a(-1, var7);
                    if (var8 != null) {
                      ((vd) this).field_t[var6] = var7;
                      ((vd) this).field_v[var6] = new int[((de) var8).field_d];
                      var9 = 0;
                      L3: while (true) {
                        if (((de) var8).field_d > var9) {
                          ((vd) this).field_v[var6][var9] = param1.d((byte) 72);
                          var9++;
                          continue L3;
                        } else {
                          var6++;
                          continue L2;
                        }
                      }
                    } else {
                      var6++;
                      continue L2;
                    }
                  }
                }
              }
            }
          } else {
            ((vd) this).field_o = rh.a('<', param1.c(false), -124);
            break L0;
          }
        }
    }

    final static void a(int param0, int param1) {
        try {
            try {
                Object discarded$0 = vh.a(new Object[1], "resizing", (byte) 115, mk.g(-123));
            } catch (Throwable throwable) {
            }
            if (param1 != -1) {
                field_w = true;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, boolean param2, long param3, int param4, int param5, String param6, int param7, int param8, int param9, int param10, int param11, le param12, boolean param13) {
        try {
            rd.field_j = new w(param11);
            na.field_r = new w(param7);
            hj.field_l = param8;
            ag.field_e = param10;
            ag.field_d = param4;
            nf.field_c = param0;
            td.field_b = param12;
            mk.field_k = param6;
            wk.field_d = param3;
            kh.field_g = param9;
            bj.field_m = param2 ? true : false;
            dg.field_F = param13 ? true : false;
            kj.field_t = param1;
            if (param5 < 44) {
                vd.e(65);
            }
            if (!(null == td.field_b.field_x)) {
                try {
                    e.field_e = new tk(td.field_b.field_x, 64, 0);
                } catch (IOException iOException) {
                    throw new RuntimeException(iOException.toString());
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(byte param0, pb param1) {
        int var3 = 0;
        int var4 = 0;
        le var5 = null;
        var4 = Main.field_T;
        L0: while (true) {
          var3 = param1.f(91);
          if (0 != var3) {
            this.a(var3, param1, (byte) 117);
            continue L0;
          } else {
            L1: {
              if (param0 >= 29) {
                break L1;
              } else {
                var5 = (le) null;
                vd.a(73, -78, true, -52L, -55, -9, (String) null, -34, -78, -25, -16, 3, (le) null, false);
                break L1;
              }
            }
            return;
          }
        }
    }

    final String b(byte param0) {
        int var3 = 0;
        int var4 = Main.field_T;
        StringBuilder var5 = new StringBuilder(80);
        StringBuilder var2 = var5;
        if (param0 != 28) {
            return (String) null;
        }
        if (!(((vd) this).field_o != null)) {
            return "";
        }
        StringBuilder discarded$0 = var5.append(((vd) this).field_o[0]);
        for (var3 = 1; var3 < ((vd) this).field_o.length; var3++) {
            StringBuilder discarded$1 = var2.append("...");
            StringBuilder discarded$2 = var5.append(((vd) this).field_o[var3]);
        }
        return var2.toString();
    }

    public static void e(int param0) {
        field_k = null;
        if (param0 <= 45) {
            return;
        }
        field_r = (byte[][]) null;
        field_p = null;
        field_n = null;
        field_q = null;
        field_l = null;
    }

    final void c(byte param0) {
        int var2 = 0;
        int var3 = Main.field_T;
        if (!(((vd) this).field_m == null)) {
            for (var2 = 0; var2 < ((vd) this).field_m.length; var2++) {
                ((vd) this).field_m[var2] = fj.a(((vd) this).field_m[var2], 32768);
            }
        }
        var2 = -85 % ((param0 - 62) / 63);
    }

    vd() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = -1;
        field_q = new cc();
        field_l = "Player";
        field_w = false;
        field_n = "Not yet achieved";
        field_u = -1;
        field_k = "Name is available";
    }
}
