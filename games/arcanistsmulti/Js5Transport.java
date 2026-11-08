/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class Js5Transport {
    DualLinkDeque field_b;
    static IntrusiveDeque field_j;
    static String field_l;
    static boolean field_d;
    DualLinkDeque field_g;
    static String field_h;
    DualLinkDeque field_f;
    DualLinkDeque field_m;
    int field_k;
    PacketBuffer field_c;
    long field_p;
    PacketBuffer field_e;
    volatile int field_o;
    byte field_a;
    volatile int field_i;
    Js5NetworkRequest field_n;

    final boolean isUrgentQueueFull(byte param0) {
        int var2 = 68 / ((param0 + 24) / 40);
        return this.pendingUrgentCount((byte) 88) >= 20 ? true : false;
    }

    final boolean isNormalQueueFull(int param0) {
        if (param0 == -21) {
          return this.pendingRequestCount(-88) >= 20 ? true : false;
        }
        this.requestGroup(-35, true, 82, (byte) 60, (byte) -102);
        return this.pendingRequestCount(-88) >= 20 ? true : false;
    }

    abstract void closeConnection(int param0);

    abstract void dropConnection(byte param0);

    final int pendingRequestCount(int param0) {
        int var2 = 52 / ((param0 + 23) / 41);
        return this.field_f.size((byte) -123) + this.field_m.size((byte) -90);
    }

    final static boolean f(int param0) {
        if (!SocketJs5Transport.field_r) {
          return false;
        }
        if (~nj.field_c == param0) {
          return true;
        }
        return false;
    }

    final static boolean isFeatureEnabled(int param0, byte param1) {
        if (param1 > -3) {
          Js5Transport.f(-108);
          if (-1 == param0) {
            return true;
          }
          return (1 << param0 & BufferedSocket.field_o) != 0 ? true : false;
        }
        if (-1 == param0) {
          return true;
        }
        return (1 << param0 & BufferedSocket.field_o) != 0 ? true : false;
    }

    abstract boolean process(int param0);

    abstract void setConnection(boolean param0, boolean param1, Object param2);

    final static String a(String param0, int param1, int param2, String param3) {
        le var4 = null;
        RuntimeException var4_ref = null;
        Battle var5 = null;
        int var6 = 0;
        String stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = SpriteState.field_z;
          if (param1 != 10) {
            field_d = false;
          }
          if (var4 == null) {
            var4 = r.field_b;
          }
          var5 = var4.field_V;
          var6 = var5.getPlayerStat((byte) 120, param2);
          if (var6 != -1) {
            param0 = param0 + param3 + var5.field_k[var6] + "<br>";
          }
          stackIn_7_0 = (String) (param0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("lk.M(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void drawShadowedText(int param0, int param1, String param2, int param3, int param4, int param5) {
        try {
          CachedArchiveProvider.field_t.drawText(param2, param1 + 1, 1 + CachedArchiveProvider.field_t.field_C + param0, (16711422 & param3) >> 1, 4144959 & param3 >> 2);
          if (param5 >= -104) {
            Js5Transport.f(68);
          }
          CachedArchiveProvider.field_t.drawText(param2, param1, CachedArchiveProvider.field_t.field_C + (param0 - 1), param3, param3);
          CachedArchiveProvider.field_t.drawText(param2, -1 + param1, CachedArchiveProvider.field_t.field_C + param0, param3, param3);
          CachedArchiveProvider.field_t.drawText(param2, param1, param0 + CachedArchiveProvider.field_t.field_C, param4, -1);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "lk.R(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_h = null;
        field_l = null;
        field_j = null;
        if (param0 != 11959) {
          field_l = (String) null;
        }
    }

    final Js5NetworkRequest requestGroup(int param0, boolean param1, int param2, byte param3, byte param4) {
        Js5NetworkRequest stackIn_3_0 = null;
        boolean stackIn_4_1 = false;
        Js5NetworkRequest stackIn_15_0 = null;
        boolean stackIn_16_1 = false;
        long var6;
        Js5NetworkRequest var8;
        Js5NetworkRequest var8Lifetime1;
        var6 = ((long)param2 << 32) + (long)param0;
        if (param3 == -80) {
          var8 = new Js5NetworkRequest();
          var8.field_y = param4;
          stackIn_15_0 = var8;
          stackIn_16_1 = (!param1) ? false : true;
          stackIn_15_0.field_q = stackIn_16_1;
          var8.secondaryKey = var6;
          if (!param1) {
            if (this.pendingRequestCount(-72) >= 20) {
              throw new RuntimeException();
            }
            this.field_f.addLast(var8, param3 ^ -15963);
            return var8;
          }
          if (this.pendingUrgentCount((byte) 88) >= 20) {
            throw new RuntimeException();
          }
          this.field_b.addLast(var8, 15893);
          return var8;
        }
        this.isUrgentQueueFull((byte) -127);
        var8Lifetime1 = new Js5NetworkRequest();
        var8Lifetime1.field_y = param4;
        stackIn_3_0 = var8Lifetime1;
        stackIn_4_1 = (!param1) ? false : true;
        stackIn_3_0.field_q = stackIn_4_1;
        var8Lifetime1.secondaryKey = var6;
        if (!param1) {
          if (this.pendingRequestCount(-72) >= 20) {
            throw new RuntimeException();
          }
          this.field_f.addLast(var8Lifetime1, param3 ^ -15963);
          return var8Lifetime1;
        }
        if (this.pendingUrgentCount((byte) 88) >= 20) {
          throw new RuntimeException();
        }
        this.field_b.addLast(var8Lifetime1, 15893);
        return var8Lifetime1;
    }

    final int pendingUrgentCount(byte param0) {
        if (param0 == 88) {
          return this.field_b.size((byte) -112) + this.field_g.size((byte) -68);
        }
        this.field_p = -111L;
        return this.field_b.size((byte) -112) + this.field_g.size((byte) -68);
    }

    Js5Transport() {
        this.field_b = new DualLinkDeque();
        this.field_g = new DualLinkDeque();
        this.field_f = new DualLinkDeque();
        this.field_m = new DualLinkDeque();
        this.field_c = new PacketBuffer(6);
        this.field_i = 0;
        this.field_a = (byte) 0;
        this.field_o = 0;
        this.field_e = new PacketBuffer(10);
    }

    static {
        field_l = "Show private chat from my friends and opponents";
        field_j = new IntrusiveDeque();
        field_h = "Quick Chat lobby";
    }
}
