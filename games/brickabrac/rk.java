/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rk extends mh {
    mh field_Rb;
    static String field_Tb;
    static RgbSprite field_Sb;
    private mh field_Pb;
    static int achievementTransitionMask;

    private final void b(int param0, int param1, int param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        var4 = -param2;
        var5 = -param2;
        if (this.field_Pb != null) {
          var4 = this.field_Pb.g(71);
        }
        if (null != this.field_Rb) {
          var5 = this.field_Rb.a(-param1 + (-param1 + this.field_Ib) - (var4 + param2), 0);
        }
        var7 = 40 / ((-47 - param0) / 42);
        var6 = param2 + var4 + param1 + (var5 + param1);
        if (this.field_Ib < var6) {
          var5 = var5 + (this.field_Ib - var6);
          var6 = this.field_Ib;
        }
        if (this.field_S == 1) {
          param1 = param1 + (this.field_Ib - var6) / 2;
        }
        if (2 == this.field_S) {
          param1 = param1 + (-var6 + this.field_Ib);
        }
        if (null != this.field_Pb) {
          this.field_Pb.a(this.field_cb, 0, param1, var4, (byte) 64);
          this.field_Pb.field_Q = this.field_Q;
        }
        if (null != this.field_Rb) {
          this.field_Rb.a(this.field_cb, 0, param2 + (param1 + var4), var5, (byte) 64);
          this.field_Rb.field_Q = this.field_Q;
          if (null != this.field_Pb) {
            this.field_Rb.field_S = 0;
          } else {
            this.field_Rb.field_S = this.field_S;
          }
        }
    }

    final static boolean a(byte param0, char param1) {
        boolean stackIn_13_0 = false;
        if (param0 >= -58) {
          return false;
        }
        stackIn_13_0 = ((!(param1 < 48) &&
          !(param1 > 57)) ||
          (!(param1 < 65) &&
          !(param1 > 90)) ||
          (!(param1 < 97) &&
          !(122 < param1)));
        return stackIn_13_0;
    }

    public static void d(byte param0) {
        field_Tb = null;
        field_Sb = null;
        if (param0 != 21) {
          rk.d((byte) -26);
        }
    }

    final static void a(String param0, Throwable param1, int param2) {
        try {
          PlatformServices stackIn_16_0;
          int stackIn_16_1;
          java.net.URL stackIn_16_2;
          java.net.URL stackIn_16_3;
          java.net.URL stackIn_16_4;
          StringBuilder stackIn_16_5;
          java.net.URL stackIn_17_2;
          java.net.URL stackIn_17_3;
          String stackIn_17_6;
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
          var6 = BrickABrac.field_J ? 1 : 0;
          try {
            if (param2 <= 27) {
              rk.a((byte) -93, 'K');
            }
            var3 = "";
            if (param1 != null) {
              var3 = pp.a(22570, param1);
            }
            if (param0 != null) {
              if (param1 != null) {
                var3 = var3 + " | ";
              }
              var3 = var3 + param0;
            }
            me.a(var3, -107);
            var7 = oh.a((byte) 13, "%3a", var3, ":");
            var8 = oh.a((byte) 13, "%40", var7, "@");
            var9 = oh.a((byte) 13, "%26", var8, "&");
            var10 = oh.a((byte) 13, "%23", var9, "#");
            if (null == mk.field_i) {
              return;
            }
            stackIn_16_0 = LevelPackLoader.field_e;
            stackIn_16_1 = -49;
            stackIn_16_2 = null;
            stackIn_16_3 = null;
            stackIn_16_4 = mk.field_i.getCodeBase();
            stackIn_16_5 = new StringBuilder().append("clienterror.ws?c=").append(oj.field_m).append("&u=");
            if (ua.field_a == null) {
              stackIn_17_2 = null;
              stackIn_17_3 = null;
              stackIn_17_6 = "" + sb.field_e;
            } else {
              stackIn_17_2 = null;
              stackIn_17_3 = null;
              stackIn_17_6 = ua.field_a;
            }
            var4 = ((PlatformServices) (Object) stackIn_16_0).a((byte) stackIn_16_1, new java.net.URL(stackIn_16_4, ((StringBuilder) (Object) stackIn_16_5).append(stackIn_17_6).append("&v1=").append(PlatformServices.javaVendor).append("&v2=").append(PlatformServices.javaVersion).append("&e=").append(var10).toString()));
            while (var4.status == 0) {
              wj.sleepMillis(-125, 1L);
            }
            if (var4.status == 1) {
              var5 = (DataInputStream) (var4.result);
              var5.read();
              var5.close();
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int a(int param0, int param1, int param2) {
        if (param1 != 24) {
          rk.a((byte) 108, '￱');
        }
        int var4 = -param0;
        if (this.field_Pb != null) {
          var4 = this.field_Pb.g(107);
        }
        int var5 = -param0;
        if (null != this.field_Rb) {
          var5 = this.field_Rb.g(64);
        }
        return param2 + var4 + (param0 + var5) + param2;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param0 != -10411) {
          Throwable var9 = (Throwable) null;
          rk.a((String) null, (Throwable) null, 64);
        }
        this.a(param5, param1, param4, param6, (byte) 64);
        this.b(param0 ^ 10436, param2, param3);
    }

    rk(long param0, mh param1, mh param2, mh param3, RgbSprite param4, String param5) {
        super(param0, param1);
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var8 = null;
        try {
          if (param4 != null) {
            this.field_Pb = new mh(0L, param2);
            this.field_Pb.field_wb = param4;
            this.a(this.field_Pb, 0);
          }
          if (param5 != null) {
            this.field_Rb = new mh(0L, param3, param5);
            this.a(this.field_Rb, 0);
            this.c(true);
          } else {
            this.c(true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_9_0 = var8;
          stackIn_9_1 = new StringBuilder().append("rk.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_21_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',');
          if (param5 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static dc[] a(BitPacketBuffer param0, int param1) {
        int var5 = 0;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        dc[] var4 = null;
        int var6_int = 0;
        dc var6 = null;
        int var7 = 0;
        Object stackIn_3_0 = null;
        dc[] stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = BrickABrac.field_J ? 1 : 0;
        try {
          var2_int = param0.readBits(8, (byte) -85);
          if (var2_int > 0) {
            stackIn_3_0 = null;
            return (dc[]) (stackIn_3_0);
          }
          if (param1 != 24) {
            field_Tb = (String) null;
          }
          var3 = param0.readBits(12, (byte) 85);
          var4 = new dc[var3];
          for (var5 = 0; var5 < var3; var5++) {
            if (DirectByteStorage.a(false, param0)) {
              var6 = new dc();
              param0.readBits(24, (byte) -115);
              param0.readBits(24, (byte) 107);
              var6.field_a = param0.readBits(24, (byte) -86);
              param0.readBits(9, (byte) 110);
              param0.readBits(12, (byte) -113);
              param0.readBits(12, (byte) -91);
              param0.readBits(12, (byte) -112);
              var4[var5] = var6;
            } else {
              var6_int = param0.readBits(GameClock.a(-1 + var5, 15), (byte) 98);
              var4[var5] = var4[var6_int];
            }
          }
          stackIn_13_0 = var4;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("rk.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
    }
}
