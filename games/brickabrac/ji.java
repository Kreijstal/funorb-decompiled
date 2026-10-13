/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ji implements Iterable {
    static boolean receivedChatSystem;
    private IntrusiveNode field_h;
    static Random packetDelayRandom;
    static String field_g;
    IntrusiveNode[] field_d;
    int field_c;
    static ResourceArchive field_a;
    static UiComponent field_b;

    public static void a(int param0) {
        field_a = null;
        field_g = null;
        field_b = null;
        if (param0 != 24968) {
          MusicTrack var2 = (MusicTrack) null;
          ji.a(-14, true, (MusicTrack) null, -51, -100, true);
          packetDelayRandom = null;
          return;
        }
        packetDelayRandom = null;
    }

    final IntrusiveNode a(long param0, int param1) {
        IntrusiveNode var5 = null;
        int var6 = BrickABrac.field_J ? 1 : 0;
        IntrusiveNode var4 = this.field_d[(int)((long)(this.field_c - 1) & param0)];
        IntrusiveNode var5Lifetime1;
        this.field_h = var4.next;
        if (param1 > 85) {
          while (var4 != this.field_h) {
            if (param0 == this.field_h.key) {
              var5 = this.field_h;
              this.field_h = this.field_h.next;
              return var5;
            }
            this.field_h = this.field_h.next;
          }
          this.field_h = null;
          return null;
        }
        this.field_c = -72;
        while (var4 != this.field_h) {
          if (param0 == this.field_h.key) {
            var5Lifetime1 = this.field_h;
            this.field_h = this.field_h.next;
            return var5Lifetime1;
          }
          this.field_h = this.field_h.next;
        }
        this.field_h = null;
        return null;
    }

    final void a(byte param0, long param1, IntrusiveNode param2) {
        IntrusiveNode var5 = null;
        try {
          if (null != param2.previous) {
            param2.unlink((byte) 111);
          }
          var5 = this.field_d[(int)(param1 & (long)(-1 + this.field_c))];
          param2.previous = var5.previous;
          param2.next = var5;
          param2.previous.next = param2;
          param2.next.previous = param2;
          int var6 = -64 % ((param0 + 60) / 52);
          param2.key = param1;
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "ji.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new ik(this));
    }

    final static void a(int param0, boolean param1, MusicTrack param2, int param3, int param4, boolean param5) {
        Object var6 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        Throwable decompiledCaughtException = null;
        Object var6_ref = null;
        RuntimeException var6_ref2 = null;
        try {
          var6_ref = DirectByteStorage.field_f;
          synchronized (var6_ref) {
            if (param0 != 25459) {
              field_g = (String) null;
            }
            if (IsaacGenerator.field_a == param2) {
              return;
            }
            IsaacGenerator.field_a = param2;
            if (IsaacGenerator.field_a != null) {
              m.musicSynthesizer.a(param4, IsaacGenerator.field_a, param3, param1, param0 - 25460, param5);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_15_0 = var6_ref2;
          stackIn_15_1 = new StringBuilder().append("ji.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    ji(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$1 = null;
        IntrusiveNode var3;
        this.field_d = new IntrusiveNode[param0];
        this.field_c = param0;
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$1 = new IntrusiveNode();
          var3 = dupTemp$1;
          this.field_d[var2] = dupTemp$1;
          var3.previous = var3;
          var3.next = var3;
        }
    }

    final static lo a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        lo var7 = null;
        int var8 = 0;
        lo stackIn_3_0 = null;
        lo stackIn_7_0 = null;
        lo stackIn_10_0 = null;
        lo stackIn_15_0 = null;
        lo stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = BrickABrac.field_J ? 1 : 0;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_3_0 = la.field_a;
            return stackIn_3_0;
          }
          if (255 < var2_int) {
            stackIn_7_0 = BitPacketBuffer.field_r;
            return stackIn_7_0;
          }
          var3 = FarmBackground.a((byte) -11, param0, '.');
          if (2 > var3.length) {
            stackIn_10_0 = la.field_a;
            return stackIn_10_0;
          }
          var4 = var3;
          var5 = param1;
          while (true) {
            if (var4.length <= var5) {
              stackIn_18_0 = ResourceArchive.a((byte) -95, var3[var3.length - 1]);
              return stackIn_18_0;
            }
            var6 = var4[var5];
            var7 = QuickChatHelpDialog.a(param1 ^ 95, var6);
            if (var7 == null) {
              var5++;
              continue;
            }
            break;
          }
          stackIn_15_0 = var7;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("ji.A(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_g = "Friends";
        packetDelayRandom = new Random();
    }
}
