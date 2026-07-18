/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class im implements Runnable {
    static String field_c;
    private ab field_e;
    static boolean field_f;
    static String field_d;
    static ck[] field_i;
    private Thread field_h;
    static String field_g;
    int field_b;
    private boolean field_a;
    static String field_j;

    final void a(byte param0) {
        InterruptedException interruptedException = null;
        int var2 = 0;
        Object var3 = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        var2 = 53 % ((param0 - -50) / 38);
        ((im) this).field_a = true;
        var3 = (Object) (Object) ((im) this).field_e;
        synchronized (var3) {
          L0: {
            ((Object) (Object) ((im) this).field_e).notifyAll();
            break L0;
          }
        }
        try {
          L1: {
            ((im) this).field_h.join();
            break L1;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
            break L2;
          }
        }
        ((im) this).field_h = null;
    }

    public static void a(int param0) {
        field_g = null;
        field_d = null;
        field_c = null;
        field_i = null;
        field_j = null;
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        ff.a(param2, 10891);
        if (param0 >= -87) {
          field_j = null;
          gb.a(param3, param2, (byte) -126, param1);
          return;
        } else {
          gb.a(param3, param2, (byte) -126, param1);
          return;
        }
    }

    public final void run() {
        try {
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            el var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var5 = client.field_A ? 1 : 0;
            L0: while (true) {
              if (((im) this).field_a) {
                return;
              } else {
                var2 = (Object) (Object) ((im) this).field_e;
                synchronized (var2) {
                  L1: {
                    var7 = (el) (Object) ((im) this).field_e.a((byte) 79);
                    if (var7 != null) {
                      ((im) this).field_b = ((im) this).field_b - 1;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      {
                        L2: {
                          ((Object) (Object) ((im) this).field_e).wait();
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
                        if (2 == var7.field_F) {
                          boolean discarded$1 = var7.field_K.a((byte) 43, var7.field_H, (int)var7.field_r, var7.field_H.length);
                          var7.field_z = false;
                          break L5;
                        } else {
                          if (3 == var7.field_F) {
                            var7.field_H = var7.field_K.a((int)var7.field_r, (byte) 117);
                            var7.field_z = false;
                            break L5;
                          } else {
                            var7.field_z = false;
                            break L5;
                          }
                        }
                      }
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L6: {
                      var2_ref = (Exception) (Object) decompiledCaughtException;
                      var6 = null;
                      qb.a((Throwable) (Object) var2_ref, 16408, (String) null);
                      var7.field_z = false;
                      break L6;
                    }
                  }
                  continue L0;
                }
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(byte param0, el param1) {
        synchronized (((im) this).field_e) {
            int var4 = 78 % ((param0 - -34) / 50);
            ((im) this).field_e.a((be) (Object) param1, -7267);
            ((im) this).field_b = ((im) this).field_b + 1;
            ((Object) (Object) ((im) this).field_e).notifyAll();
        }
    }

    final static void a(int param0, String param1) {
        System.out.println("Error: " + bh.a(0, param1, "\n", "%0a"));
        if (param0 != 18239) {
            im.a(56, -121, true, -33);
        }
    }

    final el a(int param0, kh param1, byte param2) {
        el var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        el stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        el stackOut_2_0 = null;
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
              var4 = new el();
              var4.field_D = false;
              var4.field_F = 3;
              if (param2 == 61) {
                break L1;
              } else {
                var5 = null;
                im.a(109, (String) null);
                break L1;
              }
            }
            var4.field_K = param1;
            var4.field_r = (long)param0;
            this.a((byte) -115, var4);
            stackOut_2_0 = (el) var4;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var4_ref;
            stackOut_4_1 = new StringBuilder().append("im.B(").append(param0).append(',');
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
          throw dh.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final el a(int param0, kh param1, byte[] param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        el var6 = null;
        el stackIn_1_0 = null;
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
        el stackOut_0_0 = null;
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
            var5_int = 63 / ((-8 - param3) / 56);
            var6 = new el();
            var6.field_D = false;
            var6.field_F = 2;
            var6.field_r = (long)param0;
            var6.field_K = param1;
            var6.field_H = param2;
            this.a((byte) -121, var6);
            stackOut_0_0 = (el) var6;
            stackIn_1_0 = stackOut_0_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) var5;
            stackOut_2_1 = new StringBuilder().append("im.A(").append(param0).append(',');
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
            stackOut_5_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');
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
          throw dh.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + ',' + param3 + ')');
        }
        return stackIn_1_0;
    }

    final el a(int param0, kh param1, int param2) {
        el var4 = null;
        RuntimeException var4_ref = null;
        Object var5_ref_Object = null;
        int var5 = 0;
        el var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        el stackIn_8_0 = null;
        el stackIn_15_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        Throwable decompiledCaughtException = null;
        el stackOut_7_0 = null;
        el stackOut_14_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            var4 = new el();
            var4.field_F = 1;
            var5_ref_Object = (Object) (Object) ((im) this).field_e;
            synchronized (var5_ref_Object) {
              L1: {
                var6 = (el) (Object) ((im) this).field_e.b(-2198);
                L2: while (true) {
                  if (var6 == null) {
                    break L1;
                  } else {
                    L3: {
                      if (var6.field_r != (long)param0) {
                        break L3;
                      } else {
                        if (param1 != var6.field_K) {
                          break L3;
                        } else {
                          if (2 != var6.field_F) {
                            break L3;
                          } else {
                            var4.field_H = var6.field_H;
                            var4.field_z = false;
                            stackOut_7_0 = (el) var4;
                            stackIn_8_0 = stackOut_7_0;
                            return stackIn_8_0;
                          }
                        }
                      }
                    }
                    var6 = (el) (Object) ((im) this).field_e.b((byte) 20);
                    continue L2;
                  }
                }
              }
            }
            var5 = 84 % ((param2 - 77) / 46);
            var4.field_H = param1.a(param0, (byte) 49);
            var4.field_z = false;
            var4.field_D = true;
            stackOut_14_0 = (el) var4;
            stackIn_15_0 = stackOut_14_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) var4_ref;
            stackOut_16_1 = new StringBuilder().append("im.D(").append(param0).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L4;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L4;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ',' + param2 + ')');
        }
        return stackIn_15_0;
    }

    im(fd param0) {
        mh var2 = null;
        ((im) this).field_e = new ab();
        ((im) this).field_b = 0;
        ((im) this).field_a = false;
        try {
            var2 = param0.a((byte) -104, 5, (Runnable) this);
            while (0 == var2.field_c) {
                ua.a(10L, -128);
            }
            if (var2.field_c == 2) {
                throw new RuntimeException();
            }
            ((im) this).field_h = (Thread) var2.field_b;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "im.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_j = "From <%0>: ";
        field_g = "Options Menu";
        field_d = "Exploiting a bug";
    }
}
