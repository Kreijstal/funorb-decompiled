/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class n implements Runnable {
    static bl field_h;
    static String field_f;
    static java.awt.Canvas field_g;
    private hl field_b;
    static int field_c;
    static long field_i;
    private Thread field_d;
    private boolean field_a;
    int field_e;

    public final void run() {
        try {
          InterruptedException interruptedException = null;
          Object var2 = null;
          int var5 = 0;
          bi var6 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          Object var2_ref = null;
          Exception var2_ref2 = null;
          var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          while (true) {
            if (!this.field_a) {
              var2_ref = this.field_b;
              synchronized (var2_ref) {
                L3: {
                  var6 = (bi) (this.field_b.d(5518));
                  if (var5 != 0) {
                    decompiledRegionSelector0 = 0;
                  } else {
                    if (var6 != null) {
                      this.field_e = this.field_e - 1;
                    } else {
                      try {
                        this.field_b.wait();
                      } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                      }
                      decompiledRegionSelector0 = 1;
                      break L3;
                    }
                    decompiledRegionSelector0 = 2;
                  }
                }
              }
              if (decompiledRegionSelector0 == 0) {
                return;
              }
              if (decompiledRegionSelector0 == 1) {
                continue;
              }
              try {
                if (var6.field_G != 2) {
                  if (var6.field_G == 3) {
                    var6.field_F = var6.field_H.a((int)var6.field_t, 3);
                    if (var5 != 0) {
                      var6.field_H.a((byte) 107, var6.field_F.length, var6.field_F, (int)var6.field_t);
                    }
                  }
                } else {
                  var6.field_H.a((byte) 107, var6.field_F.length, var6.field_F, (int)var6.field_t);
                }
              } catch (java.lang.Exception decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var2_ref2 = (Exception) (Object) decompiledCaughtException;
                gb.a((Throwable) ((Object) var2_ref2), (String) null, 10);
              }
              var6.field_u = false;
              if (var5 == 0) {
                continue;
              }
            }
            break;
          }
          return;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static nh[] a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        int stackIn_11_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        int stackIn_34_0 = 0;
        int stackIn_45_0 = 0;
        int var9 = 0;
        nh[] var10 = null;
        nh[] var11_ref_nh__ = null;
        int var11 = 0;
        int var12 = 0;
        nh var13_ref_nh = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var11Lifetime1;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime2Lifetime1;
        int var12Lifetime2Lifetime2;
        var15 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        var9 = param5 + param7 + param8;
        var10 = new nh[]{new nh(var9, var9), new nh(param1, var9), new nh(var9, var9), new nh(var9, param1), new nh(64, 64), new nh(var9, param1), new nh(var9, var9), new nh(param1, var9), new nh(var9, var9)};
        var11_ref_nh__ = var10;
        var12 = 0;
        L0: while (true) {
          if (var11_ref_nh__.length > var12) {
            var13_ref_nh = var11_ref_nh__[var12];
            stackIn_11_0 = 0;
            if (var15 != 0) {
              break L0;
            }
            var14 = stackIn_11_0;
            while (var13_ref_nh.field_B.length > var14) {
              var13_ref_nh.field_B[var14] = param2;
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
          if (var11 < param7) {
            stackIn_22_0 = 0;
            if (var15 != 0) {
              break L6;
            }
            var12Lifetime1 = stackIn_22_0;
            while (var12Lifetime1 < var9) {
              var10[6].field_B[(-var11 + (var9 - 1)) * var9 + var12Lifetime1] = param3;
              var10[8].field_B[(var9 - (var11 + 1)) * var9 + var12Lifetime1] = param3;
              var10[2].field_B[-var11 + (var9 - 1 + var9 * var12Lifetime1)] = param3;
              var10[8].field_B[var9 * var12Lifetime1 - 1 - (-var9 + var11)] = param3;
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
          stackIn_24_0 = param7;
          stackIn_24_1 = var11Lifetime1;
          if (stackIn_24_0 > stackIn_24_1) {
            stackIn_34_0 = 0;
            if (var15 == 0) {
              var12Lifetime2 = stackIn_34_0;
              while (var12Lifetime2 < var9) {
                var10[0].field_B[var12Lifetime2 + var9 * var11Lifetime1] = param4;
                var10[0].field_B[var12Lifetime2 * var9 + var11Lifetime1] = param4;
                stackIn_24_0 = -var11Lifetime1 + var9;
                stackIn_24_1 = var12Lifetime2;
                if (stackIn_24_0 > stackIn_24_1) {
                  var10[2].field_B[var12Lifetime2 + var9 * var11Lifetime1] = param4;
                  var10[6].field_B[var11Lifetime1 + var9 * var12Lifetime2] = param4;
                }
                var12Lifetime2++;
              }
              var11Lifetime1++;
              continue;
            }
          } else {
            var11Lifetime1 = -122 % ((param0 - 24) / 62);
            stackIn_34_0 = 0;
          }
          var12Lifetime2Lifetime1 = stackIn_34_0;
          L19: while (true) {
            if (var12Lifetime2Lifetime1 < param1) {
              stackIn_45_0 = 0;
              if (var15 != 0) {
                break L19;
              }
              var13 = stackIn_45_0;
              while (param7 > var13) {
                var10[7].field_B[param1 * (-1 + (-var13 + var9)) + var12Lifetime2Lifetime1] = param3;
                var10[5].field_B[var12Lifetime2Lifetime1 * var9 - 1 - (-var9 + var13)] = param3;
                var10[1].field_B[param1 * var13 + var12Lifetime2Lifetime1] = param4;
                var10[3].field_B[var13 + var12Lifetime2Lifetime1 * var9] = param4;
                var13++;
              }
              var12Lifetime2Lifetime1++;
              continue L19;
            }
            stackIn_45_0 = 0;
            break;
          }
          var11Lifetime1 = stackIn_45_0;
          L25: while (var11Lifetime1 < param1 >> 1) {
            var12Lifetime2Lifetime2 = 0;
            while (true) {
              if (param5 > var12Lifetime2Lifetime2) {
                var10[1].field_B[var11Lifetime1 + (-1 + var9 - var12Lifetime2Lifetime2) * param1] = param6;
                var10[3].field_B[var11Lifetime1 * var9 - 1 + (var9 - var12Lifetime2Lifetime2)] = param6;
                var10[7].field_B[param1 * var12Lifetime2Lifetime2 + var11Lifetime1] = param6;
                var10[5].field_B[var11Lifetime1 * var9 + var12Lifetime2Lifetime2] = param6;
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
              continue L25;
            }
            break;
          }
          return var10;
        }
    }

    private final void a(bi param0, byte param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Object var3 = null;
        RuntimeException var3_ref = null;
        try {
          var3 = this.field_b;
          synchronized (var3) {
            if (param1 >= -112) {
              this.a(62, 59, (ik) null);
            }
            this.field_b.a(param0, 0);
            this.field_e = this.field_e + 1;
            this.field_b.notifyAll();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_10_0 = var3_ref;
          stackIn_10_1 = new StringBuilder().append("n.G(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    final static boolean a(int param0) {
        boolean stackIn_6_0 = false;
        if (param0 != 64) {
          n.a(31, (bl) null, -33, -104, -11, -95);
        }
        stackIn_6_0 = (null != uj.field_j) && (tl.field_O == ik.field_d);
        return stackIn_6_0;
    }

    final bi a(ik param0, int param1, int param2) {
        bi var4 = null;
        RuntimeException var4_ref = null;
        bi stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new bi();
          var4.field_H = param0;
          if (param2 != 7) {
            field_g = (java.awt.Canvas) null;
          }
          var4.field_y = false;
          var4.field_t = (long)param1;
          var4.field_G = 3;
          this.a(var4, (byte) -117);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("n.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void b(int param0) {
        if (param0 != -31553) {
          n.a(-17);
        }
        field_g = null;
        field_h = null;
        field_f = null;
    }

    final bi a(int param0, int param1, ik param2) {
        bi var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        bi var6 = null;
        int var8 = 0;
        bi stackIn_10_0 = null;
        int stackIn_17_0 = 0;
        bi stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var4 = new bi();
          var4.field_G = 1;
          var5 = this.field_b;
          synchronized (var5) {
            boolean decompiledFrameCompleted0 = true;
            var6 = (bi) (this.field_b.a(true));
            while (var6 != null) {
              stackIn_17_0 = $cfr$lcmp(~var6.field_t, ~(long)param1);
              if (var8 != 0) {
                decompiledRegionSelector0 = 0;
                decompiledFrameCompleted0 = false;
                break;
              }
              if (stackIn_17_0 == 0 &&
                var6.field_H == param2 &&
                var6.field_G == 2) {
                var4.field_u = false;
                var4.field_F = var6.field_F;
                stackIn_10_0 = var4;
                return stackIn_10_0;
              }
              var6 = (bi) (this.field_b.c(97));
            }
            if (decompiledFrameCompleted0) {
              decompiledRegionSelector0 = 1;
            }
          }
          if (decompiledRegionSelector0 != 0) {
            var4.field_F = param2.a(param1, 3);
            var4.field_u = false;
            var4.field_y = true;
            stackIn_17_0 = param0;
          }
          if (stackIn_17_0 != 6) {
            this.field_a = false;
          }
          stackIn_20_0 = var4;
          return stackIn_20_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = (RuntimeException) (Object) decompiledCaughtException;
          stackIn_23_0 = var4_ref;
          stackIn_23_1 = new StringBuilder().append("n.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final static q a(int param0, bl param1, int param2, int param3, int param4, int param5) {
        java.awt.Frame var6 = null;
        RuntimeException var6_ref = null;
        q var7 = null;
        java.awt.Frame var8 = null;
        q stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var8 = nj.a(param0, param5, param1, false, param2, param4);
          var6 = var8;
          if (var8 == null) {
            return null;
          }
          var7 = new q();
          var7.field_a = var8;
          var7.field_a.add((java.awt.Component) ((Object) var7));
          var7.setBounds(0, 0, param2, param4);
          var7.addFocusListener(var7);
          var7.requestFocus();
          if (param3 != 9764) {
            field_f = (String) null;
          }
          stackIn_6_0 = var7;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_9_0 = var6_ref;
          stackIn_9_1 = new StringBuilder().append("n.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final bi a(int param0, ik param1, byte[] param2, int param3) {
        bi var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        bi stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = new bi();
          var5.field_t = (long)param0;
          var6 = -73 % ((-42 - param3) / 51);
          var5.field_H = param1;
          var5.field_y = false;
          var5.field_F = param2;
          var5.field_G = 2;
          this.a(var5, (byte) -124);
          stackIn_1_0 = var5;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_4_0 = var5_ref;
          stackIn_4_1 = new StringBuilder().append("n.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(byte param0) {
        try {
          int var3 = 0;
          this.field_a = true;
          synchronized (this.field_b) {
            var3 = -87 / ((param0 + 9) / 47);
            this.field_b.notifyAll();
          }
          try {
            this.field_d.join();
          } catch (InterruptedException interruptedException) {
          }
          this.field_d = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    n(bl param0) {
        RuntimeException runtimeException = null;
        il var2 = null;
        int var3 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        this.field_b = new hl();
        this.field_a = false;
        this.field_e = 0;
        try {
          var2 = param0.a((Runnable) (this), 5, (byte) 127);
          while (true) {
            if (var2.field_b == 0) {
              kk.a(10L, true);
              if (var3 != 0) {
                return;
              }
              continue;
            }
            break;
          }
          if (var2.field_b == 2) {
            throw new RuntimeException();
          }
          this.field_d = (Thread) (var2.field_g);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_11_0 = runtimeException;
          stackIn_11_1 = new StringBuilder().append("n.<init>(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    static {
        field_f = "Medium";
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
