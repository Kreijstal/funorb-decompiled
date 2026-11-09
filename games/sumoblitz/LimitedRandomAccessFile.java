/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class LimitedRandomAccessFile {
    private RandomAccessFile file;
    private long position;
    private long maxLength;
    static ContentTransitionPhase FADING_OUT;
    static boolean field_g;
    static il field_a;
    static int field_b;
    static boolean field_d;
    static String field_c;
    static String[] droneDescriptions;

    final int read(byte[] destination, int guard, int length, int offset) throws IOException {
        int var5_int = 0;
        RuntimeException var5 = null;
        PacketBuffer var6 = null;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = this.file.read(destination, offset, length);
          if (guard != 2) {
            var6 = (PacketBuffer) null;
            LimitedRandomAccessFile.a((java.math.BigInteger) null, 49, (byte[]) null, (java.math.BigInteger) null, (byte) 29, (PacketBuffer) null, 22);
          }
          if (var5_int > 0) {
            this.position = this.position + (long)var5_int;
          }
          stackIn_6_0 = var5_int;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("sr.C(");
          if (destination == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(guard).append(',').append(length).append(',').append(offset).append(')').toString());
        }
    }

    final static void d(int param0) {
        DirectByteArrayStorage.a(115, 38, 148, param0 - 22028, new int[]{0, 23, 24, 3, 25, 2, 14, 11}, 0, 492);
        LegacyOpenGlEffectManager.field_g[0] = new MenuScreen(0);
        if (param0 != 22030) {
          LimitedRandomAccessFile.d(35);
        }
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        droneDescriptions = null;
        field_c = null;
        FADING_OUT = null;
        if (param0 != 100) {
          field_a = (il) null;
        }
    }

    final void write(byte[] source, int offset, int length, int guard) throws IOException {
        try {
          if ((this.position + (long)length) > this.maxLength) {
            this.file.seek(this.maxLength);
            this.file.write(1);
            throw new EOFException();
          }
          this.file.write(source, offset, length);
          if (guard != 1) {
            this.position = -67L;
          }
          this.position = this.position + (long)length;
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "sr.F(" + (source != null ? "{...}" : "null") + ',' + offset + ',' + length + ',' + guard + ')');
        }
    }

    final void seek(byte guard, long offset) throws IOException {
        this.file.seek(offset);
        this.position = offset;
        int var4 = -27 / ((-13 - guard) / 49);
    }

    final static void a(java.math.BigInteger param0, int param1, byte[] param2, java.math.BigInteger param3, byte param4, PacketBuffer param5, int param6) {
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
          var7_int = StripedProgressWidget.alignToEight(1, param1);
          if (ValidationStatus.field_b == null) {
            ValidationStatus.field_b = new java.security.SecureRandom();
          }
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          for (var9 = 0; var9 < 4; var9++) {
            var8[var9] = ValidationStatus.field_b.nextInt();
          }
          if (DroneIntroductionOverlay.field_c == null ||
            !(var7_int <= DroneIntroductionOverlay.field_c.payload.length)) {
            DroneIntroductionOverlay.field_c = new PacketBuffer(var7_int);
          }
          DroneIntroductionOverlay.field_c.position = 0;
          DroneIntroductionOverlay.field_c.writeBytes(param2, (byte) -123, param1, param6);
          DroneIntroductionOverlay.field_c.padTo((byte) -3, var7_int);
          DroneIntroductionOverlay.field_c.encryptXtea(var13, 104);
          if (sv.field_c == null ||
            !(100 <= sv.field_c.payload.length)) {
            sv.field_c = new PacketBuffer(100);
          }
          sv.field_c.position = 0;
          sv.field_c.writeByte((byte) 25, 10);
          var11 = 0;
          var9Lifetime1 = var11;
          while (var11 < 4) {
            sv.field_c.writeInt(48, var13[var11]);
            var11++;
          }
          sv.field_c.writeShort(125, param1);
          sv.field_c.encryptRsa((byte) 123, param0, param3);
          param5.writeBytes(sv.field_c.payload, (byte) -123, sv.field_c.position, 0);
          if (param4 > -6) {
            return;
          }
          param5.writeBytes(DroneIntroductionOverlay.field_c.payload, (byte) -123, DroneIntroductionOverlay.field_c.position, 0);
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
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param6).append(')').toString());
        }
    }

    final void close(int guard) throws IOException {
        if (this.file != null) {
          this.file.close();
          this.file = null;
        }
        if (guard != 0) {
          PacketBuffer var3 = (PacketBuffer) null;
          LimitedRandomAccessFile.a((java.math.BigInteger) null, 53, (byte[]) null, (java.math.BigInteger) null, (byte) 2, (PacketBuffer) null, 24);
        }
    }

    final long length(int guard) throws IOException {
        if (guard <= 34) {
          PacketBuffer var3 = (PacketBuffer) null;
          LimitedRandomAccessFile.a((java.math.BigInteger) null, -30, (byte[]) null, (java.math.BigInteger) null, (byte) -2, (PacketBuffer) null, -103);
        }
        return this.file.length();
    }

    LimitedRandomAccessFile(File path, String mode, long lengthLimit) throws IOException {
        int var5_int = 0;
        try {
          if (lengthLimit == -1L) {
            lengthLimit = 9223372036854775807L;
          }
          if (path.length() > lengthLimit) {
            path.delete();
          }
          this.file = new RandomAccessFile(path, mode);
          this.position = 0L;
          this.maxLength = lengthLimit;
          var5_int = this.file.read();
          if (var5_int != -1 &&
            !mode.equals("r")) {
            this.file.seek(0L);
            this.file.write(var5_int);
          }
          this.file.seek(0L);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "sr.<init>(" + (path != null ? "{...}" : "null") + ',' + (mode != null ? "{...}" : "null") + ',' + lengthLimit + ')');
        }
    }

    protected final void finalize() throws Throwable {
        if (this.file != null) {
          System.out.println("");
          this.close(0);
        }
    }

    static {
        FADING_OUT = new ContentTransitionPhase();
        field_d = false;
        field_c = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled.";
        field_a = new il();
        droneDescriptions = new String[]{"HyoujunBot", "He's eager to fight, but he has only normal eyesight. It is possible to hide from him.", "SuiminBot", "Wake him up with a bump. He's slower than HyoujunBot, but he has better traction.", "Accelerator", "Shoots drones in the indicated direction.", "KosokuBot", "He's lighter than HyoujunBot, but faster, with very little traction.", "Armour", "One of these drones has armour. Hit it three times to temporarily deactivate the armour.", "Repeller", "Pushes drones away.", "Teleporter", "Teleports drones between teleporters.", "Pinball bouncer", "Repels drones at high speed.", "Bomb", "One of these drones has a blast charge. It activates on contact, so beware.", "BunkatBot", "On death, he splits into smaller versions of himself.", "Ice pad", "Reduces acceleration and traction, causing severe loss of control.", "Spikes", "A drone in this wave has spikes. Spikes hurt, but they take time to recharge after use.", "Mine", "Not lethal in itself, but its shockwave causes havoc.", "Zap trap", "Lethal on contact, but takes time to recharge.", "Attractor", "Uses a tractor beam to pull drones in.", "SosakuBot", "With high traction and a very long sight range, he'll hunt you down from far away.", "Movement", "Hold your left mouse button or the WASD keys to direct your drone.", "Blast", "Hold Space to deploy an Energy Blast.", "<col=ff0000>Gyojibot</col>", "Do not bore GyojiBot by remaining in one place for too long. For this, he will destroy your drone."};
    }
}
