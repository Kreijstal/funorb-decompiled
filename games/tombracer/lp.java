/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lp {
    int field_b;
    boolean field_a;
    int field_d;
    int field_e;
    int field_c;
    boolean field_i;
    int field_f;
    static ko field_h;
    static int field_g;

    final void a(int param0, int param1, uia param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 == -1) {
              L1: while (true) {
                var4_int = param2.h(255);
                if (var4_int != 0) {
                  this.a(param2, param1, (byte) -124, var4_int);
                  continue L1;
                } else {
                  return;
                }
              }
            } else {
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4);

            stackIn_9_1 = new StringBuilder().append("lp.A(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
    }

    final static vna a(byte param0, String param1) {
        vna stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        vna var2 = null;
        RuntimeException var2_ref = null;
        in var3 = null;
        int var4 = 0;
        int var5 = 0;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 48) {
                break L1;
              } else {
                field_h = (ko) null;
                break L1;
              }
            }
            var2 = new vna();
            var3 = new in(param1);
            L2: while (true) {
              if (var3.a(0)) {
                stackIn_18_0 = (vna) (var2);
                break L0;
              } else {
                var4 = var3.b(21098);
                if (Character.isWhitespace((char) var4)) {
                  continue L2;
                } else {
                  L3: {
                    if (var4 == 34) {
                      break L3;
                    } else {
                      if (var4 == 39) {
                        break L3;
                      } else {
                        if (var4 == 40) {
                          var2.b((byte) -90, new mi(lna.field_a, -1 + var3.field_b));
                          continue L2;
                        } else {
                          if (var4 == 41) {
                            var2.b((byte) -112, new mi(rs.field_a, var3.field_b - 1));
                            continue L2;
                          } else {
                            if (44 == var4) {
                              var2.b((byte) -107, new mi(qba.field_c, var3.field_b + -1));
                              continue L2;
                            } else {
                              var2.b((byte) -75, ska.a(param0 + -93, var3));
                              continue L2;
                            }
                          }
                        }
                      }
                    }
                  }
                  var2.b((byte) -81, hb.a(var3, false));
                  continue L2;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackIn_21_0 = (RuntimeException) (var2_ref);

            stackIn_21_1 = new StringBuilder().append("lp.B(").append(param0).append(',');

            if (param1 == null) {
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
          throw tba.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        return stackIn_18_0;
    }

    private final void a(uia param0, int param1, byte param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var6 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (1 != param3) {
                if ((param3 ^ -1) == -3) {
                  this.field_d = 1 + param0.d(123);
                  this.field_b = 1 + param0.d(122);
                  break L1;
                } else {
                  if (-4 != (param3 ^ -1)) {
                    if (param3 == 4) {
                      this.field_e = param0.h(255);
                      break L1;
                    } else {
                      if (param3 != 5) {
                        if (param3 == 6) {
                          this.field_a = true;
                          break L1;
                        } else {
                          if (param3 == 7) {
                            this.field_i = true;
                            break L1;
                          } else {
                            break L1;
                          }
                        }
                      } else {
                        this.field_c = param0.h(255);
                        break L1;
                      }
                    }
                  } else {
                    param0.c((byte) 64);
                    break L1;
                  }
                }
              } else {
                this.field_f = param0.d(126);
                if ((this.field_f ^ -1) != -65536) {
                  break L1;
                } else {
                  this.field_f = -1;
                  break L1;
                }
              }
            }
            if (param2 < -121) {
              break L0;
            } else {
              lp.a((byte) -38);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackIn_22_0 = (RuntimeException) (var5);

            stackIn_22_1 = new StringBuilder().append("lp.D(");

            if (param0 == null) {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "null";
              break L2;
            } else {
              stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
              stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
              stackIn_23_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    public static void a(byte param0) {
        if (param0 != 34) {
            field_g = 31;
            field_h = null;
            return;
        }
        field_h = null;
    }

    lp() {
        this.field_e = 2;
        this.field_a = false;
        this.field_i = false;
        this.field_b = 64;
        this.field_d = 64;
        this.field_f = -1;
        this.field_c = 1;
    }

    static {
        field_h = new ko(1);
        field_g = 0;
    }
}
