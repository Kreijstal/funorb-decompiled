/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiNote extends IntrusiveNode {
    PcmSample field_v;
    static String field_o;
    static int field_r;
    int field_z;
    int field_E;
    int field_t;
    int field_j;
    int field_B;
    int field_D;
    PcmSampleStream field_w;
    int field_H;
    int field_k;
    int field_q;
    int field_K;
    MidiEnvelope field_i;
    int field_y;
    int field_I;
    static String field_u;
    static PlatformTaskDispatcher field_p;
    static int field_l;
    static int field_G;
    int field_n;
    int field_m;
    int field_x;
    MusicPatch field_C;
    int field_s;
    int field_F;

    final void a(int param0) {
        this.field_C = null;
        this.field_v = null;
        this.field_i = null;
        if (param0 != 0) {
          return;
        }
        this.field_w = null;
    }

    final static void a(byte param0) {
        ga.field_e = SocketJs5Transport.musicTracks[GridActor.field_l];
        if (tl.field_e) {
          SingleChildWidget.field_D.a(true, -110, ga.field_e);
        }
        if (param0 < -39) {
          oc.field_b = ValidationState.field_e[GridActor.field_l];
          lk.field_b = DiskCacheStore.field_b[GridActor.field_l];
          wg.field_e = ExceptionSupport.field_c[GridActor.field_l];
          return;
        }
        MidiNote.d((byte) 8);
        oc.field_b = ValidationState.field_e[GridActor.field_l];
        lk.field_b = DiskCacheStore.field_b[GridActor.field_l];
        wg.field_e = ExceptionSupport.field_c[GridActor.field_l];
    }

    final static String d(byte param0) {
        if (param0 > -79) {
          MidiNote.a(107, 125, 75, 15);
          if (MonotonicClockHelpers.field_a != null) {
            return MonotonicClockHelpers.field_a;
          }
          return "";
        }
        if (MonotonicClockHelpers.field_a != null) {
          return MonotonicClockHelpers.field_a;
        }
        return "";
    }

    public static void releaseStatics(boolean param0) {
        field_p = null;
        field_o = null;
        if (!param0) {
          MidiNote.releaseStatics(false);
          field_u = null;
          return;
        }
        field_u = null;
    }

    final static void a(byte[] param0, PacketBuffer param1, java.math.BigInteger param2, boolean param3, int param4, java.math.BigInteger param5, int param6) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
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
        var10 = wizardrun.field_H;
        try {
          var7_int = me.a(param4, -68);
          if (ValidationHelpWidget.field_N == null) {
            ValidationHelpWidget.field_N = new java.security.SecureRandom();
          }
          if (!param3) {
            MidiNote.d((byte) -27);
          }
          var13 = new int[4];
          var12 = var13;
          var8 = var12;
          for (var9 = 0; var9 < 4; var9++) {
            var8[var9] = ValidationHelpWidget.field_N.nextInt();
          }
          if (mk.field_a == null ||
            !(mk.field_a.payload.length >= var7_int)) {
            mk.field_a = new PacketBuffer(var7_int);
          }
          mk.field_a.position = 0;
          mk.field_a.writeBytes(param0, param6, param4, 12);
          mk.field_a.padToPosition(var7_int, 123);
          mk.field_a.encryptXtea(false, var13);
          if (UrlPacketDownloader.field_b == null ||
            !(100 <= UrlPacketDownloader.field_b.payload.length)) {
            UrlPacketDownloader.field_b = new PacketBuffer(100);
          }
          UrlPacketDownloader.field_b.position = 0;
          UrlPacketDownloader.field_b.writeByte((byte) 11, 10);
          var11 = 0;
          var9Lifetime1 = var11;
          while (4 > var11) {
            UrlPacketDownloader.field_b.writeInt(var13[var11], 613003928);
            var11++;
          }
          UrlPacketDownloader.field_b.writeShort(-1947079288, param4);
          UrlPacketDownloader.field_b.encryptRsa(param2, 95, param5);
          param1.writeBytes(UrlPacketDownloader.field_b.payload, 0, UrlPacketDownloader.field_b.position, 13);
          param1.writeBytes(mk.field_a.payload, 0, mk.field_a.position, -116);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_23_0 = var7;
          stackIn_23_1 = new StringBuilder().append("vk.B(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param1 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param6).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3) {
        MenuController.field_b = param2;
        tc.field_i = param3;
        int var4 = -91 / ((param0 - 9) / 62);
        jl.field_s = param1;
    }

    MidiNote() {
    }

    static {
        field_o = "Instructions";
        field_u = "Wizard Run";
    }
}
