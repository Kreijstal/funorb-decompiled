/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qo extends am {
    private int field_u;
    private int field_s;
    static int field_t;

    final int[] a(byte param0, int param1) {
        int var5 = 0;
        int[] var3;
        int[] var4;
        int var6;
        int var7;
        var7 = Torquing.field_u;
        if (param0 <= 86) {
          field_t = -29;
        }
        var3 = this.field_l.a(param1, 25657);
        if (this.field_l.field_b) {
          var4 = this.b(0, 0, param1);
          for (var5 = 0; ci.field_c > var5; var5++) {
            var6 = var4[var5];
            if (this.field_s > var6) {
              var3[var5] = this.field_s;
            } else {
              if (var6 > this.field_u) {
                var3[var5] = this.field_u;
              } else {
                var3[var5] = var6;
              }
            }
          }
        }
        return var3;
    }

    final static void g(byte param0) {
        i.field_R = false;
        me.field_a = null;
        ib.field_c = null;
        qh.field_b = null;
        if (param0 != -68) {
          la var2 = (la) null;
          qo.a(47, -32, -37, (fi) null, (la) null);
        }
        fd.field_k = null;
    }

    final int[][] a(int param0, int param1) {
        int var11 = 0;
        int[][] var3;
        int[] var8;
        int[] var9;
        int[] var10;
        int var12;
        int var13;
        int var14;
        int var15;
        int[][] var16;
        int[][] var18;
        int[] var22;
        int[] var23;
        int[] var24;
        int[][] var26;
        int[] var30;
        int[] var31;
        int[] var32;
        int[][] var37;
        int[] var38;
        int[] var39;
        int[] var40;
        var15 = Torquing.field_u;
        var26 = this.field_r.a(15142, param1);
        var18 = var26;
        var16 = var18;
        var3 = var16;
        if (param0 != -29116) {
          return (int[][]) null;
        }
        if (this.field_r.field_b) {
          var37 = this.c(param0 + 53182, param1, 0);
          var38 = var37[0];
          var39 = var37[1];
          var40 = var37[2];
          var30 = var26[0];
          var22 = var30;
          var8 = var22;
          var31 = var26[1];
          var23 = var31;
          var9 = var23;
          var32 = var26[2];
          var24 = var32;
          var10 = var24;
          for (var11 = 0; var11 < ci.field_c; var11++) {
            var12 = var38[var11];
            var13 = var39[var11];
            var14 = var40[var11];
            if (this.field_s <= var12) {
              if (this.field_u < var12) {
                var8[var11] = this.field_u;
              } else {
                var30[var11] = var12;
              }
            } else {
              var8[var11] = this.field_s;
            }
            if (this.field_s <= var13) {
              if (var13 > this.field_u) {
                var9[var11] = this.field_u;
              } else {
                var31[var11] = var13;
              }
            } else {
              var9[var11] = this.field_s;
            }
            if (var14 >= this.field_s) {
              if (this.field_u < var14) {
                var10[var11] = this.field_u;
              } else {
                var32[var11] = var14;
              }
            } else {
              var10[var11] = this.field_s;
            }
          }
        }
        return var3;
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        boolean stackIn_11_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Torquing.field_u;
        try {
          var4_int = param2;
          if (var4_int != 0) {
            if (var4_int == 1) {
              this.field_u = param0.i(7088);
            } else {
              if (2 == var4_int) {
                stackIn_11_1 = (param0.i((byte) -101) == 1);
                this.field_p = stackIn_11_1;
              }
            }
          } else {
            this.field_s = param0.i(param1 + 7053);
          }
          if (param1 != 35) {
            this.a((byte) -121, -73);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("qo.H(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, byte param3, int param4) {
        if (-param1 + param4 < kn.field_e) {
          v.a(param2, param4, param0, (byte) 77, param1);
        } else {
          if (param1 + param4 > qg.field_z) {
            v.a(param2, param4, param0, (byte) 77, param1);
          } else {
            if (-param1 + param2 < j.field_q) {
              v.a(param2, param4, param0, (byte) 77, param1);
            } else {
              if (param2 + param1 > qk.field_p) {
                v.a(param2, param4, param0, (byte) 77, param1);
              } else {
                r.a(param4, param1, -121, param0, param2);
              }
            }
          }
        }
        if (param3 != -95) {
          qo.g((byte) 86);
        }
    }

    public qo() {
        super(1, false);
        this.field_u = 4096;
        this.field_s = 0;
    }

    final static lh a(int param0, int param1, int param2, fi param3, la param4) {
        byte[] var5 = null;
        RuntimeException var5_ref = null;
        byte[] var6 = null;
        lh stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        lh stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = param4.a(param0, param2 + 100, param1);
          var5 = var6;
          if (param2 != 0) {
            stackIn_2_0 = (lh) null;
            return stackIn_2_0;
          }
          if (var6 != null) {
            stackIn_7_0 = new lh(new fj(var6), param3);
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (lh) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_10_0 = var5_ref;
          stackIn_10_1 = new StringBuilder().append("qo.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
    }
}
