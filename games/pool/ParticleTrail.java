/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class ParticleTrail {
    private byte field_a;
    static int field_d;
    private GlowParticle[] field_l;
    private short[] field_n;
    private byte field_c;
    static boolean field_f;
    private int[] field_k;
    private int field_j;
    static int field_g;
    private boolean field_e;
    private int[] field_i;
    private byte[] field_m;
    static IntegerSyntaxSupport field_h;
    static int[] field_b;

    final void drawParticles(boolean obfuscationGuard, byte compatibilityGuard, int[] cameraTransform) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Pool.field_O;
        try {
          if (compatibilityGuard <= 56) {
            this.advanceParticles((byte) -68);
          }
          var4_int = 0;
          while (true) {
            if (!this.field_e) {
              if (this.field_j <= var4_int) {
                return;
              }
            } else {
              if (var4_int >= this.field_l.length) {
                return;
              }
            }
            this.field_l[var4_int].draw(262144, cameraTransform);
            var4_int++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("ji.D(").append(obfuscationGuard).append(',').append(compatibilityGuard).append(',');
          if (cameraTransform == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        field_b = null;
        field_h = null;
        if (param0) {
          ParticleTrail.createCachedArchive(-2, true, (byte) 41, 72, false, false);
        }
    }

    final static ResourceArchive createCachedArchive(int param0, boolean param1, byte param2, int param3, boolean param4, boolean param5) {
        try {
          Object var6 = null;
          Object var7 = null;
          CachedArchiveSource var8 = null;
          ResourceArchive stackIn_5_0 = null;
          ResourceArchive stackIn_16_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            var6 = null;
            var7 = null;
            if (null != ButtonWidget.field_M.field_x) {
              LoginRequestSupport.field_a = new BufferedFile(ButtonWidget.field_M.field_x, 5200, 0);
              ButtonWidget.field_M.field_x = null;
              var6 = new SectorCacheStore(255, LoginRequestSupport.field_a, new BufferedFile(ButtonWidget.field_M.field_e, 12000, 0), 2097152);
            }
            if (param2 != -56) {
              stackIn_5_0 = (ResourceArchive) null;
              return stackIn_5_0;
            }
            if (LoginRequestSupport.field_a != null) {
              if (null == MenuSelection.field_d) {
                MenuSelection.field_d = new BufferedFile[ButtonWidget.field_M.field_n.length];
              }
              if (null == MenuSelection.field_d[param3]) {
                MenuSelection.field_d[param3] = new BufferedFile(ButtonWidget.field_M.field_n[param3], 12000, 0);
                ButtonWidget.field_M.field_n[param3] = null;
              }
              var7 = new SectorCacheStore(param3, LoginRequestSupport.field_a, MenuSelection.field_d[param3], 2097152);
            }
            var8 = TranslatedUiText.field_m.archiveProvider(param4, (SectorCacheStore) (var7), param3, (byte) 0, (SectorCacheStore) (var6));
            if (param5) {
              var8.requestAllGroups(117);
            }
            stackIn_16_0 = new ResourceArchive(var8, param1, param0);
            return stackIn_16_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (IOException) (Object) decompiledCaughtException;
            throw new RuntimeException(((IOException) (var6)).toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void advanceParticles(byte obfuscationGuard) {
        int var2 = 0;
        GlowParticle dupTemp$1 = null;
        GlowParticle dupTemp$2 = null;
        GlowParticle dupTemp$3 = null;
        GlowParticle dupTemp$4 = null;
        GlowParticle dupTemp$5 = null;
        GlowParticle dupTemp$6 = null;
        int var3;
        int var4;
        int var5;
        int var3Lifetime1;
        var5 = Pool.field_O;
        byte fieldTemp$0 = (byte)(this.field_a - 1);
        this.field_a = (byte)(this.field_a - 1);
        if (fieldTemp$0 <= 0) {
          this.field_l[this.field_j].field_c = false;
          this.field_l[this.field_j].field_e = this.field_k[0];
          this.field_l[this.field_j].field_i = this.field_i[0];
          this.field_l[this.field_j].field_d = 0;
          this.field_l[this.field_j].field_l = (short) 0;
          this.field_m[this.field_j] = (byte) 0;
          this.field_n[this.field_j] = (short)0;
          this.field_j = (this.field_j + 1) % this.field_l.length;
          if (this.field_j == 0) {
            this.field_e = true;
          }
          this.field_a = TextInputWidget.field_Y[this.field_c];
          this.field_c = (byte)((this.field_c + 1) % TextInputWidget.field_Y.length);
        }
        for (var2 = 0; var2 < this.field_l.length; var2++) {
          if (!this.field_l[var2].field_c) {
            var3 = this.field_m[var2];
            if (var3 == 0) {
              this.field_n[var2] = (short)(this.field_n[var2] + 17);
            } else {
              if (var3 == 1) {
                this.field_n[var2] = (short)(this.field_n[var2] + 91);
              }
            }
            if (this.field_n[var2] >= 4096) {
              this.field_n[var2] = (short)0;
              this.field_m[var2] = (byte)(this.field_m[var2] + 1);
            }
            if (this.field_k.length - 1 > this.field_m[var2]) {
              var3Lifetime1 = this.field_n[var2] * this.field_n[var2] / 4096;
              var4 = -var3Lifetime1 + 4096;
              this.field_l[var2].moveTo(var4 * this.field_k[this.field_m[var2]] + this.field_k[this.field_m[var2] + 1] * var3Lifetime1 >> 12, (byte) 78, var4 * this.field_i[this.field_m[var2]] + this.field_i[1 + this.field_m[var2]] * var3Lifetime1 >> 12);
            } else {
              this.field_l[var2].field_c = true;
              dupTemp$1 = this.field_l[var2];
              dupTemp$1.field_b = (short)(dupTemp$1.field_b + (MaxLengthTextInputWidget.nextRandomInt(17, true, RankingsRequest.field_r) - 8));
              dupTemp$2 = this.field_l[var2];
              dupTemp$2.field_k = (short)(dupTemp$2.field_k + (-8 + MaxLengthTextInputWidget.nextRandomInt(17, true, RankingsRequest.field_r)));
            }
          } else {
            dupTemp$3 = this.field_l[var2];
            dupTemp$3.field_l = (short)(dupTemp$3.field_l + 1);
            dupTemp$4 = this.field_l[var2];
            dupTemp$4.field_e = dupTemp$4.field_e + this.field_l[var2].field_b;
            dupTemp$5 = this.field_l[var2];
            dupTemp$5.field_i = dupTemp$5.field_i + this.field_l[var2].field_k;
            dupTemp$6 = this.field_l[var2];
            dupTemp$6.field_d = dupTemp$6.field_d + this.field_l[var2].field_l;
          }
        }
        if (obfuscationGuard != -43) {
          this.field_j = -58;
        }
    }

    ParticleTrail(int[] param0) {
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int var2_int = 0;
        int var3 = 0;
        int var5 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3Lifetime1;
        this.field_e = false;
        this.field_c = (byte) 0;
        try {
          this.field_k = new int[param0.length / 2];
          this.field_i = new int[param0.length / 2];
          var2_int = 0;
          for (var3 = 0; this.field_k.length > var3; var3++) {
            incrementValue$2 = var2_int;
            var2_int++;
            this.field_k[var3] = param0[incrementValue$2];
            incrementValue$3 = var2_int;
            var2_int++;
            this.field_i[var3] = param0[incrementValue$3];
          }
          this.field_l = new GlowParticle[256];
          this.field_m = new byte[this.field_l.length];
          this.field_n = new short[this.field_l.length];
          var5 = 0;
          var3Lifetime1 = var5;
          while (this.field_l.length > var5) {
            this.field_l[var5] = new GlowParticle(this.field_k[0], this.field_i[0]);
            this.field_m[var5] = (byte) 0;
            this.field_n[var5] = (short)0;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("ji.<init>(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    static {
        field_d = 250;
        field_f = false;
        field_h = new IntegerSyntaxSupport();
        field_b = new int[16];
    }
}
