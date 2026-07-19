/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc implements Runnable {
    volatile en[] field_l;
    volatile boolean field_b;
    volatile boolean field_j;
    fd field_f;
    static vj field_e;
    static int field_a;
    static ui field_d;
    static ji field_k;
    static String field_h;
    static String field_g;
    static sg[] field_c;
    static ud field_i;

    final static int[] a(int[] param0, byte param1, int[] param2) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] stackIn_3_0 = null;
        int stackIn_6_0 = 0;
        int[] stackIn_8_0 = null;
        int[] stackIn_11_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int[] stackOut_7_0 = null;
        int stackOut_5_0 = 0;
        int[] stackOut_10_0 = null;
        int[] stackOut_2_0 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            var6 = new int[8];
            var3 = var6;
            var4 = 0;
            if (param1 == 47) {
              stackOut_4_0 = 8;
              stackIn_6_0 = stackOut_4_0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (stackIn_6_0 <= var4) {
                      break L3;
                    } else {
                      stackOut_7_0 = (int[]) (var6);
                      stackIn_11_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (var5 != 0) {
                        break L2;
                      } else {
                        stackIn_8_0[var4] = lb.a(param2[var4] ^ -1, param0[var4]);
                        var4++;
                        if (var5 == 0) {
                          stackOut_5_0 = 8;
                          stackIn_6_0 = stackOut_5_0;
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_10_0 = (int[]) (var6);
                  stackIn_11_0 = stackOut_10_0;
                  break L2;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackOut_2_0 = (int[]) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var3_ref);
            stackOut_12_1 = new StringBuilder().append("rc.A(");
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L4;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L4;
            }
          }
          L5: {
            stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
            stackOut_15_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_11_0;
        }
    }

    public static void a(int param0) {
        field_h = null;
        field_e = null;
        field_k = null;
        field_c = null;
        if (param0 >= -103) {
            return;
        }
        field_g = null;
        field_d = null;
        field_i = null;
    }

    public final void run() {
        Exception exception = null;
        int var1_int = 0;
        en var2 = null;
        Throwable var3 = null;
        int var4 = 0;
        String var5 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        var4 = client.field_A ? 1 : 0;
        this.field_b = true;
        try {
          L0: {
            try {
              L1: {
                L2: while (true) {
                  L3: {
                    if (this.field_j) {
                      break L3;
                    } else {
                      if (var4 != 0) {
                        decompiledRegionSelector0 = 1;
                        break L1;
                      } else {
                        var1_int = 0;
                        L4: while (true) {
                          L5: {
                            L6: {
                              if ((var1_int ^ -1) <= -3) {
                                break L6;
                              } else {
                                var2 = this.field_l[var1_int];
                                if (var4 != 0) {
                                  break L5;
                                } else {
                                  L7: {
                                    if (var2 == null) {
                                      break L7;
                                    } else {
                                      var2.g();
                                      break L7;
                                    }
                                  }
                                  var1_int++;
                                  if (var4 == 0) {
                                    continue L4;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            ua.a(10L, -128);
                            db.a(-68, (Object) null, this.field_f);
                            break L5;
                          }
                          if (var4 == 0) {
                            continue L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 0;
                  break L1;
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L8: {
                exception = (Exception) (Object) decompiledCaughtException;
                var5 = (String) null;
                qb.a((Throwable) ((Object) exception), 16408, (String) null);
                this.field_b = false;
                decompiledRegionSelector0 = 1;
                break L8;
              }
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              decompiledRegionSelector1 = 1;
              break L0;
            }
          }
        } catch (java.lang.Throwable decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var3 = decompiledCaughtException;
          this.field_b = false;
          throw rc.<RuntimeException>$cfr$sneakyThrow(var3);
        }
        L9: {
          if (decompiledRegionSelector1 == 0) {
            this.field_b = false;
            break L9;
          } else {
            break L9;
          }
        }
    }

    final static boolean a(boolean param0) {
        boolean discarded$0 = false;
        if (param0) {
            discarded$0 = rc.a(true);
        }
        return kf.field_Q != null ? true : false;
    }

    final static ke a(boolean param0, boolean param1, boolean param2, byte param3, boolean param4) {
        int var6 = 0;
        int var7 = 0;
        ke var8 = null;
        ke var9 = null;
        ke stackIn_1_0 = null;
        ke stackIn_2_0 = null;
        ke stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        ke stackIn_6_0 = null;
        ke stackIn_7_0 = null;
        ke stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        ke stackIn_9_0 = null;
        ke stackIn_10_0 = null;
        ke stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        ke stackOut_0_0 = null;
        ke stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        ke stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        ke stackOut_5_0 = null;
        ke stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        ke stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        ke stackOut_8_0 = null;
        ke stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        ke stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        L0: {
          var8 = new ke(2);
          var9 = var8;
          stackOut_0_0 = (ke) (var9);
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if (!param1) {
            stackOut_2_0 = (ke) ((Object) stackIn_2_0);
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = (ke) ((Object) stackIn_1_0);
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          stackIn_3_0.field_s = stackIn_3_1 != 0;
          if (param3 <= 0) {
            break L1;
          } else {
            rc.a(-21);
            break L1;
          }
        }
        L2: {
          stackOut_5_0 = (ke) (var9);
          stackIn_7_0 = stackOut_5_0;
          stackIn_6_0 = stackOut_5_0;
          if (!param2) {
            stackOut_7_0 = (ke) ((Object) stackIn_7_0);
            stackOut_7_1 = 0;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            break L2;
          } else {
            stackOut_6_0 = (ke) ((Object) stackIn_6_0);
            stackOut_6_1 = 1;
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            break L2;
          }
        }
        L3: {
          stackIn_8_0.field_j = stackIn_8_1 != 0;
          stackOut_8_0 = (ke) (var9);
          stackIn_10_0 = stackOut_8_0;
          stackIn_9_0 = stackOut_8_0;
          if (!param0) {
            stackOut_10_0 = (ke) ((Object) stackIn_10_0);
            stackOut_10_1 = 0;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            break L3;
          } else {
            stackOut_9_0 = (ke) ((Object) stackIn_9_0);
            stackOut_9_1 = 1;
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            break L3;
          }
        }
        L4: {
          stackIn_11_0.field_r = stackIn_11_1 != 0;
          var9.a(new ec(20, qn.field_rb, a.field_t), 115);
          var9.a(new ec(21, lg.field_T, a.field_t), 102);
          var8.field_f[0].field_l = 320 + -(var8.field_f[0].field_n / 2);
          var8.field_f[0].field_m = 150;
          var8.field_f[1].field_m = 250;
          var8.field_f[1].field_l = 320 - var8.field_f[1].field_n / 2;
          var9.a(-1, param4, -129);
          var6 = var8.field_f[0].field_n;
          var7 = var8.field_f[1].field_n;
          if (var6 >= var7) {
            break L4;
          } else {
            var6 = var7;
            break L4;
          }
        }
        L5: {
          var7 = w.field_kb.a(si.field_g);
          if (var7 <= var6) {
            break L5;
          } else {
            var6 = var7;
            break L5;
          }
        }
        L6: {
          var7 = w.field_kb.a(gf.a(-127, param1, param2, param0));
          if (var6 < var7) {
            var6 = var7;
            break L6;
          } else {
            break L6;
          }
        }
        L7: {
          var7 = w.field_kb.a(ri.a(0, param1, param2, param0));
          if (var7 <= var6) {
            break L7;
          } else {
            var6 = var7;
            break L7;
          }
        }
        L8: {
          var7 = w.field_kb.a(kk.a(param2, param1, param0, true));
          if (var6 < var7) {
            var6 = var7;
            break L8;
          } else {
            break L8;
          }
        }
        var9.field_z = 76;
        var9.field_w = -(var6 / 2) + 280;
        var9.field_q = 260;
        var9.field_y = -var9.field_w + (var6 / 2 + 360);
        return var9;
    }

    rc() {
        this.field_l = new en[2];
        this.field_j = false;
        this.field_b = false;
    }

    static {
        int var0 = 0;
        field_a = 0;
        field_h = "Left";
        field_e = new vj();
        field_c = new sg[255];
        field_g = "Cancel unrated rematch";
        for (var0 = 0; var0 < field_c.length; var0++) {
            field_c[var0] = new sg();
        }
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException $cfr$sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
