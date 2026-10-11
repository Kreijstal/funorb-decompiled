/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s extends am {
    static t[] field_t;
    static sm[] field_s;
    private kj[] field_v;
    static String field_u;

    final static void b(int param0) {
        if (!on.b(160)) {
          return;
        }
        if (param0 != -23658) {
          field_u = (String) null;
        }
        ka.a(4, false, (byte) -53);
    }

    final static boolean h(byte param0) {
        if (param0 < 51) {
          return true;
        }
        return true;
    }

    final int[] a(byte param0, int param1) {
        int[] var4 = this.field_l.a(param1, 25657);
        int[] var3 = var4;
        if (this.field_l.field_b) {
          this.a(this.field_l.a(0), -1);
        }
        if (param0 < 86) {
          return (int[]) null;
        }
        return var4;
    }

    public s() {
        super(0, true);
    }

    public static void g(byte param0) {
        if (param0 != -73) {
          return;
        }
        field_s = null;
        field_t = null;
        field_u = null;
    }

    private final void a(int[][] param0, int param1) {
        int var5 = 0;
        int var3_int = 0;
        int var4 = 0;
        kj var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var9 = Torquing.field_u;
        try {
          var3_int = ci.field_c;
          if (param1 != -1) {
            return;
          }
          var4 = um.field_o;
          nn.a(param0, (byte) -114);
          om.a(0, 0, jh.field_A, 0, vp.field_I);
          if (null != this.field_v) {
            for (var5 = 0; var5 < this.field_v.length; var5++) {
              var6 = this.field_v[var5];
              var7 = var6.field_a;
              var8 = var6.field_c;
              if (var7 < 0) {
                if (var8 >= 0) {
                  var6.a(var4, var3_int, (byte) 106);
                }
              } else {
                if (var8 >= 0) {
                  var6.a(var3_int, var4, -105);
                } else {
                  var6.a((byte) 60, var4, var3_int);
                }
              }
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("s.A(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        boolean stackIn_22_1 = false;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var7 = Torquing.field_u;
        try {
          if (param1 != 35) {
            s.g((byte) -103);
          }
          if (param2 == 0) {
            this.field_v = new kj[param0.i((byte) -101)];
            for (var4_int = 0; var4_int < this.field_v.length; var4_int++) {
              var5 = param0.i((byte) -101);
              var6 = var5;
              if (0 == var6) {
                this.field_v[var4_int] = (kj) ((Object) tl.a(param0, (byte) -51));
              } else {
                if (var6 != 1) {
                  if (var6 == 2) {
                    this.field_v[var4_int] = (kj) ((Object) c.a(i.c(param1, 40), param0));
                  } else {
                    if (var6 == 3) {
                      this.field_v[var4_int] = (kj) ((Object) bi.a(param0, (byte) 13));
                    }
                  }
                } else {
                  this.field_v[var4_int] = (kj) ((Object) wa.a(false, param0));
                }
              }
            }
          } else {
            if (1 != param2) {
              return;
            }
            stackIn_22_1 = (1 == param0.i((byte) -101));
            this.field_p = stackIn_22_1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_26_0 = var4;
          stackIn_26_1 = new StringBuilder().append("s.H(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final int[][] a(int param0, int param1) {
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
        int var16 = Torquing.field_u;
        if (param0 != -29116) {
          return (int[][]) null;
        }
        int[][] var3 = this.field_r.a(15142, param1);
        if (this.field_r.field_b) {
          var4 = ci.field_c;
          var5 = um.field_o;
          var29 = new int[var5][var4];
          var30 = this.field_r.a(false);
          this.a(var29, param0 ^ 29115);
          for (var8 = 0; var8 < um.field_o; var8++) {
            var32 = var29[var8];
            var31 = var30[var8];
            var11 = var31[0];
            var12 = var31[1];
            var13 = var31[2];
            for (var14 = 0; ci.field_c > var14; var14++) {
              var15 = var32[var14];
              var13[var14] = ie.a(var15 << 4, 4080);
              var12[var14] = ie.a(65280, var15) >> 4;
              var11[var14] = ie.a(var15 >> 12, 4080);
            }
          }
        }
        return var3;
    }

    static {
        field_u = "That name is not available";
    }
}
