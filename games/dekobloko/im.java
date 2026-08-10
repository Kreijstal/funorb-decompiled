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
        try {
            int var2 = 0;
            var2 = 53 % ((param0 - -50) / 38);
            this.field_a = true;
            synchronized (this.field_e) {
                this.field_e.notifyAll();
            }
            try {
                this.field_h.join();
            } catch (InterruptedException interruptedException) {
            }
            this.field_h = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(int param0) {
        field_g = null;
        if (param0 != 0) {
            return;
        }
        field_d = null;
        field_c = null;
        field_i = null;
        field_j = null;
    }

    final static void a(int param0, int param1, boolean param2, int param3) {
        ff.a(param2, 10891);
        if (param0 >= -87) {
          field_j = (String) null;
          gb.a(param3, param2, (byte) -126, param1);
          return;
        } else {
          gb.a(param3, param2, (byte) -126, param1);
          return;
        }
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            int var5 = 0;
            el var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            Exception var2_ref = null;
            String var6 = null;
            var5 = client.field_A ? 1 : 0;
            L0: while (true) {
              if (this.field_a) {
                return;
              } else {
                var2 = this.field_e;
                synchronized (var2) {
                  L1: {
                    var7 = (el) ((Object) this.field_e.a((byte) 79));
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
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  continue L0;
                } else {
                  try {
                    L4: {
                      L5: {
                        if (2 == var7.field_F) {
                          var7.field_K.a((byte) 43, var7.field_H, (int)var7.field_r, var7.field_H.length);
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
                      var6 = (String) null;
                      qb.a((Throwable) ((Object) var2_ref), 16408, (String) null);
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
        synchronized (this.field_e) {
            int var4 = 78 % ((param0 - -34) / 50);
            this.field_e.a(param1, -7267);
            this.field_b = this.field_b + 1;
            this.field_e.notifyAll();
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
        String var5 = null;
        el stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new el();
              var4.field_D = false;
              var4.field_F = 3;
              if (param2 == 61) {
                break L1;
              } else {
                var5 = (String) null;
                im.a(109, (String) null);
                break L1;
              }
            }
            var4.field_K = param1;
            var4.field_r = (long)param0;
            this.a((byte) -115, var4);
            stackIn_3_0 = (el) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("im.B(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    final el a(int param0, kh param1, byte[] param2, byte param3) {
        int var5_int = 0;
        RuntimeException var5 = null;
        el var6 = null;
        el stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_1_0 = (el) (var6);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var5);

            stackIn_4_1 = new StringBuilder().append("im.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "null";
              break L1;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackIn_5_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackIn_5_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',');

            if (param2 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L2;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L2;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_5_0), stackIn_8_2 + ',' + param3 + ')');
        }
        return stackIn_1_0;
    }

    final el a(int param0, kh param1, int param2) {
        el var4 = null;
        RuntimeException var4_ref = null;
        Object var5_ref_Object = null;
        int var5 = 0;
        el var6 = null;
        int var8 = 0;
        el stackIn_8_0 = null;
        el stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = client.field_A ? 1 : 0;
        try {
          L0: {
            var4 = new el();
            var4.field_F = 1;
            var5_ref_Object = this.field_e;
            synchronized (var5_ref_Object) {
              L1: {
                var6 = (el) ((Object) this.field_e.b(-2198));
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
                            stackIn_8_0 = (el) (var4);
                            return stackIn_8_0;
                          }
                        }
                      }
                    }
                    var6 = (el) ((Object) this.field_e.b((byte) 20));
                    continue L2;
                  }
                }
              }
            }
            var5 = 84 % ((param2 - 77) / 46);
            var4.field_H = param1.a(param0, (byte) 49);
            var4.field_z = false;
            var4.field_D = true;
            stackIn_15_0 = (el) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var4_ref);

            stackIn_18_1 = new StringBuilder().append("im.D(").append(param0).append(',');

            if (param1 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L4;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ',' + param2 + ')');
        }
        return stackIn_15_0;
    }

    im(fd param0) {
        mh var2 = null;
        this.field_e = new ab();
        this.field_b = 0;
        this.field_a = false;
        try {
            var2 = param0.a((byte) -104, 5, (Runnable) (this));
            while (0 == var2.field_c) {
                ua.a(10L, -128);
            }
            if (var2.field_c == 2) {
                throw new RuntimeException();
            }
            this.field_h = (Thread) (var2.field_b);
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "im.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Please wait while we search.<br>Games usually start within a minute, provided the server is busy enough.<br><br>The longer you are forced to wait, the earlier in the list of players you are likely to appear.<br><br>If the game doesn't start, click 'Cancel' and then try choosing 'Don't mind' for more options or switching to a busier lobby.";
        field_j = "From <%0>: ";
        field_g = "Options Menu";
        field_d = "Exploiting a bug";
    }
}
