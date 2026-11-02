/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc {
    private Archive field_b;
    static ba field_a;
    private NodeHashTable field_d;
    private Archive field_e;
    static int field_c;
    private NodeHashTable field_f;

    final PcmSample a(int[] param0, boolean param1, int param2) {
        RuntimeException var4 = null;
        PcmSample stackIn_3_0 = null;
        PcmSample stackIn_8_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_e.b(0) == 1) {
            stackIn_3_0 = this.b(0, 13242, param2, param0);
            return stackIn_3_0;
          }
          if (param1) {
            this.field_d = (NodeHashTable) null;
          }
          if (this.field_e.a(param2, (byte) -91) != 1) {
            throw new RuntimeException();
          }
          stackIn_8_0 = this.b(param2, 13242, 0, param0);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_12_0 = var4;
          stackIn_12_1 = new StringBuilder().append("jc.F(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final PcmSample a(int param0, int param1, int param2, int[] param3) {
        PcmSample stackIn_3_0 = null;
        Object stackIn_7_0 = null;
        Object stackIn_11_0 = null;
        PcmSample stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        PcmSample var8 = null;
        VorbisDecoder var9 = null;
        PcmSample var8Lifetime1;
        try {
          var5_int = ((1879052287 & param1) << 4 | param1 >>> 12) ^ param2;
          var5_int = var5_int | param1 << 16;
          var6 = (long)var5_int ^ 4294967296L;
          var8 = (PcmSample) (this.field_f.get(param0 ^ -27322, var6));
          if (var8 != null) {
            stackIn_3_0 = var8;
            return stackIn_3_0;
          }
          if (param3 != null &&
            0 >= param3[0]) {
            stackIn_7_0 = null;
            return (PcmSample) (stackIn_7_0);
          }
          var9 = (VorbisDecoder) (this.field_d.get(8434, var6));
          if (var9 == null) {
            var9 = VorbisDecoder.a(this.field_b, param1, param2);
            if (var9 == null) {
              stackIn_11_0 = null;
              return (PcmSample) (stackIn_11_0);
            }
            this.field_d.put(false, var6, var9);
          }
          var8Lifetime1 = var9.a(param3);
          if (param0 != -19020) {
            this.field_e = (Archive) null;
          }
          if (var8Lifetime1 == null) {
            return null;
          }
          var9.unlink(-35);
          this.field_f.put(false, var6, var8Lifetime1);
          stackIn_19_0 = var8Lifetime1;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("jc.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private final PcmSample b(int param0, int param1, int param2, int[] param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        long var6 = 0L;
        PcmSample var8 = null;
        cc var9 = null;
        PcmSample var10 = null;
        PcmSample stackIn_2_0 = null;
        PcmSample stackIn_5_0 = null;
        PcmSample stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        PcmSample var8Lifetime1;
        try {
          if (param1 != 13242) {
            stackIn_2_0 = (PcmSample) null;
            return stackIn_2_0;
          }
          var5_int = (65533 & param0 << 4 | param0 >>> 12) ^ param2;
          var5_int = var5_int | param0 << 16;
          var6 = (long)var5_int;
          var8 = (PcmSample) (this.field_f.get(param1 ^ 4936, var6));
          if (var8 != null) {
            stackIn_5_0 = var8;
            return stackIn_5_0;
          }
          if (param3 != null &&
            param3[0] <= 0) {
            return null;
          }
          var9 = cc.a(this.field_e, param0, param2);
          if (var9 == null) {
            return null;
          }
          var10 = var9.b();
          var8Lifetime1 = var10;
          this.field_f.put(false, var6, var8Lifetime1);
          if (param3 != null) {
            param3[0] = param3[0] - var10.field_j.length;
          }
          stackIn_17_0 = var8Lifetime1;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_20_0 = var5;
          stackIn_20_1 = new StringBuilder().append("jc.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final PcmSample a(int[] param0, int param1, int param2) {
        RuntimeException var4 = null;
        PcmSample stackIn_2_0 = null;
        PcmSample stackIn_5_0 = null;
        PcmSample stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (1 == this.field_b.b(0)) {
            stackIn_2_0 = this.a(param1 + 2059392520, 0, param2, param0);
            return stackIn_2_0;
          }
          if (param1 != -2059411540) {
            stackIn_5_0 = (PcmSample) null;
            return stackIn_5_0;
          }
          if (1 != this.field_b.a(param2, (byte) -91)) {
            throw new RuntimeException();
          }
          stackIn_9_0 = this.a(param1 + 2059392520, param2, 0, param0);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("jc.G(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw LevelGrid.toClientException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static ic a(byte param0) {
        if (ok.field_D == null) {
          ok.field_D = new ic(fk.field_a, 20, 0, 0, 0, 11579568, -1, 0, 0, fk.field_a.field_G, -1, 2147483647, true);
        }
        if (param0 < 71) {
          return (ic) null;
        }
        return ok.field_D;
    }

    public static void a(int param0) {
        field_a = null;
        int var1 = 15 / ((-28 - param0) / 46);
    }

    final static String b(int param0) {
        int var2 = 0;
        String var1;
        int var3;
        int var4;
        int var5;
        String var6;
        String var7;
        String var8;
        var5 = TrackController.field_F ? 1 : 0;
        if (param0 < 66) {
          return (String) null;
        }
        var6 = "(" + o.field_a + " " + u.field_o + " " + mc.field_L + ") " + uk.field_c;
        var1 = var6;
        if (hd.field_o > 0) {
          var1 = var6 + ":";
          for (var2 = 0; var2 < hd.field_o; var2++) {
            var7 = var1 + ' ';
            var3 = ne.field_a.payload[var2] & 255;
            var4 = var3 >> 4;
            var3 = var3 & 15;
            if (var4 < 10) {
              var4 += 48;
            } else {
              var4 += 55;
            }
            var8 = var7 + (char)var4;
            if (10 <= var3) {
              var3 += 55;
            } else {
              var3 += 48;
            }
            var1 = var8 + (char)var3;
          }
        }
        return var1;
    }

    jc(Archive param0, Archive param1) {
        this.field_d = new NodeHashTable(256);
        this.field_f = new NodeHashTable(256);
        try {
          this.field_e = param0;
          this.field_b = param1;
        } catch (RuntimeException runtimeException) {
          throw LevelGrid.toClientException((Throwable) ((Object) runtimeException), "jc.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
