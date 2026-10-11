/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qo extends ji {
    private jq[] field_z;
    static nj field_B;
    static lg field_A;
    static er field_y;
    static String field_E;
    static lb field_D;

    public qo() {
        super(0, true);
    }

    public static void b(byte param0) {
        if (param0 > -89) {
          return;
        }
        field_y = null;
        field_E = null;
        field_A = null;
        field_D = null;
        field_B = null;
    }

    final int[][] b(int param0, int param1) {
        int var4 = 0;
        int var5 = 0;
        int[][] var29 = null;
        int[][][] var30 = null;
        int var8 = 0;
        int[] var32 = null;
        int[][] var31 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = Vertigo2.field_L ? 1 : 0;
        int[][] var3 = this.field_v.a(param1, -2);
        if (param0 != -3780) {
          return (int[][]) null;
        }
        if (this.field_v.field_c) {
          var4 = we.field_M;
          var5 = aa.field_Vb;
          var29 = new int[var5][var4];
          var30 = this.field_v.a(0);
          this.a(17989, var29);
          for (var8 = 0; var8 < aa.field_Vb; var8++) {
            var32 = var29[var8];
            var31 = var30[var8];
            var11 = var31[0];
            var12 = var31[1];
            var13 = var31[2];
            for (var14 = 0; we.field_M > var14; var14++) {
              var15 = var32[var14];
              var13[var14] = b.a(var15, 255) << 4;
              var12[var14] = b.a(4080, var15 >> 4);
              var11[var14] = b.a(var15 >> 12, 4080);
            }
          }
        }
        return var3;
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        boolean stackIn_19_1 = false;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param1 == 0) {
            this.field_z = new jq[param2.h(param0 - 121)];
            for (var4_int = 0; var4_int < this.field_z.length; var4_int++) {
              var5 = param2.h(-11);
              var6 = var5;
              if (var6 != 0) {
                if (var6 == 1) {
                  this.field_z[var4_int] = (jq) ((Object) ug.a(param2, 46));
                } else {
                  if (var6 == 2) {
                    this.field_z[var4_int] = (jq) ((Object) td.a(false, param2));
                  } else {
                    if (var6 == 3) {
                      this.field_z[var4_int] = (jq) ((Object) rb.a((byte) 104, param2));
                    }
                  }
                }
              } else {
                this.field_z[var4_int] = (jq) ((Object) lb.a(param2, (byte) 92));
              }
            }
          } else {
            if (1 == param1) {
              stackIn_19_1 = (param2.h(-11) == 1);
              this.field_o = stackIn_19_1;
            }
          }
          if (param0 != 110) {
            this.a(12, (int[][]) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("qo.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final int[] c(int param0, int param1) {
        if (param1 <= 91) {
          this.b(-13, -62);
        }
        int[] var4 = this.field_x.a(param0, (byte) 98);
        int[] var3 = var4;
        if (this.field_x.field_i) {
          this.a(17989, this.field_x.a(100));
        }
        return var4;
    }

    private final void a(int param0, int[][] param1) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        jq var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var9 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 != 17989) {
            field_A = (lg) null;
          }
          var3_int = we.field_M;
          var4 = aa.field_Vb;
          eo.a(0, param1);
          ec.a(fk.field_x, 0, rm.field_z, 0, (byte) -16);
          if (this.field_z != null) {
            for (var5 = 0; this.field_z.length > var5; var5++) {
              var6 = this.field_z[var5];
              var7 = var6.field_g;
              var8 = var6.field_a;
              if (var7 < 0) {
                if (var8 >= 0) {
                  var6.a(var4, var3_int, 45);
                }
              } else {
                if (var8 < 0) {
                  var6.a(var4, (byte) -117, var3_int);
                } else {
                  var6.b(var3_int, (byte) 124, var4);
                }
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_17_0 = var3;
          stackIn_17_1 = new StringBuilder().append("qo.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    static {
        field_E = "You cannot chat to <%0> because <%0> is offline in your friend list.";
        field_B = new nj();
    }
}
