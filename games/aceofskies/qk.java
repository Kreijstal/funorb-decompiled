/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk {
    static wd field_e;
    static pa field_i;
    static String field_f;
    static int field_g;
    private wt field_b;
    static vd[] field_a;
    private er field_d;
    private int field_c;
    private ph field_h;

    final static void a(String param0, boolean param1) {
        try {
          rs.field_x = param0;
          oi.a(12, 20665);
          if (param1) {
            field_g = 25;
          }
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "qk.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static ll[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int stackIn_11_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_35_0 = 0;
        int stackIn_46_0 = 0;
        int var9 = 0;
        ll[] var10 = null;
        ll[] var11_ref_ll__ = null;
        int var11 = 0;
        int var12 = 0;
        ll var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var11Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime2Lifetime1;
        int var12Lifetime2Lifetime2;
        var15 = AceOfSkies.field_G ? 1 : 0;
        var9 = param4 + (param1 + param5);
        var10 = new ll[]{new ll(var9, var9), new ll(param0, var9), new ll(var9, var9), new ll(var9, param0), new ll(64, 64), new ll(var9, param0), new ll(var9, var9), new ll(param0, var9), new ll(var9, var9)};
        var11_ref_ll__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var12 < var11_ref_ll__.length) {
            var13 = var11_ref_ll__[var12];
            stackIn_11_0 = 0;
            if (var15 != 0) {
              break L0;
            }
            var14 = stackIn_11_0;
            while (var14 < var13.field_x.length) {
              var13.field_x[var14] = param8;
              var14++;
            }
            var12++;
            continue L0;
          }
          stackIn_11_0 = 0;
          break;
        }
        var11 = stackIn_11_0;
        L6: while (true) {
          if (var11 < param4) {
            stackIn_22_0 = 0;
            if (var15 != 0) {
              break L6;
            }
            var12Lifetime1 = stackIn_22_0;
            while (var12Lifetime1 < var9) {
              var10[6].field_x[var9 * (-var11 + (var9 - 1)) + var12Lifetime1] = param2;
              var10[8].field_x[(-var11 + (var9 - 1)) * var9 + var12Lifetime1] = param2;
              var10[2].field_x[-var11 + var9 + (-1 + var12Lifetime1 * var9)] = param2;
              var10[8].field_x[-var11 - (-var9 + 1) + var12Lifetime1 * var9] = param2;
              var12Lifetime1++;
            }
            var11++;
            continue L6;
          }
          stackIn_22_0 = 0;
          break;
        }
        var11Lifetime1 = stackIn_22_0;
        while (true) {
          stackIn_24_0 = var11Lifetime1;
          stackIn_24_1 = param4;
          if (stackIn_24_0 < stackIn_24_1) {
            stackIn_35_0 = 0;
            if (var15 == 0) {
              var12Lifetime2 = stackIn_35_0;
              while (var9 > var12Lifetime2) {
                var10[0].field_x[var11Lifetime1 * var9 + var12Lifetime2] = param3;
                var10[0].field_x[var11Lifetime1 + var12Lifetime2 * var9] = param3;
                stackIn_24_0 = ~(var9 - var11Lifetime1);
                stackIn_24_1 = ~var12Lifetime2;
                if (stackIn_24_0 < stackIn_24_1) {
                  var10[2].field_x[var11Lifetime1 * var9 + var12Lifetime2] = param3;
                  var10[6].field_x[var11Lifetime1 + var9 * var12Lifetime2] = param3;
                }
                var12Lifetime2++;
              }
              var11Lifetime1++;
              continue;
            }
          } else {
            stackIn_35_0 = 0;
          }
          var11Lifetime1 = stackIn_35_0;
          L19: while (true) {
            if (param0 > var11Lifetime1) {
              stackIn_46_0 = 0;
              if (var15 != 0) {
                break L19;
              }
              var12Lifetime2Lifetime1 = stackIn_46_0;
              while (param4 > var12Lifetime2Lifetime1) {
                var10[7].field_x[(-1 - var12Lifetime2Lifetime1 + var9) * param0 + var11Lifetime1] = param2;
                var10[5].field_x[-var12Lifetime2Lifetime1 - (-var9 + 1 - var11Lifetime1 * var9)] = param2;
                var10[1].field_x[var12Lifetime2Lifetime1 * param0 + var11Lifetime1] = param3;
                var10[3].field_x[var9 * var11Lifetime1 + var12Lifetime2Lifetime1] = param3;
                var12Lifetime2Lifetime1++;
              }
              var11Lifetime1++;
              continue L19;
            }
            var11Lifetime1 = 0;
            stackIn_46_0 = param7;
            break;
          }
          if (stackIn_46_0 > -89) {
            qk.a(-50, 101, 116, 1, 33, 12, 71, 24, -27);
          }
          L26: while (param0 >> 1 > var11Lifetime1) {
            var12Lifetime2Lifetime2 = 0;
            while (true) {
              if (param5 > var12Lifetime2Lifetime2) {
                var10[1].field_x[var11Lifetime1 + (-1 + (-var12Lifetime2Lifetime2 + var9)) * param0] = param6;
                var10[3].field_x[var9 * var11Lifetime1 - 1 + (var9 - var12Lifetime2Lifetime2)] = param6;
                var10[7].field_x[var12Lifetime2Lifetime2 * param0 + var11Lifetime1] = param6;
                var10[5].field_x[var9 * var11Lifetime1 + var12Lifetime2Lifetime2] = param6;
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

    public static void a(int param0) {
        field_a = null;
        if (param0 != 0) {
          return;
        }
        field_e = null;
        field_f = null;
        field_i = null;
    }

    final void a(wt param0, int param1, long param2) {
        RuntimeException runtimeException = null;
        wt var5 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          boolean decompiledSharedTail0 = (this.field_c == 0);
          if (!decompiledSharedTail0) {
            this.field_c = this.field_c - 1;
            decompiledSharedTail0 = (AceOfSkies.field_G);
          }
          if (decompiledSharedTail0) {
            var5 = this.field_d.b(param1 - 18522);
            var5.c(-126);
            var5.d(-119);
            if (this.field_b == var5) {
              var5 = this.field_d.b(param1 - 18522);
              var5.c(-128);
              var5.d(param1 - 125);
            }
          }
          this.field_h.a(125, param2, param0);
          this.field_d.a(param1, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_9_0 = runtimeException;
          stackIn_9_1 = new StringBuilder().append("qk.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(byte param0) {
        wo var1 = (wo) (pu.field_b.b(param0 + 4187));
        if (var1 == null) {
          var1 = new wo();
        }
        var1.a(vp.field_i, 251, vp.field_c, vp.field_f, vp.field_b, vp.field_d, vp.field_j, vp.field_k);
        bo.field_i.a(104, var1);
        if (param0 != -92) {
          field_e = (wd) null;
        }
    }

    final wt a(byte param0, long param1) {
        if (param0 != -27) {
          field_g = 50;
        }
        wt var4 = (wt) (this.field_h.a((byte) 106, param1));
        if (var4 != null) {
          this.field_d.a(2, var4);
        }
        return var4;
    }

    qk(int param0) {
        int var2 = 0;
        this.field_b = new wt();
        this.field_d = new er();
        this.field_c = param0;
        for (var2 = 1; param0 > var2 + var2; var2 = var2 + var2) {
        }
        this.field_h = new ph(var2);
    }

    static {
        field_f = "You have 1 unread message!";
    }
}
