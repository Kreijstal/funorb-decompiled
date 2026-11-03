/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ProxyAuthenticationRequiredException extends IOException {
    static String[] field_c;
    static String joinRequestsOne;
    static String createEmailConfirm;
    static boolean field_a;

    final static UiTheme createUiTheme(int param0) {
        if (null == ae.field_c) {
          ae.field_c = new UiTheme();
          ae.field_c.initializePainters(ValidationIconWidget.field_O, -76);
          ae.field_c.tooltipLeftPadding = 6;
          ae.field_c.tooltipBottomPadding = 4;
          ae.field_c.tooltipFont = PoolUiText.field_a;
          ae.field_c.tooltipBackgroundColor = 2763306;
          ae.field_c.tooltipBorderColor = 7697781;
          ae.field_c.tooltipTopPadding = 0;
          ae.field_c.tooltipLineSpacing = 14;
          ae.field_c.tooltipRightPadding = 5;
          if (param0 != 14) {
            field_c = (String[]) null;
            return ae.field_c;
          }
          return ae.field_c;
        }
        if (param0 == 14) {
          return ae.field_c;
        }
        field_c = (String[]) null;
        return ae.field_c;
    }

    public static void releaseStatics(int param0) {
        field_c = null;
        joinRequestsOne = null;
        if (param0 < 110) {
          createEmailConfirm = (String) null;
          createEmailConfirm = null;
          return;
        }
        createEmailConfirm = null;
    }

    final static String toHexString(long param0, int param1) {
        if (param1 == 7697781) {
          return ResourceArchive.a(param0, 16, false, -112, 6, 10);
        }
        field_c = (String[]) null;
        return ResourceArchive.a(param0, 16, false, -112, 6, 10);
    }

    ProxyAuthenticationRequiredException(String param0) {
        super(param0);
    }

    final static int divideFixed12(int param0, int param1, byte param2) {
        if (param2 < 53) {
          ProxyAuthenticationRequiredException.detectMaxMemoryMb(85);
          return (param0 << 12) / param1;
        }
        return (param0 << 12) / param1;
    }

    final static void detectMaxMemoryMb(int param0) {
        try {
          Throwable decompiledCaughtException = null;
          java.lang.reflect.Method var1 = null;
          Exception var1_ref = null;
          Runtime var2 = null;
          Throwable var2_ref = null;
          Long var3 = null;
          Object[] var4 = null;
          try {
            var1 = Runtime.class.getMethod("maxMemory", new Class[]{});
            if (param0 >= -7) {
              field_c = (String[]) null;
            }
            if (var1 == null) {
              return;
            }
            try {
              var2 = Runtime.getRuntime();
              var4 = (Object[]) null;
              var3 = (Long) (var1.invoke((Object) (var2), (Object[]) null));
              rf.field_d = 1 + (int)(var3.longValue() / 1048576L);
              return;
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = decompiledCaughtException;
              return;
            }
          } catch (java.lang.Exception decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var1_ref = (Exception) (Object) decompiledCaughtException;
            return;
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        joinRequestsOne = "(1 player wants to join)";
        createEmailConfirm = "Confirm Email:";
    }
}
