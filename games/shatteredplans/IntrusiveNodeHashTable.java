/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class IntrusiveNodeHashTable {
    static java.util.zip.CRC32 field_k;
    private IntrusiveNode field_f;
    private int field_b;
    private IntrusiveNode[] field_a;
    private IntrusiveNode field_l;
    static fg field_d;
    static fg field_i;
    private int field_c;
    static Sprite field_h;
    static boolean field_e;
    static String field_j;
    static Archive field_g;

    public static void clearStatics(int param0) {
        field_h = null;
        field_d = null;
        field_i = null;
        field_k = null;
        field_j = null;
        field_g = null;
        if (param0 != 0) {
          field_k = (java.util.zip.CRC32) null;
        }
    }

    final void put(IntrusiveNode param0, int param1, long param2) {
        IntrusiveNode var5 = null;
        try {
          if (param0.previous != null) {
            param0.unlink((byte) -125);
          }
          var5 = this.field_a[(int)((long)(-1 + this.field_b) & param2)];
          param0.previous = var5.previous;
          param0.next = var5;
          param0.previous.next = param0;
          param0.key = param2;
          int var6 = 113 / ((-54 - param1) / 63);
          param0.next.previous = param0;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "ti.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final IntrusiveNode get(long param0, int param1) {
        IntrusiveNode var5 = null;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        IntrusiveNode var4 = this.field_a[(int)(param0 & (long)(-1 + this.field_b))];
        this.field_l = var4.next;
        while (this.field_l != var4) {
          if (this.field_l.key == param0) {
            var5 = this.field_l;
            this.field_l = this.field_l.next;
            return var5;
          }
          this.field_l = this.field_l.next;
        }
        if (param1 != -25064) {
          this.get(61L, 9);
        }
        this.field_l = null;
        return null;
    }

    final static Sprite[] a(int param0) {
        int var2 = 0;
        int var6_int = 0;
        int var7 = 0;
        Sprite[] var1;
        int var3;
        int[] var6;
        int var8;
        int[] var9;
        int[] var13;
        int[] var16;
        byte[] var20;
        int[] var21;
        byte[] var22;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        var1 = new Sprite[en.field_c];
        if (param0 >= -103) {
          return (Sprite[]) null;
        }
        for (var2 = 0; var2 < en.field_c; var2++) {
          var3 = WeightedCacheEntry.field_s[var2] * IntHashIndex.field_g[var2];
          var20 = hd.field_q[var2];
          if (!SectorCacheStore.field_h[var2]) {
            var9 = new int[var3];
            var21 = var9;
            for (var6_int = 0; var3 > var6_int; var6_int++) {
              var9[var6_int] = eo.field_fb[we.intAnd((int) var20[var6_int], 255)];
            }
            var1[var2] = new Sprite(NetworkArchiveRequest.field_y, BattleEvent.field_t, cf.field_H[var2], sj.field_a[var2], WeightedCacheEntry.field_s[var2], IntHashIndex.field_g[var2], var21);
          } else {
            var22 = MusicEnvelope.field_l[var2];
            var16 = new int[var3];
            var13 = var16;
            var6 = var13;
            for (var7 = 0; var3 > var7; var7++) {
              var6[var7] = PrivateChatMessage.intOr(eo.field_fb[we.intAnd((int) var20[var7], 255)], we.intAnd(255, (int) var22[var7]) << 24);
            }
            var1[var2] = (Sprite) ((Object) new ArgbSprite(NetworkArchiveRequest.field_y, BattleEvent.field_t, cf.field_H[var2], sj.field_a[var2], WeightedCacheEntry.field_s[var2], IntHashIndex.field_g[var2], var16));
          }
        }
        TertiaryListSequence.a(0);
        return var1;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, PlatformTaskDispatcher param6, String param7, int param8) {
        try {
          ae.field_h = param3;
          dh.field_a = param6;
          StandardMapReader.field_d = param7;
          QuickChatPhraseDefinition.field_u = param0;
          hn.field_i = param1;
          if (param5 != 1491341222) {
            field_j = (String) null;
          }
          sr.field_q = param4;
          sg.field_Cb = param2;
          cf.field_D = param8;
          TertiaryLinkNode.field_o = (ArchiveNetworkClient) ((Object) new SocketArchiveNetworkClient());
          BattleSnapshot.field_w = new DiskCacheWorker(param6);
          lg.field_c = new ArchiveSourceManager(TertiaryLinkNode.field_o, BattleSnapshot.field_w);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "ti.F(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ')');
        }
    }

    final static int a(byte param0, Star[] param1) {
        int var6 = 0;
        int var9 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        IntrusiveDeque var3 = null;
        IntrusiveDeque var4 = null;
        int var5 = 0;
        Star var7 = null;
        Star[] var8 = null;
        Star var10 = null;
        int var11 = 0;
        Star var12 = null;
        Star var13 = null;
        int var2_intLifetime1;
        var11 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          for (var2_int = 0; var2_int < param1.length; var2_int++) {
            param1[var2_int].field_x = -1;
          }
          var2_intLifetime1 = param1.length;
          var3 = new IntrusiveDeque();
          if (param0 != 83) {
            field_k = (java.util.zip.CRC32) null;
          }
          var4 = new IntrusiveDeque();
          var5 = 0;
          for (var6 = 0; var2_intLifetime1 > var6; var6++) {
            var12 = param1[var6];
            if (var12.field_x == -1) {
              var4.addLast((byte) -113, var12);
              {
                while (!(var4.isEmpty(-121))) {
                  var13 = (Star) (var4.pollFirst(80));
                  var3.addLast((byte) -113, var13);
                  var13.field_x = var5;
                  if (var13.field_D == null) {
                    continue;
                  }
                  var8 = var13.field_D;
                  for (var9 = 0; var9 < var8.length; var9++) {
                    var10 = var8[var9];
                    if (var10.field_x == -1) {
                      var4.addLast((byte) -113, var10);
                    }
                  }
                }
                {
                  var7 = (Star) (var3.startForward(0));
                  while (var7 != null) {
                    var7.field_x = var5;
                    var7 = (Star) (var3.nextForward((byte) -71));
                  }
                  var3.clear(0);
                  var5++;
                }
              }
            }
          }
          stackIn_25_0 = var5;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_28_0 = var2;
          stackIn_28_1 = new StringBuilder().append("ti.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final IntrusiveNode nextInTraversal(boolean param0) {
        int fieldTemp$0 = 0;
        IntrusiveNode var2;
        int var3;
        IntrusiveNode var4;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        if (this.field_c > 0 &&
          this.field_f != this.field_a[this.field_c - 1]) {
          var2 = this.field_f;
          this.field_f = var2.next;
          return var2;
        }
        do {
          if (this.field_b <= this.field_c) {
            if (!param0) {
              return null;
            }
            IntrusiveNodeHashTable.a(10);
            return null;
          }
          fieldTemp$0 = this.field_c;
          this.field_c = this.field_c + 1;
          var4 = this.field_a[fieldTemp$0].next;
          var2 = var4;
        } while (var4 == this.field_a[this.field_c - 1]);
        this.field_f = var2.next;
        return var2;
    }

    final IntrusiveNode startTraversal(int param0) {
        int var2 = 61 % ((param0 + 63) / 54);
        this.field_c = 0;
        return this.nextInTraversal(false);
    }

    final static void a(int param0, int param1) {
        CipherPacketBuffer var2 = js.field_f;
        var2.h(param0, 255);
        var2.position = var2.position + 1;
        int var3 = var2.position;
        var2.writeByte(5, (byte) -92);
        var2.writeByte(np.field_a.field_Eb, (byte) -120);
        int var4 = (np.field_a.field_Fb << 6) + np.field_a.field_nc;
        var2.writeByte(var4, (byte) -72);
        var2.writeBytes(param1, np.field_a.field_dc.length, np.field_a.field_dc, param1 ^ 22186);
        var2.patchLengthByte(var2.position - var3, (byte) 124);
    }

    final static boolean a(String param0, boolean param1) {
        RuntimeException var2 = null;
        boolean stackIn_5_0 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            field_k = (java.util.zip.CRC32) null;
          }
          stackIn_5_0 = (null != di.a(param0, 119));
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("ti.J(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw UrlLoader.wrapThrowable((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    IntrusiveNodeHashTable(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$0 = null;
        IntrusiveNode var3 = null;
        this.field_c = 0;
        this.field_b = param0;
        this.field_a = new IntrusiveNode[param0];
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$0 = new IntrusiveNode();
          var3 = dupTemp$0;
          this.field_a[var2] = dupTemp$0;
          var3.next = var3;
          var3.previous = var3;
        }
    }

    static {
        field_k = new java.util.zip.CRC32();
        field_d = new fg();
        field_j = "Add <%0> to friend list";
        field_i = new fg();
    }
}
