/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sr {
    private RandomAccessFile field_h;
    private long field_e;
    private long field_f;
    static jf field_i;
    static boolean field_g;
    static il field_a;
    static int field_b;
    static boolean field_d;
    static String field_c;
    static String[] field_j;

    final int b(byte[] param0, int param1, int param2, int param3) throws IOException {
        int var5 = ((sr) this).field_h.read(param0, param3, param2);
        if (param1 != 2) {
            Object var6 = null;
            sr.a((java.math.BigInteger) null, 49, (byte[]) null, (java.math.BigInteger) null, (byte) 29, (fs) null, 22);
        }
        if (!(-1 <= (var5 ^ -1))) {
            ((sr) this).field_e = ((sr) this).field_e + (long)var5;
        }
        return var5;
    }

    final static void d(int param0) {
        si.a(115, 38, 148, param0 + -22028, new int[8], 0, 492);
        iv.field_g[0] = new ak(0);
        if (param0 != 22030) {
            sr.d(35);
        }
    }

    public static void c(int param0) {
        field_a = null;
        field_j = null;
        field_c = null;
        field_i = null;
        if (param0 != 100) {
            field_a = null;
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        if ((((sr) this).field_e + (long)param2 ^ -1L) < (((sr) this).field_f ^ -1L)) {
            ((sr) this).field_h.seek(((sr) this).field_f);
            ((sr) this).field_h.write(1);
            throw new EOFException();
        }
        ((sr) this).field_h.write(param0, param1, param2);
        if (param3 != 1) {
            ((sr) this).field_e = -67L;
        }
        ((sr) this).field_e = ((sr) this).field_e + (long)param2;
    }

    final void a(byte param0, long param1) throws IOException {
        ((sr) this).field_h.seek(param1);
        ((sr) this).field_e = param1;
        int var4 = -27 / ((-13 - param0) / 49);
    }

    final static void a(java.math.BigInteger param0, int param1, byte[] param2, java.math.BigInteger param3, byte param4, fs param5, int param6) {
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
          var10 = Sumoblitz.field_L ? 1 : 0;
          var7 = pq.a(1, param1);
          if (gf.field_b == null) {
            gf.field_b = new java.security.SecureRandom();
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
        var9 = 0;
        L1: while (true) {
          if ((var9 ^ -1) <= -5) {
            L2: {
              L3: {
                if (qc.field_c == null) {
                  break L3;
                } else {
                  if (var7 > qc.field_c.field_n.length) {
                    break L3;
                  } else {
                    break L2;
                  }
                }
              }
              qc.field_c = new fs(var7);
              break L2;
            }
            L4: {
              L5: {
                qc.field_c.field_p = 0;
                qc.field_c.a(param2, (byte) -123, param1, param6);
                qc.field_c.a((byte) -3, var7);
                qc.field_c.a(var15, 104);
                if (sv.field_c == null) {
                  break L5;
                } else {
                  if (100 <= sv.field_c.field_n.length) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
              sv.field_c = new fs(100);
              break L4;
            }
            sv.field_c.field_p = 0;
            sv.field_c.b((byte) 25, 10);
            var11 = 0;
            var9 = var11;
            L6: while (true) {
              if (-5 >= (var11 ^ -1)) {
                sv.field_c.b(125, param1);
                sv.field_c.a((byte) 123, param0, param3);
                param5.a(sv.field_c.field_n, (byte) -123, sv.field_c.field_p, 0);
                if (param4 <= -6) {
                  param5.a(qc.field_c.field_n, (byte) -123, qc.field_c.field_p, 0);
                  return;
                } else {
                  return;
                }
              } else {
                sv.field_c.e(48, var15[var11]);
                var11++;
                continue L6;
              }
            }
          } else {
            var8[var9] = gf.field_b.nextInt();
            var9++;
            continue L1;
          }
        }
    }

    final void b(int param0) throws IOException {
        if (((sr) this).field_h != null) {
            ((sr) this).field_h.close();
            ((sr) this).field_h = null;
        }
        if (param0 != 0) {
            Object var3 = null;
            sr.a((java.math.BigInteger) null, 53, (byte[]) null, (java.math.BigInteger) null, (byte) 2, (fs) null, 24);
        }
    }

    final long a(int param0) throws IOException {
        if (param0 <= 34) {
            Object var3 = null;
            sr.a((java.math.BigInteger) null, -30, (byte[]) null, (java.math.BigInteger) null, (byte) -2, (fs) null, -103);
        }
        return ((sr) this).field_h.length();
    }

    sr(File param0, String param1, long param2) throws IOException {
        if (0L == (param2 ^ -1L)) {
            param2 = 9223372036854775807L;
        }
        if (param0.length() > param2) {
            boolean discarded$0 = param0.delete();
        }
        ((sr) this).field_h = new RandomAccessFile(param0, param1);
        ((sr) this).field_e = 0L;
        ((sr) this).field_f = param2;
        int var5 = ((sr) this).field_h.read();
        if ((var5 ^ -1) != 0) {
            if (!param1.equals((Object) (Object) "r")) {
                ((sr) this).field_h.seek(0L);
                ((sr) this).field_h.write(var5);
            }
        }
        ((sr) this).field_h.seek(0L);
    }

    protected final void finalize() throws Throwable {
        if (((sr) this).field_h != null) {
            System.out.println("");
            ((sr) this).b(0);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = new jf();
        field_d = false;
        field_c = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_a = new il();
        field_j = new String[]{"HyoujunBot", "He's eager to fight, but he has only normal eyesight. It is possible to hide from him.", "SuiminBot", "Wake him up with a bump. He's slower than HyoujunBot, but he has better traction.", "Accelerator", "Shoots drones in the indicated direction.", "KosokuBot", "He's lighter than HyoujunBot, but faster, with very little traction.", "Armour", "One of these drones has armour. Hit it three times to temporarily deactivate the armour.", "Repeller", "Pushes drones away.", "Teleporter", "Teleports drones between teleporters.", "Pinball bouncer", "Repels drones at high speed.", "Bomb", "One of these drones has a blast charge. It activates on contact, so beware.", "BunkatBot", "On death, he splits into smaller versions of himself.", "Ice pad", "Reduces acceleration and traction, causing severe loss of control.", "Spikes", "A drone in this wave has spikes. Spikes hurt, but they take time to recharge after use.", "Mine", "Not lethal in itself, but its shockwave causes havoc.", "Zap trap", "Lethal on contact, but takes time to recharge.", "Attractor", "Uses a tractor beam to pull drones in.", "SosakuBot", "With high traction and a very long sight range, he'll hunt you down from far away.", "Movement", "Hold your left mouse button or the WASD keys to direct your drone.", "Blast", "Hold Space to deploy an Energy Blast.", "<col=ff0000>Gyojibot</col>", "Do not bore GyojiBot by remaining in one place for too long. For this, he will destroy your drone."};
    }
}
