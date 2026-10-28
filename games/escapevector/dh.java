/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class dh {
    static boolean field_c;
    static int field_d;
    static int field_b;
    static int[] field_e;
    private java.util.zip.Inflater field_a;

    final static void a(boolean param0, byte param1, ResourceArchive param2, ResourceArchive param3, ResourceArchive param4) {
        try {
          di.field_g = RasterBuffer.a((byte) 41, "");
          di.field_g.complete((byte) -128, false);
          wc.a(83, param2, param3, param4);
          kn.a((byte) -96);
          dn.field_q = RasterBuffer.field_g;
          if (param1 > -111) {
            dh.a(13, (byte) 34);
          }
          ui.field_b = RasterBuffer.field_g;
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "dh.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static ja[] a(int param0, SystemTaskService param1) {
        String stackIn_22_2 = null;
        int var7 = EscapeVector.obfuscationControl;
        try {
          if (!param1.c(0)) {
            ja[] stackIn_4_0 = new ja[]{};
            return stackIn_4_0;
          }
          SystemTask var8 = param1.a(5);
          while (var8.field_f == 0) {
            en.a((byte) 101, 10L);
          }
          if (var8.field_f == 2) {
            ja[] stackIn_10_0 = new ja[]{};
            return stackIn_10_0;
          }
          if (param0 != 6629) {
            ja[] stackIn_13_0 = (ja[]) null;
            return stackIn_13_0;
          }
          int[] var10 = (int[]) (var8.field_b);
          int[] var9 = var10;
          int[] var3 = var9;
          ja[] var4 = new ja[var10.length >> 2];
          for (int var5 = 0; var5 < var4.length; var5++) {
            ja var6 = new ja();
            var4[var5] = var6;
            var6.field_c = var3[var5 << 2];
            var6.field_g = var3[1 + (var5 << 2)];
            var6.field_d = var3[(var5 << 2) + 2];
            var6.field_f = var3[3 + (var5 << 2)];
          }
          ja[] stackIn_18_0 = var4;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_21_0 = var2;
          StringBuilder stackIn_21_1 = new StringBuilder().append("dh.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    public dh() {
        this(-1, 1000000, 1000000);
    }

    final static boolean a(int param0, byte param1) {
        try {
          int[] var2 = ProxySocketConnector.field_m;
          int var3 = 0;
          if (param1 < 26) {
            dh.releaseStatics((byte) -79);
          }
          while (var3 < var2.length) {
            int var4 = var2[var3];
            if (param0 == var4) {
              return true;
            }
            var3++;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2_ref), "dh.B(" + param0 + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(byte guard) {
        field_e = null;
        int var1 = 61 % ((46 - guard) / 49);
    }

    final void a(int param0, byte[] param1, PacketBuffer param2) {
        try {
          try {
            if (param2.payload[param2.position] != 31 ||
              param2.payload[1 + param2.position] != -117) {
              throw new RuntimeException("");
            }
            if (null == this.field_a) {
              this.field_a = new java.util.zip.Inflater(true);
            }
            try {
              this.field_a.setInput(param2.payload, param2.position + 10, param2.payload.length + (-10 - param2.position) - 8);
              this.field_a.inflate(param1);
            } catch (Exception exception) {
              this.field_a.reset();
              throw new RuntimeException("");
            }
            this.field_a.reset();
            int var4_int = -73 % ((13 - param0) / 58);
          } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "dh.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private dh(int param0, int param1, int param2) {
    }

    static {
        field_e = new int[]{1, 1, 2, 2};
        field_c = false;
        field_d = 0;
        field_b = 1;
    }
}
