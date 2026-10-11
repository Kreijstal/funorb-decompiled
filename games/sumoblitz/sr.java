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
        int var5_int = 0;
        RuntimeException var5 = null;
        fs var6 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.field_h.read(param0, param3, param2);
          if (param1 != 2) {
            var6 = (fs) null;
            sr.a((java.math.BigInteger) null, 49, (byte[]) null, (java.math.BigInteger) null, (byte) 29, (fs) null, 22);
          }
          if (var5_int > 0) {
            this.field_e = this.field_e + (long)var5_int;
          }
          stackIn_6_0 = var5_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("sr.C(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void d(int param0) {
        si.a(115, 38, 148, param0 - 22028, new int[]{0, 23, 24, 3, 25, 2, 14, 11}, 0, 492);
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
          field_a = (il) null;
        }
    }

    final void a(byte[] param0, int param1, int param2, int param3) throws IOException {
        try {
          if ((this.field_e + (long)param2) > this.field_f) {
            this.field_h.seek(this.field_f);
            this.field_h.write(1);
            throw new EOFException();
          }
          this.field_h.write(param0, param1, param2);
          if (param3 != 1) {
            this.field_e = -67L;
          }
          this.field_e = this.field_e + (long)param2;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "sr.F(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(byte param0, long param1) throws IOException {
        this.field_h.seek(param1);
        this.field_e = param1;
        int var4 = -27 / ((-13 - param0) / 49);
    }

    final static void a(java.math.BigInteger param0, int param1, byte[] param2, java.math.BigInteger param3, byte param4, fs param5, int param6) {
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int[] var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int var9Lifetime1;
        var10 = Sumoblitz.field_L ? 1 : 0;
        try {
          var7_int = pq.a(1, param1);
          if (gf.field_b == null) {
            gf.field_b = new java.security.SecureRandom();
          }
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          for (var9 = 0; var9 < 4; var9++) {
            var8[var9] = gf.field_b.nextInt();
          }
          if (qc.field_c == null ||
            !(var7_int <= qc.field_c.field_n.length)) {
            qc.field_c = new fs(var7_int);
          }
          qc.field_c.field_p = 0;
          qc.field_c.a(param2, (byte) -123, param1, param6);
          qc.field_c.a((byte) -3, var7_int);
          qc.field_c.a(var13, 104);
          if (sv.field_c == null ||
            !(100 <= sv.field_c.field_n.length)) {
            sv.field_c = new fs(100);
          }
          sv.field_c.field_p = 0;
          sv.field_c.b((byte) 25, 10);
          var11 = 0;
          var9Lifetime1 = var11;
          while (var11 < 4) {
            sv.field_c.e(48, var13[var11]);
            var11++;
          }
          sv.field_c.b(125, param1);
          sv.field_c.a((byte) 123, param0, param3);
          param5.a(sv.field_c.field_n, (byte) -123, sv.field_c.field_p, 0);
          if (param4 > -6) {
            return;
          }
          param5.a(qc.field_c.field_n, (byte) -123, qc.field_c.field_p, 0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_24_0 = var7;
          stackIn_24_1 = new StringBuilder().append("sr.D(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          stackIn_27_1 = ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          stackIn_30_1 = ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param6).append(')').toString());
        }
    }

    final void b(int param0) throws IOException {
        if (this.field_h != null) {
          this.field_h.close();
          this.field_h = null;
        }
        if (param0 != 0) {
          fs var3 = (fs) null;
          sr.a((java.math.BigInteger) null, 53, (byte[]) null, (java.math.BigInteger) null, (byte) 2, (fs) null, 24);
        }
    }

    final long a(int param0) throws IOException {
        if (param0 <= 34) {
          fs var3 = (fs) null;
          sr.a((java.math.BigInteger) null, -30, (byte[]) null, (java.math.BigInteger) null, (byte) -2, (fs) null, -103);
        }
        return this.field_h.length();
    }

    sr(File param0, String param1, long param2) throws IOException {
        int var5_int = 0;
        try {
          if (param2 == -1L) {
            param2 = 9223372036854775807L;
          }
          if (param0.length() > param2) {
            param0.delete();
          }
          this.field_h = new RandomAccessFile(param0, param1);
          this.field_e = 0L;
          this.field_f = param2;
          var5_int = this.field_h.read();
          if (var5_int != -1 &&
            !param1.equals("r")) {
            this.field_h.seek(0L);
            this.field_h.write(var5_int);
          }
          this.field_h.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "sr.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    protected final void finalize() throws Throwable {
        if (this.field_h != null) {
          System.out.println("");
          this.b(0);
        }
    }

    static {
        field_i = new jf();
        field_d = false;
        field_c = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_a = new il();
        field_j = new String[]{"HyoujunBot", "He's eager to fight, but he has only normal eyesight. It is possible to hide from him.", "SuiminBot", "Wake him up with a bump. He's slower than HyoujunBot, but he has better traction.", "Accelerator", "Shoots drones in the indicated direction.", "KosokuBot", "He's lighter than HyoujunBot, but faster, with very little traction.", "Armour", "One of these drones has armour. Hit it three times to temporarily deactivate the armour.", "Repeller", "Pushes drones away.", "Teleporter", "Teleports drones between teleporters.", "Pinball bouncer", "Repels drones at high speed.", "Bomb", "One of these drones has a blast charge. It activates on contact, so beware.", "BunkatBot", "On death, he splits into smaller versions of himself.", "Ice pad", "Reduces acceleration and traction, causing severe loss of control.", "Spikes", "A drone in this wave has spikes. Spikes hurt, but they take time to recharge after use.", "Mine", "Not lethal in itself, but its shockwave causes havoc.", "Zap trap", "Lethal on contact, but takes time to recharge.", "Attractor", "Uses a tractor beam to pull drones in.", "SosakuBot", "With high traction and a very long sight range, he'll hunt you down from far away.", "Movement", "Hold your left mouse button or the WASD keys to direct your drone.", "Blast", "Hold Space to deploy an Energy Blast.", "<col=ff0000>Gyojibot</col>", "Do not bore GyojiBot by remaining in one place for too long. For this, he will destroy your drone."};
    }
}
