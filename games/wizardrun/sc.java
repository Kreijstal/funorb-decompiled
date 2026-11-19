/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sc extends IntrusiveNode {
    int field_k;
    static String field_i;
    boolean field_j;
    static String field_o;
    int[] field_n;
    static jk field_m;
    static String field_l;

    public static void releaseStatics(byte param0) {
        if (param0 == -76) {
          field_l = null;
          field_i = null;
          field_o = null;
          field_m = null;
          return;
        }
        wc var2 = (wc) null;
        sc.a((wc) null, false);
        field_l = null;
        field_i = null;
        field_o = null;
        field_m = null;
    }

    final static ResourceArchive a(int param0, int param1, int param2, boolean param3, boolean param4, boolean param5) {
        try {
          Object var6 = null;
          Object var7 = null;
          CachedArchiveProvider var8 = null;
          ResourceArchive stackIn_14_0 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param1 != 12000) {
              sc.a((byte) -101, 's');
            }
            var6 = null;
            var7 = null;
            if (MidiNote.field_p.field_m != null) {
              ld.field_e = new BufferedRandomAccessFile(MidiNote.field_p.field_m, 5200, 0);
              MidiNote.field_p.field_m = null;
              var6 = new DiskCacheStore(255, ld.field_e, new BufferedRandomAccessFile(MidiNote.field_p.field_i, 12000, 0), 2097152);
            }
            if (ld.field_e != null) {
              if (null == SocketJs5Transport.field_o) {
                SocketJs5Transport.field_o = new BufferedRandomAccessFile[MidiNote.field_p.field_f.length];
              }
              if (SocketJs5Transport.field_o[param0] == null) {
                SocketJs5Transport.field_o[param0] = new BufferedRandomAccessFile(MidiNote.field_p.field_f[param0], 12000, 0);
                MidiNote.field_p.field_f[param0] = null;
              }
              var7 = new DiskCacheStore(param0, ld.field_e, SocketJs5Transport.field_o[param0], 2097152);
            }
            var8 = DialogLayer.field_L.a(param3, param1 - 11928, (DiskCacheStore) (var7), param0, (DiskCacheStore) (var6));
            if (param4) {
              var8.a((byte) -98);
            }
            stackIn_14_0 = new ResourceArchive(var8, param5, param2);
            return stackIn_14_0;
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

    sc() {
    }

    final static String a(byte param0, char param1) {
        int var2 = -98 % ((param0 - 74) / 47);
        return String.valueOf(param1);
    }

    final static void a(wc param0, boolean param1) {
        int var2_int = 0;
        wc var3 = null;
        int var4 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = wizardrun.field_H;
        try {
          if (param1) {
            return;
          }
          if (null == param0.field_h) {
            return;
          }
          if (param0.field_c != 0 ||
            param0.field_d != 0) {
            for (var2_int = 0; ca.field_e > var2_int; var2_int++) {
              var3 = SingleChildWidget.field_B[var2_int];
              if (var3.field_i == 2 &&
                param0.field_c == var3.field_c &&
                var3.field_d == param0.field_d) {
                return;
              }
            }
          }
          if (param0.field_l != null) {
          }
          NanoTickClock.a(0, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("sc.A(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw bd.wrapException((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    final static int a(int param0) {
        if (param0 != 0) {
          return 94;
        }
        return QuickChatPhraseDefinition.field_t;
    }

    static {
        field_o = "Creating your account";
        field_i = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!#$%&'*+-/=?^_{}~";
        field_l = "Start Game";
    }
}
