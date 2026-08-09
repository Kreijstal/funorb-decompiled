/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dk implements Runnable {
    static String field_a;
    private er field_f;
    static String field_k;
    static String field_b;
    static dq field_h;
    static String field_i;
    static wp[] field_e;
    private boolean field_j;
    int field_d;
    static int[] field_g;
    private Thread field_c;

    final os a(byte[] param0, bl param1, boolean param2, int param3) {
        os var5 = null;
        RuntimeException var5_ref = null;
        os stackIn_3_0 = null;
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
              var5 = new os();
              var5.field_i = (long)param3;
              var5.field_u = param0;
              var5.field_v = 2;
              var5.field_x = param1;
              var5.field_q = false;
              if (param2) {
                break L1;
              } else {
                dk.a(-85);
                break L1;
              }
            }
            this.a((byte) -88, var5);
            stackIn_3_0 = (os) (var5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var5_ref);

            stackIn_6_1 = new StringBuilder().append("dk.A(");

            if (param0 == null) {
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

            if (param1 == null) {
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
          throw pn.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    final os a(bl param0, byte param1, int param2) {
        os var4 = null;
        RuntimeException var4_ref = null;
        Object var5 = null;
        os var6 = null;
        int var8 = 0;
        os stackIn_11_0 = null;
        os stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        Throwable decompiledCaughtException = null;
        var8 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 > 53) {
                break L1;
              } else {
                this.field_j = false;
                break L1;
              }
            }
            var4 = new os();
            var4.field_v = 1;
            var5 = this.field_f;
            synchronized (var5) {
              L2: {
                var6 = (os) ((Object) this.field_f.b((byte) 52));
                L3: while (true) {
                  if (var6 == null) {
                    break L2;
                  } else {
                    L4: {
                      if (var6.field_i != (long)param2) {
                        break L4;
                      } else {
                        if (param0 != var6.field_x) {
                          break L4;
                        } else {
                          if ((var6.field_v ^ -1) == -3) {
                            var4.field_p = false;
                            var4.field_u = var6.field_u;
                            stackIn_11_0 = (os) (var4);
                            return stackIn_11_0;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                    var6 = (os) ((Object) this.field_f.e(31542));
                    continue L3;
                  }
                }
              }
            }
            var4.field_u = param0.a(param2, 255);
            var4.field_q = true;
            var4.field_p = false;
            stackIn_18_0 = (os) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var4_ref);

            stackIn_21_1 = new StringBuilder().append("dk.C(");

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
          throw pn.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_18_0;
    }

    public static void a(int param0) {
        if (param0 != -4) {
          dk.a(-105, 77, (byte) -91);
          field_h = null;
          field_e = null;
          field_a = null;
          field_k = null;
          field_i = null;
          field_g = null;
          field_b = null;
          return;
        } else {
          field_h = null;
          field_e = null;
          field_a = null;
          field_k = null;
          field_i = null;
          field_g = null;
          field_b = null;
          return;
        }
    }

    public final void run() {
        try {
            InterruptedException interruptedException = null;
            Object var2 = null;
            int var5 = 0;
            os var7 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            Throwable decompiledCaughtException = null;
            Exception var2_ref = null;
            String var6 = null;
            var5 = AceOfSkies.field_G ? 1 : 0;
            L0: while (true) {
              if (this.field_j) {
                return;
              } else {
                var2 = this.field_f;
                synchronized (var2) {
                  L1: {
                    var7 = (os) ((Object) this.field_f.b(-18520));
                    if (var7 == null) {
                      try {
                        L2: {
                          this.field_f.wait();
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
                        if (2 != var7.field_v) {
                          if ((var7.field_v ^ -1) == -4) {
                            var7.field_u = var7.field_x.a((int)var7.field_i, 255);
                            decompiledRegionSelector1 = 1;
                            break L4;
                          } else {
                            var7.field_p = false;
                            break L5;
                          }
                        } else {
                          var7.field_x.a(var7.field_u.length, 255, (int)var7.field_i, var7.field_u);
                          var7.field_p = false;
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
                      v.a((String) null, (byte) -52, (Throwable) ((Object) var2_ref));
                      decompiledRegionSelector1 = 1;
                      break L6;
                    }
                  }
                  if (decompiledRegionSelector1 == 0) {
                    continue L0;
                  } else {
                    var7.field_p = false;
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

    final void a(byte param0) {
        try {
            this.field_j = true;
            synchronized (this.field_f) {
                this.field_f.notifyAll();
            }
            if (param0 != -85) {
                field_k = (String) null;
            }
            try {
                this.field_c.join();
            } catch (InterruptedException interruptedException) {
            }
            this.field_c = null;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0, int param1, byte param2) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        if (param2 != -84) {
          L0: {
            field_a = (String) null;
            if (0 == (param0 & 34)) {
              stackIn_8_0 = 0;
              break L0;
            } else {
              stackIn_8_0 = 1;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (0 == (param0 & 34)) {
              stackIn_4_0 = 0;
              break L1;
            } else {
              stackIn_4_0 = 1;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final os a(byte param0, bl param1, int param2) {
        os var4 = null;
        RuntimeException var4_ref = null;
        bl var5 = null;
        os stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4 = new os();
              if (param0 == 95) {
                break L1;
              } else {
                var5 = (bl) null;
                this.a((byte) -41, (bl) null, 82);
                break L1;
              }
            }
            var4.field_v = 3;
            var4.field_q = false;
            var4.field_i = (long)param2;
            var4.field_x = param1;
            this.a((byte) -76, var4);
            stackIn_3_0 = (os) (var4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4_ref);

            stackIn_6_1 = new StringBuilder().append("dk.D(").append(param0).append(',');

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
          throw pn.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param2 + ')');
        }
        return stackIn_3_0;
    }

    dk(rk param0) {
        en var2 = null;
        this.field_f = new er();
        this.field_j = false;
        this.field_d = 0;
        try {
            var2 = param0.a(5, 1048576, (Runnable) (this));
            while (var2.field_a == 0) {
                wf.a(10L, false);
            }
            if (var2.field_a == 2) {
                throw new RuntimeException();
            }
            this.field_c = (Thread) (var2.field_f);
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) ((Object) runtimeException), "dk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(byte param0, os param1) {
        Object var3 = null;
        Throwable var4 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        Throwable decompiledCaughtException = null;
        try {
          var3 = this.field_f;
          synchronized (var3) {
            L0: {
              this.field_f.a(2, param1);
              this.field_d = this.field_d + 1;
              if (param0 <= -55) {
                this.field_f.notifyAll();
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

            stackIn_11_1 = new StringBuilder().append("dk.E(").append(param0).append(',');

            if (param1 == null) {
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
          throw pn.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
    }

    static {
        field_b = "Fullscreen";
        field_a = "to keep fullscreen or";
        field_k = "Name is available";
        field_i = "Email address is unavailable";
        field_g = new int[8192];
        field_h = new dq();
    }
}
