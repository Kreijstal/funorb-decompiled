/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class InputDetachHelpers {
    static IntrusiveDeque field_a;
    static int field_e;
    static String[] field_b;
    static String field_d;
    static String field_c;

    public static void releaseStatics(int param0) {
        field_a = null;
        field_d = null;
        field_b = null;
        if (param0 != -25534) {
          InputDetachHelpers.detachMouseInput(69);
        }
        field_c = null;
    }

    final static boolean isFirstReflectionCheckReady(boolean param0) {
        int var2 = 0;
        ReflectionCheck var1 = null;
        RuntimeException var1_ref = null;
        int var3 = 0;
        ReflectionCheck var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = TetraLink.field_J;
        try {
          var4 = (ReflectionCheck) (CachedArchiveSource.field_C.first(param0));
          var1 = var4;
          if (var1 == null) {
            return false;
          }
          for (var2 = 0; var2 < var1.field_r; var2++) {
            if (null != var4.field_x[var2] &&
              var4.field_x[var2].field_d == 0) {
              return false;
            }
            if (null != var4.field_u[var2] &&
              var4.field_u[var2].field_d == 0) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var1_ref), "jl.D(" + param0 + ')');
        }
    }

    final static void detachMouseInput(int param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (param0 < 108) {
          field_b = (String[]) null;
        }
        if (DualLinkNodeHashTable.field_g != null) {
          var1 = DualLinkNodeHashTable.field_g;
          synchronized (var1) {
            DualLinkNodeHashTable.field_g = null;
          }
        }
    }

    final static void drawStripedCentredBox(int param0, int param1, int param2) {
        int incrementValue$1 = 0;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var6 = TetraLink.field_J;
        try {
          SoftwareRasterizer.fillRectangle(640 - param1 >> 1, param2 - param0 >> 1, param1, param0, 9408511);
          var3_int = -param0;
          while (true) {
            if (var3_int >= 0) {
              return;
            }
            var4 = 640 * (var3_int + (480 + param0 >> 1)) + (640 - param1 >> 1);
            var5 = param1;
            while (true) {
              var5--;
              if (0 > var5) {
                var3_int += 2;
                break;
              }
              incrementValue$1 = var4;
              var4++;
              SoftwareRasterizer.field_b[incrementValue$1] = 11513855;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var3), "jl.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    static {
        field_e = 0;
        field_d = "<%0> has left.";
    }
}
