/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class GetPedrosRepairModeSwitchtime extends ConsoleCommand {
    static int field_o;

    GetPedrosRepairModeSwitchtime(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final ConsoleValue execute(ConsoleValue[] arguments, int obfuscationGuard) {
        RuntimeException var3 = null;
        ConsoleValue[] var4 = null;
        ConsoleValue stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -119) {
            var4 = (ConsoleValue[]) null;
            this.execute((ConsoleValue[]) null, 8);
          }
          stackIn_3_0 = new ConsoleValue(GetLaserFireForce.a(32, 118));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("oga.A(");
          if (arguments == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3, int param4, int param5, boolean param6) {
        if (param0 <= 27) {
          GetPedrosRepairModeSwitchtime.a(23, 89, -52, 81, -123, -26, false);
        }
        if (GetReverbDry.e((byte) 105)) {
          GetShipAimLines.a(param2, 11343, param4, param6);
          if (null != GetLagStandardDeviationOut.field_o &&
            GetLagStandardDeviationOut.field_o.updateAndDispatchSelection(param6, -11, param1, param4, param3)) {
            TileTextureOperation.closePlayerContextMenu(0);
            param6 = false;
          }
          PrimitiveType.updateSocialNameDialog(param4, param6, 19717);
          GpuTransform3D.a((byte) -127, param6, param5);
          param6 = false;
        }
        return param6;
    }

    final static boolean a(char param0, byte param1) {
        if (param0 >= 32 &&
          param0 <= 126) {
          return true;
        }
        if (160 <= param0 &&
          param0 <= 255) {
          return true;
        }
        if (param0 != 8364 &&
          param0 != 338 &&
          8212 != param0 &&
          param0 != 339 &&
          param0 != 376) {
          if (param1 == 32) {
          }
          return false;
        }
        return true;
    }

    final static void a(int param0) {
        try {
          int var1_int = 0;
          IOException iOException = null;
          int var3 = 0;
          Throwable decompiledCaughtException = null;
          RuntimeException var1 = null;
          IOException var2 = null;
          var3 = VoidHunters.field_G;
          try {
            if (param0 != 16928) {
              field_o = -75;
            }
            if (GetAutozoomAmountMultiply.field_o != null) {
              GetAutozoomAmountMultiply.field_o.close(116);
            }
            if (BlackBoxRecordingFactory.field_a != null) {
              BlackBoxRecordingFactory.field_a.shutdown(23474);
            }
            if (GpuNativeHeap.field_e != null) {
              try {
                GpuNativeHeap.field_e.close(true);
              } catch (java.io.IOException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                iOException = (IOException) (Object) decompiledCaughtException;
              }
            }
            if (null != CommonUiArchiveResources.cacheIndexFiles) {
              for (var1_int = 0; var1_int < CommonUiArchiveResources.cacheIndexFiles.length; var1_int++) {
                if (null != CommonUiArchiveResources.cacheIndexFiles[var1_int]) {
                  try {
                    CommonUiArchiveResources.cacheIndexFiles[var1_int].close(true);
                  } catch (java.io.IOException decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var2 = (IOException) (Object) decompiledCaughtException;
                  }
                }
              }
              return;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw GetMissileLauncherRandomness.a((Throwable) ((Object) var1), "oga.D(" + param0 + ')');
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_o = 0;
    }
}
