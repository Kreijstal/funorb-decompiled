/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class no extends en {
    static au field_K;
    static int[] field_U;
    static je field_M;
    static RgbSprite field_P;
    static int field_J;
    private fn field_Q;
    static int field_S;
    private fn field_O;
    static je field_T;
    private boolean field_R;
    private fn field_L;
    static String field_N;

    final int l(int param0) {
        int stackIn_2_0 = 0;
        Throwable decompiledCaughtException = null;
        int var2 = 0;
        NumberFormatException var3 = null;
        var2 = 47 % ((param0 + 30) / 36);
        try {
          stackIn_2_0 = Integer.parseInt(this.field_L.field_v);
          return stackIn_2_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    final boolean k(int param0) {
        if (null == this.field_L.field_v) {
          return true;
        }
        if (0 == this.field_L.field_v.length()) {
          return true;
        }
        if (null != this.field_Q.field_v &&
          this.field_Q.field_v.length() != 0) {
          if (param0 != -22339) {
            return false;
          }
          if (null != this.field_O.field_v &&
            this.field_O.field_v.length() != 0) {
            return false;
          }
          return true;
        }
        return true;
    }

    private final void a(String param0, kb param1, int param2, int param3, int param4) {
        try {
          gl.field_e.c(param0, param4 - (-param1.field_B - (param1.field_l >> 1)), param1.field_p + (param2 - 5), param3, -1);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "no.N(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    no(kh param0, boolean param1, int param2, int param3, int param4, int param5) {
        this(param0, param1);
        try {
          this.a(param2, param4, param3, 8192, param5);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "no.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void readTaggedFields(CipherPacketBuffer packet, TaggedFieldReader target, int recordBitLength, int obfuscationGuard) {
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var4_int = recordBitLength + packet.getReadBitPosition(false);
          while (packet.getReadBitPosition(false) < var4_int) {
            var5 = TextCursor.readTagName(packet, true);
            var6 = packet.getReadBitPosition(false);
            var7 = AiPlanner.readCompactInt(packet, true);
            var8 = packet.getReadBitPosition(false) - var6;
            kq.enterTaggedPayload(var6, obfuscationGuard + 489, var8, var7, packet);
            target.decodeTaggedField(var7, packet, var5, (byte) 37);
            ao.finishTaggedPayload(var6, 4, var8, packet, var7);
          }
          if (obfuscationGuard == -24721) {
            return;
          }
          field_M = (je) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("no.K(");
          if (packet == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (target == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(recordBitLength).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void a(byte param0, sb param1) {
        try {
          super.a((byte) -108, param1);
          this.field_L.field_x = (qo) ((Object) param1);
          this.field_Q.field_x = (qo) ((Object) param1);
          if (param0 > -21) {
            this.k(-25);
          }
          this.field_O.field_x = (qo) ((Object) param1);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "no.I(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int m(int param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (param0 != -26458) {
          return -46;
        }
        try {
          stackIn_3_0 = Integer.parseInt(this.field_Q.field_v) - 1;
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    public static void c(boolean param0) {
        field_N = null;
        field_U = null;
        field_P = null;
        field_T = null;
        field_M = null;
        field_K = null;
        if (param0) {
          field_U = (int[]) null;
        }
    }

    final String h(int param0) {
        String var2 = this.field_Q.h(param0 ^ 0);
        if (var2 != null) {
          return var2;
        }
        if (this.field_t) {
          return this.field_s == null ? this.field_v : this.field_s;
        }
        if (param0 != 21384) {
          field_K = (au) null;
          return null;
        }
        return null;
    }

    final static void b(boolean param0) {
        tf.a((byte) -99, CombatEvent.d((byte) -111));
        if (param0) {
          field_N = (String) null;
        }
    }

    final void a(int param0, int param1, byte param2, int param3) {
        super.a(param0, param1, (byte) -84, param3);
        if (0 != param3) {
          return;
        }
        if (param2 < -82) {
          param0 = param0 + this.field_B;
          param1 = param1 + this.field_p;
          this.a(mi.field_z, this.field_L, param1, 16777215, param0);
          this.a(eb.field_e, this.field_Q, param1, 16777215, param0);
          this.a(iu.field_l, this.field_O, param1, 16777215, param0);
          return;
        }
    }

    final static String a(char param0, boolean param1, int param2) {
        int var4 = 0;
        int var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        char[] var6 = new char[param2];
        char[] var3 = var6;
        if (param1) {
          for (var4 = 0; param2 > var4; var4++) {
            var6[var4] = param0;
          }
          return new String(var6);
        }
        return (String) null;
    }

    private no(kh param0, boolean param1) {
        super(0, 0, 0, 0, (kh) null);
        try {
          this.field_L = (fn) ((Object) new ma("", (qo) null, 2));
          this.field_Q = (fn) ((Object) new ma("", (qo) null, 2));
          this.field_O = (fn) ((Object) new ma("", (qo) null, 4));
          this.field_O.field_k = param0;
          this.field_Q.field_k = param0;
          this.field_L.field_k = param0;
          this.field_R = param1 ? true : false;
          if (!this.field_R) {
            this.a((byte) 10, (kb) (this.field_L));
            this.a((byte) 10, (kb) (this.field_Q));
          } else {
            this.a((byte) 10, (kb) (this.field_Q));
            this.a((byte) 10, (kb) (this.field_L));
          }
          this.a((byte) 10, (kb) (this.field_O));
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "no.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, 8192, param4);
        int var6 = param1 - 130 >> 1;
        if (this.field_R) {
          this.field_Q.a(var6, 25, 0, 8192, param4);
          this.field_L.a(var6 + 45, 25, 0, 8192, param4);
          this.field_O.a(90 + var6, 40, 0, param3, param4);
          return;
        }
        this.field_L.a(var6, 25, 0, 8192, param4);
        this.field_Q.a(45 + var6, 25, 0, 8192, param4);
        this.field_O.a(90 + var6, 40, 0, param3, param4);
    }

    final int a(byte param0) {
        NumberFormatException var2 = null;
        int stackIn_3_0 = 0;
        Throwable decompiledCaughtException = null;
        if (param0 != -77) {
          return -48;
        }
        try {
          stackIn_3_0 = Integer.parseInt(this.field_O.field_v);
          return stackIn_3_0;
        } catch (java.lang.NumberFormatException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (NumberFormatException) (Object) decompiledCaughtException;
          return -1;
        }
    }

    static {
        field_P = new RgbSprite(0, 0);
    }
}
