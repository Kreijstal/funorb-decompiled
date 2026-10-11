/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    static boolean[] field_a;
    private int field_e;
    static String field_d;
    static int field_g;
    private int field_f;
    private gb field_b;
    private pk field_c;

    final static void a(boolean param0, vg param1, int param2, byte param3, int param4) {
        byte dupTemp$0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_30_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_40_1 = 0;
        int stackIn_49_0 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
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
        var19 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var5_int = jl.a(param3, (-param4 + param2) * 3);
          var6 = param4 * 3;
          tl.e((byte) -79);
          var7 = -10 + var5_int;
          if (param1.field_F > 0 &&
            param1.field_H != null) {
            im.d(-24000);
          }
          ol.field_i = 0;
          var8 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param1.field_G > var8)))) {
            var9 = param1.field_U[var8];
            var10 = param1.field_T[var8];
            var11 = param1.field_O[var8];
            stackOut_9_0 = param0;
            stackIn_49_0 = stackOut_9_0 ? 1 : 0;
            stackIn_10_0 = stackOut_9_0;
            if (var19 == 0) {
              if (stackIn_10_0) {
                var12 = ud.field_p[var9];
                var13 = v.field_g[var9];
                var14 = -var12 + ud.field_p[var10];
                var15 = -var12 + ud.field_p[var11];
                var16 = -var13 + v.field_g[var10];
                var17 = v.field_g[var11] - var13;
              }
              if (!stackIn_10_0 ||
                !(-(var15 * var16) + var14 * var17 >= 0)) {
                var12Lifetime1 = eg.field_a[var9];
                if (var12Lifetime1 != -2147483648) {
                  var13Lifetime1 = eg.field_a[var10];
                  if (var13Lifetime1 != -2147483648) {
                    var14 = eg.field_a[var11];
                    if (var14 != -2147483648) {
                      var15 = -var6 + var14 + (var13Lifetime1 + var12Lifetime1);
                      if (var7 < 0) {
                        stackIn_30_0 = var15 << -var7;
                      } else {
                        stackIn_30_0 = var15 >> var7;
                      }
                      var16 = -stackIn_30_0 + (-1 + kl.field_B.length);
                      var17 = kl.field_B[var16];
                      while (true) {
                        if (0 != var17 >> 4) {
                          var16--;
                          stackIn_40_0 = 0;
                          stackIn_40_1 = var16;
                          if (stackIn_40_0 > stackIn_40_1) {
                            System.err.println("Out of range!");
                            break;
                          }
                          var17 = kl.field_B[var16];
                          continue;
                        }
                        stackIn_40_0Lifetime1 = var17;
                        stackIn_40_1Lifetime1 = var16 << 4;
                        var18 = stackIn_40_0Lifetime1 + stackIn_40_1Lifetime1;
                        w.field_Lb[var18] = var8;
                        kl.field_B[var16] = 1 + var17;
                        if (param1.field_F > 0 &&
                          null != param1.field_H) {
                          dupTemp$0 = param1.field_H[var8];
                          jb.field_s[dupTemp$0] = jb.field_s[dupTemp$0] + 1;
                        }
                        ol.field_i = ol.field_i + 1;
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
            stackIn_49_0 = 0;
          }
          if (stackIn_49_0 < param1.field_F &&
            param1.field_H != null) {
            var8Lifetime1 = 0;
            var9Lifetime1 = 0;
            while (!(jb.field_s.length <= var9Lifetime1)) {
              var10Lifetime1 = jb.field_s[var9Lifetime1];
              jb.field_s[var9Lifetime1] = var8Lifetime1;
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
          stackIn_63_1 = new StringBuilder().append("ig.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final void a(byte param0, int param1, long param2, Object param3) {
        nn var6 = null;
        nh var6_ref = null;
        int var7 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6_ref2 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param1 > this.field_e) {
            throw new IllegalStateException();
          }
          this.a(-104, param2);
          this.field_f = this.field_f - param1;
          while (this.field_f < 0) {
            var6 = (nn) (this.field_b.b(31));
            this.a(var6, 2147483647);
            if (var7 == 0) {
              continue;
            }
            break;
          }
          var6_ref = new nh(param3, param1);
          this.field_c.a((byte) -68, var6_ref, param2);
          this.field_b.a((byte) 37, var6_ref);
          ((nn) ((Object) var6_ref)).field_k = 0L;
          if (param0 >= -99) {
            this.a((byte) -27, 45, 65L, (Object) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref2 = decompiledCaughtException;
          stackIn_15_0 = var6_ref2;
          stackIn_15_1 = new StringBuilder().append("ig.G(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void a(int param0, long param1) {
        nn var4 = null;
        if (param0 > -43) {
          return;
        }
        try {
          var4 = (nn) (this.field_c.a((byte) -79, param1));
          this.a(var4, 2147483647);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ig.B(" + param0 + ',' + param1 + ')');
        }
    }

    final void a(Object param0, long param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.a((byte) -102, 1, param1, param0);
          if (param2 >= -59) {
            this.field_c = (pk) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ig.C(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void a(nn param0, int param1) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param0 != null) {
            param0.a(true);
            param0.a((byte) 88);
            this.field_f = this.field_f + param0.field_r;
          }
          if (param1 != 2147483647) {
            this.a((byte) 22, 41, 61L, (Object) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("ig.E(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(')').toString());
        }
    }

    final Object a(long param0, boolean param1) {
        nn var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        nh var6 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_10_0 = null;
        Object stackIn_17_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = (nn) (this.field_c.a((byte) 118, param0));
          if (var4 == null) {
            stackIn_2_0 = null;
            return stackIn_2_0;
          }
          var5 = var4.e((byte) 110);
          if (param1) {
            stackIn_5_0 = (Object) null;
            return stackIn_5_0;
          }
          if (var5 == null) {
            var4.a(true);
            var4.a((byte) 88);
            this.field_f = this.field_f + var4.field_r;
            stackIn_10_0 = null;
            return stackIn_10_0;
          }
          boolean decompiledSharedTail0 = !(!var4.f((byte) 96));
          if (!decompiledSharedTail0) {
            this.field_b.a((byte) 37, var4);
            var4.field_k = 0L;
            decompiledSharedTail0 = (ArcanistsMulti.field_G);
          }
          if (decompiledSharedTail0) {
            var6 = new nh(var5, var4.field_r);
            this.field_c.a((byte) -99, var6, var4.field_e);
            this.field_b.a((byte) 37, var6);
            ((nn) ((Object) var6)).field_k = 0L;
            var4.a(true);
            var4.a((byte) 88);
          }
          stackIn_17_0 = var5;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var4_ref), "ig.D(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          return;
        }
        try {
          field_a = null;
          field_d = null;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "ig.A(" + param0 + ')');
        }
    }

    final static void a(int param0, boolean param1) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (ce.field_h > 0 &&
            pg.field_d) {
            de.b(0, 0, de.field_e, n.field_g.field_nb);
            gm.field_h.a(param1, true);
          }
          if (sm.field_a <= param0 &&
            oo.field_y <= 0) {
            return;
          }
          if (so.field_j) {
            de.b(0, 0, de.field_e, n.field_g.field_nb);
            nl.field_Fb.a(param1, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "ig.F(" + param0 + ',' + param1 + ')');
        }
    }

    ig(int param0) {
        this(param0, param0);
    }

    private ig(int param0, int param1) {
        RuntimeException runtimeException = null;
        int var3_int = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        this.field_b = new gb();
        try {
          this.field_e = param0;
          this.field_f = param0;
          var3_int = 1;
          while (param0 > (var3_int + var3_int)) {
            if (param1 > var3_int) {
              var3_int = var3_int + var3_int;
              if (var4 == 0) {
                continue;
              }
            }
            break;
          }
          this.field_c = new pk(var3_int);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) runtimeException), "ig.<init>(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_d = "Show chat (<%0> unread messages)";
        field_a = new boolean[]{true, false, true, false, true, true, true, false, false, false, false, false, false, false, true, false, false, false, false, false, true, true, true, true, true, true, true, true, false, false, false, true, true, false, false, false, true, true, true, false, true, false, true, false, false, false, true, true, false, false, false, false, false, false, false, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true};
        field_g = 64;
    }
}
