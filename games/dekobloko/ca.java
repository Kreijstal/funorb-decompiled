/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ca extends t {
    private ef field_ub;
    private int field_nb;
    private int field_tb;
    static int field_vb;
    static ke field_wb;
    private int field_lb;
    private ce field_sb;
    private i field_pb;
    private int field_rb;
    private int field_mb;
    static ck field_qb;
    static int field_kb;
    static String field_ob;

    final void j(byte param0) {
        if (this.field_pb != da.field_b) {
          int var2 = -119 % ((param0 - 30) / 39);
          this.field_rb = 0;
          this.field_pb = rb.field_c;
          this.a(this.field_sb, -29870);
          this.field_ub.field_Q = 0;
          this.field_sb = null;
          return;
        }
    }

    private final void a(ce param0, int param1) {
        ce var4 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_ub != null) {
            this.field_ub.b((byte) 111);
          }
          boolean decompiledSharedTail0 = (param0 != null);
          if (!decompiledSharedTail0) {
            this.field_ub = new ef();
            decompiledSharedTail0 = (client.field_A);
          }
          if (decompiledSharedTail0) {
            param0.b(param0.field_y, param0.field_t, 6, this.field_nb + 6, -16555);
            this.field_ub = new ef(param0);
          }
          this.b(this.field_ub, (byte) -55);
          this.field_sb = null;
          if (param1 != -29870) {
            var4 = (ce) null;
            this.c((ce) null, (byte) -56);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ca.U(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(String param0, String param1, String param2, byte param3, int param4, int param5) {
        hl var6 = null;
        try {
          var6 = new hl(param4, param0, param5, param1, param2);
          rb.a(var6, -3);
          int var7 = 121 % ((20 - param3) / 42);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "ca.W(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static ck[] a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7, int param8) {
        int stackIn_13_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_26_1 = 0;
        int stackIn_37_0 = 0;
        int stackIn_48_0 = 0;
        int var9 = 0;
        ck[] var10 = null;
        ck[] var11_ref_ck__ = null;
        int var11 = 0;
        int var12 = 0;
        ck var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var11Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime2Lifetime1;
        int var12Lifetime2Lifetime2;
        var15 = client.field_A ? 1 : 0;
        var9 = param1 + (param3 + param4);
        var10 = new ck[]{new ck(var9, var9), new ck(param8, var9), new ck(var9, var9), new ck(var9, param8), new ck(64, 64), new ck(var9, param8), new ck(var9, var9), new ck(param8, var9), new ck(var9, var9)};
        var11_ref_ck__ = var10;
        if (param5) {
          field_kb = -21;
        }
        var12 = 0;
        L1: while (true) {
          if (var11_ref_ck__.length > var12) {
            var13 = var11_ref_ck__[var12];
            stackIn_13_0 = 0;
            if (var15 != 0) {
              break L1;
            }
            var14 = stackIn_13_0;
            while (var14 < var13.field_D.length) {
              var13.field_D[var14] = param0;
              var14++;
            }
            var12++;
            continue L1;
          }
          stackIn_13_0 = 0;
          break;
        }
        var11 = stackIn_13_0;
        L7: while (true) {
          if (var11 < param3) {
            stackIn_24_0 = 0;
            if (var15 != 0) {
              break L7;
            }
            var12Lifetime1 = stackIn_24_0;
            while (var9 > var12Lifetime1) {
              var10[6].field_D[var12Lifetime1 + (var9 - var11 - 1) * var9] = param2;
              var10[8].field_D[(-1 + (var9 - var11)) * var9 + var12Lifetime1] = param2;
              var10[2].field_D[-var11 - 1 + var9 + var12Lifetime1 * var9] = param2;
              var10[8].field_D[var12Lifetime1 * var9 + (-var11 + (-1 + var9))] = param2;
              var12Lifetime1++;
            }
            var11++;
            continue L7;
          }
          stackIn_24_0 = 0;
          break;
        }
        var11Lifetime1 = stackIn_24_0;
        while (true) {
          stackIn_26_0 = var11Lifetime1;
          stackIn_26_1 = param3;
          if (stackIn_26_0 < stackIn_26_1) {
            stackIn_37_0 = 0;
            if (var15 == 0) {
              var12Lifetime2 = stackIn_37_0;
              while (var9 > var12Lifetime2) {
                var10[0].field_D[var12Lifetime2 + var9 * var11Lifetime1] = param7;
                var10[0].field_D[var9 * var12Lifetime2 + var11Lifetime1] = param7;
                stackIn_26_0 = ~(-var11Lifetime1 + var9);
                stackIn_26_1 = ~var12Lifetime2;
                if (stackIn_26_0 < stackIn_26_1) {
                  var10[2].field_D[var12Lifetime2 + var11Lifetime1 * var9] = param7;
                  var10[6].field_D[var12Lifetime2 * var9 + var11Lifetime1] = param7;
                }
                var12Lifetime2++;
              }
              var11Lifetime1++;
              continue;
            }
          } else {
            stackIn_37_0 = 0;
          }
          var11Lifetime1 = stackIn_37_0;
          L20: while (true) {
            if (param8 > var11Lifetime1) {
              stackIn_48_0 = 0;
              if (var15 != 0) {
                break L20;
              }
              var12Lifetime2Lifetime1 = stackIn_48_0;
              while (var12Lifetime2Lifetime1 < param3) {
                var10[7].field_D[(-1 + var9 - var12Lifetime2Lifetime1) * param8 + var11Lifetime1] = param2;
                var10[5].field_D[-var12Lifetime2Lifetime1 - (1 - var9 - var11Lifetime1 * var9)] = param2;
                var10[1].field_D[var12Lifetime2Lifetime1 * param8 + var11Lifetime1] = param7;
                var10[3].field_D[var9 * var11Lifetime1 + var12Lifetime2Lifetime1] = param7;
                var12Lifetime2Lifetime1++;
              }
              var11Lifetime1++;
              continue L20;
            }
            stackIn_48_0 = 0;
            break;
          }
          var11Lifetime1 = stackIn_48_0;
          L26: while (param8 >> 1 > var11Lifetime1) {
            var12Lifetime2Lifetime2 = 0;
            while (true) {
              if (var12Lifetime2Lifetime2 < param4) {
                var10[1].field_D[var11Lifetime1 + param8 * (-1 - var12Lifetime2Lifetime2 + var9)] = param6;
                var10[3].field_D[-var12Lifetime2Lifetime2 - (1 - var9 - var9 * var11Lifetime1)] = param6;
                var10[7].field_D[var12Lifetime2Lifetime2 * param8 + var11Lifetime1] = param6;
                var10[5].field_D[var12Lifetime2Lifetime2 + var9 * var11Lifetime1] = param6;
                var12Lifetime2Lifetime2++;
                if (var15 == 0) {
                  continue;
                }
              } else {
                var11Lifetime1++;
              }
              break;
            }
            if (var15 == 0) {
              continue L26;
            }
            break;
          }
          return var10;
        }
    }

    void c(ce param0, byte param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param1 < 10) {
            field_kb = -79;
          }
          this.field_sb = param0;
          if (fh.field_e == this.field_pb) {
            this.b(this.field_sb.field_t + 12, this.field_tb, this.field_sb.field_y + this.field_nb + 12, 194);
            this.field_rb = 0;
            if (!client.field_A) {
              return;
            }
          }
          if (da.field_b != this.field_pb) {
            this.field_pb = da.field_b;
            this.field_rb = 0;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("ca.T(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static ck[] m(int param0) {
        boolean stackIn_3_0 = false;
        int stackIn_20_0 = 0;
        boolean stackOut_2_0;
        ck[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var6_int = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        int[] var12 = null;
        int[] var14 = null;
        byte[] var17 = null;
        byte[] var18 = null;
        var8 = client.field_A ? 1 : 0;
        var1 = new ck[ec.field_g];
        var2 = param0;
        boolean decompiledNaturalLoopExit0 = false;
        while (!(decompiledNaturalLoopExit0 = (!(var2 < ec.field_g)))) {
          var3 = hc.field_c[var2] * tm.field_a[var2];
          var17 = tc.field_Nb[var2];
          stackOut_2_0 = da.field_d[var2];
          stackIn_20_0 = stackOut_2_0 ? 1 : 0;
          stackIn_3_0 = stackOut_2_0;
          if (var8 == 0) {
            boolean decompiledFrameRemainder0 = true;
            if (!stackIn_3_0) {
              var9 = new int[var3];
              var6_int = 0;
              while (var3 > var6_int) {
                var9[var6_int] = mb.field_d[lb.a(255, (int) var17[var6_int])];
                var6_int++;
              }
              var1[var2] = new ck(ed.field_f, i.field_d, sg.field_d[var2], fh.field_a[var2], tm.field_a[var2], hc.field_c[var2], var9);
              decompiledFrameRemainder0 = false;
            }
            else {
              var18 = pd.field_e[var2];
              var14 = new int[var3];
              var12 = var14;
              var6 = var12;
              var7 = 0;
              while (var3 > var7) {
                var6[var7] = de.b(lb.a((int) var18[var7], 255) << 24, mb.field_d[lb.a((int) var17[var7], 255)]);
                var7++;
              }
              var1[var2] = (ck) ((Object) new ld(ed.field_f, i.field_d, sg.field_d[var2], fh.field_a[var2], tm.field_a[var2], hc.field_c[var2], var14));
            }
            var2++;
            continue;
          }
          break;
        }
        if (decompiledNaturalLoopExit0) {
          stackIn_20_0 = 126;
        }
        oa.a(stackIn_20_0);
        return var1;
    }

    public static void l(int param0) {
        if (param0 <= 72) {
          return;
        }
        field_wb = null;
        field_ob = null;
        field_qb = null;
    }

    boolean a(int param0, int param1, ce param2, char param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.a(82, param1, param2, param3)) {
            return true;
          }
          var5_int = 54 % ((param0 + 22) / 49);
          if (this.field_ub != null) {
            if (98 == param1) {
              this.field_ub.a(false, param2);
            }
            if (param1 != 99) {
              return false;
            }
            this.field_ub.a(false, param2);
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_15_0 = var5;
          stackIn_15_1 = new StringBuilder().append("ca.QA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param3).append(')').toString());
        }
    }

    final void j(int param0) {
        if (null != this.field_pb) {
          if (this.field_pb != rb.field_c) {
            this.a(108, this.field_sb.field_t + 12, this.field_nb + 12 + this.field_sb.field_y);
            this.a(this.field_sb, -29870);
          }
          this.field_ub.field_Q = 256;
          this.field_pb = null;
        }
        super.j(92);
        int var2 = 11 % ((-15 - param0) / 49);
    }

    boolean h(byte param0) {
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3;
        var3 = client.field_A ? 1 : 0;
        if (param0 <= 15) {
          field_kb = -126;
        }
        boolean decompiledFrameRemainder0 = true;
        if (this.field_pb != null) {
          if ((da.field_b != this.field_pb) &&
            (decompiledFrameRemainder0 = (this.field_pb == rb.field_c))) {
            fieldTemp$2 = this.field_rb + 1;
            this.field_rb = this.field_rb + 1;
            if (fieldTemp$2 != this.field_mb) {
              this.field_ub.field_Q = (this.field_rb << 8) / this.field_mb;
              decompiledFrameRemainder0 = (var3 != 0);
            }
            if (decompiledFrameRemainder0) {
              this.field_ub.field_Q = 256;
              this.field_pb = null;
              decompiledFrameRemainder0 = (var3 != 0);
            }
          }
          if (decompiledFrameRemainder0) {
            fieldTemp$3 = this.field_rb + 1;
            this.field_rb = this.field_rb + 1;
            if (fieldTemp$3 != this.field_lb) {
              this.field_ub.field_Q = -((this.field_rb << 8) / this.field_lb) + 256;
              if (var3 != 0) {
                this.field_pb = fh.field_e;
                this.b(12 + this.field_sb.field_t, this.field_tb, this.field_nb + 12 + this.field_sb.field_y, 194);
                this.field_ub.field_Q = 0;
                this.field_rb = 0;
              }
            } else {
              this.field_pb = fh.field_e;
              this.b(12 + this.field_sb.field_t, this.field_tb, this.field_nb + 12 + this.field_sb.field_y, 194);
              this.field_ub.field_Q = 0;
              this.field_rb = 0;
            }
          }
        }
        return super.h((byte) 47);
    }

    ca(ka param0, ce param1, int param2, int param3, int param4) {
        super(param0, param1.field_t + 12, 12 + (param2 + param1.field_y));
        try {
          this.field_mb = param3;
          this.field_lb = param3;
          this.field_nb = param2;
          this.field_tb = param4;
          this.a(param1, -29870);
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "ca.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final boolean f(byte param0) {
        if (param0 <= 77) {
          this.field_pb = (i) null;
        }
        this.j(-109);
        return super.f((byte) 116);
    }

    static {
        field_ob = "Your ignore list is full. Max of 100 hit.";
    }
}
