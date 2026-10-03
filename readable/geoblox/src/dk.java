/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class dk {
    static int categoryMatchCandidateCount;
    static int field_c;
    lk[] field_a;

    final int a(int param0, int param1) {
        int var4 = 0;
        lk var5 = null;
        int var6 = Geoblox.field_C;
        lk[] var7 = this.field_a;
        lk[] var3 = var7;
        for (var4 = 0; var7.length > var4; var4++) {
            var5 = var7[var4];
            if (~var5.field_c.length < ~param0) {
                return var5.field_c[param0];
            }
            param0 = param0 - (var5.field_c.length - 1);
        }
        if (param1 <= 109) {
            return 67;
        }
        return 0;
    }

    final int a(int param0) {
        int var2;
        lk[] var3;
        int var4;
        lk var5;
        int var7;
        int var6;
        var7 = Geoblox.field_C;
        var2 = -1;
        if (param0 < 60) {
          return 19;
        }
        L0: {
          if (null != this.field_a) {
            var3 = this.field_a;
            var4 = 0;
            while (true) {
              if (var3.length <= var4) {
                break L0;
              }
              var5 = var3[var4];
              if (var5 == null) {
                var4++;
                continue;
              }
              var6 = var5.a(0);
              if (var6 <= var2) {
                var4++;
                continue;
              }
              var2 = var6;
              var4++;
              continue;
            }
          }
        }
        return var2;
    }

    final int a(int param0, int param1, int param2, String param3) {
        int var9 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_13_0 = 0;
        int stackIn_13_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        var11 = Geoblox.field_C;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = param3.length();
          var8 = 20 / ((-30 - param0) / 56);
          for (var9 = 0; var9 < var7; var9++) {
            var10 = param3.charAt(var9);
            if (var10 != 60) {
              if (var10 != 62) {
                if ((var6 == 0) &&
                    (32 == var10)) {
                  var5_int++;
                }
              } else {
                var6 = 0;
              }
            } else {
              var6 = 1;
            }
          }
          if (var5_int <= 0) {
            stackIn_16_0 = 0;
            return stackIn_16_0;
          }
          stackIn_13_0 = param2 - param1 << 8;
          stackIn_13_1 = var5_int;
          stackIn_14_0 = stackIn_13_0 / stackIn_13_1;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = (RuntimeException) (var5);
          stackIn_19_1 = new StringBuilder().append("dk.J(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        try {
            int var1_int = 0;
            IOException iOException = null;
            int var3 = 0;
            Throwable decompiledCaughtException = null;
            RuntimeException var1 = null;
            IOException var2 = null;
            var3 = Geoblox.field_C;
            try {
              if (null != wg.archiveNetworkClient) {
                wg.archiveNetworkClient.closeSocket(-70);
              }
              if (param0 >= -65) {
                categoryMatchCandidateCount = 18;
              }
              if (cl.archiveDiskWorker != null) {
                cl.archiveDiskWorker.shutdown((byte) 51);
              }
              if (null != af.field_d) {
                try {
                  af.field_d.close(27034);
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  iOException = (IOException) (Object) decompiledCaughtException;
                }
              }
              if (null != je.field_h) {
                for (var1_int = 0; je.field_h.length > var1_int; var1_int++) {
                  if (null == je.field_h[var1_int]) {
                    continue;
                  }
                  try {
                    je.field_h[var1_int].close(27034);
                  } catch (java.io.IOException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var2 = (IOException) (Object) decompiledCaughtException;
                  }
                }
                return;
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var1), "dk.O(" + param0 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final int b(int param0) {
        int stackIn_7_0 = 0;
        if (param0 != -3111) {
          categoryMatchCandidateCount = 49;
        }
        if ((null != this.field_a) &&
            (this.field_a.length > 0)) {
          stackIn_7_0 = this.field_a[this.field_a.length - 1].field_a - this.field_a[0].field_d;
        } else {
          stackIn_7_0 = 0;
        }
        return stackIn_7_0;
    }

    final int a(byte param0, int param1) {
        int var3 = 0;
        lk var4 = null;
        int var5 = Geoblox.field_C;
        if (param0 != 24) {
            return -10;
        }
        for (var3 = 0; this.field_a.length > var3; var3++) {
            var4 = this.field_a[var3];
            if (!(var4.field_c.length <= param1)) {
                return var3;
            }
            param1 = param1 - (var4.field_c.length - 1);
        }
        return this.field_a.length;
    }

    final int a(int param0, int param1, int param2) {
        int var6 = 0;
        int var4;
        int var5;
        lk var7;
        int var8;
        int var9;
        var9 = Geoblox.field_C;
        if ((null != this.field_a) &&
            (this.field_a.length != 0) &&
            (this.field_a[0].field_d <= param2)) {
          if (this.field_a[-1 + this.field_a.length].field_a < param2) {
            return -1;
          }
          if (this.field_a.length == 1) {
            return this.field_a[0].a(71, param0);
          }
          var4 = 0;
          var5 = -2 % ((15 - param1) / 32);
          for (var6 = 0; var6 < this.field_a.length; var6++) {
            var7 = this.field_a[var6];
            if ((param2 >= var7.field_d) &&
                (var7.field_a >= param2)) {
              var8 = var7.a(-79, param0);
              if (-1 != var8) {
                return var4 + var8;
              }
              return -1;
            }
            var4 = var4 + (var7.field_c.length - 1);
          }
          return -1;
        }
        return -1;
    }

    static {
        categoryMatchCandidateCount = 0;
    }
}
