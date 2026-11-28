/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class gb {
    static he field_e;
    hl field_i;
    hl field_m;
    hl field_f;
    hl field_b;
    int field_j;
    long field_k;
    PacketBuffer field_l;
    PacketBuffer field_g;
    volatile int field_h;
    volatile int field_c;
    byte field_a;
    NetworkArchiveRequest field_d;

    abstract void b(byte param0);

    abstract void a(byte param0);

    abstract boolean b(boolean param0);

    abstract void a(Object param0, boolean param1, byte param2);

    final int c(byte param0) {
        if (param0 < -64) {
          return this.field_i.b(1423132065) + this.field_m.b(1423132065);
        }
        this.c((byte) -91);
        return this.field_i.b(1423132065) + this.field_m.b(1423132065);
    }

    public static void clearStaticReferences(int param0) {
        field_e = null;
        if (param0 != 6) {
          field_e = (he) null;
        }
    }

    final boolean a(boolean param0) {
        if (!param0) {
          return false;
        }
        return 20 <= this.c((byte) -74) ? true : false;
    }

    final boolean c(int param0) {
        if (param0 == 20) {
          return this.a(111) >= 20 ? true : false;
        }
        this.field_l = (PacketBuffer) null;
        return this.a(111) >= 20 ? true : false;
    }

    static long bitwiseOr(long param0, long param1) {
        return param0 | param1;
    }

    final NetworkArchiveRequest a(int param0, int param1, byte param2, int param3, boolean param4) {
        long var6 = ((long)param0 << 32) + (long)param3;
        NetworkArchiveRequest var8 = new NetworkArchiveRequest();
        if (param1 != 11259) {
          return (NetworkArchiveRequest) null;
        }
        var8.field_y = param4 ? true : false;
        var8.field_N = param2;
        var8.secondaryKey = var6;
        if (param4) {
          if (!(this.c((byte) -115) < 20)) {
            throw new RuntimeException();
          }
          this.field_i.a(var8, 0);
        } else {
          if (!(20 > this.a(100))) {
            throw new RuntimeException();
          }
          this.field_f.a(var8, 0);
        }
        return var8;
    }

    final static void a(Throwable param0, String param1, int param2) {
        try {
          PlatformTaskDispatcher stackIn_13_0;
          int stackIn_13_1;
          java.net.URL stackIn_13_2;
          java.net.URL stackIn_13_3;
          java.net.URL stackIn_13_4;
          StringBuilder stackIn_13_5;
          java.net.URL stackIn_14_2;
          java.net.URL stackIn_14_3;
          String stackIn_14_6;
          Throwable decompiledCaughtException = null;
          String var3 = null;
          Exception var3_ref = null;
          PlatformTask var4 = null;
          DataInputStream var5 = null;
          int var6 = 0;
          String var7 = null;
          String var8 = null;
          String var9 = null;
          String var10 = null;
          var6 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          try {
            if (param2 != 10) {
              return;
            }
            var3 = "";
            if (param0 != null) {
              var3 = ResizableModalDialog.a(param0, (byte) -36);
            }
            if (param1 != null) {
              if (param0 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param1;
            }
            ll.a(-1054, var3);
            var7 = AccountRequestState.a(":", (byte) 127, "%3a", var3);
            var8 = AccountRequestState.a("@", (byte) 127, "%40", var7);
            var9 = AccountRequestState.a("&", (byte) 127, "%26", var8);
            var10 = AccountRequestState.a("#", (byte) 127, "%23", var9);
            if (LevelSession.field_K == null) {
              return;
            }
            stackIn_13_0 = DiskCacheWorker.field_h;
            stackIn_13_1 = 107;
            stackIn_13_2 = null;
            stackIn_13_3 = null;
            stackIn_13_4 = LevelSession.field_K.getCodeBase();
            stackIn_13_5 = new StringBuilder().append("clienterror.ws?c=").append(vb.field_o).append("&u=");
            if (null == DiskArchiveRequest.field_J) {
              stackIn_14_2 = null;
              stackIn_14_3 = null;
              stackIn_14_6 = "" + sf.field_l;
            } else {
              stackIn_14_2 = null;
              stackIn_14_3 = null;
              stackIn_14_6 = DiskArchiveRequest.field_J;
            }
            var4 = ((PlatformTaskDispatcher) (Object) stackIn_13_0).requestUrlStream(stackIn_13_1, new java.net.URL(stackIn_13_4, ((StringBuilder) (Object) stackIn_13_5).append(stackIn_14_6).append("&v1=").append(PlatformTaskDispatcher.field_n).append("&v2=").append(PlatformTaskDispatcher.field_t).append("&e=").append(var10).toString()));
            while (var4.status == 0) {
              kk.sleepMillis(1L, true);
            }
            if (var4.status != 1) {
              return;
            }
            var5 = (DataInputStream) (var4.result);
            var5.read();
            var5.close();
            return;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(int param0) {
        if (param0 <= 63) {
          return 54;
        }
        return this.field_f.b(1423132065) + this.field_b.b(1423132065);
    }

    gb() {
        this.field_i = new hl();
        this.field_m = new hl();
        this.field_f = new hl();
        this.field_b = new hl();
        this.field_l = new PacketBuffer(6);
        this.field_c = 0;
        this.field_a = (byte) 0;
        this.field_h = 0;
        this.field_g = new PacketBuffer(10);
    }

    static {
    }
}
