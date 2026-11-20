/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class DiskArchiveRequest extends ArchiveRequest {
    int operation;
    static Hashtable nativeLibraryFiles;
    ArchiveDisk archiveDisk;
    byte[] data;

    final byte[] getData(int param0) {
        int var2 = -61 % ((17 - param0) / 58);
        if (this.pending) {
          throw new RuntimeException();
        }
        return this.data;
    }

    public static void clearSharedReferences(int param0) {
        nativeLibraryFiles = null;
        if (param0 != 100) {
          DiskArchiveRequest.clearSharedReferences(-2);
        }
    }

    final int getLoadPercent(byte param0) {
        if (param0 != -4) {
          DiskArchiveRequest.clearSharedReferences(-40);
          if (!this.pending) {
            return 100;
          }
          return 0;
        }
        if (!this.pending) {
          return 100;
        }
        return 0;
    }

    DiskArchiveRequest() {
    }

    static {
        nativeLibraryFiles = new Hashtable();
    }
}
