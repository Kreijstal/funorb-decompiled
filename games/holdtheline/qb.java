/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qb implements Runnable {
    static float[] field_e;
    static uf field_b;
    static int[] field_a;
    private ol field_d;
    static float[] field_f;
    int field_c;
    private Thread field_h;
    static int field_i;
    private boolean field_g;

    final bk a(int param0, sk param1, byte[] param2, int param3) {
        bk var5 = null;
        RuntimeException var5_ref = null;
        bk stackIn_2_0 = null;
        bk stackIn_4_0 = null;
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
            var5 = new bk();
            var5.field_x = param1;
            var5.field_i = (long)param0;
            var5.field_v = param2;
            var5.field_y = 2;
            if (param3 == 11998) {
              var5.field_t = false;
              this.a(param3 + -39427, var5);
              stackIn_4_0 = (bk) (var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (bk) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5_ref);

            stackIn_7_1 = new StringBuilder().append("qb.B(").append(param0).append(',');

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
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param2 == null) {
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
          throw kk.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ',' + param3 + ')');
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
            int var5 = 0;
            bk var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Object var2 = null;
            Exception var2_ref = null;
            String var6 = null;
            var5 = HoldTheLine.field_D;
            L0: while (true) {
              if (this.field_g) {
                return;
              } else {
                var2 = this.field_d;
                synchronized (var2) {
                  L1: {
                    var7 = (bk) ((Object) this.field_d.a((byte) 113));
                    if (var7 != null) {
                      this.field_c = this.field_c - 1;
                      decompiledRegionSelector0 = 1;
                      break L1;
                    } else {
                      try {
                        L2: {
                          this.field_d.wait();
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
                        if (-3 != (var7.field_y ^ -1)) {
                          if (var7.field_y == 3) {
                            var7.field_v = var7.field_x.a(122, (int)var7.field_i);
                            decompiledRegionSelector1 = 1;
                            break L4;
                          } else {
                            var7.field_u = false;
                            break L5;
                          }
                        } else {
                          var7.field_x.a(var7.field_v, (int)var7.field_i, var7.field_v.length, false);
                          var7.field_u = false;
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
                      var6 = (String) null;
                      bl.a((Throwable) ((Object) var2_ref), (byte) 115, (String) null);
                      decompiledRegionSelector1 = 1;
                      break L6;
                    }
                  }
                  if (decompiledRegionSelector1 == 0) {
                    continue L0;
                  } else {
                    var7.field_u = false;
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

    final static void a(int param0, byte param1) {
        em.a(true);
        if (param1 > -63) {
            field_i = 124;
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_e = null;
        field_a = null;
        if (param0 != -3) {
            qb.b(12);
            field_f = null;
            return;
        }
        field_f = null;
    }

    final bk a(sk param0, int param1, int param2) {
        bk var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        bk var6 = null;
        int var8 = 0;
        bk stackIn_8_0 = null;
        bk stackIn_16_0 = null;
        bk stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        Throwable decompiledCaughtException = null;
        var8 = HoldTheLine.field_D;
        try {
          L0: {
            var4 = new bk();
            var4.field_y = 1;
            var5 = this.field_d;
            synchronized (var5) {
              L1: {
                var6 = (bk) ((Object) this.field_d.c(param1 + 18139));
                L2: while (true) {
                  if (var6 == null) {
                    break L1;
                  } else {
                    L3: {
                      if ((long)param2 != var6.field_i) {
                        break L3;
                      } else {
                        if (param0 != var6.field_x) {
                          break L3;
                        } else {
                          if ((var6.field_y ^ -1) != -3) {
                            break L3;
                          } else {
                            var4.field_v = var6.field_v;
                            var4.field_u = false;
                            stackIn_8_0 = (bk) (var4);
                            return stackIn_8_0;
                          }
                        }
                      }
                    }
                    var6 = (bk) ((Object) this.field_d.e(param1 ^ 17949));
                    continue L2;
                  }
                }
              }
            }
            var4.field_v = param0.a(117, param2);
            var4.field_t = true;
            var4.field_u = false;
            if (param1 == -18017) {
              stackIn_18_0 = (bk) (var4);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_16_0 = (bk) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4_ref);

            stackIn_21_1 = new StringBuilder().append("qb.E(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_16_0;
        } else {
          return stackIn_18_0;
        }
    }

    final bk a(int param0, sk param1, int param2) {
        bk var4 = null;
        RuntimeException var4_ref = null;
        bk stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4 = new bk();
            var4.field_y = param0;
            var4.field_i = (long)param2;
            var4.field_x = param1;
            var4.field_t = false;
            this.a(-27429, var4);
            stackIn_1_0 = (bk) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4_ref);

            stackIn_4_1 = new StringBuilder().append("qb.G(").append(param0).append(',');

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
          throw kk.a((Throwable) ((Object) stackIn_5_0), stackIn_5_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    final static String a(int param0) {
        if (param0 == 100) {
          if (!sk.field_h) {
            if (g.field_h <= dm.field_a) {
              if (we.field_l + g.field_h <= dm.field_a) {
                return null;
              } else {
                return n.field_s;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          return (String) null;
        }
    }

    final void a(boolean param0) {
        try {
            this.field_g = param0 ? true : false;
            synchronized (this.field_d) {
                this.field_d.notifyAll();
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

    private final void a(int param0, bk param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        try {
          L0: {
            var3_ref = this.field_d;
            synchronized (var3_ref) {
              L1: {
                this.field_d.a(-66, param1);
                this.field_c = this.field_c + 1;
                this.field_d.notifyAll();
                break L1;
              }
            }
            if (param0 == -27429) {
              break L0;
            } else {
              qb.a(-68, (byte) 57);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("qb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L2;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L2;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
    }

    qb(ib param0) {
        af var2 = null;
        this.field_d = new ol();
        this.field_g = false;
        this.field_c = 0;
        try {
            var2 = param0.a((byte) -28, 5, (Runnable) (this));
            while (-1 == (var2.field_d ^ -1)) {
                qe.a(10L, (byte) 45);
            }
            if (2 == var2.field_d) {
                throw new RuntimeException();
            }
            this.field_h = (Thread) (var2.field_b);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "qb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new int[]{40, 170, 100, 110, 170};
        field_f = new float[]{1.0f, 10.0f, 10.0f, 10.0f};
        field_e = field_f;
    }
}
