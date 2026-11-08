/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AudioServiceThread implements Runnable {
    volatile AudioOutput[] outputs;
    volatile boolean running;
    static String membersText;
    static String[] padTypeNames;
    PlatformTaskDispatcher taskDispatcher;
    volatile boolean stopRequested;
    static TextWidgetRenderer field_d;
    static int field_h;

    final static void drawDottedRectangle(int param0, int param1, int param2, int param3, int param4) {
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var11Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        var13 = Sumoblitz.field_L ? 1 : 0;
        try {
          var5_int = param3 + param1;
          var6 = param0 + param4;
          if (SoftwareRasterizer.clipLeft < param3) {
            stackIn_4_0 = param3;
          } else {
            stackIn_4_0 = SoftwareRasterizer.clipLeft;
          }
          var7 = stackIn_4_0;
          if (SoftwareRasterizer.clipTop >= param0) {
            stackIn_7_0 = SoftwareRasterizer.clipTop;
          } else {
            stackIn_7_0 = param0;
          }
          var8 = stackIn_7_0;
          if (var5_int >= SoftwareRasterizer.clipRight) {
            stackIn_10_0 = SoftwareRasterizer.clipRight;
          } else {
            stackIn_10_0 = var5_int;
          }
          var9 = stackIn_10_0;
          if (SoftwareRasterizer.clipBottom <= var6) {
            stackIn_13_0 = SoftwareRasterizer.clipBottom;
          } else {
            stackIn_13_0 = var6;
          }
          var10 = stackIn_13_0;
          if (SoftwareRasterizer.clipLeft <= param3 &&
            SoftwareRasterizer.clipRight > param3) {
            var11 = param3 + var8 * SoftwareRasterizer.width;
            var12 = 1 + var10 - var8 >> 1;
            while (true) {
              var12--;
              if (var12 < 0) {
                break;
              }
              SoftwareRasterizer.pixels[var11] = 16777215;
              var11 = var11 + SoftwareRasterizer.width * 2;
            }
          }
          if (param2 != -13181) {
            AudioServiceThread.drawDottedRectangle(5, 111, 100, -88, -57);
          }
          if (SoftwareRasterizer.clipTop <= param0 &&
            var6 < SoftwareRasterizer.clipBottom) {
            var11Lifetime1 = param0 * SoftwareRasterizer.width + var7;
            var12Lifetime1 = -var7 + (1 + var9) >> 1;
            while (true) {
              var12Lifetime1--;
              if (var12Lifetime1 < 0) {
                break;
              }
              SoftwareRasterizer.pixels[var11Lifetime1] = 16777215;
              var11Lifetime1 += 2;
            }
          }
          if (SoftwareRasterizer.clipLeft <= var5_int &&
            var5_int < SoftwareRasterizer.clipRight) {
            var11Lifetime2 = var5_int + SoftwareRasterizer.width * ((1 & var5_int - param3) + var8);
            var12Lifetime2 = var10 + 1 - var8 >> 1;
            while (true) {
              var12Lifetime2--;
              if (var12Lifetime2 < 0) {
                break;
              }
              SoftwareRasterizer.pixels[var11Lifetime2] = 16777215;
              var11Lifetime2 = var11Lifetime2 + 2 * SoftwareRasterizer.width;
            }
          }
          if (SoftwareRasterizer.clipTop <= param0 &&
            SoftwareRasterizer.clipBottom > var6) {
            var11Lifetime3 = (1 & -param0 + var6) + (var7 + SoftwareRasterizer.width * var6);
            var12Lifetime3 = -var7 + (1 + var9) >> 1;
            while (true) {
              var12Lifetime3--;
              if (var12Lifetime3 < 0) {
                return;
              }
              SoftwareRasterizer.pixels[var11Lifetime3] = 16777215;
              var11Lifetime3 += 2;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var5), "pp.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_d = null;
        if (param0 != 2) {
          AudioServiceThread.releaseStatics(-25);
          membersText = null;
          padTypeNames = null;
          return;
        }
        membersText = null;
        padTypeNames = null;
    }

    public final void run() {
        int var1_int = 0;
        AudioOutput var2 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        Exception var1 = null;
        Throwable var3 = null;
        String var5 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        this.running = true;
        try {
          try {
            while (!this.stopRequested) {
              for (var1_int = 0; 2 > var1_int; var1_int++) {
                var2 = this.outputs[var1_int];
                if (var2 != null) {
                  var2.serviceOutput();
                }
              }
              tg.a(10L, (byte) 107);
              rd.a((Object) null, this.taskDispatcher, -11030);
            }
            decompiledRegionSelector0 = 0;
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var1 = (Exception) (Object) decompiledCaughtException;
            var5 = (String) null;
            IntrusiveNode.reportClientError((String) null, (Throwable) ((Object) var1), 0);
            decompiledRegionSelector0 = 1;
          }
          if (decompiledRegionSelector0 == 0) {
          } else {
          }
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          this.running = false;
          throw AudioServiceThread.<RuntimeException>rethrowUnchecked(var3);
        }
        this.running = false;
    }

    AudioServiceThread() {
        this.outputs = new AudioOutput[2];
        this.stopRequested = false;
        this.running = false;
    }

    static {
        padTypeNames = new String[]{"Accelerator pad", "Ice pad", "Teleporter pad", "Pinball bouncer", "Attractor", "Repeller", "Spike pad", "Landmine"};
        membersText = "Members";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException rethrowUnchecked(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
