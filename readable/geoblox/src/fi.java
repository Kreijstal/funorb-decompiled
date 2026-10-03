/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi {
    static String changeDisplayNameText;
    private IntrusiveNode[] field_e;
    static Boolean field_b;
    private IntrusiveNode field_a;
    private int field_c;
    private int field_f;
    private IntrusiveNode field_g;
    static MonochromeBitmapFont smallFont;

    final IntrusiveNode a(long param0, byte param1) {
        IntrusiveNode var5 = null;
        IntrusiveNode var4 = this.field_e[(int)((long)(-1 + this.field_c) & param0)];
        this.field_g = var4.nextNode;
        while (var4 != this.field_g) {
            if (!(~this.field_g.field_a != ~param0)) {
                var5 = this.field_g;
                this.field_g = this.field_g.nextNode;
                return var5;
            }
            this.field_g = this.field_g.nextNode;
        }
        if (param1 >= -73) {
            this.a((byte) -38);
            this.field_g = null;
            return null;
        }
        this.field_g = null;
        return null;
    }

    final static int cosineQ16(int angle8192, int methodGuard) {
        if (methodGuard != 2048) {
            changeDisplayNameText = (String) null;
            angle8192 = angle8192 & 8191;
            if (angle8192 >= 4096) {
                return angle8192 >= 6144 ? ai.quarterSineQ16[-6144 + angle8192] : -ai.quarterSineQ16[-angle8192 + 6144];
            }
            return 2048 <= angle8192 ? -ai.quarterSineQ16[angle8192 - 2048] : ai.quarterSineQ16[-angle8192 + 2048];
        }
        angle8192 = angle8192 & 8191;
        if (angle8192 >= 4096) {
            return angle8192 >= 6144 ? ai.quarterSineQ16[-6144 + angle8192] : -ai.quarterSineQ16[-angle8192 + 6144];
        }
        return 2048 <= angle8192 ? -ai.quarterSineQ16[angle8192 - 2048] : ai.quarterSineQ16[-angle8192 + 2048];
    }

    final void a(byte param0, IntrusiveNode param1, long param2) {
        IntrusiveNode var5 = null;
        try {
            if (!(null == param1.previousNode)) {
                param1.unlinkNode(false);
            }
            var5 = this.field_e[(int)((long)(this.field_c - 1) & param2)];
            param1.nextNode = var5;
            param1.previousNode = var5.previousNode;
            param1.previousNode.nextNode = param1;
            param1.field_a = param2;
            if (param0 != 102) {
                smallFont = (MonochromeBitmapFont) null;
            }
            param1.nextNode.previousNode = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "fi.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0, rf param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            changeDisplayNameText = (String) null;
          }
          if ((param1 != null) &&
              (param1 != GzipInflater.field_e)) {
            uh.field_y.d(-9268);
            fj.field_p.a();
            GzipInflater.field_e = param1;
            uh.field_y.a(true, GzipInflater.field_e, -1706);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = (RuntimeException) (runtimeException);
          stackIn_10_1 = new StringBuilder().append("fi.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final IntrusiveNode a(byte param0) {
        if (param0 != 125) {
            fi.a(103);
            this.field_f = 0;
            return this.b(param0 - 195);
        }
        this.field_f = 0;
        return this.b(param0 - 195);
    }

    public static void a(int param0) {
        changeDisplayNameText = null;
        if (param0 >= -113) {
            return;
        }
        field_b = null;
        smallFont = null;
    }

    fi(int param0) {
        int var2 = 0;
        IntrusiveNode dupTemp$1 = null;
        IntrusiveNode var3;
        this.field_f = 0;
        this.field_c = param0;
        this.field_e = new IntrusiveNode[param0];
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$1 = new IntrusiveNode();
          var3 = dupTemp$1;
          this.field_e[var2] = dupTemp$1;
          var3.nextNode = var3;
          var3.previousNode = var3;
        }
    }

    final IntrusiveNode b(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var2;
        IntrusiveNode var3;
        IntrusiveNode var4;
        IntrusiveNode var7;
        if (this.field_f <= 0) {
          while (true) {
            if (this.field_c <= this.field_f) {
              var2 = 47 % ((param0 - 28) / 38);
              return null;
            }
            fieldTemp$1 = this.field_f;
            this.field_f = this.field_f + 1;
            var3 = this.field_e[fieldTemp$1].nextNode;
            if (this.field_e[-1 + this.field_f] == var3) {
              continue;
            }
            this.field_a = var3.nextNode;
            return var3;
          }
        }
        if (this.field_a != this.field_e[this.field_f - 1]) {
          var7 = this.field_a;
          this.field_a = var7.nextNode;
          return var7;
        }
        while (true) {
          if (this.field_c <= this.field_f) {
            var2 = 47 % ((param0 - 28) / 38);
            return null;
          }
          fieldTemp$0 = this.field_f;
          this.field_f = this.field_f + 1;
          var4 = this.field_e[fieldTemp$0].nextNode;
          if (this.field_e[-1 + this.field_f] == var4) {
            continue;
          }
          this.field_a = var4.nextNode;
          return var4;
        }
    }

    static {
        changeDisplayNameText = "Change display name";
    }
}
