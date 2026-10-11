/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jo {
    static String field_e;
    private bc field_f;
    private bc field_h;
    private ol field_b;
    static qr field_a;
    static String field_d;
    static String field_c;
    static String[] field_g;

    public static void a(boolean param0) {
        field_g = null;
        field_c = null;
        field_e = null;
        if (!param0) {
          jo.a(false);
        }
        field_d = null;
        field_a = null;
    }

    final static void a(int param0, ob param1) {
        try {
          int var4 = 0;
          byte[] var2 = null;
          int var3_int = 0;
          int var5 = 0;
          byte[] var6 = null;
          RuntimeException stackIn_19_0 = null;
          StringBuilder stackIn_19_1 = null;
          String stackIn_20_2 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var2_ref = null;
          Exception var3 = null;
          var5 = ShatteredPlansClient.field_F ? 1 : 0;
          try {
            var6 = new byte[param0];
            var2 = var6;
            if (vc.field_a != null) {
              try {
                vc.field_a.a((byte) 95, 0L);
                vc.field_a.a(var6, true);
                for (var3_int = 0; var3_int < 24; var3_int++) {
                  if (var2[var3_int] == 0) {
                    continue;
                  }
                  break;
                }
                if (var3_int >= 24) {
                  throw new IOException();
                }
                param1.a(0, 24, var2, 22186);
                decompiledRegionSelector0 = 0;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                for (var4 = 0; var4 < 24; var4++) {
                  var2[var4] = (byte)-1;
                }
                decompiledRegionSelector0 = 1;
              }
              if (decompiledRegionSelector0 == 0) {
                return;
              }
            }
            param1.a(0, 24, var2, 22186);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_19_0 = var2_ref;
            stackIn_19_1 = new StringBuilder().append("jo.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_20_2 = "null";
            } else {
              stackIn_20_2 = "{...}";
            }
            throw r.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, gh param1, boolean param2, int param3) {
        try {
          if (param0 != 32767) {
            gh var5 = (gh) null;
            jo.a(6, (gh) null, false, -66);
          }
          u.field_b.a(1000000, 256, (byte) -121, !param2 ? true : false, param3, param1);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "jo.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    jo(int param0, bc param1, bc param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_b = new ol(64);
        try {
          this.field_h = param2;
          this.field_f = param1;
          if (this.field_f != null) {
            this.field_f.a(0, -26268);
          }
          if (this.field_h != null) {
            this.field_h.a(0, -26268);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("jo.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final si a(int param0, byte param1) {
        byte[] var4 = null;
        if (param1 != 100) {
          gh var5 = (gh) null;
          jo.a(71, (gh) null, true, -32);
        }
        si var3 = (si) (this.field_b.a((long)param0, param1 - 100));
        if (var3 != null) {
          return var3;
        }
        if (param0 < 32768) {
          var4 = this.field_f.a(0, -1, param0);
        } else {
          var4 = this.field_h.a(0, param1 ^ -101, param0 & 32767);
        }
        si var6 = new si();
        if (var4 != null) {
          var6.a(new ob(var4), -1);
        }
        if (param0 >= 32768) {
          var6.e(-81);
        }
        this.field_b.a((long)param0, var6, (byte) -108);
        return var6;
    }

    static {
        field_g = new String[16];
        field_c = "Game";
        field_e = "Match by...";
    }
}
