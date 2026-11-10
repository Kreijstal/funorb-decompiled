/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class Js5Transport {
    static ClientProtocolStage field_e;
    static int[] field_a;
    static String field_o;
    DualLinkDeque field_g;
    DualLinkDeque field_j;
    static IndexedSprite field_h;
    DualLinkDeque field_c;
    DualLinkDeque field_l;
    PacketBuffer field_b;
    long field_f;
    int field_d;
    PacketBuffer field_k;
    volatile int field_p;
    byte field_i;
    volatile int field_n;
    NetworkArchiveRequest field_m;

    abstract void setConnection(boolean param0, Object param1, int param2);

    final static void clearMouseHandler(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (param0 != 31) {
          Js5Transport.releaseStatics((byte) -24);
        }
        if (ValidatedTextInputWidget.field_Z == null) {
          return;
        }
        var1 = ValidatedTextInputWidget.field_Z;
        synchronized (var1) {
          ValidatedTextInputWidget.field_Z = null;
        }
    }

    final int prefetchCount(int param0) {
        if (param0 == 20) {
          return this.field_c.size((byte) 98) + this.field_l.size((byte) 98);
        }
        this.field_d = 116;
        return this.field_c.size((byte) 98) + this.field_l.size((byte) 98);
    }

    final static void setMenuButtonStyle(int param0, byte param1, FramePainter param2, int param3) {
        try {
          if (param1 > -101) {
            Js5Transport.releaseStatics((byte) 57);
          }
          MusicPatch.field_l = param2;
          GrowableIntList.field_m = param0;
          ClickMarkerParticle.field_a = param3;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "qb.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_e = null;
        if (param0 == -7) {
          field_o = null;
          field_h = null;
          field_a = null;
          return;
        }
        FramePainter var2 = (FramePainter) null;
        Js5Transport.setMenuButtonStyle(36, (byte) -107, (FramePainter) null, 47);
        field_o = null;
        field_h = null;
        field_a = null;
    }

    final NetworkArchiveRequest createRequest(int param0, int param1, boolean param2, int param3, byte param4) {
        long var6 = ((long)param3 << 32) + (long)param1;
        NetworkArchiveRequest var8 = new NetworkArchiveRequest();
        var8.field_B = param4;
        var8.secondaryKey = var6;
        var8.field_r = param2 ? true : false;
        if (param2) {
          if (20 <= this.getInFlightRequestCount(0)) {
            throw new RuntimeException();
          }
          this.field_g.add(param0 ^ 488002304, var8);
        } else {
          if (!(20 > this.prefetchCount(20))) {
            throw new RuntimeException();
          }
          this.field_c.add(29664, var8);
        }
        if (param0 == 487989472) {
          return var8;
        }
        Object var9 = (Object) null;
        this.setConnection(false, (Object) null, 52);
        return var8;
    }

    abstract void closeConnection(int param0);

    abstract void resetAfterValidationFailure(byte param0);

    final boolean isPriorityQueueFull(int param0) {
        if (param0 > 13) {
          return this.getInFlightRequestCount(0) >= 20 ? true : false;
        }
        this.field_d = -46;
        return this.getInFlightRequestCount(0) >= 20 ? true : false;
    }

    final boolean isBackgroundQueueFull(int param0) {
        if (param0 <= -32) {
          return this.prefetchCount(20) >= 20 ? true : false;
        }
        this.field_b = (PacketBuffer) null;
        return this.prefetchCount(20) >= 20 ? true : false;
    }

    abstract boolean poll(byte param0);

    final int getInFlightRequestCount(int param0) {
        if (param0 != 0) {
          return 31;
        }
        return this.field_g.size((byte) 98) + this.field_j.size((byte) 98);
    }

    Js5Transport() {
        this.field_g = new DualLinkDeque();
        this.field_j = new DualLinkDeque();
        this.field_c = new DualLinkDeque();
        this.field_l = new DualLinkDeque();
        this.field_b = new PacketBuffer(6);
        this.field_i = (byte) 0;
        this.field_n = 0;
        this.field_p = 0;
        this.field_k = new PacketBuffer(10);
    }

    static {
        field_o = "<%0> has joined your game.";
        field_a = new int[]{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        field_e = new ClientProtocolStage();
    }
}
