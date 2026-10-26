/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CipherPacketBuffer extends PacketBuffer {
    static jb field_p;
    private int field_q;
    private fc field_l;
    static RenderSprite[] field_n;
    static long field_o;
    static vd[] field_m;

    public static void l(byte param0) {
        field_m = null;
        field_n = null;
        field_p = null;
        if (param0 <= 91) {
          CipherPacketBuffer.l((byte) -94);
        }
    }

    final void g(int param0, int param1) {
        int fieldTemp$0 = 0;
        if (param0 >= 35) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte)(this.field_l.b(256) + param1);
          return;
        }
    }

    final void a(byte[] param0, int param1, int param2, boolean param3) {
        int var5_int = 0;
        int fieldTemp$0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        int var6 = 0;
        var6 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param3) {
            field_o = 102L;
          }
          for (var5_int = 0; param1 > var5_int; var5_int++) {
            fieldTemp$0 = this.position;
            this.position = this.position + 1;
            param0[param2 + var5_int] = (byte)(this.payload[fieldTemp$0] - this.field_l.b(256));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_9_0 = var5;
          stackIn_9_1 = new StringBuilder().append("dl.E(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void j(int param0) {
        this.field_q = 8 * this.position;
        int var2 = -79 / ((-15 - param0) / 44);
    }

    final void m(byte param0) {
        this.position = (this.field_q + 7) / 8;
        if (param0 <= 33) {
          field_n = (RenderSprite[]) null;
        }
    }

    CipherPacketBuffer(byte[] param0) {
        super(param0);
    }

    final static String k(byte param0) {
        int var2 = 0;
        String var1;
        int var3;
        int var4;
        int var5;
        String var6;
        String var7;
        String var8;
        String var1Lifetime1;
        var5 = AceOfSkies.obfuscationControl ? 1 : 0;
        var6 = "(" + ga.field_l + " " + kg.field_b + " " + hi.field_w + ") " + qs.field_b;
        var1 = var6;
        if (ag.field_s <= 0) {
          if (param0 == 65) {
            return var1;
          }
          CipherPacketBuffer.k((byte) -78);
          return var1;
        }
        var1Lifetime1 = var6 + ":";
        for (var2 = 0; ag.field_s > var2; var2++) {
          var7 = var1Lifetime1 + ' ';
          var1Lifetime1 = var7;
          var3 = IntKeyLookup.field_c.payload[var2] & 255;
          var4 = var3 >> 4;
          if (var4 >= 10) {
            var4 += 55;
          } else {
            var4 += 48;
          }
          var3 = var3 & 15;
          if (var3 >= 10) {
            var3 += 55;
          } else {
            var3 += 48;
          }
          var8 = var7 + (char)var4;
          var1Lifetime1 = var8 + (char)var3;
        }
        if (param0 == 65) {
          return var1Lifetime1;
        }
        CipherPacketBuffer.k((byte) -78);
        return var1Lifetime1;
    }

    final void a(boolean param0, int[] param1) {
        try {
          if (!param0) {
            int[] var4 = (int[]) null;
            this.a(true, (int[]) null);
          }
          this.field_l = new fc(param1);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "dl.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    CipherPacketBuffer(int param0) {
        super(param0);
    }

    final int j(byte param0) {
        int fieldTemp$0 = 0;
        if (param0 <= -1) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          return 255 & this.payload[fieldTemp$0] - this.field_l.b(256);
        }
        field_p = (jb) null;
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        return 255 & this.payload[fieldTemp$1] - this.field_l.b(256);
    }

    final int b(byte param0, int param1) {
        int incrementValue$0 = 0;
        int var7 = AceOfSkies.obfuscationControl ? 1 : 0;
        int var3 = this.field_q >> 3;
        int var4 = 8 - (this.field_q & 7);
        int var6 = 97 / ((17 - param0) / 60);
        this.field_q = this.field_q + param1;
        int var5 = 0;
        while (param1 > var4) {
          incrementValue$0 = var3;
          var3++;
          var5 = var5 + ((IntrusiveDeque.field_f[var4] & this.payload[incrementValue$0]) << param1 - var4);
          param1 = param1 - var4;
          var4 = 8;
        }
        if (param1 == var4) {
          var5 = var5 + (IntrusiveDeque.field_f[var4] & this.payload[var3]);
        } else {
          var5 = var5 + (this.payload[var3] >> -param1 + var4 & IntrusiveDeque.field_f[param1]);
        }
        return var5;
    }

    static {
        field_p = new jb();
    }
}
