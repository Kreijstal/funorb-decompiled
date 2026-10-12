/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jm {
    static String[] field_w;
    byte[][] field_v;
    lr field_l;
    int[] field_e;
    int[] field_q;
    static je field_b;
    private int[] field_m;
    int field_s;
    private int[][] field_j;
    private byte[] field_n;
    static NodeDeque field_o;
    static String field_d;
    lr[] field_f;
    static String field_u;
    private int field_r;
    int field_i;
    int[] field_p;
    int[][] field_a;
    int[] field_t;
    int field_c;
    static boolean field_g;
    static volatile int field_k;
    int[] field_h;

    private final void a(byte[] param0, boolean param1) {
        int dupTemp$0 = 0;
        int dupTemp$1 = 0;
        int[] array$2 = null;
        int dupTemp$3 = 0;
        int[] dupTemp$4 = null;
        int[] array$5 = null;
        int dupTemp$6 = 0;
        int[] dupTemp$7 = null;
        int[] array$8 = null;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_99_0 = null;
        StringBuilder stackIn_99_1 = null;
        String stackIn_100_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        byte[] var17 = null;
        PacketBuffer var18 = null;
        byte[] var22 = null;
        int var8Lifetime1;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var13Lifetime1;
        int var14Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var10Lifetime1Lifetime1;
        int var13Lifetime1Lifetime1;
        var16 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          var18 = new PacketBuffer(el.a(param1, param0));
          var4 = var18.readUnsignedByte(0);
          if (5 <= var4 &&
            var4 <= 7) {
            if (var4 >= 6) {
              this.field_c = var18.readInt(1);
            } else {
              this.field_c = 0;
            }
            var5 = var18.readUnsignedByte(0);
            stackIn_11_0 = ((var5 & 1) == 0) ? 0 : 1;
            var6 = stackIn_11_0;
            stackIn_14_0 = ((var5 & 2) == 0) ? 0 : 1;
            var7 = stackIn_14_0;
            if (7 > var4) {
              this.field_r = var18.readUnsignedShort((byte) -104);
            } else {
              this.field_r = var18.f((byte) 111);
            }
            var8 = 0;
            this.field_q = new int[this.field_r];
            var9 = -1;
            if (var4 < 7) {
              for (var10 = 0; this.field_r > var10; var10++) {
                dupTemp$0 = var8 + var18.readUnsignedShort((byte) -104);
                var8 = dupTemp$0;
                this.field_q[var10] = dupTemp$0;
                if (this.field_q[var10] > var9) {
                  var9 = this.field_q[var10];
                }
              }
            } else {
              for (var10 = 0; this.field_r > var10; var10++) {
                dupTemp$1 = var8 + var18.f((byte) 101);
                var8 = dupTemp$1;
                this.field_q[var10] = dupTemp$1;
                if (var9 < this.field_q[var10]) {
                  var9 = this.field_q[var10];
                }
              }
            }
            this.field_i = var9 + 1;
            if (param1) {
              var17 = (byte[]) null;
              this.a((byte[]) null, true);
            }
            this.field_e = new int[this.field_i];
            this.field_h = new int[this.field_i];
            this.field_a = new int[this.field_i][];
            if (var7 != 0) {
              this.field_v = new byte[this.field_i][];
            }
            this.field_p = new int[this.field_i];
            this.field_t = new int[this.field_i];
            if (var6 != 0) {
              this.field_m = new int[this.field_i];
              for (var10Lifetime1 = 0; var10Lifetime1 < this.field_i; var10Lifetime1++) {
                this.field_m[var10Lifetime1] = -1;
              }
              for (var10Lifetime1Lifetime1 = 0; this.field_r > var10Lifetime1Lifetime1; var10Lifetime1Lifetime1++) {
                this.field_m[this.field_q[var10Lifetime1Lifetime1]] = var18.readInt(1);
              }
              this.field_l = new lr(this.field_m);
            }
            for (var10Lifetime2 = 0; var10Lifetime2 < this.field_r; var10Lifetime2++) {
              this.field_e[this.field_q[var10Lifetime2]] = var18.readInt(1);
            }
            if (var7 != 0) {
              for (var10Lifetime3 = 0; var10Lifetime3 < this.field_r; var10Lifetime3++) {
                var22 = new byte[64];
                var18.readBytes(0, 64, 0, var22);
                this.field_v[this.field_q[var10Lifetime3]] = var22;
              }
            }
            for (var10Lifetime4 = 0; var10Lifetime4 < this.field_r; var10Lifetime4++) {
              this.field_t[this.field_q[var10Lifetime4]] = var18.readInt(1);
            }
            if (var4 >= 7) {
              for (var10Lifetime5 = 0; this.field_r > var10Lifetime5; var10Lifetime5++) {
                this.field_p[this.field_q[var10Lifetime5]] = var18.f((byte) 102);
              }
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_r; var10Lifetime5++) {
                var11 = this.field_q[var10Lifetime5];
                var8Lifetime1 = 0;
                var12 = this.field_p[var11];
                array$2 = new int[var12];
                this.field_a[var11] = array$2;
                var13 = -1;
                for (var14 = 0; var14 < var12; var14++) {
                  dupTemp$3 = var8Lifetime1 + var18.f((byte) 125);
                  var8Lifetime1 = dupTemp$3;
                  dupTemp$4 = this.field_a[var11];
                  dupTemp$4[var14] = dupTemp$3;
                  var15 = dupTemp$3;
                  if (var15 > var13) {
                    var13 = var15;
                  }
                }
                this.field_h[var11] = var13 + 1;
                if (var12 == 1 + var13) {
                  this.field_a[var11] = null;
                }
              }
            } else {
              for (var10Lifetime5 = 0; this.field_r > var10Lifetime5; var10Lifetime5++) {
                this.field_p[this.field_q[var10Lifetime5]] = var18.readUnsignedShort((byte) -104);
              }
              for (var10Lifetime5 = 0; var10Lifetime5 < this.field_r; var10Lifetime5++) {
                var11 = this.field_q[var10Lifetime5];
                var8Lifetime1 = 0;
                var12 = this.field_p[var11];
                var13 = -1;
                array$5 = new int[var12];
                this.field_a[var11] = array$5;
                for (var14 = 0; var12 > var14; var14++) {
                  dupTemp$6 = var8Lifetime1 + var18.readUnsignedShort((byte) -104);
                  var8Lifetime1 = dupTemp$6;
                  dupTemp$7 = this.field_a[var11];
                  dupTemp$7[var14] = dupTemp$6;
                  var15 = dupTemp$6;
                  if (var15 > var13) {
                    var13 = var15;
                  }
                }
                this.field_h[var11] = var13 + 1;
                if (var12 == 1 + var13) {
                  this.field_a[var11] = null;
                }
              }
            }
            if (var6 != 0) {
              this.field_j = new int[var9 + 1][];
              this.field_f = new lr[1 + var9];
              for (var10Lifetime6 = 0; var10Lifetime6 < this.field_r; var10Lifetime6++) {
                var11Lifetime1 = this.field_q[var10Lifetime6];
                var12Lifetime1 = this.field_p[var11Lifetime1];
                array$8 = new int[this.field_h[var11Lifetime1]];
                this.field_j[var11Lifetime1] = array$8;
                for (var13Lifetime1 = 0; this.field_h[var11Lifetime1] > var13Lifetime1; var13Lifetime1++) {
                  this.field_j[var11Lifetime1][var13Lifetime1] = -1;
                }
                for (var13Lifetime1Lifetime1 = 0; var13Lifetime1Lifetime1 < var12Lifetime1; var13Lifetime1Lifetime1++) {
                  if (this.field_a[var11Lifetime1] == null) {
                    var14Lifetime1 = var13Lifetime1Lifetime1;
                  } else {
                    var14Lifetime1 = this.field_a[var11Lifetime1][var13Lifetime1Lifetime1];
                  }
                  this.field_j[var11Lifetime1][var14Lifetime1] = var18.readInt(1);
                }
                this.field_f[var11Lifetime1] = new lr(this.field_j[var11Lifetime1]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_99_0 = var3;
          stackIn_99_1 = new StringBuilder().append("jm.B(");
          if (param0 == null) {
            stackIn_100_2 = "null";
          } else {
            stackIn_100_2 = "{...}";
          }
          throw ig.addExceptionContext((Throwable) ((Object) stackIn_99_0), ((StringBuilder) (Object) stackIn_99_1).append(stackIn_100_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          PacketBuffer.a(0, df.field_T, false, pd.field_e, kt.field_p, param0, true);
          for (var2_int = param1; kt.field_p > var2_int; var2_int++) {
            vt.field_m[param0 + var2_int] = var2_int;
          }
          PacketBuffer.a(param0, se.field_e, false, sq.field_k, kt.field_p + param0, param0 + param0, false);
          if (param0 < kt.field_p) {
            kt.field_p = param0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.addExceptionContext((Throwable) ((Object) var2), "jm.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(je param0, int param1) {
        je var5 = null;
        int var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        je var4 = (je) (param0.field_fb.first((byte) 121));
        je var2 = var4;
        while (var4 != null) {
          var4.field_nb = 0;
          var4.field_ob = 0;
          var4.field_db = 0;
          var4.field_ab = 0;
          var5 = (je) (param0.field_fb.next((byte) 123));
          var5 = var5;
        }
        param0.field_nb = 0;
        param0.field_ob = 0;
        param0.field_ab = 0;
        if (param1 > -42) {
          return;
        }
        try {
          param0.field_db = 0;
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "jm.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        field_w = null;
        field_u = null;
        if (param0 > -48) {
          return;
        }
        field_o = null;
        field_d = null;
        field_b = null;
    }

    jm(byte[] param0, int param1, byte[] param2) {
        int var4_int = 0;
        try {
          this.field_s = pk.a(param0, param0.length, 120);
          if (this.field_s != param1) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (64 != param2.length) {
              throw new RuntimeException();
            }
            this.field_n = SpellCastAction.a(-18423, param0.length, param0, 0);
            for (var4_int = 0; 64 > var4_int; var4_int++) {
              if (this.field_n[var4_int] != param2[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a(param0, false);
        } catch (RuntimeException runtimeException) {
          throw ig.addExceptionContext((Throwable) ((Object) runtimeException), "jm.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_w = new String[]{"Player_1", "Player_2", "Player_3", "Player_4", "Player_5", "Player_6", "Player_7", "Player_8"};
        field_u = "Remove name";
        field_d = "Accessories";
        field_g = false;
        field_o = new NodeDeque();
        field_k = 0;
    }
}
