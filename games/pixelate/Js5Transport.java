/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class Js5Transport {
    static dq field_i;
    DualLinkDeque field_e;
    DualLinkDeque field_f;
    DualLinkDeque field_l;
    static TextWidgetPainter field_d;
    static String[] field_j;
    static int field_n;
    DualLinkDeque field_p;
    int field_o;
    PacketBuffer field_b;
    long field_k;
    byte field_a;
    volatile int field_h;
    volatile int field_m;
    PacketBuffer field_g;
    Js5NetworkRequest field_c;

    abstract boolean pollTransport(boolean param0);

    public static void releaseStatics(byte param0) {
        if (param0 == -53) {
          field_d = null;
          field_j = null;
          field_i = null;
          return;
        }
        ResourceArchive var2 = (ResourceArchive) null;
        Js5Transport.loadSkinSounds((SoundCache) null, 104, (ResourceArchive) null);
        field_d = null;
        field_j = null;
        field_i = null;
    }

    abstract void closeTransport(byte param0);

    abstract void attachTransport(Object param0, boolean param1, int param2);

    final boolean isInFlightFull(int param0) {
        if (param0 != 20) {
          return false;
        }
        return this.getInFlightRequestCount(127) >= 20 ? true : false;
    }

    final int getPendingRequestCount(byte param0) {
        if (param0 != 34) {
          return 117;
        }
        return this.field_l.size(param0 + 67) + this.field_p.size(118);
    }

    final boolean isPendingFull(byte param0) {
        if (param0 > 9) {
          return this.getPendingRequestCount((byte) 34) >= 20 ? true : false;
        }
        this.field_f = (DualLinkDeque) null;
        return this.getPendingRequestCount((byte) 34) >= 20 ? true : false;
    }

    final Js5NetworkRequest createRequest(byte param0, int param1, boolean param2, int param3, byte param4) {
        if (param0 != -31) {
          return (Js5NetworkRequest) null;
        }
        long var6 = (long)param3 + ((long)param1 << 32);
        Js5NetworkRequest var8 = new Js5NetworkRequest();
        var8.field_B = param4;
        var8.field_t = param2 ? true : false;
        var8.field_q = var6;
        if (param2) {
          if (!(this.getInFlightRequestCount(126) < 20)) {
            throw new RuntimeException();
          }
          this.field_e.addLast(-89, var8);
        } else {
          if (this.getPendingRequestCount((byte) 34) < 20) {
            this.field_l.addLast(-45, var8);
            return var8;
          }
          throw new RuntimeException();
        }
        return var8;
    }

    abstract void reportIntegrityFailure(byte param0);

    final int getInFlightRequestCount(int param0) {
        int var2 = 23 % ((58 - param0) / 55);
        return this.field_e.size(113) + this.field_f.size(102);
    }

    final static void loadSkinSounds(SoundCache param0, int param1, ResourceArchive param2) {
        int var3_int = 0;
        String var4 = null;
        int var5 = Pixelate.field_H ? 1 : 0;
        try {
          SoundCache.field_d = param0;
          if (param1 != 5088) {
            field_i = (dq) null;
          }
          for (var3_int = 0; 16 > var3_int; var3_int++) {
            var4 = Integer.toString(var3_int + 1);
            if (var3_int != 5) {
              SecondaryNodeDeque.field_f[0 + (8 * var3_int + 0)] = param0.getSoundEffectByName(true, "pix_skin" + var4 + "_move1", "");
              SecondaryNodeDeque.field_f[0 + (var3_int * 8 + 1)] = param0.getSoundEffectByName(true, "pix_skin" + var4 + "_move2", "");
              SecondaryNodeDeque.field_f[2 + (0 + 8 * var3_int)] = param0.getSoundEffectByName(true, "pix_skin" + var4 + "_move3", "");
              SecondaryNodeDeque.field_f[3 + var3_int * 8] = param0.getSoundEffectByName(true, "pix_skin" + var4 + "_move4", "");
            } else {
              SecondaryNodeDeque.field_f[0 + var3_int * 8 + 0] = VorbisSample.load(param2, "", "pix_skin" + var4 + "_move1").decodeAllToPcm();
              SecondaryNodeDeque.field_f[0 + 8 * var3_int + 1] = VorbisSample.load(param2, "", "pix_skin" + var4 + "_move2").decodeAllToPcm();
              SecondaryNodeDeque.field_f[2 + (0 + var3_int * 8)] = VorbisSample.load(param2, "", "pix_skin" + var4 + "_move3").decodeAllToPcm();
              SecondaryNodeDeque.field_f[3 + var3_int * 8] = VorbisSample.load(param2, "", "pix_skin" + var4 + "_move4").decodeAllToPcm();
            }
            SecondaryNodeDeque.field_f[5 + var3_int * 8] = param0.getSoundEffectByName(true, "pix_skin" + var4 + "_landing_normal", "");
            if (7 == var3_int) {
              SecondaryNodeDeque.field_f[8 * var3_int + 6] = param0.getSoundEffectByName(true, "pix_skin" + var4 + "_landing_special", "");
              SecondaryNodeDeque.field_f[8 * var3_int + 7] = param0.getSoundEffectByName(true, "pix_skin" + var4 + "_picture_complete", "");
            } else {
              SecondaryNodeDeque.field_f[6 + var3_int * 8] = VorbisSample.load(param2, "", "pix_skin" + var4 + "_landing_special").decodeAllToPcm();
              SecondaryNodeDeque.field_f[7 + var3_int * 8] = VorbisSample.load(param2, "", "pix_skin" + var4 + "_picture_complete").decodeAllToPcm();
            }
            SecondaryNodeDeque.field_f[4 + 8 * var3_int] = param0.getSoundEffectByName(true, "pix_skin" + var4 + "_tile_rotate", "");
          }
          SecondaryNodeDeque.field_f[128] = param0.getSoundEffectByName(true, "menu_select", "");
          SecondaryNodeDeque.field_f[131] = param0.getSoundEffectByName(true, "pix_grid_wipe", "");
          SecondaryNodeDeque.field_f[129] = param0.getSoundEffectByName(true, "pix_time_running_out", "");
          SecondaryNodeDeque.field_f[130] = param0.getSoundEffectByName(true, "pix_time_up", "");
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "rf.M(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    Js5Transport() {
        this.field_e = new DualLinkDeque();
        this.field_f = new DualLinkDeque();
        this.field_l = new DualLinkDeque();
        this.field_p = new DualLinkDeque();
        this.field_b = new PacketBuffer(6);
        this.field_h = 0;
        this.field_a = (byte) 0;
        this.field_m = 0;
        this.field_g = new PacketBuffer(10);
    }

    static {
        field_i = new dq();
    }
}
