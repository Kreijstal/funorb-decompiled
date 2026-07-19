/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class vk implements Iterator {
    private kd field_c;
    static String field_d;
    private ji field_a;
    private kd field_b;
    private int field_e;

    private final void b(byte param0) {
        this.field_b = null;
        this.field_e = 1;
        this.field_c = this.field_a.field_f[0].field_f;
        if (param0 >= 61) {
          return;
        } else {
          vk.a((char[][]) null, -45, (int[][]) null);
          return;
        }
    }

    final static void a(char[][] param0, int param1, int[][] param2) {
        RuntimeException runtimeException = null;
        ng var4 = null;
        ij[] var5 = null;
        int var6 = 0;
        ij var7 = null;
        ng var8 = null;
        mk var9 = null;
        int var10 = 0;
        ij var11 = null;
        int stackIn_3_0 = 0;
        ng stackIn_5_0 = null;
        int stackIn_8_0 = 0;
        ng stackIn_14_0 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
        ng stackOut_4_0 = null;
        int stackOut_7_0 = 0;
        ng stackOut_13_0 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var11 = new ij();
            var4 = of.a(param0, 0, var11);
            var5 = sa.a(param1, var4);
            var11.field_q = 0;
            var6 = var5.length;
            L1: while (true) {
              stackOut_2_0 = var6;
              stackIn_3_0 = stackOut_2_0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (stackIn_3_0 <= 0) {
                      break L4;
                    } else {
                      var7 = var5[0];
                      var7.b(param1 ^ -3, var5);
                      var8 = var7.field_k;
                      stackOut_4_0 = (ng) (var8);
                      stackIn_14_0 = stackOut_4_0;
                      stackIn_5_0 = stackOut_4_0;
                      if (var10 != 0) {
                        break L3;
                      } else {
                        var9 = (mk) ((Object) ((ng) (Object) stackIn_5_0).a(true));
                        L5: while (true) {
                          L6: {
                            if (var9 == null) {
                              break L6;
                            } else {
                              stackOut_7_0 = var9.field_k.field_q;
                              stackIn_3_0 = stackOut_7_0;
                              stackIn_8_0 = stackOut_7_0;
                              if (var10 != 0) {
                                continue L2;
                              } else {
                                L7: {
                                  if (stackIn_8_0 > var7.field_q + var9.field_i) {
                                    var9.field_k.field_q = var9.field_i + var7.field_q;
                                    var9.field_k.a(120, var5);
                                    break L7;
                                  } else {
                                    break L7;
                                  }
                                }
                                var9 = (mk) ((Object) var8.f(param1 + 2));
                                if (var10 == 0) {
                                  continue L5;
                                } else {
                                  break L6;
                                }
                              }
                            }
                          }
                          var6--;
                          if (var10 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  stackOut_13_0 = (ng) (var4);
                  stackIn_14_0 = stackOut_13_0;
                  break L3;
                }
                fc.a(stackIn_14_0, param0, param2, 11882);
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            runtimeException = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) (runtimeException);
            stackOut_16_1 = new StringBuilder().append("vk.C(");
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L8;
            } else {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L8;
            }
          }
          L9: {
            stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
            stackOut_19_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',');
            stackIn_21_0 = stackOut_19_0;
            stackIn_21_1 = stackOut_19_1;
            stackIn_20_0 = stackOut_19_0;
            stackIn_20_1 = stackOut_19_1;
            if (param2 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L9;
            } else {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "{...}";
              stackIn_22_0 = stackOut_20_0;
              stackIn_22_1 = stackOut_20_1;
              stackIn_22_2 = stackOut_20_2;
              break L9;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
    }

    final static void b(int param0) {
        if (param0 == 0) {
            return;
        }
        field_d = (String) null;
    }

    public final boolean hasNext() {
        int fieldTemp$1 = 0;
        int var2 = 0;
        var2 = Lexicominos.field_L ? 1 : 0;
        if (this.field_c == this.field_a.field_f[this.field_e - 1]) {
          L0: while (true) {
            if (this.field_e < this.field_a.field_d) {
              fieldTemp$1 = this.field_e;
              this.field_e = this.field_e + 1;
              if (this.field_a.field_f[fieldTemp$1].field_f == this.field_a.field_f[-1 + this.field_e]) {
                this.field_c = this.field_a.field_f[this.field_e - 1];
                if (var2 == 0) {
                  continue L0;
                } else {
                  return false;
                }
              } else {
                this.field_c = this.field_a.field_f[-1 + this.field_e].field_f;
                return true;
              }
            } else {
              return false;
            }
          }
        } else {
          return true;
        }
    }

    final static void a(sh param0, int param1, hk param2, int param3) {
        try {
            tf.field_c = cl.p(-124) * param3 / 1000;
            ed.a(param1 ^ param1, param0);
            de.a(0, param0);
            vf.a(false, param0);
            cb.b(-110);
            dg.a(19681);
            mc.field_k = 0 + -tf.field_c;
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "vk.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    public final Object next() {
        int fieldTemp$1 = 0;
        kd var1 = null;
        int var2 = 0;
        var2 = Lexicominos.field_L ? 1 : 0;
        if (this.field_c == this.field_a.field_f[this.field_e + -1]) {
          L0: while (true) {
            if (this.field_a.field_d > this.field_e) {
              fieldTemp$1 = this.field_e;
              this.field_e = this.field_e + 1;
              var1 = this.field_a.field_f[fieldTemp$1].field_f;
              if (this.field_a.field_f[this.field_e - 1] != var1) {
                this.field_b = var1;
                this.field_c = var1.field_f;
                return var1;
              } else {
                if (var2 == 0) {
                  continue L0;
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
          }
        } else {
          var1 = this.field_c;
          this.field_c = var1.field_f;
          this.field_b = var1;
          return var1;
        }
    }

    final static byte[] a(int param0, th param1, int param2, byte[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        byte[] stackIn_18_0 = null;
        byte[] stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_17_0 = null;
        byte[] stackOut_20_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var4_int = param1.g(param2, 26527);
            if (param0 != var4_int) {
              L1: {
                L2: {
                  if (param3 == null) {
                    break L2;
                  } else {
                    if (param3.length != var4_int) {
                      break L2;
                    } else {
                      break L1;
                    }
                  }
                }
                param3 = new byte[var4_int];
                break L1;
              }
              L3: {
                L4: {
                  L5: {
                    var5 = param1.g(3, 26527);
                    var6 = (byte)param1.g(8, 26527);
                    if ((var5 ^ -1) < -1) {
                      break L5;
                    } else {
                      var7 = 0;
                      L6: while (true) {
                        if (var4_int <= var7) {
                          if (var8 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        } else {
                          param3[var7] = (byte)var6;
                          var7++;
                          if (var8 != 0) {
                            break L4;
                          } else {
                            continue L6;
                          }
                        }
                      }
                    }
                  }
                  var7 = 0;
                  L7: while (true) {
                    if (var7 >= var4_int) {
                      break L4;
                    } else {
                      stackOut_17_0 = (byte[]) (param3);
                      stackIn_21_0 = stackOut_17_0;
                      stackIn_18_0 = stackOut_17_0;
                      if (var8 != 0) {
                        break L3;
                      } else {
                        stackIn_18_0[var7] = (byte)(param1.g(var5, dg.a(param0, 26527)) + var6);
                        var7++;
                        continue L7;
                      }
                    }
                  }
                }
                stackOut_20_0 = (byte[]) (param3);
                stackIn_21_0 = stackOut_20_0;
                break L3;
              }
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            var4 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) (var4);
            stackOut_22_1 = new StringBuilder().append("vk.A(").append(param0).append(',');
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackOut_24_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L8;
            } else {
              stackOut_23_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackOut_23_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L8;
            }
          }
          L9: {
            stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
            stackOut_25_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_25_2).append(',').append(param2).append(',');
            stackIn_27_0 = stackOut_25_0;
            stackIn_27_1 = stackOut_25_1;
            stackIn_26_0 = stackOut_25_0;
            stackIn_26_1 = stackOut_25_1;
            if (param3 == null) {
              stackOut_27_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackOut_27_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackOut_27_2 = "null";
              stackIn_28_0 = stackOut_27_0;
              stackIn_28_1 = stackOut_27_1;
              stackIn_28_2 = stackOut_27_2;
              break L9;
            } else {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "{...}";
              stackIn_28_0 = stackOut_26_0;
              stackIn_28_1 = stackOut_26_1;
              stackIn_28_2 = stackOut_26_2;
              break L9;
            }
          }
          throw ld.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        return stackIn_21_0;
    }

    final static void a(byte param0) {
        ul.field_k = false;
        int discarded$0 = ig.field_a.d(true);
        int var1 = -124 % ((param0 - 77) / 38);
    }

    public final void remove() {
        if (!(this.field_b != null)) {
            throw new IllegalStateException();
        }
        this.field_b.b((byte) -126);
        this.field_b = null;
    }

    vk(ji param0) {
        this.field_b = null;
        try {
            this.field_a = param0;
            this.b((byte) 108);
        } catch (RuntimeException runtimeException) {
            throw ld.a((Throwable) ((Object) runtimeException), "vk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 == -30230) {
            return;
        }
        vk.a((byte) -80);
    }

    static {
        field_d = "Close";
    }
}
