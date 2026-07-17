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
        RuntimeException var5_ref = null;
        mf stackIn_3_0 = null;
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
        mf stackOut_2_0 = null;
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
              if (param3 == 116) {
                break L1;
              } else {
                ((ni) this).run();
                break L1;
              }
            }
            var5 = new mf();
            var5.field_k = (long)param0;
            var5.field_v = 2;
            var5.field_t = param1;
            var5.field_s = param2;
            var5.field_q = false;
            this.a(19, var5);
            stackOut_2_0 = (mf) var5;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var5_ref;
            stackOut_4_1 = new StringBuilder().append("ni.C(").append(param0).append(44);
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
          L3: {
            stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
            stackOut_7_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(44);
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param2 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L3;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L3;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param3 + 41);
        }
        return stackIn_3_0;
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
        if (param1 > 0L) {
          if (6582952005840035281L > param1) {
            if (param1 % 37L == 0L) {
              return null;
            } else {
              var3 = 0;
              var4 = param1;
              L0: while (true) {
                if (var4 == 0L) {
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
        RuntimeException var4_ref = null;
        Object stackIn_2_0 = null;
        mf stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        mf stackOut_3_0 = null;
        Object stackOut_1_0 = null;
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
            var4 = new mf();
            var4.field_t = param2;
            if (param0 == -4) {
              var4.field_k = (long)param1;
              var4.field_q = false;
              var4.field_v = 3;
              this.a(param0 ^ -25, var4);
              stackOut_3_0 = (mf) var4;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (mf) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4_ref;
            stackOut_5_1 = new StringBuilder().append("ni.A(").append(param0).append(44).append(param1).append(44);
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
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 41);
        }
        return stackIn_4_0;
    }

    public final void run() {
        try {
            Object var2 = null;
            Exception var2_ref = null;
            Throwable var4 = null;
            int var5 = 0;
            mf var6 = null;
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
                    var6 = (mf) (Object) ((ni) this).field_e.d(-4425);
                    if (var6 == null) {
                      {
                        L2: {
                          ((Object) (Object) ((ni) this).field_e).wait();
                          break L2;
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
                        if (2 == var6.field_v) {
                          boolean discarded$2 = var6.field_t.a(var6.field_s.length, var6.field_s, (byte) 101, (int)var6.field_k);
                          var6.field_n = false;
                          break L5;
                        } else {
                          if (var6.field_v != 3) {
                            decompiledRegionSelector1 = 0;
                            break L4;
                          } else {
                            var6.field_s = var6.field_t.a(false, (int)var6.field_k);
                            var6.field_n = false;
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
                      int discarded$3 = 21862;
                      wp.a((Throwable) (Object) var2_ref, (String) null);
                      decompiledRegionSelector1 = 0;
                      break L6;
                    }
                  }
                  if (decompiledRegionSelector1 == 0) {
                    var6.field_n = false;
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
        synchronized (((ni) this).field_e) {
            ((ni) this).field_e.a((byte) 98, (ij) (Object) param1);
            ((ni) this).field_c = ((ni) this).field_c + 1;
            ((Object) (Object) ((ni) this).field_e).notifyAll();
            int var4 = -48 % ((-37 - param0) / 37);
        }
    }

    final mf a(boolean param0, int param1, sp param2) {
        mf var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        mf var6 = null;
        Throwable var7 = null;
        int var8 = 0;
        mf stackIn_8_0 = null;
        mf stackIn_15_0 = null;
        sp stackIn_15_1 = null;
        mf stackIn_16_0 = null;
        sp stackIn_16_1 = null;
        mf stackIn_17_0 = null;
        sp stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        mf stackIn_18_0 = null;
        mf stackIn_19_0 = null;
        mf stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        mf stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        mf stackOut_7_0 = null;
        mf stackOut_14_0 = null;
        sp stackOut_14_1 = null;
        mf stackOut_16_0 = null;
        sp stackOut_16_1 = null;
        int stackOut_16_2 = 0;
        mf stackOut_15_0 = null;
        sp stackOut_15_1 = null;
        int stackOut_15_2 = 0;
        mf stackOut_17_0 = null;
        mf stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        mf stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        mf stackOut_20_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            var4 = new mf();
            var4.field_v = 1;
            var5 = (Object) (Object) ((ni) this).field_e;
            synchronized (var5) {
              L1: {
                var6 = (mf) (Object) ((ni) this).field_e.b(126);
                L2: while (true) {
                  if (var6 == null) {
                    break L1;
                  } else {
                    L3: {
                      if (var6.field_k != (long)param1) {
                        break L3;
                      } else {
                        if (var6.field_t != param2) {
                          break L3;
                        } else {
                          if (var6.field_v != 2) {
                            break L3;
                          } else {
                            var4.field_s = var6.field_s;
                            var4.field_n = false;
                            stackOut_7_0 = (mf) var4;
                            stackIn_8_0 = stackOut_7_0;
                            return stackIn_8_0;
                          }
                        }
                      }
                    }
                    var6 = (mf) (Object) ((ni) this).field_e.a(94);
                    continue L2;
                  }
                }
              }
            }
            L4: {
              stackOut_14_0 = (mf) var4;
              stackOut_14_1 = (sp) param2;
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              if (param0) {
                stackOut_16_0 = (mf) (Object) stackIn_16_0;
                stackOut_16_1 = (sp) (Object) stackIn_16_1;
                stackOut_16_2 = 0;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                stackIn_17_2 = stackOut_16_2;
                break L4;
              } else {
                stackOut_15_0 = (mf) (Object) stackIn_15_0;
                stackOut_15_1 = (sp) (Object) stackIn_15_1;
                stackOut_15_2 = 1;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_17_2 = stackOut_15_2;
                break L4;
              }
            }
            L5: {
              stackIn_17_0.field_s = ((sp) (Object) stackIn_17_1).a(stackIn_17_2 != 0, param1);
              var4.field_n = false;
              stackOut_17_0 = (mf) var4;
              stackIn_19_0 = stackOut_17_0;
              stackIn_18_0 = stackOut_17_0;
              if (!param0) {
                stackOut_19_0 = (mf) (Object) stackIn_19_0;
                stackOut_19_1 = 0;
                stackIn_20_0 = stackOut_19_0;
                stackIn_20_1 = stackOut_19_1;
                break L5;
              } else {
                stackOut_18_0 = (mf) (Object) stackIn_18_0;
                stackOut_18_1 = 1;
                stackIn_20_0 = stackOut_18_0;
                stackIn_20_1 = stackOut_18_1;
                break L5;
              }
            }
            stackIn_20_0.field_q = stackIn_20_1 != 0;
            stackOut_20_0 = (mf) var4;
            stackIn_21_0 = stackOut_20_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var4_ref;
            stackOut_22_1 = new StringBuilder().append("ni.B(").append(param0).append(44).append(param1).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param2 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L6;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L6;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
        return stackIn_21_0;
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
        gb var2 = null;
        ((ni) this).field_e = new km();
        ((ni) this).field_d = false;
        ((ni) this).field_c = 0;
        try {
            var2 = param0.a((Runnable) this, 2, 5);
            while (-1 == var2.field_a) {
                fh.a(true, 10L);
            }
            if (-3 == var2.field_a) {
                throw new RuntimeException();
            }
            ((ni) this).field_a = (Thread) var2.field_b;
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) (Object) runtimeException, "ni.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = -1;
    }
}
