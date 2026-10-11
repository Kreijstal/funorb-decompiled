/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class he {
    private ca[] field_e;
    private int field_d;
    static String field_i;
    static String[] field_f;
    private long field_j;
    private ca field_g;
    static aj field_c;
    static String field_b;
    static dg field_h;
    static String field_a;

    final void a(ca param0, long param1, byte param2) {
        ca var5 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          if (null != param0.field_m) {
            param0.b(12);
          }
          var5 = this.field_e[(int)(param1 & (long)(this.field_d - 1))];
          param0.field_l = var5;
          param0.field_m = var5.field_m;
          param0.field_m.field_l = param0;
          param0.field_l.field_m = param0;
          if (param2 != 64) {
            he.a(-19);
          }
          param0.field_j = param1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_12_0 = var5_ref;
          stackIn_12_1 = new StringBuilder().append("he.C(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, pk param1, int param2, int param3, boolean param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_12_0 = false;
        int stackIn_29_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_11_0;
        int var5_int = 0;
        RuntimeException var5 = null;
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
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int stackIn_40_0Lifetime1;
        int stackIn_40_1Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = Lexicominos.field_L ? 1 : 0;
        try {
          var5_int = kb.a((-param3 + param0) * 3, 16);
          var6 = param3 * 3;
          var7 = var5_int - 10;
          oj.a((byte) 102);
          if (param2 < 103) {
            return;
          }
          if (param1.field_N > 0 &&
            param1.field_J != null) {
            ug.a((byte) 122);
          }
          wb.field_i = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param1.field_H > var8)))) {
            var9 = param1.field_a[var8];
            var10 = param1.field_k[var8];
            var11 = param1.field_B[var8];
            stackOut_11_0 = param4;
            stackIn_49_0 = stackOut_11_0 ? 1 : 0;
            stackIn_12_0 = stackOut_11_0;
            if (var19 == 0) {
              if (stackIn_12_0) {
                var12 = ej.field_c[var9];
                var13 = fk.field_d[var9];
                var14 = -var12 + ej.field_c[var10];
                var15 = -var12 + ej.field_c[var11];
                var16 = fk.field_d[var10] - var13;
                var17 = fk.field_d[var11] - var13;
              }
              if (!stackIn_12_0 ||
                !(-(var16 * var15) + var14 * var17 >= 0)) {
                var12Lifetime1 = qd.field_a[var9];
                if (var12Lifetime1 != -2147483648) {
                  var13Lifetime1 = qd.field_a[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = qd.field_a[var11];
                    if (-2147483648 != var14) {
                      var15 = -var6 + var14 + (var13Lifetime1 + var12Lifetime1);
                      if (0 > var7) {
                        stackIn_29_0 = var15 << -var7;
                      } else {
                        stackIn_29_0 = var15 >> var7;
                      }
                      var16 = -stackIn_29_0 + qg.field_b.length - 1;
                      var17 = qg.field_b[var16];
                      while (true) {
                        if (var17 >> 4 != 0) {
                          var16--;
                          stackIn_40_0 = -1;
                          stackIn_40_1 = ~var16;
                          if (stackIn_40_0 < stackIn_40_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = qg.field_b[var16];
                          continue;
                        }
                        stackIn_40_0Lifetime1 = var16 << 4;
                        stackIn_40_1Lifetime1 = -var17;
                        var18 = stackIn_40_0Lifetime1 - stackIn_40_1Lifetime1;
                        bf.field_a[var18] = var8;
                        qg.field_b[var16] = var17 + 1;
                        if (param1.field_N > 0 &&
                          param1.field_J != null) {
                          dupTemp$0 = param1.field_J[var8];
                          bd.field_l[dupTemp$0] = bd.field_l[dupTemp$0] + 1;
                        }
                        wb.field_i = wb.field_i + 1;
                        break;
                      }
                    }
                  }
                }
              }
              var8++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_49_0 = ~param1.field_N;
          }
          if (stackIn_49_0 < -1 &&
            null != param1.field_J) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(bd.field_l.length <= var9Lifetime1)) {
              var10Lifetime1 = bd.field_l[var9Lifetime1];
              bd.field_l[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_63_0 = var5;
          stackIn_63_1 = new StringBuilder().append("he.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final ca b(int param0) {
        ca var2 = null;
        RuntimeException var2_ref = null;
        ca var3 = null;
        int var4 = 0;
        Object stackIn_3_0 = null;
        ca stackIn_6_0 = null;
        ca stackIn_13_0 = null;
        Object stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          if (this.field_g == null) {
            stackIn_3_0 = null;
            return (ca) (stackIn_3_0);
          }
          var2 = this.field_e[(int)((long)(this.field_d - 1) & this.field_j)];
          if (param0 >= -73) {
            stackIn_6_0 = (ca) null;
            return stackIn_6_0;
          }
          while (var2 != this.field_g) {
            if (var4 == 0) {
              if (~this.field_g.field_j == ~this.field_j) {
                var3 = this.field_g;
                this.field_g = this.field_g.field_l;
                stackIn_13_0 = var3;
                return stackIn_13_0;
              }
              this.field_g = this.field_g.field_l;
              continue;
            }
            break;
          }
          this.field_g = null;
          stackIn_17_0 = null;
          return (ca) (stackIn_17_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2_ref), "he.B(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != -1) {
            he.a(52, (pk) null, -70, 88, false);
          }
          field_i = null;
          field_c = null;
          field_h = null;
          field_f = null;
          field_b = null;
          field_a = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1), "he.D(" + param0 + ')');
        }
    }

    he(int param0) {
        ca dupTemp$0 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        ca var3 = null;
        int var4 = 0;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          this.field_d = param0;
          this.field_e = new ca[param0];
          var2_int = 0;
          while (var2_int < param0) {
            dupTemp$0 = new ca();
            this.field_e[var2_int] = dupTemp$0;
            var3 = dupTemp$0;
            var3.field_m = var3;
            var3.field_l = var3;
            var2_int++;
            if (var4 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2), "he.<init>(" + param0 + ')');
        }
    }

    final ca a(long param0, boolean param1) {
        ca var4 = null;
        RuntimeException var4_ref = null;
        ca var5 = null;
        int var6 = 0;
        ca stackIn_11_0 = null;
        Object stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Lexicominos.field_L ? 1 : 0;
        try {
          this.field_j = param0;
          if (!param1) {
            he.a(-81);
          }
          var4 = this.field_e[(int)((long)(-1 + this.field_d) & param0)];
          this.field_g = var4.field_l;
          while (this.field_g != var4) {
            if (var6 == 0) {
              if (~this.field_g.field_j == ~param0) {
                var5 = this.field_g;
                this.field_g = this.field_g.field_l;
                stackIn_11_0 = var5;
                return stackIn_11_0;
              }
              this.field_g = this.field_g.field_l;
              continue;
            }
            break;
          }
          this.field_g = null;
          stackIn_15_0 = null;
          return (ca) (stackIn_15_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var4_ref), "he.A(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_i = "Orb coins: <%0>";
        field_f = new String[]{"By rating", "By win percentage"};
        field_c = new aj(11, 0, 1, 2);
        field_b = "Unfortunately you are not eligible to create an account.";
        field_h = new dg();
        field_a = "Cancel";
    }
}
