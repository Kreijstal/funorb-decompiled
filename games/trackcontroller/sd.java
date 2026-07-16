/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sd implements Runnable {
    static int field_b;
    private mb field_f;
    static il field_c;
    private boolean field_g;
    static int[] field_d;
    int field_a;
    private Thread field_e;

    final lh a(boolean param0, int param1, hf param2) {
        lh var4 = new lh();
        var4.field_A = param2;
        var4.field_m = (long)param1;
        var4.field_y = 3;
        if (!param0) {
            Object var5 = null;
            boolean discarded$0 = sd.a((String) null, (byte) -25);
        }
        var4.field_q = false;
        this.a(false, var4);
        return var4;
    }

    final static aj a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6, int[] param7, int param8) {
        if (!param4) {
            sd.a((byte) 126);
        }
        aj var9 = new aj(param3, param2, param5, param6, param0, param8, param7);
        ub.field_e.a((byte) -114, (fc) (Object) var9);
        we.a(param1, var9, (byte) 125);
        return var9;
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            Object var6 = null;
            lh var7 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            var5 = TrackController.field_F ? 1 : 0;
            L0: while (true) {
              if (((sd) this).field_g) {
                return;
              } else {
                var2 = (Object) (Object) ((sd) this).field_f;
                synchronized (var2) {
                  L1: {
                    var7 = (lh) (Object) ((sd) this).field_f.a(-58);
                    if (var7 == null) {
                      try {
                        L2: {
                          ((Object) (Object) ((sd) this).field_f).wait();
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
                      ((sd) this).field_a = ((sd) this).field_a - 1;
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
                        if (var7.field_y == 2) {
                          boolean discarded$1 = var7.field_A.a(-1023648016, (int)var7.field_m, var7.field_z, var7.field_z.length);
                          var7.field_w = false;
                          break L5;
                        } else {
                          if (var7.field_y == 3) {
                            var7.field_z = var7.field_A.a((byte) -95, (int)var7.field_m);
                            var7.field_w = false;
                            break L5;
                          } else {
                            var7.field_w = false;
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
                      hb.a((Throwable) (Object) var2_ref, 0, (String) null);
                      var7.field_w = false;
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

    final lh a(int param0, byte[] param1, hf param2, byte param3) {
        lh var5 = new lh();
        var5.field_A = param2;
        var5.field_z = param1;
        if (param3 < 75) {
            return null;
        }
        var5.field_q = false;
        var5.field_m = (long)param0;
        var5.field_y = 2;
        this.a(false, var5);
        return var5;
    }

    final void a(int param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        int var2_int = 0;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        ((sd) this).field_g = true;
        var2 = (Object) (Object) ((sd) this).field_f;
        synchronized (var2) {
          L0: {
            ((Object) (Object) ((sd) this).field_f).notifyAll();
            break L0;
          }
        }
        try {
          L1: {
            ((sd) this).field_e.join();
            var2_int = -87 / ((-47 - param0) / 50);
            break L1;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
            break L2;
          }
        }
        ((sd) this).field_e = null;
    }

    private final void a(boolean param0, lh param1) {
        Object var3 = null;
        Throwable var4 = null;
        Object var5 = null;
        mb stackIn_2_0 = null;
        lh stackIn_2_1 = null;
        mb stackIn_3_0 = null;
        lh stackIn_3_1 = null;
        mb stackIn_4_0 = null;
        lh stackIn_4_1 = null;
        int stackIn_4_2 = 0;
        Throwable decompiledCaughtException = null;
        mb stackOut_1_0 = null;
        lh stackOut_1_1 = null;
        mb stackOut_3_0 = null;
        lh stackOut_3_1 = null;
        int stackOut_3_2 = 0;
        mb stackOut_2_0 = null;
        lh stackOut_2_1 = null;
        int stackOut_2_2 = 0;
        var3 = (Object) (Object) ((sd) this).field_f;
        synchronized (var3) {
          L0: {
            L1: {
              stackOut_1_0 = ((sd) this).field_f;
              stackOut_1_1 = (lh) param1;
              stackIn_3_0 = stackOut_1_0;
              stackIn_3_1 = stackOut_1_1;
              stackIn_2_0 = stackOut_1_0;
              stackIn_2_1 = stackOut_1_1;
              if (param0) {
                stackOut_3_0 = (mb) (Object) stackIn_3_0;
                stackOut_3_1 = (lh) (Object) stackIn_3_1;
                stackOut_3_2 = 0;
                stackIn_4_0 = stackOut_3_0;
                stackIn_4_1 = stackOut_3_1;
                stackIn_4_2 = stackOut_3_2;
                break L1;
              } else {
                stackOut_2_0 = (mb) (Object) stackIn_2_0;
                stackOut_2_1 = (lh) (Object) stackIn_2_1;
                stackOut_2_2 = 1;
                stackIn_4_0 = stackOut_2_0;
                stackIn_4_1 = stackOut_2_1;
                stackIn_4_2 = stackOut_2_2;
                break L1;
              }
            }
            L2: {
              ((mb) (Object) stackIn_4_0).a((gb) (Object) stackIn_4_1, stackIn_4_2 != 0);
              ((sd) this).field_a = ((sd) this).field_a + 1;
              ((Object) (Object) ((sd) this).field_f).notifyAll();
              if (!param0) {
                break L2;
              } else {
                var5 = null;
                lh discarded$3 = ((sd) this).a(true, -108, (hf) null);
                break L2;
              }
            }
            break L0;
          }
        }
    }

    final lh a(byte param0, int param1, hf param2) {
        lh var4 = null;
        Object var5 = null;
        int var6 = 0;
        lh var7 = null;
        Throwable var8 = null;
        int var9 = 0;
        lh stackIn_8_0 = null;
        Throwable decompiledCaughtException = null;
        lh stackOut_7_0 = null;
        var9 = TrackController.field_F ? 1 : 0;
        var4 = new lh();
        var4.field_y = 1;
        var5 = (Object) (Object) ((sd) this).field_f;
        synchronized (var5) {
          L0: {
            var6 = -96 / ((-57 - param0) / 47);
            var7 = (lh) (Object) ((sd) this).field_f.b(48);
            L1: while (true) {
              if (var7 == null) {
                break L0;
              } else {
                L2: {
                  if (var7.field_m != (long)param1) {
                    break L2;
                  } else {
                    if (var7.field_A != param2) {
                      break L2;
                    } else {
                      if (-3 == (var7.field_y ^ -1)) {
                        var4.field_z = var7.field_z;
                        var4.field_w = false;
                        stackOut_7_0 = (lh) var4;
                        stackIn_8_0 = stackOut_7_0;
                        return stackIn_8_0;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                var7 = (lh) (Object) ((sd) this).field_f.a((byte) 77);
                continue L1;
              }
            }
          }
        }
        var4.field_z = param2.a((byte) -123, param1);
        var4.field_w = false;
        var4.field_q = true;
        return var4;
    }

    final static boolean a(String param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = TrackController.field_F ? 1 : 0;
          if (param1 >= 60) {
            break L0;
          } else {
            field_c = null;
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (var2 >= param0.length()) {
            return false;
          } else {
            var3 = param0.charAt(var2);
            if (!rj.a((char) var3, 122)) {
              if (!hd.a(-124, (char) var3)) {
                return true;
              } else {
                var2++;
                continue L1;
              }
            } else {
              var2++;
              continue L1;
            }
          }
        }
    }

    public static void a(byte param0) {
        if (param0 >= -76) {
            field_b = -14;
        }
        field_d = null;
        field_c = null;
    }

    sd(uf param0) {
        ((sd) this).field_f = new mb();
        ((sd) this).field_a = 0;
        ((sd) this).field_g = false;
        ce var2 = param0.a(5, (Runnable) this, 94);
        while (-1 == (var2.field_f ^ -1)) {
            wl.a(10L, false);
        }
        if ((var2.field_f ^ -1) == -3) {
            throw new RuntimeException();
        }
        ((sd) this).field_e = (Thread) var2.field_e;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[8192];
    }
}
