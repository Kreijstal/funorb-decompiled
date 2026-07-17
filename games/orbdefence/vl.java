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
        uc stackIn_11_0 = null;
        uc stackIn_18_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        uc stackOut_10_0 = null;
        uc stackOut_17_0 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
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
            var5 = (Object) (Object) ((vl) this).field_e;
            synchronized (var5) {
              L2: {
                var6 = (uc) (Object) ((vl) this).field_e.b((byte) 46);
                L3: while (true) {
                  if (var6 == null) {
                    break L2;
                  } else {
                    L4: {
                      if ((long)param1 != var6.field_h) {
                        break L4;
                      } else {
                        if (var6.field_s != param0) {
                          break L4;
                        } else {
                          if (var6.field_t == 2) {
                            var4.field_u = var6.field_u;
                            var4.field_l = false;
                            stackOut_10_0 = (uc) var4;
                            stackIn_11_0 = stackOut_10_0;
                            return stackIn_11_0;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var6 = (uc) (Object) ((vl) this).field_e.b(0);
                    continue L3;
                  }
                }
              }
            }
            var4.field_u = param0.a(520, param1);
            var4.field_n = true;
            var4.field_l = false;
            stackOut_17_0 = (uc) var4;
            stackIn_18_0 = stackOut_17_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_19_0 = (RuntimeException) var4_ref;
            stackOut_19_1 = new StringBuilder().append("vl.G(");
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param0 == null) {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L5;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_18_0;
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
            stackOut_2_0 = (uc) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("vl.A(").append(param0).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param2 + 41);
        }
        return stackIn_3_0;
    }

    public static void b(int param0) {
        field_g = null;
        if (param0 >= -88) {
            Object var2 = null;
            boolean discarded$0 = vl.a(false, (CharSequence) null, 95);
        }
    }

    final void a(int param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        ((vl) this).field_a = true;
        var2 = (Object) (Object) ((vl) this).field_e;
        synchronized (var2) {
          L0: {
            ((Object) (Object) ((vl) this).field_e).notifyAll();
            break L0;
          }
        }
        try {
          L1: {
            ((vl) this).field_c.join();
            break L1;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
            break L2;
          }
        }
        L3: {
          if (param0 == -31973) {
            break L3;
          } else {
            ((vl) this).run();
            break L3;
          }
        }
        ((vl) this).field_c = null;
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
        int stackIn_31_0 = 0;
        int stackIn_36_0 = 0;
        RuntimeException stackIn_38_0 = null;
        StringBuilder stackIn_38_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_35_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_8_0 = 0;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_38_0 = null;
        StringBuilder stackOut_38_1 = null;
        String stackOut_38_2 = null;
        var8 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            if (param1 == null) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0 != 0;
            } else {
              L1: {
                var3_int = param1.length();
                if (var3_int < 1) {
                  break L1;
                } else {
                  if (var3_int > 12) {
                    break L1;
                  } else {
                    var4 = ua.a(123, param1);
                    if (var4 == null) {
                      stackOut_13_0 = 0;
                      stackIn_14_0 = stackOut_13_0;
                      return stackIn_14_0 != 0;
                    } else {
                      if (var4.length() >= 1) {
                        if (param2 <= -119) {
                          L2: {
                            if (sk.a(var4.charAt(0), -46)) {
                              break L2;
                            } else {
                              if (!sk.a(var4.charAt(var4.length() - 1), -46)) {
                                var5 = 0;
                                var6 = 0;
                                L3: while (true) {
                                  if (var6 >= param1.length()) {
                                    if (var5 > 0) {
                                      stackOut_35_0 = 0;
                                      stackIn_36_0 = stackOut_35_0;
                                      break L0;
                                    } else {
                                      return true;
                                    }
                                  } else {
                                    L4: {
                                      var7 = param1.charAt(var6);
                                      if (sk.a((char) var7, -46)) {
                                        var5++;
                                        break L4;
                                      } else {
                                        var5 = 0;
                                        break L4;
                                      }
                                    }
                                    L5: {
                                      if (var5 < 2) {
                                        break L5;
                                      } else {
                                        if (param0) {
                                          break L5;
                                        } else {
                                          stackOut_30_0 = 0;
                                          stackIn_31_0 = stackOut_30_0;
                                          return stackIn_31_0 != 0;
                                        }
                                      }
                                    }
                                    var6++;
                                    continue L3;
                                  }
                                }
                              } else {
                                break L2;
                              }
                            }
                          }
                          stackOut_21_0 = 0;
                          stackIn_22_0 = stackOut_21_0;
                          return stackIn_22_0 != 0;
                        } else {
                          stackOut_16_0 = 1;
                          stackIn_17_0 = stackOut_16_0;
                          return stackIn_17_0 != 0;
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
              return stackIn_9_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackOut_37_0 = (RuntimeException) var3;
            stackOut_37_1 = new StringBuilder().append("vl.E(").append(param0).append(44);
            stackIn_39_0 = stackOut_37_0;
            stackIn_39_1 = stackOut_37_1;
            stackIn_38_0 = stackOut_37_0;
            stackIn_38_1 = stackOut_37_1;
            if (param1 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L6;
            } else {
              stackOut_38_0 = (RuntimeException) (Object) stackIn_38_0;
              stackOut_38_1 = (StringBuilder) (Object) stackIn_38_1;
              stackOut_38_2 = "{...}";
              stackIn_40_0 = stackOut_38_0;
              stackIn_40_1 = stackOut_38_1;
              stackIn_40_2 = stackOut_38_2;
              break L6;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + 44 + param2 + 41);
        }
        return stackIn_36_0 != 0;
    }

    private final void a(byte param0, uc param1) {
        Object var3 = null;
        RuntimeException var3_ref = null;
        Throwable var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            var3 = (Object) (Object) ((vl) this).field_e;
            synchronized (var3) {
              L1: {
                L2: {
                  ((vl) this).field_e.a(-74, (o) (Object) param1);
                  ((vl) this).field_b = ((vl) this).field_b + 1;
                  if (param0 == 68) {
                    break L2;
                  } else {
                    vl.b(58);
                    break L2;
                  }
                }
                ((Object) (Object) ((vl) this).field_e).notifyAll();
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) var3_ref;
            stackOut_8_1 = new StringBuilder().append("vl.B(").append(param0).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
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
            stackOut_0_0 = (uc) var5;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5_ref;
            stackOut_2_1 = new StringBuilder().append("vl.H(").append(param0).append(44);
            stackIn_4_0 = stackOut_2_0;
            stackIn_4_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param1 == null) {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "null";
              stackIn_5_0 = stackOut_4_0;
              stackIn_5_1 = stackOut_4_1;
              stackIn_5_2 = stackOut_4_2;
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_5_0 = stackOut_3_0;
              stackIn_5_1 = stackOut_3_1;
              stackIn_5_2 = stackOut_3_2;
              break L1;
            }
          }
          L2: {
            stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(44);
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param2 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param3 + 41);
        }
        return stackIn_1_0;
    }

    final static void a(int param0, int param1, vg param2) {
        RuntimeException runtimeException = null;
        Object var4 = null;
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
              kk.field_X.a(-123, (ca) (Object) param2);
              bk.a(true, param0, param2);
              if (param1 == 10) {
                break L1;
              } else {
                var4 = null;
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
            stackOut_3_0 = (RuntimeException) runtimeException;
            stackOut_3_1 = new StringBuilder().append("vl.C(").append(param0).append(44).append(param1).append(44);
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param2 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) (Object) stackIn_4_0;
              stackOut_4_1 = (StringBuilder) (Object) stackIn_4_1;
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final void run() {
        try {
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            uc var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            var5 = OrbDefence.field_D ? 1 : 0;
            L0: while (true) {
              if (((vl) this).field_a) {
                return;
              } else {
                var2 = (Object) (Object) ((vl) this).field_e;
                synchronized (var2) {
                  L1: {
                    var7 = (uc) (Object) ((vl) this).field_e.c(30664);
                    if (var7 != null) {
                      ((vl) this).field_b = ((vl) this).field_b - 1;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      {
                        L2: {
                          ((Object) (Object) ((vl) this).field_e).wait();
                          break L2;
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    }
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  continue L0;
                } else {
                  try {
                    L4: {
                      L5: {
                        if (var7.field_t != 2) {
                          if (var7.field_t == 3) {
                            var7.field_u = var7.field_s.a(520, (int)var7.field_h);
                            decompiledRegionSelector1 = 1;
                            break L4;
                          } else {
                            var7.field_l = false;
                            break L5;
                          }
                        } else {
                          boolean discarded$1 = var7.field_s.a(var7.field_u, 255, var7.field_u.length, (int)var7.field_h);
                          var7.field_l = false;
                          break L5;
                        }
                      }
                      decompiledRegionSelector1 = 0;
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L6: {
                      var2_ref = (Exception) (Object) decompiledCaughtException;
                      var6 = null;
                      pe.a((byte) -13, (Throwable) (Object) var2_ref, (String) null);
                      decompiledRegionSelector1 = 1;
                      break L6;
                    }
                  }
                  if (decompiledRegionSelector1 == 0) {
                    continue L0;
                  } else {
                    var7.field_l = false;
                    continue L0;
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
        eb var2 = null;
        ((vl) this).field_e = new il();
        ((vl) this).field_a = false;
        ((vl) this).field_b = 0;
        try {
            var2 = param0.a(314572800, 5, (Runnable) this);
            while (var2.field_a == 0) {
                hb.a(10L, 127);
            }
            if (2 == var2.field_a) {
                throw new RuntimeException();
            }
            ((vl) this).field_c = (Thread) var2.field_g;
        } catch (RuntimeException runtimeException) {
            throw dd.a((Throwable) (Object) runtimeException, "vl.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0;
    }
}
