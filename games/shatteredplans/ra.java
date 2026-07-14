/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ra {
    private long field_h;
    static int[] field_f;
    static int[] field_a;
    static boolean[] field_i;
    static float field_e;
    private long field_b;
    static int field_g;
    static String field_c;
    static String field_j;
    static int field_k;
    private RandomAccessFile field_d;

    final int a(int param0, int param1, int param2, byte[] param3) throws IOException {
        int var5 = ((ra) this).field_d.read(param3, param1, param0);
        if (param2 < var5) {
            ((ra) this).field_h = ((ra) this).field_h + (long)var5;
        }
        return var5;
    }

    final static void a(boolean param0, int param1, ag[] param2) {
        int var3 = 0;
        int var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (param0) {
            field_g = -122;
        }
        for (var3 = 1; var3 < param1; var3++) {
            wl.a(var3, 46, param2);
        }
    }

    final long b(int param0) throws IOException {
        if (param0 != 3) {
            field_c = null;
        }
        return ((ra) this).field_d.length();
    }

    final void c(int param0) throws IOException {
        if (param0 != 10) {
            ra.a(-125, 93);
        }
        if (((ra) this).field_d != null) {
            ((ra) this).field_d.close();
            ((ra) this).field_d = null;
        }
    }

    final static void a(java.math.BigInteger param0, ob param1, int param2, int param3, java.math.BigInteger param4, byte[] param5, int param6) {
        int var7 = 0;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int[] var15 = null;
        L0: {
          var10 = ShatteredPlansClient.field_F ? 1 : 0;
          var7 = ef.a(param6, 57);
          if (ro.field_b == null) {
            ro.field_b = new java.security.SecureRandom();
            break L0;
          } else {
            break L0;
          }
        }
        var15 = new int[4];
        var14 = var15;
        var13 = var14;
        var12 = var13;
        var8 = var12;
        var9 = param3;
        L1: while (true) {
          if ((var9 ^ -1) <= -5) {
            L2: {
              L3: {
                if (null == ih.field_c) {
                  break L3;
                } else {
                  if (ih.field_c.field_h.length < var7) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              ih.field_c = new ob(var7);
              break L2;
            }
            L4: {
              L5: {
                ih.field_c.field_j = 0;
                ih.field_c.a(param2, param6, param5, 22186);
                ih.field_c.a(var7, (byte) -103);
                ih.field_c.a(var15, param3 ^ 107);
                if (il.field_kb == null) {
                  break L5;
                } else {
                  if ((il.field_kb.field_h.length ^ -1) <= -101) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              il.field_kb = new ob(100);
              break L4;
            }
            il.field_kb.field_j = 0;
            il.field_kb.c(10, (byte) -81);
            var11 = 0;
            var9 = var11;
            L6: while (true) {
              if ((var11 ^ -1) <= -5) {
                il.field_kb.d(param6, 255);
                il.field_kb.a(param4, param0, (byte) -86);
                param1.a(0, il.field_kb.field_j, il.field_kb.field_h, 22186);
                param1.a(0, ih.field_c.field_j, ih.field_c.field_h, param3 ^ 22186);
                return;
              } else {
                il.field_kb.e(11135, var15[var11]);
                var11++;
                continue L6;
              }
            }
          } else {
            var8[var9] = ro.field_b.nextInt();
            var9++;
            continue L1;
          }
        }
    }

    protected final void finalize() throws Throwable {
        if (((ra) this).field_d != null) {
            System.out.println("");
            ((ra) this).c(10);
        }
    }

    final static void a(int param0, int param1) {
        im.field_b = new int[3];
        wm.field_d = new nf[param1 * 15];
        da.field_g = 0;
        kp.field_i = param1;
        int var2 = -27 % ((param0 - -56) / 49);
    }

    final void a(long param0, byte param1) throws IOException {
        ((ra) this).field_d.seek(param0);
        if (param1 <= 25) {
            ra.a(false);
        }
        ((ra) this).field_h = param0;
    }

    public static void a(boolean param0) {
        if (param0) {
            field_j = null;
        }
        field_i = null;
        field_j = null;
        field_a = null;
        field_f = null;
        field_c = null;
    }

    final void a(byte[] param0, int param1, byte param2, int param3) throws IOException {
        if (param2 != 11) {
            field_g = -73;
        }
        if (!((((ra) this).field_b ^ -1L) <= ((long)param1 - -((ra) this).field_h ^ -1L))) {
            ((ra) this).field_d.seek(((ra) this).field_b);
            ((ra) this).field_d.write(1);
            throw new EOFException();
        }
        ((ra) this).field_d.write(param0, param3, param1);
        ((ra) this).field_h = ((ra) this).field_h + (long)param1;
    }

    final static void a(int param0) {
        bc.field_c[field_k] = gf.field_h;
        cb.field_f[field_k] = gf.field_i;
        dk.field_b[field_k] = gf.field_l;
        if (param0 >= -103) {
            ra.a(109, 107);
        }
        bf.field_c[field_k] = gf.field_a;
        da.field_d[field_k] = gf.field_f;
        oj.field_Cb[field_k] = gf.field_b;
        vp.field_s[field_k] = gf.field_k;
        field_k = field_k + 1;
    }

    ra(File param0, String param1, long param2) throws IOException {
        if ((param2 ^ -1L) == 0L) {
            param2 = 9223372036854775807L;
        }
        if ((param2 ^ -1L) > (param0.length() ^ -1L)) {
            boolean discarded$0 = param0.delete();
        }
        ((ra) this).field_d = new RandomAccessFile(param0, param1);
        ((ra) this).field_b = param2;
        ((ra) this).field_h = 0L;
        int var5 = ((ra) this).field_d.read();
        if ((var5 ^ -1) != 0) {
            if (!param1.equals((Object) (Object) "r")) {
                ((ra) this).field_d.seek(0L);
                ((ra) this).field_d.write(var5);
            }
        }
        ((ra) this).field_d.seek(0L);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[8192];
        field_c = "Using a hastily converted fleet of experimental vessels, a small fraction of humanity managed to escape the scorched ruins of Earth.";
        field_j = "<%0> has not yet unlocked this option for use.";
        field_g = -1;
        field_k = 0;
    }
}
