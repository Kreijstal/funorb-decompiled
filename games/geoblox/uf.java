/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf implements Runnable {
    static int[] field_h;
    private wd field_k;
    static int field_a;
    static al field_l;
    static String field_i;
    int field_d;
    private Thread field_g;
    static int field_b;
    static ob field_e;
    private boolean field_j;
    static wa field_f;
    static long field_c;

    public static void a(int param0) {
        if (param0 >= -35) {
          field_e = (ob) null;
          field_e = null;
          field_h = null;
          field_f = null;
          field_i = null;
          field_l = null;
          return;
        } else {
          field_e = null;
          field_h = null;
          field_f = null;
          field_i = null;
          field_l = null;
          return;
        }
    }

    final o a(byte param0, int param1, jh param2, byte[] param3) {
        o var5 = null;
        RuntimeException var5_ref = null;
        o stackIn_2_0 = null;
        o stackIn_4_0 = null;
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
            var5 = new o();
            var5.field_y = param3;
            var5.field_q = false;
            var5.field_i = (long)param1;
            var5.field_x = 2;
            var5.field_w = param2;
            if (param0 > 41) {
              this.a(var5, 15079962);
              stackIn_4_0 = (o) (var5);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_2_0 = (o) null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5_ref = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var5_ref);

            stackIn_7_1 = new StringBuilder().append("uf.G(").append(param0).append(',').append(param1).append(',');

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
          L2: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

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
          throw t.a((Throwable) ((Object) stackIn_8_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          return stackIn_4_0;
        }
    }

    final o a(jh param0, int param1, int param2) {
        o var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        o var6 = null;
        int var8 = 0;
        o stackIn_11_0 = null;
        o stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              var4 = new o();
              if (param2 == 15079962) {
                break L1;
              } else {
                field_a = -116;
                break L1;
              }
            }
            var4.field_x = 1;
            var5 = this.field_k;
            synchronized (var5) {
              L2: {
                var6 = (o) ((Object) this.field_k.c((byte) 121));
                L3: while (true) {
                  if (var6 == null) {
                    break L2;
                  } else {
                    L4: {
                      if ((long)param1 != var6.field_i) {
                        break L4;
                      } else {
                        if (var6.field_w != param0) {
                          break L4;
                        } else {
                          if (2 == var6.field_x) {
                            var4.field_y = var6.field_y;
                            var4.field_u = false;
                            stackIn_11_0 = (o) (var4);
                            return stackIn_11_0;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var6 = (o) ((Object) this.field_k.a(-20));
                    continue L3;
                  }
                }
              }
            }
            var4.field_y = param0.a(param1, (byte) -78);
            var4.field_q = true;
            var4.field_u = false;
            stackIn_18_0 = (o) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4_ref);

            stackIn_21_1 = new StringBuilder().append("uf.F(");

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
          throw t.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_18_0;
    }

    private final void a(o param0, int param1) {
        Object var3 = null;
        Throwable var4 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var3 = this.field_k;
          synchronized (var3) {
            L0: {
              this.field_k.a(-128, param0);
              if (param1 == 15079962) {
                this.field_d = this.field_d + 1;
                this.field_k.notifyAll();
                break L0;
              } else {
                return;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_11_0 = var3;

            stackIn_11_1 = new StringBuilder().append("uf.A(");

            if (param0 == null) {
              stackIn_12_0 = stackIn_11_0;
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L1;
            } else {
              stackIn_12_0 = stackIn_11_0;
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L1;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ',' + param1 + ')');
        }
    }

    final static int a(byte param0, String param1, int param2, int param3, String param4, String param5, boolean param6) {
        mb var7 = null;
        RuntimeException var7_ref = null;
        mb var8 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var7 = new mb(param5);
              var8 = new mb(param4);
              if (param0 == -94) {
                break L1;
              } else {
                field_e = (ob) null;
                break L1;
              }
            }
            stackIn_3_0 = pf.a(param3, param2, var7, var8, param1, param6, 100);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var7_ref);

            stackIn_6_1 = new StringBuilder().append("uf.C(").append(param0).append(',');

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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
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
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param5 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param6 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(int param0, int param1) {
        if (param0 < 87) {
            String var3 = (String) null;
            uf.a((byte) -87, (String) null, -112, 119, (String) null, (String) null, false);
        }
    }

    final void a(byte param0) {
        try {
            this.field_j = true;
            synchronized (this.field_k) {
                this.field_k.notifyAll();
            }
            if (param0 != 51) {
                return;
            }
            try {
                this.field_g.join();
            } catch (InterruptedException interruptedException) {
            }
            this.field_g = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final o a(int param0, jh param1, int param2) {
        o var4 = null;
        RuntimeException var4_ref = null;
        o stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new o();
              var4.field_x = 3;
              var4.field_w = param1;
              var4.field_q = false;
              var4.field_i = (long)param2;
              if (param0 >= 22) {
                break L1;
              } else {
                uf.a(70);
                break L1;
              }
            }
            this.a(var4, 15079962);
            stackIn_3_0 = (o) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("uf.D(").append(param0).append(',');

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
          throw t.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            int var5 = 0;
            o var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            String var6 = null;
            var5 = Geoblox.field_C;
            L0: while (true) {
              if (this.field_j) {
                return;
              } else {
                var2 = this.field_k;
                synchronized (var2) {
                  L1: {
                    var7 = (o) ((Object) this.field_k.a(true));
                    if (var7 == null) {
                      try {
                        L2: {
                          this.field_k.wait();
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
                      this.field_d = this.field_d - 1;
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
                        if ((var7.field_x ^ -1) != -3) {
                          if (3 == var7.field_x) {
                            var7.field_y = var7.field_w.a((int)var7.field_i, (byte) -76);
                            decompiledRegionSelector1 = 1;
                            break L4;
                          } else {
                            var7.field_u = false;
                            break L5;
                          }
                        } else {
                          var7.field_w.a(var7.field_y, (byte) -53, (int)var7.field_i, var7.field_y.length);
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
                      gi.a((Throwable) ((Object) var2_ref), (String) null, (byte) 125);
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

    uf(d param0) {
        cb var2 = null;
        this.field_k = new wd();
        this.field_d = 0;
        this.field_j = false;
        try {
            var2 = param0.a((Runnable) (this), 0, 5);
            while (var2.field_a == 0) {
                bc.a(0, 10L);
            }
            if (2 == var2.field_a) {
                throw new RuntimeException();
            }
            this.field_g = (Thread) (var2.field_b);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "uf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_h = new int[]{5167632, 12183066, 16031008, 15087386, 15079962};
        field_i = "This password contains your email address, and would be easy to guess";
        field_b = 0;
        field_l = new al();
    }
}
