/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class j extends IntrusiveNode {
    long field_h;
    static ResourceArchive field_j;
    int field_g;
    byte[] field_i;

    final static ResourceArchive a(boolean param0, byte param1, boolean param2, int param3, boolean param4, int param5) {
        try {
          Object var6 = null;
          Object var7 = null;
          ce var8 = null;
          ResourceArchive stackIn_16_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            var6 = null;
            if (param1 >= -94) {
              field_j = (ResourceArchive) null;
            }
            var7 = null;
            if (null != RichTextWidget.field_G.field_j) {
              jg.field_C = new BufferedRandomAccessFile(RichTextWidget.field_G.field_j, 5200, 0);
              RichTextWidget.field_G.field_j = null;
              var6 = new SectorCacheStore(255, jg.field_C, new BufferedRandomAccessFile(RichTextWidget.field_G.field_m, 12000, 0), 2097152);
            }
            if (null != jg.field_C) {
              if (pd.field_a == null) {
                pd.field_a = new BufferedRandomAccessFile[RichTextWidget.field_G.field_u.length];
              }
              if (pd.field_a[param3] == null) {
                pd.field_a[param3] = new BufferedRandomAccessFile(RichTextWidget.field_G.field_u[param3], 12000, 0);
                RichTextWidget.field_G.field_u[param3] = null;
              }
              var7 = new SectorCacheStore(param3, jg.field_C, pd.field_a[param3], 2097152);
            }
            var8 = ih.field_Q.a(param2, (SectorCacheStore) (var7), (SectorCacheStore) (var6), param3, -18023);
            if (param0) {
              var8.b((byte) -124);
            }
            stackIn_16_0 = new ResourceArchive(var8, param4, param5);
            return stackIn_16_0;
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

    public static void clearStaticReferences(byte param0) {
        field_j = null;
        if (param0 > -50) {
          field_j = (ResourceArchive) null;
        }
    }

    final static boolean a(char param0, byte param1) {
        if (param1 != 56) {
          j.c((byte) -68);
          if (param0 < 65) {
            if (param0 < 97) {
              return false;
            }
            if (param0 <= 122) {
              return true;
            }
            return false;
          }
          if (param0 <= 90) {
            return true;
          }
          if (param0 < 97) {
            return false;
          }
          if (param0 <= 122) {
            return true;
          }
          return false;
        }
        if (param0 >= 65) {
          if (param0 <= 90) {
            return true;
          }
          if (param0 < 97) {
            return false;
          }
          if (param0 <= 122) {
            return true;
          }
          return false;
        }
        if (param0 < 97) {
          return false;
        }
        if (param0 <= 122) {
          return true;
        }
        return false;
    }

    final static void c(byte param0) {
        ig.a(-102);
        fe.field_g = true;
        int var1 = -119 % ((param0 + 35) / 46);
        ee.field_c = true;
        DisplayNameSelectionPanel.field_N.k(-20281);
        AppletShell.a(false, vb.field_o, -1);
    }

    j(long param0, int param1, byte[] param2) {
        try {
          this.field_h = param0;
          this.field_g = param1;
          this.field_i = param2;
        } catch (RuntimeException runtimeException) {
          throw CipherPacketBuffer.wrapClientException((Throwable) ((Object) runtimeException), "j.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
