/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SecondaryNodeHashTable {
    static fta field_g;
    private DualLinkNode field_c;
    private int field_e;
    private DualLinkNode[] field_d;
    private long field_h;
    static ResourceArchive field_b;
    private DualLinkNode field_a;
    private int field_f;

    final static dh[] queryDisplayModes(int param0, PlatformTaskDispatcher param1) {
        int var5 = 0;
        dh[] stackIn_3_0 = null;
        dh[] stackIn_9_0 = null;
        dh[] stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int[] var3 = null;
        dh[] var4 = null;
        int var6 = 0;
        dh var7 = null;
        int var8 = 0;
        AsyncRequest var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        var8 = TombRacer.field_G ? 1 : 0;
        try {
          if (!param1.isFullscreenAvailable((byte) 69)) {
            stackIn_3_0 = new dh[]{};
            return stackIn_3_0;
          }
          var9 = param1.a(-111);
          while (var9.field_b == 0) {
            TrapSpawner.sleepMillis(0, 10L);
          }
          if (2 == var9.field_b) {
            stackIn_9_0 = new dh[]{};
            return stackIn_9_0;
          }
          var11 = (int[]) (var9.field_f);
          var10 = var11;
          var3 = var10;
          var4 = new dh[var11.length >> 2];
          var6 = 63 / ((param0 - 0) / 46);
          for (var5 = 0; var4.length > var5; var5++) {
            var7 = new dh();
            var4[var5] = var7;
            var7.field_a = var3[var5 << 2];
            var7.field_c = var3[1 + (var5 << 2)];
            var7.field_d = var3[2 + (var5 << 2)];
            var7.field_b = var3[(var5 << 2) + 3];
          }
          stackIn_14_0 = var4;
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_17_0 = var2;
          stackIn_17_1 = new StringBuilder().append("af.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final void put(int param0, DualLinkNode param1, long param2) {
        DualLinkNode var5 = null;
        try {
          if (param1.secondaryPrevious != null) {
            param1.unlinkSecondary(-7975);
          }
          var5 = this.field_d[(int)((long)(param0 + this.field_e) & param2)];
          param1.secondaryPrevious = var5.secondaryPrevious;
          param1.secondaryNext = var5;
          param1.secondaryPrevious.secondaryNext = param1;
          param1.secondaryKey = param2;
          param1.secondaryNext.secondaryPrevious = param1;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "af.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 <= 72) {
          SecondaryNodeHashTable.releaseStatics(-28);
          field_g = null;
          field_b = null;
          return;
        }
        field_g = null;
        field_b = null;
    }

    final DualLinkNode a(byte param0) {
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
        var3 = TombRacer.field_G ? 1 : 0;
        if (this.field_f <= 0) {
          if (param0 == -112) {
            do {
              if (this.field_f >= this.field_e) {
                return null;
              }
              fieldTemp$1 = this.field_f;
              this.field_f = this.field_f + 1;
              var4 = this.field_d[fieldTemp$1].secondaryNext;
              var58 = var4;
            } while (var4 == this.field_d[this.field_f - 1]);
            this.field_a = var58.secondaryNext;
            return var58;
          }
          this.put(55, (DualLinkNode) null, 93L);
          do {
            if (this.field_f >= this.field_e) {
              return null;
            }
            fieldTemp$0 = this.field_f;
            this.field_f = this.field_f + 1;
            var4 = this.field_d[fieldTemp$0].secondaryNext;
            var59 = var4;
          } while (var4 == this.field_d[this.field_f - 1]);
          this.field_a = var59.secondaryNext;
          return var59;
        }
        if (this.field_a != this.field_d[-1 + this.field_f]) {
          var57 = this.field_a;
          this.field_a = var57.secondaryNext;
          return var57;
        }
        if (param0 == -112) {
          do {
            if (this.field_f >= this.field_e) {
              return null;
            }
            fieldTemp$3 = this.field_f;
            this.field_f = this.field_f + 1;
            var4 = this.field_d[fieldTemp$3].secondaryNext;
            var5 = var4;
          } while (var4 == this.field_d[this.field_f - 1]);
          this.field_a = var5.secondaryNext;
          return var5;
        }
        this.put(55, (DualLinkNode) null, 93L);
        do {
          if (this.field_f >= this.field_e) {
            return null;
          }
          fieldTemp$2 = this.field_f;
          this.field_f = this.field_f + 1;
          var4 = this.field_d[fieldTemp$2].secondaryNext;
          var29 = var4;
        } while (var4 == this.field_d[this.field_f - 1]);
        this.field_a = var29.secondaryNext;
        return var29;
    }

    final DualLinkNode startTraversal(int param0) {
        int var2 = -55 % ((-40 - param0) / 47);
        this.field_f = 0;
        return this.a((byte) -112);
    }

    final DualLinkNode get(int param0, long param1) {
        DualLinkNode var4;
        DualLinkNode var5;
        int var6;
        DualLinkNode var4Lifetime1;
        DualLinkNode var5Lifetime1;
        var6 = TombRacer.field_G ? 1 : 0;
        if (param0 <= -104) {
          this.field_h = param1;
          var4 = this.field_d[(int)(param1 & (long)(-1 + this.field_e))];
          this.field_c = var4.secondaryNext;
          while (true) {
            if (this.field_c == var4) {
              this.field_c = null;
              return null;
            }
            if (this.field_c.secondaryKey != param1) {
              this.field_c = this.field_c.secondaryNext;
              continue;
            }
            break;
          }
          var5 = this.field_c;
          this.field_c = this.field_c.secondaryNext;
          return var5;
        }
        this.field_f = 105;
        this.field_h = param1;
        var4Lifetime1 = this.field_d[(int)(param1 & (long)(-1 + this.field_e))];
        this.field_c = var4Lifetime1.secondaryNext;
        while (true) {
          if (this.field_c == var4Lifetime1) {
            this.field_c = null;
            return null;
          }
          if (this.field_c.secondaryKey != param1) {
            this.field_c = this.field_c.secondaryNext;
            continue;
          }
          break;
        }
        var5Lifetime1 = this.field_c;
        this.field_c = this.field_c.secondaryNext;
        return var5Lifetime1;
    }

    final DualLinkNode nextWithSameKey(byte param0) {
        DualLinkNode var3 = null;
        int var4 = TombRacer.field_G ? 1 : 0;
        if (param0 <= 13) {
          return (DualLinkNode) null;
        }
        if (null == this.field_c) {
          return null;
        }
        DualLinkNode var2 = this.field_d[(int)(this.field_h & (long)(-1 + this.field_e))];
        while (var2 != this.field_c) {
          if (~this.field_c.secondaryKey == ~this.field_h) {
            var3 = this.field_c;
            this.field_c = this.field_c.secondaryNext;
            return var3;
          }
          this.field_c = this.field_c.secondaryNext;
        }
        this.field_c = null;
        return null;
    }

    SecondaryNodeHashTable(int param0) {
        int var2 = 0;
        DualLinkNode dupTemp$1 = null;
        DualLinkNode var3;
        this.field_f = 0;
        this.field_e = param0;
        this.field_d = new DualLinkNode[param0];
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$1 = new DualLinkNode();
          var3 = dupTemp$1;
          this.field_d[var2] = dupTemp$1;
          var3.secondaryPrevious = var3;
          var3.secondaryNext = var3;
        }
    }

    static {
        field_g = new fta();
    }
}
