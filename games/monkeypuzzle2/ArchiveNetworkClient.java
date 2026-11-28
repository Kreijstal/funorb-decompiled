/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ArchiveNetworkClient {
    dl field_n;
    static Sprite[] field_f;
    dl field_j;
    static IntrusiveDeque field_d;
    dl field_i;
    dl field_c;
    long field_e;
    int field_h;
    PacketBuffer field_l;
    volatile int field_a;
    PacketBuffer field_g;
    byte field_m;
    volatile int field_b;
    NetworkArchiveRequest field_k;

    final boolean isPrefetchQueueFull(int param0) {
        if (param0 != 20) {
          return false;
        }
        return 20 <= this.getPrefetchRequestCount((byte) -25) ? true : false;
    }

    final int getPriorityRequestCount(int param0) {
        if (param0 == 24547) {
          return this.field_n.a(-110) + this.field_j.a(-108);
        }
        this.isPriorityQueueFull(-103);
        return this.field_n.a(-110) + this.field_j.a(-108);
    }

    abstract void attachSocket(int param0, boolean param1, Object param2);

    abstract void close(byte param0);

    abstract void resetAfterValidationFailure(int param0);

    final int getPrefetchRequestCount(byte param0) {
        if (param0 == -25) {
          return this.field_i.a(param0 - 82) + this.field_c.a(-112);
        }
        this.enqueueRequest(63, 40, 75, true, (byte) 12);
        return this.field_i.a(param0 - 82) + this.field_c.a(-112);
    }

    final NetworkArchiveRequest enqueueRequest(int param0, int param1, int param2, boolean param3, byte param4) {
        NetworkArchiveRequest stackIn_3_0 = null;
        boolean stackIn_4_1 = false;
        NetworkArchiveRequest stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        long var6;
        NetworkArchiveRequest var8;
        NetworkArchiveRequest var8Lifetime1;
        var6 = (long)param1 + ((long)param0 << 32);
        if (param2 >= 74) {
          var8 = new NetworkArchiveRequest();
          var8.field_q = param4;
          stackIn_15_0 = var8;
          stackIn_16_1 = (!param3) ? false : true;
          stackIn_15_0.field_m = stackIn_16_1;
          var8.field_f = var6;
          if (param3) {
            if (20 <= this.getPriorityRequestCount(24547)) {
              throw new RuntimeException();
            }
            this.field_n.a(var8, (byte) -73);
            return var8;
          }
          if (this.getPrefetchRequestCount((byte) -25) >= 20) {
            throw new RuntimeException();
          }
          this.field_i.a(var8, (byte) -105);
          return var8;
        }
        field_d = (IntrusiveDeque) null;
        var8Lifetime1 = new NetworkArchiveRequest();
        var8Lifetime1.field_q = param4;
        stackIn_3_0 = var8Lifetime1;
        stackIn_4_1 = (!param3) ? false : true;
        stackIn_3_0.field_m = stackIn_4_1;
        var8Lifetime1.field_f = var6;
        if (param3) {
          if (20 <= this.getPriorityRequestCount(24547)) {
            throw new RuntimeException();
          }
          this.field_n.a(var8Lifetime1, (byte) -73);
          return var8Lifetime1;
        }
        if (this.getPrefetchRequestCount((byte) -25) >= 20) {
          throw new RuntimeException();
        }
        this.field_i.a(var8Lifetime1, (byte) -105);
        return var8Lifetime1;
    }

    abstract boolean pollNetwork(byte param0);

    public static void clearStaticReferences(byte param0) {
        field_f = null;
        field_d = null;
        if (param0 < 99) {
          field_d = (IntrusiveDeque) null;
        }
    }

    final static CoverageBitmapFont a(ResourceArchive param0, int param1, ResourceArchive param2, int param3, int param4) {
        RuntimeException var5 = null;
        CoverageBitmapFont stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!wg.a(param4, param3, param2, -3)) {
            return null;
          }
          if (param1 != -26348) {
            field_f = (Sprite[]) null;
          }
          stackIn_6_0 = rl.a(param1 - 6118, param0.getFile(255, param3, param4));
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("wl.L(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final boolean isPriorityQueueFull(int param0) {
        if (param0 == 20) {
          return 20 <= this.getPriorityRequestCount(param0 + 24527) ? true : false;
        }
        this.field_n = (dl) null;
        return 20 <= this.getPriorityRequestCount(param0 + 24527) ? true : false;
    }

    final static void e(byte param0) {
        if (AwtRasterBuffer.field_f == null) {
          return;
        }
        ValidationStatusIcon.a(AwtRasterBuffer.field_f, (byte) 9);
        AwtRasterBuffer.field_f.exitFullscreen((byte) -107, rc.field_k);
        AwtRasterBuffer.field_f = null;
        if (ci.field_a != null) {
          ci.field_a.e(0);
        }
        if (param0 > 98) {
          ie.field_e.requestFocus();
          return;
        }
    }

    ArchiveNetworkClient() {
        this.field_n = new dl();
        this.field_j = new dl();
        this.field_i = new dl();
        this.field_c = new dl();
        this.field_l = new PacketBuffer(6);
        this.field_b = 0;
        this.field_a = 0;
        this.field_m = (byte) 0;
        this.field_g = new PacketBuffer(10);
    }

    static {
    }
}
