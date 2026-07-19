/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vl implements Runnable {
    static int[] field_g;
    static int field_d;
    static int field_f;
    private il field_e;
    int field_b;
    private Thread field_c;
    private boolean field_a;

    final uc a(eh param0, int param1, int param2) {
        uc var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        uc var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        uc stackIn_12_0 = null;
        uc stackIn_19_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        Throwable decompiledCaughtException = null;
        uc stackOut_11_0 = null;
        uc stackOut_18_0 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              var4 = new uc();
              var4.field_t = 1;
              if (param2 < -125) {
                break L1;
              } else {
                vl.b(82);
                break L1;
              }
            }
            var5 = this.field_e;
            synchronized (var5) {
              L2: {
                var6 = (uc) ((Object) this.field_e.b((byte) 46));
                L3: while (true) {
                  L4: {
                    L5: {
                      if (var6 == null) {
                        break L5;
                      } else {
                        if (var8 != 0) {
                          break L4;
                        } else {
                          L6: {
                            if ((long)param1 != var6.field_h) {
                              break L6;
                            } else {
                              if (var6.field_s != param0) {
                                break L6;
                              } else {
                                if (-3 == (var6.field_t ^ -1)) {
                                  var4.field_u = var6.field_u;
                                  var4.field_l = false;
                                  stackOut_11_0 = (uc) (var4);
                                  stackIn_12_0 = stackOut_11_0;
                                  return stackIn_12_0;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var6 = (uc) ((Object) this.field_e.b(0));
                          if (var8 == 0) {
                            continue L3;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    break L4;
                  }
                  break L2;
                }
              }
            }
            var4.field_u = param0.a(520, param1);
            var4.field_n = true;
            var4.field_l = false;
            stackOut_18_0 = (uc) (var4);
            stackIn_19_0 = stackOut_18_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) (var4_ref);
            stackOut_20_1 = new StringBuilder().append("vl.G(");
            stackIn_22_0 = stackOut_20_0;
            stackIn_22_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "null";
              stackIn_23_0 = stackOut_22_0;
              stackIn_23_1 = stackOut_22_1;
              stackIn_23_2 = stackOut_22_2;
              break L7;
            } else {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "{...}";
              stackIn_23_0 = stackOut_21_0;
              stackIn_23_1 = stackOut_21_1;
              stackIn_23_2 = stackOut_21_2;
              break L7;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_19_0;
    }

    final uc a(byte param0, eh param1, int param2) {
        uc var4 = null;
        RuntimeException var4_ref = null;
        uc stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        uc stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              var4 = new uc();
              var4.field_h = (long)param2;
              var4.field_t = 3;
              var4.field_s = param1;
              var4.field_n = false;
              this.a((byte) 68, var4);
              if (param0 >= 79) {
                break L1;
              } else {
                field_d = -110;
                break L1;
              }
            }
            stackOut_2_0 = (uc) (var4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4_ref);
            stackOut_4_1 = new StringBuilder().append("vl.A(").append(param0).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public static void b(int param0) {
        boolean discarded$0 = false;
        field_g = null;
        if (param0 >= -88) {
            CharSequence var2 = (CharSequence) null;
            discarded$0 = vl.a(false, (CharSequence) null, 95);
        }
    }

    final void a(int param0) {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            Throwable var3 = null;
            Throwable decompiledCaughtException = null;
            this.field_a = true;
            var2 = this.field_e;
            synchronized (var2) {
              L0: {
                this.field_e.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                this.field_c.join();
                break L1;
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L2: {
                interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                break L2;
              }
            }
            if (param0 != -31973) {
              this.run();
              this.field_c = null;
              return;
            } else {
              this.field_c = null;
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(boolean param0, CharSequence param1, int param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        String var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_22_0 = 0;
        boolean stackIn_26_0 = false;
        int stackIn_33_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_39_0 = 0;
        RuntimeException stackIn_41_0 = null;
        StringBuilder stackIn_41_1 = null;
        RuntimeException stackIn_42_0 = null;
        StringBuilder stackIn_42_1 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_43_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_13_0 = 0;
        boolean stackOut_25_0 = false;
        int stackOut_32_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_38_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_40_0 = null;
        StringBuilder stackOut_40_1 = null;
        RuntimeException stackOut_42_0 = null;
        StringBuilder stackOut_42_1 = null;
        String stackOut_42_2 = null;
        RuntimeException stackOut_41_0 = null;
        StringBuilder stackOut_41_1 = null;
        String stackOut_41_2 = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param1 == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = param1.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (-13 > (var3_int ^ -1)) {
                    break L1;
                  } else {
                    var4 = ua.a(123, param1);
                    if (var4 == null) {
                      stackOut_13_0 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      decompiledRegionSelector0 = 2;
                      break L0;
                    } else {
                      if (-2 >= (var4.length() ^ -1)) {
                        if (param2 <= -119) {
                          L2: {
                            if (sk.a(var4.charAt(0), -46)) {
                              break L2;
                            } else {
                              if (!sk.a(var4.charAt(var4.length() - 1), -46)) {
                                var5 = 0;
                                var6 = 0;
                                L3: while (true) {
                                  L4: {
                                    L5: {
                                      if (var6 >= param1.length()) {
                                        break L5;
                                      } else {
                                        var7 = param1.charAt(var6);
                                        stackOut_25_0 = sk.a((char) var7, -46);
                                        stackIn_36_0 = stackOut_25_0 ? 1 : 0;
                                        stackIn_26_0 = stackOut_25_0;
                                        if (var8 != 0) {
                                          break L4;
                                        } else {
                                          L6: {
                                            if (!stackIn_26_0) {
                                              var5 = 0;
                                              if (var8 == 0) {
                                                break L6;
                                              } else {
                                                var5++;
                                                break L6;
                                              }
                                            } else {
                                              var5++;
                                              break L6;
                                            }
                                          }
                                          L7: {
                                            if ((var5 ^ -1) > -3) {
                                              break L7;
                                            } else {
                                              if (param0) {
                                                break L7;
                                              } else {
                                                stackOut_32_0 = 0;
                                                stackIn_33_0 = stackOut_32_0;
                                                decompiledRegionSelector0 = 5;
                                                break L0;
                                              }
                                            }
                                          }
                                          var6++;
                                          if (var8 == 0) {
                                            continue L3;
                                          } else {
                                            break L5;
                                          }
                                        }
                                      }
                                    }
                                    stackOut_35_0 = var5 ^ -1;
                                    stackIn_36_0 = stackOut_35_0;
                                    break L4;
                                  }
                                  if (stackIn_36_0 < -1) {
                                    stackOut_38_0 = 0;
                                    stackIn_39_0 = stackOut_38_0;
                                    decompiledRegionSelector0 = 6;
                                    break L0;
                                  } else {
                                    return true;
                                  }
                                }
                              } else {
                                break L2;
                              }
                            }
                          }
                          stackOut_21_0 = 0;
                          stackIn_22_0 = stackOut_21_0;
                          decompiledRegionSelector0 = 4;
                          break L0;
                        } else {
                          stackOut_16_0 = 1;
                          stackIn_17_0 = stackOut_16_0;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      } else {
                        return false;
                      }
                    }
                  }
                }
              }
              stackOut_8_0 = 0;
              stackIn_9_0 = stackOut_8_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var3 = decompiledCaughtException;
            stackOut_40_0 = (RuntimeException) (var3);
            stackOut_40_1 = new StringBuilder().append("vl.E(").append(param0).append(',');
            stackIn_42_0 = stackOut_40_0;
            stackIn_42_1 = stackOut_40_1;
            stackIn_41_0 = stackOut_40_0;
            stackIn_41_1 = stackOut_40_1;
            if (param1 == null) {
              stackOut_42_0 = (RuntimeException) ((Object) stackIn_42_0);
              stackOut_42_1 = (StringBuilder) ((Object) stackIn_42_1);
              stackOut_42_2 = "null";
              stackIn_43_0 = stackOut_42_0;
              stackIn_43_1 = stackOut_42_1;
              stackIn_43_2 = stackOut_42_2;
              break L8;
            } else {
              stackOut_41_0 = (RuntimeException) ((Object) stackIn_41_0);
              stackOut_41_1 = (StringBuilder) ((Object) stackIn_41_1);
              stackOut_41_2 = "{...}";
              stackIn_43_0 = stackOut_41_0;
              stackIn_43_1 = stackOut_41_1;
              stackIn_43_2 = stackOut_41_2;
              break L8;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_43_0), stackIn_43_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_9_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_14_0 != 0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_17_0 != 0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_22_0 != 0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_33_0 != 0;
                  } else {
                    return stackIn_39_0 != 0;
                  }
                }
              }
            }
          }
        }
    }

    private final void a(byte param0, uc param1) {
        synchronized (this.field_e) {
            this.field_e.a(-74, param1);
            this.field_b = this.field_b + 1;
            if (param0 != 68) {
                vl.b(58);
            }
            this.field_e.notifyAll();
        }
    }

    final uc a(int param0, eh param1, byte[] param2, int param3) {
        uc var5 = null;
        RuntimeException var5_ref = null;
        uc stackIn_1_0 = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        uc stackOut_0_0 = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            var5 = new uc();
            var5.field_n = false;
            var5.field_t = param3;
            var5.field_u = param2;
            var5.field_s = param1;
            var5.field_h = (long)param0;
            this.a((byte) 68, var5);
            stackOut_0_0 = (uc) (var5);
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) (var5_ref);
            stackOut_2_1 = new StringBuilder().append("vl.H(").append(param0).append(',');
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) ((Object) stackIn_3_0);
              stackOut_3_1 = (StringBuilder) ((Object) stackIn_3_1);
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ')');
        }
        return stackIn_1_0;
    }

    final static void a(int param0, int param1, vg param2) {
        RuntimeException runtimeException = null;
        vg var4 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        try {
          L0: {
            L1: {
              kk.field_X.a(-123, param2);
              bk.a(true, param0, param2);
              if (param1 == 10) {
                break L1;
              } else {
                var4 = (vg) null;
                vl.a(-76, -35, (vg) null);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("vl.C(").append(param0).append(',').append(param1).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void run() {
        try {
            boolean discarded$1 = false;
            InterruptedException interruptedException = null;
            Exception var2 = null;
            Object var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            String var6 = null;
            uc var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            var5 = OrbDefence.field_D ? 1 : 0;
            L0: while (true) {
              if (this.field_a) {
                return;
              } else {
                var2_ref = this.field_e;
                synchronized (var2_ref) {
                  L1: {
                    var7 = (uc) ((Object) this.field_e.c(30664));
                    if (var5 == 0) {
                      if (var7 != null) {
                        this.field_b = this.field_b - 1;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      } else {
                        try {
                          L2: {
                            this.field_e.wait();
                            break L2;
                          }
                        } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                          decompiledCaughtException = decompiledCaughtParameter0;
                          L3: {
                            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                            break L3;
                          }
                        }
                        decompiledRegionSelector0 = 0;
                        break L1;
                      }
                    } else {
                      return;
                    }
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  continue L0;
                } else {
                  try {
                    L4: {
                      L5: {
                        if (-3 != (var7.field_t ^ -1)) {
                          break L5;
                        } else {
                          discarded$1 = var7.field_s.a(var7.field_u, 255, var7.field_u.length, (int)var7.field_h);
                          if (var5 == 0) {
                            decompiledRegionSelector1 = 0;
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      if (-4 == (var7.field_t ^ -1)) {
                        var7.field_u = var7.field_s.a(520, (int)var7.field_h);
                        decompiledRegionSelector1 = 2;
                        break L4;
                      } else {
                        var7.field_l = false;
                        decompiledRegionSelector1 = 1;
                        break L4;
                      }
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L6: {
                      var2 = (Exception) (Object) decompiledCaughtException;
                      var6 = (String) null;
                      pe.a((byte) -13, (Throwable) ((Object) var2), (String) null);
                      decompiledRegionSelector1 = 0;
                      break L6;
                    }
                  }
                  if (decompiledRegionSelector1 == 0) {
                    var7.field_l = false;
                    continue L0;
                  } else {
                    if (decompiledRegionSelector1 == 1) {
                      continue L0;
                    } else {
                      var7.field_l = false;
                      continue L0;
                    }
                  }
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    vl(be param0) {
        RuntimeException runtimeException = null;
        eb var2 = null;
        int var3 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        var3 = OrbDefence.field_D ? 1 : 0;
        this.field_e = new il();
        this.field_a = false;
        this.field_b = 0;
        try {
          L0: {
            var2 = param0.a(314572800, 5, (Runnable) (this));
            L1: while (true) {
              L2: {
                L3: {
                  if (-1 != (var2.field_a ^ -1)) {
                    break L3;
                  } else {
                    hb.a(10L, 127);
                    if (var3 != 0) {
                      break L2;
                    } else {
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (2 != var2.field_a) {
                  this.field_c = (Thread) (var2.field_g);
                  break L0;
                } else {
                  break L2;
                }
              }
              throw new RuntimeException();
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) (runtimeException);
            stackOut_9_1 = new StringBuilder().append("vl.<init>(");
            stackIn_11_0 = stackOut_9_0;
            stackIn_11_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param0 == null) {
              stackOut_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackOut_11_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackOut_11_2 = "null";
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              stackIn_12_2 = stackOut_11_2;
              break L4;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_12_0 = stackOut_10_0;
              stackIn_12_1 = stackOut_10_1;
              stackIn_12_2 = stackOut_10_2;
              break L4;
            }
          }
          throw dd.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    static {
        field_d = 0;
    }
}
