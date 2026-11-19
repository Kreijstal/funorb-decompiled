/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IterableNodeHashTable implements Iterable {
    static IndexedSprite[] field_f;
    private IntrusiveNode field_e;
    static volatile int pointerY;
    static int field_b;
    int field_d;
    IntrusiveNode[] field_c;

    final static FriendEntry findFriend(byte param0, String param1) {
        String var2 = null;
        FriendEntry var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        Object stackIn_7_0 = null;
        Object stackIn_12_0 = null;
        FriendEntry stackIn_19_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = wizardrun.field_H;
        try {
          if (null == FriendLookupState.field_f) {
            return null;
          }
          if (param1 == null) {
            return null;
          }
          if (param1.length() == 0) {
            stackIn_7_0 = null;
            return (FriendEntry) (stackIn_7_0);
          }
          if (param0 != -116) {
            field_b = -125;
          }
          var6 = (CharSequence) ((Object) param1);
          var2 = MouseWheelInput.normalizePlayerName(-60, var6);
          if (var2 == null) {
            stackIn_12_0 = null;
            return (FriendEntry) (stackIn_12_0);
          }
          var3 = (FriendEntry) (FriendLookupState.field_f.get((long)var2.hashCode(), (byte) 104));
          while (var3 != null) {
            var7 = (CharSequence) ((Object) var3.displayName);
            var4 = MouseWheelInput.normalizePlayerName(-51, var7);
            if (var4.equals(var2)) {
              stackIn_19_0 = var3;
              return stackIn_19_0;
            }
            var3 = (FriendEntry) (FriendLookupState.field_f.nextMatch(false));
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_24_0 = var2_ref;
          stackIn_24_1 = new StringBuilder().append("gj.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new NodeHashTableIterator(this));
    }

    final static void setLogoPieceTransform(byte param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var4Lifetime1;
        int var5Lifetime1;
        var6 = wizardrun.field_H;
        var2 = 0;
        var3 = DualLinkNodeHashTable.field_f;
        if (5 > var3) {
          var2 = var3 * var3 * 8192 / 1100;
        } else {
          if (var3 < 105) {
            var2 = (var3 * 16384 - 40960) / 220;
            var4 = 1;
            var5 = 0;
            if (param1 == 3) {
              var4 = -1;
            }
            if (param1 == 1) {
              var5 = 1;
            }
            if (param1 == 4) {
              var4 = 1;
              var5 = 1;
            }
            if (param1 == 5) {
              var5 = 1;
              var4 = -1;
            }
            if (6 == param1) {
              var4 = 1;
              var5 = -1;
            }
            if (param1 == 7) {
              var4 = -1;
              var5 = -1;
            } else {
              if (param1 == 8) {
                var4 = -1;
                var5 = -1;
              }
            }
            if (param1 == 11) {
              var4 = -1;
            }
            if (param1 == 12) {
              var4 = -1;
              var5 = -1;
            }
            if (13 == param1) {
              var4 = 1;
              var5 = -1;
            }
            if (param0 != 115) {
              pointerY = -119;
            }
            if (param1 == 14) {
              var4 = -1;
              var5 = 1;
            }
            if (param1 == 15) {
              var4 = 1;
              var5 = 1;
            }
            ImageProducerRasterBuffer.field_m = HighscorePlayerState.createTwoAngleTransform(var4 * var2, var5 * var2, 24268);
            return;
          }
          if (var3 < 120) {
            var3 = 120 - var3;
            var2 = 8192 - var3 * (var3 * 8192) / 3300;
          }
        }
        var4Lifetime1 = 1;
        var5Lifetime1 = 0;
        if (param1 == 3) {
          var4Lifetime1 = -1;
        }
        if (param1 == 1) {
          var5Lifetime1 = 1;
        }
        if (param1 == 4) {
          var4Lifetime1 = 1;
          var5Lifetime1 = 1;
        }
        if (param1 == 5) {
          var5Lifetime1 = 1;
          var4Lifetime1 = -1;
        }
        if (6 == param1) {
          var4Lifetime1 = 1;
          var5Lifetime1 = -1;
        }
        if (param1 == 7) {
          var4Lifetime1 = -1;
          var5Lifetime1 = -1;
        } else {
          if (param1 == 8) {
            var4Lifetime1 = -1;
            var5Lifetime1 = -1;
          }
        }
        if (param1 == 11) {
          var4Lifetime1 = -1;
        }
        if (param1 == 12) {
          var4Lifetime1 = -1;
          var5Lifetime1 = -1;
        }
        if (13 == param1) {
          var4Lifetime1 = 1;
          var5Lifetime1 = -1;
        }
        if (param0 != 115) {
          pointerY = -119;
        }
        if (param1 == 14) {
          var4Lifetime1 = -1;
          var5Lifetime1 = 1;
        }
        if (param1 == 15) {
          var4Lifetime1 = 1;
          var5Lifetime1 = 1;
        }
        ImageProducerRasterBuffer.field_m = HighscorePlayerState.createTwoAngleTransform(var4Lifetime1 * var2, var5Lifetime1 * var2, 24268);
    }

    final static FriendEntry findIgnoredPlayer(String param0, int param1) {
        String var2 = null;
        FriendEntry var3 = null;
        String var4 = null;
        int var5 = 0;
        CharSequence var6 = null;
        CharSequence var7 = null;
        FriendEntry stackIn_3_0 = null;
        Object stackIn_6_0 = null;
        FriendEntry stackIn_18_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        var5 = wizardrun.field_H;
        try {
          if (param1 != -30782) {
            stackIn_3_0 = (FriendEntry) null;
            return stackIn_3_0;
          }
          if (null == IntrusiveNode.field_f) {
            stackIn_6_0 = null;
            return (FriendEntry) (stackIn_6_0);
          }
          var6 = (CharSequence) ((Object) param0);
          var2 = MouseWheelInput.normalizePlayerName(-55, var6);
          if (var2 == null) {
            var2 = param0;
          }
          var3 = (FriendEntry) (IntrusiveNode.field_f.get((long)var2.hashCode(), (byte) 124));
          while (true) {
            if (var3 == null) {
              return null;
            }
            var7 = (CharSequence) ((Object) var3.displayName);
            var4 = MouseWheelInput.normalizePlayerName(param1 + 30710, var7);
            if (var4 == null) {
              var4 = var3.displayName;
            }
            if (!var4.equals(var2)) {
              var3 = (FriendEntry) (IntrusiveNode.field_f.nextMatch(false));
              continue;
            }
            break;
          }
          stackIn_18_0 = var3;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_23_0 = var2_ref;
          stackIn_23_1 = new StringBuilder().append("gj.B(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_f = null;
        if (param0 >= 70) {
          return;
        }
        String var2 = (String) null;
        IterableNodeHashTable.findFriend((byte) -10, (String) null);
    }

    final IntrusiveNode get(boolean param0, long param1) {
        IntrusiveNode var4;
        IntrusiveNode var5;
        int var6;
        IntrusiveNode var5Lifetime1;
        var6 = wizardrun.field_H;
        var4 = this.field_c[(int)(param1 & (long)(-1 + this.field_d))];
        this.field_e = var4.next;
        if (!param0) {
          while (true) {
            if (var4 == this.field_e) {
              this.field_e = null;
              return null;
            }
            if (param1 != this.field_e.key) {
              this.field_e = this.field_e.next;
              continue;
            }
            break;
          }
          var5 = this.field_e;
          this.field_e = this.field_e.next;
          return var5;
        }
        IterableNodeHashTable.setLogoPieceTransform((byte) 61, -95);
        while (true) {
          if (var4 == this.field_e) {
            this.field_e = null;
            return null;
          }
          if (param1 != this.field_e.key) {
            this.field_e = this.field_e.next;
            continue;
          }
          break;
        }
        var5Lifetime1 = this.field_e;
        this.field_e = this.field_e.next;
        return var5Lifetime1;
    }

    final static void attachMouseListeners(java.awt.Component param0, int param1) {
        if (param1 <= 21) {
          return;
        }
        try {
          param0.addMouseListener(SavedDataRequest.mouseHandler);
          param0.addMouseMotionListener(SavedDataRequest.mouseHandler);
          param0.addFocusListener(SavedDataRequest.mouseHandler);
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "gj.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void put(long param0, IntrusiveNode param1, byte param2) {
        if (null != param1.previous) {
          param1.unlink(false);
        }
        IntrusiveNode var5 = this.field_c[(int)((long)(-1 + this.field_d) & param0)];
        param1.previous = var5.previous;
        if (param2 > -84) {
          return;
        }
        try {
          param1.next = var5;
          param1.previous.next = param1;
          param1.key = param0;
          param1.next.previous = param1;
        } catch (RuntimeException runtimeException) {
          throw ExceptionSupport.wrapException((Throwable) ((Object) runtimeException), "gj.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private IterableNodeHashTable() throws Throwable {
        throw new Error();
    }

    static {
        pointerY = -1;
        field_b = 0;
    }
}
