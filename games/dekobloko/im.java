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
          ((Object) (Object) ((im) this).field_e).notifyAll();
        }
        try {
          ((im) this).field_h.join();
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          interruptedException = (InterruptedException) (Object) decompiledCaughtException;
        }
        ((im) this).field_h = null;
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
            InterruptedException interruptedException = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            el var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            var5 = client.field_A ? 1 : 0;
            L0: while (true) {
              if (((im) this).field_a) {
                return;
              } else {
                var2 = (Object) (Object) ((im) this).field_e;
                synchronized (var2) {
                  var7 = (el) (Object) ((im) this).field_e.a((byte) 79);
                  if (var7 != null) {
                    ((im) this).field_b = ((im) this).field_b - 1;
                    decompiledRegionSelector0 = 1;
                  } else {
                    try {
                      ((Object) (Object) ((im) this).field_e).wait();
                    } catch (java.lang.InterruptedException decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      interruptedException = (InterruptedException) (Object) decompiledCaughtException;
                    }
                    decompiledRegionSelector0 = 0;
                  }
                }
                if (decompiledRegionSelector0 == 0) {
                  continue L0;
                } else {
                  try {
                    if (2 == var7.field_F) {
                      decompiledRegionSelector1 = 0;
                    } else {
                      decompiledRegionSelector1 = 1;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    var2_ref = (Exception) (Object) decompiledCaughtException;
                    var6 = null;
                    qb.a((Throwable) (Object) var2_ref, 16408, (String) null);
                    var7.field_z = false;
                    decompiledRegionSelector1 = 2;
                  }
                  if (decompiledRegionSelector1 == 0) {
                    boolean discarded$1 = var7.field_K.a((byte) 43, var7.field_H, (int)var7.field_r, var7.field_H.length);
                    var7.field_z = false;
                    continue L0;
                  } else {
                    if (decompiledRegionSelector1 == 1) {
                      if (3 == var7.field_F) {
                        var7.field_H = var7.field_K.a((int)var7.field_r, (byte) 117);
                        var7.field_z = false;
                        continue L0;
                      } else {
                        var7.field_z = false;
                        continue L0;
                      }
                    } else {
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

    private final void a(byte param0, el param1) {
        Object var3 = null;
        int var4 = 0;
        Throwable var5 = null;
        Throwable decompiledCaughtException = null;
        var3 = (Object) (Object) ((im) this).field_e;
        synchronized (var3) {
          var4 = 78 % ((param0 - -34) / 50);
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
        Object var5 = null;
        var4 = new el();
        var4.field_D = false;
        var4.field_F = 3;
        if (param2 != 61) {
          var5 = null;
          im.a(109, (String) null);
          var4.field_K = param1;
          var4.field_r = (long)param0;
          this.a((byte) -115, var4);
          return var4;
        } else {
          var4.field_K = param1;
          var4.field_r = (long)param0;
          this.a((byte) -115, var4);
          return var4;
        }
    }

    final el a(int param0, kh param1, byte[] param2, byte param3) {
        int var5 = 63 / ((-8 - param3) / 56);
        el var6 = new el();
        var6.field_D = false;
        var6.field_F = 2;
        var6.field_r = (long)param0;
        var6.field_K = param1;
        var6.field_H = param2;
        this.a((byte) -121, var6);
        return var6;
    }

    final el a(int param0, kh param1, int param2) {
        el var4 = null;
        Object var5_ref_Object = null;
        int var5 = 0;
        el var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        el stackIn_7_0 = null;
        Throwable decompiledCaughtException = null;
        el stackOut_6_0 = null;
        var8 = client.field_A ? 1 : 0;
        var4 = new el();
        var4.field_F = 1;
        var5_ref_Object = (Object) (Object) ((im) this).field_e;
        synchronized (var5_ref_Object) {
          var6 = (el) (Object) ((im) this).field_e.b(-2198);
          L0: while (true) {
            if (var6 == null) {
              break L0;
            } else {
              L1: {
                if (var6.field_r != (long)param0) {
                  break L1;
                } else {
                  if (param1 != var6.field_K) {
                    break L1;
                  } else {
                    if (2 != var6.field_F) {
                      break L1;
                    } else {
                      var4.field_H = var6.field_H;
                      var4.field_z = false;
                      stackOut_6_0 = (el) var4;
                      stackIn_7_0 = stackOut_6_0;
                      return stackIn_7_0;
                    }
                  }
                }
              }
              var6 = (el) (Object) ((im) this).field_e.b((byte) 20);
              continue L0;
            }
          }
        }
        var5 = 84 % ((param2 - 77) / 46);
        var4.field_H = param1.a(param0, (byte) 49);
        var4.field_z = false;
        var4.field_D = true;
        return var4;
    }

    im(fd param0) {
        ((im) this).field_e = new ab();
        ((im) this).field_b = 0;
        ((im) this).field_a = false;
        mh var2 = param0.a((byte) -104, 5, (Runnable) this);
        while (0 == var2.field_c) {
            ua.a(10L, -128);
        }
        if (var2.field_c == 2) {
            throw new RuntimeException();
        }
        ((im) this).field_h = (Thread) var2.field_b;
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
