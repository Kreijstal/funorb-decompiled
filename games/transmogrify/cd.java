/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cd implements Runnable {
    static int field_b;
    static pg field_f;
    private bk field_c;
    private Thread field_a;
    int field_e;
    private boolean field_d;

    final cl a(int param0, ak param1, byte param2) {
        cl var4 = null;
        RuntimeException var4_ref = null;
        cl stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        cl stackOut_2_0 = null;
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
              var4 = new cl();
              var4.field_p = false;
              var4.field_C = param1;
              var4.field_z = 3;
              var4.field_j = (long)param0;
              if (param2 == 67) {
                break L1;
              } else {
                this.field_c = (bk) null;
                break L1;
              }
            }
            this.a(param2 + -4641, var4);
            stackOut_2_0 = (cl) (var4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var4_ref);
            stackOut_4_1 = new StringBuilder().append("cd.F(").append(param0).append(',');
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
          throw ch.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final void c(int param0) {
        try {
            this.field_d = true;
            synchronized (this.field_c) {
                this.field_c.notifyAll();
            }
            if (param0 != -20444) {
                return;
            }
            try {
                this.field_a.join();
            } catch (InterruptedException interruptedException) {
            }
            this.field_a = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static ti a(int param0, int param1, byte param2) {
        String discarded$5 = null;
        ti var3 = null;
        int var4 = 0;
        int var5 = 0;
        ti stackIn_6_0 = null;
        ti stackIn_8_0 = null;
        ti stackIn_13_0 = null;
        ti stackIn_14_0 = null;
        ti stackOut_12_0 = null;
        ti stackOut_5_0 = null;
        var5 = Transmogrify.field_A ? 1 : 0;
        var3 = new ti(param1, param1);
        if (param2 < -18) {
          var4 = 0;
          L0: while (true) {
            if (var4 < var3.field_w.length) {
              stackOut_12_0 = (ti) (var3);
              stackIn_14_0 = stackOut_12_0;
              stackIn_13_0 = stackOut_12_0;
              if (var5 == 0) {
                stackIn_14_0.field_w[var4] = param0;
                var4++;
                continue L0;
              } else {
                return stackIn_13_0;
              }
            } else {
              return var3;
            }
          }
        } else {
          discarded$5 = cd.b(92);
          var4 = 0;
          L1: while (true) {
            if (var4 < var3.field_w.length) {
              stackOut_5_0 = (ti) (var3);
              stackIn_8_0 = stackOut_5_0;
              stackIn_6_0 = stackOut_5_0;
              if (var5 != 0) {
                return stackIn_8_0;
              } else {
                stackIn_6_0.field_w[var4] = param0;
                var4++;
                continue L1;
              }
            } else {
              return var3;
            }
          }
        }
    }

    private final void a(int param0, cl param1) {
        ti discarded$2 = null;
        RuntimeException var3 = null;
        Object var3_ref = null;
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
            var3_ref = this.field_c;
            synchronized (var3_ref) {
              L1: {
                this.field_c.a((byte) -128, param1);
                this.field_e = this.field_e + 1;
                this.field_c.notifyAll();
                break L1;
              }
            }
            if (param0 == -4574) {
              break L0;
            } else {
              discarded$2 = cd.a(3, 60, (byte) 39);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_8_0 = (RuntimeException) (var3);
            stackOut_8_1 = new StringBuilder().append("cd.C(").append(param0).append(',');
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 < 5) {
            cd.a(-105);
            field_f = null;
            return;
        }
        field_f = null;
    }

    final cl a(ak param0, byte[] param1, int param2, int param3) {
        cl var5 = null;
        RuntimeException var5_ref = null;
        cl stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        cl stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        try {
          L0: {
            L1: {
              var5 = new cl();
              var5.field_j = (long)param3;
              if (param2 <= -76) {
                break L1;
              } else {
                field_f = (pg) null;
                break L1;
              }
            }
            var5.field_C = param0;
            var5.field_p = false;
            var5.field_z = 2;
            var5.field_B = param1;
            this.a(-4574, var5);
            stackOut_2_0 = (cl) (var5);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) (var5_ref);
            stackOut_4_1 = new StringBuilder().append("cd.H(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
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
          L3: {
            stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param1 == null) {
              stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackOut_9_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final cl a(ak param0, int param1, boolean param2) {
        cl var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        cl var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        cl stackIn_5_0 = null;
        cl stackIn_10_0 = null;
        cl stackIn_17_0 = null;
        cl stackIn_18_0 = null;
        cl stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        cl stackIn_20_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        cl stackOut_4_0 = null;
        cl stackOut_9_0 = null;
        cl stackOut_16_0 = null;
        cl stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        cl stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        cl stackOut_19_0 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            var4 = new cl();
            var4.field_z = 1;
            var5 = this.field_c;
            synchronized (var5) {
              L1: {
                var6 = (cl) ((Object) this.field_c.b((byte) 114));
                L2: while (true) {
                  L3: {
                    if (var6 == null) {
                      break L3;
                    } else {
                      stackOut_4_0 = (cl) (var6);
                      stackIn_20_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var8 != 0) {
                        decompiledRegionSelector0 = 0;
                        break L1;
                      } else {
                        L4: {
                          if ((stackIn_5_0.field_j ^ -1L) != ((long)param1 ^ -1L)) {
                            break L4;
                          } else {
                            if (param0 != var6.field_C) {
                              break L4;
                            } else {
                              if (var6.field_z == 2) {
                                var4.field_B = var6.field_B;
                                var4.field_m = false;
                                stackOut_9_0 = (cl) (var4);
                                stackIn_10_0 = stackOut_9_0;
                                return stackIn_10_0;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        var6 = (cl) ((Object) this.field_c.a(108));
                        if (var8 == 0) {
                          continue L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L1;
                }
              }
            }
            L5: {
              if (decompiledRegionSelector0 == 0) {
                break L5;
              } else {
                L6: {
                  var4.field_B = param0.b(-88, param1);
                  var4.field_m = false;
                  stackOut_16_0 = (cl) (var4);
                  stackIn_18_0 = stackOut_16_0;
                  stackIn_17_0 = stackOut_16_0;
                  if (!param2) {
                    stackOut_18_0 = (cl) ((Object) stackIn_18_0);
                    stackOut_18_1 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    stackIn_19_1 = stackOut_18_1;
                    break L6;
                  } else {
                    stackOut_17_0 = (cl) ((Object) stackIn_17_0);
                    stackOut_17_1 = 1;
                    stackIn_19_0 = stackOut_17_0;
                    stackIn_19_1 = stackOut_17_1;
                    break L6;
                  }
                }
                stackIn_19_0.field_p = stackIn_19_1 != 0;
                stackOut_19_0 = (cl) (var4);
                stackIn_20_0 = stackOut_19_0;
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) (var4_ref);
            stackOut_21_1 = new StringBuilder().append("cd.A(");
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackOut_22_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L7;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_20_0;
    }

    final static String b(int param0) {
        int var1 = 0;
        var1 = -99 / ((-15 - param0) / 46);
        if (rh.field_v != of.field_d) {
          if (db.field_a == of.field_d) {
            return jh.field_g;
          } else {
            if (!dl.field_l.b(-26753)) {
              return jh.field_g;
            } else {
              return ob.field_F;
            }
          }
        } else {
          return kk.field_g;
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
            cl var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            var5 = Transmogrify.field_A ? 1 : 0;
            L0: while (true) {
              if (this.field_d) {
                return;
              } else {
                var2_ref = this.field_c;
                synchronized (var2_ref) {
                  L1: {
                    var7 = (cl) ((Object) this.field_c.d(-31914));
                    if (var5 == 0) {
                      L2: {
                        if (var7 == null) {
                          break L2;
                        } else {
                          this.field_e = this.field_e - 1;
                          if (var5 == 0) {
                            decompiledRegionSelector0 = 1;
                            break L1;
                          } else {
                            break L2;
                          }
                        }
                      }
                      try {
                        L3: {
                          this.field_c.wait();
                          break L3;
                        }
                      } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L4: {
                          interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                          break L4;
                        }
                      }
                      decompiledRegionSelector0 = 0;
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  continue L0;
                } else {
                  try {
                    L5: {
                      L6: {
                        if (-3 == (var7.field_z ^ -1)) {
                          break L6;
                        } else {
                          L7: {
                            if (3 != var7.field_z) {
                              break L7;
                            } else {
                              var7.field_B = var7.field_C.b(-80, (int)var7.field_j);
                              if (var5 == 0) {
                                break L7;
                              } else {
                                break L6;
                              }
                            }
                          }
                          decompiledRegionSelector1 = 0;
                          break L5;
                        }
                      }
                      discarded$1 = var7.field_C.a(true, (int)var7.field_j, var7.field_B, var7.field_B.length);
                      var7.field_m = false;
                      decompiledRegionSelector1 = 1;
                      break L5;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L8: {
                      var2 = (Exception) (Object) decompiledCaughtException;
                      var6 = (String) null;
                      d.a((Throwable) ((Object) var2), 100, (String) null);
                      decompiledRegionSelector1 = 0;
                      break L8;
                    }
                  }
                  if (decompiledRegionSelector1 == 0) {
                    var7.field_m = false;
                    continue L0;
                  } else {
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

    cd(fe param0) {
        RuntimeException runtimeException = null;
        ib var2 = null;
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
        var3 = Transmogrify.field_A ? 1 : 0;
        this.field_c = new bk();
        this.field_d = false;
        this.field_e = 0;
        try {
          L0: {
            var2 = param0.a((Runnable) (this), 5, 65535);
            L1: while (true) {
              L2: {
                L3: {
                  if (-1 != (var2.field_c ^ -1)) {
                    break L3;
                  } else {
                    pg.a(10L, -95);
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
                if (-3 != (var2.field_c ^ -1)) {
                  this.field_a = (Thread) (var2.field_g);
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
            stackOut_9_1 = new StringBuilder().append("cd.<init>(");
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
          throw ch.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    static {
        field_b = 640;
    }
}
