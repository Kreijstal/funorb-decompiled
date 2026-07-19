/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fv extends rw {
    static float[] field_v;
    static mi field_y;
    int field_x;
    fs field_w;
    byte field_z;

    public static void d(byte param0) {
        field_y = null;
        field_v = null;
        if (param0 != 62) {
            ki var2 = (ki) null;
            fv.a(-52, (ki) null, (ki) null);
        }
    }

    final int a(int param0) {
        if (this.field_w == null) {
          return 0;
        } else {
          if (param0 != -1) {
            return 50;
          } else {
            return 100 * this.field_w.field_p / (-this.field_z + this.field_w.field_n.length);
          }
        }
    }

    final static void a(int param0, ki param1, ki param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        String stackOut_4_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param0 == 7966) {
                break L1;
              } else {
                fv.d((byte) 80);
                break L1;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            runtimeException = decompiledCaughtException;
            stackOut_3_0 = (RuntimeException) (runtimeException);
            stackOut_3_1 = new StringBuilder().append("fv.F(").append(param0).append(',');
            stackIn_5_0 = stackOut_3_0;
            stackIn_5_1 = stackOut_3_1;
            stackIn_4_0 = stackOut_3_0;
            stackIn_4_1 = stackOut_3_1;
            if (param1 == null) {
              stackOut_5_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackOut_5_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L2;
            } else {
              stackOut_4_0 = (RuntimeException) ((Object) stackIn_4_0);
              stackOut_4_1 = (StringBuilder) ((Object) stackIn_4_1);
              stackOut_4_2 = "{...}";
              stackIn_6_0 = stackOut_4_0;
              stackIn_6_1 = stackOut_4_1;
              stackIn_6_2 = stackOut_4_2;
              break L2;
            }
          }
          L3: {
            stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
            stackOut_6_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param2 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
    }

    final static void e(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        dj var2 = null;
        int var3 = 0;
        boolean stackIn_6_0 = false;
        boolean stackIn_13_0 = false;
        boolean stackIn_18_0 = false;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_5_0 = false;
        boolean stackOut_12_0 = false;
        boolean stackOut_17_0 = false;
        var3 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                L3: {
                  wd.field_f.b();
                  var1_int = -111 % ((param0 - -34) / 35);
                  iv.field_a.b();
                  vf.field_b = vf.field_b - 1;
                  if (vf.field_b == 0) {
                    vf.field_b = 200;
                    var2 = (dj) ((Object) jf.field_c.b(107));
                    L4: while (true) {
                      L5: {
                        if (var2 == null) {
                          break L5;
                        } else {
                          stackOut_5_0 = var2.field_k.a(false);
                          stackIn_18_0 = stackOut_5_0;
                          stackIn_6_0 = stackOut_5_0;
                          if (var3 != 0) {
                            break L2;
                          } else {
                            L6: {
                              if (stackIn_6_0) {
                                break L6;
                              } else {
                                var2.b(false);
                                break L6;
                              }
                            }
                            var2 = (dj) ((Object) jf.field_c.d((byte) 18));
                            if (var3 == 0) {
                              continue L4;
                            } else {
                              break L5;
                            }
                          }
                        }
                      }
                      if (s.field_u == null) {
                        break L3;
                      } else {
                        var2 = (dj) ((Object) s.field_u.b(-105));
                        L7: while (true) {
                          if (var2 == null) {
                            break L3;
                          } else {
                            stackOut_12_0 = var2.field_k.a(false);
                            stackIn_18_0 = stackOut_12_0;
                            stackIn_13_0 = stackOut_12_0;
                            if (var3 != 0) {
                              break L2;
                            } else {
                              L8: {
                                if (stackIn_13_0) {
                                  break L8;
                                } else {
                                  var2.b(false);
                                  break L8;
                                }
                              }
                              var2 = (dj) ((Object) s.field_u.d((byte) 18));
                              if (var3 == 0) {
                                continue L7;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                if (qc.field_e == null) {
                  break L1;
                } else {
                  stackOut_17_0 = qc.field_e.c(-8192);
                  stackIn_18_0 = stackOut_17_0;
                  break L2;
                }
              }
              if (stackIn_18_0) {
                break L1;
              } else {
                nd.field_B = null;
                return;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qo.a((Throwable) ((Object) var1), "fv.G(" + param0 + ')');
        }
    }

    final byte[] d(boolean param0) {
        if (!param0) {
          if (!this.field_u) {
            if (-this.field_z + this.field_w.field_n.length > this.field_w.field_p) {
              throw new RuntimeException();
            } else {
              return this.field_w.field_n;
            }
          } else {
            throw new RuntimeException();
          }
        } else {
          return (byte[]) null;
        }
    }

    fv() {
    }

    static {
        field_v = new float[4];
        field_y = new mi();
        nn.b(50, -120);
    }
}
