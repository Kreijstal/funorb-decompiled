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
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param3 == 116) {
                break L1;
              } else {
                this.run();
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
            stackIn_3_0 = (mf) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5_ref);

            stackIn_6_1 = new StringBuilder().append("ni.C(").append(param0).append(',');

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
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final static String a(int param0, long param1) {
        StringBuilder discarded$1 = null;
        int var3;
        long var4;
        StringBuilder var6;
        long var7;
        int var9;
        int var10;
        int var11;
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
                      var6.reverse();
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
                      discarded$1 = var6.append((char) var9);
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
        mf stackIn_2_0 = null;
        mf stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new mf();
            var4.field_t = param2;
            if (param0 == -4) {
              var4.field_k = (long)param1;
              var4.field_q = false;
              var4.field_v = 3;
              this.a(param0 ^ -25, var4);
              stackIn_4_0 = (mf) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (mf) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4_ref);

            stackIn_7_1 = new StringBuilder().append("ni.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
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
          throw dn.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            int var5 = 0;
            mf var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            String var6 = null;
            var5 = CrazyCrystals.field_B;
            L0: while (true) {
              if (this.field_d) {
                return;
              } else {
                var2 = this.field_e;
                synchronized (var2) {
                  L1: {
                    var7 = (mf) ((Object) this.field_e.d(-4425));
                    if (var7 == null) {
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
                    } else {
                      this.field_c = this.field_c - 1;
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
                          var7.field_t.a(var7.field_s.length, var7.field_s, (byte) 101, (int)var7.field_k);
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
                      var6 = (String) null;
                      wp.a((Throwable) ((Object) var2_ref), (String) null, 21862);
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
        synchronized (this.field_e) {
            this.field_e.a((byte) 98, param1);
            this.field_c = this.field_c + 1;
            this.field_e.notifyAll();
            int var4 = -48 % ((-37 - param0) / 37);
        }
    }

    final mf a(boolean param0, int param1, sp param2) {
        mf var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        mf var6 = null;
        int var8 = 0;
        mf stackIn_8_0 = null;
        mf stackIn_16_0 = null;
        sp stackIn_16_1 = null;
        mf stackIn_17_0 = null;
        sp stackIn_17_1 = null;
        int stackIn_17_2 = 0;
        mf stackIn_19_0 = null;
        mf stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        mf stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = CrazyCrystals.field_B;
        try {
          L0: {
            var4 = new mf();
            var4.field_v = 1;
            var5 = this.field_e;
            synchronized (var5) {
              L1: {
                var6 = (mf) ((Object) this.field_e.b(126));
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
                          if ((var6.field_v ^ -1) != -3) {
                            break L3;
                          } else {
                            var4.field_s = var6.field_s;
                            var4.field_n = false;
                            stackIn_8_0 = (mf) (var4);
                            return stackIn_8_0;
                          }
                        }
                      }
                    }
                    var6 = (mf) ((Object) this.field_e.a(94));
                    continue L2;
                  }
                }
              }
            }
            L4: {
              stackIn_16_0 = (mf) (var4);

              stackIn_16_1 = (sp) (param2);

              if (param0) {
                stackIn_17_0 = (mf) ((Object) stackIn_16_0);
                stackIn_17_1 = (sp) ((Object) stackIn_16_1);
                stackIn_17_2 = 0;
                break L4;
              } else {
                stackIn_17_0 = (mf) ((Object) stackIn_16_0);
                stackIn_17_1 = (sp) ((Object) stackIn_16_1);
                stackIn_17_2 = 1;
                break L4;
              }
            }
            L5: {
              stackIn_17_0.field_s = ((sp) (Object) stackIn_17_1).a(stackIn_17_2 != 0, param1);
              var4.field_n = false;
              stackIn_19_0 = (mf) (var4);

              if (!param0) {
                stackIn_20_0 = (mf) ((Object) stackIn_19_0);
                stackIn_20_1 = 0;
                break L5;
              } else {
                stackIn_20_0 = (mf) ((Object) stackIn_19_0);
                stackIn_20_1 = 1;
                break L5;
              }
            }
            stackIn_20_0.field_q = stackIn_20_1 != 0;
            stackIn_21_0 = (mf) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var4_ref);

            stackIn_24_1 = new StringBuilder().append("ni.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L6;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L6;
            }
          }
          throw dn.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        return stackIn_21_0;
    }

    final void a(int param0) {
        try {
            this.field_d = true;
            synchronized (this.field_e) {
                if (param0 != -3) {
                    this.run();
                }
                this.field_e.notifyAll();
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

    ni(un param0) {
        gb var2 = null;
        this.field_e = new km();
        this.field_d = false;
        this.field_c = 0;
        try {
            var2 = param0.a((Runnable) (this), 2, 5);
            while (-1 == (var2.field_a ^ -1)) {
                fh.a(true, 10L);
            }
            if (-3 == (var2.field_a ^ -1)) {
                throw new RuntimeException();
            }
            this.field_a = (Thread) (var2.field_b);
        } catch (RuntimeException runtimeException) {
            throw dn.a((Throwable) ((Object) runtimeException), "ni.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_b = -1;
    }
}
