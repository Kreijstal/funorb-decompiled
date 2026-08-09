/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class of {
    static int field_b;
    private int field_j;
    private int field_e;
    static long field_c;
    private tc[] field_l;
    static byte[][] field_d;
    static boolean field_i;
    static String field_g;
    static dd[] field_h;
    String field_f;
    private int field_a;
    float field_k;

    private final void a(tc param0, int param1, boolean param2) {
        float var4_float = 0.0f;
        RuntimeException var4 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              L2: {
                var4_float = (float)param1 / 100.0f + (float)(this.field_j + 1);
                if (0 != param1) {
                  break L2;
                } else {
                  this.field_f = param0.field_i;
                  if (!fleas.field_A) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              this.field_f = param0.field_d + " - " + param1 + "%";
              break L1;
            }
            this.field_k = (float)this.field_a * var4_float / (float)(1 + this.field_e);
            if (!param2) {
              break L0;
            } else {
              this.c(-38);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("of.A(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final boolean c(int param0) {
        boolean stackIn_3_0 = false;
        int stackIn_19_0 = 0;
        boolean stackOut_2_0;
        tc var2;
        int var3;
        tc var4;
        var3 = fleas.field_A ? 1 : 0;
        L0: while (true) {
          L1: {
            L2: {
              if (this.field_e <= this.field_j) {
                break L2;
              } else {
                var4 = this.field_l[this.field_j];
                var2 = var4;
                stackOut_2_0 = var4.field_a.b((byte) -110);
                stackIn_19_0 = stackOut_2_0 ? 1 : 0;
                stackIn_3_0 = stackOut_2_0;
                if (var3 != 0) {
                  break L1;
                } else {
                  if (stackIn_3_0) {
                    L3: {
                      if (var4.field_f < 0) {
                        break L3;
                      } else {
                        if (!var4.field_a.c(var4.field_f, 14969)) {
                          this.a(var2, var4.field_a.b(var4.field_f, -2), false);
                          return false;
                        } else {
                          break L3;
                        }
                      }
                    }
                    L4: {
                      if (null == var4.field_c) {
                        break L4;
                      } else {
                        if (var4.field_a.a(var4.field_c, -95)) {
                          break L4;
                        } else {
                          this.a(var2, var4.field_a.a(-84, var4.field_c), false);
                          return false;
                        }
                      }
                    }
                    L5: {
                      if (0 <= var4.field_f) {
                        break L5;
                      } else {
                        if (null != var4.field_c) {
                          break L5;
                        } else {
                          if (null == var4.field_d) {
                            break L5;
                          } else {
                            if (var4.field_a.a(param0 ^ -58)) {
                              break L5;
                            } else {
                              this.a(var2, var4.field_a.a((byte) -77), false);
                              return false;
                            }
                          }
                        }
                      }
                    }
                    this.field_j = this.field_j + 1;
                    if (var3 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  } else {
                    this.a(var4, 0, false);
                    return false;
                  }
                }
              }
            }
            stackIn_19_0 = param0;
            break L1;
          }
          if (stackIn_19_0 != 0) {
            return false;
          } else {
            return true;
          }
        }
    }

    final static jg a(int param0) {
        try {
            Throwable var1 = null;
            jg stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (param0 == -21814) {
                    break L1;
                  } else {
                    of.b(125);
                    break L1;
                  }
                }
                stackIn_3_0 = (jg) (Class.forName("oi").newInstance());
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        field_h = null;
        field_g = null;
        field_d = (byte[][]) null;
        int var1 = 30 % ((param0 - -47) / 39);
    }

    final static dd[] a(String param0, String param1, rh param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        rh var6 = null;
        dd[] stackIn_3_0 = null;
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
              if (param3 > 58) {
                break L1;
              } else {
                var6 = (rh) null;
                of.a((String) null, (String) null, (rh) null, 93);
                break L1;
              }
            }
            var4_int = param2.a(param1, (byte) -100);
            var5 = param2.a(param0, (byte) -15, var4_int);
            stackIn_3_0 = oc.a(param2, var5, var4_int, (byte) -109);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("of.B(");

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
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param2 == null) {
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
          throw pf.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ',' + param3 + ')');
        }
        return stackIn_3_0;
    }

    private of() throws Throwable {
        throw new Error();
    }

    static {
        field_g = "<%0>Teleporter:<%1> Come in pairs; teleports fleas from one to the other.";
        field_i = false;
    }
}
