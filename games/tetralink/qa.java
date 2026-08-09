/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa extends gb {
    static int field_A;
    static boolean field_v;
    static int[] field_x;
    String field_y;
    boolean field_w;
    char[] field_u;
    static String field_C;
    int[] field_z;
    int[] field_t;
    char[] field_D;

    public static void f(int param0) {
        if (param0 != 0) {
            return;
        }
        field_C = null;
        field_x = null;
    }

    final static int c(byte param0) {
        if (param0 > -83) {
            return -42;
        }
        return wh.field_k;
    }

    private final void a(bh param0, int param1, int param2) {
        char[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        char[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        char[] stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        char[] stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        char stackIn_17_2 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = TetraLink.field_J;
        try {
          L0: {
            L1: {
              if (param2 == 0) {
                break L1;
              } else {
                this.g(-10);
                break L1;
              }
            }
            L2: {
              if (param1 == 1) {
                this.field_y = param0.g((byte) 81);
                break L2;
              } else {
                if (param1 != 2) {
                  if ((param1 ^ -1) != -4) {
                    if (-5 == (param1 ^ -1)) {
                      this.field_w = true;
                      break L2;
                    } else {
                      break L2;
                    }
                  } else {
                    var4_int = param0.d((byte) -99);
                    this.field_t = new int[var4_int];
                    this.field_u = new char[var4_int];
                    var5 = 0;
                    L3: while (true) {
                      if (var4_int <= var5) {
                        break L2;
                      } else {
                        L4: {
                          this.field_t[var5] = param0.e(127);
                          var6 = param0.g(-1772093437);
                          stackIn_16_0 = this.field_u;

                          stackIn_16_1 = var5;

                          if (0 == var6) {
                            stackIn_17_0 = (char[]) ((Object) stackIn_16_0);
                            stackIn_17_1 = stackIn_16_1;
                            stackIn_17_2 = (char)0;
                            break L4;
                          } else {
                            stackIn_17_0 = (char[]) ((Object) stackIn_16_0);
                            stackIn_17_1 = stackIn_16_1;
                            stackIn_17_2 = mk.a((byte) -13, (byte) var6);
                            break L4;
                          }
                        }
                        stackIn_17_0[stackIn_17_1] = stackIn_17_2;
                        var5++;
                        continue L3;
                      }
                    }
                  }
                } else {
                  var4_int = param0.d((byte) -99);
                  this.field_D = new char[var4_int];
                  this.field_z = new int[var4_int];
                  var5 = 0;
                  L5: while (true) {
                    if (var5 >= var4_int) {
                      break L2;
                    } else {
                      L6: {
                        this.field_z[var5] = param0.e(param2 + 127);
                        var6 = param0.g(-1772093437);
                        stackIn_9_0 = this.field_D;

                        stackIn_9_1 = var5;

                        if (-1 != (var6 ^ -1)) {
                          stackIn_10_0 = (char[]) ((Object) stackIn_9_0);
                          stackIn_10_1 = stackIn_9_1;
                          stackIn_10_2 = mk.a((byte) -13, (byte) var6);
                          break L6;
                        } else {
                          stackIn_10_0 = (char[]) ((Object) stackIn_9_0);
                          stackIn_10_1 = stackIn_9_1;
                          stackIn_10_2 = 0;
                          break L6;
                        }
                      }
                      stackIn_10_0[stackIn_10_1] = (char) stackIn_10_2;
                      var5++;
                      continue L5;
                    }
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var4 = decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var4);

            stackIn_25_1 = new StringBuilder().append("qa.C(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L7;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L7;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static boolean a(int param0, String param1, String param2) {
        String var3 = null;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          L0: {
            L1: {
              param2 = um.a(param2, '_', false, "");
              if (param0 == 16732) {
                break L1;
              } else {
                field_C = (String) null;
                break L1;
              }
            }
            L2: {
              L3: {
                var3 = dj.a(108, param2);
                if (-1 != param1.indexOf(param2)) {
                  break L3;
                } else {
                  if (0 == (param1.indexOf(var3) ^ -1)) {
                    stackIn_7_0 = 0;
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              stackIn_7_0 = 1;
              break L2;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3_ref = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3_ref);

            stackIn_10_1 = new StringBuilder().append("qa.G(").append(param0).append(',');

            if (param1 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L4;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_13_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L5;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L5;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_11_0), stackIn_14_2 + ')');
        }
        return stackIn_7_0 != 0;
    }

    final static oh[] a(String param0, int param1, ah param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        oh[] stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var4_int = param2.a(param1, param0);
            var5 = param2.a(var4_int, false, param3);
            stackIn_1_0 = h.a(var4_int, var5, false, param2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_4_0 = (RuntimeException) (var4);

            stackIn_4_1 = new StringBuilder().append("qa.F(");

            if (param0 == null) {
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


            stackIn_7_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_5_2).append(',').append(param1).append(',');

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
          L3: {


            stackIn_10_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(',');

            if (param3 == null) {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_5_0), stackIn_11_2 + ')');
        }
        return stackIn_1_0;
    }

    final static void b(byte param0) {
        if (!(hd.field_u != null)) {
            return;
        }
        oa.a((byte) -119, hd.field_u);
        hd.field_u.a((byte) 52, nd.field_Pb);
        hd.field_u = null;
        if (hn.field_M != null) {
            hn.field_M.a((byte) 36);
        }
        uh.field_b.requestFocus();
        if (param0 < 21) {
            field_A = -4;
        }
    }

    final void g(int param0) {
        int var4 = 0;
        int var2 = 0;
        int var3 = TetraLink.field_J;
        if (!(this.field_t == null)) {
            for (var2 = 0; this.field_t.length > var2; var2++) {
                this.field_t[var2] = mc.a(this.field_t[var2], 32768);
            }
        }
        if (param0 != 32768) {
            qa.b((byte) 15);
        }
        if (!(null == this.field_z)) {
            var4 = 0;
            var2 = var4;
            while (var4 < this.field_z.length) {
                this.field_z[var4] = mc.a(this.field_z[var4], 32768);
                var4++;
            }
        }
    }

    final void a(bh param0, int param1) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TetraLink.field_J;
        try {
          L0: {
            L1: while (true) {
              var3_int = param0.d((byte) -99);
              if (-1 == (var3_int ^ -1)) {
                L2: {
                  if (param1 == 0) {
                    break L2;
                  } else {
                    this.g(109);
                    break L2;
                  }
                }
                break L0;
              } else {
                this.a(param0, var3_int, param1 ^ 0);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var3);

            stackIn_8_1 = new StringBuilder().append("qa.H(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
    }

    qa() {
        this.field_w = false;
    }

    static {
        field_C = "Waiting for graphics";
    }
}
