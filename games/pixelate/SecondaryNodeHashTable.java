/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class SecondaryNodeHashTable {
    private int field_h;
    private int field_d;
    private DualLinkNode[] field_a;
    static String field_e;
    private DualLinkNode lookupCursor;
    private DualLinkNode field_c;
    private long field_b;
    static String field_f;

    final DualLinkNode findNext(byte param0) {
        DualLinkNode var2;
        DualLinkNode var3;
        int var4;
        DualLinkNode var3Lifetime1;
        var4 = Pixelate.field_H ? 1 : 0;
        if (this.lookupCursor == null) {
          return null;
        }
        var2 = this.field_a[(int)((long)(-1 + this.field_h) & this.field_b)];
        if (param0 == 47) {
          while (true) {
            if (this.lookupCursor == var2) {
              this.lookupCursor = null;
              return null;
            }
            if (this.lookupCursor.field_q != this.field_b) {
              this.lookupCursor = this.lookupCursor.secondaryNext;
              continue;
            }
            break;
          }
          var3 = this.lookupCursor;
          this.lookupCursor = this.lookupCursor.secondaryNext;
          return var3;
        }
        this.next((byte) -113);
        while (true) {
          if (this.lookupCursor == var2) {
            this.lookupCursor = null;
            return null;
          }
          if (this.lookupCursor.field_q != this.field_b) {
            this.lookupCursor = this.lookupCursor.secondaryNext;
            continue;
          }
          break;
        }
        var3Lifetime1 = this.lookupCursor;
        this.lookupCursor = this.lookupCursor.secondaryNext;
        return var3Lifetime1;
    }

    final void put(boolean param0, DualLinkNode param1, long param2) {
        DualLinkNode var5 = null;
        try {
          if (param1.secondaryPrevious != null) {
            param1.unlinkSecondary(17);
          }
          var5 = this.field_a[(int)((long)(this.field_h - 1) & param2)];
          param1.secondaryPrevious = var5.secondaryPrevious;
          param1.secondaryNext = var5;
          param1.secondaryPrevious.secondaryNext = param1;
          if (param0) {
            SecondaryNodeHashTable.flushOutgoingPackets(-98, -4);
          }
          param1.secondaryNext.secondaryPrevious = param1;
          param1.field_q = param2;
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "vg.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void sleepMillis(long param0, byte param1) {
        if (param1 != 23) {
          return;
        }
        if (param0 <= 0L) {
          return;
        }
        if (0L != param0 % 10L) {
          ScoreMarkerBar.threadSleep((byte) 37, param0);
        } else {
          ScoreMarkerBar.threadSleep((byte) 37, -1L + param0);
          ScoreMarkerBar.threadSleep((byte) 37, 1L);
          return;
        }
    }

    final static ib chooseGridSize(byte param0, int param1) {
        int stackIn_5_0 = 0;
        int var2;
        int var3;
        if (param0 < 84) {
          return (ib) null;
        }
        if (param1 < 10) {
          stackIn_5_0 = 0;
        } else {
          stackIn_5_0 = RankingTableRequest.chooseGridBand(param1, (byte) 118);
        }
        var2 = stackIn_5_0;
        if (var2 == 0) {
          if (JavaRandomHelpers.a(UiTheme.field_f, -128, 2) != 1) {
            return new ib(4, 3);
          }
          return new ib(3, 4);
        }
        if (var2 != 1) {
          if (2 == var2) {
            if (JavaRandomHelpers.a(UiTheme.field_f, -103, 2) == 1) {
              return new ib(4, 5);
            }
            return new ib(5, 4);
          }
          if (3 != var2) {
            return new ib(4, 4);
          }
          return new ib(5, 5);
        }
        var3 = JavaRandomHelpers.a(UiTheme.field_f, -121, 3);
        if (var3 == 0) {
          return new ib(3, 5);
        }
        if (var3 == 1) {
          return new ib(4, 4);
        }
        if (var3 == 2) {
          return new ib(5, 3);
        }
        return new ib(4, 4);
    }

    final DualLinkNode next(byte param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$2 = 0;
        int var3;
        DualLinkNode var4;
        DualLinkNode var5;
        DualLinkNode var29;
        DualLinkNode var57;
        DualLinkNode var58;
        DualLinkNode var59;
        var3 = Pixelate.field_H ? 1 : 0;
        if (0 >= this.field_d) {
          if (param0 == 50) {
            do {
              if (this.field_d >= this.field_h) {
                return null;
              }
              fieldTemp$1 = this.field_d;
              this.field_d = this.field_d + 1;
              var4 = this.field_a[fieldTemp$1].secondaryNext;
              var58 = var4;
            } while (var4 == this.field_a[this.field_d - 1]);
            this.field_c = var58.secondaryNext;
            return var58;
          }
          SecondaryNodeHashTable.inverseSquareRoot(-20, -121);
          do {
            if (this.field_d >= this.field_h) {
              return null;
            }
            fieldTemp$0 = this.field_d;
            this.field_d = this.field_d + 1;
            var4 = this.field_a[fieldTemp$0].secondaryNext;
            var59 = var4;
          } while (var4 == this.field_a[this.field_d - 1]);
          this.field_c = var59.secondaryNext;
          return var59;
        }
        if (this.field_c != this.field_a[this.field_d - 1]) {
          var57 = this.field_c;
          this.field_c = var57.secondaryNext;
          return var57;
        }
        if (param0 == 50) {
          do {
            if (this.field_d >= this.field_h) {
              return null;
            }
            fieldTemp$3 = this.field_d;
            this.field_d = this.field_d + 1;
            var4 = this.field_a[fieldTemp$3].secondaryNext;
            var5 = var4;
          } while (var4 == this.field_a[this.field_d - 1]);
          this.field_c = var5.secondaryNext;
          return var5;
        }
        SecondaryNodeHashTable.inverseSquareRoot(-20, -121);
        do {
          if (this.field_d >= this.field_h) {
            return null;
          }
          fieldTemp$2 = this.field_d;
          this.field_d = this.field_d + 1;
          var4 = this.field_a[fieldTemp$2].secondaryNext;
          var29 = var4;
        } while (var4 == this.field_a[this.field_d - 1]);
        this.field_c = var29.secondaryNext;
        return var29;
    }

    final static int inverseSquareRoot(int param0, int param1) {
        int var2;
        int var3;
        int var2Lifetime1;
        var3 = Pixelate.field_H ? 1 : 0;
        if (param1 == ~param0) {
          return 0;
        }
        if (param0 < 0) {
          throw new IllegalArgumentException("");
        }
        if (param0 < 32768) {
          if (param0 < 128) {
            if (param0 < 8) {
              if (param0 < 2) {
                return 256;
              }
              var2 = 7;
            } else {
              var2 = (32 > param0) ? 6 : 5;
            }
          } else {
            if (param0 < 2048) {
              var2 = (512 > param0) ? 4 : 3;
            } else {
              var2 = (param0 < 8192) ? 2 : 1;
            }
          }
          param0 = param0 << (var2 << 1);
          return bl.field_a[-32768 + param0] >> var2;
        }
        if (131072 > param0) {
          return bl.field_a[-32768 + param0];
        }
        if (33554432 <= param0) {
          if (param0 >= 536870912) {
            var2Lifetime1 = 7;
          } else {
            var2Lifetime1 = (param0 < 134217728) ? 5 : 6;
          }
        } else {
          if (2097152 <= param0) {
            var2Lifetime1 = (param0 >= 8388608) ? 4 : 3;
          } else {
            var2Lifetime1 = (param0 >= 524288) ? 2 : 1;
          }
        }
        param0 = param0 >> (var2Lifetime1 << 1);
        return bl.field_a[param0 - 32768] << var2Lifetime1;
    }

    final DualLinkNode get(int param0, long param1) {
        DualLinkNode var4;
        DualLinkNode var5;
        int var6;
        DualLinkNode var4Lifetime1;
        DualLinkNode var5Lifetime1;
        var6 = Pixelate.field_H ? 1 : 0;
        if (param0 == -11434) {
          this.field_b = param1;
          var4 = this.field_a[(int)(param1 & (long)(this.field_h - 1))];
          this.lookupCursor = var4.secondaryNext;
          while (true) {
            if (this.lookupCursor == var4) {
              this.lookupCursor = null;
              return null;
            }
            if (~param1 != ~this.lookupCursor.field_q) {
              this.lookupCursor = this.lookupCursor.secondaryNext;
              continue;
            }
            break;
          }
          var5 = this.lookupCursor;
          this.lookupCursor = this.lookupCursor.secondaryNext;
          return var5;
        }
        this.field_c = (DualLinkNode) null;
        this.field_b = param1;
        var4Lifetime1 = this.field_a[(int)(param1 & (long)(this.field_h - 1))];
        this.lookupCursor = var4Lifetime1.secondaryNext;
        while (true) {
          if (this.lookupCursor == var4Lifetime1) {
            this.lookupCursor = null;
            return null;
          }
          if (~param1 != ~this.lookupCursor.field_q) {
            this.lookupCursor = this.lookupCursor.secondaryNext;
            continue;
          }
          break;
        }
        var5Lifetime1 = this.lookupCursor;
        this.lookupCursor = this.lookupCursor.secondaryNext;
        return var5Lifetime1;
    }

    final DualLinkNode first(int param0) {
        this.field_d = 0;
        if (param0 > -21) {
          this.field_d = -64;
          return this.next((byte) 50);
        }
        return this.next((byte) 50);
    }

    final static void flushOutgoingPackets(int param0, int param1) {
        try {
          Throwable decompiledCaughtException = null;
          IOException var2 = null;
          boolean decompiledFrameRemainder0 = true;
          if (null != NodeHashTableIterator.field_e) {
            if (param0 >= 0) {
              decompiledFrameRemainder0 = (Pixelate.field_G == GameModeSelectScreen.field_s);
              if ((decompiledFrameRemainder0) && (ChatMessage.field_f.position == 0 &&
                hm.monotonicMillis(64) > (ReflectionCheckRequest.field_m + 10000L))) {
                ChatMessage.field_f.writeOpcode(param0, 15514);
              }
            } else {
              if (ChatMessage.field_f.position == 0 &&
                hm.monotonicMillis(64) > (ReflectionCheckRequest.field_m + 10000L)) {
                ChatMessage.field_f.writeOpcode(param0, 15514);
              }
            }
            if (decompiledFrameRemainder0) {
              if (ChatMessage.field_f.position > 0) {
                try {
                  NodeHashTableIterator.field_e.write(ChatMessage.field_f.position, -98, 0, ChatMessage.field_f.payload);
                  ReflectionCheckRequest.field_m = hm.monotonicMillis(64);
                } catch (java.io.IOException decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var2 = (IOException) (Object) decompiledCaughtException;
                  na.closeGameSocket(true);
                }
                ChatMessage.field_f.position = 0;
              }
              if (param1 == 10000) {
                return;
              }
              SecondaryNodeHashTable.releaseStatics(true);
              return;
            }
          }
          ChatMessage.field_f.position = 0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    SecondaryNodeHashTable(int param0) {
        int var2 = 0;
        DualLinkNode dupTemp$1 = null;
        DualLinkNode var3;
        this.field_d = 0;
        this.field_a = new DualLinkNode[param0];
        this.field_h = param0;
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$1 = new DualLinkNode();
          var3 = dupTemp$1;
          this.field_a[var2] = dupTemp$1;
          var3.secondaryPrevious = var3;
          var3.secondaryNext = var3;
        }
    }

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          SecondaryNodeHashTable.sleepMillis(-87L, (byte) 117);
          field_e = null;
          field_f = null;
          return;
        }
        field_e = null;
        field_f = null;
    }

    static {
        field_e = "<%0> has withdrawn the request to join.";
        field_f = "Join <%0>'s game";
    }
}
