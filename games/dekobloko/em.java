/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class em {
    private la field_c;
    static String field_b;
    private ji field_a;
    private ji field_d;

    public static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != 82) {
            em.a((byte) 15);
          }
          field_b = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "em.F(" + param0 + ')');
        }
    }

    final static boolean b(byte param0) {
        RuntimeException var1 = null;
        boolean stackIn_7_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 < -107) {
            stackIn_7_0 = !(jj.field_f.a(80));
            return stackIn_7_0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "em.B(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          ah.field_c.c(true);
          if (pk.field_v == null) {
            pk.field_v = new qn(ah.field_c, ed.field_d);
          }
          if (param0 != -1199770620) {
            field_b = (String) null;
          }
          ah.field_c.a((byte) -119, pk.field_v);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "em.G(" + param0 + ')');
        }
    }

    final ac a(int param0, int param1) {
        ac var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        int var5 = 0;
        ac stackIn_2_0 = null;
        ac stackIn_13_0 = null;
        RuntimeException decompiledCaughtException = null;
        ac var3Lifetime1;
        try {
          var3 = (ac) (this.field_c.a((long)param1, (byte) -30));
          if (null != var3) {
            stackIn_2_0 = var3;
            return stackIn_2_0;
          }
          var5 = 57 / ((param0 + 79) / 38);
          if (param1 < 32768) {
            var4 = this.field_d.a(param1, 63, 0);
          }
          if (param1 >= 32768 ||
            client.field_A) {
            var4 = this.field_a.a(32767 & param1, 49, 0);
          }
          var3Lifetime1 = new ac();
          if (var4 != null) {
            var3Lifetime1.a((byte) -4, new wl(var4));
          }
          if (param1 >= 32768) {
            var3Lifetime1.c(-1);
          }
          this.field_c.a(var3Lifetime1, (long)param1, 69);
          stackIn_13_0 = var3Lifetime1;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var3_ref), "em.C(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(vg param0, boolean param1, int param2, byte param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_30_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_49_0 = 0;
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
        int stackIn_40_0Lifetime1;
        int stackIn_40_1Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var19 = client.field_A ? 1 : 0;
        try {
          var5_int = s.b((byte) 127, (-param4 + param2) * 3);
          var6 = param4 * 3;
          var7 = var5_int - 10;
          rd.c(0);
          if (0 < param0.field_B &&
            null != param0.field_Q) {
            ci.a((byte) 127);
          }
          ta.field_d = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param0.field_L > var8)))) {
            var9 = param0.field_M[var8];
            var10 = param0.field_c[var8];
            var11 = param0.field_A[var8];
            stackOut_9_0 = param1;
            stackIn_49_0 = stackOut_9_0 ? 1 : 0;
            stackIn_10_0 = stackOut_9_0;
            if (var19 == 0) {
              if (stackIn_10_0) {
                var12 = kl.field_n[var9];
                var13 = rn.field_b[var9];
                var14 = -var12 + kl.field_n[var10];
                var15 = kl.field_n[var11] - var12;
                var16 = -var13 + rn.field_b[var10];
                var17 = rn.field_b[var11] - var13;
              }
              if (!stackIn_10_0 ||
                !(var17 * var14 - var15 * var16 >= 0)) {
                var12Lifetime1 = vg.field_G[var9];
                if (var12Lifetime1 != -2147483648) {
                  var13Lifetime1 = vg.field_G[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = vg.field_G[var11];
                    if (var14 != -2147483648) {
                      var15 = var14 + (var13Lifetime1 + var12Lifetime1) - var6;
                      if (0 > var7) {
                        stackIn_30_0 = var15 << -var7;
                      } else {
                        stackIn_30_0 = var15 >> var7;
                      }
                      var16 = -stackIn_30_0 + a.field_r.length - 1;
                      var17 = a.field_r[var16];
                      while (true) {
                        if (var17 >> 4 != 0) {
                          var16--;
                          stackIn_40_0 = ~var16;
                          stackIn_40_1 = -1;
                          if (stackIn_40_0 > stackIn_40_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = a.field_r[var16];
                          continue;
                        }
                        stackIn_40_0Lifetime1 = var17;
                        stackIn_40_1Lifetime1 = var16 << 4;
                        var18 = stackIn_40_0Lifetime1 + stackIn_40_1Lifetime1;
                        hb.field_Vb[var18] = var8;
                        a.field_r[var16] = var17 + 1;
                        if (param0.field_B > 0 &&
                          param0.field_Q != null) {
                          dupTemp$0 = param0.field_Q[var8];
                          nm.field_Nb[dupTemp$0] = nm.field_Nb[dupTemp$0] + 1;
                        }
                        ta.field_d = ta.field_d + 1;
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
            stackIn_49_0 = -1;
          }
          if (stackIn_49_0 > ~param0.field_B &&
            null != param0.field_Q) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(nm.field_Nb.length <= var9Lifetime1)) {
              var10Lifetime1 = nm.field_Nb[var9Lifetime1];
              nm.field_Nb[var9Lifetime1] = var8Lifetime1;
              var8Lifetime1 = var8Lifetime1 + var10Lifetime1;
              var9Lifetime1++;
              if (var19 != 0) {
                return;
              }
            }
          }
          if (param3 < 44) {
            field_b = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_68_0 = var5;
          stackIn_68_1 = new StringBuilder().append("em.A(");
          if (param0 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final static int[] a(int param0, int param1, byte param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 90) {
            em.a(107, 61, (byte) -72);
          }
          var3_int = sk.a(param1, -104);
          var4 = ue.a(param1, 92);
          var5 = sk.a(param0, -122);
          var6 = ue.a(param0, -63);
          var7 = (int)((long)var5 * (long)var3_int >> 16);
          var8 = (int)((long)var6 * (long)var3_int >> 16);
          var9 = (int)((long)var5 * (long)var4 >> 16);
          var10 = (int)((long)var6 * (long)var4 >> 16);
          stackIn_4_0 = new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3_int, var10};
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var3), "em.E(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(byte param0, ji param1) {
        RuntimeException runtimeException = null;
        ck var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new ck(param1.a(0, "", "final_frame.jpg"), (java.awt.Component) ((Object) jh.field_b));
          var3 = var2.field_I;
          var4 = var2.field_H;
          uh.a(-9074);
          re.field_r = new ck(var3, 3 * var4 / 4);
          re.field_r.a();
          var2.e(0, 0);
          qj.field_d = new ck(var3, -re.field_r.field_H + var4);
          qj.field_d.a();
          var2.e(0, -re.field_r.field_H);
          if (param0 != -113) {
            em.a(16, 35, (byte) 0);
          }
          qj.field_d.field_z = re.field_r.field_H;
          mk.a((byte) -5);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("em.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    em(int param0, ji param1, ji param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        this.field_c = new la(64);
        try {
          this.field_a = param2;
          this.field_d = param1;
          if (null != this.field_d) {
            this.field_d.b(-5228, 0);
          }
          if (this.field_a != null) {
            this.field_a.b(-5228, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_12_0 = runtimeException;
          stackIn_12_1 = new StringBuilder().append("em.<init>(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_b = "<%0> has withdrawn the request to join.";
    }
}
