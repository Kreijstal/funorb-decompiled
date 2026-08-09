/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ptb extends dmb implements ntb {
    private int field_h;
    static String field_f;
    private int field_d;
    private int field_e;
    private int field_g;

    public final boolean a(byte param0, tv param1) {
        int var3_int = 0;
        ptb var4 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          L0: {
            L1: {
              L2: {
                var3_int = 122 / ((param0 - 22) / 59);
                var4 = (ptb) ((Object) param1);
                if (super.a((byte) 113, param1)) {
                  break L2;
                } else {
                  if (this.field_h != var4.field_h) {
                    break L2;
                  } else {
                    if (this.field_g != var4.field_g) {
                      break L2;
                    } else {
                      if (this.field_e != var4.field_e) {
                        break L2;
                      } else {
                        if (this.field_d == var4.field_d) {
                          stackIn_8_0 = 0;
                          break L1;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                }
              }
              stackIn_8_0 = 1;
              break L1;
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3);

            stackIn_11_1 = new StringBuilder().append("ptb.C(").append(param0).append(',');

            if (param1 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_12_0), stackIn_12_2 + ')');
        }
        return stackIn_8_0 != 0;
    }

    final void a(pe param0, boolean param1) {
        try {
            if (!param1) {
                tv var4 = (tv) null;
                this.a((byte) -16, (tv) null);
            }
            param0.a(this.field_h - -(this.field_e / 2), this.field_g - -(this.field_d / 2), this.field_g, false, -124, this.field_h);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ptb.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static int a(byte param0, boolean param1, String param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 == -107) {
              if (!param1) {
                stackIn_7_0 = boa.field_a.b(param2);
                decompiledRegionSelector0 = 2;
                break L0;
              } else {
                stackIn_5_0 = ssa.field_a.b(param2);
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              stackIn_2_0 = 63;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var3);

            stackIn_10_1 = new StringBuilder().append("ptb.J(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L1;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L1;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_5_0;
          } else {
            return stackIn_7_0;
          }
        }
    }

    public final void b(faa param0, int param1) {
        super.b(param0, -124);
        param0.a(-632, this.field_h, 32);
        param0.a(-632, this.field_g, 32);
        if (param1 > -109) {
            return;
        }
        try {
            param0.a(-632, this.field_e, 32);
            param0.a(-632, this.field_d, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ptb.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void b(byte param0) {
        field_f = null;
        if (param0 < 120) {
            field_f = (String) null;
        }
    }

    public final void a(faa param0, boolean param1) {
        try {
            super.a(param0, param1);
            this.field_h = param0.i(0, 32);
            this.field_g = param0.i(0, 32);
            this.field_e = param0.i(0, 32);
            this.field_d = param0.i(0, 32);
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ptb.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void b(byte param0, tv param1) {
        ptb var5 = null;
        ptb var6 = null;
        try {
            super.b((byte) 58, param1);
            var5 = (ptb) ((Object) param1);
            var6 = var5;
            if (param0 <= 54) {
                field_f = (String) null;
            }
            var6.field_d = this.field_d;
            var6.field_h = this.field_h;
            var6.field_e = this.field_e;
            var6.field_g = this.field_g;
        } catch (RuntimeException runtimeException) {
            throw rta.a((Throwable) ((Object) runtimeException), "ptb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ptb() {
    }

    public final void a(tv param0, int param1) {
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        int var4 = 0;
        ptb var5 = null;
        try {
          L0: {
            L1: {
              super.a(param0, -57);
              var5 = (ptb) ((Object) param0);
              var4 = 0;
              if (this.field_h == var5.field_h) {
                break L1;
              } else {
                var4 = 1;
                System.out.println("int x has changed. before=" + var5.field_h + ", now=" + this.field_h);
                break L1;
              }
            }
            L2: {
              if (this.field_g == var5.field_g) {
                break L2;
              } else {
                var4 = 1;
                System.out.println("int y has changed. before=" + var5.field_g + ", now=" + this.field_g);
                break L2;
              }
            }
            L3: {
              if (this.field_e == var5.field_e) {
                break L3;
              } else {
                System.out.println("int width has changed. before=" + var5.field_e + ", now=" + this.field_e);
                var4 = 1;
                break L3;
              }
            }
            L4: {
              if (var5.field_d != this.field_d) {
                System.out.println("int height has changed. before=" + var5.field_d + ", now=" + this.field_d);
                var4 = 1;
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if (var4 != 0) {
                System.out.println("This instance of MapClearanceRectangle has changed");
                break L5;
              } else {
                break L5;
              }
            }
            if (param1 < -19) {
              break L0;
            } else {
              this.field_e = 3;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var3 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var3);

            stackIn_17_1 = new StringBuilder().append("ptb.F(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L6;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L6;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param1 + ')');
        }
    }

    ptb(int param0, int param1, int param2, int param3) {
        this.field_h = param0;
        this.field_e = param2;
        this.field_d = param3;
        this.field_g = param1;
    }

    static {
        field_f = "New";
    }
}
