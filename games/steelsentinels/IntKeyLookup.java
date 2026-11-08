/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class IntKeyLookup {
    static SceneWidget[] field_a;
    static String field_e;
    static String field_f;
    static String field_b;
    static String field_k;
    private int[] keyIndexSlots;
    static int[] field_j;
    static QuickChatMenu field_i;
    static String field_g;
    static SceneWidget field_h;
    static int field_d;

    final static boolean c(byte param0) {
        if (param0 <= 77) {
          IntKeyLookup.d((byte) 44);
        }
        return !gf.field_a.a((byte) -72) ? true : false;
    }

    final int get(int key, byte obfuscationGuard) {
        int bucketMask;
        int bucket;
        int var5;
        int inputIndex;
        bucketMask = (this.keyIndexSlots.length >> 1) - 1;
        bucket = key & bucketMask;
        var5 = 8 / ((48 - obfuscationGuard) / 60);
        while (true) {
          inputIndex = this.keyIndexSlots[1 + bucket + bucket];
          if (inputIndex == -1) {
            return -1;
          }
          if (this.keyIndexSlots[bucket + bucket] == key) {
            return inputIndex;
          }
          bucket = bucketMask & bucket + 1;
        }
    }

    final static String a(int param0, byte[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 13) {
            field_g = (String) null;
          }
          stackIn_3_0 = SoundCache.a((byte) 37, 0, param1, param1.length);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("jk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    IntKeyLookup(int[] keys) {
        int capacity = 0;
        int slotIndex = 0;
        int bucket = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int inputIndex;
        try {
          capacity = 1;
          while ((keys.length >> 1) + keys.length >= capacity) {
            capacity = capacity << 1;
          }
          this.keyIndexSlots = new int[capacity + capacity];
          for (slotIndex = 0; capacity + capacity > slotIndex; slotIndex++) {
            this.keyIndexSlots[slotIndex] = -1;
          }
          for (inputIndex = 0; inputIndex < keys.length; inputIndex++) {
            bucket = -1 + capacity & keys[inputIndex];
            while (this.keyIndexSlots[1 + bucket + bucket] != -1) {
              bucket = 1 + bucket & -1 + capacity;
            }
            this.keyIndexSlots[bucket + bucket] = keys[inputIndex];
            this.keyIndexSlots[1 + bucket + bucket] = inputIndex;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("jk.<init>(");
          if (keys == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(int param0, PacketBuffer param1) {
        try {
          int var4 = 0;
          byte[] var2 = null;
          int var3_int = 0;
          Exception var3 = null;
          int var5 = 0;
          byte[] var6 = null;
          byte[] var7 = null;
          byte[] var8 = null;
          byte[] var9 = null;
          byte[] var10 = null;
          RuntimeException stackIn_21_0 = null;
          StringBuilder stackIn_21_1 = null;
          String stackIn_22_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var2_ref = null;
          var5 = SteelSentinels.obfuscationControl;
          try {
            if (param0 < 120) {
              field_a = (SceneWidget[]) null;
            }
            var9 = new byte[24];
            var7 = var9;
            var6 = var7;
            var10 = var6;
            var8 = var10;
            var2 = var8;
            if (null != va.field_h) {
              try {
                va.field_h.a(-121, 0L);
                va.field_h.a(-121, var9);
                for (var3_int = 0; 24 > var3_int; var3_int++) {
                  if (var10[var3_int] == 0) {
                    continue;
                  }
                  break;
                }
                if (var3_int >= 24) {
                  throw new IOException();
                }
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var3 = (Exception) (Object) decompiledCaughtException;
                for (var4 = 0; var4 < 24; var4++) {
                  var2[var4] = (byte)-1;
                }
              }
              param1.writeBytes(24, (byte) -122, 0, var10);
            } else {
              param1.writeBytes(24, (byte) -122, 0, var10);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = var2_ref;
            stackIn_21_1 = new StringBuilder().append("jk.C(").append(param0).append(',');
            if (param1 == null) {
              stackIn_22_2 = "null";
            } else {
              stackIn_22_2 = "{...}";
            }
            throw ci.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void d(byte param0) {
        pc.d(param0 - 14);
        vd.a((byte) 63);
        if (param0 != -66) {
          field_b = (String) null;
        }
    }

    public static void releaseStatics(byte param0) {
        if (param0 >= -67) {
          IntKeyLookup.c((byte) -9);
        }
        field_f = null;
        field_g = null;
        field_e = null;
        field_i = null;
        field_h = null;
        field_a = null;
        field_j = null;
        field_b = null;
        field_k = null;
    }

    final static void a(byte param0) {
        RgbSprite var3 = new RgbSprite(120, 30);
        RgbSprite var4 = var3;
        SoundCache.field_a[0] = qe.a(var4, (byte) -93, EditableTextWidget.field_eb);
        SoundCache.field_a[1] = qe.a(var4, (byte) -93, gf.field_e);
        SoundCache.field_a[2] = qe.a(var4, (byte) -93, ob.field_w);
        SoundCache.field_a[3] = qe.a(var4, (byte) -93, fm.field_i);
        SoundCache.field_a[4] = qe.a(var4, (byte) -93, BoundedRandomAccessFile.field_o);
        SoundCache.field_a[5] = qe.a(var4, (byte) -93, gm.field_a);
        SoundCache.field_a[9] = qe.a(var4, (byte) -93, fc.field_c);
        SoundCache.field_a[10] = qe.a(var4, (byte) -93, hm.field_e);
        SoundCache.field_a[11] = qe.a(var4, (byte) -93, BoundedRandomAccessFile.field_a);
        SoundCache.field_a[12] = qe.a(var4, (byte) -93, jm.field_t);
        SoundCache.field_a[13] = qe.a(var4, (byte) -93, cl.field_g);
        SoundCache.field_a[14] = qe.a(var4, (byte) -93, DialWidgetPainter.field_p);
        SoundCache.field_a[15] = qe.a(var4, (byte) -93, ValidationIndicator.field_X);
        SoundCache.field_a[16] = qe.a(var4, (byte) -93, pl.field_V);
        lc.field_a = new IndexedSprite[SoundCache.field_a.length];
        ArraySupport.copy(SoundCache.field_a, 0, lc.field_a, 0, SoundCache.field_a.length);
        lc.field_a[5] = SoundCache.field_a[15];
        lc.field_a[4] = SoundCache.field_a[14];
        lc.field_a[3] = SoundCache.field_a[13];
        lc.field_a[8] = SoundCache.field_a[7];
        lc.field_a[7] = SoundCache.field_a[12];
        lc.field_a[15] = null;
        lc.field_a[14] = null;
        lc.field_a[13] = null;
        lc.field_a[12] = SoundCache.field_a[7];
        rh.field_v[6].bindRasterTarget();
        if (param0 != 6) {
          return;
        }
        BoundedUrlRequest.field_d.drawCentered(gf.field_e, 78, 26, 0, -1);
        BoundedUrlRequest.field_d.drawCentered(ob.field_w, 130, 26, 0, -1);
        Checkbox.field_bb.b((byte) 121);
    }

    static {
        field_f = "achievements to collect";
        field_k = "<%1> was caught in <%0>'s core containment explosion";
        field_b = "Start Game";
        field_j = new int[]{14, 15, 16, 22, 4, -1, 8};
    }
}
