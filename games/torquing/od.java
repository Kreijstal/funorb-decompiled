/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class od extends am {
    static int[] field_t;
    private int field_x;
    private int field_y;
    static String field_u;
    private int[] field_w;
    static int[] field_s;
    private int field_v;

    final void a(int param0, int param1, int param2) {
        int var4 = 0;
        super.a(param0, param1, param2);
        if (this.field_x >= 0 &&
          null != ue.field_g) {
          var4 = ue.field_g.a(this.field_x, (byte) 98).field_h ? 64 : 128;
          this.field_w = ue.field_g.a((byte) -6, var4, false, 1.0f, this.field_x, var4);
          this.field_y = var4;
          this.field_v = var4;
        }
    }

    final int f(byte param0) {
        if (param0 < 22) {
          od.b(-68);
        }
        return this.field_x;
    }

    final static int a(boolean param0, int param1, String param2, String param3, int param4, int param5, String param6) {
        da var7 = null;
        RuntimeException var7_ref = null;
        int var8 = 0;
        da var9 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var7 = new da(param6);
          var8 = -40 / ((param1 - 43) / 58);
          var9 = new da(param3);
          stackIn_1_0 = na.a(var9, param2, -25978, var7, param5, param0, param4);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_4_0 = var7_ref;
          stackIn_4_1 = new StringBuilder().append("od.O(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final static void c(int param0) {
        if (param0 != -8431868) {
          od.b(-101, -66);
        }
        of.field_u = null;
        vb.field_d = null;
    }

    public od() {
        super(0, false);
        this.field_x = -1;
    }

    final void d(byte param0) {
        super.d((byte) -126);
        int var2 = 49 / ((param0 + 63) / 62);
        this.field_w = null;
    }

    final void a(fj param0, int param1, int param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (param1 != 35) {
            this.f((byte) -99);
          }
          if (param2 == 0) {
            this.field_x = param0.i(7088);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("od.H(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_t = null;
        if (param0 != 11860) {
          return;
        }
        field_s = null;
        field_u = null;
    }

    final static void b(int param0, int param1) {
        if (param0 != 128) {
          od.b(-33, 86);
        }
        om.field_h = param1;
    }

    final int[][] a(int param0, int param1) {
        int incrementValue$0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_6_1 = 0;
        int[][] var3;
        int var4;
        int[] var5;
        int[] var6;
        int[] var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int[][] var12;
        int[][] var13;
        int[][] var14;
        var11 = Torquing.field_u;
        var14 = this.field_r.a(param0 ^ -19102, param1);
        var13 = var14;
        var12 = var13;
        var3 = var12;
        if (param0 != -29116) {
          this.field_y = -89;
        }
        if (this.field_r.field_b) {
          stackIn_5_0 = this.field_y;
          if (this.field_v != um.field_o) {
            stackIn_6_1 = this.field_v * param1 / um.field_o;
          } else {
            stackIn_6_1 = param1;
          }
          var4 = stackIn_5_0 * stackIn_6_1;
          var5 = var14[0];
          var6 = var14[1];
          var7 = var14[2];
          if (ci.field_c != this.field_y) {
            for (var8 = 0; var8 < ci.field_c; var8++) {
              var9 = this.field_y * var8 / ci.field_c;
              var10 = this.field_w[var4 + var9];
              var7[var8] = ie.a(var10 << 4, 4080);
              var6[var8] = ie.a(65280, var10) >> 4;
              var5[var8] = ie.a(16711680, var10) >> 12;
            }
          } else {
            for (var8 = 0; ci.field_c > var8; var8++) {
              incrementValue$0 = var4;
              var4++;
              var9 = this.field_w[incrementValue$0];
              var7[var8] = ie.a(4080, var9 << 4);
              var6[var8] = ie.a(4080, var9 >> 4);
              var5[var8] = ie.a(var9 >> 12, 4080);
            }
          }
        }
        return var3;
    }

    static {
        field_t = new int[12];
        field_u = "Unfortunately we are unable to create an account for you at this time.";
        field_s = new int[4];
    }
}
