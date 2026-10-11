/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b extends RuntimeException {
    static String field_b;
    static char[] field_a;
    String field_c;
    Throwable field_d;

    final static void a(int param0, int param1, byte param2, boolean param3, qh param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_30_0 = 0;
        int stackIn_41_0 = 0;
        int stackIn_41_1 = 0;
        int stackIn_51_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_9_0;
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
        int stackIn_41_0Lifetime1;
        int stackIn_41_1Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = DungeonAssault.field_K;
        try {
          var5_int = ue.a((-param0 + param1) * 3, -715);
          var6 = 3 * param0;
          var7 = var5_int - 10;
          ea.c(0);
          if (param4.field_w > 0 &&
            param4.field_y != null) {
            uf.c(28);
          }
          ab.field_c = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param4.field_h > var8)))) {
            var9 = param4.field_A[var8];
            var10 = param4.field_x[var8];
            var11 = param4.field_N[var8];
            stackOut_9_0 = param3;
            stackIn_51_0 = stackOut_9_0 ? 1 : 0;
            stackIn_10_0 = stackOut_9_0;
            if (var19 == 0) {
              if (stackIn_10_0) {
                var12 = nj.field_g[var9];
                var13 = ra.field_b[var9];
                var14 = -var12 + nj.field_g[var10];
                var15 = nj.field_g[var11] - var12;
                var16 = -var13 + ra.field_b[var10];
                var17 = -var13 + ra.field_b[var11];
              }
              if (!stackIn_10_0 ||
                !(-(var15 * var16) + var17 * var14 >= 0)) {
                var12Lifetime1 = ko.field_v[var9];
                if (var12Lifetime1 != -2147483648) {
                  var13Lifetime1 = ko.field_v[var10];
                  if (-2147483648 != var13Lifetime1) {
                    var14 = ko.field_v[var11];
                    if (var14 != -2147483648) {
                      var15 = -var6 + (var14 + var13Lifetime1) + var12Lifetime1;
                      if (var7 >= 0) {
                        stackIn_30_0 = var15 >> var7;
                      } else {
                        stackIn_30_0 = var15 << -var7;
                      }
                      var16 = -stackIn_30_0 + (gg.field_a.length - 1);
                      var17 = gg.field_a[var16];
                      while (true) {
                        if (0 != var17 >> 4) {
                          var16--;
                          stackIn_41_0 = ~var16;
                          stackIn_41_1 = -1;
                          if (stackIn_41_0 > stackIn_41_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = gg.field_a[var16];
                          continue;
                        }
                        stackIn_41_0Lifetime1 = var17;
                        stackIn_41_1Lifetime1 = var16 << 4;
                        var18 = stackIn_41_0Lifetime1 + stackIn_41_1Lifetime1;
                        hf.field_yb[var18] = var8;
                        gg.field_a[var16] = 1 + var17;
                        if (param4.field_w > 0 &&
                          null != param4.field_y) {
                          dupTemp$0 = param4.field_y[var8];
                          hk.field_b[dupTemp$0] = hk.field_b[dupTemp$0] + 1;
                        }
                        ab.field_c = ab.field_c + 1;
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
            stackIn_51_0 = param4.field_w;
          }
          if (stackIn_51_0 > 0 &&
            param4.field_y != null) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(hk.field_b.length <= var9Lifetime1)) {
              var10Lifetime1 = hk.field_b[var9Lifetime1];
              hk.field_b[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          if (param2 > -27) {
            b.b(-114);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_68_0 = var5;
          stackIn_68_1 = new StringBuilder().append("b.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(')').toString());
        }
    }

    final static long a(int param0) {
        RuntimeException var1 = null;
        long stackIn_2_0 = 0L;
        long stackIn_4_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > 118) {
            stackIn_4_0 = -qm.field_o + kd.c(-2456);
            return stackIn_4_0;
          }
          stackIn_2_0 = 109L;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "b.D(" + param0 + ')');
        }
    }

    public static void b(int param0) {
        field_a = null;
        field_b = null;
        if (param0 != -30719) {
          b.a(-59);
        }
    }

    final static void a(hl param0, boolean param1, byte param2, int param3, boolean param4) {
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        String var7 = null;
        try {
          n.field_f[0] = bl.field_i.nextInt();
          n.field_f[1] = bl.field_i.nextInt();
          ta.field_c.field_o = 0;
          n.field_f[2] = (int)(o.field_j >> 32);
          n.field_f[3] = (int)o.field_j;
          ta.field_c.a((byte) 63, n.field_f[0]);
          ta.field_c.a((byte) 63, n.field_f[1]);
          ta.field_c.a((byte) 63, n.field_f[2]);
          ta.field_c.a((byte) 63, n.field_f[3]);
          mf.a(-30463, ta.field_c);
          ta.field_c.i(param3, -112);
          param0.a(ta.field_c, (byte) -79);
          ac.field_B.field_o = 0;
          if (param4) {
            ac.field_B.a(6, 18);
          }
          if (!param4 ||
            DungeonAssault.field_K != 0) {
            ac.field_B.a(6, 16);
          }
          if (param2 > -22) {
            return;
          }
          ac.field_B.field_o = ac.field_B.field_o + 2;
          var5_int = ac.field_B.field_o;
          ac.field_B.a((byte) 63, la.field_c);
          ac.field_B.a(58, dn.field_Q);
          var6 = 0;
          if (ld.field_g) {
            var6 = var6 | 1;
          }
          if (fa.field_j) {
            var6 = var6 | 4;
          }
          if (param1) {
            var6 = var6 | 8;
          }
          if (pd.field_E != null) {
            var6 = var6 | 16;
          }
          ac.field_B.a(6, var6);
          var7 = oj.a(m.c(true), (byte) 98);
          if (null == var7) {
            var7 = "";
          }
          ac.field_B.b(var7, (byte) -20);
          if (null != pd.field_E) {
            ac.field_B.a(2, pd.field_E);
          }
          of.a(ac.field_B, kd.field_d, om.field_c, (byte) -114, ta.field_c);
          ac.field_B.b(-var5_int + ac.field_B.field_o, 1);
          op.a(0, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_35_0 = var5;
          stackIn_35_1 = new StringBuilder().append("b.A(");
          if (param0 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static String a(String param0, int param1) {
        RuntimeException var2 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -1) {
            field_b = (String) null;
          }
          stackIn_4_0 = "<col=FF0000>" + param0 + "</col>";
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("b.B(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    b(Throwable param0, String param1) {
        this.field_d = param0;
        this.field_c = param1;
    }

    static {
        field_a = new char[128];
        field_b = "Unable to connect to the data server. Please check any firewall you are using.";
    }
}
