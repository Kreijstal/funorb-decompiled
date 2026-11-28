/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ri {
    static String[] field_b;
    static ResourceArchive field_c;
    static int[] field_a;

    public static void clearStaticReferences(int param0) {
        field_a = null;
        field_c = null;
        if (param0 != -15552) {
          return;
        }
        field_b = null;
    }

    final static ResourceArchive a(boolean param0, boolean param1, int param2, int param3, boolean param4, boolean param5) {
        try {
          Object var6 = null;
          Object var7 = null;
          t var8 = null;
          ResourceArchive stackIn_11_0 = null;
          ResourceArchive stackIn_15_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            var6 = null;
            if (DirectByteStorage.field_f.field_e != null) {
              ne.field_l = new BufferedRandomAccessFile(DirectByteStorage.field_f.field_e, 5200, 0);
              DirectByteStorage.field_f.field_e = null;
              var6 = new SectorCacheStore(255, ne.field_l, new BufferedRandomAccessFile(DirectByteStorage.field_f.field_t, 12000, 0), 2097152);
            }
            var7 = null;
            if (null != ne.field_l) {
              if (EditableTextField.field_J == null) {
                EditableTextField.field_J = new BufferedRandomAccessFile[DirectByteStorage.field_f.field_q.length];
              }
              if (EditableTextField.field_J[param3] == null) {
                EditableTextField.field_J[param3] = new BufferedRandomAccessFile(DirectByteStorage.field_f.field_q[param3], 12000, 0);
                DirectByteStorage.field_f.field_q[param3] = null;
              }
              var7 = new SectorCacheStore(param3, ne.field_l, EditableTextField.field_J[param3], 2097152);
            }
            if (!param0) {
              stackIn_11_0 = (ResourceArchive) null;
              return stackIn_11_0;
            }
            var8 = bl.field_b.a(param4, -72, (SectorCacheStore) (var7), param3, (SectorCacheStore) (var6));
            if (param1) {
              var8.a(-126);
            }
            stackIn_15_0 = new ResourceArchive(var8, param5, param2);
            return stackIn_15_0;
          } catch (java.io.IOException decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var6 = (IOException) (Object) decompiledCaughtException;
            throw new RuntimeException(((IOException) (var6)).toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void b(int param0) {
        CharSequence var3 = null;
        we.field_i = se.field_p.readString(-104);
        if (param0 == 12000) {
          var3 = (CharSequence) ((Object) we.field_i);
          ba.field_e = ni.a(param0 - 11877, var3);
          return;
        }
        field_b = (String[]) null;
        CharSequence var2 = (CharSequence) ((Object) we.field_i);
        ba.field_e = ni.a(param0 - 11877, var2);
    }

    static {
        field_a = new int[8192];
    }
}
