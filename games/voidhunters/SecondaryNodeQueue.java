/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class SecondaryNodeQueue {
    static int field_b;
    private DualLinkNode sentinel;
    static int field_d;
    private DualLinkNode cursor;

    final static String decodeBase37Name(long param0, int param1) {
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        StringBuilder discarded$0 = null;
        int var11 = VoidHunters.field_G;
        if (param0 <= 0L) {
          return null;
        }
        if (6582952005840035281L <= param0) {
          return null;
        }
        if (param1 >= -108) {
          return (String) null;
        }
        if (param0 % 37L != 0L) {
          var3 = 0;
          var4 = param0;
          while (0L != var4) {
            var4 = var4 / 37L;
            var3++;
          }
          var6 = new StringBuilder(var3);
          while (param0 != 0L) {
            var7 = param0;
            param0 = param0 / 37L;
            var9 = GetLaserReload.field_q[(int)(var7 - 37L * param0)];
            if (var9 == 95) {
              var10 = -1 + var6.length();
              var9 = 160;
              var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
            }
            discarded$0 = var6.append((char) var9);
          }
          var6.reverse();
          var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
          return var6.toString();
        }
        return null;
    }

    final int size(int param0) {
        int var4 = VoidHunters.field_G;
        int var2 = param0;
        DualLinkNode var3 = this.sentinel.secondaryNext;
        while (var3 != this.sentinel) {
          var2++;
          var3 = var3.secondaryNext;
        }
        return var2;
    }

    final static void a(int param0, byte param1, String param2, long param3, int param4, boolean param5) {
        RequestNewestBlackboxRecording.field_p.writeIsaacByte(24335, param4);
        RequestNewestBlackboxRecording.field_p.position = RequestNewestBlackboxRecording.field_p.position + 1;
        int var7_int = RequestNewestBlackboxRecording.field_p.position;
        RequestNewestBlackboxRecording.field_p.writeLong(param3, 108);
        RequestNewestBlackboxRecording.field_p.writeString(true, param2);
        if (param1 >= -94) {
          return;
        }
        try {
          RequestNewestBlackboxRecording.field_p.writeByte(0, param0);
          RequestNewestBlackboxRecording.field_p.writeByte(0, !param5 ? 0 : 1);
          RequestNewestBlackboxRecording.field_p.writeLengthByte(-var7_int + RequestNewestBlackboxRecording.field_p.position, -129);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "vga.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final DualLinkNode first(byte param0) {
        DualLinkNode var2 = this.sentinel.secondaryNext;
        if (this.sentinel == var2) {
          this.cursor = null;
          return null;
        }
        this.cursor = var2.secondaryNext;
        if (param0 == -54) {
          return var2;
        }
        this.next(77);
        return var2;
    }

    final void addFirst(DualLinkNode param0, byte param1) {
        if (param1 != -22) {
          return;
        }
        try {
          if (param0.secondaryPrevious != null) {
            param0.unlinkSecondary((byte) -35);
          }
          param0.secondaryNext = this.sentinel.secondaryNext;
          param0.secondaryPrevious = this.sentinel;
          param0.secondaryPrevious.secondaryNext = param0;
          param0.secondaryNext.secondaryPrevious = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "vga.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final DualLinkNode removeLast(int param0) {
        DualLinkNode var2 = this.sentinel.secondaryPrevious;
        if (var2 == this.sentinel) {
          return null;
        }
        if (param0 == 1) {
          var2.unlinkSecondary((byte) -35);
          return var2;
        }
        this.first((byte) 3);
        var2.unlinkSecondary((byte) -35);
        return var2;
    }

    final static int getCurrentYear(boolean param0) {
        if (param0) {
          return 1900 + new Date().getYear();
        }
        field_d = 59;
        return 1900 + new Date().getYear();
    }

    final DualLinkNode next(int param0) {
        DualLinkNode var2 = null;
        DualLinkNode var2Lifetime1;
        if (param0 != 1900) {
          SecondaryNodeQueue.decodeBase37Name(-33L, 30);
          var2 = this.cursor;
          if (this.sentinel == var2) {
            this.cursor = null;
            return null;
          }
          this.cursor = var2.secondaryNext;
          return var2;
        }
        var2Lifetime1 = this.cursor;
        if (this.sentinel == var2Lifetime1) {
          this.cursor = null;
          return null;
        }
        this.cursor = var2Lifetime1.secondaryNext;
        return var2Lifetime1;
    }

    final DualLinkNode removeFirst(byte param0) {
        DualLinkNode var2 = this.sentinel.secondaryNext;
        if (this.sentinel != var2) {
          var2.unlinkSecondary((byte) -35);
          int var3 = 25 % ((param0 + 18) / 58);
          return var2;
        }
        return null;
    }

    final void addLast(DualLinkNode param0, int param1) {
        if (param0.secondaryPrevious != null) {
          param0.unlinkSecondary((byte) -35);
        }
        if (param1 >= -64) {
          return;
        }
        try {
          param0.secondaryNext = this.sentinel;
          param0.secondaryPrevious = this.sentinel.secondaryPrevious;
          param0.secondaryPrevious.secondaryNext = param0;
          param0.secondaryNext.secondaryPrevious = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "vga.I(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public SecondaryNodeQueue() {
        this.sentinel = new DualLinkNode();
        this.sentinel.secondaryPrevious = this.sentinel;
        this.sentinel.secondaryNext = this.sentinel;
    }

    static {
    }
}
