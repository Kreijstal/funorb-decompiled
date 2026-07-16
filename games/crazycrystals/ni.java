/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni implements Runnable {
    private km field_e;
    static int field_b;
    int field_c;
    private boolean field_d;
    private Thread field_a;

    final mf a(int param0, sp param1, byte[] param2, byte param3) {
        mf var5 = null;
        if (param3 != 116) {
          ((ni) this).run();
          var5 = new mf();
          var5.field_k = (long)param0;
          var5.field_v = 2;
          var5.field_t = param1;
          var5.field_s = param2;
          var5.field_q = false;
          this.a(19, var5);
          return var5;
        } else {
          var5 = new mf();
          var5.field_k = (long)param0;
          var5.field_v = 2;
          var5.field_t = param1;
          var5.field_s = param2;
          var5.field_q = false;
          this.a(19, var5);
          return var5;
        }
    }

    final static String a(int param0, long param1) {
        int var3 = 0;
        long var4 = 0L;
        StringBuilder var6 = null;
        long var7 = 0L;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        var11 = CrazyCrystals.field_B;
        if (-1L > (param1 ^ -1L)) {
          if (6582952005840035281L > param1) {
            if ((param1 % (long)param0 ^ -1L) == -1L) {
              return null;
            } else {
              var3 = 0;
              var4 = param1;
              L0: while (true) {
                if (-1L == (var4 ^ -1L)) {
                  var6 = new StringBuilder(var3);
                  L1: while (true) {
                    if (0L == param1) {
                      StringBuilder discarded$2 = var6.reverse();
                      var6.setCharAt(0, Character.toUpperCase(var6.charAt(0)));
                      return var6.toString();
                    } else {
                      L2: {
                        var7 = param1;
                        param1 = param1 / 37L;
                        var9 = gl.field_a[(int)(-(param1 * 37L) + var7)];
                        if (var9 == 95) {
                          var10 = var6.length() - 1;
                          var9 = 160;
                          var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      StringBuilder discarded$3 = var6.append(var9);
                      continue L1;
                    }
                  }
                } else {
                  var3++;
                  var4 = var4 / 37L;
                  continue L0;
                }
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    final mf a(int param0, int param1, sp param2) {
        mf var4 = null;
        var4 = new mf();
        var4.field_t = param2;
        if (param0 != -4) {
          return null;
        } else {
          var4.field_k = (long)param1;
          var4.field_q = false;
          var4.field_v = 3;
          this.a(param0 ^ -25, var4);
          return var4;
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
            mf var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            var5 = CrazyCrystals.field_B;
            L0: while (true) {
              if (((ni) this).field_d) {
                return;
              } else {
                var2 = (Object) (Object) ((ni) this).field_e;
                synchronized (var2) {
                  L1: {
                    var7 = (mf) (Object) ((ni) this).field_e.d(-4425);
                    if (var7 == null) {
                      try {
                        L2: {
                          ((Object) (Object) ((ni) this).field_e).wait();
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
                      ((ni) this).field_c = ((ni) this).field_c - 1;
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
                        if (2 == var7.field_v) {
                          boolean discarded$1 = var7.field_t.a(var7.field_s.length, var7.field_s, (byte) 101, (int)var7.field_k);
                          var7.field_n = false;
                          break L5;
                        } else {
                          if (-4 != (var7.field_v ^ -1)) {
                            decompiledRegionSelector1 = 0;
                            break L4;
                          } else {
                            var7.field_s = var7.field_t.a(false, (int)var7.field_k);
                            var7.field_n = false;
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
                      var6 = null;
                      wp.a((Throwable) (Object) var2_ref, (String) null, 21862);
                      decompiledRegionSelector1 = 0;
                      break L6;
                    }
                  }
                  if (decompiledRegionSelector1 == 0) {
                    var7.field_n = false;
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

    private final void a(int param0, mf param1) {
        Object var3 = null;
        int var4 = 0;
        Throwable var5 = null;
        Throwable decompiledCaughtException = null;
        var3 = (Object) (Object) ((ni) this).field_e;
        synchronized (var3) {
          L0: {
            ((ni) this).field_e.a((byte) 98, (ij) (Object) param1);
            ((ni) this).field_c = ((ni) this).field_c + 1;
            ((Object) (Object) ((ni) this).field_e).notifyAll();
            var4 = -48 % ((-37 - param0) / 37);
            break L0;
          }
        }
    }

    final mf a(boolean param0, int param1, sp param2) {
        mf var4 = null;
        Object var5 = null;
        mf var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        mf stackIn_7_0 = null;
        mf stackIn_14_0 = null;
        sp stackIn_14_1 = null;
        mf stackIn_15_0 = null;
        sp stackIn_15_1 = null;
        mf stackIn_16_0 = null;
        sp stackIn_16_1 = null;
        int stackIn_16_2 = 0;
        mf stackIn_17_0 = null;
        mf stackIn_18_0 = null;
        mf stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        Throwable decompiledCaughtException = null;
        mf stackOut_6_0 = null;
        mf stackOut_13_0 = null;
        sp stackOut_13_1 = null;
        mf stackOut_15_0 = null;
        sp stackOut_15_1 = null;
        int stackOut_15_2 = 0;
        mf stackOut_14_0 = null;
        sp stackOut_14_1 = null;
        int stackOut_14_2 = 0;
        mf stackOut_16_0 = null;
        mf stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        mf stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        var8 = CrazyCrystals.field_B;
        var4 = new mf();
        var4.field_v = 1;
        var5 = (Object) (Object) ((ni) this).field_e;
        synchronized (var5) {
          L0: {
            var6 = (mf) (Object) ((ni) this).field_e.b(126);
            L1: while (true) {
              if (var6 == null) {
                break L0;
              } else {
                L2: {
                  if (var6.field_k != (long)param1) {
                    break L2;
                  } else {
                    if (var6.field_t != param2) {
                      break L2;
                    } else {
                      if ((var6.field_v ^ -1) != -3) {
                        break L2;
                      } else {
                        var4.field_s = var6.field_s;
                        var4.field_n = false;
                        stackOut_6_0 = (mf) var4;
                        stackIn_7_0 = stackOut_6_0;
                        return stackIn_7_0;
                      }
                    }
                  }
                }
                var6 = (mf) (Object) ((ni) this).field_e.a(94);
                continue L1;
              }
            }
          }
        }
        L3: {
          stackOut_13_0 = (mf) var4;
          stackOut_13_1 = (sp) param2;
          stackIn_15_0 = stackOut_13_0;
          stackIn_15_1 = stackOut_13_1;
          stackIn_14_0 = stackOut_13_0;
          stackIn_14_1 = stackOut_13_1;
          if (param0) {
            stackOut_15_0 = (mf) (Object) stackIn_15_0;
            stackOut_15_1 = (sp) (Object) stackIn_15_1;
            stackOut_15_2 = 0;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            stackIn_16_2 = stackOut_15_2;
            break L3;
          } else {
            stackOut_14_0 = (mf) (Object) stackIn_14_0;
            stackOut_14_1 = (sp) (Object) stackIn_14_1;
            stackOut_14_2 = 1;
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_16_2 = stackOut_14_2;
            break L3;
          }
        }
        L4: {
          stackIn_16_0.field_s = ((sp) (Object) stackIn_16_1).a(stackIn_16_2 != 0, param1);
          var4.field_n = false;
          stackOut_16_0 = (mf) var4;
          stackIn_18_0 = stackOut_16_0;
          stackIn_17_0 = stackOut_16_0;
          if (!param0) {
            stackOut_18_0 = (mf) (Object) stackIn_18_0;
            stackOut_18_1 = 0;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            break L4;
          } else {
            stackOut_17_0 = (mf) (Object) stackIn_17_0;
            stackOut_17_1 = 1;
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            break L4;
          }
        }
        stackIn_19_0.field_q = stackIn_19_1 != 0;
        return var4;
    }

    final void a(int param0) {
        InterruptedException interruptedException = null;
        Object var2 = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        ((ni) this).field_d = true;
        var2 = (Object) (Object) ((ni) this).field_e;
        synchronized (var2) {
          L0: {
            L1: {
              if (param0 == -3) {
                break L1;
              } else {
                ((ni) this).run();
                break L1;
              }
            }
            ((Object) (Object) ((ni) this).field_e).notifyAll();
            break L0;
          }
        }
        try {
          L2: {
            ((ni) this).field_a.join();
            break L2;
          }
        } catch (java.lang.Exception decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            interruptedException = (InterruptedException) (Object) decompiledCaughtException;
            break L3;
          }
        }
        ((ni) this).field_a = null;
    }

    ni(un param0) {
        ((ni) this).field_e = new km();
        ((ni) this).field_d = false;
        ((ni) this).field_c = 0;
        gb var2 = param0.a((Runnable) this, 2, 5);
        while (-1 == var2.field_a) {
            fh.a(true, 10L);
        }
        if (-3 == var2.field_a) {
            throw new RuntimeException();
        }
        ((ni) this).field_a = (Thread) var2.field_b;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
    }
}
