/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class hg {
    static b field_b;
    static int[] field_a;

    final static void b(int param0) {
        if (!(null == e.field_S)) {
            e.field_S.e((byte) -36);
        }
        if (!(vi.field_c == null)) {
            vi.field_c.m(-31361);
        }
        if (param0 != 31431) {
            return;
        }
        jk.b(0);
    }

    final static void a(byte param0) {
        int var4 = 0;
        int var5 = ZombieDawn.field_J;
        vn var1 = new vn(540, 140);
        ki.a((byte) -122, var1);
        en.c();
        bi.d();
        ej.field_x = 0;
        gk.j(30549);
        vn var2 = var1.e();
        int var3 = 1 / ((4 - param0) / 43);
        for (var4 = 0; -16 < (var4 ^ -1); var4++) {
            var2.h(-2, -2, 16777215);
            bi.h(4, 4, 0, 0, 540, 140);
        }
        wc.field_Pb.a();
        var1.d(0, 0);
        pa.a(-21189);
    }

    public static void a(int param0) {
        if (param0 != 140) {
            field_a = null;
        }
        field_b = null;
        field_a = null;
    }

    final static oh a(int param0, String param1) {
        CharSequence var7 = null;
        String var4_ref_String = null;
        int var5 = ZombieDawn.field_J;
        if (null == sf.field_j) {
            return null;
        }
        if (param1 == null) {
            return null;
        }
        if (0 == param1.length()) {
            return null;
        }
        CharSequence var6 = (CharSequence) (Object) param1;
        String var2 = fm.a(var6, -47);
        if (var2 == null) {
            return null;
        }
        oh var3 = (oh) (Object) sf.field_j.a(93, (long)var2.hashCode());
        while (var3 != null) {
            var7 = (CharSequence) (Object) var3.field_lb;
            var4_ref_String = fm.a(var7, -124);
            if (var4_ref_String.equals((Object) (Object) var2)) {
                return var3;
            }
            var3 = (oh) (Object) sf.field_j.b((byte) -113);
        }
        int var4 = -121 % ((60 - param0) / 32);
        return null;
    }

    final static vn a(int param0, int param1, dj param2, int param3) {
        if (param3 != -2) {
            return null;
        }
        if (!ph.a(param1, 31043, param0, param2)) {
            return null;
        }
        return em.i((byte) 72);
    }

    final static void c(int param0) {
        try {
            IOException iOException = null;
            int var1 = 0;
            IOException var2 = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            L0: {
              var3 = ZombieDawn.field_J;
              if (null == tf.field_c) {
                break L0;
              } else {
                tf.field_c.d(31239);
                break L0;
              }
            }
            L1: {
              if (he.field_d != null) {
                he.field_d.a(true);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param0 == 0) {
                break L2;
              } else {
                hg.c(-94);
                break L2;
              }
            }
            L3: {
              if (null != da.field_j) {
                try {
                  L4: {
                    da.field_j.b(463);
                    break L4;
                  }
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  L5: {
                    iOException = (IOException) (Object) decompiledCaughtException;
                    break L5;
                  }
                }
                break L3;
              } else {
                break L3;
              }
            }
            L6: {
              if (lg.field_v == null) {
                break L6;
              } else {
                var1 = 0;
                L7: while (true) {
                  if (var1 >= lg.field_v.length) {
                    break L6;
                  } else {
                    if (lg.field_v[var1] != null) {
                      try {
                        L8: {
                          lg.field_v[var1].b(463);
                          var1++;
                          break L8;
                        }
                      } catch (java.io.IOException decompiledCaughtParameter1) {
                        decompiledCaughtException = decompiledCaughtParameter1;
                        L9: {
                          var2 = (IOException) (Object) decompiledCaughtException;
                          var1++;
                          break L9;
                        }
                      }
                      continue L7;
                    } else {
                      var1++;
                      continue L7;
                    }
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[16];
    }
}
