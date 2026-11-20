/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OpenGlVertexBuffer extends OpenGlGpuBuffer implements GpuVertexBuffer {
    static ResourceArchive field_j;
    private byte stride;

    final int getStride(byte param0) {
        if (param0 != 125) {
          this.stride = (byte) -12;
          return this.stride;
        }
        return this.stride;
    }

    public final boolean allocate(int param0, int param1, int param2) {
        this.stride = (byte)param0;
        super.allocate(25427, param1);
        if (param2 <= 81) {
          this.release(-84);
          return true;
        }
        return true;
    }

    public final jaclib.memory.Buffer lock(boolean param0, byte param1) {
        if (param1 > 16) {
          return super.lockBuffer(false, param0, this.toolkit.field_Vc);
        }
        CharSequence var4 = (CharSequence) null;
        OpenGlVertexBuffer.normalizeAsciiIdentifier(-9, (CharSequence) null);
        return super.lockBuffer(false, param0, this.toolkit.field_Vc);
    }

    final static String normalizeAsciiIdentifier(int param0, CharSequence param1) {
        int var4 = 0;
        int var2_int = 0;
        char[] var3 = null;
        int var5 = 0;
        int var6 = 0;
        char[] var7 = null;
        char[] var8 = null;
        String stackIn_22_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = VoidHunters.field_G;
        try {
          var2_int = param1.length();
          if (20 < var2_int) {
            var2_int = 20;
          }
          var8 = new char[var2_int];
          var7 = var8;
          var3 = var7;
          if (param0 <= 2) {
            field_j = (ResourceArchive) null;
          }
          for (var4 = 0; var2_int > var4; var4++) {
            var5 = param1.charAt(var4);
            if (var5 >= 65 &&
              var5 <= 90) {
              var3[var4] = (char)(var5 + 32);
            } else if ((97 > var5 ||
              var5 > 122) &&
              (var5 < 48 ||
              var5 > 57)) {
              var3[var4] = (char)95;
            } else {
              var3[var4] = (char)var5;
            }
          }
          stackIn_22_0 = new String(var8);
          return stackIn_22_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("esb.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public final boolean unlock(int param0) {
        if (param0 == -20836) {
          return super.unlockBuffer((byte) -124, this.toolkit.field_Vc);
        }
        CharSequence var3 = (CharSequence) null;
        OpenGlVertexBuffer.normalizeAsciiIdentifier(91, (CharSequence) null);
        return super.unlockBuffer((byte) -124, this.toolkit.field_Vc);
    }

    public static void clearSharedReferences(int param0) {
        if (param0 >= -104) {
          CharSequence var2 = (CharSequence) null;
          OpenGlVertexBuffer.normalizeAsciiIdentifier(27, (CharSequence) null);
          field_j = null;
          return;
        }
        field_j = null;
    }

    OpenGlVertexBuffer(OpenGlGpuToolkit param0, boolean param1) {
        super(param0, 34962, param1);
    }

    public final void release(int param0) {
        if (param0 > -84) {
          return;
        }
        super.release(-119);
    }

    static {
    }
}
