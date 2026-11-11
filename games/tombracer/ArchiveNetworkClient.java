/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

abstract class ArchiveNetworkClient {
    SecondaryLinkQueue field_e;
    static String field_l;
    SecondaryLinkQueue field_m;
    static String field_f;
    static int textureHeight;
    static String field_b;
    SecondaryLinkQueue field_c;
    SecondaryLinkQueue field_k;
    long field_j;
    PacketBuffer field_o;
    int field_p;
    PacketBuffer field_h;
    volatile int field_n;
    volatile int field_a;
    byte field_d;
    NetworkArchiveRequest field_g;

    public static void releaseStatics(byte param0) {
        if (param0 != 0) {
          field_l = (String) null;
        }
        field_b = null;
        field_l = null;
        field_f = null;
    }

    final boolean isUrgentQueueFull(int param0) {
        if (param0 != -21) {
          this.isPrefetchQueueFull(-15);
        }
        return this.getUrgentRequestCount(-3) >= 20 ? true : false;
    }

    final int getUrgentRequestCount(int param0) {
        if (param0 != -3) {
          ArchiveNetworkClient.b((byte) 52);
        }
        return this.field_e.size((byte) -56) + this.field_m.size((byte) -92);
    }

    final static void resendQueuedListRequests(int param0, int param1) {
        int var3 = 0;
        toa var4 = null;
        IntArrayRequest var5 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 != -21) {
            return;
          }
          var4 = (toa) (BridgeModel.field_m.first(-80));
          while (var4 != null) {
            uca.writeQueuedListRequest(param0, var4, (byte) 93);
            var4 = (toa) (BridgeModel.field_m.next(113));
          }
          var5 = (IntArrayRequest) (Player.field_I.first(param1 ^ 91));
          while (var5 != null) {
            MenuEntry.a(param0, -23814, var5);
            var5 = (IntArrayRequest) (Player.field_I.next(121));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) var2), "qda.B(" + param0 + ',' + param1 + ')');
        }
    }

    final static int b(byte param0) {
        try {
          int stackIn_16_0 = 0;
          int stackIn_26_0 = 0;
          int stackIn_31_0 = 0;
          int stackIn_34_0 = 0;
          int stackIn_36_0 = 0;
          Throwable decompiledCaughtException = null;
          int var1_int = 0;
          IOException var1 = null;
          PacketBuffer var2 = null;
          if (4 <= StatReportingScoringObserver.field_l.field_a) {
            if (StatReportingScoringObserver.field_l.field_n == -1) {
              return 3;
            }
            if (StatReportingScoringObserver.field_l.field_n != -2) {
              return 1;
            }
            return 4;
          }
          if (param0 != -66) {
            return -114;
          }
          try {
            if (ColourKeyOperator.field_m == 0) {
              S2CProfileUpdatePacket.field_c = oi.field_a.requestSocket(-24818, TileGridCell.field_a, du.field_d);
              ColourKeyOperator.field_m = ColourKeyOperator.field_m + 1;
            }
            if (ColourKeyOperator.field_m == 1) {
              if (2 == S2CProfileUpdatePacket.field_c.field_b) {
                stackIn_16_0 = du.recordArchiveConnectionFailure(-1, (byte) 122);
                return stackIn_16_0;
              }
              if (S2CProfileUpdatePacket.field_c.field_b == 1) {
                ColourKeyOperator.field_m = ColourKeyOperator.field_m + 1;
              }
            }
            if (ColourKeyOperator.field_m == 2) {
              jia.field_a = new BufferedSocket((java.net.Socket) (S2CProfileUpdatePacket.field_c.field_f), oi.field_a);
              var2 = new PacketBuffer(13);
              C2SActionPacket.writeSessionHeader((byte) 107, pu.field_b, var2, MapWaypoint.field_n, GzipInflater.field_a);
              var2.writeByte(15, 0);
              var2.writeInt(CourseLayout.field_a, (byte) 117);
              jia.field_a.write(var2.payload, 0, 13, 106);
              ColourKeyOperator.field_m = ColourKeyOperator.field_m + 1;
              pm.field_n = 30000L + bva.currentTimeMillis((byte) -107);
            }
            if (ColourKeyOperator.field_m == 3) {
              if (jia.field_a.available(0) <= 0) {
                if (bva.currentTimeMillis((byte) -107) > pm.field_n) {
                  stackIn_31_0 = du.recordArchiveConnectionFailure(-2, (byte) 17);
                  return stackIn_31_0;
                }
              } else {
                var1_int = jia.field_a.readSingleByte(-2147483648);
                if (var1_int != 0) {
                  stackIn_26_0 = du.recordArchiveConnectionFailure(var1_int, (byte) -26);
                  return stackIn_26_0;
                }
                ColourKeyOperator.field_m = ColourKeyOperator.field_m + 1;
              }
            }
            if (4 != ColourKeyOperator.field_m) {
              stackIn_36_0 = -1;
              return stackIn_36_0;
            }
            StatReportingScoringObserver.field_l.attachConnection(jia.field_a, (byte) 54, StatefulWidgetPainter.field_q);
            ColourKeyOperator.field_m = 0;
            jia.field_a = null;
            S2CProfileUpdatePacket.field_c = null;
            stackIn_34_0 = 0;
            return stackIn_34_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (IOException) (Object) decompiledCaughtException;
            return du.recordArchiveConnectionFailure(-3, (byte) -93);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void closeSocket(int param0);

    abstract void invalidateConnection(int param0);

    abstract boolean processNetwork(int param0);

    abstract void attachConnection(Object param0, byte param1, boolean param2);

    final boolean isPrefetchQueueFull(int param0) {
        if (param0 != -21) {
          this.field_o = (PacketBuffer) null;
        }
        return this.getPrefetchRequestCount((byte) 78) >= 20 ? true : false;
    }

    final static int countSetBits(BitSet param0, int param1) {
        int var3 = 0;
        int var2_int = 0;
        int var4 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          var2_int = 0;
          if (param1 < 80) {
            textureHeight = 11;
          }
          for (var3 = 0; var3 < param0.size(); var3++) {
            if (param0.get(var3)) {
              var2_int++;
            }
          }
          stackIn_11_0 = var2_int;
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("qda.F(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final int getPrefetchRequestCount(byte param0) {
        if (param0 != 78) {
          this.field_k = (SecondaryLinkQueue) null;
        }
        return this.field_c.size((byte) -77) + this.field_k.size((byte) -43);
    }

    final NetworkArchiveRequest queueRequest(int param0, boolean param1, int param2, int param3, byte param4) {
        long var6 = ((long)param2 << 32) + (long)param0;
        NetworkArchiveRequest var8 = new NetworkArchiveRequest();
        var8.secondaryKey = var6;
        if (param3 != -21) {
          return (NetworkArchiveRequest) null;
        }
        var8.field_l = param1 ? true : false;
        var8.field_q = param4;
        if (param1) {
          if (!(this.getUrgentRequestCount(param3 ^ 22) < 20)) {
            throw new RuntimeException();
          }
          this.field_e.addLast(var8, (byte) -78);
        } else {
          if (!(this.getPrefetchRequestCount((byte) 78) < 20)) {
            throw new RuntimeException();
          }
          this.field_c.addLast(var8, (byte) -96);
        }
        return var8;
    }

    final static boolean containsNonAlphanumeric(byte param0, String param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 != -72) {
            field_l = (String) null;
          }
          for (var2_int = 0; param1.length() > var2_int; var2_int++) {
            var3 = param1.charAt(var2_int);
            if (!PressureSwitchBehaviour.isAsciiLetter((byte) -20, (char) var3) &&
              !OpenGlEnvironmentWaterEffect.isAsciiDigit(param0 + 190, (char) var3)) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("qda.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    ArchiveNetworkClient() {
        this.field_e = new SecondaryLinkQueue();
        this.field_m = new SecondaryLinkQueue();
        this.field_c = new SecondaryLinkQueue();
        this.field_k = new SecondaryLinkQueue();
        this.field_o = new PacketBuffer(6);
        this.field_a = 0;
        this.field_n = 0;
        this.field_d = (byte) 0;
        this.field_h = new PacketBuffer(10);
    }

    static {
        field_f = "Unfortunately we are unable to create an account for you at this time.";
        field_l = "Try changing the following settings:  ";
    }
}
