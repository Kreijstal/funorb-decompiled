/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class SocketConnector {
    int port;
    static Sprite field_c;
    String host;
    static RasterBuffer field_h;
    static UiComponent field_a;
    static long field_e;
    static String field_g;
    static String field_d;

    abstract java.net.Socket b(int param0) throws IOException;

    public static void a(byte param0) {
        field_c = null;
        if (param0 >= -61) {
          field_d = (String) null;
        }
        field_g = null;
        field_d = null;
        field_h = null;
        field_a = null;
    }

    final static void a(jh param0, boolean param1, PacketBuffer param2, boolean param3) {
        int var8 = 0;
        jh stackIn_6_0 = null;
        boolean stackIn_7_1 = false;
        jh stackIn_9_0 = null;
        boolean stackIn_10_1 = false;
        jh stackIn_12_0 = null;
        boolean stackIn_13_1 = false;
        jh stackIn_16_0 = null;
        boolean stackIn_17_1 = false;
        jh stackIn_19_0 = null;
        boolean stackIn_20_1 = false;
        jh stackIn_22_0 = null;
        int stackIn_23_1 = 0;
        int stackIn_26_0 = 0;
        int stackIn_31_0 = 0;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        String stackIn_43_2 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        var9 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param1) {
            param0.field_cc = param2.readUnsignedByte(31365);
          }
          param0.field_mc = param2.readUnsignedByte(31365);
          param0.field_Pb = param2.readUnsignedByte(31365);
          var4_int = param2.readUnsignedByte(31365);
          stackIn_6_0 = (jh) (param0);
          stackIn_7_1 = (0 != (var4_int & 128));
          stackIn_6_0.field_Mb = stackIn_7_1;
          stackIn_9_0 = (jh) (param0);
          stackIn_10_1 = ((var4_int & 64) != 0);
          stackIn_9_0.field_Fb = stackIn_10_1;
          stackIn_12_0 = (jh) (param0);
          stackIn_13_1 = ((32 & var4_int) != 0);
          stackIn_12_0.field_dc = stackIn_13_1;
          stackIn_16_0 = (jh) (param0);
          stackIn_17_1 = (param0.field_Mb) && (param0.field_cc < param0.field_mc);
          stackIn_16_0.field_Ob = stackIn_17_1;
          stackIn_19_0 = (jh) (param0);
          stackIn_20_1 = ((var4_int & 8) != 0);
          stackIn_19_0.field_Wb = stackIn_20_1;
          stackIn_22_0 = (jh) (param0);
          if ((16 & var4_int) == 0) {
            stackIn_23_1 = 1;
          } else {
            stackIn_23_1 = 2;
          }
          stackIn_22_0.field_fc = stackIn_23_1;
          stackIn_26_0 = ((4 & var4_int) == 0) ? 0 : 1;
          var5 = stackIn_26_0;
          if (param3) {
            field_d = (String) null;
          }
          param2.a(0, -6351, param0.field_Zb.length, param0.field_Zb);
          stackIn_31_0 = ((var4_int & 2) == 0) ? 0 : 1;
          var6 = stackIn_31_0;
          param0.field_Ub = param2.readUnsignedShort((byte) 69);
          param0.field_qc = bl.a((byte) 108) - (long)param2.readInt(-1478490344);
          if (var5 == 0) {
            param0.field_Sb = -1;
          } else {
            param0.field_Sb = param2.readInt(-1478490344);
          }
          param0.field_nc = param2.readLong((byte) -30);
          var7 = param2.position;
          param0.field_Nb = param2.readString((byte) -74);
          if (var6 != 0) {
            param0.field_bc = new String[param0.field_cc];
            param2.position = var7;
            for (var8 = 0; var8 < param0.field_cc; var8++) {
              param0.field_bc[var8] = param2.readString((byte) -91);
            }
            return;
          }
          param0.field_bc = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_42_0 = var4;
          stackIn_42_1 = new StringBuilder().append("dl.H(");
          if (param0 == null) {
            stackIn_43_2 = "null";
          } else {
            stackIn_43_2 = "{...}";
          }
          stackIn_45_1 = ((StringBuilder) (Object) stackIn_42_1).append(stackIn_43_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_42_0), ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0) {
        int var1_int = 0;
        int var2 = ZombieDawnMulti.field_E ? 1 : 0;
        if (null == field_h) {
          return;
        }
        try {
          g.c();
          if (param0 >= -18) {
            field_d = (String) null;
          }
          pk.field_c = new Sprite(60, 60);
          pk.field_c.bindAsRenderTarget();
          SoftwareRasterizer.fillCircle(30, 30, 28, 4521728);
          wi.field_g = new Sprite[8];
          for (var1_int = 0; var1_int < 8; var1_int++) {
            wi.field_g[var1_int] = new Sprite(22, 22);
            wi.field_g[var1_int].bindAsRenderTarget();
            SoftwareRasterizer.fillCircle(11, 11, var1_int + 2, 5622784);
            SoftwareRasterizer.fillCircle(11, 11, var1_int, 65793);
          }
          g.b();
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "dl.J(" + param0 + ')');
        }
    }

    final static Boolean c(byte param0) {
        Boolean var1 = dd.field_d;
        dd.field_d = null;
        int var2 = -94 % ((-29 - param0) / 60);
        return var1;
    }

    final java.net.Socket b(byte param0) throws IOException {
        if (param0 < 77) {
          return (java.net.Socket) null;
        }
        return new java.net.Socket(this.host, this.port);
    }

    static {
        field_d = "Two zombies lurch better than one.";
        field_g = "Type your age in years";
    }
}
