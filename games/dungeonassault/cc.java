/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cc implements Runnable {
    static md field_i;
    private up field_h;
    static int field_d;
    static String[] field_e;
    private Thread field_g;
    static boolean field_c;
    int field_f;
    private boolean field_b;
    static String field_a;

    final co a(ln param0, int param1, int param2, byte[] param3) {
        co var5 = null;
        RuntimeException var5_ref = null;
        co stackIn_2_0 = null;
        co stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var5 = new co();
            var5.field_K = param0;
            var5.field_o = (long)param2;
            var5.field_L = 2;
            var5.field_D = param3;
            var5.field_B = false;
            if (param1 == 15958) {
              this.a((byte) 48, var5);
              stackIn_4_0 = (co) (var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (co) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5_ref);

            stackIn_7_1 = new StringBuilder().append("cc.C(");

            if (param0 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final co a(byte param0, ln param1, int param2) {
        co var4 = null;
        RuntimeException var4_ref = null;
        co stackIn_2_0 = null;
        co stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new co();
            var4.field_o = (long)param2;
            var4.field_B = false;
            var4.field_L = 3;
            if (param0 < -27) {
              var4.field_K = param1;
              this.a((byte) 21, var4);
              stackIn_4_0 = (co) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (co) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4_ref);

            stackIn_7_1 = new StringBuilder().append("cc.H(").append(param0).append(',');

            if (param1 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final static String a(char param0, int param1, int param2) {
        int var4 = 0;
        int var5 = DungeonAssault.field_K;
        char[] var6 = new char[param1];
        char[] var3 = var6;
        if (param2 != 10854) {
            return (String) null;
        }
        for (var4 = 0; var4 < param1; var4++) {
            var6[var4] = param0;
        }
        return new String(var6);
    }

    public static void b(int param0) {
        if (param0 > -76) {
            return;
        }
        field_a = null;
        field_e = null;
        field_i = null;
    }

    private final void a(byte param0, co param1) {
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Object var3 = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            var3 = this.field_h;
            synchronized (var3) {
              L1: {
                L2: {
                  this.field_h.a(param1, -32711);
                  this.field_f = this.field_f + 1;
                  this.field_h.notifyAll();
                  if (param0 > 1) {
                    break L2;
                  } else {
                    field_e = (String[]) null;
                    break L2;
                  }
                }
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("cc.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    final void a(int param0) {
        try {
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            InterruptedException var2_ref = null;
            this.field_b = true;
            var2 = this.field_h;
            synchronized (var2) {
              L0: {
                this.field_h.notifyAll();
                break L0;
              }
            }
            try {
              L1: {
                L2: {
                  this.field_g.join();
                  if (param0 < -49) {
                    break L2;
                  } else {
                    field_i = (md) null;
                    break L2;
                  }
                }
                break L1;
              }
            } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L3: {
                var2_ref = (InterruptedException) (Object) decompiledCaughtException;
                break L3;
              }
            }
            this.field_g = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static int a(int param0, int param1, byte param2) {
        if (param2 > -32) {
            cc.a(21, 83, (byte) -84);
        }
        int var3 = param1 >> 867839039 & param0 - 1;
        return ((param1 >>> 1873545247) + param1) % param0 - -var3;
    }

    final co a(ln param0, int param1, int param2) {
        co var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        co var6 = null;
        int var8 = 0;
        co var9 = null;
        co stackIn_11_0 = null;
        co stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              var4 = new co();
              var4.field_L = 1;
              if (param2 == -6319) {
                break L1;
              } else {
                var9 = (co) null;
                this.a((byte) 29, (co) null);
                break L1;
              }
            }
            var5 = this.field_h;
            synchronized (var5) {
              L2: {
                var6 = (co) ((Object) this.field_h.c(13395));
                L3: while (true) {
                  if (var6 == null) {
                    break L2;
                  } else {
                    L4: {
                      if ((long)param1 != var6.field_o) {
                        break L4;
                      } else {
                        if (param0 != var6.field_K) {
                          break L4;
                        } else {
                          if ((var6.field_L ^ -1) == -3) {
                            var4.field_v = false;
                            var4.field_D = var6.field_D;
                            stackIn_11_0 = (co) (var4);
                            return stackIn_11_0;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var6 = (co) ((Object) this.field_h.a((byte) 72));
                    continue L3;
                  }
                }
              }
            }
            var4.field_D = param0.a(param1, 44);
            var4.field_B = true;
            var4.field_v = false;
            stackIn_18_0 = (co) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4_ref);

            stackIn_21_1 = new StringBuilder().append("cc.D(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L5;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L5;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_18_0;
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            int var5 = 0;
            co var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            String var6 = null;
            var5 = DungeonAssault.field_K;
            L0: while (true) {
              if (this.field_b) {
                return;
              } else {
                var2 = this.field_h;
                synchronized (var2) {
                  L1: {
                    var7 = (co) ((Object) this.field_h.a(120));
                    if (var7 == null) {
                      try {
                        L2: {
                          this.field_h.wait();
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
                    } else {
                      this.field_f = this.field_f - 1;
                      decompiledRegionSelector0 = 1;
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
                        if ((var7.field_L ^ -1) == -3) {
                          var7.field_K.a(var7.field_D, (int)var7.field_o, var7.field_D.length, -29447);
                          var7.field_v = false;
                          break L5;
                        } else {
                          if (-4 != (var7.field_L ^ -1)) {
                            decompiledRegionSelector1 = 0;
                            break L4;
                          } else {
                            var7.field_D = var7.field_K.a((int)var7.field_o, 112);
                            var7.field_v = false;
                            break L5;
                          }
                        }
                      }
                      decompiledRegionSelector1 = 1;
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L6: {
                      var2_ref = (Exception) (Object) decompiledCaughtException;
                      var6 = (String) null;
                      sm.a((Throwable) ((Object) var2_ref), 1, (String) null);
                      decompiledRegionSelector1 = 0;
                      break L6;
                    }
                  }
                  if (decompiledRegionSelector1 == 0) {
                    var7.field_v = false;
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

    cc(qg param0) {
        pn var2 = null;
        this.field_h = new up();
        this.field_f = 0;
        this.field_b = false;
        try {
            var2 = param0.a(-21432, 5, (Runnable) (this));
            while (var2.field_c == 0) {
                pj.a(0, 10L);
            }
            if ((var2.field_c ^ -1) == -3) {
                throw new RuntimeException();
            }
            this.field_g = (Thread) (var2.field_f);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "cc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = 0;
        field_i = new md();
        field_c = false;
        field_a = "Banshee";
    }
}
