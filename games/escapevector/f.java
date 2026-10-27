/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class f {
    int[] field_d;
    byte[][] field_h;
    static Sprite field_o;
    private int field_c;
    private int[][] field_r;
    int[] field_i;
    int[] field_l;
    int field_k;
    int[] field_e;
    static int field_t;
    private int[] field_g;
    jn field_p;
    int field_n;
    static vj field_m;
    int field_b;
    static int field_j;
    jn[] field_s;
    int[] field_q;
    int[][] field_a;
    private byte[] field_f;

    public static void a(byte param0) {
        if (param0 != 18) {
          field_m = (vj) null;
        }
        field_o = null;
        field_m = null;
    }

    private final void a(byte param0, byte[] param1) {
        String stackIn_103_2 = null;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var8Lifetime1;
        int var11Lifetime2;
        int var11Lifetime3;
        int var15Lifetime1;
        int var17 = EscapeVector.obfuscationControl;
        try {
          PacketBuffer var18 = new PacketBuffer(s.a((byte) -26, param1));
          int var4 = var18.readUnsignedByte(0);
          if (5 <= var4 &&
            var4 <= 7) {
            if (var4 < 6) {
              this.field_n = 0;
            } else {
              this.field_n = var18.readInt(-5053);
            }
            int var5 = var18.readUnsignedByte(0);
            boolean stackIn_11_0 = !((1 & var5) == 0);
            boolean var6 = stackIn_11_0;
            if (var4 >= 7) {
              this.field_c = var18.j(2147483647);
            } else {
              this.field_c = var18.readUnsignedShort(1952);
            }
            boolean stackIn_17_0 = !(0 == (2 & var5));
            boolean var7 = stackIn_17_0;
            int var8 = 0;
            int var9 = -1;
            this.field_d = new int[this.field_c];
            if (var4 < 7) {
              for (var10 = 0; this.field_c > var10; var10++) {
                int dupTemp$0 = var8 + var18.readUnsignedShort(1952);
                var8 = dupTemp$0;
                this.field_d[var10] = dupTemp$0;
                if (this.field_d[var10] > var9) {
                  var9 = this.field_d[var10];
                }
              }
            } else {
              for (var10 = 0; var10 < this.field_c; var10++) {
                int dupTemp$1 = var8 + var18.j(2147483647);
                var8 = dupTemp$1;
                this.field_d[var10] = dupTemp$1;
                if (var9 < this.field_d[var10]) {
                  var9 = this.field_d[var10];
                }
              }
            }
            this.field_k = var9 + 1;
            if (var7) {
              this.field_h = new byte[this.field_k][];
            }
            int var10Lifetime1 = 115 % ((60 - param0) / 44);
            this.field_i = new int[this.field_k];
            this.field_a = new int[this.field_k][];
            this.field_e = new int[this.field_k];
            this.field_l = new int[this.field_k];
            this.field_q = new int[this.field_k];
            if (var6) {
              this.field_g = new int[this.field_k];
              for (int var11 = 0; this.field_k > var11; var11++) {
                this.field_g[var11] = -1;
              }
              for (int var11Lifetime5 = 0; var11Lifetime5 < this.field_c; var11Lifetime5++) {
                this.field_g[this.field_d[var11Lifetime5]] = var18.readInt(-5053);
              }
              this.field_p = new jn(this.field_g);
            }
            for (int var11Lifetime1 = 0; this.field_c > var11Lifetime1; var11Lifetime1++) {
              this.field_l[this.field_d[var11Lifetime1]] = var18.readInt(-5053);
            }
            if (!var7) {
              for (var11Lifetime2 = 0; var11Lifetime2 < this.field_c; var11Lifetime2++) {
                this.field_q[this.field_d[var11Lifetime2]] = var18.readInt(-5053);
              }
            } else {
              for (var11Lifetime2 = 0; var11Lifetime2 < this.field_c; var11Lifetime2++) {
                byte[] var22 = new byte[64];
                var18.a(var22, (byte) -96, 0, 64);
                this.field_h[this.field_d[var11Lifetime2]] = var22;
              }
              for (var11Lifetime2 = 0; var11Lifetime2 < this.field_c; var11Lifetime2++) {
                this.field_q[this.field_d[var11Lifetime2]] = var18.readInt(-5053);
              }
            }
            if (var4 < 7) {
              for (var11Lifetime3 = 0; var11Lifetime3 < this.field_c; var11Lifetime3++) {
                this.field_i[this.field_d[var11Lifetime3]] = var18.readUnsignedShort(1952);
              }
              for (var11Lifetime3 = 0; this.field_c > var11Lifetime3; var11Lifetime3++) {
                var12 = this.field_d[var11Lifetime3];
                var8Lifetime1 = 0;
                var13 = this.field_i[var12];
                var14 = -1;
                int[] array$2 = new int[var13];
                this.field_a[var12] = array$2;
                for (var15 = 0; var15 < var13; var15++) {
                  int dupTemp$3 = var8Lifetime1 + var18.readUnsignedShort(1952);
                  var8Lifetime1 = dupTemp$3;
                  int[] dupTemp$4 = this.field_a[var12];
                  dupTemp$4[var15] = dupTemp$3;
                  var16 = dupTemp$3;
                  if (var14 < var16) {
                    var14 = var16;
                  }
                }
                this.field_e[var12] = 1 + var14;
                if (var14 + 1 == var13) {
                  this.field_a[var12] = null;
                }
              }
            } else {
              for (var11Lifetime3 = 0; var11Lifetime3 < this.field_c; var11Lifetime3++) {
                this.field_i[this.field_d[var11Lifetime3]] = var18.j(2147483647);
              }
              for (var11Lifetime3 = 0; this.field_c > var11Lifetime3; var11Lifetime3++) {
                var12 = this.field_d[var11Lifetime3];
                var8Lifetime1 = 0;
                var13 = this.field_i[var12];
                var14 = -1;
                int[] array$5 = new int[var13];
                this.field_a[var12] = array$5;
                for (var15 = 0; var15 < var13; var15++) {
                  int dupTemp$6 = var8Lifetime1 + var18.j(2147483647);
                  var8Lifetime1 = dupTemp$6;
                  int[] dupTemp$7 = this.field_a[var12];
                  dupTemp$7[var15] = dupTemp$6;
                  var16 = dupTemp$6;
                  if (var16 > var14) {
                    var14 = var16;
                  }
                }
                this.field_e[var12] = 1 + var14;
                if (1 + var14 == var13) {
                  this.field_a[var12] = null;
                }
              }
            }
            if (var6) {
              this.field_r = new int[1 + var9][];
              this.field_s = new jn[1 + var9];
              for (int var11Lifetime4 = 0; var11Lifetime4 < this.field_c; var11Lifetime4++) {
                int var12Lifetime1 = this.field_d[var11Lifetime4];
                int var13Lifetime1 = this.field_i[var12Lifetime1];
                int[] array$8 = new int[this.field_e[var12Lifetime1]];
                this.field_r[var12Lifetime1] = array$8;
                for (int var14Lifetime1 = 0; this.field_e[var12Lifetime1] > var14Lifetime1; var14Lifetime1++) {
                  this.field_r[var12Lifetime1][var14Lifetime1] = -1;
                }
                for (int var14Lifetime1Lifetime1 = 0; var13Lifetime1 > var14Lifetime1Lifetime1; var14Lifetime1Lifetime1++) {
                  if (this.field_a[var12Lifetime1] != null) {
                    var15Lifetime1 = this.field_a[var12Lifetime1][var14Lifetime1Lifetime1];
                  } else {
                    var15Lifetime1 = var14Lifetime1Lifetime1;
                  }
                  this.field_r[var12Lifetime1][var15Lifetime1] = var18.readInt(-5053);
                }
                this.field_s[var12Lifetime1] = new jn(this.field_r[var12Lifetime1]);
              }
              return;
            }
            return;
          }
          throw new RuntimeException();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_102_0 = var3;
          StringBuilder stackIn_102_1 = new StringBuilder().append("f.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_103_2 = "null";
          } else {
            stackIn_103_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_102_0), ((StringBuilder) (Object) stackIn_102_1).append(stackIn_103_2).append(')').toString());
        }
    }

    f(byte[] param0, int param1, byte[] param2) {
        try {
          this.field_b = ji.a(255, param0.length, param0);
          if (param1 != this.field_b) {
            throw new RuntimeException();
          }
          if (param2 != null) {
            if (param2.length != 64) {
              throw new RuntimeException();
            }
            this.field_f = vn.a(param0, 0, param0.length, 0);
            for (int var4_int = 0; var4_int < 64; var4_int++) {
              if (param2[var4_int] != this.field_f[var4_int]) {
                throw new RuntimeException();
              }
            }
          }
          this.a((byte) -23, param0);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "f.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_t = -1;
        field_m = null;
    }
}
